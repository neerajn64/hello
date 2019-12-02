package Example1;

import java.util.Objects;

public class Widget {

    double width;
    double length;
    double height;

    public Widget() {

    }

    public Widget(double width, double length , double height ){
        this.height = height;
        this.length = length;
        this.width = width;
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth (double width){
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Widget)) return false;
        Widget widget = (Widget) o;
        return Double.compare(widget.getWidth(), getWidth()) == 0 &&
                Double.compare(widget.getLength(), getLength()) == 0 &&
                Double.compare(widget.getHeight(), getHeight()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getWidth(), getLength(), getHeight());
    }

    
}
