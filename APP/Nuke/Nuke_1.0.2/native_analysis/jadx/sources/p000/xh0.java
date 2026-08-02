package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class xh0 extends ey2 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ jb2 f13033e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ yh0 f13034f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xh0(String str, jb2 jb2Var, yh0 yh0Var) {
        super(str);
        this.f13033e = jb2Var;
        this.f13034f = yh0Var;
    }

    @Override // p000.ey2
    /* JADX INFO: renamed from: a */
    public final long mo1485a() throws InterruptedException {
        ib2 ib2Var;
        jb2 jb2Var = this.f13033e;
        try {
            ib2Var = jb2Var.mo983g();
        } catch (Throwable th) {
            ib2Var = new ib2(jb2Var, th, 2);
        }
        yh0 yh0Var = this.f13034f;
        if (!yh0Var.f13459k.contains(jb2Var)) {
            return -1L;
        }
        yh0Var.f13460l.put(ib2Var);
        return -1L;
    }
}
