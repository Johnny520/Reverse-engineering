package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class y6 implements java.lang.Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ y6(int r1, java.lang.Object r2) {
            r0 = this;
            r0.a = r1
            r0.b = r2
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r25 = this;
            r1 = r25
            int r0 = r1.a
            r7 = 0
            java.lang.Object r8 = r1.b
            switch(r0) {
                case 0: goto L1f8;
                case 1: goto L1d4;
                case 2: goto L1ae;
                case 3: goto L19f;
                case 4: goto L195;
                case 5: goto L18c;
                case 6: goto L155;
                case 7: goto L14e;
                case 8: goto L31;
                case 9: goto L2b;
                case 10: goto L1e;
                case 11: goto L10;
                default: goto La;
            }
        La:
            ma0 r8 = (defpackage.ma0) r8
            r8.n(r7)
            return
        L10:
            androidx.appcompat.widget.Toolbar r8 = (androidx.appcompat.widget.Toolbar) r8
            androidx.appcompat.widget.ActionMenuView r0 = r8.a
            if (r0 == 0) goto L1d
            j1 r0 = r0.t
            if (r0 == 0) goto L1d
            r0.l()
        L1d:
            return
        L1e:
            com.google.android.material.textfield.TextInputLayout r8 = (com.google.android.material.textfield.TextInputLayout) r8
            ej r0 = r8.c
            com.google.android.material.internal.CheckableImageButton r0 = r0.g
            r0.performClick()
            r0.jumpDrawablesToCurrentState()
            return
        L2b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager r8 = (androidx.recyclerview.widget.StaggeredGridLayoutManager) r8
            r8.y0()
            return
        L31:
            androidx.recyclerview.widget.RecyclerView r8 = (androidx.recyclerview.widget.RecyclerView) r8
            jz r0 = r8.H
            if (r0 == 0) goto L14a
            uf r0 = (defpackage.uf) r0
            long r9 = r0.d
            java.util.ArrayList r11 = r0.h
            boolean r12 = r11.isEmpty()
            java.util.ArrayList r13 = r0.j
            boolean r14 = r13.isEmpty()
            java.util.ArrayList r15 = r0.k
            boolean r16 = r15.isEmpty()
            r17 = 0
            java.util.ArrayList r3 = r0.i
            boolean r4 = r3.isEmpty()
            if (r12 == 0) goto L5f
            if (r14 == 0) goto L5f
            if (r4 == 0) goto L5f
            if (r16 == 0) goto L5f
            goto L14a
        L5f:
            int r5 = r11.size()
            r6 = r7
        L64:
            if (r6 >= r5) goto L9e
            java.lang.Object r20 = r11.get(r6)
            int r6 = r6 + 1
            r7 = r20
            b00 r7 = (defpackage.b00) r7
            android.view.View r2 = r7.a
            r22 = r4
            android.view.ViewPropertyAnimator r4 = r2.animate()
            r23 = r5
            java.util.ArrayList r5 = r0.q
            r5.add(r7)
            android.view.ViewPropertyAnimator r5 = r4.setDuration(r9)
            r24 = r6
            r6 = 0
            android.view.ViewPropertyAnimator r5 = r5.alpha(r6)
            pf r6 = new pf
            r6.<init>(r0, r7, r4, r2)
            android.view.ViewPropertyAnimator r2 = r5.setListener(r6)
            r2.start()
            r4 = r22
            r5 = r23
            r6 = r24
            r7 = 0
            goto L64
        L9e:
            r22 = r4
            r11.clear()
            if (r14 != 0) goto Ld0
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r2.addAll(r13)
            java.util.ArrayList r4 = r0.m
            r4.add(r2)
            r13.clear()
            of r4 = new of
            r5 = 0
            r4.<init>(r0, r2, r5)
            if (r12 != 0) goto Lcd
            java.lang.Object r2 = r2.get(r5)
            tf r2 = (defpackage.tf) r2
            b00 r2 = r2.a
            android.view.View r2 = r2.a
            java.util.WeakHashMap r5 = defpackage.ja0.a
            defpackage.s90.n(r2, r4, r9)
            goto Ld0
        Lcd:
            r4.run()
        Ld0:
            if (r16 != 0) goto Lfe
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r2.addAll(r15)
            java.util.ArrayList r4 = r0.n
            r4.add(r2)
            r15.clear()
            of r4 = new of
            r5 = 1
            r4.<init>(r0, r2, r5)
            if (r12 != 0) goto Lfb
            r5 = 0
            java.lang.Object r2 = r2.get(r5)
            sf r2 = (defpackage.sf) r2
            b00 r2 = r2.a
            android.view.View r2 = r2.a
            java.util.WeakHashMap r5 = defpackage.ja0.a
            defpackage.s90.n(r2, r4, r9)
            goto Lfe
        Lfb:
            r4.run()
        Lfe:
            if (r22 != 0) goto L148
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r2.addAll(r3)
            java.util.ArrayList r4 = r0.l
            r4.add(r2)
            r3.clear()
            of r3 = new of
            r4 = 2
            r3.<init>(r0, r2, r4)
            if (r12 == 0) goto L121
            if (r14 == 0) goto L121
            if (r16 != 0) goto L11d
            goto L121
        L11d:
            r3.run()
            goto L148
        L121:
            if (r12 != 0) goto L124
            goto L126
        L124:
            r9 = r17
        L126:
            if (r14 != 0) goto L12b
            long r4 = r0.e
            goto L12d
        L12b:
            r4 = r17
        L12d:
            if (r16 != 0) goto L132
            long r6 = r0.f
            goto L134
        L132:
            r6 = r17
        L134:
            long r4 = java.lang.Math.max(r4, r6)
            long r4 = r4 + r9
            r0 = 0
            java.lang.Object r2 = r2.get(r0)
            b00 r2 = (defpackage.b00) r2
            android.view.View r2 = r2.a
            java.util.WeakHashMap r6 = defpackage.ja0.a
            defpackage.s90.n(r2, r3, r4)
            goto L14b
        L148:
            r0 = 0
            goto L14b
        L14a:
            r0 = r7
        L14b:
            r8.i0 = r0
            return
        L14e:
            yl r8 = (defpackage.yl) r8
            r5 = 1
            r8.t(r5)
            return
        L155:
            r5 = 1
            wj r8 = (defpackage.wj) r8
            android.animation.ValueAnimator r0 = r8.z
            int r2 = r8.A
            if (r2 == r5) goto L162
            r4 = 2
            if (r2 == r4) goto L166
            goto L18b
        L162:
            r4 = 2
            r0.cancel()
        L166:
            r2 = 3
            r8.A = r2
            java.lang.Object r2 = r0.getAnimatedValue()
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            float[] r3 = new float[r4]
            r21 = 0
            r3[r21] = r2
            r19 = 1
            r20 = 0
            r3[r19] = r20
            r0.setFloatValues(r3)
            r2 = 500(0x1f4, float:7.0E-43)
            long r2 = (long) r2
            r0.setDuration(r2)
            r0.start()
        L18b:
            return
        L18c:
            kh r8 = (defpackage.kh) r8
            r0 = 0
            r8.l = r0
            r8.drawableStateChanged()
            return
        L195:
            rg r8 = (defpackage.rg) r8
            pg r0 = r8.S
            android.app.Dialog r2 = r8.a0
            r0.onDismiss(r2)
            return
        L19f:
            zf r8 = (defpackage.zf) r8
            android.view.ViewGroup r0 = r8.a
            android.view.View r2 = r8.b
            r0.endViewTransition(r2)
            ag r0 = r8.c
            r0.d()
            return
        L1ae:
            androidx.activity.ComponentActivity r8 = (androidx.activity.ComponentActivity) r8     // Catch: java.lang.NullPointerException -> L1b4 java.lang.IllegalStateException -> L1b6
            androidx.activity.ComponentActivity.g(r8)     // Catch: java.lang.NullPointerException -> L1b4 java.lang.IllegalStateException -> L1b6
            goto L1d2
        L1b4:
            r0 = move-exception
            goto L1b8
        L1b6:
            r0 = move-exception
            goto L1c6
        L1b8:
            java.lang.String r2 = r0.getMessage()
            java.lang.String r3 = "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference"
            boolean r2 = android.text.TextUtils.equals(r2, r3)
            if (r2 == 0) goto L1c5
            goto L1d2
        L1c5:
            throw r0
        L1c6:
            java.lang.String r2 = r0.getMessage()
            java.lang.String r3 = "Can not perform this action after onSaveInstanceState"
            boolean r2 = android.text.TextUtils.equals(r2, r3)
            if (r2 == 0) goto L1d3
        L1d2:
            return
        L1d3:
            throw r0
        L1d4:
            u7 r8 = (defpackage.u7) r8
            r5 = 0
            r8.c = r5
            wd r0 = r8.e
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r0
            ma0 r2 = r0.M
            if (r2 == 0) goto L1ed
            boolean r2 = r2.f()
            if (r2 == 0) goto L1ed
            int r0 = r8.b
            r8.a(r0)
            goto L1f7
        L1ed:
            int r2 = r0.L
            r4 = 2
            if (r2 != r4) goto L1f7
            int r2 = r8.b
            r0.C(r2)
        L1f7:
            return
        L1f8:
            r17 = 0
            lr r8 = (defpackage.lr) r8
            kh r0 = r8.c
            x6 r2 = r8.a
            boolean r3 = r8.o
            if (r3 != 0) goto L206
            goto L284
        L206:
            boolean r3 = r8.m
            if (r3 == 0) goto L21d
            r5 = 0
            r8.m = r5
            long r3 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
            r2.e = r3
            r5 = -1
            r2.g = r5
            r2.f = r3
            r3 = 1056964608(0x3f000000, float:0.5)
            r2.h = r3
        L21d:
            long r3 = r2.g
            int r3 = (r3 > r17 ? 1 : (r3 == r17 ? 0 : -1))
            if (r3 <= 0) goto L233
            long r3 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
            long r5 = r2.g
            int r7 = r2.i
            long r9 = (long) r7
            long r5 = r5 + r9
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 <= 0) goto L233
        L231:
            r5 = 0
            goto L23a
        L233:
            boolean r3 = r8.e()
            if (r3 != 0) goto L23d
            goto L231
        L23a:
            r8.o = r5
            goto L284
        L23d:
            r5 = 0
            boolean r3 = r8.n
            if (r3 == 0) goto L258
            r8.n = r5
            long r9 = android.os.SystemClock.uptimeMillis()
            r15 = 0
            r16 = 0
            r13 = 3
            r14 = 0
            r11 = r9
            android.view.MotionEvent r3 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            r0.onTouchEvent(r3)
            r3.recycle()
        L258:
            long r3 = r2.f
            int r3 = (r3 > r17 ? 1 : (r3 == r17 ? 0 : -1))
            if (r3 == 0) goto L285
            long r3 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
            float r5 = r2.a(r3)
            r6 = -1065353216(0xffffffffc0800000, float:-4.0)
            float r6 = r6 * r5
            float r6 = r6 * r5
            r7 = 1082130432(0x40800000, float:4.0)
            float r5 = r5 * r7
            float r5 = r5 + r6
            long r6 = r2.f
            long r6 = r3 - r6
            r2.f = r3
            float r3 = (float) r6
            float r3 = r3 * r5
            float r2 = r2.d
            float r3 = r3 * r2
            int r2 = (int) r3
            kh r3 = r8.q
            defpackage.mr.b(r3, r2)
            java.util.WeakHashMap r2 = defpackage.ja0.a
            defpackage.s90.m(r0, r1)
        L284:
            return
        L285:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r2 = "Cannot compute scroll delta before calling start()"
            r0.<init>(r2)
            throw r0
    }
}
