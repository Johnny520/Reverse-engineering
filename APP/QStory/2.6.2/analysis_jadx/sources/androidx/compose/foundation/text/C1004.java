package androidx.compose.foundation.text;

import androidx.compose.foundation.lazy.layout.C0713;
import androidx.compose.runtime.InterfaceC1395;
import kotlin.C5175;
import p052.InterfaceC6557;
import p112.C7328;

/* JADX INFO: renamed from: androidx.compose.foundation.text.飘花落叶言子苏哲世楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1004 implements InterfaceC6557 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC1395 f2942;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2943;

    public /* synthetic */ C1004(InterfaceC1395 interfaceC1395, int i) {
        this.f2943 = i;
        this.f2942 = interfaceC1395;
    }

    @Override // p052.InterfaceC6557
    public final Object invoke(Object obj) {
        int i = this.f2943;
        InterfaceC1395 interfaceC1395 = this.f2942;
        switch (i) {
            case 0:
                return new C0713(interfaceC1395, 4);
            default:
                ((InterfaceC6557) interfaceC1395.getValue()).invoke((C7328) obj);
                return C5175.f14739;
        }
    }
}
