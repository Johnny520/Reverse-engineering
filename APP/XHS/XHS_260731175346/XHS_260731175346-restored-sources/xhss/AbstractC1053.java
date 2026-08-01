package xhss;

/* JADX INFO: renamed from: xhss.ᲇᛷᛲᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1053 extends xhss.AbstractRunnableC0130 {

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public int f3380;

    public AbstractC1053(int r4) {
            r3 = this;
            r0 = 0
            r2 = 0
            r3.<init>(r0, r2)
            r3.f3380 = r4
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r10 = this;
            xhss.ᛱᛴᛶᛴ r0 = r10.mo412()     // Catch: java.lang.Throwable -> L1a
            xhss.ᛸᲇᲁᛱ r0 = (xhss.C0817) r0     // Catch: java.lang.Throwable -> L1a
            xhss.ᛸᛴᛳᛷ r1 = r0.f2656     // Catch: java.lang.Throwable -> L1a
            xhss.ᛴᛵᛳᛵ r2 = r1.f2508     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r0 = r0.f2654     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r0 = xhss.C0614.m1072(r2, r0)     // Catch: java.lang.Throwable -> L1a
            xhss.ᛶᛲᛷᛵ r3 = xhss.C0614.f2112     // Catch: java.lang.Throwable -> L1a
            r4 = 0
            if (r0 == r3) goto L1d
            xhss.ᲈᲇᛵ r3 = xhss.AbstractC0485.m891(r1, r2, r0)     // Catch: java.lang.Throwable -> L1a
            goto L1e
        L1a:
            r0 = move-exception
            goto L83
        L1d:
            r3 = r4
        L1e:
            java.lang.Object r5 = r10.mo420()     // Catch: java.lang.Throwable -> L3d
            java.lang.Throwable r6 = r10.mo414(r5)     // Catch: java.lang.Throwable -> L3d
            if (r6 != 0) goto L3f
            int r7 = r10.f3380     // Catch: java.lang.Throwable -> L3d
            r8 = 1
            if (r7 == r8) goto L32
            r9 = 2
            if (r7 != r9) goto L31
            goto L32
        L31:
            r8 = 0
        L32:
            if (r8 == 0) goto L3f
            xhss.ᛳᛴᲀᲁ r4 = xhss.C0263.f977     // Catch: java.lang.Throwable -> L3d
            xhss.ᛳᛵᲈᛲ r4 = r2.mo442(r4)     // Catch: java.lang.Throwable -> L3d
            xhss.ᛸᛷᛳᲈ r4 = (xhss.AbstractC0784) r4     // Catch: java.lang.Throwable -> L3d
            goto L3f
        L3d:
            r1 = move-exception
            goto L77
        L3f:
            if (r4 == 0) goto L57
            boolean r7 = r4.m1333()     // Catch: java.lang.Throwable -> L3d
            if (r7 != 0) goto L57
            java.util.concurrent.CancellationException r4 = r4.m1343()     // Catch: java.lang.Throwable -> L3d
            r10.mo417(r4)     // Catch: java.lang.Throwable -> L3d
            xhss.ᲈᛳᛱᲇ r5 = new xhss.ᲈᛳᛱᲇ     // Catch: java.lang.Throwable -> L3d
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L3d
            r1.mo152(r5)     // Catch: java.lang.Throwable -> L3d
            goto L69
        L57:
            if (r6 == 0) goto L62
            xhss.ᲈᛳᛱᲇ r4 = new xhss.ᲈᛳᛱᲇ     // Catch: java.lang.Throwable -> L3d
            r4.<init>(r6)     // Catch: java.lang.Throwable -> L3d
            r1.mo152(r4)     // Catch: java.lang.Throwable -> L3d
            goto L69
        L62:
            java.lang.Object r4 = r10.mo423(r5)     // Catch: java.lang.Throwable -> L3d
            r1.mo152(r4)     // Catch: java.lang.Throwable -> L3d
        L69:
            if (r3 == 0) goto L73
            boolean r1 = r3.m1917()     // Catch: java.lang.Throwable -> L1a
            if (r1 == 0) goto L72
            goto L73
        L72:
            return
        L73:
            xhss.C0614.m1065(r2, r0)     // Catch: java.lang.Throwable -> L1a
            return
        L77:
            if (r3 == 0) goto L7f
            boolean r3 = r3.m1917()     // Catch: java.lang.Throwable -> L1a
            if (r3 == 0) goto L82
        L7f:
            xhss.C0614.m1065(r2, r0)     // Catch: java.lang.Throwable -> L1a
        L82:
            throw r1     // Catch: java.lang.Throwable -> L1a
        L83:
            r10.m1713(r0)
            return
    }

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ */
    public abstract xhss.InterfaceC0038 mo412();

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ */
    public java.lang.Throwable mo414(java.lang.Object r2) {
            r1 = this;
            boolean r1 = r2 instanceof xhss.C0711
            r0 = 0
            if (r1 == 0) goto L8
            xhss.ᛷᲁᲇᛷ r2 = (xhss.C0711) r2
            goto L9
        L8:
            r2 = r0
        L9:
            if (r2 == 0) goto Le
            java.lang.Throwable r1 = r2.f2385
            return r1
        Le:
            return r0
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ */
    public void mo417(java.util.concurrent.CancellationException r1) {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ᛸᛲᲀᛵ */
    public abstract java.lang.Object mo420();

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public final void m1713(java.lang.Throwable r4) {
            r3 = this;
            xhss.ᛲᛳᛱᲁ r0 = new xhss.ᛲᛳᛱᲁ
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Fatal exception in coroutines machinery for "
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r2 = ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1, r4)
            xhss.ᛱᛴᛶᛴ r3 = r3.mo412()
            xhss.ᛴᛵᛳᛵ r3 = r3.mo153()
            xhss.AbstractC0955.m1565(r3, r0)
            return
    }

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ */
    public java.lang.Object mo423(java.lang.Object r1) {
            r0 = this;
            return r1
    }
}
