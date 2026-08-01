package kotlin.reflect.jvm.internal;

import p046.C6481;
import p052.InterfaceC6542;
import p053.AbstractC6560;
import p066.AbstractC6875;
import p079.C6990;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4951 implements InterfaceC6542 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final AbstractC4962 f14322;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f14323;

    public /* synthetic */ C4951(AbstractC4962 abstractC4962, int i) {
        this.f14323 = i;
        this.f14322 = abstractC4962;
    }

    @Override // p052.InterfaceC6542
    public final Object invoke() {
        int i = this.f14323;
        AbstractC4962 abstractC4962 = this.f14322;
        switch (i) {
            case 0:
                C6990 getter = abstractC4962.mo9952().mo9945().getGetter();
                if (getter != null) {
                    return getter;
                }
                C6990 c6990M12095 = AbstractC6875.m12095(abstractC4962.mo9952().mo9945(), C6481.f17772);
                c6990M12095.m12287(abstractC4962.mo9952().mo9945().getType());
                return c6990M12095;
            default:
                return AbstractC6560.m12022(abstractC4962, true);
        }
    }
}
