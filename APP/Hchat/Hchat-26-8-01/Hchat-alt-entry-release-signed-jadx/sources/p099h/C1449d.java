package p099h;

import gg.AbstractC1417m;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p116i.C1765k1;
import p117i0.AbstractC1874r;
import p117i0.C1836h0;
import p266s0.C3874d;
import p276sf.C3967n;
import p356y0.InterfaceC5841c;
import p356y0.InterfaceC5853o;

/* JADX INFO: renamed from: h.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1449d extends AbstractC1417m implements InterfaceC1235p {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f4808g = 1;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC1231l f4809h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC5853o f4810i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C3874d f4811j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ int f4812k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f4813l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ Object f4814m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ Object f4815n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ Object f4816o;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1449d(C1765k1 c1765k1, InterfaceC1231l interfaceC1231l, InterfaceC5853o interfaceC5853o, C1483r0 c1483r0, C1485s0 c1485s0, InterfaceC1235p interfaceC1235p, C3874d c3874d, int i9) {
        super(2);
        this.f4813l = c1765k1;
        this.f4809h = interfaceC1231l;
        this.f4810i = interfaceC5853o;
        this.f4814m = c1483r0;
        this.f4815n = c1485s0;
        this.f4816o = interfaceC1235p;
        this.f4811j = c3874d;
        this.f4812k = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f4808g) {
            case 0:
                ((Number) obj2).intValue();
                InterfaceC5841c interfaceC5841c = (InterfaceC5841c) this.f4815n;
                String str = (String) this.f4816o;
                InterfaceC1231l interfaceC1231l = (InterfaceC1231l) this.f4814m;
                AbstractC1468k.m3990b(this.f4813l, this.f4810i, this.f4809h, interfaceC5841c, str, interfaceC1231l, this.f4811j, (C1836h0) obj, AbstractC1874r.m4617C(this.f4812k | 1));
                break;
            default:
                ((Number) obj2).intValue();
                C1765k1 c1765k1 = (C1765k1) this.f4813l;
                C1483r0 c1483r0 = (C1483r0) this.f4814m;
                C1485s0 c1485s0 = (C1485s0) this.f4815n;
                InterfaceC1235p interfaceC1235p = (InterfaceC1235p) this.f4816o;
                AbstractC1441a0.m3982a(c1765k1, this.f4809h, this.f4810i, c1483r0, c1485s0, interfaceC1235p, this.f4811j, (C1836h0) obj, AbstractC1874r.m4617C(this.f4812k | 1));
                break;
        }
        return C3967n.f12976a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1449d(Object obj, InterfaceC5853o interfaceC5853o, InterfaceC1231l interfaceC1231l, InterfaceC5841c interfaceC5841c, String str, InterfaceC1231l interfaceC1231l2, C3874d c3874d, int i9) {
        super(2);
        this.f4813l = obj;
        this.f4810i = interfaceC5853o;
        this.f4809h = interfaceC1231l;
        this.f4815n = interfaceC5841c;
        this.f4816o = str;
        this.f4814m = interfaceC1231l2;
        this.f4811j = c3874d;
        this.f4812k = i9;
    }
}
