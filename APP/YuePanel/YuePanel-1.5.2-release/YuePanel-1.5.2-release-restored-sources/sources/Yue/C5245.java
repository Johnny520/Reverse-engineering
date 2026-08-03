package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۤۡۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C5245 extends C5249 implements InterfaceC3843 {

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public String f12487 = InterfaceC5949.f14892;

    @Override // Yue.InterfaceC3842
    /* JADX INFO: renamed from: ۥ۟ */
    public String mo897() {
        return this.f12487;
    }

    @Override // Yue.InterfaceC3843
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
    public void mo10642(String str) {
        if (str == null) {
            throw new IllegalArgumentException("http resource descriptor must not be null");
        }
        this.f12487 = str;
    }
}
