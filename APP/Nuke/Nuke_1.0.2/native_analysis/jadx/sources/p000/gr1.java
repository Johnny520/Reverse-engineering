package p000;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gr1 implements mn0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f3677h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ boolean f3678i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f3679j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f3680k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f3681l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ un0 f3682m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ un0 f3683n;

    public /* synthetic */ gr1(Object obj, Object obj2, un0 un0Var, un0 un0Var2, boolean z, int i, int i2) {
        this.f3677h = i2;
        this.f3680k = obj;
        this.f3681l = obj2;
        this.f3682m = un0Var;
        this.f3683n = un0Var2;
        this.f3678i = z;
        this.f3679j = i;
    }

    @Override // p000.mn0
    /* JADX INFO: renamed from: g */
    public final Object mo12g(Object obj, Object obj2) {
        int i = this.f3677h;
        a83 a83Var = a83.f116a;
        int i2 = this.f3679j;
        un0 un0Var = this.f3683n;
        un0 un0Var2 = this.f3682m;
        Object obj3 = this.f3680k;
        switch (i) {
            case 0:
                ((Integer) obj2).intValue();
                int iM3902N = pp0.m3902N(i2 | 1);
                AbstractC0179eu.m1460j((List) obj3, this.f3681l, (in0) un0Var2, (in0) un0Var, this.f3678i, (InterfaceC0596px) obj, iM3902N);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM3902N2 = pp0.m3902N(i2 | 1);
                sp0.m4942h((String) obj3, (String) this.f3681l, (mn0) un0Var2, (mn0) un0Var, this.f3678i, (InterfaceC0596px) obj, iM3902N2);
                break;
        }
        return a83Var;
    }
}
