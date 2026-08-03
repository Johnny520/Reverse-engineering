package androidx.profileinstaller;

import Yue.ExecutorC6810;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Process;
import androidx.profileinstaller.C8896;

/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6391
    public static final String f3852 = "androidx.profileinstaller.action.INSTALL_PROFILE";

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC6391
    public static final String f3853 = "androidx.profileinstaller.action.SAVE_PROFILE";

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @InterfaceC6391
    public static final String f29842 = "androidx.profileinstaller.action.SKIP_FILE";

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @InterfaceC6391
    public static final String f29843 = "androidx.profileinstaller.action.BENCHMARK_OPERATION";

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    @InterfaceC6391
    public static final String f29844 = "EXTRA_SKIP_FILE_OPERATION";

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    @InterfaceC6391
    public static final String f29845 = "WRITE_SKIP_FILE";

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    @InterfaceC6391
    public static final String f29846 = "DELETE_SKIP_FILE";

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    @InterfaceC6391
    public static final String f29847 = "EXTRA_BENCHMARK_OPERATION";

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    @InterfaceC6391
    public static final String f29848 = "DROP_SHADER_CACHE";

    /* JADX INFO: renamed from: androidx.profileinstaller.ProfileInstallReceiver$ۥ */
    public class C1728 implements C8896.InterfaceC8898 {
        public C1728() {
        }

        @Override // androidx.profileinstaller.C8896.InterfaceC8898
        /* JADX INFO: renamed from: ۥ */
        public void mo4874(int i, @InterfaceC6490 Object obj) {
            C8896.f29863.mo4874(i, obj);
        }

        @Override // androidx.profileinstaller.C8896.InterfaceC8898
        /* JADX INFO: renamed from: ۥ۟ */
        public void mo4875(int i, @InterfaceC6490 Object obj) {
            C8896.f29863.mo4875(i, obj);
            ProfileInstallReceiver.this.setResultCode(i);
        }
    }

    /* JADX INFO: renamed from: ۥ */
    public static void m4873(@InterfaceC6391 C8896.InterfaceC8898 interfaceC8898) {
        Process.sendSignal(Process.myPid(), 10);
        interfaceC8898.mo4875(12, null);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@InterfaceC6391 Context context, @InterfaceC6490 Intent intent) {
        Bundle extras;
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if (f3852.equals(action)) {
            C8896.m30140(context, new ExecutorC6810(), new C1728(), true);
            return;
        }
        if (f29842.equals(action)) {
            Bundle extras2 = intent.getExtras();
            if (extras2 != null) {
                String string = extras2.getString(f29844);
                if (f29845.equals(string)) {
                    C8896.m30141(context, new ExecutorC6810(), new C1728());
                    return;
                } else {
                    if (f29846.equals(string)) {
                        C8896.m30130(context, new ExecutorC6810(), new C1728());
                        return;
                    }
                    return;
                }
            }
            return;
        }
        if (f3853.equals(action)) {
            m4873(new C1728());
            return;
        }
        if (!f29843.equals(action) || (extras = intent.getExtras()) == null) {
            return;
        }
        String string2 = extras.getString(f29847);
        C1728 c1728 = new C1728();
        if (f29848.equals(string2)) {
            C1731.m4882(context, c1728);
        } else {
            c1728.mo4875(16, null);
        }
    }
}
