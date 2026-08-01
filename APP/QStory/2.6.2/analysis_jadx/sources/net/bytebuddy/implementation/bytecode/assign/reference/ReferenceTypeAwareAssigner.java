package net.bytebuddy.implementation.bytecode.assign.reference;

import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.implementation.bytecode.StackManipulation;
import net.bytebuddy.implementation.bytecode.assign.Assigner;
import net.bytebuddy.implementation.bytecode.assign.TypeCasting;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public enum ReferenceTypeAwareAssigner implements Assigner {
    INSTANCE;

    @Override // net.bytebuddy.implementation.bytecode.assign.Assigner
    public StackManipulation assign(TypeDescription.Generic generic, TypeDescription.Generic generic2, Assigner.Typing typing) {
        return (generic.isPrimitive() || generic2.isPrimitive()) ? generic.equals(generic2) ? StackManipulation.Trivial.INSTANCE : StackManipulation.Illegal.INSTANCE : generic.asErasure().isAssignableTo(generic2.asErasure()) ? StackManipulation.Trivial.INSTANCE : typing.isDynamic() ? TypeCasting.to(generic2) : StackManipulation.Illegal.INSTANCE;
    }
}
