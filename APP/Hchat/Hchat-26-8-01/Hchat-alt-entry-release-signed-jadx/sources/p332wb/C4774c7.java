package p332wb;

import android.content.Context;
import android.content.SharedPreferences;
import bsh.org.objectweb.asm.Opcodes;
import gg.AbstractC1416l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import okio.C3193a;
import p000a.AbstractC0000a;
import p025bc.AbstractC0255e;
import p036c9.C0443h0;
import p036c9.C0455k0;
import p051db.C0768f;
import p065eb.C0884o;
import p080fb.C1113d1;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p085fg.InterfaceC1236q;
import p100h0.C1515f;
import p116i.AbstractC1742d;
import p117i0.C1823e;
import p117i0.C1836h0;
import p117i0.C1851l;
import p117i0.InterfaceC1809a1;
import p126ia.C2022p;
import p136j8.AbstractC2091b;
import p198nb.C2925a0;
import p218og.AbstractC3149m;
import p222p.AbstractC3208d;
import p222p.AbstractC3222h1;
import p222p.C3272z0;
import p222p.InterfaceC3268x0;
import p243q9.C3471g;
import p249qg.InterfaceC3599t;
import p251r.AbstractC3617b0;
import p251r.C3619d;
import p251r.C3623h;
import p251r.C3641z;
import p253r1.AbstractC3649f;
import p265s.C3839k;
import p266s0.AbstractC3879i;
import p266s0.C3874d;
import p276sf.C3967n;
import p345x8.C5725r;
import p356y0.C5850l;
import p356y0.InterfaceC5853o;
import sh.C4060x;
import tf.AbstractC4166m;
import tf.AbstractC4167n;
import th.InterfaceC4209a;

/* JADX INFO: renamed from: wb.c7 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4774c7 implements InterfaceC1236q {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f16203g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f16204h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC1809a1 f16205i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC1809a1 f16206j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ InterfaceC1809a1 f16207k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f16208l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ Object f16209m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ Object f16210n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ Object f16211o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ Object f16212p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ Object f16213q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ Object f16214r;

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ Object f16215s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ Object f16216t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C4774c7(C1113d1 c1113d1, String str, LinkedHashSet linkedHashSet, InterfaceC1231l interfaceC1231l, Context context, InterfaceC1231l interfaceC1231l2, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC1809a1 interfaceC1809a17) {
        this.f16203g = 8;
        this.f16208l = c1113d1;
        this.f16213q = str;
        this.f16214r = linkedHashSet;
        this.f16215s = interfaceC1231l;
        this.f16204h = context;
        this.f16216t = interfaceC1231l2;
        this.f16205i = interfaceC1809a1;
        this.f16206j = interfaceC1809a12;
        this.f16207k = interfaceC1809a13;
        this.f16209m = interfaceC1809a14;
        this.f16210n = interfaceC1809a15;
        this.f16211o = interfaceC1809a16;
        this.f16212p = interfaceC1809a17;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:179:0x051f  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x05af A[PHI: r13 r26
  0x05af: PHI (r13v21 int) = (r13v18 int), (r13v24 int), (r13v25 int) binds: [B:217:0x05c4, B:214:0x05b9, B:209:0x05ad] A[DONT_GENERATE, DONT_INLINE]
  0x05af: PHI (r26v4 wb.n5) = (r26v1 wb.n5), (r26v6 wb.n5), (r26v6 wb.n5) binds: [B:217:0x05c4, B:214:0x05b9, B:209:0x05ad] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:211:0x05b1 A[PHI: r13 r26
  0x05b1: PHI (r13v19 int) = (r13v18 int), (r13v24 int), (r13v25 int) binds: [B:217:0x05c4, B:214:0x05b9, B:209:0x05ad] A[DONT_GENERATE, DONT_INLINE]
  0x05b1: PHI (r26v2 wb.n5) = (r26v1 wb.n5), (r26v6 wb.n5), (r26v6 wb.n5) binds: [B:217:0x05c4, B:214:0x05b9, B:209:0x05ad] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:220:0x05c9  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0600  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0604  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0522 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0607 A[SYNTHETIC] */
    @Override // p085fg.InterfaceC1236q
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo734b(Object obj, Object obj2, Object obj3) {
        InterfaceC5853o interfaceC5853o;
        EnumC5033k5 enumC5033k5;
        Object obj4;
        C1836h0 c1836h0;
        int i9;
        C5132n5 c5132n5;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z9;
        Set set;
        boolean z10;
        boolean z11;
        C5491y2 c5491y2;
        InterfaceC1809a1 interfaceC1809a1;
        InterfaceC5853o c3839k;
        boolean z12;
        InterfaceC1220a interfaceC1220a;
        switch (this.f16203g) {
            case 0:
                C5330t5 c5330t5 = (C5330t5) this.f16208l;
                Set set2 = (Set) this.f16213q;
                ArrayList arrayList = (ArrayList) this.f16215s;
                C4060x c4060x = (C4060x) this.f16204h;
                C5132n5 c5132n52 = (C5132n5) this.f16216t;
                InterfaceC1809a1 interfaceC1809a12 = (InterfaceC1809a1) this.f16209m;
                InterfaceC1809a1 interfaceC1809a13 = (InterfaceC1809a1) this.f16210n;
                InterfaceC1809a1 interfaceC1809a14 = (InterfaceC1809a1) this.f16211o;
                InterfaceC1809a1 interfaceC1809a15 = (InterfaceC1809a1) this.f16212p;
                Set set3 = (Set) this.f16214r;
                InterfaceC3268x0 interfaceC3268x0 = (InterfaceC3268x0) obj;
                C1836h0 c1836h02 = (C1836h0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                interfaceC3268x0.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= c1836h02.m4534f(interfaceC3268x0) ? 4 : 2;
                }
                if (c1836h02.m4516S(iIntValue & 1, (iIntValue & 19) != 18)) {
                    InterfaceC1809a1 interfaceC1809a16 = this.f16205i;
                    Object c5165o5 = (((EnumC5033k5) interfaceC1809a16.getValue()) == EnumC5033k5.f18308l && c5330t5 == null) ? C5198p5.f19929a : new C5165o5((EnumC5033k5) interfaceC1809a16.getValue(), c5330t5);
                    Object objM4514P = c1836h02.m4514P();
                    if (objM4514P == C1851l.f6155a) {
                        objM4514P = new C5204pb(3);
                        c1836h02.m4545k0(objM4514P);
                    }
                    AbstractC4955ho.m9322E3(c5165o5, null, "MessageBlockContactPickerTransition", (InterfaceC1231l) objM4514P, false, AbstractC3879i.m8071e(-1970903183, new C4774c7(set2, arrayList, c4060x, interfaceC3268x0, interfaceC1809a16, c5132n52, this.f16206j, this.f16207k, interfaceC1809a12, interfaceC1809a13, interfaceC1809a14, interfaceC1809a15, set3), c1836h02), c1836h02, 224640, 2);
                } else {
                    c1836h02.m4519V();
                }
                break;
            case 1:
                C4060x c4060x2 = (C4060x) this.f16204h;
                C3641z c3641z = (C3641z) this.f16208l;
                String str = (String) this.f16209m;
                InterfaceC1231l interfaceC1231l = (InterfaceC1231l) this.f16210n;
                List list = (List) this.f16211o;
                InterfaceC1220a interfaceC1220a2 = (InterfaceC1220a) this.f16212p;
                List list2 = (List) this.f16213q;
                Context context = (Context) this.f16214r;
                InterfaceC1231l interfaceC1231l2 = (InterfaceC1231l) this.f16215s;
                InterfaceC1235p interfaceC1235p = (InterfaceC1235p) this.f16216t;
                InterfaceC3268x0 interfaceC3268x02 = (InterfaceC3268x0) obj;
                C1836h0 c1836h03 = (C1836h0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                interfaceC3268x02.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= c1836h03.m4534f(interfaceC3268x02) ? 4 : 2;
                }
                if (c1836h03.m4516S(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    InterfaceC5853o interfaceC5853oM7631a = AbstractC3649f.m7631a(AbstractC3222h1.f10289c, c4060x2.f13440e, null);
                    C3272z0 c3272z0M6872b = AbstractC3208d.m6872b(interfaceC3268x02.mo6924c() + 8, interfaceC3268x02.mo6922a() + 84, 5);
                    boolean zM4534f = c1836h03.m4534f(str) | c1836h03.m4534f(interfaceC1231l) | c1836h03.m4538h(list) | c1836h03.m4534f(interfaceC1220a2) | c1836h03.m4538h(list2) | c1836h03.m4538h(context) | c1836h03.m4534f(interfaceC1231l2) | c1836h03.m4534f(interfaceC1235p);
                    Object objM4514P2 = c1836h03.m4514P();
                    if (zM4534f || objM4514P2 == C1851l.f6155a) {
                        interfaceC5853o = interfaceC5853oM7631a;
                        C5531za c5531za = new C5531za(list, list2, this.f16205i, str, interfaceC1231l, this.f16206j, interfaceC1220a2, context, interfaceC1231l2, interfaceC1235p, this.f16207k);
                        c1836h03.m4545k0(c5531za);
                        objM4514P2 = c5531za;
                    } else {
                        interfaceC5853o = interfaceC5853oM7631a;
                    }
                    AbstractC0000a.m53b(interfaceC5853o, c3641z, c3272z0M6872b, null, null, null, false, null, (InterfaceC1231l) objM4514P2, c1836h03, 0, 504);
                } else {
                    c1836h03.m4519V();
                }
                break;
            case 2:
                InterfaceC1809a1 interfaceC1809a17 = (InterfaceC1809a1) this.f16209m;
                InterfaceC1809a1 interfaceC1809a18 = (InterfaceC1809a1) this.f16210n;
                InterfaceC1809a1 interfaceC1809a19 = (InterfaceC1809a1) this.f16211o;
                InterfaceC1809a1 interfaceC1809a110 = (InterfaceC1809a1) this.f16212p;
                C5725r c5725r = (C5725r) this.f16208l;
                SharedPreferences sharedPreferences = (SharedPreferences) this.f16213q;
                Context context2 = (Context) this.f16214r;
                InterfaceC1809a1 interfaceC1809a111 = (InterfaceC1809a1) this.f16215s;
                InterfaceC1809a1 interfaceC1809a112 = (InterfaceC1809a1) this.f16204h;
                InterfaceC1809a1 interfaceC1809a113 = (InterfaceC1809a1) this.f16216t;
                C1836h0 c1836h04 = (C1836h0) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((InterfaceC4209a) obj).getClass();
                if (c1836h04.m4516S(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    InterfaceC1809a1 interfaceC1809a114 = this.f16205i;
                    boolean zM4534f2 = c1836h04.m4534f(interfaceC1809a114);
                    InterfaceC1809a1 interfaceC1809a115 = this.f16206j;
                    boolean zM4534f3 = zM4534f2 | c1836h04.m4534f(interfaceC1809a115);
                    InterfaceC1809a1 interfaceC1809a116 = this.f16207k;
                    boolean zM4534f4 = zM4534f3 | c1836h04.m4534f(interfaceC1809a116) | c1836h04.m4534f(interfaceC1809a17) | c1836h04.m4534f(interfaceC1809a18) | c1836h04.m4534f(interfaceC1809a19) | c1836h04.m4534f(interfaceC1809a110) | c1836h04.m4538h(c5725r) | c1836h04.m4538h(sharedPreferences) | c1836h04.m4538h(context2);
                    Object objM4514P3 = c1836h04.m4514P();
                    C1823e c1823e = C1851l.f6155a;
                    if (zM4534f4 || objM4514P3 == c1823e) {
                        objM4514P3 = new C2925a0(c5725r, sharedPreferences, context2, interfaceC1809a114, interfaceC1809a115, interfaceC1809a116, interfaceC1809a17, interfaceC1809a18, interfaceC1809a19, interfaceC1809a110, interfaceC1809a111, interfaceC1809a112);
                        c1836h04.m4545k0(objM4514P3);
                    }
                    InterfaceC1220a interfaceC1220a3 = (InterfaceC1220a) objM4514P3;
                    Object objM4514P4 = c1836h04.m4514P();
                    if (objM4514P4 == c1823e) {
                        objM4514P4 = new C5070l9(interfaceC1809a113, 11);
                        c1836h04.m4545k0(objM4514P4);
                    }
                    AbstractC4955ho.m9382M("保存智聊", interfaceC1220a3, "返回", (InterfaceC1220a) objM4514P4, null, null, c1836h04, 3462, 48);
                } else {
                    c1836h04.m4519V();
                }
                break;
            case 3:
                Set set4 = (Set) this.f16213q;
                ArrayList arrayList2 = (ArrayList) this.f16215s;
                C4060x c4060x3 = (C4060x) this.f16204h;
                InterfaceC3268x0 interfaceC3268x03 = (InterfaceC3268x0) this.f16208l;
                C5132n5 c5132n53 = (C5132n5) this.f16216t;
                InterfaceC1809a1 interfaceC1809a117 = (InterfaceC1809a1) this.f16209m;
                InterfaceC1809a1 interfaceC1809a118 = (InterfaceC1809a1) this.f16210n;
                InterfaceC1809a1 interfaceC1809a119 = (InterfaceC1809a1) this.f16211o;
                InterfaceC1809a1 interfaceC1809a120 = (InterfaceC1809a1) this.f16212p;
                Set set5 = (Set) this.f16214r;
                AbstractC5231q5 abstractC5231q5 = (AbstractC5231q5) obj;
                C1836h0 c1836h05 = (C1836h0) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                abstractC5231q5.getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= (iIntValue4 & 8) == 0 ? c1836h05.m4534f(abstractC5231q5) : c1836h05.m4538h(abstractC5231q5) ? 4 : 2;
                }
                int i15 = 1;
                if (c1836h05.m4516S(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    InterfaceC1809a1 interfaceC1809a121 = this.f16207k;
                    String string = AbstractC3149m.m6703R0((String) interfaceC1809a121.getValue()).toString();
                    Locale locale = Locale.US;
                    String strM5165l = AbstractC2091b.m5165l(locale, string, locale);
                    boolean z13 = abstractC5231q5 instanceof C5198p5;
                    boolean z14 = abstractC5231q5 instanceof C5165o5;
                    C5165o5 c5165o52 = z14 ? (C5165o5) abstractC5231q5 : null;
                    EnumC5033k5 enumC5033k52 = EnumC5033k5.f18308l;
                    if (c5165o52 == null || (enumC5033k5 = c5165o52.f19315a) == null) {
                        enumC5033k5 = enumC5033k52;
                    }
                    C5165o5 c5165o53 = z14 ? (C5165o5) abstractC5231q5 : null;
                    C5330t5 c5330t52 = c5165o53 != null ? c5165o53.f19316b : null;
                    List list3 = ((C5000j5) interfaceC1809a120.getValue()).f18048b;
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj5 : list3) {
                        InterfaceC1809a1 interfaceC1809a122 = interfaceC1809a119;
                        InterfaceC1809a1 interfaceC1809a123 = interfaceC1809a118;
                        C5330t5 c5330t53 = (C5330t5) obj5;
                        InterfaceC1809a1 interfaceC1809a124 = interfaceC1809a117;
                        List list4 = c5330t53.f20753c;
                        if (list4.isEmpty()) {
                            z9 = false;
                        } else {
                            Iterator it = list4.iterator();
                            while (it.hasNext()) {
                                Iterator it2 = it;
                                if (set5.contains((String) it.next())) {
                                    z9 = true;
                                } else {
                                    it = it2;
                                }
                            }
                            z9 = false;
                        }
                        if (z9) {
                            if (strM5165l.length() == 0) {
                                set = set5;
                                z10 = z13;
                            } else {
                                String str2 = c5330t53.f20752b;
                                set = set5;
                                Locale locale2 = Locale.US;
                                z10 = z13;
                                if (AbstractC0255e.m1032u(locale2, str2, locale2, strM5165l, false) || AbstractC0255e.m1031t(c5330t53.f20751a, locale2, strM5165l, false)) {
                                }
                                if (z11) {
                                    arrayList3.add(obj5);
                                }
                                interfaceC1809a119 = interfaceC1809a122;
                                interfaceC1809a118 = interfaceC1809a123;
                                interfaceC1809a117 = interfaceC1809a124;
                                set5 = set;
                                z13 = z10;
                            }
                            z11 = true;
                            if (z11) {
                            }
                            interfaceC1809a119 = interfaceC1809a122;
                            interfaceC1809a118 = interfaceC1809a123;
                            interfaceC1809a117 = interfaceC1809a124;
                            set5 = set;
                            z13 = z10;
                        } else {
                            set = set5;
                            z10 = z13;
                        }
                        z11 = false;
                        if (z11) {
                        }
                        interfaceC1809a119 = interfaceC1809a122;
                        interfaceC1809a118 = interfaceC1809a123;
                        interfaceC1809a117 = interfaceC1809a124;
                        set5 = set;
                        z13 = z10;
                    }
                    final InterfaceC1809a1 interfaceC1809a125 = interfaceC1809a117;
                    final InterfaceC1809a1 interfaceC1809a126 = interfaceC1809a118;
                    final InterfaceC1809a1 interfaceC1809a127 = interfaceC1809a119;
                    final boolean z15 = z13;
                    boolean zM4538h = c1836h05.m4538h(set4);
                    Object objM4514P5 = c1836h05.m4514P();
                    C1823e c1823e2 = C1851l.f6155a;
                    if (zM4538h || objM4514P5 == c1823e2) {
                        objM4514P5 = new C2022p(set4, 4);
                        c1836h05.m4545k0(objM4514P5);
                    }
                    ArrayList arrayListM9547f7 = AbstractC4955ho.m9547f7((InterfaceC1231l) objM4514P5, arrayList3);
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it3 = arrayList2.iterator();
                    while (it3.hasNext()) {
                        Object next = it3.next();
                        C5099m5 c5099m5 = (C5099m5) next;
                        Iterator it4 = it3;
                        C5292s0 c5292s0 = c5099m5.f18836a;
                        ArrayList arrayList5 = arrayListM9547f7;
                        EnumC5066l5 enumC5066l5 = c5099m5.f18837b;
                        InterfaceC1809a1 interfaceC1809a128 = interfaceC1809a121;
                        int iOrdinal = enumC5033k5.ordinal();
                        if (iOrdinal != 0) {
                            c5132n5 = c5132n53;
                            int i16 = i15;
                            if (iOrdinal != i16) {
                                if (iOrdinal != 2) {
                                    if (iOrdinal == 3) {
                                        if (c5330t52 != null) {
                                            i9 = 1;
                                            int i17 = c5330t52.f20753c.contains(c5292s0.f20550a) ? 1 : 0;
                                            i11 = i17;
                                        } else {
                                            i9 = 1;
                                        }
                                        i11 = i17;
                                    } else if (iOrdinal != 4) {
                                        C3193a.m6822k();
                                    } else {
                                        i11 = 1;
                                        i9 = 1;
                                    }
                                    if (i11 == 0) {
                                        if (!AbstractC4955ho.m9573i6(c5292s0, strM5165l)) {
                                            List list5 = c5099m5.f18838c;
                                            if (list5.isEmpty()) {
                                                i12 = 0;
                                                i14 = 0;
                                            } else {
                                                Iterator it5 = list5.iterator();
                                                while (true) {
                                                    if (it5.hasNext()) {
                                                        String str3 = (String) it5.next();
                                                        Locale locale3 = Locale.US;
                                                        i12 = 0;
                                                        if (AbstractC0255e.m1032u(locale3, str3, locale3, strM5165l, false)) {
                                                            i14 = i9;
                                                        }
                                                    } else {
                                                        i12 = 0;
                                                        i14 = 0;
                                                    }
                                                }
                                            }
                                            if (i14 != 0) {
                                            }
                                            if (i13 == 0) {
                                                arrayList4.add(next);
                                            }
                                            i15 = i9;
                                            it3 = it4;
                                            arrayListM9547f7 = arrayList5;
                                            interfaceC1809a121 = interfaceC1809a128;
                                            c5132n53 = c5132n5;
                                        }
                                        i13 = i9;
                                        if (i13 == 0) {
                                        }
                                        i15 = i9;
                                        it3 = it4;
                                        arrayListM9547f7 = arrayList5;
                                        interfaceC1809a121 = interfaceC1809a128;
                                        c5132n53 = c5132n5;
                                    } else {
                                        i12 = 0;
                                    }
                                    i13 = i12;
                                    if (i13 == 0) {
                                    }
                                    i15 = i9;
                                    it3 = it4;
                                    arrayListM9547f7 = arrayList5;
                                    interfaceC1809a121 = interfaceC1809a128;
                                    c5132n53 = c5132n5;
                                } else {
                                    i9 = 1;
                                    i10 = enumC5066l5 == EnumC5066l5.f18554i ? i9 : 0;
                                }
                                break;
                            } else {
                                i9 = i16;
                                if (enumC5066l5 == EnumC5066l5.f18553h) {
                                }
                            }
                        } else {
                            i9 = i15;
                            c5132n5 = c5132n53;
                            if (enumC5066l5 == EnumC5066l5.f18552g) {
                            }
                        }
                        i11 = i10;
                        if (i11 == 0) {
                        }
                        i13 = i12;
                        if (i13 == 0) {
                        }
                        i15 = i9;
                        it3 = it4;
                        arrayListM9547f7 = arrayList5;
                        interfaceC1809a121 = interfaceC1809a128;
                        c5132n53 = c5132n5;
                    }
                    final ArrayList arrayList6 = arrayListM9547f7;
                    final C5132n5 c5132n54 = c5132n53;
                    final InterfaceC1809a1 interfaceC1809a129 = interfaceC1809a121;
                    boolean zM4538h2 = c1836h05.m4538h(set4);
                    Object objM4514P6 = c1836h05.m4514P();
                    if (zM4538h2 || objM4514P6 == c1823e2) {
                        objM4514P6 = new C2022p(set4, 5);
                        c1836h05.m4545k0(objM4514P6);
                    }
                    final ArrayList arrayListM9547f72 = AbstractC4955ho.m9547f7((InterfaceC1231l) objM4514P6, arrayList4);
                    ArrayList arrayList7 = new ArrayList(AbstractC4167n.m8429e1(arrayListM9547f72));
                    Iterator it6 = arrayListM9547f72.iterator();
                    while (it6.hasNext()) {
                        arrayList7.add(((C5099m5) it6.next()).f18836a.f20550a);
                    }
                    Set setM8412U1 = AbstractC4166m.m8412U1(arrayList7);
                    final String str4 = z15 ? "标签" : enumC5033k5 == enumC5033k52 ? "标签成员" : enumC5033k5.f18312h;
                    final int size = z15 ? arrayList6.size() : setM8412U1.size();
                    C3641z c3641zM7603a = AbstractC3617b0.m7603a(c1836h05);
                    InterfaceC5853o interfaceC5853oM7631a2 = AbstractC3649f.m7631a(AbstractC3222h1.f10289c, c4060x3.f13440e, null);
                    C3272z0 c3272z0M6872b2 = AbstractC3208d.m6872b(interfaceC3268x03.mo6924c() + 8, interfaceC3268x03.mo6922a() + 84, 5);
                    final InterfaceC1809a1 interfaceC1809a130 = this.f16205i;
                    boolean zM4534f5 = c1836h05.m4534f(interfaceC1809a130) | c1836h05.m4534f(c5132n54);
                    final InterfaceC1809a1 interfaceC1809a131 = this.f16206j;
                    boolean zM4534f6 = zM4534f5 | c1836h05.m4534f(interfaceC1809a131) | c1836h05.m4534f(interfaceC1809a129) | c1836h05.m4536g(z15) | c1836h05.m4530d(size) | c1836h05.m4534f(str4) | c1836h05.m4534f(interfaceC1809a125) | c1836h05.m4534f(interfaceC1809a126) | c1836h05.m4538h(arrayList6) | c1836h05.m4538h(arrayListM9547f72) | c1836h05.m4534f(interfaceC1809a127);
                    Object objM4514P7 = c1836h05.m4514P();
                    if (zM4534f6 || objM4514P7 == c1823e2) {
                        c1836h0 = c1836h05;
                        obj4 = new InterfaceC1231l() { // from class: wb.ne
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            @Override // p085fg.InterfaceC1231l
                            public final Object invoke(Object obj6) {
                                C3623h c3623h = (C3623h) obj6;
                                c3623h.getClass();
                                C5132n5 c5132n55 = c5132n54;
                                InterfaceC1809a1 interfaceC1809a132 = interfaceC1809a130;
                                InterfaceC1809a1 interfaceC1809a133 = interfaceC1809a131;
                                InterfaceC1809a1 interfaceC1809a134 = interfaceC1809a129;
                                C3623h.m7604a(c3623h, null, new C3874d(-1762330372, new C0455k0(c5132n55, interfaceC1809a132, interfaceC1809a133, interfaceC1809a134, 16), true), 3);
                                boolean z16 = z15;
                                C3623h.m7604a(c3623h, null, new C3874d(137088741, new C1515f(z16, interfaceC1809a134, 5), true), 3);
                                final int i18 = size;
                                final String str5 = str4;
                                C3623h.m7604a(c3623h, null, new C3874d(661894852, new InterfaceC1236q() { // from class: wb.mg
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                    @Override // p085fg.InterfaceC1236q
                                    /* JADX INFO: renamed from: b */
                                    public final Object mo734b(Object obj7, Object obj8, Object obj9) {
                                        C1836h0 c1836h06 = (C1836h0) obj8;
                                        int iIntValue5 = ((Integer) obj9).intValue();
                                        ((C3619d) obj7).getClass();
                                        if (c1836h06.m4516S(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                                            int i19 = i18;
                                            String str6 = str5;
                                            if (i19 > 0) {
                                                str6 = str6 + " · " + i19 + " 项";
                                            }
                                            AbstractC4955ho.m9321E2(str6, c1836h06, 0);
                                        } else {
                                            c1836h06.m4519V();
                                        }
                                        return C3967n.f12976a;
                                    }
                                }, true), 3);
                                if (((Boolean) interfaceC1809a125.getValue()).booleanValue()) {
                                    C3623h.m7604a(c3623h, null, AbstractC5193p0.f19627M5, 3);
                                } else {
                                    InterfaceC1809a1 interfaceC1809a135 = interfaceC1809a126;
                                    if (((String) interfaceC1809a135.getValue()).length() > 0) {
                                        C3623h.m7604a(c3623h, null, new C3874d(-873044613, new C5373uf(interfaceC1809a135, 4), true), 3);
                                    } else if (z16) {
                                        ArrayList arrayList8 = arrayList6;
                                        if (arrayList8.isEmpty()) {
                                            C3623h.m7604a(c3623h, null, AbstractC5193p0.f19641O5, 3);
                                        } else {
                                            Iterator it7 = arrayList8.iterator();
                                            while (it7.hasNext()) {
                                                C3623h.m7604a(c3623h, null, new C3874d(-336677940, new C0443h0((C5330t5) it7.next(), interfaceC1809a133, interfaceC1809a134, 23), true), 3);
                                            }
                                        }
                                    } else {
                                        ArrayList arrayList9 = arrayListM9547f72;
                                        if (arrayList9.isEmpty()) {
                                            C3623h.m7604a(c3623h, null, AbstractC5193p0.f19655Q5, 3);
                                        } else {
                                            Iterator it8 = arrayList9.iterator();
                                            while (it8.hasNext()) {
                                                C3623h.m7604a(c3623h, null, new C3874d(1398150179, new C0768f((C5099m5) it8.next(), 14, interfaceC1809a127), true), 3);
                                            }
                                        }
                                    }
                                }
                                return C3967n.f12976a;
                            }
                        };
                        c1836h0.m4545k0(obj4);
                    } else {
                        obj4 = objM4514P7;
                        c1836h0 = c1836h05;
                    }
                    AbstractC0000a.m53b(interfaceC5853oM7631a2, c3641zM7603a, c3272z0M6872b2, null, null, null, false, null, (InterfaceC1231l) obj4, c1836h0, 0, 504);
                } else {
                    c1836h05.m4519V();
                }
                break;
            case 4:
                C3471g c3471g = (C3471g) this.f16208l;
                String str5 = (String) this.f16211o;
                String str6 = (String) this.f16212p;
                InterfaceC1809a1 interfaceC1809a132 = (InterfaceC1809a1) this.f16209m;
                String str7 = (String) this.f16213q;
                InterfaceC1809a1 interfaceC1809a133 = (InterfaceC1809a1) this.f16210n;
                String str8 = (String) this.f16214r;
                SharedPreferences sharedPreferences2 = (SharedPreferences) this.f16215s;
                String str9 = (String) this.f16204h;
                InterfaceC1220a interfaceC1220a4 = (InterfaceC1220a) this.f16216t;
                C1836h0 c1836h06 = (C1836h0) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h06.m4516S(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(1819334423, new C5528z7(c3471g, this.f16205i, this.f16206j, str5, this.f16207k, str6, interfaceC1809a132, str7, interfaceC1809a133, str8, sharedPreferences2, str9, interfaceC1220a4), c1836h06), c1836h06, 48, 1);
                } else {
                    c1836h06.m4519V();
                }
                break;
            case 5:
                InterfaceC1809a1 interfaceC1809a134 = (InterfaceC1809a1) this.f16209m;
                InterfaceC1809a1 interfaceC1809a135 = (InterfaceC1809a1) this.f16210n;
                InterfaceC1809a1 interfaceC1809a136 = (InterfaceC1809a1) this.f16211o;
                InterfaceC1809a1 interfaceC1809a137 = (InterfaceC1809a1) this.f16212p;
                SharedPreferences sharedPreferences3 = (SharedPreferences) this.f16208l;
                InterfaceC3599t interfaceC3599t = (InterfaceC3599t) this.f16213q;
                Context context3 = (Context) this.f16214r;
                InterfaceC1809a1 interfaceC1809a138 = (InterfaceC1809a1) this.f16215s;
                InterfaceC1809a1 interfaceC1809a139 = (InterfaceC1809a1) this.f16204h;
                InterfaceC1809a1 interfaceC1809a140 = (InterfaceC1809a1) this.f16216t;
                C1836h0 c1836h07 = (C1836h0) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h07.m4516S(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(-547435127, new C5528z7(this.f16205i, this.f16206j, this.f16207k, interfaceC1809a134, interfaceC1809a135, interfaceC1809a136, interfaceC1809a137, sharedPreferences3, interfaceC3599t, context3, interfaceC1809a138, interfaceC1809a139, interfaceC1809a140), c1836h07), c1836h07, 48, 1);
                } else {
                    c1836h07.m4519V();
                }
                break;
            case 6:
                C4060x c4060x4 = (C4060x) this.f16204h;
                C3641z c3641z2 = (C3641z) this.f16208l;
                SharedPreferences sharedPreferences4 = (SharedPreferences) this.f16213q;
                List list6 = (List) this.f16214r;
                InterfaceC1809a1 interfaceC1809a141 = (InterfaceC1809a1) this.f16209m;
                InterfaceC1809a1 interfaceC1809a142 = (InterfaceC1809a1) this.f16210n;
                InterfaceC1809a1 interfaceC1809a143 = (InterfaceC1809a1) this.f16211o;
                InterfaceC1809a1 interfaceC1809a144 = (InterfaceC1809a1) this.f16212p;
                InterfaceC1809a1 interfaceC1809a145 = (InterfaceC1809a1) this.f16215s;
                InterfaceC1809a1 interfaceC1809a146 = (InterfaceC1809a1) this.f16216t;
                InterfaceC3268x0 interfaceC3268x04 = (InterfaceC3268x0) obj;
                C1836h0 c1836h08 = (C1836h0) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                interfaceC3268x04.getClass();
                if ((iIntValue7 & 6) == 0) {
                    iIntValue7 |= c1836h08.m4534f(interfaceC3268x04) ? 4 : 2;
                }
                if (c1836h08.m4516S(iIntValue7 & 1, (iIntValue7 & 19) != 18)) {
                    InterfaceC5853o interfaceC5853oM7631a3 = AbstractC3649f.m7631a(AbstractC3222h1.f10289c, c4060x4.f13440e, null);
                    C3272z0 c3272z0M6872b3 = AbstractC3208d.m6872b(interfaceC3268x04.mo6924c() + 8, interfaceC3268x04.mo6922a() + 84, 5);
                    boolean zM4538h3 = c1836h08.m4538h(sharedPreferences4) | c1836h08.m4538h(list6);
                    Object objM4514P8 = c1836h08.m4514P();
                    if (zM4538h3 || objM4514P8 == C1851l.f6155a) {
                        C5531za c5531za2 = new C5531za(sharedPreferences4, this.f16205i, this.f16206j, this.f16207k, list6, interfaceC1809a141, interfaceC1809a142, interfaceC1809a143, interfaceC1809a144, interfaceC1809a145, interfaceC1809a146);
                        c1836h08.m4545k0(c5531za2);
                        objM4514P8 = c5531za2;
                    }
                    AbstractC0000a.m53b(interfaceC5853oM7631a3, c3641z2, c3272z0M6872b3, null, null, null, false, null, (InterfaceC1231l) objM4514P8, c1836h08, 0, 504);
                } else {
                    c1836h08.m4519V();
                }
                break;
            case 7:
                C4060x c4060x5 = (C4060x) this.f16204h;
                C3641z c3641z3 = (C3641z) this.f16208l;
                InterfaceC1220a interfaceC1220a5 = (InterfaceC1220a) this.f16210n;
                InterfaceC1220a interfaceC1220a6 = (InterfaceC1220a) this.f16211o;
                String str10 = (String) this.f16212p;
                List list7 = (List) this.f16213q;
                ArrayList arrayList8 = (ArrayList) this.f16215s;
                List list8 = (List) this.f16214r;
                InterfaceC1235p interfaceC1235p2 = (InterfaceC1235p) this.f16216t;
                InterfaceC1809a1 interfaceC1809a147 = (InterfaceC1809a1) this.f16209m;
                InterfaceC3268x0 interfaceC3268x05 = (InterfaceC3268x0) obj;
                C1836h0 c1836h09 = (C1836h0) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                interfaceC3268x05.getClass();
                if ((iIntValue8 & 6) == 0) {
                    iIntValue8 |= c1836h09.m4534f(interfaceC3268x05) ? 4 : 2;
                }
                if (c1836h09.m4516S(iIntValue8 & 1, (iIntValue8 & 19) != 18)) {
                    InterfaceC5853o interfaceC5853oM7631a4 = AbstractC3649f.m7631a(AbstractC3222h1.f10289c, c4060x5.f13440e, null);
                    C3272z0 c3272z0M6872b4 = AbstractC3208d.m6872b(interfaceC3268x05.mo6924c() + 8, interfaceC3268x05.mo6922a() + 84, 5);
                    boolean zM4534f7 = c1836h09.m4534f(interfaceC1220a5) | c1836h09.m4534f(interfaceC1220a6) | c1836h09.m4534f(str10) | c1836h09.m4538h(list7) | c1836h09.m4538h(arrayList8) | c1836h09.m4538h(list8) | c1836h09.m4534f(interfaceC1235p2);
                    Object objM4514P9 = c1836h09.m4514P();
                    if (zM4534f7 || objM4514P9 == C1851l.f6155a) {
                        C5531za c5531za3 = new C5531za(this.f16205i, this.f16206j, this.f16207k, interfaceC1220a5, interfaceC1220a6, str10, list7, arrayList8, list8, interfaceC1235p2, interfaceC1809a147);
                        c1836h09.m4545k0(c5531za3);
                        objM4514P9 = c5531za3;
                    }
                    AbstractC0000a.m53b(interfaceC5853oM7631a4, c3641z3, c3272z0M6872b4, null, null, null, false, null, (InterfaceC1231l) objM4514P9, c1836h09, 0, 504);
                } else {
                    c1836h09.m4519V();
                }
                break;
            default:
                C1113d1 c1113d1 = (C1113d1) this.f16208l;
                String str11 = (String) this.f16213q;
                LinkedHashSet linkedHashSet = (LinkedHashSet) this.f16214r;
                InterfaceC1231l interfaceC1231l3 = (InterfaceC1231l) this.f16215s;
                Context context4 = (Context) this.f16204h;
                InterfaceC1231l interfaceC1231l4 = (InterfaceC1231l) this.f16216t;
                InterfaceC1809a1 interfaceC1809a148 = (InterfaceC1809a1) this.f16209m;
                InterfaceC1809a1 interfaceC1809a149 = (InterfaceC1809a1) this.f16210n;
                InterfaceC1809a1 interfaceC1809a150 = (InterfaceC1809a1) this.f16211o;
                InterfaceC1809a1 interfaceC1809a151 = (InterfaceC1809a1) this.f16212p;
                C3619d c3619d = (C3619d) obj;
                C1836h0 c1836h010 = (C1836h0) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                c3619d.getClass();
                if ((iIntValue9 & 6) == 0) {
                    iIntValue9 |= c1836h010.m4534f(c3619d) ? 4 : 2;
                }
                if (c1836h010.m4516S(iIntValue9 & 1, (iIntValue9 & 19) != 18)) {
                    C5491y2 c5491y22 = C5491y2.f22066n;
                    InterfaceC1809a1 interfaceC1809a152 = this.f16205i;
                    String str12 = (String) interfaceC1809a152.getValue();
                    String str13 = c1113d1.f3636a;
                    if (AbstractC1416l.m3825a(str12, str13)) {
                        c3839k = C5850l.f23787a;
                        c5491y2 = c5491y22;
                        interfaceC1809a1 = interfaceC1809a152;
                    } else {
                        c5491y2 = c5491y22;
                        interfaceC1809a1 = interfaceC1809a152;
                        c3839k = new C3839k(AbstractC1742d.m4380p(Opcodes.GETFIELD, 6, null));
                    }
                    boolean zM3825a = AbstractC1416l.m3825a(str13, str11);
                    boolean zContains = linkedHashSet.contains(str13);
                    boolean zM4534f8 = c1836h010.m4534f(interfaceC1231l3) | c1836h010.m4538h(c1113d1);
                    Object objM4514P10 = c1836h010.m4514P();
                    C1823e c1823e3 = C1851l.f6155a;
                    if (zM4534f8 || objM4514P10 == c1823e3) {
                        objM4514P10 = new C5475xi(interfaceC1231l3, 13, c1113d1);
                        c1836h010.m4545k0(objM4514P10);
                    }
                    InterfaceC1220a interfaceC1220a7 = (InterfaceC1220a) objM4514P10;
                    boolean zM4538h4 = c1836h010.m4538h(c1113d1);
                    Object objM4514P11 = c1836h010.m4514P();
                    if (zM4538h4 || objM4514P11 == c1823e3) {
                        z12 = zM3825a;
                        objM4514P11 = new C5475xi(c1113d1, 14, this.f16206j);
                        c1836h010.m4545k0(objM4514P11);
                    } else {
                        z12 = zM3825a;
                    }
                    InterfaceC1220a interfaceC1220a8 = (InterfaceC1220a) objM4514P11;
                    boolean zM4538h5 = c1836h010.m4538h(c1113d1);
                    Object objM4514P12 = c1836h010.m4514P();
                    if (zM4538h5 || objM4514P12 == c1823e3) {
                        interfaceC1220a = interfaceC1220a8;
                        objM4514P12 = new C5055kr(c1113d1, this.f16207k, interfaceC1809a148, 1);
                        c1836h010.m4545k0(objM4514P12);
                    } else {
                        interfaceC1220a = interfaceC1220a8;
                    }
                    InterfaceC1220a interfaceC1220a9 = (InterfaceC1220a) objM4514P12;
                    boolean zM4538h6 = c1836h010.m4538h(c1113d1) | c1836h010.m4538h(context4);
                    Object objM4514P13 = c1836h010.m4514P();
                    if (zM4538h6 || objM4514P13 == c1823e3) {
                        objM4514P13 = new C5538zh(c1113d1, context4, interfaceC1809a149, 9);
                        c1836h010.m4545k0(objM4514P13);
                    }
                    InterfaceC1220a interfaceC1220a10 = (InterfaceC1220a) objM4514P13;
                    boolean zM4538h7 = c1836h010.m4538h(c1113d1);
                    Object objM4514P14 = c1836h010.m4514P();
                    if (zM4538h7 || objM4514P14 == c1823e3) {
                        objM4514P14 = new C4819dj(c1113d1, interfaceC1809a150, interfaceC1809a151, 5);
                        c1836h010.m4545k0(objM4514P14);
                    }
                    InterfaceC1231l interfaceC1231l5 = (InterfaceC1231l) objM4514P14;
                    boolean zM4538h8 = c1836h010.m4538h(c1113d1) | c1836h010.m4534f(interfaceC1231l4);
                    Object objM4514P15 = c1836h010.m4514P();
                    if (zM4538h8 || objM4514P15 == c1823e3) {
                        C0884o c0884o = new C0884o(c1113d1, interfaceC1231l4, interfaceC1809a1, interfaceC1809a151, interfaceC1809a150, 21);
                        c1836h010.m4545k0(c0884o);
                        objM4514P15 = c0884o;
                    }
                    c5491y2.m9880Z(c3839k, c1113d1, z12, zContains, interfaceC1220a7, interfaceC1220a, interfaceC1220a9, interfaceC1220a10, interfaceC1231l5, (InterfaceC1231l) objM4514P15, c1836h010, 0);
                } else {
                    c1836h010.m4519V();
                }
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C4774c7(InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC1809a1 interfaceC1809a17, Object obj, Object obj2, Context context, InterfaceC1809a1 interfaceC1809a18, InterfaceC1809a1 interfaceC1809a19, InterfaceC1809a1 interfaceC1809a110, int i9) {
        this.f16203g = i9;
        this.f16205i = interfaceC1809a1;
        this.f16206j = interfaceC1809a12;
        this.f16207k = interfaceC1809a13;
        this.f16209m = interfaceC1809a14;
        this.f16210n = interfaceC1809a15;
        this.f16211o = interfaceC1809a16;
        this.f16212p = interfaceC1809a17;
        this.f16208l = obj;
        this.f16213q = obj2;
        this.f16214r = context;
        this.f16215s = interfaceC1809a18;
        this.f16204h = interfaceC1809a19;
        this.f16216t = interfaceC1809a110;
    }

    public /* synthetic */ C4774c7(Set set, ArrayList arrayList, C4060x c4060x, InterfaceC3268x0 interfaceC3268x0, InterfaceC1809a1 interfaceC1809a1, C5132n5 c5132n5, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC1809a1 interfaceC1809a17, Set set2) {
        this.f16203g = 3;
        this.f16213q = set;
        this.f16215s = arrayList;
        this.f16204h = c4060x;
        this.f16208l = interfaceC3268x0;
        this.f16205i = interfaceC1809a1;
        this.f16216t = c5132n5;
        this.f16206j = interfaceC1809a12;
        this.f16207k = interfaceC1809a13;
        this.f16209m = interfaceC1809a14;
        this.f16210n = interfaceC1809a15;
        this.f16211o = interfaceC1809a16;
        this.f16212p = interfaceC1809a17;
        this.f16214r = set2;
    }

    public /* synthetic */ C4774c7(C3471g c3471g, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, String str, InterfaceC1809a1 interfaceC1809a13, String str2, InterfaceC1809a1 interfaceC1809a14, String str3, InterfaceC1809a1 interfaceC1809a15, String str4, SharedPreferences sharedPreferences, String str5, InterfaceC1220a interfaceC1220a) {
        this.f16203g = 4;
        this.f16208l = c3471g;
        this.f16205i = interfaceC1809a1;
        this.f16206j = interfaceC1809a12;
        this.f16211o = str;
        this.f16207k = interfaceC1809a13;
        this.f16212p = str2;
        this.f16209m = interfaceC1809a14;
        this.f16213q = str3;
        this.f16210n = interfaceC1809a15;
        this.f16214r = str4;
        this.f16215s = sharedPreferences;
        this.f16204h = str5;
        this.f16216t = interfaceC1220a;
    }

    public /* synthetic */ C4774c7(C4060x c4060x, C3641z c3641z, SharedPreferences sharedPreferences, List list, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC1809a1 interfaceC1809a17, InterfaceC1809a1 interfaceC1809a18, InterfaceC1809a1 interfaceC1809a19) {
        this.f16203g = 6;
        this.f16204h = c4060x;
        this.f16208l = c3641z;
        this.f16213q = sharedPreferences;
        this.f16214r = list;
        this.f16205i = interfaceC1809a1;
        this.f16206j = interfaceC1809a12;
        this.f16207k = interfaceC1809a13;
        this.f16209m = interfaceC1809a14;
        this.f16210n = interfaceC1809a15;
        this.f16211o = interfaceC1809a16;
        this.f16212p = interfaceC1809a17;
        this.f16215s = interfaceC1809a18;
        this.f16216t = interfaceC1809a19;
    }

    public /* synthetic */ C4774c7(C4060x c4060x, C3641z c3641z, InterfaceC1220a interfaceC1220a, InterfaceC1220a interfaceC1220a2, String str, List list, ArrayList arrayList, List list2, InterfaceC1235p interfaceC1235p, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14) {
        this.f16203g = 7;
        this.f16204h = c4060x;
        this.f16208l = c3641z;
        this.f16210n = interfaceC1220a;
        this.f16211o = interfaceC1220a2;
        this.f16212p = str;
        this.f16213q = list;
        this.f16215s = arrayList;
        this.f16214r = list2;
        this.f16216t = interfaceC1235p;
        this.f16205i = interfaceC1809a1;
        this.f16206j = interfaceC1809a12;
        this.f16207k = interfaceC1809a13;
        this.f16209m = interfaceC1809a14;
    }

    public /* synthetic */ C4774c7(C4060x c4060x, C3641z c3641z, String str, InterfaceC1231l interfaceC1231l, List list, InterfaceC1220a interfaceC1220a, List list2, Context context, InterfaceC1231l interfaceC1231l2, InterfaceC1235p interfaceC1235p, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13) {
        this.f16203g = 1;
        this.f16204h = c4060x;
        this.f16208l = c3641z;
        this.f16209m = str;
        this.f16210n = interfaceC1231l;
        this.f16211o = list;
        this.f16212p = interfaceC1220a;
        this.f16213q = list2;
        this.f16214r = context;
        this.f16215s = interfaceC1231l2;
        this.f16216t = interfaceC1235p;
        this.f16205i = interfaceC1809a1;
        this.f16206j = interfaceC1809a12;
        this.f16207k = interfaceC1809a13;
    }

    public /* synthetic */ C4774c7(C5330t5 c5330t5, InterfaceC1809a1 interfaceC1809a1, Set set, ArrayList arrayList, C4060x c4060x, C5132n5 c5132n5, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC1809a1 interfaceC1809a17, Set set2) {
        this.f16203g = 0;
        this.f16208l = c5330t5;
        this.f16205i = interfaceC1809a1;
        this.f16213q = set;
        this.f16215s = arrayList;
        this.f16204h = c4060x;
        this.f16216t = c5132n5;
        this.f16206j = interfaceC1809a12;
        this.f16207k = interfaceC1809a13;
        this.f16209m = interfaceC1809a14;
        this.f16210n = interfaceC1809a15;
        this.f16211o = interfaceC1809a16;
        this.f16212p = interfaceC1809a17;
        this.f16214r = set2;
    }
}
