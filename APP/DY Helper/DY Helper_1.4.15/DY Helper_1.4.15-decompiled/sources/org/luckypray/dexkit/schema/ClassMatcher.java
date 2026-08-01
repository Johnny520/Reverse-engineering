package org.luckypray.dexkit.schema;

/* JADX INFO: renamed from: org.luckypray.dexkit.schema.-ClassMatcher, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ClassMatcher extends p000.p22 {
    public static final org.luckypray.dexkit.schema.ClassMatcher.Companion Companion = null;

    /* JADX INFO: renamed from: org.luckypray.dexkit.schema.-ClassMatcher$Companion */
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
                r0 = 2
                r1.m727(r0, r2)
                return
        }

        public final void addAllOf(p000.b40 r1, int r2) {
                r0 = this;
                r1.getClass()
                r0 = 9
                r1.m727(r0, r2)
                return
        }

        public final void addAnnotations(p000.b40 r1, int r2) {
                r0 = this;
                r1.getClass()
                r0 = 5
                r1.m727(r0, r2)
                return
        }

        public final void addAnyOf(p000.b40 r1, int r2) {
                r0 = this;
                r1.getClass()
                r0 = 10
                r1.m727(r0, r2)
                return
        }

        public final void addClassName(p000.b40 r1, int r2) {
                r0 = this;
                r1.getClass()
                r0 = 1
                r1.m727(r0, r2)
                return
        }

        public final void addFields(p000.b40 r1, int r2) {
                r0 = this;
                r1.getClass()
                r0 = 6
                r1.m727(r0, r2)
                return
        }

        public final void addInterfaces(p000.b40 r1, int r2) {
                r0 = this;
                r1.getClass()
                r0 = 4
                r1.m727(r0, r2)
                return
        }

        public final void addMethods(p000.b40 r1, int r2) {
                r0 = this;
                r1.getClass()
                r0 = 7
                r1.m727(r0, r2)
                return
        }

        public final void addNoneOf(p000.b40 r1, int r2) {
                r0 = this;
                r1.getClass()
                r0 = 11
                r1.m727(r0, r2)
                return
        }

        public final void addSmaliSource(p000.b40 r1, int r2) {
                r0 = this;
                r1.getClass()
                r0 = 0
                r1.m727(r0, r2)
                return
        }

        public final void addSuperClass(p000.b40 r1, int r2) {
                r0 = this;
                r1.getClass()
                r0 = 3
                r1.m727(r0, r2)
                return
        }

        public final void addUsingStrings(p000.b40 r1, int r2) {
                r0 = this;
                r1.getClass()
                r0 = 8
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

        public final int createClassMatcher(p000.b40 r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9, int r10, int r11, int r12, int r13, int r14) {
                r1 = this;
                r2.getClass()
                r0 = 12
                r2.m737(r0)
                r1.addNoneOf(r2, r14)
                r1.addAnyOf(r2, r13)
                r1.addAllOf(r2, r12)
                r1.addUsingStrings(r2, r11)
                r1.addMethods(r2, r10)
                r1.addFields(r2, r9)
                r1.addAnnotations(r2, r8)
                r1.addInterfaces(r2, r7)
                r1.addSuperClass(r2, r6)
                r1.addAccessFlags(r2, r5)
                r1.addClassName(r2, r4)
                r1.addSmaliSource(r2, r3)
                int r1 = r1.endClassMatcher(r2)
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

        public final int endClassMatcher(p000.b40 r1) {
                r0 = this;
                r1.getClass()
                int r0 = r1.m731()
                return r0
        }

        public final org.luckypray.dexkit.schema.ClassMatcher getRootAsClassMatcher(java.nio.ByteBuffer r2) {
                r1 = this;
                r2.getClass()
                org.luckypray.dexkit.schema.-ClassMatcher r0 = new org.luckypray.dexkit.schema.-ClassMatcher
                r0.<init>()
                org.luckypray.dexkit.schema.-ClassMatcher r1 = r1.getRootAsClassMatcher(r2, r0)
                return r1
        }

        public final org.luckypray.dexkit.schema.ClassMatcher getRootAsClassMatcher(java.nio.ByteBuffer r2, org.luckypray.dexkit.schema.ClassMatcher r3) {
                r1 = this;
                r2.getClass()
                r3.getClass()
                java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN
                int r1 = p000.AbstractC0602nx.m4122(r2, r1)
                int r0 = r2.position()
                int r0 = r0 + r1
                org.luckypray.dexkit.schema.-ClassMatcher r1 = r3.__assign(r0, r2)
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

        public final void startClassMatcher(p000.b40 r1) {
                r0 = this;
                r1.getClass()
                r0 = 12
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
            org.luckypray.dexkit.schema.-ClassMatcher$Companion r0 = new org.luckypray.dexkit.schema.-ClassMatcher$Companion
            r1 = 0
            r0.<init>(r1)
            org.luckypray.dexkit.schema.ClassMatcher.Companion = r0
            return
    }

    public ClassMatcher() {
            r0 = this;
            r0.<init>()
            return
    }

    public final org.luckypray.dexkit.schema.ClassMatcher __assign(int r1, java.nio.ByteBuffer r2) {
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
            r0 = 8
            int r0 = r2.__offset(r0)
            if (r0 == 0) goto L1c
            int r1 = r2.bb_pos
            int r0 = r0 + r1
            int r0 = r2.__indirect(r0)
            java.nio.ByteBuffer r2 = r2.f8399bb
            r2.getClass()
            org.luckypray.dexkit.schema.-AccessFlagsMatcher r2 = r3.__assign(r0, r2)
            return r2
        L1c:
            r2 = 0
            return r2
    }

    public final org.luckypray.dexkit.schema.ClassMatcher allOf(int r2) {
            r1 = this;
            org.luckypray.dexkit.schema.-ClassMatcher r0 = new org.luckypray.dexkit.schema.-ClassMatcher
            r0.<init>()
            org.luckypray.dexkit.schema.-ClassMatcher r1 = r1.allOf(r0, r2)
            return r1
    }

    public final org.luckypray.dexkit.schema.ClassMatcher allOf(org.luckypray.dexkit.schema.ClassMatcher r2, int r3) {
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
            org.luckypray.dexkit.schema.-ClassMatcher r1 = r2.__assign(r3, r1)
            return r1
        L20:
            r1 = 0
            return r1
    }

    public final org.luckypray.dexkit.schema.AnnotationsMatcher annotations(org.luckypray.dexkit.schema.AnnotationsMatcher r3) {
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
            org.luckypray.dexkit.schema.-AnnotationsMatcher r2 = r3.__assign(r0, r2)
            return r2
        L1c:
            r2 = 0
            return r2
    }

    public final org.luckypray.dexkit.schema.ClassMatcher anyOf(int r2) {
            r1 = this;
            org.luckypray.dexkit.schema.-ClassMatcher r0 = new org.luckypray.dexkit.schema.-ClassMatcher
            r0.<init>()
            org.luckypray.dexkit.schema.-ClassMatcher r1 = r1.anyOf(r0, r2)
            return r1
    }

    public final org.luckypray.dexkit.schema.ClassMatcher anyOf(org.luckypray.dexkit.schema.ClassMatcher r2, int r3) {
            r1 = this;
            r2.getClass()
            r0 = 24
            int r0 = r1.__offset(r0)
            if (r0 == 0) goto L20
            int r0 = r1.__vector(r0)
            int r3 = r3 * 4
            int r3 = r3 + r0
            int r3 = r1.__indirect(r3)
            java.nio.ByteBuffer r1 = r1.f8399bb
            r1.getClass()
            org.luckypray.dexkit.schema.-ClassMatcher r1 = r2.__assign(r3, r1)
            return r1
        L20:
            r1 = 0
            return r1
    }

    public final org.luckypray.dexkit.schema.StringMatcher className(org.luckypray.dexkit.schema.StringMatcher r3) {
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
            org.luckypray.dexkit.schema.-StringMatcher r2 = r3.__assign(r0, r2)
            return r2
        L1b:
            r2 = 0
            return r2
    }

    public final org.luckypray.dexkit.schema.FieldsMatcher fields(org.luckypray.dexkit.schema.FieldsMatcher r3) {
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
            org.luckypray.dexkit.schema.-FieldsMatcher r2 = r3.__assign(r0, r2)
            return r2
        L1c:
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
            r0 = 22
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
            r0 = 24
            int r0 = r1.__offset(r0)
            if (r0 == 0) goto Ld
            int r1 = r1.__vector_len(r0)
            return r1
        Ld:
            r1 = 0
            return r1
    }

    public final org.luckypray.dexkit.schema.StringMatcher getClassName() {
            r1 = this;
            org.luckypray.dexkit.schema.-StringMatcher r0 = new org.luckypray.dexkit.schema.-StringMatcher
            r0.<init>()
            org.luckypray.dexkit.schema.-StringMatcher r1 = r1.className(r0)
            return r1
    }

    public final org.luckypray.dexkit.schema.FieldsMatcher getFields() {
            r1 = this;
            org.luckypray.dexkit.schema.-FieldsMatcher r0 = new org.luckypray.dexkit.schema.-FieldsMatcher
            r0.<init>()
            org.luckypray.dexkit.schema.-FieldsMatcher r1 = r1.fields(r0)
            return r1
    }

    public final org.luckypray.dexkit.schema.InterfacesMatcher getInterfaces() {
            r1 = this;
            org.luckypray.dexkit.schema.-InterfacesMatcher r0 = new org.luckypray.dexkit.schema.-InterfacesMatcher
            r0.<init>()
            org.luckypray.dexkit.schema.-InterfacesMatcher r1 = r1.interfaces(r0)
            return r1
    }

    public final org.luckypray.dexkit.schema.MethodsMatcher getMethods() {
            r1 = this;
            org.luckypray.dexkit.schema.-MethodsMatcher r0 = new org.luckypray.dexkit.schema.-MethodsMatcher
            r0.<init>()
            org.luckypray.dexkit.schema.-MethodsMatcher r1 = r1.methods(r0)
            return r1
    }

    public final int getNoneOfLength() {
            r1 = this;
            r0 = 26
            int r0 = r1.__offset(r0)
            if (r0 == 0) goto Ld
            int r1 = r1.__vector_len(r0)
            return r1
        Ld:
            r1 = 0
            return r1
    }

    public final org.luckypray.dexkit.schema.StringMatcher getSmaliSource() {
            r1 = this;
            org.luckypray.dexkit.schema.-StringMatcher r0 = new org.luckypray.dexkit.schema.-StringMatcher
            r0.<init>()
            org.luckypray.dexkit.schema.-StringMatcher r1 = r1.smaliSource(r0)
            return r1
    }

    public final org.luckypray.dexkit.schema.ClassMatcher getSuperClass() {
            r1 = this;
            org.luckypray.dexkit.schema.-ClassMatcher r0 = new org.luckypray.dexkit.schema.-ClassMatcher
            r0.<init>()
            org.luckypray.dexkit.schema.-ClassMatcher r1 = r1.superClass(r0)
            return r1
    }

    public final int getUsingStringsLength() {
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

    public final org.luckypray.dexkit.schema.InterfacesMatcher interfaces(org.luckypray.dexkit.schema.InterfacesMatcher r3) {
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
            org.luckypray.dexkit.schema.-InterfacesMatcher r2 = r3.__assign(r0, r2)
            return r2
        L1c:
            r2 = 0
            return r2
    }

    public final org.luckypray.dexkit.schema.MethodsMatcher methods(org.luckypray.dexkit.schema.MethodsMatcher r3) {
            r2 = this;
            r3.getClass()
            r0 = 18
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

    public final org.luckypray.dexkit.schema.ClassMatcher noneOf(int r2) {
            r1 = this;
            org.luckypray.dexkit.schema.-ClassMatcher r0 = new org.luckypray.dexkit.schema.-ClassMatcher
            r0.<init>()
            org.luckypray.dexkit.schema.-ClassMatcher r1 = r1.noneOf(r0, r2)
            return r1
    }

    public final org.luckypray.dexkit.schema.ClassMatcher noneOf(org.luckypray.dexkit.schema.ClassMatcher r2, int r3) {
            r1 = this;
            r2.getClass()
            r0 = 26
            int r0 = r1.__offset(r0)
            if (r0 == 0) goto L20
            int r0 = r1.__vector(r0)
            int r3 = r3 * 4
            int r3 = r3 + r0
            int r3 = r1.__indirect(r3)
            java.nio.ByteBuffer r1 = r1.f8399bb
            r1.getClass()
            org.luckypray.dexkit.schema.-ClassMatcher r1 = r2.__assign(r3, r1)
            return r1
        L20:
            r1 = 0
            return r1
    }

    public final org.luckypray.dexkit.schema.StringMatcher smaliSource(org.luckypray.dexkit.schema.StringMatcher r3) {
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

    public final org.luckypray.dexkit.schema.ClassMatcher superClass(org.luckypray.dexkit.schema.ClassMatcher r3) {
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
            r0 = 20
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
