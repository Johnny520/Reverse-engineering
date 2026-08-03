package z7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class c implements java.util.List, java.util.Set {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final java.lang.Object[] f22582n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final z7.b f22583o = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public java.lang.Object[] f22584g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public e9.a f22585h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f22586i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f22587j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f22588k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f22589l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public m.a f22590m;

    static {
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            z7.c.f22582n = r1
            z7.b r1 = new z7.b
            r1.<init>(r0)
            z7.c.f22583o = r1
            return
    }

    public c(int r1) {
            r0 = this;
            r0.<init>()
            if (r1 != 0) goto L8
            java.lang.Object[] r1 = z7.c.f22582n
            goto La
        L8:
            java.lang.Object[] r1 = new java.lang.Object[r1]
        La:
            r0.f22584g = r1
            r1 = 0
            r0.f22586i = r1
            return
    }

    public c(java.lang.Object[] r2) {
            r1 = this;
            r1.<init>()
            int r0 = r2.length
            if (r0 != 0) goto L8
            java.lang.Object[] r2 = z7.c.f22582n
        L8:
            r1.f22584g = r2
            int r2 = r2.length
            r1.f22586i = r2
            return
    }

    public static void a(int r2, java.lang.Object[] r3, java.lang.Object[] r4) {
            r0 = 0
        L1:
            if (r0 >= r2) goto La
            r1 = r3[r0]
            r4[r0] = r1
            int r0 = r0 + 1
            goto L1
        La:
            return
    }

    public static java.lang.Object[] e(int r0) {
            if (r0 != 0) goto L5
            java.lang.Object[] r0 = z7.c.f22582n
            return r0
        L5:
            java.lang.Object[] r0 = new java.lang.Object[r0]
            return r0
    }

    @Override // java.util.List
    public void add(int r3, java.lang.Object r4) {
            r2 = this;
            if (r4 != 0) goto L3
            return
        L3:
            boolean r0 = r2.f22589l
            r1 = 1
            r2.f22589l = r1
            r2.j(r3, r1)
            java.lang.Object[] r1 = r2.f22584g
            r1[r3] = r4
            m.a r3 = r2.f22590m
            if (r3 == 0) goto L15
            k7.a r4 = (k7.a) r4
        L15:
            r2.f22589l = r0
            r3 = 0
            r2.f22588k = r3
            return
    }

    @Override // java.util.List, java.util.Collection, java.util.Set
    public boolean add(java.lang.Object r9) {
            r8 = this;
            r0 = 0
            if (r9 != 0) goto L4
            return r0
        L4:
            boolean r1 = r8.f22589l
            r2 = 1
            r8.f22589l = r2
            java.lang.Object[] r3 = r8.f22584g
            int r3 = r3.length
            int r4 = r8.f22586i
            int r3 = r3 - r4
            if (r3 <= 0) goto L12
            goto L3e
        L12:
            if (r4 != 0) goto L16
        L14:
            r3 = r2
            goto L3b
        L16:
            int r3 = r8.f22587j
            r5 = 8192(0x2000, float:1.148E-41)
            if (r3 < r5) goto L1d
            goto L3b
        L1d:
            if (r3 != 0) goto L20
            r3 = r2
        L20:
            int r6 = r3 << 1
            r7 = 32
            if (r6 <= r7) goto L28
            int r6 = r3 << 2
        L28:
            if (r6 <= r7) goto L30
            r3 = 256(0x100, float:3.59E-43)
            if (r6 >= r3) goto L30
            int r6 = r6 << 1
        L30:
            if (r6 <= r5) goto L34
            r3 = r5
            goto L35
        L34:
            r3 = r6
        L35:
            r8.f22587j = r3
            r5 = 4
            if (r4 >= r5) goto L3b
            goto L14
        L3b:
            r8.d(r3)
        L3e:
            int r3 = r8.f22586i
            java.lang.Object[] r4 = r8.f22584g
            r4[r3] = r9
            int r3 = r3 + r2
            r8.f22586i = r3
            r8.f22589l = r1
            r8.f22588k = r0
            m.a r0 = r8.f22590m
            if (r0 == 0) goto L51
            k7.a r9 = (k7.a) r9
        L51:
            return r2
    }

    @Override // java.util.List
    public final boolean addAll(int r8, java.util.Collection r9) {
            r7 = this;
            if (r9 != 0) goto L3
            goto L43
        L3:
            int r0 = r9.size()
            if (r0 != 0) goto La
            goto L43
        La:
            boolean r1 = r7.f22589l
            r2 = 1
            r7.f22589l = r2
            r7.j(r8, r0)
            java.lang.Object[] r3 = r7.f22584g
            java.util.Iterator r9 = r9.iterator()
            r4 = r8
        L19:
            boolean r5 = r9.hasNext()
            if (r5 == 0) goto L37
            java.lang.Object r5 = r9.next()
            if (r5 == 0) goto L19
            boolean r6 = r7.c(r5)
            if (r6 == 0) goto L2c
            goto L19
        L2c:
            r3[r4] = r5
            m.a r6 = r7.f22590m
            if (r6 == 0) goto L34
            k7.a r5 = (k7.a) r5
        L34:
            int r4 = r4 + 1
            goto L19
        L37:
            int r8 = r4 - r8
            int r8 = r0 - r8
            r7.i(r4, r8)
            r7.f22589l = r1
            if (r8 >= r0) goto L43
            return r2
        L43:
            r8 = 0
            return r8
    }

    @Override // java.util.List, java.util.Collection, java.util.Set
    public boolean addAll(java.util.Collection r8) {
            r7 = this;
            r0 = 0
            if (r8 != 0) goto L4
            return r0
        L4:
            int r1 = r7.size()
            r2 = 1
            if (r1 != 0) goto L22
            java.lang.Object[] r1 = r8.toArray()
            int r8 = r8.size()
            java.lang.Object[] r3 = e(r8)
            a(r8, r1, r3)
            int r8 = r3.length
            r7.f22584g = r3
            r7.f22586i = r8
            r7.f22588k = r0
            return r2
        L22:
            int r1 = r8.size()
            r7.f22589l = r2
            java.util.Iterator r8 = r8.iterator()
            r3 = r0
        L2d:
            boolean r4 = r8.hasNext()
            if (r4 == 0) goto L4a
            java.lang.Object r4 = r8.next()
            java.lang.Object[] r5 = r7.f22584g
            int r5 = r5.length
            int r6 = r7.f22586i
            int r5 = r5 - r6
            if (r5 != 0) goto L42
            r7.d(r1)
        L42:
            boolean r4 = r7.add(r4)
            if (r4 == 0) goto L2d
            r3 = r2
            goto L2d
        L4a:
            r7.f22589l = r0
            return r3
    }

    public final java.util.Iterator b() {
            r5 = this;
            int r0 = r5.size()
            boolean r1 = r5.isEmpty()
            if (r1 == 0) goto Lb
            goto L29
        Lb:
            java.lang.Object[] r1 = r5.f22584g
            java.lang.Object r1 = r1.clone()
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            int r2 = r1.length
            if (r2 != 0) goto L17
            goto L29
        L17:
            int r2 = r1.length
            r3 = 0
        L19:
            if (r3 >= r2) goto L29
            r4 = r1[r3]
            if (r4 == 0) goto L26
            z7.d r2 = new z7.d
            r3 = 0
            r2.<init>(r1, r0, r3)
            return r2
        L26:
            int r3 = r3 + 1
            goto L19
        L29:
            z7.h r0 = z7.h.f22606g
            return r0
    }

    public final boolean c(java.lang.Object r3) {
            r2 = this;
            r0 = 1
            r1 = 0
            int r3 = r2.f(r3, r0, r1)
            if (r3 < 0) goto L9
            return r0
        L9:
            return r1
    }

    @Override // java.util.List, java.util.Collection, java.util.Set
    public void clear() {
            r5 = this;
            int r0 = r5.f22586i
            r1 = 0
            r5.f22586i = r1
            java.lang.Object[] r2 = r5.f22584g
            java.lang.Object[] r3 = z7.c.f22582n
            r5.f22584g = r3
            r5.f22587j = r1
            r5.f22589l = r1
            r3 = r1
        L10:
            if (r3 >= r0) goto L18
            r4 = 0
            r2[r3] = r4
            int r3 = r3 + 1
            goto L10
        L18:
            r5.f22588k = r1
            return
    }

    @Override // java.util.List, java.util.Collection, java.util.Set
    public boolean contains(java.lang.Object r3) {
            r2 = this;
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            boolean r1 = r2.c(r3)
            if (r1 != 0) goto L12
            int r3 = r2.f(r3, r0, r0)
            if (r3 < 0) goto L11
            goto L12
        L11:
            return r0
        L12:
            r3 = 1
            return r3
    }

    @Override // java.util.List, java.util.Collection, java.util.Set
    public boolean containsAll(java.util.Collection r3) {
            r2 = this;
            java.util.Iterator r0 = r3.iterator()
        L4:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            boolean r1 = r2.contains(r1)
            if (r1 != 0) goto L4
            r3 = 0
            return r3
        L16:
            boolean r3 = r3.isEmpty()
            r3 = r3 ^ 1
            return r3
    }

    public void d(int r4) {
            r3 = this;
            if (r4 > 0) goto L3
            goto Lc
        L3:
            java.lang.Object[] r0 = r3.f22584g
            int r0 = r0.length
            int r1 = r3.f22586i
            int r0 = r0 - r1
            int r4 = r4 - r0
            if (r4 > 0) goto Ld
        Lc:
            return
        Ld:
            int r4 = r4 + r1
            java.lang.Object[] r4 = e(r4)
            java.lang.Object[] r0 = r3.f22584g
            int r2 = r0.length
            if (r2 == 0) goto L20
            if (r1 != 0) goto L1a
            goto L20
        L1a:
            a(r1, r0, r4)
            r3.f22584g = r4
            return
        L20:
            r3.f22584g = r4
            return
    }

    @Override // java.util.List, java.util.Collection, java.util.Set
    public boolean equals(java.lang.Object r6) {
            r5 = this;
            if (r5 != r6) goto L3
            goto L3d
        L3:
            r0 = 0
            if (r6 == 0) goto L3f
            java.lang.Class r1 = r5.getClass()
            java.lang.Class r2 = r6.getClass()
            if (r1 == r2) goto L11
            goto L3f
        L11:
            z7.c r6 = (z7.c) r6
            int r1 = r5.size()
            int r2 = r6.size()
            if (r1 != r2) goto L3f
            int r2 = r5.hashCode()
            int r3 = r6.hashCode()
            if (r2 == r3) goto L28
            goto L3f
        L28:
            r2 = r0
        L29:
            if (r2 >= r1) goto L3d
            java.lang.Object[] r3 = r5.f22584g
            r3 = r3[r2]
            java.lang.Object[] r4 = r6.f22584g
            r4 = r4[r2]
            boolean r3 = java.util.Objects.equals(r3, r4)
            if (r3 != 0) goto L3a
            goto L3f
        L3a:
            int r2 = r2 + 1
            goto L29
        L3d:
            r6 = 1
            return r6
        L3f:
            return r0
    }

    public final int f(java.lang.Object r6, boolean r7, int r8) {
            r5 = this;
            if (r6 != 0) goto L3
            goto L35
        L3:
            r0 = 0
            if (r8 >= 0) goto L7
            r8 = r0
        L7:
            int r1 = r5.f22586i
            if (r1 != 0) goto Lc
            goto L35
        Lc:
            java.lang.Object[] r2 = r5.f22584g
            r3 = r8
        Lf:
            if (r3 >= r1) goto L1c
            r4 = r2[r3]
            if (r4 != 0) goto L16
            goto L19
        L16:
            if (r6 != r4) goto L19
            return r3
        L19:
            int r3 = r3 + 1
            goto Lf
        L1c:
            if (r7 == 0) goto L1f
            goto L35
        L1f:
            if (r8 >= r1) goto L35
            r7 = r2[r8]
            if (r7 != 0) goto L27
            r7 = r0
            goto L2f
        L27:
            if (r6 != r7) goto L2b
            r7 = 1
            goto L2f
        L2b:
            boolean r7 = r6.equals(r7)
        L2f:
            if (r7 == 0) goto L32
            return r8
        L32:
            int r8 = r8 + 1
            goto L1f
        L35:
            r6 = -1
            return r6
    }

    public final void g(java.lang.Object r3) {
            r2 = this;
            m.a r0 = r2.f22590m
            if (r0 == 0) goto L1b
            k7.a r3 = (k7.a) r3
            java.lang.Object r0 = r0.f8069h
            o7.b r0 = (o7.b) r0
            if (r3 == 0) goto L1b
            k7.a r1 = r3.f7389h
            if (r1 != r0) goto L1b
            r0.W(r3)
            r0 = -1
            r3.H(r0)
            r0 = 0
            r3.J(r0)
        L1b:
            return
    }

    @Override // java.util.List
    public final java.lang.Object get(int r2) {
            r1 = this;
            java.lang.Object[] r0 = r1.f22584g
            r2 = r0[r2]
            return r2
    }

    public void h(int r7, boolean r8) {
            r6 = this;
            int r0 = r6.f22586i
            if (r7 != r0) goto L5
            return
        L5:
            r1 = 0
            r2 = 1
            if (r7 >= r0) goto L2f
            if (r8 == 0) goto L2a
            boolean r8 = r6.f22589l
            r6.f22589l = r2
            int r0 = r0 - r2
            int r7 = r7 - r2
            java.lang.Object[] r3 = r6.f22584g
        L13:
            if (r0 <= r7) goto L25
            r4 = r3[r0]
            int r5 = r6.f22586i
            int r5 = r5 - r2
            r6.f22586i = r5
            r5 = 0
            r3[r0] = r5
            r6.g(r4)
            int r0 = r0 + (-1)
            goto L13
        L25:
            r6.f22589l = r8
            r6.f22588k = r1
            return
        L2a:
            r6.f22586i = r7
            r6.f22588k = r1
            return
        L2f:
            boolean r8 = r6.f22589l
            r6.f22589l = r2
            int r2 = r7 - r0
            r6.d(r2)
            r6.f22586i = r7
            java.lang.Object[] r7 = r6.f22584g
            e9.a r3 = r6.f22585h
            if (r3 != 0) goto L41
            goto L5e
        L41:
            int r2 = r2 + r0
        L42:
            if (r0 >= r2) goto L5e
            java.lang.Object r4 = r3.f2387i
            o7.b r4 = (o7.b) r4
            java.lang.Object r5 = r3.f2386h
            k7.f r5 = (k7.f) r5
            k7.a r5 = r5.n()
            if (r5 != 0) goto L53
            goto L59
        L53:
            r5.H(r0)
            r5.J(r4)
        L59:
            r7[r0] = r5
            int r0 = r0 + 1
            goto L42
        L5e:
            r6.f22589l = r8
            r6.f22588k = r1
            return
    }

    @Override // java.util.List, java.util.Collection, java.util.Set
    public int hashCode() {
            r6 = this;
            int r0 = r6.f22588k
            if (r0 == 0) goto L5
            return r0
        L5:
            int r0 = r6.size()
            r1 = 0
            if (r0 != 0) goto Ld
            goto L26
        Ld:
            java.lang.Object[] r2 = r6.f22584g
            r3 = 1
            r4 = r1
        L11:
            if (r4 >= r0) goto L23
            r5 = r2[r4]
            if (r5 != 0) goto L19
            r5 = r1
            goto L1d
        L19:
            int r5 = r5.hashCode()
        L1d:
            int r3 = r3 * 31
            int r3 = r3 + r5
            int r4 = r4 + 1
            goto L11
        L23:
            r6.f22588k = r3
            r1 = r3
        L26:
            r6.f22588k = r1
            return r1
    }

    public final void i(int r6, int r7) {
            r5 = this;
            if (r7 == 0) goto L2b
            if (r6 >= 0) goto L5
            goto L2b
        L5:
            boolean r0 = r5.f22589l
            r1 = 1
            r5.f22589l = r1
            java.lang.Object[] r1 = r5.f22584g
            int r2 = r5.f22586i
            int r3 = r2 - r7
        L10:
            if (r6 >= r3) goto L1b
            int r4 = r6 + r7
            r4 = r1[r4]
            r1[r6] = r4
            int r6 = r6 + 1
            goto L10
        L1b:
            r6 = r3
        L1c:
            if (r6 >= r2) goto L24
            r7 = 0
            r1[r6] = r7
            int r6 = r6 + 1
            goto L1c
        L24:
            r5.f22586i = r3
            r5.f22589l = r0
            r6 = 0
            r5.f22588k = r6
        L2b:
            return
    }

    @Override // java.util.List
    public final int indexOf(java.lang.Object r2) {
            r1 = this;
            r0 = 0
            int r2 = r1.f(r2, r0, r0)
            return r2
    }

    @Override // java.util.List, java.util.Collection, java.util.Set
    public boolean isEmpty() {
            r1 = this;
            int r0 = r1.size()
            if (r0 != 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable, java.util.Set
    public java.util.Iterator iterator() {
            r1 = this;
            int r0 = r1.size()
            if (r0 != 0) goto L9
            z7.h r0 = z7.h.f22606g
            return r0
        L9:
            z7.e r0 = new z7.e
            r0.<init>(r1)
            return r0
    }

    public final void j(int r7, int r8) {
            r6 = this;
            boolean r0 = r6.f22589l
            r1 = 1
            r6.f22589l = r1
            r6.d(r8)
            java.lang.Object[] r1 = r6.f22584g
            int r2 = r6.f22586i
            int r3 = r2 + (-1)
        Le:
            if (r3 < r7) goto L19
            int r4 = r3 + r8
            r5 = r1[r3]
            r1[r4] = r5
            int r3 = r3 + (-1)
            goto Le
        L19:
            int r2 = r2 + r8
            r6.f22586i = r2
            int r8 = r8 + r7
        L1d:
            if (r7 >= r8) goto L25
            r2 = 0
            r1[r7] = r2
            int r7 = r7 + 1
            goto L1d
        L25:
            r6.f22589l = r0
            r7 = 0
            r6.f22588k = r7
            return
    }

    public final boolean k(z7.t r5) {
            r4 = this;
            boolean r0 = r4.f22589l
            r1 = 0
            if (r0 == 0) goto L6
            goto L23
        L6:
            int r0 = r4.size()
            r2 = 2
            if (r0 >= r2) goto Le
            goto L23
        Le:
            z7.a r2 = new z7.a
            java.lang.Object[] r3 = r4.f22584g
            r2.<init>(r3, r0, r5)
            r2.f6780a = r1
            r5 = 1
            int r0 = r0 - r5
            r2.u(r1, r0)
            boolean r0 = r2.f6780a
            if (r0 == 0) goto L23
            r4.f22588k = r1
            return r5
        L23:
            return r1
    }

    public final z7.c l(int r4, int r5) {
            r3 = this;
            int r0 = r4 + r5
            int r1 = r3.size()
            if (r0 <= r1) goto L9
            r0 = r1
        L9:
            if (r4 != 0) goto Le
            if (r0 != r1) goto Le
            return r3
        Le:
            java.lang.Object[] r5 = e(r5)
            java.lang.Object[] r1 = r3.f22584g
        L14:
            if (r4 >= r0) goto L1d
            r2 = r1[r4]
            r5[r4] = r2
            int r4 = r4 + 1
            goto L14
        L1d:
            z7.c r4 = new z7.c
            r4.<init>(r5)
            return r4
    }

    @Override // java.util.List
    public final int lastIndexOf(java.lang.Object r6) {
            r5 = this;
            r0 = -1
            if (r6 != 0) goto L4
            return r0
        L4:
            java.lang.Object[] r1 = r5.f22584g
            int r2 = r5.f22586i
            r3 = 0
        L9:
            if (r3 >= r2) goto L1a
            r4 = r1[r3]
            if (r4 != 0) goto L10
            goto L17
        L10:
            boolean r4 = r6.equals(r4)
            if (r4 == 0) goto L17
            r0 = r3
        L17:
            int r3 = r3 + 1
            goto L9
        L1a:
            return r0
    }

    @Override // java.util.List
    public final java.util.ListIterator listIterator() {
            r3 = this;
            int r0 = r3.size()
            r1 = 0
            if (r0 > 0) goto L15
            z7.n r0 = z7.n.f22619j
            if (r0 != 0) goto L14
            z7.n r0 = new z7.n
            z7.i r2 = z7.i.f22607g
            r0.<init>(r1, r2)
            z7.n.f22619j = r0
        L14:
            return r0
        L15:
            z7.n r0 = new z7.n
            r0.<init>(r1, r3)
            return r0
    }

    @Override // java.util.List
    public final java.util.ListIterator listIterator(int r3) {
            r2 = this;
            int r0 = r2.size()
            int r0 = r0 - r3
            if (r0 > 0) goto L16
            z7.n r3 = z7.n.f22619j
            if (r3 != 0) goto L15
            z7.n r3 = new z7.n
            z7.i r0 = z7.i.f22607g
            r1 = 0
            r3.<init>(r1, r0)
            z7.n.f22619j = r3
        L15:
            return r3
        L16:
            z7.n r0 = new z7.n
            r0.<init>(r3, r2)
            return r0
    }

    public void m() {
            r3 = this;
            boolean r0 = r3.f22589l
            if (r0 != 0) goto L2a
            java.lang.Object[] r0 = r3.f22584g
            int r1 = r0.length
            int r2 = r3.f22586i
            int r1 = r1 - r2
            if (r1 != 0) goto Ld
            goto L2a
        Ld:
            int r1 = r0.length
            if (r2 < r1) goto L11
            goto L21
        L11:
            if (r2 != 0) goto L19
            r0 = 0
            java.lang.Object[] r0 = e(r0)
            goto L21
        L19:
            java.lang.Object[] r1 = e(r2)
            a(r2, r0, r1)
            r0 = r1
        L21:
            r3.f22584g = r0
            int r0 = r3.f22586i
            int r0 = r0 / 4
            r3.f22587j = r0
            return
        L2a:
            int r0 = r3.f22587j
            if (r0 != 0) goto L36
            int r0 = r3.size()
            int r0 = r0 / 3
            r3.f22587j = r0
        L36:
            return
    }

    @Override // java.util.List
    public java.lang.Object remove(int r3) {
            r2 = this;
            java.lang.Object[] r0 = r2.f22584g
            r0 = r0[r3]
            r1 = 1
            r2.i(r3, r1)
            r2.g(r0)
            return r0
    }

    @Override // java.util.List, java.util.Collection, java.util.Set
    public boolean remove(java.lang.Object r3) {
            r2 = this;
            r0 = 0
            int r3 = r2.f(r3, r0, r0)
            if (r3 >= 0) goto L9
            r3 = 0
            goto L13
        L9:
            java.lang.Object[] r1 = r2.f22584g
            r1 = r1[r3]
            r2.remove(r3)
            r2.f22588k = r0
            r3 = r1
        L13:
            if (r3 == 0) goto L17
            r3 = 1
            return r3
        L17:
            return r0
    }

    @Override // java.util.List, java.util.Collection, java.util.Set
    public boolean removeAll(java.util.Collection r9) {
            r8 = this;
            java.lang.Object[] r0 = r8.f22584g
            r1 = 0
            if (r0 != 0) goto L6
            goto L2e
        L6:
            int r2 = r8.f22586i
            if (r2 != 0) goto Lb
            goto L2e
        Lb:
            r3 = r1
            r4 = r3
        Ld:
            if (r3 >= r2) goto L2c
            r5 = r0[r3]
            java.util.Iterator r6 = r9.iterator()
        L15:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L29
            java.lang.Object r7 = r6.next()
            if (r5 != r7) goto L15
            r6 = 0
            r0[r3] = r6
            r8.g(r5)
            int r4 = r4 + 1
        L29:
            int r3 = r3 + 1
            goto Ld
        L2c:
            if (r4 != 0) goto L2f
        L2e:
            return r1
        L2f:
            java.lang.Object[] r9 = r8.f22584g
            if (r9 != r0) goto L58
            int r9 = r8.f22586i
            int r9 = r9 - r4
            r8.f22586i = r9
            r3 = 1
            if (r9 != 0) goto L40
            java.lang.Object[] r9 = z7.c.f22582n
            r8.f22584g = r9
            return r3
        L40:
            java.lang.Object[] r9 = e(r9)
            r4 = r1
        L45:
            if (r1 >= r2) goto L53
            r5 = r0[r1]
            if (r5 != 0) goto L4c
            goto L50
        L4c:
            r9[r4] = r5
            int r4 = r4 + 1
        L50:
            int r1 = r1 + 1
            goto L45
        L53:
            r8.f22586i = r4
            r8.f22584g = r9
            return r3
        L58:
            java.util.ConcurrentModificationException r9 = new java.util.ConcurrentModificationException
            r9.<init>()
            throw r9
    }

    @Override // java.util.Collection
    public final boolean removeIf(java.util.function.Predicate r8) {
            r7 = this;
            java.lang.Object[] r0 = r7.f22584g
            r1 = 0
            if (r0 != 0) goto L6
            goto L24
        L6:
            int r2 = r7.f22586i
            if (r2 != 0) goto Lb
            goto L24
        Lb:
            r3 = r1
            r4 = r3
        Ld:
            if (r3 >= r2) goto L22
            r5 = r0[r3]
            boolean r6 = r8.test(r5)
            if (r6 == 0) goto L1f
            r6 = 0
            r0[r3] = r6
            r7.g(r5)
            int r4 = r4 + 1
        L1f:
            int r3 = r3 + 1
            goto Ld
        L22:
            if (r4 != 0) goto L25
        L24:
            return r1
        L25:
            java.lang.Object[] r8 = r7.f22584g
            if (r8 != r0) goto L4e
            int r8 = r7.f22586i
            int r8 = r8 - r4
            r7.f22586i = r8
            r3 = 1
            if (r8 != 0) goto L36
            java.lang.Object[] r8 = z7.c.f22582n
            r7.f22584g = r8
            return r3
        L36:
            java.lang.Object[] r8 = e(r8)
            r4 = r1
        L3b:
            if (r1 >= r2) goto L49
            r5 = r0[r1]
            if (r5 != 0) goto L42
            goto L46
        L42:
            r8[r4] = r5
            int r4 = r4 + 1
        L46:
            int r1 = r1 + 1
            goto L3b
        L49:
            r7.f22586i = r4
            r7.f22584g = r8
            return r3
        L4e:
            java.util.ConcurrentModificationException r8 = new java.util.ConcurrentModificationException
            r8.<init>()
            throw r8
    }

    @Override // java.util.List, java.util.Collection, java.util.Set
    public final boolean retainAll(java.util.Collection r2) {
            r1 = this;
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r0 = "Method not implemented"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.List
    public java.lang.Object set(int r4, java.lang.Object r5) {
            r3 = this;
            if (r5 == 0) goto L1c
            if (r4 >= 0) goto L5
            goto L1c
        L5:
            int r0 = r4 + 1
            int r1 = r3.size()
            r2 = 0
            if (r0 <= r1) goto L11
            r3.h(r0, r2)
        L11:
            java.lang.Object[] r0 = r3.f22584g
            r1 = r0[r4]
            r0[r4] = r5
            if (r5 == r1) goto L1b
            r3.f22588k = r2
        L1b:
            return r1
        L1c:
            r4 = 0
            return r4
    }

    @Override // java.util.List, java.util.Collection, java.util.Set
    public int size() {
            r1 = this;
            int r0 = r1.f22586i
            return r0
    }

    @Override // java.util.List
    public void sort(java.util.Comparator r4) {
            r3 = this;
            boolean r0 = r3.f22589l
            if (r0 == 0) goto L5
            goto L22
        L5:
            int r0 = r3.size()
            r1 = 2
            if (r0 >= r1) goto Ld
            goto L22
        Ld:
            j8.f r1 = new j8.f
            java.lang.Object[] r2 = r3.f22584g
            r1.<init>(r2, r0, r4)
            r4 = 0
            r1.f6780a = r4
            int r0 = r0 + (-1)
            r1.u(r4, r0)
            boolean r0 = r1.f6780a
            if (r0 == 0) goto L22
            r3.f22588k = r4
        L22:
            return
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Spliterator spliterator() {
            r2 = this;
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Not implemented"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ java.util.List subList(int r1, int r2) {
            r0 = this;
            z7.c r1 = r0.l(r1, r2)
            return r1
    }

    @Override // java.util.List, java.util.Collection, java.util.Set
    public java.lang.Object[] toArray() {
            r3 = this;
            java.lang.Object[] r0 = r3.f22584g
            int r1 = r3.size()
            int r2 = r0.length
            if (r1 < r2) goto La
            goto L1a
        La:
            if (r1 != 0) goto L12
            r0 = 0
            java.lang.Object[] r0 = e(r0)
            goto L1a
        L12:
            java.lang.Object[] r2 = e(r1)
            a(r1, r0, r2)
            r0 = r2
        L1a:
            java.lang.Object[] r1 = r3.f22584g
            if (r0 != r1) goto L24
            java.lang.Object r0 = r0.clone()
            java.lang.Object[] r0 = (java.lang.Object[]) r0
        L24:
            return r0
    }

    @Override // java.util.List, java.util.Collection, java.util.Set
    public final java.lang.Object[] toArray(java.lang.Object[] r4) {
            r3 = this;
            int r0 = r3.size()
            if (r0 != 0) goto L7
            return r4
        L7:
            java.lang.Object[] r1 = r3.f22584g
            int r2 = r4.length
            if (r2 == 0) goto L12
            if (r2 > r0) goto L12
            a(r2, r1, r4)
            return r4
        L12:
            java.lang.Class r4 = r4.getClass()
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r1, r0, r4)
            return r4
    }

    public final java.lang.String toString() {
            r3 = this;
            int r0 = r3.size()
            if (r0 != 0) goto L9
            java.lang.String r0 = "EMPTY"
            return r0
        L9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r3.size()
            r0.append(r1)
            java.lang.String r1 = "{"
            r0.append(r1)
            r1 = 0
            java.lang.Object[] r2 = r3.f22584g
            r1 = r2[r1]
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
