package xhss;

/* JADX INFO: renamed from: xhss.ᛴᛸᛲᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0391 implements java.lang.Runnable {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final /* synthetic */ float f1396;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final /* synthetic */ xhss.RunnableC0432 f1397;

    public RunnableC0391(xhss.RunnableC0432 r1, float r2) {
            r0 = this;
            r0.<init>()
            r0.f1397 = r1
            r0.f1396 = r2
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r2 = this;
            xhss.ᛴᲈᲀᲇ r0 = r2.f1397
            java.lang.Object r0 = r0.f1524
            xhss.ᛵᛱᛲᛶ r0 = (xhss.C0436) r0
            xhss.ᲇᛲᛵ r0 = r0.f1558
            int r1 = r0.f3307
            float r2 = r2.f1396
            switch(r1) {
                case 0: goto L23;
                case 1: goto L14;
                default: goto Lf;
            }
        Lf:
            xhss.ᛵᛲᲇᛴ r0 = r0.f3306
            r0.f1621 = r2
            goto L2a
        L14:
            xhss.ᛵᛲᲇᛴ r0 = r0.f3306
            boolean r1 = r0.isAttachedToWindow()
            if (r1 != 0) goto L1d
            goto L2a
        L1d:
            r0.f1626 = r2
            r0.invalidate()
            goto L2a
        L23:
            xhss.ᛵᛲᲇᛴ r0 = r0.f3306
            r0.f1626 = r2
            r0.invalidate()
        L2a:
            return
    }
}
