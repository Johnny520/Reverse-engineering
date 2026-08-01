package androidx.compose.ui.node;

import androidx.compose.ui.graphics.C1587;
import androidx.compose.ui.layout.AbstractC1689;
import androidx.compose.ui.platform.C1911;
import java.util.Map;
import p112.C7328;
import p175.AbstractC7738;

/* JADX INFO: renamed from: androidx.compose.ui.node.飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1759 extends AbstractC1770 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final /* synthetic */ int f5176;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1759(InterfaceC1769 interfaceC1769, int i) {
        super(interfaceC1769);
        this.f5176 = i;
    }

    @Override // androidx.compose.ui.node.AbstractC1770
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int mo3302(AbstractC1794 abstractC1794, AbstractC1689 abstractC1689) {
        switch (this.f5176) {
            case 0:
                return abstractC1794.m3281(abstractC1689);
            default:
                AbstractC1745 abstractC1745Mo3275 = abstractC1794.mo3275();
                abstractC1745Mo3275.getClass();
                return abstractC1745Mo3275.m3281(abstractC1689);
        }
    }

    @Override // androidx.compose.ui.node.AbstractC1770
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Map mo3303(AbstractC1794 abstractC1794) {
        switch (this.f5176) {
            case 0:
                return abstractC1794.mo3191().mo1462();
            default:
                AbstractC1745 abstractC1745Mo3275 = abstractC1794.mo3275();
                abstractC1745Mo3275.getClass();
                return abstractC1745Mo3275.mo3191().mo1462();
        }
    }

    @Override // androidx.compose.ui.node.AbstractC1770
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final long mo3304(AbstractC1794 abstractC1794, long j) {
        switch (this.f5176) {
            case 0:
                InterfaceC1806 interfaceC1806 = abstractC1794.f5259;
                if (interfaceC1806 != null) {
                    C1911 c1911 = (C1911) interfaceC1806;
                    float[] fArrM3601 = c1911.m3601();
                    if (!c1911.f5641) {
                        j = C1587.m2896(j, fArrM3601);
                    }
                }
                return AbstractC7738.m13035(j, abstractC1794.f5244);
            default:
                AbstractC1745 abstractC1745Mo3275 = abstractC1794.mo3275();
                abstractC1745Mo3275.getClass();
                long j2 = abstractC1745Mo3275.f5061;
                return C7328.m12498((((long) Float.floatToRawIntBits((int) (j2 & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits((int) (j2 >> 32)) << 32), j);
        }
    }
}
