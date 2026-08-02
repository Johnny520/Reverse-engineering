package p000;

import android.content.Context;
import android.content.res.Resources;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import me.dartcv.nuke.R;
import nuke.module.wechat.p002ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class sq1 {

    /* JADX INFO: renamed from: a */
    public static final sq1 f10305a = new sq1();

    /* JADX INFO: renamed from: b */
    public static final s00 f10306b;

    /* JADX INFO: renamed from: c */
    public static final kl1 f10307c;

    /* JADX INFO: renamed from: d */
    public static final ju2 f10308d;

    /* JADX INFO: renamed from: e */
    public static final m52 f10309e;

    /* JADX INFO: renamed from: f */
    public static volatile boolean f10310f;

    /* JADX INFO: renamed from: g */
    public static volatile Resources f10311g;

    /* JADX INFO: renamed from: h */
    public static C0043b5 f10312h;

    /* JADX INFO: renamed from: i */
    public static wi2 f10313i;

    /* JADX INFO: renamed from: j */
    public static C0043b5 f10314j;

    /* JADX INFO: renamed from: k */
    public static kj1 f10315k;

    /* JADX INFO: renamed from: l */
    public static kj1 f10316l;

    /* JADX INFO: renamed from: m */
    public static wj2 f10317m;

    /* JADX INFO: renamed from: n */
    public static dq1 f10318n;

    /* JADX INFO: renamed from: o */
    public static C0356jn f10319o;

    /* JADX INFO: renamed from: p */
    public static C0291hv f10320p;

    /* JADX INFO: renamed from: q */
    public static final LinkedHashMap f10321q;

    /* JADX INFO: renamed from: r */
    public static final LinkedHashMap f10322r;

    /* JADX INFO: renamed from: s */
    public static final C0021ak f10323s;

    static {
        mw2 mw2Var = new mw2(null);
        c60 c60Var = o90.f7590a;
        f10306b = AbstractC0731te.m5206e(xe1.m6120f0(mw2Var, t50.f10560j));
        f10307c = new kl1();
        ju2 ju2VarM3908f = pp0.m3908f(new tq1(be0.f819h, false, null));
        f10308d = ju2VarM3908f;
        f10309e = new m52(ju2VarM3908f, null);
        f10321q = new LinkedHashMap();
        f10322r = new LinkedHashMap();
        f10323s = new C0021ak(262144);
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0067, code lost:
    
        r0 = r8;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x00d4 -> B:23:0x0067). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m4974a(C0291hv c0291hv, InterfaceC0212fq interfaceC0212fq, u00 u00Var) throws Throwable {
        iq1 iq1Var;
        C0319in it;
        C0291hv c0291hv2;
        Exception exc;
        ci2 ci2Var;
        C0043b5 c0043b5;
        C0291hv c0291hv3;
        Object objM2373b;
        if (u00Var instanceof iq1) {
            iq1Var = (iq1) u00Var;
            int i = iq1Var.f4748o;
            if ((i & Integer.MIN_VALUE) != 0) {
                iq1Var.f4748o = i - Integer.MIN_VALUE;
            } else {
                iq1Var = new iq1(u00Var);
            }
        }
        Object obj = iq1Var.f4747n;
        int i2 = iq1Var.f4748o;
        t00 t00Var = null;
        k20 k20Var = k20.f5323h;
        if (i2 == 0) {
            fg1.m1627T(obj);
            it = interfaceC0212fq.iterator();
            c0291hv2 = c0291hv;
        } else if (i2 == 1) {
            it = iq1Var.f4745l;
            c0291hv3 = iq1Var.f4744k;
            fg1.m1627T(obj);
            if (((Boolean) obj).booleanValue()) {
                return a83.f116a;
            }
            ci2 ci2Var2 = (ci2) it.m2374c();
            iq1Var.f4744k = c0291hv3;
            iq1Var.f4745l = it;
            iq1Var.f4746m = ci2Var2;
            iq1Var.f4748o = 2;
            if (c0291hv3.m2232g0(iq1Var) == k20Var) {
                return k20Var;
            }
            ci2Var = ci2Var2;
            pp1 pp1Var = pp1.f8445a;
            if (pp1.m3934f()) {
            }
        } else if (i2 == 2) {
            ci2 ci2Var3 = iq1Var.f4746m;
            C0319in c0319in = iq1Var.f4745l;
            C0291hv c0291hv4 = iq1Var.f4744k;
            fg1.m1627T(obj);
            ci2Var = ci2Var3;
            it = c0319in;
            c0291hv3 = c0291hv4;
            pp1 pp1Var2 = pp1.f8445a;
            if (pp1.m3934f()) {
                try {
                } catch (Exception e) {
                    exc = e;
                    c0291hv2 = c0291hv3;
                    c0043b5 = f10312h;
                    if (c0043b5 != null) {
                        t11.m5067S("scriptLogger");
                        throw null;
                    }
                    C0043b5.m409x(c0043b5, ph2.f8354k, vi0.m5691j("Message dispatch failed for event ", ci2Var.f1572a, "."), null, exc, 24);
                    iq1Var.f4744k = c0291hv2;
                    iq1Var.f4745l = it;
                    iq1Var.f4746m = null;
                    iq1Var.f4748o = 1;
                    objM2373b = it.m2373b(iq1Var);
                    if (objM2373b != k20Var) {
                    }
                }
                dq1 dq1Var = f10318n;
                if (dq1Var == null) {
                    t11.m5067S("messageRouter");
                    throw null;
                }
                iq1Var.f4744k = c0291hv3;
                iq1Var.f4745l = it;
                iq1Var.f4746m = ci2Var;
                iq1Var.f4748o = 3;
                C0040b2 c0040b2 = new C0040b2(dq1Var, ci2Var, t00Var, 13);
                lw2 lw2Var = new lw2(iq1Var, iq1Var.mo2508f());
                if (ze3.m6410b(lw2Var, true, lw2Var, c0040b2) == k20Var) {
                    return k20Var;
                }
                c0291hv2 = c0291hv3;
                throw e;
            }
            c0291hv2 = c0291hv3;
        } else {
            if (i2 != 3) {
                C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ci2 ci2Var4 = iq1Var.f4746m;
            C0319in c0319in2 = iq1Var.f4745l;
            C0291hv c0291hv5 = iq1Var.f4744k;
            try {
                try {
                    fg1.m1627T(obj);
                    it = c0319in2;
                    c0291hv2 = c0291hv5;
                } catch (CancellationException e2) {
                    throw e2;
                }
            } catch (Exception e3) {
                exc = e3;
                c0291hv2 = c0291hv5;
                ci2Var = ci2Var4;
                it = c0319in2;
                c0043b5 = f10312h;
                if (c0043b5 != null) {
                }
            }
        }
        iq1Var.f4744k = c0291hv2;
        iq1Var.f4745l = it;
        iq1Var.f4746m = null;
        iq1Var.f4748o = 1;
        objM2373b = it.m2373b(iq1Var);
        if (objM2373b != k20Var) {
            return k20Var;
        }
        c0291hv3 = c0291hv2;
        obj = objM2373b;
        if (((Boolean) obj).booleanValue()) {
        }
    }

    /* JADX INFO: renamed from: b */
    public static ArrayList m4975b(th2 th2Var) {
        pb1 pb1VarM4493b = th2Var.f10782k.m4493b();
        ArrayList arrayList = new ArrayList(AbstractC0179eu.m1421B(pb1VarM4493b, 10));
        ListIterator listIterator = pb1VarM4493b.listIterator(0);
        while (true) {
            vs0 vs0Var = (vs0) listIterator;
            if (!vs0Var.hasNext()) {
                return arrayList;
            }
            ff2 ff2Var = (ff2) vs0Var.next();
            ef2 ef2Var = ff2Var.f2951a;
            arrayList.add(new gq1(ef2Var.f2431h, m4977g(ef2Var), ff2Var.f2952b));
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m4976f() {
        C0291hv c0291hv = f10320p;
        if (c0291hv == null) {
            t11.m5067S("messageDispatchReady");
            throw null;
        }
        if (r21.f9330h.get(c0291hv) instanceof cy0) {
            c0291hv.m4317T(a83.f116a);
        }
    }

    /* JADX INFO: renamed from: g */
    public static String m4977g(ef2 ef2Var) {
        int iOrdinal = ef2Var.ordinal();
        if (iOrdinal == 0) {
            return m4978o(R.string.script_permission_network, new Object[0]);
        }
        if (iOrdinal == 1) {
            return m4978o(R.string.script_permission_external_storage, new Object[0]);
        }
        if (iOrdinal == 2) {
            return m4978o(R.string.script_permission_host_reflection, new Object[0]);
        }
        if (iOrdinal == 3) {
            return m4978o(R.string.script_permission_host_hook, new Object[0]);
        }
        if (iOrdinal == 4) {
            return m4978o(R.string.script_permission_host_filesystem, new Object[0]);
        }
        c80.m675s();
        return null;
    }

    /* JADX INFO: renamed from: o */
    public static String m4978o(int i, Object... objArr) {
        Resources resources = f10311g;
        if (resources == null) {
            C0676s.m4653l("NukeScriptService has not been initialized");
            return null;
        }
        String string = resources.getString(i, Arrays.copyOf(objArr, objArr.length));
        string.getClass();
        return string;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m4979c(String str, u00 u00Var) throws Throwable {
        jq1 jq1Var;
        il1 il1Var;
        il1 il1Var2;
        Throwable th;
        if (u00Var instanceof jq1) {
            jq1Var = (jq1) u00Var;
            int i = jq1Var.f5161o;
            if ((i & Integer.MIN_VALUE) != 0) {
                jq1Var.f5161o = i - Integer.MIN_VALUE;
            } else {
                jq1Var = new jq1(this, u00Var);
            }
        }
        Object obj = jq1Var.f5159m;
        k20 k20Var = k20.f5323h;
        int i2 = jq1Var.f5161o;
        try {
            if (i2 == 0) {
                fg1.m1627T(obj);
                kl1 kl1Var = f10307c;
                jq1Var.f5157k = str;
                jq1Var.f5158l = kl1Var;
                jq1Var.f5161o = 1;
                Object objM2720d = kl1Var.m2720d(jq1Var);
                il1Var = kl1Var;
                if (objM2720d != k20Var) {
                }
                return k20Var;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                il1Var2 = jq1Var.f5158l;
                try {
                    fg1.m1627T(obj);
                    il1Var2 = il1Var2;
                    a83 a83Var = a83.f116a;
                    ((kl1) il1Var2).m2722f(null);
                    return a83Var;
                } catch (Throwable th2) {
                    th = th2;
                    ((kl1) il1Var2).m2722f(null);
                    throw th;
                }
            }
            il1 il1Var3 = jq1Var.f5158l;
            String str2 = jq1Var.f5157k;
            fg1.m1627T(obj);
            il1Var = il1Var3;
            str = str2;
            z80 z80Var = (z80) f10321q.get(str);
            if (z80Var == null) {
                throw new IllegalArgumentException("Script '" + str + "' is not available.");
            }
            kj1 kj1Var = f10315k;
            if (kj1Var == null) {
                t11.m5067S("permissionStore");
                throw null;
            }
            th2 th2Var = z80Var.f13783b;
            th2Var.getClass();
            synchronized (kj1Var.f5595j) {
                Map mapM2700D = kj1Var.m2700D();
                mapM2700D.put(th2Var.f10774c, rp0.m4541b0(th2Var));
                kj1Var.m2702F(mapM2700D);
            }
            sq1 sq1Var = f10305a;
            jq1Var.f5157k = null;
            jq1Var.f5158l = il1Var;
            jq1Var.f5161o = 2;
            if (sq1Var.m4983i(jq1Var) != k20Var) {
                il1Var2 = il1Var;
                a83 a83Var2 = a83.f116a;
                ((kl1) il1Var2).m2722f(null);
                return a83Var2;
            }
            return k20Var;
        } catch (Throwable th3) {
            il1Var2 = il1Var;
            th = th3;
            ((kl1) il1Var2).m2722f(null);
            throw th;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m4980d(Context context) {
        File fileM5901g0;
        Object x92Var;
        String str;
        context.getClass();
        f10311g = context.getResources();
        if (f10310f) {
            return;
        }
        synchronized (this) {
            try {
                if (f10310f) {
                    return;
                }
                Context applicationContext = context.getApplicationContext();
                Context context2 = applicationContext == null ? context : applicationContext;
                t00 t00Var = null;
                File externalFilesDir = context2.getExternalFilesDir(null);
                if (externalFilesDir != null) {
                    fileM5901g0 = wi0.m5901g0(externalFilesDir, "nuke/scripts");
                } else {
                    File filesDir = context2.getFilesDir();
                    filesDir.getClass();
                    fileM5901g0 = wi0.m5901g0(filesDir, "nuke/scripts");
                }
                fileM5901g0.mkdirs();
                File filesDir2 = context2.getFilesDir();
                filesDir2.getClass();
                File fileM5901g02 = wi0.m5901g0(filesDir2, "nuke/script-config");
                File filesDir3 = context2.getFilesDir();
                filesDir3.getClass();
                File fileM5901g03 = wi0.m5901g0(filesDir3, "nuke/script-storage");
                File fileM5901g04 = externalFilesDir != null ? wi0.m5901g0(externalFilesDir, "nuke/script-external") : null;
                f10314j = new C0043b5(fileM5901g02);
                File filesDir4 = context2.getFilesDir();
                filesDir4.getClass();
                f10315k = new kj1(wi0.m5901g0(filesDir4, "nuke/script-permissions.json"), 11);
                File filesDir5 = context2.getFilesDir();
                filesDir5.getClass();
                f10316l = new kj1(wi0.m5901g0(filesDir5, "nuke/script-enabled.json"), 9);
                C0043b5 c0043b5 = new C0043b5(null, 15);
                f10312h = c0043b5;
                try {
                    str = up0.f11405m;
                } catch (Throwable th) {
                    x92Var = new x92(th);
                }
                if (str == null) {
                    t11.m5067S("hostProcess");
                    throw null;
                }
                x92Var = Boolean.valueOf(str.equals("com.tencent.mm"));
                Object obj = Boolean.FALSE;
                if (x92Var instanceof x92) {
                    x92Var = obj;
                }
                hi2 kj1Var = ((Boolean) x92Var).booleanValue() ? new kj1(10) : gi2.f3537a;
                hq1 hq1Var = new hq1(new C0330iz(4, fileM5901g03.getAbsoluteFile()), fileM5901g04);
                C0043b5 c0043b52 = f10314j;
                if (c0043b52 == null) {
                    t11.m5067S("configStore");
                    throw null;
                }
                ar1 ar1Var = ar1.f359h;
                kj1 kj1Var2 = f10315k;
                if (kj1Var2 == null) {
                    t11.m5067S("permissionStore");
                    throw null;
                }
                hh1 hh1Var = new hh1(kj1Var2);
                kj1 kj1Var3 = f10315k;
                if (kj1Var3 == null) {
                    t11.m5067S("permissionStore");
                    throw null;
                }
                sz0 sz0Var = new sz0(kj1Var3);
                kj1 kj1Var4 = f10315k;
                if (kj1Var4 == null) {
                    t11.m5067S("permissionStore");
                    throw null;
                }
                ClassLoader classLoader = context2.getClassLoader();
                classLoader.getClass();
                wj2 wj2Var = new wj2(new kj1(new df2(c0043b5, hh1Var, hq1Var, c0043b52, kj1Var, sz0Var, new C0043b5(kj1Var4, classLoader, context2), 513), 5), c0043b5);
                f10317m = wj2Var;
                f10318n = new dq1(0, wj2Var, c0043b5);
                f10319o = fg1.m1630a(AIChatConfig.DefaultMaxTokens, 6, null);
                C0291hv c0291hv = new C0291hv(true);
                c0291hv.m4315Q(null);
                f10320p = c0291hv;
                s00 s00Var = f10306b;
                int i = 2;
                AbstractC0570p7.m3745A(s00Var, null, new lk0(i, t00Var, 1), 3);
                f10313i = new wi2(fileM5901g0, null, 6);
                f10310f = true;
                if (f10310f) {
                    AbstractC0570p7.m3745A(s00Var, null, new lk0(i, t00Var, i), 3);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m4981e(String str, u00 u00Var) throws Throwable {
        kq1 kq1Var;
        z80 z80Var;
        lf2 lf2Var;
        if (u00Var instanceof kq1) {
            kq1Var = (kq1) u00Var;
            int i = kq1Var.f5717p;
            if ((i & Integer.MIN_VALUE) != 0) {
                kq1Var.f5717p = i - Integer.MIN_VALUE;
            } else {
                kq1Var = new kq1(this, u00Var);
            }
        }
        Object obj = kq1Var.f5715n;
        int i2 = kq1Var.f5717p;
        k20 k20Var = k20.f5323h;
        if (i2 == 0) {
            fg1.m1627T(obj);
            z80 z80Var2 = (z80) f10321q.get(str);
            if (z80Var2 == null) {
                C0676s.m4651j(vi0.m5691j("Script '", str, "' is not available."));
                return null;
            }
            File file = z80Var2.f13782a;
            c60 c60Var = o90.f7590a;
            sz0 sz0Var = new sz0(file, t50.f10560j);
            th2 th2Var = z80Var2.f13783b;
            kq1Var.f5712k = str;
            kq1Var.f5713l = z80Var2;
            kq1Var.f5717p = 1;
            Object objM174a = f10323s.m174a(sz0Var, th2Var, kq1Var);
            if (objM174a != k20Var) {
                z80Var = z80Var2;
                obj = objM174a;
            }
            return k20Var;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            lf2Var = kq1Var.f5714m;
            z80Var = kq1Var.f5713l;
            fg1.m1627T(obj);
            return new uq1(z80Var.f13783b, lf2Var, up0.m5526E(lf2Var, (d41) obj));
        }
        z80 z80Var3 = kq1Var.f5713l;
        String str2 = kq1Var.f5712k;
        fg1.m1627T(obj);
        z80Var = z80Var3;
        str = str2;
        lf2 lf2Var2 = (lf2) obj;
        if (lf2Var2 == null) {
            C0676s.m4651j(vi0.m5691j("Script '", str, "' does not define a config schema."));
            return null;
        }
        C0043b5 c0043b5 = f10314j;
        if (c0043b5 == null) {
            t11.m5067S("configStore");
            throw null;
        }
        kq1Var.f5712k = null;
        kq1Var.f5713l = z80Var;
        kq1Var.f5714m = lf2Var2;
        kq1Var.f5717p = 2;
        Object objMo420g = c0043b5.mo420g(str, kq1Var);
        if (objMo420g != k20Var) {
            lf2Var = lf2Var2;
            obj = objMo420g;
            return new uq1(z80Var.f13783b, lf2Var, up0.m5526E(lf2Var, (d41) obj));
        }
        return k20Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0056, code lost:
    
        if (r5.m4983i(r0) == r4) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v1, types: [int] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m4982h(u00 u00Var) {
        lq1 lq1Var;
        il1 il1Var;
        if (u00Var instanceof lq1) {
            lq1Var = (lq1) u00Var;
            int i = lq1Var.f6252n;
            if ((i & Integer.MIN_VALUE) != 0) {
                lq1Var.f6252n = i - Integer.MIN_VALUE;
            } else {
                lq1Var = new lq1(this, u00Var);
            }
        }
        Object obj = lq1Var.f6250l;
        ?? r6 = lq1Var.f6252n;
        k20 k20Var = k20.f5323h;
        try {
            if (r6 == 0) {
                fg1.m1627T(obj);
                kl1 kl1Var = f10307c;
                lq1Var.f6249k = kl1Var;
                lq1Var.f6252n = 1;
                if (kl1Var.m2720d(lq1Var) != k20Var) {
                    il1Var = kl1Var;
                }
                return k20Var;
            }
            if (r6 != 1) {
                if (r6 != 2) {
                    C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                il1 il1Var2 = lq1Var.f6249k;
                fg1.m1627T(obj);
                r6 = il1Var2;
                return a83.f116a;
            }
            il1 il1Var3 = lq1Var.f6249k;
            fg1.m1627T(obj);
            il1Var = il1Var3;
            sq1 sq1Var = f10305a;
            lq1Var.f6249k = il1Var;
            lq1Var.f6252n = 2;
            r6 = il1Var;
        } finally {
            ((kl1) r6).m2722f(null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x016d, code lost:
    
        if (r1 == r12) goto L65;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0338 A[Catch: Exception -> 0x00b8, CancellationException -> 0x0368, all -> 0x036a, TRY_ENTER, TryCatch #0 {Exception -> 0x00b8, blocks: (B:66:0x0170, B:67:0x0185, B:69:0x018b, B:70:0x0199, B:71:0x01aa, B:73:0x01b0, B:75:0x01c3, B:76:0x01cb, B:77:0x01d1, B:78:0x01de, B:80:0x01e4, B:84:0x0219, B:86:0x0245, B:92:0x0275, B:93:0x028e, B:95:0x0297, B:96:0x02a8, B:98:0x02b4, B:99:0x02c9, B:100:0x02ce, B:88:0x025b, B:90:0x0269, B:101:0x02cf, B:102:0x02da, B:104:0x02e0, B:113:0x0309, B:107:0x02ee, B:108:0x02f2, B:110:0x02f8, B:114:0x030d, B:119:0x0319, B:121:0x032c, B:61:0x015c, B:63:0x0160, B:123:0x0338, B:124:0x033d, B:36:0x00ad, B:40:0x00bd, B:41:0x00c7, B:42:0x00d6, B:44:0x00dc, B:46:0x00ee, B:47:0x00fa, B:48:0x010c, B:50:0x0112, B:52:0x0127, B:53:0x012b, B:54:0x012f, B:56:0x0135, B:57:0x0147, B:125:0x033e, B:126:0x0345), top: B:139:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0352 A[Catch: all -> 0x036a, TryCatch #2 {all -> 0x036a, blocks: (B:14:0x003b, B:66:0x0170, B:67:0x0185, B:69:0x018b, B:70:0x0199, B:71:0x01aa, B:73:0x01b0, B:75:0x01c3, B:76:0x01cb, B:77:0x01d1, B:78:0x01de, B:80:0x01e4, B:84:0x0219, B:86:0x0245, B:92:0x0275, B:93:0x028e, B:95:0x0297, B:96:0x02a8, B:98:0x02b4, B:99:0x02c9, B:100:0x02ce, B:88:0x025b, B:90:0x0269, B:101:0x02cf, B:102:0x02da, B:104:0x02e0, B:113:0x0309, B:107:0x02ee, B:108:0x02f2, B:110:0x02f8, B:114:0x030d, B:119:0x0319, B:121:0x032c, B:127:0x0346, B:129:0x0352, B:130:0x035b, B:135:0x0369, B:21:0x0053, B:61:0x015c, B:63:0x0160, B:123:0x0338, B:124:0x033d, B:22:0x005a, B:30:0x0083, B:31:0x0090, B:33:0x0096, B:36:0x00ad, B:40:0x00bd, B:41:0x00c7, B:42:0x00d6, B:44:0x00dc, B:46:0x00ee, B:47:0x00fa, B:48:0x010c, B:50:0x0112, B:52:0x0127, B:53:0x012b, B:54:0x012f, B:56:0x0135, B:57:0x0147, B:25:0x006e, B:27:0x0072, B:125:0x033e, B:126:0x0345), top: B:139:0x002d, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02c9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0160 A[Catch: Exception -> 0x00b8, CancellationException -> 0x0368, all -> 0x036a, TryCatch #0 {Exception -> 0x00b8, blocks: (B:66:0x0170, B:67:0x0185, B:69:0x018b, B:70:0x0199, B:71:0x01aa, B:73:0x01b0, B:75:0x01c3, B:76:0x01cb, B:77:0x01d1, B:78:0x01de, B:80:0x01e4, B:84:0x0219, B:86:0x0245, B:92:0x0275, B:93:0x028e, B:95:0x0297, B:96:0x02a8, B:98:0x02b4, B:99:0x02c9, B:100:0x02ce, B:88:0x025b, B:90:0x0269, B:101:0x02cf, B:102:0x02da, B:104:0x02e0, B:113:0x0309, B:107:0x02ee, B:108:0x02f2, B:110:0x02f8, B:114:0x030d, B:119:0x0319, B:121:0x032c, B:61:0x015c, B:63:0x0160, B:123:0x0338, B:124:0x033d, B:36:0x00ad, B:40:0x00bd, B:41:0x00c7, B:42:0x00d6, B:44:0x00dc, B:46:0x00ee, B:47:0x00fa, B:48:0x010c, B:50:0x0112, B:52:0x0127, B:53:0x012b, B:54:0x012f, B:56:0x0135, B:57:0x0147, B:125:0x033e, B:126:0x0345), top: B:139:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0297 A[Catch: Exception -> 0x00b8, CancellationException -> 0x0368, all -> 0x036a, LOOP:3: B:93:0x028e->B:95:0x0297, LOOP_END, TryCatch #0 {Exception -> 0x00b8, blocks: (B:66:0x0170, B:67:0x0185, B:69:0x018b, B:70:0x0199, B:71:0x01aa, B:73:0x01b0, B:75:0x01c3, B:76:0x01cb, B:77:0x01d1, B:78:0x01de, B:80:0x01e4, B:84:0x0219, B:86:0x0245, B:92:0x0275, B:93:0x028e, B:95:0x0297, B:96:0x02a8, B:98:0x02b4, B:99:0x02c9, B:100:0x02ce, B:88:0x025b, B:90:0x0269, B:101:0x02cf, B:102:0x02da, B:104:0x02e0, B:113:0x0309, B:107:0x02ee, B:108:0x02f2, B:110:0x02f8, B:114:0x030d, B:119:0x0319, B:121:0x032c, B:61:0x015c, B:63:0x0160, B:123:0x0338, B:124:0x033d, B:36:0x00ad, B:40:0x00bd, B:41:0x00c7, B:42:0x00d6, B:44:0x00dc, B:46:0x00ee, B:47:0x00fa, B:48:0x010c, B:50:0x0112, B:52:0x0127, B:53:0x012b, B:54:0x012f, B:56:0x0135, B:57:0x0147, B:125:0x033e, B:126:0x0345), top: B:139:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02b4 A[Catch: Exception -> 0x00b8, CancellationException -> 0x0368, all -> 0x036a, LOOP:2: B:78:0x01de->B:98:0x02b4, LOOP_END, TryCatch #0 {Exception -> 0x00b8, blocks: (B:66:0x0170, B:67:0x0185, B:69:0x018b, B:70:0x0199, B:71:0x01aa, B:73:0x01b0, B:75:0x01c3, B:76:0x01cb, B:77:0x01d1, B:78:0x01de, B:80:0x01e4, B:84:0x0219, B:86:0x0245, B:92:0x0275, B:93:0x028e, B:95:0x0297, B:96:0x02a8, B:98:0x02b4, B:99:0x02c9, B:100:0x02ce, B:88:0x025b, B:90:0x0269, B:101:0x02cf, B:102:0x02da, B:104:0x02e0, B:113:0x0309, B:107:0x02ee, B:108:0x02f2, B:110:0x02f8, B:114:0x030d, B:119:0x0319, B:121:0x032c, B:61:0x015c, B:63:0x0160, B:123:0x0338, B:124:0x033d, B:36:0x00ad, B:40:0x00bd, B:41:0x00c7, B:42:0x00d6, B:44:0x00dc, B:46:0x00ee, B:47:0x00fa, B:48:0x010c, B:50:0x0112, B:52:0x0127, B:53:0x012b, B:54:0x012f, B:56:0x0135, B:57:0x0147, B:125:0x033e, B:126:0x0345), top: B:139:0x002d }] */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r22v0 */
    /* JADX WARN: Type inference failed for: r22v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r22v2 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r30v0, types: [sq1] */
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m4983i(u00 u00Var) {
        mq1 mq1Var;
        String message;
        Throwable th;
        xi2 xi2Var;
        Set set;
        Throwable th2;
        wj2 wj2Var;
        ?? r22;
        String strM4978o;
        Iterator it;
        kj1 kj1Var;
        LinkedHashMap linkedHashMap = f10321q;
        if (u00Var instanceof mq1) {
            mq1Var = (mq1) u00Var;
            int i = mq1Var.f6770o;
            if ((i & Integer.MIN_VALUE) != 0) {
                mq1Var.f6770o = i - Integer.MIN_VALUE;
            } else {
                mq1Var = new mq1(this, u00Var);
            }
        }
        Object objM3762R = mq1Var.f6768m;
        int i2 = mq1Var.f6770o;
        LinkedHashMap linkedHashMap2 = f10322r;
        int i3 = 3;
        ju2 ju2Var = f10308d;
        Throwable th3 = null;
        k20 k20Var = k20.f5323h;
        try {
            try {
                try {
                    try {
                    } catch (Exception e) {
                        e = e;
                        tq1 tq1Var = (tq1) ju2Var.getValue();
                        message = e.getMessage();
                        if (message == null) {
                            message = m4978o(R.string.script_settings_directory_read_failed, new Object[0]);
                        }
                        ju2Var.m2575g(tq1.m5377a(tq1Var, u00Var, false, message, 1));
                        return a83.f116a;
                    }
                } catch (CancellationException e2) {
                    throw e2;
                }
            } finally {
                m4976f();
            }
        } catch (Exception e3) {
            e = e3;
            u00Var = null;
            tq1 tq1Var2 = (tq1) ju2Var.getValue();
            message = e.getMessage();
            if (message == null) {
            }
            ju2Var.m2575g(tq1.m5377a(tq1Var2, u00Var, false, message, 1));
            return a83.f116a;
        }
        if (i2 == 0) {
            fg1.m1627T(objM3762R);
            ju2Var.m2575g(tq1.m5377a((tq1) ju2Var.getValue(), null, true, null, 1));
            wi2 wi2Var = f10313i;
            if (wi2Var == null) {
                t11.m5067S("repository");
                throw null;
            }
            mq1Var.f6770o = 1;
            objM3762R = AbstractC0570p7.m3762R(wi2Var.f12520b, new vi2(wi2Var, null), mq1Var);
            if (objM3762R == k20Var) {
            }
            return k20Var;
        }
        if (i2 == 1) {
            fg1.m1627T(objM3762R);
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                set = mq1Var.f6767l;
                xi2Var = mq1Var.f6766k;
                fg1.m1627T(objM3762R);
                th = null;
                List listM6286a = ((yj2) objM3762R).m6286a();
                ArrayList arrayList = new ArrayList(AbstractC0179eu.m1421B(listM6286a, 10));
                Iterator it2 = listM6286a.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((me1) it2.next()).m3066a());
                }
                Set setM1153K0 = AbstractC0142du.m1153K0(arrayList);
                List list = xi2Var.f13047b;
                List<z80> list2 = xi2Var.f13046a;
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (Object obj : list) {
                    String absolutePath = ((zf2) obj).f13876a.getAbsolutePath();
                    Object arrayList2 = linkedHashMap3.get(absolutePath);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        linkedHashMap3.put(absolutePath, arrayList2);
                    }
                    ((List) arrayList2).add(obj);
                }
                ArrayList arrayList3 = new ArrayList(AbstractC0179eu.m1421B(list2, 10));
                for (z80 z80Var : list2) {
                    String strM5265c = z80Var.m6400a().m5265c();
                    String strM5266d = z80Var.m6400a().m5266d();
                    String strM5268f = z80Var.m6400a().m5268f();
                    String strM5264b = z80Var.m6400a().m5264b();
                    boolean z = z80Var.m6400a().m5263a() != null;
                    boolean zContains = setM1153K0.contains(z80Var.m6400a().m5265c());
                    String str = (String) linkedHashMap2.get(z80Var.m6400a().m5265c());
                    List list3 = (List) linkedHashMap3.get(z80Var.f13782a.getAbsolutePath());
                    if (list3 != null) {
                        strM4978o = AbstractC0142du.m1165u0(list3, "\n", null, null, new eq1(i3), 30);
                    } else if (set.contains(z80Var.m6400a().m5265c())) {
                        strM4978o = m4978o(R.string.script_settings_duplicate_id, new Object[0]);
                    } else {
                        r22 = th;
                        jp2 jp2VarM4494c = z80Var.m6400a().m5267e().m4494c();
                        ArrayList arrayList4 = new ArrayList(AbstractC0179eu.m1421B(jp2VarM4494c, 10));
                        it = jp2VarM4494c.iterator();
                        while (((ne1) it).hasNext()) {
                            arrayList4.add(m4977g((ef2) ((ne1) it).next()));
                        }
                        ArrayList arrayListM4975b = m4975b(z80Var.m6400a());
                        kj1Var = f10315k;
                        if (kj1Var != null) {
                            t11.m5067S("permissionStore");
                            throw th;
                        }
                        arrayList3.add(new cq1(strM5265c, strM5266d, strM5268f, strM5264b, z, zContains, r22, str, arrayList4, arrayListM4975b, kj1Var.m2699C(z80Var.m6400a())));
                        i3 = 3;
                    }
                    r22 = strM4978o;
                    jp2 jp2VarM4494c2 = z80Var.m6400a().m5267e().m4494c();
                    ArrayList arrayList42 = new ArrayList(AbstractC0179eu.m1421B(jp2VarM4494c2, 10));
                    it = jp2VarM4494c2.iterator();
                    while (((ne1) it).hasNext()) {
                    }
                    ArrayList arrayListM4975b2 = m4975b(z80Var.m6400a());
                    kj1Var = f10315k;
                    if (kj1Var != null) {
                    }
                }
                List list4 = xi2Var.f13047b;
                ArrayList arrayList5 = new ArrayList();
                for (Object obj2 : list4) {
                    zf2 zf2Var = (zf2) obj2;
                    if (!list2.isEmpty()) {
                        Iterator it3 = list2.iterator();
                        while (it3.hasNext()) {
                            if (t11.m5086l(((z80) it3.next()).f13782a, zf2Var.f13876a)) {
                                break;
                            }
                        }
                    }
                    arrayList5.add(obj2);
                }
                ?? r11 = !arrayList5.isEmpty() ? arrayList5 : th;
                ju2Var.m2575g(new tq1(arrayList3, false, r11 != 0 ? AbstractC0142du.m1165u0(r11, "\n", null, null, new eq1(4), 30) : th));
                return a83.f116a;
            }
            set = mq1Var.f6767l;
            xi2Var = mq1Var.f6766k;
            fg1.m1627T(objM3762R);
            th = null;
            wj2Var = f10317m;
            if (wj2Var != null) {
                t11.m5067S("runtimeManager");
                throw th;
            }
            mq1Var.f6766k = xi2Var;
            mq1Var.f6767l = set;
            mq1Var.f6770o = 3;
            objM3762R = wj2Var.m5933k(mq1Var);
        }
        xi2 xi2Var2 = (xi2) objM3762R;
        List list5 = xi2Var2.f13046a;
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        for (Object obj3 : list5) {
            String strM5265c2 = ((z80) obj3).m6400a().m5265c();
            Object obj4 = linkedHashMap4.get(strM5265c2);
            if (obj4 == null) {
                th2 = th3;
                ArrayList arrayList6 = new ArrayList();
                linkedHashMap4.put(strM5265c2, arrayList6);
                obj4 = arrayList6;
            } else {
                th2 = th3;
            }
            ((List) obj4).add(obj3);
            th3 = th2;
        }
        th = th3;
        LinkedHashMap linkedHashMap5 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap4.entrySet()) {
            if (((List) entry.getValue()).size() > 1) {
                linkedHashMap5.put(entry.getKey(), entry.getValue());
            }
        }
        Set setKeySet = linkedHashMap5.keySet();
        linkedHashMap.clear();
        List list6 = xi2Var2.f13046a;
        ArrayList<z80> arrayList7 = new ArrayList();
        for (Object obj5 : list6) {
            if (!setKeySet.contains(((z80) obj5).m6400a().m5265c())) {
                arrayList7.add(obj5);
            }
        }
        for (z80 z80Var2 : arrayList7) {
            linkedHashMap.put(z80Var2.m6400a().m5265c(), z80Var2);
        }
        linkedHashMap2.clear();
        mq1Var.f6766k = xi2Var2;
        mq1Var.f6767l = setKeySet;
        mq1Var.f6770o = 2;
        if (m4985k(mq1Var) == k20Var) {
            return k20Var;
        }
        xi2Var = xi2Var2;
        set = setKeySet;
        wj2Var = f10317m;
        if (wj2Var != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m4984j(u00 u00Var) {
        nq1 nq1Var;
        if (u00Var instanceof nq1) {
            nq1Var = (nq1) u00Var;
            int i = nq1Var.f7283m;
            if ((i & Integer.MIN_VALUE) != 0) {
                nq1Var.f7283m = i - Integer.MIN_VALUE;
            } else {
                nq1Var = new nq1(this, u00Var);
            }
        }
        Object objM5933k = nq1Var.f7281k;
        int i2 = nq1Var.f7283m;
        if (i2 == 0) {
            fg1.m1627T(objM5933k);
            wj2 wj2Var = f10317m;
            if (wj2Var == null) {
                t11.m5067S("runtimeManager");
                throw null;
            }
            nq1Var.f7283m = 1;
            objM5933k = wj2Var.m5933k(nq1Var);
            k20 k20Var = k20.f5323h;
            if (objM5933k == k20Var) {
                return k20Var;
            }
        } else {
            if (i2 != 1) {
                C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fg1.m1627T(objM5933k);
        }
        List list = ((yj2) objM5933k).f13492a;
        ArrayList arrayList = new ArrayList(AbstractC0179eu.m1421B(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((me1) it.next()).f6584a);
        }
        Set setM1153K0 = AbstractC0142du.m1153K0(arrayList);
        ju2 ju2Var = f10308d;
        tq1 tq1Var = (tq1) ju2Var.getValue();
        List<cq1> list2 = ((tq1) ju2Var.getValue()).f10899a;
        ArrayList arrayList2 = new ArrayList(AbstractC0179eu.m1421B(list2, 10));
        for (cq1 cq1Var : list2) {
            String str = cq1Var.f1675a;
            boolean zContains = setM1153K0.contains(str);
            String str2 = (String) f10322r.get(str);
            String str3 = cq1Var.f1676b;
            String str4 = cq1Var.f1677c;
            String str5 = cq1Var.f1678d;
            boolean z = cq1Var.f1679e;
            String str6 = cq1Var.f1681g;
            List list3 = cq1Var.f1683i;
            List list4 = cq1Var.f1684j;
            boolean z2 = cq1Var.f1685k;
            str.getClass();
            str3.getClass();
            str4.getClass();
            arrayList2.add(new cq1(str, str3, str4, str5, z, zContains, str6, str2, list3, list4, z2));
        }
        ju2Var.m2576h(null, tq1.m5377a(tq1Var, arrayList2, false, null, 6));
        return a83.f116a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0062, code lost:
    
        if (r12 == r1) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00ea, code lost:
    
        if (r0.m5934l(r12, r11) == r1) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00ec, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x00ea -> B:57:0x00ed). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x010b -> B:41:0x00ad). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m4985k(u00 u00Var) {
        oq1 oq1Var;
        Set setM1153K0;
        Set set;
        Iterator it;
        if (u00Var instanceof oq1) {
            oq1Var = (oq1) u00Var;
            int i = oq1Var.f7795p;
            if ((i & Integer.MIN_VALUE) != 0) {
                oq1Var.f7795p = i - Integer.MIN_VALUE;
            } else {
                oq1Var = new oq1(this, u00Var);
            }
        }
        oq1 oq1Var2 = oq1Var;
        Object objM5933k = oq1Var2.f7793n;
        k20 k20Var = k20.f5323h;
        int i2 = oq1Var2.f7795p;
        if (i2 == 0) {
            fg1.m1627T(objM5933k);
            pp1 pp1Var = pp1.f8445a;
            if (pp1.m3934f()) {
                return a83.f116a;
            }
            wj2 wj2Var = f10317m;
            if (wj2Var == null) {
                t11.m5067S("runtimeManager");
                throw null;
            }
            oq1Var2.f7795p = 1;
            objM5933k = wj2Var.m5933k(oq1Var2);
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                String str = oq1Var2.f7792m;
                it = oq1Var2.f7791l;
                set = oq1Var2.f7790k;
                try {
                    fg1.m1627T(objM5933k);
                } catch (CancellationException e) {
                    throw e;
                } catch (Exception e2) {
                    String str2 = str;
                    Iterator it2 = it;
                    Set set2 = set;
                    f10322r.put(str2, m4978o(R.string.script_settings_auto_start_failed, new Object[0]));
                    C0043b5 c0043b5 = f10312h;
                    if (c0043b5 == null) {
                        t11.m5067S("scriptLogger");
                        throw null;
                    }
                    C0043b5.m409x(c0043b5, ph2.f8354k, vi0.m5691j("Unable to restore enabled script ", str2, "."), str2, e2, 16);
                    it = it2;
                    set = set2;
                    while (it.hasNext()) {
                    }
                    return a83.f116a;
                }
                f10322r.remove(str);
                while (it.hasNext()) {
                    str = (String) it.next();
                    z80 z80Var = (z80) f10321q.get(str);
                    if (z80Var != null) {
                        kj1 kj1Var = f10315k;
                        if (kj1Var == null) {
                            t11.m5067S("permissionStore");
                            throw null;
                        }
                        if (kj1Var.m2699C(z80Var.f13783b)) {
                            if (!set.contains(str)) {
                                wj2 wj2Var2 = f10317m;
                                if (wj2Var2 == null) {
                                    t11.m5067S("runtimeManager");
                                    throw null;
                                }
                                oq1Var2.f7790k = set;
                                oq1Var2.f7791l = it;
                                oq1Var2.f7792m = str;
                                oq1Var2.f7795p = 2;
                            }
                        }
                    }
                    kj1 kj1Var2 = f10316l;
                    if (kj1Var2 == null) {
                        t11.m5067S("enabledStore");
                        throw null;
                    }
                    kj1Var2.m2705J(str, false);
                }
                return a83.f116a;
            }
            fg1.m1627T(objM5933k);
        }
        List list = ((yj2) objM5933k).f13492a;
        ArrayList arrayList = new ArrayList(AbstractC0179eu.m1421B(list, 10));
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            arrayList.add(((me1) it3.next()).f6584a);
        }
        Set setM1153K02 = AbstractC0142du.m1153K0(arrayList);
        kj1 kj1Var3 = f10316l;
        if (kj1Var3 == null) {
            t11.m5067S("enabledStore");
            throw null;
        }
        synchronized (kj1Var3.f5595j) {
            setM1153K0 = AbstractC0142du.m1153K0(kj1Var3.m2701E());
        }
        set = setM1153K02;
        it = AbstractC0142du.m1170z0(setM1153K0).iterator();
        while (it.hasNext()) {
        }
        return a83.f116a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m4986l(String str, u00 u00Var) throws Throwable {
        pq1 pq1Var;
        il1 il1Var;
        il1 il1Var2;
        Throwable th;
        if (u00Var instanceof pq1) {
            pq1Var = (pq1) u00Var;
            int i = pq1Var.f8482o;
            if ((i & Integer.MIN_VALUE) != 0) {
                pq1Var.f8482o = i - Integer.MIN_VALUE;
            } else {
                pq1Var = new pq1(this, u00Var);
            }
        }
        Object obj = pq1Var.f8480m;
        k20 k20Var = k20.f5323h;
        int i2 = pq1Var.f8482o;
        try {
            if (i2 == 0) {
                fg1.m1627T(obj);
                kl1 kl1Var = f10307c;
                pq1Var.f8478k = str;
                pq1Var.f8479l = kl1Var;
                pq1Var.f8482o = 1;
                Object objM2720d = kl1Var.m2720d(pq1Var);
                il1Var = kl1Var;
                if (objM2720d != k20Var) {
                }
                return k20Var;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                il1Var2 = pq1Var.f8479l;
                try {
                    fg1.m1627T(obj);
                    il1Var2 = il1Var2;
                    a83 a83Var = a83.f116a;
                    ((kl1) il1Var2).m2722f(null);
                    return a83Var;
                } catch (Throwable th2) {
                    th = th2;
                    ((kl1) il1Var2).m2722f(null);
                    throw th;
                }
            }
            il1 il1Var3 = pq1Var.f8479l;
            String str2 = pq1Var.f8478k;
            fg1.m1627T(obj);
            il1Var = il1Var3;
            str = str2;
            kj1 kj1Var = f10315k;
            if (kj1Var == null) {
                t11.m5067S("permissionStore");
                throw null;
            }
            str.getClass();
            synchronized (kj1Var.f5595j) {
                Map mapM2700D = kj1Var.m2700D();
                if (mapM2700D.remove(str) != null) {
                    kj1Var.m2702F(mapM2700D);
                }
            }
            sq1 sq1Var = f10305a;
            pq1Var.f8478k = null;
            pq1Var.f8479l = il1Var;
            pq1Var.f8482o = 2;
            if (sq1Var.m4983i(pq1Var) != k20Var) {
                il1Var2 = il1Var;
                a83 a83Var2 = a83.f116a;
                ((kl1) il1Var2).m2722f(null);
                return a83Var2;
            }
            return k20Var;
        } catch (Throwable th3) {
            il1Var2 = il1Var;
            th = th3;
            ((kl1) il1Var2).m2722f(null);
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x01c7, code lost:
    
        if (r4.m4984j(r1) == r6) goto L103;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01d0 A[Catch: all -> 0x0038, TRY_ENTER, TryCatch #2 {all -> 0x0038, blocks: (B:13:0x0033, B:96:0x01a8, B:101:0x01b4, B:23:0x0053, B:27:0x005f, B:68:0x012d, B:70:0x0133, B:106:0x01d0, B:107:0x01d3, B:30:0x0069, B:65:0x011a, B:33:0x0076, B:43:0x00b8, B:46:0x00c8, B:49:0x00cf, B:50:0x00d4, B:51:0x00d5, B:53:0x00e3, B:54:0x00e7, B:56:0x00ef, B:58:0x00f3, B:61:0x0113, B:108:0x01d4, B:109:0x01d9, B:55:0x00ea, B:110:0x01da, B:111:0x01f0), top: B:119:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01da A[Catch: all -> 0x0038, TryCatch #2 {all -> 0x0038, blocks: (B:13:0x0033, B:96:0x01a8, B:101:0x01b4, B:23:0x0053, B:27:0x005f, B:68:0x012d, B:70:0x0133, B:106:0x01d0, B:107:0x01d3, B:30:0x0069, B:65:0x011a, B:33:0x0076, B:43:0x00b8, B:46:0x00c8, B:49:0x00cf, B:50:0x00d4, B:51:0x00d5, B:53:0x00e3, B:54:0x00e7, B:56:0x00ef, B:58:0x00f3, B:61:0x0113, B:108:0x01d4, B:109:0x01d9, B:55:0x00ea, B:110:0x01da, B:111:0x01f0), top: B:119:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0062 A[PHI: r9 r10 r11
  0x0062: PHI (r9v26 java.lang.Object) = (r9v25 java.lang.Object), (r9v1 java.lang.Object) binds: [B:66:0x0129, B:27:0x005f] A[DONT_GENERATE, DONT_INLINE]
  0x0062: PHI (r10v14 java.lang.String) = (r10v12 java.lang.String), (r10v17 java.lang.String) binds: [B:66:0x0129, B:27:0x005f] A[DONT_GENERATE, DONT_INLINE]
  0x0062: PHI (r11v11 il1) = (r11v31 il1), (r11v32 il1) binds: [B:66:0x0129, B:27:0x005f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0133 A[Catch: all -> 0x0038, TRY_LEAVE, TryCatch #2 {all -> 0x0038, blocks: (B:13:0x0033, B:96:0x01a8, B:101:0x01b4, B:23:0x0053, B:27:0x005f, B:68:0x012d, B:70:0x0133, B:106:0x01d0, B:107:0x01d3, B:30:0x0069, B:65:0x011a, B:33:0x0076, B:43:0x00b8, B:46:0x00c8, B:49:0x00cf, B:50:0x00d4, B:51:0x00d5, B:53:0x00e3, B:54:0x00e7, B:56:0x00ef, B:58:0x00f3, B:61:0x0113, B:108:0x01d4, B:109:0x01d9, B:55:0x00ea, B:110:0x01da, B:111:0x01f0), top: B:119:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x015a A[Catch: all -> 0x0173, TryCatch #1 {all -> 0x0173, blocks: (B:74:0x014d, B:86:0x0179, B:88:0x0181, B:90:0x018b, B:92:0x018f, B:98:0x01ad, B:99:0x01b0, B:77:0x015a, B:78:0x015e, B:80:0x0164), top: B:118:0x014d }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0179 A[Catch: all -> 0x0173, TryCatch #1 {all -> 0x0173, blocks: (B:74:0x014d, B:86:0x0179, B:88:0x0181, B:90:0x018b, B:92:0x018f, B:98:0x01ad, B:99:0x01b0, B:77:0x015a, B:78:0x015e, B:80:0x0164), top: B:118:0x014d }] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.LinkedHashMap, java.util.Map] */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v36 */
    /* JADX WARN: Type inference failed for: r11v37 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.LinkedHashMap] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX INFO: renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m4987m(String str, String str2, j31 j31Var, u00 u00Var) throws Throwable {
        qq1 qq1Var;
        ?? r11;
        il1 il1Var;
        Object objM4981e;
        il1 il1Var2;
        String str3;
        j31 j31Var2;
        ?? r12;
        kf2 kf2Var;
        String str4;
        String strM5534M;
        il1 il1Var3;
        il1 il1Var4;
        String str5;
        wj2 wj2Var;
        il1 il1Var5;
        uq1 uq1Var;
        il1 il1Var6;
        List list;
        il1 il1Var7;
        uq1 uq1Var2;
        z80 z80Var;
        uq1 uq1Var3;
        il1 il1Var8;
        int i;
        il1 il1Var9;
        if (u00Var instanceof qq1) {
            qq1Var = (qq1) u00Var;
            int i2 = qq1Var.f9104s;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qq1Var.f9104s = i2 - Integer.MIN_VALUE;
            } else {
                qq1Var = new qq1(this, u00Var);
            }
        }
        Object objM4981e2 = qq1Var.f9102q;
        int i3 = qq1Var.f9104s;
        int i4 = 1;
        sq1 sq1Var = f10305a;
        k20 k20Var = k20.f5323h;
        try {
            switch (i3) {
                case 0:
                    fg1.m1627T(objM4981e2);
                    qq1Var.f9096k = str;
                    qq1Var.f9097l = str2;
                    qq1Var.f9098m = j31Var;
                    kl1 kl1Var = f10307c;
                    qq1Var.f9099n = kl1Var;
                    qq1Var.f9104s = 1;
                    Object objM2720d = kl1Var.m2720d(qq1Var);
                    il1Var = kl1Var;
                    r11 = str2;
                    if (objM2720d != k20Var) {
                        try {
                            qq1Var.f9096k = str;
                            qq1Var.f9097l = r11;
                            qq1Var.f9098m = j31Var;
                            qq1Var.f9099n = il1Var;
                            qq1Var.f9104s = 2;
                            objM4981e = sq1Var.m4981e(str, qq1Var);
                            if (objM4981e != k20Var) {
                                ?? r8 = r11;
                                il1Var2 = il1Var;
                                objM4981e2 = objM4981e;
                                str3 = str;
                                j31Var2 = j31Var;
                                r12 = r8;
                                uq1 uq1Var4 = (uq1) objM4981e2;
                                kf2Var = (kf2) uq1Var4.f11442b.f6099a.get(r12);
                                if (kf2Var != null) {
                                    throw new IllegalArgumentException("Unknown script setting '" + r12 + "'.");
                                }
                                if (j31Var2 != null && (strM5534M = up0.m5534M(kf2Var, j31Var2)) != null) {
                                    throw new IllegalArgumentException(strM5534M);
                                }
                                d41 d41Var = uq1Var4.f11443c.f9544a;
                                d41Var.getClass();
                                ?? linkedHashMap = new LinkedHashMap(d41Var);
                                C0043b5 c0043b5 = f10314j;
                                if (c0043b5 == null) {
                                    t11.m5067S("configStore");
                                    throw null;
                                }
                                d41 d41Var2 = new d41(linkedHashMap);
                                qq1Var.f9096k = str3;
                                qq1Var.f9097l = null;
                                qq1Var.f9098m = null;
                                qq1Var.f9099n = il1Var2;
                                qq1Var.f9104s = 3;
                                Object objM3762R = AbstractC0570p7.m3762R((c20) c0043b5.f562i, new C0756u0(c0043b5, str3, d41Var2, (t00) null), qq1Var);
                                if (objM3762R != k20Var) {
                                    objM3762R = a83.f116a;
                                }
                                if (objM3762R != k20Var) {
                                    str4 = str3;
                                    il1Var3 = il1Var2;
                                    qq1Var.f9096k = str4;
                                    qq1Var.f9097l = null;
                                    qq1Var.f9098m = null;
                                    qq1Var.f9099n = il1Var3;
                                    qq1Var.f9104s = 4;
                                    objM4981e2 = sq1Var.m4981e(str4, qq1Var);
                                    il1Var4 = il1Var3;
                                    if (objM4981e2 == k20Var) {
                                        str5 = str4;
                                        uq1 uq1Var5 = (uq1) objM4981e2;
                                        wj2Var = f10317m;
                                        if (wj2Var != null) {
                                            t11.m5067S("runtimeManager");
                                            throw null;
                                        }
                                        qq1Var.f9096k = str5;
                                        qq1Var.f9097l = null;
                                        qq1Var.f9098m = null;
                                        qq1Var.f9099n = il1Var4;
                                        qq1Var.f9100o = uq1Var5;
                                        qq1Var.f9104s = 5;
                                        Object objM5933k = wj2Var.m5933k(qq1Var);
                                        if (objM5933k != k20Var) {
                                            il1Var5 = il1Var4;
                                            uq1Var = uq1Var5;
                                            objM4981e2 = objM5933k;
                                            il1Var6 = il1Var5;
                                            try {
                                                list = ((yj2) objM4981e2).f13492a;
                                                if (!list.isEmpty()) {
                                                    Iterator it = list.iterator();
                                                    while (it.hasNext()) {
                                                        if (t11.m5086l(((me1) it.next()).f6584a, str5)) {
                                                            if (i4 == 0 && uq1Var.f11443c.m4446a() && (z80Var = (z80) f10321q.get(str5)) != null) {
                                                                wj2 wj2Var2 = f10317m;
                                                                if (wj2Var2 == null) {
                                                                    t11.m5067S("runtimeManager");
                                                                    throw null;
                                                                }
                                                                qq1Var.f9096k = null;
                                                                qq1Var.f9097l = null;
                                                                qq1Var.f9098m = null;
                                                                qq1Var.f9099n = il1Var6;
                                                                qq1Var.f9100o = uq1Var;
                                                                qq1Var.f9101p = i4;
                                                                qq1Var.f9104s = 6;
                                                                objM4981e2 = wj2Var2.m5930g(z80Var, qq1Var);
                                                                if (objM4981e2 != k20Var) {
                                                                    uq1Var3 = uq1Var;
                                                                    il1Var8 = il1Var6;
                                                                    i = i4;
                                                                    i4 = i;
                                                                    uq1Var2 = uq1Var3;
                                                                    il1Var7 = il1Var8;
                                                                    qq1Var.f9096k = null;
                                                                    qq1Var.f9097l = null;
                                                                    qq1Var.f9098m = null;
                                                                    qq1Var.f9099n = il1Var7;
                                                                    qq1Var.f9100o = uq1Var2;
                                                                    qq1Var.f9101p = i4;
                                                                    qq1Var.f9104s = 7;
                                                                    il1Var9 = il1Var7;
                                                                }
                                                            } else {
                                                                uq1 uq1Var6 = uq1Var;
                                                                il1Var7 = il1Var6;
                                                                uq1Var2 = uq1Var6;
                                                                qq1Var.f9096k = null;
                                                                qq1Var.f9097l = null;
                                                                qq1Var.f9098m = null;
                                                                qq1Var.f9099n = il1Var7;
                                                                qq1Var.f9100o = uq1Var2;
                                                                qq1Var.f9101p = i4;
                                                                qq1Var.f9104s = 7;
                                                                il1Var9 = il1Var7;
                                                            }
                                                            break;
                                                        }
                                                    }
                                                }
                                                i4 = 0;
                                                if (i4 == 0) {
                                                }
                                                uq1 uq1Var62 = uq1Var;
                                                il1Var7 = il1Var6;
                                                uq1Var2 = uq1Var62;
                                                qq1Var.f9096k = null;
                                                qq1Var.f9097l = null;
                                                qq1Var.f9098m = null;
                                                qq1Var.f9099n = il1Var7;
                                                qq1Var.f9100o = uq1Var2;
                                                qq1Var.f9101p = i4;
                                                qq1Var.f9104s = 7;
                                                il1Var9 = il1Var7;
                                            } catch (Throwable th) {
                                                th = th;
                                                str2 = il1Var6;
                                                ((kl1) str2).m2722f(null);
                                                throw th;
                                            }
                                        }
                                        break;
                                    }
                                }
                            }
                        } catch (Throwable th2) {
                            str2 = il1Var;
                            th = th2;
                            ((kl1) str2).m2722f(null);
                            throw th;
                        }
                    }
                    return k20Var;
                case 1:
                    il1 il1Var10 = qq1Var.f9099n;
                    j31Var = qq1Var.f9098m;
                    String str6 = qq1Var.f9097l;
                    String str7 = qq1Var.f9096k;
                    fg1.m1627T(objM4981e2);
                    il1Var = il1Var10;
                    str = str7;
                    r11 = str6;
                    qq1Var.f9096k = str;
                    qq1Var.f9097l = r11;
                    qq1Var.f9098m = j31Var;
                    qq1Var.f9099n = il1Var;
                    qq1Var.f9104s = 2;
                    objM4981e = sq1Var.m4981e(str, qq1Var);
                    if (objM4981e != k20Var) {
                    }
                    return k20Var;
                case 2:
                    il1 il1Var11 = qq1Var.f9099n;
                    j31Var2 = qq1Var.f9098m;
                    String str8 = qq1Var.f9097l;
                    str3 = qq1Var.f9096k;
                    fg1.m1627T(objM4981e2);
                    il1Var2 = il1Var11;
                    r12 = str8;
                    uq1 uq1Var42 = (uq1) objM4981e2;
                    kf2Var = (kf2) uq1Var42.f11442b.f6099a.get(r12);
                    if (kf2Var != null) {
                    }
                    break;
                case 3:
                    il1 il1Var12 = qq1Var.f9099n;
                    str4 = qq1Var.f9096k;
                    fg1.m1627T(objM4981e2);
                    il1Var3 = il1Var12;
                    qq1Var.f9096k = str4;
                    qq1Var.f9097l = null;
                    qq1Var.f9098m = null;
                    qq1Var.f9099n = il1Var3;
                    qq1Var.f9104s = 4;
                    objM4981e2 = sq1Var.m4981e(str4, qq1Var);
                    il1Var4 = il1Var3;
                    if (objM4981e2 == k20Var) {
                    }
                    return k20Var;
                case 4:
                    il1 il1Var13 = qq1Var.f9099n;
                    str4 = qq1Var.f9096k;
                    fg1.m1627T(objM4981e2);
                    il1Var4 = il1Var13;
                    str5 = str4;
                    uq1 uq1Var52 = (uq1) objM4981e2;
                    wj2Var = f10317m;
                    if (wj2Var != null) {
                    }
                    break;
                case 5:
                    uq1 uq1Var7 = qq1Var.f9100o;
                    il1 il1Var14 = qq1Var.f9099n;
                    str5 = qq1Var.f9096k;
                    fg1.m1627T(objM4981e2);
                    il1Var5 = il1Var14;
                    uq1Var = uq1Var7;
                    il1Var6 = il1Var5;
                    list = ((yj2) objM4981e2).f13492a;
                    if (!list.isEmpty()) {
                    }
                    i4 = 0;
                    if (i4 == 0) {
                    }
                    uq1 uq1Var622 = uq1Var;
                    il1Var7 = il1Var6;
                    uq1Var2 = uq1Var622;
                    qq1Var.f9096k = null;
                    qq1Var.f9097l = null;
                    qq1Var.f9098m = null;
                    qq1Var.f9099n = il1Var7;
                    qq1Var.f9100o = uq1Var2;
                    qq1Var.f9101p = i4;
                    qq1Var.f9104s = 7;
                    il1Var9 = il1Var7;
                    break;
                case AIChatConfig.DefaultContextRounds /* 6 */:
                    i = qq1Var.f9101p;
                    uq1 uq1Var8 = qq1Var.f9100o;
                    il1 il1Var15 = qq1Var.f9099n;
                    try {
                        fg1.m1627T(objM4981e2);
                        uq1Var3 = uq1Var8;
                        il1Var8 = il1Var15;
                        i4 = i;
                        uq1Var2 = uq1Var3;
                        il1Var7 = il1Var8;
                        qq1Var.f9096k = null;
                        qq1Var.f9097l = null;
                        qq1Var.f9098m = null;
                        qq1Var.f9099n = il1Var7;
                        qq1Var.f9100o = uq1Var2;
                        qq1Var.f9101p = i4;
                        qq1Var.f9104s = 7;
                        il1Var9 = il1Var7;
                    } catch (Throwable th3) {
                        th = th3;
                        str2 = il1Var15;
                        ((kl1) str2).m2722f(null);
                        throw th;
                    }
                    break;
                case 7:
                    uq1Var2 = qq1Var.f9100o;
                    il1 il1Var16 = qq1Var.f9099n;
                    fg1.m1627T(objM4981e2);
                    il1Var9 = il1Var16;
                    ((kl1) il1Var9).m2722f(null);
                    return uq1Var2;
                default:
                    C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                    return null;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|2|(2:4|(1:6)(1:7))(0)|8|(1:(3:(2:139|(1:(1:(6:15|136|16|119|120|121)(2:20|21))(7:22|23|111|114|115|(4:118|119|120|121)|117))(8:27|133|28|78|92|115|(0)|117))(9:32|130|33|34|50|(3:53|(3:56|(2:141|58)(1:142)|54)|140)|52|(2:62|(2:64|(2:66|(2:68|(5:70|(3:135|72|(2:74|(1:76)(2:77|78))(2:81|82))|92|115|(0))(2:93|94))(2:95|96))(2:97|98))(2:99|100))(2:101|(5:103|(2:105|(2:107|(1:109)(2:110|111))(2:112|113))|114|115|(0))(2:122|123))|117)|128|129)(1:37))(3:38|(1:41)|117)|138|42|(2:44|(2:46|(2:48|117)(6:49|50|(0)|52|(0)(0)|117))(2:124|125))(2:126|127)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00f9, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00fa, code lost:
    
        r1 = r6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0183 A[Catch: all -> 0x00f9, TryCatch #5 {all -> 0x00f9, blocks: (B:114:0x01b2, B:115:0x01b8, B:92:0x0156, B:83:0x0143, B:85:0x0147, B:91:0x0155, B:88:0x014e, B:89:0x0151, B:90:0x0152, B:50:0x00d3, B:62:0x00ff, B:64:0x0107, B:66:0x010b, B:68:0x0113, B:70:0x0117, B:72:0x011c, B:74:0x0120, B:81:0x013f, B:82:0x0142, B:93:0x015d, B:94:0x0160, B:95:0x0161, B:96:0x016c, B:97:0x016d, B:98:0x0172, B:99:0x0173, B:100:0x0182, B:101:0x0183, B:103:0x0187, B:105:0x018d, B:107:0x0191, B:112:0x01ae, B:113:0x01b1, B:122:0x01d5, B:123:0x01d8, B:53:0x00df, B:54:0x00e3, B:56:0x00e9, B:42:0x00ae, B:44:0x00b8, B:46:0x00bc, B:124:0x01d9, B:125:0x01dc, B:126:0x01dd, B:127:0x01f3), top: B:138:0x00ae, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00df A[Catch: all -> 0x00f9, TryCatch #5 {all -> 0x00f9, blocks: (B:114:0x01b2, B:115:0x01b8, B:92:0x0156, B:83:0x0143, B:85:0x0147, B:91:0x0155, B:88:0x014e, B:89:0x0151, B:90:0x0152, B:50:0x00d3, B:62:0x00ff, B:64:0x0107, B:66:0x010b, B:68:0x0113, B:70:0x0117, B:72:0x011c, B:74:0x0120, B:81:0x013f, B:82:0x0142, B:93:0x015d, B:94:0x0160, B:95:0x0161, B:96:0x016c, B:97:0x016d, B:98:0x0172, B:99:0x0173, B:100:0x0182, B:101:0x0183, B:103:0x0187, B:105:0x018d, B:107:0x0191, B:112:0x01ae, B:113:0x01b1, B:122:0x01d5, B:123:0x01d8, B:53:0x00df, B:54:0x00e3, B:56:0x00e9, B:42:0x00ae, B:44:0x00b8, B:46:0x00bc, B:124:0x01d9, B:125:0x01dc, B:126:0x01dd, B:127:0x01f3), top: B:138:0x00ae, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ff A[Catch: all -> 0x00f9, TryCatch #5 {all -> 0x00f9, blocks: (B:114:0x01b2, B:115:0x01b8, B:92:0x0156, B:83:0x0143, B:85:0x0147, B:91:0x0155, B:88:0x014e, B:89:0x0151, B:90:0x0152, B:50:0x00d3, B:62:0x00ff, B:64:0x0107, B:66:0x010b, B:68:0x0113, B:70:0x0117, B:72:0x011c, B:74:0x0120, B:81:0x013f, B:82:0x0142, B:93:0x015d, B:94:0x0160, B:95:0x0161, B:96:0x016c, B:97:0x016d, B:98:0x0172, B:99:0x0173, B:100:0x0182, B:101:0x0183, B:103:0x0187, B:105:0x018d, B:107:0x0191, B:112:0x01ae, B:113:0x01b1, B:122:0x01d5, B:123:0x01d8, B:53:0x00df, B:54:0x00e3, B:56:0x00e9, B:42:0x00ae, B:44:0x00b8, B:46:0x00bc, B:124:0x01d9, B:125:0x01dc, B:126:0x01dd, B:127:0x01f3), top: B:138:0x00ae, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0147 A[Catch: all -> 0x00f9, Exception -> 0x014c, TryCatch #1 {Exception -> 0x014c, blocks: (B:83:0x0143, B:85:0x0147, B:88:0x014e, B:89:0x0151), top: B:132:0x0143, outer: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x014e A[Catch: all -> 0x00f9, Exception -> 0x014c, TryCatch #1 {Exception -> 0x014c, blocks: (B:83:0x0143, B:85:0x0147, B:88:0x014e, B:89:0x0151), top: B:132:0x0143, outer: #5 }] */
    /* JADX INFO: renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m4988n(String str, boolean z, u00 u00Var) throws Throwable {
        rq1 rq1Var;
        String str2;
        il1 il1Var;
        boolean z2;
        z80 z80Var;
        String str3;
        int i;
        String str4;
        il1 il1Var2;
        int i2;
        Object obj;
        String str5;
        Exception exc;
        kj1 kj1Var;
        il1 il1Var3;
        int i3;
        List list;
        sq1 sq1Var = f10305a;
        if (u00Var instanceof rq1) {
            rq1Var = (rq1) u00Var;
            int i4 = rq1Var.f9708r;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                rq1Var.f9708r = i4 - Integer.MIN_VALUE;
            } else {
                rq1Var = new rq1(this, u00Var);
            }
        }
        Object obj2 = rq1Var.f9706p;
        int i5 = rq1Var.f9708r;
        LinkedHashMap linkedHashMap = f10322r;
        k20 k20Var = k20.f5323h;
        if (i5 == 0) {
            fg1.m1627T(obj2);
            str2 = str;
            rq1Var.f9701k = str2;
            kl1 kl1Var = f10307c;
            rq1Var.f9702l = kl1Var;
            rq1Var.f9704n = z;
            rq1Var.f9708r = 1;
            if (kl1Var.m2720d(rq1Var) != k20Var) {
                il1Var = kl1Var;
                z2 = z;
            }
            return k20Var;
        }
        if (i5 != 1) {
            if (i5 != 2) {
                try {
                    if (i5 == 3) {
                        i3 = rq1Var.f9705o;
                        z2 = rq1Var.f9704n;
                        il1Var3 = rq1Var.f9702l;
                        str5 = rq1Var.f9701k;
                        try {
                            fg1.m1627T(obj2);
                            i = i3;
                            il1Var = il1Var3;
                            str3 = str5;
                            rq1Var.f9701k = null;
                            rq1Var.f9702l = il1Var;
                            rq1Var.f9703m = null;
                            rq1Var.f9704n = z2;
                            rq1Var.f9705o = i;
                            rq1Var.f9708r = 5;
                            if (sq1Var.m4984j(rq1Var) != k20Var) {
                            }
                            return k20Var;
                        } catch (Exception e) {
                            exc = e;
                            il1Var = il1Var3;
                            try {
                                kj1Var = f10316l;
                                if (kj1Var == null) {
                                    kj1Var.m2705J(str5, false);
                                    throw exc;
                                }
                                t11.m5067S("enabledStore");
                                throw null;
                            } catch (Exception e2) {
                                fg1.m1638m(exc, e2);
                                throw exc;
                            }
                        }
                    }
                    if (i5 == 4) {
                        i2 = rq1Var.f9705o;
                        z2 = rq1Var.f9704n;
                        il1Var2 = rq1Var.f9702l;
                        str4 = rq1Var.f9701k;
                        fg1.m1627T(obj2);
                        i = i2;
                        il1Var = il1Var2;
                        str3 = str4;
                        rq1Var.f9701k = null;
                        rq1Var.f9702l = il1Var;
                        rq1Var.f9703m = null;
                        rq1Var.f9704n = z2;
                        rq1Var.f9705o = i;
                        rq1Var.f9708r = 5;
                        if (sq1Var.m4984j(rq1Var) != k20Var) {
                            obj = il1Var;
                            a83 a83Var = a83.f116a;
                            ((kl1) obj).m2722f(null);
                            return a83Var;
                        }
                        return k20Var;
                    }
                    if (i5 != 5) {
                        C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj = rq1Var.f9702l;
                    try {
                        fg1.m1627T(obj2);
                        obj = obj;
                        a83 a83Var2 = a83.f116a;
                        ((kl1) obj).m2722f(null);
                        return a83Var2;
                    } catch (Throwable th) {
                        th = th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    obj = 4;
                }
            } else {
                boolean z3 = rq1Var.f9704n;
                z80 z80Var2 = rq1Var.f9703m;
                il1 il1Var4 = rq1Var.f9702l;
                String str6 = rq1Var.f9701k;
                try {
                    fg1.m1627T(obj2);
                    z80Var = z80Var2;
                    z2 = z3;
                    str3 = str6;
                    il1Var = il1Var4;
                    list = ((yj2) obj2).f13492a;
                    if (!list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            if (t11.m5086l(((me1) it.next()).f6584a, str3)) {
                                i = 1;
                                break;
                            }
                        }
                    }
                    i = 0;
                    if (z2) {
                        kj1 kj1Var2 = f10316l;
                        if (kj1Var2 == null) {
                            t11.m5067S("enabledStore");
                            throw null;
                        }
                        kj1Var2.m2705J(str3, false);
                        if (i != 0) {
                            wj2 wj2Var = f10317m;
                            if (wj2Var == null) {
                                t11.m5067S("runtimeManager");
                                throw null;
                            }
                            rq1Var.f9701k = str3;
                            rq1Var.f9702l = il1Var;
                            rq1Var.f9703m = null;
                            rq1Var.f9704n = z2;
                            rq1Var.f9705o = i;
                            rq1Var.f9708r = 4;
                            if (wj2Var.m5936n(str3, xj2.f13060i, rq1Var) != k20Var) {
                                str4 = str3;
                                il1Var2 = il1Var;
                                i2 = i;
                                i = i2;
                                il1Var = il1Var2;
                                str3 = str4;
                            }
                        }
                        rq1Var.f9701k = null;
                        rq1Var.f9702l = il1Var;
                        rq1Var.f9703m = null;
                        rq1Var.f9704n = z2;
                        rq1Var.f9705o = i;
                        rq1Var.f9708r = 5;
                        if (sq1Var.m4984j(rq1Var) != k20Var) {
                        }
                    } else {
                        pp1 pp1Var = pp1.f8445a;
                        if (pp1.m3934f()) {
                            throw new IllegalStateException(m4978o(R.string.script_settings_security_mode_running_disabled, new Object[0]));
                        }
                        kj1 kj1Var3 = f10315k;
                        if (kj1Var3 == null) {
                            t11.m5067S("permissionStore");
                            throw null;
                        }
                        if (!kj1Var3.m2699C(z80Var.f13783b)) {
                            throw new bq1(str3, m4975b(z80Var.f13783b));
                        }
                        kj1 kj1Var4 = f10316l;
                        if (kj1Var4 == null) {
                            t11.m5067S("enabledStore");
                            throw null;
                        }
                        kj1Var4.m2705J(str3, true);
                        if (i == 0) {
                            try {
                                wj2 wj2Var2 = f10317m;
                                if (wj2Var2 == null) {
                                    t11.m5067S("runtimeManager");
                                    throw null;
                                }
                                rq1Var.f9701k = str3;
                                rq1Var.f9702l = il1Var;
                                rq1Var.f9703m = null;
                                rq1Var.f9704n = z2;
                                rq1Var.f9705o = i;
                                rq1Var.f9708r = 3;
                                if (wj2Var2.m5934l(z80Var, rq1Var) != k20Var) {
                                    str5 = str3;
                                    il1Var3 = il1Var;
                                    i3 = i;
                                    i = i3;
                                    il1Var = il1Var3;
                                    str3 = str5;
                                }
                            } catch (Exception e3) {
                                exc = e3;
                                str5 = str3;
                                kj1Var = f10316l;
                                if (kj1Var == null) {
                                }
                            }
                        }
                        rq1Var.f9701k = null;
                        rq1Var.f9702l = il1Var;
                        rq1Var.f9703m = null;
                        rq1Var.f9704n = z2;
                        rq1Var.f9705o = i;
                        rq1Var.f9708r = 5;
                        if (sq1Var.m4984j(rq1Var) != k20Var) {
                        }
                    }
                    return k20Var;
                } catch (Throwable th3) {
                    th = th3;
                    obj = il1Var4;
                }
            }
            ((kl1) obj).m2722f(null);
            throw th;
        }
        z2 = rq1Var.f9704n;
        il1Var = rq1Var.f9702l;
        String str7 = rq1Var.f9701k;
        fg1.m1627T(obj2);
        str2 = str7;
        z80Var = (z80) f10321q.get(str2);
        if (z80Var == null) {
            throw new IllegalArgumentException("Script '" + str2 + "' is not available.");
        }
        wj2 wj2Var3 = f10317m;
        if (wj2Var3 == null) {
            t11.m5067S("runtimeManager");
            throw null;
        }
        rq1Var.f9701k = str2;
        rq1Var.f9702l = il1Var;
        rq1Var.f9703m = z80Var;
        rq1Var.f9704n = z2;
        rq1Var.f9708r = 2;
        Object objM5933k = wj2Var3.m5933k(rq1Var);
        if (objM5933k == k20Var) {
            return k20Var;
        }
        str3 = str2;
        obj2 = objM5933k;
        list = ((yj2) obj2).f13492a;
        if (!list.isEmpty()) {
        }
        i = 0;
        if (z2) {
        }
        return k20Var;
    }
}
