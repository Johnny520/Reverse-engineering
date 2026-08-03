package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۨۥۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C1773 implements Yue.InterfaceC3184 {
    public C1773() {
            r0 = this;
            r0.<init>()
            return
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 == r2) goto L11
            if (r2 == 0) goto Lf
            java.lang.Class r0 = r1.getClass()
            java.lang.Class r2 = r2.getClass()
            if (r0 != r2) goto Lf
            goto L11
        Lf:
            r2 = 0
            goto L12
        L11:
            r2 = 1
        L12:
            return r2
    }

    public int hashCode() {
            r1 = this;
            java.lang.Class r0 = r1.getClass()
            int r0 = r0.hashCode()
            return r0
    }

    @Override // Yue.InterfaceC3184
    public java.lang.String toString() {
            r1 = this;
            java.lang.Class r0 = r1.getClass()
            java.lang.String r0 = r0.getSimpleName()
            return r0
    }

    @Override // Yue.InterfaceC3184
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public Yue.InterfaceC3184 mo8452() {
            r1 = this;
            Yue.ۥ۟ۨۥۦ r0 = new Yue.ۥ۟ۨۥۦ
            r0.<init>()
            return r0
    }

    @Override // Yue.InterfaceC3184
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public boolean mo8453(java.lang.String r1) {
            r0 = this;
            r1 = 1
            return r1
    }

    @Override // Yue.InterfaceC3184
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public void mo8454(Yue.InterfaceC2813 r1) {
            r0 = this;
            return
    }

    @Override // Yue.InterfaceC3184
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public void mo8455(Yue.InterfaceC2813 r1) throws Yue.C3342 {
            r0 = this;
            return
    }

    @Override // Yue.InterfaceC3184
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public boolean mo8456(java.lang.String r1) {
            r0 = this;
            r1 = 1
            return r1
    }

    @Override // Yue.InterfaceC3184
    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public void mo7088(Yue.InterfaceC2813 r4) throws Yue.C3342 {
            r3 = this;
            boolean r0 = r4.mo12256()
            if (r0 != 0) goto L13
            boolean r0 = r4.mo12257()
            if (r0 != 0) goto L13
            boolean r0 = r4.mo12260()
            if (r0 != 0) goto L13
            return
        L13:
            Yue.ۥ۠ۥۧۦ r0 = new Yue.ۥ۠ۥۧۦ
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "bad rsv RSV1: "
            r1.append(r2)
            boolean r2 = r4.mo12256()
            r1.append(r2)
            java.lang.String r2 = " RSV2: "
            r1.append(r2)
            boolean r2 = r4.mo12257()
            r1.append(r2)
            java.lang.String r2 = " RSV3: "
            r1.append(r2)
            boolean r4 = r4.mo12260()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    @Override // Yue.InterfaceC3184
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public java.lang.String mo8457() {
            r1 = this;
            java.lang.String r0 = ""
            return r0
    }

    @Override // Yue.InterfaceC3184
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public java.lang.String mo8458() {
            r1 = this;
            java.lang.String r0 = ""
            return r0
    }

    @Override // Yue.InterfaceC3184
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public void mo8459() {
            r0 = this;
            return
    }
}
