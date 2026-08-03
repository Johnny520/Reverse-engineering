package p332wb;

import p080fb.C1107c;
import p085fg.InterfaceC1235p;
import p117i0.AbstractC1874r;
import p117i0.C1836h0;
import p276sf.C3967n;

/* JADX INFO: renamed from: wb.hs */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4959hs implements InterfaceC1235p {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f17737g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C5491y2 f17738h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C1107c f17739i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C4959hs(C5491y2 c5491y2, C1107c c1107c, int i9, int i10) {
        this.f17737g = i10;
        this.f17738h = c5491y2;
        this.f17739i = c1107c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        int i9 = this.f17737g;
        C1836h0 c1836h0 = (C1836h0) obj;
        ((Integer) obj2).getClass();
        switch (i9) {
            case 0:
                this.f17738h.m9906n0(this.f17739i, c1836h0, AbstractC1874r.m4617C(49));
                break;
            case 1:
                this.f17738h.m9906n0(this.f17739i, c1836h0, AbstractC1874r.m4617C(49));
                break;
            case 2:
                this.f17738h.m9912q0(this.f17739i, c1836h0, AbstractC1874r.m4617C(49));
                break;
            default:
                this.f17738h.m9912q0(this.f17739i, c1836h0, AbstractC1874r.m4617C(49));
                break;
        }
        return C3967n.f12976a;
    }
}
