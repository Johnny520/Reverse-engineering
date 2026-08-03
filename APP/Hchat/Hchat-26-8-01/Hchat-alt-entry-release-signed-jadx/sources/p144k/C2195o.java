package p144k;

import gg.AbstractC1416l;
import okio.C3193a;
import p010aa.C0035c;
import p057e1.C0808c;
import p057e1.C0809d;
import p057e1.C0810e;
import p071f1.AbstractC0996c0;
import p071f1.AbstractC1027s;
import p071f1.C1005h;
import p071f1.C1009j;
import p071f1.C1010j0;
import p071f1.C1012k0;
import p071f1.C1014l0;
import p071f1.C1034w;
import p071f1.InterfaceC1026r0;
import p071f1.InterfaceC1031u;
import p072f2.AbstractC1060w;
import p072f2.InterfaceC1062y;
import p101h1.C1565b;
import p101h1.C1569f;
import p101h1.InterfaceC1567d;
import p293u2.EnumC4243m;
import p339x1.AbstractC5618k;
import p339x1.C5610h0;
import p339x1.InterfaceC5624m;
import p339x1.InterfaceC5626m1;
import p339x1.InterfaceC5665z1;
import p356y0.AbstractC5852n;

/* JADX INFO: renamed from: k.o */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2195o extends AbstractC5852n implements InterfaceC5624m, InterfaceC5626m1, InterfaceC5665z1 {

    /* JADX INFO: renamed from: A */
    public AbstractC0996c0 f7275A;

    /* JADX INFO: renamed from: B */
    public InterfaceC1026r0 f7276B;

    /* JADX INFO: renamed from: C */
    public AbstractC0996c0 f7277C;

    /* JADX INFO: renamed from: u */
    public long f7278u;

    /* JADX INFO: renamed from: v */
    public AbstractC1027s f7279v;

    /* JADX INFO: renamed from: w */
    public float f7280w;

    /* JADX INFO: renamed from: x */
    public InterfaceC1026r0 f7281x;

    /* JADX INFO: renamed from: y */
    public long f7282y;

    /* JADX INFO: renamed from: z */
    public EnumC4243m f7283z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5665z1
    /* JADX INFO: renamed from: A */
    public final boolean mo2629A() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0196  */
    @Override // p339x1.InterfaceC5624m
    /* JADX INFO: renamed from: B */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo1326B(C5610h0 c5610h0) {
        AbstractC0996c0 abstractC0996c0;
        char c10;
        long j3;
        AbstractC1027s abstractC1027s;
        AbstractC1027s abstractC1027s2;
        C1009j c1009j;
        C1565b c1565b = c5610h0.f22833g;
        if (this.f7281x == AbstractC0996c0.f3162b) {
            if (!C1034w.m2635c(this.f7278u, C1034w.f3263g)) {
                InterfaceC1567d.m4087Z(c5610h0, this.f7278u, 0L, 0.0f, 0, 126);
            }
            AbstractC1027s abstractC1027s3 = this.f7279v;
            if (abstractC1027s3 != null) {
                InterfaceC1567d.m4086V0(c5610h0, abstractC1027s3, 0L, 0L, this.f7280w, null, 0, 118);
            }
        } else {
            if (C0810e.m2054a(c1565b.mo4091a(), this.f7282y) && c5610h0.getLayoutDirection() == this.f7283z && AbstractC1416l.m3825a(this.f7276B, this.f7281x)) {
                abstractC0996c0 = this.f7275A;
                abstractC0996c0.getClass();
            } else {
                AbstractC5618k.m10162r(this, new C0035c(this, 20, c5610h0));
                abstractC0996c0 = this.f7277C;
                this.f7277C = null;
            }
            AbstractC0996c0 abstractC0996c02 = abstractC0996c0;
            this.f7275A = abstractC0996c02;
            this.f7282y = c1565b.mo4091a();
            this.f7283z = c5610h0.getLayoutDirection();
            this.f7276B = this.f7281x;
            abstractC0996c02.getClass();
            boolean zM2635c = C1034w.m2635c(this.f7278u, C1034w.f3263g);
            C1569f c1569f = C1569f.f5225b;
            if (zM2635c) {
                c10 = ' ';
                j3 = 4294967295L;
                abstractC1027s = this.f7279v;
                if (abstractC1027s != null) {
                }
            } else {
                long j4 = this.f7278u;
                if (abstractC0996c02 instanceof C1012k0) {
                    C0808c c0808c = ((C1012k0) abstractC0996c02).f3197f;
                    float f3 = c0808c.f2416a;
                    c5610h0.mo4071P0(j4, (((long) Float.floatToRawIntBits(c0808c.f2417b)) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32), AbstractC0996c0.m2521r(c0808c), 1.0f, c1569f, 3);
                    c1569f = c1569f;
                } else {
                    if (abstractC0996c02 instanceof C1014l0) {
                        C1014l0 c1014l0 = (C1014l0) abstractC0996c02;
                        C1009j c1009j2 = c1014l0.f3199g;
                        if (c1009j2 != null) {
                            c5610h0.mo4070F0(c1009j2, j4, 1.0f, c1569f);
                            c1569f = c1569f;
                        } else {
                            C0809d c0809d = c1014l0.f3198f;
                            float f10 = c0809d.f2421b;
                            float f11 = c0809d.f2420a;
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (c0809d.f2427h >> 32));
                            c10 = ' ';
                            j3 = 4294967295L;
                            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f11)) << 32) | (((long) Float.floatToRawIntBits(f10)) & 4294967295L);
                            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(c0809d.f2422c - f11)) << 32) | (((long) Float.floatToRawIntBits(c0809d.f2423d - f10)) & 4294967295L);
                            long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
                            InterfaceC1031u interfaceC1031u = c1565b.f5219g.f5217c;
                            int i9 = (int) (jFloatToRawIntBits >> 32);
                            float fIntBitsToFloat2 = Float.intBitsToFloat(i9);
                            int i10 = (int) (jFloatToRawIntBits & 4294967295L);
                            float fIntBitsToFloat3 = Float.intBitsToFloat(i10);
                            float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jFloatToRawIntBits2 >> 32)) + Float.intBitsToFloat(i9);
                            float fIntBitsToFloat5 = Float.intBitsToFloat((int) (jFloatToRawIntBits2 & 4294967295L)) + Float.intBitsToFloat(i10);
                            float fIntBitsToFloat6 = Float.intBitsToFloat((int) (jFloatToRawIntBits3 >> 32));
                            float fIntBitsToFloat7 = Float.intBitsToFloat((int) (jFloatToRawIntBits3 & 4294967295L));
                            C1005h c1005hM4069e = C1565b.m4069e(c1565b, j4, c1569f, 1.0f, 3);
                            c1569f = c1569f;
                            interfaceC1031u.mo2498q(fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4, fIntBitsToFloat5, fIntBitsToFloat6, fIntBitsToFloat7, c1005hM4069e);
                        }
                    } else {
                        c10 = ' ';
                        j3 = 4294967295L;
                        if (!(abstractC0996c02 instanceof C1010j0)) {
                            C3193a.m6822k();
                            return;
                        } else {
                            c5610h0.mo4070F0(((C1010j0) abstractC0996c02).f3195f, j4, 1.0f, c1569f);
                            c1569f = c1569f;
                        }
                    }
                    abstractC1027s = this.f7279v;
                    if (abstractC1027s != null) {
                        float f12 = this.f7280w;
                        if (abstractC0996c02 instanceof C1012k0) {
                            C0808c c0808c2 = ((C1012k0) abstractC0996c02).f3197f;
                            c5610h0.mo4075d0(abstractC1027s, (((long) Float.floatToRawIntBits(c0808c2.f2416a)) << c10) | (((long) Float.floatToRawIntBits(c0808c2.f2417b)) & j3), AbstractC0996c0.m2521r(c0808c2), f12, c1569f, 3);
                        } else {
                            if (abstractC0996c02 instanceof C1014l0) {
                                C1014l0 c1014l02 = (C1014l0) abstractC0996c02;
                                abstractC1027s2 = abstractC1027s;
                                c1009j = c1014l02.f3199g;
                                if (c1009j == null) {
                                    C0809d c0809d2 = c1014l02.f3198f;
                                    float f13 = c0809d2.f2421b;
                                    float f14 = c0809d2.f2420a;
                                    float fIntBitsToFloat8 = Float.intBitsToFloat((int) (c0809d2.f2427h >> c10));
                                    c5610h0.m10066m(abstractC1027s2, (((long) Float.floatToRawIntBits(f14)) << c10) | (((long) Float.floatToRawIntBits(f13)) & j3), (((long) Float.floatToRawIntBits(c0809d2.f2422c - f14)) << c10) | (((long) Float.floatToRawIntBits(c0809d2.f2423d - f13)) & j3), (((long) Float.floatToRawIntBits(fIntBitsToFloat8)) & j3) | (Float.floatToRawIntBits(fIntBitsToFloat8) << c10), f12, c1569f);
                                }
                            } else if (!(abstractC0996c02 instanceof C1010j0)) {
                                C3193a.m6822k();
                                return;
                            } else {
                                abstractC1027s2 = abstractC1027s;
                                c1009j = ((C1010j0) abstractC0996c02).f3195f;
                            }
                            c5610h0.mo4072V(c1009j, abstractC1027s2, f12, c1569f, 3);
                        }
                    }
                }
                c10 = ' ';
                j3 = 4294967295L;
                abstractC1027s = this.f7279v;
                if (abstractC1027s != null) {
                }
            }
        }
        c5610h0.m10064e();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5626m1
    /* JADX INFO: renamed from: C0 */
    public final void mo1327C0() {
        this.f7282y = 9205357640488583168L;
        this.f7283z = null;
        this.f7275A = null;
        this.f7276B = null;
        AbstractC5618k.m10156l(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5665z1
    /* JADX INFO: renamed from: X0 */
    public final void mo1610X0(InterfaceC1062y interfaceC1062y) {
        AbstractC1060w.m2681d(interfaceC1062y, this.f7281x);
    }
}
