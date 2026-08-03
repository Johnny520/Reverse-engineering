package p193n5;

import p000a.AbstractC0000a;
import p068eh.AbstractC0921a;
import p150k5.C2270u;
import p312v5.C4478a;

/* JADX INFO: renamed from: n5.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2899f extends AbstractC0000a implements CharSequence, Comparable {

    /* JADX INFO: renamed from: j */
    public final C2270u f9364j;

    /* JADX INFO: renamed from: k */
    public final int f9365k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2899f(C2270u c2270u, int i9) {
        this.f9364j = c2270u;
        this.f9365k = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000a.AbstractC0000a, p312v5.InterfaceC4479b
    /* JADX INFO: renamed from: a */
    public final void mo105a() throws C4478a {
        int i9 = this.f9365k;
        if (i9 < 0 || i9 >= this.f9364j.f7548r.f7530h.f7534d) {
            throw new C4478a(AbstractC0921a.m2249l(i9, "string@"));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.CharSequence
    public final char charAt(int i9) {
        return m6305e1().charAt(i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return m6305e1().compareTo(((CharSequence) obj).toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e1 */
    public final String m6305e1() {
        return this.f9364j.f7548r.m5521b(this.f9365k);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C2899f)) {
            return false;
        }
        return m6305e1().equals(((C2899f) obj).m6305e1());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return m6305e1().hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.CharSequence
    public final int length() {
        return m6305e1().length();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i9, int i10) {
        return m6305e1().subSequence(i9, i10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.CharSequence
    public final String toString() {
        return m6305e1();
    }
}
