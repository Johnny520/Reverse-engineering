package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠۟ۧۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C1953 extends Yue.AbstractC3584 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static final java.lang.String f6117 = "PUBLIC";

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static final java.lang.String f6118 = "SYSTEM";

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static final java.lang.String f6119 = "name";

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static final java.lang.String f6120 = "pubSysKey";

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static final java.lang.String f6121 = "publicId";

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static final java.lang.String f6122 = "systemId";

    public C1953(java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            r1 = this;
            r1.<init>()
            Yue.C6657.m25635(r2)
            Yue.C6657.m25635(r3)
            Yue.C6657.m25635(r4)
            java.lang.String r0 = "name"
            r1.mo9792(r0, r2)
            java.lang.String r2 = "publicId"
            r1.mo9792(r2, r3)
            java.lang.String r2 = "systemId"
            r1.mo9792(r2, r4)
            r1.m9013()
            return
    }

    @Override // Yue.AbstractC4398
    /* JADX INFO: renamed from: ۥ۟۟ۢۧ */
    public java.lang.String mo5130() {
            r1 = this;
            java.lang.String r0 = "#doctype"
            return r0
    }

    @Override // Yue.AbstractC4398
    /* JADX INFO: renamed from: ۥۣۣ۟۟ */
    public void mo5131(java.lang.Appendable r4, int r5, Yue.C1948.C1949 r6) throws java.io.IOException {
            r3 = this;
            int r5 = r3.f13959
            if (r5 <= 0) goto Lf
            boolean r5 = r6.m8981()
            if (r5 == 0) goto Lf
            r5 = 10
            r4.append(r5)
        Lf:
            Yue.ۥ۠۟ۧۥ$ۥ$ۥ r5 = r6.m8982()
            Yue.ۥ۠۟ۧۥ$ۥ$ۥ r6 = Yue.C1948.C1949.EnumC1950.f6108
            java.lang.String r0 = "systemId"
            java.lang.String r1 = "publicId"
            if (r5 != r6) goto L2d
            boolean r5 = r3.m9008(r1)
            if (r5 != 0) goto L2d
            boolean r5 = r3.m9008(r0)
            if (r5 != 0) goto L2d
            java.lang.String r5 = "<!doctype"
            r4.append(r5)
            goto L32
        L2d:
            java.lang.String r5 = "<!DOCTYPE"
            r4.append(r5)
        L32:
            java.lang.String r5 = "name"
            boolean r6 = r3.m9008(r5)
            java.lang.String r2 = " "
            if (r6 == 0) goto L47
            java.lang.Appendable r6 = r4.append(r2)
            java.lang.String r5 = r3.mo14513(r5)
            r6.append(r5)
        L47:
            java.lang.String r5 = "pubSysKey"
            boolean r6 = r3.m9008(r5)
            if (r6 == 0) goto L5a
            java.lang.Appendable r6 = r4.append(r2)
            java.lang.String r5 = r3.mo14513(r5)
            r6.append(r5)
        L5a:
            boolean r5 = r3.m9008(r1)
            r6 = 34
            java.lang.String r2 = " \""
            if (r5 == 0) goto L73
            java.lang.Appendable r5 = r4.append(r2)
            java.lang.String r1 = r3.mo14513(r1)
            java.lang.Appendable r5 = r5.append(r1)
            r5.append(r6)
        L73:
            boolean r5 = r3.m9008(r0)
            if (r5 == 0) goto L88
            java.lang.Appendable r5 = r4.append(r2)
            java.lang.String r0 = r3.mo14513(r0)
            java.lang.Appendable r5 = r5.append(r0)
            r5.append(r6)
        L88:
            r5 = 62
            r4.append(r5)
            return
    }

    @Override // Yue.AbstractC4398
    /* JADX INFO: renamed from: ۥۣ۟۟ۤ */
    public void mo5132(java.lang.Appendable r1, int r2, Yue.C1948.C1949 r3) {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦ۠, reason: contains not printable characters */
    public final boolean m9008(java.lang.String r1) {
            r0 = this;
            java.lang.String r1 = r0.mo14513(r1)
            boolean r1 = Yue.C5973.m22118(r1)
            r1 = r1 ^ 1
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۡ, reason: contains not printable characters */
    public java.lang.String m9009() {
            r1 = this;
            java.lang.String r0 = "name"
            java.lang.String r0 = r1.mo14513(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۢ, reason: contains not printable characters */
    public java.lang.String m9010() {
            r1 = this;
            java.lang.String r0 = "publicId"
            java.lang.String r0 = r1.mo14513(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۣ, reason: contains not printable characters */
    public void m9011(java.lang.String r2) {
            r1 = this;
            if (r2 == 0) goto L7
            java.lang.String r0 = "pubSysKey"
            r1.mo9792(r0, r2)
        L7:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۤ, reason: contains not printable characters */
    public java.lang.String m9012() {
            r1 = this;
            java.lang.String r0 = "systemId"
            java.lang.String r0 = r1.mo14513(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۥ, reason: contains not printable characters */
    public final void m9013() {
            r2 = this;
            java.lang.String r0 = "publicId"
            boolean r0 = r2.m9008(r0)
            java.lang.String r1 = "pubSysKey"
            if (r0 == 0) goto L10
            java.lang.String r0 = "PUBLIC"
            r2.mo9792(r1, r0)
            goto L1d
        L10:
            java.lang.String r0 = "systemId"
            boolean r0 = r2.m9008(r0)
            if (r0 == 0) goto L1d
            java.lang.String r0 = "SYSTEM"
            r2.mo9792(r1, r0)
        L1d:
            return
    }
}
