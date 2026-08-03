package l2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements android.text.style.LeadingMarginSpan {
    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(android.graphics.Canvas r1, android.graphics.Paint r2, int r3, int r4, int r5, int r6, int r7, java.lang.CharSequence r8, int r9, int r10, boolean r11, android.text.Layout r12) {
            r0 = this;
            if (r12 == 0) goto L2d
            if (r2 == 0) goto L2d
            int r3 = r12.getLineForOffset(r9)
            int r4 = r12.getLineCount()
            int r4 = r4 + (-1)
            if (r3 != r4) goto L2d
            java.lang.ThreadLocal r4 = j2.l.f6712a
            int r4 = r12.getEllipsisCount(r3)
            if (r4 <= 0) goto L2d
            float r4 = x6.d.A(r12, r3, r2)
            float r2 = x6.d.B(r12, r3, r2)
            float r2 = r2 + r4
            r3 = 0
            int r4 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r4 != 0) goto L27
            return
        L27:
            r1.getClass()
            r1.translate(r2, r3)
        L2d:
            return
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean r1) {
            r0 = this;
            r1 = 0
            return r1
    }
}
