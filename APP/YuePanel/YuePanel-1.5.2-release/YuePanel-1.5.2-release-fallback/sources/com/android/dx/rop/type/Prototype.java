package com.android.dx.rop.type;

/* JADX INFO: loaded from: classes.dex */
public final class Prototype implements java.lang.Comparable<com.android.dx.rop.type.Prototype> {
    private static final java.util.concurrent.ConcurrentMap<java.lang.String, com.android.dx.rop.type.Prototype> internTable = null;
    private final java.lang.String descriptor;
    private com.android.dx.rop.type.StdTypeList parameterFrameTypes;
    private final com.android.dx.rop.type.StdTypeList parameterTypes;
    private final com.android.dx.rop.type.Type returnType;

    static {
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r1 = 10000(0x2710, float:1.4013E-41)
            r2 = 1061158912(0x3f400000, float:0.75)
            r0.<init>(r1, r2)
            com.android.dx.rop.type.Prototype.internTable = r0
            return
    }

    private Prototype(java.lang.String r1, com.android.dx.rop.type.Type r2, com.android.dx.rop.type.StdTypeList r3) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto L23
            if (r2 == 0) goto L1b
            if (r3 == 0) goto L13
            r0.descriptor = r1
            r0.returnType = r2
            r0.parameterTypes = r3
            r1 = 0
            r0.parameterFrameTypes = r1
            return
        L13:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "parameterTypes == null"
            r1.<init>(r2)
            throw r1
        L1b:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "returnType == null"
            r1.<init>(r2)
            throw r1
        L23:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "descriptor == null"
            r1.<init>(r2)
            throw r1
    }

    public static void clearInternTable() {
            java.util.concurrent.ConcurrentMap<java.lang.String, com.android.dx.rop.type.Prototype> r0 = com.android.dx.rop.type.Prototype.internTable
            r0.clear()
            return
    }

    public static com.android.dx.rop.type.Prototype fromDescriptor(java.lang.String r8) {
            java.util.concurrent.ConcurrentMap<java.lang.String, com.android.dx.rop.type.Prototype> r0 = com.android.dx.rop.type.Prototype.internTable
            java.lang.Object r0 = r0.get(r8)
            com.android.dx.rop.type.Prototype r0 = (com.android.dx.rop.type.Prototype) r0
            if (r0 == 0) goto Lb
            return r0
        Lb:
            com.android.dx.rop.type.Type[] r0 = makeParameterArray(r8)
            r1 = 0
            r2 = 1
            r4 = r1
            r3 = r2
        L13:
            char r5 = r8.charAt(r3)
            r6 = 41
            if (r5 != r6) goto L39
            int r3 = r3 + r2
            java.lang.String r2 = r8.substring(r3)
            com.android.dx.rop.type.Type r2 = com.android.dx.rop.type.Type.internReturnType(r2)
            com.android.dx.rop.type.StdTypeList r3 = new com.android.dx.rop.type.StdTypeList
            r3.<init>(r4)
        L29:
            if (r1 >= r4) goto L33
            r5 = r0[r1]
            r3.set(r1, r5)
            int r1 = r1 + 1
            goto L29
        L33:
            com.android.dx.rop.type.Prototype r0 = new com.android.dx.rop.type.Prototype
            r0.<init>(r8, r2, r3)
            return r0
        L39:
            r6 = r3
        L3a:
            r7 = 91
            if (r5 != r7) goto L45
            int r6 = r6 + 1
            char r5 = r8.charAt(r6)
            goto L3a
        L45:
            r7 = 76
            if (r5 != r7) goto L5d
            r5 = 59
            int r5 = r8.indexOf(r5, r6)
            r6 = -1
            if (r5 == r6) goto L55
            int r5 = r5 + 1
            goto L5f
        L55:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "bad descriptor"
            r8.<init>(r0)
            throw r8
        L5d:
            int r5 = r6 + 1
        L5f:
            java.lang.String r3 = r8.substring(r3, r5)
            com.android.dx.rop.type.Type r3 = com.android.dx.rop.type.Type.intern(r3)
            r0[r4] = r3
            int r4 = r4 + 1
            r3 = r5
            goto L13
    }

    public static com.android.dx.rop.type.Prototype intern(java.lang.String r1) {
            if (r1 == 0) goto L16
            java.util.concurrent.ConcurrentMap<java.lang.String, com.android.dx.rop.type.Prototype> r0 = com.android.dx.rop.type.Prototype.internTable
            java.lang.Object r0 = r0.get(r1)
            com.android.dx.rop.type.Prototype r0 = (com.android.dx.rop.type.Prototype) r0
            if (r0 == 0) goto Ld
            return r0
        Ld:
            com.android.dx.rop.type.Prototype r1 = fromDescriptor(r1)
            com.android.dx.rop.type.Prototype r1 = putIntern(r1)
            return r1
        L16:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r0 = "descriptor == null"
            r1.<init>(r0)
            throw r1
    }

    public static com.android.dx.rop.type.Prototype intern(java.lang.String r0, com.android.dx.rop.type.Type r1, boolean r2, boolean r3) {
            com.android.dx.rop.type.Prototype r0 = intern(r0)
            if (r2 == 0) goto L7
            return r0
        L7:
            if (r3 == 0) goto L10
            r2 = 2147483647(0x7fffffff, float:NaN)
            com.android.dx.rop.type.Type r1 = r1.asUninitialized(r2)
        L10:
            com.android.dx.rop.type.Prototype r0 = r0.withFirstParameter(r1)
            return r0
    }

    public static com.android.dx.rop.type.Prototype internInts(com.android.dx.rop.type.Type r3, int r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 100
            r0.<init>(r1)
            r1 = 40
            r0.append(r1)
            r1 = 0
        Ld:
            if (r1 >= r4) goto L17
            r2 = 73
            r0.append(r2)
            int r1 = r1 + 1
            goto Ld
        L17:
            r4 = 41
            r0.append(r4)
            java.lang.String r3 = r3.getDescriptor()
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            com.android.dx.rop.type.Prototype r3 = intern(r3)
            return r3
    }

    private static com.android.dx.rop.type.Type[] makeParameterArray(java.lang.String r8) {
            int r0 = r8.length()
            r1 = 0
            char r2 = r8.charAt(r1)
            r3 = 40
            java.lang.String r4 = "bad descriptor"
            if (r2 != r3) goto L47
            r2 = 1
            r5 = r1
            r3 = r2
        L12:
            r6 = 41
            if (r3 >= r0) goto L2b
            char r7 = r8.charAt(r3)
            if (r7 != r6) goto L1e
            r1 = r3
            goto L2b
        L1e:
            r6 = 65
            if (r7 < r6) goto L28
            r6 = 90
            if (r7 > r6) goto L28
            int r5 = r5 + 1
        L28:
            int r3 = r3 + 1
            goto L12
        L2b:
            if (r1 == 0) goto L41
            int r0 = r0 - r2
            if (r1 == r0) goto L41
            int r1 = r1 + r2
            int r8 = r8.indexOf(r6, r1)
            r0 = -1
            if (r8 != r0) goto L3b
            com.android.dx.rop.type.Type[] r8 = new com.android.dx.rop.type.Type[r5]
            return r8
        L3b:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>(r4)
            throw r8
        L41:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>(r4)
            throw r8
        L47:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>(r4)
            throw r8
    }

    private static com.android.dx.rop.type.Prototype putIntern(com.android.dx.rop.type.Prototype r2) {
            java.util.concurrent.ConcurrentMap<java.lang.String, com.android.dx.rop.type.Prototype> r0 = com.android.dx.rop.type.Prototype.internTable
            java.lang.String r1 = r2.getDescriptor()
            java.lang.Object r0 = r0.putIfAbsent(r1, r2)
            com.android.dx.rop.type.Prototype r0 = (com.android.dx.rop.type.Prototype) r0
            if (r0 == 0) goto Lf
            r2 = r0
        Lf:
            return r2
    }

    /* JADX INFO: renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(com.android.dx.rop.type.Prototype r8) {
            r7 = this;
            r0 = 0
            if (r7 != r8) goto L4
            return r0
        L4:
            com.android.dx.rop.type.Type r1 = r7.returnType
            com.android.dx.rop.type.Type r2 = r8.returnType
            int r1 = r1.compareTo2(r2)
            if (r1 == 0) goto Lf
            return r1
        Lf:
            com.android.dx.rop.type.StdTypeList r1 = r7.parameterTypes
            int r1 = r1.size()
            com.android.dx.rop.type.StdTypeList r2 = r8.parameterTypes
            int r2 = r2.size()
            int r3 = java.lang.Math.min(r1, r2)
            r4 = r0
        L20:
            if (r4 >= r3) goto L38
            com.android.dx.rop.type.StdTypeList r5 = r7.parameterTypes
            com.android.dx.rop.type.Type r5 = r5.get(r4)
            com.android.dx.rop.type.StdTypeList r6 = r8.parameterTypes
            com.android.dx.rop.type.Type r6 = r6.get(r4)
            int r5 = r5.compareTo2(r6)
            if (r5 == 0) goto L35
            return r5
        L35:
            int r4 = r4 + 1
            goto L20
        L38:
            if (r1 >= r2) goto L3c
            r8 = -1
            return r8
        L3c:
            if (r1 <= r2) goto L40
            r8 = 1
            return r8
        L40:
            return r0
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(com.android.dx.rop.type.Prototype r1) {
            r0 = this;
            com.android.dx.rop.type.Prototype r1 = (com.android.dx.rop.type.Prototype) r1
            int r1 = r0.compareTo2(r1)
            return r1
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof com.android.dx.rop.type.Prototype
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            java.lang.String r0 = r1.descriptor
            com.android.dx.rop.type.Prototype r2 = (com.android.dx.rop.type.Prototype) r2
            java.lang.String r2 = r2.descriptor
            boolean r2 = r0.equals(r2)
            return r2
    }

    public java.lang.String getDescriptor() {
            r1 = this;
            java.lang.String r0 = r1.descriptor
            return r0
    }

    public com.android.dx.rop.type.StdTypeList getParameterFrameTypes() {
            r6 = this;
            com.android.dx.rop.type.StdTypeList r0 = r6.parameterFrameTypes
            if (r0 != 0) goto L2f
            com.android.dx.rop.type.StdTypeList r0 = r6.parameterTypes
            int r0 = r0.size()
            com.android.dx.rop.type.StdTypeList r1 = new com.android.dx.rop.type.StdTypeList
            r1.<init>(r0)
            r2 = 0
            r3 = r2
        L11:
            if (r2 >= r0) goto L28
            com.android.dx.rop.type.StdTypeList r4 = r6.parameterTypes
            com.android.dx.rop.type.Type r4 = r4.get(r2)
            boolean r5 = r4.isIntlike()
            if (r5 == 0) goto L22
            com.android.dx.rop.type.Type r4 = com.android.dx.rop.type.Type.INT
            r3 = 1
        L22:
            r1.set(r2, r4)
            int r2 = r2 + 1
            goto L11
        L28:
            if (r3 == 0) goto L2b
            goto L2d
        L2b:
            com.android.dx.rop.type.StdTypeList r1 = r6.parameterTypes
        L2d:
            r6.parameterFrameTypes = r1
        L2f:
            com.android.dx.rop.type.StdTypeList r0 = r6.parameterFrameTypes
            return r0
    }

    public com.android.dx.rop.type.StdTypeList getParameterTypes() {
            r1 = this;
            com.android.dx.rop.type.StdTypeList r0 = r1.parameterTypes
            return r0
    }

    public com.android.dx.rop.type.Type getReturnType() {
            r1 = this;
            com.android.dx.rop.type.Type r0 = r1.returnType
            return r0
    }

    public int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.descriptor
            int r0 = r0.hashCode()
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.descriptor
            return r0
    }

    public com.android.dx.rop.type.Prototype withFirstParameter(com.android.dx.rop.type.Type r4) {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "("
            r0.append(r1)
            java.lang.String r1 = r4.getDescriptor()
            r0.append(r1)
            java.lang.String r1 = r3.descriptor
            r2 = 1
            java.lang.String r1 = r1.substring(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.android.dx.rop.type.StdTypeList r1 = r3.parameterTypes
            com.android.dx.rop.type.StdTypeList r4 = r1.withFirst(r4)
            r4.setImmutable()
            com.android.dx.rop.type.Prototype r1 = new com.android.dx.rop.type.Prototype
            com.android.dx.rop.type.Type r2 = r3.returnType
            r1.<init>(r0, r2, r4)
            com.android.dx.rop.type.Prototype r4 = putIntern(r1)
            return r4
    }
}
