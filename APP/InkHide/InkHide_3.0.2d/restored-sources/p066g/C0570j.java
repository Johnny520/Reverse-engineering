package p066g;

import p052b1.AbstractC0503h;
import p069i.C0697m1;

/* JADX INFO: renamed from: g.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0570j extends AbstractC0503h {

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ int f1930p;

    /* JADX INFO: renamed from: q */
    public boolean f1931q;

    /* JADX INFO: renamed from: r */
    public int f1932r;

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ Object f1933s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0570j(C0571k c0571k) {
        this.f1930p = 0;
        this.f1933s = c0571k;
        this.f1931q = false;
        this.f1932r = 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p099y.InterfaceC1055T
    /* JADX INFO: renamed from: a */
    public final void mo1047a() {
        switch (this.f1930p) {
            case 0:
                int i2 = this.f1932r + 1;
                this.f1932r = i2;
                C0571k c0571k = (C0571k) this.f1933s;
                if (i2 == c0571k.f1934a.size()) {
                    AbstractC0503h abstractC0503h = c0571k.f1937d;
                    if (abstractC0503h != null) {
                        abstractC0503h.mo1047a();
                    }
                    this.f1932r = 0;
                    this.f1931q = false;
                    c0571k.f1938e = false;
                }
                break;
            default:
                if (!this.f1931q) {
                    ((C0697m1) this.f1933s).f2351a.setVisibility(this.f1932r);
                }
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p052b1.AbstractC0503h, p099y.InterfaceC1055T
    /* JADX INFO: renamed from: b */
    public void mo996b() {
        switch (this.f1930p) {
            case 1:
                this.f1931q = true;
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p052b1.AbstractC0503h, p099y.InterfaceC1055T
    /* JADX INFO: renamed from: c */
    public final void mo997c() {
        switch (this.f1930p) {
            case 0:
                if (!this.f1931q) {
                    this.f1931q = true;
                    AbstractC0503h abstractC0503h = ((C0571k) this.f1933s).f1937d;
                    if (abstractC0503h != null) {
                        abstractC0503h.mo997c();
                    }
                    break;
                }
                break;
            default:
                ((C0697m1) this.f1933s).f2351a.setVisibility(0);
                break;
        }
    }

    public C0570j(C0697m1 c0697m1, int i2) {
        this.f1930p = 1;
        this.f1933s = c0697m1;
        this.f1932r = i2;
        this.f1931q = false;
    }
}
