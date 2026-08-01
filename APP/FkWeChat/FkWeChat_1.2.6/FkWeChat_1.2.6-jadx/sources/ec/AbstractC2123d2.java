package ec;

import p145jc.C3801d0;

/* JADX INFO: renamed from: ec.d2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2123d2 {

    /* JADX INFO: renamed from: a */
    public static final C3801d0 f5938a = new C3801d0("COMPLETING_ALREADY");

    /* JADX INFO: renamed from: b */
    public static final C3801d0 f5939b = new C3801d0("COMPLETING_WAITING_CHILDREN");

    /* JADX INFO: renamed from: c */
    public static final C3801d0 f5940c = new C3801d0("COMPLETING_RETRY");

    /* JADX INFO: renamed from: d */
    public static final C3801d0 f5941d = new C3801d0("TOO_LATE_TO_CANCEL");

    /* JADX INFO: renamed from: e */
    public static final C3801d0 f5942e = new C3801d0("SEALED");

    /* JADX INFO: renamed from: f */
    public static final C2138h1 f5943f = new C2138h1(false);

    /* JADX INFO: renamed from: g */
    public static final C2138h1 f5944g = new C2138h1(true);

    /* JADX INFO: renamed from: g */
    public static final Object m7736g(Object obj) {
        return obj instanceof InterfaceC2182s1 ? new C2186t1((InterfaceC2182s1) obj) : obj;
    }

    /* JADX INFO: renamed from: h */
    public static final Object m7737h(Object obj) {
        InterfaceC2182s1 interfaceC2182s1;
        C2186t1 c2186t1 = obj instanceof C2186t1 ? (C2186t1) obj : null;
        return (c2186t1 == null || (interfaceC2182s1 = c2186t1.f6011a) == null) ? obj : interfaceC2182s1;
    }
}
