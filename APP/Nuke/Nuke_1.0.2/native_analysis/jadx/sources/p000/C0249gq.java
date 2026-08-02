package p000;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: gq */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0249gq extends AbstractC0286hq {

    /* JADX INFO: renamed from: m */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f3653m = AtomicIntegerFieldUpdater.newUpdater(C0249gq.class, "consumed$volatile");
    private volatile /* synthetic */ int consumed$volatile;

    /* JADX INFO: renamed from: k */
    public final InterfaceC0212fq f3654k;

    /* JADX INFO: renamed from: l */
    public final boolean f3655l;

    public /* synthetic */ C0249gq(InterfaceC0212fq interfaceC0212fq, boolean z) {
        this(interfaceC0212fq, z, zd0.f13837h, -3, EnumC0283hn.f4084h);
    }

    @Override // p000.AbstractC0286hq, p000.zj0
    /* JADX INFO: renamed from: a */
    public final Object mo1660a(ak0 ak0Var, t00 t00Var) throws Throwable {
        int i = this.f4107i;
        k20 k20Var = k20.f5323h;
        if (i == -3) {
            boolean z = this.f3655l;
            if (z && f3653m.getAndSet(this, 1) == 1) {
                C0676s.m4653l("ReceiveChannel.consumeAsFlow can be collected just once");
                return null;
            }
            Object objM783H = ci0.m783H(ak0Var, this.f3654k, z, t00Var);
            if (objM783H == k20Var) {
                return objM783H;
            }
        } else {
            Object objMo1660a = super.mo1660a(ak0Var, t00Var);
            if (objMo1660a == k20Var) {
                return objMo1660a;
            }
        }
        return a83.f116a;
    }

    @Override // p000.AbstractC0286hq
    /* JADX INFO: renamed from: b */
    public final String mo2014b() {
        return "channel=" + this.f3654k;
    }

    @Override // p000.AbstractC0286hq
    /* JADX INFO: renamed from: c */
    public final Object mo2015c(o32 o32Var, t00 t00Var) throws Throwable {
        Object objM783H = ci0.m783H(new to2(o32Var), this.f3654k, this.f3655l, t00Var);
        return objM783H == k20.f5323h ? objM783H : a83.f116a;
    }

    @Override // p000.AbstractC0286hq
    /* JADX INFO: renamed from: d */
    public final AbstractC0286hq mo2016d(a20 a20Var, int i, EnumC0283hn enumC0283hn) {
        return new C0249gq(this.f3654k, this.f3655l, a20Var, i, enumC0283hn);
    }

    @Override // p000.AbstractC0286hq
    /* JADX INFO: renamed from: e */
    public final zj0 mo2017e() {
        return new C0249gq(this.f3654k, this.f3655l);
    }

    @Override // p000.AbstractC0286hq
    /* JADX INFO: renamed from: f */
    public final InterfaceC0212fq mo2018f(j20 j20Var) {
        if (!this.f3655l || f3653m.getAndSet(this, 1) != 1) {
            return this.f4107i == -3 ? this.f3654k : super.mo2018f(j20Var);
        }
        C0676s.m4653l("ReceiveChannel.consumeAsFlow can be collected just once");
        return null;
    }

    public C0249gq(InterfaceC0212fq interfaceC0212fq, boolean z, a20 a20Var, int i, EnumC0283hn enumC0283hn) {
        super(a20Var, i, enumC0283hn);
        this.f3654k = interfaceC0212fq;
        this.f3655l = z;
    }
}
