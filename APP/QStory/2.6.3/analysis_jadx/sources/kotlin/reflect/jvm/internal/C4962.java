package kotlin.reflect.jvm.internal;

import p046.C6482;
import p052.InterfaceC6543;
import p066.AbstractC6876;
import p079.C6990;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4962 implements InterfaceC6543 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final AbstractC4960 f14345;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f14346;

    public /* synthetic */ C4962(AbstractC4960 abstractC4960, int i) {
        this.f14346 = i;
        this.f14345 = abstractC4960;
    }

    @Override // p052.InterfaceC6543
    public final Object invoke() {
        int i = this.f14346;
        AbstractC4960 abstractC4960 = this.f14345;
        switch (i) {
            case 0:
                C6990 setter = abstractC4960.mo9949().mo9942().getSetter();
                return setter == null ? AbstractC6876.m12130(abstractC4960.mo9949().mo9942(), C6482.f17768) : setter;
            default:
                return AbstractC5062.m10036(abstractC4960, false);
        }
    }
}
