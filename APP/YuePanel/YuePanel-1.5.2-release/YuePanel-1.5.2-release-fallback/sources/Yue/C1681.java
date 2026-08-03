package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C1681 {
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final byte[] m8068(@Yue.InterfaceC4418 android.database.Cursor r1, int r2) {
            boolean r0 = r1.isNull(r2)
            if (r0 == 0) goto L8
            r1 = 0
            goto Lc
        L8:
            byte[] r1 = r1.getBlob(r2)
        Lc:
            return r1
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final java.lang.Double m8069(@Yue.InterfaceC4418 android.database.Cursor r1, int r2) {
            boolean r0 = r1.isNull(r2)
            if (r0 == 0) goto L8
            r1 = 0
            goto L10
        L8:
            double r1 = r1.getDouble(r2)
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
        L10:
            return r1
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final java.lang.Float m8070(@Yue.InterfaceC4418 android.database.Cursor r1, int r2) {
            boolean r0 = r1.isNull(r2)
            if (r0 == 0) goto L8
            r1 = 0
            goto L10
        L8:
            float r1 = r1.getFloat(r2)
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
        L10:
            return r1
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final java.lang.Integer m8071(@Yue.InterfaceC4418 android.database.Cursor r1, int r2) {
            boolean r0 = r1.isNull(r2)
            if (r0 == 0) goto L8
            r1 = 0
            goto L10
        L8:
            int r1 = r1.getInt(r2)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
        L10:
            return r1
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final java.lang.Long m8072(@Yue.InterfaceC4418 android.database.Cursor r1, int r2) {
            boolean r0 = r1.isNull(r2)
            if (r0 == 0) goto L8
            r1 = 0
            goto L10
        L8:
            long r1 = r1.getLong(r2)
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
        L10:
            return r1
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final java.lang.Short m8073(@Yue.InterfaceC4418 android.database.Cursor r1, int r2) {
            boolean r0 = r1.isNull(r2)
            if (r0 == 0) goto L8
            r1 = 0
            goto L10
        L8:
            short r1 = r1.getShort(r2)
            java.lang.Short r1 = java.lang.Short.valueOf(r1)
        L10:
            return r1
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final java.lang.String m8074(@Yue.InterfaceC4418 android.database.Cursor r1, int r2) {
            boolean r0 = r1.isNull(r2)
            if (r0 == 0) goto L8
            r1 = 0
            goto Lc
        L8:
            java.lang.String r1 = r1.getString(r2)
        Lc:
            return r1
    }
}
