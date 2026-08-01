package kotlin.reflect.jvm.internal;

import p052.InterfaceC6543;
import p253.AbstractC8190;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子哲世楪苏兰, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4991 implements InterfaceC6543 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C4992 f14401;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f14402;

    public /* synthetic */ C4991(C4992 c4992, int i) {
        this.f14402 = i;
        this.f14401 = c4992;
    }

    @Override // p052.InterfaceC6543
    public final Object invoke() {
        int i = this.f14402;
        C4992 c4992 = this.f14401;
        switch (i) {
            case 0:
                return new C4993(c4992);
            default:
                return AbstractC8190.m13685(c4992.f14404);
        }
    }
}
