package kotlin.reflect.jvm.internal.impl.load.kotlin;

import androidx.activity.AbstractC0900;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5471 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f13910;

    public C5471(String str) {
        this.f13910 = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5471) && this.f13910.equals(((C5471) obj).f13910);
    }

    public final int hashCode() {
        return this.f13910.hashCode();
    }

    public final String toString() {
        return AbstractC0900.m708(new StringBuilder("MemberSignature(signature="), this.f13910, ')');
    }
}
