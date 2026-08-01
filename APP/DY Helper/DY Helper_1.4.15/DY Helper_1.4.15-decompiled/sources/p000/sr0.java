package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class sr0 implements android.text.style.LineHeightSpan {

    /* JADX INFO: renamed from: ε */
    public final float f10002;

    public sr0(float r1) {
            r0 = this;
            r0.<init>()
            r0.f10002 = r1
            return
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(java.lang.CharSequence r1, int r2, int r3, int r4, int r5, android.graphics.Paint.FontMetricsInt r6) {
            r0 = this;
            int r1 = r6.descent
            int r2 = r6.ascent
            int r1 = r1 - r2
            if (r1 > 0) goto L8
            return
        L8:
            float r0 = r0.f10002
            double r2 = (double) r0
            double r2 = java.lang.Math.ceil(r2)
            float r0 = (float) r2
            int r0 = (int) r0
            float r2 = (float) r0
            r3 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 * r3
            float r1 = (float) r1
            float r2 = r2 / r1
            int r1 = r6.descent
            double r3 = (double) r1
            double r1 = (double) r2
            double r3 = r3 * r1
            double r1 = java.lang.Math.ceil(r3)
            int r1 = (int) r1
            r6.descent = r1
            int r1 = r1 - r0
            r6.ascent = r1
            return
    }
}
