package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۦ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5556 extends AbstractC4052 implements InterfaceC4433, InterfaceC5424 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public C5557 f13534;

    @Override // Yue.C5850
    @InterfaceC6399
    public String toString() {
        return C4325.m1288(this) + '@' + C4325.m1289(this) + "[job@" + C4325.m1289(m17241()) + ']';
    }

    @Override // Yue.InterfaceC5424
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public boolean mo13919() {
        return true;
    }

    @Override // Yue.InterfaceC5424
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟ۡ */
    public C6384 mo13920() {
        return null;
    }

    @Override // Yue.InterfaceC4433
    /* JADX INFO: renamed from: ۥ۟۟ۡۥ */
    public void mo5757() {
        m17241().m17292(this);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۦۥ, reason: contains not printable characters */
    public final C5557 m17241() {
        C5557 c5557 = this.f13534;
        if (c5557 != null) {
            return c5557;
        }
        C5499.m17132("job");
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۦ, reason: contains not printable characters */
    public final void m17242(@InterfaceC6399 C5557 c5557) {
        this.f13534 = c5557;
    }
}
