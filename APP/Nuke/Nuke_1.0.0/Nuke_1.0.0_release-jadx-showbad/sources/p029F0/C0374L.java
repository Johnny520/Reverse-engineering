package p029F0;

import p041H0.AbstractC0572Q;
import p041H0.C0630y0;
import p047I0.ViewTreeObserverOnGlobalLayoutListenerC0772y;
import p061L2.AbstractC0972l;
import p112W2.InterfaceC1603e;
import p153e1.EnumC2017m;

/* JADX INFO: renamed from: F0.L */
/* JADX INFO: loaded from: classes.dex */
public final class C0374L extends AbstractC0389a0 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f1187e;

    /* JADX INFO: renamed from: f */
    public final Object f1188f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0374L(int i5, Object obj) {
        this.f1187e = i5;
        this.f1188f = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p153e1.InterfaceC2007c
    /* JADX INFO: renamed from: b */
    public final float mo272b() {
        switch (this.f1187e) {
            case 0:
                return ((AbstractC0572Q) this.f1188f).mo272b();
            default:
                return ((ViewTreeObserverOnGlobalLayoutListenerC0772y) this.f1188f).getDensity().mo272b();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p029F0.AbstractC0389a0
    /* JADX INFO: renamed from: d */
    public float mo628d(C0414n c0414n) {
        float fIntBitsToFloat;
        int iM2004b0;
        switch (this.f1187e) {
            case 0:
                InterfaceC1603e interfaceC1603e = c0414n.f1247a;
                if (interfaceC1603e != null) {
                    return ((Number) interfaceC1603e.mo0g(this, Float.valueOf(Float.NaN))).floatValue();
                }
                AbstractC0572Q abstractC0572Q = (AbstractC0572Q) this.f1188f;
                if (abstractC0572Q.f1781n) {
                    return Float.NaN;
                }
                AbstractC0572Q abstractC0572Q2 = abstractC0572Q;
                while (true) {
                    C0630y0 c0630y0 = abstractC0572Q2.f1783p;
                    float f2 = (c0630y0 == null || (iM2004b0 = AbstractC0972l.m2004b0((C0414n[]) c0630y0.f2000c, c0414n)) < 0) ? Float.NaN : ((float[]) c0630y0.f2001d)[iM2004b0];
                    if (!Float.isNaN(f2)) {
                        abstractC0572Q2.m884m0(abstractC0572Q.mo893y0(), c0414n);
                        InterfaceC0430v interfaceC0430vMo891w0 = abstractC0572Q2.mo891w0();
                        InterfaceC0430v interfaceC0430vMo891w02 = abstractC0572Q.mo891w0();
                        switch (c0414n.f1248b) {
                            case 0:
                                fIntBitsToFloat = Float.intBitsToFloat((int) (interfaceC0430vMo891w02.mo636P(interfaceC0430vMo891w0, (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (((long) Float.floatToRawIntBits(((int) (interfaceC0430vMo891w0.mo637Q() >> 32)) / 2.0f)) << 32)) & 4294967295L));
                                break;
                            default:
                                fIntBitsToFloat = Float.intBitsToFloat((int) (interfaceC0430vMo891w02.mo636P(interfaceC0430vMo891w0, (((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(((int) (interfaceC0430vMo891w0.mo637Q() & 4294967295L)) / 2.0f)) & 4294967295L)) >> 32));
                                break;
                        }
                        return fIntBitsToFloat;
                    }
                    AbstractC0572Q abstractC0572QMo879A0 = abstractC0572Q2.mo879A0();
                    if (abstractC0572QMo879A0 == null) {
                        abstractC0572Q2.m884m0(abstractC0572Q.mo893y0(), c0414n);
                        return Float.NaN;
                    }
                    abstractC0572Q2 = abstractC0572QMo879A0;
                }
                break;
            default:
                return super.mo628d(c0414n);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p029F0.AbstractC0389a0
    /* JADX INFO: renamed from: e */
    public final EnumC2017m mo629e() {
        switch (this.f1187e) {
            case 0:
                return ((AbstractC0572Q) this.f1188f).getLayoutDirection();
            default:
                return ((ViewTreeObserverOnGlobalLayoutListenerC0772y) this.f1188f).getLayoutDirection();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p029F0.AbstractC0389a0
    /* JADX INFO: renamed from: f */
    public final int mo630f() {
        switch (this.f1187e) {
            case 0:
                return ((AbstractC0572Q) this.f1188f).mo664g0();
            default:
                return ((ViewTreeObserverOnGlobalLayoutListenerC0772y) this.f1188f).getRoot().f1700K.f1760p.f1206d;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p153e1.InterfaceC2007c
    /* JADX INFO: renamed from: p */
    public final float mo282p() {
        switch (this.f1187e) {
            case 0:
                return ((AbstractC0572Q) this.f1188f).mo282p();
            default:
                return ((ViewTreeObserverOnGlobalLayoutListenerC0772y) this.f1188f).getDensity().mo282p();
        }
    }
}
