package p209o7;

import p152k7.AbstractC2331a;
import p152k7.AbstractC2333c;

/* JADX INFO: renamed from: o7.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3071e extends AbstractC2333c {

    /* JADX INFO: renamed from: l */
    public static final AbstractC2331a[] f9932l = new AbstractC2331a[0];

    /* JADX INFO: renamed from: k */
    public final AbstractC2331a[] f9933k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC3071e(int i9) {
        this.f9933k = i9 == 0 ? f9932l : new AbstractC2331a[i9];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p152k7.AbstractC2333c
    /* JADX INFO: renamed from: L */
    public final AbstractC2331a[] mo5559L() {
        return this.f9933k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: P */
    public final void m6540P(int i9, AbstractC2331a abstractC2331a) {
        this.f9933k[i9] = abstractC2331a;
        abstractC2331a.m5546H(i9);
        abstractC2331a.m5548J(this);
    }

    @Override // p152k7.AbstractC2333c
    /* JADX INFO: renamed from: N */
    public void mo1891N() {
    }
}
