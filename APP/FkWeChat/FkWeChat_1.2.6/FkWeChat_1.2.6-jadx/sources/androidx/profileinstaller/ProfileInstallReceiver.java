package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Process;
import androidx.profileinstaller.AbstractC0696c;
import p168l4.ExecutorC4627e;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: androidx.profileinstaller.ProfileInstallReceiver$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public class C0691a implements AbstractC0696c.c {
        public C0691a() {
        }

        @Override // androidx.profileinstaller.AbstractC0696c.c
        /* JADX INFO: renamed from: a */
        public void mo2717a(int i10, Object obj) {
            AbstractC0696c.f2037b.mo2717a(i10, obj);
        }

        @Override // androidx.profileinstaller.AbstractC0696c.c
        /* JADX INFO: renamed from: b */
        public void mo2718b(int i10, Object obj) {
            AbstractC0696c.f2037b.mo2718b(i10, obj);
            ProfileInstallReceiver.this.setResultCode(i10);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m2715a(int i10, AbstractC0696c.c cVar) {
        Process.sendSignal(i10, 10);
        cVar.mo2718b(12, null);
    }

    /* JADX INFO: renamed from: b */
    public static void m2716b(AbstractC0696c.c cVar) {
        m2715a(Process.myPid(), cVar);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Bundle extras;
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
            AbstractC0696c.m2752j(context, new ExecutorC4627e(), new C0691a(), true);
            return;
        }
        if ("androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
            Bundle extras2 = intent.getExtras();
            if (extras2 != null) {
                String string = extras2.getString("EXTRA_SKIP_FILE_OPERATION");
                if ("WRITE_SKIP_FILE".equals(string)) {
                    AbstractC0696c.m2753k(context, new ExecutorC4627e(), new C0691a());
                    return;
                } else {
                    if ("DELETE_SKIP_FILE".equals(string)) {
                        AbstractC0696c.m2745c(context, new ExecutorC4627e(), new C0691a());
                        return;
                    }
                    return;
                }
            }
            return;
        }
        if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
            m2716b(new C0691a());
            return;
        }
        if (!"androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) || (extras = intent.getExtras()) == null) {
            return;
        }
        String string2 = extras.getString("EXTRA_BENCHMARK_OPERATION");
        C0691a c0691a = new C0691a();
        if ("DROP_SHADER_CACHE".equals(string2)) {
            AbstractC0694a.m2727b(context, c0691a);
        } else if ("SAVE_PROFILE".equals(string2)) {
            m2715a(extras.getInt("EXTRA_PID", Process.myPid()), c0691a);
        } else {
            c0691a.mo2718b(16, null);
        }
    }
}
