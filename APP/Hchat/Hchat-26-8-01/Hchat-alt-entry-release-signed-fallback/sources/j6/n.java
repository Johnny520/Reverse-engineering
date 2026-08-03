package j6;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends java.util.AbstractMap implements java.io.Serializable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final a9.h f6751o = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.util.Comparator f6752g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f6753h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public j6.m f6754i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f6755j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f6756k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final j6.m f6757l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public j6.l f6758m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public j6.l f6759n;

    static {
            a9.h r0 = new a9.h
            r1 = 21
            r0.<init>(r1)
            j6.n.f6751o = r0
            return
    }

    public n(boolean r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f6755j = r0
            r1.f6756k = r0
            a9.h r0 = j6.n.f6751o
            r1.f6752g = r0
            r1.f6753h = r2
            j6.m r0 = new j6.m
            r0.<init>(r2)
            r1.f6757l = r0
            return
    }

    public final j6.m a(java.lang.Object r13, boolean r14) {
            r12 = this;
            j6.m r0 = r12.f6754i
            r1 = 0
            a9.h r2 = j6.n.f6751o
            java.util.Comparator r3 = r12.f6752g
            if (r0 == 0) goto L2d
            if (r3 != r2) goto Lf
            r4 = r13
            java.lang.Comparable r4 = (java.lang.Comparable) r4
            goto L10
        Lf:
            r4 = r1
        L10:
            java.lang.Object r5 = r0.f6747l
            if (r4 == 0) goto L19
            int r5 = r4.compareTo(r5)
            goto L1d
        L19:
            int r5 = r3.compare(r13, r5)
        L1d:
            if (r5 != 0) goto L20
            return r0
        L20:
            if (r5 >= 0) goto L25
            j6.m r6 = r0.f6743h
            goto L27
        L25:
            j6.m r6 = r0.f6744i
        L27:
            if (r6 != 0) goto L2b
        L29:
            r8 = r0
            goto L2f
        L2b:
            r0 = r6
            goto L10
        L2d:
            r5 = 0
            goto L29
        L2f:
            if (r14 != 0) goto L32
            return r1
        L32:
            r14 = 1
            j6.m r10 = r12.f6757l
            if (r8 != 0) goto L5f
            if (r3 != r2) goto L52
            boolean r0 = r13 instanceof java.lang.Comparable
            if (r0 == 0) goto L3e
            goto L52
        L3e:
            java.lang.ClassCastException r14 = new java.lang.ClassCastException
            java.lang.Class r13 = r13.getClass()
            java.lang.String r13 = r13.getName()
            java.lang.String r0 = " is not Comparable"
            java.lang.String r13 = r13.concat(r0)
            r14.<init>(r13)
            throw r14
        L52:
            j6.m r6 = new j6.m
            boolean r7 = r12.f6753h
            j6.m r11 = r10.f6746k
            r9 = r13
            r6.<init>(r7, r8, r9, r10, r11)
            r12.f6754i = r6
            goto L73
        L5f:
            r9 = r13
            j6.m r6 = new j6.m
            boolean r7 = r12.f6753h
            j6.m r11 = r10.f6746k
            r6.<init>(r7, r8, r9, r10, r11)
            if (r5 >= 0) goto L6e
            r8.f6743h = r6
            goto L70
        L6e:
            r8.f6744i = r6
        L70:
            r12.c(r8, r14)
        L73:
            int r13 = r12.f6755j
            int r13 = r13 + r14
            r12.f6755j = r13
            int r13 = r12.f6756k
            int r13 = r13 + r14
            r12.f6756k = r13
            return r6
    }

    public final void c(j6.m r8, boolean r9) {
            r7 = this;
        L0:
            if (r8 == 0) goto L79
            j6.m r0 = r8.f6743h
            j6.m r1 = r8.f6744i
            r2 = 0
            if (r0 == 0) goto Lc
            int r3 = r0.f6750o
            goto Ld
        Lc:
            r3 = r2
        Ld:
            if (r1 == 0) goto L12
            int r4 = r1.f6750o
            goto L13
        L12:
            r4 = r2
        L13:
            int r5 = r3 - r4
            r6 = -2
            if (r5 != r6) goto L3c
            j6.m r0 = r1.f6743h
            j6.m r3 = r1.f6744i
            if (r3 == 0) goto L21
            int r3 = r3.f6750o
            goto L22
        L21:
            r3 = r2
        L22:
            if (r0 == 0) goto L26
            int r2 = r0.f6750o
        L26:
            int r2 = r2 - r3
            r0 = -1
            if (r2 == r0) goto L36
            if (r2 != 0) goto L2f
            if (r9 != 0) goto L2f
            goto L36
        L2f:
            r7.g(r1)
            r7.f(r8)
            goto L39
        L36:
            r7.f(r8)
        L39:
            if (r9 == 0) goto L76
            goto L79
        L3c:
            r1 = 2
            r6 = 1
            if (r5 != r1) goto L63
            j6.m r1 = r0.f6743h
            j6.m r3 = r0.f6744i
            if (r3 == 0) goto L49
            int r3 = r3.f6750o
            goto L4a
        L49:
            r3 = r2
        L4a:
            if (r1 == 0) goto L4e
            int r2 = r1.f6750o
        L4e:
            int r2 = r2 - r3
            if (r2 == r6) goto L5d
            if (r2 != 0) goto L56
            if (r9 != 0) goto L56
            goto L5d
        L56:
            r7.f(r0)
            r7.g(r8)
            goto L60
        L5d:
            r7.g(r8)
        L60:
            if (r9 == 0) goto L76
            goto L79
        L63:
            if (r5 != 0) goto L6c
            int r3 = r3 + 1
            r8.f6750o = r3
            if (r9 == 0) goto L76
            goto L79
        L6c:
            int r0 = java.lang.Math.max(r3, r4)
            int r0 = r0 + r6
            r8.f6750o = r0
            if (r9 != 0) goto L76
            goto L79
        L76:
            j6.m r8 = r8.f6742g
            goto L0
        L79:
            return
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
            r1 = this;
            r0 = 0
            r1.f6754i = r0
            r0 = 0
            r1.f6755j = r0
            int r0 = r1.f6756k
            int r0 = r0 + 1
            r1.f6756k = r0
            j6.m r0 = r1.f6757l
            r0.f6746k = r0
            r0.f6745j = r0
            return
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(java.lang.Object r3) {
            r2 = this;
            r0 = 0
            r1 = 0
            if (r3 == 0) goto L8
            j6.m r1 = r2.a(r3, r0)     // Catch: java.lang.ClassCastException -> L8
        L8:
            if (r1 == 0) goto Lc
            r3 = 1
            return r3
        Lc:
            return r0
    }

    public final void d(j6.m r7, boolean r8) {
            r6 = this;
            if (r8 == 0) goto Lc
            j6.m r8 = r7.f6746k
            j6.m r0 = r7.f6745j
            r8.f6745j = r0
            j6.m r0 = r7.f6745j
            r0.f6746k = r8
        Lc:
            j6.m r8 = r7.f6743h
            j6.m r0 = r7.f6744i
            j6.m r1 = r7.f6742g
            r2 = 0
            r3 = 0
            if (r8 == 0) goto L5c
            if (r0 == 0) goto L5c
            int r1 = r8.f6750o
            int r4 = r0.f6750o
            if (r1 <= r4) goto L28
            j6.m r0 = r8.f6744i
        L20:
            r5 = r0
            r0 = r8
            r8 = r5
            if (r8 == 0) goto L33
            j6.m r0 = r8.f6744i
            goto L20
        L28:
            j6.m r8 = r0.f6743h
        L2a:
            r5 = r0
            r0 = r8
            r8 = r5
            if (r0 == 0) goto L32
            j6.m r8 = r0.f6743h
            goto L2a
        L32:
            r0 = r8
        L33:
            r6.d(r0, r2)
            j6.m r8 = r7.f6743h
            if (r8 == 0) goto L43
            int r1 = r8.f6750o
            r0.f6743h = r8
            r8.f6742g = r0
            r7.f6743h = r3
            goto L44
        L43:
            r1 = r2
        L44:
            j6.m r8 = r7.f6744i
            if (r8 == 0) goto L50
            int r2 = r8.f6750o
            r0.f6744i = r8
            r8.f6742g = r0
            r7.f6744i = r3
        L50:
            int r8 = java.lang.Math.max(r1, r2)
            int r8 = r8 + 1
            r0.f6750o = r8
            r6.e(r7, r0)
            return
        L5c:
            if (r8 == 0) goto L64
            r6.e(r7, r8)
            r7.f6743h = r3
            goto L6f
        L64:
            if (r0 == 0) goto L6c
            r6.e(r7, r0)
            r7.f6744i = r3
            goto L6f
        L6c:
            r6.e(r7, r3)
        L6f:
            r6.c(r1, r2)
            int r7 = r6.f6755j
            int r7 = r7 + (-1)
            r6.f6755j = r7
            int r7 = r6.f6756k
            int r7 = r7 + 1
            r6.f6756k = r7
            return
    }

    public final void e(j6.m r3, j6.m r4) {
            r2 = this;
            j6.m r0 = r3.f6742g
            r1 = 0
            r3.f6742g = r1
            if (r4 == 0) goto L9
            r4.f6742g = r0
        L9:
            if (r0 == 0) goto L15
            j6.m r1 = r0.f6743h
            if (r1 != r3) goto L12
            r0.f6743h = r4
            return
        L12:
            r0.f6744i = r4
            return
        L15:
            r2.f6754i = r4
            return
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set entrySet() {
            r2 = this;
            j6.l r0 = r2.f6758m
            if (r0 != 0) goto Lc
            j6.l r0 = new j6.l
            r1 = 0
            r0.<init>(r2, r1)
            r2.f6758m = r0
        Lc:
            return r0
    }

    public final void f(j6.m r6) {
            r5 = this;
            j6.m r0 = r6.f6743h
            j6.m r1 = r6.f6744i
            j6.m r2 = r1.f6743h
            j6.m r3 = r1.f6744i
            r6.f6744i = r2
            if (r2 == 0) goto Le
            r2.f6742g = r6
        Le:
            r5.e(r6, r1)
            r1.f6743h = r6
            r6.f6742g = r1
            r4 = 0
            if (r0 == 0) goto L1b
            int r0 = r0.f6750o
            goto L1c
        L1b:
            r0 = r4
        L1c:
            if (r2 == 0) goto L21
            int r2 = r2.f6750o
            goto L22
        L21:
            r2 = r4
        L22:
            int r0 = java.lang.Math.max(r0, r2)
            int r0 = r0 + 1
            r6.f6750o = r0
            if (r3 == 0) goto L2e
            int r4 = r3.f6750o
        L2e:
            int r6 = java.lang.Math.max(r0, r4)
            int r6 = r6 + 1
            r1.f6750o = r6
            return
    }

    public final void g(j6.m r6) {
            r5 = this;
            j6.m r0 = r6.f6743h
            j6.m r1 = r6.f6744i
            j6.m r2 = r0.f6743h
            j6.m r3 = r0.f6744i
            r6.f6743h = r3
            if (r3 == 0) goto Le
            r3.f6742g = r6
        Le:
            r5.e(r6, r0)
            r0.f6744i = r6
            r6.f6742g = r0
            r4 = 0
            if (r1 == 0) goto L1b
            int r1 = r1.f6750o
            goto L1c
        L1b:
            r1 = r4
        L1c:
            if (r3 == 0) goto L21
            int r3 = r3.f6750o
            goto L22
        L21:
            r3 = r4
        L22:
            int r1 = java.lang.Math.max(r1, r3)
            int r1 = r1 + 1
            r6.f6750o = r1
            if (r2 == 0) goto L2e
            int r4 = r2.f6750o
        L2e:
            int r6 = java.lang.Math.max(r1, r4)
            int r6 = r6 + 1
            r0.f6750o = r6
            return
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.lang.Object get(java.lang.Object r3) {
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L9
            r1 = 0
            j6.m r3 = r2.a(r3, r1)     // Catch: java.lang.ClassCastException -> L9
            goto La
        L9:
            r3 = r0
        La:
            if (r3 == 0) goto Lf
            java.lang.Object r3 = r3.f6749n
            return r3
        Lf:
            return r0
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set keySet() {
            r2 = this;
            j6.l r0 = r2.f6759n
            if (r0 != 0) goto Lc
            j6.l r0 = new j6.l
            r1 = 1
            r0.<init>(r2, r1)
            r2.f6759n = r0
        Lc:
            return r0
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.lang.Object put(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            if (r2 == 0) goto L1a
            if (r3 != 0) goto L10
            boolean r0 = r1.f6753h
            if (r0 == 0) goto L9
            goto L10
        L9:
            java.lang.String r2 = "value == null"
            bsh.j.c(r2)
        Le:
            r2 = 0
            return r2
        L10:
            r0 = 1
            j6.m r2 = r1.a(r2, r0)
            java.lang.Object r0 = r2.f6749n
            r2.f6749n = r3
            return r0
        L1a:
            java.lang.String r2 = "key == null"
            bsh.j.c(r2)
            goto Le
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.lang.Object remove(java.lang.Object r3) {
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L9
            r1 = 0
            j6.m r3 = r2.a(r3, r1)     // Catch: java.lang.ClassCastException -> L9
            goto La
        L9:
            r3 = r0
        La:
            if (r3 == 0) goto L10
            r1 = 1
            r2.d(r3, r1)
        L10:
            if (r3 == 0) goto L15
            java.lang.Object r3 = r3.f6749n
            return r3
        L15:
            return r0
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
            r1 = this;
            int r0 = r1.f6755j
            return r0
    }
}
