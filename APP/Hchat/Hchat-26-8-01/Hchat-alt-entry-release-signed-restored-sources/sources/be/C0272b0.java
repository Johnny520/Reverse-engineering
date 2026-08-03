package be;

import java.util.function.Consumer;
import p214oc.C3126c;
import p232pc.C3381c;
import p232pc.C3382d;
import p302ud.C4309e;
import p302ud.C4311g;
import p302ud.C4322r;

/* JADX INFO: renamed from: be.b0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0272b0 implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f799a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0276d0 f800b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C4309e f801c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0272b0(C0276d0 c0276d0, C4309e c4309e, int i9) {
        this.f799a = i9;
        this.f800b = c0276d0;
        this.f801c = c4309e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f799a) {
            case 0:
                this.f800b.m1117m(this.f801c, (C3382d) ((C4311g) obj).f9217g.mo6237c(C3126c.f10128a));
                break;
            case 1:
                C4322r c4322r = (C4322r) obj;
                C3382d c3382d = (C3382d) c4322r.f9217g.mo6237c(C3126c.f10128a);
                C0276d0 c0276d0 = this.f800b;
                C4309e c4309e = this.f801c;
                c0276d0.m1117m(c4309e, c3382d);
                C3381c c3381c = (C3381c) c4322r.f9217g.mo6237c(C3126c.f10134g);
                if (c3381c != null) {
                    c3381c.f10915g.forEach(new C0272b0(c0276d0, c4309e, 2));
                    break;
                }
                break;
            default:
                this.f800b.m1117m(this.f801c, (C3382d) obj);
                break;
        }
    }
}
