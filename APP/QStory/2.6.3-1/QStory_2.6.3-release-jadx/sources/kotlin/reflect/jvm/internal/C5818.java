package kotlin.reflect.jvm.internal;

import p068.InterfaceC7372;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子兰苏楪世哲, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5818 implements InterfaceC7372 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C5815 f14735;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f14736;

    public /* synthetic */ C5818(C5815 c5815, int i) {
        this.f14736 = i;
        this.f14735 = c5815;
    }

    @Override // p068.InterfaceC7372
    public final Object invoke() {
        int i = this.f14736;
        C5815 c5815 = this.f14735;
        switch (i) {
            case 0:
                return new C5819(c5815);
            default:
                return c5815.m10529();
        }
    }
}
