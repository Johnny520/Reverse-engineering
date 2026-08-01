package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.InterfaceC1851;
import androidx.compose.p001ui.input.pointer.AbstractC2481;
import androidx.compose.p001ui.input.pointer.C2478;
import kotlin.C6008;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: androidx.compose.foundation.text.selection.飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1736 implements InterfaceC7387 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC1851 f2891;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2892;

    public /* synthetic */ C1736(InterfaceC1851 interfaceC1851, int i) {
        this.f2892 = i;
        this.f2891 = interfaceC1851;
    }

    @Override // p068.InterfaceC7387
    public final Object invoke(Object obj) {
        int i = this.f2892;
        C6008 c6008 = C6008.f15084;
        InterfaceC1851 interfaceC1851 = this.f2891;
        C2478 c2478 = (C2478) obj;
        switch (i) {
            case 0:
                interfaceC1851.mo2304(AbstractC2481.m3591(c2478, false));
                c2478.m3584();
                break;
            default:
                interfaceC1851.mo2304(AbstractC2481.m3591(c2478, false));
                c2478.m3584();
                break;
        }
        return c6008;
    }
}
