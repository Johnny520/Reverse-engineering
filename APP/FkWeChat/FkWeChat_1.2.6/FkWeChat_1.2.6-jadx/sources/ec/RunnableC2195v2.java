package ec;

import p145jc.C3835z;
import p228p8.InterfaceC5976f;

/* JADX INFO: renamed from: ec.v2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC2195v2 extends C3835z implements Runnable {

    /* JADX INFO: renamed from: u */
    public final long f6021u;

    public RunnableC2195v2(long j10, InterfaceC5976f interfaceC5976f) {
        super(interfaceC5976f.getContext(), interfaceC5976f);
        this.f6021u = j10;
    }

    @Override // ec.AbstractC2105a, ec.C2118c2
    /* JADX INFO: renamed from: L0 */
    public String mo7583L0() {
        return super.mo7583L0() + "(timeMillis=" + this.f6021u + ')';
    }

    @Override // java.lang.Runnable
    public void run() {
        m7652H(AbstractC2199w2.m7925a(this.f6021u, AbstractC2205y0.m7939c(getContext()), this));
    }
}
