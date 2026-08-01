package p000A;

import p029F0.InterfaceC0430v;
import p092S0.C1257J;
import p204n0.C2684c;

/* JADX INFO: renamed from: A.S0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0036S0 {

    /* JADX INFO: renamed from: a */
    public final C1257J f161a;

    /* JADX INFO: renamed from: b */
    public InterfaceC0430v f162b = null;

    /* JADX INFO: renamed from: c */
    public InterfaceC0430v f163c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0036S0(C1257J c1257j, InterfaceC0430v interfaceC0430v) {
        this.f161a = c1257j;
        this.f163c = interfaceC0430v;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final long m20a(long j5) {
        C2684c c2684cMo634K;
        InterfaceC0430v interfaceC0430v = this.f162b;
        C2684c c2684c = C2684c.f8557e;
        if (interfaceC0430v != null) {
            if (interfaceC0430v.mo632D()) {
                InterfaceC0430v interfaceC0430v2 = this.f163c;
                c2684cMo634K = interfaceC0430v2 != null ? interfaceC0430v2.mo634K(interfaceC0430v, true) : null;
            } else {
                c2684cMo634K = c2684c;
            }
            if (c2684cMo634K != null) {
                c2684c = c2684cMo634K;
            }
        }
        int i5 = (int) (j5 >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i5);
        float fIntBitsToFloat2 = c2684c.f8558a;
        if (fIntBitsToFloat >= fIntBitsToFloat2) {
            float fIntBitsToFloat3 = Float.intBitsToFloat(i5);
            fIntBitsToFloat2 = c2684c.f8560c;
            if (fIntBitsToFloat3 <= fIntBitsToFloat2) {
                fIntBitsToFloat2 = Float.intBitsToFloat(i5);
            }
        }
        int i6 = (int) (j5 & 4294967295L);
        float fIntBitsToFloat4 = Float.intBitsToFloat(i6);
        float fIntBitsToFloat5 = c2684c.f8559b;
        if (fIntBitsToFloat4 >= fIntBitsToFloat5) {
            float fIntBitsToFloat6 = Float.intBitsToFloat(i6);
            fIntBitsToFloat5 = c2684c.f8561d;
            if (fIntBitsToFloat6 <= fIntBitsToFloat5) {
                fIntBitsToFloat5 = Float.intBitsToFloat(i6);
            }
        }
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat5)) & 4294967295L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final int m21b(long j5, boolean z5) {
        if (z5) {
            j5 = m20a(j5);
        }
        return this.f161a.f4527b.m2366g(m23d(j5));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final boolean m22c(long j5) {
        long jM23d = m23d(m20a(j5));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (4294967295L & jM23d));
        C1257J c1257j = this.f161a;
        int iM2364e = c1257j.f4527b.m2364e(fIntBitsToFloat);
        int i5 = (int) (jM23d >> 32);
        return Float.intBitsToFloat(i5) >= c1257j.m2327d(iM2364e) && Float.intBitsToFloat(i5) <= c1257j.m2328e(iM2364e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final long m23d(long j5) {
        InterfaceC0430v interfaceC0430v;
        InterfaceC0430v interfaceC0430v2 = this.f162b;
        if (interfaceC0430v2 == null) {
            return j5;
        }
        if (!interfaceC0430v2.mo632D()) {
            interfaceC0430v2 = null;
        }
        if (interfaceC0430v2 == null || (interfaceC0430v = this.f163c) == null) {
            return j5;
        }
        InterfaceC0430v interfaceC0430v3 = interfaceC0430v.mo632D() ? interfaceC0430v : null;
        return interfaceC0430v3 == null ? j5 : interfaceC0430v2.mo636P(interfaceC0430v3, j5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final long m24e(long j5) {
        InterfaceC0430v interfaceC0430v;
        InterfaceC0430v interfaceC0430v2 = this.f162b;
        if (interfaceC0430v2 == null) {
            return j5;
        }
        if (!interfaceC0430v2.mo632D()) {
            interfaceC0430v2 = null;
        }
        if (interfaceC0430v2 == null || (interfaceC0430v = this.f163c) == null) {
            return j5;
        }
        InterfaceC0430v interfaceC0430v3 = interfaceC0430v.mo632D() ? interfaceC0430v : null;
        return interfaceC0430v3 == null ? j5 : interfaceC0430v3.mo636P(interfaceC0430v2, j5);
    }
}
