package net.bytebuddy.jar.asm;

/* JADX INFO: loaded from: classes2.dex */
public final class Type {
    public static final int ARRAY = 9;
    public static final int BOOLEAN = 1;
    public static final net.bytebuddy.jar.asm.Type BOOLEAN_TYPE = null;
    public static final int BYTE = 3;
    public static final net.bytebuddy.jar.asm.Type BYTE_TYPE = null;
    public static final int CHAR = 2;
    public static final net.bytebuddy.jar.asm.Type CHAR_TYPE = null;
    public static final int DOUBLE = 8;
    public static final net.bytebuddy.jar.asm.Type DOUBLE_TYPE = null;
    public static final int FLOAT = 6;
    public static final net.bytebuddy.jar.asm.Type FLOAT_TYPE = null;
    public static final int INT = 5;
    private static final int INTERNAL = 12;
    public static final net.bytebuddy.jar.asm.Type INT_TYPE = null;
    public static final int LONG = 7;
    public static final net.bytebuddy.jar.asm.Type LONG_TYPE = null;
    public static final int METHOD = 11;
    public static final int OBJECT = 10;
    private static final java.lang.String PRIMITIVE_DESCRIPTORS = "VZCBSIFJD";
    public static final int SHORT = 4;
    public static final net.bytebuddy.jar.asm.Type SHORT_TYPE = null;
    public static final int VOID = 0;
    public static final net.bytebuddy.jar.asm.Type VOID_TYPE = null;
    private final int sort;
    private final int valueBegin;
    private final java.lang.String valueBuffer;
    private final int valueEnd;

    static {
            net.bytebuddy.jar.asm.Type r0 = new net.bytebuddy.jar.asm.Type
            r1 = 0
            java.lang.String r2 = "VZCBSIFJD"
            r3 = 1
            r0.<init>(r1, r2, r1, r3)
            net.bytebuddy.jar.asm.Type.VOID_TYPE = r0
            net.bytebuddy.jar.asm.Type r0 = new net.bytebuddy.jar.asm.Type
            r1 = 2
            r0.<init>(r3, r2, r3, r1)
            net.bytebuddy.jar.asm.Type.BOOLEAN_TYPE = r0
            net.bytebuddy.jar.asm.Type r0 = new net.bytebuddy.jar.asm.Type
            r3 = 3
            r0.<init>(r1, r2, r1, r3)
            net.bytebuddy.jar.asm.Type.CHAR_TYPE = r0
            net.bytebuddy.jar.asm.Type r0 = new net.bytebuddy.jar.asm.Type
            r1 = 4
            r0.<init>(r3, r2, r3, r1)
            net.bytebuddy.jar.asm.Type.BYTE_TYPE = r0
            net.bytebuddy.jar.asm.Type r0 = new net.bytebuddy.jar.asm.Type
            r3 = 5
            r0.<init>(r1, r2, r1, r3)
            net.bytebuddy.jar.asm.Type.SHORT_TYPE = r0
            net.bytebuddy.jar.asm.Type r0 = new net.bytebuddy.jar.asm.Type
            r1 = 6
            r0.<init>(r3, r2, r3, r1)
            net.bytebuddy.jar.asm.Type.INT_TYPE = r0
            net.bytebuddy.jar.asm.Type r0 = new net.bytebuddy.jar.asm.Type
            r3 = 7
            r0.<init>(r1, r2, r1, r3)
            net.bytebuddy.jar.asm.Type.FLOAT_TYPE = r0
            net.bytebuddy.jar.asm.Type r0 = new net.bytebuddy.jar.asm.Type
            r1 = 8
            r0.<init>(r3, r2, r3, r1)
            net.bytebuddy.jar.asm.Type.LONG_TYPE = r0
            net.bytebuddy.jar.asm.Type r0 = new net.bytebuddy.jar.asm.Type
            r3 = 9
            r0.<init>(r1, r2, r1, r3)
            net.bytebuddy.jar.asm.Type.DOUBLE_TYPE = r0
            return
    }

    private Type(int r1, java.lang.String r2, int r3, int r4) {
            r0 = this;
            r0.<init>()
            r0.sort = r1
            r0.valueBuffer = r2
            r0.valueBegin = r3
            r0.valueEnd = r4
            return
    }

    private static void appendDescriptor(java.lang.Class<?> r1, java.lang.StringBuilder r2) {
        L0:
            boolean r0 = r1.isArray()
            if (r0 == 0) goto L10
            r0 = 91
            r2.append(r0)
            java.lang.Class r1 = r1.getComponentType()
            goto L0
        L10:
            boolean r0 = r1.isPrimitive()
            if (r0 == 0) goto L5e
            java.lang.Class r0 = java.lang.Integer.TYPE
            if (r1 != r0) goto L1d
            r1 = 73
            goto L54
        L1d:
            java.lang.Class r0 = java.lang.Void.TYPE
            if (r1 != r0) goto L24
            r1 = 86
            goto L54
        L24:
            java.lang.Class r0 = java.lang.Boolean.TYPE
            if (r1 != r0) goto L2b
            r1 = 90
            goto L54
        L2b:
            java.lang.Class r0 = java.lang.Byte.TYPE
            if (r1 != r0) goto L32
            r1 = 66
            goto L54
        L32:
            java.lang.Class r0 = java.lang.Character.TYPE
            if (r1 != r0) goto L39
            r1 = 67
            goto L54
        L39:
            java.lang.Class r0 = java.lang.Short.TYPE
            if (r1 != r0) goto L40
            r1 = 83
            goto L54
        L40:
            java.lang.Class r0 = java.lang.Double.TYPE
            if (r1 != r0) goto L47
            r1 = 68
            goto L54
        L47:
            java.lang.Class r0 = java.lang.Float.TYPE
            if (r1 != r0) goto L4e
            r1 = 70
            goto L54
        L4e:
            java.lang.Class r0 = java.lang.Long.TYPE
            if (r1 != r0) goto L58
            r1 = 74
        L54:
            r2.append(r1)
            goto L6f
        L58:
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>()
            throw r1
        L5e:
            r0 = 76
            r2.append(r0)
            java.lang.String r1 = getInternalName(r1)
            r2.append(r1)
            r1 = 59
            r2.append(r1)
        L6f:
            return
    }

    private void appendDescriptor(java.lang.StringBuilder r4) {
            r3 = this;
            int r0 = r3.sort
            r1 = 10
            if (r0 != r1) goto L14
            java.lang.String r0 = r3.valueBuffer
            int r1 = r3.valueBegin
            int r1 = r1 + (-1)
            int r2 = r3.valueEnd
            int r2 = r2 + 1
            r4.append(r0, r1, r2)
            goto L35
        L14:
            r1 = 12
            if (r0 != r1) goto L2c
            r0 = 76
            r4.append(r0)
            java.lang.String r0 = r3.valueBuffer
            int r1 = r3.valueBegin
            int r2 = r3.valueEnd
            r4.append(r0, r1, r2)
            r0 = 59
            r4.append(r0)
            goto L35
        L2c:
            java.lang.String r0 = r3.valueBuffer
            int r1 = r3.valueBegin
            int r2 = r3.valueEnd
            r4.append(r0, r1, r2)
        L35:
            return
    }

    public static int getArgumentCount(java.lang.String r5) {
            r0 = 0
            r1 = 1
            r2 = r1
        L3:
            char r3 = r5.charAt(r2)
            r4 = 41
            if (r3 == r4) goto L30
        Lb:
            char r3 = r5.charAt(r2)
            r4 = 91
            if (r3 != r4) goto L16
            int r2 = r2 + 1
            goto Lb
        L16:
            int r3 = r2 + 1
            char r2 = r5.charAt(r2)
            r4 = 76
            if (r2 != r4) goto L2c
            r2 = 59
            int r2 = r5.indexOf(r2, r3)
            int r2 = r2 + r1
            int r2 = java.lang.Math.max(r3, r2)
            goto L2d
        L2c:
            r2 = r3
        L2d:
            int r0 = r0 + 1
            goto L3
        L30:
            return r0
    }

    public static net.bytebuddy.jar.asm.Type[] getArgumentTypes(java.lang.String r7) {
            int r0 = getArgumentCount(r7)
            net.bytebuddy.jar.asm.Type[] r0 = new net.bytebuddy.jar.asm.Type[r0]
            r1 = 1
            r2 = 0
            r3 = r1
        L9:
            char r4 = r7.charAt(r3)
            r5 = 41
            if (r4 == r5) goto L3d
            r4 = r3
        L12:
            char r5 = r7.charAt(r4)
            r6 = 91
            if (r5 != r6) goto L1d
            int r4 = r4 + 1
            goto L12
        L1d:
            int r5 = r4 + 1
            char r4 = r7.charAt(r4)
            r6 = 76
            if (r4 != r6) goto L32
            r4 = 59
            int r4 = r7.indexOf(r4, r5)
            int r4 = r4 + r1
            int r5 = java.lang.Math.max(r5, r4)
        L32:
            int r4 = r2 + 1
            net.bytebuddy.jar.asm.Type r3 = getTypeInternal(r7, r3, r5)
            r0[r2] = r3
            r2 = r4
            r3 = r5
            goto L9
        L3d:
            return r0
    }

    public static net.bytebuddy.jar.asm.Type[] getArgumentTypes(java.lang.reflect.Method r3) {
            java.lang.Class[] r3 = r3.getParameterTypes()
            int r0 = r3.length
            net.bytebuddy.jar.asm.Type[] r0 = new net.bytebuddy.jar.asm.Type[r0]
            int r1 = r3.length
            int r1 = r1 + (-1)
        La:
            if (r1 < 0) goto L17
            r2 = r3[r1]
            net.bytebuddy.jar.asm.Type r2 = getType(r2)
            r0[r1] = r2
            int r1 = r1 + (-1)
            goto La
        L17:
            return r0
    }

    public static int getArgumentsAndReturnSizes(java.lang.String r7) {
            r0 = 1
            char r1 = r7.charAt(r0)
            r2 = r0
            r3 = r2
        L7:
            r4 = 41
            r5 = 68
            r6 = 74
            if (r1 == r4) goto L41
            if (r1 == r6) goto L38
            if (r1 != r5) goto L14
            goto L38
        L14:
            char r1 = r7.charAt(r2)
            r4 = 91
            if (r1 != r4) goto L1f
            int r2 = r2 + 1
            goto L14
        L1f:
            int r1 = r2 + 1
            char r2 = r7.charAt(r2)
            r4 = 76
            if (r2 != r4) goto L34
            r2 = 59
            int r2 = r7.indexOf(r2, r1)
            int r2 = r2 + r0
            int r1 = java.lang.Math.max(r1, r2)
        L34:
            int r3 = r3 + 1
            r2 = r1
            goto L3c
        L38:
            int r2 = r2 + 1
            int r3 = r3 + 2
        L3c:
            char r1 = r7.charAt(r2)
            goto L7
        L41:
            int r2 = r2 + r0
            char r7 = r7.charAt(r2)
            r1 = 86
            r2 = 2
            if (r7 != r1) goto L4e
            int r7 = r3 << 2
            return r7
        L4e:
            if (r7 == r6) goto L52
            if (r7 != r5) goto L53
        L52:
            r0 = r2
        L53:
            int r7 = r3 << 2
            r7 = r7 | r0
            return r7
    }

    public static java.lang.String getConstructorDescriptor(java.lang.reflect.Constructor<?> r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 40
            r0.append(r1)
            java.lang.Class[] r4 = r4.getParameterTypes()
            int r1 = r4.length
            r2 = 0
        L10:
            if (r2 >= r1) goto L1a
            r3 = r4[r2]
            appendDescriptor(r3, r0)
            int r2 = r2 + 1
            goto L10
        L1a:
            java.lang.String r4 = ")V"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            return r4
    }

    public static java.lang.String getDescriptor(java.lang.Class<?> r1) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            appendDescriptor(r1, r0)
            java.lang.String r1 = r0.toString()
            return r1
    }

    public static java.lang.String getInternalName(java.lang.Class<?> r2) {
            java.lang.String r2 = r2.getName()
            r0 = 46
            r1 = 47
            java.lang.String r2 = r2.replace(r0, r1)
            return r2
    }

    public static java.lang.String getMethodDescriptor(java.lang.reflect.Method r5) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 40
            r0.append(r1)
            java.lang.Class[] r1 = r5.getParameterTypes()
            int r2 = r1.length
            r3 = 0
        L10:
            if (r3 >= r2) goto L1a
            r4 = r1[r3]
            appendDescriptor(r4, r0)
            int r3 = r3 + 1
            goto L10
        L1a:
            r1 = 41
            r0.append(r1)
            java.lang.Class r5 = r5.getReturnType()
            appendDescriptor(r5, r0)
            java.lang.String r5 = r0.toString()
            return r5
    }

    public static java.lang.String getMethodDescriptor(net.bytebuddy.jar.asm.Type r4, net.bytebuddy.jar.asm.Type... r5) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 40
            r0.append(r1)
            int r1 = r5.length
            r2 = 0
        Lc:
            if (r2 >= r1) goto L16
            r3 = r5[r2]
            r3.appendDescriptor(r0)
            int r2 = r2 + 1
            goto Lc
        L16:
            r5 = 41
            r0.append(r5)
            r4.appendDescriptor(r0)
            java.lang.String r4 = r0.toString()
            return r4
    }

    public static net.bytebuddy.jar.asm.Type getMethodType(java.lang.String r4) {
            net.bytebuddy.jar.asm.Type r0 = new net.bytebuddy.jar.asm.Type
            int r1 = r4.length()
            r2 = 11
            r3 = 0
            r0.<init>(r2, r4, r3, r1)
            return r0
    }

    public static net.bytebuddy.jar.asm.Type getMethodType(net.bytebuddy.jar.asm.Type r0, net.bytebuddy.jar.asm.Type... r1) {
            java.lang.String r0 = getMethodDescriptor(r0, r1)
            net.bytebuddy.jar.asm.Type r0 = getType(r0)
            return r0
    }

    public static net.bytebuddy.jar.asm.Type getObjectType(java.lang.String r4) {
            net.bytebuddy.jar.asm.Type r0 = new net.bytebuddy.jar.asm.Type
            r1 = 0
            char r2 = r4.charAt(r1)
            r3 = 91
            if (r2 != r3) goto Le
            r2 = 9
            goto L10
        Le:
            r2 = 12
        L10:
            int r3 = r4.length()
            r0.<init>(r2, r4, r1, r3)
            return r0
    }

    public static net.bytebuddy.jar.asm.Type getReturnType(java.lang.String r2) {
            int r0 = getReturnTypeOffset(r2)
            int r1 = r2.length()
            net.bytebuddy.jar.asm.Type r2 = getTypeInternal(r2, r0, r1)
            return r2
    }

    public static net.bytebuddy.jar.asm.Type getReturnType(java.lang.reflect.Method r0) {
            java.lang.Class r0 = r0.getReturnType()
            net.bytebuddy.jar.asm.Type r0 = getType(r0)
            return r0
    }

    public static int getReturnTypeOffset(java.lang.String r4) {
            r0 = 1
            r1 = r0
        L2:
            char r2 = r4.charAt(r1)
            r3 = 41
            if (r2 == r3) goto L2d
        La:
            char r2 = r4.charAt(r1)
            r3 = 91
            if (r2 != r3) goto L15
            int r1 = r1 + 1
            goto La
        L15:
            int r2 = r1 + 1
            char r1 = r4.charAt(r1)
            r3 = 76
            if (r1 != r3) goto L2b
            r1 = 59
            int r1 = r4.indexOf(r1, r2)
            int r1 = r1 + r0
            int r1 = java.lang.Math.max(r2, r1)
            goto L2
        L2b:
            r1 = r2
            goto L2
        L2d:
            int r1 = r1 + r0
            return r1
    }

    public static net.bytebuddy.jar.asm.Type getType(java.lang.Class<?> r1) {
            boolean r0 = r1.isPrimitive()
            if (r0 == 0) goto L4b
            java.lang.Class r0 = java.lang.Integer.TYPE
            if (r1 != r0) goto Ld
            net.bytebuddy.jar.asm.Type r1 = net.bytebuddy.jar.asm.Type.INT_TYPE
            return r1
        Ld:
            java.lang.Class r0 = java.lang.Void.TYPE
            if (r1 != r0) goto L14
            net.bytebuddy.jar.asm.Type r1 = net.bytebuddy.jar.asm.Type.VOID_TYPE
            return r1
        L14:
            java.lang.Class r0 = java.lang.Boolean.TYPE
            if (r1 != r0) goto L1b
            net.bytebuddy.jar.asm.Type r1 = net.bytebuddy.jar.asm.Type.BOOLEAN_TYPE
            return r1
        L1b:
            java.lang.Class r0 = java.lang.Byte.TYPE
            if (r1 != r0) goto L22
            net.bytebuddy.jar.asm.Type r1 = net.bytebuddy.jar.asm.Type.BYTE_TYPE
            return r1
        L22:
            java.lang.Class r0 = java.lang.Character.TYPE
            if (r1 != r0) goto L29
            net.bytebuddy.jar.asm.Type r1 = net.bytebuddy.jar.asm.Type.CHAR_TYPE
            return r1
        L29:
            java.lang.Class r0 = java.lang.Short.TYPE
            if (r1 != r0) goto L30
            net.bytebuddy.jar.asm.Type r1 = net.bytebuddy.jar.asm.Type.SHORT_TYPE
            return r1
        L30:
            java.lang.Class r0 = java.lang.Double.TYPE
            if (r1 != r0) goto L37
            net.bytebuddy.jar.asm.Type r1 = net.bytebuddy.jar.asm.Type.DOUBLE_TYPE
            return r1
        L37:
            java.lang.Class r0 = java.lang.Float.TYPE
            if (r1 != r0) goto L3e
            net.bytebuddy.jar.asm.Type r1 = net.bytebuddy.jar.asm.Type.FLOAT_TYPE
            return r1
        L3e:
            java.lang.Class r0 = java.lang.Long.TYPE
            if (r1 != r0) goto L45
            net.bytebuddy.jar.asm.Type r1 = net.bytebuddy.jar.asm.Type.LONG_TYPE
            return r1
        L45:
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>()
            throw r1
        L4b:
            java.lang.String r1 = getDescriptor(r1)
            net.bytebuddy.jar.asm.Type r1 = getType(r1)
            return r1
    }

    public static net.bytebuddy.jar.asm.Type getType(java.lang.String r2) {
            int r0 = r2.length()
            r1 = 0
            net.bytebuddy.jar.asm.Type r2 = getTypeInternal(r2, r1, r0)
            return r2
    }

    public static net.bytebuddy.jar.asm.Type getType(java.lang.reflect.Constructor<?> r0) {
            java.lang.String r0 = getConstructorDescriptor(r0)
            net.bytebuddy.jar.asm.Type r0 = getType(r0)
            return r0
    }

    public static net.bytebuddy.jar.asm.Type getType(java.lang.reflect.Method r0) {
            java.lang.String r0 = getMethodDescriptor(r0)
            net.bytebuddy.jar.asm.Type r0 = getType(r0)
            return r0
    }

    private static net.bytebuddy.jar.asm.Type getTypeInternal(java.lang.String r2, int r3, int r4) {
            char r0 = r2.charAt(r3)
            r1 = 40
            if (r0 == r1) goto L71
            r1 = 70
            if (r0 == r1) goto L6e
            r1 = 76
            if (r0 == r1) goto L62
            r1 = 83
            if (r0 == r1) goto L5f
            r1 = 86
            if (r0 == r1) goto L5c
            r1 = 73
            if (r0 == r1) goto L59
            r1 = 74
            if (r0 == r1) goto L56
            r1 = 90
            if (r0 == r1) goto L53
            r1 = 91
            if (r0 == r1) goto L4b
            switch(r0) {
                case 66: goto L48;
                case 67: goto L45;
                case 68: goto L42;
                default: goto L2b;
            }
        L2b:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "Invalid descriptor: "
            r4.append(r0)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r3.<init>(r2)
            throw r3
        L42:
            net.bytebuddy.jar.asm.Type r2 = net.bytebuddy.jar.asm.Type.DOUBLE_TYPE
            return r2
        L45:
            net.bytebuddy.jar.asm.Type r2 = net.bytebuddy.jar.asm.Type.CHAR_TYPE
            return r2
        L48:
            net.bytebuddy.jar.asm.Type r2 = net.bytebuddy.jar.asm.Type.BYTE_TYPE
            return r2
        L4b:
            net.bytebuddy.jar.asm.Type r0 = new net.bytebuddy.jar.asm.Type
            r1 = 9
            r0.<init>(r1, r2, r3, r4)
            return r0
        L53:
            net.bytebuddy.jar.asm.Type r2 = net.bytebuddy.jar.asm.Type.BOOLEAN_TYPE
            return r2
        L56:
            net.bytebuddy.jar.asm.Type r2 = net.bytebuddy.jar.asm.Type.LONG_TYPE
            return r2
        L59:
            net.bytebuddy.jar.asm.Type r2 = net.bytebuddy.jar.asm.Type.INT_TYPE
            return r2
        L5c:
            net.bytebuddy.jar.asm.Type r2 = net.bytebuddy.jar.asm.Type.VOID_TYPE
            return r2
        L5f:
            net.bytebuddy.jar.asm.Type r2 = net.bytebuddy.jar.asm.Type.SHORT_TYPE
            return r2
        L62:
            net.bytebuddy.jar.asm.Type r0 = new net.bytebuddy.jar.asm.Type
            int r3 = r3 + 1
            int r4 = r4 + (-1)
            r1 = 10
            r0.<init>(r1, r2, r3, r4)
            return r0
        L6e:
            net.bytebuddy.jar.asm.Type r2 = net.bytebuddy.jar.asm.Type.FLOAT_TYPE
            return r2
        L71:
            net.bytebuddy.jar.asm.Type r0 = new net.bytebuddy.jar.asm.Type
            r1 = 11
            r0.<init>(r1, r2, r3, r4)
            return r0
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof net.bytebuddy.jar.asm.Type
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            net.bytebuddy.jar.asm.Type r8 = (net.bytebuddy.jar.asm.Type) r8
            int r1 = r7.sort
            r3 = 10
            r4 = 12
            if (r1 != r4) goto L15
            r1 = r3
        L15:
            int r5 = r8.sort
            if (r5 != r4) goto L1a
            goto L1b
        L1a:
            r3 = r5
        L1b:
            if (r1 == r3) goto L1e
            return r2
        L1e:
            int r1 = r7.valueBegin
            int r3 = r7.valueEnd
            int r4 = r8.valueBegin
            int r5 = r8.valueEnd
            int r6 = r3 - r1
            int r5 = r5 - r4
            if (r6 == r5) goto L2c
            return r2
        L2c:
            if (r1 >= r3) goto L42
            java.lang.String r5 = r7.valueBuffer
            char r5 = r5.charAt(r1)
            java.lang.String r6 = r8.valueBuffer
            char r6 = r6.charAt(r4)
            if (r5 == r6) goto L3d
            return r2
        L3d:
            int r1 = r1 + 1
            int r4 = r4 + 1
            goto L2c
        L42:
            return r0
    }

    public int getArgumentCount() {
            r1 = this;
            java.lang.String r0 = r1.getDescriptor()
            int r0 = getArgumentCount(r0)
            return r0
    }

    public net.bytebuddy.jar.asm.Type[] getArgumentTypes() {
            r1 = this;
            java.lang.String r0 = r1.getDescriptor()
            net.bytebuddy.jar.asm.Type[] r0 = getArgumentTypes(r0)
            return r0
    }

    public int getArgumentsAndReturnSizes() {
            r1 = this;
            java.lang.String r0 = r1.getDescriptor()
            int r0 = getArgumentsAndReturnSizes(r0)
            return r0
    }

    public java.lang.String getClassName() {
            r3 = this;
            int r0 = r3.sort
            switch(r0) {
                case 0: goto L56;
                case 1: goto L53;
                case 2: goto L50;
                case 3: goto L4d;
                case 4: goto L4a;
                case 5: goto L47;
                case 6: goto L44;
                case 7: goto L41;
                case 8: goto L3e;
                case 9: goto L1e;
                case 10: goto Lb;
                case 11: goto L5;
                case 12: goto Lb;
                default: goto L5;
            }
        L5:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        Lb:
            java.lang.String r0 = r3.valueBuffer
            int r1 = r3.valueBegin
            int r2 = r3.valueEnd
            java.lang.String r0 = r0.substring(r1, r2)
            r1 = 47
            r2 = 46
            java.lang.String r0 = r0.replace(r1, r2)
            return r0
        L1e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            net.bytebuddy.jar.asm.Type r1 = r3.getElementType()
            java.lang.String r1 = r1.getClassName()
            r0.<init>(r1)
            int r1 = r3.getDimensions()
        L2f:
            if (r1 <= 0) goto L39
            java.lang.String r2 = "[]"
            r0.append(r2)
            int r1 = r1 + (-1)
            goto L2f
        L39:
            java.lang.String r0 = r0.toString()
            return r0
        L3e:
            java.lang.String r0 = "double"
            return r0
        L41:
            java.lang.String r0 = "long"
            return r0
        L44:
            java.lang.String r0 = "float"
            return r0
        L47:
            java.lang.String r0 = "int"
            return r0
        L4a:
            java.lang.String r0 = "short"
            return r0
        L4d:
            java.lang.String r0 = "byte"
            return r0
        L50:
            java.lang.String r0 = "char"
            return r0
        L53:
            java.lang.String r0 = "boolean"
            return r0
        L56:
            java.lang.String r0 = "void"
            return r0
    }

    public java.lang.String getDescriptor() {
            r4 = this;
            int r0 = r4.sort
            r1 = 10
            if (r0 != r1) goto L15
            java.lang.String r0 = r4.valueBuffer
            int r1 = r4.valueBegin
            int r1 = r1 + (-1)
            int r2 = r4.valueEnd
            int r2 = r2 + 1
            java.lang.String r0 = r0.substring(r1, r2)
            return r0
        L15:
            r1 = 12
            if (r0 != r1) goto L3a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 76
            r0.append(r1)
            java.lang.String r1 = r4.valueBuffer
            int r2 = r4.valueBegin
            int r3 = r4.valueEnd
            java.lang.String r1 = r1.substring(r2, r3)
            r0.append(r1)
            r1 = 59
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L3a:
            java.lang.String r0 = r4.valueBuffer
            int r1 = r4.valueBegin
            int r2 = r4.valueEnd
            java.lang.String r0 = r0.substring(r1, r2)
            return r0
    }

    public int getDimensions() {
            r3 = this;
            r0 = 1
        L1:
            java.lang.String r1 = r3.valueBuffer
            int r2 = r3.valueBegin
            int r2 = r2 + r0
            char r1 = r1.charAt(r2)
            r2 = 91
            if (r1 != r2) goto L11
            int r0 = r0 + 1
            goto L1
        L11:
            return r0
    }

    public net.bytebuddy.jar.asm.Type getElementType() {
            r3 = this;
            int r0 = r3.getDimensions()
            java.lang.String r1 = r3.valueBuffer
            int r2 = r3.valueBegin
            int r2 = r2 + r0
            int r0 = r3.valueEnd
            net.bytebuddy.jar.asm.Type r0 = getTypeInternal(r1, r2, r0)
            return r0
    }

    public java.lang.String getInternalName() {
            r3 = this;
            java.lang.String r0 = r3.valueBuffer
            int r1 = r3.valueBegin
            int r2 = r3.valueEnd
            java.lang.String r0 = r0.substring(r1, r2)
            return r0
    }

    public int getOpcode(int r3) {
            r2 = this;
            r0 = 46
            if (r3 == r0) goto L44
            r0 = 79
            if (r3 != r0) goto L9
            goto L44
        L9:
            int r0 = r2.sort
            r1 = 172(0xac, float:2.41E-43)
            switch(r0) {
                case 0: goto L39;
                case 1: goto L38;
                case 2: goto L38;
                case 3: goto L38;
                case 4: goto L38;
                case 5: goto L38;
                case 6: goto L36;
                case 7: goto L33;
                case 8: goto L30;
                case 9: goto L1c;
                case 10: goto L1c;
                case 11: goto L16;
                case 12: goto L1c;
                default: goto L10;
            }
        L10:
            java.lang.AssertionError r3 = new java.lang.AssertionError
            r3.<init>()
            throw r3
        L16:
            java.lang.UnsupportedOperationException r3 = new java.lang.UnsupportedOperationException
            r3.<init>()
            throw r3
        L1c:
            r0 = 21
            if (r3 == r0) goto L2d
            r0 = 54
            if (r3 == r0) goto L2d
            if (r3 != r1) goto L27
            goto L2d
        L27:
            java.lang.UnsupportedOperationException r3 = new java.lang.UnsupportedOperationException
            r3.<init>()
            throw r3
        L2d:
            int r3 = r3 + 4
            return r3
        L30:
            int r3 = r3 + 3
            return r3
        L33:
            int r3 = r3 + 1
            return r3
        L36:
            int r3 = r3 + 2
        L38:
            return r3
        L39:
            if (r3 != r1) goto L3e
            r3 = 177(0xb1, float:2.48E-43)
            return r3
        L3e:
            java.lang.UnsupportedOperationException r3 = new java.lang.UnsupportedOperationException
            r3.<init>()
            throw r3
        L44:
            int r0 = r2.sort
            switch(r0) {
                case 0: goto L64;
                case 1: goto L61;
                case 2: goto L5e;
                case 3: goto L61;
                case 4: goto L5b;
                case 5: goto L5a;
                case 6: goto L58;
                case 7: goto L55;
                case 8: goto L52;
                case 9: goto L4f;
                case 10: goto L4f;
                case 11: goto L64;
                case 12: goto L4f;
                default: goto L49;
            }
        L49:
            java.lang.AssertionError r3 = new java.lang.AssertionError
            r3.<init>()
            throw r3
        L4f:
            int r3 = r3 + 4
            return r3
        L52:
            int r3 = r3 + 3
            return r3
        L55:
            int r3 = r3 + 1
            return r3
        L58:
            int r3 = r3 + 2
        L5a:
            return r3
        L5b:
            int r3 = r3 + 7
            return r3
        L5e:
            int r3 = r3 + 6
            return r3
        L61:
            int r3 = r3 + 5
            return r3
        L64:
            java.lang.UnsupportedOperationException r3 = new java.lang.UnsupportedOperationException
            r3.<init>()
            throw r3
    }

    public net.bytebuddy.jar.asm.Type getReturnType() {
            r1 = this;
            java.lang.String r0 = r1.getDescriptor()
            net.bytebuddy.jar.asm.Type r0 = getReturnType(r0)
            return r0
    }

    public int getSize() {
            r1 = this;
            int r0 = r1.sort
            switch(r0) {
                case 0: goto Lf;
                case 1: goto Ld;
                case 2: goto Ld;
                case 3: goto Ld;
                case 4: goto Ld;
                case 5: goto Ld;
                case 6: goto Ld;
                case 7: goto Lb;
                case 8: goto Lb;
                case 9: goto Ld;
                case 10: goto Ld;
                case 11: goto L5;
                case 12: goto Ld;
                default: goto L5;
            }
        L5:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        Lb:
            r0 = 2
            return r0
        Ld:
            r0 = 1
            return r0
        Lf:
            r0 = 0
            return r0
    }

    public int getSort() {
            r2 = this;
            int r0 = r2.sort
            r1 = 12
            if (r0 != r1) goto L8
            r0 = 10
        L8:
            return r0
    }

    public int hashCode() {
            r4 = this;
            int r0 = r4.sort
            r1 = 12
            if (r0 != r1) goto L9
            r1 = 10
            goto La
        L9:
            r1 = r0
        La:
            int r1 = r1 * 13
            r2 = 9
            if (r0 < r2) goto L22
            int r0 = r4.valueBegin
            int r2 = r4.valueEnd
        L14:
            if (r0 >= r2) goto L22
            java.lang.String r3 = r4.valueBuffer
            char r3 = r3.charAt(r0)
            int r1 = r1 + r3
            int r1 = r1 * 17
            int r0 = r0 + 1
            goto L14
        L22:
            return r1
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.getDescriptor()
            return r0
    }
}
