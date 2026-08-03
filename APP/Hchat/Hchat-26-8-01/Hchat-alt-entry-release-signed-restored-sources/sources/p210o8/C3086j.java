package p210o8;

import android.app.AlarmManager;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import gg.AbstractC1416l;
import gg.AbstractC1428x;
import gg.C1425u;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicLong;
import p024b9.RunnableC0217c;
import p089g1.C1275d;
import p125i8.C2005i;
import p198nb.C2952u;
import p276sf.C3959f;
import p276sf.C3960g;

/* JADX INFO: renamed from: o8.j */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3086j {

    /* JADX INFO: renamed from: a */
    public final Handler f9965a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b */
    public final ExecutorService f9966b = Executors.newCachedThreadPool();

    /* JADX INFO: renamed from: c */
    public final ConcurrentHashMap f9967c = new ConcurrentHashMap();

    /* JADX INFO: renamed from: d */
    public final ConcurrentHashMap f9968d = new ConcurrentHashMap();

    /* JADX INFO: renamed from: e */
    public final ConcurrentHashMap f9969e = new ConcurrentHashMap();

    /* JADX INFO: renamed from: f */
    public final Context f9970f;

    /* JADX INFO: renamed from: g */
    public final AlarmManager f9971g;

    /* JADX INFO: renamed from: h */
    public final AtomicLong f9972h;

    /* JADX INFO: renamed from: i */
    public final boolean f9973i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3086j(Context context, C1275d c1275d) {
        Object c3959f;
        Context applicationContext = context.getApplicationContext();
        context = applicationContext != null ? applicationContext : context;
        this.f9970f = context;
        this.f9971g = (AlarmManager) context.getSystemService(AlarmManager.class);
        this.f9972h = new AtomicLong(System.currentTimeMillis());
        C2952u c2952u = new C2952u(this, 1);
        IntentFilter intentFilter = new IntentFilter("h.Hchat.action.EXACT_TASK");
        intentFilter.addDataScheme("hchat-scheduled-task");
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                context.registerReceiver(c2952u, intentFilter, 4);
            } else {
                context.registerReceiver(c2952u, intentFilter);
            }
            c3959f = Boolean.TRUE;
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null) {
            m6552c("精确定时广播注册失败: " + thM8182b.getMessage());
            c3959f = Boolean.FALSE;
        }
        this.f9973i = ((Boolean) c3959f).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m6550a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Runnable runnable = (Runnable) AbstractC1428x.m3837b(this.f9967c).remove(str);
        Handler handler = this.f9965a;
        if (runnable != null) {
            handler.removeCallbacks(runnable);
        }
        C3085i c3085i = (C3085i) AbstractC1428x.m3837b(this.f9968d).remove(str);
        if (c3085i != null) {
            handler.removeCallbacks(c3085i.f9963c);
            try {
                AlarmManager alarmManager = this.f9971g;
                if (alarmManager != null) {
                    alarmManager.cancel(c3085i.f9962b);
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m6551b(long j3, String str) {
        ConcurrentHashMap concurrentHashMap = this.f9968d;
        C3085i c3085i = (C3085i) concurrentHashMap.get(str);
        if (c3085i != null && c3085i.f9961a == j3 && concurrentHashMap.remove(str, c3085i)) {
            this.f9965a.removeCallbacks(c3085i.f9963c);
            try {
                AlarmManager alarmManager = this.f9971g;
                if (alarmManager != null) {
                    alarmManager.cancel(c3085i.f9962b);
                }
            } catch (Throwable unused) {
            }
            m6556g(c3085i.f9964d);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m6552c(String str) {
        C2005i.m4939f("[WeChatTaskApi] ".concat(str));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m6553d(Runnable runnable) {
        this.f9966b.execute(new RunnableC3084h(this, runnable, 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m6554e(Runnable runnable) {
        if (AbstractC1416l.m3825a(Looper.myLooper(), Looper.getMainLooper())) {
            m6556g(runnable);
        } else {
            this.f9965a.post(new RunnableC3084h(this, runnable, 1));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final void m6555f(String str, long j3, Runnable runnable) {
        String str2;
        if (str != null) {
            if (!(str.length() > 0)) {
                str = null;
            }
            str2 = str;
        } else {
            str2 = null;
        }
        C1425u c1425u = new C1425u();
        c1425u.f4738g = new RunnableC0217c(str2, (Object) this, (Object) c1425u, (Object) runnable, 13);
        if (str2 != null) {
            m6550a(str2);
            Object obj = c1425u.f4738g;
            if (obj == null) {
                AbstractC1416l.m3831g("wrapped");
                throw null;
            }
            this.f9967c.put(str2, (Runnable) obj);
        }
        Object obj2 = c1425u.f4738g;
        if (obj2 == null) {
            AbstractC1416l.m3831g("wrapped");
            throw null;
        }
        Runnable runnable2 = (Runnable) obj2;
        if (j3 < 0) {
            j3 = 0;
        }
        this.f9965a.postDelayed(runnable2, j3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final void m6556g(Runnable runnable) {
        try {
            runnable.run();
        } catch (Throwable th2) {
            m6552c("任务执行失败: " + th2.getMessage());
        }
    }
}
