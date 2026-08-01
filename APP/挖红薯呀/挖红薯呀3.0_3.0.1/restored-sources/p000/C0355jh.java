package p000;

import android.content.Context;

/* JADX INFO: renamed from: jh */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0355jh implements InterfaceC0904ww {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f2874d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f2875e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f2876f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Object f2877g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0355jh(int i, o70 o70Var, Object obj) {
        this.f2874d = 3;
        this.f2876f = o70Var;
        this.f2875e = i;
        this.f2877g = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0904ww
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f2874d;
        na1 na1Var = na1.f4229a;
        int i2 = this.f2875e;
        Object obj3 = this.f2877g;
        Object obj4 = this.f2876f;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ((C0474mh) obj4).m2593d(obj3, (InterfaceC0356ji) obj, j50.m1649A(i2) | 1);
                break;
            case 1:
                ((Integer) obj2).getClass();
                AbstractC0307i4.m1526b((ct0) obj4, (InterfaceC0904ww) obj3, (InterfaceC0356ji) obj, j50.m1649A(i2 | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                AbstractC0307i4.m1527c((ct0[]) obj4, (InterfaceC0904ww) obj3, (InterfaceC0356ji) obj, j50.m1649A(i2 | 1));
                break;
            case 3:
                o70 o70Var = (o70) obj4;
                InterfaceC0356ji interfaceC0356ji = (InterfaceC0356ji) obj;
                int iIntValue = ((Integer) obj2).intValue();
                C0616pi c0616pi = (C0616pi) interfaceC0356ji;
                if (!c0616pi.m3082O(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c0616pi.m3085R();
                } else {
                    o70Var.mo2792b(i2, obj3, c0616pi, 0);
                }
                break;
            case 4:
                ((Integer) obj2).getClass();
                ((r80) obj4).mo2792b(i2, obj3, (InterfaceC0356ji) obj, j50.m1649A(1));
                break;
            case 5:
                break;
            case 6:
                ((Integer) obj2).getClass();
                ((xn0) obj4).mo2792b(i2, obj3, (InterfaceC0356ji) obj, j50.m1649A(1));
                break;
            default:
                ((Integer) obj2).getClass();
                ((b91) obj4).m326a((Boolean) obj3, (InterfaceC0356ji) obj, j50.m1649A(i2 | 1));
                break;
        }
        return na1Var;
    }

    public /* synthetic */ C0355jh(int i, int i2, Object obj, Object obj2) {
        this.f2874d = i2;
        this.f2876f = obj;
        this.f2877g = obj2;
        this.f2875e = i;
    }

    public /* synthetic */ C0355jh(DialogC0402kp dialogC0402kp, Context context, int i) {
        this.f2874d = 5;
        this.f2875e = i;
        this.f2876f = dialogC0402kp;
        this.f2877g = context;
    }

    public /* synthetic */ C0355jh(o70 o70Var, int i, Object obj, int i2, int i3) {
        this.f2874d = i3;
        this.f2876f = o70Var;
        this.f2875e = i;
        this.f2877g = obj;
    }
}
