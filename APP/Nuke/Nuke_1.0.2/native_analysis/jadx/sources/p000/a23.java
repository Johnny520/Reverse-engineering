package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a23 {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal f41a = new ThreadLocal();

    /* JADX INFO: renamed from: a */
    public static lg0 m20a() {
        ThreadLocal threadLocal = f41a;
        lg0 lg0Var = (lg0) threadLocal.get();
        if (lg0Var != null) {
            return lg0Var;
        }
        C0281hl c0281hl = new C0281hl(Thread.currentThread());
        threadLocal.set(c0281hl);
        return c0281hl;
    }
}
