package kotlin.reflect.jvm.internal;

import kotlin.reflect.KParameter$Kind;
import kotlin.reflect.jvm.internal.impl.km.C4526;
import p052.InterfaceC6543;
import p175.AbstractC7739;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子兰世楪苏哲, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4967 implements InterfaceC6543 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final AbstractC4969 f14354;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f14355;

    public /* synthetic */ C4967(AbstractC4969 abstractC4969, int i) {
        this.f14355 = i;
        this.f14354 = abstractC4969;
    }

    @Override // p052.InterfaceC6543
    public final Object invoke() {
        switch (this.f14355) {
            case 0:
                AbstractC4969 abstractC4969 = this.f14354;
                C4526 c4526 = abstractC4969.mo9959().f14378.f13226;
                return c4526 != null ? new C4980(abstractC4969, c4526, abstractC4969.mo9959().mo9961().size(), KParameter$Kind.VALUE, (C5070) abstractC4969.mo9959().f14381.getValue()) : new C4966(abstractC4969.mo9959());
            default:
                return AbstractC7739.m13086(this.f14354, false);
        }
    }
}
