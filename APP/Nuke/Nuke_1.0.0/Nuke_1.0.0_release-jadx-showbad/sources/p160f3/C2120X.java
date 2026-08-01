package p160f3;

import p190k3.C2460h;

/* JADX INFO: renamed from: f3.X */
/* JADX INFO: loaded from: classes.dex */
public final class C2120X extends AbstractC2118V {

    /* JADX INFO: renamed from: h */
    public final C2122Z f7054h;

    /* JADX INFO: renamed from: i */
    public final C2121Y f7055i;

    /* JADX INFO: renamed from: j */
    public final C2143k f7056j;

    /* JADX INFO: renamed from: k */
    public final Object f7057k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2120X(C2122Z c2122z, C2121Y c2121y, C2143k c2143k, Object obj) {
        this.f7054h = c2122z;
        this.f7055i = c2121y;
        this.f7056j = c2143k;
        this.f7057k = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p160f3.AbstractC2118V
    /* JADX INFO: renamed from: k */
    public final boolean mo3884k() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p160f3.AbstractC2118V
    /* JADX INFO: renamed from: l */
    public final void mo3885l(Throwable th) {
        C2143k c2143k = this.f7056j;
        C2143k c2143kM3920T = C2122Z.m3920T(c2143k);
        C2122Z c2122z = this.f7054h;
        C2121Y c2121y = this.f7055i;
        Object obj = this.f7057k;
        if (c2143kM3920T == null || !c2122z.m3944c0(c2121y, c2143kM3920T, obj)) {
            c2121y.f7061d.m4390e(new C2460h(2), 2);
            C2143k c2143kM3920T2 = C2122Z.m3920T(c2143k);
            if (c2143kM3920T2 == null || !c2122z.m3944c0(c2121y, c2143kM3920T2, obj)) {
                c2122z.mo3875q(c2122z.m3927H(c2121y, obj));
            }
        }
    }
}
