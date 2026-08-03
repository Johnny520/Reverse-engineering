package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۦ۟ۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6839
public class C5545 extends C5557 implements InterfaceC4047 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final boolean f13510;

    public C5545(@InterfaceC6489 InterfaceC5542 interfaceC5542) {
        super(true);
        m17274(interfaceC5542);
        this.f13510 = m17174();
    }

    @Override // Yue.InterfaceC4047
    public boolean complete() {
        return m17281(C8107.f3222);
    }

    @Override // Yue.InterfaceC4047
    /* JADX INFO: renamed from: ۥ۟ */
    public boolean mo997(@InterfaceC6399 Throwable th) {
        return m17281(new C4050(th, false, 2, null));
    }

    @Override // Yue.C5557
    /* JADX INFO: renamed from: ۥ۟۟ۦ۟, reason: contains not printable characters */
    public boolean mo17173() {
        return this.f13510;
    }

    @Override // Yue.C5557
    /* JADX INFO: renamed from: ۥ۟۟ۦ۠ */
    public boolean mo11469() {
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۠۟ۧ, reason: contains not printable characters */
    public final boolean m17174() {
        C5557 c5557M17241;
        InterfaceC3814 interfaceC3814M17272 = m17272();
        C3815 c3815 = interfaceC3814M17272 instanceof C3815 ? (C3815) interfaceC3814M17272 : null;
        if (c3815 != null && (c5557M17241 = c3815.m17241()) != null) {
            while (!c5557M17241.mo17173()) {
                InterfaceC3814 interfaceC3814M172722 = c5557M17241.m17272();
                C3815 c38152 = interfaceC3814M172722 instanceof C3815 ? (C3815) interfaceC3814M172722 : null;
                if (c38152 == null || (c5557M17241 = c38152.m17241()) == null) {
                }
            }
            return true;
        }
        return false;
    }
}
