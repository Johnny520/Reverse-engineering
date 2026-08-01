package p100;

import kotlin.reflect.jvm.internal.impl.types.AbstractC4878;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4882;
import p079.AbstractC6989;

/* JADX INFO: renamed from: 飘花落叶言世苏子楪兰哲.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7245 implements InterfaceC7244 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final AbstractC6989 f19304;

    public C7245(AbstractC6989 abstractC6989) {
        this.f19304 = abstractC6989;
    }

    public final boolean equals(Object obj) {
        C7245 c7245 = obj instanceof C7245 ? (C7245) obj : null;
        return this.f19304.equals(c7245 != null ? c7245.f19304 : null);
    }

    @Override // p100.InterfaceC7244
    public final AbstractC4882 getType() {
        AbstractC4878 abstractC4878Mo9025 = this.f19304.mo9025();
        abstractC4878Mo9025.getClass();
        return abstractC4878Mo9025;
    }

    public final int hashCode() {
        return this.f19304.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Class{");
        AbstractC4878 abstractC4878Mo9025 = this.f19304.mo9025();
        abstractC4878Mo9025.getClass();
        sb.append(abstractC4878Mo9025);
        sb.append('}');
        return sb.toString();
    }
}
