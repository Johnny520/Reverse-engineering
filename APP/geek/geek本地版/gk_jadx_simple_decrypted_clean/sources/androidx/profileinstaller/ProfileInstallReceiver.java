package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Process;
import android.util.Log;
import defpackage.ff;
import defpackage.hy;
import defpackage.ip;
import defpackage.l0;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallReceiver extends BroadcastReceiver {
    public ProfileInstallReceiver() {
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context r6, Intent r7) {
        if (r7 == null) goto L49;
        String r0 = r7.getAction();
        if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(r0) == false) goto L9;
        ff.X(r6, new hy(), new l0(24, this), true);
        return;
    L9:
        if ("androidx.profileinstaller.action.SKIP_FILE".equals(r0) == false) goto L24;
        Bundle r72 = r7.getExtras();
        if (r72 == null) goto L43;
        String r73 = r72.getString("EXTRA_SKIP_FILE_OPERATION");
        if ("WRITE_SKIP_FILE".equals(r73) == false) goto L20;
        l0 r74 = new l0(24, this);
        String r02 = r6.getApplicationContext().getPackageName();
        PackageInfo r03 = r6.getPackageManager().getPackageInfo(r02, 0);     // Catch: PackageManager.NameNotFoundException -> L17
        ff.C(r03, r6.getFilesDir());
        r74.i(10, null);
        return;
    L17:
        e = move-exception;
        r74.i(7, e);
        return;
    L20:
        if ("DELETE_SKIP_FILE".equals(r73) == false) goto L46;
        new File(r6.getFilesDir(), "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
        Log.d("ProfileInstaller", "RESULT_DELETE_SKIP_FILE_SUCCESS");
        setResultCode(11);
        return;
    L46:
        return;
    L43:
        return;
    L24:
        if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(r0) == false) goto L28;
        Process.sendSignal(Process.myPid(), 10);
        Log.d("ProfileInstaller", "");
        setResultCode(12);
        return;
    L28:
        if ("androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(r0) == false) goto L47;
        Bundle r75 = r7.getExtras();
        if (r75 == null) goto L48;
        String r76 = r75.getString("EXTRA_BENCHMARK_OPERATION");
        l0 r04 = new l0(24, this);
        if ("DROP_SHADER_CACHE".equals(r76) == true) goto L34;
        r04.i(16, null);
        return;
    L34:
        if (ip.q(r6.createDeviceProtectedStorageContext().getCodeCacheDir()) == false) goto L37;
        r04.i(14, null);
        return;
    L37:
        r04.i(15, null);
        return;
    L48:
        return;
    L47:
        return;
    }
}
