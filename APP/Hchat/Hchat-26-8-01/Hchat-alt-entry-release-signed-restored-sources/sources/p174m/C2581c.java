package p174m;

import java.util.concurrent.CancellationException;
import p131j0.C2046b;
import p172lg.C2564d;
import p201o.AbstractC3026b;
import p249qg.InterfaceC3561f;
import p259r9.AbstractC3754e0;
import p265s.C3843m;
import p276sf.C3967n;

/* JADX INFO: renamed from: m.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2581c {

    /* JADX INFO: renamed from: a */
    public final C2046b f8371a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2581c(int i9) {
        switch (i9) {
            case 1:
                this.f8371a = new C2046b(new C3843m[16]);
                break;
            default:
                this.f8371a = new C2046b(new C2610i[16]);
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public void m6051a(CancellationException cancellationException) {
        C2046b c2046b = this.f8371a;
        int i9 = c2046b.f6893i;
        InterfaceC3561f[] interfaceC3561fArr = new InterfaceC3561f[i9];
        for (int i10 = 0; i10 < i9; i10++) {
            interfaceC3561fArr[i10] = ((C2610i) c2046b.f6891g[i10]).f8468b;
        }
        for (int i11 = 0; i11 < i9; i11++) {
            interfaceC3561fArr[i11].mo7500w(cancellationException);
        }
        if (c2046b.f6893i == 0) {
            return;
        }
        AbstractC3026b.m6430c("uncancelled requests present");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public void m6052b() {
        C2046b c2046b = this.f8371a;
        C2564d c2564dM7910r0 = AbstractC3754e0.m7910r0(0, c2046b.f6893i);
        int i9 = c2564dM7910r0.f8312g;
        int i10 = c2564dM7910r0.f8313h;
        if (i9 <= i10) {
            while (true) {
                ((C2610i) c2046b.f6891g[i9]).f8468b.resumeWith(C3967n.f12976a);
                if (i9 == i10) {
                    break;
                } else {
                    i9++;
                }
            }
        }
        c2046b.m5061g();
    }
}
