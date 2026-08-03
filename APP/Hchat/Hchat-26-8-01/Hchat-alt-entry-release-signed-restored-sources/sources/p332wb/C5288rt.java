package p332wb;

import gg.AbstractC1416l;
import java.util.List;
import p068eh.AbstractC0921a;
import p080fb.C1101a1;
import p136j8.AbstractC2091b;

/* JADX INFO: renamed from: wb.rt */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5288rt {

    /* JADX INFO: renamed from: a */
    public final long f20535a;

    /* JADX INFO: renamed from: b */
    public final String f20536b;

    /* JADX INFO: renamed from: c */
    public final List f20537c;

    /* JADX INFO: renamed from: d */
    public final C1101a1 f20538d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5288rt(long j3, String str, List list, C1101a1 c1101a1) {
        str.getClass();
        list.getClass();
        this.f20535a = j3;
        this.f20536b = str;
        this.f20537c = list;
        this.f20538d = c1101a1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5288rt)) {
            return false;
        }
        C5288rt c5288rt = (C5288rt) obj;
        return this.f20535a == c5288rt.f20535a && AbstractC1416l.m3825a(this.f20536b, c5288rt.f20536b) && AbstractC1416l.m3825a(this.f20537c, c5288rt.f20537c) && AbstractC1416l.m3825a(this.f20538d, c5288rt.f20538d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iM5158e = AbstractC2091b.m5158e(this.f20537c, AbstractC0921a.m2244g(Long.hashCode(this.f20535a) * 31, 31, this.f20536b), 31);
        C1101a1 c1101a1 = this.f20538d;
        return iM5158e + (c1101a1 == null ? 0 : c1101a1.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "ScriptPluginAgentPendingMessage(id=" + this.f20535a + ", content=" + this.f20536b + ", attachments=" + this.f20537c + ", quotedMessage=" + this.f20538d + ")";
    }
}
