package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۤ۠۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C4749 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final int f15071 = 0;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final int f15072 = -1;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final int f15073 = -2;

    /* JADX INFO: renamed from: Yue.ۥۡۤ۠۠$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface InterfaceC4750 {
    }

    public C4749() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static int m18940(@Yue.InterfaceC4410 android.content.Context r3, @Yue.InterfaceC4410 java.lang.String r4) {
            int r0 = android.os.Binder.getCallingPid()
            int r1 = android.os.Process.myPid()
            if (r0 != r1) goto Lf
            java.lang.String r0 = r3.getPackageName()
            goto L10
        Lf:
            r0 = 0
        L10:
            int r1 = android.os.Binder.getCallingPid()
            int r2 = android.os.Binder.getCallingUid()
            int r3 = m18942(r3, r4, r1, r2, r0)
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static int m18941(@Yue.InterfaceC4410 android.content.Context r2, @Yue.InterfaceC4410 java.lang.String r3, @Yue.InterfaceC4544 java.lang.String r4) {
            int r0 = android.os.Binder.getCallingPid()
            int r1 = android.os.Process.myPid()
            if (r0 != r1) goto Lc
            r2 = -1
            return r2
        Lc:
            int r0 = android.os.Binder.getCallingPid()
            int r1 = android.os.Binder.getCallingUid()
            int r2 = m18942(r2, r3, r0, r1, r4)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static int m18942(@Yue.InterfaceC4410 android.content.Context r2, @Yue.InterfaceC4410 java.lang.String r3, int r4, int r5, @Yue.InterfaceC4544 java.lang.String r6) {
            int r4 = r2.checkPermission(r3, r4, r5)
            r0 = -1
            if (r4 != r0) goto L8
            return r0
        L8:
            java.lang.String r3 = Yue.C0537.m1900(r3)
            r4 = 0
            if (r3 != 0) goto L10
            return r4
        L10:
            if (r6 != 0) goto L24
            android.content.pm.PackageManager r6 = r2.getPackageManager()
            java.lang.String[] r6 = r6.getPackagesForUid(r5)
            if (r6 == 0) goto L23
            int r1 = r6.length
            if (r1 > 0) goto L20
            goto L23
        L20:
            r6 = r6[r4]
            goto L24
        L23:
            return r0
        L24:
            int r0 = android.os.Process.myUid()
            java.lang.String r1 = r2.getPackageName()
            if (r0 != r5) goto L39
            boolean r0 = Yue.C4554.m18124(r1, r6)
            if (r0 == 0) goto L39
            int r2 = Yue.C0537.m1895(r2, r5, r3, r6)
            goto L3d
        L39:
            int r2 = Yue.C0537.m1899(r2, r3, r6)
        L3d:
            if (r2 != 0) goto L40
            goto L41
        L40:
            r4 = -2
        L41:
            return r4
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static int m18943(@Yue.InterfaceC4410 android.content.Context r3, @Yue.InterfaceC4410 java.lang.String r4) {
            int r0 = android.os.Process.myPid()
            int r1 = android.os.Process.myUid()
            java.lang.String r2 = r3.getPackageName()
            int r3 = m18942(r3, r4, r0, r1, r2)
            return r3
    }
}
