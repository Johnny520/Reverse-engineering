package p265s1;

import okhttp3.internal.http2.Http2;
import p024b9.AbstractC1061t;
import p121i3.AbstractC3177g;
import p121i3.EnumC3191u;
import p121i3.InterfaceC3175e;
import p250r1.C6461k;

/* JADX INFO: renamed from: s1.d3 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C7065d3 implements InterfaceC7079g2 {

    /* JADX INFO: renamed from: A */
    public float f23495A;

    /* JADX INFO: renamed from: B */
    public float f23496B;

    /* JADX INFO: renamed from: F */
    public boolean f23500F;

    /* JADX INFO: renamed from: K */
    public AbstractC7133r1 f23505K;

    /* JADX INFO: renamed from: M */
    public AbstractC7124p2 f23507M;

    /* JADX INFO: renamed from: q */
    public int f23508q;

    /* JADX INFO: renamed from: u */
    public float f23512u;

    /* JADX INFO: renamed from: v */
    public float f23513v;

    /* JADX INFO: renamed from: w */
    public float f23514w;

    /* JADX INFO: renamed from: z */
    public float f23517z;

    /* JADX INFO: renamed from: r */
    public float f23509r = 1.0f;

    /* JADX INFO: renamed from: s */
    public float f23510s = 1.0f;

    /* JADX INFO: renamed from: t */
    public float f23511t = 1.0f;

    /* JADX INFO: renamed from: x */
    public long f23515x = AbstractC7084h2.m27896a();

    /* JADX INFO: renamed from: y */
    public long f23516y = AbstractC7084h2.m27896a();

    /* JADX INFO: renamed from: C */
    public float f23497C = 8.0f;

    /* JADX INFO: renamed from: D */
    public long f23498D = C7130q3.f23659b.m28168a();

    /* JADX INFO: renamed from: E */
    public InterfaceC7090i3 f23499E = AbstractC7055b3.m27770a();

    /* JADX INFO: renamed from: G */
    public int f23501G = AbstractC7049a2.f23483a.m27750a();

    /* JADX INFO: renamed from: H */
    public long f23502H = C6461k.f20335b.m25626a();

    /* JADX INFO: renamed from: I */
    public InterfaceC3175e f23503I = AbstractC3177g.m11997b(1.0f, 0.0f, 2, null);

    /* JADX INFO: renamed from: J */
    public EnumC3191u f23504J = EnumC3191u.f8484q;

    /* JADX INFO: renamed from: L */
    public int f23506L = AbstractC7168z0.f23700a.m28306B();

    @Override // p265s1.InterfaceC7079g2
    /* JADX INFO: renamed from: A */
    public void mo27780A(float f10) {
        if (this.f23509r == f10) {
            return;
        }
        this.f23508q |= 1;
        this.f23509r = f10;
    }

    /* JADX INFO: renamed from: B */
    public AbstractC7060c3 m27781B() {
        return null;
    }

    @Override // p265s1.InterfaceC7079g2
    /* JADX INFO: renamed from: B0 */
    public void mo27782B0(int i10) {
        if (AbstractC7049a2.m27747e(this.f23501G, i10)) {
            return;
        }
        this.f23508q |= 32768;
        this.f23501G = i10;
    }

    @Override // p265s1.InterfaceC7079g2
    /* JADX INFO: renamed from: C */
    public float mo27783C() {
        return this.f23497C;
    }

    @Override // p265s1.InterfaceC7079g2
    /* JADX INFO: renamed from: D */
    public float mo27784D() {
        return this.f23512u;
    }

    @Override // p265s1.InterfaceC7079g2
    /* JADX INFO: renamed from: E */
    public void mo27785E(boolean z10) {
        if (this.f23500F != z10) {
            this.f23508q |= Http2.INITIAL_MAX_FRAME_SIZE;
            this.f23500F = z10;
        }
    }

    @Override // p265s1.InterfaceC7079g2
    /* JADX INFO: renamed from: F */
    public float mo27786F() {
        return this.f23517z;
    }

    /* JADX INFO: renamed from: G */
    public float m27787G() {
        return this.f23514w;
    }

    @Override // p265s1.InterfaceC7079g2
    /* JADX INFO: renamed from: H */
    public void mo27788H(float f10) {
        if (this.f23512u == f10) {
            return;
        }
        this.f23508q |= 8;
        this.f23512u = f10;
    }

    @Override // p265s1.InterfaceC7079g2
    /* JADX INFO: renamed from: I */
    public void mo27789I(long j10) {
        if (C7128q1.m28131q(this.f23516y, j10)) {
            return;
        }
        this.f23508q |= 128;
        this.f23516y = j10;
    }

    @Override // p265s1.InterfaceC7079g2
    /* JADX INFO: renamed from: J */
    public void mo27790J(AbstractC7060c3 abstractC7060c3) {
        if (AbstractC1061t.m3842c(null, abstractC7060c3)) {
            return;
        }
        this.f23508q |= 131072;
    }

    @Override // p265s1.InterfaceC7079g2
    /* JADX INFO: renamed from: K */
    public void mo27791K(float f10) {
        if (this.f23497C == f10) {
            return;
        }
        this.f23508q |= 2048;
        this.f23497C = f10;
    }

    @Override // p265s1.InterfaceC7079g2
    /* JADX INFO: renamed from: L */
    public float mo27792L() {
        return this.f23510s;
    }

    @Override // p265s1.InterfaceC7079g2
    /* JADX INFO: renamed from: M */
    public void mo27793M(float f10) {
        if (this.f23517z == f10) {
            return;
        }
        this.f23508q |= 256;
        this.f23517z = f10;
    }

    /* JADX INFO: renamed from: O */
    public InterfaceC7090i3 m27794O() {
        return this.f23499E;
    }

    /* JADX INFO: renamed from: P */
    public long m27795P() {
        return this.f23516y;
    }

    /* JADX INFO: renamed from: Q */
    public final void m27796Q() {
        mo27780A(1.0f);
        mo27814p(1.0f);
        mo27804e(1.0f);
        mo27788H(0.0f);
        mo27812m(0.0f);
        mo27809j(0.0f);
        mo27825y(AbstractC7084h2.m27896a());
        mo27789I(AbstractC7084h2.m27896a());
        mo27793M(0.0f);
        mo27807h(0.0f);
        mo27810k(0.0f);
        mo27791K(8.0f);
        mo27826y1(C7130q3.f23659b.m28168a());
        mo27817r1(AbstractC7055b3.m27770a());
        mo27785E(false);
        mo27790J(null);
        mo27805f(null);
        mo27802c(AbstractC7168z0.f23700a.m28306B());
        mo27782B0(AbstractC7049a2.f23483a.m27750a());
        m27799W(C6461k.f20335b.m25626a());
        this.f23507M = null;
        this.f23508q = 0;
    }

    /* JADX INFO: renamed from: S */
    public final void m27797S(InterfaceC3175e interfaceC3175e) {
        this.f23503I = interfaceC3175e;
    }

    /* JADX INFO: renamed from: T */
    public final void m27798T(EnumC3191u enumC3191u) {
        this.f23504J = enumC3191u;
    }

    /* JADX INFO: renamed from: W */
    public void m27799W(long j10) {
        this.f23502H = j10;
    }

    /* JADX INFO: renamed from: X */
    public final void m27800X() {
        this.f23507M = m27794O().mo4a(mo27801b(), this.f23504J, this.f23503I);
    }

    @Override // p265s1.InterfaceC7079g2
    /* JADX INFO: renamed from: b */
    public long mo27801b() {
        return this.f23502H;
    }

    @Override // p265s1.InterfaceC7079g2
    /* JADX INFO: renamed from: c */
    public void mo27802c(int i10) {
        if (AbstractC7168z0.m28276E(this.f23506L, i10)) {
            return;
        }
        this.f23508q |= 524288;
        this.f23506L = i10;
    }

    @Override // p121i3.InterfaceC3183m
    /* JADX INFO: renamed from: c1 */
    public float mo1231c1() {
        return this.f23503I.mo1231c1();
    }

    /* JADX INFO: renamed from: d */
    public float m27803d() {
        return this.f23511t;
    }

    @Override // p265s1.InterfaceC7079g2
    /* JADX INFO: renamed from: e */
    public void mo27804e(float f10) {
        if (this.f23511t == f10) {
            return;
        }
        this.f23508q |= 4;
        this.f23511t = f10;
    }

    @Override // p265s1.InterfaceC7079g2
    /* JADX INFO: renamed from: f */
    public void mo27805f(AbstractC7133r1 abstractC7133r1) {
        if (AbstractC1061t.m3842c(this.f23505K, abstractC7133r1)) {
            return;
        }
        this.f23508q |= 262144;
        this.f23505K = abstractC7133r1;
    }

    /* JADX INFO: renamed from: g */
    public long m27806g() {
        return this.f23515x;
    }

    @Override // p121i3.InterfaceC3175e
    public float getDensity() {
        return this.f23503I.getDensity();
    }

    @Override // p265s1.InterfaceC7079g2
    /* JADX INFO: renamed from: h */
    public void mo27807h(float f10) {
        if (this.f23495A == f10) {
            return;
        }
        this.f23508q |= 512;
        this.f23495A = f10;
    }

    @Override // p265s1.InterfaceC7079g2
    /* JADX INFO: renamed from: i */
    public float mo27808i() {
        return this.f23509r;
    }

    @Override // p265s1.InterfaceC7079g2
    /* JADX INFO: renamed from: j */
    public void mo27809j(float f10) {
        if (this.f23514w == f10) {
            return;
        }
        this.f23508q |= 32;
        this.f23514w = f10;
    }

    @Override // p265s1.InterfaceC7079g2
    /* JADX INFO: renamed from: k */
    public void mo27810k(float f10) {
        if (this.f23496B == f10) {
            return;
        }
        this.f23508q |= 1024;
        this.f23496B = f10;
    }

    /* JADX INFO: renamed from: l */
    public int m27811l() {
        return this.f23506L;
    }

    @Override // p265s1.InterfaceC7079g2
    /* JADX INFO: renamed from: m */
    public void mo27812m(float f10) {
        if (this.f23513v == f10) {
            return;
        }
        this.f23508q |= 16;
        this.f23513v = f10;
    }

    /* JADX INFO: renamed from: o */
    public boolean m27813o() {
        return this.f23500F;
    }

    @Override // p265s1.InterfaceC7079g2
    /* JADX INFO: renamed from: p */
    public void mo27814p(float f10) {
        if (this.f23510s == f10) {
            return;
        }
        this.f23508q |= 2;
        this.f23510s = f10;
    }

    /* JADX INFO: renamed from: q */
    public AbstractC7133r1 m27815q() {
        return this.f23505K;
    }

    @Override // p265s1.InterfaceC7079g2
    /* JADX INFO: renamed from: r */
    public float mo27816r() {
        return this.f23495A;
    }

    @Override // p265s1.InterfaceC7079g2
    /* JADX INFO: renamed from: r1 */
    public void mo27817r1(InterfaceC7090i3 interfaceC7090i3) {
        if (AbstractC1061t.m3842c(this.f23499E, interfaceC7090i3)) {
            return;
        }
        this.f23508q |= 8192;
        this.f23499E = interfaceC7090i3;
    }

    @Override // p265s1.InterfaceC7079g2
    /* JADX INFO: renamed from: s */
    public float mo27818s() {
        return this.f23496B;
    }

    /* JADX INFO: renamed from: t */
    public int m27819t() {
        return this.f23501G;
    }

    @Override // p265s1.InterfaceC7079g2
    /* JADX INFO: renamed from: t1 */
    public long mo27820t1() {
        return this.f23498D;
    }

    /* JADX INFO: renamed from: u */
    public final InterfaceC3175e m27821u() {
        return this.f23503I;
    }

    /* JADX INFO: renamed from: v */
    public final EnumC3191u m27822v() {
        return this.f23504J;
    }

    @Override // p265s1.InterfaceC7079g2
    /* JADX INFO: renamed from: w */
    public float mo27823w() {
        return this.f23513v;
    }

    /* JADX INFO: renamed from: x */
    public final int m27824x() {
        return this.f23508q;
    }

    @Override // p265s1.InterfaceC7079g2
    /* JADX INFO: renamed from: y */
    public void mo27825y(long j10) {
        if (C7128q1.m28131q(this.f23515x, j10)) {
            return;
        }
        this.f23508q |= 64;
        this.f23515x = j10;
    }

    @Override // p265s1.InterfaceC7079g2
    /* JADX INFO: renamed from: y1 */
    public void mo27826y1(long j10) {
        if (C7130q3.m28162e(this.f23498D, j10)) {
            return;
        }
        this.f23508q |= 4096;
        this.f23498D = j10;
    }

    /* JADX INFO: renamed from: z */
    public final AbstractC7124p2 m27827z() {
        return this.f23507M;
    }
}
