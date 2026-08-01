package top.yukonga.miuix.kmp.basic;

import androidx.compose.foundation.layout.C0666;
import androidx.compose.runtime.AbstractC1347;
import androidx.compose.runtime.C1324;
import androidx.compose.runtime.C1334;
import androidx.compose.runtime.C1369;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.ui.graphics.C1599;
import p344.AbstractC8824;
import p344.C8825;

/* JADX INFO: renamed from: top.yukonga.miuix.kmp.basic.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6012 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C0666 f16432 = new C0666(0.0f, 0.0f, 0.0f, 0.0f);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C6013 m11381(InterfaceC1373 interfaceC1373) {
        C1334 c1334 = AbstractC8824.f24832;
        long j = ((C1599) ((AbstractC1347) ((C8825) ((C1324) interfaceC1373).m2383(c1334)).f24839).getValue()).f4700;
        long j2 = ((C1599) ((AbstractC1347) ((C8825) ((C1324) interfaceC1373).m2383(c1334)).f24840).getValue()).f4700;
        boolean zM2361 = ((C1324) interfaceC1373).m2361(j) | ((C1324) interfaceC1373).m2361(j2);
        C1324 c1324 = (C1324) interfaceC1373;
        Object objM2345 = c1324.m2345();
        if (zM2361 || objM2345 == C1369.f3974) {
            objM2345 = new C6013(j, j2);
            c1324.m2386(objM2345);
        }
        return (C6013) objM2345;
    }
}
