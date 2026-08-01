package p113W3;

import p011B4.AbstractC0231b;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: W3.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1608a {

    /* JADX INFO: renamed from: a */
    public final boolean f5539a;

    /* JADX INFO: renamed from: b */
    public final boolean f5540b;

    /* JADX INFO: renamed from: c */
    public final String f5541c;

    /* JADX INFO: renamed from: d */
    public final String f5542d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1608a(boolean z5, boolean z6, String str, String str2) {
        this.f5539a = z5;
        this.f5540b = z6;
        this.f5541c = str;
        this.f5542d = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1608a)) {
            return false;
        }
        C1608a c1608a = (C1608a) obj;
        return this.f5539a == c1608a.f5539a && this.f5540b == c1608a.f5540b && AbstractC1665j.m2981a(this.f5541c, c1608a.f5541c) && AbstractC1665j.m2981a(this.f5542d, c1608a.f5542d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iM394e = AbstractC0231b.m394e(AbstractC0231b.m395f(Boolean.hashCode(this.f5539a) * 31, 31, this.f5540b), 31, this.f5541c);
        String str = this.f5542d;
        return iM394e + (str == null ? 0 : str.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "ProbeResult(hit=" + this.f5539a + ", available=" + this.f5540b + ", method=" + this.f5541c + ", error=" + this.f5542d + ")";
    }
}
