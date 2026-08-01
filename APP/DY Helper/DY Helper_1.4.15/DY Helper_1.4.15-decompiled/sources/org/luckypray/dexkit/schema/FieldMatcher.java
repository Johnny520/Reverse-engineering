package org.luckypray.dexkit.schema;

/* JADX INFO: renamed from: org.luckypray.dexkit.schema.-FieldMatcher, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class FieldMatcher extends p000.p22 {
    public static final org.luckypray.dexkit.schema.FieldMatcher.Companion Companion = null;

    /* JADX INFO: renamed from: org.luckypray.dexkit.schema.-FieldMatcher$Companion */
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

        public final void addAccessFlags(p000.b40 r1, int r2) {
                r0 = this;
                r1.getClass()
                r0 = 1
                r1.m727(r0, r2)
                return
        }

        public final void addAllOf(p000.b40 r1, int r2) {
                r0 = this;
                r1.getClass()
                r0 = 7
                r1.m727(r0, r2)
                return
        }

        public final void addAnnotations(p000.b40 r1, int r2) {
                r0 = this;
                r1.getClass()
                r0 = 4
                r1.m727(r0, r2)
                return
        }

        public final void addAnyOf(p000.b40 r1, int r2) {
                r0 = this;
                r1.getClass()
                r0 = 8
                r1.m727(r0, r2)
                return
        }

        public final void addDeclaringClass(p000.b40 r1, int r2) {
                r0 = this;
                r1.getClass()
                r0 = 2
                r1.m727(r0, r2)
                return
        }

        public final void addFieldName(p000.b40 r1, int r2) {
                r0 = this;
                r1.getClass()
                r0 = 0
                r1.m727(r0, r2)
                return
        }

        public final void addGetMethods(p000.b40 r1, int r2) {
                r0 = this;
                r1.getClass()
                r0 = 5
                r1.m727(r0, r2)
                return
        }

        public final void addNoneOf(p000.b40 r1, int r2) {
                r0 = this;
                r1.getClass()
                r0 = 9
                r1.m727(r0, r2)
                return
        }

        public final void addPutMethods(p000.b40 r1, int r2) {
                r0 = this;
                r1.getClass()
                r0 = 6
                r1.m727(r0, r2)
                return
        }

        public final void addTypeClass(p000.b40 r1, int r2) {
                r0 = this;
                r1.getClass()
                r0 = 3
                r1.m727(r0, r2)
                return
        }

        public final int createAllOfVector(p000.b40 r2, int[] r3) {
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

        public final int createAnyOfVector(p000.b40 r2, int[] r3) {
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

        public final int createFieldMatcher(p000.b40 r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9, int r10, int r11, int r12) {
                r1 = this;
                r2.getClass()
                r0 = 10
                r2.m737(r0)
                r1.addNoneOf(r2, r12)
                r1.addAnyOf(r2, r11)
                r1.addAllOf(r2, r10)
                r1.addPutMethods(r2, r9)
                r1.addGetMethods(r2, r8)
                r1.addAnnotations(r2, r7)
                r1.addTypeClass(r2, r6)
                r1.addDeclaringClass(r2, r5)
                r1.addAccessFlags(r2, r4)
                r1.addFieldName(r2, r3)
                int r1 = r1.endFieldMatcher(r2)
                return r1
        }

        public final int createNoneOfVector(p000.b40 r2, int[] r3) {
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

        public final int endFieldMatcher(p000.b40 r1) {
                r0 = this;
                r1.getClass()
                int r0 = r1.m731()
                return r0
        }

        public final org.luckypray.dexkit.schema.FieldMatcher getRootAsFieldMatcher(java.nio.ByteBuffer r2) {
                r1 = this;
                r2.getClass()
                org.luckypray.dexkit.schema.-FieldMatcher r0 = new org.luckypray.dexkit.schema.-FieldMatcher
                r0.<init>()
                org.luckypray.dexkit.schema.-FieldMatcher r1 = r1.getRootAsFieldMatcher(r2, r0)
                return r1
        }

        public final org.luckypray.dexkit.schema.FieldMatcher getRootAsFieldMatcher(java.nio.ByteBuffer r2, org.luckypray.dexkit.schema.FieldMatcher r3) {
                r1 = this;
                r2.getClass()
                r3.getClass()
                java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN
                int r1 = p000.AbstractC0602nx.m4122(r2, r1)
                int r0 = r2.position()
                int r0 = r0 + r1
                org.luckypray.dexkit.schema.-FieldMatcher r1 = r3.__assign(r0, r2)
                return r1
        }

        public final void startAllOfVector(p000.b40 r1, int r2) {
                r0 = this;
                r1.getClass()
                r0 = 4
                r1.m738(r0, r2, r0)
                return
        }

        public final void startAnyOfVector(p000.b40 r1, int r2) {
                r0 = this;
                r1.getClass()
                r0 = 4
                r1.m738(r0, r2, r0)
                return
        }

        public final void startFieldMatcher(p000.b40 r1) {
                r0 = this;
                r1.getClass()
                r0 = 10
                r1.m737(r0)
                return
        }

        public final void startNoneOfVector(p000.b40 r1, int r2) {
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
            org.luckypray.dexkit.schema.-FieldMatcher$Companion r0 = new org.luckypray.dexkit.schema.-FieldMatcher$Companion
            r1 = 0
            r0.<init>(r1)
            org.luckypray.dexkit.schema.FieldMatcher.Companion = r0
            return
    }

    public FieldMatcher() {
            r0 = this;
            r0.<init>()
            return
    }

    public final org.luckypray.dexkit.schema.FieldMatcher __assign(int r1, java.nio.ByteBuffer r2) {
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

    public final org.luckypray.dexkit.schema.AccessFlagsMatcher accessFlags(org.luckypray.dexkit.schema.AccessFlagsMatcher r3) {
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
            org.luckypray.dexkit.schema.-AccessFlagsMatcher r2 = r3.__assign(r0, r2)
            return r2
        L1b:
            r2 = 0
            return r2
    }

    public final org.luckypray.dexkit.schema.FieldMatcher allOf(int r2) {
            r1 = this;
            org.luckypray.dexkit.schema.-FieldMatcher r0 = new org.luckypray.dexkit.schema.-FieldMatcher
            r0.<init>()
            org.luckypray.dexkit.schema.-FieldMatcher r1 = r1.allOf(r0, r2)
            return r1
    }

    public final org.luckypray.dexkit.schema.FieldMatcher allOf(org.luckypray.dexkit.schema.FieldMatcher r2, int r3) {
            r1 = this;
            r2.getClass()
            r0 = 18
            int r0 = r1.__offset(r0)
            if (r0 == 0) goto L20
            int r0 = r1.__vector(r0)
            int r3 = r3 * 4
            int r3 = r3 + r0
            int r3 = r1.__indirect(r3)
            java.nio.ByteBuffer r1 = r1.f8399bb
            r1.getClass()
            org.luckypray.dexkit.schema.-FieldMatcher r1 = r2.__assign(r3, r1)
            return r1
        L20:
            r1 = 0
            return r1
    }

    public final org.luckypray.dexkit.schema.AnnotationsMatcher annotations(org.luckypray.dexkit.schema.AnnotationsMatcher r3) {
            r2 = this;
            r3.getClass()
            r0 = 12
            int r0 = r2.__offset(r0)
            if (r0 == 0) goto L1c
            int r1 = r2.bb_pos
            int r0 = r0 + r1
            int r0 = r2.__indirect(r0)
            java.nio.ByteBuffer r2 = r2.f8399bb
            r2.getClass()
            org.luckypray.dexkit.schema.-AnnotationsMatcher r2 = r3.__assign(r0, r2)
            return r2
        L1c:
            r2 = 0
            return r2
    }

    public final org.luckypray.dexkit.schema.FieldMatcher anyOf(int r2) {
            r1 = this;
            org.luckypray.dexkit.schema.-FieldMatcher r0 = new org.luckypray.dexkit.schema.-FieldMatcher
            r0.<init>()
            org.luckypray.dexkit.schema.-FieldMatcher r1 = r1.anyOf(r0, r2)
            return r1
    }

    public final org.luckypray.dexkit.schema.FieldMatcher anyOf(org.luckypray.dexkit.schema.FieldMatcher r2, int r3) {
            r1 = this;
            r2.getClass()
            r0 = 20
            int r0 = r1.__offset(r0)
            if (r0 == 0) goto L20
            int r0 = r1.__vector(r0)
            int r3 = r3 * 4
            int r3 = r3 + r0
            int r3 = r1.__indirect(r3)
            java.nio.ByteBuffer r1 = r1.f8399bb
            r1.getClass()
            org.luckypray.dexkit.schema.-FieldMatcher r1 = r2.__assign(r3, r1)
            return r1
        L20:
            r1 = 0
            return r1
    }

    public final org.luckypray.dexkit.schema.ClassMatcher declaringClass(org.luckypray.dexkit.schema.ClassMatcher r3) {
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
            org.luckypray.dexkit.schema.-ClassMatcher r2 = r3.__assign(r0, r2)
            return r2
        L1c:
            r2 = 0
            return r2
    }

    public final org.luckypray.dexkit.schema.StringMatcher fieldName(org.luckypray.dexkit.schema.StringMatcher r3) {
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
            org.luckypray.dexkit.schema.-StringMatcher r2 = r3.__assign(r0, r2)
            return r2
        L1b:
            r2 = 0
            return r2
    }

    public final org.luckypray.dexkit.schema.AccessFlagsMatcher getAccessFlags() {
            r1 = this;
            org.luckypray.dexkit.schema.-AccessFlagsMatcher r0 = new org.luckypray.dexkit.schema.-AccessFlagsMatcher
            r0.<init>()
            org.luckypray.dexkit.schema.-AccessFlagsMatcher r1 = r1.accessFlags(r0)
            return r1
    }

    public final int getAllOfLength() {
            r1 = this;
            r0 = 18
            int r0 = r1.__offset(r0)
            if (r0 == 0) goto Ld
            int r1 = r1.__vector_len(r0)
            return r1
        Ld:
            r1 = 0
            return r1
    }

    public final org.luckypray.dexkit.schema.AnnotationsMatcher getAnnotations() {
            r1 = this;
            org.luckypray.dexkit.schema.-AnnotationsMatcher r0 = new org.luckypray.dexkit.schema.-AnnotationsMatcher
            r0.<init>()
            org.luckypray.dexkit.schema.-AnnotationsMatcher r1 = r1.annotations(r0)
            return r1
    }

    public final int getAnyOfLength() {
            r1 = this;
            r0 = 20
            int r0 = r1.__offset(r0)
            if (r0 == 0) goto Ld
            int r1 = r1.__vector_len(r0)
            return r1
        Ld:
            r1 = 0
            return r1
    }

    public final org.luckypray.dexkit.schema.ClassMatcher getDeclaringClass() {
            r1 = this;
            org.luckypray.dexkit.schema.-ClassMatcher r0 = new org.luckypray.dexkit.schema.-ClassMatcher
            r0.<init>()
            org.luckypray.dexkit.schema.-ClassMatcher r1 = r1.declaringClass(r0)
            return r1
    }

    public final org.luckypray.dexkit.schema.StringMatcher getFieldName() {
            r1 = this;
            org.luckypray.dexkit.schema.-StringMatcher r0 = new org.luckypray.dexkit.schema.-StringMatcher
            r0.<init>()
            org.luckypray.dexkit.schema.-StringMatcher r1 = r1.fieldName(r0)
            return r1
    }

    public final org.luckypray.dexkit.schema.MethodsMatcher getGetMethods() {
            r1 = this;
            org.luckypray.dexkit.schema.-MethodsMatcher r0 = new org.luckypray.dexkit.schema.-MethodsMatcher
            r0.<init>()
            org.luckypray.dexkit.schema.-MethodsMatcher r1 = r1.getMethods(r0)
            return r1
    }

    public final org.luckypray.dexkit.schema.MethodsMatcher getMethods(org.luckypray.dexkit.schema.MethodsMatcher r3) {
            r2 = this;
            r3.getClass()
            r0 = 14
            int r0 = r2.__offset(r0)
            if (r0 == 0) goto L1c
            int r1 = r2.bb_pos
            int r0 = r0 + r1
            int r0 = r2.__indirect(r0)
            java.nio.ByteBuffer r2 = r2.f8399bb
            r2.getClass()
            org.luckypray.dexkit.schema.-MethodsMatcher r2 = r3.__assign(r0, r2)
            return r2
        L1c:
            r2 = 0
            return r2
    }

    public final int getNoneOfLength() {
            r1 = this;
            r0 = 22
            int r0 = r1.__offset(r0)
            if (r0 == 0) goto Ld
            int r1 = r1.__vector_len(r0)
            return r1
        Ld:
            r1 = 0
            return r1
    }

    public final org.luckypray.dexkit.schema.MethodsMatcher getPutMethods() {
            r1 = this;
            org.luckypray.dexkit.schema.-MethodsMatcher r0 = new org.luckypray.dexkit.schema.-MethodsMatcher
            r0.<init>()
            org.luckypray.dexkit.schema.-MethodsMatcher r1 = r1.putMethods(r0)
            return r1
    }

    public final org.luckypray.dexkit.schema.ClassMatcher getTypeClass() {
            r1 = this;
            org.luckypray.dexkit.schema.-ClassMatcher r0 = new org.luckypray.dexkit.schema.-ClassMatcher
            r0.<init>()
            org.luckypray.dexkit.schema.-ClassMatcher r1 = r1.typeClass(r0)
            return r1
    }

    public final org.luckypray.dexkit.schema.FieldMatcher noneOf(int r2) {
            r1 = this;
            org.luckypray.dexkit.schema.-FieldMatcher r0 = new org.luckypray.dexkit.schema.-FieldMatcher
            r0.<init>()
            org.luckypray.dexkit.schema.-FieldMatcher r1 = r1.noneOf(r0, r2)
            return r1
    }

    public final org.luckypray.dexkit.schema.FieldMatcher noneOf(org.luckypray.dexkit.schema.FieldMatcher r2, int r3) {
            r1 = this;
            r2.getClass()
            r0 = 22
            int r0 = r1.__offset(r0)
            if (r0 == 0) goto L20
            int r0 = r1.__vector(r0)
            int r3 = r3 * 4
            int r3 = r3 + r0
            int r3 = r1.__indirect(r3)
            java.nio.ByteBuffer r1 = r1.f8399bb
            r1.getClass()
            org.luckypray.dexkit.schema.-FieldMatcher r1 = r2.__assign(r3, r1)
            return r1
        L20:
            r1 = 0
            return r1
    }

    public final org.luckypray.dexkit.schema.MethodsMatcher putMethods(org.luckypray.dexkit.schema.MethodsMatcher r3) {
            r2 = this;
            r3.getClass()
            r0 = 16
            int r0 = r2.__offset(r0)
            if (r0 == 0) goto L1c
            int r1 = r2.bb_pos
            int r0 = r0 + r1
            int r0 = r2.__indirect(r0)
            java.nio.ByteBuffer r2 = r2.f8399bb
            r2.getClass()
            org.luckypray.dexkit.schema.-MethodsMatcher r2 = r3.__assign(r0, r2)
            return r2
        L1c:
            r2 = 0
            return r2
    }

    public final org.luckypray.dexkit.schema.ClassMatcher typeClass(org.luckypray.dexkit.schema.ClassMatcher r3) {
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
            org.luckypray.dexkit.schema.-ClassMatcher r2 = r3.__assign(r0, r2)
            return r2
        L1c:
            r2 = 0
            return r2
    }
}
