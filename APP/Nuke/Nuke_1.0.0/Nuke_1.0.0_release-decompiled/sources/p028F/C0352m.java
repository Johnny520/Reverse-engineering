package p028F;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.textclassifier.TextClassification;
import com.bumptech.glide.AbstractC1926h;
import java.util.List;
import me.dartcv.nuke.BuildConfig;
import me.dartcv.nuke.R;
import p000A.AbstractC0070k0;
import p000A.C0042V0;
import p000A.C0049a;
import p000A.C0075n;
import p004A3.C0157b;
import p006B.AbstractC0166b;
import p007B0.C0173F;
import p012C.C0233a;
import p018D.C0254c;
import p018D.C0259h;
import p018D.InterfaceC0258g;
import p040H.InterfaceC0546d;
import p041H0.C0551B;
import p041H0.C0591f;
import p041H0.InterfaceC0593g;
import p044H3.AbstractC0648c;
import p045H4.AbstractC0653e;
import p045H4.C0650b;
import p049I2.AbstractC0797o;
import p056K2.C0891q;
import p058L.AbstractC0945q;
import p058L.C0910L;
import p058L.C0920W;
import p058L.C0943o;
import p076P.AbstractC1089e0;
import p076P.C1109v;
import p092S0.AbstractC1251D;
import p092S0.C1259L;
import p092S0.C1260M;
import p092S0.C1269g;
import p095T.AbstractC1385s;
import p095T.C1308D0;
import p095T.C1314G0;
import p095T.C1324L0;
import p095T.C1341U0;
import p095T.C1357e;
import p095T.C1371l;
import p095T.C1383r;
import p095T.C1388t0;
import p095T.InterfaceC1339T0;
import p095T.InterfaceC1363h;
import p095T.InterfaceC1373m;
import p095T.InterfaceC1378o0;
import p108V3.AbstractC1543P;
import p110W0.C1587l;
import p112W2.InterfaceC1599a;
import p112W2.InterfaceC1601c;
import p112W2.InterfaceC1603e;
import p117X2.AbstractC1665j;
import p128a.AbstractC1785a;
import p136b0.C1843e;
import p136b0.C1849k;
import p160f3.InterfaceC2160t;
import p169h0.AbstractC2192a;
import p169h0.C2194c;
import p169h0.C2204m;
import p169h0.InterfaceC2207p;
import p179i4.AbstractC2352g;
import p207n3.C2695c;
import p221q.C2895c;
import p221q.C2896d;
import p244u.AbstractC3261c;
import p244u.AbstractC3273i;
import p244u.AbstractC3287t;
import p244u.C3289v;
import p255w.C3377h;
import p260x.AbstractC3429l;
import p260x.C3408N;
import p260x.C3437t;
import p260x.C3438u;
import p264x3.C3449a;
import p264x3.C3453e;
import p270y3.C3493a;
import p276z3.AbstractC3518a;

/* JADX INFO: renamed from: F.m */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0352m implements InterfaceC1603e {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f1112d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f1113e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f1114f;

    public /* synthetic */ C0352m(int i5, int i6, Object obj, Object obj2) {
        this.f1112d = i6;
        this.f1114f = obj;
        this.f1113e = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:198:0x04cb, code lost:
    
        r19 = r6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0756  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x08d8  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x08f6  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x0907  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x093f  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x0944  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x0947  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x094c  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x0953  */
    /* JADX WARN: Removed duplicated region for block: B:432:0x0956  */
    /* JADX WARN: Removed duplicated region for block: B:445:0x09b2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x024c A[LOOP:27: B:84:0x024c->B:86:0x0255, LOOP_START, PHI: r0
  0x024c: PHI (r0v21 int) = (r0v20 int), (r0v22 int) binds: [B:83:0x024a, B:86:0x0255] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0287  */
    /* JADX WARN: Type inference failed for: r12v26 */
    /* JADX WARN: Type inference failed for: r12v27 */
    /* JADX WARN: Type inference failed for: r12v28 */
    /* JADX WARN: Type inference failed for: r12v29, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r12v43 */
    /* JADX WARN: Type inference failed for: r12v44 */
    /* JADX WARN: Type inference failed for: r12v45 */
    /* JADX WARN: Type inference failed for: r12v46, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v48 */
    /* JADX WARN: Type inference failed for: r12v49 */
    /* JADX WARN: Type inference failed for: r12v50, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v51, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r12v62 */
    /* JADX WARN: Type inference failed for: r12v63 */
    /* JADX WARN: Type inference failed for: r12v64 */
    /* JADX WARN: Type inference failed for: r12v65 */
    /* JADX WARN: Type inference failed for: r12v66 */
    /* JADX WARN: Type inference failed for: r12v67 */
    /* JADX WARN: Type inference failed for: r12v68 */
    /* JADX WARN: Type inference failed for: r14v37 */
    /* JADX WARN: Type inference failed for: r14v38, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r14v48 */
    /* JADX WARN: Type inference failed for: r14v49 */
    /* JADX WARN: Type inference failed for: r14v50, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r14v72 */
    /* JADX WARN: Type inference failed for: r14v73 */
    /* JADX WARN: Type inference failed for: r14v74 */
    /* JADX WARN: Type inference failed for: r14v75 */
    /* JADX WARN: Type inference failed for: r20v15 */
    /* JADX WARN: Type inference failed for: r20v16, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r20v17 */
    /* JADX WARN: Type inference failed for: r20v38, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r42v0 */
    /* JADX WARN: Type inference failed for: r42v1 */
    /* JADX WARN: Type inference failed for: r42v2 */
    /* JADX WARN: Type inference failed for: r42v3 */
    /* JADX WARN: Type inference failed for: r42v4 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object m562c(java.lang.Object r59, java.lang.Object r60) {
        /*
            Method dump skipped, instruction units count: 2504
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p028F.C0352m.m562c(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        C1259L c1259l;
        Object obj3;
        int i5 = this.f1112d;
        int i6 = 28;
        C1357e c1357e = C1371l.f4833a;
        C0891q c0891q = C0891q.f2780a;
        Object obj4 = this.f1113e;
        Object obj5 = this.f1114f;
        switch (i5) {
            case 0:
                InterfaceC0546d interfaceC0546d = (InterfaceC0546d) obj5;
                InterfaceC0258g interfaceC0258g = (InterfaceC0258g) obj4;
                InterfaceC1373m interfaceC1373m = (InterfaceC1373m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                C1383r c1383r = (C1383r) interfaceC1373m;
                if (c1383r.m2560O(iIntValue & 1, (iIntValue & 3) != 2)) {
                    boolean zM2582f = c1383r.m2582f(interfaceC0546d);
                    Object objM2558L = c1383r.m2558L();
                    if (zM2582f || objM2558L == c1357e) {
                        objM2558L = AbstractC1385s.m2624n(new C0354o(0, interfaceC0546d, InterfaceC0546d.class, "data", "data()Landroidx/compose/foundation/text/contextmenu/data/TextContextMenuData;", 0, 0, 0));
                        c1383r.m2585g0(objM2558L);
                    }
                    AbstractC0355p.m563a(interfaceC0258g, (C0254c) ((InterfaceC1339T0) objM2558L).getValue(), c1383r, 0);
                } else {
                    c1383r.m2563R();
                }
                break;
            case BuildConfig.VERSION_CODE /* 1 */:
                ((Integer) obj2).getClass();
                AbstractC0355p.m563a((InterfaceC0258g) obj4, (C0254c) obj5, (InterfaceC1373m) obj, AbstractC1385s.m2609A(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                ((C0361v) obj5).m598a((Drawable) obj4, (InterfaceC1373m) obj, AbstractC1385s.m2609A(49));
                break;
            case 3:
                ((Integer) obj2).getClass();
                AbstractC0653e.m1125a((C0650b) obj5, (C1843e) obj4, (InterfaceC1373m) obj, AbstractC1385s.m2609A(49));
                break;
            case 4:
                ((Integer) obj2).getClass();
                AbstractC1785a.m3243c((InterfaceC2207p) obj5, (C1843e) obj4, (InterfaceC1373m) obj, AbstractC1385s.m2609A(49));
                break;
            case 5:
                C0920W c0920w = (C0920W) obj5;
                InterfaceC2160t interfaceC2160t = (InterfaceC2160t) obj4;
                C0233a c0233a = (C0233a) obj;
                Context context = (Context) obj2;
                boolean zM1935j = c0920w.m1935j();
                C1269g c1269gM1938m = c0920w.m1938m();
                TextClassification textClassification = null;
                String str = c1269gM1938m != null ? c1269gM1938m.f4563e : null;
                C1259L c1259l2 = c0920w.f2886v;
                if (c1259l2 != null) {
                    long j5 = c1259l2.f4538a;
                    C0042V0 c0042v0 = c0920w.f2866b;
                    int i7 = (int) (j5 >> 32);
                    c0042v0.m57a(i7);
                    int i8 = (int) (j5 & 4294967295L);
                    c0042v0.m57a(i8);
                    c1259l = new C1259L(AbstractC1251D.m2313b(i7, i8));
                } else {
                    c1259l = null;
                }
                C0943o c0943o = c0920w.f2873i;
                C0075n c0075n = new C0075n(c0920w, interfaceC2160t, context, 8);
                C1341U0 c1341u0 = AbstractC0945q.f2972a;
                if (Build.VERSION.SDK_INT < 28 || str == null || c1259l == null || c0943o == null || !(c0943o instanceof C0943o)) {
                    String str2 = str;
                    c0075n.mo1h(c0233a);
                    if (str2 != null && c1259l != null) {
                        AbstractC0166b.m245a(c0233a, context, zM1935j, str2, c1259l.f4538a);
                    }
                } else {
                    long j6 = c1259l.f4538a;
                    Object obj6 = c0943o.f2971h;
                    C2695c c2695c = c0943o.f2968e;
                    if (c2695c.m4692e()) {
                        C0910L c0910l = (C0910L) c0943o.f2970g.getValue();
                        TextClassification textClassification2 = (c0910l != null && C1259L.m2334b(j6, c0910l.f2827b) && AbstractC1665j.m2981a(str, c0910l.f2826a)) ? c0910l.f2828c : null;
                        c2695c.m4693f(null);
                        textClassification = textClassification2;
                    }
                    if (textClassification == null) {
                        c0075n.mo1h(c0233a);
                    } else {
                        if (!textClassification.getActions().isEmpty()) {
                            c0233a.f785a.m4243a(new C0259h(obj6, textClassification, 0));
                        } else if ((textClassification.getIcon() != null || !TextUtils.isEmpty(textClassification.getLabel())) && (textClassification.getIntent() != null || textClassification.getOnClickListener() != null)) {
                            c0233a.f785a.m4243a(new C0259h(obj6, textClassification, -1));
                        }
                        c0075n.mo1h(c0233a);
                        List actions = textClassification.getActions();
                        int size = actions.size();
                        for (int i9 = 0; i9 < size; i9++) {
                            if (i9 > 0) {
                                c0233a.f785a.m4243a(new C0259h(obj6, textClassification, i9));
                            }
                        }
                    }
                    AbstractC0166b.m245a(c0233a, context, zM1935j, str, c1259l.f4538a);
                }
                break;
            case 6:
                ((Integer) obj2).getClass();
                ((C1109v) obj5).m2157a((C0173F) obj4, (InterfaceC1373m) obj, AbstractC1385s.m2609A(1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                AbstractC1089e0.m2145a((C1260M) obj5, (C1843e) obj4, (InterfaceC1373m) obj, AbstractC1385s.m2609A(1));
                break;
            case 8:
                C1849k c1849k = (C1849k) obj5;
                C1324L0 c1324l0 = (C1324L0) obj4;
                int iIntValue2 = ((Integer) obj).intValue();
                if (obj2 instanceof InterfaceC1363h) {
                    c1849k.f6263f.m2753b((InterfaceC1363h) obj2);
                } else if (!(obj2 instanceof C1314G0)) {
                    if (obj2 instanceof C1308D0) {
                        AbstractC1385s.m2634x(c1324l0, iIntValue2, obj2);
                        c1849k.m3321e((C1308D0) obj2);
                    } else if (obj2 instanceof C1388t0) {
                        AbstractC1385s.m2634x(c1324l0, iIntValue2, obj2);
                        ((C1388t0) obj2).m2643d();
                    }
                }
                break;
            case 9:
                ((Integer) obj2).getClass();
                AbstractC1543P.m2825j((List) obj5, (InterfaceC1599a) obj4, (InterfaceC1373m) obj, AbstractC1385s.m2609A(1));
                break;
            case 10:
                String str3 = (String) obj5;
                String str4 = (String) obj4;
                InterfaceC1373m interfaceC1373m2 = (InterfaceC1373m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                C1383r c1383r2 = (C1383r) interfaceC1373m2;
                if (c1383r2.m2560O(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    float f2 = 18;
                    InterfaceC2207p interfaceC2207pM5529p = AbstractC3261c.m5529p(AbstractC3261c.f10087c, f2, f2);
                    C3289v c3289vM5564a = AbstractC3287t.m5564a(AbstractC3273i.f10112c, C2194c.f7171o, c1383r2, 0);
                    int iHashCode = Long.hashCode(c1383r2.f4882T);
                    InterfaceC1378o0 interfaceC1378o0M2593l = c1383r2.m2593l();
                    InterfaceC2207p interfaceC2207pM4016c = AbstractC2192a.m4016c(c1383r2, interfaceC2207pM5529p);
                    InterfaceC0593g.f1909a.getClass();
                    C0551B c0551b = C0591f.f1902b;
                    c1383r2.m2571Z();
                    if (c1383r2.f4881S) {
                        c1383r2.m2592k(c0551b);
                    } else {
                        c1383r2.m2591j0();
                    }
                    AbstractC1385s.m2635y(c1383r2, C0591f.f1905e, c3289vM5564a);
                    AbstractC1385s.m2635y(c1383r2, C0591f.f1904d, interfaceC1378o0M2593l);
                    AbstractC1385s.m2627q(c1383r2, Integer.valueOf(iHashCode), C0591f.f1906f);
                    AbstractC1385s.m2631u(c1383r2, C0591f.f1907g);
                    AbstractC1385s.m2635y(c1383r2, C0591f.f1903c, interfaceC2207pM4016c);
                    C1341U0 c1341u02 = AbstractC0653e.f2072a;
                    AbstractC0070k0.m74a(str3, null, new C1260M(((C0650b) c1383r2.m2590j(c1341u02)).f2064e, AbstractC1926h.m3579v(15), C1587l.f5504h, 0L, 0, AbstractC1926h.m3579v(20), null, null, 16646136), 0, false, 0, 0, c1383r2, 0, 1018);
                    AbstractC0070k0.m74a(str4, AbstractC3261c.m5531r(C2204m.f7185a, 0.0f, 5, 0.0f, 0.0f, 13), new C1260M(((C0650b) c1383r2.m2590j(c1341u02)).f2065f, AbstractC1926h.m3579v(13), C1587l.f5502f, 0L, 0, AbstractC1926h.m3579v(18), null, null, 16646136), 0, false, 0, 0, c1383r2, 48, 1016);
                    c1383r2.m2597p(true);
                } else {
                    c1383r2.m2563R();
                }
                break;
            case 11:
                ((Integer) obj2).getClass();
                AbstractC1543P.m2837v((AbstractC0648c) obj5, (InterfaceC1599a) obj4, (InterfaceC1373m) obj, AbstractC1385s.m2609A(9));
                break;
            case 12:
                ((Integer) obj2).getClass();
                ((C2896d) obj5).m5092a((C2895c) obj4, (InterfaceC1373m) obj, AbstractC1385s.m2609A(1));
                break;
            case 13:
                C3438u c3438u = (C3438u) obj5;
                C3437t c3437t = (C3437t) obj4;
                Object obj7 = c3437t.f10735a;
                InterfaceC1373m interfaceC1373m3 = (InterfaceC1373m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                C1383r c1383r3 = (C1383r) interfaceC1373m3;
                if (c1383r3.m2560O(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    C3377h c3377h = (C3377h) c3438u.f10741b.mo6a();
                    int iM1343g = c3437t.f10737c;
                    if ((iM1343g >= c3377h.m5611c() || !c3377h.m5612d(iM1343g).equals(obj7)) && (iM1343g = c3377h.f10498d.m1343g(obj7)) != -1) {
                        c3437t.f10737c = iM1343g;
                    }
                    if (iM1343g != -1) {
                        c1383r3.m2568W(-1664741271);
                        AbstractC3429l.m5691d(c3377h, c3438u.f10740a, iM1343g, obj7, c1383r3, 0);
                        obj3 = obj7;
                    } else {
                        obj3 = obj7;
                        c1383r3.m2568W(-1668376610);
                    }
                    c1383r3.m2597p(false);
                    boolean zM2586h = c1383r3.m2586h(c3437t);
                    Object objM2558L2 = c1383r3.m2558L();
                    if (zM2586h || objM2558L2 == c1357e) {
                        objM2558L2 = new C0049a(i6, c3437t);
                        c1383r3.m2585g0(objM2558L2);
                    }
                    AbstractC1385s.m2613c(obj3, (InterfaceC1601c) objM2558L2, c1383r3);
                } else {
                    c1383r3.m2563R();
                }
                break;
            case 14:
                break;
            case 15:
                C1843e c1843e = (C1843e) obj5;
                C3408N c3408n = (C3408N) obj4;
                InterfaceC1373m interfaceC1373m4 = (InterfaceC1373m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                C1383r c1383r4 = (C1383r) interfaceC1373m4;
                if (c1383r4.m2560O(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    c1843e.mo5f(c3408n, c1383r4, 0);
                } else {
                    c1383r4.m2563R();
                }
                break;
            case 16:
                ((Integer) obj2).getClass();
                AbstractC0797o.m1380d((List) obj5, (InterfaceC2207p) obj4, (InterfaceC1373m) obj, AbstractC1385s.m2609A(55));
                break;
            case 17:
                ((Integer) obj2).getClass();
                AbstractC0797o.m1382f((C3493a) obj5, (InterfaceC2207p) obj4, (InterfaceC1373m) obj, AbstractC1385s.m2609A(1));
                break;
            case 18:
                C3449a c3449a = (C3449a) obj5;
                C0157b c0157b = (C0157b) obj4;
                InterfaceC1373m interfaceC1373m5 = (InterfaceC1373m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                C1383r c1383r5 = (C1383r) interfaceC1373m5;
                if (c1383r5.m2560O(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    c3449a.getClass();
                    AbstractC1089e0.m2146b(AbstractC2352g.m4185H(R.string.discussion, c1383r5), null, c0157b.f567d, AbstractC1926h.m3579v(20), C1587l.f5504h, null, AbstractC1926h.m3579v(0), null, 0L, 0, false, 0, 0, null, c1383r5, 102260736, 0, 261802);
                } else {
                    c1383r5.m2563R();
                }
                break;
            case 19:
                C3453e c3453e = (C3453e) obj5;
                C0157b c0157b2 = (C0157b) obj4;
                InterfaceC1373m interfaceC1373m6 = (InterfaceC1373m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                C1383r c1383r6 = (C1383r) interfaceC1373m6;
                if (c1383r6.m2560O(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    AbstractC1089e0.m2146b(c3453e.f10775b, AbstractC3261c.m5529p(C2204m.f7185a, 10, 5), c0157b2.f580q, AbstractC1926h.m3579v(12), C1587l.f5503g, null, AbstractC1926h.m3579v(0), null, 0L, 0, false, 0, 0, null, c1383r6, 102260784, 0, 261800);
                } else {
                    c1383r6.m2563R();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                AbstractC3518a.m5771d((C3453e) obj5, (InterfaceC2207p) obj4, (InterfaceC1373m) obj, AbstractC1385s.m2609A(1));
                break;
        }
        return c0891q;
    }

    public /* synthetic */ C0352m(int i5, Object obj, Object obj2) {
        this.f1112d = i5;
        this.f1114f = obj;
        this.f1113e = obj2;
    }

    public /* synthetic */ C0352m(InterfaceC0258g interfaceC0258g, C0254c c0254c, int i5) {
        this.f1112d = 1;
        this.f1113e = interfaceC0258g;
        this.f1114f = c0254c;
    }
}
