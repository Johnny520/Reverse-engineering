package p319w2;

import p024b9.AbstractC1061t;
import p080f9.AbstractC2368o;
import p250r1.C6455e;
import p250r1.C6457g;
import p265s1.InterfaceC7144t2;
import p319w2.C9137t3;

/* JADX INFO: renamed from: w2.w */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C9148w {

    /* JADX INFO: renamed from: a */
    public final InterfaceC9143v f31240a;

    /* JADX INFO: renamed from: b */
    public final int f31241b;

    /* JADX INFO: renamed from: c */
    public final int f31242c;

    /* JADX INFO: renamed from: d */
    public int f31243d;

    /* JADX INFO: renamed from: e */
    public int f31244e;

    /* JADX INFO: renamed from: f */
    public float f31245f;

    /* JADX INFO: renamed from: g */
    public float f31246g;

    public C9148w(InterfaceC9143v interfaceC9143v, int i10, int i11, int i12, int i13, float f10, float f11) {
        this.f31240a = interfaceC9143v;
        this.f31241b = i10;
        this.f31242c = i11;
        this.f31243d = i12;
        this.f31244e = i13;
        this.f31245f = f10;
        this.f31246g = f11;
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ long m35578l(C9148w c9148w, long j10, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return c9148w.m35589k(j10, z10);
    }

    /* JADX INFO: renamed from: a */
    public final float m35579a() {
        return this.f31246g;
    }

    /* JADX INFO: renamed from: b */
    public final int m35580b() {
        return this.f31242c;
    }

    /* JADX INFO: renamed from: c */
    public final int m35581c() {
        return this.f31244e;
    }

    /* JADX INFO: renamed from: d */
    public final int m35582d() {
        return this.f31242c - this.f31241b;
    }

    /* JADX INFO: renamed from: e */
    public final InterfaceC9143v m35583e() {
        return this.f31240a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9148w)) {
            return false;
        }
        C9148w c9148w = (C9148w) obj;
        return AbstractC1061t.m3842c(this.f31240a, c9148w.f31240a) && this.f31241b == c9148w.f31241b && this.f31242c == c9148w.f31242c && this.f31243d == c9148w.f31243d && this.f31244e == c9148w.f31244e && Float.compare(this.f31245f, c9148w.f31245f) == 0 && Float.compare(this.f31246g, c9148w.f31246g) == 0;
    }

    /* JADX INFO: renamed from: f */
    public final int m35584f() {
        return this.f31241b;
    }

    /* JADX INFO: renamed from: g */
    public final int m35585g() {
        return this.f31243d;
    }

    /* JADX INFO: renamed from: h */
    public final float m35586h() {
        return this.f31245f;
    }

    public int hashCode() {
        return (((((((((((this.f31240a.hashCode() * 31) + Integer.hashCode(this.f31241b)) * 31) + Integer.hashCode(this.f31242c)) * 31) + Integer.hashCode(this.f31243d)) * 31) + Integer.hashCode(this.f31244e)) * 31) + Float.hashCode(this.f31245f)) * 31) + Float.hashCode(this.f31246g);
    }

    /* JADX INFO: renamed from: i */
    public final C6457g m35587i(C6457g c6457g) {
        float f10 = this.f31245f;
        return c6457g.m25593v(C6455e.m25551e((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f10)) & 4294967295L)));
    }

    /* JADX INFO: renamed from: j */
    public final InterfaceC7144t2 m35588j(InterfaceC7144t2 interfaceC7144t2) {
        float f10 = this.f31245f;
        interfaceC7144t2.mo28184q(C6455e.m25551e((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f10)) & 4294967295L)));
        return interfaceC7144t2;
    }

    /* JADX INFO: renamed from: k */
    public final long m35589k(long j10, boolean z10) {
        if (z10) {
            C9137t3.a aVar = C9137t3.f31232b;
            if (C9137t3.m35516g(j10, aVar.m35528a())) {
                return aVar.m35528a();
            }
        }
        return AbstractC9142u3.m35530b(m35590m(C9137t3.m35523n(j10)), m35590m(C9137t3.m35518i(j10)));
    }

    /* JADX INFO: renamed from: m */
    public final int m35590m(int i10) {
        return i10 + this.f31241b;
    }

    /* JADX INFO: renamed from: n */
    public final int m35591n(int i10) {
        return i10 + this.f31243d;
    }

    /* JADX INFO: renamed from: o */
    public final float m35592o(float f10) {
        return f10 + this.f31245f;
    }

    /* JADX INFO: renamed from: p */
    public final C6457g m35593p(C6457g c6457g) {
        float f10 = -this.f31245f;
        return c6457g.m25593v(C6455e.m25551e((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f10)) & 4294967295L)));
    }

    /* JADX INFO: renamed from: q */
    public final long m35594q(long j10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
        return C6455e.m25551e((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j10 & 4294967295L)) - this.f31245f)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32));
    }

    /* JADX INFO: renamed from: r */
    public final int m35595r(int i10) {
        return AbstractC2368o.m8586m(i10, this.f31241b, this.f31242c) - this.f31241b;
    }

    /* JADX INFO: renamed from: s */
    public final int m35596s(int i10) {
        return i10 - this.f31243d;
    }

    /* JADX INFO: renamed from: t */
    public final float m35597t(float f10) {
        return f10 - this.f31245f;
    }

    public String toString() {
        return "ParagraphInfo(paragraph=" + this.f31240a + ", startIndex=" + this.f31241b + ", endIndex=" + this.f31242c + ", startLineIndex=" + this.f31243d + ", endLineIndex=" + this.f31244e + ", top=" + this.f31245f + ", bottom=" + this.f31246g + ')';
    }
}
