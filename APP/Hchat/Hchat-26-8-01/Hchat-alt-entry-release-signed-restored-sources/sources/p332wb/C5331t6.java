package p332wb;

import p085fg.InterfaceC1235p;
import p117i0.AbstractC1874r;
import p117i0.C1836h0;
import p276sf.C3967n;

/* JADX INFO: renamed from: wb.t6 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5331t6 implements InterfaceC1235p {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f20754g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ String f20755h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f20756i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5331t6(String str, int i9, int i10) {
        this.f20754g = i10;
        this.f20755h = str;
        this.f20756i = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        C1836h0 c1836h0 = (C1836h0) obj;
        Integer num = (Integer) obj2;
        switch (this.f20754g) {
            case 0:
                num.intValue();
                AbstractC4955ho.m9657s0(this.f20755h, c1836h0, AbstractC1874r.m4617C(this.f20756i | 1));
                break;
            default:
                num.getClass();
                AbstractC4955ho.m9321E2(this.f20755h, c1836h0, AbstractC1874r.m4617C(this.f20756i | 1));
                break;
        }
        return C3967n.f12976a;
    }
}
