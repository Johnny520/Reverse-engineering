package p000;

/* JADX INFO: renamed from: ij */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0315ij implements in0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f4647h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ boolean f4648i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f4649j;

    public /* synthetic */ C0315ij(in0 in0Var, boolean z) {
        this.f4647h = 1;
        this.f4648i = z;
        this.f4649j = in0Var;
    }

    @Override // p000.in0
    /* JADX INFO: renamed from: j */
    public final Object mo5j(Object obj) {
        int i = this.f4647h;
        boolean z = this.f4648i;
        Object obj2 = this.f4649j;
        switch (i) {
            case 0:
                C0710sw c0710sw = (C0710sw) obj2;
                c0710sw.mo5619j(z);
                return new C0389kj((pa1) obj, c0710sw, 0);
            case 1:
                in0 in0Var = (in0) obj2;
                String str = (String) obj;
                str.getClass();
                if (z) {
                    String strReplace = str.replace('\n', ' ');
                    strReplace.getClass();
                    String strReplace2 = strReplace.replace('\r', ' ');
                    strReplace2.getClass();
                    in0Var.mo5j(strReplace2);
                } else {
                    in0Var.mo5j(str);
                }
                return a83.f116a;
            default:
                C0940yw c0940yw = (C0940yw) obj2;
                c0940yw.mo5619j(z);
                return new C0389kj((pa1) obj, c0940yw, 1);
        }
    }

    public /* synthetic */ C0315ij(AbstractC0796v3 abstractC0796v3, boolean z, int i) {
        this.f4647h = i;
        this.f4649j = abstractC0796v3;
        this.f4648i = z;
    }
}
