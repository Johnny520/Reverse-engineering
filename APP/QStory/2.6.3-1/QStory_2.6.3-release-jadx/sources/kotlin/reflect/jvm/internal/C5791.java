package kotlin.reflect.jvm.internal;

import p068.InterfaceC7372;
import p269.AbstractC9019;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5791 implements InterfaceC7372 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C5781 f14682;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f14683;

    public /* synthetic */ C5791(C5781 c5781, int i) {
        this.f14683 = i;
        this.f14682 = c5781;
    }

    @Override // p068.InterfaceC7372
    public final Object invoke() {
        int i = this.f14683;
        C5781 c5781 = this.f14682;
        switch (i) {
            case 0:
                return new C5790(c5781);
            default:
                return AbstractC9019.m14263(c5781, c5781.m10497(), null, null);
        }
    }
}
