package p321w;

import p085fg.InterfaceC1235p;
import p100h0.C1511d1;
import p117i0.AbstractC1874r;
import p117i0.C1836h0;
import p266s0.C3874d;
import p276sf.C3967n;

/* JADX INFO: renamed from: w.r */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4631r implements InterfaceC1235p {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f15357g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C1511d1 f15358h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C3874d f15359i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f15360j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C4631r(C1511d1 c1511d1, C3874d c3874d, int i9, int i10) {
        this.f15357g = i10;
        this.f15358h = c1511d1;
        this.f15359i = c3874d;
        this.f15360j = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        int i9 = this.f15357g;
        C1836h0 c1836h0 = (C1836h0) obj;
        ((Integer) obj2).getClass();
        switch (i9) {
            case 0:
                AbstractC4634s.m9061d(this.f15358h, this.f15359i, c1836h0, AbstractC1874r.m4617C(this.f15360j | 1));
                break;
            default:
                AbstractC4634s.m9062e(this.f15358h, this.f15359i, c1836h0, AbstractC1874r.m4617C(this.f15360j | 1));
                break;
        }
        return C3967n.f12976a;
    }
}
