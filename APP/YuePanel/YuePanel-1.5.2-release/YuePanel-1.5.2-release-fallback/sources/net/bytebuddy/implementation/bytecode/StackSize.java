package net.bytebuddy.implementation.bytecode;

/* JADX INFO: loaded from: classes2.dex */
public enum StackSize extends java.lang.Enum<net.bytebuddy.implementation.bytecode.StackSize> {
    private static final /* synthetic */ net.bytebuddy.implementation.bytecode.StackSize[] $VALUES = null;
    public static final net.bytebuddy.implementation.bytecode.StackSize DOUBLE = null;
    public static final net.bytebuddy.implementation.bytecode.StackSize SINGLE = null;
    public static final net.bytebuddy.implementation.bytecode.StackSize ZERO = null;
    private final int size;

    /* JADX INFO: renamed from: net.bytebuddy.implementation.bytecode.StackSize$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$net$bytebuddy$implementation$bytecode$StackSize = null;

        static {
                net.bytebuddy.implementation.bytecode.StackSize[] r0 = net.bytebuddy.implementation.bytecode.StackSize.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                net.bytebuddy.implementation.bytecode.StackSize.AnonymousClass1.$SwitchMap$net$bytebuddy$implementation$bytecode$StackSize = r0
                net.bytebuddy.implementation.bytecode.StackSize r1 = net.bytebuddy.implementation.bytecode.StackSize.DOUBLE     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = net.bytebuddy.implementation.bytecode.StackSize.AnonymousClass1.$SwitchMap$net$bytebuddy$implementation$bytecode$StackSize     // Catch: java.lang.NoSuchFieldError -> L1d
                net.bytebuddy.implementation.bytecode.StackSize r1 = net.bytebuddy.implementation.bytecode.StackSize.SINGLE     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = net.bytebuddy.implementation.bytecode.StackSize.AnonymousClass1.$SwitchMap$net$bytebuddy$implementation$bytecode$StackSize     // Catch: java.lang.NoSuchFieldError -> L28
                net.bytebuddy.implementation.bytecode.StackSize r1 = net.bytebuddy.implementation.bytecode.StackSize.ZERO     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                return
        }
    }

    static {
            net.bytebuddy.implementation.bytecode.StackSize r0 = new net.bytebuddy.implementation.bytecode.StackSize
            java.lang.String r1 = "ZERO"
            r2 = 0
            r0.<init>(r1, r2, r2)
            net.bytebuddy.implementation.bytecode.StackSize.ZERO = r0
            net.bytebuddy.implementation.bytecode.StackSize r1 = new net.bytebuddy.implementation.bytecode.StackSize
            java.lang.String r2 = "SINGLE"
            r3 = 1
            r1.<init>(r2, r3, r3)
            net.bytebuddy.implementation.bytecode.StackSize.SINGLE = r1
            net.bytebuddy.implementation.bytecode.StackSize r2 = new net.bytebuddy.implementation.bytecode.StackSize
            java.lang.String r3 = "DOUBLE"
            r4 = 2
            r2.<init>(r3, r4, r4)
            net.bytebuddy.implementation.bytecode.StackSize.DOUBLE = r2
            net.bytebuddy.implementation.bytecode.StackSize[] r0 = new net.bytebuddy.implementation.bytecode.StackSize[]{r0, r1, r2}
            net.bytebuddy.implementation.bytecode.StackSize.$VALUES = r0
            return
    }

    StackSize(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.size = r3
            return
    }

    public static int of(java.util.Collection<? extends net.bytebuddy.description.type.TypeDefinition> r2) {
            java.util.Iterator r2 = r2.iterator()
            r0 = 0
        L5:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L1b
            java.lang.Object r1 = r2.next()
            net.bytebuddy.description.type.TypeDefinition r1 = (net.bytebuddy.description.type.TypeDefinition) r1
            net.bytebuddy.implementation.bytecode.StackSize r1 = r1.getStackSize()
            int r1 = r1.getSize()
            int r0 = r0 + r1
            goto L5
        L1b:
            return r0
    }

    public static int of(net.bytebuddy.description.type.TypeDefinition... r0) {
            java.util.List r0 = java.util.Arrays.asList(r0)
            int r0 = of(r0)
            return r0
    }

    public static net.bytebuddy.implementation.bytecode.StackSize of(int r3) {
            if (r3 == 0) goto L25
            r0 = 1
            if (r3 == r0) goto L22
            r0 = 2
            if (r3 != r0) goto Lb
            net.bytebuddy.implementation.bytecode.StackSize r3 = net.bytebuddy.implementation.bytecode.StackSize.DOUBLE
            return r3
        Lb:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unexpected stack size value: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L22:
            net.bytebuddy.implementation.bytecode.StackSize r3 = net.bytebuddy.implementation.bytecode.StackSize.SINGLE
            return r3
        L25:
            net.bytebuddy.implementation.bytecode.StackSize r3 = net.bytebuddy.implementation.bytecode.StackSize.ZERO
            return r3
    }

    public static net.bytebuddy.implementation.bytecode.StackSize of(java.lang.Class<?> r1) {
            java.lang.Class r0 = java.lang.Void.TYPE
            if (r1 != r0) goto L7
            net.bytebuddy.implementation.bytecode.StackSize r1 = net.bytebuddy.implementation.bytecode.StackSize.ZERO
            return r1
        L7:
            java.lang.Class r0 = java.lang.Double.TYPE
            if (r1 == r0) goto L13
            java.lang.Class r0 = java.lang.Long.TYPE
            if (r1 != r0) goto L10
            goto L13
        L10:
            net.bytebuddy.implementation.bytecode.StackSize r1 = net.bytebuddy.implementation.bytecode.StackSize.SINGLE
            return r1
        L13:
            net.bytebuddy.implementation.bytecode.StackSize r1 = net.bytebuddy.implementation.bytecode.StackSize.DOUBLE
            return r1
    }

    public static net.bytebuddy.implementation.bytecode.StackSize valueOf(java.lang.String r1) {
            java.lang.Class<net.bytebuddy.implementation.bytecode.StackSize> r0 = net.bytebuddy.implementation.bytecode.StackSize.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            net.bytebuddy.implementation.bytecode.StackSize r1 = (net.bytebuddy.implementation.bytecode.StackSize) r1
            return r1
    }

    public static net.bytebuddy.implementation.bytecode.StackSize[] values() {
            net.bytebuddy.implementation.bytecode.StackSize[] r0 = net.bytebuddy.implementation.bytecode.StackSize.$VALUES
            java.lang.Object r0 = r0.clone()
            net.bytebuddy.implementation.bytecode.StackSize[] r0 = (net.bytebuddy.implementation.bytecode.StackSize[]) r0
            return r0
    }

    public int getSize() {
            r1 = this;
            int r0 = r1.size
            return r0
    }

    public net.bytebuddy.implementation.bytecode.StackSize maximum(net.bytebuddy.implementation.bytecode.StackSize r6) {
            r5 = this;
            int[] r0 = net.bytebuddy.implementation.bytecode.StackSize.AnonymousClass1.$SwitchMap$net$bytebuddy$implementation$bytecode$StackSize
            int r1 = r5.ordinal()
            r1 = r0[r1]
            r2 = 1
            if (r1 == r2) goto L2d
            r3 = 3
            r4 = 2
            if (r1 == r4) goto L18
            if (r1 != r3) goto L12
            return r6
        L12:
            java.lang.AssertionError r6 = new java.lang.AssertionError
            r6.<init>()
            throw r6
        L18:
            int r1 = r6.ordinal()
            r0 = r0[r1]
            if (r0 == r2) goto L2c
            if (r0 == r4) goto L2b
            if (r0 != r3) goto L25
            goto L2b
        L25:
            java.lang.AssertionError r6 = new java.lang.AssertionError
            r6.<init>()
            throw r6
        L2b:
            return r5
        L2c:
            return r6
        L2d:
            return r5
    }

    public net.bytebuddy.implementation.bytecode.StackManipulation.Size toDecreasingSize() {
            r3 = this;
            net.bytebuddy.implementation.bytecode.StackManipulation$Size r0 = new net.bytebuddy.implementation.bytecode.StackManipulation$Size
            int r1 = r3.getSize()
            int r1 = r1 * (-1)
            r2 = 0
            r0.<init>(r1, r2)
            return r0
    }

    public net.bytebuddy.implementation.bytecode.StackManipulation.Size toIncreasingSize() {
            r3 = this;
            net.bytebuddy.implementation.bytecode.StackManipulation$Size r0 = new net.bytebuddy.implementation.bytecode.StackManipulation$Size
            int r1 = r3.getSize()
            int r2 = r3.getSize()
            r0.<init>(r1, r2)
            return r0
    }
}
