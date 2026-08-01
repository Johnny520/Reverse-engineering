package p345xc;

import bd.AbstractC1109b;
import p215oc.C5725t;
import p300uc.InterfaceC8645a;
import p329wc.InterfaceC9218f;

/* JADX INFO: renamed from: xc.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC9485c {

    /* JADX INFO: renamed from: a */
    public static final a f32218a = a.f32219a;

    /* JADX INFO: renamed from: xc.c$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ a f32219a = new a();
    }

    /* JADX INFO: renamed from: A */
    static /* synthetic */ Object m36978A(InterfaceC9485c interfaceC9485c, InterfaceC9218f interfaceC9218f, int i10, InterfaceC8645a interfaceC8645a, Object obj, int i11, Object obj2) {
        if (obj2 != null) {
            C5725t.m23179a("Super calls with default arguments not supported in this target, function: decodeSerializableElement");
            return null;
        }
        if ((i11 & 8) != 0) {
            obj = null;
        }
        return interfaceC9485c.mo895x(interfaceC9218f, i10, interfaceC8645a, obj);
    }

    /* JADX INFO: renamed from: C */
    Object mo36949C(InterfaceC9218f interfaceC9218f, int i10, InterfaceC8645a interfaceC8645a, Object obj);

    /* JADX INFO: renamed from: H */
    short mo36950H(InterfaceC9218f interfaceC9218f, int i10);

    /* JADX INFO: renamed from: a */
    AbstractC1109b mo672a();

    /* JADX INFO: renamed from: d */
    void mo675d(InterfaceC9218f interfaceC9218f);

    /* JADX INFO: renamed from: g */
    byte mo36953g(InterfaceC9218f interfaceC9218f, int i10);

    /* JADX INFO: renamed from: l */
    int mo36954l(InterfaceC9218f interfaceC9218f, int i10);

    /* JADX INFO: renamed from: m */
    String mo36955m(InterfaceC9218f interfaceC9218f, int i10);

    /* JADX INFO: renamed from: o */
    double mo36956o(InterfaceC9218f interfaceC9218f, int i10);

    /* JADX INFO: renamed from: q */
    InterfaceC9487e mo36957q(InterfaceC9218f interfaceC9218f, int i10);

    /* JADX INFO: renamed from: r */
    default boolean mo36958r() {
        return false;
    }

    /* JADX INFO: renamed from: s */
    default int mo36959s(InterfaceC9218f interfaceC9218f) {
        interfaceC9218f.getClass();
        return -1;
    }

    /* JADX INFO: renamed from: t */
    boolean mo36960t(InterfaceC9218f interfaceC9218f, int i10);

    /* JADX INFO: renamed from: u */
    float mo36961u(InterfaceC9218f interfaceC9218f, int i10);

    /* JADX INFO: renamed from: v */
    int mo788v(InterfaceC9218f interfaceC9218f);

    /* JADX INFO: renamed from: w */
    char mo36962w(InterfaceC9218f interfaceC9218f, int i10);

    /* JADX INFO: renamed from: x */
    Object mo895x(InterfaceC9218f interfaceC9218f, int i10, InterfaceC8645a interfaceC8645a, Object obj);

    /* JADX INFO: renamed from: y */
    long mo36963y(InterfaceC9218f interfaceC9218f, int i10);
}
