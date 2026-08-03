package p257r7;

import p152k7.AbstractC2331a;
import p363y7.AbstractC5999a;

/* JADX INFO: renamed from: r7.j */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3720j extends AbstractC3721k {

    /* JADX INFO: renamed from: q */
    public int f12087q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p257r7.AbstractC3721k, p257r7.AbstractC3712b
    /* JADX INFO: renamed from: L */
    public final void mo7712L() {
        super.mo7712L();
        this.f12087q = AbstractC2331a.m5542x(this.f12076k, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p257r7.AbstractC3721k
    /* JADX INFO: renamed from: N */
    public final int mo7729N() {
        return this.f12087q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p257r7.AbstractC3721k
    /* JADX INFO: renamed from: O */
    public final boolean mo7730O() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p257r7.AbstractC3721k
    /* JADX INFO: renamed from: P */
    public final int mo7727P() {
        return AbstractC2331a.m5542x(this.f12076k, 2) * 4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p257r7.AbstractC3721k
    /* JADX INFO: renamed from: Q */
    public final void mo7731Q(int i9) {
        if (i9 != this.f12087q) {
            AbstractC3721k.m7732R(i9);
            this.f12087q = i9;
            AbstractC2331a.m5535E(this.f12076k, 0, i9);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p257r7.AbstractC3721k
    /* JADX INFO: renamed from: S */
    public final void mo7728S(int i9) {
        int i10 = i9 / 4;
        AbstractC3721k.m7732R(i10);
        AbstractC2331a.m5535E(this.f12076k, 2, i10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        AbstractC3721k abstractC3721k = (AbstractC3721k) obj;
        if (abstractC3721k == this) {
            return 0;
        }
        return AbstractC5999a.m10739b(this.f12091m, abstractC3721k.f12091m);
    }
}
