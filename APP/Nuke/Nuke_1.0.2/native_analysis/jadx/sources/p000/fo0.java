package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class fo0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3077a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f3078b;

    public /* synthetic */ fo0(int i, Object obj) {
        this.f3077a = i;
        this.f3078b = obj;
    }

    /* JADX INFO: renamed from: a */
    public final void m1699a() {
        int i = this.f3077a;
        Object obj = this.f3078b;
        switch (i) {
            case 0:
                go0 go0Var = (go0) obj;
                go0Var.f3595A--;
                break;
            default:
                ss2 ss2Var = (ss2) obj;
                ss2Var.f10359k--;
                break;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m1700b() {
        int i = this.f3077a;
        Object obj = this.f3078b;
        switch (i) {
            case 0:
                ((go0) obj).f3595A++;
                break;
            default:
                ((ss2) obj).f10359k++;
                break;
        }
    }
}
