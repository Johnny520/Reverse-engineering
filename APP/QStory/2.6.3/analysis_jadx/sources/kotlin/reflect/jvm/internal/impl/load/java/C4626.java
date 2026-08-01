package kotlin.reflect.jvm.internal.impl.load.java;

import androidx.activity.AbstractC0053;
import java.util.Collection;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier;
import p073.C6931;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4626 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean f13534;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean f13535;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean f13536;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Collection f13537;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C6931 f13538;

    public C4626(C6931 c6931, Collection collection, int i) {
        this(c6931, collection, c6931.f18491 == NullabilityQualifier.NOT_NULL, (i & 8) == 0, (i & 16) == 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4626)) {
            return false;
        }
        C4626 c4626 = (C4626) obj;
        return AbstractC4395.m8907(this.f13538, c4626.f13538) && AbstractC4395.m8907(this.f13537, c4626.f13537) && this.f13536 == c4626.f13536 && this.f13535 == c4626.f13535 && this.f13534 == c4626.f13534;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f13534) + AbstractC0053.m141(AbstractC0053.m141((this.f13537.hashCode() + (this.f13538.hashCode() * 31)) * 31, 31, this.f13536), 31, this.f13535);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JavaDefaultQualifiers(nullabilityQualifier=");
        sb.append(this.f13538);
        sb.append(", qualifierApplicabilityTypes=");
        sb.append(this.f13537);
        sb.append(", definitelyNotNull=");
        sb.append(this.f13536);
        sb.append(", preferQualifierOverBound=");
        sb.append(this.f13535);
        sb.append(", preferQualifierOverSupertype=");
        return AbstractC0053.m152(sb, this.f13534, ')');
    }

    public C4626(C6931 c6931, Collection collection, boolean z, boolean z2, boolean z3) {
        collection.getClass();
        this.f13538 = c6931;
        this.f13537 = collection;
        this.f13536 = z;
        this.f13535 = z2;
        this.f13534 = z3;
    }
}
