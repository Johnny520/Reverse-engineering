package androidx.compose.runtime;

import p119i1.AbstractC3137l;
import p119i1.AbstractC3149r;
import p119i1.AbstractC3159w;
import p119i1.AbstractC3160w0;
import p119i1.AbstractC3162x0;
import p119i1.C3115b;
import p119i1.InterfaceC3116b0;
import p172l8.C4700i0;

/* JADX INFO: renamed from: androidx.compose.runtime.z4 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0634z4 extends AbstractC3160w0 implements InterfaceC0505h2, InterfaceC3116b0 {

    /* JADX INFO: renamed from: r */
    public a f1827r;

    /* JADX INFO: renamed from: androidx.compose.runtime.z4$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC3162x0 {

        /* JADX INFO: renamed from: c */
        public long f1828c;

        public a(long j10, long j11) {
            super(j10);
            this.f1828c = j11;
        }

        @Override // p119i1.AbstractC3162x0
        /* JADX INFO: renamed from: c */
        public void mo1522c(AbstractC3162x0 abstractC3162x0) {
            abstractC3162x0.getClass();
            this.f1828c = ((a) abstractC3162x0).f1828c;
        }

        @Override // p119i1.AbstractC3162x0
        /* JADX INFO: renamed from: d */
        public AbstractC3162x0 mo1523d(long j10) {
            return new a(j10, this.f1828c);
        }

        /* JADX INFO: renamed from: i */
        public final long m2480i() {
            return this.f1828c;
        }

        /* JADX INFO: renamed from: j */
        public final void m2481j(long j10) {
            this.f1828c = j10;
        }
    }

    public AbstractC0634z4(long j10) {
        AbstractC3137l abstractC3137lM11882K = AbstractC3159w.m11882K();
        a aVar = new a(abstractC3137lM11882K.mo11678i(), j10);
        if (!(abstractC3137lM11882K instanceof C3115b)) {
            aVar.m11942g(new a(AbstractC3149r.m11861c(1), j10));
        }
        this.f1827r = aVar;
    }

    @Override // androidx.compose.runtime.InterfaceC0505h2, androidx.compose.runtime.InterfaceC0619x1
    /* JADX INFO: renamed from: a */
    public long mo1692a() {
        return ((a) AbstractC3159w.m11897Z(this.f1827r, this)).m2480i();
    }

    @Override // p119i1.InterfaceC3116b0
    /* JADX INFO: renamed from: c */
    public InterfaceC0466b5 mo1518c() {
        return AbstractC0473c5.m1579r();
    }

    @Override // p119i1.InterfaceC3158v0
    /* JADX INFO: renamed from: e */
    public AbstractC3162x0 getFirstStateRecord() {
        return this.f1827r;
    }

    @Override // p119i1.InterfaceC3158v0
    /* JADX INFO: renamed from: l */
    public AbstractC3162x0 mo1520l(AbstractC3162x0 abstractC3162x0, AbstractC3162x0 abstractC3162x02, AbstractC3162x0 abstractC3162x03) {
        abstractC3162x02.getClass();
        abstractC3162x03.getClass();
        if (((a) abstractC3162x02).m2480i() == ((a) abstractC3162x03).m2480i()) {
            return abstractC3162x02;
        }
        return null;
    }

    @Override // androidx.compose.runtime.InterfaceC0505h2
    /* JADX INFO: renamed from: n */
    public void mo1693n(long j10) {
        AbstractC3137l abstractC3137lM11764c;
        a aVar = (a) AbstractC3159w.m11880I(this.f1827r);
        if (aVar.m2480i() != j10) {
            a aVar2 = this.f1827r;
            synchronized (AbstractC3159w.m11883L()) {
                abstractC3137lM11764c = AbstractC3137l.f8345e.m11764c();
                ((a) AbstractC3159w.m11892U(aVar2, this, abstractC3137lM11764c, aVar)).m2481j(j10);
                C4700i0 c4700i0 = C4700i0.f13910a;
            }
            AbstractC3159w.m11890S(abstractC3137lM11764c, this);
        }
    }

    @Override // p119i1.InterfaceC3158v0
    /* JADX INFO: renamed from: o */
    public void mo1521o(AbstractC3162x0 abstractC3162x0) {
        abstractC3162x0.getClass();
        this.f1827r = (a) abstractC3162x0;
    }

    public String toString() {
        return "MutableLongState(value=" + ((a) AbstractC3159w.m11880I(this.f1827r)).m2480i() + ")@" + hashCode();
    }
}
