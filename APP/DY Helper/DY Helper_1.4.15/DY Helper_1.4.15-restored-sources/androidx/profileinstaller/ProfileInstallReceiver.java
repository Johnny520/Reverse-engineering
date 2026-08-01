package androidx.profileinstaller;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallReceiver extends android.content.BroadcastReceiver {
    public ProfileInstallReceiver() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context r6, android.content.Intent r7) {
            r5 = this;
            if (r7 != 0) goto L4
            goto Lf3
        L4:
            java.lang.String r0 = r7.getAction()
            java.lang.String r1 = "androidx.profileinstaller.action.INSTALL_PROFILE"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L1f
            gj1 r7 = new gj1
            r7.<init>()
            y21 r0 = new y21
            r0.<init>(r5)
            r5 = 1
            p000.AbstractC0978xb.m6605(r6, r7, r0, r5)
            return
        L1f:
            java.lang.String r1 = "androidx.profileinstaller.action.SKIP_FILE"
            boolean r1 = r1.equals(r0)
            java.lang.String r2 = "ProfileInstaller"
            r3 = 10
            r4 = 0
            if (r1 == 0) goto L8a
            android.os.Bundle r7 = r7.getExtras()
            if (r7 == 0) goto Lf3
            java.lang.String r0 = "EXTRA_SKIP_FILE_OPERATION"
            java.lang.String r7 = r7.getString(r0)
            java.lang.String r0 = "WRITE_SKIP_FILE"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L69
            y21 r7 = new y21
            r7.<init>(r5)
            android.content.Context r5 = r6.getApplicationContext()
            java.lang.String r5 = r5.getPackageName()
            android.content.pm.PackageManager r0 = r6.getPackageManager()
            r1 = 0
            android.content.pm.PackageInfo r5 = r0.getPackageInfo(r5, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L62
            java.io.File r6 = r6.getFilesDir()
            p000.AbstractC0978xb.m6571(r5, r6)
            r7.mo2512(r3, r4)
            goto Lf3
        L62:
            r5 = move-exception
            r6 = 7
            r7.mo2512(r6, r5)
            goto Lf3
        L69:
            java.lang.String r0 = "DELETE_SKIP_FILE"
            boolean r7 = r0.equals(r7)
            if (r7 == 0) goto Lf3
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
            if (r0 == 0) goto Lf3
            android.os.Bundle r7 = r7.getExtras()
            if (r7 == 0) goto Lf3
            java.lang.String r0 = "EXTRA_BENCHMARK_OPERATION"
            java.lang.String r7 = r7.getString(r0)
            y21 r0 = new y21
            r0.<init>(r5)
            java.lang.String r5 = "DROP_SHADER_CACHE"
            boolean r5 = r5.equals(r7)
            if (r5 == 0) goto Lee
            int r5 = android.os.Build.VERSION.SDK_INT
            r7 = 34
            if (r5 < r7) goto Ld4
            android.content.Context r5 = r6.createDeviceProtectedStorageContext()
            java.io.File r5 = r5.getCacheDir()
            goto Ldc
        Ld4:
            android.content.Context r5 = r6.createDeviceProtectedStorageContext()
            java.io.File r5 = r5.getCodeCacheDir()
        Ldc:
            boolean r5 = p000.jx0.m3054(r5)
            if (r5 == 0) goto Le8
            r5 = 14
            r0.mo2512(r5, r4)
            return
        Le8:
            r5 = 15
            r0.mo2512(r5, r4)
            return
        Lee:
            r5 = 16
            r0.mo2512(r5, r4)
        Lf3:
            return
    }
}
