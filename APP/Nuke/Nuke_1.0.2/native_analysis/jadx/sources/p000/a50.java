package p000;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class a50 implements InterfaceC0854wo {

    /* JADX INFO: renamed from: h */
    public final Executor f62h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC0854wo f63i;

    public a50(Executor executor, InterfaceC0854wo interfaceC0854wo) {
        this.f62h = executor;
        this.f63i = interfaceC0854wo;
    }

    @Override // p000.InterfaceC0854wo
    /* JADX INFO: renamed from: b */
    public final void mo93b(InterfaceC0101cp interfaceC0101cp) {
        this.f63i.mo93b(new sz0(8, this, interfaceC0101cp, false));
    }

    @Override // p000.InterfaceC0854wo
    /* JADX INFO: renamed from: c */
    public final k82 mo94c() {
        return this.f63i.mo94c();
    }

    @Override // p000.InterfaceC0854wo
    public final void cancel() {
        this.f63i.cancel();
    }

    @Override // p000.InterfaceC0854wo
    public final InterfaceC0854wo clone() {
        return new a50(this.f62h, this.f63i.clone());
    }

    @Override // p000.InterfaceC0854wo
    /* JADX INFO: renamed from: e */
    public final boolean mo95e() {
        return this.f63i.mo95e();
    }
}
