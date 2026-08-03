package p080fb;

import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;
import p136j8.AbstractC2091b;

/* JADX INFO: renamed from: fb.k2 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1142k2 {

    /* JADX INFO: renamed from: a */
    public final String f3763a;

    /* JADX INFO: renamed from: b */
    public final String f3764b;

    /* JADX INFO: renamed from: c */
    public final String f3765c;

    /* JADX INFO: renamed from: d */
    public final String f3766d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1142k2(String str, String str2, String str3, String str4) {
        this.f3763a = str;
        this.f3764b = str2;
        this.f3765c = str3;
        this.f3766d = str4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final String m2897a() {
        return this.f3763a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1142k2)) {
            return false;
        }
        C1142k2 c1142k2 = (C1142k2) obj;
        return this.f3763a.equals(c1142k2.f3763a) && this.f3764b.equals(c1142k2.f3764b) && this.f3765c.equals(c1142k2.f3765c) && this.f3766d.equals(c1142k2.f3766d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f3766d.hashCode() + AbstractC0921a.m2244g(AbstractC0921a.m2244g(this.f3763a.hashCode() * 31, 31, this.f3764b), 31, this.f3765c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return AbstractC2091b.m5164k(AbstractC0255e.m1027p("ScriptPluginAgentWorkspaceToolConfirmation(eventId=", this.f3763a, ", toolName=", this.f3764b, ", pluginId="), this.f3765c, ", diff=", this.f3766d, ")");
    }
}
