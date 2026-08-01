package defpackage;

/* JADX INFO: renamed from: ᛱᛷᛱᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0122 implements defpackage.InterfaceC2085 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.C0669 f1027;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public boolean f1028;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final defpackage.C0852 f1029;

    public C0122(defpackage.C0669 r2) {
            r1 = this;
            r1.<init>()
            r1.f1027 = r2
            ᛵᛳᛸᛶ r0 = new ᛵᛳᛸᛶ
            ᛷᛸᛱᛸ r2 = r2.f3242
            java.lang.Object r2 = r2.f5859
            ᛶᛳᛵᛸ r2 = (defpackage.C1037) r2
            ᲇᛷᛲᲁ r2 = r2.f4612
            ᛶᛵᛸᛱ r2 = r2.mo485()
            r0.<init>(r2)
            r1.f1029 = r0
            return
    }

    @Override // defpackage.InterfaceC2085, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.f1028     // Catch: java.lang.Throwable -> L2c
            if (r0 == 0) goto L7
            monitor-exit(r3)
            return
        L7:
            r0 = 1
            r3.f1028 = r0     // Catch: java.lang.Throwable -> L2c
            ᛴᛴᲈᛷ r0 = r3.f1027     // Catch: java.lang.Throwable -> L2c
            ᛷᛸᛱᛸ r0 = r0.f3242     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r0 = r0.f5859     // Catch: java.lang.Throwable -> L2c
            ᛶᛳᛵᛸ r0 = (defpackage.C1037) r0     // Catch: java.lang.Throwable -> L2c
            java.lang.String r1 = "0\r\n\r\n"
            r0.mo706(r1)     // Catch: java.lang.Throwable -> L2c
            ᛵᛳᛸᛶ r0 = r3.f1029     // Catch: java.lang.Throwable -> L2c
            ᛶᛵᛸᛱ r1 = r0.f3891     // Catch: java.lang.Throwable -> L2c
            ᛳᲇᛲ r2 = defpackage.C1077.f4838     // Catch: java.lang.Throwable -> L2c
            r0.f3891 = r2     // Catch: java.lang.Throwable -> L2c
            r1.mo1800()     // Catch: java.lang.Throwable -> L2c
            r1.mo1801()     // Catch: java.lang.Throwable -> L2c
            ᛴᛴᲈᛷ r0 = r3.f1027     // Catch: java.lang.Throwable -> L2c
            r1 = 3
            r0.f3241 = r1     // Catch: java.lang.Throwable -> L2c
            monitor-exit(r3)
            return
        L2c:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L2c
            throw r0
    }

    @Override // defpackage.InterfaceC2085, java.io.Flushable
    public final synchronized void flush() {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.f1028     // Catch: java.lang.Throwable -> L14
            if (r0 == 0) goto L7
            monitor-exit(r1)
            return
        L7:
            ᛴᛴᲈᛷ r0 = r1.f1027     // Catch: java.lang.Throwable -> L14
            ᛷᛸᛱᛸ r0 = r0.f3242     // Catch: java.lang.Throwable -> L14
            java.lang.Object r0 = r0.f5859     // Catch: java.lang.Throwable -> L14
            ᛶᛳᛵᛸ r0 = (defpackage.C1037) r0     // Catch: java.lang.Throwable -> L14
            r0.flush()     // Catch: java.lang.Throwable -> L14
            monitor-exit(r1)
            return
        L14:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L14
            throw r0
    }

    @Override // defpackage.InterfaceC2085
    /* JADX INFO: renamed from: ᛴᛸᲈᲈ */
    public final void mo484(long r5, defpackage.C1569 r7) {
            r4 = this;
            boolean r0 = r4.f1028
            java.lang.String r1 = "closed"
            if (r0 != 0) goto L31
            r2 = 0
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 != 0) goto Ld
            return
        Ld:
            ᛴᛴᲈᛷ r4 = r4.f1027
            ᛷᛸᛱᛸ r4 = r4.f3242
            java.lang.Object r4 = r4.f5859
            ᛶᛳᛵᛸ r4 = (defpackage.C1037) r4
            boolean r0 = r4.f4610
            if (r0 != 0) goto L2d
            ᛸᲁᛵ r0 = r4.f4611
            r0.m2843(r5)
            r4.m1998()
            java.lang.String r0 = "\r\n"
            r4.mo706(r0)
            r4.mo484(r5, r7)
            r4.mo706(r0)
            return
        L2d:
            defpackage.C2264.m3676(r1)
            return
        L31:
            defpackage.C2264.m3676(r1)
            return
    }

    @Override // defpackage.InterfaceC2085
    /* JADX INFO: renamed from: ᛷᛲᲇᲈ */
    public final defpackage.C1077 mo485() {
            r0 = this;
            ᛵᛳᛸᛶ r0 = r0.f1029
            return r0
    }
}
