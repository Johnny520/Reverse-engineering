package p322w0;

import p266s0.C3871a;

/* JADX INFO: renamed from: w0.v */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4671v implements InterfaceC4670u {

    /* JADX INFO: renamed from: g */
    public final C3871a f15549g = new C3871a(0);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final boolean m9164e(int i9) {
        return (i9 & this.f15549g.get()) != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final void m9165f(int i9) {
        C3871a c3871a;
        int i10;
        do {
            c3871a = this.f15549g;
            i10 = c3871a.get();
            if ((i10 & i9) != 0) {
                return;
            }
        } while (!c3871a.compareAndSet(i10, i10 | i9));
    }
}
