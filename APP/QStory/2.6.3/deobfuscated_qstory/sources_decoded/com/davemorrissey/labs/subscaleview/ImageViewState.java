package com.davemorrissey.labs.subscaleview;

import android.graphics.PointF;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class ImageViewState implements Serializable {
    private final float centerX;
    private final float centerY;
    private final int orientation;
    private final float scale;

    public ImageViewState(float f, PointF pointF, int i) {
        this.scale = f;
        this.centerX = pointF.x;
        this.centerY = pointF.y;
        this.orientation = i;
    }

    public PointF getCenter() {
        return new PointF(this.centerX, this.centerY);
    }

    public int getOrientation() {
        return this.orientation;
    }

    public float getScale() {
        return this.scale;
    }
}
