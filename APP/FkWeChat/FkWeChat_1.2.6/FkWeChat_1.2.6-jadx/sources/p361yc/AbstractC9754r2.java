package p361yc;

import java.util.Map;
import p024b9.AbstractC1052o0;
import p024b9.AbstractC1061t;
import p098g9.InterfaceC2549c;
import p299ub.AbstractC8638t;
import p300uc.InterfaceC8647b;
import p329wc.AbstractC9217e;
import p329wc.InterfaceC9218f;
import p376zd.C9987e;

/* JADX INFO: renamed from: yc.r2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC9754r2 {

    /* JADX INFO: renamed from: a */
    public static final Map f33024a = AbstractC9684d2.m37851i();

    /* JADX INFO: renamed from: a */
    public static final InterfaceC9218f m38034a(String str, AbstractC9217e abstractC9217e) {
        str.getClass();
        abstractC9217e.getClass();
        m38036c(str);
        return new C9749q2(str, abstractC9217e);
    }

    /* JADX INFO: renamed from: b */
    public static final InterfaceC8647b m38035b(InterfaceC2549c interfaceC2549c) {
        interfaceC2549c.getClass();
        return (InterfaceC8647b) f33024a.get(interfaceC2549c);
    }

    /* JADX INFO: renamed from: c */
    public static final void m38036c(String str) {
        str.getClass();
        for (InterfaceC8647b interfaceC8647b : f33024a.values()) {
            if (AbstractC1061t.m3842c(str, interfaceC8647b.mo15953a().mo35888a())) {
                C9987e.m38645a(AbstractC8638t.m33244k("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name " + str + " there already exists " + AbstractC1052o0.m3807b(interfaceC8647b.getClass()).mo3794w() + ".\n                Please refer to SerialDescriptor documentation for additional information.\n            "));
                return;
            }
        }
    }
}
