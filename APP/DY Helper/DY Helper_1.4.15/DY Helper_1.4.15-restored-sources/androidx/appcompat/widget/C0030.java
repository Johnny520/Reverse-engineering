package androidx.appcompat.widget;

/* JADX INFO: renamed from: androidx.appcompat.widget.γ */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0030 implements p000.uz0 {

    /* JADX INFO: renamed from: Α */
    public p000.RunnableC1149 f787;

    /* JADX INFO: renamed from: Β */
    public p000.C1148 f788;

    /* JADX INFO: renamed from: Γ */
    public final p000.C0568n f789;

    /* JADX INFO: renamed from: ε */
    public final android.content.Context f790;

    /* JADX INFO: renamed from: ζ */
    public android.content.Context f791;

    /* JADX INFO: renamed from: η */
    public p000.iz0 f792;

    /* JADX INFO: renamed from: θ */
    public final android.view.LayoutInflater f793;

    /* JADX INFO: renamed from: ι */
    public p000.tz0 f794;

    /* JADX INFO: renamed from: κ */
    public final int f795;

    /* JADX INFO: renamed from: λ */
    public final int f796;

    /* JADX INFO: renamed from: μ */
    public p000.wz0 f797;

    /* JADX INFO: renamed from: ν */
    public androidx.appcompat.widget.ActionMenuPresenter$OverflowMenuButton f798;

    /* JADX INFO: renamed from: ξ */
    public android.graphics.drawable.Drawable f799;

    /* JADX INFO: renamed from: ο */
    public boolean f800;

    /* JADX INFO: renamed from: π */
    public boolean f801;

    /* JADX INFO: renamed from: ρ */
    public boolean f802;

    /* JADX INFO: renamed from: σ */
    public int f803;

    /* JADX INFO: renamed from: τ */
    public int f804;

    /* JADX INFO: renamed from: υ */
    public int f805;

    /* JADX INFO: renamed from: φ */
    public boolean f806;

    /* JADX INFO: renamed from: χ */
    public final android.util.SparseBooleanArray f807;

    /* JADX INFO: renamed from: ψ */
    public p000.C1147 f808;

    /* JADX INFO: renamed from: ω */
    public p000.C1147 f809;

    public C0030(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            r1.f790 = r2
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
            r1.f793 = r2
            r2 = 2131492867(0x7f0c0003, float:1.8609198E38)
            r1.f795 = r2
            r2 = 2131492866(0x7f0c0002, float:1.8609196E38)
            r1.f796 = r2
            android.util.SparseBooleanArray r2 = new android.util.SparseBooleanArray
            r2.<init>()
            r1.f807 = r2
            n r2 = new n
            r0 = 2
            r2.<init>(r0, r1)
            r1.f789 = r2
            return
    }

    @Override // p000.uz0
    /* JADX INFO: renamed from: α */
    public final void mo320(p000.iz0 r3, boolean r4) {
            r2 = this;
            r2.m323()
            ｑ r0 = r2.f809
            if (r0 == 0) goto L12
            boolean r1 = r0.m5039()
            if (r1 == 0) goto L12
            oz0 r0 = r0.f9171
            r0.dismiss()
        L12:
            tz0 r2 = r2.f794
            if (r2 == 0) goto L19
            r2.mo3078(r3, r4)
        L19:
            return
    }

    /* JADX INFO: renamed from: β */
    public final android.view.View m321(p000.lz0 r4, android.view.View r5, android.view.ViewGroup r6) {
            r3 = this;
            android.view.View r0 = r4.getActionView()
            r1 = 0
            if (r0 == 0) goto Ld
            boolean r2 = r4.m3669()
            if (r2 == 0) goto L3e
        Ld:
            boolean r0 = r5 instanceof p000.vz0
            if (r0 == 0) goto L14
            vz0 r5 = (p000.vz0) r5
            goto L1e
        L14:
            android.view.LayoutInflater r5 = r3.f793
            int r0 = r3.f796
            android.view.View r5 = r5.inflate(r0, r6, r1)
            vz0 r5 = (p000.vz0) r5
        L1e:
            r5.mo232(r4)
            wz0 r0 = r3.f797
            androidx.appcompat.widget.ActionMenuView r0 = (androidx.appcompat.widget.ActionMenuView) r0
            r2 = r5
            androidx.appcompat.view.menu.ActionMenuItemView r2 = (androidx.appcompat.view.menu.ActionMenuItemView) r2
            r2.setItemInvoker(r0)
            ｒ r0 = r3.f788
            if (r0 != 0) goto L36
            ｒ r0 = new ｒ
            r0.<init>(r3)
            r3.f788 = r0
        L36:
            ｒ r3 = r3.f788
            r2.setPopupCallback(r3)
            r0 = r5
            android.view.View r0 = (android.view.View) r0
        L3e:
            boolean r3 = r4.f6852
            if (r3 == 0) goto L44
            r1 = 8
        L44:
            r0.setVisibility(r1)
            androidx.appcompat.widget.ActionMenuView r6 = (androidx.appcompat.widget.ActionMenuView) r6
            android.view.ViewGroup$LayoutParams r3 = r0.getLayoutParams()
            r6.getClass()
            boolean r4 = r3 instanceof p000.C1151
            if (r4 != 0) goto L5b
            ｕ r3 = androidx.appcompat.widget.ActionMenuView.m262(r3)
            r0.setLayoutParams(r3)
        L5b:
            return r0
    }

    @Override // p000.uz0
    /* JADX INFO: renamed from: γ */
    public final boolean mo322(p000.lz0 r1) {
            r0 = this;
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: δ */
    public final boolean m323() {
            r3 = this;
            ｓ r0 = r3.f787
            r1 = 1
            if (r0 == 0) goto L12
            wz0 r2 = r3.f797
            if (r2 == 0) goto L12
            android.view.View r2 = (android.view.View) r2
            r2.removeCallbacks(r0)
            r0 = 0
            r3.f787 = r0
            return r1
        L12:
            ｑ r3 = r3.f808
            if (r3 == 0) goto L22
            boolean r0 = r3.m5039()
            if (r0 == 0) goto L21
            oz0 r3 = r3.f9171
            r3.dismiss()
        L21:
            return r1
        L22:
            r3 = 0
            return r3
    }

    @Override // p000.uz0
    /* JADX INFO: renamed from: ε */
    public final void mo324(p000.tz0 r1) {
            r0 = this;
            r0 = 0
            throw r0
    }

    @Override // p000.uz0
    /* JADX INFO: renamed from: ζ */
    public final boolean mo325(p000.lz0 r1) {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // p000.uz0
    /* JADX INFO: renamed from: η */
    public final void mo326() {
            r11 = this;
            wz0 r0 = r11.f797
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r1 = 0
            r2 = 0
            if (r0 != 0) goto La
            goto L78
        La:
            iz0 r3 = r11.f792
            if (r3 == 0) goto L62
            r3.m2834()
            iz0 r3 = r11.f792
            java.util.ArrayList r3 = r3.m2835()
            int r4 = r3.size()
            r5 = r2
            r6 = r5
        L1d:
            if (r5 >= r4) goto L63
            java.lang.Object r7 = r3.get(r5)
            lz0 r7 = (p000.lz0) r7
            int r8 = r7.f6876
            r9 = 32
            r8 = r8 & r9
            if (r8 != r9) goto L5f
            android.view.View r8 = r0.getChildAt(r6)
            boolean r9 = r8 instanceof p000.vz0
            if (r9 == 0) goto L3c
            r9 = r8
            vz0 r9 = (p000.vz0) r9
            lz0 r9 = r9.getItemData()
            goto L3d
        L3c:
            r9 = r1
        L3d:
            android.view.View r10 = r11.m321(r7, r8, r0)
            if (r7 == r9) goto L49
            r10.setPressed(r2)
            r10.jumpDrawablesToCurrentState()
        L49:
            if (r10 == r8) goto L5d
            android.view.ViewParent r7 = r10.getParent()
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            if (r7 == 0) goto L56
            r7.removeView(r10)
        L56:
            wz0 r7 = r11.f797
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            r7.addView(r10, r6)
        L5d:
            int r6 = r6 + 1
        L5f:
            int r5 = r5 + 1
            goto L1d
        L62:
            r6 = r2
        L63:
            int r3 = r0.getChildCount()
            if (r6 >= r3) goto L78
            android.view.View r3 = r0.getChildAt(r6)
            androidx.appcompat.widget.ActionMenuPresenter$OverflowMenuButton r4 = r11.f798
            if (r3 != r4) goto L74
            int r6 = r6 + 1
            goto L63
        L74:
            r0.removeViewAt(r6)
            goto L63
        L78:
            wz0 r0 = r11.f797
            android.view.View r0 = (android.view.View) r0
            r0.requestLayout()
            iz0 r0 = r11.f792
            if (r0 == 0) goto L9e
            r0.m2834()
            java.util.ArrayList r0 = r0.f5259
            int r3 = r0.size()
            r4 = r2
        L8d:
            if (r4 >= r3) goto L9e
            java.lang.Object r5 = r0.get(r4)
            lz0 r5 = (p000.lz0) r5
            ｘ r5 = r5.f6850
            if (r5 == 0) goto L9b
            r5.f13522 = r11
        L9b:
            int r4 = r4 + 1
            goto L8d
        L9e:
            iz0 r0 = r11.f792
            if (r0 == 0) goto La7
            r0.m2834()
            java.util.ArrayList r1 = r0.f5260
        La7:
            boolean r0 = r11.f801
            r3 = 1
            if (r0 == 0) goto Lc2
            if (r1 == 0) goto Lc2
            int r0 = r1.size()
            if (r0 != r3) goto Lbf
            java.lang.Object r0 = r1.get(r2)
            lz0 r0 = (p000.lz0) r0
            boolean r0 = r0.f6852
            r2 = r0 ^ 1
            goto Lc2
        Lbf:
            if (r0 <= 0) goto Lc2
            r2 = r3
        Lc2:
            androidx.appcompat.widget.ActionMenuPresenter$OverflowMenuButton r0 = r11.f798
            if (r2 == 0) goto Lf7
            if (r0 != 0) goto Ld1
            androidx.appcompat.widget.ActionMenuPresenter$OverflowMenuButton r0 = new androidx.appcompat.widget.ActionMenuPresenter$OverflowMenuButton
            android.content.Context r1 = r11.f790
            r0.<init>(r11, r1)
            r11.f798 = r0
        Ld1:
            androidx.appcompat.widget.ActionMenuPresenter$OverflowMenuButton r0 = r11.f798
            android.view.ViewParent r0 = r0.getParent()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            wz0 r1 = r11.f797
            if (r0 == r1) goto L108
            if (r0 == 0) goto Le4
            androidx.appcompat.widget.ActionMenuPresenter$OverflowMenuButton r1 = r11.f798
            r0.removeView(r1)
        Le4:
            wz0 r0 = r11.f797
            androidx.appcompat.widget.ActionMenuView r0 = (androidx.appcompat.widget.ActionMenuView) r0
            androidx.appcompat.widget.ActionMenuPresenter$OverflowMenuButton r1 = r11.f798
            r0.getClass()
            ｕ r2 = androidx.appcompat.widget.ActionMenuView.m261()
            r2.f13514 = r3
            r0.addView(r1, r2)
            goto L108
        Lf7:
            if (r0 == 0) goto L108
            android.view.ViewParent r0 = r0.getParent()
            wz0 r1 = r11.f797
            if (r0 != r1) goto L108
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            androidx.appcompat.widget.ActionMenuPresenter$OverflowMenuButton r0 = r11.f798
            r1.removeView(r0)
        L108:
            wz0 r0 = r11.f797
            androidx.appcompat.widget.ActionMenuView r0 = (androidx.appcompat.widget.ActionMenuView) r0
            boolean r11 = r11.f801
            r0.setOverflowReserved(r11)
            return
    }

    /* JADX INFO: renamed from: θ */
    public final boolean m327() {
            r0 = this;
            ｑ r0 = r0.f808
            if (r0 == 0) goto Lc
            boolean r0 = r0.m5039()
            if (r0 == 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    @Override // p000.uz0
    /* JADX INFO: renamed from: ι */
    public final void mo328(android.content.Context r5, p000.iz0 r6) {
            r4 = this;
            r4.f791 = r5
            android.view.LayoutInflater.from(r5)
            r4.f792 = r6
            android.content.res.Resources r6 = r5.getResources()
            ｍ r5 = p000.C1143.m7359(r5)
            boolean r0 = r4.f802
            if (r0 != 0) goto L16
            r0 = 1
            r4.f801 = r0
        L16:
            android.content.Context r0 = r5.f13489
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r0 = r0.widthPixels
            int r0 = r0 / 2
            r4.f803 = r0
            int r5 = r5.m7360()
            r4.f805 = r5
            int r5 = r4.f803
            boolean r0 = r4.f801
            r1 = 0
            if (r0 == 0) goto L5f
            androidx.appcompat.widget.ActionMenuPresenter$OverflowMenuButton r0 = r4.f798
            if (r0 != 0) goto L57
            androidx.appcompat.widget.ActionMenuPresenter$OverflowMenuButton r0 = new androidx.appcompat.widget.ActionMenuPresenter$OverflowMenuButton
            android.content.Context r2 = r4.f790
            r0.<init>(r4, r2)
            r4.f798 = r0
            boolean r2 = r4.f800
            r3 = 0
            if (r2 == 0) goto L4e
            android.graphics.drawable.Drawable r2 = r4.f799
            r0.setImageDrawable(r2)
            r4.f799 = r1
            r4.f800 = r3
        L4e:
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r3)
            androidx.appcompat.widget.ActionMenuPresenter$OverflowMenuButton r1 = r4.f798
            r1.measure(r0, r0)
        L57:
            androidx.appcompat.widget.ActionMenuPresenter$OverflowMenuButton r0 = r4.f798
            int r0 = r0.getMeasuredWidth()
            int r5 = r5 - r0
            goto L61
        L5f:
            r4.f798 = r1
        L61:
            r4.f804 = r5
            android.util.DisplayMetrics r4 = r6.getDisplayMetrics()
            float r4 = r4.density
            return
    }

    @Override // p000.uz0
    /* JADX INFO: renamed from: κ */
    public final boolean mo329(p000.b12 r9) {
            r8 = this;
            boolean r0 = r9.hasVisibleItems()
            r1 = 0
            if (r0 != 0) goto L8
            goto L3c
        L8:
            r0 = r9
        L9:
            iz0 r2 = r0.f1419
            iz0 r3 = r8.f792
            if (r2 == r3) goto L13
            r0 = r2
            b12 r0 = (p000.b12) r0
            goto L9
        L13:
            lz0 r0 = r0.f1420
            wz0 r2 = r8.f797
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r3 = 0
            if (r2 != 0) goto L1d
            goto L3a
        L1d:
            int r4 = r2.getChildCount()
            r5 = r1
        L22:
            if (r5 >= r4) goto L3a
            android.view.View r6 = r2.getChildAt(r5)
            boolean r7 = r6 instanceof p000.vz0
            if (r7 == 0) goto L37
            r7 = r6
            vz0 r7 = (p000.vz0) r7
            lz0 r7 = r7.getItemData()
            if (r7 != r0) goto L37
            r3 = r6
            goto L3a
        L37:
            int r5 = r5 + 1
            goto L22
        L3a:
            if (r3 != 0) goto L3d
        L3c:
            return r1
        L3d:
            lz0 r0 = r9.f1420
            r0.getClass()
            java.util.ArrayList r0 = r9.f5256
            int r0 = r0.size()
            r2 = r1
        L49:
            r4 = 1
            if (r2 >= r0) goto L61
            android.view.MenuItem r5 = r9.getItem(r2)
            boolean r6 = r5.isVisible()
            if (r6 == 0) goto L5e
            android.graphics.drawable.Drawable r5 = r5.getIcon()
            if (r5 == 0) goto L5e
            r0 = r4
            goto L62
        L5e:
            int r2 = r2 + 1
            goto L49
        L61:
            r0 = r1
        L62:
            ｑ r2 = new ｑ
            android.content.Context r5 = r8.f791
            r2.<init>(r8, r5, r9, r3)
            r8.f809 = r2
            r2.f9169 = r0
            oz0 r2 = r2.f9171
            if (r2 == 0) goto L74
            r2.mo2747(r0)
        L74:
            ｑ r0 = r8.f809
            boolean r2 = r0.m5039()
            if (r2 == 0) goto L7d
            goto L84
        L7d:
            android.view.View r2 = r0.f9167
            if (r2 == 0) goto L8c
            r0.m5041(r1, r1, r1, r1)
        L84:
            tz0 r8 = r8.f794
            if (r8 == 0) goto L8b
            r8.mo3079(r9)
        L8b:
            return r4
        L8c:
            java.lang.String r8 = "MenuPopupHelper cannot be used without an anchor"
            p000.C1080.m7279(r8)
            r8 = 0
            return r8
    }

    @Override // p000.uz0
    /* JADX INFO: renamed from: λ */
    public final boolean mo330() {
            r17 = this;
            r0 = r17
            iz0 r1 = r0.f792
            r3 = 0
            if (r1 == 0) goto L10
            java.util.ArrayList r1 = r1.m2835()
            int r4 = r1.size()
            goto L12
        L10:
            r4 = r3
            r1 = 0
        L12:
            int r5 = r0.f805
            int r6 = r0.f804
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r3)
            wz0 r8 = r0.f797
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            r9 = r3
            r10 = r9
            r11 = r10
            r12 = r11
        L22:
            r13 = 2
            r14 = 1
            if (r9 >= r4) goto L4a
            java.lang.Object r15 = r1.get(r9)
            lz0 r15 = (p000.lz0) r15
            int r3 = r15.f6848
            r2 = r3 & 2
            if (r2 != r13) goto L35
            int r11 = r11 + 1
            goto L3d
        L35:
            r2 = r3 & 1
            if (r2 != r14) goto L3c
            int r12 = r12 + 1
            goto L3d
        L3c:
            r10 = r14
        L3d:
            boolean r2 = r0.f806
            if (r2 == 0) goto L46
            boolean r2 = r15.f6852
            if (r2 == 0) goto L46
            r5 = 0
        L46:
            int r9 = r9 + 1
            r3 = 0
            goto L22
        L4a:
            boolean r2 = r0.f801
            if (r2 == 0) goto L55
            if (r10 != 0) goto L53
            int r12 = r12 + r11
            if (r12 <= r5) goto L55
        L53:
            int r5 = r5 + (-1)
        L55:
            int r5 = r5 - r11
            android.util.SparseBooleanArray r2 = r0.f807
            r2.clear()
            r3 = 0
            r9 = 0
        L5d:
            if (r3 >= r4) goto Lfb
            java.lang.Object r10 = r1.get(r3)
            lz0 r10 = (p000.lz0) r10
            int r11 = r10.f6848
            r12 = r11 & 2
            if (r12 != r13) goto L6d
            r12 = r14
            goto L6e
        L6d:
            r12 = 0
        L6e:
            int r15 = r10.f6854
            if (r12 == 0) goto L8d
            r12 = 0
            android.view.View r11 = r0.m321(r10, r12, r8)
            r11.measure(r7, r7)
            int r11 = r11.getMeasuredWidth()
            int r6 = r6 - r11
            if (r9 != 0) goto L82
            r9 = r11
        L82:
            if (r15 == 0) goto L87
            r2.put(r15, r14)
        L87:
            r10.m3670(r14)
        L8a:
            r0 = 0
            goto Lf3
        L8d:
            r11 = r11 & 1
            if (r11 != r14) goto Lef
            boolean r11 = r2.get(r15)
            if (r5 > 0) goto L99
            if (r11 == 0) goto L9d
        L99:
            if (r6 <= 0) goto L9d
            r12 = r14
            goto L9e
        L9d:
            r12 = 0
        L9e:
            r13 = 0
            if (r12 == 0) goto Lb8
            android.view.View r14 = r0.m321(r10, r13, r8)
            r14.measure(r7, r7)
            int r14 = r14.getMeasuredWidth()
            int r6 = r6 - r14
            if (r9 != 0) goto Lb0
            r9 = r14
        Lb0:
            int r14 = r6 + r9
            if (r14 <= 0) goto Lb6
            r14 = 1
            goto Lb7
        Lb6:
            r14 = 0
        Lb7:
            r12 = r12 & r14
        Lb8:
            if (r12 == 0) goto Lc1
            if (r15 == 0) goto Lc1
            r14 = 1
            r2.put(r15, r14)
            goto Le7
        Lc1:
            if (r11 == 0) goto Le7
            r11 = 0
            r2.put(r15, r11)
            r11 = 0
        Lc8:
            if (r11 >= r3) goto Le7
            java.lang.Object r14 = r1.get(r11)
            lz0 r14 = (p000.lz0) r14
            int r13 = r14.f6854
            if (r13 != r15) goto Le1
            int r13 = r14.f6876
            r0 = 32
            r13 = r13 & r0
            if (r13 != r0) goto Ldd
            int r5 = r5 + 1
        Ldd:
            r0 = 0
            r14.m3670(r0)
        Le1:
            int r11 = r11 + 1
            r13 = 0
            r0 = r17
            goto Lc8
        Le7:
            if (r12 == 0) goto Leb
            int r5 = r5 + (-1)
        Leb:
            r10.m3670(r12)
            goto L8a
        Lef:
            r0 = 0
            r10.m3670(r0)
        Lf3:
            int r3 = r3 + 1
            r13 = 2
            r0 = r17
            r14 = 1
            goto L5d
        Lfb:
            r16 = r14
            return r16
    }

    /* JADX INFO: renamed from: μ */
    public final boolean m331() {
            r4 = this;
            boolean r0 = r4.f801
            if (r0 == 0) goto L3d
            boolean r0 = r4.m327()
            if (r0 != 0) goto L3d
            iz0 r0 = r4.f792
            if (r0 == 0) goto L3d
            wz0 r1 = r4.f797
            if (r1 == 0) goto L3d
            ｓ r1 = r4.f787
            if (r1 != 0) goto L3d
            r0.m2834()
            java.util.ArrayList r0 = r0.f5260
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L3d
            ｑ r0 = new ｑ
            android.content.Context r1 = r4.f791
            iz0 r2 = r4.f792
            androidx.appcompat.widget.ActionMenuPresenter$OverflowMenuButton r3 = r4.f798
            r0.<init>(r4, r1, r2, r3)
            ｓ r1 = new ｓ
            r2 = 0
            r1.<init>(r4, r2, r0)
            r4.f787 = r1
            wz0 r4 = r4.f797
            android.view.View r4 = (android.view.View) r4
            r4.post(r1)
            r4 = 1
            return r4
        L3d:
            r4 = 0
            return r4
    }
}
