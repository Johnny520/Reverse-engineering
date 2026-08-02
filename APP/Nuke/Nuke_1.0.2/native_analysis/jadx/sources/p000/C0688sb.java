package p000;

import android.view.Choreographer;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import me.dartcv.nuke.BuildConfig;

/* JADX INFO: renamed from: sb */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0688sb extends tw2 implements mn0 {

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int f10015l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0688sb(int i, t00 t00Var, int i2) {
        super(i, t00Var);
        this.f10015l = i2;
    }

    @Override // p000.mn0
    /* JADX INFO: renamed from: g */
    public final Object mo12g(Object obj, Object obj2) throws IllegalAccessException, InvocationTargetException {
        int i = this.f10015l;
        a83 a83Var = a83.f116a;
        switch (i) {
            case 0:
                return ((C0688sb) mo13p((t00) obj2, (j20) obj)).mo7r(a83Var);
            case 1:
                ((C0688sb) mo13p((t00) obj2, (j20) obj)).mo7r(a83Var);
                throw null;
            case 2:
                return ((C0688sb) mo13p((t00) obj2, (j20) obj)).mo7r(a83Var);
            case 3:
                return ((C0688sb) mo13p((t00) obj2, (j20) obj)).mo7r(a83Var);
            case 4:
                ((C0688sb) mo13p((t00) obj2, (zj0) obj)).mo7r(a83Var);
                return a83Var;
            default:
                ((C0688sb) mo13p((t00) obj2, (j20) obj)).mo7r(a83Var);
                return a83Var;
        }
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: p */
    public final t00 mo13p(t00 t00Var, Object obj) {
        switch (this.f10015l) {
            case 0:
                return new C0688sb(2, t00Var, 0);
            case 1:
                return new C0688sb(2, t00Var, 1);
            case 2:
                return new C0688sb(2, t00Var, 2);
            case 3:
                return new C0688sb(2, t00Var, 3);
            case 4:
                return new C0688sb(2, t00Var, 4);
            default:
                return new C0688sb(2, t00Var, 5);
        }
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: r */
    public final Object mo7r(Object obj) throws IllegalAccessException, InvocationTargetException {
        x92 x92Var;
        int i = this.f10015l;
        a83 a83Var = a83.f116a;
        int i2 = 1;
        int i3 = 0;
        Object obj2 = null;
        switch (i) {
            case 0:
                fg1.m1627T(obj);
                return Choreographer.getInstance();
            case 1:
                fg1.m1627T(obj);
                String strM2209h = hk1.m2209h(pv2.m3994J0(BuildConfig.NUKE_API_BASE_URL, '/'), "/api/client/update");
                xw0 xw0Var = new xw0();
                xw0Var.m6196e(null, strM2209h);
                xw0 xw0VarM6360f = xw0Var.m6193b().m6360f();
                xw0VarM6360f.m6192a("versionCode", String.valueOf(BuildConfig.VERSION_CODE));
                yw0 yw0VarM6193b = xw0VarM6360f.m6193b();
                C0093cj c0093cj = new C0093cj(4);
                c0093cj.f1579a = yw0VarM6193b;
                c0093cj.m837l("Accept", "application/json");
                c0093cj.m837l("Cache-Control", "no-cache");
                c0093cj.m837l("User-Agent", "Nuke/1.0.2 Android");
                c0093cj.m839n("GET", null);
                k82 k82Var = new k82(c0093cj);
                et1 et1Var = C0807ve.f11914b;
                et1Var.getClass();
                r92 r92VarM4732h = new s52(et1Var, k82Var).m4732h();
                try {
                    ir0 ir0Var = C0807ve.f11913a;
                    String strM5668a = C0807ve.m5668a(r92VarM4732h.f9462n.m5476b());
                    if (r92VarM4732h.f9471w) {
                        C0807ve.m5669b(strM5668a);
                        throw null;
                    }
                    String str = "Update service HTTP " + r92VarM4732h.f9459k;
                    try {
                        if (C0807ve.f11913a.m2385b(strM5668a, AbstractC0731te.class) != null) {
                            throw new ClassCastException();
                        }
                        x92Var = null;
                    } catch (Throwable th) {
                        x92Var = new x92(th);
                    }
                    if (x92Var == null) {
                        obj2 = x92Var;
                    }
                    String str2 = (String) obj2;
                    if (str2 != null) {
                        str = str2;
                    }
                    throw new IOException(str);
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        pp0.m3916n(r92VarM4732h, th2);
                        throw th3;
                    }
                }
            case 2:
                fg1.m1627T(obj);
                List<C0479mz> list = (List) dd3.m1000h().mo514a();
                List<cr0> list2 = (List) dd3.m1001i().mo514a();
                if (list == null || list2 == null) {
                    return t62.f10583a;
                }
                pb1 pb1VarM1424E = AbstractC0179eu.m1424E();
                for (C0479mz c0479mz : list) {
                    pb1VarM1424E.add(new s62(c0479mz.f6923a, c0479mz.m3219a(), c0479mz.f6929g, false));
                }
                for (cr0 cr0Var : list2) {
                    String str3 = cr0Var.f1693a;
                    String str4 = cr0Var.f1694b;
                    if (pv2.m4006s0(str4)) {
                        str4 = cr0Var.f1693a;
                    }
                    pb1VarM1424E.add(new s62(str3, str4, cr0Var.f1697e, true));
                }
                pb1 pb1VarM1476z = AbstractC0179eu.m1476z(pb1VarM1424E);
                ArrayList arrayList = new ArrayList();
                ListIterator listIterator = pb1VarM1476z.listIterator(0);
                while (true) {
                    vs0 vs0Var = (vs0) listIterator;
                    if (!vs0Var.hasNext()) {
                        HashSet hashSet = new HashSet();
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj3 : arrayList) {
                            if (hashSet.add(((s62) obj3).f9944a)) {
                                arrayList2.add(obj3);
                            }
                        }
                        return new u62(AbstractC0142du.m1143A0(arrayList2, new C0847wh(new sl0(7), i3)));
                    }
                    Object next = vs0Var.next();
                    if (!pv2.m4006s0(((s62) next).f9944a)) {
                        arrayList.add(next);
                    }
                }
                break;
            case 3:
                fg1.m1627T(obj);
                List<C0479mz> list3 = (List) dd3.m1000h().mo514a();
                List<cr0> list4 = (List) dd3.m1001i().mo514a();
                if (list3 == null || list4 == null) {
                    return h33.f3812a;
                }
                pb1 pb1VarM1424E2 = AbstractC0179eu.m1424E();
                for (C0479mz c0479mz2 : list3) {
                    pb1VarM1424E2.add(new g33(c0479mz2.f6923a, c0479mz2.m3219a(), c0479mz2.f6929g, false));
                }
                for (cr0 cr0Var2 : list4) {
                    String str5 = cr0Var2.f1693a;
                    String str6 = cr0Var2.f1694b;
                    if (pv2.m4006s0(str6)) {
                        str6 = cr0Var2.f1693a;
                    }
                    pb1VarM1424E2.add(new g33(str5, str6, cr0Var2.f1697e, true));
                }
                pb1 pb1VarM1476z2 = AbstractC0179eu.m1476z(pb1VarM1424E2);
                ArrayList arrayList3 = new ArrayList();
                ListIterator listIterator2 = pb1VarM1476z2.listIterator(0);
                while (true) {
                    vs0 vs0Var2 = (vs0) listIterator2;
                    if (!vs0Var2.hasNext()) {
                        HashSet hashSet2 = new HashSet();
                        ArrayList arrayList4 = new ArrayList();
                        for (Object obj4 : arrayList3) {
                            if (hashSet2.add(((g33) obj4).f3298a)) {
                                arrayList4.add(obj4);
                            }
                        }
                        return new i33(AbstractC0142du.m1143A0(arrayList4, new C0847wh(new sl0(8), i2)));
                    }
                    Object next2 = vs0Var2.next();
                    if (!pv2.m4006s0(((g33) next2).f3298a)) {
                        arrayList3.add(next2);
                    }
                }
                break;
            case 4:
                fg1.m1627T(obj);
                return a83Var;
            default:
                fg1.m1627T(obj);
                bd3 bd3VarM1000h = dd3.m1000h();
                if (!(bd3VarM1000h instanceof ad3)) {
                    if (!(bd3VarM1000h instanceof zc3)) {
                        c80.m675s();
                    }
                    return null;
                }
                Iterator it = ((List) ((ad3) bd3VarM1000h).f163a).iterator();
                while (it.hasNext()) {
                    String str7 = ((C0479mz) it.next()).f6923a;
                    v00.f11581d.getClass();
                    Method method = (Method) v00.f11584g.getValue();
                    qg1.f8960d.getClass();
                    method.invoke(qg1.m4186j(), str7);
                }
                bd3 bd3VarM1001i = dd3.m1001i();
                if (!(bd3VarM1001i instanceof ad3)) {
                    if (!(bd3VarM1001i instanceof zc3)) {
                        c80.m675s();
                    }
                    return null;
                }
                Iterator it2 = ((List) ((ad3) bd3VarM1001i).f163a).iterator();
                while (it2.hasNext()) {
                    String str8 = ((cr0) it2.next()).f1693a;
                    v00.f11581d.getClass();
                    Method method2 = (Method) v00.f11584g.getValue();
                    qg1.f8960d.getClass();
                    method2.invoke(qg1.m4186j(), str8);
                }
                bd3 bd3VarM1005m = dd3.m1005m(yc3.f13410j, "SELECT r.username, r.alias, r.nickname, i.reserved2 AS avatarUrl\nFROM rcontact r\nLEFT JOIN img_flag i ON r.username = i.username\nWHERE r.username LIKE 'gh_%'", null, new yb3(16));
                if (!(bd3VarM1005m instanceof ad3)) {
                    if (bd3VarM1005m instanceof zc3) {
                        return a83Var;
                    }
                    c80.m675s();
                    return null;
                }
                Iterator it3 = ((List) ((ad3) bd3VarM1005m).f163a).iterator();
                while (it3.hasNext()) {
                    String str9 = ((qs1) it3.next()).f9152a;
                    v00.f11581d.getClass();
                    Method method3 = (Method) v00.f11584g.getValue();
                    qg1.f8960d.getClass();
                    method3.invoke(qg1.m4186j(), str9);
                }
                return a83Var;
        }
    }
}
