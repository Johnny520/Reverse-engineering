package p000;

/* JADX INFO: renamed from: x4 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0971x4 implements p000.v41, p000.InterfaceC0219dp, p000.tz0 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f12046;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ androidx.appcompat.app.LayoutInflaterFactory2C0026 f12047;

    public /* synthetic */ C0971x4(androidx.appcompat.app.LayoutInflaterFactory2C0026 r1, int r2) {
            r0 = this;
            r0.f12046 = r2
            r0.f12047 = r1
            r0.<init>()
            return
    }

    @Override // p000.tz0
    /* JADX INFO: renamed from: α */
    public void mo3078(p000.iz0 r9, boolean r10) {
            r8 = this;
            int r0 = r8.f12046
            switch(r0) {
                case 2: goto L3c;
                default: goto L5;
            }
        L5:
            iz0 r0 = r9.mo685()
            r1 = 0
            r2 = 1
            if (r0 == r9) goto Lf
            r3 = r2
            goto L10
        Lf:
            r3 = r1
        L10:
            if (r3 == 0) goto L13
            r9 = r0
        L13:
            androidx.appcompat.app.β r8 = r8.f12047
            g5[] r4 = r8.f390
            if (r4 == 0) goto L1b
            int r5 = r4.length
            goto L1c
        L1b:
            r5 = r1
        L1c:
            if (r1 >= r5) goto L2a
            r6 = r4[r1]
            if (r6 == 0) goto L27
            iz0 r7 = r6.f4242
            if (r7 != r9) goto L27
            goto L2b
        L27:
            int r1 = r1 + 1
            goto L1c
        L2a:
            r6 = 0
        L2b:
            if (r6 == 0) goto L3b
            if (r3 == 0) goto L38
            int r9 = r6.f4235
            r8.m224(r9, r6, r0)
            r8.m226(r6, r2)
            goto L3b
        L38:
            r8.m226(r6, r10)
        L3b:
            return
        L3c:
            androidx.appcompat.app.β r8 = r8.f12047
            r8.m225(r9)
            return
    }

    @Override // p000.v41
    /* JADX INFO: renamed from: η */
    public p000.oc2 mo408(android.view.View r15, p000.oc2 r16) {
            r14 = this;
            int r0 = r16.m4224()
            androidx.appcompat.app.β r14 = r14.f12047
            android.content.Context r1 = r14.f398
            int r2 = r16.m4224()
            androidx.appcompat.widget.ActionBarContextView r3 = r14.f374
            r4 = 8
            r5 = 0
            if (r3 == 0) goto L11d
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            boolean r3 = r3 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r3 == 0) goto L11d
            androidx.appcompat.widget.ActionBarContextView r3 = r14.f374
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3
            androidx.appcompat.widget.ActionBarContextView r6 = r14.f374
            boolean r6 = r6.isShown()
            r7 = 1
            if (r6 == 0) goto L10b
            android.graphics.Rect r6 = r14.f418
            if (r6 != 0) goto L3e
            android.graphics.Rect r6 = new android.graphics.Rect
            r6.<init>()
            r14.f418 = r6
            android.graphics.Rect r6 = new android.graphics.Rect
            r6.<init>()
            r14.f419 = r6
        L3e:
            android.graphics.Rect r6 = r14.f418
            android.graphics.Rect r8 = r14.f419
            int r9 = r16.m4222()
            int r10 = r16.m4224()
            int r11 = r16.m4223()
            int r12 = r16.m4221()
            r6.set(r9, r10, r11, r12)
            android.view.ViewGroup r9 = r14.f379
            p000.ca2.m1173(r9, r6, r8)
            int r8 = r6.top
            int r9 = r6.left
            int r6 = r6.right
            android.view.ViewGroup r10 = r14.f379
            java.util.WeakHashMap r11 = p000.b92.f1572
            oc2 r10 = p000.v82.m6137(r10)
            if (r10 != 0) goto L6c
            r11 = r5
            goto L70
        L6c:
            int r11 = r10.m4222()
        L70:
            if (r10 != 0) goto L74
            r10 = r5
            goto L78
        L74:
            int r10 = r10.m4223()
        L78:
            int r12 = r3.topMargin
            if (r12 != r8) goto L87
            int r12 = r3.leftMargin
            if (r12 != r9) goto L87
            int r12 = r3.rightMargin
            if (r12 == r6) goto L85
            goto L87
        L85:
            r6 = r5
            goto L8e
        L87:
            r3.topMargin = r8
            r3.leftMargin = r9
            r3.rightMargin = r6
            r6 = r7
        L8e:
            if (r8 <= 0) goto Lb4
            android.view.View r8 = r14.f381
            if (r8 != 0) goto Lb4
            android.view.View r8 = new android.view.View
            r8.<init>(r1)
            r14.f381 = r8
            r8.setVisibility(r4)
            android.widget.FrameLayout$LayoutParams r8 = new android.widget.FrameLayout$LayoutParams
            int r9 = r3.topMargin
            r12 = 51
            r13 = -1
            r8.<init>(r13, r9, r12)
            r8.leftMargin = r11
            r8.rightMargin = r10
            android.view.ViewGroup r9 = r14.f379
            android.view.View r10 = r14.f381
            r9.addView(r10, r13, r8)
            goto Ld7
        Lb4:
            android.view.View r8 = r14.f381
            if (r8 == 0) goto Ld7
            android.view.ViewGroup$LayoutParams r8 = r8.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r8 = (android.view.ViewGroup.MarginLayoutParams) r8
            int r9 = r8.height
            int r12 = r3.topMargin
            if (r9 != r12) goto Lcc
            int r9 = r8.leftMargin
            if (r9 != r11) goto Lcc
            int r9 = r8.rightMargin
            if (r9 == r10) goto Ld7
        Lcc:
            r8.height = r12
            r8.leftMargin = r11
            r8.rightMargin = r10
            android.view.View r9 = r14.f381
            r9.setLayoutParams(r8)
        Ld7:
            android.view.View r8 = r14.f381
            if (r8 == 0) goto Ldc
            goto Ldd
        Ldc:
            r7 = r5
        Ldd:
            if (r7 == 0) goto L101
            int r8 = r8.getVisibility()
            if (r8 == 0) goto L101
            android.view.View r8 = r14.f381
            int r9 = r8.getWindowSystemUiVisibility()
            r9 = r9 & 8192(0x2000, float:1.148E-41)
            if (r9 == 0) goto Lf7
            r9 = 2131099654(0x7f060006, float:1.7811667E38)
            int r1 = r1.getColor(r9)
            goto Lfe
        Lf7:
            r9 = 2131099653(0x7f060005, float:1.7811665E38)
            int r1 = r1.getColor(r9)
        Lfe:
            r8.setBackgroundColor(r1)
        L101:
            boolean r1 = r14.f386
            if (r1 != 0) goto L108
            if (r7 == 0) goto L108
            r2 = r5
        L108:
            r1 = r7
            r7 = r6
            goto L115
        L10b:
            int r1 = r3.topMargin
            if (r1 == 0) goto L113
            r3.topMargin = r5
            r1 = r5
            goto L115
        L113:
            r1 = r5
            r7 = r1
        L115:
            if (r7 == 0) goto L11e
            androidx.appcompat.widget.ActionBarContextView r6 = r14.f374
            r6.setLayoutParams(r3)
            goto L11e
        L11d:
            r1 = r5
        L11e:
            android.view.View r14 = r14.f381
            if (r14 == 0) goto L128
            if (r1 == 0) goto L125
            r4 = r5
        L125:
            r14.setVisibility(r4)
        L128:
            if (r0 == r2) goto L13d
            int r14 = r16.m4222()
            int r0 = r16.m4223()
            int r1 = r16.m4221()
            r3 = r16
            oc2 r14 = r3.m4225(r14, r2, r0, r1)
            goto L140
        L13d:
            r3 = r16
            r14 = r3
        L140:
            oc2 r14 = p000.b92.m826(r15, r14)
            return r14
    }

    @Override // p000.tz0
    /* JADX INFO: renamed from: λ */
    public boolean mo3079(p000.iz0 r2) {
            r1 = this;
            int r0 = r1.f12046
            switch(r0) {
                case 2: goto L24;
                default: goto L5;
            }
        L5:
            iz0 r0 = r2.mo685()
            if (r2 != r0) goto L22
            androidx.appcompat.app.β r1 = r1.f12047
            boolean r0 = r1.f384
            if (r0 == 0) goto L22
            android.view.Window r0 = r1.f399
            android.view.Window$Callback r0 = r0.getCallback()
            if (r0 == 0) goto L22
            boolean r1 = r1.f395
            if (r1 != 0) goto L22
            r1 = 108(0x6c, float:1.51E-43)
            r0.onMenuOpened(r1, r2)
        L22:
            r1 = 1
            return r1
        L24:
            androidx.appcompat.app.β r1 = r1.f12047
            android.view.Window r1 = r1.f399
            android.view.Window$Callback r1 = r1.getCallback()
            if (r1 == 0) goto L33
            r0 = 108(0x6c, float:1.51E-43)
            r1.onMenuOpened(r0, r2)
        L33:
            r1 = 1
            return r1
    }
}
