package net.bytebuddy.implementation.bytecode.assign.primitive;

import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.implementation.bytecode.Removal;
import net.bytebuddy.implementation.bytecode.StackManipulation;
import net.bytebuddy.implementation.bytecode.assign.Assigner;
import net.bytebuddy.implementation.bytecode.constant.DefaultValue;
import net.bytebuddy.utility.nullability.MaybeNull;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@HashCodeAndEqualsPlugin.Enhance
public class VoidAwareAssigner implements Assigner {
    private final Assigner chained;

    public VoidAwareAssigner(Assigner assigner) {
        this.chained = assigner;
    }

    @Override // net.bytebuddy.implementation.bytecode.assign.Assigner
    public StackManipulation assign(TypeDescription.Generic generic, TypeDescription.Generic generic2, Assigner.Typing typing) {
        Class cls = Void.TYPE;
        return (generic.represents(cls) && generic2.represents(cls)) ? StackManipulation.Trivial.INSTANCE : generic.represents(cls) ? typing.isDynamic() ? DefaultValue.of(generic2) : StackManipulation.Illegal.INSTANCE : generic2.represents(cls) ? Removal.of(generic) : this.chained.assign(generic, generic2, typing);
    }

    public boolean equals(@MaybeNull Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.chained.equals(((VoidAwareAssigner) obj).chained);
    }

    public int hashCode() {
        return this.chained.hashCode() + (getClass().hashCode() * 31);
    }
}
