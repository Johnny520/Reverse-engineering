package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۤۡۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C6671 {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6399
    @InterfaceC5568
    public static final C6670 f2230 = new C5521();

    @InterfaceC6839
    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥ */
    public static final boolean m3162(int i, int i2, int i3) {
        return C5671.f13972.m17577(i, i2, i3);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟ */
    public static final /* synthetic */ <T> T m3163(Object obj) throws ClassNotFoundException {
        try {
            C5499.m17112(1, C4750.f10502);
            return obj;
        } catch (ClassCastException e) {
            ClassLoader classLoader = obj.getClass().getClassLoader();
            C5499.m17112(4, C4750.f10502);
            ClassLoader classLoader2 = Object.class.getClassLoader();
            if (C5499.m17094(classLoader, classLoader2)) {
                throw e;
            }
            throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader + ", base type classloader: " + classLoader2, e);
        }
    }
}
