package xhss;

/* JADX INFO: renamed from: xhss.ᛴᲈᛵᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0429 extends android.view.ViewOutlineProvider {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.Object f1517;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f1518;

    public /* synthetic */ C0429(int r1, java.lang.Object r2) {
            r0 = this;
            r0.f1518 = r1
            r0.f1517 = r2
            r0.<init>()
            return
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(android.view.View r14, android.graphics.Outline r15) {
            r13 = this;
            int r0 = r13.f1518
            java.lang.Object r13 = r13.f1517
            switch(r0) {
                case 0: goto L31;
                case 1: goto L1c;
                default: goto L7;
            }
        L7:
            int r4 = r14.getWidth()
            int r5 = r14.getHeight()
            xhss.ᲀᲀ r13 = (xhss.C0891) r13
            xhss.ᛳᛴᛵ r13 = r13.f2877
            float r6 = r13.f958
            r2 = 0
            r3 = 0
            r1 = r15
            r1.setRoundRect(r2, r3, r4, r5, r6)
            return
        L1c:
            r7 = r15
            int r10 = r14.getWidth()
            int r11 = r14.getHeight()
            xhss.ᲁᛳᛵᛷ r13 = (xhss.C0935) r13
            xhss.ᛱᛴᛳᛴ r13 = r13.f3025
            float r12 = r13.f230
            r8 = 0
            r9 = 0
            r7.setRoundRect(r8, r9, r10, r11, r12)
            return
        L31:
            r7 = r15
            int r10 = r14.getWidth()
            int r14 = r14.getHeight()
            float r14 = (float) r14
            xhss.ᛲᛵᛶᲁ r13 = (xhss.C0158) r13
            xhss.ᛵᲇᲀᛳ r13 = r13.f654
            float r12 = r13.f1908
            float r14 = r14 + r12
            int r11 = (int) r14
            r8 = 0
            r9 = 0
            r7.setRoundRect(r8, r9, r10, r11, r12)
            return
    }
}
