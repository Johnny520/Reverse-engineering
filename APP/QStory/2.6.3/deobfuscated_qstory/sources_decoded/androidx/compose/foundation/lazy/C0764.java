package androidx.compose.foundation.lazy;

import androidx.compose.foundation.layout.InterfaceC0659;
import androidx.compose.foundation.lazy.layout.C0720;
import androidx.compose.foundation.text.AbstractC0968;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.C1324;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.runtime.internal.C1242;
import androidx.compose.ui.InterfaceC2129;
import kotlin.C5176;
import p052.InterfaceC6554;
import top.yukonga.miuix.kmp.extra.AbstractC6042;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0764 implements InterfaceC6554 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ int f2232;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f2233;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2234;

    public /* synthetic */ C0764(InterfaceC2129 interfaceC2129, int i, int i2) {
        this.f2234 = 1;
        this.f2233 = interfaceC2129;
        this.f2232 = i2;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f2234;
        C5176 c5176 = C5176.f14739;
        int i2 = this.f2232;
        Object obj3 = this.f2233;
        switch (i) {
            case 0:
                C0762 c0762 = (C0762) obj3;
                InterfaceC1373 interfaceC1373 = (InterfaceC1373) obj;
                int iIntValue = ((Integer) obj2).intValue();
                C1324 c1324 = (C1324) interfaceC1373;
                if (!c1324.m2343(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c1324.m2339();
                } else {
                    C0720 c0720M1476 = c0762.f2228.f2224.m1476(i2);
                    ((C1242) c0720M1476.f2027.f318).invoke(c0762.f2227, Integer.valueOf(i2 - c0720M1476.f2029), c1324, 0);
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                AbstractC0968.m1884((InterfaceC2129) obj3, (InterfaceC1373) obj, AbstractC1367.m2471(1), i2);
                break;
            default:
                ((Integer) obj2).getClass();
                AbstractC6042.m11404((InterfaceC0659) obj3, (InterfaceC1373) obj, AbstractC1367.m2471(i2 | 1));
                break;
        }
        return c5176;
    }

    public /* synthetic */ C0764(Object obj, int i, int i2) {
        this.f2234 = i2;
        this.f2233 = obj;
        this.f2232 = i;
    }
}
