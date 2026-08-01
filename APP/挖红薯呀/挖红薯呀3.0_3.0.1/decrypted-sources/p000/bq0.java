package p000;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class bq0 implements InterfaceC0298hw {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ cq0 f560d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public bq0(cq0 cq0Var) {
        this.f560d = cq0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:15:0x0042 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, z40] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r8v3, types: [dh0] */
    /* JADX WARN: Type inference failed for: r9v2, types: [dh0] */
    @Override // p000.InterfaceC0298hw
    public final Object invoke() {
        ArrayList arrayList = this.f560d.f875a;
        jh0 jh0Var = new jh0(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ?? r4 = (z40) arrayList.get(i);
            Object obj = r4.f7795b;
            int i2 = r4.f7794a;
            Object k40Var = obj != null ? new k40(Integer.valueOf(i2), r4.f7795b) : Integer.valueOf(i2);
            int iM1700f = jh0Var.m1700f(k40Var);
            boolean z = iM1700f < 0;
            Object obj2 = z ? null : jh0Var.f2880c[iM1700f];
            if (obj2 != null) {
                if (obj2 instanceof dh0) {
                    ?? r8 = (dh0) obj2;
                    r8.m697a(r4);
                    r4 = r8;
                } else {
                    Object[] objArr = kk0.f3182a;
                    ?? dh0Var = new dh0(2);
                    dh0Var.m697a(obj2);
                    dh0Var.m697a(r4);
                    r4 = dh0Var;
                }
            }
            if (z) {
                int i3 = ~iM1700f;
                jh0Var.f2879b[i3] = k40Var;
                jh0Var.f2880c[i3] = r4;
            } else {
                jh0Var.f2880c[iM1700f] = r4;
            }
        }
        return new qg0(jh0Var);
    }
}
