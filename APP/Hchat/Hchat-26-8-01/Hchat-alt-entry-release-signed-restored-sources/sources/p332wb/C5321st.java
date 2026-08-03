package p332wb;

import gg.AbstractC1416l;
import p068eh.AbstractC0921a;
import p080fb.C1134i2;
import p222p.AbstractC3199a;

/* JADX INFO: renamed from: wb.st */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5321st {

    /* JADX INFO: renamed from: a */
    public final int f20718a;

    /* JADX INFO: renamed from: b */
    public final C1134i2 f20719b;

    /* JADX INFO: renamed from: c */
    public final boolean f20720c;

    /* JADX INFO: renamed from: d */
    public final boolean f20721d;

    /* JADX INFO: renamed from: e */
    public final boolean f20722e;

    /* JADX INFO: renamed from: f */
    public final String f20723f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5321st(int i9, C1134i2 c1134i2, boolean z9, boolean z10, boolean z11, String str) {
        c1134i2.getClass();
        this.f20718a = i9;
        this.f20719b = c1134i2;
        this.f20720c = z9;
        this.f20721d = z10;
        this.f20722e = z11;
        this.f20723f = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final boolean m9742a() {
        return this.f20721d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final boolean m9743b() {
        return this.f20722e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final boolean m9744c() {
        return this.f20720c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5321st)) {
            return false;
        }
        C5321st c5321st = (C5321st) obj;
        return this.f20718a == c5321st.f20718a && AbstractC1416l.m3825a(this.f20719b, c5321st.f20719b) && this.f20720c == c5321st.f20720c && this.f20721d == c5321st.f20721d && this.f20722e == c5321st.f20722e && this.f20723f.equals(c5321st.f20723f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f20723f.hashCode() + AbstractC0921a.m2245h(AbstractC0921a.m2245h(AbstractC0921a.m2245h((this.f20719b.hashCode() + (Integer.hashCode(this.f20718a) * 31)) * 31, 31, this.f20720c), 31, this.f20721d), 31, this.f20722e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ScriptPluginAgentPendingWorkspaceChange(messageIndex=");
        sb2.append(this.f20718a);
        sb2.append(", change=");
        sb2.append(this.f20719b);
        sb2.append(", isNewPlugin=");
        AbstractC3199a.m6851x(sb2, this.f20720c, ", hasDeletedPaths=", this.f20721d, ", risky=");
        sb2.append(this.f20722e);
        sb2.append(", applyError=");
        sb2.append(this.f20723f);
        sb2.append(")");
        return sb2.toString();
    }
}
