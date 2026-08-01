package org.luckypray.dexkit.schema;

/* JADX INFO: renamed from: org.luckypray.dexkit.schema.-MethodMatcher, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class MethodMatcher extends p000.p22 {
    public static final org.luckypray.dexkit.schema.MethodMatcher.Companion Companion = null;

    /* JADX INFO: renamed from: org.luckypray.dexkit.schema.-MethodMatcher$Companion */
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
                r0 = 14
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
                r0 = 15
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

        public final void addInvokingMethods(p000.b40 r1, int r2) {
                r0 = this;
                r1.getClass()
                r0 = 11
                r1.m727(r0, r2)
                return
        }

        public final void addMethodCallers(p000.b40 r1, int r2) {
                r0 = this;
                r1.getClass()
                r0 = 12
                r1.m727(r0, r2)
                return
        }

        public final void addMethodName(p000.b40 r1, int r2) {
                r0 = this;
                r1.getClass()
                r0 = 0
                r1.m727(r0, r2)
                return
        }

        public final void addNoneOf(p000.b40 r1, int r2) {
                r0 = this;
                r1.getClass()
                r0 = 16
                r1.m727(r0, r2)
                return
        }

        public final void addOpCodes(p000.b40 r1, int r2) {
                r0 = this;
                r1.getClass()
                r0 = 6
                r1.m727(r0, r2)
                return
        }

        public final void addParameters(p000.b40 r1, int r2) {
                r0 = this;
                r1.getClass()
                r0 = 4
                r1.m727(r0, r2)
                return
        }

        public final void addProtoShorty(p000.b40 r1, int r2) {
                r0 = this;
                r1.getClass()
                r0 = 13
                r1.m727(r0, r2)
                return
        }

        public final void addReturnType(p000.b40 r1, int r2) {
                r0 = this;
                r1.getClass()
                r0 = 3
                r1.m727(r0, r2)
                return
        }

        public final void addUsingFields(p000.b40 r1, int r2) {
                r0 = this;
                r1.getClass()
                r0 = 8
                r1.m727(r0, r2)
                return
        }

        public final void addUsingNumbers(p000.b40 r1, int r2) {
                r0 = this;
                r1.getClass()
                r0 = 10
                r1.m727(r0, r2)
                return
        }

        public final void addUsingNumbersType(p000.b40 r1, int r2) {
                r0 = this;
                r1.getClass()
                r0 = 9
                r1.m727(r0, r2)
                return
        }

        public final void addUsingStrings(p000.b40 r1, int r2) {
                r0 = this;
                r1.getClass()
                r0 = 7
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

        public final int createMethodMatcher(p000.b40 r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9, int r10, int r11, int r12, int r13, int r14, int r15, int r16, int r17, int r18, int r19) {
                r1 = this;
                r2.getClass()
                r0 = 17
                r2.m737(r0)
                r0 = r19
                r1.addNoneOf(r2, r0)
                r0 = r18
                r1.addAnyOf(r2, r0)
                r0 = r17
                r1.addAllOf(r2, r0)
                r0 = r16
                r1.addProtoShorty(r2, r0)
                r1.addMethodCallers(r2, r15)
                r1.addInvokingMethods(r2, r14)
                r1.addUsingNumbers(r2, r13)
                r1.addUsingNumbersType(r2, r12)
                r1.addUsingFields(r2, r11)
                r1.addUsingStrings(r2, r10)
                r1.addOpCodes(r2, r9)
                r1.addAnnotations(r2, r8)
                r1.addParameters(r2, r7)
                r1.addReturnType(r2, r6)
                r1.addDeclaringClass(r2, r5)
                r1.addAccessFlags(r2, r4)
                r1.addMethodName(r2, r3)
                int r1 = r1.endMethodMatcher(r2)
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

        public final int createUsingFieldsVector(p000.b40 r2, int[] r3) {
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

        /* JADX INFO: renamed from: createUsingNumbersTypeVector-VU-fvBY, reason: not valid java name */
        public final int m7452createUsingNumbersTypeVectorVUfvBY(p000.b40 r2, byte[] r3) {
                r1 = this;
                r2.getClass()
                r3.getClass()
                int r1 = r3.length
                r0 = 1
                r2.m738(r0, r1, r0)
                int r1 = r3.length
                int r1 = r1 - r0
            Ld:
                r0 = -1
                if (r0 >= r1) goto L18
                r0 = r3[r1]
                r2.m721(r0)
                int r1 = r1 + (-1)
                goto Ld
            L18:
                int r1 = r2.m732()
                return r1
        }

        public final int createUsingNumbersVector(p000.b40 r2, int[] r3) {
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

        public final int endMethodMatcher(p000.b40 r1) {
                r0 = this;
                r1.getClass()
                int r0 = r1.m731()
                return r0
        }

        public final org.luckypray.dexkit.schema.MethodMatcher getRootAsMethodMatcher(java.nio.ByteBuffer r2) {
                r1 = this;
                r2.getClass()
                org.luckypray.dexkit.schema.-MethodMatcher r0 = new org.luckypray.dexkit.schema.-MethodMatcher
                r0.<init>()
                org.luckypray.dexkit.schema.-MethodMatcher r1 = r1.getRootAsMethodMatcher(r2, r0)
                return r1
        }

        public final org.luckypray.dexkit.schema.MethodMatcher getRootAsMethodMatcher(java.nio.ByteBuffer r2, org.luckypray.dexkit.schema.MethodMatcher r3) {
                r1 = this;
                r2.getClass()
                r3.getClass()
                java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN
                int r1 = p000.AbstractC0602nx.m4122(r2, r1)
                int r0 = r2.position()
                int r0 = r0 + r1
                org.luckypray.dexkit.schema.-MethodMatcher r1 = r3.__assign(r0, r2)
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

        public final void startMethodMatcher(p000.b40 r1) {
                r0 = this;
                r1.getClass()
                r0 = 17
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

        public final void startUsingFieldsVector(p000.b40 r1, int r2) {
                r0 = this;
                r1.getClass()
                r0 = 4
                r1.m738(r0, r2, r0)
                return
        }

        public final void startUsingNumbersTypeVector(p000.b40 r1, int r2) {
                r0 = this;
                r1.getClass()
                r0 = 1
                r1.m738(r0, r2, r0)
                return
        }

        public final void startUsingNumbersVector(p000.b40 r1, int r2) {
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
            org.luckypray.dexkit.schema.-MethodMatcher$Companion r0 = new org.luckypray.dexkit.schema.-MethodMatcher$Companion
            r1 = 0
            r0.<init>(r1)
            org.luckypray.dexkit.schema.MethodMatcher.Companion = r0
            return
    }

    public MethodMatcher() {
            r0 = this;
            r0.<init>()
            return
    }

    public final org.luckypray.dexkit.schema.MethodMatcher __assign(int r1, java.nio.ByteBuffer r2) {
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

    public final org.luckypray.dexkit.schema.MethodMatcher allOf(int r2) {
            r1 = this;
            org.luckypray.dexkit.schema.-MethodMatcher r0 = new org.luckypray.dexkit.schema.-MethodMatcher
            r0.<init>()
            org.luckypray.dexkit.schema.-MethodMatcher r1 = r1.allOf(r0, r2)
            return r1
    }

    public final org.luckypray.dexkit.schema.MethodMatcher allOf(org.luckypray.dexkit.schema.MethodMatcher r2, int r3) {
            r1 = this;
            r2.getClass()
            r0 = 32
            int r0 = r1.__offset(r0)
            if (r0 == 0) goto L20
            int r0 = r1.__vector(r0)
            int r3 = r3 * 4
            int r3 = r3 + r0
            int r3 = r1.__indirect(r3)
            java.nio.ByteBuffer r1 = r1.f8399bb
            r1.getClass()
            org.luckypray.dexkit.schema.-MethodMatcher r1 = r2.__assign(r3, r1)
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

    public final org.luckypray.dexkit.schema.MethodMatcher anyOf(int r2) {
            r1 = this;
            org.luckypray.dexkit.schema.-MethodMatcher r0 = new org.luckypray.dexkit.schema.-MethodMatcher
            r0.<init>()
            org.luckypray.dexkit.schema.-MethodMatcher r1 = r1.anyOf(r0, r2)
            return r1
    }

    public final org.luckypray.dexkit.schema.MethodMatcher anyOf(org.luckypray.dexkit.schema.MethodMatcher r2, int r3) {
            r1 = this;
            r2.getClass()
            r0 = 34
            int r0 = r1.__offset(r0)
            if (r0 == 0) goto L20
            int r0 = r1.__vector(r0)
            int r3 = r3 * 4
            int r3 = r3 + r0
            int r3 = r1.__indirect(r3)
            java.nio.ByteBuffer r1 = r1.f8399bb
            r1.getClass()
            org.luckypray.dexkit.schema.-MethodMatcher r1 = r2.__assign(r3, r1)
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

    public final org.luckypray.dexkit.schema.AccessFlagsMatcher getAccessFlags() {
            r1 = this;
            org.luckypray.dexkit.schema.-AccessFlagsMatcher r0 = new org.luckypray.dexkit.schema.-AccessFlagsMatcher
            r0.<init>()
            org.luckypray.dexkit.schema.-AccessFlagsMatcher r1 = r1.accessFlags(r0)
            return r1
    }

    public final int getAllOfLength() {
            r1 = this;
            r0 = 32
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
            r0 = 34
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

    public final org.luckypray.dexkit.schema.MethodsMatcher getInvokingMethods() {
            r1 = this;
            org.luckypray.dexkit.schema.-MethodsMatcher r0 = new org.luckypray.dexkit.schema.-MethodsMatcher
            r0.<init>()
            org.luckypray.dexkit.schema.-MethodsMatcher r1 = r1.invokingMethods(r0)
            return r1
    }

    public final org.luckypray.dexkit.schema.MethodsMatcher getMethodCallers() {
            r1 = this;
            org.luckypray.dexkit.schema.-MethodsMatcher r0 = new org.luckypray.dexkit.schema.-MethodsMatcher
            r0.<init>()
            org.luckypray.dexkit.schema.-MethodsMatcher r1 = r1.methodCallers(r0)
            return r1
    }

    public final org.luckypray.dexkit.schema.StringMatcher getMethodName() {
            r1 = this;
            org.luckypray.dexkit.schema.-StringMatcher r0 = new org.luckypray.dexkit.schema.-StringMatcher
            r0.<init>()
            org.luckypray.dexkit.schema.-StringMatcher r1 = r1.methodName(r0)
            return r1
    }

    public final int getNoneOfLength() {
            r1 = this;
            r0 = 36
            int r0 = r1.__offset(r0)
            if (r0 == 0) goto Ld
            int r1 = r1.__vector_len(r0)
            return r1
        Ld:
            r1 = 0
            return r1
    }

    public final org.luckypray.dexkit.schema.OpCodesMatcher getOpCodes() {
            r1 = this;
            org.luckypray.dexkit.schema.-OpCodesMatcher r0 = new org.luckypray.dexkit.schema.-OpCodesMatcher
            r0.<init>()
            org.luckypray.dexkit.schema.-OpCodesMatcher r1 = r1.opCodes(r0)
            return r1
    }

    public final org.luckypray.dexkit.schema.ParametersMatcher getParameters() {
            r1 = this;
            org.luckypray.dexkit.schema.-ParametersMatcher r0 = new org.luckypray.dexkit.schema.-ParametersMatcher
            r0.<init>()
            org.luckypray.dexkit.schema.-ParametersMatcher r1 = r1.parameters(r0)
            return r1
    }

    public final java.lang.String getProtoShorty() {
            r2 = this;
            r0 = 30
            int r0 = r2.__offset(r0)
            if (r0 == 0) goto L10
            int r1 = r2.bb_pos
            int r0 = r0 + r1
            java.lang.String r2 = r2.__string(r0)
            return r2
        L10:
            r2 = 0
            return r2
    }

    public final java.nio.ByteBuffer getProtoShortyAsByteBuffer() {
            r2 = this;
            r0 = 30
            r1 = 1
            java.nio.ByteBuffer r2 = r2.__vector_as_bytebuffer(r0, r1)
            r2.getClass()
            return r2
    }

    public final org.luckypray.dexkit.schema.ClassMatcher getReturnType() {
            r1 = this;
            org.luckypray.dexkit.schema.-ClassMatcher r0 = new org.luckypray.dexkit.schema.-ClassMatcher
            r0.<init>()
            org.luckypray.dexkit.schema.-ClassMatcher r1 = r1.returnType(r0)
            return r1
    }

    public final int getUsingFieldsLength() {
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

    public final int getUsingNumbersLength() {
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

    public final java.nio.ByteBuffer getUsingNumbersTypeAsByteBuffer() {
            r2 = this;
            r0 = 22
            r1 = 1
            java.nio.ByteBuffer r2 = r2.__vector_as_bytebuffer(r0, r1)
            r2.getClass()
            return r2
    }

    public final int getUsingNumbersTypeLength() {
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

    public final int getUsingStringsLength() {
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

    public final org.luckypray.dexkit.schema.MethodsMatcher invokingMethods(org.luckypray.dexkit.schema.MethodsMatcher r3) {
            r2 = this;
            r3.getClass()
            r0 = 26
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

    public final org.luckypray.dexkit.schema.MethodsMatcher methodCallers(org.luckypray.dexkit.schema.MethodsMatcher r3) {
            r2 = this;
            r3.getClass()
            r0 = 28
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

    public final org.luckypray.dexkit.schema.StringMatcher methodName(org.luckypray.dexkit.schema.StringMatcher r3) {
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

    /* JADX INFO: renamed from: mutateUsingNumbersType-EK-6454, reason: not valid java name */
    public final boolean m7450mutateUsingNumbersTypeEK6454(int r3, byte r4) {
            r2 = this;
            r0 = 22
            int r0 = r2.__offset(r0)
            if (r0 == 0) goto L14
            java.nio.ByteBuffer r1 = r2.f8399bb
            int r2 = r2.__vector(r0)
            int r2 = r2 + r3
            r1.put(r2, r4)
            r2 = 1
            return r2
        L14:
            r2 = 0
            return r2
    }

    public final org.luckypray.dexkit.schema.MethodMatcher noneOf(int r2) {
            r1 = this;
            org.luckypray.dexkit.schema.-MethodMatcher r0 = new org.luckypray.dexkit.schema.-MethodMatcher
            r0.<init>()
            org.luckypray.dexkit.schema.-MethodMatcher r1 = r1.noneOf(r0, r2)
            return r1
    }

    public final org.luckypray.dexkit.schema.MethodMatcher noneOf(org.luckypray.dexkit.schema.MethodMatcher r2, int r3) {
            r1 = this;
            r2.getClass()
            r0 = 36
            int r0 = r1.__offset(r0)
            if (r0 == 0) goto L20
            int r0 = r1.__vector(r0)
            int r3 = r3 * 4
            int r3 = r3 + r0
            int r3 = r1.__indirect(r3)
            java.nio.ByteBuffer r1 = r1.f8399bb
            r1.getClass()
            org.luckypray.dexkit.schema.-MethodMatcher r1 = r2.__assign(r3, r1)
            return r1
        L20:
            r1 = 0
            return r1
    }

    public final org.luckypray.dexkit.schema.OpCodesMatcher opCodes(org.luckypray.dexkit.schema.OpCodesMatcher r3) {
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
            org.luckypray.dexkit.schema.-OpCodesMatcher r2 = r3.__assign(r0, r2)
            return r2
        L1c:
            r2 = 0
            return r2
    }

    public final org.luckypray.dexkit.schema.ParametersMatcher parameters(org.luckypray.dexkit.schema.ParametersMatcher r3) {
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
            org.luckypray.dexkit.schema.-ParametersMatcher r2 = r3.__assign(r0, r2)
            return r2
        L1c:
            r2 = 0
            return r2
    }

    public final java.nio.ByteBuffer protoShortyInByteBuffer(java.nio.ByteBuffer r3) {
            r2 = this;
            r3.getClass()
            r0 = 30
            r1 = 1
            java.nio.ByteBuffer r2 = r2.__vector_in_bytebuffer(r3, r0, r1)
            r2.getClass()
            return r2
    }

    public final org.luckypray.dexkit.schema.ClassMatcher returnType(org.luckypray.dexkit.schema.ClassMatcher r3) {
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

    public final org.luckypray.dexkit.schema.UsingFieldMatcher usingFields(int r2) {
            r1 = this;
            org.luckypray.dexkit.schema.-UsingFieldMatcher r0 = new org.luckypray.dexkit.schema.-UsingFieldMatcher
            r0.<init>()
            org.luckypray.dexkit.schema.-UsingFieldMatcher r1 = r1.usingFields(r0, r2)
            return r1
    }

    public final org.luckypray.dexkit.schema.UsingFieldMatcher usingFields(org.luckypray.dexkit.schema.UsingFieldMatcher r2, int r3) {
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
            org.luckypray.dexkit.schema.-UsingFieldMatcher r1 = r2.__assign(r3, r1)
            return r1
        L20:
            r1 = 0
            return r1
    }

    public final p000.p22 usingNumbers(p000.p22 r2, int r3) {
            r1 = this;
            r2.getClass()
            r0 = 24
            int r0 = r1.__offset(r0)
            if (r0 == 0) goto L17
            int r0 = r1.__vector(r0)
            int r3 = r3 * 4
            int r3 = r3 + r0
            p22 r1 = r1.__union(r2, r3)
            return r1
        L17:
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: usingNumbersType-Wa3L5BU, reason: not valid java name */
    public final byte m7451usingNumbersTypeWa3L5BU(int r3) {
            r2 = this;
            r0 = 22
            int r0 = r2.__offset(r0)
            if (r0 == 0) goto L14
            java.nio.ByteBuffer r1 = r2.f8399bb
            int r2 = r2.__vector(r0)
            int r2 = r2 + r3
            byte r2 = r1.get(r2)
            return r2
        L14:
            r2 = 0
            return r2
    }

    public final java.nio.ByteBuffer usingNumbersTypeInByteBuffer(java.nio.ByteBuffer r3) {
            r2 = this;
            r3.getClass()
            r0 = 22
            r1 = 1
            java.nio.ByteBuffer r2 = r2.__vector_in_bytebuffer(r3, r0, r1)
            r2.getClass()
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
            r0 = 18
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
