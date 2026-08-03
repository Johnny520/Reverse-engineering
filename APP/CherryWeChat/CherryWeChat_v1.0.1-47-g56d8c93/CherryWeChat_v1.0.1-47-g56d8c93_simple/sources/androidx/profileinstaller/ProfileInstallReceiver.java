package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import java.io.File;
import p000.AbstractC0828TB;
import p000.AbstractC1406fG;
import p000.C1017Xm;
import p000.ExecutorC0037Au;

/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallReceiver extends BroadcastReceiver {
    public ProfileInstallReceiver() {
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context r4, Intent r5) {
        if (r5 == null) goto L52;
        String r0 = r5.getAction();
        if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(r0) == false) goto L9;
        AbstractC0828TB.m1634M(r4, new ExecutorC0037Au(), new C1017Xm(12, this), true);
        return;
    L9:
        if ("androidx.profileinstaller.action.SKIP_FILE".equals(r0) == false) goto L23;
        Bundle r52 = r5.getExtras();
        if (r52 == null) goto L46;
        String r53 = r52.getString("EXTRA_SKIP_FILE_OPERATION");
        if ("WRITE_SKIP_FILE".equals(r53) == false) goto L19;
        String r54 = r4.getApplicationContext().getPackageName();
        PackageInfo r55 = r4.getPackageManager().getPackageInfo(r54, 0);     // Catch: PackageManager.NameNotFoundException -> L17
        AbstractC0828TB.m1653w(r55, r4.getFilesDir());
        setResultCode(10);
        return;
    L17:
        setResultCode(7);
        return;
    L19:
        if ("DELETE_SKIP_FILE".equals(r53) == false) goto L49;
        new File(r4.getFilesDir(), "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
        setResultCode(11);
        return;
    L49:
        return;
    L46:
        return;
    L23:
        if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(r0) == false) goto L27;
        Process.sendSignal(Process.myPid(), 10);
        setResultCode(12);
        return;
    L27:
        if ("androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(r0) == false) goto L50;
        Bundle r56 = r5.getExtras();
        if (r56 != null) goto L31;
        return;
    L31:
        if ("DROP_SHADER_CACHE".equals(r56.getString("EXTRA_BENCHMARK_OPERATION")) == true) goto L33;
        setResultCode(16);
        return;
    L33:
        if (Build.VERSION.SDK_INT < 34) goto L35;
        File r42 = r4.createDeviceProtectedStorageContext().getCacheDir();
    L37:
        if (AbstractC1406fG.m2691Q(r42) == false) goto L40;
        setResultCode(14);
        return;
    L40:
        setResultCode(15);
        return;
    L35:
        r42 = r4.createDeviceProtectedStorageContext().getCodeCacheDir();
        goto L37
    L50:
        return;
    }
}
