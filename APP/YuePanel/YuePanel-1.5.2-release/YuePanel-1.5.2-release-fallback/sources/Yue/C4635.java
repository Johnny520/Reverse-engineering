package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۣۡۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4635 implements Yue.InterfaceC4636<java.lang.Float> {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final float f14784;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final float f14785;

    public C4635(float r1, float r2) {
            r0 = this;
            r0.<init>()
            r0.f14784 = r1
            r0.f14785 = r2
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    private final boolean m18458(float r1, float r2) {
            r0 = this;
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 > 0) goto L6
            r1 = 1
            goto L7
        L6:
            r1 = 0
        L7:
            return r1
    }

    public boolean equals(@Yue.InterfaceC4543 java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof Yue.C4635
            if (r0 == 0) goto L27
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L13
            r0 = r3
            Yue.ۥۣۣۡۤ r0 = (Yue.C4635) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L25
        L13:
            float r0 = r2.f14784
            Yue.ۥۣۣۡۤ r3 = (Yue.C4635) r3
            float r1 = r3.f14784
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L27
            float r0 = r2.f14785
            float r3 = r3.f14785
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 != 0) goto L27
        L25:
            r3 = 1
            goto L28
        L27:
            r3 = 0
        L28:
            return r3
    }

    public int hashCode() {
            r2 = this;
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L8
            r0 = -1
            goto L17
        L8:
            float r0 = r2.f14784
            int r0 = java.lang.Float.hashCode(r0)
            int r0 = r0 * 31
            float r1 = r2.f14785
            int r1 = java.lang.Float.hashCode(r1)
            int r0 = r0 + r1
        L17:
            return r0
    }

    @Override // Yue.InterfaceC4636
    public boolean isEmpty() {
            r2 = this;
            float r0 = r2.f14784
            float r1 = r2.f14785
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
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
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            float r1 = r2.f14784
            r0.append(r1)
            java.lang.String r1 = "..<"
            r0.append(r1)
            float r1 = r2.f14785
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // Yue.InterfaceC4636
    /* JADX INFO: renamed from: ۥ */
    public /* bridge */ /* synthetic */ boolean mo5768(java.lang.Comparable r1) {
            r0 = this;
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            boolean r1 = r0.m18459(r1)
            return r1
    }

    @Override // Yue.InterfaceC4636
    /* JADX INFO: renamed from: ۥ۟ */
    public /* bridge */ /* synthetic */ java.lang.Comparable mo5769() {
            r1 = this;
            java.lang.Float r0 = r1.m18461()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public boolean m18459(float r2) {
            r1 = this;
            float r0 = r1.f14784
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 < 0) goto Le
            float r0 = r1.f14785
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 >= 0) goto Le
            r2 = 1
            goto Lf
        Le:
            r2 = 0
        Lf:
            return r2
    }

    @Override // Yue.InterfaceC4636
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public /* bridge */ /* synthetic */ java.lang.Comparable mo5770() {
            r1 = this;
            java.lang.Float r0 = r1.m18460()
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public java.lang.Float m18460() {
            r1 = this;
            float r0 = r1.f14785
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public java.lang.Float m18461() {
            r1 = this;
            float r0 = r1.f14784
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            return r0
    }
}
