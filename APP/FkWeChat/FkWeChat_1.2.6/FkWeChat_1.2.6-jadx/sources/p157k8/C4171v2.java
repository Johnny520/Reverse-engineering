package p157k8;

import java.util.LinkedHashMap;
import java.util.Map;
import p010a9.InterfaceC0173a;
import p080f9.AbstractC2368o;
import p157k8.InterfaceC4150s2;
import p172l8.AbstractC4706m;
import p172l8.InterfaceC4705l;
import p185m8.AbstractC5107t0;
import p185m8.AbstractC5116y;
import p272s8.InterfaceC7197a;
import p300uc.InterfaceC8647b;
import p329wc.AbstractC9217e;
import p329wc.AbstractC9223k;
import p329wc.InterfaceC9218f;
import p345xc.InterfaceC9487e;
import p345xc.InterfaceC9488f;

/* JADX INFO: renamed from: k8.v2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4171v2 implements InterfaceC8647b {

    /* JADX INFO: renamed from: a */
    public static final C4171v2 f12245a = new C4171v2();

    /* JADX INFO: renamed from: b */
    public static final InterfaceC9218f f12246b = AbstractC9223k.m35906b("io.modelcontextprotocol.kotlin.sdk.types.Method", AbstractC9217e.i.f31464a);

    /* JADX INFO: renamed from: c */
    public static final InterfaceC4705l f12247c = AbstractC4706m.m18787a(new InterfaceC0173a() { // from class: k8.u2
        @Override // p010a9.InterfaceC0173a
        public final Object invoke() {
            return C4171v2.m16541g();
        }
    });

    /* JADX INFO: renamed from: g */
    public static Map m16541g() {
        InterfaceC7197a interfaceC7197aM16485i = InterfaceC4150s2.c.m16485i();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC2368o.m8578e(AbstractC5107t0.m20763e(AbstractC5116y.m20814z(interfaceC7197aM16485i, 10)), 16));
        for (Object obj : interfaceC7197aM16485i) {
            linkedHashMap.put(((InterfaceC4150s2.c) obj).getValue(), obj);
        }
        return linkedHashMap;
    }

    @Override // p300uc.InterfaceC8647b, p300uc.InterfaceC8662p, p300uc.InterfaceC8645a
    /* JADX INFO: renamed from: a */
    public InterfaceC9218f mo15953a() {
        return f12246b;
    }

    @Override // p300uc.InterfaceC8645a
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public InterfaceC4150s2 mo15956d(InterfaceC9487e interfaceC9487e) {
        interfaceC9487e.getClass();
        String strMo894k = interfaceC9487e.mo894k();
        InterfaceC4150s2.c cVar = (InterfaceC4150s2.c) m16543i().get(strMo894k);
        return cVar != null ? cVar : new InterfaceC4150s2.b(strMo894k);
    }

    /* JADX INFO: renamed from: i */
    public final Map m16543i() {
        return (Map) f12247c.getValue();
    }

    @Override // p300uc.InterfaceC8662p
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void mo15954b(InterfaceC9488f interfaceC9488f, InterfaceC4150s2 interfaceC4150s2) {
        interfaceC9488f.getClass();
        interfaceC4150s2.getClass();
        interfaceC9488f.mo631F(interfaceC4150s2.getValue());
    }
}
