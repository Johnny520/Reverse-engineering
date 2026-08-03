package p174m;

import p000a.AbstractC0000a;
import p015b0.C0146l;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1236q;
import p117i0.AbstractC1874r;
import p117i0.C1836h0;
import p117i0.C1851l;
import p117i0.InterfaceC1809a1;
import p293u2.C4247q;
import p356y0.InterfaceC5853o;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: m.s0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2651s0 {

    /* JADX INFO: renamed from: a */
    public static final C2647r0 f8654a;

    /* JADX INFO: renamed from: b */
    public static final C2647r0 f8655b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int i9 = 3;
        InterfaceC5557c interfaceC5557c = null;
        f8654a = new C2647r0(i9, interfaceC5557c, 0);
        f8655b = new C2647r0(i9, interfaceC5557c, 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static InterfaceC5853o m6111a(InterfaceC5853o interfaceC5853o, C2630n c2630n, InterfaceC1236q interfaceC1236q, InterfaceC1236q interfaceC1236q2) {
        return interfaceC5853o.mo10549d(new C2643q0(c2630n, interfaceC1236q, interfaceC1236q2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final C2630n m6112b(InterfaceC1231l interfaceC1231l, C1836h0 c1836h0) {
        InterfaceC1809a1 interfaceC1809a1M4643y = AbstractC1874r.m4643y(interfaceC1231l, c1836h0);
        Object objM4514P = c1836h0.m4514P();
        if (objM4514P == C1851l.f6155a) {
            C2630n c2630n = new C2630n(new C0146l(interfaceC1809a1M4643y, 8));
            c1836h0.m4545k0(c2630n);
            objM4514P = c2630n;
        }
        return (C2630n) objM4514P;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final long m6113c(long j3) {
        return AbstractC0000a.m59d(Float.isNaN(C4247q.m8544b(j3)) ? 0.0f : C4247q.m8544b(j3), Float.isNaN(C4247q.m8545c(j3)) ? 0.0f : C4247q.m8545c(j3));
    }
}
