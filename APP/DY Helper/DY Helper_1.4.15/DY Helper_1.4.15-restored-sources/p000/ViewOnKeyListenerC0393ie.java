package p000;

/* JADX INFO: renamed from: ie */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnKeyListenerC0393ie extends p000.oz0 implements android.view.View.OnKeyListener, android.widget.PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: Α */
    public boolean f5035;

    /* JADX INFO: renamed from: Β */
    public boolean f5036;

    /* JADX INFO: renamed from: Γ */
    public p000.tz0 f5037;

    /* JADX INFO: renamed from: Δ */
    public android.view.ViewTreeObserver f5038;

    /* JADX INFO: renamed from: Ε */
    public android.widget.PopupWindow.OnDismissListener f5039;

    /* JADX INFO: renamed from: Ζ */
    public boolean f5040;

    /* JADX INFO: renamed from: ζ */
    public final android.content.Context f5041;

    /* JADX INFO: renamed from: η */
    public final int f5042;

    /* JADX INFO: renamed from: θ */
    public final int f5043;

    /* JADX INFO: renamed from: ι */
    public final boolean f5044;

    /* JADX INFO: renamed from: κ */
    public final android.os.Handler f5045;

    /* JADX INFO: renamed from: λ */
    public final java.util.ArrayList f5046;

    /* JADX INFO: renamed from: μ */
    public final java.util.ArrayList f5047;

    /* JADX INFO: renamed from: ν */
    public final p000.ViewTreeObserverOnGlobalLayoutListenerC0194d f5048;

    /* JADX INFO: renamed from: ξ */
    public final p000.ViewOnAttachStateChangeListenerC0454k2 f5049;

    /* JADX INFO: renamed from: ο */
    public final p000.C0568n f5050;

    /* JADX INFO: renamed from: π */
    public int f5051;

    /* JADX INFO: renamed from: ρ */
    public int f5052;

    /* JADX INFO: renamed from: σ */
    public android.view.View f5053;

    /* JADX INFO: renamed from: τ */
    public android.view.View f5054;

    /* JADX INFO: renamed from: υ */
    public int f5055;

    /* JADX INFO: renamed from: φ */
    public boolean f5056;

    /* JADX INFO: renamed from: χ */
    public boolean f5057;

    /* JADX INFO: renamed from: ψ */
    public int f5058;

    /* JADX INFO: renamed from: ω */
    public int f5059;

    public ViewOnKeyListenerC0393ie(android.content.Context r4, android.view.View r5, int r6, boolean r7) {
            r3 = this;
            r3.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.f5046 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.f5047 = r0
            d r0 = new d
            r1 = 3
            r0.<init>(r1, r3)
            r3.f5048 = r0
            k2 r0 = new k2
            r1 = 1
            r0.<init>(r1, r3)
            r3.f5049 = r0
            n r0 = new n
            r2 = 5
            r0.<init>(r2, r3)
            r3.f5050 = r0
            r0 = 0
            r3.f5051 = r0
            r3.f5052 = r0
            r3.f5041 = r4
            r3.f5053 = r5
            r3.f5043 = r6
            r3.f5044 = r7
            r3.f5035 = r0
            int r5 = r5.getLayoutDirection()
            if (r5 != r1) goto L3f
            r1 = r0
        L3f:
            r3.f5055 = r1
            android.content.res.Resources r4 = r4.getResources()
            android.util.DisplayMetrics r5 = r4.getDisplayMetrics()
            int r5 = r5.widthPixels
            int r5 = r5 / 2
            r6 = 2131165207(0x7f070017, float:1.7944625E38)
            int r4 = r4.getDimensionPixelSize(r6)
            int r4 = java.lang.Math.max(r5, r4)
            r3.f5042 = r4
            android.os.Handler r4 = new android.os.Handler
            r4.<init>()
            r3.f5045 = r4
            return
    }

    @Override // p000.ew1
    public final void dismiss() {
            r3 = this;
            java.util.ArrayList r3 = r3.f5047
            int r0 = r3.size()
            if (r0 <= 0) goto L28
            he[] r1 = new p000.C0356he[r0]
            java.lang.Object[] r3 = r3.toArray(r1)
            he[] r3 = (p000.C0356he[]) r3
            int r0 = r0 + (-1)
        L12:
            if (r0 < 0) goto L28
            r1 = r3[r0]
            androidx.appcompat.widget.ι r2 = r1.f4703
            m5 r2 = r2.f831
            boolean r2 = r2.isShowing()
            if (r2 == 0) goto L25
            androidx.appcompat.widget.ι r1 = r1.f4703
            r1.dismiss()
        L25:
            int r0 = r0 + (-1)
            goto L12
        L28:
            return
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
            r5 = this;
            java.util.ArrayList r5 = r5.f5047
            int r0 = r5.size()
            r1 = 0
            r2 = r1
        L8:
            if (r2 >= r0) goto L1e
            java.lang.Object r3 = r5.get(r2)
            he r3 = (p000.C0356he) r3
            androidx.appcompat.widget.ι r4 = r3.f4703
            m5 r4 = r4.f831
            boolean r4 = r4.isShowing()
            if (r4 != 0) goto L1b
            goto L1f
        L1b:
            int r2 = r2 + 1
            goto L8
        L1e:
            r3 = 0
        L1f:
            if (r3 == 0) goto L26
            iz0 r5 = r3.f4704
            r5.m2831(r1)
        L26:
            return
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(android.view.View r1, int r2, android.view.KeyEvent r3) {
            r0 = this;
            int r1 = r3.getAction()
            r3 = 1
            if (r1 != r3) goto Lf
            r1 = 82
            if (r2 != r1) goto Lf
            r0.dismiss()
            return r3
        Lf:
            r0 = 0
            return r0
    }

    @Override // p000.uz0
    /* JADX INFO: renamed from: α */
    public final void mo320(p000.iz0 r7, boolean r8) {
            r6 = this;
            java.util.ArrayList r0 = r6.f5047
            int r1 = r0.size()
            r2 = 0
            r3 = r2
        L8:
            if (r3 >= r1) goto L18
            java.lang.Object r4 = r0.get(r3)
            he r4 = (p000.C0356he) r4
            iz0 r4 = r4.f4704
            if (r7 != r4) goto L15
            goto L19
        L15:
            int r3 = r3 + 1
            goto L8
        L18:
            r3 = -1
        L19:
            if (r3 >= 0) goto L1d
            goto La7
        L1d:
            int r1 = r3 + 1
            int r4 = r0.size()
            if (r1 >= r4) goto L30
            java.lang.Object r1 = r0.get(r1)
            he r1 = (p000.C0356he) r1
            iz0 r1 = r1.f4704
            r1.m2831(r2)
        L30:
            java.lang.Object r1 = r0.remove(r3)
            he r1 = (p000.C0356he) r1
            iz0 r3 = r1.f4704
            androidx.appcompat.widget.ι r1 = r1.f4703
            m5 r4 = r1.f831
            r3.m2838(r6)
            boolean r3 = r6.f5040
            r5 = 0
            if (r3 == 0) goto L4a
            p000.rz0.m5311(r4, r5)
            r4.setAnimationStyle(r2)
        L4a:
            r1.dismiss()
            int r1 = r0.size()
            r3 = 1
            if (r1 <= 0) goto L61
            int r4 = r1 + (-1)
            java.lang.Object r4 = r0.get(r4)
            he r4 = (p000.C0356he) r4
            int r4 = r4.f4705
            r6.f5055 = r4
            goto L6e
        L61:
            android.view.View r4 = r6.f5053
            int r4 = r4.getLayoutDirection()
            if (r4 != r3) goto L6b
            r4 = r2
            goto L6c
        L6b:
            r4 = r3
        L6c:
            r6.f5055 = r4
        L6e:
            if (r1 != 0) goto L9a
            r6.dismiss()
            tz0 r8 = r6.f5037
            if (r8 == 0) goto L7a
            r8.mo3078(r7, r3)
        L7a:
            android.view.ViewTreeObserver r7 = r6.f5038
            if (r7 == 0) goto L8d
            boolean r7 = r7.isAlive()
            if (r7 == 0) goto L8b
            android.view.ViewTreeObserver r7 = r6.f5038
            d r8 = r6.f5048
            r7.removeGlobalOnLayoutListener(r8)
        L8b:
            r6.f5038 = r5
        L8d:
            android.view.View r7 = r6.f5054
            k2 r8 = r6.f5049
            r7.removeOnAttachStateChangeListener(r8)
            android.widget.PopupWindow$OnDismissListener r6 = r6.f5039
            r6.onDismiss()
            return
        L9a:
            if (r8 == 0) goto La7
            java.lang.Object r6 = r0.get(r2)
            he r6 = (p000.C0356he) r6
            iz0 r6 = r6.f4704
            r6.m2831(r2)
        La7:
            return
    }

    @Override // p000.ew1
    /* JADX INFO: renamed from: β */
    public final boolean mo340() {
            r2 = this;
            java.util.ArrayList r2 = r2.f5047
            int r0 = r2.size()
            r1 = 0
            if (r0 <= 0) goto L1b
            java.lang.Object r2 = r2.get(r1)
            he r2 = (p000.C0356he) r2
            androidx.appcompat.widget.ι r2 = r2.f4703
            m5 r2 = r2.f831
            boolean r2 = r2.isShowing()
            if (r2 == 0) goto L1b
            r2 = 1
            return r2
        L1b:
            return r1
    }

    @Override // p000.ew1
    /* JADX INFO: renamed from: δ */
    public final void mo342() {
            r3 = this;
            boolean r0 = r3.mo340()
            if (r0 == 0) goto L7
            goto L41
        L7:
            java.util.ArrayList r0 = r3.f5046
            java.util.Iterator r1 = r0.iterator()
        Ld:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L1d
            java.lang.Object r2 = r1.next()
            iz0 r2 = (p000.iz0) r2
            r3.m2753(r2)
            goto Ld
        L1d:
            r0.clear()
            android.view.View r0 = r3.f5053
            r3.f5054 = r0
            if (r0 == 0) goto L41
            android.view.ViewTreeObserver r1 = r3.f5038
            if (r1 != 0) goto L2c
            r1 = 1
            goto L2d
        L2c:
            r1 = 0
        L2d:
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            r3.f5038 = r0
            if (r1 == 0) goto L3a
            d r1 = r3.f5048
            r0.addOnGlobalLayoutListener(r1)
        L3a:
            android.view.View r0 = r3.f5054
            k2 r3 = r3.f5049
            r0.addOnAttachStateChangeListener(r3)
        L41:
            return
    }

    @Override // p000.uz0
    /* JADX INFO: renamed from: ε */
    public final void mo324(p000.tz0 r1) {
            r0 = this;
            r0.f5037 = r1
            return
    }

    @Override // p000.uz0
    /* JADX INFO: renamed from: η */
    public final void mo326() {
            r2 = this;
            java.util.ArrayList r2 = r2.f5047
            java.util.Iterator r2 = r2.iterator()
        L6:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L2d
            java.lang.Object r0 = r2.next()
            he r0 = (p000.C0356he) r0
            androidx.appcompat.widget.ι r0 = r0.f4703
            androidx.appcompat.widget.DropDownListView r0 = r0.f834
            android.widget.ListAdapter r0 = r0.getAdapter()
            boolean r1 = r0 instanceof android.widget.HeaderViewListAdapter
            if (r1 == 0) goto L27
            android.widget.HeaderViewListAdapter r0 = (android.widget.HeaderViewListAdapter) r0
            android.widget.ListAdapter r0 = r0.getWrappedAdapter()
            fz0 r0 = (p000.fz0) r0
            goto L29
        L27:
            fz0 r0 = (p000.fz0) r0
        L29:
            r0.notifyDataSetChanged()
            goto L6
        L2d:
            return
    }

    @Override // p000.ew1
    /* JADX INFO: renamed from: θ */
    public final android.widget.ListView mo344() {
            r1 = this;
            java.util.ArrayList r1 = r1.f5047
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto La
            r1 = 0
            return r1
        La:
            int r0 = r1.size()
            int r0 = r0 + (-1)
            java.lang.Object r1 = r1.get(r0)
            he r1 = (p000.C0356he) r1
            androidx.appcompat.widget.ι r1 = r1.f4703
            androidx.appcompat.widget.DropDownListView r1 = r1.f834
            return r1
    }

    @Override // p000.uz0
    /* JADX INFO: renamed from: κ */
    public final boolean mo329(p000.b12 r5) {
            r4 = this;
            java.util.ArrayList r0 = r4.f5047
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            r2 = 1
            if (r1 == 0) goto L1f
            java.lang.Object r1 = r0.next()
            he r1 = (p000.C0356he) r1
            iz0 r3 = r1.f4704
            if (r5 != r3) goto L6
            androidx.appcompat.widget.ι r4 = r1.f4703
            androidx.appcompat.widget.DropDownListView r4 = r4.f834
            r4.requestFocus()
            return r2
        L1f:
            boolean r0 = r5.hasVisibleItems()
            if (r0 == 0) goto L30
            r4.mo2745(r5)
            tz0 r4 = r4.f5037
            if (r4 == 0) goto L2f
            r4.mo3079(r5)
        L2f:
            return r2
        L30:
            r4 = 0
            return r4
    }

    @Override // p000.uz0
    /* JADX INFO: renamed from: λ */
    public final boolean mo330() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // p000.oz0
    /* JADX INFO: renamed from: μ */
    public final void mo2745(p000.iz0 r2) {
            r1 = this;
            android.content.Context r0 = r1.f5041
            r2.m2830(r1, r0)
            boolean r0 = r1.mo340()
            if (r0 == 0) goto Lf
            r1.m2753(r2)
            return
        Lf:
            java.util.ArrayList r1 = r1.f5046
            r1.add(r2)
            return
    }

    @Override // p000.oz0
    /* JADX INFO: renamed from: ξ */
    public final void mo2746(android.view.View r2) {
            r1 = this;
            android.view.View r0 = r1.f5053
            if (r0 == r2) goto L12
            r1.f5053 = r2
            int r0 = r1.f5051
            int r2 = r2.getLayoutDirection()
            int r2 = android.view.Gravity.getAbsoluteGravity(r0, r2)
            r1.f5052 = r2
        L12:
            return
    }

    @Override // p000.oz0
    /* JADX INFO: renamed from: ο */
    public final void mo2747(boolean r1) {
            r0 = this;
            r0.f5035 = r1
            return
    }

    @Override // p000.oz0
    /* JADX INFO: renamed from: π */
    public final void mo2748(int r2) {
            r1 = this;
            int r0 = r1.f5051
            if (r0 == r2) goto L12
            r1.f5051 = r2
            android.view.View r0 = r1.f5053
            int r0 = r0.getLayoutDirection()
            int r2 = android.view.Gravity.getAbsoluteGravity(r2, r0)
            r1.f5052 = r2
        L12:
            return
    }

    @Override // p000.oz0
    /* JADX INFO: renamed from: ρ */
    public final void mo2749(int r2) {
            r1 = this;
            r0 = 1
            r1.f5056 = r0
            r1.f5058 = r2
            return
    }

    @Override // p000.oz0
    /* JADX INFO: renamed from: σ */
    public final void mo2750(android.widget.PopupWindow.OnDismissListener r1) {
            r0 = this;
            r0.f5039 = r1
            return
    }

    @Override // p000.oz0
    /* JADX INFO: renamed from: τ */
    public final void mo2751(boolean r1) {
            r0 = this;
            r0.f5036 = r1
            return
    }

    @Override // p000.oz0
    /* JADX INFO: renamed from: υ */
    public final void mo2752(int r2) {
            r1 = this;
            r0 = 1
            r1.f5057 = r0
            r1.f5059 = r2
            return
    }

    /* JADX INFO: renamed from: φ */
    public final void m2753(p000.iz0 r19) {
            r18 = this;
            r0 = r18
            r1 = r19
            android.content.Context r2 = r0.f5041
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r2)
            fz0 r4 = new fz0
            boolean r5 = r0.f5044
            r6 = 2131492875(0x7f0c000b, float:1.8609214E38)
            r4.<init>(r1, r3, r5, r6)
            boolean r5 = r0.mo340()
            r6 = 0
            r7 = 1
            if (r5 != 0) goto L23
            boolean r5 = r0.f5035
            if (r5 == 0) goto L23
            r4.f4176 = r7
            goto L4a
        L23:
            boolean r5 = r0.mo340()
            if (r5 == 0) goto L4a
            java.util.ArrayList r5 = r1.f5256
            int r5 = r5.size()
            r8 = r6
        L30:
            if (r8 >= r5) goto L47
            android.view.MenuItem r9 = r1.getItem(r8)
            boolean r10 = r9.isVisible()
            if (r10 == 0) goto L44
            android.graphics.drawable.Drawable r9 = r9.getIcon()
            if (r9 == 0) goto L44
            r5 = r7
            goto L48
        L44:
            int r8 = r8 + 1
            goto L30
        L47:
            r5 = r6
        L48:
            r4.f4176 = r5
        L4a:
            int r5 = r0.f5042
            int r5 = p000.oz0.m4337(r4, r2, r5)
            androidx.appcompat.widget.ι r8 = new androidx.appcompat.widget.ι
            int r9 = r0.f5043
            r10 = 0
            r8.<init>(r2, r10, r9, r6)
            n r2 = r0.f5050
            r8.f852 = r2
            r8.f847 = r0
            m5 r2 = r8.f831
            r2.setOnDismissListener(r0)
            android.view.View r9 = r0.f5053
            r8.f846 = r9
            int r9 = r0.f5052
            r8.f843 = r9
            r8.f830 = r7
            r2.setFocusable(r7)
            r9 = 2
            r2.setInputMethodMode(r9)
            r8.mo336(r4)
            r8.m349(r5)
            int r4 = r0.f5052
            r8.f843 = r4
            java.util.ArrayList r4 = r0.f5047
            int r11 = r4.size()
            if (r11 <= 0) goto L105
            int r11 = r4.size()
            int r11 = r11 - r7
            java.lang.Object r11 = r4.get(r11)
            he r11 = (p000.C0356he) r11
            iz0 r12 = r11.f4704
            java.util.ArrayList r13 = r12.f5256
            int r13 = r13.size()
            r14 = r6
        L9a:
            if (r14 >= r13) goto Lb6
            android.view.MenuItem r15 = r12.getItem(r14)
            boolean r16 = r15.hasSubMenu()
            if (r16 == 0) goto Laf
            r16 = r7
            android.view.SubMenu r7 = r15.getSubMenu()
            if (r1 != r7) goto Lb1
            goto Lb9
        Laf:
            r16 = r7
        Lb1:
            int r14 = r14 + 1
            r7 = r16
            goto L9a
        Lb6:
            r16 = r7
            r15 = r10
        Lb9:
            if (r15 != 0) goto Lbd
            r6 = r10
            goto L109
        Lbd:
            androidx.appcompat.widget.ι r7 = r11.f4703
            androidx.appcompat.widget.DropDownListView r7 = r7.f834
            android.widget.ListAdapter r12 = r7.getAdapter()
            boolean r13 = r12 instanceof android.widget.HeaderViewListAdapter
            if (r13 == 0) goto Ld6
            android.widget.HeaderViewListAdapter r12 = (android.widget.HeaderViewListAdapter) r12
            int r13 = r12.getHeadersCount()
            android.widget.ListAdapter r12 = r12.getWrappedAdapter()
            fz0 r12 = (p000.fz0) r12
            goto Ld9
        Ld6:
            fz0 r12 = (p000.fz0) r12
            r13 = r6
        Ld9:
            int r14 = r12.getCount()
            r9 = r6
        Lde:
            r10 = -1
            if (r9 >= r14) goto Lec
            lz0 r6 = r12.m2220(r9)
            if (r15 != r6) goto Le8
            goto Led
        Le8:
            int r9 = r9 + 1
            r6 = 0
            goto Lde
        Lec:
            r9 = r10
        Led:
            if (r9 != r10) goto Lf1
        Lef:
            r6 = 0
            goto L109
        Lf1:
            int r9 = r9 + r13
            int r6 = r7.getFirstVisiblePosition()
            int r9 = r9 - r6
            if (r9 < 0) goto Lef
            int r6 = r7.getChildCount()
            if (r9 < r6) goto L100
            goto Lef
        L100:
            android.view.View r6 = r7.getChildAt(r9)
            goto L109
        L105:
            r16 = r7
            r6 = 0
            r11 = 0
        L109:
            if (r6 == 0) goto L187
            r7 = 0
            p000.sz0.m5580(r2, r7)
            r7 = 0
            p000.rz0.m5310(r2, r7)
            int r2 = r4.size()
            int r2 = r2 + (-1)
            java.lang.Object r2 = r4.get(r2)
            he r2 = (p000.C0356he) r2
            androidx.appcompat.widget.ι r2 = r2.f4703
            androidx.appcompat.widget.DropDownListView r2 = r2.f834
            r7 = 2
            int[] r7 = new int[r7]
            r2.getLocationOnScreen(r7)
            android.graphics.Rect r9 = new android.graphics.Rect
            r9.<init>()
            android.view.View r10 = r0.f5054
            r10.getWindowVisibleDisplayFrame(r9)
            int r10 = r0.f5055
            r12 = r16
            if (r10 != r12) goto L14d
            r17 = 0
            r7 = r7[r17]
            int r2 = r2.getWidth()
            int r2 = r2 + r7
            int r2 = r2 + r5
            int r7 = r9.right
            if (r2 <= r7) goto L14b
            r2 = r17
        L149:
            r12 = 1
            goto L157
        L14b:
            r2 = 1
            goto L149
        L14d:
            r17 = 0
            r2 = r7[r17]
            int r2 = r2 - r5
            if (r2 >= 0) goto L155
            goto L14b
        L155:
            r2 = 0
            goto L149
        L157:
            if (r2 != r12) goto L15b
            r7 = 1
            goto L15c
        L15b:
            r7 = 0
        L15c:
            r0.f5055 = r2
            r8.f846 = r6
            int r2 = r0.f5052
            r9 = 5
            r2 = r2 & r9
            if (r2 != r9) goto L172
            if (r7 == 0) goto L16a
            r9 = 0
            goto L17c
        L16a:
            int r2 = r6.getWidth()
            r9 = 0
            int r5 = 0 - r2
            goto L17c
        L172:
            r9 = 0
            if (r7 == 0) goto L17a
            int r5 = r6.getWidth()
            goto L17c
        L17a:
            int r5 = 0 - r5
        L17c:
            r8.f837 = r5
            r12 = 1
            r8.f842 = r12
            r8.f841 = r12
            r8.m346(r9)
            goto L1a5
        L187:
            boolean r2 = r0.f5056
            if (r2 == 0) goto L18f
            int r2 = r0.f5058
            r8.f837 = r2
        L18f:
            boolean r2 = r0.f5057
            if (r2 == 0) goto L198
            int r2 = r0.f5059
            r8.m346(r2)
        L198:
            android.graphics.Rect r2 = r0.f8360
            if (r2 == 0) goto L1a2
            android.graphics.Rect r7 = new android.graphics.Rect
            r7.<init>(r2)
            goto L1a3
        L1a2:
            r7 = 0
        L1a3:
            r8.f829 = r7
        L1a5:
            he r2 = new he
            int r5 = r0.f5055
            r2.<init>(r8, r1, r5)
            r4.add(r2)
            r8.mo342()
            androidx.appcompat.widget.DropDownListView r2 = r8.f834
            r2.setOnKeyListener(r0)
            if (r11 != 0) goto L1e3
            boolean r0 = r0.f5036
            if (r0 == 0) goto L1e3
            java.lang.CharSequence r0 = r1.f5263
            if (r0 == 0) goto L1e3
            r0 = 2131492882(0x7f0c0012, float:1.8609228E38)
            r7 = 0
            android.view.View r0 = r3.inflate(r0, r2, r7)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r3 = 16908310(0x1020016, float:2.387729E-38)
            android.view.View r3 = r0.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r0.setEnabled(r7)
            java.lang.CharSequence r1 = r1.f5263
            r3.setText(r1)
            r1 = 0
            r2.addHeaderView(r0, r1, r7)
            r8.mo342()
        L1e3:
            return
    }
}
