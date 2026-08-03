package p080fb;

import gg.AbstractC1416l;
import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: fb.t0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1176t0 {

    /* JADX INFO: renamed from: a */
    public final String f3936a;

    /* JADX INFO: renamed from: b */
    public final String f3937b;

    /* JADX INFO: renamed from: c */
    public final C1183v f3938c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1176t0(String str, String str2, C1183v c1183v) {
        str.getClass();
        str2.getClass();
        this.f3936a = str;
        this.f3937b = str2;
        this.f3938c = c1183v;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static C1176t0 m3021a(C1176t0 c1176t0, String str, C1183v c1183v, int i9) {
        String str2 = c1176t0.f3936a;
        if ((i9 & 2) != 0) {
            str = c1176t0.f3937b;
        }
        if ((i9 & 4) != 0) {
            c1183v = c1176t0.f3938c;
        }
        c1176t0.getClass();
        str2.getClass();
        str.getClass();
        return new C1176t0(str2, str, c1183v);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final C1183v m3022b() {
        return this.f3938c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final String m3023c() {
        return this.f3936a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final String m3024d() {
        return this.f3937b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1176t0)) {
            return false;
        }
        C1176t0 c1176t0 = (C1176t0) obj;
        return AbstractC1416l.m3825a(this.f3936a, c1176t0.f3936a) && AbstractC1416l.m3825a(this.f3937b, c1176t0.f3937b) && this.f3938c.equals(c1176t0.f3938c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f3938c.hashCode() + AbstractC0921a.m2244g(this.f3936a.hashCode() * 31, 31, this.f3937b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sbM1027p = AbstractC0255e.m1027p("ScriptPluginAgentProfile(id=", this.f3936a, ", name=", this.f3937b, ", config=");
        sbM1027p.append(this.f3938c);
        sbM1027p.append(")");
        return sbM1027p.toString();
    }
}
