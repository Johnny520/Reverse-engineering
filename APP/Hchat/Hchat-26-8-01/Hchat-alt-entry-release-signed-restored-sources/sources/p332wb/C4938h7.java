package p332wb;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import okio.C3193a;
import p000a.AbstractC0000a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1236q;
import p117i0.C1823e;
import p117i0.C1836h0;
import p117i0.C1851l;
import p117i0.InterfaceC1809a1;
import p126ia.C2022p;
import p136j8.AbstractC2091b;
import p218og.AbstractC3149m;
import p222p.AbstractC3208d;
import p222p.AbstractC3222h1;
import p222p.C3272z0;
import p222p.InterfaceC3268x0;
import p251r.C3619d;
import p251r.C3641z;
import p253r1.AbstractC3649f;
import p266s0.AbstractC3879i;
import p276sf.C3967n;
import p356y0.InterfaceC5853o;
import sh.C4058w0;
import sh.C4060x;
import tf.AbstractC4166m;
import tf.AbstractC4167n;

/* JADX INFO: renamed from: wb.h7 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4938h7 implements InterfaceC1236q {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f17530g = 0;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC1809a1 f17531h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC1809a1 f17532i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC1809a1 f17533j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ boolean f17534k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ InterfaceC1809a1 f17535l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ InterfaceC1809a1 f17536m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ InterfaceC1809a1 f17537n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ InterfaceC1809a1 f17538o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ Object f17539p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ Object f17540q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ Object f17541r;

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ Object f17542s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ Object f17543t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ Object f17544u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C4938h7(Context context, SharedPreferences sharedPreferences, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC1809a1 interfaceC1809a17, InterfaceC1809a1 interfaceC1809a18, String str, String str2, String str3, boolean z9) {
        this.f17534k = z9;
        this.f17539p = context;
        this.f17540q = sharedPreferences;
        this.f17541r = str;
        this.f17542s = str2;
        this.f17531h = interfaceC1809a1;
        this.f17532i = interfaceC1809a12;
        this.f17533j = interfaceC1809a13;
        this.f17543t = str3;
        this.f17535l = interfaceC1809a14;
        this.f17536m = interfaceC1809a15;
        this.f17537n = interfaceC1809a16;
        this.f17538o = interfaceC1809a17;
        this.f17544u = interfaceC1809a18;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d9 A[PHI: r19
  0x00d9: PHI (r19v2 r.z) = (r19v1 r.z), (r19v1 r.z), (r19v5 r.z), (r19v5 r.z), (r19v5 r.z), (r19v5 r.z), (r19v5 r.z) binds: [B:47:0x00e8, B:49:0x00ec, B:33:0x00b4, B:35:0x00c0, B:37:0x00c4, B:39:0x00c8, B:41:0x00d6] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p085fg.InterfaceC1236q
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo734b(Object obj, Object obj2, Object obj3) {
        C3641z c3641z;
        boolean z9;
        switch (this.f17530g) {
            case 0:
                Context context = (Context) this.f17539p;
                SharedPreferences sharedPreferences = (SharedPreferences) this.f17540q;
                String str = (String) this.f17541r;
                String str2 = (String) this.f17542s;
                String str3 = (String) this.f17543t;
                InterfaceC1809a1 interfaceC1809a1 = (InterfaceC1809a1) this.f17544u;
                C1836h0 c1836h0 = (C1836h0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h0.m4516S(iIntValue & 1, (iIntValue & 17) != 16)) {
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(-219632320, new C5067l6(context, sharedPreferences, this.f17531h, this.f17532i, this.f17533j, this.f17535l, this.f17536m, this.f17537n, this.f17538o, interfaceC1809a1, str, str2, str3, this.f17534k), c1836h0), c1836h0, 48, 1);
                } else {
                    c1836h0.m4519V();
                }
                break;
            default:
                Set set = (Set) this.f17539p;
                C4060x c4060x = (C4060x) this.f17540q;
                C3641z c3641z2 = (C3641z) this.f17541r;
                C5391v0 c5391v0 = (C5391v0) this.f17542s;
                List list = (List) this.f17543t;
                List list2 = (List) this.f17544u;
                InterfaceC3268x0 interfaceC3268x0 = (InterfaceC3268x0) obj;
                C1836h0 c1836h02 = (C1836h0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                interfaceC3268x0.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= c1836h02.m4534f(interfaceC3268x0) ? 4 : 2;
                }
                if (c1836h02.m4516S(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    InterfaceC1809a1 interfaceC1809a12 = this.f17532i;
                    String string = AbstractC3149m.m6703R0((String) interfaceC1809a12.getValue()).toString();
                    Locale locale = Locale.US;
                    String strM5165l = AbstractC2091b.m5165l(locale, string, locale);
                    List list3 = (List) this.f17538o.getValue();
                    ArrayList arrayList = new ArrayList();
                    Iterator it = list3.iterator();
                    while (true) {
                        boolean zHasNext = it.hasNext();
                        InterfaceC1809a1 interfaceC1809a13 = this.f17531h;
                        InterfaceC1809a1 interfaceC1809a14 = this.f17533j;
                        if (zHasNext) {
                            Object next = it.next();
                            InterfaceC3268x0 interfaceC3268x02 = interfaceC3268x0;
                            C5292s0 c5292s0 = (C5292s0) next;
                            int iOrdinal = ((EnumC5325t0) interfaceC1809a13.getValue()).ordinal();
                            if (iOrdinal != 0) {
                                c3641z = c3641z2;
                                if (iOrdinal == 1) {
                                    z9 = c5292s0.f20552c;
                                } else if (iOrdinal != 2) {
                                    if (iOrdinal != 3) {
                                        if (iOrdinal != 4) {
                                            C3193a.m6822k();
                                        }
                                    } else if (!c5391v0.f21263f || AbstractC3149m.m6721t0((String) interfaceC1809a14.getValue()) || c5292s0.f20552c || c5292s0.f20556g || !c5292s0.f20555f.contains((String) interfaceC1809a14.getValue())) {
                                        z9 = false;
                                    }
                                    z9 = true;
                                } else {
                                    z9 = c5292s0.f20556g;
                                }
                                break;
                            } else {
                                c3641z = c3641z2;
                                if (!c5292s0.f20552c && !c5292s0.f20556g) {
                                    z9 = true;
                                }
                            }
                            if (z9) {
                                arrayList.add(next);
                            }
                            interfaceC3268x0 = interfaceC3268x02;
                            c3641z2 = c3641z;
                        } else {
                            InterfaceC3268x0 interfaceC3268x03 = interfaceC3268x0;
                            C3641z c3641z3 = c3641z2;
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj4 : arrayList) {
                                if (AbstractC4955ho.m9573i6((C5292s0) obj4, strM5165l)) {
                                    arrayList2.add(obj4);
                                }
                            }
                            boolean zM4538h = c1836h02.m4538h(set);
                            Object objM4514P = c1836h02.m4514P();
                            C1823e c1823e = C1851l.f6155a;
                            if (zM4538h || objM4514P == c1823e) {
                                objM4514P = new C2022p(set, 3);
                                c1836h02.m4545k0(objM4514P);
                            }
                            ArrayList arrayListM9547f7 = AbstractC4955ho.m9547f7((InterfaceC1231l) objM4514P, arrayList2);
                            ArrayList arrayList3 = new ArrayList(AbstractC4167n.m8429e1(arrayListM9547f7));
                            Iterator it2 = arrayListM9547f7.iterator();
                            while (it2.hasNext()) {
                                arrayList3.add(((C5292s0) it2.next()).f20550a);
                            }
                            Set setM8412U1 = AbstractC4166m.m8412U1(arrayList3);
                            InterfaceC5853o interfaceC5853oM7631a = AbstractC3649f.m7631a(AbstractC3222h1.f10289c, c4060x.f13440e, null);
                            C3272z0 c3272z0M6872b = AbstractC3208d.m6872b(interfaceC3268x03.mo6924c() + 8, interfaceC3268x03.mo6922a() + 84, 5);
                            boolean zM4534f = c1836h02.m4534f(c5391v0) | c1836h02.m4534f(interfaceC1809a13) | c1836h02.m4534f(interfaceC1809a12) | c1836h02.m4538h(list) | c1836h02.m4534f(interfaceC1809a14);
                            boolean z10 = this.f17534k;
                            boolean zM4536g = zM4534f | c1836h02.m4536g(z10) | c1836h02.m4538h(list2);
                            InterfaceC1809a1 interfaceC1809a15 = this.f17535l;
                            boolean zM4534f2 = zM4536g | c1836h02.m4534f(interfaceC1809a15) | c1836h02.m4538h(setM8412U1);
                            InterfaceC1809a1 interfaceC1809a16 = this.f17536m;
                            boolean zM4534f3 = zM4534f2 | c1836h02.m4534f(interfaceC1809a16);
                            InterfaceC1809a1 interfaceC1809a17 = this.f17537n;
                            boolean zM4534f4 = zM4534f3 | c1836h02.m4534f(interfaceC1809a17) | c1836h02.m4538h(arrayListM9547f7);
                            Object objM4514P2 = c1836h02.m4514P();
                            if (zM4534f4 || objM4514P2 == c1823e) {
                                C4058w0 c4058w0 = new C4058w0(c5391v0, z10, list2, arrayListM9547f7, interfaceC1809a13, interfaceC1809a12, list, interfaceC1809a14, interfaceC1809a15, setM8412U1, interfaceC1809a16, interfaceC1809a17);
                                c1836h02.m4545k0(c4058w0);
                                objM4514P2 = c4058w0;
                            }
                            AbstractC0000a.m53b(interfaceC5853oM7631a, c3641z3, c3272z0M6872b, null, null, null, false, null, (InterfaceC1231l) objM4514P2, c1836h02, 0, 504);
                        }
                    }
                } else {
                    c1836h02.m4519V();
                }
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C4938h7(Set set, C4060x c4060x, C3641z c3641z, C5391v0 c5391v0, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, List list, InterfaceC1809a1 interfaceC1809a13, boolean z9, List list2, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC1809a1 interfaceC1809a17) {
        this.f17539p = set;
        this.f17540q = c4060x;
        this.f17541r = c3641z;
        this.f17542s = c5391v0;
        this.f17531h = interfaceC1809a1;
        this.f17532i = interfaceC1809a12;
        this.f17543t = list;
        this.f17533j = interfaceC1809a13;
        this.f17534k = z9;
        this.f17544u = list2;
        this.f17535l = interfaceC1809a14;
        this.f17536m = interfaceC1809a15;
        this.f17537n = interfaceC1809a16;
        this.f17538o = interfaceC1809a17;
    }
}
