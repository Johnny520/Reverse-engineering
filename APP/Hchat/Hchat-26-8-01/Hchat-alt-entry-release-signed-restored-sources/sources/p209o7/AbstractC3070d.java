package p209o7;

import p152k7.AbstractC2331a;
import p152k7.AbstractC2333c;

/* JADX INFO: renamed from: o7.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3070d extends AbstractC2333c {

    /* JADX INFO: renamed from: k */
    public AbstractC2331a[] f9930k;

    /* JADX INFO: renamed from: l */
    public int f9931l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC3070d(int i9) {
        this.f9930k = new AbstractC2331a[i9];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p152k7.AbstractC2333c
    /* JADX INFO: renamed from: L */
    public final AbstractC2331a[] mo5559L() {
        return this.f9930k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: P */
    public final void m6539P(AbstractC2331a abstractC2331a) {
        if (abstractC2331a == null) {
            return;
        }
        int i9 = this.f9931l;
        int i10 = i9 + 1;
        AbstractC2331a[] abstractC2331aArr = this.f9930k;
        if (i10 > abstractC2331aArr.length) {
            this.f9930k = new AbstractC2331a[i10];
            for (int i11 = 0; i11 < abstractC2331aArr.length; i11++) {
                this.f9930k[i11] = abstractC2331aArr[i11];
            }
        }
        this.f9930k[i9] = abstractC2331a;
        abstractC2331a.m5546H(i9);
        abstractC2331a.m5548J(this);
        this.f9931l++;
    }

    @Override // p152k7.AbstractC2333c
    /* JADX INFO: renamed from: N */
    public void mo1891N() {
    }
}
