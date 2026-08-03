package p080fb;

import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: fb.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1099a {

    /* JADX INFO: renamed from: a */
    public final String f3539a;

    /* JADX INFO: renamed from: b */
    public final String f3540b;

    /* JADX INFO: renamed from: c */
    public final String f3541c;

    /* JADX INFO: renamed from: d */
    public final long f3542d;

    /* JADX INFO: renamed from: e */
    public final String f3543e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1099a(String str, String str2, String str3, String str4, long j3) {
        this.f3539a = str;
        this.f3540b = str2;
        this.f3541c = str3;
        this.f3542d = j3;
        this.f3543e = str4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1099a)) {
            return false;
        }
        C1099a c1099a = (C1099a) obj;
        return this.f3539a.equals(c1099a.f3539a) && this.f3540b.equals(c1099a.f3540b) && this.f3541c.equals(c1099a.f3541c) && this.f3542d == c1099a.f3542d && this.f3543e.equals(c1099a.f3543e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f3543e.hashCode() + AbstractC0921a.m2243f(AbstractC0921a.m2244g(AbstractC0921a.m2244g(this.f3539a.hashCode() * 31, 31, this.f3540b), 31, this.f3541c), 31, this.f3542d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sbM1027p = AbstractC0255e.m1027p("ScriptPluginAgentAttachment(name=", this.f3539a, ", path=", this.f3540b, ", mimeType=");
        sbM1027p.append(this.f3541c);
        sbM1027p.append(", size=");
        sbM1027p.append(this.f3542d);
        sbM1027p.append(", sourceUri=");
        sbM1027p.append(this.f3543e);
        sbM1027p.append(")");
        return sbM1027p.toString();
    }
}
