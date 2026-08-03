package com.android.dx.rop.cst;

/* JADX INFO: loaded from: classes.dex */
public final class CstType extends com.android.dx.rop.cst.TypedConstant {
    public static final com.android.dx.rop.cst.CstType BOOLEAN = null;
    public static final com.android.dx.rop.cst.CstType BOOLEAN_ARRAY = null;
    public static final com.android.dx.rop.cst.CstType BYTE = null;
    public static final com.android.dx.rop.cst.CstType BYTE_ARRAY = null;
    public static final com.android.dx.rop.cst.CstType CHARACTER = null;
    public static final com.android.dx.rop.cst.CstType CHAR_ARRAY = null;
    public static final com.android.dx.rop.cst.CstType DOUBLE = null;
    public static final com.android.dx.rop.cst.CstType DOUBLE_ARRAY = null;
    public static final com.android.dx.rop.cst.CstType FLOAT = null;
    public static final com.android.dx.rop.cst.CstType FLOAT_ARRAY = null;
    public static final com.android.dx.rop.cst.CstType INTEGER = null;
    public static final com.android.dx.rop.cst.CstType INT_ARRAY = null;
    public static final com.android.dx.rop.cst.CstType LONG = null;
    public static final com.android.dx.rop.cst.CstType LONG_ARRAY = null;
    public static final com.android.dx.rop.cst.CstType METHOD_HANDLE = null;
    public static final com.android.dx.rop.cst.CstType OBJECT = null;
    public static final com.android.dx.rop.cst.CstType SHORT = null;
    public static final com.android.dx.rop.cst.CstType SHORT_ARRAY = null;
    public static final com.android.dx.rop.cst.CstType VAR_HANDLE = null;
    public static final com.android.dx.rop.cst.CstType VOID = null;
    private static final java.util.concurrent.ConcurrentMap<com.android.dx.rop.type.Type, com.android.dx.rop.cst.CstType> interns = null;
    private com.android.dx.rop.cst.CstString descriptor;
    private final com.android.dx.rop.type.Type type;

    static {
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r1 = 1000(0x3e8, float:1.401E-42)
            r2 = 1061158912(0x3f400000, float:0.75)
            r0.<init>(r1, r2)
            com.android.dx.rop.cst.CstType.interns = r0
            com.android.dx.rop.cst.CstType r0 = new com.android.dx.rop.cst.CstType
            com.android.dx.rop.type.Type r1 = com.android.dx.rop.type.Type.OBJECT
            r0.<init>(r1)
            com.android.dx.rop.cst.CstType.OBJECT = r0
            com.android.dx.rop.cst.CstType r0 = new com.android.dx.rop.cst.CstType
            com.android.dx.rop.type.Type r1 = com.android.dx.rop.type.Type.BOOLEAN_CLASS
            r0.<init>(r1)
            com.android.dx.rop.cst.CstType.BOOLEAN = r0
            com.android.dx.rop.cst.CstType r0 = new com.android.dx.rop.cst.CstType
            com.android.dx.rop.type.Type r1 = com.android.dx.rop.type.Type.BYTE_CLASS
            r0.<init>(r1)
            com.android.dx.rop.cst.CstType.BYTE = r0
            com.android.dx.rop.cst.CstType r0 = new com.android.dx.rop.cst.CstType
            com.android.dx.rop.type.Type r1 = com.android.dx.rop.type.Type.CHARACTER_CLASS
            r0.<init>(r1)
            com.android.dx.rop.cst.CstType.CHARACTER = r0
            com.android.dx.rop.cst.CstType r0 = new com.android.dx.rop.cst.CstType
            com.android.dx.rop.type.Type r1 = com.android.dx.rop.type.Type.DOUBLE_CLASS
            r0.<init>(r1)
            com.android.dx.rop.cst.CstType.DOUBLE = r0
            com.android.dx.rop.cst.CstType r0 = new com.android.dx.rop.cst.CstType
            com.android.dx.rop.type.Type r1 = com.android.dx.rop.type.Type.FLOAT_CLASS
            r0.<init>(r1)
            com.android.dx.rop.cst.CstType.FLOAT = r0
            com.android.dx.rop.cst.CstType r0 = new com.android.dx.rop.cst.CstType
            com.android.dx.rop.type.Type r1 = com.android.dx.rop.type.Type.LONG_CLASS
            r0.<init>(r1)
            com.android.dx.rop.cst.CstType.LONG = r0
            com.android.dx.rop.cst.CstType r0 = new com.android.dx.rop.cst.CstType
            com.android.dx.rop.type.Type r1 = com.android.dx.rop.type.Type.INTEGER_CLASS
            r0.<init>(r1)
            com.android.dx.rop.cst.CstType.INTEGER = r0
            com.android.dx.rop.cst.CstType r0 = new com.android.dx.rop.cst.CstType
            com.android.dx.rop.type.Type r1 = com.android.dx.rop.type.Type.SHORT_CLASS
            r0.<init>(r1)
            com.android.dx.rop.cst.CstType.SHORT = r0
            com.android.dx.rop.cst.CstType r0 = new com.android.dx.rop.cst.CstType
            com.android.dx.rop.type.Type r1 = com.android.dx.rop.type.Type.VOID_CLASS
            r0.<init>(r1)
            com.android.dx.rop.cst.CstType.VOID = r0
            com.android.dx.rop.cst.CstType r0 = new com.android.dx.rop.cst.CstType
            com.android.dx.rop.type.Type r1 = com.android.dx.rop.type.Type.BOOLEAN_ARRAY
            r0.<init>(r1)
            com.android.dx.rop.cst.CstType.BOOLEAN_ARRAY = r0
            com.android.dx.rop.cst.CstType r0 = new com.android.dx.rop.cst.CstType
            com.android.dx.rop.type.Type r1 = com.android.dx.rop.type.Type.BYTE_ARRAY
            r0.<init>(r1)
            com.android.dx.rop.cst.CstType.BYTE_ARRAY = r0
            com.android.dx.rop.cst.CstType r0 = new com.android.dx.rop.cst.CstType
            com.android.dx.rop.type.Type r1 = com.android.dx.rop.type.Type.CHAR_ARRAY
            r0.<init>(r1)
            com.android.dx.rop.cst.CstType.CHAR_ARRAY = r0
            com.android.dx.rop.cst.CstType r0 = new com.android.dx.rop.cst.CstType
            com.android.dx.rop.type.Type r1 = com.android.dx.rop.type.Type.DOUBLE_ARRAY
            r0.<init>(r1)
            com.android.dx.rop.cst.CstType.DOUBLE_ARRAY = r0
            com.android.dx.rop.cst.CstType r0 = new com.android.dx.rop.cst.CstType
            com.android.dx.rop.type.Type r1 = com.android.dx.rop.type.Type.FLOAT_ARRAY
            r0.<init>(r1)
            com.android.dx.rop.cst.CstType.FLOAT_ARRAY = r0
            com.android.dx.rop.cst.CstType r0 = new com.android.dx.rop.cst.CstType
            com.android.dx.rop.type.Type r1 = com.android.dx.rop.type.Type.LONG_ARRAY
            r0.<init>(r1)
            com.android.dx.rop.cst.CstType.LONG_ARRAY = r0
            com.android.dx.rop.cst.CstType r0 = new com.android.dx.rop.cst.CstType
            com.android.dx.rop.type.Type r1 = com.android.dx.rop.type.Type.INT_ARRAY
            r0.<init>(r1)
            com.android.dx.rop.cst.CstType.INT_ARRAY = r0
            com.android.dx.rop.cst.CstType r0 = new com.android.dx.rop.cst.CstType
            com.android.dx.rop.type.Type r1 = com.android.dx.rop.type.Type.SHORT_ARRAY
            r0.<init>(r1)
            com.android.dx.rop.cst.CstType.SHORT_ARRAY = r0
            com.android.dx.rop.cst.CstType r0 = new com.android.dx.rop.cst.CstType
            com.android.dx.rop.type.Type r1 = com.android.dx.rop.type.Type.METHOD_HANDLE
            r0.<init>(r1)
            com.android.dx.rop.cst.CstType.METHOD_HANDLE = r0
            com.android.dx.rop.cst.CstType r0 = new com.android.dx.rop.cst.CstType
            com.android.dx.rop.type.Type r1 = com.android.dx.rop.type.Type.VAR_HANDLE
            r0.<init>(r1)
            com.android.dx.rop.cst.CstType.VAR_HANDLE = r0
            initInterns()
            return
    }

    public CstType(com.android.dx.rop.type.Type r2) {
            r1 = this;
            r1.<init>()
            if (r2 == 0) goto L17
            com.android.dx.rop.type.Type r0 = com.android.dx.rop.type.Type.KNOWN_NULL
            if (r2 == r0) goto Lf
            r1.type = r2
            r2 = 0
            r1.descriptor = r2
            return
        Lf:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "KNOWN_NULL is not representable"
            r2.<init>(r0)
            throw r2
        L17:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "type == null"
            r2.<init>(r0)
            throw r2
    }

    public static void clearInternTable() {
            java.util.concurrent.ConcurrentMap<com.android.dx.rop.type.Type, com.android.dx.rop.cst.CstType> r0 = com.android.dx.rop.cst.CstType.interns
            r0.clear()
            initInterns()
            return
    }

    public static com.android.dx.rop.cst.CstType forBoxedPrimitiveType(com.android.dx.rop.type.Type r3) {
            int r0 = r3.getBasicType()
            switch(r0) {
                case 0: goto L36;
                case 1: goto L33;
                case 2: goto L30;
                case 3: goto L2d;
                case 4: goto L2a;
                case 5: goto L27;
                case 6: goto L24;
                case 7: goto L21;
                case 8: goto L1e;
                default: goto L7;
            }
        L7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "not primitive: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L1e:
            com.android.dx.rop.cst.CstType r3 = com.android.dx.rop.cst.CstType.SHORT
            return r3
        L21:
            com.android.dx.rop.cst.CstType r3 = com.android.dx.rop.cst.CstType.LONG
            return r3
        L24:
            com.android.dx.rop.cst.CstType r3 = com.android.dx.rop.cst.CstType.INTEGER
            return r3
        L27:
            com.android.dx.rop.cst.CstType r3 = com.android.dx.rop.cst.CstType.FLOAT
            return r3
        L2a:
            com.android.dx.rop.cst.CstType r3 = com.android.dx.rop.cst.CstType.DOUBLE
            return r3
        L2d:
            com.android.dx.rop.cst.CstType r3 = com.android.dx.rop.cst.CstType.CHARACTER
            return r3
        L30:
            com.android.dx.rop.cst.CstType r3 = com.android.dx.rop.cst.CstType.BYTE
            return r3
        L33:
            com.android.dx.rop.cst.CstType r3 = com.android.dx.rop.cst.CstType.BOOLEAN
            return r3
        L36:
            com.android.dx.rop.cst.CstType r3 = com.android.dx.rop.cst.CstType.VOID
            return r3
    }

    private static void initInterns() {
            com.android.dx.rop.cst.CstType r0 = com.android.dx.rop.cst.CstType.OBJECT
            internInitial(r0)
            com.android.dx.rop.cst.CstType r0 = com.android.dx.rop.cst.CstType.BOOLEAN
            internInitial(r0)
            com.android.dx.rop.cst.CstType r0 = com.android.dx.rop.cst.CstType.BYTE
            internInitial(r0)
            com.android.dx.rop.cst.CstType r0 = com.android.dx.rop.cst.CstType.CHARACTER
            internInitial(r0)
            com.android.dx.rop.cst.CstType r0 = com.android.dx.rop.cst.CstType.DOUBLE
            internInitial(r0)
            com.android.dx.rop.cst.CstType r0 = com.android.dx.rop.cst.CstType.FLOAT
            internInitial(r0)
            com.android.dx.rop.cst.CstType r0 = com.android.dx.rop.cst.CstType.LONG
            internInitial(r0)
            com.android.dx.rop.cst.CstType r0 = com.android.dx.rop.cst.CstType.INTEGER
            internInitial(r0)
            com.android.dx.rop.cst.CstType r0 = com.android.dx.rop.cst.CstType.SHORT
            internInitial(r0)
            com.android.dx.rop.cst.CstType r0 = com.android.dx.rop.cst.CstType.VOID
            internInitial(r0)
            com.android.dx.rop.cst.CstType r0 = com.android.dx.rop.cst.CstType.BOOLEAN_ARRAY
            internInitial(r0)
            com.android.dx.rop.cst.CstType r0 = com.android.dx.rop.cst.CstType.BYTE_ARRAY
            internInitial(r0)
            com.android.dx.rop.cst.CstType r0 = com.android.dx.rop.cst.CstType.CHAR_ARRAY
            internInitial(r0)
            com.android.dx.rop.cst.CstType r0 = com.android.dx.rop.cst.CstType.DOUBLE_ARRAY
            internInitial(r0)
            com.android.dx.rop.cst.CstType r0 = com.android.dx.rop.cst.CstType.FLOAT_ARRAY
            internInitial(r0)
            com.android.dx.rop.cst.CstType r0 = com.android.dx.rop.cst.CstType.LONG_ARRAY
            internInitial(r0)
            com.android.dx.rop.cst.CstType r0 = com.android.dx.rop.cst.CstType.INT_ARRAY
            internInitial(r0)
            com.android.dx.rop.cst.CstType r0 = com.android.dx.rop.cst.CstType.SHORT_ARRAY
            internInitial(r0)
            com.android.dx.rop.cst.CstType r0 = com.android.dx.rop.cst.CstType.METHOD_HANDLE
            internInitial(r0)
            return
    }

    public static com.android.dx.rop.cst.CstType intern(com.android.dx.rop.type.Type r2) {
            com.android.dx.rop.cst.CstType r0 = new com.android.dx.rop.cst.CstType
            r0.<init>(r2)
            java.util.concurrent.ConcurrentMap<com.android.dx.rop.type.Type, com.android.dx.rop.cst.CstType> r1 = com.android.dx.rop.cst.CstType.interns
            java.lang.Object r2 = r1.putIfAbsent(r2, r0)
            com.android.dx.rop.cst.CstType r2 = (com.android.dx.rop.cst.CstType) r2
            if (r2 == 0) goto L10
            r0 = r2
        L10:
            return r0
    }

    private static void internInitial(com.android.dx.rop.cst.CstType r3) {
            java.util.concurrent.ConcurrentMap<com.android.dx.rop.type.Type, com.android.dx.rop.cst.CstType> r0 = com.android.dx.rop.cst.CstType.interns
            com.android.dx.rop.type.Type r1 = r3.getClassType()
            java.lang.Object r0 = r0.putIfAbsent(r1, r3)
            if (r0 != 0) goto Ld
            return
        Ld:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Attempted re-init of "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    @Override // com.android.dx.rop.cst.Constant
    public int compareTo0(com.android.dx.rop.cst.Constant r2) {
            r1 = this;
            com.android.dx.rop.type.Type r0 = r1.type
            java.lang.String r0 = r0.getDescriptor()
            com.android.dx.rop.cst.CstType r2 = (com.android.dx.rop.cst.CstType) r2
            com.android.dx.rop.type.Type r2 = r2.type
            java.lang.String r2 = r2.getDescriptor()
            int r2 = r0.compareTo(r2)
            return r2
    }

    public boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof com.android.dx.rop.cst.CstType
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            com.android.dx.rop.type.Type r0 = r2.type
            com.android.dx.rop.cst.CstType r3 = (com.android.dx.rop.cst.CstType) r3
            com.android.dx.rop.type.Type r3 = r3.type
            if (r0 != r3) goto Lf
            r1 = 1
        Lf:
            return r1
    }

    public com.android.dx.rop.type.Type getClassType() {
            r1 = this;
            com.android.dx.rop.type.Type r0 = r1.type
            return r0
    }

    public com.android.dx.rop.cst.CstString getDescriptor() {
            r2 = this;
            com.android.dx.rop.cst.CstString r0 = r2.descriptor
            if (r0 != 0) goto L11
            com.android.dx.rop.cst.CstString r0 = new com.android.dx.rop.cst.CstString
            com.android.dx.rop.type.Type r1 = r2.type
            java.lang.String r1 = r1.getDescriptor()
            r0.<init>(r1)
            r2.descriptor = r0
        L11:
            com.android.dx.rop.cst.CstString r0 = r2.descriptor
            return r0
    }

    public java.lang.String getPackageName() {
            r5 = this;
            com.android.dx.rop.cst.CstString r0 = r5.getDescriptor()
            java.lang.String r0 = r0.getString()
            r1 = 47
            int r2 = r0.lastIndexOf(r1)
            r3 = 91
            int r3 = r0.lastIndexOf(r3)
            r4 = -1
            if (r2 != r4) goto L1a
            java.lang.String r0 = "default"
            return r0
        L1a:
            int r3 = r3 + 2
            java.lang.String r0 = r0.substring(r3, r2)
            r2 = 46
            java.lang.String r0 = r0.replace(r1, r2)
            return r0
    }

    @Override // com.android.dx.rop.type.TypeBearer
    public com.android.dx.rop.type.Type getType() {
            r1 = this;
            com.android.dx.rop.type.Type r0 = com.android.dx.rop.type.Type.CLASS
            return r0
    }

    public int hashCode() {
            r1 = this;
            com.android.dx.rop.type.Type r0 = r1.type
            int r0 = r0.hashCode()
            return r0
    }

    @Override // com.android.dx.rop.cst.Constant
    public boolean isCategory2() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.android.dx.util.ToHuman
    public java.lang.String toHuman() {
            r1 = this;
            com.android.dx.rop.type.Type r0 = r1.type
            java.lang.String r0 = r0.toHuman()
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "type{"
            r0.append(r1)
            java.lang.String r1 = r2.toHuman()
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // com.android.dx.rop.cst.Constant
    public java.lang.String typeName() {
            r1 = this;
            java.lang.String r0 = "type"
            return r0
    }
}
