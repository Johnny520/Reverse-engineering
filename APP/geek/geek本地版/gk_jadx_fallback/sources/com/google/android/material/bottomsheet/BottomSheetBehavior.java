package com.google.android.material.bottomsheet;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class BottomSheetBehavior<V extends android.view.View> extends defpackage.wd {
    public final defpackage.u7 A;
    public final android.animation.ValueAnimator B;
    public final int C;
    public int D;
    public int E;
    public final float F;
    public int G;
    public final float H;
    public boolean I;
    public boolean J;
    public final boolean K;
    public int L;
    public defpackage.ma0 M;
    public boolean N;
    public int O;
    public boolean P;
    public final float Q;
    public int R;
    public int S;
    public int T;
    public java.lang.ref.WeakReference U;
    public java.lang.ref.WeakReference V;
    public final java.util.ArrayList W;
    public android.view.VelocityTracker X;
    public int Y;
    public int Z;
    public final int a;
    public boolean a0;
    public boolean b;
    public java.util.HashMap b0;
    public final float c;
    public final android.util.SparseIntArray c0;
    public final int d;
    public final defpackage.s7 d0;
    public int e;
    public boolean f;
    public int g;
    public final int h;
    public final defpackage.eu i;
    public final android.content.res.ColorStateList j;
    public final int k;
    public final int l;
    public int m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public int v;
    public int w;
    public final boolean x;
    public final defpackage.f30 y;
    public boolean z;

    public BottomSheetBehavior() {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.a = r0
            r0 = 1
            r3.b = r0
            r1 = -1
            r3.k = r1
            r3.l = r1
            u7 r2 = new u7
            r2.<init>(r3)
            r3.A = r2
            r2 = 1056964608(0x3f000000, float:0.5)
            r3.F = r2
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            r3.H = r2
            r3.K = r0
            r0 = 4
            r3.L = r0
            r0 = 1036831949(0x3dcccccd, float:0.1)
            r3.Q = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.W = r0
            r3.Z = r1
            android.util.SparseIntArray r0 = new android.util.SparseIntArray
            r0.<init>()
            r3.c0 = r0
            s7 r0 = new s7
            r1 = 0
            r0.<init>(r3, r1)
            r3.d0 = r0
            return
    }

    public BottomSheetBehavior(android.content.Context r13, android.util.AttributeSet r14) {
            r12 = this;
            r12.<init>()
            r0 = 0
            r12.a = r0
            r1 = 1
            r12.b = r1
            r2 = -1
            r12.k = r2
            r12.l = r2
            u7 r3 = new u7
            r3.<init>(r12)
            r12.A = r3
            r3 = 1056964608(0x3f000000, float:0.5)
            r12.F = r3
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            r12.H = r4
            r12.K = r1
            r5 = 4
            r12.L = r5
            r6 = 1036831949(0x3dcccccd, float:0.1)
            r12.Q = r6
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r12.W = r6
            r12.Z = r2
            android.util.SparseIntArray r6 = new android.util.SparseIntArray
            r6.<init>()
            r12.c0 = r6
            s7 r6 = new s7
            r6.<init>(r12, r0)
            r12.d0 = r6
            android.content.res.Resources r6 = r13.getResources()
            r7 = 2131165884(0x7f0702bc, float:1.7945998E38)
            int r6 = r6.getDimensionPixelSize(r7)
            r12.h = r6
            int[] r6 = defpackage.wy.a
            android.content.res.TypedArray r6 = r13.obtainStyledAttributes(r14, r6)
            r7 = 3
            boolean r8 = r6.hasValue(r7)
            if (r8 == 0) goto L5e
            android.content.res.ColorStateList r8 = defpackage.ct.n(r13, r6, r7)
            r12.j = r8
        L5e:
            r8 = 21
            boolean r8 = r6.hasValue(r8)
            if (r8 == 0) goto L76
            r8 = 2130968694(0x7f040076, float:1.7546049E38)
            r9 = 2131821360(0x7f110330, float:1.927546E38)
            e30 r14 = defpackage.f30.b(r13, r14, r8, r9)
            f30 r14 = r14.a()
            r12.y = r14
        L76:
            f30 r14 = r12.y
            if (r14 != 0) goto L7b
            goto La5
        L7b:
            eu r8 = new eu
            r8.<init>(r14)
            r12.i = r8
            r8.h(r13)
            android.content.res.ColorStateList r14 = r12.j
            if (r14 == 0) goto L8f
            eu r8 = r12.i
            r8.j(r14)
            goto La5
        L8f:
            android.util.TypedValue r14 = new android.util.TypedValue
            r14.<init>()
            android.content.res.Resources$Theme r8 = r13.getTheme()
            r9 = 16842801(0x1010031, float:2.3693695E-38)
            r8.resolveAttribute(r9, r14, r1)
            eu r8 = r12.i
            int r14 = r14.data
            r8.setTint(r14)
        La5:
            float r14 = r12.s()
            r8 = 2
            float[] r9 = new float[r8]
            r9[r0] = r14
            r14 = 1065353216(0x3f800000, float:1.0)
            r9[r1] = r14
            android.animation.ValueAnimator r9 = android.animation.ValueAnimator.ofFloat(r9)
            r12.B = r9
            r10 = 500(0x1f4, double:2.47E-321)
            r9.setDuration(r10)
            android.animation.ValueAnimator r9 = r12.B
            q7 r10 = new q7
            r10.<init>(r0, r12)
            r9.addUpdateListener(r10)
            float r4 = r6.getDimension(r8, r4)
            r12.H = r4
            boolean r4 = r6.hasValue(r0)
            if (r4 == 0) goto Ld9
            int r4 = r6.getDimensionPixelSize(r0, r2)
            r12.k = r4
        Ld9:
            boolean r4 = r6.hasValue(r1)
            if (r4 == 0) goto Le5
            int r4 = r6.getDimensionPixelSize(r1, r2)
            r12.l = r4
        Le5:
            r4 = 9
            android.util.TypedValue r8 = r6.peekValue(r4)
            if (r8 == 0) goto Lf5
            int r8 = r8.data
            if (r8 != r2) goto Lf5
            r12.A(r8)
            goto Lfc
        Lf5:
            int r2 = r6.getDimensionPixelSize(r4, r2)
            r12.A(r2)
        Lfc:
            r2 = 8
            boolean r2 = r6.getBoolean(r2, r0)
            boolean r4 = r12.I
            r8 = 5
            if (r4 == r2) goto L115
            r12.I = r2
            if (r2 != 0) goto L112
            int r2 = r12.L
            if (r2 != r8) goto L112
            r12.B(r5)
        L112:
            r12.F()
        L115:
            r2 = 13
            boolean r2 = r6.getBoolean(r2, r0)
            r12.n = r2
            r2 = 6
            boolean r4 = r6.getBoolean(r2, r1)
            boolean r9 = r12.b
            if (r9 != r4) goto L127
            goto L146
        L127:
            r12.b = r4
            java.lang.ref.WeakReference r4 = r12.U
            if (r4 == 0) goto L130
            r12.r()
        L130:
            boolean r4 = r12.b
            if (r4 == 0) goto L139
            int r4 = r12.L
            if (r4 != r2) goto L139
            goto L13b
        L139:
            int r7 = r12.L
        L13b:
            r12.C(r7)
            int r2 = r12.L
            r12.G(r2, r1)
            r12.F()
        L146:
            r2 = 12
            boolean r2 = r6.getBoolean(r2, r0)
            r12.J = r2
            boolean r2 = r6.getBoolean(r5, r1)
            r12.K = r2
            r2 = 10
            int r2 = r6.getInt(r2, r0)
            r12.a = r2
            r2 = 7
            float r2 = r6.getFloat(r2, r3)
            r3 = 0
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 <= 0) goto L202
            int r3 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r3 >= 0) goto L202
            r12.F = r2
            java.lang.ref.WeakReference r3 = r12.U
            if (r3 == 0) goto L178
            int r3 = r12.T
            float r3 = (float) r3
            float r14 = r14 - r2
            float r14 = r14 * r3
            int r14 = (int) r14
            r12.E = r14
        L178:
            android.util.TypedValue r14 = r6.peekValue(r8)
            java.lang.String r2 = "offset must be greater than or equal to 0"
            r3 = 16
            if (r14 == 0) goto L198
            int r4 = r14.type
            if (r4 != r3) goto L198
            int r14 = r14.data
            if (r14 < 0) goto L192
            r12.C = r14
            int r14 = r12.L
            r12.G(r14, r1)
            goto L1a5
        L192:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            r13.<init>(r2)
            throw r13
        L198:
            int r14 = r6.getDimensionPixelOffset(r8, r0)
            if (r14 < 0) goto L1fc
            r12.C = r14
            int r14 = r12.L
            r12.G(r14, r1)
        L1a5:
            r14 = 11
            r2 = 500(0x1f4, float:7.0E-43)
            int r14 = r6.getInt(r14, r2)
            r12.d = r14
            r14 = 17
            boolean r14 = r6.getBoolean(r14, r0)
            r12.o = r14
            r14 = 18
            boolean r14 = r6.getBoolean(r14, r0)
            r12.p = r14
            r14 = 19
            boolean r14 = r6.getBoolean(r14, r0)
            r12.q = r14
            r14 = 20
            boolean r14 = r6.getBoolean(r14, r1)
            r12.r = r14
            r14 = 14
            boolean r14 = r6.getBoolean(r14, r0)
            r12.s = r14
            r14 = 15
            boolean r14 = r6.getBoolean(r14, r0)
            r12.t = r14
            boolean r14 = r6.getBoolean(r3, r0)
            r12.u = r14
            r14 = 23
            boolean r14 = r6.getBoolean(r14, r1)
            r12.x = r14
            r6.recycle()
            android.view.ViewConfiguration r13 = android.view.ViewConfiguration.get(r13)
            int r13 = r13.getScaledMaximumFlingVelocity()
            float r13 = (float) r13
            r12.c = r13
            return
        L1fc:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            r13.<init>(r2)
            throw r13
        L202:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r14 = "ratio must be a float value between 0 and 1"
            r13.<init>(r14)
            throw r13
    }

    public static android.view.View v(android.view.View r3) {
            int r0 = r3.getVisibility()
            if (r0 == 0) goto L7
            goto L2b
        L7:
            java.util.WeakHashMap r0 = defpackage.ja0.a
            boolean r0 = defpackage.y90.p(r3)
            if (r0 == 0) goto L10
            return r3
        L10:
            boolean r0 = r3 instanceof android.view.ViewGroup
            if (r0 == 0) goto L2b
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            int r0 = r3.getChildCount()
            r1 = 0
        L1b:
            if (r1 >= r0) goto L2b
            android.view.View r2 = r3.getChildAt(r1)
            android.view.View r2 = v(r2)
            if (r2 == 0) goto L28
            return r2
        L28:
            int r1 = r1 + 1
            goto L1b
        L2b:
            r3 = 0
            return r3
    }

    public static int w(int r0, int r1, int r2, int r3) {
            int r0 = android.view.ViewGroup.getChildMeasureSpec(r0, r1, r3)
            r1 = -1
            if (r2 != r1) goto L8
            return r0
        L8:
            int r1 = android.view.View.MeasureSpec.getMode(r0)
            int r0 = android.view.View.MeasureSpec.getSize(r0)
            r3 = 1073741824(0x40000000, float:2.0)
            if (r1 == r3) goto L22
            if (r0 != 0) goto L17
            goto L1b
        L17:
            int r2 = java.lang.Math.min(r0, r2)
        L1b:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
            return r0
        L22:
            int r0 = java.lang.Math.min(r0, r2)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            return r0
    }

    public final void A(int r2) {
            r1 = this;
            r0 = -1
            if (r2 != r0) goto Lb
            boolean r2 = r1.f
            if (r2 != 0) goto L14
            r2 = 1
            r1.f = r2
            goto L1e
        Lb:
            boolean r0 = r1.f
            if (r0 != 0) goto L15
            int r0 = r1.e
            if (r0 == r2) goto L14
            goto L15
        L14:
            return
        L15:
            r0 = 0
            r1.f = r0
            int r2 = java.lang.Math.max(r0, r2)
            r1.e = r2
        L1e:
            r1.I()
            return
    }

    public final void B(int r5) {
            r4 = this;
            r0 = 1
            if (r5 == r0) goto L6c
            r1 = 2
            if (r5 != r1) goto L7
            goto L6c
        L7:
            boolean r0 = r4.I
            if (r0 != 0) goto L22
            r0 = 5
            if (r5 != r0) goto L22
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Cannot set state: "
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.String r0 = "BottomSheetBehavior"
            android.util.Log.w(r0, r5)
            return
        L22:
            r0 = 6
            if (r5 != r0) goto L33
            boolean r0 = r4.b
            if (r0 == 0) goto L33
            int r0 = r4.y(r5)
            int r1 = r4.D
            if (r0 > r1) goto L33
            r0 = 3
            goto L34
        L33:
            r0 = r5
        L34:
            java.lang.ref.WeakReference r1 = r4.U
            if (r1 == 0) goto L68
            java.lang.Object r1 = r1.get()
            if (r1 != 0) goto L3f
            goto L68
        L3f:
            java.lang.ref.WeakReference r5 = r4.U
            java.lang.Object r5 = r5.get()
            android.view.View r5 = (android.view.View) r5
            y4 r1 = new y4
            r1.<init>(r4, r5, r0)
            android.view.ViewParent r0 = r5.getParent()
            if (r0 == 0) goto L64
            boolean r0 = r0.isLayoutRequested()
            if (r0 == 0) goto L64
            java.util.WeakHashMap r0 = defpackage.ja0.a
            boolean r0 = defpackage.v90.b(r5)
            if (r0 == 0) goto L64
            r5.post(r1)
            return
        L64:
            r1.run()
            return
        L68:
            r4.C(r5)
            return
        L6c:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "STATE_"
            r2.<init>(r3)
            if (r5 != r0) goto L7a
            java.lang.String r5 = "DRAGGING"
            goto L7c
        L7a:
            java.lang.String r5 = "SETTLING"
        L7c:
            java.lang.String r0 = " should not be set externally."
            java.lang.String r5 = defpackage.z30.l(r2, r5, r0)
            r1.<init>(r5)
            throw r1
    }

    public final void C(int r7) {
            r6 = this;
            int r0 = r6.L
            if (r0 != r7) goto L5
            goto L20
        L5:
            r6.L = r7
            r0 = 5
            r1 = 6
            r2 = 3
            r3 = 4
            if (r7 == r3) goto L13
            if (r7 == r2) goto L13
            if (r7 == r1) goto L13
            boolean r4 = r6.I
        L13:
            java.lang.ref.WeakReference r4 = r6.U
            if (r4 != 0) goto L18
            goto L20
        L18:
            java.lang.Object r4 = r4.get()
            android.view.View r4 = (android.view.View) r4
            if (r4 != 0) goto L21
        L20:
            return
        L21:
            r4 = 0
            r5 = 1
            if (r7 != r2) goto L29
            r6.H(r5)
            goto L32
        L29:
            if (r7 == r1) goto L2f
            if (r7 == r0) goto L2f
            if (r7 != r3) goto L32
        L2f:
            r6.H(r4)
        L32:
            r6.G(r7, r5)
            java.util.ArrayList r7 = r6.W
            int r0 = r7.size()
            if (r0 > 0) goto L41
            r6.F()
            return
        L41:
            java.lang.Object r7 = r7.get(r4)
            r7.getClass()
            java.lang.ClassCastException r7 = new java.lang.ClassCastException
            r7.<init>()
            throw r7
    }

    public final boolean D(android.view.View r5, float r6) {
            r4 = this;
            boolean r0 = r4.J
            r1 = 1
            if (r0 == 0) goto L6
            return r1
        L6:
            int r0 = r5.getTop()
            int r2 = r4.G
            r3 = 0
            if (r0 >= r2) goto L10
            return r3
        L10:
            int r0 = r4.t()
            int r5 = r5.getTop()
            float r5 = (float) r5
            float r2 = r4.Q
            float r6 = r6 * r2
            float r6 = r6 + r5
            int r5 = r4.G
            float r5 = (float) r5
            float r6 = r6 - r5
            float r5 = java.lang.Math.abs(r6)
            float r6 = (float) r0
            float r5 = r5 / r6
            r6 = 1056964608(0x3f000000, float:0.5)
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 <= 0) goto L2e
            return r1
        L2e:
            return r3
    }

    public final void E(android.view.View r3, int r4, boolean r5) {
            r2 = this;
            int r0 = r2.y(r4)
            ma0 r1 = r2.M
            if (r1 == 0) goto L40
            if (r5 == 0) goto L15
            int r3 = r3.getLeft()
            boolean r3 = r1.o(r3, r0)
            if (r3 == 0) goto L40
            goto L32
        L15:
            int r5 = r3.getLeft()
            r1.r = r3
            r3 = -1
            r1.c = r3
            r3 = 0
            boolean r3 = r1.h(r5, r0, r3, r3)
            if (r3 != 0) goto L30
            int r5 = r1.a
            if (r5 != 0) goto L30
            android.view.View r5 = r1.r
            if (r5 == 0) goto L30
            r5 = 0
            r1.r = r5
        L30:
            if (r3 == 0) goto L40
        L32:
            r3 = 2
            r2.C(r3)
            r3 = 1
            r2.G(r4, r3)
            u7 r3 = r2.A
            r3.a(r4)
            return
        L40:
            r2.C(r4)
            return
    }

    public final void F() {
            r15 = this;
            java.lang.ref.WeakReference r0 = r15.U
            if (r0 == 0) goto L13e
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 != 0) goto Le
            goto L13e
        Le:
            r1 = 524288(0x80000, float:7.34684E-40)
            defpackage.ja0.i(r0, r1)
            r1 = 0
            defpackage.ja0.g(r0, r1)
            r2 = 262144(0x40000, float:3.67342E-40)
            defpackage.ja0.i(r0, r2)
            defpackage.ja0.g(r0, r1)
            r2 = 1048576(0x100000, float:1.469368E-39)
            defpackage.ja0.i(r0, r2)
            defpackage.ja0.g(r0, r1)
            android.util.SparseIntArray r2 = r15.c0
            r3 = -1
            int r4 = r2.get(r1, r3)
            if (r4 == r3) goto L39
            defpackage.ja0.i(r0, r4)
            defpackage.ja0.g(r0, r1)
            r2.delete(r1)
        L39:
            boolean r4 = r15.b
            r5 = 6
            if (r4 != 0) goto Lec
            int r4 = r15.L
            if (r4 == r5) goto Lec
            r4 = 2131755041(0x7f100021, float:1.914095E38)
            android.content.res.Resources r6 = r0.getResources()
            java.lang.String r10 = r6.getString(r4)
            f2 r11 = new f2
            r11.<init>(r15, r5)
            java.util.ArrayList r4 = defpackage.ja0.e(r0)
            r6 = r1
        L57:
            int r7 = r4.size()
            if (r6 >= r7) goto L80
            java.lang.Object r7 = r4.get(r6)
            h0 r7 = (defpackage.h0) r7
            java.lang.Object r7 = r7.a
            android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r7 = (android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction) r7
            java.lang.CharSequence r7 = r7.getLabel()
            boolean r7 = android.text.TextUtils.equals(r10, r7)
            if (r7 == 0) goto L7d
            java.lang.Object r4 = r4.get(r6)
            h0 r4 = (defpackage.h0) r4
            int r4 = r4.a()
            r9 = r4
            goto Lae
        L7d:
            int r6 = r6 + 1
            goto L57
        L80:
            r7 = r1
            r6 = r3
        L82:
            int[] r8 = defpackage.ja0.d
            int r9 = r8.length
            if (r7 >= r9) goto Lad
            if (r6 != r3) goto Lad
            r8 = r8[r7]
            r9 = 1
            r12 = r1
            r13 = r9
        L8e:
            int r14 = r4.size()
            if (r12 >= r14) goto La7
            java.lang.Object r14 = r4.get(r12)
            h0 r14 = (defpackage.h0) r14
            int r14 = r14.a()
            if (r14 == r8) goto La2
            r14 = r9
            goto La3
        La2:
            r14 = r1
        La3:
            r13 = r13 & r14
            int r12 = r12 + 1
            goto L8e
        La7:
            if (r13 == 0) goto Laa
            r6 = r8
        Laa:
            int r7 = r7 + 1
            goto L82
        Lad:
            r9 = r6
        Lae:
            if (r9 == r3) goto Le9
            h0 r7 = new h0
            r8 = 0
            r12 = 0
            r7.<init>(r8, r9, r10, r11, r12)
            android.view.View$AccessibilityDelegate r3 = defpackage.ja0.c(r0)
            if (r3 != 0) goto Lbf
            r3 = 0
            goto Lce
        Lbf:
            boolean r4 = r3 instanceof defpackage.v
            if (r4 == 0) goto Lc8
            v r3 = (defpackage.v) r3
            x r3 = r3.a
            goto Lce
        Lc8:
            x r4 = new x
            r4.<init>(r3)
            r3 = r4
        Lce:
            if (r3 != 0) goto Ld5
            x r3 = new x
            r3.<init>()
        Ld5:
            defpackage.ja0.l(r0, r3)
            int r3 = r7.a()
            defpackage.ja0.i(r0, r3)
            java.util.ArrayList r3 = defpackage.ja0.e(r0)
            r3.add(r7)
            defpackage.ja0.g(r0, r1)
        Le9:
            r2.put(r1, r9)
        Lec:
            boolean r1 = r15.I
            if (r1 == 0) goto Lff
            int r1 = r15.L
            r2 = 5
            if (r1 == r2) goto Lff
            h0 r1 = defpackage.h0.j
            f2 r3 = new f2
            r3.<init>(r15, r2)
            defpackage.ja0.j(r0, r1, r3)
        Lff:
            int r1 = r15.L
            r2 = 4
            r3 = 3
            if (r1 == r3) goto L12f
            if (r1 == r2) goto L11f
            if (r1 == r5) goto L10a
            goto L13e
        L10a:
            h0 r1 = defpackage.h0.i
            f2 r4 = new f2
            r4.<init>(r15, r2)
            defpackage.ja0.j(r0, r1, r4)
            h0 r1 = defpackage.h0.h
            f2 r2 = new f2
            r2.<init>(r15, r3)
            defpackage.ja0.j(r0, r1, r2)
            return
        L11f:
            boolean r1 = r15.b
            if (r1 == 0) goto L124
            r5 = r3
        L124:
            h0 r1 = defpackage.h0.h
            f2 r2 = new f2
            r2.<init>(r15, r5)
            defpackage.ja0.j(r0, r1, r2)
            return
        L12f:
            boolean r1 = r15.b
            if (r1 == 0) goto L134
            r5 = r2
        L134:
            h0 r1 = defpackage.h0.i
            f2 r2 = new f2
            r2.<init>(r15, r5)
            defpackage.ja0.j(r0, r1, r2)
        L13e:
            return
    }

    public final void G(int r7, boolean r8) {
            r6 = this;
            r0 = 2
            if (r7 != r0) goto L5
            goto L6f
        L5:
            int r7 = r6.L
            r1 = 3
            r2 = 0
            r3 = 1
            if (r7 != r1) goto L18
            boolean r7 = r6.x
            if (r7 != 0) goto L16
            boolean r7 = r6.z()
            if (r7 == 0) goto L18
        L16:
            r7 = r3
            goto L19
        L18:
            r7 = r2
        L19:
            boolean r1 = r6.z
            if (r1 == r7) goto L6f
            eu r1 = r6.i
            if (r1 != 0) goto L22
            goto L6f
        L22:
            r6.z = r7
            android.animation.ValueAnimator r4 = r6.B
            r5 = 1065353216(0x3f800000, float:1.0)
            if (r8 == 0) goto L4d
            if (r4 == 0) goto L4d
            boolean r8 = r4.isRunning()
            if (r8 == 0) goto L36
            r4.reverse()
            return
        L36:
            du r8 = r1.a
            float r8 = r8.i
            if (r7 == 0) goto L40
            float r5 = r6.s()
        L40:
            float[] r7 = new float[r0]
            r7[r2] = r8
            r7[r3] = r5
            r4.setFloatValues(r7)
            r4.start()
            return
        L4d:
            if (r4 == 0) goto L58
            boolean r7 = r4.isRunning()
            if (r7 == 0) goto L58
            r4.cancel()
        L58:
            boolean r7 = r6.z
            if (r7 == 0) goto L60
            float r5 = r6.s()
        L60:
            du r7 = r1.a
            float r8 = r7.i
            int r8 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r8 == 0) goto L6f
            r7.i = r5
            r1.e = r3
            r1.invalidateSelf()
        L6f:
            return
    }

    public final void H(boolean r7) {
            r6 = this;
            java.lang.ref.WeakReference r0 = r6.U
            if (r0 != 0) goto L5
            goto L4e
        L5:
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            android.view.ViewParent r0 = r0.getParent()
            boolean r1 = r0 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout
            if (r1 != 0) goto L14
            goto L4e
        L14:
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            int r1 = r0.getChildCount()
            if (r7 == 0) goto L27
            java.util.HashMap r2 = r6.b0
            if (r2 != 0) goto L4e
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>(r1)
            r6.b0 = r2
        L27:
            r2 = 0
        L28:
            if (r2 >= r1) goto L49
            android.view.View r3 = r0.getChildAt(r2)
            java.lang.ref.WeakReference r4 = r6.U
            java.lang.Object r4 = r4.get()
            if (r3 != r4) goto L37
            goto L46
        L37:
            if (r7 == 0) goto L46
            java.util.HashMap r4 = r6.b0
            int r5 = r3.getImportantForAccessibility()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4.put(r3, r5)
        L46:
            int r2 = r2 + 1
            goto L28
        L49:
            if (r7 != 0) goto L4e
            r7 = 0
            r6.b0 = r7
        L4e:
            return
    }

    public final void I() {
            r2 = this;
            java.lang.ref.WeakReference r0 = r2.U
            if (r0 == 0) goto L19
            r2.r()
            int r0 = r2.L
            r1 = 4
            if (r0 != r1) goto L19
            java.lang.ref.WeakReference r0 = r2.U
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L19
            r0.requestLayout()
        L19:
            return
    }

    @Override // defpackage.wd
    public final void c(defpackage.zd r1) {
            r0 = this;
            r1 = 0
            r0.U = r1
            r0.M = r1
            return
    }

    @Override // defpackage.wd
    public final void e() {
            r1 = this;
            r0 = 0
            r1.U = r0
            r1.M = r0
            return
    }

    @Override // defpackage.wd
    public final boolean f(androidx.coordinatorlayout.widget.CoordinatorLayout r10, android.view.View r11, android.view.MotionEvent r12) {
            r9 = this;
            boolean r0 = r11.isShown()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto Ldc
            boolean r0 = r9.K
            if (r0 != 0) goto Le
            goto Ldc
        Le:
            int r0 = r12.getActionMasked()
            r3 = 0
            r4 = -1
            if (r0 != 0) goto L23
            r9.Y = r4
            r9.Z = r4
            android.view.VelocityTracker r5 = r9.X
            if (r5 == 0) goto L23
            r5.recycle()
            r9.X = r3
        L23:
            android.view.VelocityTracker r5 = r9.X
            if (r5 != 0) goto L2d
            android.view.VelocityTracker r5 = android.view.VelocityTracker.obtain()
            r9.X = r5
        L2d:
            android.view.VelocityTracker r5 = r9.X
            r5.addMovement(r12)
            r5 = 2
            if (r0 == 0) goto L46
            if (r0 == r2) goto L3b
            r11 = 3
            if (r0 == r11) goto L3b
            goto L89
        L3b:
            r9.a0 = r1
            r9.Y = r4
            boolean r11 = r9.N
            if (r11 == 0) goto L89
            r9.N = r1
            return r1
        L46:
            float r6 = r12.getX()
            int r6 = (int) r6
            float r7 = r12.getY()
            int r7 = (int) r7
            r9.Z = r7
            int r7 = r9.L
            if (r7 == r5) goto L78
            java.lang.ref.WeakReference r7 = r9.V
            if (r7 == 0) goto L61
            java.lang.Object r7 = r7.get()
            android.view.View r7 = (android.view.View) r7
            goto L62
        L61:
            r7 = r3
        L62:
            if (r7 == 0) goto L78
            int r8 = r9.Z
            boolean r7 = r10.o(r7, r6, r8)
            if (r7 == 0) goto L78
            int r7 = r12.getActionIndex()
            int r7 = r12.getPointerId(r7)
            r9.Y = r7
            r9.a0 = r2
        L78:
            int r7 = r9.Y
            if (r7 != r4) goto L86
            int r7 = r9.Z
            boolean r11 = r10.o(r11, r6, r7)
            if (r11 != 0) goto L86
            r11 = r2
            goto L87
        L86:
            r11 = r1
        L87:
            r9.N = r11
        L89:
            boolean r11 = r9.N
            if (r11 != 0) goto L98
            ma0 r11 = r9.M
            if (r11 == 0) goto L98
            boolean r11 = r11.p(r12)
            if (r11 == 0) goto L98
            goto Lda
        L98:
            java.lang.ref.WeakReference r11 = r9.V
            if (r11 == 0) goto La3
            java.lang.Object r11 = r11.get()
            r3 = r11
            android.view.View r3 = (android.view.View) r3
        La3:
            if (r0 != r5) goto Ldb
            if (r3 == 0) goto Ldb
            boolean r11 = r9.N
            if (r11 != 0) goto Ldb
            int r11 = r9.L
            if (r11 == r2) goto Ldb
            float r11 = r12.getX()
            int r11 = (int) r11
            float r0 = r12.getY()
            int r0 = (int) r0
            boolean r10 = r10.o(r3, r11, r0)
            if (r10 != 0) goto Ldb
            ma0 r10 = r9.M
            if (r10 == 0) goto Ldb
            int r10 = r9.Z
            if (r10 == r4) goto Ldb
            float r10 = (float) r10
            float r11 = r12.getY()
            float r10 = r10 - r11
            float r10 = java.lang.Math.abs(r10)
            ma0 r11 = r9.M
            int r11 = r11.b
            float r11 = (float) r11
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r10 <= 0) goto Ldb
        Lda:
            return r2
        Ldb:
            return r1
        Ldc:
            r9.N = r2
            return r1
    }

    @Override // defpackage.wd
    public final boolean g(androidx.coordinatorlayout.widget.CoordinatorLayout r10, android.view.View r11, int r12) {
            r9 = this;
            java.util.WeakHashMap r0 = defpackage.ja0.a
            boolean r0 = defpackage.s90.b(r10)
            r1 = 1
            if (r0 == 0) goto L12
            boolean r0 = defpackage.s90.b(r11)
            if (r0 != 0) goto L12
            r11.setFitsSystemWindows(r1)
        L12:
            java.lang.ref.WeakReference r0 = r9.U
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 0
            if (r0 != 0) goto L11e
            android.content.res.Resources r0 = r10.getResources()
            r4 = 2131165293(0x7f07006d, float:1.79448E38)
            int r0 = r0.getDimensionPixelSize(r4)
            r9.g = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r4 = 29
            if (r0 < r4) goto L36
            boolean r4 = r9.n
            if (r4 != 0) goto L36
            boolean r4 = r9.f
            if (r4 != 0) goto L36
            r4 = r1
            goto L37
        L36:
            r4 = r3
        L37:
            boolean r5 = r9.o
            if (r5 != 0) goto L52
            boolean r5 = r9.p
            if (r5 != 0) goto L52
            boolean r5 = r9.q
            if (r5 != 0) goto L52
            boolean r5 = r9.s
            if (r5 != 0) goto L52
            boolean r5 = r9.t
            if (r5 != 0) goto L52
            boolean r5 = r9.u
            if (r5 != 0) goto L52
            if (r4 != 0) goto L52
            goto L8d
        L52:
            r7 r5 = new r7
            r5.<init>(r9, r4)
            ab0 r4 = new ab0
            int r6 = defpackage.t90.f(r11)
            r11.getPaddingTop()
            int r7 = defpackage.t90.e(r11)
            int r8 = r11.getPaddingBottom()
            r4.<init>()
            r4.a = r6
            r4.b = r7
            r4.c = r8
            d4 r6 = new d4
            r7 = 20
            r6.<init>(r5, r4, r7, r3)
            defpackage.y90.u(r11, r6)
            boolean r4 = defpackage.v90.b(r11)
            if (r4 == 0) goto L85
            defpackage.w90.c(r11)
            goto L8d
        L85:
            wn r4 = new wn
            r4.<init>(r1)
            r11.addOnAttachStateChangeListener(r4)
        L8d:
            ad r4 = new ad
            r4.<init>(r11)
            r5 = 30
            if (r0 < r5) goto L9f
            dc0 r0 = new dc0
            r0.<init>(r4)
            defpackage.d0.o(r11, r0)
            goto Lb6
        L9f:
            r0 = 2131296645(0x7f090185, float:1.8211213E38)
            java.lang.Object r0 = r11.getTag(r0)
            bc0 r5 = new bc0
            r5.<init>(r11, r4)
            r4 = 2131296653(0x7f09018d, float:1.8211229E38)
            r11.setTag(r4, r5)
            if (r0 != 0) goto Lb6
            r11.setOnApplyWindowInsetsListener(r5)
        Lb6:
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r11)
            r9.U = r0
            android.content.Context r0 = r11.getContext()
            r4 = 0
            android.view.animation.PathInterpolator r4 = defpackage.nx.b(r4, r4, r4, r2)
            r5 = 2130969356(0x7f04030c, float:1.7547392E38)
            defpackage.ct.w(r0, r5, r4)
            r4 = 2130969339(0x7f0402fb, float:1.7547357E38)
            r5 = 300(0x12c, float:4.2E-43)
            defpackage.ct.v(r0, r4, r5)
            r4 = 2130969344(0x7f040300, float:1.7547367E38)
            r5 = 150(0x96, float:2.1E-43)
            defpackage.ct.v(r0, r4, r5)
            r4 = 2130969343(0x7f0402ff, float:1.7547365E38)
            r5 = 100
            defpackage.ct.v(r0, r4, r5)
            android.content.res.Resources r0 = r11.getResources()
            r4 = 2131165356(0x7f0700ac, float:1.7944927E38)
            r0.getDimension(r4)
            r4 = 2131165357(0x7f0700ad, float:1.7944929E38)
            r0.getDimension(r4)
            eu r0 = r9.i
            if (r0 == 0) goto L10b
            defpackage.s90.q(r11, r0)
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r5 = r9.H
            int r4 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r4 != 0) goto L107
            float r5 = defpackage.y90.i(r11)
        L107:
            r0.i(r5)
            goto L112
        L10b:
            android.content.res.ColorStateList r0 = r9.j
            if (r0 == 0) goto L112
            defpackage.y90.q(r11, r0)
        L112:
            r9.F()
            int r0 = defpackage.s90.c(r11)
            if (r0 != 0) goto L11e
            defpackage.s90.s(r11, r1)
        L11e:
            ma0 r0 = r9.M
            if (r0 != 0) goto L12f
            ma0 r0 = new ma0
            android.content.Context r4 = r10.getContext()
            s7 r5 = r9.d0
            r0.<init>(r4, r10, r5)
            r9.M = r0
        L12f:
            int r0 = r11.getTop()
            r10.q(r11, r12)
            int r12 = r10.getWidth()
            r9.S = r12
            int r10 = r10.getHeight()
            r9.T = r10
            int r10 = r11.getHeight()
            r9.R = r10
            int r12 = r9.T
            int r10 = r12 - r10
            int r4 = r9.w
            if (r10 >= r4) goto L16b
            boolean r10 = r9.r
            int r5 = r9.l
            r6 = -1
            if (r10 == 0) goto L161
            if (r5 != r6) goto L15a
            goto L15e
        L15a:
            int r12 = java.lang.Math.min(r12, r5)
        L15e:
            r9.R = r12
            goto L16b
        L161:
            int r12 = r12 - r4
            if (r5 != r6) goto L165
            goto L169
        L165:
            int r12 = java.lang.Math.min(r12, r5)
        L169:
            r9.R = r12
        L16b:
            int r10 = r9.T
            int r12 = r9.R
            int r10 = r10 - r12
            int r10 = java.lang.Math.max(r3, r10)
            r9.D = r10
            int r10 = r9.T
            float r10 = (float) r10
            float r12 = r9.F
            float r2 = r2 - r12
            float r2 = r2 * r10
            int r10 = (int) r2
            r9.E = r10
            r9.r()
            int r10 = r9.L
            r12 = 3
            if (r10 != r12) goto L190
            int r10 = r9.x()
            r11.offsetTopAndBottom(r10)
            goto L1bc
        L190:
            r12 = 6
            if (r10 != r12) goto L199
            int r10 = r9.E
            r11.offsetTopAndBottom(r10)
            goto L1bc
        L199:
            boolean r12 = r9.I
            if (r12 == 0) goto L1a6
            r12 = 5
            if (r10 != r12) goto L1a6
            int r10 = r9.T
            r11.offsetTopAndBottom(r10)
            goto L1bc
        L1a6:
            r12 = 4
            if (r10 != r12) goto L1af
            int r10 = r9.G
            r11.offsetTopAndBottom(r10)
            goto L1bc
        L1af:
            if (r10 == r1) goto L1b4
            r12 = 2
            if (r10 != r12) goto L1bc
        L1b4:
            int r10 = r11.getTop()
            int r0 = r0 - r10
            r11.offsetTopAndBottom(r0)
        L1bc:
            int r10 = r9.L
            r9.G(r10, r3)
            java.lang.ref.WeakReference r10 = new java.lang.ref.WeakReference
            android.view.View r11 = v(r11)
            r10.<init>(r11)
            r9.V = r10
            java.util.ArrayList r10 = r9.W
            int r11 = r10.size()
            if (r11 > 0) goto L1d5
            return r1
        L1d5:
            java.lang.Object r10 = r10.get(r3)
            r10.getClass()
            java.lang.ClassCastException r10 = new java.lang.ClassCastException
            r10.<init>()
            throw r10
    }

    @Override // defpackage.wd
    public final boolean h(androidx.coordinatorlayout.widget.CoordinatorLayout r4, android.view.View r5, int r6, int r7, int r8) {
            r3 = this;
            android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            int r1 = r4.getPaddingLeft()
            int r2 = r4.getPaddingRight()
            int r2 = r2 + r1
            int r1 = r0.leftMargin
            int r2 = r2 + r1
            int r1 = r0.rightMargin
            int r2 = r2 + r1
            int r2 = r2 + r7
            int r7 = r3.k
            int r1 = r0.width
            int r6 = w(r6, r2, r7, r1)
            int r7 = r4.getPaddingTop()
            int r4 = r4.getPaddingBottom()
            int r4 = r4 + r7
            int r7 = r0.topMargin
            int r4 = r4 + r7
            int r7 = r0.bottomMargin
            int r4 = r4 + r7
            int r7 = r3.l
            int r0 = r0.height
            int r4 = w(r8, r4, r7, r0)
            r5.measure(r6, r4)
            r4 = 1
            return r4
    }

    @Override // defpackage.wd
    public final boolean i(android.view.View r2) {
            r1 = this;
            java.lang.ref.WeakReference r0 = r1.V
            if (r0 == 0) goto L12
            java.lang.Object r0 = r0.get()
            if (r2 != r0) goto L12
            int r2 = r1.L
            r0 = 3
            if (r2 != r0) goto L10
            goto L12
        L10:
            r2 = 1
            return r2
        L12:
            r2 = 0
            return r2
    }

    @Override // defpackage.wd
    public final void j(androidx.coordinatorlayout.widget.CoordinatorLayout r3, android.view.View r4, android.view.View r5, int r6, int r7, int[] r8, int r9) {
            r2 = this;
            r3 = 1
            if (r9 != r3) goto L4
            goto L66
        L4:
            java.lang.ref.WeakReference r6 = r2.V
            if (r6 == 0) goto Lf
            java.lang.Object r6 = r6.get()
            android.view.View r6 = (android.view.View) r6
            goto L10
        Lf:
            r6 = 0
        L10:
            if (r5 == r6) goto L13
            goto L66
        L13:
            int r6 = r4.getTop()
            int r9 = r6 - r7
            boolean r0 = r2.K
            if (r7 <= 0) goto L44
            int r5 = r2.x()
            if (r9 >= r5) goto L35
            int r5 = r2.x()
            int r6 = r6 - r5
            r8[r3] = r6
            int r5 = -r6
            java.util.WeakHashMap r6 = defpackage.ja0.a
            r4.offsetTopAndBottom(r5)
            r5 = 3
            r2.C(r5)
            goto L72
        L35:
            if (r0 != 0) goto L38
            goto L66
        L38:
            r8[r3] = r7
            int r5 = -r7
            java.util.WeakHashMap r6 = defpackage.ja0.a
            r4.offsetTopAndBottom(r5)
            r2.C(r3)
            goto L72
        L44:
            if (r7 >= 0) goto L72
            r1 = -1
            boolean r5 = r5.canScrollVertically(r1)
            if (r5 != 0) goto L72
            int r5 = r2.G
            if (r9 <= r5) goto L64
            boolean r9 = r2.I
            if (r9 == 0) goto L56
            goto L64
        L56:
            int r6 = r6 - r5
            r8[r3] = r6
            int r5 = -r6
            java.util.WeakHashMap r6 = defpackage.ja0.a
            r4.offsetTopAndBottom(r5)
            r5 = 4
            r2.C(r5)
            goto L72
        L64:
            if (r0 != 0) goto L67
        L66:
            return
        L67:
            r8[r3] = r7
            int r5 = -r7
            java.util.WeakHashMap r6 = defpackage.ja0.a
            r4.offsetTopAndBottom(r5)
            r2.C(r3)
        L72:
            int r4 = r4.getTop()
            r2.u(r4)
            r2.O = r7
            r2.P = r3
            return
    }

    @Override // defpackage.wd
    public final void k(androidx.coordinatorlayout.widget.CoordinatorLayout r1, android.view.View r2, int r3, int r4, int r5, int[] r6) {
            r0 = this;
            return
    }

    @Override // defpackage.wd
    public final void m(android.view.View r6, android.os.Parcelable r7) {
            r5 = this;
            t7 r7 = (defpackage.t7) r7
            r6 = 4
            r0 = 2
            r1 = 1
            int r2 = r5.a
            if (r2 != 0) goto La
            goto L34
        La:
            r3 = -1
            if (r2 == r3) goto L11
            r4 = r2 & 1
            if (r4 != r1) goto L15
        L11:
            int r4 = r7.d
            r5.e = r4
        L15:
            if (r2 == r3) goto L1b
            r4 = r2 & 2
            if (r4 != r0) goto L1f
        L1b:
            boolean r4 = r7.e
            r5.b = r4
        L1f:
            if (r2 == r3) goto L25
            r4 = r2 & 4
            if (r4 != r6) goto L29
        L25:
            boolean r4 = r7.f
            r5.I = r4
        L29:
            if (r2 == r3) goto L30
            r3 = 8
            r2 = r2 & r3
            if (r2 != r3) goto L34
        L30:
            boolean r2 = r7.g
            r5.J = r2
        L34:
            int r7 = r7.c
            if (r7 == r1) goto L3e
            if (r7 != r0) goto L3b
            goto L3e
        L3b:
            r5.L = r7
            return
        L3e:
            r5.L = r6
            return
    }

    @Override // defpackage.wd
    public final android.os.Parcelable n(android.view.View r2) {
            r1 = this;
            t7 r2 = new t7
            android.view.AbsSavedState r0 = android.view.View.BaseSavedState.EMPTY_STATE
            r2.<init>(r1)
            return r2
    }

    @Override // defpackage.wd
    public final boolean o(android.view.View r1, int r2, int r3) {
            r0 = this;
            r1 = 0
            r0.O = r1
            r0.P = r1
            r2 = r2 & 2
            if (r2 == 0) goto La
            r1 = 1
        La:
            return r1
    }

    @Override // defpackage.wd
    public final void p(android.view.View r4, android.view.View r5, int r6) {
            r3 = this;
            int r6 = r4.getTop()
            int r0 = r3.x()
            r1 = 3
            if (r6 != r0) goto Lf
            r3.C(r1)
            return
        Lf:
            java.lang.ref.WeakReference r6 = r3.V
            if (r6 == 0) goto Lb5
            java.lang.Object r6 = r6.get()
            if (r5 != r6) goto Lb5
            boolean r5 = r3.P
            if (r5 != 0) goto L1f
            goto Lb5
        L1f:
            int r5 = r3.O
            r6 = 6
            if (r5 <= 0) goto L34
            boolean r5 = r3.b
            if (r5 == 0) goto L2a
            goto Laf
        L2a:
            int r5 = r4.getTop()
            int r0 = r3.E
            if (r5 <= r0) goto Laf
            goto Lae
        L34:
            boolean r5 = r3.I
            if (r5 == 0) goto L55
            android.view.VelocityTracker r5 = r3.X
            if (r5 != 0) goto L3e
            r5 = 0
            goto L4d
        L3e:
            r0 = 1000(0x3e8, float:1.401E-42)
            float r2 = r3.c
            r5.computeCurrentVelocity(r0, r2)
            android.view.VelocityTracker r5 = r3.X
            int r0 = r3.Y
            float r5 = r5.getYVelocity(r0)
        L4d:
            boolean r5 = r3.D(r4, r5)
            if (r5 == 0) goto L55
            r1 = 5
            goto Laf
        L55:
            int r5 = r3.O
            r0 = 4
            if (r5 != 0) goto L93
            int r5 = r4.getTop()
            boolean r2 = r3.b
            if (r2 == 0) goto L74
            int r6 = r3.D
            int r6 = r5 - r6
            int r6 = java.lang.Math.abs(r6)
            int r2 = r3.G
            int r5 = r5 - r2
            int r5 = java.lang.Math.abs(r5)
            if (r6 >= r5) goto L97
            goto Laf
        L74:
            int r2 = r3.E
            if (r5 >= r2) goto L83
            int r0 = r3.G
            int r0 = r5 - r0
            int r0 = java.lang.Math.abs(r0)
            if (r5 >= r0) goto Lae
            goto Laf
        L83:
            int r1 = r5 - r2
            int r1 = java.lang.Math.abs(r1)
            int r2 = r3.G
            int r5 = r5 - r2
            int r5 = java.lang.Math.abs(r5)
            if (r1 >= r5) goto L97
            goto Lae
        L93:
            boolean r5 = r3.b
            if (r5 == 0) goto L99
        L97:
            r1 = r0
            goto Laf
        L99:
            int r5 = r4.getTop()
            int r1 = r3.E
            int r1 = r5 - r1
            int r1 = java.lang.Math.abs(r1)
            int r2 = r3.G
            int r5 = r5 - r2
            int r5 = java.lang.Math.abs(r5)
            if (r1 >= r5) goto L97
        Lae:
            r1 = r6
        Laf:
            r5 = 0
            r3.E(r4, r1, r5)
            r3.P = r5
        Lb5:
            return
    }

    @Override // defpackage.wd
    public final boolean q(android.view.View r6, android.view.MotionEvent r7) {
            r5 = this;
            boolean r0 = r6.isShown()
            if (r0 != 0) goto L8
            r6 = 0
            return r6
        L8:
            int r0 = r7.getActionMasked()
            int r1 = r5.L
            r2 = 1
            if (r1 != r2) goto L14
            if (r0 != 0) goto L14
            return r2
        L14:
            ma0 r3 = r5.M
            if (r3 == 0) goto L21
            boolean r4 = r5.K
            if (r4 != 0) goto L1e
            if (r1 != r2) goto L21
        L1e:
            r3.j(r7)
        L21:
            if (r0 != 0) goto L32
            r1 = -1
            r5.Y = r1
            r5.Z = r1
            android.view.VelocityTracker r1 = r5.X
            if (r1 == 0) goto L32
            r1.recycle()
            r1 = 0
            r5.X = r1
        L32:
            android.view.VelocityTracker r1 = r5.X
            if (r1 != 0) goto L3c
            android.view.VelocityTracker r1 = android.view.VelocityTracker.obtain()
            r5.X = r1
        L3c:
            android.view.VelocityTracker r1 = r5.X
            r1.addMovement(r7)
            ma0 r1 = r5.M
            if (r1 == 0) goto L74
            boolean r1 = r5.K
            if (r1 != 0) goto L4d
            int r1 = r5.L
            if (r1 != r2) goto L74
        L4d:
            r1 = 2
            if (r0 != r1) goto L74
            boolean r0 = r5.N
            if (r0 != 0) goto L74
            int r0 = r5.Z
            float r0 = (float) r0
            float r1 = r7.getY()
            float r0 = r0 - r1
            float r0 = java.lang.Math.abs(r0)
            ma0 r1 = r5.M
            int r3 = r1.b
            float r3 = (float) r3
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 <= 0) goto L74
            int r0 = r7.getActionIndex()
            int r7 = r7.getPointerId(r0)
            r1.b(r6, r7)
        L74:
            boolean r6 = r5.N
            r6 = r6 ^ r2
            return r6
    }

    public final void r() {
            r2 = this;
            int r0 = r2.t()
            boolean r1 = r2.b
            if (r1 == 0) goto L14
            int r1 = r2.T
            int r1 = r1 - r0
            int r0 = r2.D
            int r0 = java.lang.Math.max(r1, r0)
            r2.G = r0
            return
        L14:
            int r1 = r2.T
            int r1 = r1 - r0
            r2.G = r1
            return
    }

    public final float s() {
            r5 = this;
            eu r0 = r5.i
            r1 = 0
            if (r0 == 0) goto L79
            java.lang.ref.WeakReference r0 = r5.U
            if (r0 == 0) goto L79
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L79
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 31
            if (r0 < r2) goto L79
            java.lang.ref.WeakReference r0 = r5.U
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            boolean r2 = r5.z()
            if (r2 == 0) goto L79
            android.view.WindowInsets r0 = r0.getRootWindowInsets()
            if (r0 == 0) goto L79
            eu r2 = r5.i
            du r3 = r2.a
            f30 r3 = r3.a
            de r3 = r3.e
            android.graphics.RectF r2 = r2.f()
            float r2 = r3.a(r2)
            android.view.RoundedCorner r3 = defpackage.p7.i(r0)
            if (r3 == 0) goto L4e
            int r3 = defpackage.p7.c(r3)
            float r3 = (float) r3
            int r4 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r4 <= 0) goto L4e
            int r4 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r4 <= 0) goto L4e
            float r3 = r3 / r2
            goto L4f
        L4e:
            r3 = r1
        L4f:
            eu r2 = r5.i
            du r4 = r2.a
            f30 r4 = r4.a
            de r4 = r4.f
            android.graphics.RectF r2 = r2.f()
            float r2 = r4.a(r2)
            android.view.RoundedCorner r0 = defpackage.p7.t(r0)
            if (r0 == 0) goto L74
            int r0 = defpackage.p7.c(r0)
            float r0 = (float) r0
            int r4 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r4 <= 0) goto L74
            int r4 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r4 <= 0) goto L74
            float r1 = r0 / r2
        L74:
            float r0 = java.lang.Math.max(r3, r1)
            return r0
        L79:
            return r1
    }

    public final int t() {
            r3 = this;
            boolean r0 = r3.f
            if (r0 == 0) goto L1d
            int r0 = r3.g
            int r1 = r3.T
            int r2 = r3.S
            int r2 = r2 * 9
            int r2 = r2 / 16
            int r1 = r1 - r2
            int r0 = java.lang.Math.max(r0, r1)
            int r1 = r3.R
            int r0 = java.lang.Math.min(r0, r1)
            int r1 = r3.v
            int r0 = r0 + r1
            return r0
        L1d:
            boolean r0 = r3.n
            if (r0 != 0) goto L33
            boolean r0 = r3.o
            if (r0 != 0) goto L33
            int r0 = r3.m
            if (r0 <= 0) goto L33
            int r1 = r3.e
            int r2 = r3.h
            int r0 = r0 + r2
            int r0 = java.lang.Math.max(r1, r0)
            return r0
        L33:
            int r0 = r3.e
            int r1 = r3.v
            int r0 = r0 + r1
            return r0
    }

    public final void u(int r3) {
            r2 = this;
            java.lang.ref.WeakReference r0 = r2.U
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L35
            java.util.ArrayList r0 = r2.W
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L35
            int r1 = r2.G
            if (r3 > r1) goto L20
            int r3 = r2.x()
            if (r1 != r3) goto L1d
            goto L20
        L1d:
            r2.x()
        L20:
            int r3 = r0.size()
            if (r3 > 0) goto L27
            goto L35
        L27:
            r3 = 0
            java.lang.Object r3 = r0.get(r3)
            r3.getClass()
            java.lang.ClassCastException r3 = new java.lang.ClassCastException
            r3.<init>()
            throw r3
        L35:
            return
    }

    public final int x() {
            r2 = this;
            boolean r0 = r2.b
            if (r0 == 0) goto L7
            int r0 = r2.D
            return r0
        L7:
            boolean r0 = r2.r
            if (r0 == 0) goto Ld
            r0 = 0
            goto Lf
        Ld:
            int r0 = r2.w
        Lf:
            int r1 = r2.C
            int r0 = java.lang.Math.max(r1, r0)
            return r0
    }

    public final int y(int r4) {
            r3 = this;
            r0 = 3
            if (r4 == r0) goto L29
            r0 = 4
            if (r4 == r0) goto L26
            r0 = 5
            if (r4 == r0) goto L23
            r0 = 6
            if (r4 != r0) goto Lf
            int r4 = r3.E
            return r4
        Lf:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Invalid state to get top offset: "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L23:
            int r4 = r3.T
            return r4
        L26:
            int r4 = r3.G
            return r4
        L29:
            int r4 = r3.x()
            return r4
    }

    public final boolean z() {
            r3 = this;
            java.lang.ref.WeakReference r0 = r3.U
            r1 = 0
            if (r0 == 0) goto L20
            java.lang.Object r0 = r0.get()
            if (r0 != 0) goto Lc
            goto L20
        Lc:
            r0 = 2
            int[] r0 = new int[r0]
            java.lang.ref.WeakReference r2 = r3.U
            java.lang.Object r2 = r2.get()
            android.view.View r2 = (android.view.View) r2
            r2.getLocationOnScreen(r0)
            r2 = 1
            r0 = r0[r2]
            if (r0 != 0) goto L20
            return r2
        L20:
            return r1
    }
}
