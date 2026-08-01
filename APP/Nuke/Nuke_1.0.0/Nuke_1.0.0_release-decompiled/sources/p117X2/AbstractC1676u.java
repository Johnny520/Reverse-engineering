package p117X2;

/* JADX INFO: renamed from: X2.u */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1676u {

    /* JADX INFO: renamed from: a */
    public static final C1677v f5711a;

    static {
        C1677v c1677v = null;
        try {
            c1677v = (C1677v) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (c1677v == null) {
            c1677v = new C1677v();
        }
        f5711a = c1677v;
    }

    /* JADX INFO: renamed from: a */
    public static C1660e m2995a(Class cls) {
        f5711a.getClass();
        return new C1660e(cls);
    }
}
