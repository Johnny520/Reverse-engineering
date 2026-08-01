package p073;

import androidx.activity.AbstractC0053;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier;

/* JADX INFO: renamed from: 飘花落叶言世楪哲子苏兰.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6930 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean f18495;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object f18496;

    public C6930(Object obj, boolean z) {
        this.f18496 = obj;
        this.f18495 = z;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C6930 m12199(C6930 c6930, NullabilityQualifier nullabilityQualifier, boolean z, int i) {
        Object obj = nullabilityQualifier;
        if ((i & 1) != 0) {
            obj = c6930.f18496;
        }
        if ((i & 2) != 0) {
            z = c6930.f18495;
        }
        c6930.getClass();
        return new C6930(obj, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6930)) {
            return false;
        }
        C6930 c6930 = (C6930) obj;
        return AbstractC4394.m8917(this.f18496, c6930.f18496) && this.f18495 == c6930.f18495;
    }

    public final int hashCode() {
        Object obj = this.f18496;
        return Boolean.hashCode(this.f18495) + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WithMigrationStatus(qualifier=");
        sb.append(this.f18496);
        sb.append(", isForWarningOnly=");
        return AbstractC0053.m150(sb, this.f18495, ')');
    }
}
