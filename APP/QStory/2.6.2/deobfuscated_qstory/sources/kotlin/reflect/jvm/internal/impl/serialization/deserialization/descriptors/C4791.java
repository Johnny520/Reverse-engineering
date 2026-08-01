package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import androidx.compose.foundation.draganddrop.AbstractC0455;
import p052.InterfaceC6542;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4791 implements InterfaceC6542 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C4790 f13956;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final AbstractC4794 f13957;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f13958;

    public /* synthetic */ C4791(C4790 c4790, AbstractC4794 abstractC4794, int i) {
        this.f13958 = i;
        this.f13956 = c4790;
        this.f13957 = abstractC4794;
    }

    @Override // p052.InterfaceC6542
    public final Object invoke() {
        int i = this.f13958;
        AbstractC4794 abstractC4794 = this.f13957;
        C4790 c4790 = this.f13956;
        switch (i) {
            case 0:
                return AbstractC0455.m1156(c4790.f13952.keySet(), abstractC4794.mo9538());
            default:
                return AbstractC0455.m1156(c4790.f13951.keySet(), abstractC4794.mo9539());
        }
    }
}
