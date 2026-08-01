package androidx.compose.ui.platform.accessibility;

import androidx.compose.ui.semantics.AbstractC1943;
import androidx.compose.ui.semantics.AbstractC1957;
import androidx.compose.ui.semantics.C1939;
import androidx.compose.ui.semantics.C1947;
import androidx.compose.ui.semantics.C1953;
import androidx.compose.ui.semantics.C1956;
import com.alibaba.fastjson2.C2942;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.AbstractC4344;
import kotlin.collections.EmptyList;
import p052.InterfaceC6543;
import p112.C7329;
import p124.C7413;
import p155.C7607;
import p207.AbstractC7914;

/* JADX INFO: renamed from: androidx.compose.ui.platform.accessibility.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1813 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final void m3447(C1953 c1953, C7607 c7607) {
        if (AbstractC1957.m3673(c1953.m3667(), AbstractC1943.f5748) != null) {
            C2942.m6394();
            return;
        }
        C1953 c1953M3668 = c1953.m3668();
        if (c1953M3668 == null || AbstractC1957.m3673(c1953M3668.m3667(), AbstractC1943.f5730) == null) {
            return;
        }
        C1939 c1939 = (C1939) AbstractC1957.m3673(c1953M3668.m3667(), AbstractC1943.f5729);
        if (c1939 == null || (c1939.f5703 >= 0 && c1939.f5702 >= 0)) {
            if (c1953.m3667().f5779.m752(AbstractC1943.f5723)) {
                ArrayList arrayList = new ArrayList();
                List listM3652 = C1953.m3652(4, c1953M3668);
                int size = listM3652.size();
                int i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    C1953 c19532 = (C1953) listM3652.get(i2);
                    if (c19532.m3667().f5779.m752(AbstractC1943.f5723)) {
                        arrayList.add(c19532);
                        if (c19532.f5770.m3253() < c1953.f5770.m3253()) {
                            i++;
                        }
                    }
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                boolean zM3448 = m3448(arrayList);
                int i3 = zM3448 ? 0 : i;
                int i4 = zM3448 ? i : 0;
                C1956 c1956M3667 = c1953.m3667();
                C1947 c1947 = AbstractC1943.f5723;
                CollectionInfo_androidKt$setCollectionItemInfo$itemInfo$1 collectionInfo_androidKt$setCollectionItemInfo$itemInfo$1 = new InterfaceC6543() { // from class: androidx.compose.ui.platform.accessibility.CollectionInfo_androidKt$setCollectionItemInfo$itemInfo$1
                    @Override // p052.InterfaceC6543
                    public final Boolean invoke() {
                        return Boolean.FALSE;
                    }
                };
                Object objM757 = c1956M3667.f5779.m757(c1947);
                if (objM757 == null) {
                    objM757 = collectionInfo_androidKt$setCollectionItemInfo$itemInfo$1.invoke();
                }
                c7607.m12841(C7413.m12642(((Boolean) objM757).booleanValue(), i3, 1, i4, 1));
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final boolean m3448(ArrayList arrayList) {
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
                    arrayList2.add(new C7329((((long) Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (c19532.m3666().m12520() >> 32)) - Float.intBitsToFloat((int) (c1953.m3666().m12520() >> 32))))) << 32) | (((long) Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (c19532.m3666().m12520() & 4294967295L)) - Float.intBitsToFloat((int) (c1953.m3666().m12520() & 4294967295L))))) & 4294967295L)));
                    obj = obj2;
                }
                list = arrayList2;
            }
            if (list.size() == 1) {
                j = ((C7329) AbstractC4344.m8820(list)).f19541;
            } else {
                if (list.isEmpty()) {
                    AbstractC7914.m13409("Empty collection can't be reduced.");
                }
                Object objM8820 = AbstractC4344.m8820(list);
                int size2 = list.size() - 1;
                if (1 <= size2) {
                    int i2 = 1;
                    while (true) {
                        objM8820 = new C7329(C7329.m12525(((C7329) objM8820).f19541, ((C7329) list.get(i2)).f19541));
                        if (i2 == size2) {
                            break;
                        }
                        i2++;
                    }
                }
                j = ((C7329) objM8820).f19541;
            }
            if (Float.intBitsToFloat((int) (4294967295L & j)) >= Float.intBitsToFloat((int) (j >> 32))) {
                return false;
            }
        }
        return true;
    }
}
