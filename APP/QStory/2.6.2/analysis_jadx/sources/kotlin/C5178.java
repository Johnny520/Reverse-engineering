package kotlin;

import com.bumptech.glide.AbstractC3056;
import kotlin.jvm.internal.AbstractC4394;

/* JADX INFO: renamed from: kotlin.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5178 implements Comparable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final long f14742;

    public /* synthetic */ C5178(long j) {
        this.f14742 = j;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return AbstractC4394.m8914(this.f14742 ^ Long.MIN_VALUE, ((C5178) obj).f14742 ^ Long.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5178) {
            return this.f14742 == ((C5178) obj).f14742;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f14742);
    }

    public final String toString() {
        long j = this.f14742;
        if (j >= 0) {
            AbstractC3056.m6677(10);
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
        AbstractC3056.m6677(10);
        String string2 = Long.toString(j2, 10);
        string2.getClass();
        AbstractC3056.m6677(10);
        String string3 = Long.toString(j3, 10);
        string3.getClass();
        return string2.concat(string3);
    }
}
