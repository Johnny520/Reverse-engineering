package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Process;
import android.util.Log;
import java.io.File;
import p000.AbstractC0259gf;
import p000.AbstractC0493mp;
import p000.C0431l0;
import p000.ExecutorC0613py;

/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Bundle extras;
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
            AbstractC0259gf.m1246d0(context, new ExecutorC0613py(), new C0431l0(24, this), true);
            return;
        }
        if ("androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
            Bundle extras2 = intent.getExtras();
            if (extras2 != null) {
                String string = extras2.getString("EXTRA_SKIP_FILE_OPERATION");
                if (!"WRITE_SKIP_FILE".equals(string)) {
                    if ("DELETE_SKIP_FILE".equals(string)) {
                        new File(context.getFilesDir(), "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
                        Log.d("ProfileInstaller", "RESULT_DELETE_SKIP_FILE_SUCCESS");
                        setResultCode(11);
                        return;
                    }
                    return;
                }
                C0431l0 c0431l0 = new C0431l0(24, this);
                try {
                    AbstractC0259gf.m1232I(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
                    c0431l0.mo1721i(10, null);
                    return;
                } catch (PackageManager.NameNotFoundException e) {
                    c0431l0.mo1721i(7, e);
                    return;
                }
            }
            return;
        }
        if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
            Process.sendSignal(Process.myPid(), 10);
            Log.d("ProfileInstaller", "");
            setResultCode(12);
        } else {
            if (!"androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) || (extras = intent.getExtras()) == null) {
                return;
            }
            String string2 = extras.getString("EXTRA_BENCHMARK_OPERATION");
            C0431l0 c0431l02 = new C0431l0(24, this);
            if (!"DROP_SHADER_CACHE".equals(string2)) {
                c0431l02.mo1721i(16, null);
            } else if (AbstractC0493mp.m1860j(context.createDeviceProtectedStorageContext().getCodeCacheDir())) {
                c0431l02.mo1721i(14, null);
            } else {
                c0431l02.mo1721i(15, null);
            }
        }
    }
}
