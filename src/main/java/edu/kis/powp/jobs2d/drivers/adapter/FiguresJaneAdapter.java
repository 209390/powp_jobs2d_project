package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.legacy.drawer.shape.LineFactory;
import edu.kis.powp.jobs2d.AbstractDriver;
import edu.kis.powp.jobs2d.features.DrawerFeature;

public class FiguresJaneAdapter extends AbstractDriver {
    public FiguresJaneAdapter(){
        super(0,0);
    }

    @Override
    public void operateTo(int x, int y){
        ILine line = LineFactory.getBasicLine();

        line.setStartCoordinates(super.getX(), super.getY());
        line.setEndCoordinates(x, y);

        DrawerFeature.getDrawerController().drawLine(line);
        setPosition(x,y);
    }

    @Override
    public String toString(){
        return "FiguresJaneAdapter";
    }
}
