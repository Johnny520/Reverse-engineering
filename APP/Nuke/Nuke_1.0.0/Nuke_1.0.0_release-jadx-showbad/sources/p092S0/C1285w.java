package p092S0;

import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: S0.w */
/* JADX INFO: loaded from: classes.dex */
public final class C1285w {

    /* JADX INFO: renamed from: a */
    public final C1284v f4618a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1285w(C1284v c1284v) {
        this.f4618a = c1284v;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1285w) {
            return AbstractC1665j.m2981a(this.f4618a, ((C1285w) obj).f4618a);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        C1284v c1284v = this.f4618a;
        if (c1284v != null) {
            return c1284v.hashCode();
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "PlatformTextStyle(spanStyle=null, paragraphSyle=" + this.f4618a + ')';
    }

    public C1285w() {
        this(new C1284v());
    }
}
