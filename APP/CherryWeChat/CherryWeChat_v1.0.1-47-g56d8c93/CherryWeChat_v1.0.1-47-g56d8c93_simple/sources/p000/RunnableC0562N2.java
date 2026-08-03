package p000;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.os.Trace;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import de.robv.android.xposed.XposedBridge;
import io.github.cherrywechat.lua.api.CherryThreadAPI;
import io.github.cherrywechat.lua.dev.CherryDevServer;
import io.github.cherrywechat.lua.loader.LoadedScript;
import io.github.cherrywechat.lua.loader.ScriptManager;
import io.sentry.AbstractC2066z1;
import io.sentry.config.AbstractC1856a;
import java.io.File;
import java.lang.reflect.Member;
import java.net.Socket;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: N2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0562N2 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1836a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f1837b;

    public /* synthetic */ RunnableC0562N2(int r1, Object r2) {
        this.f1836a = r1;
        this.f1837b = r2;
    }

    /* JADX WARN: Type inference failed for: r2v21, types: [java.lang.Object, java.util.Map] */
    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0190Eb r4 = null;
        int r6 = 0;
        switch(this.f1836a) {
            case 0: goto L176;
            case 1: goto L174;
            case 2: goto L172;
            case 3: goto L170;
            case 4: goto L168;
            case 5: goto L166;
            case 6: goto L162;
            case 7: goto L160;
            case 8: goto L154;
            case 9: goto L144;
            case 10: goto L142;
            case 11: goto L137;
            case 12: goto L69;
            case 13: goto L67;
            case 14: goto L62;
            case 15: goto L57;
            case 16: goto L52;
            case 17: goto L50;
            case 18: goto L48;
            case 19: goto L46;
            case 20: goto L44;
            case 21: goto L35;
            case 22: goto L33;
            case 23: goto L31;
            case 24: goto L22;
            case 25: goto L20;
            case 26: goto L18;
            case 27: goto L16;
            case 28: goto L14;
            default: goto L4;
        };
    L4:
        File[] r0 = ((File) this.f1837b).listFiles();
        if (r0 == null) goto L13;
        int r2 = r0.length;
    L8:
        if (r6 >= r2) goto L280;
        File r3 = r0[r6];
        if (r3.lastModified() >= (AbstractC2066z1.f7303f - TimeUnit.MINUTES.toMillis(5))) goto L12;
        AbstractC1856a.m4060f(r3);
    L12:
        r6 = r6 + 1;
        goto L8
    L280:
        return;
    L13:
        return;
    L14:
        ((TextView) this.f1837b).animate().scaleX(1.0f).scaleY(1.0f).setDuration(150).start();
        return;
    L16:
        ((C1127a9) this.f1837b).mo6a();
        return;
    L18:
        ((TextInputLayout) this.f1837b).f4625e.requestLayout();
        return;
    L20:
        C2428qs r02 = ((C1494hG) this.f1837b).f5263a;
        XposedBridge.invokeOriginalMethod((Member) r02.f8520a, r02.f8521b, (Object[]) r02.f8522c);
        return;
    L22:
        C1204b6 r03 = (C1204b6) this.f1837b;
        r03.f4127c = false;
        SideSheetBehavior r32 = (SideSheetBehavior) r03.f4129e;
        C2228mE r42 = r32.f4570i;
        if (r42 == null) goto L28;
        if (r42.m4491f() == false) goto L28;
        r03.m2324a(r03.f4126b);
        return;
    L28:
        if (r32.f4569h != 2) goto L282;
        r32.m2468r(r03.f4126b);
        return;
    L282:
        return;
    L31:
        ScriptManager.m3532a((LoadedScript) this.f1837b);
        return;
    L33:
        ((AbstractC1025Xu) this.f1837b).mo1936m();
        return;
    L35:
        ProcessLifecycleOwner r04 = (ProcessLifecycleOwner) this.f1837b;
        C1185ao r22 = r04.f3970f;
        if (r04.f3966b != 0) goto L39;
        r04.f3967c = true;
        r22.m2276e(EnumC0632On.ON_PAUSE);
    L39:
        if (r04.f3965a == 0) goto L41;
        return;
    L41:
        if (r04.f3967c == false) goto L284;
        r22.m2276e(EnumC0632On.ON_STOP);
        r04.f3968d = true;
        return;
    L284:
        return;
    L44:
        MaterialButton.m2445a((MaterialButton) this.f1837b);
        return;
    L46:
        C2112jq r05 = (C2112jq) this.f1837b;
        C1498hd r23 = AbstractC1499he.f5282a;
        AbstractC0585Nj.m1128G(AbstractC0671Pj.m1343a(AbstractC1106Zp.f3500a), new C1423fq(r05, r4, r6), 3);
        return;
    L48:
        ((C0762Rp) this.f1837b).m1560g();
        return;
    L50:
        ((ScrollView) this.f1837b).fullScroll(130);
        return;
    L52:
        C0976Wo r06 = (C0976Wo) this.f1837b;
        Intent r24 = r06.getContext().getPackageManager().getLaunchIntentForPackage(r06.getContext().getPackageName());
        if (r24 == null) goto L55;
        r24.addFlags(335544320);
    L55:
        r06.getContext().startActivity(r24);
        Process.killProcess(Process.myPid());
        return;
    L57:
        C0461Ko r07 = (C0461Ko) this.f1837b;
        Intent r25 = r07.getContext().getPackageManager().getLaunchIntentForPackage(r07.getContext().getPackageName());
        if (r25 == null) goto L60;
        r25.addFlags(335544320);
    L60:
        r07.getContext().startActivity(r25);
        Process.killProcess(Process.myPid());
        return;
    L62:
        C1505hk r08 = (C1505hk) this.f1837b;
        Intent r26 = r08.getContext().getPackageManager().getLaunchIntentForPackage(r08.getContext().getPackageName());
        if (r26 == null) goto L65;
        r26.addFlags(335544320);
    L65:
        r08.getContext().startActivity(r26);
        Process.killProcess(Process.myPid());
        return;
    L67:
        AbstractComponentCallbacksC1503hi r09 = (AbstractComponentCallbacksC1503hi) this.f1837b;
        C0498Li r27 = r09.f5305N;
        r27.f1632e.m5269d(r09.f5313d);
        r09.f5313d = null;
        return;
    L69:
        C0626Oh r33 = (C0626Oh) this.f1837b;
        Object r43 = r33.f2002d;
        monitor-enter(r43);
    L75:
        th = move-exception;
        throw th;
    L72:
        if (r33.f2006h != null) goto L77;
        monitor-exit(r43);     // Catch: Throwable -> L75
        return;
    L77:
        monitor-exit(r43);     // Catch: Throwable -> L75
        C1098Zh r44 = r33.m1220c();     // Catch: Throwable -> L87
        int r5 = r44.f3490f;     // Catch: Throwable -> L87
        if (r5 != 2) goto L89;
        Object r28 = r33.f2002d;     // Catch: Throwable -> L87
        monitor-enter(r28);     // Catch: Throwable -> L87
        monitor-exit(r28);     // Catch: Throwable -> L84
    L84:
        th = move-exception;
        throw th;     // Catch: Throwable -> L87
    L89:
        if (r5 != 0) goto L122;
        int r29 = AbstractC2792zB.f9460a;     // Catch: Throwable -> L114
        Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");     // Catch: Throwable -> L114
        C0668Pg r010 = r33.f2001c;     // Catch: Throwable -> L114
        Context r210 = r33.f1999a;     // Catch: Throwable -> L114
        r010.getClass();     // Catch: Throwable -> L114
        C1098Zh[] r011 = {r44};     // Catch: Throwable -> L114
        AbstractC1293cr r52 = AbstractC0871UB.f2754a;     // Catch: Throwable -> L114
        AbstractC0628Oj.m1239c("TypefaceCompat.createFromFontInfo");     // Catch: Throwable -> L114
        Typeface r012 = AbstractC0871UB.f2754a.mo1763r(r210, r011, 0);     // Catch: Throwable -> L116
        Trace.endSection();     // Catch: Throwable -> L114
        MappedByteBuffer r211 = AbstractC0295Gu.m630w(r33.f1999a, r44.f3485a);     // Catch: Throwable -> L114
        if (r211 == null) goto L113;
        if (r012 == null) goto L113;
        Trace.beginSection("EmojiCompat.MetadataRepo.create");     // Catch: Throwable -> L109
        C2428qs r45 = new C2428qs(r012, AbstractC0671Pj.m1358x(r211));     // Catch: Throwable -> L109
        Trace.endSection();     // Catch: Throwable -> L114
        Trace.endSection();     // Catch: Throwable -> L87
        Object r212 = r33.f2002d;     // Catch: Throwable -> L87
        monitor-enter(r212);     // Catch: Throwable -> L87
        AbstractC1293cr r013 = r33.f2006h;     // Catch: Throwable -> L102
        if (r013 == null) goto L104;
        r013.mo2562I(r45);     // Catch: Throwable -> L102
    L104:
        monitor-exit(r212);     // Catch: Throwable -> L102
        r33.m1219b();     // Catch: Throwable -> L87
        return;
    L102:
        th = move-exception;
        throw th;     // Catch: Throwable -> L87
    L109:
        th = move-exception;
        int r213 = AbstractC2792zB.f9460a;     // Catch: Throwable -> L114
        Trace.endSection();     // Catch: Throwable -> L114
        throw th;     // Catch: Throwable -> L114
    L113:
        throw new RuntimeException("Unable to open file.");     // Catch: Throwable -> L114
    L116:
        th = move-exception;
        Trace.endSection();     // Catch: Throwable -> L114
        throw th;     // Catch: Throwable -> L114
    L114:
        th = move-exception;
        int r214 = AbstractC2792zB.f9460a;     // Catch: Throwable -> L87
        Trace.endSection();     // Catch: Throwable -> L87
        throw th;     // Catch: Throwable -> L87
    L122:
        throw new RuntimeException("fetchFonts result is not OK. (" + r5 + ")");     // Catch: Throwable -> L87
    L87:
        th = move-exception;
        monitor-enter(r33.f2002d);
        AbstractC1293cr r46 = r33.f2006h;     // Catch: Throwable -> L128
        if (r46 == null) goto L130;
        r46.mo2561H(th);     // Catch: Throwable -> L128
    L130:
        r33.m1219b();
        return;
    L128:
        th = move-exception;
        throw th;
    L137:
        C0625Og r014 = (C0625Og) this.f1837b;
        Intent r215 = r014.getContext().getPackageManager().getLaunchIntentForPackage(r014.getContext().getPackageName());
        if (r215 == null) goto L140;
        r215.addFlags(335544320);
    L140:
        r014.getContext().startActivity(r215);
        Process.killProcess(Process.myPid());
        return;
    L142:
        C0494Le r015 = (C0494Le) this.f1837b;
        boolean r216 = r015.f1609h.isPopupShowing();
        r015.m959s(r216);
        r015.f1614m = r216;
        return;
    L144:
        C2629ve r016 = (C2629ve) this.f1837b;
        if (r016.f9125d == true) goto L287;
        r016.f9125d = true;
        r016.f9127f = AbstractC0295Gu.m616i(8);
        r016.performHapticFeedback(0);
        r016.animate().scaleX(1.05f).scaleY(1.05f).setDuration(200).start();
        InterfaceC1416fj r217 = r016.f9132k;
        if (r217 == null) goto L149;
        r217.mo90g(r016);
    L149:
        ViewParent r218 = r016.getParent();
        if (r218 == null) goto L152;
        r218.requestDisallowInterceptTouchEvent(true);
    L152:
        r016.invalidate();
        return;
    L287:
        return;
    L154:
        LinearLayout r017 = (LinearLayout) this.f1837b;
        C1456gf.m2805o(r017);
        HashMap r219 = AbstractC0999XA.f3193a;
        C1456gf.m2795M(r017, C1517hw.m2889a(0, AbstractC0295Gu.m625r(-14057427957813L)), C1517hw.m2889a(0, AbstractC0295Gu.m625r(-14181982009397L)), false);
        ArrayList<View> r220 = new ArrayList();
        String r34 = AbstractC0295Gu.m625r(-13752485279797L);
        r017.findViewsWithText(r220, r34, 1);
        if (r220.isEmpty() == true) goto L288;
        Drawable r221 = C1517hw.m2890b((String) AbstractC0457Kk.f1500a.get(r34));
        if (r221 == null) goto L289;
        View r018 = C1456gf.m2810v(r017, AbstractC0295Gu.m625r(-13786845018165L));
        AbstractC0295Gu.m625r(-13932873906229L);
        View r019 = ((ViewGroup) r018).getChildAt(0);
        AbstractC0295Gu.m625r(-12541304502325L);
        ((ImageView) r019).setImageDrawable(r221);
        return;
    L289:
        return;
    L288:
        return;
    L160:
        DialogC0876Ua.m1717a((DialogC0876Ua) this.f1837b);
        return;
    L162:
        ViewTreeObserverOnDrawListenerC0619Oa r020 = (ViewTreeObserverOnDrawListenerC0619Oa) this.f1837b;
        Runnable r222 = r020.f1980b;
        if (r222 == null) goto L290;
        r222.run();
        r020.f1980b = null;
        return;
    L290:
        return;
    L166:
        ((C0569N9) this.f1837b).m1114s(true);
        return;
    L168:
        CherryThreadAPI.m3200o((String) this.f1837b);
        return;
    L170:
        CherryDevServer.m3520c((Socket) this.f1837b);
        return;
    L172:
        CherryDevServer.m3518a((byte[]) this.f1837b);
        return;
    L174:
        ((CarouselLayoutManager) this.f1837b).requestLayout();
        return;
    L176:
        C0691Q2 r021 = (C0691Q2) ((C0691Q2) this.f1837b).f2222c.f328b;
        long r223 = SystemClock.uptimeMillis();
        ArrayList r7 = r021.f2221b;
        long r8 = SystemClock.uptimeMillis();
        int r10 = 0;
    L178:
        if (r10 >= r7.size()) goto L234;
        C0643Oy r11 = (C0643Oy) r7.get(r10);
        if (r11 != null) goto L182;
    L181:
        ArrayList r252 = r7;
    L233:
        r10 = r10 + 1;
        r7 = r252;
        goto L178
    L182:
        C2520sy r12 = r021.f2220a;
        Long r13 = (Long) r12.get(r11);
        if (r13 != null) goto L186;
    L188:
        long r122 = r11.f2073f;
        if (r122 != 0) goto L191;
        r11.f2073f = r223;
        r11.m1267c(r11.f2069b);
        goto L181
    L191:
        long r123 = r223 - r122;
        r11.f2073f = r223;
        float r14 = C0643Oy.m1265b().f2226g;
        if (r14 != 0.0f) goto L195;
        long r124 = 2147483647L;
    L194:
        long r224 = r124;
        if (r11.f2079l == false) goto L204;
        float r125 = r11.f2078k;
        if (r125 == Float.MAX_VALUE) goto L201;
        r252 = r7;
        r11.f2077j.f2212i = r125;
        r11.f2078k = Float.MAX_VALUE;
    L202:
        r11.f2069b = (float) r11.f2077j.f2212i;
        r11.f2068a = 0.0f;
        r11.f2079l = false;
    L203:
        boolean r47 = true;
    L214:
        float r62 = Math.min(r11.f2069b, Float.MAX_VALUE);
        r11.f2069b = r62;
        float r53 = Math.max(r62, -3.4028235E38f);
        r11.f2069b = r53;
        r11.m1267c(r53);
        if (r47 == false) goto L233;
        ArrayList r48 = r11.f2075h;
        r11.f2072e = false;
        C0691Q2 r54 = C0643Oy.m1265b();
        r54.f2220a.remove(r11);
        ArrayList r63 = r54.f2221b;
        int r72 = r63.indexOf(r11);
        if (r72 < 0) goto L219;
        r63.set(r72, null);
        r54.f2225f = true;
    L219:
        r11.f2073f = 0;
        int r55 = 0;
    L221:
        if (r55 >= r48.size()) goto L227;
        if (r48.get(r55) != null) goto L225;
        r55 = r55 + 1;
        goto L221
    L225:
        r48.get(r55).getClass();
        throw new ClassCastException();
    L227:
        int r56 = r48.size() - 1;
    L228:
        if (r56 < 0) goto L233;
        if (r48.get(r56) != null) goto L232;
        r48.remove(r56);
    L232:
        r56 = r56 - 1;
        goto L228
    L201:
        r252 = r7;
        goto L202
    L204:
        r252 = r7;
        if (r11.f2078k == Float.MAX_VALUE) goto L207;
        long r31 = r224 / 2;
        C0751Re r49 = r11.f2077j.m1384a(r11.f2069b, r11.f2068a, r31);
        C0686Py r57 = r11.f2077j;
        r57.f2212i = r11.f2078k;
        r11.f2078k = Float.MAX_VALUE;
        C0751Re r410 = r57.m1384a(r49.f2387a, r49.f2388b, r31);
        r11.f2069b = r410.f2387a;
        r11.f2068a = r410.f2388b;
    L208:
        float r411 = Math.max(r11.f2069b, -3.4028235E38f);
        r11.f2069b = r411;
        r11.f2069b = Math.min(r411, Float.MAX_VALUE);
        float r58 = r11.f2068a;
        C0686Py r64 = r11.f2077j;
        r64.getClass();
        if (Math.abs(r58) < r64.f2208e) goto L211;
    L213:
        r47 = false;
        goto L214
    L211:
        if (Math.abs(r4 - ((float) r64.f2212i)) >= r64.f2207d) goto L213;
        r11.f2069b = (float) r11.f2077j.f2212i;
        r11.f2068a = 0.0f;
        goto L203
    L207:
        C0751Re r412 = r11.f2077j.m1384a(r11.f2069b, r11.f2068a, r224);
        r11.f2069b = r412.f2387a;
        r11.f2068a = r412.f2388b;
        goto L208
    L195:
        r124 = (long) (r123 / r14);
        goto L194
    L186:
        if (r13.longValue() >= r8) goto L181;
        r12.remove(r11);
        goto L188
    L234:
        ArrayList r253 = r7;
        if (r021.f2225f == false) goto L248;
        int r225 = r253.size() - 1;
    L237:
        if (r225 < 0) goto L242;
        ArrayList r35 = r253;
        if (r35.get(r225) != null) goto L241;
        r35.remove(r225);
    L241:
        r225 = r225 - 1;
        r253 = r35;
        goto L237
    L242:
        ArrayList r36 = r253;
        if (r36.size() == 0) goto L245;
    L247:
        r021.f2225f = false;
    L250:
        if (r36.size() <= 0) goto L291;
        ((Choreographer) r021.f2224e.f2089b).postFrameCallback(new ChoreographerFrameCallbackC0648P2(r021.f2223d));
        return;
    L291:
        return;
    L245:
        if (Build.VERSION.SDK_INT < 33) goto L247;
        C0649P3 r226 = r021.f2227h;
        AbstractC0859U.m1699i((C0605O2) r226.f2089b);
        r226.f2089b = null;
        goto L247
    L248:
        r36 = r253;
        goto L250
    }
}
