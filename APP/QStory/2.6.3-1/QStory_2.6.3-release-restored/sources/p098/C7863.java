package p098;

import java.util.Set;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5710;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;

/* JADX INFO: renamed from: 飘花落叶言世楪苏兰子哲.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7863 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final AbstractC5710 f19219;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Set f19220;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean f19221;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean f19222;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final JavaTypeFlexibility f19223;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final TypeUsage f19224;

    public /* synthetic */ C7863(TypeUsage typeUsage, boolean z, boolean z2, Set set, int i) {
        this(typeUsage, JavaTypeFlexibility.INFLEXIBLE, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? null : set, null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C7863 m12928(C7863 c7863, JavaTypeFlexibility javaTypeFlexibility, boolean z, Set set, AbstractC5710 abstractC5710, int i) {
        TypeUsage typeUsage = c7863.f19224;
        if ((i & 2) != 0) {
            javaTypeFlexibility = c7863.f19223;
        }
        JavaTypeFlexibility javaTypeFlexibility2 = javaTypeFlexibility;
        if ((i & 4) != 0) {
            z = c7863.f19222;
        }
        boolean z2 = z;
        boolean z3 = c7863.f19221;
        if ((i & 16) != 0) {
            set = c7863.f19220;
        }
        Set set2 = set;
        if ((i & 32) != 0) {
            abstractC5710 = c7863.f19219;
        }
        c7863.getClass();
        typeUsage.getClass();
        javaTypeFlexibility2.getClass();
        return new C7863(typeUsage, javaTypeFlexibility2, z2, z3, set2, abstractC5710);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C7863)) {
            return false;
        }
        C7863 c7863 = (C7863) obj;
        return AbstractC5227.m9466(c7863.f19219, this.f19219) && c7863.f19224 == this.f19224 && c7863.f19223 == this.f19223 && c7863.f19222 == this.f19222 && c7863.f19221 == this.f19221;
    }

    public final int hashCode() {
        AbstractC5710 abstractC5710 = this.f19219;
        int iHashCode = abstractC5710 != null ? abstractC5710.hashCode() : 0;
        int iHashCode2 = this.f19224.hashCode() + (iHashCode * 31) + iHashCode;
        int iHashCode3 = this.f19223.hashCode() + (iHashCode2 * 31) + iHashCode2;
        int i = (iHashCode3 * 31) + (this.f19222 ? 1 : 0) + iHashCode3;
        return (i * 31) + (this.f19221 ? 1 : 0) + i;
    }

    public final String toString() {
        return "JavaTypeAttributes(howThisTypeIsUsed=" + this.f19224 + ", flexibility=" + this.f19223 + ", isRaw=" + this.f19222 + ", isForAnnotationParameter=" + this.f19221 + ", visitedTypeParameters=" + this.f19220 + ", defaultType=" + this.f19219 + ')';
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C7863 m12929(JavaTypeFlexibility javaTypeFlexibility) {
        javaTypeFlexibility.getClass();
        return m12928(this, javaTypeFlexibility, false, null, null, 61);
    }

    public C7863(TypeUsage typeUsage, JavaTypeFlexibility javaTypeFlexibility, boolean z, boolean z2, Set set, AbstractC5710 abstractC5710) {
        typeUsage.getClass();
        javaTypeFlexibility.getClass();
        this.f19224 = typeUsage;
        this.f19223 = javaTypeFlexibility;
        this.f19222 = z;
        this.f19221 = z2;
        this.f19220 = set;
        this.f19219 = abstractC5710;
    }
}
