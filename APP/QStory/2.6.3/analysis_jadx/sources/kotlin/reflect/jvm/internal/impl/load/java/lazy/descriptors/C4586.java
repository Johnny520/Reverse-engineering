package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.AbstractC4344;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4477;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.C4691;
import p052.InterfaceC6543;
import p101.C7248;
import p101.C7252;
import p101.C7262;
import p101.InterfaceC7254;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4586 implements InterfaceC6543 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final AbstractC4575 f13373;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f13374;

    public /* synthetic */ C4586(AbstractC4575 abstractC4575, int i) {
        this.f13374 = i;
        this.f13373 = abstractC4575;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p052.InterfaceC6543
    public final Object invoke() {
        int i = this.f13374;
        AbstractC4575 abstractC4575 = this.f13373;
        switch (i) {
            case 0:
                C7248 c7248 = C7248.f19315;
                InterfaceC7254.f19335.getClass();
                C7262 c7262 = C7262.f19355;
                c7248.getClass();
                List list = c7248.f19327;
                NoLookupLocation noLookupLocation = NoLookupLocation.WHEN_GET_ALL_DESCRIPTORS;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                if (c7248.m12474(C7248.f19323)) {
                    for (C4691 c4691 : abstractC4575.mo9159(c7248, c7262)) {
                        c7262.invoke(c4691);
                        InterfaceC4477 interfaceC4477Mo9155 = abstractC4575.mo9155(c4691, noLookupLocation);
                        if (interfaceC4477Mo9155 != null) {
                            linkedHashSet.add(interfaceC4477Mo9155);
                        }
                    }
                }
                if (c7248.m12474(C7248.f19324) && !list.contains(C7252.f19332)) {
                    for (C4691 c46912 : abstractC4575.mo9161(c7248, c7262)) {
                        c7262.invoke(c46912);
                        linkedHashSet.addAll(abstractC4575.mo9165(c46912, noLookupLocation));
                    }
                }
                if (c7248.m12474(C7248.f19325) && !list.contains(C7252.f19332)) {
                    for (C4691 c46913 : abstractC4575.mo9158(c7248)) {
                        c7262.invoke(c46913);
                        linkedHashSet.addAll(abstractC4575.mo9167(c46913, noLookupLocation));
                    }
                }
                return AbstractC4344.m8797(linkedHashSet);
            case 1:
                return abstractC4575.mo9160();
            case 2:
                return abstractC4575.mo9161(C7248.f19319, null);
            case 3:
                return abstractC4575.mo9158(C7248.f19316);
            default:
                return abstractC4575.mo9159(C7248.f19318, null);
        }
    }
}
