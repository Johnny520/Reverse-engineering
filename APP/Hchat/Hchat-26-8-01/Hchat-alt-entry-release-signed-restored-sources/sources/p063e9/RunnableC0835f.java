package p063e9;

import android.app.Notification;
import android.app.NotificationManager;
import android.os.Bundle;
import android.os.Handler;
import android.service.notification.StatusBarNotification;
import p014b.C0126e;
import p136j8.C2114y;
import p198nb.C2946o;
import p198nb.C2954w;
import p276sf.C3959f;

/* JADX INFO: renamed from: e9.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0835f implements Runnable {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f2541g = 0;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ long f2542h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f2543i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f2544j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ RunnableC0835f(NotificationManager notificationManager, int i9, long j3) {
        this.f2544j = notificationManager;
        this.f2543i = i9;
        this.f2542h = j3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        Object c3959f;
        StatusBarNotification statusBarNotification;
        Notification notification;
        Bundle bundle;
        switch (this.f2541g) {
            case 0:
                NotificationManager notificationManager = (NotificationManager) this.f2544j;
                int i9 = this.f2543i;
                try {
                    StatusBarNotification[] activeNotifications = notificationManager.getActiveNotifications();
                    activeNotifications.getClass();
                    int length = activeNotifications.length;
                    boolean z9 = false;
                    int i10 = 0;
                    while (true) {
                        if (i10 < length) {
                            statusBarNotification = activeNotifications[i10];
                            if (statusBarNotification.getTag() != null || statusBarNotification.getId() != i9) {
                                i10++;
                            }
                        } else {
                            statusBarNotification = null;
                        }
                    }
                    if (statusBarNotification != null && (notification = statusBarNotification.getNotification()) != null && (bundle = notification.extras) != null && bundle.getLong("hchat_custom_notification_reply_completion_token") == this.f2542h) {
                        z9 = true;
                    }
                    c3959f = Boolean.valueOf(z9);
                } catch (Throwable th2) {
                    c3959f = new C3959f(th2);
                }
                Object obj = Boolean.FALSE;
                if (c3959f instanceof C3959f) {
                    c3959f = obj;
                }
                if (((Boolean) c3959f).booleanValue()) {
                    notificationManager.cancel(i9);
                }
                break;
            default:
                C2114y c2114y = (C2114y) this.f2544j;
                C0126e c0126eM5309c = c2114y.m5309c(this.f2542h);
                if (c0126eM5309c != null) {
                    try {
                        final C2946o c2946o = (C2946o) c0126eM5309c.f333i;
                        final C2954w c2954w = (C2954w) c0126eM5309c.f332h;
                        Handler handler = c2954w.f9675b;
                        if (this.f2543i == 3) {
                            final int i11 = 1;
                            handler.post(new Runnable() { // from class: nb.s
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i11) {
                                        case 0:
                                            C2954w.m6349b(c2954w, c2946o, null);
                                            break;
                                        default:
                                            C2954w.m6349b(c2954w, c2946o, "微信原生语音播放器播放失败");
                                            break;
                                    }
                                }
                            });
                        } else {
                            final int i12 = 0;
                            handler.post(new Runnable() { // from class: nb.s
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i12) {
                                        case 0:
                                            C2954w.m6349b(c2954w, c2946o, null);
                                            break;
                                        default:
                                            C2954w.m6349b(c2954w, c2946o, "微信原生语音播放器播放失败");
                                            break;
                                    }
                                }
                            });
                        }
                    } catch (Throwable th3) {
                        c2114y.m5317m("原语音播放回调执行失败: " + th3.getMessage());
                        return;
                    }
                    break;
                }
                break;
        }
    }

    public /* synthetic */ RunnableC0835f(C2114y c2114y, long j3, int i9) {
        this.f2544j = c2114y;
        this.f2542h = j3;
        this.f2543i = i9;
    }
}
