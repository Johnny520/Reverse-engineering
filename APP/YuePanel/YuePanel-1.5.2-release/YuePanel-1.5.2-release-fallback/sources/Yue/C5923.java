package Yue;

/* JADX INFO: renamed from: Yue.ۥۢ۟ۨۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C5923 extends Yue.AbstractC4361 implements Yue.InterfaceC5922 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public java.util.List f21593;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public java.util.List f21594;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public Yue.InterfaceC4366 f21595;

    public C5923() {
            r0 = this;
            r0.<init>()
            return
    }

    public C5923(Yue.C4996 r1) {
            r0 = this;
            r0.<init>(r1)
            r0.m21998()
            return
    }

    public C5923(Yue.InterfaceC5922 r3) {
            r2 = this;
            Yue.ۥۡۥۤۨ r0 = r3.getName()
            r2.<init>(r0)
            r2.m21998()
            Yue.ۥۡۥۤۨ r0 = r3.getName()
            r2.m17189(r0)
            java.util.Iterator r0 = r3.getAttributes()
        L15:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L25
            java.lang.Object r1 = r0.next()
            Yue.ۥ۟ۢ۠ۡ r1 = (Yue.InterfaceC0645) r1
            r2.m21996(r1)
            goto L15
        L25:
            r3.getNamespaces()
            java.util.Iterator r3 = r3.getNamespaces()
        L2c:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L3c
            java.lang.Object r0 = r3.next()
            Yue.ۥۣۡۢ۠ r0 = (Yue.InterfaceC4364) r0
            r2.m21997(r0)
            goto L2c
        L3c:
            return
    }

    @Override // Yue.InterfaceC5922
    public java.util.Iterator getAttributes() {
            r1 = this;
            java.util.List r0 = r1.f21593
            if (r0 != 0) goto L7
            Yue.ۥ۠۠ۨ r0 = Yue.C2144.f6732
            return r0
        L7:
            java.util.Iterator r0 = r0.iterator()
            return r0
    }

    @Override // Yue.InterfaceC5922
    public java.util.Iterator getNamespaces() {
            r1 = this;
            java.util.List r0 = r1.f21594
            if (r0 != 0) goto L7
            Yue.ۥ۠۠ۨ r0 = Yue.C2144.f6732
            return r0
        L7:
            java.util.Iterator r0 = r0.iterator()
            return r0
    }

    @Override // Yue.AbstractC0733
    public java.lang.String toString() {
            r4 = this;
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            java.lang.String r1 = "<"
            r0.append(r1)
            java.lang.String r1 = r4.m17188()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.util.Iterator r1 = r4.getAttributes()
        L19:
            boolean r2 = r1.hasNext()
            java.lang.String r3 = " "
            if (r2 == 0) goto L3c
            java.lang.StringBuffer r2 = new java.lang.StringBuffer
            r2.<init>()
            r2.append(r0)
            r2.append(r3)
            java.lang.Object r0 = r1.next()
            java.lang.String r0 = r0.toString()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            goto L19
        L3c:
            java.util.Iterator r1 = r4.getNamespaces()
        L40:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L61
            java.lang.StringBuffer r2 = new java.lang.StringBuffer
            r2.<init>()
            r2.append(r0)
            r2.append(r3)
            java.lang.Object r0 = r1.next()
            java.lang.String r0 = r0.toString()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            goto L40
        L61:
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = ">"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }

    @Override // Yue.InterfaceC5922
    /* JADX INFO: renamed from: ۥ۟ */
    public Yue.InterfaceC4366 mo21993() {
            r1 = this;
            Yue.ۥۡۢ۠ۥ r0 = r1.f21595
            return r0
    }

    @Override // Yue.InterfaceC5922
    /* JADX INFO: renamed from: ۥ۟۟ */
    public java.lang.String mo21994(java.lang.String r2) {
            r1 = this;
            Yue.ۥۡۢ۠ۥ r0 = r1.f21595
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            java.lang.String r2 = r0.mo17192(r2)
            return r2
    }

    @Override // Yue.InterfaceC5922
    /* JADX INFO: renamed from: ۥۣ۟۟۠ */
    public Yue.InterfaceC0645 mo21995(Yue.C4996 r5) {
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            java.util.Iterator r1 = r4.getAttributes()
        L8:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L1f
            java.lang.Object r2 = r1.next()
            Yue.ۥ۟ۢ۠ۡ r2 = (Yue.InterfaceC0645) r2
            Yue.ۥۡۥۤۨ r3 = r2.getName()
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L8
            return r2
        L1f:
            return r0
    }

    @Override // Yue.AbstractC4361, Yue.AbstractC0733
    /* JADX INFO: renamed from: ۥ۟۟ۤۧ */
    public void mo4548(java.io.Writer r4) throws java.io.IOException, Yue.C7158 {
            r3 = this;
            r0 = 60
            r4.write(r0)
            Yue.ۥۡۥۤۨ r0 = r3.getName()
            java.lang.String r1 = r0.m19422()
            if (r1 == 0) goto L1d
            int r2 = r1.length()
            if (r2 <= 0) goto L1d
            r4.write(r1)
            r1 = 58
            r4.write(r1)
        L1d:
            java.lang.String r0 = r0.m19420()
            r4.write(r0)
            java.util.Iterator r0 = r3.getNamespaces()
        L28:
            boolean r1 = r0.hasNext()
            r2 = 32
            if (r1 == 0) goto L3d
            r4.write(r2)
            java.lang.Object r1 = r0.next()
            Yue.ۥۢۦ۠ۨ r1 = (Yue.InterfaceC7142) r1
            r1.mo4241(r4)
            goto L28
        L3d:
            java.util.Iterator r0 = r3.getAttributes()
        L41:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L54
            r4.write(r2)
            java.lang.Object r1 = r0.next()
            Yue.ۥۢۦ۠ۨ r1 = (Yue.InterfaceC7142) r1
            r1.mo4241(r4)
            goto L41
        L54:
            r0 = 62
            r4.write(r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۨ, reason: contains not printable characters */
    public void m21996(Yue.InterfaceC0645 r2) {
            r1 = this;
            java.util.List r0 = r1.f21593
            if (r0 != 0) goto Lb
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f21593 = r0
        Lb:
            java.util.List r0 = r1.f21593
            r0.add(r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦ, reason: contains not printable characters */
    public void m21997(Yue.InterfaceC4364 r2) {
            r1 = this;
            java.util.List r0 = r1.f21594
            if (r0 != 0) goto Lb
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f21594 = r0
        Lb:
            java.util.List r0 = r1.f21594
            r0.add(r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦ۟, reason: contains not printable characters */
    public void m21998() {
            r1 = this;
            r0 = 1
            r1.m4555(r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦ۠, reason: contains not printable characters */
    public void m21999() {
            r1 = this;
            java.util.List r0 = r1.f21593
            if (r0 == 0) goto L7
            r0.clear()
        L7:
            java.util.List r0 = r1.f21594
            if (r0 == 0) goto Le
            r0.clear()
        Le:
            Yue.ۥۡۢ۠ۥ r0 = r1.f21595
            if (r0 == 0) goto L15
            r0 = 0
            r1.f21595 = r0
        L15:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۡ, reason: contains not printable characters */
    public void m22000(java.util.List r1) {
            r0 = this;
            r0.f21593 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۢ, reason: contains not printable characters */
    public void m22001(Yue.InterfaceC4366 r1) {
            r0 = this;
            r0.f21595 = r1
            return
    }
}
