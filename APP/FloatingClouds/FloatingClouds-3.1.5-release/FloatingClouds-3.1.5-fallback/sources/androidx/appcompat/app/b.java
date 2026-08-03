package androidx.appcompat.app;

/* JADX INFO: loaded from: classes.dex */
public final class b extends a.X0 implements android.content.DialogInterface {
    public final androidx.appcompat.app.AlertController f;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final androidx.appcompat.app.AlertController.b f810a;
        public final int b;

        public a(android.content.Context r5) {
                r4 = this;
                r0 = 0
                int r0 = androidx.appcompat.app.b.f(r5, r0)
                r4.<init>()
                androidx.appcompat.app.AlertController$b r1 = new androidx.appcompat.app.AlertController$b
                android.view.ContextThemeWrapper r2 = new android.view.ContextThemeWrapper
                int r3 = androidx.appcompat.app.b.f(r5, r0)
                r2.<init>(r5, r3)
                r1.<init>(r2)
                r4.f810a = r1
                r4.b = r0
                return
        }

        public final androidx.appcompat.app.b a() {
                r10 = this;
                androidx.appcompat.app.b r0 = new androidx.appcompat.app.b
                androidx.appcompat.app.AlertController$b r1 = r10.f810a
                android.view.ContextThemeWrapper r2 = r1.f807a
                int r3 = r10.b
                r0.<init>(r2, r3)
                android.view.View r2 = r1.e
                androidx.appcompat.app.AlertController r3 = r0.f
                if (r2 == 0) goto L14
                r3.n = r2
                goto L34
            L14:
                java.lang.CharSequence r2 = r1.d
                if (r2 == 0) goto L21
                r3.d = r2
                android.widget.TextView r4 = r3.l
                if (r4 == 0) goto L21
                r4.setText(r2)
            L21:
                android.graphics.drawable.Drawable r2 = r1.c
                if (r2 == 0) goto L34
                r3.j = r2
                android.widget.ImageView r4 = r3.k
                if (r4 == 0) goto L34
                r5 = 0
                r4.setVisibility(r5)
                android.widget.ImageView r4 = r3.k
                r4.setImageDrawable(r2)
            L34:
                java.lang.Object r2 = r1.g
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L77
                int r2 = r3.r
                android.view.LayoutInflater r6 = r1.b
                android.view.View r2 = r6.inflate(r2, r5)
                androidx.appcompat.app.AlertController$RecycleListView r2 = (androidx.appcompat.app.AlertController.RecycleListView) r2
                boolean r6 = r1.i
                if (r6 == 0) goto L4b
                int r6 = r3.s
                goto L4d
            L4b:
                int r6 = r3.t
            L4d:
                java.lang.Object r7 = r1.g
                if (r7 == 0) goto L52
                goto L5c
            L52:
                androidx.appcompat.app.AlertController$d r7 = new androidx.appcompat.app.AlertController$d
                android.view.ContextThemeWrapper r8 = r1.f807a
                r9 = 16908308(0x1020014, float:2.3877285E-38)
                r7.<init>(r8, r6, r9, r5)
            L5c:
                r3.o = r7
                int r6 = r1.j
                r3.p = r6
                android.content.DialogInterface$OnClickListener r6 = r1.h
                if (r6 == 0) goto L6e
                androidx.appcompat.app.a r6 = new androidx.appcompat.app.a
                r6.<init>(r1, r3)
                r2.setOnItemClickListener(r6)
            L6e:
                boolean r6 = r1.i
                if (r6 == 0) goto L75
                r2.setChoiceMode(r4)
            L75:
                r3.e = r2
            L77:
                r0.setCancelable(r4)
                r0.setCanceledOnTouchOutside(r4)
                r0.setOnCancelListener(r5)
                r0.setOnDismissListener(r5)
                androidx.appcompat.view.menu.g r1 = r1.f
                if (r1 == 0) goto L8a
                r0.setOnKeyListener(r1)
            L8a:
                return r0
        }
    }

    public b(android.view.ContextThemeWrapper r2, int r3) {
            r1 = this;
            int r3 = f(r2, r3)
            r1.<init>(r2, r3)
            androidx.appcompat.app.AlertController r2 = new androidx.appcompat.app.AlertController
            android.content.Context r3 = r1.getContext()
            android.view.Window r0 = r1.getWindow()
            r2.<init>(r3, r1, r0)
            r1.f = r2
            return
    }

    public static int f(android.content.Context r2, int r3) {
            int r0 = r3 >>> 24
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = 1
            if (r0 < r1) goto L8
            return r3
        L8:
            android.util.TypedValue r3 = new android.util.TypedValue
            r3.<init>()
            android.content.res.Resources$Theme r2 = r2.getTheme()
            int r0 = androidx.appcompat.R.attr.alertDialogTheme
            r2.resolveAttribute(r0, r3, r1)
            int r2 = r3.resourceId
            return r2
    }

    @Override // a.X0, a.E3, android.app.Dialog
    public final void onCreate(android.os.Bundle r17) {
            r16 = this;
            r0 = 4
            r1 = 2
            super.onCreate(r17)
            r2 = r16
            androidx.appcompat.app.AlertController r3 = r2.f
            androidx.appcompat.app.b r4 = r3.b
            int r5 = r3.q
            r4.setContentView(r5)
            int r4 = androidx.appcompat.R.id.parentPanel
            android.view.Window r5 = r3.c
            android.view.View r4 = r5.findViewById(r4)
            int r6 = androidx.appcompat.R.id.topPanel
            android.view.View r6 = r4.findViewById(r6)
            int r7 = androidx.appcompat.R.id.contentPanel
            android.view.View r7 = r4.findViewById(r7)
            int r8 = androidx.appcompat.R.id.buttonPanel
            android.view.View r8 = r4.findViewById(r8)
            int r9 = androidx.appcompat.R.id.customPanel
            android.view.View r4 = r4.findViewById(r9)
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            r9 = 131072(0x20000, float:1.83671E-40)
            r5.setFlags(r9, r9)
            r9 = 8
            r4.setVisibility(r9)
            int r10 = androidx.appcompat.R.id.topPanel
            android.view.View r10 = r4.findViewById(r10)
            int r11 = androidx.appcompat.R.id.contentPanel
            android.view.View r11 = r4.findViewById(r11)
            int r12 = androidx.appcompat.R.id.buttonPanel
            android.view.View r12 = r4.findViewById(r12)
            android.view.ViewGroup r6 = androidx.appcompat.app.AlertController.a(r10, r6)
            android.view.ViewGroup r7 = androidx.appcompat.app.AlertController.a(r11, r7)
            android.view.ViewGroup r8 = androidx.appcompat.app.AlertController.a(r12, r8)
            int r10 = androidx.appcompat.R.id.scrollView
            android.view.View r10 = r5.findViewById(r10)
            androidx.core.widget.NestedScrollView r10 = (androidx.core.widget.NestedScrollView) r10
            r3.i = r10
            r11 = 0
            r10.setFocusable(r11)
            androidx.core.widget.NestedScrollView r10 = r3.i
            r10.setNestedScrollingEnabled(r11)
            r10 = 16908299(0x102000b, float:2.387726E-38)
            android.view.View r10 = r7.findViewById(r10)
            android.widget.TextView r10 = (android.widget.TextView) r10
            r3.m = r10
            r12 = -1
            if (r10 != 0) goto L7c
            goto La9
        L7c:
            r10.setVisibility(r9)
            androidx.core.widget.NestedScrollView r10 = r3.i
            android.widget.TextView r13 = r3.m
            r10.removeView(r13)
            androidx.appcompat.app.AlertController$RecycleListView r10 = r3.e
            if (r10 == 0) goto La6
            androidx.core.widget.NestedScrollView r10 = r3.i
            android.view.ViewParent r10 = r10.getParent()
            android.view.ViewGroup r10 = (android.view.ViewGroup) r10
            androidx.core.widget.NestedScrollView r13 = r3.i
            int r13 = r10.indexOfChild(r13)
            r10.removeViewAt(r13)
            androidx.appcompat.app.AlertController$RecycleListView r14 = r3.e
            android.view.ViewGroup$LayoutParams r15 = new android.view.ViewGroup$LayoutParams
            r15.<init>(r12, r12)
            r10.addView(r14, r13, r15)
            goto La9
        La6:
            r7.setVisibility(r9)
        La9:
            r10 = 16908313(0x1020019, float:2.38773E-38)
            android.view.View r10 = r8.findViewById(r10)
            android.widget.Button r10 = (android.widget.Button) r10
            r3.f = r10
            androidx.appcompat.app.AlertController$a r13 = r3.w
            r10.setOnClickListener(r13)
            r10 = 0
            boolean r14 = android.text.TextUtils.isEmpty(r10)
            r15 = 1
            if (r14 == 0) goto Lc8
            android.widget.Button r14 = r3.f
            r14.setVisibility(r9)
            r14 = r11
            goto Ld3
        Lc8:
            android.widget.Button r14 = r3.f
            r14.setText(r10)
            android.widget.Button r14 = r3.f
            r14.setVisibility(r11)
            r14 = r15
        Ld3:
            r12 = 16908314(0x102001a, float:2.3877302E-38)
            android.view.View r12 = r8.findViewById(r12)
            android.widget.Button r12 = (android.widget.Button) r12
            r3.g = r12
            r12.setOnClickListener(r13)
            boolean r12 = android.text.TextUtils.isEmpty(r10)
            if (r12 == 0) goto Led
            android.widget.Button r12 = r3.g
            r12.setVisibility(r9)
            goto Lf8
        Led:
            android.widget.Button r12 = r3.g
            r12.setText(r10)
            android.widget.Button r12 = r3.g
            r12.setVisibility(r11)
            r14 = r14 | r1
        Lf8:
            r12 = 16908315(0x102001b, float:2.3877305E-38)
            android.view.View r12 = r8.findViewById(r12)
            android.widget.Button r12 = (android.widget.Button) r12
            r3.h = r12
            r12.setOnClickListener(r13)
            boolean r12 = android.text.TextUtils.isEmpty(r10)
            if (r12 == 0) goto L112
            android.widget.Button r12 = r3.h
            r12.setVisibility(r9)
            goto L11d
        L112:
            android.widget.Button r12 = r3.h
            r12.setText(r10)
            android.widget.Button r12 = r3.h
            r12.setVisibility(r11)
            r14 = r14 | r0
        L11d:
            android.util.TypedValue r12 = new android.util.TypedValue
            r12.<init>()
            android.content.Context r13 = r3.f804a
            android.content.res.Resources$Theme r13 = r13.getTheme()
            int r10 = androidx.appcompat.R.attr.alertDialogCenterButtons
            r13.resolveAttribute(r10, r12, r15)
            int r10 = r12.data
            if (r10 == 0) goto L168
            r10 = 1056964608(0x3f000000, float:0.5)
            if (r14 != r15) goto L145
            android.widget.Button r0 = r3.f
            android.view.ViewGroup$LayoutParams r12 = r0.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r12 = (android.widget.LinearLayout.LayoutParams) r12
            r12.gravity = r15
            r12.weight = r10
            r0.setLayoutParams(r12)
            goto L168
        L145:
            if (r14 != r1) goto L157
            android.widget.Button r0 = r3.g
            android.view.ViewGroup$LayoutParams r12 = r0.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r12 = (android.widget.LinearLayout.LayoutParams) r12
            r12.gravity = r15
            r12.weight = r10
            r0.setLayoutParams(r12)
            goto L168
        L157:
            if (r14 != r0) goto L168
            android.widget.Button r0 = r3.h
            android.view.ViewGroup$LayoutParams r12 = r0.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r12 = (android.widget.LinearLayout.LayoutParams) r12
            r12.gravity = r15
            r12.weight = r10
            r0.setLayoutParams(r12)
        L168:
            if (r14 == 0) goto L16b
            goto L16e
        L16b:
            r8.setVisibility(r9)
        L16e:
            android.view.View r0 = r3.n
            if (r0 == 0) goto L188
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r10 = -2
            r12 = -1
            r0.<init>(r12, r10)
            android.view.View r10 = r3.n
            r6.addView(r10, r11, r0)
            int r0 = androidx.appcompat.R.id.title_template
            android.view.View r0 = r5.findViewById(r0)
            r0.setVisibility(r9)
            goto L1ec
        L188:
            r0 = 16908294(0x1020006, float:2.3877246E-38)
            android.view.View r0 = r5.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r3.k = r0
            java.lang.CharSequence r0 = r3.d
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L1db
            boolean r0 = r3.u
            if (r0 == 0) goto L1db
            int r0 = androidx.appcompat.R.id.alertTitle
            android.view.View r0 = r5.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3.l = r0
            java.lang.CharSequence r10 = r3.d
            r0.setText(r10)
            android.graphics.drawable.Drawable r0 = r3.j
            if (r0 == 0) goto L1b8
            android.widget.ImageView r10 = r3.k
            r10.setImageDrawable(r0)
            goto L1ec
        L1b8:
            android.widget.TextView r0 = r3.l
            android.widget.ImageView r10 = r3.k
            int r10 = r10.getPaddingLeft()
            android.widget.ImageView r12 = r3.k
            int r12 = r12.getPaddingTop()
            android.widget.ImageView r13 = r3.k
            int r13 = r13.getPaddingRight()
            android.widget.ImageView r14 = r3.k
            int r14 = r14.getPaddingBottom()
            r0.setPadding(r10, r12, r13, r14)
            android.widget.ImageView r0 = r3.k
            r0.setVisibility(r9)
            goto L1ec
        L1db:
            int r0 = androidx.appcompat.R.id.title_template
            android.view.View r0 = r5.findViewById(r0)
            r0.setVisibility(r9)
            android.widget.ImageView r0 = r3.k
            r0.setVisibility(r9)
            r6.setVisibility(r9)
        L1ec:
            int r0 = r4.getVisibility()
            if (r0 == r9) goto L1f4
            r0 = r15
            goto L1f5
        L1f4:
            r0 = r11
        L1f5:
            if (r6 == 0) goto L1ff
            int r4 = r6.getVisibility()
            if (r4 == r9) goto L1ff
            r4 = r15
            goto L200
        L1ff:
            r4 = r11
        L200:
            int r8 = r8.getVisibility()
            if (r8 == r9) goto L208
            r8 = r15
            goto L209
        L208:
            r8 = r11
        L209:
            if (r8 != 0) goto L216
            int r9 = androidx.appcompat.R.id.textSpacerNoButtons
            android.view.View r9 = r7.findViewById(r9)
            if (r9 == 0) goto L216
            r9.setVisibility(r11)
        L216:
            if (r4 == 0) goto L231
            androidx.core.widget.NestedScrollView r9 = r3.i
            if (r9 == 0) goto L21f
            r9.setClipToPadding(r15)
        L21f:
            androidx.appcompat.app.AlertController$RecycleListView r9 = r3.e
            if (r9 == 0) goto L22a
            int r9 = androidx.appcompat.R.id.titleDividerNoCustom
            android.view.View r10 = r6.findViewById(r9)
            goto L22b
        L22a:
            r10 = 0
        L22b:
            if (r10 == 0) goto L23c
            r10.setVisibility(r11)
            goto L23c
        L231:
            int r6 = androidx.appcompat.R.id.textSpacerNoTitle
            android.view.View r6 = r7.findViewById(r6)
            if (r6 == 0) goto L23c
            r6.setVisibility(r11)
        L23c:
            androidx.appcompat.app.AlertController$RecycleListView r6 = r3.e
            if (r6 == 0) goto L261
            if (r8 == 0) goto L244
            if (r4 != 0) goto L261
        L244:
            int r9 = r6.getPaddingLeft()
            if (r4 == 0) goto L24f
            int r10 = r6.getPaddingTop()
            goto L251
        L24f:
            int r10 = r6.f805a
        L251:
            int r12 = r6.getPaddingRight()
            if (r8 == 0) goto L25c
            int r13 = r6.getPaddingBottom()
            goto L25e
        L25c:
            int r13 = r6.b
        L25e:
            r6.setPadding(r9, r10, r12, r13)
        L261:
            if (r0 != 0) goto L28d
            androidx.appcompat.app.AlertController$RecycleListView r0 = r3.e
            if (r0 == 0) goto L268
            goto L26a
        L268:
            androidx.core.widget.NestedScrollView r0 = r3.i
        L26a:
            if (r0 == 0) goto L28d
            if (r8 == 0) goto L26f
            goto L270
        L26f:
            r1 = r11
        L270:
            r1 = r1 | r4
            int r4 = androidx.appcompat.R.id.scrollIndicatorUp
            android.view.View r4 = r5.findViewById(r4)
            int r6 = androidx.appcompat.R.id.scrollIndicatorDown
            android.view.View r5 = r5.findViewById(r6)
            java.util.WeakHashMap<android.view.View, a.Jg> r6 = a.C0414ug.f721a
            r6 = 3
            a.C0414ug.e.d(r0, r1, r6)
            if (r4 == 0) goto L288
            r7.removeView(r4)
        L288:
            if (r5 == 0) goto L28d
            r7.removeView(r5)
        L28d:
            androidx.appcompat.app.AlertController$RecycleListView r0 = r3.e
            if (r0 == 0) goto L2a3
            android.widget.ListAdapter r1 = r3.o
            if (r1 == 0) goto L2a3
            r0.setAdapter(r1)
            int r1 = r3.p
            r12 = -1
            if (r1 <= r12) goto L2a3
            r0.setItemChecked(r1, r15)
            r0.setSelection(r1)
        L2a3:
            return
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int r2, android.view.KeyEvent r3) {
            r1 = this;
            androidx.appcompat.app.AlertController r0 = r1.f
            androidx.core.widget.NestedScrollView r0 = r0.i
            if (r0 == 0) goto Le
            boolean r0 = r0.d(r3)
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
            androidx.appcompat.app.AlertController r0 = r1.f
            androidx.core.widget.NestedScrollView r0 = r0.i
            if (r0 == 0) goto Le
            boolean r0 = r0.d(r3)
            if (r0 == 0) goto Le
            r2 = 1
            return r2
        Le:
            boolean r2 = super.onKeyUp(r2, r3)
            return r2
    }

    @Override // a.X0, android.app.Dialog
    public final void setTitle(java.lang.CharSequence r2) {
            r1 = this;
            super.setTitle(r2)
            androidx.appcompat.app.AlertController r0 = r1.f
            r0.d = r2
            android.widget.TextView r0 = r0.l
            if (r0 == 0) goto Le
            r0.setText(r2)
        Le:
            return
    }
}
