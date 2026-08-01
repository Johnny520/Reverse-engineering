package p157k8;

import p024b9.AbstractC1052o0;
import p300uc.InterfaceC8645a;
import p375zc.AbstractC9953j;
import p375zc.AbstractC9957l;

/* JADX INFO: renamed from: k8.b3 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4029b3 extends AbstractC9953j {

    /* JADX INFO: renamed from: c */
    public static final C4029b3 f11793c = new C4029b3();

    public C4029b3() {
        super(AbstractC1052o0.m3807b(InterfaceC4199z2.class));
    }

    @Override // p375zc.AbstractC9953j
    /* JADX INFO: renamed from: g */
    public InterfaceC8645a mo15983g(AbstractC9957l abstractC9957l) {
        abstractC9957l.getClass();
        InterfaceC8645a interfaceC8645aM16191u = AbstractC4076h5.m16191u(abstractC9957l);
        if (interfaceC8645aM16191u != null) {
            return interfaceC8645aM16191u;
        }
        InterfaceC8645a interfaceC8645aM16195y = AbstractC4076h5.m16195y(abstractC9957l);
        return interfaceC8645aM16195y == null ? C4057f0.INSTANCE.serializer() : interfaceC8645aM16195y;
    }
}
