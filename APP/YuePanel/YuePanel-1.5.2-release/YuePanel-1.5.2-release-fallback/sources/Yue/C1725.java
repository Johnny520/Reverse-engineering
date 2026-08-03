package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۨۢۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C1725 extends Yue.AbstractC3584 {
    public C1725(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.f11394 = r1
            return
    }

    @Override // Yue.AbstractC4398
    public /* bridge */ /* synthetic */ java.lang.Object clone() throws java.lang.CloneNotSupportedException {
            r1 = this;
            Yue.ۥ۟ۨۢۥ r0 = r1.m8225()
            return r0
    }

    @Override // Yue.AbstractC4398
    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.mo8936()
            return r0
    }

    @Override // Yue.AbstractC4398
    /* JADX INFO: renamed from: ۥ۟۟ۡ۟ */
    public /* bridge */ /* synthetic */ Yue.AbstractC4398 mo5129() {
            r1 = this;
            Yue.ۥ۟ۨۢۥ r0 = r1.m8225()
            return r0
    }

    @Override // Yue.AbstractC4398
    /* JADX INFO: renamed from: ۥ۟۟ۢۧ */
    public java.lang.String mo5130() {
            r1 = this;
            java.lang.String r0 = "#data"
            return r0
    }

    @Override // Yue.AbstractC4398
    /* JADX INFO: renamed from: ۥۣۣ۟۟ */
    public void mo5131(java.lang.Appendable r2, int r3, Yue.C1948.C1949 r4) throws java.io.IOException {
            r1 = this;
            java.lang.String r3 = r1.m8226()
            Yue.ۥ۠۟ۧۥ$ۥ$ۥ r4 = r4.m8982()
            Yue.ۥ۠۟ۧۥ$ۥ$ۥ r0 = Yue.C1948.C1949.EnumC1950.f6109
            if (r4 != r0) goto L52
            java.lang.String r4 = "<![CDATA["
            boolean r0 = r3.contains(r4)
            if (r0 != 0) goto L52
            java.lang.String r0 = "script"
            boolean r0 = r1.m17289(r0)
            if (r0 == 0) goto L2c
            java.lang.String r4 = "//<![CDATA[\n"
            java.lang.Appendable r2 = r2.append(r4)
            java.lang.Appendable r2 = r2.append(r3)
            java.lang.String r3 = "\n//]]>"
            r2.append(r3)
            goto L59
        L2c:
            java.lang.String r0 = "style"
            boolean r0 = r1.m17289(r0)
            if (r0 == 0) goto L44
            java.lang.String r4 = "/*<![CDATA[*/\n"
            java.lang.Appendable r2 = r2.append(r4)
            java.lang.Appendable r2 = r2.append(r3)
            java.lang.String r3 = "\n/*]]>*/"
            r2.append(r3)
            goto L59
        L44:
            java.lang.Appendable r2 = r2.append(r4)
            java.lang.Appendable r2 = r2.append(r3)
            java.lang.String r3 = "]]>"
            r2.append(r3)
            goto L59
        L52:
            java.lang.String r3 = r1.m8226()
            r2.append(r3)
        L59:
            return
    }

    @Override // Yue.AbstractC4398
    /* JADX INFO: renamed from: ۥۣ۟۟ۤ */
    public void mo5132(java.lang.Appendable r1, int r2, Yue.C1948.C1949 r3) {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦ۠, reason: contains not printable characters */
    public Yue.C1725 m8225() {
            r1 = this;
            Yue.ۥۣۡۢۤ r0 = super.mo5129()
            Yue.ۥ۟ۨۢۥ r0 = (Yue.C1725) r0
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۡ, reason: contains not printable characters */
    public java.lang.String m8226() {
            r1 = this;
            java.lang.String r0 = r1.m14515()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۢ, reason: contains not printable characters */
    public Yue.C1725 m8227(java.lang.String r1) {
            r0 = this;
            r0.m14516(r1)
            return r0
    }
}
