package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes.dex */
public class RecyclerView extends android.view.ViewGroup {
    public static final int[] s0 = null;
    public static final java.lang.Class[] t0 = null;
    public static final defpackage.dz u0 = null;
    public int A;
    public int B;
    public defpackage.iz C;
    public android.widget.EdgeEffect D;
    public android.widget.EdgeEffect E;
    public android.widget.EdgeEffect F;
    public android.widget.EdgeEffect G;
    public defpackage.jz H;
    public int I;
    public int J;
    public android.view.VelocityTracker K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public defpackage.pz Q;
    public final int R;
    public final int S;
    public final float T;
    public final float U;
    public boolean V;
    public final defpackage.a00 W;
    public final defpackage.iy a;
    public defpackage.dn a0;
    public final defpackage.tz b;
    public final defpackage.bn b0;
    public defpackage.vz c;
    public final defpackage.yz c0;
    public final defpackage.y1 d;
    public defpackage.qz d0;
    public final defpackage.r5 e;
    public java.util.ArrayList e0;
    public final defpackage.d4 f;
    public boolean f0;
    public boolean g;
    public boolean g0;
    public final android.graphics.Rect h;
    public final defpackage.ez h0;
    public final android.graphics.Rect i;
    public boolean i0;
    public final android.graphics.RectF j;
    public defpackage.d00 j0;
    public defpackage.fz k;
    public final int[] k0;
    public defpackage.nz l;
    public defpackage.iw l0;
    public final java.util.ArrayList m;
    public final int[] m0;
    public final java.util.ArrayList n;
    public final int[] n0;
    public defpackage.wj o;
    public final int[] o0;
    public boolean p;
    public final java.util.ArrayList p0;
    public boolean q;
    public final defpackage.y6 q0;
    public boolean r;
    public final defpackage.ez r0;
    public int s;
    public boolean t;
    public boolean u;
    public boolean v;
    public int w;
    public final android.view.accessibility.AccessibilityManager x;
    public boolean y;
    public boolean z;

    static {
            r0 = 16843830(0x1010436, float:2.369658E-38)
            int[] r0 = new int[]{r0}
            androidx.recyclerview.widget.RecyclerView.s0 = r0
            java.lang.Class<android.util.AttributeSet> r0 = android.util.AttributeSet.class
            java.lang.Class r1 = java.lang.Integer.TYPE
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            java.lang.Class[] r0 = new java.lang.Class[]{r2, r0, r1, r1}
            androidx.recyclerview.widget.RecyclerView.t0 = r0
            dz r0 = new dz
            r1 = 0
            r0.<init>(r1)
            androidx.recyclerview.widget.RecyclerView.u0 = r0
            return
    }

    public RecyclerView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 2130969436(0x7f04035c, float:1.7547554E38)
            r1.<init>(r2, r3, r0)
            return
    }

    public RecyclerView(android.content.Context r21, android.util.AttributeSet r22, int r23) {
            r20 = this;
            r1 = r20
            r2 = r21
            r4 = r22
            r6 = r23
            r20.<init>(r21, r22, r23)
            iy r0 = new iy
            r0.<init>(r1)
            r1.a = r0
            tz r0 = new tz
            r0.<init>(r1)
            r1.b = r0
            d4 r0 = new d4
            r3 = 19
            r0.<init>(r3)
            r1.f = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r1.h = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r1.i = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r1.j = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.m = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.n = r0
            r9 = 0
            r1.s = r9
            r1.y = r9
            r1.z = r9
            r1.A = r9
            r1.B = r9
            iz r0 = new iz
            r0.<init>()
            r1.C = r0
            uf r0 = new uf
            r0.<init>()
            r10 = 0
            r0.a = r10
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0.b = r3
            r7 = 120(0x78, double:5.93E-322)
            r0.c = r7
            r0.d = r7
            r7 = 250(0xfa, double:1.235E-321)
            r0.e = r7
            r0.f = r7
            r11 = 1
            r0.g = r11
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0.h = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0.i = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0.j = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0.k = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0.l = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0.m = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0.n = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0.o = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0.p = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0.q = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0.r = r3
            r1.H = r0
            r1.I = r9
            r0 = -1
            r1.J = r0
            r3 = 1
            r1.T = r3
            r1.U = r3
            r1.V = r11
            a00 r3 = new a00
            r3.<init>(r1)
            r1.W = r3
            bn r3 = new bn
            r3.<init>()
            r1.b0 = r3
            yz r3 = new yz
            r3.<init>()
            r3.a = r0
            r3.b = r9
            r3.c = r9
            r3.d = r11
            r3.e = r9
            r3.f = r9
            r3.g = r9
            r3.h = r9
            r3.i = r9
            r3.j = r9
            r3.k = r9
            r1.c0 = r3
            r1.f0 = r9
            r1.g0 = r9
            ez r3 = new ez
            r3.<init>(r1)
            r1.h0 = r3
            r1.i0 = r9
            r12 = 2
            int[] r5 = new int[r12]
            r1.k0 = r5
            int[] r5 = new int[r12]
            r1.m0 = r5
            int[] r5 = new int[r12]
            r1.n0 = r5
            int[] r5 = new int[r12]
            r1.o0 = r5
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r1.p0 = r5
            y6 r5 = new y6
            r7 = 8
            r5.<init>(r7, r1)
            r1.q0 = r5
            ez r5 = new ez
            r5.<init>(r1)
            r1.r0 = r5
            r1.setScrollContainer(r11)
            r1.setFocusableInTouchMode(r11)
            android.view.ViewConfiguration r5 = android.view.ViewConfiguration.get(r2)
            int r8 = r5.getScaledTouchSlop()
            r1.P = r8
            float r8 = defpackage.ka0.a(r5)
            r1.T = r8
            float r8 = defpackage.ka0.b(r5)
            r1.U = r8
            int r8 = r5.getScaledMinimumFlingVelocity()
            r1.R = r8
            int r5 = r5.getScaledMaximumFlingVelocity()
            r1.S = r5
            int r5 = r1.getOverScrollMode()
            if (r5 != r12) goto L160
            r5 = r11
            goto L161
        L160:
            r5 = r9
        L161:
            r1.setWillNotDraw(r5)
            jz r5 = r1.H
            r5.a = r3
            y1 r3 = new y1
            ez r5 = new ez
            r5.<init>(r1)
            r3.<init>(r5)
            r1.d = r3
            r5 r3 = new r5
            ez r5 = new ez
            r5.<init>(r1)
            r3.<init>(r5)
            r1.e = r3
            java.util.WeakHashMap r3 = defpackage.ja0.a
            int r3 = defpackage.aa0.b(r1)
            if (r3 != 0) goto L18b
            defpackage.aa0.l(r1, r7)
        L18b:
            int r3 = defpackage.s90.c(r1)
            if (r3 != 0) goto L194
            defpackage.s90.s(r1, r11)
        L194:
            android.content.Context r3 = r1.getContext()
            java.lang.String r5 = "accessibility"
            java.lang.Object r3 = r3.getSystemService(r5)
            android.view.accessibility.AccessibilityManager r3 = (android.view.accessibility.AccessibilityManager) r3
            r1.x = r3
            d00 r3 = new d00
            r3.<init>(r1)
            r1.setAccessibilityDelegateCompat(r3)
            int[] r3 = defpackage.vy.a
            android.content.res.TypedArray r5 = r2.obtainStyledAttributes(r4, r3, r6, r9)
            int r8 = android.os.Build.VERSION.SDK_INT
            r13 = 29
            if (r8 < r13) goto L1b9
            defpackage.f0.r(r1, r2, r3, r4, r5, r6)
        L1b9:
            r14 = r2
            r15 = r4
            r2 = r5
            java.lang.String r16 = r2.getString(r7)
            int r3 = r2.getInt(r12, r0)
            if (r3 != r0) goto L1cb
            r0 = 262144(0x40000, float:3.67342E-40)
            r1.setDescendantFocusability(r0)
        L1cb:
            boolean r0 = r2.getBoolean(r11, r11)
            r1.g = r0
            r0 = 3
            boolean r3 = r2.getBoolean(r0, r9)
            r4 = 4
            if (r3 == 0) goto L246
            r3 = 6
            android.graphics.drawable.Drawable r3 = r2.getDrawable(r3)
            android.graphics.drawable.StateListDrawable r3 = (android.graphics.drawable.StateListDrawable) r3
            r5 = 7
            android.graphics.drawable.Drawable r5 = r2.getDrawable(r5)
            android.graphics.drawable.Drawable r6 = r2.getDrawable(r4)
            android.graphics.drawable.StateListDrawable r6 = (android.graphics.drawable.StateListDrawable) r6
            r7 = 5
            android.graphics.drawable.Drawable r7 = r2.getDrawable(r7)
            if (r3 == 0) goto L22e
            if (r5 == 0) goto L22e
            if (r6 == 0) goto L22e
            if (r7 == 0) goto L22e
            android.content.Context r8 = r1.getContext()
            android.content.res.Resources r8 = r8.getResources()
            r17 = r0
            wj r0 = new wj
            r4 = 2131165328(0x7f070090, float:1.794487E38)
            int r4 = r8.getDimensionPixelSize(r4)
            r19 = r12
            r12 = 2131165330(0x7f070092, float:1.7944874E38)
            int r12 = r8.getDimensionPixelSize(r12)
            r13 = 2131165329(0x7f070091, float:1.7944872E38)
            int r8 = r8.getDimensionPixelOffset(r13)
            r13 = r6
            r6 = r4
            r4 = r13
            r13 = r2
            r2 = r3
            r3 = r5
            r5 = r7
            r7 = r12
            r18 = r17
            r12 = r23
            r17 = r11
            r11 = 4
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L250
        L22e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Trying to set fast scroller without both required drawables."
            r2.<init>(r3)
            java.lang.String r3 = r1.y()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L246:
            r18 = r0
            r13 = r2
            r17 = r11
            r19 = r12
            r12 = r23
            r11 = r4
        L250:
            r13.recycle()
            java.lang.String r2 = ": Could not instantiate the LayoutManager: "
            if (r16 == 0) goto L3b4
            java.lang.String r0 = r16.trim()
            boolean r3 = r0.isEmpty()
            if (r3 != 0) goto L3b4
            char r3 = r0.charAt(r9)
            r4 = 46
            if (r3 != r4) goto L27e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r14.getPackageName()
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
        L27c:
            r3 = r0
            goto L2a4
        L27e:
            java.lang.String r3 = "."
            boolean r3 = r0.contains(r3)
            if (r3 == 0) goto L287
            goto L27c
        L287:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.Class<androidx.recyclerview.widget.RecyclerView> r5 = androidx.recyclerview.widget.RecyclerView.class
            java.lang.Package r5 = r5.getPackage()
            java.lang.String r5 = r5.getName()
            r3.append(r5)
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            goto L27c
        L2a4:
            boolean r0 = r1.isInEditMode()     // Catch: java.lang.ClassCastException -> L2b3 java.lang.IllegalAccessException -> L2b5 java.lang.InstantiationException -> L2b8 java.lang.reflect.InvocationTargetException -> L2bb java.lang.ClassNotFoundException -> L2be
            if (r0 == 0) goto L2c1
            java.lang.Class r0 = r1.getClass()     // Catch: java.lang.ClassCastException -> L2b3 java.lang.IllegalAccessException -> L2b5 java.lang.InstantiationException -> L2b8 java.lang.reflect.InvocationTargetException -> L2bb java.lang.ClassNotFoundException -> L2be
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch: java.lang.ClassCastException -> L2b3 java.lang.IllegalAccessException -> L2b5 java.lang.InstantiationException -> L2b8 java.lang.reflect.InvocationTargetException -> L2bb java.lang.ClassNotFoundException -> L2be
            goto L2c5
        L2b3:
            r0 = move-exception
            goto L322
        L2b5:
            r0 = move-exception
            goto L340
        L2b8:
            r0 = move-exception
            goto L35e
        L2bb:
            r0 = move-exception
            goto L37a
        L2be:
            r0 = move-exception
            goto L396
        L2c1:
            java.lang.ClassLoader r0 = r14.getClassLoader()     // Catch: java.lang.ClassCastException -> L2b3 java.lang.IllegalAccessException -> L2b5 java.lang.InstantiationException -> L2b8 java.lang.reflect.InvocationTargetException -> L2bb java.lang.ClassNotFoundException -> L2be
        L2c5:
            java.lang.Class r0 = java.lang.Class.forName(r3, r9, r0)     // Catch: java.lang.ClassCastException -> L2b3 java.lang.IllegalAccessException -> L2b5 java.lang.InstantiationException -> L2b8 java.lang.reflect.InvocationTargetException -> L2bb java.lang.ClassNotFoundException -> L2be
            java.lang.Class<nz> r4 = defpackage.nz.class
            java.lang.Class r4 = r0.asSubclass(r4)     // Catch: java.lang.ClassCastException -> L2b3 java.lang.IllegalAccessException -> L2b5 java.lang.InstantiationException -> L2b8 java.lang.reflect.InvocationTargetException -> L2bb java.lang.ClassNotFoundException -> L2be
            java.lang.Class[] r0 = androidx.recyclerview.widget.RecyclerView.t0     // Catch: java.lang.ClassCastException -> L2b3 java.lang.IllegalAccessException -> L2b5 java.lang.InstantiationException -> L2b8 java.lang.reflect.InvocationTargetException -> L2bb java.lang.ClassNotFoundException -> L2be java.lang.NoSuchMethodException -> L2eb
            java.lang.reflect.Constructor r0 = r4.getConstructor(r0)     // Catch: java.lang.ClassCastException -> L2b3 java.lang.IllegalAccessException -> L2b5 java.lang.InstantiationException -> L2b8 java.lang.reflect.InvocationTargetException -> L2bb java.lang.ClassNotFoundException -> L2be java.lang.NoSuchMethodException -> L2eb
            java.lang.Object[] r5 = new java.lang.Object[r11]     // Catch: java.lang.ClassCastException -> L2b3 java.lang.IllegalAccessException -> L2b5 java.lang.InstantiationException -> L2b8 java.lang.reflect.InvocationTargetException -> L2bb java.lang.ClassNotFoundException -> L2be java.lang.NoSuchMethodException -> L2eb
            r5[r9] = r14     // Catch: java.lang.ClassCastException -> L2b3 java.lang.IllegalAccessException -> L2b5 java.lang.InstantiationException -> L2b8 java.lang.reflect.InvocationTargetException -> L2bb java.lang.ClassNotFoundException -> L2be java.lang.NoSuchMethodException -> L2eb
            r5[r17] = r15     // Catch: java.lang.ClassCastException -> L2b3 java.lang.IllegalAccessException -> L2b5 java.lang.InstantiationException -> L2b8 java.lang.reflect.InvocationTargetException -> L2bb java.lang.ClassNotFoundException -> L2be java.lang.NoSuchMethodException -> L2eb
            java.lang.Integer r6 = java.lang.Integer.valueOf(r12)     // Catch: java.lang.ClassCastException -> L2b3 java.lang.IllegalAccessException -> L2b5 java.lang.InstantiationException -> L2b8 java.lang.reflect.InvocationTargetException -> L2bb java.lang.ClassNotFoundException -> L2be java.lang.NoSuchMethodException -> L2eb
            r5[r19] = r6     // Catch: java.lang.ClassCastException -> L2b3 java.lang.IllegalAccessException -> L2b5 java.lang.InstantiationException -> L2b8 java.lang.reflect.InvocationTargetException -> L2bb java.lang.ClassNotFoundException -> L2be java.lang.NoSuchMethodException -> L2eb
            java.lang.Integer r6 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.ClassCastException -> L2b3 java.lang.IllegalAccessException -> L2b5 java.lang.InstantiationException -> L2b8 java.lang.reflect.InvocationTargetException -> L2bb java.lang.ClassNotFoundException -> L2be java.lang.NoSuchMethodException -> L2eb
            r5[r18] = r6     // Catch: java.lang.ClassCastException -> L2b3 java.lang.IllegalAccessException -> L2b5 java.lang.InstantiationException -> L2b8 java.lang.reflect.InvocationTargetException -> L2bb java.lang.ClassNotFoundException -> L2be java.lang.NoSuchMethodException -> L2eb
            r10 = r5
        L2e8:
            r4 = r17
            goto L2f2
        L2eb:
            r0 = move-exception
            r5 = r0
            java.lang.reflect.Constructor r0 = r4.getConstructor(r10)     // Catch: java.lang.ClassCastException -> L2b3 java.lang.IllegalAccessException -> L2b5 java.lang.InstantiationException -> L2b8 java.lang.reflect.InvocationTargetException -> L2bb java.lang.ClassNotFoundException -> L2be java.lang.NoSuchMethodException -> L300
            goto L2e8
        L2f2:
            r0.setAccessible(r4)     // Catch: java.lang.ClassCastException -> L2b3 java.lang.IllegalAccessException -> L2b5 java.lang.InstantiationException -> L2b8 java.lang.reflect.InvocationTargetException -> L2bb java.lang.ClassNotFoundException -> L2be
            java.lang.Object r0 = r0.newInstance(r10)     // Catch: java.lang.ClassCastException -> L2b3 java.lang.IllegalAccessException -> L2b5 java.lang.InstantiationException -> L2b8 java.lang.reflect.InvocationTargetException -> L2bb java.lang.ClassNotFoundException -> L2be
            nz r0 = (defpackage.nz) r0     // Catch: java.lang.ClassCastException -> L2b3 java.lang.IllegalAccessException -> L2b5 java.lang.InstantiationException -> L2b8 java.lang.reflect.InvocationTargetException -> L2bb java.lang.ClassNotFoundException -> L2be
            r1.setLayoutManager(r0)     // Catch: java.lang.ClassCastException -> L2b3 java.lang.IllegalAccessException -> L2b5 java.lang.InstantiationException -> L2b8 java.lang.reflect.InvocationTargetException -> L2bb java.lang.ClassNotFoundException -> L2be
            goto L3b4
        L300:
            r0 = move-exception
            r0.initCause(r5)     // Catch: java.lang.ClassCastException -> L2b3 java.lang.IllegalAccessException -> L2b5 java.lang.InstantiationException -> L2b8 java.lang.reflect.InvocationTargetException -> L2bb java.lang.ClassNotFoundException -> L2be
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.ClassCastException -> L2b3 java.lang.IllegalAccessException -> L2b5 java.lang.InstantiationException -> L2b8 java.lang.reflect.InvocationTargetException -> L2bb java.lang.ClassNotFoundException -> L2be
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.ClassCastException -> L2b3 java.lang.IllegalAccessException -> L2b5 java.lang.InstantiationException -> L2b8 java.lang.reflect.InvocationTargetException -> L2bb java.lang.ClassNotFoundException -> L2be
            r5.<init>()     // Catch: java.lang.ClassCastException -> L2b3 java.lang.IllegalAccessException -> L2b5 java.lang.InstantiationException -> L2b8 java.lang.reflect.InvocationTargetException -> L2bb java.lang.ClassNotFoundException -> L2be
            java.lang.String r6 = r15.getPositionDescription()     // Catch: java.lang.ClassCastException -> L2b3 java.lang.IllegalAccessException -> L2b5 java.lang.InstantiationException -> L2b8 java.lang.reflect.InvocationTargetException -> L2bb java.lang.ClassNotFoundException -> L2be
            r5.append(r6)     // Catch: java.lang.ClassCastException -> L2b3 java.lang.IllegalAccessException -> L2b5 java.lang.InstantiationException -> L2b8 java.lang.reflect.InvocationTargetException -> L2bb java.lang.ClassNotFoundException -> L2be
            java.lang.String r6 = ": Error creating LayoutManager "
            r5.append(r6)     // Catch: java.lang.ClassCastException -> L2b3 java.lang.IllegalAccessException -> L2b5 java.lang.InstantiationException -> L2b8 java.lang.reflect.InvocationTargetException -> L2bb java.lang.ClassNotFoundException -> L2be
            r5.append(r3)     // Catch: java.lang.ClassCastException -> L2b3 java.lang.IllegalAccessException -> L2b5 java.lang.InstantiationException -> L2b8 java.lang.reflect.InvocationTargetException -> L2bb java.lang.ClassNotFoundException -> L2be
            java.lang.String r5 = r5.toString()     // Catch: java.lang.ClassCastException -> L2b3 java.lang.IllegalAccessException -> L2b5 java.lang.InstantiationException -> L2b8 java.lang.reflect.InvocationTargetException -> L2bb java.lang.ClassNotFoundException -> L2be
            r4.<init>(r5, r0)     // Catch: java.lang.ClassCastException -> L2b3 java.lang.IllegalAccessException -> L2b5 java.lang.InstantiationException -> L2b8 java.lang.reflect.InvocationTargetException -> L2bb java.lang.ClassNotFoundException -> L2be
            throw r4     // Catch: java.lang.ClassCastException -> L2b3 java.lang.IllegalAccessException -> L2b5 java.lang.InstantiationException -> L2b8 java.lang.reflect.InvocationTargetException -> L2bb java.lang.ClassNotFoundException -> L2be
        L322:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = r15.getPositionDescription()
            r4.append(r5)
            java.lang.String r5 = ": Class is not a LayoutManager "
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r2.<init>(r3, r0)
            throw r2
        L340:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = r15.getPositionDescription()
            r4.append(r5)
            java.lang.String r5 = ": Cannot access non-public constructor "
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r2.<init>(r3, r0)
            throw r2
        L35e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = r15.getPositionDescription()
            r5.append(r6)
            r5.append(r2)
            r5.append(r3)
            java.lang.String r2 = r5.toString()
            r4.<init>(r2, r0)
            throw r4
        L37a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = r15.getPositionDescription()
            r5.append(r6)
            r5.append(r2)
            r5.append(r3)
            java.lang.String r2 = r5.toString()
            r4.<init>(r2, r0)
            throw r4
        L396:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = r15.getPositionDescription()
            r4.append(r5)
            java.lang.String r5 = ": Unable to find LayoutManager "
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r2.<init>(r3, r0)
            throw r2
        L3b4:
            int r0 = android.os.Build.VERSION.SDK_INT
            int[] r3 = androidx.recyclerview.widget.RecyclerView.s0
            android.content.res.TypedArray r5 = r14.obtainStyledAttributes(r15, r3, r12, r9)
            r2 = 29
            if (r0 < r2) goto L3c6
            r6 = r12
            r2 = r14
            r4 = r15
            defpackage.f0.r(r1, r2, r3, r4, r5, r6)
        L3c6:
            r4 = 1
            boolean r0 = r5.getBoolean(r9, r4)
            r5.recycle()
            r1.setNestedScrollingEnabled(r0)
            return
    }

    public static androidx.recyclerview.widget.RecyclerView D(android.view.View r4) {
            boolean r0 = r4 instanceof android.view.ViewGroup
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = r4 instanceof androidx.recyclerview.widget.RecyclerView
            if (r0 == 0) goto Ld
            androidx.recyclerview.widget.RecyclerView r4 = (androidx.recyclerview.widget.RecyclerView) r4
            return r4
        Ld:
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            int r0 = r4.getChildCount()
            r2 = 0
        L14:
            if (r2 >= r0) goto L24
            android.view.View r3 = r4.getChildAt(r2)
            androidx.recyclerview.widget.RecyclerView r3 = D(r3)
            if (r3 == 0) goto L21
            return r3
        L21:
            int r2 = r2 + 1
            goto L14
        L24:
            return r1
    }

    public static defpackage.b00 I(android.view.View r0) {
            if (r0 != 0) goto L4
            r0 = 0
            return r0
        L4:
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            oz r0 = (defpackage.oz) r0
            b00 r0 = r0.a
            return r0
    }

    public static /* synthetic */ void a(androidx.recyclerview.widget.RecyclerView r0, android.view.View r1, int r2, android.view.ViewGroup.LayoutParams r3) {
            r0.attachViewToParent(r1, r2, r3)
            return
    }

    public static /* synthetic */ void c(androidx.recyclerview.widget.RecyclerView r0, int r1) {
            r0.detachViewFromParent(r1)
            return
    }

    public static /* synthetic */ boolean d(androidx.recyclerview.widget.RecyclerView r0) {
            boolean r0 = r0.awakenScrollBars()
            return r0
    }

    public static /* synthetic */ void e(androidx.recyclerview.widget.RecyclerView r0, int r1, int r2) {
            r0.setMeasuredDimension(r1, r2)
            return
    }

    private defpackage.iw getScrollingChildHelper() {
            r1 = this;
            iw r0 = r1.l0
            if (r0 != 0) goto Lb
            iw r0 = new iw
            r0.<init>(r1)
            r1.l0 = r0
        Lb:
            iw r0 = r1.l0
            return r0
    }

    public static void j(defpackage.b00 r3) {
            java.lang.ref.WeakReference r0 = r3.b
            if (r0 == 0) goto L21
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
        La:
            r1 = 0
            if (r0 == 0) goto L1f
            android.view.View r2 = r3.a
            if (r0 != r2) goto L12
            goto L21
        L12:
            android.view.ViewParent r0 = r0.getParent()
            boolean r2 = r0 instanceof android.view.View
            if (r2 == 0) goto L1d
            android.view.View r0 = (android.view.View) r0
            goto La
        L1d:
            r0 = r1
            goto La
        L1f:
            r3.b = r1
        L21:
            return
    }

    public final android.view.View A(android.view.View r3) {
            r2 = this;
            android.view.ViewParent r0 = r3.getParent()
        L4:
            if (r0 == 0) goto L14
            if (r0 == r2) goto L14
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L14
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            android.view.ViewParent r0 = r3.getParent()
            goto L4
        L14:
            if (r0 != r2) goto L17
            return r3
        L17:
            r3 = 0
            return r3
    }

    public final boolean B(android.view.MotionEvent r12) {
            r11 = this;
            int r0 = r12.getAction()
            java.util.ArrayList r1 = r11.n
            int r2 = r1.size()
            r3 = 0
            r4 = r3
        Lc:
            if (r4 >= r2) goto L64
            java.lang.Object r5 = r1.get(r4)
            wj r5 = (defpackage.wj) r5
            int r6 = r5.v
            r7 = 1
            r8 = 2
            if (r6 != r7) goto L59
            float r6 = r12.getX()
            float r9 = r12.getY()
            boolean r6 = r5.d(r6, r9)
            float r9 = r12.getX()
            float r10 = r12.getY()
            boolean r9 = r5.c(r9, r10)
            int r10 = r12.getAction()
            if (r10 != 0) goto L61
            if (r6 != 0) goto L3c
            if (r9 == 0) goto L61
        L3c:
            if (r9 == 0) goto L49
            r5.w = r7
            float r6 = r12.getX()
            int r6 = (int) r6
            float r6 = (float) r6
            r5.p = r6
            goto L55
        L49:
            if (r6 == 0) goto L55
            r5.w = r8
            float r6 = r12.getY()
            int r6 = (int) r6
            float r6 = (float) r6
            r5.m = r6
        L55:
            r5.f(r8)
            goto L5b
        L59:
            if (r6 != r8) goto L61
        L5b:
            r6 = 3
            if (r0 == r6) goto L61
            r11.o = r5
            return r7
        L61:
            int r4 = r4 + 1
            goto Lc
        L64:
            return r3
    }

    public final void C(int[] r9) {
            r8 = this;
            r5 r0 = r8.e
            int r0 = r0.k()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L10
            r0 = -1
            r9[r2] = r0
            r9[r1] = r0
            return
        L10:
            r3 = 2147483647(0x7fffffff, float:NaN)
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r2
        L16:
            if (r5 >= r0) goto L36
            r5 r6 = r8.e
            android.view.View r6 = r6.j(r5)
            b00 r6 = I(r6)
            boolean r7 = r6.o()
            if (r7 == 0) goto L29
            goto L33
        L29:
            int r6 = r6.b()
            if (r6 >= r3) goto L30
            r3 = r6
        L30:
            if (r6 <= r4) goto L33
            r4 = r6
        L33:
            int r5 = r5 + 1
            goto L16
        L36:
            r9[r2] = r3
            r9[r1] = r4
            return
    }

    public final defpackage.b00 E(int r6) {
            r5 = this;
            boolean r0 = r5.y
            r1 = 0
            if (r0 == 0) goto L6
            return r1
        L6:
            r5 r0 = r5.e
            int r0 = r0.t()
            r2 = 0
        Ld:
            if (r2 >= r0) goto L3b
            r5 r3 = r5.e
            android.view.View r3 = r3.s(r2)
            b00 r3 = I(r3)
            if (r3 == 0) goto L38
            boolean r4 = r3.h()
            if (r4 != 0) goto L38
            int r4 = r5.F(r3)
            if (r4 != r6) goto L38
            android.view.View r1 = r3.a
            r5 r4 = r5.e
            java.lang.Object r4 = r4.d
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            boolean r1 = r4.contains(r1)
            if (r1 == 0) goto L37
            r1 = r3
            goto L38
        L37:
            return r3
        L38:
            int r2 = r2 + 1
            goto Ld
        L3b:
            return r1
    }

    public final int F(defpackage.b00 r8) {
            r7 = this;
            int r0 = r8.j
            r0 = r0 & 524(0x20c, float:7.34E-43)
            r1 = -1
            if (r0 == 0) goto L8
            return r1
        L8:
            boolean r0 = r8.e()
            if (r0 != 0) goto Lf
            goto L4c
        Lf:
            int r8 = r8.c
            y1 r0 = r7.d
            java.io.Serializable r0 = r0.c
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r2 = r0.size()
            r3 = 0
        L1c:
            if (r3 >= r2) goto L59
            java.lang.Object r4 = r0.get(r3)
            x1 r4 = (defpackage.x1) r4
            int r5 = r4.a
            r6 = 1
            if (r5 == r6) goto L4f
            r6 = 2
            if (r5 == r6) goto L43
            r6 = 8
            if (r5 == r6) goto L31
            goto L56
        L31:
            int r5 = r4.b
            if (r5 != r8) goto L38
            int r8 = r4.c
            goto L56
        L38:
            if (r5 >= r8) goto L3c
            int r8 = r8 + (-1)
        L3c:
            int r4 = r4.c
            if (r4 > r8) goto L56
            int r8 = r8 + 1
            goto L56
        L43:
            int r5 = r4.b
            if (r5 > r8) goto L56
            int r4 = r4.c
            int r5 = r5 + r4
            if (r5 <= r8) goto L4d
        L4c:
            return r1
        L4d:
            int r8 = r8 - r4
            goto L56
        L4f:
            int r5 = r4.b
            if (r5 > r8) goto L56
            int r4 = r4.c
            int r8 = r8 + r4
        L56:
            int r3 = r3 + 1
            goto L1c
        L59:
            return r8
    }

    public final long G(defpackage.b00 r3) {
            r2 = this;
            fz r0 = r2.k
            boolean r0 = r0.b
            if (r0 == 0) goto L9
            long r0 = r3.e
            return r0
        L9:
            int r3 = r3.c
            long r0 = (long) r3
            return r0
    }

    public final defpackage.b00 H(android.view.View r4) {
            r3 = this;
            android.view.ViewParent r0 = r4.getParent()
            if (r0 == 0) goto L25
            if (r0 != r3) goto L9
            goto L25
        L9:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "View "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r4 = " is not a direct child of "
            r1.append(r4)
            r1.append(r3)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L25:
            b00 r4 = I(r4)
            return r4
    }

    public final android.graphics.Rect J(android.view.View r10) {
            r9 = this;
            android.view.ViewGroup$LayoutParams r0 = r10.getLayoutParams()
            oz r0 = (defpackage.oz) r0
            boolean r1 = r0.c
            android.graphics.Rect r2 = r0.b
            if (r1 != 0) goto Ld
            goto L23
        Ld:
            yz r1 = r9.c0
            boolean r1 = r1.g
            if (r1 == 0) goto L24
            b00 r1 = r0.a
            boolean r1 = r1.k()
            if (r1 != 0) goto L23
            b00 r1 = r0.a
            boolean r1 = r1.f()
            if (r1 == 0) goto L24
        L23:
            return r2
        L24:
            r1 = 0
            r2.set(r1, r1, r1, r1)
            java.util.ArrayList r3 = r9.m
            int r4 = r3.size()
            r5 = r1
        L2f:
            if (r5 >= r4) goto L6c
            android.graphics.Rect r6 = r9.h
            r6.set(r1, r1, r1, r1)
            java.lang.Object r7 = r3.get(r5)
            kz r7 = (defpackage.kz) r7
            r7.getClass()
            android.view.ViewGroup$LayoutParams r7 = r10.getLayoutParams()
            oz r7 = (defpackage.oz) r7
            b00 r7 = r7.a
            r7.getClass()
            r6.set(r1, r1, r1, r1)
            int r7 = r2.left
            int r8 = r6.left
            int r7 = r7 + r8
            r2.left = r7
            int r7 = r2.top
            int r8 = r6.top
            int r7 = r7 + r8
            r2.top = r7
            int r7 = r2.right
            int r8 = r6.right
            int r7 = r7 + r8
            r2.right = r7
            int r7 = r2.bottom
            int r6 = r6.bottom
            int r7 = r7 + r6
            r2.bottom = r7
            int r5 = r5 + 1
            goto L2f
        L6c:
            r0.c = r1
            return r2
    }

    public final boolean K() {
            r1 = this;
            boolean r0 = r1.r
            if (r0 == 0) goto L13
            boolean r0 = r1.y
            if (r0 != 0) goto L13
            y1 r0 = r1.d
            boolean r0 = r0.f()
            if (r0 == 0) goto L11
            goto L13
        L11:
            r0 = 0
            return r0
        L13:
            r0 = 1
            return r0
    }

    public final boolean L() {
            r1 = this;
            int r0 = r1.A
            if (r0 <= 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public final void M(int r2) {
            r1 = this;
            nz r0 = r1.l
            if (r0 != 0) goto L5
            return
        L5:
            r0 = 2
            r1.setScrollState(r0)
            nz r0 = r1.l
            r0.l0(r2)
            r1.awakenScrollBars()
            return
    }

    public final void N() {
            r5 = this;
            r5 r0 = r5.e
            int r0 = r0.t()
            r1 = 0
            r2 = r1
        L8:
            r3 = 1
            if (r2 >= r0) goto L1c
            r5 r4 = r5.e
            android.view.View r4 = r4.s(r2)
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            oz r4 = (defpackage.oz) r4
            r4.c = r3
            int r2 = r2 + 1
            goto L8
        L1c:
            tz r0 = r5.b
            java.util.ArrayList r0 = r0.c
            int r2 = r0.size()
        L24:
            if (r1 >= r2) goto L3b
            java.lang.Object r4 = r0.get(r1)
            b00 r4 = (defpackage.b00) r4
            android.view.View r4 = r4.a
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            oz r4 = (defpackage.oz) r4
            if (r4 == 0) goto L38
            r4.c = r3
        L38:
            int r1 = r1 + 1
            goto L24
        L3b:
            return
    }

    public final void O(int r10, int r11, boolean r12) {
            r9 = this;
            int r0 = r10 + r11
            r5 r1 = r9.e
            int r1 = r1.t()
            r2 = 0
        L9:
            r3 = 8
            r4 = 1
            if (r2 >= r1) goto L3f
            r5 r5 = r9.e
            android.view.View r5 = r5.s(r2)
            b00 r5 = I(r5)
            if (r5 == 0) goto L3c
            boolean r6 = r5.o()
            if (r6 != 0) goto L3c
            int r6 = r5.c
            yz r7 = r9.c0
            if (r6 < r0) goto L2d
            int r3 = -r11
            r5.l(r3, r12)
            r7.f = r4
            goto L3c
        L2d:
            if (r6 < r10) goto L3c
            int r6 = r10 + (-1)
            int r8 = -r11
            r5.a(r3)
            r5.l(r8, r12)
            r5.c = r6
            r7.f = r4
        L3c:
            int r2 = r2 + 1
            goto L9
        L3f:
            tz r1 = r9.b
            java.util.ArrayList r2 = r1.c
            int r5 = r2.size()
            int r5 = r5 - r4
        L48:
            if (r5 < 0) goto L66
            java.lang.Object r4 = r2.get(r5)
            b00 r4 = (defpackage.b00) r4
            if (r4 == 0) goto L63
            int r6 = r4.c
            if (r6 < r0) goto L5b
            int r6 = -r11
            r4.l(r6, r12)
            goto L63
        L5b:
            if (r6 < r10) goto L63
            r4.a(r3)
            r1.e(r5)
        L63:
            int r5 = r5 + (-1)
            goto L48
        L66:
            r9.requestLayout()
            return
    }

    public final void P() {
            r1 = this;
            int r0 = r1.A
            int r0 = r0 + 1
            r1.A = r0
            return
    }

    public final void Q(boolean r7) {
            r6 = this;
            int r0 = r6.A
            r1 = 1
            int r0 = r0 - r1
            r6.A = r0
            if (r0 >= r1) goto L5e
            r0 = 0
            r6.A = r0
            if (r7 == 0) goto L5e
            int r7 = r6.w
            r6.w = r0
            if (r7 == 0) goto L2c
            android.view.accessibility.AccessibilityManager r0 = r6.x
            if (r0 == 0) goto L2c
            boolean r0 = r0.isEnabled()
            if (r0 == 0) goto L2c
            android.view.accessibility.AccessibilityEvent r0 = android.view.accessibility.AccessibilityEvent.obtain()
            r2 = 2048(0x800, float:2.87E-42)
            r0.setEventType(r2)
            defpackage.y.b(r0, r7)
            r6.sendAccessibilityEventUnchecked(r0)
        L2c:
            java.util.ArrayList r7 = r6.p0
            int r0 = r7.size()
            int r0 = r0 - r1
        L33:
            if (r0 < 0) goto L5b
            java.lang.Object r1 = r7.get(r0)
            b00 r1 = (defpackage.b00) r1
            android.view.View r2 = r1.a
            android.view.ViewParent r2 = r2.getParent()
            if (r2 != r6) goto L58
            boolean r2 = r1.o()
            if (r2 == 0) goto L4a
            goto L58
        L4a:
            int r2 = r1.q
            r3 = -1
            if (r2 == r3) goto L58
            android.view.View r4 = r1.a
            java.util.WeakHashMap r5 = defpackage.ja0.a
            defpackage.s90.s(r4, r2)
            r1.q = r3
        L58:
            int r0 = r0 + (-1)
            goto L33
        L5b:
            r7.clear()
        L5e:
            return
    }

    public final void R(android.view.MotionEvent r4) {
            r3 = this;
            int r0 = r4.getActionIndex()
            int r1 = r4.getPointerId(r0)
            int r2 = r3.J
            if (r1 != r2) goto L2d
            if (r0 != 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            int r1 = r4.getPointerId(r0)
            r3.J = r1
            float r1 = r4.getX(r0)
            r2 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r2
            int r1 = (int) r1
            r3.N = r1
            r3.L = r1
            float r4 = r4.getY(r0)
            float r4 = r4 + r2
            int r4 = (int) r4
            r3.O = r4
            r3.M = r4
        L2d:
            return
    }

    public final void S() {
            r1 = this;
            boolean r0 = r1.i0
            if (r0 != 0) goto L12
            boolean r0 = r1.p
            if (r0 == 0) goto L12
            java.util.WeakHashMap r0 = defpackage.ja0.a
            y6 r0 = r1.q0
            defpackage.s90.m(r1, r0)
            r0 = 1
            r1.i0 = r0
        L12:
            return
    }

    public final void T(defpackage.b00 r5, defpackage.lw r6) {
            r4 = this;
            int r0 = r5.j
            r0 = r0 & (-8193(0xffffffffffffdfff, float:NaN))
            r5.j = r0
            yz r0 = r4.c0
            boolean r0 = r0.h
            d4 r1 = r4.f
            if (r0 == 0) goto L2b
            boolean r0 = r5.k()
            if (r0 == 0) goto L2b
            boolean r0 = r5.h()
            if (r0 != 0) goto L2b
            boolean r0 = r5.o()
            if (r0 != 0) goto L2b
            long r2 = r4.G(r5)
            java.lang.Object r0 = r1.c
            bs r0 = (defpackage.bs) r0
            r0.d(r2, r5)
        L2b:
            java.lang.Object r0 = r1.b
            u30 r0 = (defpackage.u30) r0
            r1 = 0
            java.lang.Object r1 = r0.getOrDefault(r5, r1)
            oa0 r1 = (defpackage.oa0) r1
            if (r1 != 0) goto L3f
            oa0 r1 = defpackage.oa0.a()
            r0.put(r5, r1)
        L3f:
            r1.b = r6
            int r5 = r1.a
            r5 = r5 | 4
            r1.a = r5
            return
    }

    public final void U(android.view.View r12, android.view.View r13) {
            r11 = this;
            if (r13 == 0) goto L4
            r0 = r13
            goto L5
        L4:
            r0 = r12
        L5:
            int r1 = r0.getWidth()
            int r2 = r0.getHeight()
            android.graphics.Rect r3 = r11.h
            r4 = 0
            r3.set(r4, r4, r1, r2)
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            boolean r1 = r0 instanceof defpackage.oz
            if (r1 == 0) goto L3f
            oz r0 = (defpackage.oz) r0
            boolean r1 = r0.c
            if (r1 != 0) goto L3f
            android.graphics.Rect r0 = r0.b
            int r1 = r3.left
            int r2 = r0.left
            int r1 = r1 - r2
            r3.left = r1
            int r1 = r3.right
            int r2 = r0.right
            int r1 = r1 + r2
            r3.right = r1
            int r1 = r3.top
            int r2 = r0.top
            int r1 = r1 - r2
            r3.top = r1
            int r1 = r3.bottom
            int r0 = r0.bottom
            int r1 = r1 + r0
            r3.bottom = r1
        L3f:
            if (r13 == 0) goto L47
            r11.offsetDescendantRectToMyCoords(r13, r3)
            r11.offsetRectIntoDescendantCoords(r12, r3)
        L47:
            nz r5 = r11.l
            boolean r0 = r11.r
            r1 = 1
            r9 = r0 ^ 1
            if (r13 != 0) goto L52
            r10 = r1
            goto L53
        L52:
            r10 = r4
        L53:
            android.graphics.Rect r8 = r11.h
            r6 = r11
            r7 = r12
            r5.i0(r6, r7, r8, r9, r10)
            return
    }

    public final void V() {
            r2 = this;
            android.view.VelocityTracker r0 = r2.K
            if (r0 == 0) goto L7
            r0.clear()
        L7:
            r0 = 0
            r2.c0(r0)
            android.widget.EdgeEffect r1 = r2.D
            if (r1 == 0) goto L18
            r1.onRelease()
            android.widget.EdgeEffect r0 = r2.D
            boolean r0 = r0.isFinished()
        L18:
            android.widget.EdgeEffect r1 = r2.E
            if (r1 == 0) goto L26
            r1.onRelease()
            android.widget.EdgeEffect r1 = r2.E
            boolean r1 = r1.isFinished()
            r0 = r0 | r1
        L26:
            android.widget.EdgeEffect r1 = r2.F
            if (r1 == 0) goto L34
            r1.onRelease()
            android.widget.EdgeEffect r1 = r2.F
            boolean r1 = r1.isFinished()
            r0 = r0 | r1
        L34:
            android.widget.EdgeEffect r1 = r2.G
            if (r1 == 0) goto L42
            r1.onRelease()
            android.widget.EdgeEffect r1 = r2.G
            boolean r1 = r1.isFinished()
            r0 = r0 | r1
        L42:
            if (r0 == 0) goto L49
            java.util.WeakHashMap r0 = defpackage.ja0.a
            defpackage.s90.k(r2)
        L49:
            return
    }

    public final boolean W(int r17, int r18, android.view.MotionEvent r19) {
            r16 = this;
            r0 = r16
            r8 = r17
            r9 = r18
            r10 = r19
            r0.m()
            fz r1 = r0.k
            int[] r11 = r0.o0
            r12 = 1
            r13 = 0
            if (r1 == 0) goto L23
            r11[r13] = r13
            r11[r12] = r13
            r0.X(r8, r9, r11)
            r1 = r11[r13]
            r2 = r11[r12]
            int r3 = r8 - r1
            int r4 = r9 - r2
            goto L27
        L23:
            r1 = r13
            r2 = r1
            r3 = r2
            r4 = r3
        L27:
            java.util.ArrayList r5 = r0.m
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L32
            r0.invalidate()
        L32:
            int[] r7 = r0.o0
            r7[r13] = r13
            r7[r12] = r13
            int[] r5 = r0.m0
            r6 = 0
            r0.s(r1, r2, r3, r4, r5, r6, r7)
            r5 = r11[r13]
            int r3 = r3 - r5
            r6 = r11[r12]
            int r4 = r4 - r6
            if (r5 != 0) goto L4b
            if (r6 == 0) goto L49
            goto L4b
        L49:
            r5 = r13
            goto L4c
        L4b:
            r5 = r12
        L4c:
            int r6 = r0.N
            int[] r7 = r0.m0
            r11 = r7[r13]
            int r6 = r6 - r11
            r0.N = r6
            int r6 = r0.O
            r7 = r7[r12]
            int r6 = r6 - r7
            r0.O = r6
            int[] r6 = r0.n0
            r14 = r6[r13]
            int r14 = r14 + r11
            r6[r13] = r14
            r11 = r6[r12]
            int r11 = r11 + r7
            r6[r12] = r11
            int r6 = r0.getOverScrollMode()
            r7 = 2
            if (r6 == r7) goto L10a
            if (r10 == 0) goto L107
            r6 = 8194(0x2002, float:1.1482E-41)
            boolean r6 = defpackage.zt.B(r10, r6)
            if (r6 != 0) goto L107
            float r6 = r10.getX()
            float r3 = (float) r3
            float r7 = r10.getY()
            float r4 = (float) r4
            r10 = 0
            int r11 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            r14 = 1065353216(0x3f800000, float:1.0)
            if (r11 >= 0) goto La5
            r0.v()
            android.widget.EdgeEffect r11 = r0.D
            float r15 = -r3
            r19 = r10
            int r10 = r0.getWidth()
            float r10 = (float) r10
            float r15 = r15 / r10
            int r10 = r0.getHeight()
            float r10 = (float) r10
            float r7 = r7 / r10
            float r7 = r14 - r7
            defpackage.th.a(r11, r15, r7)
        La3:
            r7 = r12
            goto Lc2
        La5:
            r19 = r10
            int r10 = (r3 > r19 ? 1 : (r3 == r19 ? 0 : -1))
            if (r10 <= 0) goto Lc1
            r0.w()
            android.widget.EdgeEffect r10 = r0.F
            int r11 = r0.getWidth()
            float r11 = (float) r11
            float r11 = r3 / r11
            int r15 = r0.getHeight()
            float r15 = (float) r15
            float r7 = r7 / r15
            defpackage.th.a(r10, r11, r7)
            goto La3
        Lc1:
            r7 = r13
        Lc2:
            int r10 = (r4 > r19 ? 1 : (r4 == r19 ? 0 : -1))
            if (r10 >= 0) goto Ldd
            r0.x()
            android.widget.EdgeEffect r7 = r0.E
            float r10 = -r4
            int r11 = r0.getHeight()
            float r11 = (float) r11
            float r10 = r10 / r11
            int r11 = r0.getWidth()
            float r11 = (float) r11
            float r6 = r6 / r11
            defpackage.th.a(r7, r10, r6)
        Ldb:
            r7 = r12
            goto Lf8
        Ldd:
            int r10 = (r4 > r19 ? 1 : (r4 == r19 ? 0 : -1))
            if (r10 <= 0) goto Lf8
            r0.u()
            android.widget.EdgeEffect r7 = r0.G
            int r10 = r0.getHeight()
            float r10 = (float) r10
            float r10 = r4 / r10
            int r11 = r0.getWidth()
            float r11 = (float) r11
            float r6 = r6 / r11
            float r14 = r14 - r6
            defpackage.th.a(r7, r10, r14)
            goto Ldb
        Lf8:
            if (r7 != 0) goto L102
            int r3 = (r3 > r19 ? 1 : (r3 == r19 ? 0 : -1))
            if (r3 != 0) goto L102
            int r3 = (r4 > r19 ? 1 : (r4 == r19 ? 0 : -1))
            if (r3 == 0) goto L107
        L102:
            java.util.WeakHashMap r3 = defpackage.ja0.a
            defpackage.s90.k(r0)
        L107:
            r16.l(r17, r18)
        L10a:
            if (r1 != 0) goto L10e
            if (r2 == 0) goto L111
        L10e:
            r0.t(r1, r2)
        L111:
            boolean r3 = r0.awakenScrollBars()
            if (r3 != 0) goto L11a
            r0.invalidate()
        L11a:
            if (r5 != 0) goto L122
            if (r1 != 0) goto L122
            if (r2 == 0) goto L121
            goto L122
        L121:
            return r13
        L122:
            return r12
    }

    public final void X(int r10, int r11, int[] r12) {
            r9 = this;
            r9.a0()
            r9.P()
            int r0 = defpackage.n70.a
            java.lang.String r0 = "RV Scroll"
            defpackage.m70.a(r0)
            yz r0 = r9.c0
            r9.z(r0)
            tz r1 = r9.b
            r2 = 0
            if (r10 == 0) goto L1e
            nz r3 = r9.l
            int r10 = r3.k0(r10, r1, r0)
            goto L1f
        L1e:
            r10 = r2
        L1f:
            if (r11 == 0) goto L28
            nz r3 = r9.l
            int r11 = r3.m0(r11, r1, r0)
            goto L29
        L28:
            r11 = r2
        L29:
            defpackage.m70.b()
            r5 r0 = r9.e
            int r1 = r0.k()
            r3 = r2
        L33:
            if (r3 >= r1) goto L69
            android.view.View r4 = r0.j(r3)
            b00 r5 = r9.H(r4)
            if (r5 == 0) goto L66
            b00 r5 = r5.i
            if (r5 == 0) goto L66
            android.view.View r5 = r5.a
            int r6 = r4.getLeft()
            int r4 = r4.getTop()
            int r7 = r5.getLeft()
            if (r6 != r7) goto L59
            int r7 = r5.getTop()
            if (r4 == r7) goto L66
        L59:
            int r7 = r5.getWidth()
            int r7 = r7 + r6
            int r8 = r5.getHeight()
            int r8 = r8 + r4
            r5.layout(r6, r4, r7, r8)
        L66:
            int r3 = r3 + 1
            goto L33
        L69:
            r0 = 1
            r9.Q(r0)
            r9.b0(r2)
            if (r12 == 0) goto L76
            r12[r2] = r10
            r12[r0] = r11
        L76:
            return
    }

    public final void Y(int r3) {
            r2 = this;
            boolean r0 = r2.u
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 0
            r2.setScrollState(r0)
            a00 r0 = r2.W
            androidx.recyclerview.widget.RecyclerView r1 = r0.g
            r1.removeCallbacks(r0)
            android.widget.OverScroller r0 = r0.c
            r0.abortAnimation()
            nz r0 = r2.l
            if (r0 == 0) goto L20
            yq r0 = r0.e
            if (r0 == 0) goto L20
            r0.i()
        L20:
            nz r0 = r2.l
            if (r0 != 0) goto L2c
            java.lang.String r3 = "RecyclerView"
            java.lang.String r0 = "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument."
            android.util.Log.e(r3, r0)
            return
        L2c:
            r0.l0(r3)
            r2.awakenScrollBars()
            return
    }

    public final void Z(int r3, int r4, boolean r5) {
            r2 = this;
            nz r0 = r2.l
            if (r0 != 0) goto Lc
            java.lang.String r3 = "RecyclerView"
            java.lang.String r4 = "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument."
            android.util.Log.e(r3, r4)
            return
        Lc:
            boolean r1 = r2.u
            if (r1 == 0) goto L11
            goto L27
        L11:
            boolean r0 = r0.d()
            r1 = 0
            if (r0 != 0) goto L19
            r3 = r1
        L19:
            nz r0 = r2.l
            boolean r0 = r0.e()
            if (r0 != 0) goto L22
            r4 = r1
        L22:
            if (r3 != 0) goto L28
            if (r4 == 0) goto L27
            goto L28
        L27:
            return
        L28:
            if (r5 == 0) goto L39
            r5 = 1
            if (r3 == 0) goto L2e
            r1 = r5
        L2e:
            if (r4 == 0) goto L32
            r1 = r1 | 2
        L32:
            iw r0 = r2.getScrollingChildHelper()
            r0.g(r1, r5)
        L39:
            a00 r5 = r2.W
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = 0
            r5.b(r3, r4, r0, r1)
            return
    }

    public final void a0() {
            r2 = this;
            int r0 = r2.s
            r1 = 1
            int r0 = r0 + r1
            r2.s = r0
            if (r0 != r1) goto Lf
            boolean r0 = r2.u
            if (r0 != 0) goto Lf
            r0 = 0
            r2.t = r0
        Lf:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(java.util.ArrayList r2, int r3, int r4) {
            r1 = this;
            nz r0 = r1.l
            if (r0 == 0) goto L7
            r0.getClass()
        L7:
            super.addFocusables(r2, r3, r4)
            return
    }

    public final void b0(boolean r4) {
            r3 = this;
            int r0 = r3.s
            r1 = 1
            if (r0 >= r1) goto L7
            r3.s = r1
        L7:
            r0 = 0
            if (r4 != 0) goto L10
            boolean r2 = r3.u
            if (r2 != 0) goto L10
            r3.t = r0
        L10:
            int r2 = r3.s
            if (r2 != r1) goto L2f
            if (r4 == 0) goto L29
            boolean r4 = r3.t
            if (r4 == 0) goto L29
            boolean r4 = r3.u
            if (r4 != 0) goto L29
            nz r4 = r3.l
            if (r4 == 0) goto L29
            fz r4 = r3.k
            if (r4 == 0) goto L29
            r3.o()
        L29:
            boolean r4 = r3.u
            if (r4 != 0) goto L2f
            r3.t = r0
        L2f:
            int r4 = r3.s
            int r4 = r4 - r1
            r3.s = r4
            return
    }

    public final void c0(int r2) {
            r1 = this;
            iw r0 = r1.getScrollingChildHelper()
            r0.h(r2)
            return
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(android.view.ViewGroup.LayoutParams r2) {
            r1 = this;
            boolean r0 = r2 instanceof defpackage.oz
            if (r0 == 0) goto L10
            nz r0 = r1.l
            oz r2 = (defpackage.oz) r2
            boolean r2 = r0.f(r2)
            if (r2 == 0) goto L10
            r2 = 1
            return r2
        L10:
            r2 = 0
            return r2
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
            r2 = this;
            nz r0 = r2.l
            if (r0 != 0) goto L5
            goto L14
        L5:
            boolean r0 = r0.d()
            if (r0 == 0) goto L14
            nz r0 = r2.l
            yz r1 = r2.c0
            int r0 = r0.j(r1)
            return r0
        L14:
            r0 = 0
            return r0
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
            r2 = this;
            nz r0 = r2.l
            if (r0 != 0) goto L5
            goto L14
        L5:
            boolean r0 = r0.d()
            if (r0 == 0) goto L14
            nz r0 = r2.l
            yz r1 = r2.c0
            int r0 = r0.k(r1)
            return r0
        L14:
            r0 = 0
            return r0
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
            r2 = this;
            nz r0 = r2.l
            if (r0 != 0) goto L5
            goto L14
        L5:
            boolean r0 = r0.d()
            if (r0 == 0) goto L14
            nz r0 = r2.l
            yz r1 = r2.c0
            int r0 = r0.l(r1)
            return r0
        L14:
            r0 = 0
            return r0
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
            r2 = this;
            nz r0 = r2.l
            if (r0 != 0) goto L5
            goto L14
        L5:
            boolean r0 = r0.e()
            if (r0 == 0) goto L14
            nz r0 = r2.l
            yz r1 = r2.c0
            int r0 = r0.m(r1)
            return r0
        L14:
            r0 = 0
            return r0
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
            r2 = this;
            nz r0 = r2.l
            if (r0 != 0) goto L5
            goto L14
        L5:
            boolean r0 = r0.e()
            if (r0 == 0) goto L14
            nz r0 = r2.l
            yz r1 = r2.c0
            int r0 = r0.n(r1)
            return r0
        L14:
            r0 = 0
            return r0
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
            r2 = this;
            nz r0 = r2.l
            if (r0 != 0) goto L5
            goto L14
        L5:
            boolean r0 = r0.e()
            if (r0 == 0) goto L14
            nz r0 = r2.l
            yz r1 = r2.c0
            int r0 = r0.o(r1)
            return r0
        L14:
            r0 = 0
            return r0
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float r2, float r3, boolean r4) {
            r1 = this;
            iw r0 = r1.getScrollingChildHelper()
            boolean r2 = r0.a(r2, r3, r4)
            return r2
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float r2, float r3) {
            r1 = this;
            iw r0 = r1.getScrollingChildHelper()
            boolean r2 = r0.b(r2, r3)
            return r2
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int r7, int r8, int[] r9, int[] r10) {
            r6 = this;
            iw r0 = r6.getScrollingChildHelper()
            r5 = 0
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            boolean r7 = r0.c(r1, r2, r3, r4, r5)
            return r7
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int r9, int r10, int r11, int r12, int[] r13) {
            r8 = this;
            iw r0 = r8.getScrollingChildHelper()
            r6 = 0
            r7 = 0
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            boolean r9 = r0.d(r1, r2, r3, r4, r5, r6, r7)
            return r9
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent r1) {
            r0 = this;
            r0.onPopulateAccessibilityEvent(r1)
            r1 = 1
            return r1
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(android.util.SparseArray r1) {
            r0 = this;
            r0.dispatchThawSelfOnly(r1)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(android.util.SparseArray r1) {
            r0 = this;
            r0.dispatchFreezeSelfOnly(r1)
            return
    }

    @Override // android.view.View
    public final void draw(android.graphics.Canvas r9) {
            r8 = this;
            super.draw(r9)
            java.util.ArrayList r0 = r8.m
            int r1 = r0.size()
            r2 = 0
            r3 = r2
        Lb:
            if (r3 >= r1) goto L19
            java.lang.Object r4 = r0.get(r3)
            kz r4 = (defpackage.kz) r4
            r4.b(r9, r8)
            int r3 = r3 + 1
            goto Lb
        L19:
            android.widget.EdgeEffect r1 = r8.D
            r3 = 1
            if (r1 == 0) goto L53
            boolean r1 = r1.isFinished()
            if (r1 != 0) goto L53
            int r1 = r9.save()
            boolean r4 = r8.g
            if (r4 == 0) goto L31
            int r4 = r8.getPaddingBottom()
            goto L32
        L31:
            r4 = r2
        L32:
            r5 = 1132920832(0x43870000, float:270.0)
            r9.rotate(r5)
            int r5 = r8.getHeight()
            int r5 = -r5
            int r5 = r5 + r4
            float r4 = (float) r5
            r5 = 0
            r9.translate(r4, r5)
            android.widget.EdgeEffect r4 = r8.D
            if (r4 == 0) goto L4e
            boolean r4 = r4.draw(r9)
            if (r4 == 0) goto L4e
            r4 = r3
            goto L4f
        L4e:
            r4 = r2
        L4f:
            r9.restoreToCount(r1)
            goto L54
        L53:
            r4 = r2
        L54:
            android.widget.EdgeEffect r1 = r8.E
            if (r1 == 0) goto L84
            boolean r1 = r1.isFinished()
            if (r1 != 0) goto L84
            int r1 = r9.save()
            boolean r5 = r8.g
            if (r5 == 0) goto L73
            int r5 = r8.getPaddingLeft()
            float r5 = (float) r5
            int r6 = r8.getPaddingTop()
            float r6 = (float) r6
            r9.translate(r5, r6)
        L73:
            android.widget.EdgeEffect r5 = r8.E
            if (r5 == 0) goto L7f
            boolean r5 = r5.draw(r9)
            if (r5 == 0) goto L7f
            r5 = r3
            goto L80
        L7f:
            r5 = r2
        L80:
            r4 = r4 | r5
            r9.restoreToCount(r1)
        L84:
            android.widget.EdgeEffect r1 = r8.F
            if (r1 == 0) goto Lbd
            boolean r1 = r1.isFinished()
            if (r1 != 0) goto Lbd
            int r1 = r9.save()
            int r5 = r8.getWidth()
            boolean r6 = r8.g
            if (r6 == 0) goto L9f
            int r6 = r8.getPaddingTop()
            goto La0
        L9f:
            r6 = r2
        La0:
            r7 = 1119092736(0x42b40000, float:90.0)
            r9.rotate(r7)
            int r6 = -r6
            float r6 = (float) r6
            int r5 = -r5
            float r5 = (float) r5
            r9.translate(r6, r5)
            android.widget.EdgeEffect r5 = r8.F
            if (r5 == 0) goto Lb8
            boolean r5 = r5.draw(r9)
            if (r5 == 0) goto Lb8
            r5 = r3
            goto Lb9
        Lb8:
            r5 = r2
        Lb9:
            r4 = r4 | r5
            r9.restoreToCount(r1)
        Lbd:
            android.widget.EdgeEffect r1 = r8.G
            if (r1 == 0) goto L10c
            boolean r1 = r1.isFinished()
            if (r1 != 0) goto L10c
            int r1 = r9.save()
            r5 = 1127481344(0x43340000, float:180.0)
            r9.rotate(r5)
            boolean r5 = r8.g
            if (r5 == 0) goto Lee
            int r5 = r8.getWidth()
            int r5 = -r5
            int r6 = r8.getPaddingRight()
            int r6 = r6 + r5
            float r5 = (float) r6
            int r6 = r8.getHeight()
            int r6 = -r6
            int r7 = r8.getPaddingBottom()
            int r7 = r7 + r6
            float r6 = (float) r7
            r9.translate(r5, r6)
            goto Lfd
        Lee:
            int r5 = r8.getWidth()
            int r5 = -r5
            float r5 = (float) r5
            int r6 = r8.getHeight()
            int r6 = -r6
            float r6 = (float) r6
            r9.translate(r5, r6)
        Lfd:
            android.widget.EdgeEffect r5 = r8.G
            if (r5 == 0) goto L108
            boolean r5 = r5.draw(r9)
            if (r5 == 0) goto L108
            r2 = r3
        L108:
            r4 = r4 | r2
            r9.restoreToCount(r1)
        L10c:
            if (r4 != 0) goto L121
            jz r9 = r8.H
            if (r9 == 0) goto L121
            int r9 = r0.size()
            if (r9 <= 0) goto L121
            jz r9 = r8.H
            boolean r9 = r9.f()
            if (r9 == 0) goto L121
            goto L122
        L121:
            r3 = r4
        L122:
            if (r3 == 0) goto L129
            java.util.WeakHashMap r9 = defpackage.ja0.a
            defpackage.s90.k(r8)
        L129:
            return
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(android.graphics.Canvas r1, android.view.View r2, long r3) {
            r0 = this;
            boolean r1 = super.drawChild(r1, r2, r3)
            return r1
    }

    public final void f(defpackage.b00 r6) {
            r5 = this;
            android.view.View r0 = r6.a
            android.view.ViewParent r1 = r0.getParent()
            r2 = 1
            if (r1 != r5) goto Lb
            r1 = r2
            goto Lc
        Lb:
            r1 = 0
        Lc:
            tz r3 = r5.b
            b00 r4 = r5.H(r0)
            r3.j(r4)
            boolean r6 = r6.j()
            r3 = -1
            if (r6 == 0) goto L26
            r5 r6 = r5.e
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            r6.c(r0, r3, r1, r2)
            return
        L26:
            if (r1 != 0) goto L2e
            r5 r6 = r5.e
            r6.b(r0, r3, r2)
            return
        L2e:
            r5 r6 = r5.e
            java.lang.Object r1 = r6.b
            ez r1 = (defpackage.ez) r1
            androidx.recyclerview.widget.RecyclerView r1 = r1.a
            int r1 = r1.indexOfChild(r0)
            if (r1 < 0) goto L47
            java.lang.Object r2 = r6.c
            fa r2 = (defpackage.fa) r2
            r2.h(r1)
            r6.u(r0)
            return
        L47:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "view is not a child, cannot hide "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r6.<init>(r0)
            throw r6
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final android.view.View focusSearch(android.view.View r17, int r18) {
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            nz r3 = r0.l
            r3.getClass()
            fz r3 = r0.k
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L21
            nz r3 = r0.l
            if (r3 == 0) goto L21
            boolean r3 = r0.L()
            if (r3 != 0) goto L21
            boolean r3 = r0.u
            if (r3 != 0) goto L21
            r3 = r4
            goto L22
        L21:
            r3 = r5
        L22:
            android.view.FocusFinder r6 = android.view.FocusFinder.getInstance()
            yz r7 = r0.c0
            tz r8 = r0.b
            r9 = 17
            r11 = 33
            r13 = 0
            r14 = 2
            if (r3 == 0) goto L93
            if (r2 == r14) goto L36
            if (r2 != r4) goto L93
        L36:
            nz r3 = r0.l
            boolean r3 = r3.e()
            if (r3 == 0) goto L4c
            if (r2 != r14) goto L43
            r3 = 130(0x82, float:1.82E-43)
            goto L44
        L43:
            r3 = r11
        L44:
            android.view.View r3 = r6.findNextFocus(r0, r1, r3)
            if (r3 != 0) goto L4c
            r3 = r4
            goto L4d
        L4c:
            r3 = r5
        L4d:
            if (r3 != 0) goto L77
            nz r15 = r0.l
            boolean r15 = r15.d()
            if (r15 == 0) goto L77
            nz r3 = r0.l
            int r3 = r3.A()
            if (r3 != r4) goto L61
            r3 = r4
            goto L62
        L61:
            r3 = r5
        L62:
            if (r2 != r14) goto L66
            r15 = r4
            goto L67
        L66:
            r15 = r5
        L67:
            r3 = r3 ^ r15
            if (r3 == 0) goto L6d
            r3 = 66
            goto L6e
        L6d:
            r3 = r9
        L6e:
            android.view.View r3 = r6.findNextFocus(r0, r1, r3)
            if (r3 != 0) goto L76
            r3 = r4
            goto L77
        L76:
            r3 = r5
        L77:
            if (r3 == 0) goto L8e
            r0.m()
            android.view.View r3 = r16.A(r17)
            if (r3 != 0) goto L83
            goto La4
        L83:
            r0.a0()
            nz r3 = r0.l
            r3.Q(r1, r2, r8, r7)
            r0.b0(r5)
        L8e:
            android.view.View r3 = r6.findNextFocus(r0, r1, r2)
            goto Lb3
        L93:
            android.view.View r6 = r6.findNextFocus(r0, r1, r2)
            if (r6 != 0) goto Lb2
            if (r3 == 0) goto Lb2
            r0.m()
            android.view.View r3 = r16.A(r17)
            if (r3 != 0) goto La5
        La4:
            return r13
        La5:
            r0.a0()
            nz r3 = r0.l
            android.view.View r3 = r3.Q(r1, r2, r8, r7)
            r0.b0(r5)
            goto Lb3
        Lb2:
            r3 = r6
        Lb3:
            if (r3 == 0) goto Lca
            boolean r6 = r3.hasFocusable()
            if (r6 != 0) goto Lca
            android.view.View r4 = r0.getFocusedChild()
            if (r4 != 0) goto Lc6
            android.view.View r1 = super.focusSearch(r17, r18)
            return r1
        Lc6:
            r0.U(r3, r13)
            return r1
        Lca:
            if (r3 == 0) goto L161
            if (r3 != r0) goto Ld0
            goto L161
        Ld0:
            android.view.View r6 = r0.A(r3)
            if (r6 != 0) goto Ld9
            r4 = r5
            goto L196
        Ld9:
            if (r1 != 0) goto Ldd
            goto L196
        Ldd:
            android.view.View r6 = r16.A(r17)
            if (r6 != 0) goto Le5
            goto L196
        Le5:
            int r6 = r1.getWidth()
            int r7 = r1.getHeight()
            android.graphics.Rect r8 = r0.h
            r8.set(r5, r5, r6, r7)
            int r6 = r3.getWidth()
            int r7 = r3.getHeight()
            android.graphics.Rect r13 = r0.i
            r13.set(r5, r5, r6, r7)
            r0.offsetDescendantRectToMyCoords(r1, r8)
            r0.offsetDescendantRectToMyCoords(r3, r13)
            nz r6 = r0.l
            int r6 = r6.A()
            if (r6 != r4) goto L10f
            r6 = -1
            goto L110
        L10f:
            r6 = r4
        L110:
            int r15 = r8.left
            int r5 = r13.left
            if (r15 < r5) goto L11a
            int r7 = r8.right
            if (r7 > r5) goto L122
        L11a:
            int r7 = r8.right
            int r12 = r13.right
            if (r7 >= r12) goto L122
            r5 = r4
            goto L12f
        L122:
            int r7 = r8.right
            int r12 = r13.right
            if (r7 > r12) goto L12a
            if (r15 < r12) goto L12e
        L12a:
            if (r15 <= r5) goto L12e
            r5 = -1
            goto L12f
        L12e:
            r5 = 0
        L12f:
            int r7 = r8.top
            int r12 = r13.top
            if (r7 < r12) goto L139
            int r15 = r8.bottom
            if (r15 > r12) goto L141
        L139:
            int r15 = r8.bottom
            int r10 = r13.bottom
            if (r15 >= r10) goto L141
            r7 = r4
            goto L14e
        L141:
            int r8 = r8.bottom
            int r10 = r13.bottom
            if (r8 > r10) goto L149
            if (r7 < r10) goto L14d
        L149:
            if (r7 <= r12) goto L14d
            r7 = -1
            goto L14e
        L14d:
            r7 = 0
        L14e:
            if (r2 == r4) goto L18f
            if (r2 == r14) goto L187
            if (r2 == r9) goto L184
            if (r2 == r11) goto L181
            r6 = 66
            if (r2 == r6) goto L17e
            r6 = 130(0x82, float:1.82E-43)
            if (r2 != r6) goto L163
            if (r7 <= 0) goto L161
            goto L196
        L161:
            r4 = 0
            goto L196
        L163:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Invalid direction: "
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r2 = r0.y()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2)
            throw r1
        L17e:
            if (r5 <= 0) goto L161
            goto L196
        L181:
            if (r7 >= 0) goto L161
            goto L196
        L184:
            if (r5 >= 0) goto L161
            goto L196
        L187:
            if (r7 > 0) goto L196
            if (r7 != 0) goto L161
            int r5 = r5 * r6
            if (r5 < 0) goto L161
            goto L196
        L18f:
            if (r7 < 0) goto L196
            if (r7 != 0) goto L161
            int r5 = r5 * r6
            if (r5 > 0) goto L161
        L196:
            if (r4 == 0) goto L199
            return r3
        L199:
            android.view.View r1 = super.focusSearch(r17, r18)
            return r1
    }

    public final void g(defpackage.kz r3) {
            r2 = this;
            nz r0 = r2.l
            if (r0 == 0) goto L9
            java.lang.String r1 = "Cannot add item decoration during a scroll  or layout"
            r0.c(r1)
        L9:
            java.util.ArrayList r0 = r2.m
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L15
            r1 = 0
            r2.setWillNotDraw(r1)
        L15:
            r0.add(r3)
            r2.N()
            r2.requestLayout()
            return
    }

    @Override // android.view.ViewGroup
    public final android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
            r3 = this;
            nz r0 = r3.l
            if (r0 == 0) goto L9
            oz r0 = r0.r()
            return r0
        L9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "RecyclerView has no LayoutManager"
            r1.<init>(r2)
            java.lang.String r2 = r3.y()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @Override // android.view.ViewGroup
    public final android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet r3) {
            r2 = this;
            nz r0 = r2.l
            if (r0 == 0) goto Ld
            android.content.Context r1 = r2.getContext()
            oz r3 = r0.s(r1, r3)
            return r3
        Ld:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "RecyclerView has no LayoutManager"
            r0.<init>(r1)
            java.lang.String r1 = r2.y()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            throw r3
    }

    @Override // android.view.ViewGroup
    public final android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams r3) {
            r2 = this;
            nz r0 = r2.l
            if (r0 == 0) goto L9
            oz r3 = r0.t(r3)
            return r3
        L9:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "RecyclerView has no LayoutManager"
            r0.<init>(r1)
            java.lang.String r1 = r2.y()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            throw r3
    }

    @Override // android.view.ViewGroup, android.view.View
    public java.lang.CharSequence getAccessibilityClassName() {
            r1 = this;
            java.lang.String r0 = "androidx.recyclerview.widget.RecyclerView"
            return r0
    }

    public defpackage.fz getAdapter() {
            r1 = this;
            fz r0 = r1.k
            return r0
    }

    @Override // android.view.View
    public int getBaseline() {
            r1 = this;
            nz r0 = r1.l
            if (r0 == 0) goto L9
            r0.getClass()
            r0 = -1
            return r0
        L9:
            int r0 = super.getBaseline()
            return r0
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int r1, int r2) {
            r0 = this;
            int r1 = super.getChildDrawingOrder(r1, r2)
            return r1
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
            r1 = this;
            boolean r0 = r1.g
            return r0
    }

    public defpackage.d00 getCompatAccessibilityDelegate() {
            r1 = this;
            d00 r0 = r1.j0
            return r0
    }

    public defpackage.iz getEdgeEffectFactory() {
            r1 = this;
            iz r0 = r1.C
            return r0
    }

    public defpackage.jz getItemAnimator() {
            r1 = this;
            jz r0 = r1.H
            return r0
    }

    public int getItemDecorationCount() {
            r1 = this;
            java.util.ArrayList r0 = r1.m
            int r0 = r0.size()
            return r0
    }

    public defpackage.nz getLayoutManager() {
            r1 = this;
            nz r0 = r1.l
            return r0
    }

    public int getMaxFlingVelocity() {
            r1 = this;
            int r0 = r1.S
            return r0
    }

    public int getMinFlingVelocity() {
            r1 = this;
            int r0 = r1.R
            return r0
    }

    public long getNanoTime() {
            r2 = this;
            long r0 = java.lang.System.nanoTime()
            return r0
    }

    public defpackage.pz getOnFlingListener() {
            r1 = this;
            pz r0 = r1.Q
            return r0
    }

    public boolean getPreserveFocusAfterLayout() {
            r1 = this;
            boolean r0 = r1.V
            return r0
    }

    public defpackage.sz getRecycledViewPool() {
            r1 = this;
            tz r0 = r1.b
            sz r0 = r0.c()
            return r0
    }

    public int getScrollState() {
            r1 = this;
            int r0 = r1.I
            return r0
    }

    public final void h(defpackage.qz r2) {
            r1 = this;
            java.util.ArrayList r0 = r1.e0
            if (r0 != 0) goto Lb
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.e0 = r0
        Lb:
            java.util.ArrayList r0 = r1.e0
            r0.add(r2)
            return
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
            r2 = this;
            iw r0 = r2.getScrollingChildHelper()
            r1 = 0
            boolean r0 = r0.f(r1)
            return r0
    }

    public final void i(java.lang.String r3) {
            r2 = this;
            boolean r0 = r2.L()
            if (r0 == 0) goto L26
            if (r3 != 0) goto L20
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Cannot call this method while RecyclerView is computing a layout or scrolling"
            r0.<init>(r1)
            java.lang.String r1 = r2.y()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            throw r3
        L20:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L26:
            int r3 = r2.B
            if (r3 <= 0) goto L48
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = ""
            r0.<init>(r1)
            java.lang.String r1 = r2.y()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            java.lang.String r0 = "RecyclerView"
            java.lang.String r1 = "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame."
            android.util.Log.w(r0, r1, r3)
        L48:
            return
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
            r1 = this;
            boolean r0 = r1.p
            return r0
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
            r1 = this;
            boolean r0 = r1.u
            return r0
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
            r1 = this;
            iw r0 = r1.getScrollingChildHelper()
            boolean r0 = r0.d
            return r0
    }

    public final void k() {
            r8 = this;
            r5 r0 = r8.e
            int r0 = r0.t()
            r1 = 0
            r2 = r1
        L8:
            r3 = -1
            if (r2 >= r0) goto L22
            r5 r4 = r8.e
            android.view.View r4 = r4.s(r2)
            b00 r4 = I(r4)
            boolean r5 = r4.o()
            if (r5 != 0) goto L1f
            r4.d = r3
            r4.g = r3
        L1f:
            int r2 = r2 + 1
            goto L8
        L22:
            tz r0 = r8.b
            java.util.ArrayList r2 = r0.a
            java.util.ArrayList r4 = r0.c
            int r5 = r4.size()
            r6 = r1
        L2d:
            if (r6 >= r5) goto L3c
            java.lang.Object r7 = r4.get(r6)
            b00 r7 = (defpackage.b00) r7
            r7.d = r3
            r7.g = r3
            int r6 = r6 + 1
            goto L2d
        L3c:
            int r4 = r2.size()
            r5 = r1
        L41:
            if (r5 >= r4) goto L50
            java.lang.Object r6 = r2.get(r5)
            b00 r6 = (defpackage.b00) r6
            r6.d = r3
            r6.g = r3
            int r5 = r5 + 1
            goto L41
        L50:
            java.util.ArrayList r2 = r0.b
            if (r2 == 0) goto L69
            int r2 = r2.size()
        L58:
            if (r1 >= r2) goto L69
            java.util.ArrayList r4 = r0.b
            java.lang.Object r4 = r4.get(r1)
            b00 r4 = (defpackage.b00) r4
            r4.d = r3
            r4.g = r3
            int r1 = r1 + 1
            goto L58
        L69:
            return
    }

    public final void l(int r3, int r4) {
            r2 = this;
            android.widget.EdgeEffect r0 = r2.D
            if (r0 == 0) goto L18
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L18
            if (r3 <= 0) goto L18
            android.widget.EdgeEffect r0 = r2.D
            r0.onRelease()
            android.widget.EdgeEffect r0 = r2.D
            boolean r0 = r0.isFinished()
            goto L19
        L18:
            r0 = 0
        L19:
            android.widget.EdgeEffect r1 = r2.F
            if (r1 == 0) goto L31
            boolean r1 = r1.isFinished()
            if (r1 != 0) goto L31
            if (r3 >= 0) goto L31
            android.widget.EdgeEffect r3 = r2.F
            r3.onRelease()
            android.widget.EdgeEffect r3 = r2.F
            boolean r3 = r3.isFinished()
            r0 = r0 | r3
        L31:
            android.widget.EdgeEffect r3 = r2.E
            if (r3 == 0) goto L49
            boolean r3 = r3.isFinished()
            if (r3 != 0) goto L49
            if (r4 <= 0) goto L49
            android.widget.EdgeEffect r3 = r2.E
            r3.onRelease()
            android.widget.EdgeEffect r3 = r2.E
            boolean r3 = r3.isFinished()
            r0 = r0 | r3
        L49:
            android.widget.EdgeEffect r3 = r2.G
            if (r3 == 0) goto L61
            boolean r3 = r3.isFinished()
            if (r3 != 0) goto L61
            if (r4 >= 0) goto L61
            android.widget.EdgeEffect r3 = r2.G
            r3.onRelease()
            android.widget.EdgeEffect r3 = r2.G
            boolean r3 = r3.isFinished()
            r0 = r0 | r3
        L61:
            if (r0 == 0) goto L68
            java.util.WeakHashMap r3 = defpackage.ja0.a
            defpackage.s90.k(r2)
        L68:
            return
    }

    public final void m() {
            r3 = this;
            boolean r0 = r3.r
            java.lang.String r1 = "RV FullInvalidate"
            if (r0 == 0) goto L29
            boolean r0 = r3.y
            if (r0 == 0) goto Lb
            goto L29
        Lb:
            y1 r0 = r3.d
            boolean r2 = r0.f()
            if (r2 != 0) goto L14
            goto L28
        L14:
            r0.getClass()
            boolean r0 = r0.f()
            if (r0 == 0) goto L28
            int r0 = defpackage.n70.a
            defpackage.m70.a(r1)
            r3.o()
            defpackage.m70.b()
        L28:
            return
        L29:
            int r0 = defpackage.n70.a
            defpackage.m70.a(r1)
            r3.o()
            defpackage.m70.b()
            return
    }

    public final void n(int r3, int r4) {
            r2 = this;
            int r0 = r2.getPaddingLeft()
            int r1 = r2.getPaddingRight()
            int r1 = r1 + r0
            java.util.WeakHashMap r0 = defpackage.ja0.a
            int r0 = defpackage.s90.e(r2)
            int r3 = defpackage.nz.g(r3, r1, r0)
            int r0 = r2.getPaddingTop()
            int r1 = r2.getPaddingBottom()
            int r1 = r1 + r0
            int r0 = defpackage.s90.d(r2)
            int r4 = defpackage.nz.g(r4, r1, r0)
            r2.setMeasuredDimension(r3, r4)
            return
    }

    public final void o() {
            r21 = this;
            r0 = r21
            fz r1 = r0.k
            java.lang.String r2 = "RecyclerView"
            if (r1 != 0) goto Le
            java.lang.String r1 = "No adapter attached; skipping layout"
            android.util.Log.e(r2, r1)
            return
        Le:
            nz r1 = r0.l
            if (r1 != 0) goto L18
            java.lang.String r1 = "No layout manager attached; skipping layout"
            android.util.Log.e(r2, r1)
            return
        L18:
            yz r1 = r0.c0
            r3 = 0
            r1.i = r3
            int r4 = r1.d
            r5 = 1
            if (r4 != r5) goto L2e
            r0.p()
            nz r4 = r0.l
            r4.n0(r0)
            r0.q()
            goto L68
        L2e:
            y1 r4 = r0.d
            java.io.Serializable r6 = r4.d
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            boolean r6 = r6.isEmpty()
            if (r6 != 0) goto L45
            java.io.Serializable r4 = r4.c
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L45
            goto L60
        L45:
            nz r4 = r0.l
            int r4 = r4.n
            int r6 = r0.getWidth()
            if (r4 != r6) goto L60
            nz r4 = r0.l
            int r4 = r4.o
            int r6 = r0.getHeight()
            if (r4 == r6) goto L5a
            goto L60
        L5a:
            nz r4 = r0.l
            r4.n0(r0)
            goto L68
        L60:
            nz r4 = r0.l
            r4.n0(r0)
            r0.q()
        L68:
            r4 = 4
            r1.a(r4)
            r0.a0()
            r0.P()
            r1.d = r5
            boolean r6 = r1.j
            r7 = 0
            tz r8 = r0.b
            d4 r9 = r0.f
            if (r6 == 0) goto L298
            r5 r6 = r0.e
            int r6 = r6.k()
            int r6 = r6 - r5
        L84:
            if (r6 < 0) goto L1c3
            r5 r10 = r0.e
            android.view.View r10 = r10.j(r6)
            b00 r10 = I(r10)
            boolean r11 = r10.o()
            if (r11 == 0) goto L9a
            r17 = r5
            goto L1bc
        L9a:
            long r11 = r0.G(r10)
            jz r13 = r0.H
            r13.getClass()
            lw r13 = new lw
            r13.<init>()
            r13.a(r10)
            java.lang.Object r14 = r9.c
            bs r14 = (defpackage.bs) r14
            java.lang.Object r15 = r9.b
            u30 r15 = (defpackage.u30) r15
            java.lang.Object r14 = r14.c(r11, r7)
            b00 r14 = (defpackage.b00) r14
            if (r14 == 0) goto L1b7
            boolean r16 = r14.o()
            if (r16 != 0) goto L1b7
            java.lang.Object r16 = r15.getOrDefault(r14, r7)
            r17 = r5
            r5 = r16
            oa0 r5 = (defpackage.oa0) r5
            if (r5 == 0) goto Ld6
            int r5 = r5.a
            r5 = r5 & 1
            if (r5 == 0) goto Ld6
            r5 = r17
            goto Ld7
        Ld6:
            r5 = r3
        Ld7:
            java.lang.Object r15 = r15.getOrDefault(r10, r7)
            oa0 r15 = (defpackage.oa0) r15
            if (r15 == 0) goto Le8
            int r15 = r15.a
            r15 = r15 & 1
            if (r15 == 0) goto Le8
            r15 = r17
            goto Le9
        Le8:
            r15 = r3
        Le9:
            if (r5 == 0) goto Lf2
            if (r14 != r10) goto Lf2
            r9.a(r10, r13)
            goto L1bc
        Lf2:
            lw r7 = r9.H(r14, r4)
            r9.a(r10, r13)
            r13 = 8
            lw r13 = r9.H(r10, r13)
            if (r7 != 0) goto L18f
            r5 r5 = r0.e
            int r5 = r5.k()
            r7 = r3
        L108:
            if (r7 >= r5) goto L16e
            r5 r13 = r0.e
            android.view.View r13 = r13.j(r7)
            b00 r13 = I(r13)
            if (r13 != r10) goto L117
            goto L16b
        L117:
            long r18 = r0.G(r13)
            int r15 = (r18 > r11 ? 1 : (r18 == r11 ? 0 : -1))
            if (r15 != 0) goto L16b
            fz r1 = r0.k
            java.lang.String r2 = " \n View Holder 2:"
            if (r1 == 0) goto L14a
            boolean r1 = r1.b
            if (r1 == 0) goto L14a
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:"
            r3.<init>(r4)
            r3.append(r13)
            r3.append(r2)
            r3.append(r10)
            java.lang.String r2 = r0.y()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2)
            throw r1
        L14a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:"
            r3.<init>(r4)
            r3.append(r13)
            r3.append(r2)
            r3.append(r10)
            java.lang.String r2 = r0.y()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2)
            throw r1
        L16b:
            int r7 = r7 + 1
            goto L108
        L16e:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r7 = "Problem while matching changed view holders with the newones. The pre-layout information for the change holder "
            r5.<init>(r7)
            r5.append(r14)
            java.lang.String r7 = " cannot be found but it is necessary for "
            r5.append(r7)
            r5.append(r10)
            java.lang.String r7 = r0.y()
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            android.util.Log.e(r2, r5)
            goto L1bc
        L18f:
            r14.n(r3)
            if (r5 == 0) goto L197
            r0.f(r14)
        L197:
            if (r14 == r10) goto L1ab
            if (r15 == 0) goto L19e
            r0.f(r10)
        L19e:
            r14.h = r10
            r0.f(r14)
            r8.j(r14)
            r10.n(r3)
            r10.i = r14
        L1ab:
            jz r5 = r0.H
            boolean r5 = r5.a(r14, r10, r7, r13)
            if (r5 == 0) goto L1bc
            r0.S()
            goto L1bc
        L1b7:
            r17 = r5
            r9.a(r10, r13)
        L1bc:
            int r6 = r6 + (-1)
            r5 = r17
            r7 = 0
            goto L84
        L1c3:
            r17 = r5
            java.lang.Object r2 = r9.b
            u30 r2 = (defpackage.u30) r2
            int r4 = r2.c
            int r4 = r4 + (-1)
        L1cd:
            if (r4 < 0) goto L296
            java.lang.Object r5 = r2.h(r4)
            r11 = r5
            b00 r11 = (defpackage.b00) r11
            java.lang.Object r5 = r2.i(r4)
            oa0 r5 = (defpackage.oa0) r5
            int r6 = r5.a
            r7 = r6 & 3
            ez r10 = r0.r0
            r12 = 3
            if (r7 != r12) goto L1f3
            androidx.recyclerview.widget.RecyclerView r6 = r10.a
            nz r7 = r6.l
            android.view.View r10 = r11.a
            tz r6 = r6.b
            r7.g0(r10, r6)
        L1f0:
            r7 = 0
            goto L286
        L1f3:
            r7 = r6 & 1
            if (r7 == 0) goto L20d
            lw r6 = r5.b
            if (r6 != 0) goto L207
            androidx.recyclerview.widget.RecyclerView r6 = r10.a
            nz r7 = r6.l
            android.view.View r10 = r11.a
            tz r6 = r6.b
            r7.g0(r10, r6)
            goto L1f0
        L207:
            lw r7 = r5.c
            r10.g(r11, r6, r7)
            goto L1f0
        L20d:
            r7 = r6 & 14
            r12 = 14
            if (r7 != r12) goto L21b
            lw r6 = r5.b
            lw r7 = r5.c
            r10.f(r11, r6, r7)
            goto L1f0
        L21b:
            r7 = r6 & 12
            r12 = 12
            if (r7 != r12) goto L26d
            lw r6 = r5.b
            lw r7 = r5.c
            r10.getClass()
            r11.n(r3)
            androidx.recyclerview.widget.RecyclerView r10 = r10.a
            boolean r12 = r10.y
            if (r12 == 0) goto L23d
            jz r12 = r10.H
            boolean r6 = r12.a(r11, r11, r6, r7)
            if (r6 == 0) goto L26b
            r10.S()
            goto L26b
        L23d:
            jz r12 = r10.H
            uf r12 = (defpackage.uf) r12
            r12.getClass()
            int r13 = r6.a
            int r14 = r7.a
            if (r13 != r14) goto L257
            int r15 = r6.b
            int r3 = r7.b
            if (r15 == r3) goto L251
            goto L257
        L251:
            r12.c(r11)
            r3 = r10
            r6 = 0
            goto L266
        L257:
            int r3 = r6.b
            int r15 = r7.b
            r20 = r13
            r13 = r3
            r3 = r10
            r10 = r12
            r12 = r20
            boolean r6 = r10.g(r11, r12, r13, r14, r15)
        L266:
            if (r6 == 0) goto L26b
            r3.S()
        L26b:
            r3 = 0
            goto L1f0
        L26d:
            r3 = r6 & 4
            if (r3 == 0) goto L279
            lw r3 = r5.b
            r7 = 0
            r10.g(r11, r3, r7)
        L277:
            r3 = 0
            goto L286
        L279:
            r7 = 0
            r3 = r6 & 8
            if (r3 == 0) goto L277
            lw r3 = r5.b
            lw r6 = r5.c
            r10.f(r11, r3, r6)
            goto L277
        L286:
            r5.a = r3
            r5.b = r7
            r5.c = r7
            sx r3 = defpackage.oa0.d
            r3.c(r5)
            int r4 = r4 + (-1)
            r3 = 0
            goto L1cd
        L296:
            r7 = 0
            goto L29a
        L298:
            r17 = r5
        L29a:
            nz r2 = r0.l
            r2.f0(r8)
            int r2 = r1.e
            r1.b = r2
            r3 = 0
            r0.y = r3
            r0.z = r3
            r1.j = r3
            r1.k = r3
            nz r2 = r0.l
            r2.f = r3
            java.util.ArrayList r2 = r8.b
            if (r2 == 0) goto L2b7
            r2.clear()
        L2b7:
            nz r2 = r0.l
            boolean r4 = r2.k
            if (r4 == 0) goto L2c4
            r2.j = r3
            r2.k = r3
            r8.k()
        L2c4:
            nz r2 = r0.l
            r2.a0(r1)
            r2 = r17
            r0.Q(r2)
            r0.b0(r3)
            java.lang.Object r4 = r9.b
            u30 r4 = (defpackage.u30) r4
            r4.clear()
            java.lang.Object r4 = r9.c
            bs r4 = (defpackage.bs) r4
            r4.a()
            int[] r4 = r0.k0
            r5 = r4[r3]
            r6 = r4[r2]
            r0.C(r4)
            r8 = r4[r3]
            if (r8 != r5) goto L2f3
            r4 = r4[r2]
            if (r4 == r6) goto L2f1
            goto L2f3
        L2f1:
            r2 = r3
            goto L2f4
        L2f3:
            r2 = 1
        L2f4:
            if (r2 == 0) goto L2f9
            r0.t(r3, r3)
        L2f9:
            boolean r2 = r0.V
            r4 = -1
            r6 = -1
            if (r2 == 0) goto L3f9
            fz r2 = r0.k
            if (r2 == 0) goto L3f9
            boolean r2 = r0.hasFocus()
            if (r2 == 0) goto L3f9
            int r2 = r0.getDescendantFocusability()
            r8 = 393216(0x60000, float:5.51013E-40)
            if (r2 == r8) goto L3f9
            int r2 = r0.getDescendantFocusability()
            r8 = 131072(0x20000, float:1.83671E-40)
            if (r2 != r8) goto L322
            boolean r2 = r0.isFocused()
            if (r2 == 0) goto L322
            goto L3f9
        L322:
            boolean r2 = r0.isFocused()
            if (r2 != 0) goto L33a
            android.view.View r2 = r0.getFocusedChild()
            r5 r8 = r0.e
            java.lang.Object r8 = r8.d
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            boolean r2 = r8.contains(r2)
            if (r2 != 0) goto L33a
            goto L3f9
        L33a:
            long r8 = r1.m
            int r2 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r2 == 0) goto L380
            fz r2 = r0.k
            boolean r2 = r2.b
            if (r2 == 0) goto L380
            if (r2 != 0) goto L349
            goto L380
        L349:
            r5 r2 = r0.e
            int r2 = r2.t()
            r10 = r3
            r11 = r7
        L351:
            if (r10 >= r2) goto L381
            r5 r12 = r0.e
            android.view.View r12 = r12.s(r10)
            b00 r12 = I(r12)
            if (r12 == 0) goto L37d
            boolean r13 = r12.h()
            if (r13 != 0) goto L37d
            long r13 = r12.e
            int r13 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r13 != 0) goto L37d
            android.view.View r11 = r12.a
            r5 r13 = r0.e
            java.lang.Object r13 = r13.d
            java.util.ArrayList r13 = (java.util.ArrayList) r13
            boolean r11 = r13.contains(r11)
            if (r11 == 0) goto L37b
            r11 = r12
            goto L37d
        L37b:
            r11 = r12
            goto L381
        L37d:
            int r10 = r10 + 1
            goto L351
        L380:
            r11 = r7
        L381:
            if (r11 == 0) goto L39a
            android.view.View r2 = r11.a
            r5 r8 = r0.e
            java.lang.Object r8 = r8.d
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            boolean r8 = r8.contains(r2)
            if (r8 != 0) goto L39a
            boolean r8 = r2.hasFocusable()
            if (r8 != 0) goto L398
            goto L39a
        L398:
            r7 = r2
            goto L3e0
        L39a:
            r5 r2 = r0.e
            int r2 = r2.k()
            if (r2 <= 0) goto L3e0
            int r2 = r1.l
            if (r2 == r6) goto L3a7
            r3 = r2
        L3a7:
            int r2 = r1.b()
            r8 = r3
        L3ac:
            if (r8 >= r2) goto L3c2
            b00 r9 = r0.E(r8)
            if (r9 != 0) goto L3b5
            goto L3c2
        L3b5:
            android.view.View r9 = r9.a
            boolean r10 = r9.hasFocusable()
            if (r10 == 0) goto L3bf
            r7 = r9
            goto L3e0
        L3bf:
            int r8 = r8 + 1
            goto L3ac
        L3c2:
            int r2 = java.lang.Math.min(r2, r3)
            r17 = 1
            int r2 = r2 + (-1)
        L3ca:
            if (r2 < 0) goto L3e0
            b00 r3 = r0.E(r2)
            if (r3 != 0) goto L3d3
            goto L3e0
        L3d3:
            android.view.View r3 = r3.a
            boolean r8 = r3.hasFocusable()
            if (r8 == 0) goto L3dd
            r7 = r3
            goto L3e0
        L3dd:
            int r2 = r2 + (-1)
            goto L3ca
        L3e0:
            if (r7 == 0) goto L3f9
            int r2 = r1.n
            long r8 = (long) r2
            int r3 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r3 == 0) goto L3f6
            android.view.View r2 = r7.findViewById(r2)
            if (r2 == 0) goto L3f6
            boolean r3 = r2.isFocusable()
            if (r3 == 0) goto L3f6
            r7 = r2
        L3f6:
            r7.requestFocus()
        L3f9:
            r1.m = r4
            r1.l = r6
            r1.n = r6
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
            r5 = this;
            super.onAttachedToWindow()
            r0 = 0
            r5.A = r0
            r1 = 1
            r5.p = r1
            boolean r2 = r5.r
            if (r2 == 0) goto L15
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L15
            r2 = r1
            goto L16
        L15:
            r2 = r0
        L16:
            r5.r = r2
            nz r2 = r5.l
            if (r2 == 0) goto L21
            r2.g = r1
            r2.O(r5)
        L21:
            r5.i0 = r0
            java.lang.ThreadLocal r0 = defpackage.dn.e
            java.lang.Object r1 = r0.get()
            dn r1 = (defpackage.dn) r1
            r5.a0 = r1
            if (r1 != 0) goto L6b
            dn r1 = new dn
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.a = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.d = r2
            r5.a0 = r1
            java.util.WeakHashMap r1 = defpackage.ja0.a
            android.view.Display r1 = defpackage.t90.b(r5)
            boolean r2 = r5.isInEditMode()
            if (r2 != 0) goto L5d
            if (r1 == 0) goto L5d
            float r1 = r1.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L5d
            goto L5f
        L5d:
            r1 = 1114636288(0x42700000, float:60.0)
        L5f:
            dn r2 = r5.a0
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.c = r3
            r0.set(r2)
        L6b:
            dn r0 = r5.a0
            java.util.ArrayList r0 = r0.a
            r0.add(r5)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
            r3 = this;
            super.onDetachedFromWindow()
            jz r0 = r3.H
            if (r0 == 0) goto La
            r0.e()
        La:
            r0 = 0
            r3.setScrollState(r0)
            a00 r1 = r3.W
            androidx.recyclerview.widget.RecyclerView r2 = r1.g
            r2.removeCallbacks(r1)
            android.widget.OverScroller r1 = r1.c
            r1.abortAnimation()
            nz r1 = r3.l
            if (r1 == 0) goto L25
            yq r1 = r1.e
            if (r1 == 0) goto L25
            r1.i()
        L25:
            r3.p = r0
            nz r1 = r3.l
            if (r1 == 0) goto L30
            r1.g = r0
            r1.P(r3)
        L30:
            java.util.ArrayList r0 = r3.p0
            r0.clear()
            y6 r0 = r3.q0
            r3.removeCallbacks(r0)
            d4 r0 = r3.f
            r0.getClass()
        L3f:
            sx r0 = defpackage.oa0.d
            java.lang.Object r0 = r0.a()
            if (r0 == 0) goto L48
            goto L3f
        L48:
            dn r0 = r3.a0
            if (r0 == 0) goto L54
            java.util.ArrayList r0 = r0.a
            r0.remove(r3)
            r0 = 0
            r3.a0 = r0
        L54:
            return
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas r4) {
            r3 = this;
            super.onDraw(r4)
            java.util.ArrayList r4 = r3.m
            int r0 = r4.size()
            r1 = 0
        La:
            if (r1 >= r0) goto L18
            java.lang.Object r2 = r4.get(r1)
            kz r2 = (defpackage.kz) r2
            r2.a(r3)
            int r1 = r1 + 1
            goto La
        L18:
            return
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(android.view.MotionEvent r6) {
            r5 = this;
            nz r0 = r5.l
            r1 = 0
            if (r0 != 0) goto L7
            goto L79
        L7:
            boolean r0 = r5.u
            if (r0 == 0) goto Ld
            goto L79
        Ld:
            int r0 = r6.getAction()
            r2 = 8
            if (r0 != r2) goto L79
            int r0 = r6.getSource()
            r0 = r0 & 2
            r2 = 0
            if (r0 == 0) goto L40
            nz r0 = r5.l
            boolean r0 = r0.e()
            if (r0 == 0) goto L2e
            r0 = 9
            float r0 = r6.getAxisValue(r0)
            float r0 = -r0
            goto L2f
        L2e:
            r0 = r2
        L2f:
            nz r3 = r5.l
            boolean r3 = r3.d()
            if (r3 == 0) goto L3e
            r3 = 10
            float r3 = r6.getAxisValue(r3)
            goto L66
        L3e:
            r3 = r2
            goto L66
        L40:
            int r0 = r6.getSource()
            r3 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r3
            if (r0 == 0) goto L64
            r0 = 26
            float r0 = r6.getAxisValue(r0)
            nz r3 = r5.l
            boolean r3 = r3.e()
            if (r3 == 0) goto L59
            float r0 = -r0
            goto L3e
        L59:
            nz r3 = r5.l
            boolean r3 = r3.d()
            if (r3 == 0) goto L64
            r3 = r0
            r0 = r2
            goto L66
        L64:
            r0 = r2
            r3 = r0
        L66:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L6e
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto L79
        L6e:
            float r2 = r5.T
            float r3 = r3 * r2
            int r2 = (int) r3
            float r3 = r5.U
            float r0 = r0 * r3
            int r0 = (int) r0
            r5.W(r2, r0, r6)
        L79:
            return r1
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r9) {
            r8 = this;
            boolean r0 = r8.u
            r1 = 0
            if (r0 == 0) goto L7
            goto L129
        L7:
            r0 = 0
            r8.o = r0
            boolean r0 = r8.B(r9)
            r2 = 1
            if (r0 == 0) goto L18
            r8.V()
            r8.setScrollState(r1)
            return r2
        L18:
            nz r0 = r8.l
            if (r0 != 0) goto L1e
            goto L129
        L1e:
            boolean r0 = r0.d()
            nz r3 = r8.l
            boolean r3 = r3.e()
            android.view.VelocityTracker r4 = r8.K
            if (r4 != 0) goto L32
            android.view.VelocityTracker r4 = android.view.VelocityTracker.obtain()
            r8.K = r4
        L32:
            android.view.VelocityTracker r4 = r8.K
            r4.addMovement(r9)
            int r4 = r9.getActionMasked()
            int r5 = r9.getActionIndex()
            r6 = 2
            r7 = 1056964608(0x3f000000, float:0.5)
            if (r4 == 0) goto Le2
            if (r4 == r2) goto Ld9
            if (r4 == r6) goto L7c
            r0 = 3
            if (r4 == r0) goto L74
            r0 = 5
            if (r4 == r0) goto L58
            r0 = 6
            if (r4 == r0) goto L53
            goto L124
        L53:
            r8.R(r9)
            goto L124
        L58:
            int r0 = r9.getPointerId(r5)
            r8.J = r0
            float r0 = r9.getX(r5)
            float r0 = r0 + r7
            int r0 = (int) r0
            r8.N = r0
            r8.L = r0
            float r9 = r9.getY(r5)
            float r9 = r9 + r7
            int r9 = (int) r9
            r8.O = r9
            r8.M = r9
            goto L124
        L74:
            r8.V()
            r8.setScrollState(r1)
            goto L124
        L7c:
            int r4 = r8.J
            int r4 = r9.findPointerIndex(r4)
            if (r4 >= 0) goto L9f
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "Error processing scroll; pointer index for id "
            r9.<init>(r0)
            int r0 = r8.J
            r9.append(r0)
            java.lang.String r0 = " not found. Did any MotionEvents get skipped?"
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            java.lang.String r0 = "RecyclerView"
            android.util.Log.e(r0, r9)
            return r1
        L9f:
            float r5 = r9.getX(r4)
            float r5 = r5 + r7
            int r5 = (int) r5
            float r9 = r9.getY(r4)
            float r9 = r9 + r7
            int r9 = (int) r9
            int r4 = r8.I
            if (r4 == r2) goto L124
            int r4 = r8.L
            int r4 = r5 - r4
            int r6 = r8.M
            int r6 = r9 - r6
            if (r0 == 0) goto Lc5
            int r0 = java.lang.Math.abs(r4)
            int r4 = r8.P
            if (r0 <= r4) goto Lc5
            r8.N = r5
            r0 = r2
            goto Lc6
        Lc5:
            r0 = r1
        Lc6:
            if (r3 == 0) goto Ld3
            int r3 = java.lang.Math.abs(r6)
            int r4 = r8.P
            if (r3 <= r4) goto Ld3
            r8.O = r9
            r0 = r2
        Ld3:
            if (r0 == 0) goto L124
            r8.setScrollState(r2)
            goto L124
        Ld9:
            android.view.VelocityTracker r9 = r8.K
            r9.clear()
            r8.c0(r1)
            goto L124
        Le2:
            boolean r4 = r8.v
            if (r4 == 0) goto Le8
            r8.v = r1
        Le8:
            int r4 = r9.getPointerId(r1)
            r8.J = r4
            float r4 = r9.getX()
            float r4 = r4 + r7
            int r4 = (int) r4
            r8.N = r4
            r8.L = r4
            float r9 = r9.getY()
            float r9 = r9 + r7
            int r9 = (int) r9
            r8.O = r9
            r8.M = r9
            int r9 = r8.I
            if (r9 != r6) goto L113
            android.view.ViewParent r9 = r8.getParent()
            r9.requestDisallowInterceptTouchEvent(r2)
            r8.setScrollState(r2)
            r8.c0(r2)
        L113:
            int[] r9 = r8.n0
            r9[r2] = r1
            r9[r1] = r1
            if (r3 == 0) goto L11d
            r0 = r0 | 2
        L11d:
            iw r9 = r8.getScrollingChildHelper()
            r9.g(r0, r1)
        L124:
            int r9 = r8.I
            if (r9 != r2) goto L129
            return r2
        L129:
            return r1
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            int r1 = defpackage.n70.a
            java.lang.String r1 = "RV OnLayout"
            defpackage.m70.a(r1)
            r0.o()
            defpackage.m70.b()
            r1 = 1
            r0.r = r1
            return
    }

    @Override // android.view.View
    public final void onMeasure(int r7, int r8) {
            r6 = this;
            nz r0 = r6.l
            if (r0 != 0) goto L8
            r6.n(r7, r8)
            return
        L8:
            boolean r0 = r0.J()
            yz r1 = r6.c0
            if (r0 == 0) goto L6a
            int r0 = android.view.View.MeasureSpec.getMode(r7)
            int r2 = android.view.View.MeasureSpec.getMode(r8)
            nz r3 = r6.l
            androidx.recyclerview.widget.RecyclerView r3 = r3.b
            r3.n(r7, r8)
            r3 = 1073741824(0x40000000, float:2.0)
            if (r0 != r3) goto L26
            if (r2 != r3) goto L26
            goto L69
        L26:
            fz r0 = r6.k
            if (r0 != 0) goto L2b
            goto L69
        L2b:
            int r0 = r1.d
            r2 = 1
            if (r0 != r2) goto L33
            r6.p()
        L33:
            nz r0 = r6.l
            r0.o0(r7, r8)
            r1.i = r2
            r6.q()
            nz r0 = r6.l
            r0.q0(r7, r8)
            nz r0 = r6.l
            boolean r0 = r0.t0()
            if (r0 == 0) goto L69
            nz r0 = r6.l
            int r4 = r6.getMeasuredWidth()
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r3)
            int r5 = r6.getMeasuredHeight()
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r3)
            r0.o0(r4, r3)
            r1.i = r2
            r6.q()
            nz r0 = r6.l
            r0.q0(r7, r8)
        L69:
            return
        L6a:
            boolean r0 = r6.q
            if (r0 == 0) goto L76
            nz r0 = r6.l
            androidx.recyclerview.widget.RecyclerView r0 = r0.b
            r0.n(r7, r8)
            return
        L76:
            boolean r0 = r1.k
            if (r0 == 0) goto L86
            int r7 = r6.getMeasuredWidth()
            int r8 = r6.getMeasuredHeight()
            r6.setMeasuredDimension(r7, r8)
            return
        L86:
            fz r0 = r6.k
            r2 = 0
            if (r0 == 0) goto L92
            int r0 = r0.a()
            r1.e = r0
            goto L94
        L92:
            r1.e = r2
        L94:
            r6.a0()
            nz r0 = r6.l
            androidx.recyclerview.widget.RecyclerView r0 = r0.b
            r0.n(r7, r8)
            r6.b0(r2)
            r1.g = r2
            return
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int r2, android.graphics.Rect r3) {
            r1 = this;
            boolean r0 = r1.L()
            if (r0 == 0) goto L8
            r2 = 0
            return r2
        L8:
            boolean r2 = super.onRequestFocusInDescendants(r2, r3)
            return r2
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(android.os.Parcelable r2) {
            r1 = this;
            boolean r0 = r2 instanceof defpackage.vz
            if (r0 != 0) goto L8
            super.onRestoreInstanceState(r2)
            return
        L8:
            vz r2 = (defpackage.vz) r2
            r1.c = r2
            android.os.Parcelable r2 = r2.a
            super.onRestoreInstanceState(r2)
            nz r2 = r1.l
            if (r2 == 0) goto L1e
            vz r0 = r1.c
            android.os.Parcelable r0 = r0.c
            if (r0 == 0) goto L1e
            r2.b0(r0)
        L1e:
            return
    }

    @Override // android.view.View
    public final android.os.Parcelable onSaveInstanceState() {
            r2 = this;
            vz r0 = new vz
            android.os.Parcelable r1 = super.onSaveInstanceState()
            r0.<init>(r1)
            vz r1 = r2.c
            if (r1 == 0) goto L12
            android.os.Parcelable r1 = r1.c
            r0.c = r1
            return r0
        L12:
            nz r1 = r2.l
            if (r1 == 0) goto L1d
            android.os.Parcelable r1 = r1.c0()
            r0.c = r1
            return r0
        L1d:
            r1 = 0
            r0.c = r1
            return r0
    }

    @Override // android.view.View
    public final void onSizeChanged(int r1, int r2, int r3, int r4) {
            r0 = this;
            super.onSizeChanged(r1, r2, r3, r4)
            if (r1 != r3) goto L9
            if (r2 == r4) goto L8
            goto L9
        L8:
            return
        L9:
            r1 = 0
            r0.G = r1
            r0.E = r1
            r0.F = r1
            r0.D = r1
            return
    }

    @Override // android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent r31) {
            r30 = this;
            r0 = r30
            r6 = r31
            boolean r1 = r0.u
            r7 = 0
            if (r1 != 0) goto Ld
            boolean r1 = r0.v
            if (r1 == 0) goto L10
        Ld:
            r3 = r7
            goto L4a6
        L10:
            wj r1 = r0.o
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 0
            r8 = 1
            if (r1 != 0) goto L28
            int r1 = r6.getAction()
            if (r1 != 0) goto L22
            r1 = r7
            goto L12d
        L22:
            boolean r1 = r30.B(r31)
            goto L12d
        L28:
            int r9 = r1.b
            int r10 = r1.v
            if (r10 != 0) goto L30
            goto L122
        L30:
            int r10 = r6.getAction()
            if (r10 != 0) goto L70
            float r9 = r6.getX()
            float r10 = r6.getY()
            boolean r9 = r1.d(r9, r10)
            float r10 = r6.getX()
            float r11 = r6.getY()
            boolean r10 = r1.c(r10, r11)
            if (r9 != 0) goto L52
            if (r10 == 0) goto L122
        L52:
            if (r10 == 0) goto L5f
            r1.w = r8
            float r9 = r6.getX()
            int r9 = (int) r9
            float r9 = (float) r9
            r1.p = r9
            goto L6b
        L5f:
            if (r9 == 0) goto L6b
            r1.w = r4
            float r9 = r6.getY()
            int r9 = (int) r9
            float r9 = (float) r9
            r1.m = r9
        L6b:
            r1.f(r4)
            goto L122
        L70:
            int r10 = r6.getAction()
            if (r10 != r8) goto L85
            int r10 = r1.v
            if (r10 != r4) goto L85
            r1.m = r5
            r1.p = r5
            r1.f(r8)
            r1.w = r7
            goto L122
        L85:
            int r10 = r6.getAction()
            if (r10 != r4) goto L122
            int r10 = r1.v
            if (r10 != r4) goto L122
            r1.g()
            int r10 = r1.w
            r11 = 1073741824(0x40000000, float:2.0)
            if (r10 != r8) goto Ldb
            float r10 = r6.getX()
            int[] r14 = r1.y
            r14[r7] = r9
            int r12 = r1.q
            int r12 = r12 - r9
            r14[r8] = r12
            float r13 = (float) r9
            float r12 = (float) r12
            float r10 = java.lang.Math.min(r12, r10)
            float r13 = java.lang.Math.max(r13, r10)
            int r10 = r1.o
            float r10 = (float) r10
            float r10 = r10 - r13
            float r10 = java.lang.Math.abs(r10)
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r10 >= 0) goto Lbc
            goto Ldb
        Lbc:
            float r12 = r1.p
            androidx.recyclerview.widget.RecyclerView r10 = r1.s
            int r15 = r10.computeHorizontalScrollRange()
            androidx.recyclerview.widget.RecyclerView r10 = r1.s
            int r16 = r10.computeHorizontalScrollOffset()
            int r10 = r1.q
            r17 = r10
            int r10 = defpackage.wj.e(r12, r13, r14, r15, r16, r17)
            if (r10 == 0) goto Ld9
            androidx.recyclerview.widget.RecyclerView r12 = r1.s
            r12.scrollBy(r10, r7)
        Ld9:
            r1.p = r13
        Ldb:
            int r10 = r1.w
            if (r10 != r4) goto L122
            float r10 = r6.getY()
            int[] r14 = r1.x
            r14[r7] = r9
            int r12 = r1.r
            int r12 = r12 - r9
            r14[r8] = r12
            float r9 = (float) r9
            float r12 = (float) r12
            float r10 = java.lang.Math.min(r12, r10)
            float r13 = java.lang.Math.max(r9, r10)
            int r9 = r1.l
            float r9 = (float) r9
            float r9 = r9 - r13
            float r9 = java.lang.Math.abs(r9)
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 >= 0) goto L103
            goto L122
        L103:
            float r12 = r1.m
            androidx.recyclerview.widget.RecyclerView r9 = r1.s
            int r15 = r9.computeVerticalScrollRange()
            androidx.recyclerview.widget.RecyclerView r9 = r1.s
            int r16 = r9.computeVerticalScrollOffset()
            int r9 = r1.r
            r17 = r9
            int r9 = defpackage.wj.e(r12, r13, r14, r15, r16, r17)
            if (r9 == 0) goto L120
            androidx.recyclerview.widget.RecyclerView r10 = r1.s
            r10.scrollBy(r7, r9)
        L120:
            r1.m = r13
        L122:
            int r1 = r6.getAction()
            if (r1 == r3) goto L12a
            if (r1 != r8) goto L12c
        L12a:
            r0.o = r2
        L12c:
            r1 = r8
        L12d:
            if (r1 == 0) goto L136
            r0.V()
            r0.setScrollState(r7)
            return r8
        L136:
            nz r1 = r0.l
            if (r1 != 0) goto L13c
            goto Ld
        L13c:
            boolean r9 = r1.d()
            nz r1 = r0.l
            boolean r10 = r1.e()
            android.view.VelocityTracker r1 = r0.K
            if (r1 != 0) goto L150
            android.view.VelocityTracker r1 = android.view.VelocityTracker.obtain()
            r0.K = r1
        L150:
            int r1 = r6.getActionMasked()
            int r11 = r6.getActionIndex()
            int[] r12 = r0.n0
            if (r1 != 0) goto L160
            r12[r8] = r7
            r12[r7] = r7
        L160:
            android.view.MotionEvent r13 = android.view.MotionEvent.obtain(r6)
            r14 = r12[r7]
            float r14 = (float) r14
            r15 = r12[r8]
            float r15 = (float) r15
            r13.offsetLocation(r14, r15)
            r14 = 1056964608(0x3f000000, float:0.5)
            if (r1 == 0) goto L474
            java.lang.String r15 = "RecyclerView"
            if (r1 == r8) goto L281
            if (r1 == r4) goto L1aa
            if (r1 == r3) goto L1a2
            r2 = 5
            if (r1 == r2) goto L186
            r2 = 6
            if (r1 == r2) goto L181
            goto L49b
        L181:
            r30.R(r31)
            goto L49b
        L186:
            int r1 = r6.getPointerId(r11)
            r0.J = r1
            float r1 = r6.getX(r11)
            float r1 = r1 + r14
            int r1 = (int) r1
            r0.N = r1
            r0.L = r1
            float r1 = r6.getY(r11)
            float r1 = r1 + r14
            int r1 = (int) r1
            r0.O = r1
            r0.M = r1
            goto L49b
        L1a2:
            r0.V()
            r0.setScrollState(r7)
            goto L49b
        L1aa:
            int r1 = r0.J
            int r1 = r6.findPointerIndex(r1)
            if (r1 >= 0) goto L1cb
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Error processing scroll; pointer index for id "
            r1.<init>(r2)
            int r2 = r0.J
            r1.append(r2)
            java.lang.String r2 = " not found. Did any MotionEvents get skipped?"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r15, r1)
            return r7
        L1cb:
            float r2 = r6.getX(r1)
            float r2 = r2 + r14
            int r11 = (int) r2
            float r1 = r6.getY(r1)
            float r1 = r1 + r14
            int r14 = (int) r1
            int r1 = r0.N
            int r1 = r1 - r11
            int r2 = r0.O
            int r2 = r2 - r14
            int r3 = r0.I
            if (r3 == r8) goto L214
            if (r9 == 0) goto L1f8
            if (r1 <= 0) goto L1ed
            int r3 = r0.P
            int r1 = r1 - r3
            int r1 = java.lang.Math.max(r7, r1)
            goto L1f4
        L1ed:
            int r3 = r0.P
            int r1 = r1 + r3
            int r1 = java.lang.Math.min(r7, r1)
        L1f4:
            if (r1 == 0) goto L1f8
            r3 = r8
            goto L1f9
        L1f8:
            r3 = r7
        L1f9:
            if (r10 == 0) goto L20f
            if (r2 <= 0) goto L205
            int r4 = r0.P
            int r2 = r2 - r4
            int r2 = java.lang.Math.max(r7, r2)
            goto L20c
        L205:
            int r4 = r0.P
            int r2 = r2 + r4
            int r2 = java.lang.Math.min(r7, r2)
        L20c:
            if (r2 == 0) goto L20f
            r3 = r8
        L20f:
            if (r3 == 0) goto L214
            r0.setScrollState(r8)
        L214:
            r15 = r1
            r16 = r2
            int r1 = r0.I
            if (r1 != r8) goto L49b
            int[] r3 = r0.o0
            r3[r7] = r7
            r3[r8] = r7
            if (r9 == 0) goto L225
            r1 = r15
            goto L226
        L225:
            r1 = r7
        L226:
            if (r10 == 0) goto L22b
            r2 = r16
            goto L22c
        L22b:
            r2 = r7
        L22c:
            int[] r4 = r0.m0
            r5 = 0
            boolean r1 = r0.r(r1, r2, r3, r4, r5)
            int[] r2 = r0.m0
            if (r1 == 0) goto L253
            r1 = r3[r7]
            int r15 = r15 - r1
            r1 = r3[r8]
            int r16 = r16 - r1
            r1 = r12[r7]
            r3 = r2[r7]
            int r1 = r1 + r3
            r12[r7] = r1
            r1 = r12[r8]
            r3 = r2[r8]
            int r1 = r1 + r3
            r12[r8] = r1
            android.view.ViewParent r1 = r0.getParent()
            r1.requestDisallowInterceptTouchEvent(r8)
        L253:
            r1 = r16
            r3 = r2[r7]
            int r11 = r11 - r3
            r0.N = r11
            r2 = r2[r8]
            int r14 = r14 - r2
            r0.O = r14
            if (r9 == 0) goto L263
            r2 = r15
            goto L264
        L263:
            r2 = r7
        L264:
            if (r10 == 0) goto L267
            r7 = r1
        L267:
            boolean r2 = r0.W(r2, r7, r6)
            if (r2 == 0) goto L274
            android.view.ViewParent r2 = r0.getParent()
            r2.requestDisallowInterceptTouchEvent(r8)
        L274:
            dn r2 = r0.a0
            if (r2 == 0) goto L49b
            if (r15 != 0) goto L27c
            if (r1 == 0) goto L49b
        L27c:
            r2.a(r0, r15, r1)
            goto L49b
        L281:
            android.view.VelocityTracker r1 = r0.K
            r1.addMovement(r13)
            android.view.VelocityTracker r1 = r0.K
            r3 = 1000(0x3e8, float:1.401E-42)
            int r6 = r0.S
            float r11 = (float) r6
            r1.computeCurrentVelocity(r3, r11)
            if (r9 == 0) goto L29c
            android.view.VelocityTracker r1 = r0.K
            int r3 = r0.J
            float r1 = r1.getXVelocity(r3)
            float r1 = -r1
            goto L29d
        L29c:
            r1 = r5
        L29d:
            if (r10 == 0) goto L2a9
            android.view.VelocityTracker r3 = r0.K
            int r9 = r0.J
            float r3 = r3.getYVelocity(r9)
            float r3 = -r3
            goto L2aa
        L2a9:
            r3 = r5
        L2aa:
            int r9 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r9 != 0) goto L2b6
            int r9 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r9 == 0) goto L2b3
            goto L2b6
        L2b3:
            r3 = r7
            goto L46d
        L2b6:
            int r1 = (int) r1
            int r3 = (int) r3
            nz r9 = r0.l
            if (r9 != 0) goto L2c3
            java.lang.String r1 = "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument."
            android.util.Log.e(r15, r1)
            goto L46c
        L2c3:
            boolean r10 = r0.u
            if (r10 == 0) goto L2c9
            goto L46c
        L2c9:
            boolean r9 = r9.d()
            nz r10 = r0.l
            boolean r10 = r10.e()
            int r11 = r0.R
            if (r9 == 0) goto L2dd
            int r12 = java.lang.Math.abs(r1)
            if (r12 >= r11) goto L2de
        L2dd:
            r1 = r7
        L2de:
            if (r10 == 0) goto L2e6
            int r12 = java.lang.Math.abs(r3)
            if (r12 >= r11) goto L2e7
        L2e6:
            r3 = r7
        L2e7:
            if (r1 != 0) goto L2ed
            if (r3 != 0) goto L2ed
            goto L46c
        L2ed:
            float r11 = (float) r1
            float r12 = (float) r3
            boolean r14 = r0.dispatchNestedPreFling(r11, r12)
            if (r14 != 0) goto L46c
            if (r9 != 0) goto L2fc
            if (r10 == 0) goto L2fa
            goto L2fc
        L2fa:
            r14 = r7
            goto L2fd
        L2fc:
            r14 = r8
        L2fd:
            r0.dispatchNestedFling(r11, r12, r14)
            pz r11 = r0.Q
            if (r11 == 0) goto L411
            hx r11 = (defpackage.hx) r11
            androidx.recyclerview.widget.RecyclerView r12 = r11.a
            nz r12 = r12.getLayoutManager()
            if (r12 != 0) goto L310
            goto L411
        L310:
            androidx.recyclerview.widget.RecyclerView r15 = r11.a
            fz r15 = r15.getAdapter()
            if (r15 != 0) goto L31a
            goto L411
        L31a:
            androidx.recyclerview.widget.RecyclerView r15 = r11.a
            int r15 = r15.getMinFlingVelocity()
            int r2 = java.lang.Math.abs(r3)
            if (r2 > r15) goto L32c
            int r2 = java.lang.Math.abs(r1)
            if (r2 <= r15) goto L411
        L32c:
            boolean r2 = r12 instanceof defpackage.xz
            if (r2 != 0) goto L332
            goto L411
        L332:
            if (r2 != 0) goto L338
            r17 = r5
            r15 = 0
            goto L345
        L338:
            gx r15 = new gx
            r17 = r5
            androidx.recyclerview.widget.RecyclerView r5 = r11.a
            android.content.Context r5 = r5.getContext()
            r15.<init>(r11, r5)
        L345:
            if (r15 != 0) goto L349
            goto L411
        L349:
            int r5 = r12.z()
            if (r5 != 0) goto L355
        L34f:
            r20 = r8
        L351:
            r2 = -1
        L352:
            r4 = -1
            goto L408
        L355:
            boolean r18 = r12.e()
            if (r18 == 0) goto L360
            ai r11 = r11.e(r12)
            goto L36c
        L360:
            boolean r18 = r12.d()
            if (r18 == 0) goto L36b
            ai r11 = r11.d(r12)
            goto L36c
        L36b:
            r11 = 0
        L36c:
            if (r11 != 0) goto L36f
            goto L34f
        L36f:
            int r4 = r12.v()
            r19 = -2147483648(0xffffffff80000000, float:-0.0)
            r20 = 2147483647(0x7fffffff, float:NaN)
            r21 = r2
            r7 = r19
            r2 = r20
            r16 = 0
            r19 = 0
            r20 = r8
            r8 = 0
        L385:
            if (r8 >= r4) goto L3ab
            r22 = r4
            android.view.View r4 = r12.u(r8)
            if (r4 != 0) goto L392
            r23 = r8
            goto L3a6
        L392:
            r23 = r8
            int r8 = defpackage.hx.b(r4, r11)
            if (r8 > 0) goto L39f
            if (r8 <= r7) goto L39f
            r19 = r4
            r7 = r8
        L39f:
            if (r8 < 0) goto L3a6
            if (r8 >= r2) goto L3a6
            r16 = r4
            r2 = r8
        L3a6:
            int r8 = r23 + 1
            r4 = r22
            goto L385
        L3ab:
            boolean r2 = r12.d()
            if (r2 == 0) goto L3b8
            if (r1 <= 0) goto L3b6
        L3b3:
            r2 = r20
            goto L3bb
        L3b6:
            r2 = 0
            goto L3bb
        L3b8:
            if (r3 <= 0) goto L3b6
            goto L3b3
        L3bb:
            if (r2 == 0) goto L3c4
            if (r16 == 0) goto L3c4
            int r2 = defpackage.nz.F(r16)
            goto L352
        L3c4:
            if (r2 != 0) goto L3cd
            if (r19 == 0) goto L3cd
            int r2 = defpackage.nz.F(r19)
            goto L352
        L3cd:
            if (r2 == 0) goto L3d1
            r16 = r19
        L3d1:
            if (r16 != 0) goto L3d5
            goto L351
        L3d5:
            int r4 = defpackage.nz.F(r16)
            int r7 = r12.z()
            if (r21 == 0) goto L3f7
            r8 = r12
            xz r8 = (defpackage.xz) r8
            int r7 = r7 + (-1)
            android.graphics.PointF r7 = r8.a(r7)
            if (r7 == 0) goto L3f7
            float r8 = r7.x
            int r8 = (r8 > r17 ? 1 : (r8 == r17 ? 0 : -1))
            if (r8 < 0) goto L3f9
            float r7 = r7.y
            int r7 = (r7 > r17 ? 1 : (r7 == r17 ? 0 : -1))
            if (r7 >= 0) goto L3f7
            goto L3f9
        L3f7:
            r7 = 0
            goto L3fb
        L3f9:
            r7 = r20
        L3fb:
            if (r7 != r2) goto L3ff
            r2 = -1
            goto L401
        L3ff:
            r2 = r20
        L401:
            int r2 = r2 + r4
            if (r2 < 0) goto L351
            if (r2 < r5) goto L352
            goto L351
        L408:
            if (r2 != r4) goto L40b
            goto L413
        L40b:
            r15.a = r2
            r12.w0(r15)
            goto L470
        L411:
            r20 = r8
        L413:
            if (r14 == 0) goto L46c
            if (r10 == 0) goto L419
            r9 = r9 | 2
        L419:
            iw r2 = r0.getScrollingChildHelper()
            r4 = r20
            r2.g(r9, r4)
            int r2 = -r6
            int r1 = java.lang.Math.min(r1, r6)
            int r24 = java.lang.Math.max(r2, r1)
            int r1 = java.lang.Math.min(r3, r6)
            int r25 = java.lang.Math.max(r2, r1)
            a00 r1 = r0.W
            androidx.recyclerview.widget.RecyclerView r2 = r1.g
            r3 = 2
            r2.setScrollState(r3)
            r3 = 0
            r1.b = r3
            r1.a = r3
            android.view.animation.Interpolator r3 = r1.d
            dz r4 = androidx.recyclerview.widget.RecyclerView.u0
            if (r3 == r4) goto L453
            r1.d = r4
            android.widget.OverScroller r3 = new android.widget.OverScroller
            android.content.Context r2 = r2.getContext()
            r3.<init>(r2, r4)
            r1.c = r3
        L453:
            android.widget.OverScroller r2 = r1.c
            r28 = -2147483648(0xffffffff80000000, float:-0.0)
            r29 = 2147483647(0x7fffffff, float:NaN)
            r22 = 0
            r23 = 0
            r26 = -2147483648(0xffffffff80000000, float:-0.0)
            r27 = 2147483647(0x7fffffff, float:NaN)
            r21 = r2
            r21.fling(r22, r23, r24, r25, r26, r27, r28, r29)
            r1.a()
            goto L470
        L46c:
            r3 = 0
        L46d:
            r0.setScrollState(r3)
        L470:
            r0.V()
            goto L4a0
        L474:
            r3 = r7
            int r1 = r6.getPointerId(r3)
            r0.J = r1
            float r1 = r6.getX()
            float r1 = r1 + r14
            int r1 = (int) r1
            r0.N = r1
            r0.L = r1
            float r1 = r6.getY()
            float r1 = r1 + r14
            int r1 = (int) r1
            r0.O = r1
            r0.M = r1
            if (r10 == 0) goto L493
            r9 = r9 | 2
        L493:
            iw r1 = r0.getScrollingChildHelper()
            r3 = 0
            r1.g(r9, r3)
        L49b:
            android.view.VelocityTracker r1 = r0.K
            r1.addMovement(r13)
        L4a0:
            r13.recycle()
            r20 = 1
            return r20
        L4a6:
            return r3
    }

    public final void p() {
            r23 = this;
            r0 = r23
            yz r1 = r0.c0
            r2 = 1
            r1.a(r2)
            r0.z(r1)
            r3 = 0
            r1.i = r3
            r0.a0()
            d4 r4 = r0.f
            java.lang.Object r5 = r4.b
            u30 r5 = (defpackage.u30) r5
            java.lang.Object r6 = r4.b
            u30 r6 = (defpackage.u30) r6
            r5.clear()
            java.lang.Object r4 = r4.c
            bs r4 = (defpackage.bs) r4
            r4.a()
            r0.P()
            boolean r5 = r0.y
            if (r5 == 0) goto L45
            y1 r5 = r0.d
            java.io.Serializable r7 = r5.c
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            r5.i(r7)
            java.io.Serializable r7 = r5.d
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            r5.i(r7)
            boolean r5 = r0.z
            if (r5 == 0) goto L45
            nz r5 = r0.l
            r5.V()
        L45:
            jz r5 = r0.H
            if (r5 == 0) goto L336
            nz r5 = r0.l
            boolean r5 = r5.x0()
            if (r5 == 0) goto L336
            y1 r5 = r0.d
            java.lang.Object r7 = r5.b
            sx r7 = (defpackage.sx) r7
            java.lang.Object r8 = r5.e
            ez r8 = (defpackage.ez) r8
            java.lang.Object r9 = r5.f
            l0 r9 = (defpackage.l0) r9
            java.io.Serializable r10 = r5.c
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            r9.getClass()
        L66:
            int r11 = r10.size()
            r12 = 1
            int r11 = r11 - r12
            r14 = 0
        L6d:
            r15 = 8
            r13 = -1
            if (r11 < 0) goto L86
            java.lang.Object r17 = r10.get(r11)
            r2 = r17
            x1 r2 = (defpackage.x1) r2
            int r2 = r2.a
            if (r2 != r15) goto L81
            if (r14 == 0) goto L82
            goto L87
        L81:
            r14 = r12
        L82:
            int r11 = r11 + (-1)
            r2 = 1
            goto L6d
        L86:
            r11 = r13
        L87:
            if (r11 == r13) goto L24a
            int r15 = r11 + 1
            java.lang.Object r13 = r9.b
            y1 r13 = (defpackage.y1) r13
            java.lang.Object r3 = r13.b
            sx r3 = (defpackage.sx) r3
            java.lang.Object r18 = r10.get(r11)
            r14 = r18
            x1 r14 = (defpackage.x1) r14
            java.lang.Object r18 = r10.get(r15)
            r2 = r18
            x1 r2 = (defpackage.x1) r2
            r18 = r9
            int r9 = r2.a
            if (r9 == r12) goto L214
            r17 = 0
            r12 = 2
            if (r9 == r12) goto L122
            r12 = 4
            if (r9 == r12) goto Lb7
            r21 = r4
            r22 = r6
            goto L240
        Lb7:
            int r9 = r14.c
            int r12 = r2.b
            if (r9 >= r12) goto Lc4
            int r12 = r12 + (-1)
            r2.b = r12
        Lc1:
            r21 = r4
            goto Ldd
        Lc4:
            r16 = r12
            int r12 = r2.c
            r19 = r12
            int r12 = r16 + r19
            if (r9 >= r12) goto Lc1
            int r12 = r19 + (-1)
            r2.c = r12
            int r9 = r14.b
            r21 = r4
            r4 = 1
            r12 = 4
            x1 r4 = r13.g(r12, r9, r4)
            goto Ldf
        Ldd:
            r4 = r17
        Ldf:
            int r9 = r14.b
            int r12 = r2.b
            if (r9 > r12) goto Lec
            int r12 = r12 + 1
            r2.b = r12
        Le9:
            r22 = r6
            goto L103
        Lec:
            r16 = r12
            int r12 = r2.c
            int r12 = r16 + r12
            if (r9 >= r12) goto Le9
            int r12 = r12 - r9
            int r9 = r9 + 1
            r22 = r6
            r6 = 4
            x1 r17 = r13.g(r6, r9, r12)
            int r6 = r2.c
            int r6 = r6 - r12
            r2.c = r6
        L103:
            r6 = r17
            r10.set(r15, r14)
            int r9 = r2.c
            if (r9 <= 0) goto L110
            r10.set(r11, r2)
            goto L116
        L110:
            r10.remove(r11)
            r3.c(r2)
        L116:
            if (r4 == 0) goto L11b
            r10.add(r11, r4)
        L11b:
            if (r6 == 0) goto L240
            r10.add(r11, r6)
            goto L240
        L122:
            r21 = r4
            r22 = r6
            int r4 = r14.b
            int r6 = r14.c
            if (r4 >= r6) goto L13e
            int r9 = r2.b
            if (r9 != r4) goto L13a
            int r9 = r2.c
            int r4 = r6 - r4
            if (r9 != r4) goto L13a
            r4 = 0
        L137:
            r16 = 1
            goto L14d
        L13a:
            r4 = 0
        L13b:
            r16 = 0
            goto L14d
        L13e:
            int r9 = r2.b
            int r12 = r6 + 1
            if (r9 != r12) goto L14b
            int r9 = r2.c
            int r4 = r4 - r6
            if (r9 != r4) goto L14b
            r4 = 1
            goto L137
        L14b:
            r4 = 1
            goto L13b
        L14d:
            int r9 = r2.b
            if (r6 >= r9) goto L156
            int r9 = r9 + (-1)
            r2.b = r9
            goto L171
        L156:
            int r12 = r2.c
            int r9 = r9 + r12
            if (r6 >= r9) goto L171
            int r12 = r12 + (-1)
            r2.c = r12
            r12 = 2
            r14.a = r12
            r4 = 1
            r14.c = r4
            int r4 = r2.c
            if (r4 != 0) goto L240
            r10.remove(r15)
            r3.c(r2)
            goto L240
        L171:
            int r6 = r14.b
            int r9 = r2.b
            if (r6 > r9) goto L17c
            int r9 = r9 + 1
            r2.b = r9
            goto L190
        L17c:
            int r12 = r2.c
            int r9 = r9 + r12
            if (r6 >= r9) goto L190
            int r9 = r9 - r6
            int r6 = r6 + 1
            r12 = 2
            x1 r17 = r13.g(r12, r6, r9)
            int r6 = r14.b
            int r9 = r2.b
            int r6 = r6 - r9
            r2.c = r6
        L190:
            r6 = r17
            if (r16 == 0) goto L19f
            r10.set(r11, r2)
            r10.remove(r15)
            r3.c(r14)
            goto L240
        L19f:
            if (r4 == 0) goto L1d0
            if (r6 == 0) goto L1b9
            int r3 = r14.b
            int r4 = r6.b
            if (r3 <= r4) goto L1ae
            int r4 = r6.c
            int r3 = r3 - r4
            r14.b = r3
        L1ae:
            int r3 = r14.c
            int r4 = r6.b
            if (r3 <= r4) goto L1b9
            int r4 = r6.c
            int r3 = r3 - r4
            r14.c = r3
        L1b9:
            int r3 = r14.b
            int r4 = r2.b
            if (r3 <= r4) goto L1c4
            int r4 = r2.c
            int r3 = r3 - r4
            r14.b = r3
        L1c4:
            int r3 = r14.c
            int r4 = r2.b
            if (r3 <= r4) goto L1fe
            int r4 = r2.c
            int r3 = r3 - r4
            r14.c = r3
            goto L1fe
        L1d0:
            if (r6 == 0) goto L1e8
            int r3 = r14.b
            int r4 = r6.b
            if (r3 < r4) goto L1dd
            int r4 = r6.c
            int r3 = r3 - r4
            r14.b = r3
        L1dd:
            int r3 = r14.c
            int r4 = r6.b
            if (r3 < r4) goto L1e8
            int r4 = r6.c
            int r3 = r3 - r4
            r14.c = r3
        L1e8:
            int r3 = r14.b
            int r4 = r2.b
            if (r3 < r4) goto L1f3
            int r4 = r2.c
            int r3 = r3 - r4
            r14.b = r3
        L1f3:
            int r3 = r14.c
            int r4 = r2.b
            if (r3 < r4) goto L1fe
            int r4 = r2.c
            int r3 = r3 - r4
            r14.c = r3
        L1fe:
            r10.set(r11, r2)
            int r2 = r14.b
            int r3 = r14.c
            if (r2 == r3) goto L20b
            r10.set(r15, r14)
            goto L20e
        L20b:
            r10.remove(r15)
        L20e:
            if (r6 == 0) goto L240
            r10.add(r11, r6)
            goto L240
        L214:
            r21 = r4
            r22 = r6
            int r3 = r14.c
            int r4 = r2.b
            if (r3 >= r4) goto L220
            r13 = -1
            goto L221
        L220:
            r13 = 0
        L221:
            int r6 = r14.b
            if (r6 >= r4) goto L227
            int r13 = r13 + 1
        L227:
            if (r4 > r6) goto L22e
            int r4 = r2.c
            int r6 = r6 + r4
            r14.b = r6
        L22e:
            int r4 = r2.b
            if (r4 > r3) goto L237
            int r6 = r2.c
            int r3 = r3 + r6
            r14.c = r3
        L237:
            int r4 = r4 + r13
            r2.b = r4
            r10.set(r11, r2)
            r10.set(r15, r14)
        L240:
            r9 = r18
            r4 = r21
            r6 = r22
            r2 = 1
            r3 = 0
            goto L66
        L24a:
            r21 = r4
            r22 = r6
            int r2 = r10.size()
            r3 = 0
        L253:
            if (r3 >= r2) goto L332
            java.lang.Object r4 = r10.get(r3)
            x1 r4 = (defpackage.x1) r4
            int r6 = r4.a
            r9 = 1
            if (r6 == r9) goto L328
            r12 = 2
            if (r6 == r12) goto L2c6
            r12 = 4
            if (r6 == r12) goto L271
            if (r6 == r15) goto L26d
        L268:
            r12 = 2
            r20 = 1
            goto L32e
        L26d:
            r5.h(r4)
            goto L268
        L271:
            int r6 = r4.b
            int r9 = r4.c
            int r9 = r9 + r6
            r11 = r6
            r12 = 0
            r13 = -1
        L279:
            if (r6 >= r9) goto L2ae
            b00 r14 = r8.b(r6)
            if (r14 != 0) goto L287
            boolean r14 = r5.a(r6)
            if (r14 == 0) goto L289
        L287:
            r14 = 4
            goto L29c
        L289:
            r14 = 1
            if (r13 != r14) goto L297
            r14 = 4
            x1 r11 = r5.g(r14, r11, r12)
            r5.h(r11)
            r11 = r6
            r12 = 0
            goto L298
        L297:
            r14 = 4
        L298:
            r13 = 0
        L299:
            r20 = 1
            goto L2a9
        L29c:
            if (r13 != 0) goto L2a7
            x1 r11 = r5.g(r14, r11, r12)
            r5.c(r11)
            r11 = r6
            r12 = 0
        L2a7:
            r13 = 1
            goto L299
        L2a9:
            int r12 = r12 + 1
            int r6 = r6 + 1
            goto L279
        L2ae:
            int r6 = r4.c
            if (r12 == r6) goto L2bb
            r7.c(r4)
            r6 = 4
            x1 r4 = r5.g(r6, r11, r12)
            goto L2bc
        L2bb:
            r6 = 4
        L2bc:
            if (r13 != 0) goto L2c2
            r5.c(r4)
            goto L268
        L2c2:
            r5.h(r4)
            goto L268
        L2c6:
            r6 = 4
            int r9 = r4.b
            int r11 = r4.c
            int r11 = r11 + r9
            r12 = r9
            r13 = 0
            r14 = -1
        L2cf:
            if (r12 >= r11) goto L30e
            b00 r18 = r8.b(r12)
            if (r18 != 0) goto L2dd
            boolean r18 = r5.a(r12)
            if (r18 == 0) goto L2df
        L2dd:
            r6 = 2
            goto L2f0
        L2df:
            r6 = 1
            if (r14 != r6) goto L2ec
            r6 = 2
            x1 r14 = r5.g(r6, r9, r13)
            r5.h(r14)
            r14 = 1
            goto L2ee
        L2ec:
            r6 = 2
            r14 = 0
        L2ee:
            r6 = 0
            goto L2fe
        L2f0:
            if (r14 != 0) goto L2fb
            x1 r14 = r5.g(r6, r9, r13)
            r5.c(r14)
            r6 = 1
            goto L2fc
        L2fb:
            r6 = 0
        L2fc:
            r14 = r6
            r6 = 1
        L2fe:
            if (r14 == 0) goto L306
            int r12 = r12 - r13
            int r11 = r11 - r13
            r13 = 1
        L303:
            r20 = 1
            goto L309
        L306:
            int r13 = r13 + 1
            goto L303
        L309:
            int r12 = r12 + 1
            r14 = r6
            r6 = 4
            goto L2cf
        L30e:
            r20 = 1
            int r6 = r4.c
            if (r13 == r6) goto L31d
            r7.c(r4)
            r12 = 2
            x1 r4 = r5.g(r12, r9, r13)
            goto L31e
        L31d:
            r12 = 2
        L31e:
            if (r14 != 0) goto L324
            r5.c(r4)
            goto L32e
        L324:
            r5.h(r4)
            goto L32e
        L328:
            r20 = r9
            r12 = 2
            r5.h(r4)
        L32e:
            int r3 = r3 + 1
            goto L253
        L332:
            r10.clear()
            goto L33f
        L336:
            r21 = r4
            r22 = r6
            y1 r2 = r0.d
            r2.b()
        L33f:
            boolean r2 = r0.f0
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L34c
            boolean r2 = r0.g0
            if (r2 == 0) goto L34a
            goto L34c
        L34a:
            r2 = r4
            goto L34d
        L34c:
            r2 = r3
        L34d:
            boolean r5 = r0.r
            if (r5 == 0) goto L36b
            jz r5 = r0.H
            if (r5 == 0) goto L36b
            boolean r5 = r0.y
            if (r5 != 0) goto L361
            if (r2 != 0) goto L361
            nz r6 = r0.l
            boolean r6 = r6.f
            if (r6 == 0) goto L36b
        L361:
            if (r5 == 0) goto L369
            fz r5 = r0.k
            boolean r5 = r5.b
            if (r5 == 0) goto L36b
        L369:
            r5 = r3
            goto L36c
        L36b:
            r5 = r4
        L36c:
            yz r6 = r0.c0
            r6.j = r5
            if (r5 == 0) goto L385
            if (r2 == 0) goto L385
            boolean r2 = r0.y
            if (r2 != 0) goto L385
            jz r2 = r0.H
            if (r2 == 0) goto L385
            nz r2 = r0.l
            boolean r2 = r2.x0()
            if (r2 == 0) goto L385
            goto L386
        L385:
            r3 = r4
        L386:
            r6.k = r3
            boolean r2 = r0.V
            r3 = 0
            if (r2 == 0) goto L39c
            boolean r2 = r0.hasFocus()
            if (r2 == 0) goto L39c
            fz r2 = r0.k
            if (r2 == 0) goto L39c
            android.view.View r2 = r0.getFocusedChild()
            goto L39d
        L39c:
            r2 = r3
        L39d:
            if (r2 != 0) goto L3a1
        L39f:
            r2 = r3
            goto L3ac
        L3a1:
            android.view.View r2 = r0.A(r2)
            if (r2 != 0) goto L3a8
            goto L39f
        L3a8:
            b00 r2 = r0.H(r2)
        L3ac:
            r4 = -1
            r6 = -1
            if (r2 != 0) goto L3b8
            r1.m = r4
            r1.l = r6
            r1.n = r6
            goto L405
        L3b8:
            fz r7 = r0.k
            boolean r7 = r7.b
            if (r7 == 0) goto L3c0
            long r4 = r2.e
        L3c0:
            r1.m = r4
            boolean r4 = r0.y
            if (r4 == 0) goto L3c8
        L3c6:
            r4 = r6
            goto L3da
        L3c8:
            boolean r4 = r2.h()
            if (r4 == 0) goto L3d1
            int r4 = r2.d
            goto L3da
        L3d1:
            androidx.recyclerview.widget.RecyclerView r4 = r2.r
            if (r4 != 0) goto L3d6
            goto L3c6
        L3d6:
            int r4 = r4.F(r2)
        L3da:
            r1.l = r4
            android.view.View r2 = r2.a
            int r4 = r2.getId()
        L3e2:
            boolean r5 = r2.isFocused()
            if (r5 != 0) goto L403
            boolean r5 = r2 instanceof android.view.ViewGroup
            if (r5 == 0) goto L403
            boolean r5 = r2.hasFocus()
            if (r5 == 0) goto L403
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            android.view.View r2 = r2.getFocusedChild()
            int r5 = r2.getId()
            if (r5 == r6) goto L3e2
            int r4 = r2.getId()
            goto L3e2
        L403:
            r1.n = r4
        L405:
            boolean r2 = r1.j
            if (r2 == 0) goto L40f
            boolean r2 = r0.g0
            if (r2 == 0) goto L40f
            r2 = 1
            goto L410
        L40f:
            r2 = 0
        L410:
            r1.h = r2
            r2 = 0
            r0.g0 = r2
            r0.f0 = r2
            boolean r2 = r1.k
            r1.g = r2
            fz r2 = r0.k
            int r2 = r2.a()
            r1.e = r2
            int[] r2 = r0.k0
            r0.C(r2)
            boolean r2 = r1.j
            if (r2 == 0) goto L4b1
            r5 r2 = r0.e
            int r2 = r2.k()
            r4 = 0
        L433:
            if (r4 >= r2) goto L4b1
            r5 r5 = r0.e
            android.view.View r5 = r5.j(r4)
            b00 r5 = I(r5)
            boolean r7 = r5.o()
            if (r7 != 0) goto L451
            boolean r7 = r5.f()
            if (r7 == 0) goto L456
            fz r7 = r0.k
            boolean r7 = r7.b
            if (r7 != 0) goto L456
        L451:
            r7 = r21
            r8 = r22
            goto L4aa
        L456:
            jz r7 = r0.H
            defpackage.jz.b(r5)
            r5.c()
            r7.getClass()
            lw r7 = new lw
            r7.<init>()
            r7.a(r5)
            r8 = r22
            java.lang.Object r9 = r8.getOrDefault(r5, r3)
            oa0 r9 = (defpackage.oa0) r9
            if (r9 != 0) goto L47a
            oa0 r9 = defpackage.oa0.a()
            r8.put(r5, r9)
        L47a:
            r9.b = r7
            int r7 = r9.a
            r7 = r7 | 4
            r9.a = r7
            boolean r7 = r1.h
            if (r7 == 0) goto L4a8
            boolean r7 = r5.k()
            if (r7 == 0) goto L4a8
            boolean r7 = r5.h()
            if (r7 != 0) goto L4a8
            boolean r7 = r5.o()
            if (r7 != 0) goto L4a8
            boolean r7 = r5.f()
            if (r7 != 0) goto L4a8
            long r9 = r0.G(r5)
            r7 = r21
            r7.d(r9, r5)
            goto L4aa
        L4a8:
            r7 = r21
        L4aa:
            int r4 = r4 + 1
            r21 = r7
            r22 = r8
            goto L433
        L4b1:
            r8 = r22
            boolean r2 = r1.k
            r4 = 2
            if (r2 == 0) goto L553
            r5 r2 = r0.e
            int r2 = r2.t()
            r5 = 0
        L4bf:
            if (r5 >= r2) goto L4dc
            r5 r7 = r0.e
            android.view.View r7 = r7.s(r5)
            b00 r7 = I(r7)
            boolean r9 = r7.o()
            if (r9 != 0) goto L4d9
            int r9 = r7.d
            if (r9 != r6) goto L4d9
            int r9 = r7.c
            r7.d = r9
        L4d9:
            int r5 = r5 + 1
            goto L4bf
        L4dc:
            boolean r2 = r1.f
            r5 = 0
            r1.f = r5
            nz r5 = r0.l
            tz r6 = r0.b
            r5.Z(r6, r1)
            r1.f = r2
            r2 = 0
        L4eb:
            r5 r5 = r0.e
            int r5 = r5.k()
            if (r2 >= r5) goto L54e
            r5 r5 = r0.e
            android.view.View r5 = r5.j(r2)
            b00 r5 = I(r5)
            boolean r6 = r5.o()
            if (r6 == 0) goto L504
            goto L54b
        L504:
            java.lang.Object r6 = r8.getOrDefault(r5, r3)
            oa0 r6 = (defpackage.oa0) r6
            if (r6 == 0) goto L513
            int r6 = r6.a
            r6 = r6 & 4
            if (r6 == 0) goto L513
            goto L54b
        L513:
            defpackage.jz.b(r5)
            int r6 = r5.j
            r6 = r6 & 8192(0x2000, float:1.148E-41)
            if (r6 == 0) goto L51e
            r6 = 1
            goto L51f
        L51e:
            r6 = 0
        L51f:
            jz r7 = r0.H
            r5.c()
            r7.getClass()
            lw r7 = new lw
            r7.<init>()
            r7.a(r5)
            if (r6 == 0) goto L535
            r0.T(r5, r7)
            goto L54b
        L535:
            java.lang.Object r6 = r8.getOrDefault(r5, r3)
            oa0 r6 = (defpackage.oa0) r6
            if (r6 != 0) goto L544
            oa0 r6 = defpackage.oa0.a()
            r8.put(r5, r6)
        L544:
            int r5 = r6.a
            r5 = r5 | r4
            r6.a = r5
            r6.b = r7
        L54b:
            int r2 = r2 + 1
            goto L4eb
        L54e:
            r0.k()
        L551:
            r2 = 1
            goto L557
        L553:
            r0.k()
            goto L551
        L557:
            r0.Q(r2)
            r2 = 0
            r0.b0(r2)
            r1.d = r4
            return
    }

    public final void q() {
            r4 = this;
            r4.a0()
            r4.P()
            r0 = 6
            yz r1 = r4.c0
            r1.a(r0)
            y1 r0 = r4.d
            r0.b()
            fz r0 = r4.k
            int r0 = r0.a()
            r1.e = r0
            r0 = 0
            r1.c = r0
            r1.g = r0
            nz r2 = r4.l
            tz r3 = r4.b
            r2.Z(r3, r1)
            r1.f = r0
            r2 = 0
            r4.c = r2
            boolean r2 = r1.j
            r3 = 1
            if (r2 == 0) goto L35
            jz r2 = r4.H
            if (r2 == 0) goto L35
            r2 = r3
            goto L36
        L35:
            r2 = r0
        L36:
            r1.j = r2
            r2 = 4
            r1.d = r2
            r4.Q(r3)
            r4.b0(r0)
            return
    }

    public final boolean r(int r7, int r8, int[] r9, int[] r10, int r11) {
            r6 = this;
            iw r0 = r6.getScrollingChildHelper()
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            boolean r7 = r0.c(r1, r2, r3, r4, r5)
            return r7
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(android.view.View r3, boolean r4) {
            r2 = this;
            b00 r0 = I(r3)
            if (r0 == 0) goto L35
            boolean r1 = r0.j()
            if (r1 == 0) goto L13
            int r1 = r0.j
            r1 = r1 & (-257(0xfffffffffffffeff, float:NaN))
            r0.j = r1
            goto L35
        L13:
            boolean r1 = r0.o()
            if (r1 == 0) goto L1a
            goto L35
        L1a:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r1 = "Called removeDetachedView with a view which is not flagged as tmp detached."
            r4.<init>(r1)
            r4.append(r0)
            java.lang.String r0 = r2.y()
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L35:
            r3.clearAnimation()
            I(r3)
            super.removeDetachedView(r3, r4)
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(android.view.View r2, android.view.View r3) {
            r1 = this;
            nz r0 = r1.l
            yq r0 = r0.e
            if (r0 == 0) goto Lb
            boolean r0 = r0.e
            if (r0 == 0) goto Lb
            goto L17
        Lb:
            boolean r0 = r1.L()
            if (r0 == 0) goto L12
            goto L17
        L12:
            if (r3 == 0) goto L17
            r1.U(r2, r3)
        L17:
            super.requestChildFocus(r2, r3)
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(android.view.View r7, android.graphics.Rect r8, boolean r9) {
            r6 = this;
            nz r0 = r6.l
            r5 = 0
            r1 = r6
            r2 = r7
            r3 = r8
            r4 = r9
            boolean r7 = r0.i0(r1, r2, r3, r4, r5)
            return r7
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean r5) {
            r4 = this;
            java.util.ArrayList r0 = r4.n
            int r1 = r0.size()
            r2 = 0
        L7:
            if (r2 >= r1) goto L15
            java.lang.Object r3 = r0.get(r2)
            wj r3 = (defpackage.wj) r3
            r3.getClass()
            int r2 = r2 + 1
            goto L7
        L15:
            super.requestDisallowInterceptTouchEvent(r5)
            return
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
            r1 = this;
            int r0 = r1.s
            if (r0 != 0) goto Lc
            boolean r0 = r1.u
            if (r0 != 0) goto Lc
            super.requestLayout()
            return
        Lc:
            r0 = 1
            r1.t = r0
            return
    }

    public final void s(int r9, int r10, int r11, int r12, int[] r13, int r14, int[] r15) {
            r8 = this;
            iw r0 = r8.getScrollingChildHelper()
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r7 = r15
            r0.d(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    @Override // android.view.View
    public final void scrollBy(int r4, int r5) {
            r3 = this;
            nz r0 = r3.l
            if (r0 != 0) goto Lc
            java.lang.String r4 = "RecyclerView"
            java.lang.String r5 = "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument."
            android.util.Log.e(r4, r5)
            return
        Lc:
            boolean r1 = r3.u
            if (r1 == 0) goto L11
            goto L20
        L11:
            boolean r0 = r0.d()
            nz r1 = r3.l
            boolean r1 = r1.e()
            if (r0 != 0) goto L21
            if (r1 == 0) goto L20
            goto L21
        L20:
            return
        L21:
            r2 = 0
            if (r0 == 0) goto L25
            goto L26
        L25:
            r4 = r2
        L26:
            if (r1 == 0) goto L29
            goto L2a
        L29:
            r5 = r2
        L2a:
            r0 = 0
            r3.W(r4, r5, r0)
            return
    }

    @Override // android.view.View
    public final void scrollTo(int r1, int r2) {
            r0 = this;
            java.lang.String r1 = "RecyclerView"
            java.lang.String r2 = "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead"
            android.util.Log.w(r1, r2)
            return
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(android.view.accessibility.AccessibilityEvent r2) {
            r1 = this;
            boolean r0 = r1.L()
            if (r0 == 0) goto L19
            r0 = 0
            if (r2 == 0) goto Le
            int r2 = defpackage.y.a(r2)
            goto Lf
        Le:
            r2 = r0
        Lf:
            if (r2 != 0) goto L12
            goto L13
        L12:
            r0 = r2
        L13:
            int r2 = r1.w
            r2 = r2 | r0
            r1.w = r2
            return
        L19:
            super.sendAccessibilityEventUnchecked(r2)
            return
    }

    public void setAccessibilityDelegateCompat(defpackage.d00 r1) {
            r0 = this;
            r0.j0 = r1
            defpackage.ja0.l(r0, r1)
            return
    }

    public void setAdapter(defpackage.fz r7) {
            r6 = this;
            r0 = 0
            r6.setLayoutFrozen(r0)
            fz r1 = r6.k
            iy r2 = r6.a
            if (r1 == 0) goto L14
            gz r1 = r1.a
            r1.unregisterObserver(r2)
            fz r1 = r6.k
            r1.getClass()
        L14:
            jz r1 = r6.H
            if (r1 == 0) goto L1b
            r1.e()
        L1b:
            nz r1 = r6.l
            tz r3 = r6.b
            if (r1 == 0) goto L29
            r1.e0(r3)
            nz r1 = r6.l
            r1.f0(r3)
        L29:
            java.util.ArrayList r1 = r3.a
            r1.clear()
            r3.d()
            y1 r1 = r6.d
            java.io.Serializable r4 = r1.c
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            r1.i(r4)
            java.io.Serializable r4 = r1.d
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            r1.i(r4)
            fz r1 = r6.k
            r6.k = r7
            if (r7 == 0) goto L4c
            gz r7 = r7.a
            r7.registerObserver(r2)
        L4c:
            fz r7 = r6.k
            java.util.ArrayList r2 = r3.a
            r2.clear()
            r3.d()
            sz r2 = r3.c()
            r3 = 1
            if (r1 == 0) goto L62
            int r1 = r2.b
            int r1 = r1 - r3
            r2.b = r1
        L62:
            int r1 = r2.b
            if (r1 != 0) goto L7d
            android.util.SparseArray r1 = r2.a
            r4 = r0
        L69:
            int r5 = r1.size()
            if (r4 >= r5) goto L7d
            java.lang.Object r5 = r1.valueAt(r4)
            rz r5 = (defpackage.rz) r5
            java.util.ArrayList r5 = r5.a
            r5.clear()
            int r4 = r4 + 1
            goto L69
        L7d:
            if (r7 == 0) goto L84
            int r7 = r2.b
            int r7 = r7 + r3
            r2.b = r7
        L84:
            yz r7 = r6.c0
            r7.f = r3
            boolean r7 = r6.z
            r7 = r7 | r0
            r6.z = r7
            r7 = 1
            r6.y = r7
            r5 r7 = r6.e
            int r7 = r7.t()
            r0 = 0
            r1 = r0
        L98:
            r2 = 6
            if (r1 >= r7) goto Lb3
            r5 r3 = r6.e
            android.view.View r3 = r3.s(r1)
            b00 r3 = I(r3)
            if (r3 == 0) goto Lb0
            boolean r4 = r3.o()
            if (r4 != 0) goto Lb0
            r3.a(r2)
        Lb0:
            int r1 = r1 + 1
            goto L98
        Lb3:
            r6.N()
            tz r7 = r6.b
            java.util.ArrayList r1 = r7.c
            int r3 = r1.size()
        Lbe:
            if (r0 >= r3) goto Ld3
            java.lang.Object r4 = r1.get(r0)
            b00 r4 = (defpackage.b00) r4
            if (r4 == 0) goto Ld0
            r4.a(r2)
            r5 = 1024(0x400, float:1.435E-42)
            r4.a(r5)
        Ld0:
            int r0 = r0 + 1
            goto Lbe
        Ld3:
            androidx.recyclerview.widget.RecyclerView r0 = r7.h
            fz r0 = r0.k
            if (r0 == 0) goto Ldd
            boolean r0 = r0.b
            if (r0 != 0) goto Le0
        Ldd:
            r7.d()
        Le0:
            r6.requestLayout()
            return
    }

    public void setChildDrawingOrderCallback(defpackage.hz r1) {
            r0 = this;
            if (r1 != 0) goto L3
            return
        L3:
            r1 = 0
            r0.setChildrenDrawingOrderEnabled(r1)
            return
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean r2) {
            r1 = this;
            boolean r0 = r1.g
            if (r2 == r0) goto Ld
            r0 = 0
            r1.G = r0
            r1.E = r0
            r1.F = r0
            r1.D = r0
        Ld:
            r1.g = r2
            super.setClipToPadding(r2)
            boolean r2 = r1.r
            if (r2 == 0) goto L19
            r1.requestLayout()
        L19:
            return
    }

    public void setEdgeEffectFactory(defpackage.iz r1) {
            r0 = this;
            r1.getClass()
            r0.C = r1
            r1 = 0
            r0.G = r1
            r0.E = r1
            r0.F = r1
            r0.D = r1
            return
    }

    public void setHasFixedSize(boolean r1) {
            r0 = this;
            r0.q = r1
            return
    }

    public void setItemAnimator(defpackage.jz r3) {
            r2 = this;
            jz r0 = r2.H
            if (r0 == 0) goto Lc
            r0.e()
            jz r0 = r2.H
            r1 = 0
            r0.a = r1
        Lc:
            r2.H = r3
            if (r3 == 0) goto L14
            ez r0 = r2.h0
            r3.a = r0
        L14:
            return
    }

    public void setItemViewCacheSize(int r2) {
            r1 = this;
            tz r0 = r1.b
            r0.e = r2
            r0.k()
            return
    }

    @java.lang.Deprecated
    public void setLayoutFrozen(boolean r1) {
            r0 = this;
            r0.suppressLayout(r1)
            return
    }

    public void setLayoutManager(defpackage.nz r11) {
            r10 = this;
            nz r0 = r10.l
            if (r11 != r0) goto L5
            return
        L5:
            r0 = 0
            r10.setScrollState(r0)
            a00 r1 = r10.W
            androidx.recyclerview.widget.RecyclerView r2 = r1.g
            r2.removeCallbacks(r1)
            android.widget.OverScroller r1 = r1.c
            r1.abortAnimation()
            nz r1 = r10.l
            if (r1 == 0) goto L20
            yq r1 = r1.e
            if (r1 == 0) goto L20
            r1.i()
        L20:
            nz r1 = r10.l
            tz r2 = r10.b
            if (r1 == 0) goto L53
            jz r1 = r10.H
            if (r1 == 0) goto L2d
            r1.e()
        L2d:
            nz r1 = r10.l
            r1.e0(r2)
            nz r1 = r10.l
            r1.f0(r2)
            java.util.ArrayList r1 = r2.a
            r1.clear()
            r2.d()
            boolean r1 = r10.p
            if (r1 == 0) goto L4a
            nz r1 = r10.l
            r1.g = r0
            r1.P(r10)
        L4a:
            nz r1 = r10.l
            r3 = 0
            r1.r0(r3)
            r10.l = r3
            goto L5b
        L53:
            java.util.ArrayList r1 = r2.a
            r1.clear()
            r2.d()
        L5b:
            r5 r1 = r10.e
            java.lang.Object r3 = r1.b
            ez r3 = (defpackage.ez) r3
            androidx.recyclerview.widget.RecyclerView r3 = r3.a
            java.lang.Object r4 = r1.c
            fa r4 = (defpackage.fa) r4
            r4.g()
            java.lang.Object r1 = r1.d
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            int r4 = r1.size()
            r5 = 1
            int r4 = r4 - r5
        L74:
            if (r4 < 0) goto La1
            java.lang.Object r6 = r1.get(r4)
            android.view.View r6 = (android.view.View) r6
            b00 r6 = I(r6)
            if (r6 == 0) goto L9b
            int r7 = r6.p
            boolean r8 = r3.L()
            if (r8 == 0) goto L92
            r6.q = r7
            java.util.ArrayList r7 = r3.p0
            r7.add(r6)
            goto L99
        L92:
            android.view.View r8 = r6.a
            java.util.WeakHashMap r9 = defpackage.ja0.a
            defpackage.s90.s(r8, r7)
        L99:
            r6.p = r0
        L9b:
            r1.remove(r4)
            int r4 = r4 + (-1)
            goto L74
        La1:
            int r1 = r3.getChildCount()
        La5:
            if (r0 >= r1) goto Lb4
            android.view.View r4 = r3.getChildAt(r0)
            I(r4)
            r4.clearAnimation()
            int r0 = r0 + 1
            goto La5
        Lb4:
            r3.removeAllViews()
            r10.l = r11
            if (r11 == 0) goto Lf0
            androidx.recyclerview.widget.RecyclerView r0 = r11.b
            if (r0 != 0) goto Lce
            r11.r0(r10)
            boolean r11 = r10.p
            if (r11 == 0) goto Lf0
            nz r11 = r10.l
            r11.g = r5
            r11.O(r10)
            goto Lf0
        Lce:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "LayoutManager "
            r1.<init>(r2)
            r1.append(r11)
            java.lang.String r2 = " is already attached to a RecyclerView:"
            r1.append(r2)
            androidx.recyclerview.widget.RecyclerView r11 = r11.b
            java.lang.String r11 = r11.y()
            r1.append(r11)
            java.lang.String r11 = r1.toString()
            r0.<init>(r11)
            throw r0
        Lf0:
            r2.k()
            r10.requestLayout()
            return
    }

    @Override // android.view.ViewGroup
    @java.lang.Deprecated
    public void setLayoutTransition(android.animation.LayoutTransition r2) {
            r1 = this;
            if (r2 != 0) goto L7
            r2 = 0
            super.setLayoutTransition(r2)
            return
        L7:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView"
            r2.<init>(r0)
            throw r2
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean r4) {
            r3 = this;
            iw r0 = r3.getScrollingChildHelper()
            boolean r1 = r0.d
            if (r1 == 0) goto Lf
            android.view.ViewGroup r1 = r0.c
            java.util.WeakHashMap r2 = defpackage.ja0.a
            defpackage.y90.z(r1)
        Lf:
            r0.d = r4
            return
    }

    public void setOnFlingListener(defpackage.pz r1) {
            r0 = this;
            r0.Q = r1
            return
    }

    @java.lang.Deprecated
    public void setOnScrollListener(defpackage.qz r1) {
            r0 = this;
            r0.d0 = r1
            return
    }

    public void setPreserveFocusAfterLayout(boolean r1) {
            r0 = this;
            r0.V = r1
            return
    }

    public void setRecycledViewPool(defpackage.sz r4) {
            r3 = this;
            tz r0 = r3.b
            sz r1 = r0.g
            if (r1 == 0) goto Lc
            int r2 = r1.b
            int r2 = r2 + (-1)
            r1.b = r2
        Lc:
            r0.g = r4
            if (r4 == 0) goto L20
            androidx.recyclerview.widget.RecyclerView r4 = r0.h
            fz r4 = r4.getAdapter()
            if (r4 == 0) goto L20
            sz r4 = r0.g
            int r0 = r4.b
            int r0 = r0 + 1
            r4.b = r0
        L20:
            return
    }

    public void setRecyclerListener(defpackage.uz r1) {
            r0 = this;
            return
    }

    public void setScrollState(int r3) {
            r2 = this;
            int r0 = r2.I
            if (r3 != r0) goto L5
            goto L49
        L5:
            r2.I = r3
            r0 = 2
            if (r3 == r0) goto L21
            a00 r0 = r2.W
            androidx.recyclerview.widget.RecyclerView r1 = r0.g
            r1.removeCallbacks(r0)
            android.widget.OverScroller r0 = r0.c
            r0.abortAnimation()
            nz r0 = r2.l
            if (r0 == 0) goto L21
            yq r0 = r0.e
            if (r0 == 0) goto L21
            r0.i()
        L21:
            nz r0 = r2.l
            if (r0 == 0) goto L28
            r0.d0(r3)
        L28:
            qz r0 = r2.d0
            if (r0 == 0) goto L2f
            r0.a(r2, r3)
        L2f:
            java.util.ArrayList r0 = r2.e0
            if (r0 == 0) goto L49
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L39:
            if (r0 < 0) goto L49
            java.util.ArrayList r1 = r2.e0
            java.lang.Object r1 = r1.get(r0)
            qz r1 = (defpackage.qz) r1
            r1.a(r2, r3)
            int r0 = r0 + (-1)
            goto L39
        L49:
            return
    }

    public void setScrollingTouchSlop(int r4) {
            r3 = this;
            android.content.Context r0 = r3.getContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            if (r4 == 0) goto L2d
            r1 = 1
            if (r4 == r1) goto L26
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "setScrollingTouchSlop(): bad argument constant "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r4 = "; using default value"
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            java.lang.String r1 = "RecyclerView"
            android.util.Log.w(r1, r4)
            goto L2d
        L26:
            int r4 = r0.getScaledPagingTouchSlop()
            r3.P = r4
            return
        L2d:
            int r4 = r0.getScaledTouchSlop()
            r3.P = r4
            return
    }

    public void setViewCacheExtension(defpackage.zz r1) {
            r0 = this;
            tz r1 = r0.b
            r1.getClass()
            return
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int r3) {
            r2 = this;
            iw r0 = r2.getScrollingChildHelper()
            r1 = 0
            boolean r3 = r0.g(r3, r1)
            return r3
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
            r2 = this;
            iw r0 = r2.getScrollingChildHelper()
            r1 = 0
            r0.h(r1)
            return
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean r10) {
            r9 = this;
            boolean r0 = r9.u
            if (r10 == r0) goto L4f
            java.lang.String r0 = "Do not suppressLayout in layout or scroll"
            r9.i(r0)
            r0 = 0
            if (r10 != 0) goto L20
            r9.u = r0
            boolean r10 = r9.t
            if (r10 == 0) goto L1d
            nz r10 = r9.l
            if (r10 == 0) goto L1d
            fz r10 = r9.k
            if (r10 == 0) goto L1d
            r9.requestLayout()
        L1d:
            r9.t = r0
            return
        L20:
            long r1 = android.os.SystemClock.uptimeMillis()
            r7 = 0
            r8 = 0
            r5 = 3
            r6 = 0
            r3 = r1
            android.view.MotionEvent r10 = android.view.MotionEvent.obtain(r1, r3, r5, r6, r7, r8)
            r9.onTouchEvent(r10)
            r10 = 1
            r9.u = r10
            r9.v = r10
            r9.setScrollState(r0)
            a00 r10 = r9.W
            androidx.recyclerview.widget.RecyclerView r0 = r10.g
            r0.removeCallbacks(r10)
            android.widget.OverScroller r10 = r10.c
            r10.abortAnimation()
            nz r10 = r9.l
            if (r10 == 0) goto L4f
            yq r10 = r10.e
            if (r10 == 0) goto L4f
            r10.i()
        L4f:
            return
    }

    public final void t(int r5, int r6) {
            r4 = this;
            int r0 = r4.B
            int r0 = r0 + 1
            r4.B = r0
            int r0 = r4.getScrollX()
            int r1 = r4.getScrollY()
            int r2 = r0 - r5
            int r3 = r1 - r6
            r4.onScrollChanged(r0, r1, r2, r3)
            qz r0 = r4.d0
            if (r0 == 0) goto L1c
            r0.b(r4, r5, r6)
        L1c:
            java.util.ArrayList r0 = r4.e0
            if (r0 == 0) goto L36
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L26:
            if (r0 < 0) goto L36
            java.util.ArrayList r1 = r4.e0
            java.lang.Object r1 = r1.get(r0)
            qz r1 = (defpackage.qz) r1
            r1.b(r4, r5, r6)
            int r0 = r0 + (-1)
            goto L26
        L36:
            int r5 = r4.B
            int r5 = r5 + (-1)
            r4.B = r5
            return
    }

    public final void u() {
            r4 = this;
            android.widget.EdgeEffect r0 = r4.G
            if (r0 == 0) goto L5
            return
        L5:
            iz r0 = r4.C
            r0.getClass()
            android.widget.EdgeEffect r0 = new android.widget.EdgeEffect
            android.content.Context r1 = r4.getContext()
            r0.<init>(r1)
            r4.G = r0
            boolean r1 = r4.g
            if (r1 == 0) goto L39
            int r1 = r4.getMeasuredWidth()
            int r2 = r4.getPaddingLeft()
            int r1 = r1 - r2
            int r2 = r4.getPaddingRight()
            int r1 = r1 - r2
            int r2 = r4.getMeasuredHeight()
            int r3 = r4.getPaddingTop()
            int r2 = r2 - r3
            int r3 = r4.getPaddingBottom()
            int r2 = r2 - r3
            r0.setSize(r1, r2)
            return
        L39:
            int r1 = r4.getMeasuredWidth()
            int r2 = r4.getMeasuredHeight()
            r0.setSize(r1, r2)
            return
    }

    public final void v() {
            r4 = this;
            android.widget.EdgeEffect r0 = r4.D
            if (r0 == 0) goto L5
            return
        L5:
            iz r0 = r4.C
            r0.getClass()
            android.widget.EdgeEffect r0 = new android.widget.EdgeEffect
            android.content.Context r1 = r4.getContext()
            r0.<init>(r1)
            r4.D = r0
            boolean r1 = r4.g
            if (r1 == 0) goto L39
            int r1 = r4.getMeasuredHeight()
            int r2 = r4.getPaddingTop()
            int r1 = r1 - r2
            int r2 = r4.getPaddingBottom()
            int r1 = r1 - r2
            int r2 = r4.getMeasuredWidth()
            int r3 = r4.getPaddingLeft()
            int r2 = r2 - r3
            int r3 = r4.getPaddingRight()
            int r2 = r2 - r3
            r0.setSize(r1, r2)
            return
        L39:
            int r1 = r4.getMeasuredHeight()
            int r2 = r4.getMeasuredWidth()
            r0.setSize(r1, r2)
            return
    }

    public final void w() {
            r4 = this;
            android.widget.EdgeEffect r0 = r4.F
            if (r0 == 0) goto L5
            return
        L5:
            iz r0 = r4.C
            r0.getClass()
            android.widget.EdgeEffect r0 = new android.widget.EdgeEffect
            android.content.Context r1 = r4.getContext()
            r0.<init>(r1)
            r4.F = r0
            boolean r1 = r4.g
            if (r1 == 0) goto L39
            int r1 = r4.getMeasuredHeight()
            int r2 = r4.getPaddingTop()
            int r1 = r1 - r2
            int r2 = r4.getPaddingBottom()
            int r1 = r1 - r2
            int r2 = r4.getMeasuredWidth()
            int r3 = r4.getPaddingLeft()
            int r2 = r2 - r3
            int r3 = r4.getPaddingRight()
            int r2 = r2 - r3
            r0.setSize(r1, r2)
            return
        L39:
            int r1 = r4.getMeasuredHeight()
            int r2 = r4.getMeasuredWidth()
            r0.setSize(r1, r2)
            return
    }

    public final void x() {
            r4 = this;
            android.widget.EdgeEffect r0 = r4.E
            if (r0 == 0) goto L5
            return
        L5:
            iz r0 = r4.C
            r0.getClass()
            android.widget.EdgeEffect r0 = new android.widget.EdgeEffect
            android.content.Context r1 = r4.getContext()
            r0.<init>(r1)
            r4.E = r0
            boolean r1 = r4.g
            if (r1 == 0) goto L39
            int r1 = r4.getMeasuredWidth()
            int r2 = r4.getPaddingLeft()
            int r1 = r1 - r2
            int r2 = r4.getPaddingRight()
            int r1 = r1 - r2
            int r2 = r4.getMeasuredHeight()
            int r3 = r4.getPaddingTop()
            int r2 = r2 - r3
            int r3 = r4.getPaddingBottom()
            int r2 = r2 - r3
            r0.setSize(r1, r2)
            return
        L39:
            int r1 = r4.getMeasuredWidth()
            int r2 = r4.getMeasuredHeight()
            r0.setSize(r1, r2)
            return
    }

    public final java.lang.String y() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = " "
            r0.<init>(r1)
            java.lang.String r1 = super.toString()
            r0.append(r1)
            java.lang.String r1 = ", adapter:"
            r0.append(r1)
            fz r1 = r2.k
            r0.append(r1)
            java.lang.String r1 = ", layout:"
            r0.append(r1)
            nz r1 = r2.l
            r0.append(r1)
            java.lang.String r1 = ", context:"
            r0.append(r1)
            android.content.Context r1 = r2.getContext()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public final void z(defpackage.yz r3) {
            r2 = this;
            int r0 = r2.getScrollState()
            r1 = 2
            if (r0 != r1) goto L1b
            a00 r0 = r2.W
            android.widget.OverScroller r0 = r0.c
            r0.getFinalX()
            r0.getCurrX()
            r3.getClass()
            r0.getFinalY()
            r0.getCurrY()
            return
        L1b:
            r3.getClass()
            return
    }
}
