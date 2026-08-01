package p012;

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
import p007.AbstractC6133;
import p007.C6125;
import p007.C6127;
import p007.C6131;
import p007.C6138;
import p007.InterfaceC6140;
import p011.C6203;
import p011.C6206;
import p011.InterfaceC6210;

/* JADX INFO: renamed from: 飘花落叶言世兰楪哲苏子.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6220 implements InterfaceC6140 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object f17141;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f17142 = 2;

    public C6220(C6138 c6138) {
        c6138.getClass();
        this.f17141 = c6138;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static int m11669(C6131 c6131, int i) {
        String strM11551 = c6131.f16769.m11551("Retry-After");
        if (strM11551 == null) {
            strM11551 = null;
        }
        if (strM11551 == null) {
            return i;
        }
        if (!new Regex("\\d+").matches(strM11551)) {
            return Integer.MAX_VALUE;
        }
        Integer numValueOf = Integer.valueOf(strM11551);
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
    @Override // p007.InterfaceC6140
    public final p007.C6131 intercept(p007.InterfaceC6141 r36) {
        /*
            Method dump skipped, instruction units count: 996
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p012.C6220.intercept(飘花落叶言世兰子哲苏楪.飘花落叶言子楪兰世苏哲):飘花落叶言世兰子哲苏楪.飘花落叶言子世苏哲楪兰");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public boolean m11670(IOException iOException, C6203 c6203, C6125 c6125) {
        AbstractC6133 abstractC6133;
        boolean z = iOException instanceof ConnectionShutdownException;
        if (!((C6127) this.f17141).f16726) {
            return false;
        }
        if ((!z && (((abstractC6133 = c6125.f16713) != null && abstractC6133.mo11523()) || (iOException instanceof FileNotFoundException))) || (iOException instanceof ProtocolException)) {
            return false;
        }
        if (iOException instanceof InterruptedIOException) {
            if (!(iOException instanceof SocketTimeoutException) || !z) {
                return false;
            }
        } else if (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
            return false;
        }
        C0734 c0734 = c6203.f17077;
        if (c0734 == null || !c0734.f2072) {
            return false;
        }
        InterfaceC6210 interfaceC6210 = c6203.f17084;
        interfaceC6210.getClass();
        C6206 c6206Mo11261 = interfaceC6210.mo11261();
        C0734 c07342 = c6203.f17077;
        return c6206Mo11261.m11646(c07342 != null ? c07342.m1540() : null);
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x00e1  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p007.C6125 m11671(p007.C6131 r11, androidx.compose.foundation.lazy.layout.C0734 r12) throws java.net.ProtocolException {
        /*
            Method dump skipped, instruction units count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p012.C6220.m11671(飘花落叶言世兰子哲苏楪.飘花落叶言子世苏哲楪兰, androidx.compose.foundation.lazy.layout.飘花落叶言子苏楪哲世兰):飘花落叶言世兰子哲苏楪.飘花落叶言子世楪哲苏兰");
    }

    public C6220(String str) {
        this.f17141 = str;
    }

    public C6220(C6127 c6127) {
        c6127.getClass();
        this.f17141 = c6127;
    }
}
