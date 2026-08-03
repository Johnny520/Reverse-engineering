package net.bytebuddy.implementation.bytecode.collection;

/* JADX INFO: loaded from: classes2.dex */
public enum ArrayLength extends java.lang.Enum<net.bytebuddy.implementation.bytecode.collection.ArrayLength> implements net.bytebuddy.implementation.bytecode.StackManipulation {
    private static final /* synthetic */ net.bytebuddy.implementation.bytecode.collection.ArrayLength[] $VALUES = null;
    public static final net.bytebuddy.implementation.bytecode.collection.ArrayLength INSTANCE = null;

    static {
            net.bytebuddy.implementation.bytecode.collection.ArrayLength r0 = new net.bytebuddy.implementation.bytecode.collection.ArrayLength
            java.lang.String r1 = "INSTANCE"
            r2 = 0
            r0.<init>(r1, r2)
            net.bytebuddy.implementation.bytecode.collection.ArrayLength.INSTANCE = r0
            net.bytebuddy.implementation.bytecode.collection.ArrayLength[] r0 = new net.bytebuddy.implementation.bytecode.collection.ArrayLength[]{r0}
            net.bytebuddy.implementation.bytecode.collection.ArrayLength.$VALUES = r0
            return
    }

    ArrayLength(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static net.bytebuddy.implementation.bytecode.collection.ArrayLength valueOf(java.lang.String r1) {
            java.lang.Class<net.bytebuddy.implementation.bytecode.collection.ArrayLength> r0 = net.bytebuddy.implementation.bytecode.collection.ArrayLength.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            net.bytebuddy.implementation.bytecode.collection.ArrayLength r1 = (net.bytebuddy.implementation.bytecode.collection.ArrayLength) r1
            return r1
    }

    public static net.bytebuddy.implementation.bytecode.collection.ArrayLength[] values() {
            net.bytebuddy.implementation.bytecode.collection.ArrayLength[] r0 = net.bytebuddy.implementation.bytecode.collection.ArrayLength.$VALUES
            java.lang.Object r0 = r0.clone()
            net.bytebuddy.implementation.bytecode.collection.ArrayLength[] r0 = (net.bytebuddy.implementation.bytecode.collection.ArrayLength[]) r0
            return r0
    }

    @Override // net.bytebuddy.implementation.bytecode.StackManipulation
    public net.bytebuddy.implementation.bytecode.StackManipulation.Size apply(net.bytebuddy.jar.asm.MethodVisitor r1, net.bytebuddy.implementation.Implementation.Context r2) {
            r0 = this;
            r2 = 190(0xbe, float:2.66E-43)
            r1.visitInsn(r2)
            net.bytebuddy.implementation.bytecode.StackManipulation$Size r1 = net.bytebuddy.implementation.bytecode.StackManipulation.Size.ZERO
            return r1
    }

    @Override // net.bytebuddy.implementation.bytecode.StackManipulation
    public boolean isValid() {
            r1 = this;
            r0 = 1
            return r0
    }
}
