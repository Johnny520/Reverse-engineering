package p080fb;

import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: fb.r0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1168r0 {

    /* JADX INFO: renamed from: a */
    public final String f3897a;

    /* JADX INFO: renamed from: b */
    public final String f3898b;

    /* JADX INFO: renamed from: c */
    public final boolean f3899c;

    /* JADX INFO: renamed from: d */
    public final String f3900d;

    /* JADX INFO: renamed from: e */
    public final String f3901e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1168r0(String str, String str2, String str3, String str4, boolean z9) {
        this.f3897a = str;
        this.f3898b = str2;
        this.f3899c = z9;
        this.f3900d = str3;
        this.f3901e = str4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static C1168r0 m2981a(C1168r0 c1168r0, String str, String str2, boolean z9, String str3, String str4, int i9) {
        if ((i9 & 1) != 0) {
            str = c1168r0.f3897a;
        }
        String str5 = str;
        if ((i9 & 2) != 0) {
            str2 = c1168r0.f3898b;
        }
        String str6 = str2;
        if ((i9 & 4) != 0) {
            z9 = c1168r0.f3899c;
        }
        boolean z10 = z9;
        if ((i9 & 8) != 0) {
            str3 = c1168r0.f3900d;
        }
        String str7 = str3;
        if ((i9 & 16) != 0) {
            str4 = c1168r0.f3901e;
        }
        String str8 = str4;
        str7.getClass();
        str8.getClass();
        return new C1168r0(str5, str6, str7, str8, z10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final boolean m2982b() {
        return this.f3899c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final String m2983c() {
        return this.f3900d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1168r0)) {
            return false;
        }
        C1168r0 c1168r0 = (C1168r0) obj;
        return this.f3897a.equals(c1168r0.f3897a) && this.f3898b.equals(c1168r0.f3898b) && this.f3899c == c1168r0.f3899c && this.f3900d.equals(c1168r0.f3900d) && this.f3901e.equals(c1168r0.f3901e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f3901e.hashCode() + AbstractC0921a.m2244g(AbstractC0921a.m2245h(AbstractC0921a.m2244g(this.f3897a.hashCode() * 31, 31, this.f3898b), 31, this.f3899c), 31, this.f3900d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sbM1027p = AbstractC0255e.m1027p("ScriptPluginAgentMcpServer(id=", this.f3897a, ", name=", this.f3898b, ", enabled=");
        sbM1027p.append(this.f3899c);
        sbM1027p.append(", endpoint=");
        sbM1027p.append(this.f3900d);
        sbM1027p.append(", authorization=");
        return AbstractC0921a.m2255r(sbM1027p, this.f3901e, ")");
    }
}
