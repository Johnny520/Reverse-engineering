package p128ic;

import p068eh.AbstractC0921a;
import p110hc.InterfaceC1706c;
import p246qd.AbstractC3506j;
import p246qd.C3507k;
import p246qd.C3515s;
import p302ud.C4322r;

/* JADX INFO: renamed from: ic.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2039d implements InterfaceC1706c {

    /* JADX INFO: renamed from: g */
    public final C4322r f6874g;

    /* JADX INFO: renamed from: h */
    public final int f6875h;

    /* JADX INFO: renamed from: i */
    public final int f6876i;

    /* JADX INFO: renamed from: j */
    public final String f6877j;

    /* JADX INFO: renamed from: k */
    public int f6878k;

    /* JADX INFO: renamed from: l */
    public final C2040e f6879l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2039d(C4322r c4322r, C3515s c3515s) {
        int i9 = c3515s.f11442g;
        int i10 = c3515s.f11443h;
        AbstractC3506j abstractC3506j = c3515s.m7398b().f11412b;
        String str = c3515s.m7398b().f11411a;
        this.f6874g = c4322r;
        this.f6875h = i9;
        this.f6876i = i10;
        this.f6877j = str;
        this.f6879l = new C2040e(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static C2039d m4990a(C4322r c4322r, C3515s c3515s) {
        C3507k c3507kM7398b = c3515s.m7398b();
        if (c3507kM7398b.f11415e) {
            return null;
        }
        C2039d c2039d = c3507kM7398b.f11417g;
        if (c2039d != null) {
            return c2039d;
        }
        C2039d c2039d2 = new C2039d(c4322r, c3515s);
        c3507kM7398b.f11417g = c2039d2;
        return c2039d2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2039d)) {
            return false;
        }
        C2039d c2039d = (C2039d) obj;
        return this.f6875h == c2039d.f6875h && this.f6876i == c2039d.f6876i && this.f6874g.equals(c2039d.f6874g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return (((this.f6875h * 31) + this.f6876i) * 31) + this.f6874g.f14410k.f10156m;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p110hc.InterfaceC1704a
    /* JADX INFO: renamed from: j */
    public final int mo4336j() {
        return 5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p110hc.InterfaceC1706c
    /* JADX INFO: renamed from: t */
    public final void mo4337t(int i9) {
        this.f6878k = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return AbstractC0921a.m2248k(this.f6875h, this.f6876i, "VarNode{r", "v", "}");
    }
}
