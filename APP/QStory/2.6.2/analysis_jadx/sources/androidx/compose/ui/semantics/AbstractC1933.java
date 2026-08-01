package androidx.compose.ui.semantics;

import androidx.collection.C0246;
import androidx.compose.ui.node.C1748;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import p052.InterfaceC6542;
import p052.InterfaceC6553;
import p052.InterfaceC6557;

/* JADX INFO: renamed from: androidx.compose.ui.semantics.飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1933 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final InterfaceC6553 f5689;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final Comparator[] f5690;

    static {
        Comparator[] comparatorArr = new Comparator[2];
        int i = 0;
        int i2 = 0;
        while (i2 < 2) {
            comparatorArr[i2] = new C1934(new C1935(i2 == 0 ? C1936.f5697 : C1936.f5696, C1748.f5089), i);
            i2++;
        }
        f5690 = comparatorArr;
        f5689 = new InterfaceC6553() { // from class: androidx.compose.ui.semantics.SemanticsSortKt$UnmergedConfigComparator$1
            @Override // p052.InterfaceC6553
            public final Integer invoke(C1953 c1953, C1953 c19532) {
                C1956 c1956 = c1953.f5768;
                C1947 c1947 = AbstractC1943.f5738;
                AnonymousClass1 anonymousClass1 = new InterfaceC6542() { // from class: androidx.compose.ui.semantics.SemanticsSortKt$UnmergedConfigComparator$1.1
                    @Override // p052.InterfaceC6542
                    public final Float invoke() {
                        return Float.valueOf(0.0f);
                    }
                };
                Object objM756 = c1956.f5778.m756(c1947);
                if (objM756 == null) {
                    objM756 = anonymousClass1.invoke();
                }
                float fFloatValue = ((Number) objM756).floatValue();
                C1956 c19562 = c19532.f5768;
                AnonymousClass2 anonymousClass2 = new InterfaceC6542() { // from class: androidx.compose.ui.semantics.SemanticsSortKt$UnmergedConfigComparator$1.2
                    @Override // p052.InterfaceC6542
                    public final Float invoke() {
                        return Float.valueOf(0.0f);
                    }
                };
                Object objM7562 = c19562.f5778.m756(c1947);
                if (objM7562 == null) {
                    objM7562 = anonymousClass2.invoke();
                }
                return Integer.valueOf(Float.compare(fFloatValue, ((Number) objM7562).floatValue()));
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00db  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.ArrayList m3630(androidx.compose.ui.semantics.C1953 r17, p052.InterfaceC6557 r18, p052.InterfaceC6557 r19, java.util.List r20) {
        /*
            Method dump skipped, instruction units count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.semantics.AbstractC1933.m3630(androidx.compose.ui.semantics.飘花落叶言子楪哲苏兰世, 飘花落叶言世子哲楪兰苏.飘花落叶言子楪苏兰哲世, 飘花落叶言世子哲楪兰苏.飘花落叶言子楪苏兰哲世, java.util.List):java.util.ArrayList");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m3631(C1953 c1953, ArrayList arrayList, InterfaceC6557 interfaceC6557, InterfaceC6557 interfaceC65572, C0246 c0246) {
        C1956 c1956 = c1953.f5768;
        C1947 c1947 = AbstractC1943.f5740;
        SemanticsSortKt$geometryDepthFirstSearch$isTraversalGroup$1 semanticsSortKt$geometryDepthFirstSearch$isTraversalGroup$1 = new InterfaceC6542() { // from class: androidx.compose.ui.semantics.SemanticsSortKt$geometryDepthFirstSearch$isTraversalGroup$1
            @Override // p052.InterfaceC6542
            public final Boolean invoke() {
                return Boolean.FALSE;
            }
        };
        Object objM756 = c1956.f5778.m756(c1947);
        if (objM756 == null) {
            objM756 = semanticsSortKt$geometryDepthFirstSearch$isTraversalGroup$1.invoke();
        }
        boolean zBooleanValue = ((Boolean) objM756).booleanValue();
        if ((zBooleanValue || ((Boolean) interfaceC65572.invoke(c1953)).booleanValue()) && ((Boolean) interfaceC6557.invoke(c1953)).booleanValue()) {
            arrayList.add(c1953);
        }
        if (zBooleanValue) {
            c0246.m789(c1953.f5766, m3630(c1953, interfaceC6557, interfaceC65572, C1953.m3642(7, c1953)));
            return;
        }
        List listM3642 = C1953.m3642(7, c1953);
        int size = listM3642.size();
        for (int i = 0; i < size; i++) {
            m3631((C1953) listM3642.get(i), arrayList, interfaceC6557, interfaceC65572, c0246);
        }
    }
}
