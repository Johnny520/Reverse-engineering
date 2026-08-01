package p135b;

import me.dartcv.nuke.BuildConfig;
import p030F1.AbstractC0440e;
import p030F1.C0437b;
import p117X2.AbstractC1665j;
import p139c.C1882e;
import p176i1.C2285a;

/* JADX INFO: renamed from: b.u */
/* JADX INFO: loaded from: classes.dex */
public final class C1833u extends AbstractC0440e {

    /* JADX INFO: renamed from: d */
    public final C1810B f6229d;

    /* JADX INFO: renamed from: e */
    public boolean f6230e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1833u(C1810B c1810b, C1834v c1834v) {
        boolean z5 = c1810b.f6194b;
        this.f1318a = c1834v;
        this.f1319b = z5;
        this.f6229d = c1810b;
        this.f6230e = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p030F1.AbstractC0440e
    /* JADX INFO: renamed from: a */
    public final void mo703a() {
        C1810B c1810b = this.f6229d;
        switch (c1810b.f6196d) {
            case BuildConfig.VERSION_CODE /* 1 */:
                ((C1882e) c1810b.f6197e).getClass();
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p030F1.AbstractC0440e
    /* JADX INFO: renamed from: b */
    public final void mo704b() {
        C1810B c1810b = this.f6229d;
        switch (c1810b.f6196d) {
            case 0:
                ((C2285a) c1810b.f6197e).mo1h(c1810b);
                break;
            default:
                ((C1882e) c1810b.f6197e).f6404c.mo6a();
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p030F1.AbstractC0440e
    /* JADX INFO: renamed from: c */
    public final void mo705c(C0437b c0437b) {
        new C1813a(c0437b);
        C1810B c1810b = this.f6229d;
        switch (c1810b.f6196d) {
            case BuildConfig.VERSION_CODE /* 1 */:
                ((C1882e) c1810b.f6197e).getClass();
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p030F1.AbstractC0440e
    /* JADX INFO: renamed from: d */
    public final void mo706d(C0437b c0437b) {
        AbstractC1665j.m2985e(c0437b, "event");
        new C1813a(c0437b);
        C1810B c1810b = this.f6229d;
        switch (c1810b.f6196d) {
            case BuildConfig.VERSION_CODE /* 1 */:
                ((C1882e) c1810b.f6197e).getClass();
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final void m3298g(boolean z5) {
        this.f6230e = z5;
        m708f(z5 && this.f6229d.f6194b);
    }
}
