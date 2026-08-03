package p332wb;

import gg.AbstractC1416l;

/* JADX INFO: renamed from: wb.p2 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5195p2 extends AbstractC5261r2 {

    /* JADX INFO: renamed from: a */
    public final String f19924a;

    /* JADX INFO: renamed from: b */
    public final C4804d4 f19925b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5195p2(String str, C4804d4 c4804d4) {
        str.getClass();
        this.f19924a = str;
        this.f19925b = c4804d4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5195p2)) {
            return false;
        }
        C5195p2 c5195p2 = (C5195p2) obj;
        return AbstractC1416l.m3825a(this.f19924a, c5195p2.f19924a) && this.f19925b.equals(c5195p2.f19925b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f19925b.hashCode() + (this.f19924a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "GroupMemberPicker(talker=" + this.f19924a + ", request=" + this.f19925b + ")";
    }
}
