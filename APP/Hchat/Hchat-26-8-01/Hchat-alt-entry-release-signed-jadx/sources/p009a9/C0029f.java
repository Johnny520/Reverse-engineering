package p009a9;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.text.style.ReplacementSpan;

/* JADX INFO: renamed from: a9.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0029f extends ReplacementSpan {

    /* JADX INFO: renamed from: g */
    public final int f90g;

    /* JADX INFO: renamed from: h */
    public final int f91h;

    /* JADX INFO: renamed from: i */
    public final int f92i;

    /* JADX INFO: renamed from: j */
    public final int f93j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0029f(int i9, int i10, int i11, int i12) {
        this.f90g = i9;
        this.f91h = i10;
        this.f92i = i11;
        this.f93j = i12;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i9, int i10, float f3, int i11, int i12, int i13, Paint paint) {
        LinearGradient linearGradient;
        LinearGradient linearGradient2;
        canvas.getClass();
        charSequence.getClass();
        paint.getClass();
        int color = paint.getColor();
        Shader shader = paint.getShader();
        boolean zIsFakeBoldText = paint.isFakeBoldText();
        float textSize = (int) ((paint.getTextSize() * 0.45f) + 0.5f);
        RectF rectF = new RectF(f3, (paint.getTextSize() * 0.05f) + i11, (2 * textSize) + paint.measureText(charSequence, i9, i10) + f3, i13 - (paint.getTextSize() * 0.05f));
        float textSize2 = paint.getTextSize() * 0.28f;
        int i14 = this.f91h;
        int i15 = this.f90g;
        if (i15 != i14) {
            linearGradient = new LinearGradient(rectF.left, 0.0f, rectF.right, 0.0f, this.f90g, this.f91h, Shader.TileMode.CLAMP);
        } else {
            linearGradient = null;
        }
        paint.setShader(linearGradient);
        paint.setColor(i15);
        canvas.drawRoundRect(rectF, textSize2, textSize2, paint);
        int i16 = this.f93j;
        int i17 = this.f92i;
        if (i17 != i16) {
            linearGradient2 = new LinearGradient(rectF.left, 0.0f, rectF.right, 0.0f, this.f92i, this.f93j, Shader.TileMode.CLAMP);
        } else {
            linearGradient2 = null;
        }
        paint.setShader(linearGradient2);
        paint.setColor(i17);
        paint.setFakeBoldText(true);
        canvas.drawText(charSequence, i9, i10, f3 + textSize, i12, paint);
        paint.setColor(color);
        paint.setShader(shader);
        paint.setFakeBoldText(zIsFakeBoldText);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i9, int i10, Paint.FontMetricsInt fontMetricsInt) {
        paint.getClass();
        charSequence.getClass();
        int textSize = (int) ((paint.getTextSize() * 0.45f) + 0.5f);
        int textSize2 = (int) ((paint.getTextSize() * 0.14f) + 0.5f);
        Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent - textSize2;
            fontMetricsInt.descent = fontMetricsInt2.descent + textSize2;
            fontMetricsInt.top = fontMetricsInt2.top - textSize2;
            fontMetricsInt.bottom = fontMetricsInt2.bottom + textSize2;
        }
        return (int) (paint.measureText(charSequence, i9, i10) + (textSize * 2));
    }
}
