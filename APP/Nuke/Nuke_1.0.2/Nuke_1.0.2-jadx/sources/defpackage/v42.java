package defpackage;

import com.dokar.quickjs.QuickJs;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class v42 extends tw2 implements in0 {
    public final /* synthetic */ QuickJs l;
    public final /* synthetic */ String m;
    public final /* synthetic */ String n;
    public final /* synthetic */ boolean o;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v42(QuickJs quickJs, String str, String str2, boolean z, t00 t00Var) {
        super(1, t00Var);
        this.l = quickJs;
        this.m = str;
        this.n = str2;
        this.o = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.in0
    public final Object j(Object obj) {
        String str = this.n;
        boolean z = this.o;
        return new v42(this.l, this.m, str, z, (t00) obj).r(a83.a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rj
    public final Object r(Object obj) {
        fg1.T(obj);
        QuickJs quickJs = this.l;
        return quickJs.evaluate(quickJs.context, quickJs.globals, this.m, this.n, this.o);
    }
}
