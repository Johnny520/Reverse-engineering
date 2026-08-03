package p082fd;

import af.C0081d;
import gd.C1399b;
import java.io.IOException;
import java.util.concurrent.Callable;
import md.EnumC2824a;
import p014b.C0126e;
import p081fc.C1199b;
import p105h6.C1614f;
import p111hd.C1707a;
import p134j6.C2079q;
import p258r8.C3742g;
import p302ud.C4309e;
import p302ud.C4325u;

/* JADX INFO: renamed from: fd.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class CallableC1205b implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4051a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f4052b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ CallableC1205b(Object obj, int i9) {
        this.f4051a = i9;
        this.f4052b = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f4051a) {
            case 0:
                C1399b c1399b = (C1399b) this.f4052b;
                C1707a c1707aM3803b = c1399b.m3803b(c1399b.f4653a, null);
                C1614f c1614f = C1399b.f4652c;
                c1614f.getClass();
                Class<?> cls = c1707aM3803b.getClass();
                StringBuilder sb2 = new StringBuilder();
                try {
                    c1614f.m4132d(c1707aM3803b, cls, c1614f.m4131c(new C2079q(sb2)));
                    return sb2.toString();
                } catch (IOException e6) {
                    throw new C0081d(e6);
                }
            case 1:
                C1204a c1204a = (C1204a) this.f4052b;
                C4309e c4309e = c1204a.f4040a;
                boolean zMo6235a = c4309e.f9217g.mo6235a(EnumC2824a.f9126L);
                C4325u c4325u = c4309e.f14371k;
                if (zMo6235a) {
                    C1199b c1199bM8712c = c4325u.m8712c();
                    C0126e c0126e = c1204a.f4042c;
                    c0126e.m631i((C4309e) c0126e.f332h, c1199bM8712c);
                    c1199bM8712c.mo3256f();
                    c1199bM8712c.mo3261k(c4309e);
                    c1204a.m3285j(c1199bM8712c);
                    c1199bM8712c.mo3256f();
                    c1204a.m3282g(c1199bM8712c);
                    return c1199bM8712c.m3266w();
                }
                C1199b c1199bM8712c2 = c4325u.m8712c();
                if (!c4309e.f9217g.mo6235a(EnumC2824a.f9166s)) {
                    c1204a.m3277b(c1199bM8712c2);
                    c1204a.m3276a(c1199bM8712c2, false);
                }
                C1199b c1199bM8712c3 = c4325u.m8712c();
                c1204a.m3285j(c1199bM8712c3);
                c1199bM8712c3.mo3256f();
                c1204a.m3282g(c1199bM8712c3);
                c1199bM8712c3.mo3253c(c1199bM8712c2);
                return c1199bM8712c3.m3266w();
            default:
                C3742g c3742g = (C3742g) this.f4052b;
                c3742g.f12147e.resolveConversationMuteApi();
                return Boolean.valueOf(c3742g.f12147e.isPrivateConversationMuteApiReady());
        }
    }
}
