package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jw extends k5 implements mn0 {
    public final /* synthetic */ int o;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jw(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.o = i3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.mn0
    public final Object g(Object obj, Object obj2) {
        int i = this.o;
        a83 a83Var = a83.a;
        Object obj3 = this.h;
        switch (i) {
            case 0:
                kw kwVar = (kw) obj3;
                kwVar.d(((Number) obj2).intValue(), (px) obj);
                break;
            case 1:
                am2 am2Var = (am2) obj3;
                p7.A(am2Var.S.c(), null, new yl2(am2Var, ((da3) obj).a, null, 2), 3);
                break;
            default:
                am2 am2Var2 = (am2) obj3;
                p7.A(am2Var2.S.c(), null, new yl2(am2Var2, ((da3) obj).a, null, 1), 3);
                break;
        }
        return a83Var;
    }
}
