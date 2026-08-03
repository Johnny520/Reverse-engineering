package net.bytebuddy.implementation.bytecode;

/* JADX INFO: loaded from: classes2.dex */
public enum Removal extends java.lang.Enum<net.bytebuddy.implementation.bytecode.Removal> implements net.bytebuddy.implementation.bytecode.StackManipulation {
    private static final /* synthetic */ net.bytebuddy.implementation.bytecode.Removal[] $VALUES = null;
    public static final net.bytebuddy.implementation.bytecode.Removal DOUBLE = null;
    public static final net.bytebuddy.implementation.bytecode.Removal SINGLE = null;
    public static final net.bytebuddy.implementation.bytecode.Removal ZERO = null;
    private final int opcode;
    private final net.bytebuddy.implementation.bytecode.StackManipulation.Size size;


    /* JADX INFO: renamed from: net.bytebuddy.implementation.bytecode.Removal$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$net$bytebuddy$implementation$bytecode$StackSize = null;

        static {
                net.bytebuddy.implementation.bytecode.StackSize[] r0 = net.bytebuddy.implementation.bytecode.StackSize.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                net.bytebuddy.implementation.bytecode.Removal.AnonymousClass2.$SwitchMap$net$bytebuddy$implementation$bytecode$StackSize = r0
                net.bytebuddy.implementation.bytecode.StackSize r1 = net.bytebuddy.implementation.bytecode.StackSize.SINGLE     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = net.bytebuddy.implementation.bytecode.Removal.AnonymousClass2.$SwitchMap$net$bytebuddy$implementation$bytecode$StackSize     // Catch: java.lang.NoSuchFieldError -> L1d
                net.bytebuddy.implementation.bytecode.StackSize r1 = net.bytebuddy.implementation.bytecode.StackSize.DOUBLE     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = net.bytebuddy.implementation.bytecode.Removal.AnonymousClass2.$SwitchMap$net$bytebuddy$implementation$bytecode$StackSize     // Catch: java.lang.NoSuchFieldError -> L28
                net.bytebuddy.implementation.bytecode.StackSize r1 = net.bytebuddy.implementation.bytecode.StackSize.ZERO     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                return
        }
    }

    static {
            net.bytebuddy.implementation.bytecode.Removal$1 r0 = new net.bytebuddy.implementation.bytecode.Removal$1
            r1 = 0
            net.bytebuddy.implementation.bytecode.StackSize r2 = net.bytebuddy.implementation.bytecode.StackSize.ZERO
            java.lang.String r3 = "ZERO"
            r0.<init>(r3, r1, r2, r1)
            net.bytebuddy.implementation.bytecode.Removal.ZERO = r0
            net.bytebuddy.implementation.bytecode.Removal r2 = new net.bytebuddy.implementation.bytecode.Removal
            net.bytebuddy.implementation.bytecode.StackSize r3 = net.bytebuddy.implementation.bytecode.StackSize.SINGLE
            r4 = 87
            java.lang.String r5 = "SINGLE"
            r6 = 1
            r2.<init>(r5, r6, r3, r4)
            net.bytebuddy.implementation.bytecode.Removal.SINGLE = r2
            net.bytebuddy.implementation.bytecode.Removal r3 = new net.bytebuddy.implementation.bytecode.Removal
            net.bytebuddy.implementation.bytecode.StackSize r4 = net.bytebuddy.implementation.bytecode.StackSize.DOUBLE
            r5 = 88
            java.lang.String r7 = "DOUBLE"
            r8 = 2
            r3.<init>(r7, r8, r4, r5)
            net.bytebuddy.implementation.bytecode.Removal.DOUBLE = r3
            r4 = 3
            net.bytebuddy.implementation.bytecode.Removal[] r4 = new net.bytebuddy.implementation.bytecode.Removal[r4]
            r4[r1] = r0
            r4[r6] = r2
            r4[r8] = r3
            net.bytebuddy.implementation.bytecode.Removal.$VALUES = r4
            return
    }

    Removal(java.lang.String r1, int r2, net.bytebuddy.implementation.bytecode.StackSize r3, int r4) {
            r0 = this;
            r0.<init>(r1, r2)
            net.bytebuddy.implementation.bytecode.StackManipulation$Size r1 = r3.toDecreasingSize()
            r0.size = r1
            r0.opcode = r4
            return
    }

    /* synthetic */ Removal(java.lang.String r1, int r2, net.bytebuddy.implementation.bytecode.StackSize r3, int r4, net.bytebuddy.implementation.bytecode.Removal.AnonymousClass1 r5) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            return
    }

    public static net.bytebuddy.implementation.bytecode.StackManipulation of(net.bytebuddy.description.type.TypeDefinition r1) {
            int[] r0 = net.bytebuddy.implementation.bytecode.Removal.AnonymousClass2.$SwitchMap$net$bytebuddy$implementation$bytecode$StackSize
            net.bytebuddy.implementation.bytecode.StackSize r1 = r1.getStackSize()
            int r1 = r1.ordinal()
            r1 = r0[r1]
            r0 = 1
            if (r1 == r0) goto L21
            r0 = 2
            if (r1 == r0) goto L1e
            r0 = 3
            if (r1 != r0) goto L18
            net.bytebuddy.implementation.bytecode.Removal r1 = net.bytebuddy.implementation.bytecode.Removal.ZERO
            return r1
        L18:
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>()
            throw r1
        L1e:
            net.bytebuddy.implementation.bytecode.Removal r1 = net.bytebuddy.implementation.bytecode.Removal.DOUBLE
            return r1
        L21:
            net.bytebuddy.implementation.bytecode.Removal r1 = net.bytebuddy.implementation.bytecode.Removal.SINGLE
            return r1
    }

    public static net.bytebuddy.implementation.bytecode.Removal valueOf(java.lang.String r1) {
            java.lang.Class<net.bytebuddy.implementation.bytecode.Removal> r0 = net.bytebuddy.implementation.bytecode.Removal.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            net.bytebuddy.implementation.bytecode.Removal r1 = (net.bytebuddy.implementation.bytecode.Removal) r1
            return r1
    }

    public static net.bytebuddy.implementation.bytecode.Removal[] values() {
            net.bytebuddy.implementation.bytecode.Removal[] r0 = net.bytebuddy.implementation.bytecode.Removal.$VALUES
            java.lang.Object r0 = r0.clone()
            net.bytebuddy.implementation.bytecode.Removal[] r0 = (net.bytebuddy.implementation.bytecode.Removal[]) r0
            return r0
    }

    @Override // net.bytebuddy.implementation.bytecode.StackManipulation
    public net.bytebuddy.implementation.bytecode.StackManipulation.Size apply(net.bytebuddy.jar.asm.MethodVisitor r1, net.bytebuddy.implementation.Implementation.Context r2) {
            r0 = this;
            int r2 = r0.opcode
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
