package androidx.compose.foundation.layout;

import androidx.compose.material3.AbstractC1161;
import androidx.compose.material3.C1147;
import androidx.compose.material3.C1166;
import androidx.compose.material3.C1192;
import androidx.compose.material3.C1219;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.runtime.internal.C1242;
import androidx.compose.ui.InterfaceC2129;
import kotlin.C5175;
import p052.InterfaceC6542;
import p052.InterfaceC6550;
import p052.InterfaceC6553;
import top.yukonga.miuix.kmp.basic.AbstractC6026;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0591 implements InterfaceC6553 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ Object f1658;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ Object f1659;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final /* synthetic */ Object f1660;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final /* synthetic */ Object f1661;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C1242 f1662;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ int f1663;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f1664;

    public /* synthetic */ C0591(C1242 c1242, Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f1664 = 2;
        this.f1662 = c1242;
        this.f1659 = obj;
        this.f1658 = obj2;
        this.f1660 = obj3;
        this.f1661 = obj4;
        this.f1663 = i;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f1664;
        Object obj3 = this.f1661;
        Object obj4 = this.f1660;
        Object obj5 = this.f1658;
        Object obj6 = this.f1659;
        C5175 c5175 = C5175.f14739;
        int i2 = this.f1663;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iM2460 = AbstractC1367.m2460(i2 | 1);
                AbstractC0628.m1416((InterfaceC2129) obj6, (InterfaceC0645) obj5, (InterfaceC0650) obj4, (C0588) obj3, this.f1662, (InterfaceC1373) obj, iM2460);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iM24602 = AbstractC1367.m2460(i2 | 1);
                AbstractC1161.m2014((C1192) obj6, (C1147) obj5, (C1219) obj4, (C1166) obj3, this.f1662, (InterfaceC1373) obj, iM24602);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iM24603 = AbstractC1367.m2460(i2) | 1;
                this.f1662.m2132(this.f1659, this.f1658, this.f1660, this.f1661, (InterfaceC1373) obj, iM24603);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM24604 = AbstractC1367.m2460(i2 | 1);
                AbstractC6026.m11327((InterfaceC2129) obj6, (InterfaceC6550) obj5, (InterfaceC0664) obj4, (InterfaceC6542) obj3, this.f1662, (InterfaceC1373) obj, iM24604);
                break;
        }
        return c5175;
    }

    public /* synthetic */ C0591(Object obj, Object obj2, Object obj3, Object obj4, C1242 c1242, int i, int i2) {
        this.f1664 = i2;
        this.f1659 = obj;
        this.f1658 = obj2;
        this.f1660 = obj3;
        this.f1661 = obj4;
        this.f1662 = c1242;
        this.f1663 = i;
    }
}
