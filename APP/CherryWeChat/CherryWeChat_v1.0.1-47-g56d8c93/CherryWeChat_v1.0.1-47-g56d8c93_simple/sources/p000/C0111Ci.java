package p000;

/* JADX INFO: renamed from: Ci */
/* JADX INFO: loaded from: classes.dex */
public class C0111Ci implements InterfaceC2666wE {

    /* JADX INFO: renamed from: b */
    public static C0111Ci f271b;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f272a;

    public /* synthetic */ C0111Ci(int r1) {
        this.f272a = r1;
    }

    @Override // p000.InterfaceC2666wE
    /* JADX INFO: renamed from: a */
    public AbstractC2580uE mo171a(Class r5) {
        switch(this.f272a) {
            case 0: goto L22;
            case 1: goto L20;
            default: goto L23;
        };
    L23:
        return (AbstractC2580uE) r5.getDeclaredConstructor(null).newInstance(null);
    L7:
        e = move-exception;
        throw new RuntimeException("Cannot create an instance of " + r5, e);
    L9:
        e = move-exception;
        throw new RuntimeException("Cannot create an instance of " + r5, e);
    L11:
        e = move-exception;
        throw new RuntimeException("Cannot create an instance of " + r5, e);
    L20:
        return new C0719Qo();
    L22:
        return new C0154Di(true);
    }
}
