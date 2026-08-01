package p065;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5710;
import p068.InterfaceC7372;

/* JADX INFO: renamed from: 飘花落叶言世子兰苏哲楪.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7349 implements InterfaceC7372 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ AbstractC7359 f18173;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f18174;

    public /* synthetic */ C7349(AbstractC7359 abstractC7359, int i) {
        this.f18174 = i;
        this.f18173 = abstractC7359;
    }

    @Override // p068.InterfaceC7372
    public final Object invoke() {
        int i = this.f18174;
        AbstractC7359 abstractC7359 = this.f18173;
        switch (i) {
            case 0:
                return Arrays.asList(abstractC7359.m12596().mo9621(AbstractC7355.f18198), abstractC7359.m12596().mo9621(AbstractC7355.f18189), abstractC7359.m12596().mo9621(AbstractC7355.f18193), abstractC7359.m12596().mo9621(AbstractC7355.f18190));
            default:
                EnumMap enumMap = new EnumMap(PrimitiveType.class);
                HashMap map = new HashMap();
                HashMap map2 = new HashMap();
                for (PrimitiveType primitiveType : PrimitiveType.values()) {
                    String strM9894 = primitiveType.getTypeName().m9894();
                    if (strM9894 == null) {
                        AbstractC7359.m12579(47);
                        throw null;
                    }
                    AbstractC5710 abstractC5710Mo9584 = abstractC7359.m12595(strM9894).mo9584();
                    if (abstractC5710Mo9584 == null) {
                        AbstractC7359.m12579(48);
                        throw null;
                    }
                    String strM98942 = primitiveType.getArrayTypeName().m9894();
                    if (strM98942 == null) {
                        AbstractC7359.m12579(47);
                        throw null;
                    }
                    AbstractC5710 abstractC5710Mo95842 = abstractC7359.m12595(strM98942).mo9584();
                    if (abstractC5710Mo95842 == null) {
                        AbstractC7359.m12579(48);
                        throw null;
                    }
                    enumMap.put(primitiveType, abstractC5710Mo95842);
                    map.put(abstractC5710Mo9584, abstractC5710Mo95842);
                    map2.put(abstractC5710Mo95842, abstractC5710Mo9584);
                }
                return new C7360(enumMap, map, map2);
        }
    }
}
