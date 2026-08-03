package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۡۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C2323 extends java.lang.Error {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public java.lang.Exception f7580;

    public C2323() {
            r0 = this;
            r0.<init>()
            return
    }

    public C2323(java.lang.Exception r1) {
            r0 = this;
            r0.<init>()
            r0.f7580 = r1
            return
    }

    public C2323(java.lang.Exception r1, java.lang.String r2) {
            r0 = this;
            r0.<init>(r2)
            r0.f7580 = r1
            return
    }

    public C2323(java.lang.String r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public C2323(java.lang.String r1, java.lang.Exception r2) {
            r0 = this;
            r0.<init>(r1)
            r0.f7580 = r2
            return
    }

    @Override // java.lang.Throwable
    public java.lang.String getMessage() {
            r2 = this;
            java.lang.String r0 = super.getMessage()
            if (r0 == 0) goto L7
            return r0
        L7:
            java.lang.Exception r1 = r2.f7580
            if (r1 == 0) goto L1b
            java.lang.String r0 = r1.getMessage()
            if (r0 != 0) goto L1b
            java.lang.Exception r0 = r2.f7580
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.toString()
        L1b:
            return r0
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public java.lang.Exception m10691() {
            r1 = this;
            java.lang.Exception r0 = r1.f7580
            return r0
    }
}
