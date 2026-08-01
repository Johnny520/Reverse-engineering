package kotlin.reflect.jvm.internal;

import kotlin.reflect.KParameter$Kind;
import kotlin.reflect.jvm.internal.impl.km.C4525;
import p052.InterfaceC6542;
import p316.C8675;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子兰世楪苏哲, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4966 implements InterfaceC6542 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final AbstractC4968 f14352;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f14353;

    public /* synthetic */ C4966(AbstractC4968 abstractC4968, int i) {
        this.f14353 = i;
        this.f14352 = abstractC4968;
    }

    @Override // p052.InterfaceC6542
    public final Object invoke() {
        switch (this.f14353) {
            case 0:
                AbstractC4968 abstractC4968 = this.f14352;
                C4525 c4525 = abstractC4968.mo9962().f14376.f13222;
                return c4525 != null ? new C4979(abstractC4968, c4525, abstractC4968.mo9962().mo9964().size(), KParameter$Kind.VALUE, (C5069) abstractC4968.mo9962().f14379.getValue()) : new C4965(abstractC4968.mo9962());
            default:
                return C8675.m14366(this.f14352, false);
        }
    }
}
