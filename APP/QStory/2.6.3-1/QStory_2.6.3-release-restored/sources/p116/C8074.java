package p116;

import kotlin.reflect.jvm.internal.impl.types.AbstractC5710;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5714;
import p095.AbstractC7818;

/* JADX INFO: renamed from: 飘花落叶言世苏子楪兰哲.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8074 implements InterfaceC8073 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final AbstractC7818 f19649;

    public C8074(AbstractC7818 abstractC7818) {
        this.f19649 = abstractC7818;
    }

    public final boolean equals(Object obj) {
        C8074 c8074 = obj instanceof C8074 ? (C8074) obj : null;
        return this.f19649.equals(c8074 != null ? c8074.f19649 : null);
    }

    @Override // p116.InterfaceC8073
    public final AbstractC5714 getType() {
        AbstractC5710 abstractC5710Mo9584 = this.f19649.mo9584();
        abstractC5710Mo9584.getClass();
        return abstractC5710Mo9584;
    }

    public final int hashCode() {
        return this.f19649.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Class{");
        AbstractC5710 abstractC5710Mo9584 = this.f19649.mo9584();
        abstractC5710Mo9584.getClass();
        sb.append(abstractC5710Mo9584);
        sb.append('}');
        return sb.toString();
    }
}
