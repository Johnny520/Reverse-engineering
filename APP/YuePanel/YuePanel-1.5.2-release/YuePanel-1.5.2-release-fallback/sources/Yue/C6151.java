package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۡ۠ۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C6151 extends Yue.AbstractC3584 {
    public C6151(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.f11394 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۡ, reason: contains not printable characters */
    public static Yue.C6151 m23010(java.lang.String r1) {
            java.lang.String r1 = Yue.C2157.m10125(r1)
            Yue.ۥۢۡ۠ۦ r0 = new Yue.ۥۢۡ۠ۦ
            r0.<init>(r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۤ, reason: contains not printable characters */
    public static boolean m23011(java.lang.StringBuilder r2) {
            int r0 = r2.length()
            if (r0 == 0) goto L15
            int r0 = r2.length()
            r1 = 1
            int r0 = r0 - r1
            char r2 = r2.charAt(r0)
            r0 = 32
            if (r2 != r0) goto L15
            goto L16
        L15:
            r1 = 0
        L16:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۥ, reason: contains not printable characters */
    public static java.lang.String m23012(java.lang.String r0) {
            java.lang.String r0 = Yue.C5973.m22125(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۧ, reason: contains not printable characters */
    public static java.lang.String m23013(java.lang.String r2) {
            java.lang.String r0 = "^\\s+"
            java.lang.String r1 = ""
            java.lang.String r2 = r2.replaceFirst(r0, r1)
            return r2
    }

    @Override // Yue.AbstractC4398
    public /* bridge */ /* synthetic */ java.lang.Object clone() throws java.lang.CloneNotSupportedException {
            r1 = this;
            Yue.ۥۢۡ۠ۦ r0 = r1.mo5133()
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
            Yue.ۥۢۡ۠ۦ r0 = r1.mo5133()
            return r0
    }

    @Override // Yue.AbstractC4398
    /* JADX INFO: renamed from: ۥ۟۟ۢۧ */
    public java.lang.String mo5130() {
            r1 = this;
            java.lang.String r0 = "#text"
            return r0
    }

    @Override // Yue.AbstractC4398
    /* JADX INFO: renamed from: ۥۣۣ۟۟ */
    public void mo5131(java.lang.Appendable r13, int r14, Yue.C1948.C1949 r15) throws java.io.IOException {
            r12 = this;
            boolean r0 = r15.m8981()
            Yue.ۥۣۡۢۤ r1 = r12.f13958
            boolean r2 = r1 instanceof Yue.C2104
            if (r2 == 0) goto Le
            r2 = r1
            Yue.ۥ۠۠ۥۥ r2 = (Yue.C2104) r2
            goto Lf
        Le:
            r2 = 0
        Lf:
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L1b
            boolean r0 = Yue.C2104.m9788(r1)
            if (r0 != 0) goto L1b
            r9 = r3
            goto L1c
        L1b:
            r9 = r4
        L1c:
            if (r2 == 0) goto L34
            Yue.ۥۢ۠ۨۡ r0 = r2.m9921()
            boolean r0 = r0.m22902()
            if (r0 != 0) goto L32
            Yue.ۥۢ۠ۨۡ r0 = r2.m9921()
            boolean r0 = r0.m22900()
            if (r0 == 0) goto L34
        L32:
            r0 = r3
            goto L35
        L34:
            r0 = r4
        L35:
            if (r9 == 0) goto Lbd
            if (r0 == 0) goto L3d
            int r1 = r12.f13959
            if (r1 == 0) goto L43
        L3d:
            Yue.ۥۣۡۢۤ r1 = r12.f13958
            boolean r1 = r1 instanceof Yue.C1948
            if (r1 == 0) goto L45
        L43:
            r1 = r3
            goto L46
        L45:
            r1 = r4
        L46:
            if (r0 == 0) goto L4f
            Yue.ۥۣۡۢۤ r0 = r12.m17283()
            if (r0 != 0) goto L4f
            goto L50
        L4f:
            r3 = r4
        L50:
            Yue.ۥۣۡۢۤ r0 = r12.m17283()
            Yue.ۥۣۡۢۤ r4 = r12.m17291()
            boolean r5 = r12.m23015()
            boolean r6 = r0 instanceof Yue.C2104
            java.lang.String r7 = "br"
            if (r6 == 0) goto L6b
            r6 = r0
            Yue.ۥ۠۠ۥۥ r6 = (Yue.C2104) r6
            boolean r6 = r6.m9918(r15)
            if (r6 != 0) goto L8a
        L6b:
            boolean r6 = r0 instanceof Yue.C6151
            if (r6 == 0) goto L77
            Yue.ۥۢۡ۠ۦ r0 = (Yue.C6151) r0
            boolean r0 = r0.m23015()
            if (r0 != 0) goto L8a
        L77:
            boolean r0 = r4 instanceof Yue.C2104
            if (r0 == 0) goto L8d
            r0 = r4
            Yue.ۥ۠۠ۥۥ r0 = (Yue.C2104) r0
            boolean r0 = r0.m9889()
            if (r0 != 0) goto L8a
            boolean r0 = r4.m17282(r7)
            if (r0 == 0) goto L8d
        L8a:
            if (r5 == 0) goto L8d
            return
        L8d:
            if (r4 != 0) goto L9d
            if (r2 == 0) goto L9d
            Yue.ۥۢ۠ۨۡ r0 = r2.m9921()
            boolean r0 = r0.m22900()
            if (r0 == 0) goto L9d
            if (r5 == 0) goto Lb7
        L9d:
            boolean r0 = r15.m8978()
            if (r0 == 0) goto Laf
            java.util.List r0 = r12.m17301()
            int r0 = r0.size()
            if (r0 <= 0) goto Laf
            if (r5 == 0) goto Lb7
        Laf:
            if (r4 == 0) goto Lba
            boolean r0 = r4.m17282(r7)
            if (r0 == 0) goto Lba
        Lb7:
            r12.m17279(r13, r14, r15)
        Lba:
            r10 = r1
            r11 = r3
            goto Lbf
        Lbd:
            r10 = r4
            r11 = r10
        Lbf:
            java.lang.String r6 = r12.m14515()
            r8 = 0
            r5 = r13
            r7 = r15
            Yue.C2157.m10120(r5, r6, r7, r8, r9, r10, r11)
            return
    }

    @Override // Yue.AbstractC4398
    /* JADX INFO: renamed from: ۥۣ۟۟ۤ */
    public void mo5132(java.lang.Appendable r1, int r2, Yue.C1948.C1949 r3) throws java.io.IOException {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦ۠ */
    public Yue.C6151 mo5133() {
            r1 = this;
            Yue.ۥۣۡۢۤ r0 = super.mo5129()
            Yue.ۥۢۡ۠ۦ r0 = (Yue.C6151) r0
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۢ, reason: contains not printable characters */
    public java.lang.String m23014() {
            r1 = this;
            java.lang.String r0 = r1.m14515()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۣ, reason: contains not printable characters */
    public boolean m23015() {
            r1 = this;
            java.lang.String r0 = r1.m14515()
            boolean r0 = Yue.C5973.m22118(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۦ, reason: contains not printable characters */
    public Yue.C6151 m23016(int r6) {
            r5 = this;
            java.lang.String r0 = r5.m14515()
            r1 = 0
            r2 = 1
            if (r6 < 0) goto La
            r3 = r2
            goto Lb
        La:
            r3 = r1
        Lb:
            java.lang.String r4 = "Split offset must be not be negative"
            Yue.C6657.m25629(r3, r4)
            int r3 = r0.length()
            if (r6 >= r3) goto L18
            r3 = r2
            goto L19
        L18:
            r3 = r1
        L19:
            java.lang.String r4 = "Split offset must not be greater than current text length"
            Yue.C6657.m25629(r3, r4)
            java.lang.String r3 = r0.substring(r1, r6)
            java.lang.String r6 = r0.substring(r6)
            r5.m23017(r3)
            Yue.ۥۢۡ۠ۦ r0 = new Yue.ۥۢۡ۠ۦ
            r0.<init>(r6)
            Yue.ۥۣۡۢۤ r6 = r5.f13958
            if (r6 == 0) goto L3e
            int r3 = r5.m17300()
            int r3 = r3 + r2
            Yue.ۥۣۡۢۤ[] r2 = new Yue.AbstractC4398[r2]
            r2[r1] = r0
            r6.m17267(r3, r2)
        L3e:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۨ, reason: contains not printable characters */
    public Yue.C6151 m23017(java.lang.String r1) {
            r0 = this;
            r0.m14516(r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧ */
    public java.lang.String mo5134() {
            r1 = this;
            java.lang.String r0 = r1.m23014()
            java.lang.String r0 = Yue.C5973.m22125(r0)
            return r0
    }
}
