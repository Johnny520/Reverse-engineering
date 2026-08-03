package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۡ۟ۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C2166 extends Yue.AbstractC0733 implements Yue.InterfaceC2165 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public java.lang.String f6777;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public java.lang.String f6778;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public Yue.InterfaceC2162 f6779;

    public C2166() {
            r0 = this;
            r0.<init>()
            r0.m10149()
            return
    }

    public C2166(java.lang.String r1, Yue.InterfaceC2162 r2) {
            r0 = this;
            r0.<init>()
            r0.m10149()
            r0.f6777 = r1
            r0.f6779 = r2
            return
    }

    @Override // Yue.InterfaceC2165
    public java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.f6777
            return r0
    }

    @Override // Yue.AbstractC0733
    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = r3.m10147()
            if (r0 != 0) goto L8
            java.lang.String r0 = ""
        L8:
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r1.<init>()
            java.lang.String r2 = "&"
            r1.append(r2)
            java.lang.String r2 = r3.getName()
            r1.append(r2)
            java.lang.String r2 = ":='"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = "'"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }

    @Override // Yue.AbstractC0733, Yue.InterfaceC3728
    /* JADX INFO: renamed from: ۥ */
    public java.lang.String mo4230() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // Yue.AbstractC0733, Yue.InterfaceC3728
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public java.lang.String mo4231() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // Yue.InterfaceC2165
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ */
    public Yue.InterfaceC2162 mo10146() {
            r1 = this;
            Yue.ۥ۠ۡ۟ۡ r0 = r1.f6779
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public java.lang.String m10147() {
            r1 = this;
            Yue.ۥ۠ۡ۟ۡ r0 = r1.f6779
            java.lang.String r0 = r0.mo10143()
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
    public java.lang.String m10148() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // Yue.AbstractC0733
    /* JADX INFO: renamed from: ۥ۟۟ۤۧ */
    public void mo4548(java.io.Writer r2) throws java.io.IOException {
            r1 = this;
            r0 = 38
            r2.write(r0)
            java.lang.String r0 = r1.getName()
            r2.write(r0)
            r0 = 59
            r2.write(r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۦ, reason: contains not printable characters */
    public void m10149() {
            r1 = this;
            r0 = 9
            r1.m4555(r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۧ, reason: contains not printable characters */
    public void m10150(java.lang.String r1) {
            r0 = this;
            r0.f6777 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۨ, reason: contains not printable characters */
    public void m10151(java.lang.String r1) {
            r0 = this;
            r0.f6778 = r1
            return
    }
}
