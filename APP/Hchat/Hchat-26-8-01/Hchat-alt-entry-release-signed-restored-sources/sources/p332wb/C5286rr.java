package p332wb;

import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1235p;
import p117i0.AbstractC1874r;
import p117i0.C1836h0;
import p176m1.C2730f;
import p276sf.C3967n;

/* JADX INFO: renamed from: wb.rr */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5286rr implements InterfaceC1235p {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f20521g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C5491y2 f20522h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C2730f f20523i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ String f20524j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ InterfaceC1220a f20525k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5286rr(C5491y2 c5491y2, C2730f c2730f, String str, InterfaceC1220a interfaceC1220a, int i9, int i10) {
        this.f20521g = i10;
        this.f20522h = c5491y2;
        this.f20523i = c2730f;
        this.f20524j = str;
        this.f20525k = interfaceC1220a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f20521g) {
            case 0:
                ((Integer) obj2).getClass();
                int iM4617C = AbstractC1874r.m4617C(3127);
                this.f20522h.m9881a0(this.f20523i, this.f20524j, this.f20525k, (C1836h0) obj, iM4617C);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM4617C2 = AbstractC1874r.m4617C(3127);
                this.f20522h.m9894h0(this.f20523i, this.f20524j, this.f20525k, (C1836h0) obj, iM4617C2);
                break;
        }
        return C3967n.f12976a;
    }
}
