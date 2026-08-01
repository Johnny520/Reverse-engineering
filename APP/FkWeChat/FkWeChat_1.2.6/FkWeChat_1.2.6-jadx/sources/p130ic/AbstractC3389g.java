package p130ic;

import ec.AbstractC2141i0;
import p010a9.InterfaceC0188p;
import p024b9.AbstractC1061t;
import p099gc.EnumC2732a;
import p099gc.InterfaceC2751t;
import p113hc.InterfaceC2972c;
import p113hc.InterfaceC2974d;
import p172l8.AbstractC4713t;
import p172l8.C4700i0;
import p228p8.InterfaceC5976f;
import p228p8.InterfaceC5977g;
import p228p8.InterfaceC5980j;
import p242q8.AbstractC6325c;
import p257r8.AbstractC6544m;
import p376zd.C10010p0;

/* JADX INFO: renamed from: ic.g */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3389g extends AbstractC3387e {

    /* JADX INFO: renamed from: t */
    public final InterfaceC2972c f9351t;

    /* JADX INFO: renamed from: ic.g$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC6544m implements InterfaceC0188p {

        /* JADX INFO: renamed from: q */
        public int f9352q;

        /* JADX INFO: renamed from: r */
        public /* synthetic */ Object f9353r;

        public a(InterfaceC5976f interfaceC5976f) {
            super(2, interfaceC5976f);
        }

        @Override // p257r8.AbstractC6532a
        public final InterfaceC5976f create(Object obj, InterfaceC5976f interfaceC5976f) {
            a aVar = AbstractC3389g.this.new a(interfaceC5976f);
            aVar.f9353r = obj;
            return aVar;
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM24992g = AbstractC6325c.m24992g();
            int i10 = this.f9352q;
            if (i10 == 0) {
                AbstractC4713t.m18808b(obj);
                InterfaceC2974d interfaceC2974d = (InterfaceC2974d) this.f9353r;
                AbstractC3389g abstractC3389g = AbstractC3389g.this;
                this.f9352q = 1;
                if (abstractC3389g.mo12740s(interfaceC2974d, this) == objM24992g) {
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
        public final Object invoke(InterfaceC2974d interfaceC2974d, InterfaceC5976f interfaceC5976f) {
            return ((a) create(interfaceC2974d, interfaceC5976f)).invokeSuspend(C4700i0.f13910a);
        }
    }

    public AbstractC3389g(InterfaceC2972c interfaceC2972c, InterfaceC5980j interfaceC5980j, int i10, EnumC2732a enumC2732a) {
        super(interfaceC5980j, i10, enumC2732a);
        this.f9351t = interfaceC2972c;
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ Object m12737p(AbstractC3389g abstractC3389g, InterfaceC2974d interfaceC2974d, InterfaceC5976f interfaceC5976f) {
        if (abstractC3389g.f9342r == -3) {
            InterfaceC5980j context = interfaceC5976f.getContext();
            InterfaceC5980j interfaceC5980jM7770h = AbstractC2141i0.m7770h(context, abstractC3389g.f9341q);
            if (AbstractC1061t.m3842c(interfaceC5980jM7770h, context)) {
                Object objMo12740s = abstractC3389g.mo12740s(interfaceC2974d, interfaceC5976f);
                return objMo12740s == AbstractC6325c.m24992g() ? objMo12740s : C4700i0.f13910a;
            }
            InterfaceC5977g.b bVar = InterfaceC5977g.f18915n;
            if (AbstractC1061t.m3842c(interfaceC5980jM7770h.mo1654h(bVar), context.mo1654h(bVar))) {
                Object objM12739r = abstractC3389g.m12739r(interfaceC2974d, interfaceC5980jM7770h, interfaceC5976f);
                return objM12739r == AbstractC6325c.m24992g() ? objM12739r : C4700i0.f13910a;
            }
        }
        Object objMo399b = super.mo399b(interfaceC2974d, interfaceC5976f);
        return objMo399b == AbstractC6325c.m24992g() ? objMo399b : C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ Object m12738q(AbstractC3389g abstractC3389g, InterfaceC2751t interfaceC2751t, InterfaceC5976f interfaceC5976f) {
        Object objMo12740s = abstractC3389g.mo12740s(new C3404v(interfaceC2751t), interfaceC5976f);
        return objMo12740s == AbstractC6325c.m24992g() ? objMo12740s : C4700i0.f13910a;
    }

    @Override // p130ic.AbstractC3387e, p113hc.InterfaceC2972c
    /* JADX INFO: renamed from: b */
    public Object mo399b(InterfaceC2974d interfaceC2974d, InterfaceC5976f interfaceC5976f) {
        return m12737p(this, interfaceC2974d, interfaceC5976f);
    }

    @Override // p130ic.AbstractC3387e
    /* JADX INFO: renamed from: i */
    public Object mo12726i(InterfaceC2751t interfaceC2751t, InterfaceC5976f interfaceC5976f) {
        return m12738q(this, interfaceC2751t, interfaceC5976f);
    }

    /* JADX INFO: renamed from: r */
    public final Object m12739r(InterfaceC2974d interfaceC2974d, InterfaceC5980j interfaceC5980j, InterfaceC5976f interfaceC5976f) {
        return AbstractC3388f.m12735c(interfaceC5980j, AbstractC3388f.m12736d(interfaceC2974d, interfaceC5976f.getContext()), null, new a(null), interfaceC5976f, 4, null);
    }

    /* JADX INFO: renamed from: s */
    public abstract Object mo12740s(InterfaceC2974d interfaceC2974d, InterfaceC5976f interfaceC5976f);

    @Override // p130ic.AbstractC3387e
    public String toString() {
        return this.f9351t + " -> " + super.toString();
    }
}
