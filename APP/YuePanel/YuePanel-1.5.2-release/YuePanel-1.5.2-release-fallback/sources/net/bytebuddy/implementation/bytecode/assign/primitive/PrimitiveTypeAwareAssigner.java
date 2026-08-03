package net.bytebuddy.implementation.bytecode.assign.primitive;

/* JADX INFO: loaded from: classes2.dex */
@net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
public class PrimitiveTypeAwareAssigner implements net.bytebuddy.implementation.bytecode.assign.Assigner {
    private final net.bytebuddy.implementation.bytecode.assign.Assigner referenceTypeAwareAssigner;

    public PrimitiveTypeAwareAssigner(net.bytebuddy.implementation.bytecode.assign.Assigner r1) {
            r0 = this;
            r0.<init>()
            r0.referenceTypeAwareAssigner = r1
            return
    }

    @Override // net.bytebuddy.implementation.bytecode.assign.Assigner
    public net.bytebuddy.implementation.bytecode.StackManipulation assign(net.bytebuddy.description.type.TypeDescription.Generic r2, net.bytebuddy.description.type.TypeDescription.Generic r3, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r4) {
            r1 = this;
            boolean r0 = r2.isPrimitive()
            if (r0 == 0) goto L15
            boolean r0 = r3.isPrimitive()
            if (r0 == 0) goto L15
            net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveWideningDelegate r2 = net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveWideningDelegate.forPrimitive(r2)
            net.bytebuddy.implementation.bytecode.StackManipulation r2 = r2.widenTo(r3)
            return r2
        L15:
            boolean r0 = r2.isPrimitive()
            if (r0 == 0) goto L26
            net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveBoxingDelegate r2 = net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveBoxingDelegate.forPrimitive(r2)
            net.bytebuddy.implementation.bytecode.assign.Assigner r0 = r1.referenceTypeAwareAssigner
            net.bytebuddy.implementation.bytecode.StackManipulation r2 = r2.assignBoxedTo(r3, r0, r4)
            return r2
        L26:
            boolean r0 = r3.isPrimitive()
            if (r0 == 0) goto L37
            net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate$UnboxingResponsible r2 = net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate.forReferenceType(r2)
            net.bytebuddy.implementation.bytecode.assign.Assigner r0 = r1.referenceTypeAwareAssigner
            net.bytebuddy.implementation.bytecode.StackManipulation r2 = r2.assignUnboxedTo(r3, r0, r4)
            return r2
        L37:
            net.bytebuddy.implementation.bytecode.assign.Assigner r0 = r1.referenceTypeAwareAssigner
            net.bytebuddy.implementation.bytecode.StackManipulation r2 = r0.assign(r2, r3, r4)
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
            net.bytebuddy.implementation.bytecode.assign.Assigner r2 = r4.referenceTypeAwareAssigner
            net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveTypeAwareAssigner r5 = (net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveTypeAwareAssigner) r5
            net.bytebuddy.implementation.bytecode.assign.Assigner r5 = r5.referenceTypeAwareAssigner
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
            net.bytebuddy.implementation.bytecode.assign.Assigner r1 = r2.referenceTypeAwareAssigner
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            return r0
    }
}
