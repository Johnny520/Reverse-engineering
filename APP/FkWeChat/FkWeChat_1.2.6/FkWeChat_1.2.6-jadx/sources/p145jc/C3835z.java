package p145jc;

import ec.AbstractC2105a;
import ec.AbstractC2121d0;
import p228p8.InterfaceC5976f;
import p228p8.InterfaceC5980j;
import p242q8.AbstractC6324b;
import p257r8.InterfaceC6536e;

/* JADX INFO: renamed from: jc.z */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public class C3835z extends AbstractC2105a implements InterfaceC6536e {

    /* JADX INFO: renamed from: t */
    public final InterfaceC5976f f11025t;

    public C3835z(InterfaceC5980j interfaceC5980j, InterfaceC5976f interfaceC5976f) {
        super(interfaceC5980j, true, true);
        this.f11025t = interfaceC5976f;
    }

    @Override // ec.C2118c2
    /* JADX INFO: renamed from: A0 */
    public final boolean mo7646A0() {
        return true;
    }

    @Override // ec.C2118c2
    /* JADX INFO: renamed from: C */
    public void mo7599C(Object obj) {
        AbstractC3810i.m15179b(AbstractC6324b.m24989d(this.f11025t), AbstractC2121d0.m7723a(obj, this.f11025t));
    }

    @Override // ec.AbstractC2105a
    /* JADX INFO: renamed from: g1 */
    public void mo7587g1(Object obj) {
        InterfaceC5976f interfaceC5976f = this.f11025t;
        interfaceC5976f.resumeWith(AbstractC2121d0.m7723a(obj, interfaceC5976f));
    }

    @Override // p257r8.InterfaceC6536e
    public final InterfaceC6536e getCallerFrame() {
        InterfaceC5976f interfaceC5976f = this.f11025t;
        if (interfaceC5976f instanceof InterfaceC6536e) {
            return (InterfaceC6536e) interfaceC5976f;
        }
        return null;
    }

    /* JADX INFO: renamed from: k1 */
    public void mo7944k1() {
    }
}
