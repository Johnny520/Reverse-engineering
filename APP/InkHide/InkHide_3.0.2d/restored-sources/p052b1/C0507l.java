package p052b1;

import androidx.fragment.app.AbstractC0421L;
import p022L.AbstractC0174d;

/* JADX INFO: renamed from: b1.l */
/* JADX INFO: loaded from: classes.dex */
public final class C0507l {

    /* JADX INFO: renamed from: a */
    public final C0501f f1615a;

    /* JADX INFO: renamed from: b */
    public final int f1616b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0507l(C0501f c0501f, int i2) {
        AbstractC0174d.m359o(i2, "usingType");
        this.f1615a = c0501f;
        this.f1616b = i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0507l)) {
            return false;
        }
        C0507l c0507l = (C0507l) obj;
        return this.f1615a.equals(c0507l.f1615a) && this.f1616b == c0507l.f1616b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return AbstractC0421L.m816d(this.f1616b) + (this.f1615a.f1588c.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("UsingFieldData(field=");
        sb.append(this.f1615a);
        sb.append(", usingType=");
        int i2 = this.f1616b;
        sb.append(i2 != 1 ? i2 != 2 ? "null" : "Write" : "Read");
        sb.append(")");
        return sb.toString();
    }
}
