package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class c70 implements uo2 {
    public final /* synthetic */ int a = 0;
    public final Object b;
    public final un0 c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public c70(CharSequence charSequence, mn0 mn0Var) {
        charSequence.getClass();
        this.b = charSequence;
        this.c = mn0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.uo2
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new b70(this);
            default:
                return new ro0(this);
        }
    }

    public c70(xm0 xm0Var, in0 in0Var) {
        this.b = xm0Var;
        this.c = in0Var;
    }
}
