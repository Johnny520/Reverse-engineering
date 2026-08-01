package kotlin.reflect.jvm.internal;

import p046.C6481;
import p052.InterfaceC6542;
import p053.AbstractC6560;
import p066.AbstractC6875;
import p079.C6989;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4961 implements InterfaceC6542 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final AbstractC4959 f14343;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f14344;

    public /* synthetic */ C4961(AbstractC4959 abstractC4959, int i) {
        this.f14344 = i;
        this.f14343 = abstractC4959;
    }

    @Override // p052.InterfaceC6542
    public final Object invoke() {
        int i = this.f14344;
        AbstractC4959 abstractC4959 = this.f14343;
        switch (i) {
            case 0:
                C6989 setter = abstractC4959.mo9952().mo9945().getSetter();
                return setter == null ? AbstractC6875.m12102(abstractC4959.mo9952().mo9945(), C6481.f17772) : setter;
            default:
                return AbstractC6560.m12022(abstractC4959, false);
        }
    }
}
