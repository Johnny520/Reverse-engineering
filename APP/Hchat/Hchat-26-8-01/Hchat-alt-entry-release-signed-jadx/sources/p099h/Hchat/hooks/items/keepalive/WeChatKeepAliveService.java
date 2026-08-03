package p099h.Hchat.hooks.items.keepalive;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import p068eh.AbstractC0921a;
import p099h.Hchat.R;
import p263rg.RunnableC3809f;
import p276sf.C3959f;
import p276sf.C3960g;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class WeChatKeepAliveService extends Service {

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ int f4779k = 0;

    /* JADX INFO: renamed from: h */
    public boolean f4781h;

    /* JADX INFO: renamed from: i */
    public boolean f4782i;

    /* JADX INFO: renamed from: g */
    public final Handler f4780g = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: j */
    public final RunnableC3809f f4783j = new RunnableC3809f(this, 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final Notification m3891a() {
        NotificationManager notificationManager = (NotificationManager) getSystemService(NotificationManager.class);
        NotificationChannel notificationChannel = new NotificationChannel("hchat_wechat_keep_alive", "Hchat 微信保活", 1);
        notificationChannel.setShowBadge(false);
        notificationChannel.enableLights(false);
        notificationChannel.enableVibration(false);
        notificationChannel.setSound(null, null);
        if (notificationManager != null) {
            notificationManager.createNotificationChannel(notificationChannel);
        }
        Notification notificationBuild = new Notification.Builder(this, "hchat_wechat_keep_alive").setSmallIcon(R.drawable.ic_launcher).setContentTitle("Hchat 微信强保活").setContentText("正在尝试保持微信息屏运行").setOngoing(true).setShowWhen(false).build();
        notificationBuild.getClass();
        return notificationBuild;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Service
    public final void onDestroy() {
        this.f4780g.removeCallbacks(this.f4783j);
        super.onDestroy();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0014  */
    @Override // android.app.Service
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int onStartCommand(Intent intent, int i9, int i10) {
        Object c3959f;
        RunnableC3809f runnableC3809f = this.f4783j;
        Handler handler = this.f4780g;
        boolean z9 = false;
        if (intent != null) {
            try {
                boolean z10 = intent.getBooleanExtra("h.Hchat.extra.WATCHDOG", false);
                this.f4781h = z10;
                if (intent != null && intent.getBooleanExtra("h.Hchat.extra.NETWORK_HEARTBEAT", false)) {
                    z9 = true;
                }
                this.f4782i = z9;
                startForeground(520134, m3891a());
                handler.removeCallbacks(runnableC3809f);
                handler.postDelayed(runnableC3809f, 60000L);
                c3959f = 1;
            } catch (Throwable th2) {
                c3959f = new C3959f(th2);
            }
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null) {
            AbstractC0921a.m2261x("[Hchat:KeepAliveService] 启动前台保活服务失败: ", thM8182b.getMessage(), thM8182b);
        }
        if (c3959f instanceof C3959f) {
            c3959f = 2;
        }
        return ((Number) c3959f).intValue();
    }
}
