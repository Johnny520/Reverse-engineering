package p230r2;

import java.io.IOException;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Map;
import p191k4.C2475a;
import p213o2.AbstractC2770B;
import p213o2.C2785n;
import p213o2.C2789r;
import p224q2.InterfaceC2924o;
import p252v2.C3352a;
import p258w2.C3390a;
import p258w2.C3391b;

/* JADX INFO: renamed from: r2.n */
/* JADX INFO: loaded from: classes.dex */
public final class C3138n extends AbstractC2770B {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9877a = 1;

    /* JADX INFO: renamed from: b */
    public final Object f9878b;

    /* JADX INFO: renamed from: c */
    public final AbstractC2770B f9879c;

    /* JADX INFO: renamed from: d */
    public final Object f9880d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3138n(C2785n c2785n, AbstractC2770B abstractC2770B, Type type) {
        this.f9878b = c2785n;
        this.f9879c = abstractC2770B;
        this.f9880d = type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p213o2.AbstractC2770B
    /* JADX INFO: renamed from: b */
    public final Object mo4964b(C3390a c3390a) throws IOException {
        switch (this.f9877a) {
            case 0:
                int iM5630J = c3390a.m5630J();
                if (iM5630J == 9) {
                    c3390a.m5626F();
                    return null;
                }
                Map map = (Map) ((InterfaceC2924o) this.f9880d).mo602c();
                if (iM5630J == 1) {
                    c3390a.m5639b();
                    while (c3390a.m5647n()) {
                        c3390a.m5639b();
                        Object objMo4964b = ((C3138n) this.f9878b).f9879c.mo4964b(c3390a);
                        if (map.put(objMo4964b, ((C3138n) this.f9879c).f9879c.mo4964b(c3390a)) != null) {
                            throw new C2789r("duplicate key: " + objMo4964b);
                        }
                        c3390a.m5643h();
                    }
                    c3390a.m5643h();
                } else {
                    c3390a.m5640c();
                    while (c3390a.m5647n()) {
                        C2475a.f7965e.getClass();
                        int iM5642f = c3390a.f10590j;
                        if (iM5642f == 0) {
                            iM5642f = c3390a.m5642f();
                        }
                        if (iM5642f == 13) {
                            c3390a.f10590j = 9;
                        } else if (iM5642f == 12) {
                            c3390a.f10590j = 8;
                        } else {
                            if (iM5642f != 14) {
                                throw c3390a.m5638R("a name");
                            }
                            c3390a.f10590j = 10;
                        }
                        Object objMo4964b2 = ((C3138n) this.f9878b).f9879c.mo4964b(c3390a);
                        if (map.put(objMo4964b2, ((C3138n) this.f9879c).f9879c.mo4964b(c3390a)) != null) {
                            throw new C2789r("duplicate key: " + objMo4964b2);
                        }
                    }
                    c3390a.m5644j();
                }
                return map;
            default:
                return this.f9879c.mo4964b(c3390a);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0045  */
    @Override // p213o2.AbstractC2770B
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo4965c(C3391b c3391b, Object obj) throws IOException {
        AbstractC2770B abstractC2770BMo4971d;
        switch (this.f9877a) {
            case 0:
                Map map = (Map) obj;
                C3138n c3138n = (C3138n) this.f9879c;
                if (map == null) {
                    c3391b.m5666n();
                } else {
                    c3391b.m5660d();
                    for (Map.Entry entry : map.entrySet()) {
                        c3391b.m5664l(String.valueOf(entry.getKey()));
                        c3138n.mo4965c(c3391b, entry.getValue());
                    }
                    c3391b.m5663j();
                }
                break;
            default:
                Type type = (Type) this.f9880d;
                Type type2 = (obj == null || !((type instanceof Class) || (type instanceof TypeVariable))) ? type : obj.getClass();
                AbstractC2770B abstractC2770B = this.f9879c;
                if (type2 != type) {
                    AbstractC2770B abstractC2770BM4973b = ((C2785n) this.f9878b).m4973b(new C3352a(type2));
                    if (abstractC2770BM4973b instanceof AbstractC3143s) {
                        AbstractC2770B abstractC2770B2 = abstractC2770B;
                        while ((abstractC2770B2 instanceof AbstractC3148x) && (abstractC2770BMo4971d = ((AbstractC3148x) abstractC2770B2).mo4971d()) != abstractC2770B2) {
                            abstractC2770B2 = abstractC2770BMo4971d;
                        }
                        if (abstractC2770B2 instanceof AbstractC3143s) {
                        }
                    } else {
                        abstractC2770B = abstractC2770BM4973b;
                    }
                }
                abstractC2770B.mo4965c(c3391b, obj);
                break;
        }
    }

    public C3138n(C3128d c3128d, C3138n c3138n, C3138n c3138n2, InterfaceC2924o interfaceC2924o) {
        this.f9878b = c3138n;
        this.f9879c = c3138n2;
        this.f9880d = interfaceC2924o;
    }
}
