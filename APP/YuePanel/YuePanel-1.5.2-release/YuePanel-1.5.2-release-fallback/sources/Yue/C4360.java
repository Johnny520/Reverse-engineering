package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۢ۠۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C4360 implements Yue.InterfaceC2223, Yue.InterfaceC5957 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public Yue.C4996 f13901;

    public C4360(Yue.C4996 r1) {
            r0 = this;
            r0.<init>()
            r0.f13901 = r1
            return
    }

    @Override // Yue.InterfaceC5957
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public boolean mo17187(Yue.InterfaceC7160 r4) {
            r3 = this;
            boolean r0 = r4.mo15449()
            r1 = 0
            if (r0 != 0) goto Le
            boolean r0 = r4.mo15447()
            if (r0 != 0) goto Le
            return r1
        Le:
            Yue.ۥۡۥۤۨ r0 = new Yue.ۥۡۥۤۨ
            java.lang.String r2 = r4.mo15446()
            java.lang.String r4 = r4.mo15469()
            r0.<init>(r2, r4)
            Yue.ۥۡۥۤۨ r4 = r3.f13901
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L25
            r4 = 1
            return r4
        L25:
            return r1
    }

    @Override // Yue.InterfaceC2223
    /* JADX INFO: renamed from: ۥ۟ */
    public boolean mo10200(Yue.InterfaceC7142 r3) {
            r2 = this;
            boolean r0 = r3.mo4235()
            r1 = 0
            if (r0 != 0) goto Le
            boolean r0 = r3.mo4234()
            if (r0 != 0) goto Le
            return r1
        Le:
            boolean r0 = r3.mo4235()
            if (r0 == 0) goto L1b
            Yue.ۥۢ۟ۨۤ r3 = (Yue.InterfaceC5922) r3
            Yue.ۥۡۥۤۨ r3 = r3.getName()
            goto L21
        L1b:
            Yue.ۥ۠ۡ r3 = (Yue.InterfaceC2155) r3
            Yue.ۥۡۥۤۨ r3 = r3.getName()
        L21:
            Yue.ۥۡۥۤۨ r0 = r2.f13901
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L2b
            r3 = 1
            return r3
        L2b:
            return r1
    }
}
