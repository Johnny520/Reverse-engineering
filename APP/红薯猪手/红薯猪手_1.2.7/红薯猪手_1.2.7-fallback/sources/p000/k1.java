package p000;

/* JADX INFO: loaded from: classes.dex */
public final class k1 implements p000.z9<p000.g4> {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final java.lang.CharSequence f626;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final int f627;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final int f628;

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public final p000.h3<java.lang.CharSequence, java.lang.Integer, p000.q7<java.lang.Integer, java.lang.Integer>> f629;

    public static final class a implements java.util.Iterator<p000.g4>, p000.n4 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public int f630;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public int f631;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public int f632;

        /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
        public p000.g4 f633;

        /* JADX INFO: renamed from: ۥ۟ۡ, reason: contains not printable characters */
        public int f634;

        /* JADX INFO: renamed from: ۥ۟ۢ, reason: contains not printable characters */
        public final /* synthetic */ p000.k1 f635;

        public a(p000.k1 r5) {
                r4 = this;
                r4.f635 = r5
                r4.<init>()
                r0 = -1
                r4.f630 = r0
                int r0 = r5.f627
                r1 = 0
                java.lang.CharSequence r5 = r5.f626
                int r5 = r5.length()
                if (r5 < 0) goto L1f
                if (r0 >= 0) goto L17
                r0 = r1
                goto L1a
            L17:
                if (r0 <= r5) goto L1a
                r0 = r5
            L1a:
                r4.f631 = r0
                r4.f632 = r0
                return
            L1f:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Cannot coerce value to an empty range: maximum "
                r2.append(r3)
                r2.append(r5)
                java.lang.String r5 = " is less than minimum "
                r2.append(r5)
                r2.append(r1)
                r5 = 46
                r2.append(r5)
                java.lang.String r5 = r2.toString()
                r0.<init>(r5)
                throw r0
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
                r2 = this;
                int r0 = r2.f630
                r1 = -1
                if (r0 != r1) goto L8
                r2.m225()
            L8:
                int r0 = r2.f630
                r1 = 1
                if (r0 != r1) goto Le
                goto Lf
            Le:
                r1 = 0
            Lf:
                return r1
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.Iterator
        public final p000.g4 next() {
                r3 = this;
                int r0 = r3.f630
                r1 = -1
                if (r0 != r1) goto L8
                r3.m225()
            L8:
                int r0 = r3.f630
                if (r0 == 0) goto L19
                ۟.g4 r0 = r3.f633
                java.lang.String r2 = "null cannot be cast to non-null type kotlin.ranges.IntRange"
                p000.h4.m187(r2, r0)
                r2 = 0
                r3.f633 = r2
                r3.f630 = r1
                return r0
            L19:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
        }

        @Override // java.util.Iterator
        public final void remove() {
                r2 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "Operation is not supported for read-only collection"
                r0.<init>(r1)
                throw r0
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final void m225() {
                r7 = this;
                int r0 = r7.f632
                r1 = 0
                if (r0 >= 0) goto Lc
                r7.f630 = r1
                r0 = 0
                r7.f633 = r0
                goto L89
            Lc:
                ۟.k1 r2 = r7.f635
                int r3 = r2.f628
                r4 = 1
                if (r3 <= 0) goto L1a
                int r5 = r7.f634
                int r5 = r5 + r4
                r7.f634 = r5
                if (r5 >= r3) goto L22
            L1a:
                java.lang.CharSequence r2 = r2.f626
                int r2 = r2.length()
                if (r0 <= r2) goto L32
            L22:
                ۟.g4 r0 = new ۟.g4
                int r1 = r7.f631
                ۟.k1 r2 = r7.f635
                java.lang.CharSequence r2 = r2.f626
                int r2 = p000.va.m439(r2)
                r0.<init>(r1, r2)
                goto L55
            L32:
                ۟.k1 r0 = r7.f635
                ۟.h3<java.lang.CharSequence, java.lang.Integer, ۟.q7<java.lang.Integer, java.lang.Integer>> r2 = r0.f629
                java.lang.CharSequence r0 = r0.f626
                int r3 = r7.f632
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                java.lang.Object r0 = r2.mo184(r0, r3)
                ۟.q7 r0 = (p000.q7) r0
                if (r0 != 0) goto L5b
                ۟.g4 r0 = new ۟.g4
                int r1 = r7.f631
                ۟.k1 r2 = r7.f635
                java.lang.CharSequence r2 = r2.f626
                int r2 = p000.va.m439(r2)
                r0.<init>(r1, r2)
            L55:
                r7.f633 = r0
                r0 = -1
                r7.f632 = r0
                goto L87
            L5b:
                A r2 = r0.f918
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                B r0 = r0.f919
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r3 = r7.f631
                r5 = -2147483648(0xffffffff80000000, float:-0.0)
                if (r2 > r5) goto L74
                ۟.g4 r3 = p000.g4.f395
                goto L7c
            L74:
                ۟.g4 r5 = new ۟.g4
                int r6 = r2 + (-1)
                r5.<init>(r3, r6)
                r3 = r5
            L7c:
                r7.f633 = r3
                int r2 = r2 + r0
                r7.f631 = r2
                if (r0 != 0) goto L84
                r1 = r4
            L84:
                int r2 = r2 + r1
                r7.f632 = r2
            L87:
                r7.f630 = r4
            L89:
                return
        }
    }

    public k1(java.lang.CharSequence r2, int r3, int r4, p000.ua r5) {
            r1 = this;
            java.lang.String r0 = "input"
            p000.h4.m189(r0, r2)
            r1.<init>()
            r1.f626 = r2
            r1.f627 = r3
            r1.f628 = r4
            r1.f629 = r5
            return
    }

    @Override // p000.z9
    public final java.util.Iterator<p000.g4> iterator() {
            r1 = this;
            ۟.k1$a r0 = new ۟.k1$a
            r0.<init>(r1)
            return r0
    }
}
