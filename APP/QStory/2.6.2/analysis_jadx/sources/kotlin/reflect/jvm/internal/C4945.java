package kotlin.reflect.jvm.internal;

import p052.InterfaceC6542;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4945 implements InterfaceC6542 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C4942 f14312;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f14313;

    public /* synthetic */ C4945(C4942 c4942, int i) {
        this.f14313 = i;
        this.f14312 = c4942;
    }

    @Override // p052.InterfaceC6542
    public final Object invoke() {
        int i = this.f14313;
        C4942 c4942 = this.f14312;
        switch (i) {
            case 0:
                return new C4946(c4942);
            default:
                return c4942.m9941();
        }
    }
}
