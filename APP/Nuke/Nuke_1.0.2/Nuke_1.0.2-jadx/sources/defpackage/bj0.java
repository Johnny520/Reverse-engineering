package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class bj0 implements uo2 {
    public final /* synthetic */ int a;
    public final uo2 b;
    public final in0 c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public bj0(uo2 uo2Var, in0 in0Var, int i) {
        this.a = i;
        in0Var.getClass();
        switch (i) {
            case 1:
                this.b = uo2Var;
                this.c = in0Var;
                break;
            default:
                this.b = uo2Var;
                this.c = in0Var;
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.uo2
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new aj0(this);
            default:
                return new r33(this);
        }
    }
}
