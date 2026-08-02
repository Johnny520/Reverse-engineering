package defpackage;

import android.app.Activity;
import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class pp1 {
    public static vu0 b;
    public static x83 c;
    public static final pp1 a = new pp1();
    public static final AtomicBoolean d = new AtomicBoolean(false);
    public static final AtomicBoolean e = new AtomicBoolean(false);
    public static final AtomicBoolean f = new AtomicBoolean(false);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static vj[] a() {
        int iOrdinal = d().ordinal();
        if (iOrdinal == 0) {
            return no0.g;
        }
        if (iOrdinal == 1) {
            return po0.g;
        }
        if (iOrdinal == 2) {
            return oo0.g;
        }
        c80.s();
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static op1 b() {
        return (op1) e10.b.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static op1 c() {
        return (op1) e10.a.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static vu0 d() {
        vu0 vu0Var = b;
        if (vu0Var != null) {
            return vu0Var;
        }
        t11.S("mHostType");
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean e(String str) {
        Object x92Var;
        str.getClass();
        op1 op1VarB = b();
        op1VarB.getClass();
        Object obj = null;
        try {
            x92Var = (List) op1VarB.b(se.D(new cg(yt0.Companion.serializer())), null, "hooker_debug_records");
        } catch (Throwable th) {
            x92Var = new x92(th);
        }
        if (x92Var instanceof x92) {
            x92Var = null;
        }
        Iterable iterable = (List) x92Var;
        if (iterable == null) {
            iterable = be0.h;
        }
        Iterator it = iterable.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (t11.l(((yt0) next).l(), str)) {
                obj = next;
                break;
            }
        }
        return ((yt0) obj) != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean f() {
        return c().a("security_mode", false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void g(Activity activity) {
        activity.getClass();
        up0.k = activity;
        Context applicationContext = activity.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = activity;
        }
        up0.i = applicationContext;
        ClassLoader classLoader = activity.getClassLoader();
        classLoader.getClass();
        up0.j = classLoader;
        String name = activity.getClass().getName();
        if (name.equals("com.tencent.mm.ui.LauncherUI") || name.equals("com.tencent.mobileqq.activity.SplashActivity") || name.equals("com.ss.android.ugc.aweme.main.MainActivity")) {
            i(a());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void h(vj vjVar, String str, Throwable th, String str2) {
        Object x92Var;
        vjVar.getClass();
        op1 op1VarB = b();
        op1VarB.getClass();
        ArrayList arrayList = vjVar.b;
        if (!arrayList.contains(th)) {
            arrayList.add(th);
        }
        yt0 yt0Var = new yt0(vjVar.d(), vjVar.getClass().getName(), str, str2, th.getClass().getName(), th.getMessage(), fg1.Q(th), 0L, 128, (c50) null);
        try {
            x92Var = (List) op1VarB.b(se.D(new cg(yt0.Companion.serializer())), null, "hooker_debug_records");
        } catch (Throwable th2) {
            x92Var = new x92(th2);
        }
        Iterable iterable = (List) (x92Var instanceof x92 ? null : x92Var);
        if (iterable == null) {
            iterable = be0.h;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : iterable) {
            if (!t11.l(((yt0) obj).l(), vjVar.d())) {
                arrayList2.add(obj);
            }
        }
        try {
            op1VarB.d(new cg(yt0.Companion.serializer()), du.y0(arrayList2, yt0Var), "hooker_debug_records");
        } catch (Throwable unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void i(vj[] vjVarArr) {
        if (e.compareAndSet(false, true)) {
            AtomicBoolean atomicBoolean = aq1.a;
            op1 op1VarC = c();
            op1 op1VarB = b();
            op1VarC.getClass();
            op1VarB.getClass();
            vjVarArr.getClass();
            aq1.a(op1VarC, op1VarB, vjVarArr);
            Thread thread = new Thread(new m2(9, vjVarArr));
            thread.setName("NukeInit");
            thread.setDaemon(true);
            thread.start();
        }
    }
}
