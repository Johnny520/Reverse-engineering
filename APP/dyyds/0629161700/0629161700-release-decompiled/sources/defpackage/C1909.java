package defpackage;

/* JADX INFO: renamed from: ᲁᲀᛴᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1909 implements defpackage.InterfaceC0242 {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public final int f8282;

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public defpackage.C0962 f8283;

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public android.graphics.drawable.Drawable f8284;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public final int f8285;

    /* JADX INFO: renamed from: ᛲᲈᛷᛵ, reason: contains not printable characters */
    public defpackage.C0393 f8286;

    /* JADX INFO: renamed from: ᛳᲁᲈᲁ, reason: contains not printable characters */
    public final android.util.SparseBooleanArray f8287;

    /* JADX INFO: renamed from: ᛴᛸᲀ, reason: contains not printable characters */
    public boolean f8288;

    /* JADX INFO: renamed from: ᛴᛸᲈᲈ, reason: contains not printable characters */
    public boolean f8289;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public defpackage.MenuC1701 f8290;

    /* JADX INFO: renamed from: ᛶᛷᛱᲀ, reason: contains not printable characters */
    public boolean f8291;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public android.content.Context f8292;

    /* JADX INFO: renamed from: ᛷᛷᲀᛴ, reason: contains not printable characters */
    public defpackage.C0393 f8293;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final android.content.Context f8294;

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public defpackage.InterfaceC2132 f8295;

    /* JADX INFO: renamed from: ᲀᛳᲀᛵ, reason: contains not printable characters */
    public boolean f8296;

    /* JADX INFO: renamed from: ᲀᲀᛴᛳ, reason: contains not printable characters */
    public defpackage.RunnableC0221 f8297;

    /* JADX INFO: renamed from: ᲁᛴᛵᛲ, reason: contains not printable characters */
    public defpackage.C1309 f8298;

    /* JADX INFO: renamed from: ᲁᲈᲇᲁ, reason: contains not printable characters */
    public int f8299;

    /* JADX INFO: renamed from: ᲇᛱᛸᲇ, reason: contains not printable characters */
    public int f8300;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final android.view.LayoutInflater f8301;

    /* JADX INFO: renamed from: ᲇᲀᛲᛱ, reason: contains not printable characters */
    public int f8302;

    /* JADX INFO: renamed from: ᲈᛵᲀᛱ, reason: contains not printable characters */
    public final defpackage.C1606 f8303;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public defpackage.InterfaceC1469 f8304;

    public C1909(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            r1.f8294 = r2
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
            r1.f8301 = r2
            r2 = 1712062467(0x660c0003, float:1.6528288E23)
            r1.f8282 = r2
            r2 = 1712062466(0x660c0002, float:1.6528286E23)
            r1.f8285 = r2
            android.util.SparseBooleanArray r2 = new android.util.SparseBooleanArray
            r2.<init>()
            r1.f8287 = r2
            ᛸᲈᛸᲈ r2 = new ᛸᲈᛸᲈ
            r0 = 2
            r2.<init>(r0, r1)
            r1.f8303 = r2
            return
    }

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public final boolean m3340() {
            r3 = this;
            ᛱᲈᛷᲀ r0 = r3.f8297
            r1 = 1
            if (r0 == 0) goto L12
            ᲇᲁᛸᲈ r2 = r3.f8295
            if (r2 == 0) goto L12
            android.view.View r2 = (android.view.View) r2
            r2.removeCallbacks(r0)
            r0 = 0
            r3.f8297 = r0
            return r1
        L12:
            ᛲᲈᛸᛲ r3 = r3.f8286
            if (r3 == 0) goto L22
            boolean r0 = r3.m3339()
            if (r0 == 0) goto L21
            ᛶᲇᲀᛵ r3 = r3.f8273
            r3.dismiss()
        L21:
            return r1
        L22:
            r3 = 0
            return r3
    }

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public final boolean m3341() {
            r0 = this;
            ᛲᲈᛸᛲ r0 = r0.f8286
            if (r0 == 0) goto Lc
            boolean r0 = r0.m3339()
            if (r0 == 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public final boolean m3342() {
            r5 = this;
            boolean r0 = r5.f8296
            r1 = 0
            if (r0 == 0) goto L3d
            boolean r0 = r5.m3341()
            if (r0 != 0) goto L3d
            ᲀᛷᛱᲇ r0 = r5.f8290
            if (r0 == 0) goto L3d
            ᲇᲁᛸᲈ r2 = r5.f8295
            if (r2 == 0) goto L3d
            ᛱᲈᛷᲀ r2 = r5.f8297
            if (r2 != 0) goto L3d
            r0.m3077()
            java.util.ArrayList r0 = r0.f7562
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L3d
            ᛲᲈᛸᛲ r0 = new ᛲᲈᛸᛲ
            android.content.Context r2 = r5.f8292
            ᲀᛷᛱᲇ r3 = r5.f8290
            ᛵᲀᛸᲈ r4 = r5.f8283
            r0.<init>(r5, r2, r3, r4)
            ᛱᲈᛷᲀ r2 = new ᛱᲈᛷᲀ
            r2.<init>(r5, r1, r0)
            r5.f8297 = r2
            ᲇᲁᛸᲈ r5 = r5.f8295
            android.view.View r5 = (android.view.View) r5
            r5.post(r2)
            r5 = 1
            return r5
        L3d:
            return r1
    }

    @Override // defpackage.InterfaceC0242
    /* JADX INFO: renamed from: ᛲᛴᲇᛳ */
    public final boolean mo849(defpackage.SubMenuC1502 r9) {
            r8 = this;
            boolean r0 = r9.hasVisibleItems()
            r1 = 0
            if (r0 != 0) goto L8
            goto L3c
        L8:
            r0 = r9
        L9:
            ᲀᛷᛱᲇ r2 = r0.f6611
            ᲀᛷᛱᲇ r3 = r8.f8290
            if (r2 == r3) goto L13
            r0 = r2
            ᛸᛶᛳᛴ r0 = (defpackage.SubMenuC1502) r0
            goto L9
        L13:
            ᛲᛲᛶᲁ r0 = r0.f6612
            ᲇᲁᛸᲈ r2 = r8.f8295
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
            boolean r7 = r6 instanceof defpackage.InterfaceC1637
            if (r7 == 0) goto L37
            r7 = r6
            ᲀᛲᲇᲁ r7 = (defpackage.InterfaceC1637) r7
            ᛲᛲᛶᲁ r7 = r7.getItemData()
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
            java.util.ArrayList r0 = r9.f7560
            int r0 = r0.size()
            r2 = r1
        L44:
            r4 = 1
            if (r2 >= r0) goto L5c
            android.view.MenuItem r5 = r9.getItem(r2)
            boolean r6 = r5.isVisible()
            if (r6 == 0) goto L59
            android.graphics.drawable.Drawable r5 = r5.getIcon()
            if (r5 == 0) goto L59
            r0 = r4
            goto L5d
        L59:
            int r2 = r2 + 1
            goto L44
        L5c:
            r0 = r1
        L5d:
            ᛲᲈᛸᛲ r2 = new ᛲᲈᛸᛲ
            android.content.Context r5 = r8.f8292
            r2.<init>(r8, r5, r9, r3)
            r8.f8293 = r2
            r2.f8281 = r0
            ᛶᲇᲀᛵ r2 = r2.f8273
            if (r2 == 0) goto L6f
            r2.mo2279(r0)
        L6f:
            ᛲᲈᛸᛲ r0 = r8.f8293
            boolean r2 = r0.m3339()
            if (r2 == 0) goto L78
            goto L7f
        L78:
            android.view.View r2 = r0.f8274
            if (r2 == 0) goto L87
            r0.m3337(r1, r1, r1, r1)
        L7f:
            ᛸᛴᛲᛶ r8 = r8.f8304
            if (r8 == 0) goto L86
            r8.mo2546(r9)
        L86:
            return r4
        L87:
            java.lang.String r8 = "MenuPopupHelper cannot be used without an anchor"
            defpackage.C2264.m3676(r8)
            return r1
    }

    @Override // defpackage.InterfaceC0242
    /* JADX INFO: renamed from: ᛵᛱᛵᛲ */
    public final boolean mo850(defpackage.C0254 r1) {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // defpackage.InterfaceC0242
    /* JADX INFO: renamed from: ᛷᛲᲇᲈ */
    public final void mo851(defpackage.InterfaceC1469 r1) {
            r0 = this;
            r0 = 0
            throw r0
    }

    @Override // defpackage.InterfaceC0242
    /* JADX INFO: renamed from: ᛷᛸᛵᲇ */
    public final boolean mo852(defpackage.C0254 r1) {
            r0 = this;
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final android.view.View m3343(defpackage.C0254 r4, android.view.View r5, android.view.ViewGroup r6) {
            r3 = this;
            android.view.View r0 = r4.getActionView()
            r1 = 0
            if (r0 == 0) goto Ld
            boolean r2 = r4.m879()
            if (r2 == 0) goto L3c
        Ld:
            boolean r0 = r5 instanceof defpackage.InterfaceC1637
            if (r0 == 0) goto L14
            ᲀᛲᲇᲁ r5 = (defpackage.InterfaceC1637) r5
            goto L1e
        L14:
            android.view.LayoutInflater r5 = r3.f8301
            int r0 = r3.f8285
            android.view.View r5 = r5.inflate(r0, r6, r1)
            ᲀᛲᲇᲁ r5 = (defpackage.InterfaceC1637) r5
        L1e:
            r5.mo14(r4)
            ᲇᲁᛸᲈ r0 = r3.f8295
            androidx.appcompat.widget.ActionMenuView r0 = (androidx.appcompat.widget.ActionMenuView) r0
            r2 = r5
            androidx.appcompat.view.menu.ActionMenuItemView r2 = (androidx.appcompat.view.menu.ActionMenuItemView) r2
            r2.setItemInvoker(r0)
            ᛷᛷᛱᲁ r0 = r3.f8298
            if (r0 != 0) goto L36
            ᛷᛷᛱᲁ r0 = new ᛷᛷᛱᲁ
            r0.<init>(r3)
            r3.f8298 = r0
        L36:
            r2.setPopupCallback(r0)
            r0 = r5
            android.view.View r0 = (android.view.View) r0
        L3c:
            boolean r3 = r4.f1481
            if (r3 == 0) goto L42
            r1 = 8
        L42:
            r0.setVisibility(r1)
            androidx.appcompat.widget.ActionMenuView r6 = (androidx.appcompat.widget.ActionMenuView) r6
            android.view.ViewGroup$LayoutParams r3 = r0.getLayoutParams()
            r6.getClass()
            boolean r4 = r3 instanceof defpackage.C1762
            if (r4 != 0) goto L59
            ᲀᲇᛲᲇ r3 = androidx.appcompat.widget.ActionMenuView.m40(r3)
            r0.setLayoutParams(r3)
        L59:
            return r0
    }

    @Override // defpackage.InterfaceC0242
    /* JADX INFO: renamed from: ᛸᛵᛸᛷ */
    public final boolean mo853() {
            r17 = this;
            r0 = r17
            ᲀᛷᛱᲇ r1 = r0.f8290
            r3 = 0
            if (r1 == 0) goto L10
            java.util.ArrayList r1 = r1.m3076()
            int r4 = r1.size()
            goto L12
        L10:
            r4 = r3
            r1 = 0
        L12:
            int r5 = r0.f8300
            int r6 = r0.f8299
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r3)
            ᲇᲁᛸᲈ r8 = r0.f8295
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
            ᛲᛲᛶᲁ r15 = (defpackage.C0254) r15
            int r3 = r15.f1500
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
            boolean r2 = r0.f8289
            if (r2 == 0) goto L46
            boolean r2 = r15.f1481
            if (r2 == 0) goto L46
            r5 = 0
        L46:
            int r9 = r9 + 1
            r3 = 0
            goto L22
        L4a:
            boolean r2 = r0.f8296
            if (r2 == 0) goto L55
            if (r10 != 0) goto L53
            int r12 = r12 + r11
            if (r12 <= r5) goto L55
        L53:
            int r5 = r5 + (-1)
        L55:
            int r5 = r5 - r11
            android.util.SparseBooleanArray r2 = r0.f8287
            r2.clear()
            r3 = 0
            r9 = 0
        L5d:
            if (r3 >= r4) goto Lfb
            java.lang.Object r10 = r1.get(r3)
            ᛲᛲᛶᲁ r10 = (defpackage.C0254) r10
            int r11 = r10.f1500
            r12 = r11 & 2
            if (r12 != r13) goto L6d
            r12 = r14
            goto L6e
        L6d:
            r12 = 0
        L6e:
            int r15 = r10.f1492
            if (r12 == 0) goto L8d
            r12 = 0
            android.view.View r11 = r0.m3343(r10, r12, r8)
            r11.measure(r7, r7)
            int r11 = r11.getMeasuredWidth()
            int r6 = r6 - r11
            if (r9 != 0) goto L82
            r9 = r11
        L82:
            if (r15 == 0) goto L87
            r2.put(r15, r14)
        L87:
            r10.m883(r14)
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
            android.view.View r14 = r0.m3343(r10, r13, r8)
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
            ᛲᛲᛶᲁ r14 = (defpackage.C0254) r14
            int r13 = r14.f1492
            if (r13 != r15) goto Le1
            int r13 = r14.f1503
            r0 = 32
            r13 = r13 & r0
            if (r13 != r0) goto Ldd
            int r5 = r5 + 1
        Ldd:
            r0 = 0
            r14.m883(r0)
        Le1:
            int r11 = r11 + 1
            r13 = 0
            r0 = r17
            goto Lc8
        Le7:
            if (r12 == 0) goto Leb
            int r5 = r5 + (-1)
        Leb:
            r10.m883(r12)
            goto L8a
        Lef:
            r0 = 0
            r10.m883(r0)
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

    @Override // defpackage.InterfaceC0242
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public final void mo854(defpackage.MenuC1701 r3, boolean r4) {
            r2 = this;
            r2.m3340()
            ᛲᲈᛸᛲ r0 = r2.f8293
            if (r0 == 0) goto L12
            boolean r1 = r0.m3339()
            if (r1 == 0) goto L12
            ᛶᲇᲀᛵ r0 = r0.f8273
            r0.dismiss()
        L12:
            ᛸᛴᛲᛶ r2 = r2.f8304
            if (r2 == 0) goto L19
            r2.mo2547(r3, r4)
        L19:
            return
    }

    @Override // defpackage.InterfaceC0242
    /* JADX INFO: renamed from: ᲇᛸᲁᛱ */
    public final void mo855() {
            r11 = this;
            ᲇᲁᛸᲈ r0 = r11.f8295
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r1 = 0
            r2 = 0
            if (r0 != 0) goto La
            goto L78
        La:
            ᲀᛷᛱᲇ r3 = r11.f8290
            if (r3 == 0) goto L62
            r3.m3077()
            ᲀᛷᛱᲇ r3 = r11.f8290
            java.util.ArrayList r3 = r3.m3076()
            int r4 = r3.size()
            r5 = r2
            r6 = r5
        L1d:
            if (r5 >= r4) goto L63
            java.lang.Object r7 = r3.get(r5)
            ᛲᛲᛶᲁ r7 = (defpackage.C0254) r7
            int r8 = r7.f1503
            r9 = 32
            r8 = r8 & r9
            if (r8 != r9) goto L5f
            android.view.View r8 = r0.getChildAt(r6)
            boolean r9 = r8 instanceof defpackage.InterfaceC1637
            if (r9 == 0) goto L3c
            r9 = r8
            ᲀᛲᲇᲁ r9 = (defpackage.InterfaceC1637) r9
            ᛲᛲᛶᲁ r9 = r9.getItemData()
            goto L3d
        L3c:
            r9 = r1
        L3d:
            android.view.View r10 = r11.m3343(r7, r8, r0)
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
            ᲇᲁᛸᲈ r7 = r11.f8295
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
            ᛵᲀᛸᲈ r4 = r11.f8283
            if (r3 != r4) goto L74
            int r6 = r6 + 1
            goto L63
        L74:
            r0.removeViewAt(r6)
            goto L63
        L78:
            ᲇᲁᛸᲈ r0 = r11.f8295
            android.view.View r0 = (android.view.View) r0
            r0.requestLayout()
            ᲀᛷᛱᲇ r0 = r11.f8290
            if (r0 == 0) goto L9a
            r0.m3077()
            java.util.ArrayList r0 = r0.f7561
            int r3 = r0.size()
            r4 = r2
        L8d:
            if (r4 >= r3) goto L9a
            java.lang.Object r5 = r0.get(r4)
            ᛲᛲᛶᲁ r5 = (defpackage.C0254) r5
            ᛴᲈᲇᲀ r5 = r5.f1490
            int r4 = r4 + 1
            goto L8d
        L9a:
            ᲀᛷᛱᲇ r0 = r11.f8290
            if (r0 == 0) goto La3
            r0.m3077()
            java.util.ArrayList r1 = r0.f7562
        La3:
            boolean r0 = r11.f8296
            r3 = 1
            if (r0 == 0) goto Lbe
            if (r1 == 0) goto Lbe
            int r0 = r1.size()
            if (r0 != r3) goto Lbb
            java.lang.Object r0 = r1.get(r2)
            ᛲᛲᛶᲁ r0 = (defpackage.C0254) r0
            boolean r0 = r0.f1481
            r2 = r0 ^ 1
            goto Lbe
        Lbb:
            if (r0 <= 0) goto Lbe
            r2 = r3
        Lbe:
            ᛵᲀᛸᲈ r0 = r11.f8283
            if (r2 == 0) goto Lf1
            if (r0 != 0) goto Lcd
            ᛵᲀᛸᲈ r0 = new ᛵᲀᛸᲈ
            android.content.Context r1 = r11.f8294
            r0.<init>(r11, r1)
            r11.f8283 = r0
        Lcd:
            android.view.ViewParent r0 = r0.getParent()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            ᲇᲁᛸᲈ r1 = r11.f8295
            if (r0 == r1) goto L102
            if (r0 == 0) goto Lde
            ᛵᲀᛸᲈ r1 = r11.f8283
            r0.removeView(r1)
        Lde:
            ᲇᲁᛸᲈ r0 = r11.f8295
            androidx.appcompat.widget.ActionMenuView r0 = (androidx.appcompat.widget.ActionMenuView) r0
            ᛵᲀᛸᲈ r1 = r11.f8283
            r0.getClass()
            ᲀᲇᛲᲇ r2 = androidx.appcompat.widget.ActionMenuView.m39()
            r2.f7783 = r3
            r0.addView(r1, r2)
            goto L102
        Lf1:
            if (r0 == 0) goto L102
            android.view.ViewParent r0 = r0.getParent()
            ᲇᲁᛸᲈ r1 = r11.f8295
            if (r0 != r1) goto L102
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            ᛵᲀᛸᲈ r0 = r11.f8283
            r1.removeView(r0)
        L102:
            ᲇᲁᛸᲈ r0 = r11.f8295
            androidx.appcompat.widget.ActionMenuView r0 = (androidx.appcompat.widget.ActionMenuView) r0
            boolean r11 = r11.f8296
            r0.setOverflowReserved(r11)
            return
    }

    @Override // defpackage.InterfaceC0242
    /* JADX INFO: renamed from: ᲈᲈᛸᲁ */
    public final void mo856(android.content.Context r5, defpackage.MenuC1701 r6) {
            r4 = this;
            r4.f8292 = r5
            android.view.LayoutInflater.from(r5)
            r4.f8290 = r6
            android.content.res.Resources r6 = r5.getResources()
            boolean r0 = r4.f8288
            if (r0 != 0) goto L12
            r0 = 1
            r4.f8296 = r0
        L12:
            android.content.res.Resources r0 = r5.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r0 = r0.widthPixels
            r1 = 2
            int r0 = r0 / r1
            r4.f8302 = r0
            android.content.res.Resources r5 = r5.getResources()
            android.content.res.Configuration r5 = r5.getConfiguration()
            int r0 = r5.screenWidthDp
            int r2 = r5.screenHeightDp
            int r5 = r5.smallestScreenWidthDp
            r3 = 600(0x258, float:8.41E-43)
            if (r5 > r3) goto L5a
            if (r0 > r3) goto L5a
            r5 = 720(0x2d0, float:1.009E-42)
            r3 = 960(0x3c0, float:1.345E-42)
            if (r0 <= r3) goto L3c
            if (r2 > r5) goto L5a
        L3c:
            if (r0 <= r5) goto L41
            if (r2 <= r3) goto L41
            goto L5a
        L41:
            r5 = 500(0x1f4, float:7.0E-43)
            if (r0 >= r5) goto L58
            r5 = 480(0x1e0, float:6.73E-43)
            r3 = 640(0x280, float:8.97E-43)
            if (r0 <= r3) goto L4d
            if (r2 > r5) goto L58
        L4d:
            if (r0 <= r5) goto L52
            if (r2 <= r3) goto L52
            goto L58
        L52:
            r5 = 360(0x168, float:5.04E-43)
            if (r0 < r5) goto L5b
            r1 = 3
            goto L5b
        L58:
            r1 = 4
            goto L5b
        L5a:
            r1 = 5
        L5b:
            r4.f8300 = r1
            int r5 = r4.f8302
            boolean r0 = r4.f8296
            r1 = 0
            if (r0 == 0) goto L90
            ᛵᲀᛸᲈ r0 = r4.f8283
            if (r0 != 0) goto L88
            ᛵᲀᛸᲈ r0 = new ᛵᲀᛸᲈ
            android.content.Context r2 = r4.f8294
            r0.<init>(r4, r2)
            r4.f8283 = r0
            boolean r2 = r4.f8291
            r3 = 0
            if (r2 == 0) goto L7f
            android.graphics.drawable.Drawable r2 = r4.f8284
            r0.setImageDrawable(r2)
            r4.f8284 = r1
            r4.f8291 = r3
        L7f:
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r3)
            ᛵᲀᛸᲈ r1 = r4.f8283
            r1.measure(r0, r0)
        L88:
            ᛵᲀᛸᲈ r0 = r4.f8283
            int r0 = r0.getMeasuredWidth()
            int r5 = r5 - r0
            goto L92
        L90:
            r4.f8283 = r1
        L92:
            r4.f8299 = r5
            android.util.DisplayMetrics r4 = r6.getDisplayMetrics()
            float r4 = r4.density
            return
    }
}
