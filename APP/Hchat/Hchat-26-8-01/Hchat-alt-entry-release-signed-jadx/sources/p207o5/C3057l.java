package p207o5;

import androidx.lifecycle.C0119x;
import p005a5.C0016a;
import p080fb.AbstractC1184v0;
import p150k5.C2270u;
import p327w5.InterfaceC4686a;

/* JADX INFO: renamed from: o5.l */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3057l extends AbstractC3058m {

    /* JADX INFO: renamed from: b */
    public final C0016a f9889b;

    /* JADX INFO: renamed from: c */
    public final C2270u f9890c;

    /* JADX INFO: renamed from: d */
    public final int f9891d;

    /* JADX INFO: renamed from: e */
    public int f9892e = 0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3057l(C2270u c2270u, int i9) {
        this.f9890c = c2270u;
        C0119x c0119x = c2270u.f7532b;
        c0119x.getClass();
        C0016a c0016a = new C0016a(i9, 5, c0119x);
        this.f9889b = c0016a;
        this.f9891d = c0016a.m211o(false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p207o5.AbstractC3058m
    /* JADX INFO: renamed from: a */
    public final int mo6496a() {
        return this.f9891d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p207o5.AbstractC3058m
    /* JADX INFO: renamed from: b */
    public final InterfaceC4686a mo6497b() {
        int i9 = this.f9892e;
        if (i9 >= this.f9891d) {
            return null;
        }
        this.f9892e = i9 + 1;
        return AbstractC1184v0.m3183J(this.f9890c, this.f9889b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p207o5.AbstractC3058m
    /* JADX INFO: renamed from: c */
    public final int mo6498c() {
        return this.f9889b.f55h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p207o5.AbstractC3058m
    /* JADX INFO: renamed from: d */
    public final void mo6499d() {
        int i9 = this.f9892e;
        if (i9 < this.f9891d) {
            this.f9892e = i9 + 1;
            AbstractC1184v0.m3184K(this.f9889b);
        }
    }
}
