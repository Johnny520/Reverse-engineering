package p116i;

import gg.AbstractC1416l;
import p010aa.C0035c;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1235p;
import p117i0.AbstractC1874r;
import p117i0.C1836h0;
import p117i0.C1851l;
import p117i0.InterfaceC1809a1;
import p117i0.InterfaceC1854l2;
import sg.AbstractC3978j;
import sg.InterfaceC3975g;

/* JADX INFO: renamed from: i.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1748f {

    /* JADX INFO: renamed from: a */
    public static final C1785r0 f5840a = AbstractC1742d.m4379o(0.0f, 0.0f, null, 7);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        Object obj = AbstractC1798v1.f6003a;
        Float.floatToRawIntBits(1.0f);
        Float.floatToRawIntBits(1.0f);
        Float.floatToRawIntBits(1.0f);
        Float.floatToRawIntBits(1.0f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final InterfaceC1854l2 m4392a(float f3, InterfaceC1763k interfaceC1763k, String str, C1836h0 c1836h0, int i9, int i10) {
        if ((i10 & 8) != 0) {
            str = "FloatAnimation";
        }
        String str2 = str;
        if (interfaceC1763k == f5840a) {
            c1836h0.m4525a0(1144115775);
            boolean zM4528c = c1836h0.m4528c(0.01f);
            Object objM4514P = c1836h0.m4514P();
            if (zM4528c || objM4514P == C1851l.f6155a) {
                objM4514P = AbstractC1742d.m4379o(0.0f, 0.0f, Float.valueOf(0.01f), 3);
                c1836h0.m4545k0(objM4514P);
            }
            interfaceC1763k = (C1785r0) objM4514P;
            c1836h0.m4553p(false);
        } else {
            c1836h0.m4525a0(1144225701);
            c1836h0.m4553p(false);
        }
        return m4393b(Float.valueOf(f3), AbstractC1742d.f5810j, interfaceC1763k, null, str2, c1836h0, (i9 << 3) & 57344, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final InterfaceC1854l2 m4393b(Object obj, C1771m1 c1771m1, InterfaceC1763k interfaceC1763k, Float f3, String str, C1836h0 c1836h0, int i9, int i10) {
        if ((i10 & 8) != 0) {
            f3 = null;
        }
        Object objM4514P = c1836h0.m4514P();
        Object obj2 = C1851l.f6155a;
        if (objM4514P == obj2) {
            objM4514P = AbstractC1874r.m4639u(null);
            c1836h0.m4545k0(objM4514P);
        }
        InterfaceC1809a1 interfaceC1809a1 = (InterfaceC1809a1) objM4514P;
        Object objM4514P2 = c1836h0.m4514P();
        if (objM4514P2 == obj2) {
            objM4514P2 = new C1739c(obj, c1771m1, f3);
            c1836h0.m4545k0(objM4514P2);
        }
        C1739c c1739c = (C1739c) objM4514P2;
        InterfaceC1809a1 interfaceC1809a1M4643y = AbstractC1874r.m4643y(null, c1836h0);
        if (f3 != null && (interfaceC1763k instanceof C1785r0)) {
            C1785r0 c1785r0 = (C1785r0) interfaceC1763k;
            if (!AbstractC1416l.m3825a(c1785r0.f5953c, f3)) {
                interfaceC1763k = new C1785r0(c1785r0.f5951a, c1785r0.f5952b, f3);
            }
        }
        InterfaceC1809a1 interfaceC1809a1M4643y2 = AbstractC1874r.m4643y(interfaceC1763k, c1836h0);
        Object objM4514P3 = c1836h0.m4514P();
        if (objM4514P3 == obj2) {
            objM4514P3 = AbstractC3978j.m8218a(-1, 6, null);
            c1836h0.m4545k0(objM4514P3);
        }
        InterfaceC3975g interfaceC3975g = (InterfaceC3975g) objM4514P3;
        boolean zM4538h = c1836h0.m4538h(interfaceC3975g) | ((((i9 & 14) ^ 6) > 4 && c1836h0.m4538h(obj)) || (6 & i9) == 4);
        Object objM4514P4 = c1836h0.m4514P();
        if (zM4538h || objM4514P4 == obj2) {
            objM4514P4 = new C0035c(interfaceC3975g, 15, obj);
            c1836h0.m4545k0(objM4514P4);
        }
        AbstractC1874r.m4628j((InterfaceC1220a) objM4514P4, c1836h0);
        boolean zM4538h2 = c1836h0.m4538h(interfaceC3975g) | c1836h0.m4538h(c1739c) | c1836h0.m4534f(interfaceC1809a1M4643y2) | c1836h0.m4534f(interfaceC1809a1M4643y);
        Object objM4514P5 = c1836h0.m4514P();
        if (zM4538h2 || objM4514P5 == obj2) {
            Object c1745e = new C1745e(interfaceC3975g, c1739c, interfaceC1809a1M4643y2, interfaceC1809a1M4643y, null);
            c1836h0.m4545k0(c1745e);
            objM4514P5 = c1745e;
        }
        AbstractC1874r.m4624f((InterfaceC1235p) objM4514P5, c1836h0, interfaceC3975g);
        InterfaceC1854l2 interfaceC1854l2 = (InterfaceC1854l2) interfaceC1809a1.getValue();
        return interfaceC1854l2 == null ? c1739c.f5786c : interfaceC1854l2;
    }
}
