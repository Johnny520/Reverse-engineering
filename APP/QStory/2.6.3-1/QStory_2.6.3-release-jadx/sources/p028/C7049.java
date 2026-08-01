package p028;

import androidx.compose.foundation.lazy.layout.C1575;
import androidx.compose.p001ui.graphics.vector.C2397;
import androidx.compose.runtime.internal.C2080;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.reflect.jvm.internal.types.AbstractC5754;
import kotlin.text.Regex;
import okhttp3.internal.http2.ConnectionShutdownException;
import p023.AbstractC6962;
import p023.C6949;
import p023.C6954;
import p023.C6956;
import p023.C6960;
import p023.C6967;
import p023.C6977;
import p023.C6978;
import p023.InterfaceC6969;
import p027.C7032;
import p027.C7035;
import p027.C7036;
import p027.InterfaceC7039;
import p029.AbstractC7059;

/* JADX INFO: renamed from: 飘花落叶言世兰楪哲苏子.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7049 implements InterfaceC6969 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object f17486;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f17487 = 2;

    public C7049(C6967 c6967) {
        c6967.getClass();
        this.f17486 = c6967;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static int m12228(C6960 c6960, int i) {
        String strM12110 = c6960.f17114.m12110("Retry-After");
        if (strM12110 == null) {
            strM12110 = null;
        }
        if (strM12110 == null) {
            return i;
        }
        if (!new Regex("\\d+").matches(strM12110)) {
            return Integer.MAX_VALUE;
        }
        Integer numValueOf = Integer.valueOf(strM12110);
        numValueOf.getClass();
        return numValueOf.intValue();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v27 ￩ﾣﾘ￨ﾊﾱ￨ﾐﾽ￥ﾏﾶ￨ﾨﾀ￤ﾸﾖ￥ﾅﾰ￦ﾥﾪ￥ﾓﾲ￥ﾭﾐ￨ﾋﾏ.￩ﾣﾘ￨ﾊﾱ￨ﾐﾽ￥ﾏﾶ￨ﾨﾀ￥ﾭﾐ￦ﾥﾪ￥ﾓﾲ￥ﾅﾰ￨ﾋﾏ￤ﾸﾖ, still in use, count: 2, list:
          (r0v27 ￩ﾣﾘ￨ﾊﾱ￨ﾐﾽ￥ﾏﾶ￨ﾨﾀ￤ﾸﾖ￥ﾅﾰ￦ﾥﾪ￥ﾓﾲ￥ﾭﾐ￨ﾋﾏ.￩ﾣﾘ￨ﾊﾱ￨ﾐﾽ￥ﾏﾶ￨ﾨﾀ￥ﾭﾐ￦ﾥﾪ￥ﾓﾲ￥ﾅﾰ￨ﾋﾏ￤ﾸﾖ) from 0x015f: MOVE (r36v1 ￩ﾣﾘ￨ﾊﾱ￨ﾐﾽ￥ﾏﾶ￨ﾨﾀ￤ﾸﾖ￥ﾅﾰ￦ﾥﾪ￥ﾓﾲ￥ﾭﾐ￨ﾋﾏ.￩ﾣﾘ￨ﾊﾱ￨ﾐﾽ￥ﾏﾶ￨ﾨﾀ￥ﾭﾐ￦ﾥﾪ￥ﾓﾲ￥ﾅﾰ￨ﾋﾏ￤ﾸﾖ) = (r0v27 ￩ﾣﾘ￨ﾊﾱ￨ﾐﾽ￥ﾏﾶ￨ﾨﾀ￤ﾸﾖ￥ﾅﾰ￦ﾥﾪ￥ﾓﾲ￥ﾭﾐ￨ﾋﾏ.￩ﾣﾘ￨ﾊﾱ￨ﾐﾽ￥ﾏﾶ￨ﾨﾀ￥ﾭﾐ￦ﾥﾪ￥ﾓﾲ￥ﾅﾰ￨ﾋﾏ￤ﾸﾖ) (LINE:352)
          (r0v27 ￩ﾣﾘ￨ﾊﾱ￨ﾐﾽ￥ﾏﾶ￨ﾨﾀ￤ﾸﾖ￥ﾅﾰ￦ﾥﾪ￥ﾓﾲ￥ﾭﾐ￨ﾋﾏ.￩ﾣﾘ￨ﾊﾱ￨ﾐﾽ￥ﾏﾶ￨ﾨﾀ￥ﾭﾐ￦ﾥﾪ￥ﾓﾲ￥ﾅﾰ￨ﾋﾏ￤ﾸﾖ) from 0x014b: MOVE (r36v3 ￩ﾣﾘ￨ﾊﾱ￨ﾐﾽ￥ﾏﾶ￨ﾨﾀ￤ﾸﾖ￥ﾅﾰ￦ﾥﾪ￥ﾓﾲ￥ﾭﾐ￨ﾋﾏ.￩ﾣﾘ￨ﾊﾱ￨ﾐﾽ￥ﾏﾶ￨ﾨﾀ￥ﾭﾐ￦ﾥﾪ￥ﾓﾲ￥ﾅﾰ￨ﾋﾏ￤ﾸﾖ) = (r0v27 ￩ﾣﾘ￨ﾊﾱ￨ﾐﾽ￥ﾏﾶ￨ﾨﾀ￤ﾸﾖ￥ﾅﾰ￦ﾥﾪ￥ﾓﾲ￥ﾭﾐ￨ﾋﾏ.￩ﾣﾘ￨ﾊﾱ￨ﾐﾽ￥ﾏﾶ￨ﾨﾀ￥ﾭﾐ￦ﾥﾪ￥ﾓﾲ￥ﾅﾰ￨ﾋﾏ￤ﾸﾖ) (LINE:332)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    @Override // p023.InterfaceC6969
    public final p023.C6960 intercept(p023.InterfaceC6970 r36) {
        /*
            Method dump skipped, instruction units count: 996
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p028.C7049.intercept(飘花落叶言世兰子哲苏楪.飘花落叶言子楪兰世苏哲):飘花落叶言世兰子哲苏楪.飘花落叶言子世苏哲楪兰");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public boolean m12229(IOException iOException, C7032 c7032, C6954 c6954) {
        AbstractC6962 abstractC6962;
        boolean z = iOException instanceof ConnectionShutdownException;
        if (!((C6956) this.f17486).f17071) {
            return false;
        }
        if ((!z && (((abstractC6962 = c6954.f17058) != null && abstractC6962.mo12082()) || (iOException instanceof FileNotFoundException))) || (iOException instanceof ProtocolException)) {
            return false;
        }
        if (iOException instanceof InterruptedIOException) {
            if (!(iOException instanceof SocketTimeoutException) || !z) {
                return false;
            }
        } else if (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
            return false;
        }
        C1575 c1575 = c7032.f17422;
        if (c1575 == null || !c1575.f2417) {
            return false;
        }
        InterfaceC7039 interfaceC7039 = c7032.f17429;
        interfaceC7039.getClass();
        C7035 c7035Mo11820 = interfaceC7039.mo11820();
        C1575 c15752 = c7032.f17422;
        return c7035Mo11820.m12205(c15752 != null ? c15752.m2100() : null);
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x00e1  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C6954 m12230(C6960 c6960, C1575 c1575) throws ProtocolException {
        C6977 c6977;
        AbstractC6962 abstractC6962;
        C6960 c69602;
        C6949 c6949 = c1575 != null ? c1575.m2100().f17457 : null;
        int i = c6960.f17111;
        C6954 c6954 = c6960.f17118;
        String str = c6954.f17060;
        if (i == 307 || i == 308) {
            C6956 c6956 = (C6956) this.f17486;
            if (c6956.f17088) {
                String strM12110 = c6960.f17114.m12110("Location");
                if (strM12110 == null) {
                    strM12110 = null;
                }
                C6954 c69542 = c6960.f17118;
                if (strM12110 != null) {
                    C6978 c6978 = c69542.f17061;
                    c6978.getClass();
                    try {
                        c6977 = new C6977(0);
                        c6977.m12097(c6978, strM12110);
                    } catch (IllegalArgumentException unused) {
                        c6977 = null;
                    }
                    C6978 c6978M12094 = c6977 != null ? c6977.m12094() : null;
                    if (c6978M12094 != null && (AbstractC5227.m9466(c6978M12094.f17229, c69542.f17061.f17229) || c6956.f17092)) {
                        C2080 c2080M12074 = c69542.m12074();
                        if (AbstractC5754.m10434(str)) {
                            int i2 = c6960.f17111;
                            boolean z = str.equals("PROPFIND") || i2 == 308 || i2 == 307;
                            if (str.equals("PROPFIND") || i2 == 308 || i2 == 307) {
                                c2080M12074.m2718(str, z ? c69542.f17058 : null);
                            } else {
                                c2080M12074.m2718("GET", null);
                            }
                            if (!z) {
                                ((C2397) c2080M12074.f3963).m3404("Transfer-Encoding");
                                ((C2397) c2080M12074.f3963).m3404("Content-Length");
                                ((C2397) c2080M12074.f3963).m3404("Content-Type");
                            }
                        }
                        if (!AbstractC7059.m12257(c69542.f17061, c6978M12094)) {
                            ((C2397) c2080M12074.f3963).m3404("Authorization");
                        }
                        c2080M12074.f3965 = c6978M12094;
                        return new C6954(c2080M12074);
                    }
                }
            }
        } else {
            if (i == 401) {
                ((C6956) this.f17486).f17089.getClass();
                return null;
            }
            if (i == 421) {
                AbstractC6962 abstractC69622 = c6954.f17058;
                if ((abstractC69622 == null || !abstractC69622.mo12082()) && c1575 != null && !AbstractC5227.m9466(((InterfaceC7039) c1575.f2415).mo11820().f17452.f17160.f17226, ((InterfaceC7044) c1575.f2414).mo12226().mo12185().f17047.f17160.f17226)) {
                    C7036 c7036M2100 = c1575.m2100();
                    synchronized (c7036M2100) {
                        c7036M2100.f17466 = true;
                    }
                    return c6960.f17118;
                }
            } else if (i == 503) {
                C6960 c69603 = c6960.f17107;
                if ((c69603 == null || c69603.f17111 != 503) && m12228(c6960, Integer.MAX_VALUE) == 0) {
                    return c6960.f17118;
                }
            } else {
                if (i == 407) {
                    c6949.getClass();
                    if (c6949.f17046.type() != Proxy.Type.HTTP) {
                        throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                    }
                    ((C6956) this.f17486).f17083.getClass();
                    return null;
                }
                if (i != 408) {
                    switch (i) {
                        case 300:
                        case 301:
                        case 302:
                        case 303:
                        default:
                            return null;
                    }
                } else if (((C6956) this.f17486).f17071 && (((abstractC6962 = c6954.f17058) == null || !abstractC6962.mo12082()) && (((c69602 = c6960.f17107) == null || c69602.f17111 != 408) && m12228(c6960, 0) <= 0))) {
                    return c6960.f17118;
                }
            }
        }
        return null;
    }

    public C7049(String str) {
        this.f17486 = str;
    }

    public C7049(C6956 c6956) {
        c6956.getClass();
        this.f17486 = c6956;
    }
}
