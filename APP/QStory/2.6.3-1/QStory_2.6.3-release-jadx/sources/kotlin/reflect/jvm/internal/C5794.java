package kotlin.reflect.jvm.internal;

import p062.C7311;
import p068.InterfaceC7372;
import p082.AbstractC7705;
import p095.C7819;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5794 implements InterfaceC7372 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final AbstractC5792 f14690;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f14691;

    public /* synthetic */ C5794(AbstractC5792 abstractC5792, int i) {
        this.f14691 = i;
        this.f14690 = abstractC5792;
    }

    @Override // p068.InterfaceC7372
    public final Object invoke() {
        int i = this.f14691;
        AbstractC5792 abstractC5792 = this.f14690;
        switch (i) {
            case 0:
                C7819 setter = abstractC5792.mo10508().mo10501().getSetter();
                return setter == null ? AbstractC7705.m12689(abstractC5792.mo10508().mo10501(), C7311.f18113) : setter;
            default:
                return AbstractC5894.m10595(abstractC5792, false);
        }
    }
}
