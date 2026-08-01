package top.yukonga.miuix.kmp.basic;

import androidx.compose.foundation.layout.InterfaceC0608;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.C1324;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.runtime.internal.C1242;
import kotlin.C5175;
import p052.InterfaceC6553;

/* JADX INFO: renamed from: top.yukonga.miuix.kmp.basic.飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5993 implements InterfaceC6553 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC0608 f16355;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ C1242 f16356;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC6553 f16357;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC6553 f16358;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final /* synthetic */ int f16359;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC6553 f16360;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final /* synthetic */ int f16361;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC6553 f16362;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC6553 f16363;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC6553 f16364;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f16365 = 0;

    public /* synthetic */ C5993(InterfaceC6553 interfaceC6553, InterfaceC6553 interfaceC65532, InterfaceC6553 interfaceC65533, InterfaceC6553 interfaceC65534, int i, InterfaceC6553 interfaceC65535, int i2, InterfaceC6553 interfaceC65536, InterfaceC0608 interfaceC0608, C1242 c1242, int i3) {
        this.f16363 = interfaceC6553;
        this.f16364 = interfaceC65532;
        this.f16358 = interfaceC65533;
        this.f16357 = interfaceC65534;
        this.f16361 = i;
        this.f16362 = interfaceC65535;
        this.f16359 = i2;
        this.f16360 = interfaceC65536;
        this.f16355 = interfaceC0608;
        this.f16356 = c1242;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f16365;
        C5175 c5175 = C5175.f14739;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC6026.m11324(this.f16363, this.f16364, this.f16358, this.f16357, this.f16361, this.f16362, this.f16359, this.f16360, this.f16355, this.f16356, (InterfaceC1373) obj, AbstractC1367.m2460(1));
                break;
            default:
                C6019 c6019 = (C6019) this.f16355;
                InterfaceC1373 interfaceC1373 = (InterfaceC1373) obj;
                int iIntValue = ((Integer) obj2).intValue();
                C1324 c1324 = (C1324) interfaceC1373;
                if (!c1324.m2333(1 & iIntValue, (iIntValue & 3) != 2)) {
                    c1324.m2329();
                } else {
                    AbstractC6026.m11324(this.f16363, this.f16364, this.f16358, this.f16357, this.f16361, this.f16362, this.f16359, this.f16360, c6019, this.f16356, c1324, 0);
                }
                break;
        }
        return c5175;
    }

    public /* synthetic */ C5993(InterfaceC6553 interfaceC6553, InterfaceC6553 interfaceC65532, InterfaceC6553 interfaceC65533, InterfaceC6553 interfaceC65534, int i, InterfaceC6553 interfaceC65535, int i2, InterfaceC6553 interfaceC65536, C6019 c6019, C1242 c1242) {
        this.f16363 = interfaceC6553;
        this.f16364 = interfaceC65532;
        this.f16358 = interfaceC65533;
        this.f16357 = interfaceC65534;
        this.f16361 = i;
        this.f16362 = interfaceC65535;
        this.f16359 = i2;
        this.f16360 = interfaceC65536;
        this.f16355 = c6019;
        this.f16356 = c1242;
    }
}
