package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۡۥۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C2322 {

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final java.lang.String f7577 = "";

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public java.util.Map<java.lang.String, java.lang.String> f7578;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public java.lang.String f7579;

    public C2322() {
            r1 = this;
            r1.<init>()
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r1.f7578 = r0
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static Yue.C2322 m10688(java.lang.String r8) {
            Yue.ۥ۠ۡۥۨ r0 = new Yue.ۥ۠ۡۥۨ
            r0.<init>()
            java.lang.String r1 = ";"
            java.lang.String[] r8 = r8.split(r1)
            r1 = 0
            r2 = r8[r1]
            java.lang.String r2 = r2.trim()
            r0.f7579 = r2
            r2 = 1
            r3 = r2
        L16:
            int r4 = r8.length
            if (r3 >= r4) goto L67
            r4 = r8[r3]
            java.lang.String r5 = "="
            java.lang.String[] r4 = r4.split(r5)
            int r5 = r4.length
            if (r5 <= r2) goto L57
            r5 = r4[r2]
            java.lang.String r5 = r5.trim()
            java.lang.String r6 = "\""
            boolean r7 = r5.startsWith(r6)
            if (r7 == 0) goto L38
            boolean r6 = r5.endsWith(r6)
            if (r6 != 0) goto L4d
        L38:
            java.lang.String r6 = "'"
            boolean r7 = r5.startsWith(r6)
            if (r7 == 0) goto L59
            boolean r6 = r5.endsWith(r6)
            if (r6 == 0) goto L59
            int r6 = r5.length()
            r7 = 2
            if (r6 <= r7) goto L59
        L4d:
            int r6 = r5.length()
            int r6 = r6 - r2
            java.lang.String r5 = r5.substring(r2, r6)
            goto L59
        L57:
            java.lang.String r5 = ""
        L59:
            java.util.Map<java.lang.String, java.lang.String> r6 = r0.f7578
            r4 = r4[r1]
            java.lang.String r4 = r4.trim()
            r6.put(r4, r5)
            int r3 = r3 + 1
            goto L16
        L67:
            return r0
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public java.lang.String m10689() {
            r1 = this;
            java.lang.String r0 = r1.f7579
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public java.util.Map<java.lang.String, java.lang.String> m10690() {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.f7578
            return r0
    }
}
