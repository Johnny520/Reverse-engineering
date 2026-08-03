package p332wb;

import gg.AbstractC1416l;
import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: wb.qt */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5255qt {

    /* JADX INFO: renamed from: a */
    public final int f20302a;

    /* JADX INFO: renamed from: b */
    public final String f20303b;

    /* JADX INFO: renamed from: c */
    public final String f20304c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5255qt(int i9, String str, String str2) {
        str2.getClass();
        this.f20302a = i9;
        this.f20303b = str;
        this.f20304c = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final int m9738a() {
        return this.f20302a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final String m9739b() {
        return this.f20303b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5255qt)) {
            return false;
        }
        C5255qt c5255qt = (C5255qt) obj;
        return this.f20302a == c5255qt.f20302a && this.f20303b.equals(c5255qt.f20303b) && AbstractC1416l.m3825a(this.f20304c, c5255qt.f20304c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f20304c.hashCode() + AbstractC0921a.m2244g(Integer.hashCode(this.f20302a) * 31, 31, this.f20303b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ScriptPluginAgentPendingDelete(messageIndex=");
        sb2.append(this.f20302a);
        sb2.append(", pluginId=");
        sb2.append(this.f20303b);
        sb2.append(", pluginName=");
        return AbstractC0921a.m2255r(sb2, this.f20304c, ")");
    }
}
