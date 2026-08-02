package defpackage;

import com.dokar.quickjs.binding.JsObject;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kotlin.UByteArray;
import nuke.module.wechat.ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class je2 implements ug {
    public final /* synthetic */ int a;
    public final /* synthetic */ dq1 b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ je2(dq1 dq1Var, int i) {
        this.a = i;
        this.b = dq1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object c(Object[] objArr, t00 t00Var) {
        se2 se2Var;
        dl2 dl2Var;
        if (t00Var instanceof se2) {
            se2Var = (se2) t00Var;
            int i = se2Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                se2Var.m = i - Integer.MIN_VALUE;
            } else {
                se2Var = new se2(this, (u00) t00Var);
            }
        }
        Object objV = se2Var.k;
        int i2 = se2Var.m;
        try {
            if (i2 == 0) {
                fg1.T(objV);
                dq1 dq1Var = this.b;
                sp0.a0(3, objArr);
                hg2 hg2VarY = i51.y("source", objArr[0]);
                hg2 hg2VarY2 = i51.y("target", objArr[1]);
                Object obj = objArr[2];
                if (obj == null) {
                    dl2Var = new dl2(false, true, false);
                } else {
                    JsObject jsObjectE0 = sp0.e0("options", obj);
                    Boolean boolR = s11.r(jsObjectE0, "overwrite");
                    boolean zBooleanValue = boolR != null ? boolR.booleanValue() : false;
                    Boolean boolR2 = s11.r(jsObjectE0, "atomic");
                    boolean zBooleanValue2 = boolR2 != null ? boolR2.booleanValue() : true;
                    Boolean boolR3 = s11.r(jsObjectE0, "createParents");
                    dl2Var = new dl2(zBooleanValue, zBooleanValue2, boolR3 != null ? boolR3.booleanValue() : false);
                }
                se2Var.m = 1;
                objV = dq1Var.v(hg2VarY, hg2VarY2, dl2Var, se2Var);
                k20 k20Var = k20.h;
                if (objV == k20Var) {
                    return k20Var;
                }
            } else {
                if (i2 != 1) {
                    s.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                fg1.T(objV);
            }
            return eu.v(((gg2) objV).a());
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            return eu.u(th);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:106:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0037  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.ug
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Object[] objArr, t00 t00Var) {
        ie2 ie2Var;
        ke2 ke2Var;
        le2 le2Var;
        me2 me2Var;
        ne2 ne2Var;
        oe2 oe2Var;
        dl2 dl2Var;
        pe2 pe2Var;
        dl2 dl2Var2;
        qe2 qe2Var;
        re2 re2Var;
        ui2 ui2Var;
        te2 te2Var;
        dl2 dl2Var3;
        int i = this.a;
        a83 a83Var = a83.a;
        dq1 dq1Var = this.b;
        k20 k20Var = k20.h;
        switch (i) {
            case 0:
                if (t00Var instanceof ie2) {
                    ie2Var = (ie2) t00Var;
                    int i2 = ie2Var.m;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        ie2Var.m = i2 - Integer.MIN_VALUE;
                    } else {
                        ie2Var = new ie2(this, (u00) t00Var);
                    }
                }
                Object objD = ie2Var.k;
                int i3 = ie2Var.m;
                try {
                    if (i3 == 0) {
                        fg1.T(objD);
                        sp0.a0(1, objArr);
                        hg2 hg2VarY = i51.y("ref", objArr[0]);
                        ie2Var.m = 1;
                        objD = dq1Var.D(hg2VarY, ie2Var);
                        if (objD == k20Var) {
                            return k20Var;
                        }
                    } else {
                        if (i3 != 1) {
                            s.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        fg1.T(objD);
                    }
                    return eu.v(objD);
                } catch (CancellationException e) {
                    throw e;
                } catch (Throwable th) {
                    return eu.u(th);
                }
            case 1:
                if (t00Var instanceof ke2) {
                    ke2Var = (ke2) t00Var;
                    int i4 = ke2Var.m;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        ke2Var.m = i4 - Integer.MIN_VALUE;
                    } else {
                        ke2Var = new ke2(this, (u00) t00Var);
                    }
                }
                Object objV = ke2Var.k;
                int i5 = ke2Var.m;
                try {
                    if (i5 == 0) {
                        fg1.T(objV);
                        sp0.a0(1, objArr);
                        hg2 hg2VarY2 = i51.y("ref", objArr[0]);
                        ke2Var.m = 1;
                        objV = dq1Var.V(hg2VarY2, ke2Var);
                        if (objV == k20Var) {
                            return k20Var;
                        }
                    } else {
                        if (i5 != 1) {
                            s.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        fg1.T(objV);
                    }
                    return eu.v(((gg2) objV).a());
                } catch (CancellationException e2) {
                    throw e2;
                } catch (Throwable th2) {
                    return eu.u(th2);
                }
            case 2:
                if (t00Var instanceof le2) {
                    le2Var = (le2) t00Var;
                    int i6 = le2Var.m;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        le2Var.m = i6 - Integer.MIN_VALUE;
                    } else {
                        le2Var = new le2(this, (u00) t00Var);
                    }
                }
                Object objH = le2Var.k;
                int i7 = le2Var.m;
                try {
                    if (i7 == 0) {
                        fg1.T(objH);
                        sp0.a0(1, objArr);
                        hg2 hg2VarY3 = i51.y("ref", objArr[0]);
                        le2Var.m = 1;
                        objH = dq1Var.H(hg2VarY3, le2Var);
                        if (objH == k20Var) {
                            return k20Var;
                        }
                    } else {
                        if (i7 != 1) {
                            s.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        fg1.T(objH);
                    }
                    Iterable iterable = (Iterable) objH;
                    ArrayList arrayList = new ArrayList(eu.B(iterable, 10));
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((gg2) it.next()).a());
                    }
                    return eu.v(arrayList);
                } catch (CancellationException e3) {
                    throw e3;
                } catch (Throwable th3) {
                    return eu.u(th3);
                }
            case 3:
                if (t00Var instanceof me2) {
                    me2Var = (me2) t00Var;
                    int i8 = me2Var.m;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        me2Var.m = i8 - Integer.MIN_VALUE;
                    } else {
                        me2Var = new me2(this, (u00) t00Var);
                    }
                }
                Object objN = me2Var.k;
                int i9 = me2Var.m;
                try {
                    if (i9 == 0) {
                        fg1.T(objN);
                        sp0.a0(1, objArr);
                        hg2 hg2VarY4 = i51.y("ref", objArr[0]);
                        me2Var.m = 1;
                        objN = dq1Var.N(hg2VarY4, me2Var);
                        if (objN == k20Var) {
                            return k20Var;
                        }
                    } else {
                        if (i9 != 1) {
                            s.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        fg1.T(objN);
                    }
                    byte[] bArr = (byte[]) objN;
                    bArr.getClass();
                    return eu.v(new UByteArray(Arrays.copyOf(bArr, bArr.length)));
                } catch (CancellationException e4) {
                    throw e4;
                } catch (Throwable th4) {
                    return eu.u(th4);
                }
            case 4:
                if (t00Var instanceof ne2) {
                    ne2Var = (ne2) t00Var;
                    int i10 = ne2Var.m;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        ne2Var.m = i10 - Integer.MIN_VALUE;
                    } else {
                        ne2Var = new ne2(this, (u00) t00Var);
                    }
                }
                Object objP = ne2Var.k;
                int i11 = ne2Var.m;
                try {
                    if (i11 == 0) {
                        fg1.T(objP);
                        sp0.a0(1, objArr);
                        hg2 hg2VarY5 = i51.y("ref", objArr[0]);
                        ne2Var.m = 1;
                        objP = dq1Var.P(hg2VarY5, ne2Var);
                        if (objP == k20Var) {
                            return k20Var;
                        }
                    } else {
                        if (i11 != 1) {
                            s.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        fg1.T(objP);
                    }
                    return eu.v(objP);
                } catch (CancellationException e5) {
                    throw e5;
                } catch (Throwable th5) {
                    return eu.u(th5);
                }
            case 5:
                if (t00Var instanceof oe2) {
                    oe2Var = (oe2) t00Var;
                    int i12 = oe2Var.m;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        oe2Var.m = i12 - Integer.MIN_VALUE;
                    } else {
                        oe2Var = new oe2(this, (u00) t00Var);
                    }
                }
                Object objY = oe2Var.k;
                int i13 = oe2Var.m;
                try {
                    if (i13 == 0) {
                        fg1.T(objY);
                        sp0.a0(3, objArr);
                        hg2 hg2VarY6 = i51.y("ref", objArr[0]);
                        byte[] bArrY = sp0.Y("data", objArr[1]);
                        Object obj = objArr[2];
                        if (obj == null) {
                            dl2Var = new dl2(false, true, false);
                        } else {
                            JsObject jsObjectE0 = sp0.e0("options", obj);
                            Boolean boolR = s11.r(jsObjectE0, "overwrite");
                            boolean zBooleanValue = boolR != null ? boolR.booleanValue() : false;
                            Boolean boolR2 = s11.r(jsObjectE0, "atomic");
                            boolean zBooleanValue2 = boolR2 != null ? boolR2.booleanValue() : true;
                            Boolean boolR3 = s11.r(jsObjectE0, "createParents");
                            dl2Var = new dl2(zBooleanValue, zBooleanValue2, boolR3 != null ? boolR3.booleanValue() : false);
                        }
                        oe2Var.m = 1;
                        objY = dq1Var.Y(hg2VarY6, bArrY, dl2Var, oe2Var);
                        if (objY == k20Var) {
                            return k20Var;
                        }
                    } else {
                        if (i13 != 1) {
                            s.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        fg1.T(objY);
                    }
                    return eu.v(((gg2) objY).a());
                } catch (CancellationException e6) {
                    throw e6;
                } catch (Throwable th6) {
                    return eu.u(th6);
                }
            case AIChatConfig.DefaultContextRounds /* 6 */:
                if (t00Var instanceof pe2) {
                    pe2Var = (pe2) t00Var;
                    int i14 = pe2Var.m;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        pe2Var.m = i14 - Integer.MIN_VALUE;
                    } else {
                        pe2Var = new pe2(this, (u00) t00Var);
                    }
                }
                Object objY2 = pe2Var.k;
                int i15 = pe2Var.m;
                try {
                    if (i15 == 0) {
                        fg1.T(objY2);
                        sp0.a0(3, objArr);
                        hg2 hg2VarY7 = i51.y("ref", objArr[0]);
                        String strG0 = sp0.g0("text", objArr[1]);
                        Object obj2 = objArr[2];
                        if (obj2 == null) {
                            dl2Var2 = new dl2(false, true, false);
                        } else {
                            JsObject jsObjectE02 = sp0.e0("options", obj2);
                            Boolean boolR4 = s11.r(jsObjectE02, "overwrite");
                            boolean zBooleanValue3 = boolR4 != null ? boolR4.booleanValue() : false;
                            Boolean boolR5 = s11.r(jsObjectE02, "atomic");
                            boolean zBooleanValue4 = boolR5 != null ? boolR5.booleanValue() : true;
                            Boolean boolR6 = s11.r(jsObjectE02, "createParents");
                            dl2Var2 = new dl2(zBooleanValue3, zBooleanValue4, boolR6 != null ? boolR6.booleanValue() : false);
                        }
                        pe2Var.m = 1;
                        Charset charset = StandardCharsets.UTF_8;
                        charset.getClass();
                        byte[] bytes = strG0.getBytes(charset);
                        bytes.getClass();
                        objY2 = dq1Var.Y(hg2VarY7, bytes, dl2Var2, pe2Var);
                        if (objY2 == k20Var) {
                            return k20Var;
                        }
                    } else {
                        if (i15 != 1) {
                            s.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        fg1.T(objY2);
                    }
                    return eu.v(((gg2) objY2).a());
                } catch (CancellationException e7) {
                    throw e7;
                } catch (Throwable th7) {
                    return eu.u(th7);
                }
            case 7:
                if (t00Var instanceof qe2) {
                    qe2Var = (qe2) t00Var;
                    int i16 = qe2Var.m;
                    if ((i16 & Integer.MIN_VALUE) != 0) {
                        qe2Var.m = i16 - Integer.MIN_VALUE;
                    } else {
                        qe2Var = new qe2(this, (u00) t00Var);
                    }
                }
                Object obj3 = qe2Var.k;
                int i17 = qe2Var.m;
                try {
                    if (i17 == 0) {
                        fg1.T(obj3);
                        sp0.a0(2, objArr);
                        hg2 hg2VarY8 = i51.y("ref", objArr[0]);
                        boolean zX = sp0.X("recursive", objArr[1]);
                        qe2Var.m = 1;
                        if (dq1Var.w(hg2VarY8, zX, qe2Var) == k20Var) {
                            return k20Var;
                        }
                    } else {
                        if (i17 != 1) {
                            s.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        fg1.T(obj3);
                    }
                    return eu.v(a83Var);
                } catch (CancellationException e8) {
                    throw e8;
                } catch (Throwable th8) {
                    return eu.u(th8);
                }
            case 8:
                if (t00Var instanceof re2) {
                    re2Var = (re2) t00Var;
                    int i18 = re2Var.m;
                    if ((i18 & Integer.MIN_VALUE) != 0) {
                        re2Var.m = i18 - Integer.MIN_VALUE;
                    } else {
                        re2Var = new re2(this, (u00) t00Var);
                    }
                }
                Object obj4 = re2Var.k;
                int i19 = re2Var.m;
                try {
                    if (i19 == 0) {
                        fg1.T(obj4);
                        sp0.a0(2, objArr);
                        hg2 hg2VarY9 = i51.y("ref", objArr[0]);
                        Object obj5 = objArr[1];
                        if (obj5 == null) {
                            ui2Var = new ui2(false, false);
                        } else {
                            JsObject jsObjectE03 = sp0.e0("options", obj5);
                            Boolean boolR7 = s11.r(jsObjectE03, "recursive");
                            boolean zBooleanValue5 = boolR7 != null ? boolR7.booleanValue() : false;
                            Boolean boolR8 = s11.r(jsObjectE03, "missingOk");
                            ui2Var = new ui2(zBooleanValue5, boolR8 != null ? boolR8.booleanValue() : false);
                        }
                        re2Var.m = 1;
                        if (dq1Var.R(hg2VarY9, ui2Var, re2Var) == k20Var) {
                            return k20Var;
                        }
                    } else {
                        if (i19 != 1) {
                            s.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        fg1.T(obj4);
                    }
                    return eu.v(a83Var);
                } catch (CancellationException e9) {
                    throw e9;
                } catch (Throwable th9) {
                    return eu.u(th9);
                }
            case 9:
                return c(objArr, t00Var);
            default:
                if (t00Var instanceof te2) {
                    te2Var = (te2) t00Var;
                    int i20 = te2Var.m;
                    if ((i20 & Integer.MIN_VALUE) != 0) {
                        te2Var.m = i20 - Integer.MIN_VALUE;
                    } else {
                        te2Var = new te2(this, (u00) t00Var);
                    }
                }
                Object objI = te2Var.k;
                int i21 = te2Var.m;
                try {
                    if (i21 == 0) {
                        fg1.T(objI);
                        sp0.a0(3, objArr);
                        hg2 hg2VarY10 = i51.y("source", objArr[0]);
                        hg2 hg2VarY11 = i51.y("target", objArr[1]);
                        Object obj6 = objArr[2];
                        if (obj6 == null) {
                            dl2Var3 = new dl2(false, true, false);
                        } else {
                            JsObject jsObjectE04 = sp0.e0("options", obj6);
                            Boolean boolR9 = s11.r(jsObjectE04, "overwrite");
                            boolean zBooleanValue6 = boolR9 != null ? boolR9.booleanValue() : false;
                            Boolean boolR10 = s11.r(jsObjectE04, "atomic");
                            boolean zBooleanValue7 = boolR10 != null ? boolR10.booleanValue() : true;
                            Boolean boolR11 = s11.r(jsObjectE04, "createParents");
                            dl2Var3 = new dl2(zBooleanValue6, zBooleanValue7, boolR11 != null ? boolR11.booleanValue() : false);
                        }
                        te2Var.m = 1;
                        objI = dq1Var.I(hg2VarY10, hg2VarY11, dl2Var3, te2Var);
                        if (objI == k20Var) {
                            return k20Var;
                        }
                    } else {
                        if (i21 != 1) {
                            s.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        fg1.T(objI);
                    }
                    return eu.v(((gg2) objI).a());
                } catch (CancellationException e10) {
                    throw e10;
                } catch (Throwable th10) {
                    return eu.u(th10);
                }
        }
    }
}
