package p332wb;

import android.app.Activity;
import android.view.ViewGroup;
import bi.AbstractC0316d;
import bi.C0314b;
import gg.C1421q;
import gg.C1425u;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import p015b0.C0154t;
import p036c9.C0416a1;
import p065eb.C0859c0;
import p071f1.AbstractC0996c0;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p085fg.InterfaceC1237r;
import p099h.AbstractC1468k;
import p099h.C1474n;
import p117i0.C1823e;
import p117i0.C1836h0;
import p117i0.C1845j1;
import p117i0.C1851l;
import p126ia.C2020n;
import p144k.AbstractC2192n;
import p174m.C2576b;
import p222p.AbstractC3222h1;
import p251r.C3641z;
import p266s0.AbstractC3879i;
import p276sf.C3967n;
import p317vb.C4546c;
import p317vb.InterfaceC4544a;
import p322w0.C4661l;
import p356y0.InterfaceC5853o;
import sh.C4056v1;

/* JADX INFO: renamed from: wb.n6 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5133n6 implements InterfaceC1235p {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f19106g = 0;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C1845j1 f19107h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C1845j1 f19108i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Activity f19109j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ AbstractC5459x2 f19110k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ C1421q f19111l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ C5166o6 f19112m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ C1425u f19113n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ ArrayList f19114o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ C1425u f19115p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ ViewGroup f19116q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ C0416a1 f19117r;

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ C3641z f19118s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ C1845j1 f19119t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ C1845j1 f19120u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ C1845j1 f19121v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ boolean f19122w;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5133n6(Activity activity, C1845j1 c1845j1, C1845j1 c1845j12, AbstractC5459x2 abstractC5459x2, C1421q c1421q, C5166o6 c5166o6, C1425u c1425u, ArrayList arrayList, C1425u c1425u2, ViewGroup viewGroup, C0416a1 c0416a1, C3641z c3641z, C1845j1 c1845j13, C1845j1 c1845j14, C1845j1 c1845j15, boolean z9) {
        this.f19109j = activity;
        this.f19107h = c1845j1;
        this.f19108i = c1845j12;
        this.f19110k = abstractC5459x2;
        this.f19111l = c1421q;
        this.f19112m = c5166o6;
        this.f19113n = c1425u;
        this.f19114o = arrayList;
        this.f19115p = c1425u2;
        this.f19116q = viewGroup;
        this.f19117r = c0416a1;
        this.f19118s = c3641z;
        this.f19119t = c1845j13;
        this.f19120u = c1845j14;
        this.f19121v = c1845j15;
        this.f19122w = z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        ArrayList arrayList;
        C1425u c1425u;
        ViewGroup viewGroup;
        C0416a1 c0416a1;
        switch (this.f19106g) {
            case 0:
                C1836h0 c1836h0 = (C1836h0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c1836h0.m4516S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    C1845j1 c1845j1 = this.f19107h;
                    C1845j1 c1845j12 = this.f19108i;
                    Activity activity = this.f19109j;
                    AbstractC4955ho.m9702x1(activity, AbstractC3879i.m8071e(199924065, new C5133n6(c1845j1, c1845j12, activity, this.f19110k, this.f19111l, this.f19112m, this.f19113n, this.f19114o, this.f19115p, this.f19116q, this.f19117r, this.f19118s, this.f19119t, this.f19120u, this.f19121v, this.f19122w), c1836h0), c1836h0, 48);
                } else {
                    c1836h0.m4519V();
                }
                break;
            default:
                C1836h0 c1836h02 = (C1836h0) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c1836h02.m4516S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    final C1845j1 c1845j13 = this.f19107h;
                    C0859c0 c0859c0 = (C0859c0) c1845j13.getValue();
                    final Activity activity2 = this.f19109j;
                    C1823e c1823e = C1851l.f6155a;
                    if (c0859c0 == null) {
                        c1836h02.m4525a0(-1181758128);
                        c1836h02.m4553p(false);
                    } else {
                        c1836h02.m4525a0(-1181758127);
                        boolean zM4534f = c1836h02.m4534f(c1845j13);
                        Object objM4514P = c1836h02.m4514P();
                        if (zM4534f || objM4514P == c1823e) {
                            objM4514P = new C4970i6(c1845j13, 6);
                            c1836h02.m4545k0(objM4514P);
                        }
                        AbstractC4955ho.m9651r3(activity2, c0859c0, (InterfaceC1220a) objM4514P, c1836h02, 64);
                        c1836h02.m4553p(false);
                    }
                    C1845j1 c1845j14 = this.f19108i;
                    boolean zBooleanValue = ((Boolean) c1845j14.getValue()).booleanValue();
                    final C1421q c1421q = this.f19111l;
                    final C5166o6 c5166o6 = this.f19112m;
                    final C1425u c1425u2 = this.f19113n;
                    ArrayList arrayList2 = this.f19114o;
                    C1425u c1425u3 = this.f19115p;
                    ViewGroup viewGroup2 = this.f19116q;
                    C0416a1 c0416a12 = this.f19117r;
                    if (zBooleanValue) {
                        arrayList = arrayList2;
                        c1425u = c1425u3;
                        viewGroup = viewGroup2;
                        c0416a1 = c0416a12;
                        c1836h02.m4525a0(-1180943199);
                        c1836h02.m4553p(false);
                    } else {
                        c1836h02.m4525a0(-1181400635);
                        arrayList = arrayList2;
                        c1425u = c1425u3;
                        viewGroup = viewGroup2;
                        c0416a1 = c0416a12;
                        C4871f6 c4871f6 = new C4871f6(c1421q, c5166o6, c1425u2, arrayList, c1425u, viewGroup, c0416a1, 3);
                        boolean zM4534f2 = c1836h02.m4534f(c1845j14) | c1836h02.m4538h(activity2);
                        Object objM4514P2 = c1836h02.m4514P();
                        if (zM4534f2 || objM4514P2 == c1823e) {
                            objM4514P2 = new C4056v1(c1845j14, 8, activity2);
                            c1836h02.m4545k0(objM4514P2);
                        }
                        AbstractC4955ho.m9391N0(activity2, c4871f6, (InterfaceC1220a) objM4514P2, c1836h02, 0);
                        c1836h02.m4553p(false);
                    }
                    InterfaceC5853o interfaceC5853oM5430g = AbstractC2192n.m5430g(AbstractC3222h1.f10289c, ((C0314b) c1836h02.m4542j(AbstractC0316d.f944a)).m1231a(), AbstractC0996c0.f3162b);
                    Object objM4514P3 = c1836h02.m4514P();
                    if (objM4514P3 == c1823e) {
                        objM4514P3 = new C4661l(6);
                        c1836h02.m4545k0(objM4514P3);
                    }
                    final C3641z c3641z = this.f19118s;
                    final ViewGroup viewGroup3 = viewGroup;
                    final C1845j1 c1845j15 = this.f19119t;
                    final C0416a1 c0416a13 = c0416a1;
                    final C1845j1 c1845j16 = this.f19120u;
                    final C1845j1 c1845j17 = this.f19121v;
                    final boolean z9 = this.f19122w;
                    final ArrayList arrayList3 = arrayList;
                    final C1425u c1425u4 = c1425u;
                    AbstractC1468k.m3990b(this.f19110k, interfaceC5853oM5430g, (InterfaceC1231l) objM4514P3, null, "HchatPageTransition", null, AbstractC3879i.m8071e(-1281571142, new InterfaceC1237r() { // from class: wb.g6
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
                        @Override // p085fg.InterfaceC1237r
                        /* JADX INFO: renamed from: c */
                        public final Object mo3355c(Object obj3, Object obj4, Object obj5, Object obj6) throws JSONException {
                            final AbstractC5459x2 abstractC5459x2 = (AbstractC5459x2) obj4;
                            C1836h0 c1836h03 = (C1836h0) obj5;
                            int iIntValue3 = ((Integer) obj6).intValue();
                            ((C1474n) obj3).getClass();
                            if ((iIntValue3 & 48) == 0) {
                                iIntValue3 |= (iIntValue3 & 64) == 0 ? c1836h03.m4534f(abstractC5459x2) : c1836h03.m4538h(abstractC5459x2) ? 32 : 16;
                            }
                            final int i9 = 1;
                            final int i10 = 0;
                            if (c1836h03.m4516S(iIntValue3 & 1, (iIntValue3 & 145) != 144)) {
                                Activity activity3 = activity2;
                                final C1845j1 c1845j18 = c1845j17;
                                C1845j1 c1845j19 = c1845j13;
                                C1823e c1823e2 = C1851l.f6155a;
                                if (abstractC5459x2 == null) {
                                    c1836h03.m4525a0(-1321490877);
                                    C4546c c4546c = C4546c.f15001a;
                                    List listUnmodifiableList = Collections.unmodifiableList(new ArrayList(C4546c.f15002b));
                                    listUnmodifiableList.getClass();
                                    C1845j1 c1845j110 = c1845j15;
                                    EnumC5329t4 enumC5329t4 = (EnumC5329t4) c1845j110.getValue();
                                    C1845j1 c1845j111 = c1845j16;
                                    int iIntValue4 = ((Number) c1845j111.getValue()).intValue();
                                    boolean zM4534f3 = c1836h03.m4534f(c1845j110);
                                    Object objM4514P4 = c1836h03.m4514P();
                                    Object obj7 = objM4514P4;
                                    if (zM4534f3 || objM4514P4 == c1823e2) {
                                        C4937h6 c4937h6 = new C4937h6(c1845j110, 0);
                                        c1836h03.m4545k0(c4937h6);
                                        obj7 = c4937h6;
                                    }
                                    InterfaceC1231l interfaceC1231l = (InterfaceC1231l) obj7;
                                    boolean zM4534f4 = c1836h03.m4534f(c1845j18);
                                    Object objM4514P5 = c1836h03.m4514P();
                                    Object obj8 = objM4514P5;
                                    if (zM4534f4 || objM4514P5 == c1823e2) {
                                        C4970i6 c4970i6 = new C4970i6(c1845j18, 1);
                                        c1836h03.m4545k0(c4970i6);
                                        obj8 = c4970i6;
                                    }
                                    InterfaceC1220a interfaceC1220a = (InterfaceC1220a) obj8;
                                    boolean zM4534f5 = c1836h03.m4534f(c1845j18);
                                    Object objM4514P6 = c1836h03.m4514P();
                                    Object obj9 = objM4514P6;
                                    if (zM4534f5 || objM4514P6 == c1823e2) {
                                        C4937h6 c4937h62 = new C4937h6(c1845j18, 2);
                                        c1836h03.m4545k0(c4937h62);
                                        obj9 = c4937h62;
                                    }
                                    InterfaceC1231l interfaceC1231l2 = (InterfaceC1231l) obj9;
                                    boolean zM4534f6 = c1836h03.m4534f(c1845j18);
                                    Object objM4514P7 = c1836h03.m4514P();
                                    Object obj10 = objM4514P7;
                                    if (zM4534f6 || objM4514P7 == c1823e2) {
                                        C4937h6 c4937h63 = new C4937h6(c1845j18, 3);
                                        c1836h03.m4545k0(c4937h63);
                                        obj10 = c4937h63;
                                    }
                                    InterfaceC1231l interfaceC1231l3 = (InterfaceC1231l) obj10;
                                    boolean zM4534f7 = c1836h03.m4534f(c1845j19);
                                    Object objM4514P8 = c1836h03.m4514P();
                                    Object obj11 = objM4514P8;
                                    if (zM4534f7 || objM4514P8 == c1823e2) {
                                        C4937h6 c4937h64 = new C4937h6(c1845j19, 4);
                                        c1836h03.m4545k0(c4937h64);
                                        obj11 = c4937h64;
                                    }
                                    InterfaceC1231l interfaceC1231l4 = (InterfaceC1231l) obj11;
                                    boolean zM4534f8 = c1836h03.m4534f(c1845j18);
                                    Object objM4514P9 = c1836h03.m4514P();
                                    Object obj12 = objM4514P9;
                                    if (zM4534f8 || objM4514P9 == c1823e2) {
                                        C4970i6 c4970i62 = new C4970i6(c1845j18, 2);
                                        c1836h03.m4545k0(c4970i62);
                                        obj12 = c4970i62;
                                    }
                                    InterfaceC1220a interfaceC1220a2 = (InterfaceC1220a) obj12;
                                    boolean zM4534f9 = c1836h03.m4534f(c1845j18);
                                    Object objM4514P10 = c1836h03.m4514P();
                                    Object obj13 = objM4514P10;
                                    if (zM4534f9 || objM4514P10 == c1823e2) {
                                        C4970i6 c4970i63 = new C4970i6(c1845j18, 3);
                                        c1836h03.m4545k0(c4970i63);
                                        obj13 = c4970i63;
                                    }
                                    InterfaceC1220a interfaceC1220a3 = (InterfaceC1220a) obj13;
                                    boolean zM4534f10 = c1836h03.m4534f(c1845j111);
                                    Object objM4514P11 = c1836h03.m4514P();
                                    Object obj14 = objM4514P11;
                                    if (zM4534f10 || objM4514P11 == c1823e2) {
                                        C4970i6 c4970i64 = new C4970i6(c1845j111, 4);
                                        c1836h03.m4545k0(c4970i64);
                                        obj14 = c4970i64;
                                    }
                                    AbstractC4955ho.m9392N1(activity3, listUnmodifiableList, c3641z, enumC5329t4, iIntValue4, interfaceC1231l, interfaceC1220a, interfaceC1231l2, interfaceC1231l3, interfaceC1231l4, interfaceC1220a2, interfaceC1220a3, (InterfaceC1220a) obj14, c1836h03, 0);
                                    c1836h03.m4553p(false);
                                } else if (abstractC5459x2 instanceof C5426w2) {
                                    c1836h03.m4525a0(-1320217490);
                                    C4546c c4546c2 = C4546c.f15001a;
                                    List listUnmodifiableList2 = Collections.unmodifiableList(new ArrayList(C4546c.f15002b));
                                    listUnmodifiableList2.getClass();
                                    boolean zM4534f11 = c1836h03.m4534f(c1845j18);
                                    Object objM4514P12 = c1836h03.m4514P();
                                    Object obj15 = objM4514P12;
                                    if (zM4534f11 || objM4514P12 == c1823e2) {
                                        C4970i6 c4970i65 = new C4970i6(c1845j18, 5);
                                        c1836h03.m4545k0(c4970i65);
                                        obj15 = c4970i65;
                                    }
                                    InterfaceC1220a interfaceC1220a4 = (InterfaceC1220a) obj15;
                                    boolean zM4534f12 = c1836h03.m4534f(c1845j18);
                                    Object objM4514P13 = c1836h03.m4514P();
                                    Object obj16 = objM4514P13;
                                    if (zM4534f12 || objM4514P13 == c1823e2) {
                                        C0154t c0154t = new C0154t(c1845j18, 27);
                                        c1836h03.m4545k0(c0154t);
                                        obj16 = c0154t;
                                    }
                                    InterfaceC1235p interfaceC1235p = (InterfaceC1235p) obj16;
                                    boolean zM4534f13 = c1836h03.m4534f(c1845j19);
                                    Object objM4514P14 = c1836h03.m4514P();
                                    Object obj17 = objM4514P14;
                                    if (zM4534f13 || objM4514P14 == c1823e2) {
                                        C4937h6 c4937h65 = new C4937h6(c1845j19, 1);
                                        c1836h03.m4545k0(c4937h65);
                                        obj17 = c4937h65;
                                    }
                                    AbstractC4955ho.m9338G3(activity3, listUnmodifiableList2, interfaceC1220a4, interfaceC1235p, (InterfaceC1231l) obj17, c1836h03, 0);
                                    c1836h03.m4553p(false);
                                } else if (abstractC5459x2 instanceof C5327t2) {
                                    c1836h03.m4525a0(-1319330332);
                                    C4770c3 c4770c3 = ((C5327t2) abstractC5459x2).f20742a;
                                    boolean zM4534f14 = c1836h03.m4534f(c1845j18);
                                    Object objM4514P15 = c1836h03.m4514P();
                                    Object obj18 = objM4514P15;
                                    if (zM4534f14 || objM4514P15 == c1823e2) {
                                        C4970i6 c4970i66 = new C4970i6(c1845j18, 0);
                                        c1836h03.m4545k0(c4970i66);
                                        obj18 = c4970i66;
                                    }
                                    InterfaceC1220a interfaceC1220a5 = (InterfaceC1220a) obj18;
                                    boolean zM4534f15 = c1836h03.m4534f(c1845j18);
                                    if ((iIntValue3 & 112) != 32 && ((iIntValue3 & 64) == 0 || !c1836h03.m4538h(abstractC5459x2))) {
                                        i9 = 0;
                                    }
                                    int i11 = (zM4534f15 ? 1 : 0) | i9;
                                    Object objM4514P16 = c1836h03.m4514P();
                                    Object obj19 = objM4514P16;
                                    if (i11 != 0 || objM4514P16 == c1823e2) {
                                        C2576b c2576b = new C2576b(c1845j18, 29, abstractC5459x2);
                                        c1836h03.m4545k0(c2576b);
                                        obj19 = c2576b;
                                    }
                                    AbstractC4955ho.m9335G0(c4770c3, interfaceC1220a5, (InterfaceC1231l) obj19, c1836h03, 0);
                                    c1836h03.m4553p(false);
                                } else if (abstractC5459x2 instanceof C5294s2) {
                                    c1836h03.m4525a0(-1318826737);
                                    InterfaceC4544a interfaceC4544a = ((C5294s2) abstractC5459x2).f20561a;
                                    int i12 = iIntValue3 & 112;
                                    boolean zM4534f16 = c1836h03.m4534f(c1845j18) | (i12 == 32 || ((iIntValue3 & 64) != 0 && c1836h03.m4538h(abstractC5459x2)));
                                    Object objM4514P17 = c1836h03.m4514P();
                                    Object obj20 = objM4514P17;
                                    if (zM4534f16 || objM4514P17 == c1823e2) {
                                        InterfaceC1220a interfaceC1220a6 = new InterfaceC1220a() { // from class: wb.j6
                                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                            @Override // p085fg.InterfaceC1220a
                                            public final Object invoke() {
                                                switch (i10) {
                                                    case 0:
                                                        c1845j18.setValue(AbstractC4955ho.m9307C4(abstractC5459x2));
                                                        break;
                                                    case 1:
                                                        c1845j18.setValue(new C5360u2((C5294s2) abstractC5459x2));
                                                        break;
                                                    case 2:
                                                        c1845j18.setValue(new C5393v2((C5294s2) abstractC5459x2));
                                                        break;
                                                    default:
                                                        c1845j18.setValue(AbstractC4955ho.m9307C4(abstractC5459x2));
                                                        break;
                                                }
                                                return C3967n.f12976a;
                                            }
                                        };
                                        c1836h03.m4545k0(interfaceC1220a6);
                                        obj20 = interfaceC1220a6;
                                    }
                                    InterfaceC1220a interfaceC1220a7 = (InterfaceC1220a) obj20;
                                    boolean zM4534f17 = c1836h03.m4534f(c1845j18) | (i12 == 32 || ((iIntValue3 & 64) != 0 && c1836h03.m4538h(abstractC5459x2)));
                                    Object objM4514P18 = c1836h03.m4514P();
                                    Object obj21 = objM4514P18;
                                    if (zM4534f17 || objM4514P18 == c1823e2) {
                                        InterfaceC1220a interfaceC1220a8 = new InterfaceC1220a() { // from class: wb.j6
                                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                            @Override // p085fg.InterfaceC1220a
                                            public final Object invoke() {
                                                switch (i9) {
                                                    case 0:
                                                        c1845j18.setValue(AbstractC4955ho.m9307C4(abstractC5459x2));
                                                        break;
                                                    case 1:
                                                        c1845j18.setValue(new C5360u2((C5294s2) abstractC5459x2));
                                                        break;
                                                    case 2:
                                                        c1845j18.setValue(new C5393v2((C5294s2) abstractC5459x2));
                                                        break;
                                                    default:
                                                        c1845j18.setValue(AbstractC4955ho.m9307C4(abstractC5459x2));
                                                        break;
                                                }
                                                return C3967n.f12976a;
                                            }
                                        };
                                        c1836h03.m4545k0(interfaceC1220a8);
                                        obj21 = interfaceC1220a8;
                                    }
                                    InterfaceC1220a interfaceC1220a9 = (InterfaceC1220a) obj21;
                                    boolean zM4534f18 = c1836h03.m4534f(c1845j18);
                                    if (i12 != 32 && ((iIntValue3 & 64) == 0 || !c1836h03.m4538h(abstractC5459x2))) {
                                        i9 = 0;
                                    }
                                    int i13 = (zM4534f18 ? 1 : 0) | i9;
                                    Object objM4514P19 = c1836h03.m4514P();
                                    Object obj22 = objM4514P19;
                                    if (i13 != 0 || objM4514P19 == c1823e2) {
                                        final int i14 = 2;
                                        InterfaceC1220a interfaceC1220a10 = new InterfaceC1220a() { // from class: wb.j6
                                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                            @Override // p085fg.InterfaceC1220a
                                            public final Object invoke() {
                                                switch (i14) {
                                                    case 0:
                                                        c1845j18.setValue(AbstractC4955ho.m9307C4(abstractC5459x2));
                                                        break;
                                                    case 1:
                                                        c1845j18.setValue(new C5360u2((C5294s2) abstractC5459x2));
                                                        break;
                                                    case 2:
                                                        c1845j18.setValue(new C5393v2((C5294s2) abstractC5459x2));
                                                        break;
                                                    default:
                                                        c1845j18.setValue(AbstractC4955ho.m9307C4(abstractC5459x2));
                                                        break;
                                                }
                                                return C3967n.f12976a;
                                            }
                                        };
                                        c1836h03.m4545k0(interfaceC1220a10);
                                        obj22 = interfaceC1220a10;
                                    }
                                    AbstractC4955ho.m9375L0(activity3, interfaceC4544a, interfaceC1220a7, interfaceC1220a9, (InterfaceC1220a) obj22, c1836h03, 0);
                                    c1836h03.m4553p(false);
                                } else if (abstractC5459x2 instanceof C5360u2) {
                                    c1836h03.m4525a0(-1317954552);
                                    C5491y2 c5491y2 = C5491y2.f22066n;
                                    boolean z10 = z9;
                                    C1421q c1421q2 = c1421q;
                                    C5166o6 c5166o62 = c5166o6;
                                    C1425u c1425u5 = c1425u2;
                                    ArrayList arrayList4 = arrayList3;
                                    C1425u c1425u6 = c1425u4;
                                    ViewGroup viewGroup4 = viewGroup3;
                                    C0416a1 c0416a14 = c0416a13;
                                    c5491y2.m9919u0(activity3, new C5034k6(z10, c1845j18, abstractC5459x2, c1421q2, c5166o62, c1425u5, arrayList4, c1425u6, viewGroup4, c0416a14), new C2020n(c1425u5, z10, c5166o62, c1421q2, arrayList4, c1425u6, viewGroup4, c0416a14), c1836h03, 3072);
                                    c1836h03.m4553p(false);
                                } else if (abstractC5459x2 instanceof C5393v2) {
                                    c1836h03.m4525a0(-1317091419);
                                    C5491y2 c5491y22 = C5491y2.f22065m;
                                    boolean zM4534f19 = c1836h03.m4534f(c1845j18);
                                    if ((iIntValue3 & 112) != 32 && ((iIntValue3 & 64) == 0 || !c1836h03.m4538h(abstractC5459x2))) {
                                        i9 = 0;
                                    }
                                    int i15 = (zM4534f19 ? 1 : 0) | i9;
                                    Object objM4514P20 = c1836h03.m4514P();
                                    Object obj23 = objM4514P20;
                                    if (i15 != 0 || objM4514P20 == c1823e2) {
                                        final int i16 = 3;
                                        InterfaceC1220a interfaceC1220a11 = new InterfaceC1220a() { // from class: wb.j6
                                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                            @Override // p085fg.InterfaceC1220a
                                            public final Object invoke() {
                                                switch (i16) {
                                                    case 0:
                                                        c1845j18.setValue(AbstractC4955ho.m9307C4(abstractC5459x2));
                                                        break;
                                                    case 1:
                                                        c1845j18.setValue(new C5360u2((C5294s2) abstractC5459x2));
                                                        break;
                                                    case 2:
                                                        c1845j18.setValue(new C5393v2((C5294s2) abstractC5459x2));
                                                        break;
                                                    default:
                                                        c1845j18.setValue(AbstractC4955ho.m9307C4(abstractC5459x2));
                                                        break;
                                                }
                                                return C3967n.f12976a;
                                            }
                                        };
                                        c1836h03.m4545k0(interfaceC1220a11);
                                        obj23 = interfaceC1220a11;
                                    }
                                    c5491y22.m9922y1(activity3, (InterfaceC1220a) obj23, c1836h03, 384);
                                    c1836h03.m4553p(false);
                                } else {
                                    c1836h03.m4525a0(-1316811768);
                                    c1836h03.m4553p(false);
                                }
                            } else {
                                c1836h03.m4519V();
                            }
                            return C3967n.f12976a;
                        }
                    }, c1836h02), c1836h02, 1597824);
                } else {
                    c1836h02.m4519V();
                }
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C5133n6(C1845j1 c1845j1, C1845j1 c1845j12, Activity activity, AbstractC5459x2 abstractC5459x2, C1421q c1421q, C5166o6 c5166o6, C1425u c1425u, ArrayList arrayList, C1425u c1425u2, ViewGroup viewGroup, C0416a1 c0416a1, C3641z c3641z, C1845j1 c1845j13, C1845j1 c1845j14, C1845j1 c1845j15, boolean z9) {
        this.f19107h = c1845j1;
        this.f19108i = c1845j12;
        this.f19109j = activity;
        this.f19110k = abstractC5459x2;
        this.f19111l = c1421q;
        this.f19112m = c5166o6;
        this.f19113n = c1425u;
        this.f19114o = arrayList;
        this.f19115p = c1425u2;
        this.f19116q = viewGroup;
        this.f19117r = c0416a1;
        this.f19118s = c3641z;
        this.f19119t = c1845j13;
        this.f19120u = c1845j14;
        this.f19121v = c1845j15;
        this.f19122w = z9;
    }
}
