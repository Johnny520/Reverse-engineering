package kotlin.reflect.jvm.internal;

import p052.InterfaceC6543;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4948 implements InterfaceC6543 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C4950 f14317;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f14318;

    public /* synthetic */ C4948(C4950 c4950, int i) {
        this.f14318 = i;
        this.f14317 = c4950;
    }

    @Override // p052.InterfaceC6543
    public final Object invoke() {
        int i = this.f14318;
        C4950 c4950 = this.f14317;
        switch (i) {
            case 0:
                return new C4951(c4950);
            default:
                return c4950.m9938();
        }
    }
}
