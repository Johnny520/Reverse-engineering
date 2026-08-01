package xhss;

/* JADX INFO: renamed from: xhss.ᲀᛶᛲᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0866 implements xhss.InterfaceC0882 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.Object f2797;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f2798;

    public /* synthetic */ C0866(int r1, java.lang.Object r2) {
            r0 = this;
            r0.f2798 = r1
            r0.f2797 = r2
            r0.<init>()
            return
    }

    @Override // xhss.InterfaceC0882
    public final void accept(java.lang.Object r4) {
            r3 = this;
            int r0 = r3.f2798
            switch(r0) {
                case 0: goto L3a;
                default: goto L5;
            }
        L5:
            xhss.ᛳᛵᛴᲈ r4 = (xhss.C0271) r4
            java.lang.Object r0 = xhss.AbstractC0294.f1134
            monitor-enter(r0)
            xhss.ᛴᛶᲀᛶ r1 = xhss.AbstractC0294.f1136     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r2 = r3.f2797     // Catch: java.lang.Throwable -> L1a
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r2 = r1.get(r2)     // Catch: java.lang.Throwable -> L1a
            java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch: java.lang.Throwable -> L1a
            if (r2 != 0) goto L1c
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            goto L37
        L1a:
            r3 = move-exception
            goto L38
        L1c:
            java.lang.Object r3 = r3.f2797     // Catch: java.lang.Throwable -> L1a
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L1a
            r1.remove(r3)     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            r3 = 0
        L25:
            int r0 = r2.size()
            if (r3 >= r0) goto L37
            java.lang.Object r0 = r2.get(r3)
            xhss.ᲀᛸᛳᛲ r0 = (xhss.InterfaceC0882) r0
            r0.accept(r4)
            int r3 = r3 + 1
            goto L25
        L37:
            return
        L38:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            throw r3
        L3a:
            xhss.ᛳᛵᛴᲈ r4 = (xhss.C0271) r4
            if (r4 != 0) goto L44
            xhss.ᛳᛵᛴᲈ r4 = new xhss.ᛳᛵᛴᲈ
            r0 = -3
            r4.<init>(r0)
        L44:
            java.lang.Object r3 = r3.f2797
            xhss.ᛳᛱᛲᲀ r3 = (xhss.C0230) r3
            r3.m537(r4)
            return
    }
}
