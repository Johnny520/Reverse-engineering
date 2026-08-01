package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import p052.InterfaceC6543;
import p175.AbstractC7739;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4792 implements InterfaceC6543 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C4791 f13960;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final AbstractC4795 f13961;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f13962;

    public /* synthetic */ C4792(C4791 c4791, AbstractC4795 abstractC4795, int i) {
        this.f13962 = i;
        this.f13960 = c4791;
        this.f13961 = abstractC4795;
    }

    @Override // p052.InterfaceC6543
    public final Object invoke() {
        int i = this.f13962;
        AbstractC4795 abstractC4795 = this.f13961;
        C4791 c4791 = this.f13960;
        switch (i) {
            case 0:
                return AbstractC7739.m13054(c4791.f13956.keySet(), abstractC4795.mo9528());
            default:
                return AbstractC7739.m13054(c4791.f13955.keySet(), abstractC4795.mo9529());
        }
    }
}
