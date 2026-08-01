package p106V0;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* JADX INFO: renamed from: V0.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1493g implements LineHeightSpan {

    /* JADX INFO: renamed from: d */
    public final float f5203d;

    public C1493g(float f2) {
        this.f5203d = f2;
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i5, int i6, int i7, int i8, Paint.FontMetricsInt fontMetricsInt) {
        int i9 = fontMetricsInt.descent - fontMetricsInt.ascent;
        if (i9 <= 0) {
            return;
        }
        int iCeil = (int) Math.ceil(this.f5203d);
        int iCeil2 = (int) Math.ceil(((double) fontMetricsInt.descent) * ((double) ((iCeil * 1.0f) / i9)));
        fontMetricsInt.descent = iCeil2;
        fontMetricsInt.ascent = iCeil2 - iCeil;
    }
}
