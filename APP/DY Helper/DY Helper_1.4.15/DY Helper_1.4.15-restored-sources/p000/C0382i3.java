package p000;

/* JADX INFO: renamed from: i3 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0382i3 extends p000.bp0 implements p000.a80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f4885;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ java.lang.Object f4886;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ java.lang.Object f4887;

    public /* synthetic */ C0382i3(java.lang.Object r1, int r2, java.lang.Object r3) {
            r0 = this;
            r0.f4885 = r2
            r0.f4887 = r1
            r0.f4886 = r3
            r1 = 1
            r0.<init>(r1)
            return
    }

    @Override // p000.a80
    public final java.lang.Object invoke(java.lang.Object r14) {
            r13 = this;
            int r0 = r13.f4885
            switch(r0) {
                case 0: goto L13c;
                case 1: goto L128;
                case 2: goto L116;
                case 3: goto L75;
                case 4: goto L63;
                default: goto L5;
            }
        L5:
            pn r14 = (p000.C0693pn) r14
            java.lang.Object r0 = r13.f4886
            e80 r0 = (p000.e80) r0
            java.lang.Object r13 = r13.f4887
            hd2 r13 = (p000.hd2) r13
            boolean r1 = r13.f4700
            if (r1 != 0) goto L60
            hr0 r1 = r14.f8598
            android.view.View r2 = r14.f8596
            jr0 r1 = r1.mo192()
            r13.f4702 = r0
            jr0 r3 = r13.f4701
            if (r3 != 0) goto L43
            android.os.Looper r14 = android.os.Looper.myLooper()
            android.os.Handler r0 = r2.getHandler()
            android.os.Looper r0 = r0.getLooper()
            boolean r14 = p000.ln0.m3626(r14, r0)
            if (r14 != 0) goto L3d
            ka2 r14 = new ka2
            r0 = 3
            r14.<init>(r13, r0, r1)
            r2.post(r14)
            goto L60
        L3d:
            r13.f4701 = r1
            r1.m2980(r13)
            goto L60
        L43:
            cr0 r1 = r1.f5558
            cr0 r2 = p000.cr0.f2726
            int r1 = r1.compareTo(r2)
            if (r1 < 0) goto L60
            zn r1 = r13.f4699
            eo r2 = new eo
            r2.<init>(r13, r14, r0)
            an r13 = new an
            r14 = -1723985096(0xffffffff993e1338, float:-9.826651E-24)
            r0 = 1
            r13.<init>(r14, r0, r2)
            r1.m7181(r13)
        L60:
            s62 r13 = p000.s62.f9751
            return r13
        L63:
            bh1 r14 = (p000.bh1) r14
            java.lang.Object r0 = r13.f4887
            ch1 r0 = (p000.ch1) r0
            java.lang.Object r13 = r13.f4886
            gw1 r13 = (p000.gw1) r13
            b0 r13 = r13.f4489
            p000.bh1.m956(r14, r0, r13)
            s62 r13 = p000.s62.f9751
            return r13
        L75:
            cw r14 = (p000.InterfaceC0190cw) r14
            java.lang.Object r0 = r13.f4887
            cw r0 = (p000.InterfaceC0190cw) r0
            m6 r1 = r14.mo579()
            yr r1 = r1.m3791()
            m6 r2 = r14.mo579()
            np0 r2 = r2.m3757()
            m6 r3 = r14.mo579()
            de r3 = r3.m3787()
            m6 r4 = r14.mo579()
            long r4 = r4.m3758()
            m6 r14 = r14.mo579()
            java.lang.Object r14 = r14.f6968
            wa0 r14 = (p000.wa0) r14
            java.lang.Object r13 = r13.f4886
            a80 r13 = (p000.a80) r13
            m6 r6 = r0.mo579()
            yr r6 = r6.m3791()
            m6 r7 = r0.mo579()
            np0 r7 = r7.m3757()
            m6 r8 = r0.mo579()
            de r8 = r8.m3787()
            m6 r9 = r0.mo579()
            long r9 = r9.m3758()
            m6 r11 = r0.mo579()
            java.lang.Object r11 = r11.f6968
            wa0 r11 = (p000.wa0) r11
            m6 r12 = r0.mo579()
            r12.m3769(r1)
            r12.m3770(r2)
            r12.m3768(r3)
            r12.m3771(r4)
            r12.f6968 = r14
            r3.mo1729()
            r13.invoke(r0)     // Catch: java.lang.Throwable -> Lff
            r3.mo1727()
            m6 r13 = r0.mo579()
            r13.m3769(r6)
            r13.m3770(r7)
            r13.m3768(r8)
            r13.m3771(r9)
            r13.f6968 = r11
            s62 r13 = p000.s62.f9751
            return r13
        Lff:
            r13 = move-exception
            r3.mo1727()
            m6 r14 = r0.mo579()
            r14.m3769(r6)
            r14.m3770(r7)
            r14.m3768(r8)
            r14.m3771(r9)
            r14.f6968 = r11
            throw r13
        L116:
            bh1 r14 = (p000.bh1) r14
            java.lang.Object r0 = r13.f4887
            ch1 r0 = (p000.ch1) r0
            java.lang.Object r13 = r13.f4886
            ia r13 = (p000.C0389ia) r13
            a80 r13 = r13.f4970
            p000.bh1.m956(r14, r0, r13)
            s62 r13 = p000.s62.f9751
            return r13
        L128:
            java.lang.Throwable r14 = (java.lang.Throwable) r14
            java.lang.Object r14 = r13.f4887
            k3 r14 = (p000.C0455k3) r14
            java.lang.Object r14 = r14.f5722
            android.view.Choreographer r14 = (android.view.Choreographer) r14
            java.lang.Object r13 = r13.f4886
            j3 r13 = (p000.ChoreographerFrameCallbackC0417j3) r13
            r14.removeFrameCallback(r13)
            s62 r13 = p000.s62.f9751
            return r13
        L13c:
            java.lang.Throwable r14 = (java.lang.Throwable) r14
            java.lang.Object r14 = r13.f4887
            h3 r14 = (p000.C0345h3) r14
            java.lang.Object r13 = r13.f4886
            j3 r13 = (p000.ChoreographerFrameCallbackC0417j3) r13
            java.lang.Object r0 = r14.f4548
            monitor-enter(r0)
            java.util.ArrayList r14 = r14.f4550     // Catch: java.lang.Throwable -> L152
            r14.remove(r13)     // Catch: java.lang.Throwable -> L152
            monitor-exit(r0)
            s62 r13 = p000.s62.f9751
            return r13
        L152:
            r13 = move-exception
            monitor-exit(r0)
            throw r13
    }
}
