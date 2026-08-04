package yyds;

/* JADX INFO: renamed from: yyds.ᲇᲈᛷᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2567 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static final ThreadLocal f12653 = new ThreadLocal();

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static AbstractC0467 m4643() {
        ThreadLocal threadLocal = f12653;
        AbstractC0467 abstractC0467 = (AbstractC0467) threadLocal.get();
        if (abstractC0467 != null) {
            return abstractC0467;
        }
        C2079 c2079 = new C2079(Thread.currentThread());
        threadLocal.set(c2079);
        return c2079;
    }
}
