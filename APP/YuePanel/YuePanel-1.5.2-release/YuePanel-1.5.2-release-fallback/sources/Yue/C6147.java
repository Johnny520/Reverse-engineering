package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۡ۠ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C6147 extends Yue.AbstractC1724 {
    public C6147() {
            r1 = this;
            Yue.ۥۣۣۡۢ r0 = Yue.EnumC4633.f14776
            r1.<init>(r0)
            return
    }

    @Override // Yue.AbstractC1724, Yue.AbstractC2814
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
    public void mo6103() throws Yue.C3342 {
            r3 = this;
            super.mo6103()
            java.nio.ByteBuffer r0 = r3.mo6102()
            boolean r0 = Yue.C1098.m5883(r0)
            if (r0 == 0) goto Le
            return
        Le:
            Yue.ۥ۠ۥۧۤ r0 = new Yue.ۥ۠ۥۧۤ
            r1 = 1007(0x3ef, float:1.411E-42)
            java.lang.String r2 = "Received text is no valid utf8 string!"
            r0.<init>(r1, r2)
            throw r0
    }
}
