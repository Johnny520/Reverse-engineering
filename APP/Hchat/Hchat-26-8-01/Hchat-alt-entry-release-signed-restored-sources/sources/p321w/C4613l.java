package p321w;

import gg.AbstractC1416l;
import p085fg.InterfaceC1220a;
import p119i2.C1926g;
import p119i2.C1933j0;
import p119i2.C1935k0;

/* JADX INFO: renamed from: w.l */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4613l implements InterfaceC1220a {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f15224g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C4621n1 f15225h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C4613l(C4621n1 c4621n1, int i9) {
        this.f15224g = i9;
        this.f15225h = c4621n1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1220a
    public final Object invoke() {
        C1933j0 c1933j0;
        switch (this.f15224g) {
            case 0:
                C4621n1 c4621n1 = this.f15225h;
                return Boolean.valueOf(c4621n1 != null ? ((Boolean) new C4613l(c4621n1, 2).invoke()).booleanValue() : false);
            case 1:
                C4621n1 c4621n12 = this.f15225h;
                return Boolean.valueOf(c4621n12 != null ? ((Boolean) new C4613l(c4621n12, 2).invoke()).booleanValue() : false);
            default:
                C4621n1 c4621n13 = this.f15225h;
                C1926g c1926g = c4621n13.f15300b;
                C1935k0 c1935k0 = (C1935k0) c4621n13.f15299a.getValue();
                return Boolean.valueOf(AbstractC1416l.m3825a(c1926g, (c1935k0 == null || (c1933j0 = c1935k0.f6561a) == null) ? null : c1933j0.f6549a));
        }
    }
}
