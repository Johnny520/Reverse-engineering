package p000a;

import androidx.constraintlayout.widget.ConstraintLayout;
import p000a.C0240N3;
import p000a.C0548e2;

/* JADX INFO: renamed from: a.Yg */
/* JADX INFO: loaded from: classes.dex */
public class C0450Yg extends C0573f8 {

    /* JADX INFO: renamed from: g0 */
    public int f1695g0 = 0;

    /* JADX INFO: renamed from: h0 */
    public int f1696h0 = 0;

    /* JADX INFO: renamed from: i0 */
    public int f1697i0 = 0;

    /* JADX INFO: renamed from: j0 */
    public int f1698j0 = 0;

    /* JADX INFO: renamed from: k0 */
    public int f1699k0 = 0;

    /* JADX INFO: renamed from: l0 */
    public int f1700l0 = 0;

    /* JADX INFO: renamed from: m0 */
    public boolean f1701m0 = false;

    /* JADX INFO: renamed from: n0 */
    public int f1702n0 = 0;

    /* JADX INFO: renamed from: o0 */
    public int f1703o0 = 0;

    /* JADX INFO: renamed from: p0 */
    public final C0548e2.a f1704p0 = new C0548e2.a();

    /* JADX INFO: renamed from: q0 */
    public C0548e2.b f1705q0 = null;

    @Override // p000a.C0573f8
    /* JADX INFO: renamed from: B */
    public final void mo1112B() {
        for (int i = 0; i < this.f2135f0; i++) {
            C0240N3 c0240n3 = this.f2134e0[i];
        }
    }

    /* JADX INFO: renamed from: C */
    public void mo354C(int i, int i2, int i3, int i4) {
    }

    /* JADX INFO: renamed from: D */
    public final void m1113D(C0240N3 c0240n3, C0240N3.a aVar, int i, C0240N3.a aVar2, int i2) {
        C0548e2.b bVar;
        C0240N3 c0240n32;
        while (true) {
            bVar = this.f1705q0;
            if (bVar != null || (c0240n32 = this.f793K) == null) {
                break;
            } else {
                this.f1705q0 = ((C0258O3) c0240n32).f929h0;
            }
        }
        C0548e2.a aVar3 = this.f1704p0;
        aVar3.f2025a = aVar;
        aVar3.f2026b = aVar2;
        aVar3.f2027c = i;
        aVar3.f2028d = i2;
        ((ConstraintLayout.C1045b) bVar).m2414a(c0240n3, aVar3);
        c0240n3.m661y(aVar3.f2029e);
        c0240n3.m658v(aVar3.f2030f);
        c0240n3.f835w = aVar3.f2032h;
        int i3 = aVar3.f2031g;
        c0240n3.f800R = i3;
        c0240n3.f835w = i3 > 0;
    }
}
