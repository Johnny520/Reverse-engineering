package androidx.compose.animation.core;

import p052.InterfaceC6557;

/* JADX INFO: renamed from: androidx.compose.animation.core.飘花落叶言子苏哲世兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0363 implements InterfaceC6557 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C0364 f1237;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f1238;

    public /* synthetic */ C0363(C0364 c0364, int i) {
        this.f1238 = i;
        this.f1237 = c0364;
    }

    @Override // p052.InterfaceC6557
    public final Object invoke(Object obj) {
        int i = this.f1238;
        C0364 c0364 = this.f1237;
        switch (i) {
            case 0:
                return new C0365(c0364, 0);
            default:
                return new C0365(c0364, 1);
        }
    }
}
