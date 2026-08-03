package net.bytebuddy.implementation;

/* JADX INFO: loaded from: classes2.dex */
public enum StubMethod extends java.lang.Enum<net.bytebuddy.implementation.StubMethod> implements net.bytebuddy.implementation.Implementation.Composable, net.bytebuddy.implementation.bytecode.ByteCodeAppender {
    private static final /* synthetic */ net.bytebuddy.implementation.StubMethod[] $VALUES = null;
    public static final net.bytebuddy.implementation.StubMethod INSTANCE = null;

    static {
            net.bytebuddy.implementation.StubMethod r0 = new net.bytebuddy.implementation.StubMethod
            java.lang.String r1 = "INSTANCE"
            r2 = 0
            r0.<init>(r1, r2)
            net.bytebuddy.implementation.StubMethod.INSTANCE = r0
            net.bytebuddy.implementation.StubMethod[] r0 = new net.bytebuddy.implementation.StubMethod[]{r0}
            net.bytebuddy.implementation.StubMethod.$VALUES = r0
            return
    }

    StubMethod(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static net.bytebuddy.implementation.StubMethod valueOf(java.lang.String r1) {
            java.lang.Class<net.bytebuddy.implementation.StubMethod> r0 = net.bytebuddy.implementation.StubMethod.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            net.bytebuddy.implementation.StubMethod r1 = (net.bytebuddy.implementation.StubMethod) r1
            return r1
    }

    public static net.bytebuddy.implementation.StubMethod[] values() {
            net.bytebuddy.implementation.StubMethod[] r0 = net.bytebuddy.implementation.StubMethod.$VALUES
            java.lang.Object r0 = r0.clone()
            net.bytebuddy.implementation.StubMethod[] r0 = (net.bytebuddy.implementation.StubMethod[]) r0
            return r0
    }

    @Override // net.bytebuddy.implementation.Implementation.Composable
    public net.bytebuddy.implementation.Implementation.Composable andThen(net.bytebuddy.implementation.Implementation.Composable r1) {
            r0 = this;
            return r1
    }

    @Override // net.bytebuddy.implementation.Implementation.Composable
    public net.bytebuddy.implementation.Implementation andThen(net.bytebuddy.implementation.Implementation r1) {
            r0 = this;
            return r1
    }

    @Override // net.bytebuddy.implementation.Implementation
    public net.bytebuddy.implementation.bytecode.ByteCodeAppender appender(net.bytebuddy.implementation.Implementation.Target r1) {
            r0 = this;
            return r0
    }

    @Override // net.bytebuddy.implementation.bytecode.ByteCodeAppender
    public net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size apply(net.bytebuddy.jar.asm.MethodVisitor r6, net.bytebuddy.implementation.Implementation.Context r7, net.bytebuddy.description.method.MethodDescription r8) {
            r5 = this;
            net.bytebuddy.implementation.bytecode.StackManipulation$Compound r0 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
            net.bytebuddy.description.type.TypeDescription$Generic r1 = r8.getReturnType()
            net.bytebuddy.implementation.bytecode.StackManipulation r1 = net.bytebuddy.implementation.bytecode.constant.DefaultValue.of(r1)
            net.bytebuddy.description.type.TypeDescription$Generic r2 = r8.getReturnType()
            net.bytebuddy.implementation.bytecode.StackManipulation r2 = net.bytebuddy.implementation.bytecode.member.MethodReturn.of(r2)
            r3 = 2
            net.bytebuddy.implementation.bytecode.StackManipulation[] r3 = new net.bytebuddy.implementation.bytecode.StackManipulation[r3]
            r4 = 0
            r3[r4] = r1
            r1 = 1
            r3[r1] = r2
            r0.<init>(r3)
            net.bytebuddy.implementation.bytecode.StackManipulation$Size r6 = r0.apply(r6, r7)
            net.bytebuddy.implementation.bytecode.ByteCodeAppender$Size r7 = new net.bytebuddy.implementation.bytecode.ByteCodeAppender$Size
            int r6 = r6.getMaximalSize()
            int r8 = r8.getStackSize()
            r7.<init>(r6, r8)
            return r7
    }

    @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
    public net.bytebuddy.dynamic.scaffold.InstrumentedType prepare(net.bytebuddy.dynamic.scaffold.InstrumentedType r1) {
            r0 = this;
            return r1
    }
}
