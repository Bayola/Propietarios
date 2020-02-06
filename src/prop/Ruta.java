package map;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.util.concurrent.TimeUnit;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

import com.teamdev.jxmaps.swing.MapView;

import com.teamdev.jxmaps.*;
import com.teamdev.jxmaps.examples.ControlPanel;

public class Ruta extends MapView {

    public static Map map;

    public CircleOptions settingsCircle;

    public PolylineOptions settingsLine;

    public CircleOptions getSettingsCircle() {
        return settingsCircle;
    }

    public void setSettingsCircle(CircleOptions settingsCircle) {
        this.settingsCircle = settingsCircle;
    }
    public Marker generateMarker(LatLng pos) {
        Marker marker = null;

        marker = new Marker(map);
        marker.setPosition(pos);
        //map.setCenter(pos);

        System.out.println("Graficado marker");
        return marker;
        
        
    }

    public void generarRuta(LatLng start, LatLng end, Boolean markers) {
        LatLng[] path = {start, end};
        Polyline polyline = new Polyline(map);
        polyline.setPath(path);
        if (markers) {
            generateMarker(start);
            generateMarker(end);
        }
        map = getMap();
        MapOptions mapOptions = new MapOptions();
        MapTypeControlOptions controlOptions = new MapTypeControlOptions();
        controlOptions.setPosition(ControlPosition.BOTTOM_LEFT);
        mapOptions.setMapTypeControlOptions(controlOptions);

        map.setOptions(mapOptions);
        map.setCenter(new LatLng(-1.6709800, -78.6471200));
        map.setZoom(7);
       PolylineOptions options = new PolylineOptions();
       options.setStrokeColor("#1E90FF");
       polyline.setOptions(options);
    }

    public Double calcularDistancia(LatLng a,LatLng b){
        Double distancia1 = Math.sqrt(Math.pow(a.getLat(), 2) + Math.pow(a.getLng(), 2));
   Double distancia2 = Math.sqrt(Math.pow(b.getLat(), 2) + Math.pow(b.getLng(), 2)); 
   Double distancia=Math.abs(distancia1-distancia2);
        return distancia;

    }
    
    public Map darMap() {
        return map;
    }

    public void generateArea(LatLng center, Double radius) {
        Circle circle = new Circle(map);
        circle.setCenter(center);
        circle.setRadius(radius);
        circle.setVisible(true);
        circle.setOptions(settingsCircle);
    }

    public void GenerateLine(boolean markers, LatLng... path) {
        if (markers) {
            for (LatLng p : path) {
                generateMarker(p);
            }
        }
        Polyline polyline = new Polyline(map);
        polyline.setPath(path);
    }

 
    public Ruta(String pString) {

        pString = "";
        JFrame frame = new JFrame(pString);
        //frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        // frame.add(this, BorderLayout.CENTER);
        frame.setSize(750, 550);
        frame.setLocationRelativeTo(null);
        frame.setVisible(false);
        settingsCircle = new CircleOptions();
        settingsCircle.setFillColor("#FF0000");
        settingsCircle.setRadius(2000000);
        settingsCircle.setFillOpacity(0.35);

        settingsLine = new PolylineOptions();
        settingsLine.setGeodesic(true);
        settingsLine.setStrokeColor("#FF0000");
        settingsLine.setStrokeOpacity(1.0);
        settingsLine.setStrokeWeight(2.0);

       
        setOnMapReadyHandler(new MapReadyHandler() {
            @Override
            public void onMapReady(MapStatus status) {
                // Check if the map is loaded correctly
                if (status == MapStatus.MAP_STATUS_OK) {
                    // Getting the associated map object
                    map = getMap();
                    MapOptions mapOptions = new MapOptions();
                    MapTypeControlOptions controlOptions = new MapTypeControlOptions();
                    controlOptions.setPosition(ControlPosition.BOTTOM_LEFT);
                    mapOptions.setMapTypeControlOptions(controlOptions);

                    map.setOptions(mapOptions);
                    map.setCenter(new LatLng(-1.6709800, -78.6471200));
                    map.setZoom(7);

                }
            }
        });


    }

    public static void main(String[] args) {
   
    }

}
