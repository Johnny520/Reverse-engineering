package top.yukonga.miuix.kmp.utils;

import androidx.compose.foundation.layout.C1481;
import androidx.compose.p001ui.platform.AbstractC2737;
import androidx.compose.p001ui.platform.C2700;
import androidx.compose.p001ui.platform.InterfaceC2683;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.C2159;
import androidx.compose.runtime.C2188;
import androidx.compose.runtime.C2204;
import androidx.compose.runtime.C2224;
import androidx.compose.runtime.InterfaceC2208;
import androidx.compose.runtime.snapshots.C2111;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.alibaba.fastjson2.C3775;
import kotlin.C6008;
import p068.InterfaceC7383;
import p068.InterfaceC7387;
import p221.C8722;
import p221.C8732;

/* JADX INFO: renamed from: top.yukonga.miuix.kmp.utils.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6901 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public void m11986(InterfaceC2208 interfaceC2208, int i) {
        C2159 c2159 = (C2159) interfaceC2208;
        c2159.m2951(-74985928);
        int i2 = i & 1;
        if (c2159.m2903(i2, i2 != 0)) {
            SnapshotStateList snapshotStateList = (SnapshotStateList) c2159.m2943(AbstractC6902.f16951);
            SnapshotStateList snapshotStateList2 = (SnapshotStateList) c2159.m2943(AbstractC6902.f16952);
            C2700 c2700 = (C2700) ((InterfaceC2683) c2159.m2943(AbstractC2737.f5925));
            float fM13912 = C8732.m13912(c2700.m4044());
            if (C8722.m13878(C8732.m13913(c2700.m4044()), 480.0f) >= 0) {
                C8722.m13878(fM13912, 840.0f);
            }
            c2159.m2952(952973683);
            C2111 c2111 = (C2111) snapshotStateList.listIterator();
            if (c2111.hasNext()) {
                c2111.next().getClass();
                C3775.m6954();
                return;
            }
            c2159.m2937(false);
            c2159.m2952(952982109);
            C2111 c21112 = (C2111) snapshotStateList2.listIterator();
            if (c21112.hasNext()) {
                c21112.next().getClass();
                C3775.m6954();
                return;
            }
            c2159.m2937(false);
            Integer numValueOf = Integer.valueOf(snapshotStateList.size());
            Integer numValueOf2 = Integer.valueOf(snapshotStateList2.size());
            boolean zM2920 = c2159.m2920(snapshotStateList) | c2159.m2920(snapshotStateList2);
            Object objM2905 = c2159.m2905();
            C2188 c2188 = C2204.f4319;
            if (zM2920 || objM2905 == c2188) {
                objM2905 = new MiuixPopupUtils$Companion$MiuixPopupHost$1$1(snapshotStateList, snapshotStateList2, null);
                c2159.m2946(objM2905);
            }
            AbstractC2202.m3059(numValueOf, numValueOf2, (InterfaceC7383) objM2905, c2159);
            boolean zM29202 = c2159.m2920(snapshotStateList) | c2159.m2920(snapshotStateList2);
            Object objM29052 = c2159.m2905();
            if (zM29202 || objM29052 == c2188) {
                objM29052 = new C6898(snapshotStateList, 2, snapshotStateList2);
                c2159.m2946(objM29052);
            }
            AbstractC2202.m3044(C6008.f15084, (InterfaceC7387) objM29052, c2159);
        } else {
            c2159.m2899();
        }
        C2224 c2224M2935 = c2159.m2935();
        if (c2224M2935 != null) {
            c2224M2935.f4379 = new C1481(this, i, 14);
        }
    }
}
