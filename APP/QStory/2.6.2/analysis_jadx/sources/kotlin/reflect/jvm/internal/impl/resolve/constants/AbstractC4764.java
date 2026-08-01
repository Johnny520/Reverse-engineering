package kotlin.reflect.jvm.internal.impl.resolve.constants;

import io.ktor.util.C4210;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.AbstractC4343;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4877;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4892;
import kotlin.reflect.jvm.internal.impl.types.C4873;
import kotlin.reflect.jvm.internal.impl.types.InterfaceC4872;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind;
import p098.C7239;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.resolve.constants.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4764 {
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
    public static AbstractC4877 m9502(ArrayList arrayList) {
        Set setM8801;
        IntegerLiteralTypeConstructor$Companion$Mode integerLiteralTypeConstructor$Companion$Mode = IntegerLiteralTypeConstructor$Companion$Mode.INTERSECTION_TYPE;
        if (arrayList.isEmpty()) {
            return null;
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            C5919.m11247("Empty collection can't be reduced.");
            return null;
        }
        ?? next = it.next();
        while (it.hasNext()) {
            AbstractC4877 abstractC4877 = (AbstractC4877) it.next();
            next = (AbstractC4877) next;
            if (next != 0 && abstractC4877 != null) {
                InterfaceC4872 interfaceC4872Mo9732 = next.mo9732();
                InterfaceC4872 interfaceC4872Mo97322 = abstractC4877.mo9732();
                boolean z = interfaceC4872Mo9732 instanceof C4765;
                if (z && (interfaceC4872Mo97322 instanceof C4765)) {
                    Set set = ((C4765) interfaceC4872Mo9732).f13900;
                    Set set2 = ((C4765) interfaceC4872Mo97322).f13900;
                    int i = AbstractC4760.f13896[integerLiteralTypeConstructor$Companion$Mode.ordinal()];
                    if (i == 1) {
                        Set set3 = set;
                        Set set4 = set2;
                        set3.getClass();
                        set4.getClass();
                        Set setM8804 = set4 instanceof Collection ? set4 : AbstractC4343.m8804(set4);
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        for (Object obj : set3) {
                            if (setM8804.contains(obj)) {
                                linkedHashSet.add(obj);
                            }
                        }
                        setM8801 = linkedHashSet;
                    } else {
                        if (i != 2) {
                            C4210.m8621();
                            return null;
                        }
                        Set set5 = set;
                        Set set6 = set2;
                        set5.getClass();
                        set6.getClass();
                        setM8801 = AbstractC4343.m8801(set5);
                        AbstractC4343.m8794(set6, setM8801);
                    }
                    C4765 c4765 = new C4765(setM8801);
                    C4873.f14171.getClass();
                    C4873 c4873 = C4873.f14172;
                    c4873.getClass();
                    next = AbstractC4892.m9825(EmptyList.INSTANCE, c4873, c4765, C7239.m12445(ErrorScopeKind.INTEGER_LITERAL_TYPE_SCOPE, true, "unknown integer literal type"), false);
                } else if (z) {
                    if (((C4765) interfaceC4872Mo9732).f13900.contains(abstractC4877)) {
                        next = abstractC4877;
                    }
                } else if (!(interfaceC4872Mo97322 instanceof C4765) || !((C4765) interfaceC4872Mo97322).f13900.contains(next)) {
                }
            }
            next = 0;
        }
        return (AbstractC4877) next;
    }
}
