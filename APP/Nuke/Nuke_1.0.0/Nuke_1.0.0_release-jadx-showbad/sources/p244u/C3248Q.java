package p244u;

import p011B4.AbstractC0231b;
import p041H0.AbstractC0582a0;
import p153e1.C2010f;
import p169h0.AbstractC2206o;
import p250v.AbstractC3349a;

/* JADX INFO: renamed from: u.Q */
/* JADX INFO: loaded from: classes.dex */
final class C3248Q extends AbstractC0582a0 {

    /* JADX INFO: renamed from: a */
    public final float f10053a;

    /* JADX INFO: renamed from: b */
    public final float f10054b;

    /* JADX INFO: renamed from: c */
    public final float f10055c;

    /* JADX INFO: renamed from: d */
    public final float f10056d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3248Q(float f2, float f5, float f6, float f7) {
        this.f10053a = f2;
        this.f10054b = f5;
        this.f10055c = f6;
        this.f10056d = f7;
        boolean z5 = true;
        boolean z6 = (f2 >= 0.0f || Float.isNaN(f2)) & (f5 >= 0.0f || Float.isNaN(f5)) & (f6 >= 0.0f || Float.isNaN(f6));
        if (f7 < 0.0f && !Float.isNaN(f7)) {
            z5 = false;
        }
        if (!z6 || !z5) {
            AbstractC3349a.m5598a("Padding must be non-negative");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.AbstractC0582a0
    /* JADX INFO: renamed from: e */
    public final AbstractC2206o mo140e() {
        C3249S c3249s = new C3249S();
        c3249s.f10057r = this.f10053a;
        c3249s.f10058s = this.f10054b;
        c3249s.f10059t = this.f10055c;
        c3249s.f10060u = this.f10056d;
        c3249s.f10061v = true;
        return c3249s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        C3248Q c3248q = obj instanceof C3248Q ? (C3248Q) obj : null;
        return c3248q != null && C2010f.m3696b(this.f10053a, c3248q.f10053a) && C2010f.m3696b(this.f10054b, c3248q.f10054b) && C2010f.m3696b(this.f10055c, c3248q.f10055c) && C2010f.m3696b(this.f10056d, c3248q.f10056d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.AbstractC0582a0
    /* JADX INFO: renamed from: f */
    public final void mo141f(AbstractC2206o abstractC2206o) {
        C3249S c3249s = (C3249S) abstractC2206o;
        c3249s.f10057r = this.f10053a;
        c3249s.f10058s = this.f10054b;
        c3249s.f10059t = this.f10055c;
        c3249s.f10060u = this.f10056d;
        c3249s.f10061v = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(true) + AbstractC0231b.m390a(this.f10056d, AbstractC0231b.m390a(this.f10055c, AbstractC0231b.m390a(this.f10054b, Float.hashCode(this.f10053a) * 31, 31), 31), 31);
    }
}
