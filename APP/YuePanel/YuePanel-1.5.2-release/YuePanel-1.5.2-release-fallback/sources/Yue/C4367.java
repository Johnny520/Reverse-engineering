package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۢ۠ۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C4367 implements Yue.InterfaceC4366 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public Yue.C6077 f13909;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public Yue.C6077 f13910;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public Yue.InterfaceC4366 f13911;

    public C4367() {
            r1 = this;
            r1.<init>()
            Yue.ۥۢ۠ۦۤ r0 = new Yue.ۥۢ۠ۦۤ
            r0.<init>()
            r1.f13909 = r0
            Yue.ۥۢ۠ۦۤ r0 = new Yue.ۥۢ۠ۦۤ
            r0.<init>()
            r1.f13910 = r0
            r1.m17200()
            return
    }

    public C4367(Yue.InterfaceC4366 r1) {
            r0 = this;
            r0.<init>()
            Yue.ۥۢ۠ۦۤ r1 = new Yue.ۥۢ۠ۦۤ
            r1.<init>()
            r0.f13909 = r1
            Yue.ۥۢ۠ۦۤ r1 = new Yue.ۥۢ۠ۦۤ
            r1.<init>()
            r0.f13910 = r1
            r1 = 0
            r0.f13911 = r1
            r0.m17200()
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static void m17194(java.lang.String[] r6) throws java.lang.Exception {
            Yue.ۥۡۢ۠ۦ r6 = new Yue.ۥۡۢ۠ۦ
            r6.<init>()
            r6.m17201()
            java.lang.String r0 = "a"
            java.lang.String r1 = "uri"
            r6.m17196(r0, r1)
            java.lang.String r2 = "b"
            r6.m17196(r2, r1)
            java.io.PrintStream r2 = java.lang.System.out
            java.lang.StringBuffer r3 = new java.lang.StringBuffer
            r3.<init>()
            java.lang.String r4 = "a="
            r3.append(r4)
            java.lang.String r4 = r6.mo17192(r0)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.println(r3)
            java.lang.StringBuffer r3 = new java.lang.StringBuffer
            r3.<init>()
            java.lang.String r4 = "uri="
            r3.append(r4)
            java.lang.String r4 = r6.getPrefix(r1)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.println(r3)
            java.util.Iterator r2 = r6.mo17193(r1)
        L4a:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L6b
            java.io.PrintStream r3 = java.lang.System.out
            java.lang.StringBuffer r4 = new java.lang.StringBuffer
            r4.<init>()
            java.lang.String r5 = "1 uri->"
            r4.append(r5)
            java.lang.Object r5 = r2.next()
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.println(r4)
            goto L4a
        L6b:
            r6.m17201()
            java.lang.String r2 = "uri2"
            r6.m17196(r0, r2)
            java.util.Iterator r0 = r6.mo17193(r1)
        L77:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L98
            java.io.PrintStream r1 = java.lang.System.out
            java.lang.StringBuffer r2 = new java.lang.StringBuffer
            r2.<init>()
            java.lang.String r3 = "2 uri->"
            r2.append(r3)
            java.lang.Object r3 = r0.next()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.println(r2)
            goto L77
        L98:
            r6.m17197()
            r6.m17197()
            return
    }

    @Override // Yue.InterfaceC4366
    public java.lang.String getPrefix(java.lang.String r3) {
            r2 = this;
            Yue.ۥۢ۠ۦۤ r0 = r2.f13910
            java.lang.String r0 = r0.m22816(r3)
            if (r0 != 0) goto L11
            Yue.ۥۡۢ۠ۥ r1 = r2.f13911
            if (r1 == 0) goto L11
            java.lang.String r3 = r1.getPrefix(r3)
            return r3
        L11:
            return r0
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public void m17195(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = ""
            r1.m17196(r0, r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public void m17196(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            Yue.ۥۢ۠ۦۤ r0 = r1.f13909
            r0.m22820(r2, r3)
            Yue.ۥۢ۠ۦۤ r0 = r1.f13910
            r0.m22820(r3, r2)
            return
    }

    @Override // Yue.InterfaceC4366
    /* JADX INFO: renamed from: ۥ۟۟ */
    public java.lang.String mo17192(java.lang.String r3) {
            r2 = this;
            Yue.ۥۢ۠ۦۤ r0 = r2.f13909
            java.lang.String r0 = r0.m22816(r3)
            if (r0 != 0) goto L11
            Yue.ۥۡۢ۠ۥ r1 = r2.f13911
            if (r1 == 0) goto L11
            java.lang.String r3 = r1.mo17192(r3)
            return r3
        L11:
            return r0
    }

    @Override // Yue.InterfaceC4366
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public java.util.Iterator mo17193(java.lang.String r2) {
            r1 = this;
            Yue.ۥۢ۠ۦۤ r0 = r1.f13910
            java.util.Set r2 = r0.m22817(r2)
            java.util.Iterator r2 = r2.iterator()
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public void m17197() {
            r1 = this;
            Yue.ۥۢ۠ۦۤ r0 = r1.f13909
            r0.m22815()
            Yue.ۥۢ۠ۦۤ r0 = r1.f13910
            r0.m22815()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public java.lang.String m17198() {
            r1 = this;
            java.lang.String r0 = ""
            java.lang.String r0 = r1.mo17192(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public int m17199() {
            r1 = this;
            Yue.ۥۢ۠ۦۤ r0 = r1.f13909
            int r0 = r0.m22818()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public void m17200() {
            r2 = this;
            java.lang.String r0 = "xml"
            java.lang.String r1 = "http://www.w3.org/XML/1998/namespace"
            r2.m17196(r0, r1)
            java.lang.String r0 = "xmlns"
            r2.m17196(r0, r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public void m17201() {
            r1 = this;
            Yue.ۥۢ۠ۦۤ r0 = r1.f13909
            r0.m22819()
            Yue.ۥۢ۠ۦۤ r0 = r1.f13910
            r0.m22819()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public void m17202() {
            r2 = this;
            java.lang.String r0 = ""
            r1 = 0
            r2.m17196(r0, r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public void m17203(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            Yue.ۥۢ۠ۦۤ r0 = r2.f13909
            r1 = 0
            r0.m22820(r3, r1)
            Yue.ۥۢ۠ۦۤ r3 = r2.f13909
            r3.m22820(r4, r1)
            return
    }
}
