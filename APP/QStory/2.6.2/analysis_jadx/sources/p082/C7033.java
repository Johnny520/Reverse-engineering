package p082;

import java.util.Set;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4877;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;

/* JADX INFO: renamed from: 飘花落叶言世楪苏兰子哲.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7033 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final AbstractC4877 f18879;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Set f18880;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean f18881;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean f18882;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final JavaTypeFlexibility f18883;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final TypeUsage f18884;

    public /* synthetic */ C7033(TypeUsage typeUsage, boolean z, boolean z2, Set set, int i) {
        this(typeUsage, JavaTypeFlexibility.INFLEXIBLE, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? null : set, null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C7033 m12342(C7033 c7033, JavaTypeFlexibility javaTypeFlexibility, boolean z, Set set, AbstractC4877 abstractC4877, int i) {
        TypeUsage typeUsage = c7033.f18884;
        if ((i & 2) != 0) {
            javaTypeFlexibility = c7033.f18883;
        }
        JavaTypeFlexibility javaTypeFlexibility2 = javaTypeFlexibility;
        if ((i & 4) != 0) {
            z = c7033.f18882;
        }
        boolean z2 = z;
        boolean z3 = c7033.f18881;
        if ((i & 16) != 0) {
            set = c7033.f18880;
        }
        Set set2 = set;
        if ((i & 32) != 0) {
            abstractC4877 = c7033.f18879;
        }
        c7033.getClass();
        typeUsage.getClass();
        javaTypeFlexibility2.getClass();
        return new C7033(typeUsage, javaTypeFlexibility2, z2, z3, set2, abstractC4877);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C7033)) {
            return false;
        }
        C7033 c7033 = (C7033) obj;
        return AbstractC4394.m8917(c7033.f18879, this.f18879) && c7033.f18884 == this.f18884 && c7033.f18883 == this.f18883 && c7033.f18882 == this.f18882 && c7033.f18881 == this.f18881;
    }

    public final int hashCode() {
        AbstractC4877 abstractC4877 = this.f18879;
        int iHashCode = abstractC4877 != null ? abstractC4877.hashCode() : 0;
        int iHashCode2 = this.f18884.hashCode() + (iHashCode * 31) + iHashCode;
        int iHashCode3 = this.f18883.hashCode() + (iHashCode2 * 31) + iHashCode2;
        int i = (iHashCode3 * 31) + (this.f18882 ? 1 : 0) + iHashCode3;
        return (i * 31) + (this.f18881 ? 1 : 0) + i;
    }

    public final String toString() {
        return "JavaTypeAttributes(howThisTypeIsUsed=" + this.f18884 + ", flexibility=" + this.f18883 + ", isRaw=" + this.f18882 + ", isForAnnotationParameter=" + this.f18881 + ", visitedTypeParameters=" + this.f18880 + ", defaultType=" + this.f18879 + ')';
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C7033 m12343(JavaTypeFlexibility javaTypeFlexibility) {
        javaTypeFlexibility.getClass();
        return m12342(this, javaTypeFlexibility, false, null, null, 61);
    }

    public C7033(TypeUsage typeUsage, JavaTypeFlexibility javaTypeFlexibility, boolean z, boolean z2, Set set, AbstractC4877 abstractC4877) {
        typeUsage.getClass();
        javaTypeFlexibility.getClass();
        this.f18884 = typeUsage;
        this.f18883 = javaTypeFlexibility;
        this.f18882 = z;
        this.f18881 = z2;
        this.f18880 = set;
        this.f18879 = abstractC4877;
    }
}
