package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a23 {
    public static final ThreadLocal a = new ThreadLocal();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static lg0 a() {
        ThreadLocal threadLocal = a;
        lg0 lg0Var = (lg0) threadLocal.get();
        if (lg0Var != null) {
            return lg0Var;
        }
        hl hlVar = new hl(Thread.currentThread());
        threadLocal.set(hlVar);
        return hlVar;
    }
}
