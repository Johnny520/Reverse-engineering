package p007;

import com.bumptech.glide.AbstractC3056;
import java.io.EOFException;
import java.util.Iterator;
import java.util.List;
import kotlin.text.Regex;
import okio.ByteString;
import p004.C6092;
import p004.InterfaceC6111;

/* JADX INFO: renamed from: 飘花落叶言世兰子哲苏楪.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6142 extends AbstractC6133 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C6144 f16819;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final byte[] f16820;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C6144 f16821;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final byte[] f16822;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final byte[] f16823;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public long f16824;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C6144 f16825;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final List f16826;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ByteString f16827;

    static {
        Regex regex = C6144.f16859;
        f16819 = AbstractC3056.m6711("multipart/mixed");
        AbstractC3056.m6711("multipart/alternative");
        AbstractC3056.m6711("multipart/digest");
        AbstractC3056.m6711("multipart/parallel");
        f16821 = AbstractC3056.m6711("multipart/form-data");
        f16820 = new byte[]{58, 32};
        f16822 = new byte[]{13, 10};
        f16823 = new byte[]{45, 45};
    }

    public C6142(ByteString byteString, C6144 c6144, List list) {
        byteString.getClass();
        c6144.getClass();
        list.getClass();
        this.f16827 = byteString;
        this.f16826 = list;
        Regex regex = C6144.f16859;
        this.f16825 = AbstractC3056.m6711(c6144 + "; boundary=" + byteString.utf8());
        this.f16824 = -1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final long m11528(InterfaceC6111 interfaceC6111, boolean z) throws EOFException {
        C6092 c6092;
        InterfaceC6111 c60922;
        if (z) {
            c60922 = new C6092();
            c6092 = c60922;
        } else {
            c6092 = 0;
            c60922 = interfaceC6111;
        }
        List list = this.f16826;
        int size = list.size();
        long j = 0;
        int i = 0;
        while (true) {
            ByteString byteString = this.f16827;
            byte[] bArr = f16823;
            byte[] bArr2 = f16822;
            if (i >= size) {
                c60922.getClass();
                c60922.write(bArr);
                c60922.mo11459(byteString);
                c60922.write(bArr);
                c60922.write(bArr2);
                if (!z) {
                    return j;
                }
                c6092.getClass();
                long j2 = j + c6092.f16647;
                c6092.m11475();
                return j2;
            }
            C6145 c6145 = (C6145) list.get(i);
            C6151 c6151 = c6145.f16864;
            AbstractC6133 abstractC6133 = c6145.f16863;
            c60922.getClass();
            c60922.write(bArr);
            c60922.mo11459(byteString);
            c60922.write(bArr2);
            int size2 = c6151.size();
            for (int i2 = 0; i2 < size2; i2++) {
                c60922.mo11463(c6151.m11550(i2)).write(f16820).mo11463(c6151.m11552(i2)).write(bArr2);
            }
            C6144 c6144Mo11153 = abstractC6133.mo11153();
            if (c6144Mo11153 != null) {
                c60922.mo11463("Content-Type: ").mo11463(c6144Mo11153.f16862).write(bArr2);
            }
            long jMo11154 = abstractC6133.mo11154();
            if (jMo11154 == -1 && z) {
                c6092.getClass();
                c6092.m11475();
                return -1L;
            }
            c60922.write(bArr2);
            if (z) {
                j += jMo11154;
            } else {
                abstractC6133.mo11152(c60922);
            }
            c60922.write(bArr2);
            i++;
        }
    }

    @Override // p007.AbstractC6133
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo11152(InterfaceC6111 interfaceC6111) throws EOFException {
        m11528(interfaceC6111, false);
    }

    @Override // p007.AbstractC6133
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final boolean mo11523() {
        List list = this.f16826;
        if (list != null && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((C6145) it.next()).f16863.mo11523()) {
                return true;
            }
        }
        return false;
    }

    @Override // p007.AbstractC6133
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final C6144 mo11153() {
        return this.f16825;
    }

    @Override // p007.AbstractC6133
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final long mo11154() throws EOFException {
        long j = this.f16824;
        if (j != -1) {
            return j;
        }
        long jM11528 = m11528(null, true);
        this.f16824 = jM11528;
        return jM11528;
    }
}
