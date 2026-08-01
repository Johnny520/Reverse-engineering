package ad;

import bd.AbstractC1109b;
import p024b9.AbstractC1061t;
import p329wc.AbstractC9214b;
import p329wc.AbstractC9216d;
import p329wc.AbstractC9217e;
import p329wc.AbstractC9224l;
import p329wc.AbstractC9225m;
import p329wc.InterfaceC9218f;
import p375zc.AbstractC9939c;

/* JADX INFO: renamed from: ad.k1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0271k1 {
    /* JADX INFO: renamed from: a */
    public static final InterfaceC9218f m793a(InterfaceC9218f interfaceC9218f, AbstractC1109b abstractC1109b) {
        InterfaceC9218f interfaceC9218fM793a;
        interfaceC9218f.getClass();
        abstractC1109b.getClass();
        if (!AbstractC1061t.m3842c(interfaceC9218f.mo35896j(), AbstractC9224l.a.f31484a)) {
            return interfaceC9218f.mo35897k() ? m793a(interfaceC9218f.mo35894h(0), abstractC1109b) : interfaceC9218f;
        }
        InterfaceC9218f interfaceC9218fM35886b = AbstractC9214b.m35886b(abstractC1109b, interfaceC9218f);
        return (interfaceC9218fM35886b == null || (interfaceC9218fM793a = m793a(interfaceC9218fM35886b, abstractC1109b)) == null) ? interfaceC9218f : interfaceC9218fM793a;
    }

    /* JADX INFO: renamed from: b */
    public static final EnumC0268j1 m794b(AbstractC9939c abstractC9939c, InterfaceC9218f interfaceC9218f) {
        abstractC9939c.getClass();
        interfaceC9218f.getClass();
        AbstractC9224l abstractC9224lMo35896j = interfaceC9218f.mo35896j();
        if (abstractC9224lMo35896j instanceof AbstractC9216d) {
            return EnumC0268j1.f655v;
        }
        if (AbstractC1061t.m3842c(abstractC9224lMo35896j, AbstractC9225m.b.f31487a)) {
            return EnumC0268j1.f653t;
        }
        if (!AbstractC1061t.m3842c(abstractC9224lMo35896j, AbstractC9225m.c.f31488a)) {
            return EnumC0268j1.f652s;
        }
        InterfaceC9218f interfaceC9218fM793a = m793a(interfaceC9218f.mo35894h(0), abstractC9939c.mo33269a());
        AbstractC9224l abstractC9224lMo35896j2 = interfaceC9218fM793a.mo35896j();
        if ((abstractC9224lMo35896j2 instanceof AbstractC9217e) || AbstractC1061t.m3842c(abstractC9224lMo35896j2, AbstractC9224l.b.f31485a)) {
            return EnumC0268j1.f654u;
        }
        if (abstractC9939c.m38514f().m38550c()) {
            return EnumC0268j1.f653t;
        }
        throw AbstractC0246c0.m698d(interfaceC9218fM793a);
    }
}
