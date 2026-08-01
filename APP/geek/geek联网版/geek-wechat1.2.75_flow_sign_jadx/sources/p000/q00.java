package p000;

/* JADX INFO: loaded from: classes.dex */
public abstract class q00 {

    /* JADX INFO: renamed from: a */
    public static final r00 f3767a;

    static {
        r00 r00Var = null;
        try {
            r00Var = (r00) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (r00Var == null) {
            r00Var = new r00();
        }
        f3767a = r00Var;
    }
}
