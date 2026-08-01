package p254v4;

import p011B4.AbstractC0231b;
import p042H1.AbstractC0636d;

/* JADX INFO: renamed from: v4.p */
/* JADX INFO: loaded from: classes.dex */
public final class C3369p {

    /* JADX INFO: renamed from: a */
    public final C3365l f10466a;

    /* JADX INFO: renamed from: b */
    public final int f10467b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3369p(C3365l c3365l, int i5) {
        AbstractC0231b.m409t("usingType", i5);
        this.f10466a = c3365l;
        this.f10467b = i5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3369p)) {
            return false;
        }
        C3369p c3369p = (C3369p) obj;
        return this.f10466a.equals(c3369p.f10466a) && this.f10467b == c3369p.f10467b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return AbstractC0636d.m1088a(this.f10467b) + (this.f10466a.f10452g.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("UsingFieldData(field=");
        sb.append(this.f10466a);
        sb.append(", usingType=");
        int i5 = this.f10467b;
        sb.append(i5 != 1 ? i5 != 2 ? "null" : "Write" : "Read");
        sb.append(")");
        return sb.toString();
    }
}
