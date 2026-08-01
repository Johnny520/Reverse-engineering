package p329wc;

import bd.AbstractC1109b;
import p098g9.InterfaceC2549c;
import p300uc.InterfaceC8647b;
import p361yc.C9764t2;

/* JADX INFO: renamed from: wc.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC9214b {
    /* JADX INFO: renamed from: a */
    public static final InterfaceC2549c m35885a(InterfaceC9218f interfaceC9218f) {
        interfaceC9218f.getClass();
        if (interfaceC9218f instanceof C9215c) {
            return ((C9215c) interfaceC9218f).f31452b;
        }
        if (interfaceC9218f instanceof C9764t2) {
            return m35885a(((C9764t2) interfaceC9218f).m38057l());
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static final InterfaceC9218f m35886b(AbstractC1109b abstractC1109b, InterfaceC9218f interfaceC9218f) {
        InterfaceC8647b interfaceC8647bM4012c;
        abstractC1109b.getClass();
        interfaceC9218f.getClass();
        InterfaceC2549c interfaceC2549cM35885a = m35885a(interfaceC9218f);
        if (interfaceC2549cM35885a == null || (interfaceC8647bM4012c = AbstractC1109b.m4012c(abstractC1109b, interfaceC2549cM35885a, null, 2, null)) == null) {
            return null;
        }
        return interfaceC8647bM4012c.mo15953a();
    }

    /* JADX INFO: renamed from: c */
    public static final InterfaceC9218f m35887c(InterfaceC9218f interfaceC9218f, InterfaceC2549c interfaceC2549c) {
        interfaceC9218f.getClass();
        interfaceC2549c.getClass();
        return new C9215c(interfaceC9218f, interfaceC2549c);
    }
}
