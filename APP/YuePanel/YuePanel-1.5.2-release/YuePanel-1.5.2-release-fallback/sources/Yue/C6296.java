package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۢۡۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C6296 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public int f22400;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public java.lang.String f22401;

    public C6296(int r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.f22400 = r1
            r0.f22401 = r2
            return
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof Yue.C6296
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            Yue.ۥۣۢۡۧ r4 = (Yue.C6296) r4
            int r4 = r4.f22400
            int r1 = r3.f22400
            if (r4 != r1) goto L13
            return r0
        L13:
            return r2
    }

    public int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.f22401
            int r0 = r0.hashCode()
            return r0
    }
}
