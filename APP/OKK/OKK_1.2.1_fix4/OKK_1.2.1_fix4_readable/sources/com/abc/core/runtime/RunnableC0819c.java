package com.abc.core.runtime;

import android.app.Activity;
import android.widget.Toast;
import com.abc.internal.probe.AppFingerprint;
import p001A0.AbstractC0040p;
import p007D0.AbstractC0141g;
import p007D0.C0146l;
import p031Q0.AbstractC0307g;
import p037U.AbstractC0358S;

/* JADX INFO: renamed from: f0.c */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0819c implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2972a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ DialogC0823e f2973b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AppFingerprint f2974c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Activity f2975d;

    public /* synthetic */ RunnableC0819c(DialogC0823e dialogC0823e, AppFingerprint appFingerprint, Activity activity, int i2) {
        this.f2972a = i2;
        this.f2973b = dialogC0823e;
        this.f2974c = appFingerprint;
        this.f2975d = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object objM116u;
        switch (this.f2972a) {
            case 0:
                DialogC0823e dialogC0823e = this.f2973b;
                AppFingerprint appFingerprint = this.f2974c;
                Activity activity = this.f2975d;
                AbstractC0307g.m703e(dialogC0823e, "$progress");
                AbstractC0307g.m703e(appFingerprint, "$merged");
                AbstractC0307g.m703e(activity, "$activity");
                dialogC0823e.m2131a();
                HookDiagnostics.f3003d.set(true);
                AbstractC0358S.f729i = false;
                AbstractC0358S.f728h = false;
                AbstractC0358S.m865O(appFingerprint.f1638a);
                AbstractC0358S.m888g0(appFingerprint);
                try {
                    new DialogC0827g(activity, appFingerprint).show();
                    objM116u = C0146l.f339a;
                } catch (Throwable th) {
                    objM116u = AbstractC0040p.m116u(th);
                }
                if (AbstractC0141g.m465a(objM116u) != null) {
                    Toast.makeText(activity, "适配完成 " + appFingerprint.m1361e(), 1).show();
                }
                HookDiagnostics.f3004e.set(false);
                HookDiagnostics hookDiagnostics = HookDiagnostics.f3000a;
                HookDiagnostics.m2157g("interactive done " + appFingerprint.m1361e());
                break;
            default:
                DialogC0823e dialogC0823e2 = this.f2973b;
                AppFingerprint appFingerprint2 = this.f2974c;
                Activity activity2 = this.f2975d;
                AbstractC0307g.m703e(dialogC0823e2, "$progress");
                AbstractC0307g.m703e(appFingerprint2, "$merged");
                AbstractC0307g.m703e(activity2, "$activity");
                dialogC0823e2.m2131a();
                AbstractC0358S.m865O(appFingerprint2.f1638a);
                AbstractC0358S.f729i = false;
                AbstractC0358S.f728h = false;
                AbstractC0358S.m888g0(appFingerprint2);
                new DialogC0827g(activity2, appFingerprint2).show();
                Toast.makeText(activity2, "报告已更新（安装策略下次启动生效）", 1).show();
                HookDiagnostics.f3004e.set(false);
                HookDiagnostics.f3003d.set(true);
                break;
        }
    }
}
