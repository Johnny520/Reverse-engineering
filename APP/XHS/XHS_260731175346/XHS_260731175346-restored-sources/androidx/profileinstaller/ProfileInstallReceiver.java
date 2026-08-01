package androidx.profileinstaller;

/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
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
            goto Ld9
        L4:
            java.lang.String r0 = r7.getAction()
            java.lang.String r1 = "androidx.profileinstaller.action.INSTALL_PROFILE"
            boolean r1 = r1.equals(r0)
            r2 = 17
            if (r1 == 0) goto L21
            xhss.ᛲᲀᛸᛶ r7 = new xhss.ᛲᲀᛸᛶ
            r7.<init>()
            xhss.ᲇᛵᛲᲁ r0 = new xhss.ᲇᛵᛲᲁ
            r0.<init>(r2, r5)
            r5 = 1
            xhss.AbstractC0007.m99(r6, r7, r0, r5)
            return
        L21:
            java.lang.String r1 = "androidx.profileinstaller.action.SKIP_FILE"
            boolean r1 = r1.equals(r0)
            r3 = 10
            r4 = 0
            if (r1 == 0) goto L84
            android.os.Bundle r7 = r7.getExtras()
            if (r7 == 0) goto Ld9
            java.lang.String r0 = "EXTRA_SKIP_FILE_OPERATION"
            java.lang.String r7 = r7.getString(r0)
            java.lang.String r0 = "WRITE_SKIP_FILE"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L68
            xhss.ᲇᛵᛲᲁ r7 = new xhss.ᲇᛵᛲᲁ
            r7.<init>(r2, r5)
            android.content.Context r5 = r6.getApplicationContext()
            java.lang.String r5 = r5.getPackageName()
            android.content.pm.PackageManager r0 = r6.getPackageManager()
            r1 = 0
            android.content.pm.PackageInfo r5 = r0.getPackageInfo(r5, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L62
            java.io.File r6 = r6.getFilesDir()
            xhss.AbstractC0007.m101(r5, r6)
            r7.mo1032(r3, r4)
            goto Ld9
        L62:
            r5 = move-exception
            r6 = 7
            r7.mo1032(r6, r5)
            goto Ld9
        L68:
            java.lang.String r0 = "DELETE_SKIP_FILE"
            boolean r7 = r0.equals(r7)
            if (r7 == 0) goto Ld9
            java.io.File r6 = r6.getFilesDir()
            java.io.File r7 = new java.io.File
            java.lang.String r0 = "profileinstaller_profileWrittenFor_lastUpdateTime.dat"
            r7.<init>(r6, r0)
            r7.delete()
            r6 = 11
            r5.setResultCode(r6)
            return
        L84:
            java.lang.String r1 = "androidx.profileinstaller.action.SAVE_PROFILE"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L99
            int r6 = android.os.Process.myPid()
            android.os.Process.sendSignal(r6, r3)
            r6 = 12
            r5.setResultCode(r6)
            return
        L99:
            java.lang.String r1 = "androidx.profileinstaller.action.BENCHMARK_OPERATION"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Ld9
            android.os.Bundle r7 = r7.getExtras()
            if (r7 == 0) goto Ld9
            java.lang.String r0 = "EXTRA_BENCHMARK_OPERATION"
            java.lang.String r7 = r7.getString(r0)
            xhss.ᲇᛵᛲᲁ r0 = new xhss.ᲇᛵᛲᲁ
            r0.<init>(r2, r5)
            java.lang.String r5 = "DROP_SHADER_CACHE"
            boolean r5 = r5.equals(r7)
            if (r5 == 0) goto Ld4
            android.content.Context r5 = r6.createDeviceProtectedStorageContext()
            java.io.File r5 = r5.getCodeCacheDir()
            boolean r5 = xhss.AbstractC0473.m870(r5)
            if (r5 == 0) goto Lce
            r5 = 14
            r0.mo1032(r5, r4)
            return
        Lce:
            r5 = 15
            r0.mo1032(r5, r4)
            return
        Ld4:
            r5 = 16
            r0.mo1032(r5, r4)
        Ld9:
            return
    }
}
