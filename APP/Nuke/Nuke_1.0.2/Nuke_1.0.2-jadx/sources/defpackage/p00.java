package defpackage;

import nuke.ui.HomeActivity;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p00 implements xm0 {
    public final /* synthetic */ int h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ Object j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ p00(HomeActivity homeActivity, boolean z) {
        this.h = 2;
        this.j = homeActivity;
        this.i = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.xm0
    public final Object a() {
        vk1 vk1VarI;
        int i = this.h;
        a83 a83Var = a83.a;
        boolean z = this.i;
        Object obj = this.j;
        switch (i) {
            case 0:
                xm0 xm0Var = (xm0) obj;
                if (z) {
                    xm0Var.a();
                }
                return a83Var;
            case 1:
                l9 l9Var = (l9) obj;
                if (z && (vk1VarI = l9Var.i()) != null) {
                    ((lq2) vk1VarI).p(a83Var);
                }
                return a83Var;
            default:
                return HomeActivity.onCreate$lambda$0$16$0((HomeActivity) obj, z);
        }
    }

    public /* synthetic */ p00(int i, Object obj, boolean z) {
        this.h = i;
        this.i = z;
        this.j = obj;
    }
}
