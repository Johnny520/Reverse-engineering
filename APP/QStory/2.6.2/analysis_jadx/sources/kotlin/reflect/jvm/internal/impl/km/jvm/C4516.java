package kotlin.reflect.jvm.internal.impl.km.jvm;

import kotlin.jvm.internal.AbstractC4394;
import net.bytebuddy.pool.TypePool;
import p070.C6897;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.km.jvm.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4516 implements Comparable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f13158;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final int f13159;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final int f13160;

    static {
        new C4516(C6897.f18361.f18416);
        new C4516(C6897.f18360.f18416);
    }

    public C4516(int i, int i2, int i3) {
        this.f13160 = i;
        this.f13158 = i2;
        this.f13159 = i3;
        if (i < 0) {
            C5919.m11249("Major version should be not less than 0");
            throw null;
        }
        if (i2 < 0) {
            C5919.m11249("Minor version should be not less than 0");
            throw null;
        }
        if (i3 >= 0) {
            return;
        }
        C5919.m11249("Patch version should be not less than 0");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C4516.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        C4516 c4516 = (C4516) obj;
        return this.f13160 == c4516.f13160 && this.f13158 == c4516.f13158 && this.f13159 == c4516.f13159;
    }

    public final int hashCode() {
        return (((this.f13160 * 31) + this.f13158) * 31) + this.f13159;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f13160);
        sb.append(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
        sb.append(this.f13158);
        sb.append(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
        sb.append(this.f13159);
        return sb.toString();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C4516 c4516) {
        c4516.getClass();
        int iM8915 = AbstractC4394.m8915(this.f13160, c4516.f13160);
        if (iM8915 != 0) {
            return iM8915;
        }
        int iM89152 = AbstractC4394.m8915(this.f13158, c4516.f13158);
        return iM89152 != 0 ? iM89152 : AbstractC4394.m8915(this.f13159, c4516.f13159);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4516(int[] iArr) {
        this(iArr[0], iArr[1], iArr[2]);
        iArr.getClass();
    }
}
