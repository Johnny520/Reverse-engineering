package p000;

/* JADX INFO: loaded from: classes.dex */
public abstract class j00 {

    /* JADX INFO: renamed from: a */
    public static final k00 f2515a;

    static {
        k00 k00Var = null;
        try {
            k00Var = (k00) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (k00Var == null) {
            k00Var = new k00();
        }
        f2515a = k00Var;
    }
}
