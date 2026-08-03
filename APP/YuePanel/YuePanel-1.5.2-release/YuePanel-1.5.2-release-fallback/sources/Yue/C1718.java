package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۨۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C1718 extends java.io.IOException {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public java.lang.String f5372;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public int f5373;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public int f5374;

    public C1718() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = ""
            r1.f5372 = r0
            r0 = -1
            r1.f5373 = r0
            r1.f5374 = r0
            return
    }

    public C1718(java.lang.String r1) {
            r0 = this;
            r0.<init>(r1)
            java.lang.String r1 = ""
            r0.f5372 = r1
            r1 = -1
            r0.f5373 = r1
            r0.f5374 = r1
            return
    }

    public C1718(java.lang.String r3, int r4, int r5) {
            r2 = this;
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            java.lang.String r1 = "At line "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r1 = ", column "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r1 = ": "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            java.lang.String r3 = ""
            r2.f5372 = r3
            r2.f5373 = r4
            r2.f5374 = r5
            return
    }

    public C1718(java.lang.String r4, java.lang.String r5, int r6, int r7) {
            r3 = this;
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            if (r4 == 0) goto L24
            int r1 = r4.length()
            if (r1 <= 0) goto L24
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r1.<init>()
            java.lang.String r2 = "URI "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r2 = " at "
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            goto L26
        L24:
            java.lang.String r1 = "At "
        L26:
            r0.append(r1)
            java.lang.String r1 = "line "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r1 = ", column "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r1 = ": "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r3.<init>(r5)
            java.lang.String r5 = ""
            r3.f5372 = r5
            if (r4 == 0) goto L50
            r3.f5372 = r4
        L50:
            r3.f5373 = r6
            r3.f5374 = r7
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public int m8197() {
            r1 = this;
            int r0 = r1.f5374
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public java.lang.String m8198() {
            r1 = this;
            java.lang.String r0 = r1.f5372
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int m8199() {
            r1 = this;
            int r0 = r1.f5373
            return r0
    }
}
