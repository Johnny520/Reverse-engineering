package p000;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q80 implements InterfaceC0904ww {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f5084d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f5085e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f5086f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ q80(Context context, int i) {
        this.f5084d = 1;
        this.f5085e = i;
        this.f5086f = context;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0904ww
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f5084d;
        na1 na1Var = na1.f4229a;
        int i2 = this.f5085e;
        Object obj3 = this.f5086f;
        switch (i) {
            case 0:
                r80 r80Var = (r80) obj3;
                InterfaceC0356ji interfaceC0356ji = (InterfaceC0356ji) obj;
                int iIntValue = ((Integer) obj2).intValue();
                C0616pi c0616pi = (C0616pi) interfaceC0356ji;
                if (c0616pi.m3082O(iIntValue & 1, (iIntValue & 3) != 2)) {
                    k30 k30VarM4251b = r80Var.f5324b.f4778a.m4251b(i2);
                    ((o80) k30VarM4251b.f3002c).f4483a.mo259b(r80Var.f5325c, Integer.valueOf(i2 - k30VarM4251b.f3000a), c0616pi, 0);
                } else {
                    c0616pi.m3085R();
                }
                return na1Var;
            case 1:
                return ob0.m2819D(i2, (Context) obj3, ((Integer) obj).intValue(), ((Integer) obj2).intValue());
            case 2:
                return zc0.m5501O0((InterfaceC0904ww) obj3, i2, (InterfaceC0356ji) obj, ((Integer) obj2).intValue());
            default:
                xn0 xn0Var = (xn0) obj3;
                InterfaceC0356ji interfaceC0356ji2 = (InterfaceC0356ji) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                C0616pi c0616pi2 = (C0616pi) interfaceC0356ji2;
                if (c0616pi2.m3082O(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    k30 k30VarM4251b2 = xn0Var.f7383b.mo3023l().m4251b(i2);
                    ((rn0) k30VarM4251b2.f3002c).f5513b.mo259b(bo0.f553a, Integer.valueOf(i2 - k30VarM4251b2.f3000a), c0616pi2, 0);
                } else {
                    c0616pi2.m3085R();
                }
                return na1Var;
        }
    }

    public /* synthetic */ q80(int i, int i2, Object obj) {
        this.f5084d = i2;
        this.f5086f = obj;
        this.f5085e = i;
    }
}
