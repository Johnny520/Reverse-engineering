package p101;

import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C4800;
import p052.InterfaceC6542;
import p066.AbstractC6875;
import p253.AbstractC8189;

/* JADX INFO: renamed from: 飘花落叶言世苏子楪哲兰.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C7258 implements InterfaceC6542 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C7255 f19351;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f19352;

    public /* synthetic */ C7258(C7255 c7255, int i) {
        this.f19352 = i;
        this.f19351 = c7255;
    }

    @Override // p052.InterfaceC6542
    public final Object invoke() {
        int i = this.f19352;
        C7255 c7255 = this.f19351;
        switch (i) {
            case 0:
                C4800 c4800 = c7255.f19346;
                return AbstractC8189.m13659(AbstractC6875.m12105(c4800), AbstractC6875.m12106(c4800));
            default:
                return c7255.f19345 ? AbstractC8189.m13658(AbstractC6875.m12101(c7255.f19346)) : EmptyList.INSTANCE;
        }
    }
}
