package p000;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.C0036a;
import com.github.megatronking.stringfog.Base64;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;

/* JADX INFO: renamed from: p1 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0581p1 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3629a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f3630b;

    public /* synthetic */ RunnableC0581p1(int i, Object obj) {
        this.f3629a = i;
        this.f3630b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r7v0, types: [int] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        Activity activity;
        ?? r4 = 1;
        r4 = 1;
        switch (this.f3629a) {
            case Base64.DEFAULT /* 0 */:
                Activity activity2 = (Activity) this.f3630b;
                if (activity2.isFinishing()) {
                    return;
                }
                Handler handler = AbstractC0692s1.f4375g;
                Method method = AbstractC0692s1.f4374f;
                ?? r7 = Build.VERSION.SDK_INT;
                if (r7 >= 28) {
                    activity2.recreate();
                    return;
                }
                if (((r7 != 26 && r7 != 27) || method != null) && (AbstractC0692s1.f4373e != null || AbstractC0692s1.f4372d != null)) {
                    try {
                        Object obj2 = AbstractC0692s1.f4371c.get(activity2);
                        if (obj2 != null && (obj = AbstractC0692s1.f4370b.get(activity2)) != null) {
                            Application application = activity2.getApplication();
                            C0655r1 c0655r1 = new C0655r1(activity2);
                            application.registerActivityLifecycleCallbacks(c0655r1);
                            handler.post(new RunnableC0282h1(c0655r1, obj2, 1, false));
                            if (r7 != 26 && r7 != 27) {
                                r4 = 0;
                            }
                            try {
                                if (r4 != 0) {
                                    try {
                                        Boolean bool = Boolean.FALSE;
                                        r4 = application;
                                        r7 = c0655r1;
                                        method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                                    } catch (Throwable th) {
                                        th = th;
                                        ?? r42 = application;
                                        ?? r72 = c0655r1;
                                        handler.post(new RunnableC0282h1(r42, r72, 2, false));
                                        throw th;
                                    }
                                } else {
                                    r4 = application;
                                    r7 = c0655r1;
                                    activity2.recreate();
                                }
                                handler.post(new RunnableC0282h1(r4, r7, 2, false));
                                return;
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
                activity2.recreate();
                return;
            case Base64.NO_PADDING /* 1 */:
                ((CarouselLayoutManager) this.f3630b).m1971j0();
                return;
            case Base64.NO_WRAP /* 2 */:
                ((C0775ua) this.f3630b).m2432s(true);
                return;
            case 3:
                ((ComponentActivity) this.f3630b).invalidateOptionsMenu();
                return;
            case 4:
                ExecutorC0813vb executorC0813vb = (ExecutorC0813vb) this.f3630b;
                Runnable runnable = executorC0813vb.f4825b;
                if (runnable != null) {
                    runnable.run();
                    executorC0813vb.f4825b = null;
                    return;
                }
                return;
            case 5:
                DialogC0246g2.m1249a((DialogC0246g2) this.f3630b);
                return;
            case 6:
                C0597ph c0597ph = (C0597ph) this.f3630b;
                boolean zIsPopupShowing = c0597ph.f3894h.isPopupShowing();
                c0597ph.m2117s(zIsPopupShowing);
                c0597ph.f3899m = zIsPopupShowing;
                return;
            case 7:
                C0822vk c0822vk = (C0822vk) this.f3630b;
                synchronized (c0822vk.f4863d) {
                    try {
                        if (c0822vk.f4867h == null) {
                            return;
                        }
                        try {
                            C0265gl c0265glM2520b = c0822vk.m2520b();
                            int i = c0265glM2520b.f2140e;
                            if (i == 2) {
                                synchronized (c0822vk.f4863d) {
                                }
                            }
                            if (i != 0) {
                                throw new RuntimeException("fetchFonts result is not OK. (" + i + ")");
                            }
                            try {
                                int i2 = n70.f3350a;
                                m70.m1798a("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                C0819vh c0819vh = c0822vk.f4862c;
                                Context context = c0822vk.f4860a;
                                c0819vh.getClass();
                                Typeface typefaceMo644h = b80.f779a.mo644h(context, new C0265gl[]{c0265glM2520b}, 0);
                                MappedByteBuffer mappedByteBufferM1312o = AbstractC0273gt.m1312o(c0822vk.f4860a, c0265glM2520b.f2136a);
                                if (mappedByteBufferM1312o == null || typefaceMo644h == null) {
                                    throw new RuntimeException("Unable to open file.");
                                }
                                try {
                                    m70.m1798a("EmojiCompat.MetadataRepo.create");
                                    C0009a8 c0009a8 = new C0009a8(typefaceMo644h, AbstractC0273gt.m1315x(mappedByteBufferM1312o));
                                    m70.m1799b();
                                    m70.m1799b();
                                    synchronized (c0822vk.f4863d) {
                                        try {
                                            AbstractC0346ip abstractC0346ip = c0822vk.f4867h;
                                            if (abstractC0346ip != null) {
                                                abstractC0346ip.mo1277I(c0009a8);
                                            }
                                        } finally {
                                        }
                                        break;
                                    }
                                    c0822vk.m2519a();
                                    return;
                                } finally {
                                    int i3 = n70.f3350a;
                                    m70.m1799b();
                                }
                            } catch (Throwable th3) {
                                throw th3;
                            }
                            break;
                        } catch (Throwable th4) {
                            synchronized (c0822vk.f4863d) {
                                try {
                                    AbstractC0346ip abstractC0346ip2 = c0822vk.f4867h;
                                    if (abstractC0346ip2 != null) {
                                        abstractC0346ip2.mo1276F(th4);
                                    }
                                    c0822vk.m2519a();
                                    return;
                                } finally {
                                }
                            }
                        }
                    } finally {
                    }
                }
            case 8:
                ((e00) this.f3630b).f1659a = false;
                return;
            case 9:
                String str = (String) ((i00) this.f3630b).f2326b;
                C0267gn.f2144a.getClass();
                WeakReference weakReference = C0267gn.f2149f;
                if (weakReference == null || (activity = (Activity) weakReference.get()) == null) {
                    return;
                }
                try {
                    Intent intent = new Intent();
                    intent.setClassName(activity.getPackageName(), pb0.f3750b0);
                    intent.putExtra(u40.m2419a("siphfbKnIOivKkdXrqo=\n", "2U8YItzGVIE=\n"), str);
                    intent.putExtra(u40.m2419a("2fnoxzRSwA==\n", "spyRmEMzubQ=\n"), 1);
                    intent.addFlags(268435456);
                    activity.startActivity(intent);
                    return;
                } catch (Throwable unused2) {
                    return;
                }
            case 10:
                C0278gy c0278gy = (C0278gy) this.f3630b;
                C0036a c0036a = c0278gy.f2176f;
                if (c0278gy.f2172b == 0) {
                    c0278gy.f2173c = true;
                    c0036a.m277d(EnumC0347iq.ON_PAUSE);
                }
                if (c0278gy.f2171a == 0 && c0278gy.f2173c) {
                    c0036a.m277d(EnumC0347iq.ON_STOP);
                    c0278gy.f2174d = true;
                    return;
                }
                return;
            case 11:
                ((AbstractC0947yy) this.f3630b).mo797e();
                return;
            case 12:
                C0772u7 c0772u7 = (C0772u7) this.f3630b;
                c0772u7.f4676c = false;
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) c0772u7.f4678e;
                ma0 ma0Var = sideSheetBehavior.f1153i;
                if (ma0Var != null && ma0Var.m1806f()) {
                    c0772u7.m2425a(c0772u7.f4675b);
                    return;
                } else {
                    if (sideSheetBehavior.f1152h == 2) {
                        sideSheetBehavior.m762r(c0772u7.f4675b);
                        return;
                    }
                    return;
                }
            case 13:
                ((TextInputLayout) this.f3630b).f1204d.requestLayout();
                return;
            default:
                mb0 mb0Var = (mb0) this.f3630b;
                if (AbstractC0346ip.m1497i(mb0Var.f3186a.getTag(2114322440), Long.valueOf(mb0Var.f3189d))) {
                    mb0Var.f3186a.setTag(2114322440, null);
                    return;
                }
                return;
        }
    }
}
