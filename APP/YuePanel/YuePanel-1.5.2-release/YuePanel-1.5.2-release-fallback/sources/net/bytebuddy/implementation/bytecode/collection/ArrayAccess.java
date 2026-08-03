package net.bytebuddy.implementation.bytecode.collection;

/* JADX INFO: loaded from: classes2.dex */
public enum ArrayAccess extends java.lang.Enum<net.bytebuddy.implementation.bytecode.collection.ArrayAccess> {
    private static final /* synthetic */ net.bytebuddy.implementation.bytecode.collection.ArrayAccess[] $VALUES = null;
    public static final net.bytebuddy.implementation.bytecode.collection.ArrayAccess BYTE = null;
    public static final net.bytebuddy.implementation.bytecode.collection.ArrayAccess CHARACTER = null;
    public static final net.bytebuddy.implementation.bytecode.collection.ArrayAccess DOUBLE = null;
    public static final net.bytebuddy.implementation.bytecode.collection.ArrayAccess FLOAT = null;
    public static final net.bytebuddy.implementation.bytecode.collection.ArrayAccess INTEGER = null;
    public static final net.bytebuddy.implementation.bytecode.collection.ArrayAccess LONG = null;
    public static final net.bytebuddy.implementation.bytecode.collection.ArrayAccess REFERENCE = null;
    public static final net.bytebuddy.implementation.bytecode.collection.ArrayAccess SHORT = null;
    private final int loadOpcode;
    private final net.bytebuddy.implementation.bytecode.StackSize stackSize;
    private final int storeOpcode;

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
    public class Loader extends net.bytebuddy.implementation.bytecode.StackManipulation.AbstractBase {
        final /* synthetic */ net.bytebuddy.implementation.bytecode.collection.ArrayAccess this$0;

        public Loader(net.bytebuddy.implementation.bytecode.collection.ArrayAccess r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // net.bytebuddy.implementation.bytecode.StackManipulation
        public net.bytebuddy.implementation.bytecode.StackManipulation.Size apply(net.bytebuddy.jar.asm.MethodVisitor r3, net.bytebuddy.implementation.Implementation.Context r4) {
                r2 = this;
                net.bytebuddy.implementation.bytecode.collection.ArrayAccess r4 = r2.this$0
                int r4 = net.bytebuddy.implementation.bytecode.collection.ArrayAccess.access$000(r4)
                r3.visitInsn(r4)
                net.bytebuddy.implementation.bytecode.collection.ArrayAccess r3 = r2.this$0
                net.bytebuddy.implementation.bytecode.StackSize r3 = net.bytebuddy.implementation.bytecode.collection.ArrayAccess.access$100(r3)
                net.bytebuddy.implementation.bytecode.StackManipulation$Size r3 = r3.toIncreasingSize()
                net.bytebuddy.implementation.bytecode.StackManipulation$Size r4 = new net.bytebuddy.implementation.bytecode.StackManipulation$Size
                r0 = -2
                r1 = 0
                r4.<init>(r0, r1)
                net.bytebuddy.implementation.bytecode.StackManipulation$Size r3 = r3.aggregate(r4)
                return r3
        }

        public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                r1 = 0
                if (r5 != 0) goto L8
                return r1
            L8:
                java.lang.Class r2 = r4.getClass()
                java.lang.Class r3 = r5.getClass()
                if (r2 == r3) goto L13
                return r1
            L13:
                net.bytebuddy.implementation.bytecode.collection.ArrayAccess r2 = r4.this$0
                net.bytebuddy.implementation.bytecode.collection.ArrayAccess$Loader r5 = (net.bytebuddy.implementation.bytecode.collection.ArrayAccess.Loader) r5
                net.bytebuddy.implementation.bytecode.collection.ArrayAccess r5 = r5.this$0
                boolean r5 = r2.equals(r5)
                if (r5 != 0) goto L20
                return r1
            L20:
                return r0
        }

        public int hashCode() {
                r2 = this;
                java.lang.Class r0 = r2.getClass()
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                net.bytebuddy.implementation.bytecode.collection.ArrayAccess r1 = r2.this$0
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }
    }

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
    public class Putter extends net.bytebuddy.implementation.bytecode.StackManipulation.AbstractBase {
        final /* synthetic */ net.bytebuddy.implementation.bytecode.collection.ArrayAccess this$0;

        public Putter(net.bytebuddy.implementation.bytecode.collection.ArrayAccess r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // net.bytebuddy.implementation.bytecode.StackManipulation
        public net.bytebuddy.implementation.bytecode.StackManipulation.Size apply(net.bytebuddy.jar.asm.MethodVisitor r3, net.bytebuddy.implementation.Implementation.Context r4) {
                r2 = this;
                net.bytebuddy.implementation.bytecode.collection.ArrayAccess r4 = r2.this$0
                int r4 = net.bytebuddy.implementation.bytecode.collection.ArrayAccess.access$200(r4)
                r3.visitInsn(r4)
                net.bytebuddy.implementation.bytecode.collection.ArrayAccess r3 = r2.this$0
                net.bytebuddy.implementation.bytecode.StackSize r3 = net.bytebuddy.implementation.bytecode.collection.ArrayAccess.access$100(r3)
                net.bytebuddy.implementation.bytecode.StackManipulation$Size r3 = r3.toDecreasingSize()
                net.bytebuddy.implementation.bytecode.StackManipulation$Size r4 = new net.bytebuddy.implementation.bytecode.StackManipulation$Size
                r0 = -2
                r1 = 0
                r4.<init>(r0, r1)
                net.bytebuddy.implementation.bytecode.StackManipulation$Size r3 = r3.aggregate(r4)
                return r3
        }

        public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                r1 = 0
                if (r5 != 0) goto L8
                return r1
            L8:
                java.lang.Class r2 = r4.getClass()
                java.lang.Class r3 = r5.getClass()
                if (r2 == r3) goto L13
                return r1
            L13:
                net.bytebuddy.implementation.bytecode.collection.ArrayAccess r2 = r4.this$0
                net.bytebuddy.implementation.bytecode.collection.ArrayAccess$Putter r5 = (net.bytebuddy.implementation.bytecode.collection.ArrayAccess.Putter) r5
                net.bytebuddy.implementation.bytecode.collection.ArrayAccess r5 = r5.this$0
                boolean r5 = r2.equals(r5)
                if (r5 != 0) goto L20
                return r1
            L20:
                return r0
        }

        public int hashCode() {
                r2 = this;
                java.lang.Class r0 = r2.getClass()
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                net.bytebuddy.implementation.bytecode.collection.ArrayAccess r1 = r2.this$0
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }
    }

    static {
            net.bytebuddy.implementation.bytecode.collection.ArrayAccess r6 = new net.bytebuddy.implementation.bytecode.collection.ArrayAccess
            net.bytebuddy.implementation.bytecode.StackSize r7 = net.bytebuddy.implementation.bytecode.StackSize.SINGLE
            java.lang.String r1 = "BYTE"
            r2 = 0
            r3 = 51
            r4 = 84
            r0 = r6
            r5 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            net.bytebuddy.implementation.bytecode.collection.ArrayAccess.BYTE = r6
            net.bytebuddy.implementation.bytecode.collection.ArrayAccess r8 = new net.bytebuddy.implementation.bytecode.collection.ArrayAccess
            r3 = 53
            r4 = 86
            java.lang.String r1 = "SHORT"
            r2 = 1
            r0 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            net.bytebuddy.implementation.bytecode.collection.ArrayAccess.SHORT = r8
            net.bytebuddy.implementation.bytecode.collection.ArrayAccess r9 = new net.bytebuddy.implementation.bytecode.collection.ArrayAccess
            r3 = 52
            r4 = 85
            java.lang.String r1 = "CHARACTER"
            r2 = 2
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            net.bytebuddy.implementation.bytecode.collection.ArrayAccess.CHARACTER = r9
            net.bytebuddy.implementation.bytecode.collection.ArrayAccess r10 = new net.bytebuddy.implementation.bytecode.collection.ArrayAccess
            r3 = 46
            r4 = 79
            java.lang.String r1 = "INTEGER"
            r2 = 3
            r0 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            net.bytebuddy.implementation.bytecode.collection.ArrayAccess.INTEGER = r10
            net.bytebuddy.implementation.bytecode.collection.ArrayAccess r17 = new net.bytebuddy.implementation.bytecode.collection.ArrayAccess
            net.bytebuddy.implementation.bytecode.StackSize r18 = net.bytebuddy.implementation.bytecode.StackSize.DOUBLE
            java.lang.String r12 = "LONG"
            r13 = 4
            r14 = 47
            r15 = 80
            r11 = r17
            r16 = r18
            r11.<init>(r12, r13, r14, r15, r16)
            net.bytebuddy.implementation.bytecode.collection.ArrayAccess.LONG = r17
            net.bytebuddy.implementation.bytecode.collection.ArrayAccess r11 = new net.bytebuddy.implementation.bytecode.collection.ArrayAccess
            r3 = 48
            r4 = 81
            java.lang.String r1 = "FLOAT"
            r2 = 5
            r0 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            net.bytebuddy.implementation.bytecode.collection.ArrayAccess.FLOAT = r11
            net.bytebuddy.implementation.bytecode.collection.ArrayAccess r12 = new net.bytebuddy.implementation.bytecode.collection.ArrayAccess
            r3 = 49
            r4 = 82
            java.lang.String r1 = "DOUBLE"
            r2 = 6
            r0 = r12
            r5 = r18
            r0.<init>(r1, r2, r3, r4, r5)
            net.bytebuddy.implementation.bytecode.collection.ArrayAccess.DOUBLE = r12
            net.bytebuddy.implementation.bytecode.collection.ArrayAccess r13 = new net.bytebuddy.implementation.bytecode.collection.ArrayAccess
            r3 = 50
            r4 = 83
            java.lang.String r1 = "REFERENCE"
            r2 = 7
            r0 = r13
            r5 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            net.bytebuddy.implementation.bytecode.collection.ArrayAccess.REFERENCE = r13
            r0 = r6
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r17
            r5 = r11
            r6 = r12
            r7 = r13
            net.bytebuddy.implementation.bytecode.collection.ArrayAccess[] r0 = new net.bytebuddy.implementation.bytecode.collection.ArrayAccess[]{r0, r1, r2, r3, r4, r5, r6, r7}
            net.bytebuddy.implementation.bytecode.collection.ArrayAccess.$VALUES = r0
            return
    }

    ArrayAccess(java.lang.String r1, int r2, int r3, int r4, net.bytebuddy.implementation.bytecode.StackSize r5) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.loadOpcode = r3
            r0.storeOpcode = r4
            r0.stackSize = r5
            return
    }

    public static /* synthetic */ int access$000(net.bytebuddy.implementation.bytecode.collection.ArrayAccess r0) {
            int r0 = r0.loadOpcode
            return r0
    }

    public static /* synthetic */ net.bytebuddy.implementation.bytecode.StackSize access$100(net.bytebuddy.implementation.bytecode.collection.ArrayAccess r0) {
            net.bytebuddy.implementation.bytecode.StackSize r0 = r0.stackSize
            return r0
    }

    public static /* synthetic */ int access$200(net.bytebuddy.implementation.bytecode.collection.ArrayAccess r0) {
            int r0 = r0.storeOpcode
            return r0
    }

    public static net.bytebuddy.implementation.bytecode.collection.ArrayAccess of(net.bytebuddy.description.type.TypeDefinition r3) {
            boolean r0 = r3.isPrimitive()
            if (r0 != 0) goto L9
            net.bytebuddy.implementation.bytecode.collection.ArrayAccess r3 = net.bytebuddy.implementation.bytecode.collection.ArrayAccess.REFERENCE
            return r3
        L9:
            java.lang.Class r0 = java.lang.Boolean.TYPE
            boolean r0 = r3.represents(r0)
            if (r0 != 0) goto L73
            java.lang.Class r0 = java.lang.Byte.TYPE
            boolean r0 = r3.represents(r0)
            if (r0 == 0) goto L1a
            goto L73
        L1a:
            java.lang.Class r0 = java.lang.Short.TYPE
            boolean r0 = r3.represents(r0)
            if (r0 == 0) goto L25
            net.bytebuddy.implementation.bytecode.collection.ArrayAccess r3 = net.bytebuddy.implementation.bytecode.collection.ArrayAccess.SHORT
            return r3
        L25:
            java.lang.Class r0 = java.lang.Character.TYPE
            boolean r0 = r3.represents(r0)
            if (r0 == 0) goto L30
            net.bytebuddy.implementation.bytecode.collection.ArrayAccess r3 = net.bytebuddy.implementation.bytecode.collection.ArrayAccess.CHARACTER
            return r3
        L30:
            java.lang.Class r0 = java.lang.Integer.TYPE
            boolean r0 = r3.represents(r0)
            if (r0 == 0) goto L3b
            net.bytebuddy.implementation.bytecode.collection.ArrayAccess r3 = net.bytebuddy.implementation.bytecode.collection.ArrayAccess.INTEGER
            return r3
        L3b:
            java.lang.Class r0 = java.lang.Long.TYPE
            boolean r0 = r3.represents(r0)
            if (r0 == 0) goto L46
            net.bytebuddy.implementation.bytecode.collection.ArrayAccess r3 = net.bytebuddy.implementation.bytecode.collection.ArrayAccess.LONG
            return r3
        L46:
            java.lang.Class r0 = java.lang.Float.TYPE
            boolean r0 = r3.represents(r0)
            if (r0 == 0) goto L51
            net.bytebuddy.implementation.bytecode.collection.ArrayAccess r3 = net.bytebuddy.implementation.bytecode.collection.ArrayAccess.FLOAT
            return r3
        L51:
            java.lang.Class r0 = java.lang.Double.TYPE
            boolean r0 = r3.represents(r0)
            if (r0 == 0) goto L5c
            net.bytebuddy.implementation.bytecode.collection.ArrayAccess r3 = net.bytebuddy.implementation.bytecode.collection.ArrayAccess.DOUBLE
            return r3
        L5c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Not a legal array type: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L73:
            net.bytebuddy.implementation.bytecode.collection.ArrayAccess r3 = net.bytebuddy.implementation.bytecode.collection.ArrayAccess.BYTE
            return r3
    }

    public static net.bytebuddy.implementation.bytecode.collection.ArrayAccess valueOf(java.lang.String r1) {
            java.lang.Class<net.bytebuddy.implementation.bytecode.collection.ArrayAccess> r0 = net.bytebuddy.implementation.bytecode.collection.ArrayAccess.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            net.bytebuddy.implementation.bytecode.collection.ArrayAccess r1 = (net.bytebuddy.implementation.bytecode.collection.ArrayAccess) r1
            return r1
    }

    public static net.bytebuddy.implementation.bytecode.collection.ArrayAccess[] values() {
            net.bytebuddy.implementation.bytecode.collection.ArrayAccess[] r0 = net.bytebuddy.implementation.bytecode.collection.ArrayAccess.$VALUES
            java.lang.Object r0 = r0.clone()
            net.bytebuddy.implementation.bytecode.collection.ArrayAccess[] r0 = (net.bytebuddy.implementation.bytecode.collection.ArrayAccess[]) r0
            return r0
    }

    public net.bytebuddy.implementation.bytecode.StackManipulation forEach(java.util.List<? extends net.bytebuddy.implementation.bytecode.StackManipulation> r11) {
            r10 = this;
            r0 = 1
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r11.size()
            r1.<init>(r2)
            java.util.Iterator r11 = r11.iterator()
            r2 = 0
            r3 = r2
        L10:
            boolean r4 = r11.hasNext()
            if (r4 == 0) goto L40
            java.lang.Object r4 = r11.next()
            net.bytebuddy.implementation.bytecode.StackManipulation r4 = (net.bytebuddy.implementation.bytecode.StackManipulation) r4
            net.bytebuddy.implementation.bytecode.StackManipulation$Compound r5 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
            int r6 = r3 + 1
            net.bytebuddy.implementation.bytecode.StackManipulation r3 = net.bytebuddy.implementation.bytecode.constant.IntegerConstant.forValue(r3)
            net.bytebuddy.implementation.bytecode.collection.ArrayAccess$Loader r7 = new net.bytebuddy.implementation.bytecode.collection.ArrayAccess$Loader
            r7.<init>(r10)
            r8 = 4
            net.bytebuddy.implementation.bytecode.StackManipulation[] r8 = new net.bytebuddy.implementation.bytecode.StackManipulation[r8]
            net.bytebuddy.implementation.bytecode.Duplication r9 = net.bytebuddy.implementation.bytecode.Duplication.SINGLE
            r8[r2] = r9
            r8[r0] = r3
            r3 = 2
            r8[r3] = r7
            r3 = 3
            r8[r3] = r4
            r5.<init>(r8)
            r1.add(r5)
            r3 = r6
            goto L10
        L40:
            net.bytebuddy.implementation.bytecode.StackManipulation$Compound r11 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
            r11.<init>(r1)
            return r11
    }

    public net.bytebuddy.implementation.bytecode.StackManipulation load() {
            r1 = this;
            net.bytebuddy.implementation.bytecode.collection.ArrayAccess$Loader r0 = new net.bytebuddy.implementation.bytecode.collection.ArrayAccess$Loader
            r0.<init>(r1)
            return r0
    }

    public net.bytebuddy.implementation.bytecode.StackManipulation store() {
            r1 = this;
            net.bytebuddy.implementation.bytecode.collection.ArrayAccess$Putter r0 = new net.bytebuddy.implementation.bytecode.collection.ArrayAccess$Putter
            r0.<init>(r1)
            return r0
    }
}
