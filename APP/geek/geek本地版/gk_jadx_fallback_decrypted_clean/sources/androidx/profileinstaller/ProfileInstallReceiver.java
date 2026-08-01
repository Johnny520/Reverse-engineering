package androidx.profileinstaller;

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
            goto Lea
        L4:
            java.lang.String r0 = r7.getAction()
            java.lang.String r1 = "androidx.profileinstaller.action.INSTALL_PROFILE"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L21
            hy r7 = new hy
            r7.<init>()
            l0 r0 = new l0
            r1 = 24
            r0.<init>(r1, r5)
            r1 = 1
            defpackage.ff.X(r6, r7, r0, r1)
            return
        L21:
            java.lang.String r1 = "androidx.profileinstaller.action.SKIP_FILE"
            boolean r1 = r1.equals(r0)
            java.lang.String r2 = "ProfileInstaller"
            r3 = 10
            r4 = 0
            if (r1 == 0) goto L8e
            android.os.Bundle r7 = r7.getExtras()
            if (r7 == 0) goto Lea
            java.lang.String r0 = "EXTRA_SKIP_FILE_OPERATION"
            java.lang.String r7 = r7.getString(r0)
            java.lang.String r0 = "WRITE_SKIP_FILE"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L6d
            l0 r7 = new l0
            r0 = 24
            r7.<init>(r0, r5)
            android.content.Context r0 = r6.getApplicationContext()
            java.lang.String r0 = r0.getPackageName()
            android.content.pm.PackageManager r1 = r6.getPackageManager()
            r2 = 0
            android.content.pm.PackageInfo r0 = r1.getPackageInfo(r0, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L66
            java.io.File r6 = r6.getFilesDir()
            defpackage.ff.C(r0, r6)
            r7.i(r3, r4)
            goto Lea
        L66:
            r6 = move-exception
            r0 = 7
            r7.i(r0, r6)
            goto Lea
        L6d:
            java.lang.String r0 = "DELETE_SKIP_FILE"
            boolean r7 = r0.equals(r7)
            if (r7 == 0) goto Lea
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
            if (r0 == 0) goto Lea
            android.os.Bundle r7 = r7.getExtras()
            if (r7 == 0) goto Lea
            java.lang.String r0 = "EXTRA_BENCHMARK_OPERATION"
            java.lang.String r7 = r7.getString(r0)
            l0 r0 = new l0
            r1 = 24
            r0.<init>(r1, r5)
            java.lang.String r1 = "DROP_SHADER_CACHE"
            boolean r7 = r1.equals(r7)
            if (r7 == 0) goto Le5
            android.content.Context r6 = r6.createDeviceProtectedStorageContext()
            java.io.File r6 = r6.getCodeCacheDir()
            boolean r6 = defpackage.ip.q(r6)
            if (r6 == 0) goto Ldf
            r6 = 14
            r0.i(r6, r4)
            return
        Ldf:
            r6 = 15
            r0.i(r6, r4)
            return
        Le5:
            r6 = 16
            r0.i(r6, r4)
        Lea:
            return
    }
}
