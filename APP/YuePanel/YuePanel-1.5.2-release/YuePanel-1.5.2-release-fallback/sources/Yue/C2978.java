package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۤۡۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C2978 extends Yue.C2982 implements Yue.InterfaceC1166 {

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public java.lang.String f9613;

    public C2978() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "*"
            r1.f9613 = r0
            return
    }

    @Override // Yue.InterfaceC1165
    /* JADX INFO: renamed from: ۥ۟ */
    public java.lang.String mo6095() {
            r1 = this;
            java.lang.String r0 = r1.f9613
            return r0
    }

    @Override // Yue.InterfaceC1166
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
    public void mo6096(java.lang.String r2) {
            r1 = this;
            if (r2 == 0) goto L5
            r1.f9613 = r2
            return
        L5:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "http resource descriptor must not be null"
            r2.<init>(r0)
            throw r2
    }
}
