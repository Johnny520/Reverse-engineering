package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۢ۠۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4361 extends Yue.AbstractC0733 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public Yue.C4996 f13902;

    public AbstractC4361() {
            r0 = this;
            r0.<init>()
            return
    }

    public AbstractC4361(Yue.C4996 r1) {
            r0 = this;
            r0.<init>()
            r0.f13902 = r1
            return
    }

    public AbstractC4361(java.lang.String r2) {
            r1 = this;
            r1.<init>()
            Yue.ۥۡۥۤۨ r0 = new Yue.ۥۡۥۤۨ
            r0.<init>(r2)
            r1.f13902 = r0
            return
    }

    public AbstractC4361(java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            r1 = this;
            r1.<init>()
            Yue.ۥۡۥۤۨ r0 = new Yue.ۥۡۥۤۨ
            r0.<init>(r3, r4, r2)
            r1.f13902 = r0
            return
    }

    public Yue.C4996 getName() {
            r1 = this;
            Yue.ۥۡۥۤۨ r0 = r1.f13902
            return r0
    }

    @Override // Yue.AbstractC0733
    /* JADX INFO: renamed from: ۥ۟۟ۤۧ */
    public abstract void mo4548(java.io.Writer r1) throws java.io.IOException, Yue.C7158;

    /* JADX INFO: renamed from: ۥ۟۟ۥۦ, reason: contains not printable characters */
    public java.lang.String m17188() {
            r4 = this;
            Yue.ۥۡۥۤۨ r0 = r4.f13902
            java.lang.String r0 = r0.m19421()
            java.lang.String r1 = ""
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L15
            Yue.ۥۡۥۤۨ r0 = r4.f13902
            java.lang.String r0 = r0.m19420()
            return r0
        L15:
            Yue.ۥۡۥۤۨ r0 = r4.f13902
            java.lang.String r0 = r0.m19422()
            java.lang.String r2 = "']:"
            java.lang.String r3 = "['"
            if (r0 == 0) goto L5d
            Yue.ۥۡۥۤۨ r0 = r4.f13902
            java.lang.String r0 = r0.m19422()
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L5d
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            r0.append(r3)
            Yue.ۥۡۥۤۨ r1 = r4.f13902
            java.lang.String r1 = r1.m19421()
            r0.append(r1)
            r0.append(r2)
            Yue.ۥۡۥۤۨ r1 = r4.f13902
            java.lang.String r1 = r1.m19422()
            r0.append(r1)
            java.lang.String r1 = ":"
            r0.append(r1)
            Yue.ۥۡۥۤۨ r1 = r4.f13902
            java.lang.String r1 = r1.m19420()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L5d:
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            r0.append(r3)
            Yue.ۥۡۥۤۨ r1 = r4.f13902
            java.lang.String r1 = r1.m19421()
            r0.append(r1)
            r0.append(r2)
            Yue.ۥۡۥۤۨ r1 = r4.f13902
            java.lang.String r1 = r1.m19420()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۧ, reason: contains not printable characters */
    public void m17189(Yue.C4996 r1) {
            r0 = this;
            r0.f13902 = r1
            return
    }
}
