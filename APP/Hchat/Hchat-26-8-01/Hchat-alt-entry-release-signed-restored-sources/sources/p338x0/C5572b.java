package p338x0;

import gg.AbstractC1416l;
import p219oh.AbstractC3165h;

/* JADX INFO: renamed from: x0.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5572b {

    /* JADX INFO: renamed from: a */
    public final int f22698a;

    /* JADX INFO: renamed from: b */
    public final Integer f22699b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5572b(int i9, AbstractC3165h abstractC3165h, Integer num) {
        this.f22698a = i9;
        this.f22699b = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5572b)) {
            return false;
        }
        C5572b c5572b = (C5572b) obj;
        return this.f22698a == c5572b.f22698a && AbstractC1416l.m3825a(null, null) && AbstractC1416l.m3825a(this.f22699b, c5572b.f22699b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = ((Integer.hashCode(this.f22698a) * 31) + 0) * 31;
        Integer num = this.f22699b;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "ComposeStackTraceFrame(groupKey=" + this.f22698a + ", sourceInfo=" + ((Object) null) + ", groupOffset=" + this.f22699b + ')';
    }
}
