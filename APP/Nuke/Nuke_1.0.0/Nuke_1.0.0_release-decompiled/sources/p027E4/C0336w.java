package p027E4;

import me.dartcv.nuke.BuildConfig;
import p056K2.C0878d;
import p117X2.AbstractC1665j;
import p117X2.AbstractC1676u;
import p117X2.C1660e;
import p118X3.C1679A;
import p127Z2.AbstractC1784a;
import p160f3.C2135g;

/* JADX INFO: renamed from: E4.w */
/* JADX INFO: loaded from: classes.dex */
public final class C0336w implements InterfaceC0321h {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f1063d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C2135g f1064e;

    public /* synthetic */ C0336w(C2135g c2135g, int i5) {
        this.f1063d = i5;
        this.f1064e = c2135g;
    }

    @Override // p027E4.InterfaceC0321h
    /* JADX INFO: renamed from: a */
    public final void mo32a(InterfaceC0318e interfaceC0318e, C0306U c0306u) {
        switch (this.f1063d) {
            case 0:
                boolean z5 = c0306u.f1017a.f5753s;
                C2135g c2135g = this.f1064e;
                if (!z5) {
                    c2135g.mo278i(AbstractC1784a.m3229o(new C0330q(c0306u)));
                } else {
                    Object obj = c0306u.f1018b;
                    if (obj != null) {
                        c2135g.mo278i(obj);
                    } else {
                        C1679A c1679aMo511d = interfaceC0318e.mo511d();
                        c1679aMo511d.getClass();
                        C1660e c1660eM2995a = AbstractC1676u.m2995a(C0334u.class);
                        Object objCast = AbstractC1784a.m3238x(c1660eM2995a).cast(c1679aMo511d.f5716e.mo3155k(c1660eM2995a));
                        AbstractC1665j.m2982b(objCast);
                        C0334u c0334u = (C0334u) objCast;
                        c2135g.mo278i(AbstractC1784a.m3229o(new C0878d("Response from " + c0334u.f1057a.getName() + '.' + c0334u.f1059c.getName() + " was null but response body type was declared as non-null")));
                    }
                }
                break;
            case BuildConfig.VERSION_CODE /* 1 */:
                boolean z6 = c0306u.f1017a.f5753s;
                C2135g c2135g2 = this.f1064e;
                if (!z6) {
                    c2135g2.mo278i(AbstractC1784a.m3229o(new C0330q(c0306u)));
                } else {
                    c2135g2.mo278i(c0306u.f1018b);
                }
                break;
            default:
                this.f1064e.mo278i(c0306u);
                break;
        }
    }

    @Override // p027E4.InterfaceC0321h
    /* JADX INFO: renamed from: m */
    public final void mo44m(InterfaceC0318e interfaceC0318e, Throwable th) {
        switch (this.f1063d) {
            case 0:
                this.f1064e.mo278i(AbstractC1784a.m3229o(th));
                break;
            case BuildConfig.VERSION_CODE /* 1 */:
                this.f1064e.mo278i(AbstractC1784a.m3229o(th));
                break;
            default:
                this.f1064e.mo278i(AbstractC1784a.m3229o(th));
                break;
        }
    }
}
