package p332wb;

import ci.C0589j;
import p085fg.InterfaceC1235p;
import p117i0.AbstractC1874r;
import p117i0.C1829f1;
import p117i0.C1836h0;
import p249qg.AbstractC3603v;
import p267s1.C3914t;
import p276sf.C3967n;
import p345x8.C5732y;
import p348xb.C5769o;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: wb.jj */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5014jj implements InterfaceC1235p {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f18139g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f18140h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5014jj(int i9, int i10, Object obj) {
        this.f18139g = i10;
        this.f18140h = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f18139g) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC4955ho.m9625o4((String) this.f18140h, (C1836h0) obj, AbstractC1874r.m4617C(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                AbstractC4955ho.m9634p4((C5732y) this.f18140h, (C1836h0) obj, AbstractC1874r.m4617C(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                AbstractC4955ho.m9462W((C5292s0) this.f18140h, (C1836h0) obj, AbstractC1874r.m4617C(1));
                break;
            case 3:
                C5769o c5769o = (C5769o) this.f18140h;
                C3914t c3914t = (C3914t) obj;
                c3914t.getClass();
                AbstractC3603v.m7563q(c5769o.f23491a, null, new C0589j(c5769o, c3914t, (InterfaceC5557c) null, 25), 3);
                break;
            default:
                C1829f1 c1829f1 = (C1829f1) this.f18140h;
                float fFloatValue = ((Float) obj).floatValue();
                ((Float) obj2).floatValue();
                c1829f1.m4489h(fFloatValue);
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C5014jj(Object obj, int i9) {
        this.f18139g = i9;
        this.f18140h = obj;
    }
}
