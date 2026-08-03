package p119i2;

import bsh.org.objectweb.asm.Opcodes;
import gg.AbstractC1416l;
import p068eh.AbstractC0921a;
import p071f1.AbstractC1027s;
import p071f1.C1024q0;
import p071f1.C1034w;
import p101h1.AbstractC1566c;
import p177m2.AbstractC2772p;
import p177m2.C2765i;
import p177m2.C2766j;
import p177m2.C2767k;
import p225p2.C3290b;
import p280t2.C4085a;
import p280t2.C4087c;
import p280t2.C4096l;
import p280t2.C4098n;
import p280t2.C4100p;
import p280t2.InterfaceC4099o;
import p293u2.C4245o;
import p293u2.C4246p;

/* JADX INFO: renamed from: i2.f0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1925f0 implements InterfaceC1916b {

    /* JADX INFO: renamed from: a */
    public final InterfaceC4099o f6513a;

    /* JADX INFO: renamed from: b */
    public final long f6514b;

    /* JADX INFO: renamed from: c */
    public final C2767k f6515c;

    /* JADX INFO: renamed from: d */
    public final C2765i f6516d;

    /* JADX INFO: renamed from: e */
    public final C2766j f6517e;

    /* JADX INFO: renamed from: f */
    public final AbstractC2772p f6518f;

    /* JADX INFO: renamed from: g */
    public final String f6519g;

    /* JADX INFO: renamed from: h */
    public final long f6520h;

    /* JADX INFO: renamed from: i */
    public final C4085a f6521i;

    /* JADX INFO: renamed from: j */
    public final C4100p f6522j;

    /* JADX INFO: renamed from: k */
    public final C3290b f6523k;

    /* JADX INFO: renamed from: l */
    public final long f6524l;

    /* JADX INFO: renamed from: m */
    public final C4096l f6525m;

    /* JADX INFO: renamed from: n */
    public final C1024q0 f6526n;

    /* JADX INFO: renamed from: o */
    public final AbstractC1566c f6527o;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1925f0(long j3, long j4, C2767k c2767k, C2765i c2765i, C2766j c2766j, AbstractC2772p abstractC2772p, String str, long j5, C4085a c4085a, C4100p c4100p, C3290b c3290b, long j10, C4096l c4096l, C1024q0 c1024q0, int i9) {
        this((i9 & 1) != 0 ? C1034w.f3263g : j3, (i9 & 2) != 0 ? C4245o.f13924c : j4, (i9 & 4) != 0 ? null : c2767k, (i9 & 8) != 0 ? null : c2765i, (i9 & 16) != 0 ? null : c2766j, (i9 & 32) != 0 ? null : abstractC2772p, (i9 & 64) != 0 ? null : str, (i9 & 128) != 0 ? C4245o.f13924c : j5, (i9 & Opcodes.ACC_NATIVE) != 0 ? null : c4085a, (i9 & Opcodes.ACC_INTERFACE) != 0 ? null : c4100p, (i9 & 1024) != 0 ? null : c3290b, (i9 & Opcodes.ACC_STRICT) != 0 ? C1034w.f3263g : j10, (i9 & 4096) != 0 ? null : c4096l, (i9 & 8192) != 0 ? null : c1024q0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final boolean m4791a(C1925f0 c1925f0) {
        if (this == c1925f0) {
            return true;
        }
        return C4245o.m8538a(this.f6514b, c1925f0.f6514b) && AbstractC1416l.m3825a(this.f6515c, c1925f0.f6515c) && AbstractC1416l.m3825a(this.f6516d, c1925f0.f6516d) && AbstractC1416l.m3825a(this.f6517e, c1925f0.f6517e) && AbstractC1416l.m3825a(this.f6518f, c1925f0.f6518f) && AbstractC1416l.m3825a(this.f6519g, c1925f0.f6519g) && C4245o.m8538a(this.f6520h, c1925f0.f6520h) && AbstractC1416l.m3825a(this.f6521i, c1925f0.f6521i) && AbstractC1416l.m3825a(this.f6522j, c1925f0.f6522j) && AbstractC1416l.m3825a(this.f6523k, c1925f0.f6523k) && C1034w.m2635c(this.f6524l, c1925f0.f6524l);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final boolean m4792b(C1925f0 c1925f0) {
        return AbstractC1416l.m3825a(this.f6513a, c1925f0.f6513a) && AbstractC1416l.m3825a(this.f6525m, c1925f0.f6525m) && AbstractC1416l.m3825a(this.f6526n, c1925f0.f6526n) && AbstractC1416l.m3825a(this.f6527o, c1925f0.f6527o);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final C1925f0 m4793c(C1925f0 c1925f0) {
        if (c1925f0 == null) {
            return this;
        }
        InterfaceC4099o interfaceC4099o = c1925f0.f6513a;
        return AbstractC1927g0.m4796a(this, interfaceC4099o.mo8268b(), interfaceC4099o.mo8269c(), interfaceC4099o.mo8267a(), c1925f0.f6514b, c1925f0.f6515c, c1925f0.f6516d, c1925f0.f6517e, c1925f0.f6518f, c1925f0.f6519g, c1925f0.f6520h, c1925f0.f6521i, c1925f0.f6522j, c1925f0.f6523k, c1925f0.f6524l, c1925f0.f6525m, c1925f0.f6526n, c1925f0.f6527o);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1925f0)) {
            return false;
        }
        C1925f0 c1925f0 = (C1925f0) obj;
        return m4791a(c1925f0) && m4792b(c1925f0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        InterfaceC4099o interfaceC4099o = this.f6513a;
        long jMo8268b = interfaceC4099o.mo8268b();
        int i9 = C1034w.f3264h;
        int iHashCode = Long.hashCode(jMo8268b) * 31;
        AbstractC1027s abstractC1027sMo8269c = interfaceC4099o.mo8269c();
        int iHashCode2 = (Float.hashCode(interfaceC4099o.mo8267a()) + ((iHashCode + (abstractC1027sMo8269c != null ? abstractC1027sMo8269c.hashCode() : 0)) * 31)) * 31;
        C4246p[] c4246pArr = C4245o.f13923b;
        int iM2243f = AbstractC0921a.m2243f(iHashCode2, 31, this.f6514b);
        C2767k c2767k = this.f6515c;
        int i10 = (iM2243f + (c2767k != null ? c2767k.f9003g : 0)) * 31;
        C2765i c2765i = this.f6516d;
        int iHashCode3 = (i10 + (c2765i != null ? Integer.hashCode(c2765i.f8996a) : 0)) * 31;
        C2766j c2766j = this.f6517e;
        int iHashCode4 = (iHashCode3 + (c2766j != null ? Integer.hashCode(c2766j.f8997a) : 0)) * 31;
        AbstractC2772p abstractC2772p = this.f6518f;
        int iHashCode5 = (iHashCode4 + (abstractC2772p != null ? abstractC2772p.hashCode() : 0)) * 31;
        String str = this.f6519g;
        int iM2243f2 = AbstractC0921a.m2243f((iHashCode5 + (str != null ? str.hashCode() : 0)) * 31, 31, this.f6520h);
        C4085a c4085a = this.f6521i;
        int iHashCode6 = (iM2243f2 + (c4085a != null ? Float.hashCode(c4085a.f13537a) : 0)) * 31;
        C4100p c4100p = this.f6522j;
        int iHashCode7 = (iHashCode6 + (c4100p != null ? c4100p.hashCode() : 0)) * 31;
        C3290b c3290b = this.f6523k;
        int iM2243f3 = AbstractC0921a.m2243f((iHashCode7 + (c3290b != null ? c3290b.f10461g.hashCode() : 0)) * 31, 31, this.f6524l);
        C4096l c4096l = this.f6525m;
        int i11 = (iM2243f3 + (c4096l != null ? c4096l.f13561a : 0)) * 31;
        C1024q0 c1024q0 = this.f6526n;
        int iHashCode8 = (i11 + (c1024q0 != null ? c1024q0.hashCode() : 0)) * 961;
        AbstractC1566c abstractC1566c = this.f6527o;
        return iHashCode8 + (abstractC1566c != null ? abstractC1566c.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SpanStyle(color=");
        InterfaceC4099o interfaceC4099o = this.f6513a;
        sb2.append((Object) C1034w.m2641i(interfaceC4099o.mo8268b()));
        sb2.append(", brush=");
        sb2.append(interfaceC4099o.mo8269c());
        sb2.append(", alpha=");
        sb2.append(interfaceC4099o.mo8267a());
        sb2.append(", fontSize=");
        sb2.append((Object) C4245o.m8541d(this.f6514b));
        sb2.append(", fontWeight=");
        sb2.append(this.f6515c);
        sb2.append(", fontStyle=");
        sb2.append(this.f6516d);
        sb2.append(", fontSynthesis=");
        sb2.append(this.f6517e);
        sb2.append(", fontFamily=");
        sb2.append(this.f6518f);
        sb2.append(", fontFeatureSettings=");
        sb2.append(this.f6519g);
        sb2.append(", letterSpacing=");
        sb2.append((Object) C4245o.m8541d(this.f6520h));
        sb2.append(", baselineShift=");
        sb2.append(this.f6521i);
        sb2.append(", textGeometricTransform=");
        sb2.append(this.f6522j);
        sb2.append(", localeList=");
        sb2.append(this.f6523k);
        sb2.append(", background=");
        sb2.append((Object) C1034w.m2641i(this.f6524l));
        sb2.append(", textDecoration=");
        sb2.append(this.f6525m);
        sb2.append(", shadow=");
        sb2.append(this.f6526n);
        sb2.append(", platformStyle=null, drawStyle=");
        sb2.append(this.f6527o);
        sb2.append(')');
        return sb2.toString();
    }

    public C1925f0(InterfaceC4099o interfaceC4099o, long j3, C2767k c2767k, C2765i c2765i, C2766j c2766j, AbstractC2772p abstractC2772p, String str, long j4, C4085a c4085a, C4100p c4100p, C3290b c3290b, long j5, C4096l c4096l, C1024q0 c1024q0, AbstractC1566c abstractC1566c) {
        this.f6513a = interfaceC4099o;
        this.f6514b = j3;
        this.f6515c = c2767k;
        this.f6516d = c2765i;
        this.f6517e = c2766j;
        this.f6518f = abstractC2772p;
        this.f6519g = str;
        this.f6520h = j4;
        this.f6521i = c4085a;
        this.f6522j = c4100p;
        this.f6523k = c3290b;
        this.f6524l = j5;
        this.f6525m = c4096l;
        this.f6526n = c1024q0;
        this.f6527o = abstractC1566c;
    }

    public C1925f0(long j3, long j4, C2767k c2767k, C2765i c2765i, C2766j c2766j, AbstractC2772p abstractC2772p, String str, long j5, C4085a c4085a, C4100p c4100p, C3290b c3290b, long j10, C4096l c4096l, C1024q0 c1024q0) {
        this(j3 != 16 ? new C4087c(j3) : C4098n.f13563a, j4, c2767k, c2765i, c2766j, abstractC2772p, str, j5, c4085a, c4100p, c3290b, j10, c4096l, c1024q0, (AbstractC1566c) null);
    }
}
