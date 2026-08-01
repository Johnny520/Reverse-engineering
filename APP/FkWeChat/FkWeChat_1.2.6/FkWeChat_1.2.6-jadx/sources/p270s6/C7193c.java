package p270s6;

import ec.InterfaceC2126e1;
import io.ktor.util.internal.C3450b;
import io.ktor.util.internal.C3452d;
import p010a9.InterfaceC0184l;
import p024b9.AbstractC1061t;
import p024b9.AbstractC1064u0;
import p172l8.AbstractC4693f;
import p311v7.C8853b;

/* JADX INFO: renamed from: s6.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C7193c {

    /* JADX INFO: renamed from: a */
    public final C8853b f23869a = new C8853b();

    /* JADX INFO: renamed from: s6.c$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends C3452d implements InterfaceC2126e1 {

        /* JADX INFO: renamed from: t */
        public final InterfaceC0184l f23870t;

        public a(InterfaceC0184l interfaceC0184l) {
            interfaceC0184l.getClass();
            this.f23870t = interfaceC0184l;
        }

        @Override // ec.InterfaceC2126e1
        /* JADX INFO: renamed from: a */
        public void mo7628a() {
            m12875n();
        }

        /* JADX INFO: renamed from: p */
        public final InterfaceC0184l m28427p() {
            return this.f23870t;
        }
    }

    /* JADX INFO: renamed from: a */
    public static C3450b m28424a(C7191a c7191a) {
        c7191a.getClass();
        return new C3450b();
    }

    /* JADX INFO: renamed from: b */
    public final void m28425b(C7191a c7191a, Object obj) throws Throwable {
        c7191a.getClass();
        C3450b c3450b = (C3450b) this.f23869a.m33998b(c7191a);
        Throwable th = null;
        if (c3450b != null) {
            Object objM12870i = c3450b.m12870i();
            objM12870i.getClass();
            for (C3452d c3452dM12871j = (C3452d) objM12870i; !AbstractC1061t.m3842c(c3452dM12871j, c3450b); c3452dM12871j = c3452dM12871j.m12871j()) {
                if (c3452dM12871j instanceof a) {
                    try {
                        InterfaceC0184l interfaceC0184lM28427p = ((a) c3452dM12871j).m28427p();
                        interfaceC0184lM28427p.getClass();
                        ((InterfaceC0184l) AbstractC1064u0.m3858f(interfaceC0184lM28427p, 1)).mo27m(obj);
                    } catch (Throwable th2) {
                        if (th != null) {
                            AbstractC4693f.m18753a(th, th2);
                        } else {
                            th = th2;
                        }
                    }
                }
            }
        }
        if (th != null) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC2126e1 m28426c(C7191a c7191a, InterfaceC0184l interfaceC0184l) {
        c7191a.getClass();
        interfaceC0184l.getClass();
        a aVar = new a(interfaceC0184l);
        ((C3450b) this.f23869a.m33997a(c7191a, new InterfaceC0184l() { // from class: s6.b
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                return C7193c.m28424a((C7191a) obj);
            }
        })).m12864b(aVar);
        return aVar;
    }
}
