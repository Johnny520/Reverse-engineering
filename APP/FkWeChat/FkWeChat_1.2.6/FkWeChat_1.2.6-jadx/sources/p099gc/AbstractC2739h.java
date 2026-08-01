package p099gc;

import ec.AbstractC2105a;
import ec.C2118c2;
import ec.C2202x1;
import java.util.concurrent.CancellationException;
import p228p8.InterfaceC5976f;
import p228p8.InterfaceC5980j;
import p242q8.AbstractC6325c;

/* JADX INFO: renamed from: gc.h */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2739h extends AbstractC2105a implements InterfaceC2738g {

    /* JADX INFO: renamed from: t */
    public final InterfaceC2738g f7196t;

    public AbstractC2739h(InterfaceC5980j interfaceC5980j, InterfaceC2738g interfaceC2738g, boolean z10, boolean z11) {
        super(interfaceC5980j, z10, z11);
        this.f7196t = interfaceC2738g;
    }

    @Override // ec.C2118c2
    /* JADX INFO: renamed from: J */
    public void mo7656J(Throwable th) {
        CancellationException cancellationExceptionM7641Z0 = C2118c2.m7641Z0(this, th, null, 1, null);
        this.f7196t.mo9773n(cancellationExceptionM7641Z0);
        m7652H(cancellationExceptionM7641Z0);
    }

    @Override // p099gc.InterfaceC2753v
    /* JADX INFO: renamed from: a */
    public Object mo9755a() {
        return this.f7196t.mo9755a();
    }

    @Override // p099gc.InterfaceC2753v
    /* JADX INFO: renamed from: b */
    public Object mo9757b(InterfaceC5976f interfaceC5976f) {
        return this.f7196t.mo9757b(interfaceC5976f);
    }

    @Override // p099gc.InterfaceC2754w
    /* JADX INFO: renamed from: i */
    public Object mo9768i(Object obj, InterfaceC5976f interfaceC5976f) {
        return this.f7196t.mo9768i(obj, interfaceC5976f);
    }

    @Override // p099gc.InterfaceC2753v
    public InterfaceC2740i iterator() {
        return this.f7196t.iterator();
    }

    /* JADX INFO: renamed from: k1 */
    public final InterfaceC2738g m9832k1() {
        return this.f7196t;
    }

    @Override // ec.C2118c2, ec.InterfaceC2198w1
    /* JADX INFO: renamed from: n */
    public final void mo7696n(CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new C2202x1(mo7585S(), null, this);
        }
        mo7656J(cancellationException);
    }

    @Override // p099gc.InterfaceC2754w
    /* JADX INFO: renamed from: p */
    public boolean mo9776p(Throwable th) {
        return this.f7196t.mo9776p(th);
    }

    @Override // p099gc.InterfaceC2753v
    /* JADX INFO: renamed from: r */
    public Object mo9779r(InterfaceC5976f interfaceC5976f) {
        Object objMo9779r = this.f7196t.mo9779r(interfaceC5976f);
        AbstractC6325c.m24992g();
        return objMo9779r;
    }

    @Override // p099gc.InterfaceC2754w
    /* JADX INFO: renamed from: s */
    public Object mo9781s(Object obj) {
        return this.f7196t.mo9781s(obj);
    }
}
