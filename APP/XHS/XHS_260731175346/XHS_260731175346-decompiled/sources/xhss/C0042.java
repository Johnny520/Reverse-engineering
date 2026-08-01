package xhss;

/* JADX INFO: renamed from: xhss.ᛱᛴᲈᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0042 extends java.util.AbstractMap implements java.io.Serializable {

    /* JADX INFO: renamed from: ᛸᛷᲈᲈ, reason: contains not printable characters */
    public static final xhss.C0738 f274 = null;

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final java.util.Comparator f275;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final boolean f276;

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public int f277;

    /* JADX INFO: renamed from: ᛸᛲᲀᛵ, reason: contains not printable characters */
    public xhss.C0568 f278;

    /* JADX INFO: renamed from: ᛸᛴᛶᛳ, reason: contains not printable characters */
    public xhss.C0568 f279;

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public final xhss.C0445 f280;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public xhss.C0445 f281;

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public int f282;

    static {
            xhss.ᛸᛲᲇᲁ r0 = new xhss.ᛸᛲᲇᲁ
            r1 = 5
            r0.<init>(r1)
            xhss.C0042.f274 = r0
            return
    }

    public C0042(boolean r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f277 = r0
            r1.f282 = r0
            xhss.ᛸᛲᲇᲁ r0 = xhss.C0042.f274
            r1.f275 = r0
            r1.f276 = r2
            xhss.ᛵᛲᛶᛵ r0 = new xhss.ᛵᛲᛶᛵ
            r0.<init>(r2)
            r1.f280 = r0
            return
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
            r1 = this;
            r0 = 0
            r1.f281 = r0
            r0 = 0
            r1.f277 = r0
            int r0 = r1.f282
            int r0 = r0 + 1
            r1.f282 = r0
            xhss.ᛵᛲᛶᛵ r1 = r1.f280
            r1.f1591 = r1
            r1.f1585 = r1
            return
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(java.lang.Object r3) {
            r2 = this;
            r0 = 0
            r1 = 0
            if (r3 == 0) goto L8
            xhss.ᛵᛲᛶᛵ r1 = r2.m157(r3, r0)     // Catch: java.lang.ClassCastException -> L8
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
            xhss.ᛶᛶᛷᲈ r0 = r2.f279
            if (r0 != 0) goto Lc
            xhss.ᛶᛶᛷᲈ r0 = new xhss.ᛶᛶᛷᲈ
            r1 = 0
            r0.<init>(r2, r1)
            r2.f279 = r0
        Lc:
            return r0
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.lang.Object get(java.lang.Object r3) {
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L9
            r1 = 0
            xhss.ᛵᛲᛶᛵ r2 = r2.m157(r3, r1)     // Catch: java.lang.ClassCastException -> L9
            goto La
        L9:
            r2 = r0
        La:
            if (r2 == 0) goto Lf
            java.lang.Object r2 = r2.f1586
            return r2
        Lf:
            return r0
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set keySet() {
            r2 = this;
            xhss.ᛶᛶᛷᲈ r0 = r2.f278
            if (r0 != 0) goto Lc
            xhss.ᛶᛶᛷᲈ r0 = new xhss.ᛶᛶᛷᲈ
            r1 = 1
            r0.<init>(r2, r1)
            r2.f278 = r0
        Lc:
            return r0
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.lang.Object put(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L1a
            if (r4 != 0) goto L10
            boolean r1 = r2.f276
            if (r1 == 0) goto La
            goto L10
        La:
            java.lang.String r2 = "value == null"
            xhss.C0532.m953(r2)
            return r0
        L10:
            r0 = 1
            xhss.ᛵᛲᛶᛵ r2 = r2.m157(r3, r0)
            java.lang.Object r3 = r2.f1586
            r2.f1586 = r4
            return r3
        L1a:
            java.lang.String r2 = "key == null"
            xhss.C0532.m953(r2)
            return r0
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.lang.Object remove(java.lang.Object r3) {
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L9
            r1 = 0
            xhss.ᛵᛲᛶᛵ r3 = r2.m157(r3, r1)     // Catch: java.lang.ClassCastException -> L9
            goto La
        L9:
            r3 = r0
        La:
            if (r3 == 0) goto L10
            r1 = 1
            r2.m155(r3, r1)
        L10:
            if (r3 == 0) goto L15
            java.lang.Object r2 = r3.f1586
            return r2
        L15:
            return r0
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
            r0 = this;
            int r0 = r0.f277
            return r0
    }

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final void m154(xhss.C0445 r8, boolean r9) {
            r7 = this;
        L0:
            if (r8 == 0) goto L79
            xhss.ᛵᛲᛶᛵ r0 = r8.f1584
            xhss.ᛵᛲᛶᛵ r1 = r8.f1590
            r2 = 0
            if (r0 == 0) goto Lc
            int r3 = r0.f1588
            goto Ld
        Lc:
            r3 = r2
        Ld:
            if (r1 == 0) goto L12
            int r4 = r1.f1588
            goto L13
        L12:
            r4 = r2
        L13:
            int r5 = r3 - r4
            r6 = -2
            if (r5 != r6) goto L3c
            xhss.ᛵᛲᛶᛵ r0 = r1.f1584
            xhss.ᛵᛲᛶᛵ r3 = r1.f1590
            if (r3 == 0) goto L21
            int r3 = r3.f1588
            goto L22
        L21:
            r3 = r2
        L22:
            if (r0 == 0) goto L26
            int r2 = r0.f1588
        L26:
            int r2 = r2 - r3
            r0 = -1
            if (r2 == r0) goto L36
            if (r2 != 0) goto L2f
            if (r9 != 0) goto L2f
            goto L36
        L2f:
            r7.m159(r1)
            r7.m156(r8)
            goto L39
        L36:
            r7.m156(r8)
        L39:
            if (r9 == 0) goto L76
            goto L79
        L3c:
            r1 = 2
            r6 = 1
            if (r5 != r1) goto L63
            xhss.ᛵᛲᛶᛵ r1 = r0.f1584
            xhss.ᛵᛲᛶᛵ r3 = r0.f1590
            if (r3 == 0) goto L49
            int r3 = r3.f1588
            goto L4a
        L49:
            r3 = r2
        L4a:
            if (r1 == 0) goto L4e
            int r2 = r1.f1588
        L4e:
            int r2 = r2 - r3
            if (r2 == r6) goto L5d
            if (r2 != 0) goto L56
            if (r9 != 0) goto L56
            goto L5d
        L56:
            r7.m156(r0)
            r7.m159(r8)
            goto L60
        L5d:
            r7.m159(r8)
        L60:
            if (r9 == 0) goto L76
            goto L79
        L63:
            if (r5 != 0) goto L6c
            int r3 = r3 + 1
            r8.f1588 = r3
            if (r9 == 0) goto L76
            goto L79
        L6c:
            int r0 = java.lang.Math.max(r3, r4)
            int r0 = r0 + r6
            r8.f1588 = r0
            if (r9 != 0) goto L76
            goto L79
        L76:
            xhss.ᛵᛲᛶᛵ r8 = r8.f1583
            goto L0
        L79:
            return
    }

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final void m155(xhss.C0445 r7, boolean r8) {
            r6 = this;
            if (r8 == 0) goto Lc
            xhss.ᛵᛲᛶᛵ r8 = r7.f1591
            xhss.ᛵᛲᛶᛵ r0 = r7.f1585
            r8.f1585 = r0
            xhss.ᛵᛲᛶᛵ r0 = r7.f1585
            r0.f1591 = r8
        Lc:
            xhss.ᛵᛲᛶᛵ r8 = r7.f1584
            xhss.ᛵᛲᛶᛵ r0 = r7.f1590
            xhss.ᛵᛲᛶᛵ r1 = r7.f1583
            r2 = 0
            r3 = 0
            if (r8 == 0) goto L5c
            if (r0 == 0) goto L5c
            int r1 = r8.f1588
            int r4 = r0.f1588
            if (r1 <= r4) goto L28
            xhss.ᛵᛲᛶᛵ r0 = r8.f1590
        L20:
            r5 = r0
            r0 = r8
            r8 = r5
            if (r8 == 0) goto L33
            xhss.ᛵᛲᛶᛵ r0 = r8.f1590
            goto L20
        L28:
            xhss.ᛵᛲᛶᛵ r8 = r0.f1584
        L2a:
            r5 = r0
            r0 = r8
            r8 = r5
            if (r0 == 0) goto L32
            xhss.ᛵᛲᛶᛵ r8 = r0.f1584
            goto L2a
        L32:
            r0 = r8
        L33:
            r6.m155(r0, r2)
            xhss.ᛵᛲᛶᛵ r8 = r7.f1584
            if (r8 == 0) goto L43
            int r1 = r8.f1588
            r0.f1584 = r8
            r8.f1583 = r0
            r7.f1584 = r3
            goto L44
        L43:
            r1 = r2
        L44:
            xhss.ᛵᛲᛶᛵ r8 = r7.f1590
            if (r8 == 0) goto L50
            int r2 = r8.f1588
            r0.f1590 = r8
            r8.f1583 = r0
            r7.f1590 = r3
        L50:
            int r8 = java.lang.Math.max(r1, r2)
            int r8 = r8 + 1
            r0.f1588 = r8
            r6.m158(r7, r0)
            return
        L5c:
            if (r8 == 0) goto L64
            r6.m158(r7, r8)
            r7.f1584 = r3
            goto L6f
        L64:
            if (r0 == 0) goto L6c
            r6.m158(r7, r0)
            r7.f1590 = r3
            goto L6f
        L6c:
            r6.m158(r7, r3)
        L6f:
            r6.m154(r1, r2)
            int r7 = r6.f277
            int r7 = r7 + (-1)
            r6.f277 = r7
            int r7 = r6.f282
            int r7 = r7 + 1
            r6.f282 = r7
            return
    }

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public final void m156(xhss.C0445 r5) {
            r4 = this;
            xhss.ᛵᛲᛶᛵ r0 = r5.f1584
            xhss.ᛵᛲᛶᛵ r1 = r5.f1590
            xhss.ᛵᛲᛶᛵ r2 = r1.f1584
            xhss.ᛵᛲᛶᛵ r3 = r1.f1590
            r5.f1590 = r2
            if (r2 == 0) goto Le
            r2.f1583 = r5
        Le:
            r4.m158(r5, r1)
            r1.f1584 = r5
            r5.f1583 = r1
            r4 = 0
            if (r0 == 0) goto L1b
            int r0 = r0.f1588
            goto L1c
        L1b:
            r0 = r4
        L1c:
            if (r2 == 0) goto L21
            int r2 = r2.f1588
            goto L22
        L21:
            r2 = r4
        L22:
            int r0 = java.lang.Math.max(r0, r2)
            int r0 = r0 + 1
            r5.f1588 = r0
            if (r3 == 0) goto L2e
            int r4 = r3.f1588
        L2e:
            int r4 = java.lang.Math.max(r0, r4)
            int r4 = r4 + 1
            r1.f1588 = r4
            return
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final xhss.C0445 m157(java.lang.Object r13, boolean r14) {
            r12 = this;
            xhss.ᛵᛲᛶᛵ r0 = r12.f281
            r1 = 0
            xhss.ᛸᛲᲇᲁ r2 = xhss.C0042.f274
            java.util.Comparator r3 = r12.f275
            if (r0 == 0) goto L2d
            if (r3 != r2) goto Lf
            r4 = r13
            java.lang.Comparable r4 = (java.lang.Comparable) r4
            goto L10
        Lf:
            r4 = r1
        L10:
            java.lang.Object r5 = r0.f1589
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
            xhss.ᛵᛲᛶᛵ r6 = r0.f1584
            goto L27
        L25:
            xhss.ᛵᛲᛶᛵ r6 = r0.f1590
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
            xhss.ᛵᛲᛶᛵ r10 = r12.f280
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
            xhss.ᛵᛲᛶᛵ r6 = new xhss.ᛵᛲᛶᛵ
            boolean r7 = r12.f276
            xhss.ᛵᛲᛶᛵ r11 = r10.f1591
            r9 = r13
            r6.<init>(r7, r8, r9, r10, r11)
            r12.f281 = r6
            goto L73
        L5f:
            r9 = r13
            xhss.ᛵᛲᛶᛵ r6 = new xhss.ᛵᛲᛶᛵ
            boolean r7 = r12.f276
            xhss.ᛵᛲᛶᛵ r11 = r10.f1591
            r6.<init>(r7, r8, r9, r10, r11)
            if (r5 >= 0) goto L6e
            r8.f1584 = r6
            goto L70
        L6e:
            r8.f1590 = r6
        L70:
            r12.m154(r8, r14)
        L73:
            int r13 = r12.f277
            int r13 = r13 + r14
            r12.f277 = r13
            int r13 = r12.f282
            int r13 = r13 + r14
            r12.f282 = r13
            return r6
    }

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final void m158(xhss.C0445 r3, xhss.C0445 r4) {
            r2 = this;
            xhss.ᛵᛲᛶᛵ r0 = r3.f1583
            r1 = 0
            r3.f1583 = r1
            if (r4 == 0) goto L9
            r4.f1583 = r0
        L9:
            if (r0 == 0) goto L15
            xhss.ᛵᛲᛶᛵ r2 = r0.f1584
            if (r2 != r3) goto L12
            r0.f1584 = r4
            return
        L12:
            r0.f1590 = r4
            return
        L15:
            r2.f281 = r4
            return
    }

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public final void m159(xhss.C0445 r5) {
            r4 = this;
            xhss.ᛵᛲᛶᛵ r0 = r5.f1584
            xhss.ᛵᛲᛶᛵ r1 = r5.f1590
            xhss.ᛵᛲᛶᛵ r2 = r0.f1584
            xhss.ᛵᛲᛶᛵ r3 = r0.f1590
            r5.f1584 = r3
            if (r3 == 0) goto Le
            r3.f1583 = r5
        Le:
            r4.m158(r5, r0)
            r0.f1590 = r5
            r5.f1583 = r0
            r4 = 0
            if (r1 == 0) goto L1b
            int r1 = r1.f1588
            goto L1c
        L1b:
            r1 = r4
        L1c:
            if (r3 == 0) goto L21
            int r3 = r3.f1588
            goto L22
        L21:
            r3 = r4
        L22:
            int r1 = java.lang.Math.max(r1, r3)
            int r1 = r1 + 1
            r5.f1588 = r1
            if (r2 == 0) goto L2e
            int r4 = r2.f1588
        L2e:
            int r4 = java.lang.Math.max(r1, r4)
            int r4 = r4 + 1
            r0.f1588 = r4
            return
    }
}
