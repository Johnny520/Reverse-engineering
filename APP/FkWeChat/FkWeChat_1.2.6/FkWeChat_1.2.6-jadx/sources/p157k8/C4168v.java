package p157k8;

import p024b9.AbstractC1052o0;
import p024b9.AbstractC1061t;
import p300uc.InterfaceC8645a;
import p375zc.AbstractC9953j;
import p375zc.AbstractC9957l;

/* JADX INFO: renamed from: k8.v */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4168v extends AbstractC9953j {

    /* JADX INFO: renamed from: c */
    public static final C4168v f12241c = new C4168v();

    public C4168v() {
        super(AbstractC1052o0.m3807b(InterfaceC4161u.class));
    }

    @Override // p375zc.AbstractC9953j
    /* JADX INFO: renamed from: g */
    public InterfaceC8645a mo15983g(AbstractC9957l abstractC9957l) {
        abstractC9957l.getClass();
        String strM16189s = AbstractC4076h5.m16189s(abstractC9957l);
        if (AbstractC1061t.m3842c(strM16189s, EnumC4182x.f12271s.getValue())) {
            return C4153s5.INSTANCE.serializer();
        }
        if (AbstractC1061t.m3842c(strM16189s, EnumC4182x.f12272t.getValue())) {
            return C4019a1.INSTANCE.serializer();
        }
        if (AbstractC1061t.m3842c(strM16189s, EnumC4182x.f12273u.getValue())) {
            return C4041d.INSTANCE.serializer();
        }
        if (AbstractC1061t.m3842c(strM16189s, EnumC4182x.f12274v.getValue())) {
            return C4124o4.INSTANCE.serializer();
        }
        if (AbstractC1061t.m3842c(strM16189s, EnumC4182x.f12275w.getValue())) {
            return C4120o0.INSTANCE.serializer();
        }
        C4179w3.m16561a("Unknown content block type: ", AbstractC4076h5.m16190t(abstractC9957l));
        return null;
    }
}
