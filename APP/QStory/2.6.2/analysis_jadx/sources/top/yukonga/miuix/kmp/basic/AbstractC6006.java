package top.yukonga.miuix.kmp.basic;

import androidx.compose.foundation.layout.C0666;
import androidx.compose.runtime.AbstractC1347;
import androidx.compose.runtime.C1324;
import androidx.compose.runtime.C1334;
import androidx.compose.runtime.C1369;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.ui.graphics.C1599;
import p345.AbstractC8838;
import p345.C8839;

/* JADX INFO: renamed from: top.yukonga.miuix.kmp.basic.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6006 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C0666 f16423 = new C0666(0.0f, 0.0f, 0.0f, 0.0f);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C6007 m11321(InterfaceC1373 interfaceC1373) {
        C1334 c1334 = AbstractC8838.f24849;
        long j = ((C1599) ((AbstractC1347) ((C8839) ((C1324) interfaceC1373).m2373(c1334)).f24856).getValue()).f4699;
        long j2 = ((C1599) ((AbstractC1347) ((C8839) ((C1324) interfaceC1373).m2373(c1334)).f24857).getValue()).f4699;
        boolean zM2351 = ((C1324) interfaceC1373).m2351(j) | ((C1324) interfaceC1373).m2351(j2);
        C1324 c1324 = (C1324) interfaceC1373;
        Object objM2335 = c1324.m2335();
        if (zM2351 || objM2335 == C1369.f3973) {
            objM2335 = new C6007(j, j2);
            c1324.m2376(objM2335);
        }
        return (C6007) objM2335;
    }
}
