package p277t2;

import p010a9.InterfaceC0188p;
import p024b9.AbstractC1067w;
import p172l8.InterfaceC4695g;

/* JADX INFO: renamed from: t2.e0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C8068e0 extends AbstractC1067w implements InterfaceC0188p {

    /* JADX INFO: renamed from: r */
    public static final C8068e0 f26944r = new C8068e0();

    public C8068e0() {
        super(2);
    }

    @Override // p010a9.InterfaceC0188p
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C8059a invoke(C8059a c8059a, C8059a c8059a2) {
        String strM30987b;
        InterfaceC4695g interfaceC4695gM30986a;
        if (c8059a == null || (strM30987b = c8059a.m30987b()) == null) {
            strM30987b = c8059a2.m30987b();
        }
        if (c8059a == null || (interfaceC4695gM30986a = c8059a.m30986a()) == null) {
            interfaceC4695gM30986a = c8059a2.m30986a();
        }
        return new C8059a(strM30987b, interfaceC4695gM30986a);
    }
}
