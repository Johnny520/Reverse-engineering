package p070;

import androidx.activity.AbstractC0053;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.AbstractC4344;
import kotlin.collections.AbstractC4347;
import kotlin.collections.C4343;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC4395;
import net.bytebuddy.pool.TypePool;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言世楪哲兰子苏.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6903 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final List f18407;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int f18408;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f18409;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f18410;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int[] f18411;

    public AbstractC6903(int... iArr) {
        List listM8797;
        this.f18411 = iArr;
        Integer numM8823 = AbstractC4347.m8823(iArr, 0);
        this.f18410 = numM8823 != null ? numM8823.intValue() : -1;
        Integer numM88232 = AbstractC4347.m8823(iArr, 1);
        this.f18409 = numM88232 != null ? numM88232.intValue() : -1;
        Integer numM88233 = AbstractC4347.m8823(iArr, 2);
        this.f18408 = numM88233 != null ? numM88233.intValue() : -1;
        if (iArr.length <= 3) {
            listM8797 = EmptyList.INSTANCE;
        } else {
            if (iArr.length > 1024) {
                C5925.m11310(AbstractC0053.m156(new StringBuilder("BinaryVersion with length more than 1024 are not supported. Provided length "), iArr.length, TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH));
                throw null;
            }
            listM8797 = AbstractC4344.m8797(new C4343(iArr).subList(3, iArr.length));
        }
        this.f18407 = listM8797;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !getClass().equals(obj.getClass())) {
            return false;
        }
        AbstractC6903 abstractC6903 = (AbstractC6903) obj;
        return this.f18410 == abstractC6903.f18410 && this.f18409 == abstractC6903.f18409 && this.f18408 == abstractC6903.f18408 && AbstractC4395.m8907(this.f18407, abstractC6903.f18407);
    }

    public final int hashCode() {
        int i = this.f18410;
        int i2 = (i * 31) + this.f18409 + i;
        int i3 = (i2 * 31) + this.f18408 + i2;
        return this.f18407.hashCode() + (i3 * 31) + i3;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        for (int i : this.f18411) {
            if (i == -1) {
                break;
            }
            arrayList.add(Integer.valueOf(i));
        }
        return arrayList.isEmpty() ? "unknown" : AbstractC4344.m8810(arrayList, ".", null, null, null, 62);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean m12184(int i, int i2, int i3) {
        int i4 = this.f18410;
        if (i4 > i) {
            return true;
        }
        if (i4 < i) {
            return false;
        }
        int i5 = this.f18409;
        if (i5 > i2) {
            return true;
        }
        return i5 >= i2 && this.f18408 >= i3;
    }
}
