package p332wb;

import android.app.Activity;
import bi.AbstractC0316d;
import bi.C0314b;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1236q;
import p117i0.AbstractC1874r;
import p117i0.C1823e;
import p117i0.C1836h0;
import p117i0.C1851l;
import p176m1.C2730f;
import p218og.AbstractC3149m;
import p222p.AbstractC3199a;
import p222p.AbstractC3208d;
import p222p.AbstractC3210d1;
import p222p.AbstractC3222h1;
import p222p.AbstractC3226j;
import p222p.C3213e1;
import p222p.C3248q0;
import p234q.AbstractC3418a;
import p251r.C3619d;
import p266s0.C3878h;
import p276sf.C3958e;
import p276sf.C3967n;
import p276sf.InterfaceC3955b;
import p339x1.C5601f;
import p339x1.C5660y;
import p339x1.InterfaceC5605g;
import p343x6.AbstractC5700d;
import p356y0.AbstractC5839a;
import p356y0.C5840b;
import p356y0.C5850l;
import p356y0.InterfaceC5853o;
import sh.AbstractC4045s;

/* JADX INFO: renamed from: wb.fs */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4893fs implements InterfaceC1236q {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f17282g = 0;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC1231l f17283h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f17284i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f17285j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ InterfaceC3955b f17286k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f17287l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C4893fs(int i9, InterfaceC1231l interfaceC1231l, C5288rt c5288rt, InterfaceC1231l interfaceC1231l2, InterfaceC1231l interfaceC1231l3) {
        this.f17284i = i9;
        this.f17283h = interfaceC1231l;
        this.f17287l = c5288rt;
        this.f17285j = interfaceC1231l2;
        this.f17286k = interfaceC1231l3;
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
    @Override // p085fg.InterfaceC1236q
    /* JADX INFO: renamed from: b */
    public final Object mo734b(Object obj, Object obj2, Object obj3) {
        switch (this.f17282g) {
            case 0:
                final C5288rt c5288rt = (C5288rt) this.f17287l;
                final InterfaceC1231l interfaceC1231l = (InterfaceC1231l) this.f17285j;
                final InterfaceC1231l interfaceC1231l2 = (InterfaceC1231l) this.f17286k;
                C1836h0 c1836h0 = (C1836h0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h0.m4516S(iIntValue & 1, (iIntValue & 17) != 16)) {
                    if (this.f17284i > 0) {
                        c1836h0.m4525a0(-1433894678);
                        AbstractC4955ho.m9312D1(0.0f, c1836h0, 0, 1);
                    } else {
                        c1836h0.m4525a0(-1501048602);
                    }
                    c1836h0.m4553p(false);
                    float f3 = 5;
                    InterfaceC5853o interfaceC5853oM6885o = AbstractC3208d.m6885o(AbstractC3222h1.m6901d(C5850l.f23787a, 1.0f), 10, f3, 6, f3);
                    C3213e1 c3213e1M6892a = AbstractC3210d1.m6892a(AbstractC3226j.f10298a, C5840b.f23771q, c1836h0, 48);
                    int iHashCode = Long.hashCode(c1836h0.f6095T);
                    C3878h c3878hM4546l = c1836h0.m4546l();
                    InterfaceC5853o interfaceC5853oM10543c = AbstractC5839a.m10543c(c1836h0, interfaceC5853oM6885o);
                    InterfaceC5605g.f22815f.getClass();
                    C5660y c5660y = C5601f.f22758b;
                    c1836h0.m4531d0();
                    if (c1836h0.f6094S) {
                        c1836h0.m4544k(c5660y);
                    } else {
                        c1836h0.m4551n0();
                    }
                    AbstractC1874r.m4615A(C5601f.f22761e, c1836h0, c3213e1M6892a);
                    AbstractC1874r.m4615A(C5601f.f22760d, c1836h0, c3878hM4546l);
                    AbstractC1874r.m4615A(C5601f.f22762f, c1836h0, Integer.valueOf(iHashCode));
                    AbstractC1874r.m4641w(C5601f.f22763g, c1836h0);
                    AbstractC1874r.m4615A(C5601f.f22759c, c1836h0, interfaceC5853oM10543c);
                    StringBuilder sb2 = new StringBuilder();
                    if (c5288rt.f20538d != null) {
                        sb2.append("引用 · ");
                    }
                    String strM6836i = c5288rt.f20536b;
                    if (AbstractC3149m.m6721t0(strM6836i)) {
                        strM6836i = AbstractC3199a.m6836i(c5288rt.f20537c.size(), " 个附件");
                    }
                    sb2.append(strM6836i);
                    String string = sb2.toString();
                    long jM1238h = ((C0314b) c1836h0.m4542j(AbstractC0316d.f944a)).m1238h();
                    long jM10248D = AbstractC5700d.m10248D(12);
                    if (1.0f <= 0.0d) {
                        AbstractC3418a.m7194a("invalid weight; must be greater than zero");
                    }
                    AbstractC4045s.m8250n(string, new C3248q0(1.0f, true), jM1238h, jM10248D, null, null, 0L, null, 0L, 2, false, 1, 0, null, null, c1836h0, 24576, 24960, 241640);
                    C5491y2 c5491y2 = C5491y2.f22066n;
                    C2730f c2730f = AbstractC4726ap.f15870r;
                    final InterfaceC1231l interfaceC1231l3 = this.f17283h;
                    boolean zM4534f = c1836h0.m4534f(interfaceC1231l3) | c1836h0.m4538h(c5288rt);
                    Object objM4514P = c1836h0.m4514P();
                    C1823e c1823e = C1851l.f6155a;
                    if (zM4534f || objM4514P == c1823e) {
                        final int i9 = 0;
                        objM4514P = new InterfaceC1220a() { // from class: wb.is
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            @Override // p085fg.InterfaceC1220a
                            public final Object invoke() {
                                switch (i9) {
                                    case 0:
                                        interfaceC1231l3.invoke(Long.valueOf(c5288rt.f20535a));
                                        break;
                                    case 1:
                                        interfaceC1231l3.invoke(Long.valueOf(c5288rt.f20535a));
                                        break;
                                    default:
                                        interfaceC1231l3.invoke(Long.valueOf(c5288rt.f20535a));
                                        break;
                                }
                                return C3967n.f12976a;
                            }
                        };
                        c1836h0.m4545k0(objM4514P);
                    }
                    c5491y2.m9894h0(c2730f, "编辑待发送消息", (InterfaceC1220a) objM4514P, c1836h0, 3126);
                    C2730f c2730f2 = AbstractC4726ap.f15864l;
                    boolean zM4534f2 = c1836h0.m4534f(interfaceC1231l) | c1836h0.m4538h(c5288rt);
                    Object objM4514P2 = c1836h0.m4514P();
                    if (zM4534f2 || objM4514P2 == c1823e) {
                        final int i10 = 1;
                        objM4514P2 = new InterfaceC1220a() { // from class: wb.is
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            @Override // p085fg.InterfaceC1220a
                            public final Object invoke() {
                                switch (i10) {
                                    case 0:
                                        interfaceC1231l.invoke(Long.valueOf(c5288rt.f20535a));
                                        break;
                                    case 1:
                                        interfaceC1231l.invoke(Long.valueOf(c5288rt.f20535a));
                                        break;
                                    default:
                                        interfaceC1231l.invoke(Long.valueOf(c5288rt.f20535a));
                                        break;
                                }
                                return C3967n.f12976a;
                            }
                        };
                        c1836h0.m4545k0(objM4514P2);
                    }
                    c5491y2.m9894h0(c2730f2, "立即发送", (InterfaceC1220a) objM4514P2, c1836h0, 3126);
                    C2730f c2730f3 = AbstractC4726ap.f15871s;
                    boolean zM4534f3 = c1836h0.m4534f(interfaceC1231l2) | c1836h0.m4538h(c5288rt);
                    Object objM4514P3 = c1836h0.m4514P();
                    if (zM4534f3 || objM4514P3 == c1823e) {
                        final int i11 = 2;
                        objM4514P3 = new InterfaceC1220a() { // from class: wb.is
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            @Override // p085fg.InterfaceC1220a
                            public final Object invoke() {
                                switch (i11) {
                                    case 0:
                                        interfaceC1231l2.invoke(Long.valueOf(c5288rt.f20535a));
                                        break;
                                    case 1:
                                        interfaceC1231l2.invoke(Long.valueOf(c5288rt.f20535a));
                                        break;
                                    default:
                                        interfaceC1231l2.invoke(Long.valueOf(c5288rt.f20535a));
                                        break;
                                }
                                return C3967n.f12976a;
                            }
                        };
                        c1836h0.m4545k0(objM4514P3);
                    }
                    c5491y2.m9894h0(c2730f3, "删除待发送消息", (InterfaceC1220a) objM4514P3, c1836h0, 3126);
                    c1836h0.m4553p(true);
                } else {
                    c1836h0.m4519V();
                }
                break;
            default:
                C3958e c3958e = (C3958e) this.f17285j;
                InterfaceC1220a interfaceC1220a = (InterfaceC1220a) this.f17286k;
                Activity activity = (Activity) this.f17287l;
                C1836h0 c1836h02 = (C1836h0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h02.m4516S(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    C5491y2 c5491y22 = C5491y2.f22068p;
                    String str = (String) c3958e.f12961g;
                    String str2 = (String) c3958e.f12962h;
                    boolean zM4534f4 = c1836h02.m4534f(interfaceC1220a) | c1836h02.m4538h(activity);
                    InterfaceC1231l interfaceC1231l4 = this.f17283h;
                    boolean zM4534f5 = zM4534f4 | c1836h02.m4534f(interfaceC1231l4);
                    int i12 = this.f17284i;
                    boolean zM4530d = zM4534f5 | c1836h02.m4530d(i12);
                    Object objM4514P4 = c1836h02.m4514P();
                    if (zM4530d || objM4514P4 == C1851l.f6155a) {
                        C5223pu c5223pu = new C5223pu(interfaceC1220a, activity, interfaceC1231l4, i12, 1);
                        c1836h02.m4545k0(c5223pu);
                        objM4514P4 = c5223pu;
                    }
                    c5491y22.m9923z(str, str2, (InterfaceC1220a) objM4514P4, c1836h02, 3072);
                } else {
                    c1836h02.m4519V();
                }
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C4893fs(C3958e c3958e, InterfaceC1220a interfaceC1220a, Activity activity, InterfaceC1231l interfaceC1231l, int i9) {
        this.f17285j = c3958e;
        this.f17286k = interfaceC1220a;
        this.f17287l = activity;
        this.f17283h = interfaceC1231l;
        this.f17284i = i9;
    }
}
