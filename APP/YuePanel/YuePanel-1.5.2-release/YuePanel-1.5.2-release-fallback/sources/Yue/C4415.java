package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۢۤۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4415 {
    public C4415() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static java.lang.String m17326(java.lang.String r1) {
            if (r1 == 0) goto L9
            java.util.Locale r0 = java.util.Locale.ENGLISH
            java.lang.String r1 = r1.toLowerCase(r0)
            goto Lb
        L9:
            java.lang.String r1 = ""
        Lb:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static java.lang.String m17327(java.lang.String r0) {
            java.lang.String r0 = m17326(r0)
            java.lang.String r0 = r0.trim()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static java.lang.String m17328(java.lang.String r0, boolean r1) {
            if (r1 == 0) goto L7
            java.lang.String r0 = m17326(r0)
            goto Lb
        L7:
            java.lang.String r0 = m17327(r0)
        Lb:
            return r0
    }
}
