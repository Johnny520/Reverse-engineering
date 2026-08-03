package bi;

import p071f1.InterfaceC1026r0;
import p117i0.C1836h0;
import p117i0.C1851l;
import p117i0.C1858m2;
import p306v.AbstractC4360e;
import p378z6.C6101a;
import p378z6.C6104d;

/* JADX INFO: renamed from: bi.k */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0323k {

    /* JADX INFO: renamed from: a */
    public static final C1858m2 f957a = new C1858m2(new C0315c(2));

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final InterfaceC1026r0 m1248a(C1836h0 c1836h0) {
        boolean zBooleanValue = ((Boolean) c1836h0.m4542j(f957a)).booleanValue();
        boolean zM4536g = c1836h0.m4536g(zBooleanValue);
        Object objM4514P = c1836h0.m4514P();
        if (zM4536g || objM4514P == C1851l.f6155a) {
            objM4514P = zBooleanValue ? new C6101a() : AbstractC4360e.f14557a;
            c1836h0.m4545k0(objM4514P);
        }
        return (InterfaceC1026r0) objM4514P;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final InterfaceC1026r0 m1249b(float f3, C1836h0 c1836h0, int i9) {
        boolean zBooleanValue = ((Boolean) c1836h0.m4542j(f957a)).booleanValue();
        boolean zM4536g = ((((i9 & 14) ^ 6) > 4 && c1836h0.m4528c(f3)) || (i9 & 6) == 4) | c1836h0.m4536g(zBooleanValue);
        Object objM4514P = c1836h0.m4514P();
        if (zM4536g || objM4514P == C1851l.f6155a) {
            objM4514P = zBooleanValue ? new C6104d(f3) : AbstractC4360e.m8800a(f3);
            c1836h0.m4545k0(objM4514P);
        }
        return (InterfaceC1026r0) objM4514P;
    }
}
