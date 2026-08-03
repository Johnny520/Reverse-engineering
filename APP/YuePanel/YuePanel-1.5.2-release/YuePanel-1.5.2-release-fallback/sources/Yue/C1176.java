package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۥ۟۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C1176 implements Yue.InterfaceC1177<java.lang.Float> {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final float f3664;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final float f3665;

    public C1176(float r1, float r2) {
            r0 = this;
            r0.<init>()
            r0.f3664 = r1
            r0.f3665 = r2
            return
    }

    public boolean equals(@Yue.InterfaceC4543 java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof Yue.C1176
            if (r0 == 0) goto L27
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L13
            r0 = r3
            Yue.ۥ۟ۥ۟۟ r0 = (Yue.C1176) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L25
        L13:
            float r0 = r2.f3664
            Yue.ۥ۟ۥ۟۟ r3 = (Yue.C1176) r3
            float r1 = r3.f3664
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L27
            float r0 = r2.f3665
            float r3 = r3.f3665
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
            float r0 = r2.f3664
            int r0 = java.lang.Float.hashCode(r0)
            int r0 = r0 * 31
            float r1 = r2.f3665
            int r1 = java.lang.Float.hashCode(r1)
            int r0 = r0 + r1
        L17:
            return r0
    }

    @Override // Yue.InterfaceC1177, Yue.InterfaceC1179, Yue.InterfaceC4636
    public boolean isEmpty() {
            r2 = this;
            float r0 = r2.f3664
            float r1 = r2.f3665
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto La
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
            float r1 = r2.f3664
            r0.append(r1)
            java.lang.String r1 = ".."
            r0.append(r1)
            float r1 = r2.f3665
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // Yue.InterfaceC1177, Yue.InterfaceC1179, Yue.InterfaceC4636
    /* JADX INFO: renamed from: ۥ */
    public /* bridge */ /* synthetic */ boolean mo5768(java.lang.Comparable r1) {
            r0 = this;
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            boolean r1 = r0.m6126(r1)
            return r1
    }

    @Override // Yue.InterfaceC1179, Yue.InterfaceC4636
    /* JADX INFO: renamed from: ۥ۟ */
    public /* bridge */ /* synthetic */ java.lang.Comparable mo5769() {
            r1 = this;
            java.lang.Float r0 = r1.m6128()
            return r0
    }

    @Override // Yue.InterfaceC1177
    /* JADX INFO: renamed from: ۥ۟۟ */
    public /* bridge */ /* synthetic */ boolean mo6121(java.lang.Comparable r1, java.lang.Comparable r2) {
            r0 = this;
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            boolean r1 = r0.m6129(r1, r2)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public boolean m6126(float r2) {
            r1 = this;
            float r0 = r1.f3664
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 < 0) goto Le
            float r0 = r1.f3665
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 > 0) goto Le
            r2 = 1
            goto Lf
        Le:
            r2 = 0
        Lf:
            return r2
    }

    @Override // Yue.InterfaceC1179
    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public /* bridge */ /* synthetic */ java.lang.Comparable mo5771() {
            r1 = this;
            java.lang.Float r0 = r1.m6127()
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public java.lang.Float m6127() {
            r1 = this;
            float r0 = r1.f3665
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public java.lang.Float m6128() {
            r1 = this;
            float r0 = r1.f3664
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public boolean m6129(float r1, float r2) {
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
}
