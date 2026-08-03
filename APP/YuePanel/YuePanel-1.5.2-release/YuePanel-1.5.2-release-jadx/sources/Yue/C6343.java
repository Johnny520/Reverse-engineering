package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۢ۠۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C6343 implements InterfaceC4704, InterfaceC7601 {

    /* JADX INFO: renamed from: ۥ */
    public C6848 f2024;

    public C6343(C6848 c6848) {
        this.f2024 = c6848;
    }

    @Override // Yue.InterfaceC7601
    /* JADX INFO: renamed from: ۥ */
    public boolean mo2810(InterfaceC8561 interfaceC8561) {
        if (interfaceC8561.mo18328() || interfaceC8561.mo18326()) {
            return this.f2024.equals(new C6848(interfaceC8561.mo18325(), interfaceC8561.mo18348()));
        }
        return false;
    }

    @Override // Yue.InterfaceC4704
    /* JADX INFO: renamed from: ۥ۟ */
    public boolean mo1620(InterfaceC8543 interfaceC8543) {
        if (interfaceC8543.mo9149() || interfaceC8543.mo9148()) {
            return this.f2024.equals(interfaceC8543.mo9149() ? ((InterfaceC7574) interfaceC8543).getName() : ((InterfaceC4643) interfaceC8543).getName());
        }
        return false;
    }
}
