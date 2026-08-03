package p175m0;

import java.util.List;
import p020b5.C0190i;
import p100h0.C1548s;
import p117i0.InterfaceC1807a;
import p159l0.C2429k;
import p266s0.C3875e;

/* JADX INFO: renamed from: m0.g */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2694g extends AbstractC2701j0 {

    /* JADX INFO: renamed from: c */
    public static final C2694g f8763c = new C2694g(0, 2, 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p175m0.AbstractC2701j0
    /* JADX INFO: renamed from: a */
    public final void mo6126a(C1548s c1548s, InterfaceC1807a interfaceC1807a, C2429k c2429k, C0190i c0190i, InterfaceC2703k0 interfaceC2703k0) {
        int i9 = ((C3875e) c1548s.m4049d(0)).f12724a;
        List list = (List) c1548s.m4049d(1);
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = list.get(i10);
            int i11 = i9 + i10;
            interfaceC1807a.mo4442c(i11, obj);
            interfaceC1807a.mo4448p(i11, obj);
        }
    }
}
