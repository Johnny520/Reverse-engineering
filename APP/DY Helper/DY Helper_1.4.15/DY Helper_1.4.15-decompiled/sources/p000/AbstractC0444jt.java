package p000;

/* JADX INFO: renamed from: jt */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0444jt extends p000.u22 {

    /* JADX INFO: renamed from: η */
    public int f5573;

    public AbstractC0444jt(int r4) {
            r3 = this;
            r0 = 0
            r2 = 0
            r3.<init>(r0, r2)
            r3.f5573 = r4
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r11 = this;
            op r0 = r11.mo74()     // Catch: java.lang.Throwable -> L1f
            r0.getClass()     // Catch: java.lang.Throwable -> L1f
            gt r0 = (p000.C0334gt) r0     // Catch: java.lang.Throwable -> L1f
            pp r1 = r0.f4446     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r0 = r0.f4448     // Catch: java.lang.Throwable -> L1f
            up r2 = r1.mo72()     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r0 = p000.pd2.m4504(r2, r0)     // Catch: java.lang.Throwable -> L1f
            uy r3 = p000.pd2.f8525     // Catch: java.lang.Throwable -> L1f
            r4 = 0
            if (r0 == r3) goto L22
            q62 r3 = p000.AbstractC0782s1.m5323(r1, r2, r0)     // Catch: java.lang.Throwable -> L1f
            goto L23
        L1f:
            r0 = move-exception
            goto L8b
        L22:
            r3 = r4
        L23:
            up r5 = r1.mo72()     // Catch: java.lang.Throwable -> L46
            java.lang.Object r6 = r11.mo79()     // Catch: java.lang.Throwable -> L46
            java.lang.Throwable r7 = r11.mo76(r6)     // Catch: java.lang.Throwable -> L46
            if (r7 != 0) goto L48
            int r8 = r11.f5573     // Catch: java.lang.Throwable -> L46
            r9 = 1
            if (r8 == r9) goto L3b
            r10 = 2
            if (r8 != r10) goto L3a
            goto L3b
        L3a:
            r9 = 0
        L3b:
            if (r9 == 0) goto L48
            xn0 r4 = p000.xn0.f12226     // Catch: java.lang.Throwable -> L46
            sp r4 = r5.mo1785(r4)     // Catch: java.lang.Throwable -> L46
            fo0 r4 = (p000.fo0) r4     // Catch: java.lang.Throwable -> L46
            goto L48
        L46:
            r1 = move-exception
            goto L7f
        L48:
            if (r4 == 0) goto L5f
            boolean r5 = r4.m2169()     // Catch: java.lang.Throwable -> L46
            if (r5 != 0) goto L5f
            java.util.concurrent.CancellationException r4 = r4.m2159()     // Catch: java.lang.Throwable -> L46
            r11.mo73(r4)     // Catch: java.lang.Throwable -> L46
            eo1 r4 = p000.i81.m2661(r4)     // Catch: java.lang.Throwable -> L46
            r1.mo75(r4)     // Catch: java.lang.Throwable -> L46
            goto L71
        L5f:
            if (r7 == 0) goto L6a
            eo1 r4 = new eo1     // Catch: java.lang.Throwable -> L46
            r4.<init>(r7)     // Catch: java.lang.Throwable -> L46
            r1.mo75(r4)     // Catch: java.lang.Throwable -> L46
            goto L71
        L6a:
            java.lang.Object r4 = r11.mo77(r6)     // Catch: java.lang.Throwable -> L46
            r1.mo75(r4)     // Catch: java.lang.Throwable -> L46
        L71:
            if (r3 == 0) goto L7b
            boolean r1 = r3.m4767()     // Catch: java.lang.Throwable -> L1f
            if (r1 == 0) goto L7a
            goto L7b
        L7a:
            return
        L7b:
            p000.pd2.m4470(r2, r0)     // Catch: java.lang.Throwable -> L1f
            return
        L7f:
            if (r3 == 0) goto L87
            boolean r3 = r3.m4767()     // Catch: java.lang.Throwable -> L1f
            if (r3 == 0) goto L8a
        L87:
            p000.pd2.m4470(r2, r0)     // Catch: java.lang.Throwable -> L1f
        L8a:
            throw r1     // Catch: java.lang.Throwable -> L1f
        L8b:
            r11.m2987(r0)
            return
    }

    /* JADX INFO: renamed from: δ */
    public void mo73(java.util.concurrent.CancellationException r1) {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ε */
    public abstract p000.InterfaceC0631op mo74();

    /* JADX INFO: renamed from: η */
    public java.lang.Throwable mo76(java.lang.Object r2) {
            r1 = this;
            boolean r1 = r2 instanceof p000.C0628om
            r0 = 0
            if (r1 == 0) goto L8
            om r2 = (p000.C0628om) r2
            goto L9
        L8:
            r2 = r0
        L9:
            if (r2 == 0) goto Le
            java.lang.Throwable r1 = r2.f8149
            return r1
        Le:
            return r0
    }

    /* JADX INFO: renamed from: θ */
    public java.lang.Object mo77(java.lang.Object r1) {
            r0 = this;
            return r1
    }

    /* JADX INFO: renamed from: κ */
    public final void m2987(java.lang.Throwable r4) {
            r3 = this;
            fq r0 = new fq
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Fatal exception in coroutines machinery for "
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r2 = ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1, r4)
            op r3 = r3.mo74()
            up r3 = r3.mo72()
            p000.AbstractC0073bd.m890(r3, r0)
            return
    }

    /* JADX INFO: renamed from: λ */
    public abstract java.lang.Object mo79();
}
