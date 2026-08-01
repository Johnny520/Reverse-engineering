package p366z2;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* JADX INFO: renamed from: z2.g */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C9839g implements LineHeightSpan {

    /* JADX INFO: renamed from: q */
    public final float f33232q;

    public C9839g(float f10) {
        this.f33232q = f10;
    }

    @Override // android.text.style.LineHeightSpan
    public void chooseHeight(CharSequence charSequence, int i10, int i11, int i12, int i13, Paint.FontMetricsInt fontMetricsInt) {
        int iM38245a = AbstractC9841i.m38245a(fontMetricsInt);
        if (iM38245a <= 0) {
            return;
        }
        int iCeil = (int) Math.ceil(this.f33232q);
        int iCeil2 = (int) Math.ceil(((double) fontMetricsInt.descent) * ((double) ((iCeil * 1.0f) / iM38245a)));
        fontMetricsInt.descent = iCeil2;
        fontMetricsInt.ascent = iCeil2 - iCeil;
    }
}
