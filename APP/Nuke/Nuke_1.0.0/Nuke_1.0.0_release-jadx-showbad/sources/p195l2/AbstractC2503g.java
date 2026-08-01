package p195l2;

/* JADX INFO: renamed from: l2.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2503g {

    /* JADX INFO: renamed from: a */
    public static final ExecutorC2502f f8015a = new ExecutorC2502f(0);

    /* JADX INFO: renamed from: b */
    public static final ExecutorC2502f f8016b = new ExecutorC2502f(1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static void m4443a(String str, boolean z5) {
        if (!z5) {
            throw new IllegalArgumentException(str);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static void m4444b(Object obj) {
        m4445c(obj, "Argument must not be null");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static void m4445c(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }
}
