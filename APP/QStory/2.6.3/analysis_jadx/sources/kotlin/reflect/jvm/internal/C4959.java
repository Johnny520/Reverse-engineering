package kotlin.reflect.jvm.internal;

import p052.InterfaceC6543;
import p253.AbstractC8190;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4959 implements InterfaceC6543 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C4949 f14337;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f14338;

    public /* synthetic */ C4959(C4949 c4949, int i) {
        this.f14338 = i;
        this.f14337 = c4949;
    }

    @Override // p052.InterfaceC6543
    public final Object invoke() {
        int i = this.f14338;
        C4949 c4949 = this.f14337;
        switch (i) {
            case 0:
                return new C4958(c4949);
            default:
                return AbstractC8190.m13704(c4949, c4949.m9938(), null, null);
        }
    }
}
