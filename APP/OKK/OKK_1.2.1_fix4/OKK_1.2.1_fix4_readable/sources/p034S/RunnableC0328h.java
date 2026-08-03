package p034S;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.profileinstaller.ProfileInstallerInitializer;
import com.abc.core.features.C0581D1;
import com.abc.core.features.C0588G;
import com.abc.core.features.C0613O0;
import com.abc.core.features.C0615P;
import com.abc.core.features.RealNameTailHook;
import com.abc.core.features.ViewTreeObserverOnPreDrawListenerC0587F1;
import com.abc.core.features.WallpaperOverlayHook;
import com.abc.core.runtime.C0797H;
import com.abc.ui.FloatingBottomTabView;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import p001A0.AbstractC0040p;
import p007D0.AbstractC0141g;
import p007D0.C0146l;
import p009E0.AbstractC0188s;
import p029P0.InterfaceC0275a;
import p029P0.InterfaceC0290p;
import p031Q0.AbstractC0307g;
import p083u.AbstractC1083b;

/* JADX INFO: renamed from: S.h */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0328h implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f640a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f641b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f642c;

    public /* synthetic */ RunnableC0328h(Object obj, Object obj2, int i2) {
        this.f640a = i2;
        this.f641b = obj;
        this.f642c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object objM116u;
        int i2 = 1;
        Object obj = this.f642c;
        Object obj2 = this.f641b;
        switch (this.f640a) {
            case 0:
                ((ProfileInstallerInitializer) obj2).getClass();
                (Build.VERSION.SDK_INT >= 28 ? AbstractC0332l.m750a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new RunnableC0329i((Context) obj, 0), new Random().nextInt(Math.max(1000, 1)) + 5000);
                break;
            case 1:
                FloatingBottomTabView floatingBottomTabView = (FloatingBottomTabView) obj2;
                AbstractC0307g.m703e(floatingBottomTabView, "$bar");
                ViewGroup viewGroup = (ViewGroup) obj;
                AbstractC0307g.m703e(viewGroup, "$parent");
                C0588G.m1419f(floatingBottomTabView, viewGroup, 20);
                break;
            case 2:
                Activity activity = (Activity) obj2;
                AbstractC0307g.m703e(activity, "$activity");
                String str = (String) obj;
                AbstractC0307g.m703e(str, "$name");
                Toast.makeText(activity, "实名: ".concat(str), 0).show();
                RealNameTailHook realNameTailHook = RealNameTailHook.f2163a;
                ClassLoader classLoader = activity.getClassLoader();
                AbstractC0307g.m702d(classLoader, "getClassLoader(...)");
                RealNameTailHook.m1770f(activity, classLoader);
                break;
            case 3:
                C0613O0 c0613o0 = (C0613O0) obj2;
                AbstractC0307g.m703e(c0613o0, "$identity");
                String str2 = (String) obj;
                AbstractC0307g.m703e(str2, "$name");
                RealNameTailHook realNameTailHook2 = RealNameTailHook.f2163a;
                ConcurrentHashMap concurrentHashMap = RealNameTailHook.f2172j;
                String str3 = c0613o0.f1892b;
                CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) concurrentHashMap.get(str3);
                if (copyOnWriteArrayList != null) {
                    AbstractC0188s.m562n0(copyOnWriteArrayList, new C0615P(i2, str3, str2));
                }
                break;
            case 4:
                Activity activity2 = (Activity) obj2;
                AbstractC0307g.m703e(activity2, "$act");
                ViewTreeObserverOnPreDrawListenerC0587F1 viewTreeObserverOnPreDrawListenerC0587F1 = (ViewTreeObserverOnPreDrawListenerC0587F1) obj;
                AbstractC0307g.m703e(viewTreeObserverOnPreDrawListenerC0587F1, "this$0");
                if (!activity2.isFinishing()) {
                    Object obj3 = WallpaperOverlayHook.f1792a;
                    Long l2 = (Long) WallpaperOverlayHook.f1801j.get(activity2);
                    if ((l2 != null && l2.longValue() > SystemClock.uptimeMillis()) || !WallpaperOverlayHook.m1458p(activity2)) {
                        WallpaperOverlayHook.m1460r(viewTreeObserverOnPreDrawListenerC0587F1.f1766c);
                        break;
                    }
                }
                break;
            case 5:
                Activity activity3 = (Activity) obj2;
                AbstractC0307g.m703e(activity3, "$activity");
                InterfaceC0275a interfaceC0275a = (InterfaceC0275a) obj;
                AbstractC0307g.m703e(interfaceC0275a, "$action");
                if (!activity3.isFinishing()) {
                    try {
                        interfaceC0275a.invoke();
                        objM116u = C0146l.f339a;
                    } catch (Throwable th) {
                        objM116u = AbstractC0040p.m116u(th);
                    }
                    if (AbstractC0141g.m465a(objM116u) != null) {
                        Toast.makeText(activity3, "打开失败", 0).show();
                    }
                    break;
                }
                break;
            case 6:
                TextView textView = (TextView) obj2;
                AbstractC0307g.m703e(textView, "$v");
                FloatingBottomTabView floatingBottomTabView2 = (FloatingBottomTabView) obj;
                AbstractC0307g.m703e(floatingBottomTabView2, "this$0");
                textView.animate().scaleX(1.0f).scaleY(1.0f).setDuration(180L).setInterpolator(floatingBottomTabView2.f2639E).start();
                break;
            case 7:
                C0797H c0797h = (C0797H) obj2;
                AbstractC0307g.m703e(c0797h, "$item");
                Activity activity4 = (Activity) obj;
                AbstractC0307g.m703e(activity4, "$host");
                InterfaceC0290p interfaceC0290p = c0797h.f2897f;
                if (interfaceC0290p != null) {
                    interfaceC0290p.mo518b(activity4, new C0581D1(i2));
                }
                break;
            default:
                ((AbstractC1083b) obj2).mo2164g((Typeface) obj);
                break;
        }
    }
}
