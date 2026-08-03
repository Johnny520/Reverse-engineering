package p332wb;

import java.util.List;
import p077f8.AbstractC1089i;
import p085fg.InterfaceC1235p;
import p117i0.InterfaceC1809a1;
import p136j8.C2104o;
import p249qg.AbstractC3603v;
import p249qg.InterfaceC3599t;
import p251r.C3641z;
import p276sf.C3967n;
import p352xf.EnumC5799a;
import p370yf.AbstractC6044i;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: wb.kt */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5057kt extends AbstractC6044i implements InterfaceC1235p {

    /* JADX INFO: renamed from: h */
    public int f18534h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ boolean f18535i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ List f18536j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C3641z f18537k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ List f18538l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ InterfaceC1809a1 f18539m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5057kt(boolean z9, List list, C3641z c3641z, List list2, InterfaceC1809a1 interfaceC1809a1, InterfaceC5557c interfaceC5557c) {
        super(2, interfaceC5557c);
        this.f18535i = z9;
        this.f18536j = list;
        this.f18537k = c3641z;
        this.f18538l = list2;
        this.f18539m = interfaceC1809a1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final InterfaceC5557c create(Object obj, InterfaceC5557c interfaceC5557c) {
        return new C5057kt(this.f18535i, this.f18536j, this.f18537k, this.f18538l, this.f18539m, interfaceC5557c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        return ((C5057kt) create((InterfaceC3599t) obj, (InterfaceC5557c) obj2)).invokeSuspend(C3967n.f12976a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0051, code lost:
    
        if (p251r.C3641z.m7618m(r6.f18537k, r7, r6) != r3) goto L22;
     */
    @Override // p370yf.AbstractC6036a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i9 = this.f18534h;
        EnumC5799a enumC5799a = EnumC5799a.f23547g;
        if (i9 == 0) {
            AbstractC1089i.m2732I0(obj);
            if (this.f18535i && ((Boolean) this.f18539m.getValue()).booleanValue() && !this.f18536j.isEmpty()) {
                this.f18534h = 1;
                if (AbstractC3603v.m7552f(180L, this) != enumC5799a) {
                    int size = this.f18538l.size();
                    this.f18534h = 2;
                }
                return enumC5799a;
            }
            return C3967n.f12976a;
        }
        if (i9 != 1) {
            if (i9 == 2) {
                AbstractC1089i.m2732I0(obj);
                return C3967n.f12976a;
            }
            C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC1089i.m2732I0(obj);
        int size2 = this.f18538l.size();
        this.f18534h = 2;
    }
}
