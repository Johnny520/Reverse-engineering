package p000;

/* JADX INFO: renamed from: tb */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0472tb {

    /* JADX INFO: renamed from: a */
    public static final C0488ub f927a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        C0488ub c0488ub = null;
        try {
            c0488ub = (C0488ub) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (c0488ub == null) {
            c0488ub = new C0488ub();
        }
        f927a = c0488ub;
    }
}
