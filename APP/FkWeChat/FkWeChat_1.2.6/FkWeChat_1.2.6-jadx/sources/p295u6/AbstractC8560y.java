package p295u6;

import ec.AbstractC2144j;
import ec.InterfaceC2165o0;
import io.ktor.utils.p131io.AbstractC3472j;
import io.ktor.utils.p131io.InterfaceC3468g;
import p010a9.InterfaceC0188p;
import p172l8.AbstractC4713t;
import p172l8.C4700i0;
import p228p8.InterfaceC5976f;
import p242q8.AbstractC6325c;
import p257r8.AbstractC6544m;
import p376zd.C10010p0;

/* JADX INFO: renamed from: u6.y */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8560y {

    /* JADX INFO: renamed from: u6.y$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC6544m implements InterfaceC0188p {

        /* JADX INFO: renamed from: q */
        public int f28570q;

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ InterfaceC3468g f28571r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC3468g interfaceC3468g, InterfaceC5976f interfaceC5976f) {
            super(2, interfaceC5976f);
            this.f28571r = interfaceC3468g;
        }

        @Override // p257r8.AbstractC6532a
        public final InterfaceC5976f create(Object obj, InterfaceC5976f interfaceC5976f) {
            return new a(this.f28571r, interfaceC5976f);
        }

        @Override // p010a9.InterfaceC0188p
        public final Object invoke(InterfaceC2165o0 interfaceC2165o0, InterfaceC5976f interfaceC5976f) {
            return ((a) create(interfaceC2165o0, interfaceC5976f)).invokeSuspend(C4700i0.f13910a);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM24992g = AbstractC6325c.m24992g();
            int i10 = this.f28570q;
            if (i10 != 0) {
                if (i10 == 1) {
                    AbstractC4713t.m18808b(obj);
                    return obj;
                }
                C10010p0.m38820a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC4713t.m18808b(obj);
            InterfaceC3468g interfaceC3468g = this.f28571r;
            this.f28570q = 1;
            Object objM12949f = AbstractC3472j.m12949f(interfaceC3468g, 0L, this, 1, null);
            return objM12949f == objM24992g ? objM24992g : objM12949f;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m32950a(InterfaceC3468g interfaceC3468g) {
        interfaceC3468g.getClass();
        AbstractC2144j.m7786b(null, new a(interfaceC3468g, null), 1, null);
    }
}
