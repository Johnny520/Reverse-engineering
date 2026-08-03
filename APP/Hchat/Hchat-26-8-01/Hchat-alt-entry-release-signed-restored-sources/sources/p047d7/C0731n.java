package p047d7;

import com.alibaba.fastjson2.JSONB;
import java.io.InputStream;
import p068eh.AbstractC0921a;
import p152k7.AbstractC2331a;

/* JADX INFO: renamed from: d7.n */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0731n extends AbstractC0736s {

    /* JADX INFO: renamed from: m */
    public static final byte[] f2174m = {65, 80, 75, 32, 83, JSONB.Constants.BC_STR_ASCII_FIX_32, 103, 32, 66, 108, 111, 99, 107, 32, 52, 50};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p047d7.AbstractC0736s
    /* JADX INFO: renamed from: S */
    public final int mo1924S(InputStream inputStream) {
        m7715M(24, false);
        byte[] bArr = this.f12076k;
        return inputStream.read(bArr, 0, bArr.length);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        byte[] bArr;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(AbstractC2331a.m5540t(this.f12076k, 0));
        sb2.append(" [");
        byte[] bArr2 = this.f12076k;
        int length = bArr2.length - 8;
        if (length <= 0) {
            bArr = new byte[0];
        } else {
            if (16 <= length) {
                length = 16;
            }
            byte[] bArr3 = new byte[length];
            System.arraycopy(bArr2, 8, bArr3, 0, length);
            bArr = bArr3;
        }
        return AbstractC0921a.m2255r(sb2, new String(bArr), "]");
    }
}
