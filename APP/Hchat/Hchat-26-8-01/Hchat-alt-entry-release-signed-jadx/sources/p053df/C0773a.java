package p053df;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.HashMap;
import okhttp3.HttpUrl;

/* JADX INFO: renamed from: df.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0773a {

    /* JADX INFO: renamed from: a */
    public final long f2325a;

    /* JADX INFO: renamed from: b */
    public final ByteBuffer f2326b;

    /* JADX INFO: renamed from: c */
    public final boolean f2327c;

    /* JADX INFO: renamed from: d */
    public final HashMap f2328d = new HashMap();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0773a(long j3, byte[] bArr, boolean z9) {
        this.f2325a = j3;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        this.f2326b = byteBufferWrap;
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
        this.f2327c = z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final String m1995a(int i9) {
        int i10;
        Integer numValueOf = Integer.valueOf(i9);
        HashMap map = this.f2328d;
        String str = (String) map.get(numValueOf);
        if (str != null) {
            return str;
        }
        int i11 = i9 * 4;
        ByteBuffer byteBuffer = this.f2326b;
        String str2 = "⟨STRING_DECODE_ERROR⟩";
        if (i11 >= byteBuffer.limit() - 3 || (i10 = byteBuffer.getInt(i11)) < 0) {
            return "⟨STRING_DECODE_ERROR⟩";
        }
        long j3 = this.f2325a + ((long) i10);
        if (this.f2327c) {
            byte[] bArrArray = byteBuffer.array();
            int i12 = (int) j3;
            if (i12 < bArrArray.length) {
                int i13 = i12 + ((bArrArray[i12] & 128) == 0 ? 1 : 2);
                int i14 = i13 + 1;
                int i15 = bArrArray[i13];
                if (i15 == 0) {
                    str2 = HttpUrl.FRAGMENT_ENCODE_SET;
                } else {
                    if ((i15 & 128) != 0) {
                        i15 = ((i15 & 127) << 8) | (bArrArray[i14] & 255);
                        i14 = i13 + 2;
                    }
                    str2 = new String(Arrays.copyOfRange(bArrArray, i14, i15 + i14), C0777e.f2337k);
                }
            }
        } else {
            byte[] bArrArray2 = byteBuffer.array();
            int i16 = (int) j3;
            if (i16 + 2 < bArrArray2.length) {
                int length = bArrArray2.length;
                int i17 = i16 + ((bArrArray2[i16 + 1] & 128) != 0 ? 4 : 2);
                int i18 = i17;
                while (true) {
                    int i19 = i18 + 1;
                    if (i19 >= length || (bArrArray2[i18] == 0 && bArrArray2[i19] == 0)) {
                        break;
                    }
                    i18 += 2;
                }
                str2 = new String(Arrays.copyOfRange(bArrArray2, i17, i18), C0777e.f2336j);
            }
        }
        map.put(Integer.valueOf(i9), str2);
        return str2;
    }
}
