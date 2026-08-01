package kotlin.reflect.jvm.internal;

import p068.InterfaceC7372;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5780 implements InterfaceC7372 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C5782 f14662;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f14663;

    public /* synthetic */ C5780(C5782 c5782, int i) {
        this.f14663 = i;
        this.f14662 = c5782;
    }

    @Override // p068.InterfaceC7372
    public final Object invoke() {
        int i = this.f14663;
        C5782 c5782 = this.f14662;
        switch (i) {
            case 0:
                return new C5783(c5782);
            default:
                return c5782.m10497();
        }
    }
}
