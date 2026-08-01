package kotlin.reflect.jvm.internal.impl.km.jvm;

import kotlin.jvm.internal.AbstractC4395;
import net.bytebuddy.pool.TypePool;
import p070.C6898;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.km.jvm.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4517 implements Comparable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f13162;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final int f13163;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final int f13164;

    static {
        new C4517(C6898.f18356.f18411);
        new C4517(C6898.f18355.f18411);
    }

    public C4517(int i, int i2, int i3) {
        this.f13164 = i;
        this.f13162 = i2;
        this.f13163 = i3;
        if (i < 0) {
            C5925.m11310("Major version should be not less than 0");
            throw null;
        }
        if (i2 < 0) {
            C5925.m11310("Minor version should be not less than 0");
            throw null;
        }
        if (i3 >= 0) {
            return;
        }
        C5925.m11310("Patch version should be not less than 0");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C4517.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        C4517 c4517 = (C4517) obj;
        return this.f13164 == c4517.f13164 && this.f13162 == c4517.f13162 && this.f13163 == c4517.f13163;
    }

    public final int hashCode() {
        return (((this.f13164 * 31) + this.f13162) * 31) + this.f13163;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f13164);
        sb.append(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
        sb.append(this.f13162);
        sb.append(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
        sb.append(this.f13163);
        return sb.toString();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C4517 c4517) {
        c4517.getClass();
        int iM8905 = AbstractC4395.m8905(this.f13164, c4517.f13164);
        if (iM8905 != 0) {
            return iM8905;
        }
        int iM89052 = AbstractC4395.m8905(this.f13162, c4517.f13162);
        return iM89052 != 0 ? iM89052 : AbstractC4395.m8905(this.f13163, c4517.f13163);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4517(int[] iArr) {
        this(iArr[0], iArr[1], iArr[2]);
        iArr.getClass();
    }
}
