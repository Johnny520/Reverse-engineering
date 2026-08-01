package p222q0;

import com.bumptech.glide.AbstractC1924f;
import p000A.C0072l0;
import p041H0.C0566K;
import p153e1.EnumC2017m;
import p153e1.InterfaceC2007c;
import p211o0.AbstractC2758q;
import p211o0.C2747f;
import p211o0.C2750i;
import p211o0.C2753l;

/* JADX INFO: renamed from: q0.d */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2903d extends InterfaceC2007c {
    /* JADX INFO: renamed from: A */
    static /* synthetic */ void m5100A(InterfaceC2903d interfaceC2903d, long j5, float f2, long j6, C2906g c2906g, int i5) {
        if ((i5 & 4) != 0) {
            j6 = interfaceC2903d.mo856Y();
        }
        long j7 = j6;
        AbstractC2902c abstractC2902c = c2906g;
        if ((i5 & 16) != 0) {
            abstractC2902c = C2905f.f9190b;
        }
        interfaceC2903d.mo858a0(j5, f2, j7, abstractC2902c);
    }

    /* JADX INFO: renamed from: N */
    static void m5101N(C0566K c0566k, AbstractC2758q abstractC2758q, long j5, long j6, float f2, AbstractC2902c abstractC2902c, int i5) {
        if ((i5 & 2) != 0) {
            j5 = 0;
        }
        long j7 = j5;
        if ((i5 & 4) != 0) {
            j6 = m5107v0(c0566k.f1742d.mo859c(), j7);
        }
        c0566k.m861e(abstractC2758q, j7, j6, (i5 & 8) != 0 ? 1.0f : f2, (i5 & 16) != 0 ? C2905f.f9190b : abstractC2902c);
    }

    /* JADX INFO: renamed from: b0 */
    static void m5102b0(InterfaceC2903d interfaceC2903d, C2747f c2747f, long j5, long j6, float f2, C2753l c2753l, int i5, int i6) {
        interfaceC2903d.mo865u(c2747f, 0L, j5, (i6 & 16) != 0 ? j5 : j6, (i6 & 32) != 0 ? 1.0f : f2, c2753l, (i6 & 512) != 0 ? 1 : i5);
    }

    /* JADX INFO: renamed from: g */
    static /* synthetic */ void m5103g(InterfaceC2903d interfaceC2903d, C2750i c2750i, AbstractC2758q abstractC2758q, float f2, C2906g c2906g, int i5) {
        if ((i5 & 4) != 0) {
            f2 = 1.0f;
        }
        float f5 = f2;
        AbstractC2902c abstractC2902c = c2906g;
        if ((i5 & 8) != 0) {
            abstractC2902c = C2905f.f9190b;
        }
        interfaceC2903d.mo863o0(c2750i, abstractC2758q, f5, abstractC2902c, (i5 & 32) != 0 ? 3 : 0);
    }

    /* JADX INFO: renamed from: h */
    static /* synthetic */ void m5104h(InterfaceC2903d interfaceC2903d, long j5, long j6, long j7, int i5) {
        if ((i5 & 2) != 0) {
            j6 = 0;
        }
        long j8 = j6;
        interfaceC2903d.mo853F(j5, j8, (i5 & 4) != 0 ? m5107v0(interfaceC2903d.mo859c(), j8) : j7, C2905f.f9190b, (i5 & 64) != 0 ? 3 : 0);
    }

    /* JADX INFO: renamed from: q */
    static /* synthetic */ void m5106q(InterfaceC2903d interfaceC2903d, AbstractC2758q abstractC2758q, long j5, long j6, long j7, AbstractC2902c abstractC2902c, int i5) {
        if ((i5 & 2) != 0) {
            j5 = 0;
        }
        long j8 = j5;
        interfaceC2903d.mo864t(abstractC2758q, j8, (i5 & 4) != 0 ? m5107v0(interfaceC2903d.mo859c(), j8) : j6, j7, 1.0f, (i5 & 32) != 0 ? C2905f.f9190b : abstractC2902c);
    }

    /* JADX INFO: renamed from: v0 */
    static long m5107v0(long j5, long j6) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j5 >> 32)) - Float.intBitsToFloat((int) (j6 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j5 & 4294967295L)) - Float.intBitsToFloat((int) (j6 & 4294967295L));
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    /* JADX INFO: renamed from: F */
    void mo853F(long j5, long j6, long j7, AbstractC2902c abstractC2902c, int i5);

    /* JADX INFO: renamed from: L */
    C0072l0 mo854L();

    /* JADX INFO: renamed from: V */
    void mo855V(long j5, long j6, long j7, float f2, int i5);

    /* JADX INFO: renamed from: Y */
    default long mo856Y() {
        return AbstractC1924f.m3500l(mo854L().m110n());
    }

    /* JADX INFO: renamed from: a0 */
    void mo858a0(long j5, float f2, long j6, AbstractC2902c abstractC2902c);

    /* JADX INFO: renamed from: c */
    default long mo859c() {
        return mo854L().m110n();
    }

    EnumC2017m getLayoutDirection();

    /* JADX INFO: renamed from: o */
    void mo862o(C2750i c2750i, long j5, AbstractC2902c abstractC2902c);

    /* JADX INFO: renamed from: o0 */
    void mo863o0(C2750i c2750i, AbstractC2758q abstractC2758q, float f2, AbstractC2902c abstractC2902c, int i5);

    /* JADX INFO: renamed from: t */
    void mo864t(AbstractC2758q abstractC2758q, long j5, long j6, long j7, float f2, AbstractC2902c abstractC2902c);

    /* JADX INFO: renamed from: u */
    void mo865u(C2747f c2747f, long j5, long j6, long j7, float f2, C2753l c2753l, int i5);
}
