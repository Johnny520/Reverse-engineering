package p000;

/* JADX INFO: renamed from: y1 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C1005y1 extends p000.bp0 implements p000.e80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f12421;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ java.lang.Object f12422;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ java.lang.Object f12423;

    public /* synthetic */ C1005y1(java.lang.Object r1, int r2, java.lang.Object r3) {
            r0 = this;
            r0.f12421 = r2
            r0.f12422 = r1
            r0.f12423 = r3
            r1 = 2
            r0.<init>(r1)
            return
    }

    @Override // p000.e80
    public final java.lang.Object invoke(java.lang.Object r7, java.lang.Object r8) {
            r6 = this;
            int r0 = r6.f12421
            r1 = 1
            r2 = 0
            s62 r3 = p000.s62.f9751
            java.lang.Object r4 = r6.f12423
            java.lang.Object r6 = r6.f12422
            switch(r0) {
                case 0: goto Le5;
                case 1: goto L38;
                default: goto Ld;
            }
        Ld:
            de r7 = (p000.InterfaceC0209de) r7
            wa0 r8 = (p000.wa0) r8
            q31 r6 = (p000.q31) r6
            yp0 r0 = r6.f8839
            boolean r5 = r0.m6978()
            if (r5 == 0) goto L35
            r6.f8834 = r7
            r6.f8833 = r8
            androidx.compose.ui.platform.AndroidComposeView r7 = p000.ln0.m3646(r0)
            y81 r7 = r7.getSnapshotObserver()
            io1 r8 = p000.q31.f8818
            a1 r8 = p000.C0002a1.f32
            n31 r4 = (p000.n31) r4
            kx1 r7 = r7.f12491
            r7.m3425(r6, r8, r4)
            r6.f8837 = r2
            goto L37
        L35:
            r6.f8837 = r1
        L37:
            return r3
        L38:
            v80 r7 = (p000.v80) r7
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            r0 = r8 & 3
            r5 = 2
            if (r0 == r5) goto L47
            r0 = r1
            goto L48
        L47:
            r0 = r2
        L48:
            r8 = r8 & r1
            boolean r8 = r7.m6075(r8, r0)
            if (r8 == 0) goto Le1
            dq0 r6 = (p000.dq0) r6
            x91 r6 = r6.f3240
            java.lang.Object r6 = r6.getValue()
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r8 = r6.booleanValue()
            an r4 = (p000.C0024an) r4
            boolean r0 = r7.f11154
            r5 = 207(0xcf, float:2.9E-43)
            if (r0 != 0) goto L85
            nw1 r0 = r7.f11142
            int r0 = r0.m4102()
            if (r0 != r5) goto L85
            nw1 r0 = r7.f11142
            java.lang.Object r0 = r0.m4101()
            boolean r0 = p000.ln0.m3626(r0, r6)
            if (r0 != 0) goto L85
            int r0 = r7.f11135
            if (r0 >= 0) goto L85
            nw1 r0 = r7.f11142
            int r0 = r0.f7803
            r7.f11135 = r0
            r7.f11134 = r1
        L85:
            r0 = 0
            r7.m6079(r5, r0, r2, r6)
            boolean r6 = r7.m6091(r8)
            if (r8 == 0) goto L97
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            r4.invoke(r7, r6)
            goto Lcc
        L97:
            int r8 = r7.f11168
            if (r8 != 0) goto L9c
            goto La1
        L9c:
            java.lang.String r8 = "No nodes can be emitted before calling deactivateToEndGroup"
            p000.AbstractC0804sn.m5526(r8)
        La1:
            boolean r8 = r7.f11154
            if (r8 != 0) goto Lcc
            if (r6 != 0) goto Lab
            r7.m6077()
            goto Lcc
        Lab:
            nw1 r6 = r7.f11142
            int r8 = r6.f7803
            int r6 = r6.f7804
            rn r0 = r7.f11148
            r0.getClass()
            r0.m5116(r2)
            ke r0 = r0.f9406
            h81 r0 = r0.f5866
            o51 r1 = p000.o51.f7960
            r0.m2458(r1)
            java.util.ArrayList r0 = r7.f11175
            p000.ln0.m3622(r0, r8, r6)
            nw1 r6 = r7.f11142
            r6.m4115()
        Lcc:
            boolean r6 = r7.f11134
            if (r6 == 0) goto Ldd
            nw1 r6 = r7.f11142
            int r6 = r6.f7805
            int r8 = r7.f11135
            if (r6 != r8) goto Ldd
            r6 = -1
            r7.f11135 = r6
            r7.f11134 = r2
        Ldd:
            r7.m6100(r2)
            goto Le4
        Le1:
            r7.m6078()
        Le4:
            return r3
        Le5:
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            bs1 r8 = (p000.bs1) r8
            z1 r4 = (p000.ViewOnAttachStateChangeListenerC1042z1) r4
            cs1 r6 = (p000.cs1) r6
            o11 r6 = r6.f2738
            int r0 = r8.f1826
            boolean r6 = r6.m4152(r0)
            if (r6 != 0) goto L103
            r4.m7063(r7, r8)
            wc r6 = r4.f12931
            r6.mo3385(r3)
        L103:
            return r3
    }
}
