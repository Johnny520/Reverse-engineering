package p080fb;

import gg.AbstractC1416l;
import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;
import p136j8.AbstractC2091b;

/* JADX INFO: renamed from: fb.y */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1192y {

    /* JADX INFO: renamed from: a */
    public final String f4005a;

    /* JADX INFO: renamed from: b */
    public final String f4006b;

    /* JADX INFO: renamed from: c */
    public final String f4007c;

    /* JADX INFO: renamed from: d */
    public final String f4008d;

    /* JADX INFO: renamed from: e */
    public final String f4009e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1192y(String str, String str2, String str3, String str4, String str5) {
        AbstractC2091b.m5170q(str, str2, str3, str4, str5);
        this.f4005a = str;
        this.f4006b = str2;
        this.f4007c = str3;
        this.f4008d = str4;
        this.f4009e = str5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static C1192y m3242a(C1192y c1192y, String str) {
        String str2 = c1192y.f4005a;
        String str3 = c1192y.f4007c;
        String str4 = c1192y.f4008d;
        String str5 = c1192y.f4009e;
        c1192y.getClass();
        str2.getClass();
        str.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        return new C1192y(str2, str, str3, str4, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1192y)) {
            return false;
        }
        C1192y c1192y = (C1192y) obj;
        return AbstractC1416l.m3825a(this.f4005a, c1192y.f4005a) && AbstractC1416l.m3825a(this.f4006b, c1192y.f4006b) && AbstractC1416l.m3825a(this.f4007c, c1192y.f4007c) && AbstractC1416l.m3825a(this.f4008d, c1192y.f4008d) && AbstractC1416l.m3825a(this.f4009e, c1192y.f4009e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f4009e.hashCode() + AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2244g(this.f4005a.hashCode() * 31, 31, this.f4006b), 31, this.f4007c), 31, this.f4008d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sbM1027p = AbstractC0255e.m1027p("ScriptPluginAgentDraft(pluginName=", this.f4005a, ", pluginId=", this.f4006b, ", infoProp=");
        AbstractC2091b.m5173t(sbM1027p, this.f4007c, ", mainJava=", this.f4008d, ", summary=");
        return AbstractC0921a.m2255r(sbM1027p, this.f4009e, ")");
    }
}
