package kotlin.reflect.jvm.internal;

import p052.InterfaceC6543;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子兰苏楪世哲, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4986 implements InterfaceC6543 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C4983 f14390;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f14391;

    public /* synthetic */ C4986(C4983 c4983, int i) {
        this.f14391 = i;
        this.f14390 = c4983;
    }

    @Override // p052.InterfaceC6543
    public final Object invoke() {
        int i = this.f14391;
        C4983 c4983 = this.f14390;
        switch (i) {
            case 0:
                return new C4987(c4983);
            default:
                return c4983.m9970();
        }
    }
}
