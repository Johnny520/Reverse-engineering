package defpackage;

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
import nuke.module.wechat.ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class sq1 {
    public static final sq1 a = new sq1();
    public static final s00 b;
    public static final kl1 c;
    public static final ju2 d;
    public static final m52 e;
    public static volatile boolean f;
    public static volatile Resources g;
    public static b5 h;
    public static wi2 i;
    public static b5 j;
    public static kj1 k;
    public static kj1 l;
    public static wj2 m;
    public static dq1 n;
    public static jn o;
    public static hv p;
    public static final LinkedHashMap q;
    public static final LinkedHashMap r;
    public static final ak s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        mw2 mw2Var = new mw2(null);
        c60 c60Var = o90.a;
        b = te.e(xe1.f0(mw2Var, t50.j));
        c = new kl1();
        ju2 ju2VarF = pp0.f(new tq1(be0.h, false, null));
        d = ju2VarF;
        e = new m52(ju2VarF, null);
        q = new LinkedHashMap();
        r = new LinkedHashMap();
        s = new ak(262144);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Duplicate block (B:52:0x00ef) to fix multi-entry loop: BACK_EDGE: B:52:0x00ef -> B:23:0x0067 */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(hv hvVar, fq fqVar, u00 u00Var) throws Throwable {
        iq1 iq1Var;
        in it;
        hv hvVar2;
        Exception exc;
        ci2 ci2Var;
        b5 b5Var;
        hv hvVar3;
        Object objB;
        if (u00Var instanceof iq1) {
            iq1Var = (iq1) u00Var;
            int i2 = iq1Var.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iq1Var.o = i2 - Integer.MIN_VALUE;
            } else {
                iq1Var = new iq1(u00Var);
            }
        }
        Object obj = iq1Var.n;
        int i3 = iq1Var.o;
        t00 t00Var = null;
        k20 k20Var = k20.h;
        if (i3 == 0) {
            fg1.T(obj);
            it = fqVar.iterator();
            hvVar2 = hvVar;
        } else if (i3 == 1) {
            it = iq1Var.l;
            hvVar3 = iq1Var.k;
            fg1.T(obj);
            if (((Boolean) obj).booleanValue()) {
                return a83.a;
            }
            ci2 ci2Var2 = (ci2) it.c();
            iq1Var.k = hvVar3;
            iq1Var.l = it;
            iq1Var.m = ci2Var2;
            iq1Var.o = 2;
            if (hvVar3.g0(iq1Var) == k20Var) {
                return k20Var;
            }
            ci2Var = ci2Var2;
            pp1 pp1Var = pp1.a;
            if (pp1.f()) {
            }
        } else if (i3 == 2) {
            ci2 ci2Var3 = iq1Var.m;
            in inVar = iq1Var.l;
            hv hvVar4 = iq1Var.k;
            fg1.T(obj);
            ci2Var = ci2Var3;
            it = inVar;
            hvVar3 = hvVar4;
            pp1 pp1Var2 = pp1.a;
            if (pp1.f()) {
                try {
                } catch (Exception e2) {
                    exc = e2;
                    hvVar2 = hvVar3;
                    b5Var = h;
                    if (b5Var != null) {
                        t11.S("scriptLogger");
                        throw null;
                    }
                    b5.x(b5Var, ph2.k, vi0.j("Message dispatch failed for event ", ci2Var.a, "."), null, exc, 24);
                    iq1Var.k = hvVar2;
                    iq1Var.l = it;
                    iq1Var.m = null;
                    iq1Var.o = 1;
                    objB = it.b(iq1Var);
                    if (objB != k20Var) {
                    }
                }
                dq1 dq1Var = n;
                if (dq1Var == null) {
                    t11.S("messageRouter");
                    throw null;
                }
                iq1Var.k = hvVar3;
                iq1Var.l = it;
                iq1Var.m = ci2Var;
                iq1Var.o = 3;
                b2 b2Var = new b2(dq1Var, ci2Var, t00Var, 13);
                lw2 lw2Var = new lw2(iq1Var, iq1Var.f());
                if (ze3.b(lw2Var, true, lw2Var, b2Var) == k20Var) {
                    return k20Var;
                }
                hvVar2 = hvVar3;
                throw e;
            }
            hvVar2 = hvVar3;
        } else {
            if (i3 != 3) {
                s.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ci2 ci2Var4 = iq1Var.m;
            in inVar2 = iq1Var.l;
            hv hvVar5 = iq1Var.k;
            try {
                try {
                    fg1.T(obj);
                    it = inVar2;
                    hvVar2 = hvVar5;
                } catch (CancellationException e3) {
                    throw e3;
                }
            } catch (Exception e4) {
                exc = e4;
                hvVar2 = hvVar5;
                ci2Var = ci2Var4;
                it = inVar2;
                b5Var = h;
                if (b5Var != null) {
                }
            }
        }
        iq1Var.k = hvVar2;
        iq1Var.l = it;
        iq1Var.m = null;
        iq1Var.o = 1;
        objB = it.b(iq1Var);
        if (objB != k20Var) {
            return k20Var;
        }
        hvVar3 = hvVar2;
        obj = objB;
        if (((Boolean) obj).booleanValue()) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static ArrayList b(th2 th2Var) {
        pb1 pb1VarB = th2Var.k.b();
        ArrayList arrayList = new ArrayList(eu.B(pb1VarB, 10));
        ListIterator listIterator = pb1VarB.listIterator(0);
        while (true) {
            vs0 vs0Var = (vs0) listIterator;
            if (!vs0Var.hasNext()) {
                return arrayList;
            }
            ff2 ff2Var = (ff2) vs0Var.next();
            ef2 ef2Var = ff2Var.a;
            arrayList.add(new gq1(ef2Var.h, g(ef2Var), ff2Var.b));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void f() {
        hv hvVar = p;
        if (hvVar == null) {
            t11.S("messageDispatchReady");
            throw null;
        }
        if (r21.h.get(hvVar) instanceof cy0) {
            hvVar.T(a83.a);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String g(ef2 ef2Var) {
        int iOrdinal = ef2Var.ordinal();
        if (iOrdinal == 0) {
            return o(R.string.script_permission_network, new Object[0]);
        }
        if (iOrdinal == 1) {
            return o(R.string.script_permission_external_storage, new Object[0]);
        }
        if (iOrdinal == 2) {
            return o(R.string.script_permission_host_reflection, new Object[0]);
        }
        if (iOrdinal == 3) {
            return o(R.string.script_permission_host_hook, new Object[0]);
        }
        if (iOrdinal == 4) {
            return o(R.string.script_permission_host_filesystem, new Object[0]);
        }
        c80.s();
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String o(int i2, Object... objArr) {
        Resources resources = g;
        if (resources == null) {
            s.l("NukeScriptService has not been initialized");
            return null;
        }
        String string = resources.getString(i2, Arrays.copyOf(objArr, objArr.length));
        string.getClass();
        return string;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:15:0x002f */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:53:? */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, u00 u00Var) throws Throwable {
        jq1 jq1Var;
        il1 il1Var;
        il1 il1Var2;
        Throwable th;
        if (u00Var instanceof jq1) {
            jq1Var = (jq1) u00Var;
            int i2 = jq1Var.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jq1Var.o = i2 - Integer.MIN_VALUE;
            } else {
                jq1Var = new jq1(this, u00Var);
            }
        }
        Object obj = jq1Var.m;
        k20 k20Var = k20.h;
        int i3 = jq1Var.o;
        try {
            if (i3 == 0) {
                fg1.T(obj);
                kl1 kl1Var = c;
                jq1Var.k = str;
                jq1Var.l = kl1Var;
                jq1Var.o = 1;
                Object objD = kl1Var.d(jq1Var);
                il1Var = kl1Var;
                if (objD != k20Var) {
                }
                return k20Var;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    s.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                il1Var2 = jq1Var.l;
                try {
                    fg1.T(obj);
                    il1Var2 = il1Var2;
                    a83 a83Var = a83.a;
                    ((kl1) il1Var2).f(null);
                    return a83Var;
                } catch (Throwable th2) {
                    th = th2;
                    ((kl1) il1Var2).f(null);
                    throw th;
                }
            }
            il1 il1Var3 = jq1Var.l;
            String str2 = jq1Var.k;
            fg1.T(obj);
            il1Var = il1Var3;
            str = str2;
            z80 z80Var = (z80) q.get(str);
            if (z80Var == null) {
                throw new IllegalArgumentException("Script '" + str + "' is not available.");
            }
            kj1 kj1Var = k;
            if (kj1Var == null) {
                t11.S("permissionStore");
                throw null;
            }
            th2 th2Var = z80Var.b;
            th2Var.getClass();
            synchronized (kj1Var.j) {
                Map mapD = kj1Var.D();
                mapD.put(th2Var.c, rp0.b0(th2Var));
                kj1Var.F(mapD);
            }
            sq1 sq1Var = a;
            jq1Var.k = null;
            jq1Var.l = il1Var;
            jq1Var.o = 2;
            if (sq1Var.i(jq1Var) != k20Var) {
                il1Var2 = il1Var;
                a83 a83Var2 = a83.a;
                ((kl1) il1Var2).f(null);
                return a83Var2;
            }
            return k20Var;
        } catch (Throwable th3) {
            il1Var2 = il1Var;
            th = th3;
            ((kl1) il1Var2).f(null);
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d(Context context) {
        File fileG0;
        Object x92Var;
        String str;
        context.getClass();
        g = context.getResources();
        if (f) {
            return;
        }
        synchronized (this) {
            try {
                if (f) {
                    return;
                }
                Context applicationContext = context.getApplicationContext();
                Context context2 = applicationContext == null ? context : applicationContext;
                t00 t00Var = null;
                File externalFilesDir = context2.getExternalFilesDir(null);
                if (externalFilesDir != null) {
                    fileG0 = wi0.g0(externalFilesDir, "nuke/scripts");
                } else {
                    File filesDir = context2.getFilesDir();
                    filesDir.getClass();
                    fileG0 = wi0.g0(filesDir, "nuke/scripts");
                }
                fileG0.mkdirs();
                File filesDir2 = context2.getFilesDir();
                filesDir2.getClass();
                File fileG02 = wi0.g0(filesDir2, "nuke/script-config");
                File filesDir3 = context2.getFilesDir();
                filesDir3.getClass();
                File fileG03 = wi0.g0(filesDir3, "nuke/script-storage");
                File fileG04 = externalFilesDir != null ? wi0.g0(externalFilesDir, "nuke/script-external") : null;
                j = new b5(fileG02);
                File filesDir4 = context2.getFilesDir();
                filesDir4.getClass();
                k = new kj1(wi0.g0(filesDir4, "nuke/script-permissions.json"), 11);
                File filesDir5 = context2.getFilesDir();
                filesDir5.getClass();
                l = new kj1(wi0.g0(filesDir5, "nuke/script-enabled.json"), 9);
                b5 b5Var = new b5(null, 15);
                h = b5Var;
                try {
                    str = up0.m;
                } catch (Throwable th) {
                    x92Var = new x92(th);
                }
                if (str == null) {
                    t11.S("hostProcess");
                    throw null;
                }
                x92Var = Boolean.valueOf(str.equals("com.tencent.mm"));
                Object obj = Boolean.FALSE;
                if (x92Var instanceof x92) {
                    x92Var = obj;
                }
                hi2 kj1Var = ((Boolean) x92Var).booleanValue() ? new kj1(10) : gi2.a;
                hq1 hq1Var = new hq1(new iz(4, fileG03.getAbsoluteFile()), fileG04);
                b5 b5Var2 = j;
                if (b5Var2 == null) {
                    t11.S("configStore");
                    throw null;
                }
                ar1 ar1Var = ar1.h;
                kj1 kj1Var2 = k;
                if (kj1Var2 == null) {
                    t11.S("permissionStore");
                    throw null;
                }
                hh1 hh1Var = new hh1(kj1Var2);
                kj1 kj1Var3 = k;
                if (kj1Var3 == null) {
                    t11.S("permissionStore");
                    throw null;
                }
                sz0 sz0Var = new sz0(kj1Var3);
                kj1 kj1Var4 = k;
                if (kj1Var4 == null) {
                    t11.S("permissionStore");
                    throw null;
                }
                ClassLoader classLoader = context2.getClassLoader();
                classLoader.getClass();
                wj2 wj2Var = new wj2(new kj1(new df2(b5Var, hh1Var, hq1Var, b5Var2, kj1Var, sz0Var, new b5(kj1Var4, classLoader, context2), 513), 5), b5Var);
                m = wj2Var;
                n = new dq1(0, wj2Var, b5Var);
                o = fg1.a(AIChatConfig.DefaultMaxTokens, 6, null);
                hv hvVar = new hv(true);
                hvVar.Q(null);
                p = hvVar;
                s00 s00Var = b;
                int i2 = 2;
                p7.A(s00Var, null, new lk0(i2, t00Var, 1), 3);
                i = new wi2(fileG0, null, 6);
                f = true;
                if (f) {
                    p7.A(s00Var, null, new lk0(i2, t00Var, i2), 3);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(String str, u00 u00Var) throws Throwable {
        kq1 kq1Var;
        z80 z80Var;
        lf2 lf2Var;
        if (u00Var instanceof kq1) {
            kq1Var = (kq1) u00Var;
            int i2 = kq1Var.p;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kq1Var.p = i2 - Integer.MIN_VALUE;
            } else {
                kq1Var = new kq1(this, u00Var);
            }
        }
        Object obj = kq1Var.n;
        int i3 = kq1Var.p;
        k20 k20Var = k20.h;
        if (i3 == 0) {
            fg1.T(obj);
            z80 z80Var2 = (z80) q.get(str);
            if (z80Var2 == null) {
                s.j(vi0.j("Script '", str, "' is not available."));
                return null;
            }
            File file = z80Var2.a;
            c60 c60Var = o90.a;
            sz0 sz0Var = new sz0(file, t50.j);
            th2 th2Var = z80Var2.b;
            kq1Var.k = str;
            kq1Var.l = z80Var2;
            kq1Var.p = 1;
            Object objA = s.a(sz0Var, th2Var, kq1Var);
            if (objA != k20Var) {
                z80Var = z80Var2;
                obj = objA;
            }
            return k20Var;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                s.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            lf2Var = kq1Var.m;
            z80Var = kq1Var.l;
            fg1.T(obj);
            return new uq1(z80Var.b, lf2Var, up0.E(lf2Var, (d41) obj));
        }
        z80 z80Var3 = kq1Var.l;
        String str2 = kq1Var.k;
        fg1.T(obj);
        z80Var = z80Var3;
        str = str2;
        lf2 lf2Var2 = (lf2) obj;
        if (lf2Var2 == null) {
            s.j(vi0.j("Script '", str, "' does not define a config schema."));
            return null;
        }
        b5 b5Var = j;
        if (b5Var == null) {
            t11.S("configStore");
            throw null;
        }
        kq1Var.k = null;
        kq1Var.l = z80Var;
        kq1Var.m = lf2Var2;
        kq1Var.p = 2;
        Object objG = b5Var.g(str, kq1Var);
        if (objG != k20Var) {
            lf2Var = lf2Var2;
            obj = objG;
            return new uq1(z80Var.b, lf2Var, up0.E(lf2Var, (d41) obj));
        }
        return k20Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:32:0x0021 */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0056, code lost:
    
        if (r5.i(r0) == r4) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v1, types: [int] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(u00 u00Var) {
        lq1 lq1Var;
        il1 il1Var;
        if (u00Var instanceof lq1) {
            lq1Var = (lq1) u00Var;
            int i2 = lq1Var.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lq1Var.n = i2 - Integer.MIN_VALUE;
            } else {
                lq1Var = new lq1(this, u00Var);
            }
        }
        Object obj = lq1Var.l;
        ?? r6 = lq1Var.n;
        k20 k20Var = k20.h;
        try {
            if (r6 == 0) {
                fg1.T(obj);
                kl1 kl1Var = c;
                lq1Var.k = kl1Var;
                lq1Var.n = 1;
                if (kl1Var.d(lq1Var) != k20Var) {
                    il1Var = kl1Var;
                }
                return k20Var;
            }
            if (r6 != 1) {
                if (r6 != 2) {
                    s.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                il1 il1Var2 = lq1Var.k;
                fg1.T(obj);
                r6 = il1Var2;
                return a83.a;
            }
            il1 il1Var3 = lq1Var.k;
            fg1.T(obj);
            il1Var = il1Var3;
            sq1 sq1Var = a;
            lq1Var.k = il1Var;
            lq1Var.n = 2;
            r6 = il1Var;
        } finally {
            ((kl1) r6).f(null);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(u00 u00Var) {
        mq1 mq1Var;
        String message;
        Throwable th;
        xi2 xi2Var;
        Set set;
        Throwable th2;
        wj2 wj2Var;
        ?? r22;
        String strO;
        Iterator it;
        kj1 kj1Var;
        LinkedHashMap linkedHashMap = q;
        if (u00Var instanceof mq1) {
            mq1Var = (mq1) u00Var;
            int i2 = mq1Var.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mq1Var.o = i2 - Integer.MIN_VALUE;
            } else {
                mq1Var = new mq1(this, u00Var);
            }
        }
        Object objR = mq1Var.m;
        int i3 = mq1Var.o;
        LinkedHashMap linkedHashMap2 = r;
        int i4 = 3;
        ju2 ju2Var = d;
        Throwable th3 = null;
        k20 k20Var = k20.h;
        try {
            try {
                try {
                    try {
                    } catch (Exception e2) {
                        e = e2;
                        tq1 tq1Var = (tq1) ju2Var.getValue();
                        message = e.getMessage();
                        if (message == null) {
                            message = o(R.string.script_settings_directory_read_failed, new Object[0]);
                        }
                        ju2Var.g(tq1.a(tq1Var, u00Var, false, message, 1));
                        return a83.a;
                    }
                } catch (CancellationException e3) {
                    throw e3;
                }
            } finally {
                f();
            }
        } catch (Exception e4) {
            e = e4;
            u00Var = null;
            tq1 tq1Var2 = (tq1) ju2Var.getValue();
            message = e.getMessage();
            if (message == null) {
            }
            ju2Var.g(tq1.a(tq1Var2, u00Var, false, message, 1));
            return a83.a;
        }
        if (i3 == 0) {
            fg1.T(objR);
            ju2Var.g(tq1.a((tq1) ju2Var.getValue(), null, true, null, 1));
            wi2 wi2Var = i;
            if (wi2Var == null) {
                t11.S("repository");
                throw null;
            }
            mq1Var.o = 1;
            objR = p7.R(wi2Var.b, new vi2(wi2Var, null), mq1Var);
            if (objR == k20Var) {
            }
            return k20Var;
        }
        if (i3 == 1) {
            fg1.T(objR);
        } else {
            if (i3 != 2) {
                if (i3 != 3) {
                    s.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                set = mq1Var.l;
                xi2Var = mq1Var.k;
                fg1.T(objR);
                th = null;
                List listA = ((yj2) objR).a();
                ArrayList arrayList = new ArrayList(eu.B(listA, 10));
                Iterator it2 = listA.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((me1) it2.next()).a());
                }
                Set setK0 = du.K0(arrayList);
                List list = xi2Var.b;
                List<z80> list2 = xi2Var.a;
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (Object obj : list) {
                    String absolutePath = ((zf2) obj).a.getAbsolutePath();
                    Object arrayList2 = linkedHashMap3.get(absolutePath);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        linkedHashMap3.put(absolutePath, arrayList2);
                    }
                    ((List) arrayList2).add(obj);
                }
                ArrayList arrayList3 = new ArrayList(eu.B(list2, 10));
                for (z80 z80Var : list2) {
                    String strC = z80Var.a().c();
                    String strD = z80Var.a().d();
                    String strF = z80Var.a().f();
                    String strB = z80Var.a().b();
                    boolean z = z80Var.a().a() != null;
                    boolean zContains = setK0.contains(z80Var.a().c());
                    String str = (String) linkedHashMap2.get(z80Var.a().c());
                    List list3 = (List) linkedHashMap3.get(z80Var.a.getAbsolutePath());
                    if (list3 != null) {
                        strO = du.u0(list3, "\n", null, null, new eq1(i4), 30);
                    } else if (set.contains(z80Var.a().c())) {
                        strO = o(R.string.script_settings_duplicate_id, new Object[0]);
                    } else {
                        r22 = th;
                        jp2 jp2VarC = z80Var.a().e().c();
                        ArrayList arrayList4 = new ArrayList(eu.B(jp2VarC, 10));
                        it = jp2VarC.iterator();
                        while (((ne1) it).hasNext()) {
                            arrayList4.add(g((ef2) ((ne1) it).next()));
                        }
                        ArrayList arrayListB = b(z80Var.a());
                        kj1Var = k;
                        if (kj1Var != null) {
                            t11.S("permissionStore");
                            throw th;
                        }
                        arrayList3.add(new cq1(strC, strD, strF, strB, z, zContains, r22, str, arrayList4, arrayListB, kj1Var.C(z80Var.a())));
                        i4 = 3;
                    }
                    r22 = strO;
                    jp2 jp2VarC2 = z80Var.a().e().c();
                    ArrayList arrayList42 = new ArrayList(eu.B(jp2VarC2, 10));
                    it = jp2VarC2.iterator();
                    while (((ne1) it).hasNext()) {
                    }
                    ArrayList arrayListB2 = b(z80Var.a());
                    kj1Var = k;
                    if (kj1Var != null) {
                    }
                }
                List list4 = xi2Var.b;
                ArrayList arrayList5 = new ArrayList();
                for (Object obj2 : list4) {
                    zf2 zf2Var = (zf2) obj2;
                    if (!list2.isEmpty()) {
                        Iterator it3 = list2.iterator();
                        while (it3.hasNext()) {
                            if (t11.l(((z80) it3.next()).a, zf2Var.a)) {
                                break;
                            }
                        }
                    }
                    arrayList5.add(obj2);
                }
                ?? r11 = !arrayList5.isEmpty() ? arrayList5 : th;
                ju2Var.g(new tq1(arrayList3, false, r11 != 0 ? du.u0(r11, "\n", null, null, new eq1(4), 30) : th));
                return a83.a;
            }
            set = mq1Var.l;
            xi2Var = mq1Var.k;
            fg1.T(objR);
            th = null;
            wj2Var = m;
            if (wj2Var != null) {
                t11.S("runtimeManager");
                throw th;
            }
            mq1Var.k = xi2Var;
            mq1Var.l = set;
            mq1Var.o = 3;
            objR = wj2Var.k(mq1Var);
        }
        xi2 xi2Var2 = (xi2) objR;
        List list5 = xi2Var2.a;
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        for (Object obj3 : list5) {
            String strC2 = ((z80) obj3).a().c();
            Object obj4 = linkedHashMap4.get(strC2);
            if (obj4 == null) {
                th2 = th3;
                ArrayList arrayList6 = new ArrayList();
                linkedHashMap4.put(strC2, arrayList6);
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
        List list6 = xi2Var2.a;
        ArrayList<z80> arrayList7 = new ArrayList();
        for (Object obj5 : list6) {
            if (!setKeySet.contains(((z80) obj5).a().c())) {
                arrayList7.add(obj5);
            }
        }
        for (z80 z80Var2 : arrayList7) {
            linkedHashMap.put(z80Var2.a().c(), z80Var2);
        }
        linkedHashMap2.clear();
        mq1Var.k = xi2Var2;
        mq1Var.l = setKeySet;
        mq1Var.o = 2;
        if (k(mq1Var) == k20Var) {
            return k20Var;
        }
        xi2Var = xi2Var2;
        set = setKeySet;
        wj2Var = m;
        if (wj2Var != null) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(u00 u00Var) {
        nq1 nq1Var;
        if (u00Var instanceof nq1) {
            nq1Var = (nq1) u00Var;
            int i2 = nq1Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nq1Var.m = i2 - Integer.MIN_VALUE;
            } else {
                nq1Var = new nq1(this, u00Var);
            }
        }
        Object objK = nq1Var.k;
        int i3 = nq1Var.m;
        if (i3 == 0) {
            fg1.T(objK);
            wj2 wj2Var = m;
            if (wj2Var == null) {
                t11.S("runtimeManager");
                throw null;
            }
            nq1Var.m = 1;
            objK = wj2Var.k(nq1Var);
            k20 k20Var = k20.h;
            if (objK == k20Var) {
                return k20Var;
            }
        } else {
            if (i3 != 1) {
                s.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fg1.T(objK);
        }
        List list = ((yj2) objK).a;
        ArrayList arrayList = new ArrayList(eu.B(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((me1) it.next()).a);
        }
        Set setK0 = du.K0(arrayList);
        ju2 ju2Var = d;
        tq1 tq1Var = (tq1) ju2Var.getValue();
        List<cq1> list2 = ((tq1) ju2Var.getValue()).a;
        ArrayList arrayList2 = new ArrayList(eu.B(list2, 10));
        for (cq1 cq1Var : list2) {
            String str = cq1Var.a;
            boolean zContains = setK0.contains(str);
            String str2 = (String) r.get(str);
            String str3 = cq1Var.b;
            String str4 = cq1Var.c;
            String str5 = cq1Var.d;
            boolean z = cq1Var.e;
            String str6 = cq1Var.g;
            List list3 = cq1Var.i;
            List list4 = cq1Var.j;
            boolean z2 = cq1Var.k;
            str.getClass();
            str3.getClass();
            str4.getClass();
            arrayList2.add(new cq1(str, str3, str4, str5, z, zContains, str6, str2, list3, list4, z2));
        }
        ju2Var.h(null, tq1.a(tq1Var, arrayList2, false, null, 6));
        return a83.a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0062, code lost:
    
        if (r12 == r1) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00ea, code lost:
    
        if (r0.l(r12, r11) == r1) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00ec, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x00ea -> B:57:0x00ed). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x010b -> B:41:0x00ad). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(u00 u00Var) {
        oq1 oq1Var;
        Set setK0;
        Set set;
        Iterator it;
        if (u00Var instanceof oq1) {
            oq1Var = (oq1) u00Var;
            int i2 = oq1Var.p;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oq1Var.p = i2 - Integer.MIN_VALUE;
            } else {
                oq1Var = new oq1(this, u00Var);
            }
        }
        oq1 oq1Var2 = oq1Var;
        Object objK = oq1Var2.n;
        k20 k20Var = k20.h;
        int i3 = oq1Var2.p;
        if (i3 == 0) {
            fg1.T(objK);
            pp1 pp1Var = pp1.a;
            if (pp1.f()) {
                return a83.a;
            }
            wj2 wj2Var = m;
            if (wj2Var == null) {
                t11.S("runtimeManager");
                throw null;
            }
            oq1Var2.p = 1;
            objK = wj2Var.k(oq1Var2);
        } else {
            if (i3 != 1) {
                if (i3 != 2) {
                    s.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                String str = oq1Var2.m;
                it = oq1Var2.l;
                set = oq1Var2.k;
                try {
                    fg1.T(objK);
                } catch (CancellationException e2) {
                    throw e2;
                } catch (Exception e3) {
                    String str2 = str;
                    Iterator it2 = it;
                    Set set2 = set;
                    r.put(str2, o(R.string.script_settings_auto_start_failed, new Object[0]));
                    b5 b5Var = h;
                    if (b5Var == null) {
                        t11.S("scriptLogger");
                        throw null;
                    }
                    b5.x(b5Var, ph2.k, vi0.j("Unable to restore enabled script ", str2, "."), str2, e3, 16);
                    it = it2;
                    set = set2;
                    while (it.hasNext()) {
                    }
                    return a83.a;
                }
                r.remove(str);
                while (it.hasNext()) {
                    str = (String) it.next();
                    z80 z80Var = (z80) q.get(str);
                    if (z80Var != null) {
                        kj1 kj1Var = k;
                        if (kj1Var == null) {
                            t11.S("permissionStore");
                            throw null;
                        }
                        if (kj1Var.C(z80Var.b)) {
                            if (!set.contains(str)) {
                                wj2 wj2Var2 = m;
                                if (wj2Var2 == null) {
                                    t11.S("runtimeManager");
                                    throw null;
                                }
                                oq1Var2.k = set;
                                oq1Var2.l = it;
                                oq1Var2.m = str;
                                oq1Var2.p = 2;
                            }
                        }
                    }
                    kj1 kj1Var2 = l;
                    if (kj1Var2 == null) {
                        t11.S("enabledStore");
                        throw null;
                    }
                    kj1Var2.J(str, false);
                }
                return a83.a;
            }
            fg1.T(objK);
        }
        List list = ((yj2) objK).a;
        ArrayList arrayList = new ArrayList(eu.B(list, 10));
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            arrayList.add(((me1) it3.next()).a);
        }
        Set setK02 = du.K0(arrayList);
        kj1 kj1Var3 = l;
        if (kj1Var3 == null) {
            t11.S("enabledStore");
            throw null;
        }
        synchronized (kj1Var3.j) {
            setK0 = du.K0(kj1Var3.E());
        }
        set = setK02;
        it = du.z0(setK0).iterator();
        while (it.hasNext()) {
        }
        return a83.a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:15:0x002d */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:53:? */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(String str, u00 u00Var) throws Throwable {
        pq1 pq1Var;
        il1 il1Var;
        il1 il1Var2;
        Throwable th;
        if (u00Var instanceof pq1) {
            pq1Var = (pq1) u00Var;
            int i2 = pq1Var.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pq1Var.o = i2 - Integer.MIN_VALUE;
            } else {
                pq1Var = new pq1(this, u00Var);
            }
        }
        Object obj = pq1Var.m;
        k20 k20Var = k20.h;
        int i3 = pq1Var.o;
        try {
            if (i3 == 0) {
                fg1.T(obj);
                kl1 kl1Var = c;
                pq1Var.k = str;
                pq1Var.l = kl1Var;
                pq1Var.o = 1;
                Object objD = kl1Var.d(pq1Var);
                il1Var = kl1Var;
                if (objD != k20Var) {
                }
                return k20Var;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    s.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                il1Var2 = pq1Var.l;
                try {
                    fg1.T(obj);
                    il1Var2 = il1Var2;
                    a83 a83Var = a83.a;
                    ((kl1) il1Var2).f(null);
                    return a83Var;
                } catch (Throwable th2) {
                    th = th2;
                    ((kl1) il1Var2).f(null);
                    throw th;
                }
            }
            il1 il1Var3 = pq1Var.l;
            String str2 = pq1Var.k;
            fg1.T(obj);
            il1Var = il1Var3;
            str = str2;
            kj1 kj1Var = k;
            if (kj1Var == null) {
                t11.S("permissionStore");
                throw null;
            }
            str.getClass();
            synchronized (kj1Var.j) {
                Map mapD = kj1Var.D();
                if (mapD.remove(str) != null) {
                    kj1Var.F(mapD);
                }
            }
            sq1 sq1Var = a;
            pq1Var.k = null;
            pq1Var.l = il1Var;
            pq1Var.o = 2;
            if (sq1Var.i(pq1Var) != k20Var) {
                il1Var2 = il1Var;
                a83 a83Var2 = a83.a;
                ((kl1) il1Var2).f(null);
                return a83Var2;
            }
            return k20Var;
        } catch (Throwable th3) {
            il1Var2 = il1Var;
            th = th3;
            ((kl1) il1Var2).f(null);
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:15:0x0038 */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01c7, code lost:
    
        if (r4.j(r1) == r6) goto L103;
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m(String str, String str2, j31 j31Var, u00 u00Var) throws Throwable {
        qq1 qq1Var;
        ?? r11;
        il1 il1Var;
        Object objE;
        il1 il1Var2;
        String str3;
        j31 j31Var2;
        ?? r12;
        kf2 kf2Var;
        String str4;
        String strM;
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
        int i2;
        il1 il1Var9;
        if (u00Var instanceof qq1) {
            qq1Var = (qq1) u00Var;
            int i3 = qq1Var.s;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                qq1Var.s = i3 - Integer.MIN_VALUE;
            } else {
                qq1Var = new qq1(this, u00Var);
            }
        }
        Object objE2 = qq1Var.q;
        int i4 = qq1Var.s;
        int i5 = 1;
        sq1 sq1Var = a;
        k20 k20Var = k20.h;
        try {
            switch (i4) {
                case 0:
                    fg1.T(objE2);
                    qq1Var.k = str;
                    qq1Var.l = str2;
                    qq1Var.m = j31Var;
                    kl1 kl1Var = c;
                    qq1Var.n = kl1Var;
                    qq1Var.s = 1;
                    Object objD = kl1Var.d(qq1Var);
                    il1Var = kl1Var;
                    r11 = str2;
                    if (objD != k20Var) {
                        try {
                            qq1Var.k = str;
                            qq1Var.l = r11;
                            qq1Var.m = j31Var;
                            qq1Var.n = il1Var;
                            qq1Var.s = 2;
                            objE = sq1Var.e(str, qq1Var);
                            if (objE != k20Var) {
                                ?? r8 = r11;
                                il1Var2 = il1Var;
                                objE2 = objE;
                                str3 = str;
                                j31Var2 = j31Var;
                                r12 = r8;
                                uq1 uq1Var4 = (uq1) objE2;
                                kf2Var = (kf2) uq1Var4.b.a.get(r12);
                                if (kf2Var != null) {
                                    throw new IllegalArgumentException("Unknown script setting '" + r12 + "'.");
                                }
                                if (j31Var2 != null && (strM = up0.M(kf2Var, j31Var2)) != null) {
                                    throw new IllegalArgumentException(strM);
                                }
                                d41 d41Var = uq1Var4.c.a;
                                d41Var.getClass();
                                ?? linkedHashMap = new LinkedHashMap(d41Var);
                                b5 b5Var = j;
                                if (b5Var == null) {
                                    t11.S("configStore");
                                    throw null;
                                }
                                d41 d41Var2 = new d41(linkedHashMap);
                                qq1Var.k = str3;
                                qq1Var.l = null;
                                qq1Var.m = null;
                                qq1Var.n = il1Var2;
                                qq1Var.s = 3;
                                Object objR = p7.R((c20) b5Var.i, new u0(b5Var, str3, d41Var2, (t00) null), qq1Var);
                                if (objR != k20Var) {
                                    objR = a83.a;
                                }
                                if (objR != k20Var) {
                                    str4 = str3;
                                    il1Var3 = il1Var2;
                                    qq1Var.k = str4;
                                    qq1Var.l = null;
                                    qq1Var.m = null;
                                    qq1Var.n = il1Var3;
                                    qq1Var.s = 4;
                                    objE2 = sq1Var.e(str4, qq1Var);
                                    il1Var4 = il1Var3;
                                    if (objE2 == k20Var) {
                                        str5 = str4;
                                        uq1 uq1Var5 = (uq1) objE2;
                                        wj2Var = m;
                                        if (wj2Var != null) {
                                            t11.S("runtimeManager");
                                            throw null;
                                        }
                                        qq1Var.k = str5;
                                        qq1Var.l = null;
                                        qq1Var.m = null;
                                        qq1Var.n = il1Var4;
                                        qq1Var.o = uq1Var5;
                                        qq1Var.s = 5;
                                        Object objK = wj2Var.k(qq1Var);
                                        if (objK != k20Var) {
                                            il1Var5 = il1Var4;
                                            uq1Var = uq1Var5;
                                            objE2 = objK;
                                            il1Var6 = il1Var5;
                                            try {
                                                list = ((yj2) objE2).a;
                                                if (!list.isEmpty()) {
                                                    Iterator it = list.iterator();
                                                    while (it.hasNext()) {
                                                        if (t11.l(((me1) it.next()).a, str5)) {
                                                            if (i5 == 0 && uq1Var.c.a() && (z80Var = (z80) q.get(str5)) != null) {
                                                                wj2 wj2Var2 = m;
                                                                if (wj2Var2 == null) {
                                                                    t11.S("runtimeManager");
                                                                    throw null;
                                                                }
                                                                qq1Var.k = null;
                                                                qq1Var.l = null;
                                                                qq1Var.m = null;
                                                                qq1Var.n = il1Var6;
                                                                qq1Var.o = uq1Var;
                                                                qq1Var.p = i5;
                                                                qq1Var.s = 6;
                                                                objE2 = wj2Var2.g(z80Var, qq1Var);
                                                                if (objE2 != k20Var) {
                                                                    uq1Var3 = uq1Var;
                                                                    il1Var8 = il1Var6;
                                                                    i2 = i5;
                                                                    i5 = i2;
                                                                    uq1Var2 = uq1Var3;
                                                                    il1Var7 = il1Var8;
                                                                    qq1Var.k = null;
                                                                    qq1Var.l = null;
                                                                    qq1Var.m = null;
                                                                    qq1Var.n = il1Var7;
                                                                    qq1Var.o = uq1Var2;
                                                                    qq1Var.p = i5;
                                                                    qq1Var.s = 7;
                                                                    il1Var9 = il1Var7;
                                                                }
                                                            } else {
                                                                uq1 uq1Var6 = uq1Var;
                                                                il1Var7 = il1Var6;
                                                                uq1Var2 = uq1Var6;
                                                                qq1Var.k = null;
                                                                qq1Var.l = null;
                                                                qq1Var.m = null;
                                                                qq1Var.n = il1Var7;
                                                                qq1Var.o = uq1Var2;
                                                                qq1Var.p = i5;
                                                                qq1Var.s = 7;
                                                                il1Var9 = il1Var7;
                                                            }
                                                            break;
                                                        }
                                                    }
                                                }
                                                i5 = 0;
                                                if (i5 == 0) {
                                                }
                                                uq1 uq1Var62 = uq1Var;
                                                il1Var7 = il1Var6;
                                                uq1Var2 = uq1Var62;
                                                qq1Var.k = null;
                                                qq1Var.l = null;
                                                qq1Var.m = null;
                                                qq1Var.n = il1Var7;
                                                qq1Var.o = uq1Var2;
                                                qq1Var.p = i5;
                                                qq1Var.s = 7;
                                                il1Var9 = il1Var7;
                                            } catch (Throwable th) {
                                                th = th;
                                                str2 = il1Var6;
                                                ((kl1) str2).f(null);
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
                            ((kl1) str2).f(null);
                            throw th;
                        }
                    }
                    return k20Var;
                case 1:
                    il1 il1Var10 = qq1Var.n;
                    j31Var = qq1Var.m;
                    String str6 = qq1Var.l;
                    String str7 = qq1Var.k;
                    fg1.T(objE2);
                    il1Var = il1Var10;
                    str = str7;
                    r11 = str6;
                    qq1Var.k = str;
                    qq1Var.l = r11;
                    qq1Var.m = j31Var;
                    qq1Var.n = il1Var;
                    qq1Var.s = 2;
                    objE = sq1Var.e(str, qq1Var);
                    if (objE != k20Var) {
                    }
                    return k20Var;
                case 2:
                    il1 il1Var11 = qq1Var.n;
                    j31Var2 = qq1Var.m;
                    String str8 = qq1Var.l;
                    str3 = qq1Var.k;
                    fg1.T(objE2);
                    il1Var2 = il1Var11;
                    r12 = str8;
                    uq1 uq1Var42 = (uq1) objE2;
                    kf2Var = (kf2) uq1Var42.b.a.get(r12);
                    if (kf2Var != null) {
                    }
                    break;
                case 3:
                    il1 il1Var12 = qq1Var.n;
                    str4 = qq1Var.k;
                    fg1.T(objE2);
                    il1Var3 = il1Var12;
                    qq1Var.k = str4;
                    qq1Var.l = null;
                    qq1Var.m = null;
                    qq1Var.n = il1Var3;
                    qq1Var.s = 4;
                    objE2 = sq1Var.e(str4, qq1Var);
                    il1Var4 = il1Var3;
                    if (objE2 == k20Var) {
                    }
                    return k20Var;
                case 4:
                    il1 il1Var13 = qq1Var.n;
                    str4 = qq1Var.k;
                    fg1.T(objE2);
                    il1Var4 = il1Var13;
                    str5 = str4;
                    uq1 uq1Var52 = (uq1) objE2;
                    wj2Var = m;
                    if (wj2Var != null) {
                    }
                    break;
                case 5:
                    uq1 uq1Var7 = qq1Var.o;
                    il1 il1Var14 = qq1Var.n;
                    str5 = qq1Var.k;
                    fg1.T(objE2);
                    il1Var5 = il1Var14;
                    uq1Var = uq1Var7;
                    il1Var6 = il1Var5;
                    list = ((yj2) objE2).a;
                    if (!list.isEmpty()) {
                    }
                    i5 = 0;
                    if (i5 == 0) {
                    }
                    uq1 uq1Var622 = uq1Var;
                    il1Var7 = il1Var6;
                    uq1Var2 = uq1Var622;
                    qq1Var.k = null;
                    qq1Var.l = null;
                    qq1Var.m = null;
                    qq1Var.n = il1Var7;
                    qq1Var.o = uq1Var2;
                    qq1Var.p = i5;
                    qq1Var.s = 7;
                    il1Var9 = il1Var7;
                    break;
                case AIChatConfig.DefaultContextRounds /* 6 */:
                    i2 = qq1Var.p;
                    uq1 uq1Var8 = qq1Var.o;
                    il1 il1Var15 = qq1Var.n;
                    try {
                        fg1.T(objE2);
                        uq1Var3 = uq1Var8;
                        il1Var8 = il1Var15;
                        i5 = i2;
                        uq1Var2 = uq1Var3;
                        il1Var7 = il1Var8;
                        qq1Var.k = null;
                        qq1Var.l = null;
                        qq1Var.m = null;
                        qq1Var.n = il1Var7;
                        qq1Var.o = uq1Var2;
                        qq1Var.p = i5;
                        qq1Var.s = 7;
                        il1Var9 = il1Var7;
                    } catch (Throwable th3) {
                        th = th3;
                        str2 = il1Var15;
                        ((kl1) str2).f(null);
                        throw th;
                    }
                    break;
                case 7:
                    uq1Var2 = qq1Var.o;
                    il1 il1Var16 = qq1Var.n;
                    fg1.T(objE2);
                    il1Var9 = il1Var16;
                    ((kl1) il1Var9).f(null);
                    return uq1Var2;
                default:
                    s.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:137:? */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:18:0x0045 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v15, resolved type: java.lang.Object */
    /* JADX DEBUG: Multi-variable search result rejected for r1v17, resolved type: java.lang.Object */
    /* JADX DEBUG: Multi-variable search result rejected for r1v18, resolved type: java.lang.Object */
    /* JADX DEBUG: Multi-variable search result rejected for r1v19, resolved type: java.lang.Object */
    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: java.lang.Object */
    /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: java.lang.Object */
    /* JADX DEBUG: Multi-variable search result rejected for r1v6, resolved type: java.lang.Object */
    /* JADX DEBUG: Multi-variable search result rejected for r1v7, resolved type: java.lang.Object */
    /* JADX DEBUG: Multi-variable search result rejected for r1v9, resolved type: java.lang.Object */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(String str, boolean z, u00 u00Var) throws Throwable {
        rq1 rq1Var;
        String str2;
        il1 il1Var;
        boolean z2;
        z80 z80Var;
        String str3;
        int i2;
        String str4;
        il1 il1Var2;
        int i3;
        Object obj;
        String str5;
        Exception exc;
        kj1 kj1Var;
        il1 il1Var3;
        int i4;
        List list;
        sq1 sq1Var = a;
        if (u00Var instanceof rq1) {
            rq1Var = (rq1) u00Var;
            int i5 = rq1Var.r;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                rq1Var.r = i5 - Integer.MIN_VALUE;
            } else {
                rq1Var = new rq1(this, u00Var);
            }
        }
        Object obj2 = rq1Var.p;
        int i6 = rq1Var.r;
        LinkedHashMap linkedHashMap = r;
        k20 k20Var = k20.h;
        if (i6 == 0) {
            fg1.T(obj2);
            str2 = str;
            rq1Var.k = str2;
            kl1 kl1Var = c;
            rq1Var.l = kl1Var;
            rq1Var.n = z;
            rq1Var.r = 1;
            if (kl1Var.d(rq1Var) != k20Var) {
                il1Var = kl1Var;
                z2 = z;
            }
            return k20Var;
        }
        if (i6 != 1) {
            if (i6 != 2) {
                try {
                    if (i6 == 3) {
                        i4 = rq1Var.o;
                        z2 = rq1Var.n;
                        il1Var3 = rq1Var.l;
                        str5 = rq1Var.k;
                        try {
                            fg1.T(obj2);
                            i2 = i4;
                            il1Var = il1Var3;
                            str3 = str5;
                            rq1Var.k = null;
                            rq1Var.l = il1Var;
                            rq1Var.m = null;
                            rq1Var.n = z2;
                            rq1Var.o = i2;
                            rq1Var.r = 5;
                            if (sq1Var.j(rq1Var) != k20Var) {
                            }
                            return k20Var;
                        } catch (Exception e2) {
                            exc = e2;
                            il1Var = il1Var3;
                            try {
                                kj1Var = l;
                                if (kj1Var == null) {
                                    kj1Var.J(str5, false);
                                    throw exc;
                                }
                                t11.S("enabledStore");
                                throw null;
                            } catch (Exception e3) {
                                fg1.m(exc, e3);
                                throw exc;
                            }
                        }
                    }
                    if (i6 == 4) {
                        i3 = rq1Var.o;
                        z2 = rq1Var.n;
                        il1Var2 = rq1Var.l;
                        str4 = rq1Var.k;
                        fg1.T(obj2);
                        i2 = i3;
                        il1Var = il1Var2;
                        str3 = str4;
                        rq1Var.k = null;
                        rq1Var.l = il1Var;
                        rq1Var.m = null;
                        rq1Var.n = z2;
                        rq1Var.o = i2;
                        rq1Var.r = 5;
                        if (sq1Var.j(rq1Var) != k20Var) {
                            obj = il1Var;
                            a83 a83Var = a83.a;
                            ((kl1) obj).f(null);
                            return a83Var;
                        }
                        return k20Var;
                    }
                    if (i6 != 5) {
                        s.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj = rq1Var.l;
                    try {
                        fg1.T(obj2);
                        obj = obj;
                        a83 a83Var2 = a83.a;
                        ((kl1) obj).f(null);
                        return a83Var2;
                    } catch (Throwable th) {
                        th = th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    obj = 4;
                }
            } else {
                boolean z3 = rq1Var.n;
                z80 z80Var2 = rq1Var.m;
                il1 il1Var4 = rq1Var.l;
                String str6 = rq1Var.k;
                try {
                    fg1.T(obj2);
                    z80Var = z80Var2;
                    z2 = z3;
                    str3 = str6;
                    il1Var = il1Var4;
                    list = ((yj2) obj2).a;
                    if (!list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            if (t11.l(((me1) it.next()).a, str3)) {
                                i2 = 1;
                                break;
                            }
                        }
                    }
                    i2 = 0;
                    if (z2) {
                        kj1 kj1Var2 = l;
                        if (kj1Var2 == null) {
                            t11.S("enabledStore");
                            throw null;
                        }
                        kj1Var2.J(str3, false);
                        if (i2 != 0) {
                            wj2 wj2Var = m;
                            if (wj2Var == null) {
                                t11.S("runtimeManager");
                                throw null;
                            }
                            rq1Var.k = str3;
                            rq1Var.l = il1Var;
                            rq1Var.m = null;
                            rq1Var.n = z2;
                            rq1Var.o = i2;
                            rq1Var.r = 4;
                            if (wj2Var.n(str3, xj2.i, rq1Var) != k20Var) {
                                str4 = str3;
                                il1Var2 = il1Var;
                                i3 = i2;
                                i2 = i3;
                                il1Var = il1Var2;
                                str3 = str4;
                            }
                        }
                        rq1Var.k = null;
                        rq1Var.l = il1Var;
                        rq1Var.m = null;
                        rq1Var.n = z2;
                        rq1Var.o = i2;
                        rq1Var.r = 5;
                        if (sq1Var.j(rq1Var) != k20Var) {
                        }
                    } else {
                        pp1 pp1Var = pp1.a;
                        if (pp1.f()) {
                            throw new IllegalStateException(o(R.string.script_settings_security_mode_running_disabled, new Object[0]));
                        }
                        kj1 kj1Var3 = k;
                        if (kj1Var3 == null) {
                            t11.S("permissionStore");
                            throw null;
                        }
                        if (!kj1Var3.C(z80Var.b)) {
                            throw new bq1(str3, b(z80Var.b));
                        }
                        kj1 kj1Var4 = l;
                        if (kj1Var4 == null) {
                            t11.S("enabledStore");
                            throw null;
                        }
                        kj1Var4.J(str3, true);
                        if (i2 == 0) {
                            try {
                                wj2 wj2Var2 = m;
                                if (wj2Var2 == null) {
                                    t11.S("runtimeManager");
                                    throw null;
                                }
                                rq1Var.k = str3;
                                rq1Var.l = il1Var;
                                rq1Var.m = null;
                                rq1Var.n = z2;
                                rq1Var.o = i2;
                                rq1Var.r = 3;
                                if (wj2Var2.l(z80Var, rq1Var) != k20Var) {
                                    str5 = str3;
                                    il1Var3 = il1Var;
                                    i4 = i2;
                                    i2 = i4;
                                    il1Var = il1Var3;
                                    str3 = str5;
                                }
                            } catch (Exception e4) {
                                exc = e4;
                                str5 = str3;
                                kj1Var = l;
                                if (kj1Var == null) {
                                }
                            }
                        }
                        rq1Var.k = null;
                        rq1Var.l = il1Var;
                        rq1Var.m = null;
                        rq1Var.n = z2;
                        rq1Var.o = i2;
                        rq1Var.r = 5;
                        if (sq1Var.j(rq1Var) != k20Var) {
                        }
                    }
                    return k20Var;
                } catch (Throwable th3) {
                    th = th3;
                    obj = il1Var4;
                }
            }
            ((kl1) obj).f(null);
            throw th;
        }
        z2 = rq1Var.n;
        il1Var = rq1Var.l;
        String str7 = rq1Var.k;
        fg1.T(obj2);
        str2 = str7;
        z80Var = (z80) q.get(str2);
        if (z80Var == null) {
            throw new IllegalArgumentException("Script '" + str2 + "' is not available.");
        }
        wj2 wj2Var3 = m;
        if (wj2Var3 == null) {
            t11.S("runtimeManager");
            throw null;
        }
        rq1Var.k = str2;
        rq1Var.l = il1Var;
        rq1Var.m = z80Var;
        rq1Var.n = z2;
        rq1Var.r = 2;
        Object objK = wj2Var3.k(rq1Var);
        if (objK == k20Var) {
            return k20Var;
        }
        str3 = str2;
        obj2 = objK;
        list = ((yj2) obj2).a;
        if (!list.isEmpty()) {
        }
        i2 = 0;
        if (z2) {
        }
        return k20Var;
    }
}
