package p000;

/* JADX INFO: renamed from: Ci */
/* JADX INFO: loaded from: classes.dex */
public class C0111Ci implements InterfaceC2666wE {

    /* JADX INFO: renamed from: b */
    public static C0111Ci f271b;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f272a;

    @Override // p000.InterfaceC2666wE
    /* JADX INFO: renamed from: a */
    public AbstractC2580uE mo171a(Class cls) {
        switch (this.f272a) {
            case 0:
                return new C0154Di(true);
            case 1:
                return new C0719Qo();
            default:
                try {
                    return (AbstractC2580uE) cls.getDeclaredConstructor(null).newInstance(null);
                } catch (IllegalAccessException e) {
                    throw new RuntimeException("Cannot create an instance of " + cls, e);
                } catch (InstantiationException e2) {
                    throw new RuntimeException("Cannot create an instance of " + cls, e2);
                } catch (NoSuchMethodException e3) {
                    throw new RuntimeException("Cannot create an instance of " + cls, e3);
                }
        }
    }
}
