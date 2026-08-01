package p000;

import android.content.res.AssetManager;
import android.os.Build;
import android.view.ViewConfiguration;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: fn */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0215fn {

    /* JADX INFO: renamed from: a */
    public boolean f1770a;

    /* JADX INFO: renamed from: b */
    public final Object f1771b;

    /* JADX INFO: renamed from: c */
    public final Object f1772c;

    /* JADX INFO: renamed from: d */
    public final Serializable f1773d;

    /* JADX INFO: renamed from: e */
    public Object f1774e;

    /* JADX INFO: renamed from: f */
    public final Object f1775f;

    /* JADX INFO: renamed from: g */
    public Object f1776g;

    /* JADX INFO: renamed from: h */
    public Object f1777h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    public C0215fn(AssetManager assetManager, Executor executor, ss0 ss0Var, String str, File file) {
        this.f1770a = false;
        this.f1771b = executor;
        this.f1772c = ss0Var;
        this.f1776g = str;
        this.f1775f = file;
        int i = Build.VERSION.SDK_INT;
        this.f1773d = i >= 31 ? s91.f5719u : i != 30 ? 0 : s91.f5720v;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m1163a(C0215fn c0215fn, lz0 lz0Var, fg0 fg0Var, float f, float f2, AbstractC0358jk abstractC0358jk) {
        gg0 gg0Var;
        wt0 wt0Var;
        float f3;
        lz0 lz0Var2;
        c0215fn.getClass();
        if (abstractC0358jk instanceof gg0) {
            gg0Var = (gg0) abstractC0358jk;
            int i = gg0Var.f1993l;
            if ((i & Integer.MIN_VALUE) != 0) {
                gg0Var.f1993l = i - Integer.MIN_VALUE;
            } else {
                gg0Var = new gg0(c0215fn, abstractC0358jk);
            }
        }
        gg0 gg0Var2 = gg0Var;
        Object obj = gg0Var2.f1991j;
        int i2 = gg0Var2.f1993l;
        Object obj2 = na1.f4229a;
        Object obj3 = EnumC1007zk.f7916d;
        if (i2 == 0) {
            w60.m4891M(obj);
            zt0 zt0Var = new zt0();
            zt0Var.f7995d = fg0Var;
            c0215fn.m1170h(fg0Var);
            fg0 fg0VarM1165g = m1165g((C0834vb) c0215fn.f1775f);
            if (fg0VarM1165g != null) {
                c0215fn.m1170h(fg0VarM1165g);
                zt0Var.f7995d = ((fg0) zt0Var.f7995d).m1103a(fg0VarM1165g);
            }
            wt0 wt0Var2 = new wt0();
            float fM2096g = lz0Var.m2096g(lz0Var.m2094e(((fg0) zt0Var.f7995d).f1722a));
            wt0Var2.f7189d = fM2096g;
            if (!r60.m3403e(fM2096g)) {
                zt0 zt0Var2 = new zt0();
                zt0Var2.f7995d = pf1.m3045a(0.0f, 0.0f, 30);
                ig0 ig0Var = new ig0(wt0Var2, zt0Var2, zt0Var, f, c0215fn, f2, lz0Var, null);
                gg0Var2.f1988g = lz0Var;
                gg0Var2.f1989h = wt0Var2;
                gg0Var2.f1990i = f2;
                gg0Var2.f1993l = 1;
                if (c0215fn.m1171i(lz0Var, ig0Var, gg0Var2) != obj3) {
                    wt0Var = wt0Var2;
                    f3 = f2;
                    lz0Var2 = lz0Var;
                }
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                w60.m4891M(obj);
                return obj2;
            }
            C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        f3 = gg0Var2.f1990i;
        wt0Var = gg0Var2.f1989h;
        lz0Var2 = gg0Var2.f1988g;
        w60.m4891M(obj);
        C0111d c0111d = (C0111d) c0215fn.f1777h;
        long jM1203b = g60.m1203b(((tb1) c0111d.f919e).m4195b(Float.MAX_VALUE), ((tb1) c0111d.f920f).m4195b(Float.MAX_VALUE));
        if (jM1203b == 0) {
            float fM2093d = lz0Var2.m2093d(Math.signum(wt0Var.f7189d)) * Math.min(Math.abs(wt0Var.f7189d) / 100.0f, f3) * 1000.0f;
            if (fM2093d == 0.0f) {
                jM1203b = 0;
            } else {
                jM1203b = lz0Var2.f3624d == um0.f6265e ? g60.m1203b(fM2093d, 0.0f) : g60.m1203b(0.0f, fM2093d);
            }
        }
        long j = jM1203b;
        C0431lh c0431lh = (C0431lh) c0215fn.f1773d;
        InterfaceC0322ik interfaceC0322ik = null;
        gg0Var2.f1988g = null;
        gg0Var2.f1989h = null;
        gg0Var2.f1993l = 2;
        dz0 dz0Var = (dz0) c0431lh.f7484d;
        InterfaceC0966yk interfaceC0966yk = (InterfaceC0966yk) ((InterfaceC0298hw) dz0Var.f1228N.f7493f).invoke();
        if (interfaceC0966yk != null) {
            AbstractC0307i4.m1547w(interfaceC0966yk, null, new bz0(dz0Var, j, interfaceC0322ik, 1), 3);
            return obj2 == obj3 ? obj3 : obj2;
        }
        C0921xc.m5134o("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m1164b(C0215fn c0215fn, zt0 zt0Var, wt0 wt0Var, lz0 lz0Var, zt0 zt0Var2, long j, AbstractC0358jk abstractC0358jk) throws Throwable {
        jg0 jg0Var;
        wt0 wt0Var2;
        lz0 lz0Var2;
        zt0 zt0Var3;
        boolean z;
        if (abstractC0358jk instanceof jg0) {
            jg0Var = (jg0) abstractC0358jk;
            int i = jg0Var.f2873m;
            if ((i & Integer.MIN_VALUE) != 0) {
                jg0Var.f2873m = i - Integer.MIN_VALUE;
            } else {
                jg0Var = new jg0(abstractC0358jk);
            }
        }
        Object objM4417w = jg0Var.f2872l;
        int i2 = jg0Var.f2873m;
        InterfaceC0322ik interfaceC0322ik = null;
        if (i2 == 0) {
            w60.m4891M(objM4417w);
            if (j < 0) {
                return Boolean.FALSE;
            }
            C0091cg c0091cg = new C0091cg(c0215fn, interfaceC0322ik, 6);
            jg0Var.f2867g = c0215fn;
            jg0Var.f2868h = zt0Var;
            jg0Var.f2869i = wt0Var;
            jg0Var.f2870j = lz0Var;
            jg0Var.f2871k = zt0Var2;
            jg0Var.f2873m = 1;
            objM4417w = v50.m4417w(j, c0091cg, jg0Var);
            EnumC1007zk enumC1007zk = EnumC1007zk.f7916d;
            if (objM4417w == enumC1007zk) {
                return enumC1007zk;
            }
            wt0Var2 = wt0Var;
            lz0Var2 = lz0Var;
            zt0Var3 = zt0Var2;
        } else {
            if (i2 != 1) {
                C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            zt0 zt0Var4 = jg0Var.f2871k;
            lz0 lz0Var3 = jg0Var.f2870j;
            wt0Var2 = jg0Var.f2869i;
            zt0 zt0Var5 = jg0Var.f2868h;
            C0215fn c0215fn2 = jg0Var.f2867g;
            w60.m4891M(objM4417w);
            zt0Var3 = zt0Var4;
            lz0Var2 = lz0Var3;
            zt0Var = zt0Var5;
            c0215fn = c0215fn2;
        }
        fg0 fg0Var = (fg0) objM4417w;
        if (fg0Var != null) {
            boolean z2 = ((fg0) zt0Var.f7995d).f1724c;
            long j2 = fg0Var.f1722a;
            zt0Var.f7995d = new fg0(j2, fg0Var.f1723b, z2);
            wt0Var2.f7189d = lz0Var2.m2098i(lz0Var2.m2094e(j2));
            zt0Var3.f7995d = pf1.m3045a(0.0f, 0.0f, 30);
            c0215fn.m1170h(fg0Var);
            z = !r60.m3403e(wt0Var2.f7189d);
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static fg0 m1165g(C0834vb c0834vb) {
        fg0 fg0Var = null;
        q01 q01VarM4408n = v50.m4408n(new C0187ew(new C0381k6(5, c0834vb), null));
        while (q01VarM4408n.hasNext()) {
            fg0 fg0VarM1103a = (fg0) q01VarM4408n.next();
            if (fg0Var != null) {
                fg0VarM1103a = fg0Var.m1103a(fg0VarM1103a);
            }
            fg0Var = fg0VarM1103a;
        }
        return fg0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public float m1166c(jz0 jz0Var, float f) {
        lz0 lz0Var = (lz0) this.f1771b;
        long jM2097h = lz0Var.m2097h(lz0Var.m2093d(f));
        lz0 lz0Var2 = jz0Var.f2961a;
        return lz0Var.m2096g(lz0Var.m2094e(lz0Var2.m2092c(lz0Var2.f3631k, jM2097h, 1)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public boolean m1167d(ir0 ir0Var) {
        long j;
        ViewConfiguration viewConfiguration = (ViewConfiguration) ((C0910x1) this.f1772c).f7232e;
        float f = -viewConfiguration.getScaledVerticalScrollFactor();
        float f2 = -viewConfiguration.getScaledHorizontalScrollFactor();
        List list = ir0Var.f2610a;
        ok0 ok0Var = new ok0(0L);
        int size = list.size();
        boolean zMo502c = false;
        int i = 0;
        while (true) {
            j = ok0Var.f4590a;
            if (i >= size) {
                break;
            }
            ok0Var = new ok0(ok0.m2934e(j, ((nr0) list.get(i)).f4314j));
            i++;
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)) * f2)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) * f)) & 4294967295L);
        lz0 lz0Var = (lz0) this.f1771b;
        float fM2098i = lz0Var.m2098i(lz0Var.m2094e(jFloatToRawIntBits));
        if (fM2098i != 0.0f) {
            ez0 ez0Var = lz0Var.f3621a;
            zMo502c = fM2098i > 0.0f ? ez0Var.mo502c() : ez0Var.mo500a();
        }
        return zMo502c ? !(((C0834vb) this.f1775f).mo1710s(new fg0(jFloatToRawIntBits, ((nr0) AbstractC0960ye.m5240J(ir0Var.f2610a)).f4306b, false)) instanceof C0836vd) : this.f1770a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public FileInputStream m1168e(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            ((ss0) this.f1772c).mo1736d();
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public void m1169f(int i, Serializable serializable) {
        ((Executor) this.f1771b).execute(new RunnableC0178en(i, 0, this, serializable));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public void m1170h(fg0 fg0Var) {
        C0111d c0111d = (C0111d) this.f1777h;
        long j = fg0Var.f1723b;
        long j2 = fg0Var.f1722a;
        ((tb1) c0111d.f919e).m4194a(Float.intBitsToFloat((int) (j2 >> 32)), j);
        ((tb1) c0111d.f920f).m4194a(Float.intBitsToFloat((int) (j2 & 4294967295L)), j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m1171i(lz0 lz0Var, ig0 ig0Var, AbstractC0358jk abstractC0358jk) throws Throwable {
        kg0 kg0Var;
        if (abstractC0358jk instanceof kg0) {
            kg0Var = (kg0) abstractC0358jk;
            int i = kg0Var.f3144i;
            if ((i & Integer.MIN_VALUE) != 0) {
                kg0Var.f3144i = i - Integer.MIN_VALUE;
            } else {
                kg0Var = new kg0(this, abstractC0358jk);
            }
        }
        Object obj = kg0Var.f3142g;
        int i2 = kg0Var.f3144i;
        InterfaceC0322ik interfaceC0322ik = null;
        if (i2 == 0) {
            w60.m4891M(obj);
            this.f1770a = true;
            C0154e c0154e = new C0154e(lz0Var, ig0Var, interfaceC0322ik, 8);
            kg0Var.f3144i = 1;
            c51 c51Var = new c51(kg0Var, kg0Var.mo540e());
            Object objM1220s = g60.m1220s(c51Var, c51Var, c0154e);
            EnumC1007zk enumC1007zk = EnumC1007zk.f7916d;
            if (objM1220s == enumC1007zk) {
                return enumC1007zk;
            }
        } else {
            if (i2 != 1) {
                C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            w60.m4891M(obj);
        }
        this.f1770a = false;
        return na1.f4229a;
    }

    public C0215fn(lz0 lz0Var, C0910x1 c0910x1, C0431lh c0431lh, InterfaceC0968ym interfaceC0968ym) {
        this.f1771b = lz0Var;
        this.f1772c = c0910x1;
        this.f1773d = c0431lh;
        this.f1774e = interfaceC0968ym;
        this.f1775f = o30.m2765e(Integer.MAX_VALUE, 6, null);
        this.f1777h = new C0111d(10);
    }
}
