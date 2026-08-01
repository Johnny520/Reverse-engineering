package androidx.compose.ui.platform.accessibility;

import androidx.compose.ui.semantics.AbstractC1943;
import androidx.compose.ui.semantics.AbstractC1957;
import androidx.compose.ui.semantics.C1939;
import androidx.compose.ui.semantics.C1947;
import androidx.compose.ui.semantics.C1953;
import androidx.compose.ui.semantics.C1956;
import com.alibaba.fastjson2.C2941;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.AbstractC4343;
import kotlin.collections.EmptyList;
import p052.InterfaceC6542;
import p112.C7328;
import p124.C7412;
import p155.C7606;
import p207.AbstractC7913;

/* JADX INFO: renamed from: androidx.compose.ui.platform.accessibility.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1813 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final void m3437(C1953 c1953, C7606 c7606) {
        if (AbstractC1957.m3663(c1953.m3657(), AbstractC1943.f5747) != null) {
            C2941.m6336();
            return;
        }
        C1953 c1953M3658 = c1953.m3658();
        if (c1953M3658 == null || AbstractC1957.m3663(c1953M3658.m3657(), AbstractC1943.f5729) == null) {
            return;
        }
        C1939 c1939 = (C1939) AbstractC1957.m3663(c1953M3658.m3657(), AbstractC1943.f5728);
        if (c1939 == null || (c1939.f5702 >= 0 && c1939.f5701 >= 0)) {
            if (c1953.m3657().f5778.m751(AbstractC1943.f5722)) {
                ArrayList arrayList = new ArrayList();
                List listM3642 = C1953.m3642(4, c1953M3658);
                int size = listM3642.size();
                int i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    C1953 c19532 = (C1953) listM3642.get(i2);
                    if (c19532.m3657().f5778.m751(AbstractC1943.f5722)) {
                        arrayList.add(c19532);
                        if (c19532.f5769.m3243() < c1953.f5769.m3243()) {
                            i++;
                        }
                    }
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                boolean zM3438 = m3438(arrayList);
                int i3 = zM3438 ? 0 : i;
                int i4 = zM3438 ? i : 0;
                C1956 c1956M3657 = c1953.m3657();
                C1947 c1947 = AbstractC1943.f5722;
                CollectionInfo_androidKt$setCollectionItemInfo$itemInfo$1 collectionInfo_androidKt$setCollectionItemInfo$itemInfo$1 = new InterfaceC6542() { // from class: androidx.compose.ui.platform.accessibility.CollectionInfo_androidKt$setCollectionItemInfo$itemInfo$1
                    @Override // p052.InterfaceC6542
                    public final Boolean invoke() {
                        return Boolean.FALSE;
                    }
                };
                Object objM756 = c1956M3657.f5778.m756(c1947);
                if (objM756 == null) {
                    objM756 = collectionInfo_androidKt$setCollectionItemInfo$itemInfo$1.invoke();
                }
                c7606.m12812(C7412.m12615(((Boolean) objM756).booleanValue(), i3, 1, i4, 1));
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final boolean m3438(ArrayList arrayList) {
        List list;
        long j;
        if (arrayList.size() >= 2) {
            if (arrayList.size() <= 1) {
                list = EmptyList.INSTANCE;
            } else {
                ArrayList arrayList2 = new ArrayList();
                Object obj = arrayList.get(0);
                int size = arrayList.size() - 1;
                int i = 0;
                while (i < size) {
                    i++;
                    Object obj2 = arrayList.get(i);
                    C1953 c1953 = (C1953) obj2;
                    C1953 c19532 = (C1953) obj;
                    arrayList2.add(new C7328((((long) Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (c19532.m3656().m12493() >> 32)) - Float.intBitsToFloat((int) (c1953.m3656().m12493() >> 32))))) << 32) | (((long) Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (c19532.m3656().m12493() & 4294967295L)) - Float.intBitsToFloat((int) (c1953.m3656().m12493() & 4294967295L))))) & 4294967295L)));
                    obj = obj2;
                }
                list = arrayList2;
            }
            if (list.size() == 1) {
                j = ((C7328) AbstractC4343.m8827(list)).f19546;
            } else {
                if (list.isEmpty()) {
                    AbstractC7913.m13381("Empty collection can't be reduced.");
                }
                Object objM8827 = AbstractC4343.m8827(list);
                int size2 = list.size() - 1;
                if (1 <= size2) {
                    int i2 = 1;
                    while (true) {
                        objM8827 = new C7328(C7328.m12498(((C7328) objM8827).f19546, ((C7328) list.get(i2)).f19546));
                        if (i2 == size2) {
                            break;
                        }
                        i2++;
                    }
                }
                j = ((C7328) objM8827).f19546;
            }
            if (Float.intBitsToFloat((int) (4294967295L & j)) >= Float.intBitsToFloat((int) (j >> 32))) {
                return false;
            }
        }
        return true;
    }
}
