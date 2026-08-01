package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC4395;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4790 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final List f13948;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean f13949;

    static {
        new C4790(false);
    }

    public C4790(boolean z) {
        EmptyList emptyList = EmptyList.INSTANCE;
        emptyList.getClass();
        this.f13949 = z;
        this.f13948 = emptyList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4790)) {
            return false;
        }
        C4790 c4790 = (C4790) obj;
        return this.f13949 == c4790.f13949 && AbstractC4395.m8907(this.f13948, c4790.f13948);
    }

    public final int hashCode() {
        return this.f13948.hashCode() + (Boolean.hashCode(this.f13949) * 31);
    }

    public final String toString() {
        return "PreReleaseInfo(isInvisible=" + this.f13949 + ", poisoningFeatures=" + this.f13948 + ')';
    }
}
