package p157k8;

import p024b9.AbstractC1052o0;
import p157k8.InterfaceC4030b4;
import p300uc.C8661o;
import p300uc.InterfaceC8645a;
import p375zc.AbstractC9953j;
import p375zc.AbstractC9956k0;
import p375zc.AbstractC9957l;
import p375zc.AbstractC9961n;

/* JADX INFO: renamed from: k8.c4 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4038c4 extends AbstractC9953j {

    /* JADX INFO: renamed from: c */
    public static final C4038c4 f11828c = new C4038c4();

    public C4038c4() {
        super(AbstractC1052o0.m3807b(InterfaceC4030b4.class));
    }

    @Override // p375zc.AbstractC9953j
    /* JADX INFO: renamed from: g */
    public InterfaceC8645a mo15983g(AbstractC9957l abstractC9957l) {
        abstractC9957l.getClass();
        boolean z10 = abstractC9957l instanceof AbstractC9956k0;
        if (z10 && ((AbstractC9956k0) abstractC9957l).mo38507c()) {
            return InterfaceC4030b4.c.INSTANCE.serializer();
        }
        if (z10 && AbstractC9961n.m38585l((AbstractC9956k0) abstractC9957l) != null) {
            return InterfaceC4030b4.b.INSTANCE.serializer();
        }
        throw new C8661o("Invalid RequestId type: " + abstractC9957l);
    }
}
