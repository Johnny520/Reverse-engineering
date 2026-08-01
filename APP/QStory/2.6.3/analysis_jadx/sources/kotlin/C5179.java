package kotlin;

import kotlin.jvm.internal.AbstractC4395;
import p175.AbstractC7739;

/* JADX INFO: renamed from: kotlin.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5179 implements Comparable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final long f14742;

    public /* synthetic */ C5179(long j) {
        this.f14742 = j;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return AbstractC4395.m8904(this.f14742 ^ Long.MIN_VALUE, ((C5179) obj).f14742 ^ Long.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5179) {
            return this.f14742 == ((C5179) obj).f14742;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f14742);
    }

    public final String toString() {
        long j = this.f14742;
        if (j >= 0) {
            AbstractC7739.m13083(10);
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
        AbstractC7739.m13083(10);
        String string2 = Long.toString(j2, 10);
        string2.getClass();
        AbstractC7739.m13083(10);
        String string3 = Long.toString(j3, 10);
        string3.getClass();
        return string2.concat(string3);
    }
}
