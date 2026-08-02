package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class xh0 extends ey2 {
    public final /* synthetic */ jb2 e;
    public final /* synthetic */ yh0 f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xh0(String str, jb2 jb2Var, yh0 yh0Var) {
        super(str);
        this.e = jb2Var;
        this.f = yh0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ey2
    public final long a() throws InterruptedException {
        ib2 ib2Var;
        jb2 jb2Var = this.e;
        try {
            ib2Var = jb2Var.g();
        } catch (Throwable th) {
            ib2Var = new ib2(jb2Var, th, 2);
        }
        yh0 yh0Var = this.f;
        if (!yh0Var.k.contains(jb2Var)) {
            return -1L;
        }
        yh0Var.l.put(ib2Var);
        return -1L;
    }
}
