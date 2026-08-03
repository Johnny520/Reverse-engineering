package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۥۡۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C4945 extends Yue.AbstractC0733 implements Yue.InterfaceC4944 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public java.lang.String f15781;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public java.lang.String f15782;

    public C4945() {
            r0 = this;
            r0.<init>()
            r0.m19329()
            return
    }

    public C4945(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.m19329()
            r0.f15781 = r1
            r0.f15782 = r2
            return
    }

    @Override // Yue.InterfaceC4944
    public java.lang.String getData() {
            r1 = this;
            java.lang.String r0 = r1.f15782
            return r0
    }

    @Override // Yue.InterfaceC4944
    public java.lang.String getTarget() {
            r1 = this;
            java.lang.String r0 = r1.f15781
            return r0
    }

    @Override // Yue.AbstractC0733
    /* JADX INFO: renamed from: ۥ۟۟ۤۧ */
    public void mo4548(java.io.Writer r2) throws java.io.IOException {
            r1 = this;
            java.lang.String r0 = "<?"
            r2.write(r0)
            java.lang.String r0 = r1.f15781
            if (r0 == 0) goto Lc
            r2.write(r0)
        Lc:
            java.lang.String r0 = r1.f15782
            if (r0 == 0) goto L1a
            r0 = 32
            r2.write(r0)
            java.lang.String r0 = r1.f15782
            r2.write(r0)
        L1a:
            java.lang.String r0 = "?>"
            r2.write(r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۦ, reason: contains not printable characters */
    public void m19329() {
            r1 = this;
            r0 = 3
            r1.m4555(r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۧ, reason: contains not printable characters */
    public void m19330(java.lang.String r1) {
            r0 = this;
            r0.f15782 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۨ, reason: contains not printable characters */
    public void m19331(java.lang.String r1) {
            r0 = this;
            r0.f15781 = r1
            return
    }
}
