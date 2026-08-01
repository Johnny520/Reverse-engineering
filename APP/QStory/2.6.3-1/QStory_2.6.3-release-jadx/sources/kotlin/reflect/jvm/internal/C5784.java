package kotlin.reflect.jvm.internal;

import p062.C7311;
import p068.InterfaceC7372;
import p082.AbstractC7705;
import p095.C7820;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5784 implements InterfaceC7372 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final AbstractC5795 f14669;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f14670;

    public /* synthetic */ C5784(AbstractC5795 abstractC5795, int i) {
        this.f14670 = i;
        this.f14669 = abstractC5795;
    }

    @Override // p068.InterfaceC7372
    public final Object invoke() {
        int i = this.f14670;
        AbstractC5795 abstractC5795 = this.f14669;
        switch (i) {
            case 0:
                C7820 getter = abstractC5795.mo10508().mo10501().getGetter();
                if (getter != null) {
                    return getter;
                }
                C7820 c7820M12682 = AbstractC7705.m12682(abstractC5795.mo10508().mo10501(), C7311.f18113);
                c7820M12682.m12873(abstractC5795.mo10508().mo10501().getType());
                return c7820M12682;
            default:
                return AbstractC5894.m10595(abstractC5795, true);
        }
    }
}
