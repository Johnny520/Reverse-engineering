package p216p;

import p000A.C0073m;
import p027E4.C0330q;
import p041H0.AbstractC0601k;
import p041H0.C0566K;
import p041H0.InterfaceC0604l0;
import p041H0.InterfaceC0605m;
import p041H0.InterfaceC0632z0;
import p077P0.AbstractC1134u;
import p077P0.InterfaceC1136w;
import p117X2.AbstractC1665j;
import p153e1.EnumC2017m;
import p169h0.AbstractC2206o;
import p204n0.C2684c;
import p204n0.C2685d;
import p204n0.C2686e;
import p211o0.AbstractC2758q;
import p211o0.AbstractC2767z;
import p211o0.C2731F;
import p211o0.C2732G;
import p211o0.C2733H;
import p211o0.C2750i;
import p211o0.C2762u;
import p211o0.InterfaceC2738M;
import p222q0.C2901b;
import p222q0.C2905f;
import p222q0.InterfaceC2903d;

/* JADX INFO: renamed from: p.n */
/* JADX INFO: loaded from: classes.dex */
public final class C2857n extends AbstractC2206o implements InterfaceC0605m, InterfaceC0604l0, InterfaceC0632z0 {

    /* JADX INFO: renamed from: r */
    public long f8990r;

    /* JADX INFO: renamed from: s */
    public AbstractC2758q f8991s;

    /* JADX INFO: renamed from: t */
    public float f8992t;

    /* JADX INFO: renamed from: u */
    public InterfaceC2738M f8993u;

    /* JADX INFO: renamed from: v */
    public long f8994v;

    /* JADX INFO: renamed from: w */
    public EnumC2017m f8995w;

    /* JADX INFO: renamed from: x */
    public AbstractC2767z f8996x;

    /* JADX INFO: renamed from: y */
    public InterfaceC2738M f8997y;

    /* JADX INFO: renamed from: z */
    public AbstractC2767z f8998z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.InterfaceC0604l0
    /* JADX INFO: renamed from: O */
    public final void mo1051O() {
        this.f8994v = 9205357640488583168L;
        this.f8995w = null;
        this.f8996x = null;
        this.f8997y = null;
        AbstractC0601k.m1034j(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0188  */
    @Override // p041H0.InterfaceC0605m
    /* JADX INFO: renamed from: R */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo940R(C0566K c0566k) {
        AbstractC2767z abstractC2767z;
        C2905f c2905f;
        long j5;
        char c5;
        AbstractC2767z abstractC2767z2;
        AbstractC2758q abstractC2758q;
        AbstractC2758q abstractC2758q2;
        C2905f c2905f2;
        C2750i c2750i;
        C0566K c0566k2;
        C2901b c2901b = c0566k.f1742d;
        if (this.f8993u == AbstractC2767z.f8776b) {
            if (!C2762u.m4921c(this.f8990r, C2762u.f8762g)) {
                InterfaceC2903d.m5104h(c0566k, this.f8990r, 0L, 0L, 126);
            }
            AbstractC2758q abstractC2758q3 = this.f8991s;
            if (abstractC2758q3 != null) {
                InterfaceC2903d.m5101N(c0566k, abstractC2758q3, 0L, 0L, this.f8992t, null, 118);
            }
        } else {
            if (C2686e.m4661a(c2901b.mo859c(), this.f8994v) && c0566k.getLayoutDirection() == this.f8995w && AbstractC1665j.m2981a(this.f8997y, this.f8993u)) {
                abstractC2767z = this.f8996x;
                AbstractC1665j.m2982b(abstractC2767z);
            } else {
                AbstractC0601k.m1040p(this, new C0073m(25, this, c0566k));
                abstractC2767z = this.f8998z;
                this.f8998z = null;
            }
            AbstractC2767z abstractC2767z3 = abstractC2767z;
            this.f8996x = abstractC2767z3;
            this.f8994v = c2901b.mo859c();
            this.f8995w = c0566k.getLayoutDirection();
            this.f8997y = this.f8993u;
            AbstractC1665j.m2982b(abstractC2767z3);
            boolean zM4921c = C2762u.m4921c(this.f8990r, C2762u.f8762g);
            C2905f c2905f3 = C2905f.f9190b;
            if (zM4921c) {
                c2905f = c2905f3;
            } else {
                long j6 = this.f8990r;
                if (abstractC2767z3 instanceof C2732G) {
                    C2684c c2684c = ((C2732G) abstractC2767z3).f8677f;
                    float f2 = c2684c.f8558a;
                    c2905f = c2905f3;
                    c0566k.mo853F(j6, (((long) Float.floatToRawIntBits(c2684c.f8559b)) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32), AbstractC2767z.m4947r(c2684c), c2905f, 3);
                } else {
                    c2905f = c2905f3;
                    if (abstractC2767z3 instanceof C2733H) {
                        C2733H c2733h = (C2733H) abstractC2767z3;
                        C2750i c2750i2 = c2733h.f8679g;
                        if (c2750i2 != null) {
                            c0566k.mo862o(c2750i2, j6, c2905f);
                        } else {
                            C2685d c2685d = c2733h.f8678f;
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (c2685d.f8569h >> 32));
                            float f5 = c2685d.f8562a;
                            j5 = 4294967295L;
                            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(c2685d.f8563b)) & 4294967295L) | (Float.floatToRawIntBits(f5) << 32);
                            float fM4660b = c2685d.m4660b();
                            float fM4659a = c2685d.m4659a();
                            long jFloatToRawIntBits2 = Float.floatToRawIntBits(fM4660b);
                            c5 = ' ';
                            abstractC2767z2 = abstractC2767z3;
                            long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(fM4659a)) & 4294967295L) | (jFloatToRawIntBits2 << 32);
                            long jFloatToRawIntBits4 = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
                            int i5 = (int) (jFloatToRawIntBits >> 32);
                            int i6 = (int) (jFloatToRawIntBits & 4294967295L);
                            c2901b.f9184d.f9182c.mo4849j(Float.intBitsToFloat(i5), Float.intBitsToFloat(i6), Float.intBitsToFloat((int) (jFloatToRawIntBits3 >> 32)) + Float.intBitsToFloat(i5), Float.intBitsToFloat((int) (jFloatToRawIntBits3 & 4294967295L)) + Float.intBitsToFloat(i6), Float.intBitsToFloat((int) (jFloatToRawIntBits4 >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits4 & 4294967295L)), C2901b.m5096a(c2901b, j6, c2905f, 3));
                        }
                    } else {
                        abstractC2767z2 = abstractC2767z3;
                        c5 = ' ';
                        j5 = 4294967295L;
                        if (!(abstractC2767z2 instanceof C2731F)) {
                            throw new C0330q();
                        }
                        c0566k.mo862o(((C2731F) abstractC2767z2).f8676f, j6, c2905f);
                    }
                    abstractC2758q = this.f8991s;
                    if (abstractC2758q != null) {
                        float f6 = this.f8992t;
                        if (abstractC2767z2 instanceof C2732G) {
                            C2684c c2684c2 = ((C2732G) abstractC2767z2).f8677f;
                            float f7 = c2684c2.f8558a;
                            c0566k.m861e(abstractC2758q, (((long) Float.floatToRawIntBits(c2684c2.f8559b)) & j5) | (Float.floatToRawIntBits(f7) << c5), AbstractC2767z.m4947r(c2684c2), f6, c2905f);
                        } else {
                            if (abstractC2767z2 instanceof C2733H) {
                                C2733H c2733h2 = (C2733H) abstractC2767z2;
                                abstractC2758q2 = abstractC2758q;
                                c2750i = c2733h2.f8679g;
                                if (c2750i != null) {
                                    c0566k2 = c0566k;
                                    c2905f2 = c2905f;
                                } else {
                                    C2685d c2685d2 = c2733h2.f8678f;
                                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (c2685d2.f8569h >> c5));
                                    float f8 = c2685d2.f8562a;
                                    c0566k.mo864t(abstractC2758q2, (((long) Float.floatToRawIntBits(c2685d2.f8563b)) & j5) | (Float.floatToRawIntBits(f8) << c5), (((long) Float.floatToRawIntBits(c2685d2.m4660b())) << c5) | (((long) Float.floatToRawIntBits(c2685d2.m4659a())) & j5), (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << c5) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & j5), f6, c2905f);
                                }
                            } else {
                                if (!(abstractC2767z2 instanceof C2731F)) {
                                    throw new C0330q();
                                }
                                abstractC2758q2 = abstractC2758q;
                                c2905f2 = c2905f;
                                c2750i = ((C2731F) abstractC2767z2).f8676f;
                                c0566k2 = c0566k;
                            }
                            c0566k2.mo863o0(c2750i, abstractC2758q2, f6, c2905f2, 3);
                        }
                    }
                }
            }
            abstractC2767z2 = abstractC2767z3;
            c5 = ' ';
            j5 = 4294967295L;
            abstractC2758q = this.f8991s;
            if (abstractC2758q != null) {
            }
        }
        c0566k.m857a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.InterfaceC0632z0
    /* JADX INFO: renamed from: X */
    public final void mo943X(InterfaceC1136w interfaceC1136w) {
        AbstractC1134u.m2190c(interfaceC1136w, this.f8993u);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.InterfaceC0632z0
    /* JADX INFO: renamed from: f */
    public final boolean mo1083f() {
        return false;
    }
}
