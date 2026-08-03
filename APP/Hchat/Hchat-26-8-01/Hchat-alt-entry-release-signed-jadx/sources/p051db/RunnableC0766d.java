package p051db;

import ac.RunnableC0059l;
import android.os.PowerManager;
import java.util.concurrent.ConcurrentHashMap;
import p011ab.C0042b;
import p037cb.C0545f;
import p210o8.C3086j;
import p276sf.C3958e;
import p276sf.C3959f;
import p276sf.C3960g;

/* JADX INFO: renamed from: db.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0766d implements Runnable {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f2310g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C0545f f2311h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C0765c f2312i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ RunnableC0766d(C0545f c0545f, C0765c c0765c, int i9) {
        this.f2310g = i9;
        this.f2311h = c0545f;
        this.f2312i = c0765c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        Object c3959f;
        C0765c c0765cM1982b;
        Object c3959f2;
        PowerManager powerManager;
        int i9 = this.f2310g;
        C0545f c0545f = this.f2311h;
        switch (i9) {
            case 0:
                C0765c c0765c = this.f2312i;
                try {
                    c3959f = c0545f.m1556t(c0765c);
                    break;
                } catch (Throwable th2) {
                    c3959f = new C3959f(th2);
                }
                Throwable thM8182b = C3960g.m8182b(c3959f);
                if (thM8182b != null) {
                    ((C0042b) c0545f.f1721d).invoke("定时任务立即执行异常", thM8182b);
                    c3959f = new C3958e(0, Integer.valueOf(C0545f.m1535b(c0765c)));
                }
                C3958e c3958e = (C3958e) c3959f;
                int iIntValue = ((Number) c3958e.f12961g).intValue();
                int iIntValue2 = ((Number) c3958e.f12962h).intValue();
                synchronized (c0545f) {
                    C0765c c0765cM1982b2 = ((C0769g) c0545f.f1722e).m1982b(c0765c.f2288a);
                    if (c0765cM1982b2 != null) {
                        ((C0769g) c0545f.f1722e).m1984d(C0765c.m1980a(c0765cM1982b2, 0, null, null, null, null, 0L, 0, null, 0, 0, false, "pending", System.currentTimeMillis(), iIntValue, iIntValue2, null, 0, 0, null, 0, null, 4132863));
                        c0545f.m1554r();
                        return;
                    }
                    return;
                }
            default:
                C0765c c0765c2 = this.f2312i;
                String str = c0765c2.f2288a;
                long j3 = c0765c2.f2294g;
                C0769g c0769g = (C0769g) c0545f.f1722e;
                if (c0769g.m1983c() && (c0765cM1982b = c0769g.m1982b(str)) != null) {
                    long j4 = c0765cM1982b.f2294g;
                    if (j4 != j3 || c0765cM1982b.f2300m.equals("running")) {
                        return;
                    }
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (jCurrentTimeMillis < j4) {
                        c0545f.m1555s(c0765cM1982b, j4 - jCurrentTimeMillis);
                        return;
                    }
                    String strConcat = "scheduled_task:".concat(str);
                    ((ConcurrentHashMap) c0545f.f1723f).remove(strConcat);
                    C3086j c3086jM1542u = C0545f.m1542u();
                    if (c3086jM1542u != null) {
                        c3086jM1542u.m6550a(strConcat);
                    }
                    long j5 = jCurrentTimeMillis - j4;
                    if (j5 < 0) {
                        j5 = 0;
                    }
                    if (j5 > 60000 && (!c0765cM1982b.f2299l || (c0765cM1982b.f2295h == 0 && j5 >= 600000))) {
                        c0545f.m1546d(c0765cM1982b, 0, 0);
                        return;
                    }
                    C0765c c0765cM1980a = C0765c.m1980a(c0765cM1982b, 0, null, null, null, null, 0L, 0, null, 0, 0, false, "running", 0L, 0, 0, null, 0, 0, null, 0, null, 4190207);
                    c0769g.m1984d(c0765cM1980a);
                    Object obj = null;
                    PowerManager.WakeLock wakeLock = null;
                    try {
                        powerManager = (PowerManager) c0545f.f1719b.f12143a.getSystemService(PowerManager.class);
                    } catch (Throwable th3) {
                        c3959f2 = new C3959f(th3);
                    }
                    if (powerManager != null) {
                        PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, "Hchat:ScheduledTask");
                        wakeLockNewWakeLock.setReferenceCounted(false);
                        wakeLockNewWakeLock.acquire(1800000L);
                        c3959f2 = wakeLockNewWakeLock;
                        Throwable thM8182b2 = C3960g.m8182b(c3959f2);
                        if (thM8182b2 == null) {
                            obj = c3959f2;
                        } else {
                            ((C0042b) c0545f.f1721d).invoke("定时任务 WakeLock 获取失败", thM8182b2);
                        }
                        wakeLock = (PowerManager.WakeLock) obj;
                    }
                    RunnableC0059l runnableC0059l = new RunnableC0059l(c0545f, c0765cM1980a, wakeLock, 10);
                    C3086j c3086jM1542u2 = C0545f.m1542u();
                    if (c3086jM1542u2 != null) {
                        c3086jM1542u2.m6553d(runnableC0059l);
                        return;
                    }
                    Thread thread = new Thread(runnableC0059l, "Hchat-ScheduledTask-".concat(str));
                    thread.setDaemon(true);
                    thread.start();
                    return;
                }
                return;
        }
    }
}
