package p023;

import com.bumptech.glide.AbstractC3888;
import java.io.EOFException;
import java.util.Iterator;
import java.util.List;
import kotlin.text.Regex;
import okio.ByteString;
import p020.C6921;
import p020.InterfaceC6940;

/* JADX INFO: renamed from: 飘花落叶言世兰子哲苏楪.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6971 extends AbstractC6962 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C6973 f17164;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final byte[] f17165;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C6973 f17166;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final byte[] f17167;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final byte[] f17168;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public long f17169;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C6973 f17170;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final List f17171;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ByteString f17172;

    static {
        Regex regex = C6973.f17204;
        f17164 = AbstractC3888.m7271("multipart/mixed");
        AbstractC3888.m7271("multipart/alternative");
        AbstractC3888.m7271("multipart/digest");
        AbstractC3888.m7271("multipart/parallel");
        f17166 = AbstractC3888.m7271("multipart/form-data");
        f17165 = new byte[]{58, 32};
        f17167 = new byte[]{13, 10};
        f17168 = new byte[]{45, 45};
    }

    public C6971(ByteString byteString, C6973 c6973, List list) {
        byteString.getClass();
        c6973.getClass();
        list.getClass();
        this.f17172 = byteString;
        this.f17171 = list;
        Regex regex = C6973.f17204;
        this.f17170 = AbstractC3888.m7271(c6973 + "; boundary=" + byteString.utf8());
        this.f17169 = -1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final long m12087(InterfaceC6940 interfaceC6940, boolean z) throws EOFException {
        C6921 c6921;
        InterfaceC6940 c69212;
        if (z) {
            c69212 = new C6921();
            c6921 = c69212;
        } else {
            c6921 = 0;
            c69212 = interfaceC6940;
        }
        List list = this.f17171;
        int size = list.size();
        long j = 0;
        int i = 0;
        while (true) {
            ByteString byteString = this.f17172;
            byte[] bArr = f17168;
            byte[] bArr2 = f17167;
            if (i >= size) {
                c69212.getClass();
                c69212.write(bArr);
                c69212.mo12018(byteString);
                c69212.write(bArr);
                c69212.write(bArr2);
                if (!z) {
                    return j;
                }
                c6921.getClass();
                long j2 = j + c6921.f16992;
                c6921.m12034();
                return j2;
            }
            C6974 c6974 = (C6974) list.get(i);
            C6980 c6980 = c6974.f17209;
            AbstractC6962 abstractC6962 = c6974.f17208;
            c69212.getClass();
            c69212.write(bArr);
            c69212.mo12018(byteString);
            c69212.write(bArr2);
            int size2 = c6980.size();
            for (int i2 = 0; i2 < size2; i2++) {
                c69212.mo12022(c6980.m12109(i2)).write(f17165).mo12022(c6980.m12111(i2)).write(bArr2);
            }
            C6973 c6973Mo11712 = abstractC6962.mo11712();
            if (c6973Mo11712 != null) {
                c69212.mo12022("Content-Type: ").mo12022(c6973Mo11712.f17207).write(bArr2);
            }
            long jMo11713 = abstractC6962.mo11713();
            if (jMo11713 == -1 && z) {
                c6921.getClass();
                c6921.m12034();
                return -1L;
            }
            c69212.write(bArr2);
            if (z) {
                j += jMo11713;
            } else {
                abstractC6962.mo11711(c69212);
            }
            c69212.write(bArr2);
            i++;
        }
    }

    @Override // p023.AbstractC6962
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo11711(InterfaceC6940 interfaceC6940) throws EOFException {
        m12087(interfaceC6940, false);
    }

    @Override // p023.AbstractC6962
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final boolean mo12082() {
        List list = this.f17171;
        if (list != null && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((C6974) it.next()).f17208.mo12082()) {
                return true;
            }
        }
        return false;
    }

    @Override // p023.AbstractC6962
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final C6973 mo11712() {
        return this.f17170;
    }

    @Override // p023.AbstractC6962
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final long mo11713() throws EOFException {
        long j = this.f17169;
        if (j != -1) {
            return j;
        }
        long jM12087 = m12087(null, true);
        this.f17169 = jM12087;
        return jM12087;
    }
}
