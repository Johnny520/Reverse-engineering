package p375zc;

import ad.AbstractC0256f1;
import ad.C0247c1;
import ad.C0298y;
import p024b9.AbstractC1052o0;
import p024b9.C1062t0;
import p215oc.C5706c;
import p329wc.InterfaceC9218f;
import p361yc.AbstractC9762t0;
import vc.AbstractC8920a;

/* JADX INFO: renamed from: zc.n */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC9961n {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC9218f f33545a = AbstractC9762t0.m38055a("kotlinx.serialization.json.JsonUnquotedLiteral", AbstractC8920a.m34224D(C1062t0.f3215a));

    /* JADX INFO: renamed from: a */
    public static final AbstractC9956k0 m38574a(Boolean bool) {
        return bool == null ? C9944e0.INSTANCE : new C9936a0(bool, false, null, 4, null);
    }

    /* JADX INFO: renamed from: b */
    public static final AbstractC9956k0 m38575b(Number number) {
        return number == null ? C9944e0.INSTANCE : new C9936a0(number, false, null, 4, null);
    }

    /* JADX INFO: renamed from: c */
    public static final AbstractC9956k0 m38576c(String str) {
        return str == null ? C9944e0.INSTANCE : new C9936a0(str, true, null, 4, null);
    }

    /* JADX INFO: renamed from: d */
    public static final Void m38577d(AbstractC9957l abstractC9957l, String str) {
        throw new IllegalArgumentException("Element " + AbstractC1052o0.m3807b(abstractC9957l.getClass()) + " is not a " + str);
    }

    /* JADX INFO: renamed from: e */
    public static final Boolean m38578e(AbstractC9956k0 abstractC9956k0) {
        abstractC9956k0.getClass();
        return AbstractC0256f1.m755d(abstractC9956k0.mo38506a());
    }

    /* JADX INFO: renamed from: f */
    public static final String m38579f(AbstractC9956k0 abstractC9956k0) {
        abstractC9956k0.getClass();
        if (abstractC9956k0 instanceof C9944e0) {
            return null;
        }
        return abstractC9956k0.mo38506a();
    }

    /* JADX INFO: renamed from: g */
    public static final double m38580g(AbstractC9956k0 abstractC9956k0) {
        abstractC9956k0.getClass();
        return Double.parseDouble(abstractC9956k0.mo38506a());
    }

    /* JADX INFO: renamed from: h */
    public static final float m38581h(AbstractC9956k0 abstractC9956k0) {
        abstractC9956k0.getClass();
        return Float.parseFloat(abstractC9956k0.mo38506a());
    }

    /* JADX INFO: renamed from: i */
    public static final C9950h0 m38582i(AbstractC9957l abstractC9957l) {
        abstractC9957l.getClass();
        C9950h0 c9950h0 = abstractC9957l instanceof C9950h0 ? (C9950h0) abstractC9957l : null;
        if (c9950h0 != null) {
            return c9950h0;
        }
        m38577d(abstractC9957l, "JsonObject");
        C5706c.m23089a();
        return null;
    }

    /* JADX INFO: renamed from: j */
    public static final AbstractC9956k0 m38583j(AbstractC9957l abstractC9957l) {
        abstractC9957l.getClass();
        AbstractC9956k0 abstractC9956k0 = abstractC9957l instanceof AbstractC9956k0 ? (AbstractC9956k0) abstractC9957l : null;
        if (abstractC9956k0 != null) {
            return abstractC9956k0;
        }
        m38577d(abstractC9957l, "JsonPrimitive");
        C5706c.m23089a();
        return null;
    }

    /* JADX INFO: renamed from: k */
    public static final InterfaceC9218f m38584k() {
        return f33545a;
    }

    /* JADX INFO: renamed from: l */
    public static final Long m38585l(AbstractC9956k0 abstractC9956k0) {
        abstractC9956k0.getClass();
        try {
            return Long.valueOf(m38586m(abstractC9956k0));
        } catch (C0298y unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: m */
    public static final long m38586m(AbstractC9956k0 abstractC9956k0) {
        abstractC9956k0.getClass();
        return new C0247c1(abstractC9956k0.mo38506a()).m620p();
    }
}
