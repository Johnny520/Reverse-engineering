package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes.dex */
public class RecyclerView extends android.view.ViewGroup implements a.Ib {
    public static final int[] A0 = null;
    public static final float B0 = 0.0f;
    public static final boolean C0 = false;
    public static final boolean D0 = false;
    public static final java.lang.Class<?>[] E0 = null;
    public static final androidx.recyclerview.widget.RecyclerView.b F0 = null;
    public static final androidx.recyclerview.widget.RecyclerView.x G0 = null;
    public static boolean y0 = false;
    public static boolean z0 = false;
    public final android.view.accessibility.AccessibilityManager A;
    public boolean B;
    public boolean C;
    public int D;
    public int E;
    public androidx.recyclerview.widget.RecyclerView.h F;
    public android.widget.EdgeEffect G;
    public android.widget.EdgeEffect H;
    public android.widget.EdgeEffect I;
    public android.widget.EdgeEffect J;
    public androidx.recyclerview.widget.RecyclerView.i K;
    public int L;
    public int M;
    public android.view.VelocityTracker N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public androidx.recyclerview.widget.RecyclerView.n T;
    public final int U;
    public final int V;
    public final float W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f962a;
    public final float a0;
    public final androidx.recyclerview.widget.RecyclerView.t b;
    public boolean b0;
    public final androidx.recyclerview.widget.RecyclerView.r c;
    public final androidx.recyclerview.widget.RecyclerView.z c0;
    public androidx.recyclerview.widget.RecyclerView.u d;
    public androidx.recyclerview.widget.m d0;
    public final androidx.recyclerview.widget.C0506a e;
    public final androidx.recyclerview.widget.m.b e0;
    public final androidx.recyclerview.widget.C0507b f;
    public final androidx.recyclerview.widget.RecyclerView.w f0;
    public final androidx.recyclerview.widget.C g;
    public androidx.recyclerview.widget.RecyclerView.p g0;
    public boolean h;
    public java.util.ArrayList h0;
    public final android.graphics.Rect i;
    public boolean i0;
    public final android.graphics.Rect j;
    public boolean j0;
    public final android.graphics.RectF k;
    public final androidx.recyclerview.widget.RecyclerView.j k0;
    public androidx.recyclerview.widget.RecyclerView.d l;
    public boolean l0;
    public androidx.recyclerview.widget.RecyclerView.l m;
    public androidx.recyclerview.widget.x m0;
    public androidx.recyclerview.widget.RecyclerView.s n;
    public final int[] n0;
    public final java.util.ArrayList o;
    public a.Jb o0;
    public final java.util.ArrayList<androidx.recyclerview.widget.RecyclerView.k> p;
    public final int[] p0;
    public final java.util.ArrayList<androidx.recyclerview.widget.RecyclerView.o> q;
    public final int[] q0;
    public androidx.recyclerview.widget.RecyclerView.o r;
    public final int[] r0;
    public boolean s;
    public final java.util.ArrayList s0;
    public boolean t;
    public final androidx.recyclerview.widget.RecyclerView.RunnableC0505a t0;
    public boolean u;
    public boolean u0;
    public int v;
    public int v0;
    public boolean w;
    public int w0;
    public boolean x;
    public final androidx.recyclerview.widget.RecyclerView.c x0;
    public boolean y;
    public int z;

    public static abstract class A {
        public static final java.util.List<java.lang.Object> t = null;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final android.view.View f963a;
        public java.lang.ref.WeakReference<androidx.recyclerview.widget.RecyclerView> b;
        public int c;
        public int d;
        public long e;
        public int f;
        public int g;
        public androidx.recyclerview.widget.RecyclerView.A h;
        public androidx.recyclerview.widget.RecyclerView.A i;
        public int j;
        public final java.util.ArrayList k;
        public final java.util.List<java.lang.Object> l;
        public int m;
        public androidx.recyclerview.widget.RecyclerView.r n;
        public boolean o;
        public int p;
        public int q;
        public androidx.recyclerview.widget.RecyclerView r;
        public androidx.recyclerview.widget.RecyclerView.d<? extends androidx.recyclerview.widget.RecyclerView.A> s;

        static {
                java.util.List r0 = java.util.Collections.EMPTY_LIST
                androidx.recyclerview.widget.RecyclerView.A.t = r0
                return
        }

        public A(android.view.View r4) {
                r3 = this;
                r3.<init>()
                r0 = -1
                r3.c = r0
                r3.d = r0
                r1 = -1
                r3.e = r1
                r3.f = r0
                r3.g = r0
                r1 = 0
                r3.h = r1
                r3.i = r1
                r3.k = r1
                r3.l = r1
                r2 = 0
                r3.m = r2
                r3.n = r1
                r3.o = r2
                r3.p = r2
                r3.q = r0
                if (r4 == 0) goto L29
                r3.f963a = r4
                return
            L29:
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "itemView may not be null"
                r4.<init>(r0)
                throw r4
        }

        public final void a(int r2) {
                r1 = this;
                int r0 = r1.j
                r2 = r2 | r0
                r1.j = r2
                return
        }

        public final int b() {
                r2 = this;
                int r0 = r2.g
                r1 = -1
                if (r0 != r1) goto L7
                int r0 = r2.c
            L7:
                return r0
        }

        public final java.util.List<java.lang.Object> c() {
                r1 = this;
                int r0 = r1.j
                r0 = r0 & 1024(0x400, float:1.435E-42)
                if (r0 != 0) goto L14
                java.util.ArrayList r0 = r1.k
                if (r0 == 0) goto L14
                int r0 = r0.size()
                if (r0 != 0) goto L11
                goto L14
            L11:
                java.util.List<java.lang.Object> r0 = r1.l
                return r0
            L14:
                java.util.List<java.lang.Object> r0 = androidx.recyclerview.widget.RecyclerView.A.t
                return r0
        }

        public final boolean d() {
                r2 = this;
                android.view.View r0 = r2.f963a
                android.view.ViewParent r1 = r0.getParent()
                if (r1 == 0) goto L12
                android.view.ViewParent r0 = r0.getParent()
                androidx.recyclerview.widget.RecyclerView r1 = r2.r
                if (r0 == r1) goto L12
                r0 = 1
                return r0
            L12:
                r0 = 0
                return r0
        }

        public final boolean e() {
                r2 = this;
                int r0 = r2.j
                r1 = 1
                r0 = r0 & r1
                if (r0 == 0) goto L7
                return r1
            L7:
                r0 = 0
                return r0
        }

        public final boolean f() {
                r1 = this;
                int r0 = r1.j
                r0 = r0 & 4
                if (r0 == 0) goto L8
                r0 = 1
                return r0
            L8:
                r0 = 0
                return r0
        }

        public final boolean g() {
                r1 = this;
                int r0 = r1.j
                r0 = r0 & 16
                if (r0 != 0) goto L12
                java.util.WeakHashMap<android.view.View, a.Jg> r0 = a.C0414ug.f721a
                android.view.View r0 = r1.f963a
                boolean r0 = r0.hasTransientState()
                if (r0 != 0) goto L12
                r0 = 1
                return r0
            L12:
                r0 = 0
                return r0
        }

        public final boolean h() {
                r1 = this;
                int r0 = r1.j
                r0 = r0 & 8
                if (r0 == 0) goto L8
                r0 = 1
                return r0
            L8:
                r0 = 0
                return r0
        }

        public final boolean i() {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView$r r0 = r1.n
                if (r0 == 0) goto L6
                r0 = 1
                return r0
            L6:
                r0 = 0
                return r0
        }

        public final boolean j() {
                r1 = this;
                int r0 = r1.j
                r0 = r0 & 256(0x100, float:3.59E-43)
                if (r0 == 0) goto L8
                r0 = 1
                return r0
            L8:
                r0 = 0
                return r0
        }

        public final boolean k() {
                r1 = this;
                int r0 = r1.j
                r0 = r0 & 2
                if (r0 == 0) goto L8
                r0 = 1
                return r0
            L8:
                r0 = 0
                return r0
        }

        public final void l(int r3, boolean r4) {
                r2 = this;
                int r0 = r2.d
                r1 = -1
                if (r0 != r1) goto L9
                int r0 = r2.c
                r2.d = r0
            L9:
                int r0 = r2.g
                if (r0 != r1) goto L11
                int r0 = r2.c
                r2.g = r0
            L11:
                if (r4 == 0) goto L18
                int r4 = r2.g
                int r4 = r4 + r3
                r2.g = r4
            L18:
                int r4 = r2.c
                int r4 = r4 + r3
                r2.c = r4
                android.view.View r3 = r2.f963a
                android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
                if (r4 == 0) goto L2e
                android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
                androidx.recyclerview.widget.RecyclerView$m r3 = (androidx.recyclerview.widget.RecyclerView.m) r3
                r4 = 1
                r3.c = r4
            L2e:
                return
        }

        public final void m() {
                r4 = this;
                boolean r0 = androidx.recyclerview.widget.RecyclerView.y0
                if (r0 == 0) goto L24
                boolean r0 = r4.j()
                if (r0 != 0) goto Lb
                goto L24
            Lb:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "Attempting to reset temp-detached ViewHolder: "
                r1.<init>(r2)
                r1.append(r4)
                java.lang.String r2 = ". ViewHolders should be fully detached before resetting."
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L24:
                r0 = 0
                r4.j = r0
                r1 = -1
                r4.c = r1
                r4.d = r1
                r2 = -1
                r4.e = r2
                r4.g = r1
                r4.m = r0
                r2 = 0
                r4.h = r2
                r4.i = r2
                java.util.ArrayList r2 = r4.k
                if (r2 == 0) goto L40
                r2.clear()
            L40:
                int r2 = r4.j
                r2 = r2 & (-1025(0xfffffffffffffbff, float:NaN))
                r4.j = r2
                r4.p = r0
                r4.q = r1
                androidx.recyclerview.widget.RecyclerView.l(r4)
                return
        }

        public final void n(boolean r3) {
                r2 = this;
                r0 = 1
                int r1 = r2.m
                if (r3 == 0) goto L7
                int r1 = r1 - r0
                goto L8
            L7:
                int r1 = r1 + r0
            L8:
                r2.m = r1
                if (r1 >= 0) goto L39
                r0 = 0
                r2.m = r0
                boolean r0 = androidx.recyclerview.widget.RecyclerView.y0
                java.lang.String r1 = "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for "
                if (r0 != 0) goto L27
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>(r1)
                r0.append(r2)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "View"
                android.util.Log.e(r1, r0)
                goto L4e
            L27:
                java.lang.RuntimeException r3 = new java.lang.RuntimeException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>(r1)
                r0.append(r2)
                java.lang.String r0 = r0.toString()
                r3.<init>(r0)
                throw r3
            L39:
                if (r3 != 0) goto L44
                if (r1 != r0) goto L44
                int r0 = r2.j
                r0 = r0 | 16
                r2.j = r0
                goto L4e
            L44:
                if (r3 == 0) goto L4e
                if (r1 != 0) goto L4e
                int r0 = r2.j
                r0 = r0 & (-17)
                r2.j = r0
            L4e:
                boolean r0 = androidx.recyclerview.widget.RecyclerView.z0
                if (r0 == 0) goto L6d
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "setIsRecyclable val:"
                r0.<init>(r1)
                r0.append(r3)
                java.lang.String r3 = ":"
                r0.append(r3)
                r0.append(r2)
                java.lang.String r3 = r0.toString()
                java.lang.String r0 = "RecyclerView"
                android.util.Log.d(r0, r3)
            L6d:
                return
        }

        public final boolean o() {
                r1 = this;
                int r0 = r1.j
                r0 = r0 & 128(0x80, float:1.8E-43)
                if (r0 == 0) goto L8
                r0 = 1
                return r0
            L8:
                r0 = 0
                return r0
        }

        public final boolean p() {
                r1 = this;
                int r0 = r1.j
                r0 = r0 & 32
                if (r0 == 0) goto L8
                r0 = 1
                return r0
            L8:
                r0 = 0
                return r0
        }

        public final java.lang.String toString() {
                r5 = this;
                java.lang.Class r0 = r5.getClass()
                boolean r0 = r0.isAnonymousClass()
                if (r0 == 0) goto Ld
                java.lang.String r0 = "ViewHolder"
                goto L15
            Ld:
                java.lang.Class r0 = r5.getClass()
                java.lang.String r0 = r0.getSimpleName()
            L15:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r0)
                java.lang.String r0 = "{"
                r2.append(r0)
                int r0 = r5.hashCode()
                java.lang.String r0 = java.lang.Integer.toHexString(r0)
                r2.append(r0)
                java.lang.String r0 = " position="
                r2.append(r0)
                int r0 = r5.c
                r2.append(r0)
                java.lang.String r0 = " id="
                r2.append(r0)
                long r3 = r5.e
                r2.append(r3)
                java.lang.String r0 = ", oldPos="
                r2.append(r0)
                int r0 = r5.d
                r2.append(r0)
                java.lang.String r0 = ", pLpos:"
                r2.append(r0)
                int r0 = r5.g
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                r1.<init>(r0)
                boolean r0 = r5.i()
                if (r0 == 0) goto L75
                java.lang.String r0 = " scrap "
                r1.append(r0)
                boolean r0 = r5.o
                if (r0 == 0) goto L70
                java.lang.String r0 = "[changeScrap]"
                goto L72
            L70:
                java.lang.String r0 = "[attachedScrap]"
            L72:
                r1.append(r0)
            L75:
                boolean r0 = r5.f()
                if (r0 == 0) goto L80
                java.lang.String r0 = " invalid"
                r1.append(r0)
            L80:
                boolean r0 = r5.e()
                if (r0 != 0) goto L8b
                java.lang.String r0 = " unbound"
                r1.append(r0)
            L8b:
                int r0 = r5.j
                r0 = r0 & 2
                if (r0 == 0) goto L96
                java.lang.String r0 = " update"
                r1.append(r0)
            L96:
                boolean r0 = r5.h()
                if (r0 == 0) goto La1
                java.lang.String r0 = " removed"
                r1.append(r0)
            La1:
                boolean r0 = r5.o()
                if (r0 == 0) goto Lac
                java.lang.String r0 = " ignored"
                r1.append(r0)
            Lac:
                boolean r0 = r5.j()
                if (r0 == 0) goto Lb7
                java.lang.String r0 = " tmpDetached"
                r1.append(r0)
            Lb7:
                boolean r0 = r5.g()
                if (r0 != 0) goto Ld5
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r2 = " not recyclable("
                r0.<init>(r2)
                int r2 = r5.m
                r0.append(r2)
                java.lang.String r2 = ")"
                r0.append(r2)
                java.lang.String r0 = r0.toString()
                r1.append(r0)
            Ld5:
                int r0 = r5.j
                r0 = r0 & 512(0x200, float:7.17E-43)
                if (r0 != 0) goto Le1
                boolean r0 = r5.f()
                if (r0 == 0) goto Le6
            Le1:
                java.lang.String r0 = " undefined adapter position"
                r1.append(r0)
            Le6:
                android.view.View r0 = r5.f963a
                android.view.ViewParent r0 = r0.getParent()
                if (r0 != 0) goto Lf3
                java.lang.String r0 = " no parent"
                r1.append(r0)
            Lf3:
                java.lang.String r0 = "}"
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                return r0
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$a, reason: case insensitive filesystem */
    public class RunnableC0505a implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f964a;

        public RunnableC0505a(androidx.recyclerview.widget.RecyclerView r1) {
                r0 = this;
                r0.<init>()
                r0.f964a = r1
                return
        }

        @Override // java.lang.Runnable
        public final void run() {
                r17 = this;
                r0 = r17
                androidx.recyclerview.widget.RecyclerView r1 = r0.f964a
                androidx.recyclerview.widget.RecyclerView$i r2 = r1.K
                if (r2 == 0) goto L109
                androidx.recyclerview.widget.k r2 = (androidx.recyclerview.widget.k) r2
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$A> r4 = r2.h
                boolean r5 = r4.isEmpty()
                java.util.ArrayList<androidx.recyclerview.widget.k$b> r6 = r2.j
                boolean r7 = r6.isEmpty()
                java.util.ArrayList<androidx.recyclerview.widget.k$a> r8 = r2.k
                boolean r9 = r8.isEmpty()
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$A> r10 = r2.i
                boolean r11 = r10.isEmpty()
                if (r5 == 0) goto L2c
                if (r7 == 0) goto L2c
                if (r11 == 0) goto L2c
                if (r9 == 0) goto L2c
                goto L109
            L2c:
                java.util.Iterator r12 = r4.iterator()
            L30:
                boolean r13 = r12.hasNext()
                long r14 = r2.d
                if (r13 == 0) goto L65
                java.lang.Object r13 = r12.next()
                androidx.recyclerview.widget.RecyclerView$A r13 = (androidx.recyclerview.widget.RecyclerView.A) r13
                android.view.View r3 = r13.f963a
                android.view.ViewPropertyAnimator r0 = r3.animate()
                r16 = r4
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$A> r4 = r2.q
                r4.add(r13)
                android.view.ViewPropertyAnimator r4 = r0.setDuration(r14)
                r14 = 0
                android.view.ViewPropertyAnimator r4 = r4.alpha(r14)
                androidx.recyclerview.widget.f r14 = new androidx.recyclerview.widget.f
                r14.<init>(r3, r0, r2, r13)
                android.view.ViewPropertyAnimator r0 = r4.setListener(r14)
                r0.start()
                r0 = r17
                r4 = r16
                goto L30
            L65:
                r16 = r4
                r16.clear()
                if (r7 != 0) goto L97
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r0.addAll(r6)
                java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.k$b>> r3 = r2.m
                r3.add(r0)
                r6.clear()
                androidx.recyclerview.widget.c r3 = new androidx.recyclerview.widget.c
                r3.<init>(r2, r0)
                if (r5 != 0) goto L94
                r4 = 0
                java.lang.Object r0 = r0.get(r4)
                androidx.recyclerview.widget.k$b r0 = (androidx.recyclerview.widget.k.b) r0
                androidx.recyclerview.widget.RecyclerView$A r0 = r0.f1003a
                android.view.View r0 = r0.f963a
                java.util.WeakHashMap<android.view.View, a.Jg> r4 = a.C0414ug.f721a
                r0.postOnAnimationDelayed(r3, r14)
                goto L97
            L94:
                r3.run()
            L97:
                if (r9 != 0) goto Lc4
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r0.addAll(r8)
                java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.k$a>> r3 = r2.n
                r3.add(r0)
                r8.clear()
                androidx.recyclerview.widget.d r3 = new androidx.recyclerview.widget.d
                r3.<init>(r2, r0)
                if (r5 != 0) goto Lc1
                r4 = 0
                java.lang.Object r0 = r0.get(r4)
                androidx.recyclerview.widget.k$a r0 = (androidx.recyclerview.widget.k.a) r0
                androidx.recyclerview.widget.RecyclerView$A r0 = r0.f1002a
                android.view.View r0 = r0.f963a
                java.util.WeakHashMap<android.view.View, a.Jg> r4 = a.C0414ug.f721a
                r0.postOnAnimationDelayed(r3, r14)
                goto Lc4
            Lc1:
                r3.run()
            Lc4:
                if (r11 != 0) goto L109
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r0.addAll(r10)
                java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$A>> r3 = r2.l
                r3.add(r0)
                r10.clear()
                androidx.recyclerview.widget.e r3 = new androidx.recyclerview.widget.e
                r3.<init>(r2, r0)
                if (r5 == 0) goto Le6
                if (r7 == 0) goto Le6
                if (r9 != 0) goto Le2
                goto Le6
            Le2:
                r3.run()
                goto L109
            Le6:
                r10 = 0
                if (r5 != 0) goto Leb
                goto Lec
            Leb:
                r14 = r10
            Lec:
                if (r7 != 0) goto Lf1
                long r4 = r2.e
                goto Lf2
            Lf1:
                r4 = r10
            Lf2:
                if (r9 != 0) goto Lf6
                long r10 = r2.f
            Lf6:
                long r4 = java.lang.Math.max(r4, r10)
                long r4 = r4 + r14
                r2 = 0
                java.lang.Object r0 = r0.get(r2)
                androidx.recyclerview.widget.RecyclerView$A r0 = (androidx.recyclerview.widget.RecyclerView.A) r0
                android.view.View r0 = r0.f963a
                java.util.WeakHashMap<android.view.View, a.Jg> r2 = a.C0414ug.f721a
                r0.postOnAnimationDelayed(r3, r4)
            L109:
                r4 = 0
                r1.l0 = r4
                return
        }
    }

    public class b implements android.view.animation.Interpolator {
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float r3) {
                r2 = this;
                r0 = 1065353216(0x3f800000, float:1.0)
                float r3 = r3 - r0
                float r1 = r3 * r3
                float r1 = r1 * r3
                float r1 = r1 * r3
                float r1 = r1 * r3
                float r1 = r1 + r0
                return r1
        }
    }

    public class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f965a;

        public c(androidx.recyclerview.widget.RecyclerView r1) {
                r0 = this;
                r0.<init>()
                r0.f965a = r1
                return
        }

        public final void a(androidx.recyclerview.widget.RecyclerView.A r9, androidx.recyclerview.widget.RecyclerView.i.b r10, androidx.recyclerview.widget.RecyclerView.i.b r11) {
                r8 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r8.f965a
                r0.getClass()
                r1 = 0
                r9.n(r1)
                androidx.recyclerview.widget.RecyclerView$i r1 = r0.K
                r2 = r1
                androidx.recyclerview.widget.z r2 = (androidx.recyclerview.widget.z) r2
                r2.getClass()
                if (r10 == 0) goto L20
                int r4 = r10.f969a
                int r6 = r11.f969a
                if (r4 != r6) goto L22
                int r1 = r10.b
                int r3 = r11.b
                if (r1 == r3) goto L20
                goto L22
            L20:
                r3 = r9
                goto L2c
            L22:
                int r5 = r10.b
                int r7 = r11.b
                r3 = r9
                boolean r9 = r2.g(r3, r4, r5, r6, r7)
                goto L3d
            L2c:
                androidx.recyclerview.widget.k r2 = (androidx.recyclerview.widget.k) r2
                r2.l(r3)
                android.view.View r9 = r3.f963a
                r10 = 0
                r9.setAlpha(r10)
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$A> r9 = r2.i
                r9.add(r3)
                r9 = 1
            L3d:
                if (r9 == 0) goto L42
                r0.V()
            L42:
                return
        }

        public final void b(androidx.recyclerview.widget.RecyclerView.A r9, androidx.recyclerview.widget.RecyclerView.i.b r10, androidx.recyclerview.widget.RecyclerView.i.b r11) {
                r8 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r8.f965a
                androidx.recyclerview.widget.RecyclerView$r r1 = r0.c
                r1.l(r9)
                r0.h(r9)
                r1 = 0
                r9.n(r1)
                androidx.recyclerview.widget.RecyclerView$i r1 = r0.K
                r2 = r1
                androidx.recyclerview.widget.z r2 = (androidx.recyclerview.widget.z) r2
                r2.getClass()
                int r4 = r10.f969a
                int r5 = r10.b
                android.view.View r10 = r9.f963a
                if (r11 != 0) goto L24
                int r1 = r10.getLeft()
            L22:
                r6 = r1
                goto L27
            L24:
                int r1 = r11.f969a
                goto L22
            L27:
                if (r11 != 0) goto L2f
                int r11 = r10.getTop()
            L2d:
                r7 = r11
                goto L32
            L2f:
                int r11 = r11.b
                goto L2d
            L32:
                boolean r11 = r9.h()
                if (r11 != 0) goto L3d
                if (r4 != r6) goto L3f
                if (r5 == r7) goto L3d
                goto L3f
            L3d:
                r3 = r9
                goto L52
            L3f:
                int r11 = r10.getWidth()
                int r11 = r11 + r6
                int r1 = r10.getHeight()
                int r1 = r1 + r7
                r10.layout(r6, r7, r11, r1)
                r3 = r9
                boolean r9 = r2.g(r3, r4, r5, r6, r7)
                goto L5d
            L52:
                androidx.recyclerview.widget.k r2 = (androidx.recyclerview.widget.k) r2
                r2.l(r3)
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$A> r9 = r2.h
                r9.add(r3)
                r9 = 1
            L5d:
                if (r9 == 0) goto L62
                r0.V()
            L62:
                return
        }
    }

    public static abstract class d<VH extends androidx.recyclerview.widget.RecyclerView.A> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final androidx.recyclerview.widget.RecyclerView.e f966a;
        public boolean b;
        public final androidx.recyclerview.widget.RecyclerView.d.a c;

        public enum a extends java.lang.Enum<androidx.recyclerview.widget.RecyclerView.d.a> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final androidx.recyclerview.widget.RecyclerView.d.a f967a = null;
            public static final /* synthetic */ androidx.recyclerview.widget.RecyclerView.d.a[] b = null;

            static {
                    androidx.recyclerview.widget.RecyclerView$d$a r0 = new androidx.recyclerview.widget.RecyclerView$d$a
                    java.lang.String r1 = "ALLOW"
                    r2 = 0
                    r0.<init>(r1, r2)
                    androidx.recyclerview.widget.RecyclerView.d.a.f967a = r0
                    androidx.recyclerview.widget.RecyclerView$d$a r1 = new androidx.recyclerview.widget.RecyclerView$d$a
                    java.lang.String r2 = "PREVENT_WHEN_EMPTY"
                    r3 = 1
                    r1.<init>(r2, r3)
                    androidx.recyclerview.widget.RecyclerView$d$a r2 = new androidx.recyclerview.widget.RecyclerView$d$a
                    java.lang.String r3 = "PREVENT"
                    r4 = 2
                    r2.<init>(r3, r4)
                    androidx.recyclerview.widget.RecyclerView$d$a[] r0 = new androidx.recyclerview.widget.RecyclerView.d.a[]{r0, r1, r2}
                    androidx.recyclerview.widget.RecyclerView.d.a.b = r0
                    return
            }

            a() {
                    r0 = this;
                    r0 = 0
                    throw r0
            }

            public static androidx.recyclerview.widget.RecyclerView.d.a valueOf(java.lang.String r1) {
                    java.lang.Class<androidx.recyclerview.widget.RecyclerView$d$a> r0 = androidx.recyclerview.widget.RecyclerView.d.a.class
                    java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                    androidx.recyclerview.widget.RecyclerView$d$a r1 = (androidx.recyclerview.widget.RecyclerView.d.a) r1
                    return r1
            }

            public static androidx.recyclerview.widget.RecyclerView.d.a[] values() {
                    androidx.recyclerview.widget.RecyclerView$d$a[] r0 = androidx.recyclerview.widget.RecyclerView.d.a.b
                    java.lang.Object r0 = r0.clone()
                    androidx.recyclerview.widget.RecyclerView$d$a[] r0 = (androidx.recyclerview.widget.RecyclerView.d.a[]) r0
                    return r0
            }
        }

        public d() {
                r1 = this;
                r1.<init>()
                androidx.recyclerview.widget.RecyclerView$e r0 = new androidx.recyclerview.widget.RecyclerView$e
                r0.<init>()
                r1.f966a = r0
                r0 = 0
                r1.b = r0
                androidx.recyclerview.widget.RecyclerView$d$a r0 = androidx.recyclerview.widget.RecyclerView.d.a.f967a
                r1.c = r0
                return
        }

        public abstract int a();

        public long b(int r3) {
                r2 = this;
                r0 = -1
                return r0
        }

        public int c(int r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        public abstract void d(VH r1, int r2);

        public abstract VH e(android.view.ViewGroup r1, int r2);
    }

    public static class e extends android.database.Observable<androidx.recyclerview.widget.RecyclerView.f> {
        public final boolean a() {
                r1 = this;
                java.util.ArrayList r0 = r1.mObservers
                boolean r0 = r0.isEmpty()
                r0 = r0 ^ 1
                return r0
        }

        public final void b() {
                r2 = this;
                java.util.ArrayList r0 = r2.mObservers
                int r0 = r0.size()
                int r0 = r0 + (-1)
            L8:
                if (r0 < 0) goto L18
                java.util.ArrayList r1 = r2.mObservers
                java.lang.Object r1 = r1.get(r0)
                androidx.recyclerview.widget.RecyclerView$f r1 = (androidx.recyclerview.widget.RecyclerView.f) r1
                r1.a()
                int r0 = r0 + (-1)
                goto L8
            L18:
                return
        }
    }

    public static abstract class f {
        public f() {
                r0 = this;
                r0.<init>()
                return
        }

        public void a() {
                r0 = this;
                return
        }
    }

    public interface g {
    }

    public static class h {
    }

    public static abstract class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public androidx.recyclerview.widget.RecyclerView.j f968a;
        public java.util.ArrayList<androidx.recyclerview.widget.RecyclerView.i.a> b;
        public long c;
        public long d;
        public long e;
        public long f;

        public interface a {
            void a();
        }

        public static class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f969a;
            public int b;

            public final void a(androidx.recyclerview.widget.RecyclerView.A r2) {
                    r1 = this;
                    android.view.View r2 = r2.f963a
                    int r0 = r2.getLeft()
                    r1.f969a = r0
                    int r0 = r2.getTop()
                    r1.b = r0
                    r2.getRight()
                    r2.getBottom()
                    return
            }
        }

        public static void b(androidx.recyclerview.widget.RecyclerView.A r2) {
                int r0 = r2.j
                boolean r1 = r2.f()
                if (r1 == 0) goto L9
                goto L15
            L9:
                r0 = r0 & 4
                if (r0 != 0) goto L15
                androidx.recyclerview.widget.RecyclerView r0 = r2.r
                if (r0 != 0) goto L12
                goto L15
            L12:
                r0.I(r2)
            L15:
                return
        }

        public abstract boolean a(androidx.recyclerview.widget.RecyclerView.A r1, androidx.recyclerview.widget.RecyclerView.A r2, androidx.recyclerview.widget.RecyclerView.i.b r3, androidx.recyclerview.widget.RecyclerView.i.b r4);

        public final void c(androidx.recyclerview.widget.RecyclerView.A r10) {
                r9 = this;
                androidx.recyclerview.widget.RecyclerView$j r0 = r9.f968a
                if (r0 == 0) goto Laf
                r1 = 1
                r10.n(r1)
                androidx.recyclerview.widget.RecyclerView$A r2 = r10.h
                r3 = 0
                if (r2 == 0) goto L13
                androidx.recyclerview.widget.RecyclerView$A r2 = r10.i
                if (r2 != 0) goto L13
                r10.h = r3
            L13:
                r10.i = r3
                int r2 = r10.j
                r2 = r2 & 16
                if (r2 == 0) goto L1d
                goto Laf
            L1d:
                androidx.recyclerview.widget.RecyclerView r0 = r0.f970a
                r0.h0()
                androidx.recyclerview.widget.b r2 = r0.f
                androidx.recyclerview.widget.b$a r3 = r2.b
                androidx.recyclerview.widget.v r4 = r2.f992a
                int r5 = r2.d
                r6 = 0
                android.view.View r7 = r10.f963a
                if (r5 != r1) goto L3d
                android.view.View r1 = r2.e
                if (r1 != r7) goto L35
            L33:
                r1 = r6
                goto L66
            L35:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "Cannot call removeViewIfHidden within removeView(At) for a different view"
                r10.<init>(r0)
                throw r10
            L3d:
                r8 = 2
                if (r5 == r8) goto La7
                r2.d = r8     // Catch: java.lang.Throwable -> L51
                androidx.recyclerview.widget.RecyclerView r5 = r4.f1015a     // Catch: java.lang.Throwable -> L51
                int r5 = r5.indexOfChild(r7)     // Catch: java.lang.Throwable -> L51
                r8 = -1
                if (r5 != r8) goto L53
                r2.j(r7)     // Catch: java.lang.Throwable -> L51
            L4e:
                r2.d = r6
                goto L66
            L51:
                r10 = move-exception
                goto La4
            L53:
                boolean r8 = r3.d(r5)     // Catch: java.lang.Throwable -> L51
                if (r8 == 0) goto L63
                r3.f(r5)     // Catch: java.lang.Throwable -> L51
                r2.j(r7)     // Catch: java.lang.Throwable -> L51
                r4.a(r5)     // Catch: java.lang.Throwable -> L51
                goto L4e
            L63:
                r2.d = r6
                goto L33
            L66:
                if (r1 == 0) goto L93
                androidx.recyclerview.widget.RecyclerView$A r2 = androidx.recyclerview.widget.RecyclerView.L(r7)
                androidx.recyclerview.widget.RecyclerView$r r3 = r0.c
                r3.l(r2)
                r3.i(r2)
                boolean r2 = androidx.recyclerview.widget.RecyclerView.z0
                if (r2 == 0) goto L93
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r3 = "after removing animated view: "
                r2.<init>(r3)
                r2.append(r7)
                java.lang.String r3 = ", "
                r2.append(r3)
                r2.append(r0)
                java.lang.String r2 = r2.toString()
                java.lang.String r3 = "RecyclerView"
                android.util.Log.d(r3, r2)
            L93:
                r2 = r1 ^ 1
                r0.i0(r2)
                if (r1 != 0) goto Laf
                boolean r10 = r10.j()
                if (r10 == 0) goto Laf
                r0.removeDetachedView(r7, r6)
                return
            La4:
                r2.d = r6
                throw r10
            La7:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "Cannot call removeViewIfHidden within removeViewIfHidden"
                r10.<init>(r0)
                throw r10
            Laf:
                return
        }

        public abstract void d(androidx.recyclerview.widget.RecyclerView.A r1);

        public abstract void e();

        public abstract boolean f();
    }

    public class j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f970a;

        public j(androidx.recyclerview.widget.RecyclerView r1) {
                r0 = this;
                r0.<init>()
                r0.f970a = r1
                return
        }
    }

    public static abstract class k {
        public k() {
                r0 = this;
                r0.<init>()
                return
        }

        public void c(android.graphics.Canvas r1, androidx.recyclerview.widget.RecyclerView r2) {
                r0 = this;
                return
        }

        public void d(android.graphics.Canvas r1, androidx.recyclerview.widget.RecyclerView r2) {
                r0 = this;
                return
        }
    }

    public static abstract class l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public androidx.recyclerview.widget.C0507b f971a;
        public androidx.recyclerview.widget.RecyclerView b;
        public final androidx.recyclerview.widget.B c;
        public final androidx.recyclerview.widget.B d;
        public androidx.recyclerview.widget.o e;
        public boolean f;
        public boolean g;
        public final boolean h;
        public final boolean i;
        public int j;
        public boolean k;
        public int l;
        public int m;
        public int n;
        public int o;

        public class a implements androidx.recyclerview.widget.B.b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ androidx.recyclerview.widget.RecyclerView.l f972a;

            public a(androidx.recyclerview.widget.RecyclerView.l r1) {
                    r0 = this;
                    r0.<init>()
                    r0.f972a = r1
                    return
            }

            @Override // androidx.recyclerview.widget.B.b
            public final android.view.View a(int r2) {
                    r1 = this;
                    androidx.recyclerview.widget.RecyclerView$l r0 = r1.f972a
                    android.view.View r2 = r0.u(r2)
                    return r2
            }

            @Override // androidx.recyclerview.widget.B.b
            public final int b() {
                    r2 = this;
                    androidx.recyclerview.widget.RecyclerView$l r0 = r2.f972a
                    int r1 = r0.n
                    int r0 = r0.F()
                    int r1 = r1 - r0
                    return r1
            }

            @Override // androidx.recyclerview.widget.B.b
            public final int c() {
                    r1 = this;
                    androidx.recyclerview.widget.RecyclerView$l r0 = r1.f972a
                    int r0 = r0.E()
                    return r0
            }

            @Override // androidx.recyclerview.widget.B.b
            public final int d(android.view.View r3) {
                    r2 = this;
                    android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
                    androidx.recyclerview.widget.RecyclerView$m r0 = (androidx.recyclerview.widget.RecyclerView.m) r0
                    int r1 = r3.getRight()
                    android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
                    androidx.recyclerview.widget.RecyclerView$m r3 = (androidx.recyclerview.widget.RecyclerView.m) r3
                    android.graphics.Rect r3 = r3.b
                    int r3 = r3.right
                    int r1 = r1 + r3
                    int r3 = r0.rightMargin
                    int r1 = r1 + r3
                    return r1
            }

            @Override // androidx.recyclerview.widget.B.b
            public final int e(android.view.View r3) {
                    r2 = this;
                    android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
                    androidx.recyclerview.widget.RecyclerView$m r0 = (androidx.recyclerview.widget.RecyclerView.m) r0
                    int r1 = r3.getLeft()
                    android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
                    androidx.recyclerview.widget.RecyclerView$m r3 = (androidx.recyclerview.widget.RecyclerView.m) r3
                    android.graphics.Rect r3 = r3.b
                    int r3 = r3.left
                    int r1 = r1 - r3
                    int r3 = r0.leftMargin
                    int r1 = r1 - r3
                    return r1
            }
        }

        public class b implements androidx.recyclerview.widget.B.b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ androidx.recyclerview.widget.RecyclerView.l f973a;

            public b(androidx.recyclerview.widget.RecyclerView.l r1) {
                    r0 = this;
                    r0.<init>()
                    r0.f973a = r1
                    return
            }

            @Override // androidx.recyclerview.widget.B.b
            public final android.view.View a(int r2) {
                    r1 = this;
                    androidx.recyclerview.widget.RecyclerView$l r0 = r1.f973a
                    android.view.View r2 = r0.u(r2)
                    return r2
            }

            @Override // androidx.recyclerview.widget.B.b
            public final int b() {
                    r2 = this;
                    androidx.recyclerview.widget.RecyclerView$l r0 = r2.f973a
                    int r1 = r0.o
                    int r0 = r0.D()
                    int r1 = r1 - r0
                    return r1
            }

            @Override // androidx.recyclerview.widget.B.b
            public final int c() {
                    r1 = this;
                    androidx.recyclerview.widget.RecyclerView$l r0 = r1.f973a
                    int r0 = r0.G()
                    return r0
            }

            @Override // androidx.recyclerview.widget.B.b
            public final int d(android.view.View r3) {
                    r2 = this;
                    android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
                    androidx.recyclerview.widget.RecyclerView$m r0 = (androidx.recyclerview.widget.RecyclerView.m) r0
                    int r1 = r3.getBottom()
                    android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
                    androidx.recyclerview.widget.RecyclerView$m r3 = (androidx.recyclerview.widget.RecyclerView.m) r3
                    android.graphics.Rect r3 = r3.b
                    int r3 = r3.bottom
                    int r1 = r1 + r3
                    int r3 = r0.bottomMargin
                    int r1 = r1 + r3
                    return r1
            }

            @Override // androidx.recyclerview.widget.B.b
            public final int e(android.view.View r3) {
                    r2 = this;
                    android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
                    androidx.recyclerview.widget.RecyclerView$m r0 = (androidx.recyclerview.widget.RecyclerView.m) r0
                    int r1 = r3.getTop()
                    android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
                    androidx.recyclerview.widget.RecyclerView$m r3 = (androidx.recyclerview.widget.RecyclerView.m) r3
                    android.graphics.Rect r3 = r3.b
                    int r3 = r3.top
                    int r1 = r1 - r3
                    int r3 = r0.topMargin
                    int r1 = r1 - r3
                    return r1
            }
        }

        public static class c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f974a;
            public int b;
            public boolean c;
            public boolean d;
        }

        public l() {
                r3 = this;
                r3.<init>()
                androidx.recyclerview.widget.RecyclerView$l$a r0 = new androidx.recyclerview.widget.RecyclerView$l$a
                r0.<init>(r3)
                androidx.recyclerview.widget.RecyclerView$l$b r1 = new androidx.recyclerview.widget.RecyclerView$l$b
                r1.<init>(r3)
                androidx.recyclerview.widget.B r2 = new androidx.recyclerview.widget.B
                r2.<init>(r0)
                r3.c = r2
                androidx.recyclerview.widget.B r0 = new androidx.recyclerview.widget.B
                r0.<init>(r1)
                r3.d = r0
                r0 = 0
                r3.f = r0
                r3.g = r0
                r0 = 1
                r3.h = r0
                r3.i = r0
                return
        }

        public static int A(android.view.View r2) {
                android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
                androidx.recyclerview.widget.RecyclerView$m r0 = (androidx.recyclerview.widget.RecyclerView.m) r0
                android.graphics.Rect r0 = r0.b
                int r2 = r2.getMeasuredWidth()
                int r1 = r0.left
                int r2 = r2 + r1
                int r0 = r0.right
                int r2 = r2 + r0
                return r2
        }

        public static int H(android.view.View r0) {
                android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
                androidx.recyclerview.widget.RecyclerView$m r0 = (androidx.recyclerview.widget.RecyclerView.m) r0
                androidx.recyclerview.widget.RecyclerView$A r0 = r0.f975a
                int r0 = r0.b()
                return r0
        }

        public static androidx.recyclerview.widget.RecyclerView.l.c I(android.content.Context r2, android.util.AttributeSet r3, int r4, int r5) {
                androidx.recyclerview.widget.RecyclerView$l$c r0 = new androidx.recyclerview.widget.RecyclerView$l$c
                r0.<init>()
                int[] r1 = androidx.recyclerview.R.styleable.RecyclerView
                android.content.res.TypedArray r2 = r2.obtainStyledAttributes(r3, r1, r4, r5)
                int r3 = androidx.recyclerview.R.styleable.RecyclerView_android_orientation
                r4 = 1
                int r3 = r2.getInt(r3, r4)
                r0.f974a = r3
                int r3 = androidx.recyclerview.R.styleable.RecyclerView_spanCount
                int r3 = r2.getInt(r3, r4)
                r0.b = r3
                int r3 = androidx.recyclerview.R.styleable.RecyclerView_reverseLayout
                r4 = 0
                boolean r3 = r2.getBoolean(r3, r4)
                r0.c = r3
                int r3 = androidx.recyclerview.R.styleable.RecyclerView_stackFromEnd
                boolean r3 = r2.getBoolean(r3, r4)
                r0.d = r3
                r2.recycle()
                return r0
        }

        public static boolean M(int r3, int r4, int r5) {
                int r0 = android.view.View.MeasureSpec.getMode(r4)
                int r4 = android.view.View.MeasureSpec.getSize(r4)
                r1 = 0
                if (r5 <= 0) goto Le
                if (r3 == r5) goto Le
                return r1
            Le:
                r5 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = 1
                if (r0 == r5) goto L1f
                if (r0 == 0) goto L1e
                r5 = 1073741824(0x40000000, float:2.0)
                if (r0 == r5) goto L1a
                return r1
            L1a:
                if (r4 != r3) goto L1d
                return r2
            L1d:
                return r1
            L1e:
                return r2
            L1f:
                if (r4 < r3) goto L22
                return r2
            L22:
                return r1
        }

        public static void N(android.view.View r3, int r4, int r5, int r6, int r7) {
                android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
                androidx.recyclerview.widget.RecyclerView$m r0 = (androidx.recyclerview.widget.RecyclerView.m) r0
                android.graphics.Rect r1 = r0.b
                int r2 = r1.left
                int r4 = r4 + r2
                int r2 = r0.leftMargin
                int r4 = r4 + r2
                int r2 = r1.top
                int r5 = r5 + r2
                int r2 = r0.topMargin
                int r5 = r5 + r2
                int r2 = r1.right
                int r6 = r6 - r2
                int r2 = r0.rightMargin
                int r6 = r6 - r2
                int r1 = r1.bottom
                int r7 = r7 - r1
                int r0 = r0.bottomMargin
                int r7 = r7 - r0
                r3.layout(r4, r5, r6, r7)
                return
        }

        public static int g(int r2, int r3, int r4) {
                int r0 = android.view.View.MeasureSpec.getMode(r2)
                int r2 = android.view.View.MeasureSpec.getSize(r2)
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                if (r0 == r1) goto L15
                r1 = 1073741824(0x40000000, float:2.0)
                if (r0 == r1) goto L14
                int r2 = java.lang.Math.max(r3, r4)
            L14:
                return r2
            L15:
                int r3 = java.lang.Math.max(r3, r4)
                int r2 = java.lang.Math.min(r2, r3)
                return r2
        }

        public static int w(boolean r4, int r5, int r6, int r7, int r8) {
                int r5 = r5 - r7
                r7 = 0
                int r5 = java.lang.Math.max(r7, r5)
                r0 = -2
                r1 = -1
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = 1073741824(0x40000000, float:2.0)
                if (r4 == 0) goto L1d
                if (r8 < 0) goto L12
            L10:
                r6 = r3
                goto L30
            L12:
                if (r8 != r1) goto L1a
                if (r6 == r2) goto L22
                if (r6 == 0) goto L1a
                if (r6 == r3) goto L22
            L1a:
                r6 = r7
                r8 = r6
                goto L30
            L1d:
                if (r8 < 0) goto L20
                goto L10
            L20:
                if (r8 != r1) goto L24
            L22:
                r8 = r5
                goto L30
            L24:
                if (r8 != r0) goto L1a
                if (r6 == r2) goto L2e
                if (r6 != r3) goto L2b
                goto L2e
            L2b:
                r8 = r5
                r6 = r7
                goto L30
            L2e:
                r8 = r5
                r6 = r2
            L30:
                int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r6)
                return r4
        }

        public static int z(android.view.View r2) {
                android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
                androidx.recyclerview.widget.RecyclerView$m r0 = (androidx.recyclerview.widget.RecyclerView.m) r0
                android.graphics.Rect r0 = r0.b
                int r2 = r2.getMeasuredHeight()
                int r1 = r0.top
                int r2 = r2 + r1
                int r0 = r0.bottom
                int r2 = r2 + r0
                return r2
        }

        @android.annotation.SuppressLint({"UnknownNullness"})
        public final void A0(androidx.recyclerview.widget.o r4) {
                r3 = this;
                androidx.recyclerview.widget.o r0 = r3.e
                if (r0 == 0) goto Ld
                if (r4 == r0) goto Ld
                boolean r1 = r0.e
                if (r1 == 0) goto Ld
                r0.d()
            Ld:
                r3.e = r4
                androidx.recyclerview.widget.RecyclerView r0 = r3.b
                androidx.recyclerview.widget.RecyclerView$z r1 = r0.c0
                androidx.recyclerview.widget.RecyclerView r2 = r1.g
                r2.removeCallbacks(r1)
                android.widget.OverScroller r1 = r1.c
                r1.abortAnimation()
                boolean r1 = r4.h
                if (r1 == 0) goto L51
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "An instance of "
                r1.<init>(r2)
                java.lang.Class r2 = r4.getClass()
                java.lang.String r2 = r2.getSimpleName()
                r1.append(r2)
                java.lang.String r2 = " was started more than once. Each instance of"
                r1.append(r2)
                java.lang.Class r2 = r4.getClass()
                java.lang.String r2 = r2.getSimpleName()
                r1.append(r2)
                java.lang.String r2 = " is intended to only be used once. You should create a new instance for each use."
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.lang.String r2 = "RecyclerView"
                android.util.Log.w(r2, r1)
            L51:
                r4.b = r0
                r4.c = r3
                int r1 = r4.f980a
                r2 = -1
                if (r1 == r2) goto L75
                androidx.recyclerview.widget.RecyclerView$w r2 = r0.f0
                r2.f982a = r1
                r2 = 1
                r4.e = r2
                r4.d = r2
                androidx.recyclerview.widget.RecyclerView$l r0 = r0.m
                android.view.View r0 = r0.q(r1)
                r4.f = r0
                androidx.recyclerview.widget.RecyclerView r0 = r4.b
                androidx.recyclerview.widget.RecyclerView$z r0 = r0.c0
                r0.b()
                r4.h = r2
                return
            L75:
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Invalid target position"
                r4.<init>(r0)
                throw r4
        }

        public final int B() {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r1.b
                if (r0 == 0) goto L9
                androidx.recyclerview.widget.RecyclerView$d r0 = r0.getAdapter()
                goto La
            L9:
                r0 = 0
            La:
                if (r0 == 0) goto L11
                int r0 = r0.a()
                return r0
            L11:
                r0 = 0
                return r0
        }

        public boolean B0() {
                r1 = this;
                r0 = 0
                return r0
        }

        public final int C() {
                r2 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r2.b
                java.util.WeakHashMap<android.view.View, a.Jg> r1 = a.C0414ug.f721a
                int r0 = r0.getLayoutDirection()
                return r0
        }

        public final int D() {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r1.b
                if (r0 == 0) goto L9
                int r0 = r0.getPaddingBottom()
                return r0
            L9:
                r0 = 0
                return r0
        }

        public final int E() {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r1.b
                if (r0 == 0) goto L9
                int r0 = r0.getPaddingLeft()
                return r0
            L9:
                r0 = 0
                return r0
        }

        public final int F() {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r1.b
                if (r0 == 0) goto L9
                int r0 = r0.getPaddingRight()
                return r0
            L9:
                r0 = 0
                return r0
        }

        public final int G() {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r1.b
                if (r0 == 0) goto L9
                int r0 = r0.getPaddingTop()
                return r0
            L9:
                r0 = 0
                return r0
        }

        public int J(androidx.recyclerview.widget.RecyclerView.r r1, androidx.recyclerview.widget.RecyclerView.w r2) {
                r0 = this;
                r1 = -1
                return r1
        }

        public final void K(android.view.View r7, android.graphics.Rect r8) {
                r6 = this;
                android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
                androidx.recyclerview.widget.RecyclerView$m r0 = (androidx.recyclerview.widget.RecyclerView.m) r0
                android.graphics.Rect r0 = r0.b
                int r1 = r0.left
                int r1 = -r1
                int r2 = r0.top
                int r2 = -r2
                int r3 = r7.getWidth()
                int r4 = r0.right
                int r3 = r3 + r4
                int r4 = r7.getHeight()
                int r0 = r0.bottom
                int r4 = r4 + r0
                r8.set(r1, r2, r3, r4)
                androidx.recyclerview.widget.RecyclerView r0 = r6.b
                if (r0 == 0) goto L5c
                android.graphics.Matrix r0 = r7.getMatrix()
                if (r0 == 0) goto L5c
                boolean r1 = r0.isIdentity()
                if (r1 != 0) goto L5c
                androidx.recyclerview.widget.RecyclerView r1 = r6.b
                android.graphics.RectF r1 = r1.k
                r1.set(r8)
                r0.mapRect(r1)
                float r0 = r1.left
                double r2 = (double) r0
                double r2 = java.lang.Math.floor(r2)
                int r0 = (int) r2
                float r2 = r1.top
                double r2 = (double) r2
                double r2 = java.lang.Math.floor(r2)
                int r2 = (int) r2
                float r3 = r1.right
                double r3 = (double) r3
                double r3 = java.lang.Math.ceil(r3)
                int r3 = (int) r3
                float r1 = r1.bottom
                double r4 = (double) r1
                double r4 = java.lang.Math.ceil(r4)
                int r1 = (int) r4
                r8.set(r0, r2, r3, r1)
            L5c:
                int r0 = r7.getLeft()
                int r7 = r7.getTop()
                r8.offset(r0, r7)
                return
        }

        public boolean L() {
                r1 = this;
                r0 = 0
                return r0
        }

        public void O(int r5) {
                r4 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r4.b
                if (r0 == 0) goto L19
                androidx.recyclerview.widget.b r1 = r0.f
                int r1 = r1.e()
                r2 = 0
            Lb:
                if (r2 >= r1) goto L19
                androidx.recyclerview.widget.b r3 = r0.f
                android.view.View r3 = r3.d(r2)
                r3.offsetLeftAndRight(r5)
                int r2 = r2 + 1
                goto Lb
            L19:
                return
        }

        public void P(int r5) {
                r4 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r4.b
                if (r0 == 0) goto L19
                androidx.recyclerview.widget.b r1 = r0.f
                int r1 = r1.e()
                r2 = 0
            Lb:
                if (r2 >= r1) goto L19
                androidx.recyclerview.widget.b r3 = r0.f
                android.view.View r3 = r3.d(r2)
                r3.offsetTopAndBottom(r5)
                int r2 = r2 + 1
                goto Lb
            L19:
                return
        }

        public void Q() {
                r0 = this;
                return
        }

        public void R(androidx.recyclerview.widget.RecyclerView r1) {
                r0 = this;
                return
        }

        @android.annotation.SuppressLint({"UnknownNullness"})
        public void S(androidx.recyclerview.widget.RecyclerView r1) {
                r0 = this;
                return
        }

        public android.view.View T(android.view.View r1, int r2, androidx.recyclerview.widget.RecyclerView.r r3, androidx.recyclerview.widget.RecyclerView.w r4) {
                r0 = this;
                r1 = 0
                return r1
        }

        public void U(android.view.accessibility.AccessibilityEvent r4) {
                r3 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r3.b
                androidx.recyclerview.widget.RecyclerView$r r1 = r0.c
                if (r4 != 0) goto L7
                goto L39
            L7:
                r1 = 1
                boolean r0 = r0.canScrollVertically(r1)
                if (r0 != 0) goto L29
                androidx.recyclerview.widget.RecyclerView r0 = r3.b
                r2 = -1
                boolean r0 = r0.canScrollVertically(r2)
                if (r0 != 0) goto L29
                androidx.recyclerview.widget.RecyclerView r0 = r3.b
                boolean r0 = r0.canScrollHorizontally(r2)
                if (r0 != 0) goto L29
                androidx.recyclerview.widget.RecyclerView r0 = r3.b
                boolean r0 = r0.canScrollHorizontally(r1)
                if (r0 == 0) goto L28
                goto L29
            L28:
                r1 = 0
            L29:
                r4.setScrollable(r1)
                androidx.recyclerview.widget.RecyclerView r0 = r3.b
                androidx.recyclerview.widget.RecyclerView$d r0 = r0.l
                if (r0 == 0) goto L39
                int r0 = r0.a()
                r4.setItemCount(r0)
            L39:
                return
        }

        public void V(androidx.recyclerview.widget.RecyclerView.r r4, androidx.recyclerview.widget.RecyclerView.w r5, a.I r6) {
                r3 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r3.b
                r1 = -1
                boolean r0 = r0.canScrollVertically(r1)
                r2 = 1
                if (r0 != 0) goto L12
                androidx.recyclerview.widget.RecyclerView r0 = r3.b
                boolean r0 = r0.canScrollHorizontally(r1)
                if (r0 == 0) goto L1a
            L12:
                r0 = 8192(0x2000, float:1.148E-41)
                r6.a(r0)
                r6.i(r2)
            L1a:
                androidx.recyclerview.widget.RecyclerView r0 = r3.b
                boolean r0 = r0.canScrollVertically(r2)
                if (r0 != 0) goto L2a
                androidx.recyclerview.widget.RecyclerView r0 = r3.b
                boolean r0 = r0.canScrollHorizontally(r2)
                if (r0 == 0) goto L32
            L2a:
                r0 = 4096(0x1000, float:5.74E-42)
                r6.a(r0)
                r6.i(r2)
            L32:
                int r0 = r3.J(r4, r5)
                int r4 = r3.x(r4, r5)
                r5 = 0
                android.view.accessibility.AccessibilityNodeInfo$CollectionInfo r4 = android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.obtain(r0, r4, r5, r5)
                android.view.accessibility.AccessibilityNodeInfo r5 = r6.f118a
                r5.setCollectionInfo(r4)
                return
        }

        public final void W(android.view.View r3, a.I r4) {
                r2 = this;
                androidx.recyclerview.widget.RecyclerView$A r0 = androidx.recyclerview.widget.RecyclerView.L(r3)
                if (r0 == 0) goto L21
                boolean r1 = r0.h()
                if (r1 != 0) goto L21
                androidx.recyclerview.widget.b r1 = r2.f971a
                java.util.ArrayList r1 = r1.c
                android.view.View r0 = r0.f963a
                boolean r0 = r1.contains(r0)
                if (r0 != 0) goto L21
                androidx.recyclerview.widget.RecyclerView r0 = r2.b
                androidx.recyclerview.widget.RecyclerView$r r1 = r0.c
                androidx.recyclerview.widget.RecyclerView$w r0 = r0.f0
                r2.X(r1, r0, r3, r4)
            L21:
                return
        }

        public void X(androidx.recyclerview.widget.RecyclerView.r r1, androidx.recyclerview.widget.RecyclerView.w r2, android.view.View r3, a.I r4) {
                r0 = this;
                return
        }

        public void Y(int r1, int r2) {
                r0 = this;
                return
        }

        public void Z() {
                r0 = this;
                return
        }

        public void a0(int r1, int r2) {
                r0 = this;
                return
        }

        public final void b(android.view.View r10, int r11, boolean r12) {
                r9 = this;
                androidx.recyclerview.widget.RecyclerView$A r0 = androidx.recyclerview.widget.RecyclerView.L(r10)
                r1 = 0
                r2 = 1
                if (r12 != 0) goto L17
                boolean r12 = r0.h()
                if (r12 == 0) goto Lf
                goto L17
            Lf:
                androidx.recyclerview.widget.RecyclerView r12 = r9.b
                androidx.recyclerview.widget.C r12 = r12.g
                r12.c(r0)
                goto L31
            L17:
                androidx.recyclerview.widget.RecyclerView r12 = r9.b
                androidx.recyclerview.widget.C r12 = r12.g
                a.ge<androidx.recyclerview.widget.RecyclerView$A, androidx.recyclerview.widget.C$a> r12 = r12.f955a
                java.lang.Object r3 = r12.getOrDefault(r0, r1)
                androidx.recyclerview.widget.C$a r3 = (androidx.recyclerview.widget.C.a) r3
                if (r3 != 0) goto L2c
                androidx.recyclerview.widget.C$a r3 = androidx.recyclerview.widget.C.a.a()
                r12.put(r0, r3)
            L2c:
                int r12 = r3.f956a
                r12 = r12 | r2
                r3.f956a = r12
            L31:
                android.view.ViewGroup$LayoutParams r12 = r10.getLayoutParams()
                androidx.recyclerview.widget.RecyclerView$m r12 = (androidx.recyclerview.widget.RecyclerView.m) r12
                boolean r3 = r0.p()
                java.lang.String r4 = "RecyclerView"
                r5 = 0
                if (r3 != 0) goto L12f
                boolean r3 = r0.i()
                if (r3 == 0) goto L48
                goto L12f
            L48:
                android.view.ViewParent r3 = r10.getParent()
                androidx.recyclerview.widget.RecyclerView r6 = r9.b
                r7 = -1
                if (r3 != r6) goto L101
                androidx.recyclerview.widget.b r3 = r9.f971a
                androidx.recyclerview.widget.v r6 = r3.f992a
                androidx.recyclerview.widget.RecyclerView r6 = r6.f1015a
                int r6 = r6.indexOfChild(r10)
                if (r6 != r7) goto L5e
                goto L66
            L5e:
                androidx.recyclerview.widget.b$a r3 = r3.b
                boolean r8 = r3.d(r6)
                if (r8 == 0) goto L68
            L66:
                r6 = r7
                goto L6d
            L68:
                int r3 = r3.b(r6)
                int r6 = r6 - r3
            L6d:
                if (r11 != r7) goto L75
                androidx.recyclerview.widget.b r11 = r9.f971a
                int r11 = r11.e()
            L75:
                if (r6 == r7) goto Le5
                if (r6 == r11) goto L14a
                androidx.recyclerview.widget.RecyclerView r10 = r9.b
                androidx.recyclerview.widget.RecyclerView$l r10 = r10.m
                android.view.View r3 = r10.u(r6)
                if (r3 == 0) goto Lc8
                r10.u(r6)
                androidx.recyclerview.widget.b r7 = r10.f971a
                r7.c(r6)
                android.view.ViewGroup$LayoutParams r6 = r3.getLayoutParams()
                androidx.recyclerview.widget.RecyclerView$m r6 = (androidx.recyclerview.widget.RecyclerView.m) r6
                androidx.recyclerview.widget.RecyclerView$A r7 = androidx.recyclerview.widget.RecyclerView.L(r3)
                boolean r8 = r7.h()
                if (r8 == 0) goto Lb6
                androidx.recyclerview.widget.RecyclerView r8 = r10.b
                androidx.recyclerview.widget.C r8 = r8.g
                a.ge<androidx.recyclerview.widget.RecyclerView$A, androidx.recyclerview.widget.C$a> r8 = r8.f955a
                java.lang.Object r1 = r8.getOrDefault(r7, r1)
                androidx.recyclerview.widget.C$a r1 = (androidx.recyclerview.widget.C.a) r1
                if (r1 != 0) goto Lb0
                androidx.recyclerview.widget.C$a r1 = androidx.recyclerview.widget.C.a.a()
                r8.put(r7, r1)
            Lb0:
                int r8 = r1.f956a
                r2 = r2 | r8
                r1.f956a = r2
                goto Lbd
            Lb6:
                androidx.recyclerview.widget.RecyclerView r1 = r10.b
                androidx.recyclerview.widget.C r1 = r1.g
                r1.c(r7)
            Lbd:
                androidx.recyclerview.widget.b r10 = r10.f971a
                boolean r1 = r7.h()
                r10.b(r3, r11, r6, r1)
                goto L14a
            Lc8:
                java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                java.lang.String r0 = "Cannot move a child from non-existing index:"
                r12.<init>(r0)
                r12.append(r6)
                androidx.recyclerview.widget.RecyclerView r10 = r10.b
                java.lang.String r10 = r10.toString()
                r12.append(r10)
                java.lang.String r10 = r12.toString()
                r11.<init>(r10)
                throw r11
            Le5:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                java.lang.String r0 = "Added View has RecyclerView as parent but view is not a real child. Unfiltered index:"
                r12.<init>(r0)
                androidx.recyclerview.widget.RecyclerView r0 = r9.b
                int r10 = r0.indexOfChild(r10)
                r12.append(r10)
                androidx.recyclerview.widget.RecyclerView r10 = r9.b
                java.lang.String r10 = a.C0487z.d(r10, r12)
                r11.<init>(r10)
                throw r11
            L101:
                androidx.recyclerview.widget.b r1 = r9.f971a
                r1.a(r10, r11, r5)
                r12.c = r2
                androidx.recyclerview.widget.o r11 = r9.e
                if (r11 == 0) goto L14a
                boolean r1 = r11.e
                if (r1 == 0) goto L14a
                androidx.recyclerview.widget.RecyclerView r1 = r11.b
                r1.getClass()
                androidx.recyclerview.widget.RecyclerView$A r1 = androidx.recyclerview.widget.RecyclerView.L(r10)
                if (r1 == 0) goto L11f
                int r7 = r1.b()
            L11f:
                int r1 = r11.f980a
                if (r7 != r1) goto L14a
                r11.f = r10
                boolean r10 = androidx.recyclerview.widget.RecyclerView.z0
                if (r10 == 0) goto L14a
                java.lang.String r10 = "smooth scroll target view has been attached"
                android.util.Log.d(r4, r10)
                goto L14a
            L12f:
                boolean r1 = r0.i()
                if (r1 == 0) goto L13b
                androidx.recyclerview.widget.RecyclerView$r r1 = r0.n
                r1.l(r0)
                goto L141
            L13b:
                int r1 = r0.j
                r1 = r1 & (-33)
                r0.j = r1
            L141:
                androidx.recyclerview.widget.b r1 = r9.f971a
                android.view.ViewGroup$LayoutParams r2 = r10.getLayoutParams()
                r1.b(r10, r11, r2, r5)
            L14a:
                boolean r10 = r12.d
                if (r10 == 0) goto L16c
                boolean r10 = androidx.recyclerview.widget.RecyclerView.z0
                if (r10 == 0) goto L165
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                java.lang.String r11 = "consuming pending invalidate on child "
                r10.<init>(r11)
                androidx.recyclerview.widget.RecyclerView$A r11 = r12.f975a
                r10.append(r11)
                java.lang.String r10 = r10.toString()
                android.util.Log.d(r4, r10)
            L165:
                android.view.View r10 = r0.f963a
                r10.invalidate()
                r12.d = r5
            L16c:
                return
        }

        public void b0(int r1, int r2) {
                r0 = this;
                return
        }

        @android.annotation.SuppressLint({"UnknownNullness"})
        public void c(java.lang.String r2) {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r1.b
                if (r0 == 0) goto L7
                r0.k(r2)
            L7:
                return
        }

        public void c0(int r1, int r2) {
                r0 = this;
                return
        }

        public boolean d() {
                r1 = this;
                r0 = 0
                return r0
        }

        @android.annotation.SuppressLint({"UnknownNullness"})
        public void d0(androidx.recyclerview.widget.RecyclerView.r r1, androidx.recyclerview.widget.RecyclerView.w r2) {
                r0 = this;
                java.lang.String r1 = "RecyclerView"
                java.lang.String r2 = "You must override onLayoutChildren(Recycler recycler, State state) "
                android.util.Log.e(r1, r2)
                return
        }

        public boolean e() {
                r1 = this;
                r0 = 0
                return r0
        }

        @android.annotation.SuppressLint({"UnknownNullness"})
        public void e0(androidx.recyclerview.widget.RecyclerView.w r1) {
                r0 = this;
                return
        }

        public boolean f(androidx.recyclerview.widget.RecyclerView.m r1) {
                r0 = this;
                if (r1 == 0) goto L4
                r1 = 1
                return r1
            L4:
                r1 = 0
                return r1
        }

        @android.annotation.SuppressLint({"UnknownNullness"})
        public void f0(android.os.Parcelable r1) {
                r0 = this;
                return
        }

        public android.os.Parcelable g0() {
                r1 = this;
                r0 = 0
                return r0
        }

        @android.annotation.SuppressLint({"UnknownNullness"})
        public void h(int r1, int r2, androidx.recyclerview.widget.RecyclerView.w r3, androidx.recyclerview.widget.m.b r4) {
                r0 = this;
                return
        }

        public void h0(int r1) {
                r0 = this;
                return
        }

        @android.annotation.SuppressLint({"UnknownNullness"})
        public void i(int r1, androidx.recyclerview.widget.m.b r2) {
                r0 = this;
                return
        }

        public final void i0(androidx.recyclerview.widget.RecyclerView.r r3) {
                r2 = this;
                int r0 = r2.v()
                int r0 = r0 + (-1)
            L6:
                if (r0 < 0) goto L23
                android.view.View r1 = r2.u(r0)
                androidx.recyclerview.widget.RecyclerView$A r1 = androidx.recyclerview.widget.RecyclerView.L(r1)
                boolean r1 = r1.o()
                if (r1 != 0) goto L20
                android.view.View r1 = r2.u(r0)
                r2.l0(r0)
                r3.h(r1)
            L20:
                int r0 = r0 + (-1)
                goto L6
            L23:
                return
        }

        public int j(androidx.recyclerview.widget.RecyclerView.w r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        public final void j0(androidx.recyclerview.widget.RecyclerView.r r7) {
                r6 = this;
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$A> r0 = r7.f978a
                int r0 = r0.size()
                int r1 = r0 + (-1)
            L8:
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$A> r2 = r7.f978a
                if (r1 < 0) goto L50
                java.lang.Object r2 = r2.get(r1)
                androidx.recyclerview.widget.RecyclerView$A r2 = (androidx.recyclerview.widget.RecyclerView.A) r2
                android.view.View r2 = r2.f963a
                androidx.recyclerview.widget.RecyclerView$A r3 = androidx.recyclerview.widget.RecyclerView.L(r2)
                boolean r4 = r3.o()
                if (r4 == 0) goto L1f
                goto L4d
            L1f:
                r4 = 0
                r3.n(r4)
                boolean r5 = r3.j()
                if (r5 == 0) goto L2e
                androidx.recyclerview.widget.RecyclerView r5 = r6.b
                r5.removeDetachedView(r2, r4)
            L2e:
                androidx.recyclerview.widget.RecyclerView r5 = r6.b
                androidx.recyclerview.widget.RecyclerView$i r5 = r5.K
                if (r5 == 0) goto L37
                r5.d(r3)
            L37:
                r5 = 1
                r3.n(r5)
                androidx.recyclerview.widget.RecyclerView$A r2 = androidx.recyclerview.widget.RecyclerView.L(r2)
                r3 = 0
                r2.n = r3
                r2.o = r4
                int r3 = r2.j
                r3 = r3 & (-33)
                r2.j = r3
                r7.i(r2)
            L4d:
                int r1 = r1 + (-1)
                goto L8
            L50:
                r2.clear()
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$A> r7 = r7.b
                if (r7 == 0) goto L5a
                r7.clear()
            L5a:
                if (r0 <= 0) goto L61
                androidx.recyclerview.widget.RecyclerView r7 = r6.b
                r7.invalidate()
            L61:
                return
        }

        public int k(androidx.recyclerview.widget.RecyclerView.w r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        public final void k0(android.view.View r7, androidx.recyclerview.widget.RecyclerView.r r8) {
                r6 = this;
                androidx.recyclerview.widget.b r0 = r6.f971a
                androidx.recyclerview.widget.v r1 = r0.f992a
                int r2 = r0.d
                r3 = 1
                if (r2 == r3) goto L42
                r4 = 2
                if (r2 == r4) goto L3a
                r2 = 0
                r4 = 0
                r0.d = r3     // Catch: java.lang.Throwable -> L2b
                r0.e = r7     // Catch: java.lang.Throwable -> L2b
                androidx.recyclerview.widget.RecyclerView r3 = r1.f1015a     // Catch: java.lang.Throwable -> L2b
                int r3 = r3.indexOfChild(r7)     // Catch: java.lang.Throwable -> L2b
                if (r3 >= 0) goto L1f
            L1a:
                r0.d = r4
                r0.e = r2
                goto L31
            L1f:
                androidx.recyclerview.widget.b$a r5 = r0.b     // Catch: java.lang.Throwable -> L2b
                boolean r5 = r5.f(r3)     // Catch: java.lang.Throwable -> L2b
                if (r5 == 0) goto L2d
                r0.j(r7)     // Catch: java.lang.Throwable -> L2b
                goto L2d
            L2b:
                r7 = move-exception
                goto L35
            L2d:
                r1.a(r3)     // Catch: java.lang.Throwable -> L2b
                goto L1a
            L31:
                r8.h(r7)
                return
            L35:
                r0.d = r4
                r0.e = r2
                throw r7
            L3a:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "Cannot call removeView(At) within removeViewIfHidden"
                r7.<init>(r8)
                throw r7
            L42:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "Cannot call removeView(At) within removeView(At)"
                r7.<init>(r8)
                throw r7
        }

        public int l(androidx.recyclerview.widget.RecyclerView.w r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        public final void l0(int r7) {
                r6 = this;
                android.view.View r0 = r6.u(r7)
                if (r0 == 0) goto L50
                androidx.recyclerview.widget.b r0 = r6.f971a
                androidx.recyclerview.widget.v r1 = r0.f992a
                int r2 = r0.d
                r3 = 1
                if (r2 == r3) goto L48
                r4 = 2
                if (r2 == r4) goto L40
                r2 = 0
                r4 = 0
                int r7 = r0.f(r7)     // Catch: java.lang.Throwable -> L35
                androidx.recyclerview.widget.RecyclerView r5 = r1.f1015a     // Catch: java.lang.Throwable -> L35
                android.view.View r5 = r5.getChildAt(r7)     // Catch: java.lang.Throwable -> L35
                if (r5 != 0) goto L25
            L20:
                r0.d = r4
                r0.e = r2
                return
            L25:
                r0.d = r3     // Catch: java.lang.Throwable -> L35
                r0.e = r5     // Catch: java.lang.Throwable -> L35
                androidx.recyclerview.widget.b$a r3 = r0.b     // Catch: java.lang.Throwable -> L35
                boolean r3 = r3.f(r7)     // Catch: java.lang.Throwable -> L35
                if (r3 == 0) goto L37
                r0.j(r5)     // Catch: java.lang.Throwable -> L35
                goto L37
            L35:
                r7 = move-exception
                goto L3b
            L37:
                r1.a(r7)     // Catch: java.lang.Throwable -> L35
                goto L20
            L3b:
                r0.d = r4
                r0.e = r2
                throw r7
            L40:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "Cannot call removeView(At) within removeViewIfHidden"
                r7.<init>(r0)
                throw r7
            L48:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "Cannot call removeView(At) within removeView(At)"
                r7.<init>(r0)
                throw r7
            L50:
                return
        }

        public int m(androidx.recyclerview.widget.RecyclerView.w r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        public boolean m0(androidx.recyclerview.widget.RecyclerView r9, android.view.View r10, android.graphics.Rect r11, boolean r12, boolean r13) {
                r8 = this;
                int r0 = r8.E()
                int r1 = r8.G()
                int r2 = r8.n
                int r3 = r8.F()
                int r2 = r2 - r3
                int r3 = r8.o
                int r4 = r8.D()
                int r3 = r3 - r4
                int r4 = r10.getLeft()
                int r5 = r11.left
                int r4 = r4 + r5
                int r5 = r10.getScrollX()
                int r4 = r4 - r5
                int r5 = r10.getTop()
                int r6 = r11.top
                int r5 = r5 + r6
                int r10 = r10.getScrollY()
                int r5 = r5 - r10
                int r10 = r11.width()
                int r10 = r10 + r4
                int r11 = r11.height()
                int r11 = r11 + r5
                int r4 = r4 - r0
                r0 = 0
                int r6 = java.lang.Math.min(r0, r4)
                int r5 = r5 - r1
                int r1 = java.lang.Math.min(r0, r5)
                int r10 = r10 - r2
                int r2 = java.lang.Math.max(r0, r10)
                int r11 = r11 - r3
                int r11 = java.lang.Math.max(r0, r11)
                int r3 = r8.C()
                r7 = 1
                if (r3 != r7) goto L5c
                if (r2 == 0) goto L57
                goto L64
            L57:
                int r2 = java.lang.Math.max(r6, r10)
                goto L64
            L5c:
                if (r6 == 0) goto L5f
                goto L63
            L5f:
                int r6 = java.lang.Math.min(r4, r2)
            L63:
                r2 = r6
            L64:
                if (r1 == 0) goto L67
                goto L6b
            L67:
                int r1 = java.lang.Math.min(r5, r11)
            L6b:
                int[] r10 = new int[]{r2, r1}
                r11 = r10[r0]
                r10 = r10[r7]
                if (r13 == 0) goto Lae
                android.view.View r13 = r9.getFocusedChild()
                if (r13 != 0) goto L7c
                goto Lb3
            L7c:
                int r1 = r8.E()
                int r2 = r8.G()
                int r3 = r8.n
                int r4 = r8.F()
                int r3 = r3 - r4
                int r4 = r8.o
                int r5 = r8.D()
                int r4 = r4 - r5
                androidx.recyclerview.widget.RecyclerView r5 = r8.b
                android.graphics.Rect r5 = r5.i
                r8.y(r13, r5)
                int r13 = r5.left
                int r13 = r13 - r11
                if (r13 >= r3) goto Lb3
                int r13 = r5.right
                int r13 = r13 - r11
                if (r13 <= r1) goto Lb3
                int r13 = r5.top
                int r13 = r13 - r10
                if (r13 >= r4) goto Lb3
                int r13 = r5.bottom
                int r13 = r13 - r10
                if (r13 > r2) goto Lae
                goto Lb3
            Lae:
                if (r11 != 0) goto Lb4
                if (r10 == 0) goto Lb3
                goto Lb4
            Lb3:
                return r0
            Lb4:
                if (r12 == 0) goto Lba
                r9.scrollBy(r11, r10)
                return r7
            Lba:
                r9.g0(r11, r10, r0)
                return r7
        }

        public int n(androidx.recyclerview.widget.RecyclerView.w r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        public final void n0() {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r1.b
                if (r0 == 0) goto L7
                r0.requestLayout()
            L7:
                return
        }

        public int o(androidx.recyclerview.widget.RecyclerView.w r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        @android.annotation.SuppressLint({"UnknownNullness"})
        public int o0(int r1, androidx.recyclerview.widget.RecyclerView.r r2, androidx.recyclerview.widget.RecyclerView.w r3) {
                r0 = this;
                r1 = 0
                return r1
        }

        public final void p(androidx.recyclerview.widget.RecyclerView.r r5) {
                r4 = this;
                int r0 = r4.v()
                int r0 = r0 + (-1)
            L6:
                if (r0 < 0) goto L5e
                android.view.View r1 = r4.u(r0)
                androidx.recyclerview.widget.RecyclerView$A r2 = androidx.recyclerview.widget.RecyclerView.L(r1)
                boolean r3 = r2.o()
                if (r3 == 0) goto L2e
                boolean r1 = androidx.recyclerview.widget.RecyclerView.z0
                if (r1 == 0) goto L5b
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r3 = "ignoring view "
                r1.<init>(r3)
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.lang.String r2 = "RecyclerView"
                android.util.Log.d(r2, r1)
                goto L5b
            L2e:
                boolean r3 = r2.f()
                if (r3 == 0) goto L49
                boolean r3 = r2.h()
                if (r3 != 0) goto L49
                androidx.recyclerview.widget.RecyclerView r3 = r4.b
                androidx.recyclerview.widget.RecyclerView$d r3 = r3.l
                boolean r3 = r3.b
                if (r3 != 0) goto L49
                r4.l0(r0)
                r5.i(r2)
                goto L5b
            L49:
                r4.u(r0)
                androidx.recyclerview.widget.b r3 = r4.f971a
                r3.c(r0)
                r5.j(r1)
                androidx.recyclerview.widget.RecyclerView r1 = r4.b
                androidx.recyclerview.widget.C r1 = r1.g
                r1.c(r2)
            L5b:
                int r0 = r0 + (-1)
                goto L6
            L5e:
                return
        }

        public void p0(int r2) {
                r1 = this;
                boolean r2 = androidx.recyclerview.widget.RecyclerView.z0
                if (r2 == 0) goto Lb
                java.lang.String r2 = "RecyclerView"
                java.lang.String r0 = "You MUST implement scrollToPosition. It will soon become abstract"
                android.util.Log.e(r2, r0)
            Lb:
                return
        }

        public android.view.View q(int r6) {
                r5 = this;
                int r0 = r5.v()
                r1 = 0
            L5:
                if (r1 >= r0) goto L30
                android.view.View r2 = r5.u(r1)
                androidx.recyclerview.widget.RecyclerView$A r3 = androidx.recyclerview.widget.RecyclerView.L(r2)
                if (r3 != 0) goto L12
                goto L2d
            L12:
                int r4 = r3.b()
                if (r4 != r6) goto L2d
                boolean r4 = r3.o()
                if (r4 != 0) goto L2d
                androidx.recyclerview.widget.RecyclerView r4 = r5.b
                androidx.recyclerview.widget.RecyclerView$w r4 = r4.f0
                boolean r4 = r4.g
                if (r4 != 0) goto L2c
                boolean r3 = r3.h()
                if (r3 != 0) goto L2d
            L2c:
                return r2
            L2d:
                int r1 = r1 + 1
                goto L5
            L30:
                r6 = 0
                return r6
        }

        @android.annotation.SuppressLint({"UnknownNullness"})
        public int q0(int r1, androidx.recyclerview.widget.RecyclerView.r r2, androidx.recyclerview.widget.RecyclerView.w r3) {
                r0 = this;
                r1 = 0
                return r1
        }

        @android.annotation.SuppressLint({"UnknownNullness"})
        public abstract androidx.recyclerview.widget.RecyclerView.m r();

        public final void r0(androidx.recyclerview.widget.RecyclerView r3) {
                r2 = this;
                int r0 = r3.getWidth()
                r1 = 1073741824(0x40000000, float:2.0)
                int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
                int r3 = r3.getHeight()
                int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r1)
                r2.s0(r0, r3)
                return
        }

        @android.annotation.SuppressLint({"UnknownNullness"})
        public androidx.recyclerview.widget.RecyclerView.m s(android.content.Context r2, android.util.AttributeSet r3) {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView$m r0 = new androidx.recyclerview.widget.RecyclerView$m
                r0.<init>(r2, r3)
                return r0
        }

        public final void s0(int r2, int r3) {
                r1 = this;
                int r0 = android.view.View.MeasureSpec.getSize(r2)
                r1.n = r0
                int r2 = android.view.View.MeasureSpec.getMode(r2)
                r1.l = r2
                r0 = 0
                if (r2 != 0) goto L15
                boolean r2 = androidx.recyclerview.widget.RecyclerView.C0
                if (r2 != 0) goto L15
                r1.n = r0
            L15:
                int r2 = android.view.View.MeasureSpec.getSize(r3)
                r1.o = r2
                int r2 = android.view.View.MeasureSpec.getMode(r3)
                r1.m = r2
                if (r2 != 0) goto L29
                boolean r2 = androidx.recyclerview.widget.RecyclerView.C0
                if (r2 != 0) goto L29
                r1.o = r0
            L29:
                return
        }

        @android.annotation.SuppressLint({"UnknownNullness"})
        public androidx.recyclerview.widget.RecyclerView.m t(android.view.ViewGroup.LayoutParams r2) {
                r1 = this;
                boolean r0 = r2 instanceof androidx.recyclerview.widget.RecyclerView.m
                if (r0 == 0) goto Lc
                androidx.recyclerview.widget.RecyclerView$m r0 = new androidx.recyclerview.widget.RecyclerView$m
                androidx.recyclerview.widget.RecyclerView$m r2 = (androidx.recyclerview.widget.RecyclerView.m) r2
                r0.<init>(r2)
                return r0
            Lc:
                boolean r0 = r2 instanceof android.view.ViewGroup.MarginLayoutParams
                if (r0 == 0) goto L18
                androidx.recyclerview.widget.RecyclerView$m r0 = new androidx.recyclerview.widget.RecyclerView$m
                android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
                r0.<init>(r2)
                return r0
            L18:
                androidx.recyclerview.widget.RecyclerView$m r0 = new androidx.recyclerview.widget.RecyclerView$m
                r0.<init>(r2)
                return r0
        }

        public void t0(android.graphics.Rect r4, int r5, int r6) {
                r3 = this;
                int r0 = r4.width()
                int r1 = r3.E()
                int r1 = r1 + r0
                int r0 = r3.F()
                int r0 = r0 + r1
                int r4 = r4.height()
                int r1 = r3.G()
                int r1 = r1 + r4
                int r4 = r3.D()
                int r4 = r4 + r1
                androidx.recyclerview.widget.RecyclerView r1 = r3.b
                java.util.WeakHashMap<android.view.View, a.Jg> r2 = a.C0414ug.f721a
                int r1 = r1.getMinimumWidth()
                int r5 = g(r5, r0, r1)
                androidx.recyclerview.widget.RecyclerView r0 = r3.b
                int r0 = r0.getMinimumHeight()
                int r4 = g(r6, r4, r0)
                androidx.recyclerview.widget.RecyclerView r6 = r3.b
                androidx.recyclerview.widget.RecyclerView.g(r6, r5, r4)
                return
        }

        public final android.view.View u(int r2) {
                r1 = this;
                androidx.recyclerview.widget.b r0 = r1.f971a
                if (r0 == 0) goto L9
                android.view.View r2 = r0.d(r2)
                return r2
            L9:
                r2 = 0
                return r2
        }

        public final void u0(int r9, int r10) {
                r8 = this;
                int r0 = r8.v()
                if (r0 != 0) goto Lc
                androidx.recyclerview.widget.RecyclerView r0 = r8.b
                r0.q(r9, r10)
                return
            Lc:
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = 2147483647(0x7fffffff, float:NaN)
                r3 = 0
                r4 = r2
                r5 = r3
                r2 = r1
                r3 = r4
            L16:
                if (r5 >= r0) goto L3a
                android.view.View r6 = r8.u(r5)
                androidx.recyclerview.widget.RecyclerView r7 = r8.b
                android.graphics.Rect r7 = r7.i
                r8.y(r6, r7)
                int r6 = r7.left
                if (r6 >= r3) goto L28
                r3 = r6
            L28:
                int r6 = r7.right
                if (r6 <= r1) goto L2d
                r1 = r6
            L2d:
                int r6 = r7.top
                if (r6 >= r4) goto L32
                r4 = r6
            L32:
                int r6 = r7.bottom
                if (r6 <= r2) goto L37
                r2 = r6
            L37:
                int r5 = r5 + 1
                goto L16
            L3a:
                androidx.recyclerview.widget.RecyclerView r0 = r8.b
                android.graphics.Rect r0 = r0.i
                r0.set(r3, r4, r1, r2)
                androidx.recyclerview.widget.RecyclerView r0 = r8.b
                android.graphics.Rect r0 = r0.i
                r8.t0(r0, r9, r10)
                return
        }

        public final int v() {
                r1 = this;
                androidx.recyclerview.widget.b r0 = r1.f971a
                if (r0 == 0) goto L9
                int r0 = r0.e()
                return r0
            L9:
                r0 = 0
                return r0
        }

        public final void v0(androidx.recyclerview.widget.RecyclerView r2) {
                r1 = this;
                if (r2 != 0) goto Ld
                r2 = 0
                r1.b = r2
                r1.f971a = r2
                r2 = 0
                r1.n = r2
                r1.o = r2
                goto L1f
            Ld:
                r1.b = r2
                androidx.recyclerview.widget.b r0 = r2.f
                r1.f971a = r0
                int r0 = r2.getWidth()
                r1.n = r0
                int r2 = r2.getHeight()
                r1.o = r2
            L1f:
                r2 = 1073741824(0x40000000, float:2.0)
                r1.l = r2
                r1.m = r2
                return
        }

        public final boolean w0(android.view.View r3, int r4, int r5, androidx.recyclerview.widget.RecyclerView.m r6) {
                r2 = this;
                boolean r0 = r3.isLayoutRequested()
                if (r0 != 0) goto L25
                boolean r0 = r2.h
                if (r0 == 0) goto L25
                int r0 = r3.getWidth()
                int r1 = r6.width
                boolean r4 = M(r0, r4, r1)
                if (r4 == 0) goto L25
                int r3 = r3.getHeight()
                int r4 = r6.height
                boolean r3 = M(r3, r5, r4)
                if (r3 != 0) goto L23
                goto L25
            L23:
                r3 = 0
                return r3
            L25:
                r3 = 1
                return r3
        }

        public int x(androidx.recyclerview.widget.RecyclerView.r r1, androidx.recyclerview.widget.RecyclerView.w r2) {
                r0 = this;
                r1 = -1
                return r1
        }

        public boolean x0() {
                r1 = this;
                r0 = 0
                return r0
        }

        public void y(android.view.View r7, android.graphics.Rect r8) {
                r6 = this;
                boolean r0 = androidx.recyclerview.widget.RecyclerView.y0
                android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
                androidx.recyclerview.widget.RecyclerView$m r0 = (androidx.recyclerview.widget.RecyclerView.m) r0
                android.graphics.Rect r1 = r0.b
                int r2 = r7.getLeft()
                int r3 = r1.left
                int r2 = r2 - r3
                int r3 = r0.leftMargin
                int r2 = r2 - r3
                int r3 = r7.getTop()
                int r4 = r1.top
                int r3 = r3 - r4
                int r4 = r0.topMargin
                int r3 = r3 - r4
                int r4 = r7.getRight()
                int r5 = r1.right
                int r4 = r4 + r5
                int r5 = r0.rightMargin
                int r4 = r4 + r5
                int r7 = r7.getBottom()
                int r1 = r1.bottom
                int r7 = r7 + r1
                int r0 = r0.bottomMargin
                int r7 = r7 + r0
                r8.set(r2, r3, r4, r7)
                return
        }

        public final boolean y0(android.view.View r3, int r4, int r5, androidx.recyclerview.widget.RecyclerView.m r6) {
                r2 = this;
                boolean r0 = r2.h
                if (r0 == 0) goto L1f
                int r0 = r3.getMeasuredWidth()
                int r1 = r6.width
                boolean r4 = M(r0, r4, r1)
                if (r4 == 0) goto L1f
                int r3 = r3.getMeasuredHeight()
                int r4 = r6.height
                boolean r3 = M(r3, r5, r4)
                if (r3 != 0) goto L1d
                goto L1f
            L1d:
                r3 = 0
                return r3
            L1f:
                r3 = 1
                return r3
        }

        @android.annotation.SuppressLint({"UnknownNullness"})
        public void z0(androidx.recyclerview.widget.RecyclerView r1, int r2) {
                r0 = this;
                java.lang.String r1 = "RecyclerView"
                java.lang.String r2 = "You must override smoothScrollToPosition to support smooth scrolling"
                android.util.Log.e(r1, r2)
                return
        }
    }

    public static class m extends android.view.ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public androidx.recyclerview.widget.RecyclerView.A f975a;
        public final android.graphics.Rect b;
        public boolean c;
        public boolean d;

        public m(int r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                android.graphics.Rect r1 = new android.graphics.Rect
                r1.<init>()
                r0.b = r1
                r1 = 1
                r0.c = r1
                r1 = 0
                r0.d = r1
                return
        }

        public m(android.content.Context r1, android.util.AttributeSet r2) {
                r0 = this;
                r0.<init>(r1, r2)
                android.graphics.Rect r1 = new android.graphics.Rect
                r1.<init>()
                r0.b = r1
                r1 = 1
                r0.c = r1
                r1 = 0
                r0.d = r1
                return
        }

        public m(android.view.ViewGroup.LayoutParams r1) {
                r0 = this;
                r0.<init>(r1)
                android.graphics.Rect r1 = new android.graphics.Rect
                r1.<init>()
                r0.b = r1
                r1 = 1
                r0.c = r1
                r1 = 0
                r0.d = r1
                return
        }

        public m(android.view.ViewGroup.MarginLayoutParams r1) {
                r0 = this;
                r0.<init>(r1)
                android.graphics.Rect r1 = new android.graphics.Rect
                r1.<init>()
                r0.b = r1
                r1 = 1
                r0.c = r1
                r1 = 0
                r0.d = r1
                return
        }

        public m(androidx.recyclerview.widget.RecyclerView.m r1) {
                r0 = this;
                r0.<init>(r1)
                android.graphics.Rect r1 = new android.graphics.Rect
                r1.<init>()
                r0.b = r1
                r1 = 1
                r0.c = r1
                r1 = 0
                r0.d = r1
                return
        }
    }

    public static abstract class n {
    }

    public interface o {
        boolean a(android.view.MotionEvent r1);

        void b(android.view.MotionEvent r1);
    }

    public static abstract class p {
        public p() {
                r0 = this;
                r0.<init>()
                return
        }

        public void a(androidx.recyclerview.widget.RecyclerView r1, int r2) {
                r0 = this;
                return
        }

        public void b(androidx.recyclerview.widget.RecyclerView r1, int r2, int r3) {
                r0 = this;
                return
        }
    }

    public static class q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public android.util.SparseArray<androidx.recyclerview.widget.RecyclerView.q.a> f976a;
        public int b;
        public java.util.Set<androidx.recyclerview.widget.RecyclerView.d<?>> c;

        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final java.util.ArrayList<androidx.recyclerview.widget.RecyclerView.A> f977a;
            public final int b;
            public long c;
            public long d;

            public a() {
                    r2 = this;
                    r2.<init>()
                    java.util.ArrayList r0 = new java.util.ArrayList
                    r0.<init>()
                    r2.f977a = r0
                    r0 = 5
                    r2.b = r0
                    r0 = 0
                    r2.c = r0
                    r2.d = r0
                    return
            }
        }

        public final androidx.recyclerview.widget.RecyclerView.q.a a(int r3) {
                r2 = this;
                android.util.SparseArray<androidx.recyclerview.widget.RecyclerView$q$a> r0 = r2.f976a
                java.lang.Object r1 = r0.get(r3)
                androidx.recyclerview.widget.RecyclerView$q$a r1 = (androidx.recyclerview.widget.RecyclerView.q.a) r1
                if (r1 != 0) goto L12
                androidx.recyclerview.widget.RecyclerView$q$a r1 = new androidx.recyclerview.widget.RecyclerView$q$a
                r1.<init>()
                r0.put(r3, r1)
            L12:
                return r1
        }
    }

    public final class r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final java.util.ArrayList<androidx.recyclerview.widget.RecyclerView.A> f978a;
        public java.util.ArrayList<androidx.recyclerview.widget.RecyclerView.A> b;
        public final java.util.ArrayList<androidx.recyclerview.widget.RecyclerView.A> c;
        public final java.util.List<androidx.recyclerview.widget.RecyclerView.A> d;
        public int e;
        public int f;
        public androidx.recyclerview.widget.RecyclerView.q g;
        public final /* synthetic */ androidx.recyclerview.widget.RecyclerView h;

        public r(androidx.recyclerview.widget.RecyclerView r2) {
                r1 = this;
                r1.<init>()
                r1.h = r2
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                r1.f978a = r2
                r0 = 0
                r1.b = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.c = r0
                java.util.List r2 = java.util.Collections.unmodifiableList(r2)
                r1.d = r2
                r2 = 2
                r1.e = r2
                r1.f = r2
                return
        }

        public final void a(androidx.recyclerview.widget.RecyclerView.A r7, boolean r8) {
                r6 = this;
                androidx.recyclerview.widget.RecyclerView.l(r7)
                androidx.recyclerview.widget.RecyclerView r0 = r6.h
                androidx.recyclerview.widget.x r1 = r0.m0
                r2 = 0
                android.view.View r3 = r7.f963a
                if (r1 == 0) goto L1d
                androidx.recyclerview.widget.x$a r1 = r1.e
                if (r1 == 0) goto L19
                java.util.WeakHashMap r1 = r1.e
                java.lang.Object r1 = r1.remove(r3)
                a.C r1 = (a.C) r1
                goto L1a
            L19:
                r1 = r2
            L1a:
                a.C0414ug.j(r3, r1)
            L1d:
                if (r8 == 0) goto L5b
                androidx.recyclerview.widget.RecyclerView$s r8 = r0.n
                if (r8 == 0) goto L26
                r8.a()
            L26:
                java.util.ArrayList r8 = r0.o
                int r1 = r8.size()
                r4 = 0
            L2d:
                if (r4 >= r1) goto L3b
                java.lang.Object r5 = r8.get(r4)
                androidx.recyclerview.widget.RecyclerView$s r5 = (androidx.recyclerview.widget.RecyclerView.s) r5
                r5.a()
                int r4 = r4 + 1
                goto L2d
            L3b:
                androidx.recyclerview.widget.RecyclerView$w r8 = r0.f0
                if (r8 == 0) goto L44
                androidx.recyclerview.widget.C r8 = r0.g
                r8.d(r7)
            L44:
                boolean r8 = androidx.recyclerview.widget.RecyclerView.z0
                if (r8 == 0) goto L5b
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                java.lang.String r0 = "dispatchViewRecycled: "
                r8.<init>(r0)
                r8.append(r7)
                java.lang.String r8 = r8.toString()
                java.lang.String r0 = "RecyclerView"
                android.util.Log.d(r0, r8)
            L5b:
                r7.s = r2
                r7.r = r2
                androidx.recyclerview.widget.RecyclerView$q r8 = r6.c()
                r8.getClass()
                int r0 = r7.f
                androidx.recyclerview.widget.RecyclerView$q$a r1 = r8.a(r0)
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$A> r1 = r1.f977a
                android.util.SparseArray<androidx.recyclerview.widget.RecyclerView$q$a> r8 = r8.f976a
                java.lang.Object r8 = r8.get(r0)
                androidx.recyclerview.widget.RecyclerView$q$a r8 = (androidx.recyclerview.widget.RecyclerView.q.a) r8
                int r8 = r8.b
                int r0 = r1.size()
                if (r8 > r0) goto L82
                a.C0500zc.a(r3)
                return
            L82:
                boolean r8 = androidx.recyclerview.widget.RecyclerView.y0
                if (r8 == 0) goto L95
                boolean r8 = r1.contains(r7)
                if (r8 != 0) goto L8d
                goto L95
            L8d:
                java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
                java.lang.String r8 = "this scrap item already exists"
                r7.<init>(r8)
                throw r7
            L95:
                r7.m()
                r1.add(r7)
                return
        }

        public final int b(int r5) {
                r4 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r4.h
                if (r5 < 0) goto L1b
                androidx.recyclerview.widget.RecyclerView$w r1 = r0.f0
                int r1 = r1.b()
                if (r5 >= r1) goto L1b
                androidx.recyclerview.widget.RecyclerView$w r1 = r0.f0
                boolean r1 = r1.g
                if (r1 != 0) goto L13
                return r5
            L13:
                androidx.recyclerview.widget.a r0 = r0.e
                r1 = 0
                int r5 = r0.e(r5, r1)
                return r5
            L1b:
                java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r3 = "invalid position "
                r2.<init>(r3)
                r2.append(r5)
                java.lang.String r5 = ". State item count is "
                r2.append(r5)
                androidx.recyclerview.widget.RecyclerView$w r5 = r0.f0
                int r5 = r5.b()
                r2.append(r5)
                java.lang.String r5 = r0.B()
                r2.append(r5)
                java.lang.String r5 = r2.toString()
                r1.<init>(r5)
                throw r1
        }

        public final androidx.recyclerview.widget.RecyclerView.q c() {
                r2 = this;
                androidx.recyclerview.widget.RecyclerView$q r0 = r2.g
                if (r0 != 0) goto L23
                androidx.recyclerview.widget.RecyclerView$q r0 = new androidx.recyclerview.widget.RecyclerView$q
                r0.<init>()
                android.util.SparseArray r1 = new android.util.SparseArray
                r1.<init>()
                r0.f976a = r1
                r1 = 0
                r0.b = r1
                java.util.IdentityHashMap r1 = new java.util.IdentityHashMap
                r1.<init>()
                java.util.Set r1 = java.util.Collections.newSetFromMap(r1)
                r0.c = r1
                r2.g = r0
                r2.d()
            L23:
                androidx.recyclerview.widget.RecyclerView$q r0 = r2.g
                return r0
        }

        public final void d() {
                r3 = this;
                androidx.recyclerview.widget.RecyclerView$q r0 = r3.g
                if (r0 == 0) goto L13
                androidx.recyclerview.widget.RecyclerView r1 = r3.h
                androidx.recyclerview.widget.RecyclerView$d r2 = r1.l
                if (r2 == 0) goto L13
                boolean r1 = r1.s
                if (r1 == 0) goto L13
                java.util.Set<androidx.recyclerview.widget.RecyclerView$d<?>> r0 = r0.c
                r0.add(r2)
            L13:
                return
        }

        public final void e(androidx.recyclerview.widget.RecyclerView.d<?> r5, boolean r6) {
                r4 = this;
                androidx.recyclerview.widget.RecyclerView$q r0 = r4.g
                if (r0 == 0) goto L3f
                java.util.Set<androidx.recyclerview.widget.RecyclerView$d<?>> r1 = r0.c
                r1.remove(r5)
                int r5 = r1.size()
                if (r5 != 0) goto L3f
                if (r6 != 0) goto L3f
                r5 = 0
                r6 = r5
            L13:
                android.util.SparseArray<androidx.recyclerview.widget.RecyclerView$q$a> r1 = r0.f976a
                int r2 = r1.size()
                if (r6 >= r2) goto L3f
                int r2 = r1.keyAt(r6)
                java.lang.Object r1 = r1.get(r2)
                androidx.recyclerview.widget.RecyclerView$q$a r1 = (androidx.recyclerview.widget.RecyclerView.q.a) r1
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$A> r1 = r1.f977a
                r2 = r5
            L28:
                int r3 = r1.size()
                if (r2 >= r3) goto L3c
                java.lang.Object r3 = r1.get(r2)
                androidx.recyclerview.widget.RecyclerView$A r3 = (androidx.recyclerview.widget.RecyclerView.A) r3
                android.view.View r3 = r3.f963a
                a.C0500zc.a(r3)
                int r2 = r2 + 1
                goto L28
            L3c:
                int r6 = r6 + 1
                goto L13
            L3f:
                return
        }

        public final void f() {
                r3 = this;
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$A> r0 = r3.c
                int r1 = r0.size()
                int r1 = r1 + (-1)
            L8:
                if (r1 < 0) goto L10
                r3.g(r1)
                int r1 = r1 + (-1)
                goto L8
            L10:
                r0.clear()
                boolean r0 = androidx.recyclerview.widget.RecyclerView.D0
                if (r0 == 0) goto L26
                androidx.recyclerview.widget.RecyclerView r0 = r3.h
                androidx.recyclerview.widget.m$b r0 = r0.e0
                int[] r1 = r0.c
                if (r1 == 0) goto L23
                r2 = -1
                java.util.Arrays.fill(r1, r2)
            L23:
                r1 = 0
                r0.d = r1
            L26:
                return
        }

        public final void g(int r6) {
                r5 = this;
                boolean r0 = androidx.recyclerview.widget.RecyclerView.z0
                java.lang.String r1 = "RecyclerView"
                if (r0 == 0) goto L17
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r2 = "Recycling cached view at index "
                r0.<init>(r2)
                r0.append(r6)
                java.lang.String r0 = r0.toString()
                android.util.Log.d(r1, r0)
            L17:
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$A> r0 = r5.c
                java.lang.Object r2 = r0.get(r6)
                androidx.recyclerview.widget.RecyclerView$A r2 = (androidx.recyclerview.widget.RecyclerView.A) r2
                boolean r3 = androidx.recyclerview.widget.RecyclerView.z0
                if (r3 == 0) goto L34
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                java.lang.String r4 = "CachedViewHolder to be recycled: "
                r3.<init>(r4)
                r3.append(r2)
                java.lang.String r3 = r3.toString()
                android.util.Log.d(r1, r3)
            L34:
                r1 = 1
                r5.a(r2, r1)
                r0.remove(r6)
                return
        }

        public final void h(android.view.View r4) {
                r3 = this;
                androidx.recyclerview.widget.RecyclerView$A r0 = androidx.recyclerview.widget.RecyclerView.L(r4)
                boolean r1 = r0.j()
                androidx.recyclerview.widget.RecyclerView r2 = r3.h
                if (r1 == 0) goto L10
                r1 = 0
                r2.removeDetachedView(r4, r1)
            L10:
                boolean r4 = r0.i()
                if (r4 == 0) goto L1c
                androidx.recyclerview.widget.RecyclerView$r r4 = r0.n
                r4.l(r0)
                goto L28
            L1c:
                boolean r4 = r0.p()
                if (r4 == 0) goto L28
                int r4 = r0.j
                r4 = r4 & (-33)
                r0.j = r4
            L28:
                r3.i(r0)
                androidx.recyclerview.widget.RecyclerView$i r4 = r2.K
                if (r4 == 0) goto L3a
                boolean r4 = r0.g()
                if (r4 != 0) goto L3a
                androidx.recyclerview.widget.RecyclerView$i r4 = r2.K
                r4.d(r0)
            L3a:
                return
        }

        public final void i(androidx.recyclerview.widget.RecyclerView.A r13) {
                r12 = this;
                boolean r0 = r13.i()
                r1 = 0
                r2 = 1
                androidx.recyclerview.widget.RecyclerView r3 = r12.h
                android.view.View r4 = r13.f963a
                if (r0 != 0) goto L11c
                android.view.ViewParent r0 = r4.getParent()
                if (r0 == 0) goto L14
                goto L11c
            L14:
                boolean r0 = r13.j()
                if (r0 != 0) goto L108
                boolean r0 = r13.o()
                if (r0 != 0) goto Lf7
                int r0 = r13.j
                r0 = r0 & 16
                if (r0 != 0) goto L30
                java.util.WeakHashMap<android.view.View, a.Jg> r0 = a.C0414ug.f721a
                boolean r0 = r4.hasTransientState()
                if (r0 == 0) goto L30
                r0 = r2
                goto L31
            L30:
                r0 = r1
            L31:
                androidx.recyclerview.widget.RecyclerView$d r5 = r3.l
                boolean r5 = androidx.recyclerview.widget.RecyclerView.y0
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$A> r6 = r12.c
                if (r5 == 0) goto L54
                boolean r5 = r6.contains(r13)
                if (r5 != 0) goto L40
                goto L54
            L40:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "cached view received recycle internal? "
                r1.<init>(r2)
                r1.append(r13)
                java.lang.String r13 = a.C0487z.d(r3, r1)
                r0.<init>(r13)
                throw r0
            L54:
                boolean r5 = r13.g()
                if (r5 == 0) goto Lc7
                int r5 = r12.f
                if (r5 <= 0) goto Lbd
                int r5 = r13.j
                r5 = r5 & 526(0x20e, float:7.37E-43)
                if (r5 == 0) goto L65
                goto Lbd
            L65:
                int r5 = r6.size()
                int r7 = r12.f
                if (r5 < r7) goto L74
                if (r5 <= 0) goto L74
                r12.g(r1)
                int r5 = r5 + (-1)
            L74:
                boolean r7 = androidx.recyclerview.widget.RecyclerView.D0
                if (r7 == 0) goto Lb8
                if (r5 <= 0) goto Lb8
                androidx.recyclerview.widget.m$b r7 = r3.e0
                int r8 = r13.c
                int[] r9 = r7.c
                if (r9 == 0) goto L93
                int r9 = r7.d
                int r9 = r9 * 2
                r10 = r1
            L87:
                if (r10 >= r9) goto L93
                int[] r11 = r7.c
                r11 = r11[r10]
                if (r11 != r8) goto L90
                goto Lb8
            L90:
                int r10 = r10 + 2
                goto L87
            L93:
                int r5 = r5 - r2
            L94:
                if (r5 < 0) goto Lb7
                java.lang.Object r7 = r6.get(r5)
                androidx.recyclerview.widget.RecyclerView$A r7 = (androidx.recyclerview.widget.RecyclerView.A) r7
                int r7 = r7.c
                androidx.recyclerview.widget.m$b r8 = r3.e0
                int[] r9 = r8.c
                if (r9 == 0) goto Lb7
                int r9 = r8.d
                int r9 = r9 * 2
                r10 = r1
            La9:
                if (r10 >= r9) goto Lb7
                int[] r11 = r8.c
                r11 = r11[r10]
                if (r11 != r7) goto Lb4
                int r5 = r5 + (-1)
                goto L94
            Lb4:
                int r10 = r10 + 2
                goto La9
            Lb7:
                int r5 = r5 + r2
            Lb8:
                r6.add(r5, r13)
                r5 = r2
                goto Lbe
            Lbd:
                r5 = r1
            Lbe:
                if (r5 != 0) goto Lc5
                r12.a(r13, r2)
            Lc3:
                r1 = r5
                goto Le3
            Lc5:
                r2 = r1
                goto Lc3
            Lc7:
                boolean r2 = androidx.recyclerview.widget.RecyclerView.z0
                if (r2 == 0) goto Le2
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r5 = "trying to recycle a non-recycleable holder. Hopefully, it will re-visit here. We are still removing it from animation lists"
                r2.<init>(r5)
                java.lang.String r5 = r3.B()
                r2.append(r5)
                java.lang.String r2 = r2.toString()
                java.lang.String r5 = "RecyclerView"
                android.util.Log.d(r5, r2)
            Le2:
                r2 = r1
            Le3:
                androidx.recyclerview.widget.C r3 = r3.g
                r3.d(r13)
                if (r1 != 0) goto Lf6
                if (r2 != 0) goto Lf6
                if (r0 == 0) goto Lf6
                a.C0500zc.a(r4)
                r0 = 0
                r13.s = r0
                r13.r = r0
            Lf6:
                return
            Lf7:
                java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle."
                r0.<init>(r1)
                java.lang.String r0 = a.C0487z.d(r3, r0)
                r13.<init>(r0)
                throw r13
            L108:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "Tmp detached view should be removed from RecyclerView before it can be recycled: "
                r1.<init>(r2)
                r1.append(r13)
                java.lang.String r13 = a.C0487z.d(r3, r1)
                r0.<init>(r13)
                throw r0
            L11c:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                java.lang.String r6 = "Scrapped or attached views may not be recycled. isScrap:"
                r5.<init>(r6)
                boolean r13 = r13.i()
                r5.append(r13)
                java.lang.String r13 = " isAttached:"
                r5.append(r13)
                android.view.ViewParent r13 = r4.getParent()
                if (r13 == 0) goto L138
                r1 = r2
            L138:
                r5.append(r1)
                java.lang.String r13 = r3.B()
                r5.append(r13)
                java.lang.String r13 = r5.toString()
                r0.<init>(r13)
                throw r0
        }

        public final void j(android.view.View r6) {
                r5 = this;
                androidx.recyclerview.widget.RecyclerView$A r6 = androidx.recyclerview.widget.RecyclerView.L(r6)
                int r0 = r6.j
                r0 = r0 & 12
                r1 = 0
                r2 = 1
                if (r0 == 0) goto Le
                r0 = r2
                goto Lf
            Le:
                r0 = r1
            Lf:
                androidx.recyclerview.widget.RecyclerView r3 = r5.h
                if (r0 != 0) goto L49
                boolean r0 = r6.k()
                if (r0 == 0) goto L49
                androidx.recyclerview.widget.RecyclerView$i r0 = r3.K
                if (r0 == 0) goto L49
                java.util.List r4 = r6.c()
                androidx.recyclerview.widget.k r0 = (androidx.recyclerview.widget.k) r0
                boolean r4 = r4.isEmpty()
                if (r4 == 0) goto L49
                boolean r0 = r0.g
                if (r0 == 0) goto L49
                boolean r0 = r6.f()
                if (r0 == 0) goto L34
                goto L49
            L34:
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$A> r0 = r5.b
                if (r0 != 0) goto L3f
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r5.b = r0
            L3f:
                r6.n = r5
                r6.o = r2
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$A> r0 = r5.b
                r0.add(r6)
                return
            L49:
                boolean r0 = r6.f()
                if (r0 == 0) goto L6d
                boolean r0 = r6.h()
                if (r0 != 0) goto L6d
                androidx.recyclerview.widget.RecyclerView$d r0 = r3.l
                boolean r0 = r0.b
                if (r0 == 0) goto L5c
                goto L6d
            L5c:
                java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool."
                r0.<init>(r1)
                java.lang.String r0 = a.C0487z.d(r3, r0)
                r6.<init>(r0)
                throw r6
            L6d:
                r6.n = r5
                r6.o = r1
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$A> r0 = r5.f978a
                r0.add(r6)
                return
        }

        public final androidx.recyclerview.widget.RecyclerView.A k(long r28, int r30) {
                r27 = this;
                r1 = r27
                r0 = r30
                r2 = -1
                r3 = 1
                androidx.recyclerview.widget.RecyclerView r4 = r1.h
                if (r0 < 0) goto L63d
                androidx.recyclerview.widget.RecyclerView$w r5 = r4.f0
                int r5 = r5.b()
                if (r0 >= r5) goto L63d
                androidx.recyclerview.widget.RecyclerView$w r5 = r4.f0
                boolean r6 = r5.g
                r8 = 0
                r9 = 32
                if (r6 == 0) goto L84
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$A> r6 = r1.b
                if (r6 == 0) goto L7d
                int r6 = r6.size()
                if (r6 != 0) goto L26
                goto L7d
            L26:
                r10 = r8
            L27:
                if (r10 >= r6) goto L43
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$A> r11 = r1.b
                java.lang.Object r11 = r11.get(r10)
                androidx.recyclerview.widget.RecyclerView$A r11 = (androidx.recyclerview.widget.RecyclerView.A) r11
                boolean r12 = r11.p()
                if (r12 != 0) goto L41
                int r12 = r11.b()
                if (r12 != r0) goto L41
                r11.a(r9)
                goto L7e
            L41:
                int r10 = r10 + r3
                goto L27
            L43:
                androidx.recyclerview.widget.RecyclerView$d r10 = r4.l
                boolean r10 = r10.b
                if (r10 == 0) goto L7d
                androidx.recyclerview.widget.a r10 = r4.e
                int r10 = r10.e(r0, r8)
                if (r10 <= 0) goto L7d
                androidx.recyclerview.widget.RecyclerView$d r11 = r4.l
                int r11 = r11.a()
                if (r10 >= r11) goto L7d
                androidx.recyclerview.widget.RecyclerView$d r11 = r4.l
                long r10 = r11.b(r10)
                r12 = r8
            L60:
                if (r12 >= r6) goto L7d
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$A> r13 = r1.b
                java.lang.Object r13 = r13.get(r12)
                androidx.recyclerview.widget.RecyclerView$A r13 = (androidx.recyclerview.widget.RecyclerView.A) r13
                boolean r14 = r13.p()
                if (r14 != 0) goto L7b
                long r14 = r13.e
                int r14 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
                if (r14 != 0) goto L7b
                r13.a(r9)
                r11 = r13
                goto L7e
            L7b:
                int r12 = r12 + r3
                goto L60
            L7d:
                r11 = 0
            L7e:
                if (r11 == 0) goto L82
                r6 = r3
                goto L86
            L82:
                r6 = r8
                goto L86
            L84:
                r6 = r8
                r11 = 0
            L86:
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$A> r10 = r1.c
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$A> r12 = r1.f978a
                java.lang.String r13 = "RecyclerView"
                if (r11 != 0) goto L258
                int r11 = r12.size()
                r14 = r8
            L93:
                if (r14 >= r11) goto Lc6
                java.lang.Object r15 = r12.get(r14)
                androidx.recyclerview.widget.RecyclerView$A r15 = (androidx.recyclerview.widget.RecyclerView.A) r15
                boolean r16 = r15.p()
                if (r16 != 0) goto Lbf
                r16 = r3
                int r3 = r15.b()
                if (r3 != r0) goto Lc1
                boolean r3 = r15.f()
                if (r3 != 0) goto Lc1
                boolean r3 = r5.g
                if (r3 != 0) goto Lb9
                boolean r3 = r15.h()
                if (r3 != 0) goto Lc1
            Lb9:
                r15.a(r9)
                r11 = r15
                goto L1c2
            Lbf:
                r16 = r3
            Lc1:
                int r14 = r14 + 1
                r3 = r16
                goto L93
            Lc6:
                r16 = r3
                androidx.recyclerview.widget.b r3 = r4.f
                java.util.ArrayList r3 = r3.c
                int r11 = r3.size()
                r14 = r8
            Ld1:
                if (r14 >= r11) goto Lf3
                java.lang.Object r15 = r3.get(r14)
                android.view.View r15 = (android.view.View) r15
                androidx.recyclerview.widget.RecyclerView$A r17 = androidx.recyclerview.widget.RecyclerView.L(r15)
                int r7 = r17.b()
                if (r7 != r0) goto Lf0
                boolean r7 = r17.f()
                if (r7 != 0) goto Lf0
                boolean r7 = r17.h()
                if (r7 != 0) goto Lf0
                goto Lf4
            Lf0:
                int r14 = r14 + 1
                goto Ld1
            Lf3:
                r15 = 0
            Lf4:
                if (r15 == 0) goto L17e
                androidx.recyclerview.widget.RecyclerView$A r3 = androidx.recyclerview.widget.RecyclerView.L(r15)
                androidx.recyclerview.widget.b r7 = r4.f
                androidx.recyclerview.widget.v r11 = r7.f992a
                androidx.recyclerview.widget.RecyclerView r11 = r11.f1015a
                int r11 = r11.indexOfChild(r15)
                if (r11 < 0) goto L16a
                androidx.recyclerview.widget.b$a r14 = r7.b
                boolean r17 = r14.d(r11)
                if (r17 == 0) goto L156
                r14.a(r11)
                r7.j(r15)
                androidx.recyclerview.widget.b r7 = r4.f
                androidx.recyclerview.widget.v r11 = r7.f992a
                androidx.recyclerview.widget.RecyclerView r11 = r11.f1015a
                int r11 = r11.indexOfChild(r15)
                if (r11 != r2) goto L121
                goto L129
            L121:
                androidx.recyclerview.widget.b$a r7 = r7.b
                boolean r14 = r7.d(r11)
                if (r14 == 0) goto L12b
            L129:
                r11 = r2
                goto L130
            L12b:
                int r7 = r7.b(r11)
                int r11 = r11 - r7
            L130:
                if (r11 == r2) goto L142
                androidx.recyclerview.widget.b r7 = r4.f
                r7.c(r11)
                r1.j(r15)
                r7 = 8224(0x2020, float:1.1524E-41)
                r3.a(r7)
                r11 = r3
                goto L1c2
            L142:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r5 = "layout index should not be -1 after unhiding a view:"
                r2.<init>(r5)
                r2.append(r3)
                java.lang.String r2 = a.C0487z.d(r4, r2)
                r0.<init>(r2)
                throw r0
            L156:
                java.lang.RuntimeException r0 = new java.lang.RuntimeException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r3 = "trying to unhide a view that was not hidden"
                r2.<init>(r3)
                r2.append(r15)
                java.lang.String r2 = r2.toString()
                r0.<init>(r2)
                throw r0
            L16a:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r3 = "view is not a child, cannot hide "
                r2.<init>(r3)
                r2.append(r15)
                java.lang.String r2 = r2.toString()
                r0.<init>(r2)
                throw r0
            L17e:
                int r3 = r10.size()
                r7 = r8
            L183:
                if (r7 >= r3) goto L1c1
                java.lang.Object r11 = r10.get(r7)
                androidx.recyclerview.widget.RecyclerView$A r11 = (androidx.recyclerview.widget.RecyclerView.A) r11
                boolean r14 = r11.f()
                if (r14 != 0) goto L1be
                int r14 = r11.b()
                if (r14 != r0) goto L1be
                boolean r14 = r11.d()
                if (r14 != 0) goto L1be
                r10.remove(r7)
                boolean r3 = androidx.recyclerview.widget.RecyclerView.z0
                if (r3 == 0) goto L1c2
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                java.lang.String r7 = "getScrapOrHiddenOrCachedHolderForPosition("
                r3.<init>(r7)
                r3.append(r0)
                java.lang.String r7 = ") found match in cache: "
                r3.append(r7)
                r3.append(r11)
                java.lang.String r3 = r3.toString()
                android.util.Log.d(r13, r3)
                goto L1c2
            L1be:
                int r7 = r7 + 1
                goto L183
            L1c1:
                r11 = 0
            L1c2:
                if (r11 == 0) goto L25a
                boolean r3 = r11.h()
                if (r3 == 0) goto L1e7
                boolean r3 = androidx.recyclerview.widget.RecyclerView.y0
                if (r3 == 0) goto L1e4
                boolean r3 = r5.g
                if (r3 == 0) goto L1d3
                goto L1e4
            L1d3:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r3 = "should not receive a removed view unless it is pre layout"
                r2.<init>(r3)
                java.lang.String r2 = a.C0487z.d(r4, r2)
                r0.<init>(r2)
                throw r0
            L1e4:
                boolean r3 = r5.g
                goto L219
            L1e7:
                int r3 = r11.c
                if (r3 < 0) goto L244
                androidx.recyclerview.widget.RecyclerView$d r7 = r4.l
                int r7 = r7.a()
                if (r3 >= r7) goto L244
                boolean r3 = r5.g
                if (r3 != 0) goto L205
                androidx.recyclerview.widget.RecyclerView$d r3 = r4.l
                int r7 = r11.c
                int r3 = r3.c(r7)
                int r7 = r11.f
                if (r3 == r7) goto L205
            L203:
                r3 = r8
                goto L219
            L205:
                androidx.recyclerview.widget.RecyclerView$d r3 = r4.l
                boolean r7 = r3.b
                if (r7 == 0) goto L217
                long r14 = r11.e
                int r7 = r11.c
                long r19 = r3.b(r7)
                int r3 = (r14 > r19 ? 1 : (r14 == r19 ? 0 : -1))
                if (r3 != 0) goto L203
            L217:
                r3 = r16
            L219:
                if (r3 != 0) goto L241
                r3 = 4
                r11.a(r3)
                boolean r3 = r11.i()
                if (r3 == 0) goto L230
                android.view.View r3 = r11.f963a
                r4.removeDetachedView(r3, r8)
                androidx.recyclerview.widget.RecyclerView$r r3 = r11.n
                r3.l(r11)
                goto L23c
            L230:
                boolean r3 = r11.p()
                if (r3 == 0) goto L23c
                int r3 = r11.j
                r3 = r3 & (-33)
                r11.j = r3
            L23c:
                r1.i(r11)
                r11 = 0
                goto L25a
            L241:
                r6 = r16
                goto L25a
            L244:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r3 = "Inconsistency detected. Invalid view holder adapter position"
                r2.<init>(r3)
                r2.append(r11)
                java.lang.String r2 = a.C0487z.d(r4, r2)
                r0.<init>(r2)
                throw r0
            L258:
                r16 = r3
            L25a:
                r19 = 4
                r21 = 0
                r23 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                if (r11 != 0) goto L423
                androidx.recyclerview.widget.a r3 = r4.e
                int r3 = r3.e(r0, r8)
                if (r3 < 0) goto L3f4
                androidx.recyclerview.widget.RecyclerView$d r7 = r4.l
                int r7 = r7.a()
                if (r3 >= r7) goto L3f4
                androidx.recyclerview.widget.RecyclerView$d r7 = r4.l
                int r7 = r7.c(r3)
                r17 = r2
                androidx.recyclerview.widget.RecyclerView$d r2 = r4.l
                r25 = 3
                boolean r14 = r2.b
                if (r14 == 0) goto L313
                long r14 = r2.b(r3)
                int r2 = r12.size()
                int r2 = r2 + (-1)
            L28f:
                if (r2 < 0) goto L2e2
                java.lang.Object r11 = r12.get(r2)
                androidx.recyclerview.widget.RecyclerView$A r11 = (androidx.recyclerview.widget.RecyclerView.A) r11
                long r8 = r11.e
                int r8 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
                if (r8 != 0) goto L2dc
                boolean r8 = r11.p()
                if (r8 != 0) goto L2dc
                int r8 = r11.f
                if (r7 != r8) goto L2bf
                r8 = 32
                r11.a(r8)
                boolean r2 = r11.h()
                if (r2 == 0) goto L30d
                boolean r2 = r5.g
                if (r2 != 0) goto L30d
                int r2 = r11.j
                r2 = r2 & (-15)
                r2 = r2 | 2
                r11.j = r2
                goto L30d
            L2bf:
                r8 = 32
                r12.remove(r2)
                android.view.View r9 = r11.f963a
                r11 = 0
                r4.removeDetachedView(r9, r11)
                androidx.recyclerview.widget.RecyclerView$A r9 = androidx.recyclerview.widget.RecyclerView.L(r9)
                r8 = 0
                r9.n = r8
                r9.o = r11
                int r8 = r9.j
                r8 = r8 & (-33)
                r9.j = r8
                r1.i(r9)
            L2dc:
                int r2 = r2 + (-1)
                r8 = 0
                r9 = 32
                goto L28f
            L2e2:
                int r2 = r10.size()
                int r2 = r2 + (-1)
            L2e8:
                if (r2 < 0) goto L308
                java.lang.Object r8 = r10.get(r2)
                androidx.recyclerview.widget.RecyclerView$A r8 = (androidx.recyclerview.widget.RecyclerView.A) r8
                long r11 = r8.e
                int r9 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
                if (r9 != 0) goto L30a
                boolean r9 = r8.d()
                if (r9 != 0) goto L30a
                int r9 = r8.f
                if (r7 != r9) goto L305
                r10.remove(r2)
                r11 = r8
                goto L30d
            L305:
                r1.g(r2)
            L308:
                r11 = 0
                goto L30d
            L30a:
                int r2 = r2 + (-1)
                goto L2e8
            L30d:
                if (r11 == 0) goto L313
                r11.c = r3
                r6 = r16
            L313:
                if (r11 != 0) goto L36c
                boolean r2 = androidx.recyclerview.widget.RecyclerView.z0
                if (r2 == 0) goto L32f
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r3 = "tryGetViewHolderForPositionByDeadline("
                r2.<init>(r3)
                r2.append(r0)
                java.lang.String r3 = ") fetching from shared pool"
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                android.util.Log.d(r13, r2)
            L32f:
                androidx.recyclerview.widget.RecyclerView$q r2 = r1.c()
                android.util.SparseArray<androidx.recyclerview.widget.RecyclerView$q$a> r2 = r2.f976a
                java.lang.Object r2 = r2.get(r7)
                androidx.recyclerview.widget.RecyclerView$q$a r2 = (androidx.recyclerview.widget.RecyclerView.q.a) r2
                if (r2 == 0) goto L363
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$A> r2 = r2.f977a
                boolean r3 = r2.isEmpty()
                if (r3 != 0) goto L363
                int r3 = r2.size()
                int r3 = r3 + (-1)
            L34b:
                if (r3 < 0) goto L363
                java.lang.Object r8 = r2.get(r3)
                androidx.recyclerview.widget.RecyclerView$A r8 = (androidx.recyclerview.widget.RecyclerView.A) r8
                boolean r8 = r8.d()
                if (r8 != 0) goto L360
                java.lang.Object r2 = r2.remove(r3)
                androidx.recyclerview.widget.RecyclerView$A r2 = (androidx.recyclerview.widget.RecyclerView.A) r2
                goto L364
            L360:
                int r3 = r3 + (-1)
                goto L34b
            L363:
                r2 = 0
            L364:
                if (r2 == 0) goto L36b
                r2.m()
                boolean r3 = androidx.recyclerview.widget.RecyclerView.y0
            L36b:
                r11 = r2
            L36c:
                if (r11 != 0) goto L425
                long r2 = r4.getNanoTime()
                int r8 = (r28 > r23 ? 1 : (r28 == r23 ? 0 : -1))
                if (r8 == 0) goto L391
                androidx.recyclerview.widget.RecyclerView$q r8 = r1.g
                androidx.recyclerview.widget.RecyclerView$q$a r8 = r8.a(r7)
                long r8 = r8.c
                int r10 = (r8 > r21 ? 1 : (r8 == r21 ? 0 : -1))
                if (r10 == 0) goto L38a
                long r8 = r8 + r2
                int r8 = (r8 > r28 ? 1 : (r8 == r28 ? 0 : -1))
                if (r8 >= 0) goto L388
                goto L38a
            L388:
                r8 = 0
                goto L38c
            L38a:
                r8 = r16
            L38c:
                if (r8 != 0) goto L391
                r18 = 0
                return r18
            L391:
                androidx.recyclerview.widget.RecyclerView$d r8 = r4.l
                r8.getClass()
                java.lang.String r9 = "RV CreateView"
                int r10 = a.Af.f16a     // Catch: java.lang.Throwable -> L3e4
                android.os.Trace.beginSection(r9)     // Catch: java.lang.Throwable -> L3e4
                androidx.recyclerview.widget.RecyclerView$A r11 = r8.e(r4, r7)     // Catch: java.lang.Throwable -> L3e4
                android.view.View r8 = r11.f963a
                android.view.ViewParent r9 = r8.getParent()     // Catch: java.lang.Throwable -> L3e4
                if (r9 != 0) goto L3e6
                r11.f = r7     // Catch: java.lang.Throwable -> L3e4
                android.os.Trace.endSection()
                boolean r9 = androidx.recyclerview.widget.RecyclerView.D0
                if (r9 == 0) goto L3bf
                androidx.recyclerview.widget.RecyclerView r8 = androidx.recyclerview.widget.RecyclerView.G(r8)
                if (r8 == 0) goto L3bf
                java.lang.ref.WeakReference r9 = new java.lang.ref.WeakReference
                r9.<init>(r8)
                r11.b = r9
            L3bf:
                long r8 = r4.getNanoTime()
                androidx.recyclerview.widget.RecyclerView$q r10 = r1.g
                long r8 = r8 - r2
                androidx.recyclerview.widget.RecyclerView$q$a r2 = r10.a(r7)
                long r14 = r2.c
                int r3 = (r14 > r21 ? 1 : (r14 == r21 ? 0 : -1))
                if (r3 != 0) goto L3d1
                goto L3d8
            L3d1:
                long r14 = r14 / r19
                long r14 = r14 * r25
                long r8 = r8 / r19
                long r8 = r8 + r14
            L3d8:
                r2.c = r8
                boolean r2 = androidx.recyclerview.widget.RecyclerView.z0
                if (r2 == 0) goto L425
                java.lang.String r2 = "tryGetViewHolderForPositionByDeadline created new ViewHolder"
                android.util.Log.d(r13, r2)
                goto L425
            L3e4:
                r0 = move-exception
                goto L3ee
            L3e6:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L3e4
                java.lang.String r2 = "ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)"
                r0.<init>(r2)     // Catch: java.lang.Throwable -> L3e4
                throw r0     // Catch: java.lang.Throwable -> L3e4
            L3ee:
                int r2 = a.Af.f16a
                android.os.Trace.endSection()
                throw r0
            L3f4:
                java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                java.lang.String r7 = "Inconsistency detected. Invalid item position "
                r6.<init>(r7)
                r6.append(r0)
                java.lang.String r0 = "(offset:"
                r6.append(r0)
                r6.append(r3)
                java.lang.String r0 = ").state:"
                r6.append(r0)
                int r0 = r5.b()
                r6.append(r0)
                java.lang.String r0 = r4.B()
                r6.append(r0)
                java.lang.String r0 = r6.toString()
                r2.<init>(r0)
                throw r2
            L423:
                r25 = 3
            L425:
                if (r6 == 0) goto L455
                boolean r2 = r5.g
                if (r2 != 0) goto L455
                int r2 = r11.j
                r3 = r2 & 8192(0x2000, float:1.148E-41)
                if (r3 == 0) goto L434
                r3 = r16
                goto L435
            L434:
                r3 = 0
            L435:
                if (r3 == 0) goto L455
                r2 = r2 & (-8193(0xffffffffffffdfff, float:NaN))
                r11.j = r2
                boolean r2 = r5.j
                if (r2 == 0) goto L455
                androidx.recyclerview.widget.RecyclerView.i.b(r11)
                androidx.recyclerview.widget.RecyclerView$i r2 = r4.K
                r11.c()
                r2.getClass()
                androidx.recyclerview.widget.RecyclerView$i$b r2 = new androidx.recyclerview.widget.RecyclerView$i$b
                r2.<init>()
                r2.a(r11)
                r4.X(r11, r2)
            L455:
                boolean r2 = r5.g
                android.view.View r3 = r11.f963a
                if (r2 == 0) goto L464
                boolean r2 = r11.e()
                if (r2 == 0) goto L464
                r11.g = r0
                goto L47d
            L464:
                boolean r2 = r11.e()
                if (r2 == 0) goto L482
                int r2 = r11.j
                r2 = r2 & 2
                if (r2 == 0) goto L473
                r2 = r16
                goto L474
            L473:
                r2 = 0
            L474:
                if (r2 != 0) goto L482
                boolean r2 = r11.f()
                if (r2 == 0) goto L47d
                goto L482
            L47d:
                r7 = r16
                r0 = 0
                goto L60f
            L482:
                boolean r2 = androidx.recyclerview.widget.RecyclerView.y0
                if (r2 == 0) goto L4a1
                boolean r2 = r11.h()
                if (r2 != 0) goto L48d
                goto L4a1
            L48d:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r3 = "Removed holder should be bound and it should come here only in pre-layout. Holder: "
                r2.<init>(r3)
                r2.append(r11)
                java.lang.String r2 = a.C0487z.d(r4, r2)
                r0.<init>(r2)
                throw r0
            L4a1:
                androidx.recyclerview.widget.a r2 = r4.e
                r7 = 0
                int r2 = r2.e(r0, r7)
                r8 = 0
                r11.s = r8
                r11.r = r4
                int r9 = r11.f
                long r12 = r4.getNanoTime()
                int r10 = (r28 > r23 ? 1 : (r28 == r23 ? 0 : -1))
                if (r10 == 0) goto L4ce
                androidx.recyclerview.widget.RecyclerView$q r10 = r1.g
                androidx.recyclerview.widget.RecyclerView$q$a r9 = r10.a(r9)
                long r9 = r9.d
                int r14 = (r9 > r21 ? 1 : (r9 == r21 ? 0 : -1))
                if (r14 == 0) goto L4ce
                long r9 = r9 + r12
                int r9 = (r9 > r28 ? 1 : (r9 == r28 ? 0 : -1))
                if (r9 >= 0) goto L4c9
                goto L4ce
            L4c9:
                r0 = r7
                r7 = r16
                goto L60f
            L4ce:
                boolean r9 = r11.j()
                if (r9 == 0) goto L4e2
                int r9 = r4.getChildCount()
                android.view.ViewGroup$LayoutParams r10 = r3.getLayoutParams()
                androidx.recyclerview.widget.RecyclerView.e(r4, r3, r9, r10)
                r9 = r16
                goto L4e3
            L4e2:
                r9 = r7
            L4e3:
                androidx.recyclerview.widget.RecyclerView$d r10 = r4.l
                r10.getClass()
                androidx.recyclerview.widget.RecyclerView$d<? extends androidx.recyclerview.widget.RecyclerView$A> r14 = r11.s
                if (r14 != 0) goto L4ef
                r14 = r16
                goto L4f0
            L4ef:
                r14 = r7
            L4f0:
                if (r14 == 0) goto L50d
                r11.c = r2
                boolean r15 = r10.b
                if (r15 == 0) goto L4fe
                long r7 = r10.b(r2)
                r11.e = r7
            L4fe:
                int r7 = r11.j
                r7 = r7 & (-520(0xfffffffffffffdf8, float:NaN))
                r7 = r7 | 1
                r11.j = r7
                int r7 = a.Af.f16a
                java.lang.String r7 = "RV OnBindView"
                android.os.Trace.beginSection(r7)
            L50d:
                r11.s = r10
                boolean r7 = androidx.recyclerview.widget.RecyclerView.y0
                if (r7 == 0) goto L575
                android.view.ViewParent r7 = r3.getParent()
                if (r7 != 0) goto L552
                java.util.WeakHashMap<android.view.View, a.Jg> r7 = a.C0414ug.f721a
                boolean r7 = r3.isAttachedToWindow()
                boolean r8 = r11.j()
                if (r7 != r8) goto L526
                goto L552
            L526:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r4 = "Temp-detached state out of sync with reality. holder.isTmpDetached(): "
                r2.<init>(r4)
                boolean r4 = r11.j()
                r2.append(r4)
                java.lang.String r4 = ", attached to window: "
                r2.append(r4)
                boolean r3 = r3.isAttachedToWindow()
                r2.append(r3)
                java.lang.String r3 = ", holder: "
                r2.append(r3)
                r2.append(r11)
                java.lang.String r2 = r2.toString()
                r0.<init>(r2)
                throw r0
            L552:
                android.view.ViewParent r7 = r3.getParent()
                if (r7 != 0) goto L575
                java.util.WeakHashMap<android.view.View, a.Jg> r7 = a.C0414ug.f721a
                boolean r7 = r3.isAttachedToWindow()
                if (r7 != 0) goto L561
                goto L575
            L561:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r3 = "Attempting to bind attached holder with no parent (AKA temp detached): "
                r2.<init>(r3)
                r2.append(r11)
                java.lang.String r2 = r2.toString()
                r0.<init>(r2)
                throw r0
            L575:
                r11.c()
                r10.d(r11, r2)
                if (r14 == 0) goto L59d
                java.util.ArrayList r2 = r11.k
                if (r2 == 0) goto L584
                r2.clear()
            L584:
                int r2 = r11.j
                r2 = r2 & (-1025(0xfffffffffffffbff, float:NaN))
                r11.j = r2
                android.view.ViewGroup$LayoutParams r2 = r3.getLayoutParams()
                boolean r7 = r2 instanceof androidx.recyclerview.widget.RecyclerView.m
                if (r7 == 0) goto L598
                androidx.recyclerview.widget.RecyclerView$m r2 = (androidx.recyclerview.widget.RecyclerView.m) r2
                r7 = r16
                r2.c = r7
            L598:
                int r2 = a.Af.f16a
                android.os.Trace.endSection()
            L59d:
                if (r9 == 0) goto L5a2
                androidx.recyclerview.widget.RecyclerView.f(r4, r3)
            L5a2:
                long r7 = r4.getNanoTime()
                androidx.recyclerview.widget.RecyclerView$q r2 = r1.g
                int r9 = r11.f
                long r7 = r7 - r12
                androidx.recyclerview.widget.RecyclerView$q$a r2 = r2.a(r9)
                long r9 = r2.d
                int r12 = (r9 > r21 ? 1 : (r9 == r21 ? 0 : -1))
                if (r12 != 0) goto L5b6
                goto L5bd
            L5b6:
                long r9 = r9 / r19
                long r9 = r9 * r25
                long r7 = r7 / r19
                long r7 = r7 + r9
            L5bd:
                r2.d = r7
                android.view.accessibility.AccessibilityManager r2 = r4.A
                if (r2 == 0) goto L5cb
                boolean r2 = r2.isEnabled()
                if (r2 == 0) goto L5cb
                r2 = 1
                goto L5cc
            L5cb:
                r2 = 0
            L5cc:
                if (r2 == 0) goto L607
                java.util.WeakHashMap<android.view.View, a.Jg> r2 = a.C0414ug.f721a
                int r2 = r3.getImportantForAccessibility()
                r7 = 1
                if (r2 != 0) goto L5da
                r3.setImportantForAccessibility(r7)
            L5da:
                androidx.recyclerview.widget.x r2 = r4.m0
                if (r2 != 0) goto L5df
                goto L608
            L5df:
                androidx.recyclerview.widget.x$a r2 = r2.e
                if (r2 == 0) goto L603
                android.view.View$AccessibilityDelegate r8 = a.C0414ug.b(r3)
                if (r8 != 0) goto L5eb
                r8 = 0
                goto L5fa
            L5eb:
                boolean r9 = r8 instanceof a.C.a
                if (r9 == 0) goto L5f4
                a.C$a r8 = (a.C.a) r8
                a.C r8 = r8.f37a
                goto L5fa
            L5f4:
                a.C r9 = new a.C
                r9.<init>(r8)
                r8 = r9
            L5fa:
                if (r8 == 0) goto L603
                if (r8 == r2) goto L603
                java.util.WeakHashMap r9 = r2.e
                r9.put(r3, r8)
            L603:
                a.C0414ug.j(r3, r2)
                goto L608
            L607:
                r7 = 1
            L608:
                boolean r2 = r5.g
                if (r2 == 0) goto L60e
                r11.g = r0
            L60e:
                r0 = r7
            L60f:
                android.view.ViewGroup$LayoutParams r2 = r3.getLayoutParams()
                if (r2 != 0) goto L61f
                android.view.ViewGroup$LayoutParams r2 = r4.generateDefaultLayoutParams()
                androidx.recyclerview.widget.RecyclerView$m r2 = (androidx.recyclerview.widget.RecyclerView.m) r2
                r3.setLayoutParams(r2)
                goto L631
            L61f:
                boolean r5 = r4.checkLayoutParams(r2)
                if (r5 != 0) goto L62f
                android.view.ViewGroup$LayoutParams r2 = r4.generateLayoutParams(r2)
                androidx.recyclerview.widget.RecyclerView$m r2 = (androidx.recyclerview.widget.RecyclerView.m) r2
                r3.setLayoutParams(r2)
                goto L631
            L62f:
                androidx.recyclerview.widget.RecyclerView$m r2 = (androidx.recyclerview.widget.RecyclerView.m) r2
            L631:
                r2.f975a = r11
                if (r6 == 0) goto L639
                if (r0 == 0) goto L639
                r3 = r7
                goto L63a
            L639:
                r3 = 0
            L63a:
                r2.d = r3
                return r11
            L63d:
                java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                java.lang.String r5 = "Invalid item position "
                r3.<init>(r5)
                r3.append(r0)
                java.lang.String r5 = "("
                r3.append(r5)
                r3.append(r0)
                java.lang.String r0 = "). Item count:"
                r3.append(r0)
                androidx.recyclerview.widget.RecyclerView$w r0 = r4.f0
                int r0 = r0.b()
                r3.append(r0)
                java.lang.String r0 = r4.B()
                r3.append(r0)
                java.lang.String r0 = r3.toString()
                r2.<init>(r0)
                throw r2
        }

        public final void l(androidx.recyclerview.widget.RecyclerView.A r2) {
                r1 = this;
                boolean r0 = r2.o
                if (r0 == 0) goto La
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$A> r0 = r1.b
                r0.remove(r2)
                goto Lf
            La:
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$A> r0 = r1.f978a
                r0.remove(r2)
            Lf:
                r0 = 0
                r2.n = r0
                r0 = 0
                r2.o = r0
                int r0 = r2.j
                r0 = r0 & (-33)
                r2.j = r0
                return
        }

        public final void m() {
                r4 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r4.h
                androidx.recyclerview.widget.RecyclerView$l r0 = r0.m
                if (r0 == 0) goto L9
                int r0 = r0.j
                goto La
            L9:
                r0 = 0
            La:
                int r1 = r4.e
                int r1 = r1 + r0
                r4.f = r1
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$A> r0 = r4.c
                int r1 = r0.size()
                int r1 = r1 + (-1)
            L17:
                if (r1 < 0) goto L27
                int r2 = r0.size()
                int r3 = r4.f
                if (r2 <= r3) goto L27
                r4.g(r1)
                int r1 = r1 + (-1)
                goto L17
            L27:
                return
        }
    }

    public interface s {
        void a();
    }

    public class t extends androidx.recyclerview.widget.RecyclerView.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f979a;

        public t(androidx.recyclerview.widget.RecyclerView r1) {
                r0 = this;
                r0.f979a = r1
                r0.<init>()
                return
        }

        @Override // androidx.recyclerview.widget.RecyclerView.f
        public final void a() {
                r3 = this;
                r0 = 0
                androidx.recyclerview.widget.RecyclerView r1 = r3.f979a
                r1.k(r0)
                androidx.recyclerview.widget.RecyclerView$w r0 = r1.f0
                r2 = 1
                r0.f = r2
                r1.W(r2)
                androidx.recyclerview.widget.a r0 = r1.e
                boolean r0 = r0.f()
                if (r0 != 0) goto L19
                r1.requestLayout()
            L19:
                return
        }
    }

    public static class u extends a.r {
        public static final android.os.Parcelable.Creator<androidx.recyclerview.widget.RecyclerView.u> CREATOR = null;
        public android.os.Parcelable c;

        public class a implements android.os.Parcelable.ClassLoaderCreator<androidx.recyclerview.widget.RecyclerView.u> {
            @Override // android.os.Parcelable.Creator
            public final java.lang.Object createFromParcel(android.os.Parcel r3) {
                    r2 = this;
                    androidx.recyclerview.widget.RecyclerView$u r0 = new androidx.recyclerview.widget.RecyclerView$u
                    r1 = 0
                    r0.<init>(r3, r1)
                    return r0
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final androidx.recyclerview.widget.RecyclerView.u createFromParcel(android.os.Parcel r2, java.lang.ClassLoader r3) {
                    r1 = this;
                    androidx.recyclerview.widget.RecyclerView$u r0 = new androidx.recyclerview.widget.RecyclerView$u
                    r0.<init>(r2, r3)
                    return r0
            }

            @Override // android.os.Parcelable.Creator
            public final java.lang.Object[] newArray(int r1) {
                    r0 = this;
                    androidx.recyclerview.widget.RecyclerView$u[] r1 = new androidx.recyclerview.widget.RecyclerView.u[r1]
                    return r1
            }
        }

        static {
                androidx.recyclerview.widget.RecyclerView$u$a r0 = new androidx.recyclerview.widget.RecyclerView$u$a
                r0.<init>()
                androidx.recyclerview.widget.RecyclerView.u.CREATOR = r0
                return
        }

        public u(android.os.Parcel r1, java.lang.ClassLoader r2) {
                r0 = this;
                r0.<init>(r1, r2)
                if (r2 == 0) goto L6
                goto Lc
            L6:
                java.lang.Class<androidx.recyclerview.widget.RecyclerView$l> r2 = androidx.recyclerview.widget.RecyclerView.l.class
                java.lang.ClassLoader r2 = r2.getClassLoader()
            Lc:
                android.os.Parcelable r1 = r1.readParcelable(r2)
                r0.c = r1
                return
        }

        @Override // a.r, android.os.Parcelable
        public final void writeToParcel(android.os.Parcel r2, int r3) {
                r1 = this;
                super.writeToParcel(r2, r3)
                android.os.Parcelable r3 = r1.c
                r0 = 0
                r2.writeParcelable(r3, r0)
                return
        }
    }

    public static abstract class v {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f980a;
        public androidx.recyclerview.widget.RecyclerView b;
        public androidx.recyclerview.widget.RecyclerView.l c;
        public boolean d;
        public boolean e;
        public android.view.View f;
        public final androidx.recyclerview.widget.RecyclerView.v.a g;
        public boolean h;

        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f981a;
            public int b;
            public int c;
            public int d;
            public android.view.animation.BaseInterpolator e;
            public boolean f;
            public int g;

            public final void a(androidx.recyclerview.widget.RecyclerView r7) {
                    r6 = this;
                    int r0 = r6.d
                    r1 = 0
                    if (r0 < 0) goto Le
                    r2 = -1
                    r6.d = r2
                    r7.P(r0)
                    r6.f = r1
                    return
                Le:
                    boolean r0 = r6.f
                    if (r0 == 0) goto L4c
                    android.view.animation.BaseInterpolator r0 = r6.e
                    r2 = 1
                    if (r0 == 0) goto L24
                    int r3 = r6.c
                    if (r3 < r2) goto L1c
                    goto L24
                L1c:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r0 = "If you provide an interpolator, you must set a positive duration"
                    r7.<init>(r0)
                    throw r7
                L24:
                    int r3 = r6.c
                    if (r3 < r2) goto L44
                    androidx.recyclerview.widget.RecyclerView$z r7 = r7.c0
                    int r4 = r6.f981a
                    int r5 = r6.b
                    r7.c(r4, r5, r3, r0)
                    int r7 = r6.g
                    int r7 = r7 + r2
                    r6.g = r7
                    r0 = 10
                    if (r7 <= r0) goto L41
                    java.lang.String r7 = "RecyclerView"
                    java.lang.String r0 = "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary"
                    android.util.Log.e(r7, r0)
                L41:
                    r6.f = r1
                    return
                L44:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r0 = "Scroll duration must be a positive number"
                    r7.<init>(r0)
                    throw r7
                L4c:
                    r6.g = r1
                    return
            }
        }

        public interface b {
            android.graphics.PointF a(int r1);
        }

        public v() {
                r2 = this;
                r2.<init>()
                r0 = -1
                r2.f980a = r0
                androidx.recyclerview.widget.RecyclerView$v$a r1 = new androidx.recyclerview.widget.RecyclerView$v$a
                r1.<init>()
                r1.d = r0
                r0 = 0
                r1.f = r0
                r1.g = r0
                r1.f981a = r0
                r1.b = r0
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r1.c = r0
                r0 = 0
                r1.e = r0
                r2.g = r1
                return
        }

        public android.graphics.PointF a(int r3) {
                r2 = this;
                androidx.recyclerview.widget.RecyclerView$l r0 = r2.c
                boolean r1 = r0 instanceof androidx.recyclerview.widget.RecyclerView.v.b
                if (r1 == 0) goto Ld
                androidx.recyclerview.widget.RecyclerView$v$b r0 = (androidx.recyclerview.widget.RecyclerView.v.b) r0
                android.graphics.PointF r3 = r0.a(r3)
                return r3
            Ld:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                java.lang.String r0 = "You should override computeScrollVectorForPosition when the LayoutManager does not implement "
                r3.<init>(r0)
                java.lang.Class<androidx.recyclerview.widget.RecyclerView$v$b> r0 = androidx.recyclerview.widget.RecyclerView.v.b.class
                java.lang.String r0 = r0.getCanonicalName()
                r3.append(r0)
                java.lang.String r3 = r3.toString()
                java.lang.String r0 = "RecyclerView"
                android.util.Log.w(r0, r3)
                r3 = 0
                return r3
        }

        public final void b(int r9, int r10) {
                r8 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r8.b
                int r1 = r8.f980a
                r2 = -1
                if (r1 == r2) goto L9
                if (r0 != 0) goto Lc
            L9:
                r8.d()
            Lc:
                boolean r1 = r8.d
                r3 = 0
                r4 = 0
                if (r1 == 0) goto L3d
                android.view.View r1 = r8.f
                if (r1 != 0) goto L3d
                androidx.recyclerview.widget.RecyclerView$l r1 = r8.c
                if (r1 == 0) goto L3d
                int r1 = r8.f980a
                android.graphics.PointF r1 = r8.a(r1)
                if (r1 == 0) goto L3d
                float r5 = r1.x
                int r6 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
                if (r6 != 0) goto L2e
                float r6 = r1.y
                int r6 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
                if (r6 == 0) goto L3d
            L2e:
                float r5 = java.lang.Math.signum(r5)
                int r5 = (int) r5
                float r1 = r1.y
                float r1 = java.lang.Math.signum(r1)
                int r1 = (int) r1
                r0.d0(r5, r1, r3)
            L3d:
                r1 = 0
                r8.d = r1
                android.view.View r5 = r8.f
                androidx.recyclerview.widget.RecyclerView$v$a r6 = r8.g
                if (r5 == 0) goto L70
                androidx.recyclerview.widget.RecyclerView r7 = r8.b
                r7.getClass()
                androidx.recyclerview.widget.RecyclerView$A r5 = androidx.recyclerview.widget.RecyclerView.L(r5)
                if (r5 == 0) goto L55
                int r2 = r5.b()
            L55:
                int r5 = r8.f980a
                if (r2 != r5) goto L67
                android.view.View r2 = r8.f
                androidx.recyclerview.widget.RecyclerView$w r3 = r0.f0
                r8.c(r2, r6)
                r6.a(r0)
                r8.d()
                goto L70
            L67:
                java.lang.String r2 = "RecyclerView"
                java.lang.String r5 = "Passed over target position while smooth scrolling."
                android.util.Log.e(r2, r5)
                r8.f = r3
            L70:
                boolean r2 = r8.e
                if (r2 == 0) goto L117
                androidx.recyclerview.widget.RecyclerView$w r2 = r0.f0
                r2 = r8
                androidx.recyclerview.widget.o r2 = (androidx.recyclerview.widget.o) r2
                androidx.recyclerview.widget.RecyclerView r3 = r2.b
                androidx.recyclerview.widget.RecyclerView$l r3 = r3.m
                int r3 = r3.v()
                r5 = 1
                if (r3 != 0) goto L89
                r2.d()
                goto L102
            L89:
                int r3 = r2.o
                int r9 = r3 - r9
                int r3 = r3 * r9
                if (r3 > 0) goto L91
                r9 = r1
            L91:
                r2.o = r9
                int r3 = r2.p
                int r10 = r3 - r10
                int r3 = r3 * r10
                if (r3 > 0) goto L9b
                r10 = r1
            L9b:
                r2.p = r10
                if (r9 != 0) goto L102
                if (r10 != 0) goto L102
                int r9 = r2.f980a
                android.graphics.PointF r9 = r2.a(r9)
                if (r9 == 0) goto Lfb
                float r10 = r9.x
                int r3 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
                if (r3 != 0) goto Lb6
                float r3 = r9.y
                int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
                if (r3 != 0) goto Lb6
                goto Lfb
            Lb6:
                float r10 = r10 * r10
                float r3 = r9.y
                float r3 = r3 * r3
                float r3 = r3 + r10
                double r3 = (double) r3
                double r3 = java.lang.Math.sqrt(r3)
                float r10 = (float) r3
                float r3 = r9.x
                float r3 = r3 / r10
                r9.x = r3
                float r4 = r9.y
                float r4 = r4 / r10
                r9.y = r4
                r2.k = r9
                r9 = 1176256512(0x461c4000, float:10000.0)
                float r3 = r3 * r9
                int r10 = (int) r3
                r2.o = r10
                float r4 = r4 * r9
                int r9 = (int) r4
                r2.p = r9
                r9 = 10000(0x2710, float:1.4013E-41)
                int r9 = r2.i(r9)
                int r10 = r2.o
                float r10 = (float) r10
                r3 = 1067030938(0x3f99999a, float:1.2)
                float r10 = r10 * r3
                int r10 = (int) r10
                int r4 = r2.p
                float r4 = (float) r4
                float r4 = r4 * r3
                int r4 = (int) r4
                float r9 = (float) r9
                float r9 = r9 * r3
                int r9 = (int) r9
                android.view.animation.LinearInterpolator r2 = r2.i
                r6.f981a = r10
                r6.b = r4
                r6.c = r9
                r6.e = r2
                r6.f = r5
                goto L102
            Lfb:
                int r9 = r2.f980a
                r6.d = r9
                r2.d()
            L102:
                int r9 = r6.d
                if (r9 < 0) goto L107
                r1 = r5
            L107:
                r6.a(r0)
                if (r1 == 0) goto L117
                boolean r9 = r8.e
                if (r9 == 0) goto L117
                r8.d = r5
                androidx.recyclerview.widget.RecyclerView$z r9 = r0.c0
                r9.b()
            L117:
                return
        }

        public abstract void c(android.view.View r1, androidx.recyclerview.widget.RecyclerView.v.a r2);

        public final void d() {
                r4 = this;
                boolean r0 = r4.e
                if (r0 != 0) goto L5
                return
            L5:
                r0 = 0
                r4.e = r0
                r1 = r4
                androidx.recyclerview.widget.o r1 = (androidx.recyclerview.widget.o) r1
                r1.p = r0
                r1.o = r0
                r2 = 0
                r1.k = r2
                androidx.recyclerview.widget.RecyclerView r1 = r4.b
                androidx.recyclerview.widget.RecyclerView$w r1 = r1.f0
                r3 = -1
                r1.f982a = r3
                r4.f = r2
                r4.f980a = r3
                r4.d = r0
                androidx.recyclerview.widget.RecyclerView$l r0 = r4.c
                androidx.recyclerview.widget.o r1 = r0.e
                if (r1 != r4) goto L27
                r0.e = r2
            L27:
                r4.c = r2
                r4.b = r2
                return
        }
    }

    public static class w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f982a;
        public int b;
        public int c;
        public int d;
        public int e;
        public boolean f;
        public boolean g;
        public boolean h;
        public boolean i;
        public boolean j;
        public boolean k;
        public int l;
        public long m;
        public int n;

        public final void a(int r4) {
                r3 = this;
                int r0 = r3.d
                r0 = r0 & r4
                if (r0 == 0) goto L6
                return
            L6:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "Layout state should be one of "
                r1.<init>(r2)
                java.lang.String r4 = java.lang.Integer.toBinaryString(r4)
                r1.append(r4)
                java.lang.String r4 = " but it is "
                r1.append(r4)
                int r4 = r3.d
                java.lang.String r4 = java.lang.Integer.toBinaryString(r4)
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                r0.<init>(r4)
                throw r0
        }

        public final int b() {
                r2 = this;
                boolean r0 = r2.g
                if (r0 == 0) goto La
                int r0 = r2.b
                int r1 = r2.c
                int r0 = r0 - r1
                return r0
            La:
                int r0 = r2.e
                return r0
        }

        public final java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "State{mTargetPosition="
                r0.<init>(r1)
                int r1 = r2.f982a
                r0.append(r1)
                java.lang.String r1 = ", mData=null, mItemCount="
                r0.append(r1)
                int r1 = r2.e
                r0.append(r1)
                java.lang.String r1 = ", mIsMeasuring="
                r0.append(r1)
                boolean r1 = r2.i
                r0.append(r1)
                java.lang.String r1 = ", mPreviousLayoutItemCount="
                r0.append(r1)
                int r1 = r2.b
                r0.append(r1)
                java.lang.String r1 = ", mDeletedInvisibleItemCountSincePreviousLayout="
                r0.append(r1)
                int r1 = r2.c
                r0.append(r1)
                java.lang.String r1 = ", mStructureChanged="
                r0.append(r1)
                boolean r1 = r2.f
                r0.append(r1)
                java.lang.String r1 = ", mInPreLayout="
                r0.append(r1)
                boolean r1 = r2.g
                r0.append(r1)
                java.lang.String r1 = ", mRunSimpleAnimations="
                r0.append(r1)
                boolean r1 = r2.j
                r0.append(r1)
                java.lang.String r1 = ", mRunPredictiveAnimations="
                r0.append(r1)
                boolean r1 = r2.k
                r0.append(r1)
                r1 = 125(0x7d, float:1.75E-43)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    public static class x extends androidx.recyclerview.widget.RecyclerView.h {
    }

    public static abstract class y {
    }

    public class z implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f983a;
        public int b;
        public android.widget.OverScroller c;
        public android.view.animation.Interpolator d;
        public boolean e;
        public boolean f;
        public final /* synthetic */ androidx.recyclerview.widget.RecyclerView g;

        public z(androidx.recyclerview.widget.RecyclerView r3) {
                r2 = this;
                r2.<init>()
                r2.g = r3
                androidx.recyclerview.widget.RecyclerView$b r0 = androidx.recyclerview.widget.RecyclerView.F0
                r2.d = r0
                r1 = 0
                r2.e = r1
                r2.f = r1
                android.widget.OverScroller r1 = new android.widget.OverScroller
                android.content.Context r3 = r3.getContext()
                r1.<init>(r3, r0)
                r2.c = r1
                return
        }

        public final void a(int r13, int r14) {
                r12 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r12.g
                r1 = 2
                r0.setScrollState(r1)
                r1 = 0
                r12.b = r1
                r12.f983a = r1
                android.view.animation.Interpolator r1 = r12.d
                androidx.recyclerview.widget.RecyclerView$b r2 = androidx.recyclerview.widget.RecyclerView.F0
                if (r1 == r2) goto L1e
                r12.d = r2
                android.widget.OverScroller r1 = new android.widget.OverScroller
                android.content.Context r0 = r0.getContext()
                r1.<init>(r0, r2)
                r12.c = r1
            L1e:
                android.widget.OverScroller r3 = r12.c
                r8 = -2147483648(0xffffffff80000000, float:-0.0)
                r9 = 2147483647(0x7fffffff, float:NaN)
                r4 = 0
                r5 = 0
                r10 = -2147483648(0xffffffff80000000, float:-0.0)
                r11 = 2147483647(0x7fffffff, float:NaN)
                r6 = r13
                r7 = r14
                r3.fling(r4, r5, r6, r7, r8, r9, r10, r11)
                r12.b()
                return
        }

        public final void b() {
                r2 = this;
                boolean r0 = r2.e
                if (r0 == 0) goto L8
                r0 = 1
                r2.f = r0
                return
            L8:
                androidx.recyclerview.widget.RecyclerView r0 = r2.g
                r0.removeCallbacks(r2)
                java.util.WeakHashMap<android.view.View, a.Jg> r1 = a.C0414ug.f721a
                r0.postOnAnimation(r2)
                return
        }

        public final void c(int r10, int r11, int r12, android.view.animation.BaseInterpolator r13) {
                r9 = this;
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r1 = 0
                androidx.recyclerview.widget.RecyclerView r2 = r9.g
                if (r12 != r0) goto L33
                int r12 = java.lang.Math.abs(r10)
                int r0 = java.lang.Math.abs(r11)
                if (r12 <= r0) goto L13
                r3 = 1
                goto L14
            L13:
                r3 = r1
            L14:
                if (r3 == 0) goto L1b
                int r4 = r2.getWidth()
                goto L1f
            L1b:
                int r4 = r2.getHeight()
            L1f:
                if (r3 == 0) goto L22
                goto L23
            L22:
                r12 = r0
            L23:
                float r12 = (float) r12
                float r0 = (float) r4
                float r12 = r12 / r0
                r0 = 1065353216(0x3f800000, float:1.0)
                float r12 = r12 + r0
                r0 = 1133903872(0x43960000, float:300.0)
                float r12 = r12 * r0
                int r12 = (int) r12
                r0 = 2000(0x7d0, float:2.803E-42)
                int r12 = java.lang.Math.min(r12, r0)
            L33:
                r8 = r12
                if (r13 != 0) goto L38
                androidx.recyclerview.widget.RecyclerView$b r13 = androidx.recyclerview.widget.RecyclerView.F0
            L38:
                android.view.animation.Interpolator r12 = r9.d
                if (r12 == r13) goto L49
                r9.d = r13
                android.widget.OverScroller r12 = new android.widget.OverScroller
                android.content.Context r0 = r2.getContext()
                r12.<init>(r0, r13)
                r9.c = r12
            L49:
                r9.b = r1
                r9.f983a = r1
                r12 = 2
                r2.setScrollState(r12)
                android.widget.OverScroller r3 = r9.c
                r4 = 0
                r5 = 0
                r6 = r10
                r7 = r11
                r3.startScroll(r4, r5, r6, r7, r8)
                r9.b()
                return
        }

        @Override // java.lang.Runnable
        public final void run() {
                r14 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r14.g
                androidx.recyclerview.widget.RecyclerView$l r1 = r0.m
                if (r1 != 0) goto Lf
                r0.removeCallbacks(r14)
                android.widget.OverScroller r0 = r14.c
                r0.abortAnimation()
                return
            Lf:
                r8 = 0
                r14.f = r8
                r9 = 1
                r14.e = r9
                r0.p()
                android.widget.OverScroller r10 = r14.c
                boolean r1 = r10.computeScrollOffset()
                if (r1 == 0) goto L1a2
                int r1 = r10.getCurrX()
                int r2 = r10.getCurrY()
                int r3 = r14.f983a
                int r3 = r1 - r3
                int r4 = r14.b
                int r4 = r2 - r4
                r14.f983a = r1
                r14.b = r2
                android.widget.EdgeEffect r1 = r0.G
                android.widget.EdgeEffect r2 = r0.I
                int r5 = r0.getWidth()
                int r1 = androidx.recyclerview.widget.RecyclerView.o(r3, r1, r2, r5)
                android.widget.EdgeEffect r2 = r0.H
                android.widget.EdgeEffect r3 = r0.J
                int r5 = r0.getHeight()
                int r2 = androidx.recyclerview.widget.RecyclerView.o(r4, r2, r3, r5)
                int[] r3 = r0.r0
                r3[r8] = r8
                r3[r9] = r8
                r4 = 0
                r5 = 1
                boolean r3 = r0.u(r1, r2, r3, r4, r5)
                int[] r11 = r0.r0
                if (r3 == 0) goto L62
                r3 = r11[r8]
                int r1 = r1 - r3
                r3 = r11[r9]
                int r2 = r2 - r3
            L62:
                int r3 = r0.getOverScrollMode()
                r12 = 2
                if (r3 == r12) goto L6c
                r0.n(r1, r2)
            L6c:
                androidx.recyclerview.widget.RecyclerView$d r3 = r0.l
                if (r3 == 0) goto Lac
                r11[r8] = r8
                r11[r9] = r8
                r0.d0(r1, r2, r11)
                r3 = r11[r8]
                r4 = r11[r9]
                int r1 = r1 - r3
                int r2 = r2 - r4
                androidx.recyclerview.widget.RecyclerView$l r5 = r0.m
                androidx.recyclerview.widget.o r5 = r5.e
                if (r5 == 0) goto La5
                boolean r6 = r5.d
                if (r6 != 0) goto La5
                boolean r6 = r5.e
                if (r6 == 0) goto La5
                androidx.recyclerview.widget.RecyclerView$w r6 = r0.f0
                int r6 = r6.b()
                if (r6 != 0) goto L97
                r5.d()
                goto La5
            L97:
                int r7 = r5.f980a
                if (r7 < r6) goto La2
                int r6 = r6 - r9
                r5.f980a = r6
                r5.b(r3, r4)
                goto La5
            La2:
                r5.b(r3, r4)
            La5:
                r13 = r3
                r3 = r1
                r1 = r13
                r13 = r4
                r4 = r2
                r2 = r13
                goto Lb0
            Lac:
                r3 = r1
                r4 = r2
                r1 = r8
                r2 = r1
            Lb0:
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$k> r5 = r0.p
                boolean r5 = r5.isEmpty()
                if (r5 != 0) goto Lbb
                r0.invalidate()
            Lbb:
                int[] r7 = r0.r0
                r7[r8] = r8
                r7[r9] = r8
                r5 = 0
                r6 = 1
                r0.v(r1, r2, r3, r4, r5, r6, r7)
                r5 = r11[r8]
                int r3 = r3 - r5
                r5 = r11[r9]
                int r4 = r4 - r5
                if (r1 != 0) goto Ld0
                if (r2 == 0) goto Ld3
            Ld0:
                r0.w(r1, r2)
            Ld3:
                boolean r5 = androidx.recyclerview.widget.RecyclerView.d(r0)
                if (r5 != 0) goto Ldc
                r0.invalidate()
            Ldc:
                int r5 = r10.getCurrX()
                int r6 = r10.getFinalX()
                if (r5 != r6) goto Le8
                r5 = r9
                goto Le9
            Le8:
                r5 = r8
            Le9:
                int r6 = r10.getCurrY()
                int r7 = r10.getFinalY()
                if (r6 != r7) goto Lf5
                r6 = r9
                goto Lf6
            Lf5:
                r6 = r8
            Lf6:
                boolean r7 = r10.isFinished()
                if (r7 != 0) goto L107
                if (r5 != 0) goto L100
                if (r3 == 0) goto L105
            L100:
                if (r6 != 0) goto L107
                if (r4 == 0) goto L105
                goto L107
            L105:
                r5 = r8
                goto L108
            L107:
                r5 = r9
            L108:
                androidx.recyclerview.widget.RecyclerView$l r6 = r0.m
                androidx.recyclerview.widget.o r6 = r6.e
                if (r6 == 0) goto L114
                boolean r6 = r6.d
                if (r6 == 0) goto L114
                goto L198
            L114:
                if (r5 == 0) goto L198
                int r1 = r0.getOverScrollMode()
                if (r1 == r12) goto L187
                float r1 = r10.getCurrVelocity()
                int r1 = (int) r1
                if (r3 >= 0) goto L125
                int r2 = -r1
                goto L12a
            L125:
                if (r3 <= 0) goto L129
                r2 = r1
                goto L12a
            L129:
                r2 = r8
            L12a:
                if (r4 >= 0) goto L12e
                int r1 = -r1
                goto L132
            L12e:
                if (r4 <= 0) goto L131
                goto L132
            L131:
                r1 = r8
            L132:
                if (r2 >= 0) goto L146
                r0.y()
                android.widget.EdgeEffect r3 = r0.G
                boolean r3 = r3.isFinished()
                if (r3 == 0) goto L158
                android.widget.EdgeEffect r3 = r0.G
                int r4 = -r2
                r3.onAbsorb(r4)
                goto L158
            L146:
                if (r2 <= 0) goto L158
                r0.z()
                android.widget.EdgeEffect r3 = r0.I
                boolean r3 = r3.isFinished()
                if (r3 == 0) goto L158
                android.widget.EdgeEffect r3 = r0.I
                r3.onAbsorb(r2)
            L158:
                if (r1 >= 0) goto L16c
                r0.A()
                android.widget.EdgeEffect r3 = r0.H
                boolean r3 = r3.isFinished()
                if (r3 == 0) goto L17e
                android.widget.EdgeEffect r3 = r0.H
                int r4 = -r1
                r3.onAbsorb(r4)
                goto L17e
            L16c:
                if (r1 <= 0) goto L17e
                r0.x()
                android.widget.EdgeEffect r3 = r0.J
                boolean r3 = r3.isFinished()
                if (r3 == 0) goto L17e
                android.widget.EdgeEffect r3 = r0.J
                r3.onAbsorb(r1)
            L17e:
                if (r2 != 0) goto L182
                if (r1 == 0) goto L187
            L182:
                java.util.WeakHashMap<android.view.View, a.Jg> r1 = a.C0414ug.f721a
                r0.postInvalidateOnAnimation()
            L187:
                boolean r1 = androidx.recyclerview.widget.RecyclerView.D0
                if (r1 == 0) goto L1a2
                androidx.recyclerview.widget.m$b r1 = r0.e0
                int[] r2 = r1.c
                if (r2 == 0) goto L195
                r3 = -1
                java.util.Arrays.fill(r2, r3)
            L195:
                r1.d = r8
                goto L1a2
            L198:
                r14.b()
                androidx.recyclerview.widget.m r3 = r0.d0
                if (r3 == 0) goto L1a2
                r3.a(r0, r1, r2)
            L1a2:
                androidx.recyclerview.widget.RecyclerView$l r1 = r0.m
                androidx.recyclerview.widget.o r1 = r1.e
                if (r1 == 0) goto L1af
                boolean r2 = r1.d
                if (r2 == 0) goto L1af
                r1.b(r8, r8)
            L1af:
                r14.e = r8
                boolean r1 = r14.f
                if (r1 == 0) goto L1be
                r0.removeCallbacks(r14)
                java.util.WeakHashMap<android.view.View, a.Jg> r1 = a.C0414ug.f721a
                r0.postOnAnimation(r14)
                return
            L1be:
                r0.setScrollState(r8)
                r0.j0(r9)
                return
        }
    }

    static {
            r0 = 16843830(0x1010436, float:2.369658E-38)
            int[] r0 = new int[]{r0}
            androidx.recyclerview.widget.RecyclerView.A0 = r0
            r0 = 4605200834963974390(0x3fe8f5c28f5c28f6, double:0.78)
            double r0 = java.lang.Math.log(r0)
            r2 = 4606281698874543309(0x3feccccccccccccd, double:0.9)
            double r2 = java.lang.Math.log(r2)
            double r0 = r0 / r2
            float r0 = (float) r0
            androidx.recyclerview.widget.RecyclerView.B0 = r0
            r0 = 1
            androidx.recyclerview.widget.RecyclerView.C0 = r0
            androidx.recyclerview.widget.RecyclerView.D0 = r0
            java.lang.Class r0 = java.lang.Integer.TYPE
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            java.lang.Class<android.util.AttributeSet> r2 = android.util.AttributeSet.class
            java.lang.Class[] r0 = new java.lang.Class[]{r1, r2, r0, r0}
            androidx.recyclerview.widget.RecyclerView.E0 = r0
            androidx.recyclerview.widget.RecyclerView$b r0 = new androidx.recyclerview.widget.RecyclerView$b
            r0.<init>()
            androidx.recyclerview.widget.RecyclerView.F0 = r0
            androidx.recyclerview.widget.RecyclerView$x r0 = new androidx.recyclerview.widget.RecyclerView$x
            r0.<init>()
            androidx.recyclerview.widget.RecyclerView.G0 = r0
            return
    }

    public RecyclerView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            int r0 = androidx.recyclerview.R.attr.recyclerViewStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public RecyclerView(android.content.Context r20, android.util.AttributeSet r21, int r22) {
            r19 = this;
            r1 = r19
            r2 = r20
            r4 = r21
            r6 = r22
            r19.<init>(r20, r21, r22)
            androidx.recyclerview.widget.RecyclerView$t r0 = new androidx.recyclerview.widget.RecyclerView$t
            r0.<init>(r1)
            r1.b = r0
            androidx.recyclerview.widget.RecyclerView$r r0 = new androidx.recyclerview.widget.RecyclerView$r
            r0.<init>(r1)
            r1.c = r0
            androidx.recyclerview.widget.C r0 = new androidx.recyclerview.widget.C
            r0.<init>()
            r1.g = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r1.i = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r1.j = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r1.k = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.o = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.p = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.q = r0
            r9 = 0
            r1.v = r9
            r1.B = r9
            r1.C = r9
            r1.D = r9
            r1.E = r9
            androidx.recyclerview.widget.RecyclerView$x r0 = androidx.recyclerview.widget.RecyclerView.G0
            r1.F = r0
            androidx.recyclerview.widget.k r0 = new androidx.recyclerview.widget.k
            r0.<init>()
            r10 = 0
            r0.f968a = r10
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
            r1.K = r0
            r1.L = r9
            r0 = -1
            r1.M = r0
            r3 = 1
            r1.W = r3
            r1.a0 = r3
            r1.b0 = r11
            androidx.recyclerview.widget.RecyclerView$z r3 = new androidx.recyclerview.widget.RecyclerView$z
            r3.<init>(r1)
            r1.c0 = r3
            boolean r3 = androidx.recyclerview.widget.RecyclerView.D0
            if (r3 == 0) goto Le3
            androidx.recyclerview.widget.m$b r3 = new androidx.recyclerview.widget.m$b
            r3.<init>()
            goto Le4
        Le3:
            r3 = r10
        Le4:
            r1.e0 = r3
            androidx.recyclerview.widget.RecyclerView$w r3 = new androidx.recyclerview.widget.RecyclerView$w
            r3.<init>()
            r3.f982a = r0
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
            r1.f0 = r3
            r1.i0 = r9
            r1.j0 = r9
            androidx.recyclerview.widget.RecyclerView$j r3 = new androidx.recyclerview.widget.RecyclerView$j
            r3.<init>(r1)
            r1.k0 = r3
            r1.l0 = r9
            r12 = 2
            int[] r5 = new int[r12]
            r1.n0 = r5
            int[] r5 = new int[r12]
            r1.p0 = r5
            int[] r5 = new int[r12]
            r1.q0 = r5
            int[] r5 = new int[r12]
            r1.r0 = r5
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r1.s0 = r5
            androidx.recyclerview.widget.RecyclerView$a r5 = new androidx.recyclerview.widget.RecyclerView$a
            r5.<init>(r1)
            r1.t0 = r5
            r1.v0 = r9
            r1.w0 = r9
            androidx.recyclerview.widget.RecyclerView$c r5 = new androidx.recyclerview.widget.RecyclerView$c
            r5.<init>(r1)
            r1.x0 = r5
            r1.setScrollContainer(r11)
            r1.setFocusableInTouchMode(r11)
            android.view.ViewConfiguration r5 = android.view.ViewConfiguration.get(r2)
            int r7 = r5.getScaledTouchSlop()
            r1.S = r7
            float r7 = a.C0450wg.a(r5)
            r1.W = r7
            float r7 = a.C0450wg.b(r5)
            r1.a0 = r7
            int r7 = r5.getScaledMinimumFlingVelocity()
            r1.U = r7
            int r5 = r5.getScaledMaximumFlingVelocity()
            r1.V = r5
            android.content.res.Resources r5 = r2.getResources()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            float r5 = r5.density
            r7 = 1126170624(0x43200000, float:160.0)
            float r5 = r5 * r7
            r7 = 1136724797(0x43c10b3d, float:386.0878)
            float r5 = r5 * r7
            r7 = 1062668861(0x3f570a3d, float:0.84)
            float r5 = r5 * r7
            r1.f962a = r5
            int r5 = r1.getOverScrollMode()
            if (r5 != r12) goto L181
            r5 = r11
            goto L182
        L181:
            r5 = r9
        L182:
            r1.setWillNotDraw(r5)
            androidx.recyclerview.widget.RecyclerView$i r5 = r1.K
            r5.f968a = r3
            androidx.recyclerview.widget.a r3 = new androidx.recyclerview.widget.a
            androidx.recyclerview.widget.w r5 = new androidx.recyclerview.widget.w
            r5.<init>(r1)
            r3.<init>(r5)
            r1.e = r3
            androidx.recyclerview.widget.b r3 = new androidx.recyclerview.widget.b
            androidx.recyclerview.widget.v r5 = new androidx.recyclerview.widget.v
            r5.<init>(r1)
            r3.<init>(r5)
            r1.f = r3
            java.util.WeakHashMap<android.view.View, a.Jg> r3 = a.C0414ug.f721a
            int r3 = a.C0414ug.f.c(r1)
            if (r3 != 0) goto L1ae
            r3 = 8
            a.C0414ug.f.m(r1, r3)
        L1ae:
            int r3 = r1.getImportantForAccessibility()
            if (r3 != 0) goto L1b7
            r1.setImportantForAccessibility(r11)
        L1b7:
            android.content.Context r3 = r1.getContext()
            java.lang.String r5 = "accessibility"
            java.lang.Object r3 = r3.getSystemService(r5)
            android.view.accessibility.AccessibilityManager r3 = (android.view.accessibility.AccessibilityManager) r3
            r1.A = r3
            androidx.recyclerview.widget.x r3 = new androidx.recyclerview.widget.x
            r3.<init>(r1)
            r1.setAccessibilityDelegateCompat(r3)
            int[] r3 = androidx.recyclerview.R.styleable.RecyclerView
            android.content.res.TypedArray r5 = r2.obtainStyledAttributes(r4, r3, r6, r9)
            int[] r3 = androidx.recyclerview.R.styleable.RecyclerView
            a.C0414ug.i(r1, r2, r3, r4, r5, r6)
            r13 = r2
            r14 = r4
            r2 = r5
            r15 = r6
            int r3 = androidx.recyclerview.R.styleable.RecyclerView_layoutManager
            java.lang.String r16 = r2.getString(r3)
            int r3 = androidx.recyclerview.R.styleable.RecyclerView_android_descendantFocusability
            int r3 = r2.getInt(r3, r0)
            if (r3 != r0) goto L1ef
            r0 = 262144(0x40000, float:3.67342E-40)
            r1.setDescendantFocusability(r0)
        L1ef:
            int r0 = androidx.recyclerview.R.styleable.RecyclerView_android_clipToPadding
            boolean r0 = r2.getBoolean(r0, r11)
            r1.h = r0
            int r0 = androidx.recyclerview.R.styleable.RecyclerView_fastScrollEnabled
            boolean r0 = r2.getBoolean(r0, r9)
            if (r0 == 0) goto L25f
            int r0 = androidx.recyclerview.R.styleable.RecyclerView_fastScrollVerticalThumbDrawable
            android.graphics.drawable.Drawable r0 = r2.getDrawable(r0)
            android.graphics.drawable.StateListDrawable r0 = (android.graphics.drawable.StateListDrawable) r0
            int r3 = androidx.recyclerview.R.styleable.RecyclerView_fastScrollVerticalTrackDrawable
            android.graphics.drawable.Drawable r3 = r2.getDrawable(r3)
            int r4 = androidx.recyclerview.R.styleable.RecyclerView_fastScrollHorizontalThumbDrawable
            android.graphics.drawable.Drawable r4 = r2.getDrawable(r4)
            android.graphics.drawable.StateListDrawable r4 = (android.graphics.drawable.StateListDrawable) r4
            int r5 = androidx.recyclerview.R.styleable.RecyclerView_fastScrollHorizontalTrackDrawable
            android.graphics.drawable.Drawable r5 = r2.getDrawable(r5)
            if (r0 == 0) goto L24e
            if (r3 == 0) goto L24e
            if (r4 == 0) goto L24e
            if (r5 == 0) goto L24e
            android.content.Context r6 = r1.getContext()
            android.content.res.Resources r6 = r6.getResources()
            r7 = r2
            r2 = r0
            androidx.recyclerview.widget.l r0 = new androidx.recyclerview.widget.l
            int r8 = androidx.recyclerview.R.dimen.fastscroll_default_thickness
            int r8 = r6.getDimensionPixelSize(r8)
            r17 = r12
            int r12 = androidx.recyclerview.R.dimen.fastscroll_minimum_range
            int r12 = r6.getDimensionPixelSize(r12)
            r18 = r11
            int r11 = androidx.recyclerview.R.dimen.fastscroll_margin
            int r6 = r6.getDimensionPixelOffset(r11)
            r11 = r8
            r8 = r6
            r6 = r11
            r11 = r7
            r7 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L264
        L24e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Trying to set fast scroller without both required drawables."
            r2.<init>(r3)
            java.lang.String r2 = a.C0487z.d(r1, r2)
            r0.<init>(r2)
            throw r0
        L25f:
            r18 = r11
            r17 = r12
            r11 = r2
        L264:
            r11.recycle()
            java.lang.String r2 = ": Could not instantiate the LayoutManager: "
            if (r16 == 0) goto L3cb
            java.lang.String r0 = r16.trim()
            boolean r3 = r0.isEmpty()
            if (r3 != 0) goto L3cb
            char r3 = r0.charAt(r9)
            r4 = 46
            if (r3 != r4) goto L292
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r13.getPackageName()
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
        L290:
            r3 = r0
            goto L2b8
        L292:
            java.lang.String r3 = "."
            boolean r3 = r0.contains(r3)
            if (r3 == 0) goto L29b
            goto L290
        L29b:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.Class<androidx.recyclerview.widget.RecyclerView> r5 = androidx.recyclerview.widget.RecyclerView.class
            java.lang.Package r5 = r5.getPackage()
            java.lang.String r5 = r5.getName()
            r3.append(r5)
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            goto L290
        L2b8:
            boolean r0 = r1.isInEditMode()     // Catch: java.lang.ClassCastException -> L2c7 java.lang.IllegalAccessException -> L2ca java.lang.InstantiationException -> L2cd java.lang.reflect.InvocationTargetException -> L2d0 java.lang.ClassNotFoundException -> L2d3
            if (r0 == 0) goto L2d6
            java.lang.Class r0 = r1.getClass()     // Catch: java.lang.ClassCastException -> L2c7 java.lang.IllegalAccessException -> L2ca java.lang.InstantiationException -> L2cd java.lang.reflect.InvocationTargetException -> L2d0 java.lang.ClassNotFoundException -> L2d3
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch: java.lang.ClassCastException -> L2c7 java.lang.IllegalAccessException -> L2ca java.lang.InstantiationException -> L2cd java.lang.reflect.InvocationTargetException -> L2d0 java.lang.ClassNotFoundException -> L2d3
            goto L2da
        L2c7:
            r0 = move-exception
            goto L339
        L2ca:
            r0 = move-exception
            goto L357
        L2cd:
            r0 = move-exception
            goto L375
        L2d0:
            r0 = move-exception
            goto L391
        L2d3:
            r0 = move-exception
            goto L3ad
        L2d6:
            java.lang.ClassLoader r0 = r13.getClassLoader()     // Catch: java.lang.ClassCastException -> L2c7 java.lang.IllegalAccessException -> L2ca java.lang.InstantiationException -> L2cd java.lang.reflect.InvocationTargetException -> L2d0 java.lang.ClassNotFoundException -> L2d3
        L2da:
            java.lang.Class r0 = java.lang.Class.forName(r3, r9, r0)     // Catch: java.lang.ClassCastException -> L2c7 java.lang.IllegalAccessException -> L2ca java.lang.InstantiationException -> L2cd java.lang.reflect.InvocationTargetException -> L2d0 java.lang.ClassNotFoundException -> L2d3
            java.lang.Class<androidx.recyclerview.widget.RecyclerView$l> r4 = androidx.recyclerview.widget.RecyclerView.l.class
            java.lang.Class r4 = r0.asSubclass(r4)     // Catch: java.lang.ClassCastException -> L2c7 java.lang.IllegalAccessException -> L2ca java.lang.InstantiationException -> L2cd java.lang.reflect.InvocationTargetException -> L2d0 java.lang.ClassNotFoundException -> L2d3
            java.lang.Class<?>[] r0 = androidx.recyclerview.widget.RecyclerView.E0     // Catch: java.lang.ClassCastException -> L2c7 java.lang.IllegalAccessException -> L2ca java.lang.InstantiationException -> L2cd java.lang.reflect.InvocationTargetException -> L2d0 java.lang.ClassNotFoundException -> L2d3 java.lang.NoSuchMethodException -> L302
            java.lang.reflect.Constructor r0 = r4.getConstructor(r0)     // Catch: java.lang.ClassCastException -> L2c7 java.lang.IllegalAccessException -> L2ca java.lang.InstantiationException -> L2cd java.lang.reflect.InvocationTargetException -> L2d0 java.lang.ClassNotFoundException -> L2d3 java.lang.NoSuchMethodException -> L302
            r5 = 4
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.ClassCastException -> L2c7 java.lang.IllegalAccessException -> L2ca java.lang.InstantiationException -> L2cd java.lang.reflect.InvocationTargetException -> L2d0 java.lang.ClassNotFoundException -> L2d3 java.lang.NoSuchMethodException -> L302
            r5[r9] = r13     // Catch: java.lang.ClassCastException -> L2c7 java.lang.IllegalAccessException -> L2ca java.lang.InstantiationException -> L2cd java.lang.reflect.InvocationTargetException -> L2d0 java.lang.ClassNotFoundException -> L2d3 java.lang.NoSuchMethodException -> L302
            r5[r18] = r14     // Catch: java.lang.ClassCastException -> L2c7 java.lang.IllegalAccessException -> L2ca java.lang.InstantiationException -> L2cd java.lang.reflect.InvocationTargetException -> L2d0 java.lang.ClassNotFoundException -> L2d3 java.lang.NoSuchMethodException -> L302
            java.lang.Integer r6 = java.lang.Integer.valueOf(r15)     // Catch: java.lang.ClassCastException -> L2c7 java.lang.IllegalAccessException -> L2ca java.lang.InstantiationException -> L2cd java.lang.reflect.InvocationTargetException -> L2d0 java.lang.ClassNotFoundException -> L2d3 java.lang.NoSuchMethodException -> L302
            r5[r17] = r6     // Catch: java.lang.ClassCastException -> L2c7 java.lang.IllegalAccessException -> L2ca java.lang.InstantiationException -> L2cd java.lang.reflect.InvocationTargetException -> L2d0 java.lang.ClassNotFoundException -> L2d3 java.lang.NoSuchMethodException -> L302
            java.lang.Integer r6 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.ClassCastException -> L2c7 java.lang.IllegalAccessException -> L2ca java.lang.InstantiationException -> L2cd java.lang.reflect.InvocationTargetException -> L2d0 java.lang.ClassNotFoundException -> L2d3 java.lang.NoSuchMethodException -> L302
            r7 = 3
            r5[r7] = r6     // Catch: java.lang.ClassCastException -> L2c7 java.lang.IllegalAccessException -> L2ca java.lang.InstantiationException -> L2cd java.lang.reflect.InvocationTargetException -> L2d0 java.lang.ClassNotFoundException -> L2d3 java.lang.NoSuchMethodException -> L302
            r10 = r5
        L2ff:
            r4 = r18
            goto L309
        L302:
            r0 = move-exception
            r5 = r0
            java.lang.reflect.Constructor r0 = r4.getConstructor(r10)     // Catch: java.lang.ClassCastException -> L2c7 java.lang.IllegalAccessException -> L2ca java.lang.InstantiationException -> L2cd java.lang.reflect.InvocationTargetException -> L2d0 java.lang.ClassNotFoundException -> L2d3 java.lang.NoSuchMethodException -> L317
            goto L2ff
        L309:
            r0.setAccessible(r4)     // Catch: java.lang.ClassCastException -> L2c7 java.lang.IllegalAccessException -> L2ca java.lang.InstantiationException -> L2cd java.lang.reflect.InvocationTargetException -> L2d0 java.lang.ClassNotFoundException -> L2d3
            java.lang.Object r0 = r0.newInstance(r10)     // Catch: java.lang.ClassCastException -> L2c7 java.lang.IllegalAccessException -> L2ca java.lang.InstantiationException -> L2cd java.lang.reflect.InvocationTargetException -> L2d0 java.lang.ClassNotFoundException -> L2d3
            androidx.recyclerview.widget.RecyclerView$l r0 = (androidx.recyclerview.widget.RecyclerView.l) r0     // Catch: java.lang.ClassCastException -> L2c7 java.lang.IllegalAccessException -> L2ca java.lang.InstantiationException -> L2cd java.lang.reflect.InvocationTargetException -> L2d0 java.lang.ClassNotFoundException -> L2d3
            r1.setLayoutManager(r0)     // Catch: java.lang.ClassCastException -> L2c7 java.lang.IllegalAccessException -> L2ca java.lang.InstantiationException -> L2cd java.lang.reflect.InvocationTargetException -> L2d0 java.lang.ClassNotFoundException -> L2d3
            goto L3cb
        L317:
            r0 = move-exception
            r0.initCause(r5)     // Catch: java.lang.ClassCastException -> L2c7 java.lang.IllegalAccessException -> L2ca java.lang.InstantiationException -> L2cd java.lang.reflect.InvocationTargetException -> L2d0 java.lang.ClassNotFoundException -> L2d3
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.ClassCastException -> L2c7 java.lang.IllegalAccessException -> L2ca java.lang.InstantiationException -> L2cd java.lang.reflect.InvocationTargetException -> L2d0 java.lang.ClassNotFoundException -> L2d3
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.ClassCastException -> L2c7 java.lang.IllegalAccessException -> L2ca java.lang.InstantiationException -> L2cd java.lang.reflect.InvocationTargetException -> L2d0 java.lang.ClassNotFoundException -> L2d3
            r5.<init>()     // Catch: java.lang.ClassCastException -> L2c7 java.lang.IllegalAccessException -> L2ca java.lang.InstantiationException -> L2cd java.lang.reflect.InvocationTargetException -> L2d0 java.lang.ClassNotFoundException -> L2d3
            java.lang.String r6 = r14.getPositionDescription()     // Catch: java.lang.ClassCastException -> L2c7 java.lang.IllegalAccessException -> L2ca java.lang.InstantiationException -> L2cd java.lang.reflect.InvocationTargetException -> L2d0 java.lang.ClassNotFoundException -> L2d3
            r5.append(r6)     // Catch: java.lang.ClassCastException -> L2c7 java.lang.IllegalAccessException -> L2ca java.lang.InstantiationException -> L2cd java.lang.reflect.InvocationTargetException -> L2d0 java.lang.ClassNotFoundException -> L2d3
            java.lang.String r6 = ": Error creating LayoutManager "
            r5.append(r6)     // Catch: java.lang.ClassCastException -> L2c7 java.lang.IllegalAccessException -> L2ca java.lang.InstantiationException -> L2cd java.lang.reflect.InvocationTargetException -> L2d0 java.lang.ClassNotFoundException -> L2d3
            r5.append(r3)     // Catch: java.lang.ClassCastException -> L2c7 java.lang.IllegalAccessException -> L2ca java.lang.InstantiationException -> L2cd java.lang.reflect.InvocationTargetException -> L2d0 java.lang.ClassNotFoundException -> L2d3
            java.lang.String r5 = r5.toString()     // Catch: java.lang.ClassCastException -> L2c7 java.lang.IllegalAccessException -> L2ca java.lang.InstantiationException -> L2cd java.lang.reflect.InvocationTargetException -> L2d0 java.lang.ClassNotFoundException -> L2d3
            r4.<init>(r5, r0)     // Catch: java.lang.ClassCastException -> L2c7 java.lang.IllegalAccessException -> L2ca java.lang.InstantiationException -> L2cd java.lang.reflect.InvocationTargetException -> L2d0 java.lang.ClassNotFoundException -> L2d3
            throw r4     // Catch: java.lang.ClassCastException -> L2c7 java.lang.IllegalAccessException -> L2ca java.lang.InstantiationException -> L2cd java.lang.reflect.InvocationTargetException -> L2d0 java.lang.ClassNotFoundException -> L2d3
        L339:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = r14.getPositionDescription()
            r4.append(r5)
            java.lang.String r5 = ": Class is not a LayoutManager "
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r2.<init>(r3, r0)
            throw r2
        L357:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = r14.getPositionDescription()
            r4.append(r5)
            java.lang.String r5 = ": Cannot access non-public constructor "
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r2.<init>(r3, r0)
            throw r2
        L375:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = r14.getPositionDescription()
            r5.append(r6)
            r5.append(r2)
            r5.append(r3)
            java.lang.String r2 = r5.toString()
            r4.<init>(r2, r0)
            throw r4
        L391:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = r14.getPositionDescription()
            r5.append(r6)
            r5.append(r2)
            r5.append(r3)
            java.lang.String r2 = r5.toString()
            r4.<init>(r2, r0)
            throw r4
        L3ad:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = r14.getPositionDescription()
            r4.append(r5)
            java.lang.String r5 = ": Unable to find LayoutManager "
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r2.<init>(r3, r0)
            throw r2
        L3cb:
            int[] r3 = androidx.recyclerview.widget.RecyclerView.A0
            android.content.res.TypedArray r5 = r13.obtainStyledAttributes(r14, r3, r15, r9)
            r2 = r13
            r4 = r14
            r6 = r15
            a.C0414ug.i(r1, r2, r3, r4, r5, r6)
            r4 = 1
            boolean r0 = r5.getBoolean(r9, r4)
            r5.recycle()
            r1.setNestedScrollingEnabled(r0)
            int r0 = a.C0500zc.f779a
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            int r2 = a.C0500zc.b
            r1.setTag(r2, r0)
            return
    }

    public static androidx.recyclerview.widget.RecyclerView G(android.view.View r4) {
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
            androidx.recyclerview.widget.RecyclerView r3 = G(r3)
            if (r3 == 0) goto L21
            return r3
        L21:
            int r2 = r2 + 1
            goto L14
        L24:
            return r1
    }

    public static androidx.recyclerview.widget.RecyclerView.A L(android.view.View r0) {
            if (r0 != 0) goto L4
            r0 = 0
            return r0
        L4:
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$m r0 = (androidx.recyclerview.widget.RecyclerView.m) r0
            androidx.recyclerview.widget.RecyclerView$A r0 = r0.f975a
            return r0
    }

    public static /* synthetic */ void a(androidx.recyclerview.widget.RecyclerView r0, android.view.View r1, int r2, android.view.ViewGroup.LayoutParams r3) {
            r0.attachViewToParent(r1, r2, r3)
            return
    }

    public static /* synthetic */ void b(androidx.recyclerview.widget.RecyclerView r0, int r1) {
            r0.detachViewFromParent(r1)
            return
    }

    public static /* synthetic */ boolean d(androidx.recyclerview.widget.RecyclerView r0) {
            boolean r0 = r0.awakenScrollBars()
            return r0
    }

    public static /* synthetic */ void e(androidx.recyclerview.widget.RecyclerView r0, android.view.View r1, int r2, android.view.ViewGroup.LayoutParams r3) {
            r0.attachViewToParent(r1, r2, r3)
            return
    }

    public static /* synthetic */ void f(androidx.recyclerview.widget.RecyclerView r0, android.view.View r1) {
            r0.detachViewFromParent(r1)
            return
    }

    public static /* synthetic */ void g(androidx.recyclerview.widget.RecyclerView r0, int r1, int r2) {
            r0.setMeasuredDimension(r1, r2)
            return
    }

    private a.Jb getScrollingChildHelper() {
            r1 = this;
            a.Jb r0 = r1.o0
            if (r0 != 0) goto Lb
            a.Jb r0 = new a.Jb
            r0.<init>(r1)
            r1.o0 = r0
        Lb:
            a.Jb r0 = r1.o0
            return r0
    }

    public static void l(androidx.recyclerview.widget.RecyclerView.A r3) {
            java.lang.ref.WeakReference<androidx.recyclerview.widget.RecyclerView> r0 = r3.b
            if (r0 == 0) goto L21
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
        La:
            r1 = 0
            if (r0 == 0) goto L1f
            android.view.View r2 = r3.f963a
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

    public static int o(int r4, android.widget.EdgeEffect r5, android.widget.EdgeEffect r6, int r7) {
            r0 = 1056964608(0x3f000000, float:0.5)
            r1 = 0
            r2 = 1082130432(0x40800000, float:4.0)
            if (r4 <= 0) goto L29
            if (r5 == 0) goto L29
            float r3 = a.G5.a(r5)
            int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r3 == 0) goto L29
            int r6 = -r4
            float r6 = (float) r6
            float r6 = r6 * r2
            float r1 = (float) r7
            float r6 = r6 / r1
            int r7 = -r7
            float r7 = (float) r7
            float r7 = r7 / r2
            float r6 = a.G5.b(r5, r6, r0)
            float r6 = r6 * r7
            int r6 = java.lang.Math.round(r6)
            if (r6 == r4) goto L27
            r5.finish()
        L27:
            int r4 = r4 - r6
            return r4
        L29:
            if (r4 >= 0) goto L49
            if (r6 == 0) goto L49
            float r5 = a.G5.a(r6)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 == 0) goto L49
            float r5 = (float) r4
            float r5 = r5 * r2
            float r7 = (float) r7
            float r5 = r5 / r7
            float r7 = r7 / r2
            float r5 = a.G5.b(r6, r5, r0)
            float r5 = r5 * r7
            int r5 = java.lang.Math.round(r5)
            if (r5 == r4) goto L48
            r6.finish()
        L48:
            int r4 = r4 - r5
        L49:
            return r4
    }

    public static void setDebugAssertionsEnabled(boolean r0) {
            androidx.recyclerview.widget.RecyclerView.y0 = r0
            return
    }

    public static void setVerboseLoggingEnabled(boolean r0) {
            androidx.recyclerview.widget.RecyclerView.z0 = r0
            return
    }

    public final void A() {
            r4 = this;
            android.widget.EdgeEffect r0 = r4.H
            if (r0 == 0) goto L5
            return
        L5:
            androidx.recyclerview.widget.RecyclerView$h r0 = r4.F
            androidx.recyclerview.widget.RecyclerView$x r0 = (androidx.recyclerview.widget.RecyclerView.x) r0
            r0.getClass()
            android.widget.EdgeEffect r0 = new android.widget.EdgeEffect
            android.content.Context r1 = r4.getContext()
            r0.<init>(r1)
            r4.H = r0
            boolean r1 = r4.h
            if (r1 == 0) goto L3b
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
        L3b:
            int r1 = r4.getMeasuredWidth()
            int r2 = r4.getMeasuredHeight()
            r0.setSize(r1, r2)
            return
    }

    public final java.lang.String B() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = " "
            r0.<init>(r1)
            java.lang.String r1 = super.toString()
            r0.append(r1)
            java.lang.String r1 = ", adapter:"
            r0.append(r1)
            androidx.recyclerview.widget.RecyclerView$d r1 = r2.l
            r0.append(r1)
            java.lang.String r1 = ", layout:"
            r0.append(r1)
            androidx.recyclerview.widget.RecyclerView$l r1 = r2.m
            r0.append(r1)
            java.lang.String r1 = ", context:"
            r0.append(r1)
            android.content.Context r1 = r2.getContext()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public final void C(androidx.recyclerview.widget.RecyclerView.w r3) {
            r2 = this;
            int r0 = r2.getScrollState()
            r1 = 2
            if (r0 != r1) goto L1b
            androidx.recyclerview.widget.RecyclerView$z r0 = r2.c0
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

    public final android.view.View D(android.view.View r3) {
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

    public final boolean E(android.view.MotionEvent r8) {
            r7 = this;
            int r0 = r8.getAction()
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$o> r1 = r7.q
            int r2 = r1.size()
            r3 = 0
            r4 = r3
        Lc:
            if (r4 >= r2) goto L24
            java.lang.Object r5 = r1.get(r4)
            androidx.recyclerview.widget.RecyclerView$o r5 = (androidx.recyclerview.widget.RecyclerView.o) r5
            boolean r6 = r5.a(r8)
            if (r6 == 0) goto L21
            r6 = 3
            if (r0 == r6) goto L21
            r7.r = r5
            r8 = 1
            return r8
        L21:
            int r4 = r4 + 1
            goto Lc
        L24:
            return r3
    }

    public final void F(int[] r9) {
            r8 = this;
            androidx.recyclerview.widget.b r0 = r8.f
            int r0 = r0.e()
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
            androidx.recyclerview.widget.b r6 = r8.f
            android.view.View r6 = r6.d(r5)
            androidx.recyclerview.widget.RecyclerView$A r6 = L(r6)
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

    public final androidx.recyclerview.widget.RecyclerView.A H(int r6) {
            r5 = this;
            boolean r0 = r5.B
            r1 = 0
            if (r0 == 0) goto L6
            return r1
        L6:
            androidx.recyclerview.widget.b r0 = r5.f
            int r0 = r0.h()
            r2 = 0
        Ld:
            if (r2 >= r0) goto L39
            androidx.recyclerview.widget.b r3 = r5.f
            android.view.View r3 = r3.g(r2)
            androidx.recyclerview.widget.RecyclerView$A r3 = L(r3)
            if (r3 == 0) goto L36
            boolean r4 = r3.h()
            if (r4 != 0) goto L36
            int r4 = r5.I(r3)
            if (r4 != r6) goto L36
            androidx.recyclerview.widget.b r1 = r5.f
            java.util.ArrayList r1 = r1.c
            android.view.View r4 = r3.f963a
            boolean r1 = r1.contains(r4)
            if (r1 == 0) goto L35
            r1 = r3
            goto L36
        L35:
            return r3
        L36:
            int r2 = r2 + 1
            goto Ld
        L39:
            return r1
    }

    public final int I(androidx.recyclerview.widget.RecyclerView.A r8) {
            r7 = this;
            int r0 = r8.j
            r0 = r0 & 524(0x20c, float:7.34E-43)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto La
            r0 = r2
            goto Lb
        La:
            r0 = r1
        Lb:
            if (r0 != 0) goto L5b
            boolean r0 = r8.e()
            if (r0 != 0) goto L14
            goto L5b
        L14:
            androidx.recyclerview.widget.a r0 = r7.e
            int r8 = r8.c
            java.util.ArrayList<androidx.recyclerview.widget.a$a> r0 = r0.b
            int r3 = r0.size()
        L1e:
            if (r1 >= r3) goto L5a
            java.lang.Object r4 = r0.get(r1)
            androidx.recyclerview.widget.a$a r4 = (androidx.recyclerview.widget.C0506a.C0023a) r4
            int r5 = r4.f991a
            if (r5 == r2) goto L50
            r6 = 2
            if (r5 == r6) goto L44
            r6 = 8
            if (r5 == r6) goto L32
            goto L57
        L32:
            int r5 = r4.b
            if (r5 != r8) goto L39
            int r8 = r4.c
            goto L57
        L39:
            if (r5 >= r8) goto L3d
            int r8 = r8 + (-1)
        L3d:
            int r4 = r4.c
            if (r4 > r8) goto L57
            int r8 = r8 + 1
            goto L57
        L44:
            int r5 = r4.b
            if (r5 > r8) goto L57
            int r4 = r4.c
            int r5 = r5 + r4
            if (r5 <= r8) goto L4e
            goto L5b
        L4e:
            int r8 = r8 - r4
            goto L57
        L50:
            int r5 = r4.b
            if (r5 > r8) goto L57
            int r4 = r4.c
            int r8 = r8 + r4
        L57:
            int r1 = r1 + 1
            goto L1e
        L5a:
            return r8
        L5b:
            r8 = -1
            return r8
    }

    public final long J(androidx.recyclerview.widget.RecyclerView.A r3) {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView$d r0 = r2.l
            boolean r0 = r0.b
            if (r0 == 0) goto L9
            long r0 = r3.e
            return r0
        L9:
            int r3 = r3.c
            long r0 = (long) r3
            return r0
    }

    public final androidx.recyclerview.widget.RecyclerView.A K(android.view.View r4) {
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
            androidx.recyclerview.widget.RecyclerView$A r4 = L(r4)
            return r4
    }

    public final android.graphics.Rect M(android.view.View r10) {
            r9 = this;
            android.view.ViewGroup$LayoutParams r0 = r10.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$m r0 = (androidx.recyclerview.widget.RecyclerView.m) r0
            boolean r1 = r0.c
            android.graphics.Rect r2 = r0.b
            if (r1 != 0) goto Ld
            goto L23
        Ld:
            androidx.recyclerview.widget.RecyclerView$w r1 = r9.f0
            boolean r1 = r1.g
            if (r1 == 0) goto L24
            androidx.recyclerview.widget.RecyclerView$A r1 = r0.f975a
            boolean r1 = r1.k()
            if (r1 != 0) goto L23
            androidx.recyclerview.widget.RecyclerView$A r1 = r0.f975a
            boolean r1 = r1.f()
            if (r1 == 0) goto L24
        L23:
            return r2
        L24:
            r1 = 0
            r2.set(r1, r1, r1, r1)
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$k> r3 = r9.p
            int r4 = r3.size()
            r5 = r1
        L2f:
            if (r5 >= r4) goto L6c
            android.graphics.Rect r6 = r9.i
            r6.set(r1, r1, r1, r1)
            java.lang.Object r7 = r3.get(r5)
            androidx.recyclerview.widget.RecyclerView$k r7 = (androidx.recyclerview.widget.RecyclerView.k) r7
            r7.getClass()
            android.view.ViewGroup$LayoutParams r7 = r10.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$m r7 = (androidx.recyclerview.widget.RecyclerView.m) r7
            androidx.recyclerview.widget.RecyclerView$A r7 = r7.f975a
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

    public final boolean N() {
            r1 = this;
            boolean r0 = r1.u
            if (r0 == 0) goto L13
            boolean r0 = r1.B
            if (r0 != 0) goto L13
            androidx.recyclerview.widget.a r0 = r1.e
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

    public final boolean O() {
            r1 = this;
            int r0 = r1.D
            if (r0 <= 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public final void P(int r2) {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView$l r0 = r1.m
            if (r0 != 0) goto L5
            return
        L5:
            r0 = 2
            r1.setScrollState(r0)
            androidx.recyclerview.widget.RecyclerView$l r0 = r1.m
            r0.p0(r2)
            r1.awakenScrollBars()
            return
    }

    public final void Q() {
            r5 = this;
            androidx.recyclerview.widget.b r0 = r5.f
            int r0 = r0.h()
            r1 = 0
            r2 = r1
        L8:
            r3 = 1
            if (r2 >= r0) goto L1c
            androidx.recyclerview.widget.b r4 = r5.f
            android.view.View r4 = r4.g(r2)
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$m r4 = (androidx.recyclerview.widget.RecyclerView.m) r4
            r4.c = r3
            int r2 = r2 + 1
            goto L8
        L1c:
            androidx.recyclerview.widget.RecyclerView$r r0 = r5.c
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$A> r0 = r0.c
            int r2 = r0.size()
        L24:
            if (r1 >= r2) goto L3b
            java.lang.Object r4 = r0.get(r1)
            androidx.recyclerview.widget.RecyclerView$A r4 = (androidx.recyclerview.widget.RecyclerView.A) r4
            android.view.View r4 = r4.f963a
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$m r4 = (androidx.recyclerview.widget.RecyclerView.m) r4
            if (r4 == 0) goto L38
            r4.c = r3
        L38:
            int r1 = r1 + 1
            goto L24
        L3b:
            return
    }

    public final void R(int r13, int r14, boolean r15) {
            r12 = this;
            int r0 = r13 + r14
            androidx.recyclerview.widget.b r1 = r12.f
            int r1 = r1.h()
            r2 = 0
        L9:
            r3 = 1
            r4 = 8
            java.lang.String r5 = " now at position "
            java.lang.String r6 = " holder "
            java.lang.String r7 = "RecyclerView"
            if (r2 >= r1) goto L87
            androidx.recyclerview.widget.b r8 = r12.f
            android.view.View r8 = r8.g(r2)
            androidx.recyclerview.widget.RecyclerView$A r8 = L(r8)
            if (r8 == 0) goto L84
            boolean r9 = r8.o()
            if (r9 != 0) goto L84
            int r9 = r8.c
            androidx.recyclerview.widget.RecyclerView$w r10 = r12.f0
            java.lang.String r11 = "offsetPositionRecordsForRemove attached child "
            if (r9 < r0) goto L57
            boolean r4 = androidx.recyclerview.widget.RecyclerView.z0
            if (r4 == 0) goto L50
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r11)
            r4.append(r2)
            r4.append(r6)
            r4.append(r8)
            r4.append(r5)
            int r5 = r8.c
            int r5 = r5 - r14
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            android.util.Log.d(r7, r4)
        L50:
            int r4 = -r14
            r8.l(r4, r15)
            r10.f = r3
            goto L84
        L57:
            if (r9 < r13) goto L84
            boolean r5 = androidx.recyclerview.widget.RecyclerView.z0
            if (r5 == 0) goto L77
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r11)
            r5.append(r2)
            r5.append(r6)
            r5.append(r8)
            java.lang.String r6 = " now REMOVED"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            android.util.Log.d(r7, r5)
        L77:
            int r5 = r13 + (-1)
            int r6 = -r14
            r8.a(r4)
            r8.l(r6, r15)
            r8.c = r5
            r10.f = r3
        L84:
            int r2 = r2 + 1
            goto L9
        L87:
            androidx.recyclerview.widget.RecyclerView$r r1 = r12.c
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$A> r2 = r1.c
            int r8 = r2.size()
            int r8 = r8 - r3
        L90:
            if (r8 < 0) goto Ld2
            java.lang.Object r3 = r2.get(r8)
            androidx.recyclerview.widget.RecyclerView$A r3 = (androidx.recyclerview.widget.RecyclerView.A) r3
            if (r3 == 0) goto Lcf
            int r9 = r3.c
            if (r9 < r0) goto Lc7
            boolean r9 = androidx.recyclerview.widget.RecyclerView.z0
            if (r9 == 0) goto Lc2
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "offsetPositionRecordsForRemove cached "
            r9.<init>(r10)
            r9.append(r8)
            r9.append(r6)
            r9.append(r3)
            r9.append(r5)
            int r10 = r3.c
            int r10 = r10 - r14
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            android.util.Log.d(r7, r9)
        Lc2:
            int r9 = -r14
            r3.l(r9, r15)
            goto Lcf
        Lc7:
            if (r9 < r13) goto Lcf
            r3.a(r4)
            r1.g(r8)
        Lcf:
            int r8 = r8 + (-1)
            goto L90
        Ld2:
            r12.requestLayout()
            return
    }

    public final void S() {
            r1 = this;
            int r0 = r1.D
            int r0 = r0 + 1
            r1.D = r0
            return
    }

    public final void T(boolean r6) {
            r5 = this;
            r0 = -1
            int r1 = r5.D
            r2 = 1
            int r1 = r1 - r2
            r5.D = r1
            if (r1 >= r2) goto L75
            boolean r3 = androidx.recyclerview.widget.RecyclerView.y0
            if (r3 == 0) goto L21
            if (r1 < 0) goto L10
            goto L21
        L10:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "layout or scroll counter cannot go below zero.Some calls are not matching"
            r0.<init>(r1)
            java.lang.String r0 = a.C0487z.d(r5, r0)
            r6.<init>(r0)
            throw r6
        L21:
            r1 = 0
            r5.D = r1
            if (r6 == 0) goto L75
            int r6 = r5.z
            r5.z = r1
            if (r6 == 0) goto L45
            android.view.accessibility.AccessibilityManager r1 = r5.A
            if (r1 == 0) goto L45
            boolean r1 = r1.isEnabled()
            if (r1 == 0) goto L45
            android.view.accessibility.AccessibilityEvent r1 = android.view.accessibility.AccessibilityEvent.obtain()
            r3 = 2048(0x800, float:2.87E-42)
            r1.setEventType(r3)
            r1.setContentChangeTypes(r6)
            r5.sendAccessibilityEventUnchecked(r1)
        L45:
            java.util.ArrayList r6 = r5.s0
            int r1 = r6.size()
            int r1 = r1 - r2
        L4c:
            if (r1 < 0) goto L72
            java.lang.Object r2 = r6.get(r1)
            androidx.recyclerview.widget.RecyclerView$A r2 = (androidx.recyclerview.widget.RecyclerView.A) r2
            android.view.View r3 = r2.f963a
            android.view.ViewParent r3 = r3.getParent()
            if (r3 != r5) goto L70
            boolean r3 = r2.o()
            if (r3 == 0) goto L63
            goto L70
        L63:
            int r3 = r2.q
            if (r3 == r0) goto L70
            java.util.WeakHashMap<android.view.View, a.Jg> r4 = a.C0414ug.f721a
            android.view.View r4 = r2.f963a
            r4.setImportantForAccessibility(r3)
            r2.q = r0
        L70:
            int r1 = r1 + r0
            goto L4c
        L72:
            r6.clear()
        L75:
            return
    }

    public final void U(android.view.MotionEvent r4) {
            r3 = this;
            int r0 = r4.getActionIndex()
            int r1 = r4.getPointerId(r0)
            int r2 = r3.M
            if (r1 != r2) goto L2d
            if (r0 != 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            int r1 = r4.getPointerId(r0)
            r3.M = r1
            float r1 = r4.getX(r0)
            r2 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r2
            int r1 = (int) r1
            r3.Q = r1
            r3.O = r1
            float r4 = r4.getY(r0)
            float r4 = r4 + r2
            int r4 = (int) r4
            r3.R = r4
            r3.P = r4
        L2d:
            return
    }

    public final void V() {
            r1 = this;
            boolean r0 = r1.l0
            if (r0 != 0) goto L12
            boolean r0 = r1.s
            if (r0 == 0) goto L12
            java.util.WeakHashMap<android.view.View, a.Jg> r0 = a.C0414ug.f721a
            androidx.recyclerview.widget.RecyclerView$a r0 = r1.t0
            r1.postOnAnimation(r0)
            r0 = 1
            r1.l0 = r0
        L12:
            return
    }

    public final void W(boolean r7) {
            r6 = this;
            boolean r0 = r6.C
            r7 = r7 | r0
            r6.C = r7
            r7 = 1
            r6.B = r7
            androidx.recyclerview.widget.b r7 = r6.f
            int r7 = r7.h()
            r0 = 0
            r1 = r0
        L10:
            r2 = 6
            if (r1 >= r7) goto L2b
            androidx.recyclerview.widget.b r3 = r6.f
            android.view.View r3 = r3.g(r1)
            androidx.recyclerview.widget.RecyclerView$A r3 = L(r3)
            if (r3 == 0) goto L28
            boolean r4 = r3.o()
            if (r4 != 0) goto L28
            r3.a(r2)
        L28:
            int r1 = r1 + 1
            goto L10
        L2b:
            r6.Q()
            androidx.recyclerview.widget.RecyclerView$r r7 = r6.c
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$A> r1 = r7.c
            int r3 = r1.size()
        L36:
            if (r0 >= r3) goto L4b
            java.lang.Object r4 = r1.get(r0)
            androidx.recyclerview.widget.RecyclerView$A r4 = (androidx.recyclerview.widget.RecyclerView.A) r4
            if (r4 == 0) goto L48
            r4.a(r2)
            r5 = 1024(0x400, float:1.435E-42)
            r4.a(r5)
        L48:
            int r0 = r0 + 1
            goto L36
        L4b:
            androidx.recyclerview.widget.RecyclerView r0 = r7.h
            androidx.recyclerview.widget.RecyclerView$d r0 = r0.l
            if (r0 == 0) goto L57
            boolean r0 = r0.b
            if (r0 != 0) goto L56
            goto L57
        L56:
            return
        L57:
            r7.f()
            return
    }

    public final void X(androidx.recyclerview.widget.RecyclerView.A r5, androidx.recyclerview.widget.RecyclerView.i.b r6) {
            r4 = this;
            int r0 = r5.j
            r0 = r0 & (-8193(0xffffffffffffdfff, float:NaN))
            r5.j = r0
            androidx.recyclerview.widget.RecyclerView$w r0 = r4.f0
            boolean r0 = r0.h
            androidx.recyclerview.widget.C r1 = r4.g
            if (r0 == 0) goto L29
            boolean r0 = r5.k()
            if (r0 == 0) goto L29
            boolean r0 = r5.h()
            if (r0 != 0) goto L29
            boolean r0 = r5.o()
            if (r0 != 0) goto L29
            long r2 = r4.J(r5)
            a.U9<androidx.recyclerview.widget.RecyclerView$A> r0 = r1.b
            r0.d(r2, r5)
        L29:
            a.ge<androidx.recyclerview.widget.RecyclerView$A, androidx.recyclerview.widget.C$a> r0 = r1.f955a
            r1 = 0
            java.lang.Object r1 = r0.getOrDefault(r5, r1)
            androidx.recyclerview.widget.C$a r1 = (androidx.recyclerview.widget.C.a) r1
            if (r1 != 0) goto L3b
            androidx.recyclerview.widget.C$a r1 = androidx.recyclerview.widget.C.a.a()
            r0.put(r5, r1)
        L3b:
            r1.b = r6
            int r5 = r1.f956a
            r5 = r5 | 4
            r1.f956a = r5
            return
    }

    public final int Y(int r4, float r5) {
            r3 = this;
            int r0 = r3.getHeight()
            float r0 = (float) r0
            float r5 = r5 / r0
            float r4 = (float) r4
            int r0 = r3.getWidth()
            float r0 = (float) r0
            float r4 = r4 / r0
            android.widget.EdgeEffect r0 = r3.G
            r1 = 0
            if (r0 == 0) goto L46
            float r0 = a.G5.a(r0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L46
            r0 = -1
            boolean r0 = r3.canScrollHorizontally(r0)
            if (r0 == 0) goto L27
            android.widget.EdgeEffect r4 = r3.G
            r4.onRelease()
            goto L42
        L27:
            android.widget.EdgeEffect r0 = r3.G
            float r4 = -r4
            r2 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 - r5
            float r4 = a.G5.b(r0, r4, r2)
            float r4 = -r4
            android.widget.EdgeEffect r5 = r3.G
            float r5 = a.G5.a(r5)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L41
            android.widget.EdgeEffect r5 = r3.G
            r5.onRelease()
        L41:
            r1 = r4
        L42:
            r3.invalidate()
            goto L78
        L46:
            android.widget.EdgeEffect r0 = r3.I
            if (r0 == 0) goto L78
            float r0 = a.G5.a(r0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L78
            r0 = 1
            boolean r0 = r3.canScrollHorizontally(r0)
            if (r0 == 0) goto L5f
            android.widget.EdgeEffect r4 = r3.I
            r4.onRelease()
            goto L75
        L5f:
            android.widget.EdgeEffect r0 = r3.I
            float r4 = a.G5.b(r0, r4, r5)
            android.widget.EdgeEffect r5 = r3.I
            float r5 = a.G5.a(r5)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L74
            android.widget.EdgeEffect r5 = r3.I
            r5.onRelease()
        L74:
            r1 = r4
        L75:
            r3.invalidate()
        L78:
            int r4 = r3.getWidth()
            float r4 = (float) r4
            float r1 = r1 * r4
            int r4 = java.lang.Math.round(r1)
            return r4
    }

    public final int Z(int r4, float r5) {
            r3 = this;
            int r0 = r3.getWidth()
            float r0 = (float) r0
            float r5 = r5 / r0
            float r4 = (float) r4
            int r0 = r3.getHeight()
            float r0 = (float) r0
            float r4 = r4 / r0
            android.widget.EdgeEffect r0 = r3.H
            r1 = 0
            if (r0 == 0) goto L43
            float r0 = a.G5.a(r0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L43
            r0 = -1
            boolean r0 = r3.canScrollVertically(r0)
            if (r0 == 0) goto L27
            android.widget.EdgeEffect r4 = r3.H
            r4.onRelease()
            goto L3f
        L27:
            android.widget.EdgeEffect r0 = r3.H
            float r4 = -r4
            float r4 = a.G5.b(r0, r4, r5)
            float r4 = -r4
            android.widget.EdgeEffect r5 = r3.H
            float r5 = a.G5.a(r5)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L3e
            android.widget.EdgeEffect r5 = r3.H
            r5.onRelease()
        L3e:
            r1 = r4
        L3f:
            r3.invalidate()
            goto L78
        L43:
            android.widget.EdgeEffect r0 = r3.J
            if (r0 == 0) goto L78
            float r0 = a.G5.a(r0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L78
            r0 = 1
            boolean r0 = r3.canScrollVertically(r0)
            if (r0 == 0) goto L5c
            android.widget.EdgeEffect r4 = r3.J
            r4.onRelease()
            goto L75
        L5c:
            android.widget.EdgeEffect r0 = r3.J
            r2 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 - r5
            float r4 = a.G5.b(r0, r4, r2)
            android.widget.EdgeEffect r5 = r3.J
            float r5 = a.G5.a(r5)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L74
            android.widget.EdgeEffect r5 = r3.J
            r5.onRelease()
        L74:
            r1 = r4
        L75:
            r3.invalidate()
        L78:
            int r4 = r3.getHeight()
            float r4 = (float) r4
            float r1 = r1 * r4
            int r4 = java.lang.Math.round(r1)
            return r4
    }

    public final void a0(android.view.View r12, android.view.View r13) {
            r11 = this;
            if (r13 == 0) goto L4
            r0 = r13
            goto L5
        L4:
            r0 = r12
        L5:
            int r1 = r0.getWidth()
            int r2 = r0.getHeight()
            android.graphics.Rect r3 = r11.i
            r4 = 0
            r3.set(r4, r4, r1, r2)
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            boolean r1 = r0 instanceof androidx.recyclerview.widget.RecyclerView.m
            if (r1 == 0) goto L3f
            androidx.recyclerview.widget.RecyclerView$m r0 = (androidx.recyclerview.widget.RecyclerView.m) r0
            boolean r1 = r0.c
            if (r1 != 0) goto L3f
            int r1 = r3.left
            android.graphics.Rect r0 = r0.b
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
            androidx.recyclerview.widget.RecyclerView$l r5 = r11.m
            boolean r0 = r11.u
            r1 = 1
            r9 = r0 ^ 1
            if (r13 != 0) goto L52
            r10 = r1
            goto L53
        L52:
            r10 = r4
        L53:
            android.graphics.Rect r8 = r11.i
            r6 = r11
            r7 = r12
            r5.m0(r6, r7, r8, r9, r10)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(java.util.ArrayList<android.view.View> r2, int r3, int r4) {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView$l r0 = r1.m
            if (r0 == 0) goto L7
            r0.getClass()
        L7:
            super.addFocusables(r2, r3, r4)
            return
    }

    public final void b0() {
            r2 = this;
            android.view.VelocityTracker r0 = r2.N
            if (r0 == 0) goto L7
            r0.clear()
        L7:
            r0 = 0
            r2.j0(r0)
            android.widget.EdgeEffect r1 = r2.G
            if (r1 == 0) goto L18
            r1.onRelease()
            android.widget.EdgeEffect r0 = r2.G
            boolean r0 = r0.isFinished()
        L18:
            android.widget.EdgeEffect r1 = r2.H
            if (r1 == 0) goto L26
            r1.onRelease()
            android.widget.EdgeEffect r1 = r2.H
            boolean r1 = r1.isFinished()
            r0 = r0 | r1
        L26:
            android.widget.EdgeEffect r1 = r2.I
            if (r1 == 0) goto L34
            r1.onRelease()
            android.widget.EdgeEffect r1 = r2.I
            boolean r1 = r1.isFinished()
            r0 = r0 | r1
        L34:
            android.widget.EdgeEffect r1 = r2.J
            if (r1 == 0) goto L42
            r1.onRelease()
            android.widget.EdgeEffect r1 = r2.J
            boolean r1 = r1.isFinished()
            r0 = r0 | r1
        L42:
            if (r0 == 0) goto L49
            java.util.WeakHashMap<android.view.View, a.Jg> r0 = a.C0414ug.f721a
            r2.postInvalidateOnAnimation()
        L49:
            return
    }

    public final boolean c0(int r18, int r19, android.view.MotionEvent r20, int r21) {
            r17 = this;
            r0 = r17
            r8 = r18
            r9 = r19
            r0.p()
            androidx.recyclerview.widget.RecyclerView$d r1 = r0.l
            int[] r7 = r0.r0
            r10 = 1
            r11 = 0
            if (r1 == 0) goto L21
            r7[r11] = r11
            r7[r10] = r11
            r0.d0(r8, r9, r7)
            r1 = r7[r11]
            r2 = r7[r10]
            int r3 = r8 - r1
            int r4 = r9 - r2
            goto L25
        L21:
            r1 = r11
            r2 = r1
            r3 = r2
            r4 = r3
        L25:
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$k> r5 = r0.p
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L30
            r0.invalidate()
        L30:
            r7[r11] = r11
            r7[r10] = r11
            int[] r5 = r0.p0
            r6 = r21
            r0.v(r1, r2, r3, r4, r5, r6, r7)
            r5 = r7[r11]
            int r3 = r3 - r5
            r6 = r7[r10]
            int r4 = r4 - r6
            if (r5 != 0) goto L48
            if (r6 == 0) goto L46
            goto L48
        L46:
            r5 = r11
            goto L49
        L48:
            r5 = r10
        L49:
            int r6 = r0.Q
            int[] r7 = r0.p0
            r12 = r7[r11]
            int r6 = r6 - r12
            r0.Q = r6
            int r6 = r0.R
            r7 = r7[r10]
            int r6 = r6 - r7
            r0.R = r6
            int[] r6 = r0.q0
            r13 = r6[r11]
            int r13 = r13 + r12
            r6[r11] = r13
            r12 = r6[r10]
            int r12 = r12 + r7
            r6[r10] = r12
            int r6 = r0.getOverScrollMode()
            r7 = 2
            if (r6 == r7) goto L10f
            if (r20 == 0) goto L77
            int r6 = r20.getSource()
            r7 = 8194(0x2002, float:1.1482E-41)
            r6 = r6 & r7
            if (r6 != r7) goto L7b
        L77:
            r16 = r10
            goto L10b
        L7b:
            float r6 = r20.getX()
            float r3 = (float) r3
            float r7 = r20.getY()
            float r4 = (float) r4
            r12 = 0
            int r13 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            r14 = 1065353216(0x3f800000, float:1.0)
            if (r13 >= 0) goto La8
            r0.y()
            android.widget.EdgeEffect r13 = r0.G
            float r15 = -r3
            r16 = r10
            int r10 = r0.getWidth()
            float r10 = (float) r10
            float r15 = r15 / r10
            int r10 = r0.getHeight()
            float r10 = (float) r10
            float r7 = r7 / r10
            float r7 = r14 - r7
            a.G5.b(r13, r15, r7)
        La5:
            r7 = r16
            goto Lc5
        La8:
            r16 = r10
            int r10 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r10 <= 0) goto Lc4
            r0.z()
            android.widget.EdgeEffect r10 = r0.I
            int r13 = r0.getWidth()
            float r13 = (float) r13
            float r13 = r3 / r13
            int r15 = r0.getHeight()
            float r15 = (float) r15
            float r7 = r7 / r15
            a.G5.b(r10, r13, r7)
            goto La5
        Lc4:
            r7 = r11
        Lc5:
            int r10 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r10 >= 0) goto Le1
            r0.A()
            android.widget.EdgeEffect r7 = r0.H
            float r10 = -r4
            int r13 = r0.getHeight()
            float r13 = (float) r13
            float r10 = r10 / r13
            int r13 = r0.getWidth()
            float r13 = (float) r13
            float r6 = r6 / r13
            a.G5.b(r7, r10, r6)
        Lde:
            r7 = r16
            goto Lfc
        Le1:
            int r10 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r10 <= 0) goto Lfc
            r0.x()
            android.widget.EdgeEffect r7 = r0.J
            int r10 = r0.getHeight()
            float r10 = (float) r10
            float r10 = r4 / r10
            int r13 = r0.getWidth()
            float r13 = (float) r13
            float r6 = r6 / r13
            float r14 = r14 - r6
            a.G5.b(r7, r10, r14)
            goto Lde
        Lfc:
            if (r7 != 0) goto L106
            int r3 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r3 != 0) goto L106
            int r3 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r3 == 0) goto L10b
        L106:
            java.util.WeakHashMap<android.view.View, a.Jg> r3 = a.C0414ug.f721a
            r0.postInvalidateOnAnimation()
        L10b:
            r17.n(r18, r19)
            goto L111
        L10f:
            r16 = r10
        L111:
            if (r1 != 0) goto L115
            if (r2 == 0) goto L118
        L115:
            r0.w(r1, r2)
        L118:
            boolean r3 = r0.awakenScrollBars()
            if (r3 != 0) goto L121
            r0.invalidate()
        L121:
            if (r5 != 0) goto L129
            if (r1 != 0) goto L129
            if (r2 == 0) goto L128
            goto L129
        L128:
            return r11
        L129:
            return r16
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(android.view.ViewGroup.LayoutParams r2) {
            r1 = this;
            boolean r0 = r2 instanceof androidx.recyclerview.widget.RecyclerView.m
            if (r0 == 0) goto L10
            androidx.recyclerview.widget.RecyclerView$l r0 = r1.m
            androidx.recyclerview.widget.RecyclerView$m r2 = (androidx.recyclerview.widget.RecyclerView.m) r2
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
            androidx.recyclerview.widget.RecyclerView$l r0 = r2.m
            if (r0 != 0) goto L5
            goto L14
        L5:
            boolean r0 = r0.d()
            if (r0 == 0) goto L14
            androidx.recyclerview.widget.RecyclerView$l r0 = r2.m
            androidx.recyclerview.widget.RecyclerView$w r1 = r2.f0
            int r0 = r0.j(r1)
            return r0
        L14:
            r0 = 0
            return r0
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView$l r0 = r2.m
            if (r0 != 0) goto L5
            goto L14
        L5:
            boolean r0 = r0.d()
            if (r0 == 0) goto L14
            androidx.recyclerview.widget.RecyclerView$l r0 = r2.m
            androidx.recyclerview.widget.RecyclerView$w r1 = r2.f0
            int r0 = r0.k(r1)
            return r0
        L14:
            r0 = 0
            return r0
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView$l r0 = r2.m
            if (r0 != 0) goto L5
            goto L14
        L5:
            boolean r0 = r0.d()
            if (r0 == 0) goto L14
            androidx.recyclerview.widget.RecyclerView$l r0 = r2.m
            androidx.recyclerview.widget.RecyclerView$w r1 = r2.f0
            int r0 = r0.l(r1)
            return r0
        L14:
            r0 = 0
            return r0
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView$l r0 = r2.m
            if (r0 != 0) goto L5
            goto L14
        L5:
            boolean r0 = r0.e()
            if (r0 == 0) goto L14
            androidx.recyclerview.widget.RecyclerView$l r0 = r2.m
            androidx.recyclerview.widget.RecyclerView$w r1 = r2.f0
            int r0 = r0.m(r1)
            return r0
        L14:
            r0 = 0
            return r0
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView$l r0 = r2.m
            if (r0 != 0) goto L5
            goto L14
        L5:
            boolean r0 = r0.e()
            if (r0 == 0) goto L14
            androidx.recyclerview.widget.RecyclerView$l r0 = r2.m
            androidx.recyclerview.widget.RecyclerView$w r1 = r2.f0
            int r0 = r0.n(r1)
            return r0
        L14:
            r0 = 0
            return r0
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView$l r0 = r2.m
            if (r0 != 0) goto L5
            goto L14
        L5:
            boolean r0 = r0.e()
            if (r0 == 0) goto L14
            androidx.recyclerview.widget.RecyclerView$l r0 = r2.m
            androidx.recyclerview.widget.RecyclerView$w r1 = r2.f0
            int r0 = r0.o(r1)
            return r0
        L14:
            r0 = 0
            return r0
    }

    public final void d0(int r11, int r12, int[] r13) {
            r10 = this;
            r0 = 1
            androidx.recyclerview.widget.b r1 = r10.f
            r10.h0()
            r10.S()
            int r2 = a.Af.f16a
            java.lang.String r2 = "RV Scroll"
            android.os.Trace.beginSection(r2)
            androidx.recyclerview.widget.RecyclerView$w r2 = r10.f0
            r10.C(r2)
            androidx.recyclerview.widget.RecyclerView$r r3 = r10.c
            r4 = 0
            if (r11 == 0) goto L21
            androidx.recyclerview.widget.RecyclerView$l r5 = r10.m
            int r11 = r5.o0(r11, r3, r2)
            goto L22
        L21:
            r11 = r4
        L22:
            if (r12 == 0) goto L2b
            androidx.recyclerview.widget.RecyclerView$l r5 = r10.m
            int r12 = r5.q0(r12, r3, r2)
            goto L2c
        L2b:
            r12 = r4
        L2c:
            android.os.Trace.endSection()
            int r2 = r1.e()
            r3 = r4
        L34:
            if (r3 >= r2) goto L69
            android.view.View r5 = r1.d(r3)
            androidx.recyclerview.widget.RecyclerView$A r6 = r10.K(r5)
            if (r6 == 0) goto L67
            androidx.recyclerview.widget.RecyclerView$A r6 = r6.i
            if (r6 == 0) goto L67
            int r7 = r5.getLeft()
            int r5 = r5.getTop()
            android.view.View r6 = r6.f963a
            int r8 = r6.getLeft()
            if (r7 != r8) goto L5a
            int r8 = r6.getTop()
            if (r5 == r8) goto L67
        L5a:
            int r8 = r6.getWidth()
            int r8 = r8 + r7
            int r9 = r6.getHeight()
            int r9 = r9 + r5
            r6.layout(r7, r5, r8, r9)
        L67:
            int r3 = r3 + r0
            goto L34
        L69:
            r10.T(r0)
            r10.i0(r4)
            if (r13 == 0) goto L75
            r13[r4] = r11
            r13[r0] = r12
        L75:
            return
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float r2, float r3, boolean r4) {
            r1 = this;
            a.Jb r0 = r1.getScrollingChildHelper()
            boolean r2 = r0.a(r2, r3, r4)
            return r2
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float r2, float r3) {
            r1 = this;
            a.Jb r0 = r1.getScrollingChildHelper()
            boolean r2 = r0.b(r2, r3)
            return r2
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int r7, int r8, int[] r9, int[] r10) {
            r6 = this;
            a.Jb r0 = r6.getScrollingChildHelper()
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
            a.Jb r0 = r8.getScrollingChildHelper()
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
    public final void dispatchRestoreInstanceState(android.util.SparseArray<android.os.Parcelable> r1) {
            r0 = this;
            r0.dispatchThawSelfOnly(r1)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(android.util.SparseArray<android.os.Parcelable> r1) {
            r0 = this;
            r0.dispatchFreezeSelfOnly(r1)
            return
    }

    @Override // android.view.View
    public final void draw(android.graphics.Canvas r9) {
            r8 = this;
            r0 = 1
            super.draw(r9)
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$k> r1 = r8.p
            int r2 = r1.size()
            r3 = 0
            r4 = r3
        Lc:
            if (r4 >= r2) goto L19
            java.lang.Object r5 = r1.get(r4)
            androidx.recyclerview.widget.RecyclerView$k r5 = (androidx.recyclerview.widget.RecyclerView.k) r5
            r5.d(r9, r8)
            int r4 = r4 + r0
            goto Lc
        L19:
            android.widget.EdgeEffect r2 = r8.G
            if (r2 == 0) goto L52
            boolean r2 = r2.isFinished()
            if (r2 != 0) goto L52
            int r2 = r9.save()
            boolean r4 = r8.h
            if (r4 == 0) goto L30
            int r4 = r8.getPaddingBottom()
            goto L31
        L30:
            r4 = r3
        L31:
            r5 = 1132920832(0x43870000, float:270.0)
            r9.rotate(r5)
            int r5 = r8.getHeight()
            int r5 = -r5
            int r5 = r5 + r4
            float r4 = (float) r5
            r5 = 0
            r9.translate(r4, r5)
            android.widget.EdgeEffect r4 = r8.G
            if (r4 == 0) goto L4d
            boolean r4 = r4.draw(r9)
            if (r4 == 0) goto L4d
            r4 = r0
            goto L4e
        L4d:
            r4 = r3
        L4e:
            r9.restoreToCount(r2)
            goto L53
        L52:
            r4 = r3
        L53:
            android.widget.EdgeEffect r2 = r8.H
            if (r2 == 0) goto L83
            boolean r2 = r2.isFinished()
            if (r2 != 0) goto L83
            int r2 = r9.save()
            boolean r5 = r8.h
            if (r5 == 0) goto L72
            int r5 = r8.getPaddingLeft()
            float r5 = (float) r5
            int r6 = r8.getPaddingTop()
            float r6 = (float) r6
            r9.translate(r5, r6)
        L72:
            android.widget.EdgeEffect r5 = r8.H
            if (r5 == 0) goto L7e
            boolean r5 = r5.draw(r9)
            if (r5 == 0) goto L7e
            r5 = r0
            goto L7f
        L7e:
            r5 = r3
        L7f:
            r4 = r4 | r5
            r9.restoreToCount(r2)
        L83:
            android.widget.EdgeEffect r2 = r8.I
            if (r2 == 0) goto Lbb
            boolean r2 = r2.isFinished()
            if (r2 != 0) goto Lbb
            int r2 = r9.save()
            int r5 = r8.getWidth()
            boolean r6 = r8.h
            if (r6 == 0) goto L9e
            int r6 = r8.getPaddingTop()
            goto L9f
        L9e:
            r6 = r3
        L9f:
            r7 = 1119092736(0x42b40000, float:90.0)
            r9.rotate(r7)
            float r6 = (float) r6
            int r5 = -r5
            float r5 = (float) r5
            r9.translate(r6, r5)
            android.widget.EdgeEffect r5 = r8.I
            if (r5 == 0) goto Lb6
            boolean r5 = r5.draw(r9)
            if (r5 == 0) goto Lb6
            r5 = r0
            goto Lb7
        Lb6:
            r5 = r3
        Lb7:
            r4 = r4 | r5
            r9.restoreToCount(r2)
        Lbb:
            android.widget.EdgeEffect r2 = r8.J
            if (r2 == 0) goto L10a
            boolean r2 = r2.isFinished()
            if (r2 != 0) goto L10a
            int r2 = r9.save()
            r5 = 1127481344(0x43340000, float:180.0)
            r9.rotate(r5)
            boolean r5 = r8.h
            if (r5 == 0) goto Lec
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
            goto Lfb
        Lec:
            int r5 = r8.getWidth()
            int r5 = -r5
            float r5 = (float) r5
            int r6 = r8.getHeight()
            int r6 = -r6
            float r6 = (float) r6
            r9.translate(r5, r6)
        Lfb:
            android.widget.EdgeEffect r5 = r8.J
            if (r5 == 0) goto L106
            boolean r5 = r5.draw(r9)
            if (r5 == 0) goto L106
            r3 = r0
        L106:
            r4 = r4 | r3
            r9.restoreToCount(r2)
        L10a:
            if (r4 != 0) goto L11f
            androidx.recyclerview.widget.RecyclerView$i r9 = r8.K
            if (r9 == 0) goto L11f
            int r9 = r1.size()
            if (r9 <= 0) goto L11f
            androidx.recyclerview.widget.RecyclerView$i r9 = r8.K
            boolean r9 = r9.f()
            if (r9 == 0) goto L11f
            goto L120
        L11f:
            r0 = r4
        L120:
            if (r0 == 0) goto L127
            java.util.WeakHashMap<android.view.View, a.Jg> r9 = a.C0414ug.f721a
            r8.postInvalidateOnAnimation()
        L127:
            return
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(android.graphics.Canvas r1, android.view.View r2, long r3) {
            r0 = this;
            boolean r1 = super.drawChild(r1, r2, r3)
            return r1
    }

    public final void e0(int r3) {
            r2 = this;
            boolean r0 = r2.x
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 0
            r2.setScrollState(r0)
            androidx.recyclerview.widget.RecyclerView$z r0 = r2.c0
            androidx.recyclerview.widget.RecyclerView r1 = r0.g
            r1.removeCallbacks(r0)
            android.widget.OverScroller r0 = r0.c
            r0.abortAnimation()
            androidx.recyclerview.widget.RecyclerView$l r0 = r2.m
            if (r0 == 0) goto L20
            androidx.recyclerview.widget.o r0 = r0.e
            if (r0 == 0) goto L20
            r0.d()
        L20:
            androidx.recyclerview.widget.RecyclerView$l r0 = r2.m
            if (r0 != 0) goto L2c
            java.lang.String r3 = "RecyclerView"
            java.lang.String r0 = "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument."
            android.util.Log.e(r3, r0)
            return
        L2c:
            r0.p0(r3)
            r2.awakenScrollBars()
            return
    }

    public final boolean f0(android.widget.EdgeEffect r7, int r8, int r9) {
            r6 = this;
            if (r8 <= 0) goto L3
            goto L33
        L3:
            float r7 = a.G5.a(r7)
            float r9 = (float) r9
            float r7 = r7 * r9
            int r8 = -r8
            int r8 = java.lang.Math.abs(r8)
            float r8 = (float) r8
            r9 = 1051931443(0x3eb33333, float:0.35)
            float r8 = r8 * r9
            float r9 = r6.f962a
            r0 = 1014350479(0x3c75c28f, float:0.015)
            float r9 = r9 * r0
            float r8 = r8 / r9
            double r0 = (double) r8
            double r0 = java.lang.Math.log(r0)
            float r8 = androidx.recyclerview.widget.RecyclerView.B0
            double r2 = (double) r8
            r4 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r4 = r2 - r4
            double r8 = (double) r9
            double r2 = r2 / r4
            double r2 = r2 * r0
            double r0 = java.lang.Math.exp(r2)
            double r0 = r0 * r8
            float r8 = (float) r0
            int r7 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r7 >= 0) goto L35
        L33:
            r7 = 1
            return r7
        L35:
            r7 = 0
            return r7
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final android.view.View focusSearch(android.view.View r17, int r18) {
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            androidx.recyclerview.widget.RecyclerView$l r3 = r0.m
            r3.getClass()
            androidx.recyclerview.widget.RecyclerView$d r3 = r0.l
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L21
            androidx.recyclerview.widget.RecyclerView$l r3 = r0.m
            if (r3 == 0) goto L21
            boolean r3 = r0.O()
            if (r3 != 0) goto L21
            boolean r3 = r0.x
            if (r3 != 0) goto L21
            r3 = r4
            goto L22
        L21:
            r3 = r5
        L22:
            android.view.FocusFinder r6 = android.view.FocusFinder.getInstance()
            androidx.recyclerview.widget.RecyclerView$w r7 = r0.f0
            androidx.recyclerview.widget.RecyclerView$r r8 = r0.c
            r9 = 17
            r11 = 33
            r13 = 0
            r14 = 2
            if (r3 == 0) goto L93
            if (r2 == r14) goto L36
            if (r2 != r4) goto L93
        L36:
            androidx.recyclerview.widget.RecyclerView$l r3 = r0.m
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
            androidx.recyclerview.widget.RecyclerView$l r15 = r0.m
            boolean r15 = r15.d()
            if (r15 == 0) goto L77
            androidx.recyclerview.widget.RecyclerView$l r3 = r0.m
            int r3 = r3.C()
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
            r0.p()
            android.view.View r3 = r16.D(r17)
            if (r3 != 0) goto L83
            goto La4
        L83:
            r0.h0()
            androidx.recyclerview.widget.RecyclerView$l r3 = r0.m
            r3.T(r1, r2, r8, r7)
            r0.i0(r5)
        L8e:
            android.view.View r3 = r6.findNextFocus(r0, r1, r2)
            goto Lb3
        L93:
            android.view.View r6 = r6.findNextFocus(r0, r1, r2)
            if (r6 != 0) goto Lb2
            if (r3 == 0) goto Lb2
            r0.p()
            android.view.View r3 = r16.D(r17)
            if (r3 != 0) goto La5
        La4:
            return r13
        La5:
            r0.h0()
            androidx.recyclerview.widget.RecyclerView$l r3 = r0.m
            android.view.View r3 = r3.T(r1, r2, r8, r7)
            r0.i0(r5)
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
            r0.a0(r3, r13)
            return r1
        Lca:
            if (r3 == 0) goto L163
            if (r3 == r0) goto L163
            if (r3 != r1) goto Ld2
            goto L163
        Ld2:
            android.view.View r6 = r0.D(r3)
            if (r6 != 0) goto Ldb
            r4 = r5
            goto L191
        Ldb:
            if (r1 != 0) goto Ldf
            goto L191
        Ldf:
            android.view.View r6 = r16.D(r17)
            if (r6 != 0) goto Le7
            goto L191
        Le7:
            int r6 = r1.getWidth()
            int r7 = r1.getHeight()
            android.graphics.Rect r8 = r0.i
            r8.set(r5, r5, r6, r7)
            int r6 = r3.getWidth()
            int r7 = r3.getHeight()
            android.graphics.Rect r13 = r0.j
            r13.set(r5, r5, r6, r7)
            r0.offsetDescendantRectToMyCoords(r1, r8)
            r0.offsetDescendantRectToMyCoords(r3, r13)
            androidx.recyclerview.widget.RecyclerView$l r6 = r0.m
            int r6 = r6.C()
            if (r6 != r4) goto L111
            r6 = -1
            goto L112
        L111:
            r6 = r4
        L112:
            int r15 = r8.left
            int r5 = r13.left
            if (r15 < r5) goto L11c
            int r7 = r8.right
            if (r7 > r5) goto L124
        L11c:
            int r7 = r8.right
            int r12 = r13.right
            if (r7 >= r12) goto L124
            r5 = r4
            goto L131
        L124:
            int r7 = r8.right
            int r12 = r13.right
            if (r7 > r12) goto L12c
            if (r15 < r12) goto L130
        L12c:
            if (r15 <= r5) goto L130
            r5 = -1
            goto L131
        L130:
            r5 = 0
        L131:
            int r7 = r8.top
            int r12 = r13.top
            if (r7 < r12) goto L13b
            int r15 = r8.bottom
            if (r15 > r12) goto L143
        L13b:
            int r15 = r8.bottom
            int r10 = r13.bottom
            if (r15 >= r10) goto L143
            r7 = r4
            goto L150
        L143:
            int r8 = r8.bottom
            int r10 = r13.bottom
            if (r8 > r10) goto L14b
            if (r7 < r10) goto L14f
        L14b:
            if (r7 <= r12) goto L14f
            r7 = -1
            goto L150
        L14f:
            r7 = 0
        L150:
            if (r2 == r4) goto L18a
            if (r2 == r14) goto L182
            if (r2 == r9) goto L17f
            if (r2 == r11) goto L17c
            r6 = 66
            if (r2 == r6) goto L179
            r6 = 130(0x82, float:1.82E-43)
            if (r2 != r6) goto L165
            if (r7 <= 0) goto L163
            goto L191
        L163:
            r4 = 0
            goto L191
        L165:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Invalid direction: "
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r2 = a.C0487z.d(r0, r3)
            r1.<init>(r2)
            throw r1
        L179:
            if (r5 <= 0) goto L163
            goto L191
        L17c:
            if (r7 >= 0) goto L163
            goto L191
        L17f:
            if (r5 >= 0) goto L163
            goto L191
        L182:
            if (r7 > 0) goto L191
            if (r7 != 0) goto L163
            int r5 = r5 * r6
            if (r5 <= 0) goto L163
            goto L191
        L18a:
            if (r7 < 0) goto L191
            if (r7 != 0) goto L163
            int r5 = r5 * r6
            if (r5 >= 0) goto L163
        L191:
            if (r4 == 0) goto L194
            return r3
        L194:
            android.view.View r1 = super.focusSearch(r17, r18)
            return r1
    }

    public final void g0(int r3, int r4, boolean r5) {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView$l r0 = r2.m
            if (r0 != 0) goto Lc
            java.lang.String r3 = "RecyclerView"
            java.lang.String r4 = "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument."
            android.util.Log.e(r3, r4)
            return
        Lc:
            boolean r1 = r2.x
            if (r1 == 0) goto L11
            goto L27
        L11:
            boolean r0 = r0.d()
            r1 = 0
            if (r0 != 0) goto L19
            r3 = r1
        L19:
            androidx.recyclerview.widget.RecyclerView$l r0 = r2.m
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
            a.Jb r0 = r2.getScrollingChildHelper()
            r0.g(r1, r5)
        L39:
            androidx.recyclerview.widget.RecyclerView$z r5 = r2.c0
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = 0
            r5.c(r3, r4, r0, r1)
            return
    }

    @Override // android.view.ViewGroup
    public final android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
            r3 = this;
            androidx.recyclerview.widget.RecyclerView$l r0 = r3.m
            if (r0 == 0) goto L9
            androidx.recyclerview.widget.RecyclerView$m r0 = r0.r()
            return r0
        L9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "RecyclerView has no LayoutManager"
            r1.<init>(r2)
            java.lang.String r1 = a.C0487z.d(r3, r1)
            r0.<init>(r1)
            throw r0
    }

    @Override // android.view.ViewGroup
    public final android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet r3) {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView$l r0 = r2.m
            if (r0 == 0) goto Ld
            android.content.Context r1 = r2.getContext()
            androidx.recyclerview.widget.RecyclerView$m r3 = r0.s(r1, r3)
            return r3
        Ld:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "RecyclerView has no LayoutManager"
            r0.<init>(r1)
            java.lang.String r0 = a.C0487z.d(r2, r0)
            r3.<init>(r0)
            throw r3
    }

    @Override // android.view.ViewGroup
    public final android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams r3) {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView$l r0 = r2.m
            if (r0 == 0) goto L9
            androidx.recyclerview.widget.RecyclerView$m r3 = r0.t(r3)
            return r3
        L9:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "RecyclerView has no LayoutManager"
            r0.<init>(r1)
            java.lang.String r0 = a.C0487z.d(r2, r0)
            r3.<init>(r0)
            throw r3
    }

    @Override // android.view.ViewGroup, android.view.View
    public java.lang.CharSequence getAccessibilityClassName() {
            r1 = this;
            java.lang.String r0 = "androidx.recyclerview.widget.RecyclerView"
            return r0
    }

    public androidx.recyclerview.widget.RecyclerView.d getAdapter() {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView$d r0 = r1.l
            return r0
    }

    @Override // android.view.View
    public int getBaseline() {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView$l r0 = r1.m
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
            boolean r0 = r1.h
            return r0
    }

    public androidx.recyclerview.widget.x getCompatAccessibilityDelegate() {
            r1 = this;
            androidx.recyclerview.widget.x r0 = r1.m0
            return r0
    }

    public androidx.recyclerview.widget.RecyclerView.h getEdgeEffectFactory() {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView$h r0 = r1.F
            return r0
    }

    public androidx.recyclerview.widget.RecyclerView.i getItemAnimator() {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView$i r0 = r1.K
            return r0
    }

    public int getItemDecorationCount() {
            r1 = this;
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$k> r0 = r1.p
            int r0 = r0.size()
            return r0
    }

    public androidx.recyclerview.widget.RecyclerView.l getLayoutManager() {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView$l r0 = r1.m
            return r0
    }

    public int getMaxFlingVelocity() {
            r1 = this;
            int r0 = r1.V
            return r0
    }

    public int getMinFlingVelocity() {
            r1 = this;
            int r0 = r1.U
            return r0
    }

    public long getNanoTime() {
            r2 = this;
            boolean r0 = androidx.recyclerview.widget.RecyclerView.D0
            if (r0 == 0) goto L9
            long r0 = java.lang.System.nanoTime()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public androidx.recyclerview.widget.RecyclerView.n getOnFlingListener() {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView$n r0 = r1.T
            return r0
    }

    public boolean getPreserveFocusAfterLayout() {
            r1 = this;
            boolean r0 = r1.b0
            return r0
    }

    public androidx.recyclerview.widget.RecyclerView.q getRecycledViewPool() {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView$r r0 = r1.c
            androidx.recyclerview.widget.RecyclerView$q r0 = r0.c()
            return r0
    }

    public int getScrollState() {
            r1 = this;
            int r0 = r1.L
            return r0
    }

    public final void h(androidx.recyclerview.widget.RecyclerView.A r6) {
            r5 = this;
            android.view.View r0 = r6.f963a
            android.view.ViewParent r1 = r0.getParent()
            r2 = 1
            if (r1 != r5) goto Lb
            r1 = r2
            goto Lc
        Lb:
            r1 = 0
        Lc:
            androidx.recyclerview.widget.RecyclerView$r r3 = r5.c
            androidx.recyclerview.widget.RecyclerView$A r4 = r5.K(r0)
            r3.l(r4)
            boolean r6 = r6.j()
            r3 = -1
            if (r6 == 0) goto L26
            androidx.recyclerview.widget.b r6 = r5.f
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            r6.b(r0, r3, r1, r2)
            return
        L26:
            if (r1 != 0) goto L2e
            androidx.recyclerview.widget.b r6 = r5.f
            r6.a(r0, r3, r2)
            return
        L2e:
            androidx.recyclerview.widget.b r6 = r5.f
            androidx.recyclerview.widget.v r1 = r6.f992a
            androidx.recyclerview.widget.RecyclerView r1 = r1.f1015a
            int r1 = r1.indexOfChild(r0)
            if (r1 < 0) goto L43
            androidx.recyclerview.widget.b$a r2 = r6.b
            r2.h(r1)
            r6.i(r0)
            return
        L43:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "view is not a child, cannot hide "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r6.<init>(r0)
            throw r6
    }

    public final void h0() {
            r2 = this;
            int r0 = r2.v
            r1 = 1
            int r0 = r0 + r1
            r2.v = r0
            if (r0 != r1) goto Lf
            boolean r0 = r2.x
            if (r0 != 0) goto Lf
            r0 = 0
            r2.w = r0
        Lf:
            return
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
            r2 = this;
            a.Jb r0 = r2.getScrollingChildHelper()
            r1 = 0
            boolean r0 = r0.f(r1)
            return r0
    }

    public final void i(androidx.recyclerview.widget.RecyclerView.k r3) {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView$l r0 = r2.m
            if (r0 == 0) goto L9
            java.lang.String r1 = "Cannot add item decoration during a scroll  or layout"
            r0.c(r1)
        L9:
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$k> r0 = r2.p
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L15
            r1 = 0
            r2.setWillNotDraw(r1)
        L15:
            r0.add(r3)
            r2.Q()
            r2.requestLayout()
            return
    }

    public final void i0(boolean r4) {
            r3 = this;
            int r0 = r3.v
            r1 = 1
            if (r0 >= r1) goto L1d
            boolean r0 = androidx.recyclerview.widget.RecyclerView.y0
            if (r0 != 0) goto Lc
            r3.v = r1
            goto L1d
        Lc:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "stopInterceptRequestLayout was called more times than startInterceptRequestLayout."
            r0.<init>(r1)
            java.lang.String r0 = a.C0487z.d(r3, r0)
            r4.<init>(r0)
            throw r4
        L1d:
            r0 = 0
            if (r4 != 0) goto L26
            boolean r2 = r3.x
            if (r2 != 0) goto L26
            r3.w = r0
        L26:
            int r2 = r3.v
            if (r2 != r1) goto L45
            if (r4 == 0) goto L3f
            boolean r4 = r3.w
            if (r4 == 0) goto L3f
            boolean r4 = r3.x
            if (r4 != 0) goto L3f
            androidx.recyclerview.widget.RecyclerView$l r4 = r3.m
            if (r4 == 0) goto L3f
            androidx.recyclerview.widget.RecyclerView$d r4 = r3.l
            if (r4 == 0) goto L3f
            r3.r()
        L3f:
            boolean r4 = r3.x
            if (r4 != 0) goto L45
            r3.w = r0
        L45:
            int r4 = r3.v
            int r4 = r4 - r1
            r3.v = r4
            return
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
            r1 = this;
            boolean r0 = r1.s
            return r0
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
            r1 = this;
            boolean r0 = r1.x
            return r0
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
            r1 = this;
            a.Jb r0 = r1.getScrollingChildHelper()
            boolean r0 = r0.d
            return r0
    }

    public final void j(androidx.recyclerview.widget.RecyclerView.p r2) {
            r1 = this;
            java.util.ArrayList r0 = r1.h0
            if (r0 != 0) goto Lb
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.h0 = r0
        Lb:
            java.util.ArrayList r0 = r1.h0
            r0.add(r2)
            return
    }

    public final void j0(int r2) {
            r1 = this;
            a.Jb r0 = r1.getScrollingChildHelper()
            r0.h(r2)
            return
    }

    public final void k(java.lang.String r3) {
            r2 = this;
            boolean r0 = r2.O()
            if (r0 == 0) goto L1f
            if (r3 != 0) goto L19
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Cannot call this method while RecyclerView is computing a layout or scrolling"
            r0.<init>(r1)
            java.lang.String r0 = a.C0487z.d(r2, r0)
            r3.<init>(r0)
            throw r3
        L19:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L1f:
            int r3 = r2.E
            if (r3 <= 0) goto L3a
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = ""
            r0.<init>(r1)
            java.lang.String r0 = a.C0487z.d(r2, r0)
            r3.<init>(r0)
            java.lang.String r0 = "RecyclerView"
            java.lang.String r1 = "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame."
            android.util.Log.w(r0, r1, r3)
        L3a:
            return
    }

    public final void m() {
            r7 = this;
            androidx.recyclerview.widget.b r0 = r7.f
            int r0 = r0.h()
            r1 = 0
            r2 = r1
        L8:
            r3 = -1
            if (r2 >= r0) goto L22
            androidx.recyclerview.widget.b r4 = r7.f
            android.view.View r4 = r4.g(r2)
            androidx.recyclerview.widget.RecyclerView$A r4 = L(r4)
            boolean r5 = r4.o()
            if (r5 != 0) goto L1f
            r4.d = r3
            r4.g = r3
        L1f:
            int r2 = r2 + 1
            goto L8
        L22:
            androidx.recyclerview.widget.RecyclerView$r r0 = r7.c
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$A> r2 = r0.c
            int r4 = r2.size()
            r5 = r1
        L2b:
            if (r5 >= r4) goto L3a
            java.lang.Object r6 = r2.get(r5)
            androidx.recyclerview.widget.RecyclerView$A r6 = (androidx.recyclerview.widget.RecyclerView.A) r6
            r6.d = r3
            r6.g = r3
            int r5 = r5 + 1
            goto L2b
        L3a:
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$A> r2 = r0.f978a
            int r4 = r2.size()
            r5 = r1
        L41:
            if (r5 >= r4) goto L50
            java.lang.Object r6 = r2.get(r5)
            androidx.recyclerview.widget.RecyclerView$A r6 = (androidx.recyclerview.widget.RecyclerView.A) r6
            r6.d = r3
            r6.g = r3
            int r5 = r5 + 1
            goto L41
        L50:
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$A> r2 = r0.b
            if (r2 == 0) goto L69
            int r2 = r2.size()
        L58:
            if (r1 >= r2) goto L69
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$A> r4 = r0.b
            java.lang.Object r4 = r4.get(r1)
            androidx.recyclerview.widget.RecyclerView$A r4 = (androidx.recyclerview.widget.RecyclerView.A) r4
            r4.d = r3
            r4.g = r3
            int r1 = r1 + 1
            goto L58
        L69:
            return
    }

    public final void n(int r3, int r4) {
            r2 = this;
            android.widget.EdgeEffect r0 = r2.G
            if (r0 == 0) goto L18
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L18
            if (r3 <= 0) goto L18
            android.widget.EdgeEffect r0 = r2.G
            r0.onRelease()
            android.widget.EdgeEffect r0 = r2.G
            boolean r0 = r0.isFinished()
            goto L19
        L18:
            r0 = 0
        L19:
            android.widget.EdgeEffect r1 = r2.I
            if (r1 == 0) goto L31
            boolean r1 = r1.isFinished()
            if (r1 != 0) goto L31
            if (r3 >= 0) goto L31
            android.widget.EdgeEffect r3 = r2.I
            r3.onRelease()
            android.widget.EdgeEffect r3 = r2.I
            boolean r3 = r3.isFinished()
            r0 = r0 | r3
        L31:
            android.widget.EdgeEffect r3 = r2.H
            if (r3 == 0) goto L49
            boolean r3 = r3.isFinished()
            if (r3 != 0) goto L49
            if (r4 <= 0) goto L49
            android.widget.EdgeEffect r3 = r2.H
            r3.onRelease()
            android.widget.EdgeEffect r3 = r2.H
            boolean r3 = r3.isFinished()
            r0 = r0 | r3
        L49:
            android.widget.EdgeEffect r3 = r2.J
            if (r3 == 0) goto L61
            boolean r3 = r3.isFinished()
            if (r3 != 0) goto L61
            if (r4 >= 0) goto L61
            android.widget.EdgeEffect r3 = r2.J
            r3.onRelease()
            android.widget.EdgeEffect r3 = r2.J
            boolean r3 = r3.isFinished()
            r0 = r0 | r3
        L61:
            if (r0 == 0) goto L68
            java.util.WeakHashMap<android.view.View, a.Jg> r3 = a.C0414ug.f721a
            r2.postInvalidateOnAnimation()
        L68:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
            r5 = this;
            super.onAttachedToWindow()
            r0 = 0
            r5.D = r0
            r1 = 1
            r5.s = r1
            boolean r2 = r5.u
            if (r2 == 0) goto L15
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L15
            r2 = r1
            goto L16
        L15:
            r2 = r0
        L16:
            r5.u = r2
            androidx.recyclerview.widget.RecyclerView$r r2 = r5.c
            r2.d()
            androidx.recyclerview.widget.RecyclerView$l r2 = r5.m
            if (r2 == 0) goto L26
            r2.g = r1
            r2.R(r5)
        L26:
            r5.l0 = r0
            boolean r0 = androidx.recyclerview.widget.RecyclerView.D0
            if (r0 == 0) goto L83
            java.lang.ThreadLocal<androidx.recyclerview.widget.m> r0 = androidx.recyclerview.widget.m.e
            java.lang.Object r1 = r0.get()
            androidx.recyclerview.widget.m r1 = (androidx.recyclerview.widget.m) r1
            r5.d0 = r1
            if (r1 != 0) goto L66
            androidx.recyclerview.widget.m r1 = new androidx.recyclerview.widget.m
            r1.<init>()
            r5.d0 = r1
            java.util.WeakHashMap<android.view.View, a.Jg> r1 = a.C0414ug.f721a
            android.view.Display r1 = r5.getDisplay()
            boolean r2 = r5.isInEditMode()
            if (r2 != 0) goto L58
            if (r1 == 0) goto L58
            float r1 = r1.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L58
            goto L5a
        L58:
            r1 = 1114636288(0x42700000, float:60.0)
        L5a:
            androidx.recyclerview.widget.m r2 = r5.d0
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.c = r3
            r0.set(r2)
        L66:
            androidx.recyclerview.widget.m r0 = r5.d0
            r0.getClass()
            boolean r1 = androidx.recyclerview.widget.RecyclerView.y0
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView> r0 = r0.f1009a
            if (r1 == 0) goto L80
            boolean r1 = r0.contains(r5)
            if (r1 != 0) goto L78
            goto L80
        L78:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "RecyclerView already present in worker list!"
            r0.<init>(r1)
            throw r0
        L80:
            r0.add(r5)
        L83:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
            r6 = this;
            r0 = -1
            super.onDetachedFromWindow()
            androidx.recyclerview.widget.RecyclerView$i r1 = r6.K
            if (r1 == 0) goto Lb
            r1.e()
        Lb:
            r1 = 0
            r6.setScrollState(r1)
            androidx.recyclerview.widget.RecyclerView$z r2 = r6.c0
            androidx.recyclerview.widget.RecyclerView r3 = r2.g
            r3.removeCallbacks(r2)
            android.widget.OverScroller r2 = r2.c
            r2.abortAnimation()
            androidx.recyclerview.widget.RecyclerView$l r2 = r6.m
            if (r2 == 0) goto L26
            androidx.recyclerview.widget.o r2 = r2.e
            if (r2 == 0) goto L26
            r2.d()
        L26:
            r6.s = r1
            androidx.recyclerview.widget.RecyclerView$l r2 = r6.m
            if (r2 == 0) goto L31
            r2.g = r1
            r2.S(r6)
        L31:
            java.util.ArrayList r2 = r6.s0
            r2.clear()
            androidx.recyclerview.widget.RecyclerView$a r2 = r6.t0
            r6.removeCallbacks(r2)
            androidx.recyclerview.widget.C r2 = r6.g
            r2.getClass()
        L40:
            a.Cc r2 = androidx.recyclerview.widget.C.a.d
            java.lang.Object r2 = r2.a()
            if (r2 == 0) goto L49
            goto L40
        L49:
            r2 = r1
        L4a:
            androidx.recyclerview.widget.RecyclerView$r r3 = r6.c
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$A> r4 = r3.c
            int r5 = r4.size()
            if (r2 >= r5) goto L62
            java.lang.Object r3 = r4.get(r2)
            androidx.recyclerview.widget.RecyclerView$A r3 = (androidx.recyclerview.widget.RecyclerView.A) r3
            android.view.View r3 = r3.f963a
            a.C0500zc.a(r3)
            int r2 = r2 + 1
            goto L4a
        L62:
            androidx.recyclerview.widget.RecyclerView r2 = r3.h
            androidx.recyclerview.widget.RecyclerView$d r2 = r2.l
            r3.e(r2, r1)
            int r2 = a.C0500zc.f779a
        L6b:
            int r2 = r6.getChildCount()
            if (r1 >= r2) goto La6
            int r2 = r1 + 1
            android.view.View r1 = r6.getChildAt(r1)
            if (r1 == 0) goto La0
            int r3 = a.C0500zc.f779a
            java.lang.Object r4 = r1.getTag(r3)
            a.Bc r4 = (a.Bc) r4
            if (r4 != 0) goto L8b
            a.Bc r4 = new a.Bc
            r4.<init>()
            r1.setTag(r3, r4)
        L8b:
            java.util.ArrayList<a.Ac> r1 = r4.f31a
            int r3 = a.C0294o3.c0(r1)
        L91:
            if (r0 >= r3) goto L9e
            java.lang.Object r4 = r1.get(r3)
            a.Ac r4 = (a.Ac) r4
            r4.a()
            int r3 = r3 + r0
            goto L91
        L9e:
            r1 = r2
            goto L6b
        La0:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            r0.<init>()
            throw r0
        La6:
            boolean r0 = androidx.recyclerview.widget.RecyclerView.D0
            if (r0 == 0) goto Lc6
            androidx.recyclerview.widget.m r0 = r6.d0
            if (r0 == 0) goto Lc6
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView> r0 = r0.f1009a
            boolean r0 = r0.remove(r6)
            boolean r1 = androidx.recyclerview.widget.RecyclerView.y0
            if (r1 == 0) goto Lc3
            if (r0 == 0) goto Lbb
            goto Lc3
        Lbb:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "RecyclerView removal failed!"
            r0.<init>(r1)
            throw r0
        Lc3:
            r0 = 0
            r6.d0 = r0
        Lc6:
            return
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas r5) {
            r4 = this;
            super.onDraw(r5)
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$k> r0 = r4.p
            int r1 = r0.size()
            r2 = 0
        La:
            if (r2 >= r1) goto L18
            java.lang.Object r3 = r0.get(r2)
            androidx.recyclerview.widget.RecyclerView$k r3 = (androidx.recyclerview.widget.RecyclerView.k) r3
            r3.c(r5, r4)
            int r2 = r2 + 1
            goto La
        L18:
            return
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(android.view.MotionEvent r14) {
            r13 = this;
            androidx.recyclerview.widget.RecyclerView$l r1 = r13.m
            r6 = 0
            if (r1 != 0) goto L7
            goto Lf1
        L7:
            boolean r1 = r13.x
            if (r1 == 0) goto Ld
            goto Lf1
        Ld:
            int r1 = r14.getAction()
            r2 = 8
            if (r1 != r2) goto Lf1
            int r1 = r14.getSource()
            r1 = r1 & 2
            r2 = 0
            if (r1 == 0) goto L40
            androidx.recyclerview.widget.RecyclerView$l r1 = r13.m
            boolean r1 = r1.e()
            if (r1 == 0) goto L2e
            r1 = 9
            float r1 = r14.getAxisValue(r1)
            float r1 = -r1
            goto L2f
        L2e:
            r1 = r2
        L2f:
            androidx.recyclerview.widget.RecyclerView$l r3 = r13.m
            boolean r3 = r3.d()
            if (r3 == 0) goto L3e
            r3 = 10
            float r3 = r14.getAxisValue(r3)
            goto L66
        L3e:
            r3 = r2
            goto L66
        L40:
            int r1 = r14.getSource()
            r3 = 4194304(0x400000, float:5.877472E-39)
            r1 = r1 & r3
            if (r1 == 0) goto L64
            r1 = 26
            float r1 = r14.getAxisValue(r1)
            androidx.recyclerview.widget.RecyclerView$l r3 = r13.m
            boolean r3 = r3.e()
            if (r3 == 0) goto L59
            float r1 = -r1
            goto L3e
        L59:
            androidx.recyclerview.widget.RecyclerView$l r3 = r13.m
            boolean r3 = r3.d()
            if (r3 == 0) goto L64
            r3 = r1
            r1 = r2
            goto L66
        L64:
            r1 = r2
            r3 = r1
        L66:
            int r4 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r4 != 0) goto L6e
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto Lf1
        L6e:
            float r2 = r13.W
            float r3 = r3 * r2
            int r2 = (int) r3
            float r3 = r13.a0
            float r1 = r1 * r3
            int r1 = (int) r1
            androidx.recyclerview.widget.RecyclerView$l r3 = r13.m
            if (r3 != 0) goto L82
            java.lang.String r1 = "RecyclerView"
            java.lang.String r2 = "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument."
            android.util.Log.e(r1, r2)
            return r6
        L82:
            boolean r4 = r13.x
            if (r4 == 0) goto L88
            goto Lf1
        L88:
            int[] r7 = r13.r0
            r7[r6] = r6
            r8 = 1
            r7[r8] = r6
            boolean r9 = r3.d()
            androidx.recyclerview.widget.RecyclerView$l r3 = r13.m
            boolean r10 = r3.e()
            if (r10 == 0) goto L9e
            r3 = r9 | 2
            goto L9f
        L9e:
            r3 = r9
        L9f:
            float r4 = r14.getY()
            float r5 = r14.getX()
            int r4 = r13.Y(r2, r4)
            int r11 = r2 - r4
            int r2 = r13.Z(r1, r5)
            int r12 = r1 - r2
            a.Jb r1 = r13.getScrollingChildHelper()
            r5 = 1
            r1.g(r3, r5)
            if (r9 == 0) goto Lbf
            r1 = r11
            goto Lc0
        Lbf:
            r1 = r6
        Lc0:
            if (r10 == 0) goto Lc4
            r2 = r12
            goto Lc5
        Lc4:
            r2 = r6
        Lc5:
            int[] r3 = r13.r0
            int[] r4 = r13.p0
            r0 = r13
            boolean r1 = r0.u(r1, r2, r3, r4, r5)
            if (r1 == 0) goto Ld6
            r1 = r7[r6]
            int r11 = r11 - r1
            r1 = r7[r8]
            int r12 = r12 - r1
        Ld6:
            if (r9 == 0) goto Lda
            r1 = r11
            goto Ldb
        Lda:
            r1 = r6
        Ldb:
            if (r10 == 0) goto Ldf
            r2 = r12
            goto Le0
        Ldf:
            r2 = r6
        Le0:
            r13.c0(r1, r2, r14, r5)
            androidx.recyclerview.widget.m r1 = r13.d0
            if (r1 == 0) goto Lee
            if (r11 != 0) goto Leb
            if (r12 == 0) goto Lee
        Leb:
            r1.a(r13, r11, r12)
        Lee:
            r13.j0(r5)
        Lf1:
            return r6
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r12) {
            r11 = this;
            boolean r0 = r11.x
            r1 = 0
            if (r0 == 0) goto L7
            goto L1be
        L7:
            r0 = 0
            r11.r = r0
            boolean r0 = r11.E(r12)
            r2 = 1
            if (r0 == 0) goto L18
            r11.b0()
            r11.setScrollState(r1)
            return r2
        L18:
            androidx.recyclerview.widget.RecyclerView$l r0 = r11.m
            if (r0 != 0) goto L1e
            goto L1be
        L1e:
            boolean r0 = r0.d()
            androidx.recyclerview.widget.RecyclerView$l r3 = r11.m
            boolean r3 = r3.e()
            android.view.VelocityTracker r4 = r11.N
            if (r4 != 0) goto L32
            android.view.VelocityTracker r4 = android.view.VelocityTracker.obtain()
            r11.N = r4
        L32:
            android.view.VelocityTracker r4 = r11.N
            r4.addMovement(r12)
            int r4 = r12.getActionMasked()
            int r5 = r12.getActionIndex()
            r6 = 2
            r7 = 1056964608(0x3f000000, float:0.5)
            if (r4 == 0) goto Le4
            if (r4 == r2) goto Lda
            if (r4 == r6) goto L7c
            r0 = 3
            if (r4 == r0) goto L74
            r0 = 5
            if (r4 == r0) goto L58
            r0 = 6
            if (r4 == r0) goto L53
            goto L1b9
        L53:
            r11.U(r12)
            goto L1b9
        L58:
            int r0 = r12.getPointerId(r5)
            r11.M = r0
            float r0 = r12.getX(r5)
            float r0 = r0 + r7
            int r0 = (int) r0
            r11.Q = r0
            r11.O = r0
            float r12 = r12.getY(r5)
            float r12 = r12 + r7
            int r12 = (int) r12
            r11.R = r12
            r11.P = r12
            goto L1b9
        L74:
            r11.b0()
            r11.setScrollState(r1)
            goto L1b9
        L7c:
            int r4 = r11.M
            int r4 = r12.findPointerIndex(r4)
            if (r4 >= 0) goto L9f
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r0 = "Error processing scroll; pointer index for id "
            r12.<init>(r0)
            int r0 = r11.M
            r12.append(r0)
            java.lang.String r0 = " not found. Did any MotionEvents get skipped?"
            r12.append(r0)
            java.lang.String r12 = r12.toString()
            java.lang.String r0 = "RecyclerView"
            android.util.Log.e(r0, r12)
            return r1
        L9f:
            float r5 = r12.getX(r4)
            float r5 = r5 + r7
            int r5 = (int) r5
            float r12 = r12.getY(r4)
            float r12 = r12 + r7
            int r12 = (int) r12
            int r4 = r11.L
            if (r4 == r2) goto L1b9
            int r4 = r11.O
            int r4 = r5 - r4
            int r6 = r11.P
            int r6 = r12 - r6
            if (r0 == 0) goto Lc5
            int r0 = java.lang.Math.abs(r4)
            int r4 = r11.S
            if (r0 <= r4) goto Lc5
            r11.Q = r5
            r0 = r2
            goto Lc6
        Lc5:
            r0 = r1
        Lc6:
            if (r3 == 0) goto Ld3
            int r3 = java.lang.Math.abs(r6)
            int r4 = r11.S
            if (r3 <= r4) goto Ld3
            r11.R = r12
            r0 = r2
        Ld3:
            if (r0 == 0) goto L1b9
            r11.setScrollState(r2)
            goto L1b9
        Lda:
            android.view.VelocityTracker r12 = r11.N
            r12.clear()
            r11.j0(r1)
            goto L1b9
        Le4:
            boolean r4 = r11.y
            if (r4 == 0) goto Lea
            r11.y = r1
        Lea:
            int r4 = r12.getPointerId(r1)
            r11.M = r4
            float r4 = r12.getX()
            float r4 = r4 + r7
            int r4 = (int) r4
            r11.Q = r4
            r11.O = r4
            float r4 = r12.getY()
            float r4 = r4 + r7
            int r4 = (int) r4
            r11.R = r4
            r11.P = r4
            android.widget.EdgeEffect r4 = r11.G
            r5 = 1065353216(0x3f800000, float:1.0)
            r7 = -1
            r8 = 0
            if (r4 == 0) goto L12d
            float r4 = a.G5.a(r4)
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r4 == 0) goto L12d
            boolean r4 = r11.canScrollHorizontally(r7)
            if (r4 != 0) goto L12d
            android.widget.EdgeEffect r4 = r11.G
            float r9 = r12.getY()
            int r10 = r11.getHeight()
            float r10 = (float) r10
            float r9 = r9 / r10
            float r9 = r5 - r9
            a.G5.b(r4, r8, r9)
            r4 = r2
            goto L12e
        L12d:
            r4 = r1
        L12e:
            android.widget.EdgeEffect r9 = r11.I
            if (r9 == 0) goto L150
            float r9 = a.G5.a(r9)
            int r9 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r9 == 0) goto L150
            boolean r9 = r11.canScrollHorizontally(r2)
            if (r9 != 0) goto L150
            android.widget.EdgeEffect r4 = r11.I
            float r9 = r12.getY()
            int r10 = r11.getHeight()
            float r10 = (float) r10
            float r9 = r9 / r10
            a.G5.b(r4, r8, r9)
            r4 = r2
        L150:
            android.widget.EdgeEffect r9 = r11.H
            if (r9 == 0) goto L172
            float r9 = a.G5.a(r9)
            int r9 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r9 == 0) goto L172
            boolean r7 = r11.canScrollVertically(r7)
            if (r7 != 0) goto L172
            android.widget.EdgeEffect r4 = r11.H
            float r7 = r12.getX()
            int r9 = r11.getWidth()
            float r9 = (float) r9
            float r7 = r7 / r9
            a.G5.b(r4, r8, r7)
            r4 = r2
        L172:
            android.widget.EdgeEffect r7 = r11.J
            if (r7 == 0) goto L195
            float r7 = a.G5.a(r7)
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 == 0) goto L195
            boolean r7 = r11.canScrollVertically(r2)
            if (r7 != 0) goto L195
            android.widget.EdgeEffect r4 = r11.J
            float r12 = r12.getX()
            int r7 = r11.getWidth()
            float r7 = (float) r7
            float r12 = r12 / r7
            float r5 = r5 - r12
            a.G5.b(r4, r8, r5)
            r4 = r2
        L195:
            if (r4 != 0) goto L19b
            int r12 = r11.L
            if (r12 != r6) goto L1a8
        L19b:
            android.view.ViewParent r12 = r11.getParent()
            r12.requestDisallowInterceptTouchEvent(r2)
            r11.setScrollState(r2)
            r11.j0(r2)
        L1a8:
            int[] r12 = r11.q0
            r12[r2] = r1
            r12[r1] = r1
            if (r3 == 0) goto L1b2
            r0 = r0 | 2
        L1b2:
            a.Jb r12 = r11.getScrollingChildHelper()
            r12.g(r0, r1)
        L1b9:
            int r12 = r11.L
            if (r12 != r2) goto L1be
            return r2
        L1be:
            return r1
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            int r1 = a.Af.f16a
            java.lang.String r1 = "RV OnLayout"
            android.os.Trace.beginSection(r1)
            r0.r()
            android.os.Trace.endSection()
            r1 = 1
            r0.u = r1
            return
    }

    @Override // android.view.View
    public final void onMeasure(int r7, int r8) {
            r6 = this;
            androidx.recyclerview.widget.RecyclerView$l r0 = r6.m
            if (r0 != 0) goto L8
            r6.q(r7, r8)
            return
        L8:
            boolean r0 = r0.L()
            r1 = 0
            androidx.recyclerview.widget.RecyclerView$w r2 = r6.f0
            if (r0 == 0) goto L7b
            int r0 = android.view.View.MeasureSpec.getMode(r7)
            int r3 = android.view.View.MeasureSpec.getMode(r8)
            androidx.recyclerview.widget.RecyclerView$l r4 = r6.m
            androidx.recyclerview.widget.RecyclerView r4 = r4.b
            r4.q(r7, r8)
            r4 = 1
            r5 = 1073741824(0x40000000, float:2.0)
            if (r0 != r5) goto L28
            if (r3 != r5) goto L28
            r1 = r4
        L28:
            r6.u0 = r1
            if (r1 != 0) goto L7a
            androidx.recyclerview.widget.RecyclerView$d r0 = r6.l
            if (r0 != 0) goto L31
            goto L7a
        L31:
            int r0 = r2.d
            if (r0 != r4) goto L38
            r6.s()
        L38:
            androidx.recyclerview.widget.RecyclerView$l r0 = r6.m
            r0.s0(r7, r8)
            r2.i = r4
            r6.t()
            androidx.recyclerview.widget.RecyclerView$l r0 = r6.m
            r0.u0(r7, r8)
            androidx.recyclerview.widget.RecyclerView$l r0 = r6.m
            boolean r0 = r0.x0()
            if (r0 == 0) goto L6e
            androidx.recyclerview.widget.RecyclerView$l r0 = r6.m
            int r1 = r6.getMeasuredWidth()
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r5)
            int r3 = r6.getMeasuredHeight()
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r5)
            r0.s0(r1, r3)
            r2.i = r4
            r6.t()
            androidx.recyclerview.widget.RecyclerView$l r0 = r6.m
            r0.u0(r7, r8)
        L6e:
            int r7 = r6.getMeasuredWidth()
            r6.v0 = r7
            int r7 = r6.getMeasuredHeight()
            r6.w0 = r7
        L7a:
            return
        L7b:
            boolean r0 = r6.t
            if (r0 == 0) goto L87
            androidx.recyclerview.widget.RecyclerView$l r0 = r6.m
            androidx.recyclerview.widget.RecyclerView r0 = r0.b
            r0.q(r7, r8)
            return
        L87:
            boolean r0 = r2.k
            if (r0 == 0) goto L97
            int r7 = r6.getMeasuredWidth()
            int r8 = r6.getMeasuredHeight()
            r6.setMeasuredDimension(r7, r8)
            return
        L97:
            androidx.recyclerview.widget.RecyclerView$d r0 = r6.l
            if (r0 == 0) goto La2
            int r0 = r0.a()
            r2.e = r0
            goto La4
        La2:
            r2.e = r1
        La4:
            r6.h0()
            androidx.recyclerview.widget.RecyclerView$l r0 = r6.m
            androidx.recyclerview.widget.RecyclerView r0 = r0.b
            r0.q(r7, r8)
            r6.i0(r1)
            r2.g = r1
            return
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int r2, android.graphics.Rect r3) {
            r1 = this;
            boolean r0 = r1.O()
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
            boolean r0 = r2 instanceof androidx.recyclerview.widget.RecyclerView.u
            if (r0 != 0) goto L8
            super.onRestoreInstanceState(r2)
            return
        L8:
            androidx.recyclerview.widget.RecyclerView$u r2 = (androidx.recyclerview.widget.RecyclerView.u) r2
            r1.d = r2
            android.os.Parcelable r2 = r2.f661a
            super.onRestoreInstanceState(r2)
            r1.requestLayout()
            return
    }

    @Override // android.view.View
    public final android.os.Parcelable onSaveInstanceState() {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView$u r0 = new androidx.recyclerview.widget.RecyclerView$u
            android.os.Parcelable r1 = super.onSaveInstanceState()
            r0.<init>(r1)
            androidx.recyclerview.widget.RecyclerView$u r1 = r2.d
            if (r1 == 0) goto L12
            android.os.Parcelable r1 = r1.c
            r0.c = r1
            return r0
        L12:
            androidx.recyclerview.widget.RecyclerView$l r1 = r2.m
            if (r1 == 0) goto L1d
            android.os.Parcelable r1 = r1.g0()
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
            r0.J = r1
            r0.H = r1
            r0.I = r1
            r0.G = r1
            return
    }

    @Override // android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent r26) {
            r25 = this;
            r0 = r25
            r6 = r26
            boolean r1 = r0.x
            r7 = 0
            if (r1 != 0) goto Ld
            boolean r1 = r0.y
            if (r1 == 0) goto L10
        Ld:
            r2 = r7
            goto L443
        L10:
            androidx.recyclerview.widget.RecyclerView$o r1 = r0.r
            r8 = 1
            r2 = 0
            r3 = 3
            if (r1 != 0) goto L24
            int r1 = r6.getAction()
            if (r1 != 0) goto L1f
            r1 = r7
            goto L32
        L1f:
            boolean r1 = r25.E(r26)
            goto L32
        L24:
            r1.b(r6)
            int r1 = r6.getAction()
            if (r1 == r3) goto L2f
            if (r1 != r8) goto L31
        L2f:
            r0.r = r2
        L31:
            r1 = r8
        L32:
            if (r1 == 0) goto L3b
            r0.b0()
            r0.setScrollState(r7)
            return r8
        L3b:
            androidx.recyclerview.widget.RecyclerView$l r1 = r0.m
            if (r1 != 0) goto L40
            goto Ld
        L40:
            boolean r9 = r1.d()
            androidx.recyclerview.widget.RecyclerView$l r1 = r0.m
            boolean r10 = r1.e()
            android.view.VelocityTracker r1 = r0.N
            if (r1 != 0) goto L54
            android.view.VelocityTracker r1 = android.view.VelocityTracker.obtain()
            r0.N = r1
        L54:
            int r1 = r6.getActionMasked()
            int r4 = r6.getActionIndex()
            int[] r11 = r0.q0
            if (r1 != 0) goto L64
            r11[r8] = r7
            r11[r7] = r7
        L64:
            android.view.MotionEvent r12 = android.view.MotionEvent.obtain(r6)
            r5 = r11[r7]
            float r5 = (float) r5
            r13 = r11[r8]
            float r13 = (float) r13
            r12.offsetLocation(r5, r13)
            r5 = 1056964608(0x3f000000, float:0.5)
            if (r1 == 0) goto L411
            java.lang.String r13 = "RecyclerView"
            if (r1 == r8) goto L19f
            r2 = 2
            if (r1 == r2) goto Laf
            if (r1 == r3) goto La7
            r2 = 5
            if (r1 == r2) goto L8b
            r2 = 6
            if (r1 == r2) goto L86
            goto L438
        L86:
            r25.U(r26)
            goto L438
        L8b:
            int r1 = r6.getPointerId(r4)
            r0.M = r1
            float r1 = r6.getX(r4)
            float r1 = r1 + r5
            int r1 = (int) r1
            r0.Q = r1
            r0.O = r1
            float r1 = r6.getY(r4)
            float r1 = r1 + r5
            int r1 = (int) r1
            r0.R = r1
            r0.P = r1
            goto L438
        La7:
            r0.b0()
            r0.setScrollState(r7)
            goto L438
        Laf:
            int r1 = r0.M
            int r1 = r6.findPointerIndex(r1)
            if (r1 >= 0) goto Ld0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Error processing scroll; pointer index for id "
            r1.<init>(r2)
            int r2 = r0.M
            r1.append(r2)
            java.lang.String r2 = " not found. Did any MotionEvents get skipped?"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r13, r1)
            return r7
        Ld0:
            float r2 = r6.getX(r1)
            float r2 = r2 + r5
            int r13 = (int) r2
            float r1 = r6.getY(r1)
            float r1 = r1 + r5
            int r14 = (int) r1
            int r1 = r0.Q
            int r1 = r1 - r13
            int r2 = r0.R
            int r2 = r2 - r14
            int r3 = r0.L
            if (r3 == r8) goto L119
            if (r9 == 0) goto Lfd
            if (r1 <= 0) goto Lf2
            int r3 = r0.S
            int r1 = r1 - r3
            int r1 = java.lang.Math.max(r7, r1)
            goto Lf9
        Lf2:
            int r3 = r0.S
            int r1 = r1 + r3
            int r1 = java.lang.Math.min(r7, r1)
        Lf9:
            if (r1 == 0) goto Lfd
            r3 = r8
            goto Lfe
        Lfd:
            r3 = r7
        Lfe:
            if (r10 == 0) goto L114
            if (r2 <= 0) goto L10a
            int r4 = r0.S
            int r2 = r2 - r4
            int r2 = java.lang.Math.max(r7, r2)
            goto L111
        L10a:
            int r4 = r0.S
            int r2 = r2 + r4
            int r2 = java.lang.Math.min(r7, r2)
        L111:
            if (r2 == 0) goto L114
            r3 = r8
        L114:
            if (r3 == 0) goto L119
            r0.setScrollState(r8)
        L119:
            int r3 = r0.L
            if (r3 != r8) goto L438
            int[] r15 = r0.r0
            r15[r7] = r7
            r15[r8] = r7
            float r3 = r6.getY()
            int r3 = r0.Y(r1, r3)
            int r16 = r1 - r3
            float r1 = r6.getX()
            int r1 = r0.Z(r2, r1)
            int r17 = r2 - r1
            if (r9 == 0) goto L13c
            r1 = r16
            goto L13d
        L13c:
            r1 = r7
        L13d:
            if (r10 == 0) goto L142
            r2 = r17
            goto L143
        L142:
            r2 = r7
        L143:
            r5 = 0
            int[] r3 = r0.r0
            int[] r4 = r0.p0
            boolean r1 = r0.u(r1, r2, r3, r4, r5)
            int[] r2 = r0.p0
            if (r1 == 0) goto L16d
            r1 = r15[r7]
            int r16 = r16 - r1
            r1 = r15[r8]
            int r17 = r17 - r1
            r1 = r11[r7]
            r3 = r2[r7]
            int r1 = r1 + r3
            r11[r7] = r1
            r1 = r11[r8]
            r3 = r2[r8]
            int r1 = r1 + r3
            r11[r8] = r1
            android.view.ViewParent r1 = r0.getParent()
            r1.requestDisallowInterceptTouchEvent(r8)
        L16d:
            r1 = r16
            r3 = r17
            r4 = r2[r7]
            int r13 = r13 - r4
            r0.Q = r13
            r2 = r2[r8]
            int r14 = r14 - r2
            r0.R = r14
            if (r9 == 0) goto L17f
            r2 = r1
            goto L180
        L17f:
            r2 = r7
        L180:
            if (r10 == 0) goto L184
            r4 = r3
            goto L185
        L184:
            r4 = r7
        L185:
            boolean r2 = r0.c0(r2, r4, r6, r7)
            if (r2 == 0) goto L192
            android.view.ViewParent r2 = r0.getParent()
            r2.requestDisallowInterceptTouchEvent(r8)
        L192:
            androidx.recyclerview.widget.m r2 = r0.d0
            if (r2 == 0) goto L438
            if (r1 != 0) goto L19a
            if (r3 == 0) goto L438
        L19a:
            r2.a(r0, r1, r3)
            goto L438
        L19f:
            android.view.VelocityTracker r1 = r0.N
            r1.addMovement(r12)
            android.view.VelocityTracker r1 = r0.N
            int r3 = r0.V
            float r4 = (float) r3
            r5 = 1000(0x3e8, float:1.401E-42)
            r1.computeCurrentVelocity(r5, r4)
            r1 = 0
            if (r9 == 0) goto L1bb
            android.view.VelocityTracker r4 = r0.N
            int r5 = r0.M
            float r4 = r4.getXVelocity(r5)
            float r4 = -r4
            goto L1bc
        L1bb:
            r4 = r1
        L1bc:
            if (r10 == 0) goto L1c8
            android.view.VelocityTracker r5 = r0.N
            int r6 = r0.M
            float r5 = r5.getYVelocity(r6)
            float r5 = -r5
            goto L1c9
        L1c8:
            r5 = r1
        L1c9:
            int r6 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r6 != 0) goto L1d5
            int r6 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r6 == 0) goto L1d2
            goto L1d5
        L1d2:
            r1 = r7
            goto L40a
        L1d5:
            int r4 = (int) r4
            int r5 = (int) r5
            androidx.recyclerview.widget.RecyclerView$l r6 = r0.m
            if (r6 != 0) goto L1e2
            java.lang.String r1 = "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument."
            android.util.Log.e(r13, r1)
            goto L409
        L1e2:
            boolean r9 = r0.x
            if (r9 == 0) goto L1e8
            goto L409
        L1e8:
            boolean r6 = r6.d()
            androidx.recyclerview.widget.RecyclerView$l r9 = r0.m
            boolean r9 = r9.e()
            int r10 = r0.U
            if (r6 == 0) goto L1fc
            int r11 = java.lang.Math.abs(r4)
            if (r11 >= r10) goto L1fd
        L1fc:
            r4 = r7
        L1fd:
            if (r9 == 0) goto L205
            int r11 = java.lang.Math.abs(r5)
            if (r11 >= r10) goto L206
        L205:
            r5 = r7
        L206:
            if (r4 != 0) goto L20c
            if (r5 != 0) goto L20c
            goto L409
        L20c:
            if (r4 == 0) goto L24e
            android.widget.EdgeEffect r10 = r0.G
            if (r10 == 0) goto L230
            float r10 = a.G5.a(r10)
            int r10 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r10 == 0) goto L230
            android.widget.EdgeEffect r10 = r0.G
            int r11 = -r4
            int r13 = r0.getWidth()
            boolean r10 = r0.f0(r10, r11, r13)
            if (r10 == 0) goto L22d
            android.widget.EdgeEffect r4 = r0.G
            r4.onAbsorb(r11)
        L22c:
            r4 = r7
        L22d:
            r10 = r4
            r4 = r7
            goto L24f
        L230:
            android.widget.EdgeEffect r10 = r0.I
            if (r10 == 0) goto L24e
            float r10 = a.G5.a(r10)
            int r10 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r10 == 0) goto L24e
            android.widget.EdgeEffect r10 = r0.I
            int r11 = r0.getWidth()
            boolean r10 = r0.f0(r10, r4, r11)
            if (r10 == 0) goto L22d
            android.widget.EdgeEffect r10 = r0.I
            r10.onAbsorb(r4)
            goto L22c
        L24e:
            r10 = r7
        L24f:
            if (r5 == 0) goto L290
            android.widget.EdgeEffect r11 = r0.H
            if (r11 == 0) goto L272
            float r11 = a.G5.a(r11)
            int r11 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r11 == 0) goto L272
            android.widget.EdgeEffect r11 = r0.H
            int r13 = -r5
            int r14 = r0.getHeight()
            boolean r11 = r0.f0(r11, r13, r14)
            if (r11 == 0) goto L270
            android.widget.EdgeEffect r5 = r0.H
            r5.onAbsorb(r13)
        L26f:
            r5 = r7
        L270:
            r11 = r7
            goto L292
        L272:
            android.widget.EdgeEffect r11 = r0.J
            if (r11 == 0) goto L290
            float r11 = a.G5.a(r11)
            int r11 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r11 == 0) goto L290
            android.widget.EdgeEffect r11 = r0.J
            int r13 = r0.getHeight()
            boolean r11 = r0.f0(r11, r5, r13)
            if (r11 == 0) goto L270
            android.widget.EdgeEffect r11 = r0.J
            r11.onAbsorb(r5)
            goto L26f
        L290:
            r11 = r5
            r5 = r7
        L292:
            androidx.recyclerview.widget.RecyclerView$z r13 = r0.c0
            if (r10 != 0) goto L298
            if (r5 == 0) goto L2ac
        L298:
            int r14 = -r3
            int r10 = java.lang.Math.min(r10, r3)
            int r10 = java.lang.Math.max(r14, r10)
            int r5 = java.lang.Math.min(r5, r3)
            int r5 = java.lang.Math.max(r14, r5)
            r13.a(r10, r5)
        L2ac:
            if (r4 != 0) goto L2b6
            if (r11 != 0) goto L2b6
            if (r10 != 0) goto L40d
            if (r5 == 0) goto L409
            goto L40d
        L2b6:
            float r5 = (float) r4
            float r10 = (float) r11
            boolean r14 = r0.dispatchNestedPreFling(r5, r10)
            if (r14 != 0) goto L409
            if (r6 != 0) goto L2c5
            if (r9 == 0) goto L2c3
            goto L2c5
        L2c3:
            r14 = r7
            goto L2c6
        L2c5:
            r14 = r8
        L2c6:
            r0.dispatchNestedFling(r5, r10, r14)
            androidx.recyclerview.widget.RecyclerView$n r5 = r0.T
            if (r5 == 0) goto L3de
            androidx.recyclerview.widget.A r5 = (androidx.recyclerview.widget.A) r5
            androidx.recyclerview.widget.RecyclerView r10 = r5.f951a
            androidx.recyclerview.widget.RecyclerView$l r10 = r10.getLayoutManager()
            if (r10 != 0) goto L2d9
            goto L3de
        L2d9:
            androidx.recyclerview.widget.RecyclerView r15 = r5.f951a
            androidx.recyclerview.widget.RecyclerView$d r15 = r15.getAdapter()
            if (r15 != 0) goto L2e3
            goto L3de
        L2e3:
            androidx.recyclerview.widget.RecyclerView r15 = r5.f951a
            int r15 = r15.getMinFlingVelocity()
            r26 = r1
            int r1 = java.lang.Math.abs(r11)
            if (r1 > r15) goto L2f7
            int r1 = java.lang.Math.abs(r4)
            if (r1 <= r15) goto L3de
        L2f7:
            boolean r1 = r10 instanceof androidx.recyclerview.widget.RecyclerView.v.b
            if (r1 != 0) goto L2fd
            goto L3de
        L2fd:
            androidx.recyclerview.widget.u r5 = (androidx.recyclerview.widget.u) r5
            if (r1 != 0) goto L303
            r15 = r2
            goto L30e
        L303:
            androidx.recyclerview.widget.t r15 = new androidx.recyclerview.widget.t
            androidx.recyclerview.widget.RecyclerView r2 = r5.f951a
            android.content.Context r2 = r2.getContext()
            r15.<init>(r5, r2)
        L30e:
            if (r15 != 0) goto L312
            goto L3de
        L312:
            int r2 = r10.B()
            if (r2 != 0) goto L320
        L318:
            r22 = r6
            r18 = r8
        L31c:
            r1 = -1
        L31d:
            r2 = -1
            goto L3d5
        L320:
            boolean r18 = r10.e()
            if (r18 == 0) goto L32b
            androidx.recyclerview.widget.s r5 = r5.f(r10)
            goto L337
        L32b:
            boolean r18 = r10.d()
            if (r18 == 0) goto L336
            androidx.recyclerview.widget.s r5 = r5.e(r10)
            goto L337
        L336:
            r5 = 0
        L337:
            if (r5 != 0) goto L33a
            goto L318
        L33a:
            r18 = r8
            int r8 = r10.v()
            r19 = -2147483648(0xffffffff80000000, float:-0.0)
            r20 = 2147483647(0x7fffffff, float:NaN)
            r21 = r1
            r22 = r6
            r1 = r19
            r6 = r20
            r7 = 0
            r16 = 0
            r19 = 0
        L352:
            if (r7 >= r8) goto L378
            r23 = r8
            android.view.View r8 = r10.u(r7)
            if (r8 != 0) goto L35f
            r24 = r7
            goto L373
        L35f:
            r24 = r7
            int r7 = androidx.recyclerview.widget.u.c(r8, r5)
            if (r7 > 0) goto L36c
            if (r7 <= r1) goto L36c
            r1 = r7
            r19 = r8
        L36c:
            if (r7 < 0) goto L373
            if (r7 >= r6) goto L373
            r6 = r7
            r16 = r8
        L373:
            int r7 = r24 + 1
            r8 = r23
            goto L352
        L378:
            boolean r1 = r10.d()
            if (r1 == 0) goto L385
            if (r4 <= 0) goto L383
        L380:
            r1 = r18
            goto L388
        L383:
            r1 = 0
            goto L388
        L385:
            if (r11 <= 0) goto L383
            goto L380
        L388:
            if (r1 == 0) goto L391
            if (r16 == 0) goto L391
            int r1 = androidx.recyclerview.widget.RecyclerView.l.H(r16)
            goto L31d
        L391:
            if (r1 != 0) goto L39a
            if (r19 == 0) goto L39a
            int r1 = androidx.recyclerview.widget.RecyclerView.l.H(r19)
            goto L31d
        L39a:
            if (r1 == 0) goto L39e
            r16 = r19
        L39e:
            if (r16 != 0) goto L3a2
            goto L31c
        L3a2:
            int r5 = androidx.recyclerview.widget.RecyclerView.l.H(r16)
            int r6 = r10.B()
            if (r21 == 0) goto L3c4
            r7 = r10
            androidx.recyclerview.widget.RecyclerView$v$b r7 = (androidx.recyclerview.widget.RecyclerView.v.b) r7
            int r6 = r6 + (-1)
            android.graphics.PointF r6 = r7.a(r6)
            if (r6 == 0) goto L3c4
            float r7 = r6.x
            int r7 = (r7 > r26 ? 1 : (r7 == r26 ? 0 : -1))
            if (r7 < 0) goto L3c6
            float r6 = r6.y
            int r6 = (r6 > r26 ? 1 : (r6 == r26 ? 0 : -1))
            if (r6 >= 0) goto L3c4
            goto L3c6
        L3c4:
            r6 = 0
            goto L3c8
        L3c6:
            r6 = r18
        L3c8:
            if (r6 != r1) goto L3cc
            r1 = -1
            goto L3ce
        L3cc:
            r1 = r18
        L3ce:
            int r1 = r1 + r5
            if (r1 < 0) goto L31c
            if (r1 < r2) goto L31d
            goto L31c
        L3d5:
            if (r1 != r2) goto L3d8
            goto L3e2
        L3d8:
            r15.f980a = r1
            r10.A0(r15)
            goto L40d
        L3de:
            r22 = r6
            r18 = r8
        L3e2:
            if (r14 == 0) goto L409
            if (r9 == 0) goto L3e9
            r6 = r22 | 2
            goto L3eb
        L3e9:
            r6 = r22
        L3eb:
            a.Jb r1 = r0.getScrollingChildHelper()
            r2 = r18
            r1.g(r6, r2)
            int r1 = -r3
            int r2 = java.lang.Math.min(r4, r3)
            int r2 = java.lang.Math.max(r1, r2)
            int r3 = java.lang.Math.min(r11, r3)
            int r1 = java.lang.Math.max(r1, r3)
            r13.a(r2, r1)
            goto L40d
        L409:
            r1 = 0
        L40a:
            r0.setScrollState(r1)
        L40d:
            r0.b0()
            goto L43d
        L411:
            r1 = r7
            int r2 = r6.getPointerId(r1)
            r0.M = r2
            float r1 = r6.getX()
            float r1 = r1 + r5
            int r1 = (int) r1
            r0.Q = r1
            r0.O = r1
            float r1 = r6.getY()
            float r1 = r1 + r5
            int r1 = (int) r1
            r0.R = r1
            r0.P = r1
            if (r10 == 0) goto L430
            r9 = r9 | 2
        L430:
            a.Jb r1 = r0.getScrollingChildHelper()
            r2 = 0
            r1.g(r9, r2)
        L438:
            android.view.VelocityTracker r1 = r0.N
            r1.addMovement(r12)
        L43d:
            r12.recycle()
            r18 = 1
            return r18
        L443:
            return r2
    }

    public final void p() {
            r3 = this;
            androidx.recyclerview.widget.a r0 = r3.e
            boolean r1 = r3.u
            java.lang.String r2 = "RV FullInvalidate"
            if (r1 == 0) goto L29
            boolean r1 = r3.B
            if (r1 == 0) goto Ld
            goto L29
        Ld:
            boolean r1 = r0.f()
            if (r1 != 0) goto L14
            goto L28
        L14:
            r0.getClass()
            boolean r0 = r0.f()
            if (r0 == 0) goto L28
            int r0 = a.Af.f16a
            android.os.Trace.beginSection(r2)
            r3.r()
            android.os.Trace.endSection()
        L28:
            return
        L29:
            int r0 = a.Af.f16a
            android.os.Trace.beginSection(r2)
            r3.r()
            android.os.Trace.endSection()
            return
    }

    public final void q(int r3, int r4) {
            r2 = this;
            int r0 = r2.getPaddingLeft()
            int r1 = r2.getPaddingRight()
            int r1 = r1 + r0
            java.util.WeakHashMap<android.view.View, a.Jg> r0 = a.C0414ug.f721a
            int r0 = r2.getMinimumWidth()
            int r3 = androidx.recyclerview.widget.RecyclerView.l.g(r3, r1, r0)
            int r0 = r2.getPaddingTop()
            int r1 = r2.getPaddingBottom()
            int r1 = r1 + r0
            int r0 = r2.getMinimumHeight()
            int r4 = androidx.recyclerview.widget.RecyclerView.l.g(r4, r1, r0)
            r2.setMeasuredDimension(r3, r4)
            return
    }

    public final void r() {
            r21 = this;
            r0 = r21
            androidx.recyclerview.widget.RecyclerView$d r1 = r0.l
            java.lang.String r2 = "RecyclerView"
            if (r1 != 0) goto Le
            java.lang.String r1 = "No adapter attached; skipping layout"
            android.util.Log.w(r2, r1)
            return
        Le:
            androidx.recyclerview.widget.RecyclerView$l r1 = r0.m
            if (r1 != 0) goto L18
            java.lang.String r1 = "No layout manager attached; skipping layout"
            android.util.Log.e(r2, r1)
            return
        L18:
            androidx.recyclerview.widget.RecyclerView$w r1 = r0.f0
            r3 = 0
            r1.i = r3
            boolean r4 = r0.u0
            r5 = 1
            if (r4 == 0) goto L34
            int r4 = r0.v0
            int r6 = r0.getWidth()
            if (r4 != r6) goto L32
            int r4 = r0.w0
            int r6 = r0.getHeight()
            if (r4 == r6) goto L34
        L32:
            r4 = r5
            goto L35
        L34:
            r4 = r3
        L35:
            r0.v0 = r3
            r0.w0 = r3
            r0.u0 = r3
            int r6 = r1.d
            if (r6 != r5) goto L4b
            r0.s()
            androidx.recyclerview.widget.RecyclerView$l r4 = r0.m
            r4.r0(r0)
            r0.t()
            goto L83
        L4b:
            androidx.recyclerview.widget.a r6 = r0.e
            java.util.ArrayList<androidx.recyclerview.widget.a$a> r7 = r6.c
            boolean r7 = r7.isEmpty()
            if (r7 != 0) goto L5e
            java.util.ArrayList<androidx.recyclerview.widget.a$a> r6 = r6.b
            boolean r6 = r6.isEmpty()
            if (r6 != 0) goto L5e
            goto L7b
        L5e:
            if (r4 != 0) goto L7b
            androidx.recyclerview.widget.RecyclerView$l r4 = r0.m
            int r4 = r4.n
            int r6 = r0.getWidth()
            if (r4 != r6) goto L7b
            androidx.recyclerview.widget.RecyclerView$l r4 = r0.m
            int r4 = r4.o
            int r6 = r0.getHeight()
            if (r4 == r6) goto L75
            goto L7b
        L75:
            androidx.recyclerview.widget.RecyclerView$l r4 = r0.m
            r4.r0(r0)
            goto L83
        L7b:
            androidx.recyclerview.widget.RecyclerView$l r4 = r0.m
            r4.r0(r0)
            r0.t()
        L83:
            r4 = 4
            r1.a(r4)
            r0.h0()
            r0.S()
            r1.d = r5
            boolean r6 = r1.j
            r7 = 0
            androidx.recyclerview.widget.RecyclerView$r r8 = r0.c
            androidx.recyclerview.widget.C r9 = r0.g
            if (r6 == 0) goto L29f
            androidx.recyclerview.widget.b r6 = r0.f
            int r6 = r6.e()
            int r6 = r6 - r5
        L9f:
            if (r6 < 0) goto L1cc
            androidx.recyclerview.widget.b r10 = r0.f
            android.view.View r10 = r10.d(r6)
            androidx.recyclerview.widget.RecyclerView$A r10 = L(r10)
            boolean r11 = r10.o()
            if (r11 == 0) goto Lb5
            r17 = r5
            goto L1c5
        Lb5:
            long r11 = r0.J(r10)
            androidx.recyclerview.widget.RecyclerView$i r13 = r0.K
            r13.getClass()
            androidx.recyclerview.widget.RecyclerView$i$b r13 = new androidx.recyclerview.widget.RecyclerView$i$b
            r13.<init>()
            r13.a(r10)
            a.U9<androidx.recyclerview.widget.RecyclerView$A> r14 = r9.b
            java.lang.Object r14 = r14.c(r11, r7)
            androidx.recyclerview.widget.RecyclerView$A r14 = (androidx.recyclerview.widget.RecyclerView.A) r14
            if (r14 == 0) goto L1c0
            boolean r15 = r14.o()
            if (r15 != 0) goto L1c0
            a.ge<androidx.recyclerview.widget.RecyclerView$A, androidx.recyclerview.widget.C$a> r15 = r9.f955a
            java.lang.Object r16 = r15.getOrDefault(r14, r7)
            r17 = r5
            r5 = r16
            androidx.recyclerview.widget.C$a r5 = (androidx.recyclerview.widget.C.a) r5
            if (r5 == 0) goto Led
            int r5 = r5.f956a
            r5 = r5 & 1
            if (r5 == 0) goto Led
            r5 = r17
            goto Lee
        Led:
            r5 = r3
        Lee:
            java.lang.Object r15 = r15.getOrDefault(r10, r7)
            androidx.recyclerview.widget.C$a r15 = (androidx.recyclerview.widget.C.a) r15
            if (r15 == 0) goto Lff
            int r15 = r15.f956a
            r15 = r15 & 1
            if (r15 == 0) goto Lff
            r15 = r17
            goto L100
        Lff:
            r15 = r3
        L100:
            if (r5 == 0) goto L109
            if (r14 != r10) goto L109
            r9.a(r10, r13)
            goto L1c5
        L109:
            androidx.recyclerview.widget.RecyclerView$i$b r7 = r9.b(r14, r4)
            r9.a(r10, r13)
            r13 = 8
            androidx.recyclerview.widget.RecyclerView$i$b r13 = r9.b(r10, r13)
            if (r7 != 0) goto L198
            androidx.recyclerview.widget.b r5 = r0.f
            int r5 = r5.e()
            r7 = r3
        L11f:
            if (r7 >= r5) goto L177
            androidx.recyclerview.widget.b r13 = r0.f
            android.view.View r13 = r13.d(r7)
            androidx.recyclerview.widget.RecyclerView$A r13 = L(r13)
            if (r13 != r10) goto L12e
            goto L174
        L12e:
            long r18 = r0.J(r13)
            int r15 = (r18 > r11 ? 1 : (r18 == r11 ? 0 : -1))
            if (r15 != 0) goto L174
            androidx.recyclerview.widget.RecyclerView$d r1 = r0.l
            java.lang.String r2 = " \n View Holder 2:"
            if (r1 == 0) goto L15a
            boolean r1 = r1.b
            if (r1 == 0) goto L15a
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:"
            r3.<init>(r4)
            r3.append(r13)
            r3.append(r2)
            r3.append(r10)
            java.lang.String r2 = a.C0487z.d(r0, r3)
            r1.<init>(r2)
            throw r1
        L15a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:"
            r3.<init>(r4)
            r3.append(r13)
            r3.append(r2)
            r3.append(r10)
            java.lang.String r2 = a.C0487z.d(r0, r3)
            r1.<init>(r2)
            throw r1
        L174:
            int r7 = r7 + 1
            goto L11f
        L177:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r7 = "Problem while matching changed view holders with the newones. The pre-layout information for the change holder "
            r5.<init>(r7)
            r5.append(r14)
            java.lang.String r7 = " cannot be found but it is necessary for "
            r5.append(r7)
            r5.append(r10)
            java.lang.String r7 = r0.B()
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            android.util.Log.e(r2, r5)
            goto L1c5
        L198:
            r14.n(r3)
            if (r5 == 0) goto L1a0
            r0.h(r14)
        L1a0:
            if (r14 == r10) goto L1b4
            if (r15 == 0) goto L1a7
            r0.h(r10)
        L1a7:
            r14.h = r10
            r0.h(r14)
            r8.l(r14)
            r10.n(r3)
            r10.i = r14
        L1b4:
            androidx.recyclerview.widget.RecyclerView$i r5 = r0.K
            boolean r5 = r5.a(r14, r10, r7, r13)
            if (r5 == 0) goto L1c5
            r0.V()
            goto L1c5
        L1c0:
            r17 = r5
            r9.a(r10, r13)
        L1c5:
            int r6 = r6 + (-1)
            r5 = r17
            r7 = 0
            goto L9f
        L1cc:
            r17 = r5
            a.ge<androidx.recyclerview.widget.RecyclerView$A, androidx.recyclerview.widget.C$a> r2 = r9.f955a
            int r4 = r2.c
            int r4 = r4 + (-1)
        L1d4:
            if (r4 < 0) goto L29d
            java.lang.Object r5 = r2.h(r4)
            r11 = r5
            androidx.recyclerview.widget.RecyclerView$A r11 = (androidx.recyclerview.widget.RecyclerView.A) r11
            java.lang.Object r5 = r2.i(r4)
            androidx.recyclerview.widget.C$a r5 = (androidx.recyclerview.widget.C.a) r5
            int r6 = r5.f956a
            r7 = r6 & 3
            r10 = 3
            androidx.recyclerview.widget.RecyclerView$c r12 = r0.x0
            if (r7 != r10) goto L1fa
            androidx.recyclerview.widget.RecyclerView r6 = r12.f965a
            androidx.recyclerview.widget.RecyclerView$l r7 = r6.m
            android.view.View r10 = r11.f963a
            androidx.recyclerview.widget.RecyclerView$r r6 = r6.c
            r7.k0(r10, r6)
        L1f7:
            r7 = 0
            goto L28d
        L1fa:
            r7 = r6 & 1
            if (r7 == 0) goto L214
            androidx.recyclerview.widget.RecyclerView$i$b r6 = r5.b
            if (r6 != 0) goto L20e
            androidx.recyclerview.widget.RecyclerView r6 = r12.f965a
            androidx.recyclerview.widget.RecyclerView$l r7 = r6.m
            android.view.View r10 = r11.f963a
            androidx.recyclerview.widget.RecyclerView$r r6 = r6.c
            r7.k0(r10, r6)
            goto L1f7
        L20e:
            androidx.recyclerview.widget.RecyclerView$i$b r7 = r5.c
            r12.b(r11, r6, r7)
            goto L1f7
        L214:
            r7 = r6 & 14
            r10 = 14
            if (r7 != r10) goto L222
            androidx.recyclerview.widget.RecyclerView$i$b r6 = r5.b
            androidx.recyclerview.widget.RecyclerView$i$b r7 = r5.c
            r12.a(r11, r6, r7)
            goto L1f7
        L222:
            r7 = r6 & 12
            r10 = 12
            if (r7 != r10) goto L274
            androidx.recyclerview.widget.RecyclerView$i$b r6 = r5.b
            androidx.recyclerview.widget.RecyclerView$i$b r7 = r5.c
            r12.getClass()
            r11.n(r3)
            androidx.recyclerview.widget.RecyclerView r10 = r12.f965a
            boolean r12 = r10.B
            if (r12 == 0) goto L244
            androidx.recyclerview.widget.RecyclerView$i r12 = r10.K
            boolean r6 = r12.a(r11, r11, r6, r7)
            if (r6 == 0) goto L272
            r10.V()
            goto L272
        L244:
            androidx.recyclerview.widget.RecyclerView$i r12 = r10.K
            androidx.recyclerview.widget.z r12 = (androidx.recyclerview.widget.z) r12
            r12.getClass()
            int r13 = r6.f969a
            int r14 = r7.f969a
            if (r13 != r14) goto L25e
            int r15 = r6.b
            int r3 = r7.b
            if (r15 == r3) goto L258
            goto L25e
        L258:
            r12.c(r11)
            r3 = r10
            r6 = 0
            goto L26d
        L25e:
            int r3 = r6.b
            int r15 = r7.b
            r20 = r13
            r13 = r3
            r3 = r10
            r10 = r12
            r12 = r20
            boolean r6 = r10.g(r11, r12, r13, r14, r15)
        L26d:
            if (r6 == 0) goto L272
            r3.V()
        L272:
            r3 = 0
            goto L1f7
        L274:
            r3 = r6 & 4
            if (r3 == 0) goto L280
            androidx.recyclerview.widget.RecyclerView$i$b r3 = r5.b
            r7 = 0
            r12.b(r11, r3, r7)
        L27e:
            r3 = 0
            goto L28d
        L280:
            r7 = 0
            r3 = r6 & 8
            if (r3 == 0) goto L27e
            androidx.recyclerview.widget.RecyclerView$i$b r3 = r5.b
            androidx.recyclerview.widget.RecyclerView$i$b r6 = r5.c
            r12.a(r11, r3, r6)
            goto L27e
        L28d:
            r5.f956a = r3
            r5.b = r7
            r5.c = r7
            a.Cc r3 = androidx.recyclerview.widget.C.a.d
            r3.c(r5)
            int r4 = r4 + (-1)
            r3 = 0
            goto L1d4
        L29d:
            r7 = 0
            goto L2a1
        L29f:
            r17 = r5
        L2a1:
            androidx.recyclerview.widget.RecyclerView$l r2 = r0.m
            r2.j0(r8)
            int r2 = r1.e
            r1.b = r2
            r3 = 0
            r0.B = r3
            r0.C = r3
            r1.j = r3
            r1.k = r3
            androidx.recyclerview.widget.RecyclerView$l r2 = r0.m
            r2.f = r3
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$A> r2 = r8.b
            if (r2 == 0) goto L2be
            r2.clear()
        L2be:
            androidx.recyclerview.widget.RecyclerView$l r2 = r0.m
            boolean r4 = r2.k
            if (r4 == 0) goto L2cb
            r2.j = r3
            r2.k = r3
            r8.m()
        L2cb:
            androidx.recyclerview.widget.RecyclerView$l r2 = r0.m
            r2.e0(r1)
            r2 = r17
            r0.T(r2)
            r0.i0(r3)
            a.ge<androidx.recyclerview.widget.RecyclerView$A, androidx.recyclerview.widget.C$a> r4 = r9.f955a
            r4.clear()
            a.U9<androidx.recyclerview.widget.RecyclerView$A> r4 = r9.b
            r4.a()
            int[] r4 = r0.n0
            r5 = r4[r3]
            r6 = r4[r2]
            r0.F(r4)
            r8 = r4[r3]
            if (r8 != r5) goto L2f6
            r4 = r4[r2]
            if (r4 == r6) goto L2f4
            goto L2f6
        L2f4:
            r2 = r3
            goto L2f7
        L2f6:
            r2 = 1
        L2f7:
            if (r2 == 0) goto L2fc
            r0.w(r3, r3)
        L2fc:
            boolean r2 = r0.b0
            r4 = -1
            r6 = -1
            if (r2 == 0) goto L3f6
            androidx.recyclerview.widget.RecyclerView$d r2 = r0.l
            if (r2 == 0) goto L3f6
            boolean r2 = r0.hasFocus()
            if (r2 == 0) goto L3f6
            int r2 = r0.getDescendantFocusability()
            r8 = 393216(0x60000, float:5.51013E-40)
            if (r2 == r8) goto L3f6
            int r2 = r0.getDescendantFocusability()
            r8 = 131072(0x20000, float:1.83671E-40)
            if (r2 != r8) goto L325
            boolean r2 = r0.isFocused()
            if (r2 == 0) goto L325
            goto L3f6
        L325:
            boolean r2 = r0.isFocused()
            if (r2 != 0) goto L33b
            android.view.View r2 = r0.getFocusedChild()
            androidx.recyclerview.widget.b r8 = r0.f
            java.util.ArrayList r8 = r8.c
            boolean r2 = r8.contains(r2)
            if (r2 != 0) goto L33b
            goto L3f6
        L33b:
            long r8 = r1.m
            int r2 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r2 == 0) goto L37f
            androidx.recyclerview.widget.RecyclerView$d r2 = r0.l
            boolean r2 = r2.b
            if (r2 == 0) goto L37f
            if (r2 != 0) goto L34a
            goto L37f
        L34a:
            androidx.recyclerview.widget.b r2 = r0.f
            int r2 = r2.h()
            r10 = r3
            r11 = r7
        L352:
            if (r10 >= r2) goto L380
            androidx.recyclerview.widget.b r12 = r0.f
            android.view.View r12 = r12.g(r10)
            androidx.recyclerview.widget.RecyclerView$A r12 = L(r12)
            if (r12 == 0) goto L37c
            boolean r13 = r12.h()
            if (r13 != 0) goto L37c
            long r13 = r12.e
            int r13 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r13 != 0) goto L37c
            androidx.recyclerview.widget.b r11 = r0.f
            java.util.ArrayList r11 = r11.c
            android.view.View r13 = r12.f963a
            boolean r11 = r11.contains(r13)
            if (r11 == 0) goto L37a
            r11 = r12
            goto L37c
        L37a:
            r11 = r12
            goto L380
        L37c:
            int r10 = r10 + 1
            goto L352
        L37f:
            r11 = r7
        L380:
            if (r11 == 0) goto L397
            androidx.recyclerview.widget.b r2 = r0.f
            java.util.ArrayList r2 = r2.c
            android.view.View r8 = r11.f963a
            boolean r2 = r2.contains(r8)
            if (r2 != 0) goto L397
            boolean r2 = r8.hasFocusable()
            if (r2 != 0) goto L395
            goto L397
        L395:
            r7 = r8
            goto L3dd
        L397:
            androidx.recyclerview.widget.b r2 = r0.f
            int r2 = r2.e()
            if (r2 <= 0) goto L3dd
            int r2 = r1.l
            if (r2 == r6) goto L3a4
            r3 = r2
        L3a4:
            int r2 = r1.b()
            r8 = r3
        L3a9:
            if (r8 >= r2) goto L3bf
            androidx.recyclerview.widget.RecyclerView$A r9 = r0.H(r8)
            if (r9 != 0) goto L3b2
            goto L3bf
        L3b2:
            android.view.View r9 = r9.f963a
            boolean r10 = r9.hasFocusable()
            if (r10 == 0) goto L3bc
            r7 = r9
            goto L3dd
        L3bc:
            int r8 = r8 + 1
            goto L3a9
        L3bf:
            int r2 = java.lang.Math.min(r2, r3)
            r17 = 1
            int r2 = r2 + (-1)
        L3c7:
            if (r2 < 0) goto L3dd
            androidx.recyclerview.widget.RecyclerView$A r3 = r0.H(r2)
            if (r3 != 0) goto L3d0
            goto L3dd
        L3d0:
            android.view.View r3 = r3.f963a
            boolean r8 = r3.hasFocusable()
            if (r8 == 0) goto L3da
            r7 = r3
            goto L3dd
        L3da:
            int r2 = r2 + (-1)
            goto L3c7
        L3dd:
            if (r7 == 0) goto L3f6
            int r2 = r1.n
            long r8 = (long) r2
            int r3 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r3 == 0) goto L3f3
            android.view.View r2 = r7.findViewById(r2)
            if (r2 == 0) goto L3f3
            boolean r3 = r2.isFocusable()
            if (r3 == 0) goto L3f3
            r7 = r2
        L3f3:
            r7.requestFocus()
        L3f6:
            r1.m = r4
            r1.l = r6
            r1.n = r6
            return
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(android.view.View r3, boolean r4) {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView$A r0 = L(r3)
            if (r0 == 0) goto L2e
            boolean r1 = r0.j()
            if (r1 == 0) goto L13
            int r1 = r0.j
            r1 = r1 & (-257(0xfffffffffffffeff, float:NaN))
            r0.j = r1
            goto L32
        L13:
            boolean r1 = r0.o()
            if (r1 == 0) goto L1a
            goto L32
        L1a:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r1 = "Called removeDetachedView with a view which is not flagged as tmp detached."
            r4.<init>(r1)
            r4.append(r0)
            java.lang.String r4 = a.C0487z.d(r2, r4)
            r3.<init>(r4)
            throw r3
        L2e:
            boolean r0 = androidx.recyclerview.widget.RecyclerView.y0
            if (r0 != 0) goto L3c
        L32:
            r3.clearAnimation()
            L(r3)
            super.removeDetachedView(r3, r4)
            return
        L3c:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "No ViewHolder found for child: "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r3 = a.C0487z.d(r2, r0)
            r4.<init>(r3)
            throw r4
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(android.view.View r2, android.view.View r3) {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView$l r0 = r1.m
            androidx.recyclerview.widget.o r0 = r0.e
            if (r0 == 0) goto Lb
            boolean r0 = r0.e
            if (r0 == 0) goto Lb
            goto L17
        Lb:
            boolean r0 = r1.O()
            if (r0 == 0) goto L12
            goto L17
        L12:
            if (r3 == 0) goto L17
            r1.a0(r2, r3)
        L17:
            super.requestChildFocus(r2, r3)
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(android.view.View r7, android.graphics.Rect r8, boolean r9) {
            r6 = this;
            androidx.recyclerview.widget.RecyclerView$l r0 = r6.m
            r5 = 0
            r1 = r6
            r2 = r7
            r3 = r8
            r4 = r9
            boolean r7 = r0.m0(r1, r2, r3, r4, r5)
            return r7
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean r5) {
            r4 = this;
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$o> r0 = r4.q
            int r1 = r0.size()
            r2 = 0
        L7:
            if (r2 >= r1) goto L15
            java.lang.Object r3 = r0.get(r2)
            androidx.recyclerview.widget.RecyclerView$o r3 = (androidx.recyclerview.widget.RecyclerView.o) r3
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
            int r0 = r1.v
            if (r0 != 0) goto Lc
            boolean r0 = r1.x
            if (r0 != 0) goto Lc
            super.requestLayout()
            return
        Lc:
            r0 = 1
            r1.w = r0
            return
    }

    public final void s() {
            r22 = this;
            r0 = r22
            androidx.recyclerview.widget.RecyclerView$w r1 = r0.f0
            r2 = 1
            r1.a(r2)
            r0.C(r1)
            r3 = 0
            r1.i = r3
            r0.h0()
            androidx.recyclerview.widget.C r4 = r0.g
            a.ge<androidx.recyclerview.widget.RecyclerView$A, androidx.recyclerview.widget.C$a> r5 = r4.f955a
            r5.clear()
            a.U9<androidx.recyclerview.widget.RecyclerView$A> r5 = r4.b
            r5.a()
            r0.S()
            boolean r6 = r0.B
            if (r6 == 0) goto L39
            androidx.recyclerview.widget.a r6 = r0.e
            java.util.ArrayList<androidx.recyclerview.widget.a$a> r7 = r6.b
            r6.i(r7)
            java.util.ArrayList<androidx.recyclerview.widget.a$a> r7 = r6.c
            r6.i(r7)
            boolean r6 = r0.C
            if (r6 == 0) goto L39
            androidx.recyclerview.widget.RecyclerView$l r6 = r0.m
            r6.Z()
        L39:
            androidx.recyclerview.widget.RecyclerView$i r6 = r0.K
            if (r6 == 0) goto L30b
            androidx.recyclerview.widget.RecyclerView$l r6 = r0.m
            boolean r6 = r6.B0()
            if (r6 == 0) goto L30b
            androidx.recyclerview.widget.a r6 = r0.e
            java.util.ArrayList<androidx.recyclerview.widget.a$a> r7 = r6.b
            androidx.recyclerview.widget.p r8 = r6.e
            r8.getClass()
        L4e:
            int r9 = r7.size()
            r10 = 1
            int r9 = r9 - r10
            r12 = 0
        L55:
            r13 = -1
            r14 = 8
            if (r9 < 0) goto L6b
            java.lang.Object r15 = r7.get(r9)
            androidx.recyclerview.widget.a$a r15 = (androidx.recyclerview.widget.C0506a.C0023a) r15
            int r15 = r15.f991a
            if (r15 != r14) goto L67
            if (r12 == 0) goto L68
            goto L6c
        L67:
            r12 = r10
        L68:
            int r9 = r9 + (-1)
            goto L55
        L6b:
            r9 = r13
        L6c:
            r12 = 4
            r15 = 2
            if (r9 == r13) goto L20d
            int r14 = r9 + 1
            java.lang.Object r16 = r7.get(r9)
            r11 = r16
            androidx.recyclerview.widget.a$a r11 = (androidx.recyclerview.widget.C0506a.C0023a) r11
            java.lang.Object r16 = r7.get(r14)
            r13 = r16
            androidx.recyclerview.widget.a$a r13 = (androidx.recyclerview.widget.C0506a.C0023a) r13
            int r2 = r13.f991a
            if (r2 == r10) goto L1de
            androidx.recyclerview.widget.a r3 = r8.f1013a
            r18 = 0
            if (r2 == r15) goto Lec
            if (r2 == r12) goto L90
            goto L209
        L90:
            int r2 = r11.c
            int r15 = r13.b
            if (r2 >= r15) goto L9b
            int r15 = r15 + (-1)
            r13.b = r15
            goto Lac
        L9b:
            int r10 = r13.c
            int r15 = r15 + r10
            if (r2 >= r15) goto Lac
            int r10 = r10 + (-1)
            r13.c = r10
            int r2 = r11.b
            r10 = 1
            androidx.recyclerview.widget.a$a r2 = r3.g(r12, r2, r10)
            goto Lae
        Lac:
            r2 = r18
        Lae:
            int r10 = r11.b
            int r15 = r13.b
            if (r10 > r15) goto Lb9
            int r15 = r15 + 1
            r13.b = r15
            goto Lcb
        Lb9:
            int r12 = r13.c
            int r15 = r15 + r12
            if (r10 >= r15) goto Lcb
            int r15 = r15 - r10
            int r10 = r10 + 1
            r12 = 4
            androidx.recyclerview.widget.a$a r18 = r3.g(r12, r10, r15)
            int r10 = r13.c
            int r10 = r10 - r15
            r13.c = r10
        Lcb:
            r10 = r18
            r7.set(r14, r11)
            int r11 = r13.c
            if (r11 <= 0) goto Ld8
            r7.set(r9, r13)
            goto Le0
        Ld8:
            r7.remove(r9)
            a.Cc r3 = r3.f990a
            r3.c(r13)
        Le0:
            if (r2 == 0) goto Le5
            r7.add(r9, r2)
        Le5:
            if (r10 == 0) goto L209
            r7.add(r9, r10)
            goto L209
        Lec:
            int r2 = r11.b
            int r10 = r11.c
            if (r2 >= r10) goto L104
            int r12 = r13.b
            if (r12 != r2) goto L100
            int r12 = r13.c
            int r2 = r10 - r2
            if (r12 != r2) goto L100
            r2 = 0
        Lfd:
            r17 = 1
            goto L113
        L100:
            r2 = 0
        L101:
            r17 = 0
            goto L113
        L104:
            int r12 = r13.b
            int r15 = r10 + 1
            if (r12 != r15) goto L111
            int r12 = r13.c
            int r2 = r2 - r10
            if (r12 != r2) goto L111
            r2 = 1
            goto Lfd
        L111:
            r2 = 1
            goto L101
        L113:
            int r12 = r13.b
            if (r10 >= r12) goto L11c
            int r12 = r12 + (-1)
            r13.b = r12
            goto L139
        L11c:
            int r15 = r13.c
            int r12 = r12 + r15
            if (r10 >= r12) goto L139
            int r15 = r15 + (-1)
            r13.c = r15
            r2 = 2
            r11.f991a = r2
            r10 = 1
            r11.c = r10
            int r2 = r13.c
            if (r2 != 0) goto L209
            r7.remove(r14)
            a.Cc r2 = r3.f990a
            r2.c(r13)
            goto L209
        L139:
            int r10 = r11.b
            int r12 = r13.b
            if (r10 > r12) goto L144
            int r12 = r12 + 1
            r13.b = r12
            goto L158
        L144:
            int r15 = r13.c
            int r12 = r12 + r15
            if (r10 >= r12) goto L158
            int r12 = r12 - r10
            int r10 = r10 + 1
            r15 = 2
            androidx.recyclerview.widget.a$a r18 = r3.g(r15, r10, r12)
            int r10 = r11.b
            int r12 = r13.b
            int r10 = r10 - r12
            r13.c = r10
        L158:
            r10 = r18
            if (r17 == 0) goto L169
            r7.set(r9, r13)
            r7.remove(r14)
            a.Cc r2 = r3.f990a
            r2.c(r11)
            goto L209
        L169:
            if (r2 == 0) goto L19a
            if (r10 == 0) goto L183
            int r2 = r11.b
            int r3 = r10.b
            if (r2 <= r3) goto L178
            int r3 = r10.c
            int r2 = r2 - r3
            r11.b = r2
        L178:
            int r2 = r11.c
            int r3 = r10.b
            if (r2 <= r3) goto L183
            int r3 = r10.c
            int r2 = r2 - r3
            r11.c = r2
        L183:
            int r2 = r11.b
            int r3 = r13.b
            if (r2 <= r3) goto L18e
            int r3 = r13.c
            int r2 = r2 - r3
            r11.b = r2
        L18e:
            int r2 = r11.c
            int r3 = r13.b
            if (r2 <= r3) goto L1c8
            int r3 = r13.c
            int r2 = r2 - r3
            r11.c = r2
            goto L1c8
        L19a:
            if (r10 == 0) goto L1b2
            int r2 = r11.b
            int r3 = r10.b
            if (r2 < r3) goto L1a7
            int r3 = r10.c
            int r2 = r2 - r3
            r11.b = r2
        L1a7:
            int r2 = r11.c
            int r3 = r10.b
            if (r2 < r3) goto L1b2
            int r3 = r10.c
            int r2 = r2 - r3
            r11.c = r2
        L1b2:
            int r2 = r11.b
            int r3 = r13.b
            if (r2 < r3) goto L1bd
            int r3 = r13.c
            int r2 = r2 - r3
            r11.b = r2
        L1bd:
            int r2 = r11.c
            int r3 = r13.b
            if (r2 < r3) goto L1c8
            int r3 = r13.c
            int r2 = r2 - r3
            r11.c = r2
        L1c8:
            r7.set(r9, r13)
            int r2 = r11.b
            int r3 = r11.c
            if (r2 == r3) goto L1d5
            r7.set(r14, r11)
            goto L1d8
        L1d5:
            r7.remove(r14)
        L1d8:
            if (r10 == 0) goto L209
            r7.add(r9, r10)
            goto L209
        L1de:
            int r2 = r11.c
            int r3 = r13.b
            if (r2 >= r3) goto L1e7
            r17 = -1
            goto L1e9
        L1e7:
            r17 = 0
        L1e9:
            int r10 = r11.b
            if (r10 >= r3) goto L1ef
            int r17 = r17 + 1
        L1ef:
            if (r3 > r10) goto L1f6
            int r3 = r13.c
            int r10 = r10 + r3
            r11.b = r10
        L1f6:
            int r3 = r13.b
            if (r3 > r2) goto L1ff
            int r10 = r13.c
            int r2 = r2 + r10
            r11.c = r2
        L1ff:
            int r3 = r3 + r17
            r13.b = r3
            r7.set(r9, r13)
            r7.set(r14, r11)
        L209:
            r2 = 1
            r3 = 0
            goto L4e
        L20d:
            int r2 = r7.size()
            r3 = 0
        L212:
            if (r3 >= r2) goto L307
            java.lang.Object r8 = r7.get(r3)
            androidx.recyclerview.widget.a$a r8 = (androidx.recyclerview.widget.C0506a.C0023a) r8
            int r9 = r8.f991a
            r10 = 1
            if (r9 == r10) goto L2f7
            a.Cc r10 = r6.f990a
            androidx.recyclerview.widget.w r11 = r6.d
            r15 = 2
            if (r9 == r15) goto L293
            r12 = 4
            if (r9 == r12) goto L236
            if (r9 == r14) goto L232
        L22b:
            r21 = r2
        L22d:
            r12 = 2
            r19 = 1
            goto L2ff
        L232:
            r6.h(r8)
            goto L22b
        L236:
            int r9 = r8.b
            int r12 = r8.c
            int r12 = r12 + r9
            r13 = r9
            r14 = -1
            r15 = 0
        L23e:
            if (r9 >= r12) goto L279
            androidx.recyclerview.widget.RecyclerView$A r21 = r11.b(r9)
            if (r21 != 0) goto L24c
            boolean r21 = r6.a(r9)
            if (r21 == 0) goto L250
        L24c:
            r21 = r2
            r2 = 4
            goto L265
        L250:
            r21 = r2
            r2 = 1
            if (r14 != r2) goto L260
            r2 = 4
            androidx.recyclerview.widget.a$a r13 = r6.g(r2, r13, r15)
            r6.h(r13)
            r13 = r9
            r15 = 0
            goto L261
        L260:
            r2 = 4
        L261:
            r14 = 0
        L262:
            r19 = 1
            goto L272
        L265:
            if (r14 != 0) goto L270
            androidx.recyclerview.widget.a$a r13 = r6.g(r2, r13, r15)
            r6.c(r13)
            r13 = r9
            r15 = 0
        L270:
            r14 = 1
            goto L262
        L272:
            int r15 = r15 + 1
            int r9 = r9 + 1
            r2 = r21
            goto L23e
        L279:
            r21 = r2
            int r2 = r8.c
            if (r15 == r2) goto L288
            r10.c(r8)
            r12 = 4
            androidx.recyclerview.widget.a$a r8 = r6.g(r12, r13, r15)
            goto L289
        L288:
            r12 = 4
        L289:
            if (r14 != 0) goto L28f
            r6.c(r8)
            goto L22d
        L28f:
            r6.h(r8)
            goto L22d
        L293:
            r21 = r2
            r12 = 4
            int r2 = r8.b
            int r9 = r8.c
            int r9 = r9 + r2
            r13 = r2
            r14 = 0
            r15 = -1
        L29e:
            if (r13 >= r9) goto L2dd
            androidx.recyclerview.widget.RecyclerView$A r20 = r11.b(r13)
            if (r20 != 0) goto L2ac
            boolean r20 = r6.a(r13)
            if (r20 == 0) goto L2ae
        L2ac:
            r12 = 2
            goto L2bf
        L2ae:
            r12 = 1
            if (r15 != r12) goto L2bb
            r12 = 2
            androidx.recyclerview.widget.a$a r15 = r6.g(r12, r2, r14)
            r6.h(r15)
            r15 = 1
            goto L2bd
        L2bb:
            r12 = 2
            r15 = 0
        L2bd:
            r12 = 0
            goto L2cd
        L2bf:
            if (r15 != 0) goto L2ca
            androidx.recyclerview.widget.a$a r15 = r6.g(r12, r2, r14)
            r6.c(r15)
            r12 = 1
            goto L2cb
        L2ca:
            r12 = 0
        L2cb:
            r15 = r12
            r12 = 1
        L2cd:
            if (r15 == 0) goto L2d5
            int r13 = r13 - r14
            int r9 = r9 - r14
            r14 = 1
        L2d2:
            r19 = 1
            goto L2d8
        L2d5:
            int r14 = r14 + 1
            goto L2d2
        L2d8:
            int r13 = r13 + 1
            r15 = r12
            r12 = 4
            goto L29e
        L2dd:
            r19 = 1
            int r9 = r8.c
            if (r14 == r9) goto L2ec
            r10.c(r8)
            r12 = 2
            androidx.recyclerview.widget.a$a r8 = r6.g(r12, r2, r14)
            goto L2ed
        L2ec:
            r12 = 2
        L2ed:
            if (r15 != 0) goto L2f3
            r6.c(r8)
            goto L2ff
        L2f3:
            r6.h(r8)
            goto L2ff
        L2f7:
            r21 = r2
            r19 = r10
            r12 = 2
            r6.h(r8)
        L2ff:
            int r3 = r3 + 1
            r2 = r21
            r14 = 8
            goto L212
        L307:
            r7.clear()
            goto L310
        L30b:
            androidx.recyclerview.widget.a r2 = r0.e
            r2.b()
        L310:
            boolean r2 = r0.i0
            r3 = 1
            r6 = 0
            if (r2 != 0) goto L31d
            boolean r2 = r0.j0
            if (r2 == 0) goto L31b
            goto L31d
        L31b:
            r2 = r6
            goto L31e
        L31d:
            r2 = r3
        L31e:
            boolean r7 = r0.u
            if (r7 == 0) goto L33c
            androidx.recyclerview.widget.RecyclerView$i r7 = r0.K
            if (r7 == 0) goto L33c
            boolean r7 = r0.B
            if (r7 != 0) goto L332
            if (r2 != 0) goto L332
            androidx.recyclerview.widget.RecyclerView$l r8 = r0.m
            boolean r8 = r8.f
            if (r8 == 0) goto L33c
        L332:
            if (r7 == 0) goto L33a
            androidx.recyclerview.widget.RecyclerView$d r7 = r0.l
            boolean r7 = r7.b
            if (r7 == 0) goto L33c
        L33a:
            r7 = r3
            goto L33d
        L33c:
            r7 = r6
        L33d:
            androidx.recyclerview.widget.RecyclerView$w r8 = r0.f0
            r8.j = r7
            if (r7 == 0) goto L356
            if (r2 == 0) goto L356
            boolean r2 = r0.B
            if (r2 != 0) goto L356
            androidx.recyclerview.widget.RecyclerView$i r2 = r0.K
            if (r2 == 0) goto L356
            androidx.recyclerview.widget.RecyclerView$l r2 = r0.m
            boolean r2 = r2.B0()
            if (r2 == 0) goto L356
            goto L357
        L356:
            r3 = r6
        L357:
            r8.k = r3
            boolean r2 = r0.b0
            r3 = 0
            if (r2 == 0) goto L36d
            boolean r2 = r0.hasFocus()
            if (r2 == 0) goto L36d
            androidx.recyclerview.widget.RecyclerView$d r2 = r0.l
            if (r2 == 0) goto L36d
            android.view.View r2 = r0.getFocusedChild()
            goto L36e
        L36d:
            r2 = r3
        L36e:
            if (r2 != 0) goto L372
        L370:
            r2 = r3
            goto L37d
        L372:
            android.view.View r2 = r0.D(r2)
            if (r2 != 0) goto L379
            goto L370
        L379:
            androidx.recyclerview.widget.RecyclerView$A r2 = r0.K(r2)
        L37d:
            r6 = -1
            r8 = -1
            if (r2 != 0) goto L389
            r1.m = r6
            r1.l = r8
            r1.n = r8
            goto L3d6
        L389:
            androidx.recyclerview.widget.RecyclerView$d r9 = r0.l
            boolean r9 = r9.b
            if (r9 == 0) goto L391
            long r6 = r2.e
        L391:
            r1.m = r6
            boolean r6 = r0.B
            if (r6 == 0) goto L399
        L397:
            r6 = r8
            goto L3ab
        L399:
            boolean r6 = r2.h()
            if (r6 == 0) goto L3a2
            int r6 = r2.d
            goto L3ab
        L3a2:
            androidx.recyclerview.widget.RecyclerView r6 = r2.r
            if (r6 != 0) goto L3a7
            goto L397
        L3a7:
            int r6 = r6.I(r2)
        L3ab:
            r1.l = r6
            android.view.View r2 = r2.f963a
            int r6 = r2.getId()
        L3b3:
            boolean r7 = r2.isFocused()
            if (r7 != 0) goto L3d4
            boolean r7 = r2 instanceof android.view.ViewGroup
            if (r7 == 0) goto L3d4
            boolean r7 = r2.hasFocus()
            if (r7 == 0) goto L3d4
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            android.view.View r2 = r2.getFocusedChild()
            int r7 = r2.getId()
            if (r7 == r8) goto L3b3
            int r6 = r2.getId()
            goto L3b3
        L3d4:
            r1.n = r6
        L3d6:
            boolean r2 = r1.j
            if (r2 == 0) goto L3e0
            boolean r2 = r0.j0
            if (r2 == 0) goto L3e0
            r2 = 1
            goto L3e1
        L3e0:
            r2 = 0
        L3e1:
            r1.h = r2
            r2 = 0
            r0.j0 = r2
            r0.i0 = r2
            boolean r2 = r1.k
            r1.g = r2
            androidx.recyclerview.widget.RecyclerView$d r2 = r0.l
            int r2 = r2.a()
            r1.e = r2
            int[] r2 = r0.n0
            r0.F(r2)
            boolean r2 = r1.j
            a.ge<androidx.recyclerview.widget.RecyclerView$A, androidx.recyclerview.widget.C$a> r4 = r4.f955a
            if (r2 == 0) goto L475
            androidx.recyclerview.widget.b r2 = r0.f
            int r2 = r2.e()
            r6 = 0
        L406:
            if (r6 >= r2) goto L475
            androidx.recyclerview.widget.b r7 = r0.f
            android.view.View r7 = r7.d(r6)
            androidx.recyclerview.widget.RecyclerView$A r7 = L(r7)
            boolean r9 = r7.o()
            if (r9 != 0) goto L472
            boolean r9 = r7.f()
            if (r9 == 0) goto L425
            androidx.recyclerview.widget.RecyclerView$d r9 = r0.l
            boolean r9 = r9.b
            if (r9 != 0) goto L425
            goto L472
        L425:
            androidx.recyclerview.widget.RecyclerView$i r9 = r0.K
            androidx.recyclerview.widget.RecyclerView.i.b(r7)
            r7.c()
            r9.getClass()
            androidx.recyclerview.widget.RecyclerView$i$b r9 = new androidx.recyclerview.widget.RecyclerView$i$b
            r9.<init>()
            r9.a(r7)
            java.lang.Object r10 = r4.getOrDefault(r7, r3)
            androidx.recyclerview.widget.C$a r10 = (androidx.recyclerview.widget.C.a) r10
            if (r10 != 0) goto L447
            androidx.recyclerview.widget.C$a r10 = androidx.recyclerview.widget.C.a.a()
            r4.put(r7, r10)
        L447:
            r10.b = r9
            int r9 = r10.f956a
            r9 = r9 | 4
            r10.f956a = r9
            boolean r9 = r1.h
            if (r9 == 0) goto L472
            boolean r9 = r7.k()
            if (r9 == 0) goto L472
            boolean r9 = r7.h()
            if (r9 != 0) goto L472
            boolean r9 = r7.o()
            if (r9 != 0) goto L472
            boolean r9 = r7.f()
            if (r9 != 0) goto L472
            long r9 = r0.J(r7)
            r5.d(r9, r7)
        L472:
            int r6 = r6 + 1
            goto L406
        L475:
            boolean r2 = r1.k
            r5 = 2
            if (r2 == 0) goto L535
            androidx.recyclerview.widget.b r2 = r0.f
            int r2 = r2.h()
            r6 = 0
        L481:
            if (r6 >= r2) goto L4be
            androidx.recyclerview.widget.b r7 = r0.f
            android.view.View r7 = r7.g(r6)
            androidx.recyclerview.widget.RecyclerView$A r7 = L(r7)
            boolean r9 = androidx.recyclerview.widget.RecyclerView.y0
            if (r9 == 0) goto L4ad
            int r9 = r7.c
            if (r9 != r8) goto L4ad
            boolean r9 = r7.h()
            if (r9 == 0) goto L49c
            goto L4ad
        L49c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "view holder cannot have position -1 unless it is removed"
            r2.<init>(r3)
            java.lang.String r2 = a.C0487z.d(r0, r2)
            r1.<init>(r2)
            throw r1
        L4ad:
            boolean r9 = r7.o()
            if (r9 != 0) goto L4bb
            int r9 = r7.d
            if (r9 != r8) goto L4bb
            int r9 = r7.c
            r7.d = r9
        L4bb:
            int r6 = r6 + 1
            goto L481
        L4be:
            boolean r2 = r1.f
            r6 = 0
            r1.f = r6
            androidx.recyclerview.widget.RecyclerView$l r6 = r0.m
            androidx.recyclerview.widget.RecyclerView$r r7 = r0.c
            r6.d0(r7, r1)
            r1.f = r2
            r2 = 0
        L4cd:
            androidx.recyclerview.widget.b r6 = r0.f
            int r6 = r6.e()
            if (r2 >= r6) goto L530
            androidx.recyclerview.widget.b r6 = r0.f
            android.view.View r6 = r6.d(r2)
            androidx.recyclerview.widget.RecyclerView$A r6 = L(r6)
            boolean r7 = r6.o()
            if (r7 == 0) goto L4e6
            goto L52d
        L4e6:
            java.lang.Object r7 = r4.getOrDefault(r6, r3)
            androidx.recyclerview.widget.C$a r7 = (androidx.recyclerview.widget.C.a) r7
            if (r7 == 0) goto L4f5
            int r7 = r7.f956a
            r7 = r7 & 4
            if (r7 == 0) goto L4f5
            goto L52d
        L4f5:
            androidx.recyclerview.widget.RecyclerView.i.b(r6)
            int r7 = r6.j
            r7 = r7 & 8192(0x2000, float:1.148E-41)
            if (r7 == 0) goto L500
            r7 = 1
            goto L501
        L500:
            r7 = 0
        L501:
            androidx.recyclerview.widget.RecyclerView$i r8 = r0.K
            r6.c()
            r8.getClass()
            androidx.recyclerview.widget.RecyclerView$i$b r8 = new androidx.recyclerview.widget.RecyclerView$i$b
            r8.<init>()
            r8.a(r6)
            if (r7 == 0) goto L517
            r0.X(r6, r8)
            goto L52d
        L517:
            java.lang.Object r7 = r4.getOrDefault(r6, r3)
            androidx.recyclerview.widget.C$a r7 = (androidx.recyclerview.widget.C.a) r7
            if (r7 != 0) goto L526
            androidx.recyclerview.widget.C$a r7 = androidx.recyclerview.widget.C.a.a()
            r4.put(r6, r7)
        L526:
            int r6 = r7.f956a
            r6 = r6 | r5
            r7.f956a = r6
            r7.b = r8
        L52d:
            int r2 = r2 + 1
            goto L4cd
        L530:
            r0.m()
        L533:
            r2 = 1
            goto L539
        L535:
            r0.m()
            goto L533
        L539:
            r0.T(r2)
            r2 = 0
            r0.i0(r2)
            r1.d = r5
            return
    }

    @Override // android.view.View
    public final void scrollBy(int r4, int r5) {
            r3 = this;
            androidx.recyclerview.widget.RecyclerView$l r0 = r3.m
            if (r0 != 0) goto Lc
            java.lang.String r4 = "RecyclerView"
            java.lang.String r5 = "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument."
            android.util.Log.e(r4, r5)
            return
        Lc:
            boolean r1 = r3.x
            if (r1 == 0) goto L11
            goto L20
        L11:
            boolean r0 = r0.d()
            androidx.recyclerview.widget.RecyclerView$l r1 = r3.m
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
            r3.c0(r4, r5, r0, r2)
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
            boolean r0 = r1.O()
            if (r0 == 0) goto L19
            r0 = 0
            if (r2 == 0) goto Le
            int r2 = r2.getContentChangeTypes()
            goto Lf
        Le:
            r2 = r0
        Lf:
            if (r2 != 0) goto L12
            goto L13
        L12:
            r0 = r2
        L13:
            int r2 = r1.z
            r2 = r2 | r0
            r1.z = r2
            return
        L19:
            super.sendAccessibilityEventUnchecked(r2)
            return
    }

    public void setAccessibilityDelegateCompat(androidx.recyclerview.widget.x r1) {
            r0 = this;
            r0.m0 = r1
            a.C0414ug.j(r0, r1)
            return
    }

    public void setAdapter(androidx.recyclerview.widget.RecyclerView.d r9) {
            r8 = this;
            r0 = 0
            r8.setLayoutFrozen(r0)
            androidx.recyclerview.widget.RecyclerView$d r1 = r8.l
            androidx.recyclerview.widget.RecyclerView$t r2 = r8.b
            if (r1 == 0) goto L14
            androidx.recyclerview.widget.RecyclerView$e r1 = r1.f966a
            r1.unregisterObserver(r2)
            androidx.recyclerview.widget.RecyclerView$d r1 = r8.l
            r1.getClass()
        L14:
            androidx.recyclerview.widget.RecyclerView$i r1 = r8.K
            if (r1 == 0) goto L1b
            r1.e()
        L1b:
            androidx.recyclerview.widget.RecyclerView$l r1 = r8.m
            androidx.recyclerview.widget.RecyclerView$r r3 = r8.c
            if (r1 == 0) goto L29
            r1.i0(r3)
            androidx.recyclerview.widget.RecyclerView$l r1 = r8.m
            r1.j0(r3)
        L29:
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$A> r1 = r3.f978a
            r1.clear()
            r3.f()
            androidx.recyclerview.widget.a r1 = r8.e
            java.util.ArrayList<androidx.recyclerview.widget.a$a> r4 = r1.b
            r1.i(r4)
            java.util.ArrayList<androidx.recyclerview.widget.a$a> r4 = r1.c
            r1.i(r4)
            androidx.recyclerview.widget.RecyclerView$d r1 = r8.l
            r8.l = r9
            if (r9 == 0) goto L48
            androidx.recyclerview.widget.RecyclerView$e r9 = r9.f966a
            r9.registerObserver(r2)
        L48:
            androidx.recyclerview.widget.RecyclerView$l r9 = r8.m
            if (r9 == 0) goto L4f
            r9.Q()
        L4f:
            androidx.recyclerview.widget.RecyclerView$d r9 = r8.l
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$A> r2 = r3.f978a
            r2.clear()
            r3.f()
            r2 = 1
            r3.e(r1, r2)
            androidx.recyclerview.widget.RecyclerView$q r4 = r3.c()
            if (r1 == 0) goto L68
            int r1 = r4.b
            int r1 = r1 - r2
            r4.b = r1
        L68:
            int r1 = r4.b
            if (r1 != 0) goto L9b
            r1 = r0
        L6d:
            android.util.SparseArray<androidx.recyclerview.widget.RecyclerView$q$a> r5 = r4.f976a
            int r6 = r5.size()
            if (r1 >= r6) goto L9b
            java.lang.Object r5 = r5.valueAt(r1)
            androidx.recyclerview.widget.RecyclerView$q$a r5 = (androidx.recyclerview.widget.RecyclerView.q.a) r5
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$A> r6 = r5.f977a
            java.util.Iterator r6 = r6.iterator()
        L81:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L93
            java.lang.Object r7 = r6.next()
            androidx.recyclerview.widget.RecyclerView$A r7 = (androidx.recyclerview.widget.RecyclerView.A) r7
            android.view.View r7 = r7.f963a
            a.C0500zc.a(r7)
            goto L81
        L93:
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$A> r5 = r5.f977a
            r5.clear()
            int r1 = r1 + 1
            goto L6d
        L9b:
            if (r9 == 0) goto La2
            int r9 = r4.b
            int r9 = r9 + r2
            r4.b = r9
        La2:
            r3.d()
            androidx.recyclerview.widget.RecyclerView$w r9 = r8.f0
            r9.f = r2
            r8.W(r0)
            r8.requestLayout()
            return
    }

    public void setChildDrawingOrderCallback(androidx.recyclerview.widget.RecyclerView.g r1) {
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
            boolean r0 = r1.h
            if (r2 == r0) goto Ld
            r0 = 0
            r1.J = r0
            r1.H = r0
            r1.I = r0
            r1.G = r0
        Ld:
            r1.h = r2
            super.setClipToPadding(r2)
            boolean r2 = r1.u
            if (r2 == 0) goto L19
            r1.requestLayout()
        L19:
            return
    }

    public void setEdgeEffectFactory(androidx.recyclerview.widget.RecyclerView.h r1) {
            r0 = this;
            r1.getClass()
            r0.F = r1
            r1 = 0
            r0.J = r1
            r0.H = r1
            r0.I = r1
            r0.G = r1
            return
    }

    public void setHasFixedSize(boolean r1) {
            r0 = this;
            r0.t = r1
            return
    }

    public void setItemAnimator(androidx.recyclerview.widget.RecyclerView.i r3) {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView$i r0 = r2.K
            if (r0 == 0) goto Lc
            r0.e()
            androidx.recyclerview.widget.RecyclerView$i r0 = r2.K
            r1 = 0
            r0.f968a = r1
        Lc:
            r2.K = r3
            if (r3 == 0) goto L14
            androidx.recyclerview.widget.RecyclerView$j r0 = r2.k0
            r3.f968a = r0
        L14:
            return
    }

    public void setItemViewCacheSize(int r2) {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView$r r0 = r1.c
            r0.e = r2
            r0.m()
            return
    }

    @java.lang.Deprecated
    public void setLayoutFrozen(boolean r1) {
            r0 = this;
            r0.suppressLayout(r1)
            return
    }

    public void setLayoutManager(androidx.recyclerview.widget.RecyclerView.l r11) {
            r10 = this;
            r0 = 1
            androidx.recyclerview.widget.RecyclerView$l r1 = r10.m
            if (r11 != r1) goto L6
            return
        L6:
            r1 = 0
            r10.setScrollState(r1)
            androidx.recyclerview.widget.RecyclerView$z r2 = r10.c0
            androidx.recyclerview.widget.RecyclerView r3 = r2.g
            r3.removeCallbacks(r2)
            android.widget.OverScroller r2 = r2.c
            r2.abortAnimation()
            androidx.recyclerview.widget.RecyclerView$l r2 = r10.m
            if (r2 == 0) goto L21
            androidx.recyclerview.widget.o r2 = r2.e
            if (r2 == 0) goto L21
            r2.d()
        L21:
            androidx.recyclerview.widget.RecyclerView$l r2 = r10.m
            androidx.recyclerview.widget.RecyclerView$r r3 = r10.c
            if (r2 == 0) goto L54
            androidx.recyclerview.widget.RecyclerView$i r2 = r10.K
            if (r2 == 0) goto L2e
            r2.e()
        L2e:
            androidx.recyclerview.widget.RecyclerView$l r2 = r10.m
            r2.i0(r3)
            androidx.recyclerview.widget.RecyclerView$l r2 = r10.m
            r2.j0(r3)
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$A> r2 = r3.f978a
            r2.clear()
            r3.f()
            boolean r2 = r10.s
            if (r2 == 0) goto L4b
            androidx.recyclerview.widget.RecyclerView$l r2 = r10.m
            r2.g = r1
            r2.S(r10)
        L4b:
            androidx.recyclerview.widget.RecyclerView$l r2 = r10.m
            r4 = 0
            r2.v0(r4)
            r10.m = r4
            goto L5c
        L54:
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$A> r2 = r3.f978a
            r2.clear()
            r3.f()
        L5c:
            androidx.recyclerview.widget.b r2 = r10.f
            androidx.recyclerview.widget.b$a r4 = r2.b
            r4.g()
            java.util.ArrayList r4 = r2.c
            int r5 = r4.size()
            int r5 = r5 - r0
        L6a:
            androidx.recyclerview.widget.v r6 = r2.f992a
            androidx.recyclerview.widget.RecyclerView r6 = r6.f1015a
            if (r5 < 0) goto L9b
            java.lang.Object r7 = r4.get(r5)
            android.view.View r7 = (android.view.View) r7
            androidx.recyclerview.widget.RecyclerView$A r7 = L(r7)
            if (r7 == 0) goto L95
            int r8 = r7.p
            boolean r9 = r6.O()
            if (r9 == 0) goto L8c
            r7.q = r8
            java.util.ArrayList r6 = r6.s0
            r6.add(r7)
            goto L93
        L8c:
            java.util.WeakHashMap<android.view.View, a.Jg> r6 = a.C0414ug.f721a
            android.view.View r6 = r7.f963a
            r6.setImportantForAccessibility(r8)
        L93:
            r7.p = r1
        L95:
            r4.remove(r5)
            int r5 = r5 + (-1)
            goto L6a
        L9b:
            int r2 = r6.getChildCount()
        L9f:
            if (r1 >= r2) goto Lad
            android.view.View r4 = r6.getChildAt(r1)
            L(r4)
            r4.clearAnimation()
            int r1 = r1 + r0
            goto L9f
        Lad:
            r6.removeAllViews()
            r10.m = r11
            if (r11 == 0) goto Le2
            androidx.recyclerview.widget.RecyclerView r1 = r11.b
            if (r1 != 0) goto Lc7
            r11.v0(r10)
            boolean r11 = r10.s
            if (r11 == 0) goto Le2
            androidx.recyclerview.widget.RecyclerView$l r11 = r10.m
            r11.g = r0
            r11.R(r10)
            goto Le2
        Lc7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "LayoutManager "
            r1.<init>(r2)
            r1.append(r11)
            java.lang.String r2 = " is already attached to a RecyclerView:"
            r1.append(r2)
            androidx.recyclerview.widget.RecyclerView r11 = r11.b
            java.lang.String r11 = a.C0487z.d(r11, r1)
            r0.<init>(r11)
            throw r0
        Le2:
            r3.m()
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
    public void setNestedScrollingEnabled(boolean r3) {
            r2 = this;
            a.Jb r0 = r2.getScrollingChildHelper()
            boolean r1 = r0.d
            if (r1 == 0) goto Lf
            java.util.WeakHashMap<android.view.View, a.Jg> r1 = a.C0414ug.f721a
            android.view.ViewGroup r1 = r0.c
            a.C0414ug.d.z(r1)
        Lf:
            r0.d = r3
            return
    }

    public void setOnFlingListener(androidx.recyclerview.widget.RecyclerView.n r1) {
            r0 = this;
            r0.T = r1
            return
    }

    @java.lang.Deprecated
    public void setOnScrollListener(androidx.recyclerview.widget.RecyclerView.p r1) {
            r0 = this;
            r0.g0 = r1
            return
    }

    public void setPreserveFocusAfterLayout(boolean r1) {
            r0 = this;
            r0.b0 = r1
            return
    }

    public void setRecycledViewPool(androidx.recyclerview.widget.RecyclerView.q r5) {
            r4 = this;
            androidx.recyclerview.widget.RecyclerView$r r0 = r4.c
            androidx.recyclerview.widget.RecyclerView r1 = r0.h
            androidx.recyclerview.widget.RecyclerView$d r2 = r1.l
            r3 = 0
            r0.e(r2, r3)
            androidx.recyclerview.widget.RecyclerView$q r2 = r0.g
            if (r2 == 0) goto L14
            int r3 = r2.b
            int r3 = r3 + (-1)
            r2.b = r3
        L14:
            r0.g = r5
            if (r5 == 0) goto L26
            androidx.recyclerview.widget.RecyclerView$d r5 = r1.getAdapter()
            if (r5 == 0) goto L26
            androidx.recyclerview.widget.RecyclerView$q r5 = r0.g
            int r1 = r5.b
            int r1 = r1 + 1
            r5.b = r1
        L26:
            r0.d()
            return
    }

    @java.lang.Deprecated
    public void setRecyclerListener(androidx.recyclerview.widget.RecyclerView.s r1) {
            r0 = this;
            r0.n = r1
            return
    }

    public void setScrollState(int r4) {
            r3 = this;
            int r0 = r3.L
            if (r4 != r0) goto L5
            goto L6f
        L5:
            boolean r0 = androidx.recyclerview.widget.RecyclerView.z0
            if (r0 == 0) goto L2b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "setting scroll state to "
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r1 = " from "
            r0.append(r1)
            int r1 = r3.L
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.Exception r1 = new java.lang.Exception
            r1.<init>()
            java.lang.String r2 = "RecyclerView"
            android.util.Log.d(r2, r0, r1)
        L2b:
            r3.L = r4
            r0 = 2
            if (r4 == r0) goto L47
            androidx.recyclerview.widget.RecyclerView$z r0 = r3.c0
            androidx.recyclerview.widget.RecyclerView r1 = r0.g
            r1.removeCallbacks(r0)
            android.widget.OverScroller r0 = r0.c
            r0.abortAnimation()
            androidx.recyclerview.widget.RecyclerView$l r0 = r3.m
            if (r0 == 0) goto L47
            androidx.recyclerview.widget.o r0 = r0.e
            if (r0 == 0) goto L47
            r0.d()
        L47:
            androidx.recyclerview.widget.RecyclerView$l r0 = r3.m
            if (r0 == 0) goto L4e
            r0.h0(r4)
        L4e:
            androidx.recyclerview.widget.RecyclerView$p r0 = r3.g0
            if (r0 == 0) goto L55
            r0.a(r3, r4)
        L55:
            java.util.ArrayList r0 = r3.h0
            if (r0 == 0) goto L6f
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L5f:
            if (r0 < 0) goto L6f
            java.util.ArrayList r1 = r3.h0
            java.lang.Object r1 = r1.get(r0)
            androidx.recyclerview.widget.RecyclerView$p r1 = (androidx.recyclerview.widget.RecyclerView.p) r1
            r1.a(r3, r4)
            int r0 = r0 + (-1)
            goto L5f
        L6f:
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
            r3.S = r4
            return
        L2d:
            int r4 = r0.getScaledTouchSlop()
            r3.S = r4
            return
    }

    public void setViewCacheExtension(androidx.recyclerview.widget.RecyclerView.y r1) {
            r0 = this;
            androidx.recyclerview.widget.RecyclerView$r r1 = r0.c
            r1.getClass()
            return
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int r3) {
            r2 = this;
            a.Jb r0 = r2.getScrollingChildHelper()
            r1 = 0
            boolean r3 = r0.g(r3, r1)
            return r3
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
            r2 = this;
            a.Jb r0 = r2.getScrollingChildHelper()
            r1 = 0
            r0.h(r1)
            return
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean r10) {
            r9 = this;
            boolean r0 = r9.x
            if (r10 == r0) goto L4f
            java.lang.String r0 = "Do not suppressLayout in layout or scroll"
            r9.k(r0)
            r0 = 0
            if (r10 != 0) goto L20
            r9.x = r0
            boolean r10 = r9.w
            if (r10 == 0) goto L1d
            androidx.recyclerview.widget.RecyclerView$l r10 = r9.m
            if (r10 == 0) goto L1d
            androidx.recyclerview.widget.RecyclerView$d r10 = r9.l
            if (r10 == 0) goto L1d
            r9.requestLayout()
        L1d:
            r9.w = r0
            return
        L20:
            long r1 = android.os.SystemClock.uptimeMillis()
            r5 = 3
            r6 = 0
            r7 = 0
            r8 = 0
            r3 = r1
            android.view.MotionEvent r10 = android.view.MotionEvent.obtain(r1, r3, r5, r6, r7, r8)
            r9.onTouchEvent(r10)
            r10 = 1
            r9.x = r10
            r9.y = r10
            r9.setScrollState(r0)
            androidx.recyclerview.widget.RecyclerView$z r10 = r9.c0
            androidx.recyclerview.widget.RecyclerView r0 = r10.g
            r0.removeCallbacks(r10)
            android.widget.OverScroller r10 = r10.c
            r10.abortAnimation()
            androidx.recyclerview.widget.RecyclerView$l r10 = r9.m
            if (r10 == 0) goto L4f
            androidx.recyclerview.widget.o r10 = r10.e
            if (r10 == 0) goto L4f
            r10.d()
        L4f:
            return
    }

    public final void t() {
            r5 = this;
            r5.h0()
            r5.S()
            androidx.recyclerview.widget.RecyclerView$w r0 = r5.f0
            r1 = 6
            r0.a(r1)
            androidx.recyclerview.widget.a r1 = r5.e
            r1.b()
            androidx.recyclerview.widget.RecyclerView$d r1 = r5.l
            int r1 = r1.a()
            r0.e = r1
            r1 = 0
            r0.c = r1
            androidx.recyclerview.widget.RecyclerView$u r2 = r5.d
            r3 = 1
            if (r2 == 0) goto L43
            androidx.recyclerview.widget.RecyclerView$d r2 = r5.l
            androidx.recyclerview.widget.RecyclerView$d$a r4 = r2.c
            int r4 = r4.ordinal()
            if (r4 == r3) goto L2f
            r2 = 2
            if (r4 == r2) goto L43
            goto L35
        L2f:
            int r2 = r2.a()
            if (r2 <= 0) goto L43
        L35:
            androidx.recyclerview.widget.RecyclerView$u r2 = r5.d
            android.os.Parcelable r2 = r2.c
            if (r2 == 0) goto L40
            androidx.recyclerview.widget.RecyclerView$l r4 = r5.m
            r4.f0(r2)
        L40:
            r2 = 0
            r5.d = r2
        L43:
            r0.g = r1
            androidx.recyclerview.widget.RecyclerView$l r2 = r5.m
            androidx.recyclerview.widget.RecyclerView$r r4 = r5.c
            r2.d0(r4, r0)
            r0.f = r1
            boolean r2 = r0.j
            if (r2 == 0) goto L58
            androidx.recyclerview.widget.RecyclerView$i r2 = r5.K
            if (r2 == 0) goto L58
            r2 = r3
            goto L59
        L58:
            r2 = r1
        L59:
            r0.j = r2
            r2 = 4
            r0.d = r2
            r5.T(r3)
            r5.i0(r1)
            return
    }

    public final boolean u(int r7, int r8, int[] r9, int[] r10, int r11) {
            r6 = this;
            a.Jb r0 = r6.getScrollingChildHelper()
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            boolean r7 = r0.c(r1, r2, r3, r4, r5)
            return r7
    }

    public final void v(int r9, int r10, int r11, int r12, int[] r13, int r14, int[] r15) {
            r8 = this;
            a.Jb r0 = r8.getScrollingChildHelper()
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

    public final void w(int r5, int r6) {
            r4 = this;
            int r0 = r4.E
            int r0 = r0 + 1
            r4.E = r0
            int r0 = r4.getScrollX()
            int r1 = r4.getScrollY()
            int r2 = r0 - r5
            int r3 = r1 - r6
            r4.onScrollChanged(r0, r1, r2, r3)
            androidx.recyclerview.widget.RecyclerView$p r0 = r4.g0
            if (r0 == 0) goto L1c
            r0.b(r4, r5, r6)
        L1c:
            java.util.ArrayList r0 = r4.h0
            if (r0 == 0) goto L36
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L26:
            if (r0 < 0) goto L36
            java.util.ArrayList r1 = r4.h0
            java.lang.Object r1 = r1.get(r0)
            androidx.recyclerview.widget.RecyclerView$p r1 = (androidx.recyclerview.widget.RecyclerView.p) r1
            r1.b(r4, r5, r6)
            int r0 = r0 + (-1)
            goto L26
        L36:
            int r5 = r4.E
            int r5 = r5 + (-1)
            r4.E = r5
            return
    }

    public final void x() {
            r4 = this;
            android.widget.EdgeEffect r0 = r4.J
            if (r0 == 0) goto L5
            return
        L5:
            androidx.recyclerview.widget.RecyclerView$h r0 = r4.F
            androidx.recyclerview.widget.RecyclerView$x r0 = (androidx.recyclerview.widget.RecyclerView.x) r0
            r0.getClass()
            android.widget.EdgeEffect r0 = new android.widget.EdgeEffect
            android.content.Context r1 = r4.getContext()
            r0.<init>(r1)
            r4.J = r0
            boolean r1 = r4.h
            if (r1 == 0) goto L3b
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
        L3b:
            int r1 = r4.getMeasuredWidth()
            int r2 = r4.getMeasuredHeight()
            r0.setSize(r1, r2)
            return
    }

    public final void y() {
            r4 = this;
            android.widget.EdgeEffect r0 = r4.G
            if (r0 == 0) goto L5
            return
        L5:
            androidx.recyclerview.widget.RecyclerView$h r0 = r4.F
            androidx.recyclerview.widget.RecyclerView$x r0 = (androidx.recyclerview.widget.RecyclerView.x) r0
            r0.getClass()
            android.widget.EdgeEffect r0 = new android.widget.EdgeEffect
            android.content.Context r1 = r4.getContext()
            r0.<init>(r1)
            r4.G = r0
            boolean r1 = r4.h
            if (r1 == 0) goto L3b
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
        L3b:
            int r1 = r4.getMeasuredHeight()
            int r2 = r4.getMeasuredWidth()
            r0.setSize(r1, r2)
            return
    }

    public final void z() {
            r4 = this;
            android.widget.EdgeEffect r0 = r4.I
            if (r0 == 0) goto L5
            return
        L5:
            androidx.recyclerview.widget.RecyclerView$h r0 = r4.F
            androidx.recyclerview.widget.RecyclerView$x r0 = (androidx.recyclerview.widget.RecyclerView.x) r0
            r0.getClass()
            android.widget.EdgeEffect r0 = new android.widget.EdgeEffect
            android.content.Context r1 = r4.getContext()
            r0.<init>(r1)
            r4.I = r0
            boolean r1 = r4.h
            if (r1 == 0) goto L3b
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
        L3b:
            int r1 = r4.getMeasuredHeight()
            int r2 = r4.getMeasuredWidth()
            r0.setSize(r1, r2)
            return
    }
}
