package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes.dex */
public class StaggeredGridLayoutManager extends androidx.recyclerview.widget.RecyclerView.l implements androidx.recyclerview.widget.RecyclerView.v.b {
    public int A;
    public final androidx.recyclerview.widget.StaggeredGridLayoutManager.d B;
    public final int C;
    public boolean D;
    public boolean E;
    public androidx.recyclerview.widget.StaggeredGridLayoutManager.e F;
    public final android.graphics.Rect G;
    public final androidx.recyclerview.widget.StaggeredGridLayoutManager.b H;
    public final boolean I;
    public int[] J;
    public final androidx.recyclerview.widget.StaggeredGridLayoutManager.a K;
    public final int p;
    public final androidx.recyclerview.widget.StaggeredGridLayoutManager.f[] q;
    public final androidx.recyclerview.widget.s r;
    public final androidx.recyclerview.widget.s s;
    public final int t;
    public int u;
    public final androidx.recyclerview.widget.n v;
    public boolean w;
    public boolean x;
    public final java.util.BitSet y;
    public int z;

    public class a implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.recyclerview.widget.StaggeredGridLayoutManager f984a;

        public a(androidx.recyclerview.widget.StaggeredGridLayoutManager r1) {
                r0 = this;
                r0.<init>()
                r0.f984a = r1
                return
        }

        @Override // java.lang.Runnable
        public final void run() {
                r1 = this;
                androidx.recyclerview.widget.StaggeredGridLayoutManager r0 = r1.f984a
                r0.C0()
                return
        }
    }

    public class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f985a;
        public int b;
        public boolean c;
        public boolean d;
        public boolean e;
        public int[] f;
        public final /* synthetic */ androidx.recyclerview.widget.StaggeredGridLayoutManager g;

        public b(androidx.recyclerview.widget.StaggeredGridLayoutManager r1) {
                r0 = this;
                r0.<init>()
                r0.g = r1
                r0.a()
                return
        }

        public final void a() {
                r2 = this;
                r0 = -1
                r2.f985a = r0
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r2.b = r1
                r1 = 0
                r2.c = r1
                r2.d = r1
                r2.e = r1
                int[] r1 = r2.f
                if (r1 == 0) goto L15
                java.util.Arrays.fill(r1, r0)
            L15:
                return
        }
    }

    public static class c extends androidx.recyclerview.widget.RecyclerView.m {
        public androidx.recyclerview.widget.StaggeredGridLayoutManager.f e;
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int[] f986a;
        public java.util.ArrayList b;

        @android.annotation.SuppressLint({"BanParcelableUsage"})
        public static class a implements android.os.Parcelable {
            public static final android.os.Parcelable.Creator<androidx.recyclerview.widget.StaggeredGridLayoutManager.d.a> CREATOR = null;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f987a;
            public int b;
            public int[] c;
            public boolean d;

            /* JADX INFO: renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a$a, reason: collision with other inner class name */
            public class C0022a implements android.os.Parcelable.Creator<androidx.recyclerview.widget.StaggeredGridLayoutManager.d.a> {
                @Override // android.os.Parcelable.Creator
                public final androidx.recyclerview.widget.StaggeredGridLayoutManager.d.a createFromParcel(android.os.Parcel r4) {
                        r3 = this;
                        androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a r0 = new androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a
                        r0.<init>()
                        int r1 = r4.readInt()
                        r0.f987a = r1
                        int r1 = r4.readInt()
                        r0.b = r1
                        int r1 = r4.readInt()
                        r2 = 1
                        if (r1 != r2) goto L19
                        goto L1a
                    L19:
                        r2 = 0
                    L1a:
                        r0.d = r2
                        int r1 = r4.readInt()
                        if (r1 <= 0) goto L29
                        int[] r1 = new int[r1]
                        r0.c = r1
                        r4.readIntArray(r1)
                    L29:
                        return r0
                }

                @Override // android.os.Parcelable.Creator
                public final androidx.recyclerview.widget.StaggeredGridLayoutManager.d.a[] newArray(int r1) {
                        r0 = this;
                        androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a[] r1 = new androidx.recyclerview.widget.StaggeredGridLayoutManager.d.a[r1]
                        return r1
                }
            }

            static {
                    androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a$a r0 = new androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a$a
                    r0.<init>()
                    androidx.recyclerview.widget.StaggeredGridLayoutManager.d.a.CREATOR = r0
                    return
            }

            public a() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                    r1 = this;
                    r0 = 0
                    return r0
            }

            public final java.lang.String toString() {
                    r2 = this;
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    java.lang.String r1 = "FullSpanItem{mPosition="
                    r0.<init>(r1)
                    int r1 = r2.f987a
                    r0.append(r1)
                    java.lang.String r1 = ", mGapDir="
                    r0.append(r1)
                    int r1 = r2.b
                    r0.append(r1)
                    java.lang.String r1 = ", mHasUnwantedGapAfter="
                    r0.append(r1)
                    boolean r1 = r2.d
                    r0.append(r1)
                    java.lang.String r1 = ", mGapPerSpan="
                    r0.append(r1)
                    int[] r1 = r2.c
                    java.lang.String r1 = java.util.Arrays.toString(r1)
                    r0.append(r1)
                    r1 = 125(0x7d, float:1.75E-43)
                    r0.append(r1)
                    java.lang.String r0 = r0.toString()
                    return r0
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel r2, int r3) {
                    r1 = this;
                    int r3 = r1.f987a
                    r2.writeInt(r3)
                    int r3 = r1.b
                    r2.writeInt(r3)
                    boolean r3 = r1.d
                    r2.writeInt(r3)
                    int[] r3 = r1.c
                    if (r3 == 0) goto L20
                    int r0 = r3.length
                    if (r0 <= 0) goto L20
                    int r3 = r3.length
                    r2.writeInt(r3)
                    int[] r3 = r1.c
                    r2.writeIntArray(r3)
                    return
                L20:
                    r3 = 0
                    r2.writeInt(r3)
                    return
            }
        }

        public final void a() {
                r2 = this;
                int[] r0 = r2.f986a
                if (r0 == 0) goto L8
                r1 = -1
                java.util.Arrays.fill(r0, r1)
            L8:
                r0 = 0
                r2.b = r0
                return
        }

        public final void b(int r5) {
                r4 = this;
                int[] r0 = r4.f986a
                r1 = -1
                if (r0 != 0) goto L15
                r0 = 10
                int r5 = java.lang.Math.max(r5, r0)
                int r5 = r5 + 1
                int[] r5 = new int[r5]
                r4.f986a = r5
                java.util.Arrays.fill(r5, r1)
                return
            L15:
                int r2 = r0.length
                if (r5 < r2) goto L2e
                int r2 = r0.length
            L19:
                if (r2 > r5) goto L1e
                int r2 = r2 * 2
                goto L19
            L1e:
                int[] r5 = new int[r2]
                r4.f986a = r5
                int r2 = r0.length
                r3 = 0
                java.lang.System.arraycopy(r0, r3, r5, r3, r2)
                int[] r5 = r4.f986a
                int r0 = r0.length
                int r2 = r5.length
                java.util.Arrays.fill(r5, r0, r2, r1)
            L2e:
                return
        }

        public final void c(int r4, int r5) {
                r3 = this;
                int[] r0 = r3.f986a
                if (r0 == 0) goto L3b
                int r0 = r0.length
                if (r4 < r0) goto L8
                goto L3b
            L8:
                int r0 = r4 + r5
                r3.b(r0)
                int[] r1 = r3.f986a
                int r2 = r1.length
                int r2 = r2 - r4
                int r2 = r2 - r5
                java.lang.System.arraycopy(r1, r4, r1, r0, r2)
                int[] r1 = r3.f986a
                r2 = -1
                java.util.Arrays.fill(r1, r4, r0, r2)
                java.util.ArrayList r0 = r3.b
                if (r0 != 0) goto L20
                goto L3b
            L20:
                int r0 = r0.size()
                int r0 = r0 + (-1)
            L26:
                if (r0 < 0) goto L3b
                java.util.ArrayList r1 = r3.b
                java.lang.Object r1 = r1.get(r0)
                androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a r1 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.d.a) r1
                int r2 = r1.f987a
                if (r2 >= r4) goto L35
                goto L38
            L35:
                int r2 = r2 + r5
                r1.f987a = r2
            L38:
                int r0 = r0 + (-1)
                goto L26
            L3b:
                return
        }

        public final void d(int r6, int r7) {
                r5 = this;
                int[] r0 = r5.f986a
                if (r0 == 0) goto L46
                int r0 = r0.length
                if (r6 < r0) goto L8
                goto L46
            L8:
                int r0 = r6 + r7
                r5.b(r0)
                int[] r1 = r5.f986a
                int r2 = r1.length
                int r2 = r2 - r6
                int r2 = r2 - r7
                java.lang.System.arraycopy(r1, r0, r1, r6, r2)
                int[] r1 = r5.f986a
                int r2 = r1.length
                int r2 = r2 - r7
                int r3 = r1.length
                r4 = -1
                java.util.Arrays.fill(r1, r2, r3, r4)
                java.util.ArrayList r1 = r5.b
                if (r1 != 0) goto L23
                goto L46
            L23:
                int r1 = r1.size()
                int r1 = r1 + (-1)
            L29:
                if (r1 < 0) goto L46
                java.util.ArrayList r2 = r5.b
                java.lang.Object r2 = r2.get(r1)
                androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a r2 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.d.a) r2
                int r3 = r2.f987a
                if (r3 >= r6) goto L38
                goto L43
            L38:
                if (r3 >= r0) goto L40
                java.util.ArrayList r2 = r5.b
                r2.remove(r1)
                goto L43
            L40:
                int r3 = r3 - r7
                r2.f987a = r3
            L43:
                int r1 = r1 + (-1)
                goto L29
            L46:
                return
        }
    }

    @android.annotation.SuppressLint({"BanParcelableUsage"})
    public static class e implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<androidx.recyclerview.widget.StaggeredGridLayoutManager.e> CREATOR = null;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f988a;
        public int b;
        public int c;
        public int[] d;
        public int e;
        public int[] f;
        public java.util.ArrayList g;
        public boolean h;
        public boolean i;
        public boolean j;

        public class a implements android.os.Parcelable.Creator<androidx.recyclerview.widget.StaggeredGridLayoutManager.e> {
            @Override // android.os.Parcelable.Creator
            public final androidx.recyclerview.widget.StaggeredGridLayoutManager.e createFromParcel(android.os.Parcel r5) {
                    r4 = this;
                    androidx.recyclerview.widget.StaggeredGridLayoutManager$e r0 = new androidx.recyclerview.widget.StaggeredGridLayoutManager$e
                    r0.<init>()
                    int r1 = r5.readInt()
                    r0.f988a = r1
                    int r1 = r5.readInt()
                    r0.b = r1
                    int r1 = r5.readInt()
                    r0.c = r1
                    if (r1 <= 0) goto L20
                    int[] r1 = new int[r1]
                    r0.d = r1
                    r5.readIntArray(r1)
                L20:
                    int r1 = r5.readInt()
                    r0.e = r1
                    if (r1 <= 0) goto L2f
                    int[] r1 = new int[r1]
                    r0.f = r1
                    r5.readIntArray(r1)
                L2f:
                    int r1 = r5.readInt()
                    r2 = 0
                    r3 = 1
                    if (r1 != r3) goto L39
                    r1 = r3
                    goto L3a
                L39:
                    r1 = r2
                L3a:
                    r0.h = r1
                    int r1 = r5.readInt()
                    if (r1 != r3) goto L44
                    r1 = r3
                    goto L45
                L44:
                    r1 = r2
                L45:
                    r0.i = r1
                    int r1 = r5.readInt()
                    if (r1 != r3) goto L4e
                    r2 = r3
                L4e:
                    r0.j = r2
                    java.lang.Class<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r1 = androidx.recyclerview.widget.StaggeredGridLayoutManager.d.a.class
                    java.lang.ClassLoader r1 = r1.getClassLoader()
                    java.util.ArrayList r5 = r5.readArrayList(r1)
                    r0.g = r5
                    return r0
            }

            @Override // android.os.Parcelable.Creator
            public final androidx.recyclerview.widget.StaggeredGridLayoutManager.e[] newArray(int r1) {
                    r0 = this;
                    androidx.recyclerview.widget.StaggeredGridLayoutManager$e[] r1 = new androidx.recyclerview.widget.StaggeredGridLayoutManager.e[r1]
                    return r1
            }
        }

        static {
                androidx.recyclerview.widget.StaggeredGridLayoutManager$e$a r0 = new androidx.recyclerview.widget.StaggeredGridLayoutManager$e$a
                r0.<init>()
                androidx.recyclerview.widget.StaggeredGridLayoutManager.e.CREATOR = r0
                return
        }

        public e() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel r1, int r2) {
                r0 = this;
                int r2 = r0.f988a
                r1.writeInt(r2)
                int r2 = r0.b
                r1.writeInt(r2)
                int r2 = r0.c
                r1.writeInt(r2)
                int r2 = r0.c
                if (r2 <= 0) goto L18
                int[] r2 = r0.d
                r1.writeIntArray(r2)
            L18:
                int r2 = r0.e
                r1.writeInt(r2)
                int r2 = r0.e
                if (r2 <= 0) goto L26
                int[] r2 = r0.f
                r1.writeIntArray(r2)
            L26:
                boolean r2 = r0.h
                r1.writeInt(r2)
                boolean r2 = r0.i
                r1.writeInt(r2)
                boolean r2 = r0.j
                r1.writeInt(r2)
                java.util.ArrayList r2 = r0.g
                r1.writeList(r2)
                return
        }
    }

    public class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final java.util.ArrayList<android.view.View> f989a;
        public int b;
        public int c;
        public int d;
        public final int e;
        public final /* synthetic */ androidx.recyclerview.widget.StaggeredGridLayoutManager f;

        public f(androidx.recyclerview.widget.StaggeredGridLayoutManager r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.f = r1
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r0.f989a = r1
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0.b = r1
                r0.c = r1
                r1 = 0
                r0.d = r1
                r0.e = r2
                return
        }

        public final void a() {
                r3 = this;
                java.util.ArrayList<android.view.View> r0 = r3.f989a
                int r1 = r0.size()
                int r1 = r1 + (-1)
                java.lang.Object r0 = r0.get(r1)
                android.view.View r0 = (android.view.View) r0
                android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
                androidx.recyclerview.widget.StaggeredGridLayoutManager$c r1 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r1
                androidx.recyclerview.widget.StaggeredGridLayoutManager r2 = r3.f
                androidx.recyclerview.widget.s r2 = r2.r
                int r0 = r2.b(r0)
                r3.c = r0
                r1.getClass()
                return
        }

        public final void b() {
                r1 = this;
                java.util.ArrayList<android.view.View> r0 = r1.f989a
                r0.clear()
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r1.b = r0
                r1.c = r0
                r0 = 0
                r1.d = r0
                return
        }

        public final int c() {
                r2 = this;
                androidx.recyclerview.widget.StaggeredGridLayoutManager r0 = r2.f
                boolean r0 = r0.w
                java.util.ArrayList<android.view.View> r1 = r2.f989a
                if (r0 == 0) goto L14
                int r0 = r1.size()
                int r0 = r0 + (-1)
                r1 = -1
                int r0 = r2.e(r0, r1)
                return r0
            L14:
                int r0 = r1.size()
                r1 = 0
                int r0 = r2.e(r1, r0)
                return r0
        }

        public final int d() {
                r2 = this;
                androidx.recyclerview.widget.StaggeredGridLayoutManager r0 = r2.f
                boolean r0 = r0.w
                java.util.ArrayList<android.view.View> r1 = r2.f989a
                if (r0 == 0) goto L12
                int r0 = r1.size()
                r1 = 0
                int r0 = r2.e(r1, r0)
                return r0
            L12:
                int r0 = r1.size()
                int r0 = r0 + (-1)
                r1 = -1
                int r0 = r2.e(r0, r1)
                return r0
        }

        public final int e(int r12, int r13) {
                r11 = this;
                androidx.recyclerview.widget.StaggeredGridLayoutManager r0 = r11.f
                androidx.recyclerview.widget.s r1 = r0.r
                int r1 = r1.k()
                androidx.recyclerview.widget.s r2 = r0.r
                int r2 = r2.g()
                r3 = -1
                r4 = 1
                if (r13 <= r12) goto L14
                r5 = r4
                goto L15
            L14:
                r5 = r3
            L15:
                if (r12 == r13) goto L43
                java.util.ArrayList<android.view.View> r6 = r11.f989a
                java.lang.Object r6 = r6.get(r12)
                android.view.View r6 = (android.view.View) r6
                androidx.recyclerview.widget.s r7 = r0.r
                int r7 = r7.e(r6)
                androidx.recyclerview.widget.s r8 = r0.r
                int r8 = r8.b(r6)
                r9 = 0
                if (r7 > r2) goto L30
                r10 = r4
                goto L31
            L30:
                r10 = r9
            L31:
                if (r8 < r1) goto L34
                r9 = r4
            L34:
                if (r10 == 0) goto L41
                if (r9 == 0) goto L41
                if (r7 < r1) goto L3c
                if (r8 <= r2) goto L41
            L3c:
                int r12 = androidx.recyclerview.widget.RecyclerView.l.H(r6)
                return r12
            L41:
                int r12 = r12 + r5
                goto L15
            L43:
                return r3
        }

        public final int f(int r3) {
                r2 = this;
                int r0 = r2.c
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                if (r0 == r1) goto L7
                return r0
            L7:
                java.util.ArrayList<android.view.View> r0 = r2.f989a
                int r0 = r0.size()
                if (r0 != 0) goto L10
                return r3
            L10:
                r2.a()
                int r3 = r2.c
                return r3
        }

        public final android.view.View g(int r7, int r8) {
                r6 = this;
                androidx.recyclerview.widget.StaggeredGridLayoutManager r0 = r6.f
                java.util.ArrayList<android.view.View> r1 = r6.f989a
                r2 = -1
                r3 = 0
                if (r8 != r2) goto L35
                int r8 = r1.size()
                r2 = 0
            Ld:
                if (r2 >= r8) goto L34
                java.lang.Object r4 = r1.get(r2)
                android.view.View r4 = (android.view.View) r4
                boolean r5 = r0.w
                if (r5 == 0) goto L1f
                int r5 = androidx.recyclerview.widget.RecyclerView.l.H(r4)
                if (r5 <= r7) goto L34
            L1f:
                boolean r5 = r0.w
                if (r5 != 0) goto L2a
                int r5 = androidx.recyclerview.widget.RecyclerView.l.H(r4)
                if (r5 < r7) goto L2a
                goto L34
            L2a:
                boolean r5 = r4.hasFocusable()
                if (r5 == 0) goto L34
                int r2 = r2 + 1
                r3 = r4
                goto Ld
            L34:
                return r3
            L35:
                int r8 = r1.size()
                int r8 = r8 + (-1)
            L3b:
                if (r8 < 0) goto L62
                java.lang.Object r2 = r1.get(r8)
                android.view.View r2 = (android.view.View) r2
                boolean r4 = r0.w
                if (r4 == 0) goto L4d
                int r4 = androidx.recyclerview.widget.RecyclerView.l.H(r2)
                if (r4 >= r7) goto L62
            L4d:
                boolean r4 = r0.w
                if (r4 != 0) goto L58
                int r4 = androidx.recyclerview.widget.RecyclerView.l.H(r2)
                if (r4 > r7) goto L58
                goto L62
            L58:
                boolean r4 = r2.hasFocusable()
                if (r4 == 0) goto L62
                int r8 = r8 + (-1)
                r3 = r2
                goto L3b
            L62:
                return r3
        }

        public final int h(int r3) {
                r2 = this;
                int r0 = r2.b
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                if (r0 == r1) goto L7
                return r0
            L7:
                java.util.ArrayList<android.view.View> r0 = r2.f989a
                int r0 = r0.size()
                if (r0 != 0) goto L10
                return r3
            L10:
                java.util.ArrayList<android.view.View> r3 = r2.f989a
                r0 = 0
                java.lang.Object r3 = r3.get(r0)
                android.view.View r3 = (android.view.View) r3
                android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
                androidx.recyclerview.widget.StaggeredGridLayoutManager$c r0 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r0
                androidx.recyclerview.widget.StaggeredGridLayoutManager r1 = r2.f
                androidx.recyclerview.widget.s r1 = r1.r
                int r3 = r1.e(r3)
                r2.b = r3
                r0.getClass()
                int r3 = r2.b
                return r3
        }
    }

    public StaggeredGridLayoutManager(android.content.Context r5, android.util.AttributeSet r6, int r7, int r8) {
            r4 = this;
            r4.<init>()
            r0 = -1
            r4.p = r0
            r1 = 0
            r4.w = r1
            r4.x = r1
            r4.z = r0
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r4.A = r0
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r0 = new androidx.recyclerview.widget.StaggeredGridLayoutManager$d
            r0.<init>()
            r4.B = r0
            r2 = 2
            r4.C = r2
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r4.G = r2
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r2 = new androidx.recyclerview.widget.StaggeredGridLayoutManager$b
            r2.<init>(r4)
            r4.H = r2
            r2 = 1
            r4.I = r2
            androidx.recyclerview.widget.StaggeredGridLayoutManager$a r3 = new androidx.recyclerview.widget.StaggeredGridLayoutManager$a
            r3.<init>(r4)
            r4.K = r3
            androidx.recyclerview.widget.RecyclerView$l$c r5 = androidx.recyclerview.widget.RecyclerView.l.I(r5, r6, r7, r8)
            int r6 = r5.f974a
            if (r6 == 0) goto L46
            if (r6 != r2) goto L3e
            goto L46
        L3e:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "invalid orientation."
            r5.<init>(r6)
            throw r5
        L46:
            r7 = 0
            r4.c(r7)
            int r8 = r4.t
            if (r6 != r8) goto L4f
            goto L5c
        L4f:
            r4.t = r6
            androidx.recyclerview.widget.s r6 = r4.r
            androidx.recyclerview.widget.s r8 = r4.s
            r4.r = r8
            r4.s = r6
            r4.n0()
        L5c:
            int r6 = r5.b
            r4.c(r7)
            int r8 = r4.p
            if (r6 == r8) goto L90
            r0.a()
            r4.n0()
            r4.p = r6
            java.util.BitSet r6 = new java.util.BitSet
            int r8 = r4.p
            r6.<init>(r8)
            r4.y = r6
            int r6 = r4.p
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r6 = new androidx.recyclerview.widget.StaggeredGridLayoutManager.f[r6]
            r4.q = r6
            r6 = r1
        L7d:
            int r8 = r4.p
            if (r6 >= r8) goto L8d
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r8 = r4.q
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r0 = new androidx.recyclerview.widget.StaggeredGridLayoutManager$f
            r0.<init>(r4, r6)
            r8[r6] = r0
            int r6 = r6 + 1
            goto L7d
        L8d:
            r4.n0()
        L90:
            boolean r5 = r5.c
            r4.c(r7)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r6 = r4.F
            if (r6 == 0) goto L9f
            boolean r7 = r6.h
            if (r7 == r5) goto L9f
            r6.h = r5
        L9f:
            r4.w = r5
            r4.n0()
            androidx.recyclerview.widget.n r5 = new androidx.recyclerview.widget.n
            r5.<init>()
            r5.f1012a = r2
            r5.f = r1
            r5.g = r1
            r4.v = r5
            int r5 = r4.t
            androidx.recyclerview.widget.s r5 = androidx.recyclerview.widget.s.a(r4, r5)
            r4.r = r5
            int r5 = r4.t
            int r2 = r2 - r5
            androidx.recyclerview.widget.s r5 = androidx.recyclerview.widget.s.a(r4, r2)
            r4.s = r5
            return
    }

    public static int e1(int r2, int r3, int r4) {
            if (r3 != 0) goto L5
            if (r4 != 0) goto L5
            goto L12
        L5:
            int r0 = android.view.View.MeasureSpec.getMode(r2)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto L13
            r1 = 1073741824(0x40000000, float:2.0)
            if (r0 != r1) goto L12
            goto L13
        L12:
            return r2
        L13:
            int r2 = android.view.View.MeasureSpec.getSize(r2)
            int r2 = r2 - r3
            int r2 = r2 - r4
            r3 = 0
            int r2 = java.lang.Math.max(r3, r2)
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
            return r2
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final boolean B0() {
            r1 = this;
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r0 = r1.F
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public final boolean C0() {
            r3 = this;
            int r0 = r3.v()
            r1 = 0
            if (r0 == 0) goto L37
            int r0 = r3.C
            if (r0 == 0) goto L37
            boolean r0 = r3.g
            if (r0 != 0) goto L10
            goto L37
        L10:
            boolean r0 = r3.x
            if (r0 == 0) goto L1c
            int r0 = r3.M0()
            r3.L0()
            goto L23
        L1c:
            int r0 = r3.L0()
            r3.M0()
        L23:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r2 = r3.B
            if (r0 != 0) goto L37
            android.view.View r0 = r3.Q0()
            if (r0 == 0) goto L37
            r2.a()
            r0 = 1
            r3.f = r0
            r3.n0()
            return r0
        L37:
            return r1
    }

    public final int D0(androidx.recyclerview.widget.RecyclerView.w r7) {
            r6 = this;
            int r0 = r6.v()
            if (r0 != 0) goto L8
            r7 = 0
            return r7
        L8:
            androidx.recyclerview.widget.s r1 = r6.r
            boolean r0 = r6.I
            r0 = r0 ^ 1
            android.view.View r2 = r6.I0(r0)
            android.view.View r3 = r6.H0(r0)
            boolean r5 = r6.I
            r4 = r6
            r0 = r7
            int r7 = androidx.recyclerview.widget.y.a(r0, r1, r2, r3, r4, r5)
            return r7
    }

    public final int E0(androidx.recyclerview.widget.RecyclerView.w r8) {
            r7 = this;
            int r0 = r7.v()
            if (r0 != 0) goto L8
            r8 = 0
            return r8
        L8:
            androidx.recyclerview.widget.s r1 = r7.r
            boolean r0 = r7.I
            r0 = r0 ^ 1
            android.view.View r2 = r7.I0(r0)
            android.view.View r3 = r7.H0(r0)
            boolean r5 = r7.I
            boolean r6 = r7.x
            r4 = r7
            r0 = r8
            int r8 = androidx.recyclerview.widget.y.b(r0, r1, r2, r3, r4, r5, r6)
            return r8
    }

    public final int F0(androidx.recyclerview.widget.RecyclerView.w r7) {
            r6 = this;
            int r0 = r6.v()
            if (r0 != 0) goto L8
            r7 = 0
            return r7
        L8:
            androidx.recyclerview.widget.s r1 = r6.r
            boolean r0 = r6.I
            r0 = r0 ^ 1
            android.view.View r2 = r6.I0(r0)
            android.view.View r3 = r6.H0(r0)
            boolean r5 = r6.I
            r4 = r6
            r0 = r7
            int r7 = androidx.recyclerview.widget.y.c(r0, r1, r2, r3, r4, r5)
            return r7
    }

    public final int G0(androidx.recyclerview.widget.RecyclerView.r r20, androidx.recyclerview.widget.n r21, androidx.recyclerview.widget.RecyclerView.w r22) {
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            java.util.BitSet r3 = r0.y
            int r4 = r0.p
            r5 = 0
            r6 = 1
            r3.set(r5, r4, r6)
            androidx.recyclerview.widget.n r3 = r0.v
            boolean r4 = r3.i
            if (r4 == 0) goto L20
            int r4 = r2.e
            if (r4 != r6) goto L1d
            r4 = 2147483647(0x7fffffff, float:NaN)
            goto L2f
        L1d:
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L2f
        L20:
            int r4 = r2.e
            if (r4 != r6) goto L2a
            int r4 = r2.g
            int r9 = r2.b
            int r4 = r4 + r9
            goto L2f
        L2a:
            int r4 = r2.f
            int r9 = r2.b
            int r4 = r4 - r9
        L2f:
            int r9 = r2.e
            r10 = r5
        L32:
            int r11 = r0.p
            if (r10 >= r11) goto L4d
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r11 = r0.q
            r11 = r11[r10]
            java.util.ArrayList<android.view.View> r11 = r11.f989a
            boolean r11 = r11.isEmpty()
            if (r11 == 0) goto L43
            goto L4a
        L43:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r11 = r0.q
            r11 = r11[r10]
            r0.d1(r11, r9, r4)
        L4a:
            int r10 = r10 + 1
            goto L32
        L4d:
            boolean r9 = r0.x
            if (r9 == 0) goto L58
            androidx.recyclerview.widget.s r9 = r0.r
            int r9 = r9.g()
            goto L5e
        L58:
            androidx.recyclerview.widget.s r9 = r0.r
            int r9 = r9.k()
        L5e:
            r10 = r5
        L5f:
            int r11 = r2.c
            if (r11 < 0) goto L6b
            int r12 = r22.b()
            if (r11 >= r12) goto L6b
            r11 = r6
            goto L6c
        L6b:
            r11 = r5
        L6c:
            r12 = -1
            if (r11 == 0) goto L266
            boolean r11 = r3.i
            if (r11 != 0) goto L7b
            java.util.BitSet r11 = r0.y
            boolean r11 = r11.isEmpty()
            if (r11 != 0) goto L266
        L7b:
            int r10 = r2.c
            r13 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            androidx.recyclerview.widget.RecyclerView$A r10 = r1.k(r13, r10)
            android.view.View r10 = r10.f963a
            int r11 = r2.c
            int r13 = r2.d
            int r11 = r11 + r13
            r2.c = r11
            android.view.ViewGroup$LayoutParams r11 = r10.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r11 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r11
            androidx.recyclerview.widget.RecyclerView$A r13 = r11.f975a
            int r13 = r13.b()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r14 = r0.B
            int[] r15 = r14.f986a
            if (r15 == 0) goto La8
            int r8 = r15.length
            if (r13 < r8) goto La5
            goto La8
        La5:
            r8 = r15[r13]
            goto La9
        La8:
            r8 = r12
        La9:
            if (r8 != r12) goto L10a
            int r8 = r2.e
            boolean r8 = r0.U0(r8)
            if (r8 == 0) goto Lba
            int r8 = r0.p
            int r8 = r8 - r6
            r15 = r12
            r16 = r15
            goto Lc0
        Lba:
            int r8 = r0.p
            r16 = r6
            r15 = r8
            r8 = r5
        Lc0:
            int r7 = r2.e
            r17 = 0
            if (r7 != r6) goto Le6
            androidx.recyclerview.widget.s r7 = r0.r
            int r7 = r7.k()
            r5 = 2147483647(0x7fffffff, float:NaN)
        Lcf:
            if (r8 == r15) goto Le3
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r12 = r0.q
            r12 = r12[r8]
            int r6 = r12.f(r7)
            if (r6 >= r5) goto Lde
            r5 = r6
            r17 = r12
        Lde:
            int r8 = r8 + r16
            r6 = 1
            r12 = -1
            goto Lcf
        Le3:
            r5 = r17
            goto L100
        Le6:
            androidx.recyclerview.widget.s r5 = r0.r
            int r5 = r5.g()
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
        Lee:
            if (r8 == r15) goto Le3
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r7 = r0.q
            r7 = r7[r8]
            int r12 = r7.h(r5)
            if (r12 <= r6) goto Lfd
            r17 = r7
            r6 = r12
        Lfd:
            int r8 = r8 + r16
            goto Lee
        L100:
            r14.b(r13)
            int[] r6 = r14.f986a
            int r7 = r5.e
            r6[r13] = r7
            goto L10e
        L10a:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r5 = r0.q
            r5 = r5[r8]
        L10e:
            r11.e = r5
            int r6 = r2.e
            r7 = 1
            if (r6 != r7) goto L11b
            r6 = 0
            r8 = -1
            r0.b(r10, r8, r6)
            goto L11f
        L11b:
            r6 = 0
            r0.b(r10, r6, r6)
        L11f:
            int r8 = r0.t
            if (r8 != r7) goto L145
            int r7 = r0.u
            int r8 = r0.l
            int r12 = r11.width
            int r7 = androidx.recyclerview.widget.RecyclerView.l.w(r6, r7, r8, r6, r12)
            int r6 = r0.o
            int r8 = r0.m
            int r12 = r0.G()
            int r13 = r0.D()
            int r13 = r13 + r12
            int r12 = r11.height
            r14 = 1
            int r6 = androidx.recyclerview.widget.RecyclerView.l.w(r14, r6, r8, r13, r12)
            r0.S0(r10, r7, r6)
            goto L167
        L145:
            r14 = r7
            int r6 = r0.n
            int r7 = r0.l
            int r8 = r0.E()
            int r12 = r0.F()
            int r12 = r12 + r8
            int r8 = r11.width
            int r6 = androidx.recyclerview.widget.RecyclerView.l.w(r14, r6, r7, r12, r8)
            int r7 = r0.u
            int r8 = r0.m
            int r12 = r11.height
            r13 = 0
            int r7 = androidx.recyclerview.widget.RecyclerView.l.w(r13, r7, r8, r13, r12)
            r0.S0(r10, r6, r7)
        L167:
            int r6 = r2.e
            if (r6 != r14) goto L177
            int r6 = r5.f(r9)
            androidx.recyclerview.widget.s r7 = r0.r
            int r7 = r7.c(r10)
            int r7 = r7 + r6
            goto L183
        L177:
            int r7 = r5.h(r9)
            androidx.recyclerview.widget.s r6 = r0.r
            int r6 = r6.c(r10)
            int r6 = r7 - r6
        L183:
            int r8 = r2.e
            r14 = 1
            if (r8 != r14) goto L1c7
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r8 = r11.e
            r8.getClass()
            android.view.ViewGroup$LayoutParams r11 = r10.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r11 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r11
            r11.e = r8
            java.util.ArrayList<android.view.View> r12 = r8.f989a
            r12.add(r10)
            r13 = -2147483648(0xffffffff80000000, float:-0.0)
            r8.c = r13
            int r12 = r12.size()
            r14 = 1
            if (r12 != r14) goto L1a7
            r8.b = r13
        L1a7:
            androidx.recyclerview.widget.RecyclerView$A r12 = r11.f975a
            boolean r12 = r12.h()
            if (r12 != 0) goto L1b7
            androidx.recyclerview.widget.RecyclerView$A r11 = r11.f975a
            boolean r11 = r11.k()
            if (r11 == 0) goto L1c4
        L1b7:
            int r11 = r8.d
            androidx.recyclerview.widget.StaggeredGridLayoutManager r12 = r8.f
            androidx.recyclerview.widget.s r12 = r12.r
            int r12 = r12.c(r10)
            int r12 = r12 + r11
            r8.d = r12
        L1c4:
            r13 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L204
        L1c7:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r8 = r11.e
            r8.getClass()
            android.view.ViewGroup$LayoutParams r11 = r10.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r11 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r11
            r11.e = r8
            java.util.ArrayList<android.view.View> r12 = r8.f989a
            r13 = 0
            r12.add(r13, r10)
            r13 = -2147483648(0xffffffff80000000, float:-0.0)
            r8.b = r13
            int r12 = r12.size()
            r14 = 1
            if (r12 != r14) goto L1e7
            r8.c = r13
        L1e7:
            androidx.recyclerview.widget.RecyclerView$A r12 = r11.f975a
            boolean r12 = r12.h()
            if (r12 != 0) goto L1f7
            androidx.recyclerview.widget.RecyclerView$A r11 = r11.f975a
            boolean r11 = r11.k()
            if (r11 == 0) goto L204
        L1f7:
            int r11 = r8.d
            androidx.recyclerview.widget.StaggeredGridLayoutManager r12 = r8.f
            androidx.recyclerview.widget.s r12 = r12.r
            int r12 = r12.c(r10)
            int r12 = r12 + r11
            r8.d = r12
        L204:
            boolean r8 = r0.R0()
            if (r8 == 0) goto L228
            int r8 = r0.t
            r14 = 1
            if (r8 != r14) goto L228
            androidx.recyclerview.widget.s r8 = r0.s
            int r8 = r8.g()
            int r11 = r0.p
            int r11 = r11 - r14
            int r12 = r5.e
            int r11 = r11 - r12
            int r12 = r0.u
            int r11 = r11 * r12
            int r8 = r8 - r11
            androidx.recyclerview.widget.s r11 = r0.s
            int r11 = r11.c(r10)
            int r11 = r8 - r11
            goto L23b
        L228:
            int r8 = r5.e
            int r11 = r0.u
            int r8 = r8 * r11
            androidx.recyclerview.widget.s r11 = r0.s
            int r11 = r11.k()
            int r11 = r11 + r8
            androidx.recyclerview.widget.s r8 = r0.s
            int r8 = r8.c(r10)
            int r8 = r8 + r11
        L23b:
            int r12 = r0.t
            r14 = 1
            if (r12 != r14) goto L244
            androidx.recyclerview.widget.RecyclerView.l.N(r10, r11, r6, r8, r7)
            goto L247
        L244:
            androidx.recyclerview.widget.RecyclerView.l.N(r10, r6, r11, r7, r8)
        L247:
            int r6 = r3.e
            r0.d1(r5, r6, r4)
            r0.W0(r1, r3)
            boolean r6 = r3.h
            if (r6 == 0) goto L261
            boolean r6 = r10.hasFocusable()
            if (r6 == 0) goto L261
            java.util.BitSet r6 = r0.y
            int r5 = r5.e
            r7 = 0
            r6.set(r5, r7)
        L261:
            r6 = r14
            r10 = r6
            r5 = 0
            goto L5f
        L266:
            if (r10 != 0) goto L26b
            r0.W0(r1, r3)
        L26b:
            int r1 = r3.e
            r8 = -1
            if (r1 != r8) goto L282
            androidx.recyclerview.widget.s r1 = r0.r
            int r1 = r1.k()
            int r1 = r0.O0(r1)
            androidx.recyclerview.widget.s r3 = r0.r
            int r3 = r3.k()
            int r3 = r3 - r1
            goto L294
        L282:
            androidx.recyclerview.widget.s r1 = r0.r
            int r1 = r1.g()
            int r1 = r0.N0(r1)
            androidx.recyclerview.widget.s r3 = r0.r
            int r3 = r3.g()
            int r3 = r1 - r3
        L294:
            if (r3 <= 0) goto L29d
            int r1 = r2.b
            int r1 = java.lang.Math.min(r1, r3)
            return r1
        L29d:
            r18 = 0
            return r18
    }

    public final android.view.View H0(boolean r8) {
            r7 = this;
            androidx.recyclerview.widget.s r0 = r7.r
            int r0 = r0.k()
            androidx.recyclerview.widget.s r1 = r7.r
            int r1 = r1.g()
            int r2 = r7.v()
            int r2 = r2 + (-1)
            r3 = 0
        L13:
            if (r2 < 0) goto L37
            android.view.View r4 = r7.u(r2)
            androidx.recyclerview.widget.s r5 = r7.r
            int r5 = r5.e(r4)
            androidx.recyclerview.widget.s r6 = r7.r
            int r6 = r6.b(r4)
            if (r6 <= r0) goto L34
            if (r5 < r1) goto L2a
            goto L34
        L2a:
            if (r6 <= r1) goto L33
            if (r8 != 0) goto L2f
            goto L33
        L2f:
            if (r3 != 0) goto L34
            r3 = r4
            goto L34
        L33:
            return r4
        L34:
            int r2 = r2 + (-1)
            goto L13
        L37:
            return r3
    }

    public final android.view.View I0(boolean r9) {
            r8 = this;
            androidx.recyclerview.widget.s r0 = r8.r
            int r0 = r0.k()
            androidx.recyclerview.widget.s r1 = r8.r
            int r1 = r1.g()
            int r2 = r8.v()
            r3 = 0
            r4 = 0
        L12:
            if (r4 >= r2) goto L36
            android.view.View r5 = r8.u(r4)
            androidx.recyclerview.widget.s r6 = r8.r
            int r6 = r6.e(r5)
            androidx.recyclerview.widget.s r7 = r8.r
            int r7 = r7.b(r5)
            if (r7 <= r0) goto L33
            if (r6 < r1) goto L29
            goto L33
        L29:
            if (r6 >= r0) goto L32
            if (r9 != 0) goto L2e
            goto L32
        L2e:
            if (r3 != 0) goto L33
            r3 = r5
            goto L33
        L32:
            return r5
        L33:
            int r4 = r4 + 1
            goto L12
        L36:
            return r3
    }

    public final void J0(androidx.recyclerview.widget.RecyclerView.r r3, androidx.recyclerview.widget.RecyclerView.w r4, boolean r5) {
            r2 = this;
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r2.N0(r0)
            if (r1 != r0) goto L9
            goto L22
        L9:
            androidx.recyclerview.widget.s r0 = r2.r
            int r0 = r0.g()
            int r0 = r0 - r1
            if (r0 <= 0) goto L22
            int r1 = -r0
            int r3 = r2.a1(r1, r3, r4)
            int r3 = -r3
            int r0 = r0 - r3
            if (r5 == 0) goto L22
            if (r0 <= 0) goto L22
            androidx.recyclerview.widget.s r3 = r2.r
            r3.o(r0)
        L22:
            return
    }

    public final void K0(androidx.recyclerview.widget.RecyclerView.r r3, androidx.recyclerview.widget.RecyclerView.w r4, boolean r5) {
            r2 = this;
            r0 = 2147483647(0x7fffffff, float:NaN)
            int r1 = r2.O0(r0)
            if (r1 != r0) goto La
            goto L22
        La:
            androidx.recyclerview.widget.s r0 = r2.r
            int r0 = r0.k()
            int r1 = r1 - r0
            if (r1 <= 0) goto L22
            int r3 = r2.a1(r1, r3, r4)
            int r1 = r1 - r3
            if (r5 == 0) goto L22
            if (r1 <= 0) goto L22
            androidx.recyclerview.widget.s r3 = r2.r
            int r4 = -r1
            r3.o(r4)
        L22:
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final boolean L() {
            r1 = this;
            int r0 = r1.C
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public final int L0() {
            r2 = this;
            int r0 = r2.v()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            android.view.View r0 = r2.u(r1)
            int r0 = androidx.recyclerview.widget.RecyclerView.l.H(r0)
            return r0
    }

    public final int M0() {
            r1 = this;
            int r0 = r1.v()
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            int r0 = r0 + (-1)
            android.view.View r0 = r1.u(r0)
            int r0 = androidx.recyclerview.widget.RecyclerView.l.H(r0)
            return r0
    }

    public final int N0(int r4) {
            r3 = this;
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r0 = r3.q
            r1 = 0
            r0 = r0[r1]
            int r0 = r0.f(r4)
            r1 = 1
        La:
            int r2 = r3.p
            if (r1 >= r2) goto L1c
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r2 = r3.q
            r2 = r2[r1]
            int r2 = r2.f(r4)
            if (r2 <= r0) goto L19
            r0 = r2
        L19:
            int r1 = r1 + 1
            goto La
        L1c:
            return r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void O(int r5) {
            r4 = this;
            super.O(r5)
            r0 = 0
        L4:
            int r1 = r4.p
            if (r0 >= r1) goto L1f
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r1 = r4.q
            r1 = r1[r0]
            int r2 = r1.b
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 == r3) goto L15
            int r2 = r2 + r5
            r1.b = r2
        L15:
            int r2 = r1.c
            if (r2 == r3) goto L1c
            int r2 = r2 + r5
            r1.c = r2
        L1c:
            int r0 = r0 + 1
            goto L4
        L1f:
            return
    }

    public final int O0(int r4) {
            r3 = this;
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r0 = r3.q
            r1 = 0
            r0 = r0[r1]
            int r0 = r0.h(r4)
            r1 = 1
        La:
            int r2 = r3.p
            if (r1 >= r2) goto L1c
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r2 = r3.q
            r2 = r2[r1]
            int r2 = r2.h(r4)
            if (r2 >= r0) goto L19
            r0 = r2
        L19:
            int r1 = r1 + 1
            goto La
        L1c:
            return r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void P(int r5) {
            r4 = this;
            super.P(r5)
            r0 = 0
        L4:
            int r1 = r4.p
            if (r0 >= r1) goto L1f
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r1 = r4.q
            r1 = r1[r0]
            int r2 = r1.b
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 == r3) goto L15
            int r2 = r2 + r5
            r1.b = r2
        L15:
            int r2 = r1.c
            if (r2 == r3) goto L1c
            int r2 = r2 + r5
            r1.c = r2
        L1c:
            int r0 = r0 + 1
            goto L4
        L1f:
            return
    }

    public final void P0(int r10, int r11, int r12) {
            r9 = this;
            boolean r0 = r9.x
            if (r0 == 0) goto L9
            int r0 = r9.M0()
            goto Ld
        L9:
            int r0 = r9.L0()
        Ld:
            r1 = 8
            if (r12 != r1) goto L1b
            if (r10 >= r11) goto L17
            int r2 = r11 + 1
        L15:
            r3 = r10
            goto L1e
        L17:
            int r2 = r10 + 1
            r3 = r11
            goto L1e
        L1b:
            int r2 = r10 + r11
            goto L15
        L1e:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r4 = r9.B
            int[] r5 = r4.f986a
            r6 = -1
            if (r5 != 0) goto L27
            goto L9a
        L27:
            int r5 = r5.length
            if (r3 < r5) goto L2c
            goto L9a
        L2c:
            java.util.ArrayList r5 = r4.b
            if (r5 != 0) goto L32
        L30:
            r5 = r6
            goto L80
        L32:
            if (r5 != 0) goto L35
            goto L4d
        L35:
            int r5 = r5.size()
            int r5 = r5 + (-1)
        L3b:
            if (r5 < 0) goto L4d
            java.util.ArrayList r7 = r4.b
            java.lang.Object r7 = r7.get(r5)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a r7 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.d.a) r7
            int r8 = r7.f987a
            if (r8 != r3) goto L4a
            goto L4e
        L4a:
            int r5 = r5 + (-1)
            goto L3b
        L4d:
            r7 = 0
        L4e:
            if (r7 == 0) goto L55
            java.util.ArrayList r5 = r4.b
            r5.remove(r7)
        L55:
            java.util.ArrayList r5 = r4.b
            int r5 = r5.size()
            r7 = 0
        L5c:
            if (r7 >= r5) goto L6e
            java.util.ArrayList r8 = r4.b
            java.lang.Object r8 = r8.get(r7)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a r8 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.d.a) r8
            int r8 = r8.f987a
            if (r8 < r3) goto L6b
            goto L6f
        L6b:
            int r7 = r7 + 1
            goto L5c
        L6e:
            r7 = r6
        L6f:
            if (r7 == r6) goto L30
            java.util.ArrayList r5 = r4.b
            java.lang.Object r5 = r5.get(r7)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a r5 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.d.a) r5
            java.util.ArrayList r8 = r4.b
            r8.remove(r7)
            int r5 = r5.f987a
        L80:
            if (r5 != r6) goto L8c
            int[] r5 = r4.f986a
            int r7 = r5.length
            java.util.Arrays.fill(r5, r3, r7, r6)
            int[] r5 = r4.f986a
            int r5 = r5.length
            goto L9a
        L8c:
            int r5 = r5 + 1
            int[] r7 = r4.f986a
            int r7 = r7.length
            int r5 = java.lang.Math.min(r5, r7)
            int[] r7 = r4.f986a
            java.util.Arrays.fill(r7, r3, r5, r6)
        L9a:
            r5 = 1
            if (r12 == r5) goto Lae
            r6 = 2
            if (r12 == r6) goto Laa
            if (r12 == r1) goto La3
            goto Lb1
        La3:
            r4.d(r10, r5)
            r4.c(r11, r5)
            goto Lb1
        Laa:
            r4.d(r10, r11)
            goto Lb1
        Lae:
            r4.c(r10, r11)
        Lb1:
            if (r2 > r0) goto Lb4
            goto Lc6
        Lb4:
            boolean r10 = r9.x
            if (r10 == 0) goto Lbd
            int r10 = r9.L0()
            goto Lc1
        Lbd:
            int r10 = r9.M0()
        Lc1:
            if (r3 > r10) goto Lc6
            r9.n0()
        Lc6:
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void Q() {
            r2 = this;
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r0 = r2.B
            r0.a()
            r0 = 0
        L6:
            int r1 = r2.p
            if (r0 >= r1) goto L14
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r1 = r2.q
            r1 = r1[r0]
            r1.b()
            int r0 = r0 + 1
            goto L6
        L14:
            return
    }

    public final android.view.View Q0() {
            r13 = this;
            int r0 = r13.v()
            int r1 = r0 + (-1)
            java.util.BitSet r2 = new java.util.BitSet
            int r3 = r13.p
            r2.<init>(r3)
            int r3 = r13.p
            r4 = 0
            r5 = 1
            r2.set(r4, r3, r5)
            int r3 = r13.t
            r6 = -1
            if (r3 != r5) goto L21
            boolean r3 = r13.R0()
            if (r3 == 0) goto L21
            r3 = r5
            goto L22
        L21:
            r3 = r6
        L22:
            boolean r7 = r13.x
            if (r7 == 0) goto L28
            r0 = r6
            goto L29
        L28:
            r1 = r4
        L29:
            if (r1 >= r0) goto L2c
            r6 = r5
        L2c:
            if (r1 == r0) goto L100
            android.view.View r7 = r13.u(r1)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r8 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r8
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.e
            int r9 = r9.e
            boolean r9 = r2.get(r9)
            if (r9 == 0) goto Lb6
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.e
            boolean r10 = r13.x
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r10 == 0) goto L73
            int r10 = r9.c
            if (r10 == r11) goto L4f
            goto L54
        L4f:
            r9.a()
            int r10 = r9.c
        L54:
            androidx.recyclerview.widget.s r11 = r13.r
            int r11 = r11.g()
            if (r10 >= r11) goto Laf
            java.util.ArrayList<android.view.View> r0 = r9.f989a
            int r1 = r0.size()
            int r1 = r1 - r5
            java.lang.Object r0 = r0.get(r1)
            android.view.View r0 = (android.view.View) r0
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r0 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r0
            r0.getClass()
            return r7
        L73:
            int r10 = r9.b
            if (r10 == r11) goto L78
            goto L95
        L78:
            java.util.ArrayList<android.view.View> r10 = r9.f989a
            java.lang.Object r10 = r10.get(r4)
            android.view.View r10 = (android.view.View) r10
            android.view.ViewGroup$LayoutParams r11 = r10.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r11 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r11
            androidx.recyclerview.widget.StaggeredGridLayoutManager r12 = r9.f
            androidx.recyclerview.widget.s r12 = r12.r
            int r10 = r12.e(r10)
            r9.b = r10
            r11.getClass()
            int r10 = r9.b
        L95:
            androidx.recyclerview.widget.s r11 = r13.r
            int r11 = r11.k()
            if (r10 <= r11) goto Laf
            java.util.ArrayList<android.view.View> r0 = r9.f989a
            java.lang.Object r0 = r0.get(r4)
            android.view.View r0 = (android.view.View) r0
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r0 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r0
            r0.getClass()
            return r7
        Laf:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.e
            int r9 = r9.e
            r2.clear(r9)
        Lb6:
            int r1 = r1 + r6
            if (r1 == r0) goto L2c
            android.view.View r9 = r13.u(r1)
            boolean r10 = r13.x
            if (r10 == 0) goto Ld3
            androidx.recyclerview.widget.s r10 = r13.r
            int r10 = r10.b(r7)
            androidx.recyclerview.widget.s r11 = r13.r
            int r11 = r11.b(r9)
            if (r10 >= r11) goto Ld0
            goto Lff
        Ld0:
            if (r10 != r11) goto L2c
            goto Le4
        Ld3:
            androidx.recyclerview.widget.s r10 = r13.r
            int r10 = r10.e(r7)
            androidx.recyclerview.widget.s r11 = r13.r
            int r11 = r11.e(r9)
            if (r10 <= r11) goto Le2
            goto Lff
        Le2:
            if (r10 != r11) goto L2c
        Le4:
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r8 = r8.e
            int r8 = r8.e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r9.e
            int r9 = r9.e
            int r8 = r8 - r9
            if (r8 >= 0) goto Lf7
            r8 = r5
            goto Lf8
        Lf7:
            r8 = r4
        Lf8:
            if (r3 >= 0) goto Lfc
            r9 = r5
            goto Lfd
        Lfc:
            r9 = r4
        Lfd:
            if (r8 == r9) goto L2c
        Lff:
            return r7
        L100:
            r0 = 0
            return r0
    }

    public final boolean R0() {
            r2 = this;
            int r0 = r2.C()
            r1 = 1
            if (r0 != r1) goto L8
            return r1
        L8:
            r0 = 0
            return r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void S(androidx.recyclerview.widget.RecyclerView r3) {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r2.b
            if (r0 == 0) goto L9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$a r1 = r2.K
            r0.removeCallbacks(r1)
        L9:
            r0 = 0
        La:
            int r1 = r2.p
            if (r0 >= r1) goto L18
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r1 = r2.q
            r1 = r1[r0]
            r1.b()
            int r0 = r0 + 1
            goto La
        L18:
            r3.requestLayout()
            return
    }

    public final void S0(android.view.View r6, int r7, int r8) {
            r5 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r5.b
            android.graphics.Rect r1 = r5.G
            if (r0 != 0) goto Lb
            r0 = 0
            r1.set(r0, r0, r0, r0)
            goto L12
        Lb:
            android.graphics.Rect r0 = r0.M(r6)
            r1.set(r0)
        L12:
            android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r0 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r0
            int r2 = r0.leftMargin
            int r3 = r1.left
            int r2 = r2 + r3
            int r3 = r0.rightMargin
            int r4 = r1.right
            int r3 = r3 + r4
            int r7 = e1(r7, r2, r3)
            int r2 = r0.topMargin
            int r3 = r1.top
            int r2 = r2 + r3
            int r3 = r0.bottomMargin
            int r1 = r1.bottom
            int r3 = r3 + r1
            int r8 = e1(r8, r2, r3)
            boolean r0 = r5.w0(r6, r7, r8, r0)
            if (r0 == 0) goto L3d
            r6.measure(r7, r8)
        L3d:
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final android.view.View T(android.view.View r9, int r10, androidx.recyclerview.widget.RecyclerView.r r11, androidx.recyclerview.widget.RecyclerView.w r12) {
            r8 = this;
            int r0 = r8.v()
            r1 = 0
            if (r0 != 0) goto L9
            goto L15d
        L9:
            androidx.recyclerview.widget.RecyclerView r0 = r8.b
            if (r0 != 0) goto Le
            goto L1f
        Le:
            android.view.View r9 = r0.D(r9)
            if (r9 != 0) goto L15
            goto L1f
        L15:
            androidx.recyclerview.widget.b r0 = r8.f971a
            java.util.ArrayList r0 = r0.c
            boolean r0 = r0.contains(r9)
            if (r0 == 0) goto L20
        L1f:
            r9 = r1
        L20:
            if (r9 != 0) goto L24
            goto L15d
        L24:
            r8.Z0()
            r0 = 1
            r2 = -1
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r10 == r0) goto L64
            r4 = 2
            if (r10 == r4) goto L58
            r4 = 17
            if (r10 == r4) goto L53
            r4 = 33
            if (r10 == r4) goto L4d
            r4 = 66
            if (r10 == r4) goto L48
            r4 = 130(0x82, float:1.82E-43)
            if (r10 == r4) goto L42
        L40:
            r10 = r3
            goto L70
        L42:
            int r10 = r8.t
            if (r10 != r0) goto L40
        L46:
            r10 = r0
            goto L70
        L48:
            int r10 = r8.t
            if (r10 != 0) goto L40
            goto L46
        L4d:
            int r10 = r8.t
            if (r10 != r0) goto L40
        L51:
            r10 = r2
            goto L70
        L53:
            int r10 = r8.t
            if (r10 != 0) goto L40
        L57:
            goto L51
        L58:
            int r10 = r8.t
            if (r10 != r0) goto L5d
            goto L46
        L5d:
            boolean r10 = r8.R0()
            if (r10 == 0) goto L46
            goto L51
        L64:
            int r10 = r8.t
            if (r10 != r0) goto L69
            goto L57
        L69:
            boolean r10 = r8.R0()
            if (r10 == 0) goto L51
            goto L46
        L70:
            if (r10 != r3) goto L74
            goto L15d
        L74:
            android.view.ViewGroup$LayoutParams r3 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r3 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r3
            r3.getClass()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r3 = r3.e
            if (r10 != r0) goto L86
            int r4 = r8.M0()
            goto L8a
        L86:
            int r4 = r8.L0()
        L8a:
            r8.c1(r4, r12)
            r8.b1(r10)
            androidx.recyclerview.widget.n r5 = r8.v
            int r6 = r5.d
            int r6 = r6 + r4
            r5.c = r6
            androidx.recyclerview.widget.s r6 = r8.r
            int r6 = r6.l()
            float r6 = (float) r6
            r7 = 1051372203(0x3eaaaaab, float:0.33333334)
            float r6 = r6 * r7
            int r6 = (int) r6
            r5.b = r6
            r5.h = r0
            r6 = 0
            r5.f1012a = r6
            r8.G0(r11, r5, r12)
            boolean r11 = r8.x
            r8.D = r11
            android.view.View r11 = r3.g(r4, r10)
            if (r11 == 0) goto Lba
            if (r11 == r9) goto Lba
            return r11
        Lba:
            boolean r11 = r8.U0(r10)
            if (r11 == 0) goto Ld5
            int r11 = r8.p
            int r11 = r11 - r0
        Lc3:
            if (r11 < 0) goto Lea
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r12 = r8.q
            r12 = r12[r11]
            android.view.View r12 = r12.g(r4, r10)
            if (r12 == 0) goto Ld2
            if (r12 == r9) goto Ld2
            return r12
        Ld2:
            int r11 = r11 + (-1)
            goto Lc3
        Ld5:
            r11 = r6
        Ld6:
            int r12 = r8.p
            if (r11 >= r12) goto Lea
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r12 = r8.q
            r12 = r12[r11]
            android.view.View r12 = r12.g(r4, r10)
            if (r12 == 0) goto Le7
            if (r12 == r9) goto Le7
            return r12
        Le7:
            int r11 = r11 + 1
            goto Ld6
        Lea:
            boolean r11 = r8.w
            r11 = r11 ^ r0
            if (r10 != r2) goto Lf1
            r12 = r0
            goto Lf2
        Lf1:
            r12 = r6
        Lf2:
            if (r11 != r12) goto Lf6
            r11 = r0
            goto Lf7
        Lf6:
            r11 = r6
        Lf7:
            if (r11 == 0) goto Lfe
            int r12 = r3.c()
            goto L102
        Lfe:
            int r12 = r3.d()
        L102:
            android.view.View r12 = r8.q(r12)
            if (r12 == 0) goto L10b
            if (r12 == r9) goto L10b
            return r12
        L10b:
            boolean r10 = r8.U0(r10)
            if (r10 == 0) goto L13a
            int r10 = r8.p
            int r10 = r10 - r0
        L114:
            if (r10 < 0) goto L15d
            int r12 = r3.e
            if (r10 != r12) goto L11b
            goto L137
        L11b:
            if (r11 == 0) goto L126
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r12 = r8.q
            r12 = r12[r10]
            int r12 = r12.c()
            goto L12e
        L126:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r12 = r8.q
            r12 = r12[r10]
            int r12 = r12.d()
        L12e:
            android.view.View r12 = r8.q(r12)
            if (r12 == 0) goto L137
            if (r12 == r9) goto L137
            return r12
        L137:
            int r10 = r10 + (-1)
            goto L114
        L13a:
            int r10 = r8.p
            if (r6 >= r10) goto L15d
            if (r11 == 0) goto L149
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r10 = r8.q
            r10 = r10[r6]
            int r10 = r10.c()
            goto L151
        L149:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r10 = r8.q
            r10 = r10[r6]
            int r10 = r10.d()
        L151:
            android.view.View r10 = r8.q(r10)
            if (r10 == 0) goto L15a
            if (r10 == r9) goto L15a
            return r10
        L15a:
            int r6 = r6 + 1
            goto L13a
        L15d:
            return r1
    }

    public final void T0(androidx.recyclerview.widget.RecyclerView.r r17, androidx.recyclerview.widget.RecyclerView.w r18, boolean r19) {
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r3 = r0.F
            r4 = -1
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r5 = r0.H
            if (r3 != 0) goto L11
            int r3 = r0.z
            if (r3 == r4) goto L1e
        L11:
            int r3 = r2.b()
            if (r3 != 0) goto L1e
            r16.i0(r17)
            r5.a()
            return
        L1e:
            boolean r3 = r5.e
            r6 = 0
            r7 = 1
            if (r3 == 0) goto L2f
            int r3 = r0.z
            if (r3 != r4) goto L2f
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r3 = r0.F
            if (r3 == 0) goto L2d
            goto L2f
        L2d:
            r3 = r6
            goto L30
        L2f:
            r3 = r7
        L30:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r8 = r0.B
            androidx.recyclerview.widget.StaggeredGridLayoutManager r9 = r5.g
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 == 0) goto L220
            r5.a()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r11 = r0.F
            if (r11 == 0) goto Lc3
            int r12 = r11.c
            r13 = 0
            if (r12 <= 0) goto L88
            int r14 = r0.p
            if (r12 != r14) goto L7a
            r11 = r6
        L49:
            int r12 = r0.p
            if (r11 >= r12) goto L88
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r12 = r0.q
            r12 = r12[r11]
            r12.b()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r12 = r0.F
            int[] r14 = r12.d
            r14 = r14[r11]
            if (r14 == r10) goto L6f
            boolean r12 = r12.i
            if (r12 == 0) goto L68
            androidx.recyclerview.widget.s r12 = r0.r
            int r12 = r12.g()
        L66:
            int r14 = r14 + r12
            goto L6f
        L68:
            androidx.recyclerview.widget.s r12 = r0.r
            int r12 = r12.k()
            goto L66
        L6f:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r12 = r0.q
            r12 = r12[r11]
            r12.b = r14
            r12.c = r14
            int r11 = r11 + 1
            goto L49
        L7a:
            r11.d = r13
            r11.c = r6
            r11.e = r6
            r11.f = r13
            r11.g = r13
            int r12 = r11.b
            r11.f988a = r12
        L88:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r11 = r0.F
            boolean r12 = r11.j
            r0.E = r12
            boolean r11 = r11.h
            r0.c(r13)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r12 = r0.F
            if (r12 == 0) goto L9d
            boolean r13 = r12.h
            if (r13 == r11) goto L9d
            r12.h = r11
        L9d:
            r0.w = r11
            r0.n0()
            r0.Z0()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r11 = r0.F
            int r12 = r11.f988a
            if (r12 == r4) goto Lb2
            r0.z = r12
            boolean r12 = r11.i
            r5.c = r12
            goto Lb6
        Lb2:
            boolean r12 = r0.x
            r5.c = r12
        Lb6:
            int r12 = r11.e
            if (r12 <= r7) goto Lca
            int[] r12 = r11.f
            r8.f986a = r12
            java.util.ArrayList r11 = r11.g
            r8.b = r11
            goto Lca
        Lc3:
            r0.Z0()
            boolean r11 = r0.x
            r5.c = r11
        Lca:
            boolean r11 = r2.g
            if (r11 != 0) goto L1dd
            int r11 = r0.z
            if (r11 != r4) goto Ld4
            goto L1dd
        Ld4:
            if (r11 < 0) goto L1d9
            int r12 = r2.b()
            if (r11 < r12) goto Lde
            goto L1d9
        Lde:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r11 = r0.F
            if (r11 == 0) goto Lf3
            int r12 = r11.f988a
            if (r12 == r4) goto Lf3
            int r11 = r11.c
            if (r11 >= r7) goto Leb
            goto Lf3
        Leb:
            r5.b = r10
            int r11 = r0.z
            r5.f985a = r11
            goto L21e
        Lf3:
            int r11 = r0.z
            android.view.View r11 = r0.q(r11)
            if (r11 == 0) goto L188
            boolean r12 = r0.x
            if (r12 == 0) goto L104
            int r12 = r0.M0()
            goto L108
        L104:
            int r12 = r0.L0()
        L108:
            r5.f985a = r12
            int r12 = r0.A
            if (r12 == r10) goto L13a
            boolean r12 = r5.c
            if (r12 == 0) goto L126
            androidx.recyclerview.widget.s r12 = r0.r
            int r12 = r12.g()
            int r13 = r0.A
            int r12 = r12 - r13
            androidx.recyclerview.widget.s r13 = r0.r
            int r11 = r13.b(r11)
            int r12 = r12 - r11
            r5.b = r12
            goto L21e
        L126:
            androidx.recyclerview.widget.s r12 = r0.r
            int r12 = r12.k()
            int r13 = r0.A
            int r12 = r12 + r13
            androidx.recyclerview.widget.s r13 = r0.r
            int r11 = r13.e(r11)
            int r12 = r12 - r11
            r5.b = r12
            goto L21e
        L13a:
            androidx.recyclerview.widget.s r12 = r0.r
            int r12 = r12.c(r11)
            androidx.recyclerview.widget.s r13 = r0.r
            int r13 = r13.l()
            if (r12 <= r13) goto L15d
            boolean r11 = r5.c
            if (r11 == 0) goto L153
            androidx.recyclerview.widget.s r11 = r0.r
            int r11 = r11.g()
            goto L159
        L153:
            androidx.recyclerview.widget.s r11 = r0.r
            int r11 = r11.k()
        L159:
            r5.b = r11
            goto L21e
        L15d:
            androidx.recyclerview.widget.s r12 = r0.r
            int r12 = r12.e(r11)
            androidx.recyclerview.widget.s r13 = r0.r
            int r13 = r13.k()
            int r12 = r12 - r13
            if (r12 >= 0) goto L171
            int r11 = -r12
            r5.b = r11
            goto L21e
        L171:
            androidx.recyclerview.widget.s r12 = r0.r
            int r12 = r12.g()
            androidx.recyclerview.widget.s r13 = r0.r
            int r11 = r13.b(r11)
            int r12 = r12 - r11
            if (r12 >= 0) goto L184
            r5.b = r12
            goto L21e
        L184:
            r5.b = r10
            goto L21e
        L188:
            int r11 = r0.z
            r5.f985a = r11
            int r12 = r0.A
            if (r12 != r10) goto L1bf
            int r12 = r0.v()
            if (r12 != 0) goto L19b
            boolean r11 = r0.x
            if (r11 == 0) goto L1a8
            goto L1aa
        L19b:
            int r12 = r0.L0()
            if (r11 >= r12) goto L1a3
            r11 = r7
            goto L1a4
        L1a3:
            r11 = r6
        L1a4:
            boolean r12 = r0.x
            if (r11 == r12) goto L1aa
        L1a8:
            r11 = r6
            goto L1ab
        L1aa:
            r11 = r7
        L1ab:
            r5.c = r11
            if (r11 == 0) goto L1b6
            androidx.recyclerview.widget.s r11 = r9.r
            int r11 = r11.g()
            goto L1bc
        L1b6:
            androidx.recyclerview.widget.s r11 = r9.r
            int r11 = r11.k()
        L1bc:
            r5.b = r11
            goto L1d6
        L1bf:
            boolean r11 = r5.c
            if (r11 == 0) goto L1cd
            androidx.recyclerview.widget.s r11 = r9.r
            int r11 = r11.g()
            int r11 = r11 - r12
            r5.b = r11
            goto L1d6
        L1cd:
            androidx.recyclerview.widget.s r11 = r9.r
            int r11 = r11.k()
            int r11 = r11 + r12
            r5.b = r11
        L1d6:
            r5.d = r7
            goto L21e
        L1d9:
            r0.z = r4
            r0.A = r10
        L1dd:
            boolean r11 = r0.D
            if (r11 == 0) goto L1fe
            int r11 = r2.b()
            int r12 = r0.v()
            int r12 = r12 - r7
        L1ea:
            if (r12 < 0) goto L1fc
            android.view.View r13 = r0.u(r12)
            int r13 = androidx.recyclerview.widget.RecyclerView.l.H(r13)
            if (r13 < 0) goto L1f9
            if (r13 >= r11) goto L1f9
            goto L21a
        L1f9:
            int r12 = r12 + (-1)
            goto L1ea
        L1fc:
            r13 = r6
            goto L21a
        L1fe:
            int r11 = r2.b()
            int r12 = r0.v()
            r13 = r6
        L207:
            if (r13 >= r12) goto L1fc
            android.view.View r14 = r0.u(r13)
            int r14 = androidx.recyclerview.widget.RecyclerView.l.H(r14)
            if (r14 < 0) goto L217
            if (r14 >= r11) goto L217
            r13 = r14
            goto L21a
        L217:
            int r13 = r13 + 1
            goto L207
        L21a:
            r5.f985a = r13
            r5.b = r10
        L21e:
            r5.e = r7
        L220:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r11 = r0.F
            if (r11 != 0) goto L23b
            int r11 = r0.z
            if (r11 != r4) goto L23b
            boolean r11 = r5.c
            boolean r12 = r0.D
            if (r11 != r12) goto L236
            boolean r11 = r0.R0()
            boolean r12 = r0.E
            if (r11 == r12) goto L23b
        L236:
            r8.a()
            r5.d = r7
        L23b:
            int r8 = r0.v()
            if (r8 <= 0) goto L2e6
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r8 = r0.F
            if (r8 == 0) goto L249
            int r8 = r8.c
            if (r8 >= r7) goto L2e6
        L249:
            boolean r8 = r5.d
            if (r8 == 0) goto L268
            r3 = r6
        L24e:
            int r8 = r0.p
            if (r3 >= r8) goto L2e6
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r8 = r0.q
            r8 = r8[r3]
            r8.b()
            int r8 = r5.b
            if (r8 == r10) goto L265
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r9 = r0.q
            r9 = r9[r3]
            r9.b = r8
            r9.c = r8
        L265:
            int r3 = r3 + 1
            goto L24e
        L268:
            if (r3 != 0) goto L286
            int[] r3 = r5.f
            if (r3 != 0) goto L26f
            goto L286
        L26f:
            r3 = r6
        L270:
            int r8 = r0.p
            if (r3 >= r8) goto L2e6
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r8 = r0.q
            r8 = r8[r3]
            r8.b()
            int[] r9 = r5.f
            r9 = r9[r3]
            r8.b = r9
            r8.c = r9
            int r3 = r3 + 1
            goto L270
        L286:
            r3 = r6
        L287:
            int r8 = r0.p
            if (r3 >= r8) goto L2c5
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r8 = r0.q
            r8 = r8[r3]
            boolean r11 = r0.x
            int r12 = r5.b
            if (r11 == 0) goto L29a
            int r13 = r8.f(r10)
            goto L29e
        L29a:
            int r13 = r8.h(r10)
        L29e:
            r8.b()
            if (r13 != r10) goto L2a4
            goto L2c2
        L2a4:
            androidx.recyclerview.widget.StaggeredGridLayoutManager r14 = r8.f
            if (r11 == 0) goto L2b0
            androidx.recyclerview.widget.s r15 = r14.r
            int r15 = r15.g()
            if (r13 < r15) goto L2c2
        L2b0:
            if (r11 != 0) goto L2bb
            androidx.recyclerview.widget.s r11 = r14.r
            int r11 = r11.k()
            if (r13 <= r11) goto L2bb
            goto L2c2
        L2bb:
            if (r12 == r10) goto L2be
            int r13 = r13 + r12
        L2be:
            r8.c = r13
            r8.b = r13
        L2c2:
            int r3 = r3 + 1
            goto L287
        L2c5:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r3 = r0.q
            int r8 = r3.length
            int[] r11 = r5.f
            if (r11 == 0) goto L2cf
            int r11 = r11.length
            if (r11 >= r8) goto L2d6
        L2cf:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r9 = r9.q
            int r9 = r9.length
            int[] r9 = new int[r9]
            r5.f = r9
        L2d6:
            r9 = r6
        L2d7:
            if (r9 >= r8) goto L2e6
            int[] r11 = r5.f
            r12 = r3[r9]
            int r12 = r12.h(r10)
            r11[r9] = r12
            int r9 = r9 + 1
            goto L2d7
        L2e6:
            r16.p(r17)
            androidx.recyclerview.widget.n r3 = r0.v
            r3.f1012a = r6
            androidx.recyclerview.widget.s r8 = r0.s
            int r8 = r8.l()
            int r9 = r0.p
            int r9 = r8 / r9
            r0.u = r9
            androidx.recyclerview.widget.s r9 = r0.s
            int r9 = r9.i()
            android.view.View.MeasureSpec.makeMeasureSpec(r8, r9)
            int r8 = r5.f985a
            r0.c1(r8, r2)
            boolean r8 = r5.c
            if (r8 == 0) goto L31f
            r0.b1(r4)
            r0.G0(r1, r3, r2)
            r0.b1(r7)
            int r4 = r5.f985a
            int r8 = r3.d
            int r4 = r4 + r8
            r3.c = r4
            r0.G0(r1, r3, r2)
            goto L332
        L31f:
            r0.b1(r7)
            r0.G0(r1, r3, r2)
            r0.b1(r4)
            int r4 = r5.f985a
            int r8 = r3.d
            int r4 = r4 + r8
            r3.c = r4
            r0.G0(r1, r3, r2)
        L332:
            androidx.recyclerview.widget.s r3 = r0.s
            int r3 = r3.i()
            r4 = 1073741824(0x40000000, float:2.0)
            if (r3 != r4) goto L33e
            goto L3da
        L33e:
            int r3 = r0.v()
            r4 = 0
            r8 = r6
        L344:
            if (r8 >= r3) goto L366
            android.view.View r9 = r0.u(r8)
            androidx.recyclerview.widget.s r11 = r0.s
            int r11 = r11.c(r9)
            float r11 = (float) r11
            int r12 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r12 >= 0) goto L356
            goto L363
        L356:
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r9
            r9.getClass()
            float r4 = java.lang.Math.max(r4, r11)
        L363:
            int r8 = r8 + 1
            goto L344
        L366:
            int r8 = r0.u
            int r9 = r0.p
            float r9 = (float) r9
            float r4 = r4 * r9
            int r4 = java.lang.Math.round(r4)
            androidx.recyclerview.widget.s r9 = r0.s
            int r9 = r9.i()
            if (r9 != r10) goto L382
            androidx.recyclerview.widget.s r9 = r0.s
            int r9 = r9.l()
            int r4 = java.lang.Math.min(r4, r9)
        L382:
            int r9 = r0.p
            int r9 = r4 / r9
            r0.u = r9
            androidx.recyclerview.widget.s r9 = r0.s
            int r9 = r9.i()
            android.view.View.MeasureSpec.makeMeasureSpec(r4, r9)
            int r4 = r0.u
            if (r4 != r8) goto L396
            goto L3da
        L396:
            r4 = r6
        L397:
            if (r4 >= r3) goto L3da
            android.view.View r9 = r0.u(r4)
            android.view.ViewGroup$LayoutParams r10 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r10 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r10
            r10.getClass()
            boolean r11 = r0.R0()
            if (r11 == 0) goto L3c2
            int r11 = r0.t
            if (r11 != r7) goto L3c2
            int r11 = r0.p
            int r11 = r11 - r7
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r10 = r10.e
            int r10 = r10.e
            int r11 = r11 - r10
            int r10 = -r11
            int r11 = r0.u
            int r11 = r11 * r10
            int r10 = r10 * r8
            int r11 = r11 - r10
            r9.offsetLeftAndRight(r11)
            goto L3d7
        L3c2:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r10 = r10.e
            int r10 = r10.e
            int r11 = r0.u
            int r11 = r11 * r10
            int r10 = r10 * r8
            int r12 = r0.t
            if (r12 != r7) goto L3d3
            int r11 = r11 - r10
            r9.offsetLeftAndRight(r11)
            goto L3d7
        L3d3:
            int r11 = r11 - r10
            r9.offsetTopAndBottom(r11)
        L3d7:
            int r4 = r4 + 1
            goto L397
        L3da:
            int r3 = r0.v()
            if (r3 <= 0) goto L3f1
            boolean r3 = r0.x
            if (r3 == 0) goto L3eb
            r0.J0(r1, r2, r7)
            r0.K0(r1, r2, r6)
            goto L3f1
        L3eb:
            r0.K0(r1, r2, r7)
            r0.J0(r1, r2, r6)
        L3f1:
            if (r19 == 0) goto L417
            boolean r3 = r2.g
            if (r3 != 0) goto L417
            int r3 = r0.C
            if (r3 == 0) goto L417
            int r3 = r0.v()
            if (r3 <= 0) goto L417
            android.view.View r3 = r0.Q0()
            if (r3 == 0) goto L417
            androidx.recyclerview.widget.RecyclerView r3 = r0.b
            if (r3 == 0) goto L410
            androidx.recyclerview.widget.StaggeredGridLayoutManager$a r4 = r0.K
            r3.removeCallbacks(r4)
        L410:
            boolean r3 = r0.C0()
            if (r3 == 0) goto L417
            goto L418
        L417:
            r7 = r6
        L418:
            boolean r3 = r2.g
            if (r3 == 0) goto L41f
            r5.a()
        L41f:
            boolean r3 = r5.c
            r0.D = r3
            boolean r3 = r0.R0()
            r0.E = r3
            if (r7 == 0) goto L431
            r5.a()
            r0.T0(r1, r2, r6)
        L431:
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void U(android.view.accessibility.AccessibilityEvent r3) {
            r2 = this;
            super.U(r3)
            int r0 = r2.v()
            if (r0 <= 0) goto L2e
            r0 = 0
            android.view.View r1 = r2.I0(r0)
            android.view.View r0 = r2.H0(r0)
            if (r1 == 0) goto L2e
            if (r0 != 0) goto L17
            goto L2e
        L17:
            int r1 = androidx.recyclerview.widget.RecyclerView.l.H(r1)
            int r0 = androidx.recyclerview.widget.RecyclerView.l.H(r0)
            if (r1 >= r0) goto L28
            r3.setFromIndex(r1)
            r3.setToIndex(r0)
            return
        L28:
            r3.setFromIndex(r0)
            r3.setToIndex(r1)
        L2e:
            return
    }

    public final boolean U0(int r5) {
            r4 = this;
            int r0 = r4.t
            r1 = -1
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L12
            if (r5 != r1) goto Lb
            r5 = r3
            goto Lc
        Lb:
            r5 = r2
        Lc:
            boolean r0 = r4.x
            if (r5 == r0) goto L11
            return r3
        L11:
            return r2
        L12:
            if (r5 != r1) goto L16
            r5 = r3
            goto L17
        L16:
            r5 = r2
        L17:
            boolean r0 = r4.x
            if (r5 != r0) goto L1d
            r5 = r3
            goto L1e
        L1d:
            r5 = r2
        L1e:
            boolean r0 = r4.R0()
            if (r5 != r0) goto L25
            return r3
        L25:
            return r2
    }

    public final void V0(int r5, androidx.recyclerview.widget.RecyclerView.w r6) {
            r4 = this;
            r0 = 1
            if (r5 <= 0) goto L9
            int r1 = r4.M0()
            r2 = r0
            goto Le
        L9:
            int r1 = r4.L0()
            r2 = -1
        Le:
            androidx.recyclerview.widget.n r3 = r4.v
            r3.f1012a = r0
            r4.c1(r1, r6)
            r4.b1(r2)
            int r6 = r3.d
            int r1 = r1 + r6
            r3.c = r1
            int r5 = java.lang.Math.abs(r5)
            r3.b = r5
            return
    }

    public final void W0(androidx.recyclerview.widget.RecyclerView.r r5, androidx.recyclerview.widget.n r6) {
            r4 = this;
            boolean r0 = r6.f1012a
            if (r0 == 0) goto L85
            boolean r0 = r6.i
            if (r0 == 0) goto La
            goto L85
        La:
            int r0 = r6.b
            r1 = -1
            if (r0 != 0) goto L1f
            int r0 = r6.e
            if (r0 != r1) goto L19
            int r6 = r6.g
            r4.X0(r5, r6)
            return
        L19:
            int r6 = r6.f
            r4.Y0(r5, r6)
            return
        L1f:
            int r0 = r6.e
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L55
            int r0 = r6.f
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r1 = r4.q
            r1 = r1[r3]
            int r1 = r1.h(r0)
        L2f:
            int r3 = r4.p
            if (r2 >= r3) goto L41
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r3 = r4.q
            r3 = r3[r2]
            int r3 = r3.h(r0)
            if (r3 <= r1) goto L3e
            r1 = r3
        L3e:
            int r2 = r2 + 1
            goto L2f
        L41:
            int r0 = r0 - r1
            if (r0 >= 0) goto L47
            int r6 = r6.g
            goto L51
        L47:
            int r1 = r6.g
            int r6 = r6.b
            int r6 = java.lang.Math.min(r0, r6)
            int r6 = r1 - r6
        L51:
            r4.X0(r5, r6)
            return
        L55:
            int r0 = r6.g
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r1 = r4.q
            r1 = r1[r3]
            int r1 = r1.f(r0)
        L5f:
            int r3 = r4.p
            if (r2 >= r3) goto L71
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r3 = r4.q
            r3 = r3[r2]
            int r3 = r3.f(r0)
            if (r3 >= r1) goto L6e
            r1 = r3
        L6e:
            int r2 = r2 + 1
            goto L5f
        L71:
            int r0 = r6.g
            int r1 = r1 - r0
            if (r1 >= 0) goto L79
            int r6 = r6.f
            goto L82
        L79:
            int r0 = r6.f
            int r6 = r6.b
            int r6 = java.lang.Math.min(r1, r6)
            int r6 = r6 + r0
        L82:
            r4.Y0(r5, r6)
        L85:
            return
    }

    public final void X0(androidx.recyclerview.widget.RecyclerView.r r9, int r10) {
            r8 = this;
            int r0 = r8.v()
            r1 = 1
            int r0 = r0 - r1
        L6:
            if (r0 < 0) goto L74
            android.view.View r2 = r8.u(r0)
            androidx.recyclerview.widget.s r3 = r8.r
            int r3 = r3.e(r2)
            if (r3 < r10) goto L74
            androidx.recyclerview.widget.s r3 = r8.r
            int r3 = r3.n(r2)
            if (r3 < r10) goto L74
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r3 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r3
            r3.getClass()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r4 = r3.e
            java.util.ArrayList<android.view.View> r4 = r4.f989a
            int r4 = r4.size()
            if (r4 != r1) goto L30
            goto L74
        L30:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r3 = r3.e
            java.util.ArrayList<android.view.View> r4 = r3.f989a
            int r5 = r4.size()
            int r6 = r5 + (-1)
            java.lang.Object r4 = r4.remove(r6)
            android.view.View r4 = (android.view.View) r4
            android.view.ViewGroup$LayoutParams r6 = r4.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r6 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r6
            r7 = 0
            r6.e = r7
            androidx.recyclerview.widget.RecyclerView$A r7 = r6.f975a
            boolean r7 = r7.h()
            if (r7 != 0) goto L59
            androidx.recyclerview.widget.RecyclerView$A r6 = r6.f975a
            boolean r6 = r6.k()
            if (r6 == 0) goto L66
        L59:
            int r6 = r3.d
            androidx.recyclerview.widget.StaggeredGridLayoutManager r7 = r3.f
            androidx.recyclerview.widget.s r7 = r7.r
            int r4 = r7.c(r4)
            int r6 = r6 - r4
            r3.d = r6
        L66:
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r5 != r1) goto L6c
            r3.b = r4
        L6c:
            r3.c = r4
            r8.k0(r2, r9)
            int r0 = r0 + (-1)
            goto L6
        L74:
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void Y(int r2, int r3) {
            r1 = this;
            r0 = 1
            r1.P0(r2, r3, r0)
            return
    }

    public final void Y0(androidx.recyclerview.widget.RecyclerView.r r7, int r8) {
            r6 = this;
        L0:
            int r0 = r6.v()
            if (r0 <= 0) goto L70
            r0 = 0
            android.view.View r1 = r6.u(r0)
            androidx.recyclerview.widget.s r2 = r6.r
            int r2 = r2.b(r1)
            if (r2 > r8) goto L70
            androidx.recyclerview.widget.s r2 = r6.r
            int r2 = r2.m(r1)
            if (r2 > r8) goto L70
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r2 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r2
            r2.getClass()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r3 = r2.e
            java.util.ArrayList<android.view.View> r3 = r3.f989a
            int r3 = r3.size()
            r4 = 1
            if (r3 != r4) goto L30
            goto L70
        L30:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r2 = r2.e
            java.util.ArrayList<android.view.View> r3 = r2.f989a
            java.lang.Object r0 = r3.remove(r0)
            android.view.View r0 = (android.view.View) r0
            android.view.ViewGroup$LayoutParams r4 = r0.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r4 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r4
            r5 = 0
            r4.e = r5
            int r3 = r3.size()
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 != 0) goto L4d
            r2.c = r5
        L4d:
            androidx.recyclerview.widget.RecyclerView$A r3 = r4.f975a
            boolean r3 = r3.h()
            if (r3 != 0) goto L5d
            androidx.recyclerview.widget.RecyclerView$A r3 = r4.f975a
            boolean r3 = r3.k()
            if (r3 == 0) goto L6a
        L5d:
            int r3 = r2.d
            androidx.recyclerview.widget.StaggeredGridLayoutManager r4 = r2.f
            androidx.recyclerview.widget.s r4 = r4.r
            int r0 = r4.c(r0)
            int r3 = r3 - r0
            r2.d = r3
        L6a:
            r2.b = r5
            r6.k0(r1, r7)
            goto L0
        L70:
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void Z() {
            r1 = this;
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r0 = r1.B
            r0.a()
            r1.n0()
            return
    }

    public final void Z0() {
            r2 = this;
            int r0 = r2.t
            r1 = 1
            if (r0 == r1) goto L12
            boolean r0 = r2.R0()
            if (r0 != 0) goto Lc
            goto L12
        Lc:
            boolean r0 = r2.w
            r0 = r0 ^ r1
            r2.x = r0
            return
        L12:
            boolean r0 = r2.w
            r2.x = r0
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.v.b
    public final android.graphics.PointF a(int r4) {
            r3 = this;
            int r0 = r3.v()
            r1 = -1
            r2 = 1
            if (r0 != 0) goto Le
            boolean r4 = r3.x
            if (r4 == 0) goto L1b
        Lc:
            r1 = r2
            goto L1b
        Le:
            int r0 = r3.L0()
            if (r4 >= r0) goto L16
            r4 = r2
            goto L17
        L16:
            r4 = 0
        L17:
            boolean r0 = r3.x
            if (r4 == r0) goto Lc
        L1b:
            android.graphics.PointF r4 = new android.graphics.PointF
            r4.<init>()
            if (r1 != 0) goto L24
            r4 = 0
            return r4
        L24:
            int r0 = r3.t
            r2 = 0
            if (r0 != 0) goto L2f
            float r0 = (float) r1
            r4.x = r0
            r4.y = r2
            return r4
        L2f:
            r4.x = r2
            float r0 = (float) r1
            r4.y = r0
            return r4
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void a0(int r2, int r3) {
            r1 = this;
            r0 = 8
            r1.P0(r2, r3, r0)
            return
    }

    public final int a1(int r4, androidx.recyclerview.widget.RecyclerView.r r5, androidx.recyclerview.widget.RecyclerView.w r6) {
            r3 = this;
            int r0 = r3.v()
            r1 = 0
            if (r0 == 0) goto L2d
            if (r4 != 0) goto La
            goto L2d
        La:
            r3.V0(r4, r6)
            androidx.recyclerview.widget.n r0 = r3.v
            int r6 = r3.G0(r5, r0, r6)
            int r2 = r0.b
            if (r2 >= r6) goto L18
            goto L1d
        L18:
            if (r4 >= 0) goto L1c
            int r4 = -r6
            goto L1d
        L1c:
            r4 = r6
        L1d:
            androidx.recyclerview.widget.s r6 = r3.r
            int r2 = -r4
            r6.o(r2)
            boolean r6 = r3.x
            r3.D = r6
            r0.b = r1
            r3.W0(r5, r0)
            return r4
        L2d:
            return r1
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void b0(int r2, int r3) {
            r1 = this;
            r0 = 2
            r1.P0(r2, r3, r0)
            return
    }

    public final void b1(int r5) {
            r4 = this;
            androidx.recyclerview.widget.n r0 = r4.v
            r0.e = r5
            boolean r1 = r4.x
            r2 = 1
            r3 = -1
            if (r5 != r3) goto Lc
            r5 = r2
            goto Ld
        Lc:
            r5 = 0
        Ld:
            if (r1 != r5) goto L10
            goto L11
        L10:
            r2 = r3
        L11:
            r0.d = r2
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void c(java.lang.String r2) {
            r1 = this;
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r0 = r1.F
            if (r0 != 0) goto L7
            super.c(r2)
        L7:
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void c0(int r2, int r3) {
            r1 = this;
            r0 = 4
            r1.P0(r2, r3, r0)
            return
    }

    public final void c1(int r5, androidx.recyclerview.widget.RecyclerView.w r6) {
            r4 = this;
            androidx.recyclerview.widget.n r0 = r4.v
            r1 = 0
            r0.b = r1
            r0.c = r5
            androidx.recyclerview.widget.o r2 = r4.e
            r3 = 1
            if (r2 == 0) goto L12
            boolean r2 = r2.e
            if (r2 == 0) goto L12
            r2 = r3
            goto L13
        L12:
            r2 = r1
        L13:
            if (r2 == 0) goto L34
            int r6 = r6.f982a
            r2 = -1
            if (r6 == r2) goto L34
            boolean r2 = r4.x
            if (r6 >= r5) goto L20
            r5 = r3
            goto L21
        L20:
            r5 = r1
        L21:
            if (r2 != r5) goto L2b
            androidx.recyclerview.widget.s r5 = r4.r
            int r5 = r5.l()
            r6 = r1
            goto L36
        L2b:
            androidx.recyclerview.widget.s r5 = r4.r
            int r5 = r5.l()
            r6 = r5
            r5 = r1
            goto L36
        L34:
            r5 = r1
            r6 = r5
        L36:
            androidx.recyclerview.widget.RecyclerView r2 = r4.b
            if (r2 == 0) goto L51
            boolean r2 = r2.h
            if (r2 == 0) goto L51
            androidx.recyclerview.widget.s r2 = r4.r
            int r2 = r2.k()
            int r2 = r2 - r6
            r0.f = r2
            androidx.recyclerview.widget.s r6 = r4.r
            int r6 = r6.g()
            int r6 = r6 + r5
            r0.g = r6
            goto L5d
        L51:
            androidx.recyclerview.widget.s r2 = r4.r
            int r2 = r2.f()
            int r2 = r2 + r5
            r0.g = r2
            int r5 = -r6
            r0.f = r5
        L5d:
            r0.h = r1
            r0.f1012a = r3
            androidx.recyclerview.widget.s r5 = r4.r
            int r5 = r5.i()
            if (r5 != 0) goto L72
            androidx.recyclerview.widget.s r5 = r4.r
            int r5 = r5.f()
            if (r5 != 0) goto L72
            r1 = r3
        L72:
            r0.i = r1
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final boolean d() {
            r1 = this;
            int r0 = r1.t
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void d0(androidx.recyclerview.widget.RecyclerView.r r2, androidx.recyclerview.widget.RecyclerView.w r3) {
            r1 = this;
            r0 = 1
            r1.T0(r2, r3, r0)
            return
    }

    public final void d1(androidx.recyclerview.widget.StaggeredGridLayoutManager.f r6, int r7, int r8) {
            r5 = this;
            int r0 = r6.d
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 0
            r3 = -1
            int r4 = r6.e
            if (r7 != r3) goto L35
            int r7 = r6.b
            if (r7 == r1) goto Lf
            goto L2c
        Lf:
            java.util.ArrayList<android.view.View> r7 = r6.f989a
            java.lang.Object r7 = r7.get(r2)
            android.view.View r7 = (android.view.View) r7
            android.view.ViewGroup$LayoutParams r1 = r7.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r1 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r1
            androidx.recyclerview.widget.StaggeredGridLayoutManager r3 = r6.f
            androidx.recyclerview.widget.s r3 = r3.r
            int r7 = r3.e(r7)
            r6.b = r7
            r1.getClass()
            int r7 = r6.b
        L2c:
            int r7 = r7 + r0
            if (r7 > r8) goto L47
            java.util.BitSet r6 = r5.y
            r6.set(r4, r2)
            return
        L35:
            int r7 = r6.c
            if (r7 == r1) goto L3a
            goto L3f
        L3a:
            r6.a()
            int r7 = r6.c
        L3f:
            int r7 = r7 - r0
            if (r7 < r8) goto L47
            java.util.BitSet r6 = r5.y
            r6.set(r4, r2)
        L47:
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final boolean e() {
            r2 = this;
            int r0 = r2.t
            r1 = 1
            if (r0 != r1) goto L6
            return r1
        L6:
            r0 = 0
            return r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void e0(androidx.recyclerview.widget.RecyclerView.w r1) {
            r0 = this;
            r1 = -1
            r0.z = r1
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0.A = r1
            r1 = 0
            r0.F = r1
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r1 = r0.H
            r1.a()
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final boolean f(androidx.recyclerview.widget.RecyclerView.m r1) {
            r0 = this;
            boolean r1 = r1 instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager.c
            return r1
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void f0(android.os.Parcelable r4) {
            r3 = this;
            boolean r0 = r4 instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager.e
            if (r0 == 0) goto L24
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r4 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.e) r4
            r3.F = r4
            int r0 = r3.z
            r1 = -1
            if (r0 == r1) goto L21
            r0 = 0
            r4.d = r0
            r2 = 0
            r4.c = r2
            r4.f988a = r1
            r4.b = r1
            r4.d = r0
            r4.c = r2
            r4.e = r2
            r4.f = r0
            r4.g = r0
        L21:
            r3.n0()
        L24:
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final android.os.Parcelable g0() {
            r5 = this;
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r0 = r5.F
            if (r0 == 0) goto L32
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r1 = new androidx.recyclerview.widget.StaggeredGridLayoutManager$e
            r1.<init>()
            int r2 = r0.c
            r1.c = r2
            int r2 = r0.f988a
            r1.f988a = r2
            int r2 = r0.b
            r1.b = r2
            int[] r2 = r0.d
            r1.d = r2
            int r2 = r0.e
            r1.e = r2
            int[] r2 = r0.f
            r1.f = r2
            boolean r2 = r0.h
            r1.h = r2
            boolean r2 = r0.i
            r1.i = r2
            boolean r2 = r0.j
            r1.j = r2
            java.util.ArrayList r0 = r0.g
            r1.g = r0
            return r1
        L32:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r0 = new androidx.recyclerview.widget.StaggeredGridLayoutManager$e
            r0.<init>()
            boolean r1 = r5.w
            r0.h = r1
            boolean r1 = r5.D
            r0.i = r1
            boolean r1 = r5.E
            r0.j = r1
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r1 = r5.B
            r2 = 0
            if (r1 == 0) goto L56
            int[] r3 = r1.f986a
            if (r3 == 0) goto L56
            r0.f = r3
            int r3 = r3.length
            r0.e = r3
            java.util.ArrayList r1 = r1.b
            r0.g = r1
            goto L58
        L56:
            r0.e = r2
        L58:
            int r1 = r5.v()
            r3 = -1
            if (r1 <= 0) goto Lc2
            boolean r1 = r5.D
            if (r1 == 0) goto L68
            int r1 = r5.M0()
            goto L6c
        L68:
            int r1 = r5.L0()
        L6c:
            r0.f988a = r1
            boolean r1 = r5.x
            r4 = 1
            if (r1 == 0) goto L78
            android.view.View r1 = r5.H0(r4)
            goto L7c
        L78:
            android.view.View r1 = r5.I0(r4)
        L7c:
            if (r1 != 0) goto L7f
            goto L83
        L7f:
            int r3 = androidx.recyclerview.widget.RecyclerView.l.H(r1)
        L83:
            r0.b = r3
            int r1 = r5.p
            r0.c = r1
            int[] r1 = new int[r1]
            r0.d = r1
        L8d:
            int r1 = r5.p
            if (r2 >= r1) goto Lc1
            boolean r1 = r5.D
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == 0) goto La9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r1 = r5.q
            r1 = r1[r2]
            int r1 = r1.f(r3)
            if (r1 == r3) goto Lba
            androidx.recyclerview.widget.s r3 = r5.r
            int r3 = r3.g()
        La7:
            int r1 = r1 - r3
            goto Lba
        La9:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r1 = r5.q
            r1 = r1[r2]
            int r1 = r1.h(r3)
            if (r1 == r3) goto Lba
            androidx.recyclerview.widget.s r3 = r5.r
            int r3 = r3.k()
            goto La7
        Lba:
            int[] r3 = r0.d
            r3[r2] = r1
            int r2 = r2 + 1
            goto L8d
        Lc1:
            return r0
        Lc2:
            r0.f988a = r3
            r0.b = r3
            r0.c = r2
            return r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void h(int r5, int r6, androidx.recyclerview.widget.RecyclerView.w r7, androidx.recyclerview.widget.m.b r8) {
            r4 = this;
            int r0 = r4.t
            if (r0 != 0) goto L5
            goto L6
        L5:
            r5 = r6
        L6:
            int r6 = r4.v()
            if (r6 == 0) goto L77
            if (r5 != 0) goto Lf
            goto L77
        Lf:
            r4.V0(r5, r7)
            int[] r5 = r4.J
            if (r5 == 0) goto L1b
            int r5 = r5.length
            int r6 = r4.p
            if (r5 >= r6) goto L21
        L1b:
            int r5 = r4.p
            int[] r5 = new int[r5]
            r4.J = r5
        L21:
            r5 = 0
            r6 = r5
            r0 = r6
        L24:
            int r1 = r4.p
            androidx.recyclerview.widget.n r2 = r4.v
            if (r6 >= r1) goto L53
            int r1 = r2.d
            r3 = -1
            if (r1 != r3) goto L3b
            int r1 = r2.f
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r2 = r4.q
            r2 = r2[r6]
            int r2 = r2.h(r1)
        L39:
            int r1 = r1 - r2
            goto L48
        L3b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r1 = r4.q
            r1 = r1[r6]
            int r3 = r2.g
            int r1 = r1.f(r3)
            int r2 = r2.g
            goto L39
        L48:
            if (r1 < 0) goto L50
            int[] r2 = r4.J
            r2[r0] = r1
            int r0 = r0 + 1
        L50:
            int r6 = r6 + 1
            goto L24
        L53:
            int[] r6 = r4.J
            java.util.Arrays.sort(r6, r5, r0)
        L58:
            if (r5 >= r0) goto L77
            int r6 = r2.c
            if (r6 < 0) goto L77
            int r1 = r7.b()
            if (r6 >= r1) goto L77
            int r6 = r2.c
            int[] r1 = r4.J
            r1 = r1[r5]
            r8.a(r6, r1)
            int r6 = r2.c
            int r1 = r2.d
            int r6 = r6 + r1
            r2.c = r6
            int r5 = r5 + 1
            goto L58
        L77:
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void h0(int r1) {
            r0 = this;
            if (r1 != 0) goto L5
            r0.C0()
        L5:
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final int j(androidx.recyclerview.widget.RecyclerView.w r1) {
            r0 = this;
            int r1 = r0.D0(r1)
            return r1
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final int k(androidx.recyclerview.widget.RecyclerView.w r1) {
            r0 = this;
            int r1 = r0.E0(r1)
            return r1
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final int l(androidx.recyclerview.widget.RecyclerView.w r1) {
            r0 = this;
            int r1 = r0.F0(r1)
            return r1
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final int m(androidx.recyclerview.widget.RecyclerView.w r1) {
            r0 = this;
            int r1 = r0.D0(r1)
            return r1
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final int n(androidx.recyclerview.widget.RecyclerView.w r1) {
            r0 = this;
            int r1 = r0.E0(r1)
            return r1
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final int o(androidx.recyclerview.widget.RecyclerView.w r1) {
            r0 = this;
            int r1 = r0.F0(r1)
            return r1
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final int o0(int r1, androidx.recyclerview.widget.RecyclerView.r r2, androidx.recyclerview.widget.RecyclerView.w r3) {
            r0 = this;
            int r1 = r0.a1(r1, r2, r3)
            return r1
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void p0(int r3) {
            r2 = this;
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r0 = r2.F
            if (r0 == 0) goto L13
            int r1 = r0.f988a
            if (r1 == r3) goto L13
            r1 = 0
            r0.d = r1
            r1 = 0
            r0.c = r1
            r1 = -1
            r0.f988a = r1
            r0.b = r1
        L13:
            r2.z = r3
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2.A = r3
            r2.n0()
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final int q0(int r1, androidx.recyclerview.widget.RecyclerView.r r2, androidx.recyclerview.widget.RecyclerView.w r3) {
            r0 = this;
            int r1 = r0.a1(r1, r2, r3)
            return r1
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final androidx.recyclerview.widget.RecyclerView.m r() {
            r3 = this;
            int r0 = r3.t
            r1 = -1
            r2 = -2
            if (r0 != 0) goto Lc
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r0 = new androidx.recyclerview.widget.StaggeredGridLayoutManager$c
            r0.<init>(r2, r1)
            return r0
        Lc:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r0 = new androidx.recyclerview.widget.StaggeredGridLayoutManager$c
            r0.<init>(r1, r2)
            return r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final androidx.recyclerview.widget.RecyclerView.m s(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r0 = new androidx.recyclerview.widget.StaggeredGridLayoutManager$c
            r0.<init>(r2, r3)
            return r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final androidx.recyclerview.widget.RecyclerView.m t(android.view.ViewGroup.LayoutParams r2) {
            r1 = this;
            boolean r0 = r2 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto Lc
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r0 = new androidx.recyclerview.widget.StaggeredGridLayoutManager$c
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            r0.<init>(r2)
            return r0
        Lc:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r0 = new androidx.recyclerview.widget.StaggeredGridLayoutManager$c
            r0.<init>(r2)
            return r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void t0(android.graphics.Rect r6, int r7, int r8) {
            r5 = this;
            int r0 = r5.p
            int r1 = r5.E()
            int r2 = r5.F()
            int r2 = r2 + r1
            int r1 = r5.G()
            int r3 = r5.D()
            int r3 = r3 + r1
            int r1 = r5.t
            r4 = 1
            if (r1 != r4) goto L39
            int r6 = r6.height()
            int r6 = r6 + r3
            androidx.recyclerview.widget.RecyclerView r1 = r5.b
            java.util.WeakHashMap<android.view.View, a.Jg> r3 = a.C0414ug.f721a
            int r1 = r1.getMinimumHeight()
            int r6 = androidx.recyclerview.widget.RecyclerView.l.g(r8, r6, r1)
            int r8 = r5.u
            int r8 = r8 * r0
            int r8 = r8 + r2
            androidx.recyclerview.widget.RecyclerView r0 = r5.b
            int r0 = r0.getMinimumWidth()
            int r7 = androidx.recyclerview.widget.RecyclerView.l.g(r7, r8, r0)
            goto L58
        L39:
            int r6 = r6.width()
            int r6 = r6 + r2
            androidx.recyclerview.widget.RecyclerView r1 = r5.b
            java.util.WeakHashMap<android.view.View, a.Jg> r2 = a.C0414ug.f721a
            int r1 = r1.getMinimumWidth()
            int r7 = androidx.recyclerview.widget.RecyclerView.l.g(r7, r6, r1)
            int r6 = r5.u
            int r6 = r6 * r0
            int r6 = r6 + r3
            androidx.recyclerview.widget.RecyclerView r0 = r5.b
            int r0 = r0.getMinimumHeight()
            int r6 = androidx.recyclerview.widget.RecyclerView.l.g(r8, r6, r0)
        L58:
            androidx.recyclerview.widget.RecyclerView r8 = r5.b
            androidx.recyclerview.widget.RecyclerView.g(r8, r7, r6)
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void z0(androidx.recyclerview.widget.RecyclerView r2, int r3) {
            r1 = this;
            androidx.recyclerview.widget.o r0 = new androidx.recyclerview.widget.o
            android.content.Context r2 = r2.getContext()
            r0.<init>(r2)
            r0.f980a = r3
            r1.A0(r0)
            return
    }
}
