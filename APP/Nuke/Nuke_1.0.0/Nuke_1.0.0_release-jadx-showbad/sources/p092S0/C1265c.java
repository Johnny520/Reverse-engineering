package p092S0;

import p011B4.AbstractC0231b;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: S0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1265c {

    /* JADX INFO: renamed from: a */
    public final Object f4551a;

    /* JADX INFO: renamed from: b */
    public final int f4552b;

    /* JADX INFO: renamed from: c */
    public final int f4553c;

    /* JADX INFO: renamed from: d */
    public final String f4554d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1265c(Object obj, int i5, int i6, String str) {
        this.f4551a = obj;
        this.f4552b = i5;
        this.f4553c = i6;
        this.f4554d = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1265c)) {
            return false;
        }
        C1265c c1265c = (C1265c) obj;
        return AbstractC1665j.m2981a(this.f4551a, c1265c.f4551a) && this.f4552b == c1265c.f4552b && this.f4553c == c1265c.f4553c && AbstractC1665j.m2981a(this.f4554d, c1265c.f4554d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        Object obj = this.f4551a;
        return this.f4554d.hashCode() + AbstractC0231b.m391b(this.f4553c, AbstractC0231b.m391b(this.f4552b, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("MutableRange(item=");
        sb.append(this.f4551a);
        sb.append(", start=");
        sb.append(this.f4552b);
        sb.append(", end=");
        sb.append(this.f4553c);
        sb.append(", tag=");
        return AbstractC0231b.m402m(sb, this.f4554d, ')');
    }
}
