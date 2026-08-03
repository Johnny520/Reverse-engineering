package p000;

/* JADX INFO: renamed from: z2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2783z2 {

    /* JADX INFO: renamed from: a */
    public static final Class f9446a;

    /* JADX INFO: renamed from: b */
    public static final boolean f9447b;

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f9446a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        f9447b = cls2 != null;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m5355a() {
        return (f9446a == null || f9447b) ? false : true;
    }
}
