package p295u4;

import bsh.C0353j;
import p136j8.C2104o;
import p376z4.AbstractC6096j;

/* JADX INFO: renamed from: u4.q */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4267q extends AbstractC6096j {

    /* JADX INFO: renamed from: h */
    public final C4265o[] f13969h;

    /* JADX INFO: renamed from: i */
    public int f13970i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        new C4267q(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4267q(int i9) {
        super(i9 != 0);
        this.f13969h = new C4265o[i9];
        this.f13970i = 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof C4267q) {
            C4267q c4267q = (C4267q) obj;
            C4265o[] c4265oArr = c4267q.f13969h;
            C4265o[] c4265oArr2 = this.f13969h;
            int length = c4265oArr2.length;
            if (length == c4265oArr.length && size() == c4267q.size()) {
                for (int i9 = 0; i9 < length; i9++) {
                    C4265o c4265o = c4265oArr2[i9];
                    Object obj2 = c4265oArr[i9];
                    if (c4265o == obj2 || (c4265o != null && c4265o.equals(obj2))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        C4265o[] c4265oArr = this.f13969h;
        int length = c4265oArr.length;
        int iHashCode = 0;
        for (int i9 = 0; i9 < length; i9++) {
            C4265o c4265o = c4265oArr[i9];
            iHashCode = (iHashCode * 31) + (c4265o == null ? 0 : c4265o.hashCode());
        }
        return iHashCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public final C4265o m8572l(int i9) {
        try {
            return this.f13969h[i9];
        } catch (ArrayIndexOutOfBoundsException unused) {
            C2104o.m5294t("bogus reg");
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public final void m8573m(C4265o c4265o) {
        int i9;
        C4265o c4265o2;
        C4265o[] c4265oArr = this.f13969h;
        m10855j();
        if (c4265o == null) {
            C0353j.m1305c("spec == null");
            return;
        }
        this.f13970i = -1;
        try {
            int i10 = c4265o.f13965g;
            c4265oArr[i10] = c4265o;
            if (i10 > 0 && (c4265o2 = c4265oArr[i10 - 1]) != null && c4265o2.m8561j() == 2) {
                c4265oArr[i9] = null;
            }
            if (c4265o.m8561j() == 2) {
                c4265oArr[i10 + 1] = null;
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            C2104o.m5294t("spec.getReg() out of range");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public final void m8574n(C4265o c4265o) {
        try {
            this.f13969h[c4265o.f13965g] = null;
            this.f13970i = -1;
        } catch (ArrayIndexOutOfBoundsException unused) {
            C2104o.m5294t("bogus reg");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int size() {
        int i9 = this.f13970i;
        if (i9 >= 0) {
            return i9;
        }
        int i10 = 0;
        for (C4265o c4265o : this.f13969h) {
            if (c4265o != null) {
                i10++;
            }
        }
        this.f13970i = i10;
        return i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        C4265o[] c4265oArr = this.f13969h;
        StringBuilder sb2 = new StringBuilder(c4265oArr.length * 25);
        sb2.append('{');
        boolean z9 = false;
        for (C4265o c4265o : c4265oArr) {
            if (c4265o != null) {
                if (z9) {
                    sb2.append(", ");
                } else {
                    z9 = true;
                }
                sb2.append(c4265o);
            }
        }
        sb2.append('}');
        return sb2.toString();
    }
}
