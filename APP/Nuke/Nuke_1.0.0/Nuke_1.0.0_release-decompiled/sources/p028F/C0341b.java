package p028F;

import me.dartcv.nuke.BuildConfig;
import p000A.C0073m;
import p000A.C0099z;
import p018D.C0254c;
import p029F0.InterfaceC0430v;
import p040H.InterfaceC0546d;
import p112W2.InterfaceC1599a;
import p117X2.AbstractC1665j;
import p117X2.C1675t;
import p204n0.C2684c;

/* JADX INFO: renamed from: F.b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0341b implements InterfaceC1599a {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f1073d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C0348i f1074e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ InterfaceC0546d f1075f;

    public /* synthetic */ C0341b(C0348i c0348i, InterfaceC0546d interfaceC0546d, int i5) {
        this.f1073d = i5;
        this.f1074e = c0348i;
        this.f1075f = interfaceC0546d;
    }

    @Override // p112W2.InterfaceC1599a
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        switch (this.f1073d) {
            case 0:
                C0348i c0348i = this.f1074e;
                C0340a c0340a = c0348i.f1097f;
                C0099z c0099z = new C0099z(2, this.f1075f);
                C1675t c1675t = new C1675t();
                c0348i.f1096e.m3867c("dataBuilder", c0340a, new C0073m(2, c1675t, c0099z));
                Object obj = c1675t.f5710e;
                if (obj != null) {
                    return (C0254c) obj;
                }
                AbstractC1665j.m2991k("result");
                throw null;
            case BuildConfig.VERSION_CODE /* 1 */:
                C0348i c0348i2 = this.f1074e;
                C0340a c0340a2 = c0348i2.f1098g;
                C0341b c0341b = new C0341b(c0348i2, this.f1075f, 2);
                C1675t c1675t2 = new C1675t();
                c0348i2.f1096e.m3867c("positioner", c0340a2, new C0073m(2, c1675t2, c0341b));
                Object obj2 = c1675t2.f5710e;
                if (obj2 != null) {
                    return (C2684c) obj2;
                }
                AbstractC1665j.m2991k("result");
                throw null;
            default:
                Object objMo6a = this.f1074e.f1094c.mo6a();
                if (!((InterfaceC0430v) objMo6a).mo632D()) {
                    objMo6a = null;
                }
                InterfaceC0430v interfaceC0430v = (InterfaceC0430v) objMo6a;
                return interfaceC0430v == null ? C2684c.f8557e : this.f1075f.mo743B(interfaceC0430v).m4658i(interfaceC0430v.mo638R(0L));
        }
    }
}
