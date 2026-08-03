package p100h0;

import p077f8.AbstractC1089i;
import p085fg.InterfaceC1235p;
import p117i0.InterfaceC1809a1;
import p119i2.AbstractC1923e0;
import p119i2.C1926g;
import p119i2.C1939m0;
import p129ig.AbstractC2043a;
import p136j8.C2104o;
import p201o.AbstractC3028d;
import p218og.C3147k;
import p249qg.AbstractC3603v;
import p249qg.InterfaceC3599t;
import p276sf.C3967n;
import p321w.EnumC4602h0;
import p332wb.AbstractC4955ho;
import p352xf.EnumC5799a;
import p357y1.C5886h;
import p357y1.C5951x0;
import p357y1.InterfaceC5955y0;
import p370yf.AbstractC6044i;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: h0.x0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1559x0 extends AbstractC6044i implements InterfaceC1235p {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f5203h = 0;

    /* JADX INFO: renamed from: i */
    public int f5204i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ boolean f5205j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f5206k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1559x0(C1511d1 c1511d1, boolean z9, InterfaceC5557c interfaceC5557c) {
        super(2, interfaceC5557c);
        this.f5206k = c1511d1;
        this.f5205j = z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final InterfaceC5557c create(Object obj, InterfaceC5557c interfaceC5557c) {
        switch (this.f5203h) {
            case 0:
                return new C1559x0((C1511d1) this.f5206k, this.f5205j, interfaceC5557c);
            default:
                return new C1559x0((InterfaceC1809a1) this.f5206k, interfaceC5557c, this.f5205j);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC3599t interfaceC3599t = (InterfaceC3599t) obj;
        InterfaceC5557c interfaceC5557c = (InterfaceC5557c) obj2;
        switch (this.f5203h) {
        }
        return ((C1559x0) create(interfaceC3599t, interfaceC5557c)).invokeSuspend(C3967n.f12976a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final Object invokeSuspend(Object obj) {
        InterfaceC5955y0 interfaceC5955y0;
        int i9 = this.f5203h;
        C3967n c3967n = C3967n.f12976a;
        boolean z9 = this.f5205j;
        EnumC5799a enumC5799a = EnumC5799a.f23547g;
        Object obj2 = this.f5206k;
        C1926g c1926gM5052z = null;
        switch (i9) {
            case 0:
                C1511d1 c1511d1 = (C1511d1) obj2;
                int i10 = this.f5204i;
                if (i10 != 0) {
                    if (i10 == 1) {
                        AbstractC1089i.m2732I0(obj);
                        return c3967n;
                    }
                    C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC1089i.m2732I0(obj);
                if (!C1939m0.m4813c(c1511d1.m4028n().f9317b)) {
                    c1926gM5052z = AbstractC2043a.m5052z(c1511d1.m4028n());
                    if (z9) {
                        int iM4815e = C1939m0.m4815e(c1511d1.m4028n().f9317b);
                        c1511d1.f5031c.invoke(C1511d1.m4018e(c1511d1.m4028n().f9316a, AbstractC1923e0.m4784b(iM4815e, iM4815e)));
                        c1511d1.m4031q(EnumC4602h0.f15180g);
                    }
                }
                if (c1926gM5052z == null || (interfaceC5955y0 = c1511d1.f5035g) == null) {
                    return c3967n;
                }
                C5951x0 c5951x0M6433a = AbstractC3028d.m6433a(c1926gM5052z);
                this.f5204i = 1;
                ((C5886h) interfaceC5955y0).m10607a(c5951x0M6433a);
                return c3967n == enumC5799a ? enumC5799a : c3967n;
            default:
                InterfaceC1809a1 interfaceC1809a1 = (InterfaceC1809a1) obj2;
                int i11 = this.f5204i;
                if (i11 == 0) {
                    AbstractC1089i.m2732I0(obj);
                    if (z9) {
                        C3147k c3147k = AbstractC4955ho.f17686a;
                        interfaceC1809a1.setValue(Boolean.TRUE);
                        return c3967n;
                    }
                    this.f5204i = 1;
                    if (AbstractC3603v.m7552f(110L, this) == enumC5799a) {
                        return enumC5799a;
                    }
                } else {
                    if (i11 != 1) {
                        C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC1089i.m2732I0(obj);
                }
                C3147k c3147k2 = AbstractC4955ho.f17686a;
                interfaceC1809a1.setValue(Boolean.FALSE);
                return c3967n;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1559x0(InterfaceC1809a1 interfaceC1809a1, InterfaceC5557c interfaceC5557c, boolean z9) {
        super(2, interfaceC5557c);
        this.f5205j = z9;
        this.f5206k = interfaceC1809a1;
    }
}
