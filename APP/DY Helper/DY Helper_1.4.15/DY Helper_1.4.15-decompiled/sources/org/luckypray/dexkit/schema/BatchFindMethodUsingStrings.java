package org.luckypray.dexkit.schema;

/* JADX INFO: renamed from: org.luckypray.dexkit.schema.-BatchFindMethodUsingStrings, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class BatchFindMethodUsingStrings extends p000.p22 {
    public static final org.luckypray.dexkit.schema.BatchFindMethodUsingStrings.Companion Companion = null;

    /* JADX INFO: renamed from: org.luckypray.dexkit.schema.-BatchFindMethodUsingStrings$Companion */
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

        public final void addExcludePackages(p000.b40 r1, int r2) {
                r0 = this;
                r1.getClass()
                r0 = 1
                r1.m727(r0, r2)
                return
        }

        public final void addIgnorePackagesCase(p000.b40 r1, boolean r2) {
                r0 = this;
                r1.getClass()
                r0 = 2
                r1.m720(r0, r2)
                return
        }

        public final void addInClasses(p000.b40 r1, int r2) {
                r0 = this;
                r1.getClass()
                r0 = 3
                r1.m727(r0, r2)
                return
        }

        public final void addInMethods(p000.b40 r1, int r2) {
                r0 = this;
                r1.getClass()
                r0 = 4
                r1.m727(r0, r2)
                return
        }

        public final void addMatchers(p000.b40 r1, int r2) {
                r0 = this;
                r1.getClass()
                r0 = 5
                r1.m727(r0, r2)
                return
        }

        public final void addSearchPackages(p000.b40 r1, int r2) {
                r0 = this;
                r1.getClass()
                r0 = 0
                r1.m727(r0, r2)
                return
        }

        public final int createBatchFindMethodUsingStrings(p000.b40 r2, int r3, int r4, boolean r5, int r6, int r7, int r8) {
                r1 = this;
                r2.getClass()
                r0 = 6
                r2.m737(r0)
                r1.addMatchers(r2, r8)
                r1.addInMethods(r2, r7)
                r1.addInClasses(r2, r6)
                r1.addExcludePackages(r2, r4)
                r1.addSearchPackages(r2, r3)
                r1.addIgnorePackagesCase(r2, r5)
                int r1 = r1.endBatchFindMethodUsingStrings(r2)
                return r1
        }

        public final int createExcludePackagesVector(p000.b40 r2, int[] r3) {
                r1 = this;
                r2.getClass()
                r3.getClass()
                r1 = 4
                int r0 = r3.length
                r2.m738(r1, r0, r1)
                int r1 = r3.length
                int r1 = r1 + (-1)
            Le:
                r0 = -1
                if (r0 >= r1) goto L19
                r0 = r3[r1]
                r2.m726(r0)
                int r1 = r1 + (-1)
                goto Le
            L19:
                int r1 = r2.m732()
                return r1
        }

        public final int createInClassesVector(p000.b40 r3, long[] r4) {
                r2 = this;
                r3.getClass()
                r4.getClass()
                r2 = 8
                int r0 = r4.length
                r3.m738(r2, r0, r2)
                int r2 = r4.length
                int r2 = r2 + (-1)
            Lf:
                r0 = -1
                if (r0 >= r2) goto L1a
                r0 = r4[r2]
                r3.m725(r0)
                int r2 = r2 + (-1)
                goto Lf
            L1a:
                int r2 = r3.m732()
                return r2
        }

        public final int createInMethodsVector(p000.b40 r3, long[] r4) {
                r2 = this;
                r3.getClass()
                r4.getClass()
                r2 = 8
                int r0 = r4.length
                r3.m738(r2, r0, r2)
                int r2 = r4.length
                int r2 = r2 + (-1)
            Lf:
                r0 = -1
                if (r0 >= r2) goto L1a
                r0 = r4[r2]
                r3.m725(r0)
                int r2 = r2 + (-1)
                goto Lf
            L1a:
                int r2 = r3.m732()
                return r2
        }

        public final int createMatchersVector(p000.b40 r2, int[] r3) {
                r1 = this;
                r2.getClass()
                r3.getClass()
                r1 = 4
                int r0 = r3.length
                r2.m738(r1, r0, r1)
                int r1 = r3.length
                int r1 = r1 + (-1)
            Le:
                r0 = -1
                if (r0 >= r1) goto L19
                r0 = r3[r1]
                r2.m726(r0)
                int r1 = r1 + (-1)
                goto Le
            L19:
                int r1 = r2.m732()
                return r1
        }

        public final int createSearchPackagesVector(p000.b40 r2, int[] r3) {
                r1 = this;
                r2.getClass()
                r3.getClass()
                r1 = 4
                int r0 = r3.length
                r2.m738(r1, r0, r1)
                int r1 = r3.length
                int r1 = r1 + (-1)
            Le:
                r0 = -1
                if (r0 >= r1) goto L19
                r0 = r3[r1]
                r2.m726(r0)
                int r1 = r1 + (-1)
                goto Le
            L19:
                int r1 = r2.m732()
                return r1
        }

        public final int endBatchFindMethodUsingStrings(p000.b40 r1) {
                r0 = this;
                r1.getClass()
                int r0 = r1.m731()
                return r0
        }

        public final org.luckypray.dexkit.schema.BatchFindMethodUsingStrings getRootAsBatchFindMethodUsingStrings(java.nio.ByteBuffer r2) {
                r1 = this;
                r2.getClass()
                org.luckypray.dexkit.schema.-BatchFindMethodUsingStrings r0 = new org.luckypray.dexkit.schema.-BatchFindMethodUsingStrings
                r0.<init>()
                org.luckypray.dexkit.schema.-BatchFindMethodUsingStrings r1 = r1.getRootAsBatchFindMethodUsingStrings(r2, r0)
                return r1
        }

        public final org.luckypray.dexkit.schema.BatchFindMethodUsingStrings getRootAsBatchFindMethodUsingStrings(java.nio.ByteBuffer r2, org.luckypray.dexkit.schema.BatchFindMethodUsingStrings r3) {
                r1 = this;
                r2.getClass()
                r3.getClass()
                java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN
                int r1 = p000.AbstractC0602nx.m4122(r2, r1)
                int r0 = r2.position()
                int r0 = r0 + r1
                org.luckypray.dexkit.schema.-BatchFindMethodUsingStrings r1 = r3.__assign(r0, r2)
                return r1
        }

        public final void startBatchFindMethodUsingStrings(p000.b40 r1) {
                r0 = this;
                r1.getClass()
                r0 = 6
                r1.m737(r0)
                return
        }

        public final void startExcludePackagesVector(p000.b40 r1, int r2) {
                r0 = this;
                r1.getClass()
                r0 = 4
                r1.m738(r0, r2, r0)
                return
        }

        public final void startInClassesVector(p000.b40 r1, int r2) {
                r0 = this;
                r1.getClass()
                r0 = 8
                r1.m738(r0, r2, r0)
                return
        }

        public final void startInMethodsVector(p000.b40 r1, int r2) {
                r0 = this;
                r1.getClass()
                r0 = 8
                r1.m738(r0, r2, r0)
                return
        }

        public final void startMatchersVector(p000.b40 r1, int r2) {
                r0 = this;
                r1.getClass()
                r0 = 4
                r1.m738(r0, r2, r0)
                return
        }

        public final void startSearchPackagesVector(p000.b40 r1, int r2) {
                r0 = this;
                r1.getClass()
                r0 = 4
                r1.m738(r0, r2, r0)
                return
        }

        public final void validateVersion() {
                r0 = this;
                return
        }
    }

    static {
            org.luckypray.dexkit.schema.-BatchFindMethodUsingStrings$Companion r0 = new org.luckypray.dexkit.schema.-BatchFindMethodUsingStrings$Companion
            r1 = 0
            r0.<init>(r1)
            org.luckypray.dexkit.schema.BatchFindMethodUsingStrings.Companion = r0
            return
    }

    public BatchFindMethodUsingStrings() {
            r0 = this;
            r0.<init>()
            return
    }

    public final org.luckypray.dexkit.schema.BatchFindMethodUsingStrings __assign(int r1, java.nio.ByteBuffer r2) {
            r0 = this;
            r2.getClass()
            r0.__init(r1, r2)
            return r0
    }

    public final void __init(int r1, java.nio.ByteBuffer r2) {
            r0 = this;
            r2.getClass()
            r0.__reset(r1, r2)
            return
    }

    public final java.lang.String excludePackages(int r2) {
            r1 = this;
            r0 = 6
            int r0 = r1.__offset(r0)
            if (r0 == 0) goto L13
            int r0 = r1.__vector(r0)
            int r2 = r2 * 4
            int r2 = r2 + r0
            java.lang.String r1 = r1.__string(r2)
            return r1
        L13:
            r1 = 0
            return r1
    }

    public final int getExcludePackagesLength() {
            r1 = this;
            r0 = 6
            int r0 = r1.__offset(r0)
            if (r0 == 0) goto Lc
            int r1 = r1.__vector_len(r0)
            return r1
        Lc:
            r1 = 0
            return r1
    }

    public final boolean getIgnorePackagesCase() {
            r4 = this;
            r0 = 8
            int r0 = r4.__offset(r0)
            r1 = 0
            if (r0 == 0) goto L17
            byte r2 = (byte) r1
            java.nio.ByteBuffer r3 = r4.f8399bb
            int r4 = r4.bb_pos
            int r0 = r0 + r4
            byte r4 = r3.get(r0)
            if (r2 == r4) goto L17
            r4 = 1
            return r4
        L17:
            return r1
    }

    public final java.nio.ByteBuffer getInClassesAsByteBuffer() {
            r2 = this;
            r0 = 10
            r1 = 8
            java.nio.ByteBuffer r2 = r2.__vector_as_bytebuffer(r0, r1)
            r2.getClass()
            return r2
    }

    public final int getInClassesLength() {
            r1 = this;
            r0 = 10
            int r0 = r1.__offset(r0)
            if (r0 == 0) goto Ld
            int r1 = r1.__vector_len(r0)
            return r1
        Ld:
            r1 = 0
            return r1
    }

    public final java.nio.ByteBuffer getInMethodsAsByteBuffer() {
            r2 = this;
            r0 = 12
            r1 = 8
            java.nio.ByteBuffer r2 = r2.__vector_as_bytebuffer(r0, r1)
            r2.getClass()
            return r2
    }

    public final int getInMethodsLength() {
            r1 = this;
            r0 = 12
            int r0 = r1.__offset(r0)
            if (r0 == 0) goto Ld
            int r1 = r1.__vector_len(r0)
            return r1
        Ld:
            r1 = 0
            return r1
    }

    public final int getMatchersLength() {
            r1 = this;
            r0 = 14
            int r0 = r1.__offset(r0)
            if (r0 == 0) goto Ld
            int r1 = r1.__vector_len(r0)
            return r1
        Ld:
            r1 = 0
            return r1
    }

    public final int getSearchPackagesLength() {
            r1 = this;
            r0 = 4
            int r0 = r1.__offset(r0)
            if (r0 == 0) goto Lc
            int r1 = r1.__vector_len(r0)
            return r1
        Lc:
            r1 = 0
            return r1
    }

    public final long inClasses(int r3) {
            r2 = this;
            r0 = 10
            int r0 = r2.__offset(r0)
            if (r0 == 0) goto L16
            java.nio.ByteBuffer r1 = r2.f8399bb
            int r2 = r2.__vector(r0)
            int r3 = r3 * 8
            int r3 = r3 + r2
            long r2 = r1.getLong(r3)
            return r2
        L16:
            r2 = 0
            return r2
    }

    public final java.nio.ByteBuffer inClassesInByteBuffer(java.nio.ByteBuffer r3) {
            r2 = this;
            r3.getClass()
            r0 = 10
            r1 = 8
            java.nio.ByteBuffer r2 = r2.__vector_in_bytebuffer(r3, r0, r1)
            r2.getClass()
            return r2
    }

    public final long inMethods(int r3) {
            r2 = this;
            r0 = 12
            int r0 = r2.__offset(r0)
            if (r0 == 0) goto L16
            java.nio.ByteBuffer r1 = r2.f8399bb
            int r2 = r2.__vector(r0)
            int r3 = r3 * 8
            int r3 = r3 + r2
            long r2 = r1.getLong(r3)
            return r2
        L16:
            r2 = 0
            return r2
    }

    public final java.nio.ByteBuffer inMethodsInByteBuffer(java.nio.ByteBuffer r3) {
            r2 = this;
            r3.getClass()
            r0 = 12
            r1 = 8
            java.nio.ByteBuffer r2 = r2.__vector_in_bytebuffer(r3, r0, r1)
            r2.getClass()
            return r2
    }

    public final org.luckypray.dexkit.schema.BatchUsingStringsMatcher matchers(int r2) {
            r1 = this;
            org.luckypray.dexkit.schema.-BatchUsingStringsMatcher r0 = new org.luckypray.dexkit.schema.-BatchUsingStringsMatcher
            r0.<init>()
            org.luckypray.dexkit.schema.-BatchUsingStringsMatcher r1 = r1.matchers(r0, r2)
            return r1
    }

    public final org.luckypray.dexkit.schema.BatchUsingStringsMatcher matchers(org.luckypray.dexkit.schema.BatchUsingStringsMatcher r2, int r3) {
            r1 = this;
            r2.getClass()
            r0 = 14
            int r0 = r1.__offset(r0)
            if (r0 == 0) goto L20
            int r0 = r1.__vector(r0)
            int r3 = r3 * 4
            int r3 = r3 + r0
            int r3 = r1.__indirect(r3)
            java.nio.ByteBuffer r1 = r1.f8399bb
            r1.getClass()
            org.luckypray.dexkit.schema.-BatchUsingStringsMatcher r1 = r2.__assign(r3, r1)
            return r1
        L20:
            r1 = 0
            return r1
    }

    public final boolean mutateIgnorePackagesCase(boolean r3) {
            r2 = this;
            r0 = 8
            int r0 = r2.__offset(r0)
            if (r0 == 0) goto L13
            java.nio.ByteBuffer r1 = r2.f8399bb
            int r2 = r2.bb_pos
            int r0 = r0 + r2
            byte r2 = (byte) r3
            r1.put(r0, r2)
            r2 = 1
            return r2
        L13:
            r2 = 0
            return r2
    }

    public final boolean mutateInClasses(int r3, long r4) {
            r2 = this;
            r0 = 10
            int r0 = r2.__offset(r0)
            if (r0 == 0) goto L16
            java.nio.ByteBuffer r1 = r2.f8399bb
            int r2 = r2.__vector(r0)
            int r3 = r3 * 8
            int r3 = r3 + r2
            r1.putLong(r3, r4)
            r2 = 1
            return r2
        L16:
            r2 = 0
            return r2
    }

    public final boolean mutateInMethods(int r3, long r4) {
            r2 = this;
            r0 = 12
            int r0 = r2.__offset(r0)
            if (r0 == 0) goto L16
            java.nio.ByteBuffer r1 = r2.f8399bb
            int r2 = r2.__vector(r0)
            int r3 = r3 * 8
            int r3 = r3 + r2
            r1.putLong(r3, r4)
            r2 = 1
            return r2
        L16:
            r2 = 0
            return r2
    }

    public final java.lang.String searchPackages(int r3) {
            r2 = this;
            r0 = 4
            int r1 = r2.__offset(r0)
            if (r1 == 0) goto L12
            int r1 = r2.__vector(r1)
            int r3 = r3 * r0
            int r3 = r3 + r1
            java.lang.String r2 = r2.__string(r3)
            return r2
        L12:
            r2 = 0
            return r2
    }
}
