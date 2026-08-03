package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۡۧ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C6302 extends AbstractC6301 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C6302(InterfaceC5589 interfaceC5589, String str, String str2) {
        super(AbstractC3648.NO_RECEIVER, ((InterfaceC3827) interfaceC5589).mo10566(), str, str2, !(interfaceC5589 instanceof InterfaceC5585) ? 1 : 0);
    }

    @Override // Yue.InterfaceC5606
    public Object get() {
        return mo2313().call(new Object[0]);
    }

    @Override // Yue.InterfaceC5599
    public void set(Object obj) {
        mo2310().call(obj);
    }

    @InterfaceC7470(version = "1.4")
    public C6302(Class cls, String str, String str2, int i) {
        super(AbstractC3648.NO_RECEIVER, cls, str, str2, i);
    }

    @InterfaceC7470(version = "1.4")
    public C6302(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }
}
