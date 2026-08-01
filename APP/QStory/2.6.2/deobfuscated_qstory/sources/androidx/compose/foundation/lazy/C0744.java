package androidx.compose.foundation.lazy;

import p052.InterfaceC6542;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0744 implements InterfaceC6542 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C0741 f2130;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2131;

    public /* synthetic */ C0744(C0741 c0741, int i) {
        this.f2131 = i;
        this.f2130 = c0741;
    }

    @Override // p052.InterfaceC6542
    public final Object invoke() {
        int iM1550;
        int i = this.f2131;
        C0741 c0741 = this.f2130;
        switch (i) {
            case 0:
                iM1550 = c0741.m1541().f2205;
                break;
            default:
                iM1550 = c0741.f2104.m1550();
                break;
        }
        return Integer.valueOf(iM1550);
    }
}
