package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class j90 extends Exception {

    /* JADX INFO: renamed from: h */
    public final Throwable f4923h;

    public j90(Throwable th, c20 c20Var, a20 a20Var) {
        super("Coroutine dispatcher " + c20Var + " threw an exception, context = " + a20Var, th);
        this.f4923h = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f4923h;
    }
}
