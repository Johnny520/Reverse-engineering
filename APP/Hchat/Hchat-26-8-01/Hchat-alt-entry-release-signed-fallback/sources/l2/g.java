package l2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements android.text.style.LineHeightSpan {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f7759g;

    public g(float r1) {
            r0 = this;
            r0.<init>()
            r0.f7759g = r1
            return
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(java.lang.CharSequence r3, int r4, int r5, int r6, int r7, android.graphics.Paint.FontMetricsInt r8) {
            r2 = this;
            int r3 = r8.descent
            int r4 = r8.ascent
            int r3 = r3 - r4
            if (r3 > 0) goto L8
            return
        L8:
            float r4 = r2.f7759g
            double r4 = (double) r4
            double r4 = java.lang.Math.ceil(r4)
            float r4 = (float) r4
            int r4 = (int) r4
            float r5 = (float) r4
            r6 = 1065353216(0x3f800000, float:1.0)
            float r5 = r5 * r6
            float r3 = (float) r3
            float r5 = r5 / r3
            int r3 = r8.descent
            double r6 = (double) r3
            double r0 = (double) r5
            double r6 = r6 * r0
            double r5 = java.lang.Math.ceil(r6)
            int r3 = (int) r5
            r8.descent = r3
            int r3 = r3 - r4
            r8.ascent = r3
            return
    }
}
