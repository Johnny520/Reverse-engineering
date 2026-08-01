package defpackage;

/* JADX INFO: renamed from: ᛳᛳᲁᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0444 extends android.view.ViewOutlineProvider {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final /* synthetic */ int f2186;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.Object f2187;

    public /* synthetic */ C0444(int r1, java.lang.Object r2) {
            r0 = this;
            r0.f2186 = r1
            r0.f2187 = r2
            r0.<init>()
            return
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(android.view.View r14, android.graphics.Outline r15) {
            r13 = this;
            int r0 = r13.f2186
            java.lang.Object r13 = r13.f2187
            switch(r0) {
                case 0: goto L33;
                case 1: goto L1c;
                default: goto L7;
            }
        L7:
            int r4 = r14.getWidth()
            int r5 = r14.getHeight()
            ᛱᛳᲀᛷ r13 = (defpackage.C0060) r13
            ᛳᛸᛳᛸ r13 = r13.f701
            float r6 = r13.f2590
            r2 = 0
            r3 = 0
            r1 = r15
            r1.setRoundRect(r2, r3, r4, r5, r6)
            return
        L1c:
            r7 = r15
            int r10 = r14.getWidth()
            int r11 = r14.getHeight()
            ᛷᛷᛸᛱ r13 = (defpackage.C1315) r13
            java.lang.Object r13 = r13.f5821
            ᛱᲁᲀᲁ r13 = (defpackage.C0185) r13
            float r12 = r13.f1242
            r8 = 0
            r9 = 0
            r7.setRoundRect(r8, r9, r10, r11, r12)
            return
        L33:
            r7 = r15
            int r10 = r14.getWidth()
            int r14 = r14.getHeight()
            float r14 = (float) r14
            ᛳᛳᛴᛸ r13 = (defpackage.C0438) r13
            ᛶᛵᛳᛸ r13 = r13.f2151
            float r12 = r13.f4771
            float r14 = r14 + r12
            int r11 = (int) r14
            r8 = 0
            r9 = 0
            r7.setRoundRect(r8, r9, r10, r11, r12)
            return
    }
}
