package top.yukonga.miuix.kmp.utils;

import androidx.compose.foundation.layout.C0640;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.C1324;
import androidx.compose.runtime.C1353;
import androidx.compose.runtime.C1369;
import androidx.compose.runtime.C1389;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.runtime.snapshots.C1276;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.platform.AbstractC1902;
import androidx.compose.ui.platform.C1865;
import androidx.compose.ui.platform.InterfaceC1848;
import com.alibaba.fastjson2.C2942;
import kotlin.C5176;
import p052.InterfaceC6554;
import p052.InterfaceC6558;
import p205.C7893;
import p205.C7903;

/* JADX INFO: renamed from: top.yukonga.miuix.kmp.utils.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6072 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public void m11427(InterfaceC1373 interfaceC1373, int i) {
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2391(-74985928);
        int i2 = i & 1;
        if (c1324.m2343(i2, i2 != 0)) {
            SnapshotStateList snapshotStateList = (SnapshotStateList) c1324.m2383(AbstractC6073.f16606);
            SnapshotStateList snapshotStateList2 = (SnapshotStateList) c1324.m2383(AbstractC6073.f16607);
            C1865 c1865 = (C1865) ((InterfaceC1848) c1324.m2383(AbstractC1902.f5580));
            float fM13353 = C7903.m13353(c1865.m3484());
            if (C7893.m13319(C7903.m13354(c1865.m3484()), 480.0f) >= 0) {
                C7893.m13319(fM13353, 840.0f);
            }
            c1324.m2392(952973683);
            C1276 c1276 = (C1276) snapshotStateList.listIterator();
            if (c1276.hasNext()) {
                c1276.next().getClass();
                C2942.m6394();
                return;
            }
            c1324.m2377(false);
            c1324.m2392(952982109);
            C1276 c12762 = (C1276) snapshotStateList2.listIterator();
            if (c12762.hasNext()) {
                c12762.next().getClass();
                C2942.m6394();
                return;
            }
            c1324.m2377(false);
            Integer numValueOf = Integer.valueOf(snapshotStateList.size());
            Integer numValueOf2 = Integer.valueOf(snapshotStateList2.size());
            boolean zM2360 = c1324.m2360(snapshotStateList) | c1324.m2360(snapshotStateList2);
            Object objM2345 = c1324.m2345();
            C1353 c1353 = C1369.f3974;
            if (zM2360 || objM2345 == c1353) {
                objM2345 = new MiuixPopupUtils$Companion$MiuixPopupHost$1$1(snapshotStateList, snapshotStateList2, null);
                c1324.m2386(objM2345);
            }
            AbstractC1367.m2499(numValueOf, numValueOf2, (InterfaceC6554) objM2345, c1324);
            boolean zM23602 = c1324.m2360(snapshotStateList) | c1324.m2360(snapshotStateList2);
            Object objM23452 = c1324.m2345();
            if (zM23602 || objM23452 == c1353) {
                objM23452 = new C6069(snapshotStateList, 2, snapshotStateList2);
                c1324.m2386(objM23452);
            }
            AbstractC1367.m2484(C5176.f14739, (InterfaceC6558) objM23452, c1324);
        } else {
            c1324.m2339();
        }
        C1389 c1389M2375 = c1324.m2375();
        if (c1389M2375 != null) {
            c1389M2375.f4034 = new C0640(this, i, 14);
        }
    }
}
