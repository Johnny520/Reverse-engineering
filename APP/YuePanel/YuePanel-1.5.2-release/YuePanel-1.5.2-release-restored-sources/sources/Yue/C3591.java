package Yue;

import Yue.C7101;
import Yue.C7141;
import Yue.InterfaceC5491;
import java.io.IOException;
import java.util.List;
import net.bytebuddy.jar.asm.signature.SignatureVisitor;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۢ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nBridgeInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BridgeInterceptor.kt\nokhttp3/internal/http/BridgeInterceptor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,117:1\n1864#2,3:118\n*S KotlinDebug\n*F\n+ 1 BridgeInterceptor.kt\nokhttp3/internal/http/BridgeInterceptor\n*L\n111#1:118,3\n*E\n"})
public final class C3591 implements InterfaceC5491 {

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC6399
    public final InterfaceC4217 f402;

    public C3591(@InterfaceC6399 InterfaceC4217 interfaceC4217) {
        C5499.m17103(interfaceC4217, "cookieJar");
        this.f402 = interfaceC4217;
    }

    @Override // Yue.InterfaceC5491
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ */
    public C7141 mo638(@InterfaceC6399 InterfaceC5491.InterfaceC0776 interfaceC0776) throws IOException {
        AbstractC7142 abstractC7142M22311;
        C5499.m17103(interfaceC0776, "chain");
        C7101 c7101Mo2248 = interfaceC0776.mo2248();
        C7101.C1165 c1165M22157 = c7101Mo2248.m22157();
        AbstractC7103 abstractC7103M22149 = c7101Mo2248.m22149();
        if (abstractC7103M22149 != null) {
            C6149 c6149Mo1885 = abstractC7103M22149.mo1885();
            if (c6149Mo1885 != null) {
                c1165M22157.m22172(C5375.f13182, c6149Mo1885.toString());
            }
            long jMo1884 = abstractC7103M22149.mo1884();
            if (jMo1884 != -1) {
                c1165M22157.m22172("Content-Length", String.valueOf(jMo1884));
                c1165M22157.m22178("Transfer-Encoding");
            } else {
                c1165M22157.m22172("Transfer-Encoding", "chunked");
                c1165M22157.m22178("Content-Length");
            }
        }
        boolean z = false;
        if (c7101Mo2248.m22152("Host") == null) {
            c1165M22157.m22172("Host", C8158.m26888(c7101Mo2248.m22160(), false, 1, null));
        }
        if (c7101Mo2248.m22152(C4515.f9612) == null) {
            c1165M22157.m22172(C4515.f9612, "Keep-Alive");
        }
        if (c7101Mo2248.m22152("Accept-Encoding") == null && c7101Mo2248.m22152("Range") == null) {
            c1165M22157.m22172("Accept-Encoding", "gzip");
            z = true;
        }
        List<C4216> listMo1180 = this.f402.mo1180(c7101Mo2248.m22160());
        if (!listMo1180.isEmpty()) {
            c1165M22157.m22172(C4219.f8574, m639(listMo1180));
        }
        if (c7101Mo2248.m22152(C5375.f13181) == null) {
            c1165M22157.m22172(C5375.f13181, C8158.f24184);
        }
        C7141 c7141Mo17083 = interfaceC0776.mo17083(c1165M22157.m3393());
        C5379.m16730(this.f402, c7101Mo2248.m22160(), c7141Mo17083.m22320());
        C7141.C1185 c1185M22362 = c7141Mo17083.m22326().m22362(c7101Mo2248);
        if (z && C7627.m23974("gzip", C7141.m22298(c7141Mo17083, C5375.f13179, null, 2, null), true) && C5379.m16726(c7141Mo17083) && (abstractC7142M22311 = c7141Mo17083.m22311()) != null) {
            C5230 c5230 = new C5230(abstractC7142M22311.mo9919());
            c1185M22362.m22354(c7141Mo17083.m22320().m16116().m16129(C5375.f13179).m16129("Content-Length").m16126());
            c1185M22362.m3432(new C7032(C7141.m22298(c7141Mo17083, C5375.f13182, null, 2, null), -1L, C6542.m20831(c5230)));
        }
        return c1185M22362.m22334();
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public final String m639(List<C4216> list) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                C3880.m10753();
            }
            C4216 c4216 = (C4216) obj;
            if (i > 0) {
                sb.append(C4219.f748);
            }
            sb.append(c4216.m12130());
            sb.append(SignatureVisitor.INSTANCEOF);
            sb.append(c4216.m12135());
            i = i2;
        }
        String string = sb.toString();
        C5499.m17102(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
