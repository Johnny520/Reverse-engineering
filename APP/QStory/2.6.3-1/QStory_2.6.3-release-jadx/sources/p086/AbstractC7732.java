package p086;

import androidx.activity.AbstractC0900;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.AbstractC5176;
import kotlin.collections.AbstractC5179;
import kotlin.collections.C5175;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5227;
import net.bytebuddy.pool.TypePool;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言世楪哲兰子苏.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7732 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final List f18752;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int f18753;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f18754;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f18755;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int[] f18756;

    public AbstractC7732(int... iArr) {
        List listM9356;
        this.f18756 = iArr;
        Integer numM9382 = AbstractC5179.m9382(iArr, 0);
        this.f18755 = numM9382 != null ? numM9382.intValue() : -1;
        Integer numM93822 = AbstractC5179.m9382(iArr, 1);
        this.f18754 = numM93822 != null ? numM93822.intValue() : -1;
        Integer numM93823 = AbstractC5179.m9382(iArr, 2);
        this.f18753 = numM93823 != null ? numM93823.intValue() : -1;
        if (iArr.length <= 3) {
            listM9356 = EmptyList.INSTANCE;
        } else {
            if (iArr.length > 1024) {
                C6755.m11869(AbstractC0900.m716(new StringBuilder("BinaryVersion with length more than 1024 are not supported. Provided length "), iArr.length, TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH));
                throw null;
            }
            listM9356 = AbstractC5176.m9356(new C5175(iArr).subList(3, iArr.length));
        }
        this.f18752 = listM9356;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !getClass().equals(obj.getClass())) {
            return false;
        }
        AbstractC7732 abstractC7732 = (AbstractC7732) obj;
        return this.f18755 == abstractC7732.f18755 && this.f18754 == abstractC7732.f18754 && this.f18753 == abstractC7732.f18753 && AbstractC5227.m9466(this.f18752, abstractC7732.f18752);
    }

    public final int hashCode() {
        int i = this.f18755;
        int i2 = (i * 31) + this.f18754 + i;
        int i3 = (i2 * 31) + this.f18753 + i2;
        return this.f18752.hashCode() + (i3 * 31) + i3;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        for (int i : this.f18756) {
            if (i == -1) {
                break;
            }
            arrayList.add(Integer.valueOf(i));
        }
        return arrayList.isEmpty() ? "unknown" : AbstractC5176.m9369(arrayList, ".", null, null, null, 62);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean m12743(int i, int i2, int i3) {
        int i4 = this.f18755;
        if (i4 > i) {
            return true;
        }
        if (i4 < i) {
            return false;
        }
        int i5 = this.f18754;
        if (i5 > i2) {
            return true;
        }
        return i5 >= i2 && this.f18753 >= i3;
    }
}
