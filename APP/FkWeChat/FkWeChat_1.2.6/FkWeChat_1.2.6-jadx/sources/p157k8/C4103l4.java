package p157k8;

import p024b9.AbstractC1052o0;
import p300uc.InterfaceC8645a;
import p375zc.AbstractC9953j;
import p375zc.AbstractC9957l;
import p375zc.AbstractC9961n;
import p375zc.C9950h0;

/* JADX INFO: renamed from: k8.l4 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4103l4 extends AbstractC9953j {

    /* JADX INFO: renamed from: c */
    public static final C4103l4 f12036c = new C4103l4();

    public C4103l4() {
        super(AbstractC1052o0.m3807b(InterfaceC4096k4.class));
    }

    @Override // p375zc.AbstractC9953j
    /* JADX INFO: renamed from: g */
    public InterfaceC8645a mo15983g(AbstractC9957l abstractC9957l) {
        abstractC9957l.getClass();
        C9950h0 c9950h0M38582i = AbstractC9961n.m38582i(abstractC9957l);
        return c9950h0M38582i.containsKey("text") ? C4160t5.INSTANCE.serializer() : c9950h0M38582i.containsKey("blob") ? C4063g.INSTANCE.serializer() : C4032b6.INSTANCE.serializer();
    }
}
