package p099h;

import gg.AbstractC1417m;
import p085fg.InterfaceC1231l;
import p293u2.C4240j;
import p293u2.C4242l;

/* JADX INFO: renamed from: h.l0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1471l0 extends AbstractC1417m implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f4888g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC1231l f4889h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1471l0(InterfaceC1231l interfaceC1231l, int i9) {
        super(1);
        this.f4888g = i9;
        this.f4889h = interfaceC1231l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        switch (this.f4888g) {
            case 0:
                return new C4240j((((long) ((Number) this.f4889h.invoke(Integer.valueOf((int) (((C4242l) obj).f13918a >> 32)))).intValue()) << 32) | (((long) 0) & 4294967295L));
            default:
                return new C4240j((((long) ((Number) this.f4889h.invoke(Integer.valueOf((int) (((C4242l) obj).f13918a >> 32)))).intValue()) << 32) | (((long) 0) & 4294967295L));
        }
    }
}
