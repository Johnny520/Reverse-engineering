package p332wb;

import android.content.Context;
import bi.AbstractC0319g;
import bi.C0321i;
import gg.AbstractC1416l;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.json.JSONException;
import p036c9.C0490u;
import p057e1.C0807b;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p117i0.AbstractC1874r;
import p117i0.C1836h0;
import p117i0.C1851l;
import p117i0.C1858m2;
import p117i0.InterfaceC1809a1;
import p136j8.C2098i;
import p266s0.AbstractC3879i;
import p266s0.C3874d;
import p267s1.C3906l0;
import p267s1.C3914t;
import p267s1.InterfaceC3918x;
import p276sf.C3967n;
import p293u2.C4242l;
import p345x8.C5709b;
import p345x8.C5725r;
import p348xb.C5763i;
import p354xh.C5821f;
import p356y0.InterfaceC5853o;
import tf.AbstractC4167n;

/* JADX INFO: renamed from: wb.zi */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5539zi implements InterfaceC1235p {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f22429g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f22430h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f22431i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5539zi(Object obj, int i9, Object obj2) {
        this.f22429g = i9;
        this.f22430h = obj;
        this.f22431i = obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) throws JSONException {
        C5709b c5709b;
        ArrayList arrayList;
        switch (this.f22429g) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC4955ho.m9311D0((EnumC4704a3) this.f22430h, (InterfaceC1231l) this.f22431i, (C1836h0) obj, AbstractC1874r.m4617C(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                AbstractC4955ho.m9488Z1((C5330t5) this.f22430h, (InterfaceC1220a) this.f22431i, (C1836h0) obj, AbstractC1874r.m4617C(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                AbstractC4955ho.m9624o3((Set) this.f22430h, (InterfaceC1231l) this.f22431i, (C1836h0) obj, AbstractC1874r.m4617C(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                AbstractC4955ho.m9487Z0((EnumC5325t0) this.f22430h, (InterfaceC1231l) this.f22431i, (C1836h0) obj, AbstractC1874r.m4617C(1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                AbstractC4955ho.m9303C0((C2098i) this.f22430h, (InterfaceC1231l) this.f22431i, (C1836h0) obj, AbstractC1874r.m4617C(9));
                break;
            case 5:
                ((Integer) obj2).getClass();
                AbstractC4955ho.m9702x1((Context) this.f22430h, (C3874d) this.f22431i, (C1836h0) obj, AbstractC1874r.m4617C(49));
                break;
            case 6:
                InterfaceC1809a1 interfaceC1809a1 = (InterfaceC1809a1) this.f22430h;
                C5725r c5725r = (C5725r) this.f22431i;
                C5709b c5709b2 = (C5709b) obj;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                c5709b2.getClass();
                List<C5709b> list = (List) interfaceC1809a1.getValue();
                ArrayList arrayList2 = new ArrayList(AbstractC4167n.m8429e1(list));
                for (C5709b c5709bM10314a : list) {
                    if (AbstractC1416l.m3825a(c5709bM10314a.f23199a, c5709b2.f23199a)) {
                        c5709b = c5709b2;
                        arrayList = arrayList2;
                        c5709bM10314a = C5709b.m10314a(c5709bM10314a, null, zBooleanValue, null, null, 0, 0, null, null, null, null, 0, 0, null, null, 0, 0L, false, null, 524283);
                    } else {
                        c5709b = c5709b2;
                        arrayList = arrayList2;
                    }
                    arrayList.add(c5709bM10314a);
                    arrayList2 = arrayList;
                    c5709b2 = c5709b;
                }
                AbstractC4955ho.m9294B(c5725r, interfaceC1809a1, arrayList2);
                break;
            case 7:
                ((Integer) obj2).getClass();
                ((C5491y2) this.f22430h).m9917t0((InterfaceC5853o) this.f22431i, (C1836h0) obj, AbstractC1874r.m4617C(55));
                break;
            case 8:
                ((Integer) obj2).getClass();
                ((C5491y2) this.f22430h).m9877V((String) this.f22431i, (C1836h0) obj, AbstractC1874r.m4617C(49));
                break;
            case 9:
                C3874d c3874d = (C3874d) this.f22430h;
                C5134n7 c5134n7 = (C5134n7) this.f22431i;
                C1836h0 c1836h0 = (C1836h0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c1836h0.m4516S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c3874d.mo734b(c5134n7, c1836h0, 0);
                } else {
                    c1836h0.m4519V();
                }
                return C3967n.f12976a;
            case 10:
                C5763i c5763i = (C5763i) this.f22430h;
                InterfaceC3918x interfaceC3918x = (InterfaceC3918x) this.f22431i;
                C3914t c3914t = (C3914t) obj;
                C0807b c0807b = (C0807b) obj2;
                c3914t.getClass();
                long j3 = c3914t.f12836c;
                long j4 = c3914t.f12840g;
                C0490u c0490u = c5763i.f23452c;
                boolean zBooleanValue2 = ((Boolean) c0490u.invoke(new C0807b(j3))).booleanValue();
                boolean zBooleanValue3 = ((Boolean) c0490u.invoke(new C0807b(j4))).booleanValue();
                if (zBooleanValue2 && zBooleanValue3) {
                    c5763i.f23454e.mo734b(c5763i, new C4242l(((C3906l0) interfaceC3918x).f12820E), c0807b);
                }
                return C3967n.f12976a;
            default:
                InterfaceC1220a interfaceC1220a = (InterfaceC1220a) this.f22430h;
                C3874d c3874d2 = (C3874d) this.f22431i;
                C1836h0 c1836h02 = (C1836h0) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c1836h02.m4516S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    C1858m2 c1858m2 = AbstractC0319g.f947a;
                    boolean zM4534f = c1836h02.m4534f(interfaceC1220a);
                    Object objM4514P = c1836h02.m4514P();
                    if (zM4534f || objM4514P == C1851l.f6155a) {
                        objM4514P = new C5821f(interfaceC1220a, 1);
                        c1836h02.m4545k0(objM4514P);
                    }
                    AbstractC1874r.m4619a(c1858m2.mo4582a((InterfaceC1220a) objM4514P), AbstractC3879i.m8071e(80198205, new C0321i(c3874d2, 4), c1836h02), c1836h02, 56);
                } else {
                    c1836h02.m4519V();
                }
                return C3967n.f12976a;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C5539zi(Object obj, Object obj2, int i9, int i10) {
        this.f22429g = i10;
        this.f22430h = obj;
        this.f22431i = obj2;
    }
}
