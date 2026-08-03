package p257r7;

import okio.C3193a;
import p363y7.AbstractC5999a;

/* JADX INFO: renamed from: r7.k */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3721k extends AbstractC3712b implements Comparable {

    /* JADX INFO: renamed from: n */
    public static final C3193a f12088n = new C3193a(11);

    /* JADX INFO: renamed from: o */
    public static final C3193a f12089o = new C3193a(10);

    /* JADX INFO: renamed from: p */
    public static final C3193a f12090p = new C3193a(9);

    /* JADX INFO: renamed from: m */
    public int f12091m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: R */
    public static void m7732R(int i9) {
        if (i9 != -1 && ((-65536) & i9) != 0) {
            throw new NumberFormatException("Value out of range [0 - 0xffff]: ".concat(AbstractC5999a.m10748k(i9, 1)));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p257r7.AbstractC3712b
    /* JADX INFO: renamed from: L */
    public void mo7712L() {
        this.f12091m = mo7727P();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: N */
    public int mo7729N() {
        return this.f7657g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: O */
    public boolean mo7730O() {
        return this.f12091m == -1;
    }

    /* JADX INFO: renamed from: P */
    public abstract int mo7727P();

    /* JADX INFO: renamed from: S */
    public abstract void mo7728S(int i9);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("(");
        sb2.append(mo7729N());
        sb2.append(", ");
        if (mo7730O()) {
            sb2.append("NO_ENTRY");
        } else {
            sb2.append(this.f12091m);
        }
        sb2.append(')');
        return sb2.toString();
    }

    /* JADX INFO: renamed from: Q */
    public void mo7731Q(int i9) {
    }
}
