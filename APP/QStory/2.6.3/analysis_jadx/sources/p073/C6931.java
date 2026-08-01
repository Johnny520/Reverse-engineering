package p073;

import androidx.activity.AbstractC0053;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier;

/* JADX INFO: renamed from: 飘花落叶言世楪哲子苏兰.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6931 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean f18490;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object f18491;

    public C6931(Object obj, boolean z) {
        this.f18491 = obj;
        this.f18490 = z;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C6931 m12227(C6931 c6931, NullabilityQualifier nullabilityQualifier, boolean z, int i) {
        Object obj = nullabilityQualifier;
        if ((i & 1) != 0) {
            obj = c6931.f18491;
        }
        if ((i & 2) != 0) {
            z = c6931.f18490;
        }
        c6931.getClass();
        return new C6931(obj, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6931)) {
            return false;
        }
        C6931 c6931 = (C6931) obj;
        return AbstractC4395.m8907(this.f18491, c6931.f18491) && this.f18490 == c6931.f18490;
    }

    public final int hashCode() {
        Object obj = this.f18491;
        return Boolean.hashCode(this.f18490) + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WithMigrationStatus(qualifier=");
        sb.append(this.f18491);
        sb.append(", isForWarningOnly=");
        return AbstractC0053.m152(sb, this.f18490, ')');
    }
}
