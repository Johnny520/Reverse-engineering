package p102z0;

import p022L.AbstractC0174d;
import p022L.RunnableC0171a;
import p027N0.AbstractC0223g;

/* JADX INFO: renamed from: z0.o */
/* JADX INFO: loaded from: classes.dex */
public final class C1132o {

    /* JADX INFO: renamed from: a */
    public final String f3815a;

    /* JADX INFO: renamed from: b */
    public volatile boolean f3816b;

    /* JADX INFO: renamed from: c */
    public volatile int f3817c;

    /* JADX INFO: renamed from: d */
    public volatile RunnableC0171a f3818d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1132o(String str) {
        AbstractC0223g.m418e(str, "talker");
        this.f3815a = str;
        this.f3816b = false;
        this.f3817c = 0;
        this.f3818d = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1132o)) {
            return false;
        }
        C1132o c1132o = (C1132o) obj;
        return AbstractC0223g.m414a(this.f3815a, c1132o.f3815a) && this.f3816b == c1132o.f3816b && this.f3817c == c1132o.f3817c && AbstractC0223g.m414a(this.f3818d, c1132o.f3818d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return AbstractC0174d.m345a(this.f3817c, (Boolean.hashCode(this.f3816b) + (this.f3815a.hashCode() * 31)) * 31, 31) + (this.f3818d == null ? 0 : this.f3818d.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "PollState(talker=" + this.f3815a + ", active=" + this.f3816b + ", generation=" + this.f3817c + ", scheduledTask=" + this.f3818d + ")";
    }
}
