package androidx.compose.ui.node;

import androidx.compose.ui.graphics.C1587;
import androidx.compose.ui.layout.AbstractC1689;
import androidx.compose.ui.platform.C1911;
import java.util.Map;
import p112.C7329;
import p253.AbstractC8190;

/* JADX INFO: renamed from: androidx.compose.ui.node.飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1759 extends AbstractC1770 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final /* synthetic */ int f5177;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1759(InterfaceC1769 interfaceC1769, int i) {
        super(interfaceC1769);
        this.f5177 = i;
    }

    @Override // androidx.compose.ui.node.AbstractC1770
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int mo3312(AbstractC1794 abstractC1794, AbstractC1689 abstractC1689) {
        switch (this.f5177) {
            case 0:
                return abstractC1794.m3291(abstractC1689);
            default:
                AbstractC1745 abstractC1745Mo3285 = abstractC1794.mo3285();
                abstractC1745Mo3285.getClass();
                return abstractC1745Mo3285.m3291(abstractC1689);
        }
    }

    @Override // androidx.compose.ui.node.AbstractC1770
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Map mo3313(AbstractC1794 abstractC1794) {
        switch (this.f5177) {
            case 0:
                return abstractC1794.mo3201().mo1472();
            default:
                AbstractC1745 abstractC1745Mo3285 = abstractC1794.mo3285();
                abstractC1745Mo3285.getClass();
                return abstractC1745Mo3285.mo3201().mo1472();
        }
    }

    @Override // androidx.compose.ui.node.AbstractC1770
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final long mo3314(AbstractC1794 abstractC1794, long j) {
        switch (this.f5177) {
            case 0:
                InterfaceC1806 interfaceC1806 = abstractC1794.f5260;
                if (interfaceC1806 != null) {
                    C1911 c1911 = (C1911) interfaceC1806;
                    float[] fArrM3611 = c1911.m3611();
                    if (!c1911.f5642) {
                        j = C1587.m2906(j, fArrM3611);
                    }
                }
                return AbstractC8190.m13695(j, abstractC1794.f5245);
            default:
                AbstractC1745 abstractC1745Mo3285 = abstractC1794.mo3285();
                abstractC1745Mo3285.getClass();
                long j2 = abstractC1745Mo3285.f5062;
                return C7329.m12525((((long) Float.floatToRawIntBits((int) (j2 & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits((int) (j2 >> 32)) << 32), j);
        }
    }
}
