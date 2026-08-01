package p000;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ac0 extends yb0 implements sd0 {

    /* JADX INFO: renamed from: r */
    public final qj0 f101r;

    /* JADX INFO: renamed from: t */
    public LinkedHashMap f103t;

    /* JADX INFO: renamed from: v */
    public yd0 f105v;

    /* JADX INFO: renamed from: w */
    public final ch0 f106w;

    /* JADX INFO: renamed from: s */
    public long f102s = 0;

    /* JADX INFO: renamed from: u */
    public final bc0 f104u = new bc0(this);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ac0(qj0 qj0Var) {
        this.f101r = qj0Var;
        ch0 ch0Var = jk0.f2910a;
        this.f106w = new ch0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v0 */
    public static final void m46v0(ac0 ac0Var, yd0 yd0Var) {
        LinkedHashMap linkedHashMap;
        if (yd0Var != null) {
            ac0Var.m5145Y((((long) yd0Var.mo669c()) & 4294967295L) | (((long) yd0Var.mo670e()) << 32));
        } else {
            ac0Var.m5145Y(0L);
        }
        if (!p30.m3002l(ac0Var.f105v, yd0Var) && yd0Var != null && ((((linkedHashMap = ac0Var.f103t) != null && !linkedHashMap.isEmpty()) || !yd0Var.mo667a().isEmpty()) && !p30.m3002l(yd0Var.mo667a(), ac0Var.f103t))) {
            ec0 ec0Var = ac0Var.f101r.f5180r.f396J.f1608q;
            ec0Var.getClass();
            ec0Var.f1388t.m496f();
            LinkedHashMap linkedHashMap2 = ac0Var.f103t;
            if (linkedHashMap2 == null) {
                linkedHashMap2 = new LinkedHashMap();
                ac0Var.f103t = linkedHashMap2;
            }
            linkedHashMap2.clear();
            linkedHashMap2.putAll(yd0Var.mo667a());
        }
        ac0Var.f105v = yd0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.xq0
    /* JADX INFO: renamed from: X */
    public final void mo47X(long j, float f, InterfaceC0742sw interfaceC0742sw) {
        m61x0(j);
        if (this.f7596m) {
            return;
        }
        mo60w0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0968ym
    /* JADX INFO: renamed from: b */
    public final float mo48b() {
        return this.f101r.mo48b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.l30
    public final k50 getLayoutDirection() {
        return this.f101r.f5180r.f389C;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0968ym
    /* JADX INFO: renamed from: h */
    public final float mo49h() {
        return this.f101r.mo49h();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.xq0, p000.sd0
    /* JADX INFO: renamed from: j */
    public final Object mo50j() {
        return this.f101r.mo50j();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.yb0
    /* JADX INFO: renamed from: k0 */
    public final yb0 mo51k0() {
        qj0 qj0Var = this.f101r.f5181s;
        if (qj0Var != null) {
            return qj0Var.mo435E0();
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.yb0
    /* JADX INFO: renamed from: l0 */
    public final i50 mo52l0() {
        return this.f104u;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.yb0, p000.l30
    /* JADX INFO: renamed from: m */
    public final boolean mo53m() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.yb0
    /* JADX INFO: renamed from: m0 */
    public final boolean mo54m0() {
        return this.f105v != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.yb0
    /* JADX INFO: renamed from: n0 */
    public final b60 mo55n0() {
        return this.f101r.f5180r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.yb0
    /* JADX INFO: renamed from: o0 */
    public final yd0 mo56o0() {
        yd0 yd0Var = this.f105v;
        if (yd0Var != null) {
            return yd0Var;
        }
        throw AbstractC0748t1.m4149g("LookaheadDelegate has not been measured yet when measureResult is requested.");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.yb0
    /* JADX INFO: renamed from: p0 */
    public final yb0 mo57p0() {
        qj0 qj0Var = this.f101r.f5182t;
        if (qj0Var != null) {
            return qj0Var.mo435E0();
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.yb0
    /* JADX INFO: renamed from: q0 */
    public final long mo58q0() {
        return this.f102s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.yb0
    /* JADX INFO: renamed from: u0 */
    public final void mo59u0() {
        mo47X(this.f102s, 0.0f, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w0 */
    public void mo60w0() {
        mo56o0().mo668b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x0 */
    public final void m61x0(long j) {
        if (!w20.m4833a(this.f102s, j)) {
            this.f102s = j;
            qj0 qj0Var = this.f101r;
            ec0 ec0Var = qj0Var.f5180r.f396J.f1608q;
            if (ec0Var != null) {
                ec0Var.m834e0();
            }
            yb0.m5231s0(qj0Var);
        }
        if (this.f7597n) {
            return;
        }
        m5234e0(mo56o0());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y0 */
    public final long m62y0(ac0 ac0Var, boolean z) {
        long jM4835c = 0;
        while (!this.equals(ac0Var)) {
            if (!this.f7595l || !z) {
                jM4835c = w20.m4835c(jM4835c, this.f102s);
            }
            qj0 qj0Var = this.f101r.f5182t;
            qj0Var.getClass();
            this = qj0Var.mo435E0();
            this.getClass();
        }
        return jM4835c;
    }
}
