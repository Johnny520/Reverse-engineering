package p000a;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Process;
import android.util.Log;
import java.util.Arrays;

/* JADX INFO: renamed from: a.l0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0679l0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2531a;

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [top.mmjz.floatingclouds.XposedEntry.initPlugins(a.J8):void] */
    public /* synthetic */ RunnableC0679l0(int i) {
        this.f2531a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object objM2206a;
        String string;
        switch (this.f2531a) {
            case 0:
                Process.killProcess(Process.myPid());
                break;
            case 1:
                Process.killProcess(Process.myPid());
                break;
            case 2:
                int i = 0;
                while (true) {
                    String[] strArr = C0446Yc.f1658a;
                    if (i < 3) {
                        if (!C0446Yc.m1101a()) {
                            if (i < 2) {
                                try {
                                    Thread.sleep(3000L);
                                } catch (InterruptedException unused) {
                                    SharedPreferences sharedPreferences = C0446Yc.f1662e;
                                    boolean z = sharedPreferences != null ? sharedPreferences.getBoolean("remote_disabled", false) : false;
                                    SharedPreferences sharedPreferences2 = C0446Yc.f1662e;
                                    long j = sharedPreferences2 != null ? sharedPreferences2.getLong("last_fetch_ts", 0L) : 0L;
                                    long jCurrentTimeMillis = System.currentTimeMillis();
                                    boolean z2 = j == 0 || jCurrentTimeMillis - j > 2592000000L;
                                    if (z && !z2) {
                                        C0446Yc.f1659b = true;
                                        SharedPreferences sharedPreferences3 = C0446Yc.f1662e;
                                        String str = "";
                                        if (sharedPreferences3 != null && (string = sharedPreferences3.getString("remote_message", "")) != null) {
                                            str = string;
                                        }
                                        C0446Yc.f1660c = str;
                                        Log.w("fc-remote-killswitch", "network failed, SP disabled=true (fetched " + ((jCurrentTimeMillis - j) / ((long) 86400000)) + "d ago) → keep disabled");
                                    } else if (z && z2) {
                                        Log.w("fc-remote-killswitch", "network failed, SP disabled=true but stale (" + ((jCurrentTimeMillis - j) / ((long) 86400000)) + "d) → ignore, stay running");
                                    } else {
                                        Log.i("fc-remote-killswitch", "network failed, SP not disabled → stay running (fail-open)");
                                    }
                                    while (true) {
                                        try {
                                            Thread.sleep(1800000L);
                                            C0446Yc.m1101a();
                                        }
                                    }
                                }
                            }
                            i++;
                        }
                    }
                }
                while (true) {
                    Thread.sleep(1800000L);
                    C0446Yc.m1101a();
                }
                break;
            case 3:
                C0441Y7 c0441y7 = C0441Y7.f1647c;
                Activity activity = c0441y7 != null ? c0441y7.f1648a : null;
                if (activity != null) {
                    try {
                        new C0803ra(activity).m1873l();
                        C0413Wf c0413Wf = C0413Wf.f1577a;
                    } catch (Throwable th) {
                        C0920xd.m2206a(th);
                        return;
                    }
                }
                break;
            case 4:
                try {
                    C0656jf.f2462a.getClass();
                    C0675kf c0675kfM1521b = C0656jf.m1521b();
                    if (c0675kfM1521b != null) {
                        C0637if.f2312b = "LOCATE_OK";
                        C0908x1.m2194b(Arrays.copyOf(new Object[]{"[BlockHotUpdate] async locate OK: loader=" + c0675kfM1521b.f2514a + " pathSegments=" + c0675kfM1521b.f2523j.size()}, 1));
                    } else {
                        C0637if.f2312b = "LOCATE_FAILED";
                        C0908x1.m2193a(Arrays.copyOf(new Object[]{"[BlockHotUpdate] async locate FAILED"}, 1));
                    }
                } catch (Throwable th2) {
                    C0637if.f2312b = "LOCATE_FAILED";
                    C0908x1.m2193a(Arrays.copyOf(new Object[]{"[BlockHotUpdate] async locate error", th2}, 2));
                    return;
                }
                break;
            case 5:
                try {
                    C0616hd.f2278a.getClass();
                    C0616hd.m1468b();
                    objM2206a = C0413Wf.f1577a;
                } catch (Throwable th3) {
                    objM2206a = C0920xd.m2206a(th3);
                }
                Throwable thM2189a = C0901wd.m2189a(objM2206a);
                if (thM2189a != null) {
                    C0908x1.m2193a("ResolverBypass", "diagnostic failed", thM2189a);
                }
                break;
            default:
                boolean z3 = C0723n6.f2804a;
                C0723n6.f2820q = true;
                break;
        }
    }
}
