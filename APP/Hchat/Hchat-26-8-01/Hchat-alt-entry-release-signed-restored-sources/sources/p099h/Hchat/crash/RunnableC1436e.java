package p099h.Hchat.crash;

import android.app.Activity;
import android.os.Build;
import android.view.View;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.List;
import p000a.AbstractC0000a;
import p069f.C0933f0;
import p080fb.AbstractC1184v0;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p109hb.C1689l;
import p109hb.C1690m;
import p154k9.C2372p;
import p154k9.C2374r;
import p242q8.C3460o;
import p276sf.C3959f;
import p276sf.C3960g;
import p276sf.C3967n;
import p330w9.C4689a;
import p357y1.AbstractC5883g0;
import p357y1.RunnableC5894j;
import p357y1.ViewTreeObserverOnGlobalLayoutListenerC5934t;

/* JADX INFO: renamed from: h.Hchat.crash.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1436e implements Runnable {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f4753g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [h.Hchat.crash.g.g(android.app.Application, java.lang.ClassLoader):void, k9.o.onClick(android.view.View):void, k9.q.invoke():java.lang.Object, rg.f.run():void, ta.c.c(java.lang.String, java.lang.String, java.lang.String, boolean):void, w9.a.a(android.content.Context, android.content.Context):void, y1.t.onAttachedToWindow():void] */
    public /* synthetic */ RunnableC1436e(int i9) {
        this.f4753g = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        Object c3959f;
        C3460o c3460oCurrentActivity;
        Activity activityM7263a;
        int i9 = 0;
        switch (this.f4753g) {
            case 0:
                C1438g c1438g = C1438g.f4755a;
                C1438g.m3862d();
                C1438g.m3863e();
                return;
            case 1:
                C1689l c1689l = C1690m.f5615a;
                try {
                    C1690m.m4309c(false);
                    break;
                } catch (Throwable unused) {
                }
                C1690m.f5617c.set(false);
                return;
            case 2:
                View view = (View) C2374r.f7806h.get();
                if (view != null) {
                    view.bringToFront();
                    return;
                }
                return;
            case 3:
                if (!C2374r.f7803e || !C2374r.f7802d || C2374r.f7804f || (c3460oCurrentActivity = WeChatApis.currentActivity()) == null || (activityM7263a = c3460oCurrentActivity.m7263a()) == null) {
                    return;
                }
                C2374r c2374r = C2374r.f7799a;
                if (C2374r.m5688q(activityM7263a)) {
                    C2374r.m5687p(new C2372p(activityM7263a, i9));
                    return;
                }
                return;
            case 4:
                return;
            case 5:
                try {
                    URLConnection uRLConnectionOpenConnection = new URL("https://connectivitycheck.gstatic.com/generate_204").openConnection();
                    uRLConnectionOpenConnection.getClass();
                    HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                    httpURLConnection.setConnectTimeout(3000);
                    httpURLConnection.setReadTimeout(3000);
                    httpURLConnection.setUseCaches(false);
                    httpURLConnection.setRequestMethod("GET");
                    httpURLConnection.getResponseCode();
                    httpURLConnection.disconnect();
                    c3959f = C3967n.f12976a;
                    break;
                } catch (Throwable th2) {
                    c3959f = new C3959f(th2);
                }
                Throwable thM8182b = C3960g.m8182b(c3959f);
                if (thM8182b != null) {
                    AbstractC1184v0.m3203m("[Hchat:KeepAlive] 网络心跳失败: " + thM8182b.getMessage());
                    return;
                }
                return;
            case 6:
                List listM101y0 = AbstractC0000a.m101y0("cmd appops set com.tencent.mm RUN_ANY_IN_BACKGROUND allow", "cmd appops set com.tencent.mm RUN_IN_BACKGROUND allow", "cmd appops set com.tencent.mm WAKE_LOCK allow", "cmd appops set com.tencent.mm START_FOREGROUND allow");
                if (listM101y0.isEmpty()) {
                    return;
                }
                Iterator it = listM101y0.iterator();
                while (it.hasNext()) {
                    if (!C4689a.m9201e((String) it.next())) {
                        AbstractC1184v0.m3203m("[Hchat:KeepAlive] Root AppOps 放行执行不完整");
                        return;
                    }
                }
                return;
            case 7:
                if (C4689a.m9201e("cmd deviceidle whitelist +com.tencent.mm")) {
                    return;
                }
                AbstractC1184v0.m3203m("[Hchat:KeepAlive] Root Doze 白名单执行失败");
                return;
            default:
                C0933f0 c0933f0 = ViewTreeObserverOnGlobalLayoutListenerC5934t.f24059W0;
                synchronized (c0933f0) {
                    try {
                        int i10 = Build.VERSION.SDK_INT;
                        Object[] objArr = c0933f0.f2923a;
                        int i11 = c0933f0.f2924b;
                        if (i10 < 30) {
                            while (i9 < i11) {
                                ViewTreeObserverOnGlobalLayoutListenerC5934t viewTreeObserverOnGlobalLayoutListenerC5934t = (ViewTreeObserverOnGlobalLayoutListenerC5934t) objArr[i9];
                                boolean showLayoutBounds = viewTreeObserverOnGlobalLayoutListenerC5934t.getShowLayoutBounds();
                                Class cls = ViewTreeObserverOnGlobalLayoutListenerC5934t.f24056T0;
                                viewTreeObserverOnGlobalLayoutListenerC5934t.setShowLayoutBounds(AbstractC5883g0.m10598n());
                                if (showLayoutBounds != viewTreeObserverOnGlobalLayoutListenerC5934t.getShowLayoutBounds()) {
                                    viewTreeObserverOnGlobalLayoutListenerC5934t.post(new RunnableC5894j(viewTreeObserverOnGlobalLayoutListenerC5934t, 2));
                                }
                                i9++;
                            }
                        } else {
                            while (i9 < i11) {
                                ViewTreeObserverOnGlobalLayoutListenerC5934t viewTreeObserverOnGlobalLayoutListenerC5934t2 = (ViewTreeObserverOnGlobalLayoutListenerC5934t) objArr[i9];
                                viewTreeObserverOnGlobalLayoutListenerC5934t2.post(new RunnableC5894j(viewTreeObserverOnGlobalLayoutListenerC5934t2, 3));
                                i9++;
                            }
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                return;
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m3858a() {
    }
}
