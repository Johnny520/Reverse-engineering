package p000;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: Hu */
/* JADX INFO: loaded from: classes.dex */
public final class C0338Hu {

    /* JADX INFO: renamed from: c */
    public static final C0338Hu f1144c = null;

    /* JADX INFO: renamed from: a */
    public final C0132D2 f1145a;

    /* JADX INFO: renamed from: b */
    public final ConcurrentHashMap f1146b;

    static {
        f1144c = new C0338Hu();
    }

    public C0338Hu() {
        this.f1146b = new ConcurrentHashMap();
        this.f1145a = new C0132D2(1);
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC2253mx m725a(Class r10) {
        AbstractC0501Ll.m982a("messageType", r10);
        ConcurrentHashMap r0 = this.f1146b;
        InterfaceC2253mx r1 = (InterfaceC2253mx) r0.get(r10);
        if (r1 != null) goto L41;
        C0132D2 r12 = this.f1145a;
        r12.getClass();
        Class r2 = AbstractC2296nx.f8047a;
        if (AbstractC2634vj.class.isAssignableFrom(r10) == true) goto L13;
        Class r3 = AbstractC2296nx.f8047a;
        if (r3 == null) goto L13;
        if (r3.isAssignableFrom(r10) == true) goto L13;
        throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
    L13:
        C1236bv r32 = ((C2160kq) r12.f328b).mo879a(r10);
        int r13 = r32.f4206d;
        AbstractC0043B r4 = r32.f4203a;
        if ((r13 & 2) != 2) goto L24;
        if (AbstractC2634vj.class.isAssignableFrom(r10) == false) goto L18;
        InterfaceC2253mx r33 = new C0593Nr(AbstractC2296nx.f8050d, AbstractC0925Vg.f2887a, r4);
    L37:
        InterfaceC2253mx r102 = (InterfaceC2253mx) r0.putIfAbsent(r10, r33);
        if (r102 == null) goto L40;
        return r102;
    L40:
        return r33;
    L18:
        C1044YC r14 = AbstractC2296nx.f8048b;
        C0882Ug r22 = AbstractC0925Vg.f2888b;
        if (r22 == null) goto L22;
        r33 = new C0593Nr(r14, r22, r4);
        goto L37
    L22:
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    L24:
        if (AbstractC2634vj.class.isAssignableFrom(r10) == false) goto L30;
        if ((r32.f4206d & 1) != 1) goto L28;
        r33 = C0550Mr.m1044B(r32, AbstractC0765Rs.f2435b, AbstractC2639vo.f9149b, AbstractC2296nx.f8050d, AbstractC0925Vg.f2887a, AbstractC2555tq.f8876b);
        goto L37
    L28:
        r33 = C0550Mr.m1044B(r32, AbstractC0765Rs.f2435b, AbstractC2639vo.f9149b, AbstractC2296nx.f8050d, null, AbstractC2555tq.f8876b);
        goto L37
    L30:
        if ((r32.f4206d & 1) != 1) goto L36;
        C0723Qs r42 = AbstractC0765Rs.f2434a;
        C2553to r5 = AbstractC2639vo.f9148a;
        C1044YC r6 = AbstractC2296nx.f8048b;
        C0882Ug r7 = AbstractC0925Vg.f2888b;
        if (r7 == null) goto L35;
        r33 = C0550Mr.m1044B(r32, r42, r5, r6, r7, AbstractC2555tq.f8875a);
        goto L37
    L35:
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    L36:
        r33 = C0550Mr.m1044B(r32, AbstractC0765Rs.f2434a, AbstractC2639vo.f9148a, AbstractC2296nx.f8049c, null, AbstractC2555tq.f8875a);
        goto L37
    L41:
        return r1;
    }
}
