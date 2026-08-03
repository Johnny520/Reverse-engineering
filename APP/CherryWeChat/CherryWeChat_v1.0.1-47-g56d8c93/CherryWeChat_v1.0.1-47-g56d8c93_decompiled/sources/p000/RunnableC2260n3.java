package p000;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import de.robv.android.xposed.XposedHelpers;
import io.github.cherrywechat.R;
import io.github.cherrywechat.lua.LuaEngine;
import io.github.cherrywechat.lua.LuaUiScheduler;
import io.github.cherrywechat.lua.api.CherryGlobalAPI;
import io.github.cherrywechat.lua.api.CherryViewAPI;
import io.github.cherrywechat.lua.dev.CherryDevServer;
import io.sentry.C1573D2;
import io.sentry.C1589H2;
import io.sentry.C1871f;
import io.sentry.C1977q;
import io.sentry.C1981r;
import io.sentry.C2045v1;
import io.sentry.C2046v2;
import io.sentry.EnumC1657a2;
import io.sentry.ILogger;
import io.sentry.InterfaceC1833c0;
import io.sentry.InterfaceC1876g0;
import io.sentry.SpotlightIntegration;
import io.sentry.android.core.ActivityLifecycleIntegration;
import io.sentry.android.core.AnrIntegration;
import io.sentry.android.core.C1662E;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.internal.util.C1727o;
import io.sentry.android.ndk.C1754b;
import io.sentry.android.replay.C1799t;
import io.sentry.android.replay.ViewTreeObserverOnDrawListenerC1810v;
import io.sentry.android.replay.capture.C1770h;
import io.sentry.android.replay.viewhierarchy.AbstractC1820f;
import io.sentry.config.AbstractC1856a;
import io.sentry.internal.debugmeta.C1901c;
import io.sentry.ndk.NativeScope;
import io.sentry.util.AbstractC2034f;
import java.io.File;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.zip.GZIPOutputStream;
import party.iroiro.luajava.luajit.LuaJitConsts;

/* JADX INFO: renamed from: n3 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC2260n3 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7970a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f7971b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f7972c;

    public /* synthetic */ RunnableC2260n3(int i, Object obj, Object obj2) {
        this.f7970a = i;
        this.f7971b = obj;
        this.f7972c = obj2;
    }

    /* JADX WARN: Type inference failed for: r7v9, types: [Dn, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        OutputStream outputStream;
        int i = this.f7970a;
        Activity activity = null;
        strMo3608b = null;
        String strMo3608b = null;
        Object obj = this.f7972c;
        Object obj2 = this.f7971b;
        switch (i) {
            case 0:
                ExecutorC2303o3 executorC2303o3 = (ExecutorC2303o3) obj2;
                Runnable runnable = (Runnable) obj;
                executorC2303o3.getClass();
                try {
                    runnable.run();
                    return;
                } finally {
                    executorC2303o3.m4680a();
                }
            case 1:
                ViewGroup viewGroup = (ViewGroup) obj2;
                ImageView imageView = new ImageView(viewGroup.getContext());
                imageView.setImageDrawable((Drawable) obj);
                imageView.setClickable(false);
                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                viewGroup.addView(imageView, 0, new ViewGroup.LayoutParams(-1, -1));
                return;
            case 2:
                ((ImageView) obj2).setImageBitmap((Bitmap) obj);
                return;
            case 3:
                CherryDevServer.handleWebSocketMessage$lambda$24((String) obj2, (CherryDevServer.WebSocketConnection) obj);
                return;
            case 4:
                CherryDevServer.handleWebSocketMessage$lambda$24$lambda$23((CherryDevServer.WebSocketConnection) obj2, (byte[]) obj);
                return;
            case 5:
                CherryViewAPI.loadImageFromUrl$lambda$132((String) obj2, (ImageView) obj);
                return;
            case 6:
                AbstractActivityC2148ki abstractActivityC2148ki = (AbstractActivityC2148ki) obj2;
                abstractActivityC2148ki.getLifecycle().mo1555a(new C0447Ka(0, (C2335ot) obj, abstractActivityC2148ki));
                return;
            case 7:
                ArrayList arrayList = (ArrayList) obj2;
                C0557My c0557My = (C0557My) obj;
                if (arrayList.contains(c0557My)) {
                    arrayList.remove(c0557My);
                    AbstractC2374ph.m4804a(c0557My.f1827c.f5296E, c0557My.f1825a);
                    return;
                }
                return;
            case LuaJitConsts.LUA_TTHREAD /* 8 */:
                ((C0523M6) obj2).m1022r((C2283nk) obj);
                return;
            case LuaJitConsts.LUA_GCISRUNNING /* 9 */:
                TextView textView = (TextView) obj;
                if (((TextView) obj2).getVisibility() == 4) {
                    textView.setVisibility(4);
                    return;
                } else {
                    textView.setVisibility(0);
                    textView.setText(AbstractC0295Gu.m625r(-65846143612981L));
                    return;
                }
            case 10:
                LuaEngine.executeOnUiThread$lambda$6((String) obj2, (InterfaceC1416fj) obj);
                return;
            case 11:
                C0762Rp c0762Rp = (C0762Rp) obj2;
                Activity activity2 = (Activity) obj;
                try {
                    CherryGlobalAPI cherryGlobalAPI = CherryGlobalAPI.INSTANCE;
                    cherryGlobalAPI.setCurrentContext(activity2.getApplicationContext());
                    cherryGlobalAPI.setCurrentActivity(activity2);
                    if (AbstractC1450gG.f5074h) {
                        String str = AbstractC1450gG.f5070d;
                        if (str == null) {
                            AbstractC0295Gu.m625r(-578489145096245L);
                            str = null;
                        }
                        LuaEngine.INSTANCE.setModuleApkPath(str);
                        c0762Rp.m1559a(AbstractC0295Gu.m625r(-438730909284405L) + str + '\n');
                    }
                    LuaEngine luaEngine = LuaEngine.INSTANCE;
                    if (luaEngine.isInitialized()) {
                        c0762Rp.m1559a(AbstractC0295Gu.m625r(-439589902743605L));
                    } else {
                        Context applicationContext = activity2.getApplicationContext();
                        AbstractC0295Gu.m625r(-438846873401397L);
                        LuaEngine.init$default(luaEngine, applicationContext, null, 2, null);
                        c0762Rp.m1559a(AbstractC0295Gu.m625r(-438962837518389L));
                    }
                    TextView textView2 = c0762Rp.f2412d;
                    if (textView2 == null) {
                        AbstractC0295Gu.m625r(-439658622220341L);
                        textView2 = null;
                    }
                    textView2.setText(AbstractC0295Gu.m625r(-439727341697077L));
                    TextView textView3 = c0762Rp.f2412d;
                    if (textView3 == null) {
                        AbstractC0295Gu.m625r(-439748816533557L);
                        textView3 = null;
                    }
                    Activity activity3 = c0762Rp.f2415g;
                    if (activity3 == null) {
                        AbstractC0295Gu.m625r(-439267780196405L);
                        activity3 = null;
                    }
                    textView3.setTextColor(activity3.getColor(R.color.colorSuccess));
                    break;
                } catch (Exception e) {
                    c0762Rp.m1559a(AbstractC0295Gu.m625r(-439336499673141L) + e.getMessage() + '\n');
                    TextView textView4 = c0762Rp.f2412d;
                    if (textView4 == null) {
                        AbstractC0295Gu.m625r(-439418104051765L);
                        textView4 = null;
                    }
                    textView4.setText(AbstractC0295Gu.m625r(-439486823528501L));
                    TextView textView5 = c0762Rp.f2412d;
                    if (textView5 == null) {
                        AbstractC0295Gu.m625r(-439508298364981L);
                        textView5 = null;
                    }
                    Activity activity4 = c0762Rp.f2415g;
                    if (activity4 == null) {
                        AbstractC0295Gu.m625r(-437927750400053L);
                    } else {
                        activity = activity4;
                    }
                    textView5.setTextColor(activity.getColor(R.color.colorError));
                }
                c0762Rp.m1560g();
                if (CherryDevServer.INSTANCE.isRunning()) {
                    c0762Rp.m1561h(true);
                    Handler handler = new Handler(Looper.getMainLooper());
                    c0762Rp.f2422n = handler;
                    handler.postDelayed(new RunnableC0431K0(11, c0762Rp), 2000L);
                    return;
                }
                return;
            case 12:
                LuaUiScheduler.runOnUiThreadSync$lambda$1((InterfaceC0884Ui) obj2, (CountDownLatch) obj);
                return;
            case 13:
                ((ValueAnimator) obj2).cancel();
                ((LinearLayout) obj).setElevation(0.0f);
                return;
            case 14:
                C1494hG c1494hG = (C1494hG) obj;
                HashMap map = AbstractC0999XA.f3193a;
                int iM2889a = C1517hw.m2889a(0, AbstractC0295Gu.m625r(-50285477099573L));
                C1456gf.m2795M((ViewGroup) obj2, iM2889a, C1517hw.m2889a(0, AbstractC0295Gu.m625r(-48760763709493L)), true);
                if (iM2889a != 0) {
                    Object obj3 = c1494hG.f5263a.f8521b;
                    C2648vx c2648vx = new C2648vx();
                    if (obj3 instanceof Class) {
                        c2648vx.f9163b = (Class) obj3;
                    } else {
                        c2648vx.f9164c = obj3;
                        c2648vx.f9163b = obj3 != null ? obj3.getClass() : null;
                    }
                    c2648vx.m5182e(AbstractC0295Gu.m625r(-48881022793781L));
                    View view = (View) c2648vx.m5178a();
                    ViewParent parent = view != null ? view.getParent() : null;
                    AbstractC0295Gu.m625r(-48511655606325L);
                    View childAt = ((ViewGroup) parent).getChildAt(1);
                    AbstractC0295Gu.m625r(-49319109457973L);
                    ((ImageView) childAt).setColorFilter(iM2889a);
                    String strM625r = AbstractC0295Gu.m625r(-49035641616437L);
                    Object[] objArr = {Integer.valueOf(iM2889a)};
                    AbstractC0295Gu.m625r(-578325936338997L);
                    XposedHelpers.callMethod(view, strM625r, Arrays.copyOf(objArr, 1));
                    return;
                }
                return;
            case 15:
                ((AbstractC0585Nj) obj2).mo1160J((Typeface) obj);
                return;
            case 16:
                ((View) obj2).animate().scaleX(1.0f).scaleY(1.0f).setDuration(100L).withEndAction(new RunnableC0562N2(27, (C1127a9) obj)).start();
                return;
            case 17:
                ((TextView) obj2).setText(AbstractC0295Gu.m625r(-579738980579381L) + ((C1214bG) obj).f4147b + AbstractC0295Gu.m625r(-579781930252341L));
                return;
            case 18:
                ((TextView) obj2).setText(AbstractC0295Gu.m625r(-579794815154229L) + ((C0339Hv) obj).f1147a + '/' + AbstractC1257cG.f4258a.size());
                return;
            case 19:
                ((C1977q) obj2).mo3678e((C1573D2) obj);
                return;
            case LuaJitConsts.LUA_MINSTACK /* 20 */:
                ((InterfaceC1833c0) obj).mo3695g(((C2045v1) obj2).mo3718l().getShutdownTimeoutMillis());
                return;
            case 21:
                SpotlightIntegration spotlightIntegration = (SpotlightIntegration) obj2;
                C1901c c1901c = (C1901c) obj;
                try {
                    C2046v2 c2046v2 = spotlightIntegration.f5866a;
                    if (c2046v2 == null) {
                        throw new IllegalArgumentException("SentryOptions are required to send envelopes.");
                    }
                    HttpURLConnection httpURLConnectionM3744f = SpotlightIntegration.m3744f(c2046v2.getSpotlightConnectionUrl() != null ? spotlightIntegration.f5866a.getSpotlightConnectionUrl() : AbstractC2034f.f7219a ? "http://10.0.2.2:8969/stream" : "http://localhost:8969/stream");
                    try {
                        outputStream = httpURLConnectionM3744f.getOutputStream();
                    } catch (Throwable th) {
                        try {
                            spotlightIntegration.f5867b.mo3683r(EnumC1657a2.ERROR, "An exception occurred while submitting the envelope to the Sentry server.", th);
                            spotlightIntegration.f5867b.mo3680e(EnumC1657a2.DEBUG, "Envelope sent to spotlight: %d", Integer.valueOf(httpURLConnectionM3744f.getResponseCode()));
                        } catch (Throwable th2) {
                            spotlightIntegration.f5867b.mo3680e(EnumC1657a2.DEBUG, "Envelope sent to spotlight: %d", Integer.valueOf(httpURLConnectionM3744f.getResponseCode()));
                            SpotlightIntegration.m3743d(httpURLConnectionM3744f);
                            throw th2;
                        }
                    }
                    try {
                        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                        try {
                            spotlightIntegration.f5866a.getSerializer().mo3611e(c1901c, gZIPOutputStream);
                            gZIPOutputStream.close();
                            if (outputStream != null) {
                                outputStream.close();
                            }
                            spotlightIntegration.f5867b.mo3680e(EnumC1657a2.DEBUG, "Envelope sent to spotlight: %d", Integer.valueOf(httpURLConnectionM3744f.getResponseCode()));
                            SpotlightIntegration.m3743d(httpURLConnectionM3744f);
                            return;
                        } finally {
                        }
                    } finally {
                        SpotlightIntegration.m3743d(httpURLConnectionM3744f);
                        return;
                    }
                } catch (Exception e2) {
                    spotlightIntegration.f5867b.mo3683r(EnumC1657a2.ERROR, "An exception occurred while creating the connection to spotlight.", e2);
                    return;
                }
            case 22:
                ActivityLifecycleIntegration.m3799f((InterfaceC1876g0) obj2, (InterfaceC1876g0) obj);
                return;
            case 23:
                AnrIntegration anrIntegration = (AnrIntegration) obj2;
                SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) obj;
                C1981r c1981rM4173a = anrIntegration.f5940c.m4173a();
                try {
                    if (!anrIntegration.f5939b) {
                        anrIntegration.m3805d(sentryAndroidOptions);
                        break;
                    }
                    c1981rM4173a.close();
                    return;
                } finally {
                }
            case 24:
                ((C1662E) obj2).m3810f((ILogger) obj);
                return;
            case 25:
                ILogger iLogger = (ILogger) obj;
                try {
                    ((C1727o) obj2).f6266j = Choreographer.getInstance();
                    return;
                } catch (Throwable th3) {
                    iLogger.mo3683r(EnumC1657a2.ERROR, "Error retrieving Choreographer instance. Slow and frozen frames will not be reported.", th3);
                    return;
                }
            case 26:
                C1754b c1754b = (C1754b) obj2;
                C1871f c1871f = (C1871f) obj;
                C2046v2 c2046v22 = c1754b.f6361a;
                EnumC1657a2 enumC1657a2 = c1871f.f6716i;
                String lowerCase = enumC1657a2 != null ? enumC1657a2.name().toLowerCase(Locale.ROOT) : null;
                String strM4073t = AbstractC1856a.m4073t(c1871f.m4092a());
                try {
                    ConcurrentHashMap concurrentHashMap = c1871f.f6713f;
                    if (!concurrentHashMap.isEmpty()) {
                        strMo3608b = c2046v22.getSerializer().mo3608b(concurrentHashMap);
                    }
                    break;
                } catch (Throwable th4) {
                    c2046v22.getLogger().mo3682n(EnumC1657a2.ERROR, th4, "Breadcrumb data is not serializable.", new Object[0]);
                }
                String str2 = strMo3608b;
                NativeScope nativeScope = c1754b.f6362b;
                String str3 = c1871f.f6711d;
                String str4 = c1871f.f6714g;
                String str5 = c1871f.f6712e;
                nativeScope.getClass();
                NativeScope.nativeAddBreadcrumb(lowerCase, str3, str4, str5, strM4073t, str2);
                return;
            case 27:
                C1589H2 c1589h2 = (C1589H2) obj;
                NativeScope nativeScope2 = ((C1754b) obj2).f6362b;
                String string = c1589h2.f5738a.toString();
                String string2 = c1589h2.f5739b.toString();
                nativeScope2.getClass();
                NativeScope.nativeSetTrace(string, string2);
                return;
            case 28:
                ViewTreeObserverOnDrawListenerC1810v viewTreeObserverOnDrawListenerC1810v = (ViewTreeObserverOnDrawListenerC1810v) obj2;
                ArrayList arrayList2 = new ArrayList();
                Bitmap bitmap = viewTreeObserverOnDrawListenerC1810v.f6549i;
                Canvas canvas = new Canvas(bitmap);
                canvas.setMatrix((Matrix) viewTreeObserverOnDrawListenerC1810v.f6551k.getValue());
                ((AbstractC1820f) obj).m3992a(new C1799t(viewTreeObserverOnDrawListenerC1810v, arrayList2, canvas));
                viewTreeObserverOnDrawListenerC1810v.f6542b.getReplayController().getClass();
                viewTreeObserverOnDrawListenerC1810v.f6545e.m3947s(bitmap);
                viewTreeObserverOnDrawListenerC1810v.f6554n.set(true);
                viewTreeObserverOnDrawListenerC1810v.f6552l.set(false);
                return;
            default:
                AbstractC1856a.m4060f((File) obj2);
                ((C1770h) obj).m3957l(-1);
                return;
        }
    }

    public /* synthetic */ RunnableC2260n3(ActivityLifecycleIntegration activityLifecycleIntegration, InterfaceC1876g0 interfaceC1876g0, InterfaceC1876g0 interfaceC1876g02) {
        this.f7970a = 22;
        this.f7971b = interfaceC1876g0;
        this.f7972c = interfaceC1876g02;
    }

    public /* synthetic */ RunnableC2260n3(Object obj, Object obj2, Object obj3, int i) {
        this.f7970a = i;
        this.f7971b = obj;
        this.f7972c = obj2;
    }
}
