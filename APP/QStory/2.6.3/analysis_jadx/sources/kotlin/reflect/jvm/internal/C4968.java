package kotlin.reflect.jvm.internal;

import p052.InterfaceC6543;
import p253.AbstractC8190;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子兰世苏哲楪, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4968 implements InterfaceC6543 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C4965 f14356;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f14357;

    public /* synthetic */ C4968(C4965 c4965, int i) {
        this.f14357 = i;
        this.f14356 = c4965;
    }

    @Override // p052.InterfaceC6543
    public final Object invoke() {
        int i = this.f14357;
        C4965 c4965 = this.f14356;
        switch (i) {
            case 0:
                return new C4964(c4965);
            default:
                return AbstractC8190.m13704(c4965, c4965.m9970(), null, null);
        }
    }
}
