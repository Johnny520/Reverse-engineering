package p174m;

import p077f8.AbstractC1089i;
import p085fg.InterfaceC1235p;
import p117i0.InterfaceC1809a1;
import p187n.C2859m;
import p249qg.InterfaceC3599t;
import p276sf.C3967n;
import p370yf.AbstractC6044i;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: m.e2 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2594e2 extends AbstractC6044i implements InterfaceC1235p {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f8402h = 0;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ long f8403i;

    /* JADX INFO: renamed from: j */
    public /* synthetic */ Object f8404j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2594e2(InterfaceC1809a1 interfaceC1809a1, long j3, InterfaceC5557c interfaceC5557c) {
        super(2, interfaceC5557c);
        this.f8404j = interfaceC1809a1;
        this.f8403i = j3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final InterfaceC5557c create(Object obj, InterfaceC5557c interfaceC5557c) {
        switch (this.f8402h) {
            case 0:
                C2594e2 c2594e2 = new C2594e2(this.f8403i, interfaceC5557c);
                c2594e2.f8404j = obj;
                return c2594e2;
            default:
                return new C2594e2((InterfaceC1809a1) this.f8404j, this.f8403i, interfaceC5557c);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f8402h) {
            case 0:
                C2594e2 c2594e2 = (C2594e2) create((C2629m2) obj, (InterfaceC5557c) obj2);
                C3967n c3967n = C3967n.f12976a;
                c2594e2.invokeSuspend(c3967n);
                return c3967n;
            default:
                C2594e2 c2594e22 = (C2594e2) create((InterfaceC3599t) obj, (InterfaceC5557c) obj2);
                C3967n c3967n2 = C3967n.f12976a;
                c2594e22.invokeSuspend(c3967n2);
                return c3967n2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final Object invokeSuspend(Object obj) {
        switch (this.f8402h) {
            case 0:
                AbstractC1089i.m2732I0(obj);
                C2637o2 c2637o2 = ((C2629m2) this.f8404j).f8556a;
                c2637o2.m6090c(c2637o2.f8598k, this.f8403i, 1);
                break;
            default:
                InterfaceC1809a1 interfaceC1809a1 = (InterfaceC1809a1) this.f8404j;
                AbstractC1089i.m2732I0(obj);
                if (((C2859m) interfaceC1809a1.getValue()) != null) {
                    interfaceC1809a1.setValue(null);
                }
                interfaceC1809a1.setValue(new C2859m());
                break;
        }
        return C3967n.f12976a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2594e2(long j3, InterfaceC5557c interfaceC5557c) {
        super(2, interfaceC5557c);
        this.f8403i = j3;
    }
}
