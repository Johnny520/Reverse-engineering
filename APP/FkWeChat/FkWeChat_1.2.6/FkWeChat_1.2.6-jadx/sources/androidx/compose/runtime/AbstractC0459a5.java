package androidx.compose.runtime;

import p119i1.AbstractC3137l;
import p119i1.AbstractC3149r;
import p119i1.AbstractC3159w;
import p119i1.AbstractC3160w0;
import p119i1.AbstractC3162x0;
import p119i1.C3115b;
import p119i1.InterfaceC3116b0;
import p172l8.C4700i0;

/* JADX INFO: renamed from: androidx.compose.runtime.a5 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0459a5 extends AbstractC3160w0 implements InterfaceC3116b0 {

    /* JADX INFO: renamed from: r */
    public final InterfaceC0466b5 f1301r;

    /* JADX INFO: renamed from: s */
    public a f1302s;

    /* JADX INFO: renamed from: androidx.compose.runtime.a5$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC3162x0 {

        /* JADX INFO: renamed from: c */
        public Object f1303c;

        public a(long j10, Object obj) {
            super(j10);
            this.f1303c = obj;
        }

        @Override // p119i1.AbstractC3162x0
        /* JADX INFO: renamed from: c */
        public void mo1522c(AbstractC3162x0 abstractC3162x0) {
            abstractC3162x0.getClass();
            this.f1303c = ((a) abstractC3162x0).f1303c;
        }

        @Override // p119i1.AbstractC3162x0
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public a mo1523d(long j10) {
            return new a(AbstractC3159w.m11882K().mo11678i(), this.f1303c);
        }

        /* JADX INFO: renamed from: j */
        public final Object m1525j() {
            return this.f1303c;
        }

        /* JADX INFO: renamed from: k */
        public final void m1526k(Object obj) {
            this.f1303c = obj;
        }
    }

    public AbstractC0459a5(Object obj, InterfaceC0466b5 interfaceC0466b5) {
        this.f1301r = interfaceC0466b5;
        AbstractC3137l abstractC3137lM11882K = AbstractC3159w.m11882K();
        a aVar = new a(abstractC3137lM11882K.mo11678i(), obj);
        if (!(abstractC3137lM11882K instanceof C3115b)) {
            aVar.m11942g(new a(AbstractC3149r.m11861c(1), obj));
        }
        this.f1302s = aVar;
    }

    @Override // p119i1.InterfaceC3116b0
    /* JADX INFO: renamed from: c */
    public InterfaceC0466b5 mo1518c() {
        return this.f1301r;
    }

    @Override // p119i1.InterfaceC3158v0
    /* JADX INFO: renamed from: e */
    public AbstractC3162x0 getFirstStateRecord() {
        return this.f1302s;
    }

    @Override // androidx.compose.runtime.InterfaceC0512i2, androidx.compose.runtime.InterfaceC0564p5
    public Object getValue() {
        return ((a) AbstractC3159w.m11897Z(this.f1302s, this)).m1525j();
    }

    @Override // p119i1.InterfaceC3158v0
    /* JADX INFO: renamed from: l */
    public AbstractC3162x0 mo1520l(AbstractC3162x0 abstractC3162x0, AbstractC3162x0 abstractC3162x02, AbstractC3162x0 abstractC3162x03) {
        abstractC3162x0.getClass();
        a aVar = (a) abstractC3162x0;
        abstractC3162x02.getClass();
        a aVar2 = (a) abstractC3162x02;
        abstractC3162x03.getClass();
        a aVar3 = (a) abstractC3162x03;
        if (mo1518c().mo1545a(aVar2.m1525j(), aVar3.m1525j())) {
            return abstractC3162x02;
        }
        Object objM1546b = mo1518c().m1546b(aVar.m1525j(), aVar2.m1525j(), aVar3.m1525j());
        if (objM1546b == null) {
            return null;
        }
        a aVarMo1523d = aVar3.mo1523d(aVar3.m11941f());
        aVarMo1523d.m1526k(objM1546b);
        return aVarMo1523d;
    }

    @Override // p119i1.InterfaceC3158v0
    /* JADX INFO: renamed from: o */
    public void mo1521o(AbstractC3162x0 abstractC3162x0) {
        abstractC3162x0.getClass();
        this.f1302s = (a) abstractC3162x0;
    }

    @Override // androidx.compose.runtime.InterfaceC0512i2
    public void setValue(Object obj) {
        AbstractC3137l abstractC3137lM11764c;
        a aVar = (a) AbstractC3159w.m11880I(this.f1302s);
        if (mo1518c().mo1545a(aVar.m1525j(), obj)) {
            return;
        }
        a aVar2 = this.f1302s;
        synchronized (AbstractC3159w.m11883L()) {
            abstractC3137lM11764c = AbstractC3137l.f8345e.m11764c();
            ((a) AbstractC3159w.m11892U(aVar2, this, abstractC3137lM11764c, aVar)).m1526k(obj);
            C4700i0 c4700i0 = C4700i0.f13910a;
        }
        AbstractC3159w.m11890S(abstractC3137lM11764c, this);
    }

    public String toString() {
        return "MutableState(value=" + ((a) AbstractC3159w.m11880I(this.f1302s)).m1525j() + ")@" + hashCode();
    }
}
