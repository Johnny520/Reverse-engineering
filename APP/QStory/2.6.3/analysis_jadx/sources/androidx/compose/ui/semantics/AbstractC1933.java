package androidx.compose.ui.semantics;

import androidx.collection.C0246;
import androidx.compose.ui.node.C1748;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import p052.InterfaceC6543;
import p052.InterfaceC6554;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: androidx.compose.ui.semantics.飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1933 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final InterfaceC6554 f5690;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final Comparator[] f5691;

    static {
        Comparator[] comparatorArr = new Comparator[2];
        int i = 0;
        int i2 = 0;
        while (i2 < 2) {
            comparatorArr[i2] = new C1934(new C1935(i2 == 0 ? C1936.f5698 : C1936.f5697, C1748.f5090), i);
            i2++;
        }
        f5691 = comparatorArr;
        f5690 = new InterfaceC6554() { // from class: androidx.compose.ui.semantics.SemanticsSortKt$UnmergedConfigComparator$1
            @Override // p052.InterfaceC6554
            public final Integer invoke(C1953 c1953, C1953 c19532) {
                C1956 c1956 = c1953.f5769;
                C1947 c1947 = AbstractC1943.f5739;
                AnonymousClass1 anonymousClass1 = new InterfaceC6543() { // from class: androidx.compose.ui.semantics.SemanticsSortKt$UnmergedConfigComparator$1.1
                    @Override // p052.InterfaceC6543
                    public final Float invoke() {
                        return Float.valueOf(0.0f);
                    }
                };
                Object objM757 = c1956.f5779.m757(c1947);
                if (objM757 == null) {
                    objM757 = anonymousClass1.invoke();
                }
                float fFloatValue = ((Number) objM757).floatValue();
                C1956 c19562 = c19532.f5769;
                AnonymousClass2 anonymousClass2 = new InterfaceC6543() { // from class: androidx.compose.ui.semantics.SemanticsSortKt$UnmergedConfigComparator$1.2
                    @Override // p052.InterfaceC6543
                    public final Float invoke() {
                        return Float.valueOf(0.0f);
                    }
                };
                Object objM7572 = c19562.f5779.m757(c1947);
                if (objM7572 == null) {
                    objM7572 = anonymousClass2.invoke();
                }
                return Integer.valueOf(Float.compare(fFloatValue, ((Number) objM7572).floatValue()));
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00db  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.ArrayList m3640(androidx.compose.ui.semantics.C1953 r17, p052.InterfaceC6558 r18, p052.InterfaceC6558 r19, java.util.List r20) {
        /*
            Method dump skipped, instruction units count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.semantics.AbstractC1933.m3640(androidx.compose.ui.semantics.飘花落叶言子楪哲苏兰世, 飘花落叶言世子哲楪兰苏.飘花落叶言子楪苏兰哲世, 飘花落叶言世子哲楪兰苏.飘花落叶言子楪苏兰哲世, java.util.List):java.util.ArrayList");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m3641(C1953 c1953, ArrayList arrayList, InterfaceC6558 interfaceC6558, InterfaceC6558 interfaceC65582, C0246 c0246) {
        C1956 c1956 = c1953.f5769;
        C1947 c1947 = AbstractC1943.f5741;
        SemanticsSortKt$geometryDepthFirstSearch$isTraversalGroup$1 semanticsSortKt$geometryDepthFirstSearch$isTraversalGroup$1 = new InterfaceC6543() { // from class: androidx.compose.ui.semantics.SemanticsSortKt$geometryDepthFirstSearch$isTraversalGroup$1
            @Override // p052.InterfaceC6543
            public final Boolean invoke() {
                return Boolean.FALSE;
            }
        };
        Object objM757 = c1956.f5779.m757(c1947);
        if (objM757 == null) {
            objM757 = semanticsSortKt$geometryDepthFirstSearch$isTraversalGroup$1.invoke();
        }
        boolean zBooleanValue = ((Boolean) objM757).booleanValue();
        if ((zBooleanValue || ((Boolean) interfaceC65582.invoke(c1953)).booleanValue()) && ((Boolean) interfaceC6558.invoke(c1953)).booleanValue()) {
            arrayList.add(c1953);
        }
        if (zBooleanValue) {
            c0246.m790(c1953.f5767, m3640(c1953, interfaceC6558, interfaceC65582, C1953.m3652(7, c1953)));
            return;
        }
        List listM3652 = C1953.m3652(7, c1953);
        int size = listM3652.size();
        for (int i = 0; i < size; i++) {
            m3641((C1953) listM3652.get(i), arrayList, interfaceC6558, interfaceC65582, c0246);
        }
    }
}
