package androidx.profileinstaller;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
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
            goto Lf9
        L4:
            java.lang.String r0 = r7.getAction()
            java.lang.String r1 = "androidx.profileinstaller.action.INSTALL_PROFILE"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L21
            t3.d r7 = new t3.d
            r7.<init>()
            m.a r0 = new m.a
            r1 = 18
            r0.<init>(r5, r1)
            r1 = 1
            t3.f.t(r6, r7, r0, r1)
            return
        L21:
            java.lang.String r1 = "androidx.profileinstaller.action.SKIP_FILE"
            boolean r1 = r1.equals(r0)
            java.lang.String r2 = "ProfileInstaller"
            r3 = 10
            r4 = 0
            if (r1 == 0) goto L8e
            android.os.Bundle r7 = r7.getExtras()
            if (r7 == 0) goto Lf9
            java.lang.String r0 = "EXTRA_SKIP_FILE_OPERATION"
            java.lang.String r7 = r7.getString(r0)
            java.lang.String r0 = "WRITE_SKIP_FILE"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L6d
            m.a r7 = new m.a
            r0 = 18
            r7.<init>(r5, r0)
            android.content.Context r0 = r6.getApplicationContext()
            java.lang.String r0 = r0.getPackageName()
            android.content.pm.PackageManager r1 = r6.getPackageManager()
            r2 = 0
            android.content.pm.PackageInfo r0 = r1.getPackageInfo(r0, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L66
            java.io.File r6 = r6.getFilesDir()
            t3.f.e(r0, r6)
            r7.c(r3, r4)
            goto Lf9
        L66:
            r6 = move-exception
            r0 = 7
            r7.c(r0, r6)
            goto Lf9
        L6d:
            java.lang.String r0 = "DELETE_SKIP_FILE"
            boolean r7 = r0.equals(r7)
            if (r7 == 0) goto Lf9
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
        L8e:
            java.lang.String r1 = "androidx.profileinstaller.action.SAVE_PROFILE"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto La8
            int r6 = android.os.Process.myPid()
            android.os.Process.sendSignal(r6, r3)
            java.lang.String r6 = ""
            android.util.Log.d(r2, r6)
            r6 = 12
            r5.setResultCode(r6)
            return
        La8:
            java.lang.String r1 = "androidx.profileinstaller.action.BENCHMARK_OPERATION"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Lf9
            android.os.Bundle r7 = r7.getExtras()
            if (r7 == 0) goto Lf9
            java.lang.String r0 = "EXTRA_BENCHMARK_OPERATION"
            java.lang.String r7 = r7.getString(r0)
            m.a r0 = new m.a
            r1 = 18
            r0.<init>(r5, r1)
            java.lang.String r1 = "DROP_SHADER_CACHE"
            boolean r7 = r1.equals(r7)
            if (r7 == 0) goto Lf4
            int r7 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r7 < r1) goto Lda
            android.content.Context r6 = r6.createDeviceProtectedStorageContext()
            java.io.File r6 = r6.getCacheDir()
            goto Le2
        Lda:
            android.content.Context r6 = r6.createDeviceProtectedStorageContext()
            java.io.File r6 = r6.getCodeCacheDir()
        Le2:
            boolean r6 = t3.f.c(r6)
            if (r6 == 0) goto Lee
            r6 = 14
            r0.c(r6, r4)
            return
        Lee:
            r6 = 15
            r0.c(r6, r4)
            return
        Lf4:
            r6 = 16
            r0.c(r6, r4)
        Lf9:
            return
    }
}
