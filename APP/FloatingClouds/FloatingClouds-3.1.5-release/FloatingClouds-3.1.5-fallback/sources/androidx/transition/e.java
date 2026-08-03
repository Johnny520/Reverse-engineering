package androidx.transition;

/* JADX INFO: loaded from: classes.dex */
public abstract class e implements java.lang.Cloneable {
    public static final androidx.transition.e.a A = null;
    public static final java.lang.ThreadLocal<a.J1<android.animation.Animator, androidx.transition.e.b>> B = null;
    public static final android.animation.Animator[] y = null;
    public static final int[] z = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f1024a;
    public long b;
    public long c;
    public android.animation.TimeInterpolator d;
    public final java.util.ArrayList<java.lang.Integer> e;
    public final java.util.ArrayList<android.view.View> f;
    public a.A2 g;
    public a.A2 h;
    public androidx.transition.h i;
    public final int[] j;
    public java.util.ArrayList<a.Ff> k;
    public java.util.ArrayList<a.Ff> l;
    public androidx.transition.e.f[] m;
    public final java.util.ArrayList<android.animation.Animator> n;
    public android.animation.Animator[] o;
    public int p;
    public boolean q;
    public boolean r;
    public androidx.transition.e s;
    public java.util.ArrayList<androidx.transition.e.f> t;
    public java.util.ArrayList<android.animation.Animator> u;
    public androidx.transition.e.a v;
    public long w;
    public long x;

    public class a extends a.AbstractC0040a2 {
        public final android.graphics.Path g(float r2, float r3, float r4, float r5) {
                r1 = this;
                android.graphics.Path r0 = new android.graphics.Path
                r0.<init>()
                r0.moveTo(r2, r3)
                r0.lineTo(r4, r5)
                return r0
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public android.view.View f1025a;
        public java.lang.String b;
        public a.Ff c;
        public android.view.WindowId d;
        public androidx.transition.e e;
        public android.animation.Animator f;
    }

    public static abstract class c {
    }

    public static class d {
        public static long a(android.animation.Animator r2) {
                long r0 = r2.getTotalDuration()
                return r0
        }

        public static void b(android.animation.Animator r0, long r1) {
                android.animation.AnimatorSet r0 = (android.animation.AnimatorSet) r0
                r0.setCurrentPlayTime(r1)
                return
        }
    }

    /* JADX INFO: renamed from: androidx.transition.e$e, reason: collision with other inner class name */
    public class C0026e extends androidx.transition.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f1026a;
    }

    public interface f {
        default void a(androidx.transition.e r1) {
                r0 = this;
                r0.d(r1)
                return
        }

        default void b(androidx.transition.e r1) {
                r0 = this;
                r0.f(r1)
                return
        }

        void c();

        void d(androidx.transition.e r1);

        void e(androidx.transition.e r1);

        void f(androidx.transition.e r1);

        void g();
    }

    public interface g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a.C0487z f1027a = null;
        public static final a.C0487z b = null;
        public static final a.C0487z c = null;
        public static final a.C0487z d = null;
        public static final a.C0487z e = null;

        static {
                a.z r0 = new a.z
                r1 = 15
                r0.<init>(r1)
                androidx.transition.e.g.f1027a = r0
                a.z r0 = new a.z
                r1 = 16
                r0.<init>(r1)
                androidx.transition.e.g.b = r0
                a.z r0 = new a.z
                r1 = 17
                r0.<init>(r1)
                androidx.transition.e.g.c = r0
                a.z r0 = new a.z
                r1 = 18
                r0.<init>(r1)
                androidx.transition.e.g.d = r0
                a.z r0 = new a.z
                r1 = 19
                r0.<init>(r1)
                androidx.transition.e.g.e = r0
                return
        }

        void a(androidx.transition.e.f r1, androidx.transition.e r2, boolean r3);
    }

    static {
            r0 = 0
            android.animation.Animator[] r0 = new android.animation.Animator[r0]
            androidx.transition.e.y = r0
            r0 = 2
            r1 = 1
            r2 = 3
            r3 = 4
            int[] r0 = new int[]{r0, r1, r2, r3}
            androidx.transition.e.z = r0
            androidx.transition.e$a r0 = new androidx.transition.e$a
            r0.<init>()
            androidx.transition.e.A = r0
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            androidx.transition.e.B = r0
            return
    }

    public e() {
            r3 = this;
            r3.<init>()
            java.lang.Class r0 = r3.getClass()
            java.lang.String r0 = r0.getName()
            r3.f1024a = r0
            r0 = -1
            r3.b = r0
            r3.c = r0
            r0 = 0
            r3.d = r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r3.e = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r3.f = r1
            a.A2 r1 = new a.A2
            r2 = 3
            r1.<init>(r2)
            r3.g = r1
            a.A2 r1 = new a.A2
            r1.<init>(r2)
            r3.h = r1
            r3.i = r0
            int[] r1 = androidx.transition.e.z
            r3.j = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r3.n = r1
            android.animation.Animator[] r1 = androidx.transition.e.y
            r3.o = r1
            r1 = 0
            r3.p = r1
            r3.q = r1
            r3.r = r1
            r3.s = r0
            r3.t = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.u = r0
            androidx.transition.e$a r0 = androidx.transition.e.A
            r3.v = r0
            return
    }

    public static void b(a.A2 r4, android.view.View r5, a.Ff r6) {
            java.lang.Object r0 = r4.f7a
            a.J1 r0 = (a.J1) r0
            r0.put(r5, r6)
            int r6 = r5.getId()
            r0 = 0
            if (r6 < 0) goto L1f
            java.lang.Object r1 = r4.b
            android.util.SparseArray r1 = (android.util.SparseArray) r1
            int r2 = r1.indexOfKey(r6)
            if (r2 < 0) goto L1c
            r1.put(r6, r0)
            goto L1f
        L1c:
            r1.put(r6, r5)
        L1f:
            java.util.WeakHashMap<android.view.View, a.Jg> r6 = a.C0414ug.f721a
            java.lang.String r6 = a.C0414ug.d.k(r5)
            if (r6 == 0) goto L38
            java.lang.Object r1 = r4.d
            a.J1 r1 = (a.J1) r1
            boolean r2 = r1.containsKey(r6)
            if (r2 == 0) goto L35
            r1.put(r6, r0)
            goto L38
        L35:
            r1.put(r6, r5)
        L38:
            android.view.ViewParent r6 = r5.getParent()
            boolean r6 = r6 instanceof android.widget.ListView
            if (r6 == 0) goto L84
            android.view.ViewParent r6 = r5.getParent()
            android.widget.ListView r6 = (android.widget.ListView) r6
            android.widget.ListAdapter r1 = r6.getAdapter()
            boolean r1 = r1.hasStableIds()
            if (r1 == 0) goto L84
            int r1 = r6.getPositionForView(r5)
            long r1 = r6.getItemIdAtPosition(r1)
            java.lang.Object r4 = r4.c
            a.U9 r4 = (a.U9) r4
            boolean r6 = r4.f290a
            if (r6 == 0) goto L63
            r4.b()
        L63:
            long[] r6 = r4.b
            int r3 = r4.d
            int r6 = a.C0435w1.b(r6, r3, r1)
            if (r6 < 0) goto L7d
            java.lang.Object r5 = r4.c(r1, r0)
            android.view.View r5 = (android.view.View) r5
            if (r5 == 0) goto L84
            r6 = 0
            r5.setHasTransientState(r6)
            r4.d(r1, r0)
            return
        L7d:
            r6 = 1
            r5.setHasTransientState(r6)
            r4.d(r1, r5)
        L84:
            return
    }

    public static a.J1<android.animation.Animator, androidx.transition.e.b> p() {
            java.lang.ThreadLocal<a.J1<android.animation.Animator, androidx.transition.e$b>> r0 = androidx.transition.e.B
            java.lang.Object r1 = r0.get()
            a.J1 r1 = (a.J1) r1
            if (r1 != 0) goto L12
            a.J1 r1 = new a.J1
            r1.<init>()
            r0.set(r1)
        L12:
            return r1
    }

    public void A() {
            r8 = this;
            r8.I()
            a.J1 r0 = p()
            java.util.ArrayList<android.animation.Animator> r1 = r8.u
            java.util.Iterator r1 = r1.iterator()
        Ld:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L58
            java.lang.Object r2 = r1.next()
            android.animation.Animator r2 = (android.animation.Animator) r2
            boolean r3 = r0.containsKey(r2)
            if (r3 == 0) goto Ld
            r8.I()
            if (r2 == 0) goto Ld
            a.Cf r3 = new a.Cf
            r3.<init>(r8, r0)
            r2.addListener(r3)
            long r3 = r8.c
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 < 0) goto L37
            r2.setDuration(r3)
        L37:
            long r3 = r8.b
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 < 0) goto L45
            long r5 = r2.getStartDelay()
            long r5 = r5 + r3
            r2.setStartDelay(r5)
        L45:
            android.animation.TimeInterpolator r3 = r8.d
            if (r3 == 0) goto L4c
            r2.setInterpolator(r3)
        L4c:
            a.Df r3 = new a.Df
            r3.<init>(r8)
            r2.addListener(r3)
            r2.start()
            goto Ld
        L58:
            java.util.ArrayList<android.animation.Animator> r0 = r8.u
            r0.clear()
            r8.m()
            return
    }

    public void B(long r18, long r20) {
            r17 = this;
            r0 = r17
            r1 = r18
            long r3 = r0.w
            int r5 = (r1 > r20 ? 1 : (r1 == r20 ? 0 : -1))
            r7 = 0
            if (r5 >= 0) goto Ld
            r5 = 1
            goto Le
        Ld:
            r5 = r7
        Le:
            r8 = 0
            int r10 = (r20 > r8 ? 1 : (r20 == r8 ? 0 : -1))
            if (r10 >= 0) goto L18
            int r11 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r11 >= 0) goto L20
        L18:
            int r11 = (r20 > r3 ? 1 : (r20 == r3 ? 0 : -1))
            if (r11 <= 0) goto L27
            int r11 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r11 > 0) goto L27
        L20:
            r0.r = r7
            a.z r11 = androidx.transition.e.g.f1027a
            r0.v(r0, r11, r5)
        L27:
            java.util.ArrayList<android.animation.Animator> r11 = r0.n
            int r12 = r11.size()
            android.animation.Animator[] r13 = r0.o
            java.lang.Object[] r11 = r11.toArray(r13)
            android.animation.Animator[] r11 = (android.animation.Animator[]) r11
            android.animation.Animator[] r13 = androidx.transition.e.y
            r0.o = r13
        L39:
            if (r7 >= r12) goto L54
            r13 = r11[r7]
            r14 = 0
            r11[r7] = r14
            long r14 = androidx.transition.e.d.a(r13)
            r16 = r7
            long r6 = java.lang.Math.max(r8, r1)
            long r6 = java.lang.Math.min(r6, r14)
            androidx.transition.e.d.b(r13, r6)
            int r7 = r16 + 1
            goto L39
        L54:
            r0.o = r11
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 <= 0) goto L5e
            int r3 = (r20 > r3 ? 1 : (r20 == r3 ? 0 : -1))
            if (r3 <= 0) goto L64
        L5e:
            int r1 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r1 >= 0) goto L6e
            if (r10 < 0) goto L6e
        L64:
            if (r6 <= 0) goto L69
            r1 = 1
            r0.r = r1
        L69:
            a.z r1 = androidx.transition.e.g.b
            r0.v(r0, r1, r5)
        L6e:
            return
    }

    public void C(long r1) {
            r0 = this;
            r0.c = r1
            return
    }

    public void D(androidx.transition.e.c r1) {
            r0 = this;
            return
    }

    public void E(android.animation.TimeInterpolator r1) {
            r0 = this;
            r0.d = r1
            return
    }

    public void F(androidx.transition.e.a r1) {
            r0 = this;
            if (r1 != 0) goto L7
            androidx.transition.e$a r1 = androidx.transition.e.A
            r0.v = r1
            return
        L7:
            r0.v = r1
            return
    }

    public void G() {
            r0 = this;
            return
    }

    public void H(long r1) {
            r0 = this;
            r0.b = r1
            return
    }

    public final void I() {
            r2 = this;
            int r0 = r2.p
            if (r0 != 0) goto Lc
            a.z r0 = androidx.transition.e.g.f1027a
            r1 = 0
            r2.v(r2, r0, r1)
            r2.r = r1
        Lc:
            int r0 = r2.p
            int r0 = r0 + 1
            r2.p = r0
            return
    }

    public java.lang.String J(java.lang.String r8) {
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r8)
            java.lang.Class r8 = r7.getClass()
            java.lang.String r8 = r8.getSimpleName()
            r0.append(r8)
            java.lang.String r8 = "@"
            r0.append(r8)
            int r8 = r7.hashCode()
            java.lang.String r8 = java.lang.Integer.toHexString(r8)
            r0.append(r8)
            java.lang.String r8 = ": "
            r0.append(r8)
            long r1 = r7.c
            r3 = -1
            int r8 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            java.lang.String r1 = ") "
            if (r8 == 0) goto L3c
            java.lang.String r8 = "dur("
            r0.append(r8)
            long r5 = r7.c
            r0.append(r5)
            r0.append(r1)
        L3c:
            long r5 = r7.b
            int r8 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r8 == 0) goto L4f
            java.lang.String r8 = "dly("
            r0.append(r8)
            long r2 = r7.b
            r0.append(r2)
            r0.append(r1)
        L4f:
            android.animation.TimeInterpolator r8 = r7.d
            if (r8 == 0) goto L60
            java.lang.String r8 = "interp("
            r0.append(r8)
            android.animation.TimeInterpolator r8 = r7.d
            r0.append(r8)
            r0.append(r1)
        L60:
            java.util.ArrayList<java.lang.Integer> r8 = r7.e
            int r1 = r8.size()
            java.util.ArrayList<android.view.View> r2 = r7.f
            if (r1 > 0) goto L70
            int r1 = r2.size()
            if (r1 <= 0) goto Lb4
        L70:
            java.lang.String r1 = "tgts("
            r0.append(r1)
            int r1 = r8.size()
            java.lang.String r3 = ", "
            r4 = 0
            if (r1 <= 0) goto L94
            r1 = r4
        L7f:
            int r5 = r8.size()
            if (r1 >= r5) goto L94
            if (r1 <= 0) goto L8a
            r0.append(r3)
        L8a:
            java.lang.Object r5 = r8.get(r1)
            r0.append(r5)
            int r1 = r1 + 1
            goto L7f
        L94:
            int r8 = r2.size()
            if (r8 <= 0) goto Laf
        L9a:
            int r8 = r2.size()
            if (r4 >= r8) goto Laf
            if (r4 <= 0) goto La5
            r0.append(r3)
        La5:
            java.lang.Object r8 = r2.get(r4)
            r0.append(r8)
            int r4 = r4 + 1
            goto L9a
        Laf:
            java.lang.String r8 = ")"
            r0.append(r8)
        Lb4:
            java.lang.String r8 = r0.toString()
            return r8
    }

    public void a(androidx.transition.e.f r2) {
            r1 = this;
            java.util.ArrayList<androidx.transition.e$f> r0 = r1.t
            if (r0 != 0) goto Lb
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.t = r0
        Lb:
            java.util.ArrayList<androidx.transition.e$f> r0 = r1.t
            r0.add(r2)
            return
    }

    public void c() {
            r4 = this;
            java.util.ArrayList<android.animation.Animator> r0 = r4.n
            int r1 = r0.size()
            android.animation.Animator[] r2 = r4.o
            java.lang.Object[] r0 = r0.toArray(r2)
            android.animation.Animator[] r0 = (android.animation.Animator[]) r0
            android.animation.Animator[] r2 = androidx.transition.e.y
            r4.o = r2
            int r1 = r1 + (-1)
        L14:
            if (r1 < 0) goto L21
            r2 = r0[r1]
            r3 = 0
            r0[r1] = r3
            r2.cancel()
            int r1 = r1 + (-1)
            goto L14
        L21:
            r4.o = r0
            a.z r0 = androidx.transition.e.g.c
            r1 = 0
            r4.v(r4, r0, r1)
            return
    }

    public /* bridge */ /* synthetic */ java.lang.Object clone() {
            r1 = this;
            androidx.transition.e r0 = r1.j()
            return r0
    }

    public abstract void d(a.Ff r1);

    public final void e(android.view.View r3, boolean r4) {
            r2 = this;
            if (r3 != 0) goto L3
            goto L48
        L3:
            r3.getId()
            android.view.ViewParent r0 = r3.getParent()
            boolean r0 = r0 instanceof android.view.ViewGroup
            if (r0 == 0) goto L31
            a.Ff r0 = new a.Ff
            r0.<init>(r3)
            if (r4 == 0) goto L19
            r2.g(r0)
            goto L1c
        L19:
            r2.d(r0)
        L1c:
            java.util.ArrayList<androidx.transition.e> r1 = r0.c
            r1.add(r2)
            r2.f(r0)
            if (r4 == 0) goto L2c
            a.A2 r1 = r2.g
            b(r1, r3, r0)
            goto L31
        L2c:
            a.A2 r1 = r2.h
            b(r1, r3, r0)
        L31:
            boolean r0 = r3 instanceof android.view.ViewGroup
            if (r0 == 0) goto L48
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            r0 = 0
        L38:
            int r1 = r3.getChildCount()
            if (r0 >= r1) goto L48
            android.view.View r1 = r3.getChildAt(r0)
            r2.e(r1, r4)
            int r0 = r0 + 1
            goto L38
        L48:
            return
    }

    public void f(a.Ff r1) {
            r0 = this;
            return
    }

    public abstract void g(a.Ff r1);

    public final void h(android.widget.FrameLayout r8, boolean r9) {
            r7 = this;
            r7.i(r9)
            java.util.ArrayList<java.lang.Integer> r0 = r7.e
            int r1 = r0.size()
            java.util.ArrayList<android.view.View> r2 = r7.f
            if (r1 > 0) goto L18
            int r1 = r2.size()
            if (r1 <= 0) goto L14
            goto L18
        L14:
            r7.e(r8, r9)
            return
        L18:
            r1 = 0
            r3 = r1
        L1a:
            int r4 = r0.size()
            if (r3 >= r4) goto L56
            java.lang.Object r4 = r0.get(r3)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            android.view.View r4 = r8.findViewById(r4)
            if (r4 == 0) goto L53
            a.Ff r5 = new a.Ff
            r5.<init>(r4)
            if (r9 == 0) goto L3b
            r7.g(r5)
            goto L3e
        L3b:
            r7.d(r5)
        L3e:
            java.util.ArrayList<androidx.transition.e> r6 = r5.c
            r6.add(r7)
            r7.f(r5)
            if (r9 == 0) goto L4e
            a.A2 r6 = r7.g
            b(r6, r4, r5)
            goto L53
        L4e:
            a.A2 r6 = r7.h
            b(r6, r4, r5)
        L53:
            int r3 = r3 + 1
            goto L1a
        L56:
            int r8 = r2.size()
            if (r1 >= r8) goto L88
            java.lang.Object r8 = r2.get(r1)
            android.view.View r8 = (android.view.View) r8
            a.Ff r0 = new a.Ff
            r0.<init>(r8)
            if (r9 == 0) goto L6d
            r7.g(r0)
            goto L70
        L6d:
            r7.d(r0)
        L70:
            java.util.ArrayList<androidx.transition.e> r3 = r0.c
            r3.add(r7)
            r7.f(r0)
            if (r9 == 0) goto L80
            a.A2 r3 = r7.g
            b(r3, r8, r0)
            goto L85
        L80:
            a.A2 r3 = r7.h
            b(r3, r8, r0)
        L85:
            int r1 = r1 + 1
            goto L56
        L88:
            return
    }

    public final void i(boolean r1) {
            r0 = this;
            if (r1 == 0) goto L1e
            a.A2 r1 = r0.g
            java.lang.Object r1 = r1.f7a
            a.J1 r1 = (a.J1) r1
            r1.clear()
            a.A2 r1 = r0.g
            java.lang.Object r1 = r1.b
            android.util.SparseArray r1 = (android.util.SparseArray) r1
            r1.clear()
            a.A2 r1 = r0.g
            java.lang.Object r1 = r1.c
            a.U9 r1 = (a.U9) r1
            r1.a()
            return
        L1e:
            a.A2 r1 = r0.h
            java.lang.Object r1 = r1.f7a
            a.J1 r1 = (a.J1) r1
            r1.clear()
            a.A2 r1 = r0.h
            java.lang.Object r1 = r1.b
            android.util.SparseArray r1 = (android.util.SparseArray) r1
            r1.clear()
            a.A2 r1 = r0.h
            java.lang.Object r1 = r1.c
            a.U9 r1 = (a.U9) r1
            r1.a()
            return
    }

    public androidx.transition.e j() {
            r3 = this;
            java.lang.Object r0 = super.clone()     // Catch: java.lang.CloneNotSupportedException -> L27
            androidx.transition.e r0 = (androidx.transition.e) r0     // Catch: java.lang.CloneNotSupportedException -> L27
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.CloneNotSupportedException -> L27
            r1.<init>()     // Catch: java.lang.CloneNotSupportedException -> L27
            r0.u = r1     // Catch: java.lang.CloneNotSupportedException -> L27
            a.A2 r1 = new a.A2     // Catch: java.lang.CloneNotSupportedException -> L27
            r2 = 3
            r1.<init>(r2)     // Catch: java.lang.CloneNotSupportedException -> L27
            r0.g = r1     // Catch: java.lang.CloneNotSupportedException -> L27
            a.A2 r1 = new a.A2     // Catch: java.lang.CloneNotSupportedException -> L27
            r2 = 3
            r1.<init>(r2)     // Catch: java.lang.CloneNotSupportedException -> L27
            r0.h = r1     // Catch: java.lang.CloneNotSupportedException -> L27
            r1 = 0
            r0.k = r1     // Catch: java.lang.CloneNotSupportedException -> L27
            r0.l = r1     // Catch: java.lang.CloneNotSupportedException -> L27
            r0.s = r3     // Catch: java.lang.CloneNotSupportedException -> L27
            r0.t = r1     // Catch: java.lang.CloneNotSupportedException -> L27
            return r0
        L27:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
    }

    public android.animation.Animator k(android.widget.FrameLayout r1, a.Ff r2, a.Ff r3) {
            r0 = this;
            r1 = 0
            return r1
    }

    public void l(android.widget.FrameLayout r20, a.A2 r21, a.A2 r22, java.util.ArrayList r23, java.util.ArrayList r24) {
            r19 = this;
            r0 = r19
            a.J1 r1 = p()
            android.util.SparseIntArray r2 = new android.util.SparseIntArray
            r2.<init>()
            int r3 = r23.size()
            androidx.transition.e r4 = r0.o()
            r4.getClass()
            r5 = 0
        L17:
            r6 = 0
            if (r5 >= r3) goto L10a
            r7 = r23
            java.lang.Object r8 = r7.get(r5)
            a.Ff r8 = (a.Ff) r8
            r9 = r24
            java.lang.Object r10 = r9.get(r5)
            a.Ff r10 = (a.Ff) r10
            if (r8 == 0) goto L35
            java.util.ArrayList<androidx.transition.e> r11 = r8.c
            boolean r11 = r11.contains(r0)
            if (r11 != 0) goto L35
            r8 = r6
        L35:
            if (r10 == 0) goto L40
            java.util.ArrayList<androidx.transition.e> r11 = r10.c
            boolean r11 = r11.contains(r0)
            if (r11 != 0) goto L40
            r10 = r6
        L40:
            if (r8 != 0) goto L4e
            if (r10 != 0) goto L4e
        L44:
            r11 = r20
        L46:
            r15 = r22
            r16 = r3
            r17 = r5
            goto L104
        L4e:
            if (r8 == 0) goto L58
            if (r10 == 0) goto L58
            boolean r11 = r0.t(r8, r10)
            if (r11 == 0) goto L44
        L58:
            r11 = r20
            android.animation.Animator r12 = r0.k(r11, r8, r10)
            if (r12 == 0) goto L46
            java.lang.String r13 = r0.f1024a
            if (r10 == 0) goto Ldc
            java.lang.String[] r8 = r0.q()
            android.view.View r10 = r10.b
            if (r8 == 0) goto Ld1
            int r14 = r8.length
            if (r14 <= 0) goto Ld1
            a.Ff r14 = new a.Ff
            r14.<init>(r10)
            r15 = r22
            java.lang.Object r4 = r15.f7a
            a.J1 r4 = (a.J1) r4
            java.lang.Object r4 = r4.getOrDefault(r10, r6)
            a.Ff r4 = (a.Ff) r4
            r16 = r3
            if (r4 == 0) goto L9e
            r6 = 0
        L85:
            int r3 = r8.length
            if (r6 >= r3) goto L9e
            java.util.HashMap r3 = r14.f91a
            r17 = r5
            r5 = r8[r6]
            r18 = r6
            java.util.HashMap r6 = r4.f91a
            java.lang.Object r6 = r6.get(r5)
            r3.put(r5, r6)
            int r6 = r18 + 1
            r5 = r17
            goto L85
        L9e:
            r17 = r5
            int r3 = r1.c
            r4 = 0
        La3:
            if (r4 >= r3) goto Lcf
            java.lang.Object r5 = r1.h(r4)
            android.animation.Animator r5 = (android.animation.Animator) r5
            r6 = 0
            java.lang.Object r5 = r1.getOrDefault(r5, r6)
            androidx.transition.e$b r5 = (androidx.transition.e.b) r5
            a.Ff r6 = r5.c
            if (r6 == 0) goto Lcc
            android.view.View r6 = r5.f1025a
            if (r6 != r10) goto Lcc
            java.lang.String r6 = r5.b
            boolean r6 = r6.equals(r13)
            if (r6 == 0) goto Lcc
            a.Ff r5 = r5.c
            boolean r5 = r5.equals(r14)
            if (r5 == 0) goto Lcc
            r6 = 0
            goto Ld9
        Lcc:
            int r4 = r4 + 1
            goto La3
        Lcf:
            r6 = r12
            goto Ld9
        Ld1:
            r15 = r22
            r16 = r3
            r17 = r5
            r6 = r12
            r14 = 0
        Ld9:
            r12 = r6
            r6 = r14
            goto Le5
        Ldc:
            r15 = r22
            r16 = r3
            r17 = r5
            android.view.View r10 = r8.b
            r6 = 0
        Le5:
            if (r12 == 0) goto L104
            androidx.transition.e$b r3 = new androidx.transition.e$b
            android.view.WindowId r4 = r11.getWindowId()
            r3.<init>()
            r3.f1025a = r10
            r3.b = r13
            r3.c = r6
            r3.d = r4
            r3.e = r0
            r3.f = r12
            r1.put(r12, r3)
            java.util.ArrayList<android.animation.Animator> r3 = r0.u
            r3.add(r12)
        L104:
            int r5 = r17 + 1
            r3 = r16
            goto L17
        L10a:
            int r3 = r2.size()
            if (r3 == 0) goto L144
            r4 = 0
        L111:
            int r3 = r2.size()
            if (r4 >= r3) goto L144
            int r3 = r2.keyAt(r4)
            java.util.ArrayList<android.animation.Animator> r5 = r0.u
            java.lang.Object r3 = r5.get(r3)
            android.animation.Animator r3 = (android.animation.Animator) r3
            r6 = 0
            java.lang.Object r3 = r1.getOrDefault(r3, r6)
            androidx.transition.e$b r3 = (androidx.transition.e.b) r3
            int r5 = r2.valueAt(r4)
            long r7 = (long) r5
            r9 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r7 = r7 - r9
            android.animation.Animator r5 = r3.f
            long r9 = r5.getStartDelay()
            long r9 = r9 + r7
            android.animation.Animator r3 = r3.f
            r3.setStartDelay(r9)
            int r4 = r4 + 1
            goto L111
        L144:
            return
    }

    public final void m() {
            r4 = this;
            int r0 = r4.p
            r1 = 1
            int r0 = r0 - r1
            r4.p = r0
            if (r0 != 0) goto L52
            a.z r0 = androidx.transition.e.g.b
            r2 = 0
            r4.v(r4, r0, r2)
            r0 = r2
        Lf:
            a.A2 r3 = r4.g
            java.lang.Object r3 = r3.c
            a.U9 r3 = (a.U9) r3
            int r3 = r3.e()
            if (r0 >= r3) goto L2f
            a.A2 r3 = r4.g
            java.lang.Object r3 = r3.c
            a.U9 r3 = (a.U9) r3
            java.lang.Object r3 = r3.f(r0)
            android.view.View r3 = (android.view.View) r3
            if (r3 == 0) goto L2c
            r3.setHasTransientState(r2)
        L2c:
            int r0 = r0 + 1
            goto Lf
        L2f:
            r0 = r2
        L30:
            a.A2 r3 = r4.h
            java.lang.Object r3 = r3.c
            a.U9 r3 = (a.U9) r3
            int r3 = r3.e()
            if (r0 >= r3) goto L50
            a.A2 r3 = r4.h
            java.lang.Object r3 = r3.c
            a.U9 r3 = (a.U9) r3
            java.lang.Object r3 = r3.f(r0)
            android.view.View r3 = (android.view.View) r3
            if (r3 == 0) goto L4d
            r3.setHasTransientState(r2)
        L4d:
            int r0 = r0 + 1
            goto L30
        L50:
            r4.r = r1
        L52:
            return
    }

    public final a.Ff n(android.view.View r5, boolean r6) {
            r4 = this;
            androidx.transition.h r0 = r4.i
            if (r0 == 0) goto L9
            a.Ff r5 = r0.n(r5, r6)
            return r5
        L9:
            if (r6 == 0) goto Le
            java.util.ArrayList<a.Ff> r0 = r4.k
            goto L10
        Le:
            java.util.ArrayList<a.Ff> r0 = r4.l
        L10:
            if (r0 != 0) goto L13
            goto L3c
        L13:
            int r1 = r0.size()
            r2 = 0
        L18:
            if (r2 >= r1) goto L2b
            java.lang.Object r3 = r0.get(r2)
            a.Ff r3 = (a.Ff) r3
            if (r3 != 0) goto L23
            goto L3c
        L23:
            android.view.View r3 = r3.b
            if (r3 != r5) goto L28
            goto L2c
        L28:
            int r2 = r2 + 1
            goto L18
        L2b:
            r2 = -1
        L2c:
            if (r2 < 0) goto L3c
            if (r6 == 0) goto L33
            java.util.ArrayList<a.Ff> r5 = r4.l
            goto L35
        L33:
            java.util.ArrayList<a.Ff> r5 = r4.k
        L35:
            java.lang.Object r5 = r5.get(r2)
            a.Ff r5 = (a.Ff) r5
            return r5
        L3c:
            r5 = 0
            return r5
    }

    public final androidx.transition.e o() {
            r1 = this;
            androidx.transition.h r0 = r1.i
            if (r0 == 0) goto L9
            androidx.transition.e r0 = r0.o()
            return r0
        L9:
            return r1
    }

    public java.lang.String[] q() {
            r1 = this;
            r0 = 0
            return r0
    }

    public final a.Ff r(android.view.View r2, boolean r3) {
            r1 = this;
            androidx.transition.h r0 = r1.i
            if (r0 == 0) goto L9
            a.Ff r2 = r0.r(r2, r3)
            return r2
        L9:
            if (r3 == 0) goto Le
            a.A2 r3 = r1.g
            goto L10
        Le:
            a.A2 r3 = r1.h
        L10:
            java.lang.Object r3 = r3.f7a
            a.J1 r3 = (a.J1) r3
            r0 = 0
            java.lang.Object r2 = r3.getOrDefault(r2, r0)
            a.Ff r2 = (a.Ff) r2
            return r2
    }

    public boolean s() {
            r1 = this;
            java.util.ArrayList<android.animation.Animator> r0 = r1.n
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            return r0
    }

    public boolean t(a.Ff r8, a.Ff r9) {
            r7 = this;
            r0 = 0
            if (r8 == 0) goto L67
            if (r9 == 0) goto L67
            java.lang.String[] r1 = r7.q()
            r2 = 1
            java.util.HashMap r8 = r8.f91a
            java.util.HashMap r9 = r9.f91a
            if (r1 == 0) goto L36
            int r3 = r1.length
            r4 = r0
        L12:
            if (r4 >= r3) goto L67
            r5 = r1[r4]
            java.lang.Object r6 = r8.get(r5)
            java.lang.Object r5 = r9.get(r5)
            if (r6 != 0) goto L24
            if (r5 != 0) goto L24
            r5 = r0
            goto L30
        L24:
            if (r6 == 0) goto L2f
            if (r5 != 0) goto L29
            goto L2f
        L29:
            boolean r5 = r6.equals(r5)
            r5 = r5 ^ r2
            goto L30
        L2f:
            r5 = r2
        L30:
            if (r5 == 0) goto L33
            goto L66
        L33:
            int r4 = r4 + 1
            goto L12
        L36:
            java.util.Set r1 = r8.keySet()
            java.util.Iterator r1 = r1.iterator()
        L3e:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L67
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r8.get(r3)
            java.lang.Object r3 = r9.get(r3)
            if (r4 != 0) goto L58
            if (r3 != 0) goto L58
            r3 = r0
            goto L64
        L58:
            if (r4 == 0) goto L63
            if (r3 != 0) goto L5d
            goto L63
        L5d:
            boolean r3 = r4.equals(r3)
            r3 = r3 ^ r2
            goto L64
        L63:
            r3 = r2
        L64:
            if (r3 == 0) goto L3e
        L66:
            return r2
        L67:
            return r0
    }

    public final java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = ""
            java.lang.String r0 = r1.J(r0)
            return r0
    }

    public final boolean u(android.view.View r6) {
            r5 = this;
            int r0 = r6.getId()
            java.util.ArrayList<java.lang.Integer> r1 = r5.e
            int r2 = r1.size()
            r3 = 1
            java.util.ArrayList<android.view.View> r4 = r5.f
            if (r2 != 0) goto L16
            int r2 = r4.size()
            if (r2 != 0) goto L16
            return r3
        L16:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L29
            boolean r6 = r4.contains(r6)
            if (r6 == 0) goto L27
            goto L29
        L27:
            r6 = 0
            return r6
        L29:
            return r3
    }

    public final void v(androidx.transition.e r6, androidx.transition.e.g r7, boolean r8) {
            r5 = this;
            androidx.transition.e r0 = r5.s
            if (r0 == 0) goto L7
            r0.v(r6, r7, r8)
        L7:
            java.util.ArrayList<androidx.transition.e$f> r0 = r5.t
            if (r0 == 0) goto L37
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L37
            java.util.ArrayList<androidx.transition.e$f> r0 = r5.t
            int r0 = r0.size()
            androidx.transition.e$f[] r1 = r5.m
            if (r1 != 0) goto L1d
            androidx.transition.e$f[] r1 = new androidx.transition.e.f[r0]
        L1d:
            r2 = 0
            r5.m = r2
            java.util.ArrayList<androidx.transition.e$f> r3 = r5.t
            java.lang.Object[] r1 = r3.toArray(r1)
            androidx.transition.e$f[] r1 = (androidx.transition.e.f[]) r1
            r3 = 0
        L29:
            if (r3 >= r0) goto L35
            r4 = r1[r3]
            r7.a(r4, r6, r8)
            r1[r3] = r2
            int r3 = r3 + 1
            goto L29
        L35:
            r5.m = r1
        L37:
            return
    }

    public void w(android.view.ViewGroup r5) {
            r4 = this;
            boolean r5 = r4.r
            if (r5 != 0) goto L2f
            java.util.ArrayList<android.animation.Animator> r5 = r4.n
            int r0 = r5.size()
            android.animation.Animator[] r1 = r4.o
            java.lang.Object[] r5 = r5.toArray(r1)
            android.animation.Animator[] r5 = (android.animation.Animator[]) r5
            android.animation.Animator[] r1 = androidx.transition.e.y
            r4.o = r1
            r1 = 1
            int r0 = r0 - r1
        L18:
            if (r0 < 0) goto L25
            r2 = r5[r0]
            r3 = 0
            r5[r0] = r3
            r2.pause()
            int r0 = r0 + (-1)
            goto L18
        L25:
            r4.o = r5
            a.z r5 = androidx.transition.e.g.d
            r0 = 0
            r4.v(r4, r5, r0)
            r4.q = r1
        L2f:
            return
    }

    public void x() {
            r10 = this;
            a.J1 r0 = p()
            r1 = 0
            r10.w = r1
            r3 = 0
        L9:
            java.util.ArrayList<android.animation.Animator> r4 = r10.u
            int r4 = r4.size()
            if (r3 >= r4) goto L58
            java.util.ArrayList<android.animation.Animator> r4 = r10.u
            java.lang.Object r4 = r4.get(r3)
            android.animation.Animator r4 = (android.animation.Animator) r4
            r5 = 0
            java.lang.Object r5 = r0.getOrDefault(r4, r5)
            androidx.transition.e$b r5 = (androidx.transition.e.b) r5
            if (r4 == 0) goto L55
            if (r5 == 0) goto L55
            long r6 = r10.c
            int r8 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            android.animation.Animator r5 = r5.f
            if (r8 < 0) goto L2f
            r5.setDuration(r6)
        L2f:
            long r6 = r10.b
            int r8 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r8 < 0) goto L3d
            long r8 = r5.getStartDelay()
            long r8 = r8 + r6
            r5.setStartDelay(r8)
        L3d:
            android.animation.TimeInterpolator r6 = r10.d
            if (r6 == 0) goto L44
            r5.setInterpolator(r6)
        L44:
            java.util.ArrayList<android.animation.Animator> r5 = r10.n
            r5.add(r4)
            long r5 = r10.w
            long r7 = androidx.transition.e.d.a(r4)
            long r4 = java.lang.Math.max(r5, r7)
            r10.w = r4
        L55:
            int r3 = r3 + 1
            goto L9
        L58:
            java.util.ArrayList<android.animation.Animator> r0 = r10.u
            r0.clear()
            return
    }

    public androidx.transition.e y(androidx.transition.e.f r2) {
            r1 = this;
            java.util.ArrayList<androidx.transition.e$f> r0 = r1.t
            if (r0 != 0) goto L5
            goto L1d
        L5:
            boolean r0 = r0.remove(r2)
            if (r0 != 0) goto L12
            androidx.transition.e r0 = r1.s
            if (r0 == 0) goto L12
            r0.y(r2)
        L12:
            java.util.ArrayList<androidx.transition.e$f> r2 = r1.t
            int r2 = r2.size()
            if (r2 != 0) goto L1d
            r2 = 0
            r1.t = r2
        L1d:
            return r1
    }

    public void z(android.widget.FrameLayout r5) {
            r4 = this;
            boolean r5 = r4.q
            if (r5 == 0) goto L33
            boolean r5 = r4.r
            r0 = 0
            if (r5 != 0) goto L31
            java.util.ArrayList<android.animation.Animator> r5 = r4.n
            int r1 = r5.size()
            android.animation.Animator[] r2 = r4.o
            java.lang.Object[] r5 = r5.toArray(r2)
            android.animation.Animator[] r5 = (android.animation.Animator[]) r5
            android.animation.Animator[] r2 = androidx.transition.e.y
            r4.o = r2
            int r1 = r1 + (-1)
        L1d:
            if (r1 < 0) goto L2a
            r2 = r5[r1]
            r3 = 0
            r5[r1] = r3
            r2.resume()
            int r1 = r1 + (-1)
            goto L1d
        L2a:
            r4.o = r5
            a.z r5 = androidx.transition.e.g.e
            r4.v(r4, r5, r0)
        L31:
            r4.q = r0
        L33:
            return
    }
}
