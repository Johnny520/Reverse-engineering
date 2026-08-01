package androidx.compose.p001ui.semantics;

import androidx.collection.AbstractC1120;
import androidx.collection.C1093;
import androidx.compose.p001ui.node.C2583;
import androidx.compose.p001ui.unit.LayoutDirection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.AbstractC5168;
import p050.AbstractC7176;
import p068.InterfaceC7372;
import p068.InterfaceC7383;
import p068.InterfaceC7387;
import p128.C8157;

/* JADX INFO: renamed from: androidx.compose.ui.semantics.飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2768 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final InterfaceC7383 f6035;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final Comparator[] f6036;

    static {
        Comparator[] comparatorArr = new Comparator[2];
        int i = 0;
        int i2 = 0;
        while (i2 < 2) {
            comparatorArr[i2] = new C2769(new C2770(i2 == 0 ? C2771.f6043 : C2771.f6042, C2583.f5435), i);
            i2++;
        }
        f6036 = comparatorArr;
        f6035 = new InterfaceC7383() { // from class: androidx.compose.ui.semantics.SemanticsSortKt$UnmergedConfigComparator$1
            @Override // p068.InterfaceC7383
            public final Integer invoke(C2788 c2788, C2788 c27882) {
                C2791 c2791 = c2788.f6114;
                C2782 c2782 = AbstractC2778.f6084;
                C02191 c02191 = new InterfaceC7372() { // from class: androidx.compose.ui.semantics.SemanticsSortKt$UnmergedConfigComparator$1.1
                    @Override // p068.InterfaceC7372
                    public final Float invoke() {
                        return Float.valueOf(0.0f);
                    }
                };
                Object objM1317 = c2791.f6124.m1317(c2782);
                if (objM1317 == null) {
                    objM1317 = c02191.invoke();
                }
                float fFloatValue = ((Number) objM1317).floatValue();
                C2791 c27912 = c27882.f6114;
                C02202 c02202 = new InterfaceC7372() { // from class: androidx.compose.ui.semantics.SemanticsSortKt$UnmergedConfigComparator$1.2
                    @Override // p068.InterfaceC7372
                    public final Float invoke() {
                        return Float.valueOf(0.0f);
                    }
                };
                Object objM13172 = c27912.f6124.m1317(c2782);
                if (objM13172 == null) {
                    objM13172 = c02202.invoke();
                }
                return Integer.valueOf(Float.compare(fFloatValue, ((Number) objM13172).floatValue()));
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00db  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final ArrayList m4200(C2788 c2788, InterfaceC7387 interfaceC7387, InterfaceC7387 interfaceC73872, List list) {
        int i;
        C1093 c1093 = AbstractC1120.f1323;
        C1093 c10932 = new C1093();
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            m4201((C2788) list.get(i2), arrayList, interfaceC7387, interfaceC73872, c10932);
        }
        int i3 = 1;
        char c = c2788.f6115.f5445 == LayoutDirection.Rtl ? (char) 1 : (char) 0;
        ArrayList arrayList2 = new ArrayList(arrayList.size() / 2);
        int size2 = arrayList.size() - 1;
        if (size2 >= 0) {
            int i4 = 0;
            while (true) {
                C2788 c27882 = (C2788) arrayList.get(i4);
                if (i4 != 0) {
                    float f = c27882.m4225().f19884;
                    float f2 = c27882.m4225().f19882;
                    int i5 = f >= f2 ? i3 : 0;
                    int size3 = arrayList2.size() - i3;
                    if (size3 >= 0) {
                        int i6 = 0;
                        while (true) {
                            C8157 c8157 = (C8157) ((Pair) arrayList2.get(i6)).getFirst();
                            i = i3;
                            float f3 = c8157.f19884;
                            float f4 = c8157.f19882;
                            int i7 = f3 >= f4 ? i : 0;
                            if (i5 == 0 && i7 == 0 && Math.max(f, f3) < Math.min(f2, f4)) {
                                arrayList2.set(i6, new Pair(new C8157(Math.max(c8157.f19885, 0.0f), Math.max(c8157.f19884, f), Math.min(c8157.f19883, Float.POSITIVE_INFINITY), Math.min(f4, f2)), ((Pair) arrayList2.get(i6)).getSecond()));
                                ((List) ((Pair) arrayList2.get(i6)).getSecond()).add(c27882);
                                break;
                            }
                            if (i6 == size3) {
                                break;
                            }
                            i6++;
                            i3 = i;
                        }
                    } else {
                        i = i3;
                    }
                    arrayList2.add(new Pair(c27882.m4225(), AbstractC7176.m12475(c27882)));
                    if (i4 == size2) {
                        break;
                    }
                    i4++;
                    i3 = i;
                }
            }
        }
        AbstractC5168.m9325(arrayList2, C2771.f6041);
        ArrayList arrayList3 = new ArrayList();
        Comparator comparator = f6036[c ^ 1];
        int size4 = arrayList2.size();
        for (int i8 = 0; i8 < size4; i8++) {
            Pair pair = (Pair) arrayList2.get(i8);
            AbstractC5168.m9325((List) pair.getSecond(), comparator);
            arrayList3.addAll((Collection) pair.getSecond());
        }
        AbstractC5168.m9325(arrayList3, new C2780(f6035, 0));
        int size5 = 0;
        while (size5 <= arrayList3.size() - 1) {
            List list2 = (List) c10932.m1393(((C2788) arrayList3.get(size5)).f6112);
            if (list2 != null) {
                if (((Boolean) interfaceC73872.invoke(arrayList3.get(size5))).booleanValue()) {
                    size5++;
                } else {
                    arrayList3.remove(size5);
                }
                arrayList3.addAll(size5, list2);
                size5 += list2.size();
            } else {
                size5++;
            }
        }
        return arrayList3;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m4201(C2788 c2788, ArrayList arrayList, InterfaceC7387 interfaceC7387, InterfaceC7387 interfaceC73872, C1093 c1093) {
        C2791 c2791 = c2788.f6114;
        C2782 c2782 = AbstractC2778.f6086;
        SemanticsSortKt$geometryDepthFirstSearch$isTraversalGroup$1 semanticsSortKt$geometryDepthFirstSearch$isTraversalGroup$1 = new InterfaceC7372() { // from class: androidx.compose.ui.semantics.SemanticsSortKt$geometryDepthFirstSearch$isTraversalGroup$1
            @Override // p068.InterfaceC7372
            public final Boolean invoke() {
                return Boolean.FALSE;
            }
        };
        Object objM1317 = c2791.f6124.m1317(c2782);
        if (objM1317 == null) {
            objM1317 = semanticsSortKt$geometryDepthFirstSearch$isTraversalGroup$1.invoke();
        }
        boolean zBooleanValue = ((Boolean) objM1317).booleanValue();
        if ((zBooleanValue || ((Boolean) interfaceC73872.invoke(c2788)).booleanValue()) && ((Boolean) interfaceC7387.invoke(c2788)).booleanValue()) {
            arrayList.add(c2788);
        }
        if (zBooleanValue) {
            c1093.m1350(c2788.f6112, m4200(c2788, interfaceC7387, interfaceC73872, C2788.m4212(7, c2788)));
            return;
        }
        List listM4212 = C2788.m4212(7, c2788);
        int size = listM4212.size();
        for (int i = 0; i < size; i++) {
            m4201((C2788) listM4212.get(i), arrayList, interfaceC7387, interfaceC73872, c1093);
        }
    }
}
