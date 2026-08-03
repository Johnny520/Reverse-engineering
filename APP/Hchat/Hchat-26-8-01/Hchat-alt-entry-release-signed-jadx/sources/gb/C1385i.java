package gb;

import gg.AbstractC1416l;
import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: gb.i */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1385i {

    /* JADX INFO: renamed from: a */
    public final String f4601a;

    /* JADX INFO: renamed from: b */
    public final String f4602b;

    /* JADX INFO: renamed from: c */
    public final boolean f4603c;

    /* JADX INFO: renamed from: d */
    public final Long f4604d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1385i(String str, String str2, boolean z9, Long l10) {
        this.f4601a = str;
        this.f4602b = str2;
        this.f4603c = z9;
        this.f4604d = l10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1385i)) {
            return false;
        }
        C1385i c1385i = (C1385i) obj;
        return this.f4601a.equals(c1385i.f4601a) && this.f4602b.equals(c1385i.f4602b) && this.f4603c == c1385i.f4603c && AbstractC1416l.m3825a(this.f4604d, c1385i.f4604d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iM2245h = AbstractC0921a.m2245h(AbstractC0921a.m2244g(this.f4601a.hashCode() * 31, 31, this.f4602b), 31, this.f4603c);
        Long l10 = this.f4604d;
        return iM2245h + (l10 == null ? 0 : l10.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sbM1027p = AbstractC0255e.m1027p("PluginMarketInstallResult(localPluginId=", this.f4601a, ", directoryPath=", this.f4602b, ", replacedExisting=");
        sbM1027p.append(this.f4603c);
        sbM1027p.append(", downloadCount=");
        sbM1027p.append(this.f4604d);
        sbM1027p.append(")");
        return sbM1027p.toString();
    }
}
