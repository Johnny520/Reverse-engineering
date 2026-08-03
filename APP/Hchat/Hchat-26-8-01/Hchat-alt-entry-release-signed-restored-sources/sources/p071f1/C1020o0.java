package p071f1;

import bsh.org.objectweb.asm.Opcodes;
import gg.AbstractC1416l;
import p080fb.AbstractC1184v0;
import p293u2.EnumC4243m;
import p293u2.InterfaceC4233c;

/* JADX INFO: renamed from: f1.o0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1020o0 implements InterfaceC0998d0 {

    /* JADX INFO: renamed from: A */
    public AbstractC0996c0 f3206A;

    /* JADX INFO: renamed from: g */
    public int f3207g;

    /* JADX INFO: renamed from: h */
    public float f3208h = 1.0f;

    /* JADX INFO: renamed from: i */
    public float f3209i = 1.0f;

    /* JADX INFO: renamed from: j */
    public float f3210j = 1.0f;

    /* JADX INFO: renamed from: k */
    public float f3211k;

    /* JADX INFO: renamed from: l */
    public float f3212l;

    /* JADX INFO: renamed from: m */
    public float f3213m;

    /* JADX INFO: renamed from: n */
    public long f3214n;

    /* JADX INFO: renamed from: o */
    public long f3215o;

    /* JADX INFO: renamed from: p */
    public float f3216p;

    /* JADX INFO: renamed from: q */
    public float f3217q;

    /* JADX INFO: renamed from: r */
    public long f3218r;

    /* JADX INFO: renamed from: s */
    public InterfaceC1026r0 f3219s;

    /* JADX INFO: renamed from: t */
    public boolean f3220t;

    /* JADX INFO: renamed from: u */
    public int f3221u;

    /* JADX INFO: renamed from: v */
    public long f3222v;

    /* JADX INFO: renamed from: w */
    public InterfaceC4233c f3223w;

    /* JADX INFO: renamed from: x */
    public EnumC4243m f3224x;

    /* JADX INFO: renamed from: y */
    public C1017n f3225y;

    /* JADX INFO: renamed from: z */
    public int f3226z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1020o0() {
        long j3 = AbstractC1000e0.f3169a;
        this.f3214n = j3;
        this.f3215o = j3;
        this.f3217q = 8.0f;
        this.f3218r = C1032u0.f3254b;
        this.f3219s = AbstractC0996c0.f3162b;
        this.f3221u = 0;
        this.f3222v = 9205357640488583168L;
        this.f3223w = AbstractC1184v0.m3191a();
        this.f3224x = EnumC4243m.f13919g;
        this.f3226z = 3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p071f1.InterfaceC0998d0
    /* JADX INFO: renamed from: H0 */
    public final void mo2531H0(long j3) {
        if (C1032u0.m2631a(this.f3218r, j3)) {
            return;
        }
        this.f3207g |= 4096;
        this.f3218r = j3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p071f1.InterfaceC0998d0
    /* JADX INFO: renamed from: Q0 */
    public final void mo2533Q0(InterfaceC1026r0 interfaceC1026r0) {
        if (AbstractC1416l.m3825a(this.f3219s, interfaceC1026r0)) {
            return;
        }
        this.f3207g |= 8192;
        this.f3219s = interfaceC1026r0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p071f1.InterfaceC0998d0
    /* JADX INFO: renamed from: Y */
    public final void mo2534Y(int i9) {
        if (this.f3221u == i9) {
            return;
        }
        this.f3207g |= 32768;
        this.f3221u = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p071f1.InterfaceC0998d0
    /* JADX INFO: renamed from: a */
    public final long mo2535a() {
        return this.f3222v;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p071f1.InterfaceC0998d0
    /* JADX INFO: renamed from: b */
    public final float mo2536b() {
        return this.f3208h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p071f1.InterfaceC0998d0
    /* JADX INFO: renamed from: c */
    public final void mo2537c(float f3) {
        if (this.f3213m == f3) {
            return;
        }
        this.f3207g |= 32;
        this.f3213m = f3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p293u2.InterfaceC4233c
    /* JADX INFO: renamed from: d */
    public final float mo1333d() {
        return this.f3223w.mo1333d();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m2627e() {
        mo2547q(1.0f);
        mo2541i(1.0f);
        mo2544n(1.0f);
        mo2549s(0.0f);
        mo2539g(0.0f);
        mo2537c(0.0f);
        long j3 = AbstractC1000e0.f3169a;
        mo2546p(j3);
        mo2550t(j3);
        mo2538f(0.0f);
        mo2551u(8.0f);
        mo2531H0(C1032u0.f3254b);
        mo2533Q0(AbstractC0996c0.f3162b);
        mo2548r(false);
        mo2542k(null);
        mo2540h(3);
        mo2534Y(0);
        this.f3222v = 9205357640488583168L;
        this.f3206A = null;
        this.f3207g = 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p071f1.InterfaceC0998d0
    /* JADX INFO: renamed from: f */
    public final void mo2538f(float f3) {
        if (this.f3216p == f3) {
            return;
        }
        this.f3207g |= 1024;
        this.f3216p = f3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p071f1.InterfaceC0998d0
    /* JADX INFO: renamed from: g */
    public final void mo2539g(float f3) {
        if (this.f3212l == f3) {
            return;
        }
        this.f3207g |= 16;
        this.f3212l = f3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p071f1.InterfaceC0998d0
    /* JADX INFO: renamed from: h */
    public final void mo2540h(int i9) {
        if (this.f3226z == i9) {
            return;
        }
        this.f3207g |= 524288;
        this.f3226z = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p071f1.InterfaceC0998d0
    /* JADX INFO: renamed from: i */
    public final void mo2541i(float f3) {
        if (this.f3209i == f3) {
            return;
        }
        this.f3207g |= 2;
        this.f3209i = f3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p071f1.InterfaceC0998d0
    /* JADX INFO: renamed from: k */
    public final void mo2542k(C1017n c1017n) {
        if (AbstractC1416l.m3825a(this.f3225y, c1017n)) {
            return;
        }
        this.f3207g |= Opcodes.ASM4;
        this.f3225y = c1017n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p071f1.InterfaceC0998d0
    /* JADX INFO: renamed from: n */
    public final void mo2544n(float f3) {
        if (this.f3210j == f3) {
            return;
        }
        this.f3207g |= 4;
        this.f3210j = f3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p071f1.InterfaceC0998d0
    /* JADX INFO: renamed from: p */
    public final void mo2546p(long j3) {
        if (C1034w.m2635c(this.f3214n, j3)) {
            return;
        }
        this.f3207g |= 64;
        this.f3214n = j3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p071f1.InterfaceC0998d0
    /* JADX INFO: renamed from: q */
    public final void mo2547q(float f3) {
        if (this.f3208h == f3) {
            return;
        }
        this.f3207g |= 1;
        this.f3208h = f3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p293u2.InterfaceC4233c
    /* JADX INFO: renamed from: q0 */
    public final float mo1335q0() {
        return this.f3223w.mo1335q0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p071f1.InterfaceC0998d0
    /* JADX INFO: renamed from: r */
    public final void mo2548r(boolean z9) {
        if (this.f3220t != z9) {
            this.f3207g |= 16384;
            this.f3220t = z9;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p071f1.InterfaceC0998d0
    /* JADX INFO: renamed from: s */
    public final void mo2549s(float f3) {
        if (this.f3211k == f3) {
            return;
        }
        this.f3207g |= 8;
        this.f3211k = f3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p071f1.InterfaceC0998d0
    /* JADX INFO: renamed from: t */
    public final void mo2550t(long j3) {
        if (C1034w.m2635c(this.f3215o, j3)) {
            return;
        }
        this.f3207g |= 128;
        this.f3215o = j3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p071f1.InterfaceC0998d0
    /* JADX INFO: renamed from: u */
    public final void mo2551u(float f3) {
        if (this.f3217q == f3) {
            return;
        }
        this.f3207g |= Opcodes.ACC_STRICT;
        this.f3217q = f3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p071f1.InterfaceC0998d0
    /* JADX INFO: renamed from: v */
    public final float mo2552v() {
        return this.f3209i;
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
}
