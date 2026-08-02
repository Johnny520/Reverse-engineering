package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class jo0 implements xm0 {
    public final /* synthetic */ ko0 h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public jo0(ko0 ko0Var) {
        this.h = ko0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:15:0x0042 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [e51, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r8v3, types: [lk1] */
    /* JADX WARN: Type inference failed for: r9v2, types: [lk1] */
    @Override // defpackage.xm0
    public final Object a() {
        ArrayList arrayList = this.h.a;
        rk1 rk1Var = new rk1(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ?? r4 = (e51) arrayList.get(i);
            Object obj = r4.b;
            int i2 = r4.a;
            Object s21Var = obj != null ? new s21(Integer.valueOf(i2), r4.b) : Integer.valueOf(i2);
            int iF = rk1Var.f(s21Var);
            boolean z = iF < 0;
            Object obj2 = z ? null : rk1Var.c[iF];
            if (obj2 != null) {
                if (obj2 instanceof lk1) {
                    ?? r8 = (lk1) obj2;
                    r8.a(r4);
                    r4 = r8;
                } else {
                    Object[] objArr = js1.a;
                    ?? lk1Var = new lk1(2);
                    lk1Var.a(obj2);
                    lk1Var.a(r4);
                    r4 = lk1Var;
                }
            }
            if (z) {
                int i3 = ~iF;
                rk1Var.b[i3] = s21Var;
                rk1Var.c[i3] = r4;
            } else {
                rk1Var.c[iF] = r4;
            }
        }
        return new rj1(rk1Var);
    }
}
