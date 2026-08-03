package p031Q0;

/* JADX INFO: renamed from: Q0.n */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0314n {

    /* JADX INFO: renamed from: a */
    public static final C0315o f596a;

    static {
        C0315o c0315o = null;
        try {
            c0315o = (C0315o) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (c0315o == null) {
            c0315o = new C0315o();
        }
        f596a = c0315o;
    }
}
