package p000a;

import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import p000a.C0186K3;
import p000a.C0924xh;
import top.mmjz.floatingclouds.bean.MaskItemBean;
import top.mmjz.floatingclouds.plugin.IPlugin;

/* JADX INFO: renamed from: a.v5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0874v5 implements IPlugin {

    /* JADX INFO: renamed from: a */
    public volatile boolean f3420a;

    /* JADX INFO: renamed from: c */
    public volatile View f3422c;

    /* JADX INFO: renamed from: e */
    public volatile Runnable f3424e;

    /* JADX INFO: renamed from: f */
    public volatile int f3425f;

    /* JADX INFO: renamed from: g */
    public volatile long f3426g;

    /* JADX INFO: renamed from: b */
    public final LinkedHashSet f3421b = new LinkedHashSet();

    /* JADX INFO: renamed from: d */
    public final Handler f3423d = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: a */
    public static void m2089a(View view, ArrayList arrayList, int i) {
        int width;
        if (view instanceof ImageView) {
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            int i2 = iArr[1];
            if (i2 >= 0 && i2 <= i && 20 <= (width = ((ImageView) view).getWidth()) && width < 101) {
                arrayList.add(view);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = viewGroup.getChildAt(i3);
                C0631i9.m1481d(childAt, "getChildAt(...)");
                m2089a(childAt, arrayList, i);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m2090b(Context context, int i) {
        return (int) ((i * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* JADX INFO: renamed from: d */
    public static View m2091d(FrameLayout frameLayout) {
        Object obj;
        Context context = frameLayout.getContext();
        C0631i9.m1481d(context, "getContext(...)");
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        int dimensionPixelSize = identifier > 0 ? context.getResources().getDimensionPixelSize(identifier) : 0;
        Context context2 = frameLayout.getContext();
        C0631i9.m1481d(context2, "getContext(...)");
        int iM2090b = m2090b(context2, 56) + dimensionPixelSize;
        ArrayList arrayList = new ArrayList();
        m2089a(frameLayout, arrayList, iM2090b);
        if (arrayList.size() >= 2) {
            obj = arrayList.get(arrayList.size() - 2);
        } else {
            if (arrayList.size() != 1) {
                return null;
            }
            obj = arrayList.get(0);
        }
        return (View) obj;
    }

    /* JADX INFO: renamed from: e */
    public static int m2092e(Context context) {
        C0186K3.f638a.getClass();
        int iM748C = (C0267Oc.m748C(C0186K3.a.m508i().f2417I, 20, 200) * 8) / 100;
        if (iM748C < 4) {
            iM748C = 4;
        }
        return m2090b(context, iM748C);
    }

    /* JADX INFO: renamed from: f */
    public static boolean m2093f() {
        C0186K3.f638a.getClass();
        return C0186K3.a.m511l() && C0186K3.a.m508i().f2416H;
    }

    /* JADX INFO: renamed from: c */
    public final void m2094c(Activity activity) {
        Object objM2206a;
        FrameLayout frameLayout;
        View viewM2091d;
        if (this.f3422c != null) {
            View view = this.f3422c;
            C0631i9.m1479b(view);
            if (view.getParent() != null) {
                return;
            }
        }
        try {
            View decorView = activity.getWindow().getDecorView();
            frameLayout = decorView instanceof FrameLayout ? (FrameLayout) decorView : null;
        } catch (Throwable th) {
            objM2206a = C0920xd.m2206a(th);
        }
        if (frameLayout != null && (viewM2091d = m2091d(frameLayout)) != null) {
            int[] iArr = new int[2];
            viewM2091d.getLocationOnScreen(iArr);
            int[] iArr2 = new int[2];
            frameLayout.getLocationOnScreen(iArr2);
            int i = iArr[0] - iArr2[0];
            int i2 = iArr[1] - iArr2[1];
            int iM2092e = m2092e(activity);
            int color = Color.parseColor((activity.getResources().getConfiguration().uiMode & 48) == 32 ? "#FF6B6B" : "#FA5151");
            View view2 = new View(activity);
            view2.setTag("fc_dot_indicator");
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(1);
            gradientDrawable.setColor(color);
            view2.setBackground(gradientDrawable);
            view2.setVisibility(8);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iM2092e, iM2092e);
            layoutParams.leftMargin = (i - iM2092e) - m2090b(activity, 4);
            layoutParams.topMargin = i2 + ((viewM2091d.getHeight() - iM2092e) / 2);
            frameLayout.addView(view2, layoutParams);
            this.f3422c = view2;
            objM2206a = C0413Wf.f1577a;
            Throwable thM2189a = C0901wd.m2189a(objM2206a);
            if (thM2189a != null) {
                C0908x1.m2193a(Arrays.copyOf(new Object[]{C0944z.m2231k("DotIndicator: ensureDotView fail: ", thM2189a.getMessage())}, 1));
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m2095g(String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.f3426g < 30000) {
            return;
        }
        this.f3426g = jCurrentTimeMillis;
        C0726n9.m1660B(C0944z.m2231k("DotIndicator: syncFromDb skip: ", str));
    }

    /* JADX INFO: renamed from: h */
    public final void m2096h() {
        if (m2093f() && this.f3420a) {
            m2100l();
            if (this.f3421b.isEmpty()) {
                m2099k();
                m2098j();
                C0908x1.m2194b(Arrays.copyOf(new Object[]{"DotIndicator: read-report recheck: all read, dot hidden"}, 1));
            } else {
                m2099k();
                m2098j();
                this.f3425f = 0;
                RunnableC0855u5 runnableC0855u5 = new RunnableC0855u5(this, 1);
                this.f3424e = runnableC0855u5;
                this.f3423d.postDelayed(runnableC0855u5, 400L);
            }
        }
    }

    @Override // top.mmjz.floatingclouds.plugin.IPlugin
    public final void handleHook(C0173J8 c0173j8) {
        Object objM2206a;
        Object objM2206a2;
        C0631i9.m1482e(c0173j8, "session");
        C0518ca.m1280b(new C0643j2(2, this));
        try {
            C0173J8.m463a(c0173j8, "com.tencent.mm.ui.LauncherUI", "onResume", new Class[0], new C0779q5(this, 1));
            C0173J8.m463a(c0173j8, "com.tencent.mm.ui.LauncherUI", "onCreate", new Class[]{Bundle.class}, new C0779q5(this, 2));
            C0908x1.m2194b(Arrays.copyOf(new Object[]{"DotIndicator: hooked LauncherUI.onResume + onCreate"}, 1));
            objM2206a = C0413Wf.f1577a;
        } catch (Throwable th) {
            objM2206a = C0920xd.m2206a(th);
        }
        Throwable thM2189a = C0901wd.m2189a(objM2206a);
        if (thM2189a != null) {
            C0908x1.m2193a(Arrays.copyOf(new Object[]{C0944z.m2231k("DotIndicator: hookLauncherResume fail: ", thM2189a.getMessage())}, 1));
        }
        try {
            C0285Pc c0285Pc = C0285Pc.f979a;
            ClassLoader classLoader = c0173j8.f608a;
            c0285Pc.getClass();
            List<Method> listM777a = C0285Pc.m777a(classLoader);
            if (listM777a.isEmpty()) {
                C0908x1.m2194b(Arrays.copyOf(new Object[]{"DotIndicator: read-report locator empty, polling-only mode"}, 1));
            }
            for (Method method : listM777a) {
                C0173J8.m469h(c0173j8, "F026", method, new C0779q5(this, 3));
                ConcurrentHashMap<String, C0101F8> concurrentHashMap = C0083E8.f263a;
                C0083E8.m209b("F026", "readReport", method.getDeclaringClass().getName() + "." + method.getName());
                C0908x1.m2194b(Arrays.copyOf(new Object[]{"DotIndicator: hooked read-report trigger " + method.getDeclaringClass().getName() + "." + method.getName()}, 1));
            }
            Thread thread = new Thread(new RunnableC0273P0(this, 5, c0173j8));
            thread.setName("ReadReportStorageHook");
            thread.setDaemon(true);
            thread.start();
            objM2206a2 = C0413Wf.f1577a;
        } catch (Throwable th2) {
            objM2206a2 = C0920xd.m2206a(th2);
        }
        Throwable thM2189a2 = C0901wd.m2189a(objM2206a2);
        if (thM2189a2 != null) {
            C0908x1.m2193a(Arrays.copyOf(new Object[]{C0944z.m2231k("DotIndicator: hookReadReport fail: ", thM2189a2.getMessage())}, 1));
        }
        C0908x1.m2194b(Arrays.copyOf(new Object[]{"DotIndicator: handleHook DONE (event-bus mode)"}, 1));
    }

    /* JADX INFO: renamed from: i */
    public final void m2097i() {
        m2098j();
        this.f3425f = 0;
        RunnableC0855u5 runnableC0855u5 = new RunnableC0855u5(this, 0);
        this.f3424e = runnableC0855u5;
        this.f3423d.postDelayed(runnableC0855u5, 1000L);
    }

    /* JADX INFO: renamed from: j */
    public final void m2098j() {
        Runnable runnable = this.f3424e;
        if (runnable != null) {
            this.f3423d.removeCallbacks(runnable);
        }
        this.f3424e = null;
    }

    /* JADX INFO: renamed from: k */
    public final void m2099k() {
        boolean z = !this.f3421b.isEmpty() && m2093f();
        if (z == this.f3420a) {
            return;
        }
        this.f3420a = z;
        View view = this.f3422c;
        if (view == null) {
            return;
        }
        view.post(new RunnableC0702m4(view, z, this, 1));
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX DEBUG: Incorrect finally slice size: {[GOTO] complete}, expected: {[GOTO, THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX WARN: Finally extract failed */
    /* JADX INFO: renamed from: l */
    public final void m2100l() {
        Object objM2206a;
        Object obj;
        Object next;
        C0115G4 c0115g4;
        try {
            C0186K3.f638a.getClass();
            ArrayList arrayListM505f = C0186K3.a.m505f();
            if (arrayListM505f.isEmpty()) {
                this.f3421b.clear();
                return;
            }
            ArrayList arrayList = new ArrayList(C0758p3.m1800g0(arrayListM505f, 10));
            Iterator it = arrayListM505f.iterator();
            while (it.hasNext()) {
                arrayList.add(((MaskItemBean) it.next()).getMaskId());
            }
            Set setM1946A0 = C0834t3.m1946A0(arrayList);
            Set<Map.Entry<String, C0115G4>> setEntrySet = C0924xh.f3533a.entrySet();
            C0631i9.m1481d(setEntrySet, "<get-entries>(...)");
            Iterator<T> it2 = setEntrySet.iterator();
            while (true) {
                obj = null;
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                Object key = ((Map.Entry) next).getKey();
                C0631i9.m1481d(key, "<get-key>(...)");
                if (C0034Be.m94I((CharSequence) key, "EnMicroMsg", false)) {
                    break;
                }
            }
            Map.Entry entry = (Map.Entry) next;
            if (entry != null && (c0115g4 = (C0115G4) entry.getValue()) != null) {
                obj = c0115g4.f382a;
            }
            if (obj == null) {
                m2095g("EnMicroMsg not in Store (size=" + C0924xh.f3533a.size() + ")");
                return;
            }
            String strM1952p0 = C0834t3.m1952p0(setM1946A0, ",", new C0586g2(14), 30);
            ConcurrentHashMap<String, C0115G4> concurrentHashMap = C0924xh.f3533a;
            Cursor cursorM2211a = C0924xh.a.m2211a(obj, "SELECT username, unReadCount FROM rconversation WHERE username IN (" + strM1952p0 + ")", setM1946A0.toArray(new String[0]));
            if (cursorM2211a == null) {
                m2095g("rawQuery returned null");
                return;
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            try {
                int columnIndex = cursorM2211a.getColumnIndex("username");
                int columnCount = cursorM2211a.getColumnCount();
                int i = 0;
                while (true) {
                    if (i >= columnCount) {
                        i = -1;
                        break;
                    }
                    String columnName = cursorM2211a.getColumnName(i);
                    C0631i9.m1481d(columnName, "getColumnName(...)");
                    String lowerCase = columnName.toLowerCase(Locale.ROOT);
                    C0631i9.m1481d(lowerCase, "toLowerCase(...)");
                    if (C0034Be.m94I(lowerCase, "unread", false)) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (columnIndex >= 0 && i >= 0) {
                    while (cursorM2211a.moveToNext()) {
                        String string = cursorM2211a.getString(columnIndex);
                        if (string != null && cursorM2211a.getInt(i) > 0) {
                            linkedHashSet.add(string);
                        }
                    }
                    C0413Wf c0413Wf = C0413Wf.f1577a;
                    cursorM2211a.close();
                    this.f3426g = 0L;
                    this.f3421b.clear();
                    objM2206a = Boolean.valueOf(this.f3421b.addAll(linkedHashSet));
                }
                m2095g("column not found (user=" + columnIndex + " unread=" + i + ")");
                cursorM2211a.close();
                return;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    C0889w1.m2146e(cursorM2211a, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            objM2206a = C0920xd.m2206a(th3);
        }
        Throwable thM2189a = C0901wd.m2189a(objM2206a);
        if (thM2189a != null) {
            String message = thM2189a.getMessage();
            if (message == null) {
                message = "unknown";
            }
            m2095g(message);
        }
    }
}
