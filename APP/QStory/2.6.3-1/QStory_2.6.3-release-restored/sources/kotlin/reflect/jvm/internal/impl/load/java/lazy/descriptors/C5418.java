package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.AbstractC5176;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5309;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.C5523;
import p068.InterfaceC7372;
import p117.C8077;
import p117.C8081;
import p117.C8091;
import p117.InterfaceC8083;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5418 implements InterfaceC7372 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final AbstractC5407 f13718;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f13719;

    public /* synthetic */ C5418(AbstractC5407 abstractC5407, int i) {
        this.f13719 = i;
        this.f13718 = abstractC5407;
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
    @Override // p068.InterfaceC7372
    public final Object invoke() {
        int i = this.f13719;
        AbstractC5407 abstractC5407 = this.f13718;
        switch (i) {
            case 0:
                C8077 c8077 = C8077.f19660;
                InterfaceC8083.f19680.getClass();
                C8091 c8091 = C8091.f19700;
                c8077.getClass();
                List list = c8077.f19672;
                NoLookupLocation noLookupLocation = NoLookupLocation.WHEN_GET_ALL_DESCRIPTORS;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                if (c8077.m13033(C8077.f19668)) {
                    for (C5523 c5523 : abstractC5407.mo9718(c8077, c8091)) {
                        c8091.invoke(c5523);
                        InterfaceC5309 interfaceC5309Mo9714 = abstractC5407.mo9714(c5523, noLookupLocation);
                        if (interfaceC5309Mo9714 != null) {
                            linkedHashSet.add(interfaceC5309Mo9714);
                        }
                    }
                }
                if (c8077.m13033(C8077.f19669) && !list.contains(C8081.f19677)) {
                    for (C5523 c55232 : abstractC5407.mo9720(c8077, c8091)) {
                        c8091.invoke(c55232);
                        linkedHashSet.addAll(abstractC5407.mo9724(c55232, noLookupLocation));
                    }
                }
                if (c8077.m13033(C8077.f19670) && !list.contains(C8081.f19677)) {
                    for (C5523 c55233 : abstractC5407.mo9717(c8077)) {
                        c8091.invoke(c55233);
                        linkedHashSet.addAll(abstractC5407.mo9726(c55233, noLookupLocation));
                    }
                }
                return AbstractC5176.m9356(linkedHashSet);
            case 1:
                return abstractC5407.mo9719();
            case 2:
                return abstractC5407.mo9720(C8077.f19664, null);
            case 3:
                return abstractC5407.mo9717(C8077.f19661);
            default:
                return abstractC5407.mo9718(C8077.f19663, null);
        }
    }
}
