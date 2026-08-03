package p100h0;

import p077f8.AbstractC1089i;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1235p;
import p117i0.AbstractC1874r;
import p117i0.C1836h0;
import p219oh.AbstractC3165h;
import p276sf.C3967n;
import p280t2.EnumC4094j;
import p356y0.InterfaceC5853o;

/* JADX INFO: renamed from: h0.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1512e implements InterfaceC1235p {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f5055g = 0;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ boolean f5056h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f5057i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f5058j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f5059k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C1512e(InterfaceC5853o interfaceC5853o, InterfaceC1220a interfaceC1220a, boolean z9, int i9) {
        this.f5058j = interfaceC5853o;
        this.f5059k = interfaceC1220a;
        this.f5056h = z9;
        this.f5057i = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f5055g) {
            case 0:
                ((Integer) obj2).getClass();
                int iM4617C = AbstractC1874r.m4617C(this.f5057i | 1);
                AbstractC3165h.m6776c((InterfaceC5853o) this.f5058j, (InterfaceC1220a) this.f5059k, this.f5056h, (C1836h0) obj, iM4617C);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM4617C2 = AbstractC1874r.m4617C(this.f5057i | 1);
                AbstractC1089i.m2756a(this.f5056h, (EnumC4094j) this.f5058j, (C1511d1) this.f5059k, (C1836h0) obj, iM4617C2);
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C1512e(boolean z9, EnumC4094j enumC4094j, C1511d1 c1511d1, int i9) {
        this.f5056h = z9;
        this.f5058j = enumC4094j;
        this.f5059k = c1511d1;
        this.f5057i = i9;
    }
}
