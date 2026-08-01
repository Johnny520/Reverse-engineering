package p130ic;

import p010a9.InterfaceC0188p;
import p113hc.InterfaceC2974d;
import p145jc.AbstractC3815k0;
import p172l8.AbstractC4713t;
import p172l8.C4700i0;
import p228p8.InterfaceC5976f;
import p228p8.InterfaceC5980j;
import p242q8.AbstractC6325c;
import p257r8.AbstractC6544m;
import p376zd.C10010p0;

/* JADX INFO: renamed from: ic.y */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3407y implements InterfaceC2974d {

    /* JADX INFO: renamed from: q */
    public final InterfaceC5980j f9393q;

    /* JADX INFO: renamed from: r */
    public final Object f9394r;

    /* JADX INFO: renamed from: s */
    public final InterfaceC0188p f9395s;

    /* JADX INFO: renamed from: ic.y$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC6544m implements InterfaceC0188p {

        /* JADX INFO: renamed from: q */
        public int f9396q;

        /* JADX INFO: renamed from: r */
        public /* synthetic */ Object f9397r;

        /* JADX INFO: renamed from: s */
        public final /* synthetic */ InterfaceC2974d f9398s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC2974d interfaceC2974d, InterfaceC5976f interfaceC5976f) {
            super(2, interfaceC5976f);
            this.f9398s = interfaceC2974d;
        }

        @Override // p257r8.AbstractC6532a
        public final InterfaceC5976f create(Object obj, InterfaceC5976f interfaceC5976f) {
            a aVar = new a(this.f9398s, interfaceC5976f);
            aVar.f9397r = obj;
            return aVar;
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM24992g = AbstractC6325c.m24992g();
            int i10 = this.f9396q;
            if (i10 == 0) {
                AbstractC4713t.m18808b(obj);
                Object obj2 = this.f9397r;
                InterfaceC2974d interfaceC2974d = this.f9398s;
                this.f9396q = 1;
                if (interfaceC2974d.mo400a(obj2, this) == objM24992g) {
                    return objM24992g;
                }
            } else {
                if (i10 != 1) {
                    C10010p0.m38820a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC4713t.m18808b(obj);
            }
            return C4700i0.f13910a;
        }

        @Override // p010a9.InterfaceC0188p
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object obj, InterfaceC5976f interfaceC5976f) {
            return ((a) create(obj, interfaceC5976f)).invokeSuspend(C4700i0.f13910a);
        }
    }

    public C3407y(InterfaceC2974d interfaceC2974d, InterfaceC5980j interfaceC5980j) {
        this.f9393q = interfaceC5980j;
        this.f9394r = AbstractC3815k0.m15197e(interfaceC5980j);
        this.f9395s = new a(interfaceC2974d, null);
    }

    @Override // p113hc.InterfaceC2974d
    /* JADX INFO: renamed from: a */
    public Object mo400a(Object obj, InterfaceC5976f interfaceC5976f) {
        Object objM12734b = AbstractC3388f.m12734b(this.f9393q, obj, this.f9394r, this.f9395s, interfaceC5976f);
        return objM12734b == AbstractC6325c.m24992g() ? objM12734b : C4700i0.f13910a;
    }
}
