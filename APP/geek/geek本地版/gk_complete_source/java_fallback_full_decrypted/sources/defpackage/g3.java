package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class g3 implements defpackage.qw, defpackage.yc, defpackage.cv {
    public final /* synthetic */ int a;
    public final /* synthetic */ defpackage.r3 b;

    public /* synthetic */ g3(defpackage.r3 r1, int r2) {
            r0 = this;
            r0.a = r2
            r0.b = r1
            r0.<init>()
            return
    }

    @Override // defpackage.cv
    public void a(defpackage.ku r10, boolean r11) {
            r9 = this;
            int r0 = r9.a
            switch(r0) {
                case 2: goto L3c;
                default: goto L5;
            }
        L5:
            ku r0 = r10.k()
            r1 = 0
            r2 = 1
            if (r0 == r10) goto Lf
            r3 = r2
            goto L10
        Lf:
            r3 = r1
        L10:
            if (r3 == 0) goto L13
            r10 = r0
        L13:
            r3 r4 = r9.b
            q3[] r5 = r4.L
            if (r5 == 0) goto L1b
            int r6 = r5.length
            goto L1c
        L1b:
            r6 = r1
        L1c:
            if (r1 >= r6) goto L2a
            r7 = r5[r1]
            if (r7 == 0) goto L27
            ku r8 = r7.h
            if (r8 != r10) goto L27
            goto L2b
        L27:
            int r1 = r1 + 1
            goto L1c
        L2a:
            r7 = 0
        L2b:
            if (r7 == 0) goto L3b
            if (r3 == 0) goto L38
            int r10 = r7.a
            r4.q(r10, r7, r0)
            r4.s(r7, r2)
            goto L3b
        L38:
            r4.s(r7, r11)
        L3b:
            return
        L3c:
            r3 r11 = r9.b
            r11.r(r10)
            return
    }

    @Override // defpackage.qw
    public defpackage.wc0 d(android.view.View r18, defpackage.wc0 r19) {
            r17 = this;
            r1 = r18
            r2 = r19
            int r3 = r2.d()
            r4 = r17
            r3 r5 = r4.b
            android.content.Context r6 = r5.k
            int r7 = r2.d()
            androidx.appcompat.widget.ActionBarContextView r0 = r5.v
            r8 = 8
            r9 = 0
            if (r0 == 0) goto L138
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            boolean r0 = r0 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L138
            androidx.appcompat.widget.ActionBarContextView r0 = r5.v
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            r10 = r0
            android.view.ViewGroup$MarginLayoutParams r10 = (android.view.ViewGroup.MarginLayoutParams) r10
            androidx.appcompat.widget.ActionBarContextView r0 = r5.v
            boolean r0 = r0.isShown()
            if (r0 == 0) goto L123
            android.graphics.Rect r0 = r5.c0
            if (r0 != 0) goto L44
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r5.c0 = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r5.d0 = r0
        L44:
            android.graphics.Rect r12 = r5.c0
            android.graphics.Rect r0 = r5.d0
            int r13 = r2.b()
            int r14 = r2.d()
            int r15 = r2.c()
            int r11 = r2.a()
            r12.set(r13, r14, r15, r11)
            android.view.ViewGroup r11 = r5.A
            java.lang.reflect.Method r13 = defpackage.cb0.a
            if (r13 == 0) goto L71
            java.lang.Object[] r0 = new java.lang.Object[]{r12, r0}     // Catch: java.lang.Exception -> L69
            r13.invoke(r11, r0)     // Catch: java.lang.Exception -> L69
            goto L71
        L69:
            r0 = move-exception
            java.lang.String r11 = "ViewUtils"
            java.lang.String r13 = "Could not invoke computeFitSystemWindows"
            android.util.Log.d(r11, r13, r0)
        L71:
            int r0 = r12.top
            int r11 = r12.left
            int r12 = r12.right
            android.view.ViewGroup r13 = r5.A
            java.util.WeakHashMap r14 = defpackage.ja0.a
            wc0 r13 = defpackage.z90.a(r13)
            if (r13 != 0) goto L83
            r14 = r9
            goto L87
        L83:
            int r14 = r13.b()
        L87:
            if (r13 != 0) goto L8b
            r13 = r9
            goto L8f
        L8b:
            int r13 = r13.c()
        L8f:
            int r15 = r10.topMargin
            if (r15 != r0) goto L9e
            int r15 = r10.leftMargin
            if (r15 != r11) goto L9e
            int r15 = r10.rightMargin
            if (r15 == r12) goto L9c
            goto L9e
        L9c:
            r11 = r9
            goto La5
        L9e:
            r10.topMargin = r0
            r10.leftMargin = r11
            r10.rightMargin = r12
            r11 = 1
        La5:
            if (r0 <= 0) goto Lcb
            android.view.View r0 = r5.C
            if (r0 != 0) goto Lcb
            android.view.View r0 = new android.view.View
            r0.<init>(r6)
            r5.C = r0
            r0.setVisibility(r8)
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            int r12 = r10.topMargin
            r15 = 51
            r8 = -1
            r0.<init>(r8, r12, r15)
            r0.leftMargin = r14
            r0.rightMargin = r13
            android.view.ViewGroup r12 = r5.A
            android.view.View r13 = r5.C
            r12.addView(r13, r8, r0)
            goto Lee
        Lcb:
            android.view.View r0 = r5.C
            if (r0 == 0) goto Lee
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            int r8 = r0.height
            int r12 = r10.topMargin
            if (r8 != r12) goto Le3
            int r8 = r0.leftMargin
            if (r8 != r14) goto Le3
            int r8 = r0.rightMargin
            if (r8 == r13) goto Lee
        Le3:
            r0.height = r12
            r0.leftMargin = r14
            r0.rightMargin = r13
            android.view.View r8 = r5.C
            r8.setLayoutParams(r0)
        Lee:
            android.view.View r0 = r5.C
            if (r0 == 0) goto Lf5
            r16 = 1
            goto Lf7
        Lf5:
            r16 = r9
        Lf7:
            if (r16 == 0) goto L11b
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L11b
            android.view.View r0 = r5.C
            int r8 = defpackage.s90.g(r0)
            r8 = r8 & 8192(0x2000, float:1.148E-41)
            if (r8 == 0) goto L111
            r8 = 2131099654(0x7f060006, float:1.7811667E38)
            int r6 = defpackage.hd.a(r6, r8)
            goto L118
        L111:
            r8 = 2131099653(0x7f060005, float:1.7811665E38)
            int r6 = defpackage.hd.a(r6, r8)
        L118:
            r0.setBackgroundColor(r6)
        L11b:
            boolean r0 = r5.H
            if (r0 != 0) goto L130
            if (r16 == 0) goto L130
            r7 = r9
            goto L130
        L123:
            int r0 = r10.topMargin
            if (r0 == 0) goto L12d
            r10.topMargin = r9
            r16 = r9
            r11 = 1
            goto L130
        L12d:
            r11 = r9
            r16 = r11
        L130:
            if (r11 == 0) goto L13a
            androidx.appcompat.widget.ActionBarContextView r0 = r5.v
            r0.setLayoutParams(r10)
            goto L13a
        L138:
            r16 = r9
        L13a:
            android.view.View r0 = r5.C
            if (r0 == 0) goto L147
            if (r16 == 0) goto L142
            r8 = r9
            goto L144
        L142:
            r8 = 8
        L144:
            r0.setVisibility(r8)
        L147:
            if (r3 == r7) goto L17c
            int r0 = r2.b()
            int r3 = r2.c()
            int r5 = r2.a()
            int r6 = android.os.Build.VERSION.SDK_INT
            r8 = 30
            if (r6 < r8) goto L161
            lc0 r6 = new lc0
            r6.<init>(r2)
            goto L170
        L161:
            r8 = 29
            if (r6 < r8) goto L16b
            kc0 r6 = new kc0
            r6.<init>(r2)
            goto L170
        L16b:
            ic0 r6 = new ic0
            r6.<init>(r2)
        L170:
            ep r0 = defpackage.ep.b(r0, r7, r3, r5)
            r6.g(r0)
            wc0 r0 = r6.b()
            goto L17d
        L17c:
            r0 = r2
        L17d:
            java.util.WeakHashMap r2 = defpackage.ja0.a
            android.view.WindowInsets r2 = r0.f()
            if (r2 == 0) goto L193
            android.view.WindowInsets r3 = defpackage.w90.b(r1, r2)
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L193
            wc0 r0 = defpackage.wc0.g(r1, r3)
        L193:
            return r0
    }

    @Override // defpackage.cv
    public boolean q(defpackage.ku r3) {
            r2 = this;
            int r0 = r2.a
            switch(r0) {
                case 2: goto L24;
                default: goto L5;
            }
        L5:
            ku r0 = r3.k()
            if (r3 != r0) goto L22
            r3 r0 = r2.b
            boolean r1 = r0.F
            if (r1 == 0) goto L22
            android.view.Window r1 = r0.l
            android.view.Window$Callback r1 = r1.getCallback()
            if (r1 == 0) goto L22
            boolean r0 = r0.Q
            if (r0 != 0) goto L22
            r0 = 108(0x6c, float:1.51E-43)
            r1.onMenuOpened(r0, r3)
        L22:
            r3 = 1
            return r3
        L24:
            r3 r0 = r2.b
            android.view.Window r0 = r0.l
            android.view.Window$Callback r0 = r0.getCallback()
            if (r0 == 0) goto L33
            r1 = 108(0x6c, float:1.51E-43)
            r0.onMenuOpened(r1, r3)
        L33:
            r3 = 1
            return r3
    }
}
