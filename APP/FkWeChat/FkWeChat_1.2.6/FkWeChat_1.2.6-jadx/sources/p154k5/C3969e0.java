package p154k5;

import bsh.C1259t2;
import p239q5.C6268s;
import p239q5.C6274y;

/* JADX INFO: renamed from: k5.e0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3969e0 extends AbstractC3980n {

    /* JADX INFO: renamed from: e */
    public C3970f f11469e;

    public C3969e0(C3978l c3978l, C6274y c6274y, C6268s c6268s, C3970f c3970f) {
        super(c3978l, c6274y, c6268s);
        if (c3970f != null) {
            this.f11469e = c3970f;
        } else {
            C1259t2.m5095a("target == null");
            throw null;
        }
    }

    /* JADX INFO: renamed from: A */
    public C3970f m15742A() {
        return this.f11469e;
    }

    /* JADX INFO: renamed from: B */
    public int m15743B() {
        return this.f11469e.m15772h();
    }

    /* JADX INFO: renamed from: C */
    public int m15744C() {
        return this.f11469e.m15772h() - m15772h();
    }

    /* JADX INFO: renamed from: D */
    public boolean m15745D() {
        return m15779o() && this.f11469e.m15779o();
    }

    /* JADX INFO: renamed from: E */
    public C3969e0 m15746E(C3970f c3970f) {
        return new C3969e0(m15776l().m15797f(), m15777m(), m15778n(), c3970f);
    }

    @Override // p154k5.AbstractC3976j
    /* JADX INFO: renamed from: a */
    public String mo15678a() {
        C3970f c3970f = this.f11469e;
        return c3970f == null ? "????" : c3970f.m15781q();
    }

    @Override // p154k5.AbstractC3976j
    /* JADX INFO: renamed from: w */
    public AbstractC3976j mo15716w(C3978l c3978l) {
        return new C3969e0(c3978l, m15777m(), m15778n(), this.f11469e);
    }

    @Override // p154k5.AbstractC3976j
    /* JADX INFO: renamed from: y */
    public AbstractC3976j mo15681y(C6268s c6268s) {
        return new C3969e0(m15776l(), m15777m(), c6268s, this.f11469e);
    }
}
