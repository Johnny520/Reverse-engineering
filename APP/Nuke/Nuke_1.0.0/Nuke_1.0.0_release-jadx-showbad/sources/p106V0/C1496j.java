package p106V0;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* JADX INFO: renamed from: V0.j */
/* JADX INFO: loaded from: classes.dex */
public final class C1496j extends CharacterStyle {

    /* JADX INFO: renamed from: a */
    public final int f5220a;

    /* JADX INFO: renamed from: b */
    public final float f5221b;

    /* JADX INFO: renamed from: c */
    public final float f5222c;

    /* JADX INFO: renamed from: d */
    public final float f5223d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1496j(float f2, float f5, float f6, int i5) {
        this.f5220a = i5;
        this.f5221b = f2;
        this.f5222c = f5;
        this.f5223d = f6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setShadowLayer(this.f5223d, this.f5221b, this.f5222c, this.f5220a);
    }
}
