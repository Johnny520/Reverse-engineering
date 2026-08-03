package p051db;

import gg.AbstractC1416l;

/* JADX INFO: renamed from: db.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0763a {

    /* JADX INFO: renamed from: a */
    public final int f2286a;

    /* JADX INFO: renamed from: b */
    public final String f2287b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0763a(int i9, String str) {
        str.getClass();
        this.f2286a = i9;
        this.f2287b = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static C0763a m1979a(C0763a c0763a, String str) {
        int i9 = c0763a.f2286a;
        c0763a.getClass();
        str.getClass();
        return new C0763a(i9, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0763a)) {
            return false;
        }
        C0763a c0763a = (C0763a) obj;
        return this.f2286a == c0763a.f2286a && AbstractC1416l.m3825a(this.f2287b, c0763a.f2287b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f2287b.hashCode() + (Integer.hashCode(this.f2286a) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "ScheduledTaskContentItem(type=" + this.f2286a + ", value=" + this.f2287b + ")";
    }
}
