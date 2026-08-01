package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class zw0 implements java.util.Map, java.io.Serializable, p000.po0 {

    /* JADX INFO: renamed from: σ */
    public static final p000.zw0 f13327 = null;

    /* JADX INFO: renamed from: ε */
    public java.lang.Object[] f13328;

    /* JADX INFO: renamed from: ζ */
    public java.lang.Object[] f13329;

    /* JADX INFO: renamed from: η */
    public int[] f13330;

    /* JADX INFO: renamed from: θ */
    public int[] f13331;

    /* JADX INFO: renamed from: ι */
    public int f13332;

    /* JADX INFO: renamed from: κ */
    public int f13333;

    /* JADX INFO: renamed from: λ */
    public int f13334;

    /* JADX INFO: renamed from: μ */
    public int f13335;

    /* JADX INFO: renamed from: ν */
    public int f13336;

    /* JADX INFO: renamed from: ξ */
    public p000.ax0 f13337;

    /* JADX INFO: renamed from: ο */
    public p000.bx0 f13338;

    /* JADX INFO: renamed from: π */
    public p000.ax0 f13339;

    /* JADX INFO: renamed from: ρ */
    public boolean f13340;

    static {
            zw0 r0 = new zw0
            r1 = 0
            r0.<init>(r1)
            r1 = 1
            r0.f13340 = r1
            p000.zw0.f13327 = r0
            return
    }

    public zw0() {
            r1 = this;
            r0 = 8
            r1.<init>(r0)
            return
    }

    public zw0(int r5) {
            r4 = this;
            if (r5 < 0) goto L2c
            java.lang.Object[] r0 = new java.lang.Object[r5]
            int[] r1 = new int[r5]
            r2 = 1
            if (r5 >= r2) goto La
            r5 = r2
        La:
            int r5 = r5 * 3
            int r5 = java.lang.Integer.highestOneBit(r5)
            int[] r3 = new int[r5]
            r4.<init>()
            r4.f13328 = r0
            r0 = 0
            r4.f13329 = r0
            r4.f13330 = r1
            r4.f13331 = r3
            r0 = 2
            r4.f13332 = r0
            r0 = 0
            r4.f13333 = r0
            int r5 = java.lang.Integer.numberOfLeadingZeros(r5)
            int r5 = r5 + r2
            r4.f13334 = r5
            return
        L2c:
            java.lang.String r4 = "capacity must be non-negative."
            p000.C1080.m7275(r4)
            r4 = 0
            throw r4
    }

    @Override // java.util.Map
    public final void clear() {
            r6 = this;
            r6.m7242()
            int r0 = r6.f13333
            int r0 = r0 + (-1)
            r1 = 0
            if (r0 < 0) goto L1d
            r2 = r1
        Lb:
            int[] r3 = r6.f13330
            r4 = r3[r2]
            if (r4 < 0) goto L18
            int[] r5 = r6.f13331
            r5[r4] = r1
            r4 = -1
            r3[r2] = r4
        L18:
            if (r2 == r0) goto L1d
            int r2 = r2 + 1
            goto Lb
        L1d:
            java.lang.Object[] r0 = r6.f13328
            int r2 = r6.f13333
            p000.AbstractC0073bd.m868(r0, r1, r2)
            java.lang.Object[] r0 = r6.f13329
            if (r0 == 0) goto L2d
            int r2 = r6.f13333
            p000.AbstractC0073bd.m868(r0, r1, r2)
        L2d:
            r6.f13336 = r1
            r6.f13333 = r1
            int r0 = r6.f13335
            int r0 = r0 + 1
            r6.f13335 = r0
            return
    }

    @Override // java.util.Map
    public final boolean containsKey(java.lang.Object r1) {
            r0 = this;
            int r0 = r0.m7246(r1)
            if (r0 < 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @Override // java.util.Map
    public final boolean containsValue(java.lang.Object r1) {
            r0 = this;
            int r0 = r0.m7247(r1)
            if (r0 < 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @Override // java.util.Map
    public final java.util.Set entrySet() {
            r2 = this;
            ax0 r0 = r2.f13339
            if (r0 != 0) goto Lc
            ax0 r0 = new ax0
            r1 = 0
            r0.<init>(r2, r1)
            r2.f13339 = r0
        Lc:
            return r0
    }

    @Override // java.util.Map
    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r3 == r2) goto L1f
            boolean r0 = r3 instanceof java.util.Map
            if (r0 == 0) goto L1d
            java.util.Map r3 = (java.util.Map) r3
            int r0 = r2.f13336
            int r1 = r3.size()
            if (r0 != r1) goto L1d
            java.util.Set r3 = r3.entrySet()
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r2 = r2.m7244(r3)
            if (r2 == 0) goto L1d
            goto L1f
        L1d:
            r2 = 0
            return r2
        L1f:
            r2 = 1
            return r2
    }

    @Override // java.util.Map
    public final java.lang.Object get(java.lang.Object r1) {
            r0 = this;
            int r1 = r0.m7246(r1)
            if (r1 >= 0) goto L8
            r0 = 0
            return r0
        L8:
            java.lang.Object[] r0 = r0.f13329
            r0.getClass()
            r0 = r0[r1]
            return r0
    }

    @Override // java.util.Map
    public final int hashCode() {
            r5 = this;
            ww0 r0 = new ww0
            r1 = 0
            r0.<init>(r5, r1)
            r5 = 0
            r1 = r5
        L8:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L46
            int r2 = r0.f12857
            java.lang.Object r3 = r0.f12860
            zw0 r3 = (p000.zw0) r3
            int r4 = r3.f13333
            if (r2 >= r4) goto L41
            int r4 = r2 + 1
            r0.f12857 = r4
            r0.f12858 = r2
            java.lang.Object[] r4 = r3.f13328
            r2 = r4[r2]
            if (r2 == 0) goto L29
            int r2 = r2.hashCode()
            goto L2a
        L29:
            r2 = r5
        L2a:
            java.lang.Object[] r3 = r3.f13329
            r3.getClass()
            int r4 = r0.f12858
            r3 = r3[r4]
            if (r3 == 0) goto L3a
            int r3 = r3.hashCode()
            goto L3b
        L3a:
            r3 = r5
        L3b:
            r2 = r2 ^ r3
            r0.m7042()
            int r1 = r1 + r2
            goto L8
        L41:
            p000.C1080.m7277()
            r5 = 0
            return r5
        L46:
            return r1
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
            r0 = this;
            int r0 = r0.f13336
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    @Override // java.util.Map
    public final java.util.Set keySet() {
            r2 = this;
            ax0 r0 = r2.f13337
            if (r0 != 0) goto Lc
            ax0 r0 = new ax0
            r1 = 1
            r0.<init>(r2, r1)
            r2.f13337 = r0
        Lc:
            return r0
    }

    @Override // java.util.Map
    public final java.lang.Object put(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            r1.m7242()
            int r2 = r1.m7240(r2)
            java.lang.Object[] r0 = r1.f13329
            if (r0 == 0) goto Lc
            goto L15
        Lc:
            java.lang.Object[] r0 = r1.f13328
            int r0 = r0.length
            if (r0 < 0) goto L23
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1.f13329 = r0
        L15:
            if (r2 >= 0) goto L1f
            int r1 = -r2
            int r1 = r1 + (-1)
            r2 = r0[r1]
            r0[r1] = r3
            return r2
        L1f:
            r0[r2] = r3
        L21:
            r1 = 0
            return r1
        L23:
            java.lang.String r1 = "capacity must be non-negative."
            p000.C1080.m7275(r1)
            goto L21
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map r6) {
            r5 = this;
            r6.getClass()
            r5.m7242()
            java.util.Set r6 = r6.entrySet()
            java.util.Collection r6 = (java.util.Collection) r6
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L13
            goto L64
        L13:
            int r0 = r6.size()
            r5.m7245(r0)
            java.util.Iterator r6 = r6.iterator()
        L1e:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L64
            java.lang.Object r0 = r6.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            int r1 = r5.m7240(r1)
            java.lang.Object[] r2 = r5.f13329
            if (r2 == 0) goto L37
            goto L40
        L37:
            java.lang.Object[] r2 = r5.f13328
            int r2 = r2.length
            if (r2 < 0) goto L5f
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r5.f13329 = r2
        L40:
            if (r1 < 0) goto L49
            java.lang.Object r0 = r0.getValue()
            r2[r1] = r0
            goto L1e
        L49:
            int r1 = -r1
            int r1 = r1 + (-1)
            r3 = r2[r1]
            java.lang.Object r4 = r0.getValue()
            boolean r3 = p000.ln0.m3626(r4, r3)
            if (r3 != 0) goto L1e
            java.lang.Object r0 = r0.getValue()
            r2[r1] = r0
            goto L1e
        L5f:
            java.lang.String r5 = "capacity must be non-negative."
            p000.C1080.m7275(r5)
        L64:
            return
    }

    @Override // java.util.Map
    public final java.lang.Object remove(java.lang.Object r2) {
            r1 = this;
            r1.m7242()
            int r2 = r1.m7246(r2)
            if (r2 >= 0) goto Lb
            r1 = 0
            return r1
        Lb:
            java.lang.Object[] r0 = r1.f13329
            r0.getClass()
            r0 = r0[r2]
            r1.m7250(r2)
            return r0
    }

    @Override // java.util.Map
    public final int size() {
            r0 = this;
            int r0 = r0.f13336
            return r0
    }

    public final java.lang.String toString() {
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r6.f13336
            int r1 = r1 * 3
            int r1 = r1 + 2
            r0.<init>(r1)
            java.lang.String r1 = "{"
            r0.append(r1)
            ww0 r1 = new ww0
            r2 = 0
            r1.<init>(r6, r2)
            r6 = 0
        L17:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L65
            if (r6 <= 0) goto L24
            java.lang.String r2 = ", "
            r0.append(r2)
        L24:
            int r2 = r1.f12857
            java.lang.Object r3 = r1.f12860
            zw0 r3 = (p000.zw0) r3
            int r4 = r3.f13333
            if (r2 >= r4) goto L60
            int r4 = r2 + 1
            r1.f12857 = r4
            r1.f12858 = r2
            java.lang.Object[] r4 = r3.f13328
            r2 = r4[r2]
            java.lang.String r4 = "(this Map)"
            if (r2 != r3) goto L40
            r0.append(r4)
            goto L43
        L40:
            r0.append(r2)
        L43:
            r2 = 61
            r0.append(r2)
            java.lang.Object[] r2 = r3.f13329
            r2.getClass()
            int r5 = r1.f12858
            r2 = r2[r5]
            if (r2 != r3) goto L57
            r0.append(r4)
            goto L5a
        L57:
            r0.append(r2)
        L5a:
            r1.m7042()
            int r6 = r6 + 1
            goto L17
        L60:
            p000.C1080.m7277()
            r6 = 0
            return r6
        L65:
            java.lang.String r6 = "}"
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            return r6
    }

    @Override // java.util.Map
    public final java.util.Collection values() {
            r2 = this;
            bx0 r0 = r2.f13338
            if (r0 != 0) goto Lc
            bx0 r0 = new bx0
            r1 = 0
            r0.<init>(r1, r2)
            r2.f13338 = r0
        Lc:
            return r0
    }

    /* JADX INFO: renamed from: α */
    public final int m7240(java.lang.Object r8) {
            r7 = this;
            r7.m7242()
        L3:
            int r0 = r7.m7248(r8)
            int r1 = r7.f13332
            int r1 = r1 * 2
            int[] r2 = r7.f13331
            int r2 = r2.length
            int r2 = r2 / 2
            if (r1 <= r2) goto L13
            r1 = r2
        L13:
            r2 = 0
        L14:
            int[] r3 = r7.f13331
            r4 = r3[r0]
            r5 = 1
            if (r4 > 0) goto L43
            int r1 = r7.f13333
            java.lang.Object[] r4 = r7.f13328
            int r6 = r4.length
            if (r1 < r6) goto L26
            r7.m7245(r5)
            goto L3
        L26:
            int r6 = r1 + 1
            r7.f13333 = r6
            r4[r1] = r8
            int[] r8 = r7.f13330
            r8[r1] = r0
            r3[r0] = r6
            int r8 = r7.f13336
            int r8 = r8 + r5
            r7.f13336 = r8
            int r8 = r7.f13335
            int r8 = r8 + r5
            r7.f13335 = r8
            int r8 = r7.f13332
            if (r2 <= r8) goto L42
            r7.f13332 = r2
        L42:
            return r1
        L43:
            java.lang.Object[] r3 = r7.f13328
            int r6 = r4 + (-1)
            r3 = r3[r6]
            boolean r3 = p000.ln0.m3626(r3, r8)
            if (r3 == 0) goto L51
            int r7 = -r4
            return r7
        L51:
            int r2 = r2 + 1
            if (r2 <= r1) goto L5e
            int[] r0 = r7.f13331
            int r0 = r0.length
            int r0 = r0 * 2
            r7.m7249(r0)
            goto L3
        L5e:
            int r3 = r0 + (-1)
            if (r0 != 0) goto L67
            int[] r0 = r7.f13331
            int r0 = r0.length
            int r0 = r0 - r5
            goto L14
        L67:
            r0 = r3
            goto L14
    }

    /* JADX INFO: renamed from: β */
    public final p000.zw0 m7241() {
            r1 = this;
            r1.m7242()
            r0 = 1
            r1.f13340 = r0
            int r0 = r1.f13336
            if (r0 <= 0) goto Lb
            return r1
        Lb:
            zw0 r1 = p000.zw0.f13327
            r1.getClass()
            return r1
    }

    /* JADX INFO: renamed from: γ */
    public final void m7242() {
            r0 = this;
            boolean r0 = r0.f13340
            if (r0 != 0) goto L5
            return
        L5:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    /* JADX INFO: renamed from: δ */
    public final void m7243(boolean r8) {
            r7 = this;
            java.lang.Object[] r0 = r7.f13329
            r1 = 0
            r2 = r1
        L4:
            int r3 = r7.f13333
            if (r1 >= r3) goto L29
            int[] r3 = r7.f13330
            r4 = r3[r1]
            if (r4 < 0) goto L26
            java.lang.Object[] r5 = r7.f13328
            r6 = r5[r1]
            r5[r2] = r6
            if (r0 == 0) goto L1a
            r5 = r0[r1]
            r0[r2] = r5
        L1a:
            if (r8 == 0) goto L24
            r3[r2] = r4
            int[] r3 = r7.f13331
            int r5 = r2 + 1
            r3[r4] = r5
        L24:
            int r2 = r2 + 1
        L26:
            int r1 = r1 + 1
            goto L4
        L29:
            java.lang.Object[] r8 = r7.f13328
            p000.AbstractC0073bd.m868(r8, r2, r3)
            if (r0 == 0) goto L35
            int r8 = r7.f13333
            p000.AbstractC0073bd.m868(r0, r2, r8)
        L35:
            r7.f13333 = r2
            return
    }

    /* JADX INFO: renamed from: ε */
    public final boolean m7244(java.util.Collection r5) {
            r4 = this;
            r5.getClass()
            java.util.Iterator r5 = r5.iterator()
        L7:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L34
            java.lang.Object r0 = r5.next()
            r1 = 0
            if (r0 == 0) goto L33
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.ClassCastException -> L33
            java.lang.Object r2 = r0.getKey()     // Catch: java.lang.ClassCastException -> L33
            int r2 = r4.m7246(r2)     // Catch: java.lang.ClassCastException -> L33
            if (r2 >= 0) goto L22
            r0 = r1
            goto L31
        L22:
            java.lang.Object[] r3 = r4.f13329     // Catch: java.lang.ClassCastException -> L33
            r3.getClass()     // Catch: java.lang.ClassCastException -> L33
            r2 = r3[r2]     // Catch: java.lang.ClassCastException -> L33
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.ClassCastException -> L33
            boolean r0 = p000.ln0.m3626(r2, r0)     // Catch: java.lang.ClassCastException -> L33
        L31:
            if (r0 != 0) goto L7
        L33:
            return r1
        L34:
            r4 = 1
            return r4
    }

    /* JADX INFO: renamed from: ζ */
    public final void m7245(int r6) {
            r5 = this;
            java.lang.Object[] r0 = r5.f13328
            int r1 = r0.length
            int r2 = r5.f13333
            int r1 = r1 - r2
            int r3 = r5.f13336
            int r3 = r2 - r3
            r4 = 1
            if (r1 >= r6) goto L19
            int r1 = r1 + r3
            if (r1 < r6) goto L19
            int r1 = r0.length
            int r1 = r1 / 4
            if (r3 < r1) goto L19
            r5.m7243(r4)
            return
        L19:
            int r2 = r2 + r6
            if (r2 < 0) goto L63
            int r6 = r0.length
            if (r2 <= r6) goto L62
            int r6 = r0.length
            int r1 = r6 >> 1
            int r6 = r6 + r1
            int r1 = r6 - r2
            if (r1 >= 0) goto L28
            r6 = r2
        L28:
            r1 = 2147483639(0x7ffffff7, float:NaN)
            int r3 = r6 - r1
            if (r3 <= 0) goto L36
            if (r2 <= r1) goto L35
            r6 = 2147483647(0x7fffffff, float:NaN)
            goto L36
        L35:
            r6 = r1
        L36:
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r6)
            r5.f13328 = r0
            java.lang.Object[] r0 = r5.f13329
            if (r0 == 0) goto L45
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r6)
            goto L46
        L45:
            r0 = 0
        L46:
            r5.f13329 = r0
            int[] r0 = r5.f13330
            int[] r0 = java.util.Arrays.copyOf(r0, r6)
            r5.f13330 = r0
            if (r6 >= r4) goto L53
            goto L54
        L53:
            r4 = r6
        L54:
            int r4 = r4 * 3
            int r6 = java.lang.Integer.highestOneBit(r4)
            int[] r0 = r5.f13331
            int r0 = r0.length
            if (r6 <= r0) goto L62
            r5.m7249(r6)
        L62:
            return
        L63:
            java.lang.OutOfMemoryError r5 = new java.lang.OutOfMemoryError
            r5.<init>()
            throw r5
    }

    /* JADX INFO: renamed from: η */
    public final int m7246(java.lang.Object r6) {
            r5 = this;
            int r0 = r5.m7248(r6)
            int r1 = r5.f13332
        L6:
            int[] r2 = r5.f13331
            r2 = r2[r0]
            r3 = -1
            if (r2 != 0) goto Le
            return r3
        Le:
            if (r2 <= 0) goto L1d
            java.lang.Object[] r4 = r5.f13328
            int r2 = r2 + (-1)
            r4 = r4[r2]
            boolean r4 = p000.ln0.m3626(r4, r6)
            if (r4 == 0) goto L1d
            return r2
        L1d:
            int r1 = r1 + r3
            if (r1 >= 0) goto L21
            return r3
        L21:
            int r2 = r0 + (-1)
            if (r0 != 0) goto L2b
            int[] r0 = r5.f13331
            int r0 = r0.length
            int r0 = r0 + (-1)
            goto L6
        L2b:
            r0 = r2
            goto L6
    }

    /* JADX INFO: renamed from: θ */
    public final int m7247(java.lang.Object r3) {
            r2 = this;
            int r0 = r2.f13333
        L2:
            r1 = -1
            int r0 = r0 + r1
            if (r0 < 0) goto L1a
            int[] r1 = r2.f13330
            r1 = r1[r0]
            if (r1 < 0) goto L2
            java.lang.Object[] r1 = r2.f13329
            r1.getClass()
            r1 = r1[r0]
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 == 0) goto L2
            return r0
        L1a:
            return r1
    }

    /* JADX INFO: renamed from: ι */
    public final int m7248(java.lang.Object r2) {
            r1 = this;
            if (r2 == 0) goto L7
            int r2 = r2.hashCode()
            goto L8
        L7:
            r2 = 0
        L8:
            r0 = -1640531527(0xffffffff9e3779b9, float:-9.713111E-21)
            int r2 = r2 * r0
            int r1 = r1.f13334
            int r1 = r2 >>> r1
            return r1
    }

    /* JADX INFO: renamed from: κ */
    public final void m7249(int r6) {
            r5 = this;
            int r0 = r5.f13335
            int r0 = r0 + 1
            r5.f13335 = r0
            int r0 = r5.f13333
            int r1 = r5.f13336
            r2 = 0
            if (r0 <= r1) goto L10
            r5.m7243(r2)
        L10:
            int[] r0 = new int[r6]
            r5.f13331 = r0
            int r6 = java.lang.Integer.numberOfLeadingZeros(r6)
            int r6 = r6 + 1
            r5.f13334 = r6
        L1c:
            int r6 = r5.f13333
            if (r2 >= r6) goto L4d
            int r6 = r2 + 1
            java.lang.Object[] r0 = r5.f13328
            r0 = r0[r2]
            int r0 = r5.m7248(r0)
            int r1 = r5.f13332
        L2c:
            int[] r3 = r5.f13331
            r4 = r3[r0]
            if (r4 != 0) goto L3a
            r3[r0] = r6
            int[] r1 = r5.f13330
            r1[r2] = r0
            r2 = r6
            goto L1c
        L3a:
            int r1 = r1 + (-1)
            if (r1 < 0) goto L48
            int r4 = r0 + (-1)
            if (r0 != 0) goto L46
            int r0 = r3.length
            int r0 = r0 + (-1)
            goto L2c
        L46:
            r0 = r4
            goto L2c
        L48:
            java.lang.String r5 = "This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?"
            p000.C1080.m7279(r5)
        L4d:
            return
    }

    /* JADX INFO: renamed from: λ */
    public final void m7250(int r12) {
            r11 = this;
            java.lang.Object[] r0 = r11.f13328
            r0.getClass()
            r1 = 0
            r0[r12] = r1
            java.lang.Object[] r0 = r11.f13329
            if (r0 == 0) goto Le
            r0[r12] = r1
        Le:
            int[] r0 = r11.f13330
            r0 = r0[r12]
            int r1 = r11.f13332
            int r1 = r1 * 2
            int[] r2 = r11.f13331
            int r2 = r2.length
            int r2 = r2 / 2
            if (r1 <= r2) goto L1e
            r1 = r2
        L1e:
            r2 = 0
            r3 = r1
            r4 = r2
            r1 = r0
        L22:
            int r5 = r0 + (-1)
            if (r0 != 0) goto L2c
            int[] r0 = r11.f13331
            int r0 = r0.length
            int r0 = r0 + (-1)
            goto L2d
        L2c:
            r0 = r5
        L2d:
            int r4 = r4 + 1
            int r5 = r11.f13332
            int[] r6 = r11.f13331
            r7 = -1
            if (r4 <= r5) goto L39
            r6[r1] = r2
            goto L68
        L39:
            r5 = r6[r0]
            if (r5 != 0) goto L40
            r6[r1] = r2
            goto L68
        L40:
            if (r5 >= 0) goto L47
            r6[r1] = r7
        L44:
            r1 = r0
            r4 = r2
            goto L61
        L47:
            java.lang.Object[] r6 = r11.f13328
            int r8 = r5 + (-1)
            r6 = r6[r8]
            int r6 = r11.m7248(r6)
            int r6 = r6 - r0
            int[] r9 = r11.f13331
            int r10 = r9.length
            int r10 = r10 + (-1)
            r6 = r6 & r10
            if (r6 < r4) goto L61
            r9[r1] = r5
            int[] r4 = r11.f13330
            r4[r8] = r1
            goto L44
        L61:
            int r3 = r3 + r7
            if (r3 >= 0) goto L22
            int[] r0 = r11.f13331
            r0[r1] = r7
        L68:
            int[] r0 = r11.f13330
            r0[r12] = r7
            int r12 = r11.f13336
            int r12 = r12 + r7
            r11.f13336 = r12
            int r12 = r11.f13335
            int r12 = r12 + 1
            r11.f13335 = r12
            return
    }
}
