package defpackage;

/* JADX INFO: renamed from: ᛸᛶᛵᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class DialogC1507 extends android.app.Dialog implements android.content.DialogInterface, defpackage.InterfaceC0832, defpackage.InterfaceC0770, defpackage.InterfaceC1734, defpackage.InterfaceC1386 {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public final defpackage.C1311 f6660;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final androidx.activity.C0000 f6661;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final defpackage.C0542 f6662;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public androidx.lifecycle.C0005 f6663;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public defpackage.LayoutInflaterFactory2C1411 f6664;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final defpackage.C0120 f6665;

    public DialogC1507(android.view.ContextThemeWrapper r6, int r7) {
            r5 = this;
            int r7 = m2736(r6, r7)
            r0 = 1
            r1 = 1711538430(0x660400fe, float:1.5584267E23)
            if (r7 != 0) goto L19
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            android.content.res.Resources$Theme r3 = r6.getTheme()
            r3.resolveAttribute(r1, r2, r0)
            int r2 = r2.resourceId
            goto L1a
        L19:
            r2 = r7
        L1a:
            r5.<init>(r6, r2)
            ᛳᲀᛴᲈ r2 = new ᛳᲀᛴᲈ
            r2.<init>(r5)
            r5.f6662 = r2
            androidx.activity.ᛷᲁᛳᛳ r2 = new androidx.activity.ᛷᲁᛳᛳ
            ᲁᲈᛳ r3 = new ᲁᲈᛳ
            r4 = 2
            r3.<init>(r4, r5)
            r2.<init>(r3)
            r5.f6661 = r2
            ᛱᛶᲈᛵ r2 = new ᛱᛶᲈᛵ
            r2.<init>(r5)
            r5.f6665 = r2
            ᲈᲇᲀ r2 = r5.m2739()
            if (r7 != 0) goto L4c
            android.util.TypedValue r7 = new android.util.TypedValue
            r7.<init>()
            android.content.res.Resources$Theme r6 = r6.getTheme()
            r6.resolveAttribute(r1, r7, r0)
            int r7 = r7.resourceId
        L4c:
            r6 = r2
            ᛸᛱᛱᛲ r6 = (defpackage.LayoutInflaterFactory2C1411) r6
            r6.f6146 = r7
            r2.mo2592()
            ᛷᛷᛳᛶ r6 = new ᛷᛷᛳᛶ
            android.content.Context r7 = r5.getContext()
            android.view.Window r0 = r5.getWindow()
            r6.<init>(r7, r5, r0)
            r5.f6660 = r6
            return
    }

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public static int m2736(android.content.Context r2, int r3) {
            int r0 = r3 >>> 24
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = 1
            if (r0 < r1) goto L8
            return r3
        L8:
            android.util.TypedValue r3 = new android.util.TypedValue
            r3.<init>()
            android.content.res.Resources$Theme r2 = r2.getTheme()
            r0 = 1711538217(0x66040029, float:1.5583883E23)
            r2.resolveAttribute(r0, r3, r1)
            int r2 = r3.resourceId
            return r2
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public static final void m2737(defpackage.DialogC1507 r0) {
            super.onBackPressed()
            return
    }

    @Override // android.app.Dialog
    public final void addContentView(android.view.View r3, android.view.ViewGroup.LayoutParams r4) {
            r2 = this;
            ᲈᲇᲀ r2 = r2.m2739()
            ᛸᛱᛱᛲ r2 = (defpackage.LayoutInflaterFactory2C1411) r2
            r2.m2590()
            android.view.ViewGroup r0 = r2.f6152
            r1 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = r0.findViewById(r1)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r0.addView(r3, r4)
            ᛱᛴᛶᛱ r3 = r2.f6147
            android.view.Window r2 = r2.f6165
            android.view.Window$Callback r2 = r2.getCallback()
            r3.m533(r2)
            return
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
            r3 = this;
            super.dismiss()
            ᲈᲇᲀ r3 = r3.m2739()
            ᛸᛱᛱᛲ r3 = (defpackage.LayoutInflaterFactory2C1411) r3
            java.lang.Object r0 = r3.f6135
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L1a
            java.lang.Object r0 = defpackage.AbstractC2354.f10162
            monitor-enter(r0)
            defpackage.AbstractC2354.m3851(r3)     // Catch: java.lang.Throwable -> L17
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            goto L1a
        L17:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            throw r3
        L1a:
            boolean r0 = r3.f6173
            if (r0 == 0) goto L29
            android.view.Window r0 = r3.f6165
            android.view.View r0 = r0.getDecorView()
            ᛴᛷᛸᲀ r1 = r3.f6138
            r0.removeCallbacks(r1)
        L29:
            r0 = 1
            r3.f6157 = r0
            int r0 = r3.f6167
            r1 = -100
            if (r0 == r1) goto L56
            java.lang.Object r0 = r3.f6135
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L56
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L56
            ᛸᲇᛲᛶ r0 = defpackage.LayoutInflaterFactory2C1411.f6131
            java.lang.Object r1 = r3.f6135
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.f6167
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L65
        L56:
            ᛸᲇᛲᛶ r0 = defpackage.LayoutInflaterFactory2C1411.f6131
            java.lang.Object r1 = r3.f6135
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L65:
            ᛵᲈᛲᲇ r0 = r3.f6166
            if (r0 == 0) goto L6c
            r0.m2354()
        L6c:
            ᛵᲈᛲᲇ r3 = r3.f6145
            if (r3 == 0) goto L73
            r3.m2354()
        L73:
            return
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(android.view.KeyEvent r2) {
            r1 = this;
            android.view.Window r0 = r1.getWindow()
            r0.getDecorView()
            ᛱᛶᲈᛵ r1 = r1.f6665
            if (r1 != 0) goto Ld
            r1 = 0
            return r1
        Ld:
            ᛸᛶᛵᲀ r1 = r1.f1024
            boolean r1 = super.dispatchKeyEvent(r2)
            return r1
    }

    @Override // android.app.Dialog
    public final android.view.View findViewById(int r1) {
            r0 = this;
            ᲈᲇᲀ r0 = r0.m2739()
            ᛸᛱᛱᛲ r0 = (defpackage.LayoutInflaterFactory2C1411) r0
            r0.m2590()
            android.view.Window r0 = r0.f6165
            android.view.View r0 = r0.findViewById(r1)
            return r0
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
            r1 = this;
            ᲈᲇᲀ r1 = r1.m2739()
            ᛸᛱᛱᛲ r1 = (defpackage.LayoutInflaterFactory2C1411) r1
            ᲇᛲᲇᲁ r0 = r1.f6179
            if (r0 == 0) goto L16
            r1.m2584()
            ᲇᛲᲇᲁ r0 = r1.f6179
            r0.getClass()
            r0 = 0
            r1.m2587(r0)
        L16:
            return
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
            r0 = this;
            androidx.activity.ᛷᲁᛳᛳ r0 = r0.f6661
            r0.m9()
            return
    }

    @Override // android.app.Dialog
    public final void onCreate(android.os.Bundle r17) {
            r16 = this;
            r16.m2742(r17)
            r0 = r16
            ᛷᛷᛳᛶ r0 = r0.f6660
            int r1 = r0.f5799
            ᛸᛶᛵᲀ r2 = r0.f5801
            r2.setContentView(r1)
            android.content.Context r1 = r0.f5795
            android.view.Window r2 = r0.f5794
            r3 = 1711866596(0x660902e4, float:1.6175438E23)
            android.view.View r3 = r2.findViewById(r3)
            r4 = 1711866904(0x66090418, float:1.6175993E23)
            android.view.View r5 = r3.findViewById(r4)
            r6 = 1711866180(0x66090144, float:1.6174689E23)
            android.view.View r7 = r3.findViewById(r6)
            r8 = 1711866105(0x660900f9, float:1.6174554E23)
            android.view.View r9 = r3.findViewById(r8)
            r10 = 1711866198(0x66090156, float:1.6174721E23)
            android.view.View r3 = r3.findViewById(r10)
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            r10 = 131072(0x20000, float:1.83671E-40)
            r2.setFlags(r10, r10)
            r10 = 8
            r3.setVisibility(r10)
            android.view.View r4 = r3.findViewById(r4)
            android.view.View r6 = r3.findViewById(r6)
            android.view.View r8 = r3.findViewById(r8)
            android.view.ViewGroup r4 = defpackage.C1311.m2439(r4, r5)
            android.view.ViewGroup r5 = defpackage.C1311.m2439(r6, r7)
            android.view.ViewGroup r6 = defpackage.C1311.m2439(r8, r9)
            r7 = 1711866703(0x6609034f, float:1.6175631E23)
            android.view.View r7 = r2.findViewById(r7)
            androidx.core.widget.NestedScrollView r7 = (androidx.core.widget.NestedScrollView) r7
            r0.f5785 = r7
            r8 = 0
            r7.setFocusable(r8)
            androidx.core.widget.NestedScrollView r7 = r0.f5785
            r7.setNestedScrollingEnabled(r8)
            r7 = 16908299(0x102000b, float:2.387726E-38)
            android.view.View r7 = r5.findViewById(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r0.f5791 = r7
            r9 = -1
            if (r7 != 0) goto L7c
            goto La9
        L7c:
            r7.setVisibility(r10)
            androidx.core.widget.NestedScrollView r7 = r0.f5785
            android.widget.TextView r11 = r0.f5791
            r7.removeView(r11)
            androidx.appcompat.app.AlertController$RecycleListView r7 = r0.f5790
            if (r7 == 0) goto La6
            androidx.core.widget.NestedScrollView r7 = r0.f5785
            android.view.ViewParent r7 = r7.getParent()
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            androidx.core.widget.NestedScrollView r11 = r0.f5785
            int r11 = r7.indexOfChild(r11)
            r7.removeViewAt(r11)
            androidx.appcompat.app.AlertController$RecycleListView r12 = r0.f5790
            android.view.ViewGroup$LayoutParams r13 = new android.view.ViewGroup$LayoutParams
            r13.<init>(r9, r9)
            r7.addView(r12, r11, r13)
            goto La9
        La6:
            r5.setVisibility(r10)
        La9:
            r7 = 16908313(0x1020019, float:2.38773E-38)
            android.view.View r7 = r6.findViewById(r7)
            android.widget.Button r7 = (android.widget.Button) r7
            r0.f5802 = r7
            ᛲᛶᛷᛲ r11 = r0.f5798
            r7.setOnClickListener(r11)
            r7 = 0
            boolean r12 = android.text.TextUtils.isEmpty(r7)
            android.widget.Button r13 = r0.f5802
            r14 = 1
            if (r12 == 0) goto Lc8
            r13.setVisibility(r10)
            r12 = r8
            goto Ld1
        Lc8:
            r13.setText(r7)
            android.widget.Button r12 = r0.f5802
            r12.setVisibility(r8)
            r12 = r14
        Ld1:
            r13 = 16908314(0x102001a, float:2.3877302E-38)
            android.view.View r13 = r6.findViewById(r13)
            android.widget.Button r13 = (android.widget.Button) r13
            r0.f5804 = r13
            r13.setOnClickListener(r11)
            boolean r13 = android.text.TextUtils.isEmpty(r7)
            android.widget.Button r15 = r0.f5804
            if (r13 == 0) goto Leb
            r15.setVisibility(r10)
            goto Lf5
        Leb:
            r15.setText(r7)
            android.widget.Button r13 = r0.f5804
            r13.setVisibility(r8)
            r12 = r12 | 2
        Lf5:
            r13 = 16908315(0x102001b, float:2.3877305E-38)
            android.view.View r13 = r6.findViewById(r13)
            android.widget.Button r13 = (android.widget.Button) r13
            r0.f5782 = r13
            r13.setOnClickListener(r11)
            boolean r11 = android.text.TextUtils.isEmpty(r7)
            android.widget.Button r13 = r0.f5782
            if (r11 == 0) goto L10f
            r13.setVisibility(r10)
            goto L119
        L10f:
            r13.setText(r7)
            android.widget.Button r11 = r0.f5782
            r11.setVisibility(r8)
            r12 = r12 | 4
        L119:
            android.util.TypedValue r11 = new android.util.TypedValue
            r11.<init>()
            android.content.res.Resources$Theme r1 = r1.getTheme()
            r13 = 1711538215(0x66040027, float:1.558388E23)
            r1.resolveAttribute(r13, r11, r14)
            int r1 = r11.data
            r11 = 2
            if (r1 == 0) goto L165
            r1 = 1056964608(0x3f000000, float:0.5)
            if (r12 != r14) goto L141
            android.widget.Button r13 = r0.f5802
            android.view.ViewGroup$LayoutParams r15 = r13.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r15 = (android.widget.LinearLayout.LayoutParams) r15
            r15.gravity = r14
            r15.weight = r1
            r13.setLayoutParams(r15)
            goto L165
        L141:
            if (r12 != r11) goto L153
            android.widget.Button r13 = r0.f5804
            android.view.ViewGroup$LayoutParams r15 = r13.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r15 = (android.widget.LinearLayout.LayoutParams) r15
            r15.gravity = r14
            r15.weight = r1
            r13.setLayoutParams(r15)
            goto L165
        L153:
            r13 = 4
            if (r12 != r13) goto L165
            android.widget.Button r13 = r0.f5782
            android.view.ViewGroup$LayoutParams r15 = r13.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r15 = (android.widget.LinearLayout.LayoutParams) r15
            r15.gravity = r14
            r15.weight = r1
            r13.setLayoutParams(r15)
        L165:
            if (r12 == 0) goto L168
            goto L16b
        L168:
            r6.setVisibility(r10)
        L16b:
            android.view.View r1 = r0.f5797
            r12 = 1711866901(0x66090415, float:1.6175988E23)
            if (r1 == 0) goto L185
            android.view.ViewGroup$LayoutParams r1 = new android.view.ViewGroup$LayoutParams
            r13 = -2
            r1.<init>(r9, r13)
            android.view.View r13 = r0.f5797
            r4.addView(r13, r8, r1)
            android.view.View r1 = r2.findViewById(r12)
            r1.setVisibility(r10)
            goto L1e8
        L185:
            r1 = 16908294(0x1020006, float:2.3877246E-38)
            android.view.View r1 = r2.findViewById(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r0.f5783 = r1
            java.lang.CharSequence r1 = r0.f5792
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L1d9
            boolean r1 = r0.f5786
            if (r1 == 0) goto L1d9
            r1 = 1711865925(0x66090045, float:1.617423E23)
            android.view.View r1 = r2.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.f5784 = r1
            java.lang.CharSequence r12 = r0.f5792
            r1.setText(r12)
            android.graphics.drawable.Drawable r1 = r0.f5796
            if (r1 == 0) goto L1b6
            android.widget.ImageView r12 = r0.f5783
            r12.setImageDrawable(r1)
            goto L1e8
        L1b6:
            android.widget.TextView r1 = r0.f5784
            android.widget.ImageView r12 = r0.f5783
            int r12 = r12.getPaddingLeft()
            android.widget.ImageView r13 = r0.f5783
            int r13 = r13.getPaddingTop()
            android.widget.ImageView r15 = r0.f5783
            int r15 = r15.getPaddingRight()
            android.widget.ImageView r7 = r0.f5783
            int r7 = r7.getPaddingBottom()
            r1.setPadding(r12, r13, r15, r7)
            android.widget.ImageView r1 = r0.f5783
            r1.setVisibility(r10)
            goto L1e8
        L1d9:
            android.view.View r1 = r2.findViewById(r12)
            r1.setVisibility(r10)
            android.widget.ImageView r1 = r0.f5783
            r1.setVisibility(r10)
            r4.setVisibility(r10)
        L1e8:
            int r1 = r3.getVisibility()
            if (r1 == r10) goto L1f0
            r1 = r14
            goto L1f1
        L1f0:
            r1 = r8
        L1f1:
            if (r4 == 0) goto L1fb
            int r3 = r4.getVisibility()
            if (r3 == r10) goto L1fb
            r3 = r14
            goto L1fc
        L1fb:
            r3 = r8
        L1fc:
            int r6 = r6.getVisibility()
            if (r6 == r10) goto L204
            r6 = r14
            goto L205
        L204:
            r6 = r8
        L205:
            if (r6 != 0) goto L213
            r7 = 1711866875(0x660903fb, float:1.617594E23)
            android.view.View r7 = r5.findViewById(r7)
            if (r7 == 0) goto L213
            r7.setVisibility(r8)
        L213:
            if (r3 == 0) goto L22f
            androidx.core.widget.NestedScrollView r7 = r0.f5785
            if (r7 == 0) goto L21c
            r7.setClipToPadding(r14)
        L21c:
            androidx.appcompat.app.AlertController$RecycleListView r7 = r0.f5790
            if (r7 == 0) goto L228
            r7 = 1711866899(0x66090413, float:1.6175984E23)
            android.view.View r7 = r4.findViewById(r7)
            goto L229
        L228:
            r7 = 0
        L229:
            if (r7 == 0) goto L23b
            r7.setVisibility(r8)
            goto L23b
        L22f:
            r4 = 1711866876(0x660903fc, float:1.6175943E23)
            android.view.View r4 = r5.findViewById(r4)
            if (r4 == 0) goto L23b
            r4.setVisibility(r8)
        L23b:
            androidx.appcompat.app.AlertController$RecycleListView r4 = r0.f5790
            if (r4 == 0) goto L260
            if (r6 == 0) goto L243
            if (r3 != 0) goto L260
        L243:
            int r7 = r4.getPaddingLeft()
            if (r3 == 0) goto L24e
            int r10 = r4.getPaddingTop()
            goto L250
        L24e:
            int r10 = r4.f15
        L250:
            int r12 = r4.getPaddingRight()
            if (r6 == 0) goto L25b
            int r13 = r4.getPaddingBottom()
            goto L25d
        L25b:
            int r13 = r4.f14
        L25d:
            r4.setPadding(r7, r10, r12, r13)
        L260:
            if (r1 != 0) goto L28d
            androidx.appcompat.app.AlertController$RecycleListView r1 = r0.f5790
            if (r1 == 0) goto L267
            goto L269
        L267:
            androidx.core.widget.NestedScrollView r1 = r0.f5785
        L269:
            if (r1 == 0) goto L28d
            if (r6 == 0) goto L26e
            r8 = r11
        L26e:
            r3 = r3 | r8
            r4 = 1711866702(0x6609034e, float:1.617563E23)
            android.view.View r4 = r2.findViewById(r4)
            r6 = 1711866701(0x6609034d, float:1.6175627E23)
            android.view.View r2 = r2.findViewById(r6)
            java.util.WeakHashMap r6 = defpackage.AbstractC0858.f3911
            r6 = 3
            r1.setScrollIndicators(r3, r6)
            if (r4 == 0) goto L288
            r5.removeView(r4)
        L288:
            if (r2 == 0) goto L28d
            r5.removeView(r2)
        L28d:
            androidx.appcompat.app.AlertController$RecycleListView r1 = r0.f5790
            if (r1 == 0) goto L2a2
            android.widget.ListAdapter r2 = r0.f5788
            if (r2 == 0) goto L2a2
            r1.setAdapter(r2)
            int r0 = r0.f5803
            if (r0 <= r9) goto L2a2
            r1.setItemChecked(r0, r14)
            r1.setSelection(r0)
        L2a2:
            return
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int r2, android.view.KeyEvent r3) {
            r1 = this;
            ᛷᛷᛳᛶ r0 = r1.f6660
            androidx.core.widget.NestedScrollView r0 = r0.f5785
            if (r0 == 0) goto Le
            boolean r0 = r0.m88(r3)
            if (r0 == 0) goto Le
            r1 = 1
            return r1
        Le:
            boolean r1 = super.onKeyDown(r2, r3)
            return r1
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int r2, android.view.KeyEvent r3) {
            r1 = this;
            ᛷᛷᛳᛶ r0 = r1.f6660
            androidx.core.widget.NestedScrollView r0 = r0.f5785
            if (r0 == 0) goto Le
            boolean r0 = r0.m88(r3)
            if (r0 == 0) goto Le
            r1 = 1
            return r1
        Le:
            boolean r1 = super.onKeyUp(r2, r3)
            return r1
    }

    @Override // android.app.Dialog
    public final android.os.Bundle onSaveInstanceState() {
            r4 = this;
            android.os.Bundle r0 = super.onSaveInstanceState()
            ᛳᲀᛴᲈ r4 = r4.f6662
            java.lang.Object r4 = r4.f2672
            ᛶᛲᛱᛸ r4 = (defpackage.C1020) r4
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            android.os.Parcelable r2 = r4.f4551
            android.os.Bundle r2 = (android.os.Bundle) r2
            if (r2 == 0) goto L18
            r1.putAll(r2)
        L18:
            java.lang.Object r4 = r4.f4553
            ᛸᛱᛴᲀ r4 = (defpackage.C1418) r4
            ᛱᲈᛷᛷ r2 = new ᛱᲈᛷᛷ
            r2.<init>(r4)
            java.util.WeakHashMap r4 = r4.f6207
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r4.put(r2, r3)
        L28:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L48
            java.lang.Object r4 = r2.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r3 = r4.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r4.getValue()
            ᲁᛶᛵᛵ r4 = (defpackage.InterfaceC1872) r4
            android.os.Bundle r4 = r4.mo2688()
            r1.putBundle(r3, r4)
            goto L28
        L48:
            boolean r4 = r1.isEmpty()
            if (r4 != 0) goto L53
            java.lang.String r4 = "androidx.lifecycle.BundlableSavedStateRegistry.key"
            r0.putBundle(r4, r1)
        L53:
            return r0
    }

    @Override // android.app.Dialog
    public final void onStart() {
            r1 = this;
            super.onStart()
            androidx.lifecycle.ᛷᲁᛳᛳ r0 = r1.f6663
            if (r0 != 0) goto Le
            androidx.lifecycle.ᛷᲁᛳᛳ r0 = new androidx.lifecycle.ᛷᲁᛳᛳ
            r0.<init>(r1)
            r1.f6663 = r0
        Le:
            ᲈᛶᛱᛲ r1 = defpackage.EnumC2255.ON_RESUME
            r0.m108(r1)
            return
    }

    @Override // android.app.Dialog
    public final void onStop() {
            r1 = this;
            r1.m2738()
            ᲈᲇᲀ r1 = r1.m2739()
            ᛸᛱᛱᛲ r1 = (defpackage.LayoutInflaterFactory2C1411) r1
            r1.m2584()
            ᲇᛲᲇᲁ r1 = r1.f6179
            if (r1 == 0) goto L1a
            r0 = 0
            r1.f8675 = r0
            ᲀᲈᛶᲀ r1 = r1.f8677
            if (r1 == 0) goto L1a
            r1.m3181()
        L1a:
            return
    }

    @Override // android.app.Dialog
    public final void setContentView(int r1) {
            r0 = this;
            ᲈᲇᲀ r0 = r0.m2739()
            r0.mo2593(r1)
            return
    }

    @Override // android.app.Dialog
    public final void setContentView(android.view.View r1) {
            r0 = this;
            ᲈᲇᲀ r0 = r0.m2739()
            r0.mo2596(r1)
            return
    }

    @Override // android.app.Dialog
    public final void setContentView(android.view.View r1, android.view.ViewGroup.LayoutParams r2) {
            r0 = this;
            ᲈᲇᲀ r0 = r0.m2739()
            r0.mo2572(r1, r2)
            return
    }

    @Override // android.app.Dialog
    public final void setTitle(int r2) {
            r1 = this;
            super.setTitle(r2)
            ᲈᲇᲀ r0 = r1.m2739()
            android.content.Context r1 = r1.getContext()
            java.lang.String r1 = r1.getString(r2)
            r0.mo2575(r1)
            return
    }

    @Override // android.app.Dialog
    public final void setTitle(java.lang.CharSequence r1) {
            r0 = this;
            r0.m2740(r1)
            ᛷᛷᛳᛶ r0 = r0.f6660
            r0.f5792 = r1
            android.widget.TextView r0 = r0.f5784
            if (r0 == 0) goto Le
            r0.setText(r1)
        Le:
            return
    }

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public final void m2738() {
            r2 = this;
            androidx.lifecycle.ᛷᲁᛳᛳ r0 = r2.f6663
            if (r0 != 0) goto Lb
            androidx.lifecycle.ᛷᲁᛳᛳ r0 = new androidx.lifecycle.ᛷᲁᛳᛳ
            r0.<init>(r2)
            r2.f6663 = r0
        Lb:
            ᲈᛶᛱᛲ r1 = defpackage.EnumC2255.ON_DESTROY
            r0.m108(r1)
            r0 = 0
            r2.f6663 = r0
            super.onStop()
            return
    }

    @Override // defpackage.InterfaceC0770
    /* JADX INFO: renamed from: ᛵᛱᛵᛲ */
    public final androidx.lifecycle.C0005 mo0() {
            r1 = this;
            androidx.lifecycle.ᛷᲁᛳᛳ r0 = r1.f6663
            if (r0 != 0) goto Lb
            androidx.lifecycle.ᛷᲁᛳᛳ r0 = new androidx.lifecycle.ᛷᲁᛳᛳ
            r0.<init>(r1)
            r1.f6663 = r0
        Lb:
            return r0
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final defpackage.AbstractC2354 m2739() {
            r3 = this;
            ᛸᛱᛱᛲ r0 = r3.f6664
            if (r0 != 0) goto L15
            ᛳᛴᛶᛲ r0 = defpackage.AbstractC2354.f10161
            ᛸᛱᛱᛲ r0 = new ᛸᛱᛱᛲ
            android.content.Context r1 = r3.getContext()
            android.view.Window r2 = r3.getWindow()
            r0.<init>(r1, r2, r3, r3)
            r3.f6664 = r0
        L15:
            return r0
    }

    @Override // defpackage.InterfaceC1734
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    public final androidx.activity.C0000 mo3() {
            r0 = this;
            androidx.activity.ᛷᲁᛳᛳ r0 = r0.f6661
            return r0
    }

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public final void m2740(java.lang.CharSequence r1) {
            r0 = this;
            super.setTitle(r1)
            ᲈᲇᲀ r0 = r0.m2739()
            r0.mo2575(r1)
            return
    }

    @Override // defpackage.InterfaceC1386
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public final defpackage.C1020 mo4() {
            r0 = this;
            ᛳᲀᛴᲈ r0 = r0.f6662
            java.lang.Object r0 = r0.f2672
            ᛶᛲᛱᛸ r0 = (defpackage.C1020) r0
            return r0
    }

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final void m2741(android.os.Bundle r3) {
            r2 = this;
            super.onCreate(r3)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto L14
            android.window.OnBackInvokedDispatcher r0 = defpackage.AbstractC1306.m2435(r2)
            androidx.activity.ᛷᲁᛳᛳ r1 = r2.f6661
            r1.f8 = r0
            r1.m7()
        L14:
            ᛳᲀᛴᲈ r0 = r2.f6662
            r0.m1333(r3)
            androidx.lifecycle.ᛷᲁᛳᛳ r3 = r2.f6663
            if (r3 != 0) goto L24
            androidx.lifecycle.ᛷᲁᛳᛳ r3 = new androidx.lifecycle.ᛷᲁᛳᛳ
            r3.<init>(r2)
            r2.f6663 = r3
        L24:
            ᲈᛶᛱᛲ r2 = defpackage.EnumC2255.ON_CREATE
            r3.m108(r2)
            return
    }

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final void m2742(android.os.Bundle r4) {
            r3 = this;
            ᲈᲇᲀ r0 = r3.m2739()
            ᛸᛱᛱᛲ r0 = (defpackage.LayoutInflaterFactory2C1411) r0
            android.content.Context r1 = r0.f6153
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r1)
            android.view.LayoutInflater$Factory r2 = r1.getFactory()
            if (r2 != 0) goto L16
            r1.setFactory2(r0)
            goto L25
        L16:
            android.view.LayoutInflater$Factory2 r0 = r1.getFactory2()
            boolean r0 = r0 instanceof defpackage.LayoutInflaterFactory2C1411
            if (r0 != 0) goto L25
            java.lang.String r0 = "AppCompatDelegate"
            java.lang.String r1 = "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's"
            android.util.Log.i(r0, r1)
        L25:
            r3.m2741(r4)
            ᲈᲇᲀ r3 = r3.m2739()
            r3.mo2592()
            return
    }
}
