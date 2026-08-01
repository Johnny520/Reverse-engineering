package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rt1 implements java.lang.Runnable {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f9494;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ android.widget.TextView f9495;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ java.lang.Object f9496;

    /* JADX INFO: renamed from: θ */
    public final /* synthetic */ java.lang.Object f9497;

    /* JADX INFO: renamed from: ι */
    public final /* synthetic */ android.view.View f9498;

    /* JADX INFO: renamed from: κ */
    public final /* synthetic */ android.widget.TextView f9499;

    /* JADX INFO: renamed from: λ */
    public final /* synthetic */ android.widget.TextView f9500;

    public /* synthetic */ rt1(java.lang.Object r1, java.lang.Object r2, android.widget.TextView r3, android.view.View r4, android.widget.TextView r5, android.widget.TextView r6, int r7) {
            r0 = this;
            r0.f9494 = r7
            r0.f9496 = r1
            r0.f9497 = r2
            r0.f9495 = r3
            r0.f9498 = r4
            r0.f9499 = r5
            r0.f9500 = r6
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r16 = this;
            r0 = r16
            int r1 = r0.f9494
            switch(r1) {
                case 0: goto Lb9;
                default: goto L7;
            }
        L7:
            java.lang.Object r1 = r0.f9496
            t72 r1 = (p000.t72) r1
            java.lang.String r2 = r1.f10237
            java.lang.Object r3 = r0.f9497
            r9 = r3
            android.app.Activity r9 = (android.app.Activity) r9
            android.widget.TextView r5 = r0.f9495
            android.view.View r3 = r0.f9498
            android.widget.ProgressBar r3 = (android.widget.ProgressBar) r3
            android.widget.TextView r4 = r0.f9499
            r7 = r4
            android.widget.Button r7 = (android.widget.Button) r7
            android.widget.TextView r0 = r0.f9500
            r8 = r0
            android.widget.Button r8 = (android.widget.Button) r8
            java.util.concurrent.atomic.AtomicBoolean r11 = p000.u72.f10634
            java.lang.String r4 = "r5f3b6ae7236977e4"
            android.os.Handler r12 = p000.u72.f10629
            java.lang.String r6 = "download update failed: "
            java.lang.String r0 = "download update url="
            java.lang.String r10 = "refresh stale download url failed, fallback cached url="
            r15 = 0
            java.lang.String r13 = "/releases/latest"
            r14 = 1
            boolean r13 = p000.q02.m4654(r2, r13, r14)     // Catch: java.lang.Throwable -> L54
            if (r13 == 0) goto L66
            bu1 r13 = new bu1     // Catch: java.lang.Throwable -> L54
            r14 = 2
            r13.<init>(r5, r14)     // Catch: java.lang.Throwable -> L54
            r12.post(r13)     // Catch: java.lang.Throwable -> L54
            t72 r13 = p000.u72.m5794()     // Catch: java.lang.Throwable -> L54
            if (r13 == 0) goto L56
            java.lang.String r14 = r13.f10237     // Catch: java.lang.Throwable -> L54
            boolean r14 = p000.q02.m4671(r14)     // Catch: java.lang.Throwable -> L54
            if (r14 != 0) goto L56
            p000.u72.m5797(r13)     // Catch: java.lang.Throwable -> L54
            r1 = r13
            goto L66
        L54:
            r0 = move-exception
            goto L92
        L56:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L54
            r13.<init>(r10)     // Catch: java.lang.Throwable -> L54
            r13.append(r2)     // Catch: java.lang.Throwable -> L54
            java.lang.String r2 = r13.toString()     // Catch: java.lang.Throwable -> L54
            r10 = 4
            p000.C0888ux.m5988(r4, r2, r15, r10, r15)     // Catch: java.lang.Throwable -> L54
        L66:
            java.lang.String r2 = r1.f10237     // Catch: java.lang.Throwable -> L54
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L54
            r10.<init>(r0)     // Catch: java.lang.Throwable -> L54
            r10.append(r2)     // Catch: java.lang.Throwable -> L54
            java.lang.String r0 = r10.toString()     // Catch: java.lang.Throwable -> L54
            r10 = 4
            p000.C0888ux.m5988(r4, r0, r15, r10, r15)     // Catch: java.lang.Throwable -> L54
            ic r0 = new ic     // Catch: java.lang.Throwable -> L54
            r2 = 10
            r0.<init>(r3, r2, r5)     // Catch: java.lang.Throwable -> L54
            android.net.Uri r0 = p000.u72.m5793(r9, r1, r0)     // Catch: java.lang.Throwable -> L54
            jg1 r1 = new jg1     // Catch: java.lang.Throwable -> L54
            r2 = 8
            r1.<init>(r5, r9, r0, r2)     // Catch: java.lang.Throwable -> L54
            r12.post(r1)     // Catch: java.lang.Throwable -> L54
            r1 = 0
        L8e:
            r11.set(r1)
            goto Lb2
        L92:
            java.lang.String r1 = r0.getMessage()     // Catch: java.lang.Throwable -> Lb3
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb3
            r2.<init>(r6)     // Catch: java.lang.Throwable -> Lb3
            r2.append(r1)     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Throwable -> Lb3
            r10 = 4
            p000.C0888ux.m5988(r4, r1, r15, r10, r15)     // Catch: java.lang.Throwable -> Lb3
            v8 r4 = new v8     // Catch: java.lang.Throwable -> Lb3
            r10 = 7
            r6 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> Lb3
            r12.post(r4)     // Catch: java.lang.Throwable -> Lb3
            r1 = 0
            goto L8e
        Lb2:
            return
        Lb3:
            r0 = move-exception
            r1 = 0
            r11.set(r1)
            throw r0
        Lb9:
            java.lang.Object r1 = r0.f9496
            r2 = r1
            um1 r2 = (p000.um1) r2
            java.lang.Object r1 = r0.f9497
            r3 = r1
            wu1 r3 = (p000.wu1) r3
            android.view.View r1 = r0.f9498
            r5 = r1
            android.widget.TextView r5 = (android.widget.TextView) r5
            android.widget.TextView r6 = r0.f9499
            android.widget.TextView r7 = r0.f9500
            android.widget.TextView r4 = r0.f9495
            p000.bv1.m1045(r2, r3, r4, r5, r6, r7)
            return
    }
}
