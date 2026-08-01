package p000;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: renamed from: pi */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0616pi implements InterfaceC0356ji {

    /* JADX INFO: renamed from: A */
    public int f4859A;

    /* JADX INFO: renamed from: B */
    public int f4860B;

    /* JADX INFO: renamed from: C */
    public boolean f4861C;

    /* JADX INFO: renamed from: D */
    public final C0552oi f4862D;

    /* JADX INFO: renamed from: E */
    public final ArrayList f4863E;

    /* JADX INFO: renamed from: F */
    public boolean f4864F;

    /* JADX INFO: renamed from: G */
    public v11 f4865G;

    /* JADX INFO: renamed from: H */
    public w11 f4866H;

    /* JADX INFO: renamed from: I */
    public z11 f4867I;

    /* JADX INFO: renamed from: J */
    public boolean f4868J;

    /* JADX INFO: renamed from: K */
    public fq0 f4869K;

    /* JADX INFO: renamed from: L */
    public C0351jd f4870L;

    /* JADX INFO: renamed from: M */
    public final C0395ki f4871M;

    /* JADX INFO: renamed from: N */
    public C0788u2 f4872N;

    /* JADX INFO: renamed from: O */
    public C0901wt f4873O;

    /* JADX INFO: renamed from: P */
    public j11 f4874P;

    /* JADX INFO: renamed from: Q */
    public final C0890wi f4875Q;

    /* JADX INFO: renamed from: R */
    public final InterfaceC0618pk f4876R;

    /* JADX INFO: renamed from: S */
    public boolean f4877S;

    /* JADX INFO: renamed from: T */
    public long f4878T;

    /* JADX INFO: renamed from: U */
    public C0853vi f4879U;

    /* JADX INFO: renamed from: a */
    public final ja1 f4880a;

    /* JADX INFO: renamed from: b */
    public final AbstractC0727si f4881b;

    /* JADX INFO: renamed from: c */
    public final w11 f4882c;

    /* JADX INFO: renamed from: d */
    public final mh0 f4883d;

    /* JADX INFO: renamed from: e */
    public final C0351jd f4884e;

    /* JADX INFO: renamed from: f */
    public final C0351jd f4885f;

    /* JADX INFO: renamed from: g */
    public final C0910x1 f4886g;

    /* JADX INFO: renamed from: h */
    public final C0964yi f4887h;

    /* JADX INFO: renamed from: j */
    public cq0 f4889j;

    /* JADX INFO: renamed from: k */
    public int f4890k;

    /* JADX INFO: renamed from: l */
    public int f4891l;

    /* JADX INFO: renamed from: m */
    public int f4892m;

    /* JADX INFO: renamed from: o */
    public int[] f4894o;

    /* JADX INFO: renamed from: p */
    public sg0 f4895p;

    /* JADX INFO: renamed from: q */
    public boolean f4896q;

    /* JADX INFO: renamed from: r */
    public boolean f4897r;

    /* JADX INFO: renamed from: v */
    public ug0 f4901v;

    /* JADX INFO: renamed from: w */
    public boolean f4902w;

    /* JADX INFO: renamed from: y */
    public boolean f4904y;

    /* JADX INFO: renamed from: i */
    public final ArrayList f4888i = new ArrayList();

    /* JADX INFO: renamed from: n */
    public final e30 f4893n = new e30();

    /* JADX INFO: renamed from: s */
    public final ArrayList f4898s = new ArrayList();

    /* JADX INFO: renamed from: t */
    public final e30 f4899t = new e30();

    /* JADX INFO: renamed from: u */
    public fq0 f4900u = fq0.f1796g;

    /* JADX INFO: renamed from: x */
    public final e30 f4903x = new e30();

    /* JADX INFO: renamed from: z */
    public int f4905z = -1;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0616pi(ja1 ja1Var, AbstractC0727si abstractC0727si, w11 w11Var, mh0 mh0Var, C0351jd c0351jd, C0351jd c0351jd2, C0910x1 c0910x1, C0964yi c0964yi) {
        this.f4880a = ja1Var;
        this.f4881b = abstractC0727si;
        this.f4882c = w11Var;
        this.f4883d = mh0Var;
        this.f4884e = c0351jd;
        this.f4885f = c0351jd2;
        this.f4886g = c0910x1;
        this.f4887h = c0964yi;
        this.f4861C = abstractC0727si.mo2713f() || abstractC0727si.mo2711d();
        this.f4862D = new C0552oi(0, this);
        this.f4863E = new ArrayList();
        v11 v11VarM4829c = w11Var.m4829c();
        v11VarM4829c.m4367c();
        this.f4865G = v11VarM4829c;
        w11 w11Var2 = new w11();
        if (abstractC0727si.mo2713f()) {
            w11Var2.m4828b();
        }
        if (abstractC0727si.mo2711d()) {
            w11Var2.f6903n = new ug0();
        }
        this.f4866H = w11Var2;
        z11 z11VarM4830d = w11Var2.m4830d();
        z11VarM4830d.m5392e(true);
        this.f4867I = z11VarM4830d;
        this.f4871M = new C0395ki(this, c0351jd);
        v11 v11VarM4829c2 = this.f4866H.m4829c();
        try {
            C0788u2 c0788u2M4365a = v11VarM4829c2.m4365a(0);
            v11VarM4829c2.m4367c();
            this.f4872N = c0788u2M4365a;
            this.f4873O = new C0901wt();
            this.f4875Q = new C0890wi(this);
            InterfaceC0618pk interfaceC0618pkMo2717j = abstractC0727si.mo2717j();
            InterfaceC0618pk interfaceC0618pkM3129z = m3129z();
            this.f4876R = interfaceC0618pkMo2717j.mo63h(interfaceC0618pkM3129z == null ? C0220fs.f1799d : interfaceC0618pkM3129z);
        } catch (Throwable th) {
            v11VarM4829c2.m4367c();
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: N */
    public static final int m3068N(C0616pi c0616pi, int i, boolean z, int i2) {
        v11 v11Var = c0616pi.f4865G;
        if (v11Var.m4374j(i)) {
            int iM4373i = v11Var.m4373i(i);
            Object objM4380p = v11Var.m4380p(v11Var.f6375b, i);
            if (iM4373i == 206 && p30.m3002l(objM4380p, AbstractC0653qi.f5155e)) {
                Object objM4372h = v11Var.m4372h(i, 0);
                ku0 ku0Var = objM4372h instanceof ku0 ? (ku0) objM4372h : null;
                ju0 ju0Var = ku0Var != null ? ku0Var.f3270a : null;
                C0475mi c0475mi = ju0Var instanceof C0475mi ? (C0475mi) ju0Var : null;
                if (c0475mi != null) {
                    for (C0616pi c0616pi2 : c0475mi.f3983d.f4278e) {
                        w11 w11Var = c0616pi2.f4882c;
                        if (w11Var.f6894e > 0 && (w11Var.f6893d[1] & 67108864) != 0) {
                            C0964yi c0964yi = c0616pi2.f4887h;
                            synchronized (c0964yi.f7628g) {
                                c0964yi.m5275p();
                                jh0 jh0Var = c0964yi.f7638q;
                                c0964yi.f7638q = u50.m4265f();
                                try {
                                    c0964yi.f7646y.m3099c0(jh0Var);
                                } finally {
                                }
                            }
                            C0351jd c0351jd = new C0351jd();
                            c0616pi2.f4870L = c0351jd;
                            v11 v11VarM4829c = c0616pi2.f4882c.m4829c();
                            try {
                                c0616pi2.f4865G = v11VarM4829c;
                                C0395ki c0395ki = c0616pi2.f4871M;
                                C0351jd c0351jd2 = c0395ki.f3156b;
                                try {
                                    c0395ki.f3156b = c0351jd;
                                    c0616pi2.m3081M(0);
                                    C0395ki c0395ki2 = c0616pi2.f4871M;
                                    c0395ki2.m1904b();
                                    if (c0395ki2.f3157c) {
                                        c0395ki2.f3156b.f2797a.m4093I(im0.f2586c);
                                        if (c0395ki2.f3157c) {
                                            c0395ki2.m1906d(false);
                                            c0395ki2.m1906d(false);
                                            c0395ki2.f3156b.f2797a.m4093I(sl0.f5780c);
                                            c0395ki2.f3157c = false;
                                        }
                                    }
                                } finally {
                                }
                            } finally {
                                v11VarM4829c.m4367c();
                            }
                        }
                        c0616pi.f4881b.mo2725r(c0616pi2.f4887h);
                    }
                }
                return v11Var.m4379o(i);
            }
            if (!v11Var.m4376l(i)) {
                return v11Var.m4379o(i);
            }
        } else if (v11Var.m4368d(i)) {
            int i3 = v11Var.f6375b[(i * 5) + 3] + i;
            int iM3068N = 0;
            for (int i4 = i + 1; i4 < i3; i4 += v11Var.f6375b[(i4 * 5) + 3]) {
                boolean zM4376l = v11Var.m4376l(i4);
                if (zM4376l) {
                    c0616pi.f4871M.m1905c();
                    C0395ki c0395ki3 = c0616pi.f4871M;
                    Object objM4378n = v11Var.m4378n(i4);
                    c0395ki3.m1905c();
                    c0395ki3.f3162h.add(objM4378n);
                }
                iM3068N += m3068N(c0616pi, i4, zM4376l || z, zM4376l ? 0 : i2 + iM3068N);
                if (zM4376l) {
                    c0616pi.f4871M.m1905c();
                    c0616pi.f4871M.m1903a();
                }
            }
            if (!v11Var.m4376l(i)) {
                return iM3068N;
            }
        } else if (!v11Var.m4376l(i)) {
            return v11Var.m4379o(i);
        }
        return 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A */
    public final boolean m3069A() {
        ht0 ht0VarM3127x;
        return (this.f4877S || this.f4904y || this.f4902w || (ht0VarM3127x = m3127x()) == null || (ht0VarM3127x.f2360b & 8) != 0) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B */
    public final void m3070B(ArrayList arrayList) {
        C0351jd c0351jd = this.f4885f;
        C0395ki c0395ki = this.f4871M;
        C0351jd c0351jd2 = c0395ki.f3156b;
        try {
            c0395ki.f3156b = c0351jd;
            c0351jd.f2797a.m4093I(gm0.f2022c);
            if (arrayList.size() <= 0) {
                c0395ki.m1904b();
                c0395ki.f3156b.f2797a.m4093I(tl0.f6012c);
                c0395ki.f3160f = 0;
            } else {
                uo0 uo0Var = (uo0) arrayList.get(0);
                mg0 mg0Var = (mg0) uo0Var.f6274d;
                mg0Var.getClass();
                throw null;
            }
        } finally {
            c0395ki.f3156b = c0351jd2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX INFO: renamed from: C */
    public final void m3071C(fq0 fq0Var, Object obj) {
        m3086S(126665345, 0, null, null);
        m3072D();
        m3109h0(obj);
        long j = this.f4878T;
        try {
            this.f4878T = 126665345L;
            if (this.f4877S) {
                z11.m5366z(this.f4867I);
            }
            boolean z = (this.f4877S || p30.m3002l(this.f4865G.m4370f(), fq0Var)) ? false : true;
            if (z) {
                m3078J(fq0Var);
            }
            m3086S(202, 0, AbstractC0653qi.f5153c, fq0Var);
            this.f4869K = null;
            this.f4902w = z;
            throw null;
        } finally {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: D */
    public final Object m3072D() {
        boolean z = this.f4877S;
        C0675r3 c0675r3 = C0320ii.f2572a;
        if (!z) {
            Object objM4377m = this.f4865G.m4377m();
            if (!this.f4904y || (objM4377m instanceof hv0)) {
                return objM4377m;
            }
        } else if (this.f4897r) {
            AbstractC0653qi.m3252a("A call to createNode(), emitNode() or useNode() expected");
            return c0675r3;
        }
        return c0675r3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: E */
    public final List m3073E() {
        AbstractC0727si abstractC0727si = this.f4881b;
        InterfaceC0690ri interfaceC0690riMo2715h = abstractC0727si.mo2715h();
        C0964yi c0964yi = interfaceC0690riMo2715h != null ? (C0964yi) interfaceC0690riMo2715h : null;
        if (c0964yi != null) {
            w11 w11Var = c0964yi.f7630i;
            v11 v11VarM4829c = w11Var.m4829c();
            try {
                Integer numM3016z = p30.m3016z(v11VarM4829c, abstractC0727si, 0, v11VarM4829c.f6376c);
                if (numM3016z != null) {
                    v11VarM4829c = w11Var.m4829c();
                    try {
                        ArrayList arrayListM2989Y = p30.m2989Y(v11VarM4829c, numM3016z.intValue(), 0);
                        v11VarM4829c.m4367c();
                        return AbstractC0960ye.m5249S(arrayListM2989Y, c0964yi.f7646y.m3073E());
                    } finally {
                    }
                }
            } finally {
            }
        }
        return C0294hs.f2354d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: F */
    public final int m3074F(int i) {
        int iM4381q = this.f4865G.m4381q(i) + 1;
        int i2 = 0;
        while (iM4381q < i) {
            if (!this.f4865G.m4375k(iM4381q)) {
                i2++;
            }
            iM4381q += this.f4865G.f6375b[(iM4381q * 5) + 3];
        }
        return i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0055 A[Catch: all -> 0x0024, TRY_LEAVE, TryCatch #0 {all -> 0x0024, blocks: (B:3:0x0005, B:6:0x0012, B:8:0x0020, B:12:0x0029, B:11:0x0026, B:15:0x0030, B:20:0x003c, B:22:0x0044, B:24:0x004a, B:25:0x004e, B:26:0x004f, B:28:0x0055, B:21:0x0040), top: B:33:0x0005, inners: #1 }] */
    /* JADX INFO: renamed from: G */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m3075G(C0964yi c0964yi, C0964yi c0964yi2, Integer num, List list, InterfaceC0298hw interfaceC0298hw) {
        Object objInvoke;
        boolean z = this.f4864F;
        int i = this.f4890k;
        try {
            this.f4864F = true;
            this.f4890k = 0;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                uo0 uo0Var = (uo0) list.get(i2);
                ht0 ht0Var = (ht0) uo0Var.f6274d;
                Object obj = uo0Var.f6275e;
                if (obj != null) {
                    m3097b0(ht0Var, obj);
                } else {
                    m3097b0(ht0Var, null);
                }
            }
            if (c0964yi == null) {
                objInvoke = interfaceC0298hw.invoke();
            } else {
                int iIntValue = num != null ? num.intValue() : -1;
                if (c0964yi2 == null || c0964yi2 == c0964yi || iIntValue < 0) {
                    objInvoke = interfaceC0298hw.invoke();
                } else {
                    c0964yi.f7642u = c0964yi2;
                    c0964yi.f7643v = iIntValue;
                    try {
                        objInvoke = interfaceC0298hw.invoke();
                        c0964yi.f7642u = null;
                        c0964yi.f7643v = 0;
                    } catch (Throwable th) {
                        c0964yi.f7642u = null;
                        c0964yi.f7643v = 0;
                        throw th;
                    }
                }
                if (objInvoke == null) {
                }
            }
            this.f4864F = z;
            this.f4890k = i;
            return objInvoke;
        } catch (Throwable th2) {
            this.f4864F = z;
            this.f4890k = i;
            throw th2;
        }
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[CONST, IPUT]}, finally: {[CONST] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Incorrect finally slice insn: 0x023d: IPUT (r1v35 ?? I:fq0), (r40v0 'this' ?? I:pi A[IMMUTABLE_TYPE, THIS]) (LINE:574) pi.K fq0, expected: 0x0306: INVOKE (r15v1 ?? I:ht0), (r1v21 ?? I:boolean) VIRTUAL call: ht0.d(boolean):void A[MD:(boolean):void (m)] (LINE:775) */
    /* JADX DEBUG: Multi-variable search result rejected for r8v2, resolved type: boolean */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01b8, code lost:
    
        r17 = r1;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0139  */
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
    /* JADX INFO: renamed from: H */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3076H() {
        x30 x30Var;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        long j;
        boolean z;
        ch0 ch0Var;
        long j2;
        int iM3061u;
        int i8;
        int iHashCode;
        Object objM4366b;
        C0496n2 c0496n2 = C0496n2.f4141U;
        boolean z2 = this.f4864F;
        this.f4864F = true;
        v11 v11Var = this.f4865G;
        int i9 = v11Var.f6382i;
        int i10 = (i9 * 5) + 3;
        int i11 = v11Var.f6375b[i10] + i9;
        int i12 = this.f4890k;
        long j3 = this.f4878T;
        int i13 = this.f4891l;
        int i14 = this.f4892m;
        int i15 = v11Var.f6380g;
        ArrayList arrayList = this.f4898s;
        int iM3061u2 = pf1.m3061u(i15, arrayList);
        if (iM3061u2 < 0) {
            iM3061u2 = -(iM3061u2 + 1);
        }
        if (iM3061u2 < arrayList.size()) {
            x30Var = (x30) arrayList.get(iM3061u2);
            if (x30Var.f7254b >= i11) {
                x30Var = null;
            }
        }
        int i16 = 1;
        int i17 = i9;
        int i18 = 0;
        while (x30Var != null) {
            ht0 ht0Var = x30Var.f7253a;
            int i19 = x30Var.f7254b;
            C0496n2 c0496n22 = c0496n2;
            int iM3061u3 = pf1.m3061u(i19, arrayList);
            if (iM3061u3 >= 0) {
            }
            Object obj = x30Var.f7255c;
            if (obj == null) {
                ht0Var.getClass();
                i3 = i11;
                i = i10;
                i2 = i12;
            } else {
                int i20 = 8;
                jh0 jh0Var = ht0Var.f2365g;
                if (jh0Var == null) {
                    i3 = i11;
                    i = i10;
                    i2 = i12;
                } else {
                    i = i10;
                    if (obj instanceof C0135dn) {
                        C0135dn c0135dn = (C0135dn) obj;
                        C0496n2 c0496n23 = c0135dn.f1158f;
                        if (c0496n23 == null) {
                            c0496n23 = c0496n22;
                        }
                        i2 = i12;
                        i6 = !c0496n23.m2629g(c0135dn.m719h().f861f, jh0Var.m1701g(c0135dn)) ? 1 : 0;
                        i3 = i11;
                        i4 = i13;
                        i5 = i14;
                    } else {
                        i2 = i12;
                        if (obj instanceof kh0) {
                            kh0 kh0Var = (kh0) obj;
                            if (kh0Var.m1897h()) {
                                Object[] objArr = kh0Var.f3151b;
                                long[] jArr = kh0Var.f3150a;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    i4 = i13;
                                    i5 = i14;
                                    int i21 = 0;
                                    while (true) {
                                        long j4 = jArr[i21];
                                        i3 = i11;
                                        Object[] objArr2 = objArr;
                                        if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i22 = 8 - ((~(i21 - length)) >>> 31);
                                            int i23 = 0;
                                            while (i23 < i22) {
                                                if ((j4 & 255) < 128) {
                                                    i7 = i23;
                                                    Object obj2 = objArr2[(i21 << 3) + i23];
                                                    j = j4;
                                                    if (!(obj2 instanceof C0135dn)) {
                                                        break;
                                                    }
                                                    C0135dn c0135dn2 = (C0135dn) obj2;
                                                    C0496n2 c0496n24 = c0135dn2.f1158f;
                                                    if (c0496n24 == null) {
                                                        c0496n24 = c0496n22;
                                                    }
                                                    if (!c0496n24.m2629g(c0135dn2.m719h().f861f, jh0Var.m1701g(c0135dn2))) {
                                                        break;
                                                    }
                                                } else {
                                                    i7 = i23;
                                                    j = j4;
                                                }
                                                j4 = j >> i20;
                                                i23 = i7 + 1;
                                            }
                                            if (i22 != i20) {
                                                break;
                                            }
                                            if (i21 == length) {
                                                break;
                                            }
                                            i21++;
                                            i11 = i3;
                                            objArr = objArr2;
                                            i20 = 8;
                                        }
                                    }
                                } else {
                                    i3 = i11;
                                    i4 = i13;
                                    i5 = i14;
                                }
                                i6 = 0;
                            }
                        } else {
                            i3 = i11;
                        }
                    }
                    if (i6 == 0) {
                        this.f4865G.m4382r(i19);
                        int i24 = this.f4865G.f6380g;
                        m3079K(i17, i24, i9);
                        int iM4381q = this.f4865G.m4381q(i24);
                        while (iM4381q != i9 && !this.f4865G.m4376l(iM4381q)) {
                            iM4381q = this.f4865G.m4381q(iM4381q);
                        }
                        int iM3111i0 = this.f4865G.m4376l(iM4381q) ? 0 : i2;
                        if (iM4381q != i24) {
                            int iM3111i02 = (m3111i0(iM4381q) - this.f4865G.m4379o(i24)) + iM3111i0;
                            while (iM3111i0 < iM3111i02 && iM4381q != i19) {
                                iM4381q++;
                                while (iM4381q < i19) {
                                    v11 v11Var2 = this.f4865G;
                                    int i25 = v11Var2.f6375b[(iM4381q * 5) + 3] + iM4381q;
                                    if (i19 >= i25) {
                                        iM3111i0 += v11Var2.m4376l(iM4381q) ? i16 : m3111i0(iM4381q);
                                        iM4381q = i25;
                                    }
                                }
                                break;
                            }
                        }
                        this.f4890k = iM3111i0;
                        this.f4892m = m3074F(i24);
                        int iM4381q2 = this.f4865G.m4381q(i24);
                        long jRotateLeft = 0;
                        int i26 = 3;
                        int i27 = 0;
                        while (true) {
                            if (iM4381q2 < 0) {
                                break;
                            }
                            if (iM4381q2 == i9) {
                                jRotateLeft ^= Long.rotateLeft(j3, i27);
                                break;
                            }
                            v11 v11Var3 = this.f4865G;
                            boolean zM4375k = v11Var3.m4375k(iM4381q2);
                            int[] iArr = v11Var3.f6375b;
                            if (zM4375k) {
                                Object objM4380p = v11Var3.m4380p(iArr, iM4381q2);
                                if (objM4380p != null) {
                                    iHashCode = objM4380p instanceof Enum ? ((Enum) objM4380p).ordinal() : objM4380p.hashCode();
                                    i8 = i24;
                                } else {
                                    i8 = i24;
                                    iHashCode = 0;
                                }
                            } else {
                                int iM4373i = v11Var3.m4373i(iM4381q2);
                                i8 = i24;
                                iHashCode = (iM4373i != 207 || (objM4366b = v11Var3.m4366b(iArr, iM4381q2)) == null || objM4366b.equals(C0320ii.f2572a)) ? iM4373i : objM4366b.hashCode();
                            }
                            if (iHashCode == 126665345) {
                                jRotateLeft ^= Long.rotateLeft(iHashCode, i27);
                                break;
                            }
                            jRotateLeft = (jRotateLeft ^ Long.rotateLeft(iHashCode, i26)) ^ Long.rotateLeft(this.f4865G.m4375k(iM4381q2) ? 0 : m3074F(iM4381q2), i27);
                            i26 = (i26 + 6) % 64;
                            i27 = (i27 + 6) % 64;
                            iM4381q2 = this.f4865G.m4381q(iM4381q2);
                            i24 = i8;
                        }
                        this.f4878T = jRotateLeft;
                        this.f4869K = null;
                        InterfaceC0904ww interfaceC0904ww = ht0Var.f2362d;
                        if (interfaceC0904ww == null) {
                            C0921xc.m5134o("Invalid restart scope");
                            return;
                        }
                        interfaceC0904ww.invoke(this, Integer.valueOf(i16));
                        this.f4869K = null;
                        v11 v11Var4 = this.f4865G;
                        int i28 = v11Var4.f6375b[i] + i9;
                        int i29 = v11Var4.f6380g;
                        if (i29 < i9 || i29 > i28) {
                            AbstractC0653qi.m3252a("Index " + i9 + " is not a parent of " + i29);
                        }
                        v11Var4.f6382i = i9;
                        v11Var4.f6381h = i28;
                        v11Var4.f6385l = 0;
                        v11Var4.f6386m = 0;
                        z = z2;
                        i17 = i8;
                        i18 = i16;
                    } else {
                        ArrayList arrayList2 = this.f4863E;
                        arrayList2.add(ht0Var);
                        this.f4886g.m5068h();
                        C0964yi c0964yi = ht0Var.f2359a;
                        if (c0964yi == null || (ch0Var = ht0Var.f2364f) == null) {
                            z = z2;
                        } else {
                            ht0Var.m1506d(i16);
                            try {
                                Object[] objArr3 = ch0Var.f811b;
                                int[] iArr2 = ch0Var.f812c;
                                long[] jArr2 = ch0Var.f810a;
                                int length2 = jArr2.length - 2;
                                z = z2;
                                if (length2 >= 0) {
                                    int i30 = 0;
                                    while (true) {
                                        long j5 = jArr2[i30];
                                        long[] jArr3 = jArr2;
                                        Object[] objArr4 = objArr3;
                                        if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i31 = 8 - ((~(i30 - length2)) >>> 31);
                                            int i32 = 0;
                                            while (i32 < i31) {
                                                if ((j5 & 255) < 128) {
                                                    int i33 = (i30 << 3) + i32;
                                                    j2 = j5;
                                                    Object obj3 = objArr4[i33];
                                                    int i34 = iArr2[i33];
                                                    c0964yi.m5285z(obj3);
                                                } else {
                                                    j2 = j5;
                                                }
                                                i32++;
                                                j5 = j2 >> 8;
                                            }
                                            if (i31 != 8) {
                                                break;
                                            }
                                        }
                                        if (i30 == length2) {
                                            break;
                                        }
                                        i30++;
                                        objArr3 = objArr4;
                                        jArr2 = jArr3;
                                    }
                                }
                                ht0Var.m1506d(false);
                            } catch (Throwable th) {
                                ht0Var.m1506d(false);
                                throw th;
                            }
                        }
                        i16 = 1;
                        arrayList2.remove(arrayList2.size() - 1);
                    }
                    iM3061u = pf1.m3061u(this.f4865G.f6380g, arrayList);
                    if (iM3061u < 0) {
                        iM3061u = -(iM3061u + 1);
                    }
                    if (iM3061u >= arrayList.size()) {
                        x30 x30Var2 = (x30) arrayList.get(iM3061u);
                        i11 = i3;
                        x30Var = x30Var2.f7254b < i11 ? x30Var2 : null;
                        z2 = z;
                        c0496n2 = c0496n22;
                        i10 = i;
                        i12 = i2;
                        i13 = i4;
                        i14 = i5;
                    } else {
                        i11 = i3;
                    }
                    z2 = z;
                    c0496n2 = c0496n22;
                    i10 = i;
                    i12 = i2;
                    i13 = i4;
                    i14 = i5;
                }
            }
            i4 = i13;
            i5 = i14;
            i6 = i16;
            if (i6 == 0) {
            }
            iM3061u = pf1.m3061u(this.f4865G.f6380g, arrayList);
            if (iM3061u < 0) {
            }
            if (iM3061u >= arrayList.size()) {
            }
            z2 = z;
            c0496n2 = c0496n22;
            i10 = i;
            i12 = i2;
            i13 = i4;
            i14 = i5;
        }
        boolean z3 = z2;
        int i35 = i12;
        int i36 = i13;
        int i37 = i14;
        if (i18 != 0) {
            m3079K(i17, i9, i9);
            this.f4865G.m4384t();
            int iM3111i03 = m3111i0(i9);
            this.f4890k = i35 + iM3111i03;
            this.f4891l = i36 + iM3111i03;
            this.f4892m = i37;
        } else {
            m3084Q();
        }
        this.f4878T = j3;
        this.f4864F = z3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: I */
    public final void m3077I() {
        int i;
        m3081M(this.f4865G.f6380g);
        C0395ki c0395ki = this.f4871M;
        c0395ki.m1906d(false);
        e30 e30Var = c0395ki.f3158d;
        C0616pi c0616pi = c0395ki.f3155a;
        v11 v11Var = c0616pi.f4865G;
        if (v11Var.f6376c > 0 && e30Var.m769a(-2) != (i = v11Var.f6382i)) {
            if (!c0395ki.f3157c && c0395ki.f3159e) {
                c0395ki.m1906d(false);
                c0395ki.f3156b.f2797a.m4093I(wl0.f7146c);
                c0395ki.f3157c = true;
            }
            if (i > 0) {
                C0788u2 c0788u2M4365a = v11Var.m4365a(i);
                e30Var.m771c(i);
                c0395ki.m1906d(false);
                sm0 sm0Var = c0395ki.f3156b.f2797a;
                sm0Var.m4093I(vl0.f6743c);
                j50.m1671u(sm0Var, 0, c0788u2M4365a);
                c0395ki.f3157c = true;
            }
        }
        c0395ki.f3156b.f2797a.m4093I(em0.f1482c);
        int i2 = c0395ki.f3160f;
        v11 v11Var2 = c0616pi.f4865G;
        c0395ki.f3160f = v11Var2.f6375b[(v11Var2.f6380g * 5) + 3] + i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: J */
    public final void m3078J(fq0 fq0Var) {
        ug0 ug0Var = this.f4901v;
        if (ug0Var == null) {
            ug0Var = new ug0();
            this.f4901v = ug0Var;
        }
        ug0Var.m4330i(this.f4865G.f6380g, fq0Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:13:0x001a  */
    /* JADX INFO: renamed from: K */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3079K(int i, int i2, int i3) {
        v11 v11Var = this.f4865G;
        if (i != i2) {
            if (i != i3 && i2 != i3) {
                if (v11Var.m4381q(i) == i2) {
                    i3 = i2;
                } else if (v11Var.m4381q(i2) == i) {
                    i3 = i;
                } else if (v11Var.m4381q(i) == v11Var.m4381q(i2)) {
                    i3 = v11Var.m4381q(i);
                } else {
                    int iM4381q = i;
                    int i4 = 0;
                    while (iM4381q > 0 && iM4381q != i3) {
                        iM4381q = v11Var.m4381q(iM4381q);
                        i4++;
                    }
                    int iM4381q2 = i2;
                    int i5 = 0;
                    while (iM4381q2 > 0 && iM4381q2 != i3) {
                        iM4381q2 = v11Var.m4381q(iM4381q2);
                        i5++;
                    }
                    int i6 = i4 - i5;
                    int iM4381q3 = i;
                    for (int i7 = 0; i7 < i6; i7++) {
                        iM4381q3 = v11Var.m4381q(iM4381q3);
                    }
                    int i8 = i5 - i4;
                    int iM4381q4 = i2;
                    for (int i9 = 0; i9 < i8; i9++) {
                        iM4381q4 = v11Var.m4381q(iM4381q4);
                    }
                    i3 = iM4381q3;
                    for (int iM4381q5 = iM4381q4; i3 != iM4381q5; iM4381q5 = v11Var.m4381q(iM4381q5)) {
                        i3 = v11Var.m4381q(i3);
                    }
                }
            }
        }
        while (i > 0 && i != i3) {
            if (v11Var.m4376l(i)) {
                this.f4871M.m1903a();
            }
            i = v11Var.m4381q(i);
        }
        m3118o(i2, i3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: L */
    public final Object m3080L() {
        boolean z = this.f4877S;
        C0675r3 c0675r3 = C0320ii.f2572a;
        if (!z) {
            Object objM4377m = this.f4865G.m4377m();
            if (!this.f4904y || (objM4377m instanceof hv0)) {
                return objM4377m instanceof ku0 ? ((ku0) objM4377m).f3270a : objM4377m;
            }
        } else if (this.f4897r) {
            AbstractC0653qi.m3252a("A call to createNode(), emitNode() or useNode() expected");
            return c0675r3;
        }
        return c0675r3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: M */
    public final void m3081M(int i) {
        boolean zM4376l = this.f4865G.m4376l(i);
        C0395ki c0395ki = this.f4871M;
        if (zM4376l) {
            c0395ki.m1905c();
            Object objM4378n = this.f4865G.m4378n(i);
            c0395ki.m1905c();
            c0395ki.f3162h.add(objM4378n);
        }
        m3068N(this, i, zM4376l, 0);
        c0395ki.m1905c();
        if (zM4376l) {
            c0395ki.m1903a();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: O */
    public final boolean m3082O(int i, boolean z) {
        ht0 ht0VarM3127x;
        if ((i & 1) == 0 && (this.f4877S || this.f4904y)) {
            j11 j11Var = this.f4874P;
            if (j11Var != null && (ht0VarM3127x = m3127x()) != null && j11Var.mo1606a()) {
                int i2 = ht0VarM3127x.f2360b;
                if ((i2 & 512) != 0) {
                    return true;
                }
                int i3 = i2 | 1;
                ht0VarM3127x.f2360b = i3;
                ht0VarM3127x.f2360b = (this.f4904y ? i2 | 129 : i3 & (-129)) | 256;
                sm0 sm0Var = this.f4871M.f3156b.f2797a;
                sm0Var.m4093I(dm0.f1156c);
                j50.m1671u(sm0Var, 0, ht0VarM3127x);
                this.f4881b.mo2724q(ht0VarM3127x);
                return false;
            }
        } else if (!z && m3069A()) {
            return false;
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d0  */
    /* JADX INFO: renamed from: P */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3083P() {
        long jRotateLeft;
        if (this.f4898s.isEmpty()) {
            this.f4891l = this.f4865G.m4383s() + this.f4891l;
            return;
        }
        v11 v11Var = this.f4865G;
        int iM4371g = v11Var.m4371g();
        int[] iArr = v11Var.f6375b;
        int i = v11Var.f6380g;
        Object objM4380p = i < v11Var.f6381h ? v11Var.m4380p(iArr, i) : null;
        Object objM4370f = v11Var.m4370f();
        int i2 = this.f4892m;
        C0675r3 c0675r3 = C0320ii.f2572a;
        if (objM4380p != null) {
            jRotateLeft = Long.rotateLeft(Long.rotateLeft(this.f4878T, 3) ^ ((long) (objM4380p instanceof Enum ? ((Enum) objM4380p).ordinal() : objM4380p.hashCode())), 3);
        } else {
            if (objM4370f != null && iM4371g == 207 && !objM4370f.equals(c0675r3)) {
                this.f4878T = Long.rotateLeft(Long.rotateLeft(this.f4878T, 3) ^ ((long) objM4370f.hashCode()), 3) ^ ((long) i2);
                m3089V(null, (iArr[(v11Var.f6380g * 5) + 1] & 1073741824) != 0);
                m3076H();
                v11Var.m4369e();
                if (objM4380p == null) {
                    if (objM4380p instanceof Enum) {
                        this.f4878T = Long.rotateRight(Long.rotateRight(this.f4878T, 3) ^ ((long) ((Enum) objM4380p).ordinal()), 3);
                        return;
                    } else {
                        this.f4878T = Long.rotateRight(Long.rotateRight(this.f4878T, 3) ^ ((long) objM4380p.hashCode()), 3);
                        return;
                    }
                }
                if (objM4370f == null || iM4371g != 207 || objM4370f.equals(c0675r3)) {
                    this.f4878T = Long.rotateRight(((long) iM4371g) ^ Long.rotateRight(this.f4878T ^ ((long) i2), 3), 3);
                    return;
                } else {
                    this.f4878T = Long.rotateRight(Long.rotateRight(this.f4878T ^ ((long) i2), 3) ^ ((long) objM4370f.hashCode()), 3);
                    return;
                }
            }
            jRotateLeft = Long.rotateLeft(Long.rotateLeft(this.f4878T, 3) ^ ((long) iM4371g), 3) ^ ((long) i2);
        }
        this.f4878T = jRotateLeft;
        m3089V(null, (iArr[(v11Var.f6380g * 5) + 1] & 1073741824) != 0);
        m3076H();
        v11Var.m4369e();
        if (objM4380p == null) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Q */
    public final void m3084Q() {
        v11 v11Var = this.f4865G;
        int i = v11Var.f6382i;
        this.f4891l = i >= 0 ? v11Var.f6375b[(i * 5) + 1] & 67108863 : 0;
        v11Var.m4384t();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: R */
    public final void m3085R() {
        if (this.f4891l != 0) {
            AbstractC0653qi.m3252a("No nodes can be emitted before calling skipAndEndGroup");
        }
        if (this.f4877S) {
            return;
        }
        ht0 ht0VarM3127x = m3127x();
        if (ht0VarM3127x != null) {
            int i = ht0VarM3127x.f2360b;
            if ((i & 128) == 0) {
                ht0VarM3127x.f2360b = i | 16;
            }
        }
        if (this.f4898s.isEmpty()) {
            m3084Q();
        } else {
            m3076H();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c5  */
    /* JADX INFO: renamed from: S */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3086S(int i, int i2, Object obj, Object obj2) {
        long jRotateLeft;
        boolean z;
        cq0 cq0Var;
        int i3;
        int i4;
        Object[] objArr;
        Object[] objArr2;
        int i5;
        int i6;
        int i7;
        boolean z2;
        int i8;
        Object obj3 = obj;
        if (this.f4897r) {
            AbstractC0653qi.m3252a("A call to createNode(), emitNode() or useNode() expected");
        }
        int i9 = this.f4892m;
        Object obj4 = C0320ii.f2572a;
        if (obj3 != null) {
            jRotateLeft = Long.rotateLeft(Long.rotateLeft(this.f4878T, 3) ^ ((long) (obj3 instanceof Enum ? ((Enum) obj3).ordinal() : obj3.hashCode())), 3);
        } else {
            if (obj2 != null && i == 207 && !obj2.equals(obj4)) {
                this.f4878T = Long.rotateLeft(Long.rotateLeft(this.f4878T, 3) ^ ((long) obj2.hashCode()), 3) ^ ((long) i9);
                if (obj3 == null) {
                    this.f4892m++;
                }
                boolean z3 = i2 == 0;
                if (!this.f4877S) {
                    this.f4865G.f6384k++;
                    z11 z11Var = this.f4867I;
                    int i10 = z11Var.f7770t;
                    if (z3) {
                        z11Var.m5383Q(i, obj4, obj4, true);
                    } else if (obj2 != null) {
                        if (obj3 == null) {
                            obj3 = obj4;
                        }
                        z11Var.m5383Q(i, obj3, obj2, false);
                    } else {
                        if (obj3 == null) {
                            obj3 = obj4;
                        }
                        z11Var.m5383Q(i, obj3, obj4, false);
                    }
                    cq0 cq0Var2 = this.f4889j;
                    if (cq0Var2 != null) {
                        int i11 = (-2) - i10;
                        z40 z40Var = new z40(-1, i, i11, -1);
                        cq0Var2.f879e.m4330i(i11, new C0109cy(-1, this.f4890k - cq0Var2.f876b, 0));
                        cq0Var2.f878d.add(z40Var);
                    }
                    m3124u(z3, null);
                    return;
                }
                boolean z4 = i2 == 1 && this.f4904y;
                if (this.f4889j == null) {
                    int iM4371g = this.f4865G.m4371g();
                    if (!z4 && iM4371g == i) {
                        v11 v11Var = this.f4865G;
                        int i12 = v11Var.f6380g;
                        if (p30.m3002l(obj3, i12 < v11Var.f6381h ? v11Var.m4380p(v11Var.f6375b, i12) : null)) {
                            m3089V(obj2, z3);
                            z = z4;
                        }
                    }
                    v11 v11Var2 = this.f4865G;
                    int[] iArr = v11Var2.f6375b;
                    ArrayList arrayList = new ArrayList();
                    if (v11Var2.f6384k <= 0) {
                        int i13 = v11Var2.f6380g;
                        while (i13 < v11Var2.f6381h) {
                            int i14 = i13 * 5;
                            int i15 = iArr[i14];
                            Object objM4380p = v11Var2.m4380p(iArr, i13);
                            int i16 = iArr[i14 + 1];
                            if ((i16 & 1073741824) != 0) {
                                z2 = z4;
                                i8 = 1;
                            } else {
                                z2 = z4;
                                i8 = i16 & 67108863;
                            }
                            arrayList.add(new z40(objM4380p, i15, i13, i8));
                            i13 += iArr[i14 + 3];
                            z4 = z2;
                        }
                    }
                    z = z4;
                    this.f4889j = new cq0(this.f4890k, arrayList);
                } else {
                    z = z4;
                }
                cq0 cq0Var3 = this.f4889j;
                if (cq0Var3 != null) {
                    ArrayList arrayList2 = cq0Var3.f878d;
                    ug0 ug0Var = cq0Var3.f879e;
                    int i17 = cq0Var3.f876b;
                    Object k40Var = obj3 != null ? new k40(Integer.valueOf(i), obj3) : Integer.valueOf(i);
                    jh0 jh0Var = ((qg0) cq0Var3.f880f.getValue()).f5144a;
                    Object objM1701g = jh0Var.m1701g(k40Var);
                    if (objM1701g == null) {
                        objM1701g = null;
                    } else if (objM1701g instanceof dh0) {
                        dh0 dh0Var = (dh0) objM1701g;
                        Object objM707k = dh0Var.m707k(0);
                        if (dh0Var.m704h()) {
                            jh0Var.m1705k(k40Var);
                        }
                        if (dh0Var.f1109b == 1) {
                            jh0Var.m1707m(k40Var, dh0Var.m701e());
                        }
                        objM1701g = objM707k;
                    } else {
                        jh0Var.m1705k(k40Var);
                    }
                    z40 z40Var2 = (z40) objM1701g;
                    if (z || z40Var2 == null) {
                        this.f4865G.f6384k++;
                        this.f4877S = true;
                        this.f4869K = null;
                        if (this.f4867I.f7773w) {
                            z11 z11VarM4830d = this.f4866H.m4830d();
                            this.f4867I = z11VarM4830d;
                            z11VarM4830d.m5379M();
                            this.f4868J = false;
                            this.f4869K = null;
                        }
                        this.f4867I.m5391d();
                        z11 z11Var2 = this.f4867I;
                        int i18 = z11Var2.f7770t;
                        if (z3) {
                            z11Var2.m5383Q(i, obj4, obj4, true);
                            i3 = 0;
                        } else if (obj2 != null) {
                            if (obj != null) {
                                obj4 = obj;
                            }
                            i3 = 0;
                            z11Var2.m5383Q(i, obj4, obj2, false);
                        } else {
                            i3 = 0;
                            z11Var2.m5383Q(i, obj == null ? obj4 : obj, obj4, false);
                        }
                        this.f4872N = this.f4867I.m5389b(i18);
                        int i19 = (-2) - i18;
                        z40 z40Var3 = new z40(-1, i, i19, -1);
                        ug0Var.m4330i(i19, new C0109cy(-1, this.f4890k - i17, i3));
                        arrayList2.add(z40Var3);
                        cq0Var = new cq0(z3 ? i3 : this.f4890k, new ArrayList());
                    } else {
                        int i20 = z40Var2.f7796c;
                        arrayList2.add(z40Var2);
                        C0109cy c0109cy = (C0109cy) ug0Var.m4248b(i20);
                        this.f4890k = (c0109cy != null ? c0109cy.f911b : -1) + i17;
                        C0109cy c0109cy2 = (C0109cy) ug0Var.m4248b(i20);
                        int i21 = c0109cy2 != null ? c0109cy2.f910a : -1;
                        int i22 = cq0Var3.f877c;
                        int i23 = i21 - i22;
                        int i24 = 8;
                        if (i21 > i22) {
                            Object[] objArr3 = ug0Var.f6113c;
                            long[] jArr = ug0Var.f6111a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i25 = 0;
                                while (true) {
                                    long j = jArr[i25];
                                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i26 = 8 - ((~(i25 - length)) >>> 31);
                                        int i27 = 0;
                                        while (i27 < i26) {
                                            if ((j & 255) < 128) {
                                                i7 = i24;
                                                C0109cy c0109cy3 = (C0109cy) objArr3[(i25 << 3) + i27];
                                                i6 = i23;
                                                int i28 = c0109cy3.f910a;
                                                if (i28 == i21) {
                                                    c0109cy3.f910a = i22;
                                                } else if (i22 <= i28 && i28 < i21) {
                                                    c0109cy3.f910a = i28 + 1;
                                                }
                                            } else {
                                                i6 = i23;
                                                i7 = i24;
                                            }
                                            j >>= i7;
                                            i27++;
                                            i23 = i6;
                                            i24 = i7;
                                        }
                                        i4 = i23;
                                        if (i26 != i24) {
                                            break;
                                        }
                                    } else {
                                        i4 = i23;
                                    }
                                    if (i25 == length) {
                                        break;
                                    }
                                    i25++;
                                    i23 = i4;
                                    i24 = 8;
                                }
                            } else {
                                i4 = i23;
                            }
                        } else {
                            i4 = i23;
                            if (i22 > i21) {
                                Object[] objArr4 = ug0Var.f6113c;
                                long[] jArr2 = ug0Var.f6111a;
                                int length2 = jArr2.length - 2;
                                if (length2 >= 0) {
                                    int i29 = 0;
                                    while (true) {
                                        long j2 = jArr2[i29];
                                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i30 = 8 - ((~(i29 - length2)) >>> 31);
                                            int i31 = 0;
                                            while (i31 < i30) {
                                                if ((j2 & 255) >= 128) {
                                                    objArr2 = objArr4;
                                                } else {
                                                    C0109cy c0109cy4 = (C0109cy) objArr4[(i29 << 3) + i31];
                                                    int i32 = c0109cy4.f910a;
                                                    if (i32 == i21) {
                                                        c0109cy4.f910a = i22;
                                                        objArr2 = objArr4;
                                                    } else {
                                                        objArr2 = objArr4;
                                                        if (i21 + 1 <= i32 && i32 < i22) {
                                                            c0109cy4.f910a = i32 - 1;
                                                        }
                                                    }
                                                }
                                                j2 >>= 8;
                                                i31++;
                                                objArr4 = objArr2;
                                            }
                                            objArr = objArr4;
                                            if (i30 != 8) {
                                                break;
                                            }
                                        } else {
                                            objArr = objArr4;
                                        }
                                        if (i29 == length2) {
                                            break;
                                        }
                                        i29++;
                                        objArr4 = objArr;
                                    }
                                }
                            }
                        }
                        C0395ki c0395ki = this.f4871M;
                        int i33 = c0395ki.f3160f;
                        C0616pi c0616pi = c0395ki.f3155a;
                        c0395ki.f3160f = (i20 - c0616pi.f4865G.f6380g) + i33;
                        this.f4865G.m4382r(i20);
                        if (i4 > 0) {
                            c0395ki.m1906d(false);
                            e30 e30Var = c0395ki.f3158d;
                            v11 v11Var3 = c0616pi.f4865G;
                            if (v11Var3.f6376c > 0 && e30Var.m769a(-2) != (i5 = v11Var3.f6382i)) {
                                if (!c0395ki.f3157c && c0395ki.f3159e) {
                                    c0395ki.m1906d(false);
                                    c0395ki.f3156b.f2797a.m4093I(wl0.f7146c);
                                    c0395ki.f3157c = true;
                                }
                                if (i5 > 0) {
                                    C0788u2 c0788u2M4365a = v11Var3.m4365a(i5);
                                    e30Var.m771c(i5);
                                    c0395ki.m1906d(false);
                                    sm0 sm0Var = c0395ki.f3156b.f2797a;
                                    sm0Var.m4093I(vl0.f6743c);
                                    j50.m1671u(sm0Var, 0, c0788u2M4365a);
                                    c0395ki.f3157c = true;
                                }
                            }
                            sm0 sm0Var2 = c0395ki.f3156b.f2797a;
                            sm0Var2.m4093I(am0.f194c);
                            sm0Var2.f5785c[sm0Var2.f5786d - sm0Var2.f5783a[sm0Var2.f5784b - 1].f4928a] = i4;
                        }
                        m3089V(obj2, z3);
                        cq0Var = null;
                    }
                } else {
                    cq0Var = null;
                }
                m3124u(z3, cq0Var);
                return;
            }
            jRotateLeft = Long.rotateLeft(Long.rotateLeft(this.f4878T, 3) ^ ((long) i), 3) ^ ((long) i9);
        }
        this.f4878T = jRotateLeft;
        if (obj3 == null) {
        }
        if (i2 == 0) {
        }
        if (!this.f4877S) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: T */
    public final void m3087T() {
        m3086S(-127, 0, null, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: U */
    public final void m3088U(int i, il0 il0Var) {
        m3086S(i, 0, il0Var, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: V */
    public final void m3089V(Object obj, boolean z) {
        if (z) {
            v11 v11Var = this.f4865G;
            if (v11Var.f6384k <= 0) {
                if ((v11Var.f6375b[(v11Var.f6380g * 5) + 1] & 1073741824) == 0) {
                    wr0.m5024a("Expected a node group");
                }
                v11Var.m4385u();
                return;
            }
            return;
        }
        if (obj != null && this.f4865G.m4370f() != obj) {
            C0395ki c0395ki = this.f4871M;
            c0395ki.getClass();
            c0395ki.m1906d(false);
            sm0 sm0Var = c0395ki.f3156b.f2797a;
            sm0Var.m4093I(lm0.f3524c);
            j50.m1671u(sm0Var, 0, obj);
        }
        this.f4865G.m4385u();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: W */
    public final void m3090W(int i) {
        int i2;
        int i3;
        if (this.f4889j != null) {
            m3086S(i, 0, null, null);
            return;
        }
        if (this.f4897r) {
            AbstractC0653qi.m3252a("A call to createNode(), emitNode() or useNode() expected");
        }
        this.f4878T = Long.rotateLeft(Long.rotateLeft(this.f4878T, 3) ^ ((long) i), 3) ^ ((long) this.f4892m);
        this.f4892m++;
        v11 v11Var = this.f4865G;
        boolean z = this.f4877S;
        C0675r3 c0675r3 = C0320ii.f2572a;
        if (z) {
            v11Var.f6384k++;
            this.f4867I.m5383Q(i, c0675r3, c0675r3, false);
            m3124u(false, null);
            return;
        }
        if (v11Var.m4371g() == i && ((i3 = v11Var.f6380g) >= v11Var.f6381h || (v11Var.f6375b[(i3 * 5) + 1] & 536870912) == 0)) {
            v11Var.m4385u();
            m3124u(false, null);
            return;
        }
        if (v11Var.f6384k <= 0 && (i2 = v11Var.f6380g) != v11Var.f6381h) {
            int i4 = this.f4890k;
            m3077I();
            this.f4871M.m1907e(i4, v11Var.m4383s());
            pf1.m3051g(this.f4898s, i2, v11Var.f6380g);
        }
        v11Var.f6384k++;
        this.f4877S = true;
        this.f4869K = null;
        if (this.f4867I.f7773w) {
            z11 z11VarM4830d = this.f4866H.m4830d();
            this.f4867I = z11VarM4830d;
            z11VarM4830d.m5379M();
            this.f4868J = false;
            this.f4869K = null;
        }
        z11 z11Var = this.f4867I;
        z11Var.m5391d();
        int i5 = z11Var.f7770t;
        z11Var.m5383Q(i, c0675r3, c0675r3, false);
        this.f4872N = z11Var.m5389b(i5);
        m3124u(false, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006e  */
    /* JADX INFO: renamed from: X */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0616pi m3091X(int i) {
        ht0 ht0Var;
        boolean z;
        m3090W(i);
        boolean z2 = this.f4877S;
        C0910x1 c0910x1 = this.f4886g;
        ArrayList arrayList = this.f4863E;
        C0964yi c0964yi = this.f4887h;
        if (z2) {
            ht0 ht0Var2 = new ht0(c0964yi);
            arrayList.add(ht0Var2);
            m3109h0(ht0Var2);
            ht0Var2.f2363e = this.f4860B;
            ht0Var2.f2360b &= -17;
            c0910x1.m5068h();
            return this;
        }
        int i2 = this.f4865G.f6382i;
        ArrayList arrayList2 = this.f4898s;
        int iM3061u = pf1.m3061u(i2, arrayList2);
        x30 x30Var = iM3061u >= 0 ? (x30) arrayList2.remove(iM3061u) : null;
        Object objM4377m = this.f4865G.m4377m();
        if (p30.m3002l(objM4377m, C0320ii.f2572a)) {
            ht0Var = new ht0(c0964yi);
            m3109h0(ht0Var);
        } else {
            objM4377m.getClass();
            ht0Var = (ht0) objM4377m;
        }
        if (x30Var == null) {
            int i3 = ht0Var.f2360b;
            boolean z3 = (i3 & 64) != 0;
            if (z3) {
                ht0Var.f2360b = i3 & (-65);
            }
            z = z3;
        }
        int i4 = ht0Var.f2360b;
        ht0Var.f2360b = z ? i4 | 8 : i4 & (-9);
        arrayList.add(ht0Var);
        ht0Var.f2363e = this.f4860B;
        ht0Var.f2360b &= -17;
        c0910x1.m5068h();
        int i5 = ht0Var.f2360b;
        if ((i5 & 256) != 0) {
            ht0Var.f2360b = (i5 & (-257)) | 512;
            sm0 sm0Var = this.f4871M.f3156b.f2797a;
            sm0Var.m4093I(jm0.f2913c);
            j50.m1671u(sm0Var, 0, ht0Var);
            if (!this.f4904y) {
                int i6 = ht0Var.f2360b;
                if ((i6 & 128) != 0) {
                    this.f4904y = true;
                    ht0Var.f2360b = i6 | 1024;
                }
            }
        }
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Y */
    public final void m3092Y(Object obj) {
        if (!this.f4877S && this.f4865G.m4371g() == 207 && !p30.m3002l(this.f4865G.m4370f(), obj) && this.f4905z < 0) {
            this.f4905z = this.f4865G.f6380g;
            this.f4904y = true;
        }
        m3086S(207, 0, null, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Z */
    public final void m3093Z() {
        m3086S(125, 2, null, null);
        this.f4897r = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m3094a() {
        m3110i();
        this.f4888i.clear();
        this.f4893n.f1283b = 0;
        this.f4899t.f1283b = 0;
        this.f4903x.f1283b = 0;
        this.f4901v = null;
        C0901wt c0901wt = this.f4873O;
        c0901wt.f7188b.m4089E();
        c0901wt.f7187a.m4089E();
        this.f4878T = 0L;
        this.f4859A = 0;
        this.f4897r = false;
        this.f4877S = false;
        this.f4904y = false;
        this.f4864F = false;
        this.f4905z = -1;
        v11 v11Var = this.f4865G;
        if (!v11Var.f6379f) {
            v11Var.m4367c();
        }
        if (this.f4867I.f7773w) {
            return;
        }
        m3125v();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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
    /* JADX INFO: renamed from: a0 */
    public final void m3095a0() {
        this.f4892m = 0;
        this.f4865G = this.f4882c.m4829c();
        m3086S(100, 0, null, null);
        AbstractC0727si abstractC0727si = this.f4881b;
        abstractC0727si.mo2727t();
        fq0 fq0VarMo2716i = abstractC0727si.mo2716i();
        this.f4903x.m771c(this.f4902w ? 1 : 0);
        this.f4902w = m3104f(fq0VarMo2716i);
        this.f4869K = null;
        if (!this.f4896q) {
            this.f4896q = abstractC0727si.mo2712e();
        }
        if (!this.f4861C) {
            this.f4861C = abstractC0727si.mo2713f();
        }
        if (this.f4861C) {
            g41 g41Var = AbstractC0927xi.f7351a;
            g41Var.getClass();
            fq0VarMo2716i = fq0VarMo2716i.m1175b(g41Var, new h41(m3129z()));
        }
        this.f4900u = fq0VarMo2716i;
        Set set = (Set) AbstractC0398kl.m1936v(fq0VarMo2716i, r20.f5282a);
        if (set != null) {
            set.add(m3126w());
            abstractC0727si.mo2722o(set);
        }
        m3086S(Long.hashCode(abstractC0727si.mo2714g()), 0, null, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m3096b(InterfaceC0904ww interfaceC0904ww, Object obj) {
        if (this.f4877S) {
            sm0 sm0Var = this.f4873O.f7187a;
            sm0Var.m4093I(mm0.f4007c);
            j50.m1671u(sm0Var, 0, obj);
            interfaceC0904ww.getClass();
            s91.m4048m(2, interfaceC0904ww);
            j50.m1671u(sm0Var, 1, interfaceC0904ww);
            return;
        }
        C0395ki c0395ki = this.f4871M;
        c0395ki.m1904b();
        sm0 sm0Var2 = c0395ki.f3156b.f2797a;
        sm0Var2.m4093I(mm0.f4007c);
        interfaceC0904ww.getClass();
        s91.m4048m(2, interfaceC0904ww);
        j50.m1672v(sm0Var2, 0, obj, 1, interfaceC0904ww);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b0 */
    public final boolean m3097b0(ht0 ht0Var, Object obj) {
        C0788u2 c0788u2 = ht0Var.f2361c;
        if (c0788u2 == null) {
            return false;
        }
        int iM4827a = this.f4865G.f6374a.m4827a(c0788u2);
        if (!this.f4864F || iM4827a < this.f4865G.f6380g) {
            return false;
        }
        ArrayList arrayList = this.f4898s;
        int iM3061u = pf1.m3061u(iM4827a, arrayList);
        if (iM3061u < 0) {
            int i = -(iM3061u + 1);
            if (!(obj instanceof C0135dn)) {
                obj = null;
            }
            arrayList.add(i, new x30(ht0Var, iM4827a, obj));
            return true;
        }
        x30 x30Var = (x30) arrayList.get(iM3061u);
        if (!(obj instanceof C0135dn)) {
            x30Var.f7255c = null;
            return true;
        }
        Object obj2 = x30Var.f7255c;
        if (obj2 == null) {
            x30Var.f7255c = obj;
            return true;
        }
        if (obj2 instanceof kh0) {
            ((kh0) obj2).m1890a(obj);
            return true;
        }
        kh0 kh0Var = ey0.f1546a;
        kh0 kh0Var2 = new kh0(2);
        kh0Var2.m1900k(obj2);
        kh0Var2.m1900k(obj);
        x30Var.f7255c = kh0Var2;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final boolean m3098c(float f) {
        Object objM3072D = m3072D();
        if ((objM3072D instanceof Float) && f == ((Number) objM3072D).floatValue()) {
            return false;
        }
        m3109h0(Float.valueOf(f));
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0081  */
    /* JADX INFO: renamed from: c0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3099c0(jh0 jh0Var) {
        ArrayList arrayList = this.f4898s;
        for (int iM2778r = o30.m2778r(arrayList); -1 < iM2778r; iM2778r--) {
            x30 x30Var = (x30) arrayList.get(iM2778r);
            C0788u2 c0788u2 = x30Var.f7253a.f2361c;
            if (c0788u2 == null || !c0788u2.m4246a()) {
                arrayList.remove(iM2778r);
            } else {
                int i = x30Var.f7254b;
                int i2 = c0788u2.f6110a;
                if (i != i2) {
                    x30Var.f7254b = i2;
                }
            }
        }
        Object[] objArr = jh0Var.f2879b;
        Object[] objArr2 = jh0Var.f2880c;
        long[] jArr = jh0Var.f2878a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128) {
                            int i6 = (i3 << 3) + i5;
                            Object obj = objArr[i6];
                            Object obj2 = objArr2[i6];
                            obj.getClass();
                            ht0 ht0Var = (ht0) obj;
                            C0788u2 c0788u22 = ht0Var.f2361c;
                            if (c0788u22 != null) {
                                int i7 = c0788u22.f6110a;
                                if (obj2 == C0496n2.f4139S) {
                                    obj2 = null;
                                }
                                arrayList.add(new x30(ht0Var, i7, obj2));
                            }
                        }
                        j >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    } else if (i3 == length) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
        }
        AbstractC0127df.m688F(arrayList, pf1.f4837c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final boolean m3100d(int i) {
        Object objM3072D = m3072D();
        if ((objM3072D instanceof Integer) && i == ((Number) objM3072D).intValue()) {
            return false;
        }
        m3109h0(Integer.valueOf(i));
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d0 */
    public final void m3101d0(int i, int i2) {
        if (m3111i0(i) != i2) {
            if (i < 0) {
                sg0 sg0Var = this.f4895p;
                if (sg0Var == null) {
                    sg0Var = new sg0();
                    this.f4895p = sg0Var;
                }
                sg0Var.m4070f(i, i2);
                return;
            }
            int[] iArr = this.f4894o;
            if (iArr == null) {
                int i3 = this.f4865G.f6376c;
                int[] iArr2 = new int[i3];
                Arrays.fill(iArr2, 0, i3, -1);
                this.f4894o = iArr2;
                iArr = iArr2;
            }
            iArr[i] = i2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final boolean m3102e(long j) {
        Object objM3072D = m3072D();
        if ((objM3072D instanceof Long) && j == ((Number) objM3072D).longValue()) {
            return false;
        }
        m3109h0(Long.valueOf(j));
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e0 */
    public final void m3103e0(int i, int i2) {
        int iM3111i0 = m3111i0(i);
        if (iM3111i0 != i2) {
            int i3 = i2 - iM3111i0;
            ArrayList arrayList = this.f4888i;
            int size = arrayList.size() - 1;
            while (i != -1) {
                int iM3111i02 = m3111i0(i) + i3;
                m3101d0(i, iM3111i02);
                int i4 = size;
                while (true) {
                    if (-1 < i4) {
                        cq0 cq0Var = (cq0) arrayList.get(i4);
                        if (cq0Var != null && cq0Var.m598a(i, iM3111i02)) {
                            size = i4 - 1;
                            break;
                        }
                        i4--;
                    } else {
                        break;
                    }
                }
                v11 v11Var = this.f4865G;
                if (i < 0) {
                    i = v11Var.f6382i;
                } else if (v11Var.m4376l(i)) {
                    return;
                } else {
                    i = this.f4865G.m4381q(i);
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final boolean m3104f(Object obj) {
        if (p30.m3002l(m3072D(), obj)) {
            return false;
        }
        m3109h0(obj);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f0 */
    public final fq0 m3105f0(fq0 fq0Var, fq0 fq0Var2) {
        fq0Var.getClass();
        eq0 eq0Var = new eq0(fq0Var);
        eq0Var.putAll(fq0Var2);
        fq0 fq0VarM954a = eq0Var.m954a();
        m3088U(204, AbstractC0653qi.f5154d);
        m3072D();
        m3109h0(fq0VarM954a);
        m3072D();
        m3109h0(fq0Var2);
        m3119p(false);
        return fq0VarM954a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final boolean m3106g(boolean z) {
        Object objM3072D = m3072D();
        if ((objM3072D instanceof Boolean) && z == ((Boolean) objM3072D).booleanValue()) {
            return false;
        }
        m3109h0(Boolean.valueOf(z));
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g0 */
    public final void m3107g0(Object obj) {
        if (obj instanceof ju0) {
            ku0 ku0Var = new ku0((ju0) obj, this.f4892m - 1);
            if (this.f4877S) {
                sm0 sm0Var = this.f4871M.f3156b.f2797a;
                sm0Var.m4093I(cm0.f856c);
                j50.m1671u(sm0Var, 0, ku0Var);
            }
            this.f4883d.add(obj);
            obj = ku0Var;
        }
        m3109h0(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final boolean m3108h(Object obj) {
        if (m3072D() == obj) {
            return false;
        }
        m3109h0(obj);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h0 */
    public final void m3109h0(Object obj) {
        if (this.f4877S) {
            z11 z11Var = this.f4867I;
            if (z11Var.f7764n <= 0 || z11Var.f7759i == z11Var.f7761k) {
                z11Var.m5372F(obj);
                return;
            }
            ug0 ug0Var = z11Var.f7769s;
            if (ug0Var == null) {
                ug0Var = new ug0();
            }
            z11Var.f7769s = ug0Var;
            int i = z11Var.f7772v;
            Object objM4248b = ug0Var.m4248b(i);
            if (objM4248b == null) {
                objM4248b = new dh0();
                ug0Var.m4330i(i, objM4248b);
            }
            ((dh0) objM4248b).m697a(obj);
            return;
        }
        v11 v11Var = this.f4865G;
        boolean z = v11Var.f6387n;
        C0395ki c0395ki = this.f4871M;
        if (!z) {
            C0788u2 c0788u2M4365a = v11Var.m4365a(v11Var.f6382i);
            sm0 sm0Var = c0395ki.f3156b.f2797a;
            sm0Var.m4093I(kl0.f3216c);
            j50.m1672v(sm0Var, 0, c0788u2M4365a, 1, obj);
            return;
        }
        int iM5200b = (v11Var.f6385l - y11.m5200b(v11Var.f6375b, v11Var.f6382i)) - 1;
        if (c0395ki.f3155a.f4865G.f6382i - c0395ki.f3160f >= 0) {
            c0395ki.m1906d(true);
            sm0 sm0Var2 = c0395ki.f3156b.f2797a;
            sm0Var2.m4093I(xl0.f7372g);
            j50.m1671u(sm0Var2, 0, obj);
            sm0Var2.f5785c[sm0Var2.f5786d - sm0Var2.f5783a[sm0Var2.f5784b - 1].f4928a] = iM5200b;
            return;
        }
        v11 v11Var2 = this.f4865G;
        C0788u2 c0788u2M4365a2 = v11Var2.m4365a(v11Var2.f6382i);
        sm0 sm0Var3 = c0395ki.f3156b.f2797a;
        sm0Var3.m4093I(xl0.f7371f);
        j50.m1672v(sm0Var3, 0, obj, 1, c0788u2M4365a2);
        sm0Var3.f5785c[sm0Var3.f5786d - sm0Var3.f5783a[sm0Var3.f5784b - 1].f4928a] = iM5200b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final void m3110i() {
        this.f4889j = null;
        this.f4890k = 0;
        this.f4891l = 0;
        this.f4878T = 0L;
        this.f4897r = false;
        C0395ki c0395ki = this.f4871M;
        c0395ki.f3157c = false;
        c0395ki.f3158d.f1283b = 0;
        c0395ki.f3160f = 0;
        c0395ki.f3159e = true;
        c0395ki.f3161g = 0;
        c0395ki.f3162h.clear();
        c0395ki.f3163i = -1;
        c0395ki.f3164j = -1;
        c0395ki.f3165k = -1;
        c0395ki.f3166l = 0;
        this.f4863E.clear();
        this.f4894o = null;
        this.f4895p = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i0 */
    public final int m3111i0(int i) {
        int i2;
        if (i >= 0) {
            int[] iArr = this.f4894o;
            return (iArr == null || (i2 = iArr[i]) < 0) ? this.f4865G.m4379o(i) : i2;
        }
        sg0 sg0Var = this.f4895p;
        if (sg0Var == null || sg0Var.m4067c(i) < 0) {
            return 0;
        }
        int iM4067c = sg0Var.m4067c(i);
        if (iM4067c >= 0) {
            return sg0Var.f5763c[iM4067c];
        }
        throw new NoSuchElementException(AbstractC0748t1.m4154l("Cannot find value for key ", i));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final Object m3112j(at0 at0Var) {
        return AbstractC0398kl.m1936v(m3115l(), at0Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j0 */
    public final void m3113j0() {
        if (!this.f4897r) {
            AbstractC0653qi.m3252a("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.f4897r = false;
        if (this.f4877S) {
            AbstractC0653qi.m3252a("useNode() called while inserting");
        }
        v11 v11Var = this.f4865G;
        Object objM4378n = v11Var.m4378n(v11Var.f6382i);
        C0395ki c0395ki = this.f4871M;
        c0395ki.m1905c();
        c0395ki.f3162h.add(objM4378n);
        if (this.f4904y && (objM4378n instanceof InterfaceC0852vh)) {
            c0395ki.m1904b();
            c0395ki.f3156b.f2797a.m4093I(om0.f4594c);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final void m3114k(InterfaceC0298hw interfaceC0298hw) {
        if (!this.f4897r) {
            AbstractC0653qi.m3252a("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.f4897r = false;
        if (!this.f4877S) {
            AbstractC0653qi.m3252a("createNode() can only be called when inserting");
        }
        e30 e30Var = this.f4893n;
        int i = e30Var.f1282a[e30Var.f1283b - 1];
        z11 z11Var = this.f4867I;
        C0788u2 c0788u2M5389b = z11Var.m5389b(z11Var.f7772v);
        this.f4891l++;
        C0901wt c0901wt = this.f4873O;
        sm0 sm0Var = c0901wt.f7187a;
        sm0Var.m4093I(xl0.f7369d);
        j50.m1671u(sm0Var, 0, interfaceC0298hw);
        sm0Var.f5785c[sm0Var.f5786d - sm0Var.f5783a[sm0Var.f5784b - 1].f4928a] = i;
        j50.m1671u(sm0Var, 1, c0788u2M5389b);
        sm0 sm0Var2 = c0901wt.f7188b;
        sm0Var2.m4093I(xl0.f7370e);
        sm0Var2.f5785c[sm0Var2.f5786d - sm0Var2.f5783a[sm0Var2.f5784b - 1].f4928a] = i;
        j50.m1671u(sm0Var2, 0, c0788u2M5389b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public final fq0 m3115l() {
        fq0 fq0Var;
        fq0 fq0Var2 = this.f4869K;
        if (fq0Var2 != null) {
            return fq0Var2;
        }
        int iM4381q = this.f4865G.f6382i;
        boolean z = this.f4877S;
        il0 il0Var = AbstractC0653qi.f5153c;
        if (z && this.f4868J) {
            int iM5371E = this.f4867I.f7772v;
            while (iM5371E > 0) {
                if (this.f4867I.m5405s(iM5371E) == 202 && p30.m3002l(this.f4867I.m5406t(iM5371E), il0Var)) {
                    Object objM5403q = this.f4867I.m5403q(iM5371E);
                    objM5403q.getClass();
                    fq0 fq0Var3 = (fq0) objM5403q;
                    this.f4869K = fq0Var3;
                    return fq0Var3;
                }
                z11 z11Var = this.f4867I;
                iM5371E = z11Var.m5371E(z11Var.f7752b, iM5371E);
            }
        }
        if (this.f4865G.f6376c > 0) {
            while (iM4381q > 0) {
                if (this.f4865G.m4373i(iM4381q) == 202) {
                    v11 v11Var = this.f4865G;
                    if (p30.m3002l(v11Var.m4380p(v11Var.f6375b, iM4381q), il0Var)) {
                        ug0 ug0Var = this.f4901v;
                        if (ug0Var == null || (fq0Var = (fq0) ug0Var.m4248b(iM4381q)) == null) {
                            v11 v11Var2 = this.f4865G;
                            Object objM4366b = v11Var2.m4366b(v11Var2.f6375b, iM4381q);
                            objM4366b.getClass();
                            fq0Var = (fq0) objM4366b;
                        }
                        this.f4869K = fq0Var;
                        return fq0Var;
                    }
                }
                iM4381q = this.f4865G.m4381q(iM4381q);
            }
        }
        fq0 fq0Var4 = this.f4900u;
        this.f4869K = fq0Var4;
        return fq0Var4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public final C0093ci m3116m() {
        Collection collection;
        if (!this.f4881b.mo2718k()) {
            return null;
        }
        wa0 wa0Var = new wa0(10);
        z11 z11Var = this.f4867I;
        wa0Var.addAll(p30.m3006p(z11Var, null, z11Var.f7770t, null));
        v11 v11Var = this.f4865G;
        boolean z = v11Var.f6379f;
        int[] iArr = v11Var.f6375b;
        if (z || v11Var.f6376c == 0) {
            collection = C0294hs.f2354d;
        } else {
            et0 et0Var = new et0(v11Var);
            int iM4381q = v11Var.f6382i;
            Object objValueOf = Integer.valueOf(v11Var.f6385l - y11.m5200b(iArr, iM4381q));
            while (iM4381q >= 0) {
                et0Var.m968c(v11Var.m4373i(iM4381q), v11Var.m4375k(iM4381q) ? v11Var.m4380p(iArr, iM4381q) : C0320ii.f2572a, v11Var.f6374a.m4832f(iM4381q), objValueOf);
                objValueOf = v11Var.m4365a(iM4381q);
                iM4381q = v11Var.m4381q(iM4381q);
            }
            collection = et0Var.f1526a;
        }
        wa0Var.addAll(collection);
        wa0Var.addAll(m3073E());
        return new C0093ci(o30.m2772l(wa0Var));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX INFO: renamed from: n */
    public final void m3117n(jh0 jh0Var, InterfaceC0904ww interfaceC0904ww) {
        ArrayList arrayList = this.f4898s;
        if (this.f4864F) {
            AbstractC0653qi.m3252a("Reentrant composition is not supported");
        }
        this.f4886g.m5068h();
        Trace.beginSection("Compose:recompose");
        try {
            this.f4860B = Long.hashCode(t21.m4172j().mo811g());
            this.f4901v = null;
            m3099c0(jh0Var);
            this.f4890k = 0;
            this.f4864F = true;
            try {
                m3095a0();
                Object objM3072D = m3072D();
                if (objM3072D != interfaceC0904ww && interfaceC0904ww != null) {
                    m3109h0(interfaceC0904ww);
                }
                C0552oi c0552oi = this.f4862D;
                sh0 sh0VarM3409k = r60.m3409k();
                try {
                    sh0VarM3409k.m4072b(c0552oi);
                    il0 il0Var = AbstractC0653qi.f5151a;
                    if (interfaceC0904ww != null) {
                        m3088U(200, il0Var);
                        s91.m4048m(2, interfaceC0904ww);
                        interfaceC0904ww.invoke(this, 1);
                        m3119p(false);
                    } else if (!this.f4902w || objM3072D == null || objM3072D.equals(C0320ii.f2572a)) {
                        m3083P();
                    } else {
                        m3088U(200, il0Var);
                        s91.m4048m(2, objM3072D);
                        InterfaceC0904ww interfaceC0904ww2 = (InterfaceC0904ww) objM3072D;
                        s91.m4048m(2, interfaceC0904ww2);
                        interfaceC0904ww2.invoke(this, 1);
                        m3119p(false);
                    }
                    sh0VarM3409k.m4081k(sh0VarM3409k.f5770f - 1);
                    m3123t();
                    this.f4864F = false;
                    arrayList.clear();
                    if (!this.f4867I.f7773w) {
                        AbstractC0653qi.m3252a("Check failed");
                    }
                    m3125v();
                } catch (Throwable th) {
                    sh0VarM3409k.m4081k(sh0VarM3409k.f5770f - 1);
                    throw th;
                }
            } finally {
            }
        } finally {
            Trace.endSection();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public final void m3118o(int i, int i2) {
        if (i <= 0 || i == i2) {
            return;
        }
        m3118o(this.f4865G.m4381q(i), i2);
        if (this.f4865G.m4376l(i)) {
            Object objM4378n = this.f4865G.m4378n(i);
            C0395ki c0395ki = this.f4871M;
            c0395ki.m1905c();
            c0395ki.f3162h.add(objM4378n);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r42v0, resolved type: pi */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x050b  */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v29, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3119p(boolean z) {
        long jRotateRight;
        e30 e30Var;
        ArrayList arrayList;
        int i;
        ?? r3;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        e30 e30Var2;
        int i7;
        int i8;
        ArrayList arrayList2;
        LinkedHashSet linkedHashSet;
        int i9;
        int i10;
        ArrayList arrayList3;
        ArrayList arrayList4;
        HashSet hashSet;
        int i11;
        cq0 cq0Var;
        int i12;
        Object[] objArr;
        long[] jArr;
        int i13;
        Object[] objArr2;
        long[] jArr2;
        int i14;
        Object[] objArr3;
        long[] jArr3;
        int i15;
        Object[] objArr4;
        long[] jArr4;
        long jRotateRight2;
        e30 e30Var3 = this.f4893n;
        int i16 = e30Var3.f1282a[e30Var3.f1283b - 2] - 1;
        boolean z2 = this.f4877S;
        C0675r3 c0675r3 = C0320ii.f2572a;
        if (z2) {
            z11 z11Var = this.f4867I;
            int i17 = z11Var.f7772v;
            int iM5405s = z11Var.m5405s(i17);
            Object objM5406t = this.f4867I.m5406t(i17);
            Object objM5403q = this.f4867I.m5403q(i17);
            if (objM5406t != null) {
                jRotateRight2 = Long.rotateRight(this.f4878T, 3) ^ ((long) (objM5406t instanceof Enum ? ((Enum) objM5406t).ordinal() : objM5406t.hashCode()));
            } else if (objM5403q == null || iM5405s != 207 || objM5403q.equals(c0675r3)) {
                jRotateRight2 = Long.rotateRight(this.f4878T ^ ((long) i16), 3) ^ ((long) iM5405s);
            } else {
                this.f4878T = Long.rotateRight(Long.rotateRight(this.f4878T ^ ((long) i16), 3) ^ ((long) objM5403q.hashCode()), 3);
            }
            this.f4878T = Long.rotateRight(jRotateRight2, 3);
        } else {
            v11 v11Var = this.f4865G;
            int i18 = v11Var.f6382i;
            int iM4373i = v11Var.m4373i(i18);
            v11 v11Var2 = this.f4865G;
            Object objM4380p = v11Var2.m4380p(v11Var2.f6375b, i18);
            v11 v11Var3 = this.f4865G;
            Object objM4366b = v11Var3.m4366b(v11Var3.f6375b, i18);
            if (objM4380p != null) {
                jRotateRight = Long.rotateRight(this.f4878T, 3) ^ ((long) (objM4380p instanceof Enum ? ((Enum) objM4380p).ordinal() : objM4380p.hashCode()));
            } else if (objM4366b == null || iM4373i != 207 || objM4366b.equals(c0675r3)) {
                jRotateRight = Long.rotateRight(this.f4878T ^ ((long) i16), 3) ^ ((long) iM4373i);
            } else {
                this.f4878T = Long.rotateRight(Long.rotateRight(this.f4878T ^ ((long) i16), 3) ^ ((long) objM4366b.hashCode()), 3);
            }
            this.f4878T = Long.rotateRight(jRotateRight, 3);
        }
        int i19 = this.f4891l;
        cq0 cq0Var2 = this.f4889j;
        ArrayList arrayList5 = this.f4898s;
        C0395ki c0395ki = this.f4871M;
        if (cq0Var2 != null) {
            ug0 ug0Var = cq0Var2.f879e;
            int i20 = cq0Var2.f876b;
            ArrayList arrayList6 = cq0Var2.f875a;
            if (arrayList6.size() > 0) {
                ArrayList arrayList7 = cq0Var2.f878d;
                HashSet hashSet2 = new HashSet(arrayList7.size());
                int size = arrayList7.size();
                for (int i21 = 0; i21 < size; i21++) {
                    hashSet2.add(arrayList7.get(i21));
                }
                i = -1;
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                int size2 = arrayList7.size();
                int size3 = arrayList6.size();
                int i22 = 0;
                int i23 = 0;
                int i24 = 0;
                while (i22 < size3) {
                    z40 z40Var = (z40) arrayList6.get(i22);
                    if (hashSet2.contains(z40Var)) {
                        e30Var2 = e30Var3;
                        i7 = i22;
                        if (!linkedHashSet2.contains(z40Var)) {
                            int i25 = i23;
                            if (i25 < size2) {
                                z40 z40Var2 = (z40) arrayList7.get(i25);
                                if (z40Var2 != z40Var) {
                                    C0109cy c0109cy = (C0109cy) ug0Var.m4248b(z40Var2.f7796c);
                                    int i26 = c0109cy != null ? c0109cy.f911b : -1;
                                    linkedHashSet2.add(z40Var2);
                                    i8 = i25;
                                    i11 = i24;
                                    cq0Var = cq0Var2;
                                    if (i26 != i11) {
                                        C0109cy c0109cy2 = (C0109cy) ug0Var.m4248b(z40Var2.f7796c);
                                        int i27 = c0109cy2 != null ? c0109cy2.f912c : z40Var2.f7797d;
                                        linkedHashSet = linkedHashSet2;
                                        int i28 = i26 + i20;
                                        i9 = size2;
                                        int i29 = i11 + i20;
                                        if (i27 > 0) {
                                            i10 = i20;
                                            int i30 = c0395ki.f3166l;
                                            if (i30 > 0) {
                                                arrayList3 = arrayList6;
                                                if (c0395ki.f3164j == i28 - i30 && c0395ki.f3165k == i29 - i30) {
                                                    c0395ki.f3166l = i30 + i27;
                                                }
                                            } else {
                                                arrayList3 = arrayList6;
                                            }
                                            c0395ki.m1905c();
                                            c0395ki.f3164j = i28;
                                            c0395ki.f3165k = i29;
                                            c0395ki.f3166l = i27;
                                        } else {
                                            i10 = i20;
                                            arrayList3 = arrayList6;
                                            c0395ki.getClass();
                                        }
                                        if (i26 > i11) {
                                            Object[] objArr5 = ug0Var.f6113c;
                                            long[] jArr5 = ug0Var.f6111a;
                                            int length = jArr5.length - 2;
                                            if (length >= 0) {
                                                arrayList4 = arrayList7;
                                                hashSet = hashSet2;
                                                int i31 = 0;
                                                while (true) {
                                                    long j = jArr5[i31];
                                                    int i32 = i27;
                                                    arrayList2 = arrayList5;
                                                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i33 = 8 - ((~(i31 - length)) >>> 31);
                                                        int i34 = 0;
                                                        while (i34 < i33) {
                                                            if ((j & 255) < 128) {
                                                                i15 = i34;
                                                                C0109cy c0109cy3 = (C0109cy) objArr5[(i31 << 3) + i34];
                                                                objArr4 = objArr5;
                                                                int i35 = c0109cy3.f911b;
                                                                jArr4 = jArr5;
                                                                if (i26 <= i35 && i35 < i26 + i32) {
                                                                    c0109cy3.f911b = (i35 - i26) + i11;
                                                                } else if (i11 <= i35 && i35 < i26) {
                                                                    c0109cy3.f911b = i35 + i32;
                                                                }
                                                            } else {
                                                                i15 = i34;
                                                                objArr4 = objArr5;
                                                                jArr4 = jArr5;
                                                            }
                                                            j >>= 8;
                                                            i34 = i15 + 1;
                                                            objArr5 = objArr4;
                                                            jArr5 = jArr4;
                                                        }
                                                        objArr3 = objArr5;
                                                        jArr3 = jArr5;
                                                        if (i33 != 8) {
                                                            break;
                                                        }
                                                    } else {
                                                        objArr3 = objArr5;
                                                        jArr3 = jArr5;
                                                    }
                                                    if (i31 == length) {
                                                        break;
                                                    }
                                                    i31++;
                                                    arrayList5 = arrayList2;
                                                    i27 = i32;
                                                    objArr5 = objArr3;
                                                    jArr5 = jArr3;
                                                }
                                            } else {
                                                arrayList2 = arrayList5;
                                            }
                                        } else {
                                            int i36 = i27;
                                            arrayList2 = arrayList5;
                                            arrayList4 = arrayList7;
                                            hashSet = hashSet2;
                                            if (i11 > i26) {
                                                Object[] objArr6 = ug0Var.f6113c;
                                                long[] jArr6 = ug0Var.f6111a;
                                                int length2 = jArr6.length - 2;
                                                if (length2 >= 0) {
                                                    int i37 = 0;
                                                    while (true) {
                                                        long j2 = jArr6[i37];
                                                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                            int i38 = 8 - ((~(i37 - length2)) >>> 31);
                                                            int i39 = 0;
                                                            while (i39 < i38) {
                                                                if ((j2 & 255) < 128) {
                                                                    objArr2 = objArr6;
                                                                    C0109cy c0109cy4 = (C0109cy) objArr6[(i37 << 3) + i39];
                                                                    jArr2 = jArr6;
                                                                    int i40 = c0109cy4.f911b;
                                                                    i14 = i26;
                                                                    if (i26 <= i40 && i40 < i14 + i36) {
                                                                        c0109cy4.f911b = (i40 - i14) + i11;
                                                                    } else if (i14 + 1 <= i40 && i40 < i11) {
                                                                        c0109cy4.f911b = i40 - i36;
                                                                    }
                                                                } else {
                                                                    objArr2 = objArr6;
                                                                    jArr2 = jArr6;
                                                                    i14 = i26;
                                                                }
                                                                j2 >>= 8;
                                                                i39++;
                                                                jArr6 = jArr2;
                                                                objArr6 = objArr2;
                                                                i26 = i14;
                                                            }
                                                            objArr = objArr6;
                                                            jArr = jArr6;
                                                            i13 = i26;
                                                            if (i38 != 8) {
                                                                break;
                                                            }
                                                        } else {
                                                            objArr = objArr6;
                                                            jArr = jArr6;
                                                            i13 = i26;
                                                        }
                                                        if (i37 == length2) {
                                                            break;
                                                        }
                                                        i37++;
                                                        jArr6 = jArr;
                                                        objArr6 = objArr;
                                                        i26 = i13;
                                                    }
                                                }
                                            }
                                        }
                                        i12 = i7;
                                    } else {
                                        arrayList2 = arrayList5;
                                        linkedHashSet = linkedHashSet2;
                                        i9 = size2;
                                        i10 = i20;
                                        arrayList3 = arrayList6;
                                    }
                                    arrayList4 = arrayList7;
                                    hashSet = hashSet2;
                                    i12 = i7;
                                } else {
                                    i8 = i25;
                                    arrayList2 = arrayList5;
                                    linkedHashSet = linkedHashSet2;
                                    i9 = size2;
                                    i10 = i20;
                                    arrayList3 = arrayList6;
                                    arrayList4 = arrayList7;
                                    hashSet = hashSet2;
                                    i11 = i24;
                                    cq0Var = cq0Var2;
                                    i12 = i7 + 1;
                                }
                                i23 = i8 + 1;
                                C0109cy c0109cy5 = (C0109cy) ug0Var.m4248b(z40Var2.f7796c);
                                int i41 = i11 + (c0109cy5 != null ? c0109cy5.f912c : z40Var2.f7797d);
                                i22 = i12;
                                cq0Var2 = cq0Var;
                                linkedHashSet2 = linkedHashSet;
                                size2 = i9;
                                i20 = i10;
                                arrayList6 = arrayList3;
                                arrayList7 = arrayList4;
                                hashSet2 = hashSet;
                                arrayList5 = arrayList2;
                                i24 = i41;
                                e30Var3 = e30Var2;
                            } else {
                                i23 = i25;
                                e30Var3 = e30Var2;
                                i22 = i7;
                            }
                        }
                    } else {
                        e30Var2 = e30Var3;
                        C0109cy c0109cy6 = (C0109cy) ug0Var.m4248b(z40Var.f7796c);
                        int i42 = c0109cy6 != null ? c0109cy6.f911b : -1;
                        int i43 = z40Var.f7796c;
                        i7 = i22;
                        c0395ki.m1907e(i42 + i20, z40Var.f7797d);
                        cq0Var2.m598a(i43, 0);
                        c0395ki.f3160f = (i43 - c0395ki.f3155a.f4865G.f6380g) + c0395ki.f3160f;
                        this.f4865G.m4382r(i43);
                        m3077I();
                        this.f4865G.m4383s();
                        pf1.m3051g(arrayList5, i43, this.f4865G.f6375b[(i43 * 5) + 3] + i43);
                    }
                    i22 = i7 + 1;
                    e30Var3 = e30Var2;
                }
                e30Var = e30Var3;
                arrayList = arrayList5;
                c0395ki.m1905c();
                if (arrayList6.size() > 0) {
                    v11 v11Var4 = this.f4865G;
                    c0395ki.f3160f = (v11Var4.f6381h - c0395ki.f3155a.f4865G.f6380g) + c0395ki.f3160f;
                    v11Var4.m4384t();
                }
            } else {
                e30Var = e30Var3;
                arrayList = arrayList5;
                i = -1;
            }
        }
        boolean z3 = this.f4877S;
        if (!z3) {
            v11 v11Var5 = this.f4865G;
            int i44 = v11Var5.f6386m - v11Var5.f6385l;
            if (i44 > 0) {
                if (i44 > 0) {
                    c0395ki.m1906d(false);
                    e30 e30Var4 = c0395ki.f3158d;
                    v11 v11Var6 = c0395ki.f3155a.f4865G;
                    if (v11Var6.f6376c > 0 && e30Var4.m769a(-2) != (i6 = v11Var6.f6382i)) {
                        if (!c0395ki.f3157c && c0395ki.f3159e) {
                            c0395ki.m1906d(false);
                            c0395ki.f3156b.f2797a.m4093I(wl0.f7146c);
                            c0395ki.f3157c = true;
                        }
                        if (i6 > 0) {
                            C0788u2 c0788u2M4365a = v11Var6.m4365a(i6);
                            e30Var4.m771c(i6);
                            c0395ki.m1906d(false);
                            sm0 sm0Var = c0395ki.f3156b.f2797a;
                            sm0Var.m4093I(vl0.f6743c);
                            j50.m1671u(sm0Var, 0, c0788u2M4365a);
                            c0395ki.f3157c = true;
                        }
                    }
                    sm0 sm0Var2 = c0395ki.f3156b.f2797a;
                    sm0Var2.m4093I(km0.f3219c);
                    sm0Var2.f5785c[sm0Var2.f5786d - sm0Var2.f5783a[sm0Var2.f5784b - 1].f4928a] = i44;
                } else {
                    c0395ki.getClass();
                }
            }
        }
        int i45 = this.f4890k;
        while (true) {
            v11 v11Var7 = this.f4865G;
            if (v11Var7.f6384k > 0 || (i5 = v11Var7.f6380g) == v11Var7.f6381h) {
                break;
            }
            m3077I();
            c0395ki.m1907e(i45, this.f4865G.m4383s());
            pf1.m3051g(arrayList, i5, this.f4865G.f6380g);
        }
        if (z3) {
            if (z) {
                C0901wt c0901wt = this.f4873O;
                sm0 sm0Var3 = c0901wt.f7188b;
                if (!sm0Var3.m4092H()) {
                    AbstractC0653qi.m3252a("Cannot end node insertion, there are no pending operations that can be realized.");
                }
                sm0 sm0Var4 = c0901wt.f7187a;
                pm0[] pm0VarArr = sm0Var3.f5783a;
                int i46 = sm0Var3.f5784b - 1;
                sm0Var3.f5784b = i46;
                pm0 pm0Var = pm0VarArr[i46];
                pm0VarArr[i46] = null;
                sm0Var4.m4093I(pm0Var);
                Object[] objArr7 = sm0Var3.f5787e;
                Object[] objArr8 = sm0Var4.f5787e;
                int i47 = sm0Var4.f5788f;
                int i48 = pm0Var.f4929b;
                int i49 = sm0Var3.f5788f;
                int i50 = i49 - i48;
                System.arraycopy(objArr7, i50, objArr8, i47 - i48, i49 - i50);
                Object[] objArr9 = sm0Var3.f5787e;
                int i51 = sm0Var3.f5788f;
                Arrays.fill(objArr9, i51 - i48, i51, (Object) null);
                int[] iArr = sm0Var3.f5785c;
                int[] iArr2 = sm0Var4.f5785c;
                int i52 = sm0Var4.f5786d;
                int i53 = pm0Var.f4928a;
                int i54 = sm0Var3.f5786d;
                AbstractC0201f9.m1055a0(iArr, iArr2, i52 - i53, i54 - i53, i54);
                sm0Var3.f5788f -= i48;
                sm0Var3.f5786d -= i53;
                i19 = 1;
            }
            if (this.f4865G.f6384k <= 0) {
                wr0.m5024a("Unbalanced begin/end empty");
            }
            r4.f6384k--;
            z11 z11Var2 = this.f4867I;
            int i55 = z11Var2.f7772v;
            z11Var2.m5396j();
            if (this.f4865G.f6384k <= 0) {
                int i56 = (-2) - i55;
                this.f4867I.m5397k();
                this.f4867I.m5392e(true);
                C0788u2 c0788u2 = this.f4872N;
                boolean zM4091G = this.f4873O.f7187a.m4091G();
                w11 w11Var = this.f4866H;
                if (zM4091G) {
                    c0395ki.m1904b();
                    c0395ki.m1906d(false);
                    e30 e30Var5 = c0395ki.f3158d;
                    v11 v11Var8 = c0395ki.f3155a.f4865G;
                    if (v11Var8.f6376c <= 0 || e30Var5.m769a(-2) == (i4 = v11Var8.f6382i)) {
                        i3 = 1;
                        c0395ki.m1905c();
                        sm0 sm0Var5 = c0395ki.f3156b.f2797a;
                        sm0Var5.m4093I(yl0.f7656c);
                        j50.m1672v(sm0Var5, 0, c0788u2, i3, w11Var);
                        r3 = 0;
                    } else {
                        if (!c0395ki.f3157c && c0395ki.f3159e) {
                            c0395ki.m1906d(false);
                            c0395ki.f3156b.f2797a.m4093I(wl0.f7146c);
                            c0395ki.f3157c = true;
                        }
                        if (i4 > 0) {
                            C0788u2 c0788u2M4365a2 = v11Var8.m4365a(i4);
                            e30Var5.m771c(i4);
                            c0395ki.m1906d(false);
                            sm0 sm0Var6 = c0395ki.f3156b.f2797a;
                            sm0Var6.m4093I(vl0.f6743c);
                            j50.m1671u(sm0Var6, 0, c0788u2M4365a2);
                            i3 = 1;
                            c0395ki.f3157c = true;
                        }
                        c0395ki.m1905c();
                        sm0 sm0Var52 = c0395ki.f3156b.f2797a;
                        sm0Var52.m4093I(yl0.f7656c);
                        j50.m1672v(sm0Var52, 0, c0788u2, i3, w11Var);
                        r3 = 0;
                    }
                } else {
                    C0901wt c0901wt2 = this.f4873O;
                    c0395ki.m1904b();
                    c0395ki.m1906d(false);
                    e30 e30Var6 = c0395ki.f3158d;
                    v11 v11Var9 = c0395ki.f3155a.f4865G;
                    if (v11Var9.f6376c > 0 && e30Var6.m769a(-2) != (i2 = v11Var9.f6382i)) {
                        if (!c0395ki.f3157c && c0395ki.f3159e) {
                            c0395ki.m1906d(false);
                            c0395ki.f3156b.f2797a.m4093I(wl0.f7146c);
                            c0395ki.f3157c = true;
                        }
                        if (i2 > 0) {
                            C0788u2 c0788u2M4365a3 = v11Var9.m4365a(i2);
                            e30Var6.m771c(i2);
                            c0395ki.m1906d(false);
                            sm0 sm0Var7 = c0395ki.f3156b.f2797a;
                            sm0Var7.m4093I(vl0.f6743c);
                            j50.m1671u(sm0Var7, 0, c0788u2M4365a3);
                            c0395ki.f3157c = true;
                        }
                    }
                    c0395ki.m1905c();
                    sm0 sm0Var8 = c0395ki.f3156b.f2797a;
                    sm0Var8.m4093I(zl0.f7923c);
                    int i57 = sm0Var8.f5788f - sm0Var8.f5783a[sm0Var8.f5784b - 1].f4929b;
                    Object[] objArr10 = sm0Var8.f5787e;
                    objArr10[i57] = c0788u2;
                    objArr10[i57 + 1] = w11Var;
                    objArr10[i57 + 2] = c0901wt2;
                    this.f4873O = new C0901wt();
                    r3 = 0;
                }
                this.f4877S = r3;
                if (this.f4882c.f6894e != 0) {
                    m3101d0(i56, r3);
                    m3103e0(i56, i19);
                }
            }
        } else {
            if (z) {
                c0395ki.m1903a();
            }
            int i58 = c0395ki.f3155a.f4865G.f6382i;
            e30 e30Var7 = c0395ki.f3158d;
            int i59 = i;
            if (e30Var7.m769a(i59) > i58) {
                AbstractC0653qi.m3252a("Missed recording an endGroup");
            }
            if (e30Var7.m769a(i59) == i58) {
                c0395ki.m1906d(false);
                e30Var7.m770b();
                c0395ki.f3156b.f2797a.m4093I(sl0.f5780c);
            }
            int i60 = this.f4865G.f6382i;
            if (i19 != m3111i0(i60)) {
                m3103e0(i60, i19);
            }
            if (z) {
                i19 = 1;
            }
            this.f4865G.m4369e();
            c0395ki.m1905c();
        }
        cq0 cq0Var3 = (cq0) this.f4888i.remove(r3.size() - 1);
        if (cq0Var3 != null && !z3) {
            cq0Var3.f877c++;
        }
        this.f4889j = cq0Var3;
        this.f4890k = e30Var.m770b() + i19;
        this.f4892m = e30Var.m770b();
        this.f4891l = e30Var.m770b() + i19;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public final void m3120q() {
        m3119p(false);
        ht0 ht0VarM3127x = m3127x();
        if (ht0VarM3127x != null) {
            int i = ht0VarM3127x.f2360b;
            if ((i & 1) != 0) {
                ht0VarM3127x.f2360b = i | 2;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0082 A[EDGE_INSN: B:59:0x0082->B:28:0x0082 BREAK  A[LOOP:0: B:15:0x003e->B:27:0x007f], EDGE_INSN: B:60:0x0082->B:28:0x0082 BREAK  A[LOOP:0: B:15:0x003e->B:27:0x007f]] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f2  */
    /* JADX INFO: renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ht0 m3121r() {
        ht0 ht0Var;
        C0788u2 c0788u2M4365a;
        mc0 mc0Var;
        int i;
        ArrayList arrayList = this.f4863E;
        int i2 = 1;
        ht0 ht0Var2 = !arrayList.isEmpty() ? (ht0) arrayList.remove(arrayList.size() - 1) : null;
        if (ht0Var2 != null) {
            ht0Var2.f2360b &= -9;
            this.f4886g.m5068h();
            int i3 = this.f4860B;
            ch0 ch0Var = ht0Var2.f2364f;
            if (ch0Var == null || (ht0Var2.f2360b & 16) != 0) {
                mc0Var = null;
                C0395ki c0395ki = this.f4871M;
                if (mc0Var != null) {
                    sm0 sm0Var = c0395ki.f3156b.f2797a;
                    sm0Var.m4093I(rl0.f5428c);
                    j50.m1672v(sm0Var, 0, mc0Var, 1, this.f4887h);
                }
                i = ht0Var2.f2360b;
                if ((i & 512) != 0) {
                    ht0Var2.f2360b = i & (-513);
                    sm0 sm0Var2 = c0395ki.f3156b.f2797a;
                    sm0Var2.m4093I(ul0.f6258c);
                    j50.m1671u(sm0Var2, 0, ht0Var2);
                    int i4 = ht0Var2.f2360b;
                    ht0Var2.f2360b = i4 & (-129);
                    if ((i4 & 1024) != 0) {
                        ht0Var2.f2360b = i4 & (-1153);
                        this.f4904y = false;
                    }
                }
            } else {
                Object[] objArr = ch0Var.f811b;
                int[] iArr = ch0Var.f812c;
                long[] jArr = ch0Var.f810a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i5 = 0;
                    loop0: while (true) {
                        long j = jArr[i5];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i6 = 8 - ((~(i5 - length)) >>> 31);
                            for (int i7 = 0; i7 < i6; i7++) {
                                if ((j & 255) < 128) {
                                    int i8 = (i5 << 3) + i7;
                                    Object obj = objArr[i8];
                                    if (iArr[i8] != i3) {
                                        mc0Var = new mc0(i3, i2, ht0Var2, ch0Var);
                                        break loop0;
                                    }
                                }
                                j >>= 8;
                            }
                            if (i6 != 8) {
                                break;
                            }
                            if (i5 == length) {
                                break;
                            }
                            i5++;
                        }
                    }
                    mc0Var = null;
                    C0395ki c0395ki2 = this.f4871M;
                    if (mc0Var != null) {
                    }
                    i = ht0Var2.f2360b;
                    if ((i & 512) != 0) {
                    }
                }
            }
        }
        if (ht0Var2 != null) {
            int i9 = ht0Var2.f2360b;
            if ((i9 & 16) == 0 && ((i9 & 1) != 0 || this.f4896q)) {
                if (ht0Var2.f2361c == null) {
                    if (this.f4877S) {
                        z11 z11Var = this.f4867I;
                        c0788u2M4365a = z11Var.m5389b(z11Var.f7772v);
                    } else {
                        v11 v11Var = this.f4865G;
                        c0788u2M4365a = v11Var.m4365a(v11Var.f6382i);
                    }
                    ht0Var2.f2361c = c0788u2M4365a;
                }
                ht0Var2.f2360b &= -5;
                ht0Var = ht0Var2;
            } else {
                ht0Var = null;
            }
        }
        m3119p(false);
        return ht0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public final void m3122s() {
        if (this.f4864F || this.f4905z != 100) {
            wr0.m5024a("Cannot disable reuse from root if it was caused by other groups");
        }
        this.f4905z = -1;
        this.f4904y = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public final void m3123t() {
        m3119p(false);
        this.f4881b.mo2710c();
        m3119p(false);
        C0395ki c0395ki = this.f4871M;
        if (c0395ki.f3157c) {
            c0395ki.m1906d(false);
            c0395ki.m1906d(false);
            c0395ki.f3156b.f2797a.m4093I(sl0.f5780c);
            c0395ki.f3157c = false;
        }
        c0395ki.m1904b();
        if (c0395ki.f3158d.f1283b != 0) {
            AbstractC0653qi.m3252a("Missed recording an endGroup()");
        }
        if (!this.f4888i.isEmpty()) {
            AbstractC0653qi.m3252a("Start/end imbalance");
        }
        m3110i();
        this.f4865G.m4367c();
        this.f4902w = this.f4903x.m770b() != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public final void m3124u(boolean z, cq0 cq0Var) {
        this.f4888i.add(this.f4889j);
        this.f4889j = cq0Var;
        int i = this.f4891l;
        e30 e30Var = this.f4893n;
        e30Var.m771c(i);
        e30Var.m771c(this.f4892m);
        e30Var.m771c(this.f4890k);
        if (z) {
            this.f4890k = 0;
        }
        this.f4891l = 0;
        this.f4892m = 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public final void m3125v() {
        w11 w11Var = new w11();
        if (this.f4861C) {
            w11Var.m4828b();
        }
        if (this.f4881b.mo2711d()) {
            w11Var.f6903n = new ug0();
        }
        this.f4866H = w11Var;
        z11 z11VarM4830d = w11Var.m4830d();
        z11VarM4830d.m5392e(true);
        this.f4867I = z11VarM4830d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public final InterfaceC0804ui m3126w() {
        C0853vi c0853vi = this.f4879U;
        if (c0853vi != null) {
            return c0853vi;
        }
        C0853vi c0853vi2 = new C0853vi(this.f4887h);
        this.f4879U = c0853vi2;
        return c0853vi2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    public final ht0 m3127x() {
        if (this.f4859A != 0) {
            return null;
        }
        ArrayList arrayList = this.f4863E;
        if (arrayList.isEmpty()) {
            return null;
        }
        return (ht0) arrayList.get(arrayList.size() - 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    public final boolean m3128y() {
        if (!m3069A() || this.f4902w) {
            return true;
        }
        ht0 ht0VarM3127x = m3127x();
        return (ht0VarM3127x == null || (ht0VarM3127x.f2360b & 4) == 0) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z */
    public final C0890wi m3129z() {
        if (this.f4881b.mo2718k()) {
            return this.f4875Q;
        }
        return null;
    }
}
