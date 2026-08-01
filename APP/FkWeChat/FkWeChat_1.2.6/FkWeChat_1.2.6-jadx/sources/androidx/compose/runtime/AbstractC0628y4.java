package androidx.compose.runtime;

import p119i1.AbstractC3137l;
import p119i1.AbstractC3149r;
import p119i1.AbstractC3159w;
import p119i1.AbstractC3160w0;
import p119i1.AbstractC3162x0;
import p119i1.C3115b;
import p119i1.InterfaceC3116b0;
import p172l8.C4700i0;

/* JADX INFO: renamed from: androidx.compose.runtime.y4 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0628y4 extends AbstractC3160w0 implements InterfaceC0498g2, InterfaceC3116b0 {

    /* JADX INFO: renamed from: r */
    public a f1814r;

    /* JADX INFO: renamed from: androidx.compose.runtime.y4$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC3162x0 {

        /* JADX INFO: renamed from: c */
        public int f1815c;

        public a(long j10, int i10) {
            super(j10);
            this.f1815c = i10;
        }

        @Override // p119i1.AbstractC3162x0
        /* JADX INFO: renamed from: c */
        public void mo1522c(AbstractC3162x0 abstractC3162x0) {
            abstractC3162x0.getClass();
            this.f1815c = ((a) abstractC3162x0).f1815c;
        }

        @Override // p119i1.AbstractC3162x0
        /* JADX INFO: renamed from: d */
        public AbstractC3162x0 mo1523d(long j10) {
            return new a(j10, this.f1815c);
        }

        /* JADX INFO: renamed from: i */
        public final int m2461i() {
            return this.f1815c;
        }

        /* JADX INFO: renamed from: j */
        public final void m2462j(int i10) {
            this.f1815c = i10;
        }
    }

    public AbstractC0628y4(int i10) {
        AbstractC3137l abstractC3137lM11882K = AbstractC3159w.m11882K();
        a aVar = new a(abstractC3137lM11882K.mo11678i(), i10);
        if (!(abstractC3137lM11882K instanceof C3115b)) {
            aVar.m11942g(new a(AbstractC3149r.m11861c(1), i10));
        }
        this.f1814r = aVar;
    }

    @Override // p119i1.InterfaceC3116b0
    /* JADX INFO: renamed from: c */
    public InterfaceC0466b5 mo1518c() {
        return AbstractC0473c5.m1579r();
    }

    @Override // p119i1.InterfaceC3158v0
    /* JADX INFO: renamed from: e */
    public AbstractC3162x0 getFirstStateRecord() {
        return this.f1814r;
    }

    @Override // androidx.compose.runtime.InterfaceC0498g2, androidx.compose.runtime.InterfaceC0553o1
    /* JADX INFO: renamed from: f */
    public int mo1686f() {
        return ((a) AbstractC3159w.m11897Z(this.f1814r, this)).m2461i();
    }

    @Override // androidx.compose.runtime.InterfaceC0498g2
    /* JADX INFO: renamed from: j */
    public void mo1687j(int i10) {
        AbstractC3137l abstractC3137lM11764c;
        a aVar = (a) AbstractC3159w.m11880I(this.f1814r);
        if (aVar.m2461i() != i10) {
            a aVar2 = this.f1814r;
            synchronized (AbstractC3159w.m11883L()) {
                abstractC3137lM11764c = AbstractC3137l.f8345e.m11764c();
                ((a) AbstractC3159w.m11892U(aVar2, this, abstractC3137lM11764c, aVar)).m2462j(i10);
                C4700i0 c4700i0 = C4700i0.f13910a;
            }
            AbstractC3159w.m11890S(abstractC3137lM11764c, this);
        }
    }

    @Override // p119i1.InterfaceC3158v0
    /* JADX INFO: renamed from: l */
    public AbstractC3162x0 mo1520l(AbstractC3162x0 abstractC3162x0, AbstractC3162x0 abstractC3162x02, AbstractC3162x0 abstractC3162x03) {
        abstractC3162x02.getClass();
        abstractC3162x03.getClass();
        if (((a) abstractC3162x02).m2461i() == ((a) abstractC3162x03).m2461i()) {
            return abstractC3162x02;
        }
        return null;
    }

    @Override // p119i1.InterfaceC3158v0
    /* JADX INFO: renamed from: o */
    public void mo1521o(AbstractC3162x0 abstractC3162x0) {
        abstractC3162x0.getClass();
        this.f1814r = (a) abstractC3162x0;
    }

    public String toString() {
        return "MutableIntState(value=" + ((a) AbstractC3159w.m11880I(this.f1814r)).m2461i() + ")@" + hashCode();
    }
}
