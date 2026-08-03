package p332wb;

import p051db.C0765c;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p117i0.AbstractC1874r;
import p117i0.C1836h0;
import p276sf.C3967n;

/* JADX INFO: renamed from: wb.nf */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5142nf implements InterfaceC1235p {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f19198g = 0;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C0765c f19199h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC1231l f19200i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC1235p f19201j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ InterfaceC1231l f19202k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ boolean f19203l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5142nf(C0765c c0765c, InterfaceC1231l interfaceC1231l, InterfaceC1235p interfaceC1235p, InterfaceC1231l interfaceC1231l2, boolean z9) {
        this.f19199h = c0765c;
        this.f19200i = interfaceC1231l;
        this.f19201j = interfaceC1235p;
        this.f19202k = interfaceC1231l2;
        this.f19203l = z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f19198g) {
            case 0:
                C1836h0 c1836h0 = (C1836h0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c1836h0.m4516S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    AbstractC4955ho.m9579j3(this.f19199h, this.f19200i, this.f19201j, this.f19202k, this.f19203l, c1836h0, 0);
                } else {
                    c1836h0.m4519V();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                AbstractC4955ho.m9579j3(this.f19199h, this.f19200i, this.f19201j, this.f19202k, this.f19203l, (C1836h0) obj, AbstractC1874r.m4617C(1));
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C5142nf(C0765c c0765c, InterfaceC1231l interfaceC1231l, InterfaceC1235p interfaceC1235p, InterfaceC1231l interfaceC1231l2, boolean z9, int i9) {
        this.f19199h = c0765c;
        this.f19200i = interfaceC1231l;
        this.f19201j = interfaceC1235p;
        this.f19202k = interfaceC1231l2;
        this.f19203l = z9;
    }
}
