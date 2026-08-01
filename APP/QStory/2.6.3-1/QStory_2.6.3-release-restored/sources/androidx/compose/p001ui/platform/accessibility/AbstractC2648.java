package androidx.compose.p001ui.platform.accessibility;

import androidx.compose.p001ui.semantics.AbstractC2778;
import androidx.compose.p001ui.semantics.AbstractC2792;
import androidx.compose.p001ui.semantics.C2774;
import androidx.compose.p001ui.semantics.C2782;
import androidx.compose.p001ui.semantics.C2788;
import androidx.compose.p001ui.semantics.C2791;
import com.alibaba.fastjson2.C3775;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.AbstractC5176;
import kotlin.collections.EmptyList;
import p068.InterfaceC7372;
import p128.C8158;
import p140.C8242;
import p171.C8436;
import p223.AbstractC8743;

/* JADX INFO: renamed from: androidx.compose.ui.platform.accessibility.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2648 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final void m4007(C2788 c2788, C8436 c8436) {
        if (AbstractC2792.m4233(c2788.m4227(), AbstractC2778.f6093) != null) {
            C3775.m6954();
            return;
        }
        C2788 c2788M4228 = c2788.m4228();
        if (c2788M4228 == null || AbstractC2792.m4233(c2788M4228.m4227(), AbstractC2778.f6075) == null) {
            return;
        }
        C2774 c2774 = (C2774) AbstractC2792.m4233(c2788M4228.m4227(), AbstractC2778.f6074);
        if (c2774 == null || (c2774.f6048 >= 0 && c2774.f6047 >= 0)) {
            if (c2788.m4227().f6124.m1312(AbstractC2778.f6068)) {
                ArrayList arrayList = new ArrayList();
                List listM4212 = C2788.m4212(4, c2788M4228);
                int size = listM4212.size();
                int i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    C2788 c27882 = (C2788) listM4212.get(i2);
                    if (c27882.m4227().f6124.m1312(AbstractC2778.f6068)) {
                        arrayList.add(c27882);
                        if (c27882.f6115.m3813() < c2788.f6115.m3813()) {
                            i++;
                        }
                    }
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                boolean zM4008 = m4008(arrayList);
                int i3 = zM4008 ? 0 : i;
                int i4 = zM4008 ? i : 0;
                C2791 c2791M4227 = c2788.m4227();
                C2782 c2782 = AbstractC2778.f6068;
                CollectionInfo_androidKt$setCollectionItemInfo$itemInfo$1 collectionInfo_androidKt$setCollectionItemInfo$itemInfo$1 = new InterfaceC7372() { // from class: androidx.compose.ui.platform.accessibility.CollectionInfo_androidKt$setCollectionItemInfo$itemInfo$1
                    @Override // p068.InterfaceC7372
                    public final Boolean invoke() {
                        return Boolean.FALSE;
                    }
                };
                Object objM1317 = c2791M4227.f6124.m1317(c2782);
                if (objM1317 == null) {
                    objM1317 = collectionInfo_androidKt$setCollectionItemInfo$itemInfo$1.invoke();
                }
                c8436.m13400(C8242.m13201(((Boolean) objM1317).booleanValue(), i3, 1, i4, 1));
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final boolean m4008(ArrayList arrayList) {
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
                    C2788 c2788 = (C2788) obj2;
                    C2788 c27882 = (C2788) obj;
                    arrayList2.add(new C8158((((long) Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (c27882.m4226().m13079() >> 32)) - Float.intBitsToFloat((int) (c2788.m4226().m13079() >> 32))))) << 32) | (((long) Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (c27882.m4226().m13079() & 4294967295L)) - Float.intBitsToFloat((int) (c2788.m4226().m13079() & 4294967295L))))) & 4294967295L)));
                    obj = obj2;
                }
                list = arrayList2;
            }
            if (list.size() == 1) {
                j = ((C8158) AbstractC5176.m9379(list)).f19886;
            } else {
                if (list.isEmpty()) {
                    AbstractC8743.m13968("Empty collection can't be reduced.");
                }
                Object objM9379 = AbstractC5176.m9379(list);
                int size2 = list.size() - 1;
                if (1 <= size2) {
                    int i2 = 1;
                    while (true) {
                        objM9379 = new C8158(C8158.m13084(((C8158) objM9379).f19886, ((C8158) list.get(i2)).f19886));
                        if (i2 == size2) {
                            break;
                        }
                        i2++;
                    }
                }
                j = ((C8158) objM9379).f19886;
            }
            if (Float.intBitsToFloat((int) (4294967295L & j)) >= Float.intBitsToFloat((int) (j >> 32))) {
                return false;
            }
        }
        return true;
    }
}
