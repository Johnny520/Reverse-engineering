package p000;

/* JADX INFO: renamed from: y0 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C1004y0 extends p000.bp0 implements p000.p70 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f12405;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ java.lang.Object f12406;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ java.lang.Object f12407;

    public /* synthetic */ C1004y0(java.lang.Object r1, int r2, java.lang.Object r3) {
            r0 = this;
            r0.f12405 = r2
            r0.f12406 = r1
            r0.f12407 = r3
            r1 = 0
            r0.<init>(r1)
            return
    }

    @Override // p000.p70
    public final java.lang.Object invoke() {
            r8 = this;
            int r0 = r8.f12405
            switch(r0) {
                case 0: goto L12c;
                case 1: goto L11b;
                case 2: goto L10b;
                case 3: goto Lfa;
                case 4: goto Lec;
                case 5: goto L5e;
                case 6: goto L13;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r8.f12406
            androidx.compose.ui.platform.AbstractComposeView r0 = (androidx.compose.p001ui.platform.AbstractComposeView) r0
            java.lang.Object r8 = r8.f12407
            c92 r8 = (p000.c92) r8
            r0.removeOnAttachStateChangeListener(r8)
            s62 r8 = p000.s62.f9751
            return r8
        L13:
            java.lang.Object r0 = r8.f12406
            a80 r0 = (p000.a80) r0
            io1 r1 = p000.q31.f8818
            r0.invoke(r1)
            java.lang.Object r8 = r8.f12407
            q31 r8 = (p000.q31) r8
            iv1 r0 = r8.f8830
            iv1 r2 = r1.f5150
            boolean r0 = p000.ln0.m3626(r0, r2)
            boolean r2 = r8.f8831
            boolean r3 = r1.f5151
            r4 = 1
            if (r2 == r3) goto L31
            r2 = r4
            goto L32
        L31:
            r2 = 0
        L32:
            if (r0 == 0) goto L36
            if (r2 == 0) goto L4b
        L36:
            iv1 r5 = r1.f5150
            r8.f8830 = r5
            r8.f8831 = r3
            boolean r5 = r8.f8832
            if (r5 == 0) goto L4b
            if (r2 != 0) goto L46
            if (r3 == 0) goto L4b
            if (r0 != 0) goto L4b
        L46:
            yp0 r0 = r8.f8839
            r0.m6975()
        L4b:
            r8.f8832 = r4
            iv1 r8 = r1.f5150
            long r2 = r1.f5153
            np0 r0 = r1.f5155
            yr r4 = r1.f5154
            u81 r8 = r8.mo2812(r2, r0, r4)
            r1.f5158 = r8
            s62 r8 = p000.s62.f9751
            return r8
        L5e:
            java.lang.Object r0 = r8.f12406
            yp0 r0 = (p000.yp0) r0
            k31 r0 = r0.f12733
            java.lang.Object r8 = r8.f12407
            um1 r8 = (p000.um1) r8
            q01 r1 = r0.f5729
            int r1 = r1.f8774
            r1 = r1 & 8
            if (r1 == 0) goto Le9
            q22 r0 = r0.f5728
        L72:
            if (r0 == 0) goto Le9
            int r1 = r0.f8773
            r1 = r1 & 8
            if (r1 == 0) goto Le6
            r1 = 0
            r2 = r0
            r3 = r1
        L7d:
            if (r2 == 0) goto Le6
            boolean r4 = r2 instanceof p000.zr1
            r5 = 1
            if (r4 == 0) goto La9
            zr1 r2 = (p000.zr1) r2
            boolean r4 = r2.mo5119()
            if (r4 == 0) goto L95
            xr1 r4 = new xr1
            r4.<init>()
            r8.f10912 = r4
            r4.f12271 = r5
        L95:
            boolean r4 = r2.mo5120()
            if (r4 == 0) goto La1
            java.lang.Object r4 = r8.f10912
            xr1 r4 = (p000.xr1) r4
            r4.f12270 = r5
        La1:
            java.lang.Object r4 = r8.f10912
            js1 r4 = (p000.js1) r4
            r2.mo600(r4)
            goto Le1
        La9:
            int r4 = r2.f8773
            r4 = r4 & 8
            if (r4 == 0) goto Le1
            boolean r4 = r2 instanceof p000.C1014ya
            if (r4 == 0) goto Le1
            r4 = r2
            ya r4 = (p000.C1014ya) r4
            q01 r4 = r4.f12512
            r6 = 0
        Lb9:
            if (r4 == 0) goto Lde
            int r7 = r4.f8773
            r7 = r7 & 8
            if (r7 == 0) goto Ldb
            int r6 = r6 + 1
            if (r6 != r5) goto Lc7
            r2 = r4
            goto Ldb
        Lc7:
            if (r3 != 0) goto Ld2
            k21 r3 = new k21
            r7 = 16
            q01[] r7 = new p000.q01[r7]
            r3.<init>(r7)
        Ld2:
            if (r2 == 0) goto Ld8
            r3.m3127(r2)
            r2 = r1
        Ld8:
            r3.m3127(r4)
        Ldb:
            q01 r4 = r4.f8776
            goto Lb9
        Lde:
            if (r6 != r5) goto Le1
            goto L7d
        Le1:
            q01 r2 = p000.h62.m2387(r3)
            goto L7d
        Le6:
            q01 r0 = r0.f8775
            goto L72
        Le9:
            s62 r8 = p000.s62.f9751
            return r8
        Lec:
            java.lang.Object r0 = r8.f12406
            ke0 r0 = (p000.ke0) r0
            java.lang.Object r8 = r8.f12407
            q01 r8 = (p000.q01) r8
            r0.m3209(r8)
            s62 r8 = p000.s62.f9751
            return r8
        Lfa:
            java.lang.Object r0 = r8.f12406
            um1 r0 = (p000.um1) r0
            java.lang.Object r8 = r8.f12407
            c50 r8 = (p000.c50) r8
            z40 r8 = r8.m1135()
            r0.f10912 = r8
            s62 r8 = p000.s62.f9751
            return r8
        L10b:
            java.lang.Object r0 = r8.f12406
            gd r0 = (p000.C0318gd) r0
            θ r0 = r0.f4327
            java.lang.Object r8 = r8.f12407
            hd r8 = (p000.C0355hd) r8
            r0.invoke(r8)
            s62 r8 = p000.s62.f9751
            return r8
        L11b:
            java.lang.Object r0 = r8.f12406
            androidx.compose.ui.platform.AndroidComposeView r0 = (androidx.compose.p001ui.platform.AndroidComposeView) r0
            java.lang.Object r8 = r8.f12407
            android.view.MotionEvent r8 = (android.view.MotionEvent) r8
            boolean r8 = androidx.compose.p001ui.platform.AndroidComposeView.m365(r8, r0)
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            return r8
        L12c:
            java.lang.Object r0 = r8.f12406
            androidx.compose.ui.platform.AndroidComposeView r0 = (androidx.compose.p001ui.platform.AndroidComposeView) r0
            java.lang.Object r8 = r8.f12407
            android.view.KeyEvent r8 = (android.view.KeyEvent) r8
            boolean r8 = androidx.compose.p001ui.platform.AndroidComposeView.m366(r0, r8)
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            return r8
    }
}
