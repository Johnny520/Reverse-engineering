package p157k8;

import java.util.Map;
import p010a9.InterfaceC0173a;
import p157k8.InterfaceC4150s2;
import p172l8.AbstractC4706m;
import p172l8.AbstractC4717x;
import p172l8.C4700i0;
import p172l8.InterfaceC4705l;
import p185m8.AbstractC5109u0;
import p209o6.C5646i;
import p209o6.InterfaceC5644g;
import p300uc.InterfaceC8645a;
import p375zc.AbstractC9956k0;
import p375zc.AbstractC9957l;
import p375zc.AbstractC9961n;
import p375zc.C9950h0;
import p376zd.C9987e;

/* JADX INFO: renamed from: k8.h5 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4076h5 {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC5644g f11927a = C5646i.f17766a.m22846a(new InterfaceC0173a() { // from class: k8.c5
        @Override // p010a9.InterfaceC0173a
        public final Object invoke() {
            return AbstractC4076h5.m16173c();
        }
    });

    /* JADX INFO: renamed from: b */
    public static final InterfaceC4705l f11928b = AbstractC4706m.m18787a(new InterfaceC0173a() { // from class: k8.d5
        @Override // p010a9.InterfaceC0173a
        public final Object invoke() {
            return AbstractC4076h5.m16174d();
        }
    });

    /* JADX INFO: renamed from: c */
    public static final InterfaceC4705l f11929c = AbstractC4706m.m18787a(new InterfaceC0173a() { // from class: k8.e5
        @Override // p010a9.InterfaceC0173a
        public final Object invoke() {
            return AbstractC4076h5.m16175e();
        }
    });

    /* JADX INFO: renamed from: d */
    public static final InterfaceC4705l f11930d = AbstractC4706m.m18787a(new InterfaceC0173a() { // from class: k8.f5
        @Override // p010a9.InterfaceC0173a
        public final Object invoke() {
            return AbstractC4076h5.m16172b();
        }
    });

    /* JADX INFO: renamed from: e */
    public static final InterfaceC4705l f11931e = AbstractC4706m.m18787a(new InterfaceC0173a() { // from class: k8.g5
        @Override // p010a9.InterfaceC0173a
        public final Object invoke() {
            return AbstractC4076h5.m16171a();
        }
    });

    /* JADX INFO: renamed from: A */
    public static final InterfaceC8645a m16170A(AbstractC9957l abstractC9957l) {
        C9950h0 c9950h0M38582i = AbstractC9961n.m38582i(abstractC9957l);
        if (c9950h0M38582i.containsKey("protocolVersion") && c9950h0M38582i.containsKey("capabilities")) {
            return C4072h1.INSTANCE.serializer();
        }
        if (c9950h0M38582i.containsKey("completion")) {
            return C4147s.INSTANCE.serializer();
        }
        if (c9950h0M38582i.containsKey("tools")) {
            return C4087j2.INSTANCE.serializer();
        }
        if (c9950h0M38582i.containsKey("resources")) {
            return C4044d2.INSTANCE.serializer();
        }
        if (c9950h0M38582i.containsKey("resourceTemplates")) {
            return C4020a2.INSTANCE.serializer();
        }
        if (c9950h0M38582i.containsKey("prompts")) {
            return C4184x1.INSTANCE.serializer();
        }
        if (c9950h0M38582i.containsKey("messages")) {
            return C4162u0.INSTANCE.serializer();
        }
        if (c9950h0M38582i.containsKey("contents")) {
            return C4165u3.INSTANCE.serializer();
        }
        if (c9950h0M38582i.containsKey("content")) {
            return C4091k.INSTANCE.serializer();
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static Map m16171a() {
        return AbstractC5109u0.m20771l(AbstractC4717x.m18815a(InterfaceC4150s2.c.f12180B.getValue(), C4098l.INSTANCE.serializer()), AbstractC4717x.m18815a(InterfaceC4150s2.c.f12182D.getValue(), C4060f3.INSTANCE.serializer()), AbstractC4717x.m18815a(InterfaceC4150s2.c.f12183E.getValue(), C4108m2.INSTANCE.serializer()), AbstractC4717x.m18815a(InterfaceC4150s2.c.f12184F.getValue(), C4166u4.INSTANCE.serializer()), AbstractC4717x.m18815a(InterfaceC4150s2.c.f12185G.getValue(), C4131p4.INSTANCE.serializer()), AbstractC4717x.m18815a(InterfaceC4150s2.c.f12186H.getValue(), C4188x5.INSTANCE.serializer()), AbstractC4717x.m18815a(InterfaceC4150s2.c.f12188J.getValue(), C4102l3.INSTANCE.serializer()));
    }

    /* JADX INFO: renamed from: b */
    public static Map m16172b() {
        return AbstractC5109u0.m20771l(AbstractC4717x.m18815a(InterfaceC4150s2.c.f12180B.getValue(), C4098l.INSTANCE.serializer()), AbstractC4717x.m18815a(InterfaceC4150s2.c.f12182D.getValue(), C4060f3.INSTANCE.serializer()), AbstractC4717x.m18815a(InterfaceC4150s2.c.f12181C.getValue(), C4079i1.INSTANCE.serializer()), AbstractC4717x.m18815a(InterfaceC4150s2.c.f12187I.getValue(), C4201z4.INSTANCE.serializer()));
    }

    /* JADX INFO: renamed from: c */
    public static C4700i0 m16173c() {
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: d */
    public static Map m16174d() {
        return AbstractC5109u0.m20771l(AbstractC4717x.m18815a(InterfaceC4150s2.c.f12193O.getValue(), C4126p.INSTANCE.serializer()), AbstractC4717x.m18815a(InterfaceC4150s2.c.f12199s.getValue(), C4058f1.INSTANCE.serializer()), AbstractC4717x.m18815a(InterfaceC4150s2.c.f12200t.getValue(), C4045d3.INSTANCE.serializer()), AbstractC4717x.m18815a(InterfaceC4150s2.c.f12191M.getValue(), C4104l5.INSTANCE.serializer()), AbstractC4717x.m18815a(InterfaceC4150s2.c.f12179A.getValue(), C4134q0.INSTANCE.serializer()), AbstractC4717x.m18815a(InterfaceC4150s2.c.f12206z.getValue(), C4170v1.INSTANCE.serializer()), AbstractC4717x.m18815a(InterfaceC4150s2.c.f12201u.getValue(), C4028b2.INSTANCE.serializer()), AbstractC4717x.m18815a(InterfaceC4150s2.c.f12203w.getValue(), C4144r3.INSTANCE.serializer()), AbstractC4717x.m18815a(InterfaceC4150s2.c.f12204x.getValue(), C4132p5.INSTANCE.serializer()), AbstractC4717x.m18815a(InterfaceC4150s2.c.f12205y.getValue(), C4040c6.INSTANCE.serializer()), AbstractC4717x.m18815a(InterfaceC4150s2.c.f12202v.getValue(), C4191y1.INSTANCE.serializer()), AbstractC4717x.m18815a(InterfaceC4150s2.c.f12190L.getValue(), C4070h.INSTANCE.serializer()), AbstractC4717x.m18815a(InterfaceC4150s2.c.f12189K.getValue(), C4073h2.INSTANCE.serializer()));
    }

    /* JADX INFO: renamed from: e */
    public static Map m16175e() {
        return AbstractC5109u0.m20771l(AbstractC4717x.m18815a(InterfaceC4150s2.c.f12195Q.getValue(), C4071h0.INSTANCE.serializer()), AbstractC4717x.m18815a(InterfaceC4150s2.c.f12200t.getValue(), C4045d3.INSTANCE.serializer()), AbstractC4717x.m18815a(InterfaceC4150s2.c.f12194P.getValue(), C4052e2.INSTANCE.serializer()), AbstractC4717x.m18815a(InterfaceC4150s2.c.f12192N.getValue(), C4189y.INSTANCE.serializer()));
    }

    /* JADX INFO: renamed from: n */
    public static final Map m16184n() {
        return (Map) f11930d.getValue();
    }

    /* JADX INFO: renamed from: o */
    public static final Map m16185o() {
        return (Map) f11928b.getValue();
    }

    /* JADX INFO: renamed from: p */
    public static final String m16186p(AbstractC9957l abstractC9957l) {
        AbstractC9956k0 abstractC9956k0M38583j;
        AbstractC9957l abstractC9957l2 = (AbstractC9957l) AbstractC9961n.m38582i(abstractC9957l).get("method");
        if (abstractC9957l2 == null || (abstractC9956k0M38583j = AbstractC9961n.m38583j(abstractC9957l2)) == null) {
            return null;
        }
        return abstractC9956k0M38583j.mo38506a();
    }

    /* JADX INFO: renamed from: q */
    public static final Map m16187q() {
        return (Map) f11931e.getValue();
    }

    /* JADX INFO: renamed from: r */
    public static final Map m16188r() {
        return (Map) f11929c.getValue();
    }

    /* JADX INFO: renamed from: s */
    public static final String m16189s(AbstractC9957l abstractC9957l) {
        String strM16190t = m16190t(abstractC9957l);
        if (strM16190t != null) {
            return strM16190t;
        }
        C9987e.m38645a("Missing required 'type' field");
        return null;
    }

    /* JADX INFO: renamed from: t */
    public static final String m16190t(AbstractC9957l abstractC9957l) {
        AbstractC9956k0 abstractC9956k0M38583j;
        AbstractC9957l abstractC9957l2 = (AbstractC9957l) AbstractC9961n.m38582i(abstractC9957l).get("type");
        if (abstractC9957l2 == null || (abstractC9956k0M38583j = AbstractC9961n.m38583j(abstractC9957l2)) == null) {
            return null;
        }
        return abstractC9956k0M38583j.mo38506a();
    }

    /* JADX INFO: renamed from: u */
    public static final InterfaceC8645a m16191u(AbstractC9957l abstractC9957l) {
        String strM16186p = m16186p(abstractC9957l);
        if (strM16186p != null) {
            return (InterfaceC8645a) m16184n().get(strM16186p);
        }
        return null;
    }

    /* JADX INFO: renamed from: v */
    public static final InterfaceC8645a m16192v(String str) {
        str.getClass();
        return (InterfaceC8645a) m16185o().get(str);
    }

    /* JADX INFO: renamed from: w */
    public static final InterfaceC8645a m16193w(AbstractC9957l abstractC9957l) {
        C9950h0 c9950h0M38582i = AbstractC9961n.m38582i(abstractC9957l);
        if (c9950h0M38582i.containsKey("model") && c9950h0M38582i.containsKey("role")) {
            return C4050e0.INSTANCE.serializer();
        }
        if (c9950h0M38582i.containsKey("roots")) {
            return C4066g2.INSTANCE.serializer();
        }
        if (c9950h0M38582i.containsKey("action")) {
            return C4099l0.INSTANCE.serializer();
        }
        return null;
    }

    /* JADX INFO: renamed from: x */
    public static final InterfaceC8645a m16194x(AbstractC9957l abstractC9957l) {
        C9950h0 c9950h0M38582i = AbstractC9961n.m38582i(abstractC9957l);
        if (c9950h0M38582i.isEmpty() || (c9950h0M38582i.size() == 1 && c9950h0M38582i.containsKey("_meta"))) {
            return C4127p0.INSTANCE.serializer();
        }
        return null;
    }

    /* JADX INFO: renamed from: y */
    public static final InterfaceC8645a m16195y(AbstractC9957l abstractC9957l) {
        abstractC9957l.getClass();
        String strM16186p = m16186p(abstractC9957l);
        if (strM16186p != null) {
            return (InterfaceC8645a) m16187q().get(strM16186p);
        }
        return null;
    }

    /* JADX INFO: renamed from: z */
    public static final InterfaceC8645a m16196z(String str) {
        str.getClass();
        return (InterfaceC8645a) m16188r().get(str);
    }
}
