package p172lg;

import java.util.Iterator;
import p114hg.InterfaceC1711a;
import p136j8.C2104o;
import p219oh.AbstractC3165h;

/* JADX INFO: renamed from: lg.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class C2562b implements Iterable, InterfaceC1711a {

    /* JADX INFO: renamed from: g */
    public final int f8312g;

    /* JADX INFO: renamed from: h */
    public final int f8313h;

    /* JADX INFO: renamed from: i */
    public final int f8314i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2562b(int i9, int i10, int i11) {
        if (i11 == 0) {
            C2104o.m5294t("Step must be non-zero.");
            throw null;
        }
        if (i11 == Integer.MIN_VALUE) {
            C2104o.m5294t("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
            throw null;
        }
        this.f8312g = i9;
        this.f8313h = AbstractC3165h.m6749A(i9, i10, i11);
        this.f8314i = i11;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean equals(Object obj) {
        if (!(obj instanceof C2562b)) {
            return false;
        }
        if (isEmpty() && ((C2562b) obj).isEmpty()) {
            return true;
        }
        C2562b c2562b = (C2562b) obj;
        return this.f8312g == c2562b.f8312g && this.f8313h == c2562b.f8313h && this.f8314i == c2562b.f8314i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f8312g * 31) + this.f8313h) * 31) + this.f8314i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean isEmpty() {
        int i9 = this.f8313h;
        int i10 = this.f8314i;
        int i11 = this.f8312g;
        return i10 > 0 ? i11 > i9 : i11 < i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C2563c(this.f8312g, this.f8313h, this.f8314i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        StringBuilder sb2;
        int i9 = this.f8313h;
        int i10 = this.f8314i;
        int i11 = this.f8312g;
        if (i10 > 0) {
            sb2 = new StringBuilder();
            sb2.append(i11);
            sb2.append("..");
            sb2.append(i9);
            sb2.append(" step ");
            sb2.append(i10);
        } else {
            sb2 = new StringBuilder();
            sb2.append(i11);
            sb2.append(" downTo ");
            sb2.append(i9);
            sb2.append(" step ");
            sb2.append(-i10);
        }
        return sb2.toString();
    }
}
