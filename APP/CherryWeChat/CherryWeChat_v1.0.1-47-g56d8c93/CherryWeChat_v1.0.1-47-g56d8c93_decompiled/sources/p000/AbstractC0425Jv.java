package p000;

/* JADX INFO: renamed from: Jv */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0425Jv {

    /* JADX INFO: renamed from: a */
    public static final C0468Kv f1405a;

    static {
        C0468Kv c0468Kv = null;
        try {
            c0468Kv = (C0468Kv) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (c0468Kv == null) {
            c0468Kv = new C0468Kv();
        }
        f1405a = c0468Kv;
    }

    /* JADX INFO: renamed from: a */
    public static C0225F9 m881a(Class cls) {
        f1405a.getClass();
        return new C0225F9(cls);
    }
}
