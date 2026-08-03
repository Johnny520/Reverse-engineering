package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۢ۠ۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C4365 extends Yue.C0647 implements Yue.InterfaceC4364 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public boolean f13908;

    public C4365(java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = "xmlns"
            java.lang.String r1 = ""
            r2.<init>(r0, r1, r3)
            r3 = 1
            r2.f13908 = r3
            return
    }

    public C4365(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            java.lang.String r0 = "xmlns"
            r1.<init>(r0, r2, r3)
            r2 = 0
            r1.f13908 = r2
            return
    }

    @Override // Yue.InterfaceC4364
    public java.lang.String getPrefix() {
            r1 = this;
            boolean r0 = r1.f13908
            if (r0 == 0) goto L7
            java.lang.String r0 = ""
            return r0
        L7:
            java.lang.String r0 = super.m4244()
            return r0
    }

    @Override // Yue.C0647, Yue.InterfaceC7142
    public boolean isAttribute() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // Yue.C0647
    public java.lang.String toString() {
            r3 = this;
            boolean r0 = r3.f13908
            java.lang.String r1 = "'"
            if (r0 == 0) goto L1f
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            java.lang.String r2 = "xmlns='"
            r0.append(r2)
            java.lang.String r2 = r3.mo4233()
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L1f:
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            java.lang.String r2 = "xmlns:"
            r0.append(r2)
            java.lang.String r2 = r3.getPrefix()
            r0.append(r2)
            java.lang.String r2 = "='"
            r0.append(r2)
            java.lang.String r2 = r3.mo4233()
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // Yue.C0647, Yue.InterfaceC4364
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ */
    public java.lang.String mo4233() {
            r1 = this;
            java.lang.String r0 = super.getValue()
            return r0
    }

    @Override // Yue.C0647, Yue.InterfaceC7142
    /* JADX INFO: renamed from: ۥ۟۟۠ */
    public int mo4236() {
            r1 = this;
            r0 = 13
            return r0
    }

    @Override // Yue.C0647, Yue.InterfaceC7142
    /* JADX INFO: renamed from: ۥ۟۟ۡۡ */
    public boolean mo4240() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // Yue.InterfaceC4364
    /* JADX INFO: renamed from: ۥ۟۟ۤ۠ */
    public boolean mo17191() {
            r1 = this;
            boolean r0 = r1.f13908
            return r0
    }
}
