package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class q62 extends p000.wq1 {
    private volatile boolean threadLocalIsSet;

    /* JADX INFO: renamed from: ι */
    public final java.lang.ThreadLocal f8892;

    public q62(p000.InterfaceC0880up r3, p000.C0710q3 r4) {
            r2 = this;
            r62 r0 = p000.r62.f9277
            sp r1 = r3.mo1785(r0)
            if (r1 != 0) goto Ld
            up r0 = r3.mo1784(r0)
            goto Le
        Ld:
            r0 = r3
        Le:
            r2.<init>(r4, r0)
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r2.f8892 = r0
            up r4 = r4.f8639
            r4.getClass()
            x r0 = p000.C0966x.f11916
            sp r4 = r4.mo1785(r0)
            boolean r4 = r4 instanceof kotlinx.coroutines.AbstractC0479
            if (r4 != 0) goto L32
            r4 = 0
            java.lang.Object r4 = p000.pd2.m4504(r3, r4)
            p000.pd2.m4470(r3, r4)
            r2.m4768(r3, r4)
        L32:
            return
    }

    @Override // p000.wq1, p000.fo0
    /* JADX INFO: renamed from: π */
    public final void mo2182(java.lang.Object r6) {
            r5 = this;
            boolean r0 = r5.threadLocalIsSet
            if (r0 == 0) goto L1c
            java.lang.ThreadLocal r0 = r5.f8892
            java.lang.Object r0 = r0.get()
            l91 r0 = (p000.l91) r0
            if (r0 == 0) goto L17
            java.lang.Object r1 = r0.f6502
            up r1 = (p000.InterfaceC0880up) r1
            java.lang.Object r0 = r0.f6503
            p000.pd2.m4470(r1, r0)
        L17:
            java.lang.ThreadLocal r0 = r5.f8892
            r0.remove()
        L1c:
            java.lang.Object r6 = p000.AbstractC1021yh.m6910(r6)
            op r0 = r5.f11801
            up r1 = r0.mo72()
            r2 = 0
            java.lang.Object r3 = p000.pd2.m4504(r1, r2)
            uy r4 = p000.pd2.f8525
            if (r3 == r4) goto L33
            q62 r2 = p000.AbstractC0782s1.m5323(r0, r1, r3)
        L33:
            op r5 = r5.f11801     // Catch: java.lang.Throwable -> L46
            r5.mo75(r6)     // Catch: java.lang.Throwable -> L46
            if (r2 == 0) goto L42
            boolean r5 = r2.m4767()
            if (r5 == 0) goto L41
            goto L42
        L41:
            return
        L42:
            p000.pd2.m4470(r1, r3)
            return
        L46:
            r5 = move-exception
            if (r2 == 0) goto L4f
            boolean r6 = r2.m4767()
            if (r6 == 0) goto L52
        L4f:
            p000.pd2.m4470(r1, r3)
        L52:
            throw r5
    }

    /* JADX INFO: renamed from: г */
    public final boolean m4767() {
            r2 = this;
            boolean r0 = r2.threadLocalIsSet
            r1 = 1
            if (r0 == 0) goto Lf
            java.lang.ThreadLocal r0 = r2.f8892
            java.lang.Object r0 = r0.get()
            if (r0 != 0) goto Lf
            r0 = r1
            goto L10
        Lf:
            r0 = 0
        L10:
            java.lang.ThreadLocal r2 = r2.f8892
            r2.remove()
            r2 = r0 ^ 1
            return r2
    }

    /* JADX INFO: renamed from: д */
    public final void m4768(p000.InterfaceC0880up r2, java.lang.Object r3) {
            r1 = this;
            r0 = 1
            r1.threadLocalIsSet = r0
            java.lang.ThreadLocal r1 = r1.f8892
            l91 r0 = new l91
            r0.<init>(r2, r3)
            r1.set(r0)
            return
    }
}
