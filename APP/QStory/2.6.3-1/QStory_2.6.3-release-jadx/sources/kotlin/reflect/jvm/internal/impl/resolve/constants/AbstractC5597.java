package kotlin.reflect.jvm.internal.impl.resolve.constants;

import io.ktor.util.C5043;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.AbstractC5176;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5710;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5725;
import kotlin.reflect.jvm.internal.impl.types.C5706;
import kotlin.reflect.jvm.internal.impl.types.InterfaceC5705;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind;
import p114.C8069;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.resolve.constants.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5597 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v18, types: [kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世楪兰哲苏] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世楪兰哲苏, kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世楪苏兰哲] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.Set] */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static AbstractC5710 m10051(ArrayList arrayList) {
        Set setM9343;
        IntegerLiteralTypeConstructor$Companion$Mode integerLiteralTypeConstructor$Companion$Mode = IntegerLiteralTypeConstructor$Companion$Mode.INTERSECTION_TYPE;
        if (arrayList.isEmpty()) {
            return null;
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            C6755.m11867("Empty collection can't be reduced.");
            return null;
        }
        ?? next = it.next();
        while (it.hasNext()) {
            AbstractC5710 abstractC5710 = (AbstractC5710) it.next();
            next = (AbstractC5710) next;
            if (next != 0 && abstractC5710 != null) {
                InterfaceC5705 interfaceC5705Mo10281 = next.mo10281();
                InterfaceC5705 interfaceC5705Mo102812 = abstractC5710.mo10281();
                boolean z = interfaceC5705Mo10281 instanceof C5598;
                if (z && (interfaceC5705Mo102812 instanceof C5598)) {
                    Set set = ((C5598) interfaceC5705Mo10281).f14249;
                    Set set2 = ((C5598) interfaceC5705Mo102812).f14249;
                    int i = AbstractC5593.f14245[integerLiteralTypeConstructor$Companion$Mode.ordinal()];
                    if (i == 1) {
                        Set set3 = set;
                        Set set4 = set2;
                        set3.getClass();
                        set4.getClass();
                        Set setM9356 = set4 instanceof Collection ? set4 : AbstractC5176.m9356(set4);
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        for (Object obj : set3) {
                            if (setM9356.contains(obj)) {
                                linkedHashSet.add(obj);
                            }
                        }
                        setM9343 = linkedHashSet;
                    } else {
                        if (i != 2) {
                            C5043.m9170();
                            return null;
                        }
                        Set set5 = set;
                        Set set6 = set2;
                        set5.getClass();
                        set6.getClass();
                        setM9343 = AbstractC5176.m9343(set5);
                        AbstractC5176.m9363(set6, setM9343);
                    }
                    C5598 c5598 = new C5598(setM9343);
                    C5706.f14520.getClass();
                    C5706 c5706 = C5706.f14521;
                    c5706.getClass();
                    next = AbstractC5725.m10378(EmptyList.INSTANCE, c5706, c5598, C8069.m13031(ErrorScopeKind.INTEGER_LITERAL_TYPE_SCOPE, true, "unknown integer literal type"), false);
                } else if (z) {
                    if (((C5598) interfaceC5705Mo10281).f14249.contains(abstractC5710)) {
                        next = abstractC5710;
                    }
                } else if (!(interfaceC5705Mo102812 instanceof C5598) || !((C5598) interfaceC5705Mo102812).f14249.contains(next)) {
                }
            }
            next = 0;
        }
        return (AbstractC5710) next;
    }
}
