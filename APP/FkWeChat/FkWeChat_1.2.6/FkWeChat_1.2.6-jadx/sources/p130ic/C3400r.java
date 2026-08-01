package p130ic;

import ec.AbstractC2210z1;
import p010a9.InterfaceC0188p;
import p010a9.InterfaceC0189q;
import p024b9.AbstractC1061t;
import p113hc.InterfaceC2974d;
import p172l8.C4700i0;
import p172l8.C4712s;
import p228p8.C5981k;
import p228p8.InterfaceC5976f;
import p228p8.InterfaceC5980j;
import p242q8.AbstractC6325c;
import p257r8.AbstractC6535d;
import p257r8.AbstractC6539h;
import p257r8.InterfaceC6536e;
import p299ub.AbstractC8638t;

/* JADX INFO: renamed from: ic.r */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3400r extends AbstractC6535d implements InterfaceC2974d, InterfaceC6536e {

    /* JADX INFO: renamed from: q */
    public final InterfaceC2974d f9382q;

    /* JADX INFO: renamed from: r */
    public final InterfaceC5980j f9383r;

    /* JADX INFO: renamed from: s */
    public final int f9384s;

    /* JADX INFO: renamed from: t */
    public InterfaceC5980j f9385t;

    /* JADX INFO: renamed from: u */
    public InterfaceC5976f f9386u;

    public C3400r(InterfaceC2974d interfaceC2974d, InterfaceC5980j interfaceC5980j) {
        super(C3396n.f9376q, C5981k.f18917q);
        this.f9382q = interfaceC2974d;
        this.f9383r = interfaceC5980j;
        this.f9384s = ((Number) interfaceC5980j.mo1655q(0, new InterfaceC0188p() { // from class: ic.q
            @Override // p010a9.InterfaceC0188p
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(C3400r.m12745r(((Integer) obj).intValue(), (InterfaceC5980j.b) obj2));
            }
        })).intValue();
    }

    /* JADX INFO: renamed from: r */
    public static int m12745r(int i10, InterfaceC5980j.b bVar) {
        return i10 + 1;
    }

    @Override // p113hc.InterfaceC2974d
    /* JADX INFO: renamed from: a */
    public Object mo400a(Object obj, InterfaceC5976f interfaceC5976f) {
        try {
            Object objM12747x = m12747x(interfaceC5976f, obj);
            if (objM12747x == AbstractC6325c.m24992g()) {
                AbstractC6539h.m25860c(interfaceC5976f);
            }
            return objM12747x == AbstractC6325c.m24992g() ? objM12747x : C4700i0.f13910a;
        } catch (Throwable th) {
            this.f9385t = new C3393k(th, interfaceC5976f.getContext());
            throw th;
        }
    }

    @Override // p257r8.AbstractC6532a, p257r8.InterfaceC6536e
    public InterfaceC6536e getCallerFrame() {
        InterfaceC5976f interfaceC5976f = this.f9386u;
        if (interfaceC5976f instanceof InterfaceC6536e) {
            return (InterfaceC6536e) interfaceC5976f;
        }
        return null;
    }

    @Override // p257r8.AbstractC6535d, p228p8.InterfaceC5976f
    public InterfaceC5980j getContext() {
        InterfaceC5980j interfaceC5980j = this.f9385t;
        return interfaceC5980j == null ? C5981k.f18917q : interfaceC5980j;
    }

    @Override // p257r8.AbstractC6532a
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // p257r8.AbstractC6532a
    public Object invokeSuspend(Object obj) {
        Throwable thM18801e = C4712s.m18801e(obj);
        if (thM18801e != null) {
            this.f9385t = new C3393k(thM18801e, getContext());
        }
        InterfaceC5976f interfaceC5976f = this.f9386u;
        if (interfaceC5976f != null) {
            interfaceC5976f.resumeWith(obj);
        }
        return AbstractC6325c.m24992g();
    }

    @Override // p257r8.AbstractC6535d, p257r8.AbstractC6532a
    public void releaseIntercepted() {
        super.releaseIntercepted();
    }

    /* JADX INFO: renamed from: w */
    public final void m12746w(InterfaceC5980j interfaceC5980j, InterfaceC5980j interfaceC5980j2, Object obj) {
        if (interfaceC5980j2 instanceof C3393k) {
            m12748y((C3393k) interfaceC5980j2, obj);
        }
        AbstractC3403u.m12752b(this, interfaceC5980j);
    }

    /* JADX INFO: renamed from: x */
    public final Object m12747x(InterfaceC5976f interfaceC5976f, Object obj) {
        InterfaceC5980j context = interfaceC5976f.getContext();
        AbstractC2210z1.m7959l(context);
        InterfaceC5980j interfaceC5980j = this.f9385t;
        if (interfaceC5980j != context) {
            m12746w(context, interfaceC5980j, obj);
            this.f9385t = context;
        }
        this.f9386u = interfaceC5976f;
        InterfaceC0189q interfaceC0189q = AbstractC3401s.f9387a;
        InterfaceC2974d interfaceC2974d = this.f9382q;
        interfaceC2974d.getClass();
        Object objMo236e = interfaceC0189q.mo236e(interfaceC2974d, obj, this);
        if (!AbstractC1061t.m3842c(objMo236e, AbstractC6325c.m24992g())) {
            this.f9386u = null;
        }
        return objMo236e;
    }

    /* JADX INFO: renamed from: y */
    public final void m12748y(C3393k c3393k, Object obj) {
        throw new IllegalStateException(AbstractC8638t.m33244k("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + c3393k.f9375r + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
    }
}
