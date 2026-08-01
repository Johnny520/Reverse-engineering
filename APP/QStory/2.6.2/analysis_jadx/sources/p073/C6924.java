package p073;

import androidx.activity.AbstractC0053;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier;

/* JADX INFO: renamed from: 飘花落叶言世楪哲子苏兰.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6924 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C6924 f18480 = new C6924(null, false);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean f18481;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean f18482;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean f18483;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final MutabilityQualifier f18484;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final NullabilityQualifier f18485;

    public C6924(NullabilityQualifier nullabilityQualifier, MutabilityQualifier mutabilityQualifier, boolean z, boolean z2, boolean z3) {
        this.f18485 = nullabilityQualifier;
        this.f18484 = mutabilityQualifier;
        this.f18483 = z;
        this.f18482 = z2;
        this.f18481 = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6924)) {
            return false;
        }
        C6924 c6924 = (C6924) obj;
        return this.f18485 == c6924.f18485 && this.f18484 == c6924.f18484 && this.f18483 == c6924.f18483 && this.f18482 == c6924.f18482 && this.f18481 == c6924.f18481;
    }

    public final int hashCode() {
        NullabilityQualifier nullabilityQualifier = this.f18485;
        int iHashCode = (nullabilityQualifier == null ? 0 : nullabilityQualifier.hashCode()) * 31;
        MutabilityQualifier mutabilityQualifier = this.f18484;
        return Boolean.hashCode(this.f18481) + AbstractC0053.m140(AbstractC0053.m140((iHashCode + (mutabilityQualifier != null ? mutabilityQualifier.hashCode() : 0)) * 31, 31, this.f18483), 31, this.f18482);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JavaTypeQualifiers(nullability=");
        sb.append(this.f18485);
        sb.append(", mutability=");
        sb.append(this.f18484);
        sb.append(", definitelyNotNull=");
        sb.append(this.f18483);
        sb.append(", isNullabilityQualifierForWarning=");
        sb.append(this.f18482);
        sb.append(", isMutabilityQualifierForWarning=");
        return AbstractC0053.m150(sb, this.f18481, ')');
    }

    public /* synthetic */ C6924(NullabilityQualifier nullabilityQualifier, boolean z) {
        this(nullabilityQualifier, null, z, false, false);
    }
}
