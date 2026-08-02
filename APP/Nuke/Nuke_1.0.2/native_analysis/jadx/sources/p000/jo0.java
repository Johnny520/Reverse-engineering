package p000;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class jo0 implements xm0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ ko0 f5128h;

    public jo0(ko0 ko0Var) {
        this.f5128h = ko0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [e51, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r8v3, types: [lk1] */
    /* JADX WARN: Type inference failed for: r9v2, types: [lk1] */
    @Override // p000.xm0
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        ArrayList arrayList = this.f5128h.f5688a;
        rk1 rk1Var = new rk1(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ?? r4 = (e51) arrayList.get(i);
            Object obj = r4.f2310b;
            int i2 = r4.f2309a;
            Object s21Var = obj != null ? new s21(Integer.valueOf(i2), r4.f2310b) : Integer.valueOf(i2);
            int iM4504f = rk1Var.m4504f(s21Var);
            boolean z = iM4504f < 0;
            Object obj2 = z ? null : rk1Var.f9620c[iM4504f];
            if (obj2 != null) {
                if (obj2 instanceof lk1) {
                    ?? r8 = (lk1) obj2;
                    r8.m2925a(r4);
                    r4 = r8;
                } else {
                    Object[] objArr = js1.f5195a;
                    ?? lk1Var = new lk1(2);
                    lk1Var.m2925a(obj2);
                    lk1Var.m2925a(r4);
                    r4 = lk1Var;
                }
            }
            if (z) {
                int i3 = ~iM4504f;
                rk1Var.f9619b[i3] = s21Var;
                rk1Var.f9620c[i3] = r4;
            } else {
                rk1Var.f9620c[iM4504f] = r4;
            }
        }
        return new rj1(rk1Var);
    }
}
