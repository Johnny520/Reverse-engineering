package kotlin.reflect.jvm.internal.impl.load.java;

import androidx.activity.AbstractC0900;
import java.util.Collection;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier;
import p089.C7760;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5458 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean f13879;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean f13880;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean f13881;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Collection f13882;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C7760 f13883;

    public C5458(C7760 c7760, Collection collection, int i) {
        this(c7760, collection, c7760.f18836 == NullabilityQualifier.NOT_NULL, (i & 8) == 0, (i & 16) == 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5458)) {
            return false;
        }
        C5458 c5458 = (C5458) obj;
        return AbstractC5227.m9466(this.f13883, c5458.f13883) && AbstractC5227.m9466(this.f13882, c5458.f13882) && this.f13881 == c5458.f13881 && this.f13880 == c5458.f13880 && this.f13879 == c5458.f13879;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f13879) + AbstractC0900.m701(AbstractC0900.m701((this.f13882.hashCode() + (this.f13883.hashCode() * 31)) * 31, 31, this.f13881), 31, this.f13880);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JavaDefaultQualifiers(nullabilityQualifier=");
        sb.append(this.f13883);
        sb.append(", qualifierApplicabilityTypes=");
        sb.append(this.f13882);
        sb.append(", definitelyNotNull=");
        sb.append(this.f13881);
        sb.append(", preferQualifierOverBound=");
        sb.append(this.f13880);
        sb.append(", preferQualifierOverSupertype=");
        return AbstractC0900.m712(sb, this.f13879, ')');
    }

    public C5458(C7760 c7760, Collection collection, boolean z, boolean z2, boolean z3) {
        collection.getClass();
        this.f13883 = c7760;
        this.f13882 = collection;
        this.f13881 = z;
        this.f13880 = z2;
        this.f13879 = z3;
    }
}
