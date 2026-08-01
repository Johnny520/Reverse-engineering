package p117;

import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C5633;
import p050.AbstractC7176;
import p068.InterfaceC7372;
import p082.AbstractC7705;

/* JADX INFO: renamed from: 飘花落叶言世苏子楪哲兰.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C8088 implements InterfaceC7372 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C8085 f19691;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f19692;

    public /* synthetic */ C8088(C8085 c8085, int i) {
        this.f19692 = i;
        this.f19691 = c8085;
    }

    @Override // p068.InterfaceC7372
    public final Object invoke() {
        int i = this.f19692;
        C8085 c8085 = this.f19691;
        switch (i) {
            case 0:
                C5633 c5633 = c8085.f19686;
                return AbstractC7176.m12490(AbstractC7705.m12692(c5633), AbstractC7705.m12693(c5633));
            default:
                return c8085.f19685 ? AbstractC7176.m12489(AbstractC7705.m12688(c8085.f19686)) : EmptyList.INSTANCE;
        }
    }
}
