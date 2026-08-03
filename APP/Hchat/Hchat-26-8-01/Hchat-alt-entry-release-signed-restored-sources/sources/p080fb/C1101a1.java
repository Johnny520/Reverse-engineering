package p080fb;

import gg.AbstractC1416l;
import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: fb.a1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1101a1 {

    /* JADX INFO: renamed from: a */
    public final String f3547a;

    /* JADX INFO: renamed from: b */
    public final String f3548b;

    /* JADX INFO: renamed from: c */
    public final long f3549c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1101a1(long j3, String str, String str2) {
        str.getClass();
        this.f3547a = str;
        this.f3548b = str2;
        this.f3549c = j3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1101a1)) {
            return false;
        }
        C1101a1 c1101a1 = (C1101a1) obj;
        return AbstractC1416l.m3825a(this.f3547a, c1101a1.f3547a) && this.f3548b.equals(c1101a1.f3548b) && this.f3549c == c1101a1.f3549c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Long.hashCode(this.f3549c) + AbstractC0921a.m2244g(this.f3547a.hashCode() * 31, 31, this.f3548b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return AbstractC0921a.m2253p(AbstractC0255e.m1027p("ScriptPluginAgentQuotedMessage(role=", this.f3547a, ", content=", this.f3548b, ", createdAt="), this.f3549c, ")");
    }
}
