package p000;

import android.graphics.Rect;
import android.graphics.Region;
import android.os.Binder;
import android.os.Parcelable;
import android.os.Trace;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.view.View;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;

/* JADX INFO: renamed from: i4 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0307i4 {

    /* JADX INFO: renamed from: d */
    public static final C1014zr f2423d;

    /* JADX INFO: renamed from: e */
    public static final C1014zr f2424e;

    /* JADX INFO: renamed from: j */
    public static final EnumC0472mf f2429j;

    /* JADX INFO: renamed from: k */
    public static final EnumC0472mf f2430k;

    /* JADX INFO: renamed from: l */
    public static final float f2431l;

    /* JADX INFO: renamed from: m */
    public static final ea1 f2432m;

    /* JADX INFO: renamed from: n */
    public static final StackTraceElement[] f2433n;

    /* JADX INFO: renamed from: o */
    public static final qv0 f2434o;

    /* JADX INFO: renamed from: p */
    public static final st0 f2435p;

    /* JADX INFO: renamed from: q */
    public static final jo0 f2436q;

    /* JADX INFO: renamed from: r */
    public static final Object f2437r;

    /* JADX INFO: renamed from: s */
    public static final long f2438s = Long.MIN_VALUE;

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ int f2439t = 0;

    /* JADX INFO: renamed from: u */
    public static r00 f2440u;

    /* JADX INFO: renamed from: a */
    public static final InterfaceC0322ik[] f2420a = new InterfaceC0322ik[0];

    /* JADX INFO: renamed from: b */
    public static final Object f2421b = new Object();

    /* JADX INFO: renamed from: c */
    public static final Class[] f2422c = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    /* JADX INFO: renamed from: f */
    public static final EnumC0472mf f2425f = EnumC0472mf.f3930f;

    /* JADX INFO: renamed from: g */
    public static final EnumC0472mf f2426g = EnumC0472mf.f3937m;

    /* JADX INFO: renamed from: h */
    public static final z01 f2427h = z01.f7748e;

    /* JADX INFO: renamed from: i */
    public static final EnumC0472mf f2428i = EnumC0472mf.f3936l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int i = 1;
        f2423d = new C1014zr("REMOVED_TASK", i);
        f2424e = new C1014zr("CLOSED_EMPTY", i);
        EnumC0472mf enumC0472mf = EnumC0472mf.f3932h;
        f2429j = enumC0472mf;
        f2430k = enumC0472mf;
        f2431l = 80.0f;
        f2432m = ea1.f1365g;
        f2433n = new StackTraceElement[0];
        f2434o = new qv0();
        f2435p = new st0(0.0f, 0.0f, 10.0f, 10.0f);
        f2436q = new jo0(18);
        f2437r = new Object();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A */
    public static byte[] m1515A(FileInputStream fileInputStream, int i, int i2) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i2];
            byte[] bArr2 = new byte[2048];
            int i3 = 0;
            int iInflate = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i3 < i) {
                int i4 = fileInputStream.read(bArr2);
                if (i4 < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i + " bytes");
                }
                inflater.setInput(bArr2, 0, i4);
                try {
                    iInflate += inflater.inflate(bArr, iInflate, i2 - iInflate);
                    i3 += i4;
                } catch (DataFormatException e) {
                    throw new IllegalStateException(e.getMessage());
                }
            }
            if (i3 == i) {
                if (inflater.finished()) {
                    return bArr;
                }
                throw new IllegalStateException("Inflater did not finish");
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i + " actual=" + i3);
        } finally {
            inflater.end();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B */
    public static long m1516B(InputStream inputStream, int i) {
        byte[] bArrM1550z = m1550z(inputStream, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j += ((long) (bArrM1550z[i2] & 255)) << (i2 * 8);
        }
        return j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C */
    public static final Object m1517C(Object obj) {
        return obj instanceof C0688rg ? w60.m4909p(((C0688rg) obj).f5416a) : obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: D */
    public static final long m1518D(long j) {
        int iRound = Math.round(Float.intBitsToFloat((int) (j >> 32)));
        return (((long) Math.round(Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (((long) iRound) << 32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a1 A[PHI: r0
  0x00a1: PHI (r0v11 int) = (r0v5 int), (r0v6 int), (r0v7 int), (r0v8 int) binds: [B:54:0x009f, B:57:0x00a4, B:60:0x00a8, B:63:0x00ac] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m1519E(C0149dv c0149dv, int i, InterfaceC0742sw interfaceC0742sw) {
        int i2;
        int i3;
        Object objInvoke;
        oe0 oe0VarM3050f;
        e70 e70VarM726A0;
        mj0 mj0Var;
        if (!c0149dv.f4529d.f4542q) {
            w10.m4824b("visitAncestors called on an unattached node");
        }
        oe0 oe0Var = c0149dv.f4529d.f4533h;
        b60 b60VarM3039Q = pf1.m3039Q(c0149dv);
        loop0: while (true) {
            i2 = 0;
            i3 = 1;
            objInvoke = null;
            if (b60VarM3039Q == null) {
                oe0VarM3050f = null;
                break;
            }
            if ((b60VarM3039Q.f395I.f3998f.f4532g & 1024) != 0) {
                while (oe0Var != null) {
                    if ((oe0Var.f4531f & 1024) != 0) {
                        oe0VarM3050f = oe0Var;
                        sh0 sh0Var = null;
                        while (oe0VarM3050f != null) {
                            if (oe0VarM3050f instanceof C0149dv) {
                                break loop0;
                            }
                            if ((oe0VarM3050f.f4531f & 1024) != 0 && (oe0VarM3050f instanceof AbstractC0731sm)) {
                                int i4 = 0;
                                for (oe0 oe0Var2 = ((AbstractC0731sm) oe0VarM3050f).f5782s; oe0Var2 != null; oe0Var2 = oe0Var2.f4534i) {
                                    if ((oe0Var2.f4531f & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            oe0VarM3050f = oe0Var2;
                                        } else {
                                            if (sh0Var == null) {
                                                sh0Var = new sh0(new oe0[16]);
                                            }
                                            if (oe0VarM3050f != null) {
                                                sh0Var.m4072b(oe0VarM3050f);
                                                oe0VarM3050f = null;
                                            }
                                            sh0Var.m4072b(oe0Var2);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            oe0VarM3050f = pf1.m3050f(sh0Var);
                        }
                    }
                    oe0Var = oe0Var.f4533h;
                }
            }
            b60VarM3039Q = b60VarM3039Q.m315v();
            oe0Var = (b60VarM3039Q == null || (mj0Var = b60VarM3039Q.f395I) == null) ? null : mj0Var.f3997e;
        }
        C0149dv c0149dv2 = (C0149dv) oe0VarM3050f;
        if ((c0149dv2 == null || !p30.m3002l(c0149dv2.m726A0(), c0149dv.m726A0())) && (e70VarM726A0 = c0149dv.m726A0()) != null) {
            int i5 = 5;
            if (i == 5) {
                i3 = i5;
            } else {
                i5 = 6;
                if (i != 6) {
                    i5 = 3;
                    if (i != 3) {
                        i5 = 4;
                        if (i != 4) {
                            if (i == 1) {
                                i3 = 2;
                            } else if (i != 2) {
                                C0921xc.m5134o("Unsupported direction for beyond bounds layout");
                            }
                        }
                    }
                }
            }
            if (e70VarM726A0.f1319r.mo1044a() <= 0 || !e70VarM726A0.f1319r.mo1046c() || !e70VarM726A0.f4542q) {
                return interfaceC0742sw.invoke(e70.f1318u);
            }
            boolean zM792x0 = e70VarM726A0.m792x0(i3);
            f70 f70Var = e70VarM726A0.f1319r;
            int iMo1045b = zM792x0 ? f70Var.mo1045b() : f70Var.mo1048e();
            zt0 zt0Var = new zt0();
            C0166eb c0166eb = e70VarM726A0.f1320s;
            c0166eb.getClass();
            a70 a70Var = new a70(iMo1045b, iMo1045b);
            c0166eb.f1367a.m4072b(a70Var);
            zt0Var.f7995d = a70Var;
            int iMo1047d = e70VarM726A0.f1319r.mo1047d() * 2;
            int iMo1044a = e70VarM726A0.f1319r.mo1044a();
            if (iMo1047d > iMo1044a) {
                iMo1047d = iMo1044a;
            }
            while (objInvoke == null && e70VarM726A0.m791w0((a70) zt0Var.f7995d, i3) && i2 < iMo1047d) {
                a70 a70Var2 = (a70) zt0Var.f7995d;
                int i6 = a70Var2.f63a;
                int i7 = a70Var2.f64b;
                if (e70VarM726A0.m792x0(i3)) {
                    i7++;
                } else {
                    i6--;
                }
                C0166eb c0166eb2 = e70VarM726A0.f1320s;
                c0166eb2.getClass();
                a70 a70Var3 = new a70(i6, i7);
                c0166eb2.f1367a.m4072b(a70Var3);
                e70VarM726A0.f1320s.f1367a.m4080j((a70) zt0Var.f7995d);
                zt0Var.f7995d = a70Var3;
                i2++;
                pf1.m3039Q(e70VarM726A0).m304k();
                objInvoke = interfaceC0742sw.invoke(new d70(e70VarM726A0, zt0Var, i3));
            }
            e70VarM726A0.f1320s.f1367a.m4080j((a70) zt0Var.f7995d);
            pf1.m3039Q(e70VarM726A0).m304k();
            return objInvoke;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: F */
    public static final String m1520F(Object obj) {
        return (obj.getClass().isAnonymousClass() ? obj.getClass().getName() : obj.getClass().getSimpleName()) + '@' + String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: G */
    public static final la1 m1521G(InterfaceC0322ik interfaceC0322ik, InterfaceC0618pk interfaceC0618pk, Object obj) {
        la1 la1Var = null;
        if ((interfaceC0322ik instanceof InterfaceC0022al) && interfaceC0618pk.mo64l(C0014ad.f108f) != null) {
            InterfaceC0022al interfaceC0022alMo180d = (InterfaceC0022al) interfaceC0322ik;
            while (true) {
                if ((interfaceC0022alMo180d instanceof C0216fo) || (interfaceC0022alMo180d = interfaceC0022alMo180d.mo180d()) == null) {
                    break;
                }
                if (interfaceC0022alMo180d instanceof la1) {
                    la1Var = (la1) interfaceC0022alMo180d;
                    break;
                }
            }
            if (la1Var != null) {
                la1Var.m2010n0(interfaceC0618pk, obj);
            }
        }
        return la1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: H */
    public static final Object m1522H(InterfaceC0618pk interfaceC0618pk, InterfaceC0904ww interfaceC0904ww, AbstractC0358jk abstractC0358jk) throws Throwable {
        InterfaceC0618pk interfaceC0618pkMo540e = abstractC0358jk.mo540e();
        InterfaceC0618pk interfaceC0618pkMo63h = !((Boolean) interfaceC0618pk.mo65p(new C0717s8(12), Boolean.FALSE)).booleanValue() ? interfaceC0618pkMo540e.mo63h(interfaceC0618pk) : m1540p(interfaceC0618pkMo540e, interfaceC0618pk, false);
        pf1.m3060t(interfaceC0618pkMo63h);
        if (interfaceC0618pkMo63h == interfaceC0618pkMo540e) {
            gy0 gy0Var = new gy0(abstractC0358jk, interfaceC0618pkMo63h);
            return g60.m1220s(gy0Var, gy0Var, interfaceC0904ww);
        }
        C0496n2 c0496n2 = C0496n2.f4163w;
        if (p30.m3002l(interfaceC0618pkMo63h.mo64l(c0496n2), interfaceC0618pkMo540e.mo64l(c0496n2))) {
            la1 la1Var = new la1(interfaceC0618pkMo63h, abstractC0358jk);
            InterfaceC0618pk interfaceC0618pk2 = la1Var.f5614h;
            Object objM4035V = s91.m4035V(interfaceC0618pk2, null);
            try {
                return g60.m1220s(la1Var, la1Var, interfaceC0904ww);
            } finally {
                s91.m4026M(interfaceC0618pk2, objM4035V);
            }
        }
        C0216fo c0216fo = new C0216fo(abstractC0358jk, interfaceC0618pkMo63h);
        try {
            pf1.m3041S(rd0.m3497z(rd0.m3484m(c0216fo, c0216fo, interfaceC0904ww)), na1.f4229a);
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C0216fo.f1786j;
            do {
                int i = atomicIntegerFieldUpdater.get(c0216fo);
                if (i != 0) {
                    if (i != 2) {
                        C0921xc.m5134o("Already suspended");
                        return null;
                    }
                    Object objM4034U = s91.m4034U(c0216fo.m1622N());
                    if (objM4034U instanceof C0688rg) {
                        throw ((C0688rg) objM4034U).f5416a;
                    }
                    return objM4034U;
                }
            } while (!atomicIntegerFieldUpdater.compareAndSet(c0216fo, 0, 1));
            return EnumC1007zk.f7916d;
        } catch (Throwable th) {
            c0216fo.mo541i(new bv0(th));
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: I */
    public static void m1523I(ByteArrayOutputStream byteArrayOutputStream, long j, int i) {
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) ((j >> (i2 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: J */
    public static void m1524J(ByteArrayOutputStream byteArrayOutputStream, int i) {
        m1523I(byteArrayOutputStream, i, 2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final void m1525a(final pe0 pe0Var, final x01 x01Var, final C0205fd c0205fd, final C0242gd c0242gd, final C0474mh c0474mh, InterfaceC0356ji interfaceC0356ji, final int i) {
        C0616pi c0616pi = (C0616pi) interfaceC0356ji;
        c0616pi.m3091X(1359693790);
        int i2 = i | (c0616pi.m3104f(x01Var) ? 32 : 16) | (c0616pi.m3104f(c0205fd) ? 256 : 128) | (c0616pi.m3104f(c0242gd) ? 2048 : 1024) | 24576;
        int i3 = 0;
        if (c0616pi.m3082O(i2 & 1, (74899 & i2) != 74898)) {
            c0616pi.m3087T();
            if ((i & 1) != 0 && !c0616pi.m3128y()) {
                c0616pi.m3085R();
            }
            c0616pi.m3120q();
            long j = c0205fd.f1678a;
            long j2 = c0205fd.f1679b;
            float f = c0242gd.f1924a;
            c0616pi.m3090W(-1763481333);
            c0616pi.m3090W(167751211);
            Object objM3080L = c0616pi.m3080L();
            if (objM3080L == C0320ii.f2572a) {
                objM3080L = r60.m3419u(new C0520np(f));
                c0616pi.m3107g0(objM3080L);
            }
            c0616pi.m3119p(false);
            c0616pi.m3119p(false);
            h51.m1275a(pe0Var, x01Var, j, j2, 0.0f, ((C0520np) ((oh0) objM3080L).getValue()).f4301d, AbstractC0398kl.m1937w(-97109725, new C0316id(c0474mh, i3), c0616pi), c0616pi, (i2 & 112) | 14155782, 16);
        } else {
            c0616pi.m3085R();
        }
        ht0 ht0VarM3121r = c0616pi.m3121r();
        if (ht0VarM3121r != null) {
            ht0VarM3121r.f2362d = new InterfaceC0904ww(x01Var, c0205fd, c0242gd, c0474mh, i) { // from class: hd

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ x01 f2210e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ C0205fd f2211f;

                /* JADX INFO: renamed from: g */
                public final /* synthetic */ C0242gd f2212g;

                /* JADX INFO: renamed from: h */
                public final /* synthetic */ C0474mh f2213h;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // p000.InterfaceC0904ww
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM1649A = j50.m1649A(196615);
                    AbstractC0307i4.m1525a(this.f2209d, this.f2210e, this.f2211f, this.f2212g, this.f2213h, (InterfaceC0356ji) obj, iM1649A);
                    return na1.f4229a;
                }
            };
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1526b(ct0 ct0Var, InterfaceC0904ww interfaceC0904ww, InterfaceC0356ji interfaceC0356ji, int i) {
        cb1 cb1Var;
        boolean z;
        ht0 ht0VarM3121r;
        C0616pi c0616pi = (C0616pi) interfaceC0356ji;
        c0616pi.m3091X(-149765515);
        e30 e30Var = c0616pi.f4903x;
        fq0 fq0VarM3115l = c0616pi.m3115l();
        c0616pi.m3088U(201, AbstractC0653qi.f5152b);
        Object objM3080L = c0616pi.m3080L();
        if (p30.m3002l(objM3080L, C0320ii.f2572a)) {
            cb1Var = null;
        } else {
            objM3080L.getClass();
            cb1Var = (cb1) objM3080L;
        }
        at0 at0Var = ct0Var.f886a;
        cb1 cb1VarM208c = at0Var.m208c(ct0Var, cb1Var);
        boolean zEquals = cb1VarM208c.equals(cb1Var);
        if (!zEquals) {
            c0616pi.m3107g0(cb1VarM208c);
        }
        int i2 = 1;
        if (!c0616pi.f4877S) {
            v11 v11Var = c0616pi.f4865G;
            Object objM4366b = v11Var.m4366b(v11Var.f6375b, v11Var.f6380g);
            objM4366b.getClass();
            fq0 fq0Var = (fq0) objM4366b;
            if (!(c0616pi.m3069A() && zEquals) && (ct0Var.f891f || !fq0VarM3115l.containsKey(at0Var))) {
                fq0VarM3115l = fq0VarM3115l.m1175b(at0Var, cb1VarM208c);
            } else if ((zEquals && !c0616pi.f4902w) || !c0616pi.f4902w) {
                fq0VarM3115l = fq0Var;
            }
            if (c0616pi.f4904y || fq0Var != fq0VarM3115l) {
                z = true;
            }
            if (z && !c0616pi.f4877S) {
                c0616pi.m3078J(fq0VarM3115l);
            }
            e30Var.m771c(c0616pi.f4902w ? 1 : 0);
            c0616pi.f4902w = z;
            c0616pi.f4869K = fq0VarM3115l;
            c0616pi.m3086S(202, 0, AbstractC0653qi.f5153c, fq0VarM3115l);
            interfaceC0904ww.invoke(c0616pi, Integer.valueOf((i >> 3) & 14));
            c0616pi.m3119p(false);
            c0616pi.m3119p(false);
            c0616pi.f4902w = e30Var.m770b() != 0;
            c0616pi.f4869K = null;
            ht0VarM3121r = c0616pi.m3121r();
            if (ht0VarM3121r == null) {
                ht0VarM3121r.f2362d = new C0355jh(i, i2, ct0Var, interfaceC0904ww);
                return;
            }
            return;
        }
        if (ct0Var.f891f || !fq0VarM3115l.containsKey(at0Var)) {
            fq0VarM3115l = fq0VarM3115l.m1175b(at0Var, cb1VarM208c);
        }
        c0616pi.f4868J = true;
        z = false;
        if (z) {
            c0616pi.m3078J(fq0VarM3115l);
        }
        e30Var.m771c(c0616pi.f4902w ? 1 : 0);
        c0616pi.f4902w = z;
        c0616pi.f4869K = fq0VarM3115l;
        c0616pi.m3086S(202, 0, AbstractC0653qi.f5153c, fq0VarM3115l);
        interfaceC0904ww.invoke(c0616pi, Integer.valueOf((i >> 3) & 14));
        c0616pi.m3119p(false);
        c0616pi.m3119p(false);
        c0616pi.f4902w = e30Var.m770b() != 0;
        c0616pi.f4869K = null;
        ht0VarM3121r = c0616pi.m3121r();
        if (ht0VarM3121r == null) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1527c(ct0[] ct0VarArr, InterfaceC0904ww interfaceC0904ww, InterfaceC0356ji interfaceC0356ji, int i) {
        fq0 fq0VarM3105f0;
        boolean z;
        ht0 ht0VarM3121r;
        C0616pi c0616pi = (C0616pi) interfaceC0356ji;
        c0616pi.m3091X(415205898);
        e30 e30Var = c0616pi.f4903x;
        fq0 fq0VarM3115l = c0616pi.m3115l();
        c0616pi.m3088U(201, AbstractC0653qi.f5152b);
        if (c0616pi.f4877S) {
            fq0VarM3105f0 = c0616pi.m3105f0(fq0VarM3115l, AbstractC0398kl.m1912C(ct0VarArr, fq0VarM3115l, fq0.f1796g));
            c0616pi.f4868J = true;
        } else {
            v11 v11Var = c0616pi.f4865G;
            Object objM4372h = v11Var.m4372h(v11Var.f6380g, 0);
            objM4372h.getClass();
            fq0 fq0Var = (fq0) objM4372h;
            v11 v11Var2 = c0616pi.f4865G;
            Object objM4372h2 = v11Var2.m4372h(v11Var2.f6380g, 1);
            objM4372h2.getClass();
            fq0 fq0Var2 = (fq0) objM4372h2;
            fq0 fq0VarM1912C = AbstractC0398kl.m1912C(ct0VarArr, fq0VarM3115l, fq0Var2);
            if (!c0616pi.m3069A() || c0616pi.f4904y || !fq0Var2.equals(fq0VarM1912C)) {
                fq0VarM3105f0 = c0616pi.m3105f0(fq0VarM3115l, fq0VarM1912C);
                if (c0616pi.f4904y || !p30.m3002l(fq0VarM3105f0, fq0Var)) {
                    z = true;
                }
                if (z && !c0616pi.f4877S) {
                    c0616pi.m3078J(fq0VarM3105f0);
                }
                e30Var.m771c(c0616pi.f4902w ? 1 : 0);
                c0616pi.f4902w = z;
                c0616pi.f4869K = fq0VarM3105f0;
                c0616pi.m3086S(202, 0, AbstractC0653qi.f5153c, fq0VarM3105f0);
                interfaceC0904ww.invoke(c0616pi, Integer.valueOf((i >> 3) & 14));
                c0616pi.m3119p(false);
                c0616pi.m3119p(false);
                c0616pi.f4902w = e30Var.m770b() != 0;
                c0616pi.f4869K = null;
                ht0VarM3121r = c0616pi.m3121r();
                if (ht0VarM3121r == null) {
                    ht0VarM3121r.f2362d = new C0355jh(i, 2, ct0VarArr, interfaceC0904ww);
                    return;
                }
                return;
            }
            c0616pi.f4891l = c0616pi.f4865G.m4383s() + c0616pi.f4891l;
            fq0VarM3105f0 = fq0Var;
        }
        z = false;
        if (z) {
            c0616pi.m3078J(fq0VarM3105f0);
        }
        e30Var.m771c(c0616pi.f4902w ? 1 : 0);
        c0616pi.f4902w = z;
        c0616pi.f4869K = fq0VarM3105f0;
        c0616pi.m3086S(202, 0, AbstractC0653qi.f5153c, fq0VarM3105f0);
        interfaceC0904ww.invoke(c0616pi, Integer.valueOf((i >> 3) & 14));
        c0616pi.m3119p(false);
        c0616pi.m3119p(false);
        c0616pi.f4902w = e30Var.m770b() != 0;
        c0616pi.f4869K = null;
        ht0VarM3121r = c0616pi.m3121r();
        if (ht0VarM3121r == null) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static C1009zm m1528d() {
        return new C1009zm(1.0f, 1.0f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static final void m1529e(InterfaceC0298hw interfaceC0298hw, C0932xn c0932xn, C0474mh c0474mh, InterfaceC0356ji interfaceC0356ji, int i) {
        C0474mh c0474mh2;
        int i2;
        int i3;
        Object obj;
        C0616pi c0616pi = (C0616pi) interfaceC0356ji;
        c0616pi.m3091X(826668973);
        int i4 = 2;
        int i5 = i | (c0616pi.m3108h(interfaceC0298hw) ? 4 : 2) | (c0616pi.m3104f(c0932xn) ? 32 : 16);
        if (c0616pi.m3082O(i5 & 1, (i5 & 147) != 146)) {
            View view = (View) c0616pi.m3112j(AbstractC0676r4.f5294e);
            InterfaceC0968ym interfaceC0968ym = (InterfaceC0968ym) c0616pi.m3112j(AbstractC0131dj.f1121h);
            k50 k50Var = (k50) c0616pi.m3112j(AbstractC0131dj.f1127n);
            C0513ni c0513niM2785y = o30.m2785y(c0616pi);
            c0474mh2 = c0474mh;
            oh0 oh0VarM3424z = r60.m3424z(c0474mh2, c0616pi);
            Object[] objArr = new Object[0];
            Object objM3080L = c0616pi.m3080L();
            C0675r3 c0675r3 = C0320ii.f2572a;
            Object obj2 = objM3080L;
            if (objM3080L == c0675r3) {
                C0342j4 c0342j4 = C0342j4.f2698j;
                c0616pi.m3107g0(c0342j4);
                obj2 = c0342j4;
            }
            UUID uuid = (UUID) r60.m3422x(Arrays.copyOf(objArr, 0), o30.f4444n, (InterfaceC0298hw) obj2, c0616pi, 3456);
            boolean zM3104f = c0616pi.m3104f(view) | c0616pi.m3104f(interfaceC0968ym);
            Object objM3080L2 = c0616pi.m3080L();
            if (zM3104f || objM3080L2 == c0675r3) {
                DialogC1010zn dialogC1010zn = new DialogC1010zn(interfaceC0298hw, c0932xn, view, k50Var, interfaceC0968ym, uuid);
                C0634q c0634q = new C0634q(i4, oh0VarM3424z);
                i2 = 1;
                C0474mh c0474mh3 = new C0474mh(346960332, true, c0634q);
                C0895wn c0895wn = dialogC1010zn.f7935k;
                c0895wn.setParentCompositionContext(c0513niM2785y);
                c0895wn.f7152m.setValue(c0474mh3);
                c0895wn.f7156q = true;
                if (c0895wn.f5255g == null && !c0895wn.isAttachedToWindow()) {
                    C0921xc.m5134o("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.");
                    return;
                } else {
                    c0895wn.m3368d();
                    c0616pi.m3107g0(dialogC1010zn);
                    objM3080L2 = dialogC1010zn;
                }
            } else {
                i2 = 1;
            }
            DialogC1010zn dialogC1010zn2 = (DialogC1010zn) objM3080L2;
            boolean zM3108h = c0616pi.m3108h(dialogC1010zn2);
            Object objM3080L3 = c0616pi.m3080L();
            if (zM3108h || objM3080L3 == c0675r3) {
                i3 = 0;
                C0950y4 c0950y4 = new C0950y4(dialogC1010zn2, i3);
                c0616pi.m3107g0(c0950y4);
                obj = c0950y4;
            } else {
                i3 = 0;
                obj = objM3080L3;
            }
            s91.m4038c(dialogC1010zn2, (InterfaceC0742sw) obj, c0616pi);
            int i6 = (c0616pi.m3108h(dialogC1010zn2) ? 1 : 0) | ((i5 & 14) == 4 ? i2 : i3);
            if ((i5 & 112) == 32) {
                i3 = i2;
            }
            int i7 = i3 | i6 | (c0616pi.m3100d(k50Var.ordinal()) ? 1 : 0);
            Object objM3080L4 = c0616pi.m3080L();
            Object obj3 = objM3080L4;
            if (i7 != 0 || objM3080L4 == c0675r3) {
                C0987z4 c0987z4 = new C0987z4(dialogC1010zn2, interfaceC0298hw, c0932xn, k50Var);
                c0616pi.m3107g0(c0987z4);
                obj3 = c0987z4;
            }
            s91.m4040e((InterfaceC0298hw) obj3, c0616pi);
        } else {
            c0474mh2 = c0474mh;
            c0616pi.m3085R();
        }
        ht0 ht0VarM3121r = c0616pi.m3121r();
        if (ht0VarM3121r != null) {
            ht0VarM3121r.f2362d = new C0418l4(interfaceC0298hw, c0932xn, c0474mh2, i, 1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static final void m1530f(pe0 pe0Var, InterfaceC0904ww interfaceC0904ww, InterfaceC0356ji interfaceC0356ji, int i) {
        C0616pi c0616pi = (C0616pi) interfaceC0356ji;
        c0616pi.m3091X(-1298353104);
        int i2 = i | 6 | (c0616pi.m3108h(interfaceC0904ww) ? 32 : 16);
        if (c0616pi.m3082O(i2 & 1, (i2 & 19) != 18)) {
            Object objM3080L = c0616pi.m3080L();
            if (objM3080L == C0320ii.f2572a) {
                objM3080L = new x41(C0496n2.f4134N);
                c0616pi.m3107g0(objM3080L);
            }
            me0 me0Var = me0.f3922a;
            m1531g((x41) objM3080L, me0Var, interfaceC0904ww, c0616pi, (i2 << 3) & 1008);
            pe0Var = me0Var;
        } else {
            c0616pi.m3085R();
        }
        ht0 ht0VarM3121r = c0616pi.m3121r();
        if (ht0VarM3121r != null) {
            ht0VarM3121r.f2362d = new C0459m4(pe0Var, interfaceC0904ww, i, 4);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static final void m1531g(x41 x41Var, pe0 pe0Var, InterfaceC0904ww interfaceC0904ww, InterfaceC0356ji interfaceC0356ji, int i) {
        int i2;
        C0616pi c0616pi = (C0616pi) interfaceC0356ji;
        c0616pi.m3091X(-511989831);
        if ((i & 6) == 0) {
            i2 = (c0616pi.m3108h(x41Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c0616pi.m3104f(pe0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c0616pi.m3108h(interfaceC0904ww) ? 256 : 128;
        }
        if (c0616pi.m3082O(i2 & 1, (i2 & 147) != 146)) {
            int iHashCode = Long.hashCode(c0616pi.f4878T);
            C0513ni c0513niM2785y = o30.m2785y(c0616pi);
            pe0 pe0VarM4020E = s91.m4020E(c0616pi, pe0Var);
            fq0 fq0VarM3115l = c0616pi.m3115l();
            C0094cj c0094cj = C0094cj.f823i;
            c0616pi.m3093Z();
            if (c0616pi.f4877S) {
                c0616pi.m3114k(c0094cj);
            } else {
                c0616pi.m3113j0();
            }
            w60.m4888J(c0616pi, x41Var.f7259c, x41Var);
            w60.m4888J(c0616pi, x41Var.f7260d, c0513niM2785y);
            w60.m4888J(c0616pi, x41Var.f7261e, interfaceC0904ww);
            InterfaceC0210fi.f1733b.getClass();
            w60.m4888J(c0616pi, C0173ei.f1459d, fq0VarM3115l);
            w60.m4885G(c0616pi, C0173ei.f1462g);
            w60.m4888J(c0616pi, C0173ei.f1458c, pe0VarM4020E);
            w60.m4918y(c0616pi, Integer.valueOf(iHashCode), C0173ei.f1461f);
            c0616pi.m3119p(true);
            if (c0616pi.m3069A()) {
                c0616pi.m3090W(-1266202711);
            } else {
                c0616pi.m3090W(-1259244916);
                boolean zM3108h = c0616pi.m3108h(x41Var);
                Object objM3080L = c0616pi.m3080L();
                if (zM3108h || objM3080L == C0320ii.f2572a) {
                    objM3080L = new C0310i7(9, x41Var);
                    c0616pi.m3107g0(objM3080L);
                }
                s91.m4040e((InterfaceC0298hw) objM3080L, c0616pi);
            }
            c0616pi.m3119p(false);
        } else {
            c0616pi.m3085R();
        }
        ht0 ht0VarM3121r = c0616pi.m3121r();
        if (ht0VarM3121r != null) {
            ht0VarM3121r.f2362d = new u41(x41Var, pe0Var, interfaceC0904ww, i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static final void m1532h(pe0 pe0Var, InterfaceC0904ww interfaceC0904ww, InterfaceC0356ji interfaceC0356ji, int i) {
        int i2;
        C0616pi c0616pi = (C0616pi) interfaceC0356ji;
        c0616pi.m3091X(1090521195);
        if ((i & 6) == 0) {
            i2 = (c0616pi.m3104f(pe0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c0616pi.m3108h(interfaceC0904ww) ? 32 : 16;
        }
        if (c0616pi.m3082O(i2 & 1, (i2 & 19) != 18)) {
            Object objM3080L = c0616pi.m3080L();
            if (objM3080L == C0320ii.f2572a) {
                objM3080L = C0043b5.f374b;
                c0616pi.m3107g0(objM3080L);
            }
            xd0 xd0Var = (xd0) objM3080L;
            int iHashCode = Long.hashCode(c0616pi.f4878T);
            fq0 fq0VarM3115l = c0616pi.m3115l();
            pe0 pe0VarM4020E = s91.m4020E(c0616pi, pe0Var);
            InterfaceC0210fi.f1733b.getClass();
            C0094cj c0094cj = C0173ei.f1457b;
            int i3 = (((((i2 << 3) & 112) | (((i2 >> 3) & 14) | 384)) << 6) & 896) | 6;
            c0616pi.m3093Z();
            if (c0616pi.f4877S) {
                c0616pi.m3114k(c0094cj);
            } else {
                c0616pi.m3113j0();
            }
            w60.m4888J(c0616pi, C0173ei.f1460e, xd0Var);
            w60.m4888J(c0616pi, C0173ei.f1459d, fq0VarM3115l);
            w60.m4918y(c0616pi, Integer.valueOf(iHashCode), C0173ei.f1461f);
            w60.m4885G(c0616pi, C0173ei.f1462g);
            w60.m4888J(c0616pi, C0173ei.f1458c, pe0VarM4020E);
            interfaceC0904ww.invoke(c0616pi, Integer.valueOf((i3 >> 6) & 14));
            c0616pi.m3119p(true);
        } else {
            c0616pi.m3085R();
        }
        ht0 ht0VarM3121r = c0616pi.m3121r();
        if (ht0VarM3121r != null) {
            ht0VarM3121r.f2362d = new C0079c5(pe0Var, interfaceC0904ww, i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static pe0 m1533i() {
        return new C0882wa();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static final boolean m1534j(Object obj) {
        if (obj instanceof x21) {
            x21 x21Var = (x21) obj;
            if (x21Var.mo595d() == C0496n2.f4133M || x21Var.mo595d() == C0496n2.f4141U || x21Var.mo595d() == C0496n2.f4138R) {
                Object value = x21Var.getValue();
                if (value == null) {
                    return true;
                }
                return m1534j(value);
            }
        } else if (!(obj instanceof InterfaceC0188ex) || !(obj instanceof Serializable)) {
            for (int i = 0; i < 7; i++) {
                if (f2422c[i].isInstance(obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static final void m1535k(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                AbstractC0398kl.m1920f(th, th2);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static byte[] m1536l(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static final AbstractC0046b8 m1537m(AbstractC0046b8 abstractC0046b8) {
        AbstractC0046b8 abstractC0046b8Mo28c = abstractC0046b8.mo28c();
        int iMo27b = abstractC0046b8Mo28c.mo27b();
        for (int i = 0; i < iMo27b; i++) {
            abstractC0046b8Mo28c.mo30e(abstractC0046b8.mo26a(i), i);
        }
        return abstractC0046b8Mo28c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static final C0149dv m1538n(C0149dv c0149dv) {
        C0149dv c0149dvM5612f = ((C1017zu) ((ViewTreeObserverOnGlobalLayoutListenerC0875w3) pf1.m3040R(c0149dv)).getFocusOwner()).m5612f();
        if (c0149dvM5612f == null || !c0149dvM5612f.f4542q) {
            return null;
        }
        return c0149dvM5612f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public static final st0 m1539o(C0149dv c0149dv) {
        qj0 qj0Var;
        if (c0149dv.f4542q && (qj0Var = c0149dv.f4536k) != null) {
            i50 i50VarM1662l = j50.m1662l(qj0Var);
            if (!i50VarM1662l.mo348z()) {
                i50VarM1662l = null;
            }
            if (i50VarM1662l != null) {
                return c0149dv.m735z0(i50VarM1662l);
            }
        }
        return st0.f5831e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public static final InterfaceC0618pk m1540p(InterfaceC0618pk interfaceC0618pk, InterfaceC0618pk interfaceC0618pk2, boolean z) {
        Boolean bool = Boolean.FALSE;
        int i = 12;
        boolean zBooleanValue = ((Boolean) interfaceC0618pk.mo65p(new C0717s8(i), bool)).booleanValue();
        boolean zBooleanValue2 = ((Boolean) interfaceC0618pk2.mo65p(new C0717s8(i), bool)).booleanValue();
        if (!zBooleanValue && !zBooleanValue2) {
            return interfaceC0618pk.mo63h(interfaceC0618pk2);
        }
        C0717s8 c0717s8 = new C0717s8(10);
        C0220fs c0220fs = C0220fs.f1799d;
        InterfaceC0618pk interfaceC0618pk3 = (InterfaceC0618pk) interfaceC0618pk.mo65p(c0717s8, c0220fs);
        Object objMo65p = interfaceC0618pk2;
        if (zBooleanValue2) {
            objMo65p = interfaceC0618pk2.mo65p(new C0717s8(11), c0220fs);
        }
        return interfaceC0618pk3.mo63h((InterfaceC0618pk) objMo65p);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006b, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0026, code lost:
    
        continue;
     */
    /* JADX INFO: renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final C0149dv m1541q(C0149dv c0149dv) {
        boolean z = c0149dv.f4529d.f4542q;
        if (z) {
            if (!z) {
                w10.m4824b("visitChildren called on an unattached node");
            }
            sh0 sh0Var = new sh0(new oe0[16]);
            oe0 oe0Var = c0149dv.f4529d;
            oe0 oe0Var2 = oe0Var.f4534i;
            if (oe0Var2 == null) {
                pf1.m3049e(sh0Var, oe0Var);
            } else {
                sh0Var.m4072b(oe0Var2);
            }
            loop0: while (true) {
                int i = sh0Var.f5770f;
                if (i == 0) {
                    break;
                }
                oe0 oe0VarM3050f = (oe0) sh0Var.m4081k(i - 1);
                if ((oe0VarM3050f.f4532g & 1024) == 0) {
                    pf1.m3049e(sh0Var, oe0VarM3050f);
                } else {
                    while (true) {
                        if (oe0VarM3050f == null) {
                            break;
                        }
                        if ((oe0VarM3050f.f4531f & 1024) != 0) {
                            sh0 sh0Var2 = null;
                            while (oe0VarM3050f != null) {
                                if (oe0VarM3050f instanceof C0149dv) {
                                    C0149dv c0149dv2 = (C0149dv) oe0VarM3050f;
                                    if (c0149dv2.f4529d.f4542q) {
                                        int iOrdinal = c0149dv2.m727B0().ordinal();
                                        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
                                            break loop0;
                                        }
                                        if (iOrdinal != 3) {
                                            C0921xc.m5129j();
                                            return null;
                                        }
                                    }
                                } else if ((oe0VarM3050f.f4531f & 1024) != 0 && (oe0VarM3050f instanceof AbstractC0731sm)) {
                                    int i2 = 0;
                                    for (oe0 oe0Var3 = ((AbstractC0731sm) oe0VarM3050f).f5782s; oe0Var3 != null; oe0Var3 = oe0Var3.f4534i) {
                                        if ((oe0Var3.f4531f & 1024) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                oe0VarM3050f = oe0Var3;
                                            } else {
                                                if (sh0Var2 == null) {
                                                    sh0Var2 = new sh0(new oe0[16]);
                                                }
                                                if (oe0VarM3050f != null) {
                                                    sh0Var2.m4072b(oe0VarM3050f);
                                                    oe0VarM3050f = null;
                                                }
                                                sh0Var2.m4072b(oe0Var3);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                oe0VarM3050f = pf1.m3050f(sh0Var2);
                            }
                        } else {
                            oe0VarM3050f = oe0VarM3050f.f4534i;
                        }
                    }
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public static final ug0 m1542r(a01 a01Var, InterfaceC0742sw interfaceC0742sw) {
        Trace.beginSection("getAllUncoveredSemanticsNodesToIntObjectMap");
        try {
            xz0 xz0VarM2a = a01Var.m2a();
            b60 b60Var = xz0VarM2a.f7470c;
            if (b60Var.m273I() && b60Var.m272H()) {
                ug0 ug0Var = new ug0(48);
                C0910x1 c0910x1 = new C0910x1(24);
                a30 a30VarM1939y = AbstractC0398kl.m1939y(xz0VarM2a.m5185g());
                ((Region) c0910x1.f7232e).set(a30VarM1939y.f39a, a30VarM1939y.f40b, a30VarM1939y.f41c, a30VarM1939y.f42d);
                m1543s(c0910x1, xz0VarM2a, ug0Var, interfaceC0742sw, xz0VarM2a, new C0910x1(24));
                return ug0Var;
            }
            ug0 ug0Var2 = v20.f6389a;
            ug0Var2.getClass();
            return ug0Var2;
        } finally {
            Trace.endSection();
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: xz0.j(int, xz0):java.util.List */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public static final void m1543s(C0910x1 c0910x1, xz0 xz0Var, ug0 ug0Var, InterfaceC0742sw interfaceC0742sw, xz0 xz0Var2, C0910x1 c0910x12) {
        st0 st0VarM3286b1;
        b60 b60Var;
        xz0 xz0Var3 = xz0Var;
        int i = xz0Var3.f7474g;
        C0910x1 c0910x13 = c0910x12;
        Region region = (Region) c0910x13.f7232e;
        b60 b60Var2 = xz0Var2.f7470c;
        int i2 = xz0Var2.f7474g;
        boolean z = (b60Var2.m273I() && b60Var2.m272H()) ? false : true;
        C0910x1 c0910x14 = c0910x1;
        Region region2 = (Region) c0910x14.f7232e;
        if (!region2.isEmpty() || i2 == i) {
            if (!z || xz0Var2.f7472e) {
                Object objM5184f = xz0Var2.m5184f();
                if (objM5184f == null) {
                    st0VarM3286b1 = b60Var2.f395I.f3995c.m3286b1();
                } else {
                    oe0 oe0Var = ((oe0) objM5184f).f4529d;
                    Object objM1701g = xz0Var2.f7471d.f5877d.m1701g(rz0.f5589b);
                    if (objM1701g == null) {
                        objM1701g = null;
                    }
                    boolean z2 = objM1701g != null;
                    if (!oe0Var.f4529d.f4542q) {
                        st0VarM3286b1 = st0.f5831e;
                    } else if (z2) {
                        st0VarM3286b1 = pf1.m3037O(oe0Var, 8).m3286b1();
                    } else {
                        qj0 qj0VarM3037O = pf1.m3037O(oe0Var, 8);
                        st0VarM3286b1 = j50.m1662l(qj0VarM3037O).mo341B(qj0VarM3037O, true);
                    }
                }
                a30 a30VarM1939y = AbstractC0398kl.m1939y(st0VarM3286b1);
                region.set(a30VarM1939y.f39a, a30VarM1939y.f40b, a30VarM1939y.f41c, a30VarM1939y.f42d);
                if (i2 == i) {
                    i2 = -1;
                }
                if (!region.op(region2, Region.Op.INTERSECT)) {
                    if (xz0Var2.f7472e) {
                        xz0 xz0VarM5189l = xz0Var2.m5189l();
                        ug0Var.m4330i(i2, new zz0(xz0Var2, AbstractC0398kl.m1939y((xz0VarM5189l == null || (b60Var = xz0VarM5189l.f7470c) == null || !b60Var.m273I()) ? f2435p : xz0VarM5189l.m5185g())));
                        return;
                    } else {
                        if (i2 == -1) {
                            Rect bounds = region.getBounds();
                            ug0Var.m4330i(i2, new zz0(xz0Var2, new a30(bounds.left, bounds.top, bounds.right, bounds.bottom)));
                            return;
                        }
                        return;
                    }
                }
                Rect bounds2 = region.getBounds();
                ug0Var.m4330i(i2, new zz0(xz0Var2, new a30(bounds2.left, bounds2.top, bounds2.right, bounds2.bottom)));
                List listM5178j = xz0.m5178j(4, xz0Var2);
                int size = listM5178j.size() - 1;
                while (-1 < size) {
                    if (!((Boolean) interfaceC0742sw.invoke(listM5178j.get(size))).booleanValue()) {
                        m1543s(c0910x14, xz0Var3, ug0Var, interfaceC0742sw, (xz0) listM5178j.get(size), c0910x13);
                    }
                    size--;
                    c0910x14 = c0910x1;
                    xz0Var3 = xz0Var;
                    c0910x13 = c0910x12;
                }
                if (m1546v(xz0Var2)) {
                    region2.op(a30VarM1939y.f39a, a30VarM1939y.f40b, a30VarM1939y.f41c, a30VarM1939y.f42d, Region.Op.DIFFERENCE);
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public static final boolean m1544t(C0149dv c0149dv) {
        b60 b60Var;
        qj0 qj0Var;
        b60 b60Var2;
        qj0 qj0Var2 = c0149dv.f4536k;
        return (qj0Var2 == null || (b60Var = qj0Var2.f5180r) == null || !b60Var.m273I() || (qj0Var = c0149dv.f4536k) == null || (b60Var2 = qj0Var.f5180r) == null || !b60Var2.m272H()) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public static final boolean m1545u(xz0 xz0Var) {
        qj0 qj0VarM5182d = xz0Var.m5182d();
        jh0 jh0Var = xz0Var.f7471d.f5877d;
        return (qj0VarM5182d != null ? qj0VarM5182d.m3274O0() : false) || jh0Var.m1697c(b01.f337p) || jh0Var.m1697c(b01.f336o);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX INFO: renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean m1546v(xz0 xz0Var) {
        if (!m1545u(xz0Var)) {
            sz0 sz0Var = xz0Var.f7471d;
            if (sz0Var.f5879f) {
                return true;
            }
            jh0 jh0Var = sz0Var.f5877d;
            Object[] objArr = jh0Var.f2879b;
            Object[] objArr2 = jh0Var.f2880c;
            long[] jArr = jh0Var.f2878a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                int i4 = (i << 3) + i3;
                                Object obj = objArr[i4];
                                Object obj2 = objArr2[i4];
                                if (((e01) obj).f1255c) {
                                    return true;
                                }
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        }
                        if (i == length) {
                            break;
                        }
                        i++;
                    }
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public static r31 m1547w(InterfaceC0966yk interfaceC0966yk, InterfaceC0618pk interfaceC0618pk, InterfaceC0904ww interfaceC0904ww, int i) {
        if ((i & 1) != 0) {
            interfaceC0618pk = C0220fs.f1799d;
        }
        EnumC0059bl enumC0059bl = (i & 2) != 0 ? EnumC0059bl.f538d : EnumC0059bl.f541g;
        InterfaceC0618pk interfaceC0618pkM1540p = m1540p(interfaceC0966yk.mo1328f(), interfaceC0618pk, true);
        C0436lm c0436lm = AbstractC0326io.f2592a;
        if (interfaceC0618pkM1540p != c0436lm && interfaceC0618pkM1540p.mo64l(C0496n2.f4163w) == null) {
            interfaceC0618pkM1540p = interfaceC0618pkM1540p.mo63h(c0436lm);
        }
        r31 g90Var = enumC0059bl == EnumC0059bl.f539e ? new g90(interfaceC0618pkM1540p, interfaceC0904ww) : new r31(interfaceC0618pkM1540p, true);
        g90Var.m3990l0(enumC0059bl, g90Var, interfaceC0904ww);
        return g90Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    public static final pe0 m1548x(InterfaceC0941xw interfaceC0941xw) {
        return new l50(interfaceC0941xw);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    public static final long m1549y(long j, long j2) {
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)) + ((int) (j2 >> 32)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) + ((int) (j2 & 4294967295L)))) & 4294967295L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z */
    public static byte[] m1550z(InputStream inputStream, int i) throws IOException {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = inputStream.read(bArr, i2, i - i2);
            if (i3 < 0) {
                C0921xc.m5134o(AbstractC0748t1.m4154l("Not enough bytes to read: ", i));
                return null;
            }
            i2 += i3;
        }
        return bArr;
    }
}
