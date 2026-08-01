package p089;

import androidx.activity.AbstractC0900;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier;

/* JADX INFO: renamed from: 飘花落叶言世楪哲子苏兰.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7754 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C7754 f18820 = new C7754(null, false);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean f18821;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean f18822;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean f18823;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final MutabilityQualifier f18824;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final NullabilityQualifier f18825;

    public C7754(NullabilityQualifier nullabilityQualifier, MutabilityQualifier mutabilityQualifier, boolean z, boolean z2, boolean z3) {
        this.f18825 = nullabilityQualifier;
        this.f18824 = mutabilityQualifier;
        this.f18823 = z;
        this.f18822 = z2;
        this.f18821 = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7754)) {
            return false;
        }
        C7754 c7754 = (C7754) obj;
        return this.f18825 == c7754.f18825 && this.f18824 == c7754.f18824 && this.f18823 == c7754.f18823 && this.f18822 == c7754.f18822 && this.f18821 == c7754.f18821;
    }

    public final int hashCode() {
        NullabilityQualifier nullabilityQualifier = this.f18825;
        int iHashCode = (nullabilityQualifier == null ? 0 : nullabilityQualifier.hashCode()) * 31;
        MutabilityQualifier mutabilityQualifier = this.f18824;
        return Boolean.hashCode(this.f18821) + AbstractC0900.m701(AbstractC0900.m701((iHashCode + (mutabilityQualifier != null ? mutabilityQualifier.hashCode() : 0)) * 31, 31, this.f18823), 31, this.f18822);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JavaTypeQualifiers(nullability=");
        sb.append(this.f18825);
        sb.append(", mutability=");
        sb.append(this.f18824);
        sb.append(", definitelyNotNull=");
        sb.append(this.f18823);
        sb.append(", isNullabilityQualifierForWarning=");
        sb.append(this.f18822);
        sb.append(", isMutabilityQualifierForWarning=");
        return AbstractC0900.m712(sb, this.f18821, ')');
    }

    public /* synthetic */ C7754(NullabilityQualifier nullabilityQualifier, boolean z) {
        this(nullabilityQualifier, null, z, false, false);
    }
}
