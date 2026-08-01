package kotlinx.coroutines;

import androidx.activity.AbstractC0900;
import kotlin.coroutines.AbstractC5191;
import kotlin.jvm.internal.AbstractC5227;

/* JADX INFO: renamed from: kotlinx.coroutines.飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6234 extends AbstractC5191 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C6285 f15389 = new C6285();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final String f15390;

    public C6234(String str) {
        super(f15389);
        this.f15390 = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6234) && AbstractC5227.m9466(this.f15390, ((C6234) obj).f15390);
    }

    public final int hashCode() {
        return this.f15390.hashCode();
    }

    public final String toString() {
        return AbstractC0900.m708(new StringBuilder("CoroutineName("), this.f15390, ')');
    }
}
