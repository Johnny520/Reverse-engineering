package p073;

import androidx.activity.AbstractC0053;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier;

/* JADX INFO: renamed from: 飘花落叶言世楪哲子苏兰.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6925 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C6925 f18475 = new C6925(null, false);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean f18476;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean f18477;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean f18478;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final MutabilityQualifier f18479;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final NullabilityQualifier f18480;

    public C6925(NullabilityQualifier nullabilityQualifier, MutabilityQualifier mutabilityQualifier, boolean z, boolean z2, boolean z3) {
        this.f18480 = nullabilityQualifier;
        this.f18479 = mutabilityQualifier;
        this.f18478 = z;
        this.f18477 = z2;
        this.f18476 = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6925)) {
            return false;
        }
        C6925 c6925 = (C6925) obj;
        return this.f18480 == c6925.f18480 && this.f18479 == c6925.f18479 && this.f18478 == c6925.f18478 && this.f18477 == c6925.f18477 && this.f18476 == c6925.f18476;
    }

    public final int hashCode() {
        NullabilityQualifier nullabilityQualifier = this.f18480;
        int iHashCode = (nullabilityQualifier == null ? 0 : nullabilityQualifier.hashCode()) * 31;
        MutabilityQualifier mutabilityQualifier = this.f18479;
        return Boolean.hashCode(this.f18476) + AbstractC0053.m141(AbstractC0053.m141((iHashCode + (mutabilityQualifier != null ? mutabilityQualifier.hashCode() : 0)) * 31, 31, this.f18478), 31, this.f18477);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JavaTypeQualifiers(nullability=");
        sb.append(this.f18480);
        sb.append(", mutability=");
        sb.append(this.f18479);
        sb.append(", definitelyNotNull=");
        sb.append(this.f18478);
        sb.append(", isNullabilityQualifierForWarning=");
        sb.append(this.f18477);
        sb.append(", isMutabilityQualifierForWarning=");
        return AbstractC0053.m152(sb, this.f18476, ')');
    }

    public /* synthetic */ C6925(NullabilityQualifier nullabilityQualifier, boolean z) {
        this(nullabilityQualifier, null, z, false, false);
    }
}
