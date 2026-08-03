package p099h;

import java.util.LinkedHashMap;
import p116i.AbstractC1742d;
import p116i.C1768l1;
import p116i.C1771m1;
import p116i.C1785r0;
import p116i.InterfaceC1803y;
import p293u2.C4240j;
import p293u2.C4242l;

/* JADX INFO: renamed from: h.m0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1473m0 {

    /* JADX INFO: renamed from: a */
    public static final C1771m1 f4891a = new C1771m1(C1446c.f4797k, C1446c.f4798l);

    /* JADX INFO: renamed from: b */
    public static final C1785r0 f4892b = AbstractC1742d.m4379o(0.0f, 400.0f, null, 5);

    /* JADX INFO: renamed from: c */
    public static final C1785r0 f4893c;

    /* JADX INFO: renamed from: d */
    public static final C1785r0 f4894d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        AbstractC1742d.m4379o(0.0f, 400.0f, null, 5);
        long j3 = 1;
        long j4 = (j3 & 4294967295L) | (j3 << 32);
        f4893c = AbstractC1742d.m4379o(0.0f, 400.0f, new C4240j(j4), 1);
        f4894d = AbstractC1742d.m4379o(0.0f, 400.0f, new C4242l(j4), 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static C1483r0 m3996a(InterfaceC1803y interfaceC1803y, int i9) {
        if ((i9 & 1) != 0) {
            interfaceC1803y = AbstractC1742d.m4379o(0.0f, 400.0f, null, 5);
        }
        return new C1483r0(new C1463h1(new C1487t0(interfaceC1803y), (C1457f1) null, (AbstractC1441a0) null, (AbstractC1441a0) null, (LinkedHashMap) null, 126));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static C1485s0 m3997b(C1768l1 c1768l1, int i9) {
        InterfaceC1803y interfaceC1803yM4379o = c1768l1;
        if ((i9 & 1) != 0) {
            interfaceC1803yM4379o = AbstractC1742d.m4379o(0.0f, 400.0f, null, 5);
        }
        return new C1485s0(new C1463h1(new C1487t0(interfaceC1803yM4379o), (C1457f1) null, (AbstractC1441a0) null, (AbstractC1441a0) null, (LinkedHashMap) null, 126));
    }
}
