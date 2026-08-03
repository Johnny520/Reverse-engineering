package p251r;

import ac.C0058k;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p117i0.AbstractC1874r;
import p117i0.C1836h0;
import p265s.C3835i;
import p266s0.C3874d;
import p276sf.C3967n;
import p332wb.AbstractC4955ho;

/* JADX INFO: renamed from: r.i */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3624i implements InterfaceC1235p {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f11684g = 1;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f11685h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f11686i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C3624i(int i9, int i10, InterfaceC1231l interfaceC1231l) {
        this.f11685h = i9;
        this.f11686i = interfaceC1231l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f11684g) {
            case 0:
                C3626k c3626k = (C3626k) this.f11686i;
                C1836h0 c1836h0 = (C1836h0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c1836h0.m4516S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    C0058k c0058k = c3626k.f11692b.f11683a;
                    int i9 = this.f11685h;
                    C3835i c3835iM361l = c0058k.m361l(i9);
                    ((C3874d) c3835iM361l.f12564c.f471c).mo3355c(c3626k.f11693c, Integer.valueOf(i9 - c3835iM361l.f12562a), c1836h0, 0);
                } else {
                    c1836h0.m4519V();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                AbstractC4955ho.m9479Y0(this.f11685h, (InterfaceC1231l) this.f11686i, (C1836h0) obj, AbstractC1874r.m4617C(391));
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C3624i(C3626k c3626k, int i9) {
        this.f11686i = c3626k;
        this.f11685h = i9;
    }
}
