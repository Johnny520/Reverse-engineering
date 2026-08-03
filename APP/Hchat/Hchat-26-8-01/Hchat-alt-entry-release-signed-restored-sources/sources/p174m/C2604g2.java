package p174m;

import p077f8.AbstractC1089i;
import p085fg.InterfaceC1235p;
import p136j8.C2104o;
import p249qg.InterfaceC3599t;
import p276sf.C3967n;
import p352xf.EnumC5799a;
import p370yf.AbstractC6044i;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: m.g2 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2604g2 extends AbstractC6044i implements InterfaceC1235p {

    /* JADX INFO: renamed from: h */
    public int f8436h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C2609h2 f8437i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ float f8438j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ float f8439k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2604g2(C2609h2 c2609h2, float f3, float f10, InterfaceC5557c interfaceC5557c) {
        super(2, interfaceC5557c);
        this.f8437i = c2609h2;
        this.f8438j = f3;
        this.f8439k = f10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final InterfaceC5557c create(Object obj, InterfaceC5557c interfaceC5557c) {
        return new C2604g2(this.f8437i, this.f8438j, this.f8439k, interfaceC5557c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        return ((C2604g2) create((InterfaceC3599t) obj, (InterfaceC5557c) obj2)).invokeSuspend(C3967n.f12976a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final Object invokeSuspend(Object obj) {
        int i9 = this.f8436h;
        if (i9 == 0) {
            AbstractC1089i.m2732I0(obj);
            C2637o2 c2637o2 = this.f8437i.f8459T;
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(this.f8438j)) << 32) | (((long) Float.floatToRawIntBits(this.f8439k)) & 4294967295L);
            this.f8436h = 1;
            Object objM6040a = AbstractC2574a2.m6040a(c2637o2, jFloatToRawIntBits, this);
            EnumC5799a enumC5799a = EnumC5799a.f23547g;
            if (objM6040a == enumC5799a) {
                return enumC5799a;
            }
        } else {
            if (i9 != 1) {
                C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC1089i.m2732I0(obj);
        }
        return C3967n.f12976a;
    }
}
