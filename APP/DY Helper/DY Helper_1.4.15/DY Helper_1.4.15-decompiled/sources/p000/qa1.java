package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class qa1 extends p000.AbstractC1101 implements java.util.Collection, p000.mo0 {

    /* JADX INFO: renamed from: ε */
    public p000.AbstractC1103 f8935;

    /* JADX INFO: renamed from: ζ */
    public java.lang.Object[] f8936;

    /* JADX INFO: renamed from: η */
    public java.lang.Object[] f8937;

    /* JADX INFO: renamed from: θ */
    public int f8938;

    /* JADX INFO: renamed from: ι */
    public p000.rk0 f8939;

    /* JADX INFO: renamed from: κ */
    public java.lang.Object[] f8940;

    /* JADX INFO: renamed from: λ */
    public java.lang.Object[] f8941;

    /* JADX INFO: renamed from: μ */
    public int f8942;

    public qa1(p000.AbstractC1103 r2, java.lang.Object[] r3, java.lang.Object[] r4, int r5) {
            r1 = this;
            r1.<init>()
            r1.f8935 = r2
            r1.f8936 = r3
            r1.f8937 = r4
            r1.f8938 = r5
            rk0 r5 = new rk0
            r0 = 4
            r5.<init>(r0)
            r1.f8939 = r5
            r1.f8940 = r3
            r1.f8941 = r4
            int r2 = r2.mo2340()
            r1.f8942 = r2
            return
    }

    /* JADX INFO: renamed from: δ */
    public static void m4819(java.lang.Object[] r2, int r3, java.util.Iterator r4) {
        L0:
            r0 = 32
            if (r3 >= r0) goto L14
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L14
            int r0 = r3 + 1
            java.lang.Object r1 = r4.next()
            r2[r3] = r1
            r3 = r0
            goto L0
        L14:
            return
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int r9, java.lang.Object r10) {
            r8 = this;
            int r0 = r8.mo4827()
            p000.AbstractC1021yh.m6886(r9, r0)
            int r0 = r8.mo4827()
            if (r9 != r0) goto L11
            r8.add(r10)
            return
        L11:
            int r0 = r8.modCount
            int r0 = r0 + 1
            r8.modCount = r0
            int r0 = r8.m4823()
            if (r9 < r0) goto L24
            java.lang.Object[] r1 = r8.f8940
            int r9 = r9 - r0
            r8.m4833(r1, r9, r10)
            return
        L24:
            y21 r7 = new y21
            r0 = 0
            r7.<init>(r0)
            java.lang.Object[] r3 = r8.f8940
            r3.getClass()
            int r4 = r8.f8938
            r2 = r8
            r5 = r9
            r6 = r10
            java.lang.Object[] r8 = r2.m4832(r3, r4, r5, r6, r7)
            r9 = 0
            java.lang.Object r10 = r7.f12428
            r2.m4833(r8, r9, r10)
            return
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(java.lang.Object r4) {
            r3 = this;
            int r0 = r3.modCount
            r1 = 1
            int r0 = r0 + r1
            r3.modCount = r0
            int r0 = r3.m4826()
            r2 = 32
            if (r0 >= r2) goto L20
            java.lang.Object[] r2 = r3.f8941
            java.lang.Object[] r2 = r3.m4836(r2)
            r2[r0] = r4
            r3.f8941 = r2
            int r4 = r3.mo4827()
            int r4 = r4 + r1
            r3.f8942 = r4
            goto L2b
        L20:
            java.lang.Object[] r4 = r3.m4839(r4)
            java.lang.Object[] r0 = r3.f8940
            java.lang.Object[] r2 = r3.f8941
            r3.m4845(r0, r2, r4)
        L2b:
            return r1
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int r14, java.util.Collection r15) {
            r13 = this;
            int r0 = r13.f8942
            p000.AbstractC1021yh.m6886(r14, r0)
            int r0 = r13.f8942
            if (r14 != r0) goto Le
            boolean r13 = r13.addAll(r15)
            return r13
        Le:
            boolean r0 = r15.isEmpty()
            r1 = 0
            if (r0 == 0) goto L16
            return r1
        L16:
            int r0 = r13.modCount
            r2 = 1
            int r0 = r0 + r2
            r13.modCount = r0
            int r0 = r14 >> 5
            int r0 = r0 << 5
            int r3 = r13.f8942
            int r3 = r3 - r0
            int r4 = r15.size()
            int r4 = r4 + r3
            int r4 = r4 - r2
            r3 = 32
            int r10 = r4 / 32
            if (r10 != 0) goto L5a
            r0 = r14 & 31
            int r1 = r15.size()
            int r1 = r1 + r14
            int r1 = r1 - r2
            r14 = r1 & 31
            java.lang.Object[] r1 = r13.f8941
            java.lang.Object[] r3 = r13.m4836(r1)
            int r14 = r14 + r2
            int r4 = r13.m4826()
            p000.AbstractC0312g7.m2238(r1, r3, r14, r0, r4)
            java.util.Iterator r14 = r15.iterator()
            m4819(r3, r0, r14)
            r13.f8941 = r3
            int r14 = r13.f8942
            int r15 = r15.size()
            int r15 = r15 + r14
            r13.f8942 = r15
            return r2
        L5a:
            java.lang.Object[][] r7 = new java.lang.Object[r10][]
            int r9 = r13.m4826()
            int r4 = r13.f8942
            int r5 = r15.size()
            int r5 = r5 + r4
            if (r5 > r3) goto L6a
            goto L6f
        L6a:
            int r4 = r5 + (-1)
            r4 = r4 & (-32)
            int r5 = r5 - r4
        L6f:
            int r4 = r13.m4823()
            if (r14 < r4) goto L85
            java.lang.Object[] r12 = r13.m4838()
            java.lang.Object[] r8 = r13.f8941
            r5 = r13
            r6 = r15
            r11 = r10
            r10 = r7
            r7 = r14
            r5.m4825(r6, r7, r8, r9, r10, r11, r12)
            r7 = r10
            goto Lb5
        L85:
            r6 = r15
            java.lang.Object[] r15 = r13.f8941
            if (r5 <= r9) goto L99
            int r8 = r5 - r9
            java.lang.Object[] r11 = r13.m4837(r8, r15)
            r5 = r13
            r9 = r7
            r7 = r14
            r5.m4831(r6, r7, r8, r9, r10, r11)
            r7 = r9
            r12 = r11
            goto Lb5
        L99:
            java.lang.Object[] r12 = r13.m4838()
            int r4 = r9 - r5
            p000.AbstractC0312g7.m2238(r15, r12, r1, r4, r9)
            int r3 = r3 - r4
            java.lang.Object[] r15 = r13.f8941
            java.lang.Object[] r9 = r13.m4837(r3, r15)
            int r8 = r10 + (-1)
            r7[r8] = r9
            r5 = r14
            r4 = r6
            r6 = r3
            r3 = r13
            r3.m4831(r4, r5, r6, r7, r8, r9)
            r6 = r4
        Lb5:
            java.lang.Object[] r14 = r13.f8940
            java.lang.Object[] r14 = r13.m4844(r14, r0, r7)
            r13.f8940 = r14
            r13.f8941 = r12
            int r14 = r13.f8942
            int r15 = r6.size()
            int r15 = r15 + r14
            r13.f8942 = r15
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection r8) {
            r7 = this;
            boolean r0 = r8.isEmpty()
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            int r0 = r7.modCount
            r2 = 1
            int r0 = r0 + r2
            r7.modCount = r0
            int r0 = r7.m4826()
            java.util.Iterator r3 = r8.iterator()
            int r4 = 32 - r0
            int r5 = r8.size()
            if (r4 < r5) goto L33
            java.lang.Object[] r1 = r7.f8941
            java.lang.Object[] r1 = r7.m4836(r1)
            m4819(r1, r0, r3)
            r7.f8941 = r1
            int r0 = r7.f8942
            int r8 = r8.size()
            int r8 = r8 + r0
            r7.f8942 = r8
            return r2
        L33:
            int r4 = r8.size()
            int r4 = r4 + r0
            int r4 = r4 - r2
            int r4 = r4 / 32
            java.lang.Object[][] r5 = new java.lang.Object[r4][]
            java.lang.Object[] r6 = r7.f8941
            java.lang.Object[] r6 = r7.m4836(r6)
            m4819(r6, r0, r3)
            r5[r1] = r6
            r0 = r2
        L49:
            if (r0 >= r4) goto L57
            java.lang.Object[] r6 = r7.m4838()
            m4819(r6, r1, r3)
            r5[r0] = r6
            int r0 = r0 + 1
            goto L49
        L57:
            java.lang.Object[] r0 = r7.f8940
            int r4 = r7.m4823()
            java.lang.Object[] r0 = r7.m4844(r0, r4, r5)
            r7.f8940 = r0
            java.lang.Object[] r0 = r7.m4838()
            m4819(r0, r1, r3)
            r7.f8941 = r0
            int r0 = r7.f8942
            int r8 = r8.size()
            int r8 = r8 + r0
            r7.f8942 = r8
            return r2
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object get(int r3) {
            r2 = this;
            int r0 = r2.mo4827()
            p000.AbstractC1021yh.m6885(r3, r0)
            int r0 = r2.m4823()
            if (r0 > r3) goto L10
            java.lang.Object[] r2 = r2.f8941
            goto L28
        L10:
            java.lang.Object[] r0 = r2.f8940
            r0.getClass()
            int r2 = r2.f8938
        L17:
            if (r2 <= 0) goto L27
            int r1 = p000.i81.m2669(r3, r2)
            r0 = r0[r1]
            r0.getClass()
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            int r2 = r2 + (-5)
            goto L17
        L27:
            r2 = r0
        L28:
            r3 = r3 & 31
            r2 = r2[r3]
            return r2
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final java.util.Iterator iterator() {
            r1 = this;
            r0 = 0
            java.util.ListIterator r1 = r1.listIterator(r0)
            return r1
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.util.ListIterator listIterator() {
            r1 = this;
            r0 = 0
            java.util.ListIterator r1 = r1.listIterator(r0)
            return r1
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.util.ListIterator listIterator(int r2) {
            r1 = this;
            int r0 = r1.f8942
            p000.AbstractC1021yh.m6886(r2, r0)
            sa1 r0 = new sa1
            r0.<init>(r1, r2)
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(java.util.Collection r3) {
            r2 = this;
            а r0 = new а
            r1 = 1
            r0.<init>(r1, r3)
            boolean r2 = r2.m4820(r0)
            return r2
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object set(int r9, java.lang.Object r10) {
            r8 = this;
            int r0 = r8.mo4827()
            p000.AbstractC1021yh.m6885(r9, r0)
            int r0 = r8.m4823()
            if (r0 > r9) goto L26
            java.lang.Object[] r0 = r8.f8941
            java.lang.Object[] r0 = r8.m4836(r0)
            java.lang.Object[] r1 = r8.f8941
            if (r0 == r1) goto L1d
            int r1 = r8.modCount
            int r1 = r1 + 1
            r8.modCount = r1
        L1d:
            r9 = r9 & 31
            r1 = r0[r9]
            r0[r9] = r10
            r8.f8941 = r0
            return r1
        L26:
            y21 r7 = new y21
            r0 = 0
            r7.<init>(r0)
            java.lang.Object[] r3 = r8.f8940
            r3.getClass()
            int r4 = r8.f8938
            r2 = r8
            r5 = r9
            r6 = r10
            java.lang.Object[] r8 = r2.m4824(r3, r4, r5, r6, r7)
            r2.f8940 = r8
            java.lang.Object r8 = r7.f12428
            return r8
    }

    /* JADX INFO: renamed from: Α */
    public final boolean m4820(p000.a80 r16) {
            r15 = this;
            r1 = r16
            int r8 = r15.m4826()
            y21 r5 = new y21
            r9 = 0
            r5.<init>(r9)
            java.lang.Object[] r0 = r15.f8940
            r10 = 0
            r11 = 1
            if (r0 != 0) goto L1b
            int r0 = r15.m4849(r1, r8, r5)
            if (r0 == r8) goto Ld1
        L18:
            r10 = r11
            goto Ld1
        L1b:
            ψ r12 = r15.m4835(r10)
            r13 = 32
            r0 = r13
        L22:
            if (r0 != r13) goto L35
            boolean r2 = r12.hasNext()
            if (r2 == 0) goto L35
            java.lang.Object r0 = r12.next()
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            int r0 = r15.m4848(r1, r0, r13, r5)
            goto L22
        L35:
            if (r0 != r13) goto L49
            int r0 = r15.m4849(r1, r8, r5)
            if (r0 != 0) goto L46
            java.lang.Object[] r1 = r15.f8940
            int r2 = r15.f8942
            int r3 = r15.f8938
            r15.m4842(r1, r2, r3)
        L46:
            if (r0 == r8) goto Ld1
            goto L18
        L49:
            int r2 = r12.f13424
            int r2 = r2 - r11
            int r14 = r2 << 5
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r4 = r0
        L59:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L70
            java.lang.Object r0 = r12.next()
            r2 = r0
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            r3 = 32
            r0 = r15
            int r4 = r0.m4847(r1, r2, r3, r4, r5, r6, r7)
            r1 = r16
            goto L59
        L70:
            java.lang.Object[] r2 = r15.f8941
            r0 = r15
            r1 = r16
            r3 = r8
            int r1 = r0.m4847(r1, r2, r3, r4, r5, r6, r7)
            java.lang.Object r2 = r5.f12428
            r2.getClass()
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            java.util.Arrays.fill(r2, r1, r13, r9)
            boolean r3 = r7.isEmpty()
            java.lang.Object[] r4 = r15.f8940
            if (r3 == 0) goto L90
            r4.getClass()
            goto L9a
        L90:
            int r3 = r15.f8938
            java.util.Iterator r5 = r7.iterator()
            java.lang.Object[] r4 = r15.m4843(r4, r14, r3, r5)
        L9a:
            int r3 = r7.size()
            int r3 = r3 << 5
            int r14 = r14 + r3
            r3 = r14 & 31
            if (r3 != 0) goto La6
            goto Lab
        La6:
            java.lang.String r3 = "invalid size"
            p000.pi1.m4544(r3)
        Lab:
            if (r14 != 0) goto Lb0
            r15.f8938 = r10
            goto Lc8
        Lb0:
            int r3 = r14 + (-1)
        Lb2:
            int r5 = r15.f8938
            int r6 = r3 >> r5
            if (r6 != 0) goto Lc4
            int r5 = r5 + (-5)
            r15.f8938 = r5
            r4 = r4[r10]
            r4.getClass()
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            goto Lb2
        Lc4:
            java.lang.Object[] r9 = r15.m4840(r4, r3, r5)
        Lc8:
            r15.f8940 = r9
            r15.f8941 = r2
            int r14 = r14 + r1
            r15.f8942 = r14
            goto L18
        Ld1:
            if (r10 == 0) goto Ld8
            int r1 = r15.modCount
            int r1 = r1 + r11
            r15.modCount = r1
        Ld8:
            return r10
    }

    /* JADX INFO: renamed from: Β */
    public final java.lang.Object[] m4821(java.lang.Object[] r6, int r7, int r8, p000.y21 r9) {
            r5 = this;
            int r0 = p000.i81.m2669(r8, r7)
            r1 = 31
            if (r7 != 0) goto L1c
            r7 = r6[r0]
            java.lang.Object[] r5 = r5.m4836(r6)
            int r8 = r0 + 1
            r2 = 32
            p000.AbstractC0312g7.m2238(r6, r5, r0, r8, r2)
            java.lang.Object r6 = r9.f12428
            r5[r1] = r6
            r9.f12428 = r7
            return r5
        L1c:
            r2 = r6[r1]
            if (r2 != 0) goto L2a
            int r1 = r5.m4823()
            int r1 = r1 + (-1)
            int r1 = p000.i81.m2669(r1, r7)
        L2a:
            java.lang.Object[] r6 = r5.m4836(r6)
            int r7 = r7 + (-5)
            int r2 = r0 + 1
            if (r2 > r1) goto L47
        L34:
            r3 = r6[r1]
            r3.getClass()
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            r4 = 0
            java.lang.Object[] r3 = r5.m4821(r3, r7, r4, r9)
            r6[r1] = r3
            if (r1 == r2) goto L47
            int r1 = r1 + (-1)
            goto L34
        L47:
            r1 = r6[r0]
            r1.getClass()
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            java.lang.Object[] r5 = r5.m4821(r1, r7, r8, r9)
            r6[r0] = r5
            return r6
    }

    /* JADX INFO: renamed from: Γ */
    public final java.lang.Object m4822(java.lang.Object[] r7, int r8, int r9, int r10) {
            r6 = this;
            int r0 = r6.f8942
            int r0 = r0 - r8
            java.lang.Object[] r1 = r6.f8941
            r2 = 1
            if (r0 != r2) goto Lf
            r10 = 0
            r10 = r1[r10]
            r6.m4842(r7, r8, r9)
            return r10
        Lf:
            r3 = r1[r10]
            java.lang.Object[] r4 = r6.m4836(r1)
            int r5 = r10 + 1
            p000.AbstractC0312g7.m2238(r1, r4, r10, r5, r0)
            int r10 = r0 + (-1)
            r1 = 0
            r4[r10] = r1
            r6.f8940 = r7
            r6.f8941 = r4
            int r8 = r8 + r0
            int r8 = r8 - r2
            r6.f8942 = r8
            r6.f8938 = r9
            return r3
    }

    /* JADX INFO: renamed from: Δ */
    public final int m4823() {
            r1 = this;
            int r1 = r1.f8942
            r0 = 32
            if (r1 > r0) goto L8
            r1 = 0
            return r1
        L8:
            int r1 = r1 + (-1)
            r1 = r1 & (-32)
            return r1
    }

    /* JADX INFO: renamed from: Ε */
    public final java.lang.Object[] m4824(java.lang.Object[] r9, int r10, int r11, java.lang.Object r12, p000.y21 r13) {
            r8 = this;
            int r0 = p000.i81.m2669(r11, r10)
            java.lang.Object[] r1 = r8.m4836(r9)
            if (r10 != 0) goto L19
            if (r1 == r9) goto L12
            int r9 = r8.modCount
            int r9 = r9 + 1
            r8.modCount = r9
        L12:
            r8 = r1[r0]
            r13.f12428 = r8
            r1[r0] = r12
            return r1
        L19:
            r9 = r1[r0]
            r9.getClass()
            r3 = r9
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            int r4 = r10 + (-5)
            r2 = r8
            r5 = r11
            r6 = r12
            r7 = r13
            java.lang.Object[] r8 = r2.m4824(r3, r4, r5, r6, r7)
            r1[r0] = r8
            return r1
    }

    /* JADX INFO: renamed from: Ζ */
    public final void m4825(java.util.Collection r6, int r7, java.lang.Object[] r8, int r9, java.lang.Object[][] r10, int r11, java.lang.Object[] r12) {
            r5 = this;
            r0 = 1
            if (r11 < r0) goto L4
            goto L9
        L4:
            java.lang.String r1 = "requires at least one nullBuffer"
            p000.pi1.m4544(r1)
        L9:
            java.lang.Object[] r8 = r5.m4836(r8)
            r1 = 0
            r10[r1] = r8
            r2 = r7 & 31
            int r3 = r6.size()
            int r3 = r3 + r7
            int r3 = r3 - r0
            r7 = r3 & 31
            int r3 = r9 - r2
            int r3 = r3 + r7
            r4 = 32
            if (r3 >= r4) goto L26
            int r7 = r7 + r0
            p000.AbstractC0312g7.m2238(r8, r12, r7, r2, r9)
            goto L3e
        L26:
            int r3 = r3 + (-31)
            if (r11 != r0) goto L2c
            r4 = r8
            goto L34
        L2c:
            java.lang.Object[] r4 = r5.m4838()
            int r11 = r11 + (-1)
            r10[r11] = r4
        L34:
            int r3 = r9 - r3
            p000.AbstractC0312g7.m2238(r8, r12, r1, r3, r9)
            int r7 = r7 + r0
            p000.AbstractC0312g7.m2238(r8, r4, r7, r2, r3)
            r12 = r4
        L3e:
            java.util.Iterator r6 = r6.iterator()
            m4819(r8, r2, r6)
        L45:
            if (r0 >= r11) goto L53
            java.lang.Object[] r7 = r5.m4838()
            m4819(r7, r1, r6)
            r10[r0] = r7
            int r0 = r0 + 1
            goto L45
        L53:
            m4819(r12, r1, r6)
            return
    }

    /* JADX INFO: renamed from: Η */
    public final int m4826() {
            r1 = this;
            int r1 = r1.f8942
            r0 = 32
            if (r1 > r0) goto L7
            return r1
        L7:
            int r0 = r1 + (-1)
            r0 = r0 & (-32)
            int r1 = r1 - r0
            return r1
    }

    @Override // p000.AbstractC1101
    /* JADX INFO: renamed from: α */
    public final int mo4827() {
            r0 = this;
            int r0 = r0.f8942
            return r0
    }

    @Override // p000.AbstractC1101
    /* JADX INFO: renamed from: β */
    public final java.lang.Object mo4828(int r6) {
            r5 = this;
            int r0 = r5.mo4827()
            p000.AbstractC1021yh.m6885(r6, r0)
            int r0 = r5.modCount
            int r0 = r0 + 1
            r5.modCount = r0
            int r0 = r5.m4823()
            if (r6 < r0) goto L1d
            java.lang.Object[] r1 = r5.f8940
            int r2 = r5.f8938
            int r6 = r6 - r0
            java.lang.Object r5 = r5.m4822(r1, r0, r2, r6)
            return r5
        L1d:
            y21 r1 = new y21
            java.lang.Object[] r2 = r5.f8941
            r3 = 0
            r2 = r2[r3]
            r1.<init>(r2)
            java.lang.Object[] r2 = r5.f8940
            r2.getClass()
            int r4 = r5.f8938
            java.lang.Object[] r6 = r5.m4821(r2, r4, r6, r1)
            int r2 = r5.f8938
            r5.m4822(r6, r0, r2, r3)
            java.lang.Object r5 = r1.f12428
            return r5
    }

    /* JADX INFO: renamed from: γ */
    public final p000.AbstractC1103 m4829() {
            r5 = this;
            java.lang.Object[] r0 = r5.f8940
            java.lang.Object[] r1 = r5.f8936
            if (r0 != r1) goto Lf
            java.lang.Object[] r1 = r5.f8941
            java.lang.Object[] r2 = r5.f8937
            if (r1 != r2) goto Lf
            б r0 = r5.f8935
            goto L3b
        Lf:
            rk0 r1 = new rk0
            r2 = 4
            r1.<init>(r2)
            r5.f8939 = r1
            r5.f8936 = r0
            java.lang.Object[] r1 = r5.f8941
            r5.f8937 = r1
            if (r0 != 0) goto L31
            int r0 = r1.length
            if (r0 != 0) goto L25
            sw1 r0 = p000.sw1.f10062
            goto L3b
        L25:
            sw1 r0 = new sw1
            int r2 = r5.f8942
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r2)
            r0.<init>(r1)
            goto L3b
        L31:
            pa1 r2 = new pa1
            int r3 = r5.f8942
            int r4 = r5.f8938
            r2.<init>(r0, r1, r3, r4)
            r0 = r2
        L3b:
            r5.f8935 = r0
            return r0
    }

    /* JADX INFO: renamed from: ε */
    public final int m4830() {
            r0 = this;
            int r0 = r0.modCount
            return r0
    }

    /* JADX INFO: renamed from: ζ */
    public final void m4831(java.util.Collection r10, int r11, int r12, java.lang.Object[][] r13, int r14, java.lang.Object[] r15) {
            r9 = this;
            java.lang.Object[] r0 = r9.f8940
            if (r0 == 0) goto L53
            int r0 = r11 >> 5
            int r1 = r9.m4823()
            int r1 = r1 >> 5
            ψ r1 = r9.m4835(r1)
            r3 = r14
            r2 = r15
        L12:
            int r4 = r1.f13424
            int r4 = r4 + (-1)
            if (r4 == r0) goto L2f
            java.lang.Object r4 = r1.previous()
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            int r5 = 32 - r12
            r6 = 0
            r7 = 32
            p000.AbstractC0312g7.m2238(r4, r2, r6, r5, r7)
            java.lang.Object[] r2 = r9.m4837(r12, r4)
            int r3 = r3 + (-1)
            r13[r3] = r2
            goto L12
        L2f:
            java.lang.Object r12 = r1.previous()
            r4 = r12
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            int r12 = r9.m4823()
            int r12 = r12 >> 5
            int r12 = r12 + (-1)
            int r12 = r12 - r0
            int r7 = r14 - r12
            if (r7 >= r14) goto L48
            r15 = r13[r7]
            r15.getClass()
        L48:
            r8 = r15
            r5 = 32
            r1 = r9
            r2 = r10
            r3 = r11
            r6 = r13
            r1.m4825(r2, r3, r4, r5, r6, r7, r8)
            return
        L53:
            java.lang.String r9 = "root is null"
            p000.C1080.m7279(r9)
            return
    }

    /* JADX INFO: renamed from: η */
    public final java.lang.Object[] m4832(java.lang.Object[] r8, int r9, int r10, java.lang.Object r11, p000.y21 r12) {
            r7 = this;
            int r0 = p000.i81.m2669(r10, r9)
            if (r9 != 0) goto L18
            r9 = 31
            r10 = r8[r9]
            r12.f12428 = r10
            java.lang.Object[] r7 = r7.m4836(r8)
            int r10 = r0 + 1
            p000.AbstractC0312g7.m2238(r8, r7, r10, r0, r9)
            r7[r0] = r11
            return r7
        L18:
            java.lang.Object[] r8 = r7.m4836(r8)
            int r3 = r9 + (-5)
            r9 = r8[r0]
            r9.getClass()
            r2 = r9
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            r1 = r7
            r4 = r10
            r5 = r11
            r6 = r12
            java.lang.Object[] r7 = r1.m4832(r2, r3, r4, r5, r6)
            r8[r0] = r7
        L30:
            int r0 = r0 + 1
            r7 = 32
            if (r0 >= r7) goto L47
            r7 = r8[r0]
            if (r7 == 0) goto L47
            r2 = r7
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            r4 = 0
            java.lang.Object r5 = r6.f12428
            java.lang.Object[] r7 = r1.m4832(r2, r3, r4, r5, r6)
            r8[r0] = r7
            goto L30
        L47:
            return r8
    }

    /* JADX INFO: renamed from: θ */
    public final void m4833(java.lang.Object[] r6, int r7, java.lang.Object r8) {
            r5 = this;
            int r0 = r5.m4826()
            java.lang.Object[] r1 = r5.f8941
            java.lang.Object[] r1 = r5.m4836(r1)
            java.lang.Object[] r2 = r5.f8941
            r3 = 32
            if (r0 >= r3) goto L22
            int r3 = r7 + 1
            p000.AbstractC0312g7.m2238(r2, r1, r3, r7, r0)
            r1[r7] = r8
            r5.f8940 = r6
            r5.f8941 = r1
            int r6 = r5.f8942
            int r6 = r6 + 1
            r5.f8942 = r6
            return
        L22:
            r0 = 31
            r3 = r2[r0]
            int r4 = r7 + 1
            p000.AbstractC0312g7.m2238(r2, r1, r4, r7, r0)
            r1[r7] = r8
            java.lang.Object[] r7 = r5.m4839(r3)
            r5.m4845(r6, r1, r7)
            return
    }

    /* JADX INFO: renamed from: ι */
    public final boolean m4834(java.lang.Object[] r3) {
            r2 = this;
            int r0 = r3.length
            r1 = 33
            if (r0 != r1) goto Lf
            r0 = 32
            r3 = r3[r0]
            rk0 r2 = r2.f8939
            if (r3 != r2) goto Lf
            r2 = 1
            return r2
        Lf:
            r2 = 0
            return r2
    }

    /* JADX INFO: renamed from: κ */
    public final p000.AbstractC1100 m4835(int r4) {
            r3 = this;
            java.lang.Object[] r0 = r3.f8940
            if (r0 == 0) goto L1f
            int r1 = r3.m4823()
            int r1 = r1 >> 5
            p000.AbstractC1021yh.m6886(r4, r1)
            int r3 = r3.f8938
            if (r3 != 0) goto L17
            tc r3 = new tc
            r3.<init>(r4, r0)
            return r3
        L17:
            int r3 = r3 / 5
            y52 r2 = new y52
            r2.<init>(r0, r4, r1, r3)
            return r2
        L1f:
            java.lang.String r3 = "Invalid root"
            p000.C1080.m7279(r3)
            r3 = 0
            return r3
    }

    /* JADX INFO: renamed from: λ */
    public final java.lang.Object[] m4836(java.lang.Object[] r4) {
            r3 = this;
            if (r4 != 0) goto L7
            java.lang.Object[] r3 = r3.m4838()
            return r3
        L7:
            boolean r0 = r3.m4834(r4)
            if (r0 == 0) goto Le
            return r4
        Le:
            java.lang.Object[] r3 = r3.m4838()
            int r0 = r4.length
            r1 = 32
            if (r0 <= r1) goto L18
            r0 = r1
        L18:
            r1 = 6
            r2 = 0
            p000.AbstractC0312g7.m2240(r4, r3, r2, r0, r1)
            return r3
    }

    /* JADX INFO: renamed from: μ */
    public final java.lang.Object[] m4837(int r3, java.lang.Object[] r4) {
            r2 = this;
            boolean r0 = r2.m4834(r4)
            r1 = 0
            if (r0 == 0) goto Ld
            int r2 = 32 - r3
            p000.AbstractC0312g7.m2238(r4, r4, r3, r1, r2)
            return r4
        Ld:
            java.lang.Object[] r2 = r2.m4838()
            int r0 = 32 - r3
            p000.AbstractC0312g7.m2238(r4, r2, r3, r1, r0)
            return r2
    }

    /* JADX INFO: renamed from: ν */
    public final java.lang.Object[] m4838() {
            r2 = this;
            r0 = 33
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 32
            rk0 r2 = r2.f8939
            r0[r1] = r2
            return r0
    }

    /* JADX INFO: renamed from: ξ */
    public final java.lang.Object[] m4839(java.lang.Object r3) {
            r2 = this;
            r0 = 33
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r3
            r3 = 32
            rk0 r2 = r2.f8939
            r0[r3] = r2
            return r0
    }

    /* JADX INFO: renamed from: ο */
    public final java.lang.Object[] m4840(java.lang.Object[] r4, int r5, int r6) {
            r3 = this;
            if (r6 < 0) goto L3
            goto L8
        L3:
            java.lang.String r0 = "shift should be positive"
            p000.pi1.m4544(r0)
        L8:
            if (r6 != 0) goto Lb
            return r4
        Lb:
            int r0 = p000.i81.m2669(r5, r6)
            r1 = r4[r0]
            r1.getClass()
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            int r6 = r6 + (-5)
            java.lang.Object[] r5 = r3.m4840(r1, r5, r6)
            r6 = 31
            if (r0 >= r6) goto L3b
            int r6 = r0 + 1
            r1 = r4[r6]
            if (r1 == 0) goto L3b
            boolean r1 = r3.m4834(r4)
            if (r1 == 0) goto L32
            r1 = 0
            r2 = 32
            java.util.Arrays.fill(r4, r6, r2, r1)
        L32:
            java.lang.Object[] r1 = r3.m4838()
            r2 = 0
            p000.AbstractC0312g7.m2238(r4, r1, r2, r2, r6)
            r4 = r1
        L3b:
            r6 = r4[r0]
            if (r5 == r6) goto L46
            java.lang.Object[] r3 = r3.m4836(r4)
            r3[r0] = r5
            return r3
        L46:
            return r4
    }

    /* JADX INFO: renamed from: π */
    public final java.lang.Object[] m4841(java.lang.Object[] r5, int r6, int r7, p000.y21 r8) {
            r4 = this;
            int r0 = r7 + (-1)
            int r0 = p000.i81.m2669(r0, r6)
            r1 = 0
            r2 = 5
            if (r6 != r2) goto L10
            r6 = r5[r0]
            r8.f12428 = r6
            r6 = r1
            goto L1c
        L10:
            r3 = r5[r0]
            r3.getClass()
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            int r6 = r6 - r2
            java.lang.Object[] r6 = r4.m4841(r3, r6, r7, r8)
        L1c:
            if (r6 != 0) goto L21
            if (r0 != 0) goto L21
            return r1
        L21:
            java.lang.Object[] r4 = r4.m4836(r5)
            r4[r0] = r6
            return r4
    }

    /* JADX INFO: renamed from: ρ */
    public final void m4842(java.lang.Object[] r4, int r5, int r6) {
            r3 = this;
            r0 = 0
            r1 = 0
            if (r6 != 0) goto L11
            r3.f8940 = r1
            if (r4 != 0) goto La
            java.lang.Object[] r4 = new java.lang.Object[r0]
        La:
            r3.f8941 = r4
            r3.f8942 = r5
            r3.f8938 = r6
            return
        L11:
            y21 r2 = new y21
            r2.<init>(r1)
            r4.getClass()
            java.lang.Object[] r4 = r3.m4841(r4, r6, r5, r2)
            r4.getClass()
            java.lang.Object r1 = r2.f12428
            r1.getClass()
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            r3.f8941 = r1
            r3.f8942 = r5
            r5 = 1
            r5 = r4[r5]
            if (r5 != 0) goto L3b
            r4 = r4[r0]
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            r3.f8940 = r4
            int r6 = r6 + (-5)
            r3.f8938 = r6
            return
        L3b:
            r3.f8940 = r4
            r3.f8938 = r6
            return
    }

    /* JADX INFO: renamed from: σ */
    public final java.lang.Object[] m4843(java.lang.Object[] r5, int r6, int r7, java.util.Iterator r8) {
            r4 = this;
            boolean r0 = r8.hasNext()
            if (r0 != 0) goto Lb
            java.lang.String r0 = "invalid buffersIterator"
            p000.pi1.m4544(r0)
        Lb:
            r0 = 0
            r1 = 1
            if (r7 < 0) goto L11
            r2 = r1
            goto L12
        L11:
            r2 = r0
        L12:
            if (r2 != 0) goto L19
            java.lang.String r2 = "negative shift"
            p000.pi1.m4544(r2)
        L19:
            if (r7 != 0) goto L22
            java.lang.Object r4 = r8.next()
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            return r4
        L22:
            java.lang.Object[] r5 = r4.m4836(r5)
            int r2 = p000.i81.m2669(r6, r7)
            r3 = r5[r2]
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            int r7 = r7 + (-5)
            java.lang.Object[] r6 = r4.m4843(r3, r6, r7, r8)
            r5[r2] = r6
        L36:
            int r2 = r2 + r1
            r6 = 32
            if (r2 >= r6) goto L4c
            boolean r6 = r8.hasNext()
            if (r6 == 0) goto L4c
            r6 = r5[r2]
            java.lang.Object[] r6 = (java.lang.Object[]) r6
            java.lang.Object[] r6 = r4.m4843(r6, r0, r7, r8)
            r5[r2] = r6
            goto L36
        L4c:
            return r5
    }

    /* JADX INFO: renamed from: τ */
    public final java.lang.Object[] m4844(java.lang.Object[] r5, int r6, java.lang.Object[][] r7) {
            r4 = this;
            τ r0 = new τ
            r0.<init>(r7)
            int r7 = r6 >> 5
            int r1 = r4.f8938
            r2 = 1
            int r3 = r2 << r1
            if (r7 >= r3) goto L13
            java.lang.Object[] r5 = r4.m4843(r5, r6, r1, r0)
            goto L17
        L13:
            java.lang.Object[] r5 = r4.m4836(r5)
        L17:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L2f
            int r6 = r4.f8938
            int r6 = r6 + 5
            r4.f8938 = r6
            java.lang.Object[] r5 = r4.m4839(r5)
            int r6 = r4.f8938
            int r7 = r2 << r6
            r4.m4843(r5, r7, r6, r0)
            goto L17
        L2f:
            return r5
    }

    /* JADX INFO: renamed from: υ */
    public final void m4845(java.lang.Object[] r6, java.lang.Object[] r7, java.lang.Object[] r8) {
            r5 = this;
            int r0 = r5.f8942
            int r1 = r0 >> 5
            int r2 = r5.f8938
            r3 = 1
            int r4 = r3 << r2
            if (r1 <= r4) goto L27
            java.lang.Object[] r6 = r5.m4839(r6)
            int r0 = r5.f8938
            int r0 = r0 + 5
            java.lang.Object[] r6 = r5.m4846(r0, r6, r7)
            r5.f8940 = r6
            r5.f8941 = r8
            int r6 = r5.f8938
            int r6 = r6 + 5
            r5.f8938 = r6
            int r6 = r5.f8942
            int r6 = r6 + r3
            r5.f8942 = r6
            return
        L27:
            if (r6 != 0) goto L31
            r5.f8940 = r7
            r5.f8941 = r8
            int r0 = r0 + r3
            r5.f8942 = r0
            return
        L31:
            java.lang.Object[] r6 = r5.m4846(r2, r6, r7)
            r5.f8940 = r6
            r5.f8941 = r8
            int r6 = r5.f8942
            int r6 = r6 + r3
            r5.f8942 = r6
            return
    }

    /* JADX INFO: renamed from: φ */
    public final java.lang.Object[] m4846(int r4, java.lang.Object[] r5, java.lang.Object[] r6) {
            r3 = this;
            int r0 = r3.mo4827()
            int r0 = r0 + (-1)
            int r0 = p000.i81.m2669(r0, r4)
            java.lang.Object[] r5 = r3.m4836(r5)
            r1 = 5
            if (r4 != r1) goto L14
            r5[r0] = r6
            return r5
        L14:
            r2 = r5[r0]
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            int r4 = r4 - r1
            java.lang.Object[] r3 = r3.m4846(r4, r2, r6)
            r5[r0] = r3
            return r5
    }

    /* JADX INFO: renamed from: χ */
    public final int m4847(p000.a80 r7, java.lang.Object[] r8, int r9, int r10, p000.y21 r11, java.util.ArrayList r12, java.util.ArrayList r13) {
            r6 = this;
            boolean r0 = r6.m4834(r8)
            if (r0 == 0) goto L9
            r12.add(r8)
        L9:
            java.lang.Object r0 = r11.f12428
            r0.getClass()
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            r1 = 0
            r3 = r0
            r2 = r1
        L13:
            if (r2 >= r9) goto L49
            r4 = r8[r2]
            java.lang.Object r5 = r7.invoke(r4)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L46
            r5 = 32
            if (r10 != r5) goto L41
            boolean r10 = r12.isEmpty()
            if (r10 != 0) goto L3b
            int r10 = r12.size()
            int r10 = r10 + (-1)
            java.lang.Object r10 = r12.remove(r10)
            java.lang.Object[] r10 = (java.lang.Object[]) r10
        L39:
            r3 = r10
            goto L40
        L3b:
            java.lang.Object[] r10 = r6.m4838()
            goto L39
        L40:
            r10 = r1
        L41:
            int r5 = r10 + 1
            r3[r10] = r4
            r10 = r5
        L46:
            int r2 = r2 + 1
            goto L13
        L49:
            r11.f12428 = r3
            if (r0 == r3) goto L50
            r13.add(r0)
        L50:
            return r10
    }

    /* JADX INFO: renamed from: ψ */
    public final int m4848(p000.a80 r7, java.lang.Object[] r8, int r9, p000.y21 r10) {
            r6 = this;
            r0 = 0
            r2 = r8
            r3 = r9
            r1 = r0
        L4:
            if (r0 >= r9) goto L27
            r4 = r8[r0]
            java.lang.Object r5 = r7.invoke(r4)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L1d
            if (r1 != 0) goto L24
            java.lang.Object[] r2 = r6.m4836(r8)
            r1 = 1
            r3 = r0
            goto L24
        L1d:
            if (r1 == 0) goto L24
            int r5 = r3 + 1
            r2[r3] = r4
            r3 = r5
        L24:
            int r0 = r0 + 1
            goto L4
        L27:
            r10.f12428 = r2
            return r3
    }

    /* JADX INFO: renamed from: ω */
    public final int m4849(p000.a80 r2, int r3, p000.y21 r4) {
            r1 = this;
            java.lang.Object[] r0 = r1.f8941
            int r2 = r1.m4848(r2, r0, r3, r4)
            java.lang.Object r4 = r4.f12428
            if (r2 != r3) goto Lb
            return r3
        Lb:
            r4.getClass()
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            r0 = 0
            java.util.Arrays.fill(r4, r2, r3, r0)
            r1.f8941 = r4
            int r4 = r1.f8942
            int r3 = r3 - r2
            int r4 = r4 - r3
            r1.f8942 = r4
            return r2
    }
}
