package p023;

import java.io.Closeable;
import java.io.InputStream;
import java.nio.charset.Charset;
import kotlin.AbstractC6019;
import kotlin.text.AbstractC5964;
import okio.ByteString;
import p020.C6921;
import p020.InterfaceC6939;
import p029.AbstractC7054;
import p029.AbstractC7059;

/* JADX INFO: renamed from: 飘花落叶言世兰子哲苏楪.飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6957 implements Closeable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C6958 f17094;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public C6959 f17095;

    static {
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        C6921 c6921 = new C6921();
        c6921.m12030(byteString);
        f17094 = new C6958(null, byteString.size(), c6921);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        AbstractC7054.m12239(mo11726());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public abstract C6973 mo11724();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public abstract long mo11725();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InputStream m12077() {
        return mo11726().mo12049();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final String m12078() {
        Charset charsetM12088;
        InterfaceC6939 interfaceC6939Mo11726 = mo11726();
        String th = null;
        try {
            C6973 c6973Mo11724 = mo11724();
            if (c6973Mo11724 == null || (charsetM12088 = C6973.m12088(c6973Mo11724)) == null) {
                charsetM12088 = AbstractC5964.f15033;
            }
            String strMo12028 = interfaceC6939Mo11726.mo12028(AbstractC7059.m12252(interfaceC6939Mo11726, charsetM12088));
            try {
                interfaceC6939Mo11726.close();
            } catch (Throwable th2) {
                th = th2;
            }
            String str = th;
            th = strMo12028;
            th = str;
        } catch (Throwable th3) {
            th = th3;
            if (interfaceC6939Mo11726 != null) {
                try {
                    interfaceC6939Mo11726.close();
                } catch (Throwable th4) {
                    AbstractC6019.m10775(th, th4);
                }
            }
        }
        if (th == 0) {
            return th;
        }
        throw th;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public abstract InterfaceC6939 mo11726();
}
