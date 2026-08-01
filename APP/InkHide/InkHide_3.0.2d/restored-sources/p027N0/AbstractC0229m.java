package p027N0;

/* JADX INFO: renamed from: N0.m */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0229m {

    /* JADX INFO: renamed from: a */
    public static final C0230n f569a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        C0230n c0230n = null;
        try {
            c0230n = (C0230n) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (c0230n == null) {
            c0230n = new C0230n();
        }
        f569a = c0230n;
    }
}
