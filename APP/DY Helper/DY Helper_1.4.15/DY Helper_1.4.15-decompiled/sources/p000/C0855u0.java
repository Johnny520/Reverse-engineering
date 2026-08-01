package p000;

/* JADX INFO: renamed from: u0 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0855u0 extends p000.q01 implements p000.zr1, p000.qp0, p000.x52 {

    /* JADX INFO: renamed from: τ */
    public final p000.C0060b0 f10543;

    /* JADX INFO: renamed from: υ */
    public final /* synthetic */ androidx.compose.p001ui.platform.AndroidComposeView f10544;

    public C0855u0(androidx.compose.p001ui.platform.AndroidComposeView r2) {
            r1 = this;
            r1.f10544 = r2
            r1.<init>()
            b0 r2 = new b0
            r0 = 2
            r2.<init>(r0, r1)
            r1.f10543 = r2
            return
    }

    @Override // p000.qp0
    /* JADX INFO: renamed from: Φ */
    public final p000.qx0 mo605(p000.dw0 r7, p000.kx0 r8, long r9) {
            r6 = this;
            ch1 r8 = r8.mo2146(r9)
            int r1 = r8.f2115
            int r2 = r8.f2116
            t0 r5 = new t0
            r9 = 0
            r5.<init>(r8, r9)
            kz r3 = p000.C0493kz.f6332
            b0 r4 = r6.f10543
            r0 = r7
            qx0 r6 = r0.mo1609(r1, r2, r3, r4, r5)
            return r6
    }

    @Override // p000.zr1
    /* JADX INFO: renamed from: Ω */
    public final void mo600(p000.js1 r1) {
            r0 = this;
            return
    }

    @Override // p000.x52
    /* JADX INFO: renamed from: λ */
    public final java.lang.Object mo3887() {
            r0 = this;
            java.lang.String r0 = "androidx.compose.ui.layout.WindowInsetsRulers"
            return r0
    }

    /* JADX INFO: renamed from: В */
    public final boolean m5769(android.view.KeyEvent r13) {
            r12 = this;
            int[] r0 = p000.r40.f9257
            int r0 = r13.getKeyCode()
            long r0 = p000.h62.m2385(r0)
            long r2 = p000.wo0.f11774
            boolean r2 = p000.wo0.m6398(r0, r2)
            r3 = 5
            r4 = 6
            r5 = 0
            r6 = 3
            r7 = 4
            r8 = 1
            r9 = 2
            if (r2 == 0) goto L20
            q40 r0 = new q40
            r0.<init>(r9)
            goto Lce
        L20:
            long r10 = p000.wo0.f11775
            boolean r2 = p000.wo0.m6398(r0, r10)
            if (r2 == 0) goto L2f
            q40 r0 = new q40
            r0.<init>(r8)
            goto Lce
        L2f:
            long r10 = p000.wo0.f11781
            boolean r2 = p000.wo0.m6398(r0, r10)
            if (r2 == 0) goto L48
            boolean r0 = r13.isShiftPressed()
            if (r0 == 0) goto L3f
            r0 = r9
            goto L40
        L3f:
            r0 = r8
        L40:
            q40 r1 = new q40
            r1.<init>(r0)
            r0 = r1
            goto Lce
        L48:
            long r10 = p000.wo0.f11779
            boolean r2 = p000.wo0.m6398(r0, r10)
            if (r2 == 0) goto L57
            q40 r0 = new q40
            r0.<init>(r7)
            goto Lce
        L57:
            long r10 = p000.wo0.f11778
            boolean r2 = p000.wo0.m6398(r0, r10)
            if (r2 == 0) goto L66
            q40 r0 = new q40
            r0.<init>(r6)
            goto Lce
        L66:
            long r10 = p000.wo0.f11776
            boolean r2 = p000.wo0.m6398(r0, r10)
            if (r2 != 0) goto Lc9
            long r10 = p000.wo0.f11784
            boolean r2 = p000.wo0.m6398(r0, r10)
            if (r2 == 0) goto L77
            goto Lc9
        L77:
            long r10 = p000.wo0.f11777
            boolean r2 = p000.wo0.m6398(r0, r10)
            if (r2 != 0) goto Lc3
            long r10 = p000.wo0.f11785
            boolean r2 = p000.wo0.m6398(r0, r10)
            if (r2 == 0) goto L88
            goto Lc3
        L88:
            long r10 = p000.wo0.f11780
            boolean r2 = p000.wo0.m6398(r0, r10)
            if (r2 != 0) goto Lbc
            long r10 = p000.wo0.f11782
            boolean r2 = p000.wo0.m6398(r0, r10)
            if (r2 != 0) goto Lbc
            long r10 = p000.wo0.f11786
            boolean r2 = p000.wo0.m6398(r0, r10)
            if (r2 == 0) goto La1
            goto Lbc
        La1:
            long r10 = p000.wo0.f11773
            boolean r2 = p000.wo0.m6398(r0, r10)
            if (r2 != 0) goto Lb4
            long r10 = p000.wo0.f11783
            boolean r0 = p000.wo0.m6398(r0, r10)
            if (r0 == 0) goto Lb2
            goto Lb4
        Lb2:
            r0 = r5
            goto Lce
        Lb4:
            q40 r0 = new q40
            r1 = 8
            r0.<init>(r1)
            goto Lce
        Lbc:
            q40 r0 = new q40
            r1 = 7
            r0.<init>(r1)
            goto Lce
        Lc3:
            q40 r0 = new q40
            r0.<init>(r4)
            goto Lce
        Lc9:
            q40 r0 = new q40
            r0.<init>(r3)
        Lce:
            r1 = 0
            if (r0 == 0) goto L16c
            int r2 = r0.f8856
            int r13 = r13.getAction()
            if (r13 == 0) goto Lda
            return r1
        Lda:
            androidx.compose.ui.platform.AndroidComposeView r12 = r12.f10544
            v40 r13 = r12.getFocusOwner()
            y40 r13 = (p000.y40) r13
            r13.getClass()
            ml1 r13 = r12.getEmbeddedViewFocusRect()
            v40 r10 = r12.getFocusOwner()
            b0 r11 = new b0
            r11.<init>(r8, r0)
            y40 r10 = (p000.y40) r10
            java.lang.Boolean r13 = r10.m6826(r2, r13, r11)
            if (r13 == 0) goto Lff
            boolean r13 = r13.booleanValue()
            goto L100
        Lff:
            r13 = r8
        L100:
            if (r13 == 0) goto L103
            return r8
        L103:
            if (r2 != r8) goto L106
            goto L108
        L106:
            if (r2 != r9) goto L10a
        L108:
            r13 = r8
            goto L10b
        L10a:
            r13 = r1
        L10b:
            if (r13 == 0) goto L16c
            if (r2 != r3) goto L116
            r13 = 33
            java.lang.Integer r5 = java.lang.Integer.valueOf(r13)
            goto L13e
        L116:
            if (r2 != r4) goto L11f
            r13 = 130(0x82, float:1.82E-43)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r13)
            goto L13e
        L11f:
            if (r2 != r6) goto L128
            r13 = 17
            java.lang.Integer r5 = java.lang.Integer.valueOf(r13)
            goto L13e
        L128:
            if (r2 != r7) goto L131
            r13 = 66
            java.lang.Integer r5 = java.lang.Integer.valueOf(r13)
            goto L13e
        L131:
            if (r2 != r8) goto L138
            java.lang.Integer r5 = java.lang.Integer.valueOf(r9)
            goto L13e
        L138:
            if (r2 != r9) goto L13e
            java.lang.Integer r5 = java.lang.Integer.valueOf(r8)
        L13e:
            if (r5 == 0) goto L144
            int r9 = r5.intValue()
        L144:
            android.view.FocusFinder r13 = android.view.FocusFinder.getInstance()
            android.view.View r0 = r12.getRootView()
            r0.getClass()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.view.View r3 = r12.getView()
            android.view.View r13 = r13.findNextFocus(r0, r3, r9)
            if (r13 == 0) goto L161
            boolean r13 = r13.equals(r12)
            if (r13 == 0) goto L16c
        L161:
            v40 r12 = r12.getFocusOwner()
            y40 r12 = (p000.y40) r12
            boolean r12 = r12.m6828(r2)
            return r12
        L16c:
            return r1
    }
}
