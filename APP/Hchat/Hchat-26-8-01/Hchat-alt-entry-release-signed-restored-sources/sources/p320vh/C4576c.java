package p320vh;

import androidx.lifecycle.C0119x;
import p020b5.C0184c;
import p071f1.C1008i0;
import p071f1.C1017n;
import p071f1.InterfaceC0998d0;
import p071f1.InterfaceC1026r0;
import p085fg.InterfaceC1231l;
import p293u2.InterfaceC4233c;

/* JADX INFO: renamed from: vh.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4576c implements InterfaceC0998d0 {

    /* JADX INFO: renamed from: g */
    public long f15070g;

    /* JADX INFO: renamed from: h */
    public float f15071h;

    /* JADX INFO: renamed from: i */
    public float f15072i;

    /* JADX INFO: renamed from: j */
    public float f15073j;

    /* JADX INFO: renamed from: k */
    public float f15074k;

    /* JADX INFO: renamed from: l */
    public float f15075l;

    /* JADX INFO: renamed from: m */
    public float[] f15076m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p071f1.InterfaceC0998d0
    /* JADX INFO: renamed from: Q0 */
    public final void mo2533Q0(InterfaceC1026r0 interfaceC1026r0) {
        interfaceC1026r0.getClass();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p071f1.InterfaceC0998d0
    /* JADX INFO: renamed from: a */
    public final long mo2535a() {
        return this.f15070g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p071f1.InterfaceC0998d0
    /* JADX INFO: renamed from: b */
    public final float mo2536b() {
        return this.f15073j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p293u2.InterfaceC4233c
    /* JADX INFO: renamed from: d */
    public final float mo1333d() {
        return this.f15071h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m9022e(C0119x c0119x, InterfaceC4233c interfaceC4233c, long j3, InterfaceC1231l interfaceC1231l) {
        C0184c c0184c = (C0184c) c0119x.f310h;
        interfaceC4233c.getClass();
        interfaceC1231l.getClass();
        if (j3 == 9205357640488583168L) {
            j3 = c0184c.m825v();
        }
        this.f15070g = j3;
        this.f15071h = interfaceC4233c.mo1333d();
        this.f15072i = interfaceC4233c.mo1335q0();
        interfaceC1231l.invoke(this);
        float f3 = this.f15075l;
        float f10 = this.f15073j;
        float f11 = this.f15074k;
        if (f3 == 0.0f) {
            if (f10 == 0.0f || f11 == 0.0f) {
                return;
            }
            c0119x.m587S(1.0f / f10, 1.0f / f11, 0L);
            return;
        }
        float[] fArrM2593a = this.f15076m;
        if (fArrM2593a == null) {
            fArrM2593a = C1008i0.m2593a();
            this.f15076m = fArrM2593a;
        }
        if (fArrM2593a.length < 16) {
            return;
        }
        double d10 = ((double) f3) * 0.017453292519943295d;
        float fSin = (float) Math.sin(d10);
        float fCos = (float) Math.cos(d10);
        float f12 = fCos * f10;
        float f13 = fSin * f11;
        float f14 = (-fSin) * f10;
        float f15 = fCos * f11;
        float f16 = (f12 * f15) - (f13 * f14);
        if (f16 == 0.0f) {
            return;
        }
        float f17 = 1.0f / f16;
        fArrM2593a[0] = f15 * f17;
        fArrM2593a[1] = (-f13) * f17;
        fArrM2593a[4] = (-f14) * f17;
        fArrM2593a[5] = f12 * f17;
        c0184c.m819p().mo2490h(fArrM2593a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p071f1.InterfaceC0998d0
    /* JADX INFO: renamed from: f */
    public final void mo2538f(float f3) {
        this.f15075l = f3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p071f1.InterfaceC0998d0
    /* JADX INFO: renamed from: i */
    public final void mo2541i(float f3) {
        this.f15074k = f3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p071f1.InterfaceC0998d0
    /* JADX INFO: renamed from: q */
    public final void mo2547q(float f3) {
        this.f15073j = f3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p293u2.InterfaceC4233c
    /* JADX INFO: renamed from: q0 */
    public final float mo1335q0() {
        return this.f15072i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p071f1.InterfaceC0998d0
    /* JADX INFO: renamed from: v */
    public final float mo2552v() {
        return this.f15074k;
    }

    @Override // p071f1.InterfaceC0998d0
    /* JADX INFO: renamed from: I */
    public final void mo2532I() {
    }

    @Override // p071f1.InterfaceC0998d0
    /* JADX INFO: renamed from: l */
    public final void mo2543l() {
    }

    @Override // p071f1.InterfaceC0998d0
    /* JADX INFO: renamed from: o */
    public final void mo2545o() {
    }

    @Override // p071f1.InterfaceC0998d0
    /* JADX INFO: renamed from: H0 */
    public final void mo2531H0(long j3) {
    }

    @Override // p071f1.InterfaceC0998d0
    /* JADX INFO: renamed from: Y */
    public final void mo2534Y(int i9) {
    }

    @Override // p071f1.InterfaceC0998d0
    /* JADX INFO: renamed from: c */
    public final void mo2537c(float f3) {
    }

    @Override // p071f1.InterfaceC0998d0
    /* JADX INFO: renamed from: g */
    public final void mo2539g(float f3) {
    }

    @Override // p071f1.InterfaceC0998d0
    /* JADX INFO: renamed from: h */
    public final void mo2540h(int i9) {
    }

    @Override // p071f1.InterfaceC0998d0
    /* JADX INFO: renamed from: k */
    public final void mo2542k(C1017n c1017n) {
    }

    @Override // p071f1.InterfaceC0998d0
    /* JADX INFO: renamed from: n */
    public final void mo2544n(float f3) {
    }

    @Override // p071f1.InterfaceC0998d0
    /* JADX INFO: renamed from: p */
    public final void mo2546p(long j3) {
    }

    @Override // p071f1.InterfaceC0998d0
    /* JADX INFO: renamed from: r */
    public final void mo2548r(boolean z9) {
    }

    @Override // p071f1.InterfaceC0998d0
    /* JADX INFO: renamed from: s */
    public final void mo2549s(float f3) {
    }

    @Override // p071f1.InterfaceC0998d0
    /* JADX INFO: renamed from: t */
    public final void mo2550t(long j3) {
    }

    @Override // p071f1.InterfaceC0998d0
    /* JADX INFO: renamed from: u */
    public final void mo2551u(float f3) {
    }
}
