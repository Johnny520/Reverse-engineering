package p054e0;

import com.abc.core.hooks.ModuleLog;
import de.robv.android.xposed.AbstractC0762d;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import p001A0.AbstractC0040p;
import p007D0.C0139e;
import p009E0.AbstractC0179j;
import p009E0.AbstractC0181l;
import p009E0.AbstractC0182m;
import p009E0.AbstractC0183n;
import p026N0.AbstractC0270k;
import p029P0.InterfaceC0275a;
import p031Q0.AbstractC0307g;
import p037U.C0375k;
import p042W0.AbstractC0416a;
import p042W0.AbstractC0425j;

/* JADX INFO: renamed from: e0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0769c {

    /* JADX INFO: renamed from: a */
    public static final ConcurrentHashMap f2728a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b */
    public static final AtomicInteger f2729b = new AtomicInteger(0);

    /* JADX INFO: renamed from: c */
    public static final AtomicInteger f2730c = new AtomicInteger(0);

    /* JADX INFO: renamed from: d */
    public static final ConcurrentHashMap f2731d = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    public static List m1961a() {
        Collection collectionValues = f2728a.values();
        AbstractC0307g.m702d(collectionValues, "<get-values>(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            if (((C0767a) obj).f2720b == EnumC0768b.f2724b) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC0183n.m559k0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((C0767a) it.next()).f2719a);
        }
        if (arrayList2.size() <= 1) {
            return AbstractC0181l.m553y0(arrayList2);
        }
        Object[] array = arrayList2.toArray(new Comparable[0]);
        Comparable[] comparableArr = (Comparable[]) array;
        AbstractC0307g.m703e(comparableArr, "<this>");
        if (comparableArr.length > 1) {
            Arrays.sort(comparableArr);
        }
        return AbstractC0179j.m530g0(array);
    }

    /* JADX INFO: renamed from: b */
    public static void m1962b(String str, InterfaceC0275a interfaceC0275a) {
        String str2;
        try {
            ConcurrentHashMap concurrentHashMap = f2731d;
            concurrentHashMap.remove(str);
            interfaceC0275a.invoke();
            C0139e c0139e = (C0139e) concurrentHashMap.get(str);
            if (c0139e != null && !((Boolean) c0139e.f328a).booleanValue()) {
                m1965e(str, (String) c0139e.f329b);
                return;
            }
            if (c0139e == null || (str2 = (String) c0139e.f329b) == null) {
                str2 = "";
            }
            m1964d(str, str2);
        } catch (Throwable th) {
            try {
                m1963c(str, th);
            } catch (Throwable th2) {
                AbstractC0040p.m116u(th2);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m1963c(String str, Throwable th) {
        String str2 = th.getClass().getSimpleName() + ": " + th.getMessage();
        f2728a.put(str, new C0767a(str, EnumC0768b.f2724b, str2));
        f2730c.incrementAndGet();
        m1970j("FAIL " + str + " -> " + str2);
        try {
            ModuleLog.INSTANCE.m1812e("功能安装失败: " + str + " · " + str2);
        } catch (Throwable th2) {
            AbstractC0040p.m116u(th2);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m1964d(String str, String str2) {
        f2728a.put(str, new C0767a(str, EnumC0768b.f2723a, str2));
        f2729b.incrementAndGet();
        m1970j("OK  " + str + " " + AbstractC0425j.m1021Z0(str2, 80));
        try {
            ModuleLog.INSTANCE.m1813i("功能安装成功: " + str + (AbstractC0425j.m1013R0(str2) ? "" : " · ".concat(str2)));
        } catch (Throwable th) {
            AbstractC0040p.m116u(th);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m1965e(String str, String str2) {
        AbstractC0307g.m703e(str2, "detail");
        f2728a.put(str, new C0767a(str, EnumC0768b.f2726d, str2));
        m1970j("PARTIAL " + str + " " + str2);
        try {
            ModuleLog.INSTANCE.m1814w("功能部分生效: " + str + " · " + str2);
        } catch (Throwable th) {
            AbstractC0040p.m116u(th);
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m1966f() {
        File file = new File("/sdcard/Android/media/com.tencent.mm/OKK");
        try {
            file.mkdirs();
            File file2 = new File(file, "hook_features.txt");
            StringBuilder sb = new StringBuilder();
            sb.append("time=" + System.currentTimeMillis());
            sb.append('\n');
            sb.append(m1969i());
            sb.append('\n');
            sb.append("---");
            sb.append('\n');
            for (C0767a c0767a : m1968h()) {
                sb.append(c0767a.f2720b + "\t" + c0767a.f2719a + "\t" + c0767a.f2721c);
                sb.append('\n');
            }
            String string = sb.toString();
            AbstractC0307g.m702d(string, "toString(...)");
            AbstractC0270k.m693j0(file2, string, AbstractC0416a.f921a);
        } catch (Throwable th) {
            AbstractC0040p.m116u(th);
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m1967g(String str, String str2, boolean z2) {
        f2731d.put(str, new C0139e(Boolean.valueOf(z2), str2));
        m1970j("effective report " + str + " ok=" + z2 + " " + str2);
    }

    /* JADX INFO: renamed from: h */
    public static List m1968h() {
        Collection collectionValues = f2728a.values();
        AbstractC0307g.m702d(collectionValues, "<get-values>(...)");
        return AbstractC0181l.m548t0(collectionValues, new C0375k(1));
    }

    /* JADX INFO: renamed from: i */
    public static String m1969i() {
        int i2;
        int i3;
        int i4;
        ConcurrentHashMap concurrentHashMap = f2728a;
        Collection collectionValues = concurrentHashMap.values();
        AbstractC0307g.m702d(collectionValues, "<get-values>(...)");
        int i5 = 0;
        if (collectionValues.isEmpty()) {
            i2 = 0;
        } else {
            Iterator it = collectionValues.iterator();
            i2 = 0;
            while (it.hasNext()) {
                if (((C0767a) it.next()).f2720b == EnumC0768b.f2723a && (i2 = i2 + 1) < 0) {
                    AbstractC0182m.m557i0();
                    throw null;
                }
            }
        }
        Collection collectionValues2 = concurrentHashMap.values();
        AbstractC0307g.m702d(collectionValues2, "<get-values>(...)");
        if (collectionValues2.isEmpty()) {
            i3 = 0;
        } else {
            Iterator it2 = collectionValues2.iterator();
            i3 = 0;
            while (it2.hasNext()) {
                if (((C0767a) it2.next()).f2720b == EnumC0768b.f2724b && (i3 = i3 + 1) < 0) {
                    AbstractC0182m.m557i0();
                    throw null;
                }
            }
        }
        Collection collectionValues3 = concurrentHashMap.values();
        AbstractC0307g.m702d(collectionValues3, "<get-values>(...)");
        if (collectionValues3.isEmpty()) {
            i4 = 0;
        } else {
            Iterator it3 = collectionValues3.iterator();
            i4 = 0;
            while (it3.hasNext()) {
                if (((C0767a) it3.next()).f2720b == EnumC0768b.f2725c && (i4 = i4 + 1) < 0) {
                    AbstractC0182m.m557i0();
                    throw null;
                }
            }
        }
        Collection collectionValues4 = concurrentHashMap.values();
        AbstractC0307g.m702d(collectionValues4, "<get-values>(...)");
        if (!collectionValues4.isEmpty()) {
            Iterator it4 = collectionValues4.iterator();
            while (it4.hasNext()) {
                if (((C0767a) it4.next()).f2720b == EnumC0768b.f2726d && (i5 = i5 + 1) < 0) {
                    AbstractC0182m.m557i0();
                    throw null;
                }
            }
        }
        return "ok=" + i2 + " partial=" + i5 + " fail=" + i3 + " skip=" + i4 + " total=" + concurrentHashMap.size();
    }

    /* JADX INFO: renamed from: j */
    public static void m1970j(String str) {
        try {
            AbstractC0762d.m1954d("[OKK-FeatureReg] " + str);
        } catch (Throwable th) {
            AbstractC0040p.m116u(th);
        }
    }
}
