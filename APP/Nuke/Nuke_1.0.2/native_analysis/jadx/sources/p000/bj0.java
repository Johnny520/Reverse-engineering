package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class bj0 implements uo2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f892a;

    /* JADX INFO: renamed from: b */
    public final uo2 f893b;

    /* JADX INFO: renamed from: c */
    public final in0 f894c;

    public bj0(uo2 uo2Var, in0 in0Var, int i) {
        this.f892a = i;
        in0Var.getClass();
        switch (i) {
            case 1:
                this.f893b = uo2Var;
                this.f894c = in0Var;
                break;
            default:
                this.f893b = uo2Var;
                this.f894c = in0Var;
                break;
        }
    }

    @Override // p000.uo2
    public final Iterator iterator() {
        switch (this.f892a) {
            case 0:
                return new aj0(this);
            default:
                return new r33(this);
        }
    }
}
