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
import com.alibaba.fastjson2.C2941;
import kotlin.C5175;
import p052.InterfaceC6553;
import p052.InterfaceC6557;
import p205.C7892;
import p205.C7902;

/* JADX INFO: renamed from: top.yukonga.miuix.kmp.utils.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6066 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public void m11367(InterfaceC1373 interfaceC1373, int i) {
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2381(-74985928);
        int i2 = i & 1;
        if (c1324.m2333(i2, i2 != 0)) {
            SnapshotStateList snapshotStateList = (SnapshotStateList) c1324.m2373(AbstractC6067.f16597);
            SnapshotStateList snapshotStateList2 = (SnapshotStateList) c1324.m2373(AbstractC6067.f16598);
            C1865 c1865 = (C1865) ((InterfaceC1848) c1324.m2373(AbstractC1902.f5579));
            float fM13325 = C7902.m13325(c1865.m3474());
            if (C7892.m13291(C7902.m13326(c1865.m3474()), 480.0f) >= 0) {
                C7892.m13291(fM13325, 840.0f);
            }
            c1324.m2382(952973683);
            C1276 c1276 = (C1276) snapshotStateList.listIterator();
            if (c1276.hasNext()) {
                c1276.next().getClass();
                C2941.m6336();
                return;
            }
            c1324.m2367(false);
            c1324.m2382(952982109);
            C1276 c12762 = (C1276) snapshotStateList2.listIterator();
            if (c12762.hasNext()) {
                c12762.next().getClass();
                C2941.m6336();
                return;
            }
            c1324.m2367(false);
            Integer numValueOf = Integer.valueOf(snapshotStateList.size());
            Integer numValueOf2 = Integer.valueOf(snapshotStateList2.size());
            boolean zM2350 = c1324.m2350(snapshotStateList) | c1324.m2350(snapshotStateList2);
            Object objM2335 = c1324.m2335();
            C1353 c1353 = C1369.f3973;
            if (zM2350 || objM2335 == c1353) {
                objM2335 = new MiuixPopupUtils$Companion$MiuixPopupHost$1$1(snapshotStateList, snapshotStateList2, null);
                c1324.m2376(objM2335);
            }
            AbstractC1367.m2489(numValueOf, numValueOf2, (InterfaceC6553) objM2335, c1324);
            boolean zM23502 = c1324.m2350(snapshotStateList) | c1324.m2350(snapshotStateList2);
            Object objM23352 = c1324.m2335();
            if (zM23502 || objM23352 == c1353) {
                objM23352 = new C6063(snapshotStateList, 2, snapshotStateList2);
                c1324.m2376(objM23352);
            }
            AbstractC1367.m2475(C5175.f14739, (InterfaceC6557) objM23352, c1324);
        } else {
            c1324.m2329();
        }
        C1389 c1389M2365 = c1324.m2365();
        if (c1389M2365 != null) {
            c1389M2365.f4033 = new C0640(this, i, 14);
        }
    }
}
