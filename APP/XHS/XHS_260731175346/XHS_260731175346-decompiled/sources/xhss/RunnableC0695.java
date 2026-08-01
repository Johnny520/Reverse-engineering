package xhss;

/* JADX INFO: renamed from: xhss.ᛷᛸᲇᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0695 implements java.lang.Runnable {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f2350;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final /* synthetic */ xhss.RunnableC0478 f2351;

    public /* synthetic */ RunnableC0695(xhss.RunnableC0478 r1, int r2) {
            r0 = this;
            r0.f2350 = r2
            r0.f2351 = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r5 = this;
            int r0 = r5.f2350
            xhss.ᛵᛶᛲᛳ r1 = r5.f2351
            switch(r0) {
                case 0: goto L17;
                default: goto L7;
            }
        L7:
            java.lang.Object r5 = r1.f1736
            xhss.ᲀᲀ r5 = (xhss.C0891) r5
            xhss.ᛳᛴᛵ r0 = r5.f2877
            int r0 = r0.f955
            r1 = -1
            if (r0 <= r1) goto L16
            r0 = 0
            r5.m1456(r0)
        L16:
            return
        L17:
            xhss.ᲁᛲᛸᛴ r0 = new xhss.ᲁᛲᛸᛴ
            r0.<init>()
            r0.m1529()
            java.lang.Object r0 = r1.f1736
            xhss.ᲀᲀ r0 = (xhss.C0891) r0
            r0.m1455()
            xhss.ᛳᛴᛵ r1 = r0.f2877
            long r1 = r1.f954
            r3 = 0
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 <= 0) goto L3c
            xhss.ᛵᛲᲇᛴ r0 = r0.f2873
            xhss.ᛴᲈᲀᲇ r3 = new xhss.ᛴᲈᲀᲇ
            r4 = 9
            r3.<init>(r4, r5)
            r0.postDelayed(r3, r1)
        L3c:
            return
    }
}
