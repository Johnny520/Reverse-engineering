package p189n;

import android.content.Context;
import android.widget.EdgeEffect;
import p121i3.C3189s;
import p219p.EnumC5898w0;

/* JADX INFO: renamed from: n.u0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C5287u0 {

    /* JADX INFO: renamed from: a */
    public final Context f16242a;

    /* JADX INFO: renamed from: b */
    public final int f16243b;

    /* JADX INFO: renamed from: c */
    public long f16244c = C3189s.f8481b.m12088a();

    /* JADX INFO: renamed from: d */
    public EdgeEffect f16245d;

    /* JADX INFO: renamed from: e */
    public EdgeEffect f16246e;

    /* JADX INFO: renamed from: f */
    public EdgeEffect f16247f;

    /* JADX INFO: renamed from: g */
    public EdgeEffect f16248g;

    /* JADX INFO: renamed from: h */
    public EdgeEffect f16249h;

    /* JADX INFO: renamed from: i */
    public EdgeEffect f16250i;

    /* JADX INFO: renamed from: j */
    public EdgeEffect f16251j;

    /* JADX INFO: renamed from: k */
    public EdgeEffect f16252k;

    public C5287u0(Context context, int i10) {
        this.f16242a = context;
        this.f16243b = i10;
    }

    /* JADX INFO: renamed from: A */
    public final boolean m21566A() {
        return m21589y(this.f16249h);
    }

    /* JADX INFO: renamed from: B */
    public final boolean m21567B() {
        return m21589y(this.f16245d);
    }

    /* JADX INFO: renamed from: C */
    public final void m21568C(long j10) {
        this.f16244c = j10;
        EdgeEffect edgeEffect = this.f16245d;
        if (edgeEffect != null) {
            edgeEffect.setSize((int) (j10 >> 32), (int) (j10 & 4294967295L));
        }
        EdgeEffect edgeEffect2 = this.f16246e;
        if (edgeEffect2 != null) {
            edgeEffect2.setSize((int) (j10 >> 32), (int) (j10 & 4294967295L));
        }
        EdgeEffect edgeEffect3 = this.f16247f;
        if (edgeEffect3 != null) {
            edgeEffect3.setSize((int) (j10 & 4294967295L), (int) (j10 >> 32));
        }
        EdgeEffect edgeEffect4 = this.f16248g;
        if (edgeEffect4 != null) {
            edgeEffect4.setSize((int) (j10 & 4294967295L), (int) (j10 >> 32));
        }
        EdgeEffect edgeEffect5 = this.f16249h;
        if (edgeEffect5 != null) {
            edgeEffect5.setSize((int) (j10 >> 32), (int) (j10 & 4294967295L));
        }
        EdgeEffect edgeEffect6 = this.f16250i;
        if (edgeEffect6 != null) {
            edgeEffect6.setSize((int) (j10 >> 32), (int) (j10 & 4294967295L));
        }
        EdgeEffect edgeEffect7 = this.f16251j;
        if (edgeEffect7 != null) {
            edgeEffect7.setSize((int) (j10 & 4294967295L), (int) (j10 >> 32));
        }
        EdgeEffect edgeEffect8 = this.f16252k;
        if (edgeEffect8 != null) {
            edgeEffect8.setSize((int) (4294967295L & j10), (int) (j10 >> 32));
        }
    }

    /* JADX INFO: renamed from: e */
    public final EdgeEffect m21569e(EnumC5898w0 enumC5898w0) {
        EdgeEffect edgeEffectM21543b = C5278s0.f16212a.m21543b(this.f16242a);
        edgeEffectM21543b.setColor(this.f16243b);
        if (!C3189s.m12084e(this.f16244c, C3189s.f8481b.m12088a())) {
            EnumC5898w0 enumC5898w02 = EnumC5898w0.f18786q;
            long j10 = this.f16244c;
            if (enumC5898w0 == enumC5898w02) {
                edgeEffectM21543b.setSize((int) (j10 >> 32), (int) (j10 & 4294967295L));
                return edgeEffectM21543b;
            }
            edgeEffectM21543b.setSize((int) (4294967295L & j10), (int) (j10 >> 32));
        }
        return edgeEffectM21543b;
    }

    /* JADX INFO: renamed from: f */
    public final void m21570f() {
        EdgeEffect edgeEffect = this.f16245d;
        if (edgeEffect != null) {
            edgeEffect.finish();
        }
        EdgeEffect edgeEffect2 = this.f16246e;
        if (edgeEffect2 != null) {
            edgeEffect2.finish();
        }
        EdgeEffect edgeEffect3 = this.f16247f;
        if (edgeEffect3 != null) {
            edgeEffect3.finish();
        }
        EdgeEffect edgeEffect4 = this.f16248g;
        if (edgeEffect4 != null) {
            edgeEffect4.finish();
        }
        EdgeEffect edgeEffect5 = this.f16249h;
        if (edgeEffect5 != null) {
            edgeEffect5.finish();
        }
        EdgeEffect edgeEffect6 = this.f16250i;
        if (edgeEffect6 != null) {
            edgeEffect6.finish();
        }
        EdgeEffect edgeEffect7 = this.f16251j;
        if (edgeEffect7 != null) {
            edgeEffect7.finish();
        }
        EdgeEffect edgeEffect8 = this.f16252k;
        if (edgeEffect8 != null) {
            edgeEffect8.finish();
        }
    }

    /* JADX INFO: renamed from: g */
    public final EdgeEffect m21571g() {
        EdgeEffect edgeEffect = this.f16246e;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectM21569e = m21569e(EnumC5898w0.f18786q);
        this.f16246e = edgeEffectM21569e;
        return edgeEffectM21569e;
    }

    /* JADX INFO: renamed from: h */
    public final EdgeEffect m21572h() {
        EdgeEffect edgeEffect = this.f16250i;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectM21569e = m21569e(EnumC5898w0.f18786q);
        this.f16250i = edgeEffectM21569e;
        return edgeEffectM21569e;
    }

    /* JADX INFO: renamed from: i */
    public final EdgeEffect m21573i() {
        EdgeEffect edgeEffect = this.f16247f;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectM21569e = m21569e(EnumC5898w0.f18787r);
        this.f16247f = edgeEffectM21569e;
        return edgeEffectM21569e;
    }

    /* JADX INFO: renamed from: j */
    public final EdgeEffect m21574j() {
        EdgeEffect edgeEffect = this.f16251j;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectM21569e = m21569e(EnumC5898w0.f18787r);
        this.f16251j = edgeEffectM21569e;
        return edgeEffectM21569e;
    }

    /* JADX INFO: renamed from: k */
    public final EdgeEffect m21575k() {
        EdgeEffect edgeEffect = this.f16248g;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectM21569e = m21569e(EnumC5898w0.f18787r);
        this.f16248g = edgeEffectM21569e;
        return edgeEffectM21569e;
    }

    /* JADX INFO: renamed from: l */
    public final EdgeEffect m21576l() {
        EdgeEffect edgeEffect = this.f16252k;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectM21569e = m21569e(EnumC5898w0.f18787r);
        this.f16252k = edgeEffectM21569e;
        return edgeEffectM21569e;
    }

    /* JADX INFO: renamed from: m */
    public final EdgeEffect m21577m() {
        EdgeEffect edgeEffect = this.f16245d;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectM21569e = m21569e(EnumC5898w0.f18786q);
        this.f16245d = edgeEffectM21569e;
        return edgeEffectM21569e;
    }

    /* JADX INFO: renamed from: n */
    public final EdgeEffect m21578n() {
        EdgeEffect edgeEffect = this.f16249h;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectM21569e = m21569e(EnumC5898w0.f18786q);
        this.f16249h = edgeEffectM21569e;
        return edgeEffectM21569e;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m21579o(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !edgeEffect.isFinished();
    }

    /* JADX INFO: renamed from: p */
    public final boolean m21580p() {
        return m21579o(this.f16246e);
    }

    /* JADX INFO: renamed from: q */
    public final boolean m21581q() {
        return m21589y(this.f16250i);
    }

    /* JADX INFO: renamed from: r */
    public final boolean m21582r() {
        return m21589y(this.f16246e);
    }

    /* JADX INFO: renamed from: s */
    public final boolean m21583s() {
        return m21579o(this.f16247f);
    }

    /* JADX INFO: renamed from: t */
    public final boolean m21584t() {
        return m21589y(this.f16251j);
    }

    /* JADX INFO: renamed from: u */
    public final boolean m21585u() {
        return m21589y(this.f16247f);
    }

    /* JADX INFO: renamed from: v */
    public final boolean m21586v() {
        return m21579o(this.f16248g);
    }

    /* JADX INFO: renamed from: w */
    public final boolean m21587w() {
        return m21589y(this.f16252k);
    }

    /* JADX INFO: renamed from: x */
    public final boolean m21588x() {
        return m21589y(this.f16248g);
    }

    /* JADX INFO: renamed from: y */
    public final boolean m21589y(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !(C5278s0.f16212a.m21544c(edgeEffect) == 0.0f);
    }

    /* JADX INFO: renamed from: z */
    public final boolean m21590z() {
        return m21579o(this.f16245d);
    }
}
