package p054df;

import com.alibaba.fastjson2.JSONB;
import java.io.UTFDataFormatException;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: df.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1958d {
    /* JADX INFO: renamed from: a */
    public static String m7100a(ByteBuffer byteBuffer) throws UTFDataFormatException {
        StringBuilder sb2 = new StringBuilder();
        while (byteBuffer.hasRemaining()) {
            char c10 = (char) (byteBuffer.get() & 255);
            if (c10 == 0) {
                return sb2.toString();
            }
            if (c10 < 128) {
                sb2.append(c10);
            } else if ((c10 & 224) == 192) {
                byte b10 = byteBuffer.get();
                if ((b10 & JSONB.Constants.BC_INT64_SHORT_MIN) != 128) {
                    throw new UTFDataFormatException("bad second byte");
                }
                sb2.append((char) (((c10 & 31) << 6) | (b10 & JSONB.Constants.BC_INT32_BYTE_MAX)));
            } else {
                if ((c10 & 240) != 224) {
                    throw new UTFDataFormatException("bad byte");
                }
                byte b11 = byteBuffer.get();
                byte b12 = byteBuffer.get();
                if ((b11 & JSONB.Constants.BC_INT64_SHORT_MIN) != 128 || (b12 & JSONB.Constants.BC_INT64_SHORT_MIN) != 128) {
                    throw new UTFDataFormatException("bad second or third byte");
                }
                sb2.append((char) (((c10 & 15) << 12) | ((b11 & JSONB.Constants.BC_INT32_BYTE_MAX) << 6) | (b12 & JSONB.Constants.BC_INT32_BYTE_MAX)));
            }
        }
        return sb2.toString();
    }
}
