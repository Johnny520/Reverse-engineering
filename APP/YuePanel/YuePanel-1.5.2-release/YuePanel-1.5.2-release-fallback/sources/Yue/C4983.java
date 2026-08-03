package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۥۣۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C4983 implements Yue.InterfaceC3193 {

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final java.util.regex.Pattern f15846 = null;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final java.util.regex.Pattern f15847 = null;

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final java.lang.String f15848;

    static {
            java.lang.String r0 = " "
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            Yue.C4983.f15846 = r0
            java.lang.String r0 = ","
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            Yue.C4983.f15847 = r0
            return
    }

    public C4983(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto L8
            r0.f15848 = r1
            return
        L8:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>()
            throw r1
    }

    public boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L4
            r3 = 1
            return r3
        L4:
            if (r3 == 0) goto L1c
            java.lang.Class r0 = r2.getClass()
            java.lang.Class r1 = r3.getClass()
            if (r0 == r1) goto L11
            goto L1c
        L11:
            Yue.ۥۡۥۣۨ r3 = (Yue.C4983) r3
            java.lang.String r0 = r2.f15848
            java.lang.String r3 = r3.f15848
            boolean r3 = r0.equals(r3)
            return r3
        L1c:
            r3 = 0
            return r3
    }

    public int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.f15848
            int r0 = r0.hashCode()
            return r0
    }

    @Override // Yue.InterfaceC3193
    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.mo13602()
            return r0
    }

    @Override // Yue.InterfaceC3193
    /* JADX INFO: renamed from: ۥ */
    public Yue.InterfaceC3193 mo13601() {
            r2 = this;
            Yue.ۥۡۥۣۨ r0 = new Yue.ۥۡۥۣۨ
            java.lang.String r1 = r2.mo13602()
            r0.<init>(r1)
            return r0
    }

    @Override // Yue.InterfaceC3193
    /* JADX INFO: renamed from: ۥ۟ */
    public java.lang.String mo13602() {
            r1 = this;
            java.lang.String r0 = r1.f15848
            return r0
    }

    @Override // Yue.InterfaceC3193
    /* JADX INFO: renamed from: ۥ۟۟ */
    public boolean mo13603(java.lang.String r7) {
            r6 = this;
            java.lang.String r0 = r6.f15848
            java.lang.String r1 = ""
            boolean r0 = r1.equals(r0)
            r2 = 1
            if (r0 == 0) goto Lc
            return r2
        Lc:
            java.util.regex.Pattern r0 = Yue.C4983.f15846
            java.util.regex.Matcher r7 = r0.matcher(r7)
            java.lang.String r7 = r7.replaceAll(r1)
            java.util.regex.Pattern r0 = Yue.C4983.f15847
            java.lang.String[] r7 = r0.split(r7)
            int r0 = r7.length
            r1 = 0
            r3 = r1
        L1f:
            if (r3 >= r0) goto L2f
            r4 = r7[r3]
            java.lang.String r5 = r6.f15848
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L2c
            return r2
        L2c:
            int r3 = r3 + 1
            goto L1f
        L2f:
            return r1
    }
}
