package net.bytebuddy.implementation.bytecode.assign.primitive;

/* JADX INFO: loaded from: classes2.dex */
public enum PrimitiveWideningDelegate extends java.lang.Enum<net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveWideningDelegate> {
    private static final /* synthetic */ net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveWideningDelegate[] $VALUES = null;
    public static final net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveWideningDelegate BOOLEAN = null;
    public static final net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveWideningDelegate BYTE = null;
    public static final net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveWideningDelegate CHARACTER = null;
    public static final net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveWideningDelegate DOUBLE = null;
    public static final net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveWideningDelegate FLOAT = null;
    public static final net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveWideningDelegate INTEGER = null;
    public static final net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveWideningDelegate LONG = null;
    public static final net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveWideningDelegate SHORT = null;
    private final net.bytebuddy.implementation.bytecode.StackManipulation toBooleanStackManipulation;
    private final net.bytebuddy.implementation.bytecode.StackManipulation toByteStackManipulation;
    private final net.bytebuddy.implementation.bytecode.StackManipulation toCharacterStackManipulation;
    private final net.bytebuddy.implementation.bytecode.StackManipulation toDoubleStackManipulation;
    private final net.bytebuddy.implementation.bytecode.StackManipulation toFloatStackManipulation;
    private final net.bytebuddy.implementation.bytecode.StackManipulation toIntegerStackManipulation;
    private final net.bytebuddy.implementation.bytecode.StackManipulation toLongStackManipulation;
    private final net.bytebuddy.implementation.bytecode.StackManipulation toShortStackManipulation;


    static {
            net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveWideningDelegate r11 = new net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveWideningDelegate
            net.bytebuddy.implementation.bytecode.StackManipulation$Trivial r12 = net.bytebuddy.implementation.bytecode.StackManipulation.Trivial.INSTANCE
            net.bytebuddy.implementation.bytecode.StackManipulation$Illegal r13 = net.bytebuddy.implementation.bytecode.StackManipulation.Illegal.INSTANCE
            java.lang.String r1 = "BOOLEAN"
            r2 = 0
            r0 = r11
            r3 = r12
            r4 = r13
            r5 = r13
            r6 = r13
            r7 = r13
            r8 = r13
            r9 = r13
            r10 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveWideningDelegate.BOOLEAN = r11
            net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveWideningDelegate r14 = new net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveWideningDelegate
            net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveWideningDelegate$WideningStackManipulation r8 = new net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveWideningDelegate$WideningStackManipulation
            net.bytebuddy.implementation.bytecode.StackSize r15 = net.bytebuddy.implementation.bytecode.StackSize.SINGLE
            net.bytebuddy.implementation.bytecode.StackManipulation$Size r0 = r15.toIncreasingSize()
            r10 = 133(0x85, float:1.86E-43)
            r8.<init>(r10, r0)
            net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveWideningDelegate$WideningStackManipulation r9 = new net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveWideningDelegate$WideningStackManipulation
            net.bytebuddy.implementation.bytecode.StackSize r16 = net.bytebuddy.implementation.bytecode.StackSize.ZERO
            net.bytebuddy.implementation.bytecode.StackManipulation$Size r0 = r16.toIncreasingSize()
            r7 = 134(0x86, float:1.88E-43)
            r9.<init>(r7, r0)
            net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveWideningDelegate$WideningStackManipulation r6 = new net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveWideningDelegate$WideningStackManipulation
            net.bytebuddy.implementation.bytecode.StackManipulation$Size r0 = r15.toIncreasingSize()
            r6.<init>(r10, r0)
            java.lang.String r1 = "BYTE"
            r2 = 1
            r0 = r14
            r3 = r13
            r4 = r12
            r5 = r12
            r17 = r6
            r6 = r13
            r7 = r12
            r19 = r11
            r11 = r10
            r10 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveWideningDelegate.BYTE = r14
            net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveWideningDelegate r17 = new net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveWideningDelegate
            net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveWideningDelegate$WideningStackManipulation r8 = new net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveWideningDelegate$WideningStackManipulation
            net.bytebuddy.implementation.bytecode.StackManipulation$Size r0 = r15.toIncreasingSize()
            r8.<init>(r11, r0)
            net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveWideningDelegate$WideningStackManipulation r9 = new net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveWideningDelegate$WideningStackManipulation
            net.bytebuddy.implementation.bytecode.StackManipulation$Size r0 = r16.toIncreasingSize()
            r10 = 134(0x86, float:1.88E-43)
            r9.<init>(r10, r0)
            net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveWideningDelegate$WideningStackManipulation r7 = new net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveWideningDelegate$WideningStackManipulation
            net.bytebuddy.implementation.bytecode.StackManipulation$Size r0 = r15.toIncreasingSize()
            r6 = 135(0x87, float:1.89E-43)
            r7.<init>(r6, r0)
            java.lang.String r1 = "SHORT"
            r2 = 2
            r0 = r17
            r4 = r13
            r6 = r13
            r18 = r7
            r7 = r12
            r10 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveWideningDelegate.SHORT = r17
            net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveWideningDelegate r18 = new net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveWideningDelegate
            net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveWideningDelegate$WideningStackManipulation r8 = new net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveWideningDelegate$WideningStackManipulation
            net.bytebuddy.implementation.bytecode.StackManipulation$Size r0 = r15.toIncreasingSize()
            r8.<init>(r11, r0)
            net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveWideningDelegate$WideningStackManipulation r9 = new net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveWideningDelegate$WideningStackManipulation
            net.bytebuddy.implementation.bytecode.StackManipulation$Size r0 = r16.toIncreasingSize()
            r10 = 134(0x86, float:1.88E-43)
            r9.<init>(r10, r0)
            net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveWideningDelegate$WideningStackManipulation r7 = new net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveWideningDelegate$WideningStackManipulation
            net.bytebuddy.implementation.bytecode.StackManipulation$Size r0 = r15.toIncreasingSize()
            r6 = 135(0x87, float:1.89E-43)
            r7.<init>(r6, r0)
            java.lang.String r1 = "CHARACTER"
            r2 = 3
            r0 = r18
            r5 = r13
            r6 = r12
            r20 = r7
            r7 = r12
            r10 = r20
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveWideningDelegate.CHARACTER = r18
            net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveWideningDelegate r20 = new net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveWideningDelegate
            net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveWideningDelegate$WideningStackManipulation r8 = new net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveWideningDelegate$WideningStackManipulation
            net.bytebuddy.implementation.bytecode.StackManipulation$Size r0 = r15.toIncreasingSize()
            r8.<init>(r11, r0)
            net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveWideningDelegate$WideningStackManipulation r9 = new net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveWideningDelegate$WideningStackManipulation
            net.bytebuddy.implementation.bytecode.StackManipulation$Size r0 = r16.toIncreasingSize()
            r1 = 134(0x86, float:1.88E-43)
            r9.<init>(r1, r0)
            net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveWideningDelegate$WideningStackManipulation r10 = new net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveWideningDelegate$WideningStackManipulation
            net.bytebuddy.implementation.bytecode.StackManipulation$Size r0 = r15.toIncreasingSize()
            r1 = 135(0x87, float:1.89E-43)
            r10.<init>(r1, r0)
            java.lang.String r1 = "INTEGER"
            r2 = 4
            r0 = r20
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveWideningDelegate.INTEGER = r20
            net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveWideningDelegate r11 = new net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveWideningDelegate
            net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveWideningDelegate$WideningStackManipulation r9 = new net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveWideningDelegate$WideningStackManipulation
            r0 = 137(0x89, float:1.92E-43)
            net.bytebuddy.implementation.bytecode.StackManipulation$Size r1 = r15.toDecreasingSize()
            r9.<init>(r0, r1)
            net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveWideningDelegate$WideningStackManipulation r10 = new net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveWideningDelegate$WideningStackManipulation
            r0 = 138(0x8a, float:1.93E-43)
            net.bytebuddy.implementation.bytecode.StackManipulation$Size r1 = r16.toIncreasingSize()
            r10.<init>(r0, r1)
            java.lang.String r1 = "LONG"
            r2 = 5
            r0 = r11
            r7 = r13
            r8 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveWideningDelegate.LONG = r11
            net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveWideningDelegate r16 = new net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveWideningDelegate
            net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveWideningDelegate$WideningStackManipulation r10 = new net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveWideningDelegate$WideningStackManipulation
            r0 = 141(0x8d, float:1.98E-43)
            net.bytebuddy.implementation.bytecode.StackManipulation$Size r1 = r15.toIncreasingSize()
            r10.<init>(r0, r1)
            java.lang.String r1 = "FLOAT"
            r2 = 6
            r0 = r16
            r8 = r13
            r9 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveWideningDelegate.FLOAT = r16
            net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveWideningDelegate r15 = new net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveWideningDelegate
            java.lang.String r1 = "DOUBLE"
            r2 = 7
            r0 = r15
            r9 = r13
            r10 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveWideningDelegate.DOUBLE = r15
            r0 = r19
            r1 = r14
            r2 = r17
            r3 = r18
            r4 = r20
            r5 = r11
            r6 = r16
            r7 = r15
            net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveWideningDelegate[] r0 = new net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveWideningDelegate[]{r0, r1, r2, r3, r4, r5, r6, r7}
            net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveWideningDelegate.$VALUES = r0
            return
    }

    PrimitiveWideningDelegate(java.lang.String r1, int r2, net.bytebuddy.implementation.bytecode.StackManipulation r3, net.bytebuddy.implementation.bytecode.StackManipulation r4, net.bytebuddy.implementation.bytecode.StackManipulation r5, net.bytebuddy.implementation.bytecode.StackManipulation r6, net.bytebuddy.implementation.bytecode.StackManipulation r7, net.bytebuddy.implementation.bytecode.StackManipulation r8, net.bytebuddy.implementation.bytecode.StackManipulation r9, net.bytebuddy.implementation.bytecode.StackManipulation r10) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.toBooleanStackManipulation = r3
            r0.toByteStackManipulation = r4
            r0.toShortStackManipulation = r5
            r0.toCharacterStackManipulation = r6
            r0.toIntegerStackManipulation = r7
            r0.toLongStackManipulation = r8
            r0.toFloatStackManipulation = r9
            r0.toDoubleStackManipulation = r10
            return
    }

    public static net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveWideningDelegate forPrimitive(net.bytebuddy.description.type.TypeDefinition r3) {
            java.lang.Class r0 = java.lang.Boolean.TYPE
            boolean r0 = r3.represents(r0)
            if (r0 == 0) goto Lb
            net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveWideningDelegate r3 = net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveWideningDelegate.BOOLEAN
            return r3
        Lb:
            java.lang.Class r0 = java.lang.Byte.TYPE
            boolean r0 = r3.represents(r0)
            if (r0 == 0) goto L16
            net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveWideningDelegate r3 = net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveWideningDelegate.BYTE
            return r3
        L16:
            java.lang.Class r0 = java.lang.Short.TYPE
            boolean r0 = r3.represents(r0)
            if (r0 == 0) goto L21
            net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveWideningDelegate r3 = net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveWideningDelegate.SHORT
            return r3
        L21:
            java.lang.Class r0 = java.lang.Character.TYPE
            boolean r0 = r3.represents(r0)
            if (r0 == 0) goto L2c
            net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveWideningDelegate r3 = net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveWideningDelegate.CHARACTER
            return r3
        L2c:
            java.lang.Class r0 = java.lang.Integer.TYPE
            boolean r0 = r3.represents(r0)
            if (r0 == 0) goto L37
            net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveWideningDelegate r3 = net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveWideningDelegate.INTEGER
            return r3
        L37:
            java.lang.Class r0 = java.lang.Long.TYPE
            boolean r0 = r3.represents(r0)
            if (r0 == 0) goto L42
            net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveWideningDelegate r3 = net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveWideningDelegate.LONG
            return r3
        L42:
            java.lang.Class r0 = java.lang.Float.TYPE
            boolean r0 = r3.represents(r0)
            if (r0 == 0) goto L4d
            net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveWideningDelegate r3 = net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveWideningDelegate.FLOAT
            return r3
        L4d:
            java.lang.Class r0 = java.lang.Double.TYPE
            boolean r0 = r3.represents(r0)
            if (r0 == 0) goto L58
            net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveWideningDelegate r3 = net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveWideningDelegate.DOUBLE
            return r3
        L58:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Not a primitive, non-void type: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    public static net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveWideningDelegate valueOf(java.lang.String r1) {
            java.lang.Class<net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveWideningDelegate> r0 = net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveWideningDelegate.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveWideningDelegate r1 = (net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveWideningDelegate) r1
            return r1
    }

    public static net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveWideningDelegate[] values() {
            net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveWideningDelegate[] r0 = net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveWideningDelegate.$VALUES
            java.lang.Object r0 = r0.clone()
            net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveWideningDelegate[] r0 = (net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveWideningDelegate[]) r0
            return r0
    }

    public net.bytebuddy.implementation.bytecode.StackManipulation widenTo(net.bytebuddy.description.type.TypeDefinition r4) {
            r3 = this;
            java.lang.Class r0 = java.lang.Boolean.TYPE
            boolean r0 = r4.represents(r0)
            if (r0 == 0) goto Lb
            net.bytebuddy.implementation.bytecode.StackManipulation r4 = r3.toBooleanStackManipulation
            return r4
        Lb:
            java.lang.Class r0 = java.lang.Byte.TYPE
            boolean r0 = r4.represents(r0)
            if (r0 == 0) goto L16
            net.bytebuddy.implementation.bytecode.StackManipulation r4 = r3.toByteStackManipulation
            return r4
        L16:
            java.lang.Class r0 = java.lang.Short.TYPE
            boolean r0 = r4.represents(r0)
            if (r0 == 0) goto L21
            net.bytebuddy.implementation.bytecode.StackManipulation r4 = r3.toShortStackManipulation
            return r4
        L21:
            java.lang.Class r0 = java.lang.Character.TYPE
            boolean r0 = r4.represents(r0)
            if (r0 == 0) goto L2c
            net.bytebuddy.implementation.bytecode.StackManipulation r4 = r3.toCharacterStackManipulation
            return r4
        L2c:
            java.lang.Class r0 = java.lang.Integer.TYPE
            boolean r0 = r4.represents(r0)
            if (r0 == 0) goto L37
            net.bytebuddy.implementation.bytecode.StackManipulation r4 = r3.toIntegerStackManipulation
            return r4
        L37:
            java.lang.Class r0 = java.lang.Long.TYPE
            boolean r0 = r4.represents(r0)
            if (r0 == 0) goto L42
            net.bytebuddy.implementation.bytecode.StackManipulation r4 = r3.toLongStackManipulation
            return r4
        L42:
            java.lang.Class r0 = java.lang.Float.TYPE
            boolean r0 = r4.represents(r0)
            if (r0 == 0) goto L4d
            net.bytebuddy.implementation.bytecode.StackManipulation r4 = r3.toFloatStackManipulation
            return r4
        L4d:
            java.lang.Class r0 = java.lang.Double.TYPE
            boolean r0 = r4.represents(r0)
            if (r0 == 0) goto L58
            net.bytebuddy.implementation.bytecode.StackManipulation r4 = r3.toDoubleStackManipulation
            return r4
        L58:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Not a primitive non-void type: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }
}
