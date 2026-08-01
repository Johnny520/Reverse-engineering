package p000;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* JADX INFO: renamed from: vq */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0861vq extends CharacterStyle implements UpdateAppearance {

    /* JADX INFO: renamed from: d */
    public final o30 f6806d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0861vq(o30 o30Var) {
        this.f6806d = o30Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        if (textPaint != null) {
            C0664qt c0664qt = C0664qt.f5220Q;
            o30 o30Var = this.f6806d;
            if (p30.m3002l(o30Var, c0664qt)) {
                textPaint.setStyle(Paint.Style.FILL);
                return;
            }
            if (!(o30Var instanceof s41)) {
                C0921xc.m5129j();
                return;
            }
            textPaint.setStyle(Paint.Style.STROKE);
            s41 s41Var = (s41) o30Var;
            textPaint.setStrokeWidth(s41Var.f5636Q);
            textPaint.setStrokeMiter(s41Var.f5637R);
            int i = s41Var.f5639T;
            textPaint.setStrokeJoin(i == 0 ? Paint.Join.MITER : i == 1 ? Paint.Join.ROUND : i == 2 ? Paint.Join.BEVEL : Paint.Join.MITER);
            int i2 = s41Var.f5638S;
            textPaint.setStrokeCap(i2 == 0 ? Paint.Cap.BUTT : i2 == 1 ? Paint.Cap.ROUND : i2 == 2 ? Paint.Cap.SQUARE : Paint.Cap.BUTT);
            textPaint.setPathEffect(null);
        }
    }
}
