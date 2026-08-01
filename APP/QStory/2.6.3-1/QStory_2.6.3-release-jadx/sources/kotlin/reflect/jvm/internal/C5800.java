package kotlin.reflect.jvm.internal;

import p068.InterfaceC7372;
import p269.AbstractC9019;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子兰世苏哲楪, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5800 implements InterfaceC7372 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C5797 f14701;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f14702;

    public /* synthetic */ C5800(C5797 c5797, int i) {
        this.f14702 = i;
        this.f14701 = c5797;
    }

    @Override // p068.InterfaceC7372
    public final Object invoke() {
        int i = this.f14702;
        C5797 c5797 = this.f14701;
        switch (i) {
            case 0:
                return new C5796(c5797);
            default:
                return AbstractC9019.m14263(c5797, c5797.m10529(), null, null);
        }
    }
}
