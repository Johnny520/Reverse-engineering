package p115hh;

import p281t3.AbstractC4106c;

/* JADX INFO: renamed from: hh.q */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1732q {

    /* JADX INFO: renamed from: a */
    public final C1727l f5760a;

    /* JADX INFO: renamed from: b */
    public final int f5761b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1732q(C1727l c1727l, int i9) {
        if (i9 == 0) {
            throw null;
        }
        this.f5760a = c1727l;
        this.f5761b = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1732q)) {
            return false;
        }
        C1732q c1732q = (C1732q) obj;
        return this.f5760a.equals(c1732q.f5760a) && this.f5761b == c1732q.f5761b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return AbstractC4106c.m8279b(this.f5761b) + (this.f5760a.f5741j.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UsingFieldData(field=");
        sb2.append(this.f5760a);
        sb2.append(", usingType=");
        int i9 = this.f5761b;
        sb2.append(i9 != 1 ? i9 != 2 ? "null" : "Write" : "Read");
        sb2.append(")");
        return sb2.toString();
    }
}
