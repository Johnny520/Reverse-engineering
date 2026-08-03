package p150k5;

import androidx.lifecycle.C0119x;
import p005a5.C0016a;
import p122i5.AbstractC1986a;
import p207o5.AbstractC3058m;
import p207o5.InterfaceC3048c;
import p327w5.InterfaceC4686a;

/* JADX INFO: renamed from: k5.w */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2272w extends AbstractC1986a {

    /* JADX INFO: renamed from: j */
    public final C2270u f7556j;

    /* JADX INFO: renamed from: k */
    public final C2264o f7557k;

    /* JADX INFO: renamed from: l */
    public final int f7558l;

    /* JADX INFO: renamed from: m */
    public final InterfaceC4686a f7559m;

    /* JADX INFO: renamed from: n */
    public final int f7560n;

    /* JADX INFO: renamed from: o */
    public final int f7561o;

    /* JADX INFO: renamed from: p */
    public final int f7562p;

    /* JADX INFO: renamed from: q */
    public int f7563q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2272w(C2270u c2270u, C0016a c0016a, C2264o c2264o, int i9, AbstractC3058m abstractC3058m, InterfaceC3048c interfaceC3048c, int i10) {
        this.f7556j = c2270u;
        this.f7557k = c2264o;
        int iM211o = c0016a.m211o(true) + i9;
        this.f7561o = iM211o;
        this.f7558l = c0016a.m211o(false);
        this.f7560n = interfaceC3048c.seekTo(iM211o);
        abstractC3058m.mo6498c();
        this.f7559m = abstractC3058m.mo6497b();
        this.f7562p = i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p122i5.AbstractC1986a
    /* JADX INFO: renamed from: f1 */
    public final String mo4927f1() {
        return this.f7557k.getType();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p122i5.AbstractC1986a
    public final String getName() {
        C2270u c2270u = this.f7556j;
        C2268s c2268s = c2270u.f7548r;
        C0119x c0119x = c2270u.f7531a;
        if (this.f7563q == 0) {
            this.f7563q = c2270u.f7550t.m5519b(this.f7561o);
        }
        return c2268s.m5521b(c0119x.m583N(this.f7563q + 4));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p122i5.AbstractC1986a
    public final String getType() {
        C2270u c2270u = this.f7556j;
        C2268s c2268s = c2270u.f7549s;
        C0119x c0119x = c2270u.f7531a;
        if (this.f7563q == 0) {
            this.f7563q = c2270u.f7550t.m5519b(this.f7561o);
        }
        return c2268s.m5521b(c0119x.m585P(this.f7563q + 2));
    }

    public C2272w(C2270u c2270u, C0016a c0016a, C2264o c2264o, int i9, InterfaceC3048c interfaceC3048c, int i10) {
        this.f7556j = c2270u;
        this.f7557k = c2264o;
        int iM211o = c0016a.m211o(true) + i9;
        this.f7561o = iM211o;
        this.f7558l = c0016a.m211o(false);
        this.f7560n = interfaceC3048c.seekTo(iM211o);
        this.f7559m = null;
        this.f7562p = i10;
    }
}
