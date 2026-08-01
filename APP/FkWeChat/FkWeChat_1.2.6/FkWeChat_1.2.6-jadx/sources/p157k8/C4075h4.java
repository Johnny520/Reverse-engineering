package p157k8;

import p024b9.AbstractC1052o0;
import p300uc.InterfaceC8645a;
import p375zc.AbstractC9953j;
import p375zc.AbstractC9957l;
import p375zc.AbstractC9961n;

/* JADX INFO: renamed from: k8.h4 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4075h4 extends AbstractC9953j {

    /* JADX INFO: renamed from: c */
    public static final C4075h4 f11926c = new C4075h4();

    public C4075h4() {
        super(AbstractC1052o0.m3807b(InterfaceC4068g4.class));
    }

    @Override // p375zc.AbstractC9953j
    /* JADX INFO: renamed from: g */
    public InterfaceC8645a mo15983g(AbstractC9957l abstractC9957l) {
        abstractC9957l.getClass();
        InterfaceC8645a interfaceC8645aM16193w = AbstractC4076h5.m16193w(abstractC9957l);
        if (interfaceC8645aM16193w != null || (interfaceC8645aM16193w = AbstractC4076h5.m16170A(abstractC9957l)) != null) {
            return interfaceC8645aM16193w;
        }
        InterfaceC8645a interfaceC8645aM16194x = AbstractC4076h5.m16194x(abstractC9957l);
        if (interfaceC8645aM16194x != null) {
            return interfaceC8645aM16194x;
        }
        C4179w3.m16561a("Cannot determine RequestResult type from JSON: ", AbstractC9961n.m38582i(abstractC9957l).keySet());
        return null;
    }
}
