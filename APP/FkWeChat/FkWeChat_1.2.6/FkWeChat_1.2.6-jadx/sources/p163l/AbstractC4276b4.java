package p163l;

import java.util.Map;
import p024b9.C1047m;
import p024b9.C1059s;
import p121i3.C3179i;
import p121i3.C3181k;
import p121i3.C3185o;
import p121i3.C3189s;
import p172l8.AbstractC4717x;
import p172l8.C4711r;
import p185m8.AbstractC5109u0;
import p250r1.C6455e;
import p250r1.C6457g;
import p250r1.C6461k;

/* JADX INFO: renamed from: l.b4 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4276b4 {

    /* JADX INFO: renamed from: a */
    public static final C6457g f12520a;

    /* JADX INFO: renamed from: b */
    public static final Map f12521b;

    static {
        Float fValueOf = Float.valueOf(0.5f);
        f12520a = new C6457g(0.5f, 0.5f, 0.5f, 0.5f);
        InterfaceC4365t2 interfaceC4365t2M17026u = AbstractC4336n3.m17026u(C1059s.f3213a);
        Float fValueOf2 = Float.valueOf(1.0f);
        C4711r c4711rM18815a = AbstractC4717x.m18815a(interfaceC4365t2M17026u, fValueOf2);
        C4711r c4711rM18815a2 = AbstractC4717x.m18815a(AbstractC4336n3.m17030y(C3189s.f8481b), fValueOf2);
        C4711r c4711rM18815a3 = AbstractC4717x.m18815a(AbstractC4336n3.m17029x(C3185o.f8471b), fValueOf2);
        C4711r c4711rM18815a4 = AbstractC4717x.m18815a(AbstractC4336n3.m17025t(C1047m.f3206a), Float.valueOf(0.01f));
        C4711r c4711rM18815a5 = AbstractC4717x.m18815a(AbstractC4336n3.m17004A(C6457g.f20319e), fValueOf);
        C4711r c4711rM18815a6 = AbstractC4717x.m18815a(AbstractC4336n3.m17005B(C6461k.f20335b), fValueOf);
        C4711r c4711rM18815a7 = AbstractC4717x.m18815a(AbstractC4336n3.m17031z(C6455e.f20314b), fValueOf);
        InterfaceC4365t2 interfaceC4365t2M17027v = AbstractC4336n3.m17027v(C3179i.f8458r);
        Float fValueOf3 = Float.valueOf(0.1f);
        f12521b = AbstractC5109u0.m20771l(c4711rM18815a, c4711rM18815a2, c4711rM18815a3, c4711rM18815a4, c4711rM18815a5, c4711rM18815a6, c4711rM18815a7, AbstractC4717x.m18815a(interfaceC4365t2M17027v, fValueOf3), AbstractC4717x.m18815a(AbstractC4336n3.m17028w(C3181k.f8463b), fValueOf3));
    }

    /* JADX INFO: renamed from: a */
    public static final float m16807a(C3179i.a aVar) {
        return C3179i.m12003k(0.1f);
    }

    /* JADX INFO: renamed from: b */
    public static final int m16808b(C1059s c1059s) {
        return 1;
    }

    /* JADX INFO: renamed from: c */
    public static final long m16809c(C3185o.a aVar) {
        long j10 = 1;
        return C3185o.m12044d((j10 & 4294967295L) | (j10 << 32));
    }

    /* JADX INFO: renamed from: d */
    public static final long m16810d(C3189s.a aVar) {
        long j10 = 1;
        return C3189s.m12082c((j10 & 4294967295L) | (j10 << 32));
    }

    /* JADX INFO: renamed from: e */
    public static final long m16811e(C6455e.a aVar) {
        return C6455e.m25551e((((long) Float.floatToRawIntBits(0.5f)) << 32) | (((long) Float.floatToRawIntBits(0.5f)) & 4294967295L));
    }

    /* JADX INFO: renamed from: f */
    public static final long m16812f(C6461k.a aVar) {
        return C6461k.m25616d((((long) Float.floatToRawIntBits(0.5f)) << 32) | (((long) Float.floatToRawIntBits(0.5f)) & 4294967295L));
    }

    /* JADX INFO: renamed from: g */
    public static final C6457g m16813g(C6457g.a aVar) {
        return f12520a;
    }

    /* JADX INFO: renamed from: h */
    public static final Map m16814h() {
        return f12521b;
    }
}
