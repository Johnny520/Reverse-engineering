package kotlin.reflect.jvm.internal;

import p052.InterfaceC6542;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子哲世楪苏兰, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4990 implements InterfaceC6542 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C4991 f14399;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f14400;

    public /* synthetic */ C4990(C4991 c4991, int i) {
        this.f14400 = i;
        this.f14399 = c4991;
    }

    @Override // p052.InterfaceC6542
    public final Object invoke() {
        int i = this.f14400;
        C4991 c4991 = this.f14399;
        switch (i) {
            case 0:
                return new C4992(c4991);
            default:
                return AbstractC5061.m10042(c4991.f14402);
        }
    }
}
