package androidx.compose.foundation;

import androidx.compose.runtime.AbstractC1347;
import androidx.compose.ui.layout.InterfaceC1695;
import kotlin.C5175;
import p052.InterfaceC6542;
import p112.C7328;

/* JADX INFO: renamed from: androidx.compose.foundation.飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1078 implements InterfaceC6542 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C1076 f3205;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f3206;

    public /* synthetic */ C1078(C1076 c1076, int i) {
        this.f3206 = i;
        this.f3205 = c1076;
    }

    @Override // p052.InterfaceC6542
    public final Object invoke() {
        int i = this.f3206;
        C1076 c1076 = this.f3205;
        switch (i) {
            case 0:
                c1076.m1986();
                return C5175.f14739;
            case 1:
                return new C7328(c1076.f3193);
            default:
                InterfaceC1695 interfaceC1695 = (InterfaceC1695) ((AbstractC1347) c1076.f3198).getValue();
                return new C7328(interfaceC1695 != null ? interfaceC1695.mo3066(0L) : 9205357640488583168L);
        }
    }
}
