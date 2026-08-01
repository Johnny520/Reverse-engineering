package p007;

import java.io.Closeable;
import java.io.InputStream;
import java.nio.charset.Charset;
import kotlin.AbstractC5187;
import kotlin.text.AbstractC5132;
import okio.ByteString;
import p004.C6092;
import p004.InterfaceC6110;
import p013.AbstractC6225;
import p013.AbstractC6230;

/* JADX INFO: renamed from: 飘花落叶言世兰子哲苏楪.飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6128 implements Closeable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C6129 f16749;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public C6130 f16750;

    static {
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        C6092 c6092 = new C6092();
        c6092.m11471(byteString);
        f16749 = new C6129(null, byteString.size(), c6092);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        AbstractC6225.m11680(mo11167());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public abstract C6144 mo11165();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public abstract long mo11166();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InputStream m11518() {
        return mo11167().mo11490();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final String m11519() {
        Charset charsetM11529;
        InterfaceC6110 interfaceC6110Mo11167 = mo11167();
        String th = null;
        try {
            C6144 c6144Mo11165 = mo11165();
            if (c6144Mo11165 == null || (charsetM11529 = C6144.m11529(c6144Mo11165)) == null) {
                charsetM11529 = AbstractC5132.f14688;
            }
            String strMo11469 = interfaceC6110Mo11167.mo11469(AbstractC6230.m11693(interfaceC6110Mo11167, charsetM11529));
            try {
                interfaceC6110Mo11167.close();
            } catch (Throwable th2) {
                th = th2;
            }
            String str = th;
            th = strMo11469;
            th = str;
        } catch (Throwable th3) {
            th = th3;
            if (interfaceC6110Mo11167 != null) {
                try {
                    interfaceC6110Mo11167.close();
                } catch (Throwable th4) {
                    AbstractC5187.m10216(th, th4);
                }
            }
        }
        if (th == 0) {
            return th;
        }
        throw th;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public abstract InterfaceC6110 mo11167();
}
