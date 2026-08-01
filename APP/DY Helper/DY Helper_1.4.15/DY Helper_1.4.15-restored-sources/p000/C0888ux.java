package p000;

/* JADX INFO: renamed from: ux */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0888ux {

    /* JADX INFO: renamed from: α */
    public static final p000.C0888ux f10974 = null;

    /* JADX INFO: renamed from: β */
    private static final int f10975 = 6000;

    /* JADX INFO: renamed from: γ */
    private static final java.lang.Object f10976 = null;

    /* JADX INFO: renamed from: δ */
    private static final java.util.ArrayDeque<p000.C0888ux.C1157> f10977 = null;

    /* JADX INFO: renamed from: ε */
    public static final int f10978 = 0;

    /* JADX INFO: renamed from: ux$α, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
    public static final class C1157 {

        /* JADX INFO: renamed from: η */
        public static final int f10979 = 0;

        /* JADX INFO: renamed from: α */
        private final long f10980;

        /* JADX INFO: renamed from: β */
        private final java.lang.String f10981;

        /* JADX INFO: renamed from: γ */
        private final java.lang.String f10982;

        /* JADX INFO: renamed from: δ */
        private final java.lang.String f10983;

        /* JADX INFO: renamed from: ε */
        private final java.lang.String f10984;

        /* JADX INFO: renamed from: ζ */
        private final java.lang.String f10985;

        public C1157(long r1, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7) {
                r0 = this;
                r3.getClass()
                r4.getClass()
                r5.getClass()
                r6.getClass()
                r7.getClass()
                r0.<init>()
                r0.f10980 = r1
                r0.f10981 = r3
                r0.f10982 = r4
                r0.f10983 = r5
                r0.f10984 = r6
                r0.f10985 = r7
                return
        }

        public /* synthetic */ C1157(long r10, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, int r17, p000.AbstractC1067zq r18) {
                r9 = this;
                r0 = r17 & 32
                if (r0 == 0) goto Le
                java.lang.String r0 = ""
                r8 = r0
            L7:
                r1 = r9
                r2 = r10
                r4 = r12
                r5 = r13
                r6 = r14
                r7 = r15
                goto L11
            Le:
                r8 = r16
                goto L7
            L11:
                r1.<init>(r2, r4, r5, r6, r7, r8)
                return
        }

        /* JADX INFO: renamed from: θ */
        public static /* synthetic */ p000.C0888ux.C1157 m5993(p000.C0888ux.C1157 r8, long r9, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, int r16, java.lang.Object r17) {
                r0 = r16 & 1
                if (r0 == 0) goto L6
                long r9 = r8.f10980
            L6:
                r1 = r9
                r9 = r16 & 2
                if (r9 == 0) goto Ld
                java.lang.String r11 = r8.f10981
            Ld:
                r3 = r11
                r9 = r16 & 4
                if (r9 == 0) goto L14
                java.lang.String r12 = r8.f10982
            L14:
                r4 = r12
                r9 = r16 & 8
                if (r9 == 0) goto L1b
                java.lang.String r13 = r8.f10983
            L1b:
                r5 = r13
                r9 = r16 & 16
                if (r9 == 0) goto L22
                java.lang.String r14 = r8.f10984
            L22:
                r6 = r14
                r9 = r16 & 32
                if (r9 == 0) goto L29
                java.lang.String r15 = r8.f10985
            L29:
                r0 = r8
                r7 = r15
                ux$α r8 = r0.m6000(r1, r3, r4, r5, r6, r7)
                return r8
        }

        public boolean equals(java.lang.Object r8) {
                r7 = this;
                r0 = 1
                if (r7 != r8) goto L4
                return r0
            L4:
                boolean r1 = r8 instanceof p000.C0888ux.C1157
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                ux$α r8 = (p000.C0888ux.C1157) r8
                long r3 = r7.f10980
                long r5 = r8.f10980
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 == 0) goto L15
                return r2
            L15:
                java.lang.String r1 = r7.f10981
                java.lang.String r3 = r8.f10981
                boolean r1 = p000.ln0.m3626(r1, r3)
                if (r1 != 0) goto L20
                return r2
            L20:
                java.lang.String r1 = r7.f10982
                java.lang.String r3 = r8.f10982
                boolean r1 = p000.ln0.m3626(r1, r3)
                if (r1 != 0) goto L2b
                return r2
            L2b:
                java.lang.String r1 = r7.f10983
                java.lang.String r3 = r8.f10983
                boolean r1 = p000.ln0.m3626(r1, r3)
                if (r1 != 0) goto L36
                return r2
            L36:
                java.lang.String r1 = r7.f10984
                java.lang.String r3 = r8.f10984
                boolean r1 = p000.ln0.m3626(r1, r3)
                if (r1 != 0) goto L41
                return r2
            L41:
                java.lang.String r7 = r7.f10985
                java.lang.String r8 = r8.f10985
                boolean r7 = p000.ln0.m3626(r7, r8)
                if (r7 != 0) goto L4c
                return r2
            L4c:
                return r0
        }

        public int hashCode() {
                r3 = this;
                long r0 = r3.f10980
                int r0 = java.lang.Long.hashCode(r0)
                r1 = 31
                int r0 = r0 * r1
                java.lang.String r2 = r3.f10981
                int r0 = p000.a12.m15(r0, r1, r2)
                java.lang.String r2 = r3.f10982
                int r0 = p000.a12.m15(r0, r1, r2)
                java.lang.String r2 = r3.f10983
                int r0 = p000.a12.m15(r0, r1, r2)
                java.lang.String r2 = r3.f10984
                int r0 = p000.a12.m15(r0, r1, r2)
                java.lang.String r3 = r3.f10985
                int r3 = r3.hashCode()
                int r3 = r3 + r0
                return r3
        }

        public java.lang.String toString() {
                r8 = this;
                long r0 = r8.f10980
                java.lang.String r2 = r8.f10981
                java.lang.String r3 = r8.f10982
                java.lang.String r4 = r8.f10983
                java.lang.String r5 = r8.f10984
                java.lang.String r8 = r8.f10985
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                java.lang.String r7 = "Entry(timeMillis="
                r6.<init>(r7)
                r6.append(r0)
                java.lang.String r0 = ", threadName="
                r6.append(r0)
                r6.append(r2)
                java.lang.String r0 = ", level="
                java.lang.String r1 = ", tag="
                p000.AbstractC0602nx.m4119(r6, r0, r3, r1, r4)
                java.lang.String r0 = ", message="
                java.lang.String r1 = ", throwableText="
                p000.AbstractC0602nx.m4119(r6, r0, r5, r1, r8)
                java.lang.String r8 = ")"
                r6.append(r8)
                java.lang.String r8 = r6.toString()
                return r8
        }

        /* JADX INFO: renamed from: α */
        public final long m5994() {
                r2 = this;
                long r0 = r2.f10980
                return r0
        }

        /* JADX INFO: renamed from: β */
        public final java.lang.String m5995() {
                r0 = this;
                java.lang.String r0 = r0.f10981
                return r0
        }

        /* JADX INFO: renamed from: γ */
        public final java.lang.String m5996() {
                r0 = this;
                java.lang.String r0 = r0.f10982
                return r0
        }

        /* JADX INFO: renamed from: δ */
        public final java.lang.String m5997() {
                r0 = this;
                java.lang.String r0 = r0.f10983
                return r0
        }

        /* JADX INFO: renamed from: ε */
        public final java.lang.String m5998() {
                r0 = this;
                java.lang.String r0 = r0.f10984
                return r0
        }

        /* JADX INFO: renamed from: ζ */
        public final java.lang.String m5999() {
                r0 = this;
                java.lang.String r0 = r0.f10985
                return r0
        }

        /* JADX INFO: renamed from: η */
        public final p000.C0888ux.C1157 m6000(long r1, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7) {
                r0 = this;
                r3.getClass()
                r4.getClass()
                r5.getClass()
                r6.getClass()
                r7.getClass()
                ux$α r0 = new ux$α
                r0.<init>(r1, r3, r4, r5, r6, r7)
                return r0
        }

        /* JADX INFO: renamed from: ι */
        public final java.lang.String m6001() {
                r0 = this;
                java.lang.String r0 = r0.f10982
                return r0
        }

        /* JADX INFO: renamed from: κ */
        public final java.lang.String m6002() {
                r0 = this;
                java.lang.String r0 = r0.f10984
                return r0
        }

        /* JADX INFO: renamed from: λ */
        public final java.lang.String m6003() {
                r0 = this;
                java.lang.String r0 = r0.f10983
                return r0
        }

        /* JADX INFO: renamed from: μ */
        public final java.lang.String m6004() {
                r0 = this;
                java.lang.String r0 = r0.f10981
                return r0
        }

        /* JADX INFO: renamed from: ν */
        public final java.lang.String m6005() {
                r0 = this;
                java.lang.String r0 = r0.f10985
                return r0
        }

        /* JADX INFO: renamed from: ξ */
        public final long m6006() {
                r2 = this;
                long r0 = r2.f10980
                return r0
        }
    }

    static {
            ux r0 = new ux
            r0.<init>()
            p000.C0888ux.f10974 = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            p000.C0888ux.f10976 = r0
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            p000.C0888ux.f10977 = r0
            r0 = 8
            p000.C0888ux.f10978 = r0
            return
    }

    private C0888ux() {
            r0 = this;
            r0.<init>()
            return
    }

    @p000.InterfaceC0088bs
    /* JADX INFO: renamed from: Α */
    public static final void m5963(boolean r0) {
            return
    }

    /* JADX INFO: renamed from: Β */
    public static final boolean m5964() {
            r0 = 1
            return r0
    }

    /* JADX INFO: renamed from: Γ */
    public static final java.util.List<p000.C0888ux.C1157> m5965() {
            r0 = 0
            r1 = 1
            java.util.List r0 = m5967(r0, r1, r0)
            return r0
    }

    /* JADX INFO: renamed from: Δ */
    public static final java.util.List<p000.C0888ux.C1157> m5966(java.lang.String r6) {
            r6.getClass()
            java.lang.CharSequence r6 = p000.q02.m4660(r6)
            java.lang.String r6 = r6.toString()
            java.lang.Object r0 = p000.C0888ux.f10976
            monitor-enter(r0)
            java.util.ArrayDeque<ux$α> r1 = p000.C0888ux.f10977     // Catch: java.lang.Throwable -> L40
            java.util.List r1 = p000.AbstractC0984xh.m6666(r1)     // Catch: java.lang.Throwable -> L40
            boolean r2 = p000.q02.m4671(r6)     // Catch: java.lang.Throwable -> L40
            if (r2 == 0) goto L1b
            goto L43
        L1b:
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L40
            r2.<init>()     // Catch: java.lang.Throwable -> L40
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L40
        L24:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> L40
            if (r3 == 0) goto L42
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L40
            r4 = r3
            ux$α r4 = (p000.C0888ux.C1157) r4     // Catch: java.lang.Throwable -> L40
            java.lang.String r4 = r4.m6003()     // Catch: java.lang.Throwable -> L40
            r5 = 1
            boolean r4 = p000.q02.m4654(r4, r6, r5)     // Catch: java.lang.Throwable -> L40
            if (r4 == 0) goto L24
            r2.add(r3)     // Catch: java.lang.Throwable -> L40
            goto L24
        L40:
            r6 = move-exception
            goto L45
        L42:
            r1 = r2
        L43:
            monitor-exit(r0)
            return r1
        L45:
            monitor-exit(r0)
            throw r6
    }

    /* JADX INFO: renamed from: Ε */
    public static /* synthetic */ java.util.List m5967(java.lang.String r0, int r1, java.lang.Object r2) {
            r1 = r1 & 1
            if (r1 == 0) goto L6
            java.lang.String r0 = ""
        L6:
            java.util.List r0 = m5966(r0)
            return r0
    }

    /* JADX INFO: renamed from: Ζ */
    public static final java.util.List<java.lang.String> m5968() {
            java.lang.Object r0 = p000.C0888ux.f10976
            monitor-enter(r0)
            java.util.ArrayDeque<ux$α> r1 = p000.C0888ux.f10977     // Catch: java.lang.Throwable -> L28
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L28
            r3 = 10
            int r3 = p000.AbstractC1021yh.m6889(r1, r3)     // Catch: java.lang.Throwable -> L28
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L28
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L28
        L14:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> L28
            if (r3 == 0) goto L2a
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L28
            ux$α r3 = (p000.C0888ux.C1157) r3     // Catch: java.lang.Throwable -> L28
            java.lang.String r3 = r3.m6003()     // Catch: java.lang.Throwable -> L28
            r2.add(r3)     // Catch: java.lang.Throwable -> L28
            goto L14
        L28:
            r1 = move-exception
            goto L59
        L2a:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L28
            r1.<init>()     // Catch: java.lang.Throwable -> L28
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L28
        L33:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L28
            if (r3 == 0) goto L4a
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L28
            r4 = r3
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L28
            boolean r4 = p000.q02.m4671(r4)     // Catch: java.lang.Throwable -> L28
            if (r4 != 0) goto L33
            r1.add(r3)     // Catch: java.lang.Throwable -> L28
            goto L33
        L4a:
            java.util.List r1 = p000.AbstractC0984xh.m6633(r1)     // Catch: java.lang.Throwable -> L28
            java.util.Comparator r2 = java.lang.String.CASE_INSENSITIVE_ORDER     // Catch: java.lang.Throwable -> L28
            r2.getClass()     // Catch: java.lang.Throwable -> L28
            java.util.List r1 = p000.AbstractC0984xh.m6658(r1, r2)     // Catch: java.lang.Throwable -> L28
            monitor-exit(r0)
            return r1
        L59:
            monitor-exit(r0)
            throw r1
    }

    /* JADX INFO: renamed from: α */
    public static /* synthetic */ java.lang.CharSequence m5969(p000.C0888ux.C1157 r0, java.lang.String r1) {
            java.lang.CharSequence r0 = m5976(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: β */
    public static /* synthetic */ java.lang.CharSequence m5970(p000.C0888ux.C1157 r0, java.lang.String r1) {
            java.lang.CharSequence r0 = m5989(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: γ */
    public static /* synthetic */ java.lang.CharSequence m5971(p000.C0888ux.C1157 r0, java.lang.String r1) {
            java.lang.CharSequence r0 = m5981(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: δ */
    private final p000.C0888ux.C1157 m5972(java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.Throwable r12) {
            r8 = this;
            long r1 = java.lang.System.currentTimeMillis()
            java.lang.Thread r8 = java.lang.Thread.currentThread()
            java.lang.String r8 = r8.getName()
            if (r8 != 0) goto L10
            java.lang.String r8 = ""
        L10:
            r3 = r8
            if (r12 == 0) goto L18
            java.lang.String r8 = android.util.Log.getStackTraceString(r12)
            goto L19
        L18:
            r8 = 0
        L19:
            if (r8 != 0) goto L1d
            java.lang.String r8 = ""
        L1d:
            r7 = r8
            ux$α r0 = new ux$α
            r4 = r9
            r5 = r10
            r6 = r11
            r0.<init>(r1, r3, r4, r5, r6, r7)
            java.lang.Object r8 = p000.C0888ux.f10976
            monitor-enter(r8)
        L29:
            java.util.ArrayDeque<ux$α> r9 = p000.C0888ux.f10977     // Catch: java.lang.Throwable -> L37
            int r10 = r9.size()     // Catch: java.lang.Throwable -> L37
            r11 = 6000(0x1770, float:8.408E-42)
            if (r10 < r11) goto L3a
            r9.removeFirst()     // Catch: java.lang.Throwable -> L37
            goto L29
        L37:
            r0 = move-exception
            r9 = r0
            goto L3f
        L3a:
            r9.addLast(r0)     // Catch: java.lang.Throwable -> L37
            monitor-exit(r8)
            return r0
        L3f:
            monitor-exit(r8)
            throw r9
    }

    /* JADX INFO: renamed from: ε */
    public static final void m5973() {
            java.lang.Object r0 = p000.C0888ux.f10976
            monitor-enter(r0)
            java.util.ArrayDeque<ux$α> r1 = p000.C0888ux.f10977     // Catch: java.lang.Throwable -> La
            r1.clear()     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)
            return
        La:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    /* JADX INFO: renamed from: ζ */
    public static final void m5974(java.lang.String r3) {
            r3.getClass()
            r0 = 6
            r1 = 58
            r2 = 0
            int r0 = p000.q02.m4668(r3, r1, r2, r0)
            if (r0 <= 0) goto L1a
            java.lang.String r1 = r3.substring(r2, r0)
            java.lang.CharSequence r1 = p000.q02.m4660(r1)
            java.lang.String r1 = r1.toString()
            goto L1c
        L1a:
            java.lang.String r1 = "DyLog"
        L1c:
            if (r0 <= 0) goto L2c
            int r0 = r0 + 1
            java.lang.String r3 = r3.substring(r0)
            java.lang.CharSequence r3 = p000.q02.m4660(r3)
            java.lang.String r3 = r3.toString()
        L2c:
            m5975(r1, r3)
            return
    }

    /* JADX INFO: renamed from: η */
    public static final void m5975(java.lang.String r8, java.lang.String r9) {
            r8.getClass()
            r9.getClass()
            ux r0 = p000.C0888ux.f10974
            java.lang.String r1 = "D"
            r2 = 0
            ux$α r8 = r0.m5972(r1, r8, r9, r2)
            r0 = 10
            boolean r0 = p000.q02.m4655(r9, r0)     // Catch: java.lang.Throwable -> L4e
            if (r0 == 0) goto L2d
            java.util.List r1 = p000.q02.m4675(r9)     // Catch: java.lang.Throwable -> L4e
            java.lang.String r2 = "\n"
            tx r6 = new tx     // Catch: java.lang.Throwable -> L4e
            r9 = 0
            r6.<init>(r8, r9)     // Catch: java.lang.Throwable -> L4e
            r7 = 30
            r3 = 0
            r4 = 0
            r5 = 0
            java.lang.String r8 = p000.AbstractC0984xh.m6644(r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L4e
            goto L49
        L2d:
            java.lang.String r9 = r8.m6003()     // Catch: java.lang.Throwable -> L4e
            java.lang.String r8 = r8.m6002()     // Catch: java.lang.Throwable -> L4e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4e
            r0.<init>()     // Catch: java.lang.Throwable -> L4e
            r0.append(r9)     // Catch: java.lang.Throwable -> L4e
            java.lang.String r9 = ": "
            r0.append(r9)     // Catch: java.lang.Throwable -> L4e
            r0.append(r8)     // Catch: java.lang.Throwable -> L4e
            java.lang.String r8 = r0.toString()     // Catch: java.lang.Throwable -> L4e
        L49:
            xq0 r9 = p000.xq0.f12253     // Catch: java.lang.Throwable -> L4e
            r9.m6777(r8)     // Catch: java.lang.Throwable -> L4e
        L4e:
            return
    }

    /* JADX INFO: renamed from: θ */
    private static final java.lang.CharSequence m5976(p000.C0888ux.C1157 r1, java.lang.String r2) {
            r2.getClass()
            java.lang.String r1 = r1.m6003()
            java.lang.String r0 = ": "
            java.lang.String r1 = p000.lz1.m3688(r1, r0, r2)
            return r1
    }

    /* JADX INFO: renamed from: ι */
    public static final void m5977(java.lang.String r8, java.lang.String r9, java.lang.Throwable r10) {
            r8.getClass()
            r9.getClass()
            ux r0 = p000.C0888ux.f10974
            java.lang.String r1 = "E"
            ux$α r8 = r0.m5972(r1, r8, r9, r10)
            r0 = 10
            boolean r0 = p000.q02.m4655(r9, r0)     // Catch: java.lang.Throwable -> L52
            if (r0 == 0) goto L2c
            java.util.List r1 = p000.q02.m4675(r9)     // Catch: java.lang.Throwable -> L52
            java.lang.String r2 = "\n"
            tx r6 = new tx     // Catch: java.lang.Throwable -> L52
            r9 = 1
            r6.<init>(r8, r9)     // Catch: java.lang.Throwable -> L52
            r7 = 30
            r3 = 0
            r4 = 0
            r5 = 0
            java.lang.String r8 = p000.AbstractC0984xh.m6644(r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L52
            goto L48
        L2c:
            java.lang.String r9 = r8.m6003()     // Catch: java.lang.Throwable -> L52
            java.lang.String r8 = r8.m6002()     // Catch: java.lang.Throwable -> L52
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L52
            r0.<init>()     // Catch: java.lang.Throwable -> L52
            r0.append(r9)     // Catch: java.lang.Throwable -> L52
            java.lang.String r9 = ": "
            r0.append(r9)     // Catch: java.lang.Throwable -> L52
            r0.append(r8)     // Catch: java.lang.Throwable -> L52
            java.lang.String r8 = r0.toString()     // Catch: java.lang.Throwable -> L52
        L48:
            xq0 r9 = p000.xq0.f12253     // Catch: java.lang.Throwable -> L52
            r9.m6777(r8)     // Catch: java.lang.Throwable -> L52
            if (r10 == 0) goto L52
            r9.m6778(r10)     // Catch: java.lang.Throwable -> L52
        L52:
            return
    }

    /* JADX INFO: renamed from: κ */
    public static final void m5978(java.lang.String r3, java.lang.Throwable r4) {
            r3.getClass()
            r0 = 6
            r1 = 58
            r2 = 0
            int r0 = p000.q02.m4668(r3, r1, r2, r0)
            if (r0 <= 0) goto L1a
            java.lang.String r1 = r3.substring(r2, r0)
            java.lang.CharSequence r1 = p000.q02.m4660(r1)
            java.lang.String r1 = r1.toString()
            goto L1c
        L1a:
            java.lang.String r1 = "DyLog"
        L1c:
            if (r0 <= 0) goto L2c
            int r0 = r0 + 1
            java.lang.String r3 = r3.substring(r0)
            java.lang.CharSequence r3 = p000.q02.m4660(r3)
            java.lang.String r3 = r3.toString()
        L2c:
            m5977(r1, r3, r4)
            return
    }

    /* JADX INFO: renamed from: λ */
    public static /* synthetic */ void m5979(java.lang.String r0, java.lang.String r1, java.lang.Throwable r2, int r3, java.lang.Object r4) {
            r3 = r3 & 4
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            m5977(r0, r1, r2)
            return
    }

    /* JADX INFO: renamed from: μ */
    public static /* synthetic */ void m5980(java.lang.String r0, java.lang.Throwable r1, int r2, java.lang.Object r3) {
            r2 = r2 & 2
            if (r2 == 0) goto L5
            r1 = 0
        L5:
            m5978(r0, r1)
            return
    }

    /* JADX INFO: renamed from: ν */
    private static final java.lang.CharSequence m5981(p000.C0888ux.C1157 r1, java.lang.String r2) {
            r2.getClass()
            java.lang.String r1 = r1.m6003()
            java.lang.String r0 = ": "
            java.lang.String r1 = p000.lz1.m3688(r1, r0, r2)
            return r1
    }

    /* JADX INFO: renamed from: ξ */
    public static final java.lang.String m5982(p000.C0888ux.C1157 r3) {
            r3.getClass()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            long r1 = r3.m6006()
            java.lang.String r1 = m5983(r1)
            r0.append(r1)
            java.lang.String r1 = " ["
            r0.append(r1)
            java.lang.String r1 = r3.m6001()
            r0.append(r1)
            java.lang.String r1 = "] "
            r0.append(r1)
            java.lang.String r1 = r3.m6003()
            r0.append(r1)
            java.lang.String r1 = " / "
            r0.append(r1)
            java.lang.String r1 = r3.m6004()
            r0.append(r1)
            java.lang.String r1 = ": "
            r0.append(r1)
            java.lang.String r1 = r3.m6002()
            r0.append(r1)
            java.lang.String r1 = r3.m6005()
            boolean r1 = p000.q02.m4671(r1)
            if (r1 != 0) goto L59
            r1 = 10
            r0.append(r1)
            java.lang.String r3 = r3.m6005()
            r0.append(r3)
        L59:
            java.lang.String r3 = r0.toString()
            return r3
    }

    /* JADX INFO: renamed from: ο */
    public static final java.lang.String m5983(long r3) {
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat     // Catch: java.lang.Throwable -> L13
            java.lang.String r1 = "HH:mm:ss.SSS"
            java.util.Locale r2 = java.util.Locale.US     // Catch: java.lang.Throwable -> L13
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> L13
            java.util.Date r1 = new java.util.Date     // Catch: java.lang.Throwable -> L13
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L13
            java.lang.String r0 = r0.format(r1)     // Catch: java.lang.Throwable -> L13
            goto L1a
        L13:
            r0 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        L1a:
            java.lang.String r3 = java.lang.String.valueOf(r3)
            boolean r4 = r0 instanceof p000.eo1
            if (r4 == 0) goto L23
            r0 = r3
        L23:
            java.lang.String r0 = (java.lang.String) r0
            return r0
    }

    /* JADX INFO: renamed from: π */
    public static final boolean m5984() {
            int r0 = com.example.dyhelper.MainHook.f2222     // Catch: java.lang.Throwable -> L5
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L5
            goto Lc
        L5:
            r0 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        Lc:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            boolean r2 = r0 instanceof p000.eo1
            if (r2 == 0) goto L13
            r0 = r1
        L13:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }

    /* JADX INFO: renamed from: ρ */
    public static final void m5985(java.lang.String r3) {
            r3.getClass()
            r0 = 6
            r1 = 58
            r2 = 0
            int r0 = p000.q02.m4668(r3, r1, r2, r0)
            if (r0 <= 0) goto L1a
            java.lang.String r1 = r3.substring(r2, r0)
            java.lang.CharSequence r1 = p000.q02.m4660(r1)
            java.lang.String r1 = r1.toString()
            goto L1c
        L1a:
            java.lang.String r1 = "DyLog"
        L1c:
            if (r0 <= 0) goto L2c
            int r0 = r0 + 1
            java.lang.String r3 = r3.substring(r0)
            java.lang.CharSequence r3 = p000.q02.m4660(r3)
            java.lang.String r3 = r3.toString()
        L2c:
            r0 = 4
            r2 = 0
            m5988(r1, r3, r2, r0, r2)
            return
    }

    /* JADX INFO: renamed from: σ */
    public static final void m5986(java.lang.String r2, java.lang.String r3) {
            r2.getClass()
            r3.getClass()
            r0 = 0
            r1 = 4
            m5988(r2, r3, r0, r1, r0)
            return
    }

    /* JADX INFO: renamed from: τ */
    public static final void m5987(java.lang.String r8, java.lang.String r9, java.lang.Throwable r10) {
            r8.getClass()
            r9.getClass()
            ux r0 = p000.C0888ux.f10974
            java.lang.String r1 = "I"
            ux$α r8 = r0.m5972(r1, r8, r9, r10)
            r0 = 10
            boolean r0 = p000.q02.m4655(r9, r0)     // Catch: java.lang.Throwable -> L52
            if (r0 == 0) goto L2c
            java.util.List r1 = p000.q02.m4675(r9)     // Catch: java.lang.Throwable -> L52
            java.lang.String r2 = "\n"
            tx r6 = new tx     // Catch: java.lang.Throwable -> L52
            r9 = 2
            r6.<init>(r8, r9)     // Catch: java.lang.Throwable -> L52
            r7 = 30
            r3 = 0
            r4 = 0
            r5 = 0
            java.lang.String r8 = p000.AbstractC0984xh.m6644(r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L52
            goto L48
        L2c:
            java.lang.String r9 = r8.m6003()     // Catch: java.lang.Throwable -> L52
            java.lang.String r8 = r8.m6002()     // Catch: java.lang.Throwable -> L52
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L52
            r0.<init>()     // Catch: java.lang.Throwable -> L52
            r0.append(r9)     // Catch: java.lang.Throwable -> L52
            java.lang.String r9 = ": "
            r0.append(r9)     // Catch: java.lang.Throwable -> L52
            r0.append(r8)     // Catch: java.lang.Throwable -> L52
            java.lang.String r8 = r0.toString()     // Catch: java.lang.Throwable -> L52
        L48:
            xq0 r9 = p000.xq0.f12253     // Catch: java.lang.Throwable -> L52
            r9.m6777(r8)     // Catch: java.lang.Throwable -> L52
            if (r10 == 0) goto L52
            r9.m6778(r10)     // Catch: java.lang.Throwable -> L52
        L52:
            return
    }

    /* JADX INFO: renamed from: υ */
    public static /* synthetic */ void m5988(java.lang.String r0, java.lang.String r1, java.lang.Throwable r2, int r3, java.lang.Object r4) {
            r3 = r3 & 4
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            m5987(r0, r1, r2)
            return
    }

    /* JADX INFO: renamed from: φ */
    private static final java.lang.CharSequence m5989(p000.C0888ux.C1157 r1, java.lang.String r2) {
            r2.getClass()
            java.lang.String r1 = r1.m6003()
            java.lang.String r0 = ": "
            java.lang.String r1 = p000.lz1.m3688(r1, r0, r2)
            return r1
    }

    /* JADX INFO: renamed from: χ */
    public static final void m5990(java.lang.String r2, java.lang.String r3) {
            r2.getClass()
            r3.getClass()
            r0 = 0
            r1 = 4
            m5992(r2, r3, r0, r1, r0)
            return
    }

    /* JADX INFO: renamed from: ψ */
    public static final void m5991(java.lang.String r0, java.lang.String r1, java.lang.Throwable r2) {
            r0.getClass()
            r1.getClass()
            m5987(r0, r1, r2)
            return
    }

    /* JADX INFO: renamed from: ω */
    public static /* synthetic */ void m5992(java.lang.String r0, java.lang.String r1, java.lang.Throwable r2, int r3, java.lang.Object r4) {
            r3 = r3 & 4
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            m5991(r0, r1, r2)
            return
    }
}
