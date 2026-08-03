package net.bytebuddy.implementation.bytecode.assign;

/* JADX INFO: loaded from: classes2.dex */
@net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
public class TypeCasting extends net.bytebuddy.implementation.bytecode.StackManipulation.AbstractBase {
    private final net.bytebuddy.description.type.TypeDescription typeDescription;

    public TypeCasting(net.bytebuddy.description.type.TypeDescription r1) {
            r0 = this;
            r0.<init>()
            r0.typeDescription = r1
            return
    }

    public static net.bytebuddy.implementation.bytecode.StackManipulation to(net.bytebuddy.description.type.TypeDefinition r3) {
            boolean r0 = r3.isPrimitive()
            if (r0 != 0) goto L10
            net.bytebuddy.implementation.bytecode.assign.TypeCasting r0 = new net.bytebuddy.implementation.bytecode.assign.TypeCasting
            net.bytebuddy.description.type.TypeDescription r3 = r3.asErasure()
            r0.<init>(r3)
            return r0
        L10:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot cast to primitive type: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    @Override // net.bytebuddy.implementation.bytecode.StackManipulation
    public net.bytebuddy.implementation.bytecode.StackManipulation.Size apply(net.bytebuddy.jar.asm.MethodVisitor r2, net.bytebuddy.implementation.Implementation.Context r3) {
            r1 = this;
            net.bytebuddy.description.type.TypeDescription r3 = r1.typeDescription
            java.lang.String r3 = r3.getInternalName()
            r0 = 192(0xc0, float:2.69E-43)
            r2.visitTypeInsn(r0, r3)
            net.bytebuddy.implementation.bytecode.StackSize r2 = net.bytebuddy.implementation.bytecode.StackSize.ZERO
            net.bytebuddy.implementation.bytecode.StackManipulation$Size r2 = r2.toIncreasingSize()
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
            net.bytebuddy.implementation.bytecode.assign.TypeCasting r5 = (net.bytebuddy.implementation.bytecode.assign.TypeCasting) r5
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
