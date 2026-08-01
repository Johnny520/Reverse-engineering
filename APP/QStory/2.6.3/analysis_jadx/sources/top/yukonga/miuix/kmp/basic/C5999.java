package top.yukonga.miuix.kmp.basic;

import androidx.compose.foundation.layout.InterfaceC0608;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.C1324;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.runtime.internal.C1242;
import kotlin.C5176;
import p052.InterfaceC6554;

/* JADX INFO: renamed from: top.yukonga.miuix.kmp.basic.飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5999 implements InterfaceC6554 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC0608 f16364;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ C1242 f16365;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC6554 f16366;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC6554 f16367;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final /* synthetic */ int f16368;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC6554 f16369;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final /* synthetic */ int f16370;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC6554 f16371;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC6554 f16372;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC6554 f16373;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f16374 = 0;

    public /* synthetic */ C5999(InterfaceC6554 interfaceC6554, InterfaceC6554 interfaceC65542, InterfaceC6554 interfaceC65543, InterfaceC6554 interfaceC65544, int i, InterfaceC6554 interfaceC65545, int i2, InterfaceC6554 interfaceC65546, InterfaceC0608 interfaceC0608, C1242 c1242, int i3) {
        this.f16372 = interfaceC6554;
        this.f16373 = interfaceC65542;
        this.f16367 = interfaceC65543;
        this.f16366 = interfaceC65544;
        this.f16370 = i;
        this.f16371 = interfaceC65545;
        this.f16368 = i2;
        this.f16369 = interfaceC65546;
        this.f16364 = interfaceC0608;
        this.f16365 = c1242;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f16374;
        C5176 c5176 = C5176.f14739;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC6032.m11384(this.f16372, this.f16373, this.f16367, this.f16366, this.f16370, this.f16371, this.f16368, this.f16369, this.f16364, this.f16365, (InterfaceC1373) obj, AbstractC1367.m2471(1));
                break;
            default:
                C6025 c6025 = (C6025) this.f16364;
                InterfaceC1373 interfaceC1373 = (InterfaceC1373) obj;
                int iIntValue = ((Integer) obj2).intValue();
                C1324 c1324 = (C1324) interfaceC1373;
                if (!c1324.m2343(1 & iIntValue, (iIntValue & 3) != 2)) {
                    c1324.m2339();
                } else {
                    AbstractC6032.m11384(this.f16372, this.f16373, this.f16367, this.f16366, this.f16370, this.f16371, this.f16368, this.f16369, c6025, this.f16365, c1324, 0);
                }
                break;
        }
        return c5176;
    }

    public /* synthetic */ C5999(InterfaceC6554 interfaceC6554, InterfaceC6554 interfaceC65542, InterfaceC6554 interfaceC65543, InterfaceC6554 interfaceC65544, int i, InterfaceC6554 interfaceC65545, int i2, InterfaceC6554 interfaceC65546, C6025 c6025, C1242 c1242) {
        this.f16372 = interfaceC6554;
        this.f16373 = interfaceC65542;
        this.f16367 = interfaceC65543;
        this.f16366 = interfaceC65544;
        this.f16370 = i;
        this.f16371 = interfaceC65545;
        this.f16368 = i2;
        this.f16369 = interfaceC65546;
        this.f16364 = c6025;
        this.f16365 = c1242;
    }
}
