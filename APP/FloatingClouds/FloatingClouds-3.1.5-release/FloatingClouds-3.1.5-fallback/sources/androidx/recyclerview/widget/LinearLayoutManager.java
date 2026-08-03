package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutManager extends androidx.recyclerview.widget.RecyclerView.l implements androidx.recyclerview.widget.RecyclerView.v.b {
    public final androidx.recyclerview.widget.LinearLayoutManager.a A;
    public final androidx.recyclerview.widget.LinearLayoutManager.b B;
    public final int C;
    public final int[] D;
    public int p;
    public androidx.recyclerview.widget.LinearLayoutManager.c q;
    public androidx.recyclerview.widget.s r;
    public boolean s;
    public final boolean t;
    public boolean u;
    public boolean v;
    public final boolean w;
    public int x;
    public int y;
    public androidx.recyclerview.widget.LinearLayoutManager.d z;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public androidx.recyclerview.widget.s f958a;
        public int b;
        public int c;
        public boolean d;
        public boolean e;

        public a() {
                r0 = this;
                r0.<init>()
                r0.d()
                return
        }

        public final void a() {
                r1 = this;
                boolean r0 = r1.d
                if (r0 == 0) goto Lb
                androidx.recyclerview.widget.s r0 = r1.f958a
                int r0 = r0.g()
                goto L11
            Lb:
                androidx.recyclerview.widget.s r0 = r1.f958a
                int r0 = r0.k()
            L11:
                r1.c = r0
                return
        }

        public final void b(android.view.View r4, int r5) {
                r3 = this;
                boolean r0 = r3.d
                if (r0 == 0) goto L20
                androidx.recyclerview.widget.s r0 = r3.f958a
                int r4 = r0.b(r4)
                androidx.recyclerview.widget.s r0 = r3.f958a
                int r1 = r0.b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                if (r2 != r1) goto L14
                r0 = 0
                goto L1c
            L14:
                int r1 = r0.l()
                int r0 = r0.b
                int r0 = r1 - r0
            L1c:
                int r0 = r0 + r4
                r3.c = r0
                goto L28
            L20:
                androidx.recyclerview.widget.s r0 = r3.f958a
                int r4 = r0.e(r4)
                r3.c = r4
            L28:
                r3.b = r5
                return
        }

        public final void c(android.view.View r5, int r6) {
                r4 = this;
                androidx.recyclerview.widget.s r0 = r4.f958a
                int r1 = r0.b
                r2 = 0
                r3 = -2147483648(0xffffffff80000000, float:-0.0)
                if (r3 != r1) goto Lb
                r1 = r2
                goto L12
            Lb:
                int r1 = r0.l()
                int r0 = r0.b
                int r1 = r1 - r0
            L12:
                if (r1 < 0) goto L18
                r4.b(r5, r6)
                return
            L18:
                r4.b = r6
                boolean r6 = r4.d
                if (r6 == 0) goto L60
                androidx.recyclerview.widget.s r6 = r4.f958a
                int r6 = r6.g()
                int r6 = r6 - r1
                androidx.recyclerview.widget.s r0 = r4.f958a
                int r0 = r0.b(r5)
                int r6 = r6 - r0
                androidx.recyclerview.widget.s r0 = r4.f958a
                int r0 = r0.g()
                int r0 = r0 - r6
                r4.c = r0
                if (r6 <= 0) goto L9f
                androidx.recyclerview.widget.s r0 = r4.f958a
                int r0 = r0.c(r5)
                int r1 = r4.c
                int r1 = r1 - r0
                androidx.recyclerview.widget.s r0 = r4.f958a
                int r0 = r0.k()
                androidx.recyclerview.widget.s r3 = r4.f958a
                int r5 = r3.e(r5)
                int r5 = r5 - r0
                int r5 = java.lang.Math.min(r5, r2)
                int r5 = r5 + r0
                int r1 = r1 - r5
                if (r1 >= 0) goto L9f
                int r5 = r4.c
                int r0 = -r1
                int r6 = java.lang.Math.min(r6, r0)
                int r6 = r6 + r5
                r4.c = r6
                return
            L60:
                androidx.recyclerview.widget.s r6 = r4.f958a
                int r6 = r6.e(r5)
                androidx.recyclerview.widget.s r0 = r4.f958a
                int r0 = r0.k()
                int r0 = r6 - r0
                r4.c = r6
                if (r0 <= 0) goto L9f
                androidx.recyclerview.widget.s r3 = r4.f958a
                int r3 = r3.c(r5)
                int r3 = r3 + r6
                androidx.recyclerview.widget.s r6 = r4.f958a
                int r6 = r6.g()
                int r6 = r6 - r1
                androidx.recyclerview.widget.s r1 = r4.f958a
                int r5 = r1.b(r5)
                int r6 = r6 - r5
                androidx.recyclerview.widget.s r5 = r4.f958a
                int r5 = r5.g()
                int r6 = java.lang.Math.min(r2, r6)
                int r5 = r5 - r6
                int r5 = r5 - r3
                if (r5 >= 0) goto L9f
                int r6 = r4.c
                int r5 = -r5
                int r5 = java.lang.Math.min(r0, r5)
                int r6 = r6 - r5
                r4.c = r6
            L9f:
                return
        }

        public final void d() {
                r1 = this;
                r0 = -1
                r1.b = r0
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r1.c = r0
                r0 = 0
                r1.d = r0
                r1.e = r0
                return
        }

        public final java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "AnchorInfo{mPosition="
                r0.<init>(r1)
                int r1 = r2.b
                r0.append(r1)
                java.lang.String r1 = ", mCoordinate="
                r0.append(r1)
                int r1 = r2.c
                r0.append(r1)
                java.lang.String r1 = ", mLayoutFromEnd="
                r0.append(r1)
                boolean r1 = r2.d
                r0.append(r1)
                java.lang.String r1 = ", mValid="
                r0.append(r1)
                boolean r1 = r2.e
                r0.append(r1)
                r1 = 125(0x7d, float:1.75E-43)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f959a;
        public boolean b;
        public boolean c;
        public boolean d;
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f960a;
        public int b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public int h;
        public int i;
        public int j;
        public java.util.List<androidx.recyclerview.widget.RecyclerView.A> k;
        public boolean l;

        public final void a(android.view.View r8) {
                r7 = this;
                java.util.List<androidx.recyclerview.widget.RecyclerView$A> r0 = r7.k
                int r0 = r0.size()
                r1 = 0
                r2 = 2147483647(0x7fffffff, float:NaN)
                r3 = 0
            Lb:
                if (r3 >= r0) goto L41
                java.util.List<androidx.recyclerview.widget.RecyclerView$A> r4 = r7.k
                java.lang.Object r4 = r4.get(r3)
                androidx.recyclerview.widget.RecyclerView$A r4 = (androidx.recyclerview.widget.RecyclerView.A) r4
                android.view.View r4 = r4.f963a
                android.view.ViewGroup$LayoutParams r5 = r4.getLayoutParams()
                androidx.recyclerview.widget.RecyclerView$m r5 = (androidx.recyclerview.widget.RecyclerView.m) r5
                if (r4 == r8) goto L3e
                androidx.recyclerview.widget.RecyclerView$A r6 = r5.f975a
                boolean r6 = r6.h()
                if (r6 == 0) goto L28
                goto L3e
            L28:
                androidx.recyclerview.widget.RecyclerView$A r5 = r5.f975a
                int r5 = r5.b()
                int r6 = r7.d
                int r5 = r5 - r6
                int r6 = r7.e
                int r5 = r5 * r6
                if (r5 >= 0) goto L37
                goto L3e
            L37:
                if (r5 >= r2) goto L3e
                r1 = r4
                if (r5 != 0) goto L3d
                goto L41
            L3d:
                r2 = r5
            L3e:
                int r3 = r3 + 1
                goto Lb
            L41:
                if (r1 != 0) goto L47
                r8 = -1
                r7.d = r8
                return
            L47:
                android.view.ViewGroup$LayoutParams r8 = r1.getLayoutParams()
                androidx.recyclerview.widget.RecyclerView$m r8 = (androidx.recyclerview.widget.RecyclerView.m) r8
                androidx.recyclerview.widget.RecyclerView$A r8 = r8.f975a
                int r8 = r8.b()
                r7.d = r8
                return
        }

        public final android.view.View b(androidx.recyclerview.widget.RecyclerView.r r5) {
                r4 = this;
                java.util.List<androidx.recyclerview.widget.RecyclerView$A> r0 = r4.k
                if (r0 == 0) goto L37
                int r5 = r0.size()
                r0 = 0
            L9:
                if (r0 >= r5) goto L35
                java.util.List<androidx.recyclerview.widget.RecyclerView$A> r1 = r4.k
                java.lang.Object r1 = r1.get(r0)
                androidx.recyclerview.widget.RecyclerView$A r1 = (androidx.recyclerview.widget.RecyclerView.A) r1
                android.view.View r1 = r1.f963a
                android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
                androidx.recyclerview.widget.RecyclerView$m r2 = (androidx.recyclerview.widget.RecyclerView.m) r2
                androidx.recyclerview.widget.RecyclerView$A r3 = r2.f975a
                boolean r3 = r3.h()
                if (r3 == 0) goto L24
                goto L32
            L24:
                int r3 = r4.d
                androidx.recyclerview.widget.RecyclerView$A r2 = r2.f975a
                int r2 = r2.b()
                if (r3 != r2) goto L32
                r4.a(r1)
                return r1
            L32:
                int r0 = r0 + 1
                goto L9
            L35:
                r5 = 0
                return r5
            L37:
                int r0 = r4.d
                r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                androidx.recyclerview.widget.RecyclerView$A r5 = r5.k(r1, r0)
                android.view.View r5 = r5.f963a
                int r0 = r4.d
                int r1 = r4.e
                int r0 = r0 + r1
                r4.d = r0
                return r5
        }
    }

    @android.annotation.SuppressLint({"BanParcelableUsage"})
    public static class d implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<androidx.recyclerview.widget.LinearLayoutManager.d> CREATOR = null;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f961a;
        public int b;
        public boolean c;

        public class a implements android.os.Parcelable.Creator<androidx.recyclerview.widget.LinearLayoutManager.d> {
            @Override // android.os.Parcelable.Creator
            public final androidx.recyclerview.widget.LinearLayoutManager.d createFromParcel(android.os.Parcel r3) {
                    r2 = this;
                    androidx.recyclerview.widget.LinearLayoutManager$d r0 = new androidx.recyclerview.widget.LinearLayoutManager$d
                    r0.<init>()
                    int r1 = r3.readInt()
                    r0.f961a = r1
                    int r1 = r3.readInt()
                    r0.b = r1
                    int r3 = r3.readInt()
                    r1 = 1
                    if (r3 != r1) goto L19
                    goto L1a
                L19:
                    r1 = 0
                L1a:
                    r0.c = r1
                    return r0
            }

            @Override // android.os.Parcelable.Creator
            public final androidx.recyclerview.widget.LinearLayoutManager.d[] newArray(int r1) {
                    r0 = this;
                    androidx.recyclerview.widget.LinearLayoutManager$d[] r1 = new androidx.recyclerview.widget.LinearLayoutManager.d[r1]
                    return r1
            }
        }

        static {
                androidx.recyclerview.widget.LinearLayoutManager$d$a r0 = new androidx.recyclerview.widget.LinearLayoutManager$d$a
                r0.<init>()
                androidx.recyclerview.widget.LinearLayoutManager.d.CREATOR = r0
                return
        }

        public d() {
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
                int r2 = r0.f961a
                r1.writeInt(r2)
                int r2 = r0.b
                r1.writeInt(r2)
                boolean r2 = r0.c
                r1.writeInt(r2)
                return
        }
    }

    public LinearLayoutManager(int r4) {
            r3 = this;
            r3.<init>()
            r0 = 1
            r3.p = r0
            r1 = 0
            r3.t = r1
            r3.u = r1
            r3.v = r1
            r3.w = r0
            r0 = -1
            r3.x = r0
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r3.y = r0
            r0 = 0
            r3.z = r0
            androidx.recyclerview.widget.LinearLayoutManager$a r2 = new androidx.recyclerview.widget.LinearLayoutManager$a
            r2.<init>()
            r3.A = r2
            androidx.recyclerview.widget.LinearLayoutManager$b r2 = new androidx.recyclerview.widget.LinearLayoutManager$b
            r2.<init>()
            r3.B = r2
            r2 = 2
            r3.C = r2
            int[] r2 = new int[r2]
            r3.D = r2
            r3.b1(r4)
            r3.c(r0)
            boolean r4 = r3.t
            if (r4 != 0) goto L39
            return
        L39:
            r3.t = r1
            r3.n0()
            return
    }

    @android.annotation.SuppressLint({"UnknownNullness"})
    public LinearLayoutManager(android.content.Context r3, android.util.AttributeSet r4, int r5, int r6) {
            r2 = this;
            r2.<init>()
            r0 = 1
            r2.p = r0
            r1 = 0
            r2.t = r1
            r2.u = r1
            r2.v = r1
            r2.w = r0
            r0 = -1
            r2.x = r0
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r2.y = r0
            r0 = 0
            r2.z = r0
            androidx.recyclerview.widget.LinearLayoutManager$a r1 = new androidx.recyclerview.widget.LinearLayoutManager$a
            r1.<init>()
            r2.A = r1
            androidx.recyclerview.widget.LinearLayoutManager$b r1 = new androidx.recyclerview.widget.LinearLayoutManager$b
            r1.<init>()
            r2.B = r1
            r1 = 2
            r2.C = r1
            int[] r1 = new int[r1]
            r2.D = r1
            androidx.recyclerview.widget.RecyclerView$l$c r3 = androidx.recyclerview.widget.RecyclerView.l.I(r3, r4, r5, r6)
            int r4 = r3.f974a
            r2.b1(r4)
            boolean r4 = r3.c
            r2.c(r0)
            boolean r5 = r2.t
            if (r4 != r5) goto L41
            goto L46
        L41:
            r2.t = r4
            r2.n0()
        L46:
            boolean r3 = r3.d
            r2.c1(r3)
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean B0() {
            r2 = this;
            androidx.recyclerview.widget.LinearLayoutManager$d r0 = r2.z
            if (r0 != 0) goto Lc
            boolean r0 = r2.s
            boolean r1 = r2.v
            if (r0 != r1) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    public void C0(androidx.recyclerview.widget.RecyclerView.w r4, int[] r5) {
            r3 = this;
            int r4 = r4.f982a
            r0 = -1
            r1 = 0
            if (r4 == r0) goto Ld
            androidx.recyclerview.widget.s r4 = r3.r
            int r4 = r4.l()
            goto Le
        Ld:
            r4 = r1
        Le:
            androidx.recyclerview.widget.LinearLayoutManager$c r2 = r3.q
            int r2 = r2.f
            if (r2 != r0) goto L16
            r0 = r1
            goto L18
        L16:
            r0 = r4
            r4 = r1
        L18:
            r5[r1] = r4
            r4 = 1
            r5[r4] = r0
            return
    }

    public void D0(androidx.recyclerview.widget.RecyclerView.w r2, androidx.recyclerview.widget.LinearLayoutManager.c r3, androidx.recyclerview.widget.m.b r4) {
            r1 = this;
            int r0 = r3.d
            if (r0 < 0) goto L14
            int r2 = r2.b()
            if (r0 >= r2) goto L14
            r2 = 0
            int r3 = r3.g
            int r2 = java.lang.Math.max(r2, r3)
            r4.a(r0, r2)
        L14:
            return
    }

    public final int E0(androidx.recyclerview.widget.RecyclerView.w r7) {
            r6 = this;
            int r0 = r6.v()
            if (r0 != 0) goto L8
            r7 = 0
            return r7
        L8:
            r6.I0()
            androidx.recyclerview.widget.s r1 = r6.r
            boolean r0 = r6.w
            r0 = r0 ^ 1
            android.view.View r2 = r6.L0(r0)
            android.view.View r3 = r6.K0(r0)
            boolean r5 = r6.w
            r4 = r6
            r0 = r7
            int r7 = androidx.recyclerview.widget.y.a(r0, r1, r2, r3, r4, r5)
            return r7
    }

    public final int F0(androidx.recyclerview.widget.RecyclerView.w r8) {
            r7 = this;
            int r0 = r7.v()
            if (r0 != 0) goto L8
            r8 = 0
            return r8
        L8:
            r7.I0()
            androidx.recyclerview.widget.s r1 = r7.r
            boolean r0 = r7.w
            r0 = r0 ^ 1
            android.view.View r2 = r7.L0(r0)
            android.view.View r3 = r7.K0(r0)
            boolean r5 = r7.w
            boolean r6 = r7.u
            r4 = r7
            r0 = r8
            int r8 = androidx.recyclerview.widget.y.b(r0, r1, r2, r3, r4, r5, r6)
            return r8
    }

    public final int G0(androidx.recyclerview.widget.RecyclerView.w r7) {
            r6 = this;
            int r0 = r6.v()
            if (r0 != 0) goto L8
            r7 = 0
            return r7
        L8:
            r6.I0()
            androidx.recyclerview.widget.s r1 = r6.r
            boolean r0 = r6.w
            r0 = r0 ^ 1
            android.view.View r2 = r6.L0(r0)
            android.view.View r3 = r6.K0(r0)
            boolean r5 = r6.w
            r4 = r6
            r0 = r7
            int r7 = androidx.recyclerview.widget.y.c(r0, r1, r2, r3, r4, r5)
            return r7
    }

    public final int H0(int r5) {
            r4 = this;
            r0 = -1
            r1 = 1
            if (r5 == r1) goto L3f
            r2 = 2
            if (r5 == r2) goto L32
            r2 = 17
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r5 == r2) goto L2c
            r2 = 33
            if (r5 == r2) goto L26
            r0 = 66
            if (r5 == r0) goto L20
            r0 = 130(0x82, float:1.82E-43)
            if (r5 == r0) goto L1a
            return r3
        L1a:
            int r5 = r4.p
            if (r5 != r1) goto L1f
            return r1
        L1f:
            return r3
        L20:
            int r5 = r4.p
            if (r5 != 0) goto L25
            return r1
        L25:
            return r3
        L26:
            int r5 = r4.p
            if (r5 != r1) goto L2b
            return r0
        L2b:
            return r3
        L2c:
            int r5 = r4.p
            if (r5 != 0) goto L31
            return r0
        L31:
            return r3
        L32:
            int r5 = r4.p
            if (r5 != r1) goto L37
            return r1
        L37:
            boolean r5 = r4.U0()
            if (r5 == 0) goto L3e
            return r0
        L3e:
            return r1
        L3f:
            int r5 = r4.p
            if (r5 != r1) goto L44
            return r0
        L44:
            boolean r5 = r4.U0()
            if (r5 == 0) goto L4b
            return r1
        L4b:
            return r0
    }

    public final void I0() {
            r2 = this;
            androidx.recyclerview.widget.LinearLayoutManager$c r0 = r2.q
            if (r0 != 0) goto L16
            androidx.recyclerview.widget.LinearLayoutManager$c r0 = new androidx.recyclerview.widget.LinearLayoutManager$c
            r0.<init>()
            r1 = 1
            r0.f960a = r1
            r1 = 0
            r0.h = r1
            r0.i = r1
            r1 = 0
            r0.k = r1
            r2.q = r0
        L16:
            return
    }

    public final int J0(androidx.recyclerview.widget.RecyclerView.r r8, androidx.recyclerview.widget.LinearLayoutManager.c r9, androidx.recyclerview.widget.RecyclerView.w r10, boolean r11) {
            r7 = this;
            int r0 = r9.c
            int r1 = r9.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r2) goto L10
            if (r0 >= 0) goto Ld
            int r1 = r1 + r0
            r9.g = r1
        Ld:
            r7.X0(r8, r9)
        L10:
            int r1 = r9.c
            int r3 = r9.h
            int r1 = r1 + r3
        L15:
            boolean r3 = r9.l
            if (r3 != 0) goto L1b
            if (r1 <= 0) goto L6b
        L1b:
            int r3 = r9.d
            if (r3 < 0) goto L6b
            int r4 = r10.b()
            if (r3 >= r4) goto L6b
            androidx.recyclerview.widget.LinearLayoutManager$b r3 = r7.B
            r4 = 0
            r3.f959a = r4
            r3.b = r4
            r3.c = r4
            r3.d = r4
            r7.V0(r8, r10, r9, r3)
            boolean r4 = r3.b
            if (r4 == 0) goto L38
            goto L6b
        L38:
            int r4 = r9.b
            int r5 = r3.f959a
            int r6 = r9.f
            int r6 = r6 * r5
            int r6 = r6 + r4
            r9.b = r6
            boolean r4 = r3.c
            if (r4 == 0) goto L4e
            java.util.List<androidx.recyclerview.widget.RecyclerView$A> r4 = r9.k
            if (r4 != 0) goto L4e
            boolean r4 = r10.g
            if (r4 != 0) goto L54
        L4e:
            int r4 = r9.c
            int r4 = r4 - r5
            r9.c = r4
            int r1 = r1 - r5
        L54:
            int r4 = r9.g
            if (r4 == r2) goto L65
            int r4 = r4 + r5
            r9.g = r4
            int r5 = r9.c
            if (r5 >= 0) goto L62
            int r4 = r4 + r5
            r9.g = r4
        L62:
            r7.X0(r8, r9)
        L65:
            if (r11 == 0) goto L15
            boolean r3 = r3.d
            if (r3 == 0) goto L15
        L6b:
            int r8 = r9.c
            int r0 = r0 - r8
            return r0
    }

    public final android.view.View K0(boolean r3) {
            r2 = this;
            boolean r0 = r2.u
            if (r0 == 0) goto Le
            r0 = 0
            int r1 = r2.v()
            android.view.View r3 = r2.O0(r0, r1, r3)
            return r3
        Le:
            int r0 = r2.v()
            int r0 = r0 + (-1)
            r1 = -1
            android.view.View r3 = r2.O0(r0, r1, r3)
            return r3
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final boolean L() {
            r1 = this;
            r0 = 1
            return r0
    }

    public final android.view.View L0(boolean r3) {
            r2 = this;
            boolean r0 = r2.u
            if (r0 == 0) goto L10
            int r0 = r2.v()
            int r0 = r0 + (-1)
            r1 = -1
            android.view.View r3 = r2.O0(r0, r1, r3)
            return r3
        L10:
            r0 = 0
            int r1 = r2.v()
            android.view.View r3 = r2.O0(r0, r1, r3)
            return r3
    }

    public final int M0() {
            r3 = this;
            int r0 = r3.v()
            int r0 = r0 + (-1)
            r1 = -1
            r2 = 0
            android.view.View r0 = r3.O0(r0, r1, r2)
            if (r0 != 0) goto Lf
            return r1
        Lf:
            int r0 = androidx.recyclerview.widget.RecyclerView.l.H(r0)
            return r0
    }

    public final android.view.View N0(int r4, int r5) {
            r3 = this;
            r3.I0()
            if (r5 <= r4) goto L6
            goto L8
        L6:
            if (r5 >= r4) goto L35
        L8:
            androidx.recyclerview.widget.s r0 = r3.r
            android.view.View r1 = r3.u(r4)
            int r0 = r0.e(r1)
            androidx.recyclerview.widget.s r1 = r3.r
            int r1 = r1.k()
            if (r0 >= r1) goto L1f
            r0 = 16644(0x4104, float:2.3323E-41)
            r1 = 16388(0x4004, float:2.2964E-41)
            goto L23
        L1f:
            r0 = 4161(0x1041, float:5.831E-42)
            r1 = 4097(0x1001, float:5.741E-42)
        L23:
            int r2 = r3.p
            if (r2 != 0) goto L2e
            androidx.recyclerview.widget.B r2 = r3.c
            android.view.View r4 = r2.a(r4, r5, r0, r1)
            return r4
        L2e:
            androidx.recyclerview.widget.B r2 = r3.d
            android.view.View r4 = r2.a(r4, r5, r0, r1)
            return r4
        L35:
            android.view.View r4 = r3.u(r4)
            return r4
    }

    public final android.view.View O0(int r3, int r4, boolean r5) {
            r2 = this;
            r2.I0()
            r0 = 320(0x140, float:4.48E-43)
            if (r5 == 0) goto La
            r5 = 24579(0x6003, float:3.4443E-41)
            goto Lb
        La:
            r5 = r0
        Lb:
            int r1 = r2.p
            if (r1 != 0) goto L16
            androidx.recyclerview.widget.B r1 = r2.c
            android.view.View r3 = r1.a(r3, r4, r5, r0)
            return r3
        L16:
            androidx.recyclerview.widget.B r1 = r2.d
            android.view.View r3 = r1.a(r3, r4, r5, r0)
            return r3
    }

    public android.view.View P0(androidx.recyclerview.widget.RecyclerView.r r17, androidx.recyclerview.widget.RecyclerView.w r18, boolean r19, boolean r20) {
            r16 = this;
            r0 = r16
            r0.I0()
            int r1 = r0.v()
            r2 = 0
            r3 = 1
            if (r20 == 0) goto L15
            int r1 = r0.v()
            int r1 = r1 - r3
            r4 = -1
            r5 = r4
            goto L18
        L15:
            r4 = r1
            r1 = r2
            r5 = r3
        L18:
            int r6 = r18.b()
            androidx.recyclerview.widget.s r7 = r0.r
            int r7 = r7.k()
            androidx.recyclerview.widget.s r8 = r0.r
            int r8 = r8.g()
            r9 = 0
            r10 = r9
            r11 = r10
        L2b:
            if (r1 == r4) goto L7c
            android.view.View r12 = r0.u(r1)
            int r13 = androidx.recyclerview.widget.RecyclerView.l.H(r12)
            androidx.recyclerview.widget.s r14 = r0.r
            int r14 = r14.e(r12)
            androidx.recyclerview.widget.s r15 = r0.r
            int r15 = r15.b(r12)
            if (r13 < 0) goto L7a
            if (r13 >= r6) goto L7a
            android.view.ViewGroup$LayoutParams r13 = r12.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$m r13 = (androidx.recyclerview.widget.RecyclerView.m) r13
            androidx.recyclerview.widget.RecyclerView$A r13 = r13.f975a
            boolean r13 = r13.h()
            if (r13 == 0) goto L57
            if (r11 != 0) goto L7a
            r11 = r12
            goto L7a
        L57:
            if (r15 > r7) goto L5d
            if (r14 >= r7) goto L5d
            r13 = r3
            goto L5e
        L5d:
            r13 = r2
        L5e:
            if (r14 < r8) goto L64
            if (r15 <= r8) goto L64
            r14 = r3
            goto L65
        L64:
            r14 = r2
        L65:
            if (r13 != 0) goto L6b
            if (r14 == 0) goto L6a
            goto L6b
        L6a:
            return r12
        L6b:
            if (r19 == 0) goto L73
            if (r14 == 0) goto L70
            goto L75
        L70:
            if (r9 != 0) goto L7a
            goto L79
        L73:
            if (r13 == 0) goto L77
        L75:
            r10 = r12
            goto L7a
        L77:
            if (r9 != 0) goto L7a
        L79:
            r9 = r12
        L7a:
            int r1 = r1 + r5
            goto L2b
        L7c:
            if (r9 == 0) goto L7f
            return r9
        L7f:
            if (r10 == 0) goto L82
            return r10
        L82:
            return r11
    }

    public final int Q0(int r2, androidx.recyclerview.widget.RecyclerView.r r3, androidx.recyclerview.widget.RecyclerView.w r4, boolean r5) {
            r1 = this;
            androidx.recyclerview.widget.s r0 = r1.r
            int r0 = r0.g()
            int r0 = r0 - r2
            if (r0 <= 0) goto L23
            int r0 = -r0
            int r3 = r1.a1(r0, r3, r4)
            int r3 = -r3
            int r2 = r2 + r3
            if (r5 == 0) goto L22
            androidx.recyclerview.widget.s r4 = r1.r
            int r4 = r4.g()
            int r4 = r4 - r2
            if (r4 <= 0) goto L22
            androidx.recyclerview.widget.s r2 = r1.r
            r2.o(r4)
            int r4 = r4 + r3
            return r4
        L22:
            return r3
        L23:
            r2 = 0
            return r2
    }

    public final int R0(int r2, androidx.recyclerview.widget.RecyclerView.r r3, androidx.recyclerview.widget.RecyclerView.w r4, boolean r5) {
            r1 = this;
            androidx.recyclerview.widget.s r0 = r1.r
            int r0 = r0.k()
            int r0 = r2 - r0
            if (r0 <= 0) goto L23
            int r3 = r1.a1(r0, r3, r4)
            int r3 = -r3
            int r2 = r2 + r3
            if (r5 == 0) goto L22
            androidx.recyclerview.widget.s r4 = r1.r
            int r4 = r4.k()
            int r2 = r2 - r4
            if (r2 <= 0) goto L22
            androidx.recyclerview.widget.s r4 = r1.r
            int r5 = -r2
            r4.o(r5)
            int r3 = r3 - r2
        L22:
            return r3
        L23:
            r2 = 0
            return r2
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    @android.annotation.SuppressLint({"UnknownNullness"})
    public final void S(androidx.recyclerview.widget.RecyclerView r1) {
            r0 = this;
            return
    }

    public final android.view.View S0() {
            r1 = this;
            boolean r0 = r1.u
            if (r0 == 0) goto L6
            r0 = 0
            goto Lc
        L6:
            int r0 = r1.v()
            int r0 = r0 + (-1)
        Lc:
            android.view.View r0 = r1.u(r0)
            return r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    @android.annotation.SuppressLint({"UnknownNullness"})
    public android.view.View T(android.view.View r3, int r4, androidx.recyclerview.widget.RecyclerView.r r5, androidx.recyclerview.widget.RecyclerView.w r6) {
            r2 = this;
            r2.Z0()
            int r3 = r2.v()
            if (r3 != 0) goto La
            goto L73
        La:
            int r3 = r2.H0(r4)
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 != r4) goto L13
            goto L73
        L13:
            r2.I0()
            androidx.recyclerview.widget.s r0 = r2.r
            int r0 = r0.l()
            float r0 = (float) r0
            r1 = 1051372203(0x3eaaaaab, float:0.33333334)
            float r0 = r0 * r1
            int r0 = (int) r0
            r1 = 0
            r2.d1(r3, r0, r1, r6)
            androidx.recyclerview.widget.LinearLayoutManager$c r0 = r2.q
            r0.g = r4
            r0.f960a = r1
            r4 = 1
            r2.J0(r5, r0, r6, r4)
            r5 = -1
            if (r3 != r5) goto L4a
            boolean r6 = r2.u
            if (r6 == 0) goto L41
            int r6 = r2.v()
            int r6 = r6 - r4
            android.view.View r4 = r2.N0(r6, r5)
            goto L60
        L41:
            int r4 = r2.v()
            android.view.View r4 = r2.N0(r1, r4)
            goto L60
        L4a:
            boolean r6 = r2.u
            if (r6 == 0) goto L57
            int r4 = r2.v()
            android.view.View r4 = r2.N0(r1, r4)
            goto L60
        L57:
            int r6 = r2.v()
            int r6 = r6 - r4
            android.view.View r4 = r2.N0(r6, r5)
        L60:
            if (r3 != r5) goto L67
            android.view.View r3 = r2.T0()
            goto L6b
        L67:
            android.view.View r3 = r2.S0()
        L6b:
            boolean r5 = r3.hasFocusable()
            if (r5 == 0) goto L75
            if (r4 != 0) goto L74
        L73:
            r3 = 0
        L74:
            return r3
        L75:
            return r4
    }

    public final android.view.View T0() {
            r1 = this;
            boolean r0 = r1.u
            if (r0 == 0) goto Lb
            int r0 = r1.v()
            int r0 = r0 + (-1)
            goto Lc
        Lb:
            r0 = 0
        Lc:
            android.view.View r0 = r1.u(r0)
            return r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    @android.annotation.SuppressLint({"UnknownNullness"})
    public final void U(android.view.accessibility.AccessibilityEvent r3) {
            r2 = this;
            super.U(r3)
            int r0 = r2.v()
            if (r0 <= 0) goto L24
            int r0 = r2.v()
            r1 = 0
            android.view.View r0 = r2.O0(r1, r0, r1)
            if (r0 != 0) goto L16
            r0 = -1
            goto L1a
        L16:
            int r0 = androidx.recyclerview.widget.RecyclerView.l.H(r0)
        L1a:
            r3.setFromIndex(r0)
            int r0 = r2.M0()
            r3.setToIndex(r0)
        L24:
            return
    }

    public final boolean U0() {
            r2 = this;
            int r0 = r2.C()
            r1 = 1
            if (r0 != r1) goto L8
            return r1
        L8:
            r0 = 0
            return r0
    }

    public void V0(androidx.recyclerview.widget.RecyclerView.r r11, androidx.recyclerview.widget.RecyclerView.w r12, androidx.recyclerview.widget.LinearLayoutManager.c r13, androidx.recyclerview.widget.LinearLayoutManager.b r14) {
            r10 = this;
            android.view.View r11 = r13.b(r11)
            r12 = 1
            if (r11 != 0) goto La
            r14.b = r12
            return
        La:
            android.view.ViewGroup$LayoutParams r0 = r11.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$m r0 = (androidx.recyclerview.widget.RecyclerView.m) r0
            java.util.List<androidx.recyclerview.widget.RecyclerView$A> r1 = r13.k
            r2 = 0
            r3 = -1
            if (r1 != 0) goto L29
            boolean r1 = r10.u
            int r4 = r13.f
            if (r4 != r3) goto L1e
            r4 = r12
            goto L1f
        L1e:
            r4 = r2
        L1f:
            if (r1 != r4) goto L25
            r10.b(r11, r3, r2)
            goto L3b
        L25:
            r10.b(r11, r2, r2)
            goto L3b
        L29:
            boolean r1 = r10.u
            int r4 = r13.f
            if (r4 != r3) goto L31
            r4 = r12
            goto L32
        L31:
            r4 = r2
        L32:
            if (r1 != r4) goto L38
            r10.b(r11, r3, r12)
            goto L3b
        L38:
            r10.b(r11, r2, r12)
        L3b:
            android.view.ViewGroup$LayoutParams r1 = r11.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$m r1 = (androidx.recyclerview.widget.RecyclerView.m) r1
            androidx.recyclerview.widget.RecyclerView r2 = r10.b
            android.graphics.Rect r2 = r2.M(r11)
            int r4 = r2.left
            int r5 = r2.right
            int r4 = r4 + r5
            int r5 = r2.top
            int r2 = r2.bottom
            int r5 = r5 + r2
            int r2 = r10.n
            int r6 = r10.l
            int r7 = r10.E()
            int r8 = r10.F()
            int r8 = r8 + r7
            int r7 = r1.leftMargin
            int r8 = r8 + r7
            int r7 = r1.rightMargin
            int r8 = r8 + r7
            int r8 = r8 + r4
            int r4 = r1.width
            boolean r7 = r10.d()
            int r2 = androidx.recyclerview.widget.RecyclerView.l.w(r7, r2, r6, r8, r4)
            int r4 = r10.o
            int r6 = r10.m
            int r7 = r10.G()
            int r8 = r10.D()
            int r8 = r8 + r7
            int r7 = r1.topMargin
            int r8 = r8 + r7
            int r7 = r1.bottomMargin
            int r8 = r8 + r7
            int r8 = r8 + r5
            int r5 = r1.height
            boolean r7 = r10.e()
            int r4 = androidx.recyclerview.widget.RecyclerView.l.w(r7, r4, r6, r8, r5)
            boolean r1 = r10.w0(r11, r2, r4, r1)
            if (r1 == 0) goto L96
            r11.measure(r2, r4)
        L96:
            androidx.recyclerview.widget.s r1 = r10.r
            int r1 = r1.c(r11)
            r14.f959a = r1
            int r1 = r10.p
            if (r1 != r12) goto Ld4
            boolean r1 = r10.U0()
            if (r1 == 0) goto Lb8
            int r1 = r10.n
            int r2 = r10.F()
            int r1 = r1 - r2
            androidx.recyclerview.widget.s r2 = r10.r
            int r2 = r2.d(r11)
            int r2 = r1 - r2
            goto Lc3
        Lb8:
            int r2 = r10.E()
            androidx.recyclerview.widget.s r1 = r10.r
            int r1 = r1.d(r11)
            int r1 = r1 + r2
        Lc3:
            int r4 = r13.f
            if (r4 != r3) goto Lce
            int r13 = r13.b
            int r3 = r14.f959a
            int r3 = r13 - r3
            goto Lfa
        Lce:
            int r3 = r13.b
            int r13 = r14.f959a
            int r13 = r13 + r3
            goto Lfa
        Ld4:
            int r1 = r10.G()
            androidx.recyclerview.widget.s r2 = r10.r
            int r2 = r2.d(r11)
            int r2 = r2 + r1
            int r4 = r13.f
            if (r4 != r3) goto Lef
            int r13 = r13.b
            int r3 = r14.f959a
            int r3 = r13 - r3
            r9 = r1
            r1 = r13
            r13 = r2
            r2 = r3
            r3 = r9
            goto Lfa
        Lef:
            int r13 = r13.b
            int r3 = r14.f959a
            int r3 = r3 + r13
            r9 = r2
            r2 = r13
            r13 = r9
            r9 = r3
            r3 = r1
            r1 = r9
        Lfa:
            androidx.recyclerview.widget.RecyclerView.l.N(r11, r2, r3, r1, r13)
            androidx.recyclerview.widget.RecyclerView$A r13 = r0.f975a
            boolean r13 = r13.h()
            if (r13 != 0) goto L10d
            androidx.recyclerview.widget.RecyclerView$A r13 = r0.f975a
            boolean r13 = r13.k()
            if (r13 == 0) goto L10f
        L10d:
            r14.c = r12
        L10f:
            boolean r11 = r11.hasFocusable()
            r14.d = r11
            return
    }

    public void W0(androidx.recyclerview.widget.RecyclerView.r r1, androidx.recyclerview.widget.RecyclerView.w r2, androidx.recyclerview.widget.LinearLayoutManager.a r3, int r4) {
            r0 = this;
            return
    }

    public final void X0(androidx.recyclerview.widget.RecyclerView.r r6, androidx.recyclerview.widget.LinearLayoutManager.c r7) {
            r5 = this;
            boolean r0 = r7.f960a
            if (r0 == 0) goto Lb3
            boolean r0 = r7.l
            if (r0 == 0) goto La
            goto Lb3
        La:
            int r0 = r7.g
            int r1 = r7.i
            int r7 = r7.f
            r2 = -1
            r3 = 0
            if (r7 != r2) goto L68
            int r7 = r5.v()
            if (r0 >= 0) goto L1c
            goto Lb3
        L1c:
            androidx.recyclerview.widget.s r2 = r5.r
            int r2 = r2.f()
            int r2 = r2 - r0
            int r2 = r2 + r1
            boolean r0 = r5.u
            if (r0 == 0) goto L47
            r0 = r3
        L29:
            if (r0 >= r7) goto Lb3
            android.view.View r1 = r5.u(r0)
            androidx.recyclerview.widget.s r4 = r5.r
            int r4 = r4.e(r1)
            if (r4 < r2) goto L43
            androidx.recyclerview.widget.s r4 = r5.r
            int r1 = r4.n(r1)
            if (r1 >= r2) goto L40
            goto L43
        L40:
            int r0 = r0 + 1
            goto L29
        L43:
            r5.Y0(r6, r3, r0)
            return
        L47:
            int r7 = r7 + (-1)
            r0 = r7
        L4a:
            if (r0 < 0) goto Lb3
            android.view.View r1 = r5.u(r0)
            androidx.recyclerview.widget.s r3 = r5.r
            int r3 = r3.e(r1)
            if (r3 < r2) goto L64
            androidx.recyclerview.widget.s r3 = r5.r
            int r1 = r3.n(r1)
            if (r1 >= r2) goto L61
            goto L64
        L61:
            int r0 = r0 + (-1)
            goto L4a
        L64:
            r5.Y0(r6, r7, r0)
            return
        L68:
            if (r0 >= 0) goto L6b
            goto Lb3
        L6b:
            int r0 = r0 - r1
            int r7 = r5.v()
            boolean r1 = r5.u
            if (r1 == 0) goto L95
            int r7 = r7 + (-1)
            r1 = r7
        L77:
            if (r1 < 0) goto Lb3
            android.view.View r2 = r5.u(r1)
            androidx.recyclerview.widget.s r3 = r5.r
            int r3 = r3.b(r2)
            if (r3 > r0) goto L91
            androidx.recyclerview.widget.s r3 = r5.r
            int r2 = r3.m(r2)
            if (r2 <= r0) goto L8e
            goto L91
        L8e:
            int r1 = r1 + (-1)
            goto L77
        L91:
            r5.Y0(r6, r7, r1)
            return
        L95:
            r1 = r3
        L96:
            if (r1 >= r7) goto Lb3
            android.view.View r2 = r5.u(r1)
            androidx.recyclerview.widget.s r4 = r5.r
            int r4 = r4.b(r2)
            if (r4 > r0) goto Lb0
            androidx.recyclerview.widget.s r4 = r5.r
            int r2 = r4.m(r2)
            if (r2 <= r0) goto Lad
            goto Lb0
        Lad:
            int r1 = r1 + 1
            goto L96
        Lb0:
            r5.Y0(r6, r3, r1)
        Lb3:
            return
    }

    public final void Y0(androidx.recyclerview.widget.RecyclerView.r r2, int r3, int r4) {
            r1 = this;
            if (r3 != r4) goto L3
            goto L25
        L3:
            if (r4 <= r3) goto L16
            int r4 = r4 + (-1)
        L7:
            if (r4 < r3) goto L25
            android.view.View r0 = r1.u(r4)
            r1.l0(r4)
            r2.h(r0)
            int r4 = r4 + (-1)
            goto L7
        L16:
            if (r3 <= r4) goto L25
            android.view.View r0 = r1.u(r3)
            r1.l0(r3)
            r2.h(r0)
            int r3 = r3 + (-1)
            goto L16
        L25:
            return
    }

    public final void Z0() {
            r2 = this;
            int r0 = r2.p
            r1 = 1
            if (r0 == r1) goto L12
            boolean r0 = r2.U0()
            if (r0 != 0) goto Lc
            goto L12
        Lc:
            boolean r0 = r2.t
            r0 = r0 ^ r1
            r2.u = r0
            return
        L12:
            boolean r0 = r2.t
            r2.u = r0
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.v.b
    @android.annotation.SuppressLint({"UnknownNullness"})
    public final android.graphics.PointF a(int r4) {
            r3 = this;
            int r0 = r3.v()
            if (r0 != 0) goto L8
            r4 = 0
            return r4
        L8:
            r0 = 0
            android.view.View r1 = r3.u(r0)
            int r1 = androidx.recyclerview.widget.RecyclerView.l.H(r1)
            r2 = 1
            if (r4 >= r1) goto L15
            r0 = r2
        L15:
            boolean r4 = r3.u
            if (r0 == r4) goto L1a
            r2 = -1
        L1a:
            int r4 = r3.p
            r0 = 0
            if (r4 != 0) goto L26
            android.graphics.PointF r4 = new android.graphics.PointF
            float r1 = (float) r2
            r4.<init>(r1, r0)
            return r4
        L26:
            android.graphics.PointF r4 = new android.graphics.PointF
            float r1 = (float) r2
            r4.<init>(r0, r1)
            return r4
    }

    public final int a1(int r6, androidx.recyclerview.widget.RecyclerView.r r7, androidx.recyclerview.widget.RecyclerView.w r8) {
            r5 = this;
            int r0 = r5.v()
            r1 = 0
            if (r0 == 0) goto L39
            if (r6 != 0) goto La
            goto L39
        La:
            r5.I0()
            androidx.recyclerview.widget.LinearLayoutManager$c r0 = r5.q
            r2 = 1
            r0.f960a = r2
            if (r6 <= 0) goto L16
            r0 = r2
            goto L17
        L16:
            r0 = -1
        L17:
            int r3 = java.lang.Math.abs(r6)
            r5.d1(r0, r3, r2, r8)
            androidx.recyclerview.widget.LinearLayoutManager$c r2 = r5.q
            int r4 = r2.g
            int r7 = r5.J0(r7, r2, r8, r1)
            int r7 = r7 + r4
            if (r7 >= 0) goto L2a
            goto L39
        L2a:
            if (r3 <= r7) goto L2e
            int r6 = r0 * r7
        L2e:
            androidx.recyclerview.widget.s r7 = r5.r
            int r8 = -r6
            r7.o(r8)
            androidx.recyclerview.widget.LinearLayoutManager$c r7 = r5.q
            r7.j = r6
            return r6
        L39:
            return r1
    }

    public final void b1(int r3) {
            r2 = this;
            if (r3 == 0) goto L12
            r0 = 1
            if (r3 != r0) goto L6
            goto L12
        L6:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "invalid orientation:"
            java.lang.String r3 = a.C0487z.e(r1, r3)
            r0.<init>(r3)
            throw r0
        L12:
            r0 = 0
            r2.c(r0)
            int r0 = r2.p
            if (r3 != r0) goto L20
            androidx.recyclerview.widget.s r0 = r2.r
            if (r0 != 0) goto L1f
            goto L20
        L1f:
            return
        L20:
            androidx.recyclerview.widget.s r0 = androidx.recyclerview.widget.s.a(r2, r3)
            r2.r = r0
            androidx.recyclerview.widget.LinearLayoutManager$a r1 = r2.A
            r1.f958a = r0
            r2.p = r3
            r2.n0()
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    @android.annotation.SuppressLint({"UnknownNullness"})
    public final void c(java.lang.String r2) {
            r1 = this;
            androidx.recyclerview.widget.LinearLayoutManager$d r0 = r1.z
            if (r0 != 0) goto L7
            super.c(r2)
        L7:
            return
    }

    public void c1(boolean r2) {
            r1 = this;
            r0 = 0
            r1.c(r0)
            boolean r0 = r1.v
            if (r0 != r2) goto L9
            return
        L9:
            r1.v = r2
            r1.n0()
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final boolean d() {
            r1 = this;
            int r0 = r1.p
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    @android.annotation.SuppressLint({"UnknownNullness"})
    public void d0(androidx.recyclerview.widget.RecyclerView.r r18, androidx.recyclerview.widget.RecyclerView.w r19) {
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            androidx.recyclerview.widget.LinearLayoutManager$d r3 = r0.z
            r4 = -1
            if (r3 != 0) goto Lf
            int r3 = r0.x
            if (r3 == r4) goto L19
        Lf:
            int r3 = r2.b()
            if (r3 != 0) goto L19
            r17.i0(r18)
            return
        L19:
            androidx.recyclerview.widget.LinearLayoutManager$d r3 = r0.z
            if (r3 == 0) goto L23
            int r3 = r3.f961a
            if (r3 < 0) goto L23
            r0.x = r3
        L23:
            r0.I0()
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.q
            r5 = 0
            r3.f960a = r5
            r0.Z0()
            androidx.recyclerview.widget.RecyclerView r3 = r0.b
            if (r3 != 0) goto L33
            goto L43
        L33:
            android.view.View r3 = r3.getFocusedChild()
            if (r3 == 0) goto L43
            androidx.recyclerview.widget.b r7 = r0.f971a
            java.util.ArrayList r7 = r7.c
            boolean r7 = r7.contains(r3)
            if (r7 == 0) goto L44
        L43:
            r3 = 0
        L44:
            androidx.recyclerview.widget.LinearLayoutManager$a r7 = r0.A
            boolean r8 = r7.e
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            r10 = 1
            if (r8 == 0) goto L7d
            int r8 = r0.x
            if (r8 != r4) goto L7d
            androidx.recyclerview.widget.LinearLayoutManager$d r8 = r0.z
            if (r8 == 0) goto L56
            goto L7d
        L56:
            if (r3 == 0) goto L239
            androidx.recyclerview.widget.s r8 = r0.r
            int r8 = r8.e(r3)
            androidx.recyclerview.widget.s r11 = r0.r
            int r11 = r11.g()
            if (r8 >= r11) goto L74
            androidx.recyclerview.widget.s r8 = r0.r
            int r8 = r8.b(r3)
            androidx.recyclerview.widget.s r11 = r0.r
            int r11 = r11.k()
            if (r8 > r11) goto L239
        L74:
            int r8 = androidx.recyclerview.widget.RecyclerView.l.H(r3)
            r7.c(r3, r8)
            goto L239
        L7d:
            r7.d()
            boolean r3 = r0.u
            boolean r8 = r0.v
            r3 = r3 ^ r8
            r7.d = r3
            boolean r3 = r2.g
            if (r3 != 0) goto L18a
            int r3 = r0.x
            if (r3 != r4) goto L91
            goto L18a
        L91:
            if (r3 < 0) goto L186
            int r8 = r2.b()
            if (r3 < r8) goto L9b
            goto L186
        L9b:
            int r3 = r0.x
            r7.b = r3
            androidx.recyclerview.widget.LinearLayoutManager$d r8 = r0.z
            if (r8 == 0) goto Lcb
            int r11 = r8.f961a
            if (r11 < 0) goto Lcb
            boolean r3 = r8.c
            r7.d = r3
            if (r3 == 0) goto Lbc
            androidx.recyclerview.widget.s r3 = r0.r
            int r3 = r3.g()
            androidx.recyclerview.widget.LinearLayoutManager$d r8 = r0.z
            int r8 = r8.b
            int r3 = r3 - r8
            r7.c = r3
            goto L237
        Lbc:
            androidx.recyclerview.widget.s r3 = r0.r
            int r3 = r3.k()
            androidx.recyclerview.widget.LinearLayoutManager$d r8 = r0.z
            int r8 = r8.b
            int r3 = r3 + r8
            r7.c = r3
            goto L237
        Lcb:
            int r8 = r0.y
            if (r8 != r9) goto L166
            android.view.View r3 = r0.q(r3)
            if (r3 == 0) goto L143
            androidx.recyclerview.widget.s r8 = r0.r
            int r8 = r8.c(r3)
            androidx.recyclerview.widget.s r11 = r0.r
            int r11 = r11.l()
            if (r8 <= r11) goto Le8
            r7.a()
            goto L237
        Le8:
            androidx.recyclerview.widget.s r8 = r0.r
            int r8 = r8.e(r3)
            androidx.recyclerview.widget.s r11 = r0.r
            int r11 = r11.k()
            int r8 = r8 - r11
            if (r8 >= 0) goto L103
            androidx.recyclerview.widget.s r3 = r0.r
            int r3 = r3.k()
            r7.c = r3
            r7.d = r5
            goto L237
        L103:
            androidx.recyclerview.widget.s r8 = r0.r
            int r8 = r8.g()
            androidx.recyclerview.widget.s r11 = r0.r
            int r11 = r11.b(r3)
            int r8 = r8 - r11
            if (r8 >= 0) goto L11e
            androidx.recyclerview.widget.s r3 = r0.r
            int r3 = r3.g()
            r7.c = r3
            r7.d = r10
            goto L237
        L11e:
            boolean r8 = r7.d
            if (r8 == 0) goto L139
            androidx.recyclerview.widget.s r8 = r0.r
            int r3 = r8.b(r3)
            androidx.recyclerview.widget.s r8 = r0.r
            int r11 = r8.b
            if (r9 != r11) goto L130
            r11 = r5
            goto L137
        L130:
            int r11 = r8.l()
            int r8 = r8.b
            int r11 = r11 - r8
        L137:
            int r11 = r11 + r3
            goto L13f
        L139:
            androidx.recyclerview.widget.s r8 = r0.r
            int r11 = r8.e(r3)
        L13f:
            r7.c = r11
            goto L237
        L143:
            int r3 = r0.v()
            if (r3 <= 0) goto L161
            android.view.View r3 = r0.u(r5)
            int r3 = androidx.recyclerview.widget.RecyclerView.l.H(r3)
            int r8 = r0.x
            if (r8 >= r3) goto L157
            r3 = r10
            goto L158
        L157:
            r3 = r5
        L158:
            boolean r8 = r0.u
            if (r3 != r8) goto L15e
            r3 = r10
            goto L15f
        L15e:
            r3 = r5
        L15f:
            r7.d = r3
        L161:
            r7.a()
            goto L237
        L166:
            boolean r3 = r0.u
            r7.d = r3
            if (r3 == 0) goto L179
            androidx.recyclerview.widget.s r3 = r0.r
            int r3 = r3.g()
            int r8 = r0.y
            int r3 = r3 - r8
            r7.c = r3
            goto L237
        L179:
            androidx.recyclerview.widget.s r3 = r0.r
            int r3 = r3.k()
            int r8 = r0.y
            int r3 = r3 + r8
            r7.c = r3
            goto L237
        L186:
            r0.x = r4
            r0.y = r9
        L18a:
            int r3 = r0.v()
            if (r3 != 0) goto L192
            goto L227
        L192:
            androidx.recyclerview.widget.RecyclerView r3 = r0.b
            if (r3 != 0) goto L197
            goto L1a7
        L197:
            android.view.View r3 = r3.getFocusedChild()
            if (r3 == 0) goto L1a7
            androidx.recyclerview.widget.b r8 = r0.f971a
            java.util.ArrayList r8 = r8.c
            boolean r8 = r8.contains(r3)
            if (r8 == 0) goto L1a8
        L1a7:
            r3 = 0
        L1a8:
            if (r3 == 0) goto L1d5
            android.view.ViewGroup$LayoutParams r8 = r3.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$m r8 = (androidx.recyclerview.widget.RecyclerView.m) r8
            androidx.recyclerview.widget.RecyclerView$A r11 = r8.f975a
            boolean r11 = r11.h()
            if (r11 != 0) goto L1d5
            androidx.recyclerview.widget.RecyclerView$A r11 = r8.f975a
            int r11 = r11.b()
            if (r11 < 0) goto L1d5
            androidx.recyclerview.widget.RecyclerView$A r8 = r8.f975a
            int r8 = r8.b()
            int r11 = r2.b()
            if (r8 >= r11) goto L1d5
            int r8 = androidx.recyclerview.widget.RecyclerView.l.H(r3)
            r7.c(r3, r8)
            goto L237
        L1d5:
            boolean r3 = r0.s
            boolean r8 = r0.v
            if (r3 == r8) goto L1dc
            goto L227
        L1dc:
            boolean r3 = r7.d
            android.view.View r3 = r0.P0(r1, r2, r3, r8)
            if (r3 == 0) goto L227
            int r8 = androidx.recyclerview.widget.RecyclerView.l.H(r3)
            r7.b(r3, r8)
            boolean r8 = r2.g
            if (r8 != 0) goto L237
            boolean r8 = r0.B0()
            if (r8 == 0) goto L237
            androidx.recyclerview.widget.s r8 = r0.r
            int r8 = r8.e(r3)
            androidx.recyclerview.widget.s r11 = r0.r
            int r3 = r11.b(r3)
            androidx.recyclerview.widget.s r11 = r0.r
            int r11 = r11.k()
            androidx.recyclerview.widget.s r12 = r0.r
            int r12 = r12.g()
            if (r3 > r11) goto L213
            if (r8 >= r11) goto L213
            r13 = r10
            goto L214
        L213:
            r13 = r5
        L214:
            if (r8 < r12) goto L21a
            if (r3 <= r12) goto L21a
            r3 = r10
            goto L21b
        L21a:
            r3 = r5
        L21b:
            if (r13 != 0) goto L21f
            if (r3 == 0) goto L237
        L21f:
            boolean r3 = r7.d
            if (r3 == 0) goto L224
            r11 = r12
        L224:
            r7.c = r11
            goto L237
        L227:
            r7.a()
            boolean r3 = r0.v
            if (r3 == 0) goto L234
            int r3 = r2.b()
            int r3 = r3 - r10
            goto L235
        L234:
            r3 = r5
        L235:
            r7.b = r3
        L237:
            r7.e = r10
        L239:
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.q
            int r8 = r3.j
            if (r8 < 0) goto L241
            r8 = r10
            goto L242
        L241:
            r8 = r4
        L242:
            r3.f = r8
            int[] r3 = r0.D
            r3[r5] = r5
            r3[r10] = r5
            r0.C0(r2, r3)
            r8 = r3[r5]
            int r8 = java.lang.Math.max(r5, r8)
            androidx.recyclerview.widget.s r11 = r0.r
            int r11 = r11.k()
            int r11 = r11 + r8
            r3 = r3[r10]
            int r3 = java.lang.Math.max(r5, r3)
            androidx.recyclerview.widget.s r8 = r0.r
            int r8 = r8.h()
            int r8 = r8 + r3
            boolean r3 = r2.g
            if (r3 == 0) goto L2a3
            int r3 = r0.x
            if (r3 == r4) goto L2a3
            int r12 = r0.y
            if (r12 == r9) goto L2a3
            android.view.View r3 = r0.q(r3)
            if (r3 == 0) goto L2a3
            boolean r9 = r0.u
            if (r9 == 0) goto L28e
            androidx.recyclerview.widget.s r9 = r0.r
            int r9 = r9.g()
            androidx.recyclerview.widget.s r12 = r0.r
            int r3 = r12.b(r3)
            int r9 = r9 - r3
            int r3 = r0.y
        L28c:
            int r9 = r9 - r3
            goto L29e
        L28e:
            androidx.recyclerview.widget.s r9 = r0.r
            int r3 = r9.e(r3)
            androidx.recyclerview.widget.s r9 = r0.r
            int r9 = r9.k()
            int r3 = r3 - r9
            int r9 = r0.y
            goto L28c
        L29e:
            if (r9 <= 0) goto L2a2
            int r11 = r11 + r9
            goto L2a3
        L2a2:
            int r8 = r8 - r9
        L2a3:
            boolean r3 = r7.d
            if (r3 == 0) goto L2ad
            boolean r3 = r0.u
            if (r3 == 0) goto L2b1
        L2ab:
            r4 = r10
            goto L2b1
        L2ad:
            boolean r3 = r0.u
            if (r3 == 0) goto L2ab
        L2b1:
            r0.W0(r1, r2, r7, r4)
            r17.p(r18)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.q
            androidx.recyclerview.widget.s r4 = r0.r
            int r4 = r4.i()
            if (r4 != 0) goto L2cb
            androidx.recyclerview.widget.s r4 = r0.r
            int r4 = r4.f()
            if (r4 != 0) goto L2cb
            r4 = r10
            goto L2cc
        L2cb:
            r4 = r5
        L2cc:
            r3.l = r4
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.q
            r3.getClass()
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.q
            r3.i = r5
            boolean r3 = r7.d
            if (r3 == 0) goto L320
            int r3 = r7.b
            int r4 = r7.c
            r0.f1(r3, r4)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.q
            r3.h = r11
            r0.J0(r1, r3, r2, r5)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.q
            int r4 = r3.b
            int r9 = r3.d
            int r3 = r3.c
            if (r3 <= 0) goto L2f4
            int r8 = r8 + r3
        L2f4:
            int r3 = r7.b
            int r11 = r7.c
            r0.e1(r3, r11)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.q
            r3.h = r8
            int r8 = r3.d
            int r11 = r3.e
            int r8 = r8 + r11
            r3.d = r8
            r0.J0(r1, r3, r2, r5)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.q
            int r8 = r3.b
            int r3 = r3.c
            if (r3 <= 0) goto L365
            r0.f1(r9, r4)
            androidx.recyclerview.widget.LinearLayoutManager$c r4 = r0.q
            r4.h = r3
            r0.J0(r1, r4, r2, r5)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.q
            int r4 = r3.b
            goto L365
        L320:
            int r3 = r7.b
            int r4 = r7.c
            r0.e1(r3, r4)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.q
            r3.h = r8
            r0.J0(r1, r3, r2, r5)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.q
            int r8 = r3.b
            int r4 = r3.d
            int r3 = r3.c
            if (r3 <= 0) goto L339
            int r11 = r11 + r3
        L339:
            int r3 = r7.b
            int r9 = r7.c
            r0.f1(r3, r9)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.q
            r3.h = r11
            int r9 = r3.d
            int r11 = r3.e
            int r9 = r9 + r11
            r3.d = r9
            r0.J0(r1, r3, r2, r5)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.q
            int r9 = r3.b
            int r3 = r3.c
            if (r3 <= 0) goto L364
            r0.e1(r4, r8)
            androidx.recyclerview.widget.LinearLayoutManager$c r4 = r0.q
            r4.h = r3
            r0.J0(r1, r4, r2, r5)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.q
            int r8 = r3.b
        L364:
            r4 = r9
        L365:
            int r3 = r0.v()
            if (r3 <= 0) goto L38a
            boolean r3 = r0.u
            boolean r9 = r0.v
            r3 = r3 ^ r9
            if (r3 == 0) goto L37f
            int r3 = r0.Q0(r8, r1, r2, r10)
            int r4 = r4 + r3
            int r8 = r8 + r3
            int r3 = r0.R0(r4, r1, r2, r5)
        L37c:
            int r4 = r4 + r3
            int r8 = r8 + r3
            goto L38a
        L37f:
            int r3 = r0.R0(r4, r1, r2, r10)
            int r4 = r4 + r3
            int r8 = r8 + r3
            int r3 = r0.Q0(r8, r1, r2, r5)
            goto L37c
        L38a:
            boolean r3 = r2.k
            if (r3 == 0) goto L424
            int r3 = r0.v()
            if (r3 == 0) goto L424
            boolean r3 = r2.g
            if (r3 != 0) goto L424
            boolean r3 = r0.B0()
            if (r3 != 0) goto L3a0
            goto L424
        L3a0:
            java.util.List<androidx.recyclerview.widget.RecyclerView$A> r3 = r1.d
            int r9 = r3.size()
            android.view.View r11 = r0.u(r5)
            int r11 = androidx.recyclerview.widget.RecyclerView.l.H(r11)
            r12 = r5
            r13 = r12
            r14 = r13
        L3b1:
            if (r12 >= r9) goto L3e2
            java.lang.Object r15 = r3.get(r12)
            androidx.recyclerview.widget.RecyclerView$A r15 = (androidx.recyclerview.widget.RecyclerView.A) r15
            boolean r16 = r15.h()
            if (r16 == 0) goto L3c0
            goto L3de
        L3c0:
            int r10 = r15.b()
            if (r10 >= r11) goto L3c8
            r10 = 1
            goto L3c9
        L3c8:
            r10 = r5
        L3c9:
            boolean r6 = r0.u
            android.view.View r15 = r15.f963a
            if (r10 == r6) goto L3d7
            androidx.recyclerview.widget.s r6 = r0.r
            int r6 = r6.c(r15)
            int r13 = r13 + r6
            goto L3de
        L3d7:
            androidx.recyclerview.widget.s r6 = r0.r
            int r6 = r6.c(r15)
            int r14 = r14 + r6
        L3de:
            int r12 = r12 + 1
            r10 = 1
            goto L3b1
        L3e2:
            androidx.recyclerview.widget.LinearLayoutManager$c r6 = r0.q
            r6.k = r3
            if (r13 <= 0) goto L402
            android.view.View r3 = r0.T0()
            int r3 = androidx.recyclerview.widget.RecyclerView.l.H(r3)
            r0.f1(r3, r4)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.q
            r3.h = r13
            r3.c = r5
            r4 = 0
            r3.a(r4)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.q
            r0.J0(r1, r3, r2, r5)
        L402:
            if (r14 <= 0) goto L41f
            android.view.View r3 = r0.S0()
            int r3 = androidx.recyclerview.widget.RecyclerView.l.H(r3)
            r0.e1(r3, r8)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.q
            r3.h = r14
            r3.c = r5
            r4 = 0
            r3.a(r4)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.q
            r0.J0(r1, r3, r2, r5)
            goto L420
        L41f:
            r4 = 0
        L420:
            androidx.recyclerview.widget.LinearLayoutManager$c r1 = r0.q
            r1.k = r4
        L424:
            boolean r1 = r2.g
            if (r1 != 0) goto L431
            androidx.recyclerview.widget.s r1 = r0.r
            int r2 = r1.l()
            r1.b = r2
            goto L434
        L431:
            r7.d()
        L434:
            boolean r1 = r0.v
            r0.s = r1
            return
    }

    public final void d1(int r5, int r6, boolean r7, androidx.recyclerview.widget.RecyclerView.w r8) {
            r4 = this;
            androidx.recyclerview.widget.LinearLayoutManager$c r0 = r4.q
            androidx.recyclerview.widget.s r1 = r4.r
            int r1 = r1.i()
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L16
            androidx.recyclerview.widget.s r1 = r4.r
            int r1 = r1.f()
            if (r1 != 0) goto L16
            r1 = r3
            goto L17
        L16:
            r1 = r2
        L17:
            r0.l = r1
            androidx.recyclerview.widget.LinearLayoutManager$c r0 = r4.q
            r0.f = r5
            int[] r0 = r4.D
            r0[r2] = r2
            r0[r3] = r2
            r4.C0(r8, r0)
            r8 = r0[r2]
            int r8 = java.lang.Math.max(r2, r8)
            r0 = r0[r3]
            int r0 = java.lang.Math.max(r2, r0)
            if (r5 != r3) goto L35
            r2 = r3
        L35:
            androidx.recyclerview.widget.LinearLayoutManager$c r5 = r4.q
            if (r2 == 0) goto L3b
            r1 = r0
            goto L3c
        L3b:
            r1 = r8
        L3c:
            r5.h = r1
            if (r2 == 0) goto L41
            goto L42
        L41:
            r8 = r0
        L42:
            r5.i = r8
            r8 = -1
            if (r2 == 0) goto L7e
            androidx.recyclerview.widget.s r0 = r4.r
            int r0 = r0.h()
            int r0 = r0 + r1
            r5.h = r0
            android.view.View r5 = r4.S0()
            androidx.recyclerview.widget.LinearLayoutManager$c r0 = r4.q
            boolean r1 = r4.u
            if (r1 == 0) goto L5b
            r3 = r8
        L5b:
            r0.e = r3
            int r8 = androidx.recyclerview.widget.RecyclerView.l.H(r5)
            androidx.recyclerview.widget.LinearLayoutManager$c r1 = r4.q
            int r2 = r1.e
            int r8 = r8 + r2
            r0.d = r8
            androidx.recyclerview.widget.s r8 = r4.r
            int r8 = r8.b(r5)
            r1.b = r8
            androidx.recyclerview.widget.s r8 = r4.r
            int r5 = r8.b(r5)
            androidx.recyclerview.widget.s r8 = r4.r
            int r8 = r8.g()
            int r5 = r5 - r8
            goto Lba
        L7e:
            android.view.View r5 = r4.T0()
            androidx.recyclerview.widget.LinearLayoutManager$c r0 = r4.q
            int r1 = r0.h
            androidx.recyclerview.widget.s r2 = r4.r
            int r2 = r2.k()
            int r2 = r2 + r1
            r0.h = r2
            androidx.recyclerview.widget.LinearLayoutManager$c r0 = r4.q
            boolean r1 = r4.u
            if (r1 == 0) goto L96
            goto L97
        L96:
            r3 = r8
        L97:
            r0.e = r3
            int r8 = androidx.recyclerview.widget.RecyclerView.l.H(r5)
            androidx.recyclerview.widget.LinearLayoutManager$c r1 = r4.q
            int r2 = r1.e
            int r8 = r8 + r2
            r0.d = r8
            androidx.recyclerview.widget.s r8 = r4.r
            int r8 = r8.e(r5)
            r1.b = r8
            androidx.recyclerview.widget.s r8 = r4.r
            int r5 = r8.e(r5)
            int r5 = -r5
            androidx.recyclerview.widget.s r8 = r4.r
            int r8 = r8.k()
            int r5 = r5 + r8
        Lba:
            androidx.recyclerview.widget.LinearLayoutManager$c r8 = r4.q
            r8.c = r6
            if (r7 == 0) goto Lc3
            int r6 = r6 - r5
            r8.c = r6
        Lc3:
            r8.g = r5
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final boolean e() {
            r2 = this;
            int r0 = r2.p
            r1 = 1
            if (r0 != r1) goto L6
            return r1
        L6:
            r0 = 0
            return r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    @android.annotation.SuppressLint({"UnknownNullness"})
    public void e0(androidx.recyclerview.widget.RecyclerView.w r1) {
            r0 = this;
            r1 = 0
            r0.z = r1
            r1 = -1
            r0.x = r1
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0.y = r1
            androidx.recyclerview.widget.LinearLayoutManager$a r1 = r0.A
            r1.d()
            return
    }

    public final void e1(int r4, int r5) {
            r3 = this;
            androidx.recyclerview.widget.LinearLayoutManager$c r0 = r3.q
            androidx.recyclerview.widget.s r1 = r3.r
            int r1 = r1.g()
            int r1 = r1 - r5
            r0.c = r1
            androidx.recyclerview.widget.LinearLayoutManager$c r0 = r3.q
            boolean r1 = r3.u
            r2 = 1
            if (r1 == 0) goto L14
            r1 = -1
            goto L15
        L14:
            r1 = r2
        L15:
            r0.e = r1
            r0.d = r4
            r0.f = r2
            r0.b = r5
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r0.g = r4
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    @android.annotation.SuppressLint({"UnknownNullness"})
    public final void f0(android.os.Parcelable r3) {
            r2 = this;
            boolean r0 = r3 instanceof androidx.recyclerview.widget.LinearLayoutManager.d
            if (r0 == 0) goto L12
            androidx.recyclerview.widget.LinearLayoutManager$d r3 = (androidx.recyclerview.widget.LinearLayoutManager.d) r3
            r2.z = r3
            int r0 = r2.x
            r1 = -1
            if (r0 == r1) goto Lf
            r3.f961a = r1
        Lf:
            r2.n0()
        L12:
            return
    }

    public final void f1(int r3, int r4) {
            r2 = this;
            androidx.recyclerview.widget.LinearLayoutManager$c r0 = r2.q
            androidx.recyclerview.widget.s r1 = r2.r
            int r1 = r1.k()
            int r1 = r4 - r1
            r0.c = r1
            androidx.recyclerview.widget.LinearLayoutManager$c r0 = r2.q
            r0.d = r3
            boolean r3 = r2.u
            r1 = -1
            if (r3 == 0) goto L17
            r3 = 1
            goto L18
        L17:
            r3 = r1
        L18:
            r0.e = r3
            r0.f = r1
            r0.b = r4
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r0.g = r3
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    @android.annotation.SuppressLint({"UnknownNullness"})
    public final android.os.Parcelable g0() {
            r4 = this;
            androidx.recyclerview.widget.LinearLayoutManager$d r0 = r4.z
            if (r0 == 0) goto L16
            androidx.recyclerview.widget.LinearLayoutManager$d r1 = new androidx.recyclerview.widget.LinearLayoutManager$d
            r1.<init>()
            int r2 = r0.f961a
            r1.f961a = r2
            int r2 = r0.b
            r1.b = r2
            boolean r0 = r0.c
            r1.c = r0
            return r1
        L16:
            androidx.recyclerview.widget.LinearLayoutManager$d r0 = new androidx.recyclerview.widget.LinearLayoutManager$d
            r0.<init>()
            int r1 = r4.v()
            if (r1 <= 0) goto L61
            r4.I0()
            boolean r1 = r4.s
            boolean r2 = r4.u
            r1 = r1 ^ r2
            r0.c = r1
            if (r1 == 0) goto L47
            android.view.View r1 = r4.S0()
            androidx.recyclerview.widget.s r2 = r4.r
            int r2 = r2.g()
            androidx.recyclerview.widget.s r3 = r4.r
            int r3 = r3.b(r1)
            int r2 = r2 - r3
            r0.b = r2
            int r1 = androidx.recyclerview.widget.RecyclerView.l.H(r1)
            r0.f961a = r1
            return r0
        L47:
            android.view.View r1 = r4.T0()
            int r2 = androidx.recyclerview.widget.RecyclerView.l.H(r1)
            r0.f961a = r2
            androidx.recyclerview.widget.s r2 = r4.r
            int r1 = r2.e(r1)
            androidx.recyclerview.widget.s r2 = r4.r
            int r2 = r2.k()
            int r1 = r1 - r2
            r0.b = r1
            return r0
        L61:
            r1 = -1
            r0.f961a = r1
            return r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    @android.annotation.SuppressLint({"UnknownNullness"})
    public final void h(int r2, int r3, androidx.recyclerview.widget.RecyclerView.w r4, androidx.recyclerview.widget.m.b r5) {
            r1 = this;
            int r0 = r1.p
            if (r0 != 0) goto L5
            goto L6
        L5:
            r2 = r3
        L6:
            int r3 = r1.v()
            if (r3 == 0) goto L24
            if (r2 != 0) goto Lf
            goto L24
        Lf:
            r1.I0()
            r3 = 1
            if (r2 <= 0) goto L17
            r0 = r3
            goto L18
        L17:
            r0 = -1
        L18:
            int r2 = java.lang.Math.abs(r2)
            r1.d1(r0, r2, r3, r4)
            androidx.recyclerview.widget.LinearLayoutManager$c r2 = r1.q
            r1.D0(r4, r2, r5)
        L24:
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    @android.annotation.SuppressLint({"UnknownNullness"})
    public final void i(int r6, androidx.recyclerview.widget.m.b r7) {
            r5 = this;
            androidx.recyclerview.widget.LinearLayoutManager$d r0 = r5.z
            r1 = -1
            r2 = 0
            if (r0 == 0) goto Ld
            int r3 = r0.f961a
            if (r3 < 0) goto Ld
            boolean r0 = r0.c
            goto L1c
        Ld:
            r5.Z0()
            boolean r0 = r5.u
            int r3 = r5.x
            if (r3 != r1) goto L1c
            if (r0 == 0) goto L1b
            int r3 = r6 + (-1)
            goto L1c
        L1b:
            r3 = r2
        L1c:
            if (r0 == 0) goto L1f
            goto L20
        L1f:
            r1 = 1
        L20:
            r0 = r2
        L21:
            int r4 = r5.C
            if (r0 >= r4) goto L30
            if (r3 < 0) goto L30
            if (r3 >= r6) goto L30
            r7.a(r3, r2)
            int r3 = r3 + r1
            int r0 = r0 + 1
            goto L21
        L30:
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    @android.annotation.SuppressLint({"UnknownNullness"})
    public final int j(androidx.recyclerview.widget.RecyclerView.w r1) {
            r0 = this;
            int r1 = r0.E0(r1)
            return r1
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    @android.annotation.SuppressLint({"UnknownNullness"})
    public int k(androidx.recyclerview.widget.RecyclerView.w r1) {
            r0 = this;
            int r1 = r0.F0(r1)
            return r1
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    @android.annotation.SuppressLint({"UnknownNullness"})
    public int l(androidx.recyclerview.widget.RecyclerView.w r1) {
            r0 = this;
            int r1 = r0.G0(r1)
            return r1
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    @android.annotation.SuppressLint({"UnknownNullness"})
    public final int m(androidx.recyclerview.widget.RecyclerView.w r1) {
            r0 = this;
            int r1 = r0.E0(r1)
            return r1
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    @android.annotation.SuppressLint({"UnknownNullness"})
    public int n(androidx.recyclerview.widget.RecyclerView.w r1) {
            r0 = this;
            int r1 = r0.F0(r1)
            return r1
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    @android.annotation.SuppressLint({"UnknownNullness"})
    public int o(androidx.recyclerview.widget.RecyclerView.w r1) {
            r0 = this;
            int r1 = r0.G0(r1)
            return r1
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    @android.annotation.SuppressLint({"UnknownNullness"})
    public int o0(int r3, androidx.recyclerview.widget.RecyclerView.r r4, androidx.recyclerview.widget.RecyclerView.w r5) {
            r2 = this;
            int r0 = r2.p
            r1 = 1
            if (r0 != r1) goto L7
            r3 = 0
            return r3
        L7:
            int r3 = r2.a1(r3, r4, r5)
            return r3
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void p0(int r2) {
            r1 = this;
            r1.x = r2
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1.y = r2
            androidx.recyclerview.widget.LinearLayoutManager$d r2 = r1.z
            if (r2 == 0) goto Ld
            r0 = -1
            r2.f961a = r0
        Ld:
            r1.n0()
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    @android.annotation.SuppressLint({"UnknownNullness"})
    public final android.view.View q(int r3) {
            r2 = this;
            int r0 = r2.v()
            if (r0 != 0) goto L8
            r3 = 0
            return r3
        L8:
            r1 = 0
            android.view.View r1 = r2.u(r1)
            int r1 = androidx.recyclerview.widget.RecyclerView.l.H(r1)
            int r1 = r3 - r1
            if (r1 < 0) goto L22
            if (r1 >= r0) goto L22
            android.view.View r0 = r2.u(r1)
            int r1 = androidx.recyclerview.widget.RecyclerView.l.H(r0)
            if (r1 != r3) goto L22
            return r0
        L22:
            android.view.View r3 = super.q(r3)
            return r3
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    @android.annotation.SuppressLint({"UnknownNullness"})
    public int q0(int r2, androidx.recyclerview.widget.RecyclerView.r r3, androidx.recyclerview.widget.RecyclerView.w r4) {
            r1 = this;
            int r0 = r1.p
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            int r2 = r1.a1(r2, r3, r4)
            return r2
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    @android.annotation.SuppressLint({"UnknownNullness"})
    public androidx.recyclerview.widget.RecyclerView.m r() {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView$m r0 = new androidx.recyclerview.widget.RecyclerView$m
            r1 = -2
            r0.<init>(r1, r1)
            return r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final boolean x0() {
            r5 = this;
            int r0 = r5.m
            r1 = 0
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 == r2) goto L27
            int r0 = r5.l
            if (r0 == r2) goto L27
            int r0 = r5.v()
            r2 = r1
        L10:
            if (r2 >= r0) goto L27
            android.view.View r3 = r5.u(r2)
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            int r4 = r3.width
            if (r4 >= 0) goto L24
            int r3 = r3.height
            if (r3 >= 0) goto L24
            r0 = 1
            return r0
        L24:
            int r2 = r2 + 1
            goto L10
        L27:
            return r1
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    @android.annotation.SuppressLint({"UnknownNullness"})
    public void z0(androidx.recyclerview.widget.RecyclerView r2, int r3) {
            r1 = this;
            androidx.recyclerview.widget.o r0 = new androidx.recyclerview.widget.o
            android.content.Context r2 = r2.getContext()
            r0.<init>(r2)
            r0.f980a = r3
            r1.A0(r0)
            return
    }
}
