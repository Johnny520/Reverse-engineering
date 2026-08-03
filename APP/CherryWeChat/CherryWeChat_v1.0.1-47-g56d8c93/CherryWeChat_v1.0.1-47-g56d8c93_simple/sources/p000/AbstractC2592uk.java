package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: uk */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2592uk extends C2454rb {

    /* JADX INFO: renamed from: q0 */
    public C2454rb[] f8965q0;

    /* JADX INFO: renamed from: r0 */
    public int f8966r0;

    public AbstractC2592uk() {
        this.f8965q0 = new C2454rb[4];
        this.f8966r0 = 0;
    }

    /* JADX INFO: renamed from: R */
    public final void m5100R(int r6, C1405fF r7, ArrayList r8) {
        int r0 = 0;
        int r1 = 0;
    L4:
        if (r1 >= this.f8966r0) goto L11;
        C2454rb r2 = this.f8965q0[r1];
        ArrayList r3 = r7.f4978a;
        if (r3.contains(r2) == true) goto L9;
        r3.add(r2);
    L9:
        r1 = r1 + 1;
    L11:
        if (r0 >= this.f8966r0) goto L13;
        AbstractC0148Dc.m275i(this.f8965q0[r0], r6, r8, r7);
        r0 = r0 + 1;
        goto L11
    }

    /* JADX INFO: renamed from: S */
    public void mo809S() {
    }
}
