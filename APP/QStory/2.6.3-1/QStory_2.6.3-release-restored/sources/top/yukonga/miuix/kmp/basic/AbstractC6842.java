package top.yukonga.miuix.kmp.basic;

import androidx.compose.foundation.layout.C1507;
import androidx.compose.p001ui.graphics.C2434;
import androidx.compose.runtime.AbstractC2182;
import androidx.compose.runtime.C2159;
import androidx.compose.runtime.C2169;
import androidx.compose.runtime.C2204;
import androidx.compose.runtime.InterfaceC2208;
import p360.AbstractC9653;
import p360.C9654;

/* JADX INFO: renamed from: top.yukonga.miuix.kmp.basic.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6842 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C1507 f16777 = new C1507(0.0f, 0.0f, 0.0f, 0.0f);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C6843 m11940(InterfaceC2208 interfaceC2208) {
        C2169 c2169 = AbstractC9653.f25177;
        long j = ((C2434) ((AbstractC2182) ((C9654) ((C2159) interfaceC2208).m2943(c2169)).f25184).getValue()).f5045;
        long j2 = ((C2434) ((AbstractC2182) ((C9654) ((C2159) interfaceC2208).m2943(c2169)).f25185).getValue()).f5045;
        boolean zM2921 = ((C2159) interfaceC2208).m2921(j) | ((C2159) interfaceC2208).m2921(j2);
        C2159 c2159 = (C2159) interfaceC2208;
        Object objM2905 = c2159.m2905();
        if (zM2921 || objM2905 == C2204.f4319) {
            objM2905 = new C6843(j, j2);
            c2159.m2946(objM2905);
        }
        return (C6843) objM2905;
    }
}
