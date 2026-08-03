package p332wb;

import p068eh.AbstractC0921a;
import p080fb.C1192y;

/* JADX INFO: renamed from: wb.tt */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5354tt {

    /* JADX INFO: renamed from: a */
    public final int f20966a;

    /* JADX INFO: renamed from: b */
    public final C1192y f20967b;

    /* JADX INFO: renamed from: c */
    public final String f20968c;

    /* JADX INFO: renamed from: d */
    public final boolean f20969d;

    /* JADX INFO: renamed from: e */
    public final boolean f20970e;

    /* JADX INFO: renamed from: f */
    public final boolean f20971f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5354tt(int i9, C1192y c1192y, String str, boolean z9, boolean z10, boolean z11) {
        this.f20966a = i9;
        this.f20967b = c1192y;
        this.f20968c = str;
        this.f20969d = z9;
        this.f20970e = z10;
        this.f20971f = z11;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final boolean m9745a() {
        return this.f20970e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final C1192y m9746b() {
        return this.f20967b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final int m9747c() {
        return this.f20966a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final boolean m9748d() {
        return this.f20971f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final boolean m9749e() {
        return this.f20969d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5354tt)) {
            return false;
        }
        C5354tt c5354tt = (C5354tt) obj;
        return this.f20966a == c5354tt.f20966a && this.f20967b.equals(c5354tt.f20967b) && this.f20968c.equals(c5354tt.f20968c) && this.f20969d == c5354tt.f20969d && this.f20970e == c5354tt.f20970e && this.f20971f == c5354tt.f20971f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(this.f20971f) + AbstractC0921a.m2245h(AbstractC0921a.m2245h(AbstractC0921a.m2244g((this.f20967b.hashCode() + (Integer.hashCode(this.f20966a) * 31)) * 31, 31, this.f20968c), 31, this.f20969d), 31, this.f20970e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "ScriptPluginAgentPendingWrite(messageIndex=" + this.f20966a + ", draft=" + this.f20967b + ", diff=" + this.f20968c + ", isNewPlugin=" + this.f20969d + ", confirmsCreation=" + this.f20970e + ", risky=" + this.f20971f + ")";
    }
}
