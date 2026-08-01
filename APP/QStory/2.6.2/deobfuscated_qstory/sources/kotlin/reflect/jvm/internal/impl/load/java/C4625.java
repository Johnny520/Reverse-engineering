package kotlin.reflect.jvm.internal.impl.load.java;

import androidx.activity.AbstractC0053;
import java.util.Collection;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier;
import p073.C6930;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4625 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean f13530;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean f13531;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean f13532;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Collection f13533;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C6930 f13534;

    public C4625(C6930 c6930, Collection collection, int i) {
        this(c6930, collection, c6930.f18496 == NullabilityQualifier.NOT_NULL, (i & 8) == 0, (i & 16) == 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4625)) {
            return false;
        }
        C4625 c4625 = (C4625) obj;
        return AbstractC4394.m8917(this.f13534, c4625.f13534) && AbstractC4394.m8917(this.f13533, c4625.f13533) && this.f13532 == c4625.f13532 && this.f13531 == c4625.f13531 && this.f13530 == c4625.f13530;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f13530) + AbstractC0053.m140(AbstractC0053.m140((this.f13533.hashCode() + (this.f13534.hashCode() * 31)) * 31, 31, this.f13532), 31, this.f13531);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JavaDefaultQualifiers(nullabilityQualifier=");
        sb.append(this.f13534);
        sb.append(", qualifierApplicabilityTypes=");
        sb.append(this.f13533);
        sb.append(", definitelyNotNull=");
        sb.append(this.f13532);
        sb.append(", preferQualifierOverBound=");
        sb.append(this.f13531);
        sb.append(", preferQualifierOverSupertype=");
        return AbstractC0053.m150(sb, this.f13530, ')');
    }

    public C4625(C6930 c6930, Collection collection, boolean z, boolean z2, boolean z3) {
        collection.getClass();
        this.f13534 = c6930;
        this.f13533 = collection;
        this.f13532 = z;
        this.f13531 = z2;
        this.f13530 = z3;
    }
}
