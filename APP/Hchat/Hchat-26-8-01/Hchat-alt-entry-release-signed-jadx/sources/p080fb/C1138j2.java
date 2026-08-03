package p080fb;

import gg.AbstractC1416l;
import java.util.LinkedHashMap;
import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;
import p332wb.AbstractC4855en;

/* JADX INFO: renamed from: fb.j2 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1138j2 {

    /* JADX INFO: renamed from: a */
    public final String f3743a;

    /* JADX INFO: renamed from: b */
    public final String f3744b;

    /* JADX INFO: renamed from: c */
    public final boolean f3745c;

    /* JADX INFO: renamed from: d */
    public final String f3746d;

    /* JADX INFO: renamed from: e */
    public final String f3747e;

    /* JADX INFO: renamed from: f */
    public final LinkedHashMap f3748f;

    /* JADX INFO: renamed from: g */
    public final String f3749g;

    /* JADX INFO: renamed from: h */
    public final int f3750h;

    /* JADX INFO: renamed from: i */
    public final int f3751i;

    /* JADX INFO: renamed from: j */
    public final int f3752j;

    /* JADX INFO: renamed from: k */
    public final boolean f3753k;

    /* JADX INFO: renamed from: l */
    public final long f3754l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1138j2(String str, String str2, boolean z9, String str3, String str4, LinkedHashMap linkedHashMap, String str5, int i9, int i10, int i11, boolean z10, long j3) {
        str5.getClass();
        this.f3743a = str;
        this.f3744b = str2;
        this.f3745c = z9;
        this.f3746d = str3;
        this.f3747e = str4;
        this.f3748f = linkedHashMap;
        this.f3749g = str5;
        this.f3750h = i9;
        this.f3751i = i10;
        this.f3752j = i11;
        this.f3753k = z10;
        this.f3754l = j3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final long m2896a() {
        return this.f3754l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1138j2)) {
            return false;
        }
        C1138j2 c1138j2 = (C1138j2) obj;
        return this.f3743a.equals(c1138j2.f3743a) && this.f3744b.equals(c1138j2.f3744b) && this.f3745c == c1138j2.f3745c && this.f3746d.equals(c1138j2.f3746d) && this.f3747e.equals(c1138j2.f3747e) && this.f3748f.equals(c1138j2.f3748f) && AbstractC1416l.m3825a(this.f3749g, c1138j2.f3749g) && this.f3750h == c1138j2.f3750h && this.f3751i == c1138j2.f3751i && this.f3752j == c1138j2.f3752j && this.f3753k == c1138j2.f3753k && this.f3754l == c1138j2.f3754l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Long.hashCode(this.f3754l) + AbstractC0921a.m2245h(AbstractC0921a.m2242e(this.f3752j, AbstractC0921a.m2242e(this.f3751i, AbstractC0921a.m2242e(this.f3750h, AbstractC0921a.m2244g((this.f3748f.hashCode() + AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2245h(AbstractC0921a.m2244g(this.f3743a.hashCode() * 31, 31, this.f3744b), 31, this.f3745c), 31, this.f3746d), 31, this.f3747e)) * 31, 31, this.f3749g), 31), 31), 31), 31, this.f3753k);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sbM1027p = AbstractC0255e.m1027p("ScriptPluginAgentWorkspaceCheckpoint(stagingPath=", this.f3743a, ", pluginId=", this.f3744b, ", existed=");
        sbM1027p.append(this.f3745c);
        sbM1027p.append(", baseFingerprint=");
        sbM1027p.append(this.f3746d);
        sbM1027p.append(", stageFingerprint=");
        sbM1027p.append(this.f3747e);
        sbM1027p.append(", basePathStates=");
        sbM1027p.append(this.f3748f);
        sbM1027p.append(", initialPluginName=");
        sbM1027p.append(this.f3749g);
        sbM1027p.append(", revision=");
        sbM1027p.append(this.f3750h);
        sbM1027p.append(", checkedRevision=");
        AbstractC4855en.m9272p(sbM1027p, this.f3751i, ", shownRevision=", this.f3752j, ", deletePlugin=");
        sbM1027p.append(this.f3753k);
        sbM1027p.append(", updatedAt=");
        sbM1027p.append(this.f3754l);
        sbM1027p.append(")");
        return sbM1027p.toString();
    }
}
