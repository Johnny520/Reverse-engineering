package kotlin.reflect.jvm.internal;

import kotlin.reflect.KParameter$Kind;
import kotlin.reflect.jvm.internal.impl.p009km.C5358;
import p068.InterfaceC7372;
import p191.AbstractC8568;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子兰世楪苏哲, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5799 implements InterfaceC7372 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final AbstractC5801 f14699;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f14700;

    public /* synthetic */ C5799(AbstractC5801 abstractC5801, int i) {
        this.f14700 = i;
        this.f14699 = abstractC5801;
    }

    @Override // p068.InterfaceC7372
    public final Object invoke() {
        switch (this.f14700) {
            case 0:
                AbstractC5801 abstractC5801 = this.f14699;
                C5358 c5358 = abstractC5801.mo10518().f14723.f13571;
                return c5358 != null ? new C5812(abstractC5801, c5358, abstractC5801.mo10518().mo10520().size(), KParameter$Kind.VALUE, (C5902) abstractC5801.mo10518().f14726.getValue()) : new C5798(abstractC5801.mo10518());
            default:
                return AbstractC8568.m13645(this.f14699, false);
        }
    }
}
