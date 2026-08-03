package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۦۢۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C7158 extends java.lang.Exception {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public java.lang.Throwable f24724;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public Yue.InterfaceC3728 f24725;

    public C7158() {
            r0 = this;
            r0.<init>()
            return
    }

    public C7158(java.lang.String r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public C7158(java.lang.String r3, Yue.InterfaceC3728 r4) {
            r2 = this;
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            java.lang.String r1 = "ParseError at [row,col]:["
            r0.append(r1)
            int r1 = r4.mo4246()
            r0.append(r1)
            java.lang.String r1 = ","
            r0.append(r1)
            int r1 = r4.mo4238()
            r0.append(r1)
            java.lang.String r1 = "]\n"
            r0.append(r1)
            java.lang.String r1 = "Message: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            r2.f24725 = r4
            return
    }

    public C7158(java.lang.String r3, Yue.InterfaceC3728 r4, java.lang.Throwable r5) {
            r2 = this;
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            java.lang.String r1 = "ParseError at [row,col]:["
            r0.append(r1)
            int r1 = r4.mo4246()
            r0.append(r1)
            java.lang.String r1 = ","
            r0.append(r1)
            int r1 = r4.mo4238()
            r0.append(r1)
            java.lang.String r1 = "]\n"
            r0.append(r1)
            java.lang.String r1 = "Message: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            r2.f24724 = r5
            r2.f24725 = r4
            return
    }

    public C7158(java.lang.String r1, java.lang.Throwable r2) {
            r0 = this;
            r0.<init>(r1)
            r0.f24724 = r2
            return
    }

    public C7158(java.lang.Throwable r1) {
            r0 = this;
            r0.<init>()
            r0.f24724 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public Yue.InterfaceC3728 m27537() {
            r1 = this;
            Yue.ۥ۠ۧۧۧ r0 = r1.f24725
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public java.lang.Throwable m27538() {
            r1 = this;
            java.lang.Throwable r0 = r1.f24724
            return r0
    }
}
