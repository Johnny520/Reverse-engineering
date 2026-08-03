package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۥۤۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C1274 extends Yue.AbstractC3584 {
    public C1274(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.f11394 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۤ, reason: contains not printable characters */
    public static boolean m6693(java.lang.String r2) {
            int r0 = r2.length()
            r1 = 1
            if (r0 <= r1) goto L18
            java.lang.String r0 = "!"
            boolean r0 = r2.startsWith(r0)
            if (r0 != 0) goto L19
            java.lang.String r0 = "?"
            boolean r2 = r2.startsWith(r0)
            if (r2 == 0) goto L18
            goto L19
        L18:
            r1 = 0
        L19:
            return r1
    }

    @Override // Yue.AbstractC4398
    public /* bridge */ /* synthetic */ java.lang.Object clone() throws java.lang.CloneNotSupportedException {
            r1 = this;
            Yue.ۥ۟ۥۤۤ r0 = r1.m6695()
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
            Yue.ۥ۟ۥۤۤ r0 = r1.m6695()
            return r0
    }

    @Override // Yue.AbstractC4398
    /* JADX INFO: renamed from: ۥ۟۟ۢۧ */
    public java.lang.String mo5130() {
            r1 = this;
            java.lang.String r0 = "#comment"
            return r0
    }

    @Override // Yue.AbstractC4398
    /* JADX INFO: renamed from: ۥۣۣ۟۟ */
    public void mo5131(java.lang.Appendable r3, int r4, Yue.C1948.C1949 r5) throws java.io.IOException {
            r2 = this;
            boolean r0 = r5.m8981()
            if (r0 == 0) goto L27
            boolean r0 = r2.m17280()
            if (r0 == 0) goto L1e
            Yue.ۥۣۡۢۤ r0 = r2.f13958
            boolean r1 = r0 instanceof Yue.C2104
            if (r1 == 0) goto L1e
            Yue.ۥ۠۠ۥۥ r0 = (Yue.C2104) r0
            Yue.ۥۢ۠ۨۡ r0 = r0.m9921()
            boolean r0 = r0.m22900()
            if (r0 != 0) goto L24
        L1e:
            boolean r0 = r5.m8978()
            if (r0 == 0) goto L27
        L24:
            r2.m17279(r3, r4, r5)
        L27:
            java.lang.String r4 = "<!--"
            java.lang.Appendable r3 = r3.append(r4)
            java.lang.String r4 = r2.m6696()
            java.lang.Appendable r3 = r3.append(r4)
            java.lang.String r4 = "-->"
            r3.append(r4)
            return
    }

    @Override // Yue.AbstractC4398
    /* JADX INFO: renamed from: ۥۣ۟۟ۤ */
    public void mo5132(java.lang.Appendable r1, int r2, Yue.C1948.C1949 r3) {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦ۠, reason: contains not printable characters */
    public Yue.C7165 m6694() {
            r5 = this;
            java.lang.String r0 = r5.m6696()
            int r1 = r0.length()
            r2 = 1
            int r1 = r1 - r2
            java.lang.String r1 = r0.substring(r2, r1)
            boolean r2 = m6693(r1)
            r3 = 0
            if (r2 == 0) goto L16
            return r3
        L16:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "<"
            r2.append(r4)
            r2.append(r1)
            java.lang.String r1 = ">"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            Yue.ۥۣۡۧۦ r2 = Yue.C4700.m18617()
            Yue.ۥۣۡۧۥ r4 = Yue.C4699.f14917
            Yue.ۥۣۡۧۦ r2 = r2.m18639(r4)
            java.lang.String r4 = r5.mo9794()
            Yue.ۥ۠۟ۧۥ r1 = r2.m18634(r1, r4)
            Yue.ۥ۠۠ۥۥ r2 = r1.m8941()
            int r2 = r2.m9832()
            if (r2 <= 0) goto L77
            Yue.ۥ۠۠ۥۥ r2 = r1.m8941()
            r3 = 0
            Yue.ۥ۠۠ۥۥ r2 = r2.m9829(r3)
            Yue.ۥۢۦۣ r3 = new Yue.ۥۢۦۣ
            Yue.ۥۣۡۧۦ r1 = Yue.C4405.m17317(r1)
            Yue.ۥۣۡۧۥ r1 = r1.m18638()
            java.lang.String r4 = r2.m9924()
            java.lang.String r1 = r1.m18614(r4)
            java.lang.String r4 = "!"
            boolean r0 = r0.startsWith(r4)
            r3.<init>(r1, r0)
            Yue.ۥ۟ۢ۠ۤ r0 = r3.mo9793()
            Yue.ۥ۟ۢ۠ۤ r1 = r2.mo9793()
            r0.m4273(r1)
        L77:
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۡ, reason: contains not printable characters */
    public Yue.C1274 m6695() {
            r1 = this;
            Yue.ۥۣۡۢۤ r0 = super.mo5129()
            Yue.ۥ۟ۥۤۤ r0 = (Yue.C1274) r0
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۢ, reason: contains not printable characters */
    public java.lang.String m6696() {
            r1 = this;
            java.lang.String r0 = r1.m14515()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۣ, reason: contains not printable characters */
    public boolean m6697() {
            r1 = this;
            java.lang.String r0 = r1.m6696()
            boolean r0 = m6693(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۥ, reason: contains not printable characters */
    public Yue.C1274 m6698(java.lang.String r1) {
            r0 = this;
            r0.m14516(r1)
            return r0
    }
}
