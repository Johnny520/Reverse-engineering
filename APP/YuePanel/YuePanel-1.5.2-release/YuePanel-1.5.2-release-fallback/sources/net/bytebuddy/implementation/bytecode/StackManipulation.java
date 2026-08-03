package net.bytebuddy.implementation.bytecode;

/* JADX INFO: loaded from: classes2.dex */
public interface StackManipulation {

    public static abstract class AbstractBase implements net.bytebuddy.implementation.bytecode.StackManipulation {
        public AbstractBase() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // net.bytebuddy.implementation.bytecode.StackManipulation
        public boolean isValid() {
                r1 = this;
                r0 = 1
                return r0
        }
    }

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class Compound implements net.bytebuddy.implementation.bytecode.StackManipulation {
        private final java.util.List<net.bytebuddy.implementation.bytecode.StackManipulation> stackManipulations;

        public Compound(java.util.List<? extends net.bytebuddy.implementation.bytecode.StackManipulation> r3) {
                r2 = this;
                r2.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r2.stackManipulations = r0
                java.util.Iterator r3 = r3.iterator()
            Le:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L32
                java.lang.Object r0 = r3.next()
                net.bytebuddy.implementation.bytecode.StackManipulation r0 = (net.bytebuddy.implementation.bytecode.StackManipulation) r0
                boolean r1 = r0 instanceof net.bytebuddy.implementation.bytecode.StackManipulation.Compound
                if (r1 == 0) goto L28
                java.util.List<net.bytebuddy.implementation.bytecode.StackManipulation> r1 = r2.stackManipulations
                net.bytebuddy.implementation.bytecode.StackManipulation$Compound r0 = (net.bytebuddy.implementation.bytecode.StackManipulation.Compound) r0
                java.util.List<net.bytebuddy.implementation.bytecode.StackManipulation> r0 = r0.stackManipulations
                r1.addAll(r0)
                goto Le
            L28:
                boolean r1 = r0 instanceof net.bytebuddy.implementation.bytecode.StackManipulation.Trivial
                if (r1 != 0) goto Le
                java.util.List<net.bytebuddy.implementation.bytecode.StackManipulation> r1 = r2.stackManipulations
                r1.add(r0)
                goto Le
            L32:
                return
        }

        public Compound(net.bytebuddy.implementation.bytecode.StackManipulation... r1) {
                r0 = this;
                java.util.List r1 = java.util.Arrays.asList(r1)
                r0.<init>(r1)
                return
        }

        @Override // net.bytebuddy.implementation.bytecode.StackManipulation
        public net.bytebuddy.implementation.bytecode.StackManipulation.Size apply(net.bytebuddy.jar.asm.MethodVisitor r4, net.bytebuddy.implementation.Implementation.Context r5) {
                r3 = this;
                net.bytebuddy.implementation.bytecode.StackManipulation$Size r0 = net.bytebuddy.implementation.bytecode.StackManipulation.Size.ZERO
                java.util.List<net.bytebuddy.implementation.bytecode.StackManipulation> r1 = r3.stackManipulations
                java.util.Iterator r1 = r1.iterator()
            L8:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L1d
                java.lang.Object r2 = r1.next()
                net.bytebuddy.implementation.bytecode.StackManipulation r2 = (net.bytebuddy.implementation.bytecode.StackManipulation) r2
                net.bytebuddy.implementation.bytecode.StackManipulation$Size r2 = r2.apply(r4, r5)
                net.bytebuddy.implementation.bytecode.StackManipulation$Size r0 = r0.aggregate(r2)
                goto L8
            L1d:
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
                java.util.List<net.bytebuddy.implementation.bytecode.StackManipulation> r2 = r4.stackManipulations
                net.bytebuddy.implementation.bytecode.StackManipulation$Compound r5 = (net.bytebuddy.implementation.bytecode.StackManipulation.Compound) r5
                java.util.List<net.bytebuddy.implementation.bytecode.StackManipulation> r5 = r5.stackManipulations
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
                java.util.List<net.bytebuddy.implementation.bytecode.StackManipulation> r1 = r2.stackManipulations
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }

        @Override // net.bytebuddy.implementation.bytecode.StackManipulation
        public boolean isValid() {
                r2 = this;
                java.util.List<net.bytebuddy.implementation.bytecode.StackManipulation> r0 = r2.stackManipulations
                java.util.Iterator r0 = r0.iterator()
            L6:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L1a
                java.lang.Object r1 = r0.next()
                net.bytebuddy.implementation.bytecode.StackManipulation r1 = (net.bytebuddy.implementation.bytecode.StackManipulation) r1
                boolean r1 = r1.isValid()
                if (r1 != 0) goto L6
                r0 = 0
                return r0
            L1a:
                r0 = 1
                return r0
        }
    }

    public enum Illegal extends java.lang.Enum<net.bytebuddy.implementation.bytecode.StackManipulation.Illegal> implements net.bytebuddy.implementation.bytecode.StackManipulation {
        private static final /* synthetic */ net.bytebuddy.implementation.bytecode.StackManipulation.Illegal[] $VALUES = null;
        public static final net.bytebuddy.implementation.bytecode.StackManipulation.Illegal INSTANCE = null;

        static {
                net.bytebuddy.implementation.bytecode.StackManipulation$Illegal r0 = new net.bytebuddy.implementation.bytecode.StackManipulation$Illegal
                java.lang.String r1 = "INSTANCE"
                r2 = 0
                r0.<init>(r1, r2)
                net.bytebuddy.implementation.bytecode.StackManipulation.Illegal.INSTANCE = r0
                net.bytebuddy.implementation.bytecode.StackManipulation$Illegal[] r0 = new net.bytebuddy.implementation.bytecode.StackManipulation.Illegal[]{r0}
                net.bytebuddy.implementation.bytecode.StackManipulation.Illegal.$VALUES = r0
                return
        }

        Illegal(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static net.bytebuddy.implementation.bytecode.StackManipulation.Illegal valueOf(java.lang.String r1) {
                java.lang.Class<net.bytebuddy.implementation.bytecode.StackManipulation$Illegal> r0 = net.bytebuddy.implementation.bytecode.StackManipulation.Illegal.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                net.bytebuddy.implementation.bytecode.StackManipulation$Illegal r1 = (net.bytebuddy.implementation.bytecode.StackManipulation.Illegal) r1
                return r1
        }

        public static net.bytebuddy.implementation.bytecode.StackManipulation.Illegal[] values() {
                net.bytebuddy.implementation.bytecode.StackManipulation$Illegal[] r0 = net.bytebuddy.implementation.bytecode.StackManipulation.Illegal.$VALUES
                java.lang.Object r0 = r0.clone()
                net.bytebuddy.implementation.bytecode.StackManipulation$Illegal[] r0 = (net.bytebuddy.implementation.bytecode.StackManipulation.Illegal[]) r0
                return r0
        }

        @Override // net.bytebuddy.implementation.bytecode.StackManipulation
        public net.bytebuddy.implementation.bytecode.StackManipulation.Size apply(net.bytebuddy.jar.asm.MethodVisitor r1, net.bytebuddy.implementation.Implementation.Context r2) {
                r0 = this;
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "An illegal stack manipulation must not be applied"
                r1.<init>(r2)
                throw r1
        }

        @Override // net.bytebuddy.implementation.bytecode.StackManipulation
        public boolean isValid() {
                r1 = this;
                r0 = 0
                return r0
        }
    }

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class Simple extends net.bytebuddy.implementation.bytecode.StackManipulation.AbstractBase {
        private final net.bytebuddy.implementation.bytecode.StackManipulation.Simple.Dispatcher dispatcher;

        public interface Dispatcher {
            net.bytebuddy.implementation.bytecode.StackManipulation.Size apply(net.bytebuddy.jar.asm.MethodVisitor r1, net.bytebuddy.implementation.Implementation.Context r2);
        }

        public Simple(net.bytebuddy.implementation.bytecode.StackManipulation.Simple.Dispatcher r1) {
                r0 = this;
                r0.<init>()
                r0.dispatcher = r1
                return
        }

        @Override // net.bytebuddy.implementation.bytecode.StackManipulation
        public net.bytebuddy.implementation.bytecode.StackManipulation.Size apply(net.bytebuddy.jar.asm.MethodVisitor r2, net.bytebuddy.implementation.Implementation.Context r3) {
                r1 = this;
                net.bytebuddy.implementation.bytecode.StackManipulation$Simple$Dispatcher r0 = r1.dispatcher
                net.bytebuddy.implementation.bytecode.StackManipulation$Size r2 = r0.apply(r2, r3)
                return r2
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
                net.bytebuddy.implementation.bytecode.StackManipulation$Simple$Dispatcher r2 = r4.dispatcher
                net.bytebuddy.implementation.bytecode.StackManipulation$Simple r5 = (net.bytebuddy.implementation.bytecode.StackManipulation.Simple) r5
                net.bytebuddy.implementation.bytecode.StackManipulation$Simple$Dispatcher r5 = r5.dispatcher
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
                net.bytebuddy.implementation.bytecode.StackManipulation$Simple$Dispatcher r1 = r2.dispatcher
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }
    }

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class Size {
        public static final net.bytebuddy.implementation.bytecode.StackManipulation.Size ZERO = null;
        private final int maximalSize;
        private final int sizeImpact;

        static {
                net.bytebuddy.implementation.bytecode.StackManipulation$Size r0 = new net.bytebuddy.implementation.bytecode.StackManipulation$Size
                r1 = 0
                r0.<init>(r1, r1)
                net.bytebuddy.implementation.bytecode.StackManipulation.Size.ZERO = r0
                return
        }

        public Size(int r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.sizeImpact = r1
                r0.maximalSize = r2
                return
        }

        private net.bytebuddy.implementation.bytecode.StackManipulation.Size aggregate(int r4, int r5) {
                r3 = this;
                net.bytebuddy.implementation.bytecode.StackManipulation$Size r0 = new net.bytebuddy.implementation.bytecode.StackManipulation$Size
                int r1 = r3.sizeImpact
                int r4 = r4 + r1
                int r2 = r3.maximalSize
                int r1 = r1 + r5
                int r5 = java.lang.Math.max(r2, r1)
                r0.<init>(r4, r5)
                return r0
        }

        public net.bytebuddy.implementation.bytecode.StackManipulation.Size aggregate(net.bytebuddy.implementation.bytecode.StackManipulation.Size r2) {
                r1 = this;
                int r0 = r2.sizeImpact
                int r2 = r2.maximalSize
                net.bytebuddy.implementation.bytecode.StackManipulation$Size r2 = r1.aggregate(r0, r2)
                return r2
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
                int r2 = r4.sizeImpact
                net.bytebuddy.implementation.bytecode.StackManipulation$Size r5 = (net.bytebuddy.implementation.bytecode.StackManipulation.Size) r5
                int r3 = r5.sizeImpact
                if (r2 == r3) goto L1c
                return r1
            L1c:
                int r2 = r4.maximalSize
                int r5 = r5.maximalSize
                if (r2 == r5) goto L23
                return r1
            L23:
                return r0
        }

        public int getMaximalSize() {
                r1 = this;
                int r0 = r1.maximalSize
                return r0
        }

        public int getSizeImpact() {
                r1 = this;
                int r0 = r1.sizeImpact
                return r0
        }

        public int hashCode() {
                r2 = this;
                java.lang.Class r0 = r2.getClass()
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                int r1 = r2.sizeImpact
                int r0 = r0 + r1
                int r0 = r0 * 31
                int r1 = r2.maximalSize
                int r0 = r0 + r1
                return r0
        }
    }

    public enum Trivial extends java.lang.Enum<net.bytebuddy.implementation.bytecode.StackManipulation.Trivial> implements net.bytebuddy.implementation.bytecode.StackManipulation {
        private static final /* synthetic */ net.bytebuddy.implementation.bytecode.StackManipulation.Trivial[] $VALUES = null;
        public static final net.bytebuddy.implementation.bytecode.StackManipulation.Trivial INSTANCE = null;

        static {
                net.bytebuddy.implementation.bytecode.StackManipulation$Trivial r0 = new net.bytebuddy.implementation.bytecode.StackManipulation$Trivial
                java.lang.String r1 = "INSTANCE"
                r2 = 0
                r0.<init>(r1, r2)
                net.bytebuddy.implementation.bytecode.StackManipulation.Trivial.INSTANCE = r0
                net.bytebuddy.implementation.bytecode.StackManipulation$Trivial[] r0 = new net.bytebuddy.implementation.bytecode.StackManipulation.Trivial[]{r0}
                net.bytebuddy.implementation.bytecode.StackManipulation.Trivial.$VALUES = r0
                return
        }

        Trivial(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static net.bytebuddy.implementation.bytecode.StackManipulation.Trivial valueOf(java.lang.String r1) {
                java.lang.Class<net.bytebuddy.implementation.bytecode.StackManipulation$Trivial> r0 = net.bytebuddy.implementation.bytecode.StackManipulation.Trivial.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                net.bytebuddy.implementation.bytecode.StackManipulation$Trivial r1 = (net.bytebuddy.implementation.bytecode.StackManipulation.Trivial) r1
                return r1
        }

        public static net.bytebuddy.implementation.bytecode.StackManipulation.Trivial[] values() {
                net.bytebuddy.implementation.bytecode.StackManipulation$Trivial[] r0 = net.bytebuddy.implementation.bytecode.StackManipulation.Trivial.$VALUES
                java.lang.Object r0 = r0.clone()
                net.bytebuddy.implementation.bytecode.StackManipulation$Trivial[] r0 = (net.bytebuddy.implementation.bytecode.StackManipulation.Trivial[]) r0
                return r0
        }

        @Override // net.bytebuddy.implementation.bytecode.StackManipulation
        public net.bytebuddy.implementation.bytecode.StackManipulation.Size apply(net.bytebuddy.jar.asm.MethodVisitor r1, net.bytebuddy.implementation.Implementation.Context r2) {
                r0 = this;
                net.bytebuddy.implementation.bytecode.StackSize r1 = net.bytebuddy.implementation.bytecode.StackSize.ZERO
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

    net.bytebuddy.implementation.bytecode.StackManipulation.Size apply(net.bytebuddy.jar.asm.MethodVisitor r1, net.bytebuddy.implementation.Implementation.Context r2);

    boolean isValid();
}
