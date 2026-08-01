package kotlin.reflect.jvm.internal;

import kotlin.reflect.full.AbstractC4405;
import p052.InterfaceC6542;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子哲楪苏兰世, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5004 implements InterfaceC6542 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final AbstractC5002 f14424;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f14425;

    public /* synthetic */ C5004(AbstractC5002 abstractC5002, int i) {
        this.f14425 = i;
        this.f14424 = abstractC5002;
    }

    @Override // p052.InterfaceC6542
    public final Object invoke() {
        int i = this.f14425;
        AbstractC5002 abstractC5002 = this.f14424;
        switch (i) {
            case 0:
                return AbstractC5064.m10055(abstractC5002.mo8889());
            default:
                return AbstractC4405.m8942((C5003) abstractC5002);
        }
    }
}
