package p091g3;

import p018b3.C0171a;
import p080fb.AbstractC1184v0;

/* JADX INFO: renamed from: g3.g0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1310g0 {

    /* JADX INFO: renamed from: a */
    public final C1332r0 f4369a;

    /* JADX INFO: renamed from: b */
    public C0171a[] f4370b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC1310g0() {
        this(new C1332r0((C1332r0) null));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m3462a() {
        C0171a[] c0171aArr = this.f4370b;
        if (c0171aArr != null) {
            C0171a c0171aMo3501g = c0171aArr[0];
            C0171a c0171aMo3501g2 = c0171aArr[1];
            C1332r0 c1332r0 = this.f4369a;
            if (c0171aMo3501g2 == null) {
                c0171aMo3501g2 = c1332r0.f4398a.mo3501g(2);
            }
            if (c0171aMo3501g == null) {
                c0171aMo3501g = c1332r0.f4398a.mo3501g(1);
            }
            mo3455g(C0171a.m765a(c0171aMo3501g, c0171aMo3501g2));
            C0171a c0171a = this.f4370b[AbstractC1184v0.m3213w(16)];
            if (c0171a != null) {
                mo3458f(c0171a);
            }
            C0171a c0171a2 = this.f4370b[AbstractC1184v0.m3213w(32)];
            if (c0171a2 != null) {
                mo3457d(c0171a2);
            }
            C0171a c0171a3 = this.f4370b[AbstractC1184v0.m3213w(64)];
            if (c0171a3 != null) {
                mo3459h(c0171a3);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract C1332r0 mo3453b();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public void mo3461c(int i9, C0171a c0171a) {
        if (this.f4370b == null) {
            this.f4370b = new C0171a[10];
        }
        for (int i10 = 1; i10 <= 512; i10 <<= 1) {
            if ((i9 & i10) != 0) {
                this.f4370b[AbstractC1184v0.m3213w(i10)] = c0171a;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public abstract void mo3454e(C0171a c0171a);

    /* JADX INFO: renamed from: g */
    public abstract void mo3455g(C0171a c0171a);

    public AbstractC1310g0(C1332r0 c1332r0) {
        this.f4369a = c1332r0;
    }

    /* JADX INFO: renamed from: d */
    public void mo3457d(C0171a c0171a) {
    }

    /* JADX INFO: renamed from: f */
    public void mo3458f(C0171a c0171a) {
    }

    /* JADX INFO: renamed from: h */
    public void mo3459h(C0171a c0171a) {
    }
}
