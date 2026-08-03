package p000a;

import android.database.Cursor;
import android.graphics.Paint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import p000a.C0186K3;
import p000a.C0901wd;
import p000a.C0924xh;
import top.mmjz.floatingclouds.bean.MaskItemBean;
import top.mmjz.floatingclouds.plugin.IPlugin;

/* JADX INFO: renamed from: a.o2 */
/* JADX INFO: loaded from: classes.dex */
public final class C0738o2 implements IPlugin {

    /* JADX INFO: renamed from: a */
    public volatile boolean f2914a;

    /* JADX INFO: renamed from: b */
    public volatile Object f2915b;

    /* JADX INFO: renamed from: c */
    public final LinkedHashSet f2916c = new LinkedHashSet();

    /* JADX INFO: renamed from: d */
    public final HashMap<TextView, Float> f2917d = new HashMap<>();

    /* JADX INFO: renamed from: e */
    public final Handler f2918e = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: f */
    public volatile Runnable f2919f;

    /* JADX INFO: renamed from: g */
    public volatile int f2920g;

    /* JADX INFO: renamed from: h */
    public volatile long f2921h;

    /* JADX INFO: renamed from: a.o2$a */
    public static final class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this != C0738o2.this.f2919f) {
                return;
            }
            C0915x8 c0915x8 = C0915x8.f3530a;
            if (C0915x8.m2203a()) {
                C0738o2.this.f2918e.postDelayed(this, 5000L);
                return;
            }
            C0738o2.this.f2920g++;
            long j = C0738o2.this.f2920g <= 60 ? 1000L : 5000L;
            C0738o2.this.getClass();
            if (!C0738o2.m1747e() || !C0738o2.this.f2914a) {
                C0738o2.this.m1753j();
                return;
            }
            C0738o2.this.m1755l();
            if (!C0738o2.this.f2916c.isEmpty()) {
                C0738o2.this.m1754k();
                C0738o2.this.f2918e.postDelayed(this, j);
                return;
            }
            C0738o2.this.m1754k();
            C0738o2.this.m1753j();
            String str = C0738o2.this.f2920g <= 60 ? "fast" : "slow";
            C0908x1.m2194b(Arrays.copyOf(new Object[]{"BoldBottomTab: DB checker: all read, bold reset (after " + C0738o2.this.f2920g + " checks, " + str + ")"}, 1));
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m1744b(ViewGroup viewGroup, ArrayList arrayList) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof TextView) {
                arrayList.add(childAt);
            } else if (childAt instanceof ViewGroup) {
                m1744b((ViewGroup) childAt, arrayList);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static ArrayList m1745c(Object obj) {
        Object objM2206a;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        try {
            for (Class<?> superclass = obj.getClass(); superclass != null && !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
                C0112G1 c0112g1M2122I = C0889w1.m2122I(superclass.getDeclaredFields());
                while (c0112g1M2122I.hasNext()) {
                    Field field = (Field) c0112g1M2122I.next();
                    if (!Modifier.isStatic(field.getModifiers())) {
                        field.setAccessible(true);
                        try {
                            objM2206a = field.get(obj);
                        } catch (Throwable th) {
                            objM2206a = C0920xd.m2206a(th);
                        }
                        if (objM2206a instanceof C0901wd.a) {
                            objM2206a = null;
                        }
                        if (objM2206a != null && !(objM2206a instanceof View)) {
                            String name = objM2206a.getClass().getName();
                            if (!C0015Ae.m49H(name, "android.", false) && !C0015Ae.m49H(name, "java.", false)) {
                                m1746d(objM2206a, arrayList, hashSet);
                            }
                        }
                    }
                }
            }
            if (arrayList.isEmpty() && (obj instanceof ViewGroup)) {
                m1744b((ViewGroup) obj, arrayList);
            }
            C0413Wf c0413Wf = C0413Wf.f1577a;
        } catch (Throwable th2) {
            C0920xd.m2206a(th2);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: d */
    public static void m1746d(Object obj, ArrayList arrayList, HashSet hashSet) {
        Object objM2206a;
        try {
            for (Class<?> superclass = obj.getClass(); superclass != null && !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
                C0112G1 c0112g1M2122I = C0889w1.m2122I(superclass.getDeclaredFields());
                while (c0112g1M2122I.hasNext()) {
                    Field field = (Field) c0112g1M2122I.next();
                    if (!Modifier.isStatic(field.getModifiers())) {
                        field.setAccessible(true);
                        try {
                            objM2206a = field.get(obj);
                        } catch (Throwable th) {
                            objM2206a = C0920xd.m2206a(th);
                        }
                        if (objM2206a instanceof C0901wd.a) {
                            objM2206a = null;
                        }
                        if (objM2206a != null && (objM2206a instanceof TextView) && hashSet.add(objM2206a)) {
                            arrayList.add(objM2206a);
                        }
                    }
                }
            }
            C0413Wf c0413Wf = C0413Wf.f1577a;
        } catch (Throwable th2) {
            C0920xd.m2206a(th2);
        }
    }

    /* JADX INFO: renamed from: e */
    public static boolean m1747e() {
        C0186K3.f638a.getClass();
        return C0186K3.a.m511l() && C0186K3.a.m508i().f2414F;
    }

    /* JADX INFO: renamed from: a */
    public final void m1748a(final Object obj, final int i, final int i2) {
        ArrayList<TextView> arrayListM1745c = m1745c(obj);
        if (arrayListM1745c.isEmpty()) {
            if (i2 > 0) {
                View view = obj instanceof View ? (View) obj : null;
                if (view != null) {
                    view.postDelayed(new Runnable() { // from class: a.n2
                        @Override // java.lang.Runnable
                        public final void run() {
                            C0738o2 c0738o2 = this.f2738a;
                            Object obj2 = obj;
                            int i3 = i;
                            int i4 = i2;
                            if (c0738o2.f2914a) {
                                c0738o2.m1748a(obj2, i3, i4 - 1);
                            }
                        }
                    }, 500L);
                    return;
                }
                return;
            }
            return;
        }
        float f = i;
        float f2 = (0.04f * f) / 100.0f;
        float f3 = (f * 0.003f) + 1.0f;
        for (TextView textView : arrayListM1745c) {
            HashMap<TextView, Float> map = this.f2917d;
            try {
                if (!map.containsKey(textView)) {
                    map.put(textView, Float.valueOf(textView.getTextSize()));
                }
                textView.getPaint().setStyle(Paint.Style.FILL_AND_STROKE);
                textView.getPaint().setStrokeWidth(textView.getTextSize() * f2);
                Float f4 = map.get(textView);
                textView.setTextSize(((f4 != null ? f4.floatValue() : textView.getTextSize()) * f3) / textView.getResources().getDisplayMetrics().scaledDensity);
                textView.invalidate();
                C0413Wf c0413Wf = C0413Wf.f1577a;
            } catch (Throwable th) {
                C0920xd.m2206a(th);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m1749f(String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.f2921h < 30000) {
            return;
        }
        this.f2921h = jCurrentTimeMillis;
        C0726n9.m1660B(C0944z.m2231k("BoldBottomTab: syncFromDb skip: ", str));
    }

    /* JADX INFO: renamed from: g */
    public final void m1750g() {
        C0186K3.f638a.getClass();
        int iM748C = C0267Oc.m748C(C0186K3.a.m508i().f2415G, 0, 100);
        if (iM748C <= 0) {
            return;
        }
        this.f2914a = true;
        Object obj = this.f2915b;
        if (obj == null) {
            return;
        }
        try {
            View view = obj instanceof View ? (View) obj : null;
            if (view != null) {
                view.post(new RunnableC0660k0(this, obj, iM748C, 1));
            } else {
                m1748a(obj, iM748C, 3);
                C0413Wf c0413Wf = C0413Wf.f1577a;
            }
        } catch (Throwable th) {
            C0920xd.m2206a(th);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m1751h() {
        if (m1747e() && this.f2914a) {
            m1755l();
            if (this.f2916c.isEmpty()) {
                m1754k();
                m1753j();
                C0908x1.m2194b(Arrays.copyOf(new Object[]{"BoldBottomTab: read-report recheck: all read, bold reset"}, 1));
            } else {
                m1754k();
                m1753j();
                this.f2920g = 0;
                RunnableC0855u5 runnableC0855u5 = new RunnableC0855u5(this, 2);
                this.f2919f = runnableC0855u5;
                this.f2918e.postDelayed(runnableC0855u5, 400L);
            }
        }
    }

    @Override // top.mmjz.floatingclouds.plugin.IPlugin
    public final void handleHook(C0173J8 c0173j8) {
        Object objM2206a;
        Object objM2206a2;
        int i = 0;
        C0631i9.m1482e(c0173j8, "session");
        ClassLoader classLoader = c0173j8.f608a;
        Class clsM13b = C0002A1.m13b(classLoader, "com.tencent.mm.ui.LauncherUIBottomTabView");
        if (clsM13b == null) {
            C0908x1.m2197e(Arrays.copyOf(new Object[]{"BoldBottomTab: LauncherUIBottomTabView not found"}, 1));
            return;
        }
        try {
            C0112G1 c0112g1M2122I = C0889w1.m2122I(clsM13b.getDeclaredConstructors());
            while (c0112g1M2122I.hasNext()) {
                Constructor constructor = (Constructor) c0112g1M2122I.next();
                constructor.setAccessible(true);
                c0173j8.m470f(constructor).intercept(new C0700m2(0, this));
            }
            C0413Wf c0413Wf = C0413Wf.f1577a;
        } catch (Throwable th) {
            C0920xd.m2206a(th);
        }
        C0518ca.m1280b(new C0643j2(i, this));
        try {
            C0173J8.m463a(c0173j8, "com.tencent.mm.ui.LauncherUI", "onResume", new Class[0], new C0662k2(this, 1));
            C0173J8.m463a(c0173j8, "com.tencent.mm.ui.LauncherUI", "onCreate", new Class[]{Bundle.class}, new C0662k2(this, 2));
            C0908x1.m2194b(Arrays.copyOf(new Object[]{"BoldBottomTab: hooked LauncherUI.onResume + onCreate"}, 1));
            objM2206a = C0413Wf.f1577a;
        } catch (Throwable th2) {
            objM2206a = C0920xd.m2206a(th2);
        }
        Throwable thM2189a = C0901wd.m2189a(objM2206a);
        if (thM2189a != null) {
            C0908x1.m2193a(Arrays.copyOf(new Object[]{C0944z.m2231k("BoldBottomTab: hookLauncherResume fail: ", thM2189a.getMessage())}, 1));
        }
        try {
            C0285Pc.f979a.getClass();
            List<Method> listM777a = C0285Pc.m777a(classLoader);
            if (listM777a.isEmpty()) {
                C0908x1.m2194b(Arrays.copyOf(new Object[]{"BoldBottomTab: read-report locator empty, polling-only mode"}, 1));
            }
            for (Method method : listM777a) {
                C0173J8.m469h(c0173j8, "F025", method, new C0662k2(this, 3));
                ConcurrentHashMap<String, C0101F8> concurrentHashMap = C0083E8.f263a;
                C0083E8.m209b("F025", "readReport", method.getDeclaringClass().getName() + "." + method.getName());
                C0908x1.m2194b(Arrays.copyOf(new Object[]{"BoldBottomTab: hooked read-report trigger " + method.getDeclaringClass().getName() + "." + method.getName()}, 1));
            }
            Thread thread = new Thread(new RunnableC0273P0(this, 2, c0173j8));
            thread.setName("ReadReportStorageHook");
            thread.setDaemon(true);
            thread.start();
            objM2206a2 = C0413Wf.f1577a;
        } catch (Throwable th3) {
            objM2206a2 = C0920xd.m2206a(th3);
        }
        Throwable thM2189a2 = C0901wd.m2189a(objM2206a2);
        if (thM2189a2 != null) {
            C0908x1.m2193a(Arrays.copyOf(new Object[]{C0944z.m2231k("BoldBottomTab: hookReadReport fail: ", thM2189a2.getMessage())}, 1));
        }
        C0908x1.m2194b(Arrays.copyOf(new Object[]{"BoldBottomTab: handleHook DONE (event-bus mode)"}, 1));
    }

    /* JADX INFO: renamed from: i */
    public final void m1752i() {
        m1753j();
        this.f2920g = 0;
        a aVar = new a();
        this.f2919f = aVar;
        this.f2918e.postDelayed(aVar, 1000L);
    }

    /* JADX INFO: renamed from: j */
    public final void m1753j() {
        Runnable runnable = this.f2919f;
        if (runnable != null) {
            this.f2918e.removeCallbacks(runnable);
        }
        this.f2919f = null;
    }

    /* JADX INFO: renamed from: k */
    public final void m1754k() {
        boolean z = !this.f2916c.isEmpty() && m1747e();
        if (z == this.f2914a) {
            return;
        }
        this.f2914a = z;
        if (z) {
            m1750g();
            return;
        }
        Object obj = this.f2915b;
        if (obj != null) {
            View view = obj instanceof View ? (View) obj : null;
            if (view != null) {
                view.post(new RunnableC0273P0(this, 1, obj));
            }
        }
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX DEBUG: Incorrect finally slice size: {[GOTO] complete}, expected: {[GOTO, THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX WARN: Finally extract failed */
    /* JADX INFO: renamed from: l */
    public final void m1755l() {
        Object objM2206a;
        Object obj;
        Object next;
        C0115G4 c0115g4;
        try {
            C0186K3.f638a.getClass();
            ArrayList arrayListM505f = C0186K3.a.m505f();
            if (arrayListM505f.isEmpty()) {
                this.f2916c.clear();
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
                m1749f("EnMicroMsg not in Store (size=" + C0924xh.f3533a.size() + ")");
                return;
            }
            String strM1952p0 = C0834t3.m1952p0(setM1946A0, ",", new C0586g2(2), 30);
            ConcurrentHashMap<String, C0115G4> concurrentHashMap = C0924xh.f3533a;
            Cursor cursorM2211a = C0924xh.a.m2211a(obj, "SELECT username, unReadCount FROM rconversation WHERE username IN (" + strM1952p0 + ")", setM1946A0.toArray(new String[0]));
            if (cursorM2211a == null) {
                m1749f("rawQuery returned null");
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
                    this.f2921h = 0L;
                    this.f2916c.clear();
                    objM2206a = Boolean.valueOf(this.f2916c.addAll(linkedHashSet));
                }
                m1749f("column not found (user=" + columnIndex + " unread=" + i + ")");
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
            m1749f(message);
        }
    }
}
