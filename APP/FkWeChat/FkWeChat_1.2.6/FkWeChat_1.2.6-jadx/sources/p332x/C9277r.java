package p332x;

import p080f9.AbstractC2368o;
import p219p.InterfaceC5842e;

/* JADX INFO: renamed from: x.r */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C9277r implements InterfaceC5842e {

    /* JADX INFO: renamed from: b */
    public final AbstractC9242c1 f31730b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC5842e f31731c;

    public C9277r(AbstractC9242c1 abstractC9242c1, InterfaceC5842e interfaceC5842e) {
        this.f31730b = abstractC9242c1;
        this.f31731c = interfaceC5842e;
    }

    @Override // p219p.InterfaceC5842e
    /* JADX INFO: renamed from: a */
    public float mo23536a(float f10, float f11, float f12) {
        float fMo23536a = this.f31731c.mo23536a(f10, f11, f12);
        boolean z10 = false;
        if (f10 <= 0.0f ? f10 + f11 <= 0.0f : f10 + f11 > f12) {
            z10 = true;
        }
        if (Math.abs(fMo23536a) != 0.0f && z10) {
            return m36109c(fMo23536a);
        }
        if (Math.abs(this.f31730b.m35991B()) < 1.0E-6d) {
            return 0.0f;
        }
        float fM35991B = this.f31730b.m35991B() * (-1.0f);
        if (this.f31730b.m35993D()) {
            fM35991B += this.f31730b.m36001L();
        }
        return AbstractC2368o.m8585l(fM35991B, -f12, f12);
    }

    /* JADX INFO: renamed from: c */
    public final float m36109c(float f10) {
        float fM35991B = this.f31730b.m35991B() * (-1);
        while (f10 > 0.0f && fM35991B < f10) {
            fM35991B += this.f31730b.m36001L();
        }
        while (f10 < 0.0f && fM35991B > f10) {
            fM35991B -= this.f31730b.m36001L();
        }
        return fM35991B;
    }
}
