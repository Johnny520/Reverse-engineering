package p100;

import kotlin.reflect.jvm.internal.impl.types.AbstractC4877;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4881;
import p079.AbstractC6988;

/* JADX INFO: renamed from: 飘花落叶言世苏子楪兰哲.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7244 implements InterfaceC7243 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final AbstractC6988 f19309;

    public C7244(AbstractC6988 abstractC6988) {
        this.f19309 = abstractC6988;
    }

    public final boolean equals(Object obj) {
        C7244 c7244 = obj instanceof C7244 ? (C7244) obj : null;
        return this.f19309.equals(c7244 != null ? c7244.f19309 : null);
    }

    @Override // p100.InterfaceC7243
    public final AbstractC4881 getType() {
        AbstractC4877 abstractC4877Mo9035 = this.f19309.mo9035();
        abstractC4877Mo9035.getClass();
        return abstractC4877Mo9035;
    }

    public final int hashCode() {
        return this.f19309.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Class{");
        AbstractC4877 abstractC4877Mo9035 = this.f19309.mo9035();
        abstractC4877Mo9035.getClass();
        sb.append(abstractC4877Mo9035);
        sb.append('}');
        return sb.toString();
    }
}
