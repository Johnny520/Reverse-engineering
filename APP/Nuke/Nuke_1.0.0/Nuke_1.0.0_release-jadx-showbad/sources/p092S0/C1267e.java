package p092S0;

import p011B4.AbstractC0231b;
import p117X2.AbstractC1665j;
import p120Y0.AbstractC1732a;

/* JADX INFO: renamed from: S0.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1267e {

    /* JADX INFO: renamed from: a */
    public final Object f4557a;

    /* JADX INFO: renamed from: b */
    public final int f4558b;

    /* JADX INFO: renamed from: c */
    public final int f4559c;

    /* JADX INFO: renamed from: d */
    public final String f4560d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1267e(Object obj, int i5, int i6, String str) {
        this.f4557a = obj;
        this.f4558b = i5;
        this.f4559c = i6;
        this.f4560d = str;
        if (i5 <= i6) {
            return;
        }
        AbstractC1732a.m3085a("Reversed range is not supported");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1267e)) {
            return false;
        }
        C1267e c1267e = (C1267e) obj;
        return AbstractC1665j.m2981a(this.f4557a, c1267e.f4557a) && this.f4558b == c1267e.f4558b && this.f4559c == c1267e.f4559c && AbstractC1665j.m2981a(this.f4560d, c1267e.f4560d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        Object obj = this.f4557a;
        return this.f4560d.hashCode() + AbstractC0231b.m391b(this.f4559c, AbstractC0231b.m391b(this.f4558b, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("Range(item=");
        sb.append(this.f4557a);
        sb.append(", start=");
        sb.append(this.f4558b);
        sb.append(", end=");
        sb.append(this.f4559c);
        sb.append(", tag=");
        return AbstractC0231b.m402m(sb, this.f4560d, ')');
    }

    public C1267e(int i5, int i6, Object obj) {
        this(obj, i5, i6, "");
    }
}
