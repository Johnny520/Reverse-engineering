package androidx.compose.foundation.lazy;

import p068.InterfaceC7372;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1585 implements InterfaceC7372 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C1582 f2476;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2477;

    public /* synthetic */ C1585(C1582 c1582, int i) {
        this.f2477 = i;
        this.f2476 = c1582;
    }

    @Override // p068.InterfaceC7372
    public final Object invoke() {
        int iM2120;
        int i = this.f2477;
        C1582 c1582 = this.f2476;
        switch (i) {
            case 0:
                iM2120 = c1582.m2111().f2551;
                break;
            default:
                iM2120 = c1582.f2450.m2120();
                break;
        }
        return Integer.valueOf(iM2120);
    }
}
