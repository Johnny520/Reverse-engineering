package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۡۢ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C2251 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public int f6940;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public Yue.C4996 f6941;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public java.util.List f6942;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public java.util.List f6943;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public java.lang.String f6944;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public java.lang.String f6945;

    public C2251() {
            r0 = this;
            r0.<init>()
            return
    }

    public C2251(int r1) {
            r0 = this;
            r0.<init>()
            r0.f6940 = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.f6942 = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.f6943 = r1
            return
    }

    public java.lang.String toString() {
            r6 = this;
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r1.<init>()
            java.lang.String r2 = "["
            r1.append(r2)
            int r2 = r6.f6940
            java.lang.String r2 = Yue.C2107.m9935(r2)
            r1.append(r2)
            java.lang.String r2 = "]"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            Yue.ۥۡۥۤۨ r1 = r6.f6941
            if (r1 == 0) goto L43
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r1.<init>()
            java.lang.String r3 = "[name='"
            r1.append(r3)
            Yue.ۥۡۥۤۨ r3 = r6.f6941
            r1.append(r3)
            java.lang.String r3 = "']"
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
        L43:
            java.util.List r1 = r6.f6943
            java.util.Iterator r1 = r1.iterator()
        L49:
            boolean r3 = r1.hasNext()
            java.lang.String r4 = " "
            if (r3 == 0) goto L68
            java.lang.StringBuffer r3 = new java.lang.StringBuffer
            r3.<init>()
            java.lang.Object r5 = r1.next()
            r3.append(r5)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r0.append(r3)
            goto L49
        L68:
            java.util.List r1 = r6.f6942
            java.util.Iterator r1 = r1.iterator()
        L6e:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L8b
            java.lang.StringBuffer r3 = new java.lang.StringBuffer
            r3.<init>()
            java.lang.Object r5 = r1.next()
            r3.append(r5)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r0.append(r3)
            goto L6e
        L8b:
            java.lang.String r1 = r6.f6944
            if (r1 == 0) goto La8
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r1.<init>()
            java.lang.String r3 = ",data=["
            r1.append(r3)
            java.lang.String r3 = r6.f6944
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
        La8:
            java.lang.String r1 = r6.f6945
            if (r1 == 0) goto Lc5
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r1.<init>()
            java.lang.String r3 = ",extradata=["
            r1.append(r3)
            java.lang.String r3 = r6.f6945
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
        Lc5:
            java.lang.String r0 = r0.toString()
            return r0
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public void m10391(java.lang.Object r2) {
            r1 = this;
            java.util.List r0 = r1.f6942
            r0.add(r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public void m10392(java.lang.Object r2) {
            r1 = this;
            java.util.List r0 = r1.f6943
            r0.add(r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public void m10393() {
            r2 = this;
            r0 = 0
            r2.f6941 = r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2.f6942 = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2.f6943 = r1
            r2.f6944 = r0
            r2.f6945 = r0
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public java.util.List m10394() {
            r1 = this;
            java.util.List r0 = r1.f6942
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public java.lang.String m10395() {
            r1 = this;
            java.lang.String r0 = r1.f6944
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public java.lang.String m10396() {
            r1 = this;
            java.lang.String r0 = r1.f6945
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public java.lang.String m10397() {
            r1 = this;
            Yue.ۥۡۥۤۨ r0 = r1.f6941
            java.lang.String r0 = r0.m19420()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public Yue.C4996 m10398() {
            r1 = this;
            Yue.ۥۡۥۤۨ r0 = r1.f6941
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public java.lang.String m10399() {
            r1 = this;
            Yue.ۥۡۥۤۨ r0 = r1.f6941
            java.lang.String r0 = r0.m19421()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public java.util.List m10400() {
            r1 = this;
            java.util.List r0 = r1.f6943
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public java.lang.String m10401() {
            r1 = this;
            Yue.ۥۡۥۤۨ r0 = r1.f6941
            java.lang.String r0 = r0.m19422()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public int m10402() {
            r1 = this;
            int r0 = r1.f6940
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public void m10403(java.util.List r1) {
            r0 = this;
            r0.f6942 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public void m10404(java.lang.String r1) {
            r0 = this;
            r0.f6944 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public void m10405(java.lang.String r1) {
            r0 = this;
            r0.f6945 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public void m10406(Yue.C4996 r1) {
            r0 = this;
            r0.f6941 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public void m10407(java.util.List r1) {
            r0 = this;
            r0.f6943 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public void m10408(int r1) {
            r0 = this;
            r0.f6940 = r1
            return
    }
}
