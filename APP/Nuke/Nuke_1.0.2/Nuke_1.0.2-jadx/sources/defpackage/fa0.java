package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class fa0 extends n21 {
    public final /* synthetic */ int l;
    public final Object m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ fa0(int i, Object obj) {
        this.l = i;
        this.m = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.n21
    public final boolean k() {
        switch (this.l) {
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.n21
    public final void l(Throwable th) {
        int i = this.l;
        Object obj = this.m;
        switch (i) {
            case 0:
                ((ca0) obj).a();
                break;
            case 1:
                ((in0) obj).j(th);
                break;
            default:
                Object obj2 = r21.h.get(j());
                o21 o21Var = (o21) obj;
                if (!(obj2 instanceof ov)) {
                    o21Var.h(eu.e0(obj2));
                } else {
                    o21Var.h(fg1.s(((ov) obj2).a));
                }
                break;
        }
    }
}
