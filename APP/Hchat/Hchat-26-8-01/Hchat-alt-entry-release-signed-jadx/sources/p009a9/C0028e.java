package p009a9;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.os.Build;
import android.text.style.ReplacementSpan;
import p259r9.AbstractC3754e0;
import p365y9.C6010f;

/* JADX INFO: renamed from: a9.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0028e extends ReplacementSpan {

    /* JADX INFO: renamed from: g */
    public final C6010f f88g;

    /* JADX INFO: renamed from: h */
    public final int f89h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0028e(C6010f c6010f, int i9) {
        this.f88g = c6010f;
        this.f89h = AbstractC3754e0.m7909r(i9, 100, 900);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m282a(Paint paint) {
        Typeface typeface = paint.getTypeface();
        int i9 = Build.VERSION.SDK_INT;
        int i10 = this.f89h;
        if (i9 >= 28) {
            paint.setTypeface(Typeface.create(typeface, i10, typeface != null && typeface.isItalic()));
            paint.setFakeBoldText(false);
        } else {
            paint.setTypeface(Typeface.create(typeface, i10 >= 600 ? 1 : 0));
            paint.setFakeBoldText(i10 >= 600);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i9, int i10, float f3, int i11, int i12, int i13, Paint paint) {
        CharSequence charSequence2;
        int i14;
        int i15;
        canvas.getClass();
        charSequence.getClass();
        paint.getClass();
        int color = paint.getColor();
        Shader shader = paint.getShader();
        Typeface typeface = paint.getTypeface();
        boolean zIsFakeBoldText = paint.isFakeBoldText();
        m282a(paint);
        C6010f c6010f = this.f88g;
        if (c6010f != null) {
            int i16 = c6010f.f24400a;
            if (i16 != c6010f.f24401b) {
                charSequence2 = charSequence;
                i14 = i9;
                i15 = i10;
                float fMeasureText = paint.measureText(charSequence2, i14, i15);
                if (fMeasureText < 1.0f) {
                    fMeasureText = 1.0f;
                }
                paint.setShader(new LinearGradient(f3, 0.0f, f3 + fMeasureText, 0.0f, c6010f.f24400a, c6010f.f24401b, Shader.TileMode.CLAMP));
            } else {
                charSequence2 = charSequence;
                i14 = i9;
                i15 = i10;
                paint.setShader(null);
                paint.setColor(i16);
            }
        } else {
            charSequence2 = charSequence;
            i14 = i9;
            i15 = i10;
        }
        canvas.drawText(charSequence2, i14, i15, f3, i12, paint);
        paint.setColor(color);
        paint.setShader(shader);
        paint.setTypeface(typeface);
        paint.setFakeBoldText(zIsFakeBoldText);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i9, int i10, Paint.FontMetricsInt fontMetricsInt) {
        paint.getClass();
        charSequence.getClass();
        Typeface typeface = paint.getTypeface();
        boolean zIsFakeBoldText = paint.isFakeBoldText();
        m282a(paint);
        int iMeasureText = (int) paint.measureText(charSequence, i9, i10);
        paint.setTypeface(typeface);
        paint.setFakeBoldText(zIsFakeBoldText);
        return iMeasureText;
    }
}
