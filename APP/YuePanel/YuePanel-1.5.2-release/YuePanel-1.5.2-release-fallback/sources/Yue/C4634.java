package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۣۣۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4634 implements Yue.InterfaceC4636<java.lang.Double> {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final double f14782;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final double f14783;

    public C4634(double r1, double r3) {
            r0 = this;
            r0.<init>()
            r0.f14782 = r1
            r0.f14783 = r3
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    private final boolean m18454(double r1, double r3) {
            r0 = this;
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 > 0) goto L6
            r1 = 1
            goto L7
        L6:
            r1 = 0
        L7:
            return r1
    }

    public boolean equals(@Yue.InterfaceC4543 java.lang.Object r5) {
            r4 = this;
            boolean r0 = r5 instanceof Yue.C4634
            if (r0 == 0) goto L27
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L13
            r0 = r5
            Yue.ۥۣۣۣۡ r0 = (Yue.C4634) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L25
        L13:
            double r0 = r4.f14782
            Yue.ۥۣۣۣۡ r5 = (Yue.C4634) r5
            double r2 = r5.f14782
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L27
            double r0 = r4.f14783
            double r2 = r5.f14783
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 != 0) goto L27
        L25:
            r5 = 1
            goto L28
        L27:
            r5 = 0
        L28:
            return r5
    }

    public int hashCode() {
            r3 = this;
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L8
            r0 = -1
            goto L17
        L8:
            double r0 = r3.f14782
            int r0 = java.lang.Double.hashCode(r0)
            int r0 = r0 * 31
            double r1 = r3.f14783
            int r1 = java.lang.Double.hashCode(r1)
            int r0 = r0 + r1
        L17:
            return r0
    }

    @Override // Yue.InterfaceC4636
    public boolean isEmpty() {
            r4 = this;
            double r0 = r4.f14782
            double r2 = r4.f14783
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    @Yue.InterfaceC4418
    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            double r1 = r3.f14782
            r0.append(r1)
            java.lang.String r1 = "..<"
            r0.append(r1)
            double r1 = r3.f14783
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // Yue.InterfaceC4636
    /* JADX INFO: renamed from: ۥ */
    public /* bridge */ /* synthetic */ boolean mo5768(java.lang.Comparable r3) {
            r2 = this;
            java.lang.Number r3 = (java.lang.Number) r3
            double r0 = r3.doubleValue()
            boolean r3 = r2.m18455(r0)
            return r3
    }

    @Override // Yue.InterfaceC4636
    /* JADX INFO: renamed from: ۥ۟ */
    public /* bridge */ /* synthetic */ java.lang.Comparable mo5769() {
            r1 = this;
            java.lang.Double r0 = r1.m18457()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public boolean m18455(double r3) {
            r2 = this;
            double r0 = r2.f14782
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 < 0) goto Le
            double r0 = r2.f14783
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 >= 0) goto Le
            r3 = 1
            goto Lf
        Le:
            r3 = 0
        Lf:
            return r3
    }

    @Override // Yue.InterfaceC4636
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public /* bridge */ /* synthetic */ java.lang.Comparable mo5770() {
            r1 = this;
            java.lang.Double r0 = r1.m18456()
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public java.lang.Double m18456() {
            r2 = this;
            double r0 = r2.f14783
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public java.lang.Double m18457() {
            r2 = this;
            double r0 = r2.f14782
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            return r0
    }
}
