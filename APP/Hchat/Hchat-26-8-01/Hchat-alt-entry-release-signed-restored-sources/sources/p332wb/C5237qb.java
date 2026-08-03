package p332wb;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import okhttp3.HttpUrl;
import p020b5.C0184c;
import p036c9.C0455k0;
import p065eb.C0859c0;
import p080fb.C1109c1;
import p080fb.C1113d1;
import p080fb.C1161p1;
import p080fb.C1192y;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1237r;
import p100h0.C1541o0;
import p117i0.C1823e;
import p117i0.C1836h0;
import p117i0.C1845j1;
import p117i0.C1851l;
import p117i0.InterfaceC1809a1;
import p218og.AbstractC3149m;
import p222p.AbstractC3199a;
import p249qg.InterfaceC3599t;
import p251r.C3619d;
import p251r.C3623h;
import p251r.C3633r;
import p266s0.C3874d;
import p276sf.C3967n;
import p345x8.C5725r;
import p345x8.C5728u;
import tf.AbstractC4166m;
import tf.C4173t;

/* JADX INFO: renamed from: wb.qb */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5237qb implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f20153g = 1;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC1809a1 f20154h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f20155i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC1809a1 f20156j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ InterfaceC1809a1 f20157k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ InterfaceC1809a1 f20158l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ InterfaceC1809a1 f20159m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ InterfaceC1809a1 f20160n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ InterfaceC1809a1 f20161o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ Object f20162p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ Object f20163q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ Object f20164r;

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ Object f20165s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5237qb(InterfaceC1809a1 interfaceC1809a1, Context context, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, C5725r c5725r, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC1809a1 interfaceC1809a17, InterfaceC1809a1 interfaceC1809a18, InterfaceC1809a1 interfaceC1809a19, InterfaceC1809a1 interfaceC1809a110) {
        this.f20154h = interfaceC1809a1;
        this.f20155i = context;
        this.f20156j = interfaceC1809a12;
        this.f20157k = interfaceC1809a13;
        this.f20162p = c5725r;
        this.f20158l = interfaceC1809a14;
        this.f20159m = interfaceC1809a15;
        this.f20160n = interfaceC1809a16;
        this.f20161o = interfaceC1809a17;
        this.f20163q = interfaceC1809a18;
        this.f20164r = interfaceC1809a19;
        this.f20165s = interfaceC1809a110;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        C5237qb c5237qb = this;
        switch (c5237qb.f20153g) {
            case 0:
                C4969i5 c4969i5 = (C4969i5) c5237qb.f20162p;
                String str = (String) c5237qb.f20163q;
                List list = (List) c5237qb.f20164r;
                InterfaceC1220a interfaceC1220a = (InterfaceC1220a) c5237qb.f20165s;
                Context context = (Context) c5237qb.f20155i;
                C3623h c3623h = (C3623h) obj;
                c3623h.getClass();
                C3623h.m7604a(c3623h, null, AbstractC5193p0.f19731b3, 3);
                C3623h.m7604a(c3623h, null, new C3874d(1870362, new C0455k0(str, c4969i5, c5237qb.f20154h, c5237qb.f20156j), true), 3);
                C3623h.m7604a(c3623h, null, AbstractC5193p0.f19739c3, 3);
                InterfaceC1809a1 interfaceC1809a1 = c5237qb.f20157k;
                InterfaceC1809a1 interfaceC1809a12 = c5237qb.f20158l;
                InterfaceC1809a1 interfaceC1809a13 = c5237qb.f20159m;
                InterfaceC1809a1 interfaceC1809a14 = c5237qb.f20160n;
                InterfaceC1809a1 interfaceC1809a15 = c5237qb.f20161o;
                C3623h.m7604a(c3623h, null, new C3874d(-683897256, new C4779cc(list, interfaceC1809a1, interfaceC1809a12, interfaceC1809a13, interfaceC1809a14, interfaceC1809a15, 0), true), 3);
                C3623h.m7604a(c3623h, null, AbstractC5193p0.f19747d3, 3);
                C3623h.m7604a(c3623h, null, new C3874d(-1369664874, new C4779cc(interfaceC1809a12, interfaceC1809a13, interfaceC1809a14, interfaceC1809a15, interfaceC1809a1, list, 1), true), 3);
                if (c4969i5.f17773c) {
                    C3623h.m7604a(c3623h, null, AbstractC5193p0.f19755e3, 3);
                    C3623h.m7604a(c3623h, null, new C3874d(-1430460705, new C4812dc(interfaceC1220a, context, 0), true), 3);
                }
                return C3967n.f12976a;
            case 1:
                Context context2 = (Context) c5237qb.f20155i;
                C5725r c5725r = (C5725r) c5237qb.f20162p;
                InterfaceC1809a1 interfaceC1809a16 = (InterfaceC1809a1) c5237qb.f20163q;
                InterfaceC1809a1 interfaceC1809a17 = (InterfaceC1809a1) c5237qb.f20164r;
                InterfaceC1809a1 interfaceC1809a18 = (InterfaceC1809a1) c5237qb.f20165s;
                C3623h c3623h2 = (C3623h) obj;
                c3623h2.getClass();
                C3623h.m7604a(c3623h2, null, AbstractC5193p0.f19841p1, 3);
                InterfaceC1809a1 interfaceC1809a19 = c5237qb.f20154h;
                Iterator it = ((List) interfaceC1809a19.getValue()).iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    InterfaceC1809a1 interfaceC1809a110 = c5237qb.f20156j;
                    InterfaceC1809a1 interfaceC1809a111 = c5237qb.f20157k;
                    if (!zHasNext) {
                        C3623h.m7604a(c3623h2, null, AbstractC5193p0.f19849q1, 3);
                        C3623h.m7604a(c3623h2, null, new C3874d(-1361823770, new C5397v6(c5725r, context2, c5237qb.f20158l, c5237qb.f20159m, c5237qb.f20160n, c5237qb.f20161o, interfaceC1809a16, interfaceC1809a17, interfaceC1809a18, interfaceC1809a19, interfaceC1809a110, interfaceC1809a111, 4), true), 3);
                        return C3967n.f12976a;
                    }
                    C3623h.m7604a(c3623h2, null, new C3874d(-823701187, new C0455k0((C5728u) it.next(), context2, interfaceC1809a110, interfaceC1809a111, 15), true), 3);
                    it = it;
                }
                break;
            case 2:
                List list2 = (List) c5237qb.f20164r;
                InterfaceC3599t interfaceC3599t = (InterfaceC3599t) c5237qb.f20162p;
                Context context3 = (Context) c5237qb.f20155i;
                C5725r c5725r2 = (C5725r) c5237qb.f20163q;
                InterfaceC1809a1 interfaceC1809a112 = (InterfaceC1809a1) c5237qb.f20165s;
                C3623h c3623h3 = (C3623h) obj;
                c3623h3.getClass();
                int i9 = 3;
                C3623h.m7604a(c3623h3, null, AbstractC5193p0.f19857r1, 3);
                InterfaceC1809a1 interfaceC1809a113 = c5237qb.f20154h;
                boolean z9 = true;
                C3623h.m7604a(c3623h3, null, new C3874d(1321929638, new C4833e1(interfaceC1809a113, c5237qb.f20156j, interfaceC3599t, context3, c5237qb.f20157k, c5237qb.f20158l), true), 3);
                if (list2.isEmpty()) {
                    C3623h.m7604a(c3623h3, null, AbstractC5193p0.f19873t1, 3);
                } else {
                    C3623h.m7604a(c3623h3, null, new C3874d(155384266, new C5140nd(3, list2), true), 3);
                    C3623h.m7604a(c3623h3, null, new C3874d(-1127904447, new C5373uf(c5237qb.f20159m, 0), true), 3);
                    Iterator it2 = AbstractC4166m.m8403L1(80, list2).iterator();
                    while (it2.hasNext()) {
                        Context context4 = context3;
                        int i10 = i9;
                        boolean z10 = z9;
                        InterfaceC1809a1 interfaceC1809a114 = interfaceC1809a113;
                        context3 = context4;
                        C3623h.m7604a(c3623h3, null, new C3874d(1723992888, new C5495y6((String) it2.next(), context4, c5237qb.f20160n, c5725r2, interfaceC1809a114, c5237qb.f20161o, interfaceC1809a112), z10), i10);
                        z9 = z10;
                        i9 = i10;
                        interfaceC1809a113 = interfaceC1809a114;
                    }
                }
                return C3967n.f12976a;
            case 3:
                final ArrayList arrayList = (ArrayList) c5237qb.f20162p;
                final Context context5 = (Context) c5237qb.f20155i;
                final InterfaceC1809a1 interfaceC1809a115 = (InterfaceC1809a1) c5237qb.f20163q;
                final InterfaceC1809a1 interfaceC1809a116 = (InterfaceC1809a1) c5237qb.f20164r;
                final InterfaceC1809a1 interfaceC1809a117 = (InterfaceC1809a1) c5237qb.f20165s;
                C3623h c3623h4 = (C3623h) obj;
                c3623h4.getClass();
                if (((Boolean) c5237qb.f20154h.getValue()).booleanValue()) {
                    C3623h.m7604a(c3623h4, null, AbstractC5193p0.f19741c5, 3);
                } else {
                    InterfaceC1809a1 interfaceC1809a118 = c5237qb.f20156j;
                    if (!AbstractC3149m.m6721t0((String) interfaceC1809a118.getValue())) {
                        C3623h.m7604a(c3623h4, null, new C3874d(773380272, new C5326t1(27, interfaceC1809a118, c5237qb.f20157k), true), 3);
                    } else if (((List) c5237qb.f20158l.getValue()).isEmpty()) {
                        C3623h.m7604a(c3623h4, null, AbstractC5193p0.f19749d5, 3);
                    } else if (arrayList.isEmpty()) {
                        C3623h.m7604a(c3623h4, null, AbstractC5193p0.f19757e5, 3);
                    } else {
                        int size = arrayList.size();
                        C1541o0 c1541o0 = new C1541o0(3, arrayList);
                        final InterfaceC1809a1 interfaceC1809a119 = c5237qb.f20159m;
                        final InterfaceC1809a1 interfaceC1809a120 = c5237qb.f20160n;
                        final InterfaceC1809a1 interfaceC1809a121 = c5237qb.f20161o;
                        c3623h4.f11683a.m352b(size, new C0184c(c1541o0, C3633r.f11776g, new C3874d(1106414503, new InterfaceC1237r() { // from class: wb.gp
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
                            @Override // p085fg.InterfaceC1237r
                            /* JADX INFO: renamed from: c */
                            public final Object mo3355c(Object obj2, Object obj3, Object obj4, Object obj5) {
                                int iIntValue = ((Integer) obj3).intValue();
                                C1836h0 c1836h0 = (C1836h0) obj4;
                                int iIntValue2 = ((Integer) obj5).intValue();
                                ((C3619d) obj2).getClass();
                                if ((iIntValue2 & 48) == 0) {
                                    iIntValue2 |= c1836h0.m4530d(iIntValue) ? 32 : 16;
                                }
                                if (c1836h0.m4516S(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
                                    C0859c0 c0859c0 = (C0859c0) arrayList.get(iIntValue);
                                    if (iIntValue > 0) {
                                        c1836h0.m4525a0(-1887548223);
                                        AbstractC4955ho.m9312D1(0, c1836h0, 6, 0);
                                    } else {
                                        c1836h0.m4525a0(1615572219);
                                    }
                                    c1836h0.m4553p(false);
                                    C5491y2 c5491y2 = C5491y2.f22065m;
                                    InterfaceC1809a1 interfaceC1809a122 = interfaceC1809a119;
                                    Set set = (Set) interfaceC1809a122.getValue();
                                    String str2 = c0859c0.f2626a;
                                    boolean zContains = set.contains(str2);
                                    InterfaceC1809a1 interfaceC1809a123 = interfaceC1809a120;
                                    String str3 = (String) ((Map) interfaceC1809a123.getValue()).get(str2);
                                    String str4 = HttpUrl.FRAGMENT_ENCODE_SET;
                                    if (str3 == null) {
                                        str3 = HttpUrl.FRAGMENT_ENCODE_SET;
                                    }
                                    InterfaceC1809a1 interfaceC1809a124 = interfaceC1809a121;
                                    String str5 = (String) ((Map) interfaceC1809a124.getValue()).get(str2);
                                    if (str5 != null) {
                                        str4 = str5;
                                    }
                                    InterfaceC1809a1 interfaceC1809a125 = interfaceC1809a115;
                                    List list3 = (List) ((Map) interfaceC1809a125.getValue()).get(str2);
                                    if (list3 == null) {
                                        list3 = C4173t.f13710g;
                                    }
                                    C5350tp c5350tp = (C5350tp) ((Map) interfaceC1809a116.getValue()).get(str2);
                                    boolean zM9778H = true ^ C5491y2.m9778H(interfaceC1809a117);
                                    boolean zM4538h = c1836h0.m4538h(c0859c0);
                                    Object objM4514P = c1836h0.m4514P();
                                    C1823e c1823e = C1851l.f6155a;
                                    if (zM4538h || objM4514P == c1823e) {
                                        objM4514P = new C5053kp(c0859c0, interfaceC1809a122, 0);
                                        c1836h0.m4545k0(objM4514P);
                                    }
                                    InterfaceC1231l interfaceC1231l = (InterfaceC1231l) objM4514P;
                                    boolean zM4538h2 = c1836h0.m4538h(c0859c0);
                                    Object objM4514P2 = c1836h0.m4514P();
                                    if (zM4538h2 || objM4514P2 == c1823e) {
                                        objM4514P2 = new C5053kp(c0859c0, interfaceC1809a123, 1);
                                        c1836h0.m4545k0(objM4514P2);
                                    }
                                    InterfaceC1231l interfaceC1231l2 = (InterfaceC1231l) objM4514P2;
                                    boolean zM4538h3 = c1836h0.m4538h(c0859c0);
                                    Object objM4514P3 = c1836h0.m4514P();
                                    if (zM4538h3 || objM4514P3 == c1823e) {
                                        objM4514P3 = new C5053kp(c0859c0, interfaceC1809a124, 2);
                                        c1836h0.m4545k0(objM4514P3);
                                    }
                                    InterfaceC1231l interfaceC1231l3 = (InterfaceC1231l) objM4514P3;
                                    Context context6 = context5;
                                    boolean zM4538h4 = c1836h0.m4538h(context6) | c1836h0.m4538h(c0859c0);
                                    Object objM4514P4 = c1836h0.m4514P();
                                    if (zM4538h4 || objM4514P4 == c1823e) {
                                        objM4514P4 = new C5538zh(7, context6, c0859c0, interfaceC1809a125);
                                        c1836h0.m4545k0(objM4514P4);
                                    }
                                    InterfaceC1220a interfaceC1220a2 = (InterfaceC1220a) objM4514P4;
                                    boolean zM4538h5 = c1836h0.m4538h(c0859c0);
                                    Object objM4514P5 = c1836h0.m4514P();
                                    if (zM4538h5 || objM4514P5 == c1823e) {
                                        objM4514P5 = new C5475xi(c0859c0, 10, interfaceC1809a125);
                                        c1836h0.m4545k0(objM4514P5);
                                    }
                                    c5491y2.m9865I(c0859c0, zContains, str3, str4, list3, c5350tp, zM9778H, interfaceC1231l, interfaceC1231l2, interfaceC1231l3, interfaceC1220a2, (InterfaceC1220a) objM4514P5, c1836h0, 8);
                                } else {
                                    c1836h0.m4519V();
                                }
                                return C3967n.f12976a;
                            }
                        }, true)));
                    }
                }
                return C3967n.f12976a;
            case 4:
                final String str2 = (String) c5237qb.f20163q;
                final C5453wt c5453wt = (C5453wt) c5237qb.f20162p;
                final AtomicInteger atomicInteger = (AtomicInteger) c5237qb.f20164r;
                final InterfaceC1809a1 interfaceC1809a122 = (InterfaceC1809a1) c5237qb.f20165s;
                final InterfaceC1809a1 interfaceC1809a123 = (InterfaceC1809a1) c5237qb.f20155i;
                final C1161p1 c1161p1 = (C1161p1) obj;
                c1161p1.getClass();
                Handler handler = new Handler(Looper.getMainLooper());
                final InterfaceC1809a1 interfaceC1809a124 = c5237qb.f20154h;
                final InterfaceC1809a1 interfaceC1809a125 = c5237qb.f20156j;
                final InterfaceC1809a1 interfaceC1809a126 = c5237qb.f20157k;
                final InterfaceC1809a1 interfaceC1809a127 = c5237qb.f20158l;
                final InterfaceC1809a1 interfaceC1809a128 = c5237qb.f20159m;
                final InterfaceC1809a1 interfaceC1809a129 = c5237qb.f20160n;
                final InterfaceC1809a1 interfaceC1809a130 = c5237qb.f20161o;
                handler.post(new Runnable() { // from class: wb.yr
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    /*  JADX ERROR: Type inference failed with stack overflow
                        jadx.core.utils.exceptions.JadxOverflowException
                        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
                        */
                    @Override // java.lang.Runnable
                    public final void run() {
                        /*
                            r42 = this;
                            r0 = r42
                            i0.a1 r1 = r5
                            java.lang.Object r1 = r1.getValue()
                            java.lang.String r1 = (java.lang.String) r1
                            java.lang.String r2 = r1
                            boolean r1 = gg.AbstractC1416l.m3825a(r1, r2)
                            if (r1 != 0) goto L15
                        L12:
                            r9 = r0
                            goto L75f
                        L15:
                            fb.p1 r1 = r2
                            java.lang.String r2 = r1.f3857e
                            java.lang.String r3 = r1.f3859g
                            java.lang.String r4 = r1.f3855c
                            java.lang.String r5 = r1.f3866n
                            java.lang.String r6 = r1.f3853a
                            int r7 = r2.hashCode()
                            wb.wt r8 = r3
                            java.util.concurrent.atomic.AtomicInteger r9 = r4
                            i0.a1 r10 = r8
                            i0.a1 r11 = r10
                            i0.a1 r12 = r12
                            java.lang.String r13 = "tool_start"
                            java.lang.String r14 = "streaming"
                            java.lang.String r15 = "assistant"
                            r17 = r7
                            r18 = r6
                            switch(r17) {
                                case -825127537: goto L635;
                                case -719989586: goto L5b5;
                                case -718636095: goto L3b0;
                                case -502770296: goto L362;
                                case -275492528: goto L54;
                                case -10617093: goto L4d;
                                case 1525164849: goto L44;
                                default: goto L3c;
                            }
                        L3c:
                            r6 = r1
                            r7 = r8
                            r0 = r9
                            r1 = r11
                            r8 = -1
                            r14 = 0
                            goto L643
                        L44:
                            java.lang.String r5 = "working"
                            boolean r2 = r2.equals(r5)
                            if (r2 != 0) goto L12
                            goto L3c
                        L4d:
                            boolean r2 = r2.equals(r13)
                            if (r2 != 0) goto L5d
                            goto L3c
                        L54:
                            java.lang.String r5 = "tool_update"
                            boolean r2 = r2.equals(r5)
                            if (r2 != 0) goto L5d
                            goto L3c
                        L5d:
                            java.util.List r2 = r1.f3856d
                            if (r2 == 0) goto L12
                            java.lang.Object r2 = tf.AbstractC4166m.m8424v1(r2)
                            fb.q1 r2 = (p080fb.C1165q1) r2
                            if (r2 == 0) goto L12
                            java.lang.String r4 = r2.f3884k
                            java.lang.String r5 = r2.f3888o
                            java.lang.String r10 = r2.f3880g
                            r17 = 1
                            java.lang.String r7 = r1.f3857e
                            boolean r7 = gg.AbstractC1416l.m3825a(r7, r13)
                            if (r7 == 0) goto L168
                            boolean r7 = p218og.AbstractC3149m.m6721t0(r3)
                            if (r7 != 0) goto Lb0
                            java.lang.Object r7 = r11.getValue()
                            java.util.List r7 = (java.util.List) r7
                            int r13 = r7.size()
                            java.util.ListIterator r7 = r7.listIterator(r13)
                        L8d:
                            boolean r13 = r7.hasPrevious()
                            if (r13 == 0) goto Lae
                            java.lang.Object r13 = r7.previous()
                            fb.c r13 = (p080fb.C1107c) r13
                            java.lang.String r6 = r13.f3584a
                            boolean r6 = gg.AbstractC1416l.m3825a(r6, r15)
                            if (r6 == 0) goto L8d
                            java.lang.String r6 = r13.f3600q
                            boolean r6 = gg.AbstractC1416l.m3825a(r6, r3)
                            if (r6 == 0) goto L8d
                            int r3 = r7.nextIndex()
                            goto Lb4
                        Lae:
                            r3 = -1
                            goto Lb4
                        Lb0:
                            int r3 = r9.get()
                        Lb4:
                            java.lang.Object r6 = r11.getValue()
                            java.util.List r6 = (java.util.List) r6
                            java.lang.Object r6 = tf.AbstractC4166m.m8425w1(r3, r6)
                            fb.c r6 = (p080fb.C1107c) r6
                            if (r6 == 0) goto L161
                            java.lang.String r7 = r6.f3585b
                            java.lang.String r13 = r6.f3584a
                            boolean r13 = gg.AbstractC1416l.m3825a(r13, r15)
                            if (r13 == 0) goto L161
                            java.lang.Object r13 = r11.getValue()
                            java.util.List r13 = (java.util.List) r13
                            java.util.ArrayList r13 = tf.AbstractC4166m.m8409R1(r13)
                            int r15 = r13.size()
                            int r15 = r15 + (-1)
                            if (r3 != r15) goto L130
                            boolean r15 = p218og.AbstractC3149m.m6721t0(r7)
                            if (r15 != 0) goto Lfb
                            java.lang.CharSequence r7 = p218og.AbstractC3149m.m6703R0(r7)
                            java.lang.String r7 = r7.toString()
                            java.lang.String r15 = "准备调用"
                            r37 = r14
                            r14 = 0
                            boolean r7 = p218og.AbstractC3156t.m6740d0(r7, r15, r14)
                            if (r7 == 0) goto Lf8
                            goto Lfd
                        Lf8:
                            r20 = r6
                            goto L134
                        Lfb:
                            r37 = r14
                        Lfd:
                            java.lang.String r7 = r6.f3592i
                            boolean r7 = p218og.AbstractC3149m.m6721t0(r7)
                            if (r7 == 0) goto Lf8
                            long r34 = java.lang.System.currentTimeMillis()
                            r33 = 0
                            r36 = 122845(0x1dfdd, float:1.72143E-40)
                            java.lang.String r21 = ""
                            r22 = 0
                            r23 = 0
                            r24 = 0
                            java.lang.String r25 = "assistant_tool_call"
                            r26 = 0
                            r27 = 0
                            r28 = 0
                            r29 = 0
                            java.lang.String r30 = "complete"
                            r31 = 0
                            r32 = 0
                            r20 = r6
                            fb.c r6 = p080fb.C1107c.m2840a(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r36)
                            r13.set(r3, r6)
                            goto L15c
                        L130:
                            r20 = r6
                            r37 = r14
                        L134:
                            long r34 = java.lang.System.currentTimeMillis()
                            r36 = 122879(0x1dfff, float:1.7219E-40)
                            r21 = 0
                            r22 = 0
                            r23 = 0
                            r24 = 0
                            r25 = 0
                            r26 = 0
                            r27 = 0
                            r28 = 0
                            r29 = 0
                            java.lang.String r30 = "complete"
                            r31 = 0
                            r32 = 0
                            r33 = 0
                            fb.c r6 = p080fb.C1107c.m2840a(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r36)
                            r13.set(r3, r6)
                        L15c:
                            r11.setValue(r13)
                        L15f:
                            r3 = -1
                            goto L164
                        L161:
                            r37 = r14
                            goto L15f
                        L164:
                            r9.set(r3)
                            goto L16a
                        L168:
                            r37 = r14
                        L16a:
                            java.lang.Object r3 = r11.getValue()
                            java.util.List r3 = (java.util.List) r3
                            int r6 = r3.size()
                            java.util.ListIterator r3 = r3.listIterator(r6)
                        L178:
                            boolean r6 = r3.hasPrevious()
                            if (r6 == 0) goto L1cf
                            java.lang.Object r6 = r3.previous()
                            fb.c r6 = (p080fb.C1107c) r6
                            java.lang.String r7 = r6.f3584a
                            java.lang.String r9 = "tool"
                            boolean r7 = gg.AbstractC1416l.m3825a(r7, r9)
                            if (r7 == 0) goto L178
                            java.util.List r7 = r6.f3593j
                            if (r7 == 0) goto L199
                            boolean r9 = r7.isEmpty()
                            if (r9 == 0) goto L199
                            goto L1b4
                        L199:
                            java.util.Iterator r7 = r7.iterator()
                        L19d:
                            boolean r9 = r7.hasNext()
                            if (r9 == 0) goto L1b4
                            java.lang.Object r9 = r7.next()
                            fb.q1 r9 = (p080fb.C1165q1) r9
                            java.lang.String r9 = r9.f3874a
                            java.lang.String r13 = r1.f3858f
                            boolean r9 = r9.equals(r13)
                            if (r9 == 0) goto L19d
                            goto L1ca
                        L1b4:
                            boolean r7 = p218og.AbstractC3149m.m6721t0(r4)
                            if (r7 != 0) goto L178
                            java.lang.String r7 = r6.f3587d
                            boolean r7 = gg.AbstractC1416l.m3825a(r7, r4)
                            if (r7 == 0) goto L178
                            java.lang.String r6 = r6.f3588e
                            boolean r6 = gg.AbstractC1416l.m3825a(r6, r5)
                            if (r6 == 0) goto L178
                        L1ca:
                            int r3 = r3.nextIndex()
                            goto L1d0
                        L1cf:
                            r3 = -1
                        L1d0:
                            java.lang.String r6 = "complete"
                            java.lang.String r7 = "queued"
                            java.lang.String r9 = "running"
                            if (r3 < 0) goto L2d9
                            java.lang.Object r1 = r11.getValue()
                            java.util.List r1 = (java.util.List) r1
                            java.util.ArrayList r1 = tf.AbstractC4166m.m8409R1(r1)
                            java.lang.Object r5 = r1.get(r3)
                            fb.c r5 = (p080fb.C1107c) r5
                            java.util.List r13 = r5.f3593j
                            java.util.ArrayList r13 = tf.AbstractC4166m.m8409R1(r13)
                            java.util.Iterator r14 = r13.iterator()
                            r15 = 0
                        L1f3:
                            boolean r18 = r14.hasNext()
                            if (r18 == 0) goto L217
                            java.lang.Object r18 = r14.next()
                            r20 = r6
                            r6 = r18
                            fb.q1 r6 = (p080fb.C1165q1) r6
                            java.lang.String r6 = r6.f3874a
                            r18 = r14
                            java.lang.String r14 = r2.f3874a
                            boolean r6 = r6.equals(r14)
                            if (r6 == 0) goto L210
                            goto L21a
                        L210:
                            int r15 = r15 + 1
                            r14 = r18
                            r6 = r20
                            goto L1f3
                        L217:
                            r20 = r6
                            r15 = -1
                        L21a:
                            if (r15 < 0) goto L220
                            r13.set(r15, r2)
                            goto L223
                        L220:
                            r13.add(r2)
                        L223:
                            boolean r6 = r13.isEmpty()
                            if (r6 == 0) goto L22b
                        L229:
                            r6 = 0
                            goto L24d
                        L22b:
                            java.util.Iterator r6 = r13.iterator()
                        L22f:
                            boolean r14 = r6.hasNext()
                            if (r14 == 0) goto L229
                            java.lang.Object r14 = r6.next()
                            fb.q1 r14 = (p080fb.C1165q1) r14
                            java.lang.String r15 = r14.f3880g
                            boolean r15 = r15.equals(r9)
                            if (r15 != 0) goto L24b
                            java.lang.String r14 = r14.f3880g
                            boolean r14 = r14.equals(r7)
                            if (r14 == 0) goto L22f
                        L24b:
                            r6 = r17
                        L24d:
                            boolean r14 = p218og.AbstractC3149m.m6721t0(r4)
                            if (r14 == 0) goto L255
                            java.lang.String r4 = r5.f3587d
                        L255:
                            r23 = r4
                            java.lang.String r4 = r2.f3888o
                            if (r6 == 0) goto L25e
                            r30 = r37
                            goto L260
                        L25e:
                            r30 = r20
                        L260:
                            if (r6 == 0) goto L26b
                            r14 = 0
                            r24 = r4
                            r18 = r5
                        L268:
                            r34 = r14
                            goto L2b4
                        L26b:
                            java.util.Iterator r6 = r13.iterator()
                            boolean r14 = r6.hasNext()
                            if (r14 != 0) goto L27b
                            r15 = 0
                        L276:
                            r24 = r4
                            r18 = r5
                            goto L2aa
                        L27b:
                            java.lang.Object r14 = r6.next()
                            fb.q1 r14 = (p080fb.C1165q1) r14
                            long r14 = r14.f3882i
                            java.lang.Long r14 = java.lang.Long.valueOf(r14)
                            r15 = r14
                        L288:
                            boolean r14 = r6.hasNext()
                            if (r14 == 0) goto L276
                            java.lang.Object r14 = r6.next()
                            fb.q1 r14 = (p080fb.C1165q1) r14
                            r24 = r4
                            r18 = r5
                            long r4 = r14.f3882i
                            java.lang.Long r4 = java.lang.Long.valueOf(r4)
                            int r5 = r15.compareTo(r4)
                            if (r5 >= 0) goto L2a5
                            r15 = r4
                        L2a5:
                            r5 = r18
                            r4 = r24
                            goto L288
                        L2aa:
                            if (r15 == 0) goto L2b1
                            long r14 = r15.longValue()
                            goto L268
                        L2b1:
                            long r14 = r2.f3882i
                            goto L268
                        L2b4:
                            r36 = 122311(0x1ddc7, float:1.71394E-40)
                            r21 = 0
                            r22 = 0
                            java.lang.String r25 = "tool"
                            r26 = 0
                            r27 = 0
                            r28 = 0
                            r31 = 0
                            r32 = 0
                            r33 = 0
                            r29 = r13
                            r20 = r18
                            fb.c r2 = p080fb.C1107c.m2840a(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r36)
                            r1.set(r3, r2)
                            r11.setValue(r1)
                            goto L34b
                        L2d9:
                            r20 = r6
                            java.lang.Object r3 = r11.getValue()
                            java.util.List r3 = (java.util.List) r3
                            r5.getClass()
                            java.lang.StringBuilder r6 = new java.lang.StringBuilder
                            java.lang.String r13 = "tool-group:"
                            r6.<init>(r13)
                            r6.append(r4)
                            java.lang.String r13 = ":"
                            r6.append(r13)
                            r6.append(r5)
                            java.lang.String r23 = r6.toString()
                            java.lang.String r5 = r2.f3888o
                            java.util.List r28 = p000a.AbstractC0000a.m99x0(r2)
                            boolean r6 = r10.equals(r9)
                            if (r6 != 0) goto L310
                            boolean r6 = r10.equals(r7)
                            if (r6 == 0) goto L30d
                            goto L310
                        L30d:
                            r33 = r20
                            goto L312
                        L310:
                            r33 = r37
                        L312:
                            long r13 = r2.f3882i
                            java.lang.String r1 = r1.f3859g
                            fb.c r20 = new fb.c
                            r35 = 0
                            r39 = 56768(0xddc0, float:7.9549E-41)
                            java.lang.String r21 = "tool"
                            java.lang.String r22 = ""
                            java.lang.String r26 = "tool"
                            r27 = 0
                            r29 = 0
                            r30 = 0
                            r31 = 0
                            r34 = 0
                            r36 = r1
                            r24 = r4
                            r25 = r5
                            r37 = r13
                            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r33, r34, r35, r36, r37, r39)
                            r1 = r20
                            java.util.ArrayList r1 = tf.AbstractC4166m.m8398G1(r3, r1)
                            r11.setValue(r1)
                            java.lang.Object r1 = r11.getValue()
                            java.util.List r1 = (java.util.List) r1
                            int r3 = p000a.AbstractC0000a.m54b0(r1)
                        L34b:
                            p332wb.C5491y2.m9804T0(r12, r3)
                            boolean r1 = r10.equals(r9)
                            if (r1 != 0) goto L35d
                            boolean r1 = r10.equals(r7)
                            if (r1 != 0) goto L35d
                            r6 = r17
                            goto L35e
                        L35d:
                            r6 = 0
                        L35e:
                            r8.m9765b(r6)
                            return
                        L362:
                            r17 = 1
                            java.lang.String r6 = "checkpoint"
                            boolean r2 = r2.equals(r6)
                            if (r2 != 0) goto L36e
                            goto L3c
                        L36e:
                            fb.c1 r2 = r1.f3864l
                            if (r2 == 0) goto L377
                            i0.a1 r3 = r6
                            r3.setValue(r2)
                        L377:
                            java.lang.String r2 = r1.f3865m
                            if (r2 == 0) goto L380
                            i0.a1 r3 = r7
                            r3.setValue(r2)
                        L380:
                            if (r5 == 0) goto L385
                            r10.setValue(r5)
                        L385:
                            java.lang.String r2 = r1.f3867o
                            if (r2 == 0) goto L38e
                            i0.a1 r3 = r9
                            r3.setValue(r2)
                        L38e:
                            java.lang.Integer r1 = r1.f3868p
                            if (r1 == 0) goto L3aa
                            int r1 = r1.intValue()
                            java.lang.Object r2 = r11.getValue()
                            java.util.List r2 = (java.util.List) r2
                            int r2 = r2.size()
                            r14 = 0
                            int r1 = p259r9.AbstractC3754e0.m7909r(r1, r14, r2)
                            i0.a1 r2 = r11
                            p332wb.C5491y2.m9812X0(r2, r1)
                        L3aa:
                            r1 = r17
                            r8.m9765b(r1)
                            return
                        L3b0:
                            r37 = r14
                            r14 = 0
                            java.lang.String r5 = "assistant_start"
                            boolean r2 = r2.equals(r5)
                            if (r2 != 0) goto L3c2
                            r6 = r1
                            r7 = r8
                            r0 = r9
                            r1 = r11
                        L3bf:
                            r8 = -1
                            goto L643
                        L3c2:
                            boolean r2 = p218og.AbstractC3149m.m6721t0(r3)
                            if (r2 != 0) goto L3f9
                            java.lang.Object r2 = r11.getValue()
                            java.util.List r2 = (java.util.List) r2
                            int r4 = r2.size()
                            java.util.ListIterator r2 = r2.listIterator(r4)
                        L3d6:
                            boolean r4 = r2.hasPrevious()
                            if (r4 == 0) goto L3f7
                            java.lang.Object r4 = r2.previous()
                            fb.c r4 = (p080fb.C1107c) r4
                            java.lang.String r5 = r4.f3584a
                            boolean r5 = gg.AbstractC1416l.m3825a(r5, r15)
                            if (r5 == 0) goto L3d6
                            java.lang.String r4 = r4.f3600q
                            boolean r4 = gg.AbstractC1416l.m3825a(r4, r3)
                            if (r4 == 0) goto L3d6
                            int r7 = r2.nextIndex()
                            goto L3fd
                        L3f7:
                            r7 = -1
                            goto L3fd
                        L3f9:
                            int r7 = r9.get()
                        L3fd:
                            if (r7 < 0) goto L40d
                            java.lang.Object r2 = r11.getValue()
                            java.util.List r2 = (java.util.List) r2
                            int r2 = r2.size()
                            if (r7 >= r2) goto L40d
                            goto L4bc
                        L40d:
                            int r2 = r9.get()
                            java.lang.Object r4 = r11.getValue()
                            java.util.List r4 = (java.util.List) r4
                            java.lang.Object r4 = tf.AbstractC4166m.m8425w1(r2, r4)
                            fb.c r4 = (p080fb.C1107c) r4
                            java.lang.Object r5 = r11.getValue()
                            java.util.List r5 = (java.util.List) r5
                            int r5 = p000a.AbstractC0000a.m54b0(r5)
                            if (r2 != r5) goto L461
                            if (r4 == 0) goto L42e
                            java.lang.String r5 = r4.f3584a
                            goto L42f
                        L42e:
                            r5 = 0
                        L42f:
                            boolean r5 = gg.AbstractC1416l.m3825a(r5, r15)
                            if (r5 == 0) goto L461
                            java.lang.String r5 = r4.f3597n
                            r6 = r37
                            boolean r5 = gg.AbstractC1416l.m3825a(r5, r6)
                            if (r5 == 0) goto L463
                            java.lang.String r5 = r4.f3600q
                            boolean r5 = p218og.AbstractC3149m.m6721t0(r5)
                            if (r5 == 0) goto L463
                            java.lang.String r5 = r4.f3585b
                            boolean r5 = p218og.AbstractC3149m.m6721t0(r5)
                            if (r5 == 0) goto L463
                            java.lang.String r5 = r4.f3591h
                            boolean r5 = p218og.AbstractC3149m.m6721t0(r5)
                            if (r5 == 0) goto L463
                            java.util.List r4 = r4.f3593j
                            boolean r4 = r4.isEmpty()
                            if (r4 == 0) goto L463
                            r7 = r2
                            goto L4bc
                        L461:
                            r6 = r37
                        L463:
                            int r2 = r9.get()
                            java.lang.Object r4 = r11.getValue()
                            java.util.List r4 = (java.util.List) r4
                            java.lang.Object r4 = tf.AbstractC4166m.m8425w1(r2, r4)
                            fb.c r4 = (p080fb.C1107c) r4
                            if (r4 == 0) goto L4bc
                            java.lang.String r5 = r4.f3584a
                            boolean r5 = gg.AbstractC1416l.m3825a(r5, r15)
                            if (r5 == 0) goto L4bc
                            java.lang.String r5 = r4.f3597n
                            boolean r5 = gg.AbstractC1416l.m3825a(r5, r6)
                            if (r5 == 0) goto L4bc
                            java.lang.Object r5 = r11.getValue()
                            java.util.List r5 = (java.util.List) r5
                            java.util.ArrayList r5 = tf.AbstractC4166m.m8409R1(r5)
                            long r30 = java.lang.System.currentTimeMillis()
                            r32 = 122879(0x1dfff, float:1.7219E-40)
                            r17 = 0
                            r18 = 0
                            r19 = 0
                            r20 = 0
                            r21 = 0
                            r22 = 0
                            r23 = 0
                            r24 = 0
                            r25 = 0
                            java.lang.String r26 = "complete"
                            r27 = 0
                            r28 = 0
                            r29 = 0
                            r16 = r4
                            fb.c r4 = p080fb.C1107c.m2840a(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r32)
                            r5.set(r2, r4)
                            r11.setValue(r5)
                        L4bc:
                            if (r7 < 0) goto L4d4
                            java.lang.Object r2 = r11.getValue()
                            java.util.List r2 = (java.util.List) r2
                            int r2 = r2.size()
                            if (r7 >= r2) goto L4d4
                            r24 = r1
                            r23 = r8
                            r0 = r9
                            r1 = r11
                            r41 = r12
                            goto L533
                        L4d4:
                            java.lang.Object r2 = r11.getValue()
                            java.util.List r2 = (java.util.List) r2
                            java.util.ArrayList r2 = tf.AbstractC4166m.m8409R1(r2)
                            r19 = r3
                            fb.c r3 = new fb.c
                            java.lang.String r7 = r1.f3862j
                            r4 = r8
                            java.lang.String r8 = r1.f3863k
                            r20 = 0
                            r22 = 188356(0x2dfc4, float:2.63943E-40)
                            r5 = r4
                            java.lang.String r4 = "assistant"
                            r6 = r5
                            java.lang.String r5 = ""
                            r10 = r6
                            r6 = 0
                            r13 = r9
                            java.lang.String r9 = "assistant"
                            r15 = r10
                            r10 = 0
                            r16 = r11
                            r11 = 0
                            r17 = r12
                            r12 = 0
                            r18 = r13
                            r13 = 0
                            r40 = r14
                            r23 = r15
                            r14 = 0
                            r24 = r16
                            java.lang.String r16 = "streaming"
                            r25 = r17
                            r17 = 0
                            r26 = r18
                            r18 = 0
                            r0 = r24
                            r24 = r1
                            r1 = r0
                            r41 = r25
                            r0 = r26
                            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r16, r17, r18, r19, r20, r22)
                            r4 = r3
                            r3 = r19
                            r2.add(r4)
                            r1.setValue(r2)
                            java.lang.Object r2 = r1.getValue()
                            java.util.List r2 = (java.util.List) r2
                            int r7 = p000a.AbstractC0000a.m54b0(r2)
                        L533:
                            r0.set(r7)
                            r5 = r41
                            p332wb.C5491y2.m9804T0(r5, r7)
                            java.lang.Object r0 = r1.getValue()
                            java.util.List r0 = (java.util.List) r0
                            java.lang.Object r0 = r0.get(r7)
                            fb.c r0 = (p080fb.C1107c) r0
                            boolean r2 = p218og.AbstractC3149m.m6721t0(r3)
                            if (r2 == 0) goto L554
                            java.lang.String r2 = r0.f3586c
                            r27 = r2
                        L551:
                            r6 = r24
                            goto L557
                        L554:
                            r27 = r3
                            goto L551
                        L557:
                            java.lang.String r2 = r6.f3862j
                            boolean r4 = p218og.AbstractC3149m.m6721t0(r2)
                            if (r4 == 0) goto L561
                            java.lang.String r2 = r0.f3587d
                        L561:
                            r28 = r2
                            java.lang.String r2 = r6.f3863k
                            boolean r4 = p218og.AbstractC3149m.m6721t0(r2)
                            if (r4 == 0) goto L56d
                            java.lang.String r2 = r0.f3588e
                        L56d:
                            r29 = r2
                            boolean r2 = p218og.AbstractC3149m.m6721t0(r3)
                            if (r2 == 0) goto L577
                            java.lang.String r3 = r0.f3600q
                        L577:
                            r38 = r3
                            r39 = 0
                            r41 = 188355(0x2dfc3, float:2.63942E-40)
                            r26 = 0
                            java.lang.String r30 = "assistant"
                            r31 = 0
                            r32 = 0
                            r33 = 0
                            r34 = 0
                            java.lang.String r35 = "streaming"
                            r36 = 0
                            r37 = 0
                            r25 = r0
                            fb.c r0 = p080fb.C1107c.m2840a(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r41)
                            r2 = r25
                            boolean r2 = r0.equals(r2)
                            if (r2 != 0) goto L5ae
                            java.lang.Object r2 = r1.getValue()
                            java.util.List r2 = (java.util.List) r2
                            java.util.ArrayList r2 = tf.AbstractC4166m.m8409R1(r2)
                            r2.set(r7, r0)
                            r1.setValue(r2)
                        L5ae:
                            r7 = r23
                            r14 = 0
                            r7.m9765b(r14)
                            return
                        L5b5:
                            r6 = r1
                            r7 = r8
                            r0 = r9
                            r1 = r11
                            r5 = r12
                            r14 = 0
                            java.lang.String r8 = "assistant_reset"
                            boolean r2 = r2.equals(r8)
                            if (r2 != 0) goto L5c5
                            goto L3bf
                        L5c5:
                            boolean r2 = p218og.AbstractC3149m.m6721t0(r3)
                            if (r2 != 0) goto L5fc
                            java.lang.Object r2 = r1.getValue()
                            java.util.List r2 = (java.util.List) r2
                            int r4 = r2.size()
                            java.util.ListIterator r2 = r2.listIterator(r4)
                        L5d9:
                            boolean r4 = r2.hasPrevious()
                            if (r4 == 0) goto L5fa
                            java.lang.Object r4 = r2.previous()
                            fb.c r4 = (p080fb.C1107c) r4
                            java.lang.String r6 = r4.f3584a
                            boolean r6 = gg.AbstractC1416l.m3825a(r6, r15)
                            if (r6 == 0) goto L5d9
                            java.lang.String r4 = r4.f3600q
                            boolean r4 = gg.AbstractC1416l.m3825a(r4, r3)
                            if (r4 == 0) goto L5d9
                            int r3 = r2.nextIndex()
                            goto L600
                        L5fa:
                            r3 = -1
                            goto L600
                        L5fc:
                            int r3 = r0.get()
                        L600:
                            java.lang.Object r2 = r1.getValue()
                            java.util.List r2 = (java.util.List) r2
                            java.lang.Object r2 = tf.AbstractC4166m.m8425w1(r3, r2)
                            fb.c r2 = (p080fb.C1107c) r2
                            if (r2 == 0) goto L631
                            java.lang.String r2 = r2.f3584a
                            boolean r2 = gg.AbstractC1416l.m3825a(r2, r15)
                            if (r2 == 0) goto L631
                            java.lang.Object r2 = r1.getValue()
                            java.util.List r2 = (java.util.List) r2
                            java.util.ArrayList r2 = tf.AbstractC4166m.m8409R1(r2)
                            r2.remove(r3)
                            r1.setValue(r2)
                            r8 = -1
                            r0.set(r8)
                            p332wb.C5491y2.m9804T0(r5, r8)
                            r7.m9765b(r14)
                            return
                        L631:
                            r9 = r42
                            goto L75f
                        L635:
                            r6 = r1
                            r7 = r8
                            r0 = r9
                            r1 = r11
                            r8 = -1
                            r14 = 0
                            java.lang.String r9 = "protocol_checkpoint"
                            boolean r2 = r2.equals(r9)
                            if (r2 != 0) goto L760
                        L643:
                            boolean r2 = p218og.AbstractC3149m.m6721t0(r18)
                            if (r2 != 0) goto L653
                            java.lang.Boolean r2 = java.lang.Boolean.TRUE
                            r9 = r42
                            i0.a1 r5 = r13
                            r5.setValue(r2)
                            goto L655
                        L653:
                            r9 = r42
                        L655:
                            boolean r2 = p218og.AbstractC3149m.m6721t0(r3)
                            if (r2 != 0) goto L68c
                            java.lang.Object r0 = r1.getValue()
                            java.util.List r0 = (java.util.List) r0
                            int r2 = r0.size()
                            java.util.ListIterator r0 = r0.listIterator(r2)
                        L669:
                            boolean r2 = r0.hasPrevious()
                            if (r2 == 0) goto L68a
                            java.lang.Object r2 = r0.previous()
                            fb.c r2 = (p080fb.C1107c) r2
                            java.lang.String r5 = r2.f3584a
                            boolean r5 = gg.AbstractC1416l.m3825a(r5, r15)
                            if (r5 == 0) goto L669
                            java.lang.String r2 = r2.f3600q
                            boolean r2 = gg.AbstractC1416l.m3825a(r2, r3)
                            if (r2 == 0) goto L669
                            int r0 = r0.nextIndex()
                            goto L690
                        L68a:
                            r0 = r8
                            goto L690
                        L68c:
                            int r0 = r0.get()
                        L690:
                            if (r0 < 0) goto L75f
                            java.lang.Object r2 = r1.getValue()
                            java.util.List r2 = (java.util.List) r2
                            int r2 = r2.size()
                            if (r0 >= r2) goto L75f
                            java.lang.Object r2 = r1.getValue()
                            java.util.List r2 = (java.util.List) r2
                            java.lang.Object r2 = r2.get(r0)
                            fb.c r2 = (p080fb.C1107c) r2
                            boolean r3 = r6.f3860h
                            if (r3 == 0) goto L6b1
                            r20 = r18
                            goto L6eb
                        L6b1:
                            java.lang.String r3 = r2.f3585b
                            boolean r5 = p218og.AbstractC3149m.m6721t0(r18)
                            if (r5 == 0) goto L6ba
                            goto L6e9
                        L6ba:
                            r3.getClass()
                            int r5 = r18.length()
                            if (r5 != 0) goto L6c4
                            goto L6e9
                        L6c4:
                            int r5 = r3.length()
                            if (r5 != 0) goto L6cd
                            r3 = r18
                            goto L6e9
                        L6cd:
                            r5 = r18
                            boolean r8 = r5.equals(r3)
                            if (r8 == 0) goto L6d6
                            goto L6e9
                        L6d6:
                            boolean r8 = p218og.AbstractC3156t.m6740d0(r5, r3, r14)
                            if (r8 == 0) goto L6de
                            r3 = r5
                            goto L6e9
                        L6de:
                            boolean r8 = p218og.AbstractC3156t.m6740d0(r3, r5, r14)
                            if (r8 == 0) goto L6e5
                            goto L6e9
                        L6e5:
                            java.lang.String r3 = r3.concat(r5)
                        L6e9:
                            r20 = r3
                        L6eb:
                            boolean r3 = r6.f3861i
                            if (r3 == 0) goto L6f2
                        L6ef:
                            r26 = r4
                            goto L723
                        L6f2:
                            java.lang.String r3 = r2.f3591h
                            r3.getClass()
                            r4.getClass()
                            int r5 = r4.length()
                            if (r5 != 0) goto L702
                        L700:
                            r4 = r3
                            goto L6ef
                        L702:
                            int r5 = r3.length()
                            if (r5 != 0) goto L709
                            goto L6ef
                        L709:
                            boolean r5 = r4.equals(r3)
                            if (r5 == 0) goto L710
                            goto L71d
                        L710:
                            boolean r5 = p218og.AbstractC3156t.m6740d0(r4, r3, r14)
                            if (r5 == 0) goto L717
                            goto L6ef
                        L717:
                            boolean r5 = p218og.AbstractC3156t.m6740d0(r3, r4, r14)
                            if (r5 == 0) goto L71e
                        L71d:
                            goto L700
                        L71e:
                            java.lang.String r4 = r3.concat(r4)
                            goto L6ef
                        L723:
                            r33 = 0
                            r35 = 253821(0x3df7d, float:3.55679E-40)
                            r21 = 0
                            r22 = 0
                            r23 = 0
                            r24 = 0
                            r25 = 0
                            r27 = 0
                            r28 = 0
                            java.lang.String r29 = "streaming"
                            r30 = 0
                            r31 = 0
                            r32 = 0
                            r19 = r2
                            fb.c r2 = p080fb.C1107c.m2840a(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r35)
                            r3 = r19
                            boolean r3 = r2.equals(r3)
                            if (r3 != 0) goto L75c
                            java.lang.Object r3 = r1.getValue()
                            java.util.List r3 = (java.util.List) r3
                            java.util.ArrayList r3 = tf.AbstractC4166m.m8409R1(r3)
                            r3.set(r0, r2)
                            r1.setValue(r3)
                        L75c:
                            r7.m9765b(r14)
                        L75f:
                            return
                        L760:
                            r9 = r42
                            if (r5 == 0) goto L767
                            r10.setValue(r5)
                        L767:
                            r1 = 1
                            r7.m9765b(r1)
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: p332wb.RunnableC5516yr.run():void");
                    }
                });
                return C3967n.f12976a;
            case 5:
                String str3 = (String) c5237qb.f20163q;
                LinkedHashSet linkedHashSet = (LinkedHashSet) c5237qb.f20162p;
                InterfaceC1231l interfaceC1231l = (InterfaceC1231l) c5237qb.f20164r;
                Context context6 = (Context) c5237qb.f20155i;
                InterfaceC1231l interfaceC1231l2 = (InterfaceC1231l) c5237qb.f20165s;
                C3623h c3623h5 = (C3623h) obj;
                c3623h5.getClass();
                InterfaceC1809a1 interfaceC1809a131 = c5237qb.f20154h;
                for (C1113d1 c1113d1 : (List) interfaceC1809a131.getValue()) {
                    C3623h.m7604a(c3623h5, c1113d1.f3636a, new C3874d(280682158, new C4774c7(c1113d1, str3, linkedHashSet, interfaceC1231l, context6, interfaceC1231l2, c5237qb.f20156j, c5237qb.f20157k, c5237qb.f20158l, c5237qb.f20159m, c5237qb.f20160n, interfaceC1809a131, c5237qb.f20161o), true), 2);
                    c5237qb = this;
                }
                return C3967n.f12976a;
            default:
                List list3 = (List) c5237qb.f20164r;
                C1192y c1192y = (C1192y) c5237qb.f20162p;
                C1109c1 c1109c1 = (C1109c1) c5237qb.f20163q;
                Context context7 = (Context) c5237qb.f20155i;
                C1845j1 c1845j1 = (C1845j1) c5237qb.f20165s;
                String str4 = (String) obj;
                str4.getClass();
                c1845j1.setValue(list3);
                c5237qb.f20154h.setValue(c1192y);
                c5237qb.f20156j.setValue(HttpUrl.FRAGMENT_ENCODE_SET);
                c5237qb.f20157k.setValue(str4);
                c5237qb.f20158l.setValue(HttpUrl.FRAGMENT_ENCODE_SET);
                C5491y2.m9774F0(context7, c1109c1);
                c5237qb.f20159m.setValue(null);
                C5491y2.m9812X0(c5237qb.f20160n, 0);
                if (list3.isEmpty()) {
                    InterfaceC1809a1 interfaceC1809a132 = c5237qb.f20161o;
                    AbstractC3199a.m6848u((Number) interfaceC1809a132.getValue(), 1, interfaceC1809a132);
                }
                Toast.makeText(context7, "消息已删除", 0).show();
                return Boolean.TRUE;
        }
    }

    public /* synthetic */ C5237qb(InterfaceC1809a1 interfaceC1809a1, String str, LinkedHashSet linkedHashSet, InterfaceC1231l interfaceC1231l, Context context, InterfaceC1231l interfaceC1231l2, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC1809a1 interfaceC1809a17) {
        this.f20154h = interfaceC1809a1;
        this.f20163q = str;
        this.f20162p = linkedHashSet;
        this.f20164r = interfaceC1231l;
        this.f20155i = context;
        this.f20165s = interfaceC1231l2;
        this.f20156j = interfaceC1809a12;
        this.f20157k = interfaceC1809a13;
        this.f20158l = interfaceC1809a14;
        this.f20159m = interfaceC1809a15;
        this.f20160n = interfaceC1809a16;
        this.f20161o = interfaceC1809a17;
    }

    public /* synthetic */ C5237qb(String str, C5453wt c5453wt, AtomicInteger atomicInteger, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC1809a1 interfaceC1809a17, InterfaceC1809a1 interfaceC1809a18, InterfaceC1809a1 interfaceC1809a19) {
        this.f20163q = str;
        this.f20162p = c5453wt;
        this.f20164r = atomicInteger;
        this.f20154h = interfaceC1809a1;
        this.f20156j = interfaceC1809a12;
        this.f20157k = interfaceC1809a13;
        this.f20158l = interfaceC1809a14;
        this.f20159m = interfaceC1809a15;
        this.f20160n = interfaceC1809a16;
        this.f20161o = interfaceC1809a17;
        this.f20165s = interfaceC1809a18;
        this.f20155i = interfaceC1809a19;
    }

    public /* synthetic */ C5237qb(ArrayList arrayList, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, Context context, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC1809a1 interfaceC1809a17, InterfaceC1809a1 interfaceC1809a18, InterfaceC1809a1 interfaceC1809a19, InterfaceC1809a1 interfaceC1809a110) {
        this.f20162p = arrayList;
        this.f20154h = interfaceC1809a1;
        this.f20156j = interfaceC1809a12;
        this.f20157k = interfaceC1809a13;
        this.f20158l = interfaceC1809a14;
        this.f20155i = context;
        this.f20159m = interfaceC1809a15;
        this.f20160n = interfaceC1809a16;
        this.f20161o = interfaceC1809a17;
        this.f20163q = interfaceC1809a18;
        this.f20164r = interfaceC1809a19;
        this.f20165s = interfaceC1809a110;
    }

    public /* synthetic */ C5237qb(List list, C1192y c1192y, C1109c1 c1109c1, Context context, C1845j1 c1845j1, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC1809a1 interfaceC1809a17) {
        this.f20164r = list;
        this.f20162p = c1192y;
        this.f20163q = c1109c1;
        this.f20155i = context;
        this.f20165s = c1845j1;
        this.f20154h = interfaceC1809a1;
        this.f20156j = interfaceC1809a12;
        this.f20157k = interfaceC1809a13;
        this.f20158l = interfaceC1809a14;
        this.f20159m = interfaceC1809a15;
        this.f20160n = interfaceC1809a16;
        this.f20161o = interfaceC1809a17;
    }

    public /* synthetic */ C5237qb(List list, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC3599t interfaceC3599t, Context context, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, C5725r c5725r, InterfaceC1809a1 interfaceC1809a17, InterfaceC1809a1 interfaceC1809a18) {
        this.f20164r = list;
        this.f20154h = interfaceC1809a1;
        this.f20156j = interfaceC1809a12;
        this.f20162p = interfaceC3599t;
        this.f20155i = context;
        this.f20157k = interfaceC1809a13;
        this.f20158l = interfaceC1809a14;
        this.f20159m = interfaceC1809a15;
        this.f20160n = interfaceC1809a16;
        this.f20163q = c5725r;
        this.f20161o = interfaceC1809a17;
        this.f20165s = interfaceC1809a18;
    }

    public /* synthetic */ C5237qb(C4969i5 c4969i5, String str, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, List list, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC1809a1 interfaceC1809a17, InterfaceC1220a interfaceC1220a, Context context) {
        this.f20162p = c4969i5;
        this.f20163q = str;
        this.f20154h = interfaceC1809a1;
        this.f20156j = interfaceC1809a12;
        this.f20164r = list;
        this.f20157k = interfaceC1809a13;
        this.f20158l = interfaceC1809a14;
        this.f20159m = interfaceC1809a15;
        this.f20160n = interfaceC1809a16;
        this.f20161o = interfaceC1809a17;
        this.f20165s = interfaceC1220a;
        this.f20155i = context;
    }
}
