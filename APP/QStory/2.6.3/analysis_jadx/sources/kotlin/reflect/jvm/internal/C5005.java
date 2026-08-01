package kotlin.reflect.jvm.internal;

import kotlin.reflect.full.AbstractC4406;
import p052.InterfaceC6543;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子哲楪苏兰世, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5005 implements InterfaceC6543 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final AbstractC5003 f14426;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f14427;

    public /* synthetic */ C5005(AbstractC5003 abstractC5003, int i) {
        this.f14427 = i;
        this.f14426 = abstractC5003;
    }

    @Override // p052.InterfaceC6543
    public final Object invoke() {
        int i = this.f14427;
        AbstractC5003 abstractC5003 = this.f14426;
        switch (i) {
            case 0:
                return AbstractC5065.m10059(abstractC5003.mo8879());
            default:
                return AbstractC4406.m8932((C5004) abstractC5003);
        }
    }
}
