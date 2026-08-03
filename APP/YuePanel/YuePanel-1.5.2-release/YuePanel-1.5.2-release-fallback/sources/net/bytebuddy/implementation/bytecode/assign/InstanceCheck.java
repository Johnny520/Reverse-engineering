package net.bytebuddy.implementation.bytecode.assign;

/* JADX INFO: loaded from: classes2.dex */
@net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
public class InstanceCheck extends net.bytebuddy.implementation.bytecode.StackManipulation.AbstractBase {
    private final net.bytebuddy.description.type.TypeDescription typeDescription;

    public InstanceCheck(net.bytebuddy.description.type.TypeDescription r1) {
            r0 = this;
            r0.<init>()
            r0.typeDescription = r1
            return
    }

    public static net.bytebuddy.implementation.bytecode.StackManipulation of(net.bytebuddy.description.type.TypeDescription r3) {
            boolean r0 = r3.isPrimitive()
            if (r0 != 0) goto Lc
            net.bytebuddy.implementation.bytecode.assign.InstanceCheck r0 = new net.bytebuddy.implementation.bytecode.assign.InstanceCheck
            r0.<init>(r3)
            return r0
        Lc:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot check an instance against a primitive type: "
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
            r0 = 193(0xc1, float:2.7E-43)
            r2.visitTypeInsn(r0, r3)
            net.bytebuddy.implementation.bytecode.StackManipulation$Size r2 = net.bytebuddy.implementation.bytecode.StackManipulation.Size.ZERO
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
            net.bytebuddy.implementation.bytecode.assign.InstanceCheck r5 = (net.bytebuddy.implementation.bytecode.assign.InstanceCheck) r5
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
