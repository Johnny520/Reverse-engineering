package net.bytebuddy.implementation.bytecode.assign.primitive;

/* JADX INFO: loaded from: classes2.dex */
@net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
public class VoidAwareAssigner implements net.bytebuddy.implementation.bytecode.assign.Assigner {
    private final net.bytebuddy.implementation.bytecode.assign.Assigner chained;

    public VoidAwareAssigner(net.bytebuddy.implementation.bytecode.assign.Assigner r1) {
            r0 = this;
            r0.<init>()
            r0.chained = r1
            return
    }

    @Override // net.bytebuddy.implementation.bytecode.assign.Assigner
    public net.bytebuddy.implementation.bytecode.StackManipulation assign(net.bytebuddy.description.type.TypeDescription.Generic r3, net.bytebuddy.description.type.TypeDescription.Generic r4, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r5) {
            r2 = this;
            java.lang.Class r0 = java.lang.Void.TYPE
            boolean r1 = r3.represents(r0)
            if (r1 == 0) goto L11
            boolean r1 = r4.represents(r0)
            if (r1 == 0) goto L11
            net.bytebuddy.implementation.bytecode.StackManipulation$Trivial r3 = net.bytebuddy.implementation.bytecode.StackManipulation.Trivial.INSTANCE
            return r3
        L11:
            boolean r1 = r3.represents(r0)
            if (r1 == 0) goto L25
            boolean r3 = r5.isDynamic()
            if (r3 == 0) goto L22
            net.bytebuddy.implementation.bytecode.StackManipulation r3 = net.bytebuddy.implementation.bytecode.constant.DefaultValue.of(r4)
            goto L24
        L22:
            net.bytebuddy.implementation.bytecode.StackManipulation$Illegal r3 = net.bytebuddy.implementation.bytecode.StackManipulation.Illegal.INSTANCE
        L24:
            return r3
        L25:
            boolean r0 = r4.represents(r0)
            if (r0 == 0) goto L30
            net.bytebuddy.implementation.bytecode.StackManipulation r3 = net.bytebuddy.implementation.bytecode.Removal.of(r3)
            return r3
        L30:
            net.bytebuddy.implementation.bytecode.assign.Assigner r0 = r2.chained
            net.bytebuddy.implementation.bytecode.StackManipulation r3 = r0.assign(r3, r4, r5)
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
            net.bytebuddy.implementation.bytecode.assign.Assigner r2 = r4.chained
            net.bytebuddy.implementation.bytecode.assign.primitive.VoidAwareAssigner r5 = (net.bytebuddy.implementation.bytecode.assign.primitive.VoidAwareAssigner) r5
            net.bytebuddy.implementation.bytecode.assign.Assigner r5 = r5.chained
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
            net.bytebuddy.implementation.bytecode.assign.Assigner r1 = r2.chained
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            return r0
    }
}
