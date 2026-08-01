package p163g0;

import com.bumptech.glide.AbstractC1925g;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: g0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C2170b {

    /* JADX INFO: renamed from: a */
    public final int f7129a;

    /* JADX INFO: renamed from: b */
    public final Integer f7130b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2170b(int i5, AbstractC1925g abstractC1925g, Integer num) {
        this.f7129a = i5;
        this.f7130b = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2170b)) {
            return false;
        }
        C2170b c2170b = (C2170b) obj;
        return this.f7129a == c2170b.f7129a && AbstractC1665j.m2981a(null, null) && AbstractC1665j.m2981a(this.f7130b, c2170b.f7130b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = ((Integer.hashCode(this.f7129a) * 31) + 0) * 31;
        Integer num = this.f7130b;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "ComposeStackTraceFrame(groupKey=" + this.f7129a + ", sourceInfo=" + ((Object) null) + ", groupOffset=" + this.f7130b + ')';
    }
}
