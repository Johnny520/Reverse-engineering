package p101;

import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C4801;
import p034.AbstractC6347;
import p052.InterfaceC6543;
import p066.AbstractC6876;

/* JADX INFO: renamed from: 飘花落叶言世苏子楪哲兰.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C7259 implements InterfaceC6543 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C7256 f19346;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f19347;

    public /* synthetic */ C7259(C7256 c7256, int i) {
        this.f19347 = i;
        this.f19346 = c7256;
    }

    @Override // p052.InterfaceC6543
    public final Object invoke() {
        int i = this.f19347;
        C7256 c7256 = this.f19346;
        switch (i) {
            case 0:
                C4801 c4801 = c7256.f19341;
                return AbstractC6347.m11931(AbstractC6876.m12133(c4801), AbstractC6876.m12134(c4801));
            default:
                return c7256.f19340 ? AbstractC6347.m11930(AbstractC6876.m12129(c7256.f19341)) : EmptyList.INSTANCE;
        }
    }
}
