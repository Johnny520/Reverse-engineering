package androidx.compose.foundation.lazy;

import androidx.compose.foundation.layout.InterfaceC0659;
import androidx.compose.foundation.lazy.layout.C0720;
import androidx.compose.foundation.text.AbstractC0968;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.C1324;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.runtime.internal.C1242;
import androidx.compose.ui.InterfaceC2129;
import kotlin.C5175;
import p052.InterfaceC6553;
import top.yukonga.miuix.kmp.extra.AbstractC6036;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0764 implements InterfaceC6553 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ int f2231;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f2232;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2233;

    public /* synthetic */ C0764(InterfaceC2129 interfaceC2129, int i, int i2) {
        this.f2233 = 1;
        this.f2232 = interfaceC2129;
        this.f2231 = i2;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f2233;
        C5175 c5175 = C5175.f14739;
        int i2 = this.f2231;
        Object obj3 = this.f2232;
        switch (i) {
            case 0:
                C0762 c0762 = (C0762) obj3;
                InterfaceC1373 interfaceC1373 = (InterfaceC1373) obj;
                int iIntValue = ((Integer) obj2).intValue();
                C1324 c1324 = (C1324) interfaceC1373;
                if (!c1324.m2333(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c1324.m2329();
                } else {
                    C0720 c0720M1466 = c0762.f2227.f2223.m1466(i2);
                    ((C1242) c0720M1466.f2026.f318).invoke(c0762.f2226, Integer.valueOf(i2 - c0720M1466.f2028), c1324, 0);
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                AbstractC0968.m1874((InterfaceC2129) obj3, (InterfaceC1373) obj, AbstractC1367.m2460(1), i2);
                break;
            default:
                ((Integer) obj2).getClass();
                AbstractC6036.m11344((InterfaceC0659) obj3, (InterfaceC1373) obj, AbstractC1367.m2460(i2 | 1));
                break;
        }
        return c5175;
    }

    public /* synthetic */ C0764(Object obj, int i, int i2) {
        this.f2233 = i2;
        this.f2232 = obj;
        this.f2231 = i;
    }
}
