package p000;

import android.animation.ValueAnimator;
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
import party.iroiro.luajava.luajit.LuaJitConsts;

/* JADX INFO: renamed from: N2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0562N2 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1836a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f1837b;

    public /* synthetic */ RunnableC0562N2(int i, Object obj) {
        this.f1836a = i;
        this.f1837b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:190:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x04d4  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0528 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v21, types: [java.lang.Object, java.util.Map] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        ArrayList arrayList;
        long j;
        ArrayList arrayList2;
        boolean z;
        Drawable drawableM2890b;
        InterfaceC0190Eb interfaceC0190Eb = null;
        int i = 0;
        switch (this.f1836a) {
            case 0:
                C0691Q2 c0691q2 = (C0691Q2) ((C0691Q2) this.f1837b).f2222c.f328b;
                long jUptimeMillis = SystemClock.uptimeMillis();
                ArrayList arrayList3 = c0691q2.f2221b;
                long jUptimeMillis2 = SystemClock.uptimeMillis();
                int i2 = 0;
                while (i2 < arrayList3.size()) {
                    C0643Oy c0643Oy = (C0643Oy) arrayList3.get(i2);
                    if (c0643Oy == null) {
                        arrayList2 = arrayList3;
                    } else {
                        C2520sy c2520sy = c0691q2.f2220a;
                        Long l = (Long) c2520sy.get(c0643Oy);
                        if (l != null) {
                            if (l.longValue() < jUptimeMillis2) {
                                c2520sy.remove(c0643Oy);
                                j = c0643Oy.f2073f;
                                if (j != 0) {
                                    c0643Oy.f2073f = jUptimeMillis;
                                    c0643Oy.m1267c(c0643Oy.f2069b);
                                } else {
                                    long j2 = jUptimeMillis - j;
                                    c0643Oy.f2073f = jUptimeMillis;
                                    float f = C0643Oy.m1265b().f2226g;
                                    long j3 = f == 0.0f ? 2147483647L : (long) (j2 / f);
                                    if (c0643Oy.f2079l) {
                                        float f2 = c0643Oy.f2078k;
                                        if (f2 != Float.MAX_VALUE) {
                                            arrayList2 = arrayList3;
                                            c0643Oy.f2077j.f2212i = f2;
                                            c0643Oy.f2078k = Float.MAX_VALUE;
                                        } else {
                                            arrayList2 = arrayList3;
                                        }
                                        c0643Oy.f2069b = (float) c0643Oy.f2077j.f2212i;
                                        c0643Oy.f2068a = 0.0f;
                                        c0643Oy.f2079l = false;
                                    } else {
                                        arrayList2 = arrayList3;
                                        if (c0643Oy.f2078k != Float.MAX_VALUE) {
                                            long j4 = j3 / 2;
                                            C0751Re c0751ReM1384a = c0643Oy.f2077j.m1384a(c0643Oy.f2069b, c0643Oy.f2068a, j4);
                                            C0686Py c0686Py = c0643Oy.f2077j;
                                            c0686Py.f2212i = c0643Oy.f2078k;
                                            c0643Oy.f2078k = Float.MAX_VALUE;
                                            C0751Re c0751ReM1384a2 = c0686Py.m1384a(c0751ReM1384a.f2387a, c0751ReM1384a.f2388b, j4);
                                            c0643Oy.f2069b = c0751ReM1384a2.f2387a;
                                            c0643Oy.f2068a = c0751ReM1384a2.f2388b;
                                        } else {
                                            C0751Re c0751ReM1384a3 = c0643Oy.f2077j.m1384a(c0643Oy.f2069b, c0643Oy.f2068a, j3);
                                            c0643Oy.f2069b = c0751ReM1384a3.f2387a;
                                            c0643Oy.f2068a = c0751ReM1384a3.f2388b;
                                        }
                                        float fMax = Math.max(c0643Oy.f2069b, -3.4028235E38f);
                                        c0643Oy.f2069b = fMax;
                                        c0643Oy.f2069b = Math.min(fMax, Float.MAX_VALUE);
                                        float f3 = c0643Oy.f2068a;
                                        C0686Py c0686Py2 = c0643Oy.f2077j;
                                        c0686Py2.getClass();
                                        if (Math.abs(f3) >= c0686Py2.f2208e || Math.abs(r4 - ((float) c0686Py2.f2212i)) >= c0686Py2.f2207d) {
                                            z = false;
                                            float fMin = Math.min(c0643Oy.f2069b, Float.MAX_VALUE);
                                            c0643Oy.f2069b = fMin;
                                            float fMax2 = Math.max(fMin, -3.4028235E38f);
                                            c0643Oy.f2069b = fMax2;
                                            c0643Oy.m1267c(fMax2);
                                            if (z) {
                                                continue;
                                            } else {
                                                ArrayList arrayList4 = c0643Oy.f2075h;
                                                c0643Oy.f2072e = false;
                                                C0691Q2 c0691q2M1265b = C0643Oy.m1265b();
                                                c0691q2M1265b.f2220a.remove(c0643Oy);
                                                ArrayList arrayList5 = c0691q2M1265b.f2221b;
                                                int iIndexOf = arrayList5.indexOf(c0643Oy);
                                                if (iIndexOf >= 0) {
                                                    arrayList5.set(iIndexOf, null);
                                                    c0691q2M1265b.f2225f = true;
                                                }
                                                c0643Oy.f2073f = 0L;
                                                for (int i3 = 0; i3 < arrayList4.size(); i3++) {
                                                    if (arrayList4.get(i3) != null) {
                                                        arrayList4.get(i3).getClass();
                                                        throw new ClassCastException();
                                                    }
                                                }
                                                for (int size = arrayList4.size() - 1; size >= 0; size--) {
                                                    if (arrayList4.get(size) == null) {
                                                        arrayList4.remove(size);
                                                    }
                                                }
                                            }
                                        } else {
                                            c0643Oy.f2069b = (float) c0643Oy.f2077j.f2212i;
                                            c0643Oy.f2068a = 0.0f;
                                        }
                                    }
                                    z = true;
                                    float fMin2 = Math.min(c0643Oy.f2069b, Float.MAX_VALUE);
                                    c0643Oy.f2069b = fMin2;
                                    float fMax22 = Math.max(fMin2, -3.4028235E38f);
                                    c0643Oy.f2069b = fMax22;
                                    c0643Oy.m1267c(fMax22);
                                    if (z) {
                                    }
                                }
                            }
                            arrayList2 = arrayList3;
                        } else {
                            j = c0643Oy.f2073f;
                            if (j != 0) {
                            }
                        }
                    }
                    i2++;
                    arrayList3 = arrayList2;
                }
                ArrayList arrayList6 = arrayList3;
                if (c0691q2.f2225f) {
                    int size2 = arrayList6.size() - 1;
                    while (size2 >= 0) {
                        ArrayList arrayList7 = arrayList6;
                        if (arrayList7.get(size2) == null) {
                            arrayList7.remove(size2);
                        }
                        size2--;
                        arrayList6 = arrayList7;
                    }
                    arrayList = arrayList6;
                    if (arrayList.size() == 0 && Build.VERSION.SDK_INT >= 33) {
                        C0649P3 c0649p3 = c0691q2.f2227h;
                        ValueAnimator.unregisterDurationScaleChangeListener((C0605O2) c0649p3.f2089b);
                        c0649p3.f2089b = null;
                    }
                    c0691q2.f2225f = false;
                } else {
                    arrayList = arrayList6;
                }
                if (arrayList.size() > 0) {
                    ((Choreographer) c0691q2.f2224e.f2089b).postFrameCallback(new ChoreographerFrameCallbackC0648P2(c0691q2.f2223d));
                    return;
                }
                return;
            case 1:
                ((CarouselLayoutManager) this.f1837b).requestLayout();
                return;
            case 2:
                CherryDevServer.broadcastLog$lambda$4((byte[]) this.f1837b);
                return;
            case 3:
                CherryDevServer.acceptConnections$lambda$5((Socket) this.f1837b);
                return;
            case 4:
                CherryThreadAPI.register$lambda$23$lambda$22((String) this.f1837b);
                return;
            case 5:
                ((C0569N9) this.f1837b).m1114s(true);
                return;
            case 6:
                ViewTreeObserverOnDrawListenerC0619Oa viewTreeObserverOnDrawListenerC0619Oa = (ViewTreeObserverOnDrawListenerC0619Oa) this.f1837b;
                Runnable runnable = viewTreeObserverOnDrawListenerC0619Oa.f1980b;
                if (runnable != null) {
                    runnable.run();
                    viewTreeObserverOnDrawListenerC0619Oa.f1980b = null;
                    return;
                }
                return;
            case 7:
                DialogC0876Ua.m1717a((DialogC0876Ua) this.f1837b);
                return;
            case LuaJitConsts.LUA_TTHREAD /* 8 */:
                LinearLayout linearLayout = (LinearLayout) this.f1837b;
                C1456gf.m2805o(linearLayout);
                HashMap map = AbstractC0999XA.f3193a;
                C1456gf.m2795M(linearLayout, C1517hw.m2889a(0, AbstractC0295Gu.m625r(-14057427957813L)), C1517hw.m2889a(0, AbstractC0295Gu.m625r(-14181982009397L)), false);
                ArrayList<View> arrayList8 = new ArrayList<>();
                String strM625r = AbstractC0295Gu.m625r(-13752485279797L);
                linearLayout.findViewsWithText(arrayList8, strM625r, 1);
                if (arrayList8.isEmpty() || (drawableM2890b = C1517hw.m2890b((String) AbstractC0457Kk.f1500a.get(strM625r))) == null) {
                    return;
                }
                View viewM2810v = C1456gf.m2810v(linearLayout, AbstractC0295Gu.m625r(-13786845018165L));
                AbstractC0295Gu.m625r(-13932873906229L);
                View childAt = ((ViewGroup) viewM2810v).getChildAt(0);
                AbstractC0295Gu.m625r(-12541304502325L);
                ((ImageView) childAt).setImageDrawable(drawableM2890b);
                return;
            case LuaJitConsts.LUA_GCISRUNNING /* 9 */:
                C2629ve c2629ve = (C2629ve) this.f1837b;
                if (c2629ve.f9125d) {
                    return;
                }
                c2629ve.f9125d = true;
                c2629ve.f9127f = AbstractC0295Gu.m616i(8);
                c2629ve.performHapticFeedback(0);
                c2629ve.animate().scaleX(1.05f).scaleY(1.05f).setDuration(200L).start();
                InterfaceC1416fj interfaceC1416fj = c2629ve.f9132k;
                if (interfaceC1416fj != null) {
                    interfaceC1416fj.mo90g(c2629ve);
                }
                ViewParent parent = c2629ve.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                c2629ve.invalidate();
                return;
            case 10:
                C0494Le c0494Le = (C0494Le) this.f1837b;
                boolean zIsPopupShowing = c0494Le.f1609h.isPopupShowing();
                c0494Le.m959s(zIsPopupShowing);
                c0494Le.f1614m = zIsPopupShowing;
                return;
            case 11:
                C0625Og c0625Og = (C0625Og) this.f1837b;
                Intent launchIntentForPackage = c0625Og.getContext().getPackageManager().getLaunchIntentForPackage(c0625Og.getContext().getPackageName());
                if (launchIntentForPackage != null) {
                    launchIntentForPackage.addFlags(335544320);
                }
                c0625Og.getContext().startActivity(launchIntentForPackage);
                Process.killProcess(Process.myPid());
                return;
            case 12:
                C0626Oh c0626Oh = (C0626Oh) this.f1837b;
                synchronized (c0626Oh.f2002d) {
                    try {
                        if (c0626Oh.f2006h == null) {
                            return;
                        }
                        try {
                            C1098Zh c1098ZhM1220c = c0626Oh.m1220c();
                            int i4 = c1098ZhM1220c.f3490f;
                            if (i4 == 2) {
                                synchronized (c0626Oh.f2002d) {
                                }
                            }
                            if (i4 != 0) {
                                throw new RuntimeException("fetchFonts result is not OK. (" + i4 + ")");
                            }
                            try {
                                int i5 = AbstractC2792zB.f9460a;
                                Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                C0668Pg c0668Pg = c0626Oh.f2001c;
                                Context context = c0626Oh.f1999a;
                                c0668Pg.getClass();
                                C1098Zh[] c1098ZhArr = {c1098ZhM1220c};
                                AbstractC1293cr abstractC1293cr = AbstractC0871UB.f2754a;
                                AbstractC0628Oj.m1239c("TypefaceCompat.createFromFontInfo");
                                try {
                                    Typeface typefaceMo1763r = AbstractC0871UB.f2754a.mo1763r(context, c1098ZhArr, 0);
                                    Trace.endSection();
                                    MappedByteBuffer mappedByteBufferM630w = AbstractC0295Gu.m630w(c0626Oh.f1999a, c1098ZhM1220c.f3485a);
                                    if (mappedByteBufferM630w == null || typefaceMo1763r == null) {
                                        throw new RuntimeException("Unable to open file.");
                                    }
                                    try {
                                        Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                        C2428qs c2428qs = new C2428qs(typefaceMo1763r, AbstractC0671Pj.m1358x(mappedByteBufferM630w));
                                        Trace.endSection();
                                        synchronized (c0626Oh.f2002d) {
                                            try {
                                                AbstractC1293cr abstractC1293cr2 = c0626Oh.f2006h;
                                                if (abstractC1293cr2 != null) {
                                                    abstractC1293cr2.mo2562I(c2428qs);
                                                }
                                            } finally {
                                            }
                                            break;
                                        }
                                        c0626Oh.m1219b();
                                        return;
                                    } finally {
                                        int i6 = AbstractC2792zB.f9460a;
                                    }
                                } finally {
                                    Trace.endSection();
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        } catch (Throwable th2) {
                            synchronized (c0626Oh.f2002d) {
                                try {
                                    AbstractC1293cr abstractC1293cr3 = c0626Oh.f2006h;
                                    if (abstractC1293cr3 != null) {
                                        abstractC1293cr3.mo2561H(th2);
                                    }
                                    c0626Oh.m1219b();
                                    return;
                                } finally {
                                }
                            }
                        }
                    } finally {
                    }
                }
            case 13:
                AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi = (AbstractComponentCallbacksC1503hi) this.f1837b;
                abstractComponentCallbacksC1503hi.f5305N.f1632e.m5269d(abstractComponentCallbacksC1503hi.f5313d);
                abstractComponentCallbacksC1503hi.f5313d = null;
                return;
            case 14:
                C1505hk c1505hk = (C1505hk) this.f1837b;
                Intent launchIntentForPackage2 = c1505hk.getContext().getPackageManager().getLaunchIntentForPackage(c1505hk.getContext().getPackageName());
                if (launchIntentForPackage2 != null) {
                    launchIntentForPackage2.addFlags(335544320);
                }
                c1505hk.getContext().startActivity(launchIntentForPackage2);
                Process.killProcess(Process.myPid());
                return;
            case 15:
                C0461Ko c0461Ko = (C0461Ko) this.f1837b;
                Intent launchIntentForPackage3 = c0461Ko.getContext().getPackageManager().getLaunchIntentForPackage(c0461Ko.getContext().getPackageName());
                if (launchIntentForPackage3 != null) {
                    launchIntentForPackage3.addFlags(335544320);
                }
                c0461Ko.getContext().startActivity(launchIntentForPackage3);
                Process.killProcess(Process.myPid());
                return;
            case 16:
                C0976Wo c0976Wo = (C0976Wo) this.f1837b;
                Intent launchIntentForPackage4 = c0976Wo.getContext().getPackageManager().getLaunchIntentForPackage(c0976Wo.getContext().getPackageName());
                if (launchIntentForPackage4 != null) {
                    launchIntentForPackage4.addFlags(335544320);
                }
                c0976Wo.getContext().startActivity(launchIntentForPackage4);
                Process.killProcess(Process.myPid());
                return;
            case 17:
                ((ScrollView) this.f1837b).fullScroll(130);
                return;
            case 18:
                ((C0762Rp) this.f1837b).m1560g();
                return;
            case 19:
                C2112jq c2112jq = (C2112jq) this.f1837b;
                C1498hd c1498hd = AbstractC1499he.f5282a;
                AbstractC0585Nj.m1128G(AbstractC0671Pj.m1343a(AbstractC1106Zp.f3500a), new C1423fq(c2112jq, interfaceC0190Eb, i), 3);
                return;
            case LuaJitConsts.LUA_MINSTACK /* 20 */:
                MaterialButton.m2445a((MaterialButton) this.f1837b);
                return;
            case 21:
                ProcessLifecycleOwner processLifecycleOwner = (ProcessLifecycleOwner) this.f1837b;
                C1185ao c1185ao = processLifecycleOwner.f3970f;
                if (processLifecycleOwner.f3966b == 0) {
                    processLifecycleOwner.f3967c = true;
                    c1185ao.m2276e(EnumC0632On.ON_PAUSE);
                }
                if (processLifecycleOwner.f3965a == 0 && processLifecycleOwner.f3967c) {
                    c1185ao.m2276e(EnumC0632On.ON_STOP);
                    processLifecycleOwner.f3968d = true;
                    return;
                }
                return;
            case 22:
                ((AbstractC1025Xu) this.f1837b).mo1936m();
                return;
            case 23:
                ScriptManager.notifyStateChanged$lambda$10((LoadedScript) this.f1837b);
                return;
            case 24:
                C1204b6 c1204b6 = (C1204b6) this.f1837b;
                c1204b6.f4127c = false;
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) c1204b6.f4129e;
                C2228mE c2228mE = sideSheetBehavior.f4570i;
                if (c2228mE != null && c2228mE.m4491f()) {
                    c1204b6.m2324a(c1204b6.f4126b);
                    return;
                } else {
                    if (sideSheetBehavior.f4569h == 2) {
                        sideSheetBehavior.m2468r(c1204b6.f4126b);
                        return;
                    }
                    return;
                }
            case 25:
                C2428qs c2428qs2 = ((C1494hG) this.f1837b).f5263a;
                XposedBridge.invokeOriginalMethod((Member) c2428qs2.f8520a, c2428qs2.f8521b, (Object[]) c2428qs2.f8522c);
                return;
            case 26:
                ((TextInputLayout) this.f1837b).f4625e.requestLayout();
                return;
            case 27:
                ((C1127a9) this.f1837b).mo6a();
                return;
            case 28:
                ((TextView) this.f1837b).animate().scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                return;
            default:
                File[] fileArrListFiles = ((File) this.f1837b).listFiles();
                if (fileArrListFiles == null) {
                    return;
                }
                int length = fileArrListFiles.length;
                while (i < length) {
                    File file = fileArrListFiles[i];
                    if (file.lastModified() < AbstractC2066z1.f7303f - TimeUnit.MINUTES.toMillis(5L)) {
                        AbstractC1856a.m4060f(file);
                    }
                    i++;
                }
                return;
        }
    }
}
