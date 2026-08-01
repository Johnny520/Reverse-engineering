package p070;

import androidx.activity.AbstractC0053;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.AbstractC4343;
import kotlin.collections.AbstractC4346;
import kotlin.collections.C4342;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC4394;
import net.bytebuddy.pool.TypePool;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言世楪哲兰子苏.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6902 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final List f18412;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int f18413;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f18414;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f18415;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int[] f18416;

    public AbstractC6902(int... iArr) {
        List listM8804;
        this.f18416 = iArr;
        Integer numM8846 = AbstractC4346.m8846(iArr, 0);
        this.f18415 = numM8846 != null ? numM8846.intValue() : -1;
        Integer numM88462 = AbstractC4346.m8846(iArr, 1);
        this.f18414 = numM88462 != null ? numM88462.intValue() : -1;
        Integer numM88463 = AbstractC4346.m8846(iArr, 2);
        this.f18413 = numM88463 != null ? numM88463.intValue() : -1;
        if (iArr.length <= 3) {
            listM8804 = EmptyList.INSTANCE;
        } else {
            if (iArr.length > 1024) {
                C5919.m11249(AbstractC0053.m154(new StringBuilder("BinaryVersion with length more than 1024 are not supported. Provided length "), iArr.length, TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH));
                throw null;
            }
            listM8804 = AbstractC4343.m8804(new C4342(iArr).subList(3, iArr.length));
        }
        this.f18412 = listM8804;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !getClass().equals(obj.getClass())) {
            return false;
        }
        AbstractC6902 abstractC6902 = (AbstractC6902) obj;
        return this.f18415 == abstractC6902.f18415 && this.f18414 == abstractC6902.f18414 && this.f18413 == abstractC6902.f18413 && AbstractC4394.m8917(this.f18412, abstractC6902.f18412);
    }

    public final int hashCode() {
        int i = this.f18415;
        int i2 = (i * 31) + this.f18414 + i;
        int i3 = (i2 * 31) + this.f18413 + i2;
        return this.f18412.hashCode() + (i3 * 31) + i3;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        for (int i : this.f18416) {
            if (i == -1) {
                break;
            }
            arrayList.add(Integer.valueOf(i));
        }
        return arrayList.isEmpty() ? "unknown" : AbstractC4343.m8813(arrayList, ".", null, null, null, 62);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean m12156(int i, int i2, int i3) {
        int i4 = this.f18415;
        if (i4 > i) {
            return true;
        }
        if (i4 < i) {
            return false;
        }
        int i5 = this.f18414;
        if (i5 > i2) {
            return true;
        }
        return i5 >= i2 && this.f18413 >= i3;
    }
}
