package p000a;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.SystemClock;

/* JADX INFO: renamed from: a.f0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC0565f0 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2108a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Activity f2109b;

    public /* synthetic */ DialogInterfaceOnClickListenerC0565f0(Activity activity, int i) {
        this.f2108a = i;
        this.f2109b = activity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        Object objM2206a;
        switch (this.f2108a) {
            case 0:
                C0698m0 c0698m0 = C0698m0.f2635a;
                Activity activity = this.f2109b;
                c0698m0.getClass();
                C0698m0.m1590c(activity);
                break;
            default:
                Activity activity2 = this.f2109b;
                C0698m0.f2635a.getClass();
                C0908x1.m2194b("AdaptationManager", "restartWechat start (non-root)");
                try {
                    Context applicationContext = activity2.getApplicationContext();
                    Intent intent = new Intent();
                    intent.setClassName("com.tencent.mm", "com.tencent.mm.ui.LauncherUI");
                    intent.addFlags(335544320);
                    PendingIntent activity3 = PendingIntent.getActivity(applicationContext, 0, intent, 201326592);
                    Object systemService = applicationContext.getSystemService("alarm");
                    C0631i9.m1480c(systemService, "null cannot be cast to non-null type android.app.AlarmManager");
                    ((AlarmManager) systemService).set(2, SystemClock.elapsedRealtime() + 1500, activity3);
                    try {
                        applicationContext.startActivity(intent);
                        C0413Wf c0413Wf = C0413Wf.f1577a;
                    } catch (Throwable th) {
                        C0920xd.m2206a(th);
                    }
                    C0908x1.m2194b("AdaptationManager", "restartWechat scheduled via AlarmManager+startActivity, killing self in 800ms");
                    objM2206a = Boolean.valueOf(C0698m0.f2636b.postDelayed(new RunnableC0679l0(0), 800L));
                } catch (Throwable th2) {
                    objM2206a = C0920xd.m2206a(th2);
                }
                Throwable thM2189a = C0901wd.m2189a(objM2206a);
                if (thM2189a != null) {
                    C0908x1.m2193a("AdaptationManager", "restartWechat failed", thM2189a);
                    C0698m0.f2637c = false;
                }
                break;
        }
    }
}
