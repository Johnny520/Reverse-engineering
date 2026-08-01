package p015;

import java.io.EOFException;
import java.util.Iterator;
import java.util.List;
import kotlin.text.Regex;
import okio.ByteString;
import p005.C6101;
import p005.InterfaceC6120;
import p253.AbstractC8189;

/* JADX INFO: renamed from: 飘花落叶言世兰楪子苏哲.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6215 extends AbstractC6206 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C6217 f17058;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final byte[] f17059;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C6217 f17060;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final byte[] f17061;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final byte[] f17062;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public long f17063;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C6217 f17064;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final List f17065;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ByteString f17066;

    static {
        Regex regex = C6217.f17098;
        f17058 = AbstractC8189.m13679("multipart/mixed");
        AbstractC8189.m13679("multipart/alternative");
        AbstractC8189.m13679("multipart/digest");
        AbstractC8189.m13679("multipart/parallel");
        f17060 = AbstractC8189.m13679("multipart/form-data");
        f17059 = new byte[]{58, 32};
        f17061 = new byte[]{13, 10};
        f17062 = new byte[]{45, 45};
    }

    public C6215(ByteString byteString, C6217 c6217, List list) {
        byteString.getClass();
        c6217.getClass();
        list.getClass();
        this.f17066 = byteString;
        this.f17065 = list;
        Regex regex = C6217.f17098;
        this.f17064 = AbstractC8189.m13679(c6217 + "; boundary=" + byteString.utf8());
        this.f17063 = -1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final long m11657(InterfaceC6120 interfaceC6120, boolean z) throws EOFException {
        C6101 c6101;
        InterfaceC6120 c61012;
        if (z) {
            c61012 = new C6101();
            c6101 = c61012;
        } else {
            c6101 = 0;
            c61012 = interfaceC6120;
        }
        List list = this.f17065;
        int size = list.size();
        long j = 0;
        int i = 0;
        while (true) {
            ByteString byteString = this.f17066;
            byte[] bArr = f17062;
            byte[] bArr2 = f17061;
            if (i >= size) {
                c61012.getClass();
                c61012.write(bArr);
                c61012.mo11464(byteString);
                c61012.write(bArr);
                c61012.write(bArr2);
                if (!z) {
                    return j;
                }
                c6101.getClass();
                long j2 = j + c6101.f16657;
                c6101.m11481();
                return j2;
            }
            C6218 c6218 = (C6218) list.get(i);
            C6224 c6224 = c6218.f17103;
            AbstractC6206 abstractC6206 = c6218.f17102;
            c61012.getClass();
            c61012.write(bArr);
            c61012.mo11464(byteString);
            c61012.write(bArr2);
            int size2 = c6224.size();
            for (int i2 = 0; i2 < size2; i2++) {
                c61012.mo11477(c6224.m11679(i2)).write(f17059).mo11477(c6224.m11681(i2)).write(bArr2);
            }
            C6217 c6217Mo11096 = abstractC6206.mo11096();
            if (c6217Mo11096 != null) {
                c61012.mo11477("Content-Type: ").mo11477(c6217Mo11096.f17101).write(bArr2);
            }
            long jMo11097 = abstractC6206.mo11097();
            if (jMo11097 == -1 && z) {
                c6101.getClass();
                c6101.m11481();
                return -1L;
            }
            c61012.write(bArr2);
            if (z) {
                j += jMo11097;
            } else {
                abstractC6206.mo11095(c61012);
            }
            c61012.write(bArr2);
            i++;
        }
    }

    @Override // p015.AbstractC6206
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo11095(InterfaceC6120 interfaceC6120) throws EOFException {
        m11657(interfaceC6120, false);
    }

    @Override // p015.AbstractC6206
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final boolean mo11652() {
        List list = this.f17065;
        if (list != null && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((C6218) it.next()).f17102.mo11652()) {
                return true;
            }
        }
        return false;
    }

    @Override // p015.AbstractC6206
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final C6217 mo11096() {
        return this.f17064;
    }

    @Override // p015.AbstractC6206
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final long mo11097() throws EOFException {
        long j = this.f17063;
        if (j != -1) {
            return j;
        }
        long jM11657 = m11657(null, true);
        this.f17063 = jM11657;
        return jM11657;
    }
}
