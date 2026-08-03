package net.bytebuddy.implementation.bytecode.assign.reference;

/* JADX INFO: loaded from: classes2.dex */
public enum ReferenceTypeAwareAssigner extends java.lang.Enum<net.bytebuddy.implementation.bytecode.assign.reference.ReferenceTypeAwareAssigner> implements net.bytebuddy.implementation.bytecode.assign.Assigner {
    private static final /* synthetic */ net.bytebuddy.implementation.bytecode.assign.reference.ReferenceTypeAwareAssigner[] $VALUES = null;
    public static final net.bytebuddy.implementation.bytecode.assign.reference.ReferenceTypeAwareAssigner INSTANCE = null;

    static {
            net.bytebuddy.implementation.bytecode.assign.reference.ReferenceTypeAwareAssigner r0 = new net.bytebuddy.implementation.bytecode.assign.reference.ReferenceTypeAwareAssigner
            java.lang.String r1 = "INSTANCE"
            r2 = 0
            r0.<init>(r1, r2)
            net.bytebuddy.implementation.bytecode.assign.reference.ReferenceTypeAwareAssigner.INSTANCE = r0
            net.bytebuddy.implementation.bytecode.assign.reference.ReferenceTypeAwareAssigner[] r0 = new net.bytebuddy.implementation.bytecode.assign.reference.ReferenceTypeAwareAssigner[]{r0}
            net.bytebuddy.implementation.bytecode.assign.reference.ReferenceTypeAwareAssigner.$VALUES = r0
            return
    }

    ReferenceTypeAwareAssigner(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static net.bytebuddy.implementation.bytecode.assign.reference.ReferenceTypeAwareAssigner valueOf(java.lang.String r1) {
            java.lang.Class<net.bytebuddy.implementation.bytecode.assign.reference.ReferenceTypeAwareAssigner> r0 = net.bytebuddy.implementation.bytecode.assign.reference.ReferenceTypeAwareAssigner.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            net.bytebuddy.implementation.bytecode.assign.reference.ReferenceTypeAwareAssigner r1 = (net.bytebuddy.implementation.bytecode.assign.reference.ReferenceTypeAwareAssigner) r1
            return r1
    }

    public static net.bytebuddy.implementation.bytecode.assign.reference.ReferenceTypeAwareAssigner[] values() {
            net.bytebuddy.implementation.bytecode.assign.reference.ReferenceTypeAwareAssigner[] r0 = net.bytebuddy.implementation.bytecode.assign.reference.ReferenceTypeAwareAssigner.$VALUES
            java.lang.Object r0 = r0.clone()
            net.bytebuddy.implementation.bytecode.assign.reference.ReferenceTypeAwareAssigner[] r0 = (net.bytebuddy.implementation.bytecode.assign.reference.ReferenceTypeAwareAssigner[]) r0
            return r0
    }

    @Override // net.bytebuddy.implementation.bytecode.assign.Assigner
    public net.bytebuddy.implementation.bytecode.StackManipulation assign(net.bytebuddy.description.type.TypeDescription.Generic r2, net.bytebuddy.description.type.TypeDescription.Generic r3, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r4) {
            r1 = this;
            boolean r0 = r2.isPrimitive()
            if (r0 != 0) goto L2c
            boolean r0 = r3.isPrimitive()
            if (r0 == 0) goto Ld
            goto L2c
        Ld:
            net.bytebuddy.description.type.TypeDescription r2 = r2.asErasure()
            net.bytebuddy.description.type.TypeDescription r0 = r3.asErasure()
            boolean r2 = r2.isAssignableTo(r0)
            if (r2 == 0) goto L1e
            net.bytebuddy.implementation.bytecode.StackManipulation$Trivial r2 = net.bytebuddy.implementation.bytecode.StackManipulation.Trivial.INSTANCE
            return r2
        L1e:
            boolean r2 = r4.isDynamic()
            if (r2 == 0) goto L29
            net.bytebuddy.implementation.bytecode.StackManipulation r2 = net.bytebuddy.implementation.bytecode.assign.TypeCasting.to(r3)
            return r2
        L29:
            net.bytebuddy.implementation.bytecode.StackManipulation$Illegal r2 = net.bytebuddy.implementation.bytecode.StackManipulation.Illegal.INSTANCE
            return r2
        L2c:
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L35
            net.bytebuddy.implementation.bytecode.StackManipulation$Trivial r2 = net.bytebuddy.implementation.bytecode.StackManipulation.Trivial.INSTANCE
            goto L37
        L35:
            net.bytebuddy.implementation.bytecode.StackManipulation$Illegal r2 = net.bytebuddy.implementation.bytecode.StackManipulation.Illegal.INSTANCE
        L37:
            return r2
    }
}
