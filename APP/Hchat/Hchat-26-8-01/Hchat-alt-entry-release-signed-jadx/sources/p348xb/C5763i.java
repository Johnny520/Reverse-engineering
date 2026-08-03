package p348xb;

import p027c0.C0362g;
import p036c9.C0490u;
import p109hb.C1700w;
import p116i.AbstractC1742d;
import p116i.C1739c;
import p116i.C1785r0;
import p144k.C2176h1;
import p172lg.C2561a;
import p174m.C2571a;
import p249qg.InterfaceC3599t;
import p267s1.AbstractC3898h0;
import p276sf.C3967n;
import p332wb.C5031k3;
import p332wb.C5094m0;
import p356y0.C5850l;
import p356y0.InterfaceC5853o;

/* JADX INFO: renamed from: xb.i */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5763i {

    /* JADX INFO: renamed from: a */
    public final InterfaceC3599t f23450a;

    /* JADX INFO: renamed from: b */
    public final C2561a f23451b;

    /* JADX INFO: renamed from: c */
    public final C0490u f23452c;

    /* JADX INFO: renamed from: d */
    public final C1700w f23453d;

    /* JADX INFO: renamed from: e */
    public final C5031k3 f23454e;

    /* JADX INFO: renamed from: f */
    public final C1785r0 f23455f;

    /* JADX INFO: renamed from: g */
    public final C1785r0 f23456g;

    /* JADX INFO: renamed from: h */
    public final C1785r0 f23457h;

    /* JADX INFO: renamed from: i */
    public final C1785r0 f23458i;

    /* JADX INFO: renamed from: j */
    public final C1785r0 f23459j;

    /* JADX INFO: renamed from: k */
    public final C1739c f23460k;

    /* JADX INFO: renamed from: l */
    public final C1739c f23461l;

    /* JADX INFO: renamed from: m */
    public final C1739c f23462m;

    /* JADX INFO: renamed from: n */
    public final C1739c f23463n;

    /* JADX INFO: renamed from: o */
    public final C1739c f23464o;

    /* JADX INFO: renamed from: p */
    public final C2176h1 f23465p;

    /* JADX INFO: renamed from: q */
    public final C2571a f23466q;

    /* JADX INFO: renamed from: r */
    public final InterfaceC5853o f23467r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5763i(InterfaceC3599t interfaceC3599t, float f3, C2561a c2561a, C0490u c0490u, C5094m0 c5094m0, C1700w c1700w, C5031k3 c5031k3) {
        Float fValueOf = Float.valueOf(0.001f);
        interfaceC3599t.getClass();
        this.f23450a = interfaceC3599t;
        this.f23451b = c2561a;
        this.f23452c = c0490u;
        this.f23453d = c1700w;
        this.f23454e = c5031k3;
        this.f23455f = new C1785r0(1.0f, 1000.0f, fValueOf);
        this.f23456g = new C1785r0(0.5f, 300.0f, Float.valueOf(0.010000001f));
        this.f23457h = new C1785r0(1.0f, 1000.0f, fValueOf);
        this.f23458i = new C1785r0(0.6f, 250.0f, fValueOf);
        this.f23459j = new C1785r0(0.7f, 250.0f, fValueOf);
        this.f23460k = AbstractC1742d.m4365a(f3, 0.001f);
        this.f23461l = AbstractC1742d.m4365a(0.0f, 5.0f);
        this.f23462m = AbstractC1742d.m4365a(0.0f, 0.001f);
        this.f23463n = AbstractC1742d.m4365a(1.0f, 0.001f);
        this.f23464o = AbstractC1742d.m4365a(1.0f, 0.001f);
        this.f23465p = new C2176h1();
        this.f23466q = new C2571a(17);
        this.f23467r = AbstractC3898h0.m8090a(C5850l.f23787a, C3967n.f12976a, new C0362g(this, 8));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final float m10455a() {
        return ((Number) this.f23462m.m4360d()).floatValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final float m10456b() {
        return ((Number) this.f23460k.f5788e.getValue()).floatValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final float m10457c() {
        return ((Number) this.f23460k.m4360d()).floatValue();
    }
}
