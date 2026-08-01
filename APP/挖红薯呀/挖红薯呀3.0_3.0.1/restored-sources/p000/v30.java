package p000;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class v30 implements zd0, l30 {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ l30 f6392d;

    /* JADX INFO: renamed from: e */
    public final k50 f6393e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public v30(l30 l30Var, k50 k50Var) {
        this.f6392d = l30Var;
        this.f6393e = k50Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.zd0
    /* JADX INFO: renamed from: E */
    public final yd0 mo1278E(int i, int i2, Map map, InterfaceC0742sw interfaceC0742sw, InterfaceC0742sw interfaceC0742sw2) {
        if (i < 0) {
            i = 0;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            w10.m4824b("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new u30(i, i2, map, interfaceC0742sw);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0968ym
    /* JADX INFO: renamed from: F */
    public final int mo641F(float f) {
        return this.f6392d.mo641F(f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0968ym
    /* JADX INFO: renamed from: M */
    public final long mo644M(long j) {
        return this.f6392d.mo644M(j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0968ym
    /* JADX INFO: renamed from: P */
    public final float mo645P(long j) {
        return this.f6392d.mo645P(j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0968ym
    /* JADX INFO: renamed from: Z */
    public final long mo647Z(float f) {
        return this.f6392d.mo647Z(f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0968ym
    /* JADX INFO: renamed from: b */
    public final float mo48b() {
        return this.f6392d.mo48b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0968ym
    /* JADX INFO: renamed from: f0 */
    public final float mo652f0(int i) {
        return this.f6392d.mo652f0(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.l30
    public final k50 getLayoutDirection() {
        return this.f6393e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0968ym
    /* JADX INFO: renamed from: h */
    public final float mo49h() {
        return this.f6392d.mo49h();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0968ym
    /* JADX INFO: renamed from: i0 */
    public final float mo653i0(float f) {
        return this.f6392d.mo653i0(f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.l30
    /* JADX INFO: renamed from: m */
    public final boolean mo53m() {
        return this.f6392d.mo53m();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0968ym
    /* JADX INFO: renamed from: o */
    public final long mo187o(float f) {
        return this.f6392d.mo187o(f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0968ym
    /* JADX INFO: renamed from: p */
    public final float mo654p(float f) {
        return this.f6392d.mo654p(f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0968ym
    /* JADX INFO: renamed from: y */
    public final float mo188y(long j) {
        return this.f6392d.mo188y(j);
    }
}
