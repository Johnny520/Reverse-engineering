package androidx.profileinstaller;

/* JADX INFO: renamed from: androidx.profileinstaller.ۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C7649 {

    /* JADX INFO: renamed from: androidx.profileinstaller.ۥ$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5336(api = 21)
    public static class C7650 {
        public C7650() {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static java.io.File m29537(android.content.Context r0) {
                java.io.File r0 = r0.getCodeCacheDir()
                return r0
        }
    }

    /* JADX INFO: renamed from: androidx.profileinstaller.ۥ$ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC5336(api = 24)
    public static class C7651 {
        public C7651() {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static java.io.File m29538(android.content.Context r0) {
                android.content.Context r0 = r0.createDeviceProtectedStorageContext()
                java.io.File r0 = r0.getCodeCacheDir()
                return r0
        }
    }

    public C7649() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static boolean m29535(java.io.File r6) {
            boolean r0 = r6.isDirectory()
            r1 = 1
            if (r0 == 0) goto L25
            java.io.File[] r6 = r6.listFiles()
            r0 = 0
            if (r6 != 0) goto Lf
            return r0
        Lf:
            int r2 = r6.length
            r3 = r0
            r4 = r1
        L12:
            if (r3 >= r2) goto L24
            r5 = r6[r3]
            boolean r5 = m29535(r5)
            if (r5 == 0) goto L20
            if (r4 == 0) goto L20
            r4 = r1
            goto L21
        L20:
            r4 = r0
        L21:
            int r3 = r3 + 1
            goto L12
        L24:
            return r4
        L25:
            r6.delete()
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static void m29536(@Yue.InterfaceC4410 android.content.Context r1, @Yue.InterfaceC4410 androidx.profileinstaller.ProfileInstallReceiver.C7645 r2) {
            java.io.File r1 = androidx.profileinstaller.C7649.C7651.m29538(r1)
            boolean r1 = m29535(r1)
            r0 = 0
            if (r1 == 0) goto L11
            r1 = 14
            r2.mo29520(r1, r0)
            goto L16
        L11:
            r1 = 15
            r2.mo29520(r1, r0)
        L16:
            return
    }
}
