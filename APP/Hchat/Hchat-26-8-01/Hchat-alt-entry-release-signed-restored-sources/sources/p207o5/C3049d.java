package p207o5;

import androidx.lifecycle.C0119x;
import java.util.Set;
import p150k5.C2263n;
import p150k5.C2270u;

/* JADX INFO: renamed from: o5.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3049d extends AbstractC3050e {

    /* JADX INFO: renamed from: b */
    public final C2270u f9871b;

    /* JADX INFO: renamed from: c */
    public final int f9872c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3049d(C2270u c2270u, int i9) {
        this.f9871b = c2270u;
        this.f9872c = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p207o5.AbstractC3050e
    /* JADX INFO: renamed from: b */
    public final Set mo6489b() {
        C2270u c2270u = this.f9871b;
        return AbstractC3050e.m6493a(c2270u, c2270u.f7532b.m583N(this.f9872c));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p207o5.AbstractC3050e
    /* JADX INFO: renamed from: c */
    public final InterfaceC3048c mo6490c() {
        C0119x c0119x = this.f9871b.f7532b;
        int i9 = this.f9872c;
        int iM583N = c0119x.m583N(i9 + 4);
        return iM583N == 0 ? InterfaceC3048c.f9870c : new C2263n(this, i9 + 16, iM583N);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p207o5.AbstractC3050e
    /* JADX INFO: renamed from: d */
    public final InterfaceC3048c mo6491d() {
        C2270u c2270u = this.f9871b;
        C0119x c0119x = c2270u.f7532b;
        int i9 = this.f9872c;
        int iM583N = c0119x.m583N(i9 + 8);
        if (iM583N == 0) {
            return InterfaceC3048c.f9870c;
        }
        return new C2263n(this, (c2270u.f7532b.m583N(i9 + 4) * 8) + i9 + 16, iM583N);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p207o5.AbstractC3050e
    /* JADX INFO: renamed from: e */
    public final InterfaceC3048c mo6492e() {
        C2270u c2270u = this.f9871b;
        C0119x c0119x = c2270u.f7532b;
        int i9 = this.f9872c;
        int iM583N = c0119x.m583N(i9 + 12);
        if (iM583N == 0) {
            return InterfaceC3048c.f9870c;
        }
        int iM583N2 = c2270u.f7532b.m583N(i9 + 4);
        int i10 = iM583N2 * 8;
        return new C2263n(this, (c2270u.f7532b.m583N(i9 + 8) * 8) + i10 + i9 + 16, iM583N);
    }
}
