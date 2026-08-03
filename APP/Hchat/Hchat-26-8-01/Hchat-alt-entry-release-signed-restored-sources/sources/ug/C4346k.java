package ug;

import gg.AbstractC1416l;
import p015b0.C0154t;
import p085fg.InterfaceC1236q;
import p119i2.C1954y;
import p218og.AbstractC3150n;
import p249qg.AbstractC3603v;
import p276sf.C3960g;
import p276sf.C3967n;
import p352xf.EnumC5799a;
import p370yf.AbstractC6038c;
import p370yf.InterfaceC6039d;
import tg.InterfaceC4187e;
import wf.C5562h;
import wf.InterfaceC5557c;
import wf.InterfaceC5561g;

/* JADX INFO: renamed from: ug.k */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4346k extends AbstractC6038c implements InterfaceC4187e {

    /* JADX INFO: renamed from: g */
    public final InterfaceC4187e f14520g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC5561g f14521h;

    /* JADX INFO: renamed from: i */
    public final int f14522i;

    /* JADX INFO: renamed from: j */
    public InterfaceC5561g f14523j;

    /* JADX INFO: renamed from: k */
    public InterfaceC5557c f14524k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4346k(InterfaceC4187e interfaceC4187e, InterfaceC5561g interfaceC5561g) {
        super(C4344i.f14518g, C5562h.f22661g);
        this.f14520g = interfaceC4187e;
        this.f14521h = interfaceC5561g;
        this.f14522i = ((Number) interfaceC5561g.mo2061k(new C1954y(25), 0)).intValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // tg.InterfaceC4187e
    /* JADX INFO: renamed from: e */
    public final Object mo1602e(Object obj, InterfaceC5557c interfaceC5557c) {
        try {
            Object objM8796f = m8796f(interfaceC5557c, obj);
            return objM8796f == EnumC5799a.f23547g ? objM8796f : C3967n.f12976a;
        } catch (Throwable th2) {
            this.f14523j = new C4343h(th2, interfaceC5557c.getContext());
            throw th2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final Object m8796f(InterfaceC5557c interfaceC5557c, Object obj) {
        InterfaceC5561g context = interfaceC5557c.getContext();
        AbstractC3603v.m7553g(context);
        InterfaceC5561g interfaceC5561g = this.f14523j;
        if (interfaceC5561g != context) {
            if (interfaceC5561g instanceof C4343h) {
                throw new IllegalStateException(AbstractC3150n.m6728R("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((C4343h) interfaceC5561g).f14517h + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
            if (((Number) context.mo2061k(new C0154t(this, 21), 0)).intValue() != this.f14522i) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.f14521h + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.f14523j = context;
        }
        this.f14524k = interfaceC5557c;
        InterfaceC1236q interfaceC1236q = AbstractC4348m.f14526a;
        InterfaceC4187e interfaceC4187e = this.f14520g;
        interfaceC4187e.getClass();
        Object objMo734b = interfaceC1236q.mo734b(interfaceC4187e, obj, this);
        if (!AbstractC1416l.m3825a(objMo734b, EnumC5799a.f23547g)) {
            this.f14524k = null;
        }
        return objMo734b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a, p370yf.InterfaceC6039d
    public final InterfaceC6039d getCallerFrame() {
        InterfaceC5557c interfaceC5557c = this.f14524k;
        if (interfaceC5557c instanceof InterfaceC6039d) {
            return (InterfaceC6039d) interfaceC5557c;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6038c, wf.InterfaceC5557c
    public final InterfaceC5561g getContext() {
        InterfaceC5561g interfaceC5561g = this.f14523j;
        return interfaceC5561g == null ? C5562h.f22661g : interfaceC5561g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final Object invokeSuspend(Object obj) {
        Throwable thM8182b = C3960g.m8182b(obj);
        if (thM8182b != null) {
            this.f14523j = new C4343h(thM8182b, getContext());
        }
        InterfaceC5557c interfaceC5557c = this.f14524k;
        if (interfaceC5557c != null) {
            interfaceC5557c.resumeWith(obj);
        }
        return EnumC5799a.f23547g;
    }
}
