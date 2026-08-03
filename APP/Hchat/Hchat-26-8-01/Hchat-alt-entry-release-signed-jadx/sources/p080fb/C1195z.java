package p080fb;

import gg.AbstractC1416l;
import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;
import p136j8.AbstractC2091b;

/* JADX INFO: renamed from: fb.z */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1195z {

    /* JADX INFO: renamed from: a */
    public final String f4015a;

    /* JADX INFO: renamed from: b */
    public final String f4016b;

    /* JADX INFO: renamed from: c */
    public final String f4017c;

    /* JADX INFO: renamed from: d */
    public final String f4018d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1195z(String str, String str2, String str3, String str4) {
        str2.getClass();
        this.f4015a = str;
        this.f4016b = str2;
        this.f4017c = str3;
        this.f4018d = str4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1195z)) {
            return false;
        }
        C1195z c1195z = (C1195z) obj;
        return this.f4015a.equals(c1195z.f4015a) && AbstractC1416l.m3825a(this.f4016b, c1195z.f4016b) && this.f4017c.equals(c1195z.f4017c) && this.f4018d.equals(c1195z.f4018d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f4018d.hashCode() + AbstractC0921a.m2244g(AbstractC0921a.m2244g(this.f4015a.hashCode() * 31, 31, this.f4016b), 31, this.f4017c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return AbstractC2091b.m5164k(AbstractC0255e.m1027p("ScriptPluginAgentExisting(pluginId=", this.f4015a, ", pluginName=", this.f4016b, ", infoProp="), this.f4017c, ", mainJava=", this.f4018d, ")");
    }
}
