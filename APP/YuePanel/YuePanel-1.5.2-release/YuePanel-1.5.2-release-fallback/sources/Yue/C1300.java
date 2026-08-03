package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۥۦۣ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C1300 extends Yue.C1094 implements Yue.InterfaceC1275 {
    public C1300() {
            r0 = this;
            r0.<init>()
            r0.mo5838()
            return
    }

    public C1300(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.mo5838()
            r0.m5839(r1)
            return
    }

    @Override // Yue.InterfaceC1275
    public java.lang.String getText() {
            r1 = this;
            java.lang.String r0 = r1.getData()
            return r0
    }

    @Override // Yue.C1094, Yue.AbstractC0733
    /* JADX INFO: renamed from: ۥ۟۟ۤۧ */
    public void mo4548(java.io.Writer r3) throws java.io.IOException {
            r2 = this;
            java.lang.String r0 = "<!--"
            r3.write(r0)
            java.lang.String r0 = r2.getText()
            int r1 = r0.length()
            if (r1 <= 0) goto L12
            r3.write(r0)
        L12:
            java.lang.String r0 = "-->"
            r3.write(r0)
            return
    }

    @Override // Yue.C1094
    /* JADX INFO: renamed from: ۥ۟۟ۥۨ */
    public void mo5838() {
            r1 = this;
            r0 = 5
            r1.m4555(r0)
            return
    }
}
