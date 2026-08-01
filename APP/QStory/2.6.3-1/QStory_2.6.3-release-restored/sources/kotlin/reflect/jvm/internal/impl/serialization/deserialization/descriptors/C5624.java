package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import p068.InterfaceC7372;
import p191.AbstractC8568;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5624 implements InterfaceC7372 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C5623 f14305;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final AbstractC5627 f14306;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f14307;

    public /* synthetic */ C5624(C5623 c5623, AbstractC5627 abstractC5627, int i) {
        this.f14307 = i;
        this.f14305 = c5623;
        this.f14306 = abstractC5627;
    }

    @Override // p068.InterfaceC7372
    public final Object invoke() {
        int i = this.f14307;
        AbstractC5627 abstractC5627 = this.f14306;
        C5623 c5623 = this.f14305;
        switch (i) {
            case 0:
                return AbstractC8568.m13613(c5623.f14301.keySet(), abstractC5627.mo10087());
            default:
                return AbstractC8568.m13613(c5623.f14300.keySet(), abstractC5627.mo10088());
        }
    }
}
