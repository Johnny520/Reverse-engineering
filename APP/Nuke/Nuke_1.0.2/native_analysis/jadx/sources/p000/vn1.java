package p000;

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

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f12030a = 0;

    /* JADX INFO: renamed from: b */
    public final Object f12031b;

    /* JADX INFO: renamed from: c */
    public final Object f12032c;

    /* JADX INFO: renamed from: d */
    public final Object f12033d;

    /* JADX INFO: renamed from: e */
    public Object f12034e;

    /* JADX INFO: renamed from: f */
    public final Object f12035f;

    /* JADX INFO: renamed from: g */
    public Object f12036g;

    /* JADX INFO: renamed from: h */
    public Object f12037h;

    /* JADX INFO: renamed from: i */
    public Object f12038i;

    /* JADX INFO: renamed from: j */
    public final Object f12039j;

    /* JADX INFO: renamed from: k */
    public Object f12040k;

    public vn1(u22 u22Var, eg2 eg2Var, df2 df2Var, String str, d41 d41Var) {
        u22Var.getClass();
        eg2Var.getClass();
        df2Var.getClass();
        str.getClass();
        d41Var.getClass();
        this.f12031b = u22Var;
        this.f12032c = eg2Var;
        this.f12033d = df2Var;
        this.f12034e = str;
        this.f12035f = d41Var;
        qi2 qi2Var = df2Var.f2025c;
        th2 th2Var = u22Var.f11075a;
        pi2 pi2VarMo688l = qi2Var.mo688l(th2Var);
        this.f12036g = pi2VarMo688l;
        this.f12037h = new pn1(th2Var.f10782k.f9601a, pi2VarMo688l);
        df2Var.f2023a.getClass();
        this.f12038i = new jh2();
        this.f12039j = new Object();
    }

    /* JADX INFO: renamed from: B */
    public static void m5717B(sh1 sh1Var, sh1 sh1Var2, th1 th1Var) {
        if ((sh1Var instanceof yh1) && (sh1Var2 instanceof yh1)) {
            th1Var.getClass();
            ((yh1) sh1Var2).mo200g(th1Var);
            if (th1Var.f10770u) {
                ao1.m240c(th1Var);
                return;
            } else {
                th1Var.f10766q = true;
                return;
            }
        }
        if (!(th1Var instanceof C0545oj)) {
            kz0.m2764b("Unknown Modifier.Node type");
            return;
        }
        C0545oj c0545oj = (C0545oj) th1Var;
        boolean z = c0545oj.f10770u;
        if (z) {
            if (!z) {
                kz0.m2764b("unInitializeModifier called on unattached node");
            }
            if ((c0545oj.f10759j & 8) != 0) {
                ((ViewTreeObserverOnGlobalLayoutListenerC0045b7) sp0.m4939f0(c0545oj)).m456C();
            }
        }
        c0545oj.f7691v = sh1Var2;
        c0545oj.f10759j = ao1.m241d(sh1Var2);
        if (c0545oj.f10770u) {
            c0545oj.m3565M0(false);
        }
        if (th1Var.f10770u) {
            ao1.m240c(th1Var);
        } else {
            th1Var.f10766q = true;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m5718a(vn1 vn1Var, th1 th1Var, zn1 zn1Var) {
        for (th1 th1Var2 = th1Var.f10761l; th1Var2 != null; th1Var2 = th1Var2.f10761l) {
            if (th1Var2 == ((un1) vn1Var.f12032c)) {
                r61 r61VarM4389u = ((r61) vn1Var.f12031b).m4389u();
                zn1Var.f13987x = r61VarM4389u != null ? (qz0) r61VarM4389u.f9372M.f12033d : null;
                vn1Var.f12034e = zn1Var;
                return;
            } else {
                if ((th1Var2.f10759j & 2) != 0) {
                    return;
                }
                th1Var2.mo5262L0(zn1Var);
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public static th1 m5719i(sh1 sh1Var, th1 th1Var) {
        th1 th1VarMo199f;
        if (sh1Var instanceof yh1) {
            th1VarMo199f = ((yh1) sh1Var).mo199f();
            th1VarMo199f.f10759j = ao1.m243f(th1VarMo199f);
        } else {
            C0545oj c0545oj = new C0545oj();
            c0545oj.f10759j = ao1.m241d(sh1Var);
            c0545oj.f7691v = sh1Var;
            new HashSet();
            th1VarMo199f = c0545oj;
        }
        if (th1VarMo199f.f10770u) {
            kz0.m2764b("A ModifierNodeElement cannot return an already attached node from create() ");
        }
        th1VarMo199f.f10765p = true;
        th1 th1Var2 = th1Var.f10762m;
        if (th1Var2 != null) {
            th1Var2.f10761l = th1VarMo199f;
            th1VarMo199f.f10762m = th1Var2;
        }
        th1Var.f10762m = th1VarMo199f;
        th1VarMo199f.f10761l = th1Var;
        return th1VarMo199f;
    }

    /* JADX INFO: renamed from: j */
    public static th1 m5720j(th1 th1Var) {
        boolean z = th1Var.f10770u;
        if (z) {
            gk1 gk1Var = ao1.f314a;
            if (!z) {
                kz0.m2764b("autoInvalidateRemovedNode called on unattached node");
            }
            ao1.m238a(th1Var, -1, 2);
            th1Var.mo5260J0();
            th1Var.mo5257D0();
        }
        th1 th1Var2 = th1Var.f10762m;
        th1 th1Var3 = th1Var.f10761l;
        if (th1Var2 != null) {
            th1Var2.f10761l = th1Var3;
            th1Var.f10762m = null;
        }
        if (th1Var3 != null) {
            th1Var3.f10762m = th1Var2;
            th1Var.f10761l = null;
        }
        th1Var3.getClass();
        return th1Var3;
    }

    /* JADX INFO: renamed from: A */
    public void m5721A() {
        l61 l61Var;
        yv1 yv1Var;
        r61 r61Var = (r61) this.f12031b;
        zn1 zn1Var = (qz0) this.f12033d;
        for (th1 th1Var = ((qx2) this.f12035f).f10761l; th1Var != null; th1Var = th1Var.f10761l) {
            j61 j61VarM4954n = sp0.m4954n(th1Var);
            if (j61VarM4954n != null) {
                zn1 zn1Var2 = th1Var.f10764o;
                if (zn1Var2 != null) {
                    l61Var = (l61) zn1Var2;
                    j61 j61Var = l61Var.f5948Y;
                    l61Var.m2845u1(j61VarM4954n);
                    if (j61Var != th1Var && (yv1Var = l61Var.f13984S) != null) {
                        ((sq0) yv1Var).m4969c();
                    }
                } else {
                    l61Var = new l61(r61Var, j61VarM4954n);
                    th1Var.mo5262L0(l61Var);
                }
                zn1Var.f13987x = l61Var;
                l61Var.f13986w = zn1Var;
                zn1Var = l61Var;
            } else {
                th1Var.mo5262L0(zn1Var);
            }
        }
        r61 r61VarM4389u = r61Var.m4389u();
        zn1Var.f13987x = r61VarM4389u != null ? (qz0) r61VarM4389u.f9372M.f12033d : null;
        this.f12034e = zn1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m5722b(in0 in0Var, u00 u00Var) {
        kd2 kd2Var;
        if (u00Var instanceof kd2) {
            kd2Var = (kd2) u00Var;
            int i = kd2Var.f5474m;
            if ((i & Integer.MIN_VALUE) != 0) {
                kd2Var.f5474m = i - Integer.MIN_VALUE;
            } else {
                kd2Var = new kd2(this, u00Var);
            }
        }
        Object obj = kd2Var.f5472k;
        int i2 = kd2Var.f5474m;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    fg1.m1627T(obj);
                    return obj;
                }
                C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fg1.m1627T(obj);
            kd2Var.f5474m = 1;
            Object objMo5j = in0Var.mo5j(kd2Var);
            Object obj2 = k20.f5323h;
            return objMo5j == obj2 ? obj2 : objMo5j;
        } catch (eh2 e) {
            c80.m672p(e.f2446h, e.f2447i, e.f2448j ? 1 : 0, null, e, 8);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m5723c(String str, String str2, List list, u00 u00Var) {
        ld2 ld2Var;
        jh2 jh2Var = (jh2) this.f12038i;
        df2 df2Var = (df2) this.f12033d;
        if (u00Var instanceof ld2) {
            ld2Var = (ld2) u00Var;
            int i = ld2Var.f6073m;
            if ((i & Integer.MIN_VALUE) != 0) {
                ld2Var.f6073m = i - Integer.MIN_VALUE;
            } else {
                ld2Var = new ld2(this, u00Var);
            }
        }
        ld2 ld2Var2 = ld2Var;
        Object objM5722b = ld2Var2.f6071k;
        int i2 = ld2Var2.f6073m;
        if (i2 == 0) {
            fg1.m1627T(objM5722b);
            m5740v();
            int size = list.size();
            df2Var.f2023a.getClass();
            if (size > 64) {
                c80.m672p("INVALID_ARGUMENT", "Host calls accept at most 64 arguments.", 0, null, null, 28);
                return null;
            }
            ih2 ih2VarM2500b = jh2Var.m2500b(str);
            ArrayList arrayList = new ArrayList(AbstractC0179eu.m1421B(list, 10));
            for (Object obj : list) {
                df2Var.f2023a.getClass();
                arrayList.add(t11.m5096v(obj, jh2Var, 0));
            }
            in0 cw0Var = new cw0(this, ih2VarM2500b, str2, arrayList, null, 1);
            ld2Var2.f6073m = 1;
            objM5722b = m5722b(cw0Var, ld2Var2);
            Object obj2 = k20.f5323h;
            if (objM5722b == obj2) {
                return obj2;
            }
        } else {
            if (i2 != 1) {
                C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fg1.m1627T(objM5722b);
        }
        df2Var.f2023a.getClass();
        return t11.m5070V(objM5722b, jh2Var, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m5724d(in0 in0Var, u00 u00Var) {
        md2 md2Var;
        if (u00Var instanceof md2) {
            md2Var = (md2) u00Var;
            int i = md2Var.f6579m;
            if ((i & Integer.MIN_VALUE) != 0) {
                md2Var.f6579m = i - Integer.MIN_VALUE;
            } else {
                md2Var = new md2(this, u00Var);
            }
        }
        Object obj = md2Var.f6577k;
        int i2 = md2Var.f6579m;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    fg1.m1627T(obj);
                    return obj;
                }
                C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fg1.m1627T(obj);
            md2Var.f6579m = 1;
            Object objMo5j = in0Var.mo5j(md2Var);
            Object obj2 = k20.f5323h;
            return objMo5j == obj2 ? obj2 : objMo5j;
        } catch (fi2 e) {
            c80.m672p(e.f3008h, e.f3009i, e.f3010j ? 1 : 0, null, e, 8);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m5725e(in0 in0Var, u00 u00Var) {
        nd2 nd2Var;
        if (u00Var instanceof nd2) {
            nd2Var = (nd2) u00Var;
            int i = nd2Var.f7113m;
            if ((i & Integer.MIN_VALUE) != 0) {
                nd2Var.f7113m = i - Integer.MIN_VALUE;
            } else {
                nd2Var = new nd2(this, u00Var);
            }
        }
        Object obj = nd2Var.f7111k;
        int i2 = nd2Var.f7113m;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    fg1.m1627T(obj);
                    return obj;
                }
                C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fg1.m1627T(obj);
            nd2Var.f7113m = 1;
            Object objMo5j = in0Var.mo5j(nd2Var);
            Object obj2 = k20.f5323h;
            return objMo5j == obj2 ? obj2 : objMo5j;
        } catch (zk2 e) {
            c80.m672p(e.f13937h, e.f13938i, e.f13939j ? 1 : 0, null, e, 8);
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    public void m5726f() {
        synchronized (this.f12039j) {
            this.f12040k = null;
        }
        jh2 jh2Var = (jh2) this.f12038i;
        synchronized (jh2Var.f5035a) {
            jh2Var.f5036b.clear();
            jh2Var.f5038d = true;
        }
    }

    /* JADX INFO: renamed from: g */
    public JsObject m5727g() {
        d41 d41Var = (d41) this.f12035f;
        LinkedHashMap linkedHashMap = new LinkedHashMap(xe1.m6103U(d41Var.size()));
        Iterator<T> it = d41Var.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), t11.m5069U((j31) entry.getValue()));
        }
        return new JsObject(linkedHashMap);
    }

    /* JADX INFO: renamed from: h */
    public ArrayList m5728h(List list) {
        int size = list.size();
        df2 df2Var = (df2) this.f12033d;
        df2Var.f2023a.getClass();
        if (size > 64) {
            c80.m672p("INVALID_ARGUMENT", "Host calls accept at most 64 arguments.", 0, null, null, 28);
            return null;
        }
        ArrayList arrayList = new ArrayList(AbstractC0179eu.m1421B(list, 10));
        for (Object obj : list) {
            jh2 jh2Var = (jh2) this.f12038i;
            df2Var.f2023a.getClass();
            arrayList.add(t11.m5096v(obj, jh2Var, 0));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: k */
    public void m5729k(String str) {
        str.getClass();
        synchronized (this.f12039j) {
            try {
                ci2 ci2Var = (ci2) this.f12040k;
                if (t11.m5086l(ci2Var != null ? ci2Var.f1572a : null, str)) {
                    this.f12040k = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX INFO: renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m5730l(String str, String str2, u00 u00Var) {
        od2 od2Var;
        vn1 vn1Var;
        jh2 jh2Var = (jh2) this.f12038i;
        if (u00Var instanceof od2) {
            od2Var = (od2) u00Var;
            int i = od2Var.f7640m;
            if ((i & Integer.MIN_VALUE) != 0) {
                od2Var.f7640m = i - Integer.MIN_VALUE;
            } else {
                od2Var = new od2(this, u00Var);
            }
        }
        Object objM5722b = od2Var.f7638k;
        int i2 = od2Var.f7640m;
        if (i2 == 0) {
            fg1.m1627T(objM5722b);
            m5740v();
            vn1Var = this;
            hw0 hw0Var = new hw0(vn1Var, jh2Var.m2500b(str), str2, null, 1);
            od2Var.f7640m = 1;
            objM5722b = vn1Var.m5722b(hw0Var, od2Var);
            k20 k20Var = k20.f5323h;
            if (objM5722b == k20Var) {
                return k20Var;
            }
        } else {
            if (i2 != 1) {
                C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fg1.m1627T(objM5722b);
            vn1Var = this;
        }
        ((df2) vn1Var.f12033d).f2023a.getClass();
        return t11.m5070V(objM5722b, jh2Var, 0);
    }

    /* JADX INFO: renamed from: m */
    public boolean m5731m(int i) {
        return (((th1) this.f12036g).f10760k & i) != 0;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: n */
    public boolean m5732n(String str) {
        pn1 pn1Var = (pn1) this.f12037h;
        pi2 pi2Var = (pi2) this.f12036g;
        switch (str.hashCode()) {
            case -2038778761:
                if (str.equals("host.reflect")) {
                    return pi2Var.f8367d;
                }
                return false;
            case -1148664053:
                if (str.equals("filesystem.host")) {
                    return pi2Var.f8369f;
                }
                return false;
            case 3208616:
                if (str.equals("host")) {
                    return pi2Var.f8367d;
                }
                return false;
            case 1206550979:
                if (str.equals("network.private")) {
                    return pn1Var.f8416e;
                }
                return false;
            case 1374931886:
                if (str.equals("filesystem.external")) {
                    return pi2Var.f8368e;
                }
                return false;
            case 1843485230:
                if (str.equals("network")) {
                    return pn1Var.f8415d;
                }
                return false;
            default:
                return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX INFO: renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m5733o(String str, String str2, List list, u00 u00Var) throws Throwable {
        pd2 pd2Var;
        df2 df2Var = (df2) this.f12033d;
        if (u00Var instanceof pd2) {
            pd2Var = (pd2) u00Var;
            int i = pd2Var.f8265m;
            if ((i & Integer.MIN_VALUE) != 0) {
                pd2Var.f8265m = i - Integer.MIN_VALUE;
            } else {
                pd2Var = new pd2(this, u00Var);
            }
        }
        Object objM3762R = pd2Var.f8263k;
        int i2 = pd2Var.f8265m;
        t00 t00Var = null;
        if (i2 == 0) {
            fg1.m1627T(objM3762R);
            rp0.m4531Q(str);
            Class clsM5741w = m5741w(str);
            ArrayList arrayListM5728h = m5728h(list);
            Map map = uu0.f11505a;
            rp0.m4532R(str2, "method");
            clsM5741w.getClass();
            ru0 ru0VarM5585d = uu0.m5585d(clsM5741w, str2, arrayListM5728h, true);
            if (ru0VarM5585d == null) {
                c80.m672p("NOT_FOUND", "No matching static method named the requested name was found.", 0, null, null, 28);
                return null;
            }
            c20 c20Var = df2Var.f2032j;
            u30 u30Var = new u30(ru0VarM5585d, this, t00Var, 3);
            pd2Var.f8265m = 1;
            objM3762R = AbstractC0570p7.m3762R(c20Var, u30Var, pd2Var);
            k20 k20Var = k20.f5323h;
            if (objM3762R == k20Var) {
                return k20Var;
            }
        } else {
            if (i2 != 1) {
                C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fg1.m1627T(objM3762R);
        }
        jh2 jh2Var = (jh2) this.f12038i;
        df2Var.f2023a.getClass();
        return t11.m5070V(objM3762R, jh2Var, 0);
    }

    /* JADX INFO: renamed from: p */
    public Object m5734p() {
        df2 df2Var = (df2) this.f12033d;
        m5740v();
        try {
            nh2 nh2Var = df2Var.f2031i;
            th2 th2Var = ((u22) this.f12031b).f11075a;
            Object objMo417d = nh2Var.mo417d(new lh2(th2Var.f10774c, th2Var.f10775d));
            if (objMo417d == null) {
                c80.m672p("NOT_FOUND", "The host class loader is unavailable.", 0, null, null, 28);
                return null;
            }
            jh2 jh2Var = (jh2) this.f12038i;
            df2Var.f2023a.getClass();
            return t11.m5070V(objMo417d, jh2Var, 0);
        } catch (eh2 e) {
            c80.m672p(e.f2446h, e.f2447i, e.f2448j ? 1 : 0, null, e, 8);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX INFO: renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m5735q(String str, List list, u00 u00Var) throws Throwable {
        qd2 qd2Var;
        Object next;
        df2 df2Var = (df2) this.f12033d;
        if (u00Var instanceof qd2) {
            qd2Var = (qd2) u00Var;
            int i = qd2Var.f8923m;
            if ((i & Integer.MIN_VALUE) != 0) {
                qd2Var.f8923m = i - Integer.MIN_VALUE;
            } else {
                qd2Var = new qd2(this, u00Var);
            }
        }
        Object objM3762R = qd2Var.f8921k;
        int i2 = qd2Var.f8923m;
        t00 t00Var = null;
        if (i2 == 0) {
            fg1.m1627T(objM3762R);
            rp0.m4531Q(str);
            Class clsM5741w = m5741w(str);
            ArrayList arrayListM5728h = m5728h(list);
            Map map = uu0.f11505a;
            clsM5741w.getClass();
            Constructor<?>[] declaredConstructors = clsM5741w.getDeclaredConstructors();
            declaredConstructors.getClass();
            ArrayList<Constructor> arrayList = new ArrayList();
            for (Constructor<?> constructor : declaredConstructors) {
                if (constructor.getParameterCount() == arrayListM5728h.size()) {
                    arrayList.add(constructor);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Constructor constructor2 : arrayList) {
                Map map2 = uu0.f11505a;
                Class<?>[] parameterTypes = constructor2.getParameterTypes();
                parameterTypes.getClass();
                pu0 pu0VarM5582a = uu0.m5582a(parameterTypes, arrayListM5728h);
                su0 su0Var = pu0VarM5582a != null ? new su0(constructor2, pu0VarM5582a.f8613a, pu0VarM5582a.f8614b) : null;
                if (su0Var != null) {
                    arrayList2.add(su0Var);
                }
            }
            Iterator it = arrayList2.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int i3 = ((su0) next).f10373c;
                    do {
                        Object next2 = it.next();
                        int i4 = ((su0) next2).f10373c;
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
            qu0 qu0Var = su0Var2 != null ? new qu0(su0Var2.f10371a, su0Var2.f10372b) : null;
            if (qu0Var == null) {
                c80.m672p("NOT_FOUND", "No matching constructor was found.", 0, null, null, 28);
                return null;
            }
            c20 c20Var = df2Var.f2032j;
            u30 u30Var = new u30(qu0Var, this, t00Var, 4);
            qd2Var.f8923m = 1;
            objM3762R = AbstractC0570p7.m3762R(c20Var, u30Var, qd2Var);
            k20 k20Var = k20.f5323h;
            if (objM3762R == k20Var) {
                return k20Var;
            }
        } else {
            if (i2 != 1) {
                C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fg1.m1627T(objM3762R);
        }
        jh2 jh2Var = (jh2) this.f12038i;
        df2Var.f2023a.getClass();
        return t11.m5070V(objM3762R, jh2Var, 0);
    }

    /* JADX INFO: renamed from: r */
    public Object m5736r() {
        df2 df2Var = (df2) this.f12033d;
        m5740v();
        try {
            nh2 nh2Var = df2Var.f2031i;
            th2 th2Var = ((u22) this.f12031b).f11075a;
            Object objMo416b = nh2Var.mo416b(new lh2(th2Var.f10774c, th2Var.f10775d));
            if (objMo416b == null) {
                c80.m672p("NOT_FOUND", "The host application context is unavailable.", 0, null, null, 28);
                return null;
            }
            jh2 jh2Var = (jh2) this.f12038i;
            df2Var.f2023a.getClass();
            return t11.m5070V(objMo416b, jh2Var, 0);
        } catch (eh2 e) {
            c80.m672p(e.f2446h, e.f2447i, e.f2448j ? 1 : 0, null, e, 8);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX INFO: renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m5737s(String str, String str2, u00 u00Var) throws Throwable {
        rd2 rd2Var;
        df2 df2Var = (df2) this.f12033d;
        if (u00Var instanceof rd2) {
            rd2Var = (rd2) u00Var;
            int i = rd2Var.f9523m;
            if ((i & Integer.MIN_VALUE) != 0) {
                rd2Var.f9523m = i - Integer.MIN_VALUE;
            } else {
                rd2Var = new rd2(this, u00Var);
            }
        }
        Object objM3762R = rd2Var.f9521k;
        int i2 = rd2Var.f9523m;
        t00 t00Var = null;
        if (i2 == 0) {
            fg1.m1627T(objM3762R);
            rp0.m4531Q(str);
            Class clsM5741w = m5741w(str);
            Map map = uu0.f11505a;
            rp0.m4532R(str2, "field");
            clsM5741w.getClass();
            Field fieldM5583b = uu0.m5583b(clsM5741w, str2, true);
            if (fieldM5583b == null) {
                c80.m672p("NOT_FOUND", "No static field named the requested name was found.", 0, null, null, 28);
                return null;
            }
            c20 c20Var = df2Var.f2032j;
            u30 u30Var = new u30(this, fieldM5583b, t00Var, 5);
            rd2Var.f9523m = 1;
            objM3762R = AbstractC0570p7.m3762R(c20Var, u30Var, rd2Var);
            k20 k20Var = k20.f5323h;
            if (objM3762R == k20Var) {
                return k20Var;
            }
        } else {
            if (i2 != 1) {
                C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fg1.m1627T(objM3762R);
        }
        jh2 jh2Var = (jh2) this.f12038i;
        df2Var.f2023a.getClass();
        return t11.m5070V(objM3762R, jh2Var, 0);
    }

    /* JADX INFO: renamed from: t */
    public void m5738t(ph2 ph2Var, String str) {
        ph2Var.getClass();
        rh2 rh2Var = ((df2) this.f12033d).f2024b;
        Instant instantNow = Instant.now();
        instantNow.getClass();
        rh2Var.mo419f(new qh2(instantNow, ph2Var, sh2.f10147j, pv2.m3992H0(str, 16384), ((u22) this.f12031b).f11075a.f10774c, null, null));
    }

    public String toString() {
        switch (this.f12030a) {
            case 0:
                StringBuilder sb = new StringBuilder("[");
                th1 th1Var = (th1) this.f12036g;
                qx2 qx2Var = (qx2) this.f12035f;
                if (th1Var == qx2Var) {
                    sb.append("]");
                } else {
                    while (true) {
                        if (th1Var != null && th1Var != qx2Var) {
                            sb.append(String.valueOf(th1Var));
                            if (th1Var.f10762m == qx2Var) {
                                sb.append("]");
                            } else {
                                sb.append(",");
                                th1Var = th1Var.f10762m;
                            }
                        }
                    }
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: u */
    public void m5739u(ci2 ci2Var) {
        ci2Var.getClass();
        synchronized (this.f12039j) {
            int size = ci2Var.f1577f.f10791d.size();
            ((df2) this.f12033d).f2023a.getClass();
            if (size > 128) {
                throw new sd2("INVALID_ARGUMENT", "Message events may contain at most 128 segments.", false, null, null, 28);
            }
            if (((ci2) this.f12040k) != null) {
                throw new IllegalStateException("A message event is already pending dispatch.");
            }
            this.f12040k = ci2Var;
        }
    }

    /* JADX INFO: renamed from: v */
    public void m5740v() {
        if (((pi2) this.f12036g).f8367d) {
            return;
        }
        c80.m672p("PERMISSION_DENIED", "Host reflection access has not been granted.", 0, null, null, 28);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /* JADX INFO: renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Class m5741w(String str) {
        boolean zM5086l;
        m5740v();
        u22 u22Var = (u22) this.f12031b;
        kh2 kh2Var = u22Var.f11075a.f10782k.f9602b;
        List list = kh2Var != null ? kh2Var.f5578c : null;
        if (list == null) {
            list = be0.f819h;
        }
        boolean z = false;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String str2 = (String) it.next();
                if (!t11.m5086l(str2, "*")) {
                    if (wv2.m6005W(str2, ".*", false)) {
                        String strM4013z0 = pv2.m4013z0(str2, ".*");
                        zM5086l = t11.m5086l(str, strM4013z0) || wv2.m6012d0(str, strM4013z0.concat("."), false);
                    } else {
                        zM5086l = t11.m5086l(str, str2);
                    }
                    if (zM5086l) {
                        z = true;
                        break;
                    }
                }
            }
        }
        if (!z) {
            c80.m672p("PERMISSION_DENIED", "The class is outside the declared host class scope.", 0, null, null, 28);
            return null;
        }
        try {
            nh2 nh2Var = ((df2) this.f12033d).f2031i;
            th2 th2Var = u22Var.f11075a;
            return nh2Var.mo418e(new lh2(th2Var.f10774c, th2Var.f10775d), str);
        } catch (eh2 e) {
            c80.m672p(e.f2446h, e.f2447i, e.f2448j ? 1 : 0, null, e, 8);
            return null;
        } catch (ClassNotFoundException e2) {
            c80.m672p("NOT_FOUND", "The requested host class was not found.", 0, null, e2, 12);
            return null;
        } catch (LinkageError e3) {
            c80.m672p("INTERNAL_ERROR", "The host class could not be loaded.", 0, null, e3, 12);
            return null;
        }
    }

    /* JADX INFO: renamed from: x */
    public void m5742x() {
        for (th1 th1Var = (th1) this.f12036g; th1Var != null; th1Var = th1Var.f10762m) {
            th1Var.mo5259I0();
            if (th1Var.f10765p) {
                gk1 gk1Var = ao1.f314a;
                if (!th1Var.f10770u) {
                    kz0.m2764b("autoInvalidateInsertedNode called on unattached node");
                }
                ao1.m238a(th1Var, -1, 1);
            }
            if (th1Var.f10766q) {
                ao1.m240c(th1Var);
            }
            th1Var.f10765p = false;
            th1Var.f10766q = false;
        }
    }

    /* JADX INFO: renamed from: y */
    public JsObject m5743y() {
        bf2 bf2Var = ((df2) this.f12033d).f2023a;
        u22 u22Var = (u22) this.f12031b;
        ow1 ow1Var = new ow1("apiVersion", Integer.valueOf(u22Var.f11075a.f10773b));
        ow1 ow1Var2 = new ow1("quickJsVersion", (String) this.f12034e);
        th2 th2Var = u22Var.f11075a;
        ow1 ow1Var3 = new ow1("script", new JsObject(we1.m5876q0(new ow1("id", th2Var.f10774c), new ow1("name", th2Var.f10775d), new ow1("version", th2Var.f10776e), new ow1("versionCode", Long.valueOf(th2Var.f10777f)))));
        ((eg2) this.f12032c).getClass();
        ow1 ow1Var4 = new ow1("memoryBytes", null);
        bf2Var.getClass();
        return new JsObject(we1.m5876q0(ow1Var, ow1Var2, ow1Var3, new ow1("limits", new JsObject(we1.m5876q0(ow1Var4, new ow1("maxActiveTimers", 128), new ow1("minIntervalMs", 10L), new ow1("maxHttpConcurrency", 8), new ow1("httpTimeoutMs", 30000L), new ow1("maxHttpRedirects", 10), new ow1("maxHttpRequestBytes", 16777216L), new ow1("maxHttpResponseBytes", 16777216L), new ow1("maxHttpDownloadBytes", 67108864L), new ow1("maxFileReadBytes", 16777216L), new ow1("maxDataStorageBytes", 134217728L), new ow1("maxCacheStorageBytes", 268435456L), new ow1("maxExternalStorageBytes", 1073741824L), new ow1("maxMessageSegments", 128), new ow1("maxHostObjectReferences", 256), new ow1("maxHostCallArguments", 64), new ow1("maxHostValueDepth", 16))))));
    }

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
    
        if (r0.m5333a(r14 - 1, r27 - 1) == false) goto L185;
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
    /* JADX INFO: renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m5744z(int i, zk1 zk1Var, zk1 zk1Var2, th1 th1Var, boolean z) {
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
        tn1 tn1Var = (tn1) this.f12040k;
        if (tn1Var == null) {
            i2 = i;
            zk1Var3 = zk1Var;
            zk1Var4 = zk1Var2;
            tn1Var = new tn1(this, th1Var, i2, zk1Var3, zk1Var4, z);
            this.f12040k = tn1Var;
        } else {
            i2 = i;
            zk1Var3 = zk1Var;
            zk1Var4 = zk1Var2;
            tn1Var.f10853a = th1Var;
            tn1Var.f10854b = i2;
            tn1Var.f10855c = zk1Var3;
            tn1Var.f10856d = zk1Var4;
            tn1Var.f10857e = z;
        }
        vn1 vn1Var = tn1Var.f10858f;
        int i9 = zk1Var3.f13936j - i2;
        int i10 = zk1Var4.f13936j - i2;
        char c3 = 2;
        int i11 = ((i9 + i10) + 1) / 2;
        i11 i11Var = new i11(i11 * 3);
        i11 i11Var2 = new i11(i11 * 4);
        int i12 = 0;
        i11Var2.m2245e(0, i9, 0, i10);
        int i13 = (i11 * 2) + 1;
        int[] iArr3 = new int[i13];
        int[] iArr4 = new int[i13];
        int[] iArr5 = new int[5];
        while (true) {
            int i14 = i11Var2.f4215b;
            if (i14 == 0) {
                break;
            }
            char c4 = c3;
            int[] iArr6 = i11Var2.f4214a;
            int i15 = i12;
            int i16 = i14 - 1;
            i11Var2.f4215b = i16;
            int i17 = iArr6[i16];
            int i18 = i14 - 2;
            i11Var2.f4215b = i18;
            int i19 = iArr6[i18];
            int i20 = i14 - 3;
            i11Var2.f4215b = i20;
            int i21 = iArr6[i20];
            int i22 = i14 - 4;
            i11Var2.f4215b = i22;
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
                                while (i6 < i21 && i7 < i17 && tn1Var.m5333a(i6, i7)) {
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
                        i11Var.m2244d(i42, i43, iMin);
                    } else {
                        c2 = c;
                    }
                    i11Var2.m2245e(i23, iArr2[i15], i19, iArr2[c2]);
                    i11Var2.m2245e(iArr2[c4], i21, iArr2[3], i17);
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
        int i54 = i11Var.f4215b;
        if (i54 % 3 != 0) {
            kz0.m2764b("Array size not a multiple of 3");
        }
        if (i54 > 3) {
            i3 = i53;
            i11Var.m2246f(i3, i54 - 3);
        } else {
            i3 = i53;
        }
        i11Var.m2244d(i9, i10, i3);
        int i55 = i3;
        int i56 = i55;
        int i57 = i56;
        while (i55 < i11Var.f4215b) {
            int[] iArr8 = i11Var.f4214a;
            int i58 = iArr8[i55];
            int i59 = iArr8[i55 + 2];
            int i60 = i58 - i59;
            int i61 = iArr8[i55 + 1] - i59;
            i55 += 3;
            while (i56 < i60) {
                th1 th1Var2 = tn1Var.f10853a.f10762m;
                th1Var2.getClass();
                if ((th1Var2.f10759j & 2) != 0) {
                    zn1 zn1Var = th1Var2.f10764o;
                    zn1Var.getClass();
                    zn1 zn1Var2 = zn1Var.f13987x;
                    zn1 zn1Var3 = zn1Var.f13986w;
                    zn1Var3.getClass();
                    if (zn1Var2 != null) {
                        zn1Var2.f13986w = zn1Var3;
                    }
                    zn1Var3.f13987x = zn1Var2;
                    m5718a(vn1Var, tn1Var.f10853a, zn1Var3);
                }
                tn1Var.f10853a = m5720j(th1Var2);
                i56++;
            }
            while (i57 < i61) {
                th1 th1VarM5719i = m5719i((sh1) tn1Var.f10856d.f13934h[tn1Var.f10854b + i57], tn1Var.f10853a);
                tn1Var.f10853a = th1VarM5719i;
                if (tn1Var.f10857e) {
                    th1 th1Var3 = th1VarM5719i.f10762m;
                    th1Var3.getClass();
                    zn1 zn1Var4 = th1Var3.f10764o;
                    zn1Var4.getClass();
                    j61 j61VarM4954n = sp0.m4954n(tn1Var.f10853a);
                    if (j61VarM4954n != null) {
                        l61 l61Var = new l61((r61) vn1Var.f12031b, j61VarM4954n);
                        tn1Var.f10853a.mo5262L0(l61Var);
                        m5718a(vn1Var, tn1Var.f10853a, l61Var);
                        l61Var.f13987x = zn1Var4.f13987x;
                        l61Var.f13986w = zn1Var4;
                        zn1Var4.f13987x = l61Var;
                    } else {
                        tn1Var.f10853a.mo5262L0(zn1Var4);
                    }
                    tn1Var.f10853a.mo5256C0();
                    tn1Var.f10853a.mo5259I0();
                    th1 th1Var4 = tn1Var.f10853a;
                    gk1 gk1Var = ao1.f314a;
                    if (!th1Var4.f10770u) {
                        kz0.m2764b("autoInvalidateInsertedNode called on unattached node");
                    }
                    ao1.m238a(th1Var4, -1, 1);
                } else {
                    th1VarM5719i.f10765p = true;
                }
                i57++;
            }
            while (true) {
                int i62 = i59 - 1;
                if (i59 > 0) {
                    th1 th1Var5 = tn1Var.f10853a.f10762m;
                    th1Var5.getClass();
                    tn1Var.f10853a = th1Var5;
                    zk1 zk1Var5 = tn1Var.f10855c;
                    int i63 = tn1Var.f10854b;
                    sh1 sh1Var = (sh1) zk1Var5.f13934h[i63 + i56];
                    sh1 sh1Var2 = (sh1) tn1Var.f10856d.f13934h[i63 + i57];
                    if (!t11.m5086l(sh1Var, sh1Var2)) {
                        m5717B(sh1Var, sh1Var2, tn1Var.f10853a);
                    }
                    i56++;
                    i57++;
                    i59 = i62;
                }
            }
        }
        int i64 = i3;
        for (th1 th1Var6 = ((qx2) this.f12035f).f10761l; th1Var6 != null && th1Var6 != ((un1) this.f12032c); th1Var6 = th1Var6.f10761l) {
            i64 |= th1Var6.f10759j;
            th1Var6.f10760k = i64;
        }
    }

    public vn1(r61 r61Var) {
        this.f12031b = r61Var;
        un1 un1Var = new un1();
        un1Var.f10760k = -1;
        this.f12032c = un1Var;
        qz0 qz0Var = new qz0(r61Var);
        this.f12033d = qz0Var;
        this.f12034e = qz0Var;
        qx2 qx2Var = qz0Var.f9293Y;
        this.f12035f = qx2Var;
        this.f12036g = qx2Var;
        this.f12039j = new zk1(new uh1[16]);
    }
}
