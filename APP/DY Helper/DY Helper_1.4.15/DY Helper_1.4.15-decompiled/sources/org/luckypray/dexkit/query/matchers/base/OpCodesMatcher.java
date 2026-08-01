package org.luckypray.dexkit.query.matchers.base;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class OpCodesMatcher extends org.luckypray.dexkit.query.base.BaseMatcher {
    public static final org.luckypray.dexkit.query.matchers.base.OpCodesMatcher.Companion Companion = null;
    private org.luckypray.dexkit.query.enums.OpCodeMatchType matchType;
    private java.util.Collection<java.lang.Integer> opCodes;
    private org.luckypray.dexkit.query.matchers.base.IntRange rangeMatcher;

    /* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(p000.AbstractC1067zq r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public static /* synthetic */ org.luckypray.dexkit.query.matchers.base.OpCodesMatcher create$default(org.luckypray.dexkit.query.matchers.base.OpCodesMatcher.Companion r0, java.util.Collection r1, org.luckypray.dexkit.query.enums.OpCodeMatchType r2, org.luckypray.dexkit.query.matchers.base.IntRange r3, int r4, java.lang.Object r5) {
                r5 = r4 & 2
                if (r5 == 0) goto L6
                org.luckypray.dexkit.query.enums.OpCodeMatchType r2 = org.luckypray.dexkit.query.enums.OpCodeMatchType.Contains
            L6:
                r4 = r4 & 4
                if (r4 == 0) goto Lb
                r3 = 0
            Lb:
                org.luckypray.dexkit.query.matchers.base.OpCodesMatcher r0 = r0.create(r1, r2, r3)
                return r0
        }

        public static /* synthetic */ org.luckypray.dexkit.query.matchers.base.OpCodesMatcher create$default(org.luckypray.dexkit.query.matchers.base.OpCodesMatcher.Companion r0, int[] r1, org.luckypray.dexkit.query.enums.OpCodeMatchType r2, org.luckypray.dexkit.query.matchers.base.IntRange r3, int r4, java.lang.Object r5) {
                r5 = r4 & 2
                if (r5 == 0) goto L6
                org.luckypray.dexkit.query.enums.OpCodeMatchType r2 = org.luckypray.dexkit.query.enums.OpCodeMatchType.Contains
            L6:
                r4 = r4 & 4
                if (r4 == 0) goto Lb
                r3 = 0
            Lb:
                org.luckypray.dexkit.query.matchers.base.OpCodesMatcher r0 = r0.create(r1, r2, r3)
                return r0
        }

        public static /* synthetic */ org.luckypray.dexkit.query.matchers.base.OpCodesMatcher createForOpNames$default(org.luckypray.dexkit.query.matchers.base.OpCodesMatcher.Companion r0, java.util.Collection r1, org.luckypray.dexkit.query.enums.OpCodeMatchType r2, org.luckypray.dexkit.query.matchers.base.IntRange r3, int r4, java.lang.Object r5) {
                r5 = r4 & 2
                if (r5 == 0) goto L6
                org.luckypray.dexkit.query.enums.OpCodeMatchType r2 = org.luckypray.dexkit.query.enums.OpCodeMatchType.Contains
            L6:
                r4 = r4 & 4
                if (r4 == 0) goto Lb
                r3 = 0
            Lb:
                org.luckypray.dexkit.query.matchers.base.OpCodesMatcher r0 = r0.createForOpNames(r1, r2, r3)
                return r0
        }

        public static /* synthetic */ org.luckypray.dexkit.query.matchers.base.OpCodesMatcher createForOpNames$default(org.luckypray.dexkit.query.matchers.base.OpCodesMatcher.Companion r0, java.lang.String[] r1, org.luckypray.dexkit.query.enums.OpCodeMatchType r2, org.luckypray.dexkit.query.matchers.base.IntRange r3, int r4, java.lang.Object r5) {
                r5 = r4 & 2
                if (r5 == 0) goto L6
                org.luckypray.dexkit.query.enums.OpCodeMatchType r2 = org.luckypray.dexkit.query.enums.OpCodeMatchType.Contains
            L6:
                r4 = r4 & 4
                if (r4 == 0) goto Lb
                r3 = 0
            Lb:
                org.luckypray.dexkit.query.matchers.base.OpCodesMatcher r0 = r0.createForOpNames(r1, r2, r3)
                return r0
        }

        public final org.luckypray.dexkit.query.matchers.base.OpCodesMatcher create(java.util.Collection<java.lang.Integer> r1, org.luckypray.dexkit.query.enums.OpCodeMatchType r2, org.luckypray.dexkit.query.matchers.base.IntRange r3) {
                r0 = this;
                r1.getClass()
                r2.getClass()
                org.luckypray.dexkit.query.matchers.base.OpCodesMatcher r0 = new org.luckypray.dexkit.query.matchers.base.OpCodesMatcher
                r0.<init>(r1, r2, r3)
                return r0
        }

        public final org.luckypray.dexkit.query.matchers.base.OpCodesMatcher create(int... r7) {
                r6 = this;
                r7.getClass()
                org.luckypray.dexkit.query.matchers.base.OpCodesMatcher r0 = new org.luckypray.dexkit.query.matchers.base.OpCodesMatcher
                java.util.List r1 = p000.AbstractC0312g7.m2261(r7)
                r4 = 6
                r5 = 0
                r2 = 0
                r3 = 0
                r0.<init>(r1, r2, r3, r4, r5)
                return r0
        }

        public final org.luckypray.dexkit.query.matchers.base.OpCodesMatcher create(int[] r1, org.luckypray.dexkit.query.enums.OpCodeMatchType r2, org.luckypray.dexkit.query.matchers.base.IntRange r3) {
                r0 = this;
                r1.getClass()
                r2.getClass()
                org.luckypray.dexkit.query.matchers.base.OpCodesMatcher r0 = new org.luckypray.dexkit.query.matchers.base.OpCodesMatcher
                r0.<init>(r1, r2, r3)
                return r0
        }

        public final org.luckypray.dexkit.query.matchers.base.OpCodesMatcher createForOpNames(java.util.Collection<java.lang.String> r2, org.luckypray.dexkit.query.enums.OpCodeMatchType r3, org.luckypray.dexkit.query.matchers.base.IntRange r4) {
                r1 = this;
                r2.getClass()
                r3.getClass()
                java.lang.Iterable r2 = (java.lang.Iterable) r2
                java.util.ArrayList r1 = new java.util.ArrayList
                r0 = 10
                int r0 = p000.AbstractC1021yh.m6889(r2, r0)
                r1.<init>(r0)
                java.util.Iterator r2 = r2.iterator()
            L17:
                boolean r0 = r2.hasNext()
                if (r0 == 0) goto L2f
                java.lang.Object r0 = r2.next()
                java.lang.String r0 = (java.lang.String) r0
                int r0 = org.luckypray.dexkit.util.OpCodeUtil.getOpCode(r0)
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r1.add(r0)
                goto L17
            L2f:
                org.luckypray.dexkit.query.matchers.base.OpCodesMatcher r2 = new org.luckypray.dexkit.query.matchers.base.OpCodesMatcher
                r2.<init>(r1, r3, r4)
                return r2
        }

        public final org.luckypray.dexkit.query.matchers.base.OpCodesMatcher createForOpNames(java.lang.String... r7) {
                r6 = this;
                r7.getClass()
                java.util.ArrayList r1 = new java.util.ArrayList
                int r6 = r7.length
                r1.<init>(r6)
                int r6 = r7.length
                r0 = 0
            Lb:
                if (r0 >= r6) goto L1d
                r2 = r7[r0]
                int r2 = org.luckypray.dexkit.util.OpCodeUtil.getOpCode(r2)
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r1.add(r2)
                int r0 = r0 + 1
                goto Lb
            L1d:
                org.luckypray.dexkit.query.matchers.base.OpCodesMatcher r0 = new org.luckypray.dexkit.query.matchers.base.OpCodesMatcher
                r2 = 0
                r3 = 0
                r4 = 6
                r5 = 0
                r0.<init>(r1, r2, r3, r4, r5)
                return r0
        }

        public final org.luckypray.dexkit.query.matchers.base.OpCodesMatcher createForOpNames(java.lang.String[] r4, org.luckypray.dexkit.query.enums.OpCodeMatchType r5, org.luckypray.dexkit.query.matchers.base.IntRange r6) {
                r3 = this;
                r4.getClass()
                r5.getClass()
                java.util.ArrayList r3 = new java.util.ArrayList
                int r0 = r4.length
                r3.<init>(r0)
                int r0 = r4.length
                r1 = 0
            Le:
                if (r1 >= r0) goto L20
                r2 = r4[r1]
                int r2 = org.luckypray.dexkit.util.OpCodeUtil.getOpCode(r2)
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r3.add(r2)
                int r1 = r1 + 1
                goto Le
            L20:
                org.luckypray.dexkit.query.matchers.base.OpCodesMatcher r4 = new org.luckypray.dexkit.query.matchers.base.OpCodesMatcher
                r4.<init>(r3, r5, r6)
                return r4
        }
    }

    static {
            org.luckypray.dexkit.query.matchers.base.OpCodesMatcher$Companion r0 = new org.luckypray.dexkit.query.matchers.base.OpCodesMatcher$Companion
            r1 = 0
            r0.<init>(r1)
            org.luckypray.dexkit.query.matchers.base.OpCodesMatcher.Companion = r0
            return
    }

    public OpCodesMatcher() {
            r1 = this;
            r1.<init>()
            org.luckypray.dexkit.query.enums.OpCodeMatchType r0 = org.luckypray.dexkit.query.enums.OpCodeMatchType.Contains
            r1.matchType = r0
            return
    }

    public OpCodesMatcher(java.util.Collection<java.lang.Integer> r7) {
            r6 = this;
            r7.getClass()
            r4 = 6
            r5 = 0
            r2 = 0
            r3 = 0
            r0 = r6
            r1 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public OpCodesMatcher(java.util.Collection<java.lang.Integer> r7, org.luckypray.dexkit.query.enums.OpCodeMatchType r8) {
            r6 = this;
            r7.getClass()
            r8.getClass()
            r4 = 4
            r5 = 0
            r3 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public OpCodesMatcher(java.util.Collection<java.lang.Integer> r2, org.luckypray.dexkit.query.enums.OpCodeMatchType r3, org.luckypray.dexkit.query.matchers.base.IntRange r4) {
            r1 = this;
            r2.getClass()
            r3.getClass()
            r1.<init>()
            org.luckypray.dexkit.query.enums.OpCodeMatchType r0 = org.luckypray.dexkit.query.enums.OpCodeMatchType.Contains
            r1.opCodes = r2
            r1.matchType = r3
            r1.rangeMatcher = r4
            return
    }

    public /* synthetic */ OpCodesMatcher(java.util.Collection r1, org.luckypray.dexkit.query.enums.OpCodeMatchType r2, org.luckypray.dexkit.query.matchers.base.IntRange r3, int r4, p000.AbstractC1067zq r5) {
            r0 = this;
            r5 = r4 & 2
            if (r5 == 0) goto L6
            org.luckypray.dexkit.query.enums.OpCodeMatchType r2 = org.luckypray.dexkit.query.enums.OpCodeMatchType.Contains
        L6:
            r4 = r4 & 4
            if (r4 == 0) goto Lb
            r3 = 0
        Lb:
            r0.<init>(r1, r2, r3)
            return
    }

    public OpCodesMatcher(int[] r7) {
            r6 = this;
            r7.getClass()
            r4 = 6
            r5 = 0
            r2 = 0
            r3 = 0
            r0 = r6
            r1 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public OpCodesMatcher(int[] r7, org.luckypray.dexkit.query.enums.OpCodeMatchType r8) {
            r6 = this;
            r7.getClass()
            r8.getClass()
            r4 = 4
            r5 = 0
            r3 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public OpCodesMatcher(int[] r2, org.luckypray.dexkit.query.enums.OpCodeMatchType r3, org.luckypray.dexkit.query.matchers.base.IntRange r4) {
            r1 = this;
            r2.getClass()
            r3.getClass()
            r1.<init>()
            org.luckypray.dexkit.query.enums.OpCodeMatchType r0 = org.luckypray.dexkit.query.enums.OpCodeMatchType.Contains
            r1.matchType = r0
            java.util.List r2 = p000.AbstractC0312g7.m2261(r2)
            r1.opCodes = r2
            r1.matchType = r3
            r1.rangeMatcher = r4
            return
    }

    public /* synthetic */ OpCodesMatcher(int[] r1, org.luckypray.dexkit.query.enums.OpCodeMatchType r2, org.luckypray.dexkit.query.matchers.base.IntRange r3, int r4, p000.AbstractC1067zq r5) {
            r0 = this;
            r5 = r4 & 2
            if (r5 == 0) goto L6
            org.luckypray.dexkit.query.enums.OpCodeMatchType r2 = org.luckypray.dexkit.query.enums.OpCodeMatchType.Contains
        L6:
            r4 = r4 & 4
            if (r4 == 0) goto Lb
            r3 = 0
        Lb:
            r0.<init>(r1, r2, r3)
            return
    }

    public static final org.luckypray.dexkit.query.matchers.base.OpCodesMatcher create(java.util.Collection<java.lang.Integer> r1, org.luckypray.dexkit.query.enums.OpCodeMatchType r2, org.luckypray.dexkit.query.matchers.base.IntRange r3) {
            org.luckypray.dexkit.query.matchers.base.OpCodesMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.base.OpCodesMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.OpCodesMatcher r1 = r0.create(r1, r2, r3)
            return r1
    }

    public static final org.luckypray.dexkit.query.matchers.base.OpCodesMatcher create(int... r1) {
            org.luckypray.dexkit.query.matchers.base.OpCodesMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.base.OpCodesMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.OpCodesMatcher r1 = r0.create(r1)
            return r1
    }

    public static final org.luckypray.dexkit.query.matchers.base.OpCodesMatcher create(int[] r1, org.luckypray.dexkit.query.enums.OpCodeMatchType r2, org.luckypray.dexkit.query.matchers.base.IntRange r3) {
            org.luckypray.dexkit.query.matchers.base.OpCodesMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.base.OpCodesMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.OpCodesMatcher r1 = r0.create(r1, r2, r3)
            return r1
    }

    public static final org.luckypray.dexkit.query.matchers.base.OpCodesMatcher createForOpNames(java.util.Collection<java.lang.String> r1, org.luckypray.dexkit.query.enums.OpCodeMatchType r2, org.luckypray.dexkit.query.matchers.base.IntRange r3) {
            org.luckypray.dexkit.query.matchers.base.OpCodesMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.base.OpCodesMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.OpCodesMatcher r1 = r0.createForOpNames(r1, r2, r3)
            return r1
    }

    public static final org.luckypray.dexkit.query.matchers.base.OpCodesMatcher createForOpNames(java.lang.String... r1) {
            org.luckypray.dexkit.query.matchers.base.OpCodesMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.base.OpCodesMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.OpCodesMatcher r1 = r0.createForOpNames(r1)
            return r1
    }

    public static final org.luckypray.dexkit.query.matchers.base.OpCodesMatcher createForOpNames(java.lang.String[] r1, org.luckypray.dexkit.query.enums.OpCodeMatchType r2, org.luckypray.dexkit.query.matchers.base.IntRange r3) {
            org.luckypray.dexkit.query.matchers.base.OpCodesMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.base.OpCodesMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.OpCodesMatcher r1 = r0.createForOpNames(r1, r2, r3)
            return r1
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.base.OpCodesMatcher size$default(org.luckypray.dexkit.query.matchers.base.OpCodesMatcher r0, int r1, int r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L5
            r1 = 0
        L5:
            r3 = r3 & 2
            if (r3 == 0) goto Lc
            r2 = 2147483647(0x7fffffff, float:NaN)
        Lc:
            org.luckypray.dexkit.query.matchers.base.OpCodesMatcher r0 = r0.size(r1, r2)
            return r0
    }

    public final org.luckypray.dexkit.query.enums.OpCodeMatchType getMatchType() {
            r0 = this;
            org.luckypray.dexkit.query.enums.OpCodeMatchType r0 = r0.matchType
            return r0
    }

    public final java.util.Collection<java.lang.Integer> getOpCodes() {
            r0 = this;
            java.util.Collection<java.lang.Integer> r0 = r0.opCodes
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.base.IntRange getRangeMatcher() {
            r0 = this;
            org.luckypray.dexkit.query.matchers.base.IntRange r0 = r0.rangeMatcher
            return r0
    }

    @p000.InterfaceC0088bs
    public final /* synthetic */ int getSize() {
            r1 = this;
            fq r1 = new fq
            r0 = 0
            r1.<init>(r0)
            throw r1
    }

    @Override // org.luckypray.dexkit.query.base.BaseMatcher
    public int innerBuild(p000.b40 r8) {
            r7 = this;
            r8.getClass()
            org.luckypray.dexkit.schema.-OpCodesMatcher$Companion r0 = org.luckypray.dexkit.schema.OpCodesMatcher.Companion
            java.util.Collection<java.lang.Integer> r1 = r7.opCodes
            r2 = 0
            if (r1 == 0) goto L5c
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 10
            int r4 = p000.AbstractC1021yh.m6889(r1, r4)
            r3.<init>(r4)
            java.util.Iterator r1 = r1.iterator()
        L1b:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L34
            java.lang.Object r4 = r1.next()
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            short r4 = (short) r4
            java.lang.Short r4 = java.lang.Short.valueOf(r4)
            r3.add(r4)
            goto L1b
        L34:
            int r1 = r3.size()
            short[] r1 = new short[r1]
            java.util.Iterator r3 = r3.iterator()
            r4 = r2
        L3f:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L55
            java.lang.Object r5 = r3.next()
            java.lang.Number r5 = (java.lang.Number) r5
            short r5 = r5.shortValue()
            int r6 = r4 + 1
            r1[r4] = r5
            r4 = r6
            goto L3f
        L55:
            org.luckypray.dexkit.schema.-OpCodesMatcher$Companion r3 = org.luckypray.dexkit.schema.OpCodesMatcher.Companion
            int r1 = r3.createOpCodesVector(r8, r1)
            goto L5d
        L5c:
            r1 = r2
        L5d:
            org.luckypray.dexkit.query.enums.OpCodeMatchType r3 = r7.matchType
            byte r3 = r3.getValue()
            org.luckypray.dexkit.query.matchers.base.IntRange r7 = r7.rangeMatcher
            if (r7 == 0) goto L6b
            int r2 = r7.build$dexkit_android_release(r8)
        L6b:
            int r7 = r0.createOpCodesMatcher(r8, r1, r3, r2)
            r8.m733(r7)
            return r7
    }

    public final org.luckypray.dexkit.query.matchers.base.OpCodesMatcher matchType(org.luckypray.dexkit.query.enums.OpCodeMatchType r1) {
            r0 = this;
            r1.getClass()
            r0.matchType = r1
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.base.OpCodesMatcher opCodes(java.util.Collection<java.lang.Integer> r1) {
            r0 = this;
            r1.getClass()
            r0.opCodes = r1
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.base.OpCodesMatcher opCodes(java.lang.Integer[] r1) {
            r0 = this;
            r1.getClass()
            java.util.List r1 = p000.AbstractC0312g7.m2262(r1)
            r0.opCodes = r1
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.base.OpCodesMatcher opNames(java.util.Collection<java.lang.String> r3) {
            r2 = this;
            r3.getClass()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = p000.AbstractC1021yh.m6889(r3, r1)
            r0.<init>(r1)
            java.util.Iterator r3 = r3.iterator()
        L14:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L2c
            java.lang.Object r1 = r3.next()
            java.lang.String r1 = (java.lang.String) r1
            int r1 = org.luckypray.dexkit.util.OpCodeUtil.getOpCode(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
            goto L14
        L2c:
            r2.opCodes = r0
            return r2
    }

    public final org.luckypray.dexkit.query.matchers.base.OpCodesMatcher opNames(java.lang.String[] r5) {
            r4 = this;
            r5.getClass()
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r5.length
            r0.<init>(r1)
            int r1 = r5.length
            r2 = 0
        Lb:
            if (r2 >= r1) goto L1d
            r3 = r5[r2]
            int r3 = org.luckypray.dexkit.util.OpCodeUtil.getOpCode(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.add(r3)
            int r2 = r2 + 1
            goto Lb
        L1d:
            r4.opCodes = r0
            return r4
    }

    public final /* synthetic */ void setMatchType(org.luckypray.dexkit.query.enums.OpCodeMatchType r1) {
            r0 = this;
            r1.getClass()
            r0.matchType = r1
            return
    }

    public final /* synthetic */ void setOpCodes(java.util.Collection r1) {
            r0 = this;
            r0.opCodes = r1
            return
    }

    public final /* synthetic */ void setSize(int r1) {
            r0 = this;
            r0.size(r1)
            return
    }

    public final org.luckypray.dexkit.query.matchers.base.OpCodesMatcher size(int r2) {
            r1 = this;
            org.luckypray.dexkit.query.matchers.base.IntRange r0 = new org.luckypray.dexkit.query.matchers.base.IntRange
            r0.<init>(r2)
            r1.rangeMatcher = r0
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.base.OpCodesMatcher size(int r2, int r3) {
            r1 = this;
            org.luckypray.dexkit.query.matchers.base.IntRange r0 = new org.luckypray.dexkit.query.matchers.base.IntRange
            r0.<init>(r2, r3)
            r1.rangeMatcher = r0
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.base.OpCodesMatcher size(org.luckypray.dexkit.query.matchers.base.IntRange r1) {
            r0 = this;
            r1.getClass()
            r0.rangeMatcher = r1
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.base.OpCodesMatcher size(p000.xm0 r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.matchers.base.IntRange r0 = new org.luckypray.dexkit.query.matchers.base.IntRange
            r0.<init>(r2)
            r1.rangeMatcher = r0
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.base.OpCodesMatcher sizeMax(int r3) {
            r2 = this;
            org.luckypray.dexkit.query.matchers.base.IntRange r0 = new org.luckypray.dexkit.query.matchers.base.IntRange
            r1 = 0
            r0.<init>(r1, r3)
            r2.rangeMatcher = r0
            return r2
    }

    public final org.luckypray.dexkit.query.matchers.base.OpCodesMatcher sizeMin(int r3) {
            r2 = this;
            org.luckypray.dexkit.query.matchers.base.IntRange r0 = new org.luckypray.dexkit.query.matchers.base.IntRange
            r1 = 2147483647(0x7fffffff, float:NaN)
            r0.<init>(r3, r1)
            r2.rangeMatcher = r0
            return r2
    }
}
