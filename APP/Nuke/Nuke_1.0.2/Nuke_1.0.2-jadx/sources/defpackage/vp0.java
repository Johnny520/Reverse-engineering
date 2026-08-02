package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class vp0 extends ContextWrapper {
    public static final to0 k;
    public final td1 a;
    public final af0 b;
    public final z8 c;
    public final eb d;
    public final List e;
    public final hg f;
    public final bf0 g;
    public final n4 h;
    public final int i;
    public z82 j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        to0 to0Var = new to0();
        to0Var.h = rn1.a;
        k = to0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public vp0(Context context, td1 td1Var, er2 er2Var, z8 z8Var, eb ebVar, hg hgVar, List list, bf0 bf0Var, n4 n4Var) {
        super(context.getApplicationContext());
        this.a = td1Var;
        this.c = z8Var;
        this.d = ebVar;
        this.e = list;
        this.f = hgVar;
        this.g = bf0Var;
        this.h = n4Var;
        this.i = 4;
        this.b = new af0(er2Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final v72 a() {
        return (v72) this.b.get();
    }
}
