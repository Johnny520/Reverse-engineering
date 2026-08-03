package p050c0;

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
import p042W0.AbstractC0425j;

/* JADX INFO: renamed from: c0.G1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0590G1 {

    /* JADX INFO: renamed from: a */
    public static final Object f1792a = null;

    /* JADX INFO: renamed from: b */
    public static volatile Activity f1793b;

    /* JADX INFO: renamed from: c */
    public static volatile boolean f1794c;

    /* JADX INFO: renamed from: d */
    public static volatile long f1795d;

    /* JADX INFO: renamed from: e */
    public static final Handler f1796e = null;

    /* JADX INFO: renamed from: f */
    public static final WeakHashMap f1797f = null;

    /* JADX INFO: renamed from: g */
    public static final WeakHashMap f1798g = null;

    /* JADX INFO: renamed from: h */
    public static final WeakHashMap f1799h = null;

    /* JADX INFO: renamed from: i */
    public static final WeakHashMap f1800i = null;

    /* JADX INFO: renamed from: j */
    public static final WeakHashMap f1801j = null;

    /* JADX INFO: renamed from: k */
    public static final WeakHashMap f1802k = null;

    /* JADX INFO: renamed from: l */
    public static volatile WeakReference f1803l;

    /* JADX INFO: renamed from: m */
    public static final Set f1804m = null;

    static {
        f1792a = new Object();
        f1796e = new Handler(Looper.getMainLooper());
        f1797f = new WeakHashMap();
        f1798g = new WeakHashMap();
        f1799h = new WeakHashMap();
        f1800i = new WeakHashMap();
        f1801j = new WeakHashMap();
        f1802k = new WeakHashMap();
        f1804m = AbstractC0040p.m92W(new String[]{"com.tencent.mm.ui.chatting.gallery.ImageGalleryUI", "com.tencent.mm.ui.chatting.gallery.ImageGalleryGridUI", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI", "com.tencent.mm.plugin.scanner.ui.BaseScanUI", "com.tencent.mm.plugin.voip.ui.VideoActivity", "com.tencent.mm.plugin.gallery.ui.ImagePreviewUI", "com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI", "com.tencent.mm.plugin.finder.ui.FinderHomeAffinityUI", "com.tencent.mm.plugin.location_soso.SoSoProxyUI"});
    }

    /* JADX INFO: renamed from: A */
    public static int m1438A(Activity r3, String r4) {
        Object r02 = Integer.valueOf(Class.forName("com.tencent.mm.R$id", false, r3.getClassLoader()).getDeclaredField(r4).getInt(null));     // Catch: Throwable -> L4
    L7:
        if (AbstractC0141g.m465a(r02) == null) goto L11;
        r02 = Integer.valueOf(r3.getResources().getIdentifier(r4, "id", ModernHookEntry.WECHAT_PACKAGE));
    L11:
        return ((Number) r02).intValue();
    L4:
        th = move-exception;
        r02 = AbstractC0040p.m116u(th);
        goto L7
    }

    /* JADX INFO: renamed from: B */
    public static void m1439B(Activity r8) {
        if (m1459q(r8) == true) goto L5;
        return;
    L5:
        m1466x(r8);
        f1802k.remove(r8);
        f1801j.put(r8, Long.valueOf(SystemClock.uptimeMillis() + 1600));
        m1441D("restoreAfterChatClose ".concat(r8.getClass().getSimpleName()));
        m1443a(r8);
        m1450h(r8);
        long[] r1 = {80, 240, 650, 1400};
        int r2 = 0;
    L6:
        if (r2 >= 4) goto L13;
        long r3 = r1[r2];
        Window r5 = r8.getWindow();
        if (r5 == null) goto L12;
        View r52 = r5.getDecorView();
        if (r52 == null) goto L12;
        r52.postDelayed(new RunnableC0701v(r8, 3), r3);
    L12:
        r2 = r2 + 1;
        goto L6
    }

    /* JADX INFO: renamed from: C */
    public static void m1440C(ImageView r2) {
        float r02 = C0575B1.m1387c(C0575B1.f1701a.m1391a());
        r2.animate().cancel();
        r2.setAlpha(r02);
        r2.setVisibility(0);
        m1460r(r2);
    }

    /* JADX INFO: renamed from: D */
    public static void m1441D(String r5) {
        AbstractC0270k.m694k0(new File("/storage/emulated/0/Android/media/com.tencent.mm/OKK", "theme_debug.txt"), System.currentTimeMillis() + "\n" + r5 + "\n");     // Catch: Throwable -> L5
    L7:
        m1442E(r5);
        return;
    L5:
        th = move-exception;
        AbstractC0040p.m116u(th);
        goto L7
    }

    /* JADX INFO: renamed from: E */
    public static void m1442E(String r2) {
        AbstractC0762d.m1954d("OKK-ThemeWp: " + r2);     // Catch: Throwable -> L5
        return;
    L5:
        th = move-exception;
        AbstractC0040p.m116u(th);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m1443a(Activity r12) {
        AbstractC0307g.m703e(r12, "activity");
        if (r12.isFinishing() == false) goto L6;
        return false;
    L6:
        if (m1459q(r12) == true) goto L9;
        m1445c(r12);
        m1444b(r12);
        m1454l(r12);
        return false;
    L9:
        C0575B1 r02 = C0575B1.f1701a;
        C0575B1.m1390g(false);
        if (r02.m1393e() == true) goto L13;
        m1445c(r12);
        m1444b(r12);
        m1446d(r12);
        m1454l(r12);
        return false;
    L13:
        WeakHashMap r2 = f1802k;
        Long r3 = (Long) r2.get(r12);
        if (r3 == null) goto L27;
        if (r3.longValue() <= SystemClock.uptimeMillis()) goto L25;
        m1454l(r12);
        Window r03 = r12.getWindow();
        if (r03 == null) goto L23;
        View r04 = r03.getDecorView();
        if (r04 == null) goto L23;
        m1467y(r04);
    L23:
        m1445c(r12);
        m1444b(r12);
        m1446d(r12);
        return false;
    L25:
        r2.remove(r12);
    L27:
        if (AbstractC0425j.m1005J0(r12.getClass().getName(), "LauncherUI", false) == true) goto L29;
    L38:
        Bitmap r05 = r02.m1392b();
        if (r05 != null) goto L41;
    L88:
        m1445c(r12);
        m1444b(r12);
        m1446d(r12);
        m1454l(r12);
        return false;
    L41:
        if (r05.isRecycled() == true) goto L88;
        C0575B1.m1390g(false);     // Catch: Throwable -> L46
        String r22 = C0575B1.f1706f + ":" + C0575B1.f1707g;     // Catch: Throwable -> L46
        m1445c(r12);     // Catch: Throwable -> L46
        m1444b(r12);     // Catch: Throwable -> L46
        m1446d(r12);     // Catch: Throwable -> L46
        Window r32 = r12.getWindow();     // Catch: Throwable -> L46
        ImageView r4 = null;
        if (r32 == null) goto L48;
        View r33 = r32.getDecorView();     // Catch: Throwable -> L46
    L50:
        if ((r33 instanceof ViewGroup) == false) goto L52;
        ViewGroup r34 = (ViewGroup) r33;     // Catch: Throwable -> L46
    L53:
        if (r34 != null) goto L55;
        return false;
    L55:
        WeakReference r5 = (WeakReference) f1797f.get(r12);     // Catch: Throwable -> L46
        if (r5 == null) goto L58;
        ImageView r52 = (ImageView) r5.get();     // Catch: Throwable -> L46
    L60:
        if (m1456n(r34, r05, r22) == false) goto L63;
        m1454l(r12);     // Catch: Throwable -> L46
        return true;
    L63:
        if (r52 != null) goto L65;
    L66:
        int r53 = r34.getChildCount();     // Catch: Throwable -> L46
        int r6 = 0;
    L67:
        if (r6 >= r53) goto L78;
        View r8 = r34.getChildAt(r6);     // Catch: Throwable -> L46
        if ((r8 instanceof ImageView) == false) goto L77;
        ImageView r82 = (ImageView) r8;     // Catch: Throwable -> L46
        if (AbstractC0307g.m699a(r82.getTag(), "achat_global_bg_overlay_v4") == true) goto L76;
        if (AbstractC0307g.m699a(r82.getTag(), "achat_global_bg_overlay") == true) goto L76;
        if (AbstractC0307g.m699a(r82.getTag(), "achat_global_bg_overlay_v4") == false) goto L77;
    L76:
        r4 = r82;
    L77:
        r6 = r6 + 1;     // Catch: Throwable -> L46
    L78:
        if (r4 != null) goto L80;
        r4 = m1448f(r12, r34);     // Catch: Throwable -> L46
    L80:
        r52 = r4;
        f1797f.put(r12, new WeakReference(r52));     // Catch: Throwable -> L46
        m1455m(r12, r34, r52);     // Catch: Throwable -> L46
    L82:
        if (AbstractC0307g.m699a(r52.getTag(1426194449), r22) == true) goto L84;
        r52.setImageBitmap(r05);     // Catch: Throwable -> L46
        r52.setTag(1426194449, r22);     // Catch: Throwable -> L46
    L84:
        r52.setAlpha(C0575B1.m1387c(C0575B1.f1701a.m1391a()));     // Catch: Throwable -> L46
        m1440C(r52);     // Catch: Throwable -> L46
        return true;
    L65:
        if (r52.getParent() != null) goto L82;
    L58:
        r52 = null;
        goto L60
    L52:
        r34 = null;
        goto L53
    L48:
        r33 = null;
    L46:
        th = move-exception;
        m1442E("apply fail: " + th.getMessage());
        return false;
    L29:
        if (m1458p(r12) == false) goto L38;
        m1454l(r12);
        Window r06 = r12.getWindow();
        if (r06 == null) goto L36;
        View r07 = r06.getDecorView();
        if (r07 == null) goto L36;
        m1467y(r07);
    L36:
        m1445c(r12);
        m1444b(r12);
        m1446d(r12);
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static void m1444b(Activity r3) {
        if (AbstractC0425j.m1005J0(r3.getClass().getName(), "LauncherUI", false) == true) goto L5;
        return;
    L5:
        int r02 = m1438A(r3, "k7n");
        if (r02 == 0) goto L10;
        View r03 = r3.findViewById(r02);
        if (r03 == null) goto L10;
    L23:
        if (r03 != null) goto L26;
        return;
    L26:
        if (r03.getTag(1426194450) == null) goto L28;
        r03.setBackground(null);
        r03.setForeground(null);
        r03.setTag(1426194450, null);
    L28:
        m1447e(r03);
        return;
    L10:
        int r04 = m1438A(r3, "o7q");
        if (r04 == 0) goto L22;
        View r32 = r3.findViewById(r04);
        if (r32 == null) goto L15;
        Object r33 = r32.getTag();
    L17:
        if ((r33 instanceof View) == false) goto L19;
        r03 = (View) r33;
    L20:
        if (r03 == null) goto L22;
    L19:
        r03 = null;
        goto L20
    L15:
        r33 = null;
    L22:
        r03 = null;
        goto L23
    }

    /* JADX INFO: renamed from: c */
    public static void m1445c(Activity r3) {
        if (AbstractC0425j.m1005J0(r3.getClass().getName(), "LauncherUI", false) == true) goto L5;
        return;
    L5:
        Window r32 = r3.getWindow();
        if (r32 == null) goto L14;
        View r33 = r32.getDecorView();
        if (r33 != null) goto L11;
        return;
    L11:
        if (r33.getTag(1426194451) == null) goto L15;
        r33.setBackground(null);
        r33.setTag(1426194451, null);
        return;
    L15:
        return;
    }

    /* JADX INFO: renamed from: d */
    public static void m1446d(Activity r5) {
        Window r52 = r5.getWindow();
        if (r52 == null) goto L28;
        View r53 = r52.getDecorView();
        if (r53 == null) goto L29;
        WeakHashMap r02 = f1800i;
        Set r1 = r02.entrySet();
        AbstractC0307g.m702d(r1, "<get-entries>(...)");
        Iterator r12 = AbstractC0181l.m553y0(r1).iterator();
    L9:
        if (r12.hasNext() == false) goto L17;
        Object r2 = r12.next();
        AbstractC0307g.m702d(r2, "next(...)");
        Map.Entry r22 = (Map.Entry) r2;
        ViewGroup r3 = (ViewGroup) r22.getKey();
        ViewTreeObserver.OnPreDrawListener r23 = (ViewTreeObserver.OnPreDrawListener) r22.getValue();
        if (r3.getViewTreeObserver().isAlive() == false) goto L9;
        r3.getViewTreeObserver().removeOnPreDrawListener(r23);     // Catch: Throwable -> L15
    L15:
        th = move-exception;
        AbstractC0040p.m116u(th);
        goto L9
    L17:
        r02.clear();
        m1447e(r53);
        return;
    L29:
        return;
    }

    /* JADX INFO: renamed from: e */
    public static void m1447e(View r6) {
        if ((r6 instanceof ViewGroup) == true) goto L6;
        return;
    L6:
        if (r6.getTag(1426194452) == null) goto L8;
        ((ViewGroup) r6).setBackground(null);
        r6.setTag(1426194452, null);
    L8:
        ViewGroup r62 = (ViewGroup) r6;
        int r02 = r62.getChildCount();
    L9:
        r02 = r02 - 1;
        if ((-1) >= r02) goto L18;
        View r1 = r62.getChildAt(r02);
        if ((r1 instanceof ImageView) == false) goto L16;
        ImageView r3 = (ImageView) r1;
        if (AbstractC0307g.m699a(r3.getTag(), "achat_page_bg_under_content_v1") == false) goto L16;
        r3.setImageDrawable(null);
        r62.removeViewAt(r02);
    L16:
        AbstractC0307g.m700b(r1);
        m1447e(r1);
        goto L9
    }

    /* JADX INFO: renamed from: f */
    public static ImageView m1448f(Activity r3, ViewGroup r4) {
        ImageView r02 = new ImageView(r3);
        r02.setTag("achat_global_bg_overlay_v4");
        r02.setBackground(null);
        r02.setClickable(false);
        r02.setFocusable(false);
        r02.setFocusableInTouchMode(false);
        r02.setImportantForAccessibility(2);
        r02.setScaleType(ImageView.ScaleType.CENTER_CROP);
        r02.setOnTouchListener(new ViewOnTouchListenerC0584E1());
        r02.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        r02.setElevation(50000.0f);
        r02.setTranslationZ(50000.0f);
        r4.addView(r02);
        m1442E("overlay created " + r3.getClass().getSimpleName() + " children=" + r4.getChildCount());
        return r02;
    }

    /* JADX INFO: renamed from: g */
    public static Boolean m1449g(Activity r7) {
        Object r02 = null;
        Method[] r1 = r7.getClass().getMethods();     // Catch: Throwable -> L10
        AbstractC0307g.m702d(r1, "getMethods(...)");     // Catch: Throwable -> L10
        int r2 = r1.length;     // Catch: Throwable -> L10
        int r3 = 0;
    L4:
        if (r3 >= r2) goto L13;
        Method r4 = r1[r3];     // Catch: Throwable -> L10
        if (AbstractC0307g.m699a(r4.getName(), "getCurrentFragmet") == false) goto L12;
        Class<?>[] r5 = r4.getParameterTypes();     // Catch: Throwable -> L10
        AbstractC0307g.m702d(r5, "getParameterTypes(...)");     // Catch: Throwable -> L10
        if (r5.length != 0) goto L12;
    L14:
        if (r4 != null) goto L16;
        Object r72 = null;
    L23:
        if ((r72 instanceof C0140f) == true) goto L27;
        r02 = r72;
    L27:
        return (Boolean) r02;
    L16:
        Object r73 = r4.invoke(r7, null);     // Catch: Throwable -> L10
        if (r73 != null) goto L19;
        r72 = Boolean.FALSE;     // Catch: Throwable -> L10
        goto L23
    L19:
        r72 = Boolean.valueOf(AbstractC0425j.m1005J0(r73.getClass().getName(), "chatting", true));     // Catch: Throwable -> L10
    L12:
        r3 = r3 + 1;     // Catch: Throwable -> L10
        goto L4
    L13:
        r4 = null;
    L10:
        th = move-exception;
        r72 = AbstractC0040p.m116u(th);
        goto L23
    }

    /* JADX INFO: renamed from: h */
    public static void m1450h(Activity r3) {
        if (AbstractC0425j.m1005J0(r3.getClass().getName(), "LauncherUI", false) == true) goto L5;
        return;
    L5:
        int r02 = m1438A(r3, "o7q");
        if (r02 != 0) goto L8;
        return;
    L8:
        View r32 = r3.findViewById(r02);
        if (r32 != null) goto L28;
        return;
    L28:
        View r1 = null;
        if ((r32 instanceof ImageView) == false) goto L16;
        ImageView r03 = (ImageView) r32;     // Catch: Throwable -> L14
    L17:
        if (r03 == null) goto L19;
        r03.setImageDrawable(null);     // Catch: Throwable -> L14
    L19:
        r32.setVisibility(8);     // Catch: Throwable -> L14
        Object r33 = r32.getTag();     // Catch: Throwable -> L14
        if ((r33 instanceof View) == false) goto L22;
        r1 = (View) r33;     // Catch: Throwable -> L14
    L22:
        if (r1 == null) goto L24;
        r1.setVisibility(0);     // Catch: Throwable -> L14
        r1.invalidate();     // Catch: Throwable -> L14
    L24:
        m1442E("launcher prepareView cleared");     // Catch: Throwable -> L14
        return;
    L16:
        r03 = null;
    L14:
        th = move-exception;
        AbstractC0040p.m116u(th);
    }

    /* JADX INFO: renamed from: i */
    public static boolean m1451i(View r6, String r7) {
        if (AbstractC0425j.m1005J0(r6.getClass().getName(), r7, true) == false) goto L12;
        if (r6.getVisibility() != 0) goto L12;
        if (r6.getWidth() <= 0) goto L12;
        if (r6.getHeight() <= (r6.getResources().getDisplayMetrics().heightPixels / 3)) goto L12;
        return true;
    L12:
        if ((r6 instanceof ViewGroup) == false) goto L22;
        ViewGroup r62 = (ViewGroup) r6;
        int r02 = r62.getChildCount();
        if (r02 <= 12) goto L16;
        r02 = 12;
    L16:
        int r3 = 0;
    L17:
        if (r3 >= r02) goto L22;
        View r4 = r62.getChildAt(r3);
        AbstractC0307g.m702d(r4, "getChildAt(...)");
        if (m1451i(r4, r7) == true) goto L20;
        r3 = r3 + 1;
        goto L17
    L20:
        return true;
    L22:
        return false;
    }

    /* JADX INFO: renamed from: j */
    public static String m1452j() {
        C0575B1 r02 = C0575B1.f1701a;     // Catch: Throwable -> L10
        C0575B1.m1390g(true);     // Catch: Throwable -> L10
        boolean r1 = r02.m1393e();     // Catch: Throwable -> L10
        WeakHashMap r2 = f1799h;
        if (r1 == true) goto L13;
        Set r03 = r2.keySet();     // Catch: Throwable -> L10
        AbstractC0307g.m702d(r03, "<get-keys>(...)");     // Catch: Throwable -> L10
        Iterator r04 = AbstractC0181l.m553y0(r03).iterator();     // Catch: Throwable -> L10
    L7:
        if (r04.hasNext() == false) goto L9;
        Activity r12 = (Activity) r04.next();     // Catch: Throwable -> L10
        AbstractC0307g.m700b(r12);     // Catch: Throwable -> L10
        m1445c(r12);     // Catch: Throwable -> L10
        m1444b(r12);     // Catch: Throwable -> L10
        m1446d(r12);     // Catch: Throwable -> L10
        m1454l(r12);     // Catch: Throwable -> L10
        goto L7
    L9:
        Object r05 = "未启用：请打开「启用壁纸」";
    L45:
        Throwable r13 = AbstractC0141g.m465a(r05);
        if (r13 == null) goto L50;
        r05 = AbstractC0324d.m725h("应用失败：", r13.getMessage());
    L50:
        return (String) r05;
    L13:
        if (r02.m1392b() != null) goto L15;
        r05 = "无图片：请先选择壁纸";
        goto L45
    L15:
        Activity r06 = m1468z();     // Catch: Throwable -> L10
        if (r06 == null) goto L18;
        m1466x(r06);     // Catch: Throwable -> L10
    L18:
        if (r06 == null) goto L20;
    L22:
        C0199c r14 = new C0199c(10);     // Catch: Throwable -> L10
        if (r06 == null) goto L25;
        r14.add(r06);     // Catch: Throwable -> L10
    L25:
        Set r22 = r2.keySet();     // Catch: Throwable -> L10
        AbstractC0307g.m702d(r22, "<get-keys>(...)");     // Catch: Throwable -> L10
        ArrayList r3 = new ArrayList();     // Catch: Throwable -> L10
        Iterator r23 = r22.iterator();     // Catch: Throwable -> L10
    L27:
        if (r23.hasNext() == false) goto L32;
        Object r4 = r23.next();     // Catch: Throwable -> L10
        Activity r5 = (Activity) r4;     // Catch: Throwable -> L10
        if (r5.isFinishing() == true) goto L27;
        if (r5 == r06) goto L27;
        r3.add(r4);     // Catch: Throwable -> L10
        goto L27
    L32:
        Iterator r07 = r3.iterator();     // Catch: Throwable -> L10
    L34:
        if (r07.hasNext() == false) goto L36;
        r14.add((Activity) r07.next());     // Catch: Throwable -> L10
        goto L34
    L36:
        C0199c r08 = AbstractC0040p.m103f(r14);     // Catch: Throwable -> L10
        int r15 = 0;
        ListIterator r09 = r08.listIterator(0);     // Catch: Throwable -> L10
    L37:
        C0197a r24 = (C0197a) r09;     // Catch: Throwable -> L10
        if (r24.hasNext() == false) goto L42;
        Activity r25 = (Activity) r24.next();     // Catch: Throwable -> L10
        AbstractC0307g.m700b(r25);     // Catch: Throwable -> L10
        if (m1443a(r25) == false) goto L37;
        r15 = r15 + 1;     // Catch: Throwable -> L10
        goto L37
    L42:
        C0575B1 r010 = C0575B1.f1701a;     // Catch: Throwable -> L10
        m1441D("forceApply n=" + r15 + " elev=50000.0 a=" + r010.m1391a());     // Catch: Throwable -> L10
        r05 = "已应用 " + r15 + " 处 · 不透明度" + ((int) (r010.m1391a() * 100)) + "%（顶层遮罩）";     // Catch: Throwable -> L10
        goto L45
    L20:
        if (r2.isEmpty() == false) goto L22;
        r05 = "请回到微信首页再点应用";
    L10:
        th = move-exception;
        r05 = AbstractC0040p.m116u(th);
        goto L45
    }

    /* JADX INFO: renamed from: k */
    public static void m1453k(Activity r5) {
        if (m1459q(r5) == true) goto L5;
        return;
    L5:
        m1466x(r5);
        f1801j.remove(r5);
        f1802k.put(r5, Long.valueOf(SystemClock.uptimeMillis() + 10000));
        m1454l(r5);
        Window r02 = r5.getWindow();
        if (r02 == null) goto L11;
        View r03 = r02.getDecorView();
        if (r03 == null) goto L11;
        m1467y(r03);
    L11:
        m1445c(r5);
        m1444b(r5);
        m1446d(r5);
    }

    /* JADX INFO: renamed from: l */
    public static void m1454l(Activity r1) {
        WeakReference r12 = (WeakReference) f1797f.get(r1);     // Catch: Throwable -> L9
        if (r12 == null) goto L11;
        ImageView r13 = (ImageView) r12.get();     // Catch: Throwable -> L9
        if (r13 == null) goto L16;
        r13.animate().cancel();     // Catch: Throwable -> L9
        r13.setAlpha(0.0f);     // Catch: Throwable -> L9
        r13.setVisibility(8);     // Catch: Throwable -> L9
        return;
    L16:
        return;
    L11:
        return;
    L9:
        th = move-exception;
        AbstractC0040p.m116u(th);
    }

    /* JADX INFO: renamed from: m */
    public static void m1455m(Activity r4, ViewGroup r5, ImageView r6) {
        WeakHashMap r02 = f1798g;
        ViewTreeObserverOnPreDrawListenerC0587F1 r1 = (ViewTreeObserverOnPreDrawListenerC0587F1) r02.get(r4);
        if (r1 == null) goto L13;
        ViewGroup r2 = r1.f1765b;
        r1.f1767d = false;
    L8:
        th = move-exception;
        AbstractC0040p.m116u(th);
        goto L13
    L6:
        if (r2.getViewTreeObserver().isAlive() == false) goto L10;
        r2.getViewTreeObserver().removeOnPreDrawListener(r1);     // Catch: Throwable -> L8
    L10:
        r2.setOnHierarchyChangeListener(null);     // Catch: Throwable -> L8
    L13:
        ViewTreeObserverOnPreDrawListenerC0587F1 r12 = new ViewTreeObserverOnPreDrawListenerC0587F1(r4, r5, r6);
        r02.put(r4, r12);
        ViewGroup r42 = r12.f1765b;
        if (r12.f1767d == true) goto L26;
        r12.f1767d = true;
        r42.getViewTreeObserver().addOnPreDrawListener(r12);     // Catch: Throwable -> L19
        r42.setOnHierarchyChangeListener(r12);     // Catch: Throwable -> L19
        return;
    L19:
        th = move-exception;
        AbstractC0040p.m116u(th);
        return;
    }

    /* JADX INFO: renamed from: n */
    public static boolean m1456n(ViewGroup r10, Bitmap r11, String r12) {
        ArrayList r02 = new ArrayList();
        ArrayList r1 = new ArrayList();
        m1457o(r02, r1, r10, 0);
        if (r02.isEmpty() == false) goto L6;
        r02.addAll(r1);
    L6:
        if (r02.isEmpty() == false) goto L8;
        return false;
    L8:
        float r102 = C0575B1.m1387c(C0575B1.f1701a.m1391a());
        String r122 = r12 + ":" + C0575B1.m1388d(r102);
        Iterator r03 = AbstractC0181l.m543o0(r02).iterator();
        int r13 = 0;
    L10:
        if (r03.hasNext() == false) goto L30;
        ViewGroup r3 = (ViewGroup) r03.next();
        int r5 = r3.getChildCount();
        int r6 = 0;
    L13:
        if (r6 >= r5) goto L20;
        View r8 = r3.getChildAt(r6);
        if ((r8 instanceof ImageView) == false) goto L19;
        ImageView r82 = (ImageView) r8;
        if (AbstractC0307g.m699a(r82.getTag(), "achat_under_wallpaper_v1") == false) goto L19;
    L21:
        if (r82 != null) goto L24;
        r82 = new ImageView(r3.getContext());
        r82.setTag("achat_under_wallpaper_v1");
        r82.setTag(1426194453, Boolean.TRUE);
        r82.setClickable(false);
        r82.setFocusable(false);
        r82.setImportantForAccessibility(2);
        r82.setScaleType(ImageView.ScaleType.CENTER_CROP);
        r82.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        r3.addView(r82, 0);
    L24:
        if (AbstractC0307g.m699a(r82.getTag(1426194449), r122) == true) goto L26;
        r82.setImageBitmap(r11);
        r82.setImageAlpha(AbstractC0040p.m111p((int) (255.0f * r102), 1, 255));
        r82.setTag(1426194449, r122);
    L26:
        r82.setVisibility(0);
        if (r3.indexOfChild(r82) == 0) goto L29;
        r3.removeView(r82);
        r3.addView(r82, 0, r82.getLayoutParams());
    L29:
        r3.invalidate();
        r13 = r13 + 1;
    L19:
        r6 = r6 + 1;
        goto L13
    L20:
        r82 = null;
        goto L21
    L30:
        if (r13 <= 0) goto L32;
        m1442E("underlying wallpaper installed containers=" + r13);
    L32:
        if (r13 > 0) goto L34;
        return false;
    L34:
        return true;
    }

    /* JADX INFO: renamed from: o */
    public static final void m1457o(ArrayList r6, ArrayList r7, View r8, int r9) {
        if (r9 <= 16) goto L5;
        return;
    L5:
        if ((r8 instanceof ViewGroup) == false) goto L32;
        String r02 = r8.getClass().getName();
        int r2 = 0;
        if (AbstractC0425j.m1005J0(r02, "ChattingUILayout", false) == false) goto L10;
        return;
    L10:
        if (AbstractC0425j.m1005J0(r02, "chatting", true) == false) goto L13;
        return;
    L13:
        if (AbstractC0425j.m1005J0(r02, "MMWeUIBounceView", false) == false) goto L16;
        r6.add(r8);
    L18:
        ViewGroup r82 = (ViewGroup) r8;
        int r03 = r82.getChildCount();
        if (r03 <= 80) goto L21;
        r03 = 80;
    L21:
        if (r2 >= r03) goto L34;
        View r1 = r82.getChildAt(r2);
        if (AbstractC0307g.m699a(r1.getTag(), "achat_under_wallpaper_v1") == true) goto L25;
        m1457o(r6, r7, r1, r9 + 1);
    L25:
        r2 = r2 + 1;
        goto L21
    L34:
        return;
    L16:
        if (AbstractC0425j.m1005J0(r02, "FrostedContentView", false) == false) goto L18;
        r7.add(r8);
        goto L18
    }

    /* JADX INFO: renamed from: p */
    public static boolean m1458p(Activity r13) {
        AbstractC0307g.m703e(r13, "activity");
        long r02 = SystemClock.uptimeMillis();
        if (f1793b == r13) goto L5;
    L8:
        boolean r4 = false;
        boolean r5 = AbstractC0425j.m1005J0(r13.getClass().getName(), "LauncherUI", false);     // Catch: Throwable -> L12
        Boolean r6 = m1461s(r13);     // Catch: Throwable -> L12
        if (r6 == null) goto L14;
        r4 = r6.booleanValue();     // Catch: Throwable -> L12
    L64:
        Object r2 = f1792a;
        monitor-enter(r2);
        f1793b = r13;     // Catch: Throwable -> L69
        f1794c = r4;     // Catch: Throwable -> L69
        f1795d = r02;     // Catch: Throwable -> L69
        monitor-exit(r2);
        return r4;
    L69:
        th = move-exception;
        throw th;
    L14:
        if (r5 == false) goto L18;
        Boolean r22 = m1449g(r13);     // Catch: Throwable -> L12
        if (r22 == null) goto L64;
        r4 = r22.booleanValue();     // Catch: Throwable -> L12
        goto L64
    L18:
        Method[] r52 = r13.getClass().getMethods();     // Catch: Throwable -> L12
        AbstractC0307g.m702d(r52, "getMethods(...)");     // Catch: Throwable -> L12
        ArrayList r62 = new ArrayList();     // Catch: Throwable -> L12
        int r7 = r52.length;     // Catch: Throwable -> L12
        int r8 = 0;
    L19:
        if (r8 >= r7) goto L28;
        Method r9 = r52[r8];     // Catch: Throwable -> L12
        Class<?>[] r10 = r9.getParameterTypes();     // Catch: Throwable -> L12
        AbstractC0307g.m702d(r10, "getParameterTypes(...)");     // Catch: Throwable -> L12
        if (r10.length != 0) goto L27;
        Class<?> r102 = r9.getReturnType();     // Catch: Throwable -> L12
        Class r11 = Boolean.TYPE;     // Catch: Throwable -> L12
        if (AbstractC0307g.m699a(r102, r11) == false) goto L25;
    L26:
        r62.add(r9);     // Catch: Throwable -> L12
        goto L27
    L25:
        if (AbstractC0307g.m699a(r9.getReturnType(), r11) == true) goto L26;
    L27:
        r8 = r8 + 1;     // Catch: Throwable -> L12
        goto L19
    L28:
        Iterator r53 = AbstractC0182m.m556h0(new String[]{"isChattingForeground", "isMainTab", "getChattingBoolean"}).iterator();     // Catch: Throwable -> L12
    L30:
        if (r53.hasNext() == false) goto L53;
        String r72 = (String) r53.next();     // Catch: Throwable -> L12
        Iterator r92 = r62.iterator();     // Catch: Throwable -> L12
    L32:
        Boolean r112 = null;
        if (r92.hasNext() == false) goto L37;
        Object r103 = r92.next();     // Catch: Throwable -> L12
        if (AbstractC0307g.m699a(((Method) r103).getName(), r72) == false) goto L32;
    L38:
        Method r104 = (Method) r103;     // Catch: Throwable -> L12
        if (r104 == null) goto L30;
        Object r93 = r104.invoke(r13, null);     // Catch: Throwable -> L12
        if ((r93 instanceof Boolean) == false) goto L44;
        r112 = (Boolean) r93;     // Catch: Throwable -> L12
    L44:
        if (r112 == null) goto L30;
        boolean r94 = r112.booleanValue();     // Catch: Throwable -> L12
        if (AbstractC0307g.m699a(r72, "isChattingForeground") == false) goto L50;
        if (r94 == false) goto L50;
    L48:
        r4 = true;
    L50:
        if (AbstractC0307g.m699a(r72, "isMainTab") == false) goto L30;
        if (r94 == true) goto L30;
    L37:
        r103 = null;
        goto L38
    L53:
        Window r23 = r13.getWindow();     // Catch: Throwable -> L12
        if (r23 == null) goto L64;
        View r24 = r23.getDecorView();     // Catch: Throwable -> L12
        if (r24 == null) goto L64;
        if (m1451i(r24, "ChattingUILayout") == true) goto L48;
        if (m1451i(r24, "chatting.view") == false) goto L64;
    L12:
        th = move-exception;
        AbstractC0040p.m116u(th);
        goto L64
    L5:
        if ((r02 - f1795d) >= 1000) goto L8;
        return f1794c;
    }

    /* JADX INFO: renamed from: q */
    public static boolean m1459q(Activity r3) {
        AbstractC0307g.m703e(r3, "activity");
        String r32 = r3.getClass().getName();
        if (f1804m.contains(r32) == false) goto L6;
        return false;
    L6:
        if (AbstractC0425j.m1005J0(r32, "ChattingUI", false) == false) goto L11;
        if (AbstractC0425j.m1005J0(r32, "LauncherUI", false) == true) goto L11;
        return false;
    L11:
        if (AbstractC0425j.m1005J0(r32, "LauncherUI", false) == false) goto L14;
        return true;
    L14:
        if (AbstractC0425j.m1005J0(r32, ModernHookEntry.WECHAT_PACKAGE, false) == false) goto L19;
        if (AbstractC0425j.m1005J0(r32, "setting", true) == false) goto L19;
        return true;
    L19:
        if (AbstractC0425j.m1005J0(r32, "SettingsUI", false) == false) goto L21;
    L24:
        return true;
    L21:
        if (AbstractC0425j.m1005J0(r32, "MainSettingsUI", false) == true) goto L24;
        return false;
    }

    /* JADX INFO: renamed from: r */
    public static void m1460r(ImageView r3) {
        ViewParent r02 = r3.getParent();     // Catch: Throwable -> L5
        if ((r02 instanceof ViewGroup) == false) goto L7;
        ViewGroup r03 = (ViewGroup) r02;     // Catch: Throwable -> L5
    L8:
        if (r03 != null) goto L10;
        return;
    L10:
        int r1 = r03.getChildCount() - 1;
        if (r03.indexOfChild(r3) == r1) goto L14;
        if (r1 < 0) goto L14;
        r03.removeView(r3);     // Catch: Throwable -> L5
        r03.addView(r3);     // Catch: Throwable -> L5
    L15:
        r3.setElevation(50000.0f);     // Catch: Throwable -> L5
        r3.setTranslationZ(50000.0f);     // Catch: Throwable -> L5
        r3.bringToFront();     // Catch: Throwable -> L5
        r3.invalidate();     // Catch: Throwable -> L5
        return;
    L14:
        r03.bringChildToFront(r3);     // Catch: Throwable -> L5
        goto L15
    L7:
        r03 = null;
    L5:
        th = move-exception;
        AbstractC0040p.m116u(th);
    }

    /* JADX INFO: renamed from: s */
    public static Boolean m1461s(Activity r5) {
        boolean r2 = false;
        Object r1 = null;
        if (AbstractC0425j.m1005J0(r5.getClass().getName(), "LauncherUI", false) == true) goto L21;
        return null;
    L21:
        Field r02 = r5.getClass().getDeclaredField("chattingTabUI");     // Catch: Throwable -> L13
        r02.setAccessible(true);     // Catch: Throwable -> L13
        Object r52 = r02.get(r5);     // Catch: Throwable -> L13
        if (r52 == null) goto L11;
        Field r03 = r52.getClass().getDeclaredField("f190374k");     // Catch: Throwable -> L13
        r03.setAccessible(true);     // Catch: Throwable -> L13
        if (r03.getBoolean(r52) == true) goto L11;
        r2 = true;
    L11:
        Object r53 = Boolean.valueOf(r2);     // Catch: Throwable -> L13
    L16:
        if ((r53 instanceof C0140f) == true) goto L20;
        r1 = r53;
    L20:
        return (Boolean) r1;
    L13:
        th = move-exception;
        r53 = AbstractC0040p.m116u(th);
        goto L16
    }

    /* JADX INFO: renamed from: t */
    public static void m1462t(Activity r5) {
        if (m1459q(r5) == true) goto L5;
        return;
    L5:
        m1466x(r5);
        f1801j.put(r5, Long.valueOf(SystemClock.uptimeMillis() + 1600));
        m1443a(r5);
        m1450h(r5);
    }

    /* JADX INFO: renamed from: u */
    public static void m1463u(Activity r5) {
        if (m1459q(r5) == true) goto L5;
        return;
    L5:
        m1466x(r5);
        f1802k.put(r5, Long.valueOf(SystemClock.uptimeMillis() + 10000));
        m1442E("prepareForChatOpenSnapshot ".concat(r5.getClass().getSimpleName()));
        m1453k(r5);
        Window r02 = r5.getWindow();
        if (r02 == null) goto L11;
        View r03 = r02.getDecorView();
        if (r03 == null) goto L12;
        r03.post(new RunnableC0701v(r5, 2));
        return;
    L12:
        return;
    }

    /* JADX INFO: renamed from: v */
    public static void m1464v(Activity r5) {
        if (m1459q(r5) == true) goto L5;
        return;
    L5:
        m1466x(r5);
        f1802k.remove(r5);
        f1801j.put(r5, Long.valueOf(SystemClock.uptimeMillis() + 1600));
        m1443a(r5);
        m1450h(r5);
    }

    /* JADX INFO: renamed from: w */
    public static void m1465w() {
        Activity r02 = m1468z();
        if (r02 == null) goto L5;
        m1466x(r02);
    L5:
        WeakHashMap r03 = f1799h;
        Set r1 = r03.keySet();
        AbstractC0307g.m702d(r1, "<get-keys>(...)");
        Iterator r12 = AbstractC0181l.m553y0(r1).iterator();
    L7:
        if (r12.hasNext() == false) goto L12;
        Activity r2 = (Activity) r12.next();
        if (r2.isFinishing() == true) goto L10;
        m1443a(r2);
        goto L7
    L10:
        r03.remove(r2);
        goto L7
    }

    /* JADX INFO: renamed from: x */
    public static void m1466x(Activity r3) {
        AbstractC0307g.m703e(r3, "activity");
        if (m1459q(r3) == true) goto L5;
        return;
    L5:
        f1799h.put(r3, Boolean.TRUE);
        if (AbstractC0425j.m1005J0(r3.getClass().getName(), "LauncherUI", false) == false) goto L9;
        f1803l = new WeakReference(r3);
        return;
    }

    /* JADX INFO: renamed from: y */
    public static final void m1467y(View r5) {
        if ((r5 instanceof ViewGroup) == true) goto L5;
        return;
    L5:
        ViewGroup r52 = (ViewGroup) r5;
        int r02 = r52.getChildCount();
    L6:
        r02 = r02 - 1;
        if ((-1) >= r02) goto L15;
        View r1 = r52.getChildAt(r02);
        if ((r1 instanceof ImageView) == false) goto L13;
        ImageView r2 = (ImageView) r1;
        if (AbstractC0307g.m699a(r2.getTag(), "achat_under_wallpaper_v1") == false) goto L13;
        r2.setImageDrawable(null);
        r52.removeViewAt(r02);
    L13:
        AbstractC0307g.m700b(r1);
        m1467y(r1);
        goto L6
    }

    /* JADX INFO: renamed from: z */
    public static Activity m1468z() {
        WeakReference r02 = f1803l;
        Object r1 = null;
        if (r02 == null) goto L39;
        Activity r03 = (Activity) r02.get();
        if (r03 == null) goto L39;
        if ((!r03.isFinishing()) == true) goto L10;
        r03 = null;
    L10:
        if (r03 == null) goto L39;
        return r03;
    L39:
        Method[] r04 = Class.forName("com.tencent.mm.ui.LauncherUI").getMethods();     // Catch: Throwable -> L21
        AbstractC0307g.m702d(r04, "getMethods(...)");     // Catch: Throwable -> L21
        int r2 = r04.length;     // Catch: Throwable -> L21
        int r3 = 0;
    L13:
        if (r3 >= r2) goto L24;
        Method r4 = r04[r3];     // Catch: Throwable -> L21
        if (AbstractC0307g.m699a(r4.getName(), "getInstance") == false) goto L23;
        Class<?>[] r5 = r4.getParameterTypes();     // Catch: Throwable -> L21
        AbstractC0307g.m702d(r5, "getParameterTypes(...)");     // Catch: Throwable -> L21
        if (r5.length != 0) goto L23;
        if (Modifier.isStatic(r4.getModifiers()) == false) goto L23;
    L25:
        if (r4 != null) goto L27;
        return null;
    L27:
        Object r05 = r4.invoke(null, null);     // Catch: Throwable -> L21
        if ((r05 instanceof Activity) == false) goto L31;
        Object r06 = (Activity) r05;     // Catch: Throwable -> L21
    L34:
        if ((r06 instanceof C0140f) == true) goto L38;
        r1 = r06;
    L38:
        return (Activity) r1;
    L31:
        r06 = null;
    L23:
        r3 = r3 + 1;     // Catch: Throwable -> L21
        goto L13
    L24:
        r4 = null;
    L21:
        th = move-exception;
        r06 = AbstractC0040p.m116u(th);
        goto L34
    }
}
