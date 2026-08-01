package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC4394;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4789 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final List f13944;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean f13945;

    static {
        new C4789(false);
    }

    public C4789(boolean z) {
        EmptyList emptyList = EmptyList.INSTANCE;
        emptyList.getClass();
        this.f13945 = z;
        this.f13944 = emptyList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4789)) {
            return false;
        }
        C4789 c4789 = (C4789) obj;
        return this.f13945 == c4789.f13945 && AbstractC4394.m8917(this.f13944, c4789.f13944);
    }

    public final int hashCode() {
        return this.f13944.hashCode() + (Boolean.hashCode(this.f13945) * 31);
    }

    public final String toString() {
        return "PreReleaseInfo(isInvisible=" + this.f13945 + ", poisoningFeatures=" + this.f13944 + ')';
    }
}
