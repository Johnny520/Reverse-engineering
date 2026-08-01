package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class v42 implements p000.uz0 {

    /* JADX INFO: renamed from: ε */
    public p000.iz0 f11102;

    /* JADX INFO: renamed from: ζ */
    public p000.lz0 f11103;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ androidx.appcompat.widget.Toolbar f11104;

    public v42(androidx.appcompat.widget.Toolbar r1) {
            r0 = this;
            r0.<init>()
            r0.f11104 = r1
            return
    }

    @Override // p000.uz0
    /* JADX INFO: renamed from: α */
    public final void mo320(p000.iz0 r1, boolean r2) {
            r0 = this;
            return
    }

    @Override // p000.uz0
    /* JADX INFO: renamed from: γ */
    public final boolean mo322(p000.lz0 r7) {
            r6 = this;
            androidx.appcompat.widget.Toolbar r0 = r6.f11104
            android.view.View r1 = r0.f767
            boolean r2 = r1 instanceof p000.InterfaceC0947wh
            if (r2 == 0) goto Ld
            wh r1 = (p000.InterfaceC0947wh) r1
            r1.onActionViewCollapsed()
        Ld:
            android.view.View r1 = r0.f767
            r0.removeView(r1)
            androidx.appcompat.widget.AppCompatImageButton r1 = r0.f766
            r0.removeView(r1)
            r1 = 0
            r0.f767 = r1
            java.util.ArrayList r2 = r0.f746
            int r3 = r2.size()
            r4 = 1
            int r3 = r3 - r4
        L22:
            if (r3 < 0) goto L30
            java.lang.Object r5 = r2.get(r3)
            android.view.View r5 = (android.view.View) r5
            r0.addView(r5)
            int r3 = r3 + (-1)
            goto L22
        L30:
            r2.clear()
            r6.f11103 = r1
            r0.requestLayout()
            r6 = 0
            r7.f6852 = r6
            iz0 r7 = r7.f6866
            r7.m2836(r6)
            r0.m315()
            return r4
    }

    @Override // p000.uz0
    /* JADX INFO: renamed from: ζ */
    public final boolean mo325(p000.lz0 r6) {
            r5 = this;
            androidx.appcompat.widget.Toolbar r0 = r5.f11104
            r0.m302()
            androidx.appcompat.widget.AppCompatImageButton r1 = r0.f766
            android.view.ViewParent r1 = r1.getParent()
            if (r1 == r0) goto L1d
            boolean r2 = r1 instanceof android.view.ViewGroup
            if (r2 == 0) goto L18
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            androidx.appcompat.widget.AppCompatImageButton r2 = r0.f766
            r1.removeView(r2)
        L18:
            androidx.appcompat.widget.AppCompatImageButton r1 = r0.f766
            r0.addView(r1)
        L1d:
            android.view.View r1 = r6.getActionView()
            r0.f767 = r1
            r5.f11103 = r6
            android.view.ViewParent r5 = r1.getParent()
            r1 = 2
            if (r5 == r0) goto L51
            boolean r2 = r5 instanceof android.view.ViewGroup
            if (r2 == 0) goto L37
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            android.view.View r2 = r0.f767
            r5.removeView(r2)
        L37:
            w42 r5 = androidx.appcompat.widget.Toolbar.m296()
            int r2 = r0.f772
            r2 = r2 & 112(0x70, float:1.57E-43)
            r3 = 8388611(0x800003, float:1.1754948E-38)
            r2 = r2 | r3
            r5.f11564 = r2
            r5.f11565 = r1
            android.view.View r2 = r0.f767
            r2.setLayoutParams(r5)
            android.view.View r5 = r0.f767
            r0.addView(r5)
        L51:
            int r5 = r0.getChildCount()
            r2 = 1
            int r5 = r5 - r2
        L57:
            if (r5 < 0) goto L76
            android.view.View r3 = r0.getChildAt(r5)
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            w42 r4 = (p000.w42) r4
            int r4 = r4.f11565
            if (r4 == r1) goto L73
            androidx.appcompat.widget.ActionMenuView r4 = r0.f759
            if (r3 == r4) goto L73
            r0.removeViewAt(r5)
            java.util.ArrayList r4 = r0.f746
            r4.add(r3)
        L73:
            int r5 = r5 + (-1)
            goto L57
        L76:
            r0.requestLayout()
            r6.f6852 = r2
            iz0 r5 = r6.f6866
            r6 = 0
            r5.m2836(r6)
            android.view.View r5 = r0.f767
            boolean r6 = r5 instanceof p000.InterfaceC0947wh
            if (r6 == 0) goto L8c
            wh r5 = (p000.InterfaceC0947wh) r5
            r5.onActionViewExpanded()
        L8c:
            r0.m315()
            return r2
    }

    @Override // p000.uz0
    /* JADX INFO: renamed from: η */
    public final void mo326() {
            r4 = this;
            lz0 r0 = r4.f11103
            if (r0 == 0) goto L24
            iz0 r0 = r4.f11102
            if (r0 == 0) goto L1f
            java.util.ArrayList r0 = r0.f5256
            int r0 = r0.size()
            r1 = 0
        Lf:
            if (r1 >= r0) goto L1f
            iz0 r2 = r4.f11102
            android.view.MenuItem r2 = r2.getItem(r1)
            lz0 r3 = r4.f11103
            if (r2 != r3) goto L1c
            goto L24
        L1c:
            int r1 = r1 + 1
            goto Lf
        L1f:
            lz0 r0 = r4.f11103
            r4.mo322(r0)
        L24:
            return
    }

    @Override // p000.uz0
    /* JADX INFO: renamed from: ι */
    public final void mo328(android.content.Context r2, p000.iz0 r3) {
            r1 = this;
            iz0 r2 = r1.f11102
            if (r2 == 0) goto Lb
            lz0 r0 = r1.f11103
            if (r0 == 0) goto Lb
            r2.mo681(r0)
        Lb:
            r1.f11102 = r3
            return
    }

    @Override // p000.uz0
    /* JADX INFO: renamed from: κ */
    public final boolean mo329(p000.b12 r1) {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // p000.uz0
    /* JADX INFO: renamed from: λ */
    public final boolean mo330() {
            r0 = this;
            r0 = 0
            return r0
    }
}
