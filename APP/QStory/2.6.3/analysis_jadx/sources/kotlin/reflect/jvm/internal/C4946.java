package kotlin.reflect.jvm.internal;

import p052.InterfaceC6543;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4946 implements InterfaceC6543 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C4943 f14314;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f14315;

    public /* synthetic */ C4946(C4943 c4943, int i) {
        this.f14315 = i;
        this.f14314 = c4943;
    }

    @Override // p052.InterfaceC6543
    public final Object invoke() {
        int i = this.f14315;
        C4943 c4943 = this.f14314;
        switch (i) {
            case 0:
                return new C4947(c4943);
            default:
                return c4943.m9938();
        }
    }
}
