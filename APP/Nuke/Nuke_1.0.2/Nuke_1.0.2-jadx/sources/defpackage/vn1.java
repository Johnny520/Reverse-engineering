package defpackage;

import com.dokar.quickjs.binding.JsObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.time.Instant;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class vn1 {
    public final /* synthetic */ int a = 0;
    public final Object b;
    public final Object c;
    public final Object d;
    public Object e;
    public final Object f;
    public Object g;
    public Object h;
    public Object i;
    public final Object j;
    public Object k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public vn1(u22 u22Var, eg2 eg2Var, df2 df2Var, String str, d41 d41Var) {
        u22Var.getClass();
        eg2Var.getClass();
        df2Var.getClass();
        str.getClass();
        d41Var.getClass();
        this.b = u22Var;
        this.c = eg2Var;
        this.d = df2Var;
        this.e = str;
        this.f = d41Var;
        qi2 qi2Var = df2Var.c;
        th2 th2Var = u22Var.a;
        pi2 pi2VarL = qi2Var.l(th2Var);
        this.g = pi2VarL;
        this.h = new pn1(th2Var.k.a, pi2VarL);
        df2Var.a.getClass();
        this.i = new jh2();
        this.j = new Object();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void B(sh1 sh1Var, sh1 sh1Var2, th1 th1Var) {
        if ((sh1Var instanceof yh1) && (sh1Var2 instanceof yh1)) {
            th1Var.getClass();
            ((yh1) sh1Var2).g(th1Var);
            if (th1Var.u) {
                ao1.c(th1Var);
                return;
            } else {
                th1Var.q = true;
                return;
            }
        }
        if (!(th1Var instanceof oj)) {
            kz0.b("Unknown Modifier.Node type");
            return;
        }
        oj ojVar = (oj) th1Var;
        boolean z = ojVar.u;
        if (z) {
            if (!z) {
                kz0.b("unInitializeModifier called on unattached node");
            }
            if ((ojVar.j & 8) != 0) {
                ((b7) sp0.f0(ojVar)).C();
            }
        }
        ojVar.v = sh1Var2;
        ojVar.j = ao1.d(sh1Var2);
        if (ojVar.u) {
            ojVar.M0(false);
        }
        if (th1Var.u) {
            ao1.c(th1Var);
        } else {
            th1Var.q = true;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void a(vn1 vn1Var, th1 th1Var, zn1 zn1Var) {
        for (th1 th1Var2 = th1Var.l; th1Var2 != null; th1Var2 = th1Var2.l) {
            if (th1Var2 == ((un1) vn1Var.c)) {
                r61 r61VarU = ((r61) vn1Var.b).u();
                zn1Var.x = r61VarU != null ? (qz0) r61VarU.M.d : null;
                vn1Var.e = zn1Var;
                return;
            } else {
                if ((th1Var2.j & 2) != 0) {
                    return;
                }
                th1Var2.L0(zn1Var);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static th1 i(sh1 sh1Var, th1 th1Var) {
        th1 th1VarF;
        if (sh1Var instanceof yh1) {
            th1VarF = ((yh1) sh1Var).f();
            th1VarF.j = ao1.f(th1VarF);
        } else {
            oj ojVar = new oj();
            ojVar.j = ao1.d(sh1Var);
            ojVar.v = sh1Var;
            new HashSet();
            th1VarF = ojVar;
        }
        if (th1VarF.u) {
            kz0.b("A ModifierNodeElement cannot return an already attached node from create() ");
        }
        th1VarF.p = true;
        th1 th1Var2 = th1Var.m;
        if (th1Var2 != null) {
            th1Var2.l = th1VarF;
            th1VarF.m = th1Var2;
        }
        th1Var.m = th1VarF;
        th1VarF.l = th1Var;
        return th1VarF;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static th1 j(th1 th1Var) {
        boolean z = th1Var.u;
        if (z) {
            gk1 gk1Var = ao1.a;
            if (!z) {
                kz0.b("autoInvalidateRemovedNode called on unattached node");
            }
            ao1.a(th1Var, -1, 2);
            th1Var.J0();
            th1Var.D0();
        }
        th1 th1Var2 = th1Var.m;
        th1 th1Var3 = th1Var.l;
        if (th1Var2 != null) {
            th1Var2.l = th1Var3;
            th1Var.m = null;
        }
        if (th1Var3 != null) {
            th1Var3.m = th1Var2;
            th1Var.l = null;
        }
        th1Var3.getClass();
        return th1Var3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void A() {
        l61 l61Var;
        yv1 yv1Var;
        r61 r61Var = (r61) this.b;
        zn1 zn1Var = (qz0) this.d;
        for (th1 th1Var = ((qx2) this.f).l; th1Var != null; th1Var = th1Var.l) {
            j61 j61VarN = sp0.n(th1Var);
            if (j61VarN != null) {
                zn1 zn1Var2 = th1Var.o;
                if (zn1Var2 != null) {
                    l61Var = (l61) zn1Var2;
                    j61 j61Var = l61Var.Y;
                    l61Var.u1(j61VarN);
                    if (j61Var != th1Var && (yv1Var = l61Var.S) != null) {
                        ((sq0) yv1Var).c();
                    }
                } else {
                    l61Var = new l61(r61Var, j61VarN);
                    th1Var.L0(l61Var);
                }
                zn1Var.x = l61Var;
                l61Var.w = zn1Var;
                zn1Var = l61Var;
            } else {
                th1Var.L0(zn1Var);
            }
        }
        r61 r61VarU = r61Var.u();
        zn1Var.x = r61VarU != null ? (qz0) r61VarU.M.d : null;
        this.e = zn1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object b(in0 in0Var, u00 u00Var) {
        kd2 kd2Var;
        if (u00Var instanceof kd2) {
            kd2Var = (kd2) u00Var;
            int i = kd2Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                kd2Var.m = i - Integer.MIN_VALUE;
            } else {
                kd2Var = new kd2(this, u00Var);
            }
        }
        Object obj = kd2Var.k;
        int i2 = kd2Var.m;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    fg1.T(obj);
                    return obj;
                }
                s.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fg1.T(obj);
            kd2Var.m = 1;
            Object objJ = in0Var.j(kd2Var);
            Object obj2 = k20.h;
            return objJ == obj2 ? obj2 : objJ;
        } catch (eh2 e) {
            c80.p(e.h, e.i, e.j ? 1 : 0, null, e, 8);
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object c(String str, String str2, List list, u00 u00Var) {
        ld2 ld2Var;
        jh2 jh2Var = (jh2) this.i;
        df2 df2Var = (df2) this.d;
        if (u00Var instanceof ld2) {
            ld2Var = (ld2) u00Var;
            int i = ld2Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                ld2Var.m = i - Integer.MIN_VALUE;
            } else {
                ld2Var = new ld2(this, u00Var);
            }
        }
        ld2 ld2Var2 = ld2Var;
        Object objB = ld2Var2.k;
        int i2 = ld2Var2.m;
        if (i2 == 0) {
            fg1.T(objB);
            v();
            int size = list.size();
            df2Var.a.getClass();
            if (size > 64) {
                c80.p("INVALID_ARGUMENT", "Host calls accept at most 64 arguments.", 0, null, null, 28);
                return null;
            }
            ih2 ih2VarB = jh2Var.b(str);
            ArrayList arrayList = new ArrayList(eu.B(list, 10));
            for (Object obj : list) {
                df2Var.a.getClass();
                arrayList.add(t11.v(obj, jh2Var, 0));
            }
            in0 cw0Var = new cw0(this, ih2VarB, str2, arrayList, null, 1);
            ld2Var2.m = 1;
            objB = b(cw0Var, ld2Var2);
            Object obj2 = k20.h;
            if (objB == obj2) {
                return obj2;
            }
        } else {
            if (i2 != 1) {
                s.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fg1.T(objB);
        }
        df2Var.a.getClass();
        return t11.V(objB, jh2Var, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object d(in0 in0Var, u00 u00Var) {
        md2 md2Var;
        if (u00Var instanceof md2) {
            md2Var = (md2) u00Var;
            int i = md2Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                md2Var.m = i - Integer.MIN_VALUE;
            } else {
                md2Var = new md2(this, u00Var);
            }
        }
        Object obj = md2Var.k;
        int i2 = md2Var.m;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    fg1.T(obj);
                    return obj;
                }
                s.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fg1.T(obj);
            md2Var.m = 1;
            Object objJ = in0Var.j(md2Var);
            Object obj2 = k20.h;
            return objJ == obj2 ? obj2 : objJ;
        } catch (fi2 e) {
            c80.p(e.h, e.i, e.j ? 1 : 0, null, e, 8);
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object e(in0 in0Var, u00 u00Var) {
        nd2 nd2Var;
        if (u00Var instanceof nd2) {
            nd2Var = (nd2) u00Var;
            int i = nd2Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                nd2Var.m = i - Integer.MIN_VALUE;
            } else {
                nd2Var = new nd2(this, u00Var);
            }
        }
        Object obj = nd2Var.k;
        int i2 = nd2Var.m;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    fg1.T(obj);
                    return obj;
                }
                s.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fg1.T(obj);
            nd2Var.m = 1;
            Object objJ = in0Var.j(nd2Var);
            Object obj2 = k20.h;
            return objJ == obj2 ? obj2 : objJ;
        } catch (zk2 e) {
            c80.p(e.h, e.i, e.j ? 1 : 0, null, e, 8);
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void f() {
        synchronized (this.j) {
            this.k = null;
        }
        jh2 jh2Var = (jh2) this.i;
        synchronized (jh2Var.a) {
            jh2Var.b.clear();
            jh2Var.d = true;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public JsObject g() {
        d41 d41Var = (d41) this.f;
        LinkedHashMap linkedHashMap = new LinkedHashMap(xe1.U(d41Var.size()));
        Iterator<T> it = d41Var.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), t11.U((j31) entry.getValue()));
        }
        return new JsObject(linkedHashMap);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ArrayList h(List list) {
        int size = list.size();
        df2 df2Var = (df2) this.d;
        df2Var.a.getClass();
        if (size > 64) {
            c80.p("INVALID_ARGUMENT", "Host calls accept at most 64 arguments.", 0, null, null, 28);
            return null;
        }
        ArrayList arrayList = new ArrayList(eu.B(list, 10));
        for (Object obj : list) {
            jh2 jh2Var = (jh2) this.i;
            df2Var.a.getClass();
            arrayList.add(t11.v(obj, jh2Var, 0));
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void k(String str) {
        str.getClass();
        synchronized (this.j) {
            try {
                ci2 ci2Var = (ci2) this.k;
                if (t11.l(ci2Var != null ? ci2Var.a : null, str)) {
                    this.k = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object l(String str, String str2, u00 u00Var) {
        od2 od2Var;
        vn1 vn1Var;
        jh2 jh2Var = (jh2) this.i;
        if (u00Var instanceof od2) {
            od2Var = (od2) u00Var;
            int i = od2Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                od2Var.m = i - Integer.MIN_VALUE;
            } else {
                od2Var = new od2(this, u00Var);
            }
        }
        Object objB = od2Var.k;
        int i2 = od2Var.m;
        if (i2 == 0) {
            fg1.T(objB);
            v();
            vn1Var = this;
            hw0 hw0Var = new hw0(vn1Var, jh2Var.b(str), str2, null, 1);
            od2Var.m = 1;
            objB = vn1Var.b(hw0Var, od2Var);
            k20 k20Var = k20.h;
            if (objB == k20Var) {
                return k20Var;
            }
        } else {
            if (i2 != 1) {
                s.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fg1.T(objB);
            vn1Var = this;
        }
        ((df2) vn1Var.d).a.getClass();
        return t11.V(objB, jh2Var, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean m(int i) {
        return (((th1) this.g).k & i) != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public boolean n(String str) {
        pn1 pn1Var = (pn1) this.h;
        pi2 pi2Var = (pi2) this.g;
        switch (str.hashCode()) {
            case -2038778761:
                if (str.equals("host.reflect")) {
                    return pi2Var.d;
                }
                return false;
            case -1148664053:
                if (str.equals("filesystem.host")) {
                    return pi2Var.f;
                }
                return false;
            case 3208616:
                if (str.equals("host")) {
                    return pi2Var.d;
                }
                return false;
            case 1206550979:
                if (str.equals("network.private")) {
                    return pn1Var.e;
                }
                return false;
            case 1374931886:
                if (str.equals("filesystem.external")) {
                    return pi2Var.e;
                }
                return false;
            case 1843485230:
                if (str.equals("network")) {
                    return pn1Var.d;
                }
                return false;
            default:
                return false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object o(String str, String str2, List list, u00 u00Var) throws Throwable {
        pd2 pd2Var;
        df2 df2Var = (df2) this.d;
        if (u00Var instanceof pd2) {
            pd2Var = (pd2) u00Var;
            int i = pd2Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                pd2Var.m = i - Integer.MIN_VALUE;
            } else {
                pd2Var = new pd2(this, u00Var);
            }
        }
        Object objR = pd2Var.k;
        int i2 = pd2Var.m;
        t00 t00Var = null;
        if (i2 == 0) {
            fg1.T(objR);
            rp0.Q(str);
            Class clsW = w(str);
            ArrayList arrayListH = h(list);
            Map map = uu0.a;
            rp0.R(str2, "method");
            clsW.getClass();
            ru0 ru0VarD = uu0.d(clsW, str2, arrayListH, true);
            if (ru0VarD == null) {
                c80.p("NOT_FOUND", "No matching static method named the requested name was found.", 0, null, null, 28);
                return null;
            }
            c20 c20Var = df2Var.j;
            u30 u30Var = new u30(ru0VarD, this, t00Var, 3);
            pd2Var.m = 1;
            objR = p7.R(c20Var, u30Var, pd2Var);
            k20 k20Var = k20.h;
            if (objR == k20Var) {
                return k20Var;
            }
        } else {
            if (i2 != 1) {
                s.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fg1.T(objR);
        }
        jh2 jh2Var = (jh2) this.i;
        df2Var.a.getClass();
        return t11.V(objR, jh2Var, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Object p() {
        df2 df2Var = (df2) this.d;
        v();
        try {
            nh2 nh2Var = df2Var.i;
            th2 th2Var = ((u22) this.b).a;
            Object objD = nh2Var.d(new lh2(th2Var.c, th2Var.d));
            if (objD == null) {
                c80.p("NOT_FOUND", "The host class loader is unavailable.", 0, null, null, 28);
                return null;
            }
            jh2 jh2Var = (jh2) this.i;
            df2Var.a.getClass();
            return t11.V(objD, jh2Var, 0);
        } catch (eh2 e) {
            c80.p(e.h, e.i, e.j ? 1 : 0, null, e, 8);
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object q(String str, List list, u00 u00Var) throws Throwable {
        qd2 qd2Var;
        Object next;
        df2 df2Var = (df2) this.d;
        if (u00Var instanceof qd2) {
            qd2Var = (qd2) u00Var;
            int i = qd2Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                qd2Var.m = i - Integer.MIN_VALUE;
            } else {
                qd2Var = new qd2(this, u00Var);
            }
        }
        Object objR = qd2Var.k;
        int i2 = qd2Var.m;
        t00 t00Var = null;
        if (i2 == 0) {
            fg1.T(objR);
            rp0.Q(str);
            Class clsW = w(str);
            ArrayList arrayListH = h(list);
            Map map = uu0.a;
            clsW.getClass();
            Constructor<?>[] declaredConstructors = clsW.getDeclaredConstructors();
            declaredConstructors.getClass();
            ArrayList<Constructor> arrayList = new ArrayList();
            for (Constructor<?> constructor : declaredConstructors) {
                if (constructor.getParameterCount() == arrayListH.size()) {
                    arrayList.add(constructor);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Constructor constructor2 : arrayList) {
                Map map2 = uu0.a;
                Class<?>[] parameterTypes = constructor2.getParameterTypes();
                parameterTypes.getClass();
                pu0 pu0VarA = uu0.a(parameterTypes, arrayListH);
                su0 su0Var = pu0VarA != null ? new su0(constructor2, pu0VarA.a, pu0VarA.b) : null;
                if (su0Var != null) {
                    arrayList2.add(su0Var);
                }
            }
            Iterator it = arrayList2.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int i3 = ((su0) next).c;
                    do {
                        Object next2 = it.next();
                        int i4 = ((su0) next2).c;
                        if (i3 > i4) {
                            next = next2;
                            i3 = i4;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            su0 su0Var2 = (su0) next;
            qu0 qu0Var = su0Var2 != null ? new qu0(su0Var2.a, su0Var2.b) : null;
            if (qu0Var == null) {
                c80.p("NOT_FOUND", "No matching constructor was found.", 0, null, null, 28);
                return null;
            }
            c20 c20Var = df2Var.j;
            u30 u30Var = new u30(qu0Var, this, t00Var, 4);
            qd2Var.m = 1;
            objR = p7.R(c20Var, u30Var, qd2Var);
            k20 k20Var = k20.h;
            if (objR == k20Var) {
                return k20Var;
            }
        } else {
            if (i2 != 1) {
                s.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fg1.T(objR);
        }
        jh2 jh2Var = (jh2) this.i;
        df2Var.a.getClass();
        return t11.V(objR, jh2Var, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Object r() {
        df2 df2Var = (df2) this.d;
        v();
        try {
            nh2 nh2Var = df2Var.i;
            th2 th2Var = ((u22) this.b).a;
            Object objB = nh2Var.b(new lh2(th2Var.c, th2Var.d));
            if (objB == null) {
                c80.p("NOT_FOUND", "The host application context is unavailable.", 0, null, null, 28);
                return null;
            }
            jh2 jh2Var = (jh2) this.i;
            df2Var.a.getClass();
            return t11.V(objB, jh2Var, 0);
        } catch (eh2 e) {
            c80.p(e.h, e.i, e.j ? 1 : 0, null, e, 8);
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object s(String str, String str2, u00 u00Var) throws Throwable {
        rd2 rd2Var;
        df2 df2Var = (df2) this.d;
        if (u00Var instanceof rd2) {
            rd2Var = (rd2) u00Var;
            int i = rd2Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                rd2Var.m = i - Integer.MIN_VALUE;
            } else {
                rd2Var = new rd2(this, u00Var);
            }
        }
        Object objR = rd2Var.k;
        int i2 = rd2Var.m;
        t00 t00Var = null;
        if (i2 == 0) {
            fg1.T(objR);
            rp0.Q(str);
            Class clsW = w(str);
            Map map = uu0.a;
            rp0.R(str2, "field");
            clsW.getClass();
            Field fieldB = uu0.b(clsW, str2, true);
            if (fieldB == null) {
                c80.p("NOT_FOUND", "No static field named the requested name was found.", 0, null, null, 28);
                return null;
            }
            c20 c20Var = df2Var.j;
            u30 u30Var = new u30(this, fieldB, t00Var, 5);
            rd2Var.m = 1;
            objR = p7.R(c20Var, u30Var, rd2Var);
            k20 k20Var = k20.h;
            if (objR == k20Var) {
                return k20Var;
            }
        } else {
            if (i2 != 1) {
                s.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fg1.T(objR);
        }
        jh2 jh2Var = (jh2) this.i;
        df2Var.a.getClass();
        return t11.V(objR, jh2Var, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void t(ph2 ph2Var, String str) {
        ph2Var.getClass();
        rh2 rh2Var = ((df2) this.d).b;
        Instant instantNow = Instant.now();
        instantNow.getClass();
        rh2Var.f(new qh2(instantNow, ph2Var, sh2.j, pv2.H0(str, 16384), ((u22) this.b).a.c, null, null));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        switch (this.a) {
            case 0:
                StringBuilder sb = new StringBuilder("[");
                th1 th1Var = (th1) this.g;
                qx2 qx2Var = (qx2) this.f;
                if (th1Var == qx2Var) {
                    sb.append("]");
                } else {
                    while (true) {
                        if (th1Var != null && th1Var != qx2Var) {
                            sb.append(String.valueOf(th1Var));
                            if (th1Var.m == qx2Var) {
                                sb.append("]");
                            } else {
                                sb.append(",");
                                th1Var = th1Var.m;
                            }
                        }
                    }
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void u(ci2 ci2Var) {
        ci2Var.getClass();
        synchronized (this.j) {
            int size = ci2Var.f.d.size();
            ((df2) this.d).a.getClass();
            if (size > 128) {
                throw new sd2("INVALID_ARGUMENT", "Message events may contain at most 128 segments.", false, null, null, 28);
            }
            if (((ci2) this.k) != null) {
                throw new IllegalStateException("A message event is already pending dispatch.");
            }
            this.k = ci2Var;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void v() {
        if (((pi2) this.g).d) {
            return;
        }
        c80.p("PERMISSION_DENIED", "Host reflection access has not been granted.", 0, null, null, 28);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Class w(String str) {
        boolean zL;
        v();
        u22 u22Var = (u22) this.b;
        kh2 kh2Var = u22Var.a.k.b;
        List list = kh2Var != null ? kh2Var.c : null;
        if (list == null) {
            list = be0.h;
        }
        boolean z = false;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String str2 = (String) it.next();
                if (!t11.l(str2, "*")) {
                    if (wv2.W(str2, ".*", false)) {
                        String strZ0 = pv2.z0(str2, ".*");
                        zL = t11.l(str, strZ0) || wv2.d0(str, strZ0.concat("."), false);
                    } else {
                        zL = t11.l(str, str2);
                    }
                    if (zL) {
                        z = true;
                        break;
                    }
                }
            }
        }
        if (!z) {
            c80.p("PERMISSION_DENIED", "The class is outside the declared host class scope.", 0, null, null, 28);
            return null;
        }
        try {
            nh2 nh2Var = ((df2) this.d).i;
            th2 th2Var = u22Var.a;
            return nh2Var.e(new lh2(th2Var.c, th2Var.d), str);
        } catch (eh2 e) {
            c80.p(e.h, e.i, e.j ? 1 : 0, null, e, 8);
            return null;
        } catch (ClassNotFoundException e2) {
            c80.p("NOT_FOUND", "The requested host class was not found.", 0, null, e2, 12);
            return null;
        } catch (LinkageError e3) {
            c80.p("INTERNAL_ERROR", "The host class could not be loaded.", 0, null, e3, 12);
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void x() {
        for (th1 th1Var = (th1) this.g; th1Var != null; th1Var = th1Var.m) {
            th1Var.I0();
            if (th1Var.p) {
                gk1 gk1Var = ao1.a;
                if (!th1Var.u) {
                    kz0.b("autoInvalidateInsertedNode called on unattached node");
                }
                ao1.a(th1Var, -1, 1);
            }
            if (th1Var.q) {
                ao1.c(th1Var);
            }
            th1Var.p = false;
            th1Var.q = false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public JsObject y() {
        bf2 bf2Var = ((df2) this.d).a;
        u22 u22Var = (u22) this.b;
        ow1 ow1Var = new ow1("apiVersion", Integer.valueOf(u22Var.a.b));
        ow1 ow1Var2 = new ow1("quickJsVersion", (String) this.e);
        th2 th2Var = u22Var.a;
        ow1 ow1Var3 = new ow1("script", new JsObject(we1.q0(new ow1("id", th2Var.c), new ow1("name", th2Var.d), new ow1("version", th2Var.e), new ow1("versionCode", Long.valueOf(th2Var.f)))));
        ((eg2) this.c).getClass();
        ow1 ow1Var4 = new ow1("memoryBytes", null);
        bf2Var.getClass();
        return new JsObject(we1.q0(ow1Var, ow1Var2, ow1Var3, new ow1("limits", new JsObject(we1.q0(ow1Var4, new ow1("maxActiveTimers", 128), new ow1("minIntervalMs", 10L), new ow1("maxHttpConcurrency", 8), new ow1("httpTimeoutMs", 30000L), new ow1("maxHttpRedirects", 10), new ow1("maxHttpRequestBytes", 16777216L), new ow1("maxHttpResponseBytes", 16777216L), new ow1("maxHttpDownloadBytes", 67108864L), new ow1("maxFileReadBytes", 16777216L), new ow1("maxDataStorageBytes", 134217728L), new ow1("maxCacheStorageBytes", 268435456L), new ow1("maxExternalStorageBytes", 1073741824L), new ow1("maxMessageSegments", 128), new ow1("maxHostObjectReferences", 256), new ow1("maxHostCallArguments", 64), new ow1("maxHostValueDepth", 16))))));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0264, code lost:
    
        r13 = r28 + 2;
        r11 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x026a, code lost:
    
        r3 = r3 + 1;
        r12 = r20;
        r11 = r21;
        r13 = r26;
        r14 = r29;
        r35 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x014a, code lost:
    
        r26 = r13;
        r29 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0150, code lost:
    
        if ((r19 & 1) != 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0152, code lost:
    
        r11 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0154, code lost:
    
        r11 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0156, code lost:
    
        r13 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0157, code lost:
    
        if (r13 > r3) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0159, code lost:
    
        if (r13 == r12) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x015b, code lost:
    
        if (r13 == r3) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x015d, code lost:
    
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x016b, code lost:
    
        if (r20[(r13 + 1) + r17] >= r20[(r13 - 1) + r17]) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x016e, code lost:
    
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0170, code lost:
    
        r11 = r20[(r13 - 1) + r17];
        r14 = r11 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0179, code lost:
    
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x017b, code lost:
    
        r11 = r20[(r13 + 1) + r17];
        r14 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0182, code lost:
    
        r22 = r10 - ((r6 - r14) - r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0188, code lost:
    
        if (r3 == 0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x018a, code lost:
    
        r25 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x018d, code lost:
    
        r25 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x018f, code lost:
    
        if (r14 != r11) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0191, code lost:
    
        r27 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0194, code lost:
    
        r27 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0196, code lost:
    
        r25 = r22 + (r25 & r27);
        r22 = r11;
        r11 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01a0, code lost:
    
        if (r14 <= r7) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01a2, code lost:
    
        if (r11 <= r15) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01a4, code lost:
    
        r27 = r11;
        r28 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01b0, code lost:
    
        if (r0.a(r14 - 1, r27 - 1) == false) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01b2, code lost:
    
        r14 = r14 - 1;
        r11 = r27 - 1;
        r13 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01b9, code lost:
    
        r27 = r11;
        r28 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01bd, code lost:
    
        r20[r17 + r28] = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01c1, code lost:
    
        if (r24 == 0) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01c3, code lost:
    
        r11 = r19 - r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01c5, code lost:
    
        if (r11 < r12) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01c7, code lost:
    
        if (r11 > r3) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01cd, code lost:
    
        if (r16[r17 + r11] < r14) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01cf, code lost:
    
        r26[r33] = r14;
        r11 = 1;
        r26[1] = r27;
        r26[r32] = r22;
        r26[3] = r25;
        r26[4] = 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0140  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void z(int i, zk1 zk1Var, zk1 zk1Var2, th1 th1Var, boolean z) {
        int i2;
        zk1 zk1Var3;
        zk1 zk1Var4;
        int i3;
        int[] iArr;
        int[] iArr2;
        char c;
        char c2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        tn1 tn1Var = (tn1) this.k;
        if (tn1Var == null) {
            i2 = i;
            zk1Var3 = zk1Var;
            zk1Var4 = zk1Var2;
            tn1Var = new tn1(this, th1Var, i2, zk1Var3, zk1Var4, z);
            this.k = tn1Var;
        } else {
            i2 = i;
            zk1Var3 = zk1Var;
            zk1Var4 = zk1Var2;
            tn1Var.a = th1Var;
            tn1Var.b = i2;
            tn1Var.c = zk1Var3;
            tn1Var.d = zk1Var4;
            tn1Var.e = z;
        }
        vn1 vn1Var = tn1Var.f;
        int i9 = zk1Var3.j - i2;
        int i10 = zk1Var4.j - i2;
        char c3 = 2;
        int i11 = ((i9 + i10) + 1) / 2;
        i11 i11Var = new i11(i11 * 3);
        i11 i11Var2 = new i11(i11 * 4);
        int i12 = 0;
        i11Var2.e(0, i9, 0, i10);
        int i13 = (i11 * 2) + 1;
        int[] iArr3 = new int[i13];
        int[] iArr4 = new int[i13];
        int[] iArr5 = new int[5];
        while (true) {
            int i14 = i11Var2.b;
            if (i14 == 0) {
                break;
            }
            char c4 = c3;
            int[] iArr6 = i11Var2.a;
            int i15 = i12;
            int i16 = i14 - 1;
            i11Var2.b = i16;
            int i17 = iArr6[i16];
            int i18 = i14 - 2;
            i11Var2.b = i18;
            int i19 = iArr6[i18];
            int i20 = i14 - 3;
            i11Var2.b = i20;
            int i21 = iArr6[i20];
            int i22 = i14 - 4;
            i11Var2.b = i22;
            int i23 = iArr6[i22];
            int i24 = i21 - i23;
            int i25 = i13;
            int i26 = i17 - i19;
            int[] iArr7 = iArr3;
            if (i24 < 1 || i26 < 1) {
                iArr = iArr4;
                iArr2 = iArr5;
            } else {
                int i27 = 1;
                int i28 = ((i24 + i26) + 1) / 2;
                int i29 = i25 / 2;
                int i30 = i29 + 1;
                iArr7[i30] = i23;
                iArr4[i30] = i21;
                int i31 = i15;
                while (i31 < i28) {
                    int i32 = i24 - i26;
                    int i33 = i28;
                    iArr = iArr4;
                    int i34 = -i31;
                    int i35 = (Math.abs(i32) & 1) == i27 ? 1 : i15;
                    int i36 = i34;
                    while (true) {
                        if (i36 > i31) {
                            break;
                        }
                        if (i36 != i34) {
                            if (i36 != i31) {
                                i4 = i36;
                                iArr2 = iArr5;
                                if (iArr7[i36 + 1 + i29] > iArr7[(i4 - 1) + i29]) {
                                }
                                int i37 = ((i6 - i23) + i19) - i4;
                                int i38 = i37 - ((i31 != 0 ? 1 : i15) & (i6 == i5 ? 1 : i15));
                                int i39 = i5;
                                i7 = i37;
                                while (i6 < i21 && i7 < i17 && tn1Var.a(i6, i7)) {
                                    i6++;
                                    i7++;
                                }
                                iArr7[i29 + i4] = i6;
                                if (i35 != 0) {
                                    int i40 = i7;
                                    int i41 = i32 - i4;
                                    i8 = i24;
                                    if (i41 >= i34 + 1 && i41 <= i31 - 1 && iArr[i29 + i41] <= i6) {
                                        iArr2[i15] = i39;
                                        iArr2[1] = i38;
                                        iArr2[c4] = i6;
                                        iArr2[3] = i40;
                                        iArr2[4] = i15;
                                        c = 1;
                                        break;
                                    }
                                } else {
                                    i8 = i24;
                                }
                                i36 = i4 + 2;
                                iArr5 = iArr2;
                                i24 = i8;
                            } else {
                                i4 = i36;
                                iArr2 = iArr5;
                            }
                            i5 = iArr7[(i4 - 1) + i29];
                            i6 = i5 + 1;
                            int i372 = ((i6 - i23) + i19) - i4;
                            int i382 = i372 - ((i31 != 0 ? 1 : i15) & (i6 == i5 ? 1 : i15));
                            int i392 = i5;
                            i7 = i372;
                            while (i6 < i21) {
                                i6++;
                                i7++;
                            }
                            iArr7[i29 + i4] = i6;
                            if (i35 != 0) {
                            }
                            i36 = i4 + 2;
                            iArr5 = iArr2;
                            i24 = i8;
                        } else {
                            i4 = i36;
                            iArr2 = iArr5;
                        }
                        i5 = iArr7[i4 + 1 + i29];
                        i6 = i5;
                        int i3722 = ((i6 - i23) + i19) - i4;
                        int i3822 = i3722 - ((i31 != 0 ? 1 : i15) & (i6 == i5 ? 1 : i15));
                        int i3922 = i5;
                        i7 = i3722;
                        while (i6 < i21) {
                        }
                        iArr7[i29 + i4] = i6;
                        if (i35 != 0) {
                        }
                        i36 = i4 + 2;
                        iArr5 = iArr2;
                        i24 = i8;
                    }
                    if (Math.min(iArr2[c4] - iArr2[i15], iArr2[3] - iArr2[c]) > 0) {
                        int i42 = iArr2[i15];
                        int i43 = iArr2[c];
                        int i44 = iArr2[3] - i43;
                        int iMin = iArr2[c4] - i42;
                        if (i44 != iMin) {
                            iMin = Math.min(iMin, i44);
                            int i45 = iArr2[4];
                            int i46 = i45 != 0 ? 1 : i15;
                            int i47 = iArr2[3];
                            c2 = 1;
                            int i48 = iArr2[1];
                            int i49 = i47 - i48;
                            int i50 = iArr2[c4];
                            int i51 = iArr2[i15];
                            int i52 = i42 + (((i49 > i50 - i51 ? 1 : i15) | i46) ^ 1);
                            i43 += (((i47 - i48 > i50 - i51 ? 1 : i15) ^ 1) | (i45 != 0 ? 1 : i15)) ^ 1;
                            i42 = i52;
                        } else {
                            c2 = 1;
                        }
                        i11Var.d(i42, i43, iMin);
                    } else {
                        c2 = c;
                    }
                    i11Var2.e(i23, iArr2[i15], i19, iArr2[c2]);
                    i11Var2.e(iArr2[c4], i21, iArr2[3], i17);
                }
                iArr = iArr4;
                iArr2 = iArr5;
            }
            c3 = c4;
            i12 = i15;
            i13 = i25;
            iArr3 = iArr7;
            iArr4 = iArr;
            iArr5 = iArr2;
        }
        int i53 = i12;
        int i54 = i11Var.b;
        if (i54 % 3 != 0) {
            kz0.b("Array size not a multiple of 3");
        }
        if (i54 > 3) {
            i3 = i53;
            i11Var.f(i3, i54 - 3);
        } else {
            i3 = i53;
        }
        i11Var.d(i9, i10, i3);
        int i55 = i3;
        int i56 = i55;
        int i57 = i56;
        while (i55 < i11Var.b) {
            int[] iArr8 = i11Var.a;
            int i58 = iArr8[i55];
            int i59 = iArr8[i55 + 2];
            int i60 = i58 - i59;
            int i61 = iArr8[i55 + 1] - i59;
            i55 += 3;
            while (i56 < i60) {
                th1 th1Var2 = tn1Var.a.m;
                th1Var2.getClass();
                if ((th1Var2.j & 2) != 0) {
                    zn1 zn1Var = th1Var2.o;
                    zn1Var.getClass();
                    zn1 zn1Var2 = zn1Var.x;
                    zn1 zn1Var3 = zn1Var.w;
                    zn1Var3.getClass();
                    if (zn1Var2 != null) {
                        zn1Var2.w = zn1Var3;
                    }
                    zn1Var3.x = zn1Var2;
                    a(vn1Var, tn1Var.a, zn1Var3);
                }
                tn1Var.a = j(th1Var2);
                i56++;
            }
            while (i57 < i61) {
                th1 th1VarI = i((sh1) tn1Var.d.h[tn1Var.b + i57], tn1Var.a);
                tn1Var.a = th1VarI;
                if (tn1Var.e) {
                    th1 th1Var3 = th1VarI.m;
                    th1Var3.getClass();
                    zn1 zn1Var4 = th1Var3.o;
                    zn1Var4.getClass();
                    j61 j61VarN = sp0.n(tn1Var.a);
                    if (j61VarN != null) {
                        l61 l61Var = new l61((r61) vn1Var.b, j61VarN);
                        tn1Var.a.L0(l61Var);
                        a(vn1Var, tn1Var.a, l61Var);
                        l61Var.x = zn1Var4.x;
                        l61Var.w = zn1Var4;
                        zn1Var4.x = l61Var;
                    } else {
                        tn1Var.a.L0(zn1Var4);
                    }
                    tn1Var.a.C0();
                    tn1Var.a.I0();
                    th1 th1Var4 = tn1Var.a;
                    gk1 gk1Var = ao1.a;
                    if (!th1Var4.u) {
                        kz0.b("autoInvalidateInsertedNode called on unattached node");
                    }
                    ao1.a(th1Var4, -1, 1);
                } else {
                    th1VarI.p = true;
                }
                i57++;
            }
            while (true) {
                int i62 = i59 - 1;
                if (i59 > 0) {
                    th1 th1Var5 = tn1Var.a.m;
                    th1Var5.getClass();
                    tn1Var.a = th1Var5;
                    zk1 zk1Var5 = tn1Var.c;
                    int i63 = tn1Var.b;
                    sh1 sh1Var = (sh1) zk1Var5.h[i63 + i56];
                    sh1 sh1Var2 = (sh1) tn1Var.d.h[i63 + i57];
                    if (!t11.l(sh1Var, sh1Var2)) {
                        B(sh1Var, sh1Var2, tn1Var.a);
                    }
                    i56++;
                    i57++;
                    i59 = i62;
                }
            }
        }
        int i64 = i3;
        for (th1 th1Var6 = ((qx2) this.f).l; th1Var6 != null && th1Var6 != ((un1) this.c); th1Var6 = th1Var6.l) {
            i64 |= th1Var6.j;
            th1Var6.k = i64;
        }
    }

    public vn1(r61 r61Var) {
        this.b = r61Var;
        un1 un1Var = new un1();
        un1Var.k = -1;
        this.c = un1Var;
        qz0 qz0Var = new qz0(r61Var);
        this.d = qz0Var;
        this.e = qz0Var;
        qx2 qx2Var = qz0Var.Y;
        this.f = qx2Var;
        this.g = qx2Var;
        this.j = new zk1(new uh1[16]);
    }
}
