package p266s0;

import gg.AbstractC1416l;
import gg.AbstractC1428x;
import java.util.ArrayList;
import p085fg.InterfaceC1235p;
import p117i0.C1836h0;
import p117i0.C1851l;
import p117i0.C1871q;
import p117i0.C1876r1;
import p276sf.InterfaceC3955b;

/* JADX INFO: renamed from: s0.i */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3879i {

    /* JADX INFO: renamed from: a */
    public static final StackTraceElement[] f12734a = new StackTraceElement[0];

    /* JADX INFO: renamed from: b */
    public static final C3880j f12735b = new C3880j(0, new long[0], new Object[0]);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final int m8067a(int i9, int i10) {
        return i9 << (((i10 % 10) * 3) + 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final C3874d m8068b(int i9, InterfaceC3955b interfaceC3955b) {
        return new C3874d(i9, interfaceC3955b, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final long m8069c() {
        return Thread.currentThread().getId();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static final void m8070d(C1836h0 c1836h0, InterfaceC1235p interfaceC1235p) {
        interfaceC1235p.getClass();
        AbstractC1428x.m3838c(2, interfaceC1235p);
        interfaceC1235p.invoke(c1836h0, 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static final C3874d m8071e(int i9, InterfaceC3955b interfaceC3955b, C1836h0 c1836h0) {
        Object objM4514P = c1836h0.m4514P();
        if (objM4514P == C1851l.f6155a) {
            objM4514P = new C3874d(i9, interfaceC3955b, true);
            c1836h0.m4545k0(objM4514P);
        }
        C3874d c3874d = (C3874d) objM4514P;
        if (!c3874d.f12721i.equals(interfaceC3955b)) {
            c3874d.f12721i = interfaceC3955b;
            if (c3874d.f12720h) {
                C1876r1 c1876r1 = c3874d.f12722j;
                if (c1876r1 != null) {
                    C1871q c1871q = c1876r1.f6238a;
                    if (c1871q != null) {
                        c1871q.m4606s(c1876r1, null);
                    }
                    c3874d.f12722j = null;
                }
                ArrayList arrayList = c3874d.f12723k;
                if (arrayList != null) {
                    int size = arrayList.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        C1876r1 c1876r12 = (C1876r1) arrayList.get(i10);
                        C1871q c1871q2 = c1876r12.f6238a;
                        if (c1871q2 != null) {
                            c1871q2.m4606s(c1876r12, null);
                        }
                    }
                    arrayList.clear();
                }
            }
        }
        return c3874d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static final boolean m8072f(C1876r1 c1876r1, C1876r1 c1876r12) {
        return c1876r1 == null || !c1876r1.m4645a() || c1876r1.equals(c1876r12) || AbstractC1416l.m3825a(c1876r1.f6240c, c1876r12.f6240c);
    }
}
