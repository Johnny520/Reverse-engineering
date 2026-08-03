package p015b0;

import gg.AbstractC1416l;
import gg.C1425u;
import p010aa.C0035c;
import p011ab.C0041a;
import p040d0.InterfaceC0647d;
import p057e1.C0808c;
import p085fg.InterfaceC1220a;
import p308v1.InterfaceC4428t;
import p372z.C6055c;

/* JADX INFO: renamed from: b0.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0131b implements InterfaceC1220a {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f343g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C0142h f344h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC0647d f345i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0131b(C0142h c0142h, InterfaceC0647d interfaceC0647d, int i9) {
        this.f343g = i9;
        this.f344h = c0142h;
        this.f345i = interfaceC0647d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1220a
    public final Object invoke() {
        switch (this.f343g) {
            case 0:
                C0142h c0142h = this.f344h;
                C0129a c0129a = c0142h.f372f;
                C0041a c0041a = new C0041a(this.f345i, 1);
                C1425u c1425u = new C1425u();
                c0142h.f371e.m9162c("dataBuilder", c0129a, new C0035c(c1425u, 1, c0041a));
                Object obj = c1425u.f4738g;
                if (obj != null) {
                    return (C6055c) obj;
                }
                AbstractC1416l.m3831g("result");
                throw null;
            case 1:
                C0142h c0142h2 = this.f344h;
                C0129a c0129a2 = c0142h2.f373g;
                C0131b c0131b = new C0131b(c0142h2, this.f345i, 2);
                C1425u c1425u2 = new C1425u();
                c0142h2.f371e.m9162c("positioner", c0129a2, new C0035c(c1425u2, 1, c0131b));
                Object obj2 = c1425u2.f4738g;
                if (obj2 != null) {
                    return (C0808c) obj2;
                }
                AbstractC1416l.m3831g("result");
                throw null;
            default:
                Object objInvoke = this.f344h.f369c.invoke();
                if (!((InterfaceC4428t) objInvoke).mo8856C()) {
                    objInvoke = null;
                }
                InterfaceC4428t interfaceC4428t = (InterfaceC4428t) objInvoke;
                return interfaceC4428t == null ? C0808c.f2415e : this.f345i.mo1317w0(interfaceC4428t).m2053i(interfaceC4428t.mo8868m0(0L));
        }
    }
}
