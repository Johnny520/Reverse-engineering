package kotlin.reflect.jvm.internal;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.AbstractC5177;
import kotlin.reflect.InterfaceC5919;
import kotlin.reflect.KVariance;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5295;
import p068.InterfaceC7372;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5865 implements InterfaceC7372 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final AbstractC5856 f14858;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f14859;

    public /* synthetic */ C5865(AbstractC5856 abstractC5856, int i) {
        this.f14859 = i;
        this.f14858 = abstractC5856;
    }

    @Override // p068.InterfaceC7372
    public final Object invoke() {
        int i = this.f14859;
        AbstractC5856 abstractC5856 = this.f14858;
        switch (i) {
            case 0:
                return AbstractC5899.m10622(abstractC5856.mo10501());
            case 1:
                return abstractC5856.m10550(true);
            case 2:
                return AbstractC5894.m10601(abstractC5856) ? abstractC5856.m10550(false) : abstractC5856.mo10520();
            case 3:
                InterfaceC5919 interfaceC5919 = abstractC5856.f14834.f14925.m10487(abstractC5856.mo10503(), KVariance.INVARIANT).f14982;
                if (interfaceC5919 != null) {
                    return interfaceC5919;
                }
                AbstractC5889.m10562(abstractC5856.getName());
                throw null;
            default:
                List<InterfaceC5295> typeParameters = abstractC5856.mo10501().getTypeParameters();
                typeParameters.getClass();
                ArrayList arrayList = new ArrayList(AbstractC5177.m9381(typeParameters, 10));
                for (InterfaceC5295 interfaceC5295 : typeParameters) {
                    interfaceC5295.getClass();
                    arrayList.add(new C5821(abstractC5856, interfaceC5295, abstractC5856.f14834.f14925));
                }
                return arrayList;
        }
    }
}
