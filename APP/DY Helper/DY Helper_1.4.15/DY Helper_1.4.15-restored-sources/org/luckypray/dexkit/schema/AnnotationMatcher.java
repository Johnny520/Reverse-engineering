package org.luckypray.dexkit.schema;

/* JADX INFO: renamed from: org.luckypray.dexkit.schema.-AnnotationMatcher, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class AnnotationMatcher extends p000.p22 {
    public static final org.luckypray.dexkit.schema.AnnotationMatcher.Companion Companion = null;

    /* JADX INFO: renamed from: org.luckypray.dexkit.schema.-AnnotationMatcher$Companion */
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

        public final void addElements(p000.b40 r1, int r2) {
                r0 = this;
                r1.getClass()
                r0 = 3
                r1.m727(r0, r2)
                return
        }

        public final void addPolicy(p000.b40 r1, byte r2) {
                r0 = this;
                r1.getClass()
                r0 = 2
                r1.m722(r0, r2)
                return
        }

        public final void addTargetElementTypes(p000.b40 r1, int r2) {
                r0 = this;
                r1.getClass()
                r0 = 1
                r1.m727(r0, r2)
                return
        }

        public final void addType(p000.b40 r1, int r2) {
                r0 = this;
                r1.getClass()
                r0 = 0
                r1.m727(r0, r2)
                return
        }

        public final void addUsingStrings(p000.b40 r1, int r2) {
                r0 = this;
                r1.getClass()
                r0 = 4
                r1.m727(r0, r2)
                return
        }

        public final int createAnnotationMatcher(p000.b40 r2, int r3, int r4, byte r5, int r6, int r7) {
                r1 = this;
                r2.getClass()
                r0 = 5
                r2.m737(r0)
                r1.addUsingStrings(r2, r7)
                r1.addElements(r2, r6)
                r1.addTargetElementTypes(r2, r4)
                r1.addType(r2, r3)
                r1.addPolicy(r2, r5)
                int r1 = r1.endAnnotationMatcher(r2)
                return r1
        }

        public final int createUsingStringsVector(p000.b40 r2, int[] r3) {
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

        public final int endAnnotationMatcher(p000.b40 r1) {
                r0 = this;
                r1.getClass()
                int r0 = r1.m731()
                return r0
        }

        public final org.luckypray.dexkit.schema.AnnotationMatcher getRootAsAnnotationMatcher(java.nio.ByteBuffer r2) {
                r1 = this;
                r2.getClass()
                org.luckypray.dexkit.schema.-AnnotationMatcher r0 = new org.luckypray.dexkit.schema.-AnnotationMatcher
                r0.<init>()
                org.luckypray.dexkit.schema.-AnnotationMatcher r1 = r1.getRootAsAnnotationMatcher(r2, r0)
                return r1
        }

        public final org.luckypray.dexkit.schema.AnnotationMatcher getRootAsAnnotationMatcher(java.nio.ByteBuffer r2, org.luckypray.dexkit.schema.AnnotationMatcher r3) {
                r1 = this;
                r2.getClass()
                r3.getClass()
                java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN
                int r1 = p000.AbstractC0602nx.m4122(r2, r1)
                int r0 = r2.position()
                int r0 = r0 + r1
                org.luckypray.dexkit.schema.-AnnotationMatcher r1 = r3.__assign(r0, r2)
                return r1
        }

        public final void startAnnotationMatcher(p000.b40 r1) {
                r0 = this;
                r1.getClass()
                r0 = 5
                r1.m737(r0)
                return
        }

        public final void startUsingStringsVector(p000.b40 r1, int r2) {
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
            org.luckypray.dexkit.schema.-AnnotationMatcher$Companion r0 = new org.luckypray.dexkit.schema.-AnnotationMatcher$Companion
            r1 = 0
            r0.<init>(r1)
            org.luckypray.dexkit.schema.AnnotationMatcher.Companion = r0
            return
    }

    public AnnotationMatcher() {
            r0 = this;
            r0.<init>()
            return
    }

    public final org.luckypray.dexkit.schema.AnnotationMatcher __assign(int r1, java.nio.ByteBuffer r2) {
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

    public final org.luckypray.dexkit.schema.AnnotationElementsMatcher elements(org.luckypray.dexkit.schema.AnnotationElementsMatcher r3) {
            r2 = this;
            r3.getClass()
            r0 = 10
            int r0 = r2.__offset(r0)
            if (r0 == 0) goto L1c
            int r1 = r2.bb_pos
            int r0 = r0 + r1
            int r0 = r2.__indirect(r0)
            java.nio.ByteBuffer r2 = r2.f8399bb
            r2.getClass()
            org.luckypray.dexkit.schema.-AnnotationElementsMatcher r2 = r3.__assign(r0, r2)
            return r2
        L1c:
            r2 = 0
            return r2
    }

    public final org.luckypray.dexkit.schema.AnnotationElementsMatcher getElements() {
            r1 = this;
            org.luckypray.dexkit.schema.-AnnotationElementsMatcher r0 = new org.luckypray.dexkit.schema.-AnnotationElementsMatcher
            r0.<init>()
            org.luckypray.dexkit.schema.-AnnotationElementsMatcher r1 = r1.elements(r0)
            return r1
    }

    public final byte getPolicy() {
            r2 = this;
            r0 = 8
            int r0 = r2.__offset(r0)
            if (r0 == 0) goto L12
            java.nio.ByteBuffer r1 = r2.f8399bb
            int r2 = r2.bb_pos
            int r0 = r0 + r2
            byte r2 = r1.get(r0)
            return r2
        L12:
            r2 = 0
            return r2
    }

    public final org.luckypray.dexkit.schema.TargetElementTypesMatcher getTargetElementTypes() {
            r1 = this;
            org.luckypray.dexkit.schema.-TargetElementTypesMatcher r0 = new org.luckypray.dexkit.schema.-TargetElementTypesMatcher
            r0.<init>()
            org.luckypray.dexkit.schema.-TargetElementTypesMatcher r1 = r1.targetElementTypes(r0)
            return r1
    }

    public final org.luckypray.dexkit.schema.ClassMatcher getType() {
            r1 = this;
            org.luckypray.dexkit.schema.-ClassMatcher r0 = new org.luckypray.dexkit.schema.-ClassMatcher
            r0.<init>()
            org.luckypray.dexkit.schema.-ClassMatcher r1 = r1.type(r0)
            return r1
    }

    public final int getUsingStringsLength() {
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

    public final boolean mutatePolicy(byte r3) {
            r2 = this;
            r0 = 8
            int r0 = r2.__offset(r0)
            if (r0 == 0) goto L12
            java.nio.ByteBuffer r1 = r2.f8399bb
            int r2 = r2.bb_pos
            int r0 = r0 + r2
            r1.put(r0, r3)
            r2 = 1
            return r2
        L12:
            r2 = 0
            return r2
    }

    public final org.luckypray.dexkit.schema.TargetElementTypesMatcher targetElementTypes(org.luckypray.dexkit.schema.TargetElementTypesMatcher r3) {
            r2 = this;
            r3.getClass()
            r0 = 6
            int r0 = r2.__offset(r0)
            if (r0 == 0) goto L1b
            int r1 = r2.bb_pos
            int r0 = r0 + r1
            int r0 = r2.__indirect(r0)
            java.nio.ByteBuffer r2 = r2.f8399bb
            r2.getClass()
            org.luckypray.dexkit.schema.-TargetElementTypesMatcher r2 = r3.__assign(r0, r2)
            return r2
        L1b:
            r2 = 0
            return r2
    }

    public final org.luckypray.dexkit.schema.ClassMatcher type(org.luckypray.dexkit.schema.ClassMatcher r3) {
            r2 = this;
            r3.getClass()
            r0 = 4
            int r0 = r2.__offset(r0)
            if (r0 == 0) goto L1b
            int r1 = r2.bb_pos
            int r0 = r0 + r1
            int r0 = r2.__indirect(r0)
            java.nio.ByteBuffer r2 = r2.f8399bb
            r2.getClass()
            org.luckypray.dexkit.schema.-ClassMatcher r2 = r3.__assign(r0, r2)
            return r2
        L1b:
            r2 = 0
            return r2
    }

    public final org.luckypray.dexkit.schema.StringMatcher usingStrings(int r2) {
            r1 = this;
            org.luckypray.dexkit.schema.-StringMatcher r0 = new org.luckypray.dexkit.schema.-StringMatcher
            r0.<init>()
            org.luckypray.dexkit.schema.-StringMatcher r1 = r1.usingStrings(r0, r2)
            return r1
    }

    public final org.luckypray.dexkit.schema.StringMatcher usingStrings(org.luckypray.dexkit.schema.StringMatcher r2, int r3) {
            r1 = this;
            r2.getClass()
            r0 = 12
            int r0 = r1.__offset(r0)
            if (r0 == 0) goto L20
            int r0 = r1.__vector(r0)
            int r3 = r3 * 4
            int r3 = r3 + r0
            int r3 = r1.__indirect(r3)
            java.nio.ByteBuffer r1 = r1.f8399bb
            r1.getClass()
            org.luckypray.dexkit.schema.-StringMatcher r1 = r2.__assign(r3, r1)
            return r1
        L20:
            r1 = 0
            return r1
    }
}
