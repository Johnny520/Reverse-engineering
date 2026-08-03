package p000;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c4 {
    static {
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static boolean m101(int r0) {
            r0 = r0 & 4
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static boolean m102(int r1) {
            r0 = 1
            r1 = r1 & r0
            if (r1 != 0) goto L5
            goto L6
        L5:
            r0 = 0
        L6:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static boolean m103(int r0) {
            r0 = r0 & 2
            if (r0 != 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public static /* synthetic */ int m104(int r3) {
            r0 = 3
            r1 = 1
            if (r3 != r1) goto L5
            return r0
        L5:
            r2 = 2
            if (r3 != r2) goto L9
            return r1
        L9:
            if (r3 != r0) goto Lc
            return r2
        Lc:
            r3 = 0
            throw r3
    }

    /* JADX INFO: renamed from: ۥ۟ۡ, reason: contains not printable characters */
    public static /* synthetic */ int m105(int r1) {
            r0 = 1
            if (r1 != r0) goto L6
            r1 = 96
            return r1
        L6:
            r0 = 2
            if (r1 != r0) goto Lc
            r1 = 384(0x180, float:5.38E-43)
            return r1
        Lc:
            r0 = 3
            if (r1 != r0) goto L11
            r1 = -1
            return r1
        L11:
            r1 = 0
            throw r1
    }

    /* JADX INFO: renamed from: ۥ۟ۢ, reason: contains not printable characters */
    public static /* synthetic */ int m106(int r1) {
            r0 = 1
            if (r1 != r0) goto L6
            r1 = 96
            return r1
        L6:
            r0 = 2
            if (r1 != r0) goto Lc
            r1 = 512(0x200, float:7.17E-43)
            return r1
        Lc:
            r0 = 3
            if (r1 != r0) goto L11
            r1 = -1
            return r1
        L11:
            r1 = 0
            throw r1
    }

    /* JADX INFO: renamed from: ۥۣ۟, reason: contains not printable characters */
    public static float m107(int r1, float r2) {
            android.content.res.Resources r0 = android.content.res.Resources.getSystem()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r1 = android.util.TypedValue.applyDimension(r1, r2, r0)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟ۤ, reason: contains not printable characters */
    public static java.lang.StringBuilder m108(java.lang.String r1) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟ۥ, reason: contains not printable characters */
    public static /* synthetic */ int m109(int r0) {
            if (r0 == 0) goto L5
            int r0 = r0 + (-1)
            return r0
        L5:
            r0 = 0
            throw r0
    }
}
