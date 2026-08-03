package p000a;

import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Looper;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.AbstractC1104f;
import androidx.fragment.app.C1099a;
import androidx.profileinstaller.ProfileInstallerInitializer;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import p000a.AbstractC0255O0;
import p000a.C0021B1;
import p000a.C0186K3;
import p000a.C0676kg;
import p000a.C0787qd;

/* JADX INFO: renamed from: a.P0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0273P0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f961a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f962b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f963c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ RunnableC0273P0(C0582fh c0582fh, C0173J8 c0173j8, Context context) {
        this.f961a = 17;
        this.f962b = c0173j8;
        this.f963c = context;
    }

    /* JADX WARN: Type inference failed for: r2v25, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v18, types: [java.lang.Object, java.util.List] */
    @Override // java.lang.Runnable
    public final void run() {
        Object objM2206a;
        String str;
        Object objM2206a2;
        int i = 1;
        Object obj = this.f963c;
        Object obj2 = this.f962b;
        switch (this.f961a) {
            case 0:
                Runnable runnable = (Runnable) obj;
                AbstractC0255O0.c cVar = (AbstractC0255O0.c) obj2;
                cVar.getClass();
                try {
                    runnable.run();
                    return;
                } finally {
                    cVar.m723b();
                }
            case 1:
                C0738o2 c0738o2 = (C0738o2) obj2;
                c0738o2.getClass();
                Iterator it = C0738o2.m1745c(obj).iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    HashMap<TextView, Float> map = c0738o2.f2917d;
                    if (!zHasNext) {
                        map.clear();
                        return;
                    }
                    TextView textView = (TextView) it.next();
                    try {
                        textView.getPaint().setStyle(Paint.Style.FILL);
                        textView.getPaint().setStrokeWidth(0.0f);
                        Float f = map.get(textView);
                        if (f != null) {
                            textView.setTextSize(f.floatValue() / textView.getResources().getDisplayMetrics().scaledDensity);
                        }
                        textView.invalidate();
                        C0413Wf c0413Wf = C0413Wf.f1577a;
                    } catch (Throwable th) {
                        C0920xd.m2206a(th);
                    }
                }
                break;
            case 2:
                C0738o2 c0738o22 = (C0738o2) obj2;
                C0173J8 c0173j8 = (C0173J8) obj;
                try {
                    Thread.sleep(3000L);
                    if (C0738o2.m1747e()) {
                        C0285Pc c0285Pc = C0285Pc.f979a;
                        ClassLoader classLoader = c0173j8.f608a;
                        c0285Pc.getClass();
                        for (Method method : C0285Pc.m778b(classLoader)) {
                            C0173J8.m469h(c0173j8, "F025", method, new C0662k2(c0738o22, 0));
                            ConcurrentHashMap<String, C0101F8> concurrentHashMap = C0083E8.f263a;
                            C0083E8.m209b("F025", "readReportStorage", method.getDeclaringClass().getName() + "." + method.getName());
                            C0908x1.m2194b(Arrays.copyOf(new Object[]{"BoldBottomTab: hooked storage clear trigger " + method.getDeclaringClass().getName() + "." + method.getName()}, 1));
                            break;
                        }
                        return;
                    }
                    return;
                } catch (Throwable unused) {
                    return;
                }
            case 3:
                C0889w1.m2135V((ClassLoader) obj2, C0889w1.m2124K((String) obj));
                return;
            case 4:
                C1099a c1099a = (C1099a) obj2;
                C0631i9.m1482e(c1099a, "this$0");
                AbstractC1104f.c cVar2 = (AbstractC1104f.c) obj;
                C0631i9.m1482e(cVar2, "$operation");
                c1099a.m2563a(cVar2);
                return;
            case 5:
                C0874v5 c0874v5 = (C0874v5) obj2;
                C0173J8 c0173j82 = (C0173J8) obj;
                try {
                    Thread.sleep(3000L);
                    if (C0874v5.m2093f()) {
                        C0285Pc c0285Pc2 = C0285Pc.f979a;
                        ClassLoader classLoader2 = c0173j82.f608a;
                        c0285Pc2.getClass();
                        for (Method method2 : C0285Pc.m778b(classLoader2)) {
                            C0173J8.m469h(c0173j82, "F026", method2, new C0779q5(c0874v5, 0));
                            ConcurrentHashMap<String, C0101F8> concurrentHashMap2 = C0083E8.f263a;
                            C0083E8.m209b("F026", "readReportStorage", method2.getDeclaringClass().getName() + "." + method2.getName());
                            C0908x1.m2194b(Arrays.copyOf(new Object[]{"DotIndicator: hooked storage clear trigger " + method2.getDeclaringClass().getName() + "." + method2.getName()}, 1));
                            break;
                        }
                        return;
                    }
                    return;
                } catch (Throwable unused2) {
                    return;
                }
            case 6:
                String str2 = (String) obj;
                try {
                    Map<Object, String> map2 = ((C0706m8) obj2).f2661g;
                    C0631i9.m1481d(map2, "prefUserNames");
                    for (Map.Entry<Object, String> entry : map2.entrySet()) {
                        Object key = entry.getKey();
                        if (C0631i9.m1478a(entry.getValue(), str2)) {
                            C0706m8.m1604d(key, "N", new ArrayList());
                        }
                    }
                    C0413Wf c0413Wf2 = C0413Wf.f1577a;
                    return;
                } catch (Throwable th2) {
                    C0920xd.m2206a(th2);
                    return;
                }
            case 7:
                ((C0782q8) obj2).m1836n(obj);
                return;
            case 8:
                C0858u8 c0858u8 = (C0858u8) obj2;
                C0186K3.f638a.getClass();
                if (C0186K3.a.m511l() && C0186K3.a.m508i().f2443m) {
                    c0858u8.m1987a((View) obj);
                    return;
                }
                return;
            case 9:
                C0353T9 c0353t9 = (C0353T9) obj2;
                Activity activity = (Activity) obj;
                try {
                    View decorView = activity.getWindow().getDecorView();
                    C0631i9.m1481d(decorView, "getDecorView(...)");
                    c0353t9.m958e(activity, decorView);
                    objM2206a = C0413Wf.f1577a;
                    break;
                } catch (Throwable th3) {
                    objM2206a = C0920xd.m2206a(th3);
                }
                Throwable thM2189a = C0901wd.m2189a(objM2206a);
                if (thM2189a != null) {
                    C0908x1.m2193a(Arrays.copyOf(new Object[]{"LongClickInject: injectAlbumViewLongClick FAILED", thM2189a}, 2));
                    return;
                }
                return;
            case 10:
                C0803ra c0803ra = (C0803ra) obj2;
                ClassLoader classLoader3 = (ClassLoader) obj;
                try {
                    C0657jg.f2467a.getClass();
                    C0676kg c0676kgM1526d = C0657jg.m1526d();
                    C0908x1.m2194b("[SimulateHotUpdate] locate result: mp0Class=" + (c0676kgM1526d != null ? c0676kgM1526d.f2528c : null) + " fields=" + (c0676kgM1526d != null ? Integer.valueOf(c0676kgM1526d.f2530e.size()) : null));
                    if (c0676kgM1526d != null && (str = c0676kgM1526d.f2528c) != null) {
                        Class<?> cls = Class.forName(str, false, classLoader3);
                        C0908x1.m2194b("[SimulateHotUpdate] mp0 class loaded: ".concat(cls.getName()));
                        C0303Qc c0303Qc = new C0303Qc();
                        Iterator it2 = c0676kgM1526d.f2530e.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                String str3 = (String) it2.next();
                                Field declaredField = cls.getDeclaredField(str3);
                                declaredField.setAccessible(true);
                                Object obj3 = declaredField.get(null);
                                String str4 = obj3 instanceof String ? (String) obj3 : null;
                                if (str4 != null) {
                                    C0908x1.m2194b("[SimulateHotUpdate] field=" + str3 + " value=" + C0053Ce.m143X(str4, 30));
                                    if (C0631i9.m1478a(C0676kg.a.m1546a(str4), "tag")) {
                                        declaredField.set(null, "FAKE_BASELINE_#0000");
                                        C0908x1.m2194b("[SimulateHotUpdate] injected FAKE_BASELINE_#0000 into " + str3);
                                        c0303Qc.f1097a = true;
                                    }
                                }
                            }
                        }
                        c0803ra.f3168a.runOnUiThread(new RunnableC0273P0(c0303Qc, 11, c0803ra));
                        return;
                    }
                    c0803ra.f3168a.runOnUiThread(new RunnableC0708ma(c0803ra, i));
                    return;
                } catch (Throwable th4) {
                    C0908x1.m2197e("[SimulateHotUpdate] FAILED", th4);
                    c0803ra.f3168a.runOnUiThread(new RunnableC0273P0(c0803ra, 12, th4));
                    return;
                }
            case 11:
                C0803ra c0803ra2 = (C0803ra) obj;
                if (((C0303Qc) obj2).f1097a) {
                    Toast.makeText(c0803ra2.f3168a, "已注入模拟基线，请打开版本详情验证", 1).show();
                    return;
                } else {
                    Toast.makeText(c0803ra2.f3168a, "未找到 tag 语义字段，注入失败", 0).show();
                    return;
                }
            case 12:
                Toast.makeText(((C0803ra) obj2).f3168a, "模拟失败: " + ((Throwable) obj).getMessage(), 1).show();
                return;
            case 13:
                ((ProfileInstallerInitializer) obj2).getClass();
                ProfileInstallerInitializer.C1145b.m2620a(Looper.getMainLooper()).postDelayed(new RunnableC0237N0((Context) obj, i), new Random().nextInt(Math.max(1000, 1)) + 5000);
                return;
            case 14:
                ((C0787qd.e) obj2).mo1037c((Typeface) obj);
                return;
            case 15:
                C0376Ue c0376Ue = (C0376Ue) obj2;
                c0376Ue.m1007e((View) obj);
                WeakReference<View> weakReference = c0376Ue.f1411a;
                if ((weakReference != null ? weakReference.get() : null) == null) {
                    C0908x1.m2194b("TempUnhideTrigger: 3s fallback — title still not found");
                    return;
                } else {
                    c0376Ue.m1008f();
                    return;
                }
            case 16:
                try {
                    ((C0582fh) obj2).f2158c.handleHook((C0173J8) obj);
                    objM2206a2 = C0413Wf.f1577a;
                    break;
                } catch (Throwable th5) {
                    objM2206a2 = C0920xd.m2206a(th5);
                }
                Throwable thM2189a2 = C0901wd.m2189a(objM2206a2);
                if (thM2189a2 != null) {
                    C0908x1.m2193a(Arrays.copyOf(new Object[]{"WXMaskPlugin: async init -> hideSearchListPluginPart FAIL", thM2189a2}, 2));
                    return;
                }
                return;
            default:
                C0173J8 c0173j83 = (C0173J8) obj2;
                Context context = (Context) obj;
                try {
                    Thread.sleep(8000L);
                    LinkedHashMap linkedHashMapM1420a = C0582fh.m1420a(c0173j83);
                    if (linkedHashMapM1420a.isEmpty()) {
                        return;
                    }
                    C0845te.m1970a(context, C0021B1.a.m54a(), linkedHashMapM1420a);
                    C0908x1.m2194b(Arrays.copyOf(new Object[]{"WXMaskPlugin: snapshot saved with " + linkedHashMapM1420a.size() + " classes"}, 1));
                    return;
                } catch (Throwable th6) {
                    C0908x1.m2193a(Arrays.copyOf(new Object[]{"WXMaskPlugin: snapshot save failed", th6}, 2));
                    return;
                }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* synthetic */ RunnableC0273P0(Object obj, int i, Object obj2) {
        this.f961a = i;
        this.f962b = obj;
        this.f963c = obj2;
    }
}
