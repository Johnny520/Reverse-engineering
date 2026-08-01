package p000;

/* JADX INFO: renamed from: xv */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0998xv implements p000.a80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f12324;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ java.lang.Object f12325;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ java.lang.Object f12326;

    public /* synthetic */ C0998xv(java.lang.Object r1, int r2, java.lang.Object r3) {
            r0 = this;
            r0.f12324 = r2
            r0.f12325 = r1
            r0.f12326 = r3
            r0.<init>()
            return
    }

    @Override // p000.a80
    public final java.lang.Object invoke(java.lang.Object r9) {
            r8 = this;
            int r0 = r8.f12324
            switch(r0) {
                case 0: goto L43;
                case 1: goto L21;
                default: goto L5;
            }
        L5:
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            java.lang.Object r9 = r8.f12325
            zz r9 = (p000.C1076zz) r9
            java.lang.Object r1 = r9.f13380
            java.lang.Object r8 = r8.f12326
            ae r8 = (p000.C0015ae) r8
            monitor-enter(r1)
            java.lang.Object r9 = r9.f13381     // Catch: java.lang.Throwable -> L1d
            java.util.ArrayList r9 = (java.util.ArrayList) r9     // Catch: java.lang.Throwable -> L1d
            r9.remove(r8)     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r1)
            s62 r8 = p000.s62.f9751
            return r8
        L1d:
            r0 = move-exception
            r8 = r0
            monitor-exit(r1)
            throw r8
        L21:
            r5 = r9
            yw1 r5 = (p000.yw1) r5
            java.lang.Object r9 = p000.ax1.f1362
            monitor-enter(r9)
            long r3 = p000.ax1.f1364     // Catch: java.lang.Throwable -> L3f
            r0 = 1
            long r0 = (long) r0     // Catch: java.lang.Throwable -> L3f
            long r0 = r0 + r3
            p000.ax1.f1364 = r0     // Catch: java.lang.Throwable -> L3f
            monitor-exit(r9)
            java.lang.Object r9 = r8.f12325
            r6 = r9
            a80 r6 = (p000.a80) r6
            java.lang.Object r8 = r8.f12326
            r7 = r8
            a80 r7 = (p000.a80) r7
            f21 r2 = new f21
            r2.<init>(r3, r5, r6, r7)
            return r2
        L3f:
            r0 = move-exception
            r8 = r0
            monitor-exit(r9)
            throw r8
        L43:
            cw r9 = (p000.InterfaceC0190cw) r9
            r9.getClass()
            m6 r0 = r9.mo579()
            yr r1 = r0.m3791()
            m6 r0 = r9.mo579()
            java.lang.Object r2 = r8.f12325
            yr r2 = (p000.InterfaceC1031yr) r2
            r0.m3769(r2)
            java.lang.Object r8 = r8.f12326     // Catch: java.lang.Throwable -> L6e
            aw r8 = (p000.C0055aw) r8     // Catch: java.lang.Throwable -> L6e
            vv r0 = r8.f1334     // Catch: java.lang.Throwable -> L6e
            r8.m611(r9, r0)     // Catch: java.lang.Throwable -> L6e
            m6 r8 = r9.mo579()
            r8.m3769(r1)
            s62 r8 = p000.s62.f9751
            return r8
        L6e:
            r0 = move-exception
            r8 = r0
            m6 r9 = r9.mo579()
            r9.m3769(r1)
            throw r8
    }
}
