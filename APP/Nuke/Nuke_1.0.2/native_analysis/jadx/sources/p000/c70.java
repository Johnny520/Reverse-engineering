package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class c70 implements uo2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1217a = 0;

    /* JADX INFO: renamed from: b */
    public final Object f1218b;

    /* JADX INFO: renamed from: c */
    public final un0 f1219c;

    public c70(CharSequence charSequence, mn0 mn0Var) {
        charSequence.getClass();
        this.f1218b = charSequence;
        this.f1219c = mn0Var;
    }

    @Override // p000.uo2
    public final Iterator iterator() {
        switch (this.f1217a) {
            case 0:
                return new b70(this);
            default:
                return new ro0(this);
        }
    }

    public c70(xm0 xm0Var, in0 in0Var) {
        this.f1218b = xm0Var;
        this.f1219c = in0Var;
    }
}
