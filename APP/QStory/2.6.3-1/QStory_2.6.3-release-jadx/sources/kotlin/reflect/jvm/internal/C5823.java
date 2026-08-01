package kotlin.reflect.jvm.internal;

import p068.InterfaceC7372;
import p269.AbstractC9019;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子哲世楪苏兰, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5823 implements InterfaceC7372 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C5824 f14746;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f14747;

    public /* synthetic */ C5823(C5824 c5824, int i) {
        this.f14747 = i;
        this.f14746 = c5824;
    }

    @Override // p068.InterfaceC7372
    public final Object invoke() {
        int i = this.f14747;
        C5824 c5824 = this.f14746;
        switch (i) {
            case 0:
                return new C5825(c5824);
            default:
                return AbstractC9019.m14244(c5824.f14749);
        }
    }
}
