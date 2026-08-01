package p000A;

import me.dartcv.nuke.BuildConfig;
import p029F0.InterfaceC0430v;
import p056K2.C0891q;
import p092S0.C1259L;
import p092S0.C1269g;
import p095T.C1366i0;
import p095T.C1388t0;
import p095T.C1397y;
import p112W2.InterfaceC1601c;
import p115X0.C1635j;
import p115X0.C1646u;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: A.G */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0012G implements InterfaceC1601c {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f52d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C0078o0 f53e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0012G(C0078o0 c0078o0, int i5) {
        this.f52d = i5;
        this.f53e = c0078o0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1601c
    /* JADX INFO: renamed from: h */
    public final Object mo1h(Object obj) {
        switch (this.f52d) {
            case 0:
                InterfaceC0430v interfaceC0430v = (InterfaceC0430v) obj;
                C0036S0 c0036s0M123d = this.f53e.m123d();
                if (c0036s0M123d != null) {
                    c0036s0M123d.f163c = interfaceC0430v;
                }
                return C0891q.f2780a;
            case BuildConfig.VERSION_CODE /* 1 */:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                this.f53e.f353q.setValue(bool);
                return C0891q.f2780a;
            case 2:
                C0078o0 c0078o0 = this.f53e;
                C1366i0 c1366i0 = c0078o0.f356t;
                C1646u c1646u = (C1646u) obj;
                String str = c1646u.f5650a.f4563e;
                C1269g c1269g = c0078o0.f346j;
                if (!AbstractC1665j.m2981a(str, c1269g != null ? c1269g.f4563e : null)) {
                    c0078o0.f347k.setValue(EnumC0052b0.f211d);
                    if (((Boolean) c1366i0.getValue()).booleanValue()) {
                        c1366i0.setValue(Boolean.FALSE);
                    } else {
                        c0078o0.f355s.setValue(Boolean.FALSE);
                    }
                }
                long j5 = C1259L.f4536b;
                c0078o0.m125f(j5);
                c0078o0.m124e(j5);
                c0078o0.f357u.mo1h(c1646u);
                C1388t0 c1388t0 = c0078o0.f338b;
                C1397y c1397y = c1388t0.f4925a;
                if (c1397y != null) {
                    c1397y.m2665s(c1388t0, null);
                }
                return C0891q.f2780a;
            case 3:
                this.f53e.f354r.m114t(((C1635j) obj).f5624a);
                return C0891q.f2780a;
            default:
                return Boolean.valueOf(this.f53e.f354r.m114t(((C1635j) obj).f5624a));
        }
    }
}
