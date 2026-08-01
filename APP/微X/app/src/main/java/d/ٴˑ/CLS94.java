// Decompiled by JEB v5.42.0.202606242140

package d.ٴˑ;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path.Direction;
import android.graphics.Path;
import android.view.View;

public final class CLS94 extends View {
    public Path FLD503;
    public int FLD504;
    public Paint FLD505;
    public int FLD506;
    public int FLD507;
    public boolean FLD508;

    public CLS94(Context context0) {
        super(context0);
        this.FLD507 = 0xFF888888;
        this.FLD508 = false;
        this.FLD506 = ((int)this.getContext().getResources().getDisplayMetrics().scaledDensity) * 2;
        this.FLD504 = 1;
        Paint paint0 = new Paint();
        this.FLD505 = paint0;
        paint0.setAntiAlias(true);
        this.FLD505.setColor(this.FLD507);
        this.FLD503 = new Path();
        this.setWillNotDraw(false);
    }

    @Override  // android.view.View
    public final void onDraw(Canvas canvas0) {
        int v = canvas0.getWidth();
        int v1 = canvas0.getHeight();
        canvas0.rotate(-45.0f, ((float)v), ((float)(v1 / 2)));
        this.FLD503.reset();
        this.FLD503.moveTo(((float)v), ((float)(v1 / 2)));
        float f = (float)this.FLD504;
        this.FLD503.lineTo(((float)v), f);
        int v2 = v - this.FLD504;
        this.FLD503.addCircle(((float)v2), ((float)this.FLD504), ((float)this.FLD504), Path.Direction.CCW);
        this.FLD503.lineTo(((float)(v2 - this.FLD504)), f);
        int v3 = v1 / 2 - this.FLD506;
        this.FLD503.lineTo(((float)(v - this.FLD506)), ((float)v3));
        float f1 = (float)(v - v1 / 2 + this.FLD504);
        this.FLD503.lineTo(f1, ((float)v3));
        int v4 = v3 + this.FLD504;
        canvas0.drawCircle(f1, ((float)v4), ((float)this.FLD504), this.FLD505);
        this.FLD503.lineTo(f1, ((float)(v4 + this.FLD504)));
        this.FLD503.lineTo(((float)v), ((float)(v1 / 2)));
        canvas0.drawPath(this.FLD503, this.FLD505);
        this.FLD508 = true;
    }

    public void setColor(int v) {
        this.FLD507 = v;
        Paint paint0 = this.FLD505;
        if(paint0 != null) {
            paint0.setColor(v);
        }
        if(this.FLD508) {
            this.invalidate();
        }
    }
}

