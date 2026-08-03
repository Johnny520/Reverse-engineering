package sh;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p036c9.C0443h0;
import p051db.C0768f;
import p085fg.InterfaceC1231l;
import p117i0.C1829f1;
import p117i0.C1833g1;
import p117i0.InterfaceC1809a1;
import p172lg.C2561a;
import p189n1.C2864c;
import p189n1.InterfaceC2862a;
import p251r.C3623h;
import p266s0.C3874d;
import p276sf.C3967n;
import p332wb.AbstractC5193p0;
import p332wb.C5238qc;
import p332wb.C5292s0;
import p332wb.C5293s1;
import p332wb.C5326t1;
import p332wb.C5359u1;
import p332wb.C5391v0;
import p332wb.EnumC5325t0;
import p332wb.EnumC5358u0;

/* JADX INFO: renamed from: sh.w0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4058w0 implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f13422g = 1;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ boolean f13423h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ List f13424i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC1809a1 f13425j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f13426k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f13427l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ Object f13428m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ Object f13429n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ Object f13430o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ Object f13431p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ Object f13432q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ InterfaceC1809a1 f13433r;

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ InterfaceC1809a1 f13434s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C4058w0(C5391v0 c5391v0, boolean z9, List list, ArrayList arrayList, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, List list2, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, Set set, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16) {
        this.f13426k = c5391v0;
        this.f13423h = z9;
        this.f13424i = list;
        this.f13427l = arrayList;
        this.f13425j = interfaceC1809a1;
        this.f13428m = interfaceC1809a12;
        this.f13429n = list2;
        this.f13430o = interfaceC1809a13;
        this.f13431p = interfaceC1809a14;
        this.f13432q = set;
        this.f13433r = interfaceC1809a15;
        this.f13434s = interfaceC1809a16;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        ArrayList arrayList;
        switch (this.f13422g) {
            case 0:
                InterfaceC1231l interfaceC1231l = (InterfaceC1231l) this.f13426k;
                C4052u0 c4052u0 = (C4052u0) this.f13427l;
                C2561a c2561a = (C2561a) this.f13428m;
                EnumC4046s0 enumC4046s0 = (EnumC4046s0) this.f13429n;
                InterfaceC2862a interfaceC2862a = (InterfaceC2862a) this.f13430o;
                float[] fArr = (float[]) this.f13431p;
                C1829f1 c1829f1 = (C1829f1) this.f13432q;
                C1833g1 c1833g1 = (C1833g1) this.f13433r;
                C1833g1 c1833g12 = (C1833g1) this.f13434s;
                c1829f1.m4489h(c1829f1.m4488g() + ((Float) obj).floatValue());
                float fM8232c = AbstractC4008f1.m8232c(c1829f1.m4488g(), c1833g1.m4492g(), c1833g12.m4492g());
                if (this.f13423h) {
                    fM8232c = 1.0f - fM8232c;
                }
                float fFloatValue = ((Number) interfaceC1231l.invoke(Float.valueOf(fM8232c))).floatValue();
                ((InterfaceC1231l) this.f13425j.getValue()).invoke(Float.valueOf(fFloatValue));
                boolean z9 = this.f13424i != null;
                c4052u0.getClass();
                float f3 = c2561a.f8311b;
                float f10 = c2561a.f8310a;
                enumC4046s0.getClass();
                interfaceC2862a.getClass();
                fArr.getClass();
                if (enumC4046s0 != EnumC4046s0.f13370g) {
                    boolean z10 = fFloatValue == f10 || fFloatValue == f3;
                    if (z10 && !c4052u0.f13388a) {
                        ((C2864c) interfaceC2862a).m6283a(23);
                        c4052u0.f13388a = true;
                    } else if (!z10) {
                        c4052u0.f13388a = false;
                    }
                    if (enumC4046s0 == EnumC4046s0.f13372i) {
                        boolean z11 = (fFloatValue == f10 || fFloatValue == f3) ? false : true;
                        if (z9 && fArr.length != 0) {
                            float f11 = (fFloatValue - f10) / (f3 - f10);
                            float f12 = Float.MAX_VALUE;
                            for (float f13 : fArr) {
                                float fAbs = Math.abs(f13 - f11);
                                if (fAbs < f12) {
                                    f12 = fAbs;
                                }
                            }
                            boolean z12 = f12 < 0.005f;
                            if (z12 && !c4052u0.f13390c && z11) {
                                ((C2864c) interfaceC2862a).m6283a(9);
                            }
                            c4052u0.f13390c = z12;
                        } else if (fFloatValue != c4052u0.f13389b && z11) {
                            ((C2864c) interfaceC2862a).m6283a(9);
                            c4052u0.f13389b = fFloatValue;
                        }
                    }
                }
                break;
            default:
                C5391v0 c5391v0 = (C5391v0) this.f13426k;
                ArrayList arrayList2 = (ArrayList) this.f13427l;
                InterfaceC1809a1 interfaceC1809a1 = (InterfaceC1809a1) this.f13428m;
                List list = (List) this.f13429n;
                InterfaceC1809a1 interfaceC1809a12 = (InterfaceC1809a1) this.f13430o;
                InterfaceC1809a1 interfaceC1809a13 = (InterfaceC1809a1) this.f13431p;
                Set set = (Set) this.f13432q;
                C3623h c3623h = (C3623h) obj;
                c3623h.getClass();
                EnumC5358u0 enumC5358u0 = c5391v0.f21259b;
                boolean z13 = c5391v0.f21263f;
                EnumC5358u0 enumC5358u02 = EnumC5358u0.f20978g;
                InterfaceC1809a1 interfaceC1809a14 = this.f13425j;
                if (enumC5358u0 == enumC5358u02 && z13) {
                    arrayList = arrayList2;
                    C3623h.m7604a(c3623h, null, new C3874d(-1528941783, new C5326t1(4, interfaceC1809a14, interfaceC1809a1), true), 3);
                } else {
                    arrayList = arrayList2;
                    if (enumC5358u0 == EnumC5358u0.f20980i || enumC5358u0 == EnumC5358u0.f20981j) {
                        C3623h.m7604a(c3623h, null, new C3874d(2036792018, new C0443h0(c5391v0, interfaceC1809a14, interfaceC1809a1, 10), true), 3);
                    }
                }
                if (z13 && ((EnumC5325t0) interfaceC1809a14.getValue()) == EnumC5325t0.f20734l) {
                    C3623h.m7604a(c3623h, null, new C3874d(1386992032, new C5359u1(list, interfaceC1809a12, interfaceC1809a1, 1), true), 3);
                }
                if (this.f13423h) {
                    List list2 = this.f13424i;
                    if (!list2.isEmpty()) {
                        C3623h.m7604a(c3623h, null, AbstractC5193p0.f19662R5, 3);
                        C3623h.m7604a(c3623h, null, new C3874d(279167576, new C5238qc(list2, interfaceC1809a13, 0), true), 3);
                    }
                }
                C3623h.m7604a(c3623h, null, new C3874d(418494414, new C5293s1(interfaceC1809a1, 8), true), 3);
                C3623h.m7604a(c3623h, null, new C3874d(267436293, new C0768f(set, 6, interfaceC1809a14), true), 3);
                if (((Boolean) this.f13433r.getValue()).booleanValue()) {
                    C3623h.m7604a(c3623h, null, AbstractC5193p0.f19676T5, 3);
                } else {
                    InterfaceC1809a1 interfaceC1809a15 = this.f13434s;
                    if (((String) interfaceC1809a15.getValue()).length() > 0) {
                        C3623h.m7604a(c3623h, null, new C3874d(1619790127, new C5293s1(interfaceC1809a15, 9), true), 3);
                    } else if (arrayList.isEmpty()) {
                        C3623h.m7604a(c3623h, null, AbstractC5193p0.f19690V5, 3);
                    } else {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            C3623h.m7604a(c3623h, null, new C3874d(2074819117, new C0443h0((C5292s0) it.next(), c5391v0, interfaceC1809a13, 11), true), 3);
                        }
                    }
                }
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C4058w0(boolean z9, InterfaceC1231l interfaceC1231l, C4052u0 c4052u0, C2561a c2561a, EnumC4046s0 enumC4046s0, InterfaceC2862a interfaceC2862a, float[] fArr, List list, C1829f1 c1829f1, C1833g1 c1833g1, C1833g1 c1833g12, InterfaceC1809a1 interfaceC1809a1) {
        this.f13423h = z9;
        this.f13426k = interfaceC1231l;
        this.f13427l = c4052u0;
        this.f13428m = c2561a;
        this.f13429n = enumC4046s0;
        this.f13430o = interfaceC2862a;
        this.f13431p = fArr;
        this.f13424i = list;
        this.f13432q = c1829f1;
        this.f13433r = c1833g1;
        this.f13434s = c1833g12;
        this.f13425j = interfaceC1809a1;
    }
}
