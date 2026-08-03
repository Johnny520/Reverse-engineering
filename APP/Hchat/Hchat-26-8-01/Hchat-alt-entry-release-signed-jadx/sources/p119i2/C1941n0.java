package p119i2;

import bsh.org.objectweb.asm.Opcodes;
import gg.AbstractC1416l;
import p071f1.C1034w;
import p177m2.AbstractC2772p;
import p177m2.C2767k;
import p280t2.C4088d;
import p280t2.C4089e;
import p280t2.C4095k;
import p280t2.C4097m;
import p293u2.C4245o;

/* JADX INFO: renamed from: i2.n0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1941n0 {

    /* JADX INFO: renamed from: a */
    public final C1925f0 f6580a;

    /* JADX INFO: renamed from: b */
    public final C1950u f6581b;

    /* JADX INFO: renamed from: c */
    public final C1953x f6582c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        new C1941n0(0L, 0L, null, 0L, 0, 0L, 16777215);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1941n0(long j3, long j4, C2767k c2767k, long j5, int i9, long j10, int i10) {
        this(new C1925f0((i10 & 1) != 0 ? C1034w.f3263g : j3, (i10 & 2) != 0 ? C4245o.f13924c : j4, (i10 & 4) != 0 ? null : c2767k, null, null, null, null, (i10 & 128) != 0 ? C4245o.f13924c : j5, null, null, null, C1034w.f3263g, null, null), new C1950u((32768 & i10) != 0 ? 0 : i9, 0, (i10 & Opcodes.ACC_DEPRECATED) != 0 ? C4245o.f13924c : j10, null, null, null, 0, 0, null), null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static C1941n0 m4819c(C1941n0 c1941n0, long j3, long j4, C2767k c2767k, AbstractC2772p abstractC2772p, long j5, int i9, long j10, int i10) {
        long j11 = (i10 & 2) != 0 ? C4245o.f13924c : j4;
        C2767k c2767k2 = (i10 & 4) != 0 ? null : c2767k;
        AbstractC2772p abstractC2772p2 = (i10 & 32) != 0 ? null : abstractC2772p;
        long j12 = (i10 & 128) != 0 ? C4245o.f13924c : j5;
        long j13 = C1034w.f3263g;
        int i11 = (32768 & i10) != 0 ? 0 : i9;
        long j14 = (i10 & Opcodes.ACC_DEPRECATED) != 0 ? C4245o.f13924c : j10;
        C1925f0 c1925f0M4796a = AbstractC1927g0.m4796a(c1941n0.f6580a, j3, null, Float.NaN, j11, c2767k2, null, null, abstractC2772p2, null, j12, null, null, null, j13, null, null, null);
        C1950u c1950uM4840a = AbstractC1951v.m4840a(c1941n0.f6581b, i11, 0, j14, null, null, null, 0, 0, null);
        return (c1941n0.f6580a == c1925f0M4796a && c1941n0.f6581b == c1950uM4840a) ? c1941n0 : new C1941n0(c1925f0M4796a, c1950uM4840a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final long m4820a() {
        return this.f6580a.f6513a.mo8268b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final boolean m4821b(C1941n0 c1941n0) {
        if (this != c1941n0) {
            return AbstractC1416l.m3825a(this.f6581b, c1941n0.f6581b) && this.f6580a.m4791a(c1941n0.f6580a);
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1941n0)) {
            return false;
        }
        C1941n0 c1941n0 = (C1941n0) obj;
        return AbstractC1416l.m3825a(this.f6580a, c1941n0.f6580a) && AbstractC1416l.m3825a(this.f6581b, c1941n0.f6581b) && AbstractC1416l.m3825a(this.f6582c, c1941n0.f6582c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = (this.f6581b.hashCode() + (this.f6580a.hashCode() * 31)) * 31;
        C1953x c1953x = this.f6582c;
        return iHashCode + (c1953x != null ? c1953x.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TextStyle(color=");
        sb2.append((Object) C1034w.m2641i(m4820a()));
        sb2.append(", brush=");
        C1925f0 c1925f0 = this.f6580a;
        sb2.append(c1925f0.f6513a.mo8269c());
        sb2.append(", alpha=");
        sb2.append(c1925f0.f6513a.mo8267a());
        sb2.append(", fontSize=");
        sb2.append((Object) C4245o.m8541d(c1925f0.f6514b));
        sb2.append(", fontWeight=");
        sb2.append(c1925f0.f6515c);
        sb2.append(", fontStyle=");
        sb2.append(c1925f0.f6516d);
        sb2.append(", fontSynthesis=");
        sb2.append(c1925f0.f6517e);
        sb2.append(", fontFamily=");
        sb2.append(c1925f0.f6518f);
        sb2.append(", fontFeatureSettings=");
        sb2.append(c1925f0.f6519g);
        sb2.append(", letterSpacing=");
        sb2.append((Object) C4245o.m8541d(c1925f0.f6520h));
        sb2.append(", baselineShift=");
        sb2.append(c1925f0.f6521i);
        sb2.append(", textGeometricTransform=");
        sb2.append(c1925f0.f6522j);
        sb2.append(", localeList=");
        sb2.append(c1925f0.f6523k);
        sb2.append(", background=");
        sb2.append((Object) C1034w.m2641i(c1925f0.f6524l));
        sb2.append(", textDecoration=");
        sb2.append(c1925f0.f6525m);
        sb2.append(", shadow=");
        sb2.append(c1925f0.f6526n);
        sb2.append(", drawStyle=");
        sb2.append(c1925f0.f6527o);
        sb2.append(", textAlign=");
        C1950u c1950u = this.f6581b;
        sb2.append((Object) C4095k.m8274a(c1950u.f6606a));
        sb2.append(", textDirection=");
        sb2.append((Object) C4097m.m8275a(c1950u.f6607b));
        sb2.append(", lineHeight=");
        sb2.append((Object) C4245o.m8541d(c1950u.f6608c));
        sb2.append(", textIndent=");
        sb2.append(c1950u.f6609d);
        sb2.append(", platformStyle=");
        sb2.append(this.f6582c);
        sb2.append(", lineHeightStyle=");
        sb2.append(c1950u.f6611f);
        sb2.append(", lineBreak=");
        sb2.append((Object) C4089e.m8271a(c1950u.f6612g));
        sb2.append(", hyphens=");
        sb2.append((Object) C4088d.m8270a(c1950u.f6613h));
        sb2.append(", textMotion=");
        sb2.append(c1950u.f6614i);
        sb2.append(')');
        return sb2.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1941n0(C1925f0 c1925f0, C1950u c1950u) {
        c1925f0.getClass();
        C1952w c1952w = c1950u.f6610e;
        this(c1925f0, c1950u, c1952w == null ? null : new C1953x(c1952w));
    }

    public C1941n0(C1925f0 c1925f0, C1950u c1950u, C1953x c1953x) {
        this.f6580a = c1925f0;
        this.f6581b = c1950u;
        this.f6582c = c1953x;
    }
}
