package p187n;

import java.util.ArrayList;
import p077f8.AbstractC1089i;
import p085fg.InterfaceC1235p;
import p117i0.InterfaceC1809a1;
import p136j8.C2104o;
import p249qg.InterfaceC3599t;
import p276sf.C3967n;
import p352xf.EnumC5799a;
import p370yf.AbstractC6044i;
import tg.C4200r;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: n.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2851e extends AbstractC6044i implements InterfaceC1235p {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f9245h;

    /* JADX INFO: renamed from: i */
    public int f9246i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C2857k f9247j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ InterfaceC1809a1 f9248k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2851e(C2857k c2857k, InterfaceC1809a1 interfaceC1809a1, InterfaceC5557c interfaceC5557c, int i9) {
        super(2, interfaceC5557c);
        this.f9245h = i9;
        this.f9247j = c2857k;
        this.f9248k = interfaceC1809a1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final InterfaceC5557c create(Object obj, InterfaceC5557c interfaceC5557c) {
        switch (this.f9245h) {
            case 0:
                return new C2851e(this.f9247j, this.f9248k, interfaceC5557c, 0);
            case 1:
                return new C2851e(this.f9247j, this.f9248k, interfaceC5557c, 1);
            default:
                return new C2851e(this.f9247j, this.f9248k, interfaceC5557c, 2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC3599t interfaceC3599t = (InterfaceC3599t) obj;
        InterfaceC5557c interfaceC5557c = (InterfaceC5557c) obj2;
        switch (this.f9245h) {
        }
        return ((C2851e) create(interfaceC3599t, interfaceC5557c)).invokeSuspend(C3967n.f12976a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final Object invokeSuspend(Object obj) throws Throwable {
        switch (this.f9245h) {
            case 0:
                int i9 = this.f9246i;
                if (i9 == 0) {
                    AbstractC1089i.m2732I0(obj);
                    ArrayList arrayList = new ArrayList();
                    C4200r c4200r = this.f9247j.f9251a;
                    C2850d c2850d = new C2850d(arrayList, this.f9248k, 0);
                    this.f9246i = 1;
                    c4200r.getClass();
                    C4200r.m8449j(c4200r, c2850d, this);
                } else if (i9 != 1) {
                    C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                } else {
                    AbstractC1089i.m2732I0(obj);
                }
                break;
            case 1:
                int i10 = this.f9246i;
                if (i10 == 0) {
                    AbstractC1089i.m2732I0(obj);
                    ArrayList arrayList2 = new ArrayList();
                    C4200r c4200r2 = this.f9247j.f9251a;
                    C2850d c2850d2 = new C2850d(arrayList2, this.f9248k, 1);
                    this.f9246i = 1;
                    c4200r2.getClass();
                    C4200r.m8449j(c4200r2, c2850d2, this);
                } else if (i10 != 1) {
                    C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                } else {
                    AbstractC1089i.m2732I0(obj);
                }
                break;
            default:
                int i11 = this.f9246i;
                if (i11 == 0) {
                    AbstractC1089i.m2732I0(obj);
                    ArrayList arrayList3 = new ArrayList();
                    C4200r c4200r3 = this.f9247j.f9251a;
                    C2850d c2850d3 = new C2850d(arrayList3, this.f9248k, 2);
                    this.f9246i = 1;
                    c4200r3.getClass();
                    C4200r.m8449j(c4200r3, c2850d3, this);
                } else if (i11 != 1) {
                    C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                } else {
                    AbstractC1089i.m2732I0(obj);
                }
                break;
        }
        return EnumC5799a.f23547g;
    }
}
