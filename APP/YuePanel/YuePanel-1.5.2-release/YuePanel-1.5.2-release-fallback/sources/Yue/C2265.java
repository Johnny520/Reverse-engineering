package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۡۢۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C2265 {
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final /* synthetic */ java.lang.String m10464(java.io.File r0, java.io.File r1, java.lang.String r2) {
            java.lang.String r0 = m10465(r0, r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final java.lang.String m10465(java.io.File r2, java.io.File r3, java.lang.String r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            if (r3 == 0) goto L1f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r1 = " -> "
            r2.append(r1)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.append(r2)
        L1f:
            if (r4 == 0) goto L35
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = ": "
            r2.append(r3)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r0.append(r2)
        L35:
            java.lang.String r2 = r0.toString()
            java.lang.String r3 = "sb.toString()"
            Yue.C3329.m13905(r2, r3)
            return r2
    }
}
