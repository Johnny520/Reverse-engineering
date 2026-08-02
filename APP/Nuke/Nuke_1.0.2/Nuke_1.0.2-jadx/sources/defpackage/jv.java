package defpackage;

import java.lang.reflect.Type;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class jv implements yo {
    public final /* synthetic */ int h;
    public final Type i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ jv(int i, Type type) {
        this.h = i;
        this.i = type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.yo
    public final Type e() {
        int i = this.h;
        return this.i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.yo
    public final Object i(ct1 ct1Var) {
        switch (this.h) {
            case 0:
                kv kvVar = new kv(ct1Var);
                ct1Var.b(new iv(kvVar, 0));
                return kvVar;
            default:
                kv kvVar2 = new kv(ct1Var);
                ct1Var.b(new iv(kvVar2, 1));
                return kvVar2;
        }
    }
}
