package net.bytebuddy.implementation.bytecode;

/* JADX INFO: loaded from: classes2.dex */
@net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
public class TypeCreation extends net.bytebuddy.implementation.bytecode.StackManipulation.AbstractBase {
    private final net.bytebuddy.description.type.TypeDescription typeDescription;

    public TypeCreation(net.bytebuddy.description.type.TypeDescription r1) {
            r0 = this;
            r0.<init>()
            r0.typeDescription = r1
            return
    }

    public static net.bytebuddy.implementation.bytecode.StackManipulation of(net.bytebuddy.description.type.TypeDescription r2) {
            boolean r0 = r2.isArray()
            if (r0 != 0) goto L18
            boolean r0 = r2.isPrimitive()
            if (r0 != 0) goto L18
            boolean r0 = r2.isAbstract()
            if (r0 != 0) goto L18
            net.bytebuddy.implementation.bytecode.TypeCreation r0 = new net.bytebuddy.implementation.bytecode.TypeCreation
            r0.<init>(r2)
            return r0
        L18:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            java.lang.String r2 = " is not instantiable"
            r1.append(r2)
            java.lang.String r2 = r1.toString()
            r0.<init>(r2)
            throw r0
    }

    @Override // net.bytebuddy.implementation.bytecode.StackManipulation
    public net.bytebuddy.implementation.bytecode.StackManipulation.Size apply(net.bytebuddy.jar.asm.MethodVisitor r2, net.bytebuddy.implementation.Implementation.Context r3) {
            r1 = this;
            net.bytebuddy.description.type.TypeDescription r3 = r1.typeDescription
            java.lang.String r3 = r3.getInternalName()
            r0 = 187(0xbb, float:2.62E-43)
            r2.visitTypeInsn(r0, r3)
            net.bytebuddy.implementation.bytecode.StackManipulation$Size r2 = new net.bytebuddy.implementation.bytecode.StackManipulation$Size
            r3 = 1
            r2.<init>(r3, r3)
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
            net.bytebuddy.description.type.TypeDescription r2 = r4.typeDescription
            net.bytebuddy.implementation.bytecode.TypeCreation r5 = (net.bytebuddy.implementation.bytecode.TypeCreation) r5
            net.bytebuddy.description.type.TypeDescription r5 = r5.typeDescription
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
            net.bytebuddy.description.type.TypeDescription r1 = r2.typeDescription
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            return r0
    }
}
