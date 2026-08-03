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

/* JADX INFO: renamed from: n3 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC2260n3 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7970a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f7971b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f7972c;

    public /* synthetic */ RunnableC2260n3(int r1, Object r2, Object r3) {
        this.f7970a = r1;
        this.f7971b = r2;
        this.f7972c = r3;
    }

    /* JADX WARN: Type inference failed for: r7v9, types: [Dn, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        int r0 = this.f7970a;
        Activity r2 = null;
        String r22 = null;
        r22 = null;
        ViewParent r23 = null;
        Object r5 = this.f7972c;
        Object r6 = this.f7971b;
        switch(r0) {
            case 0: goto L194;
            case 1: goto L192;
            case 2: goto L190;
            case 3: goto L188;
            case 4: goto L186;
            case 5: goto L184;
            case 6: goto L182;
            case 7: goto L178;
            case 8: goto L176;
            case 9: goto L171;
            case 10: goto L169;
            case 11: goto L129;
            case 12: goto L127;
            case 13: goto L125;
            case 14: goto L110;
            case 15: goto L108;
            case 16: goto L106;
            case 17: goto L104;
            case 18: goto L102;
            case 19: goto L100;
            case 20: goto L98;
            case 21: goto L49;
            case 22: goto L47;
            case 23: goto L33;
            case 24: goto L31;
            case 25: goto L25;
            case 26: goto L10;
            case 27: goto L8;
            case 28: goto L6;
            default: goto L4;
        };
    L4:
        AbstractC1856a.m4060f((File) r6);
        ((C1770h) r5).m3957l(-1);
        return;
    L6:
        ViewTreeObserverOnDrawListenerC1810v r62 = (ViewTreeObserverOnDrawListenerC1810v) r6;
        ArrayList r02 = new ArrayList();
        Bitmap r24 = r62.f6549i;
        Canvas r1 = new Canvas(r24);
        r1.setMatrix((Matrix) r62.f6551k.getValue());
        ((AbstractC1820f) r5).m3992a(new C1799t(r62, r02, r1));
        r62.f6542b.getReplayController().getClass();
        r62.f6545e.m3947s(r24);
        r62.f6554n.set(true);
        r62.f6552l.set(false);
        return;
    L8:
        C1589H2 r52 = (C1589H2) r5;
        NativeScope r03 = ((C1754b) r6).f6362b;
        String r12 = r52.f5738a.toString();
        String r25 = r52.f5739b.toString();
        r03.getClass();
        NativeScope.nativeSetTrace(r12, r25);
        return;
    L10:
        C1754b r63 = (C1754b) r6;
        C1871f r53 = (C1871f) r5;
        C2046v2 r13 = r63.f6361a;
        EnumC1657a2 r04 = r53.f6716i;
        if (r04 == null) goto L13;
        String r7 = r04.name().toLowerCase(Locale.ROOT);
    L14:
        String r11 = AbstractC1856a.m4073t(r53.m4092a());
        ConcurrentHashMap r05 = r53.f6713f;     // Catch: Throwable -> L19
        if (r05.isEmpty() == true) goto L21;
        r22 = r13.getSerializer().mo3608b(r05);     // Catch: Throwable -> L19
    L21:
        String r122 = r22;
        NativeScope r06 = r63.f6362b;
        String r8 = r53.f6711d;
        String r9 = r53.f6714g;
        String r10 = r53.f6712e;
        r06.getClass();
        NativeScope.nativeAddBreadcrumb(r7, r8, r9, r10, r11, r122);
        return;
    L19:
        th = move-exception;
        r13.getLogger().mo3682n(EnumC1657a2.ERROR, th, "Breadcrumb data is not serializable.", new Object[0]);
        goto L21
    L13:
        r7 = null;
        goto L14
    L25:
        ILogger r54 = (ILogger) r5;
        ((C1727o) r6).f6266j = Choreographer.getInstance();     // Catch: Throwable -> L28
        return;
    L28:
        th = move-exception;
        r54.mo3683r(EnumC1657a2.ERROR, "Error retrieving Choreographer instance. Slow and frozen frames will not be reported.", th);
        return;
    L31:
        ((C1662E) r6).m3810f((ILogger) r5);
        return;
    L33:
        AnrIntegration r64 = (AnrIntegration) r6;
        SentryAndroidOptions r55 = (SentryAndroidOptions) r5;
        C1981r r14 = r64.f5940c.m4173a();
    L38:
        th = move-exception;
        r14.close();     // Catch: Throwable -> L44
        throw th;
    L44:
        th = move-exception;
        th.addSuppressed(th);
        throw th;
    L35:
        if (r64.f5939b == true) goto L40;
        r64.m3805d(r55);     // Catch: Throwable -> L38
    L40:
        r14.close();
        return;
    L47:
        ActivityLifecycleIntegration.m3799f((InterfaceC1876g0) r6, (InterfaceC1876g0) r5);
        return;
    L49:
        SpotlightIntegration r65 = (SpotlightIntegration) r6;
        C1901c r56 = (C1901c) r5;
        C2046v2 r07 = r65.f5866a;     // Catch: Exception -> L72
        if (r07 == null) goto L95;
        if (r07.getSpotlightConnectionUrl() == null) goto L56;
        String r08 = r65.f5866a.getSpotlightConnectionUrl();     // Catch: Exception -> L72
    L59:
        HttpURLConnection r26 = SpotlightIntegration.m3744f(r08);     // Catch: Exception -> L72
        OutputStream r3 = r26.getOutputStream();     // Catch: Throwable -> L67
        GZIPOutputStream r4 = new GZIPOutputStream(r3);     // Catch: Throwable -> L74
        r65.f5866a.getSerializer().mo3611e(r56, r4);     // Catch: Throwable -> L76
        r4.close();     // Catch: Throwable -> L74
        if (r3 == null) goto L69;
        r3.close();     // Catch: Throwable -> L67
    L69:
        r65.f5867b.mo3680e(EnumC1657a2.DEBUG, "Envelope sent to spotlight: %d", new Object[]{Integer.valueOf(r26.getResponseCode())});     // Catch: Exception -> L72
    L70:
        SpotlightIntegration.m3743d(r26);     // Catch: Exception -> L72
        return;
    L76:
        th = move-exception;
        r4.close();     // Catch: Throwable -> L80
    L226:
        throw th;     // Catch: Throwable -> L74
    L80:
        th = move-exception;
        th.addSuppressed(th);     // Catch: Throwable -> L74
        throw th;     // Catch: Throwable -> L74
    L74:
        th = move-exception;
        if (r3 == null) goto L227;
        r3.close();     // Catch: Throwable -> L86
    L228:
        throw th;     // Catch: Throwable -> L67
    L86:
        th = move-exception;
        th.addSuppressed(th);     // Catch: Throwable -> L67
        throw th;     // Catch: Throwable -> L67
    L227:
        throw th;     // Catch: Throwable -> L67
    L67:
        th = move-exception;
        r65.f5867b.mo3683r(EnumC1657a2.ERROR, "An exception occurred while submitting the envelope to the Sentry server.", th);     // Catch: Throwable -> L91
        r65.f5867b.mo3680e(EnumC1657a2.DEBUG, "Envelope sent to spotlight: %d", new Object[]{Integer.valueOf(r26.getResponseCode())});     // Catch: Exception -> L72
        goto L70
    L91:
        th = move-exception;
        r65.f5867b.mo3680e(EnumC1657a2.DEBUG, "Envelope sent to spotlight: %d", new Object[]{Integer.valueOf(r26.getResponseCode())});     // Catch: Exception -> L72
        SpotlightIntegration.m3743d(r26);     // Catch: Exception -> L72
        throw th;     // Catch: Exception -> L72
    L56:
        if (AbstractC2034f.f7219a == false) goto L58;
        r08 = "http://10.0.2.2:8969/stream";
        goto L59
    L58:
        r08 = "http://localhost:8969/stream";
        goto L59
    L95:
        throw new IllegalArgumentException("SentryOptions are required to send envelopes.");     // Catch: Exception -> L72
    L72:
        e = move-exception;
        r65.f5867b.mo3683r(EnumC1657a2.ERROR, "An exception occurred while creating the connection to spotlight.", e);
        return;
    L98:
        ((InterfaceC1833c0) r5).mo3695g(((C2045v1) r6).mo3718l().getShutdownTimeoutMillis());
        return;
    L100:
        ((C1977q) r6).mo3678e((C1573D2) r5);
        return;
    L102:
        ((TextView) r6).setText(AbstractC0295Gu.m625r(-579794815154229L) + ((C0339Hv) r5).f1147a + '/' + AbstractC1257cG.f4258a.size());
        return;
    L104:
        ((TextView) r6).setText(AbstractC0295Gu.m625r(-579738980579381L) + ((C1214bG) r5).f4147b + AbstractC0295Gu.m625r(-579781930252341L));
        return;
    L106:
        ((View) r6).animate().scaleX(1.0f).scaleY(1.0f).setDuration(100).withEndAction(new RunnableC0562N2(27, (C1127a9) r5)).start();
        return;
    L108:
        ((AbstractC0585Nj) r6).mo1160J((Typeface) r5);
        return;
    L110:
        C1494hG r57 = (C1494hG) r5;
        HashMap r09 = AbstractC0999XA.f3193a;
        int r010 = C1517hw.m2889a(0, AbstractC0295Gu.m625r(-50285477099573L));
        C1456gf.m2795M((ViewGroup) r6, r010, C1517hw.m2889a(0, AbstractC0295Gu.m625r(-48760763709493L)), true);
        if (r010 == 0) goto L230;
        Object r15 = r57.f5263a.f8521b;
        C2648vx r42 = new C2648vx();
        if ((r15 instanceof Class) == false) goto L115;
        r42.f9163b = (Class) r15;
    L120:
        r42.m5182e(AbstractC0295Gu.m625r(-48881022793781L));
        View r16 = (View) r42.m5178a();
        if (r16 == null) goto L123;
        r23 = r16.getParent();
    L123:
        AbstractC0295Gu.m625r(-48511655606325L);
        View r27 = ((ViewGroup) r23).getChildAt(1);
        AbstractC0295Gu.m625r(-49319109457973L);
        ((ImageView) r27).setColorFilter(r010);
        String r28 = AbstractC0295Gu.m625r(-49035641616437L);
        Object[] r011 = {Integer.valueOf(r010)};
        AbstractC0295Gu.m625r(-578325936338997L);
        XposedHelpers.callMethod(r16, r28, Arrays.copyOf(r011, 1));
        return;
    L115:
        r42.f9164c = r15;
        if (r15 == null) goto L118;
        Class<?> r17 = r15.getClass();
    L119:
        r42.f9163b = r17;
        goto L120
    L118:
        r17 = null;
        goto L119
    L230:
        return;
    L125:
        ((ValueAnimator) r6).cancel();
        ((LinearLayout) r5).setElevation(0.0f);
        return;
    L127:
        LuaUiScheduler.m2984a((InterfaceC0884Ui) r6, (CountDownLatch) r5);
        return;
    L129:
        C0762Rp r66 = (C0762Rp) r6;
        Activity r58 = (Activity) r5;
        CherryGlobalAPI r012 = CherryGlobalAPI.INSTANCE;     // Catch: Exception -> L137
        r012.setCurrentContext(r58.getApplicationContext());     // Catch: Exception -> L137
        r012.setCurrentActivity(r58);     // Catch: Exception -> L137
        if (AbstractC1450gG.f5074h == false) goto L139;
        String r013 = AbstractC1450gG.f5070d;     // Catch: Exception -> L137
        if (r013 != null) goto L136;
        AbstractC0295Gu.m625r(-578489145096245L);     // Catch: Exception -> L137
        r013 = null;
    L136:
        LuaEngine.INSTANCE.setModuleApkPath(r013);     // Catch: Exception -> L137
        r66.m1559a(AbstractC0295Gu.m625r(-438730909284405L) + r013 + '\n');     // Catch: Exception -> L137
    L139:
        LuaEngine r014 = LuaEngine.INSTANCE;     // Catch: Exception -> L137
        if (r014.isInitialized() == true) goto L142;
        Context r43 = r58.getApplicationContext();     // Catch: Exception -> L137
        AbstractC0295Gu.m625r(-438846873401397L);     // Catch: Exception -> L137
        LuaEngine.init$default(r014, r43, null, 2, null);     // Catch: Exception -> L137
        r66.m1559a(AbstractC0295Gu.m625r(-438962837518389L));     // Catch: Exception -> L137
    L143:
        TextView r015 = r66.f2412d;     // Catch: Exception -> L137
        if (r015 != null) goto L146;
        AbstractC0295Gu.m625r(-439658622220341L);     // Catch: Exception -> L137
        r015 = null;
    L146:
        r015.setText(AbstractC0295Gu.m625r(-439727341697077L));     // Catch: Exception -> L137
        TextView r016 = r66.f2412d;     // Catch: Exception -> L137
        if (r016 != null) goto L149;
        AbstractC0295Gu.m625r(-439748816533557L);     // Catch: Exception -> L137
        r016 = null;
    L149:
        Activity r44 = r66.f2415g;     // Catch: Exception -> L137
        if (r44 != null) goto L152;
        AbstractC0295Gu.m625r(-439267780196405L);     // Catch: Exception -> L137
        r44 = null;
    L152:
        r016.setTextColor(r44.getColor(R.color.colorSuccess));     // Catch: Exception -> L137
    L165:
        r66.m1560g();
        if (CherryDevServer.INSTANCE.isRunning() == false) goto L231;
        r66.m1561h(true);
        Handler r017 = new Handler(Looper.getMainLooper());
        r66.f2422n = r017;
        r017.postDelayed(new RunnableC0431K0(11, r66), 2000);
        return;
    L231:
        return;
    L142:
        r66.m1559a(AbstractC0295Gu.m625r(-439589902743605L));     // Catch: Exception -> L137
    L137:
        e = move-exception;
        r66.m1559a(AbstractC0295Gu.m625r(-439336499673141L) + e.getMessage() + '\n');
        TextView r018 = r66.f2412d;
        if (r018 != null) goto L157;
        AbstractC0295Gu.m625r(-439418104051765L);
        r018 = null;
    L157:
        r018.setText(AbstractC0295Gu.m625r(-439486823528501L));
        TextView r019 = r66.f2412d;
        if (r019 != null) goto L160;
        AbstractC0295Gu.m625r(-439508298364981L);
        r019 = null;
    L160:
        Activity r18 = r66.f2415g;
        if (r18 != null) goto L163;
        AbstractC0295Gu.m625r(-437927750400053L);
    L164:
        r019.setTextColor(r2.getColor(R.color.colorError));
        goto L165
    L163:
        r2 = r18;
        goto L164
    L169:
        LuaEngine.m2983d((String) r6, (InterfaceC1416fj) r5);
        return;
    L171:
        TextView r59 = (TextView) r5;
        if (((TextView) r6).getVisibility() != 4) goto L174;
        r59.setVisibility(4);
        return;
    L174:
        r59.setVisibility(0);
        r59.setText(AbstractC0295Gu.m625r(-65846143612981L));
        return;
    L176:
        ((C0523M6) r6).m1022r((C2283nk) r5);
        return;
    L178:
        ArrayList r67 = (ArrayList) r6;
        C0557My r510 = (C0557My) r5;
        if (r67.contains(r510) == false) goto L233;
        r67.remove(r510);
        AbstractC2374ph.m4804a(r510.f1827c.f5296E, r510.f1825a);
        return;
    L233:
        return;
    L182:
        AbstractActivityC0833Ta.access$addObserverForBackInvoker((AbstractActivityC2148ki) r6, (C2335ot) r5);
        return;
    L184:
        CherryViewAPI.m3248D0((String) r6, (ImageView) r5);
        return;
    L186:
        CherryDevServer.m3522e((CherryDevServer.WebSocketConnection) r6, (byte[]) r5);
        return;
    L188:
        CherryDevServer.m3525h((String) r6, (CherryDevServer.WebSocketConnection) r5);
        return;
    L190:
        ((ImageView) r6).setImageBitmap((Bitmap) r5);
        return;
    L192:
        ViewGroup r68 = (ViewGroup) r6;
        ImageView r020 = new ImageView(r68.getContext());
        r020.setImageDrawable((Drawable) r5);
        r020.setClickable(false);
        r020.setScaleType(ImageView.ScaleType.CENTER_CROP);
        r68.addView(r020, 0, new ViewGroup.LayoutParams(-1, -1));
        return;
    L194:
        ExecutorC2303o3 r69 = (ExecutorC2303o3) r6;
        Runnable r511 = (Runnable) r5;
        r69.getClass();
        r511.run();     // Catch: Throwable -> L198
        r69.m4680a();
        return;
    L198:
        th = move-exception;
        r69.m4680a();
        throw th;
    }

    public /* synthetic */ RunnableC2260n3(ActivityLifecycleIntegration r1, InterfaceC1876g0 r2, InterfaceC1876g0 r3) {
        this.f7970a = 22;
        this.f7971b = r2;
        this.f7972c = r3;
    }

    public /* synthetic */ RunnableC2260n3(Object r1, Object r2, Object r3, int r4) {
        this.f7970a = r4;
        this.f7971b = r1;
        this.f7972c = r2;
    }
}
