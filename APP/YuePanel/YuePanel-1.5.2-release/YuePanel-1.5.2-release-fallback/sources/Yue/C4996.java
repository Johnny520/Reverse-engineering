package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۥۤۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C4996 implements java.io.Serializable {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public java.lang.String f15854;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public java.lang.String f15855;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public java.lang.String f15856;

    public C4996(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = ""
            r1.<init>(r0, r2)
            return
    }

    public C4996(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            java.lang.String r0 = ""
            r1.<init>(r2, r3, r0)
            return
    }

    public C4996(java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            r1 = this;
            r1.<init>()
            if (r3 == 0) goto L14
            java.lang.String r0 = ""
            if (r2 != 0) goto La
            r2 = r0
        La:
            if (r4 != 0) goto Ld
            r4 = r0
        Ld:
            r1.f15854 = r2
            r1.f15855 = r3
            r1.f15856 = r4
            return
        L14:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Local part not allowed to be null"
            r2.<init>(r3)
            throw r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static Yue.C4996 m19419(java.lang.String r4) {
            java.lang.String r0 = "invalid QName literal"
            if (r4 == 0) goto L47
            java.lang.String r1 = ""
            boolean r1 = r4.equals(r1)
            if (r1 != 0) goto L47
            r1 = 0
            char r1 = r4.charAt(r1)
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 != r2) goto L41
            r1 = 125(0x7d, float:1.75E-43)
            int r1 = r4.indexOf(r1)
            r2 = -1
            if (r1 == r2) goto L3b
            int r2 = r4.length()
            r3 = 1
            int r2 = r2 - r3
            if (r1 == r2) goto L35
            Yue.ۥۡۥۤۨ r0 = new Yue.ۥۡۥۤۨ
            java.lang.String r2 = r4.substring(r3, r1)
            int r1 = r1 + r3
            java.lang.String r4 = r4.substring(r1)
            r0.<init>(r2, r4)
            return r0
        L35:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            r4.<init>(r0)
            throw r4
        L3b:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            r4.<init>(r0)
            throw r4
        L41:
            Yue.ۥۡۥۤۨ r0 = new Yue.ۥۡۥۤۨ
            r0.<init>(r4)
            return r0
        L47:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            r4.<init>(r0)
            throw r4
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof Yue.C4996
            if (r1 != 0) goto L9
            return r0
        L9:
            Yue.ۥۡۥۤۨ r4 = (Yue.C4996) r4
            java.lang.String r1 = r3.f15855
            java.lang.String r2 = r4.f15855
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L20
            java.lang.String r1 = r3.f15854
            java.lang.String r4 = r4.f15854
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L20
            r0 = 1
        L20:
            return r0
    }

    public final int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.f15854
            int r0 = r0.hashCode()
            java.lang.String r1 = r2.f15855
            int r1 = r1.hashCode()
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = r2.f15854
            java.lang.String r1 = ""
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Ld
            java.lang.String r0 = r2.f15855
            return r0
        Ld:
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            java.lang.String r1 = "{"
            r0.append(r1)
            java.lang.String r1 = r2.f15854
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r1 = r2.f15855
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public java.lang.String m19420() {
            r1 = this;
            java.lang.String r0 = r1.f15855
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public java.lang.String m19421() {
            r1 = this;
            java.lang.String r0 = r1.f15854
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public java.lang.String m19422() {
            r1 = this;
            java.lang.String r0 = r1.f15856
            return r0
    }
}
