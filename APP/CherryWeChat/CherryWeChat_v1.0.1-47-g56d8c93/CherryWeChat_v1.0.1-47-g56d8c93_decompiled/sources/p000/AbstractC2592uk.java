package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: uk */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2592uk extends C2454rb {

    /* JADX INFO: renamed from: q0 */
    public C2454rb[] f8965q0 = new C2454rb[4];

    /* JADX INFO: renamed from: r0 */
    public int f8966r0 = 0;

    /* JADX INFO: renamed from: R */
    public final void m5100R(int i, C1405fF c1405fF, ArrayList arrayList) {
        for (int i2 = 0; i2 < this.f8966r0; i2++) {
            C2454rb c2454rb = this.f8965q0[i2];
            ArrayList arrayList2 = c1405fF.f4978a;
            if (!arrayList2.contains(c2454rb)) {
                arrayList2.add(c2454rb);
            }
        }
        for (int i3 = 0; i3 < this.f8966r0; i3++) {
            AbstractC0148Dc.m275i(this.f8965q0[i3], i, arrayList, c1405fF);
        }
    }

    /* JADX INFO: renamed from: S */
    public void mo809S() {
    }
}
