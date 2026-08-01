package p329wc;

import p010a9.InterfaceC0184l;
import p024b9.AbstractC1061t;
import p172l8.C4700i0;
import p185m8.AbstractC5106t;
import p299ub.AbstractC8621f0;
import p329wc.AbstractC9225m;
import p361yc.AbstractC9754r2;
import p376zd.C9987e;

/* JADX INFO: renamed from: wc.k */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC9223k {
    /* JADX INFO: renamed from: a */
    public static C4700i0 m35905a(C9213a c9213a) {
        c9213a.getClass();
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: b */
    public static final InterfaceC9218f m35906b(String str, AbstractC9217e abstractC9217e) {
        str.getClass();
        abstractC9217e.getClass();
        if (!AbstractC8621f0.m33156p0(str)) {
            return AbstractC9754r2.m38034a(str, abstractC9217e);
        }
        C9987e.m38645a("Blank serial names are prohibited");
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static final InterfaceC9218f m35907c(String str, InterfaceC9218f[] interfaceC9218fArr, InterfaceC0184l interfaceC0184l) {
        str.getClass();
        interfaceC9218fArr.getClass();
        interfaceC0184l.getClass();
        if (AbstractC8621f0.m33156p0(str)) {
            C9987e.m38645a("Blank serial names are prohibited");
            return null;
        }
        C9213a c9213a = new C9213a(str);
        interfaceC0184l.mo27m(c9213a);
        return new C9220h(str, AbstractC9225m.a.f31486a, c9213a.m35882f().size(), AbstractC5106t.m20713V0(interfaceC9218fArr), c9213a);
    }

    /* JADX INFO: renamed from: d */
    public static final InterfaceC9218f m35908d(String str, AbstractC9224l abstractC9224l, InterfaceC9218f[] interfaceC9218fArr, InterfaceC0184l interfaceC0184l) {
        str.getClass();
        abstractC9224l.getClass();
        interfaceC9218fArr.getClass();
        interfaceC0184l.getClass();
        if (AbstractC8621f0.m33156p0(str)) {
            C9987e.m38645a("Blank serial names are prohibited");
            return null;
        }
        if (AbstractC1061t.m3842c(abstractC9224l, AbstractC9225m.a.f31486a)) {
            C9987e.m38645a("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
            return null;
        }
        C9213a c9213a = new C9213a(str);
        interfaceC0184l.mo27m(c9213a);
        return new C9220h(str, abstractC9224l, c9213a.m35882f().size(), AbstractC5106t.m20713V0(interfaceC9218fArr), c9213a);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ InterfaceC9218f m35909e(String str, AbstractC9224l abstractC9224l, InterfaceC9218f[] interfaceC9218fArr, InterfaceC0184l interfaceC0184l, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            interfaceC0184l = new InterfaceC0184l() { // from class: wc.j
                @Override // p010a9.InterfaceC0184l
                /* JADX INFO: renamed from: m */
                public final Object mo27m(Object obj2) {
                    return AbstractC9223k.m35905a((C9213a) obj2);
                }
            };
        }
        return m35908d(str, abstractC9224l, interfaceC9218fArr, interfaceC0184l);
    }
}
