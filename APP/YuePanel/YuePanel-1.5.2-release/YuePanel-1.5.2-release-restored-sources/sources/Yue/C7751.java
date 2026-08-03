package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۡ۠ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C7751 extends AbstractC4298 {
    public C7751() {
        super(EnumC6568.TEXT);
    }

    @Override // Yue.AbstractC4298, Yue.AbstractC5115
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
    public void mo10646() throws C5509 {
        super.mo10646();
        if (!C3793.m839(mo10645())) {
            throw new C5509(1007, "Received text is no valid utf8 string!");
        }
    }
}
