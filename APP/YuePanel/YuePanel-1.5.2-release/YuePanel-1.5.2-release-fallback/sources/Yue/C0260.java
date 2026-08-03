package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟۠۟۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5792(version = "1.4")
public class C0260 implements Yue.InterfaceC2850, java.io.Serializable {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final java.lang.Object f505;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final java.lang.Class f506;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final java.lang.String f507;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final java.lang.String f508;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public final boolean f509;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public final int f510;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public final int f511;

    public C0260(int r8, java.lang.Class r9, java.lang.String r10, java.lang.String r11, int r12) {
            r7 = this;
            java.lang.Object r2 = Yue.AbstractC0908.NO_RECEIVER
            r0 = r7
            r1 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    public C0260(int r1, java.lang.Object r2, java.lang.Class r3, java.lang.String r4, java.lang.String r5, int r6) {
            r0 = this;
            r0.<init>()
            r0.f505 = r2
            r0.f506 = r3
            r0.f507 = r4
            r0.f508 = r5
            r2 = r6 & 1
            r3 = 1
            if (r2 != r3) goto L12
            r2 = r3
            goto L13
        L12:
            r2 = 0
        L13:
            r0.f509 = r2
            r0.f510 = r1
            int r1 = r6 >> 1
            r0.f511 = r1
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof Yue.C0260
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            Yue.ۥ۟۠۟۟ r5 = (Yue.C0260) r5
            boolean r1 = r4.f509
            boolean r3 = r5.f509
            if (r1 != r3) goto L47
            int r1 = r4.f510
            int r3 = r5.f510
            if (r1 != r3) goto L47
            int r1 = r4.f511
            int r3 = r5.f511
            if (r1 != r3) goto L47
            java.lang.Object r1 = r4.f505
            java.lang.Object r3 = r5.f505
            boolean r1 = Yue.C3329.m13897(r1, r3)
            if (r1 == 0) goto L47
            java.lang.Class r1 = r4.f506
            java.lang.Class r3 = r5.f506
            boolean r1 = Yue.C3329.m13897(r1, r3)
            if (r1 == 0) goto L47
            java.lang.String r1 = r4.f507
            java.lang.String r3 = r5.f507
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L47
            java.lang.String r1 = r4.f508
            java.lang.String r5 = r5.f508
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L47
            goto L48
        L47:
            r0 = r2
        L48:
            return r0
    }

    @Override // Yue.InterfaceC2850
    public int getArity() {
            r1 = this;
            int r0 = r1.f510
            return r0
    }

    public int hashCode() {
            r3 = this;
            java.lang.Object r0 = r3.f505
            r1 = 0
            if (r0 == 0) goto La
            int r0 = r0.hashCode()
            goto Lb
        La:
            r0 = r1
        Lb:
            int r0 = r0 * 31
            java.lang.Class r2 = r3.f506
            if (r2 == 0) goto L15
            int r1 = r2.hashCode()
        L15:
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r3.f507
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r3.f508
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            boolean r1 = r3.f509
            if (r1 == 0) goto L31
            r1 = 1231(0x4cf, float:1.725E-42)
            goto L33
        L31:
            r1 = 1237(0x4d5, float:1.733E-42)
        L33:
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r3.f510
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r3.f511
            int r0 = r0 + r1
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = Yue.C5277.m19907(r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public Yue.InterfaceC3440 m1211() {
            r2 = this;
            java.lang.Class r0 = r2.f506
            if (r0 != 0) goto L6
            r0 = 0
            goto L13
        L6:
            boolean r1 = r2.f509
            if (r1 == 0) goto Lf
            Yue.ۥ۠ۦۢۦ r0 = Yue.C5277.m19891(r0)
            goto L13
        Lf:
            Yue.ۥ۠ۦۢۢ r0 = Yue.C5277.m19888(r0)
        L13:
            return r0
    }
}
