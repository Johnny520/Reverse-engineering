package p308v1;

import p085fg.InterfaceC1235p;
import p183m8.C2815c;
import p293u2.EnumC4243m;
import p339x1.AbstractC5628n0;
import p357y1.ViewTreeObserverOnGlobalLayoutListenerC5934t;
import tf.AbstractC4165l;

/* JADX INFO: renamed from: v1.k0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4403k0 extends AbstractC4374a1 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f14671h;

    /* JADX INFO: renamed from: i */
    public final Object f14672i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C4403k0(Object obj, int i9) {
        this.f14671h = i9;
        this.f14672i = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p293u2.InterfaceC4233c
    /* JADX INFO: renamed from: d */
    public final float mo1333d() {
        switch (this.f14671h) {
            case 0:
                return ((AbstractC5628n0) this.f14672i).mo1333d();
            default:
                return ((ViewTreeObserverOnGlobalLayoutListenerC5934t) this.f14672i).getDensity().mo1333d();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.AbstractC4374a1
    /* JADX INFO: renamed from: j */
    public float mo8817j(C4405l c4405l) {
        float fIntBitsToFloat;
        int iM8367D0;
        switch (this.f14671h) {
            case 0:
                InterfaceC1235p interfaceC1235p = c4405l.f14673a;
                if (interfaceC1235p != null) {
                    return ((Number) interfaceC1235p.invoke(this, Float.valueOf(Float.NaN))).floatValue();
                }
                AbstractC5628n0 abstractC5628n0 = (AbstractC5628n0) this.f14672i;
                if (abstractC5628n0.f22924q) {
                    return Float.NaN;
                }
                AbstractC5628n0 abstractC5628n02 = abstractC5628n0;
                while (true) {
                    C2815c c2815c = abstractC5628n02.f22926s;
                    float f3 = (c2815c == null || (iM8367D0 = AbstractC4165l.m8367D0((C4405l[]) c2815c.f9081b, c4405l)) < 0) ? Float.NaN : ((float[]) c2815c.f9082c)[iM8367D0];
                    if (!Float.isNaN(f3)) {
                        abstractC5628n02.m10173J0(abstractC5628n0.mo10090Y0(), c4405l);
                        InterfaceC4428t interfaceC4428tMo10088T0 = abstractC5628n02.mo10088T0();
                        InterfaceC4428t interfaceC4428tMo10088T02 = abstractC5628n0.mo10088T0();
                        switch (c4405l.f14674b) {
                            case 0:
                                fIntBitsToFloat = Float.intBitsToFloat((int) (interfaceC4428tMo10088T02.mo8869w(interfaceC4428tMo10088T0, (((long) Float.floatToRawIntBits(f3)) & 4294967295L) | (((long) Float.floatToRawIntBits(((int) (interfaceC4428tMo10088T0.mo8858F() >> 32)) / 2.0f)) << 32)) & 4294967295L));
                                break;
                            default:
                                fIntBitsToFloat = Float.intBitsToFloat((int) (interfaceC4428tMo10088T02.mo8869w(interfaceC4428tMo10088T0, (((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(((int) (interfaceC4428tMo10088T0.mo8858F() & 4294967295L)) / 2.0f)) & 4294967295L)) >> 32));
                                break;
                        }
                        return fIntBitsToFloat;
                    }
                    AbstractC5628n0 abstractC5628n0Mo10092a1 = abstractC5628n02.mo10092a1();
                    if (abstractC5628n0Mo10092a1 == null) {
                        abstractC5628n02.m10173J0(abstractC5628n0.mo10090Y0(), c4405l);
                        return Float.NaN;
                    }
                    abstractC5628n02 = abstractC5628n0Mo10092a1;
                }
                break;
            default:
                return super.mo8817j(c4405l);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.AbstractC4374a1
    /* JADX INFO: renamed from: m */
    public final EnumC4243m mo8818m() {
        switch (this.f14671h) {
            case 0:
                return ((AbstractC5628n0) this.f14672i).getLayoutDirection();
            default:
                return ((ViewTreeObserverOnGlobalLayoutListenerC5934t) this.f14672i).getLayoutDirection();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p293u2.InterfaceC4233c
    /* JADX INFO: renamed from: q0 */
    public final float mo1335q0() {
        switch (this.f14671h) {
            case 0:
                return ((AbstractC5628n0) this.f14672i).mo1335q0();
            default:
                return ((ViewTreeObserverOnGlobalLayoutListenerC5934t) this.f14672i).getDensity().mo1335q0();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.AbstractC4374a1
    /* JADX INFO: renamed from: w */
    public final int mo8819w() {
        switch (this.f14671h) {
            case 0:
                return ((AbstractC5628n0) this.f14672i).mo8826w0();
            default:
                return ((ViewTreeObserverOnGlobalLayoutListenerC5934t) this.f14672i).getRoot().f22779M.f22891p.f14593g;
        }
    }
}
