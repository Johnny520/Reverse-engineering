package ec;

import p010a9.InterfaceC0188p;
import p228p8.InterfaceC5976f;
import p228p8.InterfaceC5980j;

/* JADX INFO: renamed from: ec.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2105a extends C2118c2 implements InterfaceC2198w1, InterfaceC5976f, InterfaceC2165o0 {

    /* JADX INFO: renamed from: s */
    public final InterfaceC5980j f5905s;

    public AbstractC2105a(InterfaceC5980j interfaceC5980j, boolean z10, boolean z11) {
        super(z11);
        if (z10) {
            m7703y0((InterfaceC2198w1) interfaceC5980j.mo1654h(InterfaceC2198w1.f6022g));
        }
        this.f5905s = interfaceC5980j.mo1651c0(this);
    }

    @Override // ec.C2118c2
    /* JADX INFO: renamed from: L0 */
    public String mo7583L0() {
        String strM7767e = AbstractC2141i0.m7767e(this.f5905s);
        if (strM7767e == null) {
            return super.mo7583L0();
        }
        return "\"" + strM7767e + "\":" + super.mo7583L0();
    }

    @Override // ec.C2118c2
    /* JADX INFO: renamed from: Q0 */
    public final void mo7584Q0(Object obj) {
        if (!(obj instanceof C2111b0)) {
            mo7589i1(obj);
        } else {
            C2111b0 c2111b0 = (C2111b0) obj;
            mo7588h1(c2111b0.f5913a, c2111b0.m7620a());
        }
    }

    @Override // ec.C2118c2
    /* JADX INFO: renamed from: S */
    public String mo7585S() {
        return AbstractC2181s0.m7898a(this) + " was cancelled";
    }

    @Override // ec.C2118c2, ec.InterfaceC2198w1
    /* JADX INFO: renamed from: c */
    public boolean mo7586c() {
        return super.mo7586c();
    }

    /* JADX INFO: renamed from: g1 */
    public void mo7587g1(Object obj) {
        mo7599C(obj);
    }

    @Override // p228p8.InterfaceC5976f
    public final InterfaceC5980j getContext() {
        return this.f5905s;
    }

    @Override // ec.InterfaceC2165o0
    public InterfaceC5980j getCoroutineContext() {
        return this.f5905s;
    }

    /* JADX INFO: renamed from: j1 */
    public final void m7590j1(EnumC2173q0 enumC2173q0, Object obj, InterfaceC0188p interfaceC0188p) {
        enumC2173q0.m7891c(interfaceC0188p, obj, this);
    }

    @Override // p228p8.InterfaceC5976f
    public final void resumeWith(Object obj) {
        Object objM7658K0 = m7658K0(AbstractC2121d0.m7724b(obj));
        if (objM7658K0 == AbstractC2123d2.f5939b) {
            return;
        }
        mo7587g1(objM7658K0);
    }

    @Override // ec.C2118c2
    /* JADX INFO: renamed from: x0 */
    public final void mo7591x0(Throwable th) {
        AbstractC2157m0.m7839a(this.f5905s, th);
    }

    /* JADX INFO: renamed from: i1 */
    public void mo7589i1(Object obj) {
    }

    /* JADX INFO: renamed from: h1 */
    public void mo7588h1(Throwable th, boolean z10) {
    }
}
