package p000;

import android.app.Activity;
import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class pp1 {

    /* JADX INFO: renamed from: b */
    public static vu0 f8446b;

    /* JADX INFO: renamed from: c */
    public static x83 f8447c;

    /* JADX INFO: renamed from: a */
    public static final pp1 f8445a = new pp1();

    /* JADX INFO: renamed from: d */
    public static final AtomicBoolean f8448d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: e */
    public static final AtomicBoolean f8449e = new AtomicBoolean(false);

    /* JADX INFO: renamed from: f */
    public static final AtomicBoolean f8450f = new AtomicBoolean(false);

    /* JADX INFO: renamed from: a */
    public static AbstractC0812vj[] m3929a() {
        int iOrdinal = m3932d().ordinal();
        if (iOrdinal == 0) {
            return no0.f7270g;
        }
        if (iOrdinal == 1) {
            return po0.f8421g;
        }
        if (iOrdinal == 2) {
            return oo0.f7751g;
        }
        c80.m675s();
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static op1 m3930b() {
        return (op1) e10.f2292b.getValue();
    }

    /* JADX INFO: renamed from: c */
    public static op1 m3931c() {
        return (op1) e10.f2291a.getValue();
    }

    /* JADX INFO: renamed from: d */
    public static vu0 m3932d() {
        vu0 vu0Var = f8446b;
        if (vu0Var != null) {
            return vu0Var;
        }
        t11.m5067S("mHostType");
        throw null;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m3933e(String str) {
        Object x92Var;
        str.getClass();
        op1 op1VarM3930b = m3930b();
        op1VarM3930b.getClass();
        Object obj = null;
        try {
            x92Var = (List) op1VarM3930b.m3605b(AbstractC0691se.m4815D(new C0090cg(yt0.Companion.serializer())), null, "hooker_debug_records");
        } catch (Throwable th) {
            x92Var = new x92(th);
        }
        if (x92Var instanceof x92) {
            x92Var = null;
        }
        Iterable iterable = (List) x92Var;
        if (iterable == null) {
            iterable = be0.f819h;
        }
        Iterator it = iterable.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (t11.m5086l(((yt0) next).m6337l(), str)) {
                obj = next;
                break;
            }
        }
        return ((yt0) obj) != null;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m3934f() {
        return m3931c().m3604a("security_mode", false);
    }

    /* JADX INFO: renamed from: g */
    public static final void m3935g(Activity activity) {
        activity.getClass();
        up0.f11403k = activity;
        Context applicationContext = activity.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = activity;
        }
        up0.f11401i = applicationContext;
        ClassLoader classLoader = activity.getClassLoader();
        classLoader.getClass();
        up0.f11402j = classLoader;
        String name = activity.getClass().getName();
        if (name.equals("com.tencent.mm.ui.LauncherUI") || name.equals("com.tencent.mobileqq.activity.SplashActivity") || name.equals("com.ss.android.ugc.aweme.main.MainActivity")) {
            m3937i(m3929a());
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m3936h(AbstractC0812vj abstractC0812vj, String str, Throwable th, String str2) {
        Object x92Var;
        abstractC0812vj.getClass();
        op1 op1VarM3930b = m3930b();
        op1VarM3930b.getClass();
        ArrayList arrayList = abstractC0812vj.f11986b;
        if (!arrayList.contains(th)) {
            arrayList.add(th);
        }
        yt0 yt0Var = new yt0(abstractC0812vj.mo9d(), abstractC0812vj.getClass().getName(), str, str2, th.getClass().getName(), th.getMessage(), fg1.m1624Q(th), 0L, 128, (c50) null);
        try {
            x92Var = (List) op1VarM3930b.m3605b(AbstractC0691se.m4815D(new C0090cg(yt0.Companion.serializer())), null, "hooker_debug_records");
        } catch (Throwable th2) {
            x92Var = new x92(th2);
        }
        Iterable iterable = (List) (x92Var instanceof x92 ? null : x92Var);
        if (iterable == null) {
            iterable = be0.f819h;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : iterable) {
            if (!t11.m5086l(((yt0) obj).m6337l(), abstractC0812vj.mo9d())) {
                arrayList2.add(obj);
            }
        }
        try {
            op1VarM3930b.m3607d(new C0090cg(yt0.Companion.serializer()), AbstractC0142du.m1169y0(arrayList2, yt0Var), "hooker_debug_records");
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m3937i(AbstractC0812vj[] abstractC0812vjArr) {
        if (f8449e.compareAndSet(false, true)) {
            AtomicBoolean atomicBoolean = aq1.f335a;
            op1 op1VarM3931c = m3931c();
            op1 op1VarM3930b = m3930b();
            op1VarM3931c.getClass();
            op1VarM3930b.getClass();
            abstractC0812vjArr.getClass();
            aq1.m259a(op1VarM3931c, op1VarM3930b, abstractC0812vjArr);
            Thread thread = new Thread(new RunnableC0446m2(9, abstractC0812vjArr));
            thread.setName("NukeInit");
            thread.setDaemon(true);
            thread.start();
        }
    }
}
