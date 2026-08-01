// Decompiled by JEB v5.42.0.202606242140

package c.ٴˈ;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path.Direction;
import android.graphics.Path;
import android.view.View;

public class CLS283 extends View {
    public Path FLD1229;
    public int FLD1230;
    public Paint FLD1231;
    public int FLD1232;
    public boolean FLD1233;
    public int FLD1234;

    public CLS283(Context context0) {
        super(context0);
        this.FLD1232 = 0xFF888888;
        this.FLD1233 = false;
        this.MTH4219();
    }

    @Override  // android.view.View
    public void onDraw(Canvas canvas0) {
        int v = canvas0.getWidth();
        int v1 = canvas0.getHeight();
        canvas0.rotate(-45.0f, ((float)v), ((float)(v1 / 2)));
        this.FLD1229.reset();
        this.FLD1229.moveTo(((float)v), ((float)(v1 / 2)));
        float f = (float)this.FLD1230;
        this.FLD1229.lineTo(((float)v), f);
        int v2 = v - this.FLD1230;
        this.FLD1229.addCircle(((float)v2), ((float)this.FLD1230), ((float)this.FLD1230), Path.Direction.CCW);
        this.FLD1229.lineTo(((float)(v2 - this.FLD1230)), f);
        int v3 = v1 / 2 - this.FLD1234;
        this.FLD1229.lineTo(((float)(v - this.FLD1234)), ((float)v3));
        float f1 = (float)(v - v1 / 2 + this.FLD1230);
        this.FLD1229.lineTo(f1, ((float)v3));
        int v4 = v3 + this.FLD1230;
        canvas0.drawCircle(f1, ((float)v4), ((float)this.FLD1230), this.FLD1231);
        this.FLD1229.lineTo(f1, ((float)(v4 + this.FLD1230)));
        this.FLD1229.lineTo(((float)v), ((float)(v1 / 2)));
        canvas0.drawPath(this.FLD1229, this.FLD1231);
        this.FLD1233 = true;
    }

    public void setColor(int v) {
        this.FLD1232 = v;
        Paint paint0 = this.FLD1231;
        if(paint0 != null) {
            paint0.setColor(v);
        }
        if(this.FLD1233) {
            this.invalidate();
        }
    }

    public final void MTH4219() {
        this.FLD1234 = ((int)this.getContext().getResources().getDisplayMetrics().scaledDensity) * 2;
        this.FLD1230 = 1;
        Paint paint0 = new Paint();
        this.FLD1231 = paint0;
        paint0.setAntiAlias(true);
        this.FLD1231.setColor(this.FLD1232);
        this.FLD1229 = new Path();
        this.setWillNotDraw(false);
    }
}

