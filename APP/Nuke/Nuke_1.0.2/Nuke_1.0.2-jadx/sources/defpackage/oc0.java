package defpackage;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class oc0 extends CharacterStyle implements UpdateAppearance {
    public final op0 h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public oc0(op0 op0Var) {
        this.h = op0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        if (textPaint != null) {
            xi0 xi0Var = xi0.h;
            op0 op0Var = this.h;
            if (t11.l(op0Var, xi0Var)) {
                textPaint.setStyle(Paint.Style.FILL);
                return;
            }
            if (!(op0Var instanceof xv2)) {
                c80.s();
                return;
            }
            textPaint.setStyle(Paint.Style.STROKE);
            xv2 xv2Var = (xv2) op0Var;
            textPaint.setStrokeWidth(xv2Var.h);
            textPaint.setStrokeMiter(xv2Var.i);
            int i = xv2Var.k;
            textPaint.setStrokeJoin(i == 0 ? Paint.Join.MITER : i == 1 ? Paint.Join.ROUND : i == 2 ? Paint.Join.BEVEL : Paint.Join.MITER);
            int i2 = xv2Var.j;
            textPaint.setStrokeCap(i2 == 0 ? Paint.Cap.BUTT : i2 == 1 ? Paint.Cap.ROUND : i2 == 2 ? Paint.Cap.SQUARE : Paint.Cap.BUTT);
            textPaint.setPathEffect(null);
        }
    }
}
