package p147d1;

import com.bumptech.glide.AbstractC1926h;
import p153e1.C2019o;
import p153e1.C2020p;

/* JADX INFO: renamed from: d1.q */
/* JADX INFO: loaded from: classes.dex */
public final class C1967q {

    /* JADX INFO: renamed from: c */
    public static final C1967q f6649c = new C1967q(AbstractC1926h.m3579v(0), AbstractC1926h.m3579v(0));

    /* JADX INFO: renamed from: a */
    public final long f6650a;

    /* JADX INFO: renamed from: b */
    public final long f6651b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1967q(long j5, long j6) {
        this.f6650a = j5;
        this.f6651b = j6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1967q)) {
            return false;
        }
        C1967q c1967q = (C1967q) obj;
        return C2019o.m3708a(this.f6650a, c1967q.f6650a) && C2019o.m3708a(this.f6651b, c1967q.f6651b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        C2020p[] c2020pArr = C2019o.f6746b;
        return Long.hashCode(this.f6651b) + (Long.hashCode(this.f6650a) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "TextIndent(firstLine=" + ((Object) C2019o.m3711d(this.f6650a)) + ", restLine=" + ((Object) C2019o.m3711d(this.f6651b)) + ')';
    }
}
