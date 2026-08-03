package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۦۣ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C7165 extends Yue.AbstractC3584 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public final boolean f24743;

    public C7165(java.lang.String r1, boolean r2) {
            r0 = this;
            r0.<init>()
            Yue.C6657.m25635(r1)
            r0.f11394 = r1
            r0.f24743 = r2
            return
    }

    @Override // Yue.AbstractC4398
    public /* bridge */ /* synthetic */ java.lang.Object clone() throws java.lang.CloneNotSupportedException {
            r1 = this;
            Yue.ۥۢۦۣ r0 = r1.m27611()
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
            Yue.ۥۢۦۣ r0 = r1.m27611()
            return r0
    }

    @Override // Yue.AbstractC4398
    /* JADX INFO: renamed from: ۥ۟۟ۢۧ */
    public java.lang.String mo5130() {
            r1 = this;
            java.lang.String r0 = "#declaration"
            return r0
    }

    @Override // Yue.AbstractC4398
    /* JADX INFO: renamed from: ۥۣۣ۟۟ */
    public void mo5131(java.lang.Appendable r4, int r5, Yue.C1948.C1949 r6) throws java.io.IOException {
            r3 = this;
            java.lang.String r5 = "<"
            java.lang.Appendable r5 = r4.append(r5)
            boolean r0 = r3.f24743
            java.lang.String r1 = "?"
            java.lang.String r2 = "!"
            if (r0 == 0) goto L10
            r0 = r2
            goto L11
        L10:
            r0 = r1
        L11:
            java.lang.Appendable r5 = r5.append(r0)
            java.lang.String r0 = r3.m14515()
            r5.append(r0)
            r3.m27613(r4, r6)
            boolean r5 = r3.f24743
            if (r5 == 0) goto L24
            r1 = r2
        L24:
            java.lang.Appendable r4 = r4.append(r1)
            java.lang.String r5 = ">"
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
    public Yue.C7165 m27611() {
            r1 = this;
            Yue.ۥۣۡۢۤ r0 = super.mo5129()
            Yue.ۥۢۦۣ r0 = (Yue.C7165) r0
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۡ, reason: contains not printable characters */
    public java.lang.String m27612() {
            r2 = this;
            java.lang.StringBuilder r0 = Yue.C5973.m22113()
            Yue.ۥ۠۟ۧۥ$ۥ r1 = new Yue.ۥ۠۟ۧۥ$ۥ     // Catch: java.io.IOException -> L15
            r1.<init>()     // Catch: java.io.IOException -> L15
            r2.m27613(r0, r1)     // Catch: java.io.IOException -> L15
            java.lang.String r0 = Yue.C5973.m22128(r0)
            java.lang.String r0 = r0.trim()
            return r0
        L15:
            r0 = move-exception
            Yue.ۥۡۨۢۨ r1 = new Yue.ۥۡۨۢۨ
            r1.<init>(r0)
            throw r1
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۢ, reason: contains not printable characters */
    public final void m27613(java.lang.Appendable r11, Yue.C1948.C1949 r12) throws java.io.IOException {
            r10 = this;
            Yue.ۥ۟ۢ۠ۤ r0 = r10.mo9793()
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L48
            java.lang.Object r1 = r0.next()
            Yue.ۥ۟ۢ۠ۢ r1 = (Yue.C0646) r1
            java.lang.String r2 = r1.m4219()
            java.lang.String r4 = r1.m4220()
            java.lang.String r1 = r10.mo5130()
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L8
            r1 = 32
            r11.append(r1)
            r11.append(r2)
            boolean r1 = r4.isEmpty()
            if (r1 != 0) goto L8
            java.lang.String r1 = "=\""
            r11.append(r1)
            r8 = 0
            r9 = 0
            r6 = 1
            r7 = 0
            r3 = r11
            r5 = r12
            Yue.C2157.m10120(r3, r4, r5, r6, r7, r8, r9)
            r1 = 34
            r11.append(r1)
            goto L8
        L48:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۣ, reason: contains not printable characters */
    public java.lang.String m27614() {
            r1 = this;
            java.lang.String r0 = r1.m14515()
            return r0
    }
}
