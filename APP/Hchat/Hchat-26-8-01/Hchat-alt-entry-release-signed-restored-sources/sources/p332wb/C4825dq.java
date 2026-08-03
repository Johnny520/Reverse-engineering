package p332wb;

import gg.AbstractC1416l;

/* JADX INFO: renamed from: wb.dq */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4825dq {

    /* JADX INFO: renamed from: a */
    public final String f16693a;

    /* JADX INFO: renamed from: b */
    public final Object f16694b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4825dq(Object obj, String str) {
        str.getClass();
        this.f16693a = str;
        this.f16694b = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4825dq)) {
            return false;
        }
        C4825dq c4825dq = (C4825dq) obj;
        return AbstractC1416l.m3825a(this.f16693a, c4825dq.f16693a) && AbstractC1416l.m3825a(this.f16694b, c4825dq.f16694b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = this.f16693a.hashCode() * 31;
        Object obj = this.f16694b;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "PopupChoice(label=" + this.f16693a + ", value=" + this.f16694b + ")";
    }
}
