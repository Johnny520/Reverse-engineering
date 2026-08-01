package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5227;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5622 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final List f14293;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean f14294;

    static {
        new C5622(false);
    }

    public C5622(boolean z) {
        EmptyList emptyList = EmptyList.INSTANCE;
        emptyList.getClass();
        this.f14294 = z;
        this.f14293 = emptyList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5622)) {
            return false;
        }
        C5622 c5622 = (C5622) obj;
        return this.f14294 == c5622.f14294 && AbstractC5227.m9466(this.f14293, c5622.f14293);
    }

    public final int hashCode() {
        return this.f14293.hashCode() + (Boolean.hashCode(this.f14294) * 31);
    }

    public final String toString() {
        return "PreReleaseInfo(isInvisible=" + this.f14294 + ", poisoningFeatures=" + this.f14293 + ')';
    }
}
