package p000;

/* JADX INFO: renamed from: w */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class DialogInterfaceC0929w extends p000.DialogC0989xm implements android.content.DialogInterface, p000.InterfaceC0674p4 {

    /* JADX INFO: renamed from: θ */
    public androidx.appcompat.app.LayoutInflaterFactory2C0026 f11499;

    /* JADX INFO: renamed from: ι */
    public final p000.C0347h5 f11500;

    /* JADX INFO: renamed from: κ */
    public final p000.C0854u f11501;

    public DialogInterfaceC0929w(android.view.ContextThemeWrapper r5, int r6) {
            r4 = this;
            int r6 = m6293(r5, r6)
            r0 = 1
            r1 = 2130968685(0x7f04006d, float:1.754603E38)
            if (r6 != 0) goto L19
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            android.content.res.Resources$Theme r3 = r5.getTheme()
            r3.resolveAttribute(r1, r2, r0)
            int r2 = r2.resourceId
            goto L1a
        L19:
            r2 = r6
        L1a:
            r4.<init>(r5, r2)
            h5 r2 = new h5
            r2.<init>(r4)
            r4.f11500 = r2
            androidx.appcompat.app.α r2 = r4.m6294()
            if (r6 != 0) goto L38
            android.util.TypedValue r6 = new android.util.TypedValue
            r6.<init>()
            android.content.res.Resources$Theme r5 = r5.getTheme()
            r5.resolveAttribute(r1, r6, r0)
            int r6 = r6.resourceId
        L38:
            r5 = r2
            androidx.appcompat.app.β r5 = (androidx.appcompat.app.LayoutInflaterFactory2C0026) r5
            r5.f409 = r6
            r2.mo201()
            u r5 = new u
            android.content.Context r6 = r4.getContext()
            android.view.Window r0 = r4.getWindow()
            r5.<init>(r6, r4, r0)
            r4.f11501 = r5
            return
    }

    /* JADX INFO: renamed from: η */
    public static int m6293(android.content.Context r2, int r3) {
            int r0 = r3 >>> 24
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = 1
            if (r0 < r1) goto L8
            return r3
        L8:
            android.util.TypedValue r3 = new android.util.TypedValue
            r3.<init>()
            android.content.res.Resources$Theme r2 = r2.getTheme()
            r0 = 2130968617(0x7f040029, float:1.7545893E38)
            r2.resolveAttribute(r0, r3, r1)
            int r2 = r3.resourceId
            return r2
    }

    @Override // p000.DialogC0989xm, android.app.Dialog
    public final void addContentView(android.view.View r3, android.view.ViewGroup.LayoutParams r4) {
            r2 = this;
            r2.m6683()
            androidx.appcompat.app.α r2 = r2.m6294()
            androidx.appcompat.app.β r2 = (androidx.appcompat.app.LayoutInflaterFactory2C0026) r2
            r2.m229()
            android.view.ViewGroup r0 = r2.f379
            r1 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = r0.findViewById(r1)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r0.addView(r3, r4)
            d5 r3 = r2.f400
            android.view.Window r2 = r2.f399
            android.view.Window$Callback r2 = r2.getCallback()
            r3.m1649(r2)
            return
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
            r0 = this;
            super.dismiss()
            androidx.appcompat.app.α r0 = r0.m6294()
            r0.mo202()
            return
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(android.view.KeyEvent r2) {
            r1 = this;
            android.view.Window r0 = r1.getWindow()
            r0.getDecorView()
            h5 r1 = r1.f11500
            if (r1 != 0) goto Ld
            r1 = 0
            return r1
        Ld:
            w r1 = r1.f4574
            boolean r1 = super.dispatchKeyEvent(r2)
            return r1
    }

    @Override // android.app.Dialog
    public final android.view.View findViewById(int r1) {
            r0 = this;
            androidx.appcompat.app.α r0 = r0.m6294()
            androidx.appcompat.app.β r0 = (androidx.appcompat.app.LayoutInflaterFactory2C0026) r0
            r0.m229()
            android.view.Window r0 = r0.f399
            android.view.View r0 = r0.findViewById(r1)
            return r0
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
            r1 = this;
            androidx.appcompat.app.α r1 = r1.m6294()
            androidx.appcompat.app.β r1 = (androidx.appcompat.app.LayoutInflaterFactory2C0026) r1
            tb2 r0 = r1.f402
            if (r0 == 0) goto L16
            r1.m211()
            tb2 r0 = r1.f402
            r0.getClass()
            r0 = 0
            r1.m212(r0)
        L16:
            return
    }

    @Override // p000.DialogC0989xm, android.app.Dialog
    public final void onCreate(android.os.Bundle r17) {
            r16 = this;
            r16.m6295(r17)
            r0 = r16
            u r0 = r0.f11501
            int r1 = r0.f10536
            w r2 = r0.f10521
            r2.setContentView(r1)
            android.content.Context r1 = r0.f10520
            android.view.Window r2 = r0.f10522
            r3 = 2131296844(0x7f09024c, float:1.8211616E38)
            android.view.View r3 = r2.findViewById(r3)
            r4 = 2131297007(0x7f0902ef, float:1.8211947E38)
            android.view.View r5 = r3.findViewById(r4)
            r6 = 2131296504(0x7f0900f8, float:1.8210927E38)
            android.view.View r7 = r3.findViewById(r6)
            r8 = 2131296368(0x7f090070, float:1.821065E38)
            android.view.View r9 = r3.findViewById(r8)
            r10 = 2131296506(0x7f0900fa, float:1.821093E38)
            android.view.View r3 = r3.findViewById(r10)
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            r10 = 131072(0x20000, float:1.83671E-40)
            r2.setFlags(r10, r10)
            r10 = 8
            r3.setVisibility(r10)
            android.view.View r4 = r3.findViewById(r4)
            android.view.View r6 = r3.findViewById(r6)
            android.view.View r8 = r3.findViewById(r8)
            android.view.ViewGroup r4 = p000.C0854u.m5768(r4, r5)
            android.view.ViewGroup r5 = p000.C0854u.m5768(r6, r7)
            android.view.ViewGroup r6 = p000.C0854u.m5768(r8, r9)
            r7 = 2131296888(0x7f090278, float:1.8211705E38)
            android.view.View r7 = r2.findViewById(r7)
            androidx.core.widget.NestedScrollView r7 = (androidx.core.widget.NestedScrollView) r7
            r0.f10528 = r7
            r8 = 0
            r7.setFocusable(r8)
            androidx.core.widget.NestedScrollView r7 = r0.f10528
            r7.setNestedScrollingEnabled(r8)
            r7 = 16908299(0x102000b, float:2.387726E-38)
            android.view.View r7 = r5.findViewById(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r0.f10532 = r7
            r9 = -1
            if (r7 != 0) goto L7c
            goto La9
        L7c:
            r7.setVisibility(r10)
            androidx.core.widget.NestedScrollView r7 = r0.f10528
            android.widget.TextView r11 = r0.f10532
            r7.removeView(r11)
            androidx.appcompat.app.AlertController$RecycleListView r7 = r0.f10524
            if (r7 == 0) goto La6
            androidx.core.widget.NestedScrollView r7 = r0.f10528
            android.view.ViewParent r7 = r7.getParent()
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            androidx.core.widget.NestedScrollView r11 = r0.f10528
            int r11 = r7.indexOfChild(r11)
            r7.removeViewAt(r11)
            androidx.appcompat.app.AlertController$RecycleListView r12 = r0.f10524
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
            r0.f10525 = r7
            ｈ r11 = r0.f10542
            r7.setOnClickListener(r11)
            r7 = 0
            boolean r12 = android.text.TextUtils.isEmpty(r7)
            android.widget.Button r13 = r0.f10525
            r14 = 1
            if (r12 == 0) goto Lc8
            r13.setVisibility(r10)
            r12 = r8
            goto Ld1
        Lc8:
            r13.setText(r7)
            android.widget.Button r12 = r0.f10525
            r12.setVisibility(r8)
            r12 = r14
        Ld1:
            r13 = 16908314(0x102001a, float:2.3877302E-38)
            android.view.View r13 = r6.findViewById(r13)
            android.widget.Button r13 = (android.widget.Button) r13
            r0.f10526 = r13
            r13.setOnClickListener(r11)
            boolean r13 = android.text.TextUtils.isEmpty(r7)
            android.widget.Button r15 = r0.f10526
            if (r13 == 0) goto Leb
            r15.setVisibility(r10)
            goto Lf5
        Leb:
            r15.setText(r7)
            android.widget.Button r13 = r0.f10526
            r13.setVisibility(r8)
            r12 = r12 | 2
        Lf5:
            r13 = 16908315(0x102001b, float:2.3877305E-38)
            android.view.View r13 = r6.findViewById(r13)
            android.widget.Button r13 = (android.widget.Button) r13
            r0.f10527 = r13
            r13.setOnClickListener(r11)
            boolean r11 = android.text.TextUtils.isEmpty(r7)
            android.widget.Button r13 = r0.f10527
            if (r11 == 0) goto L10f
            r13.setVisibility(r10)
            goto L119
        L10f:
            r13.setText(r7)
            android.widget.Button r11 = r0.f10527
            r11.setVisibility(r8)
            r12 = r12 | 4
        L119:
            android.util.TypedValue r11 = new android.util.TypedValue
            r11.<init>()
            android.content.res.Resources$Theme r1 = r1.getTheme()
            r13 = 2130968615(0x7f040027, float:1.7545889E38)
            r1.resolveAttribute(r13, r11, r14)
            int r1 = r11.data
            r11 = 2
            if (r1 == 0) goto L165
            r1 = 1056964608(0x3f000000, float:0.5)
            if (r12 != r14) goto L141
            android.widget.Button r13 = r0.f10525
            android.view.ViewGroup$LayoutParams r15 = r13.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r15 = (android.widget.LinearLayout.LayoutParams) r15
            r15.gravity = r14
            r15.weight = r1
            r13.setLayoutParams(r15)
            goto L165
        L141:
            if (r12 != r11) goto L153
            android.widget.Button r13 = r0.f10526
            android.view.ViewGroup$LayoutParams r15 = r13.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r15 = (android.widget.LinearLayout.LayoutParams) r15
            r15.gravity = r14
            r15.weight = r1
            r13.setLayoutParams(r15)
            goto L165
        L153:
            r13 = 4
            if (r12 != r13) goto L165
            android.widget.Button r13 = r0.f10527
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
            android.view.View r1 = r0.f10533
            r12 = 2131297005(0x7f0902ed, float:1.8211943E38)
            if (r1 == 0) goto L185
            android.view.ViewGroup$LayoutParams r1 = new android.view.ViewGroup$LayoutParams
            r13 = -2
            r1.<init>(r9, r13)
            android.view.View r13 = r0.f10533
            r4.addView(r13, r8, r1)
            android.view.View r1 = r2.findViewById(r12)
            r1.setVisibility(r10)
            goto L1e8
        L185:
            r1 = 16908294(0x1020006, float:2.3877246E-38)
            android.view.View r1 = r2.findViewById(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r0.f10530 = r1
            java.lang.CharSequence r1 = r0.f10523
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L1d9
            boolean r1 = r0.f10540
            if (r1 == 0) goto L1d9
            r1 = 2131296316(0x7f09003c, float:1.8210545E38)
            android.view.View r1 = r2.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.f10531 = r1
            java.lang.CharSequence r12 = r0.f10523
            r1.setText(r12)
            android.graphics.drawable.Drawable r1 = r0.f10529
            if (r1 == 0) goto L1b6
            android.widget.ImageView r12 = r0.f10530
            r12.setImageDrawable(r1)
            goto L1e8
        L1b6:
            android.widget.TextView r1 = r0.f10531
            android.widget.ImageView r12 = r0.f10530
            int r12 = r12.getPaddingLeft()
            android.widget.ImageView r13 = r0.f10530
            int r13 = r13.getPaddingTop()
            android.widget.ImageView r15 = r0.f10530
            int r15 = r15.getPaddingRight()
            android.widget.ImageView r7 = r0.f10530
            int r7 = r7.getPaddingBottom()
            r1.setPadding(r12, r13, r15, r7)
            android.widget.ImageView r1 = r0.f10530
            r1.setVisibility(r10)
            goto L1e8
        L1d9:
            android.view.View r1 = r2.findViewById(r12)
            r1.setVisibility(r10)
            android.widget.ImageView r1 = r0.f10530
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
            r7 = 2131297000(0x7f0902e8, float:1.8211933E38)
            android.view.View r7 = r5.findViewById(r7)
            if (r7 == 0) goto L213
            r7.setVisibility(r8)
        L213:
            if (r3 == 0) goto L22f
            androidx.core.widget.NestedScrollView r7 = r0.f10528
            if (r7 == 0) goto L21c
            r7.setClipToPadding(r14)
        L21c:
            androidx.appcompat.app.AlertController$RecycleListView r7 = r0.f10524
            if (r7 == 0) goto L228
            r7 = 2131297004(0x7f0902ec, float:1.821194E38)
            android.view.View r7 = r4.findViewById(r7)
            goto L229
        L228:
            r7 = 0
        L229:
            if (r7 == 0) goto L23b
            r7.setVisibility(r8)
            goto L23b
        L22f:
            r4 = 2131297001(0x7f0902e9, float:1.8211935E38)
            android.view.View r4 = r5.findViewById(r4)
            if (r4 == 0) goto L23b
            r4.setVisibility(r8)
        L23b:
            androidx.appcompat.app.AlertController$RecycleListView r4 = r0.f10524
            if (r4 == 0) goto L260
            if (r6 == 0) goto L243
            if (r3 != 0) goto L260
        L243:
            int r7 = r4.getPaddingLeft()
            if (r3 == 0) goto L24e
            int r10 = r4.getPaddingTop()
            goto L250
        L24e:
            int r10 = r4.f356
        L250:
            int r12 = r4.getPaddingRight()
            if (r6 == 0) goto L25b
            int r13 = r4.getPaddingBottom()
            goto L25d
        L25b:
            int r13 = r4.f357
        L25d:
            r4.setPadding(r7, r10, r12, r13)
        L260:
            if (r1 != 0) goto L28d
            androidx.appcompat.app.AlertController$RecycleListView r1 = r0.f10524
            if (r1 == 0) goto L267
            goto L269
        L267:
            androidx.core.widget.NestedScrollView r1 = r0.f10528
        L269:
            if (r1 == 0) goto L28d
            if (r6 == 0) goto L26e
            r8 = r11
        L26e:
            r3 = r3 | r8
            r4 = 2131296887(0x7f090277, float:1.8211703E38)
            android.view.View r4 = r2.findViewById(r4)
            r6 = 2131296886(0x7f090276, float:1.8211701E38)
            android.view.View r2 = r2.findViewById(r6)
            java.util.WeakHashMap r6 = p000.b92.f1572
            r6 = 3
            p000.v82.m6138(r1, r3, r6)
            if (r4 == 0) goto L288
            r5.removeView(r4)
        L288:
            if (r2 == 0) goto L28d
            r5.removeView(r2)
        L28d:
            androidx.appcompat.app.AlertController$RecycleListView r1 = r0.f10524
            if (r1 == 0) goto L2a2
            android.widget.ListAdapter r2 = r0.f10534
            if (r2 == 0) goto L2a2
            r1.setAdapter(r2)
            int r0 = r0.f10535
            if (r0 <= r9) goto L2a2
            r1.setItemChecked(r0, r14)
            r1.setSelection(r0)
        L2a2:
            return
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int r2, android.view.KeyEvent r3) {
            r1 = this;
            u r0 = r1.f11501
            androidx.core.widget.NestedScrollView r0 = r0.f10528
            if (r0 == 0) goto Le
            boolean r0 = r0.m434(r3)
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
            u r0 = r1.f11501
            androidx.core.widget.NestedScrollView r0 = r0.f10528
            if (r0 == 0) goto Le
            boolean r0 = r0.m434(r3)
            if (r0 == 0) goto Le
            r1 = 1
            return r1
        Le:
            boolean r1 = super.onKeyUp(r2, r3)
            return r1
    }

    @Override // p000.DialogC0989xm, android.app.Dialog
    public final void onStop() {
            r1 = this;
            super.onStop()
            androidx.appcompat.app.α r1 = r1.m6294()
            androidx.appcompat.app.β r1 = (androidx.appcompat.app.LayoutInflaterFactory2C0026) r1
            r1.m211()
            tb2 r1 = r1.f402
            if (r1 == 0) goto L1a
            r0 = 0
            r1.f10298 = r0
            y92 r1 = r1.f10297
            if (r1 == 0) goto L1a
            r1.m6841()
        L1a:
            return
    }

    @Override // p000.DialogC0989xm, android.app.Dialog
    public final void setContentView(int r1) {
            r0 = this;
            r0.m6683()
            androidx.appcompat.app.α r0 = r0.m6294()
            r0.mo204(r1)
            return
    }

    @Override // p000.DialogC0989xm, android.app.Dialog
    public final void setContentView(android.view.View r1) {
            r0 = this;
            r0.m6683()
            androidx.appcompat.app.α r0 = r0.m6294()
            r0.mo205(r1)
            return
    }

    @Override // p000.DialogC0989xm, android.app.Dialog
    public final void setContentView(android.view.View r1, android.view.ViewGroup.LayoutParams r2) {
            r0 = this;
            r0.m6683()
            androidx.appcompat.app.α r0 = r0.m6294()
            r0.mo206(r1, r2)
            return
    }

    @Override // android.app.Dialog
    public final void setTitle(int r2) {
            r1 = this;
            super.setTitle(r2)
            androidx.appcompat.app.α r0 = r1.m6294()
            android.content.Context r1 = r1.getContext()
            java.lang.String r1 = r1.getString(r2)
            r0.mo207(r1)
            return
    }

    @Override // android.app.Dialog
    public final void setTitle(java.lang.CharSequence r1) {
            r0 = this;
            r0.m6296(r1)
            u r0 = r0.f11501
            r0.f10523 = r1
            android.widget.TextView r0 = r0.f10531
            if (r0 == 0) goto Le
            r0.setText(r1)
        Le:
            return
    }

    /* JADX INFO: renamed from: ε */
    public final androidx.appcompat.app.AbstractC0025 m6294() {
            r3 = this;
            androidx.appcompat.app.β r0 = r3.f11499
            if (r0 != 0) goto L15
            u4 r0 = androidx.appcompat.app.AbstractC0025.f361
            androidx.appcompat.app.β r0 = new androidx.appcompat.app.β
            android.content.Context r1 = r3.getContext()
            android.view.Window r2 = r3.getWindow()
            r0.<init>(r1, r2, r3, r3)
            r3.f11499 = r0
        L15:
            androidx.appcompat.app.β r3 = r3.f11499
            return r3
    }

    /* JADX INFO: renamed from: ζ */
    public final void m6295(android.os.Bundle r2) {
            r1 = this;
            androidx.appcompat.app.α r0 = r1.m6294()
            r0.mo200()
            super.onCreate(r2)
            androidx.appcompat.app.α r1 = r1.m6294()
            r1.mo201()
            return
    }

    /* JADX INFO: renamed from: θ */
    public final void m6296(java.lang.CharSequence r1) {
            r0 = this;
            super.setTitle(r1)
            androidx.appcompat.app.α r0 = r0.m6294()
            r0.mo207(r1)
            return
    }
}
