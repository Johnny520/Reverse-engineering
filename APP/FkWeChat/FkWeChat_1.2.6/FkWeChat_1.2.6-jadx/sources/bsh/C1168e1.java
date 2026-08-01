package bsh;

import bsh.C1281x0;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.IntStream;

/* JADX INFO: renamed from: bsh.e1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C1168e1 implements Serializable, Cloneable, C1281x0.a {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: A */
    public Object f3527A;

    /* JADX INFO: renamed from: B */
    public boolean f3528B;

    /* JADX INFO: renamed from: C */
    public boolean f3529C;

    /* JADX INFO: renamed from: D */
    public boolean f3530D;

    /* JADX INFO: renamed from: q */
    public C1182g3 f3531q;

    /* JADX INFO: renamed from: r */
    public C1283x2 f3532r;

    /* JADX INFO: renamed from: s */
    public String f3533s;

    /* JADX INFO: renamed from: t */
    public Class f3534t;

    /* JADX INFO: renamed from: u */
    public String[] f3535u;

    /* JADX INFO: renamed from: v */
    public int f3536v;

    /* JADX INFO: renamed from: w */
    public Class[] f3537w;

    /* JADX INFO: renamed from: x */
    public C1283x2[] f3538x;

    /* JADX INFO: renamed from: y */
    public C1196j f3539y;

    /* JADX INFO: renamed from: z */
    public AbstractC1241q2 f3540z;

    public C1168e1(String str, Class cls, String[] strArr, Class[] clsArr, C1283x2[] c1283x2Arr, C1196j c1196j, C1182g3 c1182g3, C1283x2 c1283x2, boolean z10) {
        this.f3529C = false;
        this.f3530D = false;
        this.f3533s = str;
        this.f3534t = cls;
        this.f3535u = strArr;
        this.f3538x = c1283x2Arr;
        if (strArr != null) {
            this.f3536v = strArr.length;
        } else if (clsArr != null) {
            this.f3536v = clsArr.length;
        }
        this.f3537w = clsArr;
        this.f3539y = c1196j;
        this.f3531q = c1182g3;
        this.f3532r = c1283x2;
        this.f3528B = z10;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String[] m4280a(int i10) {
        return new String[i10];
    }

    /* JADX INFO: renamed from: f */
    public static boolean m4282f(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    @Override // bsh.C1281x0.a
    /* JADX INFO: renamed from: b */
    public void mo4283b() {
        this.f3530D = AbstractC1143c4.m4174i0(this.f3534t) || Arrays.asList(this.f3537w).stream().anyMatch(new Predicate() { // from class: bsh.b1
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return AbstractC1143c4.m4174i0((Class) obj);
            }
        });
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public C1168e1 clone() {
        try {
            return (C1168e1) super.clone();
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != getClass()) {
            return false;
        }
        C1168e1 c1168e1 = (C1168e1) obj;
        if (!this.f3533s.equals(c1168e1.f3533s) || m4286h() != c1168e1.m4286h()) {
            return false;
        }
        for (int i10 = 0; i10 < m4286h(); i10++) {
            if (!m4282f(mo4123k()[i10], c1168e1.mo4123k()[i10])) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: g */
    public C1283x2 m4285g() {
        if (this.f3532r == null) {
            this.f3532r = new C1283x2(2);
        }
        return this.f3532r;
    }

    public String getName() {
        AbstractC1241q2 abstractC1241q2 = this.f3540z;
        return abstractC1241q2 == null ? this.f3533s : abstractC1241q2.getName();
    }

    /* JADX INFO: renamed from: h */
    public int m4286h() {
        AbstractC1241q2 abstractC1241q2 = this.f3540z;
        return abstractC1241q2 == null ? this.f3536v : abstractC1241q2.mo4320l();
    }

    public int hashCode() {
        int iHashCode = this.f3533s.hashCode() + getClass().hashCode();
        Class[] clsArrMo4123k = mo4123k();
        int length = clsArrMo4123k.length;
        for (int i10 = 0; i10 < length; i10++) {
            Class cls = clsArrMo4123k[i10];
            iHashCode += (cls == null ? 0 : cls.hashCode()) + 3;
        }
        return iHashCode + m4286h();
    }

    /* JADX INFO: renamed from: i */
    public C1283x2[] m4287i() {
        if (this.f3538x == null) {
            this.f3538x = new C1283x2[m4286h()];
        }
        return this.f3538x;
    }

    /* JADX INFO: renamed from: j */
    public String[] m4288j() {
        if (this.f3535u == null) {
            this.f3535u = (String[]) IntStream.range(97, m4286h() + 97).boxed().map(new Function() { // from class: bsh.c1
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return String.valueOf((char) ((Integer) obj).intValue());
                }
            }).toArray(new IntFunction() { // from class: bsh.d1
                @Override // java.util.function.IntFunction
                public final Object apply(int i10) {
                    return C1168e1.m4280a(i10);
                }
            });
        }
        return this.f3535u;
    }

    /* JADX INFO: renamed from: k */
    public Class[] mo4123k() {
        AbstractC1241q2 abstractC1241q2 = this.f3540z;
        if (abstractC1241q2 != null) {
            return abstractC1241q2.mo4321m();
        }
        m4295s();
        return this.f3537w;
    }

    /* JADX INFO: renamed from: l */
    public Class mo4124l() {
        AbstractC1241q2 abstractC1241q2 = this.f3540z;
        if (abstractC1241q2 != null) {
            return abstractC1241q2.mo4107n();
        }
        m4295s();
        return this.f3534t;
    }

    /* JADX INFO: renamed from: m */
    public boolean m4289m(String str) {
        AbstractC1241q2 abstractC1241q2 = this.f3540z;
        if (abstractC1241q2 != null) {
            return AbstractC1143c4.m4160b0(str, abstractC1241q2.getModifiers());
        }
        C1283x2 c1283x2 = this.f3532r;
        return c1283x2 != null && c1283x2.m5200j(str);
    }

    /* JADX INFO: renamed from: n */
    public Object m4290n(Object[] objArr, RunnableC1205k2 runnableC1205k2) {
        return m4292p(objArr, runnableC1205k2, null, null, false);
    }

    /* JADX INFO: renamed from: o */
    public Object m4291o(Object[] objArr, RunnableC1205k2 runnableC1205k2, C1174f1 c1174f1, InterfaceC1188h3 interfaceC1188h3) {
        return m4292p(objArr, runnableC1205k2, c1174f1, interfaceC1188h3, false);
    }

    /* JADX INFO: renamed from: p */
    public Object m4292p(Object[] objArr, RunnableC1205k2 runnableC1205k2, C1174f1 c1174f1, InterfaceC1188h3 interfaceC1188h3, boolean z10) throws C1163d2 {
        Object objM4400v;
        Object objM4293q;
        RunnableC1205k2.m4462e("Bsh method invoke: ", this.f3533s, " overrideNameSpace: ", Boolean.valueOf(z10));
        if (objArr != null) {
            for (Object obj : objArr) {
                if (obj == null) {
                    throw new Error("HERE!");
                }
            }
        }
        AbstractC1241q2 abstractC1241q2 = this.f3540z;
        if (abstractC1241q2 != null) {
            try {
                if (AbstractC1143c4.m4188p0(abstractC1241q2)) {
                    RunnableC1205k2.f3637H.m37488l(this.f3540z.getDeclaringClass(), this.f3540z.getName(), objArr);
                } else {
                    RunnableC1205k2.f3637H.m37483g(this.f3527A, this.f3540z.getName(), objArr);
                }
                return this.f3540z.mo4332q(this.f3527A, objArr);
            } catch (C1165d4 e10) {
                throw new C1163d2("Error invoking Java method: " + e10, interfaceC1188h3, c1174f1);
            } catch (C1279w4 e11) {
                throw e11.mo5167a(interfaceC1188h3, c1174f1);
            } catch (InvocationTargetException e12) {
                throw new C1231o4("Exception invoking imported object method.", e12, interfaceC1188h3, c1174f1, true);
            }
        }
        C1283x2 c1283x2 = this.f3532r;
        if (c1283x2 == null || !c1283x2.m5200j("synchronized")) {
            return m4293q(objArr, runnableC1205k2, c1174f1, interfaceC1188h3, z10);
        }
        C1182g3 c1182g3 = this.f3531q;
        if (c1182g3.f3570G) {
            try {
                objM4400v = c1182g3.m4400v();
            } catch (C1279w4 unused) {
                throw new C1211l2("Can't get class instance for synchronized method.");
            }
        } else {
            objM4400v = c1182g3.mo4351M(runnableC1205k2);
        }
        synchronized (objM4400v) {
            objM4293q = m4293q(objArr, runnableC1205k2, c1174f1, interfaceC1188h3, z10);
        }
        return objM4293q;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0097  */
    /* JADX INFO: renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m4293q(java.lang.Object[] r17, bsh.RunnableC1205k2 r18, bsh.C1174f1 r19, bsh.InterfaceC1188h3 r20, boolean r21) throws bsh.C1163d2 {
        /*
            Method dump skipped, instruction units count: 546
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bsh.C1168e1.m4293q(java.lang.Object[], bsh.k2, bsh.f1, bsh.h3, boolean):java.lang.Object");
    }

    /* JADX INFO: renamed from: r */
    public boolean m4294r() {
        AbstractC1241q2 abstractC1241q2 = this.f3540z;
        return abstractC1241q2 == null ? this.f3528B : abstractC1241q2.mo4323w();
    }

    /* JADX INFO: renamed from: s */
    public final void m4295s() {
        if (!this.f3530D) {
            return;
        }
        int i10 = 0;
        try {
            this.f3530D = false;
            if (AbstractC1143c4.m4174i0(this.f3534t)) {
                this.f3534t = this.f3531q.m4396t(this.f3534t.getName());
            }
            while (true) {
                Class[] clsArr = this.f3537w;
                if (i10 >= clsArr.length) {
                    return;
                }
                if (AbstractC1143c4.m4174i0(clsArr[i10])) {
                    Class[] clsArr2 = this.f3537w;
                    clsArr2[i10] = this.f3531q.m4396t(clsArr2[i10].getName());
                }
                i10++;
            }
        } catch (C1279w4 unused) {
        }
    }

    public String toString() {
        return "Method: " + AbstractC1225n4.m4975n(this);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1168e1(C1280x c1280x, C1182g3 c1182g3, C1283x2 c1283x2, boolean z10) {
        String str = c1280x.f3866y;
        Class cls = c1280x.f3862E;
        String[] strArrM5066o = c1280x.f3858A.m5066o();
        C1244r c1244r = c1280x.f3858A;
        this(str, cls, strArrM5066o, c1244r.f3787B, c1244r.m5065l(), c1280x.f3859B, c1182g3, c1283x2, c1280x.f3864G);
        this.f3529C = z10;
    }

    public C1168e1(Method method, Object obj) {
        this(AbstractC1241q2.m5054h(method), obj);
    }

    public C1168e1(AbstractC1241q2 abstractC1241q2, Object obj) {
        this(abstractC1241q2.getName(), abstractC1241q2.mo4107n(), null, abstractC1241q2.mo4321m(), null, null, null, null, abstractC1241q2.mo4323w());
        this.f3540z = abstractC1241q2;
        this.f3527A = obj;
    }
}
