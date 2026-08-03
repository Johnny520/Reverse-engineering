package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۨ۠ۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C1699 implements Yue.InterfaceC1716 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public java.lang.String f5335;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public java.lang.Object f5336;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public Yue.C1704 f5337;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public java.lang.String f5338;

    public C1699() {
            r0 = this;
            r0.<init>()
            return
    }

    public C1699(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.f5335 = r1
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof Yue.C1699
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            Yue.ۥ۟ۨ۠ۡ r5 = (Yue.C1699) r5
            java.lang.String r1 = r4.f5335
            if (r1 != 0) goto L15
            java.lang.String r1 = r5.f5335
            if (r1 == 0) goto L1e
            return r2
        L15:
            java.lang.String r3 = r5.f5335
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L1e
            return r2
        L1e:
            java.lang.Object r1 = r4.f5336
            if (r1 != 0) goto L27
            java.lang.Object r1 = r5.f5336
            if (r1 == 0) goto L30
            return r2
        L27:
            java.lang.Object r3 = r5.f5336
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L30
            return r2
        L30:
            Yue.ۥ۟ۨ۠ۦ r1 = r4.f5337
            if (r1 != 0) goto L39
            Yue.ۥ۟ۨ۠ۦ r1 = r5.f5337
            if (r1 == 0) goto L42
            return r2
        L39:
            Yue.ۥ۟ۨ۠ۦ r3 = r5.f5337
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L42
            return r2
        L42:
            java.lang.String r1 = r4.f5338
            if (r1 != 0) goto L4b
            java.lang.String r5 = r5.f5338
            if (r5 == 0) goto L54
            return r2
        L4b:
            java.lang.String r5 = r5.f5338
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L54
            return r2
        L54:
            return r0
    }

    @Override // Yue.InterfaceC1716
    /* JADX INFO: renamed from: ۥ */
    public void mo8116(java.io.PrintWriter r3) throws java.io.IOException {
            r2 = this;
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            java.lang.String r1 = r2.f5335
            r0.append(r1)
            java.lang.String r1 = " "
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.print(r0)
            java.lang.Object r0 = r2.f5336
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L20
            r3.print(r0)
            goto L33
        L20:
            boolean r1 = r0 instanceof Yue.C1708
            if (r1 == 0) goto L2a
            Yue.ۥ۟ۨۡ۟ r0 = (Yue.C1708) r0
            r0.mo8116(r3)
            goto L33
        L2a:
            boolean r1 = r0 instanceof Yue.C1715
            if (r1 == 0) goto L33
            Yue.ۥ۟ۨۡۦ r0 = (Yue.C1715) r0
            r0.mo8116(r3)
        L33:
            Yue.ۥ۟ۨ۠ۦ r0 = r2.f5337
            if (r0 == 0) goto L3a
            r0.mo8116(r3)
        L3a:
            java.lang.String r0 = r2.f5338
            if (r0 == 0) goto L4d
            java.lang.String r0 = " \""
            r3.print(r0)
            java.lang.String r0 = r2.f5338
            r3.print(r0)
            java.lang.String r0 = "\""
            r3.print(r0)
        L4d:
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public Yue.C1704 m8128() {
            r1 = this;
            Yue.ۥ۟ۨ۠ۦ r0 = r1.f5337
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public java.lang.String m8129() {
            r1 = this;
            java.lang.String r0 = r1.f5338
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public java.lang.String m8130() {
            r1 = this;
            java.lang.String r0 = r1.f5335
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public java.lang.Object m8131() {
            r1 = this;
            java.lang.Object r0 = r1.f5336
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public void m8132(Yue.C1704 r1) {
            r0 = this;
            r0.f5337 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public void m8133(java.lang.String r1) {
            r0 = this;
            r0.f5338 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public void m8134(java.lang.String r1) {
            r0 = this;
            r0.f5335 = r1
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public void m8135(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof java.lang.String
            if (r0 != 0) goto L15
            boolean r0 = r2 instanceof Yue.C1708
            if (r0 != 0) goto L15
            boolean r0 = r2 instanceof Yue.C1715
            if (r0 == 0) goto Ld
            goto L15
        Ld:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Must be String, DTDEnumeration or DTDNotationList"
            r2.<init>(r0)
            throw r2
        L15:
            r1.f5336 = r2
            return
    }
}
