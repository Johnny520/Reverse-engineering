package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۨ۠ۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C1705 implements Yue.InterfaceC1716 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public java.lang.String f5353;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public java.util.Hashtable f5354;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public Yue.AbstractC1711 f5355;

    public C1705() {
            r1 = this;
            r1.<init>()
            java.util.Hashtable r0 = new java.util.Hashtable
            r0.<init>()
            r1.f5354 = r0
            return
    }

    public C1705(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.f5353 = r1
            java.util.Hashtable r1 = new java.util.Hashtable
            r1.<init>()
            r0.f5354 = r1
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof Yue.C1705
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            Yue.ۥ۟ۨ۠ۧ r5 = (Yue.C1705) r5
            java.lang.String r1 = r4.f5353
            if (r1 != 0) goto L15
            java.lang.String r1 = r5.f5353
            if (r1 == 0) goto L1e
            return r2
        L15:
            java.lang.String r3 = r5.f5353
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L1e
            return r2
        L1e:
            java.util.Hashtable r1 = r4.f5354
            if (r1 != 0) goto L27
            java.util.Hashtable r1 = r5.f5354
            if (r1 == 0) goto L30
            return r2
        L27:
            java.util.Hashtable r3 = r5.f5354
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L30
            return r2
        L30:
            Yue.ۥ۟ۨۡۢ r1 = r4.f5355
            if (r1 != 0) goto L39
            Yue.ۥ۟ۨۡۢ r5 = r5.f5355
            if (r5 == 0) goto L42
            return r2
        L39:
            Yue.ۥ۟ۨۡۢ r5 = r5.f5355
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L42
            return r2
        L42:
            return r0
    }

    @Override // Yue.InterfaceC1716
    /* JADX INFO: renamed from: ۥ */
    public void mo8116(java.io.PrintWriter r2) throws java.io.IOException {
            r1 = this;
            java.lang.String r0 = "<!ELEMENT "
            r2.print(r0)
            java.lang.String r0 = r1.f5353
            r2.print(r0)
            java.lang.String r0 = " "
            r2.print(r0)
            Yue.ۥ۟ۨۡۢ r0 = r1.f5355
            if (r0 == 0) goto L17
            r0.mo8116(r2)
            goto L1c
        L17:
            java.lang.String r0 = "ANY"
            r2.print(r0)
        L1c:
            java.lang.String r0 = ">"
            r2.println(r0)
            r2.println()
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public Yue.C1699 m8146(java.lang.String r2) {
            r1 = this;
            java.util.Hashtable r0 = r1.f5354
            java.lang.Object r2 = r0.get(r2)
            Yue.ۥ۟ۨ۠ۡ r2 = (Yue.C1699) r2
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public Yue.AbstractC1711 m8147() {
            r1 = this;
            Yue.ۥ۟ۨۡۢ r0 = r1.f5355
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public java.lang.String m8148() {
            r1 = this;
            java.lang.String r0 = r1.f5353
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public void m8149(java.lang.String r2, Yue.C1699 r3) {
            r1 = this;
            java.util.Hashtable r0 = r1.f5354
            r0.put(r2, r3)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public void m8150(Yue.AbstractC1711 r1) {
            r0 = this;
            r0.f5355 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public void m8151(java.lang.String r1) {
            r0 = this;
            r0.f5353 = r1
            return
    }
}
