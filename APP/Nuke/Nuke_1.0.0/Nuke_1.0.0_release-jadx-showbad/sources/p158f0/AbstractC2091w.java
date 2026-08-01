package p158f0;

import p136b0.C1839a;

/* JADX INFO: renamed from: f0.w */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2091w implements InterfaceC2090v {

    /* JADX INFO: renamed from: d */
    public final C1839a f7009d = new C1839a(0);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final boolean m3869e(int i5) {
        return (i5 & this.f7009d.get()) != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final void m3870f(int i5) {
        C1839a c1839a;
        int i6;
        do {
            c1839a = this.f7009d;
            i6 = c1839a.get();
            if ((i6 & i5) != 0) {
                return;
            }
        } while (!c1839a.compareAndSet(i6, i6 | i5));
    }
}
