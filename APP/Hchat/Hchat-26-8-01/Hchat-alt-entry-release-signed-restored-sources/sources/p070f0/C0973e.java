package p070f0;

import gg.AbstractC1416l;
import p020b5.C0192k;
import p041d1.C0676v;
import p068eh.AbstractC0921a;
import p100h0.C1511d1;
import p119i2.C1939m0;
import p190n2.C2875j;
import p190n2.C2884s;
import p190n2.C2891z;
import p321w.C4629q0;
import p339x1.AbstractC5618k;
import p339x1.AbstractC5658x0;
import p356y0.AbstractC5852n;

/* JADX INFO: renamed from: f0.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0973e extends AbstractC5658x0 {

    /* JADX INFO: renamed from: a */
    public final C2891z f3066a;

    /* JADX INFO: renamed from: b */
    public final C2884s f3067b;

    /* JADX INFO: renamed from: c */
    public final C4629q0 f3068c;

    /* JADX INFO: renamed from: d */
    public final boolean f3069d;

    /* JADX INFO: renamed from: e */
    public final C0192k f3070e;

    /* JADX INFO: renamed from: f */
    public final C1511d1 f3071f;

    /* JADX INFO: renamed from: g */
    public final C2875j f3072g;

    /* JADX INFO: renamed from: h */
    public final C0676v f3073h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0973e(C2891z c2891z, C2884s c2884s, C4629q0 c4629q0, boolean z9, C0192k c0192k, C1511d1 c1511d1, C2875j c2875j, C0676v c0676v) {
        this.f3066a = c2891z;
        this.f3067b = c2884s;
        this.f3068c = c4629q0;
        this.f3069d = z9;
        this.f3070e = c0192k;
        this.f3071f = c1511d1;
        this.f3072g = c2875j;
        this.f3073h = c0676v;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0973e)) {
            return false;
        }
        C0973e c0973e = (C0973e) obj;
        return this.f3066a.equals(c0973e.f3066a) && AbstractC1416l.m3825a(this.f3067b, c0973e.f3067b) && this.f3068c.equals(c0973e.f3068c) && this.f3069d == c0973e.f3069d && AbstractC1416l.m3825a(this.f3070e, c0973e.f3070e) && this.f3071f.equals(c0973e.f3071f) && AbstractC1416l.m3825a(this.f3072g, c0973e.f3072g) && AbstractC1416l.m3825a(this.f3073h, c0973e.f3073h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5658x0
    /* JADX INFO: renamed from: f */
    public final AbstractC5852n mo740f() {
        C0977i c0977i = new C0977i();
        c0977i.f3084w = this.f3066a;
        c0977i.f3085x = this.f3067b;
        c0977i.f3086y = this.f3068c;
        c0977i.f3087z = this.f3069d;
        c0977i.f3080A = this.f3070e;
        C1511d1 c1511d1 = this.f3071f;
        c0977i.f3081B = c1511d1;
        c0977i.f3082C = this.f3072g;
        c0977i.f3083D = this.f3073h;
        c1511d1.f5034f = new C0974f(c0977i, 4);
        return c0977i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5658x0
    /* JADX INFO: renamed from: g */
    public final void mo741g(AbstractC5852n abstractC5852n) {
        C0977i c0977i = (C0977i) abstractC5852n;
        boolean z9 = c0977i.f3087z;
        C2875j c2875j = c0977i.f3082C;
        C1511d1 c1511d1 = c0977i.f3081B;
        c0977i.f3084w = this.f3066a;
        C2884s c2884s = this.f3067b;
        c0977i.f3085x = c2884s;
        c0977i.f3086y = this.f3068c;
        boolean z10 = this.f3069d;
        c0977i.f3087z = z10;
        c0977i.f3080A = this.f3070e;
        C1511d1 c1511d12 = this.f3071f;
        c0977i.f3081B = c1511d12;
        C2875j c2875j2 = this.f3072g;
        c0977i.f3082C = c2875j2;
        c0977i.f3083D = this.f3073h;
        if (z10 != z9 || z10 != z9 || !AbstractC1416l.m3825a(c2875j2, c2875j) || !C1939m0.m4813c(c2884s.f9317b)) {
            AbstractC5618k.m10158n(c0977i);
        }
        if (c1511d12.equals(c1511d1)) {
            return;
        }
        c1511d12.f5034f = new C0974f(c0977i, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f3073h.hashCode() + ((this.f3072g.hashCode() + ((this.f3071f.hashCode() + ((this.f3070e.hashCode() + AbstractC0921a.m2245h(AbstractC0921a.m2245h(AbstractC0921a.m2245h((this.f3068c.hashCode() + ((this.f3067b.hashCode() + (this.f3066a.hashCode() * 31)) * 31)) * 31, 31, false), 31, this.f3069d), 31, false)) * 31)) * 31)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "CoreTextFieldSemanticsModifier(transformedText=" + this.f3066a + ", value=" + this.f3067b + ", state=" + this.f3068c + ", readOnly=false, enabled=" + this.f3069d + ", isPassword=false, offsetMapping=" + this.f3070e + ", manager=" + this.f3071f + ", imeOptions=" + this.f3072g + ", focusRequester=" + this.f3073h + ')';
    }
}
