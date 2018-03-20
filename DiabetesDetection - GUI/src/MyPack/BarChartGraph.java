/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MyPack;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.GradientPaint;
import java.sql.ResultSet;
import java.util.Vector;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryLabelPositions;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;

 
public class BarChartGraph extends ApplicationFrame {
    String type="";
     
    public BarChartGraph(final String title) {

        super(title);

        final CategoryDataset dataset = createDataset();
        final JFreeChart chart = createChart(dataset);
        final ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new Dimension(500, 270));
        setContentPane(chartPanel);

    }
public BarChartGraph(final String title,String type) {

        super(title);
        this.type=type;
        final CategoryDataset dataset = createDataset();
        final JFreeChart chart = createChart(dataset);
        final ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new Dimension(500, 270));
        setContentPane(chartPanel);

    }
   
    private CategoryDataset createDataset() {
        
        // row keys...
        String query="";
        
        final String series1 = "First";
       // final String series2 = "Second";
        //final String series3 = "Third";

        // column keys...
        final String category1 = "Category 1";
        final String category2 = "Category 2";
        final String category3 = "Category 3";
        final String category4 = "Category 4";
        final String category5 = "Category 5";

        // create the dataset...
        final DefaultCategoryDataset dataset = new DefaultCategoryDataset();
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
            query="select (count(*)/(select count(*) from dataset)) val,col9 col from dataset group by col9";
        }
        else if(type.equalsIgnoreCase("HBAC1")){
            query="select (count(*)/(select count(*) from dataset)) val,col9 col from dataset group by col9";
        }
        Vector v=new Vector();
        ResultSet rs=DatabaseConnection.executeQuery(query);
        try {
            
            while(rs.next()){
                dataset.addValue(rs.getDouble("val"),rs.getString("col"), rs.getString("col"));
              // v.add();
               
            }
        } catch (Exception ex) {
            //Logger.getLogger(BarChart.class.getName()).log(Level.SEVERE, null, ex);
        }
//        dataset.addValue(1.0, series1, category1);
//        dataset.addValue(4.0, series1, category2);
//        dataset.addValue(3.0, series1, category3);
//        dataset.addValue(5.0, series1, category4);
//        dataset.addValue(5.0, series1, category5);

//        dataset.addValue(5.0, series2, category1);
//        dataset.addValue(7.0, series2, category2);
//        dataset.addValue(6.0, series2, category3);
//        dataset.addValue(8.0, series2, category4);
//        dataset.addValue(4.0, series2, category5);
//
//        dataset.addValue(4.0, series3, category1);
//        dataset.addValue(3.0, series3, category2);
//        dataset.addValue(2.0, series3, category3);
//        dataset.addValue(3.0, series3, category4);
//        dataset.addValue(6.0, series3, category5);
        
        return dataset;
        
    }
    
     
    private JFreeChart createChart(final CategoryDataset dataset) {
        
        // create the chart...
        final JFreeChart chart = ChartFactory.createBarChart(
            "Bar Chart Graph",         // chart title
            "Category",               // domain axis label
            "Value",                  // range axis label
            dataset,                  // data
            PlotOrientation.VERTICAL, // orientation
            true,                     // include legend
            true,                     // tooltips?
            false                     // URLs?
        );

        // NOW DO SOME OPTIONAL CUSTOMISATION OF THE CHART...

        // set the background color for the chart...
        chart.setBackgroundPaint(Color.white);

        // get a reference to the plot for further customisation...
        final CategoryPlot plot = chart.getCategoryPlot();
        plot.setBackgroundPaint(Color.lightGray);
        plot.setDomainGridlinePaint(Color.white);
        plot.setRangeGridlinePaint(Color.white);

        // set the range axis to display integers only...
        final NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();
        rangeAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());

        // disable bar outlines...
        final BarRenderer renderer = (BarRenderer) plot.getRenderer();
        renderer.setDrawBarOutline(false);
        
        // set up gradient paints for series...
        final GradientPaint gp0 = new GradientPaint(
            0.0f, 0.0f, Color.blue, 
            0.0f, 0.0f, Color.lightGray
        );
        final GradientPaint gp1 = new GradientPaint(
            0.0f, 0.0f, Color.green, 
            0.0f, 0.0f, Color.lightGray
        );
        final GradientPaint gp2 = new GradientPaint(
            0.0f, 0.0f, Color.red, 
            0.0f, 0.0f, Color.lightGray
        );
        renderer.setSeriesPaint(0, gp0);
        renderer.setSeriesPaint(1, gp1);
        renderer.setSeriesPaint(2, gp2);

        final CategoryAxis domainAxis = plot.getDomainAxis();
        domainAxis.setCategoryLabelPositions(
            CategoryLabelPositions.createUpRotationLabelPositions(Math.PI / 6.0)
        );
        // OPTIONAL CUSTOMISATION COMPLETED.
        
        return chart;
        
    }
     
    public static void main(final String[] args) {

        final BarChartGraph demo = new BarChartGraph("Bar Chart Graph");
        demo.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        demo.pack();
        
        RefineryUtilities.centerFrameOnScreen(demo);
        demo.setVisible(true);

    }

}