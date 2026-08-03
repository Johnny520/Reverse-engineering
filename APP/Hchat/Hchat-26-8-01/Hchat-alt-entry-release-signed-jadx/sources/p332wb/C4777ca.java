package p332wb;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import p000a.AbstractC0000a;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1236q;
import p117i0.C1823e;
import p117i0.C1836h0;
import p117i0.C1851l;
import p117i0.InterfaceC1809a1;
import p136j8.AbstractC2091b;
import p218og.AbstractC3149m;
import p222p.AbstractC3208d;
import p222p.AbstractC3222h1;
import p222p.C3272z0;
import p222p.InterfaceC3268x0;
import p251r.C3641z;
import p253r1.AbstractC3649f;
import p266s0.AbstractC3879i;
import p276sf.C3967n;
import p322w0.C4661l;
import p356y0.InterfaceC5853o;
import sh.C4060x;
import th.InterfaceC4209a;

/* JADX INFO: renamed from: wb.ca */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4777ca implements InterfaceC1236q {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f16274g = 2;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f16275h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f16276i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC1809a1 f16277j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ InterfaceC1809a1 f16278k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ InterfaceC1809a1 f16279l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ InterfaceC1809a1 f16280m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ InterfaceC1809a1 f16281n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ InterfaceC1809a1 f16282o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ InterfaceC1809a1 f16283p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ InterfaceC1809a1 f16284q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ InterfaceC1809a1 f16285r;

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ InterfaceC1809a1 f16286s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ Object f16287t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ Object f16288u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ Object f16289v;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C4777ca(SharedPreferences sharedPreferences, Context context, InterfaceC1220a interfaceC1220a, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC1809a1 interfaceC1809a17, InterfaceC1809a1 interfaceC1809a18, InterfaceC1809a1 interfaceC1809a19, InterfaceC1809a1 interfaceC1809a110, InterfaceC1809a1 interfaceC1809a111, InterfaceC1809a1 interfaceC1809a112) {
        this.f16287t = sharedPreferences;
        this.f16276i = context;
        this.f16288u = interfaceC1220a;
        this.f16277j = interfaceC1809a1;
        this.f16278k = interfaceC1809a12;
        this.f16279l = interfaceC1809a13;
        this.f16280m = interfaceC1809a14;
        this.f16281n = interfaceC1809a15;
        this.f16282o = interfaceC1809a16;
        this.f16283p = interfaceC1809a17;
        this.f16284q = interfaceC1809a18;
        this.f16285r = interfaceC1809a19;
        this.f16286s = interfaceC1809a110;
        this.f16275h = interfaceC1809a111;
        this.f16289v = interfaceC1809a112;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1236q
    /* JADX INFO: renamed from: b */
    public final Object mo734b(Object obj, Object obj2, Object obj3) {
        InterfaceC5853o interfaceC5853o;
        InterfaceC1220a interfaceC1220a;
        C1836h0 c1836h0;
        switch (this.f16274g) {
            case 0:
                LinkedHashSet linkedHashSet = (LinkedHashSet) this.f16287t;
                C3641z c3641z = (C3641z) this.f16276i;
                C3641z c3641z2 = (C3641z) this.f16288u;
                C4060x c4060x = (C4060x) this.f16275h;
                InterfaceC3268x0 interfaceC3268x0 = (InterfaceC3268x0) this.f16289v;
                AbstractC4902g4 abstractC4902g4 = (AbstractC4902g4) obj;
                C1836h0 c1836h02 = (C1836h0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                abstractC4902g4.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= (iIntValue & 8) == 0 ? c1836h02.m4534f(abstractC4902g4) : c1836h02.m4538h(abstractC4902g4) ? 4 : 2;
                }
                if (c1836h02.m4516S(iIntValue & 1, (iIntValue & 19) != 18)) {
                    C4869f4 c4869f4 = abstractC4902g4 instanceof C4869f4 ? (C4869f4) abstractC4902g4 : null;
                    C5292s0 c5292s0 = c4869f4 != null ? c4869f4.f17049a : null;
                    InterfaceC1809a1 interfaceC1809a1 = this.f16277j;
                    String string = AbstractC3149m.m6703R0((String) interfaceC1809a1.getValue()).toString();
                    Locale locale = Locale.US;
                    String strM5165l = AbstractC2091b.m5165l(locale, string, locale);
                    List list = c5292s0 == null ? (List) this.f16285r.getValue() : (List) this.f16286s.getValue();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj4 : list) {
                        if (AbstractC4955ho.m9573i6((C5292s0) obj4, strM5165l)) {
                            arrayList.add(obj4);
                        }
                    }
                    boolean zM4538h = c1836h02.m4538h(c5292s0) | c1836h02.m4538h(linkedHashSet);
                    Object objM4514P = c1836h02.m4514P();
                    C1823e c1823e = C1851l.f6155a;
                    if (zM4538h || objM4514P == c1823e) {
                        objM4514P = new C5068l7(c5292s0, 3, linkedHashSet);
                        c1836h02.m4545k0(objM4514P);
                    }
                    ArrayList arrayListM9547f7 = AbstractC4955ho.m9547f7((InterfaceC1231l) objM4514P, arrayList);
                    C3641z c3641z3 = c5292s0 == null ? c3641z : c3641z2;
                    InterfaceC5853o interfaceC5853oM7631a = AbstractC3649f.m7631a(AbstractC3222h1.f10289c, c4060x.f13440e, null);
                    C3272z0 c3272z0M6872b = AbstractC3208d.m6872b(interfaceC3268x0.mo6924c() + 8, interfaceC3268x0.mo6922a() + 84, 5);
                    boolean zM4538h2 = c1836h02.m4538h(c5292s0) | c1836h02.m4534f(interfaceC1809a1);
                    InterfaceC1809a1 interfaceC1809a12 = this.f16278k;
                    boolean zM4534f = zM4538h2 | c1836h02.m4534f(interfaceC1809a12);
                    InterfaceC1809a1 interfaceC1809a13 = this.f16279l;
                    boolean zM4534f2 = zM4534f | c1836h02.m4534f(interfaceC1809a13);
                    InterfaceC1809a1 interfaceC1809a14 = this.f16280m;
                    boolean zM4534f3 = zM4534f2 | c1836h02.m4534f(interfaceC1809a14);
                    InterfaceC1809a1 interfaceC1809a15 = this.f16281n;
                    boolean zM4534f4 = zM4534f3 | c1836h02.m4534f(interfaceC1809a15) | c1836h02.m4538h(arrayListM9547f7);
                    InterfaceC1809a1 interfaceC1809a16 = this.f16282o;
                    boolean zM4534f5 = zM4534f4 | c1836h02.m4534f(interfaceC1809a16);
                    InterfaceC1809a1 interfaceC1809a17 = this.f16283p;
                    boolean zM4534f6 = zM4534f5 | c1836h02.m4534f(interfaceC1809a17);
                    InterfaceC1809a1 interfaceC1809a18 = this.f16284q;
                    boolean zM4534f7 = zM4534f6 | c1836h02.m4534f(interfaceC1809a18);
                    Object objM4514P2 = c1836h02.m4514P();
                    if (zM4534f7 || objM4514P2 == c1823e) {
                        C4940h9 c4940h9 = new C4940h9(c5292s0, arrayListM9547f7, interfaceC1809a1, interfaceC1809a12, interfaceC1809a13, interfaceC1809a14, interfaceC1809a15, interfaceC1809a17, interfaceC1809a16, interfaceC1809a18);
                        c1836h02.m4545k0(c4940h9);
                        objM4514P2 = c4940h9;
                    }
                    AbstractC0000a.m53b(interfaceC5853oM7631a, c3641z3, c3272z0M6872b, null, null, null, false, null, (InterfaceC1231l) objM4514P2, c1836h02, 0, 504);
                } else {
                    c1836h02.m4519V();
                }
                break;
            case 1:
                C4060x c4060x2 = (C4060x) this.f16275h;
                C3641z c3641z4 = (C3641z) this.f16276i;
                SharedPreferences sharedPreferences = (SharedPreferences) this.f16287t;
                InterfaceC1809a1 interfaceC1809a19 = (InterfaceC1809a1) this.f16288u;
                InterfaceC1809a1 interfaceC1809a110 = (InterfaceC1809a1) this.f16289v;
                InterfaceC3268x0 interfaceC3268x02 = (InterfaceC3268x0) obj;
                C1836h0 c1836h03 = (C1836h0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                interfaceC3268x02.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= c1836h03.m4534f(interfaceC3268x02) ? 4 : 2;
                }
                if (c1836h03.m4516S(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    InterfaceC5853o interfaceC5853oM7631a2 = AbstractC3649f.m7631a(AbstractC3222h1.f10289c, c4060x2.f13440e, null);
                    C3272z0 c3272z0M6872b2 = AbstractC3208d.m6872b(interfaceC3268x02.mo6924c() + 8, interfaceC3268x02.mo6922a() + 84, 5);
                    boolean zM4538h3 = c1836h03.m4538h(sharedPreferences);
                    Object objM4514P3 = c1836h03.m4514P();
                    if (zM4538h3 || objM4514P3 == C1851l.f6155a) {
                        interfaceC5853o = interfaceC5853oM7631a2;
                        C4983ik c4983ik = new C4983ik(sharedPreferences, this.f16277j, this.f16278k, this.f16279l, this.f16280m, this.f16281n, this.f16282o, this.f16283p, this.f16284q, this.f16285r, this.f16286s, interfaceC1809a19, interfaceC1809a110);
                        c1836h03.m4545k0(c4983ik);
                        objM4514P3 = c4983ik;
                    } else {
                        interfaceC5853o = interfaceC5853oM7631a2;
                    }
                    AbstractC0000a.m53b(interfaceC5853o, c3641z4, c3272z0M6872b2, null, null, null, false, null, (InterfaceC1231l) objM4514P3, c1836h03, 0, 504);
                } else {
                    c1836h03.m4519V();
                }
                break;
            case 2:
                SharedPreferences sharedPreferences2 = (SharedPreferences) this.f16287t;
                Context context = (Context) this.f16276i;
                InterfaceC1220a interfaceC1220a2 = (InterfaceC1220a) this.f16288u;
                InterfaceC1809a1 interfaceC1809a111 = (InterfaceC1809a1) this.f16275h;
                InterfaceC1809a1 interfaceC1809a112 = (InterfaceC1809a1) this.f16289v;
                C1836h0 c1836h04 = (C1836h0) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((InterfaceC4209a) obj).getClass();
                if (c1836h04.m4516S(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    boolean zM4538h4 = c1836h04.m4538h(sharedPreferences2) | c1836h04.m4538h(context);
                    Object objM4514P4 = c1836h04.m4514P();
                    if (zM4538h4 || objM4514P4 == C1851l.f6155a) {
                        interfaceC1220a = interfaceC1220a2;
                        c1836h0 = c1836h04;
                        C5477xk c5477xk = new C5477xk(sharedPreferences2, context, this.f16277j, this.f16278k, this.f16279l, this.f16280m, this.f16281n, this.f16282o, this.f16283p, this.f16284q, this.f16285r, this.f16286s, interfaceC1809a111, interfaceC1809a112);
                        c1836h0.m4545k0(c5477xk);
                        objM4514P4 = c5477xk;
                    } else {
                        interfaceC1220a = interfaceC1220a2;
                        c1836h0 = c1836h04;
                    }
                    AbstractC4955ho.m9382M("保存设置", (InterfaceC1220a) objM4514P4, "返回", interfaceC1220a, null, null, c1836h0, 390, 48);
                } else {
                    c1836h04.m4519V();
                }
                break;
            default:
                C5292s0 c5292s02 = (C5292s0) this.f16289v;
                LinkedHashSet linkedHashSet2 = (LinkedHashSet) this.f16287t;
                C3641z c3641z5 = (C3641z) this.f16276i;
                C3641z c3641z6 = (C3641z) this.f16288u;
                C4060x c4060x3 = (C4060x) this.f16275h;
                InterfaceC3268x0 interfaceC3268x03 = (InterfaceC3268x0) obj;
                C1836h0 c1836h05 = (C1836h0) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                interfaceC3268x03.getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= c1836h05.m4534f(interfaceC3268x03) ? 4 : 2;
                }
                if (c1836h05.m4516S(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    Object c4869f42 = c5292s02 != null ? new C4869f4(c5292s02) : C4836e4.f16752a;
                    Object objM4514P5 = c1836h05.m4514P();
                    if (objM4514P5 == C1851l.f6155a) {
                        objM4514P5 = new C4661l(20);
                        c1836h05.m4545k0(objM4514P5);
                    }
                    AbstractC4955ho.m9322E3(c4869f42, null, "GroupMemberPickerTransition", (InterfaceC1231l) objM4514P5, false, AbstractC3879i.m8071e(-1044019500, new C4777ca(linkedHashSet2, c3641z5, c3641z6, c4060x3, interfaceC3268x03, this.f16277j, this.f16278k, this.f16279l, this.f16280m, this.f16281n, this.f16282o, this.f16283p, this.f16284q, this.f16285r, this.f16286s), c1836h05), c1836h05, 200064, 18);
                } else {
                    c1836h05.m4519V();
                }
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C4777ca(LinkedHashSet linkedHashSet, C3641z c3641z, C3641z c3641z2, C4060x c4060x, InterfaceC3268x0 interfaceC3268x0, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC1809a1 interfaceC1809a17, InterfaceC1809a1 interfaceC1809a18, InterfaceC1809a1 interfaceC1809a19, InterfaceC1809a1 interfaceC1809a110) {
        this.f16287t = linkedHashSet;
        this.f16276i = c3641z;
        this.f16288u = c3641z2;
        this.f16275h = c4060x;
        this.f16289v = interfaceC3268x0;
        this.f16277j = interfaceC1809a1;
        this.f16278k = interfaceC1809a12;
        this.f16279l = interfaceC1809a13;
        this.f16280m = interfaceC1809a14;
        this.f16281n = interfaceC1809a15;
        this.f16282o = interfaceC1809a16;
        this.f16283p = interfaceC1809a17;
        this.f16284q = interfaceC1809a18;
        this.f16285r = interfaceC1809a19;
        this.f16286s = interfaceC1809a110;
    }

    public /* synthetic */ C4777ca(C4060x c4060x, C3641z c3641z, SharedPreferences sharedPreferences, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC1809a1 interfaceC1809a17, InterfaceC1809a1 interfaceC1809a18, InterfaceC1809a1 interfaceC1809a19, InterfaceC1809a1 interfaceC1809a110, InterfaceC1809a1 interfaceC1809a111, InterfaceC1809a1 interfaceC1809a112) {
        this.f16275h = c4060x;
        this.f16276i = c3641z;
        this.f16287t = sharedPreferences;
        this.f16277j = interfaceC1809a1;
        this.f16278k = interfaceC1809a12;
        this.f16279l = interfaceC1809a13;
        this.f16280m = interfaceC1809a14;
        this.f16281n = interfaceC1809a15;
        this.f16282o = interfaceC1809a16;
        this.f16283p = interfaceC1809a17;
        this.f16284q = interfaceC1809a18;
        this.f16285r = interfaceC1809a19;
        this.f16286s = interfaceC1809a110;
        this.f16288u = interfaceC1809a111;
        this.f16289v = interfaceC1809a112;
    }

    public /* synthetic */ C4777ca(C5292s0 c5292s0, LinkedHashSet linkedHashSet, C3641z c3641z, C3641z c3641z2, C4060x c4060x, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC1809a1 interfaceC1809a17, InterfaceC1809a1 interfaceC1809a18, InterfaceC1809a1 interfaceC1809a19, InterfaceC1809a1 interfaceC1809a110) {
        this.f16289v = c5292s0;
        this.f16287t = linkedHashSet;
        this.f16276i = c3641z;
        this.f16288u = c3641z2;
        this.f16275h = c4060x;
        this.f16277j = interfaceC1809a1;
        this.f16278k = interfaceC1809a12;
        this.f16279l = interfaceC1809a13;
        this.f16280m = interfaceC1809a14;
        this.f16281n = interfaceC1809a15;
        this.f16282o = interfaceC1809a16;
        this.f16283p = interfaceC1809a17;
        this.f16284q = interfaceC1809a18;
        this.f16285r = interfaceC1809a19;
        this.f16286s = interfaceC1809a110;
    }
}
