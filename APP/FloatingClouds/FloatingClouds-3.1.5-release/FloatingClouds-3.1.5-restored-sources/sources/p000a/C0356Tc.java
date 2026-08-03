package p000a;

/* JADX INFO: renamed from: a.Tc */
/* JADX INFO: loaded from: classes.dex */
public final class C0356Tc {

    /* JADX INFO: renamed from: a */
    public static final C0374Uc f1350a;

    /* JADX INFO: renamed from: b */
    public static final InterfaceC0764p9[] f1351b;

    static {
        C0374Uc c0374Uc = null;
        try {
            c0374Uc = (C0374Uc) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (c0374Uc == null) {
            c0374Uc = new C0374Uc();
        }
        f1350a = c0374Uc;
        f1351b = new InterfaceC0764p9[0];
    }
}
