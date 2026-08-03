package gb;

import gg.AbstractC1416l;
import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: gb.m */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1389m {

    /* JADX INFO: renamed from: a */
    public final String f4611a;

    /* JADX INFO: renamed from: b */
    public final String f4612b;

    /* JADX INFO: renamed from: c */
    public final EnumC1392p f4613c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1389m(String str, String str2, EnumC1392p enumC1392p) {
        str.getClass();
        str2.getClass();
        enumC1392p.getClass();
        this.f4611a = str;
        this.f4612b = str2;
        this.f4613c = enumC1392p;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1389m)) {
            return false;
        }
        C1389m c1389m = (C1389m) obj;
        return AbstractC1416l.m3825a(this.f4611a, c1389m.f4611a) && AbstractC1416l.m3825a(this.f4612b, c1389m.f4612b) && this.f4613c == c1389m.f4613c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f4613c.hashCode() + AbstractC0921a.m2244g(this.f4611a.hashCode() * 31, 31, this.f4612b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sbM1027p = AbstractC0255e.m1027p("PluginMarketOwnership(remotePluginId=", this.f4611a, ", ownerToken=", this.f4612b, ", reviewStatus=");
        sbM1027p.append(this.f4613c);
        sbM1027p.append(")");
        return sbM1027p.toString();
    }
}
