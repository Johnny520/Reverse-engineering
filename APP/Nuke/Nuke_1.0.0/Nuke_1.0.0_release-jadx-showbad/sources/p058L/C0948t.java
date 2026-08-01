package p058L;

import p011B4.AbstractC0231b;
import p147d1.EnumC1960j;

/* JADX INFO: renamed from: L.t */
/* JADX INFO: loaded from: classes.dex */
public final class C0948t {

    /* JADX INFO: renamed from: a */
    public final EnumC1960j f2981a;

    /* JADX INFO: renamed from: b */
    public final int f2982b;

    /* JADX INFO: renamed from: c */
    public final long f2983c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0948t(EnumC1960j enumC1960j, int i5, long j5) {
        this.f2981a = enumC1960j;
        this.f2982b = i5;
        this.f2983c = j5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0948t)) {
            return false;
        }
        C0948t c0948t = (C0948t) obj;
        return this.f2981a == c0948t.f2981a && this.f2982b == c0948t.f2982b && this.f2983c == c0948t.f2983c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Long.hashCode(this.f2983c) + AbstractC0231b.m391b(this.f2982b, this.f2981a.hashCode() * 31, 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "AnchorInfo(direction=" + this.f2981a + ", offset=" + this.f2982b + ", selectableId=" + this.f2983c + ')';
    }
}
