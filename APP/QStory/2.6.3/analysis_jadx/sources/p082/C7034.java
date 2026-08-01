package p082;

import java.util.Set;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4878;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;

/* JADX INFO: renamed from: 飘花落叶言世楪苏兰子哲.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7034 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final AbstractC4878 f18874;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Set f18875;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean f18876;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean f18877;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final JavaTypeFlexibility f18878;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final TypeUsage f18879;

    public /* synthetic */ C7034(TypeUsage typeUsage, boolean z, boolean z2, Set set, int i) {
        this(typeUsage, JavaTypeFlexibility.INFLEXIBLE, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? null : set, null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C7034 m12369(C7034 c7034, JavaTypeFlexibility javaTypeFlexibility, boolean z, Set set, AbstractC4878 abstractC4878, int i) {
        TypeUsage typeUsage = c7034.f18879;
        if ((i & 2) != 0) {
            javaTypeFlexibility = c7034.f18878;
        }
        JavaTypeFlexibility javaTypeFlexibility2 = javaTypeFlexibility;
        if ((i & 4) != 0) {
            z = c7034.f18877;
        }
        boolean z2 = z;
        boolean z3 = c7034.f18876;
        if ((i & 16) != 0) {
            set = c7034.f18875;
        }
        Set set2 = set;
        if ((i & 32) != 0) {
            abstractC4878 = c7034.f18874;
        }
        c7034.getClass();
        typeUsage.getClass();
        javaTypeFlexibility2.getClass();
        return new C7034(typeUsage, javaTypeFlexibility2, z2, z3, set2, abstractC4878);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C7034)) {
            return false;
        }
        C7034 c7034 = (C7034) obj;
        return AbstractC4395.m8907(c7034.f18874, this.f18874) && c7034.f18879 == this.f18879 && c7034.f18878 == this.f18878 && c7034.f18877 == this.f18877 && c7034.f18876 == this.f18876;
    }

    public final int hashCode() {
        AbstractC4878 abstractC4878 = this.f18874;
        int iHashCode = abstractC4878 != null ? abstractC4878.hashCode() : 0;
        int iHashCode2 = this.f18879.hashCode() + (iHashCode * 31) + iHashCode;
        int iHashCode3 = this.f18878.hashCode() + (iHashCode2 * 31) + iHashCode2;
        int i = (iHashCode3 * 31) + (this.f18877 ? 1 : 0) + iHashCode3;
        return (i * 31) + (this.f18876 ? 1 : 0) + i;
    }

    public final String toString() {
        return "JavaTypeAttributes(howThisTypeIsUsed=" + this.f18879 + ", flexibility=" + this.f18878 + ", isRaw=" + this.f18877 + ", isForAnnotationParameter=" + this.f18876 + ", visitedTypeParameters=" + this.f18875 + ", defaultType=" + this.f18874 + ')';
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C7034 m12370(JavaTypeFlexibility javaTypeFlexibility) {
        javaTypeFlexibility.getClass();
        return m12369(this, javaTypeFlexibility, false, null, null, 61);
    }

    public C7034(TypeUsage typeUsage, JavaTypeFlexibility javaTypeFlexibility, boolean z, boolean z2, Set set, AbstractC4878 abstractC4878) {
        typeUsage.getClass();
        javaTypeFlexibility.getClass();
        this.f18879 = typeUsage;
        this.f18878 = javaTypeFlexibility;
        this.f18877 = z;
        this.f18876 = z2;
        this.f18875 = set;
        this.f18874 = abstractC4878;
    }
}
