package p000;

import java.util.BitSet;
import nuke.module.wechat.p002ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class nm0 extends sp0 {

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ int f7258m;

    /* JADX INFO: renamed from: n */
    public static final nm0 f7245n = new nm0(0);

    /* JADX INFO: renamed from: o */
    public static final nm0 f7246o = new nm0(1);

    /* JADX INFO: renamed from: p */
    public static final nm0 f7247p = new nm0(2);

    /* JADX INFO: renamed from: q */
    public static final nm0 f7248q = new nm0(3);

    /* JADX INFO: renamed from: r */
    public static final nm0 f7249r = new nm0(4);

    /* JADX INFO: renamed from: s */
    public static final nm0 f7250s = new nm0(5);

    /* JADX INFO: renamed from: t */
    public static final nm0 f7251t = new nm0(6);

    /* JADX INFO: renamed from: u */
    public static final nm0 f7252u = new nm0(7);

    /* JADX INFO: renamed from: v */
    public static final nm0 f7253v = new nm0(8);

    /* JADX INFO: renamed from: w */
    public static final nm0 f7254w = new nm0(9);

    /* JADX INFO: renamed from: x */
    public static final nm0 f7255x = new nm0(10);

    /* JADX INFO: renamed from: y */
    public static final nm0 f7256y = new nm0(11);

    /* JADX INFO: renamed from: z */
    public static final nm0 f7257z = new nm0(12);

    /* JADX INFO: renamed from: A */
    public static final nm0 f7232A = new nm0(13);

    /* JADX INFO: renamed from: B */
    public static final nm0 f7233B = new nm0(14);

    /* JADX INFO: renamed from: C */
    public static final nm0 f7234C = new nm0(15);

    /* JADX INFO: renamed from: D */
    public static final nm0 f7235D = new nm0(16);

    /* JADX INFO: renamed from: E */
    public static final nm0 f7236E = new nm0(17);

    /* JADX INFO: renamed from: F */
    public static final nm0 f7237F = new nm0(18);

    /* JADX INFO: renamed from: G */
    public static final nm0 f7238G = new nm0(19);

    /* JADX INFO: renamed from: H */
    public static final nm0 f7239H = new nm0(20);

    /* JADX INFO: renamed from: I */
    public static final nm0 f7240I = new nm0(21);

    /* JADX INFO: renamed from: J */
    public static final nm0 f7241J = new nm0(22);

    /* JADX INFO: renamed from: K */
    public static final nm0 f7242K = new nm0(23);

    /* JADX INFO: renamed from: L */
    public static final nm0 f7243L = new nm0(24);

    /* JADX INFO: renamed from: M */
    public static final nm0 f7244M = new nm0(25);

    public /* synthetic */ nm0(int i) {
        this.f7258m = i;
    }

    /* JADX INFO: renamed from: r0 */
    public static s72 m3312r0(s72 s72Var) {
        int iM3313s0 = m3313s0(s72Var);
        int length = s72Var.f5590i.length;
        if (iM3313s0 == length) {
            return s72Var;
        }
        s72 s72Var2 = new s72(iM3313s0);
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            r72 r72Var = (r72) s72Var.m2693e(i2);
            s72Var2.m2694f(i, r72Var);
            if (r72Var.m4400d() == 2) {
                s72Var2.m2694f(i + 1, r72.m4399e(r72Var.f9419h + 1, o43.f7516v));
                i += 2;
            } else {
                i++;
            }
        }
        s72Var2.f11990h = false;
        return s72Var2;
    }

    /* JADX INFO: renamed from: s0 */
    public static int m3313s0(s72 s72Var) {
        int length = s72Var.f5590i.length;
        if (length > 5) {
            return -1;
        }
        int iM4400d = 0;
        for (int i = 0; i < length; i++) {
            iM4400d += ((r72) s72Var.m2693e(i)).m4400d();
            if (!sp0.m4955n0((r4.m4400d() + r4.f9419h) - 1)) {
                return -1;
            }
        }
        if (iM4400d <= 5) {
            return iM4400d;
        }
        return -1;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p000.sp0
    /* JADX INFO: renamed from: H */
    public final String mo3314H(ij0 ij0Var) {
        int iM4400d;
        switch (this.f7258m) {
            case 0:
                return sp0.m4961s(ij0Var);
            case 1:
                return "";
            case 2:
                return ((r72) ij0Var.f48d.m2693e(0)).m4402g() + ", " + sp0.m4913L((k30) ((f30) ij0Var).f2751e);
            case 3:
                return ((r72) ij0Var.f48d.m2693e(0)).m4402g();
            case 4:
                s72 s72Var = ij0Var.f48d;
                int length = s72Var.f5590i.length;
                return ((r72) s72Var.m2693e(length - 2)).m4402g() + ", " + ((r72) s72Var.m2693e(length - 1)).m4402g();
            case 5:
                return sp0.m4961s(ij0Var);
            case AIChatConfig.DefaultContextRounds /* 6 */:
                return ((r72) ij0Var.f48d.m2693e(0)).m4402g() + ", " + ij0Var.mo60d();
            case 7:
                return ((r72) ij0Var.f48d.m2693e(0)).m4402g() + ", " + sp0.m4913L((k30) ((f30) ij0Var).f2751e);
            case 8:
                return ((r72) ij0Var.f48d.m2693e(0)).m4402g() + ", " + sp0.m4913L((k30) ((f30) ij0Var).f2751e);
            case 9:
                return ((r72) ij0Var.f48d.m2693e(0)).m4402g() + ", " + sp0.m4961s(ij0Var);
            case 10:
                s72 s72Var2 = ij0Var.f48d;
                return ((r72) s72Var2.m2693e(0)).m4402g() + ", " + ((r72) s72Var2.m2693e(1)).m4402g() + ", " + sp0.m4913L((k30) ((f30) ij0Var).f2751e);
            case 11:
                s72 s72Var3 = ij0Var.f48d;
                return ((r72) s72Var3.m2693e(0)).m4402g() + ", " + ((r72) s72Var3.m2693e(1)).m4402g() + ", " + ij0Var.mo60d();
            case 12:
                s72 s72Var4 = ij0Var.f48d;
                return ((r72) s72Var4.m2693e(0)).m4402g() + ", " + ((r72) s72Var4.m2693e(1)).m4402g() + ", " + sp0.m4913L((k30) ((f30) ij0Var).f2751e);
            case 13:
                s72 s72Var5 = ij0Var.f48d;
                return ((r72) s72Var5.m2693e(0)).m4402g() + ", " + ((r72) s72Var5.m2693e(1)).m4402g() + ", " + sp0.m4961s(ij0Var);
            case 14:
                s72 s72Var6 = ij0Var.f48d;
                return ((r72) s72Var6.m2693e(0)).m4402g() + ", " + ((r72) s72Var6.m2693e(1)).m4402g();
            case 15:
                s72 s72Var7 = ij0Var.f48d;
                return ((r72) s72Var7.m2693e(0)).m4402g() + ", " + ((r72) s72Var7.m2693e(1)).m4402g() + ", " + ((r72) s72Var7.m2693e(2)).m4402g();
            case 16:
                return ((r72) ij0Var.f48d.m2693e(0)).m4402g() + ", " + ij0Var.mo60d();
            case 17:
                return ((r72) ij0Var.f48d.m2693e(0)).m4402g() + ", " + sp0.m4913L((k30) ((f30) ij0Var).f2751e);
            case 18:
                return ((r72) ij0Var.f48d.m2693e(0)).m4402g() + ", " + sp0.m4961s(ij0Var);
            case 19:
                s72 s72Var8 = ij0Var.f48d;
                return ((r72) s72Var8.m2693e(0)).m4402g() + ", " + ((r72) s72Var8.m2693e(1)).m4402g();
            case AIChatConfig.MaxContextRounds /* 20 */:
                return sp0.m4922U(m3312r0(ij0Var.f48d)) + ", " + ij0Var.mo60d();
            case 21:
                return sp0.m4923V(ij0Var.f48d) + ", " + ij0Var.mo60d();
            case 22:
                s72 s72Var9 = ij0Var.f48d;
                int length2 = s72Var9.f5590i.length;
                if (length2 > 5) {
                    iM4400d = -1;
                } else {
                    int i = 0;
                    iM4400d = 0;
                    while (true) {
                        if (i < length2) {
                            r72 r72Var = (r72) s72Var9.m2693e(i);
                            iM4400d += r72Var.m4400d();
                            if (sp0.m4955n0((r72Var.m4400d() + r72Var.f9419h) - 1)) {
                                i++;
                            }
                        } else if (iM4400d > 5) {
                        }
                    }
                    iM4400d = -1;
                }
                int length3 = s72Var9.f5590i.length;
                if (iM4400d != length3) {
                    s72 s72Var10 = new s72(iM4400d);
                    int i2 = 0;
                    for (int i3 = 0; i3 < length3; i3++) {
                        r72 r72Var2 = (r72) s72Var9.m2693e(i3);
                        s72Var10.m2694f(i2, r72Var2);
                        if (r72Var2.m4400d() == 2) {
                            s72Var10.m2694f(i2 + 1, r72.m4399e(r72Var2.f9419h + 1, o43.f7516v));
                            i2 += 2;
                        } else {
                            i2++;
                        }
                    }
                    s72Var10.f11990h = false;
                    s72Var9 = s72Var10;
                }
                return sp0.m4922U(s72Var9) + ", " + ij0Var.mo60d();
            case 23:
                return sp0.m4923V(ij0Var.f48d) + ", " + ij0Var.mo60d();
            case 24:
                return ((r72) ij0Var.f48d.m2693e(0)).m4402g() + ", " + sp0.m4913L((k30) ((f30) ij0Var).f2751e);
            default:
                throw new RuntimeException("unsupported");
        }
    }

    @Override // p000.sp0
    /* JADX INFO: renamed from: I */
    public final String mo3315I(ij0 ij0Var) {
        switch (this.f7258m) {
            case 0:
                return sp0.m4960q(ij0Var);
            case 1:
                return "";
            case 2:
                return sp0.m4912K((k30) ((f30) ij0Var).f2751e, 4);
            case 3:
            case 4:
                return "";
            case 5:
                return sp0.m4960q(ij0Var);
            case AIChatConfig.DefaultContextRounds /* 6 */:
                return ij0Var.mo59c();
            case 7:
                return sp0.m4912K((k30) ((f30) ij0Var).f2751e, ((r72) ij0Var.f48d.m2693e(0)).m4400d() != 1 ? 64 : 32);
            case 8:
                return sp0.m4912K((k30) ((f30) ij0Var).f2751e, 16);
            case 9:
                return sp0.m4960q(ij0Var);
            case 10:
                return sp0.m4912K((k30) ((f30) ij0Var).f2751e, 8);
            case 11:
                return ij0Var.mo59c();
            case 12:
                return sp0.m4912K((k30) ((f30) ij0Var).f2751e, 16);
            case 13:
                return sp0.m4960q(ij0Var);
            case 14:
            case 15:
                return "";
            case 16:
                return ij0Var.mo59c();
            case 17:
                return sp0.m4912K((k30) ((f30) ij0Var).f2751e, 32);
            case 18:
                return sp0.m4960q(ij0Var);
            case 19:
                return "";
            case AIChatConfig.MaxContextRounds /* 20 */:
                return ij0Var.mo59c();
            case 21:
                return ij0Var.mo59c();
            case 22:
                return ij0Var.mo59c();
            case 23:
                return ij0Var.mo59c();
            case 24:
                return sp0.m4912K((k30) ((f30) ij0Var).f2751e, 64);
            default:
                throw new RuntimeException("unsupported");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0080  */
    @Override // p000.sp0
    /* JADX INFO: renamed from: J */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean mo3316J(a40 a40Var) {
        int iMo2047h;
        r72 r72Var;
        r72 r72Var2;
        r72 r72Var3;
        r72 r72Var4;
        switch (this.f7258m) {
            case 0:
                if (!(a40Var instanceof dy2) || a40Var.f48d.f5590i.length != 0) {
                    return false;
                }
                dy2 dy2Var = (dy2) a40Var;
                if (dy2Var.m1208n()) {
                    return mo3318r(dy2Var);
                }
                return true;
            case 1:
                return (a40Var instanceof wq2) && a40Var.f48d.f5590i.length == 0;
            case 2:
                s72 s72Var = a40Var.f48d;
                if ((a40Var instanceof f30) && s72Var.f5590i.length == 1 && sp0.m4955n0(((r72) s72Var.m2693e(0)).f9419h)) {
                    AbstractC0147dz abstractC0147dz = ((f30) a40Var).f2751e;
                    if (abstractC0147dz instanceof k30) {
                        k30 k30Var = (k30) abstractC0147dz;
                        if (k30Var.mo2046g() && (iMo2047h = k30Var.mo2047h()) >= -8 && iMo2047h <= 7) {
                            return true;
                        }
                    }
                }
                return false;
            case 3:
                s72 s72Var2 = a40Var.f48d;
                return (a40Var instanceof wq2) && s72Var2.f5590i.length == 1 && sp0.m4953m0(((r72) s72Var2.m2693e(0)).f9419h);
            case 4:
                if (a40Var instanceof wq2) {
                    s72 s72Var3 = a40Var.f48d;
                    int length = s72Var3.f5590i.length;
                    if (length == 2) {
                        r72Var = (r72) s72Var3.m2693e(0);
                        r72Var2 = (r72) s72Var3.m2693e(1);
                    } else if (length == 3) {
                        r72Var = (r72) s72Var3.m2693e(1);
                        r72Var2 = (r72) s72Var3.m2693e(2);
                        if (r72Var.f9419h == ((r72) s72Var3.m2693e(0)).f9419h) {
                        }
                    }
                    if (sp0.m4955n0(r72Var.f9419h) && sp0.m4955n0(r72Var2.f9419h)) {
                        return true;
                    }
                }
                return false;
            case 5:
                if (!(a40Var instanceof dy2) || a40Var.f48d.f5590i.length != 0) {
                    return false;
                }
                dy2 dy2Var2 = (dy2) a40Var;
                if (dy2Var2.m1208n()) {
                    return mo3318r(dy2Var2);
                }
                return true;
            case AIChatConfig.DefaultContextRounds /* 6 */:
                if (a40Var instanceof f30) {
                    s72 s72Var4 = a40Var.f48d;
                    int length2 = s72Var4.f5590i.length;
                    if (length2 == 1) {
                        r72Var3 = (r72) s72Var4.m2693e(0);
                    } else if (length2 == 2) {
                        r72Var3 = (r72) s72Var4.m2693e(0);
                        if (r72Var3.f9419h == ((r72) s72Var4.m2693e(1)).f9419h) {
                        }
                    }
                    if (sp0.m4953m0(r72Var3.f9419h)) {
                        f30 f30Var = (f30) a40Var;
                        int iM1501m = f30Var.m1501m();
                        AbstractC0147dz abstractC0147dz2 = f30Var.f2751e;
                        if (sp0.m4957o0(iM1501m) && ((abstractC0147dz2 instanceof r30) || (abstractC0147dz2 instanceof c30) || (abstractC0147dz2 instanceof q30))) {
                            return true;
                        }
                    }
                }
                return false;
            case 7:
                s72 s72Var5 = a40Var.f48d;
                if ((a40Var instanceof f30) && s72Var5.f5590i.length == 1 && sp0.m4953m0(((r72) s72Var5.m2693e(0)).f9419h)) {
                    AbstractC0147dz abstractC0147dz3 = ((f30) a40Var).f2751e;
                    if (abstractC0147dz3 instanceof k30) {
                        k30 k30Var2 = (k30) abstractC0147dz3;
                        if (((r72) s72Var5.m2693e(0)).m4400d() == 1) {
                            if ((k30Var2.mo2047h() & 65535) == 0) {
                                return true;
                            }
                        } else if ((k30Var2.mo2048i() & 281474976710655L) == 0) {
                            return true;
                        }
                    }
                }
                return false;
            case 8:
                s72 s72Var6 = a40Var.f48d;
                if ((a40Var instanceof f30) && s72Var6.f5590i.length == 1 && sp0.m4953m0(((r72) s72Var6.m2693e(0)).f9419h)) {
                    AbstractC0147dz abstractC0147dz4 = ((f30) a40Var).f2751e;
                    if (abstractC0147dz4 instanceof k30) {
                        k30 k30Var3 = (k30) abstractC0147dz4;
                        if (k30Var3.mo2046g()) {
                            int iMo2047h2 = k30Var3.mo2047h();
                            if (((short) iMo2047h2) == iMo2047h2) {
                                return true;
                            }
                        }
                    }
                }
                return false;
            case 9:
                s72 s72Var7 = a40Var.f48d;
                if (!(a40Var instanceof dy2) || s72Var7.f5590i.length != 1 || !sp0.m4953m0(((r72) s72Var7.m2693e(0)).f9419h)) {
                    return false;
                }
                dy2 dy2Var3 = (dy2) a40Var;
                if (dy2Var3.m1208n()) {
                    return mo3318r(dy2Var3);
                }
                return true;
            case 10:
                s72 s72Var8 = a40Var.f48d;
                if ((a40Var instanceof f30) && s72Var8.f5590i.length == 2 && sp0.m4953m0(((r72) s72Var8.m2693e(0)).f9419h) && sp0.m4953m0(((r72) s72Var8.m2693e(1)).f9419h)) {
                    AbstractC0147dz abstractC0147dz5 = ((f30) a40Var).f2751e;
                    if (abstractC0147dz5 instanceof k30) {
                        k30 k30Var4 = (k30) abstractC0147dz5;
                        if (k30Var4.mo2046g()) {
                            int iMo2047h3 = k30Var4.mo2047h();
                            if (((byte) iMo2047h3) == iMo2047h3) {
                                return true;
                            }
                        }
                    }
                }
                return false;
            case 11:
                s72 s72Var9 = a40Var.f48d;
                if ((a40Var instanceof f30) && s72Var9.f5590i.length == 2 && sp0.m4955n0(((r72) s72Var9.m2693e(0)).f9419h) && sp0.m4955n0(((r72) s72Var9.m2693e(1)).f9419h)) {
                    f30 f30Var2 = (f30) a40Var;
                    if (sp0.m4957o0(f30Var2.m1501m())) {
                        AbstractC0147dz abstractC0147dz6 = f30Var2.f2751e;
                        if ((abstractC0147dz6 instanceof r30) || (abstractC0147dz6 instanceof c30)) {
                            return true;
                        }
                    }
                }
                return false;
            case 12:
                s72 s72Var10 = a40Var.f48d;
                if ((a40Var instanceof f30) && s72Var10.f5590i.length == 2 && sp0.m4955n0(((r72) s72Var10.m2693e(0)).f9419h) && sp0.m4955n0(((r72) s72Var10.m2693e(1)).f9419h)) {
                    AbstractC0147dz abstractC0147dz7 = ((f30) a40Var).f2751e;
                    if (abstractC0147dz7 instanceof k30) {
                        k30 k30Var5 = (k30) abstractC0147dz7;
                        if (k30Var5.mo2046g()) {
                            int iMo2047h4 = k30Var5.mo2047h();
                            if (((short) iMo2047h4) == iMo2047h4) {
                                return true;
                            }
                        }
                    }
                }
                return false;
            case 13:
                s72 s72Var11 = a40Var.f48d;
                if (!(a40Var instanceof dy2) || s72Var11.f5590i.length != 2 || !sp0.m4955n0(((r72) s72Var11.m2693e(0)).f9419h) || !sp0.m4955n0(((r72) s72Var11.m2693e(1)).f9419h)) {
                    return false;
                }
                dy2 dy2Var4 = (dy2) a40Var;
                if (dy2Var4.m1208n()) {
                    return mo3318r(dy2Var4);
                }
                return true;
            case 14:
                s72 s72Var12 = a40Var.f48d;
                return (a40Var instanceof wq2) && s72Var12.f5590i.length == 2 && sp0.m4953m0(((r72) s72Var12.m2693e(0)).f9419h) && sp0.m4957o0(((r72) s72Var12.m2693e(1)).f9419h);
            case 15:
                s72 s72Var13 = a40Var.f48d;
                return (a40Var instanceof wq2) && s72Var13.f5590i.length == 3 && sp0.m4953m0(((r72) s72Var13.m2693e(0)).f9419h) && sp0.m4953m0(((r72) s72Var13.m2693e(1)).f9419h) && sp0.m4953m0(((r72) s72Var13.m2693e(2)).f9419h);
            case 16:
                if (a40Var instanceof f30) {
                    s72 s72Var14 = a40Var.f48d;
                    int length3 = s72Var14.f5590i.length;
                    if (length3 == 1) {
                        r72Var4 = (r72) s72Var14.m2693e(0);
                    } else if (length3 == 2) {
                        r72Var4 = (r72) s72Var14.m2693e(0);
                        if (r72Var4.f9419h == ((r72) s72Var14.m2693e(1)).f9419h) {
                        }
                    }
                    if (sp0.m4953m0(r72Var4.f9419h)) {
                        AbstractC0147dz abstractC0147dz8 = ((f30) a40Var).f2751e;
                        if ((abstractC0147dz8 instanceof r30) || (abstractC0147dz8 instanceof c30) || (abstractC0147dz8 instanceof q30)) {
                            return true;
                        }
                    }
                }
                return false;
            case 17:
                s72 s72Var15 = a40Var.f48d;
                if (!(a40Var instanceof f30) || s72Var15.f5590i.length != 1 || !sp0.m4953m0(((r72) s72Var15.m2693e(0)).f9419h)) {
                    return false;
                }
                AbstractC0147dz abstractC0147dz9 = ((f30) a40Var).f2751e;
                if (abstractC0147dz9 instanceof k30) {
                    return ((k30) abstractC0147dz9).mo2046g();
                }
                return false;
            case 18:
                s72 s72Var16 = a40Var.f48d;
                return (a40Var instanceof dy2) && s72Var16.f5590i.length == 1 && sp0.m4953m0(((r72) s72Var16.m2693e(0)).f9419h);
            case 19:
                s72 s72Var17 = a40Var.f48d;
                return (a40Var instanceof wq2) && s72Var17.f5590i.length == 2 && sp0.m4957o0(((r72) s72Var17.m2693e(0)).f9419h) && sp0.m4957o0(((r72) s72Var17.m2693e(1)).f9419h);
            case AIChatConfig.MaxContextRounds /* 20 */:
                if (a40Var instanceof f30) {
                    f30 f30Var3 = (f30) a40Var;
                    if (sp0.m4957o0(f30Var3.m1501m())) {
                        AbstractC0147dz abstractC0147dz10 = f30Var3.f2751e;
                        if (((abstractC0147dz10 instanceof n30) || (abstractC0147dz10 instanceof r30)) && m3313s0(f30Var3.f48d) >= 0) {
                            return true;
                        }
                    }
                }
                return false;
            case 21:
                if (a40Var instanceof f30) {
                    f30 f30Var4 = (f30) a40Var;
                    int iM1501m2 = f30Var4.m1501m();
                    AbstractC0147dz abstractC0147dz11 = f30Var4.f2751e;
                    if (sp0.m4957o0(iM1501m2) && ((abstractC0147dz11 instanceof n30) || (abstractC0147dz11 instanceof r30))) {
                        s72 s72Var18 = f30Var4.f48d;
                        Object[] objArr = s72Var18.f5590i;
                        if (objArr.length == 0) {
                            return true;
                        }
                        int length4 = objArr.length;
                        if (length4 >= 2) {
                            int iM4400d = ((r72) s72Var18.m2693e(0)).f9419h;
                            for (int i = 0; i < length4; i++) {
                                r72 r72Var5 = (r72) s72Var18.m2693e(i);
                                if (r72Var5.f9419h == iM4400d) {
                                    iM4400d += r72Var5.m4400d();
                                }
                            }
                            if (sp0.m4957o0(((r72) s72Var18.m2693e(0)).f9419h)) {
                            }
                        } else if (sp0.m4957o0(((r72) s72Var18.m2693e(0)).f9419h)) {
                            int length5 = s72Var18.f5590i.length;
                            int iM3507e = 0;
                            for (int i2 = 0; i2 < length5; i2++) {
                                iM3507e += s72Var18.getType(i2).m3507e();
                            }
                            if (sp0.m4953m0(iM3507e)) {
                                return true;
                            }
                        }
                    }
                }
                return false;
            case 22:
            case 23:
                return false;
            case 24:
                s72 s72Var19 = a40Var.f48d;
                if ((a40Var instanceof f30) && s72Var19.f5590i.length == 1 && sp0.m4953m0(((r72) s72Var19.m2693e(0)).f9419h)) {
                    return ((f30) a40Var).f2751e instanceof j30;
                }
                return false;
            default:
                return true;
        }
    }

    @Override // p000.sp0
    /* JADX INFO: renamed from: q0 */
    public final void mo3317q0(C0929yn c0929yn, ij0 ij0Var) {
        switch (this.f7258m) {
            case 0:
                c0929yn.m6299k(sp0.m4918Q(ij0Var, ((dy2) ij0Var).m1207m() & 255));
                return;
            case 1:
                c0929yn.m6299k(sp0.m4918Q(ij0Var, 0));
                return;
            case 2:
                c0929yn.m6299k(sp0.m4918Q(ij0Var, sp0.m4914M(((r72) ij0Var.f48d.m2693e(0)).f9419h, ((k30) ((f30) ij0Var).f2751e).mo2047h() & 15)));
                return;
            case 3:
                c0929yn.m6299k(sp0.m4918Q(ij0Var, ((r72) ij0Var.f48d.m2693e(0)).f9419h));
                return;
            case 4:
                s72 s72Var = ij0Var.f48d;
                int length = s72Var.f5590i.length;
                c0929yn.m6299k(sp0.m4918Q(ij0Var, sp0.m4914M(((r72) s72Var.m2693e(length - 2)).f9419h, ((r72) s72Var.m2693e(length - 1)).f9419h)));
                return;
            case 5:
                int iM1207m = ((dy2) ij0Var).m1207m();
                c0929yn.m6299k(sp0.m4918Q(ij0Var, 0));
                c0929yn.m6299k((short) iM1207m);
                return;
            case AIChatConfig.DefaultContextRounds /* 6 */:
                s72 s72Var2 = ij0Var.f48d;
                int iM1501m = ((f30) ij0Var).m1501m();
                c0929yn.m6299k(sp0.m4918Q(ij0Var, ((r72) s72Var2.m2693e(0)).f9419h));
                c0929yn.m6299k((short) iM1501m);
                return;
            case 7:
                s72 s72Var3 = ij0Var.f48d;
                k30 k30Var = (k30) ((f30) ij0Var).f2751e;
                short sMo2047h = (short) (((r72) s72Var3.m2693e(0)).m4400d() == 1 ? k30Var.mo2047h() >>> 16 : (int) (k30Var.mo2048i() >>> 48));
                c0929yn.m6299k(sp0.m4918Q(ij0Var, ((r72) s72Var3.m2693e(0)).f9419h));
                c0929yn.m6299k(sMo2047h);
                return;
            case 8:
                s72 s72Var4 = ij0Var.f48d;
                int iMo2047h = ((k30) ((f30) ij0Var).f2751e).mo2047h();
                c0929yn.m6299k(sp0.m4918Q(ij0Var, ((r72) s72Var4.m2693e(0)).f9419h));
                c0929yn.m6299k((short) iMo2047h);
                return;
            case 9:
                s72 s72Var5 = ij0Var.f48d;
                int iM1207m2 = ((dy2) ij0Var).m1207m();
                c0929yn.m6299k(sp0.m4918Q(ij0Var, ((r72) s72Var5.m2693e(0)).f9419h));
                c0929yn.m6299k((short) iM1207m2);
                return;
            case 10:
                s72 s72Var6 = ij0Var.f48d;
                int iMo2047h2 = ((k30) ((f30) ij0Var).f2751e).mo2047h();
                short sM4918Q = sp0.m4918Q(ij0Var, ((r72) s72Var6.m2693e(0)).f9419h);
                short sM4964w = sp0.m4964w(((r72) s72Var6.m2693e(1)).f9419h, iMo2047h2 & 255);
                c0929yn.m6299k(sM4918Q);
                c0929yn.m6299k(sM4964w);
                return;
            case 11:
                s72 s72Var7 = ij0Var.f48d;
                int iM1501m2 = ((f30) ij0Var).m1501m();
                c0929yn.m6299k(sp0.m4918Q(ij0Var, sp0.m4914M(((r72) s72Var7.m2693e(0)).f9419h, ((r72) s72Var7.m2693e(1)).f9419h)));
                c0929yn.m6299k((short) iM1501m2);
                return;
            case 12:
                s72 s72Var8 = ij0Var.f48d;
                int iMo2047h3 = ((k30) ((f30) ij0Var).f2751e).mo2047h();
                c0929yn.m6299k(sp0.m4918Q(ij0Var, sp0.m4914M(((r72) s72Var8.m2693e(0)).f9419h, ((r72) s72Var8.m2693e(1)).f9419h)));
                c0929yn.m6299k((short) iMo2047h3);
                return;
            case 13:
                s72 s72Var9 = ij0Var.f48d;
                int iM1207m3 = ((dy2) ij0Var).m1207m();
                c0929yn.m6299k(sp0.m4918Q(ij0Var, sp0.m4914M(((r72) s72Var9.m2693e(0)).f9419h, ((r72) s72Var9.m2693e(1)).f9419h)));
                c0929yn.m6299k((short) iM1207m3);
                return;
            case 14:
                s72 s72Var10 = ij0Var.f48d;
                short sM4918Q2 = sp0.m4918Q(ij0Var, ((r72) s72Var10.m2693e(0)).f9419h);
                short s = (short) ((r72) s72Var10.m2693e(1)).f9419h;
                c0929yn.m6299k(sM4918Q2);
                c0929yn.m6299k(s);
                return;
            case 15:
                s72 s72Var11 = ij0Var.f48d;
                short sM4918Q3 = sp0.m4918Q(ij0Var, ((r72) s72Var11.m2693e(0)).f9419h);
                short sM4964w2 = sp0.m4964w(((r72) s72Var11.m2693e(1)).f9419h, ((r72) s72Var11.m2693e(2)).f9419h);
                c0929yn.m6299k(sM4918Q3);
                c0929yn.m6299k(sM4964w2);
                return;
            case 16:
                s72 s72Var12 = ij0Var.f48d;
                int iM1501m3 = ((f30) ij0Var).m1501m();
                c0929yn.m6299k(sp0.m4918Q(ij0Var, ((r72) s72Var12.m2693e(0)).f9419h));
                c0929yn.m6299k((short) iM1501m3);
                c0929yn.m6299k((short) (iM1501m3 >> 16));
                return;
            case 17:
                s72 s72Var13 = ij0Var.f48d;
                int iMo2047h4 = ((k30) ((f30) ij0Var).f2751e).mo2047h();
                c0929yn.m6299k(sp0.m4918Q(ij0Var, ((r72) s72Var13.m2693e(0)).f9419h));
                c0929yn.m6299k((short) iMo2047h4);
                c0929yn.m6299k((short) (iMo2047h4 >> 16));
                return;
            case 18:
                s72 s72Var14 = ij0Var.f48d;
                int iM1207m4 = ((dy2) ij0Var).m1207m();
                c0929yn.m6299k(sp0.m4918Q(ij0Var, ((r72) s72Var14.m2693e(0)).f9419h));
                c0929yn.m6299k((short) iM1207m4);
                c0929yn.m6299k((short) (iM1207m4 >> 16));
                return;
            case 19:
                s72 s72Var15 = ij0Var.f48d;
                short sM4918Q4 = sp0.m4918Q(ij0Var, 0);
                short s2 = (short) ((r72) s72Var15.m2693e(0)).f9419h;
                short s3 = (short) ((r72) s72Var15.m2693e(1)).f9419h;
                c0929yn.m6299k(sM4918Q4);
                c0929yn.m6299k(s2);
                c0929yn.m6299k(s3);
                return;
            case AIChatConfig.MaxContextRounds /* 20 */:
                int iM1501m4 = ((f30) ij0Var).m1501m();
                s72 s72VarM3312r0 = m3312r0(ij0Var.f48d);
                int length2 = s72VarM3312r0.f5590i.length;
                int i = length2 > 0 ? ((r72) s72VarM3312r0.m2693e(0)).f9419h : 0;
                int i2 = length2 > 1 ? ((r72) s72VarM3312r0.m2693e(1)).f9419h : 0;
                int i3 = length2 > 2 ? ((r72) s72VarM3312r0.m2693e(2)).f9419h : 0;
                int i4 = length2 > 3 ? ((r72) s72VarM3312r0.m2693e(3)).f9419h : 0;
                short sM4918Q5 = sp0.m4918Q(ij0Var, sp0.m4914M(length2 > 4 ? ((r72) s72VarM3312r0.m2693e(4)).f9419h : 0, length2));
                short s4 = (short) iM1501m4;
                if ((i & 15) != i) {
                    C0676s.m4651j("n0 out of range 0..15");
                    return;
                }
                if ((i2 & 15) != i2) {
                    C0676s.m4651j("n1 out of range 0..15");
                    return;
                }
                if ((i3 & 15) != i3) {
                    C0676s.m4651j("n2 out of range 0..15");
                    return;
                } else {
                    if ((i4 & 15) != i4) {
                        C0676s.m4651j("n3 out of range 0..15");
                        return;
                    }
                    c0929yn.m6299k(sM4918Q5);
                    c0929yn.m6299k(s4);
                    c0929yn.m6299k((short) ((i2 << 4) | i | (i3 << 8) | (i4 << 12)));
                    return;
                }
            case 21:
                s72 s72Var16 = ij0Var.f48d;
                int iM1501m5 = ((f30) ij0Var).m1501m();
                int i5 = s72Var16.f5590i.length == 0 ? 0 : ((r72) s72Var16.m2693e(0)).f9419h;
                int length3 = s72Var16.f5590i.length;
                int iM3507e = 0;
                while (i < length3) {
                    iM3507e += s72Var16.getType(i).m3507e();
                    i++;
                }
                c0929yn.m6299k(sp0.m4918Q(ij0Var, iM3507e));
                c0929yn.m6299k((short) iM1501m5);
                c0929yn.m6299k((short) i5);
                return;
            case 22:
                throw new ClassCastException();
            case 23:
                throw new ClassCastException();
            case 24:
                s72 s72Var17 = ij0Var.f48d;
                long j = ((j30) ((f30) ij0Var).f2751e).f4885h;
                c0929yn.m6299k(sp0.m4918Q(ij0Var, ((r72) s72Var17.m2693e(0)).f9419h));
                c0929yn.m6299k((short) j);
                c0929yn.m6299k((short) (j >> 16));
                c0929yn.m6299k((short) (j >> 32));
                c0929yn.m6299k((short) (j >> 48));
                return;
            default:
                throw new RuntimeException("unsupported");
        }
    }

    @Override // p000.sp0
    /* JADX INFO: renamed from: r */
    public boolean mo3318r(dy2 dy2Var) {
        switch (this.f7258m) {
            case 0:
                int iM1207m = dy2Var.m1207m();
                return iM1207m != 0 && ((byte) iM1207m) == iM1207m;
            case 5:
                int iM1207m2 = dy2Var.m1207m();
                return iM1207m2 != 0 && ((short) iM1207m2) == iM1207m2;
            case 9:
                int iM1207m3 = dy2Var.m1207m();
                return iM1207m3 != 0 && ((short) iM1207m3) == iM1207m3;
            case 13:
                int iM1207m4 = dy2Var.m1207m();
                return iM1207m4 != 0 && ((short) iM1207m4) == iM1207m4;
            case 18:
                return true;
            default:
                return super.mo3318r(dy2Var);
        }
    }

    @Override // p000.sp0
    /* JADX INFO: renamed from: v */
    public final int mo3319v() {
        switch (this.f7258m) {
            case 0:
                return 1;
            case 1:
                return 1;
            case 2:
                return 1;
            case 3:
                return 1;
            case 4:
                return 1;
            case 5:
                return 2;
            case AIChatConfig.DefaultContextRounds /* 6 */:
                return 2;
            case 7:
                return 2;
            case 8:
                return 2;
            case 9:
                return 2;
            case 10:
                return 2;
            case 11:
                return 2;
            case 12:
                return 2;
            case 13:
                return 2;
            case 14:
                return 2;
            case 15:
                return 2;
            case 16:
                return 3;
            case 17:
                return 3;
            case 18:
                return 3;
            case 19:
                return 3;
            case AIChatConfig.MaxContextRounds /* 20 */:
                return 3;
            case 21:
                return 3;
            case 22:
                return 4;
            case 23:
                return 4;
            case 24:
                return 5;
            default:
                throw new RuntimeException("unsupported");
        }
    }

    @Override // p000.sp0
    /* JADX INFO: renamed from: x */
    public BitSet mo3320x(a40 a40Var) {
        int i = 0;
        switch (this.f7258m) {
            case 2:
                s72 s72Var = a40Var.f48d;
                BitSet bitSet = new BitSet(1);
                bitSet.set(0, sp0.m4955n0(((r72) s72Var.m2693e(0)).f9419h));
                return bitSet;
            case 3:
                s72 s72Var2 = a40Var.f48d;
                BitSet bitSet2 = new BitSet(1);
                bitSet2.set(0, sp0.m4953m0(((r72) s72Var2.m2693e(0)).f9419h));
                return bitSet2;
            case 4:
                s72 s72Var3 = a40Var.f48d;
                BitSet bitSet3 = new BitSet(2);
                int i2 = ((r72) s72Var3.m2693e(0)).f9419h;
                int i3 = ((r72) s72Var3.m2693e(1)).f9419h;
                int length = s72Var3.f5590i.length;
                if (length == 2) {
                    bitSet3.set(0, sp0.m4955n0(i2));
                    bitSet3.set(1, sp0.m4955n0(i3));
                } else {
                    if (length != 3) {
                        throw new AssertionError();
                    }
                    if (i2 != i3) {
                        bitSet3.set(0, false);
                        bitSet3.set(1, false);
                    } else {
                        boolean zM4955n0 = sp0.m4955n0(i3);
                        bitSet3.set(0, zM4955n0);
                        bitSet3.set(1, zM4955n0);
                    }
                    bitSet3.set(2, sp0.m4955n0(((r72) s72Var3.m2693e(2)).f9419h));
                }
                return bitSet3;
            case 5:
            case 21:
            case 23:
            default:
                return super.mo3320x(a40Var);
            case AIChatConfig.DefaultContextRounds /* 6 */:
                s72 s72Var4 = a40Var.f48d;
                int length2 = s72Var4.f5590i.length;
                BitSet bitSet4 = new BitSet(length2);
                boolean zM4953m0 = sp0.m4953m0(((r72) s72Var4.m2693e(0)).f9419h);
                if (length2 == 1) {
                    bitSet4.set(0, zM4953m0);
                } else if (((r72) s72Var4.m2693e(0)).f9419h == ((r72) s72Var4.m2693e(1)).f9419h) {
                    bitSet4.set(0, zM4953m0);
                    bitSet4.set(1, zM4953m0);
                }
                return bitSet4;
            case 7:
                s72 s72Var5 = a40Var.f48d;
                BitSet bitSet5 = new BitSet(1);
                bitSet5.set(0, sp0.m4953m0(((r72) s72Var5.m2693e(0)).f9419h));
                return bitSet5;
            case 8:
                s72 s72Var6 = a40Var.f48d;
                BitSet bitSet6 = new BitSet(1);
                bitSet6.set(0, sp0.m4953m0(((r72) s72Var6.m2693e(0)).f9419h));
                return bitSet6;
            case 9:
                s72 s72Var7 = a40Var.f48d;
                BitSet bitSet7 = new BitSet(1);
                bitSet7.set(0, sp0.m4953m0(((r72) s72Var7.m2693e(0)).f9419h));
                return bitSet7;
            case 10:
                s72 s72Var8 = a40Var.f48d;
                BitSet bitSet8 = new BitSet(2);
                bitSet8.set(0, sp0.m4953m0(((r72) s72Var8.m2693e(0)).f9419h));
                bitSet8.set(1, sp0.m4953m0(((r72) s72Var8.m2693e(1)).f9419h));
                return bitSet8;
            case 11:
                s72 s72Var9 = a40Var.f48d;
                BitSet bitSet9 = new BitSet(2);
                bitSet9.set(0, sp0.m4955n0(((r72) s72Var9.m2693e(0)).f9419h));
                bitSet9.set(1, sp0.m4955n0(((r72) s72Var9.m2693e(1)).f9419h));
                return bitSet9;
            case 12:
                s72 s72Var10 = a40Var.f48d;
                BitSet bitSet10 = new BitSet(2);
                bitSet10.set(0, sp0.m4955n0(((r72) s72Var10.m2693e(0)).f9419h));
                bitSet10.set(1, sp0.m4955n0(((r72) s72Var10.m2693e(1)).f9419h));
                return bitSet10;
            case 13:
                s72 s72Var11 = a40Var.f48d;
                BitSet bitSet11 = new BitSet(2);
                bitSet11.set(0, sp0.m4955n0(((r72) s72Var11.m2693e(0)).f9419h));
                bitSet11.set(1, sp0.m4955n0(((r72) s72Var11.m2693e(1)).f9419h));
                return bitSet11;
            case 14:
                s72 s72Var12 = a40Var.f48d;
                BitSet bitSet12 = new BitSet(2);
                bitSet12.set(0, sp0.m4953m0(((r72) s72Var12.m2693e(0)).f9419h));
                bitSet12.set(1, sp0.m4957o0(((r72) s72Var12.m2693e(1)).f9419h));
                return bitSet12;
            case 15:
                s72 s72Var13 = a40Var.f48d;
                BitSet bitSet13 = new BitSet(3);
                bitSet13.set(0, sp0.m4953m0(((r72) s72Var13.m2693e(0)).f9419h));
                bitSet13.set(1, sp0.m4953m0(((r72) s72Var13.m2693e(1)).f9419h));
                bitSet13.set(2, sp0.m4953m0(((r72) s72Var13.m2693e(2)).f9419h));
                return bitSet13;
            case 16:
                s72 s72Var14 = a40Var.f48d;
                int length3 = s72Var14.f5590i.length;
                BitSet bitSet14 = new BitSet(length3);
                boolean zM4953m02 = sp0.m4953m0(((r72) s72Var14.m2693e(0)).f9419h);
                if (length3 == 1) {
                    bitSet14.set(0, zM4953m02);
                } else if (((r72) s72Var14.m2693e(0)).f9419h == ((r72) s72Var14.m2693e(1)).f9419h) {
                    bitSet14.set(0, zM4953m02);
                    bitSet14.set(1, zM4953m02);
                }
                return bitSet14;
            case 17:
                s72 s72Var15 = a40Var.f48d;
                BitSet bitSet15 = new BitSet(1);
                bitSet15.set(0, sp0.m4953m0(((r72) s72Var15.m2693e(0)).f9419h));
                return bitSet15;
            case 18:
                s72 s72Var16 = a40Var.f48d;
                BitSet bitSet16 = new BitSet(1);
                bitSet16.set(0, sp0.m4953m0(((r72) s72Var16.m2693e(0)).f9419h));
                return bitSet16;
            case 19:
                s72 s72Var17 = a40Var.f48d;
                BitSet bitSet17 = new BitSet(2);
                bitSet17.set(0, sp0.m4957o0(((r72) s72Var17.m2693e(0)).f9419h));
                bitSet17.set(1, sp0.m4957o0(((r72) s72Var17.m2693e(1)).f9419h));
                return bitSet17;
            case AIChatConfig.MaxContextRounds /* 20 */:
                s72 s72Var18 = a40Var.f48d;
                int length4 = s72Var18.f5590i.length;
                BitSet bitSet18 = new BitSet(length4);
                while (i < length4) {
                    r72 r72Var = (r72) s72Var18.m2693e(i);
                    bitSet18.set(i, sp0.m4955n0((r72Var.m4400d() + r72Var.f9419h) - 1));
                    i++;
                }
                return bitSet18;
            case 22:
                s72 s72Var19 = a40Var.f48d;
                int length5 = s72Var19.f5590i.length;
                BitSet bitSet19 = new BitSet(length5);
                while (i < length5) {
                    r72 r72Var2 = (r72) s72Var19.m2693e(i);
                    bitSet19.set(i, sp0.m4955n0((r72Var2.m4400d() + r72Var2.f9419h) - 1));
                    i++;
                }
                return bitSet19;
            case 24:
                s72 s72Var20 = a40Var.f48d;
                BitSet bitSet20 = new BitSet(1);
                bitSet20.set(0, sp0.m4953m0(((r72) s72Var20.m2693e(0)).f9419h));
                return bitSet20;
        }
    }
}
