package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۡۥۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5792(version = "1.1")
public final class C4664 implements Yue.InterfaceC1144 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.lang.Class<?> f14836;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.lang.String f14837;

    public C4664(@Yue.InterfaceC4418 java.lang.Class<?> r2, @Yue.InterfaceC4418 java.lang.String r3) {
            r1 = this;
            java.lang.String r0 = "jClass"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "moduleName"
            Yue.C3329.m13906(r3, r0)
            r1.<init>()
            r1.f14836 = r2
            r1.f14837 = r3
            return
    }

    public boolean equals(@Yue.InterfaceC4543 java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof Yue.C4664
            if (r0 == 0) goto L16
            java.lang.Class r0 = r1.mo6000()
            Yue.ۥۣۡۥۤ r2 = (Yue.C4664) r2
            java.lang.Class r2 = r2.mo6000()
            boolean r2 = Yue.C3329.m13897(r0, r2)
            if (r2 == 0) goto L16
            r2 = 1
            goto L17
        L16:
            r2 = 0
        L17:
            return r2
    }

    public int hashCode() {
            r1 = this;
            java.lang.Class r0 = r1.mo6000()
            int r0 = r0.hashCode()
            return r0
    }

    @Yue.InterfaceC4418
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r2.mo6000()
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.String r1 = " (Kotlin reflection is not available)"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // Yue.InterfaceC3440
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ */
    public java.util.Collection<Yue.InterfaceC3433<?>> mo6031() {
            r1 = this;
            Yue.ۥ۠ۦۧۧ r0 = new Yue.ۥ۠ۦۧۧ
            r0.<init>()
            throw r0
    }

    @Override // Yue.InterfaceC1144
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۠ */
    public java.lang.Class<?> mo6000() {
            r1 = this;
            java.lang.Class<?> r0 = r1.f14836
            return r0
    }
}
