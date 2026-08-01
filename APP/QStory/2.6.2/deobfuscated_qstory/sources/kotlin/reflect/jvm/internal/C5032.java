package kotlin.reflect.jvm.internal;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.AbstractC4344;
import kotlin.reflect.InterfaceC5086;
import kotlin.reflect.KVariance;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4462;
import p052.InterfaceC6542;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5032 implements InterfaceC6542 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final AbstractC5023 f14511;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f14512;

    public /* synthetic */ C5032(AbstractC5023 abstractC5023, int i) {
        this.f14512 = i;
        this.f14511 = abstractC5023;
    }

    @Override // p052.InterfaceC6542
    public final Object invoke() {
        int i = this.f14512;
        AbstractC5023 abstractC5023 = this.f14511;
        switch (i) {
            case 0:
                return AbstractC5066.m10059(abstractC5023.mo9945());
            case 1:
                return abstractC5023.m9994(true);
            case 2:
                return AbstractC5061.m10028(abstractC5023) ? abstractC5023.m9994(false) : abstractC5023.mo9964();
            case 3:
                InterfaceC5086 interfaceC5086 = abstractC5023.f14487.f14578.m9931(abstractC5023.mo9947(), KVariance.INVARIANT).f14637;
                if (interfaceC5086 != null) {
                    return interfaceC5086;
                }
                AbstractC5056.m10006(abstractC5023.getName());
                throw null;
            default:
                List<InterfaceC4462> typeParameters = abstractC5023.mo9945().getTypeParameters();
                typeParameters.getClass();
                ArrayList arrayList = new ArrayList(AbstractC4344.m8832(typeParameters, 10));
                for (InterfaceC4462 interfaceC4462 : typeParameters) {
                    interfaceC4462.getClass();
                    arrayList.add(new C4988(abstractC5023, interfaceC4462, abstractC5023.f14487.f14578));
                }
                return arrayList;
        }
    }
}
