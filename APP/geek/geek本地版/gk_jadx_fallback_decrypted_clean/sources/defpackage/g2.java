package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class g2 extends android.app.Dialog implements android.content.DialogInterface, defpackage.x2, defpackage.oq, defpackage.u10 {
    public androidx.lifecycle.a a;
    public final defpackage.gm b;
    public final androidx.activity.a c;
    public defpackage.r3 d;
    public final defpackage.s3 e;
    public final defpackage.e2 f;

    public g2(android.view.ContextThemeWrapper r6, int r7) {
            r5 = this;
            int r7 = h(r6, r7)
            r0 = 1
            r1 = 2130968928(0x7f040160, float:1.7546523E38)
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
            gm r2 = new gm
            r2.<init>(r5)
            r5.b = r2
            androidx.activity.a r2 = new androidx.activity.a
            p1 r3 = new p1
            r4 = 5
            r3.<init>(r4, r5)
            r2.<init>(r3)
            r5.c = r2
            s3 r2 = new s3
            r2.<init>(r5)
            r5.e = r2
            e3 r2 = r5.c()
            if (r7 != 0) goto L4c
            android.util.TypedValue r7 = new android.util.TypedValue
            r7.<init>()
            android.content.res.Resources$Theme r6 = r6.getTheme()
            r6.resolveAttribute(r1, r7, r0)
            int r7 = r7.resourceId
        L4c:
            r6 = r2
            r3 r6 = (defpackage.r3) r6
            r6.T = r7
            r2.d()
            e2 r6 = new e2
            android.content.Context r7 = r5.getContext()
            android.view.Window r0 = r5.getWindow()
            r6.<init>(r7, r5, r0)
            r5.f = r6
            return
    }

    public static void a(defpackage.g2 r0) {
            super.onBackPressed()
            return
    }

    public static int h(android.content.Context r2, int r3) {
            int r0 = r3 >>> 24
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = 1
            if (r0 < r1) goto L8
            return r3
        L8:
            android.util.TypedValue r3 = new android.util.TypedValue
            r3.<init>()
            android.content.res.Resources$Theme r2 = r2.getTheme()
            r0 = 2130968618(0x7f04002a, float:1.7545895E38)
            r2.resolveAttribute(r0, r3, r1)
            int r2 = r3.resourceId
            return r2
    }

    @Override // android.app.Dialog
    public final void addContentView(android.view.View r4, android.view.ViewGroup.LayoutParams r5) {
            r3 = this;
            e3 r0 = r3.c()
            r3 r0 = (defpackage.r3) r0
            r0.w()
            android.view.ViewGroup r1 = r0.A
            r2 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r1 = r1.findViewById(r2)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r1.addView(r4, r5)
            l3 r4 = r0.m
            android.view.Window r5 = r0.l
            android.view.Window$Callback r5 = r5.getCallback()
            r4.a(r5)
            return
    }

    @Override // defpackage.u10
    public final defpackage.a3 b() {
            r1 = this;
            gm r0 = r1.b
            java.lang.Object r0 = r0.c
            a3 r0 = (defpackage.a3) r0
            return r0
    }

    public final defpackage.e3 c() {
            r3 = this;
            r3 r0 = r3.d
            if (r0 != 0) goto L15
            u5 r0 = defpackage.e3.a
            r3 r0 = new r3
            android.content.Context r1 = r3.getContext()
            android.view.Window r2 = r3.getWindow()
            r0.<init>(r1, r2, r3, r3)
            r3.d = r0
        L15:
            r3 r0 = r3.d
            return r0
    }

    public final void d(android.os.Bundle r3) {
            r2 = this;
            super.onCreate(r3)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto L1e
            android.window.OnBackInvokedDispatcher r0 = defpackage.e0.c(r2)
            java.lang.String r1 = "onBackInvokedDispatcher"
            defpackage.ip.n(r1, r0)
            androidx.activity.a r1 = r2.c
            r1.getClass()
            r1.e = r0
            boolean r0 = r1.g
            r1.c(r0)
        L1e:
            gm r0 = r2.b
            r0.b(r3)
            androidx.lifecycle.a r3 = r2.a
            if (r3 != 0) goto L2e
            androidx.lifecycle.a r3 = new androidx.lifecycle.a
            r3.<init>(r2)
            r2.a = r3
        L2e:
            iq r0 = defpackage.iq.ON_CREATE
            r3.d(r0)
            return
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
            r1 = this;
            super.dismiss()
            e3 r0 = r1.c()
            r0.e()
            return
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(android.view.KeyEvent r3) {
            r2 = this;
            android.view.Window r0 = r2.getWindow()
            android.view.View r0 = r0.getDecorView()
            s3 r1 = r2.e
            boolean r3 = defpackage.ip.s(r1, r0, r2, r3)
            return r3
    }

    @Override // defpackage.oq
    public final androidx.lifecycle.a e() {
            r1 = this;
            androidx.lifecycle.a r0 = r1.a
            if (r0 != 0) goto Lb
            androidx.lifecycle.a r0 = new androidx.lifecycle.a
            r0.<init>(r1)
            r1.a = r0
        Lb:
            return r0
    }

    public final void f(android.os.Bundle r2) {
            r1 = this;
            e3 r0 = r1.c()
            r0.a()
            r1.d(r2)
            e3 r2 = r1.c()
            r2.d()
            return
    }

    @Override // android.app.Dialog
    public final android.view.View findViewById(int r2) {
            r1 = this;
            e3 r0 = r1.c()
            r3 r0 = (defpackage.r3) r0
            r0.w()
            android.view.Window r0 = r0.l
            android.view.View r2 = r0.findViewById(r2)
            return r2
    }

    public final void g() {
            r2 = this;
            androidx.lifecycle.a r0 = r2.a
            if (r0 != 0) goto Lb
            androidx.lifecycle.a r0 = new androidx.lifecycle.a
            r0.<init>(r2)
            r2.a = r0
        Lb:
            iq r1 = defpackage.iq.ON_DESTROY
            r0.d(r1)
            r0 = 0
            r2.a = r0
            super.onStop()
            return
    }

    public final void i(java.lang.CharSequence r2) {
            r1 = this;
            super.setTitle(r2)
            e3 r0 = r1.c()
            r0.l(r2)
            return
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
            r1 = this;
            e3 r0 = r1.c()
            r0.b()
            return
    }

    public final boolean j(android.view.KeyEvent r1) {
            r0 = this;
            boolean r1 = super.dispatchKeyEvent(r1)
            return r1
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
            r1 = this;
            androidx.activity.a r0 = r1.c
            r0.b()
            return
    }

    @Override // android.app.Dialog
    public final void onCreate(android.os.Bundle r18) {
            r17 = this;
            r17.f(r18)
            r0 = r17
            e2 r1 = r0.f
            int r2 = r1.q
            g2 r3 = r1.b
            r3.setContentView(r2)
            android.content.Context r2 = r1.a
            android.view.Window r3 = r1.c
            r4 = 2131296560(0x7f090130, float:1.821104E38)
            android.view.View r4 = r3.findViewById(r4)
            r5 = 2131296676(0x7f0901a4, float:1.8211275E38)
            android.view.View r6 = r4.findViewById(r5)
            r7 = 2131296366(0x7f09006e, float:1.8210647E38)
            android.view.View r8 = r4.findViewById(r7)
            r9 = 2131296344(0x7f090058, float:1.8210602E38)
            android.view.View r10 = r4.findViewById(r9)
            r11 = 2131296373(0x7f090075, float:1.821066E38)
            android.view.View r4 = r4.findViewById(r11)
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            r11 = 131072(0x20000, float:1.83671E-40)
            r3.setFlags(r11, r11)
            r11 = 8
            r4.setVisibility(r11)
            android.view.View r5 = r4.findViewById(r5)
            android.view.View r7 = r4.findViewById(r7)
            android.view.View r9 = r4.findViewById(r9)
            android.view.ViewGroup r5 = defpackage.e2.a(r5, r6)
            android.view.ViewGroup r6 = defpackage.e2.a(r7, r8)
            android.view.ViewGroup r7 = defpackage.e2.a(r9, r10)
            r8 = 2131296593(0x7f090151, float:1.8211107E38)
            android.view.View r8 = r3.findViewById(r8)
            androidx.core.widget.NestedScrollView r8 = (androidx.core.widget.NestedScrollView) r8
            r1.i = r8
            r9 = 0
            r8.setFocusable(r9)
            androidx.core.widget.NestedScrollView r8 = r1.i
            r8.setNestedScrollingEnabled(r9)
            r8 = 16908299(0x102000b, float:2.387726E-38)
            android.view.View r8 = r6.findViewById(r8)
            android.widget.TextView r8 = (android.widget.TextView) r8
            r1.m = r8
            r10 = -1
            if (r8 != 0) goto L7c
            goto La9
        L7c:
            r8.setVisibility(r11)
            androidx.core.widget.NestedScrollView r8 = r1.i
            android.widget.TextView r12 = r1.m
            r8.removeView(r12)
            androidx.appcompat.app.AlertController$RecycleListView r8 = r1.e
            if (r8 == 0) goto La6
            androidx.core.widget.NestedScrollView r8 = r1.i
            android.view.ViewParent r8 = r8.getParent()
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            androidx.core.widget.NestedScrollView r12 = r1.i
            int r12 = r8.indexOfChild(r12)
            r8.removeViewAt(r12)
            androidx.appcompat.app.AlertController$RecycleListView r13 = r1.e
            android.view.ViewGroup$LayoutParams r14 = new android.view.ViewGroup$LayoutParams
            r14.<init>(r10, r10)
            r8.addView(r13, r12, r14)
            goto La9
        La6:
            r6.setVisibility(r11)
        La9:
            r8 = 16908313(0x1020019, float:2.38773E-38)
            android.view.View r8 = r7.findViewById(r8)
            android.widget.Button r8 = (android.widget.Button) r8
            r1.f = r8
            x0 r12 = r1.w
            r8.setOnClickListener(r12)
            r8 = 0
            boolean r13 = android.text.TextUtils.isEmpty(r8)
            r14 = 1
            if (r13 == 0) goto Lc8
            android.widget.Button r13 = r1.f
            r13.setVisibility(r11)
            r13 = r9
            goto Ld3
        Lc8:
            android.widget.Button r13 = r1.f
            r13.setText(r8)
            android.widget.Button r13 = r1.f
            r13.setVisibility(r9)
            r13 = r14
        Ld3:
            r15 = 16908314(0x102001a, float:2.3877302E-38)
            android.view.View r15 = r7.findViewById(r15)
            android.widget.Button r15 = (android.widget.Button) r15
            r1.g = r15
            r15.setOnClickListener(r12)
            boolean r15 = android.text.TextUtils.isEmpty(r8)
            if (r15 == 0) goto Led
            android.widget.Button r15 = r1.g
            r15.setVisibility(r11)
            goto Lf9
        Led:
            android.widget.Button r15 = r1.g
            r15.setText(r8)
            android.widget.Button r15 = r1.g
            r15.setVisibility(r9)
            r13 = r13 | 2
        Lf9:
            r15 = 16908315(0x102001b, float:2.3877305E-38)
            android.view.View r15 = r7.findViewById(r15)
            android.widget.Button r15 = (android.widget.Button) r15
            r1.h = r15
            r15.setOnClickListener(r12)
            boolean r12 = android.text.TextUtils.isEmpty(r8)
            if (r12 == 0) goto L113
            android.widget.Button r12 = r1.h
            r12.setVisibility(r11)
            goto L11f
        L113:
            android.widget.Button r12 = r1.h
            r12.setText(r8)
            android.widget.Button r12 = r1.h
            r12.setVisibility(r9)
            r13 = r13 | 4
        L11f:
            android.util.TypedValue r12 = new android.util.TypedValue
            r12.<init>()
            android.content.res.Resources$Theme r2 = r2.getTheme()
            r15 = 2130968616(0x7f040028, float:1.754589E38)
            r2.resolveAttribute(r15, r12, r14)
            int r2 = r12.data
            r12 = 2
            if (r2 == 0) goto L16d
            r2 = 1056964608(0x3f000000, float:0.5)
            if (r13 != r14) goto L149
            android.widget.Button r15 = r1.f
            android.view.ViewGroup$LayoutParams r16 = r15.getLayoutParams()
            r8 = r16
            android.widget.LinearLayout$LayoutParams r8 = (android.widget.LinearLayout.LayoutParams) r8
            r8.gravity = r14
            r8.weight = r2
            r15.setLayoutParams(r8)
            goto L16d
        L149:
            if (r13 != r12) goto L15b
            android.widget.Button r8 = r1.g
            android.view.ViewGroup$LayoutParams r15 = r8.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r15 = (android.widget.LinearLayout.LayoutParams) r15
            r15.gravity = r14
            r15.weight = r2
            r8.setLayoutParams(r15)
            goto L16d
        L15b:
            r8 = 4
            if (r13 != r8) goto L16d
            android.widget.Button r8 = r1.h
            android.view.ViewGroup$LayoutParams r15 = r8.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r15 = (android.widget.LinearLayout.LayoutParams) r15
            r15.gravity = r14
            r15.weight = r2
            r8.setLayoutParams(r15)
        L16d:
            if (r13 == 0) goto L170
            goto L173
        L170:
            r7.setVisibility(r11)
        L173:
            android.view.View r2 = r1.n
            r8 = 2131296673(0x7f0901a1, float:1.821127E38)
            if (r2 == 0) goto L18d
            android.view.ViewGroup$LayoutParams r2 = new android.view.ViewGroup$LayoutParams
            r13 = -2
            r2.<init>(r10, r13)
            android.view.View r13 = r1.n
            r5.addView(r13, r9, r2)
            android.view.View r2 = r3.findViewById(r8)
            r2.setVisibility(r11)
            goto L1f0
        L18d:
            r2 = 16908294(0x1020006, float:2.3877246E-38)
            android.view.View r2 = r3.findViewById(r2)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r1.k = r2
            java.lang.CharSequence r2 = r1.d
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L1e1
            boolean r2 = r1.u
            if (r2 == 0) goto L1e1
            r2 = 2131296324(0x7f090044, float:1.8210561E38)
            android.view.View r2 = r3.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.l = r2
            java.lang.CharSequence r8 = r1.d
            r2.setText(r8)
            android.graphics.drawable.Drawable r2 = r1.j
            if (r2 == 0) goto L1be
            android.widget.ImageView r8 = r1.k
            r8.setImageDrawable(r2)
            goto L1f0
        L1be:
            android.widget.TextView r2 = r1.l
            android.widget.ImageView r8 = r1.k
            int r8 = r8.getPaddingLeft()
            android.widget.ImageView r13 = r1.k
            int r13 = r13.getPaddingTop()
            android.widget.ImageView r15 = r1.k
            int r15 = r15.getPaddingRight()
            android.widget.ImageView r12 = r1.k
            int r12 = r12.getPaddingBottom()
            r2.setPadding(r8, r13, r15, r12)
            android.widget.ImageView r2 = r1.k
            r2.setVisibility(r11)
            goto L1f0
        L1e1:
            android.view.View r2 = r3.findViewById(r8)
            r2.setVisibility(r11)
            android.widget.ImageView r2 = r1.k
            r2.setVisibility(r11)
            r5.setVisibility(r11)
        L1f0:
            int r2 = r4.getVisibility()
            if (r2 == r11) goto L1f8
            r2 = r14
            goto L1f9
        L1f8:
            r2 = r9
        L1f9:
            if (r5 == 0) goto L203
            int r4 = r5.getVisibility()
            if (r4 == r11) goto L203
            r4 = r14
            goto L204
        L203:
            r4 = r9
        L204:
            int r7 = r7.getVisibility()
            if (r7 == r11) goto L20c
            r7 = r14
            goto L20d
        L20c:
            r7 = r9
        L20d:
            if (r7 != 0) goto L21b
            r8 = 2131296657(0x7f090191, float:1.8211237E38)
            android.view.View r8 = r6.findViewById(r8)
            if (r8 == 0) goto L21b
            r8.setVisibility(r9)
        L21b:
            if (r4 == 0) goto L237
            androidx.core.widget.NestedScrollView r8 = r1.i
            if (r8 == 0) goto L224
            r8.setClipToPadding(r14)
        L224:
            androidx.appcompat.app.AlertController$RecycleListView r8 = r1.e
            if (r8 == 0) goto L230
            r8 = 2131296672(0x7f0901a0, float:1.8211267E38)
            android.view.View r8 = r5.findViewById(r8)
            goto L231
        L230:
            r8 = 0
        L231:
            if (r8 == 0) goto L243
            r8.setVisibility(r9)
            goto L243
        L237:
            r5 = 2131296658(0x7f090192, float:1.8211239E38)
            android.view.View r5 = r6.findViewById(r5)
            if (r5 == 0) goto L243
            r5.setVisibility(r9)
        L243:
            androidx.appcompat.app.AlertController$RecycleListView r5 = r1.e
            if (r5 == 0) goto L268
            if (r7 == 0) goto L24b
            if (r4 != 0) goto L268
        L24b:
            int r8 = r5.getPaddingLeft()
            if (r4 == 0) goto L256
            int r11 = r5.getPaddingTop()
            goto L258
        L256:
            int r11 = r5.a
        L258:
            int r12 = r5.getPaddingRight()
            if (r7 == 0) goto L263
            int r13 = r5.getPaddingBottom()
            goto L265
        L263:
            int r13 = r5.b
        L265:
            r5.setPadding(r8, r11, r12, r13)
        L268:
            if (r2 != 0) goto L295
            androidx.appcompat.app.AlertController$RecycleListView r2 = r1.e
            if (r2 == 0) goto L26f
            goto L271
        L26f:
            androidx.core.widget.NestedScrollView r2 = r1.i
        L271:
            if (r2 == 0) goto L295
            if (r7 == 0) goto L276
            r9 = 2
        L276:
            r4 = r4 | r9
            r5 = 2131296592(0x7f090150, float:1.8211105E38)
            android.view.View r5 = r3.findViewById(r5)
            r7 = 2131296591(0x7f09014f, float:1.8211103E38)
            android.view.View r3 = r3.findViewById(r7)
            java.util.WeakHashMap r7 = defpackage.ja0.a
            r7 = 3
            defpackage.z90.d(r2, r4, r7)
            if (r5 == 0) goto L290
            r6.removeView(r5)
        L290:
            if (r3 == 0) goto L295
            r6.removeView(r3)
        L295:
            androidx.appcompat.app.AlertController$RecycleListView r2 = r1.e
            if (r2 == 0) goto L2aa
            android.widget.ListAdapter r3 = r1.o
            if (r3 == 0) goto L2aa
            r2.setAdapter(r3)
            int r1 = r1.p
            if (r1 <= r10) goto L2aa
            r2.setItemChecked(r1, r14)
            r2.setSelection(r1)
        L2aa:
            return
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int r2, android.view.KeyEvent r3) {
            r1 = this;
            e2 r0 = r1.f
            androidx.core.widget.NestedScrollView r0 = r0.i
            if (r0 == 0) goto Le
            boolean r0 = r0.j(r3)
            if (r0 == 0) goto Le
            r2 = 1
            return r2
        Le:
            boolean r2 = super.onKeyDown(r2, r3)
            return r2
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int r2, android.view.KeyEvent r3) {
            r1 = this;
            e2 r0 = r1.f
            androidx.core.widget.NestedScrollView r0 = r0.i
            if (r0 == 0) goto Le
            boolean r0 = r0.j(r3)
            if (r0 == 0) goto Le
            r2 = 1
            return r2
        Le:
            boolean r2 = super.onKeyUp(r2, r3)
            return r2
    }

    @Override // android.app.Dialog
    public final android.os.Bundle onSaveInstanceState() {
            r2 = this;
            android.os.Bundle r0 = super.onSaveInstanceState()
            java.lang.String r1 = "super.onSaveInstanceState()"
            defpackage.ip.n(r1, r0)
            gm r1 = r2.b
            r1.c(r0)
            return r0
    }

    @Override // android.app.Dialog
    public final void onStart() {
            r2 = this;
            super.onStart()
            androidx.lifecycle.a r0 = r2.a
            if (r0 != 0) goto Le
            androidx.lifecycle.a r0 = new androidx.lifecycle.a
            r0.<init>(r2)
            r2.a = r0
        Le:
            iq r1 = defpackage.iq.ON_RESUME
            r0.d(r1)
            return
    }

    @Override // android.app.Dialog
    public final void onStop() {
            r2 = this;
            r2.g()
            e3 r0 = r2.c()
            r3 r0 = (defpackage.r3) r0
            r0.A()
            yb0 r0 = r0.o
            if (r0 == 0) goto L1a
            r1 = 0
            r0.P = r1
            xa0 r0 = r0.O
            if (r0 == 0) goto L1a
            r0.a()
        L1a:
            return
    }

    @Override // android.app.Dialog
    public final void setContentView(int r2) {
            r1 = this;
            e3 r0 = r1.c()
            r0.h(r2)
            return
    }

    @Override // android.app.Dialog
    public final void setContentView(android.view.View r2) {
            r1 = this;
            e3 r0 = r1.c()
            r0.i(r2)
            return
    }

    @Override // android.app.Dialog
    public final void setContentView(android.view.View r2, android.view.ViewGroup.LayoutParams r3) {
            r1 = this;
            e3 r0 = r1.c()
            r0.j(r2, r3)
            return
    }

    @Override // android.app.Dialog
    public final void setTitle(int r3) {
            r2 = this;
            super.setTitle(r3)
            e3 r0 = r2.c()
            android.content.Context r1 = r2.getContext()
            java.lang.String r3 = r1.getString(r3)
            r0.l(r3)
            return
    }

    @Override // android.app.Dialog
    public final void setTitle(java.lang.CharSequence r2) {
            r1 = this;
            r1.i(r2)
            e2 r0 = r1.f
            r0.d = r2
            android.widget.TextView r0 = r0.l
            if (r0 == 0) goto Le
            r0.setText(r2)
        Le:
            return
    }
}
