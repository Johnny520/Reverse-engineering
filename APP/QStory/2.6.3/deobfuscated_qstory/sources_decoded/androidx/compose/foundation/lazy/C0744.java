package androidx.compose.foundation.lazy;

import p052.InterfaceC6543;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0744 implements InterfaceC6543 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C0741 f2131;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2132;

    public /* synthetic */ C0744(C0741 c0741, int i) {
        this.f2132 = i;
        this.f2131 = c0741;
    }

    @Override // p052.InterfaceC6543
    public final Object invoke() {
        int iM1560;
        int i = this.f2132;
        C0741 c0741 = this.f2131;
        switch (i) {
            case 0:
                iM1560 = c0741.m1551().f2206;
                break;
            default:
                iM1560 = c0741.f2105.m1560();
                break;
        }
        return Integer.valueOf(iM1560);
    }
}
