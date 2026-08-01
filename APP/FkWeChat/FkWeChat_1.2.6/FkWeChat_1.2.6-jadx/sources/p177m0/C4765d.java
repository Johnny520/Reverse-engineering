package p177m0;

import p004a3.AbstractC0042h;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p080f9.AbstractC2368o;
import p104h3.AbstractC2869v;
import p121i3.AbstractC3174d;
import p121i3.AbstractC3177g;
import p121i3.C3173c;
import p121i3.EnumC3191u;
import p121i3.InterfaceC3175e;
import p185m8.AbstractC5114x;
import p319w2.AbstractC9039a0;
import p319w2.AbstractC9152w3;
import p319w2.C9147v3;

/* JADX INFO: renamed from: m0.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4765d {

    /* JADX INFO: renamed from: h */
    public static final a f14101h = new a(null);

    /* JADX INFO: renamed from: i */
    public static final int f14102i = 8;

    /* JADX INFO: renamed from: j */
    public static C4765d f14103j;

    /* JADX INFO: renamed from: a */
    public final EnumC3191u f14104a;

    /* JADX INFO: renamed from: b */
    public final C9147v3 f14105b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC3175e f14106c;

    /* JADX INFO: renamed from: d */
    public final AbstractC0042h.b f14107d;

    /* JADX INFO: renamed from: e */
    public final C9147v3 f14108e;

    /* JADX INFO: renamed from: f */
    public float f14109f = Float.NaN;

    /* JADX INFO: renamed from: g */
    public float f14110g = Float.NaN;

    public C4765d(EnumC3191u enumC3191u, C9147v3 c9147v3, InterfaceC3175e interfaceC3175e, AbstractC0042h.b bVar) {
        this.f14104a = enumC3191u;
        this.f14105b = c9147v3;
        this.f14106c = interfaceC3175e;
        this.f14107d = bVar;
        this.f14108e = AbstractC9152w3.m35601d(c9147v3, enumC3191u);
    }

    /* JADX INFO: renamed from: c */
    public final long m19053c(long j10, int i10) {
        float f10 = this.f14110g;
        float f11 = this.f14109f;
        if (Float.isNaN(f10) || Float.isNaN(f11)) {
            String str = AbstractC4767e.f14127a;
            C9147v3 c9147v3 = this.f14108e;
            long jM11985b = AbstractC3174d.m11985b(0, 0, 0, 0, 15, null);
            InterfaceC3175e interfaceC3175e = this.f14106c;
            AbstractC0042h.b bVar = this.f14107d;
            AbstractC2869v.a aVar = AbstractC2869v.f7516a;
            float fMo35080a = AbstractC9039a0.m35063a(str, c9147v3, jM11985b, interfaceC3175e, bVar, (64 & 32) != 0 ? AbstractC5114x.m20800o() : null, (64 & 64) != 0 ? AbstractC5114x.m20800o() : null, (64 & 128) != 0 ? Integer.MAX_VALUE : 1, (64 & 256) != 0 ? AbstractC2869v.f7516a.m10306a() : aVar.m10306a()).mo35080a();
            float fMo35080a2 = AbstractC9039a0.m35063a(AbstractC4767e.f14128b, this.f14108e, AbstractC3174d.m11985b(0, 0, 0, 0, 15, null), this.f14106c, this.f14107d, (64 & 32) != 0 ? AbstractC5114x.m20800o() : null, (64 & 64) != 0 ? AbstractC5114x.m20800o() : null, (64 & 128) != 0 ? Integer.MAX_VALUE : 2, (64 & 256) != 0 ? AbstractC2869v.f7516a.m10306a() : aVar.m10306a()).mo35080a() - fMo35080a;
            this.f14110g = fMo35080a;
            this.f14109f = fMo35080a2;
            f11 = fMo35080a2;
            f10 = fMo35080a;
        }
        return AbstractC3174d.m11984a(C3173c.m11975n(j10), C3173c.m11973l(j10), i10 != 1 ? AbstractC2368o.m8582i(AbstractC2368o.m8578e(Math.round(f10 + (f11 * (i10 - 1))), 0), C3173c.m11972k(j10)) : C3173c.m11974m(j10), C3173c.m11972k(j10));
    }

    /* JADX INFO: renamed from: d */
    public final InterfaceC3175e m19054d() {
        return this.f14106c;
    }

    /* JADX INFO: renamed from: e */
    public final AbstractC0042h.b m19055e() {
        return this.f14107d;
    }

    /* JADX INFO: renamed from: f */
    public final C9147v3 m19056f() {
        return this.f14105b;
    }

    /* JADX INFO: renamed from: g */
    public final EnumC3191u m19057g() {
        return this.f14104a;
    }

    /* JADX INFO: renamed from: m0.d$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C4765d m19058a(C4765d c4765d, EnumC3191u enumC3191u, C9147v3 c9147v3, InterfaceC3175e interfaceC3175e, AbstractC0042h.b bVar) {
            if (c4765d != null && enumC3191u == c4765d.m19057g() && AbstractC1061t.m3842c(AbstractC9152w3.m35601d(c9147v3, enumC3191u), c4765d.m19056f()) && interfaceC3175e.getDensity() == c4765d.m19054d().getDensity() && bVar == c4765d.m19055e()) {
                return c4765d;
            }
            C4765d c4765d2 = C4765d.f14103j;
            if (c4765d2 != null && enumC3191u == c4765d2.m19057g() && AbstractC1061t.m3842c(AbstractC9152w3.m35601d(c9147v3, enumC3191u), c4765d2.m19056f()) && interfaceC3175e.getDensity() == c4765d2.m19054d().getDensity() && bVar == c4765d2.m19055e()) {
                return c4765d2;
            }
            C4765d c4765d3 = new C4765d(enumC3191u, AbstractC9152w3.m35601d(c9147v3, enumC3191u), AbstractC3177g.m11996a(interfaceC3175e.getDensity(), interfaceC3175e.mo1231c1()), bVar);
            C4765d.f14103j = c4765d3;
            return c4765d3;
        }

        public a() {
        }
    }
}
