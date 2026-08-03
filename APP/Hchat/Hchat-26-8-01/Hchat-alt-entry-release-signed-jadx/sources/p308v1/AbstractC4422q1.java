package p308v1;

import okhttp3.internal.p221ws.WebSocketProtocol;
import p069f.C0965w;
import p339x1.C5619k0;

/* JADX INFO: renamed from: v1.q1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4422q1 {

    /* JADX INFO: renamed from: a */
    public static final C0965w f14714a;

    /* JADX INFO: renamed from: b */
    public static final InterfaceC4416o1[] f14715b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        C0965w c0965w = new C0965w(8);
        InterfaceC4416o1.f14701a.getClass();
        C4419p1 c4419p1 = C4413n1.f14697g;
        c0965w.m2379h(1, c4419p1);
        C4419p1 c4419p12 = C4413n1.f14696f;
        c0965w.m2379h(2, c4419p12);
        C4419p1 c4419p13 = C4413n1.f14692b;
        c0965w.m2379h(4, c4419p13);
        C4419p1 c4419p14 = C4413n1.f14694d;
        c0965w.m2379h(8, c4419p14);
        C4419p1 c4419p15 = C4413n1.f14698h;
        c0965w.m2379h(16, c4419p15);
        C4419p1 c4419p16 = C4413n1.f14695e;
        c0965w.m2379h(32, c4419p16);
        C4419p1 c4419p17 = C4413n1.f14699i;
        c0965w.m2379h(64, c4419p17);
        C4419p1 c4419p18 = C4413n1.f14693c;
        c0965w.m2379h(128, c4419p18);
        f14714a = c0965w;
        f14715b = new InterfaceC4416o1[]{c4419p1, c4419p12, c4419p13, c4419p17, c4419p15, c4419p16, c4419p14, C4413n1.f14700j, c4419p18};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final void m8875a(C5619k0 c5619k0, C4408m c4408m, long j3, int i9, int i10) {
        if (AbstractC4434w.m8883g(j3, -1L)) {
            return;
        }
        float f3 = (int) ((j3 >>> 48) & WebSocketProtocol.PAYLOAD_SHORT_MAX);
        float f10 = (int) ((j3 >>> 32) & WebSocketProtocol.PAYLOAD_SHORT_MAX);
        float f11 = i9 - ((int) ((j3 >>> 16) & WebSocketProtocol.PAYLOAD_SHORT_MAX));
        float f12 = i10 - ((int) (j3 & WebSocketProtocol.PAYLOAD_SHORT_MAX));
        c5619k0.m10171e(c4408m.m8871b(), f3);
        c5619k0.m10171e(c4408m.m8873d(), f10);
        c5619k0.m10171e(c4408m.m8872c(), f11);
        c5619k0.m10171e(c4408m.m8870a(), f12);
    }
}
