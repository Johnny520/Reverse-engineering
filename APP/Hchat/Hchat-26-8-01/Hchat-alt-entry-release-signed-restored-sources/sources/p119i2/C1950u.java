package p119i2;

import gg.AbstractC1416l;
import p068eh.AbstractC0921a;
import p204o2.AbstractC3042a;
import p280t2.C4088d;
import p280t2.C4089e;
import p280t2.C4093i;
import p280t2.C4095k;
import p280t2.C4097m;
import p280t2.C4101q;
import p280t2.C4103s;
import p293u2.C4245o;
import p293u2.C4246p;

/* JADX INFO: renamed from: i2.u */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1950u implements InterfaceC1916b {

    /* JADX INFO: renamed from: a */
    public final int f6606a;

    /* JADX INFO: renamed from: b */
    public final int f6607b;

    /* JADX INFO: renamed from: c */
    public final long f6608c;

    /* JADX INFO: renamed from: d */
    public final C4101q f6609d;

    /* JADX INFO: renamed from: e */
    public final C1952w f6610e;

    /* JADX INFO: renamed from: f */
    public final C4093i f6611f;

    /* JADX INFO: renamed from: g */
    public final int f6612g;

    /* JADX INFO: renamed from: h */
    public final int f6613h;

    /* JADX INFO: renamed from: i */
    public final C4103s f6614i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1950u(int i9, int i10, long j3, C4101q c4101q, C1952w c1952w, C4093i c4093i, int i11, int i12, C4103s c4103s) {
        this.f6606a = i9;
        this.f6607b = i10;
        this.f6608c = j3;
        this.f6609d = c4101q;
        this.f6610e = c1952w;
        this.f6611f = c4093i;
        this.f6612g = i11;
        this.f6613h = i12;
        this.f6614i = c4103s;
        if (C4245o.m8538a(j3, C4245o.f13924c) || C4245o.m8540c(j3) >= 0.0f) {
            return;
        }
        AbstractC3042a.m6487b("lineHeight can't be negative (" + C4245o.m8540c(j3) + ')');
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final C1950u m4839a(C1950u c1950u) {
        return c1950u == null ? this : AbstractC1951v.m4840a(this, c1950u.f6606a, c1950u.f6607b, c1950u.f6608c, c1950u.f6609d, c1950u.f6610e, c1950u.f6611f, c1950u.f6612g, c1950u.f6613h, c1950u.f6614i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1950u)) {
            return false;
        }
        C1950u c1950u = (C1950u) obj;
        return this.f6606a == c1950u.f6606a && this.f6607b == c1950u.f6607b && C4245o.m8538a(this.f6608c, c1950u.f6608c) && AbstractC1416l.m3825a(this.f6609d, c1950u.f6609d) && AbstractC1416l.m3825a(this.f6610e, c1950u.f6610e) && AbstractC1416l.m3825a(this.f6611f, c1950u.f6611f) && this.f6612g == c1950u.f6612g && this.f6613h == c1950u.f6613h && AbstractC1416l.m3825a(this.f6614i, c1950u.f6614i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iM2242e = AbstractC0921a.m2242e(this.f6607b, Integer.hashCode(this.f6606a) * 31, 31);
        C4246p[] c4246pArr = C4245o.f13923b;
        int iM2243f = AbstractC0921a.m2243f(iM2242e, 31, this.f6608c);
        C4101q c4101q = this.f6609d;
        int iHashCode = (iM2243f + (c4101q != null ? c4101q.hashCode() : 0)) * 31;
        C1952w c1952w = this.f6610e;
        int iHashCode2 = (iHashCode + (c1952w != null ? c1952w.hashCode() : 0)) * 31;
        C4093i c4093i = this.f6611f;
        int iM2242e2 = AbstractC0921a.m2242e(this.f6613h, AbstractC0921a.m2242e(this.f6612g, (iHashCode2 + (c4093i != null ? c4093i.hashCode() : 0)) * 31, 31), 31);
        C4103s c4103s = this.f6614i;
        return iM2242e2 + (c4103s != null ? c4103s.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "ParagraphStyle(textAlign=" + ((Object) C4095k.m8274a(this.f6606a)) + ", textDirection=" + ((Object) C4097m.m8275a(this.f6607b)) + ", lineHeight=" + ((Object) C4245o.m8541d(this.f6608c)) + ", textIndent=" + this.f6609d + ", platformStyle=" + this.f6610e + ", lineHeightStyle=" + this.f6611f + ", lineBreak=" + ((Object) C4089e.m8271a(this.f6612g)) + ", hyphens=" + ((Object) C4088d.m8270a(this.f6613h)) + ", textMotion=" + this.f6614i + ')';
    }
}
