package p021;

import androidx.compose.foundation.lazy.layout.C0734;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.text.Regex;
import okhttp3.internal.http2.ConnectionShutdownException;
import p013.C6177;
import p013.C6179;
import p013.InterfaceC6184;
import p015.AbstractC6206;
import p015.C6198;
import p015.C6200;
import p015.C6204;
import p015.C6211;
import p015.InterfaceC6213;

/* JADX INFO: renamed from: 飘花落叶言世兰苏子楪哲.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6258 implements InterfaceC6213 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object f17227;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f17228 = 2;

    public C6258(C6211 c6211) {
        c6211.getClass();
        this.f17227 = c6211;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static int m11739(C6204 c6204, int i) {
        String strM11680 = c6204.f17008.m11680("Retry-After");
        if (strM11680 == null) {
            strM11680 = null;
        }
        if (strM11680 == null) {
            return i;
        }
        if (!new Regex("\\d+").matches(strM11680)) {
            return Integer.MAX_VALUE;
        }
        Integer numValueOf = Integer.valueOf(strM11680);
        numValueOf.getClass();
        return numValueOf.intValue();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v27 ￩ﾣﾘ￨ﾊﾱ￨ﾐﾽ￥ﾏﾶ￨ﾨﾀ￤ﾸﾖ￥ﾅﾰ￦ﾥﾪ￥ﾓﾲ￨ﾋﾏ￥ﾭﾐ.￩ﾣﾘ￨ﾊﾱ￨ﾐﾽ￥ﾏﾶ￨ﾨﾀ￥ﾭﾐ￦ﾥﾪ￥ﾓﾲ￥ﾅﾰ￤ﾸﾖ￨ﾋﾏ, still in use, count: 2, list:
          (r0v27 ￩ﾣﾘ￨ﾊﾱ￨ﾐﾽ￥ﾏﾶ￨ﾨﾀ￤ﾸﾖ￥ﾅﾰ￦ﾥﾪ￥ﾓﾲ￨ﾋﾏ￥ﾭﾐ.￩ﾣﾘ￨ﾊﾱ￨ﾐﾽ￥ﾏﾶ￨ﾨﾀ￥ﾭﾐ￦ﾥﾪ￥ﾓﾲ￥ﾅﾰ￤ﾸﾖ￨ﾋﾏ) from 0x0162: MOVE (r36v1 ￩ﾣﾘ￨ﾊﾱ￨ﾐﾽ￥ﾏﾶ￨ﾨﾀ￤ﾸﾖ￥ﾅﾰ￦ﾥﾪ￥ﾓﾲ￨ﾋﾏ￥ﾭﾐ.￩ﾣﾘ￨ﾊﾱ￨ﾐﾽ￥ﾏﾶ￨ﾨﾀ￥ﾭﾐ￦ﾥﾪ￥ﾓﾲ￥ﾅﾰ￤ﾸﾖ￨ﾋﾏ) = (r0v27 ￩ﾣﾘ￨ﾊﾱ￨ﾐﾽ￥ﾏﾶ￨ﾨﾀ￤ﾸﾖ￥ﾅﾰ￦ﾥﾪ￥ﾓﾲ￨ﾋﾏ￥ﾭﾐ.￩ﾣﾘ￨ﾊﾱ￨ﾐﾽ￥ﾏﾶ￨ﾨﾀ￥ﾭﾐ￦ﾥﾪ￥ﾓﾲ￥ﾅﾰ￤ﾸﾖ￨ﾋﾏ) (LINE:355)
          (r0v27 ￩ﾣﾘ￨ﾊﾱ￨ﾐﾽ￥ﾏﾶ￨ﾨﾀ￤ﾸﾖ￥ﾅﾰ￦ﾥﾪ￥ﾓﾲ￨ﾋﾏ￥ﾭﾐ.￩ﾣﾘ￨ﾊﾱ￨ﾐﾽ￥ﾏﾶ￨ﾨﾀ￥ﾭﾐ￦ﾥﾪ￥ﾓﾲ￥ﾅﾰ￤ﾸﾖ￨ﾋﾏ) from 0x014e: MOVE (r36v3 ￩ﾣﾘ￨ﾊﾱ￨ﾐﾽ￥ﾏﾶ￨ﾨﾀ￤ﾸﾖ￥ﾅﾰ￦ﾥﾪ￥ﾓﾲ￨ﾋﾏ￥ﾭﾐ.￩ﾣﾘ￨ﾊﾱ￨ﾐﾽ￥ﾏﾶ￨ﾨﾀ￥ﾭﾐ￦ﾥﾪ￥ﾓﾲ￥ﾅﾰ￤ﾸﾖ￨ﾋﾏ) = (r0v27 ￩ﾣﾘ￨ﾊﾱ￨ﾐﾽ￥ﾏﾶ￨ﾨﾀ￤ﾸﾖ￥ﾅﾰ￦ﾥﾪ￥ﾓﾲ￨ﾋﾏ￥ﾭﾐ.￩ﾣﾘ￨ﾊﾱ￨ﾐﾽ￥ﾏﾶ￨ﾨﾀ￥ﾭﾐ￦ﾥﾪ￥ﾓﾲ￥ﾅﾰ￤ﾸﾖ￨ﾋﾏ) (LINE:335)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    @Override // p015.InterfaceC6213
    public final p015.C6204 intercept(p015.InterfaceC6214 r36) {
        /*
            Method dump skipped, instruction units count: 1000
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p021.C6258.intercept(飘花落叶言世兰楪子苏哲.飘花落叶言子楪兰世苏哲):飘花落叶言世兰楪子苏哲.飘花落叶言子世苏哲楪兰");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public boolean m11740(IOException iOException, C6177 c6177, C6198 c6198) {
        AbstractC6206 abstractC6206;
        boolean z = iOException instanceof ConnectionShutdownException;
        if (!((C6200) this.f17227).f16965) {
            return false;
        }
        if ((!z && (((abstractC6206 = c6198.f16952) != null && abstractC6206.mo11652()) || (iOException instanceof FileNotFoundException))) || (iOException instanceof ProtocolException)) {
            return false;
        }
        if (iOException instanceof InterruptedIOException) {
            if (!(iOException instanceof SocketTimeoutException) || !z) {
                return false;
            }
        } else if (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
            return false;
        }
        C0734 c0734 = c6177.f16872;
        if (c0734 == null || !c0734.f2071) {
            return false;
        }
        InterfaceC6184 interfaceC6184 = c6177.f16879;
        interfaceC6184.getClass();
        C6179 c6179Mo11199 = interfaceC6184.mo11199();
        C0734 c07342 = c6177.f16872;
        return c6179Mo11199.m11626(c07342 != null ? c07342.m1530() : null);
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x00e1  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p015.C6198 m11741(p015.C6204 r11, androidx.compose.foundation.lazy.layout.C0734 r12) throws java.net.ProtocolException {
        /*
            Method dump skipped, instruction units count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p021.C6258.m11741(飘花落叶言世兰楪子苏哲.飘花落叶言子世苏哲楪兰, androidx.compose.foundation.lazy.layout.飘花落叶言子苏楪哲世兰):飘花落叶言世兰楪子苏哲.飘花落叶言子世楪哲苏兰");
    }

    public C6258(String str) {
        this.f17227 = str;
    }

    public C6258(C6200 c6200) {
        c6200.getClass();
        this.f17227 = c6200;
    }
}
