package p174m;

import gg.AbstractC1405a;
import p085fg.InterfaceC1235p;
import p117i0.C1836h0;
import p249qg.AbstractC3603v;
import p266s0.C3874d;
import p276sf.C3967n;
import p293u2.C4247q;

/* JADX INFO: renamed from: m.d2 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2589d2 extends AbstractC1405a implements InterfaceC1235p {

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ int f8388n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2589d2(int i9, Object obj, Class cls, String str, String str2, int i10, int i11) {
        super(i9, i10, cls, obj, str, str2);
        this.f8388n = i11;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f8388n) {
            case 0:
                long j3 = ((C4247q) obj).f13927a;
                C2609h2 c2609h2 = (C2609h2) this.f4711g;
                AbstractC3603v.m7563q(c2609h2.f8457R.m7630e(), null, new C2599f2(c2609h2, j3, null, 2), 3);
                break;
            case 1:
                long j4 = ((C4247q) obj).f13927a;
                C2609h2 c2609h22 = (C2609h2) this.f4711g;
                AbstractC3603v.m7563q(c2609h22.f8457R.m7630e(), null, new C2599f2(c2609h22, j4, null, 1), 3);
                break;
            default:
                int iIntValue = ((Number) obj2).intValue();
                ((C3874d) this.f4711g).m8056f((C1836h0) obj, iIntValue);
                break;
        }
        return C3967n.f12976a;
    }
}
