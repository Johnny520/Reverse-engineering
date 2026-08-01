package org.luckypray.dexkit.schema;

/* JADX INFO: renamed from: org.luckypray.dexkit.schema.-MethodsMatcher, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class MethodsMatcher extends p000.p22 {
    public static final org.luckypray.dexkit.schema.MethodsMatcher.Companion Companion = null;

    /* JADX INFO: renamed from: org.luckypray.dexkit.schema.-MethodsMatcher$Companion */
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

        public final void addMatchType(p000.b40 r1, byte r2) {
                r0 = this;
                r1.getClass()
                r0 = 1
                r1.m722(r0, r2)
                return
        }

        public final void addMethodCount(p000.b40 r1, int r2) {
                r0 = this;
                r1.getClass()
                r0 = 2
                r1.m727(r0, r2)
                return
        }

        public final void addMethods(p000.b40 r1, int r2) {
                r0 = this;
                r1.getClass()
                r0 = 0
                r1.m727(r0, r2)
                return
        }

        public final int createMethodsMatcher(p000.b40 r2, int r3, byte r4, int r5) {
                r1 = this;
                r2.getClass()
                r0 = 3
                r2.m737(r0)
                r1.addMethodCount(r2, r5)
                r1.addMethods(r2, r3)
                r1.addMatchType(r2, r4)
                int r1 = r1.endMethodsMatcher(r2)
                return r1
        }

        public final int createMethodsVector(p000.b40 r2, int[] r3) {
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

        public final int endMethodsMatcher(p000.b40 r1) {
                r0 = this;
                r1.getClass()
                int r0 = r1.m731()
                return r0
        }

        public final org.luckypray.dexkit.schema.MethodsMatcher getRootAsMethodsMatcher(java.nio.ByteBuffer r2) {
                r1 = this;
                r2.getClass()
                org.luckypray.dexkit.schema.-MethodsMatcher r0 = new org.luckypray.dexkit.schema.-MethodsMatcher
                r0.<init>()
                org.luckypray.dexkit.schema.-MethodsMatcher r1 = r1.getRootAsMethodsMatcher(r2, r0)
                return r1
        }

        public final org.luckypray.dexkit.schema.MethodsMatcher getRootAsMethodsMatcher(java.nio.ByteBuffer r2, org.luckypray.dexkit.schema.MethodsMatcher r3) {
                r1 = this;
                r2.getClass()
                r3.getClass()
                java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN
                int r1 = p000.AbstractC0602nx.m4122(r2, r1)
                int r0 = r2.position()
                int r0 = r0 + r1
                org.luckypray.dexkit.schema.-MethodsMatcher r1 = r3.__assign(r0, r2)
                return r1
        }

        public final void startMethodsMatcher(p000.b40 r1) {
                r0 = this;
                r1.getClass()
                r0 = 3
                r1.m737(r0)
                return
        }

        public final void startMethodsVector(p000.b40 r1, int r2) {
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
            org.luckypray.dexkit.schema.-MethodsMatcher$Companion r0 = new org.luckypray.dexkit.schema.-MethodsMatcher$Companion
            r1 = 0
            r0.<init>(r1)
            org.luckypray.dexkit.schema.MethodsMatcher.Companion = r0
            return
    }

    public MethodsMatcher() {
            r0 = this;
            r0.<init>()
            return
    }

    public final org.luckypray.dexkit.schema.MethodsMatcher __assign(int r1, java.nio.ByteBuffer r2) {
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

    public final byte getMatchType() {
            r2 = this;
            r0 = 6
            int r0 = r2.__offset(r0)
            if (r0 == 0) goto L11
            java.nio.ByteBuffer r1 = r2.f8399bb
            int r2 = r2.bb_pos
            int r0 = r0 + r2
            byte r2 = r1.get(r0)
            return r2
        L11:
            r2 = 0
            return r2
    }

    public final org.luckypray.dexkit.schema.IntRange getMethodCount() {
            r1 = this;
            org.luckypray.dexkit.schema.-IntRange r0 = new org.luckypray.dexkit.schema.-IntRange
            r0.<init>()
            org.luckypray.dexkit.schema.-IntRange r1 = r1.methodCount(r0)
            return r1
    }

    public final int getMethodsLength() {
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

    public final org.luckypray.dexkit.schema.IntRange methodCount(org.luckypray.dexkit.schema.IntRange r3) {
            r2 = this;
            r3.getClass()
            r0 = 8
            int r0 = r2.__offset(r0)
            if (r0 == 0) goto L1c
            int r1 = r2.bb_pos
            int r0 = r0 + r1
            int r0 = r2.__indirect(r0)
            java.nio.ByteBuffer r2 = r2.f8399bb
            r2.getClass()
            org.luckypray.dexkit.schema.-IntRange r2 = r3.__assign(r0, r2)
            return r2
        L1c:
            r2 = 0
            return r2
    }

    public final org.luckypray.dexkit.schema.MethodMatcher methods(int r2) {
            r1 = this;
            org.luckypray.dexkit.schema.-MethodMatcher r0 = new org.luckypray.dexkit.schema.-MethodMatcher
            r0.<init>()
            org.luckypray.dexkit.schema.-MethodMatcher r1 = r1.methods(r0, r2)
            return r1
    }

    public final org.luckypray.dexkit.schema.MethodMatcher methods(org.luckypray.dexkit.schema.MethodMatcher r3, int r4) {
            r2 = this;
            r3.getClass()
            r0 = 4
            int r1 = r2.__offset(r0)
            if (r1 == 0) goto L1e
            int r1 = r2.__vector(r1)
            int r4 = r4 * r0
            int r4 = r4 + r1
            int r4 = r2.__indirect(r4)
            java.nio.ByteBuffer r2 = r2.f8399bb
            r2.getClass()
            org.luckypray.dexkit.schema.-MethodMatcher r2 = r3.__assign(r4, r2)
            return r2
        L1e:
            r2 = 0
            return r2
    }

    public final boolean mutateMatchType(byte r3) {
            r2 = this;
            r0 = 6
            int r0 = r2.__offset(r0)
            if (r0 == 0) goto L11
            java.nio.ByteBuffer r1 = r2.f8399bb
            int r2 = r2.bb_pos
            int r0 = r0 + r2
            r1.put(r0, r3)
            r2 = 1
            return r2
        L11:
            r2 = 0
            return r2
    }
}
