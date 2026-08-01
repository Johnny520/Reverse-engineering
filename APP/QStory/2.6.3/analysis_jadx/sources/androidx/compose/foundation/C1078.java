package androidx.compose.foundation;

import androidx.compose.runtime.AbstractC1347;
import androidx.compose.ui.layout.InterfaceC1695;
import kotlin.C5176;
import p052.InterfaceC6543;
import p112.C7329;

/* JADX INFO: renamed from: androidx.compose.foundation.飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1078 implements InterfaceC6543 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C1076 f3206;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f3207;

    public /* synthetic */ C1078(C1076 c1076, int i) {
        this.f3207 = i;
        this.f3206 = c1076;
    }

    @Override // p052.InterfaceC6543
    public final Object invoke() {
        int i = this.f3207;
        C1076 c1076 = this.f3206;
        switch (i) {
            case 0:
                c1076.m1996();
                return C5176.f14739;
            case 1:
                return new C7329(c1076.f3194);
            default:
                InterfaceC1695 interfaceC1695 = (InterfaceC1695) ((AbstractC1347) c1076.f3199).getValue();
                return new C7329(interfaceC1695 != null ? interfaceC1695.mo3076(0L) : 9205357640488583168L);
        }
    }
}
