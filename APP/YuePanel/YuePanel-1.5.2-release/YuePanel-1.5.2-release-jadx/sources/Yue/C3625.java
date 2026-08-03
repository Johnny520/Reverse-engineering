package Yue;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۥ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C3625 {
    /* JADX INFO: renamed from: ۥ */
    public static ByteBuffer m679() {
        return ByteBuffer.allocate(0);
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static int m680(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        if (byteBuffer == null || byteBuffer2 == null) {
            throw new IllegalArgumentException();
        }
        int iRemaining = byteBuffer.remaining();
        int iRemaining2 = byteBuffer2.remaining();
        if (iRemaining <= iRemaining2) {
            byteBuffer2.put(byteBuffer);
            return iRemaining;
        }
        int iMin = Math.min(iRemaining, iRemaining2);
        byteBuffer.limit(iMin);
        byteBuffer2.put(byteBuffer);
        return iMin;
    }
}
