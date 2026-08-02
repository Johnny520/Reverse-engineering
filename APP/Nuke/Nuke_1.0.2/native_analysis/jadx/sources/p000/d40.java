package p000;

import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class d40 implements a51 {

    /* JADX INFO: renamed from: b */
    public final a51 f1859b;

    /* JADX INFO: renamed from: c */
    public final a51 f1860c;

    public d40(a51 a51Var, a51 a51Var2) {
        this.f1859b = a51Var;
        this.f1860c = a51Var2;
    }

    @Override // p000.a51
    /* JADX INFO: renamed from: b */
    public final void mo96b(MessageDigest messageDigest) {
        this.f1859b.mo96b(messageDigest);
        this.f1860c.mo96b(messageDigest);
    }

    @Override // p000.a51
    public final boolean equals(Object obj) {
        if (obj instanceof d40) {
            d40 d40Var = (d40) obj;
            if (this.f1859b.equals(d40Var.f1859b) && this.f1860c.equals(d40Var.f1860c)) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.a51
    public final int hashCode() {
        return this.f1860c.hashCode() + (this.f1859b.hashCode() * 31);
    }

    public final String toString() {
        return "DataCacheKey{sourceKey=" + this.f1859b + ", signature=" + this.f1860c + '}';
    }
}
