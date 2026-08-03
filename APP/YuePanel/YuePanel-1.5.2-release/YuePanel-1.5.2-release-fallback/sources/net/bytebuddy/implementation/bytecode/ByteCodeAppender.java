package net.bytebuddy.implementation.bytecode;

/* JADX INFO: loaded from: classes2.dex */
public interface ByteCodeAppender {

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class Compound implements net.bytebuddy.implementation.bytecode.ByteCodeAppender {
        private final java.util.List<net.bytebuddy.implementation.bytecode.ByteCodeAppender> byteCodeAppenders;

        public Compound(java.util.List<? extends net.bytebuddy.implementation.bytecode.ByteCodeAppender> r3) {
                r2 = this;
                r2.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r2.byteCodeAppenders = r0
                java.util.Iterator r3 = r3.iterator()
            Le:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L2e
                java.lang.Object r0 = r3.next()
                net.bytebuddy.implementation.bytecode.ByteCodeAppender r0 = (net.bytebuddy.implementation.bytecode.ByteCodeAppender) r0
                boolean r1 = r0 instanceof net.bytebuddy.implementation.bytecode.ByteCodeAppender.Compound
                if (r1 == 0) goto L28
                java.util.List<net.bytebuddy.implementation.bytecode.ByteCodeAppender> r1 = r2.byteCodeAppenders
                net.bytebuddy.implementation.bytecode.ByteCodeAppender$Compound r0 = (net.bytebuddy.implementation.bytecode.ByteCodeAppender.Compound) r0
                java.util.List<net.bytebuddy.implementation.bytecode.ByteCodeAppender> r0 = r0.byteCodeAppenders
                r1.addAll(r0)
                goto Le
            L28:
                java.util.List<net.bytebuddy.implementation.bytecode.ByteCodeAppender> r1 = r2.byteCodeAppenders
                r1.add(r0)
                goto Le
            L2e:
                return
        }

        public Compound(net.bytebuddy.implementation.bytecode.ByteCodeAppender... r1) {
                r0 = this;
                java.util.List r1 = java.util.Arrays.asList(r1)
                r0.<init>(r1)
                return
        }

        @Override // net.bytebuddy.implementation.bytecode.ByteCodeAppender
        public net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size apply(net.bytebuddy.jar.asm.MethodVisitor r4, net.bytebuddy.implementation.Implementation.Context r5, net.bytebuddy.description.method.MethodDescription r6) {
                r3 = this;
                net.bytebuddy.implementation.bytecode.ByteCodeAppender$Size r0 = new net.bytebuddy.implementation.bytecode.ByteCodeAppender$Size
                int r1 = r6.getStackSize()
                r2 = 0
                r0.<init>(r2, r1)
                java.util.List<net.bytebuddy.implementation.bytecode.ByteCodeAppender> r1 = r3.byteCodeAppenders
                java.util.Iterator r1 = r1.iterator()
            L10:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L25
                java.lang.Object r2 = r1.next()
                net.bytebuddy.implementation.bytecode.ByteCodeAppender r2 = (net.bytebuddy.implementation.bytecode.ByteCodeAppender) r2
                net.bytebuddy.implementation.bytecode.ByteCodeAppender$Size r2 = r2.apply(r4, r5, r6)
                net.bytebuddy.implementation.bytecode.ByteCodeAppender$Size r0 = r0.merge(r2)
                goto L10
            L25:
                return r0
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
                java.util.List<net.bytebuddy.implementation.bytecode.ByteCodeAppender> r2 = r4.byteCodeAppenders
                net.bytebuddy.implementation.bytecode.ByteCodeAppender$Compound r5 = (net.bytebuddy.implementation.bytecode.ByteCodeAppender.Compound) r5
                java.util.List<net.bytebuddy.implementation.bytecode.ByteCodeAppender> r5 = r5.byteCodeAppenders
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
                java.util.List<net.bytebuddy.implementation.bytecode.ByteCodeAppender> r1 = r2.byteCodeAppenders
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }
    }

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class Simple implements net.bytebuddy.implementation.bytecode.ByteCodeAppender {
        private final net.bytebuddy.implementation.bytecode.StackManipulation stackManipulation;

        public Simple(java.util.List<? extends net.bytebuddy.implementation.bytecode.StackManipulation> r2) {
                r1 = this;
                r1.<init>()
                net.bytebuddy.implementation.bytecode.StackManipulation$Compound r0 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                r0.<init>(r2)
                r1.stackManipulation = r0
                return
        }

        public Simple(net.bytebuddy.implementation.bytecode.StackManipulation... r1) {
                r0 = this;
                java.util.List r1 = java.util.Arrays.asList(r1)
                r0.<init>(r1)
                return
        }

        @Override // net.bytebuddy.implementation.bytecode.ByteCodeAppender
        public net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size apply(net.bytebuddy.jar.asm.MethodVisitor r3, net.bytebuddy.implementation.Implementation.Context r4, net.bytebuddy.description.method.MethodDescription r5) {
                r2 = this;
                net.bytebuddy.implementation.bytecode.ByteCodeAppender$Size r0 = new net.bytebuddy.implementation.bytecode.ByteCodeAppender$Size
                net.bytebuddy.implementation.bytecode.StackManipulation r1 = r2.stackManipulation
                net.bytebuddy.implementation.bytecode.StackManipulation$Size r3 = r1.apply(r3, r4)
                int r3 = r3.getMaximalSize()
                int r4 = r5.getStackSize()
                r0.<init>(r3, r4)
                return r0
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
                net.bytebuddy.implementation.bytecode.StackManipulation r2 = r4.stackManipulation
                net.bytebuddy.implementation.bytecode.ByteCodeAppender$Simple r5 = (net.bytebuddy.implementation.bytecode.ByteCodeAppender.Simple) r5
                net.bytebuddy.implementation.bytecode.StackManipulation r5 = r5.stackManipulation
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
                net.bytebuddy.implementation.bytecode.StackManipulation r1 = r2.stackManipulation
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }
    }

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class Size {
        public static final net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size ZERO = null;
        private final int localVariableSize;
        private final int operandStackSize;

        static {
                net.bytebuddy.implementation.bytecode.ByteCodeAppender$Size r0 = new net.bytebuddy.implementation.bytecode.ByteCodeAppender$Size
                r1 = 0
                r0.<init>(r1, r1)
                net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size.ZERO = r0
                return
        }

        public Size(int r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.operandStackSize = r1
                r0.localVariableSize = r2
                return
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
                int r2 = r4.operandStackSize
                net.bytebuddy.implementation.bytecode.ByteCodeAppender$Size r5 = (net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size) r5
                int r3 = r5.operandStackSize
                if (r2 == r3) goto L1c
                return r1
            L1c:
                int r2 = r4.localVariableSize
                int r5 = r5.localVariableSize
                if (r2 == r5) goto L23
                return r1
            L23:
                return r0
        }

        public int getLocalVariableSize() {
                r1 = this;
                int r0 = r1.localVariableSize
                return r0
        }

        public int getOperandStackSize() {
                r1 = this;
                int r0 = r1.operandStackSize
                return r0
        }

        public int hashCode() {
                r2 = this;
                java.lang.Class r0 = r2.getClass()
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                int r1 = r2.operandStackSize
                int r0 = r0 + r1
                int r0 = r0 * 31
                int r1 = r2.localVariableSize
                int r0 = r0 + r1
                return r0
        }

        public net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size merge(net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size r4) {
                r3 = this;
                net.bytebuddy.implementation.bytecode.ByteCodeAppender$Size r0 = new net.bytebuddy.implementation.bytecode.ByteCodeAppender$Size
                int r1 = r3.operandStackSize
                int r2 = r4.operandStackSize
                int r1 = java.lang.Math.max(r1, r2)
                int r2 = r3.localVariableSize
                int r4 = r4.localVariableSize
                int r4 = java.lang.Math.max(r2, r4)
                r0.<init>(r1, r4)
                return r0
        }
    }

    net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size apply(net.bytebuddy.jar.asm.MethodVisitor r1, net.bytebuddy.implementation.Implementation.Context r2, net.bytebuddy.description.method.MethodDescription r3);
}
