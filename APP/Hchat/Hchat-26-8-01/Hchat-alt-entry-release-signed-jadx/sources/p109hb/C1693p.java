package p109hb;

import gg.AbstractC1416l;

/* JADX INFO: renamed from: hb.p */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1693p {

    /* JADX INFO: renamed from: a */
    public final int f5624a;

    /* JADX INFO: renamed from: b */
    public final String f5625b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1693p(int i9, String str) {
        str.getClass();
        this.f5624a = i9;
        this.f5625b = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1693p)) {
            return false;
        }
        C1693p c1693p = (C1693p) obj;
        return this.f5624a == c1693p.f5624a && AbstractC1416l.m3825a(this.f5625b, c1693p.f5625b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f5625b.hashCode() + (Integer.hashCode(this.f5624a) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "DirectSendPlan(type=" + this.f5624a + ", source=" + this.f5625b + ")";
    }
}
