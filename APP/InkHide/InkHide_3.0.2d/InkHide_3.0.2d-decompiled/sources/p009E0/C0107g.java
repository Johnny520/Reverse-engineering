package p009E0;

import java.io.Serializable;

/* JADX INFO: renamed from: E0.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0107g implements Serializable {

    /* JADX INFO: renamed from: a */
    public final Object f400a;

    /* JADX INFO: renamed from: b */
    public final String f401b;

    /* JADX INFO: renamed from: c */
    public final String f402c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0107g(String str, String str2, Object obj) {
        this.f400a = obj;
        this.f401b = str;
        this.f402c = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0107g)) {
            return false;
        }
        C0107g c0107g = (C0107g) obj;
        return this.f400a.equals(c0107g.f400a) && this.f401b.equals(c0107g.f401b) && this.f402c.equals(c0107g.f402c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f402c.hashCode() + ((this.f401b.hashCode() + (this.f400a.hashCode() * 31)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "(" + this.f400a + ", " + ((Object) this.f401b) + ", " + ((Object) this.f402c) + ')';
    }
}
