package p000;

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
import nuke.module.wechat.p002ai.AIChatConfig;

/* JADX INFO: renamed from: m0 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0444m0 implements in0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f6415h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f6416i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f6417j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f6418k;

    public /* synthetic */ C0444m0(sz0 sz0Var, n10 n10Var, o72 o72Var) {
        this.f6415h = 12;
        this.f6417j = sz0Var;
        this.f6418k = n10Var;
        this.f6416i = o72Var;
    }

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
    @Override // p000.in0
    /* JADX INFO: renamed from: j */
    public final Object mo5j(Object obj) {
        String string;
        x03 x03Var;
        ?? r3;
        InterfaceC0627qp interfaceC0627qp;
        InterfaceC0627qp interfaceC0627qp2;
        boolean z;
        t91 t91Var;
        Integer numM4026e;
        Integer numM4025d;
        Integer numM4025d2;
        Integer numM4026e2;
        y03 y03Var;
        y03 y03Var2;
        z03 z03Var;
        z03 z03Var2;
        y03 y03Var3;
        y03 y03Var4;
        z03 z03Var3;
        z03 z03Var4;
        Integer numM4025d3;
        Integer numM4026e3;
        Integer numM4026e4;
        Integer numM4025d4;
        dq1 dq1Var;
        int i = this.f6415h;
        int i2 = 6;
        int i3 = 3;
        final int i4 = 2;
        ?? r8 = 0;
        k03 k03Var = null;
        r8 = 0;
        a83 a83Var = a83.f116a;
        Object obj2 = this.f6418k;
        Object obj3 = this.f6416i;
        Object obj4 = this.f6417j;
        int i5 = 1;
        final int i6 = 0;
        switch (i) {
            case 0:
                List list = (List) obj4;
                s81 s81Var = (s81) obj;
                s81Var.getClass();
                C0830w0 c0830w0 = C0830w0.f12238o;
                s81Var.m4761b(list.size(), new C0906y0(0, list), new C0906y0(list, 1, false), new C0402kw(802480018, true, new C0945z0(list, (String) obj3, (in0) obj2, false ? 1 : 0)));
                return a83Var;
            case 1:
                s81 s81Var2 = (s81) obj;
                s81Var2.getClass();
                int i7 = 0;
                s81.m4760a(s81Var2, "about_avatar", new C0402kw(-60439243, true, new C0868x1((String) obj3, i7)), 2);
                s81.m4760a(s81Var2, "about_project", new C0402kw(-919602388, true, new C0907y1(i7, (List) obj4)), 2);
                s81.m4760a(s81Var2, "about_thanks", new C0402kw(1219237485, true, new C0907y1(1, (List) obj2)), 2);
                return a83Var;
            case 2:
                in0 in0Var = (in0) obj2;
                xk1 xk1Var = (xk1) obj3;
                k03 k03Var2 = (k03) obj;
                ((xk1) obj4).setValue(k03Var2);
                boolean zM5086l = t11.m5086l((String) xk1Var.getValue(), k03Var2.f5296a.f10051i);
                C0690sd c0690sd = k03Var2.f5296a;
                xk1Var.setValue(c0690sd.f10051i);
                if (!zM5086l) {
                    in0Var.mo5j(c0690sd.f10051i);
                }
                return a83Var;
            case 3:
                oo2 oo2Var = (oo2) obj;
                oo2Var.getClass();
                C0360jr.f5173k.put((String) obj3, Long.valueOf(System.currentTimeMillis()));
                C0360jr.f5166d.getClass();
                String str = C0360jr.f5170h;
                String str2 = ((C0971zq) obj4).f14023b;
                String str3 = ((by0) obj2).f1074a;
                if (oo2Var instanceof mo2) {
                    string = vi0.m5690i("type=text, content=", ((mo2) oo2Var).f6738b);
                } else if (oo2Var instanceof ko2) {
                    ko2 ko2Var = (ko2) oo2Var;
                    string = "type=image, path=" + ko2Var.f5695b + ", taskClass=" + ko2Var.f5696c;
                } else {
                    if (!(oo2Var instanceof no2)) {
                        c80.m675s();
                        return null;
                    }
                    no2 no2Var = (no2) oo2Var;
                    String str4 = no2Var.f7274c;
                    String str5 = no2Var.f7275d;
                    int i8 = no2Var.f7276e;
                    StringBuilder sbM5696o = vi0.m5696o("type=voice, source=", str4, ", target=", str5, ", durationMs=");
                    sbM5696o.append(i8);
                    string = sbM5696o.toString();
                }
                StringBuilder sbM5696o2 = vi0.m5696o("Auto reply sent: task=", str2, ", talker=", str3, ", ");
                sbM5696o2.append(string);
                hg3.m2168f(str, sbM5696o2.toString());
                return a83Var;
            case 4:
                g00 g00Var = (g00) obj4;
                k21 k21Var = (k21) obj3;
                gm2 gm2Var = (gm2) obj2;
                float fFloatValue = ((Float) obj).floatValue();
                float f = g00Var.f3215x ? 1.0f : -1.0f;
                im2 im2Var = g00Var.f3214w;
                long jM2368e = im2Var.m2368e(im2Var.m2371h(f * fFloatValue));
                im2 im2Var2 = gm2Var.f3582a;
                float fM2370g = im2Var.m2370g(im2Var.m2368e(im2Var2.m2366c(im2Var2.f4697k, jM2368e, 1))) * f;
                if (Math.abs(fM2370g) < Math.abs(fFloatValue)) {
                    CancellationException cancellationException = new CancellationException("Scroll animation cancelled because scroll was not consumed (" + fM2370g + " < " + fFloatValue + ')');
                    cancellationException.initCause(null);
                    k21Var.mo1704c(cancellationException);
                }
                return a83Var;
            case 5:
                C0700sn c0700sn = C0700sn.f10217U;
                t91 t91Var2 = (t91) obj4;
                long j = ((k03) obj3).f5297b;
                us1 us1Var = (us1) obj2;
                nc0 nc0Var = (nc0) obj;
                z03 z03VarM5146d = t91Var2.m5146d();
                if (z03VarM5146d != null) {
                    InterfaceC0627qp interfaceC0627qpM430q = nc0Var.mo3274E().m430q();
                    long j2 = ((f13) t91Var2.f10620A.getValue()).f2739a;
                    long j3 = ((f13) t91Var2.f10621B.getValue()).f2739a;
                    y03 y03Var5 = z03VarM5146d.f13697a;
                    x03 x03Var2 = y03Var5.f13266a;
                    lj1 lj1Var = y03Var5.f13267b;
                    C0611q9 c0611q9 = t91Var2.f10646y;
                    long j4 = t91Var2.f10647z;
                    if (!f13.m1494c(j2)) {
                        c0611q9.m4095k(j4);
                        int iMo2451p = us1Var.mo2451p(f13.m1497f(j2));
                        int iMo2451p2 = us1Var.mo2451p(f13.m1496e(j2));
                        if (iMo2451p != iMo2451p2) {
                            interfaceC0627qpM430q.mo1519h(y03Var5.m6208h(iMo2451p, iMo2451p2), c0611q9);
                        }
                        x03Var = x03Var2;
                    } else if (f13.m1494c(j3)) {
                        x03Var = x03Var2;
                        if (!f13.m1494c(j)) {
                            c0611q9.m4095k(j4);
                            int iMo2451p3 = us1Var.mo2451p(f13.m1497f(j));
                            int iMo2451p4 = us1Var.mo2451p(f13.m1496e(j));
                            if (iMo2451p3 != iMo2451p4) {
                                interfaceC0627qpM430q.mo1519h(y03Var5.m6208h(iMo2451p3, iMo2451p4), c0611q9);
                            }
                        }
                    } else {
                        x03Var = x03Var2;
                        long jM3025b = x03Var.f12755b.m3025b();
                        C0363ju c0363ju = new C0363ju(jM3025b);
                        if (jM3025b == 16) {
                            c0363ju = null;
                        }
                        long j5 = c0363ju != null ? c0363ju.f5219a : C0363ju.f5212b;
                        c0611q9.m4095k(C0363ju.m2565b(C0363ju.m2567d(j5) * 0.2f, j5));
                        int iMo2451p5 = us1Var.mo2451p(f13.m1497f(j3));
                        int iMo2451p6 = us1Var.mo2451p(f13.m1496e(j3));
                        if (iMo2451p5 != iMo2451p6) {
                            interfaceC0627qpM430q.mo1519h(y03Var5.m6208h(iMo2451p5, iMo2451p6), c0611q9);
                        }
                    }
                    long j6 = y03Var5.f13268c;
                    boolean z2 = ((((float) ((int) (j6 >> 32))) > lj1Var.f6149d ? 1 : (((float) ((int) (j6 >> 32))) == lj1Var.f6149d ? 0 : -1)) < 0 || lj1Var.f6148c || (((float) ((int) (j6 & 4294967295L))) > lj1Var.f6150e ? 1 : (((float) ((int) (j6 & 4294967295L))) == lj1Var.f6150e ? 0 : -1)) < 0) && x03Var.f12759f != 3;
                    if (z2) {
                        o62 o62VarM1467q = AbstractC0179eu.m1467q(0L, (((long) Float.floatToRawIntBits((int) (j6 & 4294967295L))) & 4294967295L) | (((long) Float.floatToRawIntBits((int) (j6 >> 32))) << 32));
                        interfaceC0627qpM430q.mo1522l();
                        InterfaceC0627qp.m4219k(interfaceC0627qpM430q, o62VarM1467q);
                    }
                    lt2 lt2Var = x03Var.f12755b.f6435a;
                    gz2 gz2Var = lt2Var.f6313m;
                    l03 l03Var = lt2Var.f6301a;
                    if (gz2Var == null) {
                        gz2Var = gz2.f3746b;
                    }
                    gz2 gz2Var2 = gz2Var;
                    bq2 bq2Var = lt2Var.f6314n;
                    if (bq2Var == null) {
                        bq2Var = bq2.f985d;
                    }
                    bq2 bq2Var2 = bq2Var;
                    op0 op0Var = lt2Var.f6315o;
                    if (op0Var == null) {
                        op0Var = xi0.f13041h;
                    }
                    op0 op0Var2 = op0Var;
                    try {
                        AbstractC0024an abstractC0024anMo865k = l03Var.mo865k();
                        try {
                            if (abstractC0024anMo865k == null) {
                                InterfaceC0627qp interfaceC0627qp3 = interfaceC0627qpM430q;
                                long jMo864b = l03Var != c0700sn ? l03Var.mo864b() : C0363ju.f5212b;
                                interfaceC0627qp3.mo1522l();
                                ArrayList arrayList = lj1Var.f6153h;
                                int size = arrayList.size();
                                int i9 = 0;
                                InterfaceC0627qp interfaceC0627qp4 = interfaceC0627qp3;
                                while (i9 < size) {
                                    rw1 rw1Var = (rw1) arrayList.get(i9);
                                    rw1Var.f9775a.m5140f(interfaceC0627qp4, jMo864b, bq2Var2, gz2Var2, op0Var2);
                                    interfaceC0627qp = interfaceC0627qp4;
                                    try {
                                        interfaceC0627qp.mo1518g(0.0f, rw1Var.f9775a.m5136b());
                                        i9++;
                                        interfaceC0627qp4 = interfaceC0627qp;
                                    } catch (Throwable th) {
                                        th = th;
                                        r3 = interfaceC0627qp;
                                        if (z2) {
                                            r3.mo1520i();
                                        }
                                        throw th;
                                    }
                                }
                                interfaceC0627qp = interfaceC0627qp4;
                                interfaceC0627qp.mo1520i();
                                interfaceC0627qp2 = interfaceC0627qp;
                            } else {
                                lj1.m2913i(lj1Var, interfaceC0627qpM430q, abstractC0024anMo865k, l03Var != c0700sn ? l03Var.mo863a() : 1.0f, bq2Var2, gz2Var2, op0Var2);
                                interfaceC0627qp2 = interfaceC0627qpM430q;
                            }
                            if (z2) {
                                interfaceC0627qp2.mo1520i();
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            r3 = 4294967295;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        r3 = interfaceC0627qpM430q;
                    }
                    break;
                }
                return a83Var;
            case AIChatConfig.DefaultContextRounds /* 6 */:
                int i10 = 0;
                Context context = (Context) obj3;
                cz2 cz2Var = (cz2) obj2;
                n00 n00Var = (n00) obj;
                List list2 = ((qy2) obj4).f9290a;
                int size2 = list2.size();
                int i11 = 0;
                while (i11 < size2) {
                    py2 py2Var = (py2) list2.get(i11);
                    if (py2Var instanceof xy2) {
                        xy2 xy2Var = (xy2) py2Var;
                        n00.m3223b(n00Var, new C0686s9(i2, xy2Var), xy2Var.f13238c == 0 ? null : new C0402kw(-1930700965, true, new j60(i10, xy2Var)), new C0640r1(14, xy2Var, cz2Var), 6);
                    } else if (py2Var instanceof dz2) {
                        if (Build.VERSION.SDK_INT >= 28) {
                            dz2 dz2Var = (dz2) py2Var;
                            if (context != null) {
                                int i12 = dz2Var.f2272c;
                                TextClassification textClassification = dz2Var.f2271b;
                                if (i12 < 0) {
                                    C0686s9 c0686s9 = new C0686s9(22, textClassification);
                                    Drawable icon = textClassification.getIcon();
                                    n00.m3223b(n00Var, c0686s9, icon != null ? new C0402kw(-1123224187, true, new j60(1, icon)) : null, new C0640r1(29, context, textClassification), 6);
                                } else {
                                    RemoteAction remoteAction = (RemoteAction) textClassification.getActions().get(i12);
                                    n00.m3223b(n00Var, new C0686s9(23, remoteAction), ((i12 == 0) || remoteAction.shouldShowIcon()) ? new C0402kw(-1261173016, true, new j60(i4, remoteAction)) : null, new C0727ta(27, remoteAction), 6);
                                }
                            }
                        }
                    } else if (py2Var instanceof bz2) {
                        n00Var.f6948a.add(qp0.f9068j);
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
                rz1Var.f9833h = true;
                int size3 = arrayList2.size();
                for (int i13 = 0; i13 < size3; i13++) {
                    ((y81) arrayList2.get(i13)).m6226b(rz1Var);
                }
                int size4 = list3.size();
                for (int i14 = 0; i14 < size4; i14++) {
                    ((y81) list3.get(i14)).m6226b(rz1Var);
                }
                rz1Var.f9833h = false;
                xk1Var2.getValue();
                return a83Var;
            case 8:
                ia1 ia1Var = (ia1) obj4;
                final pa1 pa1Var = (pa1) obj3;
                final in0 in0Var2 = (in0) obj2;
                final o72 o72Var = new o72();
                fa1 fa1Var = new fa1() { // from class: ca1
                    @Override // p000.fa1
                    /* JADX INFO: renamed from: g */
                    public final void mo533g(ia1 ia1Var2, z91 z91Var) {
                        int i15 = ea1.f2373a[z91Var.ordinal()];
                        o72 o72Var2 = o72Var;
                        if (i15 == 1) {
                            o72Var2.f7574i = in0Var2.mo5j(pa1Var);
                        } else {
                            if (i15 != 2) {
                                return;
                            }
                            C0389kj c0389kj = (C0389kj) o72Var2.f7574i;
                            if (c0389kj != null) {
                                c0389kj.m2692a();
                            }
                            o72Var2.f7574i = null;
                        }
                    }
                };
                ia1Var.getLifecycle().mo505a(fa1Var);
                return new da1(ia1Var, fa1Var, o72Var, i6);
            case 9:
                ca2 ca2Var = (ca2) obj;
                ca2Var.getClass();
                ca2Var.m719c(((Number) ((gu2) obj4).getValue()).floatValue());
                ca2Var.m726k(((Number) ((gu2) obj3).getValue()).floatValue());
                ca2Var.m727l(((Number) ((gu2) obj2).getValue()).floatValue());
                ca2Var.m731r(rb3.m4426a(0.5f, 0.5f));
                return a83Var;
            case 10:
                dc2 dc2Var = (dc2) obj4;
                ic2 ic2Var = (ic2) obj2;
                rk1 rk1Var = dc2Var.f1986i;
                if (rk1Var.m4500b(obj3)) {
                    c80.m670n("Key ", obj3, " was used multiple times ");
                    return null;
                }
                dc2Var.f1985h.remove(obj3);
                rk1Var.m4511m(obj3, ic2Var);
                return new da1(dc2Var, obj3, ic2Var, 1);
            case 11:
                er2 er2Var = (er2) obj4;
                vm2 vm2Var = (vm2) obj3;
                y62 y62Var = (y62) obj2;
                o12 o12Var = (o12) obj;
                long j7 = o12Var.f7422c;
                b03 b03Var = (b03) er2Var.f2578k;
                if (!b03Var.m347k() || b03Var.m350n().f5296a.f10051i.length() == 0 || (t91Var = b03Var.f483d) == null || t91Var.m5146d() == null) {
                    z = false;
                } else {
                    er2Var.m1415e(b03Var.m350n(), j7, false, vm2Var);
                    z = true;
                }
                if (z) {
                    o12Var.m3463a();
                    y62Var.f13324h = true;
                }
                return a83Var;
            case 12:
                in0 in0Var3 = (in0) obj2;
                t03 t03Var = (t03) ((o72) obj3).f7574i;
                k03 k03VarM5042q = ((sz0) obj4).m5042q((List) obj);
                if (t03Var != null) {
                    t03Var.m5048a(null, k03VarM5042q);
                }
                in0Var3.mo5j(k03VarM5042q);
                return a83Var;
            case 13:
                mz2 mz2Var = (mz2) obj3;
                y62 y62Var2 = (y62) obj2;
                pz2 pz2Var = (pz2) obj;
                int i15 = 4;
                int i16 = 18;
                switch (((c51) obj4).ordinal()) {
                    case 0:
                        pz2Var.f8653e.f2295a = null;
                        if (pz2Var.f8655g.f10051i.length() > 0) {
                            if (f13.m1494c(pz2Var.f8654f)) {
                                pz2Var.m4030i();
                            } else {
                                boolean zM4027f = pz2Var.m4027f();
                                long j8 = pz2Var.f8654f;
                                if (zM4027f) {
                                    int iM1497f = f13.m1497f(j8);
                                    pz2Var.m4038q(iM1497f, iM1497f);
                                } else {
                                    int iM1496e = f13.m1496e(j8);
                                    pz2Var.m4038q(iM1496e, iM1496e);
                                }
                            }
                        }
                        break;
                    case 1:
                        pz2Var.f8653e.f2295a = null;
                        if (pz2Var.f8655g.f10051i.length() > 0) {
                            if (f13.m1494c(pz2Var.f8654f)) {
                                pz2Var.m4034m();
                            } else {
                                boolean zM4027f2 = pz2Var.m4027f();
                                long j9 = pz2Var.f8654f;
                                if (zM4027f2) {
                                    int iM1496e2 = f13.m1496e(j9);
                                    pz2Var.m4038q(iM1496e2, iM1496e2);
                                } else {
                                    int iM1497f2 = f13.m1497f(j9);
                                    pz2Var.m4038q(iM1497f2, iM1497f2);
                                }
                            }
                        }
                        break;
                    case 2:
                        e13 e13Var = pz2Var.f8653e;
                        e13Var.f2295a = null;
                        C0690sd c0690sd2 = pz2Var.f8655g;
                        String str6 = c0690sd2.f10051i;
                        String str7 = c0690sd2.f10051i;
                        if (str6.length() > 0) {
                            if (pz2Var.m4027f()) {
                                e13Var.f2295a = null;
                                if (str7.length() > 0 && (numM4025d = pz2Var.m4025d()) != null) {
                                    int iIntValue = numM4025d.intValue();
                                    pz2Var.m4038q(iIntValue, iIntValue);
                                }
                            } else {
                                e13Var.f2295a = null;
                                if (str7.length() > 0 && (numM4026e = pz2Var.m4026e()) != null) {
                                    int iIntValue2 = numM4026e.intValue();
                                    pz2Var.m4038q(iIntValue2, iIntValue2);
                                }
                            }
                        }
                        break;
                    case 3:
                        e13 e13Var2 = pz2Var.f8653e;
                        e13Var2.f2295a = null;
                        C0690sd c0690sd3 = pz2Var.f8655g;
                        String str8 = c0690sd3.f10051i;
                        String str9 = c0690sd3.f10051i;
                        if (str8.length() > 0) {
                            if (pz2Var.m4027f()) {
                                e13Var2.f2295a = null;
                                if (str9.length() > 0 && (numM4026e2 = pz2Var.m4026e()) != null) {
                                    int iIntValue3 = numM4026e2.intValue();
                                    pz2Var.m4038q(iIntValue3, iIntValue3);
                                }
                            } else {
                                e13Var2.f2295a = null;
                                if (str9.length() > 0 && (numM4025d2 = pz2Var.m4025d()) != null) {
                                    int iIntValue4 = numM4025d2.intValue();
                                    pz2Var.m4038q(iIntValue4, iIntValue4);
                                }
                            }
                        }
                        break;
                    case 4:
                        pz2Var.m4031j();
                        break;
                    case 5:
                        pz2Var.m4033l();
                        break;
                    case AIChatConfig.DefaultContextRounds /* 6 */:
                        pz2Var.m4036o();
                        break;
                    case 7:
                        pz2Var.m4035n();
                        break;
                    case 8:
                        pz2Var.f8653e.f2295a = null;
                        if (pz2Var.f8655g.f10051i.length() > 0) {
                            if (pz2Var.m4027f()) {
                                pz2Var.m4036o();
                            } else {
                                pz2Var.m4035n();
                            }
                        }
                        break;
                    case 9:
                        pz2Var.f8653e.f2295a = null;
                        if (pz2Var.f8655g.f10051i.length() > 0) {
                            if (pz2Var.m4027f()) {
                                pz2Var.m4035n();
                            } else {
                                pz2Var.m4036o();
                            }
                        }
                        break;
                    case 10:
                        if (pz2Var.f8655g.f10051i.length() > 0 && (y03Var = pz2Var.f8651c) != null) {
                            int iM4028g = pz2Var.m4028g(y03Var, -1);
                            pz2Var.m4038q(iM4028g, iM4028g);
                        }
                        break;
                    case 11:
                        if (pz2Var.f8655g.f10051i.length() > 0 && (y03Var2 = pz2Var.f8651c) != null) {
                            int iM4028g2 = pz2Var.m4028g(y03Var2, 1);
                            pz2Var.m4038q(iM4028g2, iM4028g2);
                        }
                        break;
                    case 12:
                    case 48:
                        break;
                    case 13:
                        if (pz2Var.f8655g.f10051i.length() > 0 && (z03Var = pz2Var.f8657i) != null) {
                            int iM4029h = pz2Var.m4029h(z03Var, -1);
                            pz2Var.m4038q(iM4029h, iM4029h);
                        }
                        break;
                    case 14:
                        if (pz2Var.f8655g.f10051i.length() > 0 && (z03Var2 = pz2Var.f8657i) != null) {
                            int iM4029h2 = pz2Var.m4029h(z03Var2, 1);
                            pz2Var.m4038q(iM4029h2, iM4029h2);
                        }
                        break;
                    case 15:
                        pz2Var.f8653e.f2295a = null;
                        if (pz2Var.f8655g.f10051i.length() > 0) {
                            pz2Var.m4038q(0, 0);
                        }
                        break;
                    case 16:
                        pz2Var.f8653e.f2295a = null;
                        C0690sd c0690sd4 = pz2Var.f8655g;
                        if (c0690sd4.f10051i.length() > 0) {
                            int length = c0690sd4.f10051i.length();
                            pz2Var.m4038q(length, length);
                        }
                        break;
                    case 17:
                        mz2Var.f6935b.m341d(false);
                        break;
                    case 18:
                        mz2Var.f6935b.m352p();
                        break;
                    case 19:
                        mz2Var.f6935b.m342f();
                        break;
                    case AIChatConfig.MaxContextRounds /* 20 */:
                        List listM4022a = pz2Var.m4022a(new kx2(1));
                        if (listM4022a != null) {
                            mz2Var.m3222a(listM4022a);
                        }
                        break;
                    case 21:
                        List listM4022a2 = pz2Var.m4022a(new kx2(i4));
                        if (listM4022a2 != null) {
                            mz2Var.m3222a(listM4022a2);
                        }
                        break;
                    case 22:
                        List listM4022a3 = pz2Var.m4022a(new kx2(i3));
                        if (listM4022a3 != null) {
                            mz2Var.m3222a(listM4022a3);
                        }
                        break;
                    case 23:
                        List listM4022a4 = pz2Var.m4022a(new kx2(i15));
                        if (listM4022a4 != null) {
                            mz2Var.m3222a(listM4022a4);
                        }
                        break;
                    case 24:
                        List listM4022a5 = pz2Var.m4022a(new kx2(5));
                        if (listM4022a5 != null) {
                            mz2Var.m3222a(listM4022a5);
                        }
                        break;
                    case 25:
                        List listM4022a6 = pz2Var.m4022a(new kx2(i2));
                        if (listM4022a6 != null) {
                            mz2Var.m3222a(listM4022a6);
                        }
                        break;
                    case 26:
                        pz2Var.f8653e.f2295a = null;
                        C0690sd c0690sd5 = pz2Var.f8655g;
                        if (c0690sd5.f10051i.length() > 0) {
                            pz2Var.m4038q(0, c0690sd5.f10051i.length());
                        }
                        break;
                    case 27:
                        pz2Var.m4030i();
                        pz2Var.m4037p();
                        break;
                    case 28:
                        pz2Var.m4034m();
                        pz2Var.m4037p();
                        break;
                    case 29:
                        if (pz2Var.f8655g.f10051i.length() > 0 && (y03Var3 = pz2Var.f8651c) != null) {
                            int iM4028g3 = pz2Var.m4028g(y03Var3, -1);
                            pz2Var.m4038q(iM4028g3, iM4028g3);
                        }
                        pz2Var.m4037p();
                        break;
                    case 30:
                        if (pz2Var.f8655g.f10051i.length() > 0 && (y03Var4 = pz2Var.f8651c) != null) {
                            int iM4028g4 = pz2Var.m4028g(y03Var4, 1);
                            pz2Var.m4038q(iM4028g4, iM4028g4);
                        }
                        pz2Var.m4037p();
                        break;
                    case 31:
                        if (pz2Var.f8655g.f10051i.length() > 0 && (z03Var3 = pz2Var.f8657i) != null) {
                            int iM4029h3 = pz2Var.m4029h(z03Var3, -1);
                            pz2Var.m4038q(iM4029h3, iM4029h3);
                        }
                        pz2Var.m4037p();
                        break;
                    case 32:
                        if (pz2Var.f8655g.f10051i.length() > 0 && (z03Var4 = pz2Var.f8657i) != null) {
                            int iM4029h4 = pz2Var.m4029h(z03Var4, 1);
                            pz2Var.m4038q(iM4029h4, iM4029h4);
                        }
                        pz2Var.m4037p();
                        break;
                    case 33:
                        pz2Var.f8653e.f2295a = null;
                        if (pz2Var.f8655g.f10051i.length() > 0) {
                            pz2Var.m4038q(0, 0);
                        }
                        pz2Var.m4037p();
                        break;
                    case 34:
                        pz2Var.f8653e.f2295a = null;
                        C0690sd c0690sd6 = pz2Var.f8655g;
                        if (c0690sd6.f10051i.length() > 0) {
                            int length2 = c0690sd6.f10051i.length();
                            pz2Var.m4038q(length2, length2);
                        }
                        pz2Var.m4037p();
                        break;
                    case 35:
                        e13 e13Var3 = pz2Var.f8653e;
                        e13Var3.f2295a = null;
                        C0690sd c0690sd7 = pz2Var.f8655g;
                        String str10 = c0690sd7.f10051i;
                        String str11 = c0690sd7.f10051i;
                        if (str10.length() > 0) {
                            if (pz2Var.m4027f()) {
                                e13Var3.f2295a = null;
                                if (str11.length() > 0 && (numM4026e3 = pz2Var.m4026e()) != null) {
                                    int iIntValue5 = numM4026e3.intValue();
                                    pz2Var.m4038q(iIntValue5, iIntValue5);
                                }
                            } else {
                                e13Var3.f2295a = null;
                                if (str11.length() > 0 && (numM4025d3 = pz2Var.m4025d()) != null) {
                                    int iIntValue6 = numM4025d3.intValue();
                                    pz2Var.m4038q(iIntValue6, iIntValue6);
                                }
                            }
                        }
                        pz2Var.m4037p();
                        break;
                    case 36:
                        e13 e13Var4 = pz2Var.f8653e;
                        e13Var4.f2295a = null;
                        C0690sd c0690sd8 = pz2Var.f8655g;
                        String str12 = c0690sd8.f10051i;
                        String str13 = c0690sd8.f10051i;
                        if (str12.length() > 0) {
                            if (pz2Var.m4027f()) {
                                e13Var4.f2295a = null;
                                if (str13.length() > 0 && (numM4025d4 = pz2Var.m4025d()) != null) {
                                    int iIntValue7 = numM4025d4.intValue();
                                    pz2Var.m4038q(iIntValue7, iIntValue7);
                                }
                            } else {
                                e13Var4.f2295a = null;
                                if (str13.length() > 0 && (numM4026e4 = pz2Var.m4026e()) != null) {
                                    int iIntValue8 = numM4026e4.intValue();
                                    pz2Var.m4038q(iIntValue8, iIntValue8);
                                }
                            }
                        }
                        pz2Var.m4037p();
                        break;
                    case 37:
                        pz2Var.m4031j();
                        pz2Var.m4037p();
                        break;
                    case 38:
                        pz2Var.m4033l();
                        pz2Var.m4037p();
                        break;
                    case 39:
                        pz2Var.m4036o();
                        pz2Var.m4037p();
                        break;
                    case 40:
                        pz2Var.m4035n();
                        pz2Var.m4037p();
                        break;
                    case 41:
                        pz2Var.f8653e.f2295a = null;
                        if (pz2Var.f8655g.f10051i.length() > 0) {
                            if (pz2Var.m4027f()) {
                                pz2Var.m4036o();
                            } else {
                                pz2Var.m4035n();
                            }
                        }
                        pz2Var.m4037p();
                        break;
                    case 42:
                        pz2Var.f8653e.f2295a = null;
                        if (pz2Var.f8655g.f10051i.length() > 0) {
                            if (pz2Var.m4027f()) {
                                pz2Var.m4035n();
                            } else {
                                pz2Var.m4036o();
                            }
                        }
                        pz2Var.m4037p();
                        break;
                    case 43:
                        pz2Var.f8653e.f2295a = null;
                        if (pz2Var.f8655g.f10051i.length() > 0) {
                            long j10 = pz2Var.f8654f;
                            int i17 = f13.f2738c;
                            int i18 = (int) (j10 & 4294967295L);
                            pz2Var.m4038q(i18, i18);
                        }
                        break;
                    case 44:
                        if (mz2Var.f6938e) {
                            y62Var2.f13324h = mz2Var.f6934a.f10645x.f6964i.f10639r.m438z(mz2Var.f6945l);
                        } else {
                            mz2Var.m3222a(AbstractC0179eu.m1434O(new C0180ev("\n", 1)));
                        }
                        break;
                    case 45:
                        if (mz2Var.f6938e) {
                            y62Var2.f13324h = false;
                        } else {
                            mz2Var.m3222a(AbstractC0179eu.m1434O(new C0180ev("\t", 1)));
                        }
                        break;
                    case 46:
                        w73 w73Var = mz2Var.f6941h;
                        if (w73Var != null) {
                            w73Var.m5860a(k03.m2598a(pz2Var.f8656h, pz2Var.f8655g, pz2Var.f8654f, 4));
                        }
                        w73 w73Var2 = mz2Var.f6941h;
                        if (w73Var2 != null) {
                            dq1 dq1Var2 = w73Var2.f12386a;
                            if (dq1Var2 != null && (dq1Var = (dq1) dq1Var2.f2147i) != null) {
                                w73Var2.f12386a = dq1Var;
                                w73Var2.f12388c -= ((k03) dq1Var2.f2148j).f5296a.f10051i.length();
                                w73Var2.f12387b = new dq1(i16, w73Var2.f12387b, (k03) dq1Var2.f2148j);
                                r8 = (k03) dq1Var.f2148j;
                            }
                            if (r8 != 0) {
                                mz2Var.f6944k.mo5j(r8);
                            }
                        }
                        break;
                    case 47:
                        w73 w73Var3 = mz2Var.f6941h;
                        if (w73Var3 != null) {
                            dq1 dq1Var3 = w73Var3.f12387b;
                            if (dq1Var3 != null) {
                                w73Var3.f12387b = (dq1) dq1Var3.f2147i;
                                k03 k03Var3 = (k03) dq1Var3.f2148j;
                                w73Var3.f12386a = new dq1(i16, w73Var3.f12386a, k03Var3);
                                w73Var3.f12388c = k03Var3.f5296a.f10051i.length() + w73Var3.f12388c;
                                k03Var = (k03) dq1Var3.f2148j;
                            }
                            if (k03Var != null) {
                                mz2Var.f6944k.mo5j(k03Var);
                            }
                        }
                        break;
                    default:
                        c80.m675s();
                        return null;
                }
                return a83Var;
            default:
                final b03 b03Var2 = (b03) obj4;
                j20 j20Var = (j20) obj3;
                Context context2 = (Context) obj2;
                oy2 oy2Var = (oy2) obj;
                lk1 lk1Var = oy2Var.f7885a;
                lk1 lk1Var2 = oy2Var.f7885a;
                bz2 bz2Var = bz2.f1088b;
                lk1Var.m2925a(bz2Var);
                yy2[] yy2VarArr = yy2.f13675i;
                boolean z3 = (f13.m1494c(b03Var2.m350n().f5297b) || !b03Var2.m346j() || (b03Var2.f485f instanceof tx1) || b03Var2.f487h == null) ? false : true;
                e03 e03Var = new e03(i6, j20Var, new wz2(b03Var2, r8, i5));
                Resources resources = context2.getResources();
                int i19 = 8;
                C0944z c0944z = new C0944z(e03Var, r8, i19);
                if (z3) {
                    lk1Var2.m2925a(new xy2(tp0.f10886m, resources.getString(R.string.cut), R.attr.actionModeCutDrawable, c0944z));
                }
                yy2[] yy2VarArr2 = yy2.f13675i;
                boolean z4 = (f13.m1494c(b03Var2.m350n().f5297b) || (b03Var2.f485f instanceof tx1) || b03Var2.f487h == null) ? false : true;
                e03 e03Var2 = new e03(i6, j20Var, new wz2(b03Var2, r8, i4));
                Resources resources2 = context2.getResources();
                C0944z c0944z2 = new C0944z(e03Var2, r8, i19);
                if (z4) {
                    lk1Var2.m2925a(new xy2(tp0.f10887n, resources2.getString(R.string.copy), R.attr.actionModeCopyDrawable, c0944z2));
                }
                yy2[] yy2VarArr3 = yy2.f13675i;
                boolean z5 = b03Var2.m346j() && ((Boolean) b03Var2.f503x.getValue()).booleanValue() && b03Var2.f487h != null;
                e03 e03Var3 = new e03(i6, j20Var, new wz2(b03Var2, r8, i3));
                Resources resources3 = context2.getResources();
                C0944z c0944z3 = new C0944z(e03Var3, r8, i19);
                if (z5) {
                    lk1Var2.m2925a(new xy2(tp0.f10888o, resources3.getString(R.string.paste), R.attr.actionModePasteDrawable, c0944z3));
                }
                yy2[] yy2VarArr4 = yy2.f13675i;
                boolean z6 = f13.m1495d(b03Var2.m350n().f5297b) != b03Var2.m350n().f5296a.f10051i.length();
                xm0 xm0Var = new xm0() { // from class: g03
                    @Override // p000.xm0
                    /* JADX INFO: renamed from: a */
                    public final Object mo6a() {
                        int i20 = i6;
                        a83 a83Var2 = a83.f116a;
                        b03 b03Var3 = b03Var2;
                        switch (i20) {
                            case 0:
                                break;
                            case 1:
                                k03 k03VarM340e = b03.m340e(b03Var3.m350n().f5296a, fg1.m1636i(0, b03Var3.m350n().f5296a.f10051i.length()));
                                b03Var3.f482c.mo5j(k03VarM340e);
                                long j11 = k03VarM340e.f5297b;
                                b03Var3.f502w = new f13(j11);
                                b03Var3.f500u = k03.m2598a(b03Var3.f500u, null, j11, 5);
                                b03Var3.m344h(true);
                                break;
                            default:
                                xm0 xm0Var2 = b03Var3.f486g;
                                if (xm0Var2 != null) {
                                    xm0Var2.mo6a();
                                }
                                break;
                        }
                        return a83Var2;
                    }
                };
                final int i20 = 1;
                xm0 xm0Var2 = new xm0() { // from class: g03
                    @Override // p000.xm0
                    /* JADX INFO: renamed from: a */
                    public final Object mo6a() {
                        int i202 = i20;
                        a83 a83Var2 = a83.f116a;
                        b03 b03Var3 = b03Var2;
                        switch (i202) {
                            case 0:
                                break;
                            case 1:
                                k03 k03VarM340e = b03.m340e(b03Var3.m350n().f5296a, fg1.m1636i(0, b03Var3.m350n().f5296a.f10051i.length()));
                                b03Var3.f482c.mo5j(k03VarM340e);
                                long j11 = k03VarM340e.f5297b;
                                b03Var3.f502w = new f13(j11);
                                b03Var3.f500u = k03.m2598a(b03Var3.f500u, null, j11, 5);
                                b03Var3.m344h(true);
                                break;
                            default:
                                xm0 xm0Var22 = b03Var3.f486g;
                                if (xm0Var22 != null) {
                                    xm0Var22.mo6a();
                                }
                                break;
                        }
                        return a83Var2;
                    }
                };
                Resources resources4 = context2.getResources();
                C0944z c0944z4 = new C0944z(xm0Var2, xm0Var, i19);
                if (z6) {
                    lk1Var2.m2925a(new xy2(tp0.f10889p, resources4.getString(R.string.selectAll), R.attr.actionModeSelectAllDrawable, c0944z4));
                }
                yy2[] yy2VarArr5 = yy2.f13675i;
                boolean z7 = b03Var2.m346j() && f13.m1494c(b03Var2.m350n().f5297b);
                xm0 xm0Var3 = new xm0() { // from class: g03
                    @Override // p000.xm0
                    /* JADX INFO: renamed from: a */
                    public final Object mo6a() {
                        int i202 = i4;
                        a83 a83Var2 = a83.f116a;
                        b03 b03Var3 = b03Var2;
                        switch (i202) {
                            case 0:
                                break;
                            case 1:
                                k03 k03VarM340e = b03.m340e(b03Var3.m350n().f5296a, fg1.m1636i(0, b03Var3.m350n().f5296a.f10051i.length()));
                                b03Var3.f482c.mo5j(k03VarM340e);
                                long j11 = k03VarM340e.f5297b;
                                b03Var3.f502w = new f13(j11);
                                b03Var3.f500u = k03.m2598a(b03Var3.f500u, null, j11, 5);
                                b03Var3.m344h(true);
                                break;
                            default:
                                xm0 xm0Var22 = b03Var3.f486g;
                                if (xm0Var22 != null) {
                                    xm0Var22.mo6a();
                                }
                                break;
                        }
                        return a83Var2;
                    }
                };
                Resources resources5 = context2.getResources();
                C0944z c0944z5 = new C0944z(xm0Var3, r8, i19);
                if (z7) {
                    lk1Var2.m2925a(new xy2(tp0.f10890q, resources5.getString(R.string.autofill), 0, c0944z5));
                }
                lk1Var2.m2925a(bz2Var);
                return a83Var;
        }
    }

    public /* synthetic */ C0444m0(g00 g00Var, p83 p83Var, k21 k21Var, gm2 gm2Var) {
        this.f6415h = 4;
        this.f6417j = g00Var;
        this.f6416i = k21Var;
        this.f6418k = gm2Var;
    }

    public /* synthetic */ C0444m0(in0 in0Var, xk1 xk1Var, xk1 xk1Var2) {
        this.f6415h = 2;
        this.f6418k = in0Var;
        this.f6417j = xk1Var;
        this.f6416i = xk1Var2;
    }

    public /* synthetic */ C0444m0(int i, Object obj, Object obj2, String str) {
        this.f6415h = i;
        this.f6416i = str;
        this.f6417j = obj;
        this.f6418k = obj2;
    }

    public /* synthetic */ C0444m0(xk1 xk1Var, ArrayList arrayList, List list, boolean z) {
        this.f6415h = 7;
        this.f6416i = xk1Var;
        this.f6418k = arrayList;
        this.f6417j = list;
    }

    public /* synthetic */ C0444m0(Object obj, Object obj2, Object obj3, int i) {
        this.f6415h = i;
        this.f6417j = obj;
        this.f6416i = obj2;
        this.f6418k = obj3;
    }
}
