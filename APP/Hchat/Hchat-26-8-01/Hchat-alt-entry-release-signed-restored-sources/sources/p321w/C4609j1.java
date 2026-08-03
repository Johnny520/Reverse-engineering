package p321w;

import p057e1.C0808c;
import p117i0.C1823e;
import p117i0.C1829f1;
import p117i0.C1833g1;
import p117i0.C1845j1;
import p119i2.C1939m0;
import p174m.EnumC2640p1;
import p227p4.C3315t;
import p259r9.AbstractC3754e0;
import p259r9.C3766p;
import p307v0.AbstractC4371k;
import vg.C4571t;

/* JADX INFO: renamed from: w.j1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4609j1 {

    /* JADX INFO: renamed from: g */
    public static final C3315t f15205g = AbstractC4371k.m8804b(new C4571t(2), new C3766p(26));

    /* JADX INFO: renamed from: a */
    public final C1829f1 f15206a;

    /* JADX INFO: renamed from: b */
    public final C1829f1 f15207b = new C1829f1(0.0f);

    /* JADX INFO: renamed from: c */
    public final C1833g1 f15208c = new C1833g1(0);

    /* JADX INFO: renamed from: d */
    public C0808c f15209d = C0808c.f2415e;

    /* JADX INFO: renamed from: e */
    public long f15210e = C1939m0.f6573b;

    /* JADX INFO: renamed from: f */
    public final C1845j1 f15211f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4609j1(EnumC2640p1 enumC2640p1, float f3) {
        this.f15206a = new C1829f1(f3);
        this.f15211f = new C1845j1(enumC2640p1, C1823e.f6052m);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m9033a(EnumC2640p1 enumC2640p1, C0808c c0808c, int i9, int i10) {
        float f3 = i10 - i9;
        this.f15207b.m4489h(f3);
        float f10 = c0808c.f2416a;
        float f11 = c0808c.f2417b;
        C0808c c0808c2 = this.f15209d;
        float f12 = c0808c2.f2416a;
        C1829f1 c1829f1 = this.f15206a;
        if (f10 != f12 || f11 != c0808c2.f2417b) {
            boolean z9 = enumC2640p1 == EnumC2640p1.f8622g;
            if (z9) {
                f10 = f11;
            }
            float f13 = z9 ? c0808c.f2419d : c0808c.f2418c;
            float fM4488g = c1829f1.m4488g();
            float f14 = i9;
            float f15 = fM4488g + f14;
            c1829f1.m4489h(c1829f1.m4488g() + ((f13 <= f15 && (f10 >= fM4488g || f13 - f10 <= f14)) ? (f10 >= fM4488g || f13 - f10 > f14) ? 0.0f : f10 - fM4488g : f13 - f15));
            this.f15209d = c0808c;
        }
        c1829f1.m4489h(AbstractC3754e0.m7907q(c1829f1.m4488g(), 0.0f, f3));
        this.f15208c.m4493h(i9);
    }
}
