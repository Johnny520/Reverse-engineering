package p049;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4878;
import p052.InterfaceC6543;

/* JADX INFO: renamed from: 飘花落叶言世子兰苏哲楪.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6520 implements InterfaceC6543 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ AbstractC6530 f17828;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f17829;

    public /* synthetic */ C6520(AbstractC6530 abstractC6530, int i) {
        this.f17829 = i;
        this.f17828 = abstractC6530;
    }

    @Override // p052.InterfaceC6543
    public final Object invoke() {
        int i = this.f17829;
        AbstractC6530 abstractC6530 = this.f17828;
        switch (i) {
            case 0:
                return Arrays.asList(abstractC6530.m12037().mo9062(AbstractC6526.f17853), abstractC6530.m12037().mo9062(AbstractC6526.f17844), abstractC6530.m12037().mo9062(AbstractC6526.f17848), abstractC6530.m12037().mo9062(AbstractC6526.f17845));
            default:
                EnumMap enumMap = new EnumMap(PrimitiveType.class);
                HashMap map = new HashMap();
                HashMap map2 = new HashMap();
                for (PrimitiveType primitiveType : PrimitiveType.values()) {
                    String strM9335 = primitiveType.getTypeName().m9335();
                    if (strM9335 == null) {
                        AbstractC6530.m12020(47);
                        throw null;
                    }
                    AbstractC4878 abstractC4878Mo9025 = abstractC6530.m12036(strM9335).mo9025();
                    if (abstractC4878Mo9025 == null) {
                        AbstractC6530.m12020(48);
                        throw null;
                    }
                    String strM93352 = primitiveType.getArrayTypeName().m9335();
                    if (strM93352 == null) {
                        AbstractC6530.m12020(47);
                        throw null;
                    }
                    AbstractC4878 abstractC4878Mo90252 = abstractC6530.m12036(strM93352).mo9025();
                    if (abstractC4878Mo90252 == null) {
                        AbstractC6530.m12020(48);
                        throw null;
                    }
                    enumMap.put(primitiveType, abstractC4878Mo90252);
                    map.put(abstractC4878Mo9025, abstractC4878Mo90252);
                    map2.put(abstractC4878Mo90252, abstractC4878Mo9025);
                }
                return new C6531(enumMap, map, map2);
        }
    }
}
