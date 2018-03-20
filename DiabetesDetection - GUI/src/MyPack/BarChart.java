/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MyPack;


import java.awt.Color;
import java.sql.*;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.general.DatasetUtilities;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;


public class BarChart extends ApplicationFrame {
    String type="",query;
    BarChart(String titel) {
        super(titel);

        final CategoryDataset dataset = createDataset();
        final JFreeChart chart = createChart(dataset);
        final ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(700, 450));
        setContentPane(chartPanel);
    }
    BarChart(String titel,String type) {
        super(titel);
        this.type=type;
        final CategoryDataset dataset = createDataset();
        final JFreeChart chart = createChart(dataset);
        final ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(700, 450));
        setContentPane(chartPanel);
    }

    private CategoryDataset createDataset() {
        if(type.equalsIgnoreCase("gender")){
            query="select (count(*)/(select count(*) from dataset)) val,col2 col from dataset group by col2";
        }
        else if(type.equalsIgnoreCase("age")){
            query="select (count(*)/(select count(*) from dataset)) val,col1 col from dataset group by col1";
        }
        else if(type.equalsIgnoreCase("bloodpressure")){
            query="select (count(*)/(select count(*) from dataset)) val,col4 col from dataset group by col4";
        }
        else if(type.equalsIgnoreCase("Hypertension")){
            query="select (count(*)/(select count(*) from dataset)) val,col7 col from dataset group by col7";
        }
        else if(type.equalsIgnoreCase("HEMOGLOBIN")){
            query="select (count(*)/(select count(*) from dataset)) val,col9 col from dataset group by col9";
        }
        Vector v=new Vector();
        ResultSet rs=DatabaseConnection.executeQuery(query);
        try {
            
            while(rs.next()){
               v.add(rs.getString("col"));
               v.add(rs.getDouble("val"));
            }
        } catch (Exception ex) {
            //Logger.getLogger(BarChart.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(v.size());
        int j=0;
        double[] dbval=new double[v.size()/2];
        for(int i=0;i<v.size();i=i+2){
            dbval[j]=Double.parseDouble(v.elementAt(i+1).toString());
            j++;
        }
        //{210, 300, 320, 265, 299, 100, 200, 300, 400, 200},
        double[][] data = new double[][]{
          dbval,
          {},
          {},
        };
        return DatasetUtilities.createCategoryDataset("Values", "High", data);
    }

    private JFreeChart createChart(final CategoryDataset dataset) {

        final JFreeChart chart = ChartFactory.createBarChart(
                "Diabetes Detection", "Range", "Value",
                dataset, PlotOrientation.VERTICAL, true, true, false);

        chart.setBackgroundPaint(new Color(249, 231, 236));

        CategoryPlot plot = chart.getCategoryPlot();
        plot.getRenderer().setSeriesPaint(0, new Color(30, 100, 175));
        plot.getRenderer().setSeriesPaint(1, new Color(30, 100, 175));
        plot.getRenderer().setSeriesPaint(2, new Color(30, 100, 175));
        return chart;
    }

    public static void main(final String[] args) {
        final BarChart demo = new BarChart("Diabetes Detection");
        demo.pack();
        RefineryUtilities.centerFrameOnScreen(demo);
        demo.setVisible(true);
    }
}

