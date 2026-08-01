package kotlin.reflect.jvm.internal;

import p052.InterfaceC6542;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4947 implements InterfaceC6542 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C4949 f14315;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f14316;

    public /* synthetic */ C4947(C4949 c4949, int i) {
        this.f14316 = i;
        this.f14315 = c4949;
    }

    @Override // p052.InterfaceC6542
    public final Object invoke() {
        int i = this.f14316;
        C4949 c4949 = this.f14315;
        switch (i) {
            case 0:
                return new C4950(c4949);
            default:
                return c4949.m9941();
        }
    }
}
