package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Process;
import java.io.File;
import p006D.C0095d;
import p034S.AbstractC0327g;
import p034S.ExecutorC0325e;

/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallReceiver extends BroadcastReceiver {
    public ProfileInstallReceiver() {
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context r4, Intent r5) {
        if (r5 != null) goto L4;
        return;
    L4:
        String r02 = r5.getAction();
        if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(r02) == false) goto L8;
        AbstractC0327g.m746s(r4, new ExecutorC0325e(), new C0095d(10, this), true);
        return;
    L8:
        if ("androidx.profileinstaller.action.SKIP_FILE".equals(r02) == false) goto L21;
        Bundle r52 = r5.getExtras();
        if (r52 == null) goto L38;
        String r53 = r52.getString("EXTRA_SKIP_FILE_OPERATION");
        if ("WRITE_SKIP_FILE".equals(r53) == false) goto L18;
        String r54 = r4.getApplicationContext().getPackageName();
        PackageInfo r55 = r4.getPackageManager().getPackageInfo(r54, 0);     // Catch: PackageManager.NameNotFoundException -> L16
        AbstractC0327g.m732e(r55, r4.getFilesDir());
        setResultCode(10);
        return;
    L16:
        setResultCode(7);
        return;
    L18:
        if ("DELETE_SKIP_FILE".equals(r53) == false) goto L41;
        new File(r4.getFilesDir(), "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
        setResultCode(11);
        return;
    L41:
        return;
    L38:
        return;
    L21:
        if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(r02) == false) goto L24;
        Process.sendSignal(Process.myPid(), 10);
        setResultCode(12);
        return;
    L24:
        if ("androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(r02) == false) goto L44;
        Bundle r56 = r5.getExtras();
        if (r56 != null) goto L28;
        return;
    L28:
        if ("DROP_SHADER_CACHE".equals(r56.getString("EXTRA_BENCHMARK_OPERATION")) == true) goto L30;
        setResultCode(16);
        return;
    L30:
        if (AbstractC0327g.m730c(r4.createDeviceProtectedStorageContext().getCodeCacheDir()) == false) goto L32;
        setResultCode(14);
        return;
    L32:
        setResultCode(15);
        return;
    }
}
