package p000A;

import me.dartcv.nuke.BuildConfig;
import p007B0.AbstractC0208v;
import p007B0.C0209w;
import p056K2.C0891q;
import p058L.C0950v;
import p112W2.InterfaceC1601c;
import p204n0.C2683b;

/* JADX INFO: renamed from: A.p0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0080p0 implements InterfaceC1601c {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f364d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ InterfaceC0092v0 f365e;

    public /* synthetic */ C0080p0(InterfaceC0092v0 interfaceC0092v0, int i5) {
        this.f364d = i5;
        this.f365e = interfaceC0092v0;
    }

    @Override // p112W2.InterfaceC1601c
    /* JADX INFO: renamed from: h */
    public final Object mo1h(Object obj) {
        switch (this.f364d) {
            case 0:
                this.f365e.mo128a(((C2683b) obj).f8556a, C0950v.f2989d);
                break;
            case BuildConfig.VERSION_CODE /* 1 */:
                C0209w c0209w = (C0209w) obj;
                this.f365e.mo132e(AbstractC0208v.m317g(c0209w, false));
                c0209w.m320a();
                break;
            default:
                C0209w c0209w2 = (C0209w) obj;
                this.f365e.mo132e(AbstractC0208v.m317g(c0209w2, false));
                c0209w2.m320a();
                break;
        }
        return C0891q.f2780a;
    }
}
