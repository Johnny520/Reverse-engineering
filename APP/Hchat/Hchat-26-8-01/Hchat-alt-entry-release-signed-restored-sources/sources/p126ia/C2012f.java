package p126ia;

import gg.AbstractC1416l;

/* JADX INFO: renamed from: ia.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2012f {

    /* JADX INFO: renamed from: a */
    public final int f6787a;

    /* JADX INFO: renamed from: b */
    public final String f6788b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2012f(int i9, String str) {
        str.getClass();
        this.f6787a = i9;
        this.f6788b = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2012f)) {
            return false;
        }
        C2012f c2012f = (C2012f) obj;
        return this.f6787a == c2012f.f6787a && AbstractC1416l.m3825a(this.f6788b, c2012f.f6788b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f6788b.hashCode() + (Integer.hashCode(this.f6787a) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "CommentKey(commentId=" + this.f6787a + ", username=" + this.f6788b + ")";
    }
}
