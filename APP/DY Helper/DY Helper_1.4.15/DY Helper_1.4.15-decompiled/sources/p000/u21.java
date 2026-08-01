package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class u21 extends p000.f21 {

    /* JADX INFO: renamed from: ο */
    public final p000.f21 f10572;

    /* JADX INFO: renamed from: π */
    public boolean f10573;

    public u21(long r1, p000.yw1 r3, p000.a80 r4, p000.a80 r5, p000.f21 r6) {
            r0 = this;
            r0.<init>(r1, r3, r4, r5)
            r0.f10572 = r6
            r6.mo2005()
            return
    }

    @Override // p000.f21, p000.tw1
    /* JADX INFO: renamed from: γ */
    public final void mo2000() {
            r1 = this;
            boolean r0 = r1.f10484
            if (r0 != 0) goto L13
            super.mo2000()
            boolean r0 = r1.f10573
            if (r0 != 0) goto L13
            r0 = 1
            r1.f10573 = r0
            f21 r1 = r1.f10572
            r1.mo2006()
        L13:
            return
    }

    @Override // p000.f21
    /* JADX INFO: renamed from: ψ */
    public final p000.g81 mo2013() {
            r11 = this;
            f21 r0 = r11.f10572
            boolean r1 = r0.f3735
            if (r1 != 0) goto La
            boolean r1 = r0.f10484
            if (r1 == 0) goto Ld
        La:
            r2 = r11
            goto Lf8
        Ld:
            c21 r5 = r11.f3730
            long r8 = r11.f10483
            r1 = 0
            if (r5 == 0) goto L24
            long r2 = r0.mo5759()
            f21 r0 = r11.f10572
            yw1 r0 = r0.mo5758()
            java.util.HashMap r0 = p000.ax1.m620(r2, r11, r0)
            r6 = r0
            goto L25
        L24:
            r6 = r1
        L25:
            java.lang.Object r10 = p000.ax1.f1362
            monitor-enter(r10)
            p000.ax1.m621(r11)     // Catch: java.lang.Throwable -> L5a
            if (r5 == 0) goto L31
            int r0 = r5.f1944     // Catch: java.lang.Throwable -> L5a
            if (r0 != 0) goto L33
        L31:
            r2 = r11
            goto L66
        L33:
            f21 r0 = r11.f10572     // Catch: java.lang.Throwable -> L5a
            long r3 = r0.mo5759()     // Catch: java.lang.Throwable -> L5a
            f21 r0 = r11.f10572     // Catch: java.lang.Throwable -> L5a
            yw1 r7 = r0.mo5758()     // Catch: java.lang.Throwable -> L5a
            r2 = r11
            g81 r11 = r2.m1995(r3, r5, r6, r7)     // Catch: java.lang.Throwable -> L5a
            ww1 r0 = p000.ww1.f11879     // Catch: java.lang.Throwable -> L5a
            boolean r0 = r11.equals(r0)     // Catch: java.lang.Throwable -> L5a
            if (r0 != 0) goto L4e
            monitor-exit(r10)
            return r11
        L4e:
            f21 r11 = r2.f10572     // Catch: java.lang.Throwable -> L5a
            c21 r11 = r11.mo2014()     // Catch: java.lang.Throwable -> L5a
            if (r11 == 0) goto L5e
            r11.m1115(r5)     // Catch: java.lang.Throwable -> L5a
            goto L69
        L5a:
            r0 = move-exception
            r11 = r0
            goto Lf6
        L5e:
            f21 r11 = r2.f10572     // Catch: java.lang.Throwable -> L5a
            r11.mo1997(r5)     // Catch: java.lang.Throwable -> L5a
            r2.f3730 = r1     // Catch: java.lang.Throwable -> L5a
            goto L69
        L66:
            r2.m5757()     // Catch: java.lang.Throwable -> L5a
        L69:
            f21 r11 = r2.f10572     // Catch: java.lang.Throwable -> L5a
            long r0 = r11.mo5759()     // Catch: java.lang.Throwable -> L5a
            int r11 = p000.ln0.m3633(r0, r8)     // Catch: java.lang.Throwable -> L5a
            if (r11 >= 0) goto L7a
            f21 r11 = r2.f10572     // Catch: java.lang.Throwable -> L5a
            r11.m2012()     // Catch: java.lang.Throwable -> L5a
        L7a:
            f21 r11 = r2.f10572     // Catch: java.lang.Throwable -> L5a
            yw1 r0 = r11.mo5758()     // Catch: java.lang.Throwable -> L5a
            yw1 r0 = r0.m7045(r8)     // Catch: java.lang.Throwable -> L5a
            yw1 r1 = r2.f3732     // Catch: java.lang.Throwable -> L5a
            yw1 r0 = r0.m7044(r1)     // Catch: java.lang.Throwable -> L5a
            r11.mo5762(r0)     // Catch: java.lang.Throwable -> L5a
            f21 r11 = r2.f10572     // Catch: java.lang.Throwable -> L5a
            r11.m1996(r8)     // Catch: java.lang.Throwable -> L5a
            f21 r11 = r2.f10572     // Catch: java.lang.Throwable -> L5a
            int r0 = r2.f10485     // Catch: java.lang.Throwable -> L5a
            r1 = -1
            r2.f10485 = r1     // Catch: java.lang.Throwable -> L5a
            if (r0 < 0) goto Lac
            int[] r1 = r11.f3733     // Catch: java.lang.Throwable -> L5a
            r1.getClass()     // Catch: java.lang.Throwable -> L5a
            int r3 = r1.length     // Catch: java.lang.Throwable -> L5a
            int r4 = r3 + 1
            int[] r1 = java.util.Arrays.copyOf(r1, r4)     // Catch: java.lang.Throwable -> L5a
            r1[r3] = r0     // Catch: java.lang.Throwable -> L5a
            r11.f3733 = r1     // Catch: java.lang.Throwable -> L5a
            goto Laf
        Lac:
            r11.getClass()     // Catch: java.lang.Throwable -> L5a
        Laf:
            f21 r11 = r2.f10572     // Catch: java.lang.Throwable -> L5a
            yw1 r0 = r2.f3732     // Catch: java.lang.Throwable -> L5a
            r11.getClass()     // Catch: java.lang.Throwable -> L5a
            monitor-enter(r10)     // Catch: java.lang.Throwable -> L5a
            yw1 r1 = r11.f3732     // Catch: java.lang.Throwable -> Lf2
            yw1 r0 = r1.m7047(r0)     // Catch: java.lang.Throwable -> Lf2
            r11.f3732 = r0     // Catch: java.lang.Throwable -> Lf2
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L5a
            f21 r11 = r2.f10572     // Catch: java.lang.Throwable -> L5a
            int[] r0 = r2.f3733     // Catch: java.lang.Throwable -> L5a
            r11.getClass()     // Catch: java.lang.Throwable -> L5a
            int r1 = r0.length     // Catch: java.lang.Throwable -> L5a
            if (r1 != 0) goto Lcb
            goto Le0
        Lcb:
            int[] r1 = r11.f3733     // Catch: java.lang.Throwable -> L5a
            int r3 = r1.length     // Catch: java.lang.Throwable -> L5a
            if (r3 != 0) goto Ld1
            goto Lde
        Ld1:
            int r3 = r1.length     // Catch: java.lang.Throwable -> L5a
            int r4 = r0.length     // Catch: java.lang.Throwable -> L5a
            int r5 = r3 + r4
            int[] r1 = java.util.Arrays.copyOf(r1, r5)     // Catch: java.lang.Throwable -> L5a
            r5 = 0
            java.lang.System.arraycopy(r0, r5, r1, r3, r4)     // Catch: java.lang.Throwable -> L5a
            r0 = r1
        Lde:
            r11.f3733 = r0     // Catch: java.lang.Throwable -> L5a
        Le0:
            monitor-exit(r10)
            r11 = 1
            r2.f3735 = r11
            boolean r0 = r2.f10573
            if (r0 != 0) goto Lef
            r2.f10573 = r11
            f21 r11 = r2.f10572
            r11.mo2006()
        Lef:
            ww1 r11 = p000.ww1.f11879
            return r11
        Lf2:
            r0 = move-exception
            r11 = r0
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L5a
            throw r11     // Catch: java.lang.Throwable -> L5a
        Lf6:
            monitor-exit(r10)
            throw r11
        Lf8:
            vw1 r11 = new vw1
            r11.<init>(r2)
            return r11
    }
}
