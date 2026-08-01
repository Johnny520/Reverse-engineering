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
import kotlin.C5176;
import p052.InterfaceC6543;
import p052.InterfaceC6551;
import p052.InterfaceC6554;
import top.yukonga.miuix.kmp.basic.AbstractC6032;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0591 implements InterfaceC6554 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ Object f1659;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ Object f1660;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final /* synthetic */ Object f1661;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final /* synthetic */ Object f1662;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C1242 f1663;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ int f1664;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f1665;

    public /* synthetic */ C0591(C1242 c1242, Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f1665 = 2;
        this.f1663 = c1242;
        this.f1660 = obj;
        this.f1659 = obj2;
        this.f1661 = obj3;
        this.f1662 = obj4;
        this.f1664 = i;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f1665;
        Object obj3 = this.f1662;
        Object obj4 = this.f1661;
        Object obj5 = this.f1659;
        Object obj6 = this.f1660;
        C5176 c5176 = C5176.f14739;
        int i2 = this.f1664;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iM2471 = AbstractC1367.m2471(i2 | 1);
                AbstractC0628.m1426((InterfaceC2129) obj6, (InterfaceC0645) obj5, (InterfaceC0650) obj4, (C0588) obj3, this.f1663, (InterfaceC1373) obj, iM2471);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iM24712 = AbstractC1367.m2471(i2 | 1);
                AbstractC1161.m2024((C1192) obj6, (C1147) obj5, (C1219) obj4, (C1166) obj3, this.f1663, (InterfaceC1373) obj, iM24712);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iM24713 = AbstractC1367.m2471(i2) | 1;
                this.f1663.m2142(this.f1660, this.f1659, this.f1661, this.f1662, (InterfaceC1373) obj, iM24713);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM24714 = AbstractC1367.m2471(i2 | 1);
                AbstractC6032.m11387((InterfaceC2129) obj6, (InterfaceC6551) obj5, (InterfaceC0664) obj4, (InterfaceC6543) obj3, this.f1663, (InterfaceC1373) obj, iM24714);
                break;
        }
        return c5176;
    }

    public /* synthetic */ C0591(Object obj, Object obj2, Object obj3, Object obj4, C1242 c1242, int i, int i2) {
        this.f1665 = i2;
        this.f1660 = obj;
        this.f1659 = obj2;
        this.f1661 = obj3;
        this.f1662 = obj4;
        this.f1663 = c1242;
        this.f1664 = i;
    }
}
