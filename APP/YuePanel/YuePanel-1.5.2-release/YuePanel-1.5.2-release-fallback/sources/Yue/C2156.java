package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۡ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C2156 extends Yue.AbstractC4361 implements Yue.InterfaceC2155 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public java.util.List f6752;

    public C2156() {
            r0 = this;
            r0.<init>()
            r0.m10112()
            return
    }

    public C2156(Yue.C4996 r1) {
            r0 = this;
            r0.<init>(r1)
            r0.m10112()
            return
    }

    @Override // Yue.InterfaceC2155
    public java.util.Iterator getNamespaces() {
            r1 = this;
            java.util.List r0 = r1.f6752
            if (r0 != 0) goto L7
            Yue.ۥ۠۠ۨ r0 = Yue.C2144.f6732
            return r0
        L7:
            java.util.Iterator r0 = r0.iterator()
            return r0
    }

    @Override // Yue.AbstractC0733
    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            java.lang.String r1 = "</"
            r0.append(r1)
            java.lang.String r1 = r3.m17188()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.util.Iterator r1 = r3.getNamespaces()
        L19:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L3c
            java.lang.StringBuffer r2 = new java.lang.StringBuffer
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = " "
            r2.append(r0)
            java.lang.Object r0 = r1.next()
            java.lang.String r0 = r0.toString()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            goto L19
        L3c:
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = ">"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }

    @Override // Yue.AbstractC4361, Yue.AbstractC0733
    /* JADX INFO: renamed from: ۥ۟۟ۤۧ */
    public void mo4548(java.io.Writer r4) throws java.io.IOException {
            r3 = this;
            java.lang.String r0 = "</"
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
            r0 = 62
            r4.write(r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۨ, reason: contains not printable characters */
    public void m10111(Yue.InterfaceC4364 r2) {
            r1 = this;
            java.util.List r0 = r1.f6752
            if (r0 != 0) goto Lb
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f6752 = r0
        Lb:
            java.util.List r0 = r1.f6752
            r0.add(r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦ, reason: contains not printable characters */
    public void m10112() {
            r1 = this;
            r0 = 2
            r1.m4555(r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦ۟, reason: contains not printable characters */
    public void m10113() {
            r1 = this;
            java.util.List r0 = r1.f6752
            if (r0 == 0) goto L7
            r0.clear()
        L7:
            return
    }
}
