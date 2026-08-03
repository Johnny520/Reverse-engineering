package Yue;

/* JADX INFO: renamed from: Yue.ۥۢ۟ۤ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C5845 {
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final /* synthetic */ <T> T[] m21732(android.text.Spanned r2, int r3, int r4) {
            r0 = 4
            java.lang.String r1 = "T"
            Yue.C3329.m13915(r0, r1)
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.Object[] r2 = r2.getSpans(r3, r4, r0)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static /* synthetic */ java.lang.Object[] m21733(android.text.Spanned r0, int r1, int r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L5
            r1 = 0
        L5:
            r3 = r3 & 2
            if (r3 == 0) goto Ld
            int r2 = r0.length()
        Ld:
            r3 = 4
            java.lang.String r4 = "T"
            Yue.C3329.m13915(r3, r4)
            java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
            java.lang.Object[] r0 = r0.getSpans(r1, r2, r3)
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final android.text.Spanned m21734(@Yue.InterfaceC4418 java.lang.CharSequence r0) {
            android.text.SpannedString r0 = android.text.SpannedString.valueOf(r0)
            return r0
    }
}
