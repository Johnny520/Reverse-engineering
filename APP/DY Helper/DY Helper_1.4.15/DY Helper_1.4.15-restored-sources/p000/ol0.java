package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ol0 implements android.text.style.LeadingMarginSpan {
    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(android.graphics.Canvas r1, android.graphics.Paint r2, int r3, int r4, int r5, int r6, int r7, java.lang.CharSequence r8, int r9, int r10, boolean r11, android.text.Layout r12) {
            r0 = this;
            if (r12 == 0) goto L2d
            if (r2 == 0) goto L2d
            int r0 = r12.getLineForOffset(r9)
            int r3 = r12.getLineCount()
            int r3 = r3 + (-1)
            if (r0 != r3) goto L2d
            java.lang.ThreadLocal r3 = p000.n32.f7376
            int r3 = r12.getEllipsisCount(r0)
            if (r3 <= 0) goto L2d
            float r3 = p000.kn0.m3379(r12, r0, r2)
            float r0 = p000.kn0.m3380(r12, r0, r2)
            float r0 = r0 + r3
            r2 = 0
            int r3 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r3 != 0) goto L27
            return
        L27:
            r1.getClass()
            r1.translate(r0, r2)
        L2d:
            return
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean r1) {
            r0 = this;
            r0 = 0
            return r0
    }
}
