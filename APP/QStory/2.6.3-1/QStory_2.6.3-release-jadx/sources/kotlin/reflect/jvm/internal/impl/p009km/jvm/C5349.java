package kotlin.reflect.jvm.internal.impl.p009km.jvm;

import kotlin.jvm.internal.AbstractC5227;
import net.bytebuddy.pool.TypePool;
import p086.C7727;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.km.jvm.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5349 implements Comparable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f13507;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final int f13508;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final int f13509;

    static {
        new C5349(C7727.f18701.f18756);
        new C5349(C7727.f18700.f18756);
    }

    public C5349(int i, int i2, int i3) {
        this.f13509 = i;
        this.f13507 = i2;
        this.f13508 = i3;
        if (i < 0) {
            C6755.m11869("Major version should be not less than 0");
            throw null;
        }
        if (i2 < 0) {
            C6755.m11869("Minor version should be not less than 0");
            throw null;
        }
        if (i3 >= 0) {
            return;
        }
        C6755.m11869("Patch version should be not less than 0");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C5349.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        C5349 c5349 = (C5349) obj;
        return this.f13509 == c5349.f13509 && this.f13507 == c5349.f13507 && this.f13508 == c5349.f13508;
    }

    public final int hashCode() {
        return (((this.f13509 * 31) + this.f13507) * 31) + this.f13508;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f13509);
        sb.append(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
        sb.append(this.f13507);
        sb.append(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
        sb.append(this.f13508);
        return sb.toString();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C5349 c5349) {
        c5349.getClass();
        int iM9464 = AbstractC5227.m9464(this.f13509, c5349.f13509);
        if (iM9464 != 0) {
            return iM9464;
        }
        int iM94642 = AbstractC5227.m9464(this.f13507, c5349.f13507);
        return iM94642 != 0 ? iM94642 : AbstractC5227.m9464(this.f13508, c5349.f13508);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5349(int[] iArr) {
        this(iArr[0], iArr[1], iArr[2]);
        iArr.getClass();
    }
}
