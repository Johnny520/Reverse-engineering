package defpackage;

import java.util.BitSet;
import nuke.module.wechat.ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class nm0 extends sp0 {
    public final /* synthetic */ int m;
    public static final nm0 n = new nm0(0);
    public static final nm0 o = new nm0(1);
    public static final nm0 p = new nm0(2);
    public static final nm0 q = new nm0(3);
    public static final nm0 r = new nm0(4);
    public static final nm0 s = new nm0(5);
    public static final nm0 t = new nm0(6);
    public static final nm0 u = new nm0(7);
    public static final nm0 v = new nm0(8);
    public static final nm0 w = new nm0(9);
    public static final nm0 x = new nm0(10);
    public static final nm0 y = new nm0(11);
    public static final nm0 z = new nm0(12);
    public static final nm0 A = new nm0(13);
    public static final nm0 B = new nm0(14);
    public static final nm0 C = new nm0(15);
    public static final nm0 D = new nm0(16);
    public static final nm0 E = new nm0(17);
    public static final nm0 F = new nm0(18);
    public static final nm0 G = new nm0(19);
    public static final nm0 H = new nm0(20);
    public static final nm0 I = new nm0(21);
    public static final nm0 J = new nm0(22);
    public static final nm0 K = new nm0(23);
    public static final nm0 L = new nm0(24);
    public static final nm0 M = new nm0(25);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [nm0.<clinit>():void] */
    public /* synthetic */ nm0(int i) {
        this.m = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static s72 r0(s72 s72Var) {
        int iS0 = s0(s72Var);
        int length = s72Var.i.length;
        if (iS0 == length) {
            return s72Var;
        }
        s72 s72Var2 = new s72(iS0);
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            r72 r72Var = (r72) s72Var.e(i2);
            s72Var2.f(i, r72Var);
            if (r72Var.d() == 2) {
                s72Var2.f(i + 1, r72.e(r72Var.h + 1, o43.v));
                i += 2;
            } else {
                i++;
            }
        }
        s72Var2.h = false;
        return s72Var2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int s0(s72 s72Var) {
        int length = s72Var.i.length;
        if (length > 5) {
            return -1;
        }
        int iD = 0;
        for (int i = 0; i < length; i++) {
            iD += ((r72) s72Var.e(i)).d();
            if (!sp0.n0((r4.d() + r4.h) - 1)) {
                return -1;
            }
        }
        if (iD <= 5) {
            return iD;
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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
    @Override // defpackage.sp0
    public final String H(ij0 ij0Var) {
        int iD;
        switch (this.m) {
            case 0:
                return sp0.s(ij0Var);
            case 1:
                return "";
            case 2:
                return ((r72) ij0Var.d.e(0)).g() + ", " + sp0.L((k30) ((f30) ij0Var).e);
            case 3:
                return ((r72) ij0Var.d.e(0)).g();
            case 4:
                s72 s72Var = ij0Var.d;
                int length = s72Var.i.length;
                return ((r72) s72Var.e(length - 2)).g() + ", " + ((r72) s72Var.e(length - 1)).g();
            case 5:
                return sp0.s(ij0Var);
            case AIChatConfig.DefaultContextRounds /* 6 */:
                return ((r72) ij0Var.d.e(0)).g() + ", " + ij0Var.d();
            case 7:
                return ((r72) ij0Var.d.e(0)).g() + ", " + sp0.L((k30) ((f30) ij0Var).e);
            case 8:
                return ((r72) ij0Var.d.e(0)).g() + ", " + sp0.L((k30) ((f30) ij0Var).e);
            case 9:
                return ((r72) ij0Var.d.e(0)).g() + ", " + sp0.s(ij0Var);
            case 10:
                s72 s72Var2 = ij0Var.d;
                return ((r72) s72Var2.e(0)).g() + ", " + ((r72) s72Var2.e(1)).g() + ", " + sp0.L((k30) ((f30) ij0Var).e);
            case 11:
                s72 s72Var3 = ij0Var.d;
                return ((r72) s72Var3.e(0)).g() + ", " + ((r72) s72Var3.e(1)).g() + ", " + ij0Var.d();
            case 12:
                s72 s72Var4 = ij0Var.d;
                return ((r72) s72Var4.e(0)).g() + ", " + ((r72) s72Var4.e(1)).g() + ", " + sp0.L((k30) ((f30) ij0Var).e);
            case 13:
                s72 s72Var5 = ij0Var.d;
                return ((r72) s72Var5.e(0)).g() + ", " + ((r72) s72Var5.e(1)).g() + ", " + sp0.s(ij0Var);
            case 14:
                s72 s72Var6 = ij0Var.d;
                return ((r72) s72Var6.e(0)).g() + ", " + ((r72) s72Var6.e(1)).g();
            case 15:
                s72 s72Var7 = ij0Var.d;
                return ((r72) s72Var7.e(0)).g() + ", " + ((r72) s72Var7.e(1)).g() + ", " + ((r72) s72Var7.e(2)).g();
            case 16:
                return ((r72) ij0Var.d.e(0)).g() + ", " + ij0Var.d();
            case 17:
                return ((r72) ij0Var.d.e(0)).g() + ", " + sp0.L((k30) ((f30) ij0Var).e);
            case 18:
                return ((r72) ij0Var.d.e(0)).g() + ", " + sp0.s(ij0Var);
            case 19:
                s72 s72Var8 = ij0Var.d;
                return ((r72) s72Var8.e(0)).g() + ", " + ((r72) s72Var8.e(1)).g();
            case AIChatConfig.MaxContextRounds /* 20 */:
                return sp0.U(r0(ij0Var.d)) + ", " + ij0Var.d();
            case 21:
                return sp0.V(ij0Var.d) + ", " + ij0Var.d();
            case 22:
                s72 s72Var9 = ij0Var.d;
                int length2 = s72Var9.i.length;
                if (length2 > 5) {
                    iD = -1;
                } else {
                    int i = 0;
                    iD = 0;
                    while (true) {
                        if (i < length2) {
                            r72 r72Var = (r72) s72Var9.e(i);
                            iD += r72Var.d();
                            if (sp0.n0((r72Var.d() + r72Var.h) - 1)) {
                                i++;
                            }
                        } else if (iD > 5) {
                        }
                    }
                    iD = -1;
                }
                int length3 = s72Var9.i.length;
                if (iD != length3) {
                    s72 s72Var10 = new s72(iD);
                    int i2 = 0;
                    for (int i3 = 0; i3 < length3; i3++) {
                        r72 r72Var2 = (r72) s72Var9.e(i3);
                        s72Var10.f(i2, r72Var2);
                        if (r72Var2.d() == 2) {
                            s72Var10.f(i2 + 1, r72.e(r72Var2.h + 1, o43.v));
                            i2 += 2;
                        } else {
                            i2++;
                        }
                    }
                    s72Var10.h = false;
                    s72Var9 = s72Var10;
                }
                return sp0.U(s72Var9) + ", " + ij0Var.d();
            case 23:
                return sp0.V(ij0Var.d) + ", " + ij0Var.d();
            case 24:
                return ((r72) ij0Var.d.e(0)).g() + ", " + sp0.L((k30) ((f30) ij0Var).e);
            default:
                throw new RuntimeException("unsupported");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.sp0
    public final String I(ij0 ij0Var) {
        switch (this.m) {
            case 0:
                return sp0.q(ij0Var);
            case 1:
                return "";
            case 2:
                return sp0.K((k30) ((f30) ij0Var).e, 4);
            case 3:
            case 4:
                return "";
            case 5:
                return sp0.q(ij0Var);
            case AIChatConfig.DefaultContextRounds /* 6 */:
                return ij0Var.c();
            case 7:
                return sp0.K((k30) ((f30) ij0Var).e, ((r72) ij0Var.d.e(0)).d() != 1 ? 64 : 32);
            case 8:
                return sp0.K((k30) ((f30) ij0Var).e, 16);
            case 9:
                return sp0.q(ij0Var);
            case 10:
                return sp0.K((k30) ((f30) ij0Var).e, 8);
            case 11:
                return ij0Var.c();
            case 12:
                return sp0.K((k30) ((f30) ij0Var).e, 16);
            case 13:
                return sp0.q(ij0Var);
            case 14:
            case 15:
                return "";
            case 16:
                return ij0Var.c();
            case 17:
                return sp0.K((k30) ((f30) ij0Var).e, 32);
            case 18:
                return sp0.q(ij0Var);
            case 19:
                return "";
            case AIChatConfig.MaxContextRounds /* 20 */:
                return ij0Var.c();
            case 21:
                return ij0Var.c();
            case 22:
                return ij0Var.c();
            case 23:
                return ij0Var.c();
            case 24:
                return sp0.K((k30) ((f30) ij0Var).e, 64);
            default:
                throw new RuntimeException("unsupported");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0080  */
    @Override // defpackage.sp0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean J(a40 a40Var) {
        int iH;
        r72 r72Var;
        r72 r72Var2;
        r72 r72Var3;
        r72 r72Var4;
        switch (this.m) {
            case 0:
                if (!(a40Var instanceof dy2) || a40Var.d.i.length != 0) {
                    return false;
                }
                dy2 dy2Var = (dy2) a40Var;
                if (dy2Var.n()) {
                    return r(dy2Var);
                }
                return true;
            case 1:
                return (a40Var instanceof wq2) && a40Var.d.i.length == 0;
            case 2:
                s72 s72Var = a40Var.d;
                if ((a40Var instanceof f30) && s72Var.i.length == 1 && sp0.n0(((r72) s72Var.e(0)).h)) {
                    dz dzVar = ((f30) a40Var).e;
                    if (dzVar instanceof k30) {
                        k30 k30Var = (k30) dzVar;
                        if (k30Var.g() && (iH = k30Var.h()) >= -8 && iH <= 7) {
                            return true;
                        }
                    }
                }
                return false;
            case 3:
                s72 s72Var2 = a40Var.d;
                return (a40Var instanceof wq2) && s72Var2.i.length == 1 && sp0.m0(((r72) s72Var2.e(0)).h);
            case 4:
                if (a40Var instanceof wq2) {
                    s72 s72Var3 = a40Var.d;
                    int length = s72Var3.i.length;
                    if (length == 2) {
                        r72Var = (r72) s72Var3.e(0);
                        r72Var2 = (r72) s72Var3.e(1);
                    } else if (length == 3) {
                        r72Var = (r72) s72Var3.e(1);
                        r72Var2 = (r72) s72Var3.e(2);
                        if (r72Var.h == ((r72) s72Var3.e(0)).h) {
                        }
                    }
                    if (sp0.n0(r72Var.h) && sp0.n0(r72Var2.h)) {
                        return true;
                    }
                }
                return false;
            case 5:
                if (!(a40Var instanceof dy2) || a40Var.d.i.length != 0) {
                    return false;
                }
                dy2 dy2Var2 = (dy2) a40Var;
                if (dy2Var2.n()) {
                    return r(dy2Var2);
                }
                return true;
            case AIChatConfig.DefaultContextRounds /* 6 */:
                if (a40Var instanceof f30) {
                    s72 s72Var4 = a40Var.d;
                    int length2 = s72Var4.i.length;
                    if (length2 == 1) {
                        r72Var3 = (r72) s72Var4.e(0);
                    } else if (length2 == 2) {
                        r72Var3 = (r72) s72Var4.e(0);
                        if (r72Var3.h == ((r72) s72Var4.e(1)).h) {
                        }
                    }
                    if (sp0.m0(r72Var3.h)) {
                        f30 f30Var = (f30) a40Var;
                        int iM = f30Var.m();
                        dz dzVar2 = f30Var.e;
                        if (sp0.o0(iM) && ((dzVar2 instanceof r30) || (dzVar2 instanceof c30) || (dzVar2 instanceof q30))) {
                            return true;
                        }
                    }
                }
                return false;
            case 7:
                s72 s72Var5 = a40Var.d;
                if ((a40Var instanceof f30) && s72Var5.i.length == 1 && sp0.m0(((r72) s72Var5.e(0)).h)) {
                    dz dzVar3 = ((f30) a40Var).e;
                    if (dzVar3 instanceof k30) {
                        k30 k30Var2 = (k30) dzVar3;
                        if (((r72) s72Var5.e(0)).d() == 1) {
                            if ((k30Var2.h() & 65535) == 0) {
                                return true;
                            }
                        } else if ((k30Var2.i() & 281474976710655L) == 0) {
                            return true;
                        }
                    }
                }
                return false;
            case 8:
                s72 s72Var6 = a40Var.d;
                if ((a40Var instanceof f30) && s72Var6.i.length == 1 && sp0.m0(((r72) s72Var6.e(0)).h)) {
                    dz dzVar4 = ((f30) a40Var).e;
                    if (dzVar4 instanceof k30) {
                        k30 k30Var3 = (k30) dzVar4;
                        if (k30Var3.g()) {
                            int iH2 = k30Var3.h();
                            if (((short) iH2) == iH2) {
                                return true;
                            }
                        }
                    }
                }
                return false;
            case 9:
                s72 s72Var7 = a40Var.d;
                if (!(a40Var instanceof dy2) || s72Var7.i.length != 1 || !sp0.m0(((r72) s72Var7.e(0)).h)) {
                    return false;
                }
                dy2 dy2Var3 = (dy2) a40Var;
                if (dy2Var3.n()) {
                    return r(dy2Var3);
                }
                return true;
            case 10:
                s72 s72Var8 = a40Var.d;
                if ((a40Var instanceof f30) && s72Var8.i.length == 2 && sp0.m0(((r72) s72Var8.e(0)).h) && sp0.m0(((r72) s72Var8.e(1)).h)) {
                    dz dzVar5 = ((f30) a40Var).e;
                    if (dzVar5 instanceof k30) {
                        k30 k30Var4 = (k30) dzVar5;
                        if (k30Var4.g()) {
                            int iH3 = k30Var4.h();
                            if (((byte) iH3) == iH3) {
                                return true;
                            }
                        }
                    }
                }
                return false;
            case 11:
                s72 s72Var9 = a40Var.d;
                if ((a40Var instanceof f30) && s72Var9.i.length == 2 && sp0.n0(((r72) s72Var9.e(0)).h) && sp0.n0(((r72) s72Var9.e(1)).h)) {
                    f30 f30Var2 = (f30) a40Var;
                    if (sp0.o0(f30Var2.m())) {
                        dz dzVar6 = f30Var2.e;
                        if ((dzVar6 instanceof r30) || (dzVar6 instanceof c30)) {
                            return true;
                        }
                    }
                }
                return false;
            case 12:
                s72 s72Var10 = a40Var.d;
                if ((a40Var instanceof f30) && s72Var10.i.length == 2 && sp0.n0(((r72) s72Var10.e(0)).h) && sp0.n0(((r72) s72Var10.e(1)).h)) {
                    dz dzVar7 = ((f30) a40Var).e;
                    if (dzVar7 instanceof k30) {
                        k30 k30Var5 = (k30) dzVar7;
                        if (k30Var5.g()) {
                            int iH4 = k30Var5.h();
                            if (((short) iH4) == iH4) {
                                return true;
                            }
                        }
                    }
                }
                return false;
            case 13:
                s72 s72Var11 = a40Var.d;
                if (!(a40Var instanceof dy2) || s72Var11.i.length != 2 || !sp0.n0(((r72) s72Var11.e(0)).h) || !sp0.n0(((r72) s72Var11.e(1)).h)) {
                    return false;
                }
                dy2 dy2Var4 = (dy2) a40Var;
                if (dy2Var4.n()) {
                    return r(dy2Var4);
                }
                return true;
            case 14:
                s72 s72Var12 = a40Var.d;
                return (a40Var instanceof wq2) && s72Var12.i.length == 2 && sp0.m0(((r72) s72Var12.e(0)).h) && sp0.o0(((r72) s72Var12.e(1)).h);
            case 15:
                s72 s72Var13 = a40Var.d;
                return (a40Var instanceof wq2) && s72Var13.i.length == 3 && sp0.m0(((r72) s72Var13.e(0)).h) && sp0.m0(((r72) s72Var13.e(1)).h) && sp0.m0(((r72) s72Var13.e(2)).h);
            case 16:
                if (a40Var instanceof f30) {
                    s72 s72Var14 = a40Var.d;
                    int length3 = s72Var14.i.length;
                    if (length3 == 1) {
                        r72Var4 = (r72) s72Var14.e(0);
                    } else if (length3 == 2) {
                        r72Var4 = (r72) s72Var14.e(0);
                        if (r72Var4.h == ((r72) s72Var14.e(1)).h) {
                        }
                    }
                    if (sp0.m0(r72Var4.h)) {
                        dz dzVar8 = ((f30) a40Var).e;
                        if ((dzVar8 instanceof r30) || (dzVar8 instanceof c30) || (dzVar8 instanceof q30)) {
                            return true;
                        }
                    }
                }
                return false;
            case 17:
                s72 s72Var15 = a40Var.d;
                if (!(a40Var instanceof f30) || s72Var15.i.length != 1 || !sp0.m0(((r72) s72Var15.e(0)).h)) {
                    return false;
                }
                dz dzVar9 = ((f30) a40Var).e;
                if (dzVar9 instanceof k30) {
                    return ((k30) dzVar9).g();
                }
                return false;
            case 18:
                s72 s72Var16 = a40Var.d;
                return (a40Var instanceof dy2) && s72Var16.i.length == 1 && sp0.m0(((r72) s72Var16.e(0)).h);
            case 19:
                s72 s72Var17 = a40Var.d;
                return (a40Var instanceof wq2) && s72Var17.i.length == 2 && sp0.o0(((r72) s72Var17.e(0)).h) && sp0.o0(((r72) s72Var17.e(1)).h);
            case AIChatConfig.MaxContextRounds /* 20 */:
                if (a40Var instanceof f30) {
                    f30 f30Var3 = (f30) a40Var;
                    if (sp0.o0(f30Var3.m())) {
                        dz dzVar10 = f30Var3.e;
                        if (((dzVar10 instanceof n30) || (dzVar10 instanceof r30)) && s0(f30Var3.d) >= 0) {
                            return true;
                        }
                    }
                }
                return false;
            case 21:
                if (a40Var instanceof f30) {
                    f30 f30Var4 = (f30) a40Var;
                    int iM2 = f30Var4.m();
                    dz dzVar11 = f30Var4.e;
                    if (sp0.o0(iM2) && ((dzVar11 instanceof n30) || (dzVar11 instanceof r30))) {
                        s72 s72Var18 = f30Var4.d;
                        Object[] objArr = s72Var18.i;
                        if (objArr.length == 0) {
                            return true;
                        }
                        int length4 = objArr.length;
                        if (length4 >= 2) {
                            int iD = ((r72) s72Var18.e(0)).h;
                            for (int i = 0; i < length4; i++) {
                                r72 r72Var5 = (r72) s72Var18.e(i);
                                if (r72Var5.h == iD) {
                                    iD += r72Var5.d();
                                }
                            }
                            if (sp0.o0(((r72) s72Var18.e(0)).h)) {
                            }
                        } else if (sp0.o0(((r72) s72Var18.e(0)).h)) {
                            int length5 = s72Var18.i.length;
                            int iE = 0;
                            for (int i2 = 0; i2 < length5; i2++) {
                                iE += s72Var18.getType(i2).e();
                            }
                            if (sp0.m0(iE)) {
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
                s72 s72Var19 = a40Var.d;
                if ((a40Var instanceof f30) && s72Var19.i.length == 1 && sp0.m0(((r72) s72Var19.e(0)).h)) {
                    return ((f30) a40Var).e instanceof j30;
                }
                return false;
            default:
                return true;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.sp0
    public final void q0(yn ynVar, ij0 ij0Var) {
        switch (this.m) {
            case 0:
                ynVar.k(sp0.Q(ij0Var, ((dy2) ij0Var).m() & 255));
                return;
            case 1:
                ynVar.k(sp0.Q(ij0Var, 0));
                return;
            case 2:
                ynVar.k(sp0.Q(ij0Var, sp0.M(((r72) ij0Var.d.e(0)).h, ((k30) ((f30) ij0Var).e).h() & 15)));
                return;
            case 3:
                ynVar.k(sp0.Q(ij0Var, ((r72) ij0Var.d.e(0)).h));
                return;
            case 4:
                s72 s72Var = ij0Var.d;
                int length = s72Var.i.length;
                ynVar.k(sp0.Q(ij0Var, sp0.M(((r72) s72Var.e(length - 2)).h, ((r72) s72Var.e(length - 1)).h)));
                return;
            case 5:
                int iM = ((dy2) ij0Var).m();
                ynVar.k(sp0.Q(ij0Var, 0));
                ynVar.k((short) iM);
                return;
            case AIChatConfig.DefaultContextRounds /* 6 */:
                s72 s72Var2 = ij0Var.d;
                int iM2 = ((f30) ij0Var).m();
                ynVar.k(sp0.Q(ij0Var, ((r72) s72Var2.e(0)).h));
                ynVar.k((short) iM2);
                return;
            case 7:
                s72 s72Var3 = ij0Var.d;
                k30 k30Var = (k30) ((f30) ij0Var).e;
                short sH = (short) (((r72) s72Var3.e(0)).d() == 1 ? k30Var.h() >>> 16 : (int) (k30Var.i() >>> 48));
                ynVar.k(sp0.Q(ij0Var, ((r72) s72Var3.e(0)).h));
                ynVar.k(sH);
                return;
            case 8:
                s72 s72Var4 = ij0Var.d;
                int iH = ((k30) ((f30) ij0Var).e).h();
                ynVar.k(sp0.Q(ij0Var, ((r72) s72Var4.e(0)).h));
                ynVar.k((short) iH);
                return;
            case 9:
                s72 s72Var5 = ij0Var.d;
                int iM3 = ((dy2) ij0Var).m();
                ynVar.k(sp0.Q(ij0Var, ((r72) s72Var5.e(0)).h));
                ynVar.k((short) iM3);
                return;
            case 10:
                s72 s72Var6 = ij0Var.d;
                int iH2 = ((k30) ((f30) ij0Var).e).h();
                short sQ = sp0.Q(ij0Var, ((r72) s72Var6.e(0)).h);
                short sW = sp0.w(((r72) s72Var6.e(1)).h, iH2 & 255);
                ynVar.k(sQ);
                ynVar.k(sW);
                return;
            case 11:
                s72 s72Var7 = ij0Var.d;
                int iM4 = ((f30) ij0Var).m();
                ynVar.k(sp0.Q(ij0Var, sp0.M(((r72) s72Var7.e(0)).h, ((r72) s72Var7.e(1)).h)));
                ynVar.k((short) iM4);
                return;
            case 12:
                s72 s72Var8 = ij0Var.d;
                int iH3 = ((k30) ((f30) ij0Var).e).h();
                ynVar.k(sp0.Q(ij0Var, sp0.M(((r72) s72Var8.e(0)).h, ((r72) s72Var8.e(1)).h)));
                ynVar.k((short) iH3);
                return;
            case 13:
                s72 s72Var9 = ij0Var.d;
                int iM5 = ((dy2) ij0Var).m();
                ynVar.k(sp0.Q(ij0Var, sp0.M(((r72) s72Var9.e(0)).h, ((r72) s72Var9.e(1)).h)));
                ynVar.k((short) iM5);
                return;
            case 14:
                s72 s72Var10 = ij0Var.d;
                short sQ2 = sp0.Q(ij0Var, ((r72) s72Var10.e(0)).h);
                short s2 = (short) ((r72) s72Var10.e(1)).h;
                ynVar.k(sQ2);
                ynVar.k(s2);
                return;
            case 15:
                s72 s72Var11 = ij0Var.d;
                short sQ3 = sp0.Q(ij0Var, ((r72) s72Var11.e(0)).h);
                short sW2 = sp0.w(((r72) s72Var11.e(1)).h, ((r72) s72Var11.e(2)).h);
                ynVar.k(sQ3);
                ynVar.k(sW2);
                return;
            case 16:
                s72 s72Var12 = ij0Var.d;
                int iM6 = ((f30) ij0Var).m();
                ynVar.k(sp0.Q(ij0Var, ((r72) s72Var12.e(0)).h));
                ynVar.k((short) iM6);
                ynVar.k((short) (iM6 >> 16));
                return;
            case 17:
                s72 s72Var13 = ij0Var.d;
                int iH4 = ((k30) ((f30) ij0Var).e).h();
                ynVar.k(sp0.Q(ij0Var, ((r72) s72Var13.e(0)).h));
                ynVar.k((short) iH4);
                ynVar.k((short) (iH4 >> 16));
                return;
            case 18:
                s72 s72Var14 = ij0Var.d;
                int iM7 = ((dy2) ij0Var).m();
                ynVar.k(sp0.Q(ij0Var, ((r72) s72Var14.e(0)).h));
                ynVar.k((short) iM7);
                ynVar.k((short) (iM7 >> 16));
                return;
            case 19:
                s72 s72Var15 = ij0Var.d;
                short sQ4 = sp0.Q(ij0Var, 0);
                short s3 = (short) ((r72) s72Var15.e(0)).h;
                short s4 = (short) ((r72) s72Var15.e(1)).h;
                ynVar.k(sQ4);
                ynVar.k(s3);
                ynVar.k(s4);
                return;
            case AIChatConfig.MaxContextRounds /* 20 */:
                int iM8 = ((f30) ij0Var).m();
                s72 s72VarR0 = r0(ij0Var.d);
                int length2 = s72VarR0.i.length;
                int i = length2 > 0 ? ((r72) s72VarR0.e(0)).h : 0;
                int i2 = length2 > 1 ? ((r72) s72VarR0.e(1)).h : 0;
                int i3 = length2 > 2 ? ((r72) s72VarR0.e(2)).h : 0;
                int i4 = length2 > 3 ? ((r72) s72VarR0.e(3)).h : 0;
                short sQ5 = sp0.Q(ij0Var, sp0.M(length2 > 4 ? ((r72) s72VarR0.e(4)).h : 0, length2));
                short s5 = (short) iM8;
                if ((i & 15) != i) {
                    s.j("n0 out of range 0..15");
                    return;
                }
                if ((i2 & 15) != i2) {
                    s.j("n1 out of range 0..15");
                    return;
                }
                if ((i3 & 15) != i3) {
                    s.j("n2 out of range 0..15");
                    return;
                } else {
                    if ((i4 & 15) != i4) {
                        s.j("n3 out of range 0..15");
                        return;
                    }
                    ynVar.k(sQ5);
                    ynVar.k(s5);
                    ynVar.k((short) ((i2 << 4) | i | (i3 << 8) | (i4 << 12)));
                    return;
                }
            case 21:
                s72 s72Var16 = ij0Var.d;
                int iM9 = ((f30) ij0Var).m();
                int i5 = s72Var16.i.length == 0 ? 0 : ((r72) s72Var16.e(0)).h;
                int length3 = s72Var16.i.length;
                int iE = 0;
                while (i < length3) {
                    iE += s72Var16.getType(i).e();
                    i++;
                }
                ynVar.k(sp0.Q(ij0Var, iE));
                ynVar.k((short) iM9);
                ynVar.k((short) i5);
                return;
            case 22:
                throw new ClassCastException();
            case 23:
                throw new ClassCastException();
            case 24:
                s72 s72Var17 = ij0Var.d;
                long j = ((j30) ((f30) ij0Var).e).h;
                ynVar.k(sp0.Q(ij0Var, ((r72) s72Var17.e(0)).h));
                ynVar.k((short) j);
                ynVar.k((short) (j >> 16));
                ynVar.k((short) (j >> 32));
                ynVar.k((short) (j >> 48));
                return;
            default:
                throw new RuntimeException("unsupported");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.sp0
    public boolean r(dy2 dy2Var) {
        switch (this.m) {
            case 0:
                int iM = dy2Var.m();
                return iM != 0 && ((byte) iM) == iM;
            case 5:
                int iM2 = dy2Var.m();
                return iM2 != 0 && ((short) iM2) == iM2;
            case 9:
                int iM3 = dy2Var.m();
                return iM3 != 0 && ((short) iM3) == iM3;
            case 13:
                int iM4 = dy2Var.m();
                return iM4 != 0 && ((short) iM4) == iM4;
            case 18:
                return true;
            default:
                return super.r(dy2Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.sp0
    public final int v() {
        switch (this.m) {
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.sp0
    public BitSet x(a40 a40Var) {
        int i = 0;
        switch (this.m) {
            case 2:
                s72 s72Var = a40Var.d;
                BitSet bitSet = new BitSet(1);
                bitSet.set(0, sp0.n0(((r72) s72Var.e(0)).h));
                return bitSet;
            case 3:
                s72 s72Var2 = a40Var.d;
                BitSet bitSet2 = new BitSet(1);
                bitSet2.set(0, sp0.m0(((r72) s72Var2.e(0)).h));
                return bitSet2;
            case 4:
                s72 s72Var3 = a40Var.d;
                BitSet bitSet3 = new BitSet(2);
                int i2 = ((r72) s72Var3.e(0)).h;
                int i3 = ((r72) s72Var3.e(1)).h;
                int length = s72Var3.i.length;
                if (length == 2) {
                    bitSet3.set(0, sp0.n0(i2));
                    bitSet3.set(1, sp0.n0(i3));
                } else {
                    if (length != 3) {
                        throw new AssertionError();
                    }
                    if (i2 != i3) {
                        bitSet3.set(0, false);
                        bitSet3.set(1, false);
                    } else {
                        boolean zN0 = sp0.n0(i3);
                        bitSet3.set(0, zN0);
                        bitSet3.set(1, zN0);
                    }
                    bitSet3.set(2, sp0.n0(((r72) s72Var3.e(2)).h));
                }
                return bitSet3;
            case 5:
            case 21:
            case 23:
            default:
                return super.x(a40Var);
            case AIChatConfig.DefaultContextRounds /* 6 */:
                s72 s72Var4 = a40Var.d;
                int length2 = s72Var4.i.length;
                BitSet bitSet4 = new BitSet(length2);
                boolean zM0 = sp0.m0(((r72) s72Var4.e(0)).h);
                if (length2 == 1) {
                    bitSet4.set(0, zM0);
                } else if (((r72) s72Var4.e(0)).h == ((r72) s72Var4.e(1)).h) {
                    bitSet4.set(0, zM0);
                    bitSet4.set(1, zM0);
                }
                return bitSet4;
            case 7:
                s72 s72Var5 = a40Var.d;
                BitSet bitSet5 = new BitSet(1);
                bitSet5.set(0, sp0.m0(((r72) s72Var5.e(0)).h));
                return bitSet5;
            case 8:
                s72 s72Var6 = a40Var.d;
                BitSet bitSet6 = new BitSet(1);
                bitSet6.set(0, sp0.m0(((r72) s72Var6.e(0)).h));
                return bitSet6;
            case 9:
                s72 s72Var7 = a40Var.d;
                BitSet bitSet7 = new BitSet(1);
                bitSet7.set(0, sp0.m0(((r72) s72Var7.e(0)).h));
                return bitSet7;
            case 10:
                s72 s72Var8 = a40Var.d;
                BitSet bitSet8 = new BitSet(2);
                bitSet8.set(0, sp0.m0(((r72) s72Var8.e(0)).h));
                bitSet8.set(1, sp0.m0(((r72) s72Var8.e(1)).h));
                return bitSet8;
            case 11:
                s72 s72Var9 = a40Var.d;
                BitSet bitSet9 = new BitSet(2);
                bitSet9.set(0, sp0.n0(((r72) s72Var9.e(0)).h));
                bitSet9.set(1, sp0.n0(((r72) s72Var9.e(1)).h));
                return bitSet9;
            case 12:
                s72 s72Var10 = a40Var.d;
                BitSet bitSet10 = new BitSet(2);
                bitSet10.set(0, sp0.n0(((r72) s72Var10.e(0)).h));
                bitSet10.set(1, sp0.n0(((r72) s72Var10.e(1)).h));
                return bitSet10;
            case 13:
                s72 s72Var11 = a40Var.d;
                BitSet bitSet11 = new BitSet(2);
                bitSet11.set(0, sp0.n0(((r72) s72Var11.e(0)).h));
                bitSet11.set(1, sp0.n0(((r72) s72Var11.e(1)).h));
                return bitSet11;
            case 14:
                s72 s72Var12 = a40Var.d;
                BitSet bitSet12 = new BitSet(2);
                bitSet12.set(0, sp0.m0(((r72) s72Var12.e(0)).h));
                bitSet12.set(1, sp0.o0(((r72) s72Var12.e(1)).h));
                return bitSet12;
            case 15:
                s72 s72Var13 = a40Var.d;
                BitSet bitSet13 = new BitSet(3);
                bitSet13.set(0, sp0.m0(((r72) s72Var13.e(0)).h));
                bitSet13.set(1, sp0.m0(((r72) s72Var13.e(1)).h));
                bitSet13.set(2, sp0.m0(((r72) s72Var13.e(2)).h));
                return bitSet13;
            case 16:
                s72 s72Var14 = a40Var.d;
                int length3 = s72Var14.i.length;
                BitSet bitSet14 = new BitSet(length3);
                boolean zM02 = sp0.m0(((r72) s72Var14.e(0)).h);
                if (length3 == 1) {
                    bitSet14.set(0, zM02);
                } else if (((r72) s72Var14.e(0)).h == ((r72) s72Var14.e(1)).h) {
                    bitSet14.set(0, zM02);
                    bitSet14.set(1, zM02);
                }
                return bitSet14;
            case 17:
                s72 s72Var15 = a40Var.d;
                BitSet bitSet15 = new BitSet(1);
                bitSet15.set(0, sp0.m0(((r72) s72Var15.e(0)).h));
                return bitSet15;
            case 18:
                s72 s72Var16 = a40Var.d;
                BitSet bitSet16 = new BitSet(1);
                bitSet16.set(0, sp0.m0(((r72) s72Var16.e(0)).h));
                return bitSet16;
            case 19:
                s72 s72Var17 = a40Var.d;
                BitSet bitSet17 = new BitSet(2);
                bitSet17.set(0, sp0.o0(((r72) s72Var17.e(0)).h));
                bitSet17.set(1, sp0.o0(((r72) s72Var17.e(1)).h));
                return bitSet17;
            case AIChatConfig.MaxContextRounds /* 20 */:
                s72 s72Var18 = a40Var.d;
                int length4 = s72Var18.i.length;
                BitSet bitSet18 = new BitSet(length4);
                while (i < length4) {
                    r72 r72Var = (r72) s72Var18.e(i);
                    bitSet18.set(i, sp0.n0((r72Var.d() + r72Var.h) - 1));
                    i++;
                }
                return bitSet18;
            case 22:
                s72 s72Var19 = a40Var.d;
                int length5 = s72Var19.i.length;
                BitSet bitSet19 = new BitSet(length5);
                while (i < length5) {
                    r72 r72Var2 = (r72) s72Var19.e(i);
                    bitSet19.set(i, sp0.n0((r72Var2.d() + r72Var2.h) - 1));
                    i++;
                }
                return bitSet19;
            case 24:
                s72 s72Var20 = a40Var.d;
                BitSet bitSet20 = new BitSet(1);
                bitSet20.set(0, sp0.m0(((r72) s72Var20.e(0)).h));
                return bitSet20;
        }
    }
}
