// Decompiled by JEB v5.42.0.202606242140

package c.ᴵˉ;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path.Direction;
import android.graphics.Path;
import android.view.View;

public class CLS287 extends View {
    public int FLD1225;
    public int FLD1226;
    public int FLD1227;
    public boolean FLD1228;
    public Paint FLD1229;
    public Path FLD1230;

    public CLS287(Context context0) {
        super(context0);
        this.FLD1225 = 0xFF888888;
        this.FLD1228 = false;
        this.MTH3717();
    }

    @Override  // android.view.View
    public void onDraw(Canvas canvas0) {
        int v = canvas0.getWidth();
        int v1 = canvas0.getHeight();
        canvas0.rotate(-45.0f, ((float)v), ((float)(v1 / 2)));
        this.FLD1230.reset();
        this.FLD1230.moveTo(((float)v), ((float)(v1 / 2)));
        float f = (float)this.FLD1226;
        this.FLD1230.lineTo(((float)v), f);
        int v2 = v - this.FLD1226;
        this.FLD1230.addCircle(((float)v2), ((float)this.FLD1226), ((float)this.FLD1226), Path.Direction.CCW);
        this.FLD1230.lineTo(((float)(v2 - this.FLD1226)), f);
        int v3 = v1 / 2 - this.FLD1227;
        this.FLD1230.lineTo(((float)(v - this.FLD1227)), ((float)v3));
        float f1 = (float)(v - v1 / 2 + this.FLD1226);
        this.FLD1230.lineTo(f1, ((float)v3));
        int v4 = v3 + this.FLD1226;
        canvas0.drawCircle(f1, ((float)v4), ((float)this.FLD1226), this.FLD1229);
        this.FLD1230.lineTo(f1, ((float)(v4 + this.FLD1226)));
        this.FLD1230.lineTo(((float)v), ((float)(v1 / 2)));
        canvas0.drawPath(this.FLD1230, this.FLD1229);
        this.FLD1228 = true;
    }

    public void setColor(int v) {
        this.FLD1225 = v;
        Paint paint0 = this.FLD1229;
        if(paint0 != null) {
            paint0.setColor(v);
        }
        if(this.FLD1228) {
            this.invalidate();
        }
    }

    public final void MTH3717() {
        this.FLD1227 = ((int)this.getContext().getResources().getDisplayMetrics().scaledDensity) * 2;
        this.FLD1226 = 1;
        Paint paint0 = new Paint();
        this.FLD1229 = paint0;
        paint0.setAntiAlias(true);
        this.FLD1229.setColor(this.FLD1225);
        this.FLD1230 = new Path();
        this.setWillNotDraw(false);
    }
}

