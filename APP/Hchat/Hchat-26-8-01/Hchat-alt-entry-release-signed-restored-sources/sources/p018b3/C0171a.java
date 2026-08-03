package p018b3;

import android.graphics.Insets;
import p017b2.AbstractC0169a;
import p222p.AbstractC3199a;

/* JADX INFO: renamed from: b3.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0171a {

    /* JADX INFO: renamed from: e */
    public static final C0171a f444e = new C0171a(0, 0, 0, 0);

    /* JADX INFO: renamed from: a */
    public final int f445a;

    /* JADX INFO: renamed from: b */
    public final int f446b;

    /* JADX INFO: renamed from: c */
    public final int f447c;

    /* JADX INFO: renamed from: d */
    public final int f448d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0171a(int i9, int i10, int i11, int i12) {
        this.f445a = i9;
        this.f446b = i10;
        this.f447c = i11;
        this.f448d = i12;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static C0171a m765a(C0171a c0171a, C0171a c0171a2) {
        return m766b(Math.max(c0171a.f445a, c0171a2.f445a), Math.max(c0171a.f446b, c0171a2.f446b), Math.max(c0171a.f447c, c0171a2.f447c), Math.max(c0171a.f448d, c0171a2.f448d));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static C0171a m766b(int i9, int i10, int i11, int i12) {
        return (i9 == 0 && i10 == 0 && i11 == 0 && i12 == 0) ? f444e : new C0171a(i9, i10, i11, i12);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static C0171a m767c(Insets insets) {
        return m766b(insets.left, insets.top, insets.right, insets.bottom);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final Insets m768d() {
        return AbstractC0169a.m757h(this.f445a, this.f446b, this.f447c, this.f448d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0171a.class != obj.getClass()) {
            return false;
        }
        C0171a c0171a = (C0171a) obj;
        return this.f448d == c0171a.f448d && this.f445a == c0171a.f445a && this.f447c == c0171a.f447c && this.f446b == c0171a.f446b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return (((((this.f445a * 31) + this.f446b) * 31) + this.f447c) * 31) + this.f448d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Insets{left=");
        sb2.append(this.f445a);
        sb2.append(", top=");
        sb2.append(this.f446b);
        sb2.append(", right=");
        sb2.append(this.f447c);
        sb2.append(", bottom=");
        return AbstractC3199a.m6841n(sb2, this.f448d, '}');
    }
}
