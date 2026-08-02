package p000;

import com.dokar.quickjs.binding.JsObject;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kotlin.UByteArray;
import nuke.module.wechat.p002ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class je2 implements InterfaceC0772ug {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5001a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ dq1 f5002b;

    public /* synthetic */ je2(dq1 dq1Var, int i) {
        this.f5001a = i;
        this.f5002b = dq1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object m2490c(Object[] objArr, t00 t00Var) {
        se2 se2Var;
        dl2 dl2Var;
        if (t00Var instanceof se2) {
            se2Var = (se2) t00Var;
            int i = se2Var.f10081m;
            if ((i & Integer.MIN_VALUE) != 0) {
                se2Var.f10081m = i - Integer.MIN_VALUE;
            } else {
                se2Var = new se2(this, (u00) t00Var);
            }
        }
        Object objM1110v = se2Var.f10079k;
        int i2 = se2Var.f10081m;
        try {
            if (i2 == 0) {
                fg1.m1627T(objM1110v);
                dq1 dq1Var = this.f5002b;
                sp0.m4929a0(3, objArr);
                hg2 hg2VarM2274y = i51.m2274y("source", objArr[0]);
                hg2 hg2VarM2274y2 = i51.m2274y("target", objArr[1]);
                Object obj = objArr[2];
                if (obj == null) {
                    dl2Var = new dl2(false, true, false);
                } else {
                    JsObject jsObjectM4937e0 = sp0.m4937e0("options", obj);
                    Boolean boolM4716r = s11.m4716r(jsObjectM4937e0, "overwrite");
                    boolean zBooleanValue = boolM4716r != null ? boolM4716r.booleanValue() : false;
                    Boolean boolM4716r2 = s11.m4716r(jsObjectM4937e0, "atomic");
                    boolean zBooleanValue2 = boolM4716r2 != null ? boolM4716r2.booleanValue() : true;
                    Boolean boolM4716r3 = s11.m4716r(jsObjectM4937e0, "createParents");
                    dl2Var = new dl2(zBooleanValue, zBooleanValue2, boolM4716r3 != null ? boolM4716r3.booleanValue() : false);
                }
                se2Var.f10081m = 1;
                objM1110v = dq1Var.m1110v(hg2VarM2274y, hg2VarM2274y2, dl2Var, se2Var);
                k20 k20Var = k20.f5323h;
                if (objM1110v == k20Var) {
                    return k20Var;
                }
            } else {
                if (i2 != 1) {
                    C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                fg1.m1627T(objM1110v);
            }
            return AbstractC0179eu.m1472v(((gg2) objM1110v).m1909a());
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            return AbstractC0179eu.m1471u(th);
        }
    }

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
    @Override // p000.InterfaceC0772ug
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo2148a(Object[] objArr, t00 t00Var) {
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
        int i = this.f5001a;
        a83 a83Var = a83.f116a;
        dq1 dq1Var = this.f5002b;
        k20 k20Var = k20.f5323h;
        switch (i) {
            case 0:
                if (t00Var instanceof ie2) {
                    ie2Var = (ie2) t00Var;
                    int i2 = ie2Var.f4586m;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        ie2Var.f4586m = i2 - Integer.MIN_VALUE;
                    } else {
                        ie2Var = new ie2(this, (u00) t00Var);
                    }
                }
                Object objM1081D = ie2Var.f4584k;
                int i3 = ie2Var.f4586m;
                try {
                    if (i3 == 0) {
                        fg1.m1627T(objM1081D);
                        sp0.m4929a0(1, objArr);
                        hg2 hg2VarM2274y = i51.m2274y("ref", objArr[0]);
                        ie2Var.f4586m = 1;
                        objM1081D = dq1Var.m1081D(hg2VarM2274y, ie2Var);
                        if (objM1081D == k20Var) {
                            return k20Var;
                        }
                    } else {
                        if (i3 != 1) {
                            C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        fg1.m1627T(objM1081D);
                    }
                    return AbstractC0179eu.m1472v(objM1081D);
                } catch (CancellationException e) {
                    throw e;
                } catch (Throwable th) {
                    return AbstractC0179eu.m1471u(th);
                }
            case 1:
                if (t00Var instanceof ke2) {
                    ke2Var = (ke2) t00Var;
                    int i4 = ke2Var.f5481m;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        ke2Var.f5481m = i4 - Integer.MIN_VALUE;
                    } else {
                        ke2Var = new ke2(this, (u00) t00Var);
                    }
                }
                Object objM1097V = ke2Var.f5479k;
                int i5 = ke2Var.f5481m;
                try {
                    if (i5 == 0) {
                        fg1.m1627T(objM1097V);
                        sp0.m4929a0(1, objArr);
                        hg2 hg2VarM2274y2 = i51.m2274y("ref", objArr[0]);
                        ke2Var.f5481m = 1;
                        objM1097V = dq1Var.m1097V(hg2VarM2274y2, ke2Var);
                        if (objM1097V == k20Var) {
                            return k20Var;
                        }
                    } else {
                        if (i5 != 1) {
                            C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        fg1.m1627T(objM1097V);
                    }
                    return AbstractC0179eu.m1472v(((gg2) objM1097V).m1909a());
                } catch (CancellationException e2) {
                    throw e2;
                } catch (Throwable th2) {
                    return AbstractC0179eu.m1471u(th2);
                }
            case 2:
                if (t00Var instanceof le2) {
                    le2Var = (le2) t00Var;
                    int i6 = le2Var.f6083m;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        le2Var.f6083m = i6 - Integer.MIN_VALUE;
                    } else {
                        le2Var = new le2(this, (u00) t00Var);
                    }
                }
                Object objM1085H = le2Var.f6081k;
                int i7 = le2Var.f6083m;
                try {
                    if (i7 == 0) {
                        fg1.m1627T(objM1085H);
                        sp0.m4929a0(1, objArr);
                        hg2 hg2VarM2274y3 = i51.m2274y("ref", objArr[0]);
                        le2Var.f6083m = 1;
                        objM1085H = dq1Var.m1085H(hg2VarM2274y3, le2Var);
                        if (objM1085H == k20Var) {
                            return k20Var;
                        }
                    } else {
                        if (i7 != 1) {
                            C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        fg1.m1627T(objM1085H);
                    }
                    Iterable iterable = (Iterable) objM1085H;
                    ArrayList arrayList = new ArrayList(AbstractC0179eu.m1421B(iterable, 10));
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((gg2) it.next()).m1909a());
                    }
                    return AbstractC0179eu.m1472v(arrayList);
                } catch (CancellationException e3) {
                    throw e3;
                } catch (Throwable th3) {
                    return AbstractC0179eu.m1471u(th3);
                }
            case 3:
                if (t00Var instanceof me2) {
                    me2Var = (me2) t00Var;
                    int i8 = me2Var.f6591m;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        me2Var.f6591m = i8 - Integer.MIN_VALUE;
                    } else {
                        me2Var = new me2(this, (u00) t00Var);
                    }
                }
                Object objM1090N = me2Var.f6589k;
                int i9 = me2Var.f6591m;
                try {
                    if (i9 == 0) {
                        fg1.m1627T(objM1090N);
                        sp0.m4929a0(1, objArr);
                        hg2 hg2VarM2274y4 = i51.m2274y("ref", objArr[0]);
                        me2Var.f6591m = 1;
                        objM1090N = dq1Var.m1090N(hg2VarM2274y4, me2Var);
                        if (objM1090N == k20Var) {
                            return k20Var;
                        }
                    } else {
                        if (i9 != 1) {
                            C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        fg1.m1627T(objM1090N);
                    }
                    byte[] bArr = (byte[]) objM1090N;
                    bArr.getClass();
                    return AbstractC0179eu.m1472v(new UByteArray(Arrays.copyOf(bArr, bArr.length)));
                } catch (CancellationException e4) {
                    throw e4;
                } catch (Throwable th4) {
                    return AbstractC0179eu.m1471u(th4);
                }
            case 4:
                if (t00Var instanceof ne2) {
                    ne2Var = (ne2) t00Var;
                    int i10 = ne2Var.f7124m;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        ne2Var.f7124m = i10 - Integer.MIN_VALUE;
                    } else {
                        ne2Var = new ne2(this, (u00) t00Var);
                    }
                }
                Object objM1092P = ne2Var.f7122k;
                int i11 = ne2Var.f7124m;
                try {
                    if (i11 == 0) {
                        fg1.m1627T(objM1092P);
                        sp0.m4929a0(1, objArr);
                        hg2 hg2VarM2274y5 = i51.m2274y("ref", objArr[0]);
                        ne2Var.f7124m = 1;
                        objM1092P = dq1Var.m1092P(hg2VarM2274y5, ne2Var);
                        if (objM1092P == k20Var) {
                            return k20Var;
                        }
                    } else {
                        if (i11 != 1) {
                            C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        fg1.m1627T(objM1092P);
                    }
                    return AbstractC0179eu.m1472v(objM1092P);
                } catch (CancellationException e5) {
                    throw e5;
                } catch (Throwable th5) {
                    return AbstractC0179eu.m1471u(th5);
                }
            case 5:
                if (t00Var instanceof oe2) {
                    oe2Var = (oe2) t00Var;
                    int i12 = oe2Var.f7649m;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        oe2Var.f7649m = i12 - Integer.MIN_VALUE;
                    } else {
                        oe2Var = new oe2(this, (u00) t00Var);
                    }
                }
                Object objM1100Y = oe2Var.f7647k;
                int i13 = oe2Var.f7649m;
                try {
                    if (i13 == 0) {
                        fg1.m1627T(objM1100Y);
                        sp0.m4929a0(3, objArr);
                        hg2 hg2VarM2274y6 = i51.m2274y("ref", objArr[0]);
                        byte[] bArrM4926Y = sp0.m4926Y("data", objArr[1]);
                        Object obj = objArr[2];
                        if (obj == null) {
                            dl2Var = new dl2(false, true, false);
                        } else {
                            JsObject jsObjectM4937e0 = sp0.m4937e0("options", obj);
                            Boolean boolM4716r = s11.m4716r(jsObjectM4937e0, "overwrite");
                            boolean zBooleanValue = boolM4716r != null ? boolM4716r.booleanValue() : false;
                            Boolean boolM4716r2 = s11.m4716r(jsObjectM4937e0, "atomic");
                            boolean zBooleanValue2 = boolM4716r2 != null ? boolM4716r2.booleanValue() : true;
                            Boolean boolM4716r3 = s11.m4716r(jsObjectM4937e0, "createParents");
                            dl2Var = new dl2(zBooleanValue, zBooleanValue2, boolM4716r3 != null ? boolM4716r3.booleanValue() : false);
                        }
                        oe2Var.f7649m = 1;
                        objM1100Y = dq1Var.m1100Y(hg2VarM2274y6, bArrM4926Y, dl2Var, oe2Var);
                        if (objM1100Y == k20Var) {
                            return k20Var;
                        }
                    } else {
                        if (i13 != 1) {
                            C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        fg1.m1627T(objM1100Y);
                    }
                    return AbstractC0179eu.m1472v(((gg2) objM1100Y).m1909a());
                } catch (CancellationException e6) {
                    throw e6;
                } catch (Throwable th6) {
                    return AbstractC0179eu.m1471u(th6);
                }
            case AIChatConfig.DefaultContextRounds /* 6 */:
                if (t00Var instanceof pe2) {
                    pe2Var = (pe2) t00Var;
                    int i14 = pe2Var.f8286m;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        pe2Var.f8286m = i14 - Integer.MIN_VALUE;
                    } else {
                        pe2Var = new pe2(this, (u00) t00Var);
                    }
                }
                Object objM1100Y2 = pe2Var.f8284k;
                int i15 = pe2Var.f8286m;
                try {
                    if (i15 == 0) {
                        fg1.m1627T(objM1100Y2);
                        sp0.m4929a0(3, objArr);
                        hg2 hg2VarM2274y7 = i51.m2274y("ref", objArr[0]);
                        String strM4941g0 = sp0.m4941g0("text", objArr[1]);
                        Object obj2 = objArr[2];
                        if (obj2 == null) {
                            dl2Var2 = new dl2(false, true, false);
                        } else {
                            JsObject jsObjectM4937e02 = sp0.m4937e0("options", obj2);
                            Boolean boolM4716r4 = s11.m4716r(jsObjectM4937e02, "overwrite");
                            boolean zBooleanValue3 = boolM4716r4 != null ? boolM4716r4.booleanValue() : false;
                            Boolean boolM4716r5 = s11.m4716r(jsObjectM4937e02, "atomic");
                            boolean zBooleanValue4 = boolM4716r5 != null ? boolM4716r5.booleanValue() : true;
                            Boolean boolM4716r6 = s11.m4716r(jsObjectM4937e02, "createParents");
                            dl2Var2 = new dl2(zBooleanValue3, zBooleanValue4, boolM4716r6 != null ? boolM4716r6.booleanValue() : false);
                        }
                        pe2Var.f8286m = 1;
                        Charset charset = StandardCharsets.UTF_8;
                        charset.getClass();
                        byte[] bytes = strM4941g0.getBytes(charset);
                        bytes.getClass();
                        objM1100Y2 = dq1Var.m1100Y(hg2VarM2274y7, bytes, dl2Var2, pe2Var);
                        if (objM1100Y2 == k20Var) {
                            return k20Var;
                        }
                    } else {
                        if (i15 != 1) {
                            C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        fg1.m1627T(objM1100Y2);
                    }
                    return AbstractC0179eu.m1472v(((gg2) objM1100Y2).m1909a());
                } catch (CancellationException e7) {
                    throw e7;
                } catch (Throwable th7) {
                    return AbstractC0179eu.m1471u(th7);
                }
            case 7:
                if (t00Var instanceof qe2) {
                    qe2Var = (qe2) t00Var;
                    int i16 = qe2Var.f8932m;
                    if ((i16 & Integer.MIN_VALUE) != 0) {
                        qe2Var.f8932m = i16 - Integer.MIN_VALUE;
                    } else {
                        qe2Var = new qe2(this, (u00) t00Var);
                    }
                }
                Object obj3 = qe2Var.f8930k;
                int i17 = qe2Var.f8932m;
                try {
                    if (i17 == 0) {
                        fg1.m1627T(obj3);
                        sp0.m4929a0(2, objArr);
                        hg2 hg2VarM2274y8 = i51.m2274y("ref", objArr[0]);
                        boolean zM4925X = sp0.m4925X("recursive", objArr[1]);
                        qe2Var.f8932m = 1;
                        if (dq1Var.m1111w(hg2VarM2274y8, zM4925X, qe2Var) == k20Var) {
                            return k20Var;
                        }
                    } else {
                        if (i17 != 1) {
                            C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        fg1.m1627T(obj3);
                    }
                    return AbstractC0179eu.m1472v(a83Var);
                } catch (CancellationException e8) {
                    throw e8;
                } catch (Throwable th8) {
                    return AbstractC0179eu.m1471u(th8);
                }
            case 8:
                if (t00Var instanceof re2) {
                    re2Var = (re2) t00Var;
                    int i18 = re2Var.f9529m;
                    if ((i18 & Integer.MIN_VALUE) != 0) {
                        re2Var.f9529m = i18 - Integer.MIN_VALUE;
                    } else {
                        re2Var = new re2(this, (u00) t00Var);
                    }
                }
                Object obj4 = re2Var.f9527k;
                int i19 = re2Var.f9529m;
                try {
                    if (i19 == 0) {
                        fg1.m1627T(obj4);
                        sp0.m4929a0(2, objArr);
                        hg2 hg2VarM2274y9 = i51.m2274y("ref", objArr[0]);
                        Object obj5 = objArr[1];
                        if (obj5 == null) {
                            ui2Var = new ui2(false, false);
                        } else {
                            JsObject jsObjectM4937e03 = sp0.m4937e0("options", obj5);
                            Boolean boolM4716r7 = s11.m4716r(jsObjectM4937e03, "recursive");
                            boolean zBooleanValue5 = boolM4716r7 != null ? boolM4716r7.booleanValue() : false;
                            Boolean boolM4716r8 = s11.m4716r(jsObjectM4937e03, "missingOk");
                            ui2Var = new ui2(zBooleanValue5, boolM4716r8 != null ? boolM4716r8.booleanValue() : false);
                        }
                        re2Var.f9529m = 1;
                        if (dq1Var.m1094R(hg2VarM2274y9, ui2Var, re2Var) == k20Var) {
                            return k20Var;
                        }
                    } else {
                        if (i19 != 1) {
                            C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        fg1.m1627T(obj4);
                    }
                    return AbstractC0179eu.m1472v(a83Var);
                } catch (CancellationException e9) {
                    throw e9;
                } catch (Throwable th9) {
                    return AbstractC0179eu.m1471u(th9);
                }
            case 9:
                return m2490c(objArr, t00Var);
            default:
                if (t00Var instanceof te2) {
                    te2Var = (te2) t00Var;
                    int i20 = te2Var.f10705m;
                    if ((i20 & Integer.MIN_VALUE) != 0) {
                        te2Var.f10705m = i20 - Integer.MIN_VALUE;
                    } else {
                        te2Var = new te2(this, (u00) t00Var);
                    }
                }
                Object objM1086I = te2Var.f10703k;
                int i21 = te2Var.f10705m;
                try {
                    if (i21 == 0) {
                        fg1.m1627T(objM1086I);
                        sp0.m4929a0(3, objArr);
                        hg2 hg2VarM2274y10 = i51.m2274y("source", objArr[0]);
                        hg2 hg2VarM2274y11 = i51.m2274y("target", objArr[1]);
                        Object obj6 = objArr[2];
                        if (obj6 == null) {
                            dl2Var3 = new dl2(false, true, false);
                        } else {
                            JsObject jsObjectM4937e04 = sp0.m4937e0("options", obj6);
                            Boolean boolM4716r9 = s11.m4716r(jsObjectM4937e04, "overwrite");
                            boolean zBooleanValue6 = boolM4716r9 != null ? boolM4716r9.booleanValue() : false;
                            Boolean boolM4716r10 = s11.m4716r(jsObjectM4937e04, "atomic");
                            boolean zBooleanValue7 = boolM4716r10 != null ? boolM4716r10.booleanValue() : true;
                            Boolean boolM4716r11 = s11.m4716r(jsObjectM4937e04, "createParents");
                            dl2Var3 = new dl2(zBooleanValue6, zBooleanValue7, boolM4716r11 != null ? boolM4716r11.booleanValue() : false);
                        }
                        te2Var.f10705m = 1;
                        objM1086I = dq1Var.m1086I(hg2VarM2274y10, hg2VarM2274y11, dl2Var3, te2Var);
                        if (objM1086I == k20Var) {
                            return k20Var;
                        }
                    } else {
                        if (i21 != 1) {
                            C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        fg1.m1627T(objM1086I);
                    }
                    return AbstractC0179eu.m1472v(((gg2) objM1086I).m1909a());
                } catch (CancellationException e10) {
                    throw e10;
                } catch (Throwable th10) {
                    return AbstractC0179eu.m1471u(th10);
                }
        }
    }
}
