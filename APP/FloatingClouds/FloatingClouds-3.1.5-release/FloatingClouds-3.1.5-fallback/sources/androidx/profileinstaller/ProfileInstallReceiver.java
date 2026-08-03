package androidx.profileinstaller;

/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallReceiver extends android.content.BroadcastReceiver {

    public class a implements androidx.profileinstaller.c.InterfaceC0021c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.profileinstaller.ProfileInstallReceiver f946a;

        public a(androidx.profileinstaller.ProfileInstallReceiver r1) {
                r0 = this;
                r0.<init>()
                r0.f946a = r1
                return
        }

        @Override // androidx.profileinstaller.c.InterfaceC0021c
        public final void a(int r4, java.io.Serializable r5) {
                r3 = this;
                switch(r4) {
                    case 1: goto L21;
                    case 2: goto L1e;
                    case 3: goto L1b;
                    case 4: goto L18;
                    case 5: goto L15;
                    case 6: goto L12;
                    case 7: goto Lf;
                    case 8: goto Lc;
                    case 9: goto L3;
                    case 10: goto L9;
                    case 11: goto L6;
                    default: goto L3;
                }
            L3:
                java.lang.String r0 = ""
                goto L23
            L6:
                java.lang.String r0 = "RESULT_DELETE_SKIP_FILE_SUCCESS"
                goto L23
            L9:
                java.lang.String r0 = "RESULT_INSTALL_SKIP_FILE_SUCCESS"
                goto L23
            Lc:
                java.lang.String r0 = "RESULT_PARSE_EXCEPTION"
                goto L23
            Lf:
                java.lang.String r0 = "RESULT_IO_EXCEPTION"
                goto L23
            L12:
                java.lang.String r0 = "RESULT_BASELINE_PROFILE_NOT_FOUND"
                goto L23
            L15:
                java.lang.String r0 = "RESULT_DESIRED_FORMAT_UNSUPPORTED"
                goto L23
            L18:
                java.lang.String r0 = "RESULT_NOT_WRITABLE"
                goto L23
            L1b:
                java.lang.String r0 = "RESULT_UNSUPPORTED_ART_VERSION"
                goto L23
            L1e:
                java.lang.String r0 = "RESULT_ALREADY_INSTALLED"
                goto L23
            L21:
                java.lang.String r0 = "RESULT_INSTALL_SUCCESS"
            L23:
                r1 = 6
                java.lang.String r2 = "ProfileInstaller"
                if (r4 == r1) goto L33
                r1 = 7
                if (r4 == r1) goto L33
                r1 = 8
                if (r4 == r1) goto L33
                android.util.Log.d(r2, r0)
                goto L38
            L33:
                java.lang.Throwable r5 = (java.lang.Throwable) r5
                android.util.Log.e(r2, r0, r5)
            L38:
                androidx.profileinstaller.ProfileInstallReceiver r5 = r3.f946a
                r5.setResultCode(r4)
                return
        }

        @Override // androidx.profileinstaller.c.InterfaceC0021c
        public final void b() {
                r2 = this;
                java.lang.String r0 = "ProfileInstaller"
                java.lang.String r1 = "DIAGNOSTIC_PROFILE_IS_COMPRESSED"
                android.util.Log.d(r0, r1)
                return
        }
    }

    public ProfileInstallReceiver() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context r6, android.content.Intent r7) {
            r5 = this;
            if (r7 != 0) goto L4
            goto Le4
        L4:
            java.lang.String r0 = r7.getAction()
            java.lang.String r1 = "androidx.profileinstaller.action.INSTALL_PROFILE"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L1f
            a.Ic r7 = new a.Ic
            r7.<init>()
            androidx.profileinstaller.ProfileInstallReceiver$a r0 = new androidx.profileinstaller.ProfileInstallReceiver$a
            r0.<init>(r5)
            r1 = 1
            androidx.profileinstaller.c.b(r6, r7, r0, r1)
            return
        L1f:
            java.lang.String r1 = "androidx.profileinstaller.action.SKIP_FILE"
            boolean r1 = r1.equals(r0)
            java.lang.String r2 = "ProfileInstaller"
            r3 = 10
            r4 = 0
            if (r1 == 0) goto L8a
            android.os.Bundle r7 = r7.getExtras()
            if (r7 == 0) goto Le4
            java.lang.String r0 = "EXTRA_SKIP_FILE_OPERATION"
            java.lang.String r7 = r7.getString(r0)
            java.lang.String r0 = "WRITE_SKIP_FILE"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L69
            androidx.profileinstaller.ProfileInstallReceiver$a r7 = new androidx.profileinstaller.ProfileInstallReceiver$a
            r7.<init>(r5)
            android.content.Context r0 = r6.getApplicationContext()
            java.lang.String r0 = r0.getPackageName()
            android.content.pm.PackageManager r1 = r6.getPackageManager()
            r2 = 0
            android.content.pm.PackageInfo r0 = r1.getPackageInfo(r0, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L62
            java.io.File r6 = r6.getFilesDir()
            androidx.profileinstaller.c.a(r0, r6)
            r7.a(r3, r4)
            goto Le4
        L62:
            r6 = move-exception
            r0 = 7
            r7.a(r0, r6)
            goto Le4
        L69:
            java.lang.String r0 = "DELETE_SKIP_FILE"
            boolean r7 = r0.equals(r7)
            if (r7 == 0) goto Le4
            java.io.File r6 = r6.getFilesDir()
            java.io.File r7 = new java.io.File
            java.lang.String r0 = "profileinstaller_profileWrittenFor_lastUpdateTime.dat"
            r7.<init>(r6, r0)
            r7.delete()
            java.lang.String r6 = "RESULT_DELETE_SKIP_FILE_SUCCESS"
            android.util.Log.d(r2, r6)
            r6 = 11
            r5.setResultCode(r6)
            return
        L8a:
            java.lang.String r1 = "androidx.profileinstaller.action.SAVE_PROFILE"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto La4
            int r6 = android.os.Process.myPid()
            android.os.Process.sendSignal(r6, r3)
            java.lang.String r6 = ""
            android.util.Log.d(r2, r6)
            r6 = 12
            r5.setResultCode(r6)
            return
        La4:
            java.lang.String r1 = "androidx.profileinstaller.action.BENCHMARK_OPERATION"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Le4
            android.os.Bundle r7 = r7.getExtras()
            if (r7 == 0) goto Le4
            java.lang.String r0 = "EXTRA_BENCHMARK_OPERATION"
            java.lang.String r7 = r7.getString(r0)
            androidx.profileinstaller.ProfileInstallReceiver$a r0 = new androidx.profileinstaller.ProfileInstallReceiver$a
            r0.<init>(r5)
            java.lang.String r1 = "DROP_SHADER_CACHE"
            boolean r7 = r1.equals(r7)
            if (r7 == 0) goto Ldf
            android.content.Context r6 = r6.createDeviceProtectedStorageContext()
            java.io.File r6 = r6.getCodeCacheDir()
            boolean r6 = androidx.profileinstaller.a.a(r6)
            if (r6 == 0) goto Ld9
            r6 = 14
            r0.a(r6, r4)
            return
        Ld9:
            r6 = 15
            r0.a(r6, r4)
            return
        Ldf:
            r6 = 16
            r0.a(r6, r4)
        Le4:
            return
    }
}
