package xhss;

/* JADX INFO: renamed from: xhss.ᛲᛲᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0132 implements java.lang.Runnable {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f591;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final /* synthetic */ xhss.C0523 f592;

    public /* synthetic */ RunnableC0132(xhss.C0523 r1, int r2) {
            r0 = this;
            r0.f591 = r2
            r0.f592 = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r1 = this;
            int r0 = r1.f591
            xhss.ᛵᲇᲀᛳ r1 = r1.f592
            switch(r0) {
                case 0: goto L11;
                default: goto L7;
            }
        L7:
            xhss.ᛲᛵᛶᲁ r1 = r1.f1897
            if (r1 != 0) goto Lc
            goto L10
        Lc:
            r0 = 0
            r1.m404(r0)
        L10:
            return
        L11:
            xhss.ᛲᛵᛶᲁ r1 = r1.f1897
            if (r1 == 0) goto L18
            r1.m403()
        L18:
            return
    }
}
