package p157k8;

import p024b9.AbstractC1052o0;
import p024b9.AbstractC1061t;
import p300uc.InterfaceC8645a;
import p375zc.AbstractC9953j;
import p375zc.AbstractC9957l;

/* JADX INFO: renamed from: k8.x3 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4186x3 extends AbstractC9953j {

    /* JADX INFO: renamed from: c */
    public static final C4186x3 f12295c = new C4186x3();

    public C4186x3() {
        super(AbstractC1052o0.m3807b(InterfaceC4172v3.class));
    }

    @Override // p375zc.AbstractC9953j
    /* JADX INFO: renamed from: g */
    public InterfaceC8645a mo15983g(AbstractC9957l abstractC9957l) {
        abstractC9957l.getClass();
        String strM16189s = AbstractC4076h5.m16189s(abstractC9957l);
        if (AbstractC1061t.m3842c(strM16189s, EnumC4200z3.f12322s.getValue())) {
            return C4130p3.INSTANCE.serializer();
        }
        if (AbstractC1061t.m3842c(strM16189s, EnumC4200z3.f12323t.getValue())) {
            return C4159t4.INSTANCE.serializer();
        }
        C4179w3.m16561a("Unknown reference type: ", AbstractC4076h5.m16190t(abstractC9957l));
        return null;
    }
}
