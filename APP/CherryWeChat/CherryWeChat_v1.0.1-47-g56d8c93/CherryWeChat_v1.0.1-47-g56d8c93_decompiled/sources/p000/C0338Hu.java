package p000;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: Hu */
/* JADX INFO: loaded from: classes.dex */
public final class C0338Hu {

    /* JADX INFO: renamed from: c */
    public static final C0338Hu f1144c = new C0338Hu();

    /* JADX INFO: renamed from: b */
    public final ConcurrentHashMap f1146b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    public final C0132D2 f1145a = new C0132D2(1);

    /* JADX INFO: renamed from: a */
    public final InterfaceC2253mx m725a(Class cls) {
        InterfaceC2253mx interfaceC2253mxM1044B;
        Class cls2;
        AbstractC0501Ll.m982a("messageType", cls);
        ConcurrentHashMap concurrentHashMap = this.f1146b;
        InterfaceC2253mx interfaceC2253mx = (InterfaceC2253mx) concurrentHashMap.get(cls);
        if (interfaceC2253mx != null) {
            return interfaceC2253mx;
        }
        C0132D2 c0132d2 = this.f1145a;
        c0132d2.getClass();
        Class cls3 = AbstractC2296nx.f8047a;
        if (!AbstractC2634vj.class.isAssignableFrom(cls) && (cls2 = AbstractC2296nx.f8047a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
        }
        C1236bv c1236bvMo879a = ((C2160kq) c0132d2.f328b).mo879a(cls);
        int i = c1236bvMo879a.f4206d;
        AbstractC0043B abstractC0043B = c1236bvMo879a.f4203a;
        if ((i & 2) == 2) {
            if (AbstractC2634vj.class.isAssignableFrom(cls)) {
                interfaceC2253mxM1044B = new C0593Nr(AbstractC2296nx.f8050d, AbstractC0925Vg.f2887a, abstractC0043B);
            } else {
                C1044YC c1044yc = AbstractC2296nx.f8048b;
                C0882Ug c0882Ug = AbstractC0925Vg.f2888b;
                if (c0882Ug == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                interfaceC2253mxM1044B = new C0593Nr(c1044yc, c0882Ug, abstractC0043B);
            }
        } else if (AbstractC2634vj.class.isAssignableFrom(cls)) {
            interfaceC2253mxM1044B = (c1236bvMo879a.f4206d & 1) == 1 ? C0550Mr.m1044B(c1236bvMo879a, AbstractC0765Rs.f2435b, AbstractC2639vo.f9149b, AbstractC2296nx.f8050d, AbstractC0925Vg.f2887a, AbstractC2555tq.f8876b) : C0550Mr.m1044B(c1236bvMo879a, AbstractC0765Rs.f2435b, AbstractC2639vo.f9149b, AbstractC2296nx.f8050d, null, AbstractC2555tq.f8876b);
        } else if ((c1236bvMo879a.f4206d & 1) == 1) {
            C0723Qs c0723Qs = AbstractC0765Rs.f2434a;
            C2553to c2553to = AbstractC2639vo.f9148a;
            C1044YC c1044yc2 = AbstractC2296nx.f8048b;
            C0882Ug c0882Ug2 = AbstractC0925Vg.f2888b;
            if (c0882Ug2 == null) {
                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
            }
            interfaceC2253mxM1044B = C0550Mr.m1044B(c1236bvMo879a, c0723Qs, c2553to, c1044yc2, c0882Ug2, AbstractC2555tq.f8875a);
        } else {
            interfaceC2253mxM1044B = C0550Mr.m1044B(c1236bvMo879a, AbstractC0765Rs.f2434a, AbstractC2639vo.f9148a, AbstractC2296nx.f8049c, null, AbstractC2555tq.f8875a);
        }
        InterfaceC2253mx interfaceC2253mx2 = (InterfaceC2253mx) concurrentHashMap.putIfAbsent(cls, interfaceC2253mxM1044B);
        return interfaceC2253mx2 != null ? interfaceC2253mx2 : interfaceC2253mxM1044B;
    }
}
