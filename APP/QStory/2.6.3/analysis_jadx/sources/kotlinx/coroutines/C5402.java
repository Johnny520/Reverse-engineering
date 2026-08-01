package kotlinx.coroutines;

import androidx.activity.AbstractC0053;
import kotlin.coroutines.AbstractC4359;
import kotlin.jvm.internal.AbstractC4395;

/* JADX INFO: renamed from: kotlinx.coroutines.飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5402 extends AbstractC4359 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C5453 f15044 = new C5453();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final String f15045;

    public C5402(String str) {
        super(f15044);
        this.f15045 = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5402) && AbstractC4395.m8907(this.f15045, ((C5402) obj).f15045);
    }

    public final int hashCode() {
        return this.f15045.hashCode();
    }

    public final String toString() {
        return AbstractC0053.m148(new StringBuilder("CoroutineName("), this.f15045, ')');
    }
}
