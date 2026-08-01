package kotlin;

import kotlin.jvm.internal.AbstractC5227;
import p191.AbstractC8568;

/* JADX INFO: renamed from: kotlin.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6011 implements Comparable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final long f15087;

    public /* synthetic */ C6011(long j) {
        this.f15087 = j;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return AbstractC5227.m9463(this.f15087 ^ Long.MIN_VALUE, ((C6011) obj).f15087 ^ Long.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C6011) {
            return this.f15087 == ((C6011) obj).f15087;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f15087);
    }

    public final String toString() {
        long j = this.f15087;
        if (j >= 0) {
            AbstractC8568.m13642(10);
            String string = Long.toString(j, 10);
            string.getClass();
            return string;
        }
        long j2 = ((j >>> 1) / 10) << 1;
        long j3 = j - (j2 * 10);
        if (j3 >= 10) {
            j3 -= 10;
            j2++;
        }
        AbstractC8568.m13642(10);
        String string2 = Long.toString(j2, 10);
        string2.getClass();
        AbstractC8568.m13642(10);
        String string3 = Long.toString(j3, 10);
        string3.getClass();
        return string2.concat(string3);
    }
}
