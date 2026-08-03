package p099h;

import p016b1.C0166f;
import p071f1.C1034w;
import p116i.AbstractC1742d;
import p116i.AbstractC1748f;
import p116i.C1771m1;
import p116i.C1785r0;
import p116i.InterfaceC1803y;
import p117i0.C1836h0;
import p117i0.C1851l;
import p117i0.InterfaceC1854l2;

/* JADX INFO: renamed from: h.y0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1497y0 {

    /* JADX INFO: renamed from: a */
    public static final C1785r0 f4963a = AbstractC1742d.m4379o(0.0f, 0.0f, null, 7);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final InterfaceC1854l2 m4008a(long j3, InterfaceC1803y interfaceC1803y, C1836h0 c1836h0, int i9, int i10) {
        if ((i10 & 2) != 0) {
            interfaceC1803y = f4963a;
        }
        InterfaceC1803y interfaceC1803y2 = interfaceC1803y;
        String str = (i10 & 4) != 0 ? "ColorAnimation" : "PressFeedback";
        boolean zM4534f = c1836h0.m4534f(C1034w.m2638f(j3));
        Object objM4514P = c1836h0.m4514P();
        if (zM4534f || objM4514P == C1851l.f6155a) {
            C1771m1 c1771m1 = new C1771m1(C1446c.f4796j, new C0166f(C1034w.m2638f(j3), 12));
            c1836h0.m4545k0(c1771m1);
            objM4514P = c1771m1;
        }
        int i11 = i9 << 6;
        return AbstractC1748f.m4393b(new C1034w(j3), (C1771m1) objM4514P, interfaceC1803y2, null, str, c1836h0, (i9 & 14) | ((i9 << 3) & 896) | (57344 & i11) | (i11 & 458752), 8);
    }
}
