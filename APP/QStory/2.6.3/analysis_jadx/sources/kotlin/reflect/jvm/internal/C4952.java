package kotlin.reflect.jvm.internal;

import p046.C6482;
import p052.InterfaceC6543;
import p066.AbstractC6876;
import p079.C6991;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4952 implements InterfaceC6543 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final AbstractC4963 f14324;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f14325;

    public /* synthetic */ C4952(AbstractC4963 abstractC4963, int i) {
        this.f14325 = i;
        this.f14324 = abstractC4963;
    }

    @Override // p052.InterfaceC6543
    public final Object invoke() {
        int i = this.f14325;
        AbstractC4963 abstractC4963 = this.f14324;
        switch (i) {
            case 0:
                C6991 getter = abstractC4963.mo9949().mo9942().getGetter();
                if (getter != null) {
                    return getter;
                }
                C6991 c6991M12123 = AbstractC6876.m12123(abstractC4963.mo9949().mo9942(), C6482.f17768);
                c6991M12123.m12314(abstractC4963.mo9949().mo9942().getType());
                return c6991M12123;
            default:
                return AbstractC5062.m10036(abstractC4963, true);
        }
    }
}
