package p332wb;

import p036c9.C0414a;
import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: wb.g2 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4900g2 {

    /* JADX INFO: renamed from: a */
    public final C0414a f17324a;

    /* JADX INFO: renamed from: b */
    public final int f17325b;

    /* JADX INFO: renamed from: c */
    public final String f17326c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4900g2(C0414a c0414a, int i9, String str) {
        this.f17324a = c0414a;
        this.f17325b = i9;
        this.f17326c = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4900g2)) {
            return false;
        }
        C4900g2 c4900g2 = (C4900g2) obj;
        return this.f17324a.equals(c4900g2.f17324a) && this.f17325b == c4900g2.f17325b && this.f17326c.equals(c4900g2.f17326c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f17326c.hashCode() + AbstractC0921a.m2242e(this.f17325b, this.f17324a.hashCode() * 31, 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FlattenedConversationGroup(group=");
        sb2.append(this.f17324a);
        sb2.append(", depth=");
        sb2.append(this.f17325b);
        sb2.append(", path=");
        return AbstractC0921a.m2255r(sb2, this.f17326c, ")");
    }
}
