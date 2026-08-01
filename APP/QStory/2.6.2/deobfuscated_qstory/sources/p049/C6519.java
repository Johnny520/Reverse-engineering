package p049;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4877;
import p052.InterfaceC6542;

/* JADX INFO: renamed from: 飘花落叶言世子兰苏哲楪.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6519 implements InterfaceC6542 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ AbstractC6529 f17832;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f17833;

    public /* synthetic */ C6519(AbstractC6529 abstractC6529, int i) {
        this.f17833 = i;
        this.f17832 = abstractC6529;
    }

    @Override // p052.InterfaceC6542
    public final Object invoke() {
        int i = this.f17833;
        AbstractC6529 abstractC6529 = this.f17832;
        switch (i) {
            case 0:
                return Arrays.asList(abstractC6529.m11994().mo9072(AbstractC6525.f17857), abstractC6529.m11994().mo9072(AbstractC6525.f17848), abstractC6529.m11994().mo9072(AbstractC6525.f17852), abstractC6529.m11994().mo9072(AbstractC6525.f17849));
            default:
                EnumMap enumMap = new EnumMap(PrimitiveType.class);
                HashMap map = new HashMap();
                HashMap map2 = new HashMap();
                for (PrimitiveType primitiveType : PrimitiveType.values()) {
                    String strM9345 = primitiveType.getTypeName().m9345();
                    if (strM9345 == null) {
                        AbstractC6529.m11977(47);
                        throw null;
                    }
                    AbstractC4877 abstractC4877Mo9035 = abstractC6529.m11993(strM9345).mo9035();
                    if (abstractC4877Mo9035 == null) {
                        AbstractC6529.m11977(48);
                        throw null;
                    }
                    String strM93452 = primitiveType.getArrayTypeName().m9345();
                    if (strM93452 == null) {
                        AbstractC6529.m11977(47);
                        throw null;
                    }
                    AbstractC4877 abstractC4877Mo90352 = abstractC6529.m11993(strM93452).mo9035();
                    if (abstractC4877Mo90352 == null) {
                        AbstractC6529.m11977(48);
                        throw null;
                    }
                    enumMap.put(primitiveType, abstractC4877Mo90352);
                    map.put(abstractC4877Mo9035, abstractC4877Mo90352);
                    map2.put(abstractC4877Mo90352, abstractC4877Mo9035);
                }
                return new C6530(enumMap, map, map2);
        }
    }
}
