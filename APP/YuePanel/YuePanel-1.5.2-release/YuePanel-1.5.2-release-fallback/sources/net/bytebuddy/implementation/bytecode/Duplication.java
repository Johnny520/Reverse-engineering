package net.bytebuddy.implementation.bytecode;

/* JADX INFO: loaded from: classes2.dex */
public enum Duplication extends java.lang.Enum<net.bytebuddy.implementation.bytecode.Duplication> implements net.bytebuddy.implementation.bytecode.StackManipulation {
    private static final /* synthetic */ net.bytebuddy.implementation.bytecode.Duplication[] $VALUES = null;
    public static final net.bytebuddy.implementation.bytecode.Duplication DOUBLE = null;
    public static final net.bytebuddy.implementation.bytecode.Duplication SINGLE = null;
    public static final net.bytebuddy.implementation.bytecode.Duplication ZERO = null;
    private final int opcode;
    protected final net.bytebuddy.implementation.bytecode.StackManipulation.Size size;




    /* JADX INFO: renamed from: net.bytebuddy.implementation.bytecode.Duplication$4, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] $SwitchMap$net$bytebuddy$implementation$bytecode$StackSize = null;

        static {
                net.bytebuddy.implementation.bytecode.StackSize[] r0 = net.bytebuddy.implementation.bytecode.StackSize.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                net.bytebuddy.implementation.bytecode.Duplication.AnonymousClass4.$SwitchMap$net$bytebuddy$implementation$bytecode$StackSize = r0
                net.bytebuddy.implementation.bytecode.StackSize r1 = net.bytebuddy.implementation.bytecode.StackSize.SINGLE     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = net.bytebuddy.implementation.bytecode.Duplication.AnonymousClass4.$SwitchMap$net$bytebuddy$implementation$bytecode$StackSize     // Catch: java.lang.NoSuchFieldError -> L1d
                net.bytebuddy.implementation.bytecode.StackSize r1 = net.bytebuddy.implementation.bytecode.StackSize.DOUBLE     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = net.bytebuddy.implementation.bytecode.Duplication.AnonymousClass4.$SwitchMap$net$bytebuddy$implementation$bytecode$StackSize     // Catch: java.lang.NoSuchFieldError -> L28
                net.bytebuddy.implementation.bytecode.StackSize r1 = net.bytebuddy.implementation.bytecode.StackSize.ZERO     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                return
        }
    }

    public enum WithFlip extends java.lang.Enum<net.bytebuddy.implementation.bytecode.Duplication.WithFlip> implements net.bytebuddy.implementation.bytecode.StackManipulation {
        private static final /* synthetic */ net.bytebuddy.implementation.bytecode.Duplication.WithFlip[] $VALUES = null;
        public static final net.bytebuddy.implementation.bytecode.Duplication.WithFlip DOUBLE_DOUBLE = null;
        public static final net.bytebuddy.implementation.bytecode.Duplication.WithFlip DOUBLE_SINGLE = null;
        public static final net.bytebuddy.implementation.bytecode.Duplication.WithFlip SINGLE_DOUBLE = null;
        public static final net.bytebuddy.implementation.bytecode.Duplication.WithFlip SINGLE_SINGLE = null;
        private final int opcode;
        private final net.bytebuddy.implementation.bytecode.StackSize stackSize;

        static {
                net.bytebuddy.implementation.bytecode.Duplication$WithFlip r0 = new net.bytebuddy.implementation.bytecode.Duplication$WithFlip
                net.bytebuddy.implementation.bytecode.StackSize r1 = net.bytebuddy.implementation.bytecode.StackSize.SINGLE
                java.lang.String r2 = "SINGLE_SINGLE"
                r3 = 0
                r4 = 90
                r0.<init>(r2, r3, r4, r1)
                net.bytebuddy.implementation.bytecode.Duplication.WithFlip.SINGLE_SINGLE = r0
                net.bytebuddy.implementation.bytecode.Duplication$WithFlip r2 = new net.bytebuddy.implementation.bytecode.Duplication$WithFlip
                r3 = 1
                r4 = 91
                java.lang.String r5 = "SINGLE_DOUBLE"
                r2.<init>(r5, r3, r4, r1)
                net.bytebuddy.implementation.bytecode.Duplication.WithFlip.SINGLE_DOUBLE = r2
                net.bytebuddy.implementation.bytecode.Duplication$WithFlip r1 = new net.bytebuddy.implementation.bytecode.Duplication$WithFlip
                net.bytebuddy.implementation.bytecode.StackSize r3 = net.bytebuddy.implementation.bytecode.StackSize.DOUBLE
                java.lang.String r4 = "DOUBLE_SINGLE"
                r5 = 2
                r6 = 93
                r1.<init>(r4, r5, r6, r3)
                net.bytebuddy.implementation.bytecode.Duplication.WithFlip.DOUBLE_SINGLE = r1
                net.bytebuddy.implementation.bytecode.Duplication$WithFlip r4 = new net.bytebuddy.implementation.bytecode.Duplication$WithFlip
                r5 = 3
                r6 = 94
                java.lang.String r7 = "DOUBLE_DOUBLE"
                r4.<init>(r7, r5, r6, r3)
                net.bytebuddy.implementation.bytecode.Duplication.WithFlip.DOUBLE_DOUBLE = r4
                net.bytebuddy.implementation.bytecode.Duplication$WithFlip[] r0 = new net.bytebuddy.implementation.bytecode.Duplication.WithFlip[]{r0, r2, r1, r4}
                net.bytebuddy.implementation.bytecode.Duplication.WithFlip.$VALUES = r0
                return
        }

        WithFlip(java.lang.String r1, int r2, int r3, net.bytebuddy.implementation.bytecode.StackSize r4) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.opcode = r3
                r0.stackSize = r4
                return
        }

        public static net.bytebuddy.implementation.bytecode.Duplication.WithFlip valueOf(java.lang.String r1) {
                java.lang.Class<net.bytebuddy.implementation.bytecode.Duplication$WithFlip> r0 = net.bytebuddy.implementation.bytecode.Duplication.WithFlip.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                net.bytebuddy.implementation.bytecode.Duplication$WithFlip r1 = (net.bytebuddy.implementation.bytecode.Duplication.WithFlip) r1
                return r1
        }

        public static net.bytebuddy.implementation.bytecode.Duplication.WithFlip[] values() {
                net.bytebuddy.implementation.bytecode.Duplication$WithFlip[] r0 = net.bytebuddy.implementation.bytecode.Duplication.WithFlip.$VALUES
                java.lang.Object r0 = r0.clone()
                net.bytebuddy.implementation.bytecode.Duplication$WithFlip[] r0 = (net.bytebuddy.implementation.bytecode.Duplication.WithFlip[]) r0
                return r0
        }

        @Override // net.bytebuddy.implementation.bytecode.StackManipulation
        public net.bytebuddy.implementation.bytecode.StackManipulation.Size apply(net.bytebuddy.jar.asm.MethodVisitor r1, net.bytebuddy.implementation.Implementation.Context r2) {
                r0 = this;
                int r2 = r0.opcode
                r1.visitInsn(r2)
                net.bytebuddy.implementation.bytecode.StackSize r1 = r0.stackSize
                net.bytebuddy.implementation.bytecode.StackManipulation$Size r1 = r1.toIncreasingSize()
                return r1
        }

        @Override // net.bytebuddy.implementation.bytecode.StackManipulation
        public boolean isValid() {
                r1 = this;
                r0 = 1
                return r0
        }
    }

    static {
            net.bytebuddy.implementation.bytecode.Duplication$1 r0 = new net.bytebuddy.implementation.bytecode.Duplication$1
            r1 = 0
            net.bytebuddy.implementation.bytecode.StackSize r2 = net.bytebuddy.implementation.bytecode.StackSize.ZERO
            java.lang.String r3 = "ZERO"
            r0.<init>(r3, r1, r2, r1)
            net.bytebuddy.implementation.bytecode.Duplication.ZERO = r0
            net.bytebuddy.implementation.bytecode.Duplication$2 r2 = new net.bytebuddy.implementation.bytecode.Duplication$2
            net.bytebuddy.implementation.bytecode.StackSize r3 = net.bytebuddy.implementation.bytecode.StackSize.SINGLE
            r4 = 89
            java.lang.String r5 = "SINGLE"
            r6 = 1
            r2.<init>(r5, r6, r3, r4)
            net.bytebuddy.implementation.bytecode.Duplication.SINGLE = r2
            net.bytebuddy.implementation.bytecode.Duplication$3 r3 = new net.bytebuddy.implementation.bytecode.Duplication$3
            net.bytebuddy.implementation.bytecode.StackSize r4 = net.bytebuddy.implementation.bytecode.StackSize.DOUBLE
            r5 = 92
            java.lang.String r7 = "DOUBLE"
            r8 = 2
            r3.<init>(r7, r8, r4, r5)
            net.bytebuddy.implementation.bytecode.Duplication.DOUBLE = r3
            r4 = 3
            net.bytebuddy.implementation.bytecode.Duplication[] r4 = new net.bytebuddy.implementation.bytecode.Duplication[r4]
            r4[r1] = r0
            r4[r6] = r2
            r4[r8] = r3
            net.bytebuddy.implementation.bytecode.Duplication.$VALUES = r4
            return
    }

    Duplication(java.lang.String r1, int r2, net.bytebuddy.implementation.bytecode.StackSize r3, int r4) {
            r0 = this;
            r0.<init>(r1, r2)
            net.bytebuddy.implementation.bytecode.StackManipulation$Size r1 = r3.toIncreasingSize()
            r0.size = r1
            r0.opcode = r4
            return
    }

    /* synthetic */ Duplication(java.lang.String r1, int r2, net.bytebuddy.implementation.bytecode.StackSize r3, int r4, net.bytebuddy.implementation.bytecode.Duplication.AnonymousClass1 r5) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            return
    }

    public static net.bytebuddy.implementation.bytecode.Duplication of(net.bytebuddy.description.type.TypeDefinition r3) {
            int[] r0 = net.bytebuddy.implementation.bytecode.Duplication.AnonymousClass4.$SwitchMap$net$bytebuddy$implementation$bytecode$StackSize
            net.bytebuddy.implementation.bytecode.StackSize r1 = r3.getStackSize()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L32
            r1 = 2
            if (r0 == r1) goto L2f
            r1 = 3
            if (r0 != r1) goto L18
            net.bytebuddy.implementation.bytecode.Duplication r3 = net.bytebuddy.implementation.bytecode.Duplication.ZERO
            return r3
        L18:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unexpected type: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L2f:
            net.bytebuddy.implementation.bytecode.Duplication r3 = net.bytebuddy.implementation.bytecode.Duplication.DOUBLE
            return r3
        L32:
            net.bytebuddy.implementation.bytecode.Duplication r3 = net.bytebuddy.implementation.bytecode.Duplication.SINGLE
            return r3
    }

    public static net.bytebuddy.implementation.bytecode.Duplication valueOf(java.lang.String r1) {
            java.lang.Class<net.bytebuddy.implementation.bytecode.Duplication> r0 = net.bytebuddy.implementation.bytecode.Duplication.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            net.bytebuddy.implementation.bytecode.Duplication r1 = (net.bytebuddy.implementation.bytecode.Duplication) r1
            return r1
    }

    public static net.bytebuddy.implementation.bytecode.Duplication[] values() {
            net.bytebuddy.implementation.bytecode.Duplication[] r0 = net.bytebuddy.implementation.bytecode.Duplication.$VALUES
            java.lang.Object r0 = r0.clone()
            net.bytebuddy.implementation.bytecode.Duplication[] r0 = (net.bytebuddy.implementation.bytecode.Duplication[]) r0
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

    public abstract net.bytebuddy.implementation.bytecode.StackManipulation flipOver(net.bytebuddy.description.type.TypeDefinition r1);

    @Override // net.bytebuddy.implementation.bytecode.StackManipulation
    public boolean isValid() {
            r1 = this;
            r0 = 1
            return r0
    }
}
