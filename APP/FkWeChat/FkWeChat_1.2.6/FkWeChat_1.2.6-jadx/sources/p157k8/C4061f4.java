package p157k8;

import p010a9.InterfaceC0173a;
import p024b9.AbstractC1052o0;
import p300uc.C8661o;
import p300uc.InterfaceC8645a;
import p375zc.AbstractC9953j;
import p375zc.AbstractC9957l;

/* JADX INFO: renamed from: k8.f4 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4061f4 extends AbstractC9953j {

    /* JADX INFO: renamed from: c */
    public static final C4061f4 f11886c = new C4061f4();

    public C4061f4() {
        super(AbstractC1052o0.m3807b(InterfaceC4022a4.class));
    }

    /* JADX INFO: renamed from: j */
    public static final Object m16116j(AbstractC9957l abstractC9957l) {
        return "Missing 'method' for Request: " + abstractC9957l;
    }

    @Override // p375zc.AbstractC9953j
    /* JADX INFO: renamed from: g */
    public InterfaceC8645a mo15983g(final AbstractC9957l abstractC9957l) {
        abstractC9957l.getClass();
        String strM16186p = AbstractC4076h5.m16186p(abstractC9957l);
        if (strM16186p == null) {
            AbstractC4076h5.f11927a.mo22825f(new InterfaceC0173a() { // from class: k8.e4
                @Override // p010a9.InterfaceC0173a
                public final Object invoke() {
                    return C4061f4.m16116j(abstractC9957l);
                }
            });
            throw new C8661o("Missing 'method' for Request: " + abstractC9957l);
        }
        InterfaceC8645a interfaceC8645aM16192v = AbstractC4076h5.m16192v(strM16186p);
        if (interfaceC8645aM16192v != null) {
            return interfaceC8645aM16192v;
        }
        InterfaceC8645a interfaceC8645aM16196z = AbstractC4076h5.m16196z(strM16186p);
        return interfaceC8645aM16196z == null ? C4064g0.INSTANCE.serializer() : interfaceC8645aM16196z;
    }
}
