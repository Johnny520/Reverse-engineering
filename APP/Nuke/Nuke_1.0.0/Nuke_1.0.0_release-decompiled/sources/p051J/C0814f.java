package p051J;

import me.dartcv.nuke.BuildConfig;
import p000A.C0012G;
import p000A.C0078o0;
import p041H0.AbstractC0601k;
import p047I0.C0761s0;
import p047I0.InterfaceC0686N0;
import p112W2.InterfaceC1599a;
import p198m0.C2590u;

/* JADX INFO: renamed from: J.f */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0814f implements InterfaceC1599a {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f2620d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C0816h f2621e;

    public /* synthetic */ C0814f(C0816h c0816h, int i5) {
        this.f2620d = i5;
        this.f2621e = c0816h;
    }

    @Override // p112W2.InterfaceC1599a
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        switch (this.f2620d) {
            case 0:
                AbstractC0601k.m1041q(this.f2621e);
                break;
            case BuildConfig.VERSION_CODE /* 1 */:
                this.f2621e.f2630y.m1933h(true);
                break;
            case 2:
                this.f2621e.f2630y.m1930d(true);
                break;
            case 3:
                this.f2621e.f2630y.m1931f();
                break;
            case 4:
                AbstractC0601k.m1041q(this.f2621e);
                break;
            case 5:
                this.f2621e.f2630y.m1941p();
                break;
            case 6:
                C0816h c0816h = this.f2621e;
                C0012G c0012g = c0816h.f2627v.f359w;
                c0012g.f53e.f354r.m114t(c0816h.f2631z.f5630e);
                break;
            default:
                C0816h c0816h2 = this.f2621e;
                C0078o0 c0078o0 = c0816h2.f2627v;
                C2590u c2590u = c0816h2.f2624A;
                if (c0078o0.m121b()) {
                    InterfaceC0686N0 interfaceC0686N0 = c0078o0.f339c;
                    if (interfaceC0686N0 != null) {
                        ((C0761s0) interfaceC0686N0).m1274b();
                    }
                } else {
                    C2590u.m4539a(c2590u);
                }
                break;
        }
        return Boolean.TRUE;
    }
}
