package p263rg;

import android.content.Context;
import android.content.Intent;
import android.view.MotionEvent;
import p068eh.AbstractC0921a;
import p099h.Hchat.crash.RunnableC1436e;
import p099h.Hchat.hooks.items.keepalive.WeChatKeepAliveService;
import p249qg.C3564g;
import p276sf.C3959f;
import p276sf.C3960g;
import p276sf.C3967n;
import p330w9.C4689a;
import p357y1.ViewTreeObserverOnGlobalLayoutListenerC5934t;

/* JADX INFO: renamed from: rg.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC3809f implements Runnable {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f12498g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f12499h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ RunnableC3809f(Object obj, int i9) {
        this.f12498g = i9;
        this.f12499h = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        Object c3959f;
        Intent launchIntentForPackage;
        int actionMasked;
        switch (this.f12498g) {
            case 0:
                AbstractC3810g.m7998a((C3564g) this.f12499h);
                break;
            case 1:
                WeChatKeepAliveService weChatKeepAliveService = (WeChatKeepAliveService) this.f12499h;
                if (weChatKeepAliveService.f4781h) {
                    Context applicationContext = weChatKeepAliveService.getApplicationContext();
                    if (applicationContext == null) {
                        applicationContext = weChatKeepAliveService;
                    }
                    try {
                    } catch (Throwable th2) {
                        c3959f = new C3959f(th2);
                    }
                    if (!C4689a.m9199c() && (launchIntentForPackage = applicationContext.getPackageManager().getLaunchIntentForPackage("com.tencent.mm")) != null) {
                        launchIntentForPackage.addFlags(268435456);
                        applicationContext.startActivity(launchIntentForPackage);
                        c3959f = C3967n.f12976a;
                        Throwable thM8182b = C3960g.m8182b(c3959f);
                        if (thM8182b != null) {
                            AbstractC0921a.m2261x("[Hchat:KeepAlive] 看门狗拉起微信失败: ", thM8182b.getMessage(), thM8182b);
                        }
                    }
                }
                if (weChatKeepAliveService.f4782i) {
                    Thread thread = new Thread(new RunnableC1436e(5));
                    thread.setName("Hchat-KeepAlive-Heartbeat");
                    thread.setDaemon(true);
                    thread.start();
                }
                weChatKeepAliveService.f4780g.postDelayed(this, 60000L);
                break;
            default:
                ViewTreeObserverOnGlobalLayoutListenerC5934t viewTreeObserverOnGlobalLayoutListenerC5934t = (ViewTreeObserverOnGlobalLayoutListenerC5934t) this.f12499h;
                viewTreeObserverOnGlobalLayoutListenerC5934t.removeCallbacks(this);
                MotionEvent motionEvent = viewTreeObserverOnGlobalLayoutListenerC5934t.f24067C0;
                if (motionEvent != null && (actionMasked = motionEvent.getActionMasked()) != 10 && actionMasked != 1) {
                    int i9 = 7;
                    if (actionMasked != 7 && actionMasked != 9) {
                        i9 = 2;
                    }
                    viewTreeObserverOnGlobalLayoutListenerC5934t.m10653L(motionEvent, i9, viewTreeObserverOnGlobalLayoutListenerC5934t.f24069D0, false);
                    break;
                }
                break;
        }
    }
}
