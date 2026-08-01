package kotlin.reflect.jvm.internal;

import p068.InterfaceC7372;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5778 implements InterfaceC7372 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C5775 f14659;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f14660;

    public /* synthetic */ C5778(C5775 c5775, int i) {
        this.f14660 = i;
        this.f14659 = c5775;
    }

    @Override // p068.InterfaceC7372
    public final Object invoke() {
        int i = this.f14660;
        C5775 c5775 = this.f14659;
        switch (i) {
            case 0:
                return new C5779(c5775);
            default:
                return c5775.m10497();
        }
    }
}
