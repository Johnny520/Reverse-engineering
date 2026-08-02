package defpackage;

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

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class sb extends tw2 implements mn0 {
    public final /* synthetic */ int l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sb(int i, t00 t00Var, int i2) {
        super(i, t00Var);
        this.l = i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.mn0
    public final Object g(Object obj, Object obj2) throws IllegalAccessException, InvocationTargetException {
        int i = this.l;
        a83 a83Var = a83.a;
        switch (i) {
            case 0:
                return ((sb) p((t00) obj2, (j20) obj)).r(a83Var);
            case 1:
                ((sb) p((t00) obj2, (j20) obj)).r(a83Var);
                throw null;
            case 2:
                return ((sb) p((t00) obj2, (j20) obj)).r(a83Var);
            case 3:
                return ((sb) p((t00) obj2, (j20) obj)).r(a83Var);
            case 4:
                ((sb) p((t00) obj2, (zj0) obj)).r(a83Var);
                return a83Var;
            default:
                ((sb) p((t00) obj2, (j20) obj)).r(a83Var);
                return a83Var;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rj
    public final t00 p(t00 t00Var, Object obj) {
        switch (this.l) {
            case 0:
                return new sb(2, t00Var, 0);
            case 1:
                return new sb(2, t00Var, 1);
            case 2:
                return new sb(2, t00Var, 2);
            case 3:
                return new sb(2, t00Var, 3);
            case 4:
                return new sb(2, t00Var, 4);
            default:
                return new sb(2, t00Var, 5);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    @Override // defpackage.rj
    public final Object r(Object obj) throws IllegalAccessException, InvocationTargetException {
        x92 x92Var;
        int i = this.l;
        a83 a83Var = a83.a;
        int i2 = 1;
        int i3 = 0;
        Object obj2 = null;
        switch (i) {
            case 0:
                fg1.T(obj);
                return Choreographer.getInstance();
            case 1:
                fg1.T(obj);
                String strH = hk1.h(pv2.J0(BuildConfig.NUKE_API_BASE_URL, '/'), "/api/client/update");
                xw0 xw0Var = new xw0();
                xw0Var.e(null, strH);
                xw0 xw0VarF = xw0Var.b().f();
                xw0VarF.a("versionCode", String.valueOf(BuildConfig.VERSION_CODE));
                yw0 yw0VarB = xw0VarF.b();
                cj cjVar = new cj(4);
                cjVar.a = yw0VarB;
                cjVar.l("Accept", "application/json");
                cjVar.l("Cache-Control", "no-cache");
                cjVar.l("User-Agent", "Nuke/1.0.2 Android");
                cjVar.n("GET", null);
                k82 k82Var = new k82(cjVar);
                et1 et1Var = ve.b;
                et1Var.getClass();
                r92 r92VarH = new s52(et1Var, k82Var).h();
                try {
                    ir0 ir0Var = ve.a;
                    String strA = ve.a(r92VarH.n.b());
                    if (r92VarH.w) {
                        ve.b(strA);
                        throw null;
                    }
                    String str = "Update service HTTP " + r92VarH.k;
                    try {
                        if (ve.a.b(strA, te.class) != null) {
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
                        pp0.n(r92VarH, th2);
                        throw th3;
                    }
                }
            case 2:
                fg1.T(obj);
                List<mz> list = (List) dd3.h().a();
                List<cr0> list2 = (List) dd3.i().a();
                if (list == null || list2 == null) {
                    return t62.a;
                }
                pb1 pb1VarE = eu.E();
                for (mz mzVar : list) {
                    pb1VarE.add(new s62(mzVar.a, mzVar.a(), mzVar.g, false));
                }
                for (cr0 cr0Var : list2) {
                    String str3 = cr0Var.a;
                    String str4 = cr0Var.b;
                    if (pv2.s0(str4)) {
                        str4 = cr0Var.a;
                    }
                    pb1VarE.add(new s62(str3, str4, cr0Var.e, true));
                }
                pb1 pb1VarZ = eu.z(pb1VarE);
                ArrayList arrayList = new ArrayList();
                ListIterator listIterator = pb1VarZ.listIterator(0);
                while (true) {
                    vs0 vs0Var = (vs0) listIterator;
                    if (!vs0Var.hasNext()) {
                        HashSet hashSet = new HashSet();
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj3 : arrayList) {
                            if (hashSet.add(((s62) obj3).a)) {
                                arrayList2.add(obj3);
                            }
                        }
                        return new u62(du.A0(arrayList2, new wh(new sl0(7), i3)));
                    }
                    Object next = vs0Var.next();
                    if (!pv2.s0(((s62) next).a)) {
                        arrayList.add(next);
                    }
                }
                break;
            case 3:
                fg1.T(obj);
                List<mz> list3 = (List) dd3.h().a();
                List<cr0> list4 = (List) dd3.i().a();
                if (list3 == null || list4 == null) {
                    return h33.a;
                }
                pb1 pb1VarE2 = eu.E();
                for (mz mzVar2 : list3) {
                    pb1VarE2.add(new g33(mzVar2.a, mzVar2.a(), mzVar2.g, false));
                }
                for (cr0 cr0Var2 : list4) {
                    String str5 = cr0Var2.a;
                    String str6 = cr0Var2.b;
                    if (pv2.s0(str6)) {
                        str6 = cr0Var2.a;
                    }
                    pb1VarE2.add(new g33(str5, str6, cr0Var2.e, true));
                }
                pb1 pb1VarZ2 = eu.z(pb1VarE2);
                ArrayList arrayList3 = new ArrayList();
                ListIterator listIterator2 = pb1VarZ2.listIterator(0);
                while (true) {
                    vs0 vs0Var2 = (vs0) listIterator2;
                    if (!vs0Var2.hasNext()) {
                        HashSet hashSet2 = new HashSet();
                        ArrayList arrayList4 = new ArrayList();
                        for (Object obj4 : arrayList3) {
                            if (hashSet2.add(((g33) obj4).a)) {
                                arrayList4.add(obj4);
                            }
                        }
                        return new i33(du.A0(arrayList4, new wh(new sl0(8), i2)));
                    }
                    Object next2 = vs0Var2.next();
                    if (!pv2.s0(((g33) next2).a)) {
                        arrayList3.add(next2);
                    }
                }
                break;
            case 4:
                fg1.T(obj);
                return a83Var;
            default:
                fg1.T(obj);
                bd3 bd3VarH = dd3.h();
                if (!(bd3VarH instanceof ad3)) {
                    if (!(bd3VarH instanceof zc3)) {
                        c80.s();
                    }
                    return null;
                }
                Iterator it = ((List) ((ad3) bd3VarH).a).iterator();
                while (it.hasNext()) {
                    String str7 = ((mz) it.next()).a;
                    v00.d.getClass();
                    Method method = (Method) v00.g.getValue();
                    qg1.d.getClass();
                    method.invoke(qg1.j(), str7);
                }
                bd3 bd3VarI = dd3.i();
                if (!(bd3VarI instanceof ad3)) {
                    if (!(bd3VarI instanceof zc3)) {
                        c80.s();
                    }
                    return null;
                }
                Iterator it2 = ((List) ((ad3) bd3VarI).a).iterator();
                while (it2.hasNext()) {
                    String str8 = ((cr0) it2.next()).a;
                    v00.d.getClass();
                    Method method2 = (Method) v00.g.getValue();
                    qg1.d.getClass();
                    method2.invoke(qg1.j(), str8);
                }
                bd3 bd3VarM = dd3.m(yc3.j, "SELECT r.username, r.alias, r.nickname, i.reserved2 AS avatarUrl\nFROM rcontact r\nLEFT JOIN img_flag i ON r.username = i.username\nWHERE r.username LIKE 'gh_%'", null, new yb3(16));
                if (!(bd3VarM instanceof ad3)) {
                    if (bd3VarM instanceof zc3) {
                        return a83Var;
                    }
                    c80.s();
                    return null;
                }
                Iterator it3 = ((List) ((ad3) bd3VarM).a).iterator();
                while (it3.hasNext()) {
                    String str9 = ((qs1) it3.next()).a;
                    v00.d.getClass();
                    Method method3 = (Method) v00.g.getValue();
                    qg1.d.getClass();
                    method3.invoke(qg1.j(), str9);
                }
                return a83Var;
        }
    }
}
