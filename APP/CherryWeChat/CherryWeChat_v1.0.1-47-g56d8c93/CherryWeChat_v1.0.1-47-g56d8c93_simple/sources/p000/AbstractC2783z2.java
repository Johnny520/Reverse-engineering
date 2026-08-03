package p000;

/* JADX INFO: renamed from: z2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2783z2 {

    /* JADX INFO: renamed from: a */
    public static final Class f9446a = null;

    /* JADX INFO: renamed from: b */
    public static final boolean f9447b = false;

    static {
        Class<?> r1 = null;
        Class<?> r0 = Class.forName("libcore.io.Memory");     // Catch: Throwable -> L5
    L6:
        f9446a = r0;
        r1 = Class.forName("org.robolectric.Robolectric");     // Catch: Throwable -> L13
    L8:
        if (r1 == null) goto L10;
        boolean r02 = true;
    L11:
        f9447b = r02;
        return;
    L10:
        r02 = false;
    L5:
        r0 = null;
        goto L6
    }

    /* JADX INFO: renamed from: a */
    public static boolean m5355a() {
        if (f9446a != null) goto L5;
        return false;
    L5:
        if (f9447b == true) goto L10;
        return true;
    L10:
        return false;
    }
}
