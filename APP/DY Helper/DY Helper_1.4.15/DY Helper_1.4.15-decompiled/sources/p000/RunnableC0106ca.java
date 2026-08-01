package p000;

/* JADX INFO: renamed from: ca */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0106ca implements java.lang.Runnable {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f2023;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ java.lang.Object f2024;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ java.lang.Object f2025;

    /* JADX INFO: renamed from: θ */
    public final /* synthetic */ java.lang.Object f2026;

    /* JADX INFO: renamed from: ι */
    public final /* synthetic */ java.lang.Object f2027;

    public RunnableC0106ca(android.app.Dialog r2, p000.sm1 r3, java.lang.String r4, java.lang.String r5) {
            r1 = this;
            r0 = 0
            r1.f2023 = r0
            r1.<init>()
            r1.f2024 = r2
            r1.f2025 = r3
            r1.f2026 = r4
            r1.f2027 = r5
            return
    }

    public RunnableC0106ca(p000.C0568n r2, p000.C0356he r3, p000.lz0 r4, p000.iz0 r5) {
            r1 = this;
            r0 = 1
            r1.f2023 = r0
            r1.<init>()
            r1.f2027 = r2
            r1.f2024 = r3
            r1.f2025 = r4
            r1.f2026 = r5
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r9 = this;
            int r0 = r9.f2023
            switch(r0) {
                case 0: goto L38;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r9.f2027
            n r0 = (p000.C0568n) r0
            java.lang.Object r0 = r0.f7336
            ie r0 = (p000.ViewOnKeyListenerC0393ie) r0
            java.lang.Object r1 = r9.f2025
            lz0 r1 = (p000.lz0) r1
            java.lang.Object r2 = r9.f2024
            he r2 = (p000.C0356he) r2
            if (r2 == 0) goto L22
            r3 = 1
            r0.f5040 = r3
            iz0 r2 = r2.f4704
            r3 = 0
            r2.m2831(r3)
            r0.f5040 = r3
        L22:
            boolean r0 = r1.isEnabled()
            if (r0 == 0) goto L37
            boolean r0 = r1.hasSubMenu()
            if (r0 == 0) goto L37
            java.lang.Object r9 = r9.f2026
            iz0 r9 = (p000.iz0) r9
            r0 = 4
            r2 = 0
            r9.m2837(r1, r2, r0)
        L37:
            return
        L38:
            java.lang.String r0 = "r323590de2ec75a5c"
            java.lang.Object r1 = r9.f2024
            android.app.Dialog r1 = (android.app.Dialog) r1
            java.lang.Object r2 = r9.f2025
            sm1 r2 = (p000.sm1) r2
            java.lang.String r3 = "countdown finished uid="
            java.lang.String r4 = "应用将在 "
            r5 = 4
            r6 = 0
            boolean r7 = r1.isShowing()     // Catch: java.lang.Throwable -> L68
            if (r7 == 0) goto Lc0
            int r7 = r2.f9967     // Catch: java.lang.Throwable -> L68
            if (r7 > 0) goto L53
            goto Lc0
        L53:
            android.view.Window r1 = r1.getWindow()     // Catch: java.lang.Throwable -> L68
            if (r1 == 0) goto L6a
            android.view.View r1 = r1.getDecorView()     // Catch: java.lang.Throwable -> L68
            if (r1 == 0) goto L6a
            java.lang.String r7 = "countdown_text"
            android.view.View r1 = r1.findViewWithTag(r7)     // Catch: java.lang.Throwable -> L68
            android.widget.TextView r1 = (android.widget.TextView) r1     // Catch: java.lang.Throwable -> L68
            goto L6b
        L68:
            r9 = move-exception
            goto Lb3
        L6a:
            r1 = r6
        L6b:
            if (r1 == 0) goto L83
            int r7 = r2.f9967     // Catch: java.lang.Throwable -> L68
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L68
            r8.<init>(r4)     // Catch: java.lang.Throwable -> L68
            r8.append(r7)     // Catch: java.lang.Throwable -> L68
            java.lang.String r4 = " 秒后退出"
            r8.append(r4)     // Catch: java.lang.Throwable -> L68
            java.lang.String r4 = r8.toString()     // Catch: java.lang.Throwable -> L68
            r1.setText(r4)     // Catch: java.lang.Throwable -> L68
        L83:
            int r1 = r2.f9967     // Catch: java.lang.Throwable -> L68
            int r1 = r1 + (-1)
            r2.f9967 = r1     // Catch: java.lang.Throwable -> L68
            if (r1 <= 0) goto L93
            android.os.Handler r1 = p000.AbstractC0205da.f2995     // Catch: java.lang.Throwable -> L68
            r2 = 1000(0x3e8, double:4.94E-321)
            r1.postDelayed(r9, r2)     // Catch: java.lang.Throwable -> L68
            goto Lc0
        L93:
            java.lang.Object r1 = r9.f2026     // Catch: java.lang.Throwable -> L68
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L68
            java.lang.Object r9 = r9.f2027     // Catch: java.lang.Throwable -> L68
            java.lang.String r9 = (java.lang.String) r9     // Catch: java.lang.Throwable -> L68
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L68
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L68
            r2.append(r1)     // Catch: java.lang.Throwable -> L68
            java.lang.String r1 = " reason="
            r2.append(r1)     // Catch: java.lang.Throwable -> L68
            r2.append(r9)     // Catch: java.lang.Throwable -> L68
            java.lang.String r9 = r2.toString()     // Catch: java.lang.Throwable -> L68
            p000.C0888ux.m5988(r0, r9, r6, r5, r6)     // Catch: java.lang.Throwable -> L68
            goto Lc0
        Lb3:
            java.lang.String r9 = r9.getMessage()
            java.lang.String r1 = "countdown update failed: "
            java.lang.String r9 = p000.lz1.m3687(r1, r9)
            p000.C0888ux.m5988(r0, r9, r6, r5, r6)
        Lc0:
            return
    }
}
