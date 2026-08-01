package p089;

import androidx.activity.AbstractC0900;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier;

/* JADX INFO: renamed from: 飘花落叶言世楪哲子苏兰.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7760 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean f18835;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object f18836;

    public C7760(Object obj, boolean z) {
        this.f18836 = obj;
        this.f18835 = z;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C7760 m12786(C7760 c7760, NullabilityQualifier nullabilityQualifier, boolean z, int i) {
        Object obj = nullabilityQualifier;
        if ((i & 1) != 0) {
            obj = c7760.f18836;
        }
        if ((i & 2) != 0) {
            z = c7760.f18835;
        }
        c7760.getClass();
        return new C7760(obj, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7760)) {
            return false;
        }
        C7760 c7760 = (C7760) obj;
        return AbstractC5227.m9466(this.f18836, c7760.f18836) && this.f18835 == c7760.f18835;
    }

    public final int hashCode() {
        Object obj = this.f18836;
        return Boolean.hashCode(this.f18835) + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WithMigrationStatus(qualifier=");
        sb.append(this.f18836);
        sb.append(", isForWarningOnly=");
        return AbstractC0900.m712(sb, this.f18835, ')');
    }
}
