package Yue;

import Yue.C7141;
import Yue.InterfaceC5491;
import java.io.IOException;
import java.net.ProtocolException;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۦۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C3646 implements InterfaceC5491 {

    /* JADX INFO: renamed from: ۥ۟ */
    public final boolean f439;

    public C3646(boolean z) {
        this.f439 = z;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:38:0x00a8 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:83:0x002c */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* JADX WARN: Type inference failed for: r9v27 */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v29 */
    /* JADX WARN: Type inference failed for: r9v3, types: [Yue.ۥۡۦۧ$ۥ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v30 */
    /* JADX WARN: Type inference failed for: r9v4, types: [Yue.ۥۡۦۧ$ۥ] */
    @Override // Yue.InterfaceC5491
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ */
    public C7141 mo638(@InterfaceC6399 InterfaceC5491.InterfaceC0776 interfaceC0776) throws IOException {
        boolean z;
        ?? r9;
        ?? M14286;
        C7141.C1185 c1185;
        C5499.m17103(interfaceC0776, "chain");
        C7031 c7031 = (C7031) interfaceC0776;
        C4742 c4742M21888 = c7031.m21888();
        C5499.m17100(c4742M21888);
        C7101 c7101M21890 = c7031.m21890();
        AbstractC7103 abstractC7103M22149 = c7101M21890.m22149();
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            c4742M21888.m14292(c7101M21890);
            ?? M2138 = C5383.m2138(c7101M21890.m22156());
            try {
                if (M2138 == 0 || abstractC7103M22149 == null) {
                    c4742M21888.m14284();
                    z = true;
                    M2138 = 0;
                } else {
                    if (C7627.m23974("100-continue", c7101M21890.m22152("Expect"), true)) {
                        c4742M21888.m14274();
                        C7141.C1185 c1185M14286 = c4742M21888.m14286(true);
                        try {
                            c4742M21888.m14288();
                            z = false;
                            c1185 = c1185M14286;
                        } catch (IOException e) {
                            e = e;
                            z = true;
                            r9 = c1185M14286;
                            if (e instanceof C4109) {
                                throw e;
                            }
                            M14286 = r9;
                            if (!c4742M21888.m14279()) {
                                throw e;
                            }
                        }
                    } else {
                        z = true;
                        c1185 = null;
                    }
                    if (c1185 != null) {
                        c4742M21888.m14284();
                        M2138 = c1185;
                        if (!c4742M21888.m14276().m21866()) {
                            c4742M21888.m14283();
                            M2138 = c1185;
                        }
                    } else if (abstractC7103M22149.m22206()) {
                        c4742M21888.m14274();
                        abstractC7103M22149.mo15588(C6542.m20830(c4742M21888.m14271(c7101M21890, true)));
                        M2138 = c1185;
                    } else {
                        InterfaceC3603 interfaceC3603M20830 = C6542.m20830(c4742M21888.m14271(c7101M21890, false));
                        abstractC7103M22149.mo15588(interfaceC3603M20830);
                        interfaceC3603M20830.close();
                        M2138 = c1185;
                    }
                }
                if (abstractC7103M22149 == null || !abstractC7103M22149.m22206()) {
                    c4742M21888.m14273();
                }
                e = null;
                M14286 = M2138;
            } catch (IOException e2) {
                e = e2;
                r9 = M2138;
            }
        } catch (IOException e3) {
            e = e3;
            z = true;
            r9 = 0;
        }
        if (M14286 == 0) {
            try {
                M14286 = c4742M21888.m14286(false);
                C5499.m17100(M14286);
                if (z) {
                    c4742M21888.m14288();
                    z = false;
                }
            } catch (IOException e4) {
                if (e == null) {
                    throw e4;
                }
                C4741.m1656(e, e4);
                throw e;
            }
        }
        C7141 c7141M22334 = M14286.m22362(c7101M21890).m22352(c4742M21888.m14276().mo11695()).m22363(jCurrentTimeMillis).m22360(System.currentTimeMillis()).m22334();
        int iM22315 = c7141M22334.m22315();
        if (m713(iM22315)) {
            C7141.C1185 c1185M142862 = c4742M21888.m14286(false);
            C5499.m17100(c1185M142862);
            if (z) {
                c4742M21888.m14288();
            }
            c7141M22334 = c1185M142862.m22362(c7101M21890).m22352(c4742M21888.m14276().mo11695()).m22363(jCurrentTimeMillis).m22360(System.currentTimeMillis()).m22334();
            iM22315 = c7141M22334.m22315();
        }
        c4742M21888.m14287(c7141M22334);
        C7141 c7141M223342 = (this.f439 && iM22315 == 101) ? c7141M22334.m22326().m3432(C8158.f24177).m22334() : c7141M22334.m22326().m3432(c4742M21888.m14285(c7141M22334)).m22334();
        if (C7627.m23974("close", c7141M223342.m22331().m22152(C4515.f9612), true) || C7627.m23974("close", C7141.m22298(c7141M223342, C4515.f9612, null, 2, null), true)) {
            c4742M21888.m14283();
        }
        if (iM22315 == 204 || iM22315 == 205) {
            AbstractC7142 abstractC7142M22311 = c7141M223342.m22311();
            if ((abstractC7142M22311 != null ? abstractC7142M22311.mo9917() : -1L) > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("HTTP ");
                sb.append(iM22315);
                sb.append(" had non-zero Content-Length: ");
                AbstractC7142 abstractC7142M223112 = c7141M223342.m22311();
                sb.append(abstractC7142M223112 != null ? Long.valueOf(abstractC7142M223112.mo9917()) : null);
                throw new ProtocolException(sb.toString());
            }
        }
        return c7141M223342;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public final boolean m713(int i) {
        if (i == 100) {
            return true;
        }
        return 102 <= i && i < 200;
    }
}
