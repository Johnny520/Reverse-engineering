package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.reflect.jvm.internal.impl.name.C4687;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4467 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final List f13093;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C4687 f13094;

    public C4467(C4687 c4687, List list) {
        c4687.getClass();
        list.getClass();
        this.f13094 = c4687;
        this.f13093 = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4467)) {
            return false;
        }
        C4467 c4467 = (C4467) obj;
        return AbstractC4394.m8917(this.f13094, c4467.f13094) && AbstractC4394.m8917(this.f13093, c4467.f13093);
    }

    public final int hashCode() {
        return this.f13093.hashCode() + (this.f13094.hashCode() * 31);
    }

    public final String toString() {
        return "ClassRequest(classId=" + this.f13094 + ", typeParametersCount=" + this.f13093 + ')';
    }
}
