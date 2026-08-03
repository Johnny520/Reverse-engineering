package p332wb;

import android.app.Activity;
import bi.AbstractC0316d;
import bi.C0314b;
import java.util.Iterator;
import java.util.List;
import p000a.AbstractC0000a;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p085fg.InterfaceC1236q;
import p117i0.AbstractC1874r;
import p117i0.C1836h0;
import p117i0.C1851l;
import p218og.AbstractC3149m;
import p222p.AbstractC3208d;
import p222p.AbstractC3222h1;
import p222p.AbstractC3226j;
import p222p.AbstractC3253s;
import p222p.C3248q0;
import p222p.C3256t;
import p234q.AbstractC3418a;
import p266s0.AbstractC3879i;
import p266s0.C3878h;
import p276sf.C3958e;
import p276sf.C3967n;
import p339x1.C5601f;
import p339x1.C5660y;
import p339x1.InterfaceC5605g;
import p343x6.AbstractC5700d;
import p356y0.AbstractC5839a;
import p356y0.C5840b;
import p356y0.C5850l;
import p356y0.InterfaceC5853o;
import sh.AbstractC4045s;

/* JADX INFO: renamed from: wb.qu */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5256qu implements InterfaceC1236q {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f20305g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ String f20306h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ EnumC5092lv f20307i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ String f20308j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ List f20309k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Activity f20310l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ InterfaceC1231l f20311m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5256qu(String str, EnumC5092lv enumC5092lv, String str2, List list, Activity activity, InterfaceC1231l interfaceC1231l, int i9) {
        this.f20305g = i9;
        this.f20306h = str;
        this.f20307i = enumC5092lv;
        this.f20308j = str2;
        this.f20309k = list;
        this.f20310l = activity;
        this.f20311m = interfaceC1231l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1236q
    /* JADX INFO: renamed from: b */
    public final Object mo734b(Object obj, Object obj2, Object obj3) {
        switch (this.f20305g) {
            case 0:
                final InterfaceC1220a interfaceC1220a = (InterfaceC1220a) obj;
                C1836h0 c1836h0 = (C1836h0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                interfaceC1220a.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= c1836h0.m4538h(interfaceC1220a) ? 4 : 2;
                }
                if (c1836h0.m4516S(iIntValue & 1, (iIntValue & 19) != 18)) {
                    C5491y2 c5491y2 = C5491y2.f22068p;
                    final int i9 = 1;
                    final String str = this.f20308j;
                    final List list = this.f20309k;
                    final Activity activity = this.f20310l;
                    final InterfaceC1231l interfaceC1231l = this.f20311m;
                    c5491y2.m9866J(this.f20306h, this.f20307i, interfaceC1220a, AbstractC3879i.m8071e(-91761621, new InterfaceC1235p() { // from class: wb.ou
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference failed for: r13v0 */
                        /* JADX WARN: Type inference failed for: r13v1, types: [int] */
                        /* JADX WARN: Type inference failed for: r13v4 */
                        /* JADX WARN: Type inference failed for: r21v0, types: [i0.h0] */
                        /* JADX WARN: Type inference failed for: r4v3, types: [wb.y2] */
                        /* JADX WARN: Type inference failed for: r6v2, types: [i0.h0] */
                        /* JADX WARN: Type inference failed for: r6v30 */
                        /* JADX WARN: Type inference failed for: r6v31 */
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
                        @Override // p085fg.InterfaceC1235p
                        public final Object invoke(Object obj4, Object obj5) {
                            boolean z9;
                            C5850l c5850l;
                            ?? r62;
                            boolean z10;
                            C5850l c5850l2;
                            switch (i9) {
                                case 0:
                                    C1836h0 c1836h02 = (C1836h0) obj4;
                                    int iIntValue2 = ((Integer) obj5).intValue();
                                    if (c1836h02.m4516S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        C5850l c5850l3 = C5850l.f23787a;
                                        InterfaceC5853o interfaceC5853oM6901d = AbstractC3222h1.m6901d(c5850l3, 1.0f);
                                        C3256t c3256tM6935a = AbstractC3253s.m6935a(AbstractC3226j.f10300c, C5840b.f23773s, c1836h02, 0);
                                        int iHashCode = Long.hashCode(c1836h02.f6095T);
                                        C3878h c3878hM4546l = c1836h02.m4546l();
                                        InterfaceC5853o interfaceC5853oM10543c = AbstractC5839a.m10543c(c1836h02, interfaceC5853oM6901d);
                                        InterfaceC5605g.f22815f.getClass();
                                        C5660y c5660y = C5601f.f22758b;
                                        c1836h02.m4531d0();
                                        if (c1836h02.f6094S) {
                                            c1836h02.m4544k(c5660y);
                                        } else {
                                            c1836h02.m4551n0();
                                        }
                                        AbstractC1874r.m4615A(C5601f.f22761e, c1836h02, c3256tM6935a);
                                        AbstractC1874r.m4615A(C5601f.f22760d, c1836h02, c3878hM4546l);
                                        AbstractC1874r.m4615A(C5601f.f22762f, c1836h02, Integer.valueOf(iHashCode));
                                        AbstractC1874r.m4641w(C5601f.f22763g, c1836h02);
                                        AbstractC1874r.m4615A(C5601f.f22759c, c1836h02, interfaceC5853oM10543c);
                                        String str2 = str;
                                        if (AbstractC3149m.m6721t0(str2)) {
                                            z9 = false;
                                            c5850l = c5850l3;
                                            c1836h02.m4525a0(1526164831);
                                            c1836h02.m4553p(false);
                                            r62 = c1836h02;
                                        } else {
                                            c1836h02.m4525a0(1525840168);
                                            c5850l = c5850l3;
                                            z9 = false;
                                            AbstractC4045s.m8250n(str2, AbstractC3208d.m6886p(c5850l3, 4, 0.0f, 0.0f, 10, 6), ((C0314b) c1836h02.m4542j(AbstractC0316d.f944a)).m1238h(), AbstractC5700d.m10248D(13), null, null, 0L, null, 0L, 0, false, 0, 0, null, null, c1836h02, 24624, 0, 262120);
                                            C1836h0 c1836h03 = c1836h02;
                                            c1836h03.m4553p(false);
                                            r62 = c1836h03;
                                        }
                                        r62.m4525a0(-504956868);
                                        Iterator it = list.iterator();
                                        ?? r13 = z9;
                                        while (true) {
                                            boolean zHasNext = it.hasNext();
                                            InterfaceC1220a interfaceC1220a2 = interfaceC1220a;
                                            if (zHasNext) {
                                                Object next = it.next();
                                                int i10 = r13 + 1;
                                                if (r13 < 0) {
                                                    AbstractC0000a.m32Q0();
                                                    throw null;
                                                }
                                                C3958e c3958e = (C3958e) next;
                                                ?? r42 = C5491y2.f22068p;
                                                String str3 = (String) c3958e.f12961g;
                                                String str4 = (String) c3958e.f12962h;
                                                boolean zM4534f = r62.m4534f(interfaceC1220a2);
                                                Activity activity2 = activity;
                                                boolean zM4538h = zM4534f | r62.m4538h(activity2);
                                                InterfaceC1231l interfaceC1231l2 = interfaceC1231l;
                                                boolean zM4534f2 = zM4538h | r62.m4534f(interfaceC1231l2) | r62.m4530d(r13);
                                                Object objM4514P = r62.m4514P();
                                                if (zM4534f2 || objM4514P == C1851l.f6155a) {
                                                    objM4514P = new C5223pu(interfaceC1220a2, activity2, interfaceC1231l2, r13, 0);
                                                    r62.m4545k0(objM4514P);
                                                }
                                                r42.m9923z(str3, str4, (InterfaceC1220a) objM4514P, r62, 3072);
                                                r13 = i10;
                                            } else {
                                                r62.m4553p(z9);
                                                ?? r21 = r62;
                                                AbstractC4045s.m8251o("取消", interfaceC1220a2, AbstractC3222h1.m6904g(AbstractC3208d.m6886p(AbstractC3222h1.m6901d(c5850l, 1.0f), 0.0f, 8, 0.0f, 6, 5), 44, 0.0f, 2), false, 0.0f, 0.0f, 0.0f, null, null, r21, 390, 2040);
                                                r21.m4553p(true);
                                            }
                                        }
                                    } else {
                                        c1836h02.m4519V();
                                    }
                                    return C3967n.f12976a;
                                default:
                                    C1836h0 c1836h04 = (C1836h0) obj4;
                                    int iIntValue3 = ((Integer) obj5).intValue();
                                    if (c1836h04.m4516S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                        C5850l c5850l4 = C5850l.f23787a;
                                        InterfaceC5853o interfaceC5853oM6904g = AbstractC3222h1.m6904g(AbstractC3222h1.m6901d(c5850l4, 1.0f), 0.0f, 620, 1);
                                        C3256t c3256tM6935a2 = AbstractC3253s.m6935a(AbstractC3226j.f10300c, C5840b.f23773s, c1836h04, 0);
                                        int iHashCode2 = Long.hashCode(c1836h04.f6095T);
                                        C3878h c3878hM4546l2 = c1836h04.m4546l();
                                        InterfaceC5853o interfaceC5853oM10543c2 = AbstractC5839a.m10543c(c1836h04, interfaceC5853oM6904g);
                                        InterfaceC5605g.f22815f.getClass();
                                        C5660y c5660y2 = C5601f.f22758b;
                                        c1836h04.m4531d0();
                                        if (c1836h04.f6094S) {
                                            c1836h04.m4544k(c5660y2);
                                        } else {
                                            c1836h04.m4551n0();
                                        }
                                        AbstractC1874r.m4615A(C5601f.f22761e, c1836h04, c3256tM6935a2);
                                        AbstractC1874r.m4615A(C5601f.f22760d, c1836h04, c3878hM4546l2);
                                        AbstractC1874r.m4615A(C5601f.f22762f, c1836h04, Integer.valueOf(iHashCode2));
                                        AbstractC1874r.m4641w(C5601f.f22763g, c1836h04);
                                        AbstractC1874r.m4615A(C5601f.f22759c, c1836h04, interfaceC5853oM10543c2);
                                        String str5 = str;
                                        if (AbstractC3149m.m6721t0(str5)) {
                                            z10 = false;
                                            c5850l2 = c5850l4;
                                            c1836h04.m4525a0(-514909599);
                                            c1836h04.m4553p(false);
                                        } else {
                                            c1836h04.m4525a0(-515234262);
                                            z10 = false;
                                            c5850l2 = c5850l4;
                                            AbstractC4045s.m8250n(str5, AbstractC3208d.m6886p(c5850l4, 4, 0.0f, 0.0f, 10, 6), ((C0314b) c1836h04.m4542j(AbstractC0316d.f944a)).m1238h(), AbstractC5700d.m10248D(13), null, null, 0L, null, 0L, 0, false, 0, 0, null, null, c1836h04, 24624, 0, 262120);
                                            c1836h04 = c1836h04;
                                            c1836h04.m4553p(false);
                                        }
                                        InterfaceC5853o interfaceC5853oM6901d2 = AbstractC3222h1.m6901d(c5850l2, 1.0f);
                                        if (1.0f <= 0.0d) {
                                            AbstractC3418a.m7194a("invalid weight; must be greater than zero");
                                        }
                                        InterfaceC5853o interfaceC5853oMo10549d = interfaceC5853oM6901d2.mo10549d(new C3248q0(1.0f, z10));
                                        List list2 = list;
                                        boolean zM4538h2 = c1836h04.m4538h(list2);
                                        InterfaceC1220a interfaceC1220a3 = interfaceC1220a;
                                        boolean zM4534f3 = zM4538h2 | c1836h04.m4534f(interfaceC1220a3);
                                        Activity activity3 = activity;
                                        boolean zM4538h3 = zM4534f3 | c1836h04.m4538h(activity3);
                                        InterfaceC1231l interfaceC1231l3 = interfaceC1231l;
                                        boolean zM4534f4 = zM4538h3 | c1836h04.m4534f(interfaceC1231l3);
                                        Object objM4514P2 = c1836h04.m4514P();
                                        if (zM4534f4 || objM4514P2 == C1851l.f6155a) {
                                            objM4514P2 = new C5320ss(list2, interfaceC1220a3, activity3, interfaceC1231l3);
                                            c1836h04.m4545k0(objM4514P2);
                                        }
                                        AbstractC0000a.m53b(interfaceC5853oMo10549d, null, null, null, null, null, false, null, (InterfaceC1231l) objM4514P2, c1836h04, 0, 510);
                                        AbstractC4045s.m8251o("取消", interfaceC1220a3, AbstractC3222h1.m6904g(AbstractC3208d.m6886p(AbstractC3222h1.m6901d(c5850l2, 1.0f), 0.0f, 8, 0.0f, 6, 5), 44, 0.0f, 2), false, 0.0f, 0.0f, 0.0f, null, null, c1836h04, 390, 2040);
                                        c1836h04.m4553p(true);
                                    } else {
                                        c1836h04.m4519V();
                                    }
                                    return C3967n.f12976a;
                            }
                        }
                    }, c1836h0), c1836h0, ((iIntValue << 9) & 7168) | 221190);
                } else {
                    c1836h0.m4519V();
                }
                break;
            default:
                final InterfaceC1220a interfaceC1220a2 = (InterfaceC1220a) obj;
                C1836h0 c1836h02 = (C1836h0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                interfaceC1220a2.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= c1836h02.m4538h(interfaceC1220a2) ? 4 : 2;
                }
                if (c1836h02.m4516S(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    C5491y2 c5491y22 = C5491y2.f22068p;
                    final int i10 = 0;
                    final String str2 = this.f20308j;
                    final List list2 = this.f20309k;
                    final Activity activity2 = this.f20310l;
                    final InterfaceC1231l interfaceC1231l2 = this.f20311m;
                    c5491y22.m9866J(this.f20306h, this.f20307i, interfaceC1220a2, AbstractC3879i.m8071e(141518573, new InterfaceC1235p() { // from class: wb.ou
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference failed for: r13v0 */
                        /* JADX WARN: Type inference failed for: r13v1, types: [int] */
                        /* JADX WARN: Type inference failed for: r13v4 */
                        /* JADX WARN: Type inference failed for: r21v0, types: [i0.h0] */
                        /* JADX WARN: Type inference failed for: r4v3, types: [wb.y2] */
                        /* JADX WARN: Type inference failed for: r6v2, types: [i0.h0] */
                        /* JADX WARN: Type inference failed for: r6v30 */
                        /* JADX WARN: Type inference failed for: r6v31 */
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
                        @Override // p085fg.InterfaceC1235p
                        public final Object invoke(Object obj4, Object obj5) {
                            boolean z9;
                            C5850l c5850l;
                            ?? r62;
                            boolean z10;
                            C5850l c5850l2;
                            switch (i10) {
                                case 0:
                                    C1836h0 c1836h022 = (C1836h0) obj4;
                                    int iIntValue22 = ((Integer) obj5).intValue();
                                    if (c1836h022.m4516S(iIntValue22 & 1, (iIntValue22 & 3) != 2)) {
                                        C5850l c5850l3 = C5850l.f23787a;
                                        InterfaceC5853o interfaceC5853oM6901d = AbstractC3222h1.m6901d(c5850l3, 1.0f);
                                        C3256t c3256tM6935a = AbstractC3253s.m6935a(AbstractC3226j.f10300c, C5840b.f23773s, c1836h022, 0);
                                        int iHashCode = Long.hashCode(c1836h022.f6095T);
                                        C3878h c3878hM4546l = c1836h022.m4546l();
                                        InterfaceC5853o interfaceC5853oM10543c = AbstractC5839a.m10543c(c1836h022, interfaceC5853oM6901d);
                                        InterfaceC5605g.f22815f.getClass();
                                        C5660y c5660y = C5601f.f22758b;
                                        c1836h022.m4531d0();
                                        if (c1836h022.f6094S) {
                                            c1836h022.m4544k(c5660y);
                                        } else {
                                            c1836h022.m4551n0();
                                        }
                                        AbstractC1874r.m4615A(C5601f.f22761e, c1836h022, c3256tM6935a);
                                        AbstractC1874r.m4615A(C5601f.f22760d, c1836h022, c3878hM4546l);
                                        AbstractC1874r.m4615A(C5601f.f22762f, c1836h022, Integer.valueOf(iHashCode));
                                        AbstractC1874r.m4641w(C5601f.f22763g, c1836h022);
                                        AbstractC1874r.m4615A(C5601f.f22759c, c1836h022, interfaceC5853oM10543c);
                                        String str22 = str2;
                                        if (AbstractC3149m.m6721t0(str22)) {
                                            z9 = false;
                                            c5850l = c5850l3;
                                            c1836h022.m4525a0(1526164831);
                                            c1836h022.m4553p(false);
                                            r62 = c1836h022;
                                        } else {
                                            c1836h022.m4525a0(1525840168);
                                            c5850l = c5850l3;
                                            z9 = false;
                                            AbstractC4045s.m8250n(str22, AbstractC3208d.m6886p(c5850l3, 4, 0.0f, 0.0f, 10, 6), ((C0314b) c1836h022.m4542j(AbstractC0316d.f944a)).m1238h(), AbstractC5700d.m10248D(13), null, null, 0L, null, 0L, 0, false, 0, 0, null, null, c1836h022, 24624, 0, 262120);
                                            C1836h0 c1836h03 = c1836h022;
                                            c1836h03.m4553p(false);
                                            r62 = c1836h03;
                                        }
                                        r62.m4525a0(-504956868);
                                        Iterator it = list2.iterator();
                                        ?? r13 = z9;
                                        while (true) {
                                            boolean zHasNext = it.hasNext();
                                            InterfaceC1220a interfaceC1220a22 = interfaceC1220a2;
                                            if (zHasNext) {
                                                Object next = it.next();
                                                int i102 = r13 + 1;
                                                if (r13 < 0) {
                                                    AbstractC0000a.m32Q0();
                                                    throw null;
                                                }
                                                C3958e c3958e = (C3958e) next;
                                                ?? r42 = C5491y2.f22068p;
                                                String str3 = (String) c3958e.f12961g;
                                                String str4 = (String) c3958e.f12962h;
                                                boolean zM4534f = r62.m4534f(interfaceC1220a22);
                                                Activity activity22 = activity2;
                                                boolean zM4538h = zM4534f | r62.m4538h(activity22);
                                                InterfaceC1231l interfaceC1231l22 = interfaceC1231l2;
                                                boolean zM4534f2 = zM4538h | r62.m4534f(interfaceC1231l22) | r62.m4530d(r13);
                                                Object objM4514P = r62.m4514P();
                                                if (zM4534f2 || objM4514P == C1851l.f6155a) {
                                                    objM4514P = new C5223pu(interfaceC1220a22, activity22, interfaceC1231l22, r13, 0);
                                                    r62.m4545k0(objM4514P);
                                                }
                                                r42.m9923z(str3, str4, (InterfaceC1220a) objM4514P, r62, 3072);
                                                r13 = i102;
                                            } else {
                                                r62.m4553p(z9);
                                                ?? r21 = r62;
                                                AbstractC4045s.m8251o("取消", interfaceC1220a22, AbstractC3222h1.m6904g(AbstractC3208d.m6886p(AbstractC3222h1.m6901d(c5850l, 1.0f), 0.0f, 8, 0.0f, 6, 5), 44, 0.0f, 2), false, 0.0f, 0.0f, 0.0f, null, null, r21, 390, 2040);
                                                r21.m4553p(true);
                                            }
                                        }
                                    } else {
                                        c1836h022.m4519V();
                                    }
                                    return C3967n.f12976a;
                                default:
                                    C1836h0 c1836h04 = (C1836h0) obj4;
                                    int iIntValue3 = ((Integer) obj5).intValue();
                                    if (c1836h04.m4516S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                        C5850l c5850l4 = C5850l.f23787a;
                                        InterfaceC5853o interfaceC5853oM6904g = AbstractC3222h1.m6904g(AbstractC3222h1.m6901d(c5850l4, 1.0f), 0.0f, 620, 1);
                                        C3256t c3256tM6935a2 = AbstractC3253s.m6935a(AbstractC3226j.f10300c, C5840b.f23773s, c1836h04, 0);
                                        int iHashCode2 = Long.hashCode(c1836h04.f6095T);
                                        C3878h c3878hM4546l2 = c1836h04.m4546l();
                                        InterfaceC5853o interfaceC5853oM10543c2 = AbstractC5839a.m10543c(c1836h04, interfaceC5853oM6904g);
                                        InterfaceC5605g.f22815f.getClass();
                                        C5660y c5660y2 = C5601f.f22758b;
                                        c1836h04.m4531d0();
                                        if (c1836h04.f6094S) {
                                            c1836h04.m4544k(c5660y2);
                                        } else {
                                            c1836h04.m4551n0();
                                        }
                                        AbstractC1874r.m4615A(C5601f.f22761e, c1836h04, c3256tM6935a2);
                                        AbstractC1874r.m4615A(C5601f.f22760d, c1836h04, c3878hM4546l2);
                                        AbstractC1874r.m4615A(C5601f.f22762f, c1836h04, Integer.valueOf(iHashCode2));
                                        AbstractC1874r.m4641w(C5601f.f22763g, c1836h04);
                                        AbstractC1874r.m4615A(C5601f.f22759c, c1836h04, interfaceC5853oM10543c2);
                                        String str5 = str2;
                                        if (AbstractC3149m.m6721t0(str5)) {
                                            z10 = false;
                                            c5850l2 = c5850l4;
                                            c1836h04.m4525a0(-514909599);
                                            c1836h04.m4553p(false);
                                        } else {
                                            c1836h04.m4525a0(-515234262);
                                            z10 = false;
                                            c5850l2 = c5850l4;
                                            AbstractC4045s.m8250n(str5, AbstractC3208d.m6886p(c5850l4, 4, 0.0f, 0.0f, 10, 6), ((C0314b) c1836h04.m4542j(AbstractC0316d.f944a)).m1238h(), AbstractC5700d.m10248D(13), null, null, 0L, null, 0L, 0, false, 0, 0, null, null, c1836h04, 24624, 0, 262120);
                                            c1836h04 = c1836h04;
                                            c1836h04.m4553p(false);
                                        }
                                        InterfaceC5853o interfaceC5853oM6901d2 = AbstractC3222h1.m6901d(c5850l2, 1.0f);
                                        if (1.0f <= 0.0d) {
                                            AbstractC3418a.m7194a("invalid weight; must be greater than zero");
                                        }
                                        InterfaceC5853o interfaceC5853oMo10549d = interfaceC5853oM6901d2.mo10549d(new C3248q0(1.0f, z10));
                                        List list22 = list2;
                                        boolean zM4538h2 = c1836h04.m4538h(list22);
                                        InterfaceC1220a interfaceC1220a3 = interfaceC1220a2;
                                        boolean zM4534f3 = zM4538h2 | c1836h04.m4534f(interfaceC1220a3);
                                        Activity activity3 = activity2;
                                        boolean zM4538h3 = zM4534f3 | c1836h04.m4538h(activity3);
                                        InterfaceC1231l interfaceC1231l3 = interfaceC1231l2;
                                        boolean zM4534f4 = zM4538h3 | c1836h04.m4534f(interfaceC1231l3);
                                        Object objM4514P2 = c1836h04.m4514P();
                                        if (zM4534f4 || objM4514P2 == C1851l.f6155a) {
                                            objM4514P2 = new C5320ss(list22, interfaceC1220a3, activity3, interfaceC1231l3);
                                            c1836h04.m4545k0(objM4514P2);
                                        }
                                        AbstractC0000a.m53b(interfaceC5853oMo10549d, null, null, null, null, null, false, null, (InterfaceC1231l) objM4514P2, c1836h04, 0, 510);
                                        AbstractC4045s.m8251o("取消", interfaceC1220a3, AbstractC3222h1.m6904g(AbstractC3208d.m6886p(AbstractC3222h1.m6901d(c5850l2, 1.0f), 0.0f, 8, 0.0f, 6, 5), 44, 0.0f, 2), false, 0.0f, 0.0f, 0.0f, null, null, c1836h04, 390, 2040);
                                        c1836h04.m4553p(true);
                                    } else {
                                        c1836h04.m4519V();
                                    }
                                    return C3967n.f12976a;
                            }
                        }
                    }, c1836h02), c1836h02, ((iIntValue2 << 9) & 7168) | 221190);
                } else {
                    c1836h02.m4519V();
                }
                break;
        }
        return C3967n.f12976a;
    }
}
