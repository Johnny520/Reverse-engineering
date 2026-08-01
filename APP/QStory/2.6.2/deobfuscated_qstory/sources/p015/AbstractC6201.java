package p015;

import java.io.Closeable;
import java.io.InputStream;
import java.nio.charset.Charset;
import kotlin.AbstractC5186;
import kotlin.text.AbstractC5131;
import okio.ByteString;
import p005.C6101;
import p005.InterfaceC6119;
import p017.AbstractC6233;
import p017.AbstractC6238;

/* JADX INFO: renamed from: 飘花落叶言世兰楪子苏哲.飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6201 implements Closeable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C6202 f16988;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public C6203 f16989;

    static {
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        C6101 c6101 = new C6101();
        c6101.m11476(byteString);
        f16988 = new C6202(null, byteString.size(), c6101);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        AbstractC6233.m11690(mo11110());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public abstract C6217 mo11108();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public abstract long mo11109();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InputStream m11647() {
        return mo11110().mo11497();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final String m11648() {
        Charset charsetM11658;
        InterfaceC6119 interfaceC6119Mo11110 = mo11110();
        String th = null;
        try {
            C6217 c6217Mo11108 = mo11108();
            if (c6217Mo11108 == null || (charsetM11658 = C6217.m11658(c6217Mo11108)) == null) {
                charsetM11658 = AbstractC5131.f14688;
            }
            String strMo11473 = interfaceC6119Mo11110.mo11473(AbstractC6238.m11701(interfaceC6119Mo11110, charsetM11658));
            try {
                interfaceC6119Mo11110.close();
            } catch (Throwable th2) {
                th = th2;
            }
            String str = th;
            th = strMo11473;
            th = str;
        } catch (Throwable th3) {
            th = th3;
            if (interfaceC6119Mo11110 != null) {
                try {
                    interfaceC6119Mo11110.close();
                } catch (Throwable th4) {
                    AbstractC5186.m10212(th, th4);
                }
            }
        }
        if (th == 0) {
            return th;
        }
        throw th;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public abstract InterfaceC6119 mo11110();
}
