package net.bytebuddy.implementation.bytecode.member;

/* JADX INFO: loaded from: classes2.dex */
public enum MethodReturn extends java.lang.Enum<net.bytebuddy.implementation.bytecode.member.MethodReturn> implements net.bytebuddy.implementation.bytecode.StackManipulation {
    private static final /* synthetic */ net.bytebuddy.implementation.bytecode.member.MethodReturn[] $VALUES = null;
    public static final net.bytebuddy.implementation.bytecode.member.MethodReturn DOUBLE = null;
    public static final net.bytebuddy.implementation.bytecode.member.MethodReturn FLOAT = null;
    public static final net.bytebuddy.implementation.bytecode.member.MethodReturn INTEGER = null;
    public static final net.bytebuddy.implementation.bytecode.member.MethodReturn LONG = null;
    public static final net.bytebuddy.implementation.bytecode.member.MethodReturn REFERENCE = null;
    public static final net.bytebuddy.implementation.bytecode.member.MethodReturn VOID = null;
    private final int returnOpcode;
    private final net.bytebuddy.implementation.bytecode.StackManipulation.Size size;

    static {
            net.bytebuddy.implementation.bytecode.member.MethodReturn r0 = new net.bytebuddy.implementation.bytecode.member.MethodReturn
            net.bytebuddy.implementation.bytecode.StackSize r1 = net.bytebuddy.implementation.bytecode.StackSize.SINGLE
            java.lang.String r2 = "INTEGER"
            r3 = 0
            r4 = 172(0xac, float:2.41E-43)
            r0.<init>(r2, r3, r4, r1)
            net.bytebuddy.implementation.bytecode.member.MethodReturn.INTEGER = r0
            net.bytebuddy.implementation.bytecode.member.MethodReturn r2 = new net.bytebuddy.implementation.bytecode.member.MethodReturn
            net.bytebuddy.implementation.bytecode.StackSize r3 = net.bytebuddy.implementation.bytecode.StackSize.DOUBLE
            java.lang.String r4 = "DOUBLE"
            r5 = 1
            r6 = 175(0xaf, float:2.45E-43)
            r2.<init>(r4, r5, r6, r3)
            net.bytebuddy.implementation.bytecode.member.MethodReturn.DOUBLE = r2
            net.bytebuddy.implementation.bytecode.member.MethodReturn r4 = new net.bytebuddy.implementation.bytecode.member.MethodReturn
            r5 = 2
            r6 = 174(0xae, float:2.44E-43)
            java.lang.String r7 = "FLOAT"
            r4.<init>(r7, r5, r6, r1)
            net.bytebuddy.implementation.bytecode.member.MethodReturn.FLOAT = r4
            net.bytebuddy.implementation.bytecode.member.MethodReturn r5 = new net.bytebuddy.implementation.bytecode.member.MethodReturn
            r6 = 3
            r7 = 173(0xad, float:2.42E-43)
            java.lang.String r8 = "LONG"
            r5.<init>(r8, r6, r7, r3)
            net.bytebuddy.implementation.bytecode.member.MethodReturn.LONG = r5
            net.bytebuddy.implementation.bytecode.member.MethodReturn r6 = new net.bytebuddy.implementation.bytecode.member.MethodReturn
            r3 = 177(0xb1, float:2.48E-43)
            net.bytebuddy.implementation.bytecode.StackSize r7 = net.bytebuddy.implementation.bytecode.StackSize.ZERO
            java.lang.String r8 = "VOID"
            r9 = 4
            r6.<init>(r8, r9, r3, r7)
            net.bytebuddy.implementation.bytecode.member.MethodReturn.VOID = r6
            net.bytebuddy.implementation.bytecode.member.MethodReturn r7 = new net.bytebuddy.implementation.bytecode.member.MethodReturn
            r3 = 5
            r8 = 176(0xb0, float:2.47E-43)
            java.lang.String r9 = "REFERENCE"
            r7.<init>(r9, r3, r8, r1)
            net.bytebuddy.implementation.bytecode.member.MethodReturn.REFERENCE = r7
            r1 = r2
            r2 = r4
            r3 = r5
            r4 = r6
            r5 = r7
            net.bytebuddy.implementation.bytecode.member.MethodReturn[] r0 = new net.bytebuddy.implementation.bytecode.member.MethodReturn[]{r0, r1, r2, r3, r4, r5}
            net.bytebuddy.implementation.bytecode.member.MethodReturn.$VALUES = r0
            return
    }

    MethodReturn(java.lang.String r1, int r2, int r3, net.bytebuddy.implementation.bytecode.StackSize r4) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.returnOpcode = r3
            net.bytebuddy.implementation.bytecode.StackManipulation$Size r1 = r4.toDecreasingSize()
            r0.size = r1
            return
    }

    public static net.bytebuddy.implementation.bytecode.StackManipulation of(net.bytebuddy.description.type.TypeDefinition r1) {
            boolean r0 = r1.isPrimitive()
            if (r0 == 0) goto L35
            java.lang.Class r0 = java.lang.Long.TYPE
            boolean r0 = r1.represents(r0)
            if (r0 == 0) goto L11
            net.bytebuddy.implementation.bytecode.member.MethodReturn r1 = net.bytebuddy.implementation.bytecode.member.MethodReturn.LONG
            return r1
        L11:
            java.lang.Class r0 = java.lang.Double.TYPE
            boolean r0 = r1.represents(r0)
            if (r0 == 0) goto L1c
            net.bytebuddy.implementation.bytecode.member.MethodReturn r1 = net.bytebuddy.implementation.bytecode.member.MethodReturn.DOUBLE
            return r1
        L1c:
            java.lang.Class r0 = java.lang.Float.TYPE
            boolean r0 = r1.represents(r0)
            if (r0 == 0) goto L27
            net.bytebuddy.implementation.bytecode.member.MethodReturn r1 = net.bytebuddy.implementation.bytecode.member.MethodReturn.FLOAT
            return r1
        L27:
            java.lang.Class r0 = java.lang.Void.TYPE
            boolean r1 = r1.represents(r0)
            if (r1 == 0) goto L32
            net.bytebuddy.implementation.bytecode.member.MethodReturn r1 = net.bytebuddy.implementation.bytecode.member.MethodReturn.VOID
            return r1
        L32:
            net.bytebuddy.implementation.bytecode.member.MethodReturn r1 = net.bytebuddy.implementation.bytecode.member.MethodReturn.INTEGER
            return r1
        L35:
            net.bytebuddy.implementation.bytecode.member.MethodReturn r1 = net.bytebuddy.implementation.bytecode.member.MethodReturn.REFERENCE
            return r1
    }

    public static net.bytebuddy.implementation.bytecode.member.MethodReturn valueOf(java.lang.String r1) {
            java.lang.Class<net.bytebuddy.implementation.bytecode.member.MethodReturn> r0 = net.bytebuddy.implementation.bytecode.member.MethodReturn.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            net.bytebuddy.implementation.bytecode.member.MethodReturn r1 = (net.bytebuddy.implementation.bytecode.member.MethodReturn) r1
            return r1
    }

    public static net.bytebuddy.implementation.bytecode.member.MethodReturn[] values() {
            net.bytebuddy.implementation.bytecode.member.MethodReturn[] r0 = net.bytebuddy.implementation.bytecode.member.MethodReturn.$VALUES
            java.lang.Object r0 = r0.clone()
            net.bytebuddy.implementation.bytecode.member.MethodReturn[] r0 = (net.bytebuddy.implementation.bytecode.member.MethodReturn[]) r0
            return r0
    }

    @Override // net.bytebuddy.implementation.bytecode.StackManipulation
    public net.bytebuddy.implementation.bytecode.StackManipulation.Size apply(net.bytebuddy.jar.asm.MethodVisitor r1, net.bytebuddy.implementation.Implementation.Context r2) {
            r0 = this;
            int r2 = r0.returnOpcode
            r1.visitInsn(r2)
            net.bytebuddy.implementation.bytecode.StackManipulation$Size r1 = r0.size
            return r1
    }

    @Override // net.bytebuddy.implementation.bytecode.StackManipulation
    public boolean isValid() {
            r1 = this;
            r0 = 1
            return r0
    }
}
