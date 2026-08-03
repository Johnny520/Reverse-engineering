package p116i;

import java.util.List;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p117i0.AbstractC1874r;
import p117i0.C1836h0;
import p117i0.C1873q1;
import p119i2.C1926g;
import p197n9.C2912a;
import p266s0.C3874d;
import p276sf.C3967n;
import p276sf.InterfaceC3955b;
import p317vb.InterfaceC4544a;
import p321w.AbstractC4589d;
import p332wb.AbstractC4955ho;
import p332wb.C4737b3;
import p332wb.C5026jv;
import p332wb.C5491y2;

/* JADX INFO: renamed from: i.b1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1738b1 implements InterfaceC1235p {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f5780g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f5781h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f5782i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f5783j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C1738b1(int i9, InterfaceC1220a interfaceC1220a, InterfaceC1231l interfaceC1231l, int i10) {
        this.f5780g = 10;
        this.f5781h = i9;
        this.f5782i = interfaceC1220a;
        this.f5783j = interfaceC1231l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f5780g) {
            case 0:
                ((Integer) obj2).intValue();
                int iM4617C = AbstractC1874r.m4617C(this.f5781h | 1);
                ((C1765k1) this.f5782i).m4412a(this.f5783j, (C1836h0) obj, iM4617C);
                break;
            case 1:
                ((Integer) obj2).getClass();
                AbstractC1874r.m4619a((C1873q1) this.f5782i, (C3874d) this.f5783j, (C1836h0) obj, AbstractC1874r.m4617C(this.f5781h | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                AbstractC1874r.m4620b((C1873q1[]) this.f5782i, (InterfaceC1235p) this.f5783j, (C1836h0) obj, AbstractC1874r.m4617C(this.f5781h | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                int iM4617C2 = AbstractC1874r.m4617C(this.f5781h) | 1;
                ((C3874d) this.f5782i).m8057g(this.f5783j, (C1836h0) obj, iM4617C2);
                break;
            case 4:
                ((Integer) obj2).intValue();
                AbstractC4589d.m9030a((C1926g) this.f5782i, (List) this.f5783j, (C1836h0) obj, AbstractC1874r.m4617C(this.f5781h | 1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                ((C5491y2) this.f5782i).m9888e((String) this.f5783j, (C1836h0) obj, AbstractC1874r.m4617C(this.f5781h | 1));
                break;
            case 6:
                ((Integer) obj2).intValue();
                AbstractC4955ho.m9319E0((C4737b3) this.f5782i, (InterfaceC1220a) this.f5783j, (C1836h0) obj, AbstractC1874r.m4617C(this.f5781h | 1));
                break;
            case 7:
                ((Integer) obj2).intValue();
                AbstractC4955ho.m9544f4((InterfaceC4544a) this.f5782i, (InterfaceC1220a) this.f5783j, (C1836h0) obj, AbstractC1874r.m4617C(this.f5781h | 1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                int iM4617C3 = AbstractC1874r.m4617C(9);
                AbstractC4955ho.m9541f1((C2912a) this.f5782i, this.f5781h, (InterfaceC1220a) this.f5783j, (C1836h0) obj, iM4617C3);
                break;
            case 9:
                String str = (String) this.f5782i;
                ((Integer) obj2).getClass();
                int iM4617C4 = AbstractC1874r.m4617C(391);
                AbstractC4955ho.m9471X0(this.f5781h, iM4617C4, (InterfaceC1231l) this.f5783j, (C1836h0) obj, str);
                break;
            case 10:
                ((Integer) obj2).getClass();
                int iM4617C5 = AbstractC1874r.m4617C(49);
                AbstractC4955ho.m9567i0(this.f5781h, (InterfaceC1220a) this.f5782i, (InterfaceC1231l) this.f5783j, (C1836h0) obj, iM4617C5);
                break;
            case 11:
                ((Integer) obj2).getClass();
                ((C5491y2) this.f5782i).m9875T((String) this.f5783j, (C1836h0) obj, AbstractC1874r.m4617C(this.f5781h | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                ((C5491y2) this.f5782i).m9890f((C5026jv) this.f5783j, (C1836h0) obj, AbstractC1874r.m4617C(this.f5781h | 1));
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C1738b1(Object obj, int i9, InterfaceC3955b interfaceC3955b, int i10, int i11) {
        this.f5780g = i11;
        this.f5782i = obj;
        this.f5781h = i9;
        this.f5783j = interfaceC3955b;
    }

    public /* synthetic */ C1738b1(Object obj, Object obj2, int i9, int i10) {
        this.f5780g = i10;
        this.f5782i = obj;
        this.f5783j = obj2;
        this.f5781h = i9;
    }
}
