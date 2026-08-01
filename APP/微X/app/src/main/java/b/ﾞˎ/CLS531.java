// Decompiled by JEB v5.42.0.202606242140

package b.ﾞˎ;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path.Direction;
import android.graphics.Path;
import android.view.View;

public final class CLS531 extends View {
    public Paint FLD5187;
    public int FLD5188;
    public int FLD5189;
    public Path FLD5190;
    public int FLD5191;
    public boolean FLD5192;

    public CLS531(Context context0) {
        super(context0);
        this.FLD5189 = 0xFF888888;
        this.FLD5192 = false;
        this.FLD5191 = ((int)this.getContext().getResources().getDisplayMetrics().scaledDensity) * 2;
        this.FLD5188 = 1;
        Paint paint0 = new Paint();
        this.FLD5187 = paint0;
        paint0.setAntiAlias(true);
        this.FLD5187.setColor(this.FLD5189);
        this.FLD5190 = new Path();
        this.setWillNotDraw(false);
    }

    @Override  // android.view.View
    public final void onDraw(Canvas canvas0) {
        int v = canvas0.getWidth();
        int v1 = canvas0.getHeight();
        canvas0.rotate(-45.0f, ((float)v), ((float)(v1 / 2)));
        this.FLD5190.reset();
        this.FLD5190.moveTo(((float)v), ((float)(v1 / 2)));
        float f = (float)this.FLD5188;
        this.FLD5190.lineTo(((float)v), f);
        int v2 = v - this.FLD5188;
        this.FLD5190.addCircle(((float)v2), ((float)this.FLD5188), ((float)this.FLD5188), Path.Direction.CCW);
        this.FLD5190.lineTo(((float)(v2 - this.FLD5188)), f);
        int v3 = v1 / 2 - this.FLD5191;
        this.FLD5190.lineTo(((float)(v - this.FLD5191)), ((float)v3));
        float f1 = (float)(v - v1 / 2 + this.FLD5188);
        this.FLD5190.lineTo(f1, ((float)v3));
        int v4 = v3 + this.FLD5188;
        canvas0.drawCircle(f1, ((float)v4), ((float)this.FLD5188), this.FLD5187);
        this.FLD5190.lineTo(f1, ((float)(v4 + this.FLD5188)));
        this.FLD5190.lineTo(((float)v), ((float)(v1 / 2)));
        canvas0.drawPath(this.FLD5190, this.FLD5187);
        this.FLD5192 = true;
    }

    public void setColor(int v) {
        this.FLD5189 = v;
        Paint paint0 = this.FLD5187;
        if(paint0 != null) {
            paint0.setColor(v);
        }
        if(this.FLD5192) {
            this.invalidate();
        }
    }
}

