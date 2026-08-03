package com.android.dx.rop.type;

/* JADX INFO: loaded from: classes.dex */
public final class Type implements com.android.dx.rop.type.TypeBearer, java.lang.Comparable<com.android.dx.rop.type.Type> {
    public static final com.android.dx.rop.type.Type ANNOTATION = null;
    public static final com.android.dx.rop.type.Type BOOLEAN = null;
    public static final com.android.dx.rop.type.Type BOOLEAN_ARRAY = null;
    public static final com.android.dx.rop.type.Type BOOLEAN_CLASS = null;
    public static final int BT_ADDR = 10;
    public static final int BT_BOOLEAN = 1;
    public static final int BT_BYTE = 2;
    public static final int BT_CHAR = 3;
    public static final int BT_COUNT = 11;
    public static final int BT_DOUBLE = 4;
    public static final int BT_FLOAT = 5;
    public static final int BT_INT = 6;
    public static final int BT_LONG = 7;
    public static final int BT_OBJECT = 9;
    public static final int BT_SHORT = 8;
    public static final int BT_VOID = 0;
    public static final com.android.dx.rop.type.Type BYTE = null;
    public static final com.android.dx.rop.type.Type BYTE_ARRAY = null;
    public static final com.android.dx.rop.type.Type BYTE_CLASS = null;
    public static final com.android.dx.rop.type.Type CHAR = null;
    public static final com.android.dx.rop.type.Type CHARACTER_CLASS = null;
    public static final com.android.dx.rop.type.Type CHAR_ARRAY = null;
    public static final com.android.dx.rop.type.Type CLASS = null;
    public static final com.android.dx.rop.type.Type CLONEABLE = null;
    public static final com.android.dx.rop.type.Type DOUBLE = null;
    public static final com.android.dx.rop.type.Type DOUBLE_ARRAY = null;
    public static final com.android.dx.rop.type.Type DOUBLE_CLASS = null;
    public static final com.android.dx.rop.type.Type FLOAT = null;
    public static final com.android.dx.rop.type.Type FLOAT_ARRAY = null;
    public static final com.android.dx.rop.type.Type FLOAT_CLASS = null;
    public static final com.android.dx.rop.type.Type INT = null;
    public static final com.android.dx.rop.type.Type INTEGER_CLASS = null;
    public static final com.android.dx.rop.type.Type INT_ARRAY = null;
    public static final com.android.dx.rop.type.Type KNOWN_NULL = null;
    public static final com.android.dx.rop.type.Type LONG = null;
    public static final com.android.dx.rop.type.Type LONG_ARRAY = null;
    public static final com.android.dx.rop.type.Type LONG_CLASS = null;
    public static final com.android.dx.rop.type.Type METHOD_HANDLE = null;
    public static final com.android.dx.rop.type.Type METHOD_TYPE = null;
    public static final com.android.dx.rop.type.Type OBJECT = null;
    public static final com.android.dx.rop.type.Type OBJECT_ARRAY = null;
    public static final com.android.dx.rop.type.Type RETURN_ADDRESS = null;
    public static final com.android.dx.rop.type.Type SERIALIZABLE = null;
    public static final com.android.dx.rop.type.Type SHORT = null;
    public static final com.android.dx.rop.type.Type SHORT_ARRAY = null;
    public static final com.android.dx.rop.type.Type SHORT_CLASS = null;
    public static final com.android.dx.rop.type.Type STRING = null;
    public static final com.android.dx.rop.type.Type THROWABLE = null;
    public static final com.android.dx.rop.type.Type VAR_HANDLE = null;
    public static final com.android.dx.rop.type.Type VOID = null;
    public static final com.android.dx.rop.type.Type VOID_CLASS = null;
    private static final java.util.concurrent.ConcurrentMap<java.lang.String, com.android.dx.rop.type.Type> internTable = null;
    private com.android.dx.rop.type.Type arrayType;
    private final int basicType;
    private java.lang.String className;
    private com.android.dx.rop.type.Type componentType;
    private final java.lang.String descriptor;
    private com.android.dx.rop.type.Type initializedType;
    private final int newAt;

    static {
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r1 = 10000(0x2710, float:1.4013E-41)
            r2 = 1061158912(0x3f400000, float:0.75)
            r0.<init>(r1, r2)
            com.android.dx.rop.type.Type.internTable = r0
            com.android.dx.rop.type.Type r0 = new com.android.dx.rop.type.Type
            java.lang.String r1 = "Z"
            r2 = 1
            r0.<init>(r1, r2)
            com.android.dx.rop.type.Type.BOOLEAN = r0
            com.android.dx.rop.type.Type r1 = new com.android.dx.rop.type.Type
            java.lang.String r2 = "B"
            r3 = 2
            r1.<init>(r2, r3)
            com.android.dx.rop.type.Type.BYTE = r1
            com.android.dx.rop.type.Type r2 = new com.android.dx.rop.type.Type
            java.lang.String r3 = "C"
            r4 = 3
            r2.<init>(r3, r4)
            com.android.dx.rop.type.Type.CHAR = r2
            com.android.dx.rop.type.Type r3 = new com.android.dx.rop.type.Type
            java.lang.String r4 = "D"
            r5 = 4
            r3.<init>(r4, r5)
            com.android.dx.rop.type.Type.DOUBLE = r3
            com.android.dx.rop.type.Type r4 = new com.android.dx.rop.type.Type
            java.lang.String r5 = "F"
            r6 = 5
            r4.<init>(r5, r6)
            com.android.dx.rop.type.Type.FLOAT = r4
            com.android.dx.rop.type.Type r5 = new com.android.dx.rop.type.Type
            java.lang.String r6 = "I"
            r7 = 6
            r5.<init>(r6, r7)
            com.android.dx.rop.type.Type.INT = r5
            com.android.dx.rop.type.Type r6 = new com.android.dx.rop.type.Type
            java.lang.String r7 = "J"
            r8 = 7
            r6.<init>(r7, r8)
            com.android.dx.rop.type.Type.LONG = r6
            com.android.dx.rop.type.Type r7 = new com.android.dx.rop.type.Type
            java.lang.String r8 = "S"
            r9 = 8
            r7.<init>(r8, r9)
            com.android.dx.rop.type.Type.SHORT = r7
            com.android.dx.rop.type.Type r8 = new com.android.dx.rop.type.Type
            java.lang.String r9 = "V"
            r10 = 0
            r8.<init>(r9, r10)
            com.android.dx.rop.type.Type.VOID = r8
            com.android.dx.rop.type.Type r8 = new com.android.dx.rop.type.Type
            java.lang.String r9 = "<null>"
            r10 = 9
            r8.<init>(r9, r10)
            com.android.dx.rop.type.Type.KNOWN_NULL = r8
            com.android.dx.rop.type.Type r8 = new com.android.dx.rop.type.Type
            java.lang.String r9 = "<addr>"
            r11 = 10
            r8.<init>(r9, r11)
            com.android.dx.rop.type.Type.RETURN_ADDRESS = r8
            com.android.dx.rop.type.Type r8 = new com.android.dx.rop.type.Type
            java.lang.String r9 = "Ljava/lang/annotation/Annotation;"
            r8.<init>(r9, r10)
            com.android.dx.rop.type.Type.ANNOTATION = r8
            com.android.dx.rop.type.Type r8 = new com.android.dx.rop.type.Type
            java.lang.String r9 = "Ljava/lang/Class;"
            r8.<init>(r9, r10)
            com.android.dx.rop.type.Type.CLASS = r8
            com.android.dx.rop.type.Type r8 = new com.android.dx.rop.type.Type
            java.lang.String r9 = "Ljava/lang/Cloneable;"
            r8.<init>(r9, r10)
            com.android.dx.rop.type.Type.CLONEABLE = r8
            com.android.dx.rop.type.Type r8 = new com.android.dx.rop.type.Type
            java.lang.String r9 = "Ljava/lang/invoke/MethodHandle;"
            r8.<init>(r9, r10)
            com.android.dx.rop.type.Type.METHOD_HANDLE = r8
            com.android.dx.rop.type.Type r8 = new com.android.dx.rop.type.Type
            java.lang.String r9 = "Ljava/lang/invoke/MethodType;"
            r8.<init>(r9, r10)
            com.android.dx.rop.type.Type.METHOD_TYPE = r8
            com.android.dx.rop.type.Type r8 = new com.android.dx.rop.type.Type
            java.lang.String r9 = "Ljava/lang/invoke/VarHandle;"
            r8.<init>(r9, r10)
            com.android.dx.rop.type.Type.VAR_HANDLE = r8
            com.android.dx.rop.type.Type r8 = new com.android.dx.rop.type.Type
            java.lang.String r9 = "Ljava/lang/Object;"
            r8.<init>(r9, r10)
            com.android.dx.rop.type.Type.OBJECT = r8
            com.android.dx.rop.type.Type r9 = new com.android.dx.rop.type.Type
            java.lang.String r11 = "Ljava/io/Serializable;"
            r9.<init>(r11, r10)
            com.android.dx.rop.type.Type.SERIALIZABLE = r9
            com.android.dx.rop.type.Type r9 = new com.android.dx.rop.type.Type
            java.lang.String r11 = "Ljava/lang/String;"
            r9.<init>(r11, r10)
            com.android.dx.rop.type.Type.STRING = r9
            com.android.dx.rop.type.Type r9 = new com.android.dx.rop.type.Type
            java.lang.String r11 = "Ljava/lang/Throwable;"
            r9.<init>(r11, r10)
            com.android.dx.rop.type.Type.THROWABLE = r9
            com.android.dx.rop.type.Type r9 = new com.android.dx.rop.type.Type
            java.lang.String r11 = "Ljava/lang/Boolean;"
            r9.<init>(r11, r10)
            com.android.dx.rop.type.Type.BOOLEAN_CLASS = r9
            com.android.dx.rop.type.Type r9 = new com.android.dx.rop.type.Type
            java.lang.String r11 = "Ljava/lang/Byte;"
            r9.<init>(r11, r10)
            com.android.dx.rop.type.Type.BYTE_CLASS = r9
            com.android.dx.rop.type.Type r9 = new com.android.dx.rop.type.Type
            java.lang.String r11 = "Ljava/lang/Character;"
            r9.<init>(r11, r10)
            com.android.dx.rop.type.Type.CHARACTER_CLASS = r9
            com.android.dx.rop.type.Type r9 = new com.android.dx.rop.type.Type
            java.lang.String r11 = "Ljava/lang/Double;"
            r9.<init>(r11, r10)
            com.android.dx.rop.type.Type.DOUBLE_CLASS = r9
            com.android.dx.rop.type.Type r9 = new com.android.dx.rop.type.Type
            java.lang.String r11 = "Ljava/lang/Float;"
            r9.<init>(r11, r10)
            com.android.dx.rop.type.Type.FLOAT_CLASS = r9
            com.android.dx.rop.type.Type r9 = new com.android.dx.rop.type.Type
            java.lang.String r11 = "Ljava/lang/Integer;"
            r9.<init>(r11, r10)
            com.android.dx.rop.type.Type.INTEGER_CLASS = r9
            com.android.dx.rop.type.Type r9 = new com.android.dx.rop.type.Type
            java.lang.String r11 = "Ljava/lang/Long;"
            r9.<init>(r11, r10)
            com.android.dx.rop.type.Type.LONG_CLASS = r9
            com.android.dx.rop.type.Type r9 = new com.android.dx.rop.type.Type
            java.lang.String r11 = "Ljava/lang/Short;"
            r9.<init>(r11, r10)
            com.android.dx.rop.type.Type.SHORT_CLASS = r9
            com.android.dx.rop.type.Type r9 = new com.android.dx.rop.type.Type
            java.lang.String r11 = "Ljava/lang/Void;"
            r9.<init>(r11, r10)
            com.android.dx.rop.type.Type.VOID_CLASS = r9
            com.android.dx.rop.type.Type r9 = new com.android.dx.rop.type.Type
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "["
            r11.append(r12)
            java.lang.String r0 = r0.descriptor
            r11.append(r0)
            java.lang.String r0 = r11.toString()
            r9.<init>(r0, r10)
            com.android.dx.rop.type.Type.BOOLEAN_ARRAY = r9
            com.android.dx.rop.type.Type r0 = new com.android.dx.rop.type.Type
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r12)
            java.lang.String r1 = r1.descriptor
            r9.append(r1)
            java.lang.String r1 = r9.toString()
            r0.<init>(r1, r10)
            com.android.dx.rop.type.Type.BYTE_ARRAY = r0
            com.android.dx.rop.type.Type r0 = new com.android.dx.rop.type.Type
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r12)
            java.lang.String r2 = r2.descriptor
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1, r10)
            com.android.dx.rop.type.Type.CHAR_ARRAY = r0
            com.android.dx.rop.type.Type r0 = new com.android.dx.rop.type.Type
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r12)
            java.lang.String r2 = r3.descriptor
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1, r10)
            com.android.dx.rop.type.Type.DOUBLE_ARRAY = r0
            com.android.dx.rop.type.Type r0 = new com.android.dx.rop.type.Type
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r12)
            java.lang.String r2 = r4.descriptor
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1, r10)
            com.android.dx.rop.type.Type.FLOAT_ARRAY = r0
            com.android.dx.rop.type.Type r0 = new com.android.dx.rop.type.Type
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r12)
            java.lang.String r2 = r5.descriptor
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1, r10)
            com.android.dx.rop.type.Type.INT_ARRAY = r0
            com.android.dx.rop.type.Type r0 = new com.android.dx.rop.type.Type
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r12)
            java.lang.String r2 = r6.descriptor
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1, r10)
            com.android.dx.rop.type.Type.LONG_ARRAY = r0
            com.android.dx.rop.type.Type r0 = new com.android.dx.rop.type.Type
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r12)
            java.lang.String r2 = r8.descriptor
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1, r10)
            com.android.dx.rop.type.Type.OBJECT_ARRAY = r0
            com.android.dx.rop.type.Type r0 = new com.android.dx.rop.type.Type
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r12)
            java.lang.String r2 = r7.descriptor
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1, r10)
            com.android.dx.rop.type.Type.SHORT_ARRAY = r0
            initInterns()
            return
    }

    private Type(java.lang.String r2, int r3) {
            r1 = this;
            r0 = -1
            r1.<init>(r2, r3, r0)
            return
    }

    private Type(java.lang.String r2, int r3, int r4) {
            r1 = this;
            r1.<init>()
            if (r2 == 0) goto L2c
            if (r3 < 0) goto L24
            r0 = 11
            if (r3 >= r0) goto L24
            r0 = -1
            if (r4 < r0) goto L1c
            r1.descriptor = r2
            r1.basicType = r3
            r1.newAt = r4
            r2 = 0
            r1.arrayType = r2
            r1.componentType = r2
            r1.initializedType = r2
            return
        L1c:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "newAt < -1"
            r2.<init>(r3)
            throw r2
        L24:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "bad basicType"
            r2.<init>(r3)
            throw r2
        L2c:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "descriptor == null"
            r2.<init>(r3)
            throw r2
    }

    public static void clearInternTable() {
            java.util.concurrent.ConcurrentMap<java.lang.String, com.android.dx.rop.type.Type> r0 = com.android.dx.rop.type.Type.internTable
            r0.clear()
            initInterns()
            return
    }

    private static void initInterns() {
            com.android.dx.rop.type.Type r0 = com.android.dx.rop.type.Type.BOOLEAN
            putIntern(r0)
            com.android.dx.rop.type.Type r0 = com.android.dx.rop.type.Type.BYTE
            putIntern(r0)
            com.android.dx.rop.type.Type r0 = com.android.dx.rop.type.Type.CHAR
            putIntern(r0)
            com.android.dx.rop.type.Type r0 = com.android.dx.rop.type.Type.DOUBLE
            putIntern(r0)
            com.android.dx.rop.type.Type r0 = com.android.dx.rop.type.Type.FLOAT
            putIntern(r0)
            com.android.dx.rop.type.Type r0 = com.android.dx.rop.type.Type.INT
            putIntern(r0)
            com.android.dx.rop.type.Type r0 = com.android.dx.rop.type.Type.LONG
            putIntern(r0)
            com.android.dx.rop.type.Type r0 = com.android.dx.rop.type.Type.SHORT
            putIntern(r0)
            com.android.dx.rop.type.Type r0 = com.android.dx.rop.type.Type.ANNOTATION
            putIntern(r0)
            com.android.dx.rop.type.Type r0 = com.android.dx.rop.type.Type.CLASS
            putIntern(r0)
            com.android.dx.rop.type.Type r0 = com.android.dx.rop.type.Type.CLONEABLE
            putIntern(r0)
            com.android.dx.rop.type.Type r0 = com.android.dx.rop.type.Type.METHOD_HANDLE
            putIntern(r0)
            com.android.dx.rop.type.Type r0 = com.android.dx.rop.type.Type.VAR_HANDLE
            putIntern(r0)
            com.android.dx.rop.type.Type r0 = com.android.dx.rop.type.Type.OBJECT
            putIntern(r0)
            com.android.dx.rop.type.Type r0 = com.android.dx.rop.type.Type.SERIALIZABLE
            putIntern(r0)
            com.android.dx.rop.type.Type r0 = com.android.dx.rop.type.Type.STRING
            putIntern(r0)
            com.android.dx.rop.type.Type r0 = com.android.dx.rop.type.Type.THROWABLE
            putIntern(r0)
            com.android.dx.rop.type.Type r0 = com.android.dx.rop.type.Type.BOOLEAN_CLASS
            putIntern(r0)
            com.android.dx.rop.type.Type r0 = com.android.dx.rop.type.Type.BYTE_CLASS
            putIntern(r0)
            com.android.dx.rop.type.Type r0 = com.android.dx.rop.type.Type.CHARACTER_CLASS
            putIntern(r0)
            com.android.dx.rop.type.Type r0 = com.android.dx.rop.type.Type.DOUBLE_CLASS
            putIntern(r0)
            com.android.dx.rop.type.Type r0 = com.android.dx.rop.type.Type.FLOAT_CLASS
            putIntern(r0)
            com.android.dx.rop.type.Type r0 = com.android.dx.rop.type.Type.INTEGER_CLASS
            putIntern(r0)
            com.android.dx.rop.type.Type r0 = com.android.dx.rop.type.Type.LONG_CLASS
            putIntern(r0)
            com.android.dx.rop.type.Type r0 = com.android.dx.rop.type.Type.SHORT_CLASS
            putIntern(r0)
            com.android.dx.rop.type.Type r0 = com.android.dx.rop.type.Type.VOID_CLASS
            putIntern(r0)
            com.android.dx.rop.type.Type r0 = com.android.dx.rop.type.Type.BOOLEAN_ARRAY
            putIntern(r0)
            com.android.dx.rop.type.Type r0 = com.android.dx.rop.type.Type.BYTE_ARRAY
            putIntern(r0)
            com.android.dx.rop.type.Type r0 = com.android.dx.rop.type.Type.CHAR_ARRAY
            putIntern(r0)
            com.android.dx.rop.type.Type r0 = com.android.dx.rop.type.Type.DOUBLE_ARRAY
            putIntern(r0)
            com.android.dx.rop.type.Type r0 = com.android.dx.rop.type.Type.FLOAT_ARRAY
            putIntern(r0)
            com.android.dx.rop.type.Type r0 = com.android.dx.rop.type.Type.INT_ARRAY
            putIntern(r0)
            com.android.dx.rop.type.Type r0 = com.android.dx.rop.type.Type.LONG_ARRAY
            putIntern(r0)
            com.android.dx.rop.type.Type r0 = com.android.dx.rop.type.Type.OBJECT_ARRAY
            putIntern(r0)
            com.android.dx.rop.type.Type r0 = com.android.dx.rop.type.Type.SHORT_ARRAY
            putIntern(r0)
            return
    }

    public static com.android.dx.rop.type.Type intern(java.lang.String r8) {
            java.util.concurrent.ConcurrentMap<java.lang.String, com.android.dx.rop.type.Type> r0 = com.android.dx.rop.type.Type.internTable
            java.lang.Object r0 = r0.get(r8)
            com.android.dx.rop.type.Type r0 = (com.android.dx.rop.type.Type) r0
            if (r0 == 0) goto Lb
            return r0
        Lb:
            r0 = 0
            char r0 = r8.charAt(r0)     // Catch: java.lang.NullPointerException -> Lab java.lang.IndexOutOfBoundsException -> Lb3
            r1 = 91
            r2 = 1
            if (r0 != r1) goto L22
            java.lang.String r8 = r8.substring(r2)
            com.android.dx.rop.type.Type r8 = intern(r8)
            com.android.dx.rop.type.Type r8 = r8.getArrayType()
            return r8
        L22:
            int r3 = r8.length()
            r4 = 76
            java.lang.String r5 = "bad descriptor: "
            if (r0 != r4) goto L96
            int r3 = r3 - r2
            char r0 = r8.charAt(r3)
            r4 = 59
            if (r0 != r4) goto L96
            r0 = r2
        L36:
            if (r0 >= r3) goto L8a
            char r6 = r8.charAt(r0)
            r7 = 40
            if (r6 == r7) goto L75
            r7 = 41
            if (r6 == r7) goto L75
            r7 = 46
            if (r6 == r7) goto L75
            r7 = 47
            if (r6 == r7) goto L51
            if (r6 == r4) goto L75
            if (r6 == r1) goto L75
            goto L5d
        L51:
            if (r0 == r2) goto L60
            if (r0 == r3) goto L60
            int r6 = r0 + (-1)
            char r6 = r8.charAt(r6)
            if (r6 == r7) goto L60
        L5d:
            int r0 = r0 + 1
            goto L36
        L60:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r5)
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            r0.<init>(r8)
            throw r0
        L75:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r5)
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            r0.<init>(r8)
            throw r0
        L8a:
            com.android.dx.rop.type.Type r0 = new com.android.dx.rop.type.Type
            r1 = 9
            r0.<init>(r8, r1)
            com.android.dx.rop.type.Type r8 = putIntern(r0)
            return r8
        L96:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r5)
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            r0.<init>(r8)
            throw r0
        Lab:
            java.lang.NullPointerException r8 = new java.lang.NullPointerException
            java.lang.String r0 = "descriptor == null"
            r8.<init>(r0)
            throw r8
        Lb3:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "descriptor is empty"
            r8.<init>(r0)
            throw r8
    }

    public static com.android.dx.rop.type.Type internClassName(java.lang.String r2) {
            if (r2 == 0) goto L2a
            java.lang.String r0 = "["
            boolean r0 = r2.startsWith(r0)
            if (r0 == 0) goto Lf
            com.android.dx.rop.type.Type r2 = intern(r2)
            return r2
        Lf:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 76
            r0.append(r1)
            r0.append(r2)
            r2 = 59
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            com.android.dx.rop.type.Type r2 = intern(r2)
            return r2
        L2a:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "name == null"
            r2.<init>(r0)
            throw r2
    }

    public static com.android.dx.rop.type.Type internReturnType(java.lang.String r1) {
            java.lang.String r0 = "V"
            boolean r0 = r1.equals(r0)     // Catch: java.lang.NullPointerException -> L10
            if (r0 == 0) goto Lb
            com.android.dx.rop.type.Type r1 = com.android.dx.rop.type.Type.VOID     // Catch: java.lang.NullPointerException -> L10
            return r1
        Lb:
            com.android.dx.rop.type.Type r1 = intern(r1)
            return r1
        L10:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r0 = "descriptor == null"
            r1.<init>(r0)
            throw r1
    }

    private static com.android.dx.rop.type.Type putIntern(com.android.dx.rop.type.Type r2) {
            java.util.concurrent.ConcurrentMap<java.lang.String, com.android.dx.rop.type.Type> r0 = com.android.dx.rop.type.Type.internTable
            java.lang.String r1 = r2.getDescriptor()
            java.lang.Object r0 = r0.putIfAbsent(r1, r2)
            com.android.dx.rop.type.Type r0 = (com.android.dx.rop.type.Type) r0
            if (r0 == 0) goto Lf
            r2 = r0
        Lf:
            return r2
    }

    public com.android.dx.rop.type.Type asUninitialized(int r4) {
            r3 = this;
            if (r4 < 0) goto L68
            boolean r0 = r3.isReference()
            if (r0 == 0) goto L4f
            boolean r0 = r3.isUninitialized()
            if (r0 != 0) goto L36
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 78
            r0.append(r1)
            java.lang.String r1 = com.android.dx.util.Hex.u2(r4)
            r0.append(r1)
            java.lang.String r1 = r3.descriptor
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.android.dx.rop.type.Type r1 = new com.android.dx.rop.type.Type
            r2 = 9
            r1.<init>(r0, r2, r4)
            r1.initializedType = r3
            com.android.dx.rop.type.Type r4 = putIntern(r1)
            return r4
        L36:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "already uninitialized: "
            r0.append(r1)
            java.lang.String r1 = r3.descriptor
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            throw r4
        L4f:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "not a reference type: "
            r0.append(r1)
            java.lang.String r1 = r3.descriptor
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            throw r4
        L68:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "newAt < 0"
            r4.<init>(r0)
            throw r4
    }

    /* JADX INFO: renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(com.android.dx.rop.type.Type r2) {
            r1 = this;
            java.lang.String r0 = r1.descriptor
            java.lang.String r2 = r2.descriptor
            int r2 = r0.compareTo(r2)
            return r2
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(com.android.dx.rop.type.Type r1) {
            r0 = this;
            com.android.dx.rop.type.Type r1 = (com.android.dx.rop.type.Type) r1
            int r1 = r0.compareTo2(r1)
            return r1
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof com.android.dx.rop.type.Type
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            java.lang.String r0 = r1.descriptor
            com.android.dx.rop.type.Type r2 = (com.android.dx.rop.type.Type) r2
            java.lang.String r2 = r2.descriptor
            boolean r2 = r0.equals(r2)
            return r2
    }

    public com.android.dx.rop.type.Type getArrayType() {
            r3 = this;
            com.android.dx.rop.type.Type r0 = r3.arrayType
            if (r0 != 0) goto L24
            com.android.dx.rop.type.Type r0 = new com.android.dx.rop.type.Type
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 91
            r1.append(r2)
            java.lang.String r2 = r3.descriptor
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = 9
            r0.<init>(r1, r2)
            com.android.dx.rop.type.Type r0 = putIntern(r0)
            r3.arrayType = r0
        L24:
            com.android.dx.rop.type.Type r0 = r3.arrayType
            return r0
    }

    @Override // com.android.dx.rop.type.TypeBearer
    public int getBasicFrameType() {
            r3 = this;
            int r0 = r3.basicType
            r1 = 1
            r2 = 6
            if (r0 == r1) goto L13
            r1 = 2
            if (r0 == r1) goto L13
            r1 = 3
            if (r0 == r1) goto L13
            if (r0 == r2) goto L13
            r1 = 8
            if (r0 == r1) goto L13
            return r0
        L13:
            return r2
    }

    @Override // com.android.dx.rop.type.TypeBearer
    public int getBasicType() {
            r1 = this;
            int r0 = r1.basicType
            return r0
    }

    public int getCategory() {
            r2 = this;
            int r0 = r2.basicType
            r1 = 4
            if (r0 == r1) goto La
            r1 = 7
            if (r0 == r1) goto La
            r0 = 1
            return r0
        La:
            r0 = 2
            return r0
    }

    public java.lang.String getClassName() {
            r3 = this;
            java.lang.String r0 = r3.className
            if (r0 != 0) goto L42
            boolean r0 = r3.isReference()
            if (r0 == 0) goto L29
            java.lang.String r0 = r3.descriptor
            r1 = 0
            char r0 = r0.charAt(r1)
            r1 = 91
            if (r0 != r1) goto L1a
            java.lang.String r0 = r3.descriptor
            r3.className = r0
            goto L42
        L1a:
            java.lang.String r0 = r3.descriptor
            int r1 = r0.length()
            r2 = 1
            int r1 = r1 - r2
            java.lang.String r0 = r0.substring(r2, r1)
            r3.className = r0
            goto L42
        L29:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "not an object type: "
            r1.append(r2)
            java.lang.String r2 = r3.descriptor
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L42:
            java.lang.String r0 = r3.className
            return r0
    }

    public com.android.dx.rop.type.Type getComponentType() {
            r3 = this;
            com.android.dx.rop.type.Type r0 = r3.componentType
            if (r0 != 0) goto L36
            java.lang.String r0 = r3.descriptor
            r1 = 0
            char r0 = r0.charAt(r1)
            r1 = 91
            if (r0 != r1) goto L1d
            java.lang.String r0 = r3.descriptor
            r1 = 1
            java.lang.String r0 = r0.substring(r1)
            com.android.dx.rop.type.Type r0 = intern(r0)
            r3.componentType = r0
            goto L36
        L1d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "not an array type: "
            r1.append(r2)
            java.lang.String r2 = r3.descriptor
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L36:
            com.android.dx.rop.type.Type r0 = r3.componentType
            return r0
    }

    public java.lang.String getDescriptor() {
            r1 = this;
            java.lang.String r0 = r1.descriptor
            return r0
    }

    @Override // com.android.dx.rop.type.TypeBearer
    public com.android.dx.rop.type.Type getFrameType() {
            r2 = this;
            int r0 = r2.basicType
            r1 = 1
            if (r0 == r1) goto L13
            r1 = 2
            if (r0 == r1) goto L13
            r1 = 3
            if (r0 == r1) goto L13
            r1 = 6
            if (r0 == r1) goto L13
            r1 = 8
            if (r0 == r1) goto L13
            return r2
        L13:
            com.android.dx.rop.type.Type r0 = com.android.dx.rop.type.Type.INT
            return r0
    }

    @Override // com.android.dx.rop.type.TypeBearer
    public /* bridge */ /* synthetic */ com.android.dx.rop.type.TypeBearer getFrameType() {
            r1 = this;
            com.android.dx.rop.type.Type r0 = r1.getFrameType()
            return r0
    }

    public com.android.dx.rop.type.Type getInitializedType() {
            r3 = this;
            com.android.dx.rop.type.Type r0 = r3.initializedType
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "initialized type: "
            r1.append(r2)
            java.lang.String r2 = r3.descriptor
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public int getNewAt() {
            r1 = this;
            int r0 = r1.newAt
            return r0
    }

    @Override // com.android.dx.rop.type.TypeBearer
    public com.android.dx.rop.type.Type getType() {
            r0 = this;
            return r0
    }

    public int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.descriptor
            int r0 = r0.hashCode()
            return r0
    }

    public boolean isArray() {
            r3 = this;
            java.lang.String r0 = r3.descriptor
            r1 = 0
            char r0 = r0.charAt(r1)
            r2 = 91
            if (r0 != r2) goto Lc
            r1 = 1
        Lc:
            return r1
    }

    public boolean isArrayOrKnownNull() {
            r1 = this;
            boolean r0 = r1.isArray()
            if (r0 != 0) goto L11
            com.android.dx.rop.type.Type r0 = com.android.dx.rop.type.Type.KNOWN_NULL
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Lf
            goto L11
        Lf:
            r0 = 0
            goto L12
        L11:
            r0 = 1
        L12:
            return r0
    }

    public boolean isCategory1() {
            r2 = this;
            int r0 = r2.basicType
            r1 = 4
            if (r0 == r1) goto La
            r1 = 7
            if (r0 == r1) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    public boolean isCategory2() {
            r2 = this;
            int r0 = r2.basicType
            r1 = 4
            if (r0 == r1) goto La
            r1 = 7
            if (r0 == r1) goto La
            r0 = 0
            return r0
        La:
            r0 = 1
            return r0
    }

    @Override // com.android.dx.rop.type.TypeBearer
    public boolean isConstant() {
            r1 = this;
            r0 = 0
            return r0
    }

    public boolean isIntlike() {
            r3 = this;
            int r0 = r3.basicType
            r1 = 1
            if (r0 == r1) goto L14
            r2 = 2
            if (r0 == r2) goto L14
            r2 = 3
            if (r0 == r2) goto L14
            r2 = 6
            if (r0 == r2) goto L14
            r2 = 8
            if (r0 == r2) goto L14
            r0 = 0
            return r0
        L14:
            return r1
    }

    public boolean isPrimitive() {
            r1 = this;
            int r0 = r1.basicType
            switch(r0) {
                case 0: goto L7;
                case 1: goto L7;
                case 2: goto L7;
                case 3: goto L7;
                case 4: goto L7;
                case 5: goto L7;
                case 6: goto L7;
                case 7: goto L7;
                case 8: goto L7;
                default: goto L5;
            }
        L5:
            r0 = 0
            return r0
        L7:
            r0 = 1
            return r0
    }

    public boolean isReference() {
            r2 = this;
            int r0 = r2.basicType
            r1 = 9
            if (r0 != r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public boolean isUninitialized() {
            r1 = this;
            int r0 = r1.newAt
            if (r0 < 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    @Override // com.android.dx.util.ToHuman
    public java.lang.String toHuman() {
            r3 = this;
            int r0 = r3.basicType
            switch(r0) {
                case 0: goto L4d;
                case 1: goto L4a;
                case 2: goto L47;
                case 3: goto L44;
                case 4: goto L41;
                case 5: goto L3e;
                case 6: goto L3b;
                case 7: goto L38;
                case 8: goto L35;
                case 9: goto L8;
                default: goto L5;
            }
        L5:
            java.lang.String r0 = r3.descriptor
            return r0
        L8:
            boolean r0 = r3.isArray()
            if (r0 == 0) goto L28
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            com.android.dx.rop.type.Type r1 = r3.getComponentType()
            java.lang.String r1 = r1.toHuman()
            r0.append(r1)
            java.lang.String r1 = "[]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L28:
            java.lang.String r0 = r3.getClassName()
            java.lang.String r1 = "/"
            java.lang.String r2 = "."
            java.lang.String r0 = r0.replace(r1, r2)
            return r0
        L35:
            java.lang.String r0 = "short"
            return r0
        L38:
            java.lang.String r0 = "long"
            return r0
        L3b:
            java.lang.String r0 = "int"
            return r0
        L3e:
            java.lang.String r0 = "float"
            return r0
        L41:
            java.lang.String r0 = "double"
            return r0
        L44:
            java.lang.String r0 = "char"
            return r0
        L47:
            java.lang.String r0 = "byte"
            return r0
        L4a:
            java.lang.String r0 = "boolean"
            return r0
        L4d:
            java.lang.String r0 = "void"
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.descriptor
            return r0
    }
}
