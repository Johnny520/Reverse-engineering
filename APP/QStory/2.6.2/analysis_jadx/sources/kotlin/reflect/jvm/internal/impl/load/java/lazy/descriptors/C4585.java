package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.AbstractC4343;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4476;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.C4690;
import p052.InterfaceC6542;
import p101.C7247;
import p101.C7251;
import p101.C7261;
import p101.InterfaceC7253;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4585 implements InterfaceC6542 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final AbstractC4574 f13369;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f13370;

    public /* synthetic */ C4585(AbstractC4574 abstractC4574, int i) {
        this.f13370 = i;
        this.f13369 = abstractC4574;
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
    @Override // p052.InterfaceC6542
    public final Object invoke() {
        int i = this.f13370;
        AbstractC4574 abstractC4574 = this.f13369;
        switch (i) {
            case 0:
                C7247 c7247 = C7247.f19320;
                InterfaceC7253.f19340.getClass();
                C7261 c7261 = C7261.f19360;
                c7247.getClass();
                List list = c7247.f19332;
                NoLookupLocation noLookupLocation = NoLookupLocation.WHEN_GET_ALL_DESCRIPTORS;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                if (c7247.m12447(C7247.f19328)) {
                    for (C4690 c4690 : abstractC4574.mo9169(c7247, c7261)) {
                        c7261.invoke(c4690);
                        InterfaceC4476 interfaceC4476Mo9165 = abstractC4574.mo9165(c4690, noLookupLocation);
                        if (interfaceC4476Mo9165 != null) {
                            linkedHashSet.add(interfaceC4476Mo9165);
                        }
                    }
                }
                if (c7247.m12447(C7247.f19329) && !list.contains(C7251.f19337)) {
                    for (C4690 c46902 : abstractC4574.mo9171(c7247, c7261)) {
                        c7261.invoke(c46902);
                        linkedHashSet.addAll(abstractC4574.mo9175(c46902, noLookupLocation));
                    }
                }
                if (c7247.m12447(C7247.f19330) && !list.contains(C7251.f19337)) {
                    for (C4690 c46903 : abstractC4574.mo9168(c7247)) {
                        c7261.invoke(c46903);
                        linkedHashSet.addAll(abstractC4574.mo9177(c46903, noLookupLocation));
                    }
                }
                return AbstractC4343.m8804(linkedHashSet);
            case 1:
                return abstractC4574.mo9170();
            case 2:
                return abstractC4574.mo9171(C7247.f19324, null);
            case 3:
                return abstractC4574.mo9168(C7247.f19321);
            default:
                return abstractC4574.mo9169(C7247.f19323, null);
        }
    }
}
