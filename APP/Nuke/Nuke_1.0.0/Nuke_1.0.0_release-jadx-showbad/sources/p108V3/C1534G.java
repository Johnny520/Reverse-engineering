package p108V3;

import me.dartcv.nuke.BuildConfig;
import p056K2.C0884j;
import p056K2.C0891q;
import p090R3.C1228a;
import p104U3.EnumC1477a;
import p112W2.InterfaceC1601c;
import p117X2.AbstractC1665j;
import p127Z2.AbstractC1784a;
import p158f0.AbstractC2074f;
import p158f0.AbstractC2082n;
import p158f0.C2080l;

/* JADX INFO: renamed from: V3.G */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1534G implements InterfaceC1601c {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f5333d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ InterfaceC1601c f5334e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C1534G(InterfaceC1601c interfaceC1601c, int i5) {
        this.f5333d = i5;
        this.f5334e = interfaceC1601c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1601c
    /* JADX INFO: renamed from: h */
    public final Object mo1h(Object obj) {
        Object objM3229o;
        switch (this.f5333d) {
            case 0:
                InterfaceC1601c interfaceC1601c = this.f5334e;
                C1547U c1547u = (C1547U) obj;
                AbstractC1665j.m2985e(c1547u, "hsv");
                interfaceC1601c.mo1h(AbstractC1543P.m2815V(AbstractC1543P.m2813T(c1547u)));
                return C0891q.f2780a;
            case BuildConfig.VERSION_CODE /* 1 */:
                InterfaceC1601c interfaceC1601c2 = this.f5334e;
                C1228a c1228a = (C1228a) obj;
                AbstractC1665j.m2985e(c1228a, "preference");
                String str = c1228a.f4097c;
                if (str != null) {
                    try {
                        objM3229o = EnumC1477a.valueOf(str);
                    } catch (Throwable th) {
                        objM3229o = AbstractC1784a.m3229o(th);
                    }
                    obj = (EnumC1477a) (objM3229o instanceof C0884j ? null : objM3229o);
                    break;
                }
                if (obj != null) {
                    interfaceC1601c2.mo1h(obj);
                }
                return C0891q.f2780a;
            case 2:
                AbstractC2074f abstractC2074f = (AbstractC2074f) this.f5334e.mo1h((C2080l) obj);
                synchronized (AbstractC2082n.f6972c) {
                    AbstractC2082n.f6973d = AbstractC2082n.f6973d.m3824e(abstractC2074f.mo3791g());
                }
                return abstractC2074f;
            default:
                InterfaceC1601c interfaceC1601c3 = this.f5334e;
                Long l3 = (Long) obj;
                l3.longValue();
                return interfaceC1601c3.mo1h(l3);
        }
    }
}
