package kotlin.reflect.jvm.internal.impl.resolve.constants;

import io.ktor.util.C4211;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.AbstractC4344;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4878;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4893;
import kotlin.reflect.jvm.internal.impl.types.C4874;
import kotlin.reflect.jvm.internal.impl.types.InterfaceC4873;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind;
import p098.C7240;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.resolve.constants.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4765 {
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
    public static AbstractC4878 m9492(ArrayList arrayList) {
        Set setM8784;
        IntegerLiteralTypeConstructor$Companion$Mode integerLiteralTypeConstructor$Companion$Mode = IntegerLiteralTypeConstructor$Companion$Mode.INTERSECTION_TYPE;
        if (arrayList.isEmpty()) {
            return null;
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            C5925.m11308("Empty collection can't be reduced.");
            return null;
        }
        ?? next = it.next();
        while (it.hasNext()) {
            AbstractC4878 abstractC4878 = (AbstractC4878) it.next();
            next = (AbstractC4878) next;
            if (next != 0 && abstractC4878 != null) {
                InterfaceC4873 interfaceC4873Mo9722 = next.mo9722();
                InterfaceC4873 interfaceC4873Mo97222 = abstractC4878.mo9722();
                boolean z = interfaceC4873Mo9722 instanceof C4766;
                if (z && (interfaceC4873Mo97222 instanceof C4766)) {
                    Set set = ((C4766) interfaceC4873Mo9722).f13904;
                    Set set2 = ((C4766) interfaceC4873Mo97222).f13904;
                    int i = AbstractC4761.f13900[integerLiteralTypeConstructor$Companion$Mode.ordinal()];
                    if (i == 1) {
                        Set set3 = set;
                        Set set4 = set2;
                        set3.getClass();
                        set4.getClass();
                        Set setM8797 = set4 instanceof Collection ? set4 : AbstractC4344.m8797(set4);
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        for (Object obj : set3) {
                            if (setM8797.contains(obj)) {
                                linkedHashSet.add(obj);
                            }
                        }
                        setM8784 = linkedHashSet;
                    } else {
                        if (i != 2) {
                            C4211.m8611();
                            return null;
                        }
                        Set set5 = set;
                        Set set6 = set2;
                        set5.getClass();
                        set6.getClass();
                        setM8784 = AbstractC4344.m8784(set5);
                        AbstractC4344.m8804(set6, setM8784);
                    }
                    C4766 c4766 = new C4766(setM8784);
                    C4874.f14175.getClass();
                    C4874 c4874 = C4874.f14176;
                    c4874.getClass();
                    next = AbstractC4893.m9819(EmptyList.INSTANCE, c4874, c4766, C7240.m12472(ErrorScopeKind.INTEGER_LITERAL_TYPE_SCOPE, true, "unknown integer literal type"), false);
                } else if (z) {
                    if (((C4766) interfaceC4873Mo9722).f13904.contains(abstractC4878)) {
                        next = abstractC4878;
                    }
                } else if (!(interfaceC4873Mo97222 instanceof C4766) || !((C4766) interfaceC4873Mo97222).f13904.contains(next)) {
                }
            }
            next = 0;
        }
        return (AbstractC4878) next;
    }
}
