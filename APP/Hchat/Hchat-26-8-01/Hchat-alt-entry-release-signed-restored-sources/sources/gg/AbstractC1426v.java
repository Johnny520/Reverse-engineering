package gg;

/* JADX INFO: renamed from: gg.v */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1426v {

    /* JADX INFO: renamed from: a */
    public static final C1427w f4739a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        C1427w c1427w = null;
        try {
            c1427w = (C1427w) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (c1427w == null) {
            c1427w = new C1427w();
        }
        f4739a = c1427w;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static C1410f m3834a(Class cls) {
        f4739a.getClass();
        return new C1410f(cls);
    }
}
