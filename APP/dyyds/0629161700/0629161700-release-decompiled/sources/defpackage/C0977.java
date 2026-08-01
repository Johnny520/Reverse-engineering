package defpackage;

/* JADX INFO: renamed from: ᛵᲇᛳᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0977 extends java.util.AbstractMap implements java.io.Serializable {

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public static final defpackage.C2054 f4370 = null;

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public final defpackage.C0527 f4371;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public defpackage.C0499 f4372;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public defpackage.C0527 f4373;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final boolean f4374;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final java.util.Comparator f4375;

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public defpackage.C0499 f4376;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public int f4377;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public int f4378;

    static {
            ᲇᛵᲀᲇ r0 = new ᲇᛵᲀᲇ
            r1 = 13
            r0.<init>(r1)
            defpackage.C0977.f4370 = r0
            return
    }

    public C0977(boolean r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f4377 = r0
            r1.f4378 = r0
            ᲇᛵᲀᲇ r0 = defpackage.C0977.f4370
            r1.f4375 = r0
            r1.f4374 = r2
            ᛳᛸᛶᛷ r0 = new ᛳᛸᛶᛷ
            r0.<init>(r2)
            r1.f4371 = r0
            return
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
            r1 = this;
            r0 = 0
            r1.f4373 = r0
            r0 = 0
            r1.f4377 = r0
            int r0 = r1.f4378
            int r0 = r0 + 1
            r1.f4378 = r0
            ᛳᛸᛶᛷ r1 = r1.f4371
            r1.f2602 = r1
            r1.f2601 = r1
            return
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(java.lang.Object r3) {
            r2 = this;
            r0 = 0
            r1 = 0
            if (r3 == 0) goto L8
            ᛳᛸᛶᛷ r1 = r2.m1918(r3, r0)     // Catch: java.lang.ClassCastException -> L8
        L8:
            if (r1 == 0) goto Lc
            r2 = 1
            return r2
        Lc:
            return r0
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set entrySet() {
            r2 = this;
            ᛳᛶᛳᛷ r0 = r2.f4372
            if (r0 != 0) goto Lc
            ᛳᛶᛳᛷ r0 = new ᛳᛶᛳᛷ
            r1 = 0
            r0.<init>(r2, r1)
            r2.f4372 = r0
        Lc:
            return r0
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.lang.Object get(java.lang.Object r3) {
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L9
            r1 = 0
            ᛳᛸᛶᛷ r2 = r2.m1918(r3, r1)     // Catch: java.lang.ClassCastException -> L9
            goto La
        L9:
            r2 = r0
        La:
            if (r2 == 0) goto Lf
            java.lang.Object r2 = r2.f2600
            return r2
        Lf:
            return r0
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set keySet() {
            r2 = this;
            ᛳᛶᛳᛷ r0 = r2.f4376
            if (r0 != 0) goto Lc
            ᛳᛶᛳᛷ r0 = new ᛳᛶᛳᛷ
            r1 = 1
            r0.<init>(r2, r1)
            r2.f4376 = r0
        Lc:
            return r0
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.lang.Object put(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L1a
            if (r4 != 0) goto L10
            boolean r1 = r2.f4374
            if (r1 == 0) goto La
            goto L10
        La:
            java.lang.String r2 = "value == null"
            defpackage.C2264.m3673(r2)
            return r0
        L10:
            r0 = 1
            ᛳᛸᛶᛷ r2 = r2.m1918(r3, r0)
            java.lang.Object r3 = r2.f2600
            r2.f2600 = r4
            return r3
        L1a:
            java.lang.String r2 = "key == null"
            defpackage.C2264.m3673(r2)
            return r0
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.lang.Object remove(java.lang.Object r3) {
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L9
            r1 = 0
            ᛳᛸᛶᛷ r3 = r2.m1918(r3, r1)     // Catch: java.lang.ClassCastException -> L9
            goto La
        L9:
            r3 = r0
        La:
            if (r3 == 0) goto L10
            r1 = 1
            r2.m1917(r3, r1)
        L10:
            if (r3 == 0) goto L15
            java.lang.Object r2 = r3.f2600
            return r2
        L15:
            return r0
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
            r0 = this;
            int r0 = r0.f4377
            return r0
    }

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final void m1915(defpackage.C0527 r5) {
            r4 = this;
            ᛳᛸᛶᛷ r0 = r5.f2598
            ᛳᛸᛶᛷ r1 = r5.f2597
            ᛳᛸᛶᛷ r2 = r1.f2598
            ᛳᛸᛶᛷ r3 = r1.f2597
            r5.f2597 = r2
            if (r2 == 0) goto Le
            r2.f2599 = r5
        Le:
            r4.m1916(r5, r1)
            r1.f2598 = r5
            r5.f2599 = r1
            r4 = 0
            if (r0 == 0) goto L1b
            int r0 = r0.f2595
            goto L1c
        L1b:
            r0 = r4
        L1c:
            if (r2 == 0) goto L21
            int r2 = r2.f2595
            goto L22
        L21:
            r2 = r4
        L22:
            int r0 = java.lang.Math.max(r0, r2)
            int r0 = r0 + 1
            r5.f2595 = r0
            if (r3 == 0) goto L2e
            int r4 = r3.f2595
        L2e:
            int r4 = java.lang.Math.max(r0, r4)
            int r4 = r4 + 1
            r1.f2595 = r4
            return
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final void m1916(defpackage.C0527 r3, defpackage.C0527 r4) {
            r2 = this;
            ᛳᛸᛶᛷ r0 = r3.f2599
            r1 = 0
            r3.f2599 = r1
            if (r4 == 0) goto L9
            r4.f2599 = r0
        L9:
            if (r0 == 0) goto L15
            ᛳᛸᛶᛷ r2 = r0.f2598
            if (r2 != r3) goto L12
            r0.f2598 = r4
            return
        L12:
            r0.f2597 = r4
            return
        L15:
            r2.f4373 = r4
            return
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final void m1917(defpackage.C0527 r7, boolean r8) {
            r6 = this;
            if (r8 == 0) goto Lc
            ᛳᛸᛶᛷ r8 = r7.f2602
            ᛳᛸᛶᛷ r0 = r7.f2601
            r8.f2601 = r0
            ᛳᛸᛶᛷ r0 = r7.f2601
            r0.f2602 = r8
        Lc:
            ᛳᛸᛶᛷ r8 = r7.f2598
            ᛳᛸᛶᛷ r0 = r7.f2597
            ᛳᛸᛶᛷ r1 = r7.f2599
            r2 = 0
            r3 = 0
            if (r8 == 0) goto L5c
            if (r0 == 0) goto L5c
            int r1 = r8.f2595
            int r4 = r0.f2595
            if (r1 <= r4) goto L28
            ᛳᛸᛶᛷ r0 = r8.f2597
        L20:
            r5 = r0
            r0 = r8
            r8 = r5
            if (r8 == 0) goto L33
            ᛳᛸᛶᛷ r0 = r8.f2597
            goto L20
        L28:
            ᛳᛸᛶᛷ r8 = r0.f2598
        L2a:
            r5 = r0
            r0 = r8
            r8 = r5
            if (r0 == 0) goto L32
            ᛳᛸᛶᛷ r8 = r0.f2598
            goto L2a
        L32:
            r0 = r8
        L33:
            r6.m1917(r0, r2)
            ᛳᛸᛶᛷ r8 = r7.f2598
            if (r8 == 0) goto L43
            int r1 = r8.f2595
            r0.f2598 = r8
            r8.f2599 = r0
            r7.f2598 = r3
            goto L44
        L43:
            r1 = r2
        L44:
            ᛳᛸᛶᛷ r8 = r7.f2597
            if (r8 == 0) goto L50
            int r2 = r8.f2595
            r0.f2597 = r8
            r8.f2599 = r0
            r7.f2597 = r3
        L50:
            int r8 = java.lang.Math.max(r1, r2)
            int r8 = r8 + 1
            r0.f2595 = r8
            r6.m1916(r7, r0)
            return
        L5c:
            if (r8 == 0) goto L64
            r6.m1916(r7, r8)
            r7.f2598 = r3
            goto L6f
        L64:
            if (r0 == 0) goto L6c
            r6.m1916(r7, r0)
            r7.f2597 = r3
            goto L6f
        L6c:
            r6.m1916(r7, r3)
        L6f:
            r6.m1919(r1, r2)
            int r7 = r6.f4377
            int r7 = r7 + (-1)
            r6.f4377 = r7
            int r7 = r6.f4378
            int r7 = r7 + 1
            r6.f4378 = r7
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final defpackage.C0527 m1918(java.lang.Object r13, boolean r14) {
            r12 = this;
            ᛳᛸᛶᛷ r0 = r12.f4373
            r1 = 0
            ᲇᛵᲀᲇ r2 = defpackage.C0977.f4370
            java.util.Comparator r3 = r12.f4375
            if (r0 == 0) goto L2d
            if (r3 != r2) goto Lf
            r4 = r13
            java.lang.Comparable r4 = (java.lang.Comparable) r4
            goto L10
        Lf:
            r4 = r1
        L10:
            java.lang.Object r5 = r0.f2594
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
            ᛳᛸᛶᛷ r6 = r0.f2598
            goto L27
        L25:
            ᛳᛸᛶᛷ r6 = r0.f2597
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
            ᛳᛸᛶᛷ r10 = r12.f4371
            if (r8 != 0) goto L5f
            if (r3 != r2) goto L52
            boolean r0 = r13 instanceof java.lang.Comparable
            if (r0 == 0) goto L3e
            goto L52
        L3e:
            java.lang.ClassCastException r12 = new java.lang.ClassCastException
            java.lang.Class r13 = r13.getClass()
            java.lang.String r13 = r13.getName()
            java.lang.String r14 = " is not Comparable"
            java.lang.String r13 = r13.concat(r14)
            r12.<init>(r13)
            throw r12
        L52:
            ᛳᛸᛶᛷ r6 = new ᛳᛸᛶᛷ
            boolean r7 = r12.f4374
            ᛳᛸᛶᛷ r11 = r10.f2602
            r9 = r13
            r6.<init>(r7, r8, r9, r10, r11)
            r12.f4373 = r6
            goto L73
        L5f:
            r9 = r13
            ᛳᛸᛶᛷ r6 = new ᛳᛸᛶᛷ
            boolean r7 = r12.f4374
            ᛳᛸᛶᛷ r11 = r10.f2602
            r6.<init>(r7, r8, r9, r10, r11)
            if (r5 >= 0) goto L6e
            r8.f2598 = r6
            goto L70
        L6e:
            r8.f2597 = r6
        L70:
            r12.m1919(r8, r14)
        L73:
            int r13 = r12.f4377
            int r13 = r13 + r14
            r12.f4377 = r13
            int r13 = r12.f4378
            int r13 = r13 + r14
            r12.f4378 = r13
            return r6
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final void m1919(defpackage.C0527 r8, boolean r9) {
            r7 = this;
        L0:
            if (r8 == 0) goto L79
            ᛳᛸᛶᛷ r0 = r8.f2598
            ᛳᛸᛶᛷ r1 = r8.f2597
            r2 = 0
            if (r0 == 0) goto Lc
            int r3 = r0.f2595
            goto Ld
        Lc:
            r3 = r2
        Ld:
            if (r1 == 0) goto L12
            int r4 = r1.f2595
            goto L13
        L12:
            r4 = r2
        L13:
            int r5 = r3 - r4
            r6 = -2
            if (r5 != r6) goto L3c
            ᛳᛸᛶᛷ r0 = r1.f2598
            ᛳᛸᛶᛷ r3 = r1.f2597
            if (r3 == 0) goto L21
            int r3 = r3.f2595
            goto L22
        L21:
            r3 = r2
        L22:
            if (r0 == 0) goto L26
            int r2 = r0.f2595
        L26:
            int r2 = r2 - r3
            r0 = -1
            if (r2 == r0) goto L36
            if (r2 != 0) goto L2f
            if (r9 != 0) goto L2f
            goto L36
        L2f:
            r7.m1920(r1)
            r7.m1915(r8)
            goto L39
        L36:
            r7.m1915(r8)
        L39:
            if (r9 == 0) goto L76
            goto L79
        L3c:
            r1 = 2
            r6 = 1
            if (r5 != r1) goto L63
            ᛳᛸᛶᛷ r1 = r0.f2598
            ᛳᛸᛶᛷ r3 = r0.f2597
            if (r3 == 0) goto L49
            int r3 = r3.f2595
            goto L4a
        L49:
            r3 = r2
        L4a:
            if (r1 == 0) goto L4e
            int r2 = r1.f2595
        L4e:
            int r2 = r2 - r3
            if (r2 == r6) goto L5d
            if (r2 != 0) goto L56
            if (r9 != 0) goto L56
            goto L5d
        L56:
            r7.m1915(r0)
            r7.m1920(r8)
            goto L60
        L5d:
            r7.m1920(r8)
        L60:
            if (r9 == 0) goto L76
            goto L79
        L63:
            if (r5 != 0) goto L6c
            int r3 = r3 + 1
            r8.f2595 = r3
            if (r9 == 0) goto L76
            goto L79
        L6c:
            int r0 = java.lang.Math.max(r3, r4)
            int r0 = r0 + r6
            r8.f2595 = r0
            if (r9 != 0) goto L76
            goto L79
        L76:
            ᛳᛸᛶᛷ r8 = r8.f2599
            goto L0
        L79:
            return
    }

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final void m1920(defpackage.C0527 r5) {
            r4 = this;
            ᛳᛸᛶᛷ r0 = r5.f2598
            ᛳᛸᛶᛷ r1 = r5.f2597
            ᛳᛸᛶᛷ r2 = r0.f2598
            ᛳᛸᛶᛷ r3 = r0.f2597
            r5.f2598 = r3
            if (r3 == 0) goto Le
            r3.f2599 = r5
        Le:
            r4.m1916(r5, r0)
            r0.f2597 = r5
            r5.f2599 = r0
            r4 = 0
            if (r1 == 0) goto L1b
            int r1 = r1.f2595
            goto L1c
        L1b:
            r1 = r4
        L1c:
            if (r3 == 0) goto L21
            int r3 = r3.f2595
            goto L22
        L21:
            r3 = r4
        L22:
            int r1 = java.lang.Math.max(r1, r3)
            int r1 = r1 + 1
            r5.f2595 = r1
            if (r2 == 0) goto L2e
            int r4 = r2.f2595
        L2e:
            int r4 = java.lang.Math.max(r1, r4)
            int r4 = r4 + 1
            r0.f2595 = r4
            return
    }
}
