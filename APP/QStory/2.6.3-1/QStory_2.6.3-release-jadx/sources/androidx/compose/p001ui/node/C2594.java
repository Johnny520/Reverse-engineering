package androidx.compose.p001ui.node;

import androidx.compose.p001ui.graphics.C2422;
import androidx.compose.p001ui.layout.AbstractC2524;
import androidx.compose.p001ui.platform.C2746;
import java.util.Map;
import p128.C8158;
import p269.AbstractC9019;

/* JADX INFO: renamed from: androidx.compose.ui.node.飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2594 extends AbstractC2605 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final /* synthetic */ int f5522;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2594(InterfaceC2604 interfaceC2604, int i) {
        super(interfaceC2604);
        this.f5522 = i;
    }

    @Override // androidx.compose.p001ui.node.AbstractC2605
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int mo3872(AbstractC2629 abstractC2629, AbstractC2524 abstractC2524) {
        switch (this.f5522) {
            case 0:
                return abstractC2629.m3851(abstractC2524);
            default:
                AbstractC2580 abstractC2580Mo3845 = abstractC2629.mo3845();
                abstractC2580Mo3845.getClass();
                return abstractC2580Mo3845.m3851(abstractC2524);
        }
    }

    @Override // androidx.compose.p001ui.node.AbstractC2605
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Map mo3873(AbstractC2629 abstractC2629) {
        switch (this.f5522) {
            case 0:
                return abstractC2629.mo3761().mo2032();
            default:
                AbstractC2580 abstractC2580Mo3845 = abstractC2629.mo3845();
                abstractC2580Mo3845.getClass();
                return abstractC2580Mo3845.mo3761().mo2032();
        }
    }

    @Override // androidx.compose.p001ui.node.AbstractC2605
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final long mo3874(AbstractC2629 abstractC2629, long j) {
        switch (this.f5522) {
            case 0:
                InterfaceC2641 interfaceC2641 = abstractC2629.f5605;
                if (interfaceC2641 != null) {
                    C2746 c2746 = (C2746) interfaceC2641;
                    float[] fArrM4171 = c2746.m4171();
                    if (!c2746.f5987) {
                        j = C2422.m3466(j, fArrM4171);
                    }
                }
                return AbstractC9019.m14254(j, abstractC2629.f5590);
            default:
                AbstractC2580 abstractC2580Mo3845 = abstractC2629.mo3845();
                abstractC2580Mo3845.getClass();
                long j2 = abstractC2580Mo3845.f5407;
                return C8158.m13084((((long) Float.floatToRawIntBits((int) (j2 & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits((int) (j2 >> 32)) << 32), j);
        }
    }
}
