package p080fb;

import gg.AbstractC1416l;
import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;
import p136j8.AbstractC2091b;

/* JADX INFO: renamed from: fb.s0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1172s0 {

    /* JADX INFO: renamed from: a */
    public final String f3911a;

    /* JADX INFO: renamed from: b */
    public final String f3912b;

    /* JADX INFO: renamed from: c */
    public final String f3913c;

    /* JADX INFO: renamed from: d */
    public final String f3914d;

    /* JADX INFO: renamed from: e */
    public final String f3915e;

    /* JADX INFO: renamed from: f */
    public final String f3916f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1172s0(String str, String str2, String str3, String str4, String str5, String str6) {
        str6.getClass();
        this.f3911a = str;
        this.f3912b = str2;
        this.f3913c = str3;
        this.f3914d = str4;
        this.f3915e = str5;
        this.f3916f = str6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final String m2984a() {
        return this.f3911a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final String m2985b() {
        return this.f3913c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final String m2986c() {
        return this.f3914d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final String m2987d() {
        return this.f3912b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final String m2988e() {
        return this.f3916f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1172s0)) {
            return false;
        }
        C1172s0 c1172s0 = (C1172s0) obj;
        return this.f3911a.equals(c1172s0.f3911a) && this.f3912b.equals(c1172s0.f3912b) && this.f3913c.equals(c1172s0.f3913c) && this.f3914d.equals(c1172s0.f3914d) && this.f3915e.equals(c1172s0.f3915e) && AbstractC1416l.m3825a(this.f3916f, c1172s0.f3916f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f3916f.hashCode() + AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2244g(this.f3911a.hashCode() * 31, 31, this.f3912b), 31, this.f3913c), 31, this.f3914d), 31, this.f3915e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sbM1027p = AbstractC0255e.m1027p("ScriptPluginAgentNativeToolCall(id=", this.f3911a, ", protocolName=", this.f3912b, ", kind=");
        AbstractC2091b.m5173t(sbM1027p, this.f3913c, ", originalName=", this.f3914d, ", arguments=");
        return AbstractC2091b.m5164k(sbM1027p, this.f3915e, ", providerMetadata=", this.f3916f, ")");
    }
}
