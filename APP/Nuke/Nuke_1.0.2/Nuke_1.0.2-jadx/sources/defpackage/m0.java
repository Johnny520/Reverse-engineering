package defpackage;

import android.R;
import android.app.RemoteAction;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.textclassifier.TextClassification;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import nuke.module.wechat.ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m0 implements in0 {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ m0(sz0 sz0Var, n10 n10Var, o72 o72Var) {
        this.h = 12;
        this.j = sz0Var;
        this.k = n10Var;
        this.i = o72Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:477:? */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v225, types: [in0] */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19, types: [qp] */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v66 */
    /* JADX WARN: Type inference failed for: r8v0, types: [t00, xm0] */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object] */
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
    @Override // defpackage.in0
    public final Object j(Object obj) {
        String string;
        x03 x03Var;
        ?? r3;
        qp qpVar;
        qp qpVar2;
        boolean z;
        t91 t91Var;
        Integer numE;
        Integer numD;
        Integer numD2;
        Integer numE2;
        y03 y03Var;
        y03 y03Var2;
        z03 z03Var;
        z03 z03Var2;
        y03 y03Var3;
        y03 y03Var4;
        z03 z03Var3;
        z03 z03Var4;
        Integer numD3;
        Integer numE3;
        Integer numE4;
        Integer numD4;
        dq1 dq1Var;
        int i = this.h;
        int i2 = 6;
        int i3 = 3;
        final int i4 = 2;
        ?? r8 = 0;
        k03 k03Var = null;
        r8 = 0;
        a83 a83Var = a83.a;
        Object obj2 = this.k;
        Object obj3 = this.i;
        Object obj4 = this.j;
        int i5 = 1;
        final int i6 = 0;
        switch (i) {
            case 0:
                List list = (List) obj4;
                s81 s81Var = (s81) obj;
                s81Var.getClass();
                w0 w0Var = w0.o;
                s81Var.b(list.size(), new y0(0, list), new y0(list, 1, false), new kw(802480018, true, new z0(list, (String) obj3, (in0) obj2, false ? 1 : 0)));
                return a83Var;
            case 1:
                s81 s81Var2 = (s81) obj;
                s81Var2.getClass();
                int i7 = 0;
                s81.a(s81Var2, "about_avatar", new kw(-60439243, true, new x1((String) obj3, i7)), 2);
                s81.a(s81Var2, "about_project", new kw(-919602388, true, new y1(i7, (List) obj4)), 2);
                s81.a(s81Var2, "about_thanks", new kw(1219237485, true, new y1(1, (List) obj2)), 2);
                return a83Var;
            case 2:
                in0 in0Var = (in0) obj2;
                xk1 xk1Var = (xk1) obj3;
                k03 k03Var2 = (k03) obj;
                ((xk1) obj4).setValue(k03Var2);
                boolean zL = t11.l((String) xk1Var.getValue(), k03Var2.a.i);
                sd sdVar = k03Var2.a;
                xk1Var.setValue(sdVar.i);
                if (!zL) {
                    in0Var.j(sdVar.i);
                }
                return a83Var;
            case 3:
                oo2 oo2Var = (oo2) obj;
                oo2Var.getClass();
                jr.k.put((String) obj3, Long.valueOf(System.currentTimeMillis()));
                jr.d.getClass();
                String str = jr.h;
                String str2 = ((zq) obj4).b;
                String str3 = ((by0) obj2).a;
                if (oo2Var instanceof mo2) {
                    string = vi0.i("type=text, content=", ((mo2) oo2Var).b);
                } else if (oo2Var instanceof ko2) {
                    ko2 ko2Var = (ko2) oo2Var;
                    string = "type=image, path=" + ko2Var.b + ", taskClass=" + ko2Var.c;
                } else {
                    if (!(oo2Var instanceof no2)) {
                        c80.s();
                        return null;
                    }
                    no2 no2Var = (no2) oo2Var;
                    String str4 = no2Var.c;
                    String str5 = no2Var.d;
                    int i8 = no2Var.e;
                    StringBuilder sbO = vi0.o("type=voice, source=", str4, ", target=", str5, ", durationMs=");
                    sbO.append(i8);
                    string = sbO.toString();
                }
                StringBuilder sbO2 = vi0.o("Auto reply sent: task=", str2, ", talker=", str3, ", ");
                sbO2.append(string);
                hg3.f(str, sbO2.toString());
                return a83Var;
            case 4:
                g00 g00Var = (g00) obj4;
                k21 k21Var = (k21) obj3;
                gm2 gm2Var = (gm2) obj2;
                float fFloatValue = ((Float) obj).floatValue();
                float f = g00Var.x ? 1.0f : -1.0f;
                im2 im2Var = g00Var.w;
                long jE = im2Var.e(im2Var.h(f * fFloatValue));
                im2 im2Var2 = gm2Var.a;
                float fG = im2Var.g(im2Var.e(im2Var2.c(im2Var2.k, jE, 1))) * f;
                if (Math.abs(fG) < Math.abs(fFloatValue)) {
                    CancellationException cancellationException = new CancellationException("Scroll animation cancelled because scroll was not consumed (" + fG + " < " + fFloatValue + ')');
                    cancellationException.initCause(null);
                    k21Var.c(cancellationException);
                }
                return a83Var;
            case 5:
                sn snVar = sn.U;
                t91 t91Var2 = (t91) obj4;
                long j = ((k03) obj3).b;
                us1 us1Var = (us1) obj2;
                nc0 nc0Var = (nc0) obj;
                z03 z03VarD = t91Var2.d();
                if (z03VarD != null) {
                    qp qpVarQ = nc0Var.E().q();
                    long j2 = ((f13) t91Var2.A.getValue()).a;
                    long j3 = ((f13) t91Var2.B.getValue()).a;
                    y03 y03Var5 = z03VarD.a;
                    x03 x03Var2 = y03Var5.a;
                    lj1 lj1Var = y03Var5.b;
                    q9 q9Var = t91Var2.y;
                    long j4 = t91Var2.z;
                    if (!f13.c(j2)) {
                        q9Var.k(j4);
                        int iP = us1Var.p(f13.f(j2));
                        int iP2 = us1Var.p(f13.e(j2));
                        if (iP != iP2) {
                            qpVarQ.h(y03Var5.h(iP, iP2), q9Var);
                        }
                        x03Var = x03Var2;
                    } else if (f13.c(j3)) {
                        x03Var = x03Var2;
                        if (!f13.c(j)) {
                            q9Var.k(j4);
                            int iP3 = us1Var.p(f13.f(j));
                            int iP4 = us1Var.p(f13.e(j));
                            if (iP3 != iP4) {
                                qpVarQ.h(y03Var5.h(iP3, iP4), q9Var);
                            }
                        }
                    } else {
                        x03Var = x03Var2;
                        long jB = x03Var.b.b();
                        ju juVar = new ju(jB);
                        if (jB == 16) {
                            juVar = null;
                        }
                        long j5 = juVar != null ? juVar.a : ju.b;
                        q9Var.k(ju.b(ju.d(j5) * 0.2f, j5));
                        int iP5 = us1Var.p(f13.f(j3));
                        int iP6 = us1Var.p(f13.e(j3));
                        if (iP5 != iP6) {
                            qpVarQ.h(y03Var5.h(iP5, iP6), q9Var);
                        }
                    }
                    long j6 = y03Var5.c;
                    boolean z2 = ((((float) ((int) (j6 >> 32))) > lj1Var.d ? 1 : (((float) ((int) (j6 >> 32))) == lj1Var.d ? 0 : -1)) < 0 || lj1Var.c || (((float) ((int) (j6 & 4294967295L))) > lj1Var.e ? 1 : (((float) ((int) (j6 & 4294967295L))) == lj1Var.e ? 0 : -1)) < 0) && x03Var.f != 3;
                    if (z2) {
                        o62 o62VarQ = eu.q(0L, (((long) Float.floatToRawIntBits((int) (j6 & 4294967295L))) & 4294967295L) | (((long) Float.floatToRawIntBits((int) (j6 >> 32))) << 32));
                        qpVarQ.l();
                        qp.k(qpVarQ, o62VarQ);
                    }
                    lt2 lt2Var = x03Var.b.a;
                    gz2 gz2Var = lt2Var.m;
                    l03 l03Var = lt2Var.a;
                    if (gz2Var == null) {
                        gz2Var = gz2.b;
                    }
                    gz2 gz2Var2 = gz2Var;
                    bq2 bq2Var = lt2Var.n;
                    if (bq2Var == null) {
                        bq2Var = bq2.d;
                    }
                    bq2 bq2Var2 = bq2Var;
                    op0 op0Var = lt2Var.o;
                    if (op0Var == null) {
                        op0Var = xi0.h;
                    }
                    op0 op0Var2 = op0Var;
                    try {
                        an anVarK = l03Var.k();
                        try {
                            if (anVarK == null) {
                                qp qpVar3 = qpVarQ;
                                long jB2 = l03Var != snVar ? l03Var.b() : ju.b;
                                qpVar3.l();
                                ArrayList arrayList = lj1Var.h;
                                int size = arrayList.size();
                                int i9 = 0;
                                qp qpVar4 = qpVar3;
                                while (i9 < size) {
                                    rw1 rw1Var = (rw1) arrayList.get(i9);
                                    rw1Var.a.f(qpVar4, jB2, bq2Var2, gz2Var2, op0Var2);
                                    qpVar = qpVar4;
                                    try {
                                        qpVar.g(0.0f, rw1Var.a.b());
                                        i9++;
                                        qpVar4 = qpVar;
                                    } catch (Throwable th) {
                                        th = th;
                                        r3 = qpVar;
                                        if (z2) {
                                            r3.i();
                                        }
                                        throw th;
                                    }
                                }
                                qpVar = qpVar4;
                                qpVar.i();
                                qpVar2 = qpVar;
                            } else {
                                lj1.i(lj1Var, qpVarQ, anVarK, l03Var != snVar ? l03Var.a() : 1.0f, bq2Var2, gz2Var2, op0Var2);
                                qpVar2 = qpVarQ;
                            }
                            if (z2) {
                                qpVar2.i();
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            r3 = 4294967295;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        r3 = qpVarQ;
                    }
                    break;
                }
                return a83Var;
            case AIChatConfig.DefaultContextRounds /* 6 */:
                int i10 = 0;
                Context context = (Context) obj3;
                cz2 cz2Var = (cz2) obj2;
                n00 n00Var = (n00) obj;
                List list2 = ((qy2) obj4).a;
                int size2 = list2.size();
                int i11 = 0;
                while (i11 < size2) {
                    py2 py2Var = (py2) list2.get(i11);
                    if (py2Var instanceof xy2) {
                        xy2 xy2Var = (xy2) py2Var;
                        n00.b(n00Var, new s9(i2, xy2Var), xy2Var.c == 0 ? null : new kw(-1930700965, true, new j60(i10, xy2Var)), new r1(14, xy2Var, cz2Var), 6);
                    } else if (py2Var instanceof dz2) {
                        if (Build.VERSION.SDK_INT >= 28) {
                            dz2 dz2Var = (dz2) py2Var;
                            if (context != null) {
                                int i12 = dz2Var.c;
                                TextClassification textClassification = dz2Var.b;
                                if (i12 < 0) {
                                    s9 s9Var = new s9(22, textClassification);
                                    Drawable icon = textClassification.getIcon();
                                    n00.b(n00Var, s9Var, icon != null ? new kw(-1123224187, true, new j60(1, icon)) : null, new r1(29, context, textClassification), 6);
                                } else {
                                    RemoteAction remoteAction = (RemoteAction) textClassification.getActions().get(i12);
                                    n00.b(n00Var, new s9(23, remoteAction), ((i12 == 0) || remoteAction.shouldShowIcon()) ? new kw(-1261173016, true, new j60(i4, remoteAction)) : null, new ta(27, remoteAction), 6);
                                }
                            }
                        }
                    } else if (py2Var instanceof bz2) {
                        n00Var.a.add(qp0.j);
                    }
                    i11++;
                    i10 = 0;
                }
                return a83Var;
            case 7:
                xk1 xk1Var2 = (xk1) obj3;
                ArrayList arrayList2 = (ArrayList) obj2;
                List list3 = (List) obj4;
                rz1 rz1Var = (rz1) obj;
                rz1Var.h = true;
                int size3 = arrayList2.size();
                for (int i13 = 0; i13 < size3; i13++) {
                    ((y81) arrayList2.get(i13)).b(rz1Var);
                }
                int size4 = list3.size();
                for (int i14 = 0; i14 < size4; i14++) {
                    ((y81) list3.get(i14)).b(rz1Var);
                }
                rz1Var.h = false;
                xk1Var2.getValue();
                return a83Var;
            case 8:
                ia1 ia1Var = (ia1) obj4;
                final pa1 pa1Var = (pa1) obj3;
                final in0 in0Var2 = (in0) obj2;
                final o72 o72Var = new o72();
                fa1 fa1Var = new fa1() { // from class: ca1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // defpackage.fa1
                    public final void g(ia1 ia1Var2, z91 z91Var) {
                        int i15 = ea1.a[z91Var.ordinal()];
                        o72 o72Var2 = o72Var;
                        if (i15 == 1) {
                            o72Var2.i = in0Var2.j(pa1Var);
                        } else {
                            if (i15 != 2) {
                                return;
                            }
                            kj kjVar = (kj) o72Var2.i;
                            if (kjVar != null) {
                                kjVar.a();
                            }
                            o72Var2.i = null;
                        }
                    }
                };
                ia1Var.getLifecycle().a(fa1Var);
                return new da1(ia1Var, fa1Var, o72Var, i6);
            case 9:
                ca2 ca2Var = (ca2) obj;
                ca2Var.getClass();
                ca2Var.c(((Number) ((gu2) obj4).getValue()).floatValue());
                ca2Var.k(((Number) ((gu2) obj3).getValue()).floatValue());
                ca2Var.l(((Number) ((gu2) obj2).getValue()).floatValue());
                ca2Var.r(rb3.a(0.5f, 0.5f));
                return a83Var;
            case 10:
                dc2 dc2Var = (dc2) obj4;
                ic2 ic2Var = (ic2) obj2;
                rk1 rk1Var = dc2Var.i;
                if (rk1Var.b(obj3)) {
                    c80.n("Key ", obj3, " was used multiple times ");
                    return null;
                }
                dc2Var.h.remove(obj3);
                rk1Var.m(obj3, ic2Var);
                return new da1(dc2Var, obj3, ic2Var, 1);
            case 11:
                er2 er2Var = (er2) obj4;
                vm2 vm2Var = (vm2) obj3;
                y62 y62Var = (y62) obj2;
                o12 o12Var = (o12) obj;
                long j7 = o12Var.c;
                b03 b03Var = (b03) er2Var.k;
                if (!b03Var.k() || b03Var.n().a.i.length() == 0 || (t91Var = b03Var.d) == null || t91Var.d() == null) {
                    z = false;
                } else {
                    er2Var.e(b03Var.n(), j7, false, vm2Var);
                    z = true;
                }
                if (z) {
                    o12Var.a();
                    y62Var.h = true;
                }
                return a83Var;
            case 12:
                in0 in0Var3 = (in0) obj2;
                t03 t03Var = (t03) ((o72) obj3).i;
                k03 k03VarQ = ((sz0) obj4).q((List) obj);
                if (t03Var != null) {
                    t03Var.a(null, k03VarQ);
                }
                in0Var3.j(k03VarQ);
                return a83Var;
            case 13:
                mz2 mz2Var = (mz2) obj3;
                y62 y62Var2 = (y62) obj2;
                pz2 pz2Var = (pz2) obj;
                int i15 = 4;
                int i16 = 18;
                switch (((c51) obj4).ordinal()) {
                    case 0:
                        pz2Var.e.a = null;
                        if (pz2Var.g.i.length() > 0) {
                            if (f13.c(pz2Var.f)) {
                                pz2Var.i();
                            } else {
                                boolean zF = pz2Var.f();
                                long j8 = pz2Var.f;
                                if (zF) {
                                    int iF = f13.f(j8);
                                    pz2Var.q(iF, iF);
                                } else {
                                    int iE = f13.e(j8);
                                    pz2Var.q(iE, iE);
                                }
                            }
                        }
                        break;
                    case 1:
                        pz2Var.e.a = null;
                        if (pz2Var.g.i.length() > 0) {
                            if (f13.c(pz2Var.f)) {
                                pz2Var.m();
                            } else {
                                boolean zF2 = pz2Var.f();
                                long j9 = pz2Var.f;
                                if (zF2) {
                                    int iE2 = f13.e(j9);
                                    pz2Var.q(iE2, iE2);
                                } else {
                                    int iF2 = f13.f(j9);
                                    pz2Var.q(iF2, iF2);
                                }
                            }
                        }
                        break;
                    case 2:
                        e13 e13Var = pz2Var.e;
                        e13Var.a = null;
                        sd sdVar2 = pz2Var.g;
                        String str6 = sdVar2.i;
                        String str7 = sdVar2.i;
                        if (str6.length() > 0) {
                            if (pz2Var.f()) {
                                e13Var.a = null;
                                if (str7.length() > 0 && (numD = pz2Var.d()) != null) {
                                    int iIntValue = numD.intValue();
                                    pz2Var.q(iIntValue, iIntValue);
                                }
                            } else {
                                e13Var.a = null;
                                if (str7.length() > 0 && (numE = pz2Var.e()) != null) {
                                    int iIntValue2 = numE.intValue();
                                    pz2Var.q(iIntValue2, iIntValue2);
                                }
                            }
                        }
                        break;
                    case 3:
                        e13 e13Var2 = pz2Var.e;
                        e13Var2.a = null;
                        sd sdVar3 = pz2Var.g;
                        String str8 = sdVar3.i;
                        String str9 = sdVar3.i;
                        if (str8.length() > 0) {
                            if (pz2Var.f()) {
                                e13Var2.a = null;
                                if (str9.length() > 0 && (numE2 = pz2Var.e()) != null) {
                                    int iIntValue3 = numE2.intValue();
                                    pz2Var.q(iIntValue3, iIntValue3);
                                }
                            } else {
                                e13Var2.a = null;
                                if (str9.length() > 0 && (numD2 = pz2Var.d()) != null) {
                                    int iIntValue4 = numD2.intValue();
                                    pz2Var.q(iIntValue4, iIntValue4);
                                }
                            }
                        }
                        break;
                    case 4:
                        pz2Var.j();
                        break;
                    case 5:
                        pz2Var.l();
                        break;
                    case AIChatConfig.DefaultContextRounds /* 6 */:
                        pz2Var.o();
                        break;
                    case 7:
                        pz2Var.n();
                        break;
                    case 8:
                        pz2Var.e.a = null;
                        if (pz2Var.g.i.length() > 0) {
                            if (pz2Var.f()) {
                                pz2Var.o();
                            } else {
                                pz2Var.n();
                            }
                        }
                        break;
                    case 9:
                        pz2Var.e.a = null;
                        if (pz2Var.g.i.length() > 0) {
                            if (pz2Var.f()) {
                                pz2Var.n();
                            } else {
                                pz2Var.o();
                            }
                        }
                        break;
                    case 10:
                        if (pz2Var.g.i.length() > 0 && (y03Var = pz2Var.c) != null) {
                            int iG = pz2Var.g(y03Var, -1);
                            pz2Var.q(iG, iG);
                        }
                        break;
                    case 11:
                        if (pz2Var.g.i.length() > 0 && (y03Var2 = pz2Var.c) != null) {
                            int iG2 = pz2Var.g(y03Var2, 1);
                            pz2Var.q(iG2, iG2);
                        }
                        break;
                    case 12:
                    case 48:
                        break;
                    case 13:
                        if (pz2Var.g.i.length() > 0 && (z03Var = pz2Var.i) != null) {
                            int iH = pz2Var.h(z03Var, -1);
                            pz2Var.q(iH, iH);
                        }
                        break;
                    case 14:
                        if (pz2Var.g.i.length() > 0 && (z03Var2 = pz2Var.i) != null) {
                            int iH2 = pz2Var.h(z03Var2, 1);
                            pz2Var.q(iH2, iH2);
                        }
                        break;
                    case 15:
                        pz2Var.e.a = null;
                        if (pz2Var.g.i.length() > 0) {
                            pz2Var.q(0, 0);
                        }
                        break;
                    case 16:
                        pz2Var.e.a = null;
                        sd sdVar4 = pz2Var.g;
                        if (sdVar4.i.length() > 0) {
                            int length = sdVar4.i.length();
                            pz2Var.q(length, length);
                        }
                        break;
                    case 17:
                        mz2Var.b.d(false);
                        break;
                    case 18:
                        mz2Var.b.p();
                        break;
                    case 19:
                        mz2Var.b.f();
                        break;
                    case AIChatConfig.MaxContextRounds /* 20 */:
                        List listA = pz2Var.a(new kx2(1));
                        if (listA != null) {
                            mz2Var.a(listA);
                        }
                        break;
                    case 21:
                        List listA2 = pz2Var.a(new kx2(i4));
                        if (listA2 != null) {
                            mz2Var.a(listA2);
                        }
                        break;
                    case 22:
                        List listA3 = pz2Var.a(new kx2(i3));
                        if (listA3 != null) {
                            mz2Var.a(listA3);
                        }
                        break;
                    case 23:
                        List listA4 = pz2Var.a(new kx2(i15));
                        if (listA4 != null) {
                            mz2Var.a(listA4);
                        }
                        break;
                    case 24:
                        List listA5 = pz2Var.a(new kx2(5));
                        if (listA5 != null) {
                            mz2Var.a(listA5);
                        }
                        break;
                    case 25:
                        List listA6 = pz2Var.a(new kx2(i2));
                        if (listA6 != null) {
                            mz2Var.a(listA6);
                        }
                        break;
                    case 26:
                        pz2Var.e.a = null;
                        sd sdVar5 = pz2Var.g;
                        if (sdVar5.i.length() > 0) {
                            pz2Var.q(0, sdVar5.i.length());
                        }
                        break;
                    case 27:
                        pz2Var.i();
                        pz2Var.p();
                        break;
                    case 28:
                        pz2Var.m();
                        pz2Var.p();
                        break;
                    case 29:
                        if (pz2Var.g.i.length() > 0 && (y03Var3 = pz2Var.c) != null) {
                            int iG3 = pz2Var.g(y03Var3, -1);
                            pz2Var.q(iG3, iG3);
                        }
                        pz2Var.p();
                        break;
                    case 30:
                        if (pz2Var.g.i.length() > 0 && (y03Var4 = pz2Var.c) != null) {
                            int iG4 = pz2Var.g(y03Var4, 1);
                            pz2Var.q(iG4, iG4);
                        }
                        pz2Var.p();
                        break;
                    case 31:
                        if (pz2Var.g.i.length() > 0 && (z03Var3 = pz2Var.i) != null) {
                            int iH3 = pz2Var.h(z03Var3, -1);
                            pz2Var.q(iH3, iH3);
                        }
                        pz2Var.p();
                        break;
                    case 32:
                        if (pz2Var.g.i.length() > 0 && (z03Var4 = pz2Var.i) != null) {
                            int iH4 = pz2Var.h(z03Var4, 1);
                            pz2Var.q(iH4, iH4);
                        }
                        pz2Var.p();
                        break;
                    case 33:
                        pz2Var.e.a = null;
                        if (pz2Var.g.i.length() > 0) {
                            pz2Var.q(0, 0);
                        }
                        pz2Var.p();
                        break;
                    case 34:
                        pz2Var.e.a = null;
                        sd sdVar6 = pz2Var.g;
                        if (sdVar6.i.length() > 0) {
                            int length2 = sdVar6.i.length();
                            pz2Var.q(length2, length2);
                        }
                        pz2Var.p();
                        break;
                    case 35:
                        e13 e13Var3 = pz2Var.e;
                        e13Var3.a = null;
                        sd sdVar7 = pz2Var.g;
                        String str10 = sdVar7.i;
                        String str11 = sdVar7.i;
                        if (str10.length() > 0) {
                            if (pz2Var.f()) {
                                e13Var3.a = null;
                                if (str11.length() > 0 && (numE3 = pz2Var.e()) != null) {
                                    int iIntValue5 = numE3.intValue();
                                    pz2Var.q(iIntValue5, iIntValue5);
                                }
                            } else {
                                e13Var3.a = null;
                                if (str11.length() > 0 && (numD3 = pz2Var.d()) != null) {
                                    int iIntValue6 = numD3.intValue();
                                    pz2Var.q(iIntValue6, iIntValue6);
                                }
                            }
                        }
                        pz2Var.p();
                        break;
                    case 36:
                        e13 e13Var4 = pz2Var.e;
                        e13Var4.a = null;
                        sd sdVar8 = pz2Var.g;
                        String str12 = sdVar8.i;
                        String str13 = sdVar8.i;
                        if (str12.length() > 0) {
                            if (pz2Var.f()) {
                                e13Var4.a = null;
                                if (str13.length() > 0 && (numD4 = pz2Var.d()) != null) {
                                    int iIntValue7 = numD4.intValue();
                                    pz2Var.q(iIntValue7, iIntValue7);
                                }
                            } else {
                                e13Var4.a = null;
                                if (str13.length() > 0 && (numE4 = pz2Var.e()) != null) {
                                    int iIntValue8 = numE4.intValue();
                                    pz2Var.q(iIntValue8, iIntValue8);
                                }
                            }
                        }
                        pz2Var.p();
                        break;
                    case 37:
                        pz2Var.j();
                        pz2Var.p();
                        break;
                    case 38:
                        pz2Var.l();
                        pz2Var.p();
                        break;
                    case 39:
                        pz2Var.o();
                        pz2Var.p();
                        break;
                    case 40:
                        pz2Var.n();
                        pz2Var.p();
                        break;
                    case 41:
                        pz2Var.e.a = null;
                        if (pz2Var.g.i.length() > 0) {
                            if (pz2Var.f()) {
                                pz2Var.o();
                            } else {
                                pz2Var.n();
                            }
                        }
                        pz2Var.p();
                        break;
                    case 42:
                        pz2Var.e.a = null;
                        if (pz2Var.g.i.length() > 0) {
                            if (pz2Var.f()) {
                                pz2Var.n();
                            } else {
                                pz2Var.o();
                            }
                        }
                        pz2Var.p();
                        break;
                    case 43:
                        pz2Var.e.a = null;
                        if (pz2Var.g.i.length() > 0) {
                            long j10 = pz2Var.f;
                            int i17 = f13.c;
                            int i18 = (int) (j10 & 4294967295L);
                            pz2Var.q(i18, i18);
                        }
                        break;
                    case 44:
                        if (mz2Var.e) {
                            y62Var2.h = mz2Var.a.x.i.r.z(mz2Var.l);
                        } else {
                            mz2Var.a(eu.O(new ev("\n", 1)));
                        }
                        break;
                    case 45:
                        if (mz2Var.e) {
                            y62Var2.h = false;
                        } else {
                            mz2Var.a(eu.O(new ev("\t", 1)));
                        }
                        break;
                    case 46:
                        w73 w73Var = mz2Var.h;
                        if (w73Var != null) {
                            w73Var.a(k03.a(pz2Var.h, pz2Var.g, pz2Var.f, 4));
                        }
                        w73 w73Var2 = mz2Var.h;
                        if (w73Var2 != null) {
                            dq1 dq1Var2 = w73Var2.a;
                            if (dq1Var2 != null && (dq1Var = (dq1) dq1Var2.i) != null) {
                                w73Var2.a = dq1Var;
                                w73Var2.c -= ((k03) dq1Var2.j).a.i.length();
                                w73Var2.b = new dq1(i16, w73Var2.b, (k03) dq1Var2.j);
                                r8 = (k03) dq1Var.j;
                            }
                            if (r8 != 0) {
                                mz2Var.k.j(r8);
                            }
                        }
                        break;
                    case 47:
                        w73 w73Var3 = mz2Var.h;
                        if (w73Var3 != null) {
                            dq1 dq1Var3 = w73Var3.b;
                            if (dq1Var3 != null) {
                                w73Var3.b = (dq1) dq1Var3.i;
                                k03 k03Var3 = (k03) dq1Var3.j;
                                w73Var3.a = new dq1(i16, w73Var3.a, k03Var3);
                                w73Var3.c = k03Var3.a.i.length() + w73Var3.c;
                                k03Var = (k03) dq1Var3.j;
                            }
                            if (k03Var != null) {
                                mz2Var.k.j(k03Var);
                            }
                        }
                        break;
                    default:
                        c80.s();
                        return null;
                }
                return a83Var;
            default:
                final b03 b03Var2 = (b03) obj4;
                j20 j20Var = (j20) obj3;
                Context context2 = (Context) obj2;
                oy2 oy2Var = (oy2) obj;
                lk1 lk1Var = oy2Var.a;
                lk1 lk1Var2 = oy2Var.a;
                bz2 bz2Var = bz2.b;
                lk1Var.a(bz2Var);
                yy2[] yy2VarArr = yy2.i;
                boolean z3 = (f13.c(b03Var2.n().b) || !b03Var2.j() || (b03Var2.f instanceof tx1) || b03Var2.h == null) ? false : true;
                e03 e03Var = new e03(i6, j20Var, new wz2(b03Var2, r8, i5));
                Resources resources = context2.getResources();
                int i19 = 8;
                z zVar = new z(e03Var, r8, i19);
                if (z3) {
                    lk1Var2.a(new xy2(tp0.m, resources.getString(R.string.cut), R.attr.actionModeCutDrawable, zVar));
                }
                yy2[] yy2VarArr2 = yy2.i;
                boolean z4 = (f13.c(b03Var2.n().b) || (b03Var2.f instanceof tx1) || b03Var2.h == null) ? false : true;
                e03 e03Var2 = new e03(i6, j20Var, new wz2(b03Var2, r8, i4));
                Resources resources2 = context2.getResources();
                z zVar2 = new z(e03Var2, r8, i19);
                if (z4) {
                    lk1Var2.a(new xy2(tp0.n, resources2.getString(R.string.copy), R.attr.actionModeCopyDrawable, zVar2));
                }
                yy2[] yy2VarArr3 = yy2.i;
                boolean z5 = b03Var2.j() && ((Boolean) b03Var2.x.getValue()).booleanValue() && b03Var2.h != null;
                e03 e03Var3 = new e03(i6, j20Var, new wz2(b03Var2, r8, i3));
                Resources resources3 = context2.getResources();
                z zVar3 = new z(e03Var3, r8, i19);
                if (z5) {
                    lk1Var2.a(new xy2(tp0.o, resources3.getString(R.string.paste), R.attr.actionModePasteDrawable, zVar3));
                }
                yy2[] yy2VarArr4 = yy2.i;
                boolean z6 = f13.d(b03Var2.n().b) != b03Var2.n().a.i.length();
                xm0 xm0Var = new xm0() { // from class: g03
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // defpackage.xm0
                    public final Object a() {
                        int i20 = i6;
                        a83 a83Var2 = a83.a;
                        b03 b03Var3 = b03Var2;
                        switch (i20) {
                            case 0:
                                break;
                            case 1:
                                k03 k03VarE = b03.e(b03Var3.n().a, fg1.i(0, b03Var3.n().a.i.length()));
                                b03Var3.c.j(k03VarE);
                                long j11 = k03VarE.b;
                                b03Var3.w = new f13(j11);
                                b03Var3.u = k03.a(b03Var3.u, null, j11, 5);
                                b03Var3.h(true);
                                break;
                            default:
                                xm0 xm0Var2 = b03Var3.g;
                                if (xm0Var2 != null) {
                                    xm0Var2.a();
                                }
                                break;
                        }
                        return a83Var2;
                    }
                };
                final int i20 = 1;
                xm0 xm0Var2 = new xm0() { // from class: g03
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // defpackage.xm0
                    public final Object a() {
                        int i202 = i20;
                        a83 a83Var2 = a83.a;
                        b03 b03Var3 = b03Var2;
                        switch (i202) {
                            case 0:
                                break;
                            case 1:
                                k03 k03VarE = b03.e(b03Var3.n().a, fg1.i(0, b03Var3.n().a.i.length()));
                                b03Var3.c.j(k03VarE);
                                long j11 = k03VarE.b;
                                b03Var3.w = new f13(j11);
                                b03Var3.u = k03.a(b03Var3.u, null, j11, 5);
                                b03Var3.h(true);
                                break;
                            default:
                                xm0 xm0Var22 = b03Var3.g;
                                if (xm0Var22 != null) {
                                    xm0Var22.a();
                                }
                                break;
                        }
                        return a83Var2;
                    }
                };
                Resources resources4 = context2.getResources();
                z zVar4 = new z(xm0Var2, xm0Var, i19);
                if (z6) {
                    lk1Var2.a(new xy2(tp0.p, resources4.getString(R.string.selectAll), R.attr.actionModeSelectAllDrawable, zVar4));
                }
                yy2[] yy2VarArr5 = yy2.i;
                boolean z7 = b03Var2.j() && f13.c(b03Var2.n().b);
                xm0 xm0Var3 = new xm0() { // from class: g03
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // defpackage.xm0
                    public final Object a() {
                        int i202 = i4;
                        a83 a83Var2 = a83.a;
                        b03 b03Var3 = b03Var2;
                        switch (i202) {
                            case 0:
                                break;
                            case 1:
                                k03 k03VarE = b03.e(b03Var3.n().a, fg1.i(0, b03Var3.n().a.i.length()));
                                b03Var3.c.j(k03VarE);
                                long j11 = k03VarE.b;
                                b03Var3.w = new f13(j11);
                                b03Var3.u = k03.a(b03Var3.u, null, j11, 5);
                                b03Var3.h(true);
                                break;
                            default:
                                xm0 xm0Var22 = b03Var3.g;
                                if (xm0Var22 != null) {
                                    xm0Var22.a();
                                }
                                break;
                        }
                        return a83Var2;
                    }
                };
                Resources resources5 = context2.getResources();
                z zVar5 = new z(xm0Var3, r8, i19);
                if (z7) {
                    lk1Var2.a(new xy2(tp0.q, resources5.getString(R.string.autofill), 0, zVar5));
                }
                lk1Var2.a(bz2Var);
                return a83Var;
        }
    }

    public /* synthetic */ m0(g00 g00Var, p83 p83Var, k21 k21Var, gm2 gm2Var) {
        this.h = 4;
        this.j = g00Var;
        this.i = k21Var;
        this.k = gm2Var;
    }

    public /* synthetic */ m0(in0 in0Var, xk1 xk1Var, xk1 xk1Var2) {
        this.h = 2;
        this.k = in0Var;
        this.j = xk1Var;
        this.i = xk1Var2;
    }

    public /* synthetic */ m0(int i, Object obj, Object obj2, String str) {
        this.h = i;
        this.i = str;
        this.j = obj;
        this.k = obj2;
    }

    public /* synthetic */ m0(xk1 xk1Var, ArrayList arrayList, List list, boolean z) {
        this.h = 7;
        this.i = xk1Var;
        this.k = arrayList;
        this.j = list;
    }

    public /* synthetic */ m0(Object obj, Object obj2, Object obj3, int i) {
        this.h = i;
        this.j = obj;
        this.i = obj2;
        this.k = obj3;
    }
}
