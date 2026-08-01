package defpackage;

/* JADX INFO: renamed from: ᛸᛱᛷᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnKeyListenerC1423 extends defpackage.AbstractC1173 implements android.view.View.OnKeyListener, android.widget.PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public final android.os.Handler f6225;

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public final defpackage.ViewTreeObserverOnGlobalLayoutListenerC0799 f6226;

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public final defpackage.ViewOnAttachStateChangeListenerC0912 f6227;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public final java.util.ArrayList f6228;

    /* JADX INFO: renamed from: ᛲᲈᛷᛵ, reason: contains not printable characters */
    public int f6229;

    /* JADX INFO: renamed from: ᛳᲁᲈᲁ, reason: contains not printable characters */
    public boolean f6230;

    /* JADX INFO: renamed from: ᛴᛸᲀ, reason: contains not printable characters */
    public int f6231;

    /* JADX INFO: renamed from: ᛴᛸᲈᲈ, reason: contains not printable characters */
    public boolean f6232;

    /* JADX INFO: renamed from: ᛴᲀᲁᛴ, reason: contains not printable characters */
    public boolean f6233;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final int f6234;

    /* JADX INFO: renamed from: ᛶᛷᛱᲀ, reason: contains not printable characters */
    public final defpackage.C1606 f6235;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final android.content.Context f6236;

    /* JADX INFO: renamed from: ᛷᛷᲀᛴ, reason: contains not printable characters */
    public int f6237;

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public final java.util.ArrayList f6238;

    /* JADX INFO: renamed from: ᲀᛳᲀᛵ, reason: contains not printable characters */
    public int f6239;

    /* JADX INFO: renamed from: ᲀᲀᛴᛳ, reason: contains not printable characters */
    public boolean f6240;

    /* JADX INFO: renamed from: ᲁᛴᛵᛲ, reason: contains not printable characters */
    public boolean f6241;

    /* JADX INFO: renamed from: ᲁᲈᛳ, reason: contains not printable characters */
    public android.widget.PopupWindow.OnDismissListener f6242;

    /* JADX INFO: renamed from: ᲁᲈᲇᲁ, reason: contains not printable characters */
    public android.view.View f6243;

    /* JADX INFO: renamed from: ᲇᛱᛸᲇ, reason: contains not printable characters */
    public int f6244;

    /* JADX INFO: renamed from: ᲇᛳᛴᲈ, reason: contains not printable characters */
    public android.view.ViewTreeObserver f6245;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final int f6246;

    /* JADX INFO: renamed from: ᲇᲀᛲᛱ, reason: contains not printable characters */
    public android.view.View f6247;

    /* JADX INFO: renamed from: ᲈᛵᲀᛱ, reason: contains not printable characters */
    public defpackage.InterfaceC1469 f6248;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final boolean f6249;

    public ViewOnKeyListenerC1423(android.content.Context r5, android.view.View r6, int r7, boolean r8) {
            r4 = this;
            r4.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4.f6228 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4.f6238 = r0
            ᛴᲈᛶᛳ r0 = new ᛴᲈᛶᛳ
            r1 = 2
            r0.<init>(r1, r4)
            r4.f6226 = r0
            ᛵᛶᛵᛷ r0 = new ᛵᛶᛵᛷ
            r2 = 0
            r0.<init>(r2, r4)
            r4.f6227 = r0
            ᛸᲈᛸᲈ r0 = new ᛸᲈᛸᲈ
            r3 = 7
            r0.<init>(r3, r4)
            r4.f6235 = r0
            r4.f6239 = r2
            r4.f6231 = r2
            r4.f6236 = r5
            r4.f6247 = r6
            r4.f6246 = r7
            r4.f6249 = r8
            r4.f6240 = r2
            java.util.WeakHashMap r7 = defpackage.AbstractC0858.f3911
            int r6 = r6.getLayoutDirection()
            r7 = 1
            if (r6 != r7) goto L41
            goto L42
        L41:
            r2 = r7
        L42:
            r4.f6244 = r2
            android.content.res.Resources r5 = r5.getResources()
            android.util.DisplayMetrics r6 = r5.getDisplayMetrics()
            int r6 = r6.widthPixels
            int r6 = r6 / r1
            r7 = 1711734807(0x66070017, float:1.5938028E23)
            int r5 = r5.getDimensionPixelSize(r7)
            int r5 = java.lang.Math.max(r6, r5)
            r4.f6234 = r5
            android.os.Handler r5 = new android.os.Handler
            r5.<init>()
            r4.f6225 = r5
            return
    }

    @Override // defpackage.InterfaceC2128
    public final void dismiss() {
            r3 = this;
            java.util.ArrayList r3 = r3.f6238
            int r0 = r3.size()
            if (r0 <= 0) goto L28
            ᲀᛵᲁᲀ[] r1 = new defpackage.C1681[r0]
            java.lang.Object[] r3 = r3.toArray(r1)
            ᲀᛵᲁᲀ[] r3 = (defpackage.C1681[]) r3
            int r0 = r0 + (-1)
        L12:
            if (r0 < 0) goto L28
            r1 = r3[r0]
            ᲁᲀᛷᛲ r2 = r1.f7491
            ᛳᲇᲇᛲ r2 = r2.f6630
            boolean r2 = r2.isShowing()
            if (r2 == 0) goto L25
            ᲁᲀᛷᛲ r1 = r1.f7491
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
            java.util.ArrayList r5 = r5.f6238
            int r0 = r5.size()
            r1 = 0
            r2 = r1
        L8:
            if (r2 >= r0) goto L1e
            java.lang.Object r3 = r5.get(r2)
            ᲀᛵᲁᲀ r3 = (defpackage.C1681) r3
            ᲁᲀᛷᛲ r4 = r3.f7491
            ᛳᲇᲇᛲ r4 = r4.f6630
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
            ᲀᛷᛱᲇ r5 = r3.f7492
            r5.m3082(r1)
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

    @Override // defpackage.InterfaceC2128
    public final void show() {
            r3 = this;
            boolean r0 = r3.mo2605()
            if (r0 == 0) goto L7
            goto L41
        L7:
            java.util.ArrayList r0 = r3.f6228
            java.util.Iterator r1 = r0.iterator()
        Ld:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L1d
            java.lang.Object r2 = r1.next()
            ᲀᛷᛱᲇ r2 = (defpackage.MenuC1701) r2
            r3.m2604(r2)
            goto Ld
        L1d:
            r0.clear()
            android.view.View r0 = r3.f6247
            r3.f6243 = r0
            if (r0 == 0) goto L41
            android.view.ViewTreeObserver r1 = r3.f6245
            if (r1 != 0) goto L2c
            r1 = 1
            goto L2d
        L2c:
            r1 = 0
        L2d:
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            r3.f6245 = r0
            if (r1 == 0) goto L3a
            ᛴᲈᛶᛳ r1 = r3.f6226
            r0.addOnGlobalLayoutListener(r1)
        L3a:
            android.view.View r0 = r3.f6243
            ᛵᛶᛵᛷ r3 = r3.f6227
            r0.addOnAttachStateChangeListener(r3)
        L41:
            return
    }

    @Override // defpackage.InterfaceC2128
    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public final defpackage.C0398 mo2603() {
            r1 = this;
            java.util.ArrayList r1 = r1.f6238
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto La
            r1 = 0
            return r1
        La:
            int r0 = r1.size()
            int r0 = r0 + (-1)
            java.lang.Object r1 = r1.get(r0)
            ᲀᛵᲁᲀ r1 = (defpackage.C1681) r1
            ᲁᲀᛷᛲ r1 = r1.f7491
            ᛲᲈᲁᛸ r1 = r1.f6621
            return r1
    }

    @Override // defpackage.AbstractC1173
    /* JADX INFO: renamed from: ᛲᛲᛵ */
    public final void mo2275(defpackage.MenuC1701 r2) {
            r1 = this;
            android.content.Context r0 = r1.f6236
            r2.m3087(r1, r0)
            boolean r0 = r1.mo2605()
            if (r0 == 0) goto Lf
            r1.m2604(r2)
            return
        Lf:
            java.util.ArrayList r1 = r1.f6228
            r1.add(r2)
            return
    }

    @Override // defpackage.InterfaceC0242
    /* JADX INFO: renamed from: ᛲᛴᲇᛳ */
    public final boolean mo849(defpackage.SubMenuC1502 r5) {
            r4 = this;
            java.util.ArrayList r0 = r4.f6238
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            r2 = 1
            if (r1 == 0) goto L1f
            java.lang.Object r1 = r0.next()
            ᲀᛵᲁᲀ r1 = (defpackage.C1681) r1
            ᲀᛷᛱᲇ r3 = r1.f7492
            if (r5 != r3) goto L6
            ᲁᲀᛷᛲ r4 = r1.f7491
            ᛲᲈᲁᛸ r4 = r4.f6621
            r4.requestFocus()
            return r2
        L1f:
            boolean r0 = r5.hasVisibleItems()
            if (r0 == 0) goto L30
            r4.mo2275(r5)
            ᛸᛴᛲᛶ r4 = r4.f6248
            if (r4 == 0) goto L2f
            r4.mo2546(r5)
        L2f:
            return r2
        L30:
            r4 = 0
            return r4
    }

    /* JADX INFO: renamed from: ᛳᲁᲈᲁ, reason: contains not printable characters */
    public final void m2604(defpackage.MenuC1701 r19) {
            r18 = this;
            r0 = r18
            r1 = r19
            android.content.Context r2 = r0.f6236
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r2)
            ᛸᛶᛶᲀ r4 = new ᛸᛶᛶᲀ
            boolean r5 = r0.f6249
            r6 = 1712062475(0x660c000b, float:1.6528303E23)
            r4.<init>(r1, r3, r5, r6)
            boolean r5 = r0.mo2605()
            r7 = 1
            if (r5 != 0) goto L22
            boolean r5 = r0.f6240
            if (r5 == 0) goto L22
            r4.f6672 = r7
            goto L49
        L22:
            boolean r5 = r0.mo2605()
            if (r5 == 0) goto L49
            java.util.ArrayList r5 = r1.f7560
            int r5 = r5.size()
            r8 = 0
        L2f:
            if (r8 >= r5) goto L46
            android.view.MenuItem r9 = r1.getItem(r8)
            boolean r10 = r9.isVisible()
            if (r10 == 0) goto L43
            android.graphics.drawable.Drawable r9 = r9.getIcon()
            if (r9 == 0) goto L43
            r5 = r7
            goto L47
        L43:
            int r8 = r8 + 1
            goto L2f
        L46:
            r5 = 0
        L47:
            r4.f6672 = r5
        L49:
            int r5 = r0.f6234
            int r5 = defpackage.AbstractC1173.m2274(r4, r2, r5)
            ᲁᲀᛷᛲ r8 = new ᲁᲀᛷᛲ
            int r9 = r0.f6246
            r10 = 0
            r8.<init>(r2, r10, r9)
            ᛸᲈᛸᲈ r2 = r0.f6235
            r8.f8326 = r2
            r8.f6632 = r0
            ᛳᲇᲇᛲ r2 = r8.f6630
            r2.setOnDismissListener(r0)
            android.view.View r9 = r0.f6247
            r8.f6631 = r9
            int r9 = r0.f6231
            r8.f6627 = r9
            r8.f6633 = r7
            r2.setFocusable(r7)
            r9 = 2
            r2.setInputMethodMode(r9)
            r8.mo1581(r4)
            r8.m2728(r5)
            int r4 = r0.f6231
            r8.f6627 = r4
            java.util.ArrayList r4 = r0.f6238
            int r11 = r4.size()
            if (r11 <= 0) goto L103
            int r11 = r4.size()
            int r11 = r11 - r7
            java.lang.Object r11 = r4.get(r11)
            ᲀᛵᲁᲀ r11 = (defpackage.C1681) r11
            ᲀᛷᛱᲇ r12 = r11.f7492
            java.util.ArrayList r13 = r12.f7560
            int r13 = r13.size()
            r14 = 0
        L99:
            if (r14 >= r13) goto Lb5
            android.view.MenuItem r15 = r12.getItem(r14)
            boolean r16 = r15.hasSubMenu()
            if (r16 == 0) goto Lae
            r16 = r7
            android.view.SubMenu r7 = r15.getSubMenu()
            if (r1 != r7) goto Lb0
            goto Lb8
        Lae:
            r16 = r7
        Lb0:
            int r14 = r14 + 1
            r7 = r16
            goto L99
        Lb5:
            r16 = r7
            r15 = r10
        Lb8:
            if (r15 != 0) goto Lbc
            r6 = r10
            goto L107
        Lbc:
            ᲁᲀᛷᛲ r7 = r11.f7491
            ᛲᲈᲁᛸ r7 = r7.f6621
            android.widget.ListAdapter r12 = r7.getAdapter()
            boolean r13 = r12 instanceof android.widget.HeaderViewListAdapter
            if (r13 == 0) goto Ld5
            android.widget.HeaderViewListAdapter r12 = (android.widget.HeaderViewListAdapter) r12
            int r13 = r12.getHeadersCount()
            android.widget.ListAdapter r12 = r12.getWrappedAdapter()
            ᛸᛶᛶᲀ r12 = (defpackage.C1510) r12
            goto Ld8
        Ld5:
            ᛸᛶᛶᲀ r12 = (defpackage.C1510) r12
            r13 = 0
        Ld8:
            int r14 = r12.getCount()
            r9 = 0
        Ldd:
            r10 = -1
            if (r9 >= r14) goto Lea
            ᛲᛲᛶᲁ r6 = r12.m2745(r9)
            if (r15 != r6) goto Le7
            goto Leb
        Le7:
            int r9 = r9 + 1
            goto Ldd
        Lea:
            r9 = r10
        Leb:
            if (r9 != r10) goto Lef
        Led:
            r6 = 0
            goto L107
        Lef:
            int r9 = r9 + r13
            int r6 = r7.getFirstVisiblePosition()
            int r9 = r9 - r6
            if (r9 < 0) goto Led
            int r6 = r7.getChildCount()
            if (r9 < r6) goto Lfe
            goto Led
        Lfe:
            android.view.View r6 = r7.getChildAt(r9)
            goto L107
        L103:
            r16 = r7
            r6 = 0
            r11 = 0
        L107:
            if (r6 == 0) goto L185
            r7 = 0
            defpackage.AbstractC1302.m2416(r2, r7)
            r7 = 0
            defpackage.AbstractC0605.m1400(r2, r7)
            int r2 = r4.size()
            int r2 = r2 + (-1)
            java.lang.Object r2 = r4.get(r2)
            ᲀᛵᲁᲀ r2 = (defpackage.C1681) r2
            ᲁᲀᛷᛲ r2 = r2.f7491
            ᛲᲈᲁᛸ r2 = r2.f6621
            r7 = 2
            int[] r7 = new int[r7]
            r2.getLocationOnScreen(r7)
            android.graphics.Rect r9 = new android.graphics.Rect
            r9.<init>()
            android.view.View r10 = r0.f6243
            r10.getWindowVisibleDisplayFrame(r9)
            int r10 = r0.f6244
            r12 = r16
            if (r10 != r12) goto L14b
            r17 = 0
            r7 = r7[r17]
            int r2 = r2.getWidth()
            int r2 = r2 + r7
            int r2 = r2 + r5
            int r7 = r9.right
            if (r2 <= r7) goto L149
            r2 = r17
        L147:
            r12 = 1
            goto L155
        L149:
            r2 = 1
            goto L147
        L14b:
            r17 = 0
            r2 = r7[r17]
            int r2 = r2 - r5
            if (r2 >= 0) goto L153
            goto L149
        L153:
            r2 = 0
            goto L147
        L155:
            if (r2 != r12) goto L159
            r7 = 1
            goto L15a
        L159:
            r7 = 0
        L15a:
            r0.f6244 = r2
            r8.f6631 = r6
            int r2 = r0.f6231
            r9 = 5
            r2 = r2 & r9
            if (r2 != r9) goto L170
            if (r7 == 0) goto L168
            r9 = 0
            goto L17a
        L168:
            int r2 = r6.getWidth()
            r9 = 0
            int r5 = 0 - r2
            goto L17a
        L170:
            r9 = 0
            if (r7 == 0) goto L178
            int r5 = r6.getWidth()
            goto L17a
        L178:
            int r5 = 0 - r5
        L17a:
            r8.f6613 = r5
            r12 = 1
            r8.f6622 = r12
            r8.f6615 = r12
            r8.m2730(r9)
            goto L1a3
        L185:
            boolean r2 = r0.f6232
            if (r2 == 0) goto L18d
            int r2 = r0.f6229
            r8.f6613 = r2
        L18d:
            boolean r2 = r0.f6230
            if (r2 == 0) goto L196
            int r2 = r0.f6237
            r8.m2730(r2)
        L196:
            android.graphics.Rect r2 = r0.f5294
            if (r2 == 0) goto L1a0
            android.graphics.Rect r7 = new android.graphics.Rect
            r7.<init>(r2)
            goto L1a1
        L1a0:
            r7 = 0
        L1a1:
            r8.f6636 = r7
        L1a3:
            ᲀᛵᲁᲀ r2 = new ᲀᛵᲁᲀ
            int r5 = r0.f6244
            r2.<init>(r8, r1, r5)
            r4.add(r2)
            r8.show()
            ᛲᲈᲁᛸ r2 = r8.f6621
            r2.setOnKeyListener(r0)
            if (r11 != 0) goto L1e1
            boolean r0 = r0.f6241
            if (r0 == 0) goto L1e1
            java.lang.CharSequence r0 = r1.f7566
            if (r0 == 0) goto L1e1
            r0 = 1712062482(0x660c0012, float:1.6528315E23)
            r7 = 0
            android.view.View r0 = r3.inflate(r0, r2, r7)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r3 = 16908310(0x1020016, float:2.387729E-38)
            android.view.View r3 = r0.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r0.setEnabled(r7)
            java.lang.CharSequence r1 = r1.f7566
            r3.setText(r1)
            r1 = 0
            r2.addHeaderView(r0, r1, r7)
            r8.show()
        L1e1:
            return
    }

    @Override // defpackage.AbstractC1173
    /* JADX INFO: renamed from: ᛴᛸᲀ */
    public final void mo2276(int r3) {
            r2 = this;
            int r0 = r2.f6239
            if (r0 == r3) goto L14
            r2.f6239 = r3
            android.view.View r0 = r2.f6247
            java.util.WeakHashMap r1 = defpackage.AbstractC0858.f3911
            int r0 = r0.getLayoutDirection()
            int r3 = android.view.Gravity.getAbsoluteGravity(r3, r0)
            r2.f6231 = r3
        L14:
            return
    }

    @Override // defpackage.AbstractC1173
    /* JADX INFO: renamed from: ᛴᛸᲈᲈ */
    public final void mo2277(int r2) {
            r1 = this;
            r0 = 1
            r1.f6230 = r0
            r1.f6237 = r2
            return
    }

    @Override // defpackage.AbstractC1173
    /* JADX INFO: renamed from: ᛶᛷᛱᲀ */
    public final void mo2278(android.view.View r3) {
            r2 = this;
            android.view.View r0 = r2.f6247
            if (r0 == r3) goto L14
            r2.f6247 = r3
            int r0 = r2.f6239
            java.util.WeakHashMap r1 = defpackage.AbstractC0858.f3911
            int r3 = r3.getLayoutDirection()
            int r3 = android.view.Gravity.getAbsoluteGravity(r0, r3)
            r2.f6231 = r3
        L14:
            return
    }

    @Override // defpackage.InterfaceC0242
    /* JADX INFO: renamed from: ᛷᛲᲇᲈ */
    public final void mo851(defpackage.InterfaceC1469 r1) {
            r0 = this;
            r0.f6248 = r1
            return
    }

    @Override // defpackage.InterfaceC2128
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final boolean mo2605() {
            r2 = this;
            java.util.ArrayList r2 = r2.f6238
            int r0 = r2.size()
            r1 = 0
            if (r0 <= 0) goto L1b
            java.lang.Object r2 = r2.get(r1)
            ᲀᛵᲁᲀ r2 = (defpackage.C1681) r2
            ᲁᲀᛷᛲ r2 = r2.f7491
            ᛳᲇᲇᛲ r2 = r2.f6630
            boolean r2 = r2.isShowing()
            if (r2 == 0) goto L1b
            r2 = 1
            return r2
        L1b:
            return r1
    }

    @Override // defpackage.InterfaceC0242
    /* JADX INFO: renamed from: ᛸᛵᛸᛷ */
    public final boolean mo853() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // defpackage.AbstractC1173
    /* JADX INFO: renamed from: ᲀᛳᲀᛵ */
    public final void mo2279(boolean r1) {
            r0 = this;
            r0.f6240 = r1
            return
    }

    @Override // defpackage.AbstractC1173
    /* JADX INFO: renamed from: ᲁᲈᲇᲁ */
    public final void mo2280(android.widget.PopupWindow.OnDismissListener r1) {
            r0 = this;
            r0.f6242 = r1
            return
    }

    @Override // defpackage.AbstractC1173
    /* JADX INFO: renamed from: ᲇᛱᛸᲇ */
    public final void mo2281(boolean r1) {
            r0 = this;
            r0.f6241 = r1
            return
    }

    @Override // defpackage.InterfaceC0242
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public final void mo854(defpackage.MenuC1701 r8, boolean r9) {
            r7 = this;
            java.util.ArrayList r0 = r7.f6238
            int r1 = r0.size()
            r2 = 0
            r3 = r2
        L8:
            if (r3 >= r1) goto L18
            java.lang.Object r4 = r0.get(r3)
            ᲀᛵᲁᲀ r4 = (defpackage.C1681) r4
            ᲀᛷᛱᲇ r4 = r4.f7492
            if (r8 != r4) goto L15
            goto L19
        L15:
            int r3 = r3 + 1
            goto L8
        L18:
            r3 = -1
        L19:
            if (r3 >= 0) goto L1d
            goto La9
        L1d:
            int r1 = r3 + 1
            int r4 = r0.size()
            if (r1 >= r4) goto L30
            java.lang.Object r1 = r0.get(r1)
            ᲀᛵᲁᲀ r1 = (defpackage.C1681) r1
            ᲀᛷᛱᲇ r1 = r1.f7492
            r1.m3082(r2)
        L30:
            java.lang.Object r1 = r0.remove(r3)
            ᲀᛵᲁᲀ r1 = (defpackage.C1681) r1
            ᲀᛷᛱᲇ r3 = r1.f7492
            ᲁᲀᛷᛲ r1 = r1.f7491
            ᛳᲇᲇᛲ r4 = r1.f6630
            r3.m3086(r7)
            boolean r3 = r7.f6233
            r5 = 0
            if (r3 == 0) goto L4a
            defpackage.AbstractC0605.m1401(r4, r5)
            r4.setAnimationStyle(r2)
        L4a:
            r1.dismiss()
            int r1 = r0.size()
            r3 = 1
            if (r1 <= 0) goto L61
            int r4 = r1 + (-1)
            java.lang.Object r4 = r0.get(r4)
            ᲀᛵᲁᲀ r4 = (defpackage.C1681) r4
            int r4 = r4.f7490
            r7.f6244 = r4
            goto L70
        L61:
            android.view.View r4 = r7.f6247
            java.util.WeakHashMap r6 = defpackage.AbstractC0858.f3911
            int r4 = r4.getLayoutDirection()
            if (r4 != r3) goto L6d
            r4 = r2
            goto L6e
        L6d:
            r4 = r3
        L6e:
            r7.f6244 = r4
        L70:
            if (r1 != 0) goto L9c
            r7.dismiss()
            ᛸᛴᛲᛶ r9 = r7.f6248
            if (r9 == 0) goto L7c
            r9.mo2547(r8, r3)
        L7c:
            android.view.ViewTreeObserver r8 = r7.f6245
            if (r8 == 0) goto L8f
            boolean r8 = r8.isAlive()
            if (r8 == 0) goto L8d
            android.view.ViewTreeObserver r8 = r7.f6245
            ᛴᲈᛶᛳ r9 = r7.f6226
            r8.removeGlobalOnLayoutListener(r9)
        L8d:
            r7.f6245 = r5
        L8f:
            android.view.View r8 = r7.f6243
            ᛵᛶᛵᛷ r9 = r7.f6227
            r8.removeOnAttachStateChangeListener(r9)
            android.widget.PopupWindow$OnDismissListener r7 = r7.f6242
            r7.onDismiss()
            return
        L9c:
            if (r9 == 0) goto La9
            java.lang.Object r7 = r0.get(r2)
            ᲀᛵᲁᲀ r7 = (defpackage.C1681) r7
            ᲀᛷᛱᲇ r7 = r7.f7492
            r7.m3082(r2)
        La9:
            return
    }

    @Override // defpackage.InterfaceC0242
    /* JADX INFO: renamed from: ᲇᛸᲁᛱ */
    public final void mo855() {
            r2 = this;
            java.util.ArrayList r2 = r2.f6238
            java.util.Iterator r2 = r2.iterator()
        L6:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L2d
            java.lang.Object r0 = r2.next()
            ᲀᛵᲁᲀ r0 = (defpackage.C1681) r0
            ᲁᲀᛷᛲ r0 = r0.f7491
            ᛲᲈᲁᛸ r0 = r0.f6621
            android.widget.ListAdapter r0 = r0.getAdapter()
            boolean r1 = r0 instanceof android.widget.HeaderViewListAdapter
            if (r1 == 0) goto L27
            android.widget.HeaderViewListAdapter r0 = (android.widget.HeaderViewListAdapter) r0
            android.widget.ListAdapter r0 = r0.getWrappedAdapter()
            ᛸᛶᛶᲀ r0 = (defpackage.C1510) r0
            goto L29
        L27:
            ᛸᛶᛶᲀ r0 = (defpackage.C1510) r0
        L29:
            r0.notifyDataSetChanged()
            goto L6
        L2d:
            return
    }

    @Override // defpackage.AbstractC1173
    /* JADX INFO: renamed from: ᲇᲀᛲᛱ */
    public final void mo2282(int r2) {
            r1 = this;
            r0 = 1
            r1.f6232 = r0
            r1.f6229 = r2
            return
    }
}
