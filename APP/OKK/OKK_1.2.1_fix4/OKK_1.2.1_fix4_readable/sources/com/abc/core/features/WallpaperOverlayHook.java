package com.abc.core.features;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.abc.loader.ModernHookEntry;
import de.robv.android.xposed.AbstractC0762d;
import java.io.File;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import p001A0.AbstractC0040p;
import p007D0.AbstractC0141g;
import p007D0.C0140f;
import p009E0.AbstractC0181l;
import p009E0.AbstractC0182m;
import p011F0.C0197a;
import p011F0.C0199c;
import p026N0.AbstractC0270k;
import p031Q0.AbstractC0307g;
import p034S.AbstractC0324d;
import p042W0.AbstractC0416a;
import p042W0.AbstractC0425j;

/* JADX INFO: renamed from: c0.G1 */
/* JADX INFO: loaded from: classes.dex */
public final class WallpaperOverlayHook {

    /* JADX INFO: renamed from: b */
    public static volatile Activity f1793b;

    /* JADX INFO: renamed from: c */
    public static volatile boolean f1794c;

    /* JADX INFO: renamed from: d */
    public static volatile long f1795d;

    /* JADX INFO: renamed from: l */
    public static volatile WeakReference f1803l;

    /* JADX INFO: renamed from: a */
    public static final Object f1792a = new Object();

    /* JADX INFO: renamed from: e */
    public static final Handler f1796e = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: f */
    public static final WeakHashMap f1797f = new WeakHashMap();

    /* JADX INFO: renamed from: g */
    public static final WeakHashMap f1798g = new WeakHashMap();

    /* JADX INFO: renamed from: h */
    public static final WeakHashMap f1799h = new WeakHashMap();

    /* JADX INFO: renamed from: i */
    public static final WeakHashMap f1800i = new WeakHashMap();

    /* JADX INFO: renamed from: j */
    public static final WeakHashMap f1801j = new WeakHashMap();

    /* JADX INFO: renamed from: k */
    public static final WeakHashMap f1802k = new WeakHashMap();

    /* JADX INFO: renamed from: m */
    public static final Set f1804m = AbstractC0040p.m92W("com.tencent.mm.ui.chatting.gallery.ImageGalleryUI", "com.tencent.mm.ui.chatting.gallery.ImageGalleryGridUI", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI", "com.tencent.mm.plugin.scanner.ui.BaseScanUI", "com.tencent.mm.plugin.voip.ui.VideoActivity", "com.tencent.mm.plugin.gallery.ui.ImagePreviewUI", "com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI", "com.tencent.mm.plugin.finder.ui.FinderHomeAffinityUI", "com.tencent.mm.plugin.location_soso.SoSoProxyUI");

    /* JADX INFO: renamed from: A */
    public static int m1438A(Activity activity, String str) {
        Object objM116u;
        try {
            objM116u = Integer.valueOf(Class.forName("com.tencent.mm.R$id", false, activity.getClassLoader()).getDeclaredField(str).getInt(null));
        } catch (Throwable th) {
            objM116u = AbstractC0040p.m116u(th);
        }
        if (AbstractC0141g.m465a(objM116u) != null) {
            objM116u = Integer.valueOf(activity.getResources().getIdentifier(str, "id", ModernHookEntry.WECHAT_PACKAGE));
        }
        return ((Number) objM116u).intValue();
    }

    /* JADX INFO: renamed from: B */
    public static void m1439B(Activity activity) {
        View decorView;
        if (m1459q(activity)) {
            m1466x(activity);
            f1802k.remove(activity);
            f1801j.put(activity, Long.valueOf(SystemClock.uptimeMillis() + 1600));
            m1441D("restoreAfterChatClose ".concat(activity.getClass().getSimpleName()));
            m1443a(activity);
            m1450h(activity);
            long[] jArr = {80, 240, 650, 1400};
            for (int i2 = 0; i2 < 4; i2++) {
                long j2 = jArr[i2];
                Window window = activity.getWindow();
                if (window != null && (decorView = window.getDecorView()) != null) {
                    decorView.postDelayed(new RunnableC0701v(activity, 3), j2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: C */
    public static void m1440C(ImageView imageView) {
        float fM1387c = ThemeWallpaperConfig.m1387c(ThemeWallpaperConfig.f1701a.m1391a());
        imageView.animate().cancel();
        imageView.setAlpha(fM1387c);
        imageView.setVisibility(0);
        m1460r(imageView);
    }

    /* JADX INFO: renamed from: D */
    public static void m1441D(String str) {
        try {
            AbstractC0270k.m693j0(new File("/storage/emulated/0/Android/media/com.tencent.mm/OKK", "theme_debug.txt"), System.currentTimeMillis() + "\n" + str + "\n", AbstractC0416a.f921a);
        } catch (Throwable th) {
            AbstractC0040p.m116u(th);
        }
        m1442E(str);
    }

    /* JADX INFO: renamed from: E */
    public static void m1442E(String str) {
        try {
            AbstractC0762d.m1954d("OKK-ThemeWp: " + str);
        } catch (Throwable th) {
            AbstractC0040p.m116u(th);
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m1443a(Activity activity) {
        View decorView;
        View decorView2;
        AbstractC0307g.m703e(activity, "activity");
        if (activity.isFinishing()) {
            return false;
        }
        if (!m1459q(activity)) {
            m1445c(activity);
            m1444b(activity);
            m1454l(activity);
            return false;
        }
        ThemeWallpaperConfig themeWallpaperConfig = ThemeWallpaperConfig.f1701a;
        ThemeWallpaperConfig.m1390g(false);
        if (!themeWallpaperConfig.m1393e()) {
            m1445c(activity);
            m1444b(activity);
            m1446d(activity);
            m1454l(activity);
            return false;
        }
        WeakHashMap weakHashMap = f1802k;
        Long l2 = (Long) weakHashMap.get(activity);
        if (l2 != null) {
            if (l2.longValue() > SystemClock.uptimeMillis()) {
                m1454l(activity);
                Window window = activity.getWindow();
                if (window != null && (decorView2 = window.getDecorView()) != null) {
                    m1467y(decorView2);
                }
                m1445c(activity);
                m1444b(activity);
                m1446d(activity);
                return false;
            }
            weakHashMap.remove(activity);
        }
        if (AbstractC0425j.m1005J0(activity.getClass().getName(), "LauncherUI", false) && m1458p(activity)) {
            m1454l(activity);
            Window window2 = activity.getWindow();
            if (window2 != null && (decorView = window2.getDecorView()) != null) {
                m1467y(decorView);
            }
            m1445c(activity);
            m1444b(activity);
            m1446d(activity);
            return false;
        }
        Bitmap bitmapM1392b = themeWallpaperConfig.m1392b();
        if (bitmapM1392b == null || bitmapM1392b.isRecycled()) {
            m1445c(activity);
            m1444b(activity);
            m1446d(activity);
            m1454l(activity);
            return false;
        }
        try {
            ThemeWallpaperConfig.m1390g(false);
            String str = ThemeWallpaperConfig.f1706f + ":" + ThemeWallpaperConfig.f1707g;
            m1445c(activity);
            m1444b(activity);
            m1446d(activity);
            Window window3 = activity.getWindow();
            ImageView imageViewM1448f = null;
            View decorView3 = window3 != null ? window3.getDecorView() : null;
            ViewGroup viewGroup = decorView3 instanceof ViewGroup ? (ViewGroup) decorView3 : null;
            if (viewGroup == null) {
                return false;
            }
            WeakReference weakReference = (WeakReference) f1797f.get(activity);
            ImageView imageView = weakReference != null ? (ImageView) weakReference.get() : null;
            if (m1456n(viewGroup, bitmapM1392b, str)) {
                m1454l(activity);
                return true;
            }
            if (imageView == null || imageView.getParent() == null) {
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = viewGroup.getChildAt(i2);
                    if (childAt instanceof ImageView) {
                        ImageView imageView2 = (ImageView) childAt;
                        if (AbstractC0307g.m699a(imageView2.getTag(), "achat_global_bg_overlay_v4") || AbstractC0307g.m699a(imageView2.getTag(), "achat_global_bg_overlay") || AbstractC0307g.m699a(imageView2.getTag(), "achat_global_bg_overlay_v4")) {
                            imageViewM1448f = imageView2;
                            break;
                        }
                    }
                }
                if (imageViewM1448f == null) {
                    imageViewM1448f = m1448f(activity, viewGroup);
                }
                imageView = imageViewM1448f;
                f1797f.put(activity, new WeakReference(imageView));
                m1455m(activity, viewGroup, imageView);
            }
            if (!AbstractC0307g.m699a(imageView.getTag(1426194449), str)) {
                imageView.setImageBitmap(bitmapM1392b);
                imageView.setTag(1426194449, str);
            }
            imageView.setAlpha(ThemeWallpaperConfig.m1387c(ThemeWallpaperConfig.f1701a.m1391a()));
            m1440C(imageView);
            return true;
        } catch (Throwable th) {
            m1442E("apply fail: " + th.getMessage());
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0042  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m1444b(Activity activity) {
        View viewFindViewById;
        if (AbstractC0425j.m1005J0(activity.getClass().getName(), "LauncherUI", false)) {
            int iM1438A = m1438A(activity, "k7n");
            if (iM1438A == 0 || (viewFindViewById = activity.findViewById(iM1438A)) == null) {
                int iM1438A2 = m1438A(activity, "o7q");
                if (iM1438A2 == 0) {
                    viewFindViewById = null;
                } else {
                    View viewFindViewById2 = activity.findViewById(iM1438A2);
                    Object tag = viewFindViewById2 != null ? viewFindViewById2.getTag() : null;
                    viewFindViewById = tag instanceof View ? (View) tag : null;
                    if (viewFindViewById == null) {
                    }
                }
            }
            if (viewFindViewById == null) {
                return;
            }
            if (viewFindViewById.getTag(1426194450) != null) {
                viewFindViewById.setBackground(null);
                viewFindViewById.setForeground(null);
                viewFindViewById.setTag(1426194450, null);
            }
            m1447e(viewFindViewById);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m1445c(Activity activity) {
        Window window;
        View decorView;
        if (!AbstractC0425j.m1005J0(activity.getClass().getName(), "LauncherUI", false) || (window = activity.getWindow()) == null || (decorView = window.getDecorView()) == null || decorView.getTag(1426194451) == null) {
            return;
        }
        decorView.setBackground(null);
        decorView.setTag(1426194451, null);
    }

    /* JADX INFO: renamed from: d */
    public static void m1446d(Activity activity) {
        View decorView;
        Window window = activity.getWindow();
        if (window == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        WeakHashMap weakHashMap = f1800i;
        Set setEntrySet = weakHashMap.entrySet();
        AbstractC0307g.m702d(setEntrySet, "<get-entries>(...)");
        for (Object obj : AbstractC0181l.m553y0(setEntrySet)) {
            AbstractC0307g.m702d(obj, "next(...)");
            Map.Entry entry = (Map.Entry) obj;
            ViewGroup viewGroup = (ViewGroup) entry.getKey();
            ViewTreeObserver.OnPreDrawListener onPreDrawListener = (ViewTreeObserver.OnPreDrawListener) entry.getValue();
            try {
                if (viewGroup.getViewTreeObserver().isAlive()) {
                    viewGroup.getViewTreeObserver().removeOnPreDrawListener(onPreDrawListener);
                }
            } catch (Throwable th) {
                AbstractC0040p.m116u(th);
            }
        }
        weakHashMap.clear();
        m1447e(decorView);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m1447e(View view) {
        if (!(view instanceof ViewGroup)) {
            return;
        }
        if (view.getTag(1426194452) != null) {
            ((ViewGroup) view).setBackground(null);
            view.setTag(1426194452, null);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                return;
            }
            View childAt = viewGroup.getChildAt(childCount);
            if (childAt instanceof ImageView) {
                ImageView imageView = (ImageView) childAt;
                if (AbstractC0307g.m699a(imageView.getTag(), "achat_page_bg_under_content_v1")) {
                    imageView.setImageDrawable(null);
                    viewGroup.removeViewAt(childCount);
                } else {
                    AbstractC0307g.m700b(childAt);
                    m1447e(childAt);
                }
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static ImageView m1448f(Activity activity, ViewGroup viewGroup) {
        ImageView imageView = new ImageView(activity);
        imageView.setTag("achat_global_bg_overlay_v4");
        imageView.setBackground(null);
        imageView.setClickable(false);
        imageView.setFocusable(false);
        imageView.setFocusableInTouchMode(false);
        imageView.setImportantForAccessibility(2);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setOnTouchListener(new ViewOnTouchListenerC0584E1());
        imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        imageView.setElevation(50000.0f);
        imageView.setTranslationZ(50000.0f);
        viewGroup.addView(imageView);
        m1442E("overlay created " + activity.getClass().getSimpleName() + " children=" + viewGroup.getChildCount());
        return imageView;
    }

    /* JADX INFO: renamed from: g */
    public static Boolean m1449g(Activity activity) {
        Object objM116u;
        Method method;
        try {
            Method[] methods = activity.getClass().getMethods();
            AbstractC0307g.m702d(methods, "getMethods(...)");
            int length = methods.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    method = null;
                    break;
                }
                method = methods[i2];
                if (AbstractC0307g.m699a(method.getName(), "getCurrentFragmet")) {
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    AbstractC0307g.m702d(parameterTypes, "getParameterTypes(...)");
                    if (parameterTypes.length == 0) {
                        break;
                    }
                }
                i2++;
            }
            if (method == null) {
                objM116u = null;
            } else {
                Object objInvoke = method.invoke(activity, null);
                objM116u = objInvoke == null ? Boolean.FALSE : Boolean.valueOf(AbstractC0425j.m1005J0(objInvoke.getClass().getName(), "chatting", true));
            }
        } catch (Throwable th) {
            objM116u = AbstractC0040p.m116u(th);
        }
        return (Boolean) (objM116u instanceof C0140f ? null : objM116u);
    }

    /* JADX INFO: renamed from: h */
    public static void m1450h(Activity activity) {
        int iM1438A;
        View viewFindViewById;
        if (!AbstractC0425j.m1005J0(activity.getClass().getName(), "LauncherUI", false) || (iM1438A = m1438A(activity, "o7q")) == 0 || (viewFindViewById = activity.findViewById(iM1438A)) == null) {
            return;
        }
        try {
            ImageView imageView = viewFindViewById instanceof ImageView ? (ImageView) viewFindViewById : null;
            if (imageView != null) {
                imageView.setImageDrawable(null);
            }
            viewFindViewById.setVisibility(8);
            Object tag = viewFindViewById.getTag();
            View view = tag instanceof View ? (View) tag : null;
            if (view != null) {
                view.setVisibility(0);
                view.invalidate();
            }
            m1442E("launcher prepareView cleared");
        } catch (Throwable th) {
            AbstractC0040p.m116u(th);
        }
    }

    /* JADX INFO: renamed from: i */
    public static boolean m1451i(View view, String str) {
        if (AbstractC0425j.m1005J0(view.getClass().getName(), str, true) && view.getVisibility() == 0 && view.getWidth() > 0 && view.getHeight() > view.getResources().getDisplayMetrics().heightPixels / 3) {
            return true;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            if (childCount > 12) {
                childCount = 12;
            }
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                AbstractC0307g.m702d(childAt, "getChildAt(...)");
                if (m1451i(childAt, str)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public static String m1452j() {
        Object objM116u;
        try {
            ThemeWallpaperConfig themeWallpaperConfig = ThemeWallpaperConfig.f1701a;
            ThemeWallpaperConfig.m1390g(true);
            boolean zM1393e = themeWallpaperConfig.m1393e();
            WeakHashMap weakHashMap = f1799h;
            if (!zM1393e) {
                Set setKeySet = weakHashMap.keySet();
                AbstractC0307g.m702d(setKeySet, "<get-keys>(...)");
                for (Activity activity : AbstractC0181l.m553y0(setKeySet)) {
                    AbstractC0307g.m700b(activity);
                    m1445c(activity);
                    m1444b(activity);
                    m1446d(activity);
                    m1454l(activity);
                }
                objM116u = "未启用：请打开「启用壁纸」";
            } else if (themeWallpaperConfig.m1392b() == null) {
                objM116u = "无图片：请先选择壁纸";
            } else {
                Activity activityM1468z = m1468z();
                if (activityM1468z != null) {
                    m1466x(activityM1468z);
                }
                if (activityM1468z == null && weakHashMap.isEmpty()) {
                    objM116u = "请回到微信首页再点应用";
                } else {
                    C0199c c0199c = new C0199c(10);
                    if (activityM1468z != null) {
                        c0199c.add(activityM1468z);
                    }
                    Set setKeySet2 = weakHashMap.keySet();
                    AbstractC0307g.m702d(setKeySet2, "<get-keys>(...)");
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : setKeySet2) {
                        Activity activity2 = (Activity) obj;
                        if (!activity2.isFinishing() && activity2 != activityM1468z) {
                            arrayList.add(obj);
                        }
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        c0199c.add((Activity) it.next());
                    }
                    C0199c c0199cM103f = AbstractC0040p.m103f(c0199c);
                    int i2 = 0;
                    ListIterator listIterator = c0199cM103f.listIterator(0);
                    while (true) {
                        C0197a c0197a = (C0197a) listIterator;
                        if (!c0197a.hasNext()) {
                            break;
                        }
                        Activity activity3 = (Activity) c0197a.next();
                        AbstractC0307g.m700b(activity3);
                        if (m1443a(activity3)) {
                            i2++;
                        }
                    }
                    ThemeWallpaperConfig themeWallpaperConfig2 = ThemeWallpaperConfig.f1701a;
                    m1441D("forceApply n=" + i2 + " elev=50000.0 a=" + themeWallpaperConfig2.m1391a());
                    objM116u = "已应用 " + i2 + " 处 · 不透明度" + ((int) (themeWallpaperConfig2.m1391a() * 100)) + "%（顶层遮罩）";
                }
            }
        } catch (Throwable th) {
            objM116u = AbstractC0040p.m116u(th);
        }
        Throwable thM465a = AbstractC0141g.m465a(objM116u);
        if (thM465a != null) {
            objM116u = AbstractC0324d.m725h("应用失败：", thM465a.getMessage());
        }
        return (String) objM116u;
    }

    /* JADX INFO: renamed from: k */
    public static void m1453k(Activity activity) {
        View decorView;
        if (m1459q(activity)) {
            m1466x(activity);
            f1801j.remove(activity);
            f1802k.put(activity, Long.valueOf(SystemClock.uptimeMillis() + 10000));
            m1454l(activity);
            Window window = activity.getWindow();
            if (window != null && (decorView = window.getDecorView()) != null) {
                m1467y(decorView);
            }
            m1445c(activity);
            m1444b(activity);
            m1446d(activity);
        }
    }

    /* JADX INFO: renamed from: l */
    public static void m1454l(Activity activity) {
        ImageView imageView;
        try {
            WeakReference weakReference = (WeakReference) f1797f.get(activity);
            if (weakReference != null && (imageView = (ImageView) weakReference.get()) != null) {
                imageView.animate().cancel();
                imageView.setAlpha(0.0f);
                imageView.setVisibility(8);
            }
        } catch (Throwable th) {
            AbstractC0040p.m116u(th);
        }
    }

    /* JADX INFO: renamed from: m */
    public static void m1455m(Activity activity, ViewGroup viewGroup, ImageView imageView) {
        WeakHashMap weakHashMap = f1798g;
        ViewTreeObserverOnPreDrawListenerC0587F1 viewTreeObserverOnPreDrawListenerC0587F1 = (ViewTreeObserverOnPreDrawListenerC0587F1) weakHashMap.get(activity);
        if (viewTreeObserverOnPreDrawListenerC0587F1 != null) {
            ViewGroup viewGroup2 = viewTreeObserverOnPreDrawListenerC0587F1.f1765b;
            viewTreeObserverOnPreDrawListenerC0587F1.f1767d = false;
            try {
                if (viewGroup2.getViewTreeObserver().isAlive()) {
                    viewGroup2.getViewTreeObserver().removeOnPreDrawListener(viewTreeObserverOnPreDrawListenerC0587F1);
                }
                viewGroup2.setOnHierarchyChangeListener(null);
            } catch (Throwable th) {
                AbstractC0040p.m116u(th);
            }
        }
        ViewTreeObserverOnPreDrawListenerC0587F1 viewTreeObserverOnPreDrawListenerC0587F12 = new ViewTreeObserverOnPreDrawListenerC0587F1(activity, viewGroup, imageView);
        weakHashMap.put(activity, viewTreeObserverOnPreDrawListenerC0587F12);
        ViewGroup viewGroup3 = viewTreeObserverOnPreDrawListenerC0587F12.f1765b;
        if (viewTreeObserverOnPreDrawListenerC0587F12.f1767d) {
            return;
        }
        viewTreeObserverOnPreDrawListenerC0587F12.f1767d = true;
        try {
            viewGroup3.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC0587F12);
            viewGroup3.setOnHierarchyChangeListener(viewTreeObserverOnPreDrawListenerC0587F12);
        } catch (Throwable th2) {
            AbstractC0040p.m116u(th2);
        }
    }

    /* JADX INFO: renamed from: n */
    public static boolean m1456n(ViewGroup viewGroup, Bitmap bitmap, String str) {
        ImageView imageView;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        m1457o(arrayList, arrayList2, viewGroup, 0);
        if (arrayList.isEmpty()) {
            arrayList.addAll(arrayList2);
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        float fM1387c = ThemeWallpaperConfig.m1387c(ThemeWallpaperConfig.f1701a.m1391a());
        String str2 = str + ":" + ThemeWallpaperConfig.m1388d(fM1387c);
        int i2 = 0;
        for (ViewGroup viewGroup2 : AbstractC0181l.m543o0(arrayList)) {
            int childCount = viewGroup2.getChildCount();
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    imageView = null;
                    break;
                }
                View childAt = viewGroup2.getChildAt(i3);
                if (childAt instanceof ImageView) {
                    imageView = (ImageView) childAt;
                    if (AbstractC0307g.m699a(imageView.getTag(), "achat_under_wallpaper_v1")) {
                        break;
                    }
                }
                i3++;
            }
            if (imageView == null) {
                imageView = new ImageView(viewGroup2.getContext());
                imageView.setTag("achat_under_wallpaper_v1");
                imageView.setTag(1426194453, Boolean.TRUE);
                imageView.setClickable(false);
                imageView.setFocusable(false);
                imageView.setImportantForAccessibility(2);
                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                imageView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                viewGroup2.addView(imageView, 0);
            }
            if (!AbstractC0307g.m699a(imageView.getTag(1426194449), str2)) {
                imageView.setImageBitmap(bitmap);
                imageView.setImageAlpha(AbstractC0040p.m111p((int) (255.0f * fM1387c), 1, 255));
                imageView.setTag(1426194449, str2);
            }
            imageView.setVisibility(0);
            if (viewGroup2.indexOfChild(imageView) != 0) {
                viewGroup2.removeView(imageView);
                viewGroup2.addView(imageView, 0, imageView.getLayoutParams());
            }
            viewGroup2.invalidate();
            i2++;
        }
        if (i2 > 0) {
            m1442E("underlying wallpaper installed containers=" + i2);
        }
        return i2 > 0;
    }

    /* JADX INFO: renamed from: o */
    public static final void m1457o(ArrayList arrayList, ArrayList arrayList2, View view, int i2) {
        if (i2 > 16 || !(view instanceof ViewGroup)) {
            return;
        }
        String name = view.getClass().getName();
        if (AbstractC0425j.m1005J0(name, "ChattingUILayout", false) || AbstractC0425j.m1005J0(name, "chatting", true)) {
            return;
        }
        if (AbstractC0425j.m1005J0(name, "MMWeUIBounceView", false)) {
            arrayList.add(view);
        } else if (AbstractC0425j.m1005J0(name, "FrostedContentView", false)) {
            arrayList2.add(view);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        if (childCount > 80) {
            childCount = 80;
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = viewGroup.getChildAt(i3);
            if (!AbstractC0307g.m699a(childAt.getTag(), "achat_under_wallpaper_v1")) {
                m1457o(arrayList, arrayList2, childAt, i2 + 1);
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public static boolean m1458p(Activity activity) {
        View decorView;
        Object next;
        AbstractC0307g.m703e(activity, "activity");
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (f1793b == activity && jUptimeMillis - f1795d < 1000) {
            return f1794c;
        }
        boolean zBooleanValue = false;
        try {
            boolean zM1005J0 = AbstractC0425j.m1005J0(activity.getClass().getName(), "LauncherUI", false);
            Boolean boolM1461s = m1461s(activity);
            if (boolM1461s != null) {
                zBooleanValue = boolM1461s.booleanValue();
            } else if (zM1005J0) {
                Boolean boolM1449g = m1449g(activity);
                if (boolM1449g != null) {
                    zBooleanValue = boolM1449g.booleanValue();
                }
            } else {
                Method[] methods = activity.getClass().getMethods();
                AbstractC0307g.m702d(methods, "getMethods(...)");
                ArrayList arrayList = new ArrayList();
                for (Method method : methods) {
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    AbstractC0307g.m702d(parameterTypes, "getParameterTypes(...)");
                    if (parameterTypes.length == 0) {
                        Class<?> returnType = method.getReturnType();
                        Class cls = Boolean.TYPE;
                        if (AbstractC0307g.m699a(returnType, cls) || AbstractC0307g.m699a(method.getReturnType(), cls)) {
                            arrayList.add(method);
                        }
                    }
                }
                Iterator it = AbstractC0182m.m556h0("isChattingForeground", "isMainTab", "getChattingBoolean").iterator();
                while (true) {
                    if (!it.hasNext()) {
                        Window window = activity.getWindow();
                        if (window != null && (decorView = window.getDecorView()) != null && (m1451i(decorView, "ChattingUILayout") || m1451i(decorView, "chatting.view"))) {
                            break;
                        }
                    } else {
                        String str = (String) it.next();
                        Iterator it2 = arrayList.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it2.next();
                            if (AbstractC0307g.m699a(((Method) next).getName(), str)) {
                                break;
                            }
                        }
                        Method method2 = (Method) next;
                        if (method2 != null) {
                            Object objInvoke = method2.invoke(activity, null);
                            Boolean bool = objInvoke instanceof Boolean ? (Boolean) objInvoke : null;
                            if (bool != null) {
                                boolean zBooleanValue2 = bool.booleanValue();
                                if ((AbstractC0307g.m699a(str, "isChattingForeground") && zBooleanValue2) || (AbstractC0307g.m699a(str, "isMainTab") && !zBooleanValue2)) {
                                    break;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                }
                zBooleanValue = true;
            }
        } catch (Throwable th) {
            AbstractC0040p.m116u(th);
        }
        synchronized (f1792a) {
            f1793b = activity;
            f1794c = zBooleanValue;
            f1795d = jUptimeMillis;
        }
        return zBooleanValue;
    }

    /* JADX INFO: renamed from: q */
    public static boolean m1459q(Activity activity) {
        AbstractC0307g.m703e(activity, "activity");
        String name = activity.getClass().getName();
        if (f1804m.contains(name)) {
            return false;
        }
        if (AbstractC0425j.m1005J0(name, "ChattingUI", false) && !AbstractC0425j.m1005J0(name, "LauncherUI", false)) {
            return false;
        }
        if (AbstractC0425j.m1005J0(name, "LauncherUI", false)) {
            return true;
        }
        return (AbstractC0425j.m1005J0(name, ModernHookEntry.WECHAT_PACKAGE, false) && AbstractC0425j.m1005J0(name, "setting", true)) || AbstractC0425j.m1005J0(name, "SettingsUI", false) || AbstractC0425j.m1005J0(name, "MainSettingsUI", false);
    }

    /* JADX INFO: renamed from: r */
    public static void m1460r(ImageView imageView) {
        try {
            ViewParent parent = imageView.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup == null) {
                return;
            }
            int childCount = viewGroup.getChildCount() - 1;
            if (viewGroup.indexOfChild(imageView) == childCount || childCount < 0) {
                viewGroup.bringChildToFront(imageView);
            } else {
                viewGroup.removeView(imageView);
                viewGroup.addView(imageView);
            }
            imageView.setElevation(50000.0f);
            imageView.setTranslationZ(50000.0f);
            imageView.bringToFront();
            imageView.invalidate();
        } catch (Throwable th) {
            AbstractC0040p.m116u(th);
        }
    }

    /* JADX INFO: renamed from: s */
    public static Boolean m1461s(Activity activity) {
        Object objM116u;
        boolean z2 = false;
        if (!AbstractC0425j.m1005J0(activity.getClass().getName(), "LauncherUI", false)) {
            return null;
        }
        try {
            Field declaredField = activity.getClass().getDeclaredField("chattingTabUI");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(activity);
            if (obj != null) {
                Field declaredField2 = obj.getClass().getDeclaredField("f190374k");
                declaredField2.setAccessible(true);
                if (!declaredField2.getBoolean(obj)) {
                    z2 = true;
                }
            }
            objM116u = Boolean.valueOf(z2);
        } catch (Throwable th) {
            objM116u = AbstractC0040p.m116u(th);
        }
        return (Boolean) (objM116u instanceof C0140f ? null : objM116u);
    }

    /* JADX INFO: renamed from: t */
    public static void m1462t(Activity activity) {
        if (m1459q(activity)) {
            m1466x(activity);
            f1801j.put(activity, Long.valueOf(SystemClock.uptimeMillis() + 1600));
            m1443a(activity);
            m1450h(activity);
        }
    }

    /* JADX INFO: renamed from: u */
    public static void m1463u(Activity activity) {
        View decorView;
        if (m1459q(activity)) {
            m1466x(activity);
            f1802k.put(activity, Long.valueOf(SystemClock.uptimeMillis() + 10000));
            m1442E("prepareForChatOpenSnapshot ".concat(activity.getClass().getSimpleName()));
            m1453k(activity);
            Window window = activity.getWindow();
            if (window == null || (decorView = window.getDecorView()) == null) {
                return;
            }
            decorView.post(new RunnableC0701v(activity, 2));
        }
    }

    /* JADX INFO: renamed from: v */
    public static void m1464v(Activity activity) {
        if (m1459q(activity)) {
            m1466x(activity);
            f1802k.remove(activity);
            f1801j.put(activity, Long.valueOf(SystemClock.uptimeMillis() + 1600));
            m1443a(activity);
            m1450h(activity);
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m1465w() {
        Activity activityM1468z = m1468z();
        if (activityM1468z != null) {
            m1466x(activityM1468z);
        }
        WeakHashMap weakHashMap = f1799h;
        Set setKeySet = weakHashMap.keySet();
        AbstractC0307g.m702d(setKeySet, "<get-keys>(...)");
        for (Activity activity : AbstractC0181l.m553y0(setKeySet)) {
            if (activity.isFinishing()) {
                weakHashMap.remove(activity);
            } else {
                m1443a(activity);
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public static void m1466x(Activity activity) {
        AbstractC0307g.m703e(activity, "activity");
        if (m1459q(activity)) {
            f1799h.put(activity, Boolean.TRUE);
            if (AbstractC0425j.m1005J0(activity.getClass().getName(), "LauncherUI", false)) {
                f1803l = new WeakReference(activity);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002f  */
    /* JADX INFO: renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1467y(View view) {
        if (!(view instanceof ViewGroup)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                return;
            }
            View childAt = viewGroup.getChildAt(childCount);
            if (childAt instanceof ImageView) {
                ImageView imageView = (ImageView) childAt;
                if (AbstractC0307g.m699a(imageView.getTag(), "achat_under_wallpaper_v1")) {
                    imageView.setImageDrawable(null);
                    viewGroup.removeViewAt(childCount);
                } else {
                    AbstractC0307g.m700b(childAt);
                    m1467y(childAt);
                }
            }
        }
    }

    /* JADX INFO: renamed from: z */
    public static Activity m1468z() {
        Object objM116u;
        Method method;
        Activity activity;
        WeakReference weakReference = f1803l;
        if (weakReference != null && (activity = (Activity) weakReference.get()) != null) {
            if (!(!activity.isFinishing())) {
                activity = null;
            }
            if (activity != null) {
                return activity;
            }
        }
        try {
            Method[] methods = Class.forName("com.tencent.mm.ui.LauncherUI").getMethods();
            AbstractC0307g.m702d(methods, "getMethods(...)");
            int length = methods.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    method = null;
                    break;
                }
                method = methods[i2];
                if (AbstractC0307g.m699a(method.getName(), "getInstance")) {
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    AbstractC0307g.m702d(parameterTypes, "getParameterTypes(...)");
                    if (parameterTypes.length == 0 && Modifier.isStatic(method.getModifiers())) {
                        break;
                    }
                }
                i2++;
            }
            if (method == null) {
                return null;
            }
            Object objInvoke = method.invoke(null, null);
            objM116u = objInvoke instanceof Activity ? (Activity) objInvoke : null;
        } catch (Throwable th) {
            objM116u = AbstractC0040p.m116u(th);
        }
        return (Activity) (objM116u instanceof C0140f ? null : objM116u);
    }
}
