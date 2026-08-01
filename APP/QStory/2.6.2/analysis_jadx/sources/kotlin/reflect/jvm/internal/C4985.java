package kotlin.reflect.jvm.internal;

import p052.InterfaceC6542;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子兰苏楪世哲, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4985 implements InterfaceC6542 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C4982 f14388;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f14389;

    public /* synthetic */ C4985(C4982 c4982, int i) {
        this.f14389 = i;
        this.f14388 = c4982;
    }

    @Override // p052.InterfaceC6542
    public final Object invoke() {
        int i = this.f14389;
        C4982 c4982 = this.f14388;
        switch (i) {
            case 0:
                return new C4986(c4982);
            default:
                return c4982.m9973();
        }
    }
}
