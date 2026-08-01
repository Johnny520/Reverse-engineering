package androidx.compose.animation.core;

import p068.InterfaceC7387;

/* JADX INFO: renamed from: androidx.compose.animation.core.飘花落叶言子苏哲世兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1209 implements InterfaceC7387 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C1210 f1582;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f1583;

    public /* synthetic */ C1209(C1210 c1210, int i) {
        this.f1583 = i;
        this.f1582 = c1210;
    }

    @Override // p068.InterfaceC7387
    public final Object invoke(Object obj) {
        int i = this.f1583;
        C1210 c1210 = this.f1582;
        switch (i) {
            case 0:
                return new C1211(c1210, 0);
            default:
                return new C1211(c1210, 1);
        }
    }
}
