package a;

/* JADX INFO: loaded from: classes.dex */
public final class R0 implements a.Tb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f235a;

    public /* synthetic */ R0(java.lang.Object r1) {
            r0 = this;
            r0.f235a = r1
            r0.<init>()
            return
    }

    @Override // a.Tb
    public a.nh a(android.view.View r17, a.nh r18) {
            r16 = this;
            r1 = r17
            r2 = r18
            int r3 = r2.d()
            r4 = r16
            java.lang.Object r0 = r4.f235a
            r5 = r0
            a.Q0 r5 = (a.Q0) r5
            r5.getClass()
            int r6 = r2.d()
            androidx.appcompat.widget.ActionBarContextView r0 = r5.v
            r7 = 29
            r9 = 8
            if (r0 == 0) goto L16b
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            boolean r0 = r0 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L16b
            androidx.appcompat.widget.ActionBarContextView r0 = r5.v
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            r10 = r0
            android.view.ViewGroup$MarginLayoutParams r10 = (android.view.ViewGroup.MarginLayoutParams) r10
            androidx.appcompat.widget.ActionBarContextView r0 = r5.v
            boolean r0 = r0.isShown()
            r11 = 1
            if (r0 == 0) goto L158
            android.graphics.Rect r0 = r5.d0
            if (r0 != 0) goto L4a
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r5.d0 = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r5.e0 = r0
        L4a:
            android.graphics.Rect r12 = r5.d0
            android.graphics.Rect r0 = r5.e0
            int r13 = r2.b()
            int r14 = r2.d()
            int r15 = r2.c()
            int r8 = r2.a()
            r12.set(r13, r14, r15, r8)
            android.view.ViewGroup r8 = r5.B
            java.lang.Class<android.graphics.Rect> r13 = android.graphics.Rect.class
            int r14 = android.os.Build.VERSION.SDK_INT
            if (r14 < r7) goto L6d
            a.Pg.a.a(r8, r12, r0)
            goto La6
        L6d:
            boolean r14 = a.Pg.f213a
            java.lang.String r15 = "ViewUtils"
            if (r14 != 0) goto L94
            a.Pg.f213a = r11
            java.lang.Class<android.view.View> r14 = android.view.View.class
            java.lang.String r7 = "computeFitSystemWindows"
            java.lang.Class[] r13 = new java.lang.Class[]{r13, r13}     // Catch: java.lang.NoSuchMethodException -> L8f
            java.lang.reflect.Method r7 = r14.getDeclaredMethod(r7, r13)     // Catch: java.lang.NoSuchMethodException -> L8f
            a.Pg.b = r7     // Catch: java.lang.NoSuchMethodException -> L8f
            boolean r7 = r7.isAccessible()     // Catch: java.lang.NoSuchMethodException -> L8f
            if (r7 != 0) goto L94
            java.lang.reflect.Method r7 = a.Pg.b     // Catch: java.lang.NoSuchMethodException -> L8f
            r7.setAccessible(r11)     // Catch: java.lang.NoSuchMethodException -> L8f
            goto L94
        L8f:
            java.lang.String r7 = "Could not find method computeFitSystemWindows. Oh well."
            android.util.Log.d(r15, r7)
        L94:
            java.lang.reflect.Method r7 = a.Pg.b
            if (r7 == 0) goto La6
            java.lang.Object[] r0 = new java.lang.Object[]{r12, r0}     // Catch: java.lang.Exception -> La0
            r7.invoke(r8, r0)     // Catch: java.lang.Exception -> La0
            goto La6
        La0:
            r0 = move-exception
            java.lang.String r7 = "Could not invoke computeFitSystemWindows"
            android.util.Log.d(r15, r7, r0)
        La6:
            int r0 = r12.top
            int r7 = r12.left
            int r8 = r12.right
            android.view.ViewGroup r12 = r5.B
            java.util.WeakHashMap<android.view.View, a.Jg> r13 = a.C0414ug.f721a
            a.nh r12 = a.C0414ug.e.a(r12)
            if (r12 != 0) goto Lb8
            r13 = 0
            goto Lbc
        Lb8:
            int r13 = r12.b()
        Lbc:
            if (r12 != 0) goto Lc0
            r12 = 0
            goto Lc4
        Lc0:
            int r12 = r12.c()
        Lc4:
            int r14 = r10.topMargin
            if (r14 != r0) goto Ld3
            int r14 = r10.leftMargin
            if (r14 != r7) goto Ld3
            int r14 = r10.rightMargin
            if (r14 == r8) goto Ld1
            goto Ld3
        Ld1:
            r7 = 0
            goto Lda
        Ld3:
            r10.topMargin = r0
            r10.leftMargin = r7
            r10.rightMargin = r8
            r7 = r11
        Lda:
            android.content.Context r8 = r5.k
            if (r0 <= 0) goto L102
            android.view.View r0 = r5.D
            if (r0 != 0) goto L102
            android.view.View r0 = new android.view.View
            r0.<init>(r8)
            r5.D = r0
            r0.setVisibility(r9)
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            int r14 = r10.topMargin
            r15 = 51
            r9 = -1
            r0.<init>(r9, r14, r15)
            r0.leftMargin = r13
            r0.rightMargin = r12
            android.view.ViewGroup r12 = r5.B
            android.view.View r13 = r5.D
            r12.addView(r13, r9, r0)
            goto L125
        L102:
            android.view.View r0 = r5.D
            if (r0 == 0) goto L125
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            int r9 = r0.height
            int r14 = r10.topMargin
            if (r9 != r14) goto L11a
            int r9 = r0.leftMargin
            if (r9 != r13) goto L11a
            int r9 = r0.rightMargin
            if (r9 == r12) goto L125
        L11a:
            r0.height = r14
            r0.leftMargin = r13
            r0.rightMargin = r12
            android.view.View r9 = r5.D
            r9.setLayoutParams(r0)
        L125:
            android.view.View r0 = r5.D
            if (r0 == 0) goto L12a
            goto L12b
        L12a:
            r11 = 0
        L12b:
            if (r11 == 0) goto L14d
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L14d
            android.view.View r0 = r5.D
            int r9 = r0.getWindowSystemUiVisibility()
            r9 = r9 & 8192(0x2000, float:1.148E-41)
            if (r9 == 0) goto L144
            int r9 = androidx.appcompat.R.color.abc_decor_view_status_guard_light
            int r8 = a.Y3.b.a(r8, r9)
            goto L14a
        L144:
            int r9 = androidx.appcompat.R.color.abc_decor_view_status_guard
            int r8 = a.Y3.b.a(r8, r9)
        L14a:
            r0.setBackgroundColor(r8)
        L14d:
            boolean r0 = r5.I
            if (r0 != 0) goto L154
            if (r11 == 0) goto L154
            r6 = 0
        L154:
            r0 = r11
            r11 = r7
            r7 = 0
            goto L163
        L158:
            int r0 = r10.topMargin
            r7 = 0
            if (r0 == 0) goto L161
            r10.topMargin = r7
            r0 = r7
            goto L163
        L161:
            r0 = r7
            r11 = r0
        L163:
            if (r11 == 0) goto L16d
            androidx.appcompat.widget.ActionBarContextView r8 = r5.v
            r8.setLayoutParams(r10)
            goto L16d
        L16b:
            r7 = 0
            r0 = r7
        L16d:
            android.view.View r5 = r5.D
            if (r5 == 0) goto L17a
            if (r0 == 0) goto L175
            r8 = r7
            goto L177
        L175:
            r8 = 8
        L177:
            r5.setVisibility(r8)
        L17a:
            if (r3 == r6) goto L1af
            int r0 = r2.b()
            int r3 = r2.c()
            int r5 = r2.a()
            int r7 = android.os.Build.VERSION.SDK_INT
            r8 = 30
            if (r7 < r8) goto L194
            a.nh$d r7 = new a.nh$d
            r7.<init>(r2)
            goto L1a3
        L194:
            r8 = 29
            if (r7 < r8) goto L19e
            a.nh$c r7 = new a.nh$c
            r7.<init>(r2)
            goto L1a3
        L19e:
            a.nh$b r7 = new a.nh$b
            r7.<init>(r2)
        L1a3:
            a.a9 r0 = a.C0047a9.b(r0, r6, r3, r5)
            r7.g(r0)
            a.nh r0 = r7.b()
            goto L1b0
        L1af:
            r0 = r2
        L1b0:
            java.util.WeakHashMap<android.view.View, a.Jg> r2 = a.C0414ug.f721a
            android.view.WindowInsets r2 = r0.f()
            if (r2 == 0) goto L1c6
            android.view.WindowInsets r3 = a.C0414ug.c.b(r1, r2)
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L1c6
            a.nh r0 = a.nh.g(r1, r3)
        L1c6:
            return r0
    }
}
