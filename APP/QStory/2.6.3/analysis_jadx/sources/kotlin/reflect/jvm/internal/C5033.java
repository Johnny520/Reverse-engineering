package kotlin.reflect.jvm.internal;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.AbstractC4345;
import kotlin.reflect.InterfaceC5087;
import kotlin.reflect.KVariance;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4463;
import p052.InterfaceC6543;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5033 implements InterfaceC6543 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final AbstractC5024 f14513;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f14514;

    public /* synthetic */ C5033(AbstractC5024 abstractC5024, int i) {
        this.f14514 = i;
        this.f14513 = abstractC5024;
    }

    @Override // p052.InterfaceC6543
    public final Object invoke() {
        int i = this.f14514;
        AbstractC5024 abstractC5024 = this.f14513;
        switch (i) {
            case 0:
                return AbstractC5067.m10063(abstractC5024.mo9942());
            case 1:
                return abstractC5024.m9991(true);
            case 2:
                return AbstractC5062.m10042(abstractC5024) ? abstractC5024.m9991(false) : abstractC5024.mo9961();
            case 3:
                InterfaceC5087 interfaceC5087 = abstractC5024.f14489.f14580.m9928(abstractC5024.mo9944(), KVariance.INVARIANT).f14637;
                if (interfaceC5087 != null) {
                    return interfaceC5087;
                }
                AbstractC5057.m10003(abstractC5024.getName());
                throw null;
            default:
                List<InterfaceC4463> typeParameters = abstractC5024.mo9942().getTypeParameters();
                typeParameters.getClass();
                ArrayList arrayList = new ArrayList(AbstractC4345.m8822(typeParameters, 10));
                for (InterfaceC4463 interfaceC4463 : typeParameters) {
                    interfaceC4463.getClass();
                    arrayList.add(new C4989(abstractC5024, interfaceC4463, abstractC5024.f14489.f14580));
                }
                return arrayList;
        }
    }
}
